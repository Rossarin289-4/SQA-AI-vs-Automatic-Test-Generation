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
  try { SearchInputFactory_scaffolding.call("org.jsoup.nodes.PseudoTextElement", "org.jsoup.nodes.PseudoTextElement", "prependElement", new String[]{"java.lang.String"}, new String[]{"Title1.1134567890123456"}, false, 0, new String[][]{{"org.jsoup.nodes.PseudoTextElement", "getElementById", "java.lang.String", "/b/b"}, {"org.jsoup.nodes.PseudoTextElement", "is", "java.lang.String", "[^%s]"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput001() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jsoup.nodes.PseudoTextElement", "org.jsoup.nodes.PseudoTextElement", "getElementsContainingOwnText", new String[]{"java.lang.String"}, new String[]{"<a>b</a>"}, false, 3, new String[][]{{"org.jsoup.nodes.PseudoTextElement", "is", "java.lang.String", "a b#%s"}, {"org.jsoup.nodes.PseudoTextElement", "ownerDocument", ""}}), new String[][]{{"prevAll", "java.lang.String", "1"}});
  assertNotNull(actual);
  assertEquals("org.jsoup.select.Elements", actual.getClass().getName());
  assertEquals("[]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", " {hasParent=false, hasText=false, isBlock=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput002() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.PseudoTextElement", "org.jsoup.nodes.PseudoTextElement", "getElementsByAttributeStarting", new String[]{"java.lang.String"}, new String[]{".%s0x123456789"}, false, 3, new String[][]{{"org.jsoup.nodes.PseudoTextElement", "childNodesAsArray", ""}}, 3);
  assertNotNull(actual);
  assertEquals("org.jsoup.select.Elements", actual.getClass().getName());
  assertEquals("[]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", " {hasParent=false, hasText=false, isBlock=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput003() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.select.Evaluator", "org.jsoup.select.CombiningEvaluator$And", "matches", new String[]{"org.jsoup.nodes.Element", "org.jsoup.nodes.Element"}, new String[]{"<sample:7>", "<sample:6>"}, false, 1, new String[][]{{"org.jsoup.select.Evaluator", "matches", "org.jsoup.nodes.Element,org.jsoup.nodes.Element", "<sample:6>", "<sample:0>"}, {"org.jsoup.select.Evaluator", "matches", "org.jsoup.nodes.Element,org.jsoup.nodes.Element", "<sample:4>", "<sample:1>"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "[a] [^a] [a=0]", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput004() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jsoup.nodes.PseudoTextElement", "org.jsoup.nodes.PseudoTextElement", "attributes", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.jsoup.nodes.PseudoTextElement", "getElementsByAttributeValueContaining", "java.lang.String,java.lang.String", "ab1.12345678", "\"%s"}}), new String[][]{{"hasKeyIgnoreCase", "java.lang.String", "3"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput005() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jsoup.nodes.PseudoTextElement", "org.jsoup.nodes.PseudoTextElement", "getElementsByIndexGreaterThan", new String[]{"int"}, new String[]{"-2147483583"}, false, 0, new String[][]{{"org.jsoup.nodes.PseudoTextElement", "child", "int", "-1073741791"}}, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput006() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.PseudoTextElement", "org.jsoup.nodes.PseudoTextElement", "select", new String[]{"java.lang.String"}, new String[]{"[%s$=%r]"}, false, 3, new String[][]{{"org.jsoup.nodes.PseudoTextElement", "filter", "org.jsoup.select.NodeFilter", "<sample:4>"}}, 2);
  assertNotNull(actual);
  assertEquals("org.jsoup.select.Elements", actual.getClass().getName());
  assertEquals("[]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", " {hasParent=false, hasText=false, isBlock=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput007() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.PseudoTextElement", "org.jsoup.nodes.PseudoTextElement", "is", new String[]{"java.lang.String"}, new String[]{"[%r%ss]"}, false, 3, new String[][]{});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", " {hasParent=false, hasText=false, isBlock=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput008() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jsoup.nodes.PseudoTextElement", "org.jsoup.nodes.PseudoTextElement", "select", new String[]{"java.lang.String"}, new String[]{"+1"}, false); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput009() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.PseudoTextElement", "org.jsoup.nodes.PseudoTextElement", "is", new String[]{"org.jsoup.select.Evaluator"}, new String[]{"<sample:12>"}, false, 7, new String[][]{{"org.jsoup.nodes.PseudoTextElement", "dataset", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", " {hasParent=false, hasText=false, isBlock=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput010() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jsoup.nodes.PseudoTextElement", "org.jsoup.nodes.PseudoTextElement", "root", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.jsoup.nodes.PseudoTextElement", "select", "java.lang.String", "[%s!=%ss]"}}), new String[][]{{"getElementsMatchingOwnText", "java.util.regex.Pattern", "5"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput011() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jsoup.nodes.PseudoTextElement", "org.jsoup.nodes.PseudoTextElement", "getElementsByIndexGreaterThan", new String[]{"int"}, new String[]{"2147483647"}, false, 0, new String[][]{{"org.jsoup.nodes.PseudoTextElement", "child", "int", "2147483647"}, {"org.jsoup.nodes.PseudoTextElement", "is", "java.lang.String", "[%s^=%s]"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput012() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jsoup.nodes.PseudoTextElement", "org.jsoup.nodes.PseudoTextElement", "getElementsMatchingText", new String[]{"java.util.regex.Pattern"}, new String[]{"<sample:3>"}, false, 3, new String[][]{{"org.jsoup.nodes.PseudoTextElement", "prepend", "java.lang.String", "TitDe"}, {"org.jsoup.nodes.PseudoTextElement", "select", "java.lang.String", "[%s =%s]"}}), new String[][]{{"hasClass", "java.lang.String", "7"}, {"outerHtml", "", "2"}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("\n TitDe", String.valueOf(actual));
  assertEquals("receiver state after the call", "\n TitDe {hasParent=false, hasText=true, isBlock=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput013() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jsoup.nodes.PseudoTextElement", "org.jsoup.nodes.PseudoTextElement", "prependChild", new String[]{"org.jsoup.nodes.Node"}, new String[]{"<sample:4>"}, false, 0, new String[][]{{"org.jsoup.nodes.PseudoTextElement", "getElementsByIndexEquals", "int", "0"}, {"org.jsoup.nodes.PseudoTextElement", "siblingElements", ""}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput014() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jsoup.nodes.PseudoTextElement", "org.jsoup.nodes.PseudoTextElement", "replaceWith", new String[]{"org.jsoup.nodes.Node"}, new String[]{"<sample:0>"}, false, 4, new String[][]{{"org.jsoup.nodes.PseudoTextElement", "selectFirst", "java.lang.String", ":eq(%~"}}, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput015() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.PseudoTextElement", "org.jsoup.nodes.PseudoTextElement", "is", new String[]{"java.lang.String"}, new String[]{"[%s*=%s\\[%s~=%s]:containsOwn(%s)"}, false, 0, new String[][]{{"org.jsoup.nodes.PseudoTextElement", "appendTo", "org.jsoup.nodes.Element", "<sample:4>"}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput016() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jsoup.nodes.PseudoTextElement", "org.jsoup.nodes.PseudoTextElement", "select", new String[]{"java.lang.String"}, new String[]{"21~47483648Title"}, false, 4, new String[][]{{"org.jsoup.nodes.PseudoTextElement", "appendElement", "java.lang.String", "[%s$=9s"}, {"org.jsoup.nodes.PseudoTextElement", "absUrl", "java.lang.String", "[)s=%s\\"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput017() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jsoup.nodes.PseudoTextElement", "org.jsoup.nodes.PseudoTextElement", "getElementsByAttributeValueContaining", new String[]{"java.lang.String", "java.lang.String"}, new String[]{"\"", "''"}, false, 0, new String[][]{{"org.jsoup.nodes.PseudoTextElement", "addClass", "java.lang.String", "1.6d"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput018() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jsoup.nodes.PseudoTextElement", "org.jsoup.nodes.PseudoTextElement", "select", new String[]{"java.lang.String"}, new String[]{"a,b+c1.11345678[%s~=%s]"}, false); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput019() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.select.Evaluator", "org.jsoup.select.CombiningEvaluator$And", "matches", new String[]{"org.jsoup.nodes.Element", "org.jsoup.nodes.Element"}, new String[]{"<sample:2>", "<sample:4>"}, false, 3, new String[][]{});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "[a=0] [a*=0]", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput020() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jsoup.nodes.PseudoTextElement", "org.jsoup.nodes.PseudoTextElement", "getElementsByAttributeValue", new String[]{"java.lang.String", "java.lang.String"}, new String[]{"12:30:45-0.0", "\""}, false); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.StringIndexOutOfBoundsException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput021() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jsoup.nodes.PseudoTextElement", "org.jsoup.nodes.PseudoTextElement", "getElementsByAttributeValueEnding", new String[]{"java.lang.String", "java.lang.String"}, new String[]{"2020-02-30T25:6", "'ttp://examqle.com/a?b=c"}, false, 5, new String[][]{{"org.jsoup.nodes.PseudoTextElement", "getElementsByAttributeValueContaining", "java.lang.String,java.lang.String", "abd", "a,b,c"}, {"org.jsoup.nodes.PseudoTextElement", "getElementsByIndexLessThan", "int", "2147483647"}}), new String[][]{{"attr", "java.lang.String", "3"}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("", String.valueOf(actual));
  assertEquals("receiver state after the call", " {hasParent=false, hasText=false, isBlock=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput022() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.select.Evaluator", "org.jsoup.select.CombiningEvaluator$And", "matches", new String[]{"org.jsoup.nodes.Element", "org.jsoup.nodes.Element"}, new String[]{"<null>", "<sample:9>"}, false, 7, new String[][]{{"org.jsoup.select.Evaluator", "matches", "org.jsoup.nodes.Element,org.jsoup.nodes.Element", "<sample:6>", "<sample:7>"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "[a!=0] [a^=0] .a", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput023() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jsoup.nodes.PseudoTextElement", "org.jsoup.nodes.PseudoTextElement", "select", new String[]{"java.lang.String"}, new String[]{"Title1.11345678901234#56-0.0"}, false); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput024() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.select.Evaluator", "org.jsoup.select.CombiningEvaluator$And", "matches", new String[]{"org.jsoup.nodes.Element", "org.jsoup.nodes.Element"}, new String[]{"<sample:0>", "<sample:3>"}, false, 5, new String[][]{{"org.jsoup.select.Evaluator", "matches", "org.jsoup.nodes.Element,org.jsoup.nodes.Element", "<sample:3>", "<sample:6>"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "[a$=0]", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput025() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jsoup.nodes.PseudoTextElement", "org.jsoup.nodes.PseudoTextElement", "selectFirst", new String[]{"java.lang.String"}, new String[]{"1.1123>45678"}, false, 2, new String[][]{}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput026() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jsoup.nodes.PseudoTextElement", "org.jsoup.nodes.PseudoTextElement", "selectFirst", new String[]{"java.lang.String"}, new String[]{"\n:contains(%s)"}, false, 0, new String[][]{{"org.jsoup.nodes.PseudoTextElement", "tagName", ""}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput027() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jsoup.nodes.PseudoTextElement", "org.jsoup.nodes.PseudoTextElement", "is", new String[]{"java.lang.String"}, new String[]{"2147483648"}, false, 0, new String[][]{{"org.jsoup.nodes.PseudoTextElement", "getElementsByAttributeValueNot", "java.lang.String,java.lang.String", "[#s$=%s]", "a bb"}, {"org.jsoup.nodes.PseudoTextElement", "getElementsByAttributeValueNot", "java.lang.String,java.lang.String", "1eA/ ", "\r\n"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput028() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.PseudoTextElement", "org.jsoup.nodes.PseudoTextElement", "is", new String[]{"java.lang.String"}, new String[]{"1.12,345true"}, false, 5, new String[][]{{"org.jsoup.nodes.PseudoTextElement", "getElementsByClass", "java.lang.String", "+1:%(%dn)"}, {"org.jsoup.nodes.PseudoTextElement", "text", "java.lang.String", "0x123456789"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "\n 0x123456789 {hasParent=false, hasText=true, isBlock=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput029() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jsoup.select.QueryParser", "org.jsoup.select.QueryParser", "parse", new String[]{"java.lang.String"}, new String[]{"a,b,c1.11345678[%s~=%u]:containsData(%s)"}, true, 0, null, 3), new String[][]{{"add", "org.jsoup.select.Evaluator", "2"}});
  assertNotNull(actual);
  assertEquals("org.jsoup.select.CombiningEvaluator$Or", actual.getClass().getName());
  assertEquals("a, b, c1 .11345678 [%s~=%u] :containsData(%s), *", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput030() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jsoup.nodes.PseudoTextElement", "org.jsoup.nodes.PseudoTextElement", "getElementsByIndexEquals", new String[]{"int"}, new String[]{"4116"}, false, 7, new String[][]{{"org.jsoup.nodes.PseudoTextElement", "getElementsContainingText", "java.lang.String", "[%s=%s]"}}), new String[][]{{"listIterator", "", "1"}, {"previousIndex", "", "5"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("-1", String.valueOf(actual));
  assertEquals("receiver state after the call", " {hasParent=false, hasText=false, isBlock=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput031() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.PseudoTextElement", "org.jsoup.nodes.PseudoTextElement", "getElementsMatchingOwnText", new String[]{"java.util.regex.Pattern"}, new String[]{"<sample:0>"}, false, 5, new String[][]{{"org.jsoup.nodes.PseudoTextElement", "is", "org.jsoup.select.Evaluator", "<sample:8>"}}, 3);
  assertNotNull(actual);
  assertEquals("org.jsoup.select.Elements", actual.getClass().getName());
  assertEquals("[]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", " {hasParent=false, hasText=false, isBlock=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput032() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.PseudoTextElement", "org.jsoup.nodes.PseudoTextElement", "is", new String[]{"java.lang.String"}, new String[]{"**"}, false, 1, new String[][]{{"org.jsoup.nodes.PseudoTextElement", "getElementsByAttributeValueNot", "java.lang.String,java.lang.String", "1.12245672020-01-01", "1.5ffTITLEtrue"}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput033() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jsoup.nodes.PseudoTextElement", "org.jsoup.nodes.PseudoTextElement", "append", new String[]{"java.lang.String"}, new String[]{"123456789012345678901234567890:eq(%d)"}, false, 6, new String[][]{}, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput034() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.PseudoTextElement", "org.jsoup.nodes.PseudoTextElement", "setParentNode", new String[]{"org.jsoup.nodes.Node"}, new String[]{"<sample:3>"}, false, 7, new String[][]{{"org.jsoup.nodes.PseudoTextElement", "html", "java.lang.String", "a Xb"}}, 2);
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput035() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.PseudoTextElement", "org.jsoup.nodes.PseudoTextElement", "hasText", new String[]{}, new String[]{}, false, 3, new String[][]{{"org.jsoup.nodes.PseudoTextElement", "outerHtmlHead", "java.lang.Appendable,int,org.jsoup.nodes.Document$OutputSettings", "<sample:0>", "0", "<null>"}, {"org.jsoup.nodes.PseudoTextElement", "prepend", "java.lang.String", "00xFFFFFFFF."}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
  assertEquals("receiver state after the call", "\n 00xFFFFFFFF. {hasParent=false, hasText=true, isBlock=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput036() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jsoup.nodes.PseudoTextElement", "org.jsoup.nodes.PseudoTextElement", "getElementsMatchingText", new String[]{"java.util.regex.Pattern"}, new String[]{"<sample:3>"}, false, 0, new String[][]{{"org.jsoup.nodes.PseudoTextElement", "filter", "org.jsoup.select.NodeFilter", "<sample:5>"}}, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput037() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jsoup.nodes.PseudoTextElement", "org.jsoup.nodes.PseudoTextElement", "getElementsByClass", new String[]{"java.lang.String"}, new String[]{"B-"}, false, 1, new String[][]{{"org.jsoup.nodes.PseudoTextElement", "insertChildren", "int,java.util.Collection", "20", "<sample:0>"}}, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput038() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.PseudoTextElement", "org.jsoup.nodes.PseudoTextElement", "parent", new String[]{}, new String[]{}, false, 3, new String[][]{{"org.jsoup.nodes.PseudoTextElement", "dataset", ""}}, 3);
  assertNull(actual);
  assertEquals("receiver state after the call", " {hasParent=false, hasText=false, isBlock=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput039() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jsoup.nodes.PseudoTextElement", "org.jsoup.nodes.PseudoTextElement", "siblingElements", new String[]{}, new String[]{}, false, 1, new String[][]{}, 3), new String[][]{{"subList", "int,int", "3"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IndexOutOfBoundsException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput040() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.PseudoTextElement", "org.jsoup.nodes.PseudoTextElement", "reparentChild", new String[]{"org.jsoup.nodes.Node"}, new String[]{"<sample:3>"}, false, 0, new String[][]{{"org.jsoup.nodes.PseudoTextElement", "append", "java.lang.String", "1/5d"}}, 3);
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput041() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jsoup.nodes.PseudoTextElement", "org.jsoup.nodes.PseudoTextElement", "before", new String[]{"java.lang.String"}, new String[]{"2020-01-01"}, false, 5, new String[][]{}, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput042() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jsoup.nodes.PseudoTextElement", "org.jsoup.nodes.PseudoTextElement", "getElementsByAttributeValueMatching", new String[]{"java.lang.String", "java.util.regex.Pattern"}, new String[]{"1.12345678", "<sample:0>"}, false, 0, null, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput043() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jsoup.nodes.PseudoTextElement", "org.jsoup.nodes.PseudoTextElement", "getAllElements", new String[]{}, new String[]{}, false, 0, null, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput044() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.PseudoTextElement", "org.jsoup.nodes.PseudoTextElement", "doSetBaseUri", new String[]{"java.lang.String"}, new String[]{"  "}, false, 5, new String[][]{{"org.jsoup.nodes.PseudoTextElement", "replaceChild", "org.jsoup.nodes.Node,org.jsoup.nodes.Node", "<sample:4>", "<sample:0>"}}, 1);
  assertNull(actual);
  assertEquals("receiver state after the call", " {hasParent=false, hasText=false, isBlock=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput045() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jsoup.nodes.PseudoTextElement", "org.jsoup.nodes.PseudoTextElement", "getElementsByAttributeValueNot", new String[]{"java.lang.String", "java.lang.String"}, new String[]{"1e1/", ":%s(%d)"}, false, 0, null, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput046() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.PseudoTextElement", "org.jsoup.nodes.PseudoTextElement", "getElementsByAttributeValueEnding", new String[]{"java.lang.String", "java.lang.String"}, new String[]{"-1", "/a/b0x123456789"}, false, 3, new String[][]{{"org.jsoup.nodes.PseudoTextElement", "clone", ""}}, 2);
  assertNotNull(actual);
  assertEquals("org.jsoup.select.Elements", actual.getClass().getName());
  assertEquals("[]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", " {hasParent=false, hasText=false, isBlock=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput047() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.PseudoTextElement", "org.jsoup.nodes.PseudoTextElement", "getElementsByAttributeValueMatching", new String[]{"java.lang.String", "java.util.regex.Pattern"}, new String[]{"1.12345678901234567", "<sample:0>"}, false, 5, new String[][]{}, 1);
  assertNotNull(actual);
  assertEquals("org.jsoup.select.Elements", actual.getClass().getName());
  assertEquals("[]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", " {hasParent=false, hasText=false, isBlock=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput048() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jsoup.nodes.PseudoTextElement", "org.jsoup.nodes.PseudoTextElement", "outerHtml", new String[]{"java.lang.Appendable"}, new String[]{"<sample:4>"}, false, 4, new String[][]{{"org.jsoup.nodes.PseudoTextElement", "replaceWith", "org.jsoup.nodes.Node", "<sample:4>"}}, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput049() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jsoup.nodes.PseudoTextElement", "org.jsoup.nodes.PseudoTextElement", "lastElementSibling", new String[]{}, new String[]{}, false, 0, null, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput050() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jsoup.nodes.PseudoTextElement", "org.jsoup.nodes.PseudoTextElement", "before", new String[]{"org.jsoup.nodes.Node"}, new String[]{"<sample:6>"}, false, 0, new String[][]{{"org.jsoup.nodes.PseudoTextElement", "getElementsByAttributeValueEnding", "java.lang.String,java.lang.String", "1o5", "[^%]"}}, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput051() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.PseudoTextElement", "org.jsoup.nodes.PseudoTextElement", "id", new String[]{}, new String[]{}, false, 1, new String[][]{}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput052() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.PseudoTextElement", "org.jsoup.nodes.PseudoTextElement", "classNames", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.jsoup.nodes.PseudoTextElement", "attr", "java.lang.String", "-1[%s$=%s]"}, {"org.jsoup.nodes.PseudoTextElement", "hasClass", "java.lang.String", "\r\n\n"}}, 1);
  assertNotNull(actual);
  assertEquals("java.util.LinkedHashSet", actual.getClass().getName());
  assertEquals("[]", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput053() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jsoup.nodes.PseudoTextElement", "org.jsoup.nodes.PseudoTextElement", "dataset", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.jsoup.nodes.PseudoTextElement", "after", "java.lang.String", "123456789012345678901234567890"}}, 1), new String[][]{{"keySet", "", "1"}, {"iterator", "", "6"}});
  assertNotNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput054() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jsoup.nodes.PseudoTextElement", "org.jsoup.nodes.PseudoTextElement", "text", new String[]{"java.lang.String"}, new String[]{"a"}, false, 0, null, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput055() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jsoup.nodes.PseudoTextElement", "org.jsoup.nodes.PseudoTextElement", "before", new String[]{"java.lang.String"}, new String[]{"FSitle"}, false, 0, new String[][]{{"org.jsoup.nodes.PseudoTextElement", "addClass", "java.lang.String", "[%s!=%s]"}}, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput056() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.PseudoTextElement", "org.jsoup.nodes.PseudoTextElement", "indent", new String[]{"java.lang.Appendable", "int", "org.jsoup.nodes.Document$OutputSettings"}, new String[]{"<empty>", "10", "<sample:6>"}, false, 0, new String[][]{{"org.jsoup.nodes.PseudoTextElement", "getElementsByAttribute", "java.lang.String", "a"}}, 1);
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput057() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.PseudoTextElement", "org.jsoup.nodes.PseudoTextElement", "hasAttributes", new String[]{}, new String[]{}, false, 0, null, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput058() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jsoup.nodes.PseudoTextElement", "org.jsoup.nodes.PseudoTextElement", "getElementsByAttribute", new String[]{"java.lang.String"}, new String[]{":-5d"}, false, 4, new String[][]{}, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput059() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jsoup.nodes.PseudoTextElement", "org.jsoup.nodes.PseudoTextElement", "prependElement", new String[]{"java.lang.String"}, new String[]{"http://example.com/a?b=c:%s(%d)a,b,c"}, false, 6, new String[][]{}, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput060() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jsoup.nodes.PseudoTextElement", "org.jsoup.nodes.PseudoTextElement", "prependElement", new String[]{"java.lang.String"}, new String[]{"1.123345678901234567"}, false, 0, new String[][]{{"org.jsoup.nodes.PseudoTextElement", "prependChild", "org.jsoup.nodes.Node", "<sample:9>"}, {"org.jsoup.nodes.PseudoTextElement", "toggleClass", "java.lang.String", "(("}}, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput061() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jsoup.nodes.PseudoTextElement", "org.jsoup.nodes.PseudoTextElement", "getElementsByAttributeValueMatching", new String[]{"java.lang.String", "java.util.regex.Pattern"}, new String[]{"", "<sample:3>"}, false, 2, new String[][]{}, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput062() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jsoup.nodes.PseudoTextElement", "org.jsoup.nodes.PseudoTextElement", "appendText", new String[]{"java.lang.String"}, new String[]{"32147483648"}, false, 0, new String[][]{{"org.jsoup.nodes.PseudoTextElement", "attr", "java.lang.String,boolean", "C5", "false"}}, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput063() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jsoup.nodes.PseudoTextElement", "org.jsoup.nodes.PseudoTextElement", "getElementsByAttributeValueMatching", new String[]{"java.lang.String", "java.util.regex.Pattern"}, new String[]{"a,b,'", "<sample:1>"}, false, 0, new String[][]{{"org.jsoup.nodes.PseudoTextElement", "appendTo", "org.jsoup.nodes.Element", "<sample:7>"}}, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput064() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jsoup.nodes.PseudoTextElement", "org.jsoup.nodes.PseudoTextElement", "is", new String[]{"java.lang.String"}, new String[]{"2.5e300:contbinsOwn(%s)1.25"}, false, 3, new String[][]{{"org.jsoup.nodes.PseudoTextElement", "getElementsByAttributeValueMatching", "java.lang.String,java.util.regex.Pattern", "Hello, World", "<sample:0>"}, {"org.jsoup.nodes.PseudoTextElement", "parent", ""}}, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("org.jsoup.select.Selector$SelectorParseException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput065() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.PseudoTextElement", "org.jsoup.nodes.PseudoTextElement", "absUrl", new String[]{"java.lang.String"}, new String[]{"/a/b1.12345678901234567"}, false, 0, new String[][]{{"org.jsoup.nodes.PseudoTextElement", "reparentChild", "org.jsoup.nodes.Node", "<sample:4>"}, {"org.jsoup.nodes.PseudoTextElement", "addClass", "java.lang.String", "Hells, Wold"}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput066() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jsoup.nodes.PseudoTextElement", "org.jsoup.nodes.PseudoTextElement", "before", new String[]{"java.lang.String"}, new String[]{"#%s2020-02-30T25:61:61"}, false, 0, new String[][]{{"org.jsoup.nodes.PseudoTextElement", "hasText", ""}, {"org.jsoup.nodes.PseudoTextElement", "appendChild", "org.jsoup.nodes.Node", "<sample:8>"}}, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput067() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jsoup.nodes.PseudoTextElement", "org.jsoup.nodes.PseudoTextElement", "prependChild", new String[]{"org.jsoup.nodes.Node"}, new String[]{"<sample:6>"}, false, 0, new String[][]{{"org.jsoup.nodes.PseudoTextElement", "outerHtmlHead", "java.lang.Appendable,int,org.jsoup.nodes.Document$OutputSettings", "<sample:0>", "-2147482559", "<sample:3>"}, {"org.jsoup.nodes.PseudoTextElement", "doSetBaseUri", "java.lang.String", "ao"}}, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput068() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.PseudoTextElement", "org.jsoup.nodes.PseudoTextElement", "setParentNode", new String[]{"org.jsoup.nodes.Node"}, new String[]{"<sample:0>"}, false, 0, new String[][]{{"org.jsoup.nodes.PseudoTextElement", "clearAttributes", ""}}, 1);
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput069() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jsoup.nodes.PseudoTextElement", "org.jsoup.nodes.PseudoTextElement", "getElementsByAttributeValueEnding", new String[]{"java.lang.String", "java.lang.String"}, new String[]{"0.5", ""}, false, 7, new String[][]{}, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput070() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jsoup.nodes.PseudoTextElement", "org.jsoup.nodes.PseudoTextElement", "childNodes", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.jsoup.nodes.PseudoTextElement", "ownerDocument", ""}}, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput071() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.PseudoTextElement", "org.jsoup.nodes.PseudoTextElement", "dataset", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.jsoup.nodes.PseudoTextElement", "dataNodes", ""}, {"org.jsoup.nodes.PseudoTextElement", "prepend", "java.lang.String", "\u00e9"}}, 3);
  assertNotNull(actual);
  assertEquals("org.jsoup.nodes.Attributes$Dataset", actual.getClass().getName());
  assertEquals("{}", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput072() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.PseudoTextElement", "org.jsoup.nodes.PseudoTextElement", "outerHtml", new String[]{"java.lang.Appendable"}, new String[]{"<sample:4>"}, false, 3, new String[][]{}, 1);
  assertNull(actual);
  assertEquals("receiver state after the call", " {hasParent=false, hasText=false, isBlock=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput073() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jsoup.nodes.PseudoTextElement", "org.jsoup.nodes.PseudoTextElement", "ownText", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.jsoup.nodes.PseudoTextElement", "indent", "java.lang.Appendable,int,org.jsoup.nodes.Document$OutputSettings", "<sample:3>", "2147483647", "<sample:8>"}}, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput074() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jsoup.nodes.PseudoTextElement", "org.jsoup.nodes.PseudoTextElement", "classNames", new String[]{}, new String[]{}, false, 3, new String[][]{{"org.jsoup.nodes.PseudoTextElement", "filter", "org.jsoup.select.NodeFilter", "<sample:2>"}}, 3), new String[][]{{"iterator", "", "3"}});
  assertNotNull(actual);
  assertEquals("java.util.LinkedHashMap$LinkedKeyIterator", actual.getClass().getName());
  assertEquals("{hasNext=false}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", " {hasParent=false, hasText=false, isBlock=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput075() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jsoup.nodes.PseudoTextElement", "org.jsoup.nodes.PseudoTextElement", "getElementsByClass", new String[]{"java.lang.String"}, new String[]{":%s(%d)"}, false, 0, new String[][]{{"org.jsoup.nodes.PseudoTextElement", "prependChild", "org.jsoup.nodes.Node", "<sample:5>"}, {"org.jsoup.nodes.PseudoTextElement", "html", "java.lang.Appendable", "<sample:3>"}}, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput076() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.PseudoTextElement", "org.jsoup.nodes.PseudoTextElement", "getElementsByAttributeValueMatching", new String[]{"java.lang.String", "java.lang.String"}, new String[]{") ", "TITLE"}, false, 3, new String[][]{{"org.jsoup.nodes.PseudoTextElement", "addChildren", "org.jsoup.nodes.Node[]", "<sample:0>"}}, 3);
  assertNotNull(actual);
  assertEquals("org.jsoup.select.Elements", actual.getClass().getName());
  assertEquals("[]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "a {hasParent=false, hasText=false, isBlock=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput077() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jsoup.nodes.PseudoTextElement", "org.jsoup.nodes.PseudoTextElement", "val", new String[]{"java.lang.String"}, new String[]{"B"}, false, 2, new String[][]{}, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput078() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.PseudoTextElement", "org.jsoup.nodes.PseudoTextElement", "outerHtml", new String[]{}, new String[]{}, false, 5, new String[][]{{"org.jsoup.nodes.PseudoTextElement", "getElementsByClass", "java.lang.String", "<null>"}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("", String.valueOf(actual));
  assertEquals("receiver state after the call", " {hasParent=false, hasText=false, isBlock=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput079() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jsoup.nodes.PseudoTextElement", "org.jsoup.nodes.PseudoTextElement", "getElementsByAttributeValueStarting", new String[]{"java.lang.String", "java.lang.String"}, new String[]{"aaaaaaaaaaaaaaaaaaaaaaaaaaaaa", "{!a\":1}"}, false, 4, new String[][]{{"org.jsoup.nodes.PseudoTextElement", "appendTo", "org.jsoup.nodes.Element", "<sample:7>"}}, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput080() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jsoup.nodes.PseudoTextElement", "org.jsoup.nodes.PseudoTextElement", "insertChildren", new String[]{"int", "org.jsoup.nodes.Node[]"}, new String[]{"-1073741823", "<empty>"}, false, 0, new String[][]{{"org.jsoup.nodes.PseudoTextElement", "removeClass", "java.lang.String", ":%%s(%dn%*d)"}}, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput081() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jsoup.nodes.PseudoTextElement", "org.jsoup.nodes.PseudoTextElement", "remove", new String[]{}, new String[]{}, false, 0, null, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput082() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.PseudoTextElement", "org.jsoup.nodes.PseudoTextElement", "childNodesAsArray", new String[]{}, new String[]{}, false, 5, new String[][]{{"org.jsoup.nodes.PseudoTextElement", "absUrl", "java.lang.String", "2.]e300"}}, 3);
  assertNotNull(actual);
  assertEquals("[Lorg.jsoup.nodes.Node;", actual.getClass().getName());
  assertEquals("[]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", " {hasParent=false, hasText=false, isBlock=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput083() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jsoup.nodes.PseudoTextElement", "org.jsoup.nodes.PseudoTextElement", "classNames", new String[]{}, new String[]{}, false, 2, new String[][]{{"org.jsoup.nodes.PseudoTextElement", "getElementsMatchingText", "java.lang.String", ""}}, 3), new String[][]{{"remove", "java.lang.Object", "3"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput084() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.PseudoTextElement", "org.jsoup.nodes.PseudoTextElement", "hasAttr", new String[]{"java.lang.String"}, new String[]{"1.5f"}, false, 0, new String[][]{{"org.jsoup.nodes.PseudoTextElement", "classNames", ""}, {"org.jsoup.nodes.PseudoTextElement", "replaceChild", "org.jsoup.nodes.Node,org.jsoup.nodes.Node", "<sample:2>", "<sample:1>"}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput085() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jsoup.nodes.PseudoTextElement", "org.jsoup.nodes.PseudoTextElement", "attr", new String[]{"java.lang.String", "java.lang.String"}, new String[]{"(1E--5:%s(%dn)", "Tittlenull"}, false, 6, new String[][]{}, 3), new String[][]{{"hasSameValue", "java.lang.Object", "7"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput086() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.PseudoTextElement", "org.jsoup.nodes.PseudoTextElement", "outerHtmlTail", new String[]{"java.lang.Appendable", "int", "org.jsoup.nodes.Document$OutputSettings"}, new String[]{"<sample:2>", "1", "<sample:1>"}, false, 7, new String[][]{{"org.jsoup.nodes.PseudoTextElement", "getElementsByAttributeValue", "java.lang.String,java.lang.String", "125", "Title1.1234567890123356"}}, 1);
  assertNull(actual);
  assertEquals("receiver state after the call", " {hasParent=false, hasText=false, isBlock=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput087() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jsoup.nodes.PseudoTextElement", "org.jsoup.nodes.PseudoTextElement", "remove", new String[]{}, new String[]{}, false, 7, new String[][]{{"org.jsoup.nodes.PseudoTextElement", "getElementsByTag", "java.lang.String", "0110"}}, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput088() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.PseudoTextElement", "org.jsoup.nodes.PseudoTextElement", "classNames", new String[]{"java.util.Set"}, new String[]{"<sample:0>"}, false, 2, new String[][]{}, 3);
  assertNotNull(actual);
  assertEquals("org.jsoup.nodes.PseudoTextElement", actual.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput089() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jsoup.nodes.PseudoTextElement", "org.jsoup.nodes.PseudoTextElement", "before", new String[]{"org.jsoup.nodes.Node"}, new String[]{"<sample:3>"}, false, 0, new String[][]{{"org.jsoup.nodes.PseudoTextElement", "childNodeSize", ""}}, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput090() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.PseudoTextElement", "org.jsoup.nodes.PseudoTextElement", "parents", new String[]{}, new String[]{}, false, 3, new String[][]{}, 3);
  assertNotNull(actual);
  assertEquals("org.jsoup.select.Elements", actual.getClass().getName());
  assertEquals("[]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", " {hasParent=false, hasText=false, isBlock=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput091() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jsoup.nodes.PseudoTextElement", "org.jsoup.nodes.PseudoTextElement", "getElementsByIndexGreaterThan", new String[]{"int"}, new String[]{"14"}, false, 0, null, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput092() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.PseudoTextElement", "org.jsoup.nodes.PseudoTextElement", "baseUri", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.jsoup.nodes.PseudoTextElement", "ownText", ""}}, 2);
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput093() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.PseudoTextElement", "org.jsoup.nodes.PseudoTextElement", "prependChild", new String[]{"org.jsoup.nodes.Node"}, new String[]{"<sample:0>"}, false, 7, new String[][]{{"org.jsoup.nodes.PseudoTextElement", "getElementsByAttributeValueMatching", "java.lang.String,java.lang.String", "/1105.", "[%s=%s8]"}}, 2);
  assertNotNull(actual);
  assertEquals("org.jsoup.nodes.PseudoTextElement", actual.getClass().getName());
  assertEquals("\n <!--a--> {hasParent=false, hasText=false, isBlock=false}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "\n <!--a--> {hasParent=false, hasText=false, isBlock=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput094() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jsoup.nodes.PseudoTextElement", "org.jsoup.nodes.PseudoTextElement", "insertChildren", new String[]{"int", "org.jsoup.nodes.Node[]"}, new String[]{"2147483647", "<sample:2>"}, false, 1, new String[][]{}, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput095() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jsoup.nodes.PseudoTextElement", "org.jsoup.nodes.PseudoTextElement", "clone", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.jsoup.nodes.PseudoTextElement", "getElementsByAttributeStarting", "java.lang.String", "PU1H"}, {"org.jsoup.nodes.PseudoTextElement", "siblingIndex", ""}}, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput096() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jsoup.nodes.PseudoTextElement", "org.jsoup.nodes.PseudoTextElement", "is", new String[]{"java.lang.String"}, new String[]{"b b"}, false, 2, new String[][]{{"org.jsoup.nodes.PseudoTextElement", "classNames", ""}, {"org.jsoup.nodes.PseudoTextElement", "shallowClone", ""}}, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput097() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.PseudoTextElement", "org.jsoup.nodes.PseudoTextElement", "id", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.jsoup.nodes.PseudoTextElement", "getElementsByAttributeStarting", "java.lang.String", ":eq(%d)"}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput098() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.PseudoTextElement", "org.jsoup.nodes.PseudoTextElement", "hasAttr", new String[]{"java.lang.String"}, new String[]{"[1,2\\"}, false, 0, null, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput099() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jsoup.nodes.PseudoTextElement", "org.jsoup.nodes.PseudoTextElement", "removeChild", new String[]{"org.jsoup.nodes.Node"}, new String[]{"<sample:4>"}, false, 4, new String[][]{{"org.jsoup.nodes.PseudoTextElement", "html", "java.lang.String", "1.12345,78"}}, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput100() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.PseudoTextElement", "org.jsoup.nodes.PseudoTextElement", "hasSameValue", new String[]{"java.lang.Object"}, new String[]{"<s:ky>"}, false, 7, new String[][]{{"org.jsoup.nodes.PseudoTextElement", "getElementsMatchingText", "java.util.regex.Pattern", "<sample:2>"}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", " {hasParent=false, hasText=false, isBlock=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput101() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.PseudoTextElement", "org.jsoup.nodes.PseudoTextElement", "previousElementSibling", new String[]{}, new String[]{}, false, 5, new String[][]{{"org.jsoup.nodes.PseudoTextElement", "appendTo", "org.jsoup.nodes.Element", "<sample:7>"}, {"org.jsoup.nodes.PseudoTextElement", "traverse", "org.jsoup.select.NodeVisitor", "<sample:1>"}}, 1);
  assertNull(actual);
  assertEquals("receiver state after the call", " {hasParent=true, hasText=false, isBlock=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput102() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jsoup.nodes.PseudoTextElement", "org.jsoup.nodes.PseudoTextElement", "attributes", new String[]{}, new String[]{}, false, 1, new String[][]{}, 2), new String[][]{{"html", "", "6"}, {"clone", "", "3"}});
  assertNotNull(actual);
  assertEquals("org.jsoup.nodes.Attributes", actual.getClass().getName());
  assertEquals(" {size=0}", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput103() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jsoup.nodes.PseudoTextElement", "org.jsoup.nodes.PseudoTextElement", "siblingElements", new String[]{}, new String[]{}, false, 0, null, 2), new String[][]{{"trimToSize", "", "1"}});
  assertNotNull(actual);
  assertEquals("org.jsoup.select.Elements", actual.getClass().getName());
  assertEquals("[]", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput104() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.PseudoTextElement", "org.jsoup.nodes.PseudoTextElement", "nodeName", new String[]{}, new String[]{}, false, 3, new String[][]{}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("<a><b>t</b></a>", String.valueOf(actual));
  assertEquals("receiver state after the call", " {hasParent=false, hasText=false, isBlock=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput105() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jsoup.nodes.PseudoTextElement", "org.jsoup.nodes.PseudoTextElement", "root", new String[]{}, new String[]{}, false, 0, null, 1), new String[][]{{"getElementsByTag", "java.lang.String", "1"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput106() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jsoup.nodes.PseudoTextElement", "org.jsoup.nodes.PseudoTextElement", "html", new String[]{}, new String[]{}, false, 2, new String[][]{{"org.jsoup.nodes.PseudoTextElement", "addClass", "java.lang.String", "1.123456789012"}}, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput107() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.PseudoTextElement", "org.jsoup.nodes.PseudoTextElement", "is", new String[]{"org.jsoup.select.Evaluator"}, new String[]{"<sample:6>"}, false, 3, new String[][]{}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", " {hasParent=false, hasText=false, isBlock=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput108() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.PseudoTextElement", "org.jsoup.nodes.PseudoTextElement", "childNodesAsArray", new String[]{}, new String[]{}, false, 7, new String[][]{});
  assertNotNull(actual);
  assertEquals("[Lorg.jsoup.nodes.Node;", actual.getClass().getName());
  assertEquals("[]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", " {hasParent=false, hasText=false, isBlock=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput109() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.PseudoTextElement", "org.jsoup.nodes.PseudoTextElement", "attr", new String[]{"java.lang.String", "java.lang.String"}, new String[]{":Lq(%d)a,b,c", "\"#"}, false);
  assertNotNull(actual);
  assertEquals("org.jsoup.nodes.PseudoTextElement", actual.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput110() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.PseudoTextElement", "org.jsoup.nodes.PseudoTextElement", "getElementsByAttributeValueStarting", new String[]{"java.lang.String", "java.lang.String"}, new String[]{":-5d", "1.5d"}, false, 3, new String[][]{{"org.jsoup.nodes.PseudoTextElement", "appendTo", "org.jsoup.nodes.Element", "<sample:4>"}});
  assertNotNull(actual);
  assertEquals("org.jsoup.select.Elements", actual.getClass().getName());
  assertEquals("[]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", " {hasParent=true, hasText=false, isBlock=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput111() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.PseudoTextElement", "org.jsoup.nodes.PseudoTextElement", "absUrl", new String[]{"java.lang.String"}, new String[]{"B"}, false);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput112() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.PseudoTextElement", "org.jsoup.nodes.PseudoTextElement", "previousElementSibling", new String[]{}, new String[]{}, false);
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput113() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.PseudoTextElement", "org.jsoup.nodes.PseudoTextElement", "appendTo", new String[]{"org.jsoup.nodes.Element"}, new String[]{"<sample:0>"}, false, 5, new String[][]{{"org.jsoup.nodes.PseudoTextElement", "cssSelector", ""}, {"org.jsoup.nodes.PseudoTextElement", "getElementsByAttributeValueContaining", "java.lang.String,java.lang.String", "{\"a\":1}", "PT1H"}});
  assertNotNull(actual);
  assertEquals("org.jsoup.nodes.PseudoTextElement", actual.getClass().getName());
  assertEquals(" {hasParent=true, hasText=false, isBlock=false}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", " {hasParent=true, hasText=false, isBlock=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput114() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.PseudoTextElement", "org.jsoup.nodes.PseudoTextElement", "root", new String[]{}, new String[]{}, false, 7, new String[][]{});
  assertNotNull(actual);
  assertEquals("org.jsoup.nodes.PseudoTextElement", actual.getClass().getName());
  assertEquals(" {hasParent=false, hasText=false, isBlock=false}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", " {hasParent=false, hasText=false, isBlock=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput115() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.PseudoTextElement", "org.jsoup.nodes.PseudoTextElement", "setParentNode", new String[]{"org.jsoup.nodes.Node"}, new String[]{"<sample:5>"}, false);
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput116() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.PseudoTextElement", "org.jsoup.nodes.PseudoTextElement", "getOutputSettings", new String[]{}, new String[]{}, false);
  assertNotNull(actual);
  assertEquals("org.jsoup.nodes.Document$OutputSettings", actual.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput117() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.PseudoTextElement", "org.jsoup.nodes.PseudoTextElement", "outerHtmlHead", new String[]{"java.lang.Appendable", "int", "org.jsoup.nodes.Document$OutputSettings"}, new String[]{"<empty>", "-2147483648", "<sample:5>"}, false, 3, new String[][]{});
  assertNull(actual);
  assertEquals("receiver state after the call", " {hasParent=false, hasText=false, isBlock=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput118() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.PseudoTextElement", "org.jsoup.nodes.PseudoTextElement", "hasAttr", new String[]{"java.lang.String"}, new String[]{"a,b,c"}, false, 0, new String[][]{{"org.jsoup.nodes.PseudoTextElement", "getElementsMatchingText", "java.lang.String", "\r\n"}, {"org.jsoup.nodes.PseudoTextElement", "getElementsByAttribute", "java.lang.String", "[%s*=%s\\"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput119() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.PseudoTextElement", "org.jsoup.nodes.PseudoTextElement", "siblingElements", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.jsoup.nodes.PseudoTextElement", "outerHtmlTail", "java.lang.Appendable,int,org.jsoup.nodes.Document$OutputSettings", "<sample:0>", "-47", "<sample:2>"}});
  assertNotNull(actual);
  assertEquals("org.jsoup.select.Elements", actual.getClass().getName());
  assertEquals("[]", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput120() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jsoup.nodes.PseudoTextElement", "org.jsoup.nodes.PseudoTextElement", "getElementById", new String[]{"java.lang.String"}, new String[]{""}, false); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput121() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.PseudoTextElement", "org.jsoup.nodes.PseudoTextElement", "isBlock", new String[]{}, new String[]{}, false, 3, new String[][]{});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", " {hasParent=false, hasText=false, isBlock=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput122() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jsoup.nodes.PseudoTextElement", "org.jsoup.nodes.PseudoTextElement", "append", new String[]{"java.lang.String"}, new String[]{"Hello$ World"}, false, 2, new String[][]{}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput123() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jsoup.nodes.PseudoTextElement", "org.jsoup.nodes.PseudoTextElement", "text", new String[]{}, new String[]{}, false); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput124() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.PseudoTextElement", "org.jsoup.nodes.PseudoTextElement", "classNames", new String[]{"java.util.Set"}, new String[]{"<sample:3>"}, false, 4, new String[][]{});
  assertNotNull(actual);
  assertEquals("org.jsoup.nodes.PseudoTextElement", actual.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput125() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jsoup.nodes.PseudoTextElement", "org.jsoup.nodes.PseudoTextElement", "getElementsByIndexLessThan", new String[]{"int"}, new String[]{"2147483647"}, false); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput126() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jsoup.nodes.PseudoTextElement", "org.jsoup.nodes.PseudoTextElement", "getElementsContainingText", new String[]{"java.lang.String"}, new String[]{""}, false); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput127() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jsoup.nodes.PseudoTextElement", "org.jsoup.nodes.PseudoTextElement", "getElementsByAttributeValueEnding", new String[]{"java.lang.String", "java.lang.String"}, new String[]{"http://examqle.com/a?b=c", "TITTLE"}, false, 4, new String[][]{{"org.jsoup.nodes.PseudoTextElement", "prepend", "java.lang.String", "(1E-5"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput128() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jsoup.nodes.PseudoTextElement", "org.jsoup.nodes.PseudoTextElement", "tagName", new String[]{}, new String[]{}, false); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput129() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.PseudoTextElement", "org.jsoup.nodes.PseudoTextElement", "dataset", new String[]{}, new String[]{}, false, 4, new String[][]{});
  assertNotNull(actual);
  assertEquals("org.jsoup.nodes.Attributes$Dataset", actual.getClass().getName());
  assertEquals("{}", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput130() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.PseudoTextElement", "org.jsoup.nodes.PseudoTextElement", "id", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.jsoup.nodes.PseudoTextElement", "is", "org.jsoup.select.Evaluator", "<sample:2>"}, {"org.jsoup.nodes.PseudoTextElement", "data", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput131() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jsoup.nodes.PseudoTextElement", "org.jsoup.nodes.PseudoTextElement", "doClone", new String[]{"org.jsoup.nodes.Node"}, new String[]{"<sample:0>"}, false); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput132() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.PseudoTextElement", "org.jsoup.nodes.PseudoTextElement", "ownText", new String[]{}, new String[]{}, false, 3, new String[][]{});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("", String.valueOf(actual));
  assertEquals("receiver state after the call", " {hasParent=false, hasText=false, isBlock=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput133() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jsoup.nodes.PseudoTextElement", "org.jsoup.nodes.PseudoTextElement", "getElementsByAttributeValueStarting", new String[]{"java.lang.String", "java.lang.String"}, new String[]{"-OI", "-0."}, false); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput134() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jsoup.nodes.PseudoTextElement", "org.jsoup.nodes.PseudoTextElement", "insertChildren", new String[]{"int", "java.util.Collection"}, new String[]{"-1", "<sample:2>"}, false); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput135() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jsoup.nodes.PseudoTextElement", "org.jsoup.nodes.PseudoTextElement", "getElementsMatchingText", new String[]{"java.lang.String"}, new String[]{"1"}, false, 1, new String[][]{{"org.jsoup.nodes.PseudoTextElement", "previousSibling", ""}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput136() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jsoup.nodes.PseudoTextElement", "org.jsoup.nodes.PseudoTextElement", "dataNodes", new String[]{}, new String[]{}, false); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput137() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.PseudoTextElement", "org.jsoup.nodes.PseudoTextElement", "filter", new String[]{"org.jsoup.select.NodeFilter"}, new String[]{"<sample:7>"}, false, 0, new String[][]{{"org.jsoup.nodes.PseudoTextElement", "attributes", ""}});
  assertNotNull(actual);
  assertEquals("org.jsoup.nodes.PseudoTextElement", actual.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput138() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jsoup.nodes.PseudoTextElement", "org.jsoup.nodes.PseudoTextElement", "after", new String[]{"java.lang.String"}, new String[]{";"}, false, 0, new String[][]{{"org.jsoup.nodes.PseudoTextElement", "getElementsMatchingText", "java.util.regex.Pattern", "<sample:0>"}, {"org.jsoup.nodes.PseudoTextElement", "className", ""}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput139() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.PseudoTextElement", "org.jsoup.nodes.PseudoTextElement", "attributes", new String[]{}, new String[]{}, false);
  assertNotNull(actual);
  assertEquals("org.jsoup.nodes.Attributes", actual.getClass().getName());
  assertEquals(" {size=0}", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput140() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jsoup.nodes.PseudoTextElement", "org.jsoup.nodes.PseudoTextElement", "addChildren", new String[]{"int", "org.jsoup.nodes.Node[]"}, new String[]{"-2147483647", "<sample:1>"}, false, 5, new String[][]{}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IndexOutOfBoundsException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput141() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jsoup.nodes.PseudoTextElement", "org.jsoup.nodes.PseudoTextElement", "filter", new String[]{"org.jsoup.select.NodeFilter"}, new String[]{"<null>"}, false, 5, new String[][]{{"org.jsoup.nodes.PseudoTextElement", "getElementsMatchingOwnText", "java.util.regex.Pattern", "<sample:0>"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput142() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.PseudoTextElement", "org.jsoup.nodes.PseudoTextElement", "children", new String[]{}, new String[]{}, false, 7, new String[][]{});
  assertNotNull(actual);
  assertEquals("org.jsoup.select.Elements", actual.getClass().getName());
  assertEquals("[]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", " {hasParent=false, hasText=false, isBlock=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput143() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.PseudoTextElement", "org.jsoup.nodes.PseudoTextElement", "attr", new String[]{"java.lang.String", "boolean"}, new String[]{".%s", "false"}, false, 1, new String[][]{{"org.jsoup.nodes.PseudoTextElement", "hasAttributes", ""}, {"org.jsoup.nodes.PseudoTextElement", "getElementsMatchingText", "java.lang.String", "1.25"}});
  assertNotNull(actual);
  assertEquals("org.jsoup.nodes.PseudoTextElement", actual.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput144() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jsoup.nodes.PseudoTextElement", "org.jsoup.nodes.PseudoTextElement", "textNodes", new String[]{}, new String[]{}, false, 4, new String[][]{}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput145() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jsoup.nodes.PseudoTextElement", "org.jsoup.nodes.PseudoTextElement", "replaceWith", new String[]{"org.jsoup.nodes.Node"}, new String[]{"<sample:6>"}, false, 0, new String[][]{{"org.jsoup.nodes.PseudoTextElement", "previousElementSibling", ""}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput146() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jsoup.nodes.PseudoTextElement", "org.jsoup.nodes.PseudoTextElement", "children", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.jsoup.nodes.PseudoTextElement", "prepend", "java.lang.String", "#s"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput147() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.PseudoTextElement", "org.jsoup.nodes.PseudoTextElement", "parentNode", new String[]{}, new String[]{}, false, 3, new String[][]{{"org.jsoup.nodes.PseudoTextElement", "setBaseUri", "java.lang.String", "true1.5e3"}});
  assertNull(actual);
  assertEquals("receiver state after the call", " {hasParent=false, hasText=false, isBlock=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput148() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jsoup.nodes.PseudoTextElement", "org.jsoup.nodes.PseudoTextElement", "before", new String[]{"org.jsoup.nodes.Node"}, new String[]{"<sample:3>"}, false, 5, new String[][]{{"org.jsoup.nodes.PseudoTextElement", "clearAttributes", ""}, {"org.jsoup.nodes.PseudoTextElement", "getElementsContainingOwnText", "java.lang.String", "ao"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput149() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.PseudoTextElement", "org.jsoup.nodes.PseudoTextElement", "children", new String[]{}, new String[]{}, false, 5, new String[][]{{"org.jsoup.nodes.PseudoTextElement", "appendText", "java.lang.String", "1."}});
  assertNotNull(actual);
  assertEquals("org.jsoup.select.Elements", actual.getClass().getName());
  assertEquals("[]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "\n 1. {hasParent=false, hasText=true, isBlock=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput150() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jsoup.nodes.PseudoTextElement", "org.jsoup.nodes.PseudoTextElement", "attr", new String[]{"java.lang.String", "boolean"}, new String[]{"true", "false"}, false, 6, new String[][]{}), new String[][]{{"getElementsMatchingText", "java.util.regex.Pattern", "5"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput151() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.PseudoTextElement", "org.jsoup.nodes.PseudoTextElement", "className", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.jsoup.nodes.PseudoTextElement", "nodelistChanged", ""}, {"org.jsoup.nodes.PseudoTextElement", "previousElementSibling", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput152() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jsoup.nodes.PseudoTextElement", "org.jsoup.nodes.PseudoTextElement", "attr", new String[]{"java.lang.String", "boolean"}, new String[]{":eq($d)", "true"}, false, 5, new String[][]{}), new String[][]{{"getElementsByAttributeValueMatching", "java.lang.String,java.util.regex.Pattern", "1"}, {"tagName", "java.lang.String", "3"}});
  assertNotNull(actual);
  assertEquals("org.jsoup.select.Elements", actual.getClass().getName());
  assertEquals("[]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", " {hasParent=false, hasText=false, isBlock=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput153() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jsoup.nodes.PseudoTextElement", "org.jsoup.nodes.PseudoTextElement", "unwrap", new String[]{}, new String[]{}, false, 7, new String[][]{}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput154() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jsoup.nodes.PseudoTextElement", "org.jsoup.nodes.PseudoTextElement", "appendTo", new String[]{"org.jsoup.nodes.Element"}, new String[]{"<sample:0>"}, false, 3, new String[][]{{"org.jsoup.nodes.PseudoTextElement", "data", ""}}), new String[][]{{"hasClass", "java.lang.String", "6"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", " {hasParent=true, hasText=false, isBlock=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput155() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jsoup.nodes.PseudoTextElement", "org.jsoup.nodes.PseudoTextElement", "lastElementSibling", new String[]{}, new String[]{}, false, 4, new String[][]{{"org.jsoup.nodes.PseudoTextElement", "html", "java.lang.Appendable", "<empty>"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput156() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jsoup.nodes.PseudoTextElement", "org.jsoup.nodes.PseudoTextElement", "getElementsMatchingOwnText", new String[]{"java.util.regex.Pattern"}, new String[]{"<null>"}, false, 0, new String[][]{{"org.jsoup.nodes.PseudoTextElement", "getElementsByAttributeValueNot", "java.lang.String,java.lang.String", "#%)", "-1.5"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput157() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.PseudoTextElement", "org.jsoup.nodes.PseudoTextElement", "val", new String[]{}, new String[]{}, false, 3, new String[][]{{"org.jsoup.nodes.PseudoTextElement", "textNodes", ""}, {"org.jsoup.nodes.PseudoTextElement", "getElementsContainingText", "java.lang.String", "scon/ainsData(%s)"}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("", String.valueOf(actual));
  assertEquals("receiver state after the call", " {hasParent=false, hasText=false, isBlock=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput158() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.PseudoTextElement", "org.jsoup.nodes.PseudoTextElement", "dataset", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.jsoup.nodes.PseudoTextElement", "getElementsByAttributeValue", "java.lang.String,java.lang.String", "2.5e300", "null"}});
  assertNotNull(actual);
  assertEquals("org.jsoup.nodes.Attributes$Dataset", actual.getClass().getName());
  assertEquals("{}", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput159() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jsoup.nodes.PseudoTextElement", "org.jsoup.nodes.PseudoTextElement", "getElementsByAttributeValueMatching", new String[]{"java.lang.String", "java.util.regex.Pattern"}, new String[]{"TITLE", "<sample:1>"}, false); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput160() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jsoup.nodes.PseudoTextElement", "org.jsoup.nodes.PseudoTextElement", "appendText", new String[]{"java.lang.String"}, new String[]{"2.5e300"}, false, 0, new String[][]{{"org.jsoup.nodes.PseudoTextElement", "children", ""}, {"org.jsoup.nodes.PseudoTextElement", "getElementsContainingOwnText", "java.lang.String", "1L"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput161() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.PseudoTextElement", "org.jsoup.nodes.PseudoTextElement", "getAllElements", new String[]{}, new String[]{}, false, 3, new String[][]{});
  assertNotNull(actual);
  assertEquals("org.jsoup.select.Elements", actual.getClass().getName());
  assertEquals("[]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", " {hasParent=false, hasText=false, isBlock=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput162() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.PseudoTextElement", "org.jsoup.nodes.PseudoTextElement", "classNames", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.jsoup.nodes.PseudoTextElement", "getElementsByTag", "java.lang.String", "Title1.1234567890123456"}, {"org.jsoup.nodes.PseudoTextElement", "getElementsContainingOwnText", "java.lang.String", "2.5e300:contbinsOwn(%s)"}});
  assertNotNull(actual);
  assertEquals("java.util.LinkedHashSet", actual.getClass().getName());
  assertEquals("[]", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput163() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.PseudoTextElement", "org.jsoup.nodes.PseudoTextElement", "appendElement", new String[]{"java.lang.String"}, new String[]{"[1,2]:eq(%d)TITLE"}, false, 5, new String[][]{{"org.jsoup.nodes.PseudoTextElement", "toString", ""}});
  assertNotNull(actual);
  assertEquals("org.jsoup.nodes.Element", actual.getClass().getName());
  assertEquals("<[1,2]:eq(%d)TITLE></[1,2]:eq(%d)TITLE> {hasParent=true, hasText=false, isBlock=false}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "<[1,2]:eq(%d)TITLE></[1,2]:eq(%d)TITLE> {hasParent=false, hasText=false, isBlock=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput164() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jsoup.nodes.PseudoTextElement", "org.jsoup.nodes.PseudoTextElement", "firstElementSibling", new String[]{}, new String[]{}, false, 5, new String[][]{{"org.jsoup.nodes.PseudoTextElement", "addChildren", "org.jsoup.nodes.Node[]", "<empty>"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput165() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jsoup.nodes.PseudoTextElement", "org.jsoup.nodes.PseudoTextElement", "addChildren", new String[]{"org.jsoup.nodes.Node[]"}, new String[]{"<null>"}, false); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput166() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jsoup.nodes.PseudoTextElement", "org.jsoup.nodes.PseudoTextElement", "getElementsByTag", new String[]{"java.lang.String"}, new String[]{"a"}, false, 0, new String[][]{{"org.jsoup.nodes.PseudoTextElement", "classNames", "java.util.Set", "<sample:0>"}, {"org.jsoup.nodes.PseudoTextElement", "prependChild", "org.jsoup.nodes.Node", "<sample:3>"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput167() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.PseudoTextElement", "org.jsoup.nodes.PseudoTextElement", "empty", new String[]{}, new String[]{}, false, 5, new String[][]{{"org.jsoup.nodes.PseudoTextElement", "getElementsContainingOwnText", "java.lang.String", "1/26"}, {"org.jsoup.nodes.PseudoTextElement", "parentNode", ""}});
  assertNotNull(actual);
  assertEquals("org.jsoup.nodes.PseudoTextElement", actual.getClass().getName());
  assertEquals(" {hasParent=false, hasText=false, isBlock=false}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", " {hasParent=false, hasText=false, isBlock=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput168() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jsoup.nodes.PseudoTextElement", "org.jsoup.nodes.PseudoTextElement", "hasText", new String[]{}, new String[]{}, false, 1, new String[][]{{"org.jsoup.nodes.PseudoTextElement", "data", ""}, {"org.jsoup.nodes.PseudoTextElement", "parents", ""}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput169() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jsoup.nodes.PseudoTextElement", "org.jsoup.nodes.PseudoTextElement", "appendElement", new String[]{"java.lang.String"}, new String[]{"1.1345678"}, false, 7, new String[][]{{"org.jsoup.nodes.PseudoTextElement", "getElementsByIndexGreaterThan", "int", "2147483647"}}), new String[][]{{"getElementsByAttribute", "java.lang.String", "3"}});
  assertNotNull(actual);
  assertEquals("org.jsoup.select.Elements", actual.getClass().getName());
  assertEquals("[]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "<1.1345678></1.1345678> {hasParent=false, hasText=false, isBlock=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput170() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.PseudoTextElement", "org.jsoup.nodes.PseudoTextElement", "hasAttributes", new String[]{}, new String[]{}, false);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput171() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jsoup.nodes.PseudoTextElement", "org.jsoup.nodes.PseudoTextElement", "isBlock", new String[]{}, new String[]{}, false); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput172() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.PseudoTextElement", "org.jsoup.nodes.PseudoTextElement", "setSiblingIndex", new String[]{"int"}, new String[]{"8"}, false, 1, new String[][]{{"org.jsoup.nodes.PseudoTextElement", "attr", "java.lang.String,boolean", ":%s(%d)0xFFFFFFFF", "false"}, {"org.jsoup.nodes.PseudoTextElement", "data", ""}});
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput173() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.PseudoTextElement", "org.jsoup.nodes.PseudoTextElement", "parent", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.jsoup.nodes.PseudoTextElement", "dataNodes", ""}, {"org.jsoup.nodes.PseudoTextElement", "doSetBaseUri", "java.lang.String", "1e1"}});
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput174() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.PseudoTextElement", "org.jsoup.nodes.PseudoTextElement", "hasParent", new String[]{}, new String[]{}, false, 5, new String[][]{});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", " {hasParent=false, hasText=false, isBlock=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput175() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.PseudoTextElement", "org.jsoup.nodes.PseudoTextElement", "getElementsByAttribute", new String[]{"java.lang.String"}, new String[]{"#%s"}, false, 7, new String[][]{{"org.jsoup.nodes.PseudoTextElement", "getElementsMatchingText", "java.lang.String", "[^%]"}, {"org.jsoup.nodes.PseudoTextElement", "appendChild", "org.jsoup.nodes.Node", "<sample:0>"}});
  assertNotNull(actual);
  assertEquals("org.jsoup.select.Elements", actual.getClass().getName());
  assertEquals("[]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "\n <!--a--> {hasParent=false, hasText=false, isBlock=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput176() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jsoup.nodes.PseudoTextElement", "org.jsoup.nodes.PseudoTextElement", "dataNodes", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.jsoup.nodes.PseudoTextElement", "is", "java.lang.String", "\""}, {"org.jsoup.nodes.PseudoTextElement", "textNodes", ""}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput177() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jsoup.nodes.PseudoTextElement", "org.jsoup.nodes.PseudoTextElement", "insertChildren", new String[]{"int", "org.jsoup.nodes.Node[]"}, new String[]{"1", "<sample:0>"}, false, 0, new String[][]{{"org.jsoup.nodes.PseudoTextElement", "className", ""}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput178() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jsoup.nodes.PseudoTextElement", "org.jsoup.nodes.PseudoTextElement", "child", new String[]{"int"}, new String[]{"1"}, false, 0, new String[][]{{"org.jsoup.nodes.PseudoTextElement", "getElementsMatchingOwnText", "java.lang.String", ":%s(%d)"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput179() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jsoup.nodes.PseudoTextElement", "org.jsoup.nodes.PseudoTextElement", "child", new String[]{"int"}, new String[]{"10"}, false, 0, new String[][]{{"org.jsoup.nodes.PseudoTextElement", "addChildren", "org.jsoup.nodes.Node[]", "<sample:1>"}, {"org.jsoup.nodes.PseudoTextElement", "getElementsByAttributeStarting", "java.lang.String", "a"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput180() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.PseudoTextElement", "org.jsoup.nodes.PseudoTextElement", "addClass", new String[]{"java.lang.String"}, new String[]{"0x1F"}, false, 0, new String[][]{{"org.jsoup.nodes.PseudoTextElement", "getElementsMatchingOwnText", "java.lang.String", "[%%s]"}});
  assertNotNull(actual);
  assertEquals("org.jsoup.nodes.PseudoTextElement", actual.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput181() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.PseudoTextElement", "org.jsoup.nodes.PseudoTextElement", "hasText", new String[]{}, new String[]{}, false, 5, new String[][]{{"org.jsoup.nodes.PseudoTextElement", "traverse", "org.jsoup.select.NodeVisitor", "<sample:0>"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", " {hasParent=false, hasText=false, isBlock=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput182() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jsoup.nodes.PseudoTextElement", "org.jsoup.nodes.PseudoTextElement", "getElementsByIndexEquals", new String[]{"int"}, new String[]{"-2147483583"}, false, 0, new String[][]{{"org.jsoup.nodes.PseudoTextElement", "attr", "java.lang.String,java.lang.String", ":containsOwn(%s)", "1"}, {"org.jsoup.nodes.PseudoTextElement", "getElementsByAttributeValueMatching", "java.lang.String,java.util.regex.Pattern", "[%s=%s\\", "<empty>"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput183() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jsoup.nodes.PseudoTextElement", "org.jsoup.nodes.PseudoTextElement", "clone", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.jsoup.nodes.PseudoTextElement", "siblingIndex", ""}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput184() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jsoup.nodes.PseudoTextElement", "org.jsoup.nodes.PseudoTextElement", "wrap", new String[]{"java.lang.String"}, new String[]{"12:30:s5"}, false, 4, new String[][]{{"org.jsoup.nodes.PseudoTextElement", "outerHtml", ""}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput185() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.PseudoTextElement", "org.jsoup.nodes.PseudoTextElement", "elementSiblingIndex", new String[]{}, new String[]{}, false, 5, new String[][]{{"org.jsoup.nodes.PseudoTextElement", "classNames", "java.util.Set", "<sample:2>"}, {"org.jsoup.nodes.PseudoTextElement", "getElementById", "java.lang.String", "\n"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", " {hasParent=false, hasText=false, isBlock=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput186() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.PseudoTextElement", "org.jsoup.nodes.PseudoTextElement", "nodeName", new String[]{}, new String[]{}, false, 5, new String[][]{});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("{\"a\":1}", String.valueOf(actual));
  assertEquals("receiver state after the call", " {hasParent=false, hasText=false, isBlock=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput187() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.PseudoTextElement", "org.jsoup.nodes.PseudoTextElement", "getElementsContainingOwnText", new String[]{"java.lang.String"}, new String[]{"1.12345679"}, false, 5, new String[][]{});
  assertNotNull(actual);
  assertEquals("org.jsoup.select.Elements", actual.getClass().getName());
  assertEquals("[]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", " {hasParent=false, hasText=false, isBlock=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput188() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jsoup.nodes.PseudoTextElement", "org.jsoup.nodes.PseudoTextElement", "childNodeSize", new String[]{}, new String[]{}, false, 1, new String[][]{{"org.jsoup.nodes.PseudoTextElement", "siblingElements", ""}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput189() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.PseudoTextElement", "org.jsoup.nodes.PseudoTextElement", "getElementById", new String[]{"java.lang.String"}, new String[]{":containsOwn((%s)"}, false, 7, new String[][]{});
  assertNull(actual);
  assertEquals("receiver state after the call", " {hasParent=false, hasText=false, isBlock=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput190() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.PseudoTextElement", "org.jsoup.nodes.PseudoTextElement", "previousSibling", new String[]{}, new String[]{}, false, 2, new String[][]{});
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput191() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.PseudoTextElement", "org.jsoup.nodes.PseudoTextElement", "clone", new String[]{}, new String[]{}, false, 5, new String[][]{{"org.jsoup.nodes.PseudoTextElement", "nextSibling", ""}});
  assertNotNull(actual);
  assertEquals("org.jsoup.nodes.PseudoTextElement", actual.getClass().getName());
  assertEquals(" {hasParent=false, hasText=false, isBlock=false}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", " {hasParent=false, hasText=false, isBlock=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput192() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jsoup.nodes.PseudoTextElement", "org.jsoup.nodes.PseudoTextElement", "empty", new String[]{}, new String[]{}, false); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput193() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jsoup.nodes.PseudoTextElement", "org.jsoup.nodes.PseudoTextElement", "getElementById", new String[]{"java.lang.String"}, new String[]{"[1,2]"}, false, 1, new String[][]{{"org.jsoup.nodes.PseudoTextElement", "getElementsMatchingOwnText", "java.lang.String", "[%s~=%s]"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput194() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jsoup.nodes.PseudoTextElement", "org.jsoup.nodes.PseudoTextElement", "classNames", new String[]{"java.util.Set"}, new String[]{"<sample:2>"}, false, 3, new String[][]{{"org.jsoup.nodes.PseudoTextElement", "childNodesAsArray", ""}}), new String[][]{{"cssSelector", "", "2"}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("<a><b>t</b></a>.0.sample", String.valueOf(actual));
  assertEquals("receiver state after the call", " {hasParent=false, hasText=false, isBlock=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput195() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.PseudoTextElement", "org.jsoup.nodes.PseudoTextElement", "id", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.jsoup.nodes.PseudoTextElement", "selectFirst", "java.lang.String", "[%s*=%s\\"}, {"org.jsoup.nodes.PseudoTextElement", "before", "org.jsoup.nodes.Node", "<sample:6>"}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput196() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jsoup.nodes.PseudoTextElement", "org.jsoup.nodes.PseudoTextElement", "getElementsByClass", new String[]{"java.lang.String"}, new String[]{"/[%s~=%s]"}, false, 0, new String[][]{{"org.jsoup.nodes.PseudoTextElement", "getElementsMatchingText", "java.lang.String", "6."}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput197() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jsoup.nodes.PseudoTextElement", "org.jsoup.nodes.PseudoTextElement", "prependElement", new String[]{"java.lang.String"}, new String[]{"\n"}, false, 4, new String[][]{{"org.jsoup.nodes.PseudoTextElement", "childNodesCopy", ""}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput198() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.PseudoTextElement", "org.jsoup.nodes.PseudoTextElement", "getElementsByAttributeValueEnding", new String[]{"java.lang.String", "java.lang.String"}, new String[]{"1e10true", "[%=%s]"}, false, 3, new String[][]{{"org.jsoup.nodes.PseudoTextElement", "getElementsByAttributeValueNot", "java.lang.String,java.lang.String", "+1", "<a>b</a>1.5"}});
  assertNotNull(actual);
  assertEquals("org.jsoup.select.Elements", actual.getClass().getName());
  assertEquals("[]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", " {hasParent=false, hasText=false, isBlock=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput199() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.PseudoTextElement", "org.jsoup.nodes.PseudoTextElement", "outerHtmlTail", new String[]{"java.lang.Appendable", "int", "org.jsoup.nodes.Document$OutputSettings"}, new String[]{"<sample:0>", "10", "<sample:5>"}, false, 0, new String[][]{{"org.jsoup.nodes.PseudoTextElement", "selectFirst", "java.lang.String", "<a>b</a>"}});
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput200() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.PseudoTextElement", "org.jsoup.nodes.PseudoTextElement", "getElementsByIndexEquals", new String[]{"int"}, new String[]{"1"}, false, 7, new String[][]{{"org.jsoup.nodes.PseudoTextElement", "siblingElements", ""}, {"org.jsoup.nodes.PseudoTextElement", "getElementsByAttributeValueMatching", "java.lang.String,java.lang.String", "[%s~= s]", ":%s(%)"}});
  assertNotNull(actual);
  assertEquals("org.jsoup.select.Elements", actual.getClass().getName());
  assertEquals("[]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", " {hasParent=false, hasText=false, isBlock=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput201() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jsoup.nodes.PseudoTextElement", "org.jsoup.nodes.PseudoTextElement", "appendChild", new String[]{"org.jsoup.nodes.Node"}, new String[]{"<null>"}, false, 4, new String[][]{{"org.jsoup.nodes.PseudoTextElement", "outerHtml", "java.lang.Appendable", "<sample:1>"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput202() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jsoup.nodes.PseudoTextElement", "org.jsoup.nodes.PseudoTextElement", "traverse", new String[]{"org.jsoup.select.NodeVisitor"}, new String[]{"<sample:7>"}, false, 0, new String[][]{{"org.jsoup.nodes.PseudoTextElement", "html", "java.lang.String", "true"}, {"org.jsoup.nodes.PseudoTextElement", "getElementsByAttributeValueMatching", "java.lang.String,java.lang.String", "a1.5d", "a.5"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput203() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.PseudoTextElement", "org.jsoup.nodes.PseudoTextElement", "className", new String[]{}, new String[]{}, false, 3, new String[][]{});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("", String.valueOf(actual));
  assertEquals("receiver state after the call", " {hasParent=false, hasText=false, isBlock=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput204() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jsoup.nodes.PseudoTextElement", "org.jsoup.nodes.PseudoTextElement", "empty", new String[]{}, new String[]{}, false, 3, new String[][]{{"org.jsoup.nodes.PseudoTextElement", "tag", ""}}), new String[][]{{"appendText", "java.lang.String", "6"}, {"html", "", "2"}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "\n 0 {hasParent=false, hasText=true, isBlock=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput205() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.PseudoTextElement", "org.jsoup.nodes.PseudoTextElement", "getElementsByAttribute", new String[]{"java.lang.String"}, new String[]{"-1"}, false, 5, new String[][]{});
  assertNotNull(actual);
  assertEquals("org.jsoup.select.Elements", actual.getClass().getName());
  assertEquals("[]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", " {hasParent=false, hasText=false, isBlock=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput206() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jsoup.nodes.PseudoTextElement", "org.jsoup.nodes.PseudoTextElement", "getElementsByAttributeValueEnding", new String[]{"java.lang.String", "java.lang.String"}, new String[]{"an", ""}, false, 6, new String[][]{}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput207() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jsoup.nodes.PseudoTextElement", "org.jsoup.nodes.PseudoTextElement", "getElementsByAttribute", new String[]{"java.lang.String"}, new String[]{"aaaaaaaaaaaaaaaaaaaaaaaaaaaaa"}, false, 0, new String[][]{{"org.jsoup.nodes.PseudoTextElement", "getElementsByAttribute", "java.lang.String", ""}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput208() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jsoup.select.QueryParser", "org.jsoup.select.QueryParser", "parse", new String[]{}, new String[]{}, false); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput209() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jsoup.nodes.PseudoTextElement", "org.jsoup.nodes.PseudoTextElement", "childNodes", new String[]{}, new String[]{}, false, 4, new String[][]{{"org.jsoup.nodes.PseudoTextElement", "getElementsByAttributeStarting", "java.lang.String", "00"}, {"org.jsoup.nodes.PseudoTextElement", "root", ""}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput210() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.PseudoTextElement", "org.jsoup.nodes.PseudoTextElement", "hasClass", new String[]{"java.lang.String"}, new String[]{"a,b,c"}, false, 1, new String[][]{});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput211() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jsoup.nodes.PseudoTextElement", "org.jsoup.nodes.PseudoTextElement", "replaceChild", new String[]{"org.jsoup.nodes.Node", "org.jsoup.nodes.Node"}, new String[]{"<sample:7>", "<sample:5>"}, false, 0, new String[][]{{"org.jsoup.nodes.PseudoTextElement", "is", "org.jsoup.select.Evaluator", "<sample:4>"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput212() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jsoup.nodes.PseudoTextElement", "org.jsoup.nodes.PseudoTextElement", "getOutputSettings", new String[]{}, new String[]{}, false), new String[][]{{"indentAmount", "int", "1"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput213() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jsoup.nodes.PseudoTextElement", "org.jsoup.nodes.PseudoTextElement", "prepend", new String[]{"java.lang.String"}, new String[]{":eq(%d)"}, false, 0, new String[][]{{"org.jsoup.nodes.PseudoTextElement", "ownerDocument", ""}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput214() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jsoup.nodes.PseudoTextElement", "org.jsoup.nodes.PseudoTextElement", "wrap", new String[]{"java.lang.String"}, new String[]{"a,b,c2147483648"}, false, 5, new String[][]{}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput215() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.PseudoTextElement", "org.jsoup.nodes.PseudoTextElement", "hasSameValue", new String[]{"java.lang.Object"}, new String[]{"<i:-4>"}, false);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput216() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.PseudoTextElement", "org.jsoup.nodes.PseudoTextElement", "ownerDocument", new String[]{}, new String[]{}, false, 4, new String[][]{{"org.jsoup.nodes.PseudoTextElement", "clone", ""}});
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput217() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jsoup.nodes.PseudoTextElement", "org.jsoup.nodes.PseudoTextElement", "getElementsByAttributeValueMatching", new String[]{"java.lang.String", "java.lang.String"}, new String[]{"`o", "[%s]1.5"}, false, 0, new String[][]{{"org.jsoup.nodes.PseudoTextElement", "ensureChildNodes", ""}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput218() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.PseudoTextElement", "org.jsoup.nodes.PseudoTextElement", "equals", new String[]{"java.lang.Object"}, new String[]{"<i:-2>"}, false);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput219() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jsoup.nodes.PseudoTextElement", "org.jsoup.nodes.PseudoTextElement", "prependText", new String[]{"java.lang.String"}, new String[]{"'"}, false, 0, new String[][]{{"org.jsoup.nodes.PseudoTextElement", "baseUri", ""}, {"org.jsoup.nodes.PseudoTextElement", "html", "java.lang.String", "[%s][%s*=%s]"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput220() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jsoup.nodes.PseudoTextElement", "org.jsoup.nodes.PseudoTextElement", "append", new String[]{"java.lang.String"}, new String[]{""}, false, 0, new String[][]{{"org.jsoup.nodes.PseudoTextElement", "select", "java.lang.String", "null"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput221() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jsoup.nodes.PseudoTextElement", "org.jsoup.nodes.PseudoTextElement", "before", new String[]{"java.lang.String"}, new String[]{"QT1H"}, false, 4, new String[][]{{"org.jsoup.nodes.PseudoTextElement", "getElementsByIndexGreaterThan", "int", "20"}, {"org.jsoup.nodes.PseudoTextElement", "getElementsContainingText", "java.lang.String", "1e100"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput222() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jsoup.nodes.PseudoTextElement", "org.jsoup.nodes.PseudoTextElement", "outerHtml", new String[]{"java.lang.Appendable"}, new String[]{"<sample:6>"}, false, 6, new String[][]{{"org.jsoup.nodes.PseudoTextElement", "getElementById", "java.lang.String", "a"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput223() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jsoup.nodes.PseudoTextElement", "org.jsoup.nodes.PseudoTextElement", "prependChild", new String[]{"org.jsoup.nodes.Node"}, new String[]{"<sample:2>"}, false, 0, new String[][]{{"org.jsoup.nodes.PseudoTextElement", "attr", "java.lang.String,java.lang.String", "[^%s]", "http://example./om/a?b=c"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput224() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.PseudoTextElement", "org.jsoup.nodes.PseudoTextElement", "reparentChild", new String[]{"org.jsoup.nodes.Node"}, new String[]{"<sample:0>"}, false, 0, new String[][]{{"org.jsoup.nodes.PseudoTextElement", "parents", ""}});
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput225() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.PseudoTextElement", "org.jsoup.nodes.PseudoTextElement", "siblingIndex", new String[]{}, new String[]{}, false, 1, new String[][]{{"org.jsoup.nodes.PseudoTextElement", "html", "java.lang.String", "0"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput226() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jsoup.nodes.PseudoTextElement", "org.jsoup.nodes.PseudoTextElement", "childNodesCopy", new String[]{}, new String[]{}, false, 1, new String[][]{}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput227() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jsoup.nodes.PseudoTextElement", "org.jsoup.nodes.PseudoTextElement", "appendChild", new String[]{"org.jsoup.nodes.Node"}, new String[]{"<sample:2>"}, false, 1, new String[][]{}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput228() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jsoup.nodes.PseudoTextElement", "org.jsoup.nodes.PseudoTextElement", "data", new String[]{}, new String[]{}, false, 4, new String[][]{{"org.jsoup.nodes.PseudoTextElement", "attributes", ""}, {"org.jsoup.nodes.PseudoTextElement", "append", "java.lang.String", ""}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput229() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.PseudoTextElement", "org.jsoup.nodes.PseudoTextElement", "setBaseUri", new String[]{"java.lang.String"}, new String[]{"."}, false, 5, new String[][]{{"org.jsoup.nodes.PseudoTextElement", "setBaseUri", "java.lang.String", "http://example.com/a?b=c"}});
  assertNull(actual);
  assertEquals("receiver state after the call", " {hasParent=false, hasText=false, isBlock=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput230() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.PseudoTextElement", "org.jsoup.nodes.PseudoTextElement", "appendTo", new String[]{"org.jsoup.nodes.Element"}, new String[]{"<sample:1>"}, false, 0, new String[][]{{"org.jsoup.nodes.PseudoTextElement", "removeClass", "java.lang.String", "-s"}});
  assertNotNull(actual);
  assertEquals("org.jsoup.nodes.PseudoTextElement", actual.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput231() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jsoup.nodes.PseudoTextElement", "org.jsoup.nodes.PseudoTextElement", "classNames", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.jsoup.nodes.PseudoTextElement", "getElementsByAttributeValueNot", "java.lang.String,java.lang.String", "a", "{\"9\":1}"}}), new String[][]{{"retainAll", "java.util.Collection", "4"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput232() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jsoup.nodes.PseudoTextElement", "org.jsoup.nodes.PseudoTextElement", "ownText", new String[]{}, new String[]{}, false); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput233() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.PseudoTextElement", "org.jsoup.nodes.PseudoTextElement", "shallowClone", new String[]{}, new String[]{}, false, 5, new String[][]{});
  assertNotNull(actual);
  assertEquals("org.jsoup.nodes.Element", actual.getClass().getName());
  assertEquals("<{\"a\":1}></{\"a\":1}> {hasParent=false, hasText=false, isBlock=false}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", " {hasParent=false, hasText=false, isBlock=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput234() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.PseudoTextElement", "org.jsoup.nodes.PseudoTextElement", "append", new String[]{"java.lang.String"}, new String[]{"[^%]0x123456789"}, false, 5, new String[][]{{"org.jsoup.nodes.PseudoTextElement", "getElementsByAttribute", "java.lang.String", "0x1Fa,b,c"}});
  assertNotNull(actual);
  assertEquals("org.jsoup.nodes.PseudoTextElement", actual.getClass().getName());
  assertEquals("\n [^%]0x123456789 {hasParent=false, hasText=true, isBlock=false}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "\n [^%]0x123456789 {hasParent=false, hasText=true, isBlock=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput235() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jsoup.nodes.PseudoTextElement", "org.jsoup.nodes.PseudoTextElement", "getElementsMatchingOwnText", new String[]{"java.lang.String"}, new String[]{"1.12245678null"}, false, 0, new String[][]{{"org.jsoup.nodes.PseudoTextElement", "text", "java.lang.String", "I:%s(%dn)"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput236() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jsoup.nodes.PseudoTextElement", "org.jsoup.nodes.PseudoTextElement", "classNames", new String[]{"java.util.Set"}, new String[]{"<empty>"}, false, 0, new String[][]{{"org.jsoup.nodes.PseudoTextElement", "val", ""}}), new String[][]{{"getElementsMatchingOwnText", "java.util.regex.Pattern", "7"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput237() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jsoup.nodes.PseudoTextElement", "org.jsoup.nodes.PseudoTextElement", "getElementsByIndexGreaterThan", new String[]{"int"}, new String[]{"2147483647"}, false, 4, new String[][]{{"org.jsoup.nodes.PseudoTextElement", "baseUri", ""}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput238() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.PseudoTextElement", "org.jsoup.nodes.PseudoTextElement", "removeAttr", new String[]{"java.lang.String"}, new String[]{"1E-5"}, false, 0, new String[][]{{"org.jsoup.nodes.PseudoTextElement", "insertChildren", "int,java.util.Collection", "20", "<sample:1>"}});
  assertNotNull(actual);
  assertEquals("org.jsoup.nodes.PseudoTextElement", actual.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput239() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jsoup.nodes.PseudoTextElement", "org.jsoup.nodes.PseudoTextElement", "getElementsByAttributeValueContaining", new String[]{"java.lang.String", "java.lang.String"}, new String[]{"4.", "0x1234567891.12345678901234567"}, false, 0, new String[][]{{"org.jsoup.nodes.PseudoTextElement", "setSiblingIndex", "int", "2147483647"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput240() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.select.QueryParser", "org.jsoup.select.QueryParser", "parse", new String[]{"java.lang.String"}, new String[]{"[%s=%ss]"}, true);
  assertNotNull(actual);
  assertEquals("org.jsoup.select.Evaluator$AttributeWithValue", actual.getClass().getName());
  assertEquals("[%s=%ss]", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput241() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.PseudoTextElement", "org.jsoup.nodes.PseudoTextElement", "hasAttributes", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.jsoup.nodes.PseudoTextElement", "getElementsByAttributeValueContaining", "java.lang.String,java.lang.String", "a b", "1.1234567"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput242() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jsoup.nodes.PseudoTextElement", "org.jsoup.nodes.PseudoTextElement", "html", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.jsoup.nodes.PseudoTextElement", "parent", ""}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput243() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.PseudoTextElement", "org.jsoup.nodes.PseudoTextElement", "nextSibling", new String[]{}, new String[]{}, false, 1, new String[][]{{"org.jsoup.nodes.PseudoTextElement", "classNames", "java.util.Set", "<sample:0>"}});
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput244() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.PseudoTextElement", "org.jsoup.nodes.PseudoTextElement", "nextElementSibling", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.jsoup.nodes.PseudoTextElement", "getElementsByAttributeValueContaining", "java.lang.String,java.lang.String", ":%s(%d)[%s*=9s]", "Shtle"}});
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput245() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jsoup.nodes.PseudoTextElement", "org.jsoup.nodes.PseudoTextElement", "getElementsContainingOwnText", new String[]{"java.lang.String"}, new String[]{"I"}, false); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput246() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.PseudoTextElement", "org.jsoup.nodes.PseudoTextElement", "nextSibling", new String[]{}, new String[]{}, false, 5, new String[][]{{"org.jsoup.nodes.PseudoTextElement", "getOutputSettings", ""}});
  assertNull(actual);
  assertEquals("receiver state after the call", " {hasParent=false, hasText=false, isBlock=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput247() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jsoup.nodes.PseudoTextElement", "org.jsoup.nodes.PseudoTextElement", "is", new String[]{"org.jsoup.select.Evaluator"}, new String[]{"<sample:10>"}, false, 2, new String[][]{}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput248() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.PseudoTextElement", "org.jsoup.nodes.PseudoTextElement", "childNodes", new String[]{}, new String[]{}, false, 7, new String[][]{{"org.jsoup.nodes.PseudoTextElement", "className", ""}});
  assertNotNull(actual);
  assertEquals("java.util.Collections$UnmodifiableRandomAccessList", actual.getClass().getName());
  assertEquals("[]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", " {hasParent=false, hasText=false, isBlock=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput249() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.PseudoTextElement", "org.jsoup.nodes.PseudoTextElement", "cssSelector", new String[]{}, new String[]{}, false, 3, new String[][]{});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("<a><b>t</b></a>", String.valueOf(actual));
  assertEquals("receiver state after the call", " {hasParent=false, hasText=false, isBlock=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput250() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.PseudoTextElement", "org.jsoup.nodes.PseudoTextElement", "outerHtml", new String[]{}, new String[]{}, false, 7, new String[][]{{"org.jsoup.nodes.PseudoTextElement", "nodelistChanged", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("", String.valueOf(actual));
  assertEquals("receiver state after the call", " {hasParent=false, hasText=false, isBlock=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput251() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.PseudoTextElement", "org.jsoup.nodes.PseudoTextElement", "removeClass", new String[]{"java.lang.String"}, new String[]{"2020-02-30T25:61:61PT1H"}, false);
  assertNotNull(actual);
  assertEquals("org.jsoup.nodes.PseudoTextElement", actual.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput252() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jsoup.select.QueryParser", "org.jsoup.select.QueryParser", "parse", new String[]{"java.lang.String"}, new String[]{"<a>b</a>[%s^=%s]"}, true); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("org.jsoup.select.Selector$SelectorParseException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput253() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jsoup.nodes.PseudoTextElement", "org.jsoup.nodes.PseudoTextElement", "val", new String[]{}, new String[]{}, false, 2, new String[][]{{"org.jsoup.nodes.PseudoTextElement", "tagName", ""}, {"org.jsoup.nodes.PseudoTextElement", "nodeName", ""}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput254() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jsoup.nodes.PseudoTextElement", "org.jsoup.nodes.PseudoTextElement", "after", new String[]{"java.lang.String"}, new String[]{":co/ntainsOwn(%s)"}, false, 1, new String[][]{{"org.jsoup.nodes.PseudoTextElement", "setParentNode", "org.jsoup.nodes.Node", "<sample:3>"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.ClassCastException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput255() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jsoup.nodes.PseudoTextElement", "org.jsoup.nodes.PseudoTextElement", "select", new String[]{"java.lang.String"}, new String[]{"2020-001-0"}, false, 0, new String[][]{{"org.jsoup.nodes.PseudoTextElement", "classNames", ""}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput256() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.PseudoTextElement", "org.jsoup.nodes.PseudoTextElement", "siblingIndex", new String[]{}, new String[]{}, false, 3, new String[][]{{"org.jsoup.nodes.PseudoTextElement", "tagName", "java.lang.String", "abc"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", " {hasParent=false, hasText=false, isBlock=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput257() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.PseudoTextElement", "org.jsoup.nodes.PseudoTextElement", "siblingNodes", new String[]{}, new String[]{}, false, 4, new String[][]{{"org.jsoup.nodes.PseudoTextElement", "classNames", ""}});
  assertNotNull(actual);
  assertEquals("java.util.Collections$EmptyList", actual.getClass().getName());
  assertEquals("[]", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput258() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.PseudoTextElement", "org.jsoup.nodes.PseudoTextElement", "id", new String[]{}, new String[]{}, false, 5, new String[][]{{"org.jsoup.nodes.PseudoTextElement", "ownText", ""}, {"org.jsoup.nodes.PseudoTextElement", "childNodeSize", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("", String.valueOf(actual));
  assertEquals("receiver state after the call", " {hasParent=false, hasText=false, isBlock=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput259() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jsoup.nodes.PseudoTextElement", "org.jsoup.nodes.PseudoTextElement", "root", new String[]{}, new String[]{}, false, 6, new String[][]{}), new String[][]{{"getElementsByIndexGreaterThan", "int", "6"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput260() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jsoup.nodes.PseudoTextElement", "org.jsoup.nodes.PseudoTextElement", "filter", new String[]{"org.jsoup.select.NodeFilter"}, new String[]{"<sample:5>"}, false, 0, new String[][]{{"org.jsoup.nodes.PseudoTextElement", "appendText", "java.lang.String", "ao1.12345678"}, {"org.jsoup.nodes.PseudoTextElement", "insertChildren", "int,org.jsoup.nodes.Node[]", "-2147483632", "<sample:1>"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput261() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jsoup.nodes.PseudoTextElement", "org.jsoup.nodes.PseudoTextElement", "outerHtml", new String[]{}, new String[]{}, false, 1, new String[][]{{"org.jsoup.nodes.PseudoTextElement", "outerHtmlHead", "java.lang.Appendable,int,org.jsoup.nodes.Document$OutputSettings", "<sample:0>", "33554442", "<sample:5>"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput262() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.PseudoTextElement", "org.jsoup.nodes.PseudoTextElement", "is", new String[]{"org.jsoup.select.Evaluator"}, new String[]{"<sample:5>"}, false, 3, new String[][]{{"org.jsoup.nodes.PseudoTextElement", "removeChild", "org.jsoup.nodes.Node", "<sample:1>"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", " {hasParent=false, hasText=false, isBlock=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput263() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jsoup.nodes.PseudoTextElement", "org.jsoup.nodes.PseudoTextElement", "appendTo", new String[]{"org.jsoup.nodes.Element"}, new String[]{"<sample:3>"}, false, 0, new String[][]{{"org.jsoup.nodes.PseudoTextElement", "absUrl", "java.lang.String", "Hello, Worlda"}, {"org.jsoup.nodes.PseudoTextElement", "getElementById", "java.lang.String", "+.5e300"}}), new String[][]{{"baseUri", "", "6"}});
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput264() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.PseudoTextElement", "org.jsoup.nodes.PseudoTextElement", "preserveWhitespace", new String[]{"org.jsoup.nodes.Node"}, new String[]{"<sample:7>"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput265() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jsoup.nodes.PseudoTextElement", "org.jsoup.nodes.PseudoTextElement", "childNodesAsArray", new String[]{}, new String[]{}, false, 4, new String[][]{{"org.jsoup.nodes.PseudoTextElement", "getElementsByIndexEquals", "int", "-2147483648"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput266() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.PseudoTextElement", "org.jsoup.nodes.PseudoTextElement", "hasAttr", new String[]{"java.lang.String"}, new String[]{":%s(%d )0x123456789"}, false, 7, new String[][]{});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", " {hasParent=false, hasText=false, isBlock=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput267() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jsoup.nodes.PseudoTextElement", "org.jsoup.nodes.PseudoTextElement", "setBaseUri", new String[]{"java.lang.String"}, new String[]{"[%s}=%s]"}, false, 2, new String[][]{{"org.jsoup.nodes.PseudoTextElement", "appendText", "java.lang.String", ":%s(%dn%+d)"}, {"org.jsoup.nodes.PseudoTextElement", "hasSameValue", "java.lang.Object", "<i:1>"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput268() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jsoup.nodes.PseudoTextElement", "org.jsoup.nodes.PseudoTextElement", "after", new String[]{"org.jsoup.nodes.Node"}, new String[]{"<sample:0>"}, false, 2, new String[][]{{"org.jsoup.nodes.PseudoTextElement", "outerHtml", ""}, {"org.jsoup.nodes.PseudoTextElement", "childNodesAsArray", ""}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput269() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jsoup.nodes.PseudoTextElement", "org.jsoup.nodes.PseudoTextElement", "getElementsByAttributeValueContaining", new String[]{"java.lang.String", "java.lang.String"}, new String[]{"", "0101.12345678901234567"}, false, 5, new String[][]{{"org.jsoup.nodes.PseudoTextElement", "hasSameValue", "java.lang.Object", "<i:1>"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput270() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jsoup.nodes.PseudoTextElement", "org.jsoup.nodes.PseudoTextElement", "getAllElements", new String[]{}, new String[]{}, false, 1, new String[][]{{"org.jsoup.nodes.PseudoTextElement", "outerHtml", "java.lang.Appendable", "<null>"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput271() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jsoup.nodes.PseudoTextElement", "org.jsoup.nodes.PseudoTextElement", "classNames", new String[]{}, new String[]{}, false, 3, new String[][]{{"org.jsoup.nodes.PseudoTextElement", "getElementsByAttributeValueStarting", "java.lang.String,java.lang.String", "1.5e300[%s*=%s]", ""}}), new String[][]{{"remove", "java.lang.Object", "5"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", " {hasParent=false, hasText=false, isBlock=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput272() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jsoup.nodes.PseudoTextElement", "org.jsoup.nodes.PseudoTextElement", "insertChildren", new String[]{"int", "org.jsoup.nodes.Node[]"}, new String[]{"20", "<sample:0>"}, false, 7, new String[][]{{"org.jsoup.nodes.PseudoTextElement", "tagName", "java.lang.String", "TILE"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput273() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.PseudoTextElement", "org.jsoup.nodes.PseudoTextElement", "nodelistChanged", new String[]{}, new String[]{}, false, 3, new String[][]{{"org.jsoup.nodes.PseudoTextElement", "classNames", "java.util.Set", "<empty>"}});
  assertNull(actual);
  assertEquals("receiver state after the call", " {hasParent=false, hasText=false, isBlock=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput274() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.PseudoTextElement", "org.jsoup.nodes.PseudoTextElement", "nodeName", new String[]{}, new String[]{}, false, 3, new String[][]{});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("<a><b>t</b></a>", String.valueOf(actual));
  assertEquals("receiver state after the call", " {hasParent=false, hasText=false, isBlock=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput275() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jsoup.nodes.PseudoTextElement", "org.jsoup.nodes.PseudoTextElement", "siblingNodes", new String[]{}, new String[]{}, false, 1, new String[][]{{"org.jsoup.nodes.PseudoTextElement", "equals", "java.lang.Object", "<d:1.5>"}}), new String[][]{{"removeAll", "java.util.Collection", "6"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput276() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jsoup.nodes.PseudoTextElement", "org.jsoup.nodes.PseudoTextElement", "getElementsByAttributeValue", new String[]{"java.lang.String", "java.lang.String"}, new String[]{"2020-02-30T25:61:61abc", ":aontains!wn(%s)"}, false); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput277() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jsoup.nodes.PseudoTextElement", "org.jsoup.nodes.PseudoTextElement", "is", new String[]{"java.lang.String"}, new String[]{"scon/ahnsData(%s)"}, false, 0, new String[][]{{"org.jsoup.nodes.PseudoTextElement", "tagName", "java.lang.String", "*"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("org.jsoup.select.Selector$SelectorParseException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput278() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jsoup.nodes.PseudoTextElement", "org.jsoup.nodes.PseudoTextElement", "select", new String[]{"java.lang.String"}, new String[]{"2.5e300:contbinsOwn(%s)[%s]"}, false, 3, new String[][]{}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("org.jsoup.select.Selector$SelectorParseException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput279() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.PseudoTextElement", "org.jsoup.nodes.PseudoTextElement", "getElementsByAttributeValueContaining", new String[]{"java.lang.String", "java.lang.String"}, new String[]{"hstp://examqle.com/a?b=c", "2020-01-0^"}, false, 3, new String[][]{});
  assertNotNull(actual);
  assertEquals("org.jsoup.select.Elements", actual.getClass().getName());
  assertEquals("[]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", " {hasParent=false, hasText=false, isBlock=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput280() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jsoup.nodes.PseudoTextElement", "org.jsoup.nodes.PseudoTextElement", "removeAttr", new String[]{"java.lang.String"}, new String[]{"[%s~=%s]1.5f"}, false, 1, new String[][]{{"org.jsoup.nodes.PseudoTextElement", "outerHtmlTail", "java.lang.Appendable,int,org.jsoup.nodes.Document$OutputSettings", "<sample:3>", "-1", "<sample:0>"}}), new String[][]{{"absUrl", "java.lang.String", "3"}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput281() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.PseudoTextElement", "org.jsoup.nodes.PseudoTextElement", "getElementsMatchingText", new String[]{"java.lang.String"}, new String[]{"I"}, false, 5, new String[][]{{"org.jsoup.nodes.PseudoTextElement", "prependElement", "java.lang.String", "TITTLE121456789012345678901234567890"}});
  assertNotNull(actual);
  assertEquals("org.jsoup.select.Elements", actual.getClass().getName());
  assertEquals("[]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "<TITTLE121456789012345678901234567890></TITTLE121456789012345678901234567890> {hasParent=false, hasText=false, isBlock=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput282() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jsoup.nodes.PseudoTextElement", "org.jsoup.nodes.PseudoTextElement", "root", new String[]{}, new String[]{}, false, 5, new String[][]{{"org.jsoup.nodes.PseudoTextElement", "getElementsContainingText", "java.lang.String", ""}}), new String[][]{{"hasText", "", "2"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", " {hasParent=false, hasText=false, isBlock=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput283() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.PseudoTextElement", "org.jsoup.nodes.PseudoTextElement", "parents", new String[]{}, new String[]{}, false, 3, new String[][]{{"org.jsoup.nodes.PseudoTextElement", "lastElementSibling", ""}});
  assertNotNull(actual);
  assertEquals("org.jsoup.select.Elements", actual.getClass().getName());
  assertEquals("[]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", " {hasParent=false, hasText=false, isBlock=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput284() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.PseudoTextElement", "org.jsoup.nodes.PseudoTextElement", "tag", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.jsoup.nodes.PseudoTextElement", "getElementsByAttributeValueContaining", "java.lang.String,java.lang.String", "2.5e300", ""}});
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput285() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jsoup.nodes.PseudoTextElement", "org.jsoup.nodes.PseudoTextElement", "prependChild", new String[]{"org.jsoup.nodes.Node"}, new String[]{"<sample:3>"}, false, 5, new String[][]{{"org.jsoup.nodes.PseudoTextElement", "getElementsByAttributeValueMatching", "java.lang.String,java.util.regex.Pattern", "1.134567-8", "<empty>"}, {"org.jsoup.nodes.PseudoTextElement", "parent", ""}}), new String[][]{{"attributes", "", "1"}});
  assertNotNull(actual);
  assertEquals("org.jsoup.nodes.Attributes", actual.getClass().getName());
  assertEquals(" {size=0}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "<!DOCTYPE a PUBLIC \"0\" \"sample\"> {hasParent=false, hasText=false, isBlock=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput286() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.PseudoTextElement", "org.jsoup.nodes.PseudoTextElement", "outerHtml", new String[]{"java.lang.Appendable"}, new String[]{"<sample:3>"}, false, 5, new String[][]{});
  assertNull(actual);
  assertEquals("receiver state after the call", " {hasParent=false, hasText=false, isBlock=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput287() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.PseudoTextElement", "org.jsoup.nodes.PseudoTextElement", "setParentNode", new String[]{"org.jsoup.nodes.Node"}, new String[]{"<sample:3>"}, false, 0, new String[][]{{"org.jsoup.nodes.PseudoTextElement", "setBaseUri", "java.lang.String", "A\t"}}, 3);
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput288() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.PseudoTextElement", "org.jsoup.nodes.PseudoTextElement", "nodelistChanged", new String[]{}, new String[]{}, false, 3, new String[][]{{"org.jsoup.nodes.PseudoTextElement", "parent", ""}}, 3);
  assertNull(actual);
  assertEquals("receiver state after the call", " {hasParent=false, hasText=false, isBlock=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput289() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jsoup.nodes.PseudoTextElement", "org.jsoup.nodes.PseudoTextElement", "childNodes", new String[]{}, new String[]{}, false, 3, new String[][]{}), new String[][]{{"contains", "java.lang.Object", "2"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", " {hasParent=false, hasText=false, isBlock=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput290() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jsoup.nodes.PseudoTextElement", "org.jsoup.nodes.PseudoTextElement", "addClass", new String[]{"java.lang.String"}, new String[]{"[o%s=%s]"}, false, 0, new String[][]{{"org.jsoup.nodes.PseudoTextElement", "outerHtml", ""}, {"org.jsoup.nodes.PseudoTextElement", "cssSelector", ""}}), new String[][]{{"html", "", "3"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput291() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.PseudoTextElement", "org.jsoup.nodes.PseudoTextElement", "parent", new String[]{}, new String[]{}, false, 7, new String[][]{});
  assertNull(actual);
  assertEquals("receiver state after the call", " {hasParent=false, hasText=false, isBlock=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput292() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jsoup.nodes.PseudoTextElement", "org.jsoup.nodes.PseudoTextElement", "lastElementSibling", new String[]{}, new String[]{}, false, 3, new String[][]{{"org.jsoup.nodes.PseudoTextElement", "className", ""}}, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput293() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.PseudoTextElement", "org.jsoup.nodes.PseudoTextElement", "hasClass", new String[]{"java.lang.String"}, new String[]{":%s(%dn%+d):%s(%dn)"}, false, 5, new String[][]{{"org.jsoup.nodes.PseudoTextElement", "before", "org.jsoup.nodes.Node", "<null>"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", " {hasParent=false, hasText=false, isBlock=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput294() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jsoup.nodes.PseudoTextElement", "org.jsoup.nodes.PseudoTextElement", "siblingNodes", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.jsoup.nodes.PseudoTextElement", "prependChild", "org.jsoup.nodes.Node", "<sample:5>"}}), new String[][]{{"get", "int", "7"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IndexOutOfBoundsException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput295() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.PseudoTextElement", "org.jsoup.nodes.PseudoTextElement", "getElementsByAttributeValueMatching", new String[]{"java.lang.String", "java.lang.String"}, new String[]{"i", "1e10"}, false, 3, new String[][]{{"org.jsoup.nodes.PseudoTextElement", "insertChildren", "int,java.util.Collection", "62", "<empty>"}});
  assertNotNull(actual);
  assertEquals("org.jsoup.select.Elements", actual.getClass().getName());
  assertEquals("[]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", " {hasParent=false, hasText=false, isBlock=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput296() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.PseudoTextElement", "org.jsoup.nodes.PseudoTextElement", "absUrl", new String[]{"java.lang.String"}, new String[]{"1/1345678"}, false, 3, new String[][]{{"org.jsoup.nodes.PseudoTextElement", "replaceChild", "org.jsoup.nodes.Node,org.jsoup.nodes.Node", "<sample:6>", "<sample:1>"}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("", String.valueOf(actual));
  assertEquals("receiver state after the call", " {hasParent=false, hasText=false, isBlock=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput297() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jsoup.nodes.PseudoTextElement", "org.jsoup.nodes.PseudoTextElement", "removeChild", new String[]{"org.jsoup.nodes.Node"}, new String[]{"<sample:5>"}, false); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput298() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.PseudoTextElement", "org.jsoup.nodes.PseudoTextElement", "attributes", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.jsoup.nodes.PseudoTextElement", "setParentNode", "org.jsoup.nodes.Node", "<sample:7>"}}, 3);
  assertNotNull(actual);
  assertEquals("org.jsoup.nodes.Attributes", actual.getClass().getName());
  assertEquals(" {size=0}", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput299() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jsoup.nodes.PseudoTextElement", "org.jsoup.nodes.PseudoTextElement", "attributes", new String[]{}, new String[]{}, false, 1, new String[][]{{"org.jsoup.nodes.PseudoTextElement", "getElementsByAttributeValueEnding", "java.lang.String,java.lang.String", "[%s=%s]1.25", ":%s!%d)"}}), new String[][]{{"hasKey", "java.lang.String", "7"}, {"put", "java.lang.String,java.lang.String", "6"}});
  assertNotNull(actual);
  assertEquals("org.jsoup.nodes.Attributes", actual.getClass().getName());
  assertEquals(" 0=\"sample\" {size=1}", SearchInputFactory_scaffolding.observe(actual));
 }
}
