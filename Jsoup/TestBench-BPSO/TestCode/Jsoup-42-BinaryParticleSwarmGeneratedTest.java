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
  try { SearchInputFactory_scaffolding.call("org.jsoup.nodes.FormElement", "org.jsoup.nodes.FormElement", "child", new String[]{"int"}, new String[]{"2147483647"}, false, 1, new String[][]{{"org.jsoup.nodes.FormElement", "append", "java.lang.String", "1.5e"}, {"org.jsoup.nodes.FormElement", "equals", "java.lang.Object", "<i:0>"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput001() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jsoup.nodes.FormElement", "org.jsoup.nodes.FormElement", "data", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.jsoup.nodes.FormElement", "elements", ""}}, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput002() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jsoup.nodes.FormElement", "org.jsoup.nodes.FormElement", "addElement", new String[]{"org.jsoup.nodes.Element"}, new String[]{"<sample:5>"}, false, 5, new String[][]{{"org.jsoup.nodes.FormElement", "appendText", "java.lang.String", "type"}}), new String[][]{{"formData", "", "1"}, {"lastIndexOf", "java.lang.Object", "2"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("-1", String.valueOf(actual));
  assertEquals("receiver state after the call", "<{\"a\":1} comment=\"a\">\n type\n</{\"a\":1}> {hasText=true, isBlock=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput003() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jsoup.nodes.FormElement", "org.jsoup.nodes.FormElement", "formData", new String[]{}, new String[]{}, false, 5, new String[][]{{"org.jsoup.nodes.FormElement", "submit", ""}}, 3), new String[][]{{"isEmpty", "", "5"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
  assertEquals("receiver state after the call", "<{\"a\":1} comment=\"a\"></{\"a\":1}> {hasText=false, isBlock=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput004() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jsoup.nodes.FormElement", "org.jsoup.nodes.FormElement", "className", new String[]{}, new String[]{}, false, 0, null, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput005() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.FormElement", "org.jsoup.nodes.FormElement", "prepend", new String[]{"java.lang.String"}, new String[]{"a,b],c12:30:45"}, false, 3, new String[][]{}, 1);
  assertNotNull(actual);
  assertEquals("org.jsoup.nodes.FormElement", actual.getClass().getName());
  assertEquals("<<a><b>t</b></a> comment=\"a\">\n a,b],c12:30:45\n</<a><b>t</b></a>> {hasText=true, isBlock=false}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "<<a><b>t</b></a> comment=\"a\">\n a,b],c12:30:45\n</<a><b>t</b></a>> {hasText=true, isBlock=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput006() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jsoup.nodes.FormElement", "org.jsoup.nodes.FormElement", "addChildren", new String[]{"org.jsoup.nodes.Node[]"}, new String[]{"<sample:2>"}, false, 0, new String[][]{{"org.jsoup.nodes.FormElement", "attr", "java.lang.String,java.lang.String", "-1", "2010-u01-01"}, {"org.jsoup.nodes.FormElement", "replaceWith", "org.jsoup.nodes.Node", "<sample:8>"}}, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput007() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jsoup.nodes.FormElement", "org.jsoup.nodes.FormElement", "absUrl", new String[]{"java.lang.String"}, new String[]{"<null>"}, false, 3, new String[][]{{"org.jsoup.nodes.FormElement", "outerHtmlHead", "java.lang.StringBuilder,int,org.jsoup.nodes.Document$OutputSettings", "<sample:2>", "1", "<sample:6>"}}, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput008() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jsoup.nodes.FormElement", "org.jsoup.nodes.FormElement", "setBaseUri", new String[]{"java.lang.String"}, new String[]{"257483648"}, false, 0, new String[][]{{"org.jsoup.nodes.FormElement", "toggleClass", "java.lang.String", "type"}}, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput009() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jsoup.nodes.FormElement", "org.jsoup.nodes.FormElement", "prepend", new String[]{"java.lang.String"}, new String[]{"\0101.12345678"}, false, 0, new String[][]{{"org.jsoup.nodes.FormElement", "childNodeSize", ""}}, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput010() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.FormElement", "org.jsoup.nodes.FormElement", "getOutputSettings", new String[]{}, new String[]{}, false, 0, null, 3);
  assertNotNull(actual);
  assertEquals("org.jsoup.nodes.Document$OutputSettings", actual.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput011() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jsoup.nodes.FormElement", "org.jsoup.nodes.FormElement", "prependChild", new String[]{"org.jsoup.nodes.Node"}, new String[]{"<sample:0>"}, false, 0, null, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput012() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.FormElement", "org.jsoup.nodes.FormElement", "childNodes", new String[]{}, new String[]{}, false, 5, new String[][]{{"org.jsoup.nodes.FormElement", "getElementsByAttributeValueEnding", "java.lang.String,java.lang.String", "2020-41-01", "a,b,coption[selected]"}}, 3);
  assertNotNull(actual);
  assertEquals("java.util.Collections$UnmodifiableRandomAccessList", actual.getClass().getName());
  assertEquals("[]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "<{\"a\":1} comment=\"a\"></{\"a\":1}> {hasText=false, isBlock=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput013() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jsoup.nodes.FormElement", "org.jsoup.nodes.FormElement", "after", new String[]{"org.jsoup.nodes.Node"}, new String[]{"<sample:1>"}, false, 1, new String[][]{}, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput014() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jsoup.nodes.FormElement", "org.jsoup.nodes.FormElement", "children", new String[]{}, new String[]{}, false, 0, null, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput015() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jsoup.nodes.FormElement", "org.jsoup.nodes.FormElement", "submit", new String[]{}, new String[]{}, false, 3, new String[][]{{"org.jsoup.nodes.FormElement", "getElementsByIndexGreaterThan", "int", "2147483647"}}, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput016() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.FormElement", "org.jsoup.nodes.FormElement", "hasAttr", new String[]{"java.lang.String"}, new String[]{"1.25"}, false, 3, new String[][]{}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "<<a><b>t</b></a> comment=\"a\"></<a><b>t</b></a>> {hasText=false, isBlock=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput017() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jsoup.nodes.FormElement", "org.jsoup.nodes.FormElement", "getElementsByAttributeValue", new String[]{"java.lang.String", "java.lang.String"}, new String[]{"al,b],c112:30:45", "12020-\r02-30T25:61:61"}, false, 0, new String[][]{{"org.jsoup.nodes.FormElement", "getElementsMatchingText", "java.util.regex.Pattern", "<sample:2>"}}, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput018() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jsoup.nodes.FormElement", "org.jsoup.nodes.FormElement", "getElementsMatchingText", new String[]{"java.lang.String"}, new String[]{"12:30:55"}, false, 5, new String[][]{}, 1), new String[][]{{"last", "", "5"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "<{\"a\":1} comment=\"a\"></{\"a\":1}> {hasText=false, isBlock=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput019() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jsoup.nodes.FormElement", "org.jsoup.nodes.FormElement", "removeChild", new String[]{"org.jsoup.nodes.Node"}, new String[]{"<sample:6>"}, false, 0, new String[][]{{"org.jsoup.nodes.FormElement", "ownerDocument", ""}}, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput020() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.FormElement", "org.jsoup.nodes.FormElement", "setSiblingIndex", new String[]{"int"}, new String[]{"268435466"}, false, 5, new String[][]{{"org.jsoup.nodes.FormElement", "elements", ""}}, 1);
  assertNull(actual);
  assertEquals("receiver state after the call", "<{\"a\":1} comment=\"a\"></{\"a\":1}> {hasText=false, isBlock=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput021() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.FormElement", "org.jsoup.nodes.FormElement", "getElementsMatchingOwnText", new String[]{"java.lang.String"}, new String[]{""}, false, 5, new String[][]{}, 1);
  assertNotNull(actual);
  assertEquals("org.jsoup.select.Elements", actual.getClass().getName());
  assertEquals("[<{\"a\":1} comment=\"a\"></{\"a\":1}>]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "<{\"a\":1} comment=\"a\"></{\"a\":1}> {hasText=false, isBlock=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput022() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.FormElement", "org.jsoup.nodes.FormElement", "previousSibling", new String[]{}, new String[]{}, false, 1, new String[][]{{"org.jsoup.nodes.FormElement", "id", ""}}, 1);
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput023() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.FormElement", "org.jsoup.nodes.FormElement", "clone", new String[]{}, new String[]{}, false, 3, new String[][]{{"org.jsoup.nodes.FormElement", "submit", ""}}, 1);
  assertNotNull(actual);
  assertEquals("org.jsoup.nodes.FormElement", actual.getClass().getName());
  assertEquals("<<a><b>t</b></a> comment=\"a\"></<a><b>t</b></a>> {hasText=false, isBlock=false}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "<<a><b>t</b></a> comment=\"a\"></<a><b>t</b></a>> {hasText=false, isBlock=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput024() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jsoup.nodes.FormElement", "org.jsoup.nodes.FormElement", "attr", new String[]{"java.lang.String"}, new String[]{"1.4d"}, false, 0, null, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput025() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jsoup.nodes.FormElement", "org.jsoup.nodes.FormElement", "data", new String[]{}, new String[]{}, false, 1, new String[][]{{"org.jsoup.nodes.FormElement", "clone", ""}}, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput026() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.FormElement", "org.jsoup.nodes.FormElement", "attr", new String[]{"java.lang.String"}, new String[]{"a,b,c{\"a\":1}"}, false, 5, new String[][]{}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("", String.valueOf(actual));
  assertEquals("receiver state after the call", "<{\"a\":1} comment=\"a\"></{\"a\":1}> {hasText=false, isBlock=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput027() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.FormElement", "org.jsoup.nodes.FormElement", "nextSibling", new String[]{}, new String[]{}, false, 3, new String[][]{}, 1);
  assertNull(actual);
  assertEquals("receiver state after the call", "<<a><b>t</b></a> comment=\"a\"></<a><b>t</b></a>> {hasText=false, isBlock=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput028() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jsoup.nodes.FormElement", "org.jsoup.nodes.FormElement", "appendElement", new String[]{"java.lang.String"}, new String[]{"\037"}, false, 3, new String[][]{{"org.jsoup.nodes.FormElement", "submit", ""}}, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput029() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.FormElement", "org.jsoup.nodes.FormElement", "hashCode", new String[]{}, new String[]{}, false, 3, new String[][]{}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("-489074929", String.valueOf(actual));
  assertEquals("receiver state after the call", "<<a><b>t</b></a> comment=\"a\"></<a><b>t</b></a>> {hasText=false, isBlock=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput030() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.FormElement", "org.jsoup.nodes.FormElement", "getElementsByAttributeValue", new String[]{"java.lang.String", "java.lang.String"}, new String[]{"aaaaaaaaaaaaaaaLaaaaaaaaaaaaaaa", "-1.5{\"a\":1}"}, false, 5, new String[][]{{"org.jsoup.nodes.FormElement", "submit", ""}}, 3);
  assertNotNull(actual);
  assertEquals("org.jsoup.select.Elements", actual.getClass().getName());
  assertEquals("[]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "<{\"a\":1} comment=\"a\"></{\"a\":1}> {hasText=false, isBlock=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput031() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.FormElement", "org.jsoup.nodes.FormElement", "addChildren", new String[]{"org.jsoup.nodes.Node[]"}, new String[]{"<sample:1>"}, false, 5, new String[][]{{"org.jsoup.nodes.FormElement", "id", ""}}, 3);
  assertNull(actual);
  assertEquals("receiver state after the call", "<{\"a\":1} comment=\"a\">\n <#root></#root><!DOCTYPE a PUBLIC \"0\" \"sample\">\n</{\"a\":1}> {hasText=false, isBlock=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput032() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jsoup.nodes.FormElement", "org.jsoup.nodes.FormElement", "text", new String[]{}, new String[]{}, false, 0, null, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput033() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jsoup.nodes.FormElement", "org.jsoup.nodes.FormElement", "getElementsByClass", new String[]{"java.lang.String"}, new String[]{"1.251E-5"}, false, 0, null, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput034() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.FormElement", "org.jsoup.nodes.FormElement", "cssSelector", new String[]{}, new String[]{}, false, 3, new String[][]{{"org.jsoup.nodes.FormElement", "getElementsByIndexEquals", "int", "1"}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("<a><b>t</b></a>", String.valueOf(actual));
  assertEquals("receiver state after the call", "<<a><b>t</b></a> comment=\"a\"></<a><b>t</b></a>> {hasText=false, isBlock=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput035() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jsoup.nodes.FormElement", "org.jsoup.nodes.FormElement", "hasAttr", new String[]{"java.lang.String"}, new String[]{""}, false, 6, new String[][]{{"org.jsoup.nodes.FormElement", "getElementsByClass", "java.lang.String", "x1,3]"}}, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput036() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.FormElement", "org.jsoup.nodes.FormElement", "prependElement", new String[]{"java.lang.String"}, new String[]{"0100x133456789"}, false, 3, new String[][]{{"org.jsoup.nodes.FormElement", "getElementsContainingText", "java.lang.String", "1.m5S"}}, 1);
  assertNotNull(actual);
  assertEquals("org.jsoup.nodes.Element", actual.getClass().getName());
  assertEquals("<0100x133456789></0100x133456789> {hasText=false, isBlock=false}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "<<a><b>t</b></a> comment=\"a\">\n <0100x133456789></0100x133456789>\n</<a><b>t</b></a>> {hasText=false, isBlock=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput037() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.FormElement", "org.jsoup.nodes.FormElement", "addChildren", new String[]{"org.jsoup.nodes.Node[]"}, new String[]{"<empty>"}, false, 7, new String[][]{{"org.jsoup.nodes.FormElement", "toggleClass", "java.lang.String", "5"}}, 3);
  assertNull(actual);
  assertEquals("receiver state after the call", "<x \t y comment=\"a\" class=\"5\"></x \t y> {hasText=false, isBlock=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput038() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.FormElement", "org.jsoup.nodes.FormElement", "hasClass", new String[]{"java.lang.String"}, new String[]{"nubll"}, false, 3, new String[][]{}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "<<a><b>t</b></a> comment=\"a\"></<a><b>t</b></a>> {hasText=false, isBlock=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput039() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.FormElement", "org.jsoup.nodes.FormElement", "className", new String[]{}, new String[]{}, false, 3, new String[][]{}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("", String.valueOf(actual));
  assertEquals("receiver state after the call", "<<a><b>t</b></a> comment=\"a\"></<a><b>t</b></a>> {hasText=false, isBlock=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput040() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.FormElement", "org.jsoup.nodes.FormElement", "childNodeSize", new String[]{}, new String[]{}, false, 3, new String[][]{{"org.jsoup.nodes.FormElement", "html", ""}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "<<a><b>t</b></a> comment=\"a\"></<a><b>t</b></a>> {hasText=false, isBlock=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput041() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jsoup.nodes.FormElement", "org.jsoup.nodes.FormElement", "after", new String[]{"java.lang.String"}, new String[]{"1.02345678901234567<a>b</a>"}, false, 7, new String[][]{{"org.jsoup.nodes.FormElement", "toggleClass", "java.lang.String", "1.5e300"}}, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput042() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jsoup.nodes.FormElement", "org.jsoup.nodes.FormElement", "appendElement", new String[]{"java.lang.String"}, new String[]{"checked1E-5"}, false, 1, new String[][]{}, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput043() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.FormElement", "org.jsoup.nodes.FormElement", "select", new String[]{"java.lang.String"}, new String[]{"1.5eaction010"}, false, 3, new String[][]{{"org.jsoup.nodes.FormElement", "remove", ""}}, 2);
  assertNotNull(actual);
  assertEquals("org.jsoup.select.Elements", actual.getClass().getName());
  assertEquals("[]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "<<a><b>t</b></a> comment=\"a\"></<a><b>t</b></a>> {hasText=false, isBlock=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput044() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jsoup.nodes.FormElement", "org.jsoup.nodes.FormElement", "removeChild", new String[]{"org.jsoup.nodes.Node"}, new String[]{"<sample:5>"}, false, 0, null, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput045() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.FormElement", "org.jsoup.nodes.FormElement", "className", new String[]{}, new String[]{}, false, 7, new String[][]{}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("", String.valueOf(actual));
  assertEquals("receiver state after the call", "<x \t y comment=\"a\"></x \t y> {hasText=false, isBlock=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput046() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jsoup.nodes.FormElement", "org.jsoup.nodes.FormElement", "wrap", new String[]{"java.lang.String"}, new String[]{"1.1234567"}, false, 2, new String[][]{{"org.jsoup.nodes.FormElement", "ownerDocument", ""}}, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput047() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.FormElement", "org.jsoup.nodes.FormElement", "baseUri", new String[]{}, new String[]{}, false, 1, new String[][]{{"org.jsoup.nodes.FormElement", "tagName", ""}}, 1);
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput048() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.FormElement", "org.jsoup.nodes.FormElement", "isBlock", new String[]{}, new String[]{}, false, 3, new String[][]{{"org.jsoup.nodes.FormElement", "prependChild", "org.jsoup.nodes.Node", "<null>"}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "<<a><b>t</b></a> comment=\"a\"></<a><b>t</b></a>> {hasText=false, isBlock=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput049() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jsoup.nodes.FormElement", "org.jsoup.nodes.FormElement", "absUrl", new String[]{"java.lang.String"}, new String[]{"1Bf10"}, false, 6, new String[][]{{"org.jsoup.nodes.FormElement", "getElementsMatchingOwnText", "java.lang.String", "1.123456789a1234557"}, {"org.jsoup.nodes.FormElement", "submit", ""}}, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput050() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jsoup.nodes.FormElement", "org.jsoup.nodes.FormElement", "childNode", new String[]{"int"}, new String[]{"42"}, false, 0, new String[][]{{"org.jsoup.nodes.FormElement", "toString", ""}}, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput051() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.FormElement", "org.jsoup.nodes.FormElement", "attr", new String[]{"java.lang.String"}, new String[]{"1.1i345678"}, false, 3, new String[][]{{"org.jsoup.nodes.FormElement", "childNodesAsArray", ""}, {"org.jsoup.nodes.FormElement", "className", ""}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("", String.valueOf(actual));
  assertEquals("receiver state after the call", "<<a><b>t</b></a> comment=\"a\"></<a><b>t</b></a>> {hasText=false, isBlock=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput052() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.FormElement", "org.jsoup.nodes.FormElement", "getOutputSettings", new String[]{}, new String[]{}, false, 7, new String[][]{}, 3);
  assertNotNull(actual);
  assertEquals("org.jsoup.nodes.Document$OutputSettings", actual.getClass().getName());
  assertEquals("receiver state after the call", "<x \t y comment=\"a\"></x \t y> {hasText=false, isBlock=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput053() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jsoup.nodes.FormElement", "org.jsoup.nodes.FormElement", "addChildren", new String[]{"int", "org.jsoup.nodes.Node[]"}, new String[]{"9", "<null>"}, false, 0, null, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput054() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jsoup.nodes.FormElement", "org.jsoup.nodes.FormElement", "removeAttr", new String[]{"java.lang.String"}, new String[]{"chekedPT1H"}, false, 5, new String[][]{}, 3), new String[][]{{"getElementsByAttribute", "java.lang.String", "2"}, {"attr", "java.lang.String,java.lang.String", "4"}});
  assertNotNull(actual);
  assertEquals("org.jsoup.select.Elements", actual.getClass().getName());
  assertEquals("[]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "<{\"a\":1} comment=\"a\"></{\"a\":1}> {hasText=false, isBlock=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput055() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jsoup.nodes.FormElement", "org.jsoup.nodes.FormElement", "classNames", new String[]{"java.util.Set"}, new String[]{"<sample:1>"}, false, 0, null, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput056() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jsoup.nodes.FormElement", "org.jsoup.nodes.FormElement", "getElementsByClass", new String[]{"java.lang.String"}, new String[]{"on"}, false, 2, new String[][]{}, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput057() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.FormElement", "org.jsoup.nodes.FormElement", "toString", new String[]{}, new String[]{}, false, 3, new String[][]{}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("<<a><b>t</b></a> comment=\"a\"></<a><b>t</b></a>>", String.valueOf(actual));
  assertEquals("receiver state after the call", "<<a><b>t</b></a> comment=\"a\"></<a><b>t</b></a>> {hasText=false, isBlock=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput058() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.FormElement", "org.jsoup.nodes.FormElement", "html", new String[]{}, new String[]{}, false, 3, new String[][]{{"org.jsoup.nodes.FormElement", "getElementsByAttributeStarting", "java.lang.String", "0x123456789[1,2]"}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("", String.valueOf(actual));
  assertEquals("receiver state after the call", "<<a><b>t</b></a> comment=\"a\"></<a><b>t</b></a>> {hasText=false, isBlock=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput059() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jsoup.nodes.FormElement", "org.jsoup.nodes.FormElement", "dataNodes", new String[]{}, new String[]{}, false, 5, new String[][]{}, 1), new String[][]{{"remove", "java.lang.Object", "6"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.UnsupportedOperationException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput060() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.FormElement", "org.jsoup.nodes.FormElement", "previousElementSibling", new String[]{}, new String[]{}, false, 7, new String[][]{}, 1);
  assertNull(actual);
  assertEquals("receiver state after the call", "<x \t y comment=\"a\"></x \t y> {hasText=false, isBlock=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput061() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jsoup.nodes.FormElement", "org.jsoup.nodes.FormElement", "getElementsMatchingText", new String[]{"java.lang.String"}, new String[]{"-\t.5TITLE"}, false, 0, null, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput062() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.FormElement", "org.jsoup.nodes.FormElement", "parentNode", new String[]{}, new String[]{}, false, 6, new String[][]{}, 2);
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput063() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.FormElement", "org.jsoup.nodes.FormElement", "attributes", new String[]{}, new String[]{}, false, 4, new String[][]{{"org.jsoup.nodes.FormElement", "after", "org.jsoup.nodes.Node", "<sample:7>"}, {"org.jsoup.nodes.FormElement", "submit", ""}}, 2);
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput064() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jsoup.nodes.FormElement", "org.jsoup.nodes.FormElement", "getElementsByIndexEquals", new String[]{"int"}, new String[]{"0"}, false, 1, new String[][]{{"org.jsoup.nodes.FormElement", "attr", "java.lang.String", "0E1.1234567890123456"}}, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput065() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.FormElement", "org.jsoup.nodes.FormElement", "previousSibling", new String[]{}, new String[]{}, false, 2, new String[][]{{"org.jsoup.nodes.FormElement", "nextElementSibling", ""}}, 3);
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput066() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jsoup.nodes.FormElement", "org.jsoup.nodes.FormElement", "submit", new String[]{}, new String[]{}, false, 4, new String[][]{{"org.jsoup.nodes.FormElement", "baseUri", ""}, {"org.jsoup.nodes.FormElement", "parents", ""}}, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput067() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jsoup.nodes.FormElement", "org.jsoup.nodes.FormElement", "getElementsContainingOwnText", new String[]{"java.lang.String"}, new String[]{"tu"}, false, 7, new String[][]{}, 1), new String[][]{{"remove", "java.lang.Object", "4"}, {"containsAll", "java.util.Collection", "5"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "<x \t y comment=\"a\"></x \t y> {hasText=false, isBlock=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput068() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jsoup.nodes.FormElement", "org.jsoup.nodes.FormElement", "firstElementSibling", new String[]{}, new String[]{}, false, 3, new String[][]{{"org.jsoup.nodes.FormElement", "hasText", ""}}, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput069() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.FormElement", "org.jsoup.nodes.FormElement", "getElementsByIndexEquals", new String[]{"int"}, new String[]{"5"}, false, 3, new String[][]{{"org.jsoup.nodes.FormElement", "getElementsByIndexGreaterThan", "int", "0"}}, 1);
  assertNotNull(actual);
  assertEquals("org.jsoup.select.Elements", actual.getClass().getName());
  assertEquals("[]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "<<a><b>t</b></a> comment=\"a\"></<a><b>t</b></a>> {hasText=false, isBlock=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput070() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jsoup.nodes.FormElement", "org.jsoup.nodes.FormElement", "getElementsContainingOwnText", new String[]{"java.lang.String"}, new String[]{"/a"}, false, 0, new String[][]{{"org.jsoup.nodes.FormElement", "hashCode", ""}}, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput071() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jsoup.nodes.FormElement", "org.jsoup.nodes.FormElement", "hasClass", new String[]{"java.lang.String"}, new String[]{"11"}, false, 2, new String[][]{{"org.jsoup.nodes.FormElement", "clone", ""}}, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput072() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jsoup.nodes.FormElement", "org.jsoup.nodes.FormElement", "after", new String[]{"java.lang.String"}, new String[]{"-1"}, false, 4, new String[][]{{"org.jsoup.nodes.FormElement", "children", ""}}, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput073() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jsoup.nodes.FormElement", "org.jsoup.nodes.FormElement", "getElementsByAttributeValueEnding", new String[]{"java.lang.String", "java.lang.String"}, new String[]{".50x123456789", "/a/b"}, false, 1, new String[][]{{"org.jsoup.nodes.FormElement", "getElementsContainingText", "java.lang.String", "Hello, Worldon"}}, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput074() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jsoup.nodes.FormElement", "org.jsoup.nodes.FormElement", "dataset", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.jsoup.nodes.FormElement", "nextSibling", ""}}, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput075() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.FormElement", "org.jsoup.nodes.FormElement", "classNames", new String[]{"java.util.Set"}, new String[]{"<empty>"}, false, 3, new String[][]{{"org.jsoup.nodes.FormElement", "childNodeSize", ""}}, 1);
  assertNotNull(actual);
  assertEquals("org.jsoup.nodes.FormElement", actual.getClass().getName());
  assertEquals("<<a><b>t</b></a> comment=\"a\" class=\"\"></<a><b>t</b></a>> {hasText=false, isBlock=false}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "<<a><b>t</b></a> comment=\"a\" class=\"\"></<a><b>t</b></a>> {hasText=false, isBlock=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput076() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.FormElement", "org.jsoup.nodes.FormElement", "addChildren", new String[]{"org.jsoup.nodes.Node[]"}, new String[]{"<sample:0>"}, false, 5, new String[][]{}, 3);
  assertNull(actual);
  assertEquals("receiver state after the call", "<{\"a\":1} comment=\"a\">a\n</{\"a\":1}> {hasText=false, isBlock=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput077() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.FormElement", "org.jsoup.nodes.FormElement", "className", new String[]{}, new String[]{}, false, 5, new String[][]{{"org.jsoup.nodes.FormElement", "setParentNode", "org.jsoup.nodes.Node", "<null>"}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("", String.valueOf(actual));
  assertEquals("receiver state after the call", "<{\"a\":1} comment=\"a\"></{\"a\":1}> {hasText=false, isBlock=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput078() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.FormElement", "org.jsoup.nodes.FormElement", "appendElement", new String[]{"java.lang.String"}, new String[]{"1.5ee300"}, false, 3, new String[][]{}, 3);
  assertNotNull(actual);
  assertEquals("org.jsoup.nodes.Element", actual.getClass().getName());
  assertEquals("<1.5ee300></1.5ee300> {hasText=false, isBlock=false}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "<<a><b>t</b></a> comment=\"a\">\n <1.5ee300></1.5ee300>\n</<a><b>t</b></a>> {hasText=false, isBlock=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput079() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.FormElement", "org.jsoup.nodes.FormElement", "previousSibling", new String[]{}, new String[]{}, false);
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput080() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.FormElement", "org.jsoup.nodes.FormElement", "indent", new String[]{"java.lang.StringBuilder", "int", "org.jsoup.nodes.Document$OutputSettings"}, new String[]{"<sample:3>", "1", "<sample:2>"}, false, 0, new String[][]{{"org.jsoup.nodes.FormElement", "select", "java.lang.String", ">.5d"}, {"org.jsoup.nodes.FormElement", "hasText", ""}});
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput081() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.FormElement", "org.jsoup.nodes.FormElement", "tag", new String[]{}, new String[]{}, false);
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput082() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jsoup.nodes.FormElement", "org.jsoup.nodes.FormElement", "prependChild", new String[]{"org.jsoup.nodes.Node"}, new String[]{"<sample:1>"}, false, 4, new String[][]{{"org.jsoup.nodes.FormElement", "addChildren", "org.jsoup.nodes.Node[]", "<sample:6>"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput083() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jsoup.nodes.FormElement", "org.jsoup.nodes.FormElement", "addChildren", new String[]{"int", "org.jsoup.nodes.Node[]"}, new String[]{"257", "<null>"}, false); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput084() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jsoup.nodes.FormElement", "org.jsoup.nodes.FormElement", "absUrl", new String[]{"java.lang.String"}, new String[]{"1.12345567radio"}, false); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput085() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jsoup.nodes.FormElement", "org.jsoup.nodes.FormElement", "prepend", new String[]{"java.lang.String"}, new String[]{"method"}, false, 4, new String[][]{}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput086() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jsoup.nodes.FormElement", "org.jsoup.nodes.FormElement", "removeChild", new String[]{"org.jsoup.nodes.Node"}, new String[]{"<sample:6>"}, false, 2, new String[][]{{"org.jsoup.nodes.FormElement", "hasClass", "java.lang.String", "1.12345677890123456"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput087() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jsoup.nodes.FormElement", "org.jsoup.nodes.FormElement", "data", new String[]{}, new String[]{}, false); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput088() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jsoup.nodes.FormElement", "org.jsoup.nodes.FormElement", "className", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.jsoup.nodes.FormElement", "classNames", ""}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput089() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jsoup.nodes.FormElement", "org.jsoup.nodes.FormElement", "getElementsContainingText", new String[]{"java.lang.String"}, new String[]{"+1.5"}, false); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput090() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.FormElement", "org.jsoup.nodes.FormElement", "parents", new String[]{}, new String[]{}, false, 3, new String[][]{});
  assertNotNull(actual);
  assertEquals("org.jsoup.select.Elements", actual.getClass().getName());
  assertEquals("[]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "<<a><b>t</b></a> comment=\"a\"></<a><b>t</b></a>> {hasText=false, isBlock=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput091() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.FormElement", "org.jsoup.nodes.FormElement", "setSiblingIndex", new String[]{"int"}, new String[]{"-2147483648"}, false, 0, new String[][]{{"org.jsoup.nodes.FormElement", "removeAttr", "java.lang.String", "checked"}});
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput092() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jsoup.nodes.FormElement", "org.jsoup.nodes.FormElement", "dataset", new String[]{}, new String[]{}, false, 2, new String[][]{}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput093() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.FormElement", "org.jsoup.nodes.FormElement", "prependText", new String[]{"java.lang.String"}, new String[]{"5"}, false, 5, new String[][]{});
  assertNotNull(actual);
  assertEquals("org.jsoup.nodes.FormElement", actual.getClass().getName());
  assertEquals("<{\"a\":1} comment=\"a\">\n 5\n</{\"a\":1}> {hasText=true, isBlock=false}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "<{\"a\":1} comment=\"a\">\n 5\n</{\"a\":1}> {hasText=true, isBlock=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput094() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.FormElement", "org.jsoup.nodes.FormElement", "doClone", new String[]{"org.jsoup.nodes.Node"}, new String[]{"<sample:8>"}, false, 5, new String[][]{});
  assertNotNull(actual);
  assertEquals("org.jsoup.nodes.FormElement", actual.getClass().getName());
  assertEquals("<{\"a\":1} comment=\"a\"></{\"a\":1}> {hasText=false, isBlock=false}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "<{\"a\":1} comment=\"a\"></{\"a\":1}> {hasText=false, isBlock=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput095() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jsoup.nodes.FormElement", "org.jsoup.nodes.FormElement", "wrap", new String[]{"java.lang.String"}, new String[]{"1. 2345678901234567"}, false, 3, new String[][]{}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput096() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.FormElement", "org.jsoup.nodes.FormElement", "appendText", new String[]{"java.lang.String"}, new String[]{"1.5e30012:30:4"}, false, 7, new String[][]{});
  assertNotNull(actual);
  assertEquals("org.jsoup.nodes.FormElement", actual.getClass().getName());
  assertEquals("<x \t y comment=\"a\">\n 1.5e30012:30:4\n</x \t y> {hasText=true, isBlock=false}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "<x \t y comment=\"a\">\n 1.5e30012:30:4\n</x \t y> {hasText=true, isBlock=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput097() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jsoup.nodes.FormElement", "org.jsoup.nodes.FormElement", "appendChild", new String[]{"org.jsoup.nodes.Node"}, new String[]{"<sample:0>"}, false); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput098() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.FormElement", "org.jsoup.nodes.FormElement", "getOutputSettings", new String[]{}, new String[]{}, false);
  assertNotNull(actual);
  assertEquals("org.jsoup.nodes.Document$OutputSettings", actual.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput099() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.FormElement", "org.jsoup.nodes.FormElement", "elementSiblingIndex", new String[]{}, new String[]{}, false);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput100() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.FormElement", "org.jsoup.nodes.FormElement", "getElementsContainingOwnText", new String[]{"java.lang.String"}, new String[]{"checkbox"}, false, 3, new String[][]{{"org.jsoup.nodes.FormElement", "before", "java.lang.String", "y1LPOST"}, {"org.jsoup.nodes.FormElement", "submit", ""}});
  assertNotNull(actual);
  assertEquals("org.jsoup.select.Elements", actual.getClass().getName());
  assertEquals("[]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "<<a><b>t</b></a> comment=\"a\"></<a><b>t</b></a>> {hasText=false, isBlock=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput101() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jsoup.nodes.FormElement", "org.jsoup.nodes.FormElement", "outerHtml", new String[]{"java.lang.StringBuilder"}, new String[]{"<sample:1>"}, false); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput102() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jsoup.nodes.FormElement", "org.jsoup.nodes.FormElement", "isBlock", new String[]{}, new String[]{}, false, 6, new String[][]{{"org.jsoup.nodes.FormElement", "after", "java.lang.String", "pption[selected]"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput103() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.FormElement", "org.jsoup.nodes.FormElement", "tagName", new String[]{"java.lang.String"}, new String[]{"`cxion"}, false);
  assertNotNull(actual);
  assertEquals("org.jsoup.nodes.FormElement", actual.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput104() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.FormElement", "org.jsoup.nodes.FormElement", "tag", new String[]{}, new String[]{}, false, 5, new String[][]{});
  assertNotNull(actual);
  assertEquals("org.jsoup.parser.Tag", actual.getClass().getName());
  assertEquals("{\"a\":1} {canContainBlock=true, getName={\"a\":1}, isBlock=false, isData=false, isEmpty=false, isFormListed=false, isFormSubmittable=false, isInline=true, isKnownTag=false, isSelfClosing=false}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "<{\"a\":1} comment=\"a\"></{\"a\":1}> {hasText=false, isBlock=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput105() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jsoup.nodes.FormElement", "org.jsoup.nodes.FormElement", "addClass", new String[]{"java.lang.String"}, new String[]{"1a/b"}, false, 6, new String[][]{{"org.jsoup.nodes.FormElement", "baseUri", ""}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput106() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jsoup.nodes.FormElement", "org.jsoup.nodes.FormElement", "val", new String[]{}, new String[]{}, false); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput107() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.FormElement", "org.jsoup.nodes.FormElement", "removeAttr", new String[]{"java.lang.String"}, new String[]{"ciecked"}, false, 5, new String[][]{});
  assertNotNull(actual);
  assertEquals("org.jsoup.nodes.FormElement", actual.getClass().getName());
  assertEquals("<{\"a\":1} comment=\"a\"></{\"a\":1}> {hasText=false, isBlock=false}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "<{\"a\":1} comment=\"a\"></{\"a\":1}> {hasText=false, isBlock=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput108() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jsoup.nodes.FormElement", "org.jsoup.nodes.FormElement", "html", new String[]{"java.lang.String"}, new String[]{"1E-5"}, false, 0, new String[][]{{"org.jsoup.nodes.FormElement", "outerHtml", ""}, {"org.jsoup.nodes.FormElement", "select", "java.lang.String", "htt://example.com/a?b=c"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput109() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jsoup.nodes.FormElement", "org.jsoup.nodes.FormElement", "after", new String[]{"java.lang.String"}, new String[]{"actiom"}, false, 5, new String[][]{}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput110() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jsoup.nodes.FormElement", "org.jsoup.nodes.FormElement", "addChildren", new String[]{"org.jsoup.nodes.Node[]"}, new String[]{"<sample:0>"}, false); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput111() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jsoup.nodes.FormElement", "org.jsoup.nodes.FormElement", "childNodesAsArray", new String[]{}, new String[]{}, false); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput112() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jsoup.nodes.FormElement", "org.jsoup.nodes.FormElement", "child", new String[]{"int"}, new String[]{"5"}, false, 3, new String[][]{{"org.jsoup.nodes.FormElement", "toString", ""}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IndexOutOfBoundsException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput113() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jsoup.nodes.FormElement", "org.jsoup.nodes.FormElement", "addElement", new String[]{"org.jsoup.nodes.Element"}, new String[]{"<null>"}, false, 1, new String[][]{{"org.jsoup.nodes.FormElement", "toggleClass", "java.lang.String", ""}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput114() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.FormElement", "org.jsoup.nodes.FormElement", "getElementsByIndexGreaterThan", new String[]{"int"}, new String[]{"-2146435072"}, false, 7, new String[][]{{"org.jsoup.nodes.FormElement", "getElementsContainingText", "java.lang.String", "aub"}, {"org.jsoup.nodes.FormElement", "dataNodes", ""}});
  assertNotNull(actual);
  assertEquals("org.jsoup.select.Elements", actual.getClass().getName());
  assertEquals("[<x \t y comment=\"a\"></x \t y>]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "<x \t y comment=\"a\"></x \t y> {hasText=false, isBlock=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput115() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jsoup.nodes.FormElement", "org.jsoup.nodes.FormElement", "children", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.jsoup.nodes.FormElement", "addClass", "java.lang.String", "1.5gTITLE"}, {"org.jsoup.nodes.FormElement", "getElementsByAttributeValueNot", "java.lang.String,java.lang.String", "", "Tiue"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput116() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jsoup.nodes.FormElement", "org.jsoup.nodes.FormElement", "indent", new String[]{"java.lang.StringBuilder", "int", "org.jsoup.nodes.Document$OutputSettings"}, new String[]{"<null>", "-2147483648", "<sample:9>"}, false, 0, new String[][]{{"org.jsoup.nodes.FormElement", "doClone", "org.jsoup.nodes.Node", "<sample:3>"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput117() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.FormElement", "org.jsoup.nodes.FormElement", "toString", new String[]{}, new String[]{}, false, 7, new String[][]{});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("<x \t y comment=\"a\"></x \t y>", String.valueOf(actual));
  assertEquals("receiver state after the call", "<x \t y comment=\"a\"></x \t y> {hasText=false, isBlock=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput118() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.FormElement", "org.jsoup.nodes.FormElement", "getElementsByAttributeValueMatching", new String[]{"java.lang.String", "java.util.regex.Pattern"}, new String[]{"disabledchecked", "<sample:3>"}, false, 5, new String[][]{});
  assertNotNull(actual);
  assertEquals("org.jsoup.select.Elements", actual.getClass().getName());
  assertEquals("[]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "<{\"a\":1} comment=\"a\"></{\"a\":1}> {hasText=false, isBlock=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput119() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jsoup.nodes.FormElement", "org.jsoup.nodes.FormElement", "childNode", new String[]{"int"}, new String[]{"-2147483648"}, false, 1, new String[][]{{"org.jsoup.nodes.FormElement", "addClass", "java.lang.String", "{\"b\":1}\n"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput120() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jsoup.nodes.FormElement", "org.jsoup.nodes.FormElement", "getElementsByAttribute", new String[]{"java.lang.String"}, new String[]{"\"a\":1}"}, false, 2, new String[][]{{"org.jsoup.nodes.FormElement", "text", ""}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput121() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jsoup.nodes.FormElement", "org.jsoup.nodes.FormElement", "prependElement", new String[]{"java.lang.String"}, new String[]{"1L"}, false); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput122() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jsoup.nodes.FormElement", "org.jsoup.nodes.FormElement", "insertChildren", new String[]{"int", "java.util.Collection"}, new String[]{"2147483647", "<sample:0>"}, false, 1, new String[][]{{"org.jsoup.nodes.FormElement", "attributes", ""}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput123() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.FormElement", "org.jsoup.nodes.FormElement", "nextElementSibling", new String[]{}, new String[]{}, false, 1, new String[][]{});
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput124() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jsoup.nodes.FormElement", "org.jsoup.nodes.FormElement", "getElementsByAttributeValueNot", new String[]{"java.lang.String", "java.lang.String"}, new String[]{"0", "."}, false); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput125() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jsoup.nodes.FormElement", "org.jsoup.nodes.FormElement", "before", new String[]{"org.jsoup.nodes.Node"}, new String[]{"<sample:4>"}, false); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput126() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.FormElement", "org.jsoup.nodes.FormElement", "hasClass", new String[]{"java.lang.String"}, new String[]{"action0x123456789"}, false, 3, new String[][]{{"org.jsoup.nodes.FormElement", "html", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "<<a><b>t</b></a> comment=\"a\"></<a><b>t</b></a>> {hasText=false, isBlock=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput127() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.FormElement", "org.jsoup.nodes.FormElement", "addElement", new String[]{"org.jsoup.nodes.Element"}, new String[]{"<sample:5>"}, false, 5, new String[][]{{"org.jsoup.nodes.FormElement", "childNodesAsArray", ""}});
  assertNotNull(actual);
  assertEquals("org.jsoup.nodes.FormElement", actual.getClass().getName());
  assertEquals("<{\"a\":1} comment=\"a\"></{\"a\":1}> {hasText=false, isBlock=false}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "<{\"a\":1} comment=\"a\"></{\"a\":1}> {hasText=false, isBlock=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput128() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jsoup.nodes.FormElement", "org.jsoup.nodes.FormElement", "getAllElements", new String[]{}, new String[]{}, false, 6, new String[][]{{"org.jsoup.nodes.FormElement", "textNodes", ""}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput129() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.FormElement", "org.jsoup.nodes.FormElement", "getAllElements", new String[]{}, new String[]{}, false, 5, new String[][]{{"org.jsoup.nodes.FormElement", "toggleClass", "java.lang.String", "\t"}});
  assertNotNull(actual);
  assertEquals("org.jsoup.select.Elements", actual.getClass().getName());
  assertEquals("[<{\"a\":1} comment=\"a\" class=\"\t\"></{\"a\":1}>]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "<{\"a\":1} comment=\"a\" class=\"\t\"></{\"a\":1}> {hasText=false, isBlock=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput130() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.FormElement", "org.jsoup.nodes.FormElement", "getElementsMatchingText", new String[]{"java.lang.String"}, new String[]{"heckbox"}, false, 7, new String[][]{{"org.jsoup.nodes.FormElement", "setBaseUri", "java.lang.String", "/a.b"}, {"org.jsoup.nodes.FormElement", "addClass", "java.lang.String", "XIULE"}});
  assertNotNull(actual);
  assertEquals("org.jsoup.select.Elements", actual.getClass().getName());
  assertEquals("[]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "<x \t y comment=\"a\" class=\"XIULE\"></x \t y> {hasText=false, isBlock=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput131() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jsoup.nodes.FormElement", "org.jsoup.nodes.FormElement", "childNodes", new String[]{}, new String[]{}, false, 1, new String[][]{{"org.jsoup.nodes.FormElement", "tagName", ""}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput132() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jsoup.nodes.FormElement", "org.jsoup.nodes.FormElement", "getElementsByTag", new String[]{"java.lang.String"}, new String[]{""}, false, 7, new String[][]{}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput133() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jsoup.nodes.FormElement", "org.jsoup.nodes.FormElement", "traverse", new String[]{"org.jsoup.select.NodeVisitor"}, new String[]{"<sample:1>"}, false, 2, new String[][]{{"org.jsoup.nodes.FormElement", "siblingNodes", ""}, {"org.jsoup.nodes.FormElement", "text", ""}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput134() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jsoup.nodes.FormElement", "org.jsoup.nodes.FormElement", "childNodeSize", new String[]{}, new String[]{}, false, 6, new String[][]{}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput135() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jsoup.nodes.FormElement", "org.jsoup.nodes.FormElement", "append", new String[]{"java.lang.String"}, new String[]{"h"}, false, 2, new String[][]{{"org.jsoup.nodes.FormElement", "addChildren", "int,org.jsoup.nodes.Node[]", "4045", "<sample:4>"}, {"org.jsoup.nodes.FormElement", "appendText", "java.lang.String", "\t\t"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput136() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jsoup.nodes.FormElement", "org.jsoup.nodes.FormElement", "nodeName", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.jsoup.nodes.FormElement", "insertChildren", "int,java.util.Collection", "1", "<empty>"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput137() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.FormElement", "org.jsoup.nodes.FormElement", "prependElement", new String[]{"java.lang.String"}, new String[]{"0x1F\n"}, false, 7, new String[][]{{"org.jsoup.nodes.FormElement", "childNodes", ""}});
  assertNotNull(actual);
  assertEquals("org.jsoup.nodes.Element", actual.getClass().getName());
  assertEquals("<0x1f></0x1f> {hasText=false, isBlock=false}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "<x \t y comment=\"a\">\n <0x1f></0x1f>\n</x \t y> {hasText=false, isBlock=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput138() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.FormElement", "org.jsoup.nodes.FormElement", "setParentNode", new String[]{"org.jsoup.nodes.Node"}, new String[]{"<sample:7>"}, false, 7, new String[][]{});
  assertNull(actual);
  assertEquals("receiver state after the call", "<x \t y comment=\"a\"></x \t y> {hasText=false, isBlock=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput139() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jsoup.nodes.FormElement", "org.jsoup.nodes.FormElement", "getElementsByClass", new String[]{"java.lang.String"}, new String[]{"CCmethod"}, false, 0, new String[][]{{"org.jsoup.nodes.FormElement", "siblingElements", ""}, {"org.jsoup.nodes.FormElement", "submit", ""}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput140() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jsoup.nodes.FormElement", "org.jsoup.nodes.FormElement", "firstElementSibling", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.jsoup.nodes.FormElement", "setParentNode", "org.jsoup.nodes.Node", "<sample:8>"}, {"org.jsoup.nodes.FormElement", "toggleClass", "java.lang.String", "reio"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.ClassCastException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput141() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jsoup.nodes.FormElement", "org.jsoup.nodes.FormElement", "getElementsByAttributeValueMatching", new String[]{"java.lang.String", "java.util.regex.Pattern"}, new String[]{"uype", "<sample:0>"}, false, 0, new String[][]{{"org.jsoup.nodes.FormElement", "getElementsByAttributeValueNot", "java.lang.String,java.lang.String", "bbc", "[1,2]1.25"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput142() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.FormElement", "org.jsoup.nodes.FormElement", "data", new String[]{}, new String[]{}, false, 5, new String[][]{{"org.jsoup.nodes.FormElement", "ownText", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("", String.valueOf(actual));
  assertEquals("receiver state after the call", "<{\"a\":1} comment=\"a\"></{\"a\":1}> {hasText=false, isBlock=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput143() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jsoup.nodes.FormElement", "org.jsoup.nodes.FormElement", "doClone", new String[]{"org.jsoup.nodes.Node"}, new String[]{"<null>"}, false); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput144() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.FormElement", "org.jsoup.nodes.FormElement", "dataNodes", new String[]{}, new String[]{}, false, 3, new String[][]{{"org.jsoup.nodes.FormElement", "unwrap", ""}});
  assertNotNull(actual);
  assertEquals("java.util.Collections$UnmodifiableRandomAccessList", actual.getClass().getName());
  assertEquals("[]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "<<a><b>t</b></a> comment=\"a\"></<a><b>t</b></a>> {hasText=false, isBlock=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput145() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jsoup.nodes.FormElement", "org.jsoup.nodes.FormElement", "select", new String[]{"java.lang.String"}, new String[]{"1e1n0"}, false); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput146() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.FormElement", "org.jsoup.nodes.FormElement", "parentNode", new String[]{}, new String[]{}, false, 7, new String[][]{{"org.jsoup.nodes.FormElement", "setParentNode", "org.jsoup.nodes.Node", "<sample:3>"}});
  assertNotNull(actual);
  assertEquals("org.jsoup.nodes.DocumentType", actual.getClass().getName());
  assertEquals("<!DOCTYPE a PUBLIC \"0\" \"sample\">", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "<x \t y comment=\"a\"></x \t y> {hasText=false, isBlock=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput147() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jsoup.nodes.FormElement", "org.jsoup.nodes.FormElement", "removeAttr", new String[]{"java.lang.String"}, new String[]{"Hello, W\rorldaction"}, false, 1, new String[][]{{"org.jsoup.nodes.FormElement", "insertChildren", "int,java.util.Collection", "2147483647", "<sample:3>"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput148() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.FormElement", "org.jsoup.nodes.FormElement", "getElementsByAttributeValueStarting", new String[]{"java.lang.String", "java.lang.String"}, new String[]{"010Title", "\r-15"}, false, 3, new String[][]{});
  assertNotNull(actual);
  assertEquals("org.jsoup.select.Elements", actual.getClass().getName());
  assertEquals("[]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "<<a><b>t</b></a> comment=\"a\"></<a><b>t</b></a>> {hasText=false, isBlock=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput149() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.FormElement", "org.jsoup.nodes.FormElement", "getElementsByIndexLessThan", new String[]{"int"}, new String[]{"10"}, false, 5, new String[][]{{"org.jsoup.nodes.FormElement", "previousElementSibling", ""}});
  assertNotNull(actual);
  assertEquals("org.jsoup.select.Elements", actual.getClass().getName());
  assertEquals("[<{\"a\":1} comment=\"a\"></{\"a\":1}>]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "<{\"a\":1} comment=\"a\"></{\"a\":1}> {hasText=false, isBlock=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput150() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jsoup.nodes.FormElement", "org.jsoup.nodes.FormElement", "val", new String[]{"java.lang.String"}, new String[]{"2e10"}, false, 0, new String[][]{{"org.jsoup.nodes.FormElement", "outerHtmlTail", "java.lang.StringBuilder,int,org.jsoup.nodes.Document$OutputSettings", "<sample:0>", "32778", "<sample:7>"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput151() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.FormElement", "org.jsoup.nodes.FormElement", "empty", new String[]{}, new String[]{}, false, 5, new String[][]{{"org.jsoup.nodes.FormElement", "prependChild", "org.jsoup.nodes.Node", "<sample:1>"}, {"org.jsoup.nodes.FormElement", "getElementsByClass", "java.lang.String", ".5"}});
  assertNotNull(actual);
  assertEquals("org.jsoup.nodes.FormElement", actual.getClass().getName());
  assertEquals("<{\"a\":1} comment=\"a\"></{\"a\":1}> {hasText=false, isBlock=false}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "<{\"a\":1} comment=\"a\"></{\"a\":1}> {hasText=false, isBlock=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput152() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.FormElement", "org.jsoup.nodes.FormElement", "elements", new String[]{}, new String[]{}, false, 2, new String[][]{{"org.jsoup.nodes.FormElement", "classNames", ""}, {"org.jsoup.nodes.FormElement", "getElementsByAttributeValueContaining", "java.lang.String,java.lang.String", "12:30:45", "/aa/b0"}});
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput153() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jsoup.nodes.FormElement", "org.jsoup.nodes.FormElement", "dataNodes", new String[]{}, new String[]{}, false, 1, new String[][]{{"org.jsoup.nodes.FormElement", "text", ""}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput154() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jsoup.nodes.FormElement", "org.jsoup.nodes.FormElement", "getElementsByAttributeValueStarting", new String[]{"java.lang.String", "java.lang.String"}, new String[]{"null", "1E-5"}, false, 1, new String[][]{{"org.jsoup.nodes.FormElement", "after", "java.lang.String", "1y"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput155() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.FormElement", "org.jsoup.nodes.FormElement", "append", new String[]{"java.lang.String"}, new String[]{"2\n147493648"}, false, 3, new String[][]{{"org.jsoup.nodes.FormElement", "childNode", "int", "-2147483648"}});
  assertNotNull(actual);
  assertEquals("org.jsoup.nodes.FormElement", actual.getClass().getName());
  assertEquals("<<a><b>t</b></a> comment=\"a\">\n 2 147493648\n</<a><b>t</b></a>> {hasText=true, isBlock=false}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "<<a><b>t</b></a> comment=\"a\">\n 2 147493648\n</<a><b>t</b></a>> {hasText=true, isBlock=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput156() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jsoup.nodes.FormElement", "org.jsoup.nodes.FormElement", "childNode", new String[]{"int"}, new String[]{"5"}, false, 7, new String[][]{{"org.jsoup.nodes.FormElement", "elementSiblingIndex", ""}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IndexOutOfBoundsException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput157() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jsoup.nodes.FormElement", "org.jsoup.nodes.FormElement", "getElementsContainingOwnText", new String[]{"java.lang.String"}, new String[]{"2147483648"}, false, 0, new String[][]{{"org.jsoup.nodes.FormElement", "previousSibling", ""}, {"org.jsoup.nodes.FormElement", "submit", ""}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput158() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.FormElement", "org.jsoup.nodes.FormElement", "equals", new String[]{"java.lang.Object"}, new String[]{"<s:am>"}, false, 7, new String[][]{{"org.jsoup.nodes.FormElement", "select", "java.lang.String", "--1<a>b</a>"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "<x \t y comment=\"a\"></x \t y> {hasText=false, isBlock=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput159() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jsoup.nodes.FormElement", "org.jsoup.nodes.FormElement", "getElementsByIndexLessThan", new String[]{"int"}, new String[]{"0"}, false, 0, new String[][]{{"org.jsoup.nodes.FormElement", "before", "java.lang.String", "1.5Id--1"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput160() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.FormElement", "org.jsoup.nodes.FormElement", "select", new String[]{"java.lang.String"}, new String[]{"0xFFFFFFGF"}, false, 7, new String[][]{{"org.jsoup.nodes.FormElement", "replaceWith", "org.jsoup.nodes.Node", "<sample:3>"}});
  assertNotNull(actual);
  assertEquals("org.jsoup.select.Elements", actual.getClass().getName());
  assertEquals("[]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "<x \t y comment=\"a\"></x \t y> {hasText=false, isBlock=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput161() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jsoup.nodes.FormElement", "org.jsoup.nodes.FormElement", "firstElementSibling", new String[]{}, new String[]{}, false, 3, new String[][]{}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput162() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jsoup.nodes.FormElement", "org.jsoup.nodes.FormElement", "replaceChild", new String[]{"org.jsoup.nodes.Node", "org.jsoup.nodes.Node"}, new String[]{"<sample:4>", "<sample:0>"}, false, 5, new String[][]{}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput163() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jsoup.nodes.FormElement", "org.jsoup.nodes.FormElement", "hasClass", new String[]{"java.lang.String"}, new String[]{"abc"}, false, 0, new String[][]{{"org.jsoup.nodes.FormElement", "prependChild", "org.jsoup.nodes.Node", "<sample:0>"}, {"org.jsoup.nodes.FormElement", "unwrap", ""}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput164() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.FormElement", "org.jsoup.nodes.FormElement", "childNodesAsArray", new String[]{}, new String[]{}, false, 7, new String[][]{});
  assertNotNull(actual);
  assertEquals("[Lorg.jsoup.nodes.Node;", actual.getClass().getName());
  assertEquals("[]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "<x \t y comment=\"a\"></x \t y> {hasText=false, isBlock=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput165() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jsoup.nodes.FormElement", "org.jsoup.nodes.FormElement", "getElementsByAttributeValueEnding", new String[]{"java.lang.String", "java.lang.String"}, new String[]{"<null>", "5.1E5"}, false, 1, new String[][]{{"org.jsoup.nodes.FormElement", "before", "java.lang.String", ""}, {"org.jsoup.nodes.FormElement", "submit", ""}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput166() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jsoup.nodes.FormElement", "org.jsoup.nodes.FormElement", "insertChildren", new String[]{"int", "java.util.Collection"}, new String[]{"-23", "<sample:2>"}, false, 7, new String[][]{}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput167() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jsoup.nodes.FormElement", "org.jsoup.nodes.FormElement", "getElementsByAttributeValueContaining", new String[]{"java.lang.String", "java.lang.String"}, new String[]{"--1+1", "1.5dii"}, false, 2, new String[][]{{"org.jsoup.nodes.FormElement", "toggleClass", "java.lang.String", "/ab"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput168() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.FormElement", "org.jsoup.nodes.FormElement", "childNodes", new String[]{}, new String[]{}, false, 7, new String[][]{});
  assertNotNull(actual);
  assertEquals("java.util.Collections$UnmodifiableRandomAccessList", actual.getClass().getName());
  assertEquals("[]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "<x \t y comment=\"a\"></x \t y> {hasText=false, isBlock=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput169() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.FormElement", "org.jsoup.nodes.FormElement", "val", new String[]{}, new String[]{}, false, 3, new String[][]{{"org.jsoup.nodes.FormElement", "getElementsByTag", "java.lang.String", "1.S5e300method"}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("", String.valueOf(actual));
  assertEquals("receiver state after the call", "<<a><b>t</b></a> comment=\"a\"></<a><b>t</b></a>> {hasText=false, isBlock=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput170() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jsoup.nodes.FormElement", "org.jsoup.nodes.FormElement", "getElementsByIndexLessThan", new String[]{"int"}, new String[]{"1"}, false, 5, new String[][]{{"org.jsoup.nodes.FormElement", "before", "java.lang.String", "010"}, {"org.jsoup.nodes.FormElement", "firstElementSibling", ""}}), new String[][]{{"subList", "int,int", "7"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IndexOutOfBoundsException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput171() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.FormElement", "org.jsoup.nodes.FormElement", "className", new String[]{}, new String[]{}, false, 3, new String[][]{{"org.jsoup.nodes.FormElement", "hasAttr", "java.lang.String", "1.5g"}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("", String.valueOf(actual));
  assertEquals("receiver state after the call", "<<a><b>t</b></a> comment=\"a\"></<a><b>t</b></a>> {hasText=false, isBlock=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput172() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.FormElement", "org.jsoup.nodes.FormElement", "getElementsByAttributeValueMatching", new String[]{"java.lang.String", "java.lang.String"}, new String[]{"method", "1.55dname"}, false, 7, new String[][]{});
  assertNotNull(actual);
  assertEquals("org.jsoup.select.Elements", actual.getClass().getName());
  assertEquals("[]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "<x \t y comment=\"a\"></x \t y> {hasText=false, isBlock=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput173() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jsoup.nodes.FormElement", "org.jsoup.nodes.FormElement", "getElementsMatchingText", new String[]{"java.lang.String"}, new String[]{"1.1234577890123456"}, false, 3, new String[][]{{"org.jsoup.nodes.FormElement", "getElementsContainingText", "java.lang.String", "actionradio"}, {"org.jsoup.nodes.FormElement", "addChildren", "int,org.jsoup.nodes.Node[]", "2147483647", "<sample:2>"}}), new String[][]{{"last", "", "7"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "<<a><b>t</b></a> comment=\"a\"></<a><b>t</b></a>> {hasText=false, isBlock=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput174() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.FormElement", "org.jsoup.nodes.FormElement", "addClass", new String[]{"java.lang.String"}, new String[]{"nnull"}, false, 3, new String[][]{{"org.jsoup.nodes.FormElement", "getElementsByIndexLessThan", "int", "-2147483598"}});
  assertNotNull(actual);
  assertEquals("org.jsoup.nodes.FormElement", actual.getClass().getName());
  assertEquals("<<a><b>t</b></a> comment=\"a\" class=\"nnull\"></<a><b>t</b></a>> {hasText=false, isBlock=false}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "<<a><b>t</b></a> comment=\"a\" class=\"nnull\"></<a><b>t</b></a>> {hasText=false, isBlock=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput175() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jsoup.nodes.FormElement", "org.jsoup.nodes.FormElement", "unwrap", new String[]{}, new String[]{}, false, 5, new String[][]{{"org.jsoup.nodes.FormElement", "insertChildren", "int,java.util.Collection", "-16", "<sample:1>"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput176() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.FormElement", "org.jsoup.nodes.FormElement", "getElementsMatchingOwnText", new String[]{"java.util.regex.Pattern"}, new String[]{"<sample:0>"}, false, 3, new String[][]{{"org.jsoup.nodes.FormElement", "prepend", "java.lang.String", "1.2345778"}, {"org.jsoup.nodes.FormElement", "formData", ""}});
  assertNotNull(actual);
  assertEquals("org.jsoup.select.Elements", actual.getClass().getName());
  assertEquals("[<<a><b>t</b></a> comment=\"a\">\n 1.2345778\n</<a><b>t</b></a>>]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "<<a><b>t</b></a> comment=\"a\">\n 1.2345778\n</<a><b>t</b></a>> {hasText=true, isBlock=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput177() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jsoup.nodes.FormElement", "org.jsoup.nodes.FormElement", "cssSelector", new String[]{}, new String[]{}, false, 2, new String[][]{{"org.jsoup.nodes.FormElement", "hasClass", "java.lang.String", "1E-5-0x1F"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput178() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.FormElement", "org.jsoup.nodes.FormElement", "getElementsMatchingText", new String[]{"java.util.regex.Pattern"}, new String[]{"<sample:0>"}, false, 3, new String[][]{});
  assertNotNull(actual);
  assertEquals("org.jsoup.select.Elements", actual.getClass().getName());
  assertEquals("[<<a><b>t</b></a> comment=\"a\"></<a><b>t</b></a>>]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "<<a><b>t</b></a> comment=\"a\"></<a><b>t</b></a>> {hasText=false, isBlock=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput179() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.FormElement", "org.jsoup.nodes.FormElement", "siblingElements", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.jsoup.nodes.FormElement", "before", "java.lang.String", "httsp://example.com/a?b=ca"}});
  assertNotNull(actual);
  assertEquals("org.jsoup.select.Elements", actual.getClass().getName());
  assertEquals("[]", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput180() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jsoup.nodes.FormElement", "org.jsoup.nodes.FormElement", "appendText", new String[]{"java.lang.String"}, new String[]{""}, false, 5, new String[][]{}), new String[][]{{"classNames", "java.util.Set", "0"}});
  assertNotNull(actual);
  assertEquals("org.jsoup.nodes.FormElement", actual.getClass().getName());
  assertEquals("<{\"a\":1} comment=\"a\" class=\"\">\n</{\"a\":1}> {hasText=false, isBlock=false}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "<{\"a\":1} comment=\"a\" class=\"\">\n</{\"a\":1}> {hasText=false, isBlock=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput181() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.FormElement", "org.jsoup.nodes.FormElement", "childNodeSize", new String[]{}, new String[]{}, false, 7, new String[][]{{"org.jsoup.nodes.FormElement", "text", ""}, {"org.jsoup.nodes.FormElement", "parentNode", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "<x \t y comment=\"a\"></x \t y> {hasText=false, isBlock=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput182() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.FormElement", "org.jsoup.nodes.FormElement", "nextSibling", new String[]{}, new String[]{}, false, 5, new String[][]{});
  assertNull(actual);
  assertEquals("receiver state after the call", "<{\"a\":1} comment=\"a\"></{\"a\":1}> {hasText=false, isBlock=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput183() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jsoup.nodes.FormElement", "org.jsoup.nodes.FormElement", "getElementsByIndexGreaterThan", new String[]{"int"}, new String[]{"4194314"}, false, 1, new String[][]{{"org.jsoup.nodes.FormElement", "insertChildren", "int,java.util.Collection", "2147483647", "<sample:3>"}, {"org.jsoup.nodes.FormElement", "replaceChild", "org.jsoup.nodes.Node,org.jsoup.nodes.Node", "<sample:5>", "<sample:4>"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput184() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.FormElement", "org.jsoup.nodes.FormElement", "children", new String[]{}, new String[]{}, false, 3, new String[][]{});
  assertNotNull(actual);
  assertEquals("org.jsoup.select.Elements", actual.getClass().getName());
  assertEquals("[]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "<<a><b>t</b></a> comment=\"a\"></<a><b>t</b></a>> {hasText=false, isBlock=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput185() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.FormElement", "org.jsoup.nodes.FormElement", "prependElement", new String[]{"java.lang.String"}, new String[]{"2.1234567890123456"}, false, 7, new String[][]{});
  assertNotNull(actual);
  assertEquals("org.jsoup.nodes.Element", actual.getClass().getName());
  assertEquals("<2.1234567890123456></2.1234567890123456> {hasText=false, isBlock=false}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "<x \t y comment=\"a\">\n <2.1234567890123456></2.1234567890123456>\n</x \t y> {hasText=false, isBlock=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput186() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.FormElement", "org.jsoup.nodes.FormElement", "elements", new String[]{}, new String[]{}, false, 3, new String[][]{});
  assertNotNull(actual);
  assertEquals("org.jsoup.select.Elements", actual.getClass().getName());
  assertEquals("[]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "<<a><b>t</b></a> comment=\"a\"></<a><b>t</b></a>> {hasText=false, isBlock=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput187() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jsoup.nodes.FormElement", "org.jsoup.nodes.FormElement", "text", new String[]{"java.lang.String"}, new String[]{"\u00e8"}, false, 6, new String[][]{}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput188() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.FormElement", "org.jsoup.nodes.FormElement", "empty", new String[]{}, new String[]{}, false, 7, new String[][]{{"org.jsoup.nodes.FormElement", "attr", "java.lang.String,java.lang.String", "y1LPPST", "i"}});
  assertNotNull(actual);
  assertEquals("org.jsoup.nodes.FormElement", actual.getClass().getName());
  assertEquals("<x \t y comment=\"a\" y1lppst=\"i\"></x \t y> {hasText=false, isBlock=false}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "<x \t y comment=\"a\" y1lppst=\"i\"></x \t y> {hasText=false, isBlock=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput189() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jsoup.nodes.FormElement", "org.jsoup.nodes.FormElement", "hasAttr", new String[]{"java.lang.String"}, new String[]{"checked"}, false, 0, new String[][]{{"org.jsoup.nodes.FormElement", "text", "java.lang.String", "{\"a\":1}"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput190() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jsoup.nodes.FormElement", "org.jsoup.nodes.FormElement", "getOutputSettings", new String[]{}, new String[]{}, false, 3, new String[][]{{"org.jsoup.nodes.FormElement", "removeChild", "org.jsoup.nodes.Node", "<sample:3>"}}), new String[][]{{"prettyPrint", "", "3"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
  assertEquals("receiver state after the call", "<<a><b>t</b></a> comment=\"a\"></<a><b>t</b></a>> {hasText=false, isBlock=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput191() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.FormElement", "org.jsoup.nodes.FormElement", "traverse", new String[]{"org.jsoup.select.NodeVisitor"}, new String[]{"<sample:6>"}, false, 7, new String[][]{});
  assertNotNull(actual);
  assertEquals("org.jsoup.nodes.FormElement", actual.getClass().getName());
  assertEquals("<x \t y comment=\"a\"></x \t y> {hasText=false, isBlock=false}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "<x \t y comment=\"a\"></x \t y> {hasText=false, isBlock=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput192() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jsoup.nodes.FormElement", "org.jsoup.nodes.FormElement", "formData", new String[]{}, new String[]{}, false); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput193() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jsoup.nodes.FormElement", "org.jsoup.nodes.FormElement", "traverse", new String[]{"org.jsoup.select.NodeVisitor"}, new String[]{"<sample:3>"}, false, 3, new String[][]{}), new String[][]{{"appendText", "java.lang.String", "0"}});
  assertNotNull(actual);
  assertEquals("org.jsoup.nodes.FormElement", actual.getClass().getName());
  assertEquals("<<a><b>t</b></a> comment=\"a\">\n</<a><b>t</b></a>> {hasText=false, isBlock=false}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "<<a><b>t</b></a> comment=\"a\">\n</<a><b>t</b></a>> {hasText=false, isBlock=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput194() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jsoup.nodes.FormElement", "org.jsoup.nodes.FormElement", "appendElement", new String[]{"java.lang.String"}, new String[]{"Title"}, false, 0, new String[][]{{"org.jsoup.nodes.FormElement", "val", "java.lang.String", "0xFFFFFFFF"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput195() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.FormElement", "org.jsoup.nodes.FormElement", "preserveWhitespace", new String[]{"org.jsoup.nodes.Node"}, new String[]{"<null>"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput196() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jsoup.nodes.FormElement", "org.jsoup.nodes.FormElement", "removeClass", new String[]{"java.lang.String"}, new String[]{"0x113456789"}, false); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput197() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.FormElement", "org.jsoup.nodes.FormElement", "addChildren", new String[]{"int", "org.jsoup.nodes.Node[]"}, new String[]{"0", "<sample:2>"}, false, 5, new String[][]{{"org.jsoup.nodes.FormElement", "ownerDocument", ""}});
  assertNull(actual);
  assertEquals("receiver state after the call", "<{\"a\":1} comment=\"a\"><!DOCTYPE a PUBLIC \"0\" \"sample\">\n <!--a-->a\n</{\"a\":1}> {hasText=true, isBlock=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput198() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jsoup.nodes.FormElement", "org.jsoup.nodes.FormElement", "children", new String[]{}, new String[]{}, false, 5, new String[][]{{"org.jsoup.nodes.FormElement", "remove", ""}}), new String[][]{{"after", "java.lang.String", "6"}});
  assertNotNull(actual);
  assertEquals("org.jsoup.select.Elements", actual.getClass().getName());
  assertEquals("[]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "<{\"a\":1} comment=\"a\"></{\"a\":1}> {hasText=false, isBlock=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput199() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.FormElement", "org.jsoup.nodes.FormElement", "parentNode", new String[]{}, new String[]{}, false, 7, new String[][]{{"org.jsoup.nodes.FormElement", "getElementsByTag", "java.lang.String", "12:300h45"}, {"org.jsoup.nodes.FormElement", "outerHtml", "java.lang.StringBuilder", "<sample:0>"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "<x \t y comment=\"a\"></x \t y> {hasText=false, isBlock=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput200() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jsoup.nodes.FormElement", "org.jsoup.nodes.FormElement", "getOutputSettings", new String[]{}, new String[]{}, false, 3, new String[][]{{"org.jsoup.nodes.FormElement", "text", "java.lang.String", "[1,D]"}}), new String[][]{{"syntax", "", "2"}});
  assertNotNull(actual);
  assertEquals("org.jsoup.nodes.Document$OutputSettings$Syntax", actual.getClass().getName());
  assertEquals("html", String.valueOf(actual));
  assertEquals("receiver state after the call", "<<a><b>t</b></a> comment=\"a\">\n [1,D]\n</<a><b>t</b></a>> {hasText=true, isBlock=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput201() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.FormElement", "org.jsoup.nodes.FormElement", "attributes", new String[]{}, new String[]{}, false, 5, new String[][]{});
  assertNotNull(actual);
  assertEquals("org.jsoup.nodes.Attributes", actual.getClass().getName());
  assertEquals(" comment=\"a\" {size=1}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "<{\"a\":1} comment=\"a\"></{\"a\":1}> {hasText=false, isBlock=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput202() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jsoup.nodes.FormElement", "org.jsoup.nodes.FormElement", "select", new String[]{"java.lang.String"}, new String[]{"1.5d1\u00e9"}, false, 7, new String[][]{}), new String[][]{{"listIterator", "", "5"}});
  assertNotNull(actual);
  assertEquals("java.util.ArrayList$ListItr", actual.getClass().getName());
  assertEquals("{hasNext=false, hasPrevious=false}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "<x \t y comment=\"a\"></x \t y> {hasText=false, isBlock=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput203() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jsoup.nodes.FormElement", "org.jsoup.nodes.FormElement", "attr", new String[]{"java.lang.String"}, new String[]{"2147483648"}, false, 0, new String[][]{{"org.jsoup.nodes.FormElement", "addElement", "org.jsoup.nodes.Element", "<null>"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput204() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jsoup.nodes.FormElement", "org.jsoup.nodes.FormElement", "getAllElements", new String[]{}, new String[]{}, false, 3, new String[][]{{"org.jsoup.nodes.FormElement", "setParentNode", "org.jsoup.nodes.Node", "<sample:2>"}}), new String[][]{{"removeAttr", "java.lang.String", "2"}});
  assertNotNull(actual);
  assertEquals("org.jsoup.select.Elements", actual.getClass().getName());
  assertEquals("[<<a><b>t</b></a> comment=\"a\"></<a><b>t</b></a>>]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "<<a><b>t</b></a> comment=\"a\"></<a><b>t</b></a>> {hasText=false, isBlock=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput205() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.FormElement", "org.jsoup.nodes.FormElement", "classNames", new String[]{"java.util.Set"}, new String[]{"<sample:2>"}, false, 3, new String[][]{{"org.jsoup.nodes.FormElement", "prependChild", "org.jsoup.nodes.Node", "<sample:2>"}, {"org.jsoup.nodes.FormElement", "getElementsByIndexEquals", "int", "2147483647"}});
  assertNotNull(actual);
  assertEquals("org.jsoup.nodes.FormElement", actual.getClass().getName());
  assertEquals("<<a><b>t</b></a> comment=\"a\" class=\"0 sample \">\n <#root></#root>\n</<a><b>t</b></a>> {hasText=false, isBlock=false}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "<<a><b>t</b></a> comment=\"a\" class=\"0 sample \">\n <#root></#root>\n</<a><b>t</b></a>> {hasText=false, isBlock=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput206() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jsoup.nodes.FormElement", "org.jsoup.nodes.FormElement", "classNames", new String[]{}, new String[]{}, false, 1, new String[][]{{"org.jsoup.nodes.FormElement", "clone", ""}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput207() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.FormElement", "org.jsoup.nodes.FormElement", "hashCode", new String[]{}, new String[]{}, false);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
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
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jsoup.nodes.FormElement", "org.jsoup.nodes.FormElement", "childNodesCopy", new String[]{}, new String[]{}, false); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput210() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.FormElement", "org.jsoup.nodes.FormElement", "parentNode", new String[]{}, new String[]{}, false, 3, new String[][]{{"org.jsoup.nodes.FormElement", "parent", ""}});
  assertNull(actual);
  assertEquals("receiver state after the call", "<<a><b>t</b></a> comment=\"a\"></<a><b>t</b></a>> {hasText=false, isBlock=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput211() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.FormElement", "org.jsoup.nodes.FormElement", "getElementsContainingText", new String[]{"java.lang.String"}, new String[]{"option[selected]"}, false, 3, new String[][]{});
  assertNotNull(actual);
  assertEquals("org.jsoup.select.Elements", actual.getClass().getName());
  assertEquals("[]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "<<a><b>t</b></a> comment=\"a\"></<a><b>t</b></a>> {hasText=false, isBlock=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput212() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.FormElement", "org.jsoup.nodes.FormElement", "appendText", new String[]{"java.lang.String"}, new String[]{""}, false, 7, new String[][]{{"org.jsoup.nodes.FormElement", "tag", ""}});
  assertNotNull(actual);
  assertEquals("org.jsoup.nodes.FormElement", actual.getClass().getName());
  assertEquals("<x \t y comment=\"a\">\n</x \t y> {hasText=false, isBlock=false}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "<x \t y comment=\"a\">\n</x \t y> {hasText=false, isBlock=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput213() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jsoup.nodes.FormElement", "org.jsoup.nodes.FormElement", "getElementsByIndexEquals", new String[]{"int"}, new String[]{"-262139"}, false, 2, new String[][]{}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput214() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.FormElement", "org.jsoup.nodes.FormElement", "siblingNodes", new String[]{}, new String[]{}, false, 5, new String[][]{});
  assertNotNull(actual);
  assertEquals("java.util.Collections$EmptyList", actual.getClass().getName());
  assertEquals("[]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "<{\"a\":1} comment=\"a\"></{\"a\":1}> {hasText=false, isBlock=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput215() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.FormElement", "org.jsoup.nodes.FormElement", "previousElementSibling", new String[]{}, new String[]{}, false, 1, new String[][]{});
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput216() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jsoup.nodes.FormElement", "org.jsoup.nodes.FormElement", "getElementsMatchingText", new String[]{"java.lang.String"}, new String[]{"/\u00e9"}, false, 5, new String[][]{}), new String[][]{{"listIterator", "", "5"}, {"previousIndex", "", "4"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("-1", String.valueOf(actual));
  assertEquals("receiver state after the call", "<{\"a\":1} comment=\"a\"></{\"a\":1}> {hasText=false, isBlock=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput217() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.FormElement", "org.jsoup.nodes.FormElement", "data", new String[]{}, new String[]{}, false, 3, new String[][]{{"org.jsoup.nodes.FormElement", "before", "org.jsoup.nodes.Node", "<sample:7>"}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("", String.valueOf(actual));
  assertEquals("receiver state after the call", "<<a><b>t</b></a> comment=\"a\"></<a><b>t</b></a>> {hasText=false, isBlock=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput218() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.FormElement", "org.jsoup.nodes.FormElement", "addChildren", new String[]{"org.jsoup.nodes.Node[]"}, new String[]{"<sample:4>"}, false, 7, new String[][]{});
  assertNull(actual);
  assertEquals("receiver state after the call", "<x \t y comment=\"a\">\n a\n <!--a-->\n</x \t y> {hasText=true, isBlock=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput219() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jsoup.nodes.FormElement", "org.jsoup.nodes.FormElement", "clone", new String[]{}, new String[]{}, false); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput220() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jsoup.nodes.FormElement", "org.jsoup.nodes.FormElement", "after", new String[]{"org.jsoup.nodes.Node"}, new String[]{"<sample:1>"}, false, 3, new String[][]{{"org.jsoup.nodes.FormElement", "tagName", ""}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput221() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jsoup.nodes.FormElement", "org.jsoup.nodes.FormElement", "getElementsMatchingText", new String[]{"java.lang.String"}, new String[]{"nameon"}, false, 0, new String[][]{{"org.jsoup.nodes.FormElement", "elements", ""}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput222() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jsoup.nodes.FormElement", "org.jsoup.nodes.FormElement", "getElementsMatchingText", new String[]{"java.util.regex.Pattern"}, new String[]{"<sample:0>"}, false, 7, new String[][]{}), new String[][]{{"remove", "java.lang.Object", "7"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "<x \t y comment=\"a\"></x \t y> {hasText=false, isBlock=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput223() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.FormElement", "org.jsoup.nodes.FormElement", "html", new String[]{}, new String[]{}, false, 5, new String[][]{{"org.jsoup.nodes.FormElement", "toggleClass", "java.lang.String", "Tisle"}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("", String.valueOf(actual));
  assertEquals("receiver state after the call", "<{\"a\":1} comment=\"a\" class=\"Tisle\"></{\"a\":1}> {hasText=false, isBlock=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput224() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jsoup.nodes.FormElement", "org.jsoup.nodes.FormElement", "prependText", new String[]{"java.lang.String"}, new String[]{"PST"}, false, 3, new String[][]{}), new String[][]{{"getElementsByAttributeValueStarting", "java.lang.String,java.lang.String", "3"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput225() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jsoup.nodes.FormElement", "org.jsoup.nodes.FormElement", "getElementsByTag", new String[]{"java.lang.String"}, new String[]{"y1LPLST"}, false, 1, new String[][]{}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput226() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jsoup.nodes.FormElement", "org.jsoup.nodes.FormElement", "appendText", new String[]{"java.lang.String"}, new String[]{"radio"}, false, 2, new String[][]{{"org.jsoup.nodes.FormElement", "setBaseUri", "java.lang.String", "0xFFFFFFFF{\"a\":1}"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput227() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.FormElement", "org.jsoup.nodes.FormElement", "addClass", new String[]{"java.lang.String"}, new String[]{"option[semected]PT1H"}, false, 3, new String[][]{{"org.jsoup.nodes.FormElement", "absUrl", "java.lang.String", "a,b],c12:30:45"}, {"org.jsoup.nodes.FormElement", "unwrap", ""}});
  assertNotNull(actual);
  assertEquals("org.jsoup.nodes.FormElement", actual.getClass().getName());
  assertEquals("<<a><b>t</b></a> comment=\"a\" class=\"option[semected]PT1H\"></<a><b>t</b></a>> {hasText=false, isBlock=false}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "<<a><b>t</b></a> comment=\"a\" class=\"option[semected]PT1H\"></<a><b>t</b></a>> {hasText=false, isBlock=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput228() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.FormElement", "org.jsoup.nodes.FormElement", "previousSibling", new String[]{}, new String[]{}, false, 3, new String[][]{});
  assertNull(actual);
  assertEquals("receiver state after the call", "<<a><b>t</b></a> comment=\"a\"></<a><b>t</b></a>> {hasText=false, isBlock=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput229() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jsoup.nodes.FormElement", "org.jsoup.nodes.FormElement", "empty", new String[]{}, new String[]{}, false, 7, new String[][]{{"org.jsoup.nodes.FormElement", "select", "java.lang.String", "2020-01-02"}}), new String[][]{{"getElementsContainingText", "java.lang.String", "7"}});
  assertNotNull(actual);
  assertEquals("org.jsoup.select.Elements", actual.getClass().getName());
  assertEquals("[]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "<x \t y comment=\"a\"></x \t y> {hasText=false, isBlock=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput230() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.FormElement", "org.jsoup.nodes.FormElement", "previousElementSibling", new String[]{}, new String[]{}, false, 7, new String[][]{{"org.jsoup.nodes.FormElement", "html", ""}, {"org.jsoup.nodes.FormElement", "baseUri", ""}});
  assertNull(actual);
  assertEquals("receiver state after the call", "<x \t y comment=\"a\"></x \t y> {hasText=false, isBlock=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput231() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jsoup.nodes.FormElement", "org.jsoup.nodes.FormElement", "tagName", new String[]{"java.lang.String"}, new String[]{"http://examplee.com/a?b=c"}, false, 0, new String[][]{{"org.jsoup.nodes.FormElement", "getElementsByAttributeValueStarting", "java.lang.String,java.lang.String", "mmethod", "lethod"}}), new String[][]{{"append", "java.lang.String", "2"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput232() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.FormElement", "org.jsoup.nodes.FormElement", "appendText", new String[]{"java.lang.String"}, new String[]{"10x1F"}, false, 7, new String[][]{{"org.jsoup.nodes.FormElement", "nodeName", ""}});
  assertNotNull(actual);
  assertEquals("org.jsoup.nodes.FormElement", actual.getClass().getName());
  assertEquals("<x \t y comment=\"a\">\n 10x1F\n</x \t y> {hasText=true, isBlock=false}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "<x \t y comment=\"a\">\n 10x1F\n</x \t y> {hasText=true, isBlock=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput233() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.FormElement", "org.jsoup.nodes.FormElement", "attributes", new String[]{}, new String[]{}, false);
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput234() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jsoup.nodes.FormElement", "org.jsoup.nodes.FormElement", "wrap", new String[]{"java.lang.String"}, new String[]{"<null>"}, false, 3, new String[][]{{"org.jsoup.nodes.FormElement", "getElementsByAttributeValueStarting", "java.lang.String,java.lang.String", "/a/b", "1.5r"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput235() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.FormElement", "org.jsoup.nodes.FormElement", "getElementsByIndexEquals", new String[]{"int"}, new String[]{"-2147483648"}, false, 3, new String[][]{{"org.jsoup.nodes.FormElement", "unwrap", ""}});
  assertNotNull(actual);
  assertEquals("org.jsoup.select.Elements", actual.getClass().getName());
  assertEquals("[]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "<<a><b>t</b></a> comment=\"a\"></<a><b>t</b></a>> {hasText=false, isBlock=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput236() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jsoup.nodes.FormElement", "org.jsoup.nodes.FormElement", "getElementsByIndexEquals", new String[]{"int"}, new String[]{"-2"}, false, 3, new String[][]{}), new String[][]{{"tagName", "java.lang.String", "5"}, {"add", "int,java.lang.Object", "6"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IndexOutOfBoundsException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput237() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.FormElement", "org.jsoup.nodes.FormElement", "getElementsMatchingOwnText", new String[]{"java.lang.String"}, new String[]{"` b"}, false, 7, new String[][]{{"org.jsoup.nodes.FormElement", "submit", ""}});
  assertNotNull(actual);
  assertEquals("org.jsoup.select.Elements", actual.getClass().getName());
  assertEquals("[]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "<x \t y comment=\"a\"></x \t y> {hasText=false, isBlock=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput238() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.FormElement", "org.jsoup.nodes.FormElement", "dataset", new String[]{}, new String[]{}, false, 7, new String[][]{{"org.jsoup.nodes.FormElement", "getElementsByIndexGreaterThan", "int", "-22"}});
  assertNotNull(actual);
  assertEquals("org.jsoup.nodes.Attributes$Dataset", actual.getClass().getName());
  assertEquals("{}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "<x \t y comment=\"a\"></x \t y> {hasText=false, isBlock=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput239() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.FormElement", "org.jsoup.nodes.FormElement", "ownText", new String[]{}, new String[]{}, false, 7, new String[][]{{"org.jsoup.nodes.FormElement", "tagName", "java.lang.String", "\t\t"}, {"org.jsoup.nodes.FormElement", "getOutputSettings", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("", String.valueOf(actual));
  assertEquals("receiver state after the call", "<x \t y comment=\"a\"></x \t y> {hasText=false, isBlock=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput240() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.FormElement", "org.jsoup.nodes.FormElement", "appendElement", new String[]{"java.lang.String"}, new String[]{"--1"}, false, 7, new String[][]{});
  assertNotNull(actual);
  assertEquals("org.jsoup.nodes.Element", actual.getClass().getName());
  assertEquals("<--1></--1> {hasText=false, isBlock=false}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "<x \t y comment=\"a\">\n <--1></--1>\n</x \t y> {hasText=false, isBlock=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput241() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jsoup.nodes.FormElement", "org.jsoup.nodes.FormElement", "outerHtml", new String[]{}, new String[]{}, false, 1, new String[][]{{"org.jsoup.nodes.FormElement", "getElementsByIndexEquals", "int", "-1"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput242() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.FormElement", "org.jsoup.nodes.FormElement", "removeAttr", new String[]{"java.lang.String"}, new String[]{"a,b],c12:330:45"}, false, 3, new String[][]{});
  assertNotNull(actual);
  assertEquals("org.jsoup.nodes.FormElement", actual.getClass().getName());
  assertEquals("<<a><b>t</b></a> comment=\"a\"></<a><b>t</b></a>> {hasText=false, isBlock=false}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "<<a><b>t</b></a> comment=\"a\"></<a><b>t</b></a>> {hasText=false, isBlock=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput243() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.FormElement", "org.jsoup.nodes.FormElement", "cssSelector", new String[]{}, new String[]{}, false, 7, new String[][]{});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("x \t y", String.valueOf(actual));
  assertEquals("receiver state after the call", "<x \t y comment=\"a\"></x \t y> {hasText=false, isBlock=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput244() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jsoup.nodes.FormElement", "org.jsoup.nodes.FormElement", "clone", new String[]{}, new String[]{}, false, 3, new String[][]{{"org.jsoup.nodes.FormElement", "childNodeSize", ""}}), new String[][]{{"getElementsByTag", "java.lang.String", "7"}, {"add", "int,java.lang.Object", "6"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IndexOutOfBoundsException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput245() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jsoup.nodes.FormElement", "org.jsoup.nodes.FormElement", "getElementsByAttributeValue", new String[]{"java.lang.String", "java.lang.String"}, new String[]{"y1LPOSTradio010", "t+elect"}, false, 7, new String[][]{}), new String[][]{{"listIterator", "int", "6"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IndexOutOfBoundsException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput246() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jsoup.nodes.FormElement", "org.jsoup.nodes.FormElement", "addClass", new String[]{"java.lang.String"}, new String[]{""}, false, 7, new String[][]{}), new String[][]{{"after", "java.lang.String", "3"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput247() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.FormElement", "org.jsoup.nodes.FormElement", "ownerDocument", new String[]{}, new String[]{}, false, 6, new String[][]{{"org.jsoup.nodes.FormElement", "tagName", ""}});
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput248() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jsoup.nodes.FormElement", "org.jsoup.nodes.FormElement", "classNames", new String[]{"java.util.Set"}, new String[]{"<sample:1>"}, false, 1, new String[][]{}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput249() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.FormElement", "org.jsoup.nodes.FormElement", "previousSibling", new String[]{}, new String[]{}, false, 7, new String[][]{{"org.jsoup.nodes.FormElement", "getElementsByAttribute", "java.lang.String", "1.123456788"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "<x \t y comment=\"a\"></x \t y> {hasText=false, isBlock=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput250() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jsoup.nodes.FormElement", "org.jsoup.nodes.FormElement", "getElementsMatchingOwnText", new String[]{"java.util.regex.Pattern"}, new String[]{"<sample:0>"}, false); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput251() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.FormElement", "org.jsoup.nodes.FormElement", "removeClass", new String[]{"java.lang.String"}, new String[]{"0x123456789.5"}, false, 3, new String[][]{{"org.jsoup.nodes.FormElement", "absUrl", "java.lang.String", "1.1234567"}});
  assertNotNull(actual);
  assertEquals("org.jsoup.nodes.FormElement", actual.getClass().getName());
  assertEquals("<<a><b>t</b></a> comment=\"a\" class=\"\"></<a><b>t</b></a>> {hasText=false, isBlock=false}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "<<a><b>t</b></a> comment=\"a\" class=\"\"></<a><b>t</b></a>> {hasText=false, isBlock=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput252() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.FormElement", "org.jsoup.nodes.FormElement", "getElementsByAttribute", new String[]{"java.lang.String"}, new String[]{"0h"}, false, 3, new String[][]{{"org.jsoup.nodes.FormElement", "submit", ""}});
  assertNotNull(actual);
  assertEquals("org.jsoup.select.Elements", actual.getClass().getName());
  assertEquals("[]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "<<a><b>t</b></a> comment=\"a\"></<a><b>t</b></a>> {hasText=false, isBlock=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput253() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.FormElement", "org.jsoup.nodes.FormElement", "tagName", new String[]{}, new String[]{}, false, 7, new String[][]{});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("x \t y", String.valueOf(actual));
  assertEquals("receiver state after the call", "<x \t y comment=\"a\"></x \t y> {hasText=false, isBlock=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput254() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jsoup.nodes.FormElement", "org.jsoup.nodes.FormElement", "getElementsContainingOwnText", new String[]{"java.lang.String"}, new String[]{"1-1234567"}, false, 7, new String[][]{{"org.jsoup.nodes.FormElement", "addChildren", "org.jsoup.nodes.Node[]", "<sample:1>"}}), new String[][]{{"attr", "java.lang.String,java.lang.String", "6"}});
  assertNotNull(actual);
  assertEquals("org.jsoup.select.Elements", actual.getClass().getName());
  assertEquals("[]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "<x \t y comment=\"a\">\n <#root></#root><!DOCTYPE a PUBLIC \"0\" \"sample\">\n</x \t y> {hasText=false, isBlock=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput255() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.FormElement", "org.jsoup.nodes.FormElement", "tag", new String[]{}, new String[]{}, false, 3, new String[][]{{"org.jsoup.nodes.FormElement", "nextSibling", ""}, {"org.jsoup.nodes.FormElement", "elements", ""}});
  assertNotNull(actual);
  assertEquals("org.jsoup.parser.Tag", actual.getClass().getName());
  assertEquals("<a><b>t</b></a> {canContainBlock=true, getName=<a><b>t</b></a>, isBlock=false, isData=false, isEmpty=false, isFormListed=false, isFormSubmittable=false, isInline=true, isKnownTag=false, isSelfClosing=...#206#488038219", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "<<a><b>t</b></a> comment=\"a\"></<a><b>t</b></a>> {hasText=false, isBlock=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput256() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jsoup.nodes.FormElement", "org.jsoup.nodes.FormElement", "getOutputSettings", new String[]{}, new String[]{}, false, 7, new String[][]{{"org.jsoup.nodes.FormElement", "outerHtml", "java.lang.StringBuilder", "<sample:1>"}, {"org.jsoup.nodes.FormElement", "text", "java.lang.String", "<a>b</a>"}}), new String[][]{{"indentAmount", "int", "2"}, {"escapeMode", "org.jsoup.nodes.Entities$EscapeMode", "4"}});
  assertNotNull(actual);
  assertEquals("org.jsoup.nodes.Document$OutputSettings", actual.getClass().getName());
  assertEquals("receiver state after the call", "<x \t y comment=\"a\">\n &lt;a&gt;b&lt;/a&gt;\n</x \t y> {hasText=true, isBlock=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput257() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jsoup.nodes.FormElement", "org.jsoup.nodes.FormElement", "hasText", new String[]{}, new String[]{}, false, 1, new String[][]{}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput258() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jsoup.nodes.FormElement", "org.jsoup.nodes.FormElement", "absUrl", new String[]{"java.lang.String"}, new String[]{""}, false, 0, new String[][]{{"org.jsoup.nodes.FormElement", "remove", ""}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput259() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.FormElement", "org.jsoup.nodes.FormElement", "reparentChild", new String[]{"org.jsoup.nodes.Node"}, new String[]{"<sample:5>"}, false, 3, new String[][]{});
  assertNull(actual);
  assertEquals("receiver state after the call", "<<a><b>t</b></a> comment=\"a\"></<a><b>t</b></a>> {hasText=false, isBlock=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput260() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.FormElement", "org.jsoup.nodes.FormElement", "childNodesCopy", new String[]{}, new String[]{}, false, 3, new String[][]{{"org.jsoup.nodes.FormElement", "appendChild", "org.jsoup.nodes.Node", "<null>"}});
  assertNotNull(actual);
  assertEquals("java.util.ArrayList", actual.getClass().getName());
  assertEquals("[]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "<<a><b>t</b></a> comment=\"a\"></<a><b>t</b></a>> {hasText=false, isBlock=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput261() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.FormElement", "org.jsoup.nodes.FormElement", "clone", new String[]{}, new String[]{}, false, 7, new String[][]{{"org.jsoup.nodes.FormElement", "attr", "java.lang.String,java.lang.String", "010D", "nulb"}});
  assertNotNull(actual);
  assertEquals("org.jsoup.nodes.FormElement", actual.getClass().getName());
  assertEquals("<x \t y comment=\"a\" 010d=\"nulb\"></x \t y> {hasText=false, isBlock=false}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "<x \t y comment=\"a\" 010d=\"nulb\"></x \t y> {hasText=false, isBlock=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput262() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jsoup.nodes.FormElement", "org.jsoup.nodes.FormElement", "parents", new String[]{}, new String[]{}, false, 3, new String[][]{{"org.jsoup.nodes.FormElement", "getElementsByIndexLessThan", "int", "-43"}}), new String[][]{{"listIterator", "", "7"}});
  assertNotNull(actual);
  assertEquals("java.util.ArrayList$ListItr", actual.getClass().getName());
  assertEquals("{hasNext=false, hasPrevious=false}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "<<a><b>t</b></a> comment=\"a\"></<a><b>t</b></a>> {hasText=false, isBlock=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput263() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jsoup.nodes.FormElement", "org.jsoup.nodes.FormElement", "toString", new String[]{}, new String[]{}, false, 2, new String[][]{}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput264() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.FormElement", "org.jsoup.nodes.FormElement", "appendText", new String[]{"java.lang.String"}, new String[]{"sadio"}, false, 3, new String[][]{{"org.jsoup.nodes.FormElement", "empty", ""}});
  assertNotNull(actual);
  assertEquals("org.jsoup.nodes.FormElement", actual.getClass().getName());
  assertEquals("<<a><b>t</b></a> comment=\"a\">\n sadio\n</<a><b>t</b></a>> {hasText=true, isBlock=false}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "<<a><b>t</b></a> comment=\"a\">\n sadio\n</<a><b>t</b></a>> {hasText=true, isBlock=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput265() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jsoup.nodes.FormElement", "org.jsoup.nodes.FormElement", "addClass", new String[]{"java.lang.String"}, new String[]{"1."}, false, 7, new String[][]{}), new String[][]{{"hasText", "", "1"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "<x \t y comment=\"a\" class=\"1.\"></x \t y> {hasText=false, isBlock=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput266() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jsoup.nodes.FormElement", "org.jsoup.nodes.FormElement", "ownText", new String[]{}, new String[]{}, false); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput267() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jsoup.nodes.FormElement", "org.jsoup.nodes.FormElement", "submit", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.jsoup.nodes.FormElement", "prependChild", "org.jsoup.nodes.Node", "<sample:3>"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput268() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jsoup.nodes.FormElement", "org.jsoup.nodes.FormElement", "remove", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.jsoup.nodes.FormElement", "tag", ""}}, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput269() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.FormElement", "org.jsoup.nodes.FormElement", "formData", new String[]{}, new String[]{}, false, 3, new String[][]{{"org.jsoup.nodes.FormElement", "getElementsByIndexLessThan", "int", "2147483647"}}, 1);
  assertNotNull(actual);
  assertEquals("java.util.ArrayList", actual.getClass().getName());
  assertEquals("[]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "<<a><b>t</b></a> comment=\"a\"></<a><b>t</b></a>> {hasText=false, isBlock=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput270() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.FormElement", "org.jsoup.nodes.FormElement", "dataset", new String[]{}, new String[]{}, false, 3, new String[][]{});
  assertNotNull(actual);
  assertEquals("org.jsoup.nodes.Attributes$Dataset", actual.getClass().getName());
  assertEquals("{}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "<<a><b>t</b></a> comment=\"a\"></<a><b>t</b></a>> {hasText=false, isBlock=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput271() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jsoup.nodes.FormElement", "org.jsoup.nodes.FormElement", "getElementsByAttributeValueEnding", new String[]{"java.lang.String", "java.lang.String"}, new String[]{"a Pi", "1E"}, false); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput272() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jsoup.nodes.FormElement", "org.jsoup.nodes.FormElement", "classNames", new String[]{}, new String[]{}, false, 2, new String[][]{{"org.jsoup.nodes.FormElement", "formData", ""}}, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput273() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.FormElement", "org.jsoup.nodes.FormElement", "classNames", new String[]{}, new String[]{}, false, 5, new String[][]{{"org.jsoup.nodes.FormElement", "unwrap", ""}});
  assertNotNull(actual);
  assertEquals("java.util.LinkedHashSet", actual.getClass().getName());
  assertEquals("[]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "<{\"a\":1} comment=\"a\"></{\"a\":1}> {hasText=false, isBlock=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput274() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.FormElement", "org.jsoup.nodes.FormElement", "attr", new String[]{"java.lang.String"}, new String[]{"r"}, false, 3, new String[][]{{"org.jsoup.nodes.FormElement", "cssSelector", ""}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("", String.valueOf(actual));
  assertEquals("receiver state after the call", "<<a><b>t</b></a> comment=\"a\"></<a><b>t</b></a>> {hasText=false, isBlock=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput275() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.FormElement", "org.jsoup.nodes.FormElement", "tag", new String[]{}, new String[]{}, false, 4, new String[][]{{"org.jsoup.nodes.FormElement", "unwrap", ""}}, 3);
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput276() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jsoup.nodes.FormElement", "org.jsoup.nodes.FormElement", "clone", new String[]{}, new String[]{}, false, 3, new String[][]{{"org.jsoup.nodes.FormElement", "select", "java.lang.String", "1/5e"}}), new String[][]{{"after", "java.lang.String", "6"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput277() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.FormElement", "org.jsoup.nodes.FormElement", "nextElementSibling", new String[]{}, new String[]{}, false, 5, new String[][]{});
  assertNull(actual);
  assertEquals("receiver state after the call", "<{\"a\":1} comment=\"a\"></{\"a\":1}> {hasText=false, isBlock=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput278() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jsoup.nodes.FormElement", "org.jsoup.nodes.FormElement", "addClass", new String[]{"java.lang.String"}, new String[]{"-0"}, false, 1, new String[][]{{"org.jsoup.nodes.FormElement", "getElementsMatchingOwnText", "java.util.regex.Pattern", "<empty>"}}, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput279() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jsoup.nodes.FormElement", "org.jsoup.nodes.FormElement", "childNodes", new String[]{}, new String[]{}, false, 1, new String[][]{{"org.jsoup.nodes.FormElement", "doClone", "org.jsoup.nodes.Node", "<sample:3>"}}, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput280() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jsoup.nodes.FormElement", "org.jsoup.nodes.FormElement", "id", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.jsoup.nodes.FormElement", "toggleClass", "java.lang.String", "Title"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput281() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jsoup.nodes.FormElement", "org.jsoup.nodes.FormElement", "dataset", new String[]{}, new String[]{}, false, 3, new String[][]{{"org.jsoup.nodes.FormElement", "html", "java.lang.String", "1.1234567f890123456"}}), new String[][]{{"clear", "", "4"}, {"remove", "java.lang.Object", "6"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "<<a><b>t</b></a> comment=\"a\">\n 1.1234567f890123456\n</<a><b>t</b></a>> {hasText=true, isBlock=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput282() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jsoup.nodes.FormElement", "org.jsoup.nodes.FormElement", "addChildren", new String[]{"int", "org.jsoup.nodes.Node[]"}, new String[]{"2147483647", "<sample:3>"}, false, 3, new String[][]{}, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IndexOutOfBoundsException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput283() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.FormElement", "org.jsoup.nodes.FormElement", "childNodeSize", new String[]{}, new String[]{}, false, 3, new String[][]{});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "<<a><b>t</b></a> comment=\"a\"></<a><b>t</b></a>> {hasText=false, isBlock=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput284() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jsoup.nodes.FormElement", "org.jsoup.nodes.FormElement", "getElementsByAttributeValueMatching", new String[]{"java.lang.String", "java.lang.String"}, new String[]{"0.1234567890123456", "5.select"}, false, 4, new String[][]{{"org.jsoup.nodes.FormElement", "getElementsByAttribute", "java.lang.String", "\u00e9"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput285() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jsoup.nodes.FormElement", "org.jsoup.nodes.FormElement", "childNodes", new String[]{}, new String[]{}, false, 3, new String[][]{{"org.jsoup.nodes.FormElement", "submit", ""}}), new String[][]{{"listIterator", "int", "4"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IndexOutOfBoundsException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput286() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jsoup.nodes.FormElement", "org.jsoup.nodes.FormElement", "getElementsMatchingOwnText", new String[]{"java.util.regex.Pattern"}, new String[]{"<sample:1>"}, false, 1, new String[][]{}, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput287() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jsoup.nodes.FormElement", "org.jsoup.nodes.FormElement", "childNodes", new String[]{}, new String[]{}, false, 0, null, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput288() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.FormElement", "org.jsoup.nodes.FormElement", "addChildren", new String[]{"org.jsoup.nodes.Node[]"}, new String[]{"<sample:1>"}, false, 7, new String[][]{}, 1);
  assertNull(actual);
  assertEquals("receiver state after the call", "<x \t y comment=\"a\">\n <#root></#root><!doctype a>\n</x \t y> {hasText=false, isBlock=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput289() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jsoup.nodes.FormElement", "org.jsoup.nodes.FormElement", "childNodeSize", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.jsoup.nodes.FormElement", "childNodesCopy", ""}}, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput290() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.FormElement", "org.jsoup.nodes.FormElement", "attr", new String[]{"java.lang.String"}, new String[]{"Titm"}, false, 7, new String[][]{{"org.jsoup.nodes.FormElement", "toggleClass", "java.lang.String", "POS7T"}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("", String.valueOf(actual));
  assertEquals("receiver state after the call", "<x \t y comment=\"a\" class=\"POS7T\"></x \t y> {hasText=false, isBlock=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput291() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jsoup.nodes.FormElement", "org.jsoup.nodes.FormElement", "replaceWith", new String[]{"org.jsoup.nodes.Node"}, new String[]{"<sample:6>"}, false, 3, new String[][]{}, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput292() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jsoup.nodes.FormElement", "org.jsoup.nodes.FormElement", "prependText", new String[]{"java.lang.String"}, new String[]{"Hello, orld0xFFFFFFFF"}, false, 3, new String[][]{}), new String[][]{{"getElementsByAttributeStarting", "java.lang.String", "2"}});
  assertNotNull(actual);
  assertEquals("org.jsoup.select.Elements", actual.getClass().getName());
  assertEquals("[]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "<<a><b>t</b></a> comment=\"a\">\n Hello, orld0xFFFFFFFF\n</<a><b>t</b></a>> {hasText=true, isBlock=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput293() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jsoup.nodes.FormElement", "org.jsoup.nodes.FormElement", "firstElementSibling", new String[]{}, new String[]{}, false, 3, new String[][]{{"org.jsoup.nodes.FormElement", "toggleClass", "java.lang.String", "12:30:45null"}}, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput294() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jsoup.nodes.FormElement", "org.jsoup.nodes.FormElement", "prepend", new String[]{"java.lang.String"}, new String[]{"2020-01-01"}, false, 3, new String[][]{{"org.jsoup.nodes.FormElement", "append", "java.lang.String", "1021-02-30T25:61:61"}}), new String[][]{{"getElementsByAttributeValueMatching", "java.lang.String,java.lang.String", "4"}});
  assertNotNull(actual);
  assertEquals("org.jsoup.select.Elements", actual.getClass().getName());
  assertEquals("[]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "<<a><b>t</b></a> comment=\"a\">\n 2020-01-011021-02-30T25:61:61\n</<a><b>t</b></a>> {hasText=true, isBlock=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput295() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jsoup.nodes.FormElement", "org.jsoup.nodes.FormElement", "html", new String[]{}, new String[]{}, false); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput296() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.FormElement", "org.jsoup.nodes.FormElement", "hashCode", new String[]{}, new String[]{}, false, 7, new String[][]{});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("1492351785", String.valueOf(actual));
  assertEquals("receiver state after the call", "<x \t y comment=\"a\"></x \t y> {hasText=false, isBlock=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput297() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jsoup.nodes.FormElement", "org.jsoup.nodes.FormElement", "prependChild", new String[]{"org.jsoup.nodes.Node"}, new String[]{"<sample:2>"}, false, 1, new String[][]{{"org.jsoup.nodes.FormElement", "val", "java.lang.String", "a,b],c12:30:45"}}, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput298() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.FormElement", "org.jsoup.nodes.FormElement", "addChildren", new String[]{"org.jsoup.nodes.Node[]"}, new String[]{"<sample:1>"}, false, 7, new String[][]{{"org.jsoup.nodes.FormElement", "tag", ""}});
  assertNull(actual);
  assertEquals("receiver state after the call", "<x \t y comment=\"a\">\n <#root></#root><!DOCTYPE a PUBLIC \"0\" \"sample\">\n</x \t y> {hasText=false, isBlock=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput299() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jsoup.nodes.FormElement", "org.jsoup.nodes.FormElement", "outerHtml", new String[]{"java.lang.StringBuilder"}, new String[]{"<sample:3>"}, false, 6, new String[][]{{"org.jsoup.nodes.FormElement", "childNode", "int", "1"}}, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
}
