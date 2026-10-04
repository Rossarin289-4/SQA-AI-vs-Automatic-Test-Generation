package generated.algorithm;

import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;
import static org.junit.Assert.*;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class BinaryParticleSwarmGeneratedTest {
 @Test(timeout = 20000)
 public void generatedInput000() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Node", "org.jsoup.nodes.Comment", "setParentNode", new String[]{"org.jsoup.nodes.Node"}, new String[]{"<sample:5>"}, false, 0, new String[][]{{"org.jsoup.nodes.Node", "equals", "java.lang.Object", "<s:b>"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "\n<!--a--> {getData=a}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput001() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Node", "org.jsoup.nodes.Comment", "setBaseUri", new String[]{"java.lang.String"}, new String[]{"1.525"}, false, 0, new String[][]{{"org.jsoup.nodes.Node", "attributes", ""}});
  assertNull(actual);
  assertEquals("receiver state after the call", "\n<!--a--> {getData=a}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput002() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jsoup.nodes.Node", "org.jsoup.nodes.Comment", "removeChild", new String[]{"org.jsoup.nodes.Node"}, new String[]{"<sample:6>"}, false, 6, new String[][]{{"org.jsoup.nodes.Node", "replaceChild", "org.jsoup.nodes.Node,org.jsoup.nodes.Node", "<sample:1>", "<sample:4>"}}, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput003() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jsoup.nodes.Node", "org.jsoup.nodes.Comment", "replaceWith", new String[]{"org.jsoup.nodes.Node"}, new String[]{"<sample:8>"}, false, 0, new String[][]{{"org.jsoup.nodes.Node", "setParentNode", "org.jsoup.nodes.Node", "<sample:1>"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IndexOutOfBoundsException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput004() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jsoup.nodes.Node", "org.jsoup.nodes.Comment", "doClone", new String[]{"org.jsoup.nodes.Node"}, new String[]{"<sample:9>"}, false, 0, new String[][]{{"org.jsoup.nodes.Node", "nextSibling", ""}}), new String[][]{{"before", "java.lang.String", "5"}, {"siblingNodes", "", "5"}});
  assertNotNull(actual);
  assertEquals("java.util.Collections$UnmodifiableRandomAccessList", actual.getClass().getName());
  assertEquals("[\na]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "\n<!--a--> {getData=a}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput005() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jsoup.nodes.Node", "org.jsoup.nodes.Comment", "doClone", new String[]{"org.jsoup.nodes.Node"}, new String[]{"<sample:6>"}, false, 0, new String[][]{{"org.jsoup.nodes.Node", "childNodes", ""}}, 3), new String[][]{{"before", "java.lang.String", "5"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput006() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jsoup.nodes.Node", "org.jsoup.nodes.Comment", "doClone", new String[]{"org.jsoup.nodes.Node"}, new String[]{"<sample:2>"}, false, 2, new String[][]{}), new String[][]{{"after", "java.lang.String", "4"}});
  assertNotNull(actual);
  assertEquals("org.jsoup.nodes.Comment", actual.getClass().getName());
  assertEquals("\n<!--sample--> {getData=sample}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "\n<!--sample--> {getData=sample}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput007() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jsoup.nodes.Node", "org.jsoup.nodes.Comment", "doClone", new String[]{"org.jsoup.nodes.Node"}, new String[]{"<sample:7>"}, false, 0, new String[][]{{"org.jsoup.nodes.Node", "outerHtmlHead", "java.lang.StringBuilder,int,org.jsoup.nodes.Document$OutputSettings", "<empty>", "32709", "<sample:2>"}}), new String[][]{{"previousSibling", "", "5"}, {"removeAttr", "java.lang.String", "3"}});
  assertNotNull(actual);
  assertEquals("org.jsoup.nodes.Comment", actual.getClass().getName());
  assertEquals("\n<!--a--> {getData=a}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "\n<!--a--> {getData=a}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput008() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jsoup.nodes.Node", "org.jsoup.nodes.Comment", "wrap", new String[]{"java.lang.String"}, new String[]{"Titlenull"}, false, 0, new String[][]{{"org.jsoup.nodes.Node", "hashCode", ""}}, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput009() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Node", "org.jsoup.nodes.Comment", "wrap", new String[]{"java.lang.String"}, new String[]{"a0x1F"}, false, 0, new String[][]{{"org.jsoup.nodes.Node", "setParentNode", "org.jsoup.nodes.Node", "<sample:2>"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "\n<!--a--> {getData=a}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput010() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jsoup.nodes.Node", "org.jsoup.nodes.Comment", "doClone", new String[]{"org.jsoup.nodes.Node"}, new String[]{"<sample:9>"}, false, 4, new String[][]{}), new String[][]{{"before", "org.jsoup.nodes.Node", "6"}, {"after", "org.jsoup.nodes.Node", "0"}});
  assertNotNull(actual);
  assertEquals("org.jsoup.nodes.Comment", actual.getClass().getName());
  assertEquals("\n<!--a--> {getData=a}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "\n<!--a--> {getData=a}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput011() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Node", "org.jsoup.nodes.Comment", "childNodesAsArray", new String[]{}, new String[]{}, false, 5, new String[][]{{"org.jsoup.nodes.Node", "siblingIndex", ""}, {"org.jsoup.nodes.Node", "addChildren", "org.jsoup.nodes.Node[]", "<sample:1>"}});
  assertNotNull(actual);
  assertEquals("[Lorg.jsoup.nodes.Node;", actual.getClass().getName());
  assertEquals("[, <!DOCTYPE html PUBLIC \"0\" sample\">]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "\n<!--0-->\n <#root></#root><!DOCTYPE html PUBLIC \"0\" sample\"> {getData=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput012() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jsoup.nodes.Node", "org.jsoup.nodes.Comment", "outerHtmlHead", new String[]{"java.lang.StringBuilder", "int", "org.jsoup.nodes.Document$OutputSettings"}, new String[]{"<null>", "16354", "<sample:1>"}, false, 0, new String[][]{{"org.jsoup.nodes.Node", "absUrl", "java.lang.String", "abs:5."}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput013() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jsoup.nodes.Node", "org.jsoup.nodes.Comment", "doClone", new String[]{"org.jsoup.nodes.Node"}, new String[]{"<sample:3>"}, false, 4, new String[][]{{"org.jsoup.nodes.Node", "setSiblingIndex", "int", "32767"}}, 2), new String[][]{{"previousSibling", "", "2"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IndexOutOfBoundsException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput014() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jsoup.nodes.Node", "org.jsoup.nodes.Comment", "doClone", new String[]{"org.jsoup.nodes.Node"}, new String[]{"<sample:6>"}, false, 0, new String[][]{{"org.jsoup.nodes.Node", "before", "java.lang.String", "1.12345678ntll"}}), new String[][]{{"before", "org.jsoup.nodes.Node", "6"}, {"remove", "", "2"}});
  assertNotNull(actual);
  assertEquals("org.jsoup.nodes.Comment", actual.getClass().getName());
  assertEquals("\n<!--a--> {getData=a}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "\n<!--a--> {getData=a}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput015() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Node", "org.jsoup.nodes.Comment", "hashCode", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.jsoup.nodes.Node", "setParentNode", "org.jsoup.nodes.Node", "<sample:5>"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("-458083395", String.valueOf(actual));
  assertEquals("receiver state after the call", "\n<!--a--> {getData=a}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput016() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jsoup.nodes.Node", "org.jsoup.nodes.Comment", "setParentNode", new String[]{"org.jsoup.nodes.Node"}, new String[]{"<sample:12>"}, false, 6, new String[][]{{"org.jsoup.nodes.Node", "setParentNode", "org.jsoup.nodes.Node", "<sample:3>"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IndexOutOfBoundsException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput017() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jsoup.nodes.Node", "org.jsoup.nodes.Comment", "attr", new String[]{"java.lang.String", "java.lang.String"}, new String[]{"aaaaaaaaaaaaaaaaaaaaaaaaaaaaa[1,2]", "1.5f"}, false, 5, new String[][]{{"org.jsoup.nodes.Node", "addChildren", "org.jsoup.nodes.Node[]", "<sample:2>"}}), new String[][]{{"clone", "", "0"}, {"absUrl", "java.lang.String", "3"}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("", String.valueOf(actual));
  assertEquals("receiver state after the call", "\n<!--0--><!DOCTYPE html PUBLIC \"0\" sample\">\n <!--a-->a {getData=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput018() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Node", "org.jsoup.nodes.Comment", "siblingIndex", new String[]{}, new String[]{}, false, 0, null, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "\n<!--a--> {getData=a}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput019() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Node", "org.jsoup.nodes.Comment", "baseUri", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.jsoup.nodes.Node", "setParentNode", "org.jsoup.nodes.Node", "<sample:4>"}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "\n<!--a--> {getData=a}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput020() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jsoup.nodes.Node", "org.jsoup.nodes.Comment", "outerHtmlHead", new String[]{"java.lang.StringBuilder", "int", "org.jsoup.nodes.Document$OutputSettings"}, new String[]{"<sample:5>", "-2147483647", "<sample:1>"}, false, 0, null, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput021() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jsoup.nodes.Node", "org.jsoup.nodes.Comment", "after", new String[]{"org.jsoup.nodes.Node"}, new String[]{"<sample:1>"}, false, 3, new String[][]{{"org.jsoup.nodes.Node", "outerHtmlHead", "java.lang.StringBuilder,int,org.jsoup.nodes.Document$OutputSettings", "<sample:1>", "2147483647", "<sample:6>"}}, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput022() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jsoup.nodes.Node", "org.jsoup.nodes.Comment", "replaceWith", new String[]{"org.jsoup.nodes.Node"}, new String[]{"<sample:3>"}, false, 0, null, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput023() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Node", "org.jsoup.nodes.Comment", "absUrl", new String[]{"java.lang.String"}, new String[]{"2147483648null2020-02-30T25:61:61"}, false, 2, new String[][]{{"org.jsoup.nodes.Node", "equals", "java.lang.Object", "<b:true>"}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("", String.valueOf(actual));
  assertEquals("receiver state after the call", "\n<!--sample--> {getData=sample}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput024() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Node", "org.jsoup.nodes.Comment", "absUrl", new String[]{"java.lang.String"}, new String[]{"TITL4E"}, false, 3, new String[][]{{"org.jsoup.nodes.Node", "setParentNode", "org.jsoup.nodes.Node", "<sample:4>"}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("", String.valueOf(actual));
  assertEquals("receiver state after the call", "\n<!----> {getData=}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput025() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Node", "org.jsoup.nodes.Comment", "nextSibling", new String[]{}, new String[]{}, false, 1, new String[][]{{"org.jsoup.nodes.Node", "addChildren", "org.jsoup.nodes.Node[]", "<sample:2>"}}, 2);
  assertNull(actual);
  assertEquals("receiver state after the call", "\n<!--0--><!DOCTYPE html PUBLIC \"0\" sample\">\n <!--a-->a {getData=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput026() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Node", "org.jsoup.nodes.Comment", "absUrl", new String[]{"java.lang.String"}, new String[]{"1.12445678"}, false, 1, new String[][]{}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("", String.valueOf(actual));
  assertEquals("receiver state after the call", "\n<!--0--> {getData=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput027() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Node", "org.jsoup.nodes.Comment", "childNodesAsArray", new String[]{}, new String[]{}, false, 7, new String[][]{{"org.jsoup.nodes.Node", "nodeName", ""}}, 1);
  assertNotNull(actual);
  assertEquals("[Lorg.jsoup.nodes.Node;", actual.getClass().getName());
  assertEquals("[]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "\n<!----> {getData=}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput028() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jsoup.nodes.Node", "org.jsoup.nodes.Comment", "before", new String[]{"java.lang.String"}, new String[]{"2020-01-01"}, false, 3, new String[][]{}, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput029() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Node", "org.jsoup.nodes.Comment", "ownerDocument", new String[]{}, new String[]{}, false, 3, new String[][]{}, 2);
  assertNull(actual);
  assertEquals("receiver state after the call", "\n<!----> {getData=}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput030() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jsoup.nodes.Node", "org.jsoup.nodes.Comment", "doClone", new String[]{"org.jsoup.nodes.Node"}, new String[]{"<sample:6>"}, false, 0, new String[][]{{"org.jsoup.nodes.Node", "before", "java.lang.String", "2020-02-30T25:61:61"}}, 2), new String[][]{{"baseUri", "", "7"}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "\n<!--a--> {getData=a}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput031() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Node", "org.jsoup.nodes.Comment", "absUrl", new String[]{"java.lang.String"}, new String[]{"srue+1"}, false, 4, new String[][]{}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("", String.valueOf(actual));
  assertEquals("receiver state after the call", "\n<!--a--> {getData=a}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput032() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jsoup.nodes.Node", "org.jsoup.nodes.Comment", "remove", new String[]{}, new String[]{}, false, 1, new String[][]{}, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput033() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Node", "org.jsoup.nodes.Comment", "childNodes", new String[]{}, new String[]{}, false, 2, new String[][]{{"org.jsoup.nodes.Node", "setSiblingIndex", "int", "-16368"}}, 2);
  assertNotNull(actual);
  assertEquals("java.util.Collections$UnmodifiableRandomAccessList", actual.getClass().getName());
  assertEquals("[]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "\n<!--sample--> {getData=sample}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput034() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Node", "org.jsoup.nodes.Comment", "baseUri", new String[]{}, new String[]{}, false, 3, new String[][]{}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("a", String.valueOf(actual));
  assertEquals("receiver state after the call", "\n<!----> {getData=}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput035() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Node", "org.jsoup.nodes.Comment", "attr", new String[]{"java.lang.String"}, new String[]{"2020-01-01\u00e9abc"}, false, 1, new String[][]{}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("", String.valueOf(actual));
  assertEquals("receiver state after the call", "\n<!--0--> {getData=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput036() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Node", "org.jsoup.nodes.Comment", "removeAttr", new String[]{"java.lang.String"}, new String[]{"null"}, false, 0, null, 2);
  assertNotNull(actual);
  assertEquals("org.jsoup.nodes.Comment", actual.getClass().getName());
  assertEquals("\n<!--a--> {getData=a}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "\n<!--a--> {getData=a}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput037() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Node", "org.jsoup.nodes.Comment", "absUrl", new String[]{"java.lang.String"}, new String[]{"0xFFFFFFFF "}, false, 0, new String[][]{{"org.jsoup.nodes.Node", "siblingIndex", ""}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("", String.valueOf(actual));
  assertEquals("receiver state after the call", "\n<!--a--> {getData=a}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput038() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Node", "org.jsoup.nodes.Comment", "nextSibling", new String[]{}, new String[]{}, false, 4, new String[][]{{"org.jsoup.nodes.Node", "before", "org.jsoup.nodes.Node", "<sample:7>"}, {"org.jsoup.nodes.Node", "childNodesAsArray", ""}}, 2);
  assertNull(actual);
  assertEquals("receiver state after the call", "\n<!--a--> {getData=a}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput039() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Node", "org.jsoup.nodes.Comment", "baseUri", new String[]{}, new String[]{}, false, 1, new String[][]{{"org.jsoup.nodes.Node", "nextSibling", ""}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("sample", String.valueOf(actual));
  assertEquals("receiver state after the call", "\n<!--0--> {getData=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput040() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Node", "org.jsoup.nodes.Comment", "equals", new String[]{"java.lang.Object"}, new String[]{"<s:c>"}, false, 1, new String[][]{}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "\n<!--0--> {getData=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput041() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Node", "org.jsoup.nodes.Comment", "addChildren", new String[]{"org.jsoup.nodes.Node[]"}, new String[]{"<sample:0>"}, false, 0, new String[][]{{"org.jsoup.nodes.Node", "childNodesAsArray", ""}}, 2);
  assertNull(actual);
  assertEquals("receiver state after the call", "\n<!--a-->a {getData=a}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput042() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Node", "org.jsoup.nodes.Comment", "absUrl", new String[]{"java.lang.String"}, new String[]{"?032768"}, false, 1, new String[][]{}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("", String.valueOf(actual));
  assertEquals("receiver state after the call", "\n<!--0--> {getData=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput043() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jsoup.nodes.Node", "org.jsoup.nodes.Comment", "replaceWith", new String[]{"org.jsoup.nodes.Node"}, new String[]{"<sample:3>"}, false, 0, null, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput044() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jsoup.nodes.Node", "org.jsoup.nodes.Comment", "removeAttr", new String[]{"java.lang.String"}, new String[]{"Hell1o, World"}, false, 0, new String[][]{{"org.jsoup.nodes.Node", "outerHtmlHead", "java.lang.StringBuilder,int,org.jsoup.nodes.Document$OutputSettings", "<sample:3>", "-2147483648", "<sample:0>"}}, 1), new String[][]{{"ownerDocument", "", "3"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "\n<!--a--> {getData=a}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput045() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jsoup.nodes.Node", "org.jsoup.nodes.Comment", "after", new String[]{"java.lang.String"}, new String[]{"2020-0-30T25:61:61"}, false, 0, new String[][]{{"org.jsoup.nodes.Node", "doClone", "org.jsoup.nodes.Node", "<null>"}}, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput046() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Node", "org.jsoup.nodes.Comment", "absUrl", new String[]{"java.lang.String"}, new String[]{"\u00e9"}, false, 7, new String[][]{}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("", String.valueOf(actual));
  assertEquals("receiver state after the call", "\n<!----> {getData=}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput047() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Node", "org.jsoup.nodes.Comment", "equals", new String[]{"java.lang.Object"}, new String[]{"<s:`>"}, false, 6, new String[][]{{"org.jsoup.nodes.Node", "ownerDocument", ""}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "\n<!--a--> {getData=a}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput048() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jsoup.nodes.Node", "org.jsoup.nodes.Comment", "wrap", new String[]{"java.lang.String"}, new String[]{"Title2020-018-01"}, false, 0, new String[][]{{"org.jsoup.nodes.Node", "before", "java.lang.String", "1.124567nulm"}}, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput049() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Node", "org.jsoup.nodes.Comment", "hasAttr", new String[]{"java.lang.String"}, new String[]{"9"}, false, 3, new String[][]{{"org.jsoup.nodes.Node", "hasAttr", "java.lang.String", "5."}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "\n<!----> {getData=}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput050() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jsoup.nodes.Node", "org.jsoup.nodes.Comment", "childNode", new String[]{"int"}, new String[]{"4096"}, false, 3, new String[][]{}, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IndexOutOfBoundsException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput051() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jsoup.nodes.Node", "org.jsoup.nodes.Comment", "after", new String[]{"java.lang.String"}, new String[]{"trFe"}, false, 0, new String[][]{{"org.jsoup.nodes.Node", "absUrl", "java.lang.String", "1.5e30"}, {"org.jsoup.nodes.Node", "doClone", "org.jsoup.nodes.Node", "<null>"}}, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput052() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Node", "org.jsoup.nodes.Comment", "equals", new String[]{"java.lang.Object"}, new String[]{"<s:`>"}, false, 0, null, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "\n<!--a--> {getData=a}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput053() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Node", "org.jsoup.nodes.Comment", "ownerDocument", new String[]{}, new String[]{}, false, 0, null, 2);
  assertNull(actual);
  assertEquals("receiver state after the call", "\n<!--a--> {getData=a}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput054() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Node", "org.jsoup.nodes.Comment", "doClone", new String[]{"org.jsoup.nodes.Node"}, new String[]{"<sample:3>"}, false, 0, new String[][]{{"org.jsoup.nodes.Node", "toString", ""}, {"org.jsoup.nodes.Node", "hasAttr", "java.lang.String", "1.5f"}}, 2);
  assertNotNull(actual);
  assertEquals("org.jsoup.nodes.Comment", actual.getClass().getName());
  assertEquals("\n<!--a--> {getData=a}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "\n<!--a--> {getData=a}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput055() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jsoup.nodes.Node", "org.jsoup.nodes.Comment", "before", new String[]{"java.lang.String"}, new String[]{"\t<a>b</a>"}, false, 0, new String[][]{{"org.jsoup.nodes.Node", "baseUri", ""}}, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput056() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Node", "org.jsoup.nodes.Comment", "parent", new String[]{}, new String[]{}, false, 0, null, 3);
  assertNull(actual);
  assertEquals("receiver state after the call", "\n<!--a--> {getData=a}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput057() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Node", "org.jsoup.nodes.Comment", "ownerDocument", new String[]{}, new String[]{}, false, 0, null, 3);
  assertNull(actual);
  assertEquals("receiver state after the call", "\n<!--a--> {getData=a}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput058() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Node", "org.jsoup.nodes.Comment", "attr", new String[]{"java.lang.String", "java.lang.String"}, new String[]{"5", ""}, false, 5, new String[][]{}, 2);
  assertNotNull(actual);
  assertEquals("org.jsoup.nodes.Comment", actual.getClass().getName());
  assertEquals("\n<!--0--> {getData=0}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "\n<!--0--> {getData=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput059() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Node", "org.jsoup.nodes.Comment", "hasAttr", new String[]{"java.lang.String"}, new String[]{"2020-01-01-1"}, false, 7, new String[][]{}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "\n<!----> {getData=}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput060() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jsoup.nodes.Node", "org.jsoup.nodes.Comment", "remove", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.jsoup.nodes.Node", "before", "java.lang.String", ".5d?"}, {"org.jsoup.nodes.Node", "addChildren", "int,org.jsoup.nodes.Node[]", "-65536", "<sample:2>"}}, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput061() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Node", "org.jsoup.nodes.Comment", "setBaseUri", new String[]{"java.lang.String"}, new String[]{"1.1244567"}, false, 0, new String[][]{{"org.jsoup.nodes.Node", "attr", "java.lang.String,java.lang.String", "0x1F\u00e9", "Hello, World<a>b</a>"}, {"org.jsoup.nodes.Node", "attributes", ""}}, 2);
  assertNull(actual);
  assertEquals("receiver state after the call", "\n<!--a--> {getData=a}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput062() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Node", "org.jsoup.nodes.Comment", "doClone", new String[]{"org.jsoup.nodes.Node"}, new String[]{"<sample:2>"}, false, 2, new String[][]{{"org.jsoup.nodes.Node", "indent", "java.lang.StringBuilder,int,org.jsoup.nodes.Document$OutputSettings", "<null>", "32786", "<sample:0>"}, {"org.jsoup.nodes.Node", "before", "java.lang.String", "HulmPT1H"}}, 3);
  assertNotNull(actual);
  assertEquals("org.jsoup.nodes.Comment", actual.getClass().getName());
  assertEquals("\n<!--sample--> {getData=sample}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "\n<!--sample--> {getData=sample}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput063() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jsoup.nodes.Node", "org.jsoup.nodes.Comment", "wrap", new String[]{"java.lang.String"}, new String[]{"bc/a/b"}, false, 4, new String[][]{}, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput064() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Node", "org.jsoup.nodes.Comment", "parent", new String[]{}, new String[]{}, false, 0, null, 1);
  assertNull(actual);
  assertEquals("receiver state after the call", "\n<!--a--> {getData=a}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput065() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jsoup.nodes.Node", "org.jsoup.nodes.Comment", "before", new String[]{"org.jsoup.nodes.Node"}, new String[]{"<sample:3>"}, false, 0, null, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput066() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Node", "org.jsoup.nodes.Comment", "hasAttr", new String[]{"java.lang.String"}, new String[]{"a,b@c"}, false, 0, new String[][]{{"org.jsoup.nodes.Node", "nextSibling", ""}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "\n<!--a--> {getData=a}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput067() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Node", "org.jsoup.nodes.Comment", "attr", new String[]{"java.lang.String"}, new String[]{"1,2^"}, false, 7, new String[][]{{"org.jsoup.nodes.Node", "wrap", "java.lang.String", "01"}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("", String.valueOf(actual));
  assertEquals("receiver state after the call", "\n<!----> {getData=}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput068() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Node", "org.jsoup.nodes.Comment", "indent", new String[]{"java.lang.StringBuilder", "int", "org.jsoup.nodes.Document$OutputSettings"}, new String[]{"<sample:1>", "2", "<sample:5>"}, false, 4, new String[][]{{"org.jsoup.nodes.Node", "siblingNodes", ""}}, 3);
  assertNull(actual);
  assertEquals("receiver state after the call", "\n<!--a--> {getData=a}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput069() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jsoup.nodes.Node", "org.jsoup.nodes.Comment", "childNodes", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.jsoup.nodes.Node", "hashCode", ""}}, 2), new String[][]{{"iterator", "", "0"}});
  assertNotNull(actual);
  assertEquals("receiver state after the call", "\n<!--a--> {getData=a}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput070() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jsoup.nodes.Node", "org.jsoup.nodes.Comment", "indent", new String[]{"java.lang.StringBuilder", "int", "org.jsoup.nodes.Document$OutputSettings"}, new String[]{"<sample:3>", "-2147483647", "<sample:4>"}, false, 0, new String[][]{{"org.jsoup.nodes.Node", "replaceChild", "org.jsoup.nodes.Node,org.jsoup.nodes.Node", "<sample:0>", "<sample:7>"}, {"org.jsoup.nodes.Node", "siblingNodes", ""}}, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput071() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jsoup.nodes.Node", "org.jsoup.nodes.Comment", "indent", new String[]{"java.lang.StringBuilder", "int", "org.jsoup.nodes.Document$OutputSettings"}, new String[]{"<empty>", "-1", "<sample:0>"}, false, 0, new String[][]{{"org.jsoup.nodes.Node", "childNode", "int", "32790"}}, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput072() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jsoup.nodes.Node", "org.jsoup.nodes.Comment", "addChildren", new String[]{"int", "org.jsoup.nodes.Node[]"}, new String[]{"-2147478527", "<sample:0>"}, false, 0, null, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IndexOutOfBoundsException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput073() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jsoup.nodes.Node", "org.jsoup.nodes.Comment", "before", new String[]{"org.jsoup.nodes.Node"}, new String[]{"<sample:3>"}, false, 0, new String[][]{{"org.jsoup.nodes.Node", "after", "org.jsoup.nodes.Node", "<null>"}}, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput074() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jsoup.nodes.Node", "org.jsoup.nodes.Comment", "previousSibling", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.jsoup.nodes.Node", "attr", "java.lang.String", "hutp://example.com/a?b=c"}, {"org.jsoup.nodes.Node", "hasAttr", "java.lang.String", " "}}, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput075() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Node", "org.jsoup.nodes.Comment", "equals", new String[]{"java.lang.Object"}, new String[]{"<s:4>"}, false, 0, null, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "\n<!--a--> {getData=a}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput076() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jsoup.nodes.Node", "org.jsoup.nodes.Comment", "doClone", new String[]{"org.jsoup.nodes.Node"}, new String[]{"<sample:8>"}, false, 0, new String[][]{{"org.jsoup.nodes.Node", "addChildren", "int,org.jsoup.nodes.Node[]", "20", "<sample:3>"}}, 1), new String[][]{{"attributes", "", "5"}, {"addAll", "org.jsoup.nodes.Attributes", "1"}});
  assertNotNull(actual);
  assertEquals("org.jsoup.nodes.Attributes", actual.getClass().getName());
  assertEquals(" comment=\"a\" {size=1}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "\n<!--a--> {getData=a}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput077() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jsoup.nodes.Node", "org.jsoup.nodes.Comment", "childNodes", new String[]{}, new String[]{}, false, 1, new String[][]{{"org.jsoup.nodes.Node", "removeChild", "org.jsoup.nodes.Node", "<sample:7>"}}, 3), new String[][]{{"listIterator", "", "0"}});
  assertNotNull(actual);
  assertEquals("receiver state after the call", "\n<!--0--> {getData=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput078() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jsoup.nodes.Node", "org.jsoup.nodes.Comment", "replaceChild", new String[]{"org.jsoup.nodes.Node", "org.jsoup.nodes.Node"}, new String[]{"<sample:5>", "<sample:3>"}, false, 0, null, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput079() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jsoup.nodes.Node", "org.jsoup.nodes.Comment", "doClone", new String[]{"org.jsoup.nodes.Node"}, new String[]{"<sample:0>"}, false, 0, null, 1), new String[][]{{"absUrl", "java.lang.String", "7"}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("", String.valueOf(actual));
  assertEquals("receiver state after the call", "\n<!--a--> {getData=a}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput080() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Node", "org.jsoup.nodes.Comment", "hasAttr", new String[]{"java.lang.String"}, new String[]{"21"}, false, 0, new String[][]{{"org.jsoup.nodes.Node", "outerHtmlTail", "java.lang.StringBuilder,int,org.jsoup.nodes.Document$OutputSettings", "<sample:1>", "24", "<sample:7>"}, {"org.jsoup.nodes.Node", "nextSibling", ""}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "\n<!--a--> {getData=a}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput081() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Node", "org.jsoup.nodes.Comment", "attributes", new String[]{}, new String[]{}, false, 7, new String[][]{{"org.jsoup.nodes.Node", "equals", "java.lang.Object", "<s:kfey>"}}, 2);
  assertNotNull(actual);
  assertEquals("org.jsoup.nodes.Attributes", actual.getClass().getName());
  assertEquals(" comment=\"\" {size=1}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "\n<!----> {getData=}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput082() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jsoup.nodes.Node", "org.jsoup.nodes.Comment", "before", new String[]{"java.lang.String"}, new String[]{"ii"}, false, 0, null, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput083() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jsoup.nodes.Node", "org.jsoup.nodes.Comment", "remove", new String[]{}, new String[]{}, false, 0, null, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput084() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Node", "org.jsoup.nodes.Comment", "baseUri", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.jsoup.nodes.Node", "hasAttr", "java.lang.String", "1.1]234567 "}, {"org.jsoup.nodes.Node", "replaceWith", "org.jsoup.nodes.Node", "<sample:2>"}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "\n<!--a--> {getData=a}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput085() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Node", "org.jsoup.nodes.Comment", "baseUri", new String[]{}, new String[]{}, false, 2, new String[][]{{"org.jsoup.nodes.Node", "remove", ""}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("", String.valueOf(actual));
  assertEquals("receiver state after the call", "\n<!--sample--> {getData=sample}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput086() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jsoup.nodes.Node", "org.jsoup.nodes.Comment", "doClone", new String[]{"org.jsoup.nodes.Node"}, new String[]{"<sample:1>"}, false, 0, null, 3), new String[][]{{"attr", "java.lang.String,java.lang.String", "5"}});
  assertNotNull(actual);
  assertEquals("org.jsoup.nodes.Comment", actual.getClass().getName());
  assertEquals("\n<!--a--> {getData=a}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "\n<!--a--> {getData=a}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput087() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jsoup.nodes.Node", "org.jsoup.nodes.Comment", "childNodes", new String[]{}, new String[]{}, false, 0, null, 3), new String[][]{{"contains", "java.lang.Object", "5"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "\n<!--a--> {getData=a}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput088() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jsoup.nodes.Node", "org.jsoup.nodes.Comment", "childNodes", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.jsoup.nodes.Node", "attr", "java.lang.String", ".1"}, {"org.jsoup.nodes.Node", "nodeName", ""}}, 2), new String[][]{{"addAll", "java.util.Collection", "5"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.UnsupportedOperationException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput089() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Node", "org.jsoup.nodes.Comment", "outerHtml", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.jsoup.nodes.Node", "before", "org.jsoup.nodes.Node", "<sample:4>"}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("\n<!--a-->", String.valueOf(actual));
  assertEquals("receiver state after the call", "\n<!--a--> {getData=a}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput090() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Node", "org.jsoup.nodes.Comment", "equals", new String[]{"java.lang.Object"}, new String[]{"<d:31.0>"}, false, 5, new String[][]{{"org.jsoup.nodes.Node", "replaceChild", "org.jsoup.nodes.Node,org.jsoup.nodes.Node", "<sample:7>", "<sample:7>"}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "\n<!--0--> {getData=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput091() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Node", "org.jsoup.nodes.Comment", "hashCode", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.jsoup.nodes.Node", "nodeName", ""}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("-458083395", String.valueOf(actual));
  assertEquals("receiver state after the call", "\n<!--a--> {getData=a}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput092() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jsoup.nodes.Node", "org.jsoup.nodes.Comment", "outerHtmlHead", new String[]{"java.lang.StringBuilder", "int", "org.jsoup.nodes.Document$OutputSettings"}, new String[]{"<sample:2>", "-2147483648", "<sample:3>"}, false, 3, new String[][]{{"org.jsoup.nodes.Node", "parent", ""}}, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput093() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Node", "org.jsoup.nodes.Comment", "childNodesAsArray", new String[]{}, new String[]{}, false, 2, new String[][]{});
  assertNotNull(actual);
  assertEquals("[Lorg.jsoup.nodes.Node;", actual.getClass().getName());
  assertEquals("[]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "\n<!--sample--> {getData=sample}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput094() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jsoup.nodes.Node", "org.jsoup.nodes.Comment", "after", new String[]{"org.jsoup.nodes.Node"}, new String[]{"<sample:1>"}, false, 0, new String[][]{{"org.jsoup.nodes.Node", "wrap", "java.lang.String", "1.12345678null"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput095() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jsoup.nodes.Node", "org.jsoup.nodes.Comment", "childNode", new String[]{"int"}, new String[]{"32767"}, false, 5, new String[][]{}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IndexOutOfBoundsException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput096() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Node", "org.jsoup.nodes.Comment", "doClone", new String[]{"org.jsoup.nodes.Node"}, new String[]{"<sample:3>"}, false, 4, new String[][]{{"org.jsoup.nodes.Node", "addChildren", "int,org.jsoup.nodes.Node[]", "-2147483647", "<sample:3>"}});
  assertNotNull(actual);
  assertEquals("org.jsoup.nodes.Comment", actual.getClass().getName());
  assertEquals("\n<!--a--> {getData=a}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "\n<!--a--> {getData=a}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput097() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jsoup.nodes.Node", "org.jsoup.nodes.Comment", "replaceChild", new String[]{"org.jsoup.nodes.Node", "org.jsoup.nodes.Node"}, new String[]{"<sample:1>", "<sample:1>"}, false); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput098() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Node", "org.jsoup.nodes.Comment", "absUrl", new String[]{"java.lang.String"}, new String[]{"14.55"}, false, 3, new String[][]{{"org.jsoup.nodes.Node", "addChildren", "org.jsoup.nodes.Node[]", "<sample:1>"}, {"org.jsoup.nodes.Node", "removeChild", "org.jsoup.nodes.Node", "<sample:2>"}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("", String.valueOf(actual));
  assertEquals("receiver state after the call", "\n<!---->\n <#root></#root><!DOCTYPE html PUBLIC \"0\" sample\"> {getData=}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput099() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Node", "org.jsoup.nodes.Comment", "clone", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.jsoup.nodes.Node", "setParentNode", "org.jsoup.nodes.Node", "<null>"}});
  assertNotNull(actual);
  assertEquals("org.jsoup.nodes.Comment", actual.getClass().getName());
  assertEquals("\n<!--a--> {getData=a}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "\n<!--a--> {getData=a}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput100() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jsoup.nodes.Node", "org.jsoup.nodes.Comment", "addChildren", new String[]{"int", "org.jsoup.nodes.Node[]"}, new String[]{"-32768", "<sample:2>"}, false); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IndexOutOfBoundsException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput101() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jsoup.nodes.Node", "org.jsoup.nodes.Comment", "previousSibling", new String[]{}, new String[]{}, false); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput102() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Node", "org.jsoup.nodes.Comment", "absUrl", new String[]{"java.lang.String"}, new String[]{"1.1234m56"}, false);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("", String.valueOf(actual));
  assertEquals("receiver state after the call", "\n<!--a--> {getData=a}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput103() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Node", "org.jsoup.nodes.Comment", "childNodes", new String[]{}, new String[]{}, false, 2, new String[][]{});
  assertNotNull(actual);
  assertEquals("java.util.Collections$UnmodifiableRandomAccessList", actual.getClass().getName());
  assertEquals("[]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "\n<!--sample--> {getData=sample}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput104() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jsoup.nodes.Node", "org.jsoup.nodes.Comment", "before", new String[]{"org.jsoup.nodes.Node"}, new String[]{"<sample:3>"}, false, 3, new String[][]{}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput105() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jsoup.nodes.Node", "org.jsoup.nodes.Comment", "remove", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.jsoup.nodes.Node", "setSiblingIndex", "int", "31"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput106() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Node", "org.jsoup.nodes.Comment", "setParentNode", new String[]{"org.jsoup.nodes.Node"}, new String[]{"<sample:3>"}, false, 7, new String[][]{});
  assertNull(actual);
  assertEquals("receiver state after the call", "\n<!----> {getData=}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput107() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Node", "org.jsoup.nodes.Comment", "equals", new String[]{"java.lang.Object"}, new String[]{"<sample:0>"}, false, 5, new String[][]{});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "\n<!--0--> {getData=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput108() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Node", "org.jsoup.nodes.Comment", "nodeName", new String[]{}, new String[]{}, false, 5, new String[][]{{"org.jsoup.nodes.Node", "before", "java.lang.String", "Titlea"}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("#comment", String.valueOf(actual));
  assertEquals("receiver state after the call", "\n<!--0--> {getData=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput109() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Node", "org.jsoup.nodes.Comment", "childNodesAsArray", new String[]{}, new String[]{}, false);
  assertNotNull(actual);
  assertEquals("[Lorg.jsoup.nodes.Node;", actual.getClass().getName());
  assertEquals("[]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "\n<!--a--> {getData=a}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput110() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Node", "org.jsoup.nodes.Comment", "attributes", new String[]{}, new String[]{}, false, 5, new String[][]{{"org.jsoup.nodes.Node", "before", "org.jsoup.nodes.Node", "<sample:4>"}});
  assertNotNull(actual);
  assertEquals("org.jsoup.nodes.Attributes", actual.getClass().getName());
  assertEquals(" comment=\"0\" {size=1}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "\n<!--0--> {getData=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput111() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Node", "org.jsoup.nodes.Comment", "equals", new String[]{"java.lang.Object"}, new String[]{"<i:2>"}, false, 3, new String[][]{});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "\n<!----> {getData=}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput112() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Node", "org.jsoup.nodes.Comment", "addChildren", new String[]{"int", "org.jsoup.nodes.Node[]"}, new String[]{"2147483647", "<empty>"}, false);
  assertNull(actual);
  assertEquals("receiver state after the call", "\n<!--a--> {getData=a}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput113() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Node", "org.jsoup.nodes.Comment", "setParentNode", new String[]{"org.jsoup.nodes.Node"}, new String[]{"<sample:0>"}, false, 2, new String[][]{});
  assertNull(actual);
  assertEquals("receiver state after the call", "\n<!--sample--> {getData=sample}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput114() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jsoup.nodes.Node", "org.jsoup.nodes.Comment", "indent", new String[]{"java.lang.StringBuilder", "int", "org.jsoup.nodes.Document$OutputSettings"}, new String[]{"<sample:1>", "-32718", "<sample:5>"}, false, 4, new String[][]{{"org.jsoup.nodes.Node", "before", "org.jsoup.nodes.Node", "<sample:7>"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput115() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Node", "org.jsoup.nodes.Comment", "attr", new String[]{"java.lang.String", "java.lang.String"}, new String[]{"ab3d", ""}, false, 6, new String[][]{});
  assertNotNull(actual);
  assertEquals("org.jsoup.nodes.Comment", actual.getClass().getName());
  assertEquals("\n<!--a--> {getData=a}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "\n<!--a--> {getData=a}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput116() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Node", "org.jsoup.nodes.Comment", "hasAttr", new String[]{"java.lang.String"}, new String[]{"1.25"}, false, 2, new String[][]{});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "\n<!--sample--> {getData=sample}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput117() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Node", "org.jsoup.nodes.Comment", "childNodes", new String[]{}, new String[]{}, false, 7, new String[][]{{"org.jsoup.nodes.Node", "replaceChild", "org.jsoup.nodes.Node,org.jsoup.nodes.Node", "<null>", "<sample:5>"}});
  assertNotNull(actual);
  assertEquals("java.util.Collections$UnmodifiableRandomAccessList", actual.getClass().getName());
  assertEquals("[]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "\n<!----> {getData=}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput118() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Node", "org.jsoup.nodes.Comment", "setBaseUri", new String[]{"java.lang.String"}, new String[]{"abs:"}, false, 2, new String[][]{});
  assertNull(actual);
  assertEquals("receiver state after the call", "\n<!--sample--> {getData=sample}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput119() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Node", "org.jsoup.nodes.Comment", "equals", new String[]{"java.lang.Object"}, new String[]{"<b:false>"}, false, 2, new String[][]{{"org.jsoup.nodes.Node", "hasAttr", "java.lang.String", "0"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "\n<!--sample--> {getData=sample}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput120() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Node", "org.jsoup.nodes.Comment", "siblingIndex", new String[]{}, new String[]{}, false, 3, new String[][]{});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "\n<!----> {getData=}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput121() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Node", "org.jsoup.nodes.Comment", "nextSibling", new String[]{}, new String[]{}, false);
  assertNull(actual);
  assertEquals("receiver state after the call", "\n<!--a--> {getData=a}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput122() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Node", "org.jsoup.nodes.Comment", "absUrl", new String[]{"java.lang.String"}, new String[]{"aaaaaaaaaaaaaaaaaaaaaaaaaaaaa"}, false, 0, new String[][]{{"org.jsoup.nodes.Node", "removeAttr", "java.lang.String", "nulm"}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("", String.valueOf(actual));
  assertEquals("receiver state after the call", "\n<!--a--> {getData=a}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput123() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jsoup.nodes.Node", "org.jsoup.nodes.Comment", "replaceWith", new String[]{"org.jsoup.nodes.Node"}, new String[]{"<sample:7>"}, false, 5, new String[][]{}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput124() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Node", "org.jsoup.nodes.Comment", "addChildren", new String[]{"org.jsoup.nodes.Node[]"}, new String[]{"<sample:3>"}, false, 0, new String[][]{{"org.jsoup.nodes.Node", "addChildren", "int,org.jsoup.nodes.Node[]", "-2147483648", "<sample:1>"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "\n<!--a-->\n <!--a--> {getData=a}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput125() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jsoup.nodes.Node", "org.jsoup.nodes.Comment", "before", new String[]{"java.lang.String"}, new String[]{"2020-02-30T25:61:611.5"}, false, 0, new String[][]{{"org.jsoup.nodes.Node", "doClone", "org.jsoup.nodes.Node", "<sample:9>"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput126() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Node", "org.jsoup.nodes.Comment", "hasAttr", new String[]{"java.lang.String"}, new String[]{"2020-0m-01"}, false, 7, new String[][]{{"org.jsoup.nodes.Node", "setBaseUri", "java.lang.String", "1.5d"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "\n<!----> {getData=}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput127() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jsoup.nodes.Node", "org.jsoup.nodes.Comment", "wrap", new String[]{"java.lang.String"}, new String[]{"null"}, false, 5, new String[][]{{"org.jsoup.nodes.Node", "before", "org.jsoup.nodes.Node", "<sample:1>"}, {"org.jsoup.nodes.Node", "previousSibling", ""}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput128() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Node", "org.jsoup.nodes.Comment", "attributes", new String[]{}, new String[]{}, false);
  assertNotNull(actual);
  assertEquals("org.jsoup.nodes.Attributes", actual.getClass().getName());
  assertEquals(" comment=\"a\" {size=1}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "\n<!--a--> {getData=a}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput129() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jsoup.nodes.Node", "org.jsoup.nodes.Comment", "indent", new String[]{"java.lang.StringBuilder", "int", "org.jsoup.nodes.Document$OutputSettings"}, new String[]{"<null>", "32768", "<sample:2>"}, false, 0, new String[][]{{"org.jsoup.nodes.Node", "doClone", "org.jsoup.nodes.Node", "<sample:2>"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput130() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Node", "org.jsoup.nodes.Comment", "doClone", new String[]{"org.jsoup.nodes.Node"}, new String[]{"<sample:6>"}, false, 3, new String[][]{{"org.jsoup.nodes.Node", "hashCode", ""}});
  assertNotNull(actual);
  assertEquals("org.jsoup.nodes.Comment", actual.getClass().getName());
  assertEquals("\n<!----> {getData=}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "\n<!----> {getData=}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput131() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Node", "org.jsoup.nodes.Comment", "baseUri", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.jsoup.nodes.Node", "outerHtmlHead", "java.lang.StringBuilder,int,org.jsoup.nodes.Document$OutputSettings", "<sample:6>", "32739", "<sample:1>"}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "\n<!--a--> {getData=a}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput132() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Node", "org.jsoup.nodes.Comment", "baseUri", new String[]{}, new String[]{}, false, 1, new String[][]{});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("sample", String.valueOf(actual));
  assertEquals("receiver state after the call", "\n<!--0--> {getData=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput133() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Node", "org.jsoup.nodes.Comment", "absUrl", new String[]{"java.lang.String"}, new String[]{"http://example.com/a?b=c"}, false, 3, new String[][]{{"org.jsoup.nodes.Node", "siblingNodes", ""}, {"org.jsoup.nodes.Node", "childNodes", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("", String.valueOf(actual));
  assertEquals("receiver state after the call", "\n<!----> {getData=}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput134() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Node", "org.jsoup.nodes.Comment", "childNodesAsArray", new String[]{}, new String[]{}, false, 5, new String[][]{});
  assertNotNull(actual);
  assertEquals("[Lorg.jsoup.nodes.Node;", actual.getClass().getName());
  assertEquals("[]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "\n<!--0--> {getData=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput135() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jsoup.nodes.Node", "org.jsoup.nodes.Comment", "attributes", new String[]{}, new String[]{}, false, 6, new String[][]{}), new String[][]{{"dataset", "", "0"}});
  assertNotNull(actual);
  assertEquals("org.jsoup.nodes.Attributes$Dataset", actual.getClass().getName());
  assertEquals("{}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "\n<!--a--> {getData=a}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput136() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Node", "org.jsoup.nodes.Comment", "attr", new String[]{"java.lang.String"}, new String[]{"\ra bb"}, false);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("", String.valueOf(actual));
  assertEquals("receiver state after the call", "\n<!--a--> {getData=a}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput137() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Node", "org.jsoup.nodes.Comment", "toString", new String[]{}, new String[]{}, false);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("\n<!--a-->", String.valueOf(actual));
  assertEquals("receiver state after the call", "\n<!--a--> {getData=a}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput138() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jsoup.nodes.Node", "org.jsoup.nodes.Comment", "doClone", new String[]{"org.jsoup.nodes.Node"}, new String[]{"<sample:3>"}, false, 1, new String[][]{{"org.jsoup.nodes.Node", "replaceWith", "org.jsoup.nodes.Node", "<sample:0>"}}), new String[][]{{"siblingIndex", "", "4"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "\n<!--0--> {getData=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput139() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Node", "org.jsoup.nodes.Comment", "attr", new String[]{"java.lang.String", "java.lang.String"}, new String[]{"a", "1.5d"}, false, 3, new String[][]{{"org.jsoup.nodes.Node", "before", "java.lang.String", "0x1234567;89"}});
  assertNotNull(actual);
  assertEquals("org.jsoup.nodes.Comment", actual.getClass().getName());
  assertEquals("\n<!----> {getData=}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "\n<!----> {getData=}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput140() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jsoup.nodes.Node", "org.jsoup.nodes.Comment", "clone", new String[]{}, new String[]{}, false, 1, new String[][]{}), new String[][]{{"outerHtml", "", "4"}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("\n<!--0-->", String.valueOf(actual));
  assertEquals("receiver state after the call", "\n<!--0--> {getData=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput141() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Node", "org.jsoup.nodes.Comment", "outerHtml", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.jsoup.nodes.Node", "parent", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("\n<!--a-->", String.valueOf(actual));
  assertEquals("receiver state after the call", "\n<!--a--> {getData=a}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput142() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Node", "org.jsoup.nodes.Comment", "addChildren", new String[]{"org.jsoup.nodes.Node[]"}, new String[]{"<sample:1>"}, false, 0, new String[][]{{"org.jsoup.nodes.Node", "removeAttr", "java.lang.String", "8"}, {"org.jsoup.nodes.Node", "wrap", "java.lang.String", "Ya"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "\n<!--a-->\n <#root></#root><!DOCTYPE html PUBLIC \"0\" sample\"> {getData=a}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput143() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Node", "org.jsoup.nodes.Comment", "outerHtmlHead", new String[]{"java.lang.StringBuilder", "int", "org.jsoup.nodes.Document$OutputSettings"}, new String[]{"<sample:0>", "0", "<sample:2>"}, false, 7, new String[][]{{"org.jsoup.nodes.Node", "attr", "java.lang.String", " babs:"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "\n<!----> {getData=}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput144() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jsoup.nodes.Node", "org.jsoup.nodes.Comment", "clone", new String[]{}, new String[]{}, false, 3, new String[][]{{"org.jsoup.nodes.Node", "parent", ""}, {"org.jsoup.nodes.Node", "indent", "java.lang.StringBuilder,int,org.jsoup.nodes.Document$OutputSettings", "<sample:1>", "-2147483616", "<sample:7>"}}), new String[][]{{"previousSibling", "", "7"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput145() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Node", "org.jsoup.nodes.Comment", "absUrl", new String[]{"java.lang.String"}, new String[]{"1.25"}, false, 0, new String[][]{{"org.jsoup.nodes.Node", "addChildren", "org.jsoup.nodes.Node[]", "<sample:2>"}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("", String.valueOf(actual));
  assertEquals("receiver state after the call", "\n<!--a--><!DOCTYPE html PUBLIC \"0\" sample\">\n <!--a-->a {getData=a}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput146() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Node", "org.jsoup.nodes.Comment", "baseUri", new String[]{}, new String[]{}, false, 3, new String[][]{{"org.jsoup.nodes.Node", "before", "org.jsoup.nodes.Node", "<sample:5>"}, {"org.jsoup.nodes.Node", "attributes", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("a", String.valueOf(actual));
  assertEquals("receiver state after the call", "\n<!----> {getData=}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput147() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jsoup.nodes.Node", "org.jsoup.nodes.Comment", "attributes", new String[]{}, new String[]{}, false, 6, new String[][]{{"org.jsoup.nodes.Node", "previousSibling", ""}}), new String[][]{{"get", "java.lang.String", "3"}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("", String.valueOf(actual));
  assertEquals("receiver state after the call", "\n<!--a--> {getData=a}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput148() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jsoup.nodes.Node", "org.jsoup.nodes.Comment", "childNodes", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.jsoup.nodes.Node", "hasAttr", "java.lang.String", "a"}}), new String[][]{{"subList", "int,int", "5"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IndexOutOfBoundsException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput149() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Node", "org.jsoup.nodes.Comment", "hashCode", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.jsoup.nodes.Node", "hashCode", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("-458083395", String.valueOf(actual));
  assertEquals("receiver state after the call", "\n<!--a--> {getData=a}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput150() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Node", "org.jsoup.nodes.Comment", "addChildren", new String[]{"org.jsoup.nodes.Node[]"}, new String[]{"<sample:0>"}, false, 7, new String[][]{});
  assertNull(actual);
  assertEquals("receiver state after the call", "\n<!---->a {getData=}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput151() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jsoup.nodes.Node", "org.jsoup.nodes.Comment", "clone", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.jsoup.nodes.Node", "remove", ""}, {"org.jsoup.nodes.Node", "setBaseUri", "java.lang.String", "TITLE"}}), new String[][]{{"removeAttr", "java.lang.String", "0"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput152() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jsoup.nodes.Node", "org.jsoup.nodes.Comment", "attr", new String[]{"java.lang.String", "java.lang.String"}, new String[]{";ull", "_1"}, false, 0, new String[][]{{"org.jsoup.nodes.Node", "addChildren", "org.jsoup.nodes.Node[]", "<sample:5>"}, {"org.jsoup.nodes.Node", "outerHtmlTail", "java.lang.StringBuilder,int,org.jsoup.nodes.Document$OutputSettings", "<sample:6>", "1", "<sample:7>"}}), new String[][]{{"before", "java.lang.String", "6"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput153() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Node", "org.jsoup.nodes.Comment", "equals", new String[]{"java.lang.Object"}, new String[]{"<b:true>"}, false);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "\n<!--a--> {getData=a}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput154() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Node", "org.jsoup.nodes.Comment", "outerHtmlHead", new String[]{"java.lang.StringBuilder", "int", "org.jsoup.nodes.Document$OutputSettings"}, new String[]{"<empty>", "32769", "<sample:5>"}, false, 0, new String[][]{{"org.jsoup.nodes.Node", "childNodesAsArray", ""}, {"org.jsoup.nodes.Node", "childNodesAsArray", ""}});
  assertNull(actual);
  assertEquals("receiver state after the call", "\n<!--a--> {getData=a}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput155() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Node", "org.jsoup.nodes.Comment", "doClone", new String[]{"org.jsoup.nodes.Node"}, new String[]{"<sample:2>"}, false, 2, new String[][]{{"org.jsoup.nodes.Node", "siblingIndex", ""}});
  assertNotNull(actual);
  assertEquals("org.jsoup.nodes.Comment", actual.getClass().getName());
  assertEquals("\n<!--sample--> {getData=sample}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "\n<!--sample--> {getData=sample}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput156() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jsoup.nodes.Node", "org.jsoup.nodes.Comment", "childNodes", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.jsoup.nodes.Node", "ownerDocument", ""}}), new String[][]{{"contains", "java.lang.Object", "4"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "\n<!--a--> {getData=a}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput157() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Node", "org.jsoup.nodes.Comment", "indent", new String[]{"java.lang.StringBuilder", "int", "org.jsoup.nodes.Document$OutputSettings"}, new String[]{"<sample:0>", "58", "<sample:0>"}, false, 0, new String[][]{{"org.jsoup.nodes.Node", "doClone", "org.jsoup.nodes.Node", "<sample:0>"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "\n<!--a--> {getData=a}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput158() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Node", "org.jsoup.nodes.Comment", "addChildren", new String[]{"org.jsoup.nodes.Node[]"}, new String[]{"<sample:0>"}, false, 6, new String[][]{{"org.jsoup.nodes.Node", "remove", ""}});
  assertNull(actual);
  assertEquals("receiver state after the call", "\n<!--a-->a {getData=a}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput159() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Node", "org.jsoup.nodes.Comment", "equals", new String[]{"java.lang.Object"}, new String[]{"<i:-1>"}, false, 5, new String[][]{{"org.jsoup.nodes.Node", "addChildren", "org.jsoup.nodes.Node[]", "<sample:3>"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "\n<!--0-->\n <!--a--> {getData=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput160() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Node", "org.jsoup.nodes.Comment", "siblingIndex", new String[]{}, new String[]{}, false, 1, new String[][]{});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "\n<!--0--> {getData=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput161() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Node", "org.jsoup.nodes.Comment", "absUrl", new String[]{"java.lang.String"}, new String[]{"1.I2a5"}, false, 2, new String[][]{});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("", String.valueOf(actual));
  assertEquals("receiver state after the call", "\n<!--sample--> {getData=sample}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput162() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Node", "org.jsoup.nodes.Comment", "siblingIndex", new String[]{}, new String[]{}, false, 2, new String[][]{});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "\n<!--sample--> {getData=sample}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput163() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Node", "org.jsoup.nodes.Comment", "outerHtml", new String[]{"java.lang.StringBuilder"}, new String[]{"<empty>"}, false, 7, new String[][]{});
  assertNull(actual);
  assertEquals("receiver state after the call", "\n<!----> {getData=}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput164() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Node", "org.jsoup.nodes.Comment", "parent", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.jsoup.nodes.Node", "addChildren", "int,org.jsoup.nodes.Node[]", "-32768", "<null>"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "\n<!--a--> {getData=a}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput165() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jsoup.nodes.Node", "org.jsoup.nodes.Comment", "doClone", new String[]{"org.jsoup.nodes.Node"}, new String[]{"<sample:5>"}, false, 0, new String[][]{{"org.jsoup.nodes.Node", "setSiblingIndex", "int", "1"}}), new String[][]{{"absUrl", "java.lang.String", "5"}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("", String.valueOf(actual));
  assertEquals("receiver state after the call", "\n<!--a--> {getData=a}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput166() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jsoup.nodes.Node", "org.jsoup.nodes.Comment", "addChildren", new String[]{"org.jsoup.nodes.Node[]"}, new String[]{"<null>"}, false, 2, new String[][]{{"org.jsoup.nodes.Node", "addChildren", "org.jsoup.nodes.Node[]", "<sample:0>"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput167() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jsoup.nodes.Node", "org.jsoup.nodes.Comment", "childNodes", new String[]{}, new String[]{}, false, 3, new String[][]{{"org.jsoup.nodes.Node", "before", "java.lang.String", "b"}}), new String[][]{{"lastIndexOf", "java.lang.Object", "7"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("-1", String.valueOf(actual));
  assertEquals("receiver state after the call", "\n<!----> {getData=}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput168() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Node", "org.jsoup.nodes.Comment", "absUrl", new String[]{"java.lang.String"}, new String[]{"1"}, false, 1, new String[][]{{"org.jsoup.nodes.Node", "setBaseUri", "java.lang.String", "aaaaaaaaaaaaaaaaaaaaaaaaaaaaa"}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("", String.valueOf(actual));
  assertEquals("receiver state after the call", "\n<!--0--> {getData=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput169() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jsoup.nodes.Node", "org.jsoup.nodes.Comment", "after", new String[]{"java.lang.String"}, new String[]{"--1"}, false, 0, new String[][]{{"org.jsoup.nodes.Node", "removeChild", "org.jsoup.nodes.Node", "<sample:7>"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput170() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jsoup.nodes.Node", "org.jsoup.nodes.Comment", "outerHtmlHead", new String[]{"java.lang.StringBuilder", "int", "org.jsoup.nodes.Document$OutputSettings"}, new String[]{"<sample:1>", "-16328", "<sample:2>"}, false, 3, new String[][]{{"org.jsoup.nodes.Node", "replaceWith", "org.jsoup.nodes.Node", "<sample:6>"}, {"org.jsoup.nodes.Node", "nextSibling", ""}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput171() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Node", "org.jsoup.nodes.Comment", "setSiblingIndex", new String[]{"int"}, new String[]{"2147483647"}, false, 7, new String[][]{{"org.jsoup.nodes.Node", "hashCode", ""}});
  assertNull(actual);
  assertEquals("receiver state after the call", "\n<!----> {getData=}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput172() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jsoup.nodes.Node", "org.jsoup.nodes.Comment", "siblingNodes", new String[]{}, new String[]{}, false, 1, new String[][]{}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput173() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Node", "org.jsoup.nodes.Comment", "addChildren", new String[]{"org.jsoup.nodes.Node[]"}, new String[]{"<sample:2>"}, false, 1, new String[][]{{"org.jsoup.nodes.Node", "setBaseUri", "java.lang.String", "http:/0example.com/a?b=c"}, {"org.jsoup.nodes.Node", "previousSibling", ""}});
  assertNull(actual);
  assertEquals("receiver state after the call", "\n<!--0--><!DOCTYPE html PUBLIC \"0\" sample\">\n <!--a-->a {getData=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput174() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Node", "org.jsoup.nodes.Comment", "siblingIndex", new String[]{}, new String[]{}, false, 6, new String[][]{});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "\n<!--a--> {getData=a}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput175() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Node", "org.jsoup.nodes.Comment", "attr", new String[]{"java.lang.String", "java.lang.String"}, new String[]{"2020-02-30T25:61:61", ";a>b</a>"}, false, 2, new String[][]{{"org.jsoup.nodes.Node", "doClone", "org.jsoup.nodes.Node", "<sample:0>"}});
  assertNotNull(actual);
  assertEquals("org.jsoup.nodes.Comment", actual.getClass().getName());
  assertEquals("\n<!--sample--> {getData=sample}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "\n<!--sample--> {getData=sample}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput176() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Node", "org.jsoup.nodes.Comment", "outerHtmlTail", new String[]{"java.lang.StringBuilder", "int", "org.jsoup.nodes.Document$OutputSettings"}, new String[]{"<null>", "2147483647", "<sample:4>"}, false, 4, new String[][]{{"org.jsoup.nodes.Node", "outerHtml", "java.lang.StringBuilder", "<sample:2>"}, {"org.jsoup.nodes.Node", "outerHtmlHead", "java.lang.StringBuilder,int,org.jsoup.nodes.Document$OutputSettings", "<sample:1>", "-2147483647", "<sample:3>"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "\n<!--a--> {getData=a}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput177() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Node", "org.jsoup.nodes.Comment", "nextSibling", new String[]{}, new String[]{}, false, 5, new String[][]{{"org.jsoup.nodes.Node", "removeChild", "org.jsoup.nodes.Node", "<sample:5>"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "\n<!--0--> {getData=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput178() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Node", "org.jsoup.nodes.Comment", "nodeName", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.jsoup.nodes.Node", "replaceWith", "org.jsoup.nodes.Node", "<sample:4>"}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("#comment", String.valueOf(actual));
  assertEquals("receiver state after the call", "\n<!--a--> {getData=a}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput179() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Node", "org.jsoup.nodes.Comment", "attr", new String[]{"java.lang.String", "java.lang.String"}, new String[]{"??", "0x0F"}, false, 1, new String[][]{{"org.jsoup.nodes.Node", "setParentNode", "org.jsoup.nodes.Node", "<sample:9>"}, {"org.jsoup.nodes.Node", "setBaseUri", "java.lang.String", "num"}});
  assertNotNull(actual);
  assertEquals("org.jsoup.nodes.Comment", actual.getClass().getName());
  assertEquals("\n<!--0--> {getData=0}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "\n<!--0--> {getData=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput180() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Node", "org.jsoup.nodes.Comment", "hasAttr", new String[]{"java.lang.String"}, new String[]{"+11.123451678901234567"}, false, 0, new String[][]{{"org.jsoup.nodes.Node", "equals", "java.lang.Object", "<i:-8>"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "\n<!--a--> {getData=a}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput181() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Node", "org.jsoup.nodes.Comment", "nextSibling", new String[]{}, new String[]{}, false, 7, new String[][]{{"org.jsoup.nodes.Node", "baseUri", ""}});
  assertNull(actual);
  assertEquals("receiver state after the call", "\n<!----> {getData=}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput182() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jsoup.nodes.Node", "org.jsoup.nodes.Comment", "attributes", new String[]{}, new String[]{}, false, 7, new String[][]{}), new String[][]{{"get", "java.lang.String", "7"}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("", String.valueOf(actual));
  assertEquals("receiver state after the call", "\n<!----> {getData=}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput183() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Node", "org.jsoup.nodes.Comment", "outerHtmlTail", new String[]{"java.lang.StringBuilder", "int", "org.jsoup.nodes.Document$OutputSettings"}, new String[]{"<sample:0>", "0", "<sample:6>"}, false, 1, new String[][]{{"org.jsoup.nodes.Node", "addChildren", "org.jsoup.nodes.Node[]", "<sample:0>"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "\n<!--0-->a {getData=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput184() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jsoup.nodes.Node", "org.jsoup.nodes.Comment", "absUrl", new String[]{"java.lang.String"}, new String[]{""}, false, 0, new String[][]{{"org.jsoup.nodes.Node", "equals", "java.lang.Object", "<s:bB>"}, {"org.jsoup.nodes.Node", "outerHtmlHead", "java.lang.StringBuilder,int,org.jsoup.nodes.Document$OutputSettings", "<sample:2>", "2147483647", "<sample:1>"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput185() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Node", "org.jsoup.nodes.Comment", "baseUri", new String[]{}, new String[]{}, false, 2, new String[][]{{"org.jsoup.nodes.Node", "replaceChild", "org.jsoup.nodes.Node,org.jsoup.nodes.Node", "<sample:6>", "<sample:5>"}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("", String.valueOf(actual));
  assertEquals("receiver state after the call", "\n<!--sample--> {getData=sample}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput186() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Node", "org.jsoup.nodes.Comment", "hashCode", new String[]{}, new String[]{}, false, 3, new String[][]{});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("-458083362", String.valueOf(actual));
  assertEquals("receiver state after the call", "\n<!----> {getData=}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput187() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Node", "org.jsoup.nodes.Comment", "hashCode", new String[]{}, new String[]{}, false, 1, new String[][]{});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("-458083346", String.valueOf(actual));
  assertEquals("receiver state after the call", "\n<!--0--> {getData=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput188() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Node", "org.jsoup.nodes.Comment", "indent", new String[]{"java.lang.StringBuilder", "int", "org.jsoup.nodes.Document$OutputSettings"}, new String[]{"<sample:6>", "20", "<sample:4>"}, false, 7, new String[][]{});
  assertNull(actual);
  assertEquals("receiver state after the call", "\n<!----> {getData=}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput189() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Node", "org.jsoup.nodes.Comment", "parent", new String[]{}, new String[]{}, false, 3, new String[][]{{"org.jsoup.nodes.Node", "removeChild", "org.jsoup.nodes.Node", "<sample:1>"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "\n<!----> {getData=}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput190() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jsoup.nodes.Node", "org.jsoup.nodes.Comment", "childNodes", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.jsoup.nodes.Node", "clone", ""}}), new String[][]{{"clear", "", "4"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.UnsupportedOperationException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput191() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Node", "org.jsoup.nodes.Comment", "baseUri", new String[]{}, new String[]{}, false, 1, new String[][]{{"org.jsoup.nodes.Node", "addChildren", "org.jsoup.nodes.Node[]", "<sample:5>"}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("sample", String.valueOf(actual));
  assertEquals("receiver state after the call", "\n<!--0-->\n <!--a-->\n <!--0-->\n <!--a--> {getData=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput192() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jsoup.nodes.Node", "org.jsoup.nodes.Comment", "attributes", new String[]{}, new String[]{}, false, 3, new String[][]{{"org.jsoup.nodes.Node", "before", "org.jsoup.nodes.Node", "<null>"}, {"org.jsoup.nodes.Node", "wrap", "java.lang.String", "1.12c45678null"}}), new String[][]{{"put", "java.lang.String,java.lang.String", "6"}, {"hasKey", "java.lang.String", "0"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "\n<!----> {getData=}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput193() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Node", "org.jsoup.nodes.Comment", "attr", new String[]{"java.lang.String"}, new String[]{"-61"}, false, 3, new String[][]{{"org.jsoup.nodes.Node", "clone", ""}, {"org.jsoup.nodes.Node", "replaceWith", "org.jsoup.nodes.Node", "<sample:7>"}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("", String.valueOf(actual));
  assertEquals("receiver state after the call", "\n<!----> {getData=}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput194() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Node", "org.jsoup.nodes.Comment", "attr", new String[]{"java.lang.String"}, new String[]{"i-1.95"}, false, 1, new String[][]{{"org.jsoup.nodes.Node", "replaceWith", "org.jsoup.nodes.Node", "<sample:4>"}, {"org.jsoup.nodes.Node", "wrap", "java.lang.String", "tru?"}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("", String.valueOf(actual));
  assertEquals("receiver state after the call", "\n<!--0--> {getData=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput195() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Node", "org.jsoup.nodes.Comment", "doClone", new String[]{"org.jsoup.nodes.Node"}, new String[]{"<sample:0>"}, false, 1, new String[][]{{"org.jsoup.nodes.Node", "removeChild", "org.jsoup.nodes.Node", "<sample:5>"}, {"org.jsoup.nodes.Node", "remove", ""}});
  assertNotNull(actual);
  assertEquals("org.jsoup.nodes.Comment", actual.getClass().getName());
  assertEquals("\n<!--0--> {getData=0}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "\n<!--0--> {getData=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput196() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jsoup.nodes.Node", "org.jsoup.nodes.Comment", "doClone", new String[]{"org.jsoup.nodes.Node"}, new String[]{"<sample:6>"}, false, 1, new String[][]{{"org.jsoup.nodes.Node", "replaceWith", "org.jsoup.nodes.Node", "<sample:0>"}}), new String[][]{{"childNodes", "", "1"}, {"add", "int,java.lang.Object", "0"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.UnsupportedOperationException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput197() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jsoup.nodes.Node", "org.jsoup.nodes.Comment", "removeChild", new String[]{"org.jsoup.nodes.Node"}, new String[]{"<sample:10>"}, false, 1, new String[][]{{"org.jsoup.nodes.Node", "setBaseUri", "java.lang.String", "`bs:"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput198() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jsoup.nodes.Node", "org.jsoup.nodes.Comment", "doClone", new String[]{"org.jsoup.nodes.Node"}, new String[]{"<sample:7>"}, false, 3, new String[][]{{"org.jsoup.nodes.Node", "removeChild", "org.jsoup.nodes.Node", "<sample:7>"}}), new String[][]{{"outerHtml", "", "0"}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("\n<!---->", String.valueOf(actual));
  assertEquals("receiver state after the call", "\n<!----> {getData=}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput199() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Node", "org.jsoup.nodes.Comment", "setParentNode", new String[]{"org.jsoup.nodes.Node"}, new String[]{"<null>"}, false, 1, new String[][]{{"org.jsoup.nodes.Node", "attr", "java.lang.String,java.lang.String", "a F4b", "\n"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "\n<!--0--> {getData=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput200() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jsoup.nodes.Node", "org.jsoup.nodes.Comment", "attributes", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.jsoup.nodes.Node", "before", "java.lang.String", "1.1234567"}, {"org.jsoup.nodes.Node", "outerHtmlHead", "java.lang.StringBuilder,int,org.jsoup.nodes.Document$OutputSettings", "<sample:1>", "1", "<sample:0>"}}), new String[][]{{"clone", "", "4"}, {"asList", "", "6"}});
  assertNotNull(actual);
  assertEquals("java.util.Collections$UnmodifiableRandomAccessList", actual.getClass().getName());
  assertEquals("[comment=\"a\"]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "\n<!--a--> {getData=a}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput201() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jsoup.nodes.Node", "org.jsoup.nodes.Comment", "outerHtmlHead", new String[]{"java.lang.StringBuilder", "int", "org.jsoup.nodes.Document$OutputSettings"}, new String[]{"<sample:1>", "-2147483647", "<null>"}, false, 0, new String[][]{{"org.jsoup.nodes.Node", "toString", ""}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput202() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Node", "org.jsoup.nodes.Comment", "setSiblingIndex", new String[]{"int"}, new String[]{"-2147483648"}, false, 1, new String[][]{});
  assertNull(actual);
  assertEquals("receiver state after the call", "\n<!--0--> {getData=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput203() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jsoup.nodes.Node", "org.jsoup.nodes.Comment", "clone", new String[]{}, new String[]{}, false), new String[][]{{"nextSibling", "", "4"}, {"baseUri", "", "5"}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "\n<!--a--> {getData=a}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput204() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Node", "org.jsoup.nodes.Comment", "hashCode", new String[]{}, new String[]{}, false, 2, new String[][]{});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("-1652900492", String.valueOf(actual));
  assertEquals("receiver state after the call", "\n<!--sample--> {getData=sample}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput205() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Node", "org.jsoup.nodes.Comment", "hasAttr", new String[]{"java.lang.String"}, new String[]{"#\ttet"}, false, 1, new String[][]{{"org.jsoup.nodes.Node", "siblingIndex", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "\n<!--0--> {getData=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput206() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jsoup.nodes.Node", "org.jsoup.nodes.Comment", "attributes", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.jsoup.nodes.Node", "attributes", ""}, {"org.jsoup.nodes.Node", "after", "org.jsoup.nodes.Node", "<null>"}}), new String[][]{{"html", "", "5"}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals(" comment=\"a\"", String.valueOf(actual));
  assertEquals("receiver state after the call", "\n<!--a--> {getData=a}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput207() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jsoup.nodes.Node", "org.jsoup.nodes.Comment", "doClone", new String[]{"org.jsoup.nodes.Node"}, new String[]{"<sample:4>"}, false, 0, new String[][]{{"org.jsoup.nodes.Node", "outerHtmlTail", "java.lang.StringBuilder,int,org.jsoup.nodes.Document$OutputSettings", "<sample:5>", "-2147483647", "<null>"}}), new String[][]{{"before", "org.jsoup.nodes.Node", "2"}, {"baseUri", "", "1"}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "\n<!--a--> {getData=a}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput208() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jsoup.nodes.Node", "org.jsoup.nodes.Comment", "attributes", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.jsoup.nodes.Node", "addChildren", "int,org.jsoup.nodes.Node[]", "134184978", "<null>"}}), new String[][]{{"hasKey", "java.lang.String", "1"}, {"iterator", "", "0"}, {"hasNext", "", "7"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
  assertEquals("receiver state after the call", "\n<!--a--> {getData=a}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput209() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Node", "org.jsoup.nodes.Comment", "childNodesAsArray", new String[]{}, new String[]{}, false, 3, new String[][]{});
  assertNotNull(actual);
  assertEquals("[Lorg.jsoup.nodes.Node;", actual.getClass().getName());
  assertEquals("[]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "\n<!----> {getData=}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput210() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Node", "org.jsoup.nodes.Comment", "outerHtml", new String[]{}, new String[]{}, false, 3, new String[][]{{"org.jsoup.nodes.Node", "replaceChild", "org.jsoup.nodes.Node,org.jsoup.nodes.Node", "<sample:9>", "<sample:8>"}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("\n<!---->", String.valueOf(actual));
  assertEquals("receiver state after the call", "\n<!----> {getData=}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput211() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Node", "org.jsoup.nodes.Comment", "outerHtmlTail", new String[]{"java.lang.StringBuilder", "int", "org.jsoup.nodes.Document$OutputSettings"}, new String[]{"<empty>", "32767", "<null>"}, false, 2, new String[][]{{"org.jsoup.nodes.Node", "previousSibling", ""}, {"org.jsoup.nodes.Node", "addChildren", "org.jsoup.nodes.Node[]", "<sample:0>"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "\n<!--sample-->a {getData=sample}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput212() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Node", "org.jsoup.nodes.Comment", "hashCode", new String[]{}, new String[]{}, false, 4, new String[][]{});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("193240891", String.valueOf(actual));
  assertEquals("receiver state after the call", "\n<!--a--> {getData=a}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput213() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Node", "org.jsoup.nodes.Comment", "outerHtml", new String[]{"java.lang.StringBuilder"}, new String[]{"<sample:0>"}, false);
  assertNull(actual);
  assertEquals("receiver state after the call", "\n<!--a--> {getData=a}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput214() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jsoup.nodes.Node", "org.jsoup.nodes.Comment", "attr", new String[]{"java.lang.String", "java.lang.String"}, new String[]{"[\n,2^", "1.5"}, false, 4, new String[][]{{"org.jsoup.nodes.Node", "baseUri", ""}}), new String[][]{{"attributes", "", "4"}});
  assertNotNull(actual);
  assertEquals("org.jsoup.nodes.Attributes", actual.getClass().getName());
  assertEquals(" comment=\"a\" <a><b>t</b></a>=\"{&quot;a&quot;:1}\" [\n,2^=\"1.5\" {size=3}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "\n<!--a--> {getData=a}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput215() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Node", "org.jsoup.nodes.Comment", "ownerDocument", new String[]{}, new String[]{}, false);
  assertNull(actual);
  assertEquals("receiver state after the call", "\n<!--a--> {getData=a}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput216() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jsoup.nodes.Node", "org.jsoup.nodes.Comment", "attr", new String[]{"java.lang.String", "java.lang.String"}, new String[]{"/a/b-1", "2e10"}, false, 0, new String[][]{{"org.jsoup.nodes.Node", "outerHtmlHead", "java.lang.StringBuilder,int,org.jsoup.nodes.Document$OutputSettings", "<sample:0>", "2147483647", "<sample:6>"}, {"org.jsoup.nodes.Node", "parent", ""}}), new String[][]{{"nodeName", "", "6"}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("#comment", String.valueOf(actual));
  assertEquals("receiver state after the call", "\n<!--a--> {getData=a}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput217() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jsoup.nodes.Node", "org.jsoup.nodes.Comment", "removeAttr", new String[]{"java.lang.String"}, new String[]{"23456689012345678901234567890"}, false), new String[][]{{"before", "java.lang.String", "5"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput218() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Node", "org.jsoup.nodes.Comment", "nodeName", new String[]{}, new String[]{}, false, 7, new String[][]{{"org.jsoup.nodes.Node", "remove", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("#comment", String.valueOf(actual));
  assertEquals("receiver state after the call", "\n<!----> {getData=}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput219() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Node", "org.jsoup.nodes.Comment", "outerHtmlHead", new String[]{"java.lang.StringBuilder", "int", "org.jsoup.nodes.Document$OutputSettings"}, new String[]{"<empty>", "32769", "<sample:8>"}, false, 5, new String[][]{{"org.jsoup.nodes.Node", "setBaseUri", "java.lang.String", "http://example.+om/a?b=c"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "\n<!--0--> {getData=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput220() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jsoup.nodes.Node", "org.jsoup.nodes.Comment", "attributes", new String[]{}, new String[]{}, false), new String[][]{{"size", "", "7"}, {"put", "java.lang.String,java.lang.String", "0"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput221() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jsoup.nodes.Node", "org.jsoup.nodes.Comment", "childNodes", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.jsoup.nodes.Node", "doClone", "org.jsoup.nodes.Node", "<sample:10>"}}), new String[][]{{"listIterator", "", "3"}});
  assertNotNull(actual);
  assertEquals("receiver state after the call", "\n<!--a--> {getData=a}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput222() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Node", "org.jsoup.nodes.Comment", "hasAttr", new String[]{"java.lang.String"}, new String[]{"ulm0x1F"}, false, 0, new String[][]{{"org.jsoup.nodes.Node", "addChildren", "org.jsoup.nodes.Node[]", "<sample:2>"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "\n<!--a--><!DOCTYPE html PUBLIC \"0\" sample\">\n <!--a-->a {getData=a}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput223() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jsoup.nodes.Node", "org.jsoup.nodes.Comment", "doClone", new String[]{"org.jsoup.nodes.Node"}, new String[]{"<sample:4>"}, false, 0, new String[][]{{"org.jsoup.nodes.Node", "toString", ""}}), new String[][]{{"remove", "", "7"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IndexOutOfBoundsException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput224() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Node", "org.jsoup.nodes.Comment", "outerHtmlTail", new String[]{"java.lang.StringBuilder", "int", "org.jsoup.nodes.Document$OutputSettings"}, new String[]{"<sample:1>", "-6", "<sample:7>"}, false, 1, new String[][]{{"org.jsoup.nodes.Node", "after", "org.jsoup.nodes.Node", "<sample:5>"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "\n<!--0--> {getData=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput225() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jsoup.nodes.Node", "org.jsoup.nodes.Comment", "doClone", new String[]{"org.jsoup.nodes.Node"}, new String[]{"<sample:4>"}, false), new String[][]{{"attr", "java.lang.String,java.lang.String", "4"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput226() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jsoup.nodes.Node", "org.jsoup.nodes.Comment", "doClone", new String[]{"org.jsoup.nodes.Node"}, new String[]{"<sample:8>"}, false), new String[][]{{"clone", "", "5"}, {"outerHtml", "", "7"}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("\n<!--a-->", String.valueOf(actual));
  assertEquals("receiver state after the call", "\n<!--a--> {getData=a}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput227() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jsoup.nodes.Node", "org.jsoup.nodes.Comment", "clone", new String[]{}, new String[]{}, false, 1, new String[][]{}), new String[][]{{"childNodes", "", "3"}});
  assertNotNull(actual);
  assertEquals("java.util.Collections$UnmodifiableRandomAccessList", actual.getClass().getName());
  assertEquals("[]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "\n<!--0--> {getData=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput228() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Node", "org.jsoup.nodes.Comment", "parent", new String[]{}, new String[]{}, false, 2, new String[][]{{"org.jsoup.nodes.Node", "doClone", "org.jsoup.nodes.Node", "<sample:0>"}, {"org.jsoup.nodes.Node", "outerHtmlHead", "java.lang.StringBuilder,int,org.jsoup.nodes.Document$OutputSettings", "<sample:5>", "-2147483648", "<sample:1>"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "\n<!--sample--> {getData=sample}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput229() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Node", "org.jsoup.nodes.Comment", "ownerDocument", new String[]{}, new String[]{}, false, 7, new String[][]{{"org.jsoup.nodes.Node", "outerHtml", "java.lang.StringBuilder", "<null>"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "\n<!----> {getData=}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput230() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Node", "org.jsoup.nodes.Comment", "outerHtml", new String[]{}, new String[]{}, false, 5, new String[][]{});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("\n<!--0-->", String.valueOf(actual));
  assertEquals("receiver state after the call", "\n<!--0--> {getData=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput231() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jsoup.nodes.Node", "org.jsoup.nodes.Comment", "doClone", new String[]{"org.jsoup.nodes.Node"}, new String[]{"<sample:8>"}, false, 0, new String[][]{{"org.jsoup.nodes.Node", "outerHtmlHead", "java.lang.StringBuilder,int,org.jsoup.nodes.Document$OutputSettings", "<sample:5>", "32", "<sample:3>"}}), new String[][]{{"removeAttr", "java.lang.String", "7"}, {"childNodes", "", "3"}});
  assertNotNull(actual);
  assertEquals("java.util.Collections$UnmodifiableRandomAccessList", actual.getClass().getName());
  assertEquals("[]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "\n<!--a--> {getData=a}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput232() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jsoup.nodes.Node", "org.jsoup.nodes.Comment", "attr", new String[]{"java.lang.String", "java.lang.String"}, new String[]{"0101", "-1.5-1"}, false, 7, new String[][]{{"org.jsoup.nodes.Node", "baseUri", ""}}), new String[][]{{"parent", "", "7"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "\n<!----> {getData=}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput233() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jsoup.nodes.Node", "org.jsoup.nodes.Comment", "childNodes", new String[]{}, new String[]{}, false, 5, new String[][]{{"org.jsoup.nodes.Node", "childNode", "int", "1073741823"}}), new String[][]{{"listIterator", "", "1"}});
  assertNotNull(actual);
  assertEquals("receiver state after the call", "\n<!--0--> {getData=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput234() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jsoup.nodes.Node", "org.jsoup.nodes.Comment", "doClone", new String[]{"org.jsoup.nodes.Node"}, new String[]{"<sample:3>"}, false), new String[][]{{"parent", "", "1"}});
  assertNotNull(actual);
  assertEquals("org.jsoup.nodes.DocumentType", actual.getClass().getName());
  assertEquals("<!DOCTYPE html PUBLIC \"0\" sample\">", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "\n<!--a--> {getData=a}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput235() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Node", "org.jsoup.nodes.Comment", "setSiblingIndex", new String[]{"int"}, new String[]{"2147483647"}, false);
  assertNull(actual);
  assertEquals("receiver state after the call", "\n<!--a--> {getData=a}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput236() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Node", "org.jsoup.nodes.Comment", "outerHtmlTail", new String[]{"java.lang.StringBuilder", "int", "org.jsoup.nodes.Document$OutputSettings"}, new String[]{"<sample:5>", "65538", "<sample:7>"}, false, 3, new String[][]{});
  assertNull(actual);
  assertEquals("receiver state after the call", "\n<!----> {getData=}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput237() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jsoup.nodes.Node", "org.jsoup.nodes.Comment", "doClone", new String[]{"org.jsoup.nodes.Node"}, new String[]{"<sample:2>"}, false), new String[][]{{"wrap", "java.lang.String", "2"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IndexOutOfBoundsException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput238() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Node", "org.jsoup.nodes.Comment", "removeAttr", new String[]{"java.lang.String"}, new String[]{"Titler"}, false);
  assertNotNull(actual);
  assertEquals("org.jsoup.nodes.Comment", actual.getClass().getName());
  assertEquals("\n<!--a--> {getData=a}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "\n<!--a--> {getData=a}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput239() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Node", "org.jsoup.nodes.Comment", "indent", new String[]{"java.lang.StringBuilder", "int", "org.jsoup.nodes.Document$OutputSettings"}, new String[]{"<sample:8>", "6", "<sample:7>"}, false, 5, new String[][]{{"org.jsoup.nodes.Node", "setBaseUri", "java.lang.String", ""}});
  assertNull(actual);
  assertEquals("receiver state after the call", "\n<!--0--> {getData=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput240() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jsoup.nodes.Node", "org.jsoup.nodes.Comment", "doClone", new String[]{"org.jsoup.nodes.Node"}, new String[]{"<sample:9>"}, false, 2, new String[][]{{"org.jsoup.nodes.Node", "childNodesAsArray", ""}}), new String[][]{{"siblingIndex", "", "5"}, {"after", "org.jsoup.nodes.Node", "5"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IndexOutOfBoundsException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput241() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jsoup.nodes.Node", "org.jsoup.nodes.Comment", "removeAttr", new String[]{"java.lang.String"}, new String[]{"a\037b"}, false, 0, new String[][]{{"org.jsoup.nodes.Node", "childNodesAsArray", ""}}), new String[][]{{"attr", "java.lang.String", "4"}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("", String.valueOf(actual));
  assertEquals("receiver state after the call", "\n<!--a--> {getData=a}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput242() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Node", "org.jsoup.nodes.Comment", "setBaseUri", new String[]{"java.lang.String"}, new String[]{"2147483648"}, false, 7, new String[][]{{"org.jsoup.nodes.Node", "hashCode", ""}});
  assertNull(actual);
  assertEquals("receiver state after the call", "\n<!----> {getData=}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput243() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Node", "org.jsoup.nodes.Comment", "parent", new String[]{}, new String[]{}, false, 5, new String[][]{});
  assertNull(actual);
  assertEquals("receiver state after the call", "\n<!--0--> {getData=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput244() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Node", "org.jsoup.nodes.Comment", "addChildren", new String[]{"int", "org.jsoup.nodes.Node[]"}, new String[]{"0", "<sample:1>"}, false);
  assertNull(actual);
  assertEquals("receiver state after the call", "\n<!--a-->\n <#root></#root><!DOCTYPE html PUBLIC \"0\" sample\"> {getData=a}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput245() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jsoup.nodes.Node", "org.jsoup.nodes.Comment", "outerHtml", new String[]{"java.lang.StringBuilder"}, new String[]{"<null>"}, false, 0, new String[][]{{"org.jsoup.nodes.Node", "setParentNode", "org.jsoup.nodes.Node", "<sample:4>"}, {"org.jsoup.nodes.Node", "wrap", "java.lang.String", " 0x123456789"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput246() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Node", "org.jsoup.nodes.Comment", "outerHtml", new String[]{}, new String[]{}, false, 2, new String[][]{});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("\n<!--sample-->", String.valueOf(actual));
  assertEquals("receiver state after the call", "\n<!--sample--> {getData=sample}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput247() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jsoup.nodes.Node", "org.jsoup.nodes.Comment", "childNodes", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.jsoup.nodes.Node", "before", "java.lang.String", "P"}}), new String[][]{{"size", "", "2"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "\n<!--a--> {getData=a}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput248() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jsoup.nodes.Node", "org.jsoup.nodes.Comment", "doClone", new String[]{"org.jsoup.nodes.Node"}, new String[]{"<sample:4>"}, false, 0, new String[][]{{"org.jsoup.nodes.Node", "addChildren", "org.jsoup.nodes.Node[]", "<sample:2>"}}), new String[][]{{"before", "java.lang.String", "7"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput249() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Node", "org.jsoup.nodes.Comment", "toString", new String[]{}, new String[]{}, false, 7, new String[][]{});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("\n<!---->", String.valueOf(actual));
  assertEquals("receiver state after the call", "\n<!----> {getData=}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput250() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jsoup.nodes.Node", "org.jsoup.nodes.Comment", "addChildren", new String[]{"int", "org.jsoup.nodes.Node[]"}, new String[]{"32724", "<null>"}, false, 0, new String[][]{{"org.jsoup.nodes.Node", "equals", "java.lang.Object", "<i:-2147483648>"}, {"org.jsoup.nodes.Node", "equals", "java.lang.Object", "<s:0la>"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput251() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jsoup.nodes.Node", "org.jsoup.nodes.Comment", "attributes", new String[]{}, new String[]{}, false, 2, new String[][]{{"org.jsoup.nodes.Node", "ownerDocument", ""}}), new String[][]{{"put", "java.lang.String,java.lang.String", "5"}});
  assertNotNull(actual);
  assertEquals("org.jsoup.nodes.Attributes", actual.getClass().getName());
  assertEquals(" comment=\"sample\" a=\"0\" {size=2}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "\n<!--sample--> {getData=sample}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput252() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Node", "org.jsoup.nodes.Comment", "toString", new String[]{}, new String[]{}, false, 5, new String[][]{{"org.jsoup.nodes.Node", "parent", ""}, {"org.jsoup.nodes.Node", "equals", "java.lang.Object", "<i:2>"}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("\n<!--0-->", String.valueOf(actual));
  assertEquals("receiver state after the call", "\n<!--0--> {getData=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput253() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Node", "org.jsoup.nodes.Comment", "nodeName", new String[]{}, new String[]{}, false, 2, new String[][]{{"org.jsoup.nodes.Node", "childNode", "int", "32662"}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("#comment", String.valueOf(actual));
  assertEquals("receiver state after the call", "\n<!--sample--> {getData=sample}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput254() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Node", "org.jsoup.nodes.Comment", "attributes", new String[]{}, new String[]{}, false, 0, null, 3);
  assertNotNull(actual);
  assertEquals("org.jsoup.nodes.Attributes", actual.getClass().getName());
  assertEquals(" comment=\"a\" {size=1}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "\n<!--a--> {getData=a}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput255() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jsoup.nodes.Node", "org.jsoup.nodes.Comment", "doClone", new String[]{"org.jsoup.nodes.Node"}, new String[]{"<sample:7>"}, false, 1, new String[][]{{"org.jsoup.nodes.Node", "baseUri", ""}, {"org.jsoup.nodes.Node", "absUrl", "java.lang.String", "aaabaaaaaaaaaaaaaaaaaaaaaaaaa"}}, 2), new String[][]{{"wrap", "java.lang.String", "3"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput256() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jsoup.nodes.Node", "org.jsoup.nodes.Comment", "removeAttr", new String[]{"java.lang.String"}, new String[]{"1.10345678null"}, false), new String[][]{{"childNodes", "", "5"}});
  assertNotNull(actual);
  assertEquals("java.util.Collections$UnmodifiableRandomAccessList", actual.getClass().getName());
  assertEquals("[]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "\n<!--a--> {getData=a}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput257() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jsoup.nodes.Node", "org.jsoup.nodes.Comment", "previousSibling", new String[]{}, new String[]{}, false, 6, new String[][]{{"org.jsoup.nodes.Node", "attributes", ""}}, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput258() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Node", "org.jsoup.nodes.Comment", "doClone", new String[]{"org.jsoup.nodes.Node"}, new String[]{"<sample:1>"}, false, 2, new String[][]{}, 1);
  assertNotNull(actual);
  assertEquals("org.jsoup.nodes.Comment", actual.getClass().getName());
  assertEquals("\n<!--sample--> {getData=sample}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "\n<!--sample--> {getData=sample}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput259() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Node", "org.jsoup.nodes.Comment", "outerHtmlHead", new String[]{"java.lang.StringBuilder", "int", "org.jsoup.nodes.Document$OutputSettings"}, new String[]{"<sample:2>", "65538", "<sample:0>"}, false, 2, new String[][]{});
  assertNull(actual);
  assertEquals("receiver state after the call", "\n<!--sample--> {getData=sample}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput260() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Node", "org.jsoup.nodes.Comment", "nextSibling", new String[]{}, new String[]{}, false, 2, new String[][]{});
  assertNull(actual);
  assertEquals("receiver state after the call", "\n<!--sample--> {getData=sample}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput261() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Node", "org.jsoup.nodes.Comment", "indent", new String[]{"java.lang.StringBuilder", "int", "org.jsoup.nodes.Document$OutputSettings"}, new String[]{"<sample:5>", "32763", "<sample:1>"}, false, 0, null, 2);
  assertNull(actual);
  assertEquals("receiver state after the call", "\n<!--a--> {getData=a}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput262() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jsoup.nodes.Node", "org.jsoup.nodes.Comment", "doClone", new String[]{"org.jsoup.nodes.Node"}, new String[]{"<sample:6>"}, false, 0, new String[][]{{"org.jsoup.nodes.Node", "addChildren", "org.jsoup.nodes.Node[]", "<sample:0>"}}), new String[][]{{"attributes", "", "0"}});
  assertNotNull(actual);
  assertEquals("org.jsoup.nodes.Attributes", actual.getClass().getName());
  assertEquals(" comment=\"a\" {size=1}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "\n<!--a-->a {getData=a}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput263() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jsoup.nodes.Node", "org.jsoup.nodes.Comment", "childNode", new String[]{"int"}, new String[]{"16354"}, false, 5, new String[][]{{"org.jsoup.nodes.Node", "indent", "java.lang.StringBuilder,int,org.jsoup.nodes.Document$OutputSettings", "<sample:8>", "22", "<sample:4>"}, {"org.jsoup.nodes.Node", "attributes", ""}}, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IndexOutOfBoundsException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput264() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Node", "org.jsoup.nodes.Comment", "nodeName", new String[]{}, new String[]{}, false, 6, new String[][]{{"org.jsoup.nodes.Node", "addChildren", "org.jsoup.nodes.Node[]", "<sample:0>"}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("#comment", String.valueOf(actual));
  assertEquals("receiver state after the call", "\n<!--a-->a {getData=a}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput265() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Node", "org.jsoup.nodes.Comment", "indent", new String[]{"java.lang.StringBuilder", "int", "org.jsoup.nodes.Document$OutputSettings"}, new String[]{"<sample:4>", "32769", "<sample:1>"}, false, 0, new String[][]{{"org.jsoup.nodes.Node", "indent", "java.lang.StringBuilder,int,org.jsoup.nodes.Document$OutputSettings", "<sample:1>", "-513", "<sample:7>"}}, 1);
  assertNull(actual);
  assertEquals("receiver state after the call", "\n<!--a--> {getData=a}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput266() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Node", "org.jsoup.nodes.Comment", "baseUri", new String[]{}, new String[]{}, false, 1, new String[][]{{"org.jsoup.nodes.Node", "previousSibling", ""}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("sample", String.valueOf(actual));
  assertEquals("receiver state after the call", "\n<!--0--> {getData=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput267() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jsoup.nodes.Node", "org.jsoup.nodes.Comment", "attributes", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.jsoup.nodes.Node", "addChildren", "org.jsoup.nodes.Node[]", "<sample:0>"}, {"org.jsoup.nodes.Node", "addChildren", "int,org.jsoup.nodes.Node[]", "2147483647", "<null>"}}), new String[][]{{"remove", "java.lang.String", "1"}});
  assertNotNull(actual);
  assertEquals("org.jsoup.nodes.Attributes", actual.getClass().getName());
  assertEquals(" comment=\"a\" {size=1}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "\n<!--a-->a {getData=a}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput268() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jsoup.nodes.Node", "org.jsoup.nodes.Comment", "indent", new String[]{"java.lang.StringBuilder", "int", "org.jsoup.nodes.Document$OutputSettings"}, new String[]{"<sample:7>", "-2147483647", "<sample:2>"}, false, 0, new String[][]{{"org.jsoup.nodes.Node", "hashCode", ""}}, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput269() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Node", "org.jsoup.nodes.Comment", "attr", new String[]{"java.lang.String"}, new String[]{"}14.55"}, false, 2, new String[][]{});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("", String.valueOf(actual));
  assertEquals("receiver state after the call", "\n<!--sample--> {getData=sample}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput270() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jsoup.nodes.Node", "org.jsoup.nodes.Comment", "doClone", new String[]{"org.jsoup.nodes.Node"}, new String[]{"<sample:11>"}, false, 0, new String[][]{{"org.jsoup.nodes.Node", "addChildren", "int,org.jsoup.nodes.Node[]", "-2147483648", "<empty>"}}, 2), new String[][]{{"remove", "", "6"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.UnsupportedOperationException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput271() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Node", "org.jsoup.nodes.Comment", "setSiblingIndex", new String[]{"int"}, new String[]{"2147483647"}, false, 2, new String[][]{});
  assertNull(actual);
  assertEquals("receiver state after the call", "\n<!--sample--> {getData=sample}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput272() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jsoup.nodes.Node", "org.jsoup.nodes.Comment", "outerHtmlHead", new String[]{"java.lang.StringBuilder", "int", "org.jsoup.nodes.Document$OutputSettings"}, new String[]{"<sample:8>", "2147483647", "<null>"}, false, 0, new String[][]{{"org.jsoup.nodes.Node", "absUrl", "java.lang.String", "02:30:45"}}, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput273() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jsoup.nodes.Node", "org.jsoup.nodes.Comment", "addChildren", new String[]{"int", "org.jsoup.nodes.Node[]"}, new String[]{"268435456", "<sample:3>"}, false, 2, new String[][]{{"org.jsoup.nodes.Node", "baseUri", ""}}, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IndexOutOfBoundsException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput274() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Node", "org.jsoup.nodes.Comment", "baseUri", new String[]{}, new String[]{}, false, 2, new String[][]{{"org.jsoup.nodes.Node", "previousSibling", ""}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("", String.valueOf(actual));
  assertEquals("receiver state after the call", "\n<!--sample--> {getData=sample}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput275() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Node", "org.jsoup.nodes.Comment", "nodeName", new String[]{}, new String[]{}, false, 1, new String[][]{}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("#comment", String.valueOf(actual));
  assertEquals("receiver state after the call", "\n<!--0--> {getData=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput276() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jsoup.nodes.Node", "org.jsoup.nodes.Comment", "after", new String[]{"java.lang.String"}, new String[]{"ntlm"}, false, 0, new String[][]{{"org.jsoup.nodes.Node", "addChildren", "org.jsoup.nodes.Node[]", "<sample:3>"}}, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput277() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Node", "org.jsoup.nodes.Comment", "outerHtmlHead", new String[]{"java.lang.StringBuilder", "int", "org.jsoup.nodes.Document$OutputSettings"}, new String[]{"<sample:3>", "0", "<sample:3>"}, false, 0, new String[][]{{"org.jsoup.nodes.Node", "replaceChild", "org.jsoup.nodes.Node,org.jsoup.nodes.Node", "<sample:9>", "<sample:1>"}}, 2);
  assertNull(actual);
  assertEquals("receiver state after the call", "\n<!--a--> {getData=a}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput278() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Node", "org.jsoup.nodes.Comment", "hashCode", new String[]{}, new String[]{}, false, 2, new String[][]{{"org.jsoup.nodes.Node", "hashCode", ""}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("-1652900492", String.valueOf(actual));
  assertEquals("receiver state after the call", "\n<!--sample--> {getData=sample}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput279() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jsoup.nodes.Node", "org.jsoup.nodes.Comment", "attributes", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.jsoup.nodes.Node", "addChildren", "org.jsoup.nodes.Node[]", "<sample:2>"}, {"org.jsoup.nodes.Node", "outerHtml", "java.lang.StringBuilder", "<empty>"}}), new String[][]{{"html", "", "1"}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals(" comment=\"a\"", String.valueOf(actual));
  assertEquals("receiver state after the call", "\n<!--a--><!DOCTYPE html PUBLIC \"0\" sample\">\n <!--a-->a {getData=a}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput280() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Node", "org.jsoup.nodes.Comment", "ownerDocument", new String[]{}, new String[]{}, false, 2, new String[][]{{"org.jsoup.nodes.Node", "ownerDocument", ""}, {"org.jsoup.nodes.Node", "remove", ""}});
  assertNull(actual);
  assertEquals("receiver state after the call", "\n<!--sample--> {getData=sample}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput281() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jsoup.nodes.Node", "org.jsoup.nodes.Comment", "doClone", new String[]{"org.jsoup.nodes.Node"}, new String[]{"<sample:5>"}, false, 0, new String[][]{{"org.jsoup.nodes.Node", "removeChild", "org.jsoup.nodes.Node", "<sample:5>"}}, 1), new String[][]{{"before", "org.jsoup.nodes.Node", "2"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.UnsupportedOperationException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput282() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Node", "org.jsoup.nodes.Comment", "hashCode", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.jsoup.nodes.Node", "attr", "java.lang.String,java.lang.String", "/a/b", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("-410509541", String.valueOf(actual));
  assertEquals("receiver state after the call", "\n<!--a--> {getData=a}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput283() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jsoup.nodes.Node", "org.jsoup.nodes.Comment", "doClone", new String[]{"org.jsoup.nodes.Node"}, new String[]{"<sample:9>"}, false, 0, new String[][]{{"org.jsoup.nodes.Node", "addChildren", "org.jsoup.nodes.Node[]", "<sample:5>"}}), new String[][]{{"outerHtml", "", "0"}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("\n<!--a-->\n <!--a-->\n <!--0-->\n <!--a-->", String.valueOf(actual));
  assertEquals("receiver state after the call", "\n<!--a-->\n <!--a-->\n <!--0-->\n <!--a--> {getData=a}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput284() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Node", "org.jsoup.nodes.Comment", "equals", new String[]{"java.lang.Object"}, new String[]{"<i:-4194303>"}, false, 2, new String[][]{}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "\n<!--sample--> {getData=sample}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput285() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jsoup.nodes.Node", "org.jsoup.nodes.Comment", "replaceChild", new String[]{"org.jsoup.nodes.Node", "org.jsoup.nodes.Node"}, new String[]{"<null>", "<sample:5>"}, false, 6, new String[][]{}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput286() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Node", "org.jsoup.nodes.Comment", "outerHtmlTail", new String[]{"java.lang.StringBuilder", "int", "org.jsoup.nodes.Document$OutputSettings"}, new String[]{"<sample:1>", "2147483647", "<sample:5>"}, false, 0, new String[][]{{"org.jsoup.nodes.Node", "doClone", "org.jsoup.nodes.Node", "<sample:4>"}}, 3);
  assertNull(actual);
  assertEquals("receiver state after the call", "\n<!--a--> {getData=a}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput287() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jsoup.nodes.Node", "org.jsoup.nodes.Comment", "doClone", new String[]{"org.jsoup.nodes.Node"}, new String[]{"<sample:3>"}, false, 6, new String[][]{{"org.jsoup.nodes.Node", "after", "java.lang.String", "0x123556789"}}, 2), new String[][]{{"nodeName", "", "6"}, {"childNodes", "", "1"}});
  assertNotNull(actual);
  assertEquals("java.util.Collections$UnmodifiableRandomAccessList", actual.getClass().getName());
  assertEquals("[]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "\n<!--a--> {getData=a}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput288() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Node", "org.jsoup.nodes.Comment", "nextSibling", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.jsoup.nodes.Node", "baseUri", ""}}, 1);
  assertNull(actual);
  assertEquals("receiver state after the call", "\n<!--a--> {getData=a}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput289() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jsoup.nodes.Node", "org.jsoup.nodes.Comment", "clone", new String[]{}, new String[]{}, false), new String[][]{{"nextSibling", "", "6"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "\n<!--a--> {getData=a}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput290() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Node", "org.jsoup.nodes.Comment", "addChildren", new String[]{"int", "org.jsoup.nodes.Node[]"}, new String[]{"-32709", "<empty>"}, false, 2, new String[][]{}, 3);
  assertNull(actual);
  assertEquals("receiver state after the call", "\n<!--sample--> {getData=sample}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput291() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jsoup.nodes.Node", "org.jsoup.nodes.Comment", "clone", new String[]{}, new String[]{}, false), new String[][]{{"attributes", "", "2"}, {"addAll", "org.jsoup.nodes.Attributes", "6"}});
  assertNotNull(actual);
  assertEquals("org.jsoup.nodes.Attributes", actual.getClass().getName());
  assertEquals(" comment=\"a\" {size=1}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "\n<!--a--> {getData=a}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput292() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jsoup.nodes.Node", "org.jsoup.nodes.Comment", "removeAttr", new String[]{"java.lang.String"}, new String[]{"aaaaaaaaabaaaaaaaaaaaaaaaaaaa"}, false), new String[][]{{"baseUri", "", "4"}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "\n<!--a--> {getData=a}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput293() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Node", "org.jsoup.nodes.Comment", "doClone", new String[]{"org.jsoup.nodes.Node"}, new String[]{"<sample:8>"}, false, 2, new String[][]{}, 2);
  assertNotNull(actual);
  assertEquals("org.jsoup.nodes.Comment", actual.getClass().getName());
  assertEquals("\n<!--sample--> {getData=sample}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "\n<!--sample--> {getData=sample}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput294() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Node", "org.jsoup.nodes.Comment", "attributes", new String[]{}, new String[]{}, false, 5, new String[][]{}, 2);
  assertNotNull(actual);
  assertEquals("org.jsoup.nodes.Attributes", actual.getClass().getName());
  assertEquals(" comment=\"0\" {size=1}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "\n<!--0--> {getData=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput295() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Node", "org.jsoup.nodes.Comment", "ownerDocument", new String[]{}, new String[]{}, false, 2, new String[][]{}, 2);
  assertNull(actual);
  assertEquals("receiver state after the call", "\n<!--sample--> {getData=sample}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput296() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jsoup.nodes.Node", "org.jsoup.nodes.Comment", "siblingNodes", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.jsoup.nodes.Node", "remove", ""}}, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput297() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Node", "org.jsoup.nodes.Comment", "removeAttr", new String[]{"java.lang.String"}, new String[]{"1.5?1.25"}, false, 2, new String[][]{});
  assertNotNull(actual);
  assertEquals("org.jsoup.nodes.Comment", actual.getClass().getName());
  assertEquals("\n<!--sample--> {getData=sample}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "\n<!--sample--> {getData=sample}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput298() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jsoup.nodes.Node", "org.jsoup.nodes.Comment", "attributes", new String[]{}, new String[]{}, false, 6, new String[][]{{"org.jsoup.nodes.Node", "absUrl", "java.lang.String", "aaaaaaaaaaaaaaaaaaaaaaaaaaaaa"}}, 2), new String[][]{{"clone", "", "0"}, {"addAll", "org.jsoup.nodes.Attributes", "2"}});
  assertNotNull(actual);
  assertEquals("org.jsoup.nodes.Attributes", actual.getClass().getName());
  assertEquals(" comment=\"a\" <a><b>t</b></a>=\"{&quot;a&quot;:1}\" {size=2}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "\n<!--a--> {getData=a}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput299() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Node", "org.jsoup.nodes.Comment", "hashCode", new String[]{}, new String[]{}, false, 6, new String[][]{}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("193240891", String.valueOf(actual));
  assertEquals("receiver state after the call", "\n<!--a--> {getData=a}", SearchInputFactory_scaffolding.receiverState());
 }
}
