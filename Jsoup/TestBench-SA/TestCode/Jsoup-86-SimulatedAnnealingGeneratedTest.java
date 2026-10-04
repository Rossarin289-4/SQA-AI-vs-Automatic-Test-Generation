package generated.algorithm;

import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;
import static org.junit.Assert.*;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class SimulatedAnnealingGeneratedTest {
 @Test(timeout = 20000)
 public void generatedInput000() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Comment", "org.jsoup.nodes.Comment", "removeAttr", new String[]{"java.lang.String"}, new String[]{"Title"}, false);
  assertNotNull(actual);
  assertEquals("org.jsoup.nodes.Comment", actual.getClass().getName());
  assertEquals("\n<!--a--> {getData=a, hasParent=false, isXmlDeclaration=false}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "\n<!--a--> {getData=a, hasParent=false, isXmlDeclaration=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput001() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Comment", "org.jsoup.nodes.Comment", "asXmlDeclaration", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.jsoup.nodes.Comment", "setBaseUri", "java.lang.String", "\t"}, {"org.jsoup.nodes.Comment", "coreValue", "java.lang.String", "1.25"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "\n<!--1.25--> {getData=1.25, hasParent=false, isXmlDeclaration=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput002() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Comment", "org.jsoup.nodes.Comment", "absUrl", new String[]{"java.lang.String"}, new String[]{"<"}, false, 2, new String[][]{{"org.jsoup.nodes.Comment", "getData", ""}, {"org.jsoup.nodes.Comment", "asXmlDeclaration", ""}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("", String.valueOf(actual));
  assertEquals("receiver state after the call", "\n<!--sample--> {getData=sample, hasParent=false, isXmlDeclaration=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput003() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Comment", "org.jsoup.nodes.Comment", "ensureChildNodes", new String[]{}, new String[]{}, false, 17, new String[][]{{"org.jsoup.nodes.Comment", "coreValue", "java.lang.String", "?tre"}}, 2);
  assertNotNull(actual);
  assertEquals("java.util.Collections$EmptyList", actual.getClass().getName());
  assertEquals("[]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "\n<!--?tre--> {getData=?tre, hasParent=false, isXmlDeclaration=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput004() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jsoup.nodes.Comment", "org.jsoup.nodes.Comment", "filter", new String[]{"org.jsoup.select.NodeFilter"}, new String[]{"<sample:5>"}, false, 1, new String[][]{{"org.jsoup.nodes.Comment", "coreValue", "java.lang.String", "!1L"}}), new String[][]{{"filter", "org.jsoup.select.NodeFilter", "2"}});
  assertNotNull(actual);
  assertEquals("org.jsoup.nodes.Comment", actual.getClass().getName());
  assertEquals("\n<!--!1L--> {getData=!1L, hasParent=false, isXmlDeclaration=true}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "\n<!--!1L--> {getData=!1L, hasParent=false, isXmlDeclaration=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput005() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jsoup.nodes.Comment", "org.jsoup.nodes.Comment", "wrap", new String[]{"java.lang.String"}, new String[]{"abc"}, false, 0, new String[][]{{"org.jsoup.nodes.Comment", "after", "org.jsoup.nodes.Node", "<sample:2>"}}, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput006() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Comment", "org.jsoup.nodes.Comment", "baseUri", new String[]{}, new String[]{}, false, 4, new String[][]{}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("", String.valueOf(actual));
  assertEquals("receiver state after the call", "\n<!--a--> {getData=a, hasParent=false, isXmlDeclaration=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput007() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Comment", "org.jsoup.nodes.Comment", "baseUri", new String[]{}, new String[]{}, false, 5, new String[][]{}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("", String.valueOf(actual));
  assertEquals("receiver state after the call", "\n<!--0--> {getData=0, hasParent=false, isXmlDeclaration=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput008() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Comment", "org.jsoup.nodes.Comment", "baseUri", new String[]{}, new String[]{}, false, 6, new String[][]{}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("", String.valueOf(actual));
  assertEquals("receiver state after the call", "\n<!--sample--> {getData=sample, hasParent=false, isXmlDeclaration=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput009() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Comment", "org.jsoup.nodes.Comment", "baseUri", new String[]{}, new String[]{}, false, 23, new String[][]{{"org.jsoup.nodes.Comment", "after", "java.lang.String", "i"}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("", String.valueOf(actual));
  assertEquals("receiver state after the call", "\n<!----> {getData=, hasParent=false, isXmlDeclaration=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput010() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Comment", "org.jsoup.nodes.Comment", "baseUri", new String[]{}, new String[]{}, false, 24, new String[][]{{"org.jsoup.nodes.Comment", "after", "java.lang.String", "i"}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("", String.valueOf(actual));
  assertEquals("receiver state after the call", "\n<!--a--> {getData=a, hasParent=false, isXmlDeclaration=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput011() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Comment", "org.jsoup.nodes.Comment", "baseUri", new String[]{}, new String[]{}, false, 25, new String[][]{{"org.jsoup.nodes.Comment", "after", "java.lang.String", "i"}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("", String.valueOf(actual));
  assertEquals("receiver state after the call", "\n<!--0--> {getData=0, hasParent=false, isXmlDeclaration=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput012() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Comment", "org.jsoup.nodes.Comment", "siblingIndex", new String[]{}, new String[]{}, false, 8, new String[][]{{"org.jsoup.nodes.Comment", "childNodesCopy", ""}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "\n<!--a--> {getData=a, hasParent=false, isXmlDeclaration=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput013() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Comment", "org.jsoup.nodes.Comment", "siblingIndex", new String[]{}, new String[]{}, false, 9, new String[][]{}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "\n<!--0--> {getData=0, hasParent=false, isXmlDeclaration=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput014() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Comment", "org.jsoup.nodes.Comment", "siblingIndex", new String[]{}, new String[]{}, false, 10, new String[][]{}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "\n<!--sample--> {getData=sample, hasParent=false, isXmlDeclaration=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput015() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Comment", "org.jsoup.nodes.Comment", "siblingIndex", new String[]{}, new String[]{}, false, 11, new String[][]{}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "\n<!----> {getData=, hasParent=false, isXmlDeclaration=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput016() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Comment", "org.jsoup.nodes.Comment", "absUrl", new String[]{"java.lang.String"}, new String[]{"1.25"}, false, 0, null, 3);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("", String.valueOf(actual));
  assertEquals("receiver state after the call", "\n<!--a--> {getData=a, hasParent=false, isXmlDeclaration=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput017() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Comment", "org.jsoup.nodes.Comment", "hasAttributes", new String[]{}, new String[]{}, false, 6, new String[][]{{"org.jsoup.nodes.Comment", "ownerDocument", ""}, {"org.jsoup.nodes.Comment", "isXmlDeclaration", ""}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "\n<!--sample--> {getData=sample, hasParent=false, isXmlDeclaration=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput018() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Comment", "org.jsoup.nodes.Comment", "hasAttributes", new String[]{}, new String[]{}, false, 7, new String[][]{{"org.jsoup.nodes.Comment", "ownerDocument", ""}, {"org.jsoup.nodes.Comment", "isXmlDeclaration", ""}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "\n<!----> {getData=, hasParent=false, isXmlDeclaration=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput019() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Comment", "org.jsoup.nodes.Comment", "hasAttributes", new String[]{}, new String[]{}, false, 8, new String[][]{{"org.jsoup.nodes.Comment", "ownerDocument", ""}, {"org.jsoup.nodes.Comment", "isXmlDeclaration", ""}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "\n<!--a--> {getData=a, hasParent=false, isXmlDeclaration=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput020() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Comment", "org.jsoup.nodes.Comment", "hasAttributes", new String[]{}, new String[]{}, false, 9, new String[][]{{"org.jsoup.nodes.Comment", "ownerDocument", ""}, {"org.jsoup.nodes.Comment", "isXmlDeclaration", ""}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "\n<!--0--> {getData=0, hasParent=false, isXmlDeclaration=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput021() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Comment", "org.jsoup.nodes.Comment", "getData", new String[]{}, new String[]{}, false, 3, new String[][]{}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("", String.valueOf(actual));
  assertEquals("receiver state after the call", "\n<!----> {getData=, hasParent=false, isXmlDeclaration=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput022() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Comment", "org.jsoup.nodes.Comment", "getData", new String[]{}, new String[]{}, false, 4, new String[][]{{"org.jsoup.nodes.Comment", "coreValue", ""}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("a", String.valueOf(actual));
  assertEquals("receiver state after the call", "\n<!--a--> {getData=a, hasParent=false, isXmlDeclaration=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput023() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Comment", "org.jsoup.nodes.Comment", "getData", new String[]{}, new String[]{}, false, 5, new String[][]{{"org.jsoup.nodes.Comment", "coreValue", ""}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "\n<!--0--> {getData=0, hasParent=false, isXmlDeclaration=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput024() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Comment", "org.jsoup.nodes.Comment", "getData", new String[]{}, new String[]{}, false, 6, new String[][]{{"org.jsoup.nodes.Comment", "coreValue", ""}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("sample", String.valueOf(actual));
  assertEquals("receiver state after the call", "\n<!--sample--> {getData=sample, hasParent=false, isXmlDeclaration=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput025() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Comment", "org.jsoup.nodes.Comment", "coreValue", new String[]{"java.lang.String"}, new String[]{"H20{0,03-30T25:6161"}, false, 3, new String[][]{{"org.jsoup.nodes.Comment", "parentNode", ""}}, 2);
  assertNull(actual);
  assertEquals("receiver state after the call", "\n<!--H20{0,03-30T25:6161--> {getData=H20{0,03-30T25:6161, hasParent=false, isXmlDeclaration=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput026() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Comment", "org.jsoup.nodes.Comment", "coreValue", new String[]{"java.lang.String"}, new String[]{"H20{0,03-30T25:6161http://example.com/a?b=c"}, false, 3, new String[][]{{"org.jsoup.nodes.Comment", "parentNode", ""}}, 2);
  assertNull(actual);
  assertEquals("receiver state after the call", "\n<!--H20{0,03-30T25:6161http://example.com/a?b=c--> {getData=H20{0,03-30T25:6161http://example.com/a?b=c, hasParent=false, isXmlDeclaration=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput027() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Comment", "org.jsoup.nodes.Comment", "coreValue", new String[]{"java.lang.String"}, new String[]{"H20{0,03-30T25:6161http://example.com0a?b=c"}, false, 3, new String[][]{{"org.jsoup.nodes.Comment", "parentNode", ""}}, 2);
  assertNull(actual);
  assertEquals("receiver state after the call", "\n<!--H20{0,03-30T25:6161http://example.com0a?b=c--> {getData=H20{0,03-30T25:6161http://example.com0a?b=c, hasParent=false, isXmlDeclaration=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput028() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Comment", "org.jsoup.nodes.Comment", "coreValue", new String[]{"java.lang.String"}, new String[]{"0x123456789"}, false, 3, new String[][]{{"org.jsoup.nodes.Comment", "parentNode", ""}}, 2);
  assertNull(actual);
  assertEquals("receiver state after the call", "\n<!--0x123456789--> {getData=0x123456789, hasParent=false, isXmlDeclaration=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput029() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Comment", "org.jsoup.nodes.Comment", "coreValue", new String[]{"java.lang.String"}, new String[]{"0x123356789"}, false, 3, new String[][]{{"org.jsoup.nodes.Comment", "parentNode", ""}}, 2);
  assertNull(actual);
  assertEquals("receiver state after the call", "\n<!--0x123356789--> {getData=0x123356789, hasParent=false, isXmlDeclaration=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput030() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jsoup.nodes.Comment", "org.jsoup.nodes.Comment", "childNodesCopy", new String[]{}, new String[]{}, false, 15, new String[][]{{"org.jsoup.nodes.Comment", "coreValue", ""}, {"org.jsoup.nodes.Comment", "childNodesCopy", ""}, {"org.jsoup.nodes.Comment", "outerHtml", "java.lang.Appendable", "<sample:0>"}}, 2), new String[][]{{"isEmpty", "", "3"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
  assertEquals("receiver state after the call", "\n<!----> {getData=, hasParent=false, isXmlDeclaration=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput031() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jsoup.nodes.Comment", "org.jsoup.nodes.Comment", "childNodesCopy", new String[]{}, new String[]{}, false, 16, new String[][]{{"org.jsoup.nodes.Comment", "coreValue", ""}, {"org.jsoup.nodes.Comment", "childNodesCopy", ""}, {"org.jsoup.nodes.Comment", "outerHtml", "java.lang.Appendable", "<sample:0>"}}, 2), new String[][]{{"isEmpty", "", "3"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
  assertEquals("receiver state after the call", "\n<!--a--> {getData=a, hasParent=false, isXmlDeclaration=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput032() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Comment", "org.jsoup.nodes.Comment", "filter", new String[]{"org.jsoup.select.NodeFilter"}, new String[]{"<sample:0>"}, false, 0, null, 1);
  assertNotNull(actual);
  assertEquals("org.jsoup.nodes.Comment", actual.getClass().getName());
  assertEquals("\n<!--a--> {getData=a, hasParent=false, isXmlDeclaration=false}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "\n<!--a--> {getData=a, hasParent=false, isXmlDeclaration=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput033() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Comment", "org.jsoup.nodes.Comment", "html", new String[]{"java.lang.Appendable"}, new String[]{"<sample:0>"}, false, 0, null, 3);
  assertNotNull(actual);
  assertEquals("java.lang.StringBuilder", actual.getClass().getName());
  assertEquals("\n<!--a-->", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "\n<!--a--> {getData=a, hasParent=false, isXmlDeclaration=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput034() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jsoup.nodes.Comment", "org.jsoup.nodes.Comment", "html", new String[]{"java.lang.Appendable"}, new String[]{"<sample:0>"}, false, 0, null, 3), new String[][]{{"append", "int", "7"}});
  assertNotNull(actual);
  assertEquals("java.lang.StringBuilder", actual.getClass().getName());
  assertEquals("\n<!--a-->4", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "\n<!--a--> {getData=a, hasParent=false, isXmlDeclaration=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput035() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jsoup.nodes.Comment", "org.jsoup.nodes.Comment", "html", new String[]{"java.lang.Appendable"}, new String[]{"<sample:2>"}, false, 0, null, 3), new String[][]{{"append", "int", "7"}, {"compareTo", "java.lang.StringBuilder", "2"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("-105", String.valueOf(actual));
  assertEquals("receiver state after the call", "\n<!--a--> {getData=a, hasParent=false, isXmlDeclaration=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput036() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jsoup.nodes.Comment", "org.jsoup.nodes.Comment", "html", new String[]{"java.lang.Appendable"}, new String[]{"<sample:1>"}, false, 14, new String[][]{}, 3), new String[][]{{"append", "int", "7"}, {"compareTo", "java.lang.StringBuilder", "2"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("-105", String.valueOf(actual));
  assertEquals("receiver state after the call", "\n<!--sample--> {getData=sample, hasParent=false, isXmlDeclaration=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput037() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jsoup.nodes.Comment", "org.jsoup.nodes.Comment", "html", new String[]{"java.lang.Appendable"}, new String[]{"<null>"}, false, 14, new String[][]{}, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput038() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Comment", "org.jsoup.nodes.Comment", "filter", new String[]{"org.jsoup.select.NodeFilter"}, new String[]{"<sample:4>"}, false, 0, null, 2);
  assertNotNull(actual);
  assertEquals("org.jsoup.nodes.Comment", actual.getClass().getName());
  assertEquals("\n<!--a--> {getData=a, hasParent=false, isXmlDeclaration=false}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "\n<!--a--> {getData=a, hasParent=false, isXmlDeclaration=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput039() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Comment", "org.jsoup.nodes.Comment", "filter", new String[]{"org.jsoup.select.NodeFilter"}, new String[]{"<sample:7>"}, false, 14, new String[][]{}, 2);
  assertNotNull(actual);
  assertEquals("org.jsoup.nodes.Comment", actual.getClass().getName());
  assertEquals("\n<!--sample--> {getData=sample, hasParent=false, isXmlDeclaration=false}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "\n<!--sample--> {getData=sample, hasParent=false, isXmlDeclaration=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput040() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Comment", "org.jsoup.nodes.Comment", "filter", new String[]{"org.jsoup.select.NodeFilter"}, new String[]{"<sample:3>"}, false, 0, new String[][]{{"org.jsoup.nodes.Comment", "clearAttributes", ""}}, 2);
  assertNotNull(actual);
  assertEquals("org.jsoup.nodes.Comment", actual.getClass().getName());
  assertEquals("\n<!----> {getData=, hasParent=false, isXmlDeclaration=false}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "\n<!----> {getData=, hasParent=false, isXmlDeclaration=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput041() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jsoup.nodes.Comment", "org.jsoup.nodes.Comment", "replaceChild", new String[]{"org.jsoup.nodes.Node", "org.jsoup.nodes.Node"}, new String[]{"<sample:5>", "<sample:5>"}, false, 3, new String[][]{{"org.jsoup.nodes.Comment", "childNodesAsArray", ""}}, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput042() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Comment", "org.jsoup.nodes.Comment", "reparentChild", new String[]{"org.jsoup.nodes.Node"}, new String[]{"<sample:3>"}, false, 0, null, 1);
  assertNull(actual);
  assertEquals("receiver state after the call", "\n<!--a--> {getData=a, hasParent=false, isXmlDeclaration=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput043() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jsoup.nodes.Comment", "org.jsoup.nodes.Comment", "reparentChild", new String[]{"org.jsoup.nodes.Node"}, new String[]{"<null>"}, false, 0, new String[][]{{"org.jsoup.nodes.Comment", "childNode", "int", "-1"}}, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput044() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Comment", "org.jsoup.nodes.Comment", "childNodesAsArray", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.jsoup.nodes.Comment", "nodeName", ""}}, 2);
  assertNotNull(actual);
  assertEquals("[Lorg.jsoup.nodes.Node;", actual.getClass().getName());
  assertEquals("[]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "\n<!--a--> {getData=a, hasParent=false, isXmlDeclaration=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput045() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Comment", "org.jsoup.nodes.Comment", "childNodesAsArray", new String[]{}, new String[]{}, false, 1, new String[][]{{"org.jsoup.nodes.Comment", "nodeName", ""}}, 2);
  assertNotNull(actual);
  assertEquals("[Lorg.jsoup.nodes.Node;", actual.getClass().getName());
  assertEquals("[]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "\n<!--0--> {getData=0, hasParent=false, isXmlDeclaration=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput046() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Comment", "org.jsoup.nodes.Comment", "getData", new String[]{}, new String[]{}, false, 16, new String[][]{{"org.jsoup.nodes.Comment", "before", "java.lang.String", "1.5f"}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("a", String.valueOf(actual));
  assertEquals("receiver state after the call", "\n<!--a--> {getData=a, hasParent=false, isXmlDeclaration=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput047() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Comment", "org.jsoup.nodes.Comment", "getData", new String[]{}, new String[]{}, false, 17, new String[][]{{"org.jsoup.nodes.Comment", "before", "java.lang.String", "1.5f"}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "\n<!--0--> {getData=0, hasParent=false, isXmlDeclaration=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput048() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Comment", "org.jsoup.nodes.Comment", "getData", new String[]{}, new String[]{}, false, 18, new String[][]{{"org.jsoup.nodes.Comment", "outerHtml", "java.lang.Appendable", "<null>"}, {"org.jsoup.nodes.Comment", "before", "java.lang.String", "1.5f"}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("sample", String.valueOf(actual));
  assertEquals("receiver state after the call", "\n<!--sample--> {getData=sample, hasParent=false, isXmlDeclaration=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput049() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Comment", "org.jsoup.nodes.Comment", "getData", new String[]{}, new String[]{}, false, 19, new String[][]{{"org.jsoup.nodes.Comment", "before", "java.lang.String", "1.5f"}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("", String.valueOf(actual));
  assertEquals("receiver state after the call", "\n<!----> {getData=, hasParent=false, isXmlDeclaration=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput050() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jsoup.nodes.Comment", "org.jsoup.nodes.Comment", "childNodesCopy", new String[]{}, new String[]{}, false, 2, new String[][]{}, 1), new String[][]{{"set", "int,java.lang.Object", "3"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IndexOutOfBoundsException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput051() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Comment", "org.jsoup.nodes.Comment", "doSetBaseUri", new String[]{"java.lang.String"}, new String[]{"==a>b</>"}, false, 0, new String[][]{{"org.jsoup.nodes.Comment", "nodelistChanged", ""}}, 2);
  assertNull(actual);
  assertEquals("receiver state after the call", "\n<!--a--> {getData=a, hasParent=false, isXmlDeclaration=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput052() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Comment", "org.jsoup.nodes.Comment", "outerHtml", new String[]{}, new String[]{}, false, 1, new String[][]{}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("\n<!--0-->", String.valueOf(actual));
  assertEquals("receiver state after the call", "\n<!--0--> {getData=0, hasParent=false, isXmlDeclaration=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput053() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Comment", "org.jsoup.nodes.Comment", "outerHtml", new String[]{}, new String[]{}, false, 2, new String[][]{}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("\n<!--sample-->", String.valueOf(actual));
  assertEquals("receiver state after the call", "\n<!--sample--> {getData=sample, hasParent=false, isXmlDeclaration=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput054() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Comment", "org.jsoup.nodes.Comment", "outerHtml", new String[]{}, new String[]{}, false, 3, new String[][]{}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("\n<!---->", String.valueOf(actual));
  assertEquals("receiver state after the call", "\n<!----> {getData=, hasParent=false, isXmlDeclaration=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput055() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Comment", "org.jsoup.nodes.Comment", "outerHtml", new String[]{}, new String[]{}, false, 4, new String[][]{}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("\n<!--a-->", String.valueOf(actual));
  assertEquals("receiver state after the call", "\n<!--a--> {getData=a, hasParent=false, isXmlDeclaration=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput056() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Comment", "org.jsoup.nodes.Comment", "siblingIndex", new String[]{}, new String[]{}, false, 1, new String[][]{{"org.jsoup.nodes.Comment", "nodeName", ""}, {"org.jsoup.nodes.Comment", "removeChild", "org.jsoup.nodes.Node", "<sample:1>"}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "\n<!--0--> {getData=0, hasParent=false, isXmlDeclaration=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput057() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Comment", "org.jsoup.nodes.Comment", "siblingIndex", new String[]{}, new String[]{}, false, 2, new String[][]{{"org.jsoup.nodes.Comment", "nodeName", ""}, {"org.jsoup.nodes.Comment", "removeChild", "org.jsoup.nodes.Node", "<sample:1>"}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "\n<!--sample--> {getData=sample, hasParent=false, isXmlDeclaration=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput058() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Comment", "org.jsoup.nodes.Comment", "siblingIndex", new String[]{}, new String[]{}, false, 3, new String[][]{{"org.jsoup.nodes.Comment", "removeChild", "org.jsoup.nodes.Node", "<sample:3>"}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "\n<!----> {getData=, hasParent=false, isXmlDeclaration=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput059() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Comment", "org.jsoup.nodes.Comment", "siblingIndex", new String[]{}, new String[]{}, false, 4, new String[][]{{"org.jsoup.nodes.Comment", "removeChild", "org.jsoup.nodes.Node", "<sample:3>"}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "\n<!--a--> {getData=a, hasParent=false, isXmlDeclaration=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput060() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Comment", "org.jsoup.nodes.Comment", "siblingIndex", new String[]{}, new String[]{}, false, 6, new String[][]{{"org.jsoup.nodes.Comment", "setSiblingIndex", "int", "10"}, {"org.jsoup.nodes.Comment", "removeChild", "org.jsoup.nodes.Node", "<sample:3>"}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("10", String.valueOf(actual));
  assertEquals("receiver state after the call", "\n<!--sample--> {getData=sample, hasParent=false, isXmlDeclaration=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput061() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jsoup.nodes.Comment", "org.jsoup.nodes.Comment", "clone", new String[]{}, new String[]{}, false, 9, new String[][]{{"org.jsoup.nodes.Comment", "coreValue", ""}}, 2), new String[][]{{"nodeName", "", "2"}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("#comment", String.valueOf(actual));
  assertEquals("receiver state after the call", "\n<!--0--> {getData=0, hasParent=false, isXmlDeclaration=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput062() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jsoup.nodes.Comment", "org.jsoup.nodes.Comment", "clone", new String[]{}, new String[]{}, false, 10, new String[][]{{"org.jsoup.nodes.Comment", "coreValue", ""}}, 2), new String[][]{{"nodeName", "", "2"}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("#comment", String.valueOf(actual));
  assertEquals("receiver state after the call", "\n<!--sample--> {getData=sample, hasParent=false, isXmlDeclaration=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput063() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jsoup.nodes.Comment", "org.jsoup.nodes.Comment", "clone", new String[]{}, new String[]{}, false, 11, new String[][]{{"org.jsoup.nodes.Comment", "coreValue", ""}}, 2), new String[][]{{"nodeName", "", "2"}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("#comment", String.valueOf(actual));
  assertEquals("receiver state after the call", "\n<!----> {getData=, hasParent=false, isXmlDeclaration=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput064() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jsoup.nodes.Comment", "org.jsoup.nodes.Comment", "clone", new String[]{}, new String[]{}, false, 11, new String[][]{{"org.jsoup.nodes.Comment", "coreValue", ""}}, 2), new String[][]{{"nodeName", "", "2"}, {"siblingIndex", "", "7"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "\n<!----> {getData=, hasParent=false, isXmlDeclaration=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput065() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jsoup.nodes.Comment", "org.jsoup.nodes.Comment", "clone", new String[]{}, new String[]{}, false, 8, new String[][]{{"org.jsoup.nodes.Comment", "indent", "java.lang.Appendable,int,org.jsoup.nodes.Document$OutputSettings", "<null>", "-2147483648", "<sample:4>"}, {"org.jsoup.nodes.Comment", "coreValue", ""}}, 2), new String[][]{{"nodeName", "", "2"}, {"siblingIndex", "", "7"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "\n<!--a--> {getData=a, hasParent=false, isXmlDeclaration=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput066() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Comment", "org.jsoup.nodes.Comment", "attributes", new String[]{}, new String[]{}, false, 2, new String[][]{}, 3);
  assertNotNull(actual);
  assertEquals("org.jsoup.nodes.Attributes", actual.getClass().getName());
  assertEquals(" #comment=\"sample\" {size=1}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "\n<!--sample--> {getData=sample, hasParent=false, isXmlDeclaration=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput067() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Comment", "org.jsoup.nodes.Comment", "attributes", new String[]{}, new String[]{}, false, 3, new String[][]{}, 3);
  assertNotNull(actual);
  assertEquals("org.jsoup.nodes.Attributes", actual.getClass().getName());
  assertEquals(" #comment=\"\" {size=1}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "\n<!----> {getData=, hasParent=false, isXmlDeclaration=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput068() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Comment", "org.jsoup.nodes.Comment", "attributes", new String[]{}, new String[]{}, false, 4, new String[][]{}, 3);
  assertNotNull(actual);
  assertEquals("org.jsoup.nodes.Attributes", actual.getClass().getName());
  assertEquals(" #comment=\"a\" {size=1}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "\n<!--a--> {getData=a, hasParent=false, isXmlDeclaration=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput069() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Comment", "org.jsoup.nodes.Comment", "attributes", new String[]{}, new String[]{}, false, 5, new String[][]{{"org.jsoup.nodes.Comment", "childNodes", ""}}, 3);
  assertNotNull(actual);
  assertEquals("org.jsoup.nodes.Attributes", actual.getClass().getName());
  assertEquals(" #comment=\"0\" {size=1}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "\n<!--0--> {getData=0, hasParent=false, isXmlDeclaration=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput070() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Comment", "org.jsoup.nodes.Comment", "childNodes", new String[]{}, new String[]{}, false, 2, new String[][]{{"org.jsoup.nodes.Comment", "nodelistChanged", ""}, {"org.jsoup.nodes.Comment", "hasAttr", "java.lang.String", "1.25"}}, 2);
  assertNotNull(actual);
  assertEquals("java.util.Collections$UnmodifiableRandomAccessList", actual.getClass().getName());
  assertEquals("[]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "\n<!--sample--> {getData=sample, hasParent=false, isXmlDeclaration=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput071() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jsoup.nodes.Comment", "org.jsoup.nodes.Comment", "childNodes", new String[]{}, new String[]{}, false, 2, new String[][]{{"org.jsoup.nodes.Comment", "nodelistChanged", ""}, {"org.jsoup.nodes.Comment", "hasAttr", "java.lang.String", "1.25"}}, 2), new String[][]{{"containsAll", "java.util.Collection", "4"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "\n<!--sample--> {getData=sample, hasParent=false, isXmlDeclaration=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput072() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jsoup.nodes.Comment", "org.jsoup.nodes.Comment", "childNodes", new String[]{}, new String[]{}, false, 3, new String[][]{{"org.jsoup.nodes.Comment", "nodelistChanged", ""}, {"org.jsoup.nodes.Comment", "hasAttr", "java.lang.String", "1.25"}}, 2), new String[][]{{"containsAll", "java.util.Collection", "4"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "\n<!----> {getData=, hasParent=false, isXmlDeclaration=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput073() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Comment", "org.jsoup.nodes.Comment", "parent", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.jsoup.nodes.Comment", "doClone", "org.jsoup.nodes.Node", "<sample:3>"}}, 3);
  assertNull(actual);
  assertEquals("receiver state after the call", "\n<!--a--> {getData=a, hasParent=false, isXmlDeclaration=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput074() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Comment", "org.jsoup.nodes.Comment", "parent", new String[]{}, new String[]{}, false, 1, new String[][]{{"org.jsoup.nodes.Comment", "doClone", "org.jsoup.nodes.Node", "<sample:3>"}}, 3);
  assertNull(actual);
  assertEquals("receiver state after the call", "\n<!--0--> {getData=0, hasParent=false, isXmlDeclaration=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput075() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Comment", "org.jsoup.nodes.Comment", "parent", new String[]{}, new String[]{}, false, 2, new String[][]{{"org.jsoup.nodes.Comment", "doClone", "org.jsoup.nodes.Node", "<sample:3>"}}, 3);
  assertNull(actual);
  assertEquals("receiver state after the call", "\n<!--sample--> {getData=sample, hasParent=false, isXmlDeclaration=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput076() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Comment", "org.jsoup.nodes.Comment", "parent", new String[]{}, new String[]{}, false, 15, new String[][]{{"org.jsoup.nodes.Comment", "doClone", "org.jsoup.nodes.Node", "<sample:2>"}}, 3);
  assertNull(actual);
  assertEquals("receiver state after the call", "\n<!----> {getData=, hasParent=false, isXmlDeclaration=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput077() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Comment", "org.jsoup.nodes.Comment", "reparentChild", new String[]{"org.jsoup.nodes.Node"}, new String[]{"<sample:2>"}, false, 3, new String[][]{{"org.jsoup.nodes.Comment", "baseUri", ""}}, 2);
  assertNull(actual);
  assertEquals("receiver state after the call", "\n<!----> {getData=, hasParent=false, isXmlDeclaration=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput078() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Comment", "org.jsoup.nodes.Comment", "reparentChild", new String[]{"org.jsoup.nodes.Node"}, new String[]{"<sample:3>"}, false, 14, new String[][]{{"org.jsoup.nodes.Comment", "baseUri", ""}}, 2);
  assertNull(actual);
  assertEquals("receiver state after the call", "\n<!--sample--> {getData=sample, hasParent=false, isXmlDeclaration=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput079() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jsoup.nodes.Comment", "org.jsoup.nodes.Comment", "childNode", new String[]{"int"}, new String[]{"-2147483648"}, false, 1, new String[][]{}, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IndexOutOfBoundsException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput080() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Comment", "org.jsoup.nodes.Comment", "childNodeSize", new String[]{}, new String[]{}, false);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "\n<!--a--> {getData=a, hasParent=false, isXmlDeclaration=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput081() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Comment", "org.jsoup.nodes.Comment", "childNodeSize", new String[]{}, new String[]{}, false, 1, new String[][]{});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "\n<!--0--> {getData=0, hasParent=false, isXmlDeclaration=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput082() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Comment", "org.jsoup.nodes.Comment", "attr", new String[]{"java.lang.String"}, new String[]{"{\"a\":1}"}, false, 0, new String[][]{{"org.jsoup.nodes.Comment", "isXmlDeclaration", ""}, {"org.jsoup.nodes.Comment", "html", "java.lang.Appendable", "<sample:2>"}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("", String.valueOf(actual));
  assertEquals("receiver state after the call", "\n<!--a--> {getData=a, hasParent=false, isXmlDeclaration=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput083() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Comment", "org.jsoup.nodes.Comment", "attr", new String[]{"java.lang.String"}, new String[]{"F.5f"}, false, 1, new String[][]{{"org.jsoup.nodes.Comment", "attributes", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("", String.valueOf(actual));
  assertEquals("receiver state after the call", "\n<!--0--> {getData=0, hasParent=false, isXmlDeclaration=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput084() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Comment", "org.jsoup.nodes.Comment", "doSetBaseUri", new String[]{"java.lang.String"}, new String[]{"+1"}, false);
  assertNull(actual);
  assertEquals("receiver state after the call", "\n<!--a--> {getData=a, hasParent=false, isXmlDeclaration=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput085() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Comment", "org.jsoup.nodes.Comment", "isXmlDeclaration", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.jsoup.nodes.Comment", "childNode", "int", "2147483647"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "\n<!--a--> {getData=a, hasParent=false, isXmlDeclaration=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput086() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Comment", "org.jsoup.nodes.Comment", "isXmlDeclaration", new String[]{}, new String[]{}, false, 1, new String[][]{{"org.jsoup.nodes.Comment", "childNode", "int", "2147483647"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "\n<!--0--> {getData=0, hasParent=false, isXmlDeclaration=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput087() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jsoup.nodes.Comment", "org.jsoup.nodes.Comment", "wrap", new String[]{"java.lang.String"}, new String[]{"--1"}, false); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput088() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Comment", "org.jsoup.nodes.Comment", "setParentNode", new String[]{"org.jsoup.nodes.Node"}, new String[]{"<sample:1>"}, false, 0, new String[][]{{"org.jsoup.nodes.Comment", "outerHtml", "java.lang.Appendable", "<sample:1>"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "\n<!--a--> {getData=a, hasParent=true, isXmlDeclaration=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput089() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Comment", "org.jsoup.nodes.Comment", "setParentNode", new String[]{"org.jsoup.nodes.Node"}, new String[]{"<sample:0>"}, false, 1, new String[][]{{"org.jsoup.nodes.Comment", "outerHtml", "java.lang.Appendable", "<sample:1>"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "\n<!--0--> {getData=0, hasParent=true, isXmlDeclaration=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput090() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jsoup.nodes.Comment", "org.jsoup.nodes.Comment", "before", new String[]{"java.lang.String"}, new String[]{"http://example.com/a?b=c"}, false, 0, new String[][]{{"org.jsoup.nodes.Comment", "absUrl", "java.lang.String", "<"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput091() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Comment", "org.jsoup.nodes.Comment", "baseUri", new String[]{}, new String[]{}, false, 4, new String[][]{{"org.jsoup.nodes.Comment", "nodeName", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("", String.valueOf(actual));
  assertEquals("receiver state after the call", "\n<!--a--> {getData=a, hasParent=false, isXmlDeclaration=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput092() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Comment", "org.jsoup.nodes.Comment", "baseUri", new String[]{}, new String[]{}, false, 5, new String[][]{});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("", String.valueOf(actual));
  assertEquals("receiver state after the call", "\n<!--0--> {getData=0, hasParent=false, isXmlDeclaration=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput093() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Comment", "org.jsoup.nodes.Comment", "baseUri", new String[]{}, new String[]{}, false, 6, new String[][]{});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("", String.valueOf(actual));
  assertEquals("receiver state after the call", "\n<!--sample--> {getData=sample, hasParent=false, isXmlDeclaration=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput094() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Comment", "org.jsoup.nodes.Comment", "baseUri", new String[]{}, new String[]{}, false, 7, new String[][]{});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("", String.valueOf(actual));
  assertEquals("receiver state after the call", "\n<!----> {getData=, hasParent=false, isXmlDeclaration=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput095() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Comment", "org.jsoup.nodes.Comment", "baseUri", new String[]{}, new String[]{}, false, 14, new String[][]{{"org.jsoup.nodes.Comment", "asXmlDeclaration", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("", String.valueOf(actual));
  assertEquals("receiver state after the call", "\n<!--sample--> {getData=sample, hasParent=false, isXmlDeclaration=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput096() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Comment", "org.jsoup.nodes.Comment", "childNodesCopy", new String[]{}, new String[]{}, false);
  assertNotNull(actual);
  assertEquals("java.util.ArrayList", actual.getClass().getName());
  assertEquals("[]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "\n<!--a--> {getData=a, hasParent=false, isXmlDeclaration=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput097() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Comment", "org.jsoup.nodes.Comment", "childNodesCopy", new String[]{}, new String[]{}, false, 1, new String[][]{});
  assertNotNull(actual);
  assertEquals("java.util.ArrayList", actual.getClass().getName());
  assertEquals("[]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "\n<!--0--> {getData=0, hasParent=false, isXmlDeclaration=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput098() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Comment", "org.jsoup.nodes.Comment", "siblingIndex", new String[]{}, new String[]{}, false);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "\n<!--a--> {getData=a, hasParent=false, isXmlDeclaration=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput099() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Comment", "org.jsoup.nodes.Comment", "siblingIndex", new String[]{}, new String[]{}, false, 1, new String[][]{});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "\n<!--0--> {getData=0, hasParent=false, isXmlDeclaration=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput100() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Comment", "org.jsoup.nodes.Comment", "siblingIndex", new String[]{}, new String[]{}, false, 2, new String[][]{});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "\n<!--sample--> {getData=sample, hasParent=false, isXmlDeclaration=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput101() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Comment", "org.jsoup.nodes.Comment", "siblingIndex", new String[]{}, new String[]{}, false, 3, new String[][]{});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "\n<!----> {getData=, hasParent=false, isXmlDeclaration=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput102() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Comment", "org.jsoup.nodes.Comment", "doSetBaseUri", new String[]{"java.lang.String"}, new String[]{"-->"}, false, 1, new String[][]{{"org.jsoup.nodes.Comment", "indent", "java.lang.Appendable,int,org.jsoup.nodes.Document$OutputSettings", "<sample:0>", "2147483647", "<sample:1>"}, {"org.jsoup.nodes.Comment", "toString", ""}});
  assertNull(actual);
  assertEquals("receiver state after the call", "\n<!--0--> {getData=0, hasParent=false, isXmlDeclaration=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput103() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Comment", "org.jsoup.nodes.Comment", "outerHtmlTail", new String[]{"java.lang.Appendable", "int", "org.jsoup.nodes.Document$OutputSettings"}, new String[]{"<empty>", "1", "<sample:6>"}, false);
  assertNull(actual);
  assertEquals("receiver state after the call", "\n<!--a--> {getData=a, hasParent=false, isXmlDeclaration=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput104() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jsoup.nodes.Comment", "org.jsoup.nodes.Comment", "addChildren", new String[]{"org.jsoup.nodes.Node[]"}, new String[]{"<null>"}, false, 0, new String[][]{{"org.jsoup.nodes.Comment", "hasAttributes", ""}, {"org.jsoup.nodes.Comment", "childNode", "int", "10"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput105() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jsoup.nodes.Comment", "org.jsoup.nodes.Comment", "addChildren", new String[]{"org.jsoup.nodes.Node[]"}, new String[]{"<sample:1>"}, false, 0, new String[][]{{"org.jsoup.nodes.Comment", "hasAttributes", ""}, {"org.jsoup.nodes.Comment", "childNode", "int", "10"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.UnsupportedOperationException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput106() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Comment", "org.jsoup.nodes.Comment", "ensureChildNodes", new String[]{}, new String[]{}, false);
  assertNotNull(actual);
  assertEquals("java.util.Collections$EmptyList", actual.getClass().getName());
  assertEquals("[]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "\n<!--a--> {getData=a, hasParent=false, isXmlDeclaration=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput107() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Comment", "org.jsoup.nodes.Comment", "ensureChildNodes", new String[]{}, new String[]{}, false, 1, new String[][]{});
  assertNotNull(actual);
  assertEquals("java.util.Collections$EmptyList", actual.getClass().getName());
  assertEquals("[]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "\n<!--0--> {getData=0, hasParent=false, isXmlDeclaration=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput108() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Comment", "org.jsoup.nodes.Comment", "ensureChildNodes", new String[]{}, new String[]{}, false, 2, new String[][]{});
  assertNotNull(actual);
  assertEquals("java.util.Collections$EmptyList", actual.getClass().getName());
  assertEquals("[]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "\n<!--sample--> {getData=sample, hasParent=false, isXmlDeclaration=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput109() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Comment", "org.jsoup.nodes.Comment", "ensureChildNodes", new String[]{}, new String[]{}, false, 3, new String[][]{{"org.jsoup.nodes.Comment", "root", ""}});
  assertNotNull(actual);
  assertEquals("java.util.Collections$EmptyList", actual.getClass().getName());
  assertEquals("[]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "\n<!----> {getData=, hasParent=false, isXmlDeclaration=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput110() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jsoup.nodes.Comment", "org.jsoup.nodes.Comment", "ensureChildNodes", new String[]{}, new String[]{}, false, 4, new String[][]{{"org.jsoup.nodes.Comment", "root", ""}}), new String[][]{{"add", "int,java.lang.Object", "5"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.UnsupportedOperationException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput111() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Comment", "org.jsoup.nodes.Comment", "previousSibling", new String[]{}, new String[]{}, false);
  assertNull(actual);
  assertEquals("receiver state after the call", "\n<!--a--> {getData=a, hasParent=false, isXmlDeclaration=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput112() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Comment", "org.jsoup.nodes.Comment", "previousSibling", new String[]{}, new String[]{}, false, 1, new String[][]{});
  assertNull(actual);
  assertEquals("receiver state after the call", "\n<!--0--> {getData=0, hasParent=false, isXmlDeclaration=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput113() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Comment", "org.jsoup.nodes.Comment", "previousSibling", new String[]{}, new String[]{}, false, 2, new String[][]{});
  assertNull(actual);
  assertEquals("receiver state after the call", "\n<!--sample--> {getData=sample, hasParent=false, isXmlDeclaration=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput114() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Comment", "org.jsoup.nodes.Comment", "previousSibling", new String[]{}, new String[]{}, false, 3, new String[][]{});
  assertNull(actual);
  assertEquals("receiver state after the call", "\n<!----> {getData=, hasParent=false, isXmlDeclaration=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput115() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Comment", "org.jsoup.nodes.Comment", "absUrl", new String[]{"java.lang.String"}, new String[]{"1.25"}, false);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("", String.valueOf(actual));
  assertEquals("receiver state after the call", "\n<!--a--> {getData=a, hasParent=false, isXmlDeclaration=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput116() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Comment", "org.jsoup.nodes.Comment", "nodeName", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.jsoup.nodes.Comment", "attr", "java.lang.String", "<!--"}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("#comment", String.valueOf(actual));
  assertEquals("receiver state after the call", "\n<!--a--> {getData=a, hasParent=false, isXmlDeclaration=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput117() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Comment", "org.jsoup.nodes.Comment", "nodeName", new String[]{}, new String[]{}, false, 1, new String[][]{{"org.jsoup.nodes.Comment", "attr", "java.lang.String", "<!--"}, {"org.jsoup.nodes.Comment", "clone", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("#comment", String.valueOf(actual));
  assertEquals("receiver state after the call", "\n<!--0--> {getData=0, hasParent=false, isXmlDeclaration=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput118() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Comment", "org.jsoup.nodes.Comment", "nodeName", new String[]{}, new String[]{}, false, 2, new String[][]{{"org.jsoup.nodes.Comment", "nodeName", ""}, {"org.jsoup.nodes.Comment", "clone", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("#comment", String.valueOf(actual));
  assertEquals("receiver state after the call", "\n<!--sample--> {getData=sample, hasParent=false, isXmlDeclaration=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput119() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Comment", "org.jsoup.nodes.Comment", "nodeName", new String[]{}, new String[]{}, false, 3, new String[][]{{"org.jsoup.nodes.Comment", "nodeName", ""}, {"org.jsoup.nodes.Comment", "clone", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("#comment", String.valueOf(actual));
  assertEquals("receiver state after the call", "\n<!----> {getData=, hasParent=false, isXmlDeclaration=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput120() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Comment", "org.jsoup.nodes.Comment", "root", new String[]{}, new String[]{}, false);
  assertNotNull(actual);
  assertEquals("org.jsoup.nodes.Comment", actual.getClass().getName());
  assertEquals("\n<!--a--> {getData=a, hasParent=false, isXmlDeclaration=false}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "\n<!--a--> {getData=a, hasParent=false, isXmlDeclaration=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput121() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jsoup.nodes.Comment", "org.jsoup.nodes.Comment", "addChildren", new String[]{"int", "org.jsoup.nodes.Node[]"}, new String[]{"1", "<sample:0>"}, false); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IndexOutOfBoundsException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput122() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Comment", "org.jsoup.nodes.Comment", "root", new String[]{}, new String[]{}, false, 1, new String[][]{});
  assertNotNull(actual);
  assertEquals("org.jsoup.nodes.Comment", actual.getClass().getName());
  assertEquals("\n<!--0--> {getData=0, hasParent=false, isXmlDeclaration=false}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "\n<!--0--> {getData=0, hasParent=false, isXmlDeclaration=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput123() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Comment", "org.jsoup.nodes.Comment", "root", new String[]{}, new String[]{}, false, 2, new String[][]{});
  assertNotNull(actual);
  assertEquals("org.jsoup.nodes.Comment", actual.getClass().getName());
  assertEquals("\n<!--sample--> {getData=sample, hasParent=false, isXmlDeclaration=false}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "\n<!--sample--> {getData=sample, hasParent=false, isXmlDeclaration=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput124() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Comment", "org.jsoup.nodes.Comment", "root", new String[]{}, new String[]{}, false, 3, new String[][]{});
  assertNotNull(actual);
  assertEquals("org.jsoup.nodes.Comment", actual.getClass().getName());
  assertEquals("\n<!----> {getData=, hasParent=false, isXmlDeclaration=false}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "\n<!----> {getData=, hasParent=false, isXmlDeclaration=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput125() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Comment", "org.jsoup.nodes.Comment", "hasAttributes", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.jsoup.nodes.Comment", "isXmlDeclaration", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "\n<!--a--> {getData=a, hasParent=false, isXmlDeclaration=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput126() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Comment", "org.jsoup.nodes.Comment", "hasAttributes", new String[]{}, new String[]{}, false, 1, new String[][]{{"org.jsoup.nodes.Comment", "isXmlDeclaration", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "\n<!--0--> {getData=0, hasParent=false, isXmlDeclaration=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput127() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Comment", "org.jsoup.nodes.Comment", "hasAttributes", new String[]{}, new String[]{}, false, 2, new String[][]{{"org.jsoup.nodes.Comment", "isXmlDeclaration", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "\n<!--sample--> {getData=sample, hasParent=false, isXmlDeclaration=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput128() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Comment", "org.jsoup.nodes.Comment", "hasAttributes", new String[]{}, new String[]{}, false, 3, new String[][]{{"org.jsoup.nodes.Comment", "isXmlDeclaration", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "\n<!----> {getData=, hasParent=false, isXmlDeclaration=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput129() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Comment", "org.jsoup.nodes.Comment", "equals", new String[]{"java.lang.Object"}, new String[]{"<sample:1>"}, false);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "\n<!--a--> {getData=a, hasParent=false, isXmlDeclaration=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput130() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Comment", "org.jsoup.nodes.Comment", "equals", new String[]{"java.lang.Object"}, new String[]{"<i:1>"}, false, 1, new String[][]{});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "\n<!--0--> {getData=0, hasParent=false, isXmlDeclaration=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput131() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Comment", "org.jsoup.nodes.Comment", "equals", new String[]{"java.lang.Object"}, new String[]{"<i:29>"}, false, 1, new String[][]{{"org.jsoup.nodes.Comment", "coreValue", "java.lang.String", "-0.0"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "\n<!---0.0--> {getData=-0.0, hasParent=false, isXmlDeclaration=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput132() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Comment", "org.jsoup.nodes.Comment", "equals", new String[]{"java.lang.Object"}, new String[]{"<i:29>"}, false, 1, new String[][]{{"org.jsoup.nodes.Comment", "coreValue", "java.lang.String", "-0.0p"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "\n<!---0.0p--> {getData=-0.0p, hasParent=false, isXmlDeclaration=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput133() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Comment", "org.jsoup.nodes.Comment", "equals", new String[]{"java.lang.Object"}, new String[]{"<i:-1>"}, false, 13, new String[][]{{"org.jsoup.nodes.Comment", "coreValue", "java.lang.String", "-0.0]p"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "\n<!---0.0]p--> {getData=-0.0]p, hasParent=false, isXmlDeclaration=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput134() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Comment", "org.jsoup.nodes.Comment", "getData", new String[]{}, new String[]{}, false);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("a", String.valueOf(actual));
  assertEquals("receiver state after the call", "\n<!--a--> {getData=a, hasParent=false, isXmlDeclaration=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput135() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Comment", "org.jsoup.nodes.Comment", "getData", new String[]{}, new String[]{}, false, 1, new String[][]{});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "\n<!--0--> {getData=0, hasParent=false, isXmlDeclaration=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput136() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Comment", "org.jsoup.nodes.Comment", "getData", new String[]{}, new String[]{}, false, 2, new String[][]{});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("sample", String.valueOf(actual));
  assertEquals("receiver state after the call", "\n<!--sample--> {getData=sample, hasParent=false, isXmlDeclaration=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput137() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Comment", "org.jsoup.nodes.Comment", "getData", new String[]{}, new String[]{}, false, 3, new String[][]{});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("", String.valueOf(actual));
  assertEquals("receiver state after the call", "\n<!----> {getData=, hasParent=false, isXmlDeclaration=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput138() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Comment", "org.jsoup.nodes.Comment", "coreValue", new String[]{"java.lang.String"}, new String[]{"I"}, false, 2, new String[][]{{"org.jsoup.nodes.Comment", "parentNode", ""}});
  assertNull(actual);
  assertEquals("receiver state after the call", "\n<!--I--> {getData=I, hasParent=false, isXmlDeclaration=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput139() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Comment", "org.jsoup.nodes.Comment", "coreValue", new String[]{"java.lang.String"}, new String[]{"H"}, false, 2, new String[][]{{"org.jsoup.nodes.Comment", "parentNode", ""}});
  assertNull(actual);
  assertEquals("receiver state after the call", "\n<!--H--> {getData=H, hasParent=false, isXmlDeclaration=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput140() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Comment", "org.jsoup.nodes.Comment", "coreValue", new String[]{"java.lang.String"}, new String[]{"H2020-02-30T25:61:61"}, false, 2, new String[][]{{"org.jsoup.nodes.Comment", "parentNode", ""}});
  assertNull(actual);
  assertEquals("receiver state after the call", "\n<!--H2020-02-30T25:61:61--> {getData=H2020-02-30T25:61:61, hasParent=false, isXmlDeclaration=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput141() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Comment", "org.jsoup.nodes.Comment", "coreValue", new String[]{"java.lang.String"}, new String[]{"H2020,02-30T25:61:61"}, false, 2, new String[][]{{"org.jsoup.nodes.Comment", "parentNode", ""}});
  assertNull(actual);
  assertEquals("receiver state after the call", "\n<!--H2020,02-30T25:61:61--> {getData=H2020,02-30T25:61:61, hasParent=false, isXmlDeclaration=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput142() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Comment", "org.jsoup.nodes.Comment", "coreValue", new String[]{"java.lang.String"}, new String[]{"H2020,02-30T25:6161"}, false, 3, new String[][]{{"org.jsoup.nodes.Comment", "parentNode", ""}});
  assertNull(actual);
  assertEquals("receiver state after the call", "\n<!--H2020,02-30T25:6161--> {getData=H2020,02-30T25:6161, hasParent=false, isXmlDeclaration=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput143() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jsoup.nodes.Comment", "org.jsoup.nodes.Comment", "childNodesCopy", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.jsoup.nodes.Comment", "coreValue", ""}, {"org.jsoup.nodes.Comment", "outerHtml", "java.lang.Appendable", "<sample:0>"}}), new String[][]{{"isEmpty", "", "3"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
  assertEquals("receiver state after the call", "\n<!--a--> {getData=a, hasParent=false, isXmlDeclaration=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput144() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jsoup.nodes.Comment", "org.jsoup.nodes.Comment", "childNodesCopy", new String[]{}, new String[]{}, false, 7, new String[][]{{"org.jsoup.nodes.Comment", "coreValue", ""}, {"org.jsoup.nodes.Comment", "outerHtml", "java.lang.Appendable", "<sample:0>"}}), new String[][]{{"isEmpty", "", "3"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
  assertEquals("receiver state after the call", "\n<!----> {getData=, hasParent=false, isXmlDeclaration=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput145() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jsoup.nodes.Comment", "org.jsoup.nodes.Comment", "childNodesCopy", new String[]{}, new String[]{}, false, 14, new String[][]{{"org.jsoup.nodes.Comment", "coreValue", ""}, {"org.jsoup.nodes.Comment", "childNodesCopy", ""}, {"org.jsoup.nodes.Comment", "outerHtml", "java.lang.Appendable", "<sample:0>"}}), new String[][]{{"isEmpty", "", "3"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
  assertEquals("receiver state after the call", "\n<!--sample--> {getData=sample, hasParent=false, isXmlDeclaration=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput146() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Comment", "org.jsoup.nodes.Comment", "filter", new String[]{"org.jsoup.select.NodeFilter"}, new String[]{"<sample:4>"}, false);
  assertNotNull(actual);
  assertEquals("org.jsoup.nodes.Comment", actual.getClass().getName());
  assertEquals("\n<!--a--> {getData=a, hasParent=false, isXmlDeclaration=false}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "\n<!--a--> {getData=a, hasParent=false, isXmlDeclaration=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput147() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jsoup.nodes.Comment", "org.jsoup.nodes.Comment", "filter", new String[]{"org.jsoup.select.NodeFilter"}, new String[]{"<sample:4>"}, false), new String[][]{{"siblingIndex", "", "7"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "\n<!--a--> {getData=a, hasParent=false, isXmlDeclaration=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput148() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jsoup.nodes.Comment", "org.jsoup.nodes.Comment", "removeAttr", new String[]{"java.lang.String"}, new String[]{"Title"}, false), new String[][]{{"childNodesCopy", "", "2"}});
  assertNotNull(actual);
  assertEquals("java.util.ArrayList", actual.getClass().getName());
  assertEquals("[]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "\n<!--a--> {getData=a, hasParent=false, isXmlDeclaration=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput149() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jsoup.nodes.Comment", "org.jsoup.nodes.Comment", "removeAttr", new String[]{"java.lang.String"}, new String[]{"Title"}, false, 14, new String[][]{}), new String[][]{{"childNodesCopy", "", "2"}});
  assertNotNull(actual);
  assertEquals("java.util.ArrayList", actual.getClass().getName());
  assertEquals("[]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "\n<!--sample--> {getData=sample, hasParent=false, isXmlDeclaration=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput150() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jsoup.nodes.Comment", "org.jsoup.nodes.Comment", "removeAttr", new String[]{"java.lang.String"}, new String[]{"Title"}, false, 14, new String[][]{{"org.jsoup.nodes.Comment", "setParentNode", "org.jsoup.nodes.Node", "<sample:4>"}}), new String[][]{{"childNodesCopy", "", "2"}});
  assertNotNull(actual);
  assertEquals("java.util.ArrayList", actual.getClass().getName());
  assertEquals("[]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "\n<!--sample--> {getData=sample, hasParent=true, isXmlDeclaration=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput151() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jsoup.nodes.Comment", "org.jsoup.nodes.Comment", "removeAttr", new String[]{"java.lang.String"}, new String[]{""}, false, 14, new String[][]{}), new String[][]{{"childNodesCopy", "", "2"}, {"addAll", "int,java.util.Collection", "6"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IndexOutOfBoundsException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput152() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jsoup.nodes.Comment", "org.jsoup.nodes.Comment", "removeAttr", new String[]{"java.lang.String"}, new String[]{"5"}, false, 4, new String[][]{{"org.jsoup.nodes.Comment", "nodelistChanged", ""}}), new String[][]{{"root", "", "2"}, {"asXmlDeclaration", "", "6"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.StringIndexOutOfBoundsException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput153() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Comment", "org.jsoup.nodes.Comment", "html", new String[]{"java.lang.Appendable"}, new String[]{"<empty>"}, false);
  assertNotNull(actual);
  assertEquals("java.lang.StringBuilder", actual.getClass().getName());
  assertEquals("\n<!--a-->", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "\n<!--a--> {getData=a, hasParent=false, isXmlDeclaration=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput154() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Comment", "org.jsoup.nodes.Comment", "childNodes", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.jsoup.nodes.Comment", "hasAttr", "java.lang.String", "0x1F"}});
  assertNotNull(actual);
  assertEquals("java.util.Collections$UnmodifiableRandomAccessList", actual.getClass().getName());
  assertEquals("[]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "\n<!--a--> {getData=a, hasParent=false, isXmlDeclaration=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput155() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jsoup.nodes.Comment", "org.jsoup.nodes.Comment", "childNodes", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.jsoup.nodes.Comment", "hasAttr", "java.lang.String", "0x1F"}}), new String[][]{{"containsAll", "java.util.Collection", "2"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "\n<!--a--> {getData=a, hasParent=false, isXmlDeclaration=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput156() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jsoup.nodes.Comment", "org.jsoup.nodes.Comment", "childNodes", new String[]{}, new String[]{}, false, 1, new String[][]{{"org.jsoup.nodes.Comment", "hasAttr", "java.lang.String", "0x1\u00e9a b"}}), new String[][]{{"containsAll", "java.util.Collection", "2"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "\n<!--0--> {getData=0, hasParent=false, isXmlDeclaration=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput157() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Comment", "org.jsoup.nodes.Comment", "childNodes", new String[]{}, new String[]{}, false, 2, new String[][]{{"org.jsoup.nodes.Comment", "hasAttr", "java.lang.String", "0x1\u00e9a b"}});
  assertNotNull(actual);
  assertEquals("java.util.Collections$UnmodifiableRandomAccessList", actual.getClass().getName());
  assertEquals("[]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "\n<!--sample--> {getData=sample, hasParent=false, isXmlDeclaration=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput158() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Comment", "org.jsoup.nodes.Comment", "childNodes", new String[]{}, new String[]{}, false, 3, new String[][]{{"org.jsoup.nodes.Comment", "hasAttr", "java.lang.String", "0x"}});
  assertNotNull(actual);
  assertEquals("java.util.Collections$UnmodifiableRandomAccessList", actual.getClass().getName());
  assertEquals("[]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "\n<!----> {getData=, hasParent=false, isXmlDeclaration=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput159() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Comment", "org.jsoup.nodes.Comment", "ownerDocument", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.jsoup.nodes.Comment", "outerHtmlHead", "java.lang.Appendable,int,org.jsoup.nodes.Document$OutputSettings", "<sample:2>", "-2147483648", "<sample:4>"}, {"org.jsoup.nodes.Comment", "childNodeSize", ""}});
  assertNull(actual);
  assertEquals("receiver state after the call", "\n<!--a--> {getData=a, hasParent=false, isXmlDeclaration=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput160() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Comment", "org.jsoup.nodes.Comment", "ownerDocument", new String[]{}, new String[]{}, false, 1, new String[][]{{"org.jsoup.nodes.Comment", "outerHtmlHead", "java.lang.Appendable,int,org.jsoup.nodes.Document$OutputSettings", "<sample:2>", "-2147483648", "<sample:4>"}, {"org.jsoup.nodes.Comment", "childNodeSize", ""}});
  assertNull(actual);
  assertEquals("receiver state after the call", "\n<!--0--> {getData=0, hasParent=false, isXmlDeclaration=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput161() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Comment", "org.jsoup.nodes.Comment", "ownerDocument", new String[]{}, new String[]{}, false, 2, new String[][]{{"org.jsoup.nodes.Comment", "outerHtmlHead", "java.lang.Appendable,int,org.jsoup.nodes.Document$OutputSettings", "<sample:2>", "-2147483648", "<sample:4>"}, {"org.jsoup.nodes.Comment", "childNodeSize", ""}, {"org.jsoup.nodes.Comment", "parent", ""}});
  assertNull(actual);
  assertEquals("receiver state after the call", "\n<!--sample--> {getData=sample, hasParent=false, isXmlDeclaration=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput162() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Comment", "org.jsoup.nodes.Comment", "ownerDocument", new String[]{}, new String[]{}, false, 3, new String[][]{{"org.jsoup.nodes.Comment", "outerHtmlHead", "java.lang.Appendable,int,org.jsoup.nodes.Document$OutputSettings", "<sample:2>", "-2147483648", "<sample:4>"}, {"org.jsoup.nodes.Comment", "childNodeSize", ""}, {"org.jsoup.nodes.Comment", "parent", ""}});
  assertNull(actual);
  assertEquals("receiver state after the call", "\n<!----> {getData=, hasParent=false, isXmlDeclaration=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput163() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jsoup.nodes.Comment", "org.jsoup.nodes.Comment", "asXmlDeclaration", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.jsoup.nodes.Comment", "nodelistChanged", ""}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.StringIndexOutOfBoundsException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput164() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Comment", "org.jsoup.nodes.Comment", "asXmlDeclaration", new String[]{}, new String[]{}, false, 2, new String[][]{{"org.jsoup.nodes.Comment", "nodelistChanged", ""}});
  assertNotNull(actual);
  assertEquals("org.jsoup.nodes.XmlDeclaration", actual.getClass().getName());
  assertEquals("<?ampl?> {getWholeDeclaration=, hasParent=false}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "\n<!--sample--> {getData=sample, hasParent=false, isXmlDeclaration=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput165() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Comment", "org.jsoup.nodes.Comment", "childNodesAsArray", new String[]{}, new String[]{}, false);
  assertNotNull(actual);
  assertEquals("[Lorg.jsoup.nodes.Node;", actual.getClass().getName());
  assertEquals("[]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "\n<!--a--> {getData=a, hasParent=false, isXmlDeclaration=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput166() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Comment", "org.jsoup.nodes.Comment", "childNodesAsArray", new String[]{}, new String[]{}, false, 1, new String[][]{});
  assertNotNull(actual);
  assertEquals("[Lorg.jsoup.nodes.Node;", actual.getClass().getName());
  assertEquals("[]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "\n<!--0--> {getData=0, hasParent=false, isXmlDeclaration=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput167() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Comment", "org.jsoup.nodes.Comment", "childNodesAsArray", new String[]{}, new String[]{}, false, 2, new String[][]{});
  assertNotNull(actual);
  assertEquals("[Lorg.jsoup.nodes.Node;", actual.getClass().getName());
  assertEquals("[]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "\n<!--sample--> {getData=sample, hasParent=false, isXmlDeclaration=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput168() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Comment", "org.jsoup.nodes.Comment", "childNodesAsArray", new String[]{}, new String[]{}, false, 3, new String[][]{});
  assertNotNull(actual);
  assertEquals("[Lorg.jsoup.nodes.Node;", actual.getClass().getName());
  assertEquals("[]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "\n<!----> {getData=, hasParent=false, isXmlDeclaration=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput169() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Comment", "org.jsoup.nodes.Comment", "hasAttr", new String[]{"java.lang.String"}, new String[]{"I"}, false);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "\n<!--a--> {getData=a, hasParent=false, isXmlDeclaration=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput170() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jsoup.nodes.Comment", "org.jsoup.nodes.Comment", "replaceChild", new String[]{"org.jsoup.nodes.Node", "org.jsoup.nodes.Node"}, new String[]{"<null>", "<sample:6>"}, false, 3, new String[][]{{"org.jsoup.nodes.Comment", "childNodesAsArray", ""}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput171() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jsoup.nodes.Comment", "org.jsoup.nodes.Comment", "replaceChild", new String[]{"org.jsoup.nodes.Node", "org.jsoup.nodes.Node"}, new String[]{"<sample:5>", "<sample:5>"}, false, 3, new String[][]{{"org.jsoup.nodes.Comment", "childNodesAsArray", ""}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput172() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jsoup.nodes.Comment", "org.jsoup.nodes.Comment", "childNode", new String[]{"int"}, new String[]{"-1"}, false, 0, new String[][]{{"org.jsoup.nodes.Comment", "root", ""}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IndexOutOfBoundsException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput173() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Comment", "org.jsoup.nodes.Comment", "attr", new String[]{"java.lang.String", "java.lang.String"}, new String[]{"0x123456789", "!"}, false);
  assertNotNull(actual);
  assertEquals("org.jsoup.nodes.Comment", actual.getClass().getName());
  assertEquals("\n<!--a--> {getData=a, hasParent=false, isXmlDeclaration=false}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "\n<!--a--> {getData=a, hasParent=false, isXmlDeclaration=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput174() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Comment", "org.jsoup.nodes.Comment", "getData", new String[]{}, new String[]{}, false, 4, new String[][]{{"org.jsoup.nodes.Comment", "previousSibling", ""}, {"org.jsoup.nodes.Comment", "coreValue", "java.lang.String", "1.5f"}, {"org.jsoup.nodes.Comment", "before", "java.lang.String", "1.5f"}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("1.5f", String.valueOf(actual));
  assertEquals("receiver state after the call", "\n<!--1.5f--> {getData=1.5f, hasParent=false, isXmlDeclaration=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput175() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jsoup.nodes.Comment", "org.jsoup.nodes.Comment", "childNodesCopy", new String[]{}, new String[]{}, false), new String[][]{{"set", "int,java.lang.Object", "3"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IndexOutOfBoundsException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput176() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jsoup.nodes.Comment", "org.jsoup.nodes.Comment", "unwrap", new String[]{}, new String[]{}, false); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput177() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jsoup.nodes.Comment", "org.jsoup.nodes.Comment", "remove", new String[]{}, new String[]{}, false); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput178() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Comment", "org.jsoup.nodes.Comment", "setSiblingIndex", new String[]{"int"}, new String[]{"10"}, false);
  assertNull(actual);
  assertEquals("receiver state after the call", "\n<!--a--> {getData=a, hasParent=false, isXmlDeclaration=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput179() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Comment", "org.jsoup.nodes.Comment", "toString", new String[]{}, new String[]{}, false);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("\n<!--a-->", String.valueOf(actual));
  assertEquals("receiver state after the call", "\n<!--a--> {getData=a, hasParent=false, isXmlDeclaration=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput180() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Comment", "org.jsoup.nodes.Comment", "outerHtml", new String[]{}, new String[]{}, false);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("\n<!--a-->", String.valueOf(actual));
  assertEquals("receiver state after the call", "\n<!--a--> {getData=a, hasParent=false, isXmlDeclaration=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput181() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Comment", "org.jsoup.nodes.Comment", "outerHtml", new String[]{}, new String[]{}, false, 1, new String[][]{});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("\n<!--0-->", String.valueOf(actual));
  assertEquals("receiver state after the call", "\n<!--0--> {getData=0, hasParent=false, isXmlDeclaration=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput182() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jsoup.nodes.Comment", "org.jsoup.nodes.Comment", "html", new String[]{"java.lang.Appendable"}, new String[]{"<null>"}, false); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput183() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Comment", "org.jsoup.nodes.Comment", "siblingIndex", new String[]{}, new String[]{}, false, 6, new String[][]{{"org.jsoup.nodes.Comment", "setSiblingIndex", "int", "10"}, {"org.jsoup.nodes.Comment", "removeChild", "org.jsoup.nodes.Node", "<sample:3>"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("10", String.valueOf(actual));
  assertEquals("receiver state after the call", "\n<!--sample--> {getData=sample, hasParent=false, isXmlDeclaration=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput184() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jsoup.nodes.Comment", "org.jsoup.nodes.Comment", "outerHtmlHead", new String[]{"java.lang.Appendable", "int", "org.jsoup.nodes.Document$OutputSettings"}, new String[]{"<empty>", "1", "<null>"}, false); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput185() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Comment", "org.jsoup.nodes.Comment", "clone", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.jsoup.nodes.Comment", "coreValue", ""}});
  assertNotNull(actual);
  assertEquals("org.jsoup.nodes.Comment", actual.getClass().getName());
  assertEquals("\n<!--a--> {getData=a, hasParent=false, isXmlDeclaration=false}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "\n<!--a--> {getData=a, hasParent=false, isXmlDeclaration=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput186() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Comment", "org.jsoup.nodes.Comment", "clone", new String[]{}, new String[]{}, false, 1, new String[][]{{"org.jsoup.nodes.Comment", "coreValue", ""}});
  assertNotNull(actual);
  assertEquals("org.jsoup.nodes.Comment", actual.getClass().getName());
  assertEquals("\n<!--0--> {getData=0, hasParent=false, isXmlDeclaration=false}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "\n<!--0--> {getData=0, hasParent=false, isXmlDeclaration=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput187() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Comment", "org.jsoup.nodes.Comment", "clone", new String[]{}, new String[]{}, false, 2, new String[][]{{"org.jsoup.nodes.Comment", "coreValue", ""}});
  assertNotNull(actual);
  assertEquals("org.jsoup.nodes.Comment", actual.getClass().getName());
  assertEquals("\n<!--sample--> {getData=sample, hasParent=false, isXmlDeclaration=false}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "\n<!--sample--> {getData=sample, hasParent=false, isXmlDeclaration=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput188() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Comment", "org.jsoup.nodes.Comment", "clone", new String[]{}, new String[]{}, false, 7, new String[][]{{"org.jsoup.nodes.Comment", "coreValue", ""}});
  assertNotNull(actual);
  assertEquals("org.jsoup.nodes.Comment", actual.getClass().getName());
  assertEquals("\n<!----> {getData=, hasParent=false, isXmlDeclaration=false}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "\n<!----> {getData=, hasParent=false, isXmlDeclaration=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput189() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jsoup.nodes.Comment", "org.jsoup.nodes.Comment", "clone", new String[]{}, new String[]{}, false, 7, new String[][]{{"org.jsoup.nodes.Comment", "coreValue", ""}}), new String[][]{{"nodeName", "", "2"}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("#comment", String.valueOf(actual));
  assertEquals("receiver state after the call", "\n<!----> {getData=, hasParent=false, isXmlDeclaration=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput190() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jsoup.nodes.Comment", "org.jsoup.nodes.Comment", "after", new String[]{"java.lang.String"}, new String[]{"\u00e9"}, false); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput191() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Comment", "org.jsoup.nodes.Comment", "attributes", new String[]{}, new String[]{}, false);
  assertNotNull(actual);
  assertEquals("org.jsoup.nodes.Attributes", actual.getClass().getName());
  assertEquals(" #comment=\"a\" {size=1}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "\n<!--a--> {getData=a, hasParent=false, isXmlDeclaration=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput192() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Comment", "org.jsoup.nodes.Comment", "attributes", new String[]{}, new String[]{}, false, 1, new String[][]{});
  assertNotNull(actual);
  assertEquals("org.jsoup.nodes.Attributes", actual.getClass().getName());
  assertEquals(" #comment=\"0\" {size=1}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "\n<!--0--> {getData=0, hasParent=false, isXmlDeclaration=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput193() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Comment", "org.jsoup.nodes.Comment", "attributes", new String[]{}, new String[]{}, false, 2, new String[][]{});
  assertNotNull(actual);
  assertEquals("org.jsoup.nodes.Attributes", actual.getClass().getName());
  assertEquals(" #comment=\"sample\" {size=1}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "\n<!--sample--> {getData=sample, hasParent=false, isXmlDeclaration=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput194() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jsoup.nodes.Comment", "org.jsoup.nodes.Comment", "childNodes", new String[]{}, new String[]{}, false, 1, new String[][]{{"org.jsoup.nodes.Comment", "nodelistChanged", ""}, {"org.jsoup.nodes.Comment", "hasAttr", "java.lang.String", "1.25"}}), new String[][]{{"clear", "", "5"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.UnsupportedOperationException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput195() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jsoup.nodes.Comment", "org.jsoup.nodes.Comment", "attributes", new String[]{}, new String[]{}, false, 3, new String[][]{}), new String[][]{{"addAll", "org.jsoup.nodes.Attributes", "3"}});
  assertNotNull(actual);
  assertEquals("org.jsoup.nodes.Attributes", actual.getClass().getName());
  assertEquals(" #comment=\"\" {size=1}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "\n<!----> {getData=, hasParent=false, isXmlDeclaration=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput196() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Comment", "org.jsoup.nodes.Comment", "setSiblingIndex", new String[]{"int"}, new String[]{"15"}, false, 1, new String[][]{});
  assertNull(actual);
  assertEquals("receiver state after the call", "\n<!--0--> {getData=0, hasParent=false, isXmlDeclaration=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput197() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Comment", "org.jsoup.nodes.Comment", "setSiblingIndex", new String[]{"int"}, new String[]{"939524112"}, false, 3, new String[][]{});
  assertNull(actual);
  assertEquals("receiver state after the call", "\n<!----> {getData=, hasParent=false, isXmlDeclaration=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput198() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Comment", "org.jsoup.nodes.Comment", "reparentChild", new String[]{"org.jsoup.nodes.Node"}, new String[]{"<sample:7>"}, false);
  assertNull(actual);
  assertEquals("receiver state after the call", "\n<!--a--> {getData=a, hasParent=false, isXmlDeclaration=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput199() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Comment", "org.jsoup.nodes.Comment", "reparentChild", new String[]{"org.jsoup.nodes.Node"}, new String[]{"<sample:2>"}, false, 3, new String[][]{{"org.jsoup.nodes.Comment", "baseUri", ""}});
  assertNull(actual);
  assertEquals("receiver state after the call", "\n<!----> {getData=, hasParent=false, isXmlDeclaration=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput200() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jsoup.nodes.Comment", "org.jsoup.nodes.Comment", "before", new String[]{"org.jsoup.nodes.Node"}, new String[]{"<sample:0>"}, false, 0, new String[][]{{"org.jsoup.nodes.Comment", "childNodes", ""}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput201() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Comment", "org.jsoup.nodes.Comment", "coreValue", new String[]{}, new String[]{}, false, 7, new String[][]{{"org.jsoup.nodes.Comment", "unwrap", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("", String.valueOf(actual));
  assertEquals("receiver state after the call", "\n<!----> {getData=, hasParent=false, isXmlDeclaration=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput202() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Comment", "org.jsoup.nodes.Comment", "coreValue", new String[]{}, new String[]{}, false, 8, new String[][]{});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("a", String.valueOf(actual));
  assertEquals("receiver state after the call", "\n<!--a--> {getData=a, hasParent=false, isXmlDeclaration=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput203() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Comment", "org.jsoup.nodes.Comment", "coreValue", new String[]{}, new String[]{}, false, 9, new String[][]{});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "\n<!--0--> {getData=0, hasParent=false, isXmlDeclaration=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput204() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Comment", "org.jsoup.nodes.Comment", "coreValue", new String[]{}, new String[]{}, false, 10, new String[][]{});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("sample", String.valueOf(actual));
  assertEquals("receiver state after the call", "\n<!--sample--> {getData=sample, hasParent=false, isXmlDeclaration=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput205() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Comment", "org.jsoup.nodes.Comment", "nextSibling", new String[]{}, new String[]{}, false, 0, null, 3);
  assertNull(actual);
  assertEquals("receiver state after the call", "\n<!--a--> {getData=a, hasParent=false, isXmlDeclaration=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput206() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Comment", "org.jsoup.nodes.Comment", "nextSibling", new String[]{}, new String[]{}, false, 1, new String[][]{}, 3);
  assertNull(actual);
  assertEquals("receiver state after the call", "\n<!--0--> {getData=0, hasParent=false, isXmlDeclaration=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput207() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Comment", "org.jsoup.nodes.Comment", "nextSibling", new String[]{}, new String[]{}, false, 2, new String[][]{}, 3);
  assertNull(actual);
  assertEquals("receiver state after the call", "\n<!--sample--> {getData=sample, hasParent=false, isXmlDeclaration=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput208() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Comment", "org.jsoup.nodes.Comment", "nextSibling", new String[]{}, new String[]{}, false, 3, new String[][]{}, 3);
  assertNull(actual);
  assertEquals("receiver state after the call", "\n<!----> {getData=, hasParent=false, isXmlDeclaration=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput209() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Comment", "org.jsoup.nodes.Comment", "nextSibling", new String[]{}, new String[]{}, false, 4, new String[][]{{"org.jsoup.nodes.Comment", "setParentNode", "org.jsoup.nodes.Node", "<sample:7>"}}, 3);
  assertNull(actual);
  assertEquals("receiver state after the call", "\n<!--a--> {getData=a, hasParent=true, isXmlDeclaration=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput210() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Comment", "org.jsoup.nodes.Comment", "traverse", new String[]{"org.jsoup.select.NodeVisitor"}, new String[]{"<sample:4>"}, false);
  assertNotNull(actual);
  assertEquals("org.jsoup.nodes.Comment", actual.getClass().getName());
  assertEquals("\n<!--a--> {getData=a, hasParent=false, isXmlDeclaration=false}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "\n<!--a--> {getData=a, hasParent=false, isXmlDeclaration=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput211() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Comment", "org.jsoup.nodes.Comment", "toString", new String[]{}, new String[]{}, false, 1, new String[][]{{"org.jsoup.nodes.Comment", "nodeName", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("\n<!--0-->", String.valueOf(actual));
  assertEquals("receiver state after the call", "\n<!--0--> {getData=0, hasParent=false, isXmlDeclaration=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput212() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Comment", "org.jsoup.nodes.Comment", "toString", new String[]{}, new String[]{}, false, 2, new String[][]{});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("\n<!--sample-->", String.valueOf(actual));
  assertEquals("receiver state after the call", "\n<!--sample--> {getData=sample, hasParent=false, isXmlDeclaration=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput213() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Comment", "org.jsoup.nodes.Comment", "toString", new String[]{}, new String[]{}, false, 3, new String[][]{});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("\n<!---->", String.valueOf(actual));
  assertEquals("receiver state after the call", "\n<!----> {getData=, hasParent=false, isXmlDeclaration=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput214() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Comment", "org.jsoup.nodes.Comment", "toString", new String[]{}, new String[]{}, false, 17, new String[][]{{"org.jsoup.nodes.Comment", "childNode", "int", "10"}, {"org.jsoup.nodes.Comment", "shallowClone", ""}, {"org.jsoup.nodes.Comment", "addChildren", "int,org.jsoup.nodes.Node[]", "1", "<sample:0>"}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("\n<!--0-->", String.valueOf(actual));
  assertEquals("receiver state after the call", "\n<!--0--> {getData=0, hasParent=false, isXmlDeclaration=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput215() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Comment", "org.jsoup.nodes.Comment", "toString", new String[]{}, new String[]{}, false, 18, new String[][]{{"org.jsoup.nodes.Comment", "childNode", "int", "10"}, {"org.jsoup.nodes.Comment", "addChildren", "int,org.jsoup.nodes.Node[]", "1", "<sample:0>"}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("\n<!--sample-->", String.valueOf(actual));
  assertEquals("receiver state after the call", "\n<!--sample--> {getData=sample, hasParent=false, isXmlDeclaration=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput216() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Comment", "org.jsoup.nodes.Comment", "toString", new String[]{}, new String[]{}, false, 19, new String[][]{{"org.jsoup.nodes.Comment", "childNode", "int", "10"}, {"org.jsoup.nodes.Comment", "addChildren", "int,org.jsoup.nodes.Node[]", "1", "<sample:0>"}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("\n<!---->", String.valueOf(actual));
  assertEquals("receiver state after the call", "\n<!----> {getData=, hasParent=false, isXmlDeclaration=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput217() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Comment", "org.jsoup.nodes.Comment", "toString", new String[]{}, new String[]{}, false, 20, new String[][]{{"org.jsoup.nodes.Comment", "childNode", "int", "10"}, {"org.jsoup.nodes.Comment", "addChildren", "int,org.jsoup.nodes.Node[]", "1", "<sample:0>"}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("\n<!--a-->", String.valueOf(actual));
  assertEquals("receiver state after the call", "\n<!--a--> {getData=a, hasParent=false, isXmlDeclaration=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput218() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jsoup.nodes.Comment", "org.jsoup.nodes.Comment", "replaceWith", new String[]{"org.jsoup.nodes.Node"}, new String[]{"<sample:1>"}, false); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput219() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Comment", "org.jsoup.nodes.Comment", "outerHtmlHead", new String[]{"java.lang.Appendable", "int", "org.jsoup.nodes.Document$OutputSettings"}, new String[]{"<empty>", "1", "<sample:6>"}, false, 2, new String[][]{{"org.jsoup.nodes.Comment", "addChildren", "int,org.jsoup.nodes.Node[]", "0", "<sample:1>"}, {"org.jsoup.nodes.Comment", "childNode", "int", "2147483647"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "\n<!--sample--> {getData=sample, hasParent=false, isXmlDeclaration=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput220() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jsoup.nodes.Comment", "org.jsoup.nodes.Comment", "addChildren", new String[]{"int", "org.jsoup.nodes.Node[]"}, new String[]{"0", "<sample:0>"}, false, 0, new String[][]{{"org.jsoup.nodes.Comment", "siblingNodes", ""}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.UnsupportedOperationException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput221() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jsoup.nodes.Comment", "org.jsoup.nodes.Comment", "outerHtmlHead", new String[]{"java.lang.Appendable", "int", "org.jsoup.nodes.Document$OutputSettings"}, new String[]{"<null>", "10", "<sample:9>"}, false, 2, new String[][]{{"org.jsoup.nodes.Comment", "childNodesCopy", ""}, {"org.jsoup.nodes.Comment", "childNode", "int", "1073741823"}}, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput222() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Comment", "org.jsoup.nodes.Comment", "outerHtmlHead", new String[]{"java.lang.Appendable", "int", "org.jsoup.nodes.Document$OutputSettings"}, new String[]{"<sample:3>", "10", "<sample:9>"}, false, 2, new String[][]{{"org.jsoup.nodes.Comment", "childNodesCopy", ""}, {"org.jsoup.nodes.Comment", "childNode", "int", "1073741823"}}, 3);
  assertNull(actual);
  assertEquals("receiver state after the call", "\n<!--sample--> {getData=sample, hasParent=false, isXmlDeclaration=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput223() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jsoup.nodes.Comment", "org.jsoup.nodes.Comment", "attr", new String[]{"java.lang.String", "java.lang.String"}, new String[]{"1.5f", "-->"}, false), new String[][]{{"nodeName", "", "2"}, {"nextSibling", "", "7"}, {"hasParent", "", "6"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "\n<!--a--> {getData=a, hasParent=false, isXmlDeclaration=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput224() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Comment", "org.jsoup.nodes.Comment", "doClone", new String[]{"org.jsoup.nodes.Node"}, new String[]{"<sample:5>"}, false, 0, new String[][]{{"org.jsoup.nodes.Comment", "wrap", "java.lang.String", "{\"a\":1}"}});
  assertNotNull(actual);
  assertEquals("org.jsoup.nodes.Comment", actual.getClass().getName());
  assertEquals("\n<!--a--> {getData=a, hasParent=true, isXmlDeclaration=false}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "\n<!--a--> {getData=a, hasParent=false, isXmlDeclaration=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput225() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jsoup.nodes.Comment", "org.jsoup.nodes.Comment", "removeChild", new String[]{"org.jsoup.nodes.Node"}, new String[]{"<sample:6>"}, false); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput226() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jsoup.nodes.Comment", "org.jsoup.nodes.Comment", "removeChild", new String[]{"org.jsoup.nodes.Node"}, new String[]{"<sample:6>"}, false, 5, new String[][]{{"org.jsoup.nodes.Comment", "outerHtml", "java.lang.Appendable", "<sample:2>"}}, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput227() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Comment", "org.jsoup.nodes.Comment", "hasParent", new String[]{}, new String[]{}, false);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "\n<!--a--> {getData=a, hasParent=false, isXmlDeclaration=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput228() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jsoup.nodes.Comment", "org.jsoup.nodes.Comment", "root", new String[]{}, new String[]{}, false, 4, new String[][]{}), new String[][]{{"parentNode", "", "0"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "\n<!--a--> {getData=a, hasParent=false, isXmlDeclaration=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput229() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Comment", "org.jsoup.nodes.Comment", "nodeName", new String[]{}, new String[]{}, false, 0, null, 3);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("#comment", String.valueOf(actual));
  assertEquals("receiver state after the call", "\n<!--a--> {getData=a, hasParent=false, isXmlDeclaration=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput230() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Comment", "org.jsoup.nodes.Comment", "nodeName", new String[]{}, new String[]{}, false, 1, new String[][]{}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("#comment", String.valueOf(actual));
  assertEquals("receiver state after the call", "\n<!--0--> {getData=0, hasParent=false, isXmlDeclaration=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput231() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Comment", "org.jsoup.nodes.Comment", "nodeName", new String[]{}, new String[]{}, false, 2, new String[][]{}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("#comment", String.valueOf(actual));
  assertEquals("receiver state after the call", "\n<!--sample--> {getData=sample, hasParent=false, isXmlDeclaration=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput232() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Comment", "org.jsoup.nodes.Comment", "nodeName", new String[]{}, new String[]{}, false, 7, new String[][]{}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("#comment", String.valueOf(actual));
  assertEquals("receiver state after the call", "\n<!----> {getData=, hasParent=false, isXmlDeclaration=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput233() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Comment", "org.jsoup.nodes.Comment", "nodeName", new String[]{}, new String[]{}, false, 4, new String[][]{{"org.jsoup.nodes.Comment", "setParentNode", "org.jsoup.nodes.Node", "<sample:7>"}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("#comment", String.valueOf(actual));
  assertEquals("receiver state after the call", "\n<!--a--> {getData=a, hasParent=true, isXmlDeclaration=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput234() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Comment", "org.jsoup.nodes.Comment", "nodeName", new String[]{}, new String[]{}, false, 8, new String[][]{{"org.jsoup.nodes.Comment", "setParentNode", "org.jsoup.nodes.Node", "<sample:9>"}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("#comment", String.valueOf(actual));
  assertEquals("receiver state after the call", "\n<!--a--> {getData=a, hasParent=true, isXmlDeclaration=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput235() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jsoup.nodes.Comment", "org.jsoup.nodes.Comment", "wrap", new String[]{"java.lang.String"}, new String[]{"1.5f"}, false, 0, new String[][]{{"org.jsoup.nodes.Comment", "asXmlDeclaration", ""}}, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput236() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Comment", "org.jsoup.nodes.Comment", "childNodeSize", new String[]{}, new String[]{}, false, 0, null, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "\n<!--a--> {getData=a, hasParent=false, isXmlDeclaration=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput237() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Comment", "org.jsoup.nodes.Comment", "outerHtml", new String[]{"java.lang.Appendable"}, new String[]{"<sample:3>"}, false, 0, null, 2);
  assertNull(actual);
  assertEquals("receiver state after the call", "\n<!--a--> {getData=a, hasParent=false, isXmlDeclaration=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput238() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jsoup.nodes.Comment", "org.jsoup.nodes.Comment", "outerHtml", new String[]{"java.lang.Appendable"}, new String[]{"<null>"}, false, 8, new String[][]{}, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput239() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Comment", "org.jsoup.nodes.Comment", "outerHtml", new String[]{"java.lang.Appendable"}, new String[]{"<sample:2>"}, false, 8, new String[][]{});
  assertNull(actual);
  assertEquals("receiver state after the call", "\n<!--a--> {getData=a, hasParent=false, isXmlDeclaration=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput240() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jsoup.nodes.Comment", "org.jsoup.nodes.Comment", "outerHtml", new String[]{"java.lang.Appendable"}, new String[]{"<null>"}, false, 8, new String[][]{{"org.jsoup.nodes.Comment", "childNodesAsArray", ""}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput241() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Comment", "org.jsoup.nodes.Comment", "doClone", new String[]{"org.jsoup.nodes.Node"}, new String[]{"<sample:6>"}, false, 6, new String[][]{{"org.jsoup.nodes.Comment", "outerHtml", ""}, {"org.jsoup.nodes.Comment", "asXmlDeclaration", ""}});
  assertNotNull(actual);
  assertEquals("org.jsoup.nodes.Comment", actual.getClass().getName());
  assertEquals("\n<!--sample--> {getData=sample, hasParent=true, isXmlDeclaration=false}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "\n<!--sample--> {getData=sample, hasParent=false, isXmlDeclaration=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput242() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Comment", "org.jsoup.nodes.Comment", "siblingNodes", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.jsoup.nodes.Comment", "html", "java.lang.Appendable", "<null>"}, {"org.jsoup.nodes.Comment", "setSiblingIndex", "int", "0"}});
  assertNotNull(actual);
  assertEquals("java.util.Collections$EmptyList", actual.getClass().getName());
  assertEquals("[]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "\n<!--a--> {getData=a, hasParent=false, isXmlDeclaration=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput243() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jsoup.nodes.Comment", "org.jsoup.nodes.Comment", "doClone", new String[]{"org.jsoup.nodes.Node"}, new String[]{"<sample:6>"}, false, 6, new String[][]{{"org.jsoup.nodes.Comment", "outerHtml", ""}, {"org.jsoup.nodes.Comment", "asXmlDeclaration", ""}}), new String[][]{{"wrap", "java.lang.String", "6"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.UnsupportedOperationException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput244() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jsoup.nodes.Comment", "org.jsoup.nodes.Comment", "doClone", new String[]{"org.jsoup.nodes.Node"}, new String[]{"<null>"}, false, 6, new String[][]{{"org.jsoup.nodes.Comment", "outerHtml", ""}, {"org.jsoup.nodes.Comment", "asXmlDeclaration", ""}}), new String[][]{{"before", "java.lang.String", "1"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput245() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jsoup.nodes.Comment", "org.jsoup.nodes.Comment", "doClone", new String[]{"org.jsoup.nodes.Node"}, new String[]{"<null>"}, false, 6, new String[][]{{"org.jsoup.nodes.Comment", "outerHtml", ""}, {"org.jsoup.nodes.Comment", "asXmlDeclaration", ""}}, 2), new String[][]{{"before", "java.lang.String", "1"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput246() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jsoup.nodes.Comment", "org.jsoup.nodes.Comment", "doClone", new String[]{"org.jsoup.nodes.Node"}, new String[]{"<sample:0>"}, false, 6, new String[][]{{"org.jsoup.nodes.Comment", "outerHtml", ""}, {"org.jsoup.nodes.Comment", "asXmlDeclaration", ""}}, 2), new String[][]{{"before", "java.lang.String", "1"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.UnsupportedOperationException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput247() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jsoup.nodes.Comment", "org.jsoup.nodes.Comment", "wrap", new String[]{"java.lang.String"}, new String[]{""}, false, 5, new String[][]{}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput248() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jsoup.nodes.Comment", "org.jsoup.nodes.Comment", "wrap", new String[]{"java.lang.String"}, new String[]{"comment"}, false, 5, new String[][]{{"org.jsoup.nodes.Comment", "setParentNode", "org.jsoup.nodes.Node", "<sample:2>"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.UnsupportedOperationException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput249() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jsoup.nodes.Comment", "org.jsoup.nodes.Comment", "attr", new String[]{"java.lang.String", "java.lang.String"}, new String[]{"1.4e300a", "!"}, false), new String[][]{{"siblingIndex", "", "1"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "\n<!--a--> {getData=a, hasParent=false, isXmlDeclaration=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput250() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jsoup.nodes.Comment", "org.jsoup.nodes.Comment", "attr", new String[]{"java.lang.String", "java.lang.String"}, new String[]{"i123456789012345678901234567890", "1E-5"}, false, 1, new String[][]{}), new String[][]{{"siblingIndex", "", "1"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "\n<!--0--> {getData=0, hasParent=false, isXmlDeclaration=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput251() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jsoup.nodes.Comment", "org.jsoup.nodes.Comment", "ensureChildNodes", new String[]{}, new String[]{}, false, 1, new String[][]{{"org.jsoup.nodes.Comment", "outerHtml", "java.lang.Appendable", "<sample:0>"}}), new String[][]{{"indexOf", "java.lang.Object", "6"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("-1", String.valueOf(actual));
  assertEquals("receiver state after the call", "\n<!--0--> {getData=0, hasParent=false, isXmlDeclaration=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput252() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jsoup.nodes.Comment", "org.jsoup.nodes.Comment", "ensureChildNodes", new String[]{}, new String[]{}, false, 14, new String[][]{{"org.jsoup.nodes.Comment", "outerHtml", "java.lang.Appendable", "<null>"}, {"org.jsoup.nodes.Comment", "childNodesCopy", ""}}, 1), new String[][]{{"indexOf", "java.lang.Object", "6"}, {"clear", "", "0"}});
  assertNotNull(actual);
  assertEquals("java.util.Collections$EmptyList", actual.getClass().getName());
  assertEquals("[]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "\n<!--sample--> {getData=sample, hasParent=false, isXmlDeclaration=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput253() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jsoup.nodes.Comment", "org.jsoup.nodes.Comment", "ensureChildNodes", new String[]{}, new String[]{}, false, 5, new String[][]{{"org.jsoup.nodes.Comment", "outerHtml", "java.lang.Appendable", "<null>"}, {"org.jsoup.nodes.Comment", "childNodesCopy", ""}}, 1), new String[][]{{"indexOf", "java.lang.Object", "6"}, {"clear", "", "0"}});
  assertNotNull(actual);
  assertEquals("java.util.Collections$EmptyList", actual.getClass().getName());
  assertEquals("[]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "\n<!--0--> {getData=0, hasParent=false, isXmlDeclaration=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput254() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jsoup.nodes.Comment", "org.jsoup.nodes.Comment", "ensureChildNodes", new String[]{}, new String[]{}, false, 7, new String[][]{{"org.jsoup.nodes.Comment", "outerHtml", "java.lang.Appendable", "<null>"}, {"org.jsoup.nodes.Comment", "childNodesCopy", ""}}, 1), new String[][]{{"indexOf", "java.lang.Object", "6"}, {"clear", "", "0"}});
  assertNotNull(actual);
  assertEquals("java.util.Collections$EmptyList", actual.getClass().getName());
  assertEquals("[]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "\n<!----> {getData=, hasParent=false, isXmlDeclaration=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput255() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jsoup.nodes.Comment", "org.jsoup.nodes.Comment", "ensureChildNodes", new String[]{}, new String[]{}, false, 6, new String[][]{{"org.jsoup.nodes.Comment", "outerHtml", "java.lang.Appendable", "<null>"}, {"org.jsoup.nodes.Comment", "childNodesCopy", ""}}, 1), new String[][]{{"indexOf", "java.lang.Object", "6"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("-1", String.valueOf(actual));
  assertEquals("receiver state after the call", "\n<!--sample--> {getData=sample, hasParent=false, isXmlDeclaration=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput256() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jsoup.nodes.Comment", "org.jsoup.nodes.Comment", "ensureChildNodes", new String[]{}, new String[]{}, false, 8, new String[][]{{"org.jsoup.nodes.Comment", "outerHtml", "java.lang.Appendable", "<sample:0>"}}, 1), new String[][]{{"indexOf", "java.lang.Object", "6"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("-1", String.valueOf(actual));
  assertEquals("receiver state after the call", "\n<!--a--> {getData=a, hasParent=false, isXmlDeclaration=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput257() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Comment", "org.jsoup.nodes.Comment", "outerHtmlTail", new String[]{"java.lang.Appendable", "int", "org.jsoup.nodes.Document$OutputSettings"}, new String[]{"<null>", "10", "<sample:7>"}, false, 5, new String[][]{{"org.jsoup.nodes.Comment", "childNodeSize", ""}});
  assertNull(actual);
  assertEquals("receiver state after the call", "\n<!--0--> {getData=0, hasParent=false, isXmlDeclaration=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput258() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jsoup.nodes.Comment", "org.jsoup.nodes.Comment", "attributes", new String[]{}, new String[]{}, false, 6, new String[][]{}), new String[][]{{"asList", "", "4"}});
  assertNotNull(actual);
  assertEquals("java.util.Collections$UnmodifiableRandomAccessList", actual.getClass().getName());
  assertEquals("[#comment=\"sample\"]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "\n<!--sample--> {getData=sample, hasParent=false, isXmlDeclaration=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput259() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jsoup.nodes.Comment", "org.jsoup.nodes.Comment", "attributes", new String[]{}, new String[]{}, false, 7, new String[][]{}), new String[][]{{"asList", "", "4"}});
  assertNotNull(actual);
  assertEquals("java.util.Collections$UnmodifiableRandomAccessList", actual.getClass().getName());
  assertEquals("[#comment=\"\"]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "\n<!----> {getData=, hasParent=false, isXmlDeclaration=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput260() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jsoup.nodes.Comment", "org.jsoup.nodes.Comment", "attributes", new String[]{}, new String[]{}, false, 8, new String[][]{}), new String[][]{{"asList", "", "4"}});
  assertNotNull(actual);
  assertEquals("java.util.Collections$UnmodifiableRandomAccessList", actual.getClass().getName());
  assertEquals("[#comment=\"a\"]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "\n<!--a--> {getData=a, hasParent=false, isXmlDeclaration=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput261() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jsoup.nodes.Comment", "org.jsoup.nodes.Comment", "attributes", new String[]{}, new String[]{}, false, 9, new String[][]{{"org.jsoup.nodes.Comment", "setSiblingIndex", "int", "0"}}), new String[][]{{"asList", "", "4"}});
  assertNotNull(actual);
  assertEquals("java.util.Collections$UnmodifiableRandomAccessList", actual.getClass().getName());
  assertEquals("[#comment=\"0\"]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "\n<!--0--> {getData=0, hasParent=false, isXmlDeclaration=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput262() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jsoup.nodes.Comment", "org.jsoup.nodes.Comment", "attributes", new String[]{}, new String[]{}, false, 9, new String[][]{{"org.jsoup.nodes.Comment", "setSiblingIndex", "int", "0"}}, 1), new String[][]{{"asList", "", "4"}});
  assertNotNull(actual);
  assertEquals("java.util.Collections$UnmodifiableRandomAccessList", actual.getClass().getName());
  assertEquals("[#comment=\"0\"]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "\n<!--0--> {getData=0, hasParent=false, isXmlDeclaration=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput263() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jsoup.nodes.Comment", "org.jsoup.nodes.Comment", "attributes", new String[]{}, new String[]{}, false, 15, new String[][]{{"org.jsoup.nodes.Comment", "setSiblingIndex", "int", "0"}}, 1), new String[][]{{"asList", "", "4"}});
  assertNotNull(actual);
  assertEquals("java.util.Collections$UnmodifiableRandomAccessList", actual.getClass().getName());
  assertEquals("[#comment=\"\"]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "\n<!----> {getData=, hasParent=false, isXmlDeclaration=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput264() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jsoup.nodes.Comment", "org.jsoup.nodes.Comment", "attributes", new String[]{}, new String[]{}, false, 16, new String[][]{{"org.jsoup.nodes.Comment", "setSiblingIndex", "int", "-2147483648"}}, 1), new String[][]{{"asList", "", "4"}});
  assertNotNull(actual);
  assertEquals("java.util.Collections$UnmodifiableRandomAccessList", actual.getClass().getName());
  assertEquals("[#comment=\"a\"]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "\n<!--a--> {getData=a, hasParent=false, isXmlDeclaration=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput265() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jsoup.nodes.Comment", "org.jsoup.nodes.Comment", "attributes", new String[]{}, new String[]{}, false, 16, new String[][]{{"org.jsoup.nodes.Comment", "setSiblingIndex", "int", "-2147483648"}}, 1), new String[][]{{"asList", "", "4"}, {"remove", "int", "5"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.UnsupportedOperationException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput266() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Comment", "org.jsoup.nodes.Comment", "setBaseUri", new String[]{"java.lang.String"}, new String[]{"1.5d"}, false);
  assertNull(actual);
  assertEquals("receiver state after the call", "\n<!--a--> {getData=a, hasParent=false, isXmlDeclaration=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput267() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Comment", "org.jsoup.nodes.Comment", "setBaseUri", new String[]{"java.lang.String"}, new String[]{"1.5d"}, false, 15, new String[][]{});
  assertNull(actual);
  assertEquals("receiver state after the call", "\n<!----> {getData=, hasParent=false, isXmlDeclaration=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput268() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Comment", "org.jsoup.nodes.Comment", "setBaseUri", new String[]{"java.lang.String"}, new String[]{"1.5d"}, false, 7, new String[][]{{"org.jsoup.nodes.Comment", "addChildren", "int,org.jsoup.nodes.Node[]", "0", "<empty>"}, {"org.jsoup.nodes.Comment", "parent", ""}}, 3);
  assertNull(actual);
  assertEquals("receiver state after the call", "\n<!----> {getData=, hasParent=false, isXmlDeclaration=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput269() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Comment", "org.jsoup.nodes.Comment", "setBaseUri", new String[]{"java.lang.String"}, new String[]{"<a>b<<7a>"}, false, 8, new String[][]{{"org.jsoup.nodes.Comment", "addChildren", "int,org.jsoup.nodes.Node[]", "0", "<sample:1>"}, {"org.jsoup.nodes.Comment", "parent", ""}}, 3);
  assertNull(actual);
  assertEquals("receiver state after the call", "\n<!--a--> {getData=a, hasParent=false, isXmlDeclaration=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput270() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Comment", "org.jsoup.nodes.Comment", "outerHtml", new String[]{}, new String[]{}, false, 2, new String[][]{});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("\n<!--sample-->", String.valueOf(actual));
  assertEquals("receiver state after the call", "\n<!--sample--> {getData=sample, hasParent=false, isXmlDeclaration=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput271() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Comment", "org.jsoup.nodes.Comment", "outerHtml", new String[]{}, new String[]{}, false, 3, new String[][]{});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("\n<!---->", String.valueOf(actual));
  assertEquals("receiver state after the call", "\n<!----> {getData=, hasParent=false, isXmlDeclaration=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput272() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Comment", "org.jsoup.nodes.Comment", "reparentChild", new String[]{"org.jsoup.nodes.Node"}, new String[]{"<sample:6>"}, false, 1, new String[][]{{"org.jsoup.nodes.Comment", "remove", ""}});
  assertNull(actual);
  assertEquals("receiver state after the call", "\n<!--0--> {getData=0, hasParent=false, isXmlDeclaration=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput273() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Comment", "org.jsoup.nodes.Comment", "reparentChild", new String[]{"org.jsoup.nodes.Node"}, new String[]{"<sample:7>"}, false, 5, new String[][]{{"org.jsoup.nodes.Comment", "previousSibling", ""}, {"org.jsoup.nodes.Comment", "remove", ""}}, 1);
  assertNull(actual);
  assertEquals("receiver state after the call", "\n<!--0--> {getData=0, hasParent=false, isXmlDeclaration=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput274() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Comment", "org.jsoup.nodes.Comment", "reparentChild", new String[]{"org.jsoup.nodes.Node"}, new String[]{"<sample:3>"}, false, 14, new String[][]{{"org.jsoup.nodes.Comment", "previousSibling", ""}, {"org.jsoup.nodes.Comment", "indent", "java.lang.Appendable,int,org.jsoup.nodes.Document$OutputSettings", "<sample:3>", "-2147483648", "<sample:4>"}, {"org.jsoup.nodes.Comment", "remove", ""}}, 1);
  assertNull(actual);
  assertEquals("receiver state after the call", "\n<!--sample--> {getData=sample, hasParent=false, isXmlDeclaration=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput275() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jsoup.nodes.Comment", "org.jsoup.nodes.Comment", "outerHtmlHead", new String[]{"java.lang.Appendable", "int", "org.jsoup.nodes.Document$OutputSettings"}, new String[]{"<sample:0>", "-1", "<sample:3>"}, false, 0, new String[][]{{"org.jsoup.nodes.Comment", "childNodesAsArray", ""}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput276() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Comment", "org.jsoup.nodes.Comment", "outerHtmlHead", new String[]{"java.lang.Appendable", "int", "org.jsoup.nodes.Document$OutputSettings"}, new String[]{"<sample:0>", "0", "<sample:3>"}, false, 0, new String[][]{{"org.jsoup.nodes.Comment", "childNodesAsArray", ""}});
  assertNull(actual);
  assertEquals("receiver state after the call", "\n<!--a--> {getData=a, hasParent=false, isXmlDeclaration=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput277() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jsoup.nodes.Comment", "org.jsoup.nodes.Comment", "setParentNode", new String[]{"org.jsoup.nodes.Node"}, new String[]{"<null>"}, false); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput278() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jsoup.nodes.Comment", "org.jsoup.nodes.Comment", "attr", new String[]{"java.lang.String", "java.lang.String"}, new String[]{"commetPT1H", "-.1"}, false), new String[][]{{"outerHtml", "", "2"}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("\n<!--a-->", String.valueOf(actual));
  assertEquals("receiver state after the call", "\n<!--a--> {getData=a, hasParent=false, isXmlDeclaration=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput279() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jsoup.nodes.Comment", "org.jsoup.nodes.Comment", "remove", new String[]{}, new String[]{}, false, 8, new String[][]{{"org.jsoup.nodes.Comment", "wrap", "java.lang.String", "0x1F"}, {"org.jsoup.nodes.Comment", "childNodesAsArray", ""}}, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput280() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Comment", "org.jsoup.nodes.Comment", "clearAttributes", new String[]{}, new String[]{}, false);
  assertNotNull(actual);
  assertEquals("org.jsoup.nodes.Comment", actual.getClass().getName());
  assertEquals("\n<!----> {getData=, hasParent=false, isXmlDeclaration=false}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "\n<!----> {getData=, hasParent=false, isXmlDeclaration=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput281() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Comment", "org.jsoup.nodes.Comment", "childNodes", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.jsoup.nodes.Comment", "outerHtmlHead", "java.lang.Appendable,int,org.jsoup.nodes.Document$OutputSettings", "<sample:0>", "0", "<sample:4>"}, {"org.jsoup.nodes.Comment", "setBaseUri", "java.lang.String", ""}}, 1);
  assertNotNull(actual);
  assertEquals("java.util.Collections$UnmodifiableRandomAccessList", actual.getClass().getName());
  assertEquals("[]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "\n<!--a--> {getData=a, hasParent=false, isXmlDeclaration=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput282() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Comment", "org.jsoup.nodes.Comment", "childNodes", new String[]{}, new String[]{}, false, 1, new String[][]{{"org.jsoup.nodes.Comment", "outerHtmlHead", "java.lang.Appendable,int,org.jsoup.nodes.Document$OutputSettings", "<sample:0>", "0", "<sample:4>"}, {"org.jsoup.nodes.Comment", "setBaseUri", "java.lang.String", ""}}, 1);
  assertNotNull(actual);
  assertEquals("java.util.Collections$UnmodifiableRandomAccessList", actual.getClass().getName());
  assertEquals("[]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "\n<!--0--> {getData=0, hasParent=false, isXmlDeclaration=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput283() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Comment", "org.jsoup.nodes.Comment", "childNodes", new String[]{}, new String[]{}, false, 2, new String[][]{{"org.jsoup.nodes.Comment", "outerHtmlHead", "java.lang.Appendable,int,org.jsoup.nodes.Document$OutputSettings", "<sample:0>", "0", "<sample:4>"}, {"org.jsoup.nodes.Comment", "setBaseUri", "java.lang.String", ""}}, 1);
  assertNotNull(actual);
  assertEquals("java.util.Collections$UnmodifiableRandomAccessList", actual.getClass().getName());
  assertEquals("[]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "\n<!--sample--> {getData=sample, hasParent=false, isXmlDeclaration=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput284() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Comment", "org.jsoup.nodes.Comment", "childNodes", new String[]{}, new String[]{}, false, 3, new String[][]{{"org.jsoup.nodes.Comment", "outerHtmlHead", "java.lang.Appendable,int,org.jsoup.nodes.Document$OutputSettings", "<sample:0>", "0", "<sample:4>"}}, 1);
  assertNotNull(actual);
  assertEquals("java.util.Collections$UnmodifiableRandomAccessList", actual.getClass().getName());
  assertEquals("[]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "\n<!----> {getData=, hasParent=false, isXmlDeclaration=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput285() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jsoup.nodes.Comment", "org.jsoup.nodes.Comment", "childNodes", new String[]{}, new String[]{}, false, 15, new String[][]{{"org.jsoup.nodes.Comment", "hasAttributes", ""}, {"org.jsoup.nodes.Comment", "outerHtmlHead", "java.lang.Appendable,int,org.jsoup.nodes.Document$OutputSettings", "<sample:0>", "0", "<sample:3>"}, {"org.jsoup.nodes.Comment", "replaceChild", "org.jsoup.nodes.Node,org.jsoup.nodes.Node", "<null>", "<sample:4>"}}), new String[][]{{"lastIndexOf", "java.lang.Object", "1"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("-1", String.valueOf(actual));
  assertEquals("receiver state after the call", "\n<!----> {getData=, hasParent=false, isXmlDeclaration=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput286() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jsoup.nodes.Comment", "org.jsoup.nodes.Comment", "childNodes", new String[]{}, new String[]{}, false, 16, new String[][]{{"org.jsoup.nodes.Comment", "hasAttributes", ""}, {"org.jsoup.nodes.Comment", "outerHtmlHead", "java.lang.Appendable,int,org.jsoup.nodes.Document$OutputSettings", "<sample:0>", "0", "<sample:3>"}, {"org.jsoup.nodes.Comment", "replaceChild", "org.jsoup.nodes.Node,org.jsoup.nodes.Node", "<null>", "<sample:4>"}}), new String[][]{{"iterator", "", "1"}});
  assertNotNull(actual);
  assertEquals("receiver state after the call", "\n<!--a--> {getData=a, hasParent=false, isXmlDeclaration=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput287() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Comment", "org.jsoup.nodes.Comment", "outerHtmlTail", new String[]{"java.lang.Appendable", "int", "org.jsoup.nodes.Document$OutputSettings"}, new String[]{"<null>", "-2147483648", "<sample:3>"}, false, 0, null, 1);
  assertNull(actual);
  assertEquals("receiver state after the call", "\n<!--a--> {getData=a, hasParent=false, isXmlDeclaration=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput288() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Comment", "org.jsoup.nodes.Comment", "toString", new String[]{}, new String[]{}, false, 4, new String[][]{{"org.jsoup.nodes.Comment", "attr", "java.lang.String,java.lang.String", "a b", "5."}, {"org.jsoup.nodes.Comment", "coreValue", ""}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("\n<!--a-->", String.valueOf(actual));
  assertEquals("receiver state after the call", "\n<!--a--> {getData=a, hasParent=false, isXmlDeclaration=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput289() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Comment", "org.jsoup.nodes.Comment", "parentNode", new String[]{}, new String[]{}, false);
  assertNull(actual);
  assertEquals("receiver state after the call", "\n<!--a--> {getData=a, hasParent=false, isXmlDeclaration=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput290() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Comment", "org.jsoup.nodes.Comment", "parentNode", new String[]{}, new String[]{}, false, 1, new String[][]{});
  assertNull(actual);
  assertEquals("receiver state after the call", "\n<!--0--> {getData=0, hasParent=false, isXmlDeclaration=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput291() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Comment", "org.jsoup.nodes.Comment", "parentNode", new String[]{}, new String[]{}, false, 2, new String[][]{});
  assertNull(actual);
  assertEquals("receiver state after the call", "\n<!--sample--> {getData=sample, hasParent=false, isXmlDeclaration=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput292() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Comment", "org.jsoup.nodes.Comment", "parentNode", new String[]{}, new String[]{}, false, 3, new String[][]{});
  assertNull(actual);
  assertEquals("receiver state after the call", "\n<!----> {getData=, hasParent=false, isXmlDeclaration=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput293() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jsoup.nodes.Comment", "org.jsoup.nodes.Comment", "removeAttr", new String[]{"java.lang.String"}, new String[]{"a"}, false, 0, new String[][]{{"org.jsoup.nodes.Comment", "previousSibling", ""}}), new String[][]{{"nextSibling", "", "7"}, {"hasSameValue", "java.lang.Object", "5"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "\n<!--a--> {getData=a, hasParent=false, isXmlDeclaration=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput294() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jsoup.nodes.Comment", "org.jsoup.nodes.Comment", "childNode", new String[]{"int"}, new String[]{"9"}, false, 6, new String[][]{{"org.jsoup.nodes.Comment", "after", "java.lang.String", "1L"}, {"org.jsoup.nodes.Comment", "childNodes", ""}}, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IndexOutOfBoundsException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput295() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jsoup.nodes.Comment", "org.jsoup.nodes.Comment", "replaceWith", new String[]{"org.jsoup.nodes.Node"}, new String[]{"<sample:6>"}, false, 0, new String[][]{{"org.jsoup.nodes.Comment", "siblingIndex", ""}, {"org.jsoup.nodes.Comment", "setBaseUri", "java.lang.String", "PT1H"}}, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput296() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jsoup.nodes.Comment", "org.jsoup.nodes.Comment", "wrap", new String[]{"java.lang.String"}, new String[]{"1.1234567890123456"}, false, 1, new String[][]{{"org.jsoup.nodes.Comment", "clone", ""}}, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput297() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Comment", "org.jsoup.nodes.Comment", "absUrl", new String[]{"java.lang.String"}, new String[]{"1"}, false, 0, new String[][]{{"org.jsoup.nodes.Comment", "nodeName", ""}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("", String.valueOf(actual));
  assertEquals("receiver state after the call", "\n<!--a--> {getData=a, hasParent=false, isXmlDeclaration=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput298() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jsoup.nodes.Comment", "org.jsoup.nodes.Comment", "after", new String[]{"org.jsoup.nodes.Node"}, new String[]{"<sample:1>"}, false, 7, new String[][]{{"org.jsoup.nodes.Comment", "before", "org.jsoup.nodes.Node", "<sample:2>"}, {"org.jsoup.nodes.Comment", "html", "java.lang.Appendable", "<sample:1>"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput299() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Comment", "org.jsoup.nodes.Comment", "asXmlDeclaration", new String[]{}, new String[]{}, false, 3, new String[][]{{"org.jsoup.nodes.Comment", "parent", ""}, {"org.jsoup.nodes.Comment", "setBaseUri", "java.lang.String", "\t\t--1"}, {"org.jsoup.nodes.Comment", "coreValue", "java.lang.String", "1.24"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "\n<!--1.24--> {getData=1.24, hasParent=false, isXmlDeclaration=false}", SearchInputFactory_scaffolding.receiverState());
 }
}
