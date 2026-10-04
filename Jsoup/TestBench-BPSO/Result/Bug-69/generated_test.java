package generated.algorithm;

import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;
import static org.junit.Assert.*;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class BinaryParticleSwarmGeneratedTest {
 @Test(timeout = 20000)
 public void generatedInput000() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.FormElement", "org.jsoup.nodes.FormElement", "formData", new String[]{}, new String[]{}, false, 5, new String[][]{{"org.jsoup.nodes.FormElement", "html", "java.lang.Appendable", "<sample:1>"}});
  assertNotNull(actual);
  assertEquals("java.util.ArrayList", actual.getClass().getName());
  assertEquals("[]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "<{\"a\":1}></{\"a\":1}> {hasParent=false, hasText=false, isBlock=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput001() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.FormElement", "org.jsoup.nodes.FormElement", "outerHtmlHead", new String[]{"java.lang.Appendable", "int", "org.jsoup.nodes.Document$OutputSettings"}, new String[]{"<sample:3>", "-3", "<sample:5>"}, false, 3, new String[][]{{"org.jsoup.nodes.FormElement", "addElement", "org.jsoup.nodes.Element", "<sample:9>"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "<<a><b>t</b></a> #comment=\"a\"></<a><b>t</b></a>> {hasParent=false, hasText=false, isBlock=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput002() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.FormElement", "org.jsoup.nodes.FormElement", "elements", new String[]{}, new String[]{}, false, 3, new String[][]{{"org.jsoup.nodes.FormElement", "submit", ""}}, 1);
  assertNotNull(actual);
  assertEquals("org.jsoup.select.Elements", actual.getClass().getName());
  assertEquals("[]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "<<a><b>t</b></a> #comment=\"a\"></<a><b>t</b></a>> {hasParent=false, hasText=false, isBlock=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput003() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.FormElement", "org.jsoup.nodes.FormElement", "elementSiblingIndex", new String[]{}, new String[]{}, false, 0, null, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput004() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.FormElement", "org.jsoup.nodes.FormElement", "appendTo", new String[]{"org.jsoup.nodes.Element"}, new String[]{"<sample:2>"}, false, 6, new String[][]{}, 3);
  assertNotNull(actual);
  assertEquals("org.jsoup.nodes.FormElement", actual.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput005() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jsoup.nodes.FormElement", "org.jsoup.nodes.FormElement", "selectFirst", new String[]{"java.lang.String"}, new String[]{"[1,2]"}, false, 6, new String[][]{}, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput006() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.FormElement", "org.jsoup.nodes.FormElement", "hasSameValue", new String[]{"java.lang.Object"}, new String[]{"<i:-14>"}, false, 5, new String[][]{}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "<{\"a\":1}></{\"a\":1}> {hasParent=false, hasText=false, isBlock=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput007() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.FormElement", "org.jsoup.nodes.FormElement", "data", new String[]{}, new String[]{}, false, 3, new String[][]{}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("", String.valueOf(actual));
  assertEquals("receiver state after the call", "<<a><b>t</b></a> #comment=\"a\"></<a><b>t</b></a>> {hasParent=false, hasText=false, isBlock=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput008() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.FormElement", "org.jsoup.nodes.FormElement", "siblingElements", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.jsoup.nodes.FormElement", "textNodes", ""}}, 3);
  assertNotNull(actual);
  assertEquals("org.jsoup.select.Elements", actual.getClass().getName());
  assertEquals("[]", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput009() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.FormElement", "org.jsoup.nodes.FormElement", "dataset", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.jsoup.nodes.FormElement", "removeClass", "java.lang.String", "{\"\":1}9"}}, 3);
  assertNotNull(actual);
  assertEquals("org.jsoup.nodes.Attributes$Dataset", actual.getClass().getName());
  assertEquals("{}", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput010() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jsoup.nodes.FormElement", "org.jsoup.nodes.FormElement", "before", new String[]{"org.jsoup.nodes.Node"}, new String[]{"<sample:6>"}, false, 0, new String[][]{{"org.jsoup.nodes.FormElement", "previousElementSibling", ""}}, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput011() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jsoup.nodes.FormElement", "org.jsoup.nodes.FormElement", "before", new String[]{"java.lang.String"}, new String[]{"metho\"d"}, false, 3, new String[][]{{"org.jsoup.nodes.FormElement", "is", "org.jsoup.select.Evaluator", "<sample:3>"}}, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput012() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.FormElement", "org.jsoup.nodes.FormElement", "clearAttributes", new String[]{}, new String[]{}, false, 5, new String[][]{{"org.jsoup.nodes.FormElement", "childNode", "int", "-2147483648"}, {"org.jsoup.nodes.FormElement", "outerHtml", "java.lang.Appendable", "<empty>"}}, 3);
  assertNotNull(actual);
  assertEquals("org.jsoup.nodes.FormElement", actual.getClass().getName());
  assertEquals("<{\"a\":1}></{\"a\":1}> {hasParent=false, hasText=false, isBlock=false}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "<{\"a\":1}></{\"a\":1}> {hasParent=false, hasText=false, isBlock=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput013() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jsoup.nodes.FormElement", "org.jsoup.nodes.FormElement", "getElementsByIndexGreaterThan", new String[]{"int"}, new String[]{"-536870912"}, false, 1, new String[][]{}, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput014() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.FormElement", "org.jsoup.nodes.FormElement", "removeAttr", new String[]{"java.lang.String"}, new String[]{"acti"}, false, 0, null, 1);
  assertNotNull(actual);
  assertEquals("org.jsoup.nodes.FormElement", actual.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput015() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jsoup.nodes.FormElement", "org.jsoup.nodes.FormElement", "getElementsByAttributeValueEnding", new String[]{"java.lang.String", "java.lang.String"}, new String[]{"010{\"a\":1}", "0x123456789"}, false, 0, null, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput016() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jsoup.nodes.FormElement", "org.jsoup.nodes.FormElement", "clone", new String[]{}, new String[]{}, false, 0, null, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput017() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.FormElement", "org.jsoup.nodes.FormElement", "parentNode", new String[]{}, new String[]{}, false, 0, null, 2);
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput018() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.FormElement", "org.jsoup.nodes.FormElement", "outerHtml", new String[]{}, new String[]{}, false, 7, new String[][]{{"org.jsoup.nodes.FormElement", "outerHtmlHead", "java.lang.Appendable,int,org.jsoup.nodes.Document$OutputSettings", "<sample:0>", "-19", "<sample:9>"}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("<x \t y #comment=\"a\"></x \t y>", String.valueOf(actual));
  assertEquals("receiver state after the call", "<x \t y #comment=\"a\"></x \t y> {hasParent=false, hasText=false, isBlock=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput019() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jsoup.nodes.FormElement", "org.jsoup.nodes.FormElement", "indent", new String[]{"java.lang.Appendable", "int", "org.jsoup.nodes.Document$OutputSettings"}, new String[]{"<sample:1>", "-2147483648", "<sample:7>"}, false, 3, new String[][]{}, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput020() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jsoup.nodes.FormElement", "org.jsoup.nodes.FormElement", "tagName", new String[]{}, new String[]{}, false, 0, null, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput021() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jsoup.nodes.FormElement", "org.jsoup.nodes.FormElement", "text", new String[]{}, new String[]{}, false, 1, new String[][]{}, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput022() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jsoup.nodes.FormElement", "org.jsoup.nodes.FormElement", "before", new String[]{"java.lang.String"}, new String[]{"1.12345678"}, false, 0, new String[][]{{"org.jsoup.nodes.FormElement", "selectFirst", "java.lang.String", "1L"}}, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput023() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.FormElement", "org.jsoup.nodes.FormElement", "doSetBaseUri", new String[]{"java.lang.String"}, new String[]{"1.1234i678"}, false, 7, new String[][]{}, 3);
  assertNull(actual);
  assertEquals("receiver state after the call", "<x \t y #comment=\"a\"></x \t y> {hasParent=false, hasText=false, isBlock=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput024() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jsoup.nodes.FormElement", "org.jsoup.nodes.FormElement", "shallowClone", new String[]{}, new String[]{}, false, 4, new String[][]{}, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput025() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.FormElement", "org.jsoup.nodes.FormElement", "elements", new String[]{}, new String[]{}, false, 5, new String[][]{{"org.jsoup.nodes.FormElement", "insertChildren", "int,java.util.Collection", "1048586", "<sample:2>"}}, 1);
  assertNotNull(actual);
  assertEquals("org.jsoup.select.Elements", actual.getClass().getName());
  assertEquals("[]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "<{\"a\":1}></{\"a\":1}> {hasParent=false, hasText=false, isBlock=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput026() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jsoup.nodes.FormElement", "org.jsoup.nodes.FormElement", "data", new String[]{}, new String[]{}, false, 1, new String[][]{}, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput027() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.FormElement", "org.jsoup.nodes.FormElement", "attr", new String[]{"java.lang.String"}, new String[]{"1.12345679901234567TITLE"}, false, 6, new String[][]{}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput028() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.FormElement", "org.jsoup.nodes.FormElement", "prependText", new String[]{"java.lang.String"}, new String[]{"PO"}, false, 7, new String[][]{}, 1);
  assertNotNull(actual);
  assertEquals("org.jsoup.nodes.FormElement", actual.getClass().getName());
  assertEquals("<x \t y #comment=\"a\">\n PO\n</x \t y> {hasParent=false, hasText=true, isBlock=false}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "<x \t y #comment=\"a\">\n PO\n</x \t y> {hasParent=false, hasText=true, isBlock=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput029() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.FormElement", "org.jsoup.nodes.FormElement", "previousSibling", new String[]{}, new String[]{}, false, 5, new String[][]{{"org.jsoup.nodes.FormElement", "getElementsContainingOwnText", "java.lang.String", "2020-02-30T25:61:71 "}}, 2);
  assertNull(actual);
  assertEquals("receiver state after the call", "<{\"a\":1}></{\"a\":1}> {hasParent=false, hasText=false, isBlock=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput030() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jsoup.nodes.FormElement", "org.jsoup.nodes.FormElement", "setBaseUri", new String[]{"java.lang.String"}, new String[]{"+1<1.12345678901234567"}, false, 0, null, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput031() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jsoup.nodes.FormElement", "org.jsoup.nodes.FormElement", "getAllElements", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.jsoup.nodes.FormElement", "firstElementSibling", ""}}, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput032() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.FormElement", "org.jsoup.nodes.FormElement", "ownerDocument", new String[]{}, new String[]{}, false, 0, null, 2);
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput033() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jsoup.nodes.FormElement", "org.jsoup.nodes.FormElement", "filter", new String[]{"org.jsoup.select.NodeFilter"}, new String[]{"<sample:5>"}, false, 6, new String[][]{}, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput034() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.FormElement", "org.jsoup.nodes.FormElement", "classNames", new String[]{}, new String[]{}, false, 0, null, 3);
  assertNotNull(actual);
  assertEquals("java.util.LinkedHashSet", actual.getClass().getName());
  assertEquals("[]", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput035() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jsoup.nodes.FormElement", "org.jsoup.nodes.FormElement", "is", new String[]{"org.jsoup.select.Evaluator"}, new String[]{"<sample:0>"}, false, 0, null, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.ClassCastException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput036() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jsoup.nodes.FormElement", "org.jsoup.nodes.FormElement", "submit", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.jsoup.nodes.FormElement", "traverse", "org.jsoup.select.NodeVisitor", "<sample:10>"}}, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput037() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jsoup.nodes.FormElement", "org.jsoup.nodes.FormElement", "prepend", new String[]{"java.lang.String"}, new String[]{"\u00e9"}, false, 0, null, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput038() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.FormElement", "org.jsoup.nodes.FormElement", "filter", new String[]{"org.jsoup.select.NodeFilter"}, new String[]{"<sample:1>"}, false, 0, null, 1);
  assertNotNull(actual);
  assertEquals("org.jsoup.nodes.FormElement", actual.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput039() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jsoup.nodes.FormElement", "org.jsoup.nodes.FormElement", "before", new String[]{"org.jsoup.nodes.Node"}, new String[]{"<sample:6>"}, false, 5, new String[][]{}, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput040() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jsoup.nodes.FormElement", "org.jsoup.nodes.FormElement", "getElementsByAttributeValueNot", new String[]{"java.lang.String", "java.lang.String"}, new String[]{"/a/02020-02-30T25:61:61", "\ntrue"}, false, 4, new String[][]{{"org.jsoup.nodes.FormElement", "getOutputSettings", ""}}, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput041() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.FormElement", "org.jsoup.nodes.FormElement", "classNames", new String[]{}, new String[]{}, false, 5, new String[][]{{"org.jsoup.nodes.FormElement", "hasText", ""}}, 1);
  assertNotNull(actual);
  assertEquals("java.util.LinkedHashSet", actual.getClass().getName());
  assertEquals("[]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "<{\"a\":1}></{\"a\":1}> {hasParent=false, hasText=false, isBlock=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput042() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.FormElement", "org.jsoup.nodes.FormElement", "getElementsByAttributeValueEnding", new String[]{"java.lang.String", "java.lang.String"}, new String[]{"{`\":1}", "n"}, false, 5, new String[][]{}, 1);
  assertNotNull(actual);
  assertEquals("org.jsoup.select.Elements", actual.getClass().getName());
  assertEquals("[]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "<{\"a\":1}></{\"a\":1}> {hasParent=false, hasText=false, isBlock=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput043() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.FormElement", "org.jsoup.nodes.FormElement", "ensureChildNodes", new String[]{}, new String[]{}, false, 0, null, 1);
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput044() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.FormElement", "org.jsoup.nodes.FormElement", "siblingElements", new String[]{}, new String[]{}, false, 3, new String[][]{{"org.jsoup.nodes.FormElement", "nodelistChanged", ""}}, 2);
  assertNotNull(actual);
  assertEquals("org.jsoup.select.Elements", actual.getClass().getName());
  assertEquals("[]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "<<a><b>t</b></a> #comment=\"a\"></<a><b>t</b></a>> {hasParent=false, hasText=false, isBlock=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput045() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.FormElement", "org.jsoup.nodes.FormElement", "getElementsByAttributeStarting", new String[]{"java.lang.String"}, new String[]{"+1[1,2]"}, false, 5, new String[][]{}, 3);
  assertNotNull(actual);
  assertEquals("org.jsoup.select.Elements", actual.getClass().getName());
  assertEquals("[]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "<{\"a\":1}></{\"a\":1}> {hasParent=false, hasText=false, isBlock=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput046() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.FormElement", "org.jsoup.nodes.FormElement", "elements", new String[]{}, new String[]{}, false, 0, null, 1);
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput047() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.FormElement", "org.jsoup.nodes.FormElement", "root", new String[]{}, new String[]{}, false, 7, new String[][]{{"org.jsoup.nodes.FormElement", "prependText", "java.lang.String", "1.5e30:"}}, 1);
  assertNotNull(actual);
  assertEquals("org.jsoup.nodes.FormElement", actual.getClass().getName());
  assertEquals("<x \t y #comment=\"a\">\n 1.5e30:\n</x \t y> {hasParent=false, hasText=true, isBlock=false}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "<x \t y #comment=\"a\">\n 1.5e30:\n</x \t y> {hasParent=false, hasText=true, isBlock=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput048() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jsoup.nodes.FormElement", "org.jsoup.nodes.FormElement", "getElementsByAttributeValue", new String[]{"java.lang.String", "java.lang.String"}, new String[]{".5", "option"}, false, 0, null, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput049() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jsoup.nodes.FormElement", "org.jsoup.nodes.FormElement", "getElementsByAttributeValue", new String[]{"java.lang.String", "java.lang.String"}, new String[]{"1.1", "-.1"}, false, 0, null, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput050() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.FormElement", "org.jsoup.nodes.FormElement", "getElementsByAttributeValueStarting", new String[]{"java.lang.String", "java.lang.String"}, new String[]{"aaaaaaaaaaaaaaaaaaaaaaaaaaaaaa5.", "+1\t"}, false, 5, new String[][]{{"org.jsoup.nodes.FormElement", "removeChild", "org.jsoup.nodes.Node", "<null>"}}, 3);
  assertNotNull(actual);
  assertEquals("org.jsoup.select.Elements", actual.getClass().getName());
  assertEquals("[]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "<{\"a\":1}></{\"a\":1}> {hasParent=false, hasText=false, isBlock=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput051() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.FormElement", "org.jsoup.nodes.FormElement", "is", new String[]{"org.jsoup.select.Evaluator"}, new String[]{"<sample:8>"}, false, 0, new String[][]{{"org.jsoup.nodes.FormElement", "siblingNodes", ""}, {"org.jsoup.nodes.FormElement", "dataset", ""}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput052() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.FormElement", "org.jsoup.nodes.FormElement", "addClass", new String[]{"java.lang.String"}, new String[]{"214783648"}, false, 5, new String[][]{}, 3);
  assertNotNull(actual);
  assertEquals("org.jsoup.nodes.FormElement", actual.getClass().getName());
  assertEquals("<{\"a\":1} class=\"214783648\"></{\"a\":1}> {hasParent=false, hasText=false, isBlock=false}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "<{\"a\":1} class=\"214783648\"></{\"a\":1}> {hasParent=false, hasText=false, isBlock=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput053() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jsoup.nodes.FormElement", "org.jsoup.nodes.FormElement", "replaceWith", new String[]{"org.jsoup.nodes.Node"}, new String[]{"<sample:5>"}, false, 0, new String[][]{{"org.jsoup.nodes.FormElement", "setParentNode", "org.jsoup.nodes.Node", "<sample:1>"}}, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.UnsupportedOperationException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput054() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.FormElement", "org.jsoup.nodes.FormElement", "getElementsByAttributeValue", new String[]{"java.lang.String", "java.lang.String"}, new String[]{"-d1.5", "ddisbled"}, false, 3, new String[][]{{"org.jsoup.nodes.FormElement", "baseUri", ""}}, 1);
  assertNotNull(actual);
  assertEquals("org.jsoup.select.Elements", actual.getClass().getName());
  assertEquals("[]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "<<a><b>t</b></a> #comment=\"a\"></<a><b>t</b></a>> {hasParent=false, hasText=false, isBlock=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput055() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jsoup.nodes.FormElement", "org.jsoup.nodes.FormElement", "submit", new String[]{}, new String[]{}, false, 6, new String[][]{}, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput056() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.FormElement", "org.jsoup.nodes.FormElement", "className", new String[]{}, new String[]{}, false, 4, new String[][]{{"org.jsoup.nodes.FormElement", "prependChild", "org.jsoup.nodes.Node", "<sample:1>"}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput057() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.FormElement", "org.jsoup.nodes.FormElement", "filter", new String[]{"org.jsoup.select.NodeFilter"}, new String[]{"<sample:6>"}, false, 0, new String[][]{{"org.jsoup.nodes.FormElement", "elementSiblingIndex", ""}}, 2);
  assertNotNull(actual);
  assertEquals("org.jsoup.nodes.FormElement", actual.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput058() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jsoup.nodes.FormElement", "org.jsoup.nodes.FormElement", "formData", new String[]{}, new String[]{}, false, 4, new String[][]{{"org.jsoup.nodes.FormElement", "submit", ""}}, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput059() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.FormElement", "org.jsoup.nodes.FormElement", "getElementsByAttributeValueStarting", new String[]{"java.lang.String", "java.lang.String"}, new String[]{" ", "checkbox"}, false, 7, new String[][]{{"org.jsoup.nodes.FormElement", "getElementsByClass", "java.lang.String", "QOSS"}}, 1);
  assertNotNull(actual);
  assertEquals("org.jsoup.select.Elements", actual.getClass().getName());
  assertEquals("[]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "<x \t y #comment=\"a\"></x \t y> {hasParent=false, hasText=false, isBlock=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput060() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.FormElement", "org.jsoup.nodes.FormElement", "getElementsByIndexLessThan", new String[]{"int"}, new String[]{"1048586"}, false, 7, new String[][]{}, 1);
  assertNotNull(actual);
  assertEquals("org.jsoup.select.Elements", actual.getClass().getName());
  assertEquals("[]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "<x \t y #comment=\"a\"></x \t y> {hasParent=false, hasText=false, isBlock=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput061() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jsoup.nodes.FormElement", "org.jsoup.nodes.FormElement", "getElementsByAttribute", new String[]{"java.lang.String"}, new String[]{"on"}, false, 4, new String[][]{}, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput062() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jsoup.nodes.FormElement", "org.jsoup.nodes.FormElement", "filter", new String[]{"org.jsoup.select.NodeFilter"}, new String[]{"<sample:8>"}, false, 5, new String[][]{}, 1), new String[][]{{"attr", "java.lang.String", "0"}, {"classNames", "java.util.Set", "0"}});
  assertNotNull(actual);
  assertEquals("org.jsoup.nodes.FormElement", actual.getClass().getName());
  assertEquals("<{\"a\":1} class=\"\"></{\"a\":1}> {hasParent=false, hasText=false, isBlock=false}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "<{\"a\":1} class=\"\"></{\"a\":1}> {hasParent=false, hasText=false, isBlock=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput063() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.FormElement", "org.jsoup.nodes.FormElement", "getElementsByIndexGreaterThan", new String[]{"int"}, new String[]{"-2147483648"}, false, 5, new String[][]{{"org.jsoup.nodes.FormElement", "shallowClone", ""}}, 3);
  assertNotNull(actual);
  assertEquals("org.jsoup.select.Elements", actual.getClass().getName());
  assertEquals("[<{\"a\":1}></{\"a\":1}>]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "<{\"a\":1}></{\"a\":1}> {hasParent=false, hasText=false, isBlock=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput064() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jsoup.nodes.FormElement", "org.jsoup.nodes.FormElement", "getElementsByAttributeValueContaining", new String[]{"java.lang.String", "java.lang.String"}, new String[]{"a", "0x12345689"}, false, 5, new String[][]{{"org.jsoup.nodes.FormElement", "hasParent", ""}}, 2), new String[][]{{"html", "", "2"}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("", String.valueOf(actual));
  assertEquals("receiver state after the call", "<{\"a\":1}></{\"a\":1}> {hasParent=false, hasText=false, isBlock=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput065() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jsoup.nodes.FormElement", "org.jsoup.nodes.FormElement", "firstElementSibling", new String[]{}, new String[]{}, false, 1, new String[][]{{"org.jsoup.nodes.FormElement", "submit", ""}}, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput066() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jsoup.nodes.FormElement", "org.jsoup.nodes.FormElement", "getElementsByAttribute", new String[]{"java.lang.String"}, new String[]{""}, false, 0, new String[][]{{"org.jsoup.nodes.FormElement", "getElementsByAttributeStarting", "java.lang.String", "1E-5"}}, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput067() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jsoup.nodes.FormElement", "org.jsoup.nodes.FormElement", "getElementsByAttributeValue", new String[]{"java.lang.String", "java.lang.String"}, new String[]{"1.12345678123456789012345678901234567890", "1e10"}, false, 0, new String[][]{{"org.jsoup.nodes.FormElement", "clone", ""}}, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput068() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jsoup.nodes.FormElement", "org.jsoup.nodes.FormElement", "getElementsByAttributeStarting", new String[]{"java.lang.String"}, new String[]{"1e10a b"}, false, 6, new String[][]{}, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput069() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.FormElement", "org.jsoup.nodes.FormElement", "childNodeSize", new String[]{}, new String[]{}, false, 3, new String[][]{{"org.jsoup.nodes.FormElement", "childNodeSize", ""}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "<<a><b>t</b></a> #comment=\"a\"></<a><b>t</b></a>> {hasParent=false, hasText=false, isBlock=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput070() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jsoup.nodes.FormElement", "org.jsoup.nodes.FormElement", "nodeName", new String[]{}, new String[]{}, false, 1, new String[][]{{"org.jsoup.nodes.FormElement", "siblingNodes", ""}}, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput071() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jsoup.nodes.FormElement", "org.jsoup.nodes.FormElement", "child", new String[]{"int"}, new String[]{"1073741825"}, false, 4, new String[][]{{"org.jsoup.nodes.FormElement", "id", ""}}, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput072() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.FormElement", "org.jsoup.nodes.FormElement", "attr", new String[]{"java.lang.String", "boolean"}, new String[]{"/a/b1E-5", "false"}, false, 5, new String[][]{}, 1);
  assertNotNull(actual);
  assertEquals("org.jsoup.nodes.FormElement", actual.getClass().getName());
  assertEquals("<{\"a\":1}></{\"a\":1}> {hasParent=false, hasText=false, isBlock=false}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "<{\"a\":1}></{\"a\":1}> {hasParent=false, hasText=false, isBlock=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput073() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jsoup.nodes.FormElement", "org.jsoup.nodes.FormElement", "is", new String[]{"java.lang.String"}, new String[]{"1/1234567"}, false, 1, new String[][]{{"org.jsoup.nodes.FormElement", "outerHtmlTail", "java.lang.Appendable,int,org.jsoup.nodes.Document$OutputSettings", "<null>", "2147483647", "<sample:0>"}}, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("org.jsoup.select.Selector$SelectorParseException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput074() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jsoup.nodes.FormElement", "org.jsoup.nodes.FormElement", "getElementsByAttributeValueContaining", new String[]{"java.lang.String", "java.lang.String"}, new String[]{"n", ""}, false, 4, new String[][]{}, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput075() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.FormElement", "org.jsoup.nodes.FormElement", "reparentChild", new String[]{"org.jsoup.nodes.Node"}, new String[]{"<sample:4>"}, false, 0, null, 1);
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput076() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.FormElement", "org.jsoup.nodes.FormElement", "toString", new String[]{}, new String[]{}, false, 7, new String[][]{{"org.jsoup.nodes.FormElement", "hasParent", ""}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("<x \t y #comment=\"a\"></x \t y>", String.valueOf(actual));
  assertEquals("receiver state after the call", "<x \t y #comment=\"a\"></x \t y> {hasParent=false, hasText=false, isBlock=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput077() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jsoup.nodes.FormElement", "org.jsoup.nodes.FormElement", "getElementsContainingText", new String[]{"java.lang.String"}, new String[]{"lull"}, false, 0, new String[][]{{"org.jsoup.nodes.FormElement", "getElementsContainingText", "java.lang.String", "http://example.cma?b=c"}}, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput078() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jsoup.nodes.FormElement", "org.jsoup.nodes.FormElement", "outerHtml", new String[]{"java.lang.Appendable"}, new String[]{"<sample:2>"}, false, 0, new String[][]{{"org.jsoup.nodes.FormElement", "equals", "java.lang.Object", "<null>"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput079() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.FormElement", "org.jsoup.nodes.FormElement", "className", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.jsoup.nodes.FormElement", "doSetBaseUri", "java.lang.String", "o "}, {"org.jsoup.nodes.FormElement", "childNodesAsArray", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput080() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jsoup.nodes.FormElement", "org.jsoup.nodes.FormElement", "ownText", new String[]{}, new String[]{}, false); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput081() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jsoup.nodes.FormElement", "org.jsoup.nodes.FormElement", "getElementsByClass", new String[]{"java.lang.String"}, new String[]{"option[selected]1.25"}, false, 0, new String[][]{{"org.jsoup.nodes.FormElement", "prependText", "java.lang.String", "1.5f"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput082() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jsoup.nodes.FormElement", "org.jsoup.nodes.FormElement", "getElementsByAttributeValueStarting", new String[]{"java.lang.String", "java.lang.String"}, new String[]{"112:0:45", "cheOcked"}, false, 4, new String[][]{}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput083() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jsoup.nodes.FormElement", "org.jsoup.nodes.FormElement", "getElementsByIndexGreaterThan", new String[]{"int"}, new String[]{"-1073741857"}, false, 6, new String[][]{{"org.jsoup.nodes.FormElement", "dataset", ""}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput084() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jsoup.nodes.FormElement", "org.jsoup.nodes.FormElement", "getElementsByAttributeValueContaining", new String[]{"java.lang.String", "java.lang.String"}, new String[]{"chdckbox", "6x1F"}, false, 0, new String[][]{{"org.jsoup.nodes.FormElement", "cssSelector", ""}, {"org.jsoup.nodes.FormElement", "doSetBaseUri", "java.lang.String", "OST"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput085() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.FormElement", "org.jsoup.nodes.FormElement", "toggleClass", new String[]{"java.lang.String"}, new String[]{"-5"}, false);
  assertNotNull(actual);
  assertEquals("org.jsoup.nodes.FormElement", actual.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput086() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.FormElement", "org.jsoup.nodes.FormElement", "previousSibling", new String[]{}, new String[]{}, false);
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput087() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.FormElement", "org.jsoup.nodes.FormElement", "setParentNode", new String[]{"org.jsoup.nodes.Node"}, new String[]{"<sample:2>"}, false);
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput088() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.FormElement", "org.jsoup.nodes.FormElement", "is", new String[]{"org.jsoup.select.Evaluator"}, new String[]{"<sample:2>"}, false);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput089() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.FormElement", "org.jsoup.nodes.FormElement", "getElementsByIndexEquals", new String[]{"int"}, new String[]{"2147483647"}, false, 3, new String[][]{{"org.jsoup.nodes.FormElement", "firstElementSibling", ""}, {"org.jsoup.nodes.FormElement", "indent", "java.lang.Appendable,int,org.jsoup.nodes.Document$OutputSettings", "<sample:0>", "2", "<sample:8>"}});
  assertNotNull(actual);
  assertEquals("org.jsoup.select.Elements", actual.getClass().getName());
  assertEquals("[]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "<<a><b>t</b></a> #comment=\"a\"></<a><b>t</b></a>> {hasParent=false, hasText=false, isBlock=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput090() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jsoup.nodes.FormElement", "org.jsoup.nodes.FormElement", "toString", new String[]{}, new String[]{}, false); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput091() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jsoup.nodes.FormElement", "org.jsoup.nodes.FormElement", "after", new String[]{"java.lang.String"}, new String[]{"tsue"}, false, 3, new String[][]{}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput092() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.FormElement", "org.jsoup.nodes.FormElement", "hasSameValue", new String[]{"java.lang.Object"}, new String[]{"<s:dey>"}, false, 7, new String[][]{});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "<x \t y #comment=\"a\"></x \t y> {hasParent=false, hasText=false, isBlock=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput093() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jsoup.nodes.FormElement", "org.jsoup.nodes.FormElement", "appendChild", new String[]{"org.jsoup.nodes.Node"}, new String[]{"<null>"}, false, 0, new String[][]{{"org.jsoup.nodes.FormElement", "remove", ""}, {"org.jsoup.nodes.FormElement", "tag", ""}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput094() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.FormElement", "org.jsoup.nodes.FormElement", "classNames", new String[]{"java.util.Set"}, new String[]{"<sample:3>"}, false, 3, new String[][]{});
  assertNotNull(actual);
  assertEquals("org.jsoup.nodes.FormElement", actual.getClass().getName());
  assertEquals("<<a><b>t</b></a> #comment=\"a\" class=\"sample\"></<a><b>t</b></a>> {hasParent=false, hasText=false, isBlock=false}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "<<a><b>t</b></a> #comment=\"a\" class=\"sample\"></<a><b>t</b></a>> {hasParent=false, hasText=false, isBlock=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput095() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jsoup.nodes.FormElement", "org.jsoup.nodes.FormElement", "formData", new String[]{}, new String[]{}, false, 6, new String[][]{}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput096() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jsoup.nodes.FormElement", "org.jsoup.nodes.FormElement", "select", new String[]{"java.lang.String"}, new String[]{"2020-02-30T25\r:61:61"}, false, 6, new String[][]{{"org.jsoup.nodes.FormElement", "lastElementSibling", ""}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("org.jsoup.select.Selector$SelectorParseException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput097() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.FormElement", "org.jsoup.nodes.FormElement", "ensureChildNodes", new String[]{}, new String[]{}, false, 3, new String[][]{});
  assertNotNull(actual);
  assertEquals("org.jsoup.nodes.Element$NodeList", actual.getClass().getName());
  assertEquals("[]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "<<a><b>t</b></a> #comment=\"a\"></<a><b>t</b></a>> {hasParent=false, hasText=false, isBlock=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput098() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.FormElement", "org.jsoup.nodes.FormElement", "previousSibling", new String[]{}, new String[]{}, false, 5, new String[][]{{"org.jsoup.nodes.FormElement", "getElementsByIndexEquals", "int", "0"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "<{\"a\":1}></{\"a\":1}> {hasParent=false, hasText=false, isBlock=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput099() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jsoup.nodes.FormElement", "org.jsoup.nodes.FormElement", "submit", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.jsoup.nodes.FormElement", "getOutputSettings", ""}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput100() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.FormElement", "org.jsoup.nodes.FormElement", "className", new String[]{}, new String[]{}, false, 3, new String[][]{{"org.jsoup.nodes.FormElement", "indent", "java.lang.Appendable,int,org.jsoup.nodes.Document$OutputSettings", "<sample:3>", "-2147483647", "<sample:9>"}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("", String.valueOf(actual));
  assertEquals("receiver state after the call", "<<a><b>t</b></a> #comment=\"a\"></<a><b>t</b></a>> {hasParent=false, hasText=false, isBlock=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput101() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.FormElement", "org.jsoup.nodes.FormElement", "preserveWhitespace", new String[]{"org.jsoup.nodes.Node"}, new String[]{"<sample:7>"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput102() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jsoup.nodes.FormElement", "org.jsoup.nodes.FormElement", "getElementById", new String[]{"java.lang.String"}, new String[]{""}, false, 7, new String[][]{}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput103() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.FormElement", "org.jsoup.nodes.FormElement", "attr", new String[]{"java.lang.String", "boolean"}, new String[]{"http://example.com/a@b=c", "true"}, false, 0, new String[][]{{"org.jsoup.nodes.FormElement", "setSiblingIndex", "int", "-1"}});
  assertNotNull(actual);
  assertEquals("org.jsoup.nodes.FormElement", actual.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput104() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.FormElement", "org.jsoup.nodes.FormElement", "dataset", new String[]{}, new String[]{}, false);
  assertNotNull(actual);
  assertEquals("org.jsoup.nodes.Attributes$Dataset", actual.getClass().getName());
  assertEquals("{}", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput105() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.FormElement", "org.jsoup.nodes.FormElement", "nextElementSibling", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.jsoup.nodes.FormElement", "val", "java.lang.String", "radio"}});
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput106() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jsoup.nodes.FormElement", "org.jsoup.nodes.FormElement", "siblingElements", new String[]{}, new String[]{}, false, 4, new String[][]{{"org.jsoup.nodes.FormElement", "remove", ""}}), new String[][]{{"after", "java.lang.String", "0"}});
  assertNotNull(actual);
  assertEquals("org.jsoup.select.Elements", actual.getClass().getName());
  assertEquals("[]", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput107() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.FormElement", "org.jsoup.nodes.FormElement", "reparentChild", new String[]{"org.jsoup.nodes.Node"}, new String[]{"<sample:6>"}, false, 6, new String[][]{{"org.jsoup.nodes.FormElement", "after", "java.lang.String", "http://example.com/a?b=c"}});
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput108() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.FormElement", "org.jsoup.nodes.FormElement", "removeAttr", new String[]{"java.lang.String"}, new String[]{"method"}, false);
  assertNotNull(actual);
  assertEquals("org.jsoup.nodes.FormElement", actual.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput109() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jsoup.nodes.FormElement", "org.jsoup.nodes.FormElement", "getElementsByAttributeValueNot", new String[]{"java.lang.String", "java.lang.String"}, new String[]{"1/12335678901234567", "[1,2]"}, false, 6, new String[][]{}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput110() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jsoup.nodes.FormElement", "org.jsoup.nodes.FormElement", "removeChild", new String[]{"org.jsoup.nodes.Node"}, new String[]{"<sample:2>"}, false, 6, new String[][]{{"org.jsoup.nodes.FormElement", "is", "java.lang.String", ""}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput111() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.FormElement", "org.jsoup.nodes.FormElement", "ownerDocument", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.jsoup.nodes.FormElement", "before", "org.jsoup.nodes.Node", "<sample:4>"}});
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput112() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.FormElement", "org.jsoup.nodes.FormElement", "is", new String[]{"org.jsoup.select.Evaluator"}, new String[]{"<sample:4>"}, false);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput113() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jsoup.nodes.FormElement", "org.jsoup.nodes.FormElement", "child", new String[]{"int"}, new String[]{"2147483647"}, false, 0, new String[][]{{"org.jsoup.nodes.FormElement", "hasClass", "java.lang.String", "123456789012345678901234567890"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput114() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jsoup.nodes.FormElement", "org.jsoup.nodes.FormElement", "getElementsMatchingText", new String[]{"java.lang.String"}, new String[]{"1.251.1234567890123567"}, false, 6, new String[][]{{"org.jsoup.nodes.FormElement", "addChildren", "org.jsoup.nodes.Node[]", "<sample:1>"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput115() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.FormElement", "org.jsoup.nodes.FormElement", "html", new String[]{}, new String[]{}, false, 5, new String[][]{{"org.jsoup.nodes.FormElement", "dataNodes", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("", String.valueOf(actual));
  assertEquals("receiver state after the call", "<{\"a\":1}></{\"a\":1}> {hasParent=false, hasText=false, isBlock=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput116() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jsoup.nodes.FormElement", "org.jsoup.nodes.FormElement", "selectFirst", new String[]{"java.lang.String"}, new String[]{"TIS"}, false); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput117() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jsoup.nodes.FormElement", "org.jsoup.nodes.FormElement", "getElementsContainingText", new String[]{"java.lang.String"}, new String[]{"_.12345678"}, false, 0, new String[][]{{"org.jsoup.nodes.FormElement", "siblingIndex", ""}, {"org.jsoup.nodes.FormElement", "getOutputSettings", ""}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput118() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jsoup.nodes.FormElement", "org.jsoup.nodes.FormElement", "isBlock", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.jsoup.nodes.FormElement", "getElementsByTag", "java.lang.String", "checkbox"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput119() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.FormElement", "org.jsoup.nodes.FormElement", "is", new String[]{"org.jsoup.select.Evaluator"}, new String[]{"<sample:3>"}, false, 5, new String[][]{{"org.jsoup.nodes.FormElement", "isBlock", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "<{\"a\":1}></{\"a\":1}> {hasParent=false, hasText=false, isBlock=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput120() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.FormElement", "org.jsoup.nodes.FormElement", "equals", new String[]{"java.lang.Object"}, new String[]{"<b:false>"}, false);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput121() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.FormElement", "org.jsoup.nodes.FormElement", "getElementsByIndexLessThan", new String[]{"int"}, new String[]{"1"}, false, 7, new String[][]{});
  assertNotNull(actual);
  assertEquals("org.jsoup.select.Elements", actual.getClass().getName());
  assertEquals("[]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "<x \t y #comment=\"a\"></x \t y> {hasParent=false, hasText=false, isBlock=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput122() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.FormElement", "org.jsoup.nodes.FormElement", "ensureChildNodes", new String[]{}, new String[]{}, false);
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput123() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jsoup.nodes.FormElement", "org.jsoup.nodes.FormElement", "prependChild", new String[]{"org.jsoup.nodes.Node"}, new String[]{"<sample:5>"}, false, 6, new String[][]{}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput124() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jsoup.nodes.FormElement", "org.jsoup.nodes.FormElement", "getElementsMatchingText", new String[]{"java.util.regex.Pattern"}, new String[]{"<sample:2>"}, false); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput125() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jsoup.nodes.FormElement", "org.jsoup.nodes.FormElement", "getElementsContainingOwnText", new String[]{"java.lang.String"}, new String[]{"ii"}, false, 0, new String[][]{{"org.jsoup.nodes.FormElement", "html", "java.lang.Appendable", "<sample:1>"}, {"org.jsoup.nodes.FormElement", "getElementsByClass", "java.lang.String", "http://example.com/a?b=c"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput126() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jsoup.nodes.FormElement", "org.jsoup.nodes.FormElement", "hasText", new String[]{}, new String[]{}, false); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput127() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jsoup.nodes.FormElement", "org.jsoup.nodes.FormElement", "appendText", new String[]{"java.lang.String"}, new String[]{"//b"}, false, 2, new String[][]{}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput128() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.FormElement", "org.jsoup.nodes.FormElement", "parentNode", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.jsoup.nodes.FormElement", "getElementsMatchingText", "java.lang.String", "TITLE"}});
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput129() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jsoup.nodes.FormElement", "org.jsoup.nodes.FormElement", "getElementsByAttributeValue", new String[]{"java.lang.String", "java.lang.String"}, new String[]{"1.25\n", ",\u00e8"}, false); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput130() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jsoup.nodes.FormElement", "org.jsoup.nodes.FormElement", "childNodesCopy", new String[]{}, new String[]{}, false); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput131() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.FormElement", "org.jsoup.nodes.FormElement", "childNodeSize", new String[]{}, new String[]{}, false, 5, new String[][]{{"org.jsoup.nodes.FormElement", "prependChild", "org.jsoup.nodes.Node", "<sample:2>"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("1", String.valueOf(actual));
  assertEquals("receiver state after the call", "<{\"a\":1}>\n <#root></#root>\n</{\"a\":1}> {hasParent=false, hasText=false, isBlock=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput132() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jsoup.nodes.FormElement", "org.jsoup.nodes.FormElement", "text", new String[]{"java.lang.String"}, new String[]{"--1"}, false); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput133() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.FormElement", "org.jsoup.nodes.FormElement", "parents", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.jsoup.nodes.FormElement", "doSetBaseUri", "java.lang.String", "1.5f"}});
  assertNotNull(actual);
  assertEquals("org.jsoup.select.Elements", actual.getClass().getName());
  assertEquals("[]", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput134() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jsoup.nodes.FormElement", "org.jsoup.nodes.FormElement", "ensureChildNodes", new String[]{}, new String[]{}, false, 3, new String[][]{{"org.jsoup.nodes.FormElement", "getElementsByIndexLessThan", "int", "1048586"}}), new String[][]{{"containsAll", "java.util.Collection", "5"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "<<a><b>t</b></a> #comment=\"a\"></<a><b>t</b></a>> {hasParent=false, hasText=false, isBlock=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput135() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jsoup.nodes.FormElement", "org.jsoup.nodes.FormElement", "getElementsByTag", new String[]{"java.lang.String"}, new String[]{"I"}, false, 6, new String[][]{}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput136() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jsoup.nodes.FormElement", "org.jsoup.nodes.FormElement", "tagName", new String[]{}, new String[]{}, false, 4, new String[][]{}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput137() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jsoup.nodes.FormElement", "org.jsoup.nodes.FormElement", "indent", new String[]{"java.lang.Appendable", "int", "org.jsoup.nodes.Document$OutputSettings"}, new String[]{"<sample:3>", "-2147483648", "<sample:5>"}, false); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput138() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.FormElement", "org.jsoup.nodes.FormElement", "getElementsByTag", new String[]{"java.lang.String"}, new String[]{"0x11F"}, false, 7, new String[][]{{"org.jsoup.nodes.FormElement", "attr", "java.lang.String,boolean", ".51.5f", "true"}});
  assertNotNull(actual);
  assertEquals("org.jsoup.select.Elements", actual.getClass().getName());
  assertEquals("[]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "<x \t y #comment=\"a\" .51.5f></x \t y> {hasParent=false, hasText=false, isBlock=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput139() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.FormElement", "org.jsoup.nodes.FormElement", "root", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.jsoup.nodes.FormElement", "attr", "java.lang.String,boolean", ".0.5", "false"}});
  assertNotNull(actual);
  assertEquals("org.jsoup.nodes.FormElement", actual.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput140() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jsoup.nodes.FormElement", "org.jsoup.nodes.FormElement", "appendChild", new String[]{"org.jsoup.nodes.Node"}, new String[]{"<sample:3>"}, false, 0, new String[][]{{"org.jsoup.nodes.FormElement", "getElementsByIndexEquals", "int", "-1048597"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput141() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jsoup.nodes.FormElement", "org.jsoup.nodes.FormElement", "children", new String[]{}, new String[]{}, false, 4, new String[][]{}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput142() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jsoup.nodes.FormElement", "org.jsoup.nodes.FormElement", "childNodes", new String[]{}, new String[]{}, false, 1, new String[][]{}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput143() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jsoup.nodes.FormElement", "org.jsoup.nodes.FormElement", "getElementsByAttributeValueEnding", new String[]{"java.lang.String", "java.lang.String"}, new String[]{"", "0x1F"}, false); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput144() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.FormElement", "org.jsoup.nodes.FormElement", "previousElementSibling", new String[]{}, new String[]{}, false, 5, new String[][]{});
  assertNull(actual);
  assertEquals("receiver state after the call", "<{\"a\":1}></{\"a\":1}> {hasParent=false, hasText=false, isBlock=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput145() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.FormElement", "org.jsoup.nodes.FormElement", "getElementsByIndexGreaterThan", new String[]{"int"}, new String[]{"2147483647"}, false, 5, new String[][]{});
  assertNotNull(actual);
  assertEquals("org.jsoup.select.Elements", actual.getClass().getName());
  assertEquals("[]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "<{\"a\":1}></{\"a\":1}> {hasParent=false, hasText=false, isBlock=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput146() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jsoup.nodes.FormElement", "org.jsoup.nodes.FormElement", "replaceWith", new String[]{"org.jsoup.nodes.Node"}, new String[]{"<sample:7>"}, false, 7, new String[][]{{"org.jsoup.nodes.FormElement", "before", "java.lang.String", "uype"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput147() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jsoup.nodes.FormElement", "org.jsoup.nodes.FormElement", "firstElementSibling", new String[]{}, new String[]{}, false, 5, new String[][]{{"org.jsoup.nodes.FormElement", "submit", ""}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput148() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.FormElement", "org.jsoup.nodes.FormElement", "siblingIndex", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.jsoup.nodes.FormElement", "prependElement", "java.lang.String", "1.12345678901234567"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput149() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jsoup.nodes.FormElement", "org.jsoup.nodes.FormElement", "addChildren", new String[]{"int", "org.jsoup.nodes.Node[]"}, new String[]{"-1", "<sample:0>"}, false); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput150() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jsoup.nodes.FormElement", "org.jsoup.nodes.FormElement", "select", new String[]{"java.lang.String"}, new String[]{"methpe"}, false); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput151() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.FormElement", "org.jsoup.nodes.FormElement", "html", new String[]{"java.lang.String"}, new String[]{"<a>b</a>2147483648"}, false, 3, new String[][]{});
  assertNotNull(actual);
  assertEquals("org.jsoup.nodes.FormElement", actual.getClass().getName());
  assertEquals("<<a><b>t</b></a> #comment=\"a\">\n <a>b</a>2147483648\n</<a><b>t</b></a>> {hasParent=false, hasText=true, isBlock=false}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "<<a><b>t</b></a> #comment=\"a\">\n <a>b</a>2147483648\n</<a><b>t</b></a>> {hasParent=false, hasText=true, isBlock=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput152() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.FormElement", "org.jsoup.nodes.FormElement", "attr", new String[]{"java.lang.String", "java.lang.String"}, new String[]{"b", "0x12345789"}, false);
  assertNotNull(actual);
  assertEquals("org.jsoup.nodes.FormElement", actual.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput153() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.FormElement", "org.jsoup.nodes.FormElement", "addChildren", new String[]{"org.jsoup.nodes.Node[]"}, new String[]{"<sample:2>"}, false, 7, new String[][]{});
  assertNull(actual);
  assertEquals("receiver state after the call", "<x \t y #comment=\"a\"><!DOCTYPE a PUBLIC \"0\" \"sample\">\n <!--a-->a\n</x \t y> {hasParent=false, hasText=true, isBlock=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput154() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jsoup.nodes.FormElement", "org.jsoup.nodes.FormElement", "replaceChild", new String[]{"org.jsoup.nodes.Node", "org.jsoup.nodes.Node"}, new String[]{"<null>", "<sample:0>"}, false, 2, new String[][]{}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput155() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.FormElement", "org.jsoup.nodes.FormElement", "html", new String[]{"java.lang.Appendable"}, new String[]{"<sample:3>"}, false, 5, new String[][]{{"org.jsoup.nodes.FormElement", "nextSibling", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.StringBuilder", actual.getClass().getName());
  assertEquals("", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "<{\"a\":1}></{\"a\":1}> {hasParent=false, hasText=false, isBlock=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput156() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jsoup.nodes.FormElement", "org.jsoup.nodes.FormElement", "setBaseUri", new String[]{"java.lang.String"}, new String[]{"1e1Stype"}, false); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput157() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.FormElement", "org.jsoup.nodes.FormElement", "childNodes", new String[]{}, new String[]{}, false, 3, new String[][]{});
  assertNotNull(actual);
  assertEquals("java.util.Collections$UnmodifiableRandomAccessList", actual.getClass().getName());
  assertEquals("[]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "<<a><b>t</b></a> #comment=\"a\"></<a><b>t</b></a>> {hasParent=false, hasText=false, isBlock=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput158() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jsoup.nodes.FormElement", "org.jsoup.nodes.FormElement", "childNode", new String[]{"int"}, new String[]{"-262143"}, false); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput159() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jsoup.nodes.FormElement", "org.jsoup.nodes.FormElement", "getElementsByIndexEquals", new String[]{"int"}, new String[]{"-14"}, false); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput160() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.FormElement", "org.jsoup.nodes.FormElement", "nextSibling", new String[]{}, new String[]{}, false, 2, new String[][]{{"org.jsoup.nodes.FormElement", "html", ""}});
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput161() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jsoup.nodes.FormElement", "org.jsoup.nodes.FormElement", "cssSelector", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.jsoup.nodes.FormElement", "outerHtml", "java.lang.Appendable", "<null>"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput162() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jsoup.nodes.FormElement", "org.jsoup.nodes.FormElement", "replaceChild", new String[]{"org.jsoup.nodes.Node", "org.jsoup.nodes.Node"}, new String[]{"<sample:2>", "<sample:7>"}, false, 5, new String[][]{}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput163() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.FormElement", "org.jsoup.nodes.FormElement", "classNames", new String[]{"java.util.Set"}, new String[]{"<sample:0>"}, false, 0, new String[][]{{"org.jsoup.nodes.FormElement", "lastElementSibling", ""}, {"org.jsoup.nodes.FormElement", "setBaseUri", "java.lang.String", "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaa"}});
  assertNotNull(actual);
  assertEquals("org.jsoup.nodes.FormElement", actual.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput164() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.FormElement", "org.jsoup.nodes.FormElement", "appendText", new String[]{"java.lang.String"}, new String[]{"0b/b"}, false, 7, new String[][]{});
  assertNotNull(actual);
  assertEquals("org.jsoup.nodes.FormElement", actual.getClass().getName());
  assertEquals("<x \t y #comment=\"a\">\n 0b/b\n</x \t y> {hasParent=false, hasText=true, isBlock=false}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "<x \t y #comment=\"a\">\n 0b/b\n</x \t y> {hasParent=false, hasText=true, isBlock=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput165() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.FormElement", "org.jsoup.nodes.FormElement", "cssSelector", new String[]{}, new String[]{}, false, 3, new String[][]{{"org.jsoup.nodes.FormElement", "parent", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("<a><b>t</b></a>", String.valueOf(actual));
  assertEquals("receiver state after the call", "<<a><b>t</b></a> #comment=\"a\"></<a><b>t</b></a>> {hasParent=false, hasText=false, isBlock=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput166() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jsoup.nodes.FormElement", "org.jsoup.nodes.FormElement", "filter", new String[]{"org.jsoup.select.NodeFilter"}, new String[]{"<sample:5>"}, false, 7, new String[][]{{"org.jsoup.nodes.FormElement", "append", "java.lang.String", "-f1.5"}}), new String[][]{{"childNodes", "", "7"}});
  assertNotNull(actual);
  assertEquals("java.util.Collections$UnmodifiableRandomAccessList", actual.getClass().getName());
  assertEquals("[\n-f1.5]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "<x \t y #comment=\"a\">\n -f1.5\n</x \t y> {hasParent=false, hasText=true, isBlock=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput167() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jsoup.nodes.FormElement", "org.jsoup.nodes.FormElement", "remove", new String[]{}, new String[]{}, false, 2, new String[][]{}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput168() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jsoup.nodes.FormElement", "org.jsoup.nodes.FormElement", "is", new String[]{"java.lang.String"}, new String[]{"tzpe"}, false, 6, new String[][]{}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput169() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jsoup.nodes.FormElement", "org.jsoup.nodes.FormElement", "getElementsByAttributeStarting", new String[]{"java.lang.String"}, new String[]{"2020-00-01"}, false); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput170() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jsoup.nodes.FormElement", "org.jsoup.nodes.FormElement", "is", new String[]{"java.lang.String"}, new String[]{"oa/b"}, false, 0, new String[][]{{"org.jsoup.nodes.FormElement", "outerHtmlTail", "java.lang.Appendable,int,org.jsoup.nodes.Document$OutputSettings", "<sample:3>", "1048558", "<sample:1>"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("org.jsoup.select.Selector$SelectorParseException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput171() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.FormElement", "org.jsoup.nodes.FormElement", "siblingNodes", new String[]{}, new String[]{}, false, 1, new String[][]{{"org.jsoup.nodes.FormElement", "unwrap", ""}, {"org.jsoup.nodes.FormElement", "filter", "org.jsoup.select.NodeFilter", "<sample:4>"}});
  assertNotNull(actual);
  assertEquals("java.util.Collections$EmptyList", actual.getClass().getName());
  assertEquals("[]", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput172() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jsoup.nodes.FormElement", "org.jsoup.nodes.FormElement", "ensureChildNodes", new String[]{}, new String[]{}, false, 3, new String[][]{}), new String[][]{{"isEmpty", "", "5"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
  assertEquals("receiver state after the call", "<<a><b>t</b></a> #comment=\"a\"></<a><b>t</b></a>> {hasParent=false, hasText=false, isBlock=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput173() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jsoup.nodes.FormElement", "org.jsoup.nodes.FormElement", "getElementsByIndexEquals", new String[]{"int"}, new String[]{"2147483647"}, false, 0, new String[][]{{"org.jsoup.nodes.FormElement", "setParentNode", "org.jsoup.nodes.Node", "<sample:3>"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.ClassCastException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput174() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jsoup.nodes.FormElement", "org.jsoup.nodes.FormElement", "classNames", new String[]{}, new String[]{}, false, 5, new String[][]{{"org.jsoup.nodes.FormElement", "getElementById", "java.lang.String", "http:/example.com/a?b<c"}}), new String[][]{{"clone", "", "5"}});
  assertNotNull(actual);
  assertEquals("java.util.LinkedHashSet", actual.getClass().getName());
  assertEquals("[]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "<{\"a\":1}></{\"a\":1}> {hasParent=false, hasText=false, isBlock=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput175() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jsoup.nodes.FormElement", "org.jsoup.nodes.FormElement", "doClone", new String[]{"org.jsoup.nodes.Node"}, new String[]{"<sample:5>"}, false, 1, new String[][]{{"org.jsoup.nodes.FormElement", "doSetBaseUri", "java.lang.String", ""}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput176() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jsoup.nodes.FormElement", "org.jsoup.nodes.FormElement", "selectFirst", new String[]{"java.lang.String"}, new String[]{"\t"}, false, 0, new String[][]{{"org.jsoup.nodes.FormElement", "children", ""}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("org.jsoup.select.Selector$SelectorParseException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput177() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.FormElement", "org.jsoup.nodes.FormElement", "hasAttr", new String[]{"java.lang.String"}, new String[]{"option[selec\ned]"}, false, 0, new String[][]{{"org.jsoup.nodes.FormElement", "hasParent", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput178() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.FormElement", "org.jsoup.nodes.FormElement", "outerHtmlHead", new String[]{"java.lang.Appendable", "int", "org.jsoup.nodes.Document$OutputSettings"}, new String[]{"<sample:0>", "1048586", "<sample:0>"}, false, 5, new String[][]{});
  assertNull(actual);
  assertEquals("receiver state after the call", "<{\"a\":1}></{\"a\":1}> {hasParent=false, hasText=false, isBlock=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput179() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.FormElement", "org.jsoup.nodes.FormElement", "clearAttributes", new String[]{}, new String[]{}, false, 4, new String[][]{});
  assertNotNull(actual);
  assertEquals("org.jsoup.nodes.FormElement", actual.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput180() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.FormElement", "org.jsoup.nodes.FormElement", "filter", new String[]{"org.jsoup.select.NodeFilter"}, new String[]{"<sample:3>"}, false);
  assertNotNull(actual);
  assertEquals("org.jsoup.nodes.FormElement", actual.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput181() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jsoup.nodes.FormElement", "org.jsoup.nodes.FormElement", "before", new String[]{"java.lang.String"}, new String[]{"<null>"}, false); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput182() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.FormElement", "org.jsoup.nodes.FormElement", "is", new String[]{"org.jsoup.select.Evaluator"}, new String[]{"<sample:7>"}, false, 3, new String[][]{{"org.jsoup.nodes.FormElement", "filter", "org.jsoup.select.NodeFilter", "<sample:3>"}, {"org.jsoup.nodes.FormElement", "siblingNodes", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "<<a><b>t</b></a> #comment=\"a\"></<a><b>t</b></a>> {hasParent=false, hasText=false, isBlock=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput183() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jsoup.nodes.FormElement", "org.jsoup.nodes.FormElement", "clone", new String[]{}, new String[]{}, false, 4, new String[][]{{"org.jsoup.nodes.FormElement", "dataset", ""}, {"org.jsoup.nodes.FormElement", "getElementsContainingOwnText", "java.lang.String", "1e1e10"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput184() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.FormElement", "org.jsoup.nodes.FormElement", "text", new String[]{"java.lang.String"}, new String[]{"/a/bn"}, false, 7, new String[][]{{"org.jsoup.nodes.FormElement", "prependChild", "org.jsoup.nodes.Node", "<sample:0>"}});
  assertNotNull(actual);
  assertEquals("org.jsoup.nodes.FormElement", actual.getClass().getName());
  assertEquals("<x \t y #comment=\"a\">\n /a/bn\n</x \t y> {hasParent=false, hasText=true, isBlock=false}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "<x \t y #comment=\"a\">\n /a/bn\n</x \t y> {hasParent=false, hasText=true, isBlock=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput185() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jsoup.nodes.FormElement", "org.jsoup.nodes.FormElement", "getElementsByAttribute", new String[]{"java.lang.String"}, new String[]{"21474836t8"}, false, 0, new String[][]{{"org.jsoup.nodes.FormElement", "removeChild", "org.jsoup.nodes.Node", "<sample:4>"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput186() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.FormElement", "org.jsoup.nodes.FormElement", "removeClass", new String[]{"java.lang.String"}, new String[]{"1.52"}, false);
  assertNotNull(actual);
  assertEquals("org.jsoup.nodes.FormElement", actual.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput187() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.FormElement", "org.jsoup.nodes.FormElement", "parent", new String[]{}, new String[]{}, false, 7, new String[][]{{"org.jsoup.nodes.FormElement", "getElementsMatchingText", "java.lang.String", "ntll"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "<x \t y #comment=\"a\"></x \t y> {hasParent=false, hasText=false, isBlock=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput188() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.FormElement", "org.jsoup.nodes.FormElement", "childNodesCopy", new String[]{}, new String[]{}, false, 7, new String[][]{});
  assertNotNull(actual);
  assertEquals("java.util.ArrayList", actual.getClass().getName());
  assertEquals("[]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "<x \t y #comment=\"a\"></x \t y> {hasParent=false, hasText=false, isBlock=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput189() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.FormElement", "org.jsoup.nodes.FormElement", "appendTo", new String[]{"org.jsoup.nodes.Element"}, new String[]{"<sample:3>"}, false, 5, new String[][]{});
  assertNotNull(actual);
  assertEquals("org.jsoup.nodes.FormElement", actual.getClass().getName());
  assertEquals("<{\"a\":1}></{\"a\":1}> {hasParent=true, hasText=false, isBlock=false}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "<{\"a\":1}></{\"a\":1}> {hasParent=true, hasText=false, isBlock=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput190() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jsoup.nodes.FormElement", "org.jsoup.nodes.FormElement", "child", new String[]{"int"}, new String[]{"5"}, false, 5, new String[][]{}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IndexOutOfBoundsException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput191() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.FormElement", "org.jsoup.nodes.FormElement", "traverse", new String[]{"org.jsoup.select.NodeVisitor"}, new String[]{"<sample:3>"}, false, 3, new String[][]{});
  assertNotNull(actual);
  assertEquals("org.jsoup.nodes.FormElement", actual.getClass().getName());
  assertEquals("<<a><b>t</b></a> #comment=\"a\"></<a><b>t</b></a>> {hasParent=false, hasText=false, isBlock=false}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "<<a><b>t</b></a> #comment=\"a\"></<a><b>t</b></a>> {hasParent=false, hasText=false, isBlock=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput192() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jsoup.nodes.FormElement", "org.jsoup.nodes.FormElement", "appendTo", new String[]{"org.jsoup.nodes.Element"}, new String[]{"<sample:1>"}, false, 4, new String[][]{}), new String[][]{{"getElementsByIndexGreaterThan", "int", "5"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput193() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jsoup.nodes.FormElement", "org.jsoup.nodes.FormElement", "getElementsByAttributeValueNot", new String[]{"java.lang.String", "java.lang.String"}, new String[]{"\n5.", ""}, false, 2, new String[][]{{"org.jsoup.nodes.FormElement", "ownerDocument", ""}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput194() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jsoup.nodes.FormElement", "org.jsoup.nodes.FormElement", "childNodesAsArray", new String[]{}, new String[]{}, false, 6, new String[][]{{"org.jsoup.nodes.FormElement", "selectFirst", "java.lang.String", "\n"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput195() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.FormElement", "org.jsoup.nodes.FormElement", "nodelistChanged", new String[]{}, new String[]{}, false, 1, new String[][]{});
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput196() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jsoup.nodes.FormElement", "org.jsoup.nodes.FormElement", "getElementsByAttributeValueMatching", new String[]{"java.lang.String", "java.util.regex.Pattern"}, new String[]{"http://example/com/a?b=c", "<sample:0>"}, false); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput197() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.FormElement", "org.jsoup.nodes.FormElement", "text", new String[]{}, new String[]{}, false, 5, new String[][]{{"org.jsoup.nodes.FormElement", "parents", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("", String.valueOf(actual));
  assertEquals("receiver state after the call", "<{\"a\":1}></{\"a\":1}> {hasParent=false, hasText=false, isBlock=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput198() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.FormElement", "org.jsoup.nodes.FormElement", "baseUri", new String[]{}, new String[]{}, false, 5, new String[][]{});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("sample", String.valueOf(actual));
  assertEquals("receiver state after the call", "<{\"a\":1}></{\"a\":1}> {hasParent=false, hasText=false, isBlock=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput199() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jsoup.nodes.FormElement", "org.jsoup.nodes.FormElement", "textNodes", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.jsoup.nodes.FormElement", "nodeName", ""}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput200() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.FormElement", "org.jsoup.nodes.FormElement", "getElementsByAttributeStarting", new String[]{"java.lang.String"}, new String[]{"2147483648"}, false, 7, new String[][]{{"org.jsoup.nodes.FormElement", "appendChild", "org.jsoup.nodes.Node", "<sample:4>"}});
  assertNotNull(actual);
  assertEquals("org.jsoup.select.Elements", actual.getClass().getName());
  assertEquals("[]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "<x \t y #comment=\"a\">\n <!--a-->\n</x \t y> {hasParent=false, hasText=false, isBlock=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput201() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jsoup.nodes.FormElement", "org.jsoup.nodes.FormElement", "appendTo", new String[]{"org.jsoup.nodes.Element"}, new String[]{"<sample:6>"}, false), new String[][]{{"hasClass", "java.lang.String", "0"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput202() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.FormElement", "org.jsoup.nodes.FormElement", "removeClass", new String[]{"java.lang.String"}, new String[]{"n`me"}, false, 5, new String[][]{{"org.jsoup.nodes.FormElement", "selectFirst", "java.lang.String", ""}, {"org.jsoup.nodes.FormElement", "siblingElements", ""}});
  assertNotNull(actual);
  assertEquals("org.jsoup.nodes.FormElement", actual.getClass().getName());
  assertEquals("<{\"a\":1}></{\"a\":1}> {hasParent=false, hasText=false, isBlock=false}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "<{\"a\":1}></{\"a\":1}> {hasParent=false, hasText=false, isBlock=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput203() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.FormElement", "org.jsoup.nodes.FormElement", "val", new String[]{"java.lang.String"}, new String[]{"1.12[45678901234567"}, false, 5, new String[][]{{"org.jsoup.nodes.FormElement", "hasAttr", "java.lang.String", "disabled"}, {"org.jsoup.nodes.FormElement", "classNames", ""}});
  assertNotNull(actual);
  assertEquals("org.jsoup.nodes.FormElement", actual.getClass().getName());
  assertEquals("<{\"a\":1} value=\"1.12[45678901234567\"></{\"a\":1}> {hasParent=false, hasText=false, isBlock=false}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "<{\"a\":1} value=\"1.12[45678901234567\"></{\"a\":1}> {hasParent=false, hasText=false, isBlock=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput204() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.FormElement", "org.jsoup.nodes.FormElement", "clearAttributes", new String[]{}, new String[]{}, false, 3, new String[][]{{"org.jsoup.nodes.FormElement", "addChildren", "org.jsoup.nodes.Node[]", "<empty>"}});
  assertNotNull(actual);
  assertEquals("org.jsoup.nodes.FormElement", actual.getClass().getName());
  assertEquals("<<a><b>t</b></a>></<a><b>t</b></a>> {hasParent=false, hasText=false, isBlock=false}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "<<a><b>t</b></a>></<a><b>t</b></a>> {hasParent=false, hasText=false, isBlock=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput205() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.FormElement", "org.jsoup.nodes.FormElement", "id", new String[]{}, new String[]{}, false, 4, new String[][]{});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput206() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.FormElement", "org.jsoup.nodes.FormElement", "attributes", new String[]{}, new String[]{}, false, 6, new String[][]{});
  assertNotNull(actual);
  assertEquals("org.jsoup.nodes.Attributes", actual.getClass().getName());
  assertEquals(" {size=0}", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput207() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.FormElement", "org.jsoup.nodes.FormElement", "tag", new String[]{}, new String[]{}, false, 6, new String[][]{});
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput208() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jsoup.nodes.FormElement", "org.jsoup.nodes.FormElement", "empty", new String[]{}, new String[]{}, false); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput209() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jsoup.nodes.FormElement", "org.jsoup.nodes.FormElement", "childNodesCopy", new String[]{}, new String[]{}, false, 5, new String[][]{{"org.jsoup.nodes.FormElement", "prepend", "java.lang.String", "1-123456789012456"}, {"org.jsoup.nodes.FormElement", "root", ""}}), new String[][]{{"addAll", "java.util.Collection", "7"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
  assertEquals("receiver state after the call", "<{\"a\":1}>\n 1-123456789012456\n</{\"a\":1}> {hasParent=false, hasText=true, isBlock=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput210() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.FormElement", "org.jsoup.nodes.FormElement", "getAllElements", new String[]{}, new String[]{}, false, 5, new String[][]{{"org.jsoup.nodes.FormElement", "html", "java.lang.String", "2020.02-30T26:61:61"}});
  assertNotNull(actual);
  assertEquals("org.jsoup.select.Elements", actual.getClass().getName());
  assertEquals("[<{\"a\":1}>\n 2020.02-30T26:61:61\n</{\"a\":1}>]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "<{\"a\":1}>\n 2020.02-30T26:61:61\n</{\"a\":1}> {hasParent=false, hasText=true, isBlock=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput211() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jsoup.nodes.FormElement", "org.jsoup.nodes.FormElement", "classNames", new String[]{}, new String[]{}, false, 1, new String[][]{{"org.jsoup.nodes.FormElement", "replaceWith", "org.jsoup.nodes.Node", "<sample:3>"}}), new String[][]{{"iterator", "", "5"}, {"hasNext", "", "1"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput212() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jsoup.nodes.FormElement", "org.jsoup.nodes.FormElement", "dataNodes", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.jsoup.nodes.FormElement", "outerHtmlTail", "java.lang.Appendable,int,org.jsoup.nodes.Document$OutputSettings", "<sample:0>", "55", "<sample:2>"}, {"org.jsoup.nodes.FormElement", "outerHtml", ""}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput213() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jsoup.nodes.FormElement", "org.jsoup.nodes.FormElement", "getElementsByAttributeValueEnding", new String[]{"java.lang.String", "java.lang.String"}, new String[]{"aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaname", "I"}, false, 7, new String[][]{{"org.jsoup.nodes.FormElement", "getElementsByAttributeValueContaining", "java.lang.String,java.lang.String", "a", "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaa.5"}}), new String[][]{{"html", "", "5"}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("", String.valueOf(actual));
  assertEquals("receiver state after the call", "<x \t y #comment=\"a\"></x \t y> {hasParent=false, hasText=false, isBlock=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput214() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.FormElement", "org.jsoup.nodes.FormElement", "getElementsByAttributeValueEnding", new String[]{"java.lang.String", "java.lang.String"}, new String[]{" ", "POST5."}, false, 5, new String[][]{{"org.jsoup.nodes.FormElement", "getElementsByIndexEquals", "int", "-54"}});
  assertNotNull(actual);
  assertEquals("org.jsoup.select.Elements", actual.getClass().getName());
  assertEquals("[]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "<{\"a\":1}></{\"a\":1}> {hasParent=false, hasText=false, isBlock=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput215() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jsoup.nodes.FormElement", "org.jsoup.nodes.FormElement", "insertChildren", new String[]{"int", "org.jsoup.nodes.Node[]"}, new String[]{"-2147475456", "<sample:2>"}, false, 3, new String[][]{{"org.jsoup.nodes.FormElement", "getElementsByIndexLessThan", "int", "-2147483648"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput216() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jsoup.nodes.FormElement", "org.jsoup.nodes.FormElement", "getElementsByAttributeValueContaining", new String[]{"java.lang.String", "java.lang.String"}, new String[]{"<null>", "1.12345678901234567"}, false, 5, new String[][]{}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput217() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.FormElement", "org.jsoup.nodes.FormElement", "elements", new String[]{}, new String[]{}, false, 7, new String[][]{});
  assertNotNull(actual);
  assertEquals("org.jsoup.select.Elements", actual.getClass().getName());
  assertEquals("[]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "<x \t y #comment=\"a\"></x \t y> {hasParent=false, hasText=false, isBlock=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput218() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.FormElement", "org.jsoup.nodes.FormElement", "data", new String[]{}, new String[]{}, false, 5, new String[][]{});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("", String.valueOf(actual));
  assertEquals("receiver state after the call", "<{\"a\":1}></{\"a\":1}> {hasParent=false, hasText=false, isBlock=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput219() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.FormElement", "org.jsoup.nodes.FormElement", "indent", new String[]{"java.lang.Appendable", "int", "org.jsoup.nodes.Document$OutputSettings"}, new String[]{"<empty>", "1048586", "<sample:6>"}, false, 0, new String[][]{{"org.jsoup.nodes.FormElement", "selectFirst", "java.lang.String", "-1.5"}});
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput220() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jsoup.nodes.FormElement", "org.jsoup.nodes.FormElement", "getElementsByAttributeValueEnding", new String[]{"java.lang.String", "java.lang.String"}, new String[]{"i1E-5", "\037"}, false); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput221() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jsoup.nodes.FormElement", "org.jsoup.nodes.FormElement", "getElementById", new String[]{"java.lang.String"}, new String[]{"/t/b"}, false, 0, new String[][]{{"org.jsoup.nodes.FormElement", "ownText", ""}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput222() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.FormElement", "org.jsoup.nodes.FormElement", "getElementsByAttributeValue", new String[]{"java.lang.String", "java.lang.String"}, new String[]{"nn", "1E-"}, false, 5, new String[][]{{"org.jsoup.nodes.FormElement", "outerHtmlHead", "java.lang.Appendable,int,org.jsoup.nodes.Document$OutputSettings", "<sample:2>", "49", "<sample:6>"}});
  assertNotNull(actual);
  assertEquals("org.jsoup.select.Elements", actual.getClass().getName());
  assertEquals("[]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "<{\"a\":1}></{\"a\":1}> {hasParent=false, hasText=false, isBlock=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput223() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.FormElement", "org.jsoup.nodes.FormElement", "parent", new String[]{}, new String[]{}, false, 3, new String[][]{});
  assertNull(actual);
  assertEquals("receiver state after the call", "<<a><b>t</b></a> #comment=\"a\"></<a><b>t</b></a>> {hasParent=false, hasText=false, isBlock=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput224() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jsoup.nodes.FormElement", "org.jsoup.nodes.FormElement", "addClass", new String[]{"java.lang.String"}, new String[]{"nalIe"}, false, 1, new String[][]{}), new String[][]{{"after", "org.jsoup.nodes.Node", "2"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput225() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.FormElement", "org.jsoup.nodes.FormElement", "val", new String[]{}, new String[]{}, false, 5, new String[][]{{"org.jsoup.nodes.FormElement", "replaceWith", "org.jsoup.nodes.Node", "<sample:10>"}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("", String.valueOf(actual));
  assertEquals("receiver state after the call", "<{\"a\":1}></{\"a\":1}> {hasParent=false, hasText=false, isBlock=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput226() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jsoup.nodes.FormElement", "org.jsoup.nodes.FormElement", "html", new String[]{}, new String[]{}, false, 6, new String[][]{{"org.jsoup.nodes.FormElement", "removeClass", "java.lang.String", "n2147483648"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput227() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.FormElement", "org.jsoup.nodes.FormElement", "getElementsByAttribute", new String[]{"java.lang.String"}, new String[]{"option1.5e300"}, false, 5, new String[][]{});
  assertNotNull(actual);
  assertEquals("org.jsoup.select.Elements", actual.getClass().getName());
  assertEquals("[]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "<{\"a\":1}></{\"a\":1}> {hasParent=false, hasText=false, isBlock=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput228() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jsoup.nodes.FormElement", "org.jsoup.nodes.FormElement", "getElementsMatchingOwnText", new String[]{"java.lang.String"}, new String[]{"TITLE"}, false); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput229() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.FormElement", "org.jsoup.nodes.FormElement", "doClone", new String[]{"org.jsoup.nodes.Node"}, new String[]{"<sample:5>"}, false, 5, new String[][]{{"org.jsoup.nodes.FormElement", "parents", ""}});
  assertNotNull(actual);
  assertEquals("org.jsoup.nodes.FormElement", actual.getClass().getName());
  assertEquals("receiver state after the call", "<{\"a\":1}></{\"a\":1}> {hasParent=false, hasText=false, isBlock=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput230() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jsoup.nodes.FormElement", "org.jsoup.nodes.FormElement", "val", new String[]{"java.lang.String"}, new String[]{"+1"}, false); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput231() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.FormElement", "org.jsoup.nodes.FormElement", "doSetBaseUri", new String[]{"java.lang.String"}, new String[]{"/a/b"}, false, 1, new String[][]{});
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput232() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.FormElement", "org.jsoup.nodes.FormElement", "outerHtml", new String[]{"java.lang.Appendable"}, new String[]{"<empty>"}, false, 3, new String[][]{{"org.jsoup.nodes.FormElement", "getElementsByIndexLessThan", "int", "2147483583"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "<<a><b>t</b></a> #comment=\"a\"></<a><b>t</b></a>> {hasParent=false, hasText=false, isBlock=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput233() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jsoup.nodes.FormElement", "org.jsoup.nodes.FormElement", "getElementsByClass", new String[]{"java.lang.String"}, new String[]{""}, false, 5, new String[][]{{"org.jsoup.nodes.FormElement", "selectFirst", "java.lang.String", "i"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput234() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.FormElement", "org.jsoup.nodes.FormElement", "hasSameValue", new String[]{"java.lang.Object"}, new String[]{"<s:>"}, false, 5, new String[][]{});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "<{\"a\":1}></{\"a\":1}> {hasParent=false, hasText=false, isBlock=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput235() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.FormElement", "org.jsoup.nodes.FormElement", "baseUri", new String[]{}, new String[]{}, false, 1, new String[][]{{"org.jsoup.nodes.FormElement", "appendElement", "java.lang.String", "select123456789012345678901234567890"}});
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput236() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jsoup.nodes.FormElement", "org.jsoup.nodes.FormElement", "getAllElements", new String[]{}, new String[]{}, false, 1, new String[][]{}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput237() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.FormElement", "org.jsoup.nodes.FormElement", "attr", new String[]{"java.lang.String"}, new String[]{"!"}, false, 5, new String[][]{});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("", String.valueOf(actual));
  assertEquals("receiver state after the call", "<{\"a\":1}></{\"a\":1}> {hasParent=false, hasText=false, isBlock=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput238() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.FormElement", "org.jsoup.nodes.FormElement", "appendChild", new String[]{"org.jsoup.nodes.Node"}, new String[]{"<sample:2>"}, false, 3, new String[][]{});
  assertNotNull(actual);
  assertEquals("org.jsoup.nodes.FormElement", actual.getClass().getName());
  assertEquals("<<a><b>t</b></a> #comment=\"a\">\n <#root></#root>\n</<a><b>t</b></a>> {hasParent=false, hasText=false, isBlock=false}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "<<a><b>t</b></a> #comment=\"a\">\n <#root></#root>\n</<a><b>t</b></a>> {hasParent=false, hasText=false, isBlock=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput239() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.FormElement", "org.jsoup.nodes.FormElement", "appendElement", new String[]{"java.lang.String"}, new String[]{"12:30:4"}, false, 5, new String[][]{});
  assertNotNull(actual);
  assertEquals("org.jsoup.nodes.Element", actual.getClass().getName());
  assertEquals("<12:30:4></12:30:4> {hasParent=true, hasText=false, isBlock=false}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "<{\"a\":1}>\n <12:30:4></12:30:4>\n</{\"a\":1}> {hasParent=false, hasText=false, isBlock=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput240() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jsoup.nodes.FormElement", "org.jsoup.nodes.FormElement", "childNodeSize", new String[]{}, new String[]{}, false, 2, new String[][]{{"org.jsoup.nodes.FormElement", "before", "org.jsoup.nodes.Node", "<sample:0>"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput241() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.FormElement", "org.jsoup.nodes.FormElement", "getElementsByAttributeValueContaining", new String[]{"java.lang.String", "java.lang.String"}, new String[]{"1.251e10", "http://example.com/a?b=c"}, false, 5, new String[][]{});
  assertNotNull(actual);
  assertEquals("org.jsoup.select.Elements", actual.getClass().getName());
  assertEquals("[]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "<{\"a\":1}></{\"a\":1}> {hasParent=false, hasText=false, isBlock=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput242() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.FormElement", "org.jsoup.nodes.FormElement", "appendTo", new String[]{"org.jsoup.nodes.Element"}, new String[]{"<sample:3>"}, false, 7, new String[][]{});
  assertNotNull(actual);
  assertEquals("org.jsoup.nodes.FormElement", actual.getClass().getName());
  assertEquals("<x \t y #comment=\"a\"></x \t y> {hasParent=true, hasText=false, isBlock=false}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "<x \t y #comment=\"a\"></x \t y> {hasParent=true, hasText=false, isBlock=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput243() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jsoup.nodes.FormElement", "org.jsoup.nodes.FormElement", "getElementsByIndexLessThan", new String[]{"int"}, new String[]{"2147483647"}, false); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput244() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.FormElement", "org.jsoup.nodes.FormElement", "getElementsByIndexEquals", new String[]{"int"}, new String[]{"1"}, false, 5, new String[][]{});
  assertNotNull(actual);
  assertEquals("org.jsoup.select.Elements", actual.getClass().getName());
  assertEquals("[]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "<{\"a\":1}></{\"a\":1}> {hasParent=false, hasText=false, isBlock=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput245() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jsoup.nodes.FormElement", "org.jsoup.nodes.FormElement", "getElementsByAttributeValueMatching", new String[]{"java.lang.String", "java.lang.String"}, new String[]{"\u00e9", "a,b,c"}, false, 0, new String[][]{{"org.jsoup.nodes.FormElement", "is", "org.jsoup.select.Evaluator", "<sample:0>"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput246() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jsoup.nodes.FormElement", "org.jsoup.nodes.FormElement", "childNodes", new String[]{}, new String[]{}, false, 7, new String[][]{}), new String[][]{{"lastIndexOf", "java.lang.Object", "0"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("-1", String.valueOf(actual));
  assertEquals("receiver state after the call", "<x \t y #comment=\"a\"></x \t y> {hasParent=false, hasText=false, isBlock=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput247() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.FormElement", "org.jsoup.nodes.FormElement", "getElementsMatchingOwnText", new String[]{"java.lang.String"}, new String[]{"1.5d"}, false, 3, new String[][]{{"org.jsoup.nodes.FormElement", "html", ""}});
  assertNotNull(actual);
  assertEquals("org.jsoup.select.Elements", actual.getClass().getName());
  assertEquals("[]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "<<a><b>t</b></a> #comment=\"a\"></<a><b>t</b></a>> {hasParent=false, hasText=false, isBlock=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput248() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jsoup.nodes.FormElement", "org.jsoup.nodes.FormElement", "doClone", new String[]{"org.jsoup.nodes.Node"}, new String[]{"<sample:0>"}, false, 3, new String[][]{{"org.jsoup.nodes.FormElement", "getElementsByIndexLessThan", "int", "1073741823"}}), new String[][]{{"getElementsByIndexEquals", "int", "6"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.ClassCastException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput249() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jsoup.nodes.FormElement", "org.jsoup.nodes.FormElement", "getElementsByAttributeStarting", new String[]{"java.lang.String"}, new String[]{"PXRT"}, false, 5, new String[][]{}), new String[][]{{"iterator", "", "3"}});
  assertNotNull(actual);
  assertEquals("java.util.ArrayList$Itr", actual.getClass().getName());
  assertEquals("{hasNext=false}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "<{\"a\":1}></{\"a\":1}> {hasParent=false, hasText=false, isBlock=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput250() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.FormElement", "org.jsoup.nodes.FormElement", "className", new String[]{}, new String[]{}, false, 3, new String[][]{{"org.jsoup.nodes.FormElement", "prependElement", "java.lang.String", "option[selectedn1.12345678901234567"}, {"org.jsoup.nodes.FormElement", "selectFirst", "java.lang.String", "1.12345I7"}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("", String.valueOf(actual));
  assertEquals("receiver state after the call", "<<a><b>t</b></a> #comment=\"a\">\n <option[selectedn1.12345678901234567></option[selectedn1.12345678901234567>\n</<a><b>t</b></a>> {hasParent=false, hasText=false, isBlock=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput251() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.FormElement", "org.jsoup.nodes.FormElement", "getElementsByAttributeValueMatching", new String[]{"java.lang.String", "java.lang.String"}, new String[]{"\t{\"a\":1}", ""}, false, 5, new String[][]{{"org.jsoup.nodes.FormElement", "childNode", "int", "-29"}});
  assertNotNull(actual);
  assertEquals("org.jsoup.select.Elements", actual.getClass().getName());
  assertEquals("[]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "<{\"a\":1}></{\"a\":1}> {hasParent=false, hasText=false, isBlock=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput252() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.FormElement", "org.jsoup.nodes.FormElement", "tagName", new String[]{}, new String[]{}, false, 5, new String[][]{{"org.jsoup.nodes.FormElement", "prependElement", "java.lang.String", "2LL"}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("{\"a\":1}", String.valueOf(actual));
  assertEquals("receiver state after the call", "<{\"a\":1}>\n <2LL></2LL>\n</{\"a\":1}> {hasParent=false, hasText=false, isBlock=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput253() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.FormElement", "org.jsoup.nodes.FormElement", "removeAttr", new String[]{"java.lang.String"}, new String[]{"1.5e300010"}, false, 5, new String[][]{{"org.jsoup.nodes.FormElement", "removeClass", "java.lang.String", "disabled"}});
  assertNotNull(actual);
  assertEquals("org.jsoup.nodes.FormElement", actual.getClass().getName());
  assertEquals("<{\"a\":1}></{\"a\":1}> {hasParent=false, hasText=false, isBlock=false}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "<{\"a\":1}></{\"a\":1}> {hasParent=false, hasText=false, isBlock=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput254() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.FormElement", "org.jsoup.nodes.FormElement", "dataNodes", new String[]{}, new String[]{}, false, 5, new String[][]{{"org.jsoup.nodes.FormElement", "submit", ""}});
  assertNotNull(actual);
  assertEquals("java.util.Collections$UnmodifiableRandomAccessList", actual.getClass().getName());
  assertEquals("[]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "<{\"a\":1}></{\"a\":1}> {hasParent=false, hasText=false, isBlock=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput255() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jsoup.nodes.FormElement", "org.jsoup.nodes.FormElement", "nodeName", new String[]{}, new String[]{}, false, 4, new String[][]{}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput256() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jsoup.nodes.FormElement", "org.jsoup.nodes.FormElement", "insertChildren", new String[]{"int", "java.util.Collection"}, new String[]{"-1", "<null>"}, false); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput257() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jsoup.nodes.FormElement", "org.jsoup.nodes.FormElement", "traverse", new String[]{"org.jsoup.select.NodeVisitor"}, new String[]{"<sample:4>"}, false, 1, new String[][]{{"org.jsoup.nodes.FormElement", "getElementsByAttributeValueNot", "java.lang.String,java.lang.String", "", "ttrue"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput258() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jsoup.nodes.FormElement", "org.jsoup.nodes.FormElement", "getElementsByIndexGreaterThan", new String[]{"int"}, new String[]{"-1"}, false, 5, new String[][]{}), new String[][]{{"retainAll", "java.util.Collection", "0"}, {"remove", "int", "2"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IndexOutOfBoundsException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput259() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.FormElement", "org.jsoup.nodes.FormElement", "root", new String[]{}, new String[]{}, false, 5, new String[][]{{"org.jsoup.nodes.FormElement", "formData", ""}});
  assertNotNull(actual);
  assertEquals("org.jsoup.nodes.FormElement", actual.getClass().getName());
  assertEquals("<{\"a\":1}></{\"a\":1}> {hasParent=false, hasText=false, isBlock=false}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "<{\"a\":1}></{\"a\":1}> {hasParent=false, hasText=false, isBlock=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput260() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jsoup.nodes.FormElement", "org.jsoup.nodes.FormElement", "val", new String[]{}, new String[]{}, false); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput261() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.FormElement", "org.jsoup.nodes.FormElement", "getElementsByAttributeValue", new String[]{"java.lang.String", "java.lang.String"}, new String[]{"true", ",-1"}, false, 7, new String[][]{{"org.jsoup.nodes.FormElement", "isBlock", ""}});
  assertNotNull(actual);
  assertEquals("org.jsoup.select.Elements", actual.getClass().getName());
  assertEquals("[]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "<x \t y #comment=\"a\"></x \t y> {hasParent=false, hasText=false, isBlock=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput262() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.FormElement", "org.jsoup.nodes.FormElement", "filter", new String[]{"org.jsoup.select.NodeFilter"}, new String[]{"<sample:3>"}, false, 5, new String[][]{});
  assertNotNull(actual);
  assertEquals("org.jsoup.nodes.FormElement", actual.getClass().getName());
  assertEquals("<{\"a\":1}></{\"a\":1}> {hasParent=false, hasText=false, isBlock=false}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "<{\"a\":1}></{\"a\":1}> {hasParent=false, hasText=false, isBlock=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput263() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.FormElement", "org.jsoup.nodes.FormElement", "getElementsByAttributeValueEnding", new String[]{"java.lang.String", "java.lang.String"}, new String[]{"disacled.5", "4"}, false, 3, new String[][]{});
  assertNotNull(actual);
  assertEquals("org.jsoup.select.Elements", actual.getClass().getName());
  assertEquals("[]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "<<a><b>t</b></a> #comment=\"a\"></<a><b>t</b></a>> {hasParent=false, hasText=false, isBlock=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput264() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.FormElement", "org.jsoup.nodes.FormElement", "shallowClone", new String[]{}, new String[]{}, false, 7, new String[][]{});
  assertNotNull(actual);
  assertEquals("org.jsoup.nodes.Element", actual.getClass().getName());
  assertEquals("<x \t y #comment=\"a\"></x \t y> {hasParent=false, hasText=false, isBlock=false}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "<x \t y #comment=\"a\"></x \t y> {hasParent=false, hasText=false, isBlock=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput265() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.FormElement", "org.jsoup.nodes.FormElement", "attr", new String[]{"java.lang.String", "java.lang.String"}, new String[]{"", "0xFFFFFFF"}, false, 5, new String[][]{{"org.jsoup.nodes.FormElement", "text", ""}});
  assertNotNull(actual);
  assertEquals("org.jsoup.nodes.FormElement", actual.getClass().getName());
  assertEquals("<{\"a\":1} =\"0xFFFFFFF\"></{\"a\":1}> {hasParent=false, hasText=false, isBlock=false}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "<{\"a\":1} =\"0xFFFFFFF\"></{\"a\":1}> {hasParent=false, hasText=false, isBlock=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput266() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jsoup.nodes.FormElement", "org.jsoup.nodes.FormElement", "append", new String[]{"java.lang.String"}, new String[]{"u1.5f"}, false, 6, new String[][]{}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput267() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.FormElement", "org.jsoup.nodes.FormElement", "getElementsByAttributeValueNot", new String[]{"java.lang.String", "java.lang.String"}, new String[]{"1.1B345678901234567", "method"}, false, 7, new String[][]{{"org.jsoup.nodes.FormElement", "getOutputSettings", ""}});
  assertNotNull(actual);
  assertEquals("org.jsoup.select.Elements", actual.getClass().getName());
  assertEquals("[<x \t y #comment=\"a\"></x \t y>]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "<x \t y #comment=\"a\"></x \t y> {hasParent=false, hasText=false, isBlock=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput268() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.FormElement", "org.jsoup.nodes.FormElement", "data", new String[]{}, new String[]{}, false, 7, new String[][]{});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("", String.valueOf(actual));
  assertEquals("receiver state after the call", "<x \t y #comment=\"a\"></x \t y> {hasParent=false, hasText=false, isBlock=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput269() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.FormElement", "org.jsoup.nodes.FormElement", "tag", new String[]{}, new String[]{}, false, 5, new String[][]{});
  assertNotNull(actual);
  assertEquals("org.jsoup.parser.Tag", actual.getClass().getName());
  assertEquals("{\"a\":1} {canContainBlock=false, getName={\"a\":1}, isBlock=false, isData=false, isEmpty=false, isFormListed=false, isFormSubmittable=false, isInline=true, isKnownTag=false, isSelfClosing=false}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "<{\"a\":1}></{\"a\":1}> {hasParent=false, hasText=false, isBlock=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput270() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jsoup.nodes.FormElement", "org.jsoup.nodes.FormElement", "filter", new String[]{"org.jsoup.select.NodeFilter"}, new String[]{"<null>"}, false, 6, new String[][]{{"org.jsoup.nodes.FormElement", "previousElementSibling", ""}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput271() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.FormElement", "org.jsoup.nodes.FormElement", "getElementsByClass", new String[]{"java.lang.String"}, new String[]{"1.12345667890123456"}, false, 3, new String[][]{{"org.jsoup.nodes.FormElement", "getElementsByTag", "java.lang.String", "opion[seledted]"}, {"org.jsoup.nodes.FormElement", "insertChildren", "int,org.jsoup.nodes.Node[]", "2147483647", "<sample:4>"}});
  assertNotNull(actual);
  assertEquals("org.jsoup.select.Elements", actual.getClass().getName());
  assertEquals("[]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "<<a><b>t</b></a> #comment=\"a\"></<a><b>t</b></a>> {hasParent=false, hasText=false, isBlock=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput272() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jsoup.nodes.FormElement", "org.jsoup.nodes.FormElement", "siblingElements", new String[]{}, new String[]{}, false, 7, new String[][]{}), new String[][]{{"html", "", "7"}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("", String.valueOf(actual));
  assertEquals("receiver state after the call", "<x \t y #comment=\"a\"></x \t y> {hasParent=false, hasText=false, isBlock=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput273() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jsoup.nodes.FormElement", "org.jsoup.nodes.FormElement", "filter", new String[]{"org.jsoup.select.NodeFilter"}, new String[]{"<sample:0>"}, false, 0, new String[][]{{"org.jsoup.nodes.FormElement", "getElementsByIndexGreaterThan", "int", "2147483647"}, {"org.jsoup.nodes.FormElement", "setParentNode", "org.jsoup.nodes.Node", "<sample:2>"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput274() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.FormElement", "org.jsoup.nodes.FormElement", "elementSiblingIndex", new String[]{}, new String[]{}, false);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput275() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jsoup.nodes.FormElement", "org.jsoup.nodes.FormElement", "getElementsByAttribute", new String[]{"java.lang.String"}, new String[]{"radio[1,2]"}, false, 3, new String[][]{}), new String[][]{{"trimToSize", "", "3"}, {"iterator", "", "6"}});
  assertNotNull(actual);
  assertEquals("java.util.ArrayList$Itr", actual.getClass().getName());
  assertEquals("{hasNext=false}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "<<a><b>t</b></a> #comment=\"a\"></<a><b>t</b></a>> {hasParent=false, hasText=false, isBlock=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput276() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jsoup.nodes.FormElement", "org.jsoup.nodes.FormElement", "attributes", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.jsoup.nodes.FormElement", "root", ""}}), new String[][]{{"put", "java.lang.String,java.lang.String", "3"}});
  assertNotNull(actual);
  assertEquals("org.jsoup.nodes.Attributes", actual.getClass().getName());
  assertEquals(" sample=\"\" {size=1}", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput277() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.FormElement", "org.jsoup.nodes.FormElement", "classNames", new String[]{}, new String[]{}, false, 7, new String[][]{{"org.jsoup.nodes.FormElement", "equals", "java.lang.Object", "<i:0>"}});
  assertNotNull(actual);
  assertEquals("java.util.LinkedHashSet", actual.getClass().getName());
  assertEquals("[]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "<x \t y #comment=\"a\"></x \t y> {hasParent=false, hasText=false, isBlock=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput278() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.FormElement", "org.jsoup.nodes.FormElement", "absUrl", new String[]{"java.lang.String"}, new String[]{"{\"a\":1}"}, false, 7, new String[][]{});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("", String.valueOf(actual));
  assertEquals("receiver state after the call", "<x \t y #comment=\"a\"></x \t y> {hasParent=false, hasText=false, isBlock=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput279() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.FormElement", "org.jsoup.nodes.FormElement", "text", new String[]{"java.lang.String"}, new String[]{"+1"}, false, 5, new String[][]{{"org.jsoup.nodes.FormElement", "tag", ""}});
  assertNotNull(actual);
  assertEquals("org.jsoup.nodes.FormElement", actual.getClass().getName());
  assertEquals("<{\"a\":1}>\n +1\n</{\"a\":1}> {hasParent=false, hasText=true, isBlock=false}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "<{\"a\":1}>\n +1\n</{\"a\":1}> {hasParent=false, hasText=true, isBlock=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput280() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.FormElement", "org.jsoup.nodes.FormElement", "child", new String[]{"int"}, new String[]{"0"}, false, 3, new String[][]{{"org.jsoup.nodes.FormElement", "prependElement", "java.lang.String", "actipo"}, {"org.jsoup.nodes.FormElement", "parents", ""}});
  assertNotNull(actual);
  assertEquals("org.jsoup.nodes.Element", actual.getClass().getName());
  assertEquals("<actipo></actipo> {hasParent=true, hasText=false, isBlock=false}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "<<a><b>t</b></a> #comment=\"a\">\n <actipo></actipo>\n</<a><b>t</b></a>> {hasParent=false, hasText=false, isBlock=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput281() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jsoup.nodes.FormElement", "org.jsoup.nodes.FormElement", "getElementsByAttribute", new String[]{"java.lang.String"}, new String[]{"method0x1F"}, false, 5, new String[][]{{"org.jsoup.nodes.FormElement", "previousElementSibling", ""}}), new String[][]{{"isEmpty", "", "4"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
  assertEquals("receiver state after the call", "<{\"a\":1}></{\"a\":1}> {hasParent=false, hasText=false, isBlock=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput282() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.FormElement", "org.jsoup.nodes.FormElement", "nextSibling", new String[]{}, new String[]{}, false, 7, new String[][]{{"org.jsoup.nodes.FormElement", "getElementsMatchingText", "java.lang.String", "name"}, {"org.jsoup.nodes.FormElement", "root", ""}});
  assertNull(actual);
  assertEquals("receiver state after the call", "<x \t y #comment=\"a\"></x \t y> {hasParent=false, hasText=false, isBlock=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput283() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.FormElement", "org.jsoup.nodes.FormElement", "getElementsByAttributeValueMatching", new String[]{"java.lang.String", "java.util.regex.Pattern"}, new String[]{"actiion", "<sample:1>"}, false, 3, new String[][]{{"org.jsoup.nodes.FormElement", "nodelistChanged", ""}});
  assertNotNull(actual);
  assertEquals("org.jsoup.select.Elements", actual.getClass().getName());
  assertEquals("[]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "<<a><b>t</b></a> #comment=\"a\"></<a><b>t</b></a>> {hasParent=false, hasText=false, isBlock=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput284() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.FormElement", "org.jsoup.nodes.FormElement", "nodelistChanged", new String[]{}, new String[]{}, false, 3, new String[][]{});
  assertNull(actual);
  assertEquals("receiver state after the call", "<<a><b>t</b></a> #comment=\"a\"></<a><b>t</b></a>> {hasParent=false, hasText=false, isBlock=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput285() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.FormElement", "org.jsoup.nodes.FormElement", "getElementsByAttributeStarting", new String[]{"java.lang.String"}, new String[]{"POS"}, false, 7, new String[][]{});
  assertNotNull(actual);
  assertEquals("org.jsoup.select.Elements", actual.getClass().getName());
  assertEquals("[]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "<x \t y #comment=\"a\"></x \t y> {hasParent=false, hasText=false, isBlock=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput286() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jsoup.nodes.FormElement", "org.jsoup.nodes.FormElement", "getElementsByAttributeValue", new String[]{"java.lang.String", "java.lang.String"}, new String[]{"/a/b", ""}, false, 0, new String[][]{{"org.jsoup.nodes.FormElement", "addChildren", "org.jsoup.nodes.Node[]", "<empty>"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput287() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.FormElement", "org.jsoup.nodes.FormElement", "getOutputSettings", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.jsoup.nodes.FormElement", "ensureChildNodes", ""}});
  assertNotNull(actual);
  assertEquals("org.jsoup.nodes.Document$OutputSettings", actual.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput288() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.FormElement", "org.jsoup.nodes.FormElement", "cssSelector", new String[]{}, new String[]{}, false, 5, new String[][]{});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("{\"a\"|1}", String.valueOf(actual));
  assertEquals("receiver state after the call", "<{\"a\":1}></{\"a\":1}> {hasParent=false, hasText=false, isBlock=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput289() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.FormElement", "org.jsoup.nodes.FormElement", "outerHtmlTail", new String[]{"java.lang.Appendable", "int", "org.jsoup.nodes.Document$OutputSettings"}, new String[]{"<empty>", "5", "<sample:4>"}, false, 5, new String[][]{});
  assertNull(actual);
  assertEquals("receiver state after the call", "<{\"a\":1}></{\"a\":1}> {hasParent=false, hasText=false, isBlock=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput290() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jsoup.nodes.FormElement", "org.jsoup.nodes.FormElement", "getElementsByAttributeValue", new String[]{"java.lang.String", "java.lang.String"}, new String[]{"PT0H", "5-8"}, false, 5, new String[][]{{"org.jsoup.nodes.FormElement", "insertChildren", "int,org.jsoup.nodes.Node[]", "-13", "<sample:2>"}}), new String[][]{{"listIterator", "int", "0"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IndexOutOfBoundsException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput291() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jsoup.nodes.FormElement", "org.jsoup.nodes.FormElement", "removeClass", new String[]{"java.lang.String"}, new String[]{"]"}, false, 2, new String[][]{{"org.jsoup.nodes.FormElement", "parentNode", ""}}), new String[][]{{"hasSameValue", "java.lang.Object", "6"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput292() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.FormElement", "org.jsoup.nodes.FormElement", "outerHtml", new String[]{}, new String[]{}, false, 3, new String[][]{});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("<<a><b>t</b></a> #comment=\"a\"></<a><b>t</b></a>>", String.valueOf(actual));
  assertEquals("receiver state after the call", "<<a><b>t</b></a> #comment=\"a\"></<a><b>t</b></a>> {hasParent=false, hasText=false, isBlock=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput293() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.FormElement", "org.jsoup.nodes.FormElement", "equals", new String[]{"java.lang.Object"}, new String[]{"<s:ttb>"}, false, 5, new String[][]{{"org.jsoup.nodes.FormElement", "parent", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "<{\"a\":1}></{\"a\":1}> {hasParent=false, hasText=false, isBlock=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput294() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.FormElement", "org.jsoup.nodes.FormElement", "ensureChildNodes", new String[]{}, new String[]{}, false, 7, new String[][]{{"org.jsoup.nodes.FormElement", "clearAttributes", ""}});
  assertNotNull(actual);
  assertEquals("org.jsoup.nodes.Element$NodeList", actual.getClass().getName());
  assertEquals("[]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "<x \t y></x \t y> {hasParent=false, hasText=false, isBlock=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput295() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.FormElement", "org.jsoup.nodes.FormElement", "childNodeSize", new String[]{}, new String[]{}, false, 7, new String[][]{{"org.jsoup.nodes.FormElement", "insertChildren", "int,java.util.Collection", "2147483647", "<sample:2>"}, {"org.jsoup.nodes.FormElement", "addElement", "org.jsoup.nodes.Element", "<sample:4>"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "<x \t y #comment=\"a\"></x \t y> {hasParent=false, hasText=false, isBlock=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput296() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jsoup.nodes.FormElement", "org.jsoup.nodes.FormElement", "attributes", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.jsoup.nodes.FormElement", "getElementsByAttributeValueEnding", "java.lang.String,java.lang.String", "1.1234567890123456", "-0.1on"}}), new String[][]{{"get", "java.lang.String", "5"}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput297() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.FormElement", "org.jsoup.nodes.FormElement", "outerHtmlTail", new String[]{"java.lang.Appendable", "int", "org.jsoup.nodes.Document$OutputSettings"}, new String[]{"<empty>", "53", "<sample:1>"}, false, 7, new String[][]{});
  assertNull(actual);
  assertEquals("receiver state after the call", "<x \t y #comment=\"a\"></x \t y> {hasParent=false, hasText=false, isBlock=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput298() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jsoup.nodes.FormElement", "org.jsoup.nodes.FormElement", "removeAttr", new String[]{"java.lang.String"}, new String[]{"0"}, false, 5, new String[][]{{"org.jsoup.nodes.FormElement", "val", ""}}, 1), new String[][]{{"getElementsMatchingOwnText", "java.util.regex.Pattern", "5"}});
  assertNotNull(actual);
  assertEquals("org.jsoup.select.Elements", actual.getClass().getName());
  assertEquals("[<{\"a\":1}></{\"a\":1}>]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "<{\"a\":1}></{\"a\":1}> {hasParent=false, hasText=false, isBlock=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput299() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.FormElement", "org.jsoup.nodes.FormElement", "html", new String[]{"java.lang.Appendable"}, new String[]{"<sample:3>"}, false, 5, new String[][]{}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.StringBuilder", actual.getClass().getName());
  assertEquals("", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "<{\"a\":1}></{\"a\":1}> {hasParent=false, hasText=false, isBlock=false}", SearchInputFactory_scaffolding.receiverState());
 }
}
