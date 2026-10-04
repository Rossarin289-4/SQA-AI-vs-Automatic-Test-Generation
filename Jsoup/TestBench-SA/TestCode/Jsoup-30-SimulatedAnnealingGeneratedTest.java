package generated.algorithm;

import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;
import static org.junit.Assert.*;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class SimulatedAnnealingGeneratedTest {
 @Test(timeout = 20000)
 public void generatedInput000() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.safety.Cleaner", "org.jsoup.safety.Cleaner", "clean", new String[]{"org.jsoup.nodes.Document"}, new String[]{"<sample:4>"}, false);
  assertNotNull(actual);
  assertEquals("org.jsoup.nodes.Document", actual.getClass().getName());
  assertEquals("<html>\n <head></head>\n <body></body>\n</html> {hasText=false, isBlock=false}", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput001() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jsoup.safety.Cleaner", "org.jsoup.safety.Cleaner", "clean", new String[]{"org.jsoup.nodes.Document"}, new String[]{"<null>"}, false); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput002() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.safety.Cleaner", "org.jsoup.safety.Cleaner", "clean", new String[]{"org.jsoup.nodes.Document"}, new String[]{"<sample:5>"}, false);
  assertNotNull(actual);
  assertEquals("org.jsoup.nodes.Document", actual.getClass().getName());
  assertEquals("<html>\n <head></head>\n <body></body>\n</html> {hasText=false, isBlock=false}", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput003() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.safety.Cleaner", "org.jsoup.safety.Cleaner", "clean", new String[]{"org.jsoup.nodes.Document"}, new String[]{"<sample:5>"}, false, 9, new String[][]{{"org.jsoup.safety.Cleaner", "clean", "org.jsoup.nodes.Document", "<sample:5>"}}, 1);
  assertNotNull(actual);
  assertEquals("org.jsoup.nodes.Document", actual.getClass().getName());
  assertEquals("<html>\n <head></head>\n <body></body>\n</html> {hasText=false, isBlock=false}", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput004() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jsoup.safety.Cleaner", "org.jsoup.safety.Cleaner", "clean", new String[]{"org.jsoup.nodes.Document"}, new String[]{"<sample:2>"}, false, 9, new String[][]{{"org.jsoup.safety.Cleaner", "clean", "org.jsoup.nodes.Document", "<sample:5>"}, {"org.jsoup.safety.Cleaner", "clean", "org.jsoup.nodes.Document", "<sample:1>"}}, 1), new String[][]{{"getElementsContainingOwnText", "java.lang.String", "2"}});
  assertNotNull(actual);
  assertEquals("org.jsoup.select.Elements", actual.getClass().getName());
  assertEquals("[]", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput005() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.safety.Cleaner", "org.jsoup.safety.Cleaner", "clean", new String[]{"org.jsoup.nodes.Document"}, new String[]{"<sample:2>"}, false, 0, new String[][]{{"org.jsoup.safety.Cleaner", "isValid", "org.jsoup.nodes.Document", "<sample:1>"}}, 2);
  assertNotNull(actual);
  assertEquals("org.jsoup.nodes.Document", actual.getClass().getName());
  assertEquals("<html>\n <head></head>\n <body></body>\n</html> {hasText=false, isBlock=false}", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput006() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.safety.Cleaner", "org.jsoup.safety.Cleaner", "isValid", new String[]{"org.jsoup.nodes.Document"}, new String[]{"<sample:5>"}, false, 0, new String[][]{{"org.jsoup.safety.Cleaner", "isValid", "org.jsoup.nodes.Document", "<sample:2>"}, {"org.jsoup.safety.Cleaner", "clean", "org.jsoup.nodes.Document", "<sample:0>"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput007() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jsoup.safety.Cleaner", "org.jsoup.safety.Cleaner", "clean", new String[]{"org.jsoup.nodes.Document"}, new String[]{"<sample:5>"}, false, 0, new String[][]{{"org.jsoup.safety.Cleaner", "clean", "org.jsoup.nodes.Document", "<sample:2>"}, {"org.jsoup.safety.Cleaner", "isValid", "org.jsoup.nodes.Document", "<sample:0>"}}, 1), new String[][]{{"before", "java.lang.String", "5"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput008() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.safety.Cleaner", "org.jsoup.safety.Cleaner", "isValid", new String[]{"org.jsoup.nodes.Document"}, new String[]{"<sample:1>"}, false, 0, null, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput009() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.safety.Cleaner", "org.jsoup.safety.Cleaner", "isValid", new String[]{"org.jsoup.nodes.Document"}, new String[]{"<sample:3>"}, false, 0, new String[][]{{"org.jsoup.safety.Cleaner", "isValid", "org.jsoup.nodes.Document", "<sample:4>"}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput010() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jsoup.safety.Cleaner", "org.jsoup.safety.Cleaner", "isValid", new String[]{"org.jsoup.nodes.Document"}, new String[]{"<null>"}, false, 2, new String[][]{{"org.jsoup.safety.Cleaner", "isValid", "org.jsoup.nodes.Document", "<null>"}, {"org.jsoup.safety.Cleaner", "clean", "org.jsoup.nodes.Document", "<sample:1>"}}, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput011() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jsoup.safety.Cleaner", "org.jsoup.safety.Cleaner", "isValid", new String[]{"org.jsoup.nodes.Document"}, new String[]{"<null>"}, false, 0, new String[][]{{"org.jsoup.safety.Cleaner", "clean", "org.jsoup.nodes.Document", "<sample:4>"}, {"org.jsoup.safety.Cleaner", "isValid", "org.jsoup.nodes.Document", "<sample:4>"}, {"org.jsoup.safety.Cleaner", "clean", "org.jsoup.nodes.Document", "<sample:7>"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput012() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.safety.Cleaner", "org.jsoup.safety.Cleaner", "isValid", new String[]{"org.jsoup.nodes.Document"}, new String[]{"<sample:3>"}, false, 16, new String[][]{{"org.jsoup.safety.Cleaner", "isValid", "org.jsoup.nodes.Document", "<sample:1>"}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput013() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jsoup.safety.Cleaner", "org.jsoup.safety.Cleaner", "clean", new String[]{"org.jsoup.nodes.Document"}, new String[]{"<sample:0>"}, false, 0, new String[][]{{"org.jsoup.safety.Cleaner", "isValid", "org.jsoup.nodes.Document", "<sample:6>"}}), new String[][]{{"nodeName", "", "4"}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("#document", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput014() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jsoup.safety.Cleaner", "org.jsoup.safety.Cleaner", "clean", new String[]{"org.jsoup.nodes.Document"}, new String[]{"<sample:0>"}, false, 0, new String[][]{{"org.jsoup.safety.Cleaner", "isValid", "org.jsoup.nodes.Document", "<sample:7>"}, {"org.jsoup.safety.Cleaner", "clean", "org.jsoup.nodes.Document", "<sample:0>"}}, 1), new String[][]{{"nodeName", "", "4"}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("#document", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput015() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jsoup.safety.Cleaner", "org.jsoup.safety.Cleaner", "clean", new String[]{"org.jsoup.nodes.Document"}, new String[]{"<sample:0>"}, false, 0, new String[][]{{"org.jsoup.safety.Cleaner", "isValid", "org.jsoup.nodes.Document", "<sample:7>"}, {"org.jsoup.safety.Cleaner", "clean", "org.jsoup.nodes.Document", "<sample:5>"}}, 1), new String[][]{{"getElementsMatchingOwnText", "java.util.regex.Pattern", "7"}});
  assertNotNull(actual);
  assertEquals("org.jsoup.select.Elements", actual.getClass().getName());
  assertEquals("[<html>\n <head></head>\n <body></body>\n</html>, <html>\n <head></head>\n <body></body>\n</html>, <head></head>, <body></body>]", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput016() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jsoup.safety.Cleaner", "org.jsoup.safety.Cleaner", "clean", new String[]{"org.jsoup.nodes.Document"}, new String[]{"<sample:1>"}, false, 0, new String[][]{{"org.jsoup.safety.Cleaner", "clean", "org.jsoup.nodes.Document", "<sample:3>"}}), new String[][]{{"getElementsByIndexEquals", "int", "3"}, {"lastIndexOf", "java.lang.Object", "7"}, {"attr", "java.lang.String", "5"}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput017() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jsoup.safety.Cleaner", "org.jsoup.safety.Cleaner", "clean", new String[]{"org.jsoup.nodes.Document"}, new String[]{"<sample:7>"}, false, 0, null, 3), new String[][]{{"className", "", "6"}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput018() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.safety.Cleaner", "org.jsoup.safety.Cleaner", "clean", new String[]{"org.jsoup.nodes.Document"}, new String[]{"<sample:6>"}, false, 0, null, 3);
  assertNotNull(actual);
  assertEquals("org.jsoup.nodes.Document", actual.getClass().getName());
  assertEquals("<html>\n <head></head>\n <body></body>\n</html> {hasText=false, isBlock=false}", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput019() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jsoup.safety.Cleaner", "org.jsoup.safety.Cleaner", "clean", new String[]{"org.jsoup.nodes.Document"}, new String[]{"<sample:6>"}, false, 0, null, 3), new String[][]{{"getElementById", "java.lang.String", "7"}});
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput020() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jsoup.safety.Cleaner", "org.jsoup.safety.Cleaner", "clean", new String[]{"org.jsoup.nodes.Document"}, new String[]{"<null>"}, false, 0, null, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput021() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jsoup.safety.Cleaner", "org.jsoup.safety.Cleaner", "isValid", new String[]{"org.jsoup.nodes.Document"}, new String[]{"<null>"}, false, 6, new String[][]{{"org.jsoup.safety.Cleaner", "isValid", "org.jsoup.nodes.Document", "<sample:0>"}}, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput022() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jsoup.safety.Cleaner", "org.jsoup.safety.Cleaner", "clean", new String[]{"org.jsoup.nodes.Document"}, new String[]{"<sample:3>"}, false), new String[][]{{"getElementsMatchingOwnText", "java.util.regex.Pattern", "4"}});
  assertNotNull(actual);
  assertEquals("org.jsoup.select.Elements", actual.getClass().getName());
  assertEquals("[<html>\n <head></head>\n <body></body>\n</html>, <html>\n <head></head>\n <body></body>\n</html>, <head></head>, <body></body>]", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput023() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jsoup.safety.Cleaner", "org.jsoup.safety.Cleaner", "clean", new String[]{"org.jsoup.nodes.Document"}, new String[]{"<sample:6>"}, false, 0, new String[][]{{"org.jsoup.safety.Cleaner", "clean", "org.jsoup.nodes.Document", "<sample:5>"}, {"org.jsoup.safety.Cleaner", "clean", "org.jsoup.nodes.Document", "<sample:2>"}}), new String[][]{{"getElementsByAttributeValueMatching", "java.lang.String,java.lang.String", "5"}, {"empty", "", "1"}, {"lastIndexOf", "java.lang.Object", "2"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("-1", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput024() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jsoup.safety.Cleaner", "org.jsoup.safety.Cleaner", "clean", new String[]{"org.jsoup.nodes.Document"}, new String[]{"<sample:5>"}, false, 0, new String[][]{{"org.jsoup.safety.Cleaner", "clean", "org.jsoup.nodes.Document", "<sample:5>"}, {"org.jsoup.safety.Cleaner", "clean", "org.jsoup.nodes.Document", "<sample:5>"}}), new String[][]{{"getElementsByAttributeValueMatching", "java.lang.String,java.lang.String", "5"}, {"empty", "", "1"}, {"lastIndexOf", "java.lang.Object", "2"}, {"addAll", "java.util.Collection", "7"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput025() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jsoup.safety.Cleaner", "org.jsoup.safety.Cleaner", "clean", new String[]{"org.jsoup.nodes.Document"}, new String[]{"<sample:11>"}, false, 4, new String[][]{{"org.jsoup.safety.Cleaner", "clean", "org.jsoup.nodes.Document", "<sample:5>"}}), new String[][]{{"getElementsByIndexEquals", "int", "6"}, {"after", "java.lang.String", "3"}});
  assertNotNull(actual);
  assertEquals("org.jsoup.select.Elements", actual.getClass().getName());
  assertEquals("[]", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput026() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jsoup.safety.Cleaner", "org.jsoup.safety.Cleaner", "isValid", new String[]{"org.jsoup.nodes.Document"}, new String[]{"<null>"}, false, 1, new String[][]{{"org.jsoup.safety.Cleaner", "clean", "org.jsoup.nodes.Document", "<sample:5>"}}, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput027() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jsoup.safety.Cleaner", "org.jsoup.safety.Cleaner", "clean", new String[]{"org.jsoup.nodes.Document"}, new String[]{"<sample:6>"}, false, 1, new String[][]{{"org.jsoup.safety.Cleaner", "clean", "org.jsoup.nodes.Document", "<sample:4>"}, {"org.jsoup.safety.Cleaner", "isValid", "org.jsoup.nodes.Document", "<sample:6>"}}, 2), new String[][]{{"appendElement", "java.lang.String", "2"}});
  assertNotNull(actual);
  assertEquals("org.jsoup.nodes.Element", actual.getClass().getName());
  assertEquals("<0></0> {hasText=false, isBlock=false}", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput028() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jsoup.safety.Cleaner", "org.jsoup.safety.Cleaner", "clean", new String[]{"org.jsoup.nodes.Document"}, new String[]{"<sample:0>"}, false, 1, new String[][]{{"org.jsoup.safety.Cleaner", "clean", "org.jsoup.nodes.Document", "<sample:4>"}, {"org.jsoup.safety.Cleaner", "isValid", "org.jsoup.nodes.Document", "<sample:6>"}, {"org.jsoup.safety.Cleaner", "isValid", "org.jsoup.nodes.Document", "<sample:3>"}}, 2), new String[][]{{"getElementsByAttributeValueMatching", "java.lang.String,java.lang.String", "2"}});
  assertNotNull(actual);
  assertEquals("org.jsoup.select.Elements", actual.getClass().getName());
  assertEquals("[]", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput029() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jsoup.safety.Cleaner", "org.jsoup.safety.Cleaner", "clean", new String[]{"org.jsoup.nodes.Document"}, new String[]{"<sample:9>"}, false, 1, new String[][]{{"org.jsoup.safety.Cleaner", "clean", "org.jsoup.nodes.Document", "<sample:4>"}, {"org.jsoup.safety.Cleaner", "isValid", "org.jsoup.nodes.Document", "<sample:2>"}, {"org.jsoup.safety.Cleaner", "isValid", "org.jsoup.nodes.Document", "<null>"}}, 2), new String[][]{{"before", "java.lang.String", "3"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput030() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jsoup.safety.Cleaner", "org.jsoup.safety.Cleaner", "clean", new String[]{"org.jsoup.nodes.Document"}, new String[]{"<sample:1>"}, false, 0, new String[][]{{"org.jsoup.safety.Cleaner", "isValid", "org.jsoup.nodes.Document", "<sample:4>"}}), new String[][]{{"child", "int", "3"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IndexOutOfBoundsException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput031() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jsoup.safety.Cleaner", "org.jsoup.safety.Cleaner", "clean", new String[]{"org.jsoup.nodes.Document"}, new String[]{"<sample:5>"}, false, 5, new String[][]{{"org.jsoup.safety.Cleaner", "isValid", "org.jsoup.nodes.Document", "<sample:1>"}, {"org.jsoup.safety.Cleaner", "clean", "org.jsoup.nodes.Document", "<sample:4>"}, {"org.jsoup.safety.Cleaner", "clean", "org.jsoup.nodes.Document", "<sample:2>"}}, 3), new String[][]{{"child", "int", "5"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IndexOutOfBoundsException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput032() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jsoup.safety.Cleaner", "org.jsoup.safety.Cleaner", "clean", new String[]{"org.jsoup.nodes.Document"}, new String[]{"<sample:5>"}, false, 0, null, 1), new String[][]{{"clone", "", "6"}, {"absUrl", "java.lang.String", "5"}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput033() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jsoup.safety.Cleaner", "org.jsoup.safety.Cleaner", "clean", new String[]{"org.jsoup.nodes.Document"}, new String[]{"<sample:3>"}, false, 9, new String[][]{{"org.jsoup.safety.Cleaner", "clean", "org.jsoup.nodes.Document", "<sample:4>"}, {"org.jsoup.safety.Cleaner", "isValid", "org.jsoup.nodes.Document", "<sample:4>"}, {"org.jsoup.safety.Cleaner", "clean", "org.jsoup.nodes.Document", "<sample:3>"}}, 3), new String[][]{{"nodeName", "", "5"}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("#document", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput034() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jsoup.safety.Cleaner", "org.jsoup.safety.Cleaner", "clean", new String[]{"org.jsoup.nodes.Document"}, new String[]{"<sample:7>"}, false, 0, new String[][]{{"org.jsoup.safety.Cleaner", "isValid", "org.jsoup.nodes.Document", "<sample:3>"}, {"org.jsoup.safety.Cleaner", "isValid", "org.jsoup.nodes.Document", "<sample:6>"}}, 2), new String[][]{{"getElementsByAttributeValueContaining", "java.lang.String,java.lang.String", "5"}, {"addAll", "int,java.util.Collection", "7"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IndexOutOfBoundsException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput035() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jsoup.safety.Cleaner", "org.jsoup.safety.Cleaner", "clean", new String[]{"org.jsoup.nodes.Document"}, new String[]{"<sample:0>"}, false, 1, new String[][]{{"org.jsoup.safety.Cleaner", "clean", "org.jsoup.nodes.Document", "<sample:7>"}, {"org.jsoup.safety.Cleaner", "isValid", "org.jsoup.nodes.Document", "<sample:4>"}, {"org.jsoup.safety.Cleaner", "isValid", "org.jsoup.nodes.Document", "<sample:7>"}}, 1), new String[][]{{"hasText", "", "6"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput036() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jsoup.safety.Cleaner", "org.jsoup.safety.Cleaner", "clean", new String[]{"org.jsoup.nodes.Document"}, new String[]{"<sample:4>"}, false, 1, new String[][]{{"org.jsoup.safety.Cleaner", "clean", "org.jsoup.nodes.Document", "<sample:3>"}, {"org.jsoup.safety.Cleaner", "isValid", "org.jsoup.nodes.Document", "<sample:8>"}}, 1), new String[][]{{"hasText", "", "0"}, {"getElementsByAttributeValueEnding", "java.lang.String,java.lang.String", "1"}, {"add", "int,org.jsoup.nodes.Element", "2"}});
  assertNotNull(actual);
  assertEquals("org.jsoup.select.Elements", actual.getClass().getName());
  assertEquals("[null]", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput037() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jsoup.safety.Cleaner", "org.jsoup.safety.Cleaner", "clean", new String[]{"org.jsoup.nodes.Document"}, new String[]{"<sample:1>"}, false, 4, new String[][]{{"org.jsoup.safety.Cleaner", "isValid", "org.jsoup.nodes.Document", "<sample:5>"}}, 2), new String[][]{{"className", "", "0"}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput038() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jsoup.safety.Cleaner", "org.jsoup.safety.Cleaner", "clean", new String[]{"org.jsoup.nodes.Document"}, new String[]{"<sample:4>"}, false, 0, null, 3), new String[][]{{"getElementsByClass", "java.lang.String", "2"}, {"addClass", "java.lang.String", "7"}, {"html", "", "4"}, {"remove", "java.lang.Object", "0"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput039() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jsoup.safety.Cleaner", "org.jsoup.safety.Cleaner", "clean", new String[]{"org.jsoup.nodes.Document"}, new String[]{"<sample:1>"}, false, 4, new String[][]{}, 2), new String[][]{{"dataset", "", "5"}});
  assertNotNull(actual);
  assertEquals("org.jsoup.nodes.Attributes$Dataset", actual.getClass().getName());
  assertEquals("{}", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput040() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jsoup.safety.Cleaner", "org.jsoup.safety.Cleaner", "clean", new String[]{"org.jsoup.nodes.Document"}, new String[]{"<sample:3>"}, false, 0, null, 3), new String[][]{{"getElementsMatchingText", "java.util.regex.Pattern", "2"}});
  assertNotNull(actual);
  assertEquals("org.jsoup.select.Elements", actual.getClass().getName());
  assertEquals("[<html>\n <head></head>\n <body></body>\n</html>, <html>\n <head></head>\n <body></body>\n</html>, <head></head>, <body></body>]", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput041() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jsoup.safety.Cleaner", "org.jsoup.safety.Cleaner", "clean", new String[]{"org.jsoup.nodes.Document"}, new String[]{"<sample:1>"}, false, 0, new String[][]{{"org.jsoup.safety.Cleaner", "isValid", "org.jsoup.nodes.Document", "<sample:6>"}, {"org.jsoup.safety.Cleaner", "clean", "org.jsoup.nodes.Document", "<sample:4>"}}, 2), new String[][]{{"className", "", "7"}, {"lastElementSibling", "", "5"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput042() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jsoup.safety.Cleaner", "org.jsoup.safety.Cleaner", "clean", new String[]{"org.jsoup.nodes.Document"}, new String[]{"<sample:2>"}, false, 3, new String[][]{}, 2), new String[][]{{"empty", "", "5"}, {"dataNodes", "", "6"}});
  assertNotNull(actual);
  assertEquals("java.util.Collections$UnmodifiableRandomAccessList", actual.getClass().getName());
  assertEquals("[]", SearchInputFactory_scaffolding.observe(actual));
 }
}
