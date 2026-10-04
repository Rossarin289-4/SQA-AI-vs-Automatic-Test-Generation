package generated.algorithm;

import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;
import static org.junit.Assert.*;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class SimulatedAnnealingGeneratedTest {
 @Test(timeout = 20000)
 public void generatedInput000() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.parser.Token", "org.jsoup.parser.Token$Character", "reset", new String[]{}, new String[]{}, false, 7, new String[][]{{"org.jsoup.parser.Token", "isStartTag", ""}});
  assertNotNull(actual);
  assertEquals("org.jsoup.parser.Token$Character", actual.getClass().getName());
  assertEquals("null", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "null", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput001() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.parser.Token", "org.jsoup.parser.Token$Character", "reset", new String[]{}, new String[]{}, false, 10, new String[][]{}, 3);
  assertNotNull(actual);
  assertEquals("org.jsoup.parser.Token$Character", actual.getClass().getName());
  assertEquals("null", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "null", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput002() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jsoup.parser.Token", "org.jsoup.parser.Token$Character", "asEndTag", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.jsoup.parser.Token", "asDoctype", ""}}, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.ClassCastException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput003() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.parser.Token", "org.jsoup.parser.Token$Character", "isEOF", new String[]{}, new String[]{}, false, 0, null, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "null", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput004() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jsoup.parser.Token", "org.jsoup.parser.Token$Character", "asEndTag", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.jsoup.parser.Token", "asComment", ""}, {"org.jsoup.parser.Token", "asEndTag", ""}}, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.ClassCastException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput005() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jsoup.parser.Token", "org.jsoup.parser.Token$Character", "asEndTag", new String[]{}, new String[]{}, false, 1, new String[][]{{"org.jsoup.parser.Token", "asEndTag", ""}, {"org.jsoup.parser.Token", "isEndTag", ""}}, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.ClassCastException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput006() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jsoup.parser.Token", "org.jsoup.parser.Token$Character", "asStartTag", new String[]{}, new String[]{}, false); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.ClassCastException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput007() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jsoup.parser.Token", "org.jsoup.parser.Token$Character", "asComment", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.jsoup.parser.Token", "asComment", ""}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.ClassCastException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput008() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.parser.Token", "org.jsoup.parser.Token$Character", "isStartTag", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.jsoup.parser.Token", "isEOF", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "null", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput009() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.parser.Token", "org.jsoup.parser.Token$Character", "isCharacter", new String[]{}, new String[]{}, false, 0, null, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
  assertEquals("receiver state after the call", "null", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput010() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.parser.Token", "org.jsoup.parser.Token$Character", "isEOF", new String[]{}, new String[]{}, false);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "null", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput011() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.parser.Token", "org.jsoup.parser.Token$Character", "isCharacter", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.jsoup.parser.Token", "reset", ""}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
  assertEquals("receiver state after the call", "null", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput012() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jsoup.parser.Token", "org.jsoup.parser.Token$Character", "asStartTag", new String[]{}, new String[]{}, false, 5, new String[][]{}, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.ClassCastException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput013() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.parser.Token", "org.jsoup.parser.Token$Character", "reset", new String[]{"java.lang.StringBuilder"}, new String[]{"<sample:3>"}, true);
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput014() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.parser.Token", "org.jsoup.parser.Token$Character", "reset", new String[]{"java.lang.StringBuilder"}, new String[]{"<sample:2>"}, true, 0, null, 2);
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput015() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.parser.Token", "org.jsoup.parser.Token$Character", "reset", new String[]{"java.lang.StringBuilder"}, new String[]{"<null>"}, true, 0, null, 2);
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput016() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jsoup.parser.Token", "org.jsoup.parser.Token$Character", "asComment", new String[]{}, new String[]{}, false, 4, new String[][]{{"org.jsoup.parser.Token", "asEndTag", ""}}, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.ClassCastException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput017() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jsoup.parser.Token", "org.jsoup.parser.Token$Character", "asDoctype", new String[]{}, new String[]{}, false); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.ClassCastException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput018() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jsoup.parser.Token", "org.jsoup.parser.Token$Character", "asDoctype", new String[]{}, new String[]{}, false, 5, new String[][]{{"org.jsoup.parser.Token", "tokenType", ""}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.ClassCastException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput019() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jsoup.parser.Token", "org.jsoup.parser.Token$Character", "asDoctype", new String[]{}, new String[]{}, false, 6, new String[][]{{"org.jsoup.parser.Token", "asCharacter", ""}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.ClassCastException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput020() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.parser.Token", "org.jsoup.parser.Token$Character", "isCharacter", new String[]{}, new String[]{}, false);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
  assertEquals("receiver state after the call", "null", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput021() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.parser.Token", "org.jsoup.parser.Token$Character", "tokenType", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.jsoup.parser.Token", "asCharacter", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("Character", String.valueOf(actual));
  assertEquals("receiver state after the call", "null", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput022() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.parser.Token", "org.jsoup.parser.Token$Character", "tokenType", new String[]{}, new String[]{}, false, 4, new String[][]{{"org.jsoup.parser.Token", "asComment", ""}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("Character", String.valueOf(actual));
  assertEquals("receiver state after the call", "null", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput023() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.parser.Token", "org.jsoup.parser.Token$Character", "isDoctype", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.jsoup.parser.Token", "tokenType", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "null", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput024() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.parser.Token", "org.jsoup.parser.Token$Character", "isDoctype", new String[]{}, new String[]{}, false, 6, new String[][]{{"org.jsoup.parser.Token", "asComment", ""}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "null", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput025() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.parser.Token", "org.jsoup.parser.Token$Character", "isStartTag", new String[]{}, new String[]{}, false, 11, new String[][]{{"org.jsoup.parser.Token", "isDoctype", ""}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "null", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput026() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.parser.Token", "org.jsoup.parser.Token$Character", "isStartTag", new String[]{}, new String[]{}, false, 20, new String[][]{{"org.jsoup.parser.Token", "isStartTag", ""}, {"org.jsoup.parser.Token", "asComment", ""}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "null", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput027() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.parser.Token", "org.jsoup.parser.Token$Character", "asCharacter", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.jsoup.parser.Token", "asCharacter", ""}});
  assertNotNull(actual);
  assertEquals("org.jsoup.parser.Token$Character", actual.getClass().getName());
  assertEquals("null", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "null", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput028() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.parser.Token", "org.jsoup.parser.Token$Character", "isEOF", new String[]{}, new String[]{}, false, 0, null, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "null", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput029() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.parser.Token", "org.jsoup.parser.Token$Character", "isCharacter", new String[]{}, new String[]{}, false, 11, new String[][]{{"org.jsoup.parser.Token", "isComment", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
  assertEquals("receiver state after the call", "null", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput030() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.parser.Token", "org.jsoup.parser.Token$Character", "reset", new String[]{}, new String[]{}, false, 0, null, 2);
  assertNotNull(actual);
  assertEquals("org.jsoup.parser.Token$Character", actual.getClass().getName());
  assertEquals("null", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "null", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput031() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.parser.Token", "org.jsoup.parser.Token$Character", "isEOF", new String[]{}, new String[]{}, false, 0, null, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "null", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput032() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jsoup.parser.Token", "org.jsoup.parser.Token$Character", "asComment", new String[]{}, new String[]{}, false, 3, new String[][]{{"org.jsoup.parser.Token", "tokenType", ""}, {"org.jsoup.parser.Token", "isEOF", ""}, {"org.jsoup.parser.Token", "isComment", ""}}, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.ClassCastException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput033() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jsoup.parser.Token", "org.jsoup.parser.Token$Character", "asDoctype", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.jsoup.parser.Token", "isDoctype", ""}}, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.ClassCastException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput034() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jsoup.parser.Token", "org.jsoup.parser.Token$Character", "asDoctype", new String[]{}, new String[]{}, false, 1, new String[][]{{"org.jsoup.parser.Token", "asCharacter", ""}, {"org.jsoup.parser.Token", "isCharacter", ""}}, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.ClassCastException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput035() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.parser.Token", "org.jsoup.parser.Token$Character", "reset", new String[]{"java.lang.StringBuilder"}, new String[]{"<sample:0>"}, true, 0, null, 3);
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput036() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.parser.Token", "org.jsoup.parser.Token$Character", "isStartTag", new String[]{}, new String[]{}, false, 7, new String[][]{}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "null", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput037() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.parser.Token", "org.jsoup.parser.Token$Character", "isComment", new String[]{}, new String[]{}, false, 0, null, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "null", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput038() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jsoup.parser.Token", "org.jsoup.parser.Token$Character", "asEndTag", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.jsoup.parser.Token", "asEndTag", ""}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.ClassCastException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput039() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.parser.Token", "org.jsoup.parser.Token$Character", "reset", new String[]{"java.lang.StringBuilder"}, new String[]{"<sample:2>"}, true, 0, null, 1);
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput040() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jsoup.parser.Token", "org.jsoup.parser.Token$Character", "asDoctype", new String[]{}, new String[]{}, false, 14, new String[][]{{"org.jsoup.parser.Token", "asComment", ""}, {"org.jsoup.parser.Token", "isEndTag", ""}}, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.ClassCastException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput041() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.parser.Token", "org.jsoup.parser.Token$Character", "isDoctype", new String[]{}, new String[]{}, false, 2, new String[][]{}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "null", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput042() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.parser.Token", "org.jsoup.parser.Token$Character", "tokenType", new String[]{}, new String[]{}, false, 25, new String[][]{{"org.jsoup.parser.Token", "isComment", ""}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("Character", String.valueOf(actual));
  assertEquals("receiver state after the call", "null", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput043() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.parser.Token", "org.jsoup.parser.Token$Character", "isEndTag", new String[]{}, new String[]{}, false);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "null", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput044() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.parser.Token", "org.jsoup.parser.Token$Character", "isEndTag", new String[]{}, new String[]{}, false, 10, new String[][]{{"org.jsoup.parser.Token", "asEndTag", ""}, {"org.jsoup.parser.Token", "asDoctype", ""}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "null", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput045() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.parser.Token", "org.jsoup.parser.Token$Character", "isEndTag", new String[]{}, new String[]{}, false, 2, new String[][]{}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "null", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput046() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jsoup.parser.Token", "org.jsoup.parser.Token$Character", "asStartTag", new String[]{}, new String[]{}, false, 0, null, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.ClassCastException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput047() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.parser.Token", "org.jsoup.parser.Token$Character", "isCharacter", new String[]{}, new String[]{}, false, 0, null, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
  assertEquals("receiver state after the call", "null", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput048() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.parser.Token", "org.jsoup.parser.Token$Character", "isComment", new String[]{}, new String[]{}, false);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "null", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput049() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.parser.Token", "org.jsoup.parser.Token$Character", "isComment", new String[]{}, new String[]{}, false, 4, new String[][]{{"org.jsoup.parser.Token", "asComment", ""}, {"org.jsoup.parser.Token", "asDoctype", ""}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "null", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput050() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.parser.Token", "org.jsoup.parser.Token$Character", "asCharacter", new String[]{}, new String[]{}, false, 1, new String[][]{}, 2);
  assertNotNull(actual);
  assertEquals("org.jsoup.parser.Token$Character", actual.getClass().getName());
  assertEquals("null", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "null", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput051() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.parser.Token", "org.jsoup.parser.Token$Character", "asCharacter", new String[]{}, new String[]{}, false, 17, new String[][]{{"org.jsoup.parser.Token", "asStartTag", ""}}, 3);
  assertNotNull(actual);
  assertEquals("org.jsoup.parser.Token$Character", actual.getClass().getName());
  assertEquals("null", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "null", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput052() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jsoup.parser.Token", "org.jsoup.parser.Token$Character", "asEndTag", new String[]{}, new String[]{}, false, 6, new String[][]{{"org.jsoup.parser.Token", "asStartTag", ""}}, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.ClassCastException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput053() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.parser.Token", "org.jsoup.parser.Token$Character", "isEndTag", new String[]{}, new String[]{}, false, 10, new String[][]{{"org.jsoup.parser.Token", "isStartTag", ""}, {"org.jsoup.parser.Token", "asCharacter", ""}, {"org.jsoup.parser.Token", "isDoctype", ""}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "null", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput054() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.parser.Token", "org.jsoup.parser.Token$Character", "isDoctype", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.jsoup.parser.Token", "isStartTag", ""}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "null", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput055() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.parser.Token", "org.jsoup.parser.Token$Character", "reset", new String[]{}, new String[]{}, false, 10, new String[][]{{"org.jsoup.parser.Token", "asStartTag", ""}, {"org.jsoup.parser.Token", "asEndTag", ""}}, 1);
  assertNotNull(actual);
  assertEquals("org.jsoup.parser.Token$Character", actual.getClass().getName());
  assertEquals("null", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "null", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput056() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jsoup.parser.Token", "org.jsoup.parser.Token$Character", "asComment", new String[]{}, new String[]{}, false, 3, new String[][]{{"org.jsoup.parser.Token", "asCharacter", ""}}, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.ClassCastException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput057() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jsoup.parser.Token", "org.jsoup.parser.Token$Character", "asStartTag", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.jsoup.parser.Token", "isComment", ""}, {"org.jsoup.parser.Token", "asCharacter", ""}}, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.ClassCastException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput058() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.parser.Token", "org.jsoup.parser.Token$Character", "asCharacter", new String[]{}, new String[]{}, false, 13, new String[][]{{"org.jsoup.parser.Token", "isEndTag", ""}, {"org.jsoup.parser.Token", "asStartTag", ""}}, 1);
  assertNotNull(actual);
  assertEquals("org.jsoup.parser.Token$Character", actual.getClass().getName());
  assertEquals("null", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "null", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput059() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.parser.Token", "org.jsoup.parser.Token$Character", "isComment", new String[]{}, new String[]{}, false, 8, new String[][]{}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "null", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput060() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.parser.Token", "org.jsoup.parser.Token$Character", "tokenType", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.jsoup.parser.Token", "isComment", ""}, {"org.jsoup.parser.Token", "asCharacter", ""}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("Character", String.valueOf(actual));
  assertEquals("receiver state after the call", "null", SearchInputFactory_scaffolding.receiverState());
 }
}
