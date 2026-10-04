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
  try { SearchInputFactory_scaffolding.call("org.jsoup.safety.Cleaner", "org.jsoup.safety.Cleaner", "isValid", new String[]{"org.jsoup.nodes.Document"}, new String[]{"<sample:2>"}, false); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput001() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.safety.Cleaner", "org.jsoup.safety.Cleaner", "clean", new String[]{"org.jsoup.nodes.Document"}, new String[]{"<sample:1>"}, false, 0, new String[][]{{"org.jsoup.safety.Cleaner", "isValid", "org.jsoup.nodes.Document", "<sample:3>"}});
  assertNotNull(actual);
  assertEquals("org.jsoup.nodes.Document", actual.getClass().getName());
  assertEquals("<html>\n <head></head>\n <body></body>\n</html> {hasText=false, isBlock=false}", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput002() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jsoup.safety.Cleaner", "org.jsoup.safety.Cleaner", "isValid", new String[]{"org.jsoup.nodes.Document"}, new String[]{"<sample:5>"}, false, 0, new String[][]{{"org.jsoup.safety.Cleaner", "isValid", "org.jsoup.nodes.Document", "<sample:6>"}}, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput003() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.safety.Cleaner", "org.jsoup.safety.Cleaner", "clean", new String[]{"org.jsoup.nodes.Document"}, new String[]{"<sample:4>"}, false, 0, null, 1);
  assertNotNull(actual);
  assertEquals("org.jsoup.nodes.Document", actual.getClass().getName());
  assertEquals("<html>\n <head></head>\n <body></body>\n</html> {hasText=false, isBlock=false}", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput004() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jsoup.safety.Cleaner", "org.jsoup.safety.Cleaner", "isValid", new String[]{"org.jsoup.nodes.Document"}, new String[]{"<sample:6>"}, false, 7, new String[][]{}, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput005() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.safety.Cleaner", "org.jsoup.safety.Cleaner", "isValid", new String[]{"org.jsoup.nodes.Document"}, new String[]{"<sample:4>"}, false, 0, new String[][]{{"org.jsoup.safety.Cleaner", "isValid", "org.jsoup.nodes.Document", "<sample:7>"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput006() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jsoup.safety.Cleaner", "org.jsoup.safety.Cleaner", "clean", new String[]{"org.jsoup.nodes.Document"}, new String[]{"<sample:5>"}, false), new String[][]{{"appendChild", "org.jsoup.nodes.Node", "4"}, {"attr", "java.lang.String", "3"}, {"getElementsByIndexGreaterThan", "int", "1"}});
  assertNotNull(actual);
  assertEquals("org.jsoup.select.Elements", actual.getClass().getName());
  assertEquals("[<html>\n <head></head>\n <body></body>\n</html>\n<!--a-->, <html>\n <head></head>\n <body></body>\n</html>, <head></head>, <body></body>]", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput007() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jsoup.safety.Cleaner", "org.jsoup.safety.Cleaner", "clean", new String[]{"org.jsoup.nodes.Document"}, new String[]{"<sample:2>"}, false, 0, null, 1), new String[][]{{"lastElementSibling", "", "5"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput008() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jsoup.safety.Cleaner", "org.jsoup.safety.Cleaner", "clean", new String[]{"org.jsoup.nodes.Document"}, new String[]{"<sample:5>"}, false, 6, new String[][]{}, 3), new String[][]{{"classNames", "", "1"}});
  assertNotNull(actual);
  assertEquals("java.util.LinkedHashSet", actual.getClass().getName());
  assertEquals("[]", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput009() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.safety.Cleaner", "org.jsoup.safety.Cleaner", "isValid", new String[]{"org.jsoup.nodes.Document"}, new String[]{"<sample:4>"}, false, 0, null, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput010() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jsoup.safety.Cleaner", "org.jsoup.safety.Cleaner", "clean", new String[]{"org.jsoup.nodes.Document"}, new String[]{"<sample:2>"}, false), new String[][]{{"createElement", "java.lang.String", "5"}});
  assertNotNull(actual);
  assertEquals("org.jsoup.nodes.Element", actual.getClass().getName());
  assertEquals("<a></a> {hasText=false, isBlock=false}", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput011() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jsoup.safety.Cleaner", "org.jsoup.safety.Cleaner", "clean", new String[]{"org.jsoup.nodes.Document"}, new String[]{"<sample:7>"}, false, 0, null, 1), new String[][]{{"appendChild", "org.jsoup.nodes.Node", "4"}, {"getElementsMatchingOwnText", "java.util.regex.Pattern", "0"}});
  assertNotNull(actual);
  assertEquals("org.jsoup.select.Elements", actual.getClass().getName());
  assertEquals("[<html>\n <head></head>\n <body></body>\n</html>\n<!--a-->, <html>\n <head></head>\n <body></body>\n</html>, <head></head>, <body></body>]", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput012() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jsoup.safety.Cleaner", "org.jsoup.safety.Cleaner", "clean", new String[]{"org.jsoup.nodes.Document"}, new String[]{"<sample:3>"}, false, 2, new String[][]{{"org.jsoup.safety.Cleaner", "clean", "org.jsoup.nodes.Document", "<null>"}}), new String[][]{{"hasText", "", "1"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput013() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jsoup.safety.Cleaner", "org.jsoup.safety.Cleaner", "clean", new String[]{"org.jsoup.nodes.Document"}, new String[]{"<sample:0>"}, false, 0, new String[][]{{"org.jsoup.safety.Cleaner", "isValid", "org.jsoup.nodes.Document", "<sample:8>"}}), new String[][]{{"getElementsContainingText", "java.lang.String", "1"}});
  assertNotNull(actual);
  assertEquals("org.jsoup.select.Elements", actual.getClass().getName());
  assertEquals("[]", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput014() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jsoup.safety.Cleaner", "org.jsoup.safety.Cleaner", "isValid", new String[]{"org.jsoup.nodes.Document"}, new String[]{"<sample:2>"}, false, 0, null, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput015() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jsoup.safety.Cleaner", "org.jsoup.safety.Cleaner", "clean", new String[]{"org.jsoup.nodes.Document"}, new String[]{"<null>"}, false, 0, new String[][]{{"org.jsoup.safety.Cleaner", "isValid", "org.jsoup.nodes.Document", "<sample:6>"}}, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput016() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jsoup.safety.Cleaner", "org.jsoup.safety.Cleaner", "clean", new String[]{"org.jsoup.nodes.Document"}, new String[]{"<sample:3>"}, false, 2, new String[][]{{"org.jsoup.safety.Cleaner", "clean", "org.jsoup.nodes.Document", "<sample:1>"}}, 2), new String[][]{{"getElementsByAttribute", "java.lang.String", "2"}, {"addClass", "java.lang.String", "7"}});
  assertNotNull(actual);
  assertEquals("org.jsoup.select.Elements", actual.getClass().getName());
  assertEquals("[]", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput017() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jsoup.safety.Cleaner", "org.jsoup.safety.Cleaner", "clean", new String[]{"org.jsoup.nodes.Document"}, new String[]{"<sample:10>"}, false), new String[][]{{"createElement", "java.lang.String", "3"}});
  assertNotNull(actual);
  assertEquals("org.jsoup.nodes.Element", actual.getClass().getName());
  assertEquals("<sample></sample> {hasText=false, isBlock=false}", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput018() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jsoup.safety.Cleaner", "org.jsoup.safety.Cleaner", "clean", new String[]{"org.jsoup.nodes.Document"}, new String[]{"<sample:3>"}, false, 0, new String[][]{{"org.jsoup.safety.Cleaner", "clean", "org.jsoup.nodes.Document", "<sample:2>"}}), new String[][]{{"html", "", "4"}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("<html>\n <head></head>\n <body></body>\n</html>", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput019() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jsoup.safety.Cleaner", "org.jsoup.safety.Cleaner", "isValid", new String[]{"org.jsoup.nodes.Document"}, new String[]{"<null>"}, false, 0, new String[][]{{"org.jsoup.safety.Cleaner", "clean", "org.jsoup.nodes.Document", "<sample:2>"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput020() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jsoup.safety.Cleaner", "org.jsoup.safety.Cleaner", "clean", new String[]{"org.jsoup.nodes.Document"}, new String[]{"<sample:6>"}, false, 5, new String[][]{}), new String[][]{{"getElementsByAttributeValueStarting", "java.lang.String,java.lang.String", "4"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput021() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jsoup.safety.Cleaner", "org.jsoup.safety.Cleaner", "clean", new String[]{"org.jsoup.nodes.Document"}, new String[]{"<sample:4>"}, false, 0, new String[][]{{"org.jsoup.safety.Cleaner", "clean", "org.jsoup.nodes.Document", "<sample:8>"}}), new String[][]{{"className", "", "0"}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput022() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.safety.Cleaner", "org.jsoup.safety.Cleaner", "clean", new String[]{"org.jsoup.nodes.Document"}, new String[]{"<sample:3>"}, false, 0, null, 2);
  assertNotNull(actual);
  assertEquals("org.jsoup.nodes.Document", actual.getClass().getName());
  assertEquals("<html>\n <head></head>\n <body></body>\n</html> {hasText=false, isBlock=false}", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput023() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jsoup.safety.Cleaner", "org.jsoup.safety.Cleaner", "clean", new String[]{"org.jsoup.nodes.Document"}, new String[]{"<sample:6>"}, false, 0, null, 3), new String[][]{{"createElement", "java.lang.String", "2"}});
  assertNotNull(actual);
  assertEquals("org.jsoup.nodes.Element", actual.getClass().getName());
  assertEquals("<0></0> {hasText=false, isBlock=false}", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput024() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jsoup.safety.Cleaner", "org.jsoup.safety.Cleaner", "clean", new String[]{"org.jsoup.nodes.Document"}, new String[]{"<sample:7>"}, false, 0, new String[][]{{"org.jsoup.safety.Cleaner", "clean", "org.jsoup.nodes.Document", "<sample:6>"}}, 1), new String[][]{{"dataNodes", "", "0"}, {"remove", "java.lang.Object", "3"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.UnsupportedOperationException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput025() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jsoup.safety.Cleaner", "org.jsoup.safety.Cleaner", "clean", new String[]{"org.jsoup.nodes.Document"}, new String[]{"<sample:4>"}, false, 1, new String[][]{{"org.jsoup.safety.Cleaner", "isValid", "org.jsoup.nodes.Document", "<sample:6>"}}, 3), new String[][]{{"childNode", "int", "3"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IndexOutOfBoundsException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput026() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jsoup.safety.Cleaner", "org.jsoup.safety.Cleaner", "clean", new String[]{"org.jsoup.nodes.Document"}, new String[]{"<sample:0>"}, false, 0, new String[][]{{"org.jsoup.safety.Cleaner", "isValid", "org.jsoup.nodes.Document", "<sample:1>"}}, 1), new String[][]{{"getElementsByTag", "java.lang.String", "7"}});
  assertNotNull(actual);
  assertEquals("org.jsoup.select.Elements", actual.getClass().getName());
  assertEquals("[]", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput027() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jsoup.safety.Cleaner", "org.jsoup.safety.Cleaner", "isValid", new String[]{"org.jsoup.nodes.Document"}, new String[]{"<null>"}, false, 0, null, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput028() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jsoup.safety.Cleaner", "org.jsoup.safety.Cleaner", "clean", new String[]{"org.jsoup.nodes.Document"}, new String[]{"<sample:4>"}, false, 3, new String[][]{{"org.jsoup.safety.Cleaner", "clean", "org.jsoup.nodes.Document", "<sample:3>"}}, 1), new String[][]{{"getElementById", "java.lang.String", "5"}, {"empty", "", "2"}, {"hasClass", "java.lang.String", "7"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput029() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jsoup.safety.Cleaner", "org.jsoup.safety.Cleaner", "clean", new String[]{"org.jsoup.nodes.Document"}, new String[]{"<sample:4>"}, false, 0, new String[][]{{"org.jsoup.safety.Cleaner", "clean", "org.jsoup.nodes.Document", "<sample:4>"}}, 2), new String[][]{{"after", "java.lang.String", "7"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput030() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jsoup.safety.Cleaner", "org.jsoup.safety.Cleaner", "clean", new String[]{"org.jsoup.nodes.Document"}, new String[]{"<sample:7>"}, false, 0, new String[][]{{"org.jsoup.safety.Cleaner", "isValid", "org.jsoup.nodes.Document", "<null>"}, {"org.jsoup.safety.Cleaner", "isValid", "org.jsoup.nodes.Document", "<sample:6>"}}, 3), new String[][]{{"nextElementSibling", "", "5"}});
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput031() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.safety.Cleaner", "org.jsoup.safety.Cleaner", "clean", new String[]{"org.jsoup.nodes.Document"}, new String[]{"<sample:7>"}, false, 0, new String[][]{{"org.jsoup.safety.Cleaner", "clean", "org.jsoup.nodes.Document", "<sample:6>"}}, 3);
  assertNotNull(actual);
  assertEquals("org.jsoup.nodes.Document", actual.getClass().getName());
  assertEquals("<html>\n <head></head>\n <body></body>\n</html> {hasText=false, isBlock=false}", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput032() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jsoup.safety.Cleaner", "org.jsoup.safety.Cleaner", "clean", new String[]{"org.jsoup.nodes.Document"}, new String[]{"<sample:6>"}, false, 0, new String[][]{{"org.jsoup.safety.Cleaner", "isValid", "org.jsoup.nodes.Document", "<sample:3>"}}, 3), new String[][]{{"getElementsByAttributeValueNot", "java.lang.String,java.lang.String", "0"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput033() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jsoup.safety.Cleaner", "org.jsoup.safety.Cleaner", "isValid", new String[]{"org.jsoup.nodes.Document"}, new String[]{"<null>"}, false, 0, new String[][]{{"org.jsoup.safety.Cleaner", "isValid", "org.jsoup.nodes.Document", "<sample:0>"}}, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput034() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jsoup.safety.Cleaner", "org.jsoup.safety.Cleaner", "clean", new String[]{"org.jsoup.nodes.Document"}, new String[]{"<sample:3>"}, false, 0, new String[][]{{"org.jsoup.safety.Cleaner", "clean", "org.jsoup.nodes.Document", "<sample:7>"}, {"org.jsoup.safety.Cleaner", "clean", "org.jsoup.nodes.Document", "<sample:4>"}}, 2), new String[][]{{"nodeName", "", "4"}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("#document", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput035() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jsoup.safety.Cleaner", "org.jsoup.safety.Cleaner", "clean", new String[]{"org.jsoup.nodes.Document"}, new String[]{"<sample:6>"}, false, 0, null, 2), new String[][]{{"getAllElements", "", "4"}});
  assertNotNull(actual);
  assertEquals("org.jsoup.select.Elements", actual.getClass().getName());
  assertEquals("[<html>\n <head></head>\n <body></body>\n</html>, <html>\n <head></head>\n <body></body>\n</html>, <head></head>, <body></body>]", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput036() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jsoup.safety.Cleaner", "org.jsoup.safety.Cleaner", "clean", new String[]{"org.jsoup.nodes.Document"}, new String[]{"<sample:7>"}, false, 3, new String[][]{{"org.jsoup.safety.Cleaner", "clean", "org.jsoup.nodes.Document", "<sample:2>"}, {"org.jsoup.safety.Cleaner", "isValid", "org.jsoup.nodes.Document", "<sample:8>"}}, 1), new String[][]{{"nextElementSibling", "", "1"}});
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput037() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jsoup.safety.Cleaner", "org.jsoup.safety.Cleaner", "clean", new String[]{"org.jsoup.nodes.Document"}, new String[]{"<sample:6>"}, false, 2, new String[][]{}, 3), new String[][]{{"getElementsContainingOwnText", "java.lang.String", "4"}});
  assertNotNull(actual);
  assertEquals("org.jsoup.select.Elements", actual.getClass().getName());
  assertEquals("[<html>\n <head></head>\n <body></body>\n</html>, <html>\n <head></head>\n <body></body>\n</html>, <head></head>, <body></body>]", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput038() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jsoup.safety.Cleaner", "org.jsoup.safety.Cleaner", "isValid", new String[]{"org.jsoup.nodes.Document"}, new String[]{"<null>"}, false, 0, null, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput039() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.safety.Cleaner", "org.jsoup.safety.Cleaner", "isValid", new String[]{"org.jsoup.nodes.Document"}, new String[]{"<sample:4>"}, false, 3, new String[][]{{"org.jsoup.safety.Cleaner", "isValid", "org.jsoup.nodes.Document", "<sample:2>"}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput040() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jsoup.safety.Cleaner", "org.jsoup.safety.Cleaner", "clean", new String[]{"org.jsoup.nodes.Document"}, new String[]{"<sample:9>"}, false, 4, new String[][]{{"org.jsoup.safety.Cleaner", "isValid", "org.jsoup.nodes.Document", "<sample:0>"}}, 3), new String[][]{{"hasClass", "java.lang.String", "7"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput041() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jsoup.safety.Cleaner", "org.jsoup.safety.Cleaner", "clean", new String[]{"org.jsoup.nodes.Document"}, new String[]{"<sample:3>"}, false, 0, new String[][]{{"org.jsoup.safety.Cleaner", "isValid", "org.jsoup.nodes.Document", "<sample:6>"}}, 1), new String[][]{{"id", "", "4"}, {"html", "", "0"}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("<html>\n <head></head>\n <body></body>\n</html>", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput042() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jsoup.safety.Cleaner", "org.jsoup.safety.Cleaner", "clean", new String[]{"org.jsoup.nodes.Document"}, new String[]{"<sample:6>"}, false, 0, new String[][]{{"org.jsoup.safety.Cleaner", "isValid", "org.jsoup.nodes.Document", "<sample:2>"}}, 2), new String[][]{{"firstElementSibling", "", "0"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput043() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jsoup.safety.Cleaner", "org.jsoup.safety.Cleaner", "clean", new String[]{"org.jsoup.nodes.Document"}, new String[]{"<sample:0>"}, false, 0, null, 2), new String[][]{{"html", "java.lang.String", "0"}, {"dataNodes", "", "6"}, {"add", "java.lang.Object", "4"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.UnsupportedOperationException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput044() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jsoup.safety.Cleaner", "org.jsoup.safety.Cleaner", "clean", new String[]{"org.jsoup.nodes.Document"}, new String[]{"<sample:7>"}, false, 4, new String[][]{}, 2), new String[][]{{"hasClass", "java.lang.String", "2"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput045() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.safety.Cleaner", "org.jsoup.safety.Cleaner", "isValid", new String[]{"org.jsoup.nodes.Document"}, new String[]{"<sample:4>"}, false, 0, null, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
 }
}
