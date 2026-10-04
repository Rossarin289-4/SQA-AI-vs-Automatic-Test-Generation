package generated.algorithm;

import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;
import static org.junit.Assert.*;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class SimulatedAnnealingGeneratedTest {
 @Test(timeout = 20000)
 public void generatedInput000() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.parser.TreeBuilderState", "org.jsoup.parser.TreeBuilderState$1", "values", new String[]{}, new String[]{}, true);
  assertNotNull(actual);
  assertEquals("[Lorg.jsoup.parser.TreeBuilderState;", actual.getClass().getName());
  assertEquals("[Initial, BeforeHtml, BeforeHead, InHead, InHeadNoscript, AfterHead, InBody, Text, InTable, InTableText, InCaption, InColumnGroup, InTableBody, InRow, InCell, InSelect, InSelectInTable, AfterBody, InF...#275#355538594", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput001() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jsoup.parser.TreeBuilderState", "org.jsoup.parser.TreeBuilderState$1", "valueOf", new String[]{"java.lang.String"}, new String[]{"1.12345678901234567"}, true); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput002() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jsoup.parser.TreeBuilderState", "org.jsoup.parser.TreeBuilderState$1", "process", new String[]{"org.jsoup.parser.Token", "org.jsoup.parser.TreeBuilder"}, new String[]{"<sample:3>", "<sample:4>"}, false, 3, new String[][]{{"org.jsoup.parser.TreeBuilderState", "process", "org.jsoup.parser.Token,org.jsoup.parser.TreeBuilder", "<sample:1>", "<sample:6>"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput003() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jsoup.parser.TreeBuilderState", "org.jsoup.parser.TreeBuilderState$1", "process", new String[]{"org.jsoup.parser.Token", "org.jsoup.parser.TreeBuilder"}, new String[]{"<sample:3>", "<sample:4>"}, false, 3, new String[][]{{"org.jsoup.parser.TreeBuilderState", "process", "org.jsoup.parser.Token,org.jsoup.parser.TreeBuilder", "<sample:1>", "<sample:6>"}, {"org.jsoup.parser.TreeBuilderState", "process", "org.jsoup.parser.Token,org.jsoup.parser.TreeBuilder", "<sample:0>", "<sample:6>"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput004() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jsoup.parser.TreeBuilderState", "org.jsoup.parser.TreeBuilderState$1", "process", new String[]{"org.jsoup.parser.Token", "org.jsoup.parser.TreeBuilder"}, new String[]{"<sample:3>", "<sample:4>"}, false, 3, new String[][]{{"org.jsoup.parser.TreeBuilderState", "process", "org.jsoup.parser.Token,org.jsoup.parser.TreeBuilder", "<sample:1>", "<sample:6>"}, {"org.jsoup.parser.TreeBuilderState", "process", "org.jsoup.parser.Token,org.jsoup.parser.TreeBuilder", "<sample:4>", "<sample:6>"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput005() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jsoup.parser.TreeBuilderState", "org.jsoup.parser.TreeBuilderState$1", "process", new String[]{"org.jsoup.parser.Token", "org.jsoup.parser.TreeBuilder"}, new String[]{"<sample:3>", "<sample:2>"}, false, 3, new String[][]{{"org.jsoup.parser.TreeBuilderState", "process", "org.jsoup.parser.Token,org.jsoup.parser.TreeBuilder", "<null>", "<sample:6>"}}, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput006() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jsoup.parser.TreeBuilderState", "org.jsoup.parser.TreeBuilderState$1", "process", new String[]{"org.jsoup.parser.Token", "org.jsoup.parser.TreeBuilder"}, new String[]{"<sample:4>", "<sample:2>"}, false, 3, new String[][]{{"org.jsoup.parser.TreeBuilderState", "process", "org.jsoup.parser.Token,org.jsoup.parser.TreeBuilder", "<null>", "<sample:6>"}, {"org.jsoup.parser.TreeBuilderState", "process", "org.jsoup.parser.Token,org.jsoup.parser.TreeBuilder", "<sample:7>", "<sample:5>"}}, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput007() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jsoup.parser.TreeBuilderState", "org.jsoup.parser.TreeBuilderState$1", "process", new String[]{"org.jsoup.parser.Token", "org.jsoup.parser.TreeBuilder"}, new String[]{"<sample:2>", "<sample:2>"}, false, 2, new String[][]{{"org.jsoup.parser.TreeBuilderState", "process", "org.jsoup.parser.Token,org.jsoup.parser.TreeBuilder", "<null>", "<sample:5>"}, {"org.jsoup.parser.TreeBuilderState", "process", "org.jsoup.parser.Token,org.jsoup.parser.TreeBuilder", "<sample:7>", "<sample:5>"}, {"org.jsoup.parser.TreeBuilderState", "process", "org.jsoup.parser.Token,org.jsoup.parser.TreeBuilder", "<sample:7>", "<sample:4>"}}, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput008() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jsoup.parser.TreeBuilderState", "org.jsoup.parser.TreeBuilderState$1", "process", new String[]{"org.jsoup.parser.Token", "org.jsoup.parser.TreeBuilder"}, new String[]{"<sample:3>", "<sample:4>"}, false, 1, new String[][]{{"org.jsoup.parser.TreeBuilderState", "process", "org.jsoup.parser.Token,org.jsoup.parser.TreeBuilder", "<sample:7>", "<sample:5>"}, {"org.jsoup.parser.TreeBuilderState", "process", "org.jsoup.parser.Token,org.jsoup.parser.TreeBuilder", "<sample:10>", "<sample:4>"}}, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput009() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jsoup.parser.TreeBuilderState", "org.jsoup.parser.TreeBuilderState$1", "process", new String[]{"org.jsoup.parser.Token", "org.jsoup.parser.TreeBuilder"}, new String[]{"<sample:1>", "<null>"}, false, 0, new String[][]{{"org.jsoup.parser.TreeBuilderState", "process", "org.jsoup.parser.Token,org.jsoup.parser.TreeBuilder", "<sample:1>", "<sample:4>"}, {"org.jsoup.parser.TreeBuilderState", "process", "org.jsoup.parser.Token,org.jsoup.parser.TreeBuilder", "<sample:0>", "<sample:5>"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput010() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jsoup.parser.TreeBuilderState", "org.jsoup.parser.TreeBuilderState$1", "process", new String[]{"org.jsoup.parser.Token", "org.jsoup.parser.TreeBuilder"}, new String[]{"<sample:0>", "<sample:2>"}, false, 0, new String[][]{{"org.jsoup.parser.TreeBuilderState", "process", "org.jsoup.parser.Token,org.jsoup.parser.TreeBuilder", "<sample:10>", "<sample:0>"}, {"org.jsoup.parser.TreeBuilderState", "process", "org.jsoup.parser.Token,org.jsoup.parser.TreeBuilder", "<sample:5>", "<sample:7>"}, {"org.jsoup.parser.TreeBuilderState", "process", "org.jsoup.parser.Token,org.jsoup.parser.TreeBuilder", "<sample:6>", "<sample:3>"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput011() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jsoup.parser.TreeBuilderState", "org.jsoup.parser.TreeBuilderState$1", "process", new String[]{"org.jsoup.parser.Token", "org.jsoup.parser.TreeBuilder"}, new String[]{"<sample:2>", "<sample:6>"}, false, 0, new String[][]{{"org.jsoup.parser.TreeBuilderState", "process", "org.jsoup.parser.Token,org.jsoup.parser.TreeBuilder", "<null>", "<sample:3>"}, {"org.jsoup.parser.TreeBuilderState", "process", "org.jsoup.parser.Token,org.jsoup.parser.TreeBuilder", "<sample:4>", "<sample:0>"}}, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput012() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jsoup.parser.TreeBuilderState", "org.jsoup.parser.TreeBuilderState$1", "process", new String[]{"org.jsoup.parser.Token", "org.jsoup.parser.TreeBuilder"}, new String[]{"<sample:6>", "<sample:4>"}, false, 11, new String[][]{{"org.jsoup.parser.TreeBuilderState", "process", "org.jsoup.parser.Token,org.jsoup.parser.TreeBuilder", "<sample:2>", "<sample:1>"}, {"org.jsoup.parser.TreeBuilderState", "process", "org.jsoup.parser.Token,org.jsoup.parser.TreeBuilder", "<sample:6>", "<sample:3>"}}, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput013() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jsoup.parser.TreeBuilderState", "org.jsoup.parser.TreeBuilderState$1", "process", new String[]{"org.jsoup.parser.Token", "org.jsoup.parser.TreeBuilder"}, new String[]{"<sample:5>", "<sample:3>"}, false, 11, new String[][]{{"org.jsoup.parser.TreeBuilderState", "process", "org.jsoup.parser.Token,org.jsoup.parser.TreeBuilder", "<sample:2>", "<sample:1>"}, {"org.jsoup.parser.TreeBuilderState", "process", "org.jsoup.parser.Token,org.jsoup.parser.TreeBuilder", "<sample:6>", "<sample:3>"}}, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput014() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jsoup.parser.TreeBuilderState", "org.jsoup.parser.TreeBuilderState$1", "process", new String[]{"org.jsoup.parser.Token", "org.jsoup.parser.TreeBuilder"}, new String[]{"<null>", "<sample:0>"}, false, 10, new String[][]{}, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput015() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jsoup.parser.TreeBuilderState", "org.jsoup.parser.TreeBuilderState$1", "valueOf", new String[]{"java.lang.String"}, new String[]{"y"}, true, 0, null, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput016() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jsoup.parser.TreeBuilderState", "org.jsoup.parser.TreeBuilderState$1", "valueOf", new String[]{"java.lang.String"}, new String[]{"WWbpx+d1selecstr]Abc"}, true, 0, null, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput017() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jsoup.parser.TreeBuilderState", "org.jsoup.parser.TreeBuilderState$1", "process", new String[]{"org.jsoup.parser.Token", "org.jsoup.parser.TreeBuilder"}, new String[]{"<sample:11>", "<sample:1>"}, false, 1, new String[][]{{"org.jsoup.parser.TreeBuilderState", "process", "org.jsoup.parser.Token,org.jsoup.parser.TreeBuilder", "<sample:6>", "<null>"}, {"org.jsoup.parser.TreeBuilderState", "process", "org.jsoup.parser.Token,org.jsoup.parser.TreeBuilder", "<sample:3>", "<sample:5>"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput018() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.parser.TreeBuilderState", "org.jsoup.parser.TreeBuilderState$1", "process", new String[]{"org.jsoup.parser.Token", "org.jsoup.parser.TreeBuilder"}, new String[]{"<sample:10>", "<sample:1>"}, false, 1, new String[][]{{"org.jsoup.parser.TreeBuilderState", "process", "org.jsoup.parser.Token,org.jsoup.parser.TreeBuilder", "<sample:6>", "<null>"}, {"org.jsoup.parser.TreeBuilderState", "process", "org.jsoup.parser.Token,org.jsoup.parser.TreeBuilder", "<sample:3>", "<sample:5>"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "null", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput019() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jsoup.parser.TreeBuilderState", "org.jsoup.parser.TreeBuilderState$1", "valueOf", new String[]{"java.lang.String"}, new String[]{"<null>"}, true); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput020() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.parser.TreeBuilderState", "org.jsoup.parser.TreeBuilderState$1", "process", new String[]{"org.jsoup.parser.Token", "org.jsoup.parser.TreeBuilder"}, new String[]{"<sample:10>", "<sample:5>"}, false, 8, new String[][]{{"org.jsoup.parser.TreeBuilderState", "process", "org.jsoup.parser.Token,org.jsoup.parser.TreeBuilder", "<sample:6>", "<sample:7>"}, {"org.jsoup.parser.TreeBuilderState", "process", "org.jsoup.parser.Token,org.jsoup.parser.TreeBuilder", "<sample:1>", "<sample:0>"}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "null", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput021() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jsoup.parser.TreeBuilderState", "org.jsoup.parser.TreeBuilderState$1", "valueOf", new String[]{"java.lang.String"}, new String[]{"123456789012345678901234567890"}, true, 0, null, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput022() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.parser.TreeBuilderState", "org.jsoup.parser.TreeBuilderState$1", "process", new String[]{"org.jsoup.parser.Token", "org.jsoup.parser.TreeBuilder"}, new String[]{"<sample:10>", "<sample:4>"}, false, 0, new String[][]{{"org.jsoup.parser.TreeBuilderState", "process", "org.jsoup.parser.Token,org.jsoup.parser.TreeBuilder", "<null>", "<sample:6>"}, {"org.jsoup.parser.TreeBuilderState", "process", "org.jsoup.parser.Token,org.jsoup.parser.TreeBuilder", "<sample:5>", "<sample:4>"}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "null", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput023() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.parser.TreeBuilderState", "org.jsoup.parser.TreeBuilderState$1", "values", new String[]{}, new String[]{}, true, 0, null, 2);
  assertNotNull(actual);
  assertEquals("[Lorg.jsoup.parser.TreeBuilderState;", actual.getClass().getName());
  assertEquals("[Initial, BeforeHtml, BeforeHead, InHead, InHeadNoscript, AfterHead, InBody, Text, InTable, InTableText, InCaption, InColumnGroup, InTableBody, InRow, InCell, InSelect, InSelectInTable, AfterBody, InF...#275#355538594", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput024() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.parser.TreeBuilderState", "org.jsoup.parser.TreeBuilderState$1", "values", new String[]{}, new String[]{}, true, 0, null, 3);
  assertNotNull(actual);
  assertEquals("[Lorg.jsoup.parser.TreeBuilderState;", actual.getClass().getName());
  assertEquals("[Initial, BeforeHtml, BeforeHead, InHead, InHeadNoscript, AfterHead, InBody, Text, InTable, InTableText, InCaption, InColumnGroup, InTableBody, InRow, InCell, InSelect, InSelectInTable, AfterBody, InF...#275#355538594", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput025() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.parser.TreeBuilderState", "org.jsoup.parser.TreeBuilderState$1", "process", new String[]{"org.jsoup.parser.Token", "org.jsoup.parser.TreeBuilder"}, new String[]{"<sample:10>", "<sample:6>"}, false, 0, new String[][]{{"org.jsoup.parser.TreeBuilderState", "process", "org.jsoup.parser.Token,org.jsoup.parser.TreeBuilder", "<sample:5>", "<sample:7>"}, {"org.jsoup.parser.TreeBuilderState", "process", "org.jsoup.parser.Token,org.jsoup.parser.TreeBuilder", "<sample:5>", "<sample:3>"}, {"org.jsoup.parser.TreeBuilderState", "process", "org.jsoup.parser.Token,org.jsoup.parser.TreeBuilder", "<sample:4>", "<sample:6>"}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "null", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput026() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jsoup.parser.TreeBuilderState", "org.jsoup.parser.TreeBuilderState$1", "valueOf", new String[]{"java.lang.String"}, new String[]{"<null>"}, true, 0, null, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput027() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.parser.TreeBuilderState", "org.jsoup.parser.TreeBuilderState$1", "values", new String[]{}, new String[]{}, true, 0, null, 1);
  assertNotNull(actual);
  assertEquals("[Lorg.jsoup.parser.TreeBuilderState;", actual.getClass().getName());
  assertEquals("[Initial, BeforeHtml, BeforeHead, InHead, InHeadNoscript, AfterHead, InBody, Text, InTable, InTableText, InCaption, InColumnGroup, InTableBody, InRow, InCell, InSelect, InSelectInTable, AfterBody, InF...#275#355538594", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput028() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.parser.TreeBuilderState", "org.jsoup.parser.TreeBuilderState$1", "process", new String[]{"org.jsoup.parser.Token", "org.jsoup.parser.TreeBuilder"}, new String[]{"<sample:18>", "<sample:1>"}, false, 10, new String[][]{{"org.jsoup.parser.TreeBuilderState", "process", "org.jsoup.parser.Token,org.jsoup.parser.TreeBuilder", "<sample:0>", "<sample:6>"}, {"org.jsoup.parser.TreeBuilderState", "process", "org.jsoup.parser.Token,org.jsoup.parser.TreeBuilder", "<sample:3>", "<sample:5>"}, {"org.jsoup.parser.TreeBuilderState", "process", "org.jsoup.parser.Token,org.jsoup.parser.TreeBuilder", "<sample:10>", "<sample:1>"}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
  assertEquals("receiver state after the call", "null", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput029() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.parser.TreeBuilderState", "org.jsoup.parser.TreeBuilderState$1", "process", new String[]{"org.jsoup.parser.Token", "org.jsoup.parser.TreeBuilder"}, new String[]{"<sample:18>", "<sample:2>"}, false, 10, new String[][]{{"org.jsoup.parser.TreeBuilderState", "process", "org.jsoup.parser.Token,org.jsoup.parser.TreeBuilder", "<sample:10>", "<sample:2>"}, {"org.jsoup.parser.TreeBuilderState", "process", "org.jsoup.parser.Token,org.jsoup.parser.TreeBuilder", "<sample:18>", "<sample:4>"}, {"org.jsoup.parser.TreeBuilderState", "process", "org.jsoup.parser.Token,org.jsoup.parser.TreeBuilder", "<sample:11>", "<sample:4>"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
  assertEquals("receiver state after the call", "null", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput030() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.parser.TreeBuilderState", "org.jsoup.parser.TreeBuilderState$1", "process", new String[]{"org.jsoup.parser.Token", "org.jsoup.parser.TreeBuilder"}, new String[]{"<sample:18>", "<sample:0>"}, false, 10, new String[][]{{"org.jsoup.parser.TreeBuilderState", "process", "org.jsoup.parser.Token,org.jsoup.parser.TreeBuilder", "<sample:21>", "<sample:4>"}, {"org.jsoup.parser.TreeBuilderState", "process", "org.jsoup.parser.Token,org.jsoup.parser.TreeBuilder", "<sample:10>", "<sample:1>"}, {"org.jsoup.parser.TreeBuilderState", "process", "org.jsoup.parser.Token,org.jsoup.parser.TreeBuilder", "<sample:11>", "<sample:4>"}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
  assertEquals("receiver state after the call", "null", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput031() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jsoup.parser.TreeBuilderState", "org.jsoup.parser.TreeBuilderState$1", "valueOf", new String[]{"java.lang.String"}, new String[]{"<null>"}, true, 0, null, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput032() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jsoup.parser.TreeBuilderState", "org.jsoup.parser.TreeBuilderState$1", "valueOf", new String[]{"java.lang.String"}, new String[]{"<null>"}, true, 0, null, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
}
