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
  try { SearchInputFactory_scaffolding.call("org.jsoup.nodes.Node", "org.jsoup.nodes.Comment", "unwrap", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.jsoup.nodes.Node", "removeChild", "org.jsoup.nodes.Node", "<sample:8>"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput001() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Node", "org.jsoup.nodes.Comment", "childNodeSize", new String[]{}, new String[]{}, false, 7, new String[][]{{"org.jsoup.nodes.Node", "childNodesAsArray", ""}, {"org.jsoup.nodes.Node", "replaceChild", "org.jsoup.nodes.Node,org.jsoup.nodes.Node", "<sample:8>", "<sample:7>"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "\n<!----> {getData=}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput002() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Node", "org.jsoup.nodes.Comment", "wrap", new String[]{"java.lang.String"}, new String[]{"-0.\"0"}, false, 0, new String[][]{{"org.jsoup.nodes.Node", "setParentNode", "org.jsoup.nodes.Node", "<sample:2>"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "\n<!--a--> {getData=a}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput003() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Node", "org.jsoup.nodes.Comment", "hashCode", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.jsoup.nodes.Node", "addChildren", "org.jsoup.nodes.Node[]", "<sample:4>"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("1238464420", String.valueOf(actual));
  assertEquals("receiver state after the call", "\n<!--a-->a\n <!--a--> {getData=a}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput004() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Node", "org.jsoup.nodes.Comment", "absUrl", new String[]{"java.lang.String"}, new String[]{"abs:true"}, false, 0, new String[][]{{"org.jsoup.nodes.Node", "after", "java.lang.String", "0xxF"}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("", String.valueOf(actual));
  assertEquals("receiver state after the call", "\n<!--a--> {getData=a}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput005() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Node", "org.jsoup.nodes.Comment", "equals", new String[]{"java.lang.Object"}, new String[]{"<null>"}, false, 4, new String[][]{});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "\n<!--a--> {getData=a}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput006() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jsoup.nodes.Node", "org.jsoup.nodes.Comment", "removeAttr", new String[]{"java.lang.String"}, new String[]{"Tnull"}, false, 0, new String[][]{{"org.jsoup.nodes.Node", "childNode", "int", "-2147483610"}}), new String[][]{{"attr", "java.lang.String,java.lang.String", "1"}, {"absUrl", "java.lang.String", "1"}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("", String.valueOf(actual));
  assertEquals("receiver state after the call", "\n<!--a--> {getData=a}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput007() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jsoup.nodes.Node", "org.jsoup.nodes.Comment", "doClone", new String[]{"org.jsoup.nodes.Node"}, new String[]{"<sample:7>"}, false, 7, new String[][]{}), new String[][]{{"traverse", "org.jsoup.select.NodeVisitor", "5"}, {"previousSibling", "", "4"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "\n<!----> {getData=}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput008() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Node", "org.jsoup.nodes.Comment", "attr", new String[]{"java.lang.String"}, new String[]{"abs:true"}, false, 0, null, 2);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("", String.valueOf(actual));
  assertEquals("receiver state after the call", "\n<!--a--> {getData=a}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput009() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jsoup.nodes.Node", "org.jsoup.nodes.Comment", "before", new String[]{"java.lang.String"}, new String[]{"110"}, false, 0, new String[][]{{"org.jsoup.nodes.Node", "setParentNode", "org.jsoup.nodes.Node", "<sample:5>"}}), new String[][]{{"unwrap", "", "5"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "\n<!--a--> {getData=a}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput010() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jsoup.nodes.Node", "org.jsoup.nodes.Comment", "setParentNode", new String[]{"org.jsoup.nodes.Node"}, new String[]{"<sample:7>"}, false, 0, new String[][]{{"org.jsoup.nodes.Node", "setParentNode", "org.jsoup.nodes.Node", "<sample:4>"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.UnsupportedOperationException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput011() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jsoup.nodes.Node", "org.jsoup.nodes.Comment", "before", new String[]{"java.lang.String"}, new String[]{"o2:30:459.5d"}, false, 0, new String[][]{{"org.jsoup.nodes.Node", "equals", "java.lang.Object", "<i:23>"}, {"org.jsoup.nodes.Node", "setParentNode", "org.jsoup.nodes.Node", "<sample:0>"}}), new String[][]{{"after", "org.jsoup.nodes.Node", "1"}});
  assertNotNull(actual);
  assertEquals("org.jsoup.nodes.Comment", actual.getClass().getName());
  assertEquals("\n<!--a--> {getData=a}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "\n<!--a--> {getData=a}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput012() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Node", "org.jsoup.nodes.Comment", "setBaseUri", new String[]{"java.lang.String"}, new String[]{"Tiule"}, false, 2, new String[][]{{"org.jsoup.nodes.Node", "hashCode", ""}, {"org.jsoup.nodes.Node", "attributes", ""}}, 2);
  assertNull(actual);
  assertEquals("receiver state after the call", "\n<!--sample--> {getData=sample}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput013() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Node", "org.jsoup.nodes.Comment", "childNodesAsArray", new String[]{}, new String[]{}, false, 6, new String[][]{{"org.jsoup.nodes.Node", "addChildren", "int,org.jsoup.nodes.Node[]", "0", "<sample:2>"}, {"org.jsoup.nodes.Node", "previousSibling", ""}}, 3);
  assertNotNull(actual);
  assertEquals("[Lorg.jsoup.nodes.Node;", actual.getClass().getName());
  assertEquals("[<!DOCTYPE a PUBLIC \"0\" \"sample\">, \n<!--a-->, a]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "\n<!--a--><!DOCTYPE a PUBLIC \"0\" \"sample\">\n <!--a-->a {getData=a}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput014() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jsoup.nodes.Node", "org.jsoup.nodes.Comment", "before", new String[]{"org.jsoup.nodes.Node"}, new String[]{"<sample:6>"}, false, 2, new String[][]{{"org.jsoup.nodes.Node", "setParentNode", "org.jsoup.nodes.Node", "<sample:3>"}}), new String[][]{{"replaceWith", "org.jsoup.nodes.Node", "3"}});
  assertNotNull(actual);
  assertEquals("org.jsoup.nodes.Comment", actual.getClass().getName());
  assertEquals("\n<!--sample--> {getData=sample}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "\n<!--sample--> {getData=sample}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput015() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jsoup.nodes.Node", "org.jsoup.nodes.Comment", "before", new String[]{"org.jsoup.nodes.Node"}, new String[]{"<sample:2>"}, false, 0, new String[][]{{"org.jsoup.nodes.Node", "setParentNode", "org.jsoup.nodes.Node", "<sample:8>"}}), new String[][]{{"siblingNodes", "", "5"}});
  assertNotNull(actual);
  assertEquals("java.util.ArrayList", actual.getClass().getName());
  assertEquals("[]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "\n<!--a--> {getData=a}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput016() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jsoup.nodes.Node", "org.jsoup.nodes.Comment", "removeAttr", new String[]{"java.lang.String"}, new String[]{"Tmull"}, false, 0, new String[][]{{"org.jsoup.nodes.Node", "equals", "java.lang.Object", "<i:23>"}}, 2), new String[][]{{"siblingNodes", "", "7"}});
  assertNotNull(actual);
  assertEquals("java.util.Collections$EmptyList", actual.getClass().getName());
  assertEquals("[]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "\n<!--a--> {getData=a}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput017() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jsoup.nodes.Node", "org.jsoup.nodes.Comment", "before", new String[]{"java.lang.String"}, new String[]{"1L"}, false, 2, new String[][]{{"org.jsoup.nodes.Node", "equals", "java.lang.Object", "<s:at>"}, {"org.jsoup.nodes.Node", "setParentNode", "org.jsoup.nodes.Node", "<sample:2>"}}, 3), new String[][]{{"after", "java.lang.String", "0"}});
  assertNotNull(actual);
  assertEquals("org.jsoup.nodes.Comment", actual.getClass().getName());
  assertEquals("\n<!--sample--> {getData=sample}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "\n<!--sample--> {getData=sample}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput018() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jsoup.nodes.Node", "org.jsoup.nodes.Comment", "doClone", new String[]{"org.jsoup.nodes.Node"}, new String[]{"<sample:0>"}, false, 3, new String[][]{{"org.jsoup.nodes.Node", "setSiblingIndex", "int", "2147483647"}}, 2), new String[][]{{"previousSibling", "", "3"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IndexOutOfBoundsException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput019() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jsoup.nodes.Node", "org.jsoup.nodes.Comment", "before", new String[]{"java.lang.String"}, new String[]{"133456789012345678901234567890http://example.com/a?b=c"}, false, 0, new String[][]{{"org.jsoup.nodes.Node", "childNode", "int", "131072"}, {"org.jsoup.nodes.Node", "setParentNode", "org.jsoup.nodes.Node", "<sample:8>"}}, 3), new String[][]{{"wrap", "java.lang.String", "3"}, {"parentNode", "", "5"}});
  assertNotNull(actual);
  assertEquals("org.jsoup.nodes.Element", actual.getClass().getName());
  assertEquals("<head>\n <!--a-->\n</head> {hasText=false, isBlock=true}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "\n<!--a--> {getData=a}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput020() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jsoup.nodes.Node", "org.jsoup.nodes.Comment", "clone", new String[]{}, new String[]{}, false, 4, new String[][]{{"org.jsoup.nodes.Node", "addChildren", "org.jsoup.nodes.Node[]", "<sample:2>"}, {"org.jsoup.nodes.Node", "after", "java.lang.String", "a"}}, 1), new String[][]{{"hasAttr", "java.lang.String", "1"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "\n<!--a--><!doctype a>\n <!--a-->a {getData=a}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput021() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jsoup.nodes.Node", "org.jsoup.nodes.Comment", "childNodesCopy", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.jsoup.nodes.Node", "after", "org.jsoup.nodes.Node", "<sample:3>"}, {"org.jsoup.nodes.Node", "addChildren", "int,org.jsoup.nodes.Node[]", "0", "<sample:4>"}}, 3), new String[][]{{"size", "", "3"}, {"iterator", "", "7"}});
  assertNotNull(actual);
  assertEquals("java.util.ArrayList$Itr", actual.getClass().getName());
  assertEquals("{hasNext=true}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "\n<!--a-->a\n <!--a--> {getData=a}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput022() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Node", "org.jsoup.nodes.Comment", "setParentNode", new String[]{"org.jsoup.nodes.Node"}, new String[]{"<sample:5>"}, false, 0, null, 3);
  assertNull(actual);
  assertEquals("receiver state after the call", "\n<!--a--> {getData=a}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput023() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Node", "org.jsoup.nodes.Comment", "hashCode", new String[]{}, new String[]{}, false, 2, new String[][]{}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("-1652900461", String.valueOf(actual));
  assertEquals("receiver state after the call", "\n<!--sample--> {getData=sample}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput024() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Node", "org.jsoup.nodes.Comment", "ownerDocument", new String[]{}, new String[]{}, false, 2, new String[][]{}, 1);
  assertNull(actual);
  assertEquals("receiver state after the call", "\n<!--sample--> {getData=sample}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput025() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Node", "org.jsoup.nodes.Comment", "nextSibling", new String[]{}, new String[]{}, false, 2, new String[][]{}, 1);
  assertNull(actual);
  assertEquals("receiver state after the call", "\n<!--sample--> {getData=sample}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput026() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jsoup.nodes.Node", "org.jsoup.nodes.Comment", "wrap", new String[]{"java.lang.String"}, new String[]{"000"}, false, 0, new String[][]{{"org.jsoup.nodes.Node", "unwrap", ""}}, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput027() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Node", "org.jsoup.nodes.Comment", "setParentNode", new String[]{"org.jsoup.nodes.Node"}, new String[]{"<sample:0>"}, false, 0, null, 2);
  assertNull(actual);
  assertEquals("receiver state after the call", "\n<!--a--> {getData=a}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput028() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jsoup.nodes.Node", "org.jsoup.nodes.Comment", "wrap", new String[]{"java.lang.String"}, new String[]{"[1"}, false, 7, new String[][]{{"org.jsoup.nodes.Node", "wrap", "java.lang.String", "trve"}}, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput029() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Node", "org.jsoup.nodes.Comment", "outerHtml", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.jsoup.nodes.Node", "ensureChildNodes", ""}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("\n<!--a-->", String.valueOf(actual));
  assertEquals("receiver state after the call", "\n<!--a--> {getData=a}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput030() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Node", "org.jsoup.nodes.Comment", "baseUri", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.jsoup.nodes.Node", "equals", "java.lang.Object", "<i:1>"}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "\n<!--a--> {getData=a}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput031() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Node", "org.jsoup.nodes.Comment", "nextSibling", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.jsoup.nodes.Node", "childNodesAsArray", ""}}, 1);
  assertNull(actual);
  assertEquals("receiver state after the call", "\n<!--a--> {getData=a}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput032() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Node", "org.jsoup.nodes.Comment", "nextSibling", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.jsoup.nodes.Node", "previousSibling", ""}}, 1);
  assertNull(actual);
  assertEquals("receiver state after the call", "\n<!--a--> {getData=a}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput033() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Node", "org.jsoup.nodes.Comment", "nodeName", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.jsoup.nodes.Node", "childNodesCopy", ""}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("#comment", String.valueOf(actual));
  assertEquals("receiver state after the call", "\n<!--a--> {getData=a}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput034() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Node", "org.jsoup.nodes.Comment", "ownerDocument", new String[]{}, new String[]{}, false, 5, new String[][]{{"org.jsoup.nodes.Node", "doClone", "org.jsoup.nodes.Node", "<sample:5>"}, {"org.jsoup.nodes.Node", "hasAttr", "java.lang.String", "=a,b,c"}}, 3);
  assertNull(actual);
  assertEquals("receiver state after the call", "\n<!--0--> {getData=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput035() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Node", "org.jsoup.nodes.Comment", "outerHtml", new String[]{"java.lang.StringBuilder"}, new String[]{"<sample:3>"}, false, 0, new String[][]{{"org.jsoup.nodes.Node", "ensureChildNodes", ""}}, 1);
  assertNull(actual);
  assertEquals("receiver state after the call", "\n<!--a--> {getData=a}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput036() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jsoup.nodes.Node", "org.jsoup.nodes.Comment", "clone", new String[]{}, new String[]{}, false, 0, null, 1), new String[][]{{"childNodeSize", "", "0"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "\n<!--a--> {getData=a}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput037() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Node", "org.jsoup.nodes.Comment", "clone", new String[]{}, new String[]{}, false, 0, null, 1);
  assertNotNull(actual);
  assertEquals("org.jsoup.nodes.Comment", actual.getClass().getName());
  assertEquals("\n<!--a--> {getData=a}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "\n<!--a--> {getData=a}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput038() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jsoup.nodes.Node", "org.jsoup.nodes.Comment", "after", new String[]{"org.jsoup.nodes.Node"}, new String[]{"<sample:0>"}, false, 7, new String[][]{}, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput039() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jsoup.nodes.Node", "org.jsoup.nodes.Comment", "attributes", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.jsoup.nodes.Node", "hasAttr", "java.lang.String", "/a/"}}, 1), new String[][]{{"put", "java.lang.String,boolean", "3"}, {"dataset", "", "7"}});
  assertNotNull(actual);
  assertEquals("org.jsoup.nodes.Attributes$Dataset", actual.getClass().getName());
  assertEquals("{}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "\n<!--a--> {getData=a}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput040() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Node", "org.jsoup.nodes.Comment", "clone", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.jsoup.nodes.Node", "indent", "java.lang.StringBuilder,int,org.jsoup.nodes.Document$OutputSettings", "<sample:1>", "-12", "<sample:6>"}}, 2);
  assertNotNull(actual);
  assertEquals("org.jsoup.nodes.Comment", actual.getClass().getName());
  assertEquals("\n<!--a--> {getData=a}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "\n<!--a--> {getData=a}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput041() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jsoup.nodes.Node", "org.jsoup.nodes.Comment", "before", new String[]{"java.lang.String"}, new String[]{"true"}, false, 2, new String[][]{}, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput042() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Node", "org.jsoup.nodes.Comment", "attr", new String[]{"java.lang.String"}, new String[]{"#uext"}, false, 0, null, 2);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("", String.valueOf(actual));
  assertEquals("receiver state after the call", "\n<!--a--> {getData=a}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput043() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jsoup.nodes.Node", "org.jsoup.nodes.Comment", "clone", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.jsoup.nodes.Node", "attr", "java.lang.String", "/a/b"}}, 1), new String[][]{{"attr", "java.lang.String", "7"}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("", String.valueOf(actual));
  assertEquals("receiver state after the call", "\n<!--a--> {getData=a}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput044() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Node", "org.jsoup.nodes.Comment", "ensureChildNodes", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.jsoup.nodes.Node", "nodeName", ""}}, 1);
  assertNull(actual);
  assertEquals("receiver state after the call", "\n<!--a--> {getData=a}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput045() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jsoup.nodes.Node", "org.jsoup.nodes.Comment", "getOutputSettings", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.jsoup.nodes.Node", "getOutputSettings", ""}}, 3), new String[][]{{"clone", "", "1"}, {"syntax", "", "1"}});
  assertNotNull(actual);
  assertEquals("org.jsoup.nodes.Document$OutputSettings$Syntax", actual.getClass().getName());
  assertEquals("html", String.valueOf(actual));
  assertEquals("receiver state after the call", "\n<!--a--> {getData=a}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput046() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jsoup.nodes.Node", "org.jsoup.nodes.Comment", "remove", new String[]{}, new String[]{}, false, 0, null, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput047() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Node", "org.jsoup.nodes.Comment", "toString", new String[]{}, new String[]{}, false, 1, new String[][]{{"org.jsoup.nodes.Node", "outerHtml", "java.lang.StringBuilder", "<sample:0>"}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("\n<!--0-->", String.valueOf(actual));
  assertEquals("receiver state after the call", "\n<!--0--> {getData=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput048() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Node", "org.jsoup.nodes.Comment", "ownerDocument", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.jsoup.nodes.Node", "addChildren", "org.jsoup.nodes.Node[]", "<sample:0>"}}, 1);
  assertNull(actual);
  assertEquals("receiver state after the call", "\n<!--a-->a {getData=a}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput049() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jsoup.nodes.Node", "org.jsoup.nodes.Comment", "clone", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.jsoup.nodes.Node", "attr", "java.lang.String", "0xFFFFFFtF"}, {"org.jsoup.nodes.Node", "removeChild", "org.jsoup.nodes.Node", "<sample:8>"}}, 3), new String[][]{{"attr", "java.lang.String", "1"}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("", String.valueOf(actual));
  assertEquals("receiver state after the call", "\n<!--a--> {getData=a}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput050() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jsoup.nodes.Node", "org.jsoup.nodes.Comment", "getOutputSettings", new String[]{}, new String[]{}, false, 0, null, 2), new String[][]{{"outline", "", "4"}, {"escapeMode", "org.jsoup.nodes.Entities$EscapeMode", "6"}});
  assertNotNull(actual);
  assertEquals("org.jsoup.nodes.Document$OutputSettings", actual.getClass().getName());
  assertEquals("receiver state after the call", "\n<!--a--> {getData=a}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput051() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Node", "org.jsoup.nodes.Comment", "nodeName", new String[]{}, new String[]{}, false, 3, new String[][]{{"org.jsoup.nodes.Node", "removeChild", "org.jsoup.nodes.Node", "<sample:6>"}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("#comment", String.valueOf(actual));
  assertEquals("receiver state after the call", "\n<!----> {getData=}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput052() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jsoup.nodes.Node", "org.jsoup.nodes.Comment", "indent", new String[]{"java.lang.StringBuilder", "int", "org.jsoup.nodes.Document$OutputSettings"}, new String[]{"<sample:0>", "-1", "<null>"}, false, 0, null, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput053() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Node", "org.jsoup.nodes.Comment", "previousSibling", new String[]{}, new String[]{}, false, 0, null, 1);
  assertNull(actual);
  assertEquals("receiver state after the call", "\n<!--a--> {getData=a}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput054() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Node", "org.jsoup.nodes.Comment", "hasAttr", new String[]{"java.lang.String"}, new String[]{"1K"}, false, 0, null, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "\n<!--a--> {getData=a}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput055() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Node", "org.jsoup.nodes.Comment", "childNodeSize", new String[]{}, new String[]{}, false, 0, null, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "\n<!--a--> {getData=a}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput056() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jsoup.nodes.Node", "org.jsoup.nodes.Comment", "removeChild", new String[]{"org.jsoup.nodes.Node"}, new String[]{"<sample:7>"}, false, 0, new String[][]{{"org.jsoup.nodes.Node", "toString", ""}}, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput057() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Node", "org.jsoup.nodes.Comment", "addChildren", new String[]{"int", "org.jsoup.nodes.Node[]"}, new String[]{"-10", "<empty>"}, false, 7, new String[][]{}, 1);
  assertNull(actual);
  assertEquals("receiver state after the call", "\n<!----> {getData=}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput058() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jsoup.nodes.Node", "org.jsoup.nodes.Comment", "childNodes", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.jsoup.nodes.Node", "clone", ""}}, 2), new String[][]{{"remove", "int", "1"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.UnsupportedOperationException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput059() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Node", "org.jsoup.nodes.Comment", "attr", new String[]{"java.lang.String"}, new String[]{"abs"}, false, 0, new String[][]{{"org.jsoup.nodes.Node", "replaceWith", "org.jsoup.nodes.Node", "<sample:6>"}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("", String.valueOf(actual));
  assertEquals("receiver state after the call", "\n<!--a--> {getData=a}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput060() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Node", "org.jsoup.nodes.Comment", "outerHtml", new String[]{"java.lang.StringBuilder"}, new String[]{"<sample:0>"}, false, 0, null, 2);
  assertNull(actual);
  assertEquals("receiver state after the call", "\n<!--a--> {getData=a}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput061() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Node", "org.jsoup.nodes.Comment", "absUrl", new String[]{"java.lang.String"}, new String[]{"4.512:30:45"}, false, 0, new String[][]{{"org.jsoup.nodes.Node", "doClone", "org.jsoup.nodes.Node", "<sample:6>"}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("", String.valueOf(actual));
  assertEquals("receiver state after the call", "\n<!--a--> {getData=a}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput062() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Node", "org.jsoup.nodes.Comment", "setBaseUri", new String[]{"java.lang.String"}, new String[]{"-0.\"0http://example.com/a?b=c"}, false, 0, null, 1);
  assertNull(actual);
  assertEquals("receiver state after the call", "\n<!--a--> {getData=a}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput063() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Node", "org.jsoup.nodes.Comment", "ownerDocument", new String[]{}, new String[]{}, false, 0, null, 3);
  assertNull(actual);
  assertEquals("receiver state after the call", "\n<!--a--> {getData=a}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput064() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Node", "org.jsoup.nodes.Comment", "removeAttr", new String[]{"java.lang.String"}, new String[]{"0x1"}, false, 7, new String[][]{{"org.jsoup.nodes.Node", "after", "java.lang.String", "Bx1F"}, {"org.jsoup.nodes.Node", "after", "java.lang.String", "1.5d2020-02-30T25:61:61\n"}}, 1);
  assertNotNull(actual);
  assertEquals("org.jsoup.nodes.Comment", actual.getClass().getName());
  assertEquals("\n<!----> {getData=}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "\n<!----> {getData=}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput065() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jsoup.nodes.Node", "org.jsoup.nodes.Comment", "after", new String[]{"java.lang.String"}, new String[]{"123446789012345678901234567990"}, false, 0, new String[][]{{"org.jsoup.nodes.Node", "after", "org.jsoup.nodes.Node", "<sample:1>"}}, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput066() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Node", "org.jsoup.nodes.Comment", "attributes", new String[]{}, new String[]{}, false, 0, null, 1);
  assertNotNull(actual);
  assertEquals("org.jsoup.nodes.Attributes", actual.getClass().getName());
  assertEquals(" comment=\"a\" {size=1}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "\n<!--a--> {getData=a}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput067() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Node", "org.jsoup.nodes.Comment", "equals", new String[]{"java.lang.Object"}, new String[]{"<s:fa>"}, false, 0, new String[][]{{"org.jsoup.nodes.Node", "childNodesCopy", ""}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "\n<!--a--> {getData=a}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput068() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Node", "org.jsoup.nodes.Comment", "absUrl", new String[]{"java.lang.String"}, new String[]{".5"}, false, 0, new String[][]{{"org.jsoup.nodes.Node", "setSiblingIndex", "int", "0"}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("", String.valueOf(actual));
  assertEquals("receiver state after the call", "\n<!--a--> {getData=a}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput069() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jsoup.nodes.Node", "org.jsoup.nodes.Comment", "childNode", new String[]{"int"}, new String[]{"-2147483392"}, false, 0, new String[][]{{"org.jsoup.nodes.Node", "outerHtml", "java.lang.StringBuilder", "<null>"}}, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IndexOutOfBoundsException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput070() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Node", "org.jsoup.nodes.Comment", "attributes", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.jsoup.nodes.Node", "nodeName", ""}}, 2);
  assertNotNull(actual);
  assertEquals("org.jsoup.nodes.Attributes", actual.getClass().getName());
  assertEquals(" comment=\"a\" {size=1}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "\n<!--a--> {getData=a}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput071() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Node", "org.jsoup.nodes.Comment", "outerHtml", new String[]{}, new String[]{}, false, 7, new String[][]{}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("\n<!---->", String.valueOf(actual));
  assertEquals("receiver state after the call", "\n<!----> {getData=}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput072() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jsoup.nodes.Node", "org.jsoup.nodes.Comment", "before", new String[]{"org.jsoup.nodes.Node"}, new String[]{"<sample:8>"}, false, 6, new String[][]{{"org.jsoup.nodes.Node", "addChildren", "org.jsoup.nodes.Node[]", "<null>"}, {"org.jsoup.nodes.Node", "replaceWith", "org.jsoup.nodes.Node", "<sample:7>"}}, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput073() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Node", "org.jsoup.nodes.Comment", "baseUri", new String[]{}, new String[]{}, false, 0, null, 3);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "\n<!--a--> {getData=a}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput074() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jsoup.nodes.Node", "org.jsoup.nodes.Comment", "outerHtml", new String[]{"java.lang.StringBuilder"}, new String[]{"<null>"}, false, 0, null, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput075() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Node", "org.jsoup.nodes.Comment", "outerHtmlHead", new String[]{"java.lang.StringBuilder", "int", "org.jsoup.nodes.Document$OutputSettings"}, new String[]{"<sample:0>", "6", "<sample:6>"}, false, 2, new String[][]{{"org.jsoup.nodes.Node", "reparentChild", "org.jsoup.nodes.Node", "<sample:8>"}}, 1);
  assertNull(actual);
  assertEquals("receiver state after the call", "\n<!--sample--> {getData=sample}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput076() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jsoup.nodes.Node", "org.jsoup.nodes.Comment", "childNodes", new String[]{}, new String[]{}, false, 7, new String[][]{{"org.jsoup.nodes.Node", "nextSibling", ""}}, 1), new String[][]{{"isEmpty", "", "7"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
  assertEquals("receiver state after the call", "\n<!----> {getData=}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput077() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jsoup.nodes.Node", "org.jsoup.nodes.Comment", "attributes", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.jsoup.nodes.Node", "parentNode", ""}, {"org.jsoup.nodes.Node", "after", "java.lang.String", "1.5/"}}, 3), new String[][]{{"clone", "", "7"}});
  assertNotNull(actual);
  assertEquals("org.jsoup.nodes.Attributes", actual.getClass().getName());
  assertEquals(" comment=\"a\" {size=1}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "\n<!--a--> {getData=a}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput078() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jsoup.nodes.Node", "org.jsoup.nodes.Comment", "traverse", new String[]{"org.jsoup.select.NodeVisitor"}, new String[]{"<sample:6>"}, false, 0, new String[][]{{"org.jsoup.nodes.Node", "absUrl", "java.lang.String", "http://ewample.com/a?b=c"}}, 1), new String[][]{{"replaceWith", "org.jsoup.nodes.Node", "6"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput079() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Node", "org.jsoup.nodes.Comment", "attributes", new String[]{}, new String[]{}, false, 6, new String[][]{{"org.jsoup.nodes.Node", "doClone", "org.jsoup.nodes.Node", "<sample:1>"}}, 1);
  assertNotNull(actual);
  assertEquals("org.jsoup.nodes.Attributes", actual.getClass().getName());
  assertEquals(" comment=\"a\" <a><b>t</b></a>=\"{&quot;a&quot;:1}\" {size=2}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "\n<!--a--> {getData=a}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput080() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Node", "org.jsoup.nodes.Comment", "hashCode", new String[]{}, new String[]{}, false, 0, null, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("-458083364", String.valueOf(actual));
  assertEquals("receiver state after the call", "\n<!--a--> {getData=a}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput081() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jsoup.nodes.Node", "org.jsoup.nodes.Comment", "before", new String[]{"java.lang.String"}, new String[]{"--1"}, false, 1, new String[][]{{"org.jsoup.nodes.Node", "outerHtml", ""}}, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput082() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jsoup.nodes.Node", "org.jsoup.nodes.Comment", "after", new String[]{"org.jsoup.nodes.Node"}, new String[]{"<sample:8>"}, false, 3, new String[][]{{"org.jsoup.nodes.Node", "parentNode", ""}}, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput083() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jsoup.nodes.Node", "org.jsoup.nodes.Comment", "addChildren", new String[]{"int", "org.jsoup.nodes.Node[]"}, new String[]{"-2147483648", "<sample:1>"}, false, 5, new String[][]{}, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IndexOutOfBoundsException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput084() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jsoup.nodes.Node", "org.jsoup.nodes.Comment", "before", new String[]{"java.lang.String"}, new String[]{"1abc"}, false, 7, new String[][]{}, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput085() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Node", "org.jsoup.nodes.Comment", "clone", new String[]{}, new String[]{}, false, 0, null, 3);
  assertNotNull(actual);
  assertEquals("org.jsoup.nodes.Comment", actual.getClass().getName());
  assertEquals("\n<!--a--> {getData=a}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "\n<!--a--> {getData=a}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput086() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Node", "org.jsoup.nodes.Comment", "reparentChild", new String[]{"org.jsoup.nodes.Node"}, new String[]{"<sample:6>"}, false, 7, new String[][]{}, 1);
  assertNull(actual);
  assertEquals("receiver state after the call", "\n<!----> {getData=}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput087() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jsoup.nodes.Node", "org.jsoup.nodes.Comment", "addChildren", new String[]{"org.jsoup.nodes.Node[]"}, new String[]{"<null>"}, false, 0, null, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput088() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jsoup.nodes.Node", "org.jsoup.nodes.Comment", "attributes", new String[]{}, new String[]{}, false, 3, new String[][]{}, 1), new String[][]{{"clone", "", "4"}});
  assertNotNull(actual);
  assertEquals("org.jsoup.nodes.Attributes", actual.getClass().getName());
  assertEquals(" comment=\"\" {size=1}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "\n<!----> {getData=}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput089() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Node", "org.jsoup.nodes.Comment", "absUrl", new String[]{"java.lang.String"}, new String[]{"1.12345678901234567"}, false, 0, null, 1);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("", String.valueOf(actual));
  assertEquals("receiver state after the call", "\n<!--a--> {getData=a}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput090() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Node", "org.jsoup.nodes.Comment", "addChildren", new String[]{"org.jsoup.nodes.Node[]"}, new String[]{"<sample:7>"}, false, 6, new String[][]{{"org.jsoup.nodes.Node", "siblingIndex", ""}}, 3);
  assertNull(actual);
  assertEquals("receiver state after the call", "\n<!--a-->\n <!--a-->0 {getData=a}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput091() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jsoup.nodes.Node", "org.jsoup.nodes.Comment", "attributes", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.jsoup.nodes.Node", "attributes", ""}}, 3), new String[][]{{"get", "java.lang.String", "5"}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("", String.valueOf(actual));
  assertEquals("receiver state after the call", "\n<!--a--> {getData=a}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput092() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jsoup.nodes.Node", "org.jsoup.nodes.Comment", "getOutputSettings", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.jsoup.nodes.Node", "unwrap", ""}}, 1), new String[][]{{"clone", "", "4"}});
  assertNotNull(actual);
  assertEquals("org.jsoup.nodes.Document$OutputSettings", actual.getClass().getName());
  assertEquals("receiver state after the call", "\n<!--a--> {getData=a}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput093() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Node", "org.jsoup.nodes.Comment", "nodeName", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.jsoup.nodes.Node", "absUrl", "java.lang.String", "C"}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("#comment", String.valueOf(actual));
  assertEquals("receiver state after the call", "\n<!--a--> {getData=a}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput094() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Node", "org.jsoup.nodes.Comment", "parentNode", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.jsoup.nodes.Node", "toString", ""}}, 2);
  assertNull(actual);
  assertEquals("receiver state after the call", "\n<!--a--> {getData=a}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput095() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jsoup.nodes.Node", "org.jsoup.nodes.Comment", "wrap", new String[]{"java.lang.String"}, new String[]{"1.512:30:45"}, false, 7, new String[][]{{"org.jsoup.nodes.Node", "attr", "java.lang.String", ""}}, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput096() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Node", "org.jsoup.nodes.Comment", "ensureChildNodes", new String[]{}, new String[]{}, false, 7, new String[][]{{"org.jsoup.nodes.Node", "unwrap", ""}}, 3);
  assertNull(actual);
  assertEquals("receiver state after the call", "\n<!----> {getData=}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput097() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Node", "org.jsoup.nodes.Comment", "childNodes", new String[]{}, new String[]{}, false);
  assertNotNull(actual);
  assertEquals("java.util.Collections$UnmodifiableRandomAccessList", actual.getClass().getName());
  assertEquals("[]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "\n<!--a--> {getData=a}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput098() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Node", "org.jsoup.nodes.Comment", "attr", new String[]{"java.lang.String", "java.lang.String"}, new String[]{"=a>b<", "9.5d"}, false, 6, new String[][]{});
  assertNotNull(actual);
  assertEquals("org.jsoup.nodes.Comment", actual.getClass().getName());
  assertEquals("\n<!--a--> {getData=a}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "\n<!--a--> {getData=a}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput099() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jsoup.nodes.Node", "org.jsoup.nodes.Comment", "wrap", new String[]{"java.lang.String"}, new String[]{"5."}, false); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput100() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Node", "org.jsoup.nodes.Comment", "absUrl", new String[]{"java.lang.String"}, new String[]{"a\037b"}, false, 0, new String[][]{{"org.jsoup.nodes.Node", "before", "org.jsoup.nodes.Node", "<sample:0>"}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("", String.valueOf(actual));
  assertEquals("receiver state after the call", "\n<!--a--> {getData=a}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput101() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Node", "org.jsoup.nodes.Comment", "addChildren", new String[]{"int", "org.jsoup.nodes.Node[]"}, new String[]{"2147483647", "<empty>"}, false, 2, new String[][]{{"org.jsoup.nodes.Node", "doClone", "org.jsoup.nodes.Node", "<sample:6>"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "\n<!--sample--> {getData=sample}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput102() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Node", "org.jsoup.nodes.Comment", "nodeName", new String[]{}, new String[]{}, false, 4, new String[][]{});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("#comment", String.valueOf(actual));
  assertEquals("receiver state after the call", "\n<!--a--> {getData=a}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput103() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jsoup.nodes.Node", "org.jsoup.nodes.Comment", "outerHtmlHead", new String[]{"java.lang.StringBuilder", "int", "org.jsoup.nodes.Document$OutputSettings"}, new String[]{"<null>", "2147483647", "<sample:6>"}, false); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput104() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jsoup.nodes.Node", "org.jsoup.nodes.Comment", "after", new String[]{"java.lang.String"}, new String[]{"Hellop World"}, false); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput105() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Node", "org.jsoup.nodes.Comment", "doClone", new String[]{"org.jsoup.nodes.Node"}, new String[]{"<sample:3>"}, false, 0, new String[][]{{"org.jsoup.nodes.Node", "ensureChildNodes", ""}, {"org.jsoup.nodes.Node", "unwrap", ""}});
  assertNotNull(actual);
  assertEquals("org.jsoup.nodes.Comment", actual.getClass().getName());
  assertEquals("\n<!--a--> {getData=a}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "\n<!--a--> {getData=a}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput106() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jsoup.nodes.Node", "org.jsoup.nodes.Comment", "after", new String[]{"org.jsoup.nodes.Node"}, new String[]{"<sample:6>"}, false, 1, new String[][]{}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput107() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Node", "org.jsoup.nodes.Comment", "absUrl", new String[]{"java.lang.String"}, new String[]{"babs:"}, false, 3, new String[][]{{"org.jsoup.nodes.Node", "after", "org.jsoup.nodes.Node", "<sample:1>"}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("", String.valueOf(actual));
  assertEquals("receiver state after the call", "\n<!----> {getData=}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput108() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jsoup.nodes.Node", "org.jsoup.nodes.Comment", "before", new String[]{"java.lang.String"}, new String[]{"1.12345678/a/b"}, false, 0, new String[][]{{"org.jsoup.nodes.Node", "outerHtml", "java.lang.StringBuilder", "<sample:1>"}, {"org.jsoup.nodes.Node", "remove", ""}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput109() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Node", "org.jsoup.nodes.Comment", "setParentNode", new String[]{"org.jsoup.nodes.Node"}, new String[]{"<sample:7>"}, false, 3, new String[][]{{"org.jsoup.nodes.Node", "siblingNodes", ""}});
  assertNull(actual);
  assertEquals("receiver state after the call", "\n<!----> {getData=}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput110() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Node", "org.jsoup.nodes.Comment", "attributes", new String[]{}, new String[]{}, false, 1, new String[][]{});
  assertNotNull(actual);
  assertEquals("org.jsoup.nodes.Attributes", actual.getClass().getName());
  assertEquals(" comment=\"0\" {size=1}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "\n<!--0--> {getData=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput111() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Node", "org.jsoup.nodes.Comment", "setSiblingIndex", new String[]{"int"}, new String[]{"-12"}, false, 3, new String[][]{});
  assertNull(actual);
  assertEquals("receiver state after the call", "\n<!----> {getData=}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput112() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Node", "org.jsoup.nodes.Comment", "parent", new String[]{}, new String[]{}, false, 1, new String[][]{});
  assertNull(actual);
  assertEquals("receiver state after the call", "\n<!--0--> {getData=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput113() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Node", "org.jsoup.nodes.Comment", "ownerDocument", new String[]{}, new String[]{}, false);
  assertNull(actual);
  assertEquals("receiver state after the call", "\n<!--a--> {getData=a}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput114() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jsoup.nodes.Node", "org.jsoup.nodes.Comment", "childNode", new String[]{"int"}, new String[]{"1073741823"}, false, 0, new String[][]{{"org.jsoup.nodes.Node", "toString", ""}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IndexOutOfBoundsException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput115() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Node", "org.jsoup.nodes.Comment", "ensureChildNodes", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.jsoup.nodes.Node", "absUrl", "java.lang.String", "0xFGFFFFFF1.5e300"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "\n<!--a--> {getData=a}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput116() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jsoup.nodes.Node", "org.jsoup.nodes.Comment", "attr", new String[]{"java.lang.String", "java.lang.String"}, new String[]{"?", "a,b,ci"}, false, 0, new String[][]{{"org.jsoup.nodes.Node", "outerHtmlTail", "java.lang.StringBuilder,int,org.jsoup.nodes.Document$OutputSettings", "<empty>", "10", "<null>"}}), new String[][]{{"after", "java.lang.String", "2"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput117() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Node", "org.jsoup.nodes.Comment", "parentNode", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.jsoup.nodes.Node", "before", "java.lang.String", "aa,b,c\t"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "\n<!--a--> {getData=a}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput118() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Node", "org.jsoup.nodes.Comment", "absUrl", new String[]{"java.lang.String"}, new String[]{"1.12345678901234561e10"}, false, 1, new String[][]{});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("", String.valueOf(actual));
  assertEquals("receiver state after the call", "\n<!--0--> {getData=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput119() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jsoup.nodes.Node", "org.jsoup.nodes.Comment", "indent", new String[]{"java.lang.StringBuilder", "int", "org.jsoup.nodes.Document$OutputSettings"}, new String[]{"<sample:3>", "-2", "<sample:9>"}, false); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput120() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jsoup.nodes.Node", "org.jsoup.nodes.Comment", "addChildren", new String[]{"int", "org.jsoup.nodes.Node[]"}, new String[]{"1073741834", "<sample:4>"}, false); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IndexOutOfBoundsException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput121() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Node", "org.jsoup.nodes.Comment", "absUrl", new String[]{"java.lang.String"}, new String[]{"[1,2]"}, false, 2, new String[][]{{"org.jsoup.nodes.Node", "siblingNodes", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("", String.valueOf(actual));
  assertEquals("receiver state after the call", "\n<!--sample--> {getData=sample}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput122() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Node", "org.jsoup.nodes.Comment", "setBaseUri", new String[]{"java.lang.String"}, new String[]{"1.512:30:45"}, false, 3, new String[][]{});
  assertNull(actual);
  assertEquals("receiver state after the call", "\n<!----> {getData=}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput123() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Node", "org.jsoup.nodes.Comment", "clone", new String[]{}, new String[]{}, false);
  assertNotNull(actual);
  assertEquals("org.jsoup.nodes.Comment", actual.getClass().getName());
  assertEquals("\n<!--a--> {getData=a}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "\n<!--a--> {getData=a}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput124() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Node", "org.jsoup.nodes.Comment", "reparentChild", new String[]{"org.jsoup.nodes.Node"}, new String[]{"<sample:6>"}, false, 3, new String[][]{});
  assertNull(actual);
  assertEquals("receiver state after the call", "\n<!----> {getData=}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput125() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jsoup.nodes.Node", "org.jsoup.nodes.Comment", "remove", new String[]{}, new String[]{}, false); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput126() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Node", "org.jsoup.nodes.Comment", "nodeName", new String[]{}, new String[]{}, false, 3, new String[][]{});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("#comment", String.valueOf(actual));
  assertEquals("receiver state after the call", "\n<!----> {getData=}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput127() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jsoup.nodes.Node", "org.jsoup.nodes.Comment", "clone", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.jsoup.nodes.Node", "removeChild", "org.jsoup.nodes.Node", "<sample:8>"}}), new String[][]{{"clone", "", "3"}, {"wrap", "java.lang.String", "3"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput128() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Node", "org.jsoup.nodes.Comment", "reparentChild", new String[]{"org.jsoup.nodes.Node"}, new String[]{"<sample:8>"}, false, 0, new String[][]{{"org.jsoup.nodes.Node", "outerHtml", ""}, {"org.jsoup.nodes.Node", "attr", "java.lang.String,java.lang.String", "Z11,2]", "abs:=a>b<"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "\n<!--a--> {getData=a}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput129() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jsoup.nodes.Node", "org.jsoup.nodes.Comment", "attr", new String[]{"java.lang.String", "java.lang.String"}, new String[]{"1.5e3", "12:30:45"}, false), new String[][]{{"nodeName", "", "5"}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("#comment", String.valueOf(actual));
  assertEquals("receiver state after the call", "\n<!--a--> {getData=a}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput130() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Node", "org.jsoup.nodes.Comment", "outerHtml", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.jsoup.nodes.Node", "addChildren", "org.jsoup.nodes.Node[]", "<sample:4>"}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("\n<!--a-->a\n <!--a-->", String.valueOf(actual));
  assertEquals("receiver state after the call", "\n<!--a-->a\n <!--a--> {getData=a}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput131() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jsoup.nodes.Node", "org.jsoup.nodes.Comment", "addChildren", new String[]{"int", "org.jsoup.nodes.Node[]"}, new String[]{"-10", "<sample:5>"}, false, 4, new String[][]{{"org.jsoup.nodes.Node", "attr", "java.lang.String", "1"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IndexOutOfBoundsException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput132() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Node", "org.jsoup.nodes.Comment", "equals", new String[]{"java.lang.Object"}, new String[]{"<i:-1>"}, false);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "\n<!--a--> {getData=a}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput133() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Node", "org.jsoup.nodes.Comment", "addChildren", new String[]{"int", "org.jsoup.nodes.Node[]"}, new String[]{"-1", "<empty>"}, false, 0, new String[][]{{"org.jsoup.nodes.Node", "after", "org.jsoup.nodes.Node", "<sample:7>"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "\n<!--a--> {getData=a}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput134() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Node", "org.jsoup.nodes.Comment", "attr", new String[]{"java.lang.String"}, new String[]{"0xFFFFFFFF"}, false);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("", String.valueOf(actual));
  assertEquals("receiver state after the call", "\n<!--a--> {getData=a}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput135() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Node", "org.jsoup.nodes.Comment", "ensureChildNodes", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.jsoup.nodes.Node", "addChildren", "org.jsoup.nodes.Node[]", "<sample:1>"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "\n<!--a-->\n <#root></#root><!DOCTYPE a PUBLIC \"0\" \"sample\"> {getData=a}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput136() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Node", "org.jsoup.nodes.Comment", "attr", new String[]{"java.lang.String"}, new String[]{"5/1.12345678901234567"}, false, 2, new String[][]{});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("", String.valueOf(actual));
  assertEquals("receiver state after the call", "\n<!--sample--> {getData=sample}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput137() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Node", "org.jsoup.nodes.Comment", "outerHtml", new String[]{}, new String[]{}, false);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("\n<!--a-->", String.valueOf(actual));
  assertEquals("receiver state after the call", "\n<!--a--> {getData=a}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput138() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jsoup.nodes.Node", "org.jsoup.nodes.Comment", "clone", new String[]{}, new String[]{}, false), new String[][]{{"attr", "java.lang.String", "2"}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("", String.valueOf(actual));
  assertEquals("receiver state after the call", "\n<!--a--> {getData=a}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput139() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Node", "org.jsoup.nodes.Comment", "childNodeSize", new String[]{}, new String[]{}, false);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "\n<!--a--> {getData=a}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput140() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Node", "org.jsoup.nodes.Comment", "childNodesCopy", new String[]{}, new String[]{}, false, 3, new String[][]{{"org.jsoup.nodes.Node", "outerHtmlTail", "java.lang.StringBuilder,int,org.jsoup.nodes.Document$OutputSettings", "<null>", "-12", "<sample:2>"}, {"org.jsoup.nodes.Node", "getOutputSettings", ""}});
  assertNotNull(actual);
  assertEquals("java.util.ArrayList", actual.getClass().getName());
  assertEquals("[]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "\n<!----> {getData=}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput141() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jsoup.nodes.Node", "org.jsoup.nodes.Comment", "doClone", new String[]{"org.jsoup.nodes.Node"}, new String[]{"<null>"}, false), new String[][]{{"siblingNodes", "", "2"}});
  assertNotNull(actual);
  assertEquals("java.util.Collections$EmptyList", actual.getClass().getName());
  assertEquals("[]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "\n<!--a--> {getData=a}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput142() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jsoup.nodes.Node", "org.jsoup.nodes.Comment", "clone", new String[]{}, new String[]{}, false, 3, new String[][]{{"org.jsoup.nodes.Node", "removeAttr", "java.lang.String", "{\"a\":1#"}, {"org.jsoup.nodes.Node", "siblingNodes", ""}}), new String[][]{{"after", "org.jsoup.nodes.Node", "7"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput143() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jsoup.nodes.Node", "org.jsoup.nodes.Comment", "clone", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.jsoup.nodes.Node", "before", "java.lang.String", "000E"}, {"org.jsoup.nodes.Node", "clone", ""}}), new String[][]{{"previousSibling", "", "2"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "\n<!--a--> {getData=a}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput144() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Node", "org.jsoup.nodes.Comment", "ensureChildNodes", new String[]{}, new String[]{}, false, 3, new String[][]{});
  assertNull(actual);
  assertEquals("receiver state after the call", "\n<!----> {getData=}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput145() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Node", "org.jsoup.nodes.Comment", "getOutputSettings", new String[]{}, new String[]{}, false, 3, new String[][]{{"org.jsoup.nodes.Node", "setSiblingIndex", "int", "-4"}});
  assertNotNull(actual);
  assertEquals("org.jsoup.nodes.Document$OutputSettings", actual.getClass().getName());
  assertEquals("receiver state after the call", "\n<!----> {getData=}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput146() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Node", "org.jsoup.nodes.Comment", "getOutputSettings", new String[]{}, new String[]{}, false, 6, new String[][]{});
  assertNotNull(actual);
  assertEquals("org.jsoup.nodes.Document$OutputSettings", actual.getClass().getName());
  assertEquals("receiver state after the call", "\n<!--a--> {getData=a}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput147() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Node", "org.jsoup.nodes.Comment", "baseUri", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.jsoup.nodes.Node", "setBaseUri", "java.lang.String", "1.25"}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("1.25", String.valueOf(actual));
  assertEquals("receiver state after the call", "\n<!--a--> {getData=a}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput148() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jsoup.nodes.Node", "org.jsoup.nodes.Comment", "before", new String[]{"org.jsoup.nodes.Node"}, new String[]{"<sample:0>"}, false, 3, new String[][]{{"org.jsoup.nodes.Node", "hasAttr", "java.lang.String", "{\"a\":1#"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput149() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Node", "org.jsoup.nodes.Comment", "attr", new String[]{"java.lang.String"}, new String[]{"aaaaaaaaaaaaaaaaaaaaaaaaaaaa"}, false, 0, new String[][]{{"org.jsoup.nodes.Node", "addChildren", "org.jsoup.nodes.Node[]", "<sample:5>"}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("", String.valueOf(actual));
  assertEquals("receiver state after the call", "\n<!--a-->\n <!--a--><!a>\n <!--a--> {getData=a}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput150() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jsoup.nodes.Node", "org.jsoup.nodes.Comment", "clone", new String[]{}, new String[]{}, false), new String[][]{{"nodeName", "", "2"}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("#comment", String.valueOf(actual));
  assertEquals("receiver state after the call", "\n<!--a--> {getData=a}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput151() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Node", "org.jsoup.nodes.Comment", "outerHtml", new String[]{"java.lang.StringBuilder"}, new String[]{"<sample:1>"}, false, 1, new String[][]{{"org.jsoup.nodes.Node", "outerHtml", ""}});
  assertNull(actual);
  assertEquals("receiver state after the call", "\n<!--0--> {getData=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput152() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jsoup.nodes.Node", "org.jsoup.nodes.Comment", "reparentChild", new String[]{"org.jsoup.nodes.Node"}, new String[]{"<null>"}, false, 6, new String[][]{{"org.jsoup.nodes.Node", "parent", ""}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput153() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Node", "org.jsoup.nodes.Comment", "nodeName", new String[]{}, new String[]{}, false, 2, new String[][]{});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("#comment", String.valueOf(actual));
  assertEquals("receiver state after the call", "\n<!--sample--> {getData=sample}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput154() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Node", "org.jsoup.nodes.Comment", "addChildren", new String[]{"org.jsoup.nodes.Node[]"}, new String[]{"<empty>"}, false, 0, new String[][]{{"org.jsoup.nodes.Node", "childNodeSize", ""}, {"org.jsoup.nodes.Node", "hasAttr", "java.lang.String", "Hello, 8World"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "\n<!--a--> {getData=a}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput155() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jsoup.nodes.Node", "org.jsoup.nodes.Comment", "attributes", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.jsoup.nodes.Node", "parentNode", ""}}), new String[][]{{"hasKey", "java.lang.String", "2"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "\n<!--a--> {getData=a}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput156() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Node", "org.jsoup.nodes.Comment", "attributes", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.jsoup.nodes.Node", "replaceChild", "org.jsoup.nodes.Node,org.jsoup.nodes.Node", "<sample:1>", "<sample:4>"}});
  assertNotNull(actual);
  assertEquals("org.jsoup.nodes.Attributes", actual.getClass().getName());
  assertEquals(" comment=\"a\" {size=1}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "\n<!--a--> {getData=a}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput157() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Node", "org.jsoup.nodes.Comment", "hashCode", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.jsoup.nodes.Node", "traverse", "org.jsoup.select.NodeVisitor", "<sample:7>"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("-458083364", String.valueOf(actual));
  assertEquals("receiver state after the call", "\n<!--a--> {getData=a}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput158() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Node", "org.jsoup.nodes.Comment", "addChildren", new String[]{"org.jsoup.nodes.Node[]"}, new String[]{"<sample:6>"}, false, 0, new String[][]{{"org.jsoup.nodes.Node", "attr", "java.lang.String,java.lang.String", "0m", "77"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "\n<!--a--><!a> {getData=a}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput159() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Node", "org.jsoup.nodes.Comment", "baseUri", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.jsoup.nodes.Node", "doClone", "org.jsoup.nodes.Node", "<sample:4>"}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "\n<!--a--> {getData=a}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput160() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Node", "org.jsoup.nodes.Comment", "siblingIndex", new String[]{}, new String[]{}, false, 2, new String[][]{{"org.jsoup.nodes.Node", "after", "java.lang.String", "955d"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "\n<!--sample--> {getData=sample}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput161() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jsoup.nodes.Node", "org.jsoup.nodes.Comment", "replaceChild", new String[]{"org.jsoup.nodes.Node", "org.jsoup.nodes.Node"}, new String[]{"<sample:3>", "<sample:0>"}, false, 0, new String[][]{{"org.jsoup.nodes.Node", "clone", ""}, {"org.jsoup.nodes.Node", "parent", ""}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput162() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Node", "org.jsoup.nodes.Comment", "attr", new String[]{"java.lang.String", "java.lang.String"}, new String[]{"oull", "r"}, false, 3, new String[][]{});
  assertNotNull(actual);
  assertEquals("org.jsoup.nodes.Comment", actual.getClass().getName());
  assertEquals("\n<!----> {getData=}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "\n<!----> {getData=}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput163() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Node", "org.jsoup.nodes.Comment", "ownerDocument", new String[]{}, new String[]{}, false, 3, new String[][]{{"org.jsoup.nodes.Node", "nextSibling", ""}});
  assertNull(actual);
  assertEquals("receiver state after the call", "\n<!----> {getData=}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput164() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Node", "org.jsoup.nodes.Comment", "addChildren", new String[]{"org.jsoup.nodes.Node[]"}, new String[]{"<sample:4>"}, false, 5, new String[][]{});
  assertNull(actual);
  assertEquals("receiver state after the call", "\n<!--0-->a\n <!--a--> {getData=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput165() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jsoup.nodes.Node", "org.jsoup.nodes.Comment", "clone", new String[]{}, new String[]{}, false), new String[][]{{"childNodes", "", "6"}});
  assertNotNull(actual);
  assertEquals("java.util.Collections$UnmodifiableRandomAccessList", actual.getClass().getName());
  assertEquals("[]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "\n<!--a--> {getData=a}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput166() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Node", "org.jsoup.nodes.Comment", "addChildren", new String[]{"org.jsoup.nodes.Node[]"}, new String[]{"<sample:4>"}, false, 6, new String[][]{{"org.jsoup.nodes.Node", "ensureChildNodes", ""}});
  assertNull(actual);
  assertEquals("receiver state after the call", "\n<!--a-->a\n <!--a--> {getData=a}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput167() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jsoup.nodes.Node", "org.jsoup.nodes.Comment", "clone", new String[]{}, new String[]{}, false), new String[][]{{"replaceWith", "org.jsoup.nodes.Node", "3"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput168() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jsoup.nodes.Node", "org.jsoup.nodes.Comment", "removeChild", new String[]{"org.jsoup.nodes.Node"}, new String[]{"<sample:4>"}, false); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput169() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Node", "org.jsoup.nodes.Comment", "addChildren", new String[]{"org.jsoup.nodes.Node[]"}, new String[]{"<sample:1>"}, false, 0, new String[][]{{"org.jsoup.nodes.Node", "hasAttr", "java.lang.String", "1.5fi"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "\n<!--a-->\n <#root></#root><!DOCTYPE a PUBLIC \"0\" \"sample\"> {getData=a}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput170() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Node", "org.jsoup.nodes.Comment", "doClone", new String[]{"org.jsoup.nodes.Node"}, new String[]{"<sample:9>"}, false, 1, new String[][]{});
  assertNotNull(actual);
  assertEquals("org.jsoup.nodes.Comment", actual.getClass().getName());
  assertEquals("\n<!--0--> {getData=0}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "\n<!--0--> {getData=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput171() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Node", "org.jsoup.nodes.Comment", "attributes", new String[]{}, new String[]{}, false, 3, new String[][]{});
  assertNotNull(actual);
  assertEquals("org.jsoup.nodes.Attributes", actual.getClass().getName());
  assertEquals(" comment=\"\" {size=1}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "\n<!----> {getData=}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput172() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Node", "org.jsoup.nodes.Comment", "baseUri", new String[]{}, new String[]{}, false, 7, new String[][]{{"org.jsoup.nodes.Node", "absUrl", "java.lang.String", "0100x1F"}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("a", String.valueOf(actual));
  assertEquals("receiver state after the call", "\n<!----> {getData=}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput173() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jsoup.nodes.Node", "org.jsoup.nodes.Comment", "clone", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.jsoup.nodes.Node", "siblingNodes", ""}, {"org.jsoup.nodes.Node", "remove", ""}}), new String[][]{{"siblingNodes", "", "2"}, {"isEmpty", "", "3"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
  assertEquals("receiver state after the call", "\n<!--a--> {getData=a}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput174() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jsoup.nodes.Node", "org.jsoup.nodes.Comment", "clone", new String[]{}, new String[]{}, false, 7, new String[][]{{"org.jsoup.nodes.Node", "setParentNode", "org.jsoup.nodes.Node", "<sample:8>"}, {"org.jsoup.nodes.Node", "equals", "java.lang.Object", "<i:-65536>"}}), new String[][]{{"clone", "", "2"}, {"siblingIndex", "", "4"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "\n<!----> {getData=}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput175() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jsoup.nodes.Node", "org.jsoup.nodes.Comment", "indent", new String[]{"java.lang.StringBuilder", "int", "org.jsoup.nodes.Document$OutputSettings"}, new String[]{"<empty>", "-20", "<null>"}, false, 0, new String[][]{{"org.jsoup.nodes.Node", "after", "java.lang.String", "[1"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput176() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Node", "org.jsoup.nodes.Comment", "parentNode", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.jsoup.nodes.Node", "addChildren", "org.jsoup.nodes.Node[]", "<sample:0>"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "\n<!--a-->a {getData=a}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput177() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jsoup.nodes.Node", "org.jsoup.nodes.Comment", "doClone", new String[]{"org.jsoup.nodes.Node"}, new String[]{"<sample:1>"}, false, 0, new String[][]{{"org.jsoup.nodes.Node", "before", "org.jsoup.nodes.Node", "<sample:8>"}}), new String[][]{{"siblingNodes", "", "2"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput178() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Node", "org.jsoup.nodes.Comment", "nextSibling", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.jsoup.nodes.Node", "outerHtml", "java.lang.StringBuilder", "<sample:1>"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "\n<!--a--> {getData=a}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput179() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jsoup.nodes.Node", "org.jsoup.nodes.Comment", "childNodes", new String[]{}, new String[]{}, false, 3, new String[][]{{"org.jsoup.nodes.Node", "setBaseUri", "java.lang.String", "1.512:30:451.25"}}), new String[][]{{"subList", "int,int", "2"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IndexOutOfBoundsException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput180() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Node", "org.jsoup.nodes.Comment", "childNodesAsArray", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.jsoup.nodes.Node", "unwrap", ""}});
  assertNotNull(actual);
  assertEquals("[Lorg.jsoup.nodes.Node;", actual.getClass().getName());
  assertEquals("[]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "\n<!--a--> {getData=a}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput181() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Node", "org.jsoup.nodes.Comment", "hasAttr", new String[]{"java.lang.String"}, new String[]{"01.12345678901234567"}, false, 3, new String[][]{{"org.jsoup.nodes.Node", "getOutputSettings", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "\n<!----> {getData=}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput182() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Node", "org.jsoup.nodes.Comment", "ensureChildNodes", new String[]{}, new String[]{}, false, 1, new String[][]{});
  assertNull(actual);
  assertEquals("receiver state after the call", "\n<!--0--> {getData=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput183() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Node", "org.jsoup.nodes.Comment", "ownerDocument", new String[]{}, new String[]{}, false, 1, new String[][]{});
  assertNull(actual);
  assertEquals("receiver state after the call", "\n<!--0--> {getData=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput184() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jsoup.nodes.Node", "org.jsoup.nodes.Comment", "clone", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.jsoup.nodes.Node", "attr", "java.lang.String", "/a/bTitle"}}), new String[][]{{"hasAttr", "java.lang.String", "6"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "\n<!--a--> {getData=a}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput185() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Node", "org.jsoup.nodes.Comment", "setSiblingIndex", new String[]{"int"}, new String[]{"10"}, false, 0, new String[][]{{"org.jsoup.nodes.Node", "indent", "java.lang.StringBuilder,int,org.jsoup.nodes.Document$OutputSettings", "<sample:3>", "12", "<sample:7>"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "\n<!--a--> {getData=a}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput186() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Node", "org.jsoup.nodes.Comment", "outerHtmlTail", new String[]{"java.lang.StringBuilder", "int", "org.jsoup.nodes.Document$OutputSettings"}, new String[]{"<sample:1>", "0", "<sample:2>"}, false, 4, new String[][]{{"org.jsoup.nodes.Node", "attr", "java.lang.String", "I"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "\n<!--a--> {getData=a}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput187() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Node", "org.jsoup.nodes.Comment", "before", new String[]{"java.lang.String"}, new String[]{"0xFFFFFFFF"}, false, 0, new String[][]{{"org.jsoup.nodes.Node", "setParentNode", "org.jsoup.nodes.Node", "<sample:6>"}, {"org.jsoup.nodes.Node", "ensureChildNodes", ""}});
  assertNotNull(actual);
  assertEquals("org.jsoup.nodes.Comment", actual.getClass().getName());
  assertEquals("\n<!--a--> {getData=a}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "\n<!--a--> {getData=a}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput188() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Node", "org.jsoup.nodes.Comment", "previousSibling", new String[]{}, new String[]{}, false, 5, new String[][]{{"org.jsoup.nodes.Node", "outerHtmlTail", "java.lang.StringBuilder,int,org.jsoup.nodes.Document$OutputSettings", "<null>", "-20", "<sample:2>"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "\n<!--0--> {getData=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput189() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jsoup.nodes.Node", "org.jsoup.nodes.Comment", "after", new String[]{"org.jsoup.nodes.Node"}, new String[]{"<sample:5>"}, false, 0, new String[][]{{"org.jsoup.nodes.Node", "setParentNode", "org.jsoup.nodes.Node", "<sample:5>"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IndexOutOfBoundsException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput190() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jsoup.nodes.Node", "org.jsoup.nodes.Comment", "attributes", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.jsoup.nodes.Node", "addChildren", "int,org.jsoup.nodes.Node[]", "262145", "<sample:0>"}}), new String[][]{{"iterator", "", "0"}});
  assertNotNull(actual);
  assertEquals("receiver state after the call", "\n<!--a--> {getData=a}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput191() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Node", "org.jsoup.nodes.Comment", "attr", new String[]{"java.lang.String"}, new String[]{"9.5d1.12345678901234567"}, false, 5, new String[][]{{"org.jsoup.nodes.Node", "attr", "java.lang.String,java.lang.String", ".3", "1.123456789022456"}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("", String.valueOf(actual));
  assertEquals("receiver state after the call", "\n<!--0--> {getData=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput192() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jsoup.nodes.Node", "org.jsoup.nodes.Comment", "childNodes", new String[]{}, new String[]{}, false, 6, new String[][]{}), new String[][]{{"size", "", "5"}, {"retainAll", "java.util.Collection", "4"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.UnsupportedOperationException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput193() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Node", "org.jsoup.nodes.Comment", "parent", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.jsoup.nodes.Node", "removeChild", "org.jsoup.nodes.Node", "<sample:4>"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "\n<!--a--> {getData=a}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput194() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jsoup.nodes.Node", "org.jsoup.nodes.Comment", "wrap", new String[]{"java.lang.String"}, new String[]{"<null>"}, false, 0, new String[][]{{"org.jsoup.nodes.Node", "outerHtml", "java.lang.StringBuilder", "<empty>"}, {"org.jsoup.nodes.Node", "wrap", "java.lang.String", "0x1234557891"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput195() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Node", "org.jsoup.nodes.Comment", "ownerDocument", new String[]{}, new String[]{}, false, 2, new String[][]{{"org.jsoup.nodes.Node", "parent", ""}, {"org.jsoup.nodes.Node", "childNodesAsArray", ""}});
  assertNull(actual);
  assertEquals("receiver state after the call", "\n<!--sample--> {getData=sample}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput196() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jsoup.nodes.Node", "org.jsoup.nodes.Comment", "replaceWith", new String[]{"org.jsoup.nodes.Node"}, new String[]{"<sample:2>"}, false, 0, new String[][]{{"org.jsoup.nodes.Node", "attr", "java.lang.String,java.lang.String", "-0.\"0", "1E-6a b"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput197() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Node", "org.jsoup.nodes.Comment", "siblingIndex", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.jsoup.nodes.Node", "after", "java.lang.String", "1.12345678"}, {"org.jsoup.nodes.Node", "getOutputSettings", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "\n<!--a--> {getData=a}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput198() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Node", "org.jsoup.nodes.Comment", "traverse", new String[]{"org.jsoup.select.NodeVisitor"}, new String[]{"<sample:6>"}, false, 5, new String[][]{{"org.jsoup.nodes.Node", "outerHtml", ""}});
  assertNotNull(actual);
  assertEquals("org.jsoup.nodes.Comment", actual.getClass().getName());
  assertEquals("\n<!--0--> {getData=0}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "\n<!--0--> {getData=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput199() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jsoup.nodes.Node", "org.jsoup.nodes.Comment", "traverse", new String[]{"org.jsoup.select.NodeVisitor"}, new String[]{"<sample:0>"}, false), new String[][]{{"getData", "", "1"}, {"setBaseUri", "java.lang.String", "6"}});
  assertNotNull(actual);
  assertEquals("org.jsoup.nodes.Comment", actual.getClass().getName());
  assertEquals("\n<!--a--> {getData=a}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "\n<!--a--> {getData=a}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput200() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Node", "org.jsoup.nodes.Comment", "setBaseUri", new String[]{"java.lang.String"}, new String[]{"15e300true"}, false, 0, new String[][]{{"org.jsoup.nodes.Node", "attr", "java.lang.String,java.lang.String", "=a>b<", "2.1234567{\"a\":1#"}, {"org.jsoup.nodes.Node", "parentNode", ""}});
  assertNull(actual);
  assertEquals("receiver state after the call", "\n<!--a--> {getData=a}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput201() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Node", "org.jsoup.nodes.Comment", "setParentNode", new String[]{"org.jsoup.nodes.Node"}, new String[]{"<sample:1>"}, false);
  assertNull(actual);
  assertEquals("receiver state after the call", "\n<!--a--> {getData=a}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput202() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Node", "org.jsoup.nodes.Comment", "nextSibling", new String[]{}, new String[]{}, false, 5, new String[][]{});
  assertNull(actual);
  assertEquals("receiver state after the call", "\n<!--0--> {getData=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput203() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jsoup.nodes.Node", "org.jsoup.nodes.Comment", "addChildren", new String[]{"org.jsoup.nodes.Node[]"}, new String[]{"<null>"}, false, 0, new String[][]{{"org.jsoup.nodes.Node", "attributes", ""}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput204() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Node", "org.jsoup.nodes.Comment", "baseUri", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.jsoup.nodes.Node", "addChildren", "org.jsoup.nodes.Node[]", "<sample:2>"}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "\n<!--a--><!DOCTYPE a PUBLIC \"0\" \"sample\">\n <!--a-->a {getData=a}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput205() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jsoup.nodes.Node", "org.jsoup.nodes.Comment", "attr", new String[]{"java.lang.String", "java.lang.String"}, new String[]{"1..5e300", "1.512:30,:45"}, false, 7, new String[][]{{"org.jsoup.nodes.Node", "hashCode", ""}}), new String[][]{{"childNodes", "", "5"}});
  assertNotNull(actual);
  assertEquals("java.util.Collections$UnmodifiableRandomAccessList", actual.getClass().getName());
  assertEquals("[]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "\n<!----> {getData=}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput206() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jsoup.nodes.Node", "org.jsoup.nodes.Comment", "childNodesCopy", new String[]{}, new String[]{}, false, 5, new String[][]{}), new String[][]{{"listIterator", "", "0"}});
  assertNotNull(actual);
  assertEquals("java.util.ArrayList$ListItr", actual.getClass().getName());
  assertEquals("{hasNext=false, hasPrevious=false}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "\n<!--0--> {getData=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput207() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Node", "org.jsoup.nodes.Comment", "nextSibling", new String[]{}, new String[]{}, false, 7, new String[][]{{"org.jsoup.nodes.Node", "wrap", "java.lang.String", "aaaaaaaaaaaaaaaaaaaaaaaaaaaa"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "\n<!----> {getData=}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput208() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Node", "org.jsoup.nodes.Comment", "siblingNodes", new String[]{}, new String[]{}, false, 5, new String[][]{});
  assertNotNull(actual);
  assertEquals("java.util.Collections$EmptyList", actual.getClass().getName());
  assertEquals("[]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "\n<!--0--> {getData=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput209() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Node", "org.jsoup.nodes.Comment", "indent", new String[]{"java.lang.StringBuilder", "int", "org.jsoup.nodes.Document$OutputSettings"}, new String[]{"<empty>", "39", "<sample:1>"}, false, 0, new String[][]{{"org.jsoup.nodes.Node", "attr", "java.lang.String", ",a]b"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "\n<!--a--> {getData=a}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput210() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Node", "org.jsoup.nodes.Comment", "setParentNode", new String[]{"org.jsoup.nodes.Node"}, new String[]{"<sample:6>"}, false, 5, new String[][]{{"org.jsoup.nodes.Node", "replaceChild", "org.jsoup.nodes.Node,org.jsoup.nodes.Node", "<sample:0>", "<null>"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "\n<!--0--> {getData=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput211() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Node", "org.jsoup.nodes.Comment", "setSiblingIndex", new String[]{"int"}, new String[]{"1073741834"}, false, 1, new String[][]{{"org.jsoup.nodes.Node", "outerHtmlTail", "java.lang.StringBuilder,int,org.jsoup.nodes.Document$OutputSettings", "<sample:0>", "-20", "<sample:1>"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "\n<!--0--> {getData=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput212() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jsoup.nodes.Node", "org.jsoup.nodes.Comment", "traverse", new String[]{"org.jsoup.select.NodeVisitor"}, new String[]{"<sample:2>"}, false, 7, new String[][]{{"org.jsoup.nodes.Node", "after", "org.jsoup.nodes.Node", "<sample:7>"}}), new String[][]{{"hasAttr", "java.lang.String", "4"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "\n<!----> {getData=}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput213() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jsoup.nodes.Node", "org.jsoup.nodes.Comment", "doClone", new String[]{"org.jsoup.nodes.Node"}, new String[]{"<sample:7>"}, false), new String[][]{{"before", "org.jsoup.nodes.Node", "1"}});
  assertNotNull(actual);
  assertEquals("org.jsoup.nodes.Comment", actual.getClass().getName());
  assertEquals("\n<!--a--> {getData=a}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "\n<!--a--> {getData=a}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput214() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Node", "org.jsoup.nodes.Comment", "previousSibling", new String[]{}, new String[]{}, false, 7, new String[][]{{"org.jsoup.nodes.Node", "attr", "java.lang.String", ""}});
  assertNull(actual);
  assertEquals("receiver state after the call", "\n<!----> {getData=}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput215() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Node", "org.jsoup.nodes.Comment", "previousSibling", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.jsoup.nodes.Node", "indent", "java.lang.StringBuilder,int,org.jsoup.nodes.Document$OutputSettings", "<sample:3>", "2147483647", "<sample:10>"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "\n<!--a--> {getData=a}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput216() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jsoup.nodes.Node", "org.jsoup.nodes.Comment", "removeAttr", new String[]{"java.lang.String"}, new String[]{"aaaaaaaaaaaaaaaaaaaaaaaaaaaaa"}, false), new String[][]{{"ownerDocument", "", "5"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "\n<!--a--> {getData=a}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput217() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jsoup.nodes.Node", "org.jsoup.nodes.Comment", "addChildren", new String[]{"int", "org.jsoup.nodes.Node[]"}, new String[]{"2147483647", "<null>"}, false, 0, new String[][]{{"org.jsoup.nodes.Node", "clone", ""}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput218() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Node", "org.jsoup.nodes.Comment", "outerHtml", new String[]{"java.lang.StringBuilder"}, new String[]{"<sample:1>"}, false, 2, new String[][]{});
  assertNull(actual);
  assertEquals("receiver state after the call", "\n<!--sample--> {getData=sample}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput219() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Node", "org.jsoup.nodes.Comment", "outerHtml", new String[]{"java.lang.StringBuilder"}, new String[]{"<empty>"}, false);
  assertNull(actual);
  assertEquals("receiver state after the call", "\n<!--a--> {getData=a}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput220() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Node", "org.jsoup.nodes.Comment", "ensureChildNodes", new String[]{}, new String[]{}, false, 2, new String[][]{});
  assertNull(actual);
  assertEquals("receiver state after the call", "\n<!--sample--> {getData=sample}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput221() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Node", "org.jsoup.nodes.Comment", "hashCode", new String[]{}, new String[]{}, false, 5, new String[][]{{"org.jsoup.nodes.Node", "siblingIndex", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("-458083315", String.valueOf(actual));
  assertEquals("receiver state after the call", "\n<!--0--> {getData=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput222() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jsoup.nodes.Node", "org.jsoup.nodes.Comment", "traverse", new String[]{"org.jsoup.select.NodeVisitor"}, new String[]{"<sample:9>"}, false, 2, new String[][]{{"org.jsoup.nodes.Node", "after", "org.jsoup.nodes.Node", "<sample:9>"}}), new String[][]{{"absUrl", "java.lang.String", "7"}, {"absUrl", "java.lang.String", "7"}, {"removeAttr", "java.lang.String", "7"}});
  assertNotNull(actual);
  assertEquals("org.jsoup.nodes.Comment", actual.getClass().getName());
  assertEquals("\n<!--sample--> {getData=sample}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "\n<!--sample--> {getData=sample}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput223() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jsoup.nodes.Node", "org.jsoup.nodes.Comment", "traverse", new String[]{"org.jsoup.select.NodeVisitor"}, new String[]{"<sample:2>"}, false, 0, new String[][]{{"org.jsoup.nodes.Node", "setBaseUri", "java.lang.String", "2147483648Title"}}), new String[][]{{"nodeName", "", "6"}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("#comment", String.valueOf(actual));
  assertEquals("receiver state after the call", "\n<!--a--> {getData=a}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput224() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Node", "org.jsoup.nodes.Comment", "addChildren", new String[]{"int", "org.jsoup.nodes.Node[]"}, new String[]{"0", "<sample:0>"}, false, 0, new String[][]{{"org.jsoup.nodes.Node", "ownerDocument", ""}});
  assertNull(actual);
  assertEquals("receiver state after the call", "\n<!--a-->a {getData=a}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput225() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jsoup.nodes.Node", "org.jsoup.nodes.Comment", "attributes", new String[]{}, new String[]{}, false), new String[][]{{"put", "java.lang.String,java.lang.String", "6"}});
  assertNotNull(actual);
  assertEquals("org.jsoup.nodes.Attributes", actual.getClass().getName());
  assertEquals(" comment=\"a\" 0=\"sample\" {size=2}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "\n<!--a--> {getData=a}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput226() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jsoup.nodes.Node", "org.jsoup.nodes.Comment", "outerHtmlHead", new String[]{"java.lang.StringBuilder", "int", "org.jsoup.nodes.Document$OutputSettings"}, new String[]{"<sample:2>", "-2", "<sample:3>"}, false, 0, new String[][]{{"org.jsoup.nodes.Node", "toString", ""}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput227() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jsoup.nodes.Node", "org.jsoup.nodes.Comment", "traverse", new String[]{"org.jsoup.select.NodeVisitor"}, new String[]{"<sample:7>"}, false, 6, new String[][]{{"org.jsoup.nodes.Node", "childNodesCopy", ""}}), new String[][]{{"attributes", "", "3"}, {"html", "", "4"}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals(" comment=\"a\" <a><b>t</b></a>=\"{&quot;a&quot;:1}\"", String.valueOf(actual));
  assertEquals("receiver state after the call", "\n<!--a--> {getData=a}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput228() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Node", "org.jsoup.nodes.Comment", "absUrl", new String[]{"java.lang.String"}, new String[]{"1"}, false, 0, new String[][]{{"org.jsoup.nodes.Node", "addChildren", "org.jsoup.nodes.Node[]", "<sample:5>"}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("", String.valueOf(actual));
  assertEquals("receiver state after the call", "\n<!--a-->\n <!--a--><!a>\n <!--a--> {getData=a}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput229() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jsoup.nodes.Node", "org.jsoup.nodes.Comment", "childNodes", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.jsoup.nodes.Node", "getOutputSettings", ""}}), new String[][]{{"indexOf", "java.lang.Object", "1"}, {"isEmpty", "", "1"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
  assertEquals("receiver state after the call", "\n<!--a--> {getData=a}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput230() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jsoup.nodes.Node", "org.jsoup.nodes.Comment", "attributes", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.jsoup.nodes.Node", "after", "org.jsoup.nodes.Node", "<sample:5>"}}), new String[][]{{"get", "java.lang.String", "6"}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("", String.valueOf(actual));
  assertEquals("receiver state after the call", "\n<!--a--> {getData=a}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput231() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jsoup.nodes.Node", "org.jsoup.nodes.Comment", "attributes", new String[]{}, new String[]{}, false, 6, new String[][]{{"org.jsoup.nodes.Node", "addChildren", "org.jsoup.nodes.Node[]", "<sample:1>"}}), new String[][]{{"iterator", "", "5"}});
  assertNotNull(actual);
  assertEquals("receiver state after the call", "\n<!--a-->\n <#root></#root><!DOCTYPE a PUBLIC \"0\" \"sample\"> {getData=a}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput232() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jsoup.nodes.Node", "org.jsoup.nodes.Comment", "attributes", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.jsoup.nodes.Node", "replaceWith", "org.jsoup.nodes.Node", "<sample:2>"}}), new String[][]{{"asList", "", "1"}});
  assertNotNull(actual);
  assertEquals("java.util.Collections$UnmodifiableRandomAccessList", actual.getClass().getName());
  assertEquals("[comment=\"a\"]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "\n<!--a--> {getData=a}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput233() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Node", "org.jsoup.nodes.Comment", "parentNode", new String[]{}, new String[]{}, false, 2, new String[][]{});
  assertNull(actual);
  assertEquals("receiver state after the call", "\n<!--sample--> {getData=sample}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput234() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Node", "org.jsoup.nodes.Comment", "parentNode", new String[]{}, new String[]{}, false, 5, new String[][]{{"org.jsoup.nodes.Node", "addChildren", "int,org.jsoup.nodes.Node[]", "49", "<null>"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "\n<!--0--> {getData=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput235() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jsoup.nodes.Node", "org.jsoup.nodes.Comment", "childNodesCopy", new String[]{}, new String[]{}, false, 3, new String[][]{}), new String[][]{{"clone", "", "7"}, {"add", "java.lang.Object", "1"}, {"addAll", "int,java.util.Collection", "7"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IndexOutOfBoundsException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput236() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jsoup.nodes.Node", "org.jsoup.nodes.Comment", "attributes", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.jsoup.nodes.Node", "remove", ""}}), new String[][]{{"dataset", "", "5"}});
  assertNotNull(actual);
  assertEquals("org.jsoup.nodes.Attributes$Dataset", actual.getClass().getName());
  assertEquals("{}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "\n<!--a--> {getData=a}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput237() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jsoup.nodes.Node", "org.jsoup.nodes.Comment", "traverse", new String[]{"org.jsoup.select.NodeVisitor"}, new String[]{"<sample:4>"}, false, 6, new String[][]{}), new String[][]{{"clone", "", "0"}, {"parent", "", "6"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "\n<!--a--> {getData=a}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput238() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Node", "org.jsoup.nodes.Comment", "outerHtml", new String[]{}, new String[]{}, false, 7, new String[][]{{"org.jsoup.nodes.Node", "before", "org.jsoup.nodes.Node", "<sample:5>"}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("\n<!---->", String.valueOf(actual));
  assertEquals("receiver state after the call", "\n<!----> {getData=}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput239() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jsoup.nodes.Node", "org.jsoup.nodes.Comment", "attr", new String[]{"java.lang.String", "java.lang.String"}, new String[]{"a", "0.1234567#text"}, false), new String[][]{{"getData", "", "6"}, {"attr", "java.lang.String", "3"}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("", String.valueOf(actual));
  assertEquals("receiver state after the call", "\n<!--a--> {getData=a}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput240() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Node", "org.jsoup.nodes.Comment", "siblingNodes", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.jsoup.nodes.Node", "childNodeSize", ""}});
  assertNotNull(actual);
  assertEquals("java.util.Collections$EmptyList", actual.getClass().getName());
  assertEquals("[]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "\n<!--a--> {getData=a}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput241() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Node", "org.jsoup.nodes.Comment", "parentNode", new String[]{}, new String[]{}, false, 3, new String[][]{});
  assertNull(actual);
  assertEquals("receiver state after the call", "\n<!----> {getData=}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput242() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Node", "org.jsoup.nodes.Comment", "setBaseUri", new String[]{"java.lang.String"}, new String[]{"  "}, false, 5, new String[][]{});
  assertNull(actual);
  assertEquals("receiver state after the call", "\n<!--0--> {getData=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput243() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Node", "org.jsoup.nodes.Comment", "nextSibling", new String[]{}, new String[]{}, false, 2, new String[][]{});
  assertNull(actual);
  assertEquals("receiver state after the call", "\n<!--sample--> {getData=sample}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput244() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jsoup.nodes.Node", "org.jsoup.nodes.Comment", "getOutputSettings", new String[]{}, new String[]{}, false, 6, new String[][]{}), new String[][]{{"outline", "", "5"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "\n<!--a--> {getData=a}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput245() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Node", "org.jsoup.nodes.Comment", "outerHtmlHead", new String[]{"java.lang.StringBuilder", "int", "org.jsoup.nodes.Document$OutputSettings"}, new String[]{"<sample:3>", "67", "<sample:1>"}, false);
  assertNull(actual);
  assertEquals("receiver state after the call", "\n<!--a--> {getData=a}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput246() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jsoup.nodes.Node", "org.jsoup.nodes.Comment", "doClone", new String[]{"org.jsoup.nodes.Node"}, new String[]{"<sample:8>"}, false, 2, new String[][]{{"org.jsoup.nodes.Node", "after", "org.jsoup.nodes.Node", "<sample:3>"}}), new String[][]{{"attributes", "", "4"}});
  assertNotNull(actual);
  assertEquals("org.jsoup.nodes.Attributes", actual.getClass().getName());
  assertEquals(" comment=\"sample\" {size=1}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "\n<!--sample--> {getData=sample}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput247() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jsoup.nodes.Node", "org.jsoup.nodes.Comment", "attr", new String[]{"java.lang.String", "java.lang.String"}, new String[]{"2020-01-01", "202B-02-30T25:61:61"}, false, 6, new String[][]{{"org.jsoup.nodes.Node", "attr", "java.lang.String", "1.12345;67"}}), new String[][]{{"ownerDocument", "", "5"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "\n<!--a--> {getData=a}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput248() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jsoup.nodes.Node", "org.jsoup.nodes.Comment", "traverse", new String[]{"org.jsoup.select.NodeVisitor"}, new String[]{"<sample:6>"}, false), new String[][]{{"outerHtml", "", "6"}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("\n<!--a-->", String.valueOf(actual));
  assertEquals("receiver state after the call", "\n<!--a--> {getData=a}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput249() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jsoup.nodes.Node", "org.jsoup.nodes.Comment", "getOutputSettings", new String[]{}, new String[]{}, false, 4, new String[][]{}), new String[][]{{"indentAmount", "", "1"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("1", String.valueOf(actual));
  assertEquals("receiver state after the call", "\n<!--a--> {getData=a}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput250() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Node", "org.jsoup.nodes.Comment", "toString", new String[]{}, new String[]{}, false, 7, new String[][]{});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("\n<!---->", String.valueOf(actual));
  assertEquals("receiver state after the call", "\n<!----> {getData=}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput251() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Node", "org.jsoup.nodes.Comment", "siblingNodes", new String[]{}, new String[]{}, false, 3, new String[][]{{"org.jsoup.nodes.Node", "equals", "java.lang.Object", "<i:-1>"}});
  assertNotNull(actual);
  assertEquals("java.util.Collections$EmptyList", actual.getClass().getName());
  assertEquals("[]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "\n<!----> {getData=}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput252() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Node", "org.jsoup.nodes.Comment", "parent", new String[]{}, new String[]{}, false, 7, new String[][]{});
  assertNull(actual);
  assertEquals("receiver state after the call", "\n<!----> {getData=}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput253() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Node", "org.jsoup.nodes.Comment", "hashCode", new String[]{}, new String[]{}, false, 7, new String[][]{});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("-458083331", String.valueOf(actual));
  assertEquals("receiver state after the call", "\n<!----> {getData=}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput254() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jsoup.nodes.Node", "org.jsoup.nodes.Comment", "attributes", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.jsoup.nodes.Node", "addChildren", "org.jsoup.nodes.Node[]", "<sample:2>"}}), new String[][]{{"hasKey", "java.lang.String", "1"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "\n<!--a--><!DOCTYPE a PUBLIC \"0\" \"sample\">\n <!--a-->a {getData=a}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput255() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jsoup.nodes.Node", "org.jsoup.nodes.Comment", "siblingNodes", new String[]{}, new String[]{}, false, 3, new String[][]{{"org.jsoup.nodes.Node", "doClone", "org.jsoup.nodes.Node", "<sample:1>"}}), new String[][]{{"subList", "int,int", "2"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IndexOutOfBoundsException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput256() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Node", "org.jsoup.nodes.Comment", "hasAttr", new String[]{"java.lang.String"}, new String[]{"1.123456789012345671.512:30:45"}, false, 0, new String[][]{{"org.jsoup.nodes.Node", "reparentChild", "org.jsoup.nodes.Node", "<sample:1>"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "\n<!--a--> {getData=a}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput257() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jsoup.nodes.Node", "org.jsoup.nodes.Comment", "removeAttr", new String[]{"java.lang.String"}, new String[]{"b"}, false, 0, new String[][]{{"org.jsoup.nodes.Node", "setBaseUri", "java.lang.String", "j"}}), new String[][]{{"setBaseUri", "java.lang.String", "5"}});
  assertNotNull(actual);
  assertEquals("org.jsoup.nodes.Comment", actual.getClass().getName());
  assertEquals("\n<!--a--> {getData=a}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "\n<!--a--> {getData=a}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput258() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jsoup.nodes.Node", "org.jsoup.nodes.Comment", "clone", new String[]{}, new String[]{}, false, 5, new String[][]{}), new String[][]{{"previousSibling", "", "3"}, {"setBaseUri", "java.lang.String", "6"}});
  assertNotNull(actual);
  assertEquals("org.jsoup.nodes.Comment", actual.getClass().getName());
  assertEquals("\n<!--0--> {getData=0}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "\n<!--0--> {getData=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput259() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Node", "org.jsoup.nodes.Comment", "equals", new String[]{"java.lang.Object"}, new String[]{"<i:0>"}, false, 3, new String[][]{});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "\n<!----> {getData=}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput260() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jsoup.nodes.Node", "org.jsoup.nodes.Comment", "removeAttr", new String[]{"java.lang.String"}, new String[]{"5.,"}, false), new String[][]{{"wrap", "java.lang.String", "2"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput261() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jsoup.nodes.Node", "org.jsoup.nodes.Comment", "doClone", new String[]{"org.jsoup.nodes.Node"}, new String[]{"<sample:0>"}, false, 3, new String[][]{{"org.jsoup.nodes.Node", "nextSibling", ""}}), new String[][]{{"after", "java.lang.String", "2"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IndexOutOfBoundsException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput262() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Node", "org.jsoup.nodes.Comment", "toString", new String[]{}, new String[]{}, false, 6, new String[][]{{"org.jsoup.nodes.Node", "before", "org.jsoup.nodes.Node", "<sample:2>"}, {"org.jsoup.nodes.Node", "removeAttr", "java.lang.String", ".0./"}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("\n<!--a-->", String.valueOf(actual));
  assertEquals("receiver state after the call", "\n<!--a--> {getData=a}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput263() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Node", "org.jsoup.nodes.Comment", "baseUri", new String[]{}, new String[]{}, false, 2, new String[][]{{"org.jsoup.nodes.Node", "equals", "java.lang.Object", "<s:b>"}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("", String.valueOf(actual));
  assertEquals("receiver state after the call", "\n<!--sample--> {getData=sample}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput264() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Node", "org.jsoup.nodes.Comment", "before", new String[]{"java.lang.String"}, new String[]{"Title2020-01-01"}, false, 0, new String[][]{{"org.jsoup.nodes.Node", "setParentNode", "org.jsoup.nodes.Node", "<sample:2>"}});
  assertNotNull(actual);
  assertEquals("org.jsoup.nodes.Comment", actual.getClass().getName());
  assertEquals("\n<!--a--> {getData=a}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "\n<!--a--> {getData=a}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput265() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Node", "org.jsoup.nodes.Comment", "outerHtml", new String[]{}, new String[]{}, false, 1, new String[][]{{"org.jsoup.nodes.Node", "attributes", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("\n<!--0-->", String.valueOf(actual));
  assertEquals("receiver state after the call", "\n<!--0--> {getData=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput266() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jsoup.nodes.Node", "org.jsoup.nodes.Comment", "attr", new String[]{"java.lang.String", "java.lang.String"}, new String[]{"a babc", "=a?b<"}, false, 0, new String[][]{{"org.jsoup.nodes.Node", "nodeName", ""}}), new String[][]{{"previousSibling", "", "5"}, {"baseUri", "", "1"}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "\n<!--a--> {getData=a}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput267() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jsoup.nodes.Node", "org.jsoup.nodes.Comment", "removeAttr", new String[]{"java.lang.String"}, new String[]{"9.5d\n"}, false, 0, new String[][]{{"org.jsoup.nodes.Node", "replaceChild", "org.jsoup.nodes.Node,org.jsoup.nodes.Node", "<sample:6>", "<sample:0>"}}), new String[][]{{"siblingNodes", "", "7"}});
  assertNotNull(actual);
  assertEquals("java.util.Collections$EmptyList", actual.getClass().getName());
  assertEquals("[]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "\n<!--a--> {getData=a}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput268() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jsoup.nodes.Node", "org.jsoup.nodes.Comment", "doClone", new String[]{"org.jsoup.nodes.Node"}, new String[]{"<sample:6>"}, false, 7, new String[][]{{"org.jsoup.nodes.Node", "setBaseUri", "java.lang.String", "a a"}}), new String[][]{{"setBaseUri", "java.lang.String", "5"}});
  assertNotNull(actual);
  assertEquals("org.jsoup.nodes.Comment", actual.getClass().getName());
  assertEquals("\n<!----> {getData=}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "\n<!----> {getData=}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput269() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Node", "org.jsoup.nodes.Comment", "attr", new String[]{"java.lang.String"}, new String[]{"PT1H"}, false, 3, new String[][]{});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("", String.valueOf(actual));
  assertEquals("receiver state after the call", "\n<!----> {getData=}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput270() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Node", "org.jsoup.nodes.Comment", "outerHtml", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.jsoup.nodes.Node", "setParentNode", "org.jsoup.nodes.Node", "<sample:5>"}, {"org.jsoup.nodes.Node", "remove", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("\n<!--a-->", String.valueOf(actual));
  assertEquals("receiver state after the call", "\n<!--a--> {getData=a}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput271() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jsoup.nodes.Node", "org.jsoup.nodes.Comment", "childNodes", new String[]{}, new String[]{}, false), new String[][]{{"size", "", "1"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "\n<!--a--> {getData=a}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput272() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jsoup.nodes.Node", "org.jsoup.nodes.Comment", "getOutputSettings", new String[]{}, new String[]{}, false, 2, new String[][]{{"org.jsoup.nodes.Node", "after", "java.lang.String", "i"}}), new String[][]{{"escapeMode", "org.jsoup.nodes.Entities$EscapeMode", "7"}, {"syntax", "", "7"}});
  assertNotNull(actual);
  assertEquals("org.jsoup.nodes.Document$OutputSettings$Syntax", actual.getClass().getName());
  assertEquals("html", String.valueOf(actual));
  assertEquals("receiver state after the call", "\n<!--sample--> {getData=sample}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput273() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jsoup.nodes.Node", "org.jsoup.nodes.Comment", "siblingNodes", new String[]{}, new String[]{}, false), new String[][]{{"indexOf", "java.lang.Object", "1"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("-1", String.valueOf(actual));
  assertEquals("receiver state after the call", "\n<!--a--> {getData=a}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput274() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Node", "org.jsoup.nodes.Comment", "childNodesCopy", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.jsoup.nodes.Node", "after", "java.lang.String", "1.512:30:45"}});
  assertNotNull(actual);
  assertEquals("java.util.ArrayList", actual.getClass().getName());
  assertEquals("[]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "\n<!--a--> {getData=a}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput275() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Node", "org.jsoup.nodes.Comment", "parentNode", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.jsoup.nodes.Node", "setParentNode", "org.jsoup.nodes.Node", "<sample:5>"}});
  assertNotNull(actual);
  assertEquals("org.jsoup.nodes.TextNode", actual.getClass().getName());
  assertEquals("a {getWholeText=a, isBlank=false}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "\n<!--a--> {getData=a}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput276() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Node", "org.jsoup.nodes.Comment", "attributes", new String[]{}, new String[]{}, false, 2, new String[][]{});
  assertNotNull(actual);
  assertEquals("org.jsoup.nodes.Attributes", actual.getClass().getName());
  assertEquals(" comment=\"sample\" {size=1}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "\n<!--sample--> {getData=sample}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput277() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jsoup.nodes.Node", "org.jsoup.nodes.Comment", "addChildren", new String[]{"int", "org.jsoup.nodes.Node[]"}, new String[]{"2", "<sample:6>"}, false, 0, null, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IndexOutOfBoundsException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput278() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Node", "org.jsoup.nodes.Comment", "baseUri", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.jsoup.nodes.Node", "attr", "java.lang.String,java.lang.String", "Tisle", "0xFFFFFFFF"}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "\n<!--a--> {getData=a}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput279() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Node", "org.jsoup.nodes.Comment", "setBaseUri", new String[]{"java.lang.String"}, new String[]{"<a>b</a>"}, false, 0, new String[][]{{"org.jsoup.nodes.Node", "addChildren", "org.jsoup.nodes.Node[]", "<sample:2>"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "\n<!--a--><!DOCTYPE a PUBLIC \"0\" \"sample\">\n <!--a-->a {getData=a}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput280() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Node", "org.jsoup.nodes.Comment", "outerHtml", new String[]{"java.lang.StringBuilder"}, new String[]{"<sample:3>"}, false, 5, new String[][]{{"org.jsoup.nodes.Node", "clone", ""}}, 1);
  assertNull(actual);
  assertEquals("receiver state after the call", "\n<!--0--> {getData=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput281() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Node", "org.jsoup.nodes.Comment", "outerHtml", new String[]{}, new String[]{}, false, 3, new String[][]{{"org.jsoup.nodes.Node", "hashCode", ""}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("\n<!---->", String.valueOf(actual));
  assertEquals("receiver state after the call", "\n<!----> {getData=}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput282() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Node", "org.jsoup.nodes.Comment", "addChildren", new String[]{"int", "org.jsoup.nodes.Node[]"}, new String[]{"-2147483648", "<empty>"}, false, 0, null, 1);
  assertNull(actual);
  assertEquals("receiver state after the call", "\n<!--a--> {getData=a}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput283() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jsoup.nodes.Node", "org.jsoup.nodes.Comment", "removeAttr", new String[]{"java.lang.String"}, new String[]{"Title2020-01-01{\"a\":1}"}, false, 0, new String[][]{{"org.jsoup.nodes.Node", "childNodesCopy", ""}}), new String[][]{{"after", "java.lang.String", "1"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput284() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Node", "org.jsoup.nodes.Comment", "childNodes", new String[]{}, new String[]{}, false, 3, new String[][]{{"org.jsoup.nodes.Node", "after", "org.jsoup.nodes.Node", "<sample:3>"}});
  assertNotNull(actual);
  assertEquals("java.util.Collections$UnmodifiableRandomAccessList", actual.getClass().getName());
  assertEquals("[]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "\n<!----> {getData=}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput285() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Node", "org.jsoup.nodes.Comment", "equals", new String[]{"java.lang.Object"}, new String[]{"<i:0>"}, false, 2, new String[][]{}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "\n<!--sample--> {getData=sample}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput286() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Node", "org.jsoup.nodes.Comment", "ensureChildNodes", new String[]{}, new String[]{}, false, 0, null, 2);
  assertNull(actual);
  assertEquals("receiver state after the call", "\n<!--a--> {getData=a}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput287() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jsoup.nodes.Node", "org.jsoup.nodes.Comment", "traverse", new String[]{"org.jsoup.select.NodeVisitor"}, new String[]{"<sample:1>"}, false, 0, new String[][]{{"org.jsoup.nodes.Node", "outerHtmlHead", "java.lang.StringBuilder,int,org.jsoup.nodes.Document$OutputSettings", "<sample:1>", "1", "<sample:2>"}}, 2), new String[][]{{"siblingIndex", "", "0"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "\n<!--a--> {getData=a}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput288() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jsoup.nodes.Node", "org.jsoup.nodes.Comment", "remove", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.jsoup.nodes.Node", "attributes", ""}, {"org.jsoup.nodes.Node", "getOutputSettings", ""}}, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput289() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Node", "org.jsoup.nodes.Comment", "addChildren", new String[]{"int", "org.jsoup.nodes.Node[]"}, new String[]{"0", "<sample:5>"}, false, 7, new String[][]{});
  assertNull(actual);
  assertEquals("receiver state after the call", "\n<!---->\n <!--a--><!a>\n <!--a--> {getData=}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput290() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Node", "org.jsoup.nodes.Comment", "childNodesAsArray", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.jsoup.nodes.Node", "attributes", ""}}, 1);
  assertNotNull(actual);
  assertEquals("[Lorg.jsoup.nodes.Node;", actual.getClass().getName());
  assertEquals("[]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "\n<!--a--> {getData=a}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput291() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Node", "org.jsoup.nodes.Comment", "nextSibling", new String[]{}, new String[]{}, false, 0, null, 3);
  assertNull(actual);
  assertEquals("receiver state after the call", "\n<!--a--> {getData=a}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput292() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jsoup.nodes.Node", "org.jsoup.nodes.Comment", "before", new String[]{"org.jsoup.nodes.Node"}, new String[]{"<sample:5>"}, false, 0, new String[][]{{"org.jsoup.nodes.Node", "childNode", "int", "-2147483648"}}, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput293() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Node", "org.jsoup.nodes.Comment", "siblingIndex", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.jsoup.nodes.Node", "before", "java.lang.String", "\t"}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "\n<!--a--> {getData=a}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput294() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Node", "org.jsoup.nodes.Comment", "childNodeSize", new String[]{}, new String[]{}, false, 5, new String[][]{{"org.jsoup.nodes.Node", "reparentChild", "org.jsoup.nodes.Node", "<sample:6>"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "\n<!--0--> {getData=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput295() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Node", "org.jsoup.nodes.Comment", "outerHtml", new String[]{"java.lang.StringBuilder"}, new String[]{"<sample:1>"}, false, 7, new String[][]{}, 1);
  assertNull(actual);
  assertEquals("receiver state after the call", "\n<!----> {getData=}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput296() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Node", "org.jsoup.nodes.Comment", "addChildren", new String[]{"org.jsoup.nodes.Node[]"}, new String[]{"<sample:1>"}, false, 0, new String[][]{{"org.jsoup.nodes.Node", "setParentNode", "org.jsoup.nodes.Node", "<sample:6>"}}, 3);
  assertNull(actual);
  assertEquals("receiver state after the call", "\n<!--a-->\n <#root></#root><!DOCTYPE a PUBLIC \"0\" \"sample\"> {getData=a}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput297() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jsoup.nodes.Node", "org.jsoup.nodes.Comment", "indent", new String[]{"java.lang.StringBuilder", "int", "org.jsoup.nodes.Document$OutputSettings"}, new String[]{"<sample:4>", "-2147483648", "<sample:5>"}, false, 0, null, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput298() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Node", "org.jsoup.nodes.Comment", "addChildren", new String[]{"int", "org.jsoup.nodes.Node[]"}, new String[]{"0", "<sample:4>"}, false, 0, new String[][]{{"org.jsoup.nodes.Node", "reparentChild", "org.jsoup.nodes.Node", "<sample:2>"}}, 1);
  assertNull(actual);
  assertEquals("receiver state after the call", "\n<!--a-->a\n <!--a--> {getData=a}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput299() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Node", "org.jsoup.nodes.Comment", "traverse", new String[]{"org.jsoup.select.NodeVisitor"}, new String[]{"<sample:6>"}, false, 6, new String[][]{{"org.jsoup.nodes.Node", "after", "org.jsoup.nodes.Node", "<sample:3>"}}, 1);
  assertNotNull(actual);
  assertEquals("org.jsoup.nodes.Comment", actual.getClass().getName());
  assertEquals("\n<!--a--> {getData=a}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "\n<!--a--> {getData=a}", SearchInputFactory_scaffolding.receiverState());
 }
}
