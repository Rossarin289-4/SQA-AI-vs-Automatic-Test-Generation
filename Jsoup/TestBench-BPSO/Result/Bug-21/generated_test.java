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
  try { SearchInputFactory_scaffolding.call("org.jsoup.select.QueryParser", "org.jsoup.select.QueryParser", "parse", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.jsoup.select.QueryParser", "parse", ""}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput001() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jsoup.select.CombiningEvaluator", "org.jsoup.select.CombiningEvaluator$And", "matches", new String[]{"org.jsoup.nodes.Element", "org.jsoup.nodes.Element"}, new String[]{"<sample:2>", "<sample:2>"}, false, 3, new String[][]{}, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput002() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jsoup.select.CombiningEvaluator", "org.jsoup.select.CombiningEvaluator$And", "matches", new String[]{"org.jsoup.nodes.Element", "org.jsoup.nodes.Element"}, new String[]{"<sample:0>", "<sample:1>"}, false); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.ClassCastException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput003() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jsoup.select.CombiningEvaluator", "org.jsoup.select.CombiningEvaluator$And", "matches", new String[]{"org.jsoup.nodes.Element", "org.jsoup.nodes.Element"}, new String[]{"<sample:2>", "<sample:7>"}, false, 0, null, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.ClassCastException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput004() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jsoup.select.QueryParser", "org.jsoup.select.QueryParser", "parse", new String[]{}, new String[]{}, false, 0, null, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput005() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jsoup.select.QueryParser", "org.jsoup.select.QueryParser", "parse", new String[]{"java.lang.String"}, new String[]{":matchesOwn(:eq("}, true); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.util.regex.PatternSyntaxException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput006() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.select.QueryParser", "org.jsoup.select.QueryParser", "parse", new String[]{"java.lang.String"}, new String[]{"PT1H"}, true, 0, null, 3);
  assertNotNull(actual);
  assertEquals("org.jsoup.select.Evaluator$Tag", actual.getClass().getName());
  assertEquals("pt1h", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput007() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jsoup.select.CombiningEvaluator", "org.jsoup.select.CombiningEvaluator$And", "matches", new String[]{"org.jsoup.nodes.Element", "org.jsoup.nodes.Element"}, new String[]{"<sample:5>", "<sample:2>"}, false, 7, new String[][]{{"org.jsoup.select.CombiningEvaluator", "matches", "org.jsoup.nodes.Element,org.jsoup.nodes.Element", "<sample:7>", "<sample:1>"}}, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput008() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jsoup.select.CombiningEvaluator", "org.jsoup.select.CombiningEvaluator$And", "matches", new String[]{"org.jsoup.nodes.Element", "org.jsoup.nodes.Element"}, new String[]{"<sample:11>", "<sample:0>"}, false, 0, null, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.ClassCastException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput009() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jsoup.select.CombiningEvaluator", "org.jsoup.select.CombiningEvaluator$And", "matches", new String[]{"org.jsoup.nodes.Element", "org.jsoup.nodes.Element"}, new String[]{"<sample:5>", "<sample:4>"}, false, 3, new String[][]{}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput010() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.select.CombiningEvaluator", "org.jsoup.select.CombiningEvaluator$And", "matches", new String[]{"org.jsoup.nodes.Element", "org.jsoup.nodes.Element"}, new String[]{"<sample:2>", "<sample:7>"}, false, 3, new String[][]{});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "[a=0] [a*=0]", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput011() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jsoup.select.QueryParser", "org.jsoup.select.QueryParser", "parse", new String[]{"java.lang.String"}, new String[]{":h"}, true); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("org.jsoup.select.Selector$SelectorParseException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput012() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.select.QueryParser", "org.jsoup.select.QueryParser", "parse", new String[]{"java.lang.String"}, new String[]{"3-1"}, true);
  assertNotNull(actual);
  assertEquals("org.jsoup.select.Evaluator$Tag", actual.getClass().getName());
  assertEquals("3-1", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput013() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jsoup.select.QueryParser", "org.jsoup.select.QueryParser", "parse", new String[]{"java.lang.String"}, new String[]{"-"}, true, 0, null, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("org.jsoup.select.Selector$SelectorParseException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput014() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jsoup.select.QueryParser", "org.jsoup.select.QueryParser", "parse", new String[]{"java.lang.String"}, new String[]{","}, true); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("org.jsoup.select.Selector$SelectorParseException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput015() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.select.QueryParser", "org.jsoup.select.QueryParser", "parse", new String[]{"java.lang.String"}, new String[]{"a"}, true);
  assertNotNull(actual);
  assertEquals("org.jsoup.select.Evaluator$Tag", actual.getClass().getName());
  assertEquals("a", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput016() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jsoup.select.QueryParser", "org.jsoup.select.QueryParser", "parse", new String[]{"java.lang.String"}, new String[]{":gt("}, true); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput017() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jsoup.select.QueryParser", "org.jsoup.select.QueryParser", "parse", new String[]{"java.lang.String"}, new String[]{":not("}, true); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput018() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jsoup.select.QueryParser", "org.jsoup.select.QueryParser", "parse", new String[]{"java.lang.String"}, new String[]{"1.12345T678"}, true), new String[][]{{"matches", "org.jsoup.nodes.Element,org.jsoup.nodes.Element", "3"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput019() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jsoup.select.CombiningEvaluator", "org.jsoup.select.CombiningEvaluator$And", "matches", new String[]{"org.jsoup.nodes.Element", "org.jsoup.nodes.Element"}, new String[]{"<sample:6>", "<sample:0>"}, false, 7, new String[][]{{"org.jsoup.select.CombiningEvaluator", "matches", "org.jsoup.nodes.Element,org.jsoup.nodes.Element", "<sample:6>", "<sample:7>"}, {"org.jsoup.select.CombiningEvaluator", "matches", "org.jsoup.nodes.Element,org.jsoup.nodes.Element", "<sample:9>", "<sample:9>"}}, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput020() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jsoup.select.CombiningEvaluator", "org.jsoup.select.CombiningEvaluator$And", "matches", new String[]{"org.jsoup.nodes.Element", "org.jsoup.nodes.Element"}, new String[]{"<sample:4>", "<sample:7>"}, false, 0, new String[][]{{"org.jsoup.select.CombiningEvaluator", "matches", "org.jsoup.nodes.Element,org.jsoup.nodes.Element", "<sample:4>", "<sample:3>"}}, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.ClassCastException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput021() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.select.QueryParser", "org.jsoup.select.QueryParser", "parse", new String[]{"java.lang.String"}, new String[]{"aaaaaaaaaaaaaaaaaaaaaaaaaaaaa9"}, true);
  assertNotNull(actual);
  assertEquals("org.jsoup.select.Evaluator$Tag", actual.getClass().getName());
  assertEquals("aaaaaaaaaaaaaaaaaaaaaaaaaaaaa9", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput022() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jsoup.select.QueryParser", "org.jsoup.select.QueryParser", "parse", new String[]{"java.lang.String"}, new String[]{"1.1234567:lt(i"}, true); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput023() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jsoup.select.QueryParser", "org.jsoup.select.QueryParser", "parse", new String[]{"java.lang.String"}, new String[]{"0w10"}, true, 0, null, 3), new String[][]{{"matches", "org.jsoup.nodes.Element,org.jsoup.nodes.Element", "0"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput024() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jsoup.select.QueryParser", "org.jsoup.select.QueryParser", "parse", new String[]{"java.lang.String"}, new String[]{":contains("}, true, 0, null, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput025() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.select.QueryParser", "org.jsoup.select.QueryParser", "parse", new String[]{"java.lang.String"}, new String[]{"ba"}, true);
  assertNotNull(actual);
  assertEquals("org.jsoup.select.Evaluator$Tag", actual.getClass().getName());
  assertEquals("ba", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput026() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.select.QueryParser", "org.jsoup.select.QueryParser", "parse", new String[]{"java.lang.String"}, new String[]{"1.123h5T6781L"}, true, 0, null, 1);
  assertNotNull(actual);
  assertEquals("org.jsoup.select.CombiningEvaluator$And", actual.getClass().getName());
  assertEquals("1 .123h5t6781l", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput027() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.select.QueryParser", "org.jsoup.select.QueryParser", "parse", new String[]{"java.lang.String"}, new String[]{"ch0"}, true);
  assertNotNull(actual);
  assertEquals("org.jsoup.select.Evaluator$Tag", actual.getClass().getName());
  assertEquals("ch0", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput028() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.select.QueryParser", "org.jsoup.select.QueryParser", "parse", new String[]{"java.lang.String"}, new String[]{"U"}, true);
  assertNotNull(actual);
  assertEquals("org.jsoup.select.Evaluator$Tag", actual.getClass().getName());
  assertEquals("u", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput029() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jsoup.select.QueryParser", "org.jsoup.select.QueryParser", "parse", new String[]{"java.lang.String"}, new String[]{":matches("}, true); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput030() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.select.QueryParser", "org.jsoup.select.QueryParser", "parse", new String[]{"java.lang.String"}, new String[]{"PT1H"}, true);
  assertNotNull(actual);
  assertEquals("org.jsoup.select.Evaluator$Tag", actual.getClass().getName());
  assertEquals("pt1h", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput031() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.select.CombiningEvaluator", "org.jsoup.select.CombiningEvaluator$And", "matches", new String[]{"org.jsoup.nodes.Element", "org.jsoup.nodes.Element"}, new String[]{"<sample:5>", "<sample:7>"}, false, 7, new String[][]{{"org.jsoup.select.CombiningEvaluator", "matches", "org.jsoup.nodes.Element,org.jsoup.nodes.Element", "<sample:1>", "<sample:6>"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "[a!=0] [a^=0] .a", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput032() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.select.QueryParser", "org.jsoup.select.QueryParser", "parse", new String[]{"java.lang.String"}, new String[]{"aaaaaaaaaaaaaaaaaaaaaIaaaaaaaa"}, true, 0, null, 2);
  assertNotNull(actual);
  assertEquals("org.jsoup.select.Evaluator$Tag", actual.getClass().getName());
  assertEquals("aaaaaaaaaaaaaaaaaaaaaiaaaaaaaa", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput033() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jsoup.select.QueryParser", "org.jsoup.select.QueryParser", "parse", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.jsoup.select.QueryParser", "parse", ""}}, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput034() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jsoup.select.QueryParser", "org.jsoup.select.QueryParser", "parse", new String[]{"java.lang.String"}, new String[]{""}, true, 0, null, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("org.jsoup.select.Selector$SelectorParseException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput035() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.select.QueryParser", "org.jsoup.select.QueryParser", "parse", new String[]{"java.lang.String"}, new String[]{"+U"}, true);
  assertNotNull(actual);
  assertEquals("org.jsoup.select.CombiningEvaluator$And", actual.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput036() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.select.QueryParser", "org.jsoup.select.QueryParser", "parse", new String[]{"java.lang.String"}, new String[]{".A"}, true);
  assertNotNull(actual);
  assertEquals("org.jsoup.select.Evaluator$Class", actual.getClass().getName());
  assertEquals(".a", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput037() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.select.QueryParser", "org.jsoup.select.QueryParser", "parse", new String[]{"java.lang.String"}, new String[]{"*"}, true, 0, null, 2);
  assertNotNull(actual);
  assertEquals("org.jsoup.select.Evaluator$AllElements", actual.getClass().getName());
  assertEquals("*", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput038() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.select.QueryParser", "org.jsoup.select.QueryParser", "parse", new String[]{"java.lang.String"}, new String[]{"Hello, World"}, true, 0, null, 2);
  assertNotNull(actual);
  assertEquals("org.jsoup.select.CombiningEvaluator$Or", actual.getClass().getName());
  assertEquals(":or[hello, world]", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput039() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jsoup.select.QueryParser", "org.jsoup.select.QueryParser", "parse", new String[]{"java.lang.String"}, new String[]{"1.4f+1"}, true), new String[][]{{"matches", "org.jsoup.nodes.Element,org.jsoup.nodes.Element", "0"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput040() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.select.QueryParser", "org.jsoup.select.QueryParser", "parse", new String[]{"java.lang.String"}, new String[]{"1.4f+1"}, true, 0, null, 2);
  assertNotNull(actual);
  assertEquals("org.jsoup.select.CombiningEvaluator$And", actual.getClass().getName());
  assertEquals("1 :prev1 .4f", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput041() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jsoup.select.QueryParser", "org.jsoup.select.QueryParser", "parse", new String[]{"java.lang.String"}, new String[]{"1.12345678"}, true, 0, null, 2), new String[][]{{"matches", "org.jsoup.nodes.Element,org.jsoup.nodes.Element", "1"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput042() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jsoup.select.QueryParser", "org.jsoup.select.QueryParser", "parse", new String[]{"java.lang.String"}, new String[]{"ab "}, true); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("org.jsoup.select.Selector$SelectorParseException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput043() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jsoup.select.QueryParser", "org.jsoup.select.QueryParser", "parse", new String[]{"java.lang.String"}, new String[]{"[1,2]1e10"}, true), new String[][]{{"matches", "org.jsoup.nodes.Element,org.jsoup.nodes.Element", "7"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput044() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jsoup.select.QueryParser", "org.jsoup.select.QueryParser", "parse", new String[]{}, new String[]{}, false, 0, null, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput045() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jsoup.select.QueryParser", "org.jsoup.select.QueryParser", "parse", new String[]{"java.lang.String"}, new String[]{"Unkno0n ombinator: "}, true); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("org.jsoup.select.Selector$SelectorParseException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput046() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.select.QueryParser", "org.jsoup.select.QueryParser", "parse", new String[]{"java.lang.String"}, new String[]{"a,b,c"}, true);
  assertNotNull(actual);
  assertEquals("org.jsoup.select.CombiningEvaluator$Or", actual.getClass().getName());
  assertEquals(":or[a, b, c]", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput047() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.select.QueryParser", "org.jsoup.select.QueryParser", "parse", new String[]{"java.lang.String"}, new String[]{"1e1o"}, true, 0, null, 3);
  assertNotNull(actual);
  assertEquals("org.jsoup.select.Evaluator$Tag", actual.getClass().getName());
  assertEquals("1e1o", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput048() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.select.QueryParser", "org.jsoup.select.QueryParser", "parse", new String[]{"java.lang.String"}, new String[]{"[1,(]1e10"}, true, 0, null, 3);
  assertNotNull(actual);
  assertEquals("org.jsoup.select.CombiningEvaluator$And", actual.getClass().getName());
  assertEquals("[1,(] 1e10", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput049() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.select.QueryParser", "org.jsoup.select.QueryParser", "parse", new String[]{"java.lang.String"}, new String[]{"+0"}, true, 0, null, 2);
  assertNotNull(actual);
  assertEquals("org.jsoup.select.CombiningEvaluator$And", actual.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput050() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.select.CombiningEvaluator", "org.jsoup.select.CombiningEvaluator$And", "matches", new String[]{"org.jsoup.nodes.Element", "org.jsoup.nodes.Element"}, new String[]{"<sample:5>", "<sample:7>"}, false, 1, new String[][]{{"org.jsoup.select.CombiningEvaluator", "matches", "org.jsoup.nodes.Element,org.jsoup.nodes.Element", "<sample:3>", "<sample:5>"}, {"org.jsoup.select.CombiningEvaluator", "matches", "org.jsoup.nodes.Element,org.jsoup.nodes.Element", "<sample:8>", "<sample:4>"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "[a] [^a] [a=0]", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput051() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.select.CombiningEvaluator", "org.jsoup.select.CombiningEvaluator$And", "matches", new String[]{"org.jsoup.nodes.Element", "org.jsoup.nodes.Element"}, new String[]{"<null>", "<sample:3>"}, false, 5, new String[][]{}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "[a$=0]", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput052() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.select.QueryParser", "org.jsoup.select.QueryParser", "parse", new String[]{"java.lang.String"}, new String[]{"TITLE"}, true, 0, null, 3);
  assertNotNull(actual);
  assertEquals("org.jsoup.select.Evaluator$Tag", actual.getClass().getName());
  assertEquals("title", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput053() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.select.QueryParser", "org.jsoup.select.QueryParser", "parse", new String[]{"java.lang.String"}, new String[]{"2147483648|"}, true);
  assertNotNull(actual);
  assertEquals("org.jsoup.select.Evaluator$Tag", actual.getClass().getName());
  assertEquals("2147483648:", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput054() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.select.QueryParser", "org.jsoup.select.QueryParser", "parse", new String[]{"java.lang.String"}, new String[]{"I"}, true, 0, null, 2);
  assertNotNull(actual);
  assertEquals("org.jsoup.select.Evaluator$Tag", actual.getClass().getName());
  assertEquals("i", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput055() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jsoup.select.QueryParser", "org.jsoup.select.QueryParser", "parse", new String[]{"java.lang.String"}, new String[]{"Unknown [ombinator: "}, true), new String[][]{{"matches", "org.jsoup.nodes.Element,org.jsoup.nodes.Element", "1"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput056() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jsoup.select.QueryParser", "org.jsoup.select.QueryParser", "parse", new String[]{"java.lang.String"}, new String[]{"PT1HHello, World"}, true, 0, null, 3), new String[][]{{"matches", "org.jsoup.nodes.Element,org.jsoup.nodes.Element", "1"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput057() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jsoup.select.QueryParser", "org.jsoup.select.QueryParser", "parse", new String[]{"java.lang.String"}, new String[]{"PT1H"}, true, 0, null, 1), new String[][]{{"matches", "org.jsoup.nodes.Element,org.jsoup.nodes.Element", "1"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput058() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.select.QueryParser", "org.jsoup.select.QueryParser", "parse", new String[]{"java.lang.String"}, new String[]{"j"}, true, 0, null, 2);
  assertNotNull(actual);
  assertEquals("org.jsoup.select.Evaluator$Tag", actual.getClass().getName());
  assertEquals("j", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput059() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.select.CombiningEvaluator", "org.jsoup.select.CombiningEvaluator$And", "matches", new String[]{"org.jsoup.nodes.Element", "org.jsoup.nodes.Element"}, new String[]{"<sample:1>", "<sample:9>"}, false, 3, new String[][]{}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "[a=0] [a*=0]", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput060() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.select.CombiningEvaluator", "org.jsoup.select.CombiningEvaluator$And", "matches", new String[]{"org.jsoup.nodes.Element", "org.jsoup.nodes.Element"}, new String[]{"<sample:0>", "<sample:7>"}, false, 5, new String[][]{{"org.jsoup.select.CombiningEvaluator", "matches", "org.jsoup.nodes.Element,org.jsoup.nodes.Element", "<sample:5>", "<sample:5>"}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "[a$=0]", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput061() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.select.QueryParser", "org.jsoup.select.QueryParser", "parse", new String[]{"java.lang.String"}, new String[]{"1.4f+l"}, true, 0, null, 2);
  assertNotNull(actual);
  assertEquals("org.jsoup.select.CombiningEvaluator$And", actual.getClass().getName());
  assertEquals("l :prev1 .4f", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput062() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.select.CombiningEvaluator", "org.jsoup.select.CombiningEvaluator$And", "matches", new String[]{"org.jsoup.nodes.Element", "org.jsoup.nodes.Element"}, new String[]{"<sample:9>", "<sample:9>"}, false, 1, new String[][]{{"org.jsoup.select.CombiningEvaluator", "matches", "org.jsoup.nodes.Element,org.jsoup.nodes.Element", "<sample:2>", "<sample:5>"}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "[a] [^a] [a=0]", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput063() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jsoup.select.QueryParser", "org.jsoup.select.QueryParser", "parse", new String[]{"java.lang.String"}, new String[]{"-1"}, true, 0, null, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("org.jsoup.select.Selector$SelectorParseException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput064() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jsoup.select.QueryParser", "org.jsoup.select.QueryParser", "parse", new String[]{"java.lang.String"}, new String[]{"2020-t01-01:has("}, true, 0, null, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput065() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.select.CombiningEvaluator", "org.jsoup.select.CombiningEvaluator$And", "matches", new String[]{"org.jsoup.nodes.Element", "org.jsoup.nodes.Element"}, new String[]{"<sample:7>", "<sample:3>"}, false, 1, new String[][]{}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "[a] [^a] [a=0]", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput066() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.select.QueryParser", "org.jsoup.select.QueryParser", "parse", new String[]{"java.lang.String"}, new String[]{"21274836b8|"}, true, 0, null, 1);
  assertNotNull(actual);
  assertEquals("org.jsoup.select.Evaluator$Tag", actual.getClass().getName());
  assertEquals("21274836b8:", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput067() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.select.CombiningEvaluator", "org.jsoup.select.CombiningEvaluator$And", "matches", new String[]{"org.jsoup.nodes.Element", "org.jsoup.nodes.Element"}, new String[]{"<sample:7>", "<sample:5>"}, false, 5, new String[][]{{"org.jsoup.select.CombiningEvaluator", "matches", "org.jsoup.nodes.Element,org.jsoup.nodes.Element", "<sample:3>", "<sample:1>"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "[a$=0]", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput068() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jsoup.select.QueryParser", "org.jsoup.select.QueryParser", "parse", new String[]{"java.lang.String"}, new String[]{"1.1234567:lt(i"}, true, 0, null, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput069() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.select.QueryParser", "org.jsoup.select.QueryParser", "parse", new String[]{"java.lang.String"}, new String[]{"1.5e300"}, true, 0, null, 3);
  assertNotNull(actual);
  assertEquals("org.jsoup.select.CombiningEvaluator$And", actual.getClass().getName());
  assertEquals("1 .5e300", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput070() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.select.CombiningEvaluator", "org.jsoup.select.CombiningEvaluator$And", "matches", new String[]{"org.jsoup.nodes.Element", "org.jsoup.nodes.Element"}, new String[]{"<sample:2>", "<sample:5>"}, false, 5, new String[][]{{"org.jsoup.select.CombiningEvaluator", "matches", "org.jsoup.nodes.Element,org.jsoup.nodes.Element", "<sample:4>", "<sample:11>"}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "[a$=0]", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput071() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jsoup.select.QueryParser", "org.jsoup.select.QueryParser", "parse", new String[]{"java.lang.String"}, new String[]{":eq("}, true); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput072() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.select.QueryParser", "org.jsoup.select.QueryParser", "parse", new String[]{"java.lang.String"}, new String[]{"Unknown co"}, true, 0, null, 3);
  assertNotNull(actual);
  assertEquals("org.jsoup.select.CombiningEvaluator$And", actual.getClass().getName());
  assertEquals("co :parentunknown", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput073() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.select.CombiningEvaluator", "org.jsoup.select.CombiningEvaluator$And", "matches", new String[]{"org.jsoup.nodes.Element", "org.jsoup.nodes.Element"}, new String[]{"<null>", "<sample:5>"}, false, 3, new String[][]{}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "[a=0] [a*=0]", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput074() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jsoup.select.QueryParser", "org.jsoup.select.QueryParser", "parse", new String[]{"java.lang.String"}, new String[]{":containsOwn("}, true); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput075() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jsoup.select.QueryParser", "org.jsoup.select.QueryParser", "parse", new String[]{"java.lang.String"}, new String[]{"Hello, Wo(l"}, true); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("org.jsoup.select.Selector$SelectorParseException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput076() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.select.CombiningEvaluator", "org.jsoup.select.CombiningEvaluator$And", "matches", new String[]{"org.jsoup.nodes.Element", "org.jsoup.nodes.Element"}, new String[]{"<null>", "<sample:7>"}, false, 7, new String[][]{{"org.jsoup.select.CombiningEvaluator", "matches", "org.jsoup.nodes.Element,org.jsoup.nodes.Element", "<sample:5>", "<sample:6>"}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "[a!=0] [a^=0] .a", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput077() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jsoup.select.QueryParser", "org.jsoup.select.QueryParser", "parse", new String[]{"java.lang.String"}, new String[]{"ab #"}, true); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput078() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.select.QueryParser", "org.jsoup.select.QueryParser", "parse", new String[]{"java.lang.String"}, new String[]{"1"}, true, 0, null, 3);
  assertNotNull(actual);
  assertEquals("org.jsoup.select.Evaluator$Tag", actual.getClass().getName());
  assertEquals("1", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput079() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.select.CombiningEvaluator", "org.jsoup.select.CombiningEvaluator$And", "matches", new String[]{"org.jsoup.nodes.Element", "org.jsoup.nodes.Element"}, new String[]{"<sample:2>", "<sample:5>"}, false, 7, new String[][]{}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "[a!=0] [a^=0] .a", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput080() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jsoup.select.CombiningEvaluator", "org.jsoup.select.CombiningEvaluator$And", "matches", new String[]{"org.jsoup.nodes.Element", "org.jsoup.nodes.Element"}, new String[]{"<sample:3>", "<sample:11>"}, false, 7, new String[][]{{"org.jsoup.select.CombiningEvaluator", "matches", "org.jsoup.nodes.Element,org.jsoup.nodes.Element", "<sample:6>", "<null>"}}, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput081() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jsoup.select.QueryParser", "org.jsoup.select.QueryParser", "parse", new String[]{"java.lang.String"}, new String[]{",B"}, true, 0, null, 2), new String[][]{{"matches", "org.jsoup.nodes.Element,org.jsoup.nodes.Element", "4"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput082() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.select.QueryParser", "org.jsoup.select.QueryParser", "parse", new String[]{"java.lang.String"}, new String[]{"2147483647|"}, true, 0, null, 1);
  assertNotNull(actual);
  assertEquals("org.jsoup.select.Evaluator$Tag", actual.getClass().getName());
  assertEquals("2147483647:", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput083() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.select.QueryParser", "org.jsoup.select.QueryParser", "parse", new String[]{"java.lang.String"}, new String[]{"Unknown [ombinaItor: 0x123456789"}, true, 0, null, 1);
  assertNotNull(actual);
  assertEquals("org.jsoup.select.CombiningEvaluator$And", actual.getClass().getName());
  assertEquals("[ombinaItor: 0x123456789] :parentunknown", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput084() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.select.QueryParser", "org.jsoup.select.QueryParser", "parse", new String[]{"java.lang.String"}, new String[]{"1.d"}, true, 0, null, 1);
  assertNotNull(actual);
  assertEquals("org.jsoup.select.CombiningEvaluator$And", actual.getClass().getName());
  assertEquals("1 .d", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput085() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jsoup.select.QueryParser", "org.jsoup.select.QueryParser", "parse", new String[]{"java.lang.String"}, new String[]{"#5"}, true), new String[][]{{"matches", "org.jsoup.nodes.Element,org.jsoup.nodes.Element", "6"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput086() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jsoup.select.QueryParser", "org.jsoup.select.QueryParser", "parse", new String[]{"java.lang.String"}, new String[]{":matchesOwn(:eq)("}, true, 0, null, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("org.jsoup.select.Selector$SelectorParseException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput087() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.select.CombiningEvaluator", "org.jsoup.select.CombiningEvaluator$And", "matches", new String[]{"org.jsoup.nodes.Element", "org.jsoup.nodes.Element"}, new String[]{"<sample:5>", "<sample:5>"}, false, 7, new String[][]{{"org.jsoup.select.CombiningEvaluator", "matches", "org.jsoup.nodes.Element,org.jsoup.nodes.Element", "<sample:5>", "<sample:9>"}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "[a!=0] [a^=0] .a", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput088() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jsoup.select.QueryParser", "org.jsoup.select.QueryParser", "parse", new String[]{"java.lang.String"}, new String[]{":not(2020-02.30T25:61:61"}, true, 0, null, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("org.jsoup.select.Selector$SelectorParseException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput089() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jsoup.select.QueryParser", "org.jsoup.select.QueryParser", "parse", new String[]{"java.lang.String"}, new String[]{":not(i"}, true), new String[][]{{"matches", "org.jsoup.nodes.Element,org.jsoup.nodes.Element", "0"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput090() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jsoup.select.QueryParser", "org.jsoup.select.QueryParser", "parse", new String[]{"java.lang.String"}, new String[]{"2020-t01-01:has(0"}, true), new String[][]{{"matches", "org.jsoup.nodes.Element,org.jsoup.nodes.Element", "6"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput091() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.select.QueryParser", "org.jsoup.select.QueryParser", "parse", new String[]{"java.lang.String"}, new String[]{">h"}, true);
  assertNotNull(actual);
  assertEquals("org.jsoup.select.CombiningEvaluator$And", actual.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput092() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.select.CombiningEvaluator", "org.jsoup.select.CombiningEvaluator$And", "matches", new String[]{"org.jsoup.nodes.Element", "org.jsoup.nodes.Element"}, new String[]{"<sample:0>", "<sample:5>"}, false, 3, new String[][]{}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "[a=0] [a*=0]", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput093() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.select.QueryParser", "org.jsoup.select.QueryParser", "parse", new String[]{"java.lang.String"}, new String[]{":containsOwn(%"}, true);
  assertNotNull(actual);
  assertEquals("org.jsoup.select.Evaluator$ContainsOwnText", actual.getClass().getName());
  assertEquals(":containsOwn(%", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput094() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jsoup.select.QueryParser", "org.jsoup.select.QueryParser", "parse", new String[]{"java.lang.String"}, new String[]{"**"}, true, 0, null, 3), new String[][]{{"matches", "org.jsoup.nodes.Element,org.jsoup.nodes.Element", "4"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput095() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.select.QueryParser", "org.jsoup.select.QueryParser", "parse", new String[]{"java.lang.String"}, new String[]{":matches(>"}, true);
  assertNotNull(actual);
  assertEquals("org.jsoup.select.Evaluator$Matches", actual.getClass().getName());
  assertEquals(":matches(>", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput096() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jsoup.select.QueryParser", "org.jsoup.select.QueryParser", "parse", new String[]{"java.lang.String"}, new String[]{":contains(I"}, true), new String[][]{{"matches", "org.jsoup.nodes.Element,org.jsoup.nodes.Element", "4"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput097() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jsoup.select.QueryParser", "org.jsoup.select.QueryParser", "parse", new String[]{"java.lang.String"}, new String[]{":lt(010"}, true), new String[][]{{"matches", "org.jsoup.nodes.Element,org.jsoup.nodes.Element", "3"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput098() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.select.CombiningEvaluator", "org.jsoup.select.CombiningEvaluator$And", "matches", new String[]{"org.jsoup.nodes.Element", "org.jsoup.nodes.Element"}, new String[]{"<sample:5>", "<sample:3>"}, false, 1, new String[][]{}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "[a] [^a] [a=0]", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput099() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jsoup.select.QueryParser", "org.jsoup.select.QueryParser", "parse", new String[]{"java.lang.String"}, new String[]{":eq(0"}, true), new String[][]{{"matches", "org.jsoup.nodes.Element,org.jsoup.nodes.Element", "0"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput100() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jsoup.select.QueryParser", "org.jsoup.select.QueryParser", "parse", new String[]{"java.lang.String"}, new String[]{"ab :gt(0"}, true), new String[][]{{"matches", "org.jsoup.nodes.Element,org.jsoup.nodes.Element", "2"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
}
