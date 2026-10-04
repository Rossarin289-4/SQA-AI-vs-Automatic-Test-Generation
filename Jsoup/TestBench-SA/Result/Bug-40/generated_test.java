package generated.algorithm;

import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;
import static org.junit.Assert.*;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class SimulatedAnnealingGeneratedTest {
 @Test(timeout = 20000)
 public void generatedInput000() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.DocumentType", "org.jsoup.nodes.DocumentType", "outerHtml", new String[]{}, new String[]{}, false, 3, new String[][]{{"org.jsoup.nodes.DocumentType", "childNodesAsArray", ""}, {"org.jsoup.nodes.DocumentType", "addChildren", "org.jsoup.nodes.Node[]", "<sample:1>"}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("<!DOCTYPE PUBLIC \"a\" \"0\">\n <#root></#root><!DOCTYPE a PUBLIC \"0\" \"sample\">", String.valueOf(actual));
  assertEquals("receiver state after the call", "<!DOCTYPE>\n <#root></#root><!DOCTYPE a>", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput001() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.DocumentType", "org.jsoup.nodes.DocumentType", "getOutputSettings", new String[]{}, new String[]{}, false, 10, new String[][]{}, 3);
  assertNotNull(actual);
  assertEquals("org.jsoup.nodes.Document$OutputSettings", actual.getClass().getName());
  assertEquals("receiver state after the call", "<!DOCTYPE sample \"a\">", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput002() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.DocumentType", "org.jsoup.nodes.DocumentType", "getOutputSettings", new String[]{}, new String[]{}, false, 11, new String[][]{{"org.jsoup.nodes.DocumentType", "clone", ""}}, 3);
  assertNotNull(actual);
  assertEquals("org.jsoup.nodes.Document$OutputSettings", actual.getClass().getName());
  assertEquals("receiver state after the call", "<!DOCTYPE PUBLIC \"a\" \"0\">", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput003() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.DocumentType", "org.jsoup.nodes.DocumentType", "getOutputSettings", new String[]{}, new String[]{}, false, 12, new String[][]{}, 3);
  assertNotNull(actual);
  assertEquals("org.jsoup.nodes.Document$OutputSettings", actual.getClass().getName());
  assertEquals("receiver state after the call", "<!DOCTYPE a PUBLIC \"0\" \"sample\">", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput004() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.DocumentType", "org.jsoup.nodes.DocumentType", "getOutputSettings", new String[]{}, new String[]{}, false, 12, new String[][]{{"org.jsoup.nodes.DocumentType", "addChildren", "org.jsoup.nodes.Node[]", "<sample:0>"}}, 3);
  assertNotNull(actual);
  assertEquals("org.jsoup.nodes.Document$OutputSettings", actual.getClass().getName());
  assertEquals("receiver state after the call", "<!DOCTYPE a PUBLIC \"0\" \"sample\">a", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput005() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.DocumentType", "org.jsoup.nodes.DocumentType", "getOutputSettings", new String[]{}, new String[]{}, false, 13, new String[][]{{"org.jsoup.nodes.DocumentType", "addChildren", "org.jsoup.nodes.Node[]", "<sample:0>"}}, 3);
  assertNotNull(actual);
  assertEquals("org.jsoup.nodes.Document$OutputSettings", actual.getClass().getName());
  assertEquals("receiver state after the call", "<!DOCTYPE 0 PUBLIC \"sample\">a", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput006() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jsoup.nodes.DocumentType", "org.jsoup.nodes.DocumentType", "getOutputSettings", new String[]{}, new String[]{}, false, 13, new String[][]{{"org.jsoup.nodes.DocumentType", "doClone", "org.jsoup.nodes.Node", "<sample:2>"}, {"org.jsoup.nodes.DocumentType", "addChildren", "org.jsoup.nodes.Node[]", "<sample:0>"}}, 3), new String[][]{{"outline", "", "2"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "<!DOCTYPE 0 PUBLIC \"sample\">a", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput007() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jsoup.nodes.DocumentType", "org.jsoup.nodes.DocumentType", "indent", new String[]{"java.lang.StringBuilder", "int", "org.jsoup.nodes.Document$OutputSettings"}, new String[]{"<sample:1>", "-57", "<sample:7>"}, false, 11, new String[][]{{"org.jsoup.nodes.DocumentType", "hashCode", ""}, {"org.jsoup.nodes.DocumentType", "replaceWith", "org.jsoup.nodes.Node", "<sample:6>"}}, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput008() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.DocumentType", "org.jsoup.nodes.DocumentType", "setParentNode", new String[]{"org.jsoup.nodes.Node"}, new String[]{"<sample:7>"}, false, 0, new String[][]{{"org.jsoup.nodes.DocumentType", "setSiblingIndex", "int", "1"}, {"org.jsoup.nodes.DocumentType", "addChildren", "int,org.jsoup.nodes.Node[]", "2147483647", "<sample:1>"}}, 1);
  assertNull(actual);
  assertEquals("receiver state after the call", "<!DOCTYPE a>", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput009() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jsoup.nodes.DocumentType", "org.jsoup.nodes.DocumentType", "replaceWith", new String[]{"org.jsoup.nodes.Node"}, new String[]{"<sample:5>"}, false, 0, null, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput010() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.DocumentType", "org.jsoup.nodes.DocumentType", "baseUri", new String[]{}, new String[]{}, false, 1, new String[][]{}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("a", String.valueOf(actual));
  assertEquals("receiver state after the call", "<!DOCTYPE 0 PUBLIC \"sample\">", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput011() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.DocumentType", "org.jsoup.nodes.DocumentType", "baseUri", new String[]{}, new String[]{}, false, 2, new String[][]{}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "<!DOCTYPE sample \"a\">", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput012() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.DocumentType", "org.jsoup.nodes.DocumentType", "baseUri", new String[]{}, new String[]{}, false, 3, new String[][]{}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("sample", String.valueOf(actual));
  assertEquals("receiver state after the call", "<!DOCTYPE PUBLIC \"a\" \"0\">", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput013() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.DocumentType", "org.jsoup.nodes.DocumentType", "baseUri", new String[]{}, new String[]{}, false, 4, new String[][]{{"org.jsoup.nodes.DocumentType", "attr", "java.lang.String", "\t"}, {"org.jsoup.nodes.DocumentType", "childNodeSize", ""}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("", String.valueOf(actual));
  assertEquals("receiver state after the call", "<!DOCTYPE a PUBLIC \"0\" \"sample\">", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput014() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.DocumentType", "org.jsoup.nodes.DocumentType", "addChildren", new String[]{"org.jsoup.nodes.Node[]"}, new String[]{"<sample:1>"}, false, 14, new String[][]{{"org.jsoup.nodes.DocumentType", "indent", "java.lang.StringBuilder,int,org.jsoup.nodes.Document$OutputSettings", "<sample:3>", "-2147483648", "<sample:6>"}}, 3);
  assertNull(actual);
  assertEquals("receiver state after the call", "<!DOCTYPE sample \"a\">\n <#root></#root><!DOCTYPE a PUBLIC \"0\" \"sample\">", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput015() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jsoup.nodes.DocumentType", "org.jsoup.nodes.DocumentType", "addChildren", new String[]{"org.jsoup.nodes.Node[]"}, new String[]{"<null>"}, false, 14, new String[][]{{"org.jsoup.nodes.DocumentType", "indent", "java.lang.StringBuilder,int,org.jsoup.nodes.Document$OutputSettings", "<sample:3>", "-2147483648", "<sample:6>"}}, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput016() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.DocumentType", "org.jsoup.nodes.DocumentType", "addChildren", new String[]{"org.jsoup.nodes.Node[]"}, new String[]{"<sample:0>"}, false, 14, new String[][]{{"org.jsoup.nodes.DocumentType", "indent", "java.lang.StringBuilder,int,org.jsoup.nodes.Document$OutputSettings", "<sample:3>", "-2147483648", "<sample:6>"}}, 3);
  assertNull(actual);
  assertEquals("receiver state after the call", "<!DOCTYPE sample \"a\">a", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput017() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.DocumentType", "org.jsoup.nodes.DocumentType", "addChildren", new String[]{"org.jsoup.nodes.Node[]"}, new String[]{"<sample:2>"}, false, 14, new String[][]{{"org.jsoup.nodes.DocumentType", "indent", "java.lang.StringBuilder,int,org.jsoup.nodes.Document$OutputSettings", "<sample:3>", "-2147483648", "<sample:6>"}}, 3);
  assertNull(actual);
  assertEquals("receiver state after the call", "<!DOCTYPE sample \"a\"><!DOCTYPE a PUBLIC \"0\" \"sample\">\n <!--a-->a", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput018() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.DocumentType", "org.jsoup.nodes.DocumentType", "addChildren", new String[]{"org.jsoup.nodes.Node[]"}, new String[]{"<sample:2>"}, false, 1, new String[][]{{"org.jsoup.nodes.DocumentType", "indent", "java.lang.StringBuilder,int,org.jsoup.nodes.Document$OutputSettings", "<sample:3>", "-2147483648", "<sample:6>"}}, 3);
  assertNull(actual);
  assertEquals("receiver state after the call", "<!DOCTYPE 0 PUBLIC \"sample\"><!DOCTYPE a PUBLIC \"0\" \"sample\">\n <!--a-->a", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput019() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.DocumentType", "org.jsoup.nodes.DocumentType", "addChildren", new String[]{"org.jsoup.nodes.Node[]"}, new String[]{"<sample:2>"}, false, 7, new String[][]{}, 3);
  assertNull(actual);
  assertEquals("receiver state after the call", "<!DOCTYPE PUBLIC \"a\" \"0\"><!DOCTYPE a PUBLIC \"0\" \"sample\">\n <!--a-->a", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput020() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jsoup.nodes.DocumentType", "org.jsoup.nodes.DocumentType", "after", new String[]{"org.jsoup.nodes.Node"}, new String[]{"<sample:3>"}, false, 0, null, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput021() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jsoup.nodes.DocumentType", "org.jsoup.nodes.DocumentType", "siblingNodes", new String[]{}, new String[]{}, false, 4, new String[][]{}, 3), new String[][]{{"remove", "int", "4"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.UnsupportedOperationException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput022() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jsoup.nodes.DocumentType", "org.jsoup.nodes.DocumentType", "removeChild", new String[]{"org.jsoup.nodes.Node"}, new String[]{"<sample:5>"}, false, 0, new String[][]{{"org.jsoup.nodes.DocumentType", "attr", "java.lang.String,java.lang.String", "systemId", "publicId"}, {"org.jsoup.nodes.DocumentType", "removeAttr", "java.lang.String", "0.12345678"}}, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput023() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.DocumentType", "org.jsoup.nodes.DocumentType", "attr", new String[]{"java.lang.String"}, new String[]{""}, false, 0, null, 3);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("", String.valueOf(actual));
  assertEquals("receiver state after the call", "<!DOCTYPE a PUBLIC \"0\" \"sample\">", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput024() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.DocumentType", "org.jsoup.nodes.DocumentType", "setSiblingIndex", new String[]{"int"}, new String[]{"2147483647"}, false, 0, null, 1);
  assertNull(actual);
  assertEquals("receiver state after the call", "<!DOCTYPE a>", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput025() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.DocumentType", "org.jsoup.nodes.DocumentType", "ownerDocument", new String[]{}, new String[]{}, false, 0, null, 3);
  assertNull(actual);
  assertEquals("receiver state after the call", "<!DOCTYPE a PUBLIC \"0\" \"sample\">", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput026() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.DocumentType", "org.jsoup.nodes.DocumentType", "ownerDocument", new String[]{}, new String[]{}, false, 9, new String[][]{}, 3);
  assertNull(actual);
  assertEquals("receiver state after the call", "<!DOCTYPE 0 PUBLIC \"sample\">", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput027() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.DocumentType", "org.jsoup.nodes.DocumentType", "setSiblingIndex", new String[]{"int"}, new String[]{"50"}, false, 0, null, 3);
  assertNull(actual);
  assertEquals("receiver state after the call", "<!DOCTYPE a PUBLIC \"0\" \"sample\">", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput028() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jsoup.nodes.DocumentType", "org.jsoup.nodes.DocumentType", "wrap", new String[]{"java.lang.String"}, new String[]{"-0.0"}, false, 7, new String[][]{{"org.jsoup.nodes.DocumentType", "baseUri", ""}}, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput029() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.DocumentType", "org.jsoup.nodes.DocumentType", "absUrl", new String[]{"java.lang.String"}, new String[]{"a"}, false, 9, new String[][]{{"org.jsoup.nodes.DocumentType", "attr", "java.lang.String,java.lang.String", "2147483648", "Z1,]"}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("", String.valueOf(actual));
  assertEquals("receiver state after the call", "<!DOCTYPE 0 PUBLIC \"sample\">", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput030() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jsoup.nodes.DocumentType", "org.jsoup.nodes.DocumentType", "absUrl", new String[]{"java.lang.String"}, new String[]{""}, false, 9, new String[][]{{"org.jsoup.nodes.DocumentType", "attr", "java.lang.String,java.lang.String", "2147483648", "Z1,]"}}, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput031() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.DocumentType", "org.jsoup.nodes.DocumentType", "absUrl", new String[]{"java.lang.String"}, new String[]{"W"}, false, 7, new String[][]{{"org.jsoup.nodes.DocumentType", "attr", "java.lang.String,java.lang.String", "214474836448", "Z1,]"}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("", String.valueOf(actual));
  assertEquals("receiver state after the call", "<!DOCTYPE PUBLIC \"a\" \"0\">", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput032() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.DocumentType", "org.jsoup.nodes.DocumentType", "absUrl", new String[]{"java.lang.String"}, new String[]{"systemIeTITLE"}, false, 7, new String[][]{}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("", String.valueOf(actual));
  assertEquals("receiver state after the call", "<!DOCTYPE>", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput033() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.DocumentType", "org.jsoup.nodes.DocumentType", "absUrl", new String[]{"java.lang.String"}, new String[]{"systmIeTITTLE"}, false, 9, new String[][]{}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("", String.valueOf(actual));
  assertEquals("receiver state after the call", "<!DOCTYPE 0>", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput034() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.DocumentType", "org.jsoup.nodes.DocumentType", "absUrl", new String[]{"java.lang.String"}, new String[]{"s1stmIeTITULE"}, false, 8, new String[][]{{"org.jsoup.nodes.DocumentType", "before", "org.jsoup.nodes.Node", "<sample:7>"}, {"org.jsoup.nodes.DocumentType", "doClone", "org.jsoup.nodes.Node", "<sample:7>"}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("", String.valueOf(actual));
  assertEquals("receiver state after the call", "<!DOCTYPE a>", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput035() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jsoup.nodes.DocumentType", "org.jsoup.nodes.DocumentType", "after", new String[]{"java.lang.String"}, new String[]{""}, false, 0, null, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput036() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.DocumentType", "org.jsoup.nodes.DocumentType", "siblingNodes", new String[]{}, new String[]{}, false, 0, null, 2);
  assertNotNull(actual);
  assertEquals("java.util.Collections$EmptyList", actual.getClass().getName());
  assertEquals("[]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "<!DOCTYPE a PUBLIC \"0\" \"sample\">", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput037() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jsoup.nodes.DocumentType", "org.jsoup.nodes.DocumentType", "siblingNodes", new String[]{}, new String[]{}, false, 0, null, 2), new String[][]{{"size", "", "4"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "<!DOCTYPE a PUBLIC \"0\" \"sample\">", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput038() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jsoup.nodes.DocumentType", "org.jsoup.nodes.DocumentType", "siblingNodes", new String[]{}, new String[]{}, false, 1, new String[][]{}, 2), new String[][]{{"size", "", "4"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "<!DOCTYPE 0 PUBLIC \"sample\">", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput039() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jsoup.nodes.DocumentType", "org.jsoup.nodes.DocumentType", "siblingNodes", new String[]{}, new String[]{}, false, 2, new String[][]{}, 2), new String[][]{{"size", "", "4"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "<!DOCTYPE sample \"a\">", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput040() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jsoup.nodes.DocumentType", "org.jsoup.nodes.DocumentType", "siblingNodes", new String[]{}, new String[]{}, false, 3, new String[][]{}, 2), new String[][]{{"size", "", "4"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "<!DOCTYPE PUBLIC \"a\" \"0\">", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput041() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jsoup.nodes.DocumentType", "org.jsoup.nodes.DocumentType", "siblingNodes", new String[]{}, new String[]{}, false, 19, new String[][]{{"org.jsoup.nodes.DocumentType", "attributes", ""}}, 2), new String[][]{{"add", "int,java.lang.Object", "0"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.UnsupportedOperationException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput042() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.DocumentType", "org.jsoup.nodes.DocumentType", "parentNode", new String[]{}, new String[]{}, false, 17, new String[][]{{"org.jsoup.nodes.DocumentType", "after", "java.lang.String", "5.1.5d"}, {"org.jsoup.nodes.DocumentType", "attr", "java.lang.String", "a,b,c"}}, 3);
  assertNull(actual);
  assertEquals("receiver state after the call", "<!DOCTYPE 0 PUBLIC \"sample\">", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput043() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.DocumentType", "org.jsoup.nodes.DocumentType", "equals", new String[]{"java.lang.Object"}, new String[]{"<s:->"}, false, 3, new String[][]{{"org.jsoup.nodes.DocumentType", "childNode", "int", "1"}, {"org.jsoup.nodes.DocumentType", "childNode", "int", "1"}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "<!DOCTYPE PUBLIC \"a\" \"0\">", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput044() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.DocumentType", "org.jsoup.nodes.DocumentType", "equals", new String[]{"java.lang.Object"}, new String[]{"<s:D->"}, false, 12, new String[][]{{"org.jsoup.nodes.DocumentType", "childNode", "int", "1"}, {"org.jsoup.nodes.DocumentType", "after", "java.lang.String", "1E-5"}, {"org.jsoup.nodes.DocumentType", "childNode", "int", "-52"}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "<!DOCTYPE a PUBLIC \"0\" \"sample\">", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput045() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.DocumentType", "org.jsoup.nodes.DocumentType", "equals", new String[]{"java.lang.Object"}, new String[]{"<s:D>"}, false, 9, new String[][]{{"org.jsoup.nodes.DocumentType", "childNode", "int", "1"}, {"org.jsoup.nodes.DocumentType", "after", "java.lang.String", "1E-5"}, {"org.jsoup.nodes.DocumentType", "childNode", "int", "-52"}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "<!DOCTYPE 0 PUBLIC \"sample\">", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput046() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.DocumentType", "org.jsoup.nodes.DocumentType", "parentNode", new String[]{}, new String[]{}, false, 0, null, 2);
  assertNull(actual);
  assertEquals("receiver state after the call", "<!DOCTYPE a PUBLIC \"0\" \"sample\">", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput047() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.DocumentType", "org.jsoup.nodes.DocumentType", "previousSibling", new String[]{}, new String[]{}, false, 1, new String[][]{{"org.jsoup.nodes.DocumentType", "childNodesCopy", ""}}, 2);
  assertNull(actual);
  assertEquals("receiver state after the call", "<!DOCTYPE 0 PUBLIC \"sample\">", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput048() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.DocumentType", "org.jsoup.nodes.DocumentType", "previousSibling", new String[]{}, new String[]{}, false, 2, new String[][]{{"org.jsoup.nodes.DocumentType", "childNodesCopy", ""}}, 2);
  assertNull(actual);
  assertEquals("receiver state after the call", "<!DOCTYPE sample \"a\">", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput049() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.DocumentType", "org.jsoup.nodes.DocumentType", "previousSibling", new String[]{}, new String[]{}, false, 3, new String[][]{{"org.jsoup.nodes.DocumentType", "childNodesCopy", ""}}, 2);
  assertNull(actual);
  assertEquals("receiver state after the call", "<!DOCTYPE PUBLIC \"a\" \"0\">", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput050() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.DocumentType", "org.jsoup.nodes.DocumentType", "previousSibling", new String[]{}, new String[]{}, false, 4, new String[][]{{"org.jsoup.nodes.DocumentType", "childNodesCopy", ""}}, 2);
  assertNull(actual);
  assertEquals("receiver state after the call", "<!DOCTYPE a PUBLIC \"0\" \"sample\">", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput051() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jsoup.nodes.DocumentType", "org.jsoup.nodes.DocumentType", "getOutputSettings", new String[]{}, new String[]{}, false, 8, new String[][]{{"org.jsoup.nodes.DocumentType", "equals", "java.lang.Object", "<s:b>"}, {"org.jsoup.nodes.DocumentType", "hasAttr", "java.lang.String", "1.5e300"}}, 2), new String[][]{{"outline", "boolean", "7"}, {"indentAmount", "", "7"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("1", String.valueOf(actual));
  assertEquals("receiver state after the call", "<!DOCTYPE a PUBLIC \"0\" \"sample\">", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput052() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jsoup.nodes.DocumentType", "org.jsoup.nodes.DocumentType", "getOutputSettings", new String[]{}, new String[]{}, false, 9, new String[][]{{"org.jsoup.nodes.DocumentType", "equals", "java.lang.Object", "<s:b>"}, {"org.jsoup.nodes.DocumentType", "hasAttr", "java.lang.String", "1.5e300"}}, 2), new String[][]{{"outline", "boolean", "7"}, {"indentAmount", "", "7"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("1", String.valueOf(actual));
  assertEquals("receiver state after the call", "<!DOCTYPE 0 PUBLIC \"sample\">", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput053() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jsoup.nodes.DocumentType", "org.jsoup.nodes.DocumentType", "getOutputSettings", new String[]{}, new String[]{}, false, 10, new String[][]{{"org.jsoup.nodes.DocumentType", "equals", "java.lang.Object", "<s:b>"}, {"org.jsoup.nodes.DocumentType", "hasAttr", "java.lang.String", "1.5e300"}}, 2), new String[][]{{"outline", "boolean", "7"}, {"indentAmount", "", "7"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("1", String.valueOf(actual));
  assertEquals("receiver state after the call", "<!DOCTYPE sample \"a\">", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput054() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jsoup.nodes.DocumentType", "org.jsoup.nodes.DocumentType", "getOutputSettings", new String[]{}, new String[]{}, false, 11, new String[][]{{"org.jsoup.nodes.DocumentType", "equals", "java.lang.Object", "<s:b>"}, {"org.jsoup.nodes.DocumentType", "hasAttr", "java.lang.String", "1.5e300"}}, 2), new String[][]{{"outline", "boolean", "7"}, {"indentAmount", "", "7"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("1", String.valueOf(actual));
  assertEquals("receiver state after the call", "<!DOCTYPE PUBLIC \"a\" \"0\">", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput055() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jsoup.nodes.DocumentType", "org.jsoup.nodes.DocumentType", "getOutputSettings", new String[]{}, new String[]{}, false, 12, new String[][]{{"org.jsoup.nodes.DocumentType", "equals", "java.lang.Object", "<s:br>"}, {"org.jsoup.nodes.DocumentType", "hasAttr", "java.lang.String", "1.5eX00"}}, 3), new String[][]{{"outline", "boolean", "7"}, {"indentAmount", "", "7"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("1", String.valueOf(actual));
  assertEquals("receiver state after the call", "<!DOCTYPE a PUBLIC \"0\" \"sample\">", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput056() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jsoup.nodes.DocumentType", "org.jsoup.nodes.DocumentType", "getOutputSettings", new String[]{}, new String[]{}, false, 14, new String[][]{{"org.jsoup.nodes.DocumentType", "doClone", "org.jsoup.nodes.Node", "<sample:2>"}, {"org.jsoup.nodes.DocumentType", "equals", "java.lang.Object", "<s:br>"}, {"org.jsoup.nodes.DocumentType", "hasAttr", "java.lang.String", "1.5eX00"}}, 3), new String[][]{{"outline", "boolean", "7"}, {"indentAmount", "", "7"}, {"syntax", "", "4"}});
  assertNotNull(actual);
  assertEquals("org.jsoup.nodes.Document$OutputSettings$Syntax", actual.getClass().getName());
  assertEquals("html", String.valueOf(actual));
  assertEquals("receiver state after the call", "<!DOCTYPE sample \"a\">", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput057() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jsoup.nodes.DocumentType", "org.jsoup.nodes.DocumentType", "getOutputSettings", new String[]{}, new String[]{}, false, 16, new String[][]{{"org.jsoup.nodes.DocumentType", "doClone", "org.jsoup.nodes.Node", "<sample:2>"}, {"org.jsoup.nodes.DocumentType", "equals", "java.lang.Object", "<s:br>"}}, 1), new String[][]{{"outline", "boolean", "7"}, {"indentAmount", "", "7"}, {"syntax", "", "4"}});
  assertNotNull(actual);
  assertEquals("org.jsoup.nodes.Document$OutputSettings$Syntax", actual.getClass().getName());
  assertEquals("html", String.valueOf(actual));
  assertEquals("receiver state after the call", "<!DOCTYPE a>", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput058() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jsoup.nodes.DocumentType", "org.jsoup.nodes.DocumentType", "getOutputSettings", new String[]{}, new String[]{}, false, 17, new String[][]{{"org.jsoup.nodes.DocumentType", "doClone", "org.jsoup.nodes.Node", "<sample:2>"}, {"org.jsoup.nodes.DocumentType", "equals", "java.lang.Object", "<s:br>"}}, 1), new String[][]{{"outline", "boolean", "7"}, {"indentAmount", "", "7"}, {"syntax", "", "4"}});
  assertNotNull(actual);
  assertEquals("org.jsoup.nodes.Document$OutputSettings$Syntax", actual.getClass().getName());
  assertEquals("html", String.valueOf(actual));
  assertEquals("receiver state after the call", "<!DOCTYPE 0>", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput059() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jsoup.nodes.DocumentType", "org.jsoup.nodes.DocumentType", "getOutputSettings", new String[]{}, new String[]{}, false, 18, new String[][]{{"org.jsoup.nodes.DocumentType", "doClone", "org.jsoup.nodes.Node", "<sample:3>"}, {"org.jsoup.nodes.DocumentType", "equals", "java.lang.Object", "<s:br>"}}, 1), new String[][]{{"outline", "boolean", "7"}, {"indentAmount", "", "7"}, {"syntax", "", "4"}});
  assertNotNull(actual);
  assertEquals("org.jsoup.nodes.Document$OutputSettings$Syntax", actual.getClass().getName());
  assertEquals("html", String.valueOf(actual));
  assertEquals("receiver state after the call", "<!DOCTYPE sample>", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput060() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jsoup.nodes.DocumentType", "org.jsoup.nodes.DocumentType", "getOutputSettings", new String[]{}, new String[]{}, false, 19, new String[][]{{"org.jsoup.nodes.DocumentType", "doClone", "org.jsoup.nodes.Node", "<sample:5>"}, {"org.jsoup.nodes.DocumentType", "equals", "java.lang.Object", "<s:br>"}}, 1), new String[][]{{"outline", "boolean", "7"}, {"indentAmount", "", "7"}, {"syntax", "", "4"}});
  assertNotNull(actual);
  assertEquals("org.jsoup.nodes.Document$OutputSettings$Syntax", actual.getClass().getName());
  assertEquals("html", String.valueOf(actual));
  assertEquals("receiver state after the call", "<!DOCTYPE>", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput061() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jsoup.nodes.DocumentType", "org.jsoup.nodes.DocumentType", "getOutputSettings", new String[]{}, new String[]{}, false, 22, new String[][]{{"org.jsoup.nodes.DocumentType", "doClone", "org.jsoup.nodes.Node", "<sample:5>"}, {"org.jsoup.nodes.DocumentType", "ownerDocument", ""}, {"org.jsoup.nodes.DocumentType", "equals", "java.lang.Object", "<s:br>"}}, 1), new String[][]{{"outline", "boolean", "7"}, {"indentAmount", "", "7"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("1", String.valueOf(actual));
  assertEquals("receiver state after the call", "<!DOCTYPE sample>", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput062() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jsoup.nodes.DocumentType", "org.jsoup.nodes.DocumentType", "getOutputSettings", new String[]{}, new String[]{}, false, 25, new String[][]{{"org.jsoup.nodes.DocumentType", "doClone", "org.jsoup.nodes.Node", "<sample:1>"}, {"org.jsoup.nodes.DocumentType", "equals", "java.lang.Object", "<s::r>"}}, 1), new String[][]{{"outline", "boolean", "7"}});
  assertNotNull(actual);
  assertEquals("org.jsoup.nodes.Document$OutputSettings", actual.getClass().getName());
  assertEquals("receiver state after the call", "<!DOCTYPE 0>", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput063() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jsoup.nodes.DocumentType", "org.jsoup.nodes.DocumentType", "removeAttr", new String[]{"java.lang.String"}, new String[]{"2020-02-330T25:61:61"}, false, 0, new String[][]{{"org.jsoup.nodes.DocumentType", "addChildren", "org.jsoup.nodes.Node[]", "<null>"}}, 3), new String[][]{{"childNodeSize", "", "0"}, {"setBaseUri", "java.lang.String", "6"}, {"before", "org.jsoup.nodes.Node", "5"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput064() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jsoup.nodes.DocumentType", "org.jsoup.nodes.DocumentType", "removeAttr", new String[]{"java.lang.String"}, new String[]{"+1"}, false, 0, null, 3), new String[][]{{"childNodeSize", "", "0"}, {"setBaseUri", "java.lang.String", "6"}});
  assertNotNull(actual);
  assertEquals("org.jsoup.nodes.DocumentType", actual.getClass().getName());
  assertEquals("<!DOCTYPE a PUBLIC \"0\" \"sample\">", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "<!DOCTYPE a PUBLIC \"0\" \"sample\">", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput065() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jsoup.nodes.DocumentType", "org.jsoup.nodes.DocumentType", "removeAttr", new String[]{"java.lang.String"}, new String[]{",1"}, false, 8, new String[][]{{"org.jsoup.nodes.DocumentType", "addChildren", "int,org.jsoup.nodes.Node[]", "1", "<sample:2>"}}, 3), new String[][]{{"childNodeSize", "", "0"}, {"setBaseUri", "java.lang.String", "6"}, {"childNodeSize", "", "7"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "<!DOCTYPE a PUBLIC \"0\" \"sample\">", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput066() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jsoup.nodes.DocumentType", "org.jsoup.nodes.DocumentType", "unwrap", new String[]{}, new String[]{}, false, 3, new String[][]{}, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput067() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jsoup.nodes.DocumentType", "org.jsoup.nodes.DocumentType", "before", new String[]{"org.jsoup.nodes.Node"}, new String[]{"<sample:3>"}, false, 0, null, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput068() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.DocumentType", "org.jsoup.nodes.DocumentType", "attr", new String[]{"java.lang.String", "java.lang.String"}, new String[]{"1L", " \""}, false, 0, new String[][]{{"org.jsoup.nodes.DocumentType", "before", "java.lang.String", "1.25"}, {"org.jsoup.nodes.DocumentType", "indent", "java.lang.StringBuilder,int,org.jsoup.nodes.Document$OutputSettings", "<sample:1>", "1", "<sample:7>"}}, 3);
  assertNotNull(actual);
  assertEquals("org.jsoup.nodes.DocumentType", actual.getClass().getName());
  assertEquals("<!DOCTYPE a PUBLIC \"0\" \"sample\">", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "<!DOCTYPE a PUBLIC \"0\" \"sample\">", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput069() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jsoup.nodes.DocumentType", "org.jsoup.nodes.DocumentType", "attr", new String[]{"java.lang.String", "java.lang.String"}, new String[]{"114", "<!DOCTYPtE"}, false, 0, new String[][]{{"org.jsoup.nodes.DocumentType", "replaceWith", "org.jsoup.nodes.Node", "<sample:2>"}}, 3), new String[][]{{"absUrl", "java.lang.String", "7"}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("", String.valueOf(actual));
  assertEquals("receiver state after the call", "<!DOCTYPE a PUBLIC \"0\" \"sample\">", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput070() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jsoup.nodes.DocumentType", "org.jsoup.nodes.DocumentType", "attr", new String[]{"java.lang.String", "java.lang.String"}, new String[]{"114", "<!DOCTYPtE"}, false, 0, new String[][]{{"org.jsoup.nodes.DocumentType", "replaceWith", "org.jsoup.nodes.Node", "<sample:2>"}, {"org.jsoup.nodes.DocumentType", "addChildren", "org.jsoup.nodes.Node[]", "<sample:2>"}}, 3), new String[][]{{"absUrl", "java.lang.String", "7"}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("", String.valueOf(actual));
  assertEquals("receiver state after the call", "<!DOCTYPE a PUBLIC \"0\" \"sample\"><!DOCTYPE a PUBLIC \"0\" \"sample\">\n <!--a-->a", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput071() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jsoup.nodes.DocumentType", "org.jsoup.nodes.DocumentType", "attr", new String[]{"java.lang.String", "java.lang.String"}, new String[]{"114", "<!DOCTYPtE"}, false, 0, new String[][]{{"org.jsoup.nodes.DocumentType", "replaceWith", "org.jsoup.nodes.Node", "<sample:2>"}, {"org.jsoup.nodes.DocumentType", "addChildren", "org.jsoup.nodes.Node[]", "<sample:1>"}}, 3), new String[][]{{"absUrl", "java.lang.String", "7"}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("", String.valueOf(actual));
  assertEquals("receiver state after the call", "<!DOCTYPE a PUBLIC \"0\" \"sample\">\n <#root></#root><!DOCTYPE a PUBLIC \"0\" \"sample\">", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput072() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jsoup.nodes.DocumentType", "org.jsoup.nodes.DocumentType", "removeChild", new String[]{"org.jsoup.nodes.Node"}, new String[]{"<sample:1>"}, false, 0, null, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput073() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jsoup.nodes.DocumentType", "org.jsoup.nodes.DocumentType", "traverse", new String[]{"org.jsoup.select.NodeVisitor"}, new String[]{"<sample:5>"}, false, 0, null, 1), new String[][]{{"siblingNodes", "", "1"}});
  assertNotNull(actual);
  assertEquals("java.util.Collections$EmptyList", actual.getClass().getName());
  assertEquals("[]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "<!DOCTYPE a>", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput074() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.DocumentType", "org.jsoup.nodes.DocumentType", "traverse", new String[]{"org.jsoup.select.NodeVisitor"}, new String[]{"<sample:5>"}, false, 0, new String[][]{{"org.jsoup.nodes.DocumentType", "setBaseUri", "java.lang.String", "[1,2]"}}, 1);
  assertNotNull(actual);
  assertEquals("org.jsoup.nodes.DocumentType", actual.getClass().getName());
  assertEquals("<!DOCTYPE a>", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "<!DOCTYPE a>", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput075() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jsoup.nodes.DocumentType", "org.jsoup.nodes.DocumentType", "traverse", new String[]{"org.jsoup.select.NodeVisitor"}, new String[]{"<sample:0>"}, false, 0, new String[][]{{"org.jsoup.nodes.DocumentType", "setBaseUri", "java.lang.String", "s[1,7]"}}, 1), new String[][]{{"outerHtml", "", "0"}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("<!DOCTYPE a>", String.valueOf(actual));
  assertEquals("receiver state after the call", "<!DOCTYPE a>", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput076() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jsoup.nodes.DocumentType", "org.jsoup.nodes.DocumentType", "before", new String[]{"java.lang.String"}, new String[]{"a b"}, false); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput077() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.DocumentType", "org.jsoup.nodes.DocumentType", "childNodeSize", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.jsoup.nodes.DocumentType", "childNodesCopy", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "<!DOCTYPE a PUBLIC \"0\" \"sample\">", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput078() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.DocumentType", "org.jsoup.nodes.DocumentType", "childNodeSize", new String[]{}, new String[]{}, false, 11, new String[][]{{"org.jsoup.nodes.DocumentType", "childNodesCopy", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "<!DOCTYPE PUBLIC \"a\" \"0\">", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput079() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.DocumentType", "org.jsoup.nodes.DocumentType", "childNodeSize", new String[]{}, new String[]{}, false, 13, new String[][]{{"org.jsoup.nodes.DocumentType", "childNodesCopy", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "<!DOCTYPE 0 PUBLIC \"sample\">", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput080() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.DocumentType", "org.jsoup.nodes.DocumentType", "getOutputSettings", new String[]{}, new String[]{}, false);
  assertNotNull(actual);
  assertEquals("org.jsoup.nodes.Document$OutputSettings", actual.getClass().getName());
  assertEquals("receiver state after the call", "<!DOCTYPE a PUBLIC \"0\" \"sample\">", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput081() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.DocumentType", "org.jsoup.nodes.DocumentType", "getOutputSettings", new String[]{}, new String[]{}, false, 1, new String[][]{});
  assertNotNull(actual);
  assertEquals("org.jsoup.nodes.Document$OutputSettings", actual.getClass().getName());
  assertEquals("receiver state after the call", "<!DOCTYPE 0 PUBLIC \"sample\">", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput082() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.DocumentType", "org.jsoup.nodes.DocumentType", "getOutputSettings", new String[]{}, new String[]{}, false, 2, new String[][]{});
  assertNotNull(actual);
  assertEquals("org.jsoup.nodes.Document$OutputSettings", actual.getClass().getName());
  assertEquals("receiver state after the call", "<!DOCTYPE sample \"a\">", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput083() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.DocumentType", "org.jsoup.nodes.DocumentType", "getOutputSettings", new String[]{}, new String[]{}, false, 3, new String[][]{});
  assertNotNull(actual);
  assertEquals("org.jsoup.nodes.Document$OutputSettings", actual.getClass().getName());
  assertEquals("receiver state after the call", "<!DOCTYPE PUBLIC \"a\" \"0\">", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput084() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jsoup.nodes.DocumentType", "org.jsoup.nodes.DocumentType", "indent", new String[]{"java.lang.StringBuilder", "int", "org.jsoup.nodes.Document$OutputSettings"}, new String[]{"<sample:1>", "-2147483648", "<sample:4>"}, false); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput085() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jsoup.nodes.DocumentType", "org.jsoup.nodes.DocumentType", "indent", new String[]{"java.lang.StringBuilder", "int", "org.jsoup.nodes.Document$OutputSettings"}, new String[]{"<null>", "-2147483648", "<sample:4>"}, false, 0, new String[][]{{"org.jsoup.nodes.DocumentType", "unwrap", ""}, {"org.jsoup.nodes.DocumentType", "outerHtmlHead", "java.lang.StringBuilder,int,org.jsoup.nodes.Document$OutputSettings", "<sample:3>", "-1", "<null>"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput086() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.DocumentType", "org.jsoup.nodes.DocumentType", "indent", new String[]{"java.lang.StringBuilder", "int", "org.jsoup.nodes.Document$OutputSettings"}, new String[]{"<empty>", "1", "<sample:4>"}, false, 0, new String[][]{{"org.jsoup.nodes.DocumentType", "unwrap", ""}});
  assertNull(actual);
  assertEquals("receiver state after the call", "<!DOCTYPE a PUBLIC \"0\" \"sample\">", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput087() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.DocumentType", "org.jsoup.nodes.DocumentType", "indent", new String[]{"java.lang.StringBuilder", "int", "org.jsoup.nodes.Document$OutputSettings"}, new String[]{"<sample:3>", "513", "<sample:4>"}, false, 1, new String[][]{{"org.jsoup.nodes.DocumentType", "hashCode", ""}, {"org.jsoup.nodes.DocumentType", "unwrap", ""}});
  assertNull(actual);
  assertEquals("receiver state after the call", "<!DOCTYPE 0 PUBLIC \"sample\">", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput088() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.DocumentType", "org.jsoup.nodes.DocumentType", "addChildren", new String[]{"int", "org.jsoup.nodes.Node[]"}, new String[]{"10", "<empty>"}, false, 0, new String[][]{{"org.jsoup.nodes.DocumentType", "clone", ""}});
  assertNull(actual);
  assertEquals("receiver state after the call", "<!DOCTYPE a PUBLIC \"0\" \"sample\">", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput089() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.DocumentType", "org.jsoup.nodes.DocumentType", "setParentNode", new String[]{"org.jsoup.nodes.Node"}, new String[]{"<sample:2>"}, false);
  assertNull(actual);
  assertEquals("receiver state after the call", "<!DOCTYPE a PUBLIC \"0\" \"sample\">", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput090() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jsoup.nodes.DocumentType", "org.jsoup.nodes.DocumentType", "remove", new String[]{}, new String[]{}, false); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput091() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.DocumentType", "org.jsoup.nodes.DocumentType", "baseUri", new String[]{}, new String[]{}, false);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("", String.valueOf(actual));
  assertEquals("receiver state after the call", "<!DOCTYPE a PUBLIC \"0\" \"sample\">", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput092() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.DocumentType", "org.jsoup.nodes.DocumentType", "baseUri", new String[]{}, new String[]{}, false, 1, new String[][]{});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("a", String.valueOf(actual));
  assertEquals("receiver state after the call", "<!DOCTYPE 0 PUBLIC \"sample\">", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput093() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.DocumentType", "org.jsoup.nodes.DocumentType", "outerHtml", new String[]{"java.lang.StringBuilder"}, new String[]{"<empty>"}, false, 1, new String[][]{{"org.jsoup.nodes.DocumentType", "ownerDocument", ""}});
  assertNull(actual);
  assertEquals("receiver state after the call", "<!DOCTYPE 0 PUBLIC \"sample\">", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput094() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.DocumentType", "org.jsoup.nodes.DocumentType", "outerHtml", new String[]{"java.lang.StringBuilder"}, new String[]{"<sample:1>"}, false, 11, new String[][]{{"org.jsoup.nodes.DocumentType", "unwrap", ""}, {"org.jsoup.nodes.DocumentType", "ownerDocument", ""}});
  assertNull(actual);
  assertEquals("receiver state after the call", "<!DOCTYPE PUBLIC \"a\" \"0\">", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput095() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.DocumentType", "org.jsoup.nodes.DocumentType", "outerHtml", new String[]{"java.lang.StringBuilder"}, new String[]{"<sample:2>"}, false, 6, new String[][]{{"org.jsoup.nodes.DocumentType", "unwrap", ""}, {"org.jsoup.nodes.DocumentType", "ownerDocument", ""}});
  assertNull(actual);
  assertEquals("receiver state after the call", "<!DOCTYPE sample \"a\">", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput096() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.DocumentType", "org.jsoup.nodes.DocumentType", "outerHtml", new String[]{"java.lang.StringBuilder"}, new String[]{"<sample:0>"}, false, 4, new String[][]{{"org.jsoup.nodes.DocumentType", "unwrap", ""}, {"org.jsoup.nodes.DocumentType", "ownerDocument", ""}});
  assertNull(actual);
  assertEquals("receiver state after the call", "<!DOCTYPE a PUBLIC \"0\" \"sample\">", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput097() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.DocumentType", "org.jsoup.nodes.DocumentType", "addChildren", new String[]{"org.jsoup.nodes.Node[]"}, new String[]{"<empty>"}, false);
  assertNull(actual);
  assertEquals("receiver state after the call", "<!DOCTYPE a PUBLIC \"0\" \"sample\">", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput098() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.DocumentType", "org.jsoup.nodes.DocumentType", "addChildren", new String[]{"org.jsoup.nodes.Node[]"}, new String[]{"<sample:2>"}, false);
  assertNull(actual);
  assertEquals("receiver state after the call", "<!DOCTYPE a PUBLIC \"0\" \"sample\"><!DOCTYPE a PUBLIC \"0\" \"sample\">\n <!--a-->a", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput099() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.DocumentType", "org.jsoup.nodes.DocumentType", "addChildren", new String[]{"org.jsoup.nodes.Node[]"}, new String[]{"<sample:4>"}, false);
  assertNull(actual);
  assertEquals("receiver state after the call", "<!DOCTYPE a PUBLIC \"0\" \"sample\">a\n <!--a-->", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput100() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.DocumentType", "org.jsoup.nodes.DocumentType", "addChildren", new String[]{"org.jsoup.nodes.Node[]"}, new String[]{"<sample:0>"}, false);
  assertNull(actual);
  assertEquals("receiver state after the call", "<!DOCTYPE a PUBLIC \"0\" \"sample\">a", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput101() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.DocumentType", "org.jsoup.nodes.DocumentType", "addChildren", new String[]{"org.jsoup.nodes.Node[]"}, new String[]{"<sample:0>"}, false, 14, new String[][]{});
  assertNull(actual);
  assertEquals("receiver state after the call", "<!DOCTYPE sample \"a\">a", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput102() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jsoup.nodes.DocumentType", "org.jsoup.nodes.DocumentType", "after", new String[]{"org.jsoup.nodes.Node"}, new String[]{"<sample:6>"}, false); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput103() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.DocumentType", "org.jsoup.nodes.DocumentType", "ownerDocument", new String[]{}, new String[]{}, false);
  assertNull(actual);
  assertEquals("receiver state after the call", "<!DOCTYPE a PUBLIC \"0\" \"sample\">", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput104() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.DocumentType", "org.jsoup.nodes.DocumentType", "ownerDocument", new String[]{}, new String[]{}, false, 7, new String[][]{});
  assertNull(actual);
  assertEquals("receiver state after the call", "<!DOCTYPE PUBLIC \"a\" \"0\">", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput105() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.DocumentType", "org.jsoup.nodes.DocumentType", "ownerDocument", new String[]{}, new String[]{}, false, 9, new String[][]{});
  assertNull(actual);
  assertEquals("receiver state after the call", "<!DOCTYPE 0 PUBLIC \"sample\">", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput106() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.DocumentType", "org.jsoup.nodes.DocumentType", "ownerDocument", new String[]{}, new String[]{}, false, 10, new String[][]{});
  assertNull(actual);
  assertEquals("receiver state after the call", "<!DOCTYPE sample \"a\">", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput107() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jsoup.nodes.DocumentType", "org.jsoup.nodes.DocumentType", "getOutputSettings", new String[]{}, new String[]{}, false), new String[][]{{"charset", "", "4"}, {"isRegistered", "", "7"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
  assertEquals("receiver state after the call", "<!DOCTYPE a PUBLIC \"0\" \"sample\">", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput108() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jsoup.nodes.DocumentType", "org.jsoup.nodes.DocumentType", "getOutputSettings", new String[]{}, new String[]{}, false, 1, new String[][]{}), new String[][]{{"charset", "", "4"}});
  assertNotNull(actual);
  assertEquals("sun.nio.cs.UTF_8", actual.getClass().getName());
  assertEquals("UTF-8 {canEncode=true, isRegistered=true}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "<!DOCTYPE 0 PUBLIC \"sample\">", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput109() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.DocumentType", "org.jsoup.nodes.DocumentType", "siblingNodes", new String[]{}, new String[]{}, false);
  assertNotNull(actual);
  assertEquals("java.util.Collections$EmptyList", actual.getClass().getName());
  assertEquals("[]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "<!DOCTYPE a PUBLIC \"0\" \"sample\">", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput110() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.DocumentType", "org.jsoup.nodes.DocumentType", "siblingNodes", new String[]{}, new String[]{}, false, 1, new String[][]{});
  assertNotNull(actual);
  assertEquals("java.util.Collections$EmptyList", actual.getClass().getName());
  assertEquals("[]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "<!DOCTYPE 0 PUBLIC \"sample\">", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput111() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.DocumentType", "org.jsoup.nodes.DocumentType", "siblingNodes", new String[]{}, new String[]{}, false, 2, new String[][]{});
  assertNotNull(actual);
  assertEquals("java.util.Collections$EmptyList", actual.getClass().getName());
  assertEquals("[]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "<!DOCTYPE sample \"a\">", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput112() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.DocumentType", "org.jsoup.nodes.DocumentType", "siblingNodes", new String[]{}, new String[]{}, false, 3, new String[][]{});
  assertNotNull(actual);
  assertEquals("java.util.Collections$EmptyList", actual.getClass().getName());
  assertEquals("[]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "<!DOCTYPE PUBLIC \"a\" \"0\">", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput113() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jsoup.nodes.DocumentType", "org.jsoup.nodes.DocumentType", "siblingNodes", new String[]{}, new String[]{}, false, 3, new String[][]{}), new String[][]{{"remove", "int", "4"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.UnsupportedOperationException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput114() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.DocumentType", "org.jsoup.nodes.DocumentType", "parent", new String[]{}, new String[]{}, false);
  assertNull(actual);
  assertEquals("receiver state after the call", "<!DOCTYPE a PUBLIC \"0\" \"sample\">", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput115() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.DocumentType", "org.jsoup.nodes.DocumentType", "parent", new String[]{}, new String[]{}, false, 1, new String[][]{});
  assertNull(actual);
  assertEquals("receiver state after the call", "<!DOCTYPE 0 PUBLIC \"sample\">", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput116() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.DocumentType", "org.jsoup.nodes.DocumentType", "parent", new String[]{}, new String[]{}, false, 10, new String[][]{});
  assertNull(actual);
  assertEquals("receiver state after the call", "<!DOCTYPE sample \"a\">", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput117() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.DocumentType", "org.jsoup.nodes.DocumentType", "parent", new String[]{}, new String[]{}, false, 11, new String[][]{});
  assertNull(actual);
  assertEquals("receiver state after the call", "<!DOCTYPE PUBLIC \"a\" \"0\">", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput118() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jsoup.nodes.DocumentType", "org.jsoup.nodes.DocumentType", "removeChild", new String[]{"org.jsoup.nodes.Node"}, new String[]{"<sample:6>"}, false, 0, new String[][]{{"org.jsoup.nodes.DocumentType", "attr", "java.lang.String,java.lang.String", "systemId", "publicId"}, {"org.jsoup.nodes.DocumentType", "removeAttr", "java.lang.String", "1.12345678"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput119() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jsoup.nodes.DocumentType", "org.jsoup.nodes.DocumentType", "childNode", new String[]{"int"}, new String[]{"-2147483648"}, false, 0, new String[][]{{"org.jsoup.nodes.DocumentType", "addChildren", "int,org.jsoup.nodes.Node[]", "-1", "<sample:1>"}, {"org.jsoup.nodes.DocumentType", "ownerDocument", ""}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IndexOutOfBoundsException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput120() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.DocumentType", "org.jsoup.nodes.DocumentType", "attr", new String[]{"java.lang.String", "java.lang.String"}, new String[]{"-1.5", ".5"}, false, 0, new String[][]{{"org.jsoup.nodes.DocumentType", "nodeName", ""}, {"org.jsoup.nodes.DocumentType", "before", "java.lang.String", "<a>b</a>"}});
  assertNotNull(actual);
  assertEquals("org.jsoup.nodes.DocumentType", actual.getClass().getName());
  assertEquals("<!DOCTYPE a PUBLIC \"0\" \"sample\">", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "<!DOCTYPE a PUBLIC \"0\" \"sample\">", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput121() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.DocumentType", "org.jsoup.nodes.DocumentType", "attr", new String[]{"java.lang.String"}, new String[]{"1.5e300"}, false);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("", String.valueOf(actual));
  assertEquals("receiver state after the call", "<!DOCTYPE a PUBLIC \"0\" \"sample\">", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput122() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.DocumentType", "org.jsoup.nodes.DocumentType", "setSiblingIndex", new String[]{"int"}, new String[]{"-2147483648"}, false);
  assertNull(actual);
  assertEquals("receiver state after the call", "<!DOCTYPE a PUBLIC \"0\" \"sample\">", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput123() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.DocumentType", "org.jsoup.nodes.DocumentType", "attributes", new String[]{}, new String[]{}, false);
  assertNotNull(actual);
  assertEquals("org.jsoup.nodes.Attributes", actual.getClass().getName());
  assertEquals(" name=\"a\" publicid=\"0\" systemid=\"sample\" {size=3}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "<!DOCTYPE a PUBLIC \"0\" \"sample\">", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput124() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.DocumentType", "org.jsoup.nodes.DocumentType", "attributes", new String[]{}, new String[]{}, false, 1, new String[][]{});
  assertNotNull(actual);
  assertEquals("org.jsoup.nodes.Attributes", actual.getClass().getName());
  assertEquals(" name=\"0\" publicid=\"sample\" systemid=\"\" {size=3}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "<!DOCTYPE 0 PUBLIC \"sample\">", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput125() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jsoup.nodes.DocumentType", "org.jsoup.nodes.DocumentType", "replaceChild", new String[]{"org.jsoup.nodes.Node", "org.jsoup.nodes.Node"}, new String[]{"<sample:1>", "<sample:0>"}, false, 0, new String[][]{{"org.jsoup.nodes.DocumentType", "setSiblingIndex", "int", "2147483647"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput126() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.DocumentType", "org.jsoup.nodes.DocumentType", "absUrl", new String[]{"java.lang.String"}, new String[]{"1L"}, false, 2, new String[][]{{"org.jsoup.nodes.DocumentType", "wrap", "java.lang.String", "--1"}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("", String.valueOf(actual));
  assertEquals("receiver state after the call", "<!DOCTYPE sample \"a\">", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput127() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.DocumentType", "org.jsoup.nodes.DocumentType", "absUrl", new String[]{"java.lang.String"}, new String[]{"1L"}, false, 8, new String[][]{});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("", String.valueOf(actual));
  assertEquals("receiver state after the call", "<!DOCTYPE a PUBLIC \"0\" \"sample\">", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput128() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.DocumentType", "org.jsoup.nodes.DocumentType", "absUrl", new String[]{"java.lang.String"}, new String[]{"1L"}, false, 9, new String[][]{});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("", String.valueOf(actual));
  assertEquals("receiver state after the call", "<!DOCTYPE 0 PUBLIC \"sample\">", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput129() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.DocumentType", "org.jsoup.nodes.DocumentType", "absUrl", new String[]{"java.lang.String"}, new String[]{"T"}, false, 7, new String[][]{{"org.jsoup.nodes.DocumentType", "attr", "java.lang.String,java.lang.String", "214474836448", "Z1,]"}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("", String.valueOf(actual));
  assertEquals("receiver state after the call", "<!DOCTYPE PUBLIC \"a\" \"0\">", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput130() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.DocumentType", "org.jsoup.nodes.DocumentType", "attr", new String[]{"java.lang.String"}, new String[]{"1.25"}, false, 9, new String[][]{{"org.jsoup.nodes.DocumentType", "after", "org.jsoup.nodes.Node", "<null>"}, {"org.jsoup.nodes.DocumentType", "nodeName", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("", String.valueOf(actual));
  assertEquals("receiver state after the call", "<!DOCTYPE 0 PUBLIC \"sample\">", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput131() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.DocumentType", "org.jsoup.nodes.DocumentType", "doClone", new String[]{"org.jsoup.nodes.Node"}, new String[]{"<sample:7>"}, false, 6, new String[][]{{"org.jsoup.nodes.DocumentType", "doClone", "org.jsoup.nodes.Node", "<sample:7>"}, {"org.jsoup.nodes.DocumentType", "equals", "java.lang.Object", "<b:true>"}});
  assertNotNull(actual);
  assertEquals("org.jsoup.nodes.DocumentType", actual.getClass().getName());
  assertEquals("<!DOCTYPE sample \"a\">", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "<!DOCTYPE sample \"a\">", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput132() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jsoup.nodes.DocumentType", "org.jsoup.nodes.DocumentType", "after", new String[]{"java.lang.String"}, new String[]{"-1"}, false); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput133() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jsoup.nodes.DocumentType", "org.jsoup.nodes.DocumentType", "doClone", new String[]{"org.jsoup.nodes.Node"}, new String[]{"<sample:6>"}, false, 0, new String[][]{{"org.jsoup.nodes.DocumentType", "doClone", "org.jsoup.nodes.Node", "<null>"}}), new String[][]{{"baseUri", "", "4"}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("", String.valueOf(actual));
  assertEquals("receiver state after the call", "<!DOCTYPE a PUBLIC \"0\" \"sample\">", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput134() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jsoup.nodes.DocumentType", "org.jsoup.nodes.DocumentType", "doClone", new String[]{"org.jsoup.nodes.Node"}, new String[]{"<sample:7>"}, false, 1, new String[][]{{"org.jsoup.nodes.DocumentType", "doClone", "org.jsoup.nodes.Node", "<null>"}}), new String[][]{{"baseUri", "", "4"}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("a", String.valueOf(actual));
  assertEquals("receiver state after the call", "<!DOCTYPE 0 PUBLIC \"sample\">", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput135() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.DocumentType", "org.jsoup.nodes.DocumentType", "removeAttr", new String[]{"java.lang.String"}, new String[]{"2020-01-01"}, false);
  assertNotNull(actual);
  assertEquals("org.jsoup.nodes.DocumentType", actual.getClass().getName());
  assertEquals("<!DOCTYPE a PUBLIC \"0\" \"sample\">", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "<!DOCTYPE a PUBLIC \"0\" \"sample\">", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput136() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jsoup.nodes.DocumentType", "org.jsoup.nodes.DocumentType", "getOutputSettings", new String[]{}, new String[]{}, false), new String[][]{{"prettyPrint", "boolean", "0"}, {"syntax", "", "3"}});
  assertNotNull(actual);
  assertEquals("org.jsoup.nodes.Document$OutputSettings$Syntax", actual.getClass().getName());
  assertEquals("html", String.valueOf(actual));
  assertEquals("receiver state after the call", "<!DOCTYPE a PUBLIC \"0\" \"sample\">", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput137() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jsoup.nodes.DocumentType", "org.jsoup.nodes.DocumentType", "getOutputSettings", new String[]{}, new String[]{}, false, 5, new String[][]{{"org.jsoup.nodes.DocumentType", "clone", ""}}), new String[][]{{"prettyPrint", "boolean", "0"}, {"syntax", "", "3"}, {"prettyPrint", "boolean", "3"}, {"indentAmount", "int", "1"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput138() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.DocumentType", "org.jsoup.nodes.DocumentType", "siblingIndex", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.jsoup.nodes.DocumentType", "replaceWith", "org.jsoup.nodes.Node", "<sample:3>"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "<!DOCTYPE a PUBLIC \"0\" \"sample\">", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput139() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.DocumentType", "org.jsoup.nodes.DocumentType", "siblingIndex", new String[]{}, new String[]{}, false, 1, new String[][]{{"org.jsoup.nodes.DocumentType", "parent", ""}, {"org.jsoup.nodes.DocumentType", "replaceWith", "org.jsoup.nodes.Node", "<sample:3>"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "<!DOCTYPE 0 PUBLIC \"sample\">", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput140() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.DocumentType", "org.jsoup.nodes.DocumentType", "siblingIndex", new String[]{}, new String[]{}, false, 14, new String[][]{{"org.jsoup.nodes.DocumentType", "parent", ""}, {"org.jsoup.nodes.DocumentType", "replaceWith", "org.jsoup.nodes.Node", "<sample:3>"}, {"org.jsoup.nodes.DocumentType", "before", "java.lang.String", "/a/b"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "<!DOCTYPE sample \"a\">", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput141() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.DocumentType", "org.jsoup.nodes.DocumentType", "siblingIndex", new String[]{}, new String[]{}, false, 15, new String[][]{{"org.jsoup.nodes.DocumentType", "parent", ""}, {"org.jsoup.nodes.DocumentType", "replaceWith", "org.jsoup.nodes.Node", "<sample:3>"}, {"org.jsoup.nodes.DocumentType", "before", "java.lang.String", "/a/b"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "<!DOCTYPE PUBLIC \"a\" \"0\">", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput142() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jsoup.nodes.DocumentType", "org.jsoup.nodes.DocumentType", "siblingNodes", new String[]{}, new String[]{}, false, 3, new String[][]{}), new String[][]{{"size", "", "4"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "<!DOCTYPE PUBLIC \"a\" \"0\">", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput143() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jsoup.nodes.DocumentType", "org.jsoup.nodes.DocumentType", "replaceWith", new String[]{"org.jsoup.nodes.Node"}, new String[]{"<sample:5>"}, false); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput144() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.DocumentType", "org.jsoup.nodes.DocumentType", "parentNode", new String[]{}, new String[]{}, false);
  assertNull(actual);
  assertEquals("receiver state after the call", "<!DOCTYPE a PUBLIC \"0\" \"sample\">", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput145() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.DocumentType", "org.jsoup.nodes.DocumentType", "parentNode", new String[]{}, new String[]{}, false, 1, new String[][]{});
  assertNull(actual);
  assertEquals("receiver state after the call", "<!DOCTYPE 0 PUBLIC \"sample\">", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput146() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.DocumentType", "org.jsoup.nodes.DocumentType", "parentNode", new String[]{}, new String[]{}, false, 2, new String[][]{});
  assertNull(actual);
  assertEquals("receiver state after the call", "<!DOCTYPE sample \"a\">", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput147() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.DocumentType", "org.jsoup.nodes.DocumentType", "parentNode", new String[]{}, new String[]{}, false, 3, new String[][]{});
  assertNull(actual);
  assertEquals("receiver state after the call", "<!DOCTYPE PUBLIC \"a\" \"0\">", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput148() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.DocumentType", "org.jsoup.nodes.DocumentType", "clone", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.jsoup.nodes.DocumentType", "traverse", "org.jsoup.select.NodeVisitor", "<sample:3>"}});
  assertNotNull(actual);
  assertEquals("org.jsoup.nodes.DocumentType", actual.getClass().getName());
  assertEquals("<!DOCTYPE a PUBLIC \"0\" \"sample\">", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "<!DOCTYPE a PUBLIC \"0\" \"sample\">", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput149() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.DocumentType", "org.jsoup.nodes.DocumentType", "clone", new String[]{}, new String[]{}, false, 1, new String[][]{});
  assertNotNull(actual);
  assertEquals("org.jsoup.nodes.DocumentType", actual.getClass().getName());
  assertEquals("<!DOCTYPE 0 PUBLIC \"sample\">", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "<!DOCTYPE 0 PUBLIC \"sample\">", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput150() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.DocumentType", "org.jsoup.nodes.DocumentType", "clone", new String[]{}, new String[]{}, false, 2, new String[][]{});
  assertNotNull(actual);
  assertEquals("org.jsoup.nodes.DocumentType", actual.getClass().getName());
  assertEquals("<!DOCTYPE sample \"a\">", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "<!DOCTYPE sample \"a\">", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput151() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.DocumentType", "org.jsoup.nodes.DocumentType", "clone", new String[]{}, new String[]{}, false, 3, new String[][]{});
  assertNotNull(actual);
  assertEquals("org.jsoup.nodes.DocumentType", actual.getClass().getName());
  assertEquals("<!DOCTYPE PUBLIC \"a\" \"0\">", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "<!DOCTYPE PUBLIC \"a\" \"0\">", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput152() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jsoup.nodes.DocumentType", "org.jsoup.nodes.DocumentType", "clone", new String[]{}, new String[]{}, false, 5, new String[][]{}), new String[][]{{"ownerDocument", "", "6"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "<!DOCTYPE 0 PUBLIC \"sample\">", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput153() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jsoup.nodes.DocumentType", "org.jsoup.nodes.DocumentType", "unwrap", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.jsoup.nodes.DocumentType", "after", "org.jsoup.nodes.Node", "<null>"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput154() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.DocumentType", "org.jsoup.nodes.DocumentType", "equals", new String[]{"java.lang.Object"}, new String[]{"<s:>"}, false, 3, new String[][]{{"org.jsoup.nodes.DocumentType", "childNode", "int", "1"}, {"org.jsoup.nodes.DocumentType", "childNode", "int", "1"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "<!DOCTYPE PUBLIC \"a\" \"0\">", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput155() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.DocumentType", "org.jsoup.nodes.DocumentType", "equals", new String[]{"java.lang.Object"}, new String[]{"<s:k\ry>"}, false, 9, new String[][]{{"org.jsoup.nodes.DocumentType", "childNode", "int", "1"}, {"org.jsoup.nodes.DocumentType", "after", "java.lang.String", "1E-5"}, {"org.jsoup.nodes.DocumentType", "childNode", "int", "-52"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "<!DOCTYPE 0 PUBLIC \"sample\">", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput156() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.DocumentType", "org.jsoup.nodes.DocumentType", "equals", new String[]{"java.lang.Object"}, new String[]{"<s:2k\ryy>"}, false, 8, new String[][]{{"org.jsoup.nodes.DocumentType", "childNode", "int", "1"}, {"org.jsoup.nodes.DocumentType", "childNode", "int", "-5"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "<!DOCTYPE a PUBLIC \"0\" \"sample\">", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput157() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.DocumentType", "org.jsoup.nodes.DocumentType", "hashCode", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.jsoup.nodes.DocumentType", "absUrl", "java.lang.String", "1.1234567890123456"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("-1710662449", String.valueOf(actual));
  assertEquals("receiver state after the call", "<!DOCTYPE a PUBLIC \"0\" \"sample\">", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput158() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.DocumentType", "org.jsoup.nodes.DocumentType", "hashCode", new String[]{}, new String[]{}, false, 1, new String[][]{{"org.jsoup.nodes.DocumentType", "absUrl", "java.lang.String", "1.12345678901234560"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("-1448232596", String.valueOf(actual));
  assertEquals("receiver state after the call", "<!DOCTYPE 0 PUBLIC \"sample\">", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput159() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.DocumentType", "org.jsoup.nodes.DocumentType", "hashCode", new String[]{}, new String[]{}, false, 2, new String[][]{{"org.jsoup.nodes.DocumentType", "absUrl", "java.lang.String", "1.123456789012345601e10"}, {"org.jsoup.nodes.DocumentType", "parent", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("567982857", String.valueOf(actual));
  assertEquals("receiver state after the call", "<!DOCTYPE sample \"a\">", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput160() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.DocumentType", "org.jsoup.nodes.DocumentType", "hashCode", new String[]{}, new String[]{}, false, 3, new String[][]{{"org.jsoup.nodes.DocumentType", "absUrl", "java.lang.String", "1.123456789012345601e10"}, {"org.jsoup.nodes.DocumentType", "parent", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("1471361443", String.valueOf(actual));
  assertEquals("receiver state after the call", "<!DOCTYPE PUBLIC \"a\" \"0\">", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput161() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.DocumentType", "org.jsoup.nodes.DocumentType", "baseUri", new String[]{}, new String[]{}, false, 2, new String[][]{{"org.jsoup.nodes.DocumentType", "childNodeSize", ""}, {"org.jsoup.nodes.DocumentType", "unwrap", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "<!DOCTYPE sample \"a\">", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput162() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.DocumentType", "org.jsoup.nodes.DocumentType", "baseUri", new String[]{}, new String[]{}, false, 3, new String[][]{{"org.jsoup.nodes.DocumentType", "childNodeSize", ""}, {"org.jsoup.nodes.DocumentType", "unwrap", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("sample", String.valueOf(actual));
  assertEquals("receiver state after the call", "<!DOCTYPE PUBLIC \"a\" \"0\">", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput163() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.DocumentType", "org.jsoup.nodes.DocumentType", "nodeName", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.jsoup.nodes.DocumentType", "absUrl", "java.lang.String", "1e10"}, {"org.jsoup.nodes.DocumentType", "baseUri", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("#doctype", String.valueOf(actual));
  assertEquals("receiver state after the call", "<!DOCTYPE a PUBLIC \"0\" \"sample\">", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput164() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.DocumentType", "org.jsoup.nodes.DocumentType", "nodeName", new String[]{}, new String[]{}, false, 6, new String[][]{{"org.jsoup.nodes.DocumentType", "absUrl", "java.lang.String", "1e10"}, {"org.jsoup.nodes.DocumentType", "baseUri", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("#doctype", String.valueOf(actual));
  assertEquals("receiver state after the call", "<!DOCTYPE sample \"a\">", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput165() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jsoup.nodes.DocumentType", "org.jsoup.nodes.DocumentType", "getOutputSettings", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.jsoup.nodes.DocumentType", "remove", ""}}), new String[][]{{"clone", "", "5"}, {"outline", "", "0"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "<!DOCTYPE a PUBLIC \"0\" \"sample\">", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput166() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.DocumentType", "org.jsoup.nodes.DocumentType", "childNodes", new String[]{}, new String[]{}, false);
  assertNotNull(actual);
  assertEquals("java.util.Collections$UnmodifiableRandomAccessList", actual.getClass().getName());
  assertEquals("[]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "<!DOCTYPE a PUBLIC \"0\" \"sample\">", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput167() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.DocumentType", "org.jsoup.nodes.DocumentType", "childNodes", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.jsoup.nodes.DocumentType", "addChildren", "org.jsoup.nodes.Node[]", "<sample:1>"}});
  assertNotNull(actual);
  assertEquals("java.util.Collections$UnmodifiableRandomAccessList", actual.getClass().getName());
  assertEquals("[, <!DOCTYPE a PUBLIC \"0\" \"sample\">]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "<!DOCTYPE a PUBLIC \"0\" \"sample\">\n <#root></#root><!DOCTYPE a PUBLIC \"0\" \"sample\">", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput168() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jsoup.nodes.DocumentType", "org.jsoup.nodes.DocumentType", "childNodes", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.jsoup.nodes.DocumentType", "addChildren", "org.jsoup.nodes.Node[]", "<sample:1>"}}), new String[][]{{"add", "int,java.lang.Object", "3"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.UnsupportedOperationException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput169() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.DocumentType", "org.jsoup.nodes.DocumentType", "setSiblingIndex", new String[]{"int"}, new String[]{"10"}, false, 3, new String[][]{{"org.jsoup.nodes.DocumentType", "before", "java.lang.String", "-1"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "<!DOCTYPE PUBLIC \"a\" \"0\">", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput170() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.DocumentType", "org.jsoup.nodes.DocumentType", "setSiblingIndex", new String[]{"int"}, new String[]{"2147483647"}, false, 14, new String[][]{{"org.jsoup.nodes.DocumentType", "outerHtml", "java.lang.StringBuilder", "<sample:3>"}, {"org.jsoup.nodes.DocumentType", "traverse", "org.jsoup.select.NodeVisitor", "<null>"}, {"org.jsoup.nodes.DocumentType", "equals", "java.lang.Object", "<null>"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "<!DOCTYPE sample \"a\">", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput171() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jsoup.nodes.DocumentType", "org.jsoup.nodes.DocumentType", "attributes", new String[]{}, new String[]{}, false), new String[][]{{"iterator", "", "1"}, {"remove", "", "4"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.UnsupportedOperationException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput172() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.DocumentType", "org.jsoup.nodes.DocumentType", "childNodesAsArray", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.jsoup.nodes.DocumentType", "outerHtml", ""}});
  assertNotNull(actual);
  assertEquals("[Lorg.jsoup.nodes.Node;", actual.getClass().getName());
  assertEquals("[]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "<!DOCTYPE a PUBLIC \"0\" \"sample\">", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput173() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.DocumentType", "org.jsoup.nodes.DocumentType", "childNodesAsArray", new String[]{}, new String[]{}, false, 1, new String[][]{{"org.jsoup.nodes.DocumentType", "outerHtml", ""}});
  assertNotNull(actual);
  assertEquals("[Lorg.jsoup.nodes.Node;", actual.getClass().getName());
  assertEquals("[]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "<!DOCTYPE 0 PUBLIC \"sample\">", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput174() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.DocumentType", "org.jsoup.nodes.DocumentType", "childNodesAsArray", new String[]{}, new String[]{}, false, 2, new String[][]{{"org.jsoup.nodes.DocumentType", "outerHtml", ""}});
  assertNotNull(actual);
  assertEquals("[Lorg.jsoup.nodes.Node;", actual.getClass().getName());
  assertEquals("[]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "<!DOCTYPE sample \"a\">", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput175() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jsoup.nodes.DocumentType", "org.jsoup.nodes.DocumentType", "attributes", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.jsoup.nodes.DocumentType", "setSiblingIndex", "int", "-1"}, {"org.jsoup.nodes.DocumentType", "siblingNodes", ""}}), new String[][]{{"remove", "java.lang.String", "4"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput176() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.DocumentType", "org.jsoup.nodes.DocumentType", "outerHtml", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.jsoup.nodes.DocumentType", "removeAttr", "java.lang.String", "1E-5"}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("<!DOCTYPE a PUBLIC \"0\" \"sample\">", String.valueOf(actual));
  assertEquals("receiver state after the call", "<!DOCTYPE a PUBLIC \"0\" \"sample\">", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput177() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.DocumentType", "org.jsoup.nodes.DocumentType", "removeAttr", new String[]{"java.lang.String"}, new String[]{"a,b,c"}, false, 5, new String[][]{{"org.jsoup.nodes.DocumentType", "nodeName", ""}});
  assertNotNull(actual);
  assertEquals("org.jsoup.nodes.DocumentType", actual.getClass().getName());
  assertEquals("<!DOCTYPE 0 PUBLIC \"sample\">", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "<!DOCTYPE 0 PUBLIC \"sample\">", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput178() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jsoup.nodes.DocumentType", "org.jsoup.nodes.DocumentType", "removeAttr", new String[]{"java.lang.String"}, new String[]{""}, false, 4, new String[][]{{"org.jsoup.nodes.DocumentType", "nodeName", ""}, {"org.jsoup.nodes.DocumentType", "attr", "java.lang.String", "\t"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput179() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.DocumentType", "org.jsoup.nodes.DocumentType", "removeAttr", new String[]{"java.lang.String"}, new String[]{"T"}, false, 6, new String[][]{{"org.jsoup.nodes.DocumentType", "nodeName", ""}, {"org.jsoup.nodes.DocumentType", "attr", "java.lang.String", "\010"}});
  assertNotNull(actual);
  assertEquals("org.jsoup.nodes.DocumentType", actual.getClass().getName());
  assertEquals("<!DOCTYPE sample \"a\">", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "<!DOCTYPE sample \"a\">", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput180() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.DocumentType", "org.jsoup.nodes.DocumentType", "nodeName", new String[]{}, new String[]{}, false, 1, new String[][]{});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("#doctype", String.valueOf(actual));
  assertEquals("receiver state after the call", "<!DOCTYPE 0 PUBLIC \"sample\">", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput181() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.DocumentType", "org.jsoup.nodes.DocumentType", "nodeName", new String[]{}, new String[]{}, false, 3, new String[][]{{"org.jsoup.nodes.DocumentType", "toString", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("#doctype", String.valueOf(actual));
  assertEquals("receiver state after the call", "<!DOCTYPE PUBLIC \"a\" \"0\">", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput182() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.DocumentType", "org.jsoup.nodes.DocumentType", "previousSibling", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.jsoup.nodes.DocumentType", "childNodesCopy", ""}});
  assertNull(actual);
  assertEquals("receiver state after the call", "<!DOCTYPE a PUBLIC \"0\" \"sample\">", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput183() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.DocumentType", "org.jsoup.nodes.DocumentType", "previousSibling", new String[]{}, new String[]{}, false, 1, new String[][]{{"org.jsoup.nodes.DocumentType", "childNodesCopy", ""}});
  assertNull(actual);
  assertEquals("receiver state after the call", "<!DOCTYPE 0 PUBLIC \"sample\">", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput184() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.DocumentType", "org.jsoup.nodes.DocumentType", "previousSibling", new String[]{}, new String[]{}, false, 14, new String[][]{{"org.jsoup.nodes.DocumentType", "childNodesCopy", ""}});
  assertNull(actual);
  assertEquals("receiver state after the call", "<!DOCTYPE sample \"a\">", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput185() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.DocumentType", "org.jsoup.nodes.DocumentType", "previousSibling", new String[]{}, new String[]{}, false, 15, new String[][]{{"org.jsoup.nodes.DocumentType", "childNodesCopy", ""}});
  assertNull(actual);
  assertEquals("receiver state after the call", "<!DOCTYPE PUBLIC \"a\" \"0\">", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput186() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jsoup.nodes.DocumentType", "org.jsoup.nodes.DocumentType", "getOutputSettings", new String[]{}, new String[]{}, false, 2, new String[][]{{"org.jsoup.nodes.DocumentType", "equals", "java.lang.Object", "<s:b>"}, {"org.jsoup.nodes.DocumentType", "siblingNodes", ""}, {"org.jsoup.nodes.DocumentType", "hasAttr", "java.lang.String", "1.5e300"}}), new String[][]{{"outline", "boolean", "7"}, {"indentAmount", "", "7"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("1", String.valueOf(actual));
  assertEquals("receiver state after the call", "<!DOCTYPE sample \"a\">", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput187() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.DocumentType", "org.jsoup.nodes.DocumentType", "parentNode", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.jsoup.nodes.DocumentType", "replaceChild", "org.jsoup.nodes.Node,org.jsoup.nodes.Node", "<null>", "<sample:6>"}, {"org.jsoup.nodes.DocumentType", "addChildren", "org.jsoup.nodes.Node[]", "<sample:1>"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "<!DOCTYPE a PUBLIC \"0\" \"sample\">\n <#root></#root><!DOCTYPE a PUBLIC \"0\" \"sample\">", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput188() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jsoup.nodes.DocumentType", "org.jsoup.nodes.DocumentType", "before", new String[]{"org.jsoup.nodes.Node"}, new String[]{"<sample:1>"}, false); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput189() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.DocumentType", "org.jsoup.nodes.DocumentType", "outerHtmlTail", new String[]{"java.lang.StringBuilder", "int", "org.jsoup.nodes.Document$OutputSettings"}, new String[]{"<sample:3>", "-2147483648", "<sample:2>"}, false);
  assertNull(actual);
  assertEquals("receiver state after the call", "<!DOCTYPE a PUBLIC \"0\" \"sample\">", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput190() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.DocumentType", "org.jsoup.nodes.DocumentType", "outerHtmlTail", new String[]{"java.lang.StringBuilder", "int", "org.jsoup.nodes.Document$OutputSettings"}, new String[]{"<sample:3>", "-2147483648", "<sample:2>"}, false, 1, new String[][]{});
  assertNull(actual);
  assertEquals("receiver state after the call", "<!DOCTYPE 0 PUBLIC \"sample\">", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput191() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.DocumentType", "org.jsoup.nodes.DocumentType", "setSiblingIndex", new String[]{"int"}, new String[]{"10"}, false, 1, new String[][]{});
  assertNull(actual);
  assertEquals("receiver state after the call", "<!DOCTYPE 0 PUBLIC \"sample\">", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput192() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jsoup.nodes.DocumentType", "org.jsoup.nodes.DocumentType", "removeAttr", new String[]{"java.lang.String"}, new String[]{"1M"}, false, 0, new String[][]{{"org.jsoup.nodes.DocumentType", "wrap", "java.lang.String", "\u00e8"}}), new String[][]{{"hasAttr", "java.lang.String", "2"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "<!DOCTYPE a PUBLIC \"0\" \"sample\">", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput193() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jsoup.nodes.DocumentType", "org.jsoup.nodes.DocumentType", "removeAttr", new String[]{"java.lang.String"}, new String[]{"Y"}, false, 0, new String[][]{{"org.jsoup.nodes.DocumentType", "wrap", "java.lang.String", "\u00e7"}}), new String[][]{{"hasAttr", "java.lang.String", "2"}, {"wrap", "java.lang.String", "7"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput194() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jsoup.nodes.DocumentType", "org.jsoup.nodes.DocumentType", "attr", new String[]{"java.lang.String", "java.lang.String"}, new String[]{"1.5", "<null>"}, false, 0, new String[][]{{"org.jsoup.nodes.DocumentType", "replaceWith", "org.jsoup.nodes.Node", "<sample:7>"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput195() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jsoup.nodes.DocumentType", "org.jsoup.nodes.DocumentType", "attr", new String[]{"java.lang.String", "java.lang.String"}, new String[]{"115", "<!DOCTYPtE"}, false, 0, new String[][]{{"org.jsoup.nodes.DocumentType", "replaceWith", "org.jsoup.nodes.Node", "<sample:0>"}}), new String[][]{{"absUrl", "java.lang.String", "7"}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("", String.valueOf(actual));
  assertEquals("receiver state after the call", "<!DOCTYPE a PUBLIC \"0\" \"sample\">", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput196() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.DocumentType", "org.jsoup.nodes.DocumentType", "traverse", new String[]{"org.jsoup.select.NodeVisitor"}, new String[]{"<sample:5>"}, false);
  assertNotNull(actual);
  assertEquals("org.jsoup.nodes.DocumentType", actual.getClass().getName());
  assertEquals("<!DOCTYPE a PUBLIC \"0\" \"sample\">", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "<!DOCTYPE a PUBLIC \"0\" \"sample\">", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput197() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jsoup.nodes.DocumentType", "org.jsoup.nodes.DocumentType", "traverse", new String[]{"org.jsoup.select.NodeVisitor"}, new String[]{"<sample:5>"}, false), new String[][]{{"siblingNodes", "", "1"}});
  assertNotNull(actual);
  assertEquals("java.util.Collections$EmptyList", actual.getClass().getName());
  assertEquals("[]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "<!DOCTYPE a PUBLIC \"0\" \"sample\">", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput198() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jsoup.nodes.DocumentType", "org.jsoup.nodes.DocumentType", "remove", new String[]{}, new String[]{}, false, 2, new String[][]{{"org.jsoup.nodes.DocumentType", "after", "org.jsoup.nodes.Node", "<sample:5>"}}, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput199() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jsoup.nodes.DocumentType", "org.jsoup.nodes.DocumentType", "replaceWith", new String[]{"org.jsoup.nodes.Node"}, new String[]{"<sample:4>"}, false, 6, new String[][]{}, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput200() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jsoup.nodes.DocumentType", "org.jsoup.nodes.DocumentType", "attributes", new String[]{}, new String[]{}, false, 14, new String[][]{{"org.jsoup.nodes.DocumentType", "siblingIndex", ""}}), new String[][]{{"clone", "", "4"}});
  assertNotNull(actual);
  assertEquals("org.jsoup.nodes.Attributes", actual.getClass().getName());
  assertEquals(" name=\"sample\" publicid=\"\" systemid=\"a\" {size=3}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "<!DOCTYPE sample \"a\">", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput201() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jsoup.nodes.DocumentType", "org.jsoup.nodes.DocumentType", "attributes", new String[]{}, new String[]{}, false, 15, new String[][]{{"org.jsoup.nodes.DocumentType", "siblingIndex", ""}}), new String[][]{{"clone", "", "4"}});
  assertNotNull(actual);
  assertEquals("org.jsoup.nodes.Attributes", actual.getClass().getName());
  assertEquals(" name=\"\" publicid=\"a\" systemid=\"0\" {size=3}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "<!DOCTYPE PUBLIC \"a\" \"0\">", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput202() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jsoup.nodes.DocumentType", "org.jsoup.nodes.DocumentType", "attributes", new String[]{}, new String[]{}, false, 15, new String[][]{{"org.jsoup.nodes.DocumentType", "siblingIndex", ""}, {"org.jsoup.nodes.DocumentType", "addChildren", "org.jsoup.nodes.Node[]", "<sample:0>"}, {"org.jsoup.nodes.DocumentType", "remove", ""}}), new String[][]{{"clone", "", "4"}});
  assertNotNull(actual);
  assertEquals("org.jsoup.nodes.Attributes", actual.getClass().getName());
  assertEquals(" name=\"\" publicid=\"a\" systemid=\"0\" {size=3}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "<!DOCTYPE PUBLIC \"a\" \"0\">a", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput203() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jsoup.nodes.DocumentType", "org.jsoup.nodes.DocumentType", "attributes", new String[]{}, new String[]{}, false, 16, new String[][]{{"org.jsoup.nodes.DocumentType", "siblingIndex", ""}, {"org.jsoup.nodes.DocumentType", "addChildren", "org.jsoup.nodes.Node[]", "<sample:0>"}, {"org.jsoup.nodes.DocumentType", "remove", ""}}), new String[][]{{"clone", "", "4"}});
  assertNotNull(actual);
  assertEquals("org.jsoup.nodes.Attributes", actual.getClass().getName());
  assertEquals(" name=\"a\" publicid=\"0\" systemid=\"sample\" {size=3}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "<!DOCTYPE a PUBLIC \"0\" \"sample\">a", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput204() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jsoup.nodes.DocumentType", "org.jsoup.nodes.DocumentType", "attributes", new String[]{}, new String[]{}, false, 17, new String[][]{{"org.jsoup.nodes.DocumentType", "siblingIndex", ""}, {"org.jsoup.nodes.DocumentType", "addChildren", "org.jsoup.nodes.Node[]", "<sample:0>"}, {"org.jsoup.nodes.DocumentType", "remove", ""}}), new String[][]{{"clone", "", "4"}});
  assertNotNull(actual);
  assertEquals("org.jsoup.nodes.Attributes", actual.getClass().getName());
  assertEquals(" name=\"0\" publicid=\"sample\" systemid=\"\" {size=3}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "<!DOCTYPE 0 PUBLIC \"sample\">a", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput205() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jsoup.nodes.DocumentType", "org.jsoup.nodes.DocumentType", "attributes", new String[]{}, new String[]{}, false, 17, new String[][]{{"org.jsoup.nodes.DocumentType", "siblingIndex", ""}, {"org.jsoup.nodes.DocumentType", "addChildren", "org.jsoup.nodes.Node[]", "<sample:0>"}, {"org.jsoup.nodes.DocumentType", "remove", ""}}, 1), new String[][]{{"clone", "", "4"}});
  assertNotNull(actual);
  assertEquals("org.jsoup.nodes.Attributes", actual.getClass().getName());
  assertEquals(" name=\"0\" public\u0131d=\"sample\" system\u0131d=\"\" {size=3}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "<!DOCTYPE 0>a", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput206() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jsoup.nodes.DocumentType", "org.jsoup.nodes.DocumentType", "attributes", new String[]{}, new String[]{}, false, 18, new String[][]{{"org.jsoup.nodes.DocumentType", "siblingIndex", ""}, {"org.jsoup.nodes.DocumentType", "addChildren", "org.jsoup.nodes.Node[]", "<sample:0>"}, {"org.jsoup.nodes.DocumentType", "remove", ""}}, 1), new String[][]{{"clone", "", "4"}});
  assertNotNull(actual);
  assertEquals("org.jsoup.nodes.Attributes", actual.getClass().getName());
  assertEquals(" name=\"sample\" public\u0131d=\"\" system\u0131d=\"a\" {size=3}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "<!DOCTYPE sample>a", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput207() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jsoup.nodes.DocumentType", "org.jsoup.nodes.DocumentType", "attributes", new String[]{}, new String[]{}, false, 19, new String[][]{{"org.jsoup.nodes.DocumentType", "siblingIndex", ""}, {"org.jsoup.nodes.DocumentType", "addChildren", "org.jsoup.nodes.Node[]", "<sample:0>"}, {"org.jsoup.nodes.DocumentType", "remove", ""}}, 1), new String[][]{{"clone", "", "4"}});
  assertNotNull(actual);
  assertEquals("org.jsoup.nodes.Attributes", actual.getClass().getName());
  assertEquals(" name=\"\" public\u0131d=\"a\" system\u0131d=\"0\" {size=3}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "<!DOCTYPE>a", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput208() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jsoup.nodes.DocumentType", "org.jsoup.nodes.DocumentType", "wrap", new String[]{"java.lang.String"}, new String[]{"publicId"}, false); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput209() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jsoup.nodes.DocumentType", "org.jsoup.nodes.DocumentType", "wrap", new String[]{"java.lang.String"}, new String[]{""}, false); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput210() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.DocumentType", "org.jsoup.nodes.DocumentType", "doClone", new String[]{"org.jsoup.nodes.Node"}, new String[]{"<sample:6>"}, false);
  assertNotNull(actual);
  assertEquals("org.jsoup.nodes.DocumentType", actual.getClass().getName());
  assertEquals("<!DOCTYPE a PUBLIC \"0\" \"sample\">", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "<!DOCTYPE a PUBLIC \"0\" \"sample\">", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput211() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jsoup.nodes.DocumentType", "org.jsoup.nodes.DocumentType", "doClone", new String[]{"org.jsoup.nodes.Node"}, new String[]{"<sample:6>"}, false), new String[][]{{"nextSibling", "", "3"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "<!DOCTYPE a PUBLIC \"0\" \"sample\">", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput212() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jsoup.nodes.DocumentType", "org.jsoup.nodes.DocumentType", "replaceChild", new String[]{"org.jsoup.nodes.Node", "org.jsoup.nodes.Node"}, new String[]{"<sample:1>", "<sample:7>"}, false, 0, new String[][]{{"org.jsoup.nodes.DocumentType", "addChildren", "org.jsoup.nodes.Node[]", "<sample:2>"}}, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput213() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.DocumentType", "org.jsoup.nodes.DocumentType", "childNodesCopy", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.jsoup.nodes.DocumentType", "wrap", "java.lang.String", "1.1234567"}, {"org.jsoup.nodes.DocumentType", "removeChild", "org.jsoup.nodes.Node", "<sample:5>"}});
  assertNotNull(actual);
  assertEquals("java.util.ArrayList", actual.getClass().getName());
  assertEquals("[]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "<!DOCTYPE a PUBLIC \"0\" \"sample\">", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput214() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.DocumentType", "org.jsoup.nodes.DocumentType", "childNodesCopy", new String[]{}, new String[]{}, false, 1, new String[][]{{"org.jsoup.nodes.DocumentType", "wrap", "java.lang.String", "1.1234567"}, {"org.jsoup.nodes.DocumentType", "removeChild", "org.jsoup.nodes.Node", "<sample:5>"}});
  assertNotNull(actual);
  assertEquals("java.util.ArrayList", actual.getClass().getName());
  assertEquals("[]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "<!DOCTYPE 0 PUBLIC \"sample\">", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput215() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.DocumentType", "org.jsoup.nodes.DocumentType", "childNodesCopy", new String[]{}, new String[]{}, false, 2, new String[][]{{"org.jsoup.nodes.DocumentType", "wrap", "java.lang.String", "1.1234567"}, {"org.jsoup.nodes.DocumentType", "removeChild", "org.jsoup.nodes.Node", "<sample:4>"}});
  assertNotNull(actual);
  assertEquals("java.util.ArrayList", actual.getClass().getName());
  assertEquals("[]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "<!DOCTYPE sample \"a\">", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput216() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.DocumentType", "org.jsoup.nodes.DocumentType", "childNodesCopy", new String[]{}, new String[]{}, false, 3, new String[][]{{"org.jsoup.nodes.DocumentType", "wrap", "java.lang.String", "1.1234567"}, {"org.jsoup.nodes.DocumentType", "removeChild", "org.jsoup.nodes.Node", "<sample:4>"}});
  assertNotNull(actual);
  assertEquals("java.util.ArrayList", actual.getClass().getName());
  assertEquals("[]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "<!DOCTYPE PUBLIC \"a\" \"0\">", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput217() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.DocumentType", "org.jsoup.nodes.DocumentType", "childNodesAsArray", new String[]{}, new String[]{}, false, 3, new String[][]{});
  assertNotNull(actual);
  assertEquals("[Lorg.jsoup.nodes.Node;", actual.getClass().getName());
  assertEquals("[]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "<!DOCTYPE PUBLIC \"a\" \"0\">", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput218() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.DocumentType", "org.jsoup.nodes.DocumentType", "childNodesAsArray", new String[]{}, new String[]{}, false, 3, new String[][]{}, 2);
  assertNotNull(actual);
  assertEquals("[Lorg.jsoup.nodes.Node;", actual.getClass().getName());
  assertEquals("[]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "<!DOCTYPE PUBLIC \"a\" \"0\">", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput219() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.DocumentType", "org.jsoup.nodes.DocumentType", "childNodesAsArray", new String[]{}, new String[]{}, false, 4, new String[][]{}, 2);
  assertNotNull(actual);
  assertEquals("[Lorg.jsoup.nodes.Node;", actual.getClass().getName());
  assertEquals("[]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "<!DOCTYPE a PUBLIC \"0\" \"sample\">", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput220() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.DocumentType", "org.jsoup.nodes.DocumentType", "childNodesAsArray", new String[]{}, new String[]{}, false, 5, new String[][]{}, 2);
  assertNotNull(actual);
  assertEquals("[Lorg.jsoup.nodes.Node;", actual.getClass().getName());
  assertEquals("[]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "<!DOCTYPE 0 PUBLIC \"sample\">", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput221() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.DocumentType", "org.jsoup.nodes.DocumentType", "childNodesAsArray", new String[]{}, new String[]{}, false, 6, new String[][]{{"org.jsoup.nodes.DocumentType", "childNodesAsArray", ""}}, 2);
  assertNotNull(actual);
  assertEquals("[Lorg.jsoup.nodes.Node;", actual.getClass().getName());
  assertEquals("[]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "<!DOCTYPE sample \"a\">", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput222() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.DocumentType", "org.jsoup.nodes.DocumentType", "childNodesAsArray", new String[]{}, new String[]{}, false, 13, new String[][]{}, 1);
  assertNotNull(actual);
  assertEquals("[Lorg.jsoup.nodes.Node;", actual.getClass().getName());
  assertEquals("[]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "<!DOCTYPE 0>", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput223() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.DocumentType", "org.jsoup.nodes.DocumentType", "childNodesAsArray", new String[]{}, new String[]{}, false, 14, new String[][]{}, 1);
  assertNotNull(actual);
  assertEquals("[Lorg.jsoup.nodes.Node;", actual.getClass().getName());
  assertEquals("[]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "<!DOCTYPE sample>", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput224() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.DocumentType", "org.jsoup.nodes.DocumentType", "childNodesAsArray", new String[]{}, new String[]{}, false, 15, new String[][]{}, 1);
  assertNotNull(actual);
  assertEquals("[Lorg.jsoup.nodes.Node;", actual.getClass().getName());
  assertEquals("[]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "<!DOCTYPE>", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput225() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.DocumentType", "org.jsoup.nodes.DocumentType", "childNodesAsArray", new String[]{}, new String[]{}, false, 16, new String[][]{}, 1);
  assertNotNull(actual);
  assertEquals("[Lorg.jsoup.nodes.Node;", actual.getClass().getName());
  assertEquals("[]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "<!DOCTYPE a>", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput226() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.DocumentType", "org.jsoup.nodes.DocumentType", "childNodesAsArray", new String[]{}, new String[]{}, false, 19, new String[][]{}, 3);
  assertNotNull(actual);
  assertEquals("[Lorg.jsoup.nodes.Node;", actual.getClass().getName());
  assertEquals("[]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "<!DOCTYPE PUBLIC \"a\" \"0\">", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput227() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jsoup.nodes.DocumentType", "org.jsoup.nodes.DocumentType", "childNodes", new String[]{}, new String[]{}, false, 3, new String[][]{{"org.jsoup.nodes.DocumentType", "nodeName", ""}, {"org.jsoup.nodes.DocumentType", "setBaseUri", "java.lang.String", "-1.5"}}), new String[][]{{"lastIndexOf", "java.lang.Object", "2"}, {"get", "int", "4"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IndexOutOfBoundsException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput228() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jsoup.nodes.DocumentType", "org.jsoup.nodes.DocumentType", "childNodes", new String[]{}, new String[]{}, false, 9, new String[][]{{"org.jsoup.nodes.DocumentType", "nodeName", ""}}, 2), new String[][]{{"lastIndexOf", "java.lang.Object", "2"}, {"get", "int", "4"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IndexOutOfBoundsException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput229() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.DocumentType", "org.jsoup.nodes.DocumentType", "toString", new String[]{}, new String[]{}, false);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("<!DOCTYPE a PUBLIC \"0\" \"sample\">", String.valueOf(actual));
  assertEquals("receiver state after the call", "<!DOCTYPE a PUBLIC \"0\" \"sample\">", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput230() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.DocumentType", "org.jsoup.nodes.DocumentType", "toString", new String[]{}, new String[]{}, false, 1, new String[][]{{"org.jsoup.nodes.DocumentType", "ownerDocument", ""}, {"org.jsoup.nodes.DocumentType", "indent", "java.lang.StringBuilder,int,org.jsoup.nodes.Document$OutputSettings", "<null>", "10", "<sample:6>"}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("<!DOCTYPE 0 PUBLIC \"sample\">", String.valueOf(actual));
  assertEquals("receiver state after the call", "<!DOCTYPE 0 PUBLIC \"sample\">", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput231() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.DocumentType", "org.jsoup.nodes.DocumentType", "toString", new String[]{}, new String[]{}, false, 2, new String[][]{{"org.jsoup.nodes.DocumentType", "ownerDocument", ""}, {"org.jsoup.nodes.DocumentType", "indent", "java.lang.StringBuilder,int,org.jsoup.nodes.Document$OutputSettings", "<null>", "10", "<sample:6>"}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("<!DOCTYPE sample \"a\">", String.valueOf(actual));
  assertEquals("receiver state after the call", "<!DOCTYPE sample \"a\">", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput232() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.DocumentType", "org.jsoup.nodes.DocumentType", "toString", new String[]{}, new String[]{}, false, 3, new String[][]{{"org.jsoup.nodes.DocumentType", "ownerDocument", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("<!DOCTYPE PUBLIC \"a\" \"0\">", String.valueOf(actual));
  assertEquals("receiver state after the call", "<!DOCTYPE PUBLIC \"a\" \"0\">", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput233() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.DocumentType", "org.jsoup.nodes.DocumentType", "toString", new String[]{}, new String[]{}, false, 7, new String[][]{{"org.jsoup.nodes.DocumentType", "getOutputSettings", ""}, {"org.jsoup.nodes.DocumentType", "ownerDocument", ""}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("<!DOCTYPE PUBLIC \"a\" \"0\">", String.valueOf(actual));
  assertEquals("receiver state after the call", "<!DOCTYPE>", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput234() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.DocumentType", "org.jsoup.nodes.DocumentType", "toString", new String[]{}, new String[]{}, false, 8, new String[][]{{"org.jsoup.nodes.DocumentType", "getOutputSettings", ""}, {"org.jsoup.nodes.DocumentType", "ownerDocument", ""}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("<!DOCTYPE a PUBLIC \"0\" \"sample\">", String.valueOf(actual));
  assertEquals("receiver state after the call", "<!DOCTYPE a>", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput235() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.DocumentType", "org.jsoup.nodes.DocumentType", "toString", new String[]{}, new String[]{}, false, 9, new String[][]{{"org.jsoup.nodes.DocumentType", "getOutputSettings", ""}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("<!DOCTYPE 0 PUBLIC \"sample\">", String.valueOf(actual));
  assertEquals("receiver state after the call", "<!DOCTYPE 0>", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput236() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.DocumentType", "org.jsoup.nodes.DocumentType", "toString", new String[]{}, new String[]{}, false, 10, new String[][]{{"org.jsoup.nodes.DocumentType", "getOutputSettings", ""}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("<!DOCTYPE sample \"a\">", String.valueOf(actual));
  assertEquals("receiver state after the call", "<!DOCTYPE sample>", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput237() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.DocumentType", "org.jsoup.nodes.DocumentType", "toString", new String[]{}, new String[]{}, false, 18, new String[][]{}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("<!DOCTYPE sample \"a\">", String.valueOf(actual));
  assertEquals("receiver state after the call", "<!DOCTYPE sample \"a\">", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput238() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.DocumentType", "org.jsoup.nodes.DocumentType", "toString", new String[]{}, new String[]{}, false, 17, new String[][]{}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("<!DOCTYPE 0 PUBLIC \"sample\">", String.valueOf(actual));
  assertEquals("receiver state after the call", "<!DOCTYPE 0 PUBLIC \"sample\">", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput239() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.DocumentType", "org.jsoup.nodes.DocumentType", "toString", new String[]{}, new String[]{}, false, 19, new String[][]{}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("<!DOCTYPE PUBLIC \"a\" \"0\">", String.valueOf(actual));
  assertEquals("receiver state after the call", "<!DOCTYPE PUBLIC \"a\" \"0\">", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput240() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.DocumentType", "org.jsoup.nodes.DocumentType", "toString", new String[]{}, new String[]{}, false, 20, new String[][]{}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("<!DOCTYPE a PUBLIC \"0\" \"sample\">", String.valueOf(actual));
  assertEquals("receiver state after the call", "<!DOCTYPE a PUBLIC \"0\" \"sample\">", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput241() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jsoup.nodes.DocumentType", "org.jsoup.nodes.DocumentType", "clone", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.jsoup.nodes.DocumentType", "setBaseUri", "java.lang.String", "123456789012345678901234567890"}}), new String[][]{{"baseUri", "", "5"}, {"baseUri", "", "5"}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("123456789012345678901234567890", String.valueOf(actual));
  assertEquals("receiver state after the call", "<!DOCTYPE a PUBLIC \"0\" \"sample\">", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput242() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jsoup.nodes.DocumentType", "org.jsoup.nodes.DocumentType", "clone", new String[]{}, new String[]{}, false, 1, new String[][]{{"org.jsoup.nodes.DocumentType", "setBaseUri", "java.lang.String", "010"}}), new String[][]{{"baseUri", "", "5"}, {"baseUri", "", "5"}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("010", String.valueOf(actual));
  assertEquals("receiver state after the call", "<!DOCTYPE 0 PUBLIC \"sample\">", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput243() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jsoup.nodes.DocumentType", "org.jsoup.nodes.DocumentType", "clone", new String[]{}, new String[]{}, false, 1, new String[][]{}), new String[][]{{"baseUri", "", "5"}, {"baseUri", "", "5"}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("a", String.valueOf(actual));
  assertEquals("receiver state after the call", "<!DOCTYPE 0 PUBLIC \"sample\">", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput244() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.DocumentType", "org.jsoup.nodes.DocumentType", "outerHtmlTail", new String[]{"java.lang.StringBuilder", "int", "org.jsoup.nodes.Document$OutputSettings"}, new String[]{"<null>", "10", "<sample:6>"}, false, 0, new String[][]{{"org.jsoup.nodes.DocumentType", "absUrl", "java.lang.String", "a b"}}, 2);
  assertNull(actual);
  assertEquals("receiver state after the call", "<!DOCTYPE a PUBLIC \"0\" \"sample\">", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput245() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.DocumentType", "org.jsoup.nodes.DocumentType", "childNodeSize", new String[]{}, new String[]{}, false, 2, new String[][]{});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "<!DOCTYPE sample \"a\">", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput246() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jsoup.nodes.DocumentType", "org.jsoup.nodes.DocumentType", "getOutputSettings", new String[]{}, new String[]{}, false, 4, new String[][]{{"org.jsoup.nodes.DocumentType", "outerHtmlTail", "java.lang.StringBuilder,int,org.jsoup.nodes.Document$OutputSettings", "<sample:0>", "2147483647", "<sample:7>"}, {"org.jsoup.nodes.DocumentType", "setParentNode", "org.jsoup.nodes.Node", "<null>"}}), new String[][]{{"charset", "java.lang.String", "7"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.nio.charset.UnsupportedCharsetException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput247() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.DocumentType", "org.jsoup.nodes.DocumentType", "hashCode", new String[]{}, new String[]{}, false, 2, new String[][]{{"org.jsoup.nodes.DocumentType", "unwrap", ""}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("567982857", String.valueOf(actual));
  assertEquals("receiver state after the call", "<!DOCTYPE sample \"a\">", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput248() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.DocumentType", "org.jsoup.nodes.DocumentType", "hashCode", new String[]{}, new String[]{}, false, 11, new String[][]{{"org.jsoup.nodes.DocumentType", "unwrap", ""}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("1471361443", String.valueOf(actual));
  assertEquals("receiver state after the call", "<!DOCTYPE PUBLIC \"a\" \"0\">", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput249() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jsoup.nodes.DocumentType", "org.jsoup.nodes.DocumentType", "replaceWith", new String[]{"org.jsoup.nodes.Node"}, new String[]{"<sample:5>"}, false, 0, new String[][]{{"org.jsoup.nodes.DocumentType", "unwrap", ""}, {"org.jsoup.nodes.DocumentType", "setSiblingIndex", "int", "2147483647"}}, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput250() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.DocumentType", "org.jsoup.nodes.DocumentType", "hasAttr", new String[]{"java.lang.String"}, new String[]{""}, false, 0, new String[][]{{"org.jsoup.nodes.DocumentType", "indent", "java.lang.StringBuilder,int,org.jsoup.nodes.Document$OutputSettings", "<sample:3>", "-1", "<sample:2>"}, {"org.jsoup.nodes.DocumentType", "childNodes", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "<!DOCTYPE a PUBLIC \"0\" \"sample\">", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput251() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.DocumentType", "org.jsoup.nodes.DocumentType", "setBaseUri", new String[]{"java.lang.String"}, new String[]{"123456789012345678901234567890"}, false, 0, new String[][]{{"org.jsoup.nodes.DocumentType", "unwrap", ""}});
  assertNull(actual);
  assertEquals("receiver state after the call", "<!DOCTYPE a PUBLIC \"0\" \"sample\">", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput252() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.DocumentType", "org.jsoup.nodes.DocumentType", "setBaseUri", new String[]{"java.lang.String"}, new String[]{"2:30:45TITLE"}, false, 1, new String[][]{});
  assertNull(actual);
  assertEquals("receiver state after the call", "<!DOCTYPE 0 PUBLIC \"sample\">", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput253() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jsoup.nodes.DocumentType", "org.jsoup.nodes.DocumentType", "childNode", new String[]{"int"}, new String[]{"-27"}, false, 12, new String[][]{{"org.jsoup.nodes.DocumentType", "toString", ""}, {"org.jsoup.nodes.DocumentType", "siblingIndex", ""}}, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IndexOutOfBoundsException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput254() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.DocumentType", "org.jsoup.nodes.DocumentType", "hashCode", new String[]{}, new String[]{}, false, 0, null, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("-1710662449", String.valueOf(actual));
  assertEquals("receiver state after the call", "<!DOCTYPE a PUBLIC \"0\" \"sample\">", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput255() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.DocumentType", "org.jsoup.nodes.DocumentType", "hashCode", new String[]{}, new String[]{}, false, 1, new String[][]{}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("-1448232596", String.valueOf(actual));
  assertEquals("receiver state after the call", "<!DOCTYPE 0 PUBLIC \"sample\">", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput256() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.DocumentType", "org.jsoup.nodes.DocumentType", "hashCode", new String[]{}, new String[]{}, false, 2, new String[][]{}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("567982857", String.valueOf(actual));
  assertEquals("receiver state after the call", "<!DOCTYPE sample \"a\">", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput257() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.DocumentType", "org.jsoup.nodes.DocumentType", "hashCode", new String[]{}, new String[]{}, false, 4, new String[][]{}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("-1710662449", String.valueOf(actual));
  assertEquals("receiver state after the call", "<!DOCTYPE a PUBLIC \"0\" \"sample\">", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput258() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.DocumentType", "org.jsoup.nodes.DocumentType", "childNodes", new String[]{}, new String[]{}, false, 7, new String[][]{{"org.jsoup.nodes.DocumentType", "before", "java.lang.String", "1.25"}});
  assertNotNull(actual);
  assertEquals("java.util.Collections$UnmodifiableRandomAccessList", actual.getClass().getName());
  assertEquals("[]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "<!DOCTYPE PUBLIC \"a\" \"0\">", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput259() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.DocumentType", "org.jsoup.nodes.DocumentType", "childNodes", new String[]{}, new String[]{}, false, 9, new String[][]{{"org.jsoup.nodes.DocumentType", "before", "java.lang.String", "1.35"}});
  assertNotNull(actual);
  assertEquals("java.util.Collections$UnmodifiableRandomAccessList", actual.getClass().getName());
  assertEquals("[]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "<!DOCTYPE 0 PUBLIC \"sample\">", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput260() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.DocumentType", "org.jsoup.nodes.DocumentType", "childNodes", new String[]{}, new String[]{}, false, 6, new String[][]{{"org.jsoup.nodes.DocumentType", "attr", "java.lang.String,java.lang.String", "abc", "1L"}, {"org.jsoup.nodes.DocumentType", "before", "java.lang.String", "\n"}});
  assertNotNull(actual);
  assertEquals("java.util.Collections$UnmodifiableRandomAccessList", actual.getClass().getName());
  assertEquals("[]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "<!DOCTYPE sample \"a\">", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput261() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jsoup.nodes.DocumentType", "org.jsoup.nodes.DocumentType", "siblingNodes", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.jsoup.nodes.DocumentType", "childNodeSize", ""}, {"org.jsoup.nodes.DocumentType", "setParentNode", "org.jsoup.nodes.Node", "<sample:5>"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput262() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.DocumentType", "org.jsoup.nodes.DocumentType", "absUrl", new String[]{"java.lang.String"}, new String[]{"0xFFFFFFFF"}, false, 0, new String[][]{{"org.jsoup.nodes.DocumentType", "outerHtmlHead", "java.lang.StringBuilder,int,org.jsoup.nodes.Document$OutputSettings", "<sample:2>", "1", "<sample:6>"}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("", String.valueOf(actual));
  assertEquals("receiver state after the call", "<!DOCTYPE a PUBLIC \"0\" \"sample\">", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput263() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jsoup.nodes.DocumentType", "org.jsoup.nodes.DocumentType", "after", new String[]{"java.lang.String"}, new String[]{"1.35"}, false, 0, new String[][]{{"org.jsoup.nodes.DocumentType", "setParentNode", "org.jsoup.nodes.Node", "<sample:5>"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.UnsupportedOperationException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput264() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jsoup.nodes.DocumentType", "org.jsoup.nodes.DocumentType", "after", new String[]{"java.lang.String"}, new String[]{"1.35"}, false, 0, new String[][]{{"org.jsoup.nodes.DocumentType", "setParentNode", "org.jsoup.nodes.Node", "<sample:2>"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IndexOutOfBoundsException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput265() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jsoup.nodes.DocumentType", "org.jsoup.nodes.DocumentType", "traverse", new String[]{"org.jsoup.select.NodeVisitor"}, new String[]{"<null>"}, false); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput266() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.DocumentType", "org.jsoup.nodes.DocumentType", "traverse", new String[]{"org.jsoup.select.NodeVisitor"}, new String[]{"<sample:6>"}, false, 3, new String[][]{});
  assertNotNull(actual);
  assertEquals("org.jsoup.nodes.DocumentType", actual.getClass().getName());
  assertEquals("<!DOCTYPE PUBLIC \"a\" \"0\">", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "<!DOCTYPE PUBLIC \"a\" \"0\">", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput267() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.DocumentType", "org.jsoup.nodes.DocumentType", "hasAttr", new String[]{"java.lang.String"}, new String[]{"-5"}, false, 0, new String[][]{{"org.jsoup.nodes.DocumentType", "after", "java.lang.String", "1L"}, {"org.jsoup.nodes.DocumentType", "setParentNode", "org.jsoup.nodes.Node", "<sample:5>"}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "<!DOCTYPE a PUBLIC \"0\" \"sample\">", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput268() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.DocumentType", "org.jsoup.nodes.DocumentType", "hasAttr", new String[]{"java.lang.String"}, new String[]{"-++"}, false, 7, new String[][]{{"org.jsoup.nodes.DocumentType", "after", "java.lang.String", "1LX"}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "<!DOCTYPE PUBLIC \"a\" \"0\">", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput269() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.DocumentType", "org.jsoup.nodes.DocumentType", "hasAttr", new String[]{"java.lang.String"}, new String[]{"-++ PUBLIC \""}, false, 7, new String[][]{});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "<!DOCTYPE PUBLIC \"a\" \"0\">", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput270() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jsoup.nodes.DocumentType", "org.jsoup.nodes.DocumentType", "before", new String[]{"java.lang.String"}, new String[]{"1.5f"}, false, 0, null, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput271() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.DocumentType", "org.jsoup.nodes.DocumentType", "setSiblingIndex", new String[]{"int"}, new String[]{"8"}, false, 15, new String[][]{{"org.jsoup.nodes.DocumentType", "addChildren", "int,org.jsoup.nodes.Node[]", "1", "<null>"}}, 2);
  assertNull(actual);
  assertEquals("receiver state after the call", "<!DOCTYPE PUBLIC \"a\" \"0\">", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput272() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jsoup.nodes.DocumentType", "org.jsoup.nodes.DocumentType", "after", new String[]{"org.jsoup.nodes.Node"}, new String[]{"<sample:6>"}, false, 0, null, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput273() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.DocumentType", "org.jsoup.nodes.DocumentType", "childNodesAsArray", new String[]{}, new String[]{}, false, 15, new String[][]{{"org.jsoup.nodes.DocumentType", "absUrl", "java.lang.String", "123456789012345678901234567890"}, {"org.jsoup.nodes.DocumentType", "addChildren", "org.jsoup.nodes.Node[]", "<sample:0>"}});
  assertNotNull(actual);
  assertEquals("[Lorg.jsoup.nodes.Node;", actual.getClass().getName());
  assertEquals("[a]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "<!DOCTYPE PUBLIC \"a\" \"0\">a", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput274() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.DocumentType", "org.jsoup.nodes.DocumentType", "childNodesAsArray", new String[]{}, new String[]{}, false, 16, new String[][]{{"org.jsoup.nodes.DocumentType", "addChildren", "org.jsoup.nodes.Node[]", "<sample:0>"}});
  assertNotNull(actual);
  assertEquals("[Lorg.jsoup.nodes.Node;", actual.getClass().getName());
  assertEquals("[a]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "<!DOCTYPE a PUBLIC \"0\" \"sample\">a", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput275() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.DocumentType", "org.jsoup.nodes.DocumentType", "childNodesAsArray", new String[]{}, new String[]{}, false, 16, new String[][]{{"org.jsoup.nodes.DocumentType", "addChildren", "org.jsoup.nodes.Node[]", "<sample:2>"}});
  assertNotNull(actual);
  assertEquals("[Lorg.jsoup.nodes.Node;", actual.getClass().getName());
  assertEquals("[<!DOCTYPE a PUBLIC \"0\" \"sample\">, \n<!--a-->, a]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "<!DOCTYPE a PUBLIC \"0\" \"sample\"><!DOCTYPE a PUBLIC \"0\" \"sample\">\n <!--a-->a", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput276() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.DocumentType", "org.jsoup.nodes.DocumentType", "childNodesAsArray", new String[]{}, new String[]{}, false, 16, new String[][]{{"org.jsoup.nodes.DocumentType", "addChildren", "org.jsoup.nodes.Node[]", "<sample:2>"}}, 3);
  assertNotNull(actual);
  assertEquals("[Lorg.jsoup.nodes.Node;", actual.getClass().getName());
  assertEquals("[<!DOCTYPE a PUBLIC \"0\" \"sample\">, \n<!--a-->, a]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "<!DOCTYPE a PUBLIC \"0\" \"sample\"><!DOCTYPE a PUBLIC \"0\" \"sample\">\n <!--a-->a", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput277() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.DocumentType", "org.jsoup.nodes.DocumentType", "childNodesAsArray", new String[]{}, new String[]{}, false, 16, new String[][]{}, 3);
  assertNotNull(actual);
  assertEquals("[Lorg.jsoup.nodes.Node;", actual.getClass().getName());
  assertEquals("[]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "<!DOCTYPE a PUBLIC \"0\" \"sample\">", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput278() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.DocumentType", "org.jsoup.nodes.DocumentType", "childNodesAsArray", new String[]{}, new String[]{}, false, 17, new String[][]{}, 3);
  assertNotNull(actual);
  assertEquals("[Lorg.jsoup.nodes.Node;", actual.getClass().getName());
  assertEquals("[]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "<!DOCTYPE 0 PUBLIC \"sample\">", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput279() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jsoup.nodes.DocumentType", "org.jsoup.nodes.DocumentType", "childNode", new String[]{"int"}, new String[]{"2147483647"}, false, 0, new String[][]{{"org.jsoup.nodes.DocumentType", "unwrap", ""}}, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IndexOutOfBoundsException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput280() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.DocumentType", "org.jsoup.nodes.DocumentType", "nextSibling", new String[]{}, new String[]{}, false);
  assertNull(actual);
  assertEquals("receiver state after the call", "<!DOCTYPE a PUBLIC \"0\" \"sample\">", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput281() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.DocumentType", "org.jsoup.nodes.DocumentType", "nextSibling", new String[]{}, new String[]{}, false, 1, new String[][]{});
  assertNull(actual);
  assertEquals("receiver state after the call", "<!DOCTYPE 0 PUBLIC \"sample\">", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput282() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.DocumentType", "org.jsoup.nodes.DocumentType", "nextSibling", new String[]{}, new String[]{}, false, 2, new String[][]{});
  assertNull(actual);
  assertEquals("receiver state after the call", "<!DOCTYPE sample \"a\">", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput283() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.DocumentType", "org.jsoup.nodes.DocumentType", "nextSibling", new String[]{}, new String[]{}, false, 3, new String[][]{});
  assertNull(actual);
  assertEquals("receiver state after the call", "<!DOCTYPE PUBLIC \"a\" \"0\">", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput284() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jsoup.nodes.DocumentType", "org.jsoup.nodes.DocumentType", "childNodes", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.jsoup.nodes.DocumentType", "after", "org.jsoup.nodes.Node", "<sample:3>"}}), new String[][]{{"size", "", "1"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "<!DOCTYPE a PUBLIC \"0\" \"sample\">", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput285() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.DocumentType", "org.jsoup.nodes.DocumentType", "ownerDocument", new String[]{}, new String[]{}, false, 2, new String[][]{}, 3);
  assertNull(actual);
  assertEquals("receiver state after the call", "<!DOCTYPE sample \"a\">", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput286() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.DocumentType", "org.jsoup.nodes.DocumentType", "ownerDocument", new String[]{}, new String[]{}, false, 3, new String[][]{}, 3);
  assertNull(actual);
  assertEquals("receiver state after the call", "<!DOCTYPE PUBLIC \"a\" \"0\">", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput287() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.DocumentType", "org.jsoup.nodes.DocumentType", "addChildren", new String[]{"org.jsoup.nodes.Node[]"}, new String[]{"<sample:2>"}, false, 0, new String[][]{{"org.jsoup.nodes.DocumentType", "outerHtmlTail", "java.lang.StringBuilder,int,org.jsoup.nodes.Document$OutputSettings", "<sample:0>", "0", "<null>"}, {"org.jsoup.nodes.DocumentType", "wrap", "java.lang.String", "2020-01-01"}}, 1);
  assertNull(actual);
  assertEquals("receiver state after the call", "<!DOCTYPE a><!DOCTYPE a>\n <!--a-->a", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput288() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.DocumentType", "org.jsoup.nodes.DocumentType", "addChildren", new String[]{"org.jsoup.nodes.Node[]"}, new String[]{"<empty>"}, false, 0, new String[][]{{"org.jsoup.nodes.DocumentType", "outerHtmlTail", "java.lang.StringBuilder,int,org.jsoup.nodes.Document$OutputSettings", "<sample:0>", "0", "<sample:7>"}, {"org.jsoup.nodes.DocumentType", "wrap", "java.lang.String", "2020-01-01"}}, 1);
  assertNull(actual);
  assertEquals("receiver state after the call", "<!DOCTYPE a>", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput289() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.DocumentType", "org.jsoup.nodes.DocumentType", "addChildren", new String[]{"org.jsoup.nodes.Node[]"}, new String[]{"<sample:1>"}, false, 0, new String[][]{{"org.jsoup.nodes.DocumentType", "outerHtmlTail", "java.lang.StringBuilder,int,org.jsoup.nodes.Document$OutputSettings", "<sample:0>", "0", "<sample:7>"}, {"org.jsoup.nodes.DocumentType", "wrap", "java.lang.String", "1L"}}, 1);
  assertNull(actual);
  assertEquals("receiver state after the call", "<!DOCTYPE a>\n <#root></#root><!DOCTYPE a>", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput290() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.DocumentType", "org.jsoup.nodes.DocumentType", "addChildren", new String[]{"org.jsoup.nodes.Node[]"}, new String[]{"<sample:0>"}, false, 0, new String[][]{{"org.jsoup.nodes.DocumentType", "outerHtmlTail", "java.lang.StringBuilder,int,org.jsoup.nodes.Document$OutputSettings", "<sample:0>", "-2147483648", "<sample:7>"}, {"org.jsoup.nodes.DocumentType", "wrap", "java.lang.String", "1L"}}, 1);
  assertNull(actual);
  assertEquals("receiver state after the call", "<!DOCTYPE a>a", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput291() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.DocumentType", "org.jsoup.nodes.DocumentType", "addChildren", new String[]{"int", "org.jsoup.nodes.Node[]"}, new String[]{"0", "<sample:0>"}, false, 0, new String[][]{{"org.jsoup.nodes.DocumentType", "outerHtmlTail", "java.lang.StringBuilder,int,org.jsoup.nodes.Document$OutputSettings", "<null>", "-1", "<sample:5>"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "<!DOCTYPE a PUBLIC \"0\" \"sample\">a", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput292() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.DocumentType", "org.jsoup.nodes.DocumentType", "addChildren", new String[]{"int", "org.jsoup.nodes.Node[]"}, new String[]{"0", "<sample:0>"}, false, 13, new String[][]{{"org.jsoup.nodes.DocumentType", "outerHtmlTail", "java.lang.StringBuilder,int,org.jsoup.nodes.Document$OutputSettings", "<null>", "-1", "<sample:5>"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "<!DOCTYPE 0 PUBLIC \"sample\">a", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput293() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.DocumentType", "org.jsoup.nodes.DocumentType", "nodeName", new String[]{}, new String[]{}, false, 7, new String[][]{{"org.jsoup.nodes.DocumentType", "removeChild", "org.jsoup.nodes.Node", "<sample:6>"}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("#doctype", String.valueOf(actual));
  assertEquals("receiver state after the call", "<!DOCTYPE>", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput294() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.DocumentType", "org.jsoup.nodes.DocumentType", "nodeName", new String[]{}, new String[]{}, false, 8, new String[][]{{"org.jsoup.nodes.DocumentType", "removeChild", "org.jsoup.nodes.Node", "<sample:6>"}, {"org.jsoup.nodes.DocumentType", "setBaseUri", "java.lang.String", "/a/b"}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("#doctype", String.valueOf(actual));
  assertEquals("receiver state after the call", "<!DOCTYPE a>", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput295() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.DocumentType", "org.jsoup.nodes.DocumentType", "nodeName", new String[]{}, new String[]{}, false, 9, new String[][]{{"org.jsoup.nodes.DocumentType", "getOutputSettings", ""}, {"org.jsoup.nodes.DocumentType", "removeChild", "org.jsoup.nodes.Node", "<sample:5>"}, {"org.jsoup.nodes.DocumentType", "setBaseUri", "java.lang.String", "/a/b"}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("#doctype", String.valueOf(actual));
  assertEquals("receiver state after the call", "<!DOCTYPE 0>", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput296() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.DocumentType", "org.jsoup.nodes.DocumentType", "nodeName", new String[]{}, new String[]{}, false, 10, new String[][]{{"org.jsoup.nodes.DocumentType", "getOutputSettings", ""}, {"org.jsoup.nodes.DocumentType", "removeChild", "org.jsoup.nodes.Node", "<sample:5>"}, {"org.jsoup.nodes.DocumentType", "setBaseUri", "java.lang.String", "/a//b"}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("#doctype", String.valueOf(actual));
  assertEquals("receiver state after the call", "<!DOCTYPE sample>", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput297() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.DocumentType", "org.jsoup.nodes.DocumentType", "nodeName", new String[]{}, new String[]{}, false, 13, new String[][]{}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("#doctype", String.valueOf(actual));
  assertEquals("receiver state after the call", "<!DOCTYPE 0 PUBLIC \"sample\">", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput298() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.DocumentType", "org.jsoup.nodes.DocumentType", "nodeName", new String[]{}, new String[]{}, false, 14, new String[][]{}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("#doctype", String.valueOf(actual));
  assertEquals("receiver state after the call", "<!DOCTYPE sample \"a\">", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput299() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.DocumentType", "org.jsoup.nodes.DocumentType", "nodeName", new String[]{}, new String[]{}, false, 15, new String[][]{{"org.jsoup.nodes.DocumentType", "childNodeSize", ""}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("#doctype", String.valueOf(actual));
  assertEquals("receiver state after the call", "<!DOCTYPE PUBLIC \"a\" \"0\">", SearchInputFactory_scaffolding.receiverState());
 }
}
