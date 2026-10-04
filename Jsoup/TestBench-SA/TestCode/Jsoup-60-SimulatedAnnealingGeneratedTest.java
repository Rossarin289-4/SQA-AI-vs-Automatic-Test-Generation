package generated.algorithm;

import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;
import static org.junit.Assert.*;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class SimulatedAnnealingGeneratedTest {
 @Test(timeout = 20000)
 public void generatedInput000() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.parser.TokenQueue", "org.jsoup.parser.TokenQueue", "isEmpty", new String[]{}, new String[]{}, false, 9, new String[][]{{"org.jsoup.parser.TokenQueue", "consumeTagName", ""}, {"org.jsoup.parser.TokenQueue", "matchesAny", "char[]", "<sample:2>"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
  assertEquals("receiver state after the call", " {isEmpty=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput001() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.parser.TokenQueue", "org.jsoup.parser.TokenQueue", "addFirst", new String[]{"java.lang.Character"}, new String[]{"("}, false, 0, new String[][]{{"org.jsoup.parser.TokenQueue", "addFirst", "java.lang.Character", "|"}, {"org.jsoup.parser.TokenQueue", "consumeAttributeKey", ""}});
  assertNull(actual);
  assertEquals("receiver state after the call", "(|a {isEmpty=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput002() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jsoup.select.QueryParser", "org.jsoup.select.QueryParser", "parse", new String[]{"java.lang.String"}, new String[]{"aaaaaaaaaaaaaaaaaaaaaaaaaaaaaa:has("}, true, 0, null, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("org.jsoup.select.Selector$SelectorParseException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput003() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.parser.TokenQueue", "org.jsoup.parser.TokenQueue", "matchesStartTag", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.jsoup.parser.TokenQueue", "consumeTagName", ""}, {"org.jsoup.parser.TokenQueue", "matchesCS", "java.lang.String", "1.25"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", " {isEmpty=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput004() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jsoup.select.QueryParser", "org.jsoup.select.QueryParser", "parse", new String[]{"java.lang.String"}, new String[]{":eq("}, true); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("org.jsoup.select.Selector$SelectorParseException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput005() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jsoup.select.QueryParser", "org.jsoup.select.QueryParser", "parse", new String[]{"java.lang.String"}, new String[]{":matches("}, true, 0, null, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("org.jsoup.select.Selector$SelectorParseException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput006() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jsoup.select.QueryParser", "org.jsoup.select.QueryParser", "parse", new String[]{"java.lang.String"}, new String[]{"*|"}, true), new String[][]{{"matches", "org.jsoup.nodes.Element,org.jsoup.nodes.Element", "6"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput007() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jsoup.select.QueryParser", "org.jsoup.select.QueryParser", "parse", new String[]{"java.lang.String"}, new String[]{"[1LA-2]nUnkownccofinat:containsData("}, true); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("org.jsoup.select.Selector$SelectorParseException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput008() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jsoup.select.QueryParser", "org.jsoup.select.QueryParser", "parse", new String[]{"java.lang.String"}, new String[]{":contains("}, true, 0, null, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("org.jsoup.select.Selector$SelectorParseException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput009() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jsoup.parser.TokenQueue", "org.jsoup.parser.TokenQueue", "consume", new String[]{"java.lang.String"}, new String[]{"1.25"}, false, 0, new String[][]{{"org.jsoup.parser.TokenQueue", "consumeWord", ""}, {"org.jsoup.parser.TokenQueue", "consume", "java.lang.String", ":gt("}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalStateException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput010() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.parser.TokenQueue", "org.jsoup.parser.TokenQueue", "consumeAttributeKey", new String[]{}, new String[]{}, false, 2, new String[][]{{"org.jsoup.parser.TokenQueue", "matchesStartTag", ""}, {"org.jsoup.parser.TokenQueue", "peek", ""}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("sample", String.valueOf(actual));
  assertEquals("receiver state after the call", " {isEmpty=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput011() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jsoup.select.QueryParser", "org.jsoup.select.QueryParser", "parse", new String[]{"java.lang.String"}, new String[]{",11-d591.5X3-1>.6"}, true), new String[][]{{"add", "org.jsoup.select.Evaluator", "6"}, {"add", "org.jsoup.select.Evaluator", "2"}, {"add", "org.jsoup.select.Evaluator", "7"}});
  assertNotNull(actual);
  assertEquals("org.jsoup.select.CombiningEvaluator$Or", actual.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput012() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jsoup.select.QueryParser", "org.jsoup.select.QueryParser", "parse", new String[]{"java.lang.String"}, new String[]{"[E1LA-2\\nUnkownccofinat:coOnbainsDataA(1.123456789P1234567:contbinsOwn("}, true); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("org.jsoup.select.Selector$SelectorParseException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput013() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jsoup.select.QueryParser", "org.jsoup.select.QueryParser", "parse", new String[]{"java.lang.String"}, new String[]{"4[[E1L-2]nUnkgwnccrAfjn`tdoOnaI-1.5f"}, true); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("org.jsoup.select.Selector$SelectorParseException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput014() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jsoup.select.QueryParser", "org.jsoup.select.QueryParser", "parse", new String[]{"java.lang.String"}, new String[]{":gt("}, true); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("org.jsoup.select.Selector$SelectorParseException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput015() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jsoup.select.QueryParser", "org.jsoup.select.QueryParser", "parse", new String[]{"java.lang.String"}, new String[]{"0ro4E5H_.Bnn\nh\tjn_2||U_gN9CC,*+T,EXf 66|OAA#hhVv[alxQu\r\r=\017n#gcs]ITitleHello, W"}, true, 0, null, 3), new String[][]{{"add", "org.jsoup.select.Evaluator", "3"}, {"add", "org.jsoup.select.Evaluator", "5"}, {"add", "org.jsoup.select.Evaluator", "4"}});
  assertNotNull(actual);
  assertEquals("org.jsoup.select.CombiningEvaluator$Or", actual.getClass().getName());
  assertEquals(":or[jn_2::U_gN9CC :parenth :parent0ro4E5H_ .Bnn, T :prev*, 66:OAA #hhVv [alxqu=n#gcs] ITitleHello :parentEXf, W, [a], [a=0], [^a]]", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput016() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.parser.TokenQueue", "org.jsoup.parser.TokenQueue", "consumeToIgnoreCase", new String[]{"java.lang.String"}, new String[]{"12:30:45"}, false, 10, new String[][]{{"org.jsoup.parser.TokenQueue", "addFirst", "java.lang.String", "4[[E1L-2]nUnkgwnccrAfjn`tdoOnaI-1.5f"}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("4[[E1L-2]nUnkgwnccrAfjn`tdoOnaI-1.5fsample", String.valueOf(actual));
  assertEquals("receiver state after the call", " {isEmpty=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput017() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.parser.TokenQueue", "org.jsoup.parser.TokenQueue", "advance", new String[]{}, new String[]{}, false, 4, new String[][]{{"org.jsoup.parser.TokenQueue", "chompTo", "java.lang.String", ":eq("}, {"org.jsoup.parser.TokenQueue", "consumeToIgnoreCase", "java.lang.String", "<a7>b</a>"}, {"org.jsoup.parser.TokenQueue", "peek", ""}}, 2);
  assertNull(actual);
  assertEquals("receiver state after the call", " {isEmpty=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput018() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.parser.TokenQueue", "org.jsoup.parser.TokenQueue", "unescape", new String[]{"java.lang.String"}, new String[]{"[E1LA-2\\nUnkownccofinat:coOnbainsDataB(1.123456789P1234567:contbinsOwn("}, true);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("[E1LA-2nUnkownccofinat:coOnbainsDataB(1.123456789P1234567:contbinsOwn(", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput019() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.parser.TokenQueue", "org.jsoup.parser.TokenQueue", "unescape", new String[]{"java.lang.String"}, new String[]{"\\"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput020() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.parser.TokenQueue", "org.jsoup.parser.TokenQueue", "chompToIgnoreCase", new String[]{"java.lang.String"}, new String[]{"l"}, false, 6, new String[][]{{"org.jsoup.parser.TokenQueue", "consume", ""}, {"org.jsoup.parser.TokenQueue", "matchesWhitespace", ""}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("amp", String.valueOf(actual));
  assertEquals("receiver state after the call", "e {isEmpty=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput021() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.parser.TokenQueue", "org.jsoup.parser.TokenQueue", "peek", new String[]{}, new String[]{}, false, 21, new String[][]{{"org.jsoup.parser.TokenQueue", "matchesAny", "java.lang.String[]", "<sample:1>"}, {"org.jsoup.parser.TokenQueue", "addFirst", "java.lang.String", "aaaaaaaaaaaaaaaaaabaTabaaaaaa:has(1.12345678"}, {"org.jsoup.parser.TokenQueue", "consumeTagName", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.Character", actual.getClass().getName());
  assertEquals("(", String.valueOf(actual));
  assertEquals("receiver state after the call", "(1.123456780 {isEmpty=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput022() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jsoup.select.QueryParser", "org.jsoup.select.QueryParser", "parse", new String[]{"java.lang.String"}, new String[]{"br4F5h__s.3nn\nhjw__2||V|_gM9CC,*+T,Xf 66BB#hhlw[aBgQ\r\r=sTm\"c]"}, true); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("org.jsoup.select.Selector$SelectorParseException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput023() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.parser.TokenQueue", "org.jsoup.parser.TokenQueue", "chompTo", new String[]{"java.lang.String"}, new String[]{""}, false, 10, new String[][]{{"org.jsoup.parser.TokenQueue", "advance", ""}, {"org.jsoup.parser.TokenQueue", "toString", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("", String.valueOf(actual));
  assertEquals("receiver state after the call", "ample {isEmpty=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput024() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jsoup.select.QueryParser", "org.jsoup.select.QueryParser", "parse", new String[]{"java.lang.String"}, new String[]{"U:containsOwn()"}, true); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("org.jsoup.select.Selector$SelectorParseException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput025() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jsoup.select.QueryParser", "org.jsoup.select.QueryParser", "parse", new String[]{"java.lang.String"}, new String[]{":lt(8"}, true), new String[][]{{"matches", "org.jsoup.nodes.Element,org.jsoup.nodes.Element", "5"}, {"matches", "org.jsoup.nodes.Element,org.jsoup.nodes.Element", "4"}, {"matches", "org.jsoup.nodes.Element,org.jsoup.nodes.Element", "3"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput026() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jsoup.select.QueryParser", "org.jsoup.select.QueryParser", "parse", new String[]{"java.lang.String"}, new String[]{"~aaa1925"}, true), new String[][]{{"matches", "org.jsoup.nodes.Element,org.jsoup.nodes.Element", "7"}, {"matches", "org.jsoup.nodes.Element,org.jsoup.nodes.Element", "0"}, {"matches", "org.jsoup.nodes.Element,org.jsoup.nodes.Element", "1"}, {"matches", "org.jsoup.nodes.Element,org.jsoup.nodes.Element", "5"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput027() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jsoup.select.QueryParser", "org.jsoup.select.QueryParser", "parse", new String[]{"java.lang.String"}, new String[]{"+B0*O.trw4e9f ob00\rqdbB75h8x(xX||C9\n3E.srL.Cjm #qqhju1[<<5eq|t6IO)nbit]]HTi*i"}, true); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("org.jsoup.select.Selector$SelectorParseException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput028() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jsoup.select.QueryParser", "org.jsoup.select.QueryParser", "parse", new String[]{"java.lang.String"}, new String[]{"Ww4p*jXkjkkll>ddc9Yd5  Liih*Oe M56\nQ9o|Ail#ffal*oL5[B.4un*91at's]ITitleHello,:1)"}, true); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("org.jsoup.select.Selector$SelectorParseException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput029() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.parser.TokenQueue", "org.jsoup.parser.TokenQueue", "consumeAttributeKey", new String[]{}, new String[]{}, false, 11, new String[][]{{"org.jsoup.parser.TokenQueue", "consumeTo", "java.lang.String", "12:30:45"}, {"org.jsoup.parser.TokenQueue", "chompToIgnoreCase", "java.lang.String", ":contains("}, {"org.jsoup.parser.TokenQueue", "addFirst", "java.lang.Character", "-"}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("-", String.valueOf(actual));
  assertEquals("receiver state after the call", " {isEmpty=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput030() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.parser.TokenQueue", "org.jsoup.parser.TokenQueue", "chompBalanced", new String[]{"char", "char"}, new String[]{")", ":"}, false, 0, new String[][]{{"org.jsoup.parser.TokenQueue", "consume", ""}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("", String.valueOf(actual));
  assertEquals("receiver state after the call", " {isEmpty=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput031() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.parser.TokenQueue", "org.jsoup.parser.TokenQueue", "matchesCS", new String[]{"java.lang.String"}, new String[]{"0x123456789"}, false, 0, null, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "a {isEmpty=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput032() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.parser.TokenQueue", "org.jsoup.parser.TokenQueue", "matchesCS", new String[]{"java.lang.String"}, new String[]{"12345678901234567891234467890"}, false, 0, new String[][]{{"org.jsoup.parser.TokenQueue", "matchesAny", "char[]", "<sample:1>"}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "a {isEmpty=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput033() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.parser.TokenQueue", "org.jsoup.parser.TokenQueue", "matchesCS", new String[]{"java.lang.String"}, new String[]{"12345678901234567891234467890"}, false, 0, new String[][]{{"org.jsoup.parser.TokenQueue", "matchesAny", "char[]", "<sample:1>"}, {"org.jsoup.parser.TokenQueue", "matchesWhitespace", ""}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "a {isEmpty=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput034() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.parser.TokenQueue", "org.jsoup.parser.TokenQueue", "chompToIgnoreCase", new String[]{"java.lang.String"}, new String[]{":contains("}, false, 0, null, 1);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("a", String.valueOf(actual));
  assertEquals("receiver state after the call", " {isEmpty=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput035() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.parser.TokenQueue", "org.jsoup.parser.TokenQueue", "chompToIgnoreCase", new String[]{"java.lang.String"}, new String[]{":contains("}, false, 1, new String[][]{}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", " {isEmpty=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput036() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.parser.TokenQueue", "org.jsoup.parser.TokenQueue", "chompToIgnoreCase", new String[]{"java.lang.String"}, new String[]{":contaibns(C"}, false, 1, new String[][]{{"org.jsoup.parser.TokenQueue", "consumeTo", "java.lang.String", "2147483648"}, {"org.jsoup.parser.TokenQueue", "matchesWord", ""}, {"org.jsoup.parser.TokenQueue", "matches", "java.lang.String", ":matches("}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("", String.valueOf(actual));
  assertEquals("receiver state after the call", " {isEmpty=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput037() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.parser.TokenQueue", "org.jsoup.parser.TokenQueue", "unescape", new String[]{"java.lang.String"}, new String[]{":lt("}, true, 0, null, 1);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals(":lt(", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput038() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.parser.TokenQueue", "org.jsoup.parser.TokenQueue", "unescape", new String[]{"java.lang.String"}, new String[]{"#"}, true, 0, null, 1);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("#", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput039() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.parser.TokenQueue", "org.jsoup.parser.TokenQueue", "unescape", new String[]{"java.lang.String"}, new String[]{"("}, true, 0, null, 1);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("(", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput040() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.parser.TokenQueue", "org.jsoup.parser.TokenQueue", "consumeToAny", new String[]{"java.lang.String[]"}, new String[]{"<sample:0>"}, false, 12, new String[][]{{"org.jsoup.parser.TokenQueue", "chompBalanced", "char,char", ".", " "}, {"org.jsoup.parser.TokenQueue", "remainder", ""}, {"org.jsoup.parser.TokenQueue", "consumeElementSelector", ""}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("", String.valueOf(actual));
  assertEquals("receiver state after the call", " {isEmpty=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput041() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.parser.TokenQueue", "org.jsoup.parser.TokenQueue", "toString", new String[]{}, new String[]{}, false, 0, null, 1);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("a", String.valueOf(actual));
  assertEquals("receiver state after the call", "a {isEmpty=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput042() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.parser.TokenQueue", "org.jsoup.parser.TokenQueue", "consumeCssIdentifier", new String[]{}, new String[]{}, false, 5, new String[][]{}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", " {isEmpty=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput043() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.parser.TokenQueue", "org.jsoup.parser.TokenQueue", "consumeCssIdentifier", new String[]{}, new String[]{}, false, 6, new String[][]{}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("sample", String.valueOf(actual));
  assertEquals("receiver state after the call", " {isEmpty=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput044() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.parser.TokenQueue", "org.jsoup.parser.TokenQueue", "consumeCssIdentifier", new String[]{}, new String[]{}, false, 7, new String[][]{}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("", String.valueOf(actual));
  assertEquals("receiver state after the call", " {isEmpty=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput045() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.parser.TokenQueue", "org.jsoup.parser.TokenQueue", "consumeCssIdentifier", new String[]{}, new String[]{}, false, 8, new String[][]{}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("a", String.valueOf(actual));
  assertEquals("receiver state after the call", " {isEmpty=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput046() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.parser.TokenQueue", "org.jsoup.parser.TokenQueue", "remainder", new String[]{}, new String[]{}, false, 4, new String[][]{{"org.jsoup.parser.TokenQueue", "consume", "java.lang.String", "12:30:45"}, {"org.jsoup.parser.TokenQueue", "matchesCS", "java.lang.String", "1e10"}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("a", String.valueOf(actual));
  assertEquals("receiver state after the call", " {isEmpty=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput047() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.parser.TokenQueue", "org.jsoup.parser.TokenQueue", "remainder", new String[]{}, new String[]{}, false, 5, new String[][]{{"org.jsoup.parser.TokenQueue", "consume", "java.lang.String", "12:30:45"}, {"org.jsoup.parser.TokenQueue", "matchesCS", "java.lang.String", "1e10"}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", " {isEmpty=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput048() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.select.QueryParser", "org.jsoup.select.QueryParser", "parse", new String[]{"java.lang.String"}, new String[]{"null"}, true, 0, null, 1);
  assertNotNull(actual);
  assertEquals("org.jsoup.select.Evaluator$Tag", actual.getClass().getName());
  assertEquals("null", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput049() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.select.QueryParser", "org.jsoup.select.QueryParser", "parse", new String[]{"java.lang.String"}, new String[]{"nulll"}, true, 0, null, 1);
  assertNotNull(actual);
  assertEquals("org.jsoup.select.Evaluator$Tag", actual.getClass().getName());
  assertEquals("nulll", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput050() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.select.QueryParser", "org.jsoup.select.QueryParser", "parse", new String[]{"java.lang.String"}, new String[]{"n\nulll"}, true, 0, null, 1);
  assertNotNull(actual);
  assertEquals("org.jsoup.select.CombiningEvaluator$And", actual.getClass().getName());
  assertEquals("ulll :parentn", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput051() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.select.QueryParser", "org.jsoup.select.QueryParser", "parse", new String[]{"java.lang.String"}, new String[]{"dn\null"}, true, 0, null, 1);
  assertNotNull(actual);
  assertEquals("org.jsoup.select.CombiningEvaluator$And", actual.getClass().getName());
  assertEquals("ull :parentdn", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput052() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.select.QueryParser", "org.jsoup.select.QueryParser", "parse", new String[]{"java.lang.String"}, new String[]{"n\nulll-1.5"}, true, 0, null, 1);
  assertNotNull(actual);
  assertEquals("org.jsoup.select.CombiningEvaluator$And", actual.getClass().getName());
  assertEquals("ulll-1 .5 :parentn", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput053() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jsoup.select.QueryParser", "org.jsoup.select.QueryParser", "parse", new String[]{"java.lang.String"}, new String[]{"n\nulll-1.5"}, true, 0, null, 1), new String[][]{{"matches", "org.jsoup.nodes.Element,org.jsoup.nodes.Element", "1"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput054() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jsoup.select.QueryParser", "org.jsoup.select.QueryParser", "parse", new String[]{"java.lang.String"}, new String[]{"T\nu_lln,0"}, true, 0, null, 1), new String[][]{{"matches", "org.jsoup.nodes.Element,org.jsoup.nodes.Element", "5"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput055() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jsoup.select.QueryParser", "org.jsoup.select.QueryParser", "parse", new String[]{"java.lang.String"}, new String[]{"T\nu^lln,0"}, true, 0, null, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("org.jsoup.select.Selector$SelectorParseException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput056() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jsoup.select.QueryParser", "org.jsoup.select.QueryParser", "parse", new String[]{"java.lang.String"}, new String[]{"1L"}, true, 0, null, 3), new String[][]{{"matches", "org.jsoup.nodes.Element,org.jsoup.nodes.Element", "5"}, {"matches", "org.jsoup.nodes.Element,org.jsoup.nodes.Element", "0"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput057() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jsoup.select.QueryParser", "org.jsoup.select.QueryParser", "parse", new String[]{"java.lang.String"}, new String[]{":lt("}, true, 0, null, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("org.jsoup.select.Selector$SelectorParseException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput058() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jsoup.select.QueryParser", "org.jsoup.select.QueryParser", "parse", new String[]{"java.lang.String"}, new String[]{"aaaaaaaaaaaaaaaaaabaTabaaaaaa:has(1.12345678"}, true, 0, null, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("org.jsoup.select.Selector$SelectorParseException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput059() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jsoup.select.QueryParser", "org.jsoup.select.QueryParser", "parse", new String[]{"java.lang.String"}, new String[]{""}, true, 0, null, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("org.jsoup.select.Selector$SelectorParseException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput060() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jsoup.select.QueryParser", "org.jsoup.select.QueryParser", "parse", new String[]{"java.lang.String"}, new String[]{"#ak`_aana"}, true, 0, null, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("org.jsoup.select.Selector$SelectorParseException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput061() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jsoup.select.QueryParser", "org.jsoup.select.QueryParser", "parse", new String[]{"java.lang.String"}, new String[]{"["}, true, 0, null, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("org.jsoup.select.Selector$SelectorParseException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput062() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jsoup.select.QueryParser", "org.jsoup.select.QueryParser", "parse", new String[]{"java.lang.String"}, new String[]{"-E-21.1234567"}, true, 0, null, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("org.jsoup.select.Selector$SelectorParseException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput063() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jsoup.select.QueryParser", "org.jsoup.select.QueryParser", "parse", new String[]{"java.lang.String"}, new String[]{"1.5d"}, true, 0, null, 2), new String[][]{{"matches", "org.jsoup.nodes.Element,org.jsoup.nodes.Element", "6"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput064() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jsoup.select.QueryParser", "org.jsoup.select.QueryParser", "parse", new String[]{"java.lang.String"}, new String[]{"3 b:has("}, true, 0, null, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("org.jsoup.select.Selector$SelectorParseException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput065() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jsoup.select.QueryParser", "org.jsoup.select.QueryParser", "parse", new String[]{"java.lang.String"}, new String[]{"[1,2]"}, true, 0, null, 2), new String[][]{{"matches", "org.jsoup.nodes.Element,org.jsoup.nodes.Element", "6"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput066() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jsoup.select.QueryParser", "org.jsoup.select.QueryParser", "parse", new String[]{"java.lang.String"}, new String[]{"T\nu_lln,0"}, true, 0, null, 1), new String[][]{{"matches", "org.jsoup.nodes.Element,org.jsoup.nodes.Element", "6"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput067() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.parser.TokenQueue", "org.jsoup.parser.TokenQueue", "consumeToAny", new String[]{"java.lang.String[]"}, new String[]{"<sample:1>"}, false, 0, null, 1);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("a", String.valueOf(actual));
  assertEquals("receiver state after the call", " {isEmpty=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput068() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.parser.TokenQueue", "org.jsoup.parser.TokenQueue", "consumeToAny", new String[]{"java.lang.String[]"}, new String[]{"<sample:2>"}, false, 0, null, 1);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("", String.valueOf(actual));
  assertEquals("receiver state after the call", "a {isEmpty=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput069() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.parser.TokenQueue", "org.jsoup.parser.TokenQueue", "remainder", new String[]{}, new String[]{}, false, 10, new String[][]{}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("sample", String.valueOf(actual));
  assertEquals("receiver state after the call", " {isEmpty=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput070() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.parser.TokenQueue", "org.jsoup.parser.TokenQueue", "remainder", new String[]{}, new String[]{}, false, 11, new String[][]{}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("", String.valueOf(actual));
  assertEquals("receiver state after the call", " {isEmpty=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput071() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.parser.TokenQueue", "org.jsoup.parser.TokenQueue", "remainder", new String[]{}, new String[]{}, false, 12, new String[][]{}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("a", String.valueOf(actual));
  assertEquals("receiver state after the call", " {isEmpty=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput072() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.parser.TokenQueue", "org.jsoup.parser.TokenQueue", "remainder", new String[]{}, new String[]{}, false, 13, new String[][]{}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", " {isEmpty=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput073() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.parser.TokenQueue", "org.jsoup.parser.TokenQueue", "consumeTagName", new String[]{}, new String[]{}, false, 6, new String[][]{{"org.jsoup.parser.TokenQueue", "matchesStartTag", ""}, {"org.jsoup.parser.TokenQueue", "consumeToAny", "java.lang.String[]", "<sample:1>"}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("sample", String.valueOf(actual));
  assertEquals("receiver state after the call", " {isEmpty=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput074() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.parser.TokenQueue", "org.jsoup.parser.TokenQueue", "consumeTagName", new String[]{}, new String[]{}, false, 7, new String[][]{{"org.jsoup.parser.TokenQueue", "consumeToAny", "java.lang.String[]", "<sample:1>"}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("", String.valueOf(actual));
  assertEquals("receiver state after the call", " {isEmpty=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput075() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.parser.TokenQueue", "org.jsoup.parser.TokenQueue", "matchChomp", new String[]{"java.lang.String"}, new String[]{"1.25"}, false, 0, null, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "a {isEmpty=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput076() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.parser.TokenQueue", "org.jsoup.parser.TokenQueue", "addFirst", new String[]{"java.lang.String"}, new String[]{"\n"}, false, 0, null, 2);
  assertNull(actual);
  assertEquals("receiver state after the call", "\na {isEmpty=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput077() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.parser.TokenQueue", "org.jsoup.parser.TokenQueue", "addFirst", new String[]{"java.lang.String"}, new String[]{"\n."}, false, 0, null, 2);
  assertNull(actual);
  assertEquals("receiver state after the call", "\n.a {isEmpty=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput078() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.parser.TokenQueue", "org.jsoup.parser.TokenQueue", "addFirst", new String[]{"java.lang.String"}, new String[]{"1.1234567"}, false, 0, null, 2);
  assertNull(actual);
  assertEquals("receiver state after the call", "1.1234567a {isEmpty=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput079() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.parser.TokenQueue", "org.jsoup.parser.TokenQueue", "addFirst", new String[]{"java.lang.String"}, new String[]{"1.12345672020-01-01"}, false, 0, null, 2);
  assertNull(actual);
  assertEquals("receiver state after the call", "1.12345672020-01-01a {isEmpty=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput080() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.parser.TokenQueue", "org.jsoup.parser.TokenQueue", "addFirst", new String[]{"java.lang.String"}, new String[]{"1.1234567"}, false, 0, new String[][]{{"org.jsoup.parser.TokenQueue", "addFirst", "java.lang.String", "-0.0"}}, 2);
  assertNull(actual);
  assertEquals("receiver state after the call", "1.1234567-0.0a {isEmpty=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput081() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.parser.TokenQueue", "org.jsoup.parser.TokenQueue", "addFirst", new String[]{"java.lang.String"}, new String[]{"true"}, false, 0, new String[][]{{"org.jsoup.parser.TokenQueue", "chompBalanced", "char,char", "*", "["}}, 3);
  assertNull(actual);
  assertEquals("receiver state after the call", "true {isEmpty=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput082() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.parser.TokenQueue", "org.jsoup.parser.TokenQueue", "addFirst", new String[]{"java.lang.String"}, new String[]{"tru,"}, false, 0, new String[][]{{"org.jsoup.parser.TokenQueue", "chompBalanced", "char,char", "*", "["}}, 3);
  assertNull(actual);
  assertEquals("receiver state after the call", "tru, {isEmpty=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput083() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.parser.TokenQueue", "org.jsoup.parser.TokenQueue", "addFirst", new String[]{"java.lang.String"}, new String[]{"ttru,"}, false, 0, new String[][]{{"org.jsoup.parser.TokenQueue", "chompBalanced", "char,char", "*", "["}}, 3);
  assertNull(actual);
  assertEquals("receiver state after the call", "ttru, {isEmpty=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput084() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.parser.TokenQueue", "org.jsoup.parser.TokenQueue", "addFirst", new String[]{"java.lang.String"}, new String[]{"ttru,"}, false, 0, null, 3);
  assertNull(actual);
  assertEquals("receiver state after the call", "ttru,a {isEmpty=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput085() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.parser.TokenQueue", "org.jsoup.parser.TokenQueue", "matchesAny", new String[]{"java.lang.String[]"}, new String[]{"<sample:1>"}, false, 0, null, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "a {isEmpty=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput086() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.parser.TokenQueue", "org.jsoup.parser.TokenQueue", "matchesAny", new String[]{"java.lang.String[]"}, new String[]{"<sample:1>"}, false, 0, new String[][]{{"org.jsoup.parser.TokenQueue", "consumeElementSelector", ""}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", " {isEmpty=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput087() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.parser.TokenQueue", "org.jsoup.parser.TokenQueue", "consumeWhitespace", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.jsoup.parser.TokenQueue", "addFirst", "java.lang.Character", "_"}, {"org.jsoup.parser.TokenQueue", "chompBalanced", "char,char", "\000", "#"}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "a {isEmpty=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput088() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.parser.TokenQueue", "org.jsoup.parser.TokenQueue", "consumeWhitespace", new String[]{}, new String[]{}, false, 1, new String[][]{{"org.jsoup.parser.TokenQueue", "addFirst", "java.lang.Character", "_"}, {"org.jsoup.parser.TokenQueue", "chompBalanced", "char,char", "\000", "#"}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "0 {isEmpty=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput089() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.parser.TokenQueue", "org.jsoup.parser.TokenQueue", "consumeWhitespace", new String[]{}, new String[]{}, false, 2, new String[][]{{"org.jsoup.parser.TokenQueue", "addFirst", "java.lang.Character", "_"}, {"org.jsoup.parser.TokenQueue", "chompBalanced", "char,char", "\000", "#"}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "sample {isEmpty=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput090() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.parser.TokenQueue", "org.jsoup.parser.TokenQueue", "consumeWhitespace", new String[]{}, new String[]{}, false, 3, new String[][]{{"org.jsoup.parser.TokenQueue", "addFirst", "java.lang.Character", "_"}, {"org.jsoup.parser.TokenQueue", "chompBalanced", "char,char", "\000", "#"}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", " {isEmpty=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput091() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.parser.TokenQueue", "org.jsoup.parser.TokenQueue", "consumeWhitespace", new String[]{}, new String[]{}, false, 6, new String[][]{{"org.jsoup.parser.TokenQueue", "chompBalanced", "char,char", " ", "#"}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "ample {isEmpty=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput092() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.parser.TokenQueue", "org.jsoup.parser.TokenQueue", "consumeWhitespace", new String[]{}, new String[]{}, false, 7, new String[][]{{"org.jsoup.parser.TokenQueue", "consumeTo", "java.lang.String", ""}, {"org.jsoup.parser.TokenQueue", "chompBalanced", "char,char", " ", "#"}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", " {isEmpty=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput093() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jsoup.parser.TokenQueue", "org.jsoup.parser.TokenQueue", "chompTo", new String[]{"java.lang.String"}, new String[]{"<null>"}, false, 0, new String[][]{{"org.jsoup.parser.TokenQueue", "consumeTo", "java.lang.String", "1.5f"}, {"org.jsoup.parser.TokenQueue", "addFirst", "java.lang.Character", "\000"}}, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput094() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.parser.TokenQueue", "org.jsoup.parser.TokenQueue", "chompTo", new String[]{"java.lang.String"}, new String[]{"abc"}, false, 0, new String[][]{{"org.jsoup.parser.TokenQueue", "consumeTo", "java.lang.String", "1.5f"}, {"org.jsoup.parser.TokenQueue", "addFirst", "java.lang.Character", "\000"}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("\000", String.valueOf(actual));
  assertEquals("receiver state after the call", " {isEmpty=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput095() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.parser.TokenQueue", "org.jsoup.parser.TokenQueue", "chompTo", new String[]{"java.lang.String"}, new String[]{"abc"}, false, 0, new String[][]{{"org.jsoup.parser.TokenQueue", "addFirst", "java.lang.Character", "\000"}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("\000a", String.valueOf(actual));
  assertEquals("receiver state after the call", " {isEmpty=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput096() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.parser.TokenQueue", "org.jsoup.parser.TokenQueue", "matchesWhitespace", new String[]{}, new String[]{}, false, 0, null, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "a {isEmpty=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput097() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.parser.TokenQueue", "org.jsoup.parser.TokenQueue", "matchesWhitespace", new String[]{}, new String[]{}, false, 1, new String[][]{{"org.jsoup.parser.TokenQueue", "addFirst", "java.lang.String", "/"}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "/0 {isEmpty=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput098() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.parser.TokenQueue", "org.jsoup.parser.TokenQueue", "matchesWhitespace", new String[]{}, new String[]{}, false, 2, new String[][]{{"org.jsoup.parser.TokenQueue", "addFirst", "java.lang.String", "/"}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "/sample {isEmpty=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput099() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.parser.TokenQueue", "org.jsoup.parser.TokenQueue", "matchesWhitespace", new String[]{}, new String[]{}, false, 2, new String[][]{{"org.jsoup.parser.TokenQueue", "addFirst", "java.lang.String", ""}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "sample {isEmpty=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput100() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.parser.TokenQueue", "org.jsoup.parser.TokenQueue", "matchesWhitespace", new String[]{}, new String[]{}, false, 3, new String[][]{{"org.jsoup.parser.TokenQueue", "addFirst", "java.lang.String", ""}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", " {isEmpty=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput101() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.parser.TokenQueue", "org.jsoup.parser.TokenQueue", "consumeAttributeKey", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.jsoup.parser.TokenQueue", "chompToIgnoreCase", "java.lang.String", "1.5"}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("", String.valueOf(actual));
  assertEquals("receiver state after the call", " {isEmpty=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput102() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.parser.TokenQueue", "org.jsoup.parser.TokenQueue", "consumeAttributeKey", new String[]{}, new String[]{}, false, 10, new String[][]{{"org.jsoup.parser.TokenQueue", "matchesWhitespace", ""}, {"org.jsoup.parser.TokenQueue", "peek", ""}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("sample", String.valueOf(actual));
  assertEquals("receiver state after the call", " {isEmpty=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput103() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.parser.TokenQueue", "org.jsoup.parser.TokenQueue", "consumeAttributeKey", new String[]{}, new String[]{}, false, 22, new String[][]{{"org.jsoup.parser.TokenQueue", "consumeTo", "java.lang.String", "g"}, {"org.jsoup.parser.TokenQueue", "addFirst", "java.lang.Character", "0"}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", " {isEmpty=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput104() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.parser.TokenQueue", "org.jsoup.parser.TokenQueue", "consumeAttributeKey", new String[]{}, new String[]{}, false, 23, new String[][]{{"org.jsoup.parser.TokenQueue", "consumeTo", "java.lang.String", "g"}, {"org.jsoup.parser.TokenQueue", "addFirst", "java.lang.Character", "0"}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", " {isEmpty=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput105() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.parser.TokenQueue", "org.jsoup.parser.TokenQueue", "isEmpty", new String[]{}, new String[]{}, false);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "a {isEmpty=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput106() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.parser.TokenQueue", "org.jsoup.parser.TokenQueue", "isEmpty", new String[]{}, new String[]{}, false, 1, new String[][]{});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "0 {isEmpty=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput107() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.parser.TokenQueue", "org.jsoup.parser.TokenQueue", "isEmpty", new String[]{}, new String[]{}, false, 2, new String[][]{});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "sample {isEmpty=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput108() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.parser.TokenQueue", "org.jsoup.parser.TokenQueue", "isEmpty", new String[]{}, new String[]{}, false, 3, new String[][]{});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
  assertEquals("receiver state after the call", " {isEmpty=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput109() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.parser.TokenQueue", "org.jsoup.parser.TokenQueue", "isEmpty", new String[]{}, new String[]{}, false, 7, new String[][]{{"org.jsoup.parser.TokenQueue", "consumeTagName", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
  assertEquals("receiver state after the call", " {isEmpty=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput110() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.parser.TokenQueue", "org.jsoup.parser.TokenQueue", "isEmpty", new String[]{}, new String[]{}, false, 8, new String[][]{{"org.jsoup.parser.TokenQueue", "consumeTagName", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
  assertEquals("receiver state after the call", " {isEmpty=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput111() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.parser.TokenQueue", "org.jsoup.parser.TokenQueue", "consumeElementSelector", new String[]{}, new String[]{}, false);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("a", String.valueOf(actual));
  assertEquals("receiver state after the call", " {isEmpty=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput112() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.parser.TokenQueue", "org.jsoup.parser.TokenQueue", "consumeElementSelector", new String[]{}, new String[]{}, false, 1, new String[][]{});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", " {isEmpty=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput113() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.parser.TokenQueue", "org.jsoup.parser.TokenQueue", "consumeElementSelector", new String[]{}, new String[]{}, false, 2, new String[][]{});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("sample", String.valueOf(actual));
  assertEquals("receiver state after the call", " {isEmpty=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput114() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.parser.TokenQueue", "org.jsoup.parser.TokenQueue", "consumeElementSelector", new String[]{}, new String[]{}, false, 2, new String[][]{{"org.jsoup.parser.TokenQueue", "peek", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("sample", String.valueOf(actual));
  assertEquals("receiver state after the call", " {isEmpty=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput115() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.parser.TokenQueue", "org.jsoup.parser.TokenQueue", "consumeElementSelector", new String[]{}, new String[]{}, false, 3, new String[][]{});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("", String.valueOf(actual));
  assertEquals("receiver state after the call", " {isEmpty=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput116() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.parser.TokenQueue", "org.jsoup.parser.TokenQueue", "advance", new String[]{}, new String[]{}, false);
  assertNull(actual);
  assertEquals("receiver state after the call", " {isEmpty=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput117() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.parser.TokenQueue", "org.jsoup.parser.TokenQueue", "advance", new String[]{}, new String[]{}, false, 2, new String[][]{});
  assertNull(actual);
  assertEquals("receiver state after the call", "ample {isEmpty=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput118() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.parser.TokenQueue", "org.jsoup.parser.TokenQueue", "advance", new String[]{}, new String[]{}, false, 2, new String[][]{{"org.jsoup.parser.TokenQueue", "consumeTagName", ""}});
  assertNull(actual);
  assertEquals("receiver state after the call", " {isEmpty=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput119() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.parser.TokenQueue", "org.jsoup.parser.TokenQueue", "chompToIgnoreCase", new String[]{"java.lang.String"}, new String[]{"1.5f"}, false, 1, new String[][]{{"org.jsoup.parser.TokenQueue", "consumeTo", "java.lang.String", "2147483648"}, {"org.jsoup.parser.TokenQueue", "matchesWord", ""}, {"org.jsoup.parser.TokenQueue", "matches", "java.lang.String", ":matches("}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("", String.valueOf(actual));
  assertEquals("receiver state after the call", " {isEmpty=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput120() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.parser.TokenQueue", "org.jsoup.parser.TokenQueue", "unescape", new String[]{"java.lang.String"}, new String[]{".5"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals(".5", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput121() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.parser.TokenQueue", "org.jsoup.parser.TokenQueue", "unescape", new String[]{"java.lang.String"}, new String[]{":lt("}, true);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals(":lt(", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput122() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.parser.TokenQueue", "org.jsoup.parser.TokenQueue", "consumeToAny", new String[]{"java.lang.String[]"}, new String[]{"<sample:0>"}, false, 0, new String[][]{{"org.jsoup.parser.TokenQueue", "consumeElementSelector", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("", String.valueOf(actual));
  assertEquals("receiver state after the call", " {isEmpty=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput123() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.parser.TokenQueue", "org.jsoup.parser.TokenQueue", "consumeToAny", new String[]{"java.lang.String[]"}, new String[]{"<sample:2>"}, false, 12, new String[][]{{"org.jsoup.parser.TokenQueue", "chompBalanced", "char,char", ".", " "}, {"org.jsoup.parser.TokenQueue", "consumeElementSelector", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("", String.valueOf(actual));
  assertEquals("receiver state after the call", " {isEmpty=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput124() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.parser.TokenQueue", "org.jsoup.parser.TokenQueue", "consume", new String[]{}, new String[]{}, false);
  assertNotNull(actual);
  assertEquals("java.lang.Character", actual.getClass().getName());
  assertEquals("a", String.valueOf(actual));
  assertEquals("receiver state after the call", " {isEmpty=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput125() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.parser.TokenQueue", "org.jsoup.parser.TokenQueue", "consumeToAny", new String[]{"java.lang.String[]"}, new String[]{"<sample:1>"}, false, 9, new String[][]{{"org.jsoup.parser.TokenQueue", "addFirst", "java.lang.String", "<null>"}, {"org.jsoup.parser.TokenQueue", "chompBalanced", "char,char", ".", "9"}, {"org.jsoup.parser.TokenQueue", "remainder", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("", String.valueOf(actual));
  assertEquals("receiver state after the call", " {isEmpty=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput126() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jsoup.parser.TokenQueue", "org.jsoup.parser.TokenQueue", "consumeToAny", new String[]{"java.lang.String[]"}, new String[]{"<null>"}, false, 9, new String[][]{{"org.jsoup.parser.TokenQueue", "addFirst", "java.lang.String", "<null>"}, {"org.jsoup.parser.TokenQueue", "chompBalanced", "char,char", ".", "9"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput127() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.parser.TokenQueue", "org.jsoup.parser.TokenQueue", "consumeToAny", new String[]{"java.lang.String[]"}, new String[]{"<sample:1>"}, false, 9, new String[][]{{"org.jsoup.parser.TokenQueue", "addFirst", "java.lang.String", "<null>"}, {"org.jsoup.parser.TokenQueue", "chompBalanced", "char,char", ".", "9"}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("ull", String.valueOf(actual));
  assertEquals("receiver state after the call", "0 {isEmpty=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput128() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.parser.TokenQueue", "org.jsoup.parser.TokenQueue", "consumeToAny", new String[]{"java.lang.String[]"}, new String[]{"<sample:2>"}, false, 9, new String[][]{{"org.jsoup.parser.TokenQueue", "addFirst", "java.lang.String", "<null>"}, {"org.jsoup.parser.TokenQueue", "chompBalanced", "char,char", ".", "9"}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("", String.valueOf(actual));
  assertEquals("receiver state after the call", "ull0 {isEmpty=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput129() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.parser.TokenQueue", "org.jsoup.parser.TokenQueue", "consumeWord", new String[]{}, new String[]{}, false);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("a", String.valueOf(actual));
  assertEquals("receiver state after the call", " {isEmpty=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput130() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.parser.TokenQueue", "org.jsoup.parser.TokenQueue", "consumeToAny", new String[]{"java.lang.String[]"}, new String[]{"<empty>"}, false, 9, new String[][]{{"org.jsoup.parser.TokenQueue", "addFirst", "java.lang.String", "<null>"}, {"org.jsoup.parser.TokenQueue", "chompBalanced", "char,char", ".", "9"}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("ull0", String.valueOf(actual));
  assertEquals("receiver state after the call", " {isEmpty=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput131() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.parser.TokenQueue", "org.jsoup.parser.TokenQueue", "consumeToAny", new String[]{"java.lang.String[]"}, new String[]{"<sample:0>"}, false, 9, new String[][]{{"org.jsoup.parser.TokenQueue", "addFirst", "java.lang.String", "<null>"}, {"org.jsoup.parser.TokenQueue", "isEmpty", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("null0", String.valueOf(actual));
  assertEquals("receiver state after the call", " {isEmpty=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput132() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.parser.TokenQueue", "org.jsoup.parser.TokenQueue", "matchesCS", new String[]{"java.lang.String"}, new String[]{"--1"}, false);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "a {isEmpty=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput133() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jsoup.select.QueryParser", "org.jsoup.select.QueryParser", "parse", new String[]{}, new String[]{}, false); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput134() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.parser.TokenQueue", "org.jsoup.parser.TokenQueue", "consumeCssIdentifier", new String[]{}, new String[]{}, false);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("a", String.valueOf(actual));
  assertEquals("receiver state after the call", " {isEmpty=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput135() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.parser.TokenQueue", "org.jsoup.parser.TokenQueue", "consumeCssIdentifier", new String[]{}, new String[]{}, false, 1, new String[][]{});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", " {isEmpty=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput136() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.parser.TokenQueue", "org.jsoup.parser.TokenQueue", "consumeCssIdentifier", new String[]{}, new String[]{}, false, 2, new String[][]{});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("sample", String.valueOf(actual));
  assertEquals("receiver state after the call", " {isEmpty=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput137() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.parser.TokenQueue", "org.jsoup.parser.TokenQueue", "consumeCssIdentifier", new String[]{}, new String[]{}, false, 2, new String[][]{{"org.jsoup.parser.TokenQueue", "consumeElementSelector", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("", String.valueOf(actual));
  assertEquals("receiver state after the call", " {isEmpty=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput138() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.parser.TokenQueue", "org.jsoup.parser.TokenQueue", "consumeToIgnoreCase", new String[]{"java.lang.String"}, new String[]{"1.5e300"}, false);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("a", String.valueOf(actual));
  assertEquals("receiver state after the call", " {isEmpty=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput139() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.parser.TokenQueue", "org.jsoup.parser.TokenQueue", "consumeToIgnoreCase", new String[]{"java.lang.String"}, new String[]{"1.U5e400"}, false, 1, new String[][]{});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", " {isEmpty=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput140() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.parser.TokenQueue", "org.jsoup.parser.TokenQueue", "consumeToIgnoreCase", new String[]{"java.lang.String"}, new String[]{"1.U5e401)1.5"}, false, 15, new String[][]{});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("", String.valueOf(actual));
  assertEquals("receiver state after the call", " {isEmpty=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput141() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.parser.TokenQueue", "org.jsoup.parser.TokenQueue", "remainder", new String[]{}, new String[]{}, false);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("a", String.valueOf(actual));
  assertEquals("receiver state after the call", " {isEmpty=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput142() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.parser.TokenQueue", "org.jsoup.parser.TokenQueue", "remainder", new String[]{}, new String[]{}, false, 1, new String[][]{});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", " {isEmpty=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput143() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.parser.TokenQueue", "org.jsoup.parser.TokenQueue", "remainder", new String[]{}, new String[]{}, false, 2, new String[][]{});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("sample", String.valueOf(actual));
  assertEquals("receiver state after the call", " {isEmpty=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput144() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.parser.TokenQueue", "org.jsoup.parser.TokenQueue", "remainder", new String[]{}, new String[]{}, false, 3, new String[][]{});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("", String.valueOf(actual));
  assertEquals("receiver state after the call", " {isEmpty=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput145() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.parser.TokenQueue", "org.jsoup.parser.TokenQueue", "consumeCssIdentifier", new String[]{}, new String[]{}, false, 5, new String[][]{{"org.jsoup.parser.TokenQueue", "matchesStartTag", ""}, {"org.jsoup.parser.TokenQueue", "matchChomp", "java.lang.String", ":has("}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", " {isEmpty=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput146() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.parser.TokenQueue", "org.jsoup.parser.TokenQueue", "consumeCssIdentifier", new String[]{}, new String[]{}, false, 6, new String[][]{{"org.jsoup.parser.TokenQueue", "matchesStartTag", ""}, {"org.jsoup.parser.TokenQueue", "matchChomp", "java.lang.String", ":has("}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("sample", String.valueOf(actual));
  assertEquals("receiver state after the call", " {isEmpty=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput147() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.parser.TokenQueue", "org.jsoup.parser.TokenQueue", "chompBalanced", new String[]{"char", "char"}, new String[]{".", "0"}, false);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("", String.valueOf(actual));
  assertEquals("receiver state after the call", " {isEmpty=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput148() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.parser.TokenQueue", "org.jsoup.parser.TokenQueue", "matchesAny", new String[]{"char[]"}, new String[]{"<sample:1>"}, false);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
  assertEquals("receiver state after the call", "a {isEmpty=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput149() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jsoup.parser.TokenQueue", "org.jsoup.parser.TokenQueue", "matchesAny", new String[]{"char[]"}, new String[]{"<null>"}, false); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput150() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.parser.TokenQueue", "org.jsoup.parser.TokenQueue", "matchesAny", new String[]{"char[]"}, new String[]{"<empty>"}, false);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "a {isEmpty=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput151() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.parser.TokenQueue", "org.jsoup.parser.TokenQueue", "consumeAttributeKey", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.jsoup.parser.TokenQueue", "consume", "java.lang.String", "true"}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("a", String.valueOf(actual));
  assertEquals("receiver state after the call", " {isEmpty=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput152() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.parser.TokenQueue", "org.jsoup.parser.TokenQueue", "consumeAttributeKey", new String[]{}, new String[]{}, false, 1, new String[][]{{"org.jsoup.parser.TokenQueue", "consume", "java.lang.String", "true"}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", " {isEmpty=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput153() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.parser.TokenQueue", "org.jsoup.parser.TokenQueue", "matches", new String[]{"java.lang.String"}, new String[]{"I"}, false, 0, new String[][]{{"org.jsoup.parser.TokenQueue", "consumeElementSelector", ""}, {"org.jsoup.parser.TokenQueue", "consumeCssIdentifier", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", " {isEmpty=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput154() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.parser.TokenQueue", "org.jsoup.parser.TokenQueue", "addFirst", new String[]{"java.lang.Character"}, new String[]{"_"}, false, 0, new String[][]{{"org.jsoup.parser.TokenQueue", "addFirst", "java.lang.Character", "|"}, {"org.jsoup.parser.TokenQueue", "consumeAttributeKey", ""}});
  assertNull(actual);
  assertEquals("receiver state after the call", "_|a {isEmpty=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput155() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.parser.TokenQueue", "org.jsoup.parser.TokenQueue", "addFirst", new String[]{"java.lang.Character"}, new String[]{"]"}, false, 0, new String[][]{{"org.jsoup.parser.TokenQueue", "addFirst", "java.lang.Character", "|"}, {"org.jsoup.parser.TokenQueue", "consumeAttributeKey", ""}});
  assertNull(actual);
  assertEquals("receiver state after the call", "]|a {isEmpty=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput156() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.parser.TokenQueue", "org.jsoup.parser.TokenQueue", "addFirst", new String[]{"java.lang.Character"}, new String[]{"t"}, false, 0, new String[][]{{"org.jsoup.parser.TokenQueue", "addFirst", "java.lang.Character", "|"}, {"org.jsoup.parser.TokenQueue", "consumeAttributeKey", ""}});
  assertNull(actual);
  assertEquals("receiver state after the call", "t|a {isEmpty=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput157() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.parser.TokenQueue", "org.jsoup.parser.TokenQueue", "addFirst", new String[]{"java.lang.Character"}, new String[]{"|"}, false, 0, new String[][]{{"org.jsoup.parser.TokenQueue", "addFirst", "java.lang.Character", "|"}, {"org.jsoup.parser.TokenQueue", "consumeAttributeKey", ""}});
  assertNull(actual);
  assertEquals("receiver state after the call", "||a {isEmpty=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput158() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.parser.TokenQueue", "org.jsoup.parser.TokenQueue", "addFirst", new String[]{"java.lang.String"}, new String[]{"+1"}, false, 0, new String[][]{{"org.jsoup.parser.TokenQueue", "matchesWhitespace", ""}});
  assertNull(actual);
  assertEquals("receiver state after the call", "+1a {isEmpty=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput159() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.parser.TokenQueue", "org.jsoup.parser.TokenQueue", "matchesStartTag", new String[]{}, new String[]{}, false);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "a {isEmpty=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput160() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.parser.TokenQueue", "org.jsoup.parser.TokenQueue", "addFirst", new String[]{"java.lang.String"}, new String[]{"+1"}, false, 9, new String[][]{{"org.jsoup.parser.TokenQueue", "matchesWhitespace", ""}});
  assertNull(actual);
  assertEquals("receiver state after the call", "+10 {isEmpty=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput161() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.parser.TokenQueue", "org.jsoup.parser.TokenQueue", "matchesStartTag", new String[]{}, new String[]{}, false, 6, new String[][]{{"org.jsoup.parser.TokenQueue", "chompBalanced", "char,char", "-", "a"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "ample {isEmpty=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput162() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jsoup.select.QueryParser", "org.jsoup.select.QueryParser", "parse", new String[]{"java.lang.String"}, new String[]{"T\nt^l"}, true); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("org.jsoup.select.Selector$SelectorParseException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput163() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jsoup.select.QueryParser", "org.jsoup.select.QueryParser", "parse", new String[]{"java.lang.String"}, new String[]{"abc"}, true), new String[][]{{"matches", "org.jsoup.nodes.Element,org.jsoup.nodes.Element", "5"}, {"matches", "org.jsoup.nodes.Element,org.jsoup.nodes.Element", "0"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput164() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.parser.TokenQueue", "org.jsoup.parser.TokenQueue", "toString", new String[]{}, new String[]{}, false);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("a", String.valueOf(actual));
  assertEquals("receiver state after the call", "a {isEmpty=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput165() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.parser.TokenQueue", "org.jsoup.parser.TokenQueue", "consumeTagName", new String[]{}, new String[]{}, false);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("a", String.valueOf(actual));
  assertEquals("receiver state after the call", " {isEmpty=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput166() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.parser.TokenQueue", "org.jsoup.parser.TokenQueue", "matchChomp", new String[]{"java.lang.String"}, new String[]{"true"}, false, 2, new String[][]{{"org.jsoup.parser.TokenQueue", "consume", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "ample {isEmpty=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput167() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.parser.TokenQueue", "org.jsoup.parser.TokenQueue", "matchesAny", new String[]{"java.lang.String[]"}, new String[]{"<sample:1>"}, false, 0, new String[][]{{"org.jsoup.parser.TokenQueue", "chompBalanced", "char,char", "9", "-"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", " {isEmpty=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput168() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.parser.TokenQueue", "org.jsoup.parser.TokenQueue", "matchesWord", new String[]{}, new String[]{}, false);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
  assertEquals("receiver state after the call", "a {isEmpty=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput169() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jsoup.select.QueryParser", "org.jsoup.select.QueryParser", "parse", new String[]{"java.lang.String"}, new String[]{"[1LA-2]nUnkown ccofinat"}, true), new String[][]{{"matches", "org.jsoup.nodes.Element,org.jsoup.nodes.Element", "6"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput170() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.parser.TokenQueue", "org.jsoup.parser.TokenQueue", "matchesCS", new String[]{"java.lang.String"}, new String[]{"a,b,cUnknowncombinator: "}, false, 0, new String[][]{{"org.jsoup.parser.TokenQueue", "advance", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", " {isEmpty=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput171() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.parser.TokenQueue", "org.jsoup.parser.TokenQueue", "consumeToAny", new String[]{"java.lang.String[]"}, new String[]{"<sample:0>"}, false);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("", String.valueOf(actual));
  assertEquals("receiver state after the call", "a {isEmpty=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput172() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.parser.TokenQueue", "org.jsoup.parser.TokenQueue", "consumeToAny", new String[]{"java.lang.String[]"}, new String[]{"<sample:1>"}, false);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("a", String.valueOf(actual));
  assertEquals("receiver state after the call", " {isEmpty=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput173() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.parser.TokenQueue", "org.jsoup.parser.TokenQueue", "matchesWhitespace", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.jsoup.parser.TokenQueue", "consumeTo", "java.lang.String", "12:30:45"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", " {isEmpty=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput174() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.parser.TokenQueue", "org.jsoup.parser.TokenQueue", "matchesWhitespace", new String[]{}, new String[]{}, false, 1, new String[][]{});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "0 {isEmpty=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput175() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.parser.TokenQueue", "org.jsoup.parser.TokenQueue", "matchesWhitespace", new String[]{}, new String[]{}, false, 2, new String[][]{});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "sample {isEmpty=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput176() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.parser.TokenQueue", "org.jsoup.parser.TokenQueue", "matchesWhitespace", new String[]{}, new String[]{}, false, 4, new String[][]{});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "a {isEmpty=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput177() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.parser.TokenQueue", "org.jsoup.parser.TokenQueue", "matchesWhitespace", new String[]{}, new String[]{}, false, 14, new String[][]{{"org.jsoup.parser.TokenQueue", "consume", ""}, {"org.jsoup.parser.TokenQueue", "matchesStartTag", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "ample {isEmpty=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput178() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jsoup.parser.TokenQueue", "org.jsoup.parser.TokenQueue", "matchesWhitespace", new String[]{}, new String[]{}, false, 15, new String[][]{{"org.jsoup.parser.TokenQueue", "consume", ""}, {"org.jsoup.parser.TokenQueue", "matchesStartTag", ""}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.StringIndexOutOfBoundsException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput179() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.parser.TokenQueue", "org.jsoup.parser.TokenQueue", "toString", new String[]{}, new String[]{}, false, 1, new String[][]{});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "0 {isEmpty=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput180() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.parser.TokenQueue", "org.jsoup.parser.TokenQueue", "chompToIgnoreCase", new String[]{"java.lang.String"}, new String[]{"-1.5"}, false, 0, new String[][]{{"org.jsoup.parser.TokenQueue", "chompToIgnoreCase", "java.lang.String", "Hello, World"}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("", String.valueOf(actual));
  assertEquals("receiver state after the call", " {isEmpty=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput181() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.parser.TokenQueue", "org.jsoup.parser.TokenQueue", "chompToIgnoreCase", new String[]{"java.lang.String"}, new String[]{"-1.5"}, false);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("a", String.valueOf(actual));
  assertEquals("receiver state after the call", " {isEmpty=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput182() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.parser.TokenQueue", "org.jsoup.parser.TokenQueue", "matchesCS", new String[]{"java.lang.String"}, new String[]{""}, false, 0, new String[][]{{"org.jsoup.parser.TokenQueue", "chompToIgnoreCase", "java.lang.String", "_"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
  assertEquals("receiver state after the call", " {isEmpty=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput183() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.parser.TokenQueue", "org.jsoup.parser.TokenQueue", "chompTo", new String[]{"java.lang.String"}, new String[]{"a,b,c"}, false, 2, new String[][]{{"org.jsoup.parser.TokenQueue", "addFirst", "java.lang.Character", "a"}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("asample", String.valueOf(actual));
  assertEquals("receiver state after the call", " {isEmpty=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput184() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.parser.TokenQueue", "org.jsoup.parser.TokenQueue", "chompTo", new String[]{"java.lang.String"}, new String[]{":containsData("}, false, 2, new String[][]{{"org.jsoup.parser.TokenQueue", "addFirst", "java.lang.Character", "b"}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("bsample", String.valueOf(actual));
  assertEquals("receiver state after the call", " {isEmpty=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput185() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.parser.TokenQueue", "org.jsoup.parser.TokenQueue", "consumeToAny", new String[]{"java.lang.String[]"}, new String[]{"<sample:5>"}, false, 6, new String[][]{{"org.jsoup.parser.TokenQueue", "peek", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("", String.valueOf(actual));
  assertEquals("receiver state after the call", "sample {isEmpty=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput186() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.parser.TokenQueue", "org.jsoup.parser.TokenQueue", "consumeToAny", new String[]{"java.lang.String[]"}, new String[]{"<sample:0>"}, false, 6, new String[][]{{"org.jsoup.parser.TokenQueue", "matchesCS", "java.lang.String", ":matches("}, {"org.jsoup.parser.TokenQueue", "peek", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("s", String.valueOf(actual));
  assertEquals("receiver state after the call", "ample {isEmpty=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput187() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.parser.TokenQueue", "org.jsoup.parser.TokenQueue", "consumeToAny", new String[]{"java.lang.String[]"}, new String[]{"<empty>"}, false, 6, new String[][]{{"org.jsoup.parser.TokenQueue", "matchesCS", "java.lang.String", ":matches("}, {"org.jsoup.parser.TokenQueue", "matchesAny", "char[]", "<sample:0>"}, {"org.jsoup.parser.TokenQueue", "advance", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("ample", String.valueOf(actual));
  assertEquals("receiver state after the call", " {isEmpty=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput188() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.parser.TokenQueue", "org.jsoup.parser.TokenQueue", "consumeTagName", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.jsoup.parser.TokenQueue", "advance", ""}, {"org.jsoup.parser.TokenQueue", "matchesStartTag", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("", String.valueOf(actual));
  assertEquals("receiver state after the call", " {isEmpty=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput189() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.parser.TokenQueue", "org.jsoup.parser.TokenQueue", "consumeTagName", new String[]{}, new String[]{}, false, 1, new String[][]{{"org.jsoup.parser.TokenQueue", "matchesStartTag", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", " {isEmpty=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput190() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.parser.TokenQueue", "org.jsoup.parser.TokenQueue", "consumeTagName", new String[]{}, new String[]{}, false, 2, new String[][]{{"org.jsoup.parser.TokenQueue", "matchesStartTag", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("sample", String.valueOf(actual));
  assertEquals("receiver state after the call", " {isEmpty=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput191() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.parser.TokenQueue", "org.jsoup.parser.TokenQueue", "addFirst", new String[]{"java.lang.String"}, new String[]{"\n"}, false);
  assertNull(actual);
  assertEquals("receiver state after the call", "\na {isEmpty=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput192() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.parser.TokenQueue", "org.jsoup.parser.TokenQueue", "addFirst", new String[]{"java.lang.String"}, new String[]{""}, false, 0, new String[][]{{"org.jsoup.parser.TokenQueue", "addFirst", "java.lang.String", "-0.01.5g"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "-0.01.5ga {isEmpty=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput193() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.parser.TokenQueue", "org.jsoup.parser.TokenQueue", "addFirst", new String[]{"java.lang.String"}, new String[]{"."}, false, 0, new String[][]{{"org.jsoup.parser.TokenQueue", "addFirst", "java.lang.String", "-0.01.5g"}});
  assertNull(actual);
  assertEquals("receiver state after the call", ".-0.01.5ga {isEmpty=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput194() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.parser.TokenQueue", "org.jsoup.parser.TokenQueue", "matches", new String[]{"java.lang.String"}, new String[]{"-1"}, false, 0, new String[][]{{"org.jsoup.parser.TokenQueue", "matchesCS", "java.lang.String", "1.5d"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "a {isEmpty=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput195() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.parser.TokenQueue", "org.jsoup.parser.TokenQueue", "matchesAny", new String[]{"java.lang.String[]"}, new String[]{"<sample:2>"}, false);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
  assertEquals("receiver state after the call", "a {isEmpty=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput196() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.parser.TokenQueue", "org.jsoup.parser.TokenQueue", "consumeWhitespace", new String[]{}, new String[]{}, false, 20, new String[][]{{"org.jsoup.parser.TokenQueue", "chompBalanced", "char,char", " ", "#"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", " {isEmpty=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput197() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.parser.TokenQueue", "org.jsoup.parser.TokenQueue", "consumeWhitespace", new String[]{}, new String[]{}, false, 22, new String[][]{{"org.jsoup.parser.TokenQueue", "chompBalanced", "char,char", " ", "#"}, {"org.jsoup.parser.TokenQueue", "matchChomp", "java.lang.String", "1L"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "ample {isEmpty=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput198() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.parser.TokenQueue", "org.jsoup.parser.TokenQueue", "matchesCS", new String[]{"java.lang.String"}, new String[]{"dl\rlo,, nrld"}, false, 0, new String[][]{{"org.jsoup.parser.TokenQueue", "addFirst", "java.lang.String", "1"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "1a {isEmpty=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput199() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.parser.TokenQueue", "org.jsoup.parser.TokenQueue", "matchesCS", new String[]{"java.lang.String"}, new String[]{"dl\rlo,, nrLld1.1234567890123456"}, false, 2, new String[][]{});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "sample {isEmpty=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput200() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.parser.TokenQueue", "org.jsoup.parser.TokenQueue", "matchesCS", new String[]{"java.lang.String"}, new String[]{"l\rl,, nrLld1.2345678901_23456"}, false, 5, new String[][]{});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "0 {isEmpty=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput201() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.parser.TokenQueue", "org.jsoup.parser.TokenQueue", "matchesAny", new String[]{"char[]"}, new String[]{"<sample:1>"}, false, 0, new String[][]{{"org.jsoup.parser.TokenQueue", "addFirst", "java.lang.String", "1"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "1a {isEmpty=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput202() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.parser.TokenQueue", "org.jsoup.parser.TokenQueue", "matchesAny", new String[]{"char[]"}, new String[]{"<empty>"}, false, 0, new String[][]{{"org.jsoup.parser.TokenQueue", "addFirst", "java.lang.String", "0"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "0a {isEmpty=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput203() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.parser.TokenQueue", "org.jsoup.parser.TokenQueue", "matchesAny", new String[]{"char[]"}, new String[]{"<empty>"}, false, 0, new String[][]{{"org.jsoup.parser.TokenQueue", "advance", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", " {isEmpty=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput204() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.parser.TokenQueue", "org.jsoup.parser.TokenQueue", "peek", new String[]{}, new String[]{}, false);
  assertNotNull(actual);
  assertEquals("java.lang.Character", actual.getClass().getName());
  assertEquals("a", String.valueOf(actual));
  assertEquals("receiver state after the call", "a {isEmpty=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput205() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.parser.TokenQueue", "org.jsoup.parser.TokenQueue", "matchesWhitespace", new String[]{}, new String[]{}, false, 3, new String[][]{{"org.jsoup.parser.TokenQueue", "matchesCS", "java.lang.String", ":gt("}, {"org.jsoup.parser.TokenQueue", "peek", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", " {isEmpty=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput206() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.parser.TokenQueue", "org.jsoup.parser.TokenQueue", "matchesWhitespace", new String[]{}, new String[]{}, false, 6, new String[][]{{"org.jsoup.parser.TokenQueue", "matchesCS", "java.lang.String", ":gt("}, {"org.jsoup.parser.TokenQueue", "peek", ""}, {"org.jsoup.parser.TokenQueue", "addFirst", "java.lang.Character", " "}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
  assertEquals("receiver state after the call", " sample {isEmpty=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput207() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.parser.TokenQueue", "org.jsoup.parser.TokenQueue", "consume", new String[]{"java.lang.String"}, new String[]{""}, false, 0, new String[][]{{"org.jsoup.parser.TokenQueue", "consumeWord", ""}, {"org.jsoup.parser.TokenQueue", "toString", ""}, {"org.jsoup.parser.TokenQueue", "toString", ""}});
  assertNull(actual);
  assertEquals("receiver state after the call", " {isEmpty=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput208() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.parser.TokenQueue", "org.jsoup.parser.TokenQueue", "chompBalanced", new String[]{"char", "char"}, new String[]{"j", "d"}, false, 14, new String[][]{});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("", String.valueOf(actual));
  assertEquals("receiver state after the call", "ample {isEmpty=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput209() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jsoup.parser.TokenQueue", "org.jsoup.parser.TokenQueue", "chompBalanced", new String[]{"char", "char"}, new String[]{"_", "."}, false, 7, new String[][]{{"org.jsoup.parser.TokenQueue", "consume", ""}, {"org.jsoup.parser.TokenQueue", "toString", ""}, {"org.jsoup.parser.TokenQueue", "consumeCssIdentifier", ""}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.StringIndexOutOfBoundsException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput210() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.parser.TokenQueue", "org.jsoup.parser.TokenQueue", "consumeWhitespace", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.jsoup.parser.TokenQueue", "addFirst", "java.lang.Character", " "}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
  assertEquals("receiver state after the call", "a {isEmpty=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput211() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.parser.TokenQueue", "org.jsoup.parser.TokenQueue", "consumeWhitespace", new String[]{}, new String[]{}, false, 1, new String[][]{{"org.jsoup.parser.TokenQueue", "addFirst", "java.lang.Character", " "}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
  assertEquals("receiver state after the call", "0 {isEmpty=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput212() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.parser.TokenQueue", "org.jsoup.parser.TokenQueue", "consumeWhitespace", new String[]{}, new String[]{}, false, 2, new String[][]{{"org.jsoup.parser.TokenQueue", "addFirst", "java.lang.Character", " "}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
  assertEquals("receiver state after the call", "sample {isEmpty=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput213() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.parser.TokenQueue", "org.jsoup.parser.TokenQueue", "matches", new String[]{"java.lang.String"}, new String[]{":lt("}, false, 0, new String[][]{{"org.jsoup.parser.TokenQueue", "addFirst", "java.lang.Character", "a"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "aa {isEmpty=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput214() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.parser.TokenQueue", "org.jsoup.parser.TokenQueue", "peek", new String[]{}, new String[]{}, false, 1, new String[][]{});
  assertNotNull(actual);
  assertEquals("java.lang.Character", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "0 {isEmpty=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput215() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.parser.TokenQueue", "org.jsoup.parser.TokenQueue", "peek", new String[]{}, new String[]{}, false, 2, new String[][]{});
  assertNotNull(actual);
  assertEquals("java.lang.Character", actual.getClass().getName());
  assertEquals("s", String.valueOf(actual));
  assertEquals("receiver state after the call", "sample {isEmpty=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput216() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.parser.TokenQueue", "org.jsoup.parser.TokenQueue", "peek", new String[]{}, new String[]{}, false, 3, new String[][]{{"org.jsoup.parser.TokenQueue", "toString", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.Character", actual.getClass().getName());
  assertEquals("\000", String.valueOf(actual));
  assertEquals("receiver state after the call", " {isEmpty=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput217() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.parser.TokenQueue", "org.jsoup.parser.TokenQueue", "peek", new String[]{}, new String[]{}, false, 6, new String[][]{{"org.jsoup.parser.TokenQueue", "toString", ""}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Character", actual.getClass().getName());
  assertEquals("s", String.valueOf(actual));
  assertEquals("receiver state after the call", "sample {isEmpty=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput218() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.parser.TokenQueue", "org.jsoup.parser.TokenQueue", "matchChomp", new String[]{"java.lang.String"}, new String[]{"+1"}, false, 0, null, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "a {isEmpty=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput219() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.parser.TokenQueue", "org.jsoup.parser.TokenQueue", "consume", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.jsoup.parser.TokenQueue", "addFirst", "java.lang.String", "1.5e300"}, {"org.jsoup.parser.TokenQueue", "consumeToAny", "java.lang.String[]", "<null>"}});
  assertNotNull(actual);
  assertEquals("java.lang.Character", actual.getClass().getName());
  assertEquals("1", String.valueOf(actual));
  assertEquals("receiver state after the call", ".5e300a {isEmpty=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput220() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.parser.TokenQueue", "org.jsoup.parser.TokenQueue", "consume", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.jsoup.parser.TokenQueue", "addFirst", "java.lang.String", "125e300"}, {"org.jsoup.parser.TokenQueue", "consumeToAny", "java.lang.String[]", "<sample:2>"}});
  assertNotNull(actual);
  assertEquals("java.lang.Character", actual.getClass().getName());
  assertEquals("1", String.valueOf(actual));
  assertEquals("receiver state after the call", "25e300a {isEmpty=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput221() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.parser.TokenQueue", "org.jsoup.parser.TokenQueue", "consume", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.jsoup.parser.TokenQueue", "addFirst", "java.lang.String", "125e300"}, {"org.jsoup.parser.TokenQueue", "consumeToAny", "java.lang.String[]", "<sample:1>"}});
  assertNotNull(actual);
  assertEquals("java.lang.Character", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "0a {isEmpty=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput222() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.parser.TokenQueue", "org.jsoup.parser.TokenQueue", "consume", new String[]{}, new String[]{}, false, 1, new String[][]{{"org.jsoup.parser.TokenQueue", "addFirst", "java.lang.String", "125e300"}, {"org.jsoup.parser.TokenQueue", "consumeToAny", "java.lang.String[]", "<sample:1>"}});
  assertNotNull(actual);
  assertEquals("java.lang.Character", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "00 {isEmpty=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput223() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.parser.TokenQueue", "org.jsoup.parser.TokenQueue", "consume", new String[]{}, new String[]{}, false, 2, new String[][]{{"org.jsoup.parser.TokenQueue", "addFirst", "java.lang.String", "125e300"}, {"org.jsoup.parser.TokenQueue", "consumeToAny", "java.lang.String[]", "<sample:1>"}});
  assertNotNull(actual);
  assertEquals("java.lang.Character", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "0sample {isEmpty=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput224() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.parser.TokenQueue", "org.jsoup.parser.TokenQueue", "consume", new String[]{}, new String[]{}, false, 2, new String[][]{{"org.jsoup.parser.TokenQueue", "addFirst", "java.lang.String", "125e300"}, {"org.jsoup.parser.TokenQueue", "consumeToAny", "java.lang.String[]", "<sample:0>"}});
  assertNotNull(actual);
  assertEquals("java.lang.Character", actual.getClass().getName());
  assertEquals("a", String.valueOf(actual));
  assertEquals("receiver state after the call", "mple {isEmpty=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput225() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jsoup.parser.TokenQueue", "org.jsoup.parser.TokenQueue", "consume", new String[]{}, new String[]{}, false, 3, new String[][]{{"org.jsoup.parser.TokenQueue", "addFirst", "java.lang.String", "125e300"}, {"org.jsoup.parser.TokenQueue", "consumeToAny", "java.lang.String[]", "<sample:0>"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.StringIndexOutOfBoundsException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput226() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.parser.TokenQueue", "org.jsoup.parser.TokenQueue", "unescape", new String[]{"java.lang.String"}, new String[]{"1E-5"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("1E-5", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput227() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.parser.TokenQueue", "org.jsoup.parser.TokenQueue", "unescape", new String[]{"java.lang.String"}, new String[]{"1E-4"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("1E-4", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput228() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.parser.TokenQueue", "org.jsoup.parser.TokenQueue", "unescape", new String[]{"java.lang.String"}, new String[]{"_1E-4"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("_1E-4", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput229() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.parser.TokenQueue", "org.jsoup.parser.TokenQueue", "unescape", new String[]{"java.lang.String"}, new String[]{"_1:E-4"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("_1:E-4", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput230() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.parser.TokenQueue", "org.jsoup.parser.TokenQueue", "unescape", new String[]{"java.lang.String"}, new String[]{"*"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("*", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput231() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.parser.TokenQueue", "org.jsoup.parser.TokenQueue", "unescape", new String[]{"java.lang.String"}, new String[]{"+1"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("+1", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput232() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.parser.TokenQueue", "org.jsoup.parser.TokenQueue", "unescape", new String[]{"java.lang.String"}, new String[]{""}, true);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput233() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.parser.TokenQueue", "org.jsoup.parser.TokenQueue", "unescape", new String[]{"java.lang.String"}, new String[]{":containsData("}, true, 0, null, 2);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals(":containsData(", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput234() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.parser.TokenQueue", "org.jsoup.parser.TokenQueue", "unescape", new String[]{"java.lang.String"}, new String[]{":cntainsData("}, true, 0, null, 2);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals(":cntainsData(", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput235() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.parser.TokenQueue", "org.jsoup.parser.TokenQueue", "unescape", new String[]{"java.lang.String"}, new String[]{":cntinsData("}, true, 0, null, 2);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals(":cntinsData(", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput236() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.parser.TokenQueue", "org.jsoup.parser.TokenQueue", "unescape", new String[]{"java.lang.String"}, new String[]{":cnuinsData("}, true, 0, null, 2);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals(":cnuinsData(", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput237() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.parser.TokenQueue", "org.jsoup.parser.TokenQueue", "unescape", new String[]{"java.lang.String"}, new String[]{":nuinsData("}, true, 0, null, 2);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals(":nuinsData(", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput238() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.parser.TokenQueue", "org.jsoup.parser.TokenQueue", "unescape", new String[]{"java.lang.String"}, new String[]{":nuinsata("}, true, 0, null, 2);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals(":nuinsata(", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput239() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.parser.TokenQueue", "org.jsoup.parser.TokenQueue", "unescape", new String[]{"java.lang.String"}, new String[]{"T:nuinsata("}, true, 0, null, 2);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("T:nuinsata(", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput240() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.parser.TokenQueue", "org.jsoup.parser.TokenQueue", "unescape", new String[]{"java.lang.String"}, new String[]{"null"}, true, 0, null, 2);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("null", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput241() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.parser.TokenQueue", "org.jsoup.parser.TokenQueue", "consumeWord", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.jsoup.parser.TokenQueue", "remainder", ""}, {"org.jsoup.parser.TokenQueue", "matchesWhitespace", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("", String.valueOf(actual));
  assertEquals("receiver state after the call", " {isEmpty=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput242() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.parser.TokenQueue", "org.jsoup.parser.TokenQueue", "consumeAttributeKey", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.jsoup.parser.TokenQueue", "peek", ""}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("a", String.valueOf(actual));
  assertEquals("receiver state after the call", " {isEmpty=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput243() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.parser.TokenQueue", "org.jsoup.parser.TokenQueue", "consumeAttributeKey", new String[]{}, new String[]{}, false, 3, new String[][]{{"org.jsoup.parser.TokenQueue", "matchesStartTag", ""}, {"org.jsoup.parser.TokenQueue", "peek", ""}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("", String.valueOf(actual));
  assertEquals("receiver state after the call", " {isEmpty=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput244() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.parser.TokenQueue", "org.jsoup.parser.TokenQueue", "consumeAttributeKey", new String[]{}, new String[]{}, false, 14, new String[][]{{"org.jsoup.parser.TokenQueue", "matchesStartTag", ""}, {"org.jsoup.parser.TokenQueue", "peek", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("sample", String.valueOf(actual));
  assertEquals("receiver state after the call", " {isEmpty=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput245() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.parser.TokenQueue", "org.jsoup.parser.TokenQueue", "consumeAttributeKey", new String[]{}, new String[]{}, false, 15, new String[][]{{"org.jsoup.parser.TokenQueue", "matchesStartTag", ""}, {"org.jsoup.parser.TokenQueue", "peek", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("", String.valueOf(actual));
  assertEquals("receiver state after the call", " {isEmpty=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput246() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.parser.TokenQueue", "org.jsoup.parser.TokenQueue", "consumeAttributeKey", new String[]{}, new String[]{}, false, 18, new String[][]{{"org.jsoup.parser.TokenQueue", "matchesStartTag", ""}, {"org.jsoup.parser.TokenQueue", "peek", ""}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("sample", String.valueOf(actual));
  assertEquals("receiver state after the call", " {isEmpty=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput247() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.parser.TokenQueue", "org.jsoup.parser.TokenQueue", "unescape", new String[]{"java.lang.String"}, new String[]{"0x123456789"}, true, 0, null, 3);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("0x123456789", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput248() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.select.QueryParser", "org.jsoup.select.QueryParser", "parse", new String[]{"java.lang.String"}, new String[]{"1.134568"}, true);
  assertNotNull(actual);
  assertEquals("org.jsoup.select.CombiningEvaluator$And", actual.getClass().getName());
  assertEquals("1 .134568", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput249() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.select.QueryParser", "org.jsoup.select.QueryParser", "parse", new String[]{"java.lang.String"}, new String[]{"1.144568"}, true);
  assertNotNull(actual);
  assertEquals("org.jsoup.select.CombiningEvaluator$And", actual.getClass().getName());
  assertEquals("1 .144568", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput250() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.select.QueryParser", "org.jsoup.select.QueryParser", "parse", new String[]{"java.lang.String"}, new String[]{"1.1445568"}, true);
  assertNotNull(actual);
  assertEquals("org.jsoup.select.CombiningEvaluator$And", actual.getClass().getName());
  assertEquals("1 .1445568", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput251() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.select.QueryParser", "org.jsoup.select.QueryParser", "parse", new String[]{"java.lang.String"}, new String[]{"1.14455681.5e300"}, true);
  assertNotNull(actual);
  assertEquals("org.jsoup.select.CombiningEvaluator$And", actual.getClass().getName());
  assertEquals("1 .14455681 .5e300", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput252() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.select.QueryParser", "org.jsoup.select.QueryParser", "parse", new String[]{"java.lang.String"}, new String[]{"1.14455681.5e00"}, true);
  assertNotNull(actual);
  assertEquals("org.jsoup.select.CombiningEvaluator$And", actual.getClass().getName());
  assertEquals("1 .14455681 .5e00", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput253() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.select.QueryParser", "org.jsoup.select.QueryParser", "parse", new String[]{"java.lang.String"}, new String[]{"h.14455681.5e300"}, true);
  assertNotNull(actual);
  assertEquals("org.jsoup.select.CombiningEvaluator$And", actual.getClass().getName());
  assertEquals("h .14455681 .5e300", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput254() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.parser.TokenQueue", "org.jsoup.parser.TokenQueue", "consumeTo", new String[]{"java.lang.String"}, new String[]{"1.12345678"}, false, 0, new String[][]{{"org.jsoup.parser.TokenQueue", "matchChomp", "java.lang.String", "1.5"}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("a", String.valueOf(actual));
  assertEquals("receiver state after the call", " {isEmpty=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput255() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jsoup.select.QueryParser", "org.jsoup.select.QueryParser", "parse", new String[]{"java.lang.String"}, new String[]{",1.5"}, true, 0, null, 1), new String[][]{{"add", "org.jsoup.select.Evaluator", "6"}, {"add", "org.jsoup.select.Evaluator", "3"}});
  assertNotNull(actual);
  assertEquals("org.jsoup.select.CombiningEvaluator$Or", actual.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput256() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jsoup.select.QueryParser", "org.jsoup.select.QueryParser", "parse", new String[]{"java.lang.String"}, new String[]{",1.dh5"}, true, 0, null, 2), new String[][]{{"add", "org.jsoup.select.Evaluator", "6"}});
  assertNotNull(actual);
  assertEquals("org.jsoup.select.CombiningEvaluator$Or", actual.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput257() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jsoup.select.QueryParser", "org.jsoup.select.QueryParser", "parse", new String[]{"java.lang.String"}, new String[]{",11-dh591.5eX3001.12345678901234567"}, true, 0, null, 2), new String[][]{{"add", "org.jsoup.select.Evaluator", "6"}, {"matches", "org.jsoup.nodes.Element,org.jsoup.nodes.Element", "0"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput258() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jsoup.select.QueryParser", "org.jsoup.select.QueryParser", "parse", new String[]{"java.lang.String"}, new String[]{",11-dh591.5eX3001-12356789001234567Unknown"}, true), new String[][]{{"add", "org.jsoup.select.Evaluator", "6"}});
  assertNotNull(actual);
  assertEquals("org.jsoup.select.CombiningEvaluator$Or", actual.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput259() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jsoup.select.QueryParser", "org.jsoup.select.QueryParser", "parse", new String[]{"java.lang.String"}, new String[]{",d1,591.53_-Ik1>60x1F9UJ2TLD1"}, true), new String[][]{{"add", "org.jsoup.select.Evaluator", "6"}, {"add", "org.jsoup.select.Evaluator", "2"}, {"add", "org.jsoup.select.Evaluator", "4"}, {"matches", "org.jsoup.nodes.Element,org.jsoup.nodes.Element", "2"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput260() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jsoup.select.QueryParser", "org.jsoup.select.QueryParser", "parse", new String[]{"java.lang.String"}, new String[]{",d1|591.3_-Ik1>0x1F9UJ2SLD1"}, true, 0, null, 1), new String[][]{{"add", "org.jsoup.select.Evaluator", "6"}, {"matches", "org.jsoup.nodes.Element,org.jsoup.nodes.Element", "0"}, {"add", "org.jsoup.select.Evaluator", "5"}, {"add", "org.jsoup.select.Evaluator", "0"}});
  assertNotNull(actual);
  assertEquals("org.jsoup.select.CombiningEvaluator$Or", actual.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput261() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jsoup.select.QueryParser", "org.jsoup.select.QueryParser", "parse", new String[]{"java.lang.String"}, new String[]{"+d1,591.3_-Ik1>0x1F9UJ2SLD1"}, true, 0, null, 1), new String[][]{{"add", "org.jsoup.select.Evaluator", "6"}, {"matches", "org.jsoup.nodes.Element,org.jsoup.nodes.Element", "0"}, {"add", "org.jsoup.select.Evaluator", "6"}, {"add", "org.jsoup.select.Evaluator", "0"}});
  assertNotNull(actual);
  assertEquals("org.jsoup.select.CombiningEvaluator$Or", actual.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput262() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.parser.TokenQueue", "org.jsoup.parser.TokenQueue", "addFirst", new String[]{"java.lang.Character"}, new String[]{"a"}, false, 0, null, 2);
  assertNull(actual);
  assertEquals("receiver state after the call", "aa {isEmpty=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput263() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.parser.TokenQueue", "org.jsoup.parser.TokenQueue", "matchesWord", new String[]{}, new String[]{}, false, 4, new String[][]{{"org.jsoup.parser.TokenQueue", "matchesStartTag", ""}, {"org.jsoup.parser.TokenQueue", "consumeAttributeKey", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", " {isEmpty=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput264() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jsoup.select.QueryParser", "org.jsoup.select.QueryParser", "parse", new String[]{"java.lang.String"}, new String[]{",92"}, true, 0, null, 3), new String[][]{{"add", "org.jsoup.select.Evaluator", "6"}, {"add", "org.jsoup.select.Evaluator", "5"}});
  assertNotNull(actual);
  assertEquals("org.jsoup.select.CombiningEvaluator$Or", actual.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput265() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jsoup.select.QueryParser", "org.jsoup.select.QueryParser", "parse", new String[]{"java.lang.String"}, new String[]{"32"}, true, 0, null, 3), new String[][]{{"matches", "org.jsoup.nodes.Element,org.jsoup.nodes.Element", "6"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput266() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.parser.TokenQueue", "org.jsoup.parser.TokenQueue", "chompTo", new String[]{"java.lang.String"}, new String[]{"I"}, false);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("a", String.valueOf(actual));
  assertEquals("receiver state after the call", " {isEmpty=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput267() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jsoup.select.QueryParser", "org.jsoup.select.QueryParser", "parse", new String[]{"java.lang.String"}, new String[]{"2PoT_ucfon*ta7mO_wmt(x23256889:lt("}, true); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("org.jsoup.select.Selector$SelectorParseException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput268() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.select.QueryParser", "org.jsoup.select.QueryParser", "parse", new String[]{"java.lang.String"}, new String[]{"I"}, true, 0, null, 1);
  assertNotNull(actual);
  assertEquals("org.jsoup.select.Evaluator$Tag", actual.getClass().getName());
  assertEquals("I", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput269() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jsoup.parser.TokenQueue", "org.jsoup.parser.TokenQueue", "consumeTo", new String[]{"java.lang.String"}, new String[]{"<null>"}, false, 5, new String[][]{{"org.jsoup.parser.TokenQueue", "consumeToIgnoreCase", "java.lang.String", ":gt("}}, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput270() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jsoup.select.QueryParser", "org.jsoup.select.QueryParser", "parse", new String[]{"java.lang.String"}, new String[]{"Hello, World"}, true, 0, null, 2), new String[][]{{"matches", "org.jsoup.nodes.Element,org.jsoup.nodes.Element", "5"}, {"add", "org.jsoup.select.Evaluator", "1"}});
  assertNotNull(actual);
  assertEquals("org.jsoup.select.CombiningEvaluator$Or", actual.getClass().getName());
  assertEquals(":or[Hello, World, :or[]]", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput271() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.parser.TokenQueue", "org.jsoup.parser.TokenQueue", "chompTo", new String[]{"java.lang.String"}, new String[]{"[1LA-2]nUnkownccofinat:containsData("}, false, 5, new String[][]{{"org.jsoup.parser.TokenQueue", "addFirst", "java.lang.String", ",11-dh591.5eX3001-12356789001234567Unknown"}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals(",11-dh591.5eX3001-12356789001234567Unknown0", String.valueOf(actual));
  assertEquals("receiver state after the call", " {isEmpty=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput272() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jsoup.parser.TokenQueue", "org.jsoup.parser.TokenQueue", "consumeWord", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.jsoup.parser.TokenQueue", "consumeElementSelector", ""}, {"org.jsoup.parser.TokenQueue", "consume", ""}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.StringIndexOutOfBoundsException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput273() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.parser.TokenQueue", "org.jsoup.parser.TokenQueue", "isEmpty", new String[]{}, new String[]{}, false, 0, null, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "a {isEmpty=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput274() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.parser.TokenQueue", "org.jsoup.parser.TokenQueue", "chompTo", new String[]{"java.lang.String"}, new String[]{"|"}, false, 0, new String[][]{{"org.jsoup.parser.TokenQueue", "consumeTagName", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("", String.valueOf(actual));
  assertEquals("receiver state after the call", " {isEmpty=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput275() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.parser.TokenQueue", "org.jsoup.parser.TokenQueue", "chompTo", new String[]{"java.lang.String"}, new String[]{"2147483648"}, false, 0, new String[][]{{"org.jsoup.parser.TokenQueue", "addFirst", "java.lang.Character", "|"}, {"org.jsoup.parser.TokenQueue", "matchesWord", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("|a", String.valueOf(actual));
  assertEquals("receiver state after the call", " {isEmpty=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput276() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jsoup.select.QueryParser", "org.jsoup.select.QueryParser", "parse", new String[]{"java.lang.String"}, new String[]{"U:containsOwn("}, true); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("org.jsoup.select.Selector$SelectorParseException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput277() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.select.QueryParser", "org.jsoup.select.QueryParser", "parse", new String[]{"java.lang.String"}, new String[]{"a"}, true, 0, null, 3);
  assertNotNull(actual);
  assertEquals("org.jsoup.select.Evaluator$Tag", actual.getClass().getName());
  assertEquals("a", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput278() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.parser.TokenQueue", "org.jsoup.parser.TokenQueue", "chompBalanced", new String[]{"char", "char"}, new String[]{"0", "D"}, false, 15, new String[][]{}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("", String.valueOf(actual));
  assertEquals("receiver state after the call", " {isEmpty=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput279() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.parser.TokenQueue", "org.jsoup.parser.TokenQueue", "consume", new String[]{}, new String[]{}, false, 2, new String[][]{});
  assertNotNull(actual);
  assertEquals("java.lang.Character", actual.getClass().getName());
  assertEquals("s", String.valueOf(actual));
  assertEquals("receiver state after the call", "ample {isEmpty=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput280() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.parser.TokenQueue", "org.jsoup.parser.TokenQueue", "consumeTo", new String[]{"java.lang.String"}, new String[]{""}, false, 0, new String[][]{{"org.jsoup.parser.TokenQueue", "consumeToAny", "java.lang.String[]", "<sample:0>"}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("", String.valueOf(actual));
  assertEquals("receiver state after the call", "a {isEmpty=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput281() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jsoup.select.QueryParser", "org.jsoup.select.QueryParser", "parse", new String[]{"java.lang.String"}, new String[]{",d1|5591.3_,k1>0x1F9UJ22MD1abc1["}, true); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("org.jsoup.select.Selector$SelectorParseException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput282() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.parser.TokenQueue", "org.jsoup.parser.TokenQueue", "matchChomp", new String[]{"java.lang.String"}, new String[]{"+1"}, false);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "a {isEmpty=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput283() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jsoup.parser.TokenQueue", "org.jsoup.parser.TokenQueue", "toString", new String[]{}, new String[]{}, false, 5, new String[][]{{"org.jsoup.parser.TokenQueue", "consume", ""}, {"org.jsoup.parser.TokenQueue", "consume", ""}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.StringIndexOutOfBoundsException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput284() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jsoup.select.QueryParser", "org.jsoup.select.QueryParser", "parse", new String[]{"java.lang.String"}, new String[]{"I,d1*,5q.53_-Ik6>60wx1F9UJ2TLD11.12345678"}, true, 0, null, 1), new String[][]{{"add", "org.jsoup.select.Evaluator", "4"}, {"add", "org.jsoup.select.Evaluator", "4"}});
  assertNotNull(actual);
  assertEquals("org.jsoup.select.CombiningEvaluator$Or", actual.getClass().getName());
  assertEquals(":or[I, d1 *, 60wx1F9UJ2TLD11 .12345678 :ImmediateParent5q .53_-Ik6, [^a], [^a]]", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput285() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.parser.TokenQueue", "org.jsoup.parser.TokenQueue", "matchesAny", new String[]{"char[]"}, new String[]{"<sample:0>"}, false, 0, new String[][]{{"org.jsoup.parser.TokenQueue", "matchesAny", "java.lang.String[]", "<sample:2>"}, {"org.jsoup.parser.TokenQueue", "addFirst", "java.lang.String", "i"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "ia {isEmpty=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput286() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.parser.TokenQueue", "org.jsoup.parser.TokenQueue", "matchChomp", new String[]{"java.lang.String"}, new String[]{"a,b,c"}, false, 3, new String[][]{{"org.jsoup.parser.TokenQueue", "remainder", ""}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", " {isEmpty=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput287() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jsoup.select.QueryParser", "org.jsoup.select.QueryParser", "parse", new String[]{"java.lang.String"}, new String[]{"lf0Bw1T*,f4_w_._.-5>6*wl.25xa+112-1"}, true, 0, null, 2), new String[][]{{"add", "org.jsoup.select.Evaluator", "4"}, {"add", "org.jsoup.select.Evaluator", "5"}, {"matches", "org.jsoup.nodes.Element,org.jsoup.nodes.Element", "7"}, {"add", "org.jsoup.select.Evaluator", "6"}});
  assertNotNull(actual);
  assertEquals("org.jsoup.select.CombiningEvaluator$Or", actual.getClass().getName());
  assertEquals(":or[lf0Bw1T *, 112-1 :prev6 * wl .25xa :ImmediateParentf4_w_ ._ .-5, [^a], [a=0], [a*=0]]", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput288() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jsoup.select.QueryParser", "org.jsoup.select.QueryParser", "parse", new String[]{"java.lang.String"}, new String[]{"l0Bw1T*,f4_w_._.-5>6*wl.25ya+112-1"}, true, 0, null, 2), new String[][]{{"add", "org.jsoup.select.Evaluator", "4"}, {"add", "org.jsoup.select.Evaluator", "5"}, {"matches", "org.jsoup.nodes.Element,org.jsoup.nodes.Element", "1"}, {"add", "org.jsoup.select.Evaluator", "7"}});
  assertNotNull(actual);
  assertEquals("org.jsoup.select.CombiningEvaluator$Or", actual.getClass().getName());
  assertEquals(":or[l0Bw1T *, 112-1 :prev6 * wl .25ya :ImmediateParentf4_w_ ._ .-5, [^a], [a=0], [a$=0]]", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput289() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jsoup.select.QueryParser", "org.jsoup.select.QueryParser", "parse", new String[]{"java.lang.String"}, new String[]{"lf0Bw1T*,f4_w_._.-5>*wl.25ya*112-11"}, true, 0, null, 2), new String[][]{{"add", "org.jsoup.select.Evaluator", "4"}, {"add", "org.jsoup.select.Evaluator", "5"}, {"matches", "org.jsoup.nodes.Element,org.jsoup.nodes.Element", "1"}, {"add", "org.jsoup.select.Evaluator", "7"}});
  assertNotNull(actual);
  assertEquals("org.jsoup.select.CombiningEvaluator$Or", actual.getClass().getName());
  assertEquals(":or[lf0Bw1T *, * wl .25ya * 112-11 :ImmediateParentf4_w_ ._ .-5, [^a], [a=0], [a$=0]]", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput290() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.parser.TokenQueue", "org.jsoup.parser.TokenQueue", "matchesStartTag", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.jsoup.parser.TokenQueue", "addFirst", "java.lang.String", "/a/b"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "/a/ba {isEmpty=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput291() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jsoup.select.QueryParser", "org.jsoup.select.QueryParser", "parse", new String[]{"java.lang.String"}, new String[]{"o0001BCw2T*,f4n_w_-_._.-T5>*wlq5b+21s1111-2T23b567"}, true, 0, null, 3), new String[][]{{"add", "org.jsoup.select.Evaluator", "4"}, {"add", "org.jsoup.select.Evaluator", "5"}});
  assertNotNull(actual);
  assertEquals("org.jsoup.select.CombiningEvaluator$Or", actual.getClass().getName());
  assertEquals(":or[o0001BCw2T *, 21s1111-2T23b567 :prev* wlq5b :ImmediateParentf4n_w_-_ ._ .-T5, [^a], [a=0]]", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput292() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jsoup.select.QueryParser", "org.jsoup.select.QueryParser", "parse", new String[]{"java.lang.String"}, new String[]{"of0i001BCw2T*,f4no_w_-_._.-T5>*wlq5b31s1121-F223b5671.5w"}, true, 0, null, 3), new String[][]{{"add", "org.jsoup.select.Evaluator", "4"}, {"add", "org.jsoup.select.Evaluator", "5"}});
  assertNotNull(actual);
  assertEquals("org.jsoup.select.CombiningEvaluator$Or", actual.getClass().getName());
  assertEquals(":or[of0i001BCw2T *, * wlq5b31s1121-F223b5671 .5w :ImmediateParentf4no_w_-_ ._ .-T5, [^a], [a=0]]", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput293() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jsoup.select.QueryParser", "org.jsoup.select.QueryParser", "parse", new String[]{"java.lang.String"}, new String[]{"of0i001BCw1T*,f4no_w_-_._.-T5*wlq5b31s1121-F223b5671.5w"}, true, 0, null, 3), new String[][]{{"add", "org.jsoup.select.Evaluator", "4"}, {"add", "org.jsoup.select.Evaluator", "5"}});
  assertNotNull(actual);
  assertEquals("org.jsoup.select.CombiningEvaluator$Or", actual.getClass().getName());
  assertEquals(":or[of0i001BCw1T *, f4no_w_-_ ._ .-T5 * wlq5b31s1121-F223b5671 .5w, [^a], [a=0]]", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput294() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jsoup.select.QueryParser", "org.jsoup.select.QueryParser", "parse", new String[]{"java.lang.String"}, new String[]{"og0i001BCw1T*,f4no_w_-_._.-T5*wlq5b31s1121-F223b5671.5w"}, true, 0, null, 3), new String[][]{{"add", "org.jsoup.select.Evaluator", "4"}, {"add", "org.jsoup.select.Evaluator", "5"}});
  assertNotNull(actual);
  assertEquals("org.jsoup.select.CombiningEvaluator$Or", actual.getClass().getName());
  assertEquals(":or[og0i001BCw1T *, f4no_w_-_ ._ .-T5 * wlq5b31s1121-F223b5671 .5w, [^a], [a=0]]", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput295() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.parser.TokenQueue", "org.jsoup.parser.TokenQueue", "chompTo", new String[]{"java.lang.String"}, new String[]{"I"}, false, 0, new String[][]{{"org.jsoup.parser.TokenQueue", "matchesAny", "char[]", "<empty>"}, {"org.jsoup.parser.TokenQueue", "addFirst", "java.lang.String", "+1"}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("+1a", String.valueOf(actual));
  assertEquals("receiver state after the call", " {isEmpty=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput296() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.parser.TokenQueue", "org.jsoup.parser.TokenQueue", "matchesStartTag", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.jsoup.parser.TokenQueue", "isEmpty", ""}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "a {isEmpty=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput297() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.parser.TokenQueue", "org.jsoup.parser.TokenQueue", "matchChomp", new String[]{"java.lang.String"}, new String[]{"/a/b"}, false, 1, new String[][]{{"org.jsoup.parser.TokenQueue", "consumeToAny", "java.lang.String[]", "<sample:1>"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "0 {isEmpty=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput298() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.parser.TokenQueue", "org.jsoup.parser.TokenQueue", "matches", new String[]{"java.lang.String"}, new String[]{":lt("}, false, 1, new String[][]{{"org.jsoup.parser.TokenQueue", "addFirst", "java.lang.Character", "|"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "|0 {isEmpty=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput299() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.select.QueryParser", "org.jsoup.select.QueryParser", "parse", new String[]{"java.lang.String"}, new String[]{"0xFFFFFFFF"}, true, 0, null, 1);
  assertNotNull(actual);
  assertEquals("org.jsoup.select.Evaluator$Tag", actual.getClass().getName());
  assertEquals("0xFFFFFFFF", SearchInputFactory_scaffolding.observe(actual));
 }
}
