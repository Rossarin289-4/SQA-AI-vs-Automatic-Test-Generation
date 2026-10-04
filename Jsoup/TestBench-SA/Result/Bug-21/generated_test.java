package generated.algorithm;

import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;
import static org.junit.Assert.*;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class SimulatedAnnealingGeneratedTest {
 @Test(timeout = 20000)
 public void generatedInput000() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jsoup.select.CombiningEvaluator", "org.jsoup.select.CombiningEvaluator$And", "matches", new String[]{"org.jsoup.nodes.Element", "org.jsoup.nodes.Element"}, new String[]{"<sample:5>", "<sample:1>"}, false); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.ClassCastException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput001() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jsoup.select.QueryParser", "org.jsoup.select.QueryParser", "parse", new String[]{"java.lang.String"}, new String[]{":containsOwn("}, true); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput002() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jsoup.select.QueryParser", "org.jsoup.select.QueryParser", "parse", new String[]{"java.lang.String"}, new String[]{":containsOwn)"}, true); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("org.jsoup.select.Selector$SelectorParseException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput003() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jsoup.select.QueryParser", "org.jsoup.select.QueryParser", "parse", new String[]{"java.lang.String"}, new String[]{":containsOwn)"}, true, 0, null, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("org.jsoup.select.Selector$SelectorParseException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput004() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.select.QueryParser", "org.jsoup.select.QueryParser", "parse", new String[]{"java.lang.String"}, new String[]{"true"}, true, 0, null, 3);
  assertNotNull(actual);
  assertEquals("org.jsoup.select.Evaluator$Tag", actual.getClass().getName());
  assertEquals("true", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput005() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jsoup.select.QueryParser", "org.jsoup.select.QueryParser", "parse", new String[]{"java.lang.String"}, new String[]{"true)"}, true, 0, null, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("org.jsoup.select.Selector$SelectorParseException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput006() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.select.QueryParser", "org.jsoup.select.QueryParser", "parse", new String[]{"java.lang.String"}, new String[]{"trwes"}, true, 0, null, 3);
  assertNotNull(actual);
  assertEquals("org.jsoup.select.Evaluator$Tag", actual.getClass().getName());
  assertEquals("trwes", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput007() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jsoup.select.QueryParser", "org.jsoup.select.QueryParser", "parse", new String[]{"java.lang.String"}, new String[]{"trwes"}, true, 0, null, 3), new String[][]{{"matches", "org.jsoup.nodes.Element,org.jsoup.nodes.Element", "1"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput008() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.select.QueryParser", "org.jsoup.select.QueryParser", "parse", new String[]{"java.lang.String"}, new String[]{"1.12345678"}, true);
  assertNotNull(actual);
  assertEquals("org.jsoup.select.CombiningEvaluator$And", actual.getClass().getName());
  assertEquals("1 .12345678", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput009() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.select.QueryParser", "org.jsoup.select.QueryParser", "parse", new String[]{"java.lang.String"}, new String[]{"1.123456678"}, true);
  assertNotNull(actual);
  assertEquals("org.jsoup.select.CombiningEvaluator$And", actual.getClass().getName());
  assertEquals("1 .123456678", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput010() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.select.QueryParser", "org.jsoup.select.QueryParser", "parse", new String[]{"java.lang.String"}, new String[]{"1.123455678"}, true);
  assertNotNull(actual);
  assertEquals("org.jsoup.select.CombiningEvaluator$And", actual.getClass().getName());
  assertEquals("1 .123455678", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput011() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jsoup.select.QueryParser", "org.jsoup.select.QueryParser", "parse", new String[]{"java.lang.String"}, new String[]{"1.123455678"}, true), new String[][]{{"matches", "org.jsoup.nodes.Element,org.jsoup.nodes.Element", "0"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput012() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jsoup.select.QueryParser", "org.jsoup.select.QueryParser", "parse", new String[]{"java.lang.String"}, new String[]{"1.11345m567C1.5e3\n0"}, true), new String[][]{{"matches", "org.jsoup.nodes.Element,org.jsoup.nodes.Element", "1"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput013() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jsoup.select.QueryParser", "org.jsoup.select.QueryParser", "parse", new String[]{"java.lang.String"}, new String[]{"PT1H["}, true); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput014() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jsoup.select.QueryParser", "org.jsoup.select.QueryParser", "parse", new String[]{"java.lang.String"}, new String[]{"PT1I5[|"}, true), new String[][]{{"matches", "org.jsoup.nodes.Element,org.jsoup.nodes.Element", "3"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput015() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jsoup.select.QueryParser", "org.jsoup.select.QueryParser", "parse", new String[]{"java.lang.String"}, new String[]{":matches("}, true); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput016() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jsoup.select.QueryParser", "org.jsoup.select.QueryParser", "parse", new String[]{"java.lang.String"}, new String[]{"1\n.11345m567C1.5e3\n0"}, true), new String[][]{{"matches", "org.jsoup.nodes.Element,org.jsoup.nodes.Element", "3"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput017() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jsoup.select.QueryParser", "org.jsoup.select.QueryParser", "parse", new String[]{"java.lang.String"}, new String[]{"1.1234567890123456"}, true, 0, null, 2), new String[][]{{"matches", "org.jsoup.nodes.Element,org.jsoup.nodes.Element", "1"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput018() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jsoup.select.QueryParser", "org.jsoup.select.QueryParser", "parse", new String[]{}, new String[]{}, false); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput019() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jsoup.select.QueryParser", "org.jsoup.select.QueryParser", "parse", new String[]{}, new String[]{}, false, 24, new String[][]{{"org.jsoup.select.QueryParser", "parse", ""}}, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput020() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.select.CombiningEvaluator", "org.jsoup.select.CombiningEvaluator$And", "matches", new String[]{"org.jsoup.nodes.Element", "org.jsoup.nodes.Element"}, new String[]{"<sample:4>", "<sample:3>"}, false, 1, new String[][]{{"org.jsoup.select.CombiningEvaluator", "matches", "org.jsoup.nodes.Element,org.jsoup.nodes.Element", "<sample:6>", "<sample:5>"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "[a] [^a] [a=0]", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput021() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jsoup.select.CombiningEvaluator", "org.jsoup.select.CombiningEvaluator$And", "matches", new String[]{"org.jsoup.nodes.Element", "org.jsoup.nodes.Element"}, new String[]{"<sample:4>", "<sample:2>"}, false, 1, new String[][]{{"org.jsoup.select.CombiningEvaluator", "matches", "org.jsoup.nodes.Element,org.jsoup.nodes.Element", "<sample:6>", "<sample:5>"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput022() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.select.CombiningEvaluator", "org.jsoup.select.CombiningEvaluator$And", "matches", new String[]{"org.jsoup.nodes.Element", "org.jsoup.nodes.Element"}, new String[]{"<sample:4>", "<sample:3>"}, false, 15, new String[][]{{"org.jsoup.select.CombiningEvaluator", "matches", "org.jsoup.nodes.Element,org.jsoup.nodes.Element", "<sample:6>", "<sample:2>"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", ":lt(-1) :matches(", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput023() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.select.CombiningEvaluator", "org.jsoup.select.CombiningEvaluator$And", "matches", new String[]{"org.jsoup.nodes.Element", "org.jsoup.nodes.Element"}, new String[]{"<sample:4>", "<sample:3>"}, false, 15, new String[][]{{"org.jsoup.select.CombiningEvaluator", "matches", "org.jsoup.nodes.Element,org.jsoup.nodes.Element", "<sample:6>", "<sample:2>"}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", ":lt(-1) :matches(", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput024() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jsoup.select.QueryParser", "org.jsoup.select.QueryParser", "parse", new String[]{}, new String[]{}, false, 2, new String[][]{{"org.jsoup.select.QueryParser", "parse", ""}}, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput025() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jsoup.select.CombiningEvaluator", "org.jsoup.select.CombiningEvaluator$And", "matches", new String[]{"org.jsoup.nodes.Element", "org.jsoup.nodes.Element"}, new String[]{"<sample:7>", "<sample:7>"}, false, 0, null, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.ClassCastException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput026() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jsoup.select.QueryParser", "org.jsoup.select.QueryParser", "parse", new String[]{"java.lang.String"}, new String[]{":eq("}, true, 0, null, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput027() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.select.QueryParser", "org.jsoup.select.QueryParser", "parse", new String[]{"java.lang.String"}, new String[]{" 2"}, true, 0, null, 3);
  assertNotNull(actual);
  assertEquals("org.jsoup.select.Evaluator$Tag", actual.getClass().getName());
  assertEquals("2", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput028() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.select.CombiningEvaluator", "org.jsoup.select.CombiningEvaluator$And", "matches", new String[]{"org.jsoup.nodes.Element", "org.jsoup.nodes.Element"}, new String[]{"<sample:0>", "<sample:7>"}, false, 5, new String[][]{});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "[a$=0]", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput029() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jsoup.select.CombiningEvaluator", "org.jsoup.select.CombiningEvaluator$And", "matches", new String[]{"org.jsoup.nodes.Element", "org.jsoup.nodes.Element"}, new String[]{"<sample:0>", "<sample:6>"}, false, 4, new String[][]{}, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.ClassCastException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput030() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.select.CombiningEvaluator", "org.jsoup.select.CombiningEvaluator$And", "matches", new String[]{"org.jsoup.nodes.Element", "org.jsoup.nodes.Element"}, new String[]{"<sample:0>", "<sample:3>"}, false, 3, new String[][]{}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "[a=0] [a*=0]", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput031() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.select.CombiningEvaluator", "org.jsoup.select.CombiningEvaluator$And", "matches", new String[]{"org.jsoup.nodes.Element", "org.jsoup.nodes.Element"}, new String[]{"<sample:6>", "<sample:3>"}, false, 3, new String[][]{{"org.jsoup.select.CombiningEvaluator", "matches", "org.jsoup.nodes.Element,org.jsoup.nodes.Element", "<sample:3>", "<sample:1>"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "[a=0] [a*=0]", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput032() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jsoup.select.QueryParser", "org.jsoup.select.QueryParser", "parse", new String[]{"java.lang.String"}, new String[]{"I"}, true, 0, null, 1), new String[][]{{"matches", "org.jsoup.nodes.Element,org.jsoup.nodes.Element", "1"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput033() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jsoup.select.QueryParser", "org.jsoup.select.QueryParser", "parse", new String[]{"java.lang.String"}, new String[]{"I:contains("}, true, 0, null, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput034() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jsoup.select.CombiningEvaluator", "org.jsoup.select.CombiningEvaluator$And", "matches", new String[]{"org.jsoup.nodes.Element", "org.jsoup.nodes.Element"}, new String[]{"<sample:2>", "<sample:3>"}, false, 0, new String[][]{{"org.jsoup.select.CombiningEvaluator", "matches", "org.jsoup.nodes.Element,org.jsoup.nodes.Element", "<sample:3>", "<sample:0>"}, {"org.jsoup.select.CombiningEvaluator", "matches", "org.jsoup.nodes.Element,org.jsoup.nodes.Element", "<sample:2>", "<sample:3>"}}, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.ClassCastException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput035() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.select.QueryParser", "org.jsoup.select.QueryParser", "parse", new String[]{"java.lang.String"}, new String[]{":matches(2020-01-01"}, true);
  assertNotNull(actual);
  assertEquals("org.jsoup.select.Evaluator$Matches", actual.getClass().getName());
  assertEquals(":matches(2020-01-01", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput036() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jsoup.select.QueryParser", "org.jsoup.select.QueryParser", "parse", new String[]{"java.lang.String"}, new String[]{"a,b,c"}, true), new String[][]{{"matches", "org.jsoup.nodes.Element,org.jsoup.nodes.Element", "3"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput037() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jsoup.select.QueryParser", "org.jsoup.select.QueryParser", "parse", new String[]{"java.lang.String"}, new String[]{"#,"}, true); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput038() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jsoup.select.QueryParser", "org.jsoup.select.QueryParser", "parse", new String[]{"java.lang.String"}, new String[]{","}, true); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("org.jsoup.select.Selector$SelectorParseException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput039() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jsoup.select.QueryParser", "org.jsoup.select.QueryParser", "parse", new String[]{"java.lang.String"}, new String[]{"2+2020-01-01"}, true), new String[][]{{"matches", "org.jsoup.nodes.Element,org.jsoup.nodes.Element", "3"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput040() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jsoup.select.QueryParser", "org.jsoup.select.QueryParser", "parse", new String[]{}, new String[]{}, false, 6, new String[][]{{"org.jsoup.select.QueryParser", "parse", ""}, {"org.jsoup.select.QueryParser", "parse", ""}}, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput041() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jsoup.select.QueryParser", "org.jsoup.select.QueryParser", "parse", new String[]{"java.lang.String"}, new String[]{":not("}, true); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput042() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jsoup.select.QueryParser", "org.jsoup.select.QueryParser", "parse", new String[]{"java.lang.String"}, new String[]{":not(("}, true); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("org.jsoup.select.Selector$SelectorParseException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput043() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jsoup.select.CombiningEvaluator", "org.jsoup.select.CombiningEvaluator$And", "matches", new String[]{"org.jsoup.nodes.Element", "org.jsoup.nodes.Element"}, new String[]{"<sample:6>", "<sample:2>"}, false, 7, new String[][]{{"org.jsoup.select.CombiningEvaluator", "matches", "org.jsoup.nodes.Element,org.jsoup.nodes.Element", "<sample:3>", "<sample:5>"}, {"org.jsoup.select.CombiningEvaluator", "matches", "org.jsoup.nodes.Element,org.jsoup.nodes.Element", "<sample:1>", "<sample:6>"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput044() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.select.CombiningEvaluator", "org.jsoup.select.CombiningEvaluator$And", "matches", new String[]{"org.jsoup.nodes.Element", "org.jsoup.nodes.Element"}, new String[]{"<sample:6>", "<sample:7>"}, false, 7, new String[][]{{"org.jsoup.select.CombiningEvaluator", "matches", "org.jsoup.nodes.Element,org.jsoup.nodes.Element", "<sample:3>", "<sample:5>"}, {"org.jsoup.select.CombiningEvaluator", "matches", "org.jsoup.nodes.Element,org.jsoup.nodes.Element", "<sample:1>", "<sample:6>"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "[a!=0] [a^=0] .a", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput045() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.select.QueryParser", "org.jsoup.select.QueryParser", "parse", new String[]{"java.lang.String"}, new String[]{"*"}, true);
  assertNotNull(actual);
  assertEquals("org.jsoup.select.Evaluator$AllElements", actual.getClass().getName());
  assertEquals("*", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput046() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jsoup.select.QueryParser", "org.jsoup.select.QueryParser", "parse", new String[]{"java.lang.String"}, new String[]{"-1.123455612:30]:45"}, true, 0, null, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("org.jsoup.select.Selector$SelectorParseException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput047() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jsoup.select.QueryParser", "org.jsoup.select.QueryParser", "parse", new String[]{"java.lang.String"}, new String[]{":lt("}, true); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput048() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jsoup.select.QueryParser", "org.jsoup.select.QueryParser", "parse", new String[]{"java.lang.String"}, new String[]{"g :not("}, true, 0, null, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput049() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.select.QueryParser", "org.jsoup.select.QueryParser", "parse", new String[]{"java.lang.String"}, new String[]{"123456789012345678901234567890"}, true);
  assertNotNull(actual);
  assertEquals("org.jsoup.select.Evaluator$Tag", actual.getClass().getName());
  assertEquals("123456789012345678901234567890", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput050() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.select.QueryParser", "org.jsoup.select.QueryParser", "parse", new String[]{"java.lang.String"}, new String[]{"1234567890123455678901234567890"}, true);
  assertNotNull(actual);
  assertEquals("org.jsoup.select.Evaluator$Tag", actual.getClass().getName());
  assertEquals("1234567890123455678901234567890", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput051() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.select.QueryParser", "org.jsoup.select.QueryParser", "parse", new String[]{"java.lang.String"}, new String[]{"TITLE"}, true, 0, null, 1);
  assertNotNull(actual);
  assertEquals("org.jsoup.select.Evaluator$Tag", actual.getClass().getName());
  assertEquals("t\u0131tle", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput052() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.select.QueryParser", "org.jsoup.select.QueryParser", "parse", new String[]{"java.lang.String"}, new String[]{"SITLE"}, true, 0, null, 1);
  assertNotNull(actual);
  assertEquals("org.jsoup.select.Evaluator$Tag", actual.getClass().getName());
  assertEquals("s\u0131tle", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput053() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.select.QueryParser", "org.jsoup.select.QueryParser", "parse", new String[]{"java.lang.String"}, new String[]{"RITLE"}, true, 0, null, 1);
  assertNotNull(actual);
  assertEquals("org.jsoup.select.Evaluator$Tag", actual.getClass().getName());
  assertEquals("r\u0131tle", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput054() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.select.QueryParser", "org.jsoup.select.QueryParser", "parse", new String[]{"java.lang.String"}, new String[]{"dITLE"}, true, 0, null, 1);
  assertNotNull(actual);
  assertEquals("org.jsoup.select.Evaluator$Tag", actual.getClass().getName());
  assertEquals("d\u0131tle", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput055() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.select.QueryParser", "org.jsoup.select.QueryParser", "parse", new String[]{"java.lang.String"}, new String[]{"ITLE"}, true, 0, null, 1);
  assertNotNull(actual);
  assertEquals("org.jsoup.select.Evaluator$Tag", actual.getClass().getName());
  assertEquals("\u0131tle", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput056() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.select.QueryParser", "org.jsoup.select.QueryParser", "parse", new String[]{"java.lang.String"}, new String[]{"1"}, true);
  assertNotNull(actual);
  assertEquals("org.jsoup.select.Evaluator$Tag", actual.getClass().getName());
  assertEquals("1", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput057() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.select.QueryParser", "org.jsoup.select.QueryParser", "parse", new String[]{"java.lang.String"}, new String[]{"0"}, true);
  assertNotNull(actual);
  assertEquals("org.jsoup.select.Evaluator$Tag", actual.getClass().getName());
  assertEquals("0", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput058() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.select.QueryParser", "org.jsoup.select.QueryParser", "parse", new String[]{"java.lang.String"}, new String[]{"00"}, true);
  assertNotNull(actual);
  assertEquals("org.jsoup.select.Evaluator$Tag", actual.getClass().getName());
  assertEquals("00", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput059() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.select.QueryParser", "org.jsoup.select.QueryParser", "parse", new String[]{"java.lang.String"}, new String[]{"x-0.0"}, true);
  assertNotNull(actual);
  assertEquals("org.jsoup.select.CombiningEvaluator$And", actual.getClass().getName());
  assertEquals("x-0 .0", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput060() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.select.QueryParser", "org.jsoup.select.QueryParser", "parse", new String[]{"java.lang.String"}, new String[]{"x,0.0"}, true);
  assertNotNull(actual);
  assertEquals("org.jsoup.select.CombiningEvaluator$Or", actual.getClass().getName());
  assertEquals(":or[x, 0 .0]", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput061() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jsoup.select.QueryParser", "org.jsoup.select.QueryParser", "parse", new String[]{"java.lang.String"}, new String[]{"+1"}, true), new String[][]{{"matches", "org.jsoup.nodes.Element,org.jsoup.nodes.Element", "7"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput062() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jsoup.select.QueryParser", "org.jsoup.select.QueryParser", "parse", new String[]{"java.lang.String"}, new String[]{"[1,2]:gt("}, true); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput063() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.select.QueryParser", "org.jsoup.select.QueryParser", "parse", new String[]{"java.lang.String"}, new String[]{"7TI5Y|"}, true);
  assertNotNull(actual);
  assertEquals("org.jsoup.select.Evaluator$Tag", actual.getClass().getName());
  assertEquals("7ti5y:", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput064() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.select.QueryParser", "org.jsoup.select.QueryParser", "parse", new String[]{"java.lang.String"}, new String[]{"T9Hnell- World"}, true, 0, null, 1);
  assertNotNull(actual);
  assertEquals("org.jsoup.select.CombiningEvaluator$And", actual.getClass().getName());
  assertEquals("world :parentt9hnell-", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput065() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.select.QueryParser", "org.jsoup.select.QueryParser", "parse", new String[]{"java.lang.String"}, new String[]{"T9Hnell- Wormd"}, true, 0, null, 1);
  assertNotNull(actual);
  assertEquals("org.jsoup.select.CombiningEvaluator$And", actual.getClass().getName());
  assertEquals("wormd :parentt9hnell-", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput066() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jsoup.select.CombiningEvaluator", "org.jsoup.select.CombiningEvaluator$And", "matches", new String[]{"org.jsoup.nodes.Element", "org.jsoup.nodes.Element"}, new String[]{"<sample:7>", "<sample:2>"}, false, 1, new String[][]{{"org.jsoup.select.CombiningEvaluator", "matches", "org.jsoup.nodes.Element,org.jsoup.nodes.Element", "<sample:1>", "<sample:1>"}}, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput067() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.select.CombiningEvaluator", "org.jsoup.select.CombiningEvaluator$And", "matches", new String[]{"org.jsoup.nodes.Element", "org.jsoup.nodes.Element"}, new String[]{"<sample:1>", "<sample:5>"}, false, 9, new String[][]{}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", ".a :containsOwn(a", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput068() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.select.CombiningEvaluator", "org.jsoup.select.CombiningEvaluator$And", "matches", new String[]{"org.jsoup.nodes.Element", "org.jsoup.nodes.Element"}, new String[]{"<sample:0>", "<sample:5>"}, false, 5, new String[][]{{"org.jsoup.select.CombiningEvaluator", "matches", "org.jsoup.nodes.Element,org.jsoup.nodes.Element", "<null>", "<sample:4>"}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "[a$=0]", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput069() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.select.QueryParser", "org.jsoup.select.QueryParser", "parse", new String[]{"java.lang.String"}, new String[]{"A"}, true, 0, null, 3);
  assertNotNull(actual);
  assertEquals("org.jsoup.select.Evaluator$Tag", actual.getClass().getName());
  assertEquals("a", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput070() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.select.CombiningEvaluator", "org.jsoup.select.CombiningEvaluator$And", "matches", new String[]{"org.jsoup.nodes.Element", "org.jsoup.nodes.Element"}, new String[]{"<null>", "<sample:6>"}, false, 13, new String[][]{{"org.jsoup.select.CombiningEvaluator", "matches", "org.jsoup.nodes.Element,org.jsoup.nodes.Element", "<sample:0>", "<sample:2>"}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", ":eq(-1) :gt(-1) :lt(-1)", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput071() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.select.QueryParser", "org.jsoup.select.QueryParser", "parse", new String[]{"java.lang.String"}, new String[]{"aaaaaaaaaaaaaaaaaaaaaaaaaaaaaa"}, true, 0, null, 2);
  assertNotNull(actual);
  assertEquals("org.jsoup.select.Evaluator$Tag", actual.getClass().getName());
  assertEquals("aaaaaaaaaaaaaaaaaaaaaaaaaaaaaa", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput072() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jsoup.select.QueryParser", "org.jsoup.select.QueryParser", "parse", new String[]{"java.lang.String"}, new String[]{"#/"}, true, 0, null, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput073() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jsoup.select.QueryParser", "org.jsoup.select.QueryParser", "parse", new String[]{"java.lang.String"}, new String[]{",0"}, true, 0, null, 2), new String[][]{{"matches", "org.jsoup.nodes.Element,org.jsoup.nodes.Element", "0"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput074() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.select.QueryParser", "org.jsoup.select.QueryParser", "parse", new String[]{"java.lang.String"}, new String[]{".5"}, true, 0, null, 3);
  assertNotNull(actual);
  assertEquals("org.jsoup.select.Evaluator$Class", actual.getClass().getName());
  assertEquals(".5", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput075() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.select.QueryParser", "org.jsoup.select.QueryParser", "parse", new String[]{"java.lang.String"}, new String[]{"1e00"}, true, 0, null, 3);
  assertNotNull(actual);
  assertEquals("org.jsoup.select.Evaluator$Tag", actual.getClass().getName());
  assertEquals("1e00", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput076() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.select.QueryParser", "org.jsoup.select.QueryParser", "parse", new String[]{"java.lang.String"}, new String[]{"C1e00"}, true, 0, null, 3);
  assertNotNull(actual);
  assertEquals("org.jsoup.select.Evaluator$Tag", actual.getClass().getName());
  assertEquals("c1e00", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput077() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jsoup.select.QueryParser", "org.jsoup.select.QueryParser", "parse", new String[]{"java.lang.String"}, new String[]{"**"}, true), new String[][]{{"matches", "org.jsoup.nodes.Element,org.jsoup.nodes.Element", "6"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput078() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jsoup.select.QueryParser", "org.jsoup.select.QueryParser", "parse", new String[]{"java.lang.String"}, new String[]{"*:matchesOwn("}, true, 0, null, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput079() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jsoup.select.QueryParser", "org.jsoup.select.QueryParser", "parse", new String[]{"java.lang.String"}, new String[]{"aaaa#haaaOaaaFaaaaaaaaaaaaaaa 1O6.1234567990123556h-015"}, true), new String[][]{{"matches", "org.jsoup.nodes.Element,org.jsoup.nodes.Element", "5"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput080() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jsoup.select.QueryParser", "org.jsoup.select.QueryParser", "parse", new String[]{"java.lang.String"}, new String[]{"1.5d:has("}, true, 0, null, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput081() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.select.CombiningEvaluator", "org.jsoup.select.CombiningEvaluator$And", "matches", new String[]{"org.jsoup.nodes.Element", "org.jsoup.nodes.Element"}, new String[]{"<null>", "<sample:3>"}, false, 1, new String[][]{{"org.jsoup.select.CombiningEvaluator", "matches", "org.jsoup.nodes.Element,org.jsoup.nodes.Element", "<sample:7>", "<sample:2>"}, {"org.jsoup.select.CombiningEvaluator", "matches", "org.jsoup.nodes.Element,org.jsoup.nodes.Element", "<sample:3>", "<null>"}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "[a] [^a] [a=0]", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput082() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.select.QueryParser", "org.jsoup.select.QueryParser", "parse", new String[]{"java.lang.String"}, new String[]{"1.11345m567C1.5e3\n0"}, true, 0, null, 2);
  assertNotNull(actual);
  assertEquals("org.jsoup.select.CombiningEvaluator$And", actual.getClass().getName());
  assertEquals("0 :parent1 .11345m567c1 .5e3", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput083() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.select.QueryParser", "org.jsoup.select.QueryParser", "parse", new String[]{"java.lang.String"}, new String[]{"Hello, World"}, true, 0, null, 2);
  assertNotNull(actual);
  assertEquals("org.jsoup.select.CombiningEvaluator$Or", actual.getClass().getName());
  assertEquals(":or[hello, world]", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput084() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.select.QueryParser", "org.jsoup.select.QueryParser", "parse", new String[]{"java.lang.String"}, new String[]{"Helo, World"}, true, 0, null, 2);
  assertNotNull(actual);
  assertEquals("org.jsoup.select.CombiningEvaluator$Or", actual.getClass().getName());
  assertEquals(":or[helo, world]", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput085() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.select.QueryParser", "org.jsoup.select.QueryParser", "parse", new String[]{"java.lang.String"}, new String[]{"Hello, Wo*ld"}, true, 0, null, 2);
  assertNotNull(actual);
  assertEquals("org.jsoup.select.CombiningEvaluator$Or", actual.getClass().getName());
  assertEquals(":or[hello, wo * ld]", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput086() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jsoup.select.CombiningEvaluator", "org.jsoup.select.CombiningEvaluator$And", "matches", new String[]{"org.jsoup.nodes.Element", "org.jsoup.nodes.Element"}, new String[]{"<sample:5>", "<null>"}, false, 5, new String[][]{{"org.jsoup.select.CombiningEvaluator", "matches", "org.jsoup.nodes.Element,org.jsoup.nodes.Element", "<sample:5>", "<sample:6>"}, {"org.jsoup.select.CombiningEvaluator", "matches", "org.jsoup.nodes.Element,org.jsoup.nodes.Element", "<sample:2>", "<sample:5>"}, {"org.jsoup.select.CombiningEvaluator", "matches", "org.jsoup.nodes.Element,org.jsoup.nodes.Element", "<sample:3>", "<sample:1>"}}, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput087() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.select.CombiningEvaluator", "org.jsoup.select.CombiningEvaluator$And", "matches", new String[]{"org.jsoup.nodes.Element", "org.jsoup.nodes.Element"}, new String[]{"<sample:7>", "<sample:5>"}, false, 11, new String[][]{{"org.jsoup.select.CombiningEvaluator", "matches", "org.jsoup.nodes.Element,org.jsoup.nodes.Element", "<sample:0>", "<sample:1>"}, {"org.jsoup.select.CombiningEvaluator", "matches", "org.jsoup.nodes.Element,org.jsoup.nodes.Element", "<sample:2>", "<sample:1>"}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", ":contains(a", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput088() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.select.CombiningEvaluator", "org.jsoup.select.CombiningEvaluator$And", "matches", new String[]{"org.jsoup.nodes.Element", "org.jsoup.nodes.Element"}, new String[]{"<sample:0>", "<sample:5>"}, false, 9, new String[][]{{"org.jsoup.select.CombiningEvaluator", "matches", "org.jsoup.nodes.Element,org.jsoup.nodes.Element", "<sample:6>", "<sample:6>"}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", ".a :containsOwn(a", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput089() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jsoup.select.CombiningEvaluator", "org.jsoup.select.CombiningEvaluator$And", "matches", new String[]{"org.jsoup.nodes.Element", "org.jsoup.nodes.Element"}, new String[]{"<sample:0>", "<sample:4>"}, false, 9, new String[][]{{"org.jsoup.select.CombiningEvaluator", "matches", "org.jsoup.nodes.Element,org.jsoup.nodes.Element", "<sample:6>", "<sample:6>"}}, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput090() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jsoup.select.QueryParser", "org.jsoup.select.QueryParser", "parse", new String[]{"java.lang.String"}, new String[]{"aw>b,a"}, true, 0, null, 1), new String[][]{{"matches", "org.jsoup.nodes.Element,org.jsoup.nodes.Element", "4"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput091() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jsoup.select.QueryParser", "org.jsoup.select.QueryParser", "parse", new String[]{"java.lang.String"}, new String[]{"9.L,a-+w[O)b55."}, true), new String[][]{{"matches", "org.jsoup.nodes.Element,org.jsoup.nodes.Element", "0"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput092() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.select.CombiningEvaluator", "org.jsoup.select.CombiningEvaluator$And", "matches", new String[]{"org.jsoup.nodes.Element", "org.jsoup.nodes.Element"}, new String[]{"<sample:2>", "<sample:7>"}, false, 1, new String[][]{{"org.jsoup.select.CombiningEvaluator", "matches", "org.jsoup.nodes.Element,org.jsoup.nodes.Element", "<sample:5>", "<sample:2>"}, {"org.jsoup.select.CombiningEvaluator", "matches", "org.jsoup.nodes.Element,org.jsoup.nodes.Element", "<sample:2>", "<sample:4>"}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "[a] [^a] [a=0]", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput093() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jsoup.select.QueryParser", "org.jsoup.select.QueryParser", "parse", new String[]{"java.lang.String"}, new String[]{"1.124478:matchesOwn(0x1F"}, true, 0, null, 3), new String[][]{{"matches", "org.jsoup.nodes.Element,org.jsoup.nodes.Element", "2"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput094() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jsoup.select.QueryParser", "org.jsoup.select.QueryParser", "parse", new String[]{"java.lang.String"}, new String[]{"[1x66]5mb5PssT_,*1Lw-1:not(010"}, true, 0, null, 3), new String[][]{{"add", "org.jsoup.select.Evaluator", "4"}});
  assertNotNull(actual);
  assertEquals("org.jsoup.select.CombiningEvaluator$Or", actual.getClass().getName());
  assertEquals(":or[[1x66] 5mb5psst_, * 1lw-1 :not010, [^a]]", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput095() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.select.CombiningEvaluator", "org.jsoup.select.CombiningEvaluator$And", "matches", new String[]{"org.jsoup.nodes.Element", "org.jsoup.nodes.Element"}, new String[]{"<sample:5>", "<sample:3>"}, false, 1, new String[][]{{"org.jsoup.select.CombiningEvaluator", "matches", "org.jsoup.nodes.Element,org.jsoup.nodes.Element", "<sample:6>", "<sample:1>"}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "[a] [^a] [a=0]", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput096() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.select.CombiningEvaluator", "org.jsoup.select.CombiningEvaluator$And", "matches", new String[]{"org.jsoup.nodes.Element", "org.jsoup.nodes.Element"}, new String[]{"<sample:0>", "<sample:5>"}, false, 13, new String[][]{{"org.jsoup.select.CombiningEvaluator", "matches", "org.jsoup.nodes.Element,org.jsoup.nodes.Element", "<sample:0>", "<sample:4>"}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", ":eq(-1) :gt(-1) :lt(-1)", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput097() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.select.CombiningEvaluator", "org.jsoup.select.CombiningEvaluator$And", "matches", new String[]{"org.jsoup.nodes.Element", "org.jsoup.nodes.Element"}, new String[]{"<sample:7>", "<sample:6>"}, false, 13, new String[][]{}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", ":eq(-1) :gt(-1) :lt(-1)", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput098() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.select.QueryParser", "org.jsoup.select.QueryParser", "parse", new String[]{"java.lang.String"}, new String[]{":lt(3"}, true);
  assertNotNull(actual);
  assertEquals("org.jsoup.select.Evaluator$IndexLessThan", actual.getClass().getName());
  assertEquals(":lt(3)", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput099() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.select.CombiningEvaluator", "org.jsoup.select.CombiningEvaluator$And", "matches", new String[]{"org.jsoup.nodes.Element", "org.jsoup.nodes.Element"}, new String[]{"<sample:2>", "<sample:3>"}, false, 3, new String[][]{{"org.jsoup.select.CombiningEvaluator", "matches", "org.jsoup.nodes.Element,org.jsoup.nodes.Element", "<sample:6>", "<sample:3>"}, {"org.jsoup.select.CombiningEvaluator", "matches", "org.jsoup.nodes.Element,org.jsoup.nodes.Element", "<sample:0>", "<sample:4>"}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "[a=0] [a*=0]", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput100() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.select.CombiningEvaluator", "org.jsoup.select.CombiningEvaluator$And", "matches", new String[]{"org.jsoup.nodes.Element", "org.jsoup.nodes.Element"}, new String[]{"<sample:0>", "<sample:3>"}, false, 11, new String[][]{{"org.jsoup.select.CombiningEvaluator", "matches", "org.jsoup.nodes.Element,org.jsoup.nodes.Element", "<sample:0>", "<sample:8>"}, {"org.jsoup.select.CombiningEvaluator", "matches", "org.jsoup.nodes.Element,org.jsoup.nodes.Element", "<sample:5>", "<sample:7>"}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", ":contains(a", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput101() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.select.CombiningEvaluator", "org.jsoup.select.CombiningEvaluator$And", "matches", new String[]{"org.jsoup.nodes.Element", "org.jsoup.nodes.Element"}, new String[]{"<sample:5>", "<sample:2>"}, false, 15, new String[][]{{"org.jsoup.select.CombiningEvaluator", "matches", "org.jsoup.nodes.Element,org.jsoup.nodes.Element", "<sample:5>", "<sample:4>"}, {"org.jsoup.select.CombiningEvaluator", "matches", "org.jsoup.nodes.Element,org.jsoup.nodes.Element", "<sample:4>", "<sample:6>"}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", ":lt(-1) :matches(", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput102() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jsoup.select.QueryParser", "org.jsoup.select.QueryParser", "parse", new String[]{"java.lang.String"}, new String[]{":contains(("}, true), new String[][]{{"matches", "org.jsoup.nodes.Element,org.jsoup.nodes.Element", "4"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput103() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jsoup.select.QueryParser", "org.jsoup.select.QueryParser", "parse", new String[]{"java.lang.String"}, new String[]{":containsOwn(:not("}, true), new String[][]{{"matches", "org.jsoup.nodes.Element,org.jsoup.nodes.Element", "2"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput104() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jsoup.select.QueryParser", "org.jsoup.select.QueryParser", "parse", new String[]{"java.lang.String"}, new String[]{"[(<7|7}3]Xf5lb-L2swttsT_x+*2Lww.2:not(0B0120C.101346DdO,ull:has(0x1F"}, true), new String[][]{{"matches", "org.jsoup.nodes.Element,org.jsoup.nodes.Element", "1"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput105() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.select.QueryParser", "org.jsoup.select.QueryParser", "parse", new String[]{"java.lang.String"}, new String[]{":eq(1"}, true);
  assertNotNull(actual);
  assertEquals("org.jsoup.select.Evaluator$IndexEquals", actual.getClass().getName());
  assertEquals(":eq(1)", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput106() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.select.QueryParser", "org.jsoup.select.QueryParser", "parse", new String[]{"java.lang.String"}, new String[]{"[0,2]:gt(010"}, true);
  assertNotNull(actual);
  assertEquals("org.jsoup.select.CombiningEvaluator$And", actual.getClass().getName());
  assertEquals("[0,2] :gt(10)", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput107() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jsoup.select.QueryParser", "org.jsoup.select.QueryParser", "parse", new String[]{"java.lang.String"}, new String[]{"~0x1F"}, true, 0, null, 2), new String[][]{{"matches", "org.jsoup.nodes.Element,org.jsoup.nodes.Element", "4"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput108() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jsoup.select.QueryParser", "org.jsoup.select.QueryParser", "parse", new String[]{"java.lang.String"}, new String[]{"http[:0/example.com/a?b=c"}, true), new String[][]{{"matches", "org.jsoup.nodes.Element,org.jsoup.nodes.Element", "7"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput109() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.select.QueryParser", "org.jsoup.select.QueryParser", "parse", new String[]{"java.lang.String"}, new String[]{"[^"}, true);
  assertNotNull(actual);
  assertEquals("org.jsoup.select.Evaluator$AttributeStarting", actual.getClass().getName());
  assertEquals("[^]", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput110() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.select.CombiningEvaluator", "org.jsoup.select.CombiningEvaluator$And", "matches", new String[]{"org.jsoup.nodes.Element", "org.jsoup.nodes.Element"}, new String[]{"<sample:3>", "<sample:5>"}, false, 17, new String[][]{{"org.jsoup.select.CombiningEvaluator", "matches", "org.jsoup.nodes.Element,org.jsoup.nodes.Element", "<sample:3>", "<sample:4>"}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
  assertEquals("receiver state after the call", ":matchesOwn(", SearchInputFactory_scaffolding.receiverState());
 }
}
