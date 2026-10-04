package generated.algorithm;

import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;
import static org.junit.Assert.*;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class SimulatedAnnealingGeneratedTest {
 @Test(timeout = 20000)
 public void generatedInput000() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.safety.Cleaner", "org.jsoup.safety.Cleaner", "clean", new String[]{"org.jsoup.nodes.Document"}, new String[]{"<sample:6>"}, false, 0, new String[][]{{"org.jsoup.safety.Cleaner", "isValid", "org.jsoup.nodes.Document", "<sample:1>"}, {"org.jsoup.safety.Cleaner", "clean", "org.jsoup.nodes.Document", "<sample:1>"}});
  assertNotNull(actual);
  assertEquals("org.jsoup.nodes.Document", actual.getClass().getName());
  assertEquals("<html>\n <head></head>\n <body></body>\n</html> {hasText=false, isBlock=false}", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput001() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.safety.Cleaner", "org.jsoup.safety.Cleaner", "clean", new String[]{"org.jsoup.nodes.Document"}, new String[]{"<sample:10>"}, false, 5, new String[][]{}, 3);
  assertNotNull(actual);
  assertEquals("org.jsoup.nodes.Document", actual.getClass().getName());
  assertEquals("<html>\n <head></head>\n <body></body>\n</html> {hasText=false, isBlock=false}", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput002() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jsoup.safety.Cleaner", "org.jsoup.safety.Cleaner", "clean", new String[]{"org.jsoup.nodes.Document"}, new String[]{"<sample:10>"}, false, 5, new String[][]{{"org.jsoup.safety.Cleaner", "clean", "org.jsoup.nodes.Document", "<sample:1>"}}, 3), new String[][]{{"getElementsByIndexEquals", "int", "5"}});
  assertNotNull(actual);
  assertEquals("org.jsoup.select.Elements", actual.getClass().getName());
  assertEquals("[]", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput003() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jsoup.safety.Cleaner", "org.jsoup.safety.Cleaner", "clean", new String[]{"org.jsoup.nodes.Document"}, new String[]{"<sample:8>"}, false, 5, new String[][]{{"org.jsoup.safety.Cleaner", "clean", "org.jsoup.nodes.Document", "<sample:4>"}, {"org.jsoup.safety.Cleaner", "clean", "org.jsoup.nodes.Document", "<sample:5>"}}, 3), new String[][]{{"getElementsByIndexEquals", "int", "5"}});
  assertNotNull(actual);
  assertEquals("org.jsoup.select.Elements", actual.getClass().getName());
  assertEquals("[]", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput004() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jsoup.safety.Cleaner", "org.jsoup.safety.Cleaner", "clean", new String[]{"org.jsoup.nodes.Document"}, new String[]{"<sample:8>"}, false), new String[][]{{"children", "", "5"}});
  assertNotNull(actual);
  assertEquals("org.jsoup.select.Elements", actual.getClass().getName());
  assertEquals("[<html>\n <head></head>\n <body></body>\n</html>]", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput005() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jsoup.safety.Cleaner", "org.jsoup.safety.Cleaner", "clean", new String[]{"org.jsoup.nodes.Document"}, new String[]{"<sample:5>"}, false, 3, new String[][]{{"org.jsoup.safety.Cleaner", "clean", "org.jsoup.nodes.Document", "<sample:0>"}}), new String[][]{{"after", "java.lang.String", "5"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput006() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.safety.Cleaner", "org.jsoup.safety.Cleaner", "clean", new String[]{"org.jsoup.nodes.Document"}, new String[]{"<sample:1>"}, false, 0, null, 1);
  assertNotNull(actual);
  assertEquals("org.jsoup.nodes.Document", actual.getClass().getName());
  assertEquals("<html>\n <head></head>\n <body></body>\n</html> {hasText=false, isBlock=false}", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput007() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jsoup.safety.Cleaner", "org.jsoup.safety.Cleaner", "clean", new String[]{"org.jsoup.nodes.Document"}, new String[]{"<sample:3>"}, false, 0, new String[][]{{"org.jsoup.safety.Cleaner", "clean", "org.jsoup.nodes.Document", "<sample:8>"}, {"org.jsoup.safety.Cleaner", "clean", "org.jsoup.nodes.Document", "<sample:3>"}}, 3), new String[][]{{"classNames", "java.util.Set", "4"}, {"hasClass", "java.lang.String", "1"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput008() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jsoup.safety.Cleaner", "org.jsoup.safety.Cleaner", "clean", new String[]{"org.jsoup.nodes.Document"}, new String[]{"<sample:2>"}, false, 1, new String[][]{{"org.jsoup.safety.Cleaner", "clean", "org.jsoup.nodes.Document", "<sample:1>"}, {"org.jsoup.safety.Cleaner", "clean", "org.jsoup.nodes.Document", "<sample:9>"}}), new String[][]{{"classNames", "java.util.Set", "4"}, {"hasClass", "java.lang.String", "1"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput009() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jsoup.safety.Cleaner", "org.jsoup.safety.Cleaner", "isValid", new String[]{"org.jsoup.nodes.Document"}, new String[]{"<sample:6>"}, false); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput010() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jsoup.safety.Cleaner", "org.jsoup.safety.Cleaner", "isValid", new String[]{"org.jsoup.nodes.Document"}, new String[]{"<null>"}, false); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput011() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.safety.Cleaner", "org.jsoup.safety.Cleaner", "isValid", new String[]{"org.jsoup.nodes.Document"}, new String[]{"<sample:4>"}, false, 15, new String[][]{{"org.jsoup.safety.Cleaner", "isValid", "org.jsoup.nodes.Document", "<null>"}, {"org.jsoup.safety.Cleaner", "clean", "org.jsoup.nodes.Document", "<null>"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput012() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jsoup.safety.Cleaner", "org.jsoup.safety.Cleaner", "isValid", new String[]{"org.jsoup.nodes.Document"}, new String[]{"<sample:2>"}, false, 0, new String[][]{{"org.jsoup.safety.Cleaner", "clean", "org.jsoup.nodes.Document", "<sample:0>"}}, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput013() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jsoup.safety.Cleaner", "org.jsoup.safety.Cleaner", "isValid", new String[]{"org.jsoup.nodes.Document"}, new String[]{"<sample:8>"}, false, 0, new String[][]{{"org.jsoup.safety.Cleaner", "isValid", "org.jsoup.nodes.Document", "<sample:1>"}, {"org.jsoup.safety.Cleaner", "isValid", "org.jsoup.nodes.Document", "<sample:3>"}}, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput014() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jsoup.safety.Cleaner", "org.jsoup.safety.Cleaner", "isValid", new String[]{"org.jsoup.nodes.Document"}, new String[]{"<null>"}, false, 0, new String[][]{{"org.jsoup.safety.Cleaner", "isValid", "org.jsoup.nodes.Document", "<sample:1>"}, {"org.jsoup.safety.Cleaner", "isValid", "org.jsoup.nodes.Document", "<sample:5>"}}, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput015() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jsoup.safety.Cleaner", "org.jsoup.safety.Cleaner", "isValid", new String[]{"org.jsoup.nodes.Document"}, new String[]{"<null>"}, false, 4, new String[][]{}, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput016() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.safety.Cleaner", "org.jsoup.safety.Cleaner", "isValid", new String[]{"org.jsoup.nodes.Document"}, new String[]{"<sample:4>"}, false, 0, null, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput017() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jsoup.safety.Cleaner", "org.jsoup.safety.Cleaner", "isValid", new String[]{"org.jsoup.nodes.Document"}, new String[]{"<sample:0>"}, false, 1, new String[][]{}, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput018() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jsoup.safety.Cleaner", "org.jsoup.safety.Cleaner", "clean", new String[]{"org.jsoup.nodes.Document"}, new String[]{"<sample:8>"}, false), new String[][]{{"hasAttr", "java.lang.String", "4"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput019() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jsoup.safety.Cleaner", "org.jsoup.safety.Cleaner", "clean", new String[]{"org.jsoup.nodes.Document"}, new String[]{"<null>"}, false, 0, null, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput020() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jsoup.safety.Cleaner", "org.jsoup.safety.Cleaner", "clean", new String[]{"org.jsoup.nodes.Document"}, new String[]{"<sample:8>"}, false, 0, null, 1), new String[][]{{"nextSibling", "", "0"}});
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput021() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jsoup.safety.Cleaner", "org.jsoup.safety.Cleaner", "clean", new String[]{"org.jsoup.nodes.Document"}, new String[]{"<sample:2>"}, false, 0, new String[][]{{"org.jsoup.safety.Cleaner", "isValid", "org.jsoup.nodes.Document", "<null>"}, {"org.jsoup.safety.Cleaner", "clean", "org.jsoup.nodes.Document", "<sample:6>"}}), new String[][]{{"attr", "java.lang.String", "5"}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput022() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jsoup.safety.Cleaner", "org.jsoup.safety.Cleaner", "clean", new String[]{"org.jsoup.nodes.Document"}, new String[]{"<sample:7>"}, false, 0, new String[][]{{"org.jsoup.safety.Cleaner", "clean", "org.jsoup.nodes.Document", "<sample:8>"}, {"org.jsoup.safety.Cleaner", "clean", "org.jsoup.nodes.Document", "<sample:7>"}}), new String[][]{{"childNodes", "", "5"}, {"indexOf", "java.lang.Object", "4"}, {"indexOf", "java.lang.Object", "4"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("-1", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput023() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jsoup.safety.Cleaner", "org.jsoup.safety.Cleaner", "isValid", new String[]{"org.jsoup.nodes.Document"}, new String[]{"<null>"}, false, 4, new String[][]{{"org.jsoup.safety.Cleaner", "clean", "org.jsoup.nodes.Document", "<sample:4>"}, {"org.jsoup.safety.Cleaner", "clean", "org.jsoup.nodes.Document", "<sample:3>"}, {"org.jsoup.safety.Cleaner", "clean", "org.jsoup.nodes.Document", "<sample:5>"}}, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput024() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.safety.Cleaner", "org.jsoup.safety.Cleaner", "isValid", new String[]{"org.jsoup.nodes.Document"}, new String[]{"<sample:4>"}, false, 4, new String[][]{{"org.jsoup.safety.Cleaner", "clean", "org.jsoup.nodes.Document", "<sample:4>"}, {"org.jsoup.safety.Cleaner", "clean", "org.jsoup.nodes.Document", "<sample:3>"}, {"org.jsoup.safety.Cleaner", "clean", "org.jsoup.nodes.Document", "<sample:5>"}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput025() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jsoup.safety.Cleaner", "org.jsoup.safety.Cleaner", "clean", new String[]{"org.jsoup.nodes.Document"}, new String[]{"<sample:0>"}, false), new String[][]{{"getElementsByIndexLessThan", "int", "2"}});
  assertNotNull(actual);
  assertEquals("org.jsoup.select.Elements", actual.getClass().getName());
  assertEquals("[]", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput026() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jsoup.safety.Cleaner", "org.jsoup.safety.Cleaner", "clean", new String[]{"org.jsoup.nodes.Document"}, new String[]{"<sample:4>"}, false, 3, new String[][]{{"org.jsoup.safety.Cleaner", "isValid", "org.jsoup.nodes.Document", "<sample:3>"}, {"org.jsoup.safety.Cleaner", "isValid", "org.jsoup.nodes.Document", "<sample:8>"}}, 1), new String[][]{{"className", "", "6"}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput027() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jsoup.safety.Cleaner", "org.jsoup.safety.Cleaner", "clean", new String[]{"org.jsoup.nodes.Document"}, new String[]{"<sample:4>"}, false, 3, new String[][]{{"org.jsoup.safety.Cleaner", "isValid", "org.jsoup.nodes.Document", "<sample:3>"}, {"org.jsoup.safety.Cleaner", "isValid", "org.jsoup.nodes.Document", "<sample:8>"}}, 1), new String[][]{{"nodeName", "", "6"}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("#document", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput028() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jsoup.safety.Cleaner", "org.jsoup.safety.Cleaner", "clean", new String[]{"org.jsoup.nodes.Document"}, new String[]{"<sample:2>"}, false, 0, new String[][]{{"org.jsoup.safety.Cleaner", "clean", "org.jsoup.nodes.Document", "<sample:4>"}}), new String[][]{{"html", "", "5"}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("<html>\n <head></head>\n <body></body>\n</html>", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput029() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jsoup.safety.Cleaner", "org.jsoup.safety.Cleaner", "clean", new String[]{"org.jsoup.nodes.Document"}, new String[]{"<sample:1>"}, false, 0, new String[][]{{"org.jsoup.safety.Cleaner", "clean", "org.jsoup.nodes.Document", "<null>"}}, 1), new String[][]{{"html", "java.lang.String", "3"}});
  assertNotNull(actual);
  assertEquals("org.jsoup.nodes.Document", actual.getClass().getName());
  assertEquals("sample {hasText=true, isBlock=false}", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput030() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jsoup.safety.Cleaner", "org.jsoup.safety.Cleaner", "clean", new String[]{"org.jsoup.nodes.Document"}, new String[]{"<sample:12>"}, false, 0, new String[][]{{"org.jsoup.safety.Cleaner", "clean", "org.jsoup.nodes.Document", "<sample:8>"}}, 1), new String[][]{{"elementSiblingIndex", "", "3"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput031() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jsoup.safety.Cleaner", "org.jsoup.safety.Cleaner", "clean", new String[]{"org.jsoup.nodes.Document"}, new String[]{"<sample:4>"}, false, 0, new String[][]{{"org.jsoup.safety.Cleaner", "isValid", "org.jsoup.nodes.Document", "<sample:0>"}}, 3), new String[][]{{"nextSibling", "", "7"}});
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput032() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.safety.Cleaner", "org.jsoup.safety.Cleaner", "isValid", new String[]{"org.jsoup.nodes.Document"}, new String[]{"<sample:4>"}, false, 4, new String[][]{}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput033() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jsoup.safety.Cleaner", "org.jsoup.safety.Cleaner", "clean", new String[]{"org.jsoup.nodes.Document"}, new String[]{"<sample:3>"}, false, 4, new String[][]{}, 3), new String[][]{{"lastElementSibling", "", "6"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput034() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jsoup.safety.Cleaner", "org.jsoup.safety.Cleaner", "clean", new String[]{"org.jsoup.nodes.Document"}, new String[]{"<sample:9>"}, false, 1, new String[][]{{"org.jsoup.safety.Cleaner", "clean", "org.jsoup.nodes.Document", "<sample:4>"}}, 2), new String[][]{{"nextSibling", "", "2"}, {"getElementsByAttributeValueStarting", "java.lang.String,java.lang.String", "4"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput035() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jsoup.safety.Cleaner", "org.jsoup.safety.Cleaner", "clean", new String[]{"org.jsoup.nodes.Document"}, new String[]{"<sample:7>"}, false, 0, new String[][]{{"org.jsoup.safety.Cleaner", "clean", "org.jsoup.nodes.Document", "<sample:1>"}, {"org.jsoup.safety.Cleaner", "isValid", "org.jsoup.nodes.Document", "<null>"}}, 1), new String[][]{{"elementSiblingIndex", "", "5"}, {"head", "", "7"}});
  assertNotNull(actual);
  assertEquals("org.jsoup.nodes.Element", actual.getClass().getName());
  assertEquals("<head></head> {hasText=false, isBlock=true}", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput036() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.safety.Cleaner", "org.jsoup.safety.Cleaner", "clean", new String[]{"org.jsoup.nodes.Document"}, new String[]{"<sample:3>"}, false, 0, new String[][]{{"org.jsoup.safety.Cleaner", "clean", "org.jsoup.nodes.Document", "<sample:5>"}}, 2);
  assertNotNull(actual);
  assertEquals("org.jsoup.nodes.Document", actual.getClass().getName());
  assertEquals("<html>\n <head></head>\n <body></body>\n</html> {hasText=false, isBlock=false}", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput037() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jsoup.safety.Cleaner", "org.jsoup.safety.Cleaner", "clean", new String[]{"org.jsoup.nodes.Document"}, new String[]{"<sample:2>"}, false, 3, new String[][]{{"org.jsoup.safety.Cleaner", "clean", "org.jsoup.nodes.Document", "<sample:7>"}, {"org.jsoup.safety.Cleaner", "clean", "org.jsoup.nodes.Document", "<sample:5>"}}, 2), new String[][]{{"html", "", "4"}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("<html>\n <head></head>\n <body></body>\n</html>", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput038() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jsoup.safety.Cleaner", "org.jsoup.safety.Cleaner", "clean", new String[]{"org.jsoup.nodes.Document"}, new String[]{"<sample:3>"}, false, 6, new String[][]{{"org.jsoup.safety.Cleaner", "clean", "org.jsoup.nodes.Document", "<sample:7>"}, {"org.jsoup.safety.Cleaner", "clean", "org.jsoup.nodes.Document", "<sample:5>"}}, 2), new String[][]{{"html", "", "4"}, {"html", "java.lang.String", "6"}});
  assertNotNull(actual);
  assertEquals("org.jsoup.nodes.Document", actual.getClass().getName());
  assertEquals("0 {hasText=true, isBlock=false}", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput039() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jsoup.safety.Cleaner", "org.jsoup.safety.Cleaner", "clean", new String[]{"org.jsoup.nodes.Document"}, new String[]{"<sample:2>"}, false, 3, new String[][]{{"org.jsoup.safety.Cleaner", "isValid", "org.jsoup.nodes.Document", "<sample:0>"}}, 3), new String[][]{{"nextSibling", "", "4"}, {"attributes", "", "5"}, {"put", "java.lang.String,java.lang.String", "3"}});
  assertNotNull(actual);
  assertEquals("org.jsoup.nodes.Attributes", actual.getClass().getName());
  assertEquals(" sample=\"\" {size=1}", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput040() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jsoup.safety.Cleaner", "org.jsoup.safety.Cleaner", "clean", new String[]{"org.jsoup.nodes.Document"}, new String[]{"<sample:6>"}, false, 0, new String[][]{{"org.jsoup.safety.Cleaner", "clean", "org.jsoup.nodes.Document", "<sample:2>"}}, 2), new String[][]{{"firstElementSibling", "", "4"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput041() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jsoup.safety.Cleaner", "org.jsoup.safety.Cleaner", "clean", new String[]{"org.jsoup.nodes.Document"}, new String[]{"<sample:5>"}, false, 0, new String[][]{{"org.jsoup.safety.Cleaner", "clean", "org.jsoup.nodes.Document", "<sample:1>"}}, 3), new String[][]{{"getElementsByAttributeValueContaining", "java.lang.String,java.lang.String", "4"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput042() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jsoup.safety.Cleaner", "org.jsoup.safety.Cleaner", "clean", new String[]{"org.jsoup.nodes.Document"}, new String[]{"<sample:3>"}, false, 6, new String[][]{{"org.jsoup.safety.Cleaner", "clean", "org.jsoup.nodes.Document", "<sample:4>"}, {"org.jsoup.safety.Cleaner", "clean", "org.jsoup.nodes.Document", "<sample:6>"}}, 2), new String[][]{{"getElementsByAttributeValueMatching", "java.lang.String,java.lang.String", "3"}});
  assertNotNull(actual);
  assertEquals("org.jsoup.select.Elements", actual.getClass().getName());
  assertEquals("[]", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput043() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jsoup.safety.Cleaner", "org.jsoup.safety.Cleaner", "clean", new String[]{"org.jsoup.nodes.Document"}, new String[]{"<sample:7>"}, false, 0, null, 3), new String[][]{{"hasClass", "java.lang.String", "5"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput044() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jsoup.safety.Cleaner", "org.jsoup.safety.Cleaner", "clean", new String[]{"org.jsoup.nodes.Document"}, new String[]{"<sample:4>"}, false, 0, new String[][]{{"org.jsoup.safety.Cleaner", "isValid", "org.jsoup.nodes.Document", "<sample:6>"}, {"org.jsoup.safety.Cleaner", "isValid", "org.jsoup.nodes.Document", "<null>"}}, 2), new String[][]{{"data", "", "6"}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput045() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jsoup.safety.Cleaner", "org.jsoup.safety.Cleaner", "clean", new String[]{"org.jsoup.nodes.Document"}, new String[]{"<sample:3>"}, false, 3, new String[][]{{"org.jsoup.safety.Cleaner", "isValid", "org.jsoup.nodes.Document", "<sample:6>"}}, 2), new String[][]{{"childNodes", "", "4"}});
  assertNotNull(actual);
  assertEquals("java.util.ArrayList", actual.getClass().getName());
  assertEquals("[<html>\n <head></head>\n <body></body>\n</html>]", SearchInputFactory_scaffolding.observe(actual));
 }
}
