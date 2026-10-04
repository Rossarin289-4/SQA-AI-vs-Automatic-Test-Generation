package generated.algorithm;

import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;
import static org.junit.Assert.*;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class SimulatedAnnealingGeneratedTest {
 @Test(timeout = 20000)
 public void generatedInput000() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.parser.Tokeniser", "org.jsoup.parser.Tokeniser", "createCommentPending", new String[]{}, new String[]{}, false);
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput001() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.parser.Tokeniser", "org.jsoup.parser.Tokeniser", "createCommentPending", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.jsoup.parser.Tokeniser", "emit", "org.jsoup.parser.Token", "<sample:1>"}});
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput002() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.parser.Tokeniser", "org.jsoup.parser.Tokeniser", "createCommentPending", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.jsoup.parser.Tokeniser", "createDoctypePending", ""}, {"org.jsoup.parser.Tokeniser", "emit", "org.jsoup.parser.Token", "<sample:0>"}});
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput003() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jsoup.parser.Tokeniser", "org.jsoup.parser.Tokeniser", "emitTagPending", new String[]{}, new String[]{}, false, 0, null, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput004() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.parser.Tokeniser", "org.jsoup.parser.Tokeniser", "createCommentPending", new String[]{}, new String[]{}, false, 5, new String[][]{{"org.jsoup.parser.Tokeniser", "emit", "org.jsoup.parser.Token", "<sample:0>"}, {"org.jsoup.parser.Tokeniser", "read", ""}});
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput005() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.parser.Tokeniser", "org.jsoup.parser.Tokeniser", "createTagPending", new String[]{"boolean"}, new String[]{"false"}, false);
  assertNotNull(actual);
  assertEquals("org.jsoup.parser.Token$EndTag", actual.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput006() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.parser.Tokeniser", "org.jsoup.parser.Tokeniser", "createTagPending", new String[]{"boolean"}, new String[]{"true"}, false);
  assertNotNull(actual);
  assertEquals("org.jsoup.parser.Token$StartTag", actual.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput007() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.parser.Tokeniser", "org.jsoup.parser.Tokeniser", "createTagPending", new String[]{"boolean"}, new String[]{"true"}, false, 0, new String[][]{{"org.jsoup.parser.Tokeniser", "consumeCharacterReference", "java.lang.Character,boolean", "0", "false"}});
  assertNotNull(actual);
  assertEquals("org.jsoup.parser.Token$StartTag", actual.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput008() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jsoup.parser.Tokeniser", "org.jsoup.parser.Tokeniser", "isAppropriateEndTagToken", new String[]{}, new String[]{}, false); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput009() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jsoup.parser.Tokeniser", "org.jsoup.parser.Tokeniser", "isAppropriateEndTagToken", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.jsoup.parser.Tokeniser", "getState", ""}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput010() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jsoup.parser.Tokeniser", "org.jsoup.parser.Tokeniser", "emitCommentPending", new String[]{}, new String[]{}, false); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput011() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.parser.Tokeniser", "org.jsoup.parser.Tokeniser", "transition", new String[]{"org.jsoup.parser.TokeniserState"}, new String[]{"<null>"}, false, 0, new String[][]{{"org.jsoup.parser.Tokeniser", "isAppropriateEndTagToken", ""}});
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput012() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.parser.Tokeniser", "org.jsoup.parser.Tokeniser", "transition", new String[]{"org.jsoup.parser.TokeniserState"}, new String[]{"<null>"}, false, 0, new String[][]{{"org.jsoup.parser.Tokeniser", "isAppropriateEndTagToken", ""}, {"org.jsoup.parser.Tokeniser", "acknowledgeSelfClosingFlag", ""}});
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput013() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.parser.Tokeniser", "org.jsoup.parser.Tokeniser", "createDoctypePending", new String[]{}, new String[]{}, false);
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput014() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.parser.Tokeniser", "org.jsoup.parser.Tokeniser", "emit", new String[]{"org.jsoup.parser.Token"}, new String[]{"<sample:1>"}, false);
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput015() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.parser.Tokeniser", "org.jsoup.parser.Tokeniser", "emit", new String[]{"org.jsoup.parser.Token"}, new String[]{"<sample:1>"}, false, 0, null, 3);
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput016() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.parser.Tokeniser", "org.jsoup.parser.Tokeniser", "emit", new String[]{"org.jsoup.parser.Token"}, new String[]{"<sample:4>"}, false, 0, null, 3);
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput017() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.parser.Tokeniser", "org.jsoup.parser.Tokeniser", "emit", new String[]{"org.jsoup.parser.Token"}, new String[]{"<sample:1>"}, false, 6, new String[][]{{"org.jsoup.parser.Tokeniser", "error", "org.jsoup.parser.TokeniserState", "<sample:7>"}, {"org.jsoup.parser.Tokeniser", "isAppropriateEndTagToken", ""}}, 3);
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput018() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.parser.Tokeniser", "org.jsoup.parser.Tokeniser", "emit", new String[]{"org.jsoup.parser.Token"}, new String[]{"<sample:1>"}, false, 1, new String[][]{{"org.jsoup.parser.Tokeniser", "emit", "char", " "}, {"org.jsoup.parser.Tokeniser", "error", "org.jsoup.parser.TokeniserState", "<sample:7>"}, {"org.jsoup.parser.Tokeniser", "isAppropriateEndTagToken", ""}});
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput019() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.parser.Tokeniser", "org.jsoup.parser.Tokeniser", "emit", new String[]{"org.jsoup.parser.Token"}, new String[]{"<sample:1>"}, false, 1, new String[][]{{"org.jsoup.parser.Tokeniser", "advanceTransition", "org.jsoup.parser.TokeniserState", "<sample:2>"}, {"org.jsoup.parser.Tokeniser", "isAppropriateEndTagToken", ""}});
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput020() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.parser.Tokeniser", "org.jsoup.parser.Tokeniser", "emit", new String[]{"org.jsoup.parser.Token"}, new String[]{"<sample:5>"}, false, 1, new String[][]{{"org.jsoup.parser.Tokeniser", "acknowledgeSelfClosingFlag", ""}, {"org.jsoup.parser.Tokeniser", "advanceTransition", "org.jsoup.parser.TokeniserState", "<sample:4>"}});
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput021() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.parser.Tokeniser", "org.jsoup.parser.Tokeniser", "emit", new String[]{"org.jsoup.parser.Token"}, new String[]{"<sample:6>"}, false, 1, new String[][]{{"org.jsoup.parser.Tokeniser", "emit", "java.lang.String", "TITLE"}});
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput022() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.parser.Tokeniser", "org.jsoup.parser.Tokeniser", "emit", new String[]{"org.jsoup.parser.Token"}, new String[]{"<sample:5>"}, false, 1, new String[][]{{"org.jsoup.parser.Tokeniser", "emit", "java.lang.String", "TITLE"}}, 1);
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput023() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jsoup.parser.Tokeniser", "org.jsoup.parser.Tokeniser", "emitDoctypePending", new String[]{}, new String[]{}, false); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput024() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jsoup.parser.Tokeniser", "org.jsoup.parser.Tokeniser", "emitDoctypePending", new String[]{}, new String[]{}, false, 2, new String[][]{{"org.jsoup.parser.Tokeniser", "emit", "char", "X"}}, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput025() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jsoup.parser.Tokeniser", "org.jsoup.parser.Tokeniser", "emitDoctypePending", new String[]{}, new String[]{}, false, 3, new String[][]{{"org.jsoup.parser.Tokeniser", "currentNodeInHtmlNS", ""}, {"org.jsoup.parser.Tokeniser", "emit", "char", "X"}}, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput026() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.parser.Tokeniser", "org.jsoup.parser.Tokeniser", "createCommentPending", new String[]{}, new String[]{}, false, 5, new String[][]{{"org.jsoup.parser.Tokeniser", "createDoctypePending", ""}, {"org.jsoup.parser.Tokeniser", "emit", "char", "0"}, {"org.jsoup.parser.Tokeniser", "eofError", "org.jsoup.parser.TokeniserState", "<sample:5>"}});
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput027() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.parser.Tokeniser", "org.jsoup.parser.Tokeniser", "emit", new String[]{"org.jsoup.parser.Token"}, new String[]{"<sample:5>"}, false, 0, new String[][]{{"org.jsoup.parser.Tokeniser", "createTempBuffer", ""}});
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput028() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jsoup.parser.Tokeniser", "org.jsoup.parser.Tokeniser", "emit", new String[]{"org.jsoup.parser.Token"}, new String[]{"<null>"}, false, 0, new String[][]{{"org.jsoup.parser.Tokeniser", "createTempBuffer", ""}, {"org.jsoup.parser.Tokeniser", "createDoctypePending", ""}}, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput029() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.parser.Tokeniser", "org.jsoup.parser.Tokeniser", "emitTagPending", new String[]{}, new String[]{}, false, 4, new String[][]{{"org.jsoup.parser.Tokeniser", "createTagPending", "boolean", "true"}});
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput030() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.parser.Tokeniser", "org.jsoup.parser.Tokeniser", "emit", new String[]{"java.lang.String"}, new String[]{"abc"}, false);
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput031() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.parser.Tokeniser", "org.jsoup.parser.Tokeniser", "emit", new String[]{"java.lang.String"}, new String[]{"+uc"}, false, 0, new String[][]{{"org.jsoup.parser.Tokeniser", "isTrackErrors", ""}, {"org.jsoup.parser.Tokeniser", "getState", ""}});
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput032() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.parser.TokeniserState", "org.jsoup.parser.TokeniserState$1", "read", new String[]{"org.jsoup.parser.Tokeniser", "org.jsoup.parser.CharacterReader"}, new String[]{"<sample:0>", "<sample:7>"}, false, 5, new String[][]{{"org.jsoup.parser.TokeniserState", "read", "org.jsoup.parser.Tokeniser,org.jsoup.parser.CharacterReader", "<sample:2>", "<sample:0>"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "null", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput033() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.parser.TokeniserState", "org.jsoup.parser.TokeniserState$1", "read", new String[]{"org.jsoup.parser.Tokeniser", "org.jsoup.parser.CharacterReader"}, new String[]{"<sample:0>", "<sample:5>"}, false, 5, new String[][]{{"org.jsoup.parser.TokeniserState", "read", "org.jsoup.parser.Tokeniser,org.jsoup.parser.CharacterReader", "<sample:5>", "<sample:5>"}, {"org.jsoup.parser.TokeniserState", "read", "org.jsoup.parser.Tokeniser,org.jsoup.parser.CharacterReader", "<sample:2>", "<sample:0>"}}, 2);
  assertNull(actual);
  assertEquals("receiver state after the call", "null", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput034() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jsoup.parser.Tokeniser", "org.jsoup.parser.Tokeniser", "appropriateEndTagName", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.jsoup.parser.Tokeniser", "emitTagPending", ""}, {"org.jsoup.parser.Tokeniser", "consumeCharacterReference", "java.lang.Character,boolean", "<null>", "true"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput035() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jsoup.parser.Tokeniser", "org.jsoup.parser.Tokeniser", "appropriateEndTagName", new String[]{}, new String[]{}, false, 1, new String[][]{{"org.jsoup.parser.Tokeniser", "emitTagPending", ""}, {"org.jsoup.parser.Tokeniser", "consumeCharacterReference", "java.lang.Character,boolean", "<null>", "true"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput036() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jsoup.parser.Tokeniser", "org.jsoup.parser.Tokeniser", "appropriateEndTagName", new String[]{}, new String[]{}, false, 1, new String[][]{{"org.jsoup.parser.Tokeniser", "emitTagPending", ""}, {"org.jsoup.parser.Tokeniser", "consumeCharacterReference", "java.lang.Character,boolean", ";", "true"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput037() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jsoup.parser.Tokeniser", "org.jsoup.parser.Tokeniser", "appropriateEndTagName", new String[]{}, new String[]{}, false, 1, new String[][]{{"org.jsoup.parser.Tokeniser", "emitTagPending", ""}, {"org.jsoup.parser.Tokeniser", "consumeCharacterReference", "java.lang.Character,boolean", ";", "true"}}, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput038() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jsoup.parser.Tokeniser", "org.jsoup.parser.Tokeniser", "appropriateEndTagName", new String[]{}, new String[]{}, false, 2, new String[][]{{"org.jsoup.parser.Tokeniser", "emitTagPending", ""}, {"org.jsoup.parser.Tokeniser", "consumeCharacterReference", "java.lang.Character,boolean", ";", "true"}}, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput039() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jsoup.parser.Tokeniser", "org.jsoup.parser.Tokeniser", "emitCommentPending", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.jsoup.parser.Tokeniser", "emit", "org.jsoup.parser.Token", "<sample:2>"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput040() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.parser.Tokeniser", "org.jsoup.parser.Tokeniser", "emit", new String[]{"char"}, new String[]{"X"}, false);
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput041() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.parser.Tokeniser", "org.jsoup.parser.Tokeniser", "createTempBuffer", new String[]{}, new String[]{}, false);
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput042() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.parser.Tokeniser", "org.jsoup.parser.Tokeniser", "createTempBuffer", new String[]{}, new String[]{}, false, 8, new String[][]{}, 3);
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput043() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.parser.Tokeniser", "org.jsoup.parser.Tokeniser", "createTagPending", new String[]{"boolean"}, new String[]{"false"}, false, 0, new String[][]{{"org.jsoup.parser.Tokeniser", "read", ""}}, 1);
  assertNotNull(actual);
  assertEquals("org.jsoup.parser.Token$EndTag", actual.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput044() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.parser.Tokeniser", "org.jsoup.parser.Tokeniser", "error", new String[]{"org.jsoup.parser.TokeniserState"}, new String[]{"<sample:7>"}, false);
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput045() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.parser.Tokeniser", "org.jsoup.parser.Tokeniser", "getState", new String[]{}, new String[]{}, false);
  assertNotNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput046() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.parser.Tokeniser", "org.jsoup.parser.Tokeniser", "consumeCharacterReference", new String[]{"java.lang.Character", "boolean"}, new String[]{"\uffff", "true"}, false);
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput047() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.parser.Tokeniser", "org.jsoup.parser.Tokeniser", "consumeCharacterReference", new String[]{"java.lang.Character", "boolean"}, new String[]{"[", "true"}, false, 1, new String[][]{{"org.jsoup.parser.Tokeniser", "emitTagPending", ""}, {"org.jsoup.parser.Tokeniser", "read", ""}, {"org.jsoup.parser.Tokeniser", "setTrackErrors", "boolean", "false"}});
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput048() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.parser.Tokeniser", "org.jsoup.parser.Tokeniser", "consumeCharacterReference", new String[]{"java.lang.Character", "boolean"}, new String[]{"[", "true"}, false, 1, new String[][]{{"org.jsoup.parser.Tokeniser", "emitTagPending", ""}, {"org.jsoup.parser.Tokeniser", "read", ""}}, 1);
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput049() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jsoup.parser.TokeniserState", "org.jsoup.parser.TokeniserState$1", "read", new String[]{"org.jsoup.parser.Tokeniser", "org.jsoup.parser.CharacterReader"}, new String[]{"<sample:0>", "<null>"}, false, 1, new String[][]{{"org.jsoup.parser.TokeniserState", "read", "org.jsoup.parser.Tokeniser,org.jsoup.parser.CharacterReader", "<sample:4>", "<sample:3>"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput050() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.parser.TokeniserState", "org.jsoup.parser.TokeniserState$1", "values", new String[]{}, new String[]{}, true);
  assertNotNull(actual);
  assertEquals("[Lorg.jsoup.parser.TokeniserState;", actual.getClass().getName());
  assertEquals("[Data, CharacterReferenceInData, Rcdata, CharacterReferenceInRcdata, Rawtext, ScriptData, PLAINTEXT, TagOpen, EndTagOpen, TagName, RcdataLessthanSign, RCDATAEndTagOpen, RCDATAEndTagName, RawtextLessth...#1490#-1802059412", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput051() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jsoup.parser.Tokeniser", "org.jsoup.parser.Tokeniser", "emitDoctypePending", new String[]{}, new String[]{}, false, 6, new String[][]{}, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput052() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jsoup.parser.Tokeniser", "org.jsoup.parser.Tokeniser", "emitDoctypePending", new String[]{}, new String[]{}, false, 11, new String[][]{{"org.jsoup.parser.Tokeniser", "read", ""}}, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput053() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.parser.Tokeniser", "org.jsoup.parser.Tokeniser", "setTrackErrors", new String[]{"boolean"}, new String[]{"false"}, false);
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput054() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.parser.Tokeniser", "org.jsoup.parser.Tokeniser", "isTrackErrors", new String[]{}, new String[]{}, false);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput055() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.parser.Tokeniser", "org.jsoup.parser.Tokeniser", "read", new String[]{}, new String[]{}, false, 3, new String[][]{{"org.jsoup.parser.Tokeniser", "emit", "org.jsoup.parser.Token", "<sample:4>"}}, 2);
  assertNotNull(actual);
  assertEquals("org.jsoup.parser.Token$EndTag", actual.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput056() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.parser.Tokeniser", "org.jsoup.parser.Tokeniser", "read", new String[]{}, new String[]{}, false, 5, new String[][]{}, 2);
  assertNotNull(actual);
  assertEquals("org.jsoup.parser.Token$Character", actual.getClass().getName());
  assertEquals("sample", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput057() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.parser.Tokeniser", "org.jsoup.parser.Tokeniser", "read", new String[]{}, new String[]{}, false, 4, new String[][]{}, 2);
  assertNotNull(actual);
  assertEquals("org.jsoup.parser.Token$Character", actual.getClass().getName());
  assertEquals("0", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput058() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.parser.Tokeniser", "org.jsoup.parser.Tokeniser", "read", new String[]{}, new String[]{}, false, 4, new String[][]{});
  assertNotNull(actual);
  assertEquals("org.jsoup.parser.Token$Character", actual.getClass().getName());
  assertEquals("0", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput059() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.parser.Tokeniser", "org.jsoup.parser.Tokeniser", "read", new String[]{}, new String[]{}, false, 6, new String[][]{{"org.jsoup.parser.Tokeniser", "createTempBuffer", ""}}, 2);
  assertNotNull(actual);
  assertEquals("org.jsoup.parser.Token$EOF", actual.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput060() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.parser.Tokeniser", "org.jsoup.parser.Tokeniser", "read", new String[]{}, new String[]{}, false, 7, new String[][]{{"org.jsoup.parser.Tokeniser", "createTempBuffer", ""}}, 2);
  assertNotNull(actual);
  assertEquals("org.jsoup.parser.Token$Character", actual.getClass().getName());
  assertEquals("a", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput061() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.parser.Tokeniser", "org.jsoup.parser.Tokeniser", "read", new String[]{}, new String[]{}, false, 13, new String[][]{{"org.jsoup.parser.Tokeniser", "error", "org.jsoup.parser.TokeniserState", "<sample:0>"}, {"org.jsoup.parser.Tokeniser", "createTempBuffer", ""}});
  assertNotNull(actual);
  assertEquals("org.jsoup.parser.Token$Character", actual.getClass().getName());
  assertEquals("sample", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput062() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.parser.Tokeniser", "org.jsoup.parser.Tokeniser", "read", new String[]{}, new String[]{}, false, 14, new String[][]{{"org.jsoup.parser.Tokeniser", "error", "org.jsoup.parser.TokeniserState", "<sample:0>"}, {"org.jsoup.parser.Tokeniser", "createTempBuffer", ""}});
  assertNotNull(actual);
  assertEquals("org.jsoup.parser.Token$EOF", actual.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput063() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.parser.Tokeniser", "org.jsoup.parser.Tokeniser", "read", new String[]{}, new String[]{}, false, 11, new String[][]{{"org.jsoup.parser.Tokeniser", "error", "org.jsoup.parser.TokeniserState", "<sample:5>"}, {"org.jsoup.parser.Tokeniser", "emitTagPending", ""}, {"org.jsoup.parser.Tokeniser", "createTempBuffer", ""}});
  assertNotNull(actual);
  assertEquals("org.jsoup.parser.Token$Character", actual.getClass().getName());
  assertEquals("a", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput064() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.parser.Tokeniser", "org.jsoup.parser.Tokeniser", "read", new String[]{}, new String[]{}, false, 11, new String[][]{{"org.jsoup.parser.Tokeniser", "eofError", "org.jsoup.parser.TokeniserState", "<sample:3>"}, {"org.jsoup.parser.Tokeniser", "advanceTransition", "org.jsoup.parser.TokeniserState", "<sample:3>"}}, 2);
  assertNotNull(actual);
  assertEquals("org.jsoup.parser.Token$Character", actual.getClass().getName());
  assertEquals("&", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput065() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.parser.Tokeniser", "org.jsoup.parser.Tokeniser", "read", new String[]{}, new String[]{}, false, 13, new String[][]{{"org.jsoup.parser.Tokeniser", "eofError", "org.jsoup.parser.TokeniserState", "<sample:3>"}, {"org.jsoup.parser.Tokeniser", "advanceTransition", "org.jsoup.parser.TokeniserState", "<sample:3>"}}, 2);
  assertNotNull(actual);
  assertEquals("org.jsoup.parser.Token$Character", actual.getClass().getName());
  assertEquals("&le", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput066() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.parser.Tokeniser", "org.jsoup.parser.Tokeniser", "read", new String[]{}, new String[]{}, false, 13, new String[][]{{"org.jsoup.parser.Tokeniser", "eofError", "org.jsoup.parser.TokeniserState", "<sample:3>"}, {"org.jsoup.parser.Tokeniser", "advanceTransition", "org.jsoup.parser.TokeniserState", "<sample:3>"}});
  assertNotNull(actual);
  assertEquals("org.jsoup.parser.Token$Character", actual.getClass().getName());
  assertEquals("&le", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput067() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.parser.Tokeniser", "org.jsoup.parser.Tokeniser", "read", new String[]{}, new String[]{}, false, 13, new String[][]{{"org.jsoup.parser.Tokeniser", "eofError", "org.jsoup.parser.TokeniserState", "<sample:3>"}, {"org.jsoup.parser.Tokeniser", "advanceTransition", "org.jsoup.parser.TokeniserState", "<sample:1>"}}, 2);
  assertNotNull(actual);
  assertEquals("org.jsoup.parser.Token$Character", actual.getClass().getName());
  assertEquals("&le", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput068() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.parser.Tokeniser", "org.jsoup.parser.Tokeniser", "read", new String[]{}, new String[]{}, false, 14, new String[][]{{"org.jsoup.parser.Tokeniser", "eofError", "org.jsoup.parser.TokeniserState", "<sample:3>"}, {"org.jsoup.parser.Tokeniser", "advanceTransition", "org.jsoup.parser.TokeniserState", "<sample:1>"}}, 2);
  assertNotNull(actual);
  assertEquals("org.jsoup.parser.Token$Character", actual.getClass().getName());
  assertEquals("&", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput069() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jsoup.parser.Tokeniser", "org.jsoup.parser.Tokeniser", "read", new String[]{}, new String[]{}, false, 19, new String[][]{{"org.jsoup.parser.Tokeniser", "error", "org.jsoup.parser.TokeniserState", "<sample:3>"}, {"org.jsoup.parser.Tokeniser", "eofError", "org.jsoup.parser.TokeniserState", "<sample:3>"}, {"org.jsoup.parser.Tokeniser", "advanceTransition", "org.jsoup.parser.TokeniserState", "<null>"}}, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput070() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jsoup.parser.Tokeniser", "org.jsoup.parser.Tokeniser", "read", new String[]{}, new String[]{}, false, 22, new String[][]{{"org.jsoup.parser.Tokeniser", "error", "org.jsoup.parser.TokeniserState", "<sample:6>"}, {"org.jsoup.parser.Tokeniser", "eofError", "org.jsoup.parser.TokeniserState", "<sample:3>"}, {"org.jsoup.parser.Tokeniser", "advanceTransition", "org.jsoup.parser.TokeniserState", "<null>"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput071() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.parser.Tokeniser", "org.jsoup.parser.Tokeniser", "read", new String[]{}, new String[]{}, false, 22, new String[][]{{"org.jsoup.parser.Tokeniser", "error", "org.jsoup.parser.TokeniserState", "<sample:6>"}, {"org.jsoup.parser.Tokeniser", "emit", "java.lang.String", "/a/b"}, {"org.jsoup.parser.Tokeniser", "eofError", "org.jsoup.parser.TokeniserState", "<sample:6>"}});
  assertNotNull(actual);
  assertEquals("org.jsoup.parser.Token$Character", actual.getClass().getName());
  assertEquals("/a/b", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput072() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.parser.Tokeniser", "org.jsoup.parser.Tokeniser", "read", new String[]{}, new String[]{}, false, 23, new String[][]{{"org.jsoup.parser.Tokeniser", "error", "org.jsoup.parser.TokeniserState", "<sample:6>"}, {"org.jsoup.parser.Tokeniser", "emit", "java.lang.String", "/a/b"}, {"org.jsoup.parser.Tokeniser", "eofError", "org.jsoup.parser.TokeniserState", "<sample:6>"}});
  assertNotNull(actual);
  assertEquals("org.jsoup.parser.Token$Character", actual.getClass().getName());
  assertEquals("/a/ba", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput073() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jsoup.parser.TokeniserState", "org.jsoup.parser.TokeniserState$1", "valueOf", new String[]{"java.lang.String"}, new String[]{"\n"}, true); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput074() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.parser.Tokeniser", "org.jsoup.parser.Tokeniser", "error", new String[]{"org.jsoup.parser.TokeniserState"}, new String[]{"<sample:6>"}, false, 0, new String[][]{{"org.jsoup.parser.Tokeniser", "setTrackErrors", "boolean", "false"}});
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput075() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.parser.Tokeniser", "org.jsoup.parser.Tokeniser", "error", new String[]{"org.jsoup.parser.TokeniserState"}, new String[]{"<null>"}, false, 0, new String[][]{{"org.jsoup.parser.Tokeniser", "setTrackErrors", "boolean", "true"}}, 2);
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput076() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jsoup.parser.Tokeniser", "org.jsoup.parser.Tokeniser", "appropriateEndTagName", new String[]{}, new String[]{}, false, 11, new String[][]{{"org.jsoup.parser.Tokeniser", "emitTagPending", ""}, {"org.jsoup.parser.Tokeniser", "createCommentPending", ""}}, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput077() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jsoup.parser.Tokeniser", "org.jsoup.parser.Tokeniser", "appropriateEndTagName", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.jsoup.parser.Tokeniser", "eofError", "org.jsoup.parser.TokeniserState", "<sample:4>"}}, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput078() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.parser.Tokeniser", "org.jsoup.parser.Tokeniser", "isTrackErrors", new String[]{}, new String[]{}, false, 3, new String[][]{{"org.jsoup.parser.Tokeniser", "error", "org.jsoup.parser.TokeniserState", "<sample:3>"}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput079() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.parser.Tokeniser", "org.jsoup.parser.Tokeniser", "consumeCharacterReference", new String[]{"java.lang.Character", "boolean"}, new String[]{"+", "true"}, false, 4, new String[][]{}, 3);
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput080() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.parser.Tokeniser", "org.jsoup.parser.Tokeniser", "emit", new String[]{"java.lang.String"}, new String[]{"a b"}, false, 0, null, 3);
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput081() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.parser.Tokeniser", "org.jsoup.parser.Tokeniser", "emit", new String[]{"char"}, new String[]{"R"}, false, 4, new String[][]{{"org.jsoup.parser.Tokeniser", "emitCommentPending", ""}, {"org.jsoup.parser.Tokeniser", "error", "org.jsoup.parser.TokeniserState", "<sample:7>"}}, 2);
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput082() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jsoup.parser.Tokeniser", "org.jsoup.parser.Tokeniser", "emitTagPending", new String[]{}, new String[]{}, false); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput083() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.parser.Tokeniser", "org.jsoup.parser.Tokeniser", "createCommentPending", new String[]{}, new String[]{}, false, 11, new String[][]{}, 2);
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput084() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.parser.Tokeniser", "org.jsoup.parser.Tokeniser", "getState", new String[]{}, new String[]{}, false, 3, new String[][]{}, 1);
  assertNotNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput085() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jsoup.parser.Tokeniser", "org.jsoup.parser.Tokeniser", "isAppropriateEndTagToken", new String[]{}, new String[]{}, false, 1, new String[][]{{"org.jsoup.parser.Tokeniser", "eofError", "org.jsoup.parser.TokeniserState", "<sample:5>"}}, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput086() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.parser.Tokeniser", "org.jsoup.parser.Tokeniser", "createCommentPending", new String[]{}, new String[]{}, false, 0, null, 3);
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput087() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.parser.Tokeniser", "org.jsoup.parser.Tokeniser", "setTrackErrors", new String[]{"boolean"}, new String[]{"true"}, false, 0, null, 3);
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput088() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.parser.TokeniserState", "org.jsoup.parser.TokeniserState$1", "read", new String[]{"org.jsoup.parser.Tokeniser", "org.jsoup.parser.CharacterReader"}, new String[]{"<sample:5>", "<sample:8>"}, false, 11, new String[][]{{"org.jsoup.parser.TokeniserState", "read", "org.jsoup.parser.Tokeniser,org.jsoup.parser.CharacterReader", "<sample:7>", "<sample:6>"}, {"org.jsoup.parser.TokeniserState", "read", "org.jsoup.parser.Tokeniser,org.jsoup.parser.CharacterReader", "<null>", "<sample:5>"}, {"org.jsoup.parser.TokeniserState", "read", "org.jsoup.parser.Tokeniser,org.jsoup.parser.CharacterReader", "<sample:4>", "<sample:2>"}}, 3);
  assertNull(actual);
  assertEquals("receiver state after the call", "null", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput089() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.parser.Tokeniser", "org.jsoup.parser.Tokeniser", "eofError", new String[]{"org.jsoup.parser.TokeniserState"}, new String[]{"<sample:3>"}, false);
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput090() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.parser.Tokeniser", "org.jsoup.parser.Tokeniser", "advanceTransition", new String[]{"org.jsoup.parser.TokeniserState"}, new String[]{"<sample:0>"}, false, 0, new String[][]{{"org.jsoup.parser.Tokeniser", "emit", "java.lang.String", "65533"}});
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput091() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.parser.Tokeniser", "org.jsoup.parser.Tokeniser", "setTrackErrors", new String[]{"boolean"}, new String[]{"true"}, false, 0, new String[][]{{"org.jsoup.parser.Tokeniser", "advanceTransition", "org.jsoup.parser.TokeniserState", "<sample:7>"}}, 2);
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput092() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.parser.Tokeniser", "org.jsoup.parser.Tokeniser", "currentNodeInHtmlNS", new String[]{}, new String[]{}, false, 3, new String[][]{{"org.jsoup.parser.Tokeniser", "isTrackErrors", ""}, {"org.jsoup.parser.Tokeniser", "createTagPending", "boolean", "true"}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput093() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.parser.Tokeniser", "org.jsoup.parser.Tokeniser", "isTrackErrors", new String[]{}, new String[]{}, false, 0, null, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput094() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.parser.Tokeniser", "org.jsoup.parser.Tokeniser", "acknowledgeSelfClosingFlag", new String[]{}, new String[]{}, false);
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput095() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jsoup.parser.TokeniserState", "org.jsoup.parser.TokeniserState$1", "valueOf", new String[]{"java.lang.String"}, new String[]{"-1"}, true, 0, null, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput096() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jsoup.parser.TokeniserState", "org.jsoup.parser.TokeniserState$1", "valueOf", new String[]{"java.lang.String"}, new String[]{"rLU1/011.65f+1"}, true, 0, null, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput097() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.parser.Tokeniser", "org.jsoup.parser.Tokeniser", "advanceTransition", new String[]{"org.jsoup.parser.TokeniserState"}, new String[]{"<sample:6>"}, false, 14, new String[][]{}, 1);
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput098() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jsoup.parser.Tokeniser", "org.jsoup.parser.Tokeniser", "emitDoctypePending", new String[]{}, new String[]{}, false, 9, new String[][]{{"org.jsoup.parser.Tokeniser", "emitCommentPending", ""}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput099() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jsoup.parser.Tokeniser", "org.jsoup.parser.Tokeniser", "emitCommentPending", new String[]{}, new String[]{}, false, 6, new String[][]{{"org.jsoup.parser.Tokeniser", "transition", "org.jsoup.parser.TokeniserState", "<sample:3>"}, {"org.jsoup.parser.Tokeniser", "consumeCharacterReference", "java.lang.Character,boolean", ";", "false"}}, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput100() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.parser.Tokeniser", "org.jsoup.parser.Tokeniser", "acknowledgeSelfClosingFlag", new String[]{}, new String[]{}, false, 1, new String[][]{}, 1);
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput101() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.parser.TokeniserState", "org.jsoup.parser.TokeniserState$1", "read", new String[]{"org.jsoup.parser.Tokeniser", "org.jsoup.parser.CharacterReader"}, new String[]{"<sample:1>", "<sample:1>"}, false, 0, new String[][]{{"org.jsoup.parser.TokeniserState", "read", "org.jsoup.parser.Tokeniser,org.jsoup.parser.CharacterReader", "<sample:7>", "<sample:6>"}, {"org.jsoup.parser.TokeniserState", "read", "org.jsoup.parser.Tokeniser,org.jsoup.parser.CharacterReader", "<sample:3>", "<null>"}}, 1);
  assertNull(actual);
  assertEquals("receiver state after the call", "null", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput102() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jsoup.parser.TokeniserState", "org.jsoup.parser.TokeniserState$1", "read", new String[]{"org.jsoup.parser.Tokeniser", "org.jsoup.parser.CharacterReader"}, new String[]{"<sample:8>", "<null>"}, false, 1, new String[][]{{"org.jsoup.parser.TokeniserState", "read", "org.jsoup.parser.Tokeniser,org.jsoup.parser.CharacterReader", "<sample:7>", "<sample:5>"}, {"org.jsoup.parser.TokeniserState", "read", "org.jsoup.parser.Tokeniser,org.jsoup.parser.CharacterReader", "<sample:2>", "<sample:4>"}}, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput103() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.parser.Tokeniser", "org.jsoup.parser.Tokeniser", "emit", new String[]{"java.lang.String"}, new String[]{"1.12445567"}, false, 0, new String[][]{{"org.jsoup.parser.Tokeniser", "consumeCharacterReference", "java.lang.Character,boolean", "<null>", "true"}}, 1);
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput104() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.parser.Tokeniser", "org.jsoup.parser.Tokeniser", "currentNodeInHtmlNS", new String[]{}, new String[]{}, false, 7, new String[][]{{"org.jsoup.parser.Tokeniser", "isAppropriateEndTagToken", ""}, {"org.jsoup.parser.Tokeniser", "advanceTransition", "org.jsoup.parser.TokeniserState", "<sample:5>"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput105() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.parser.Tokeniser", "org.jsoup.parser.Tokeniser", "currentNodeInHtmlNS", new String[]{}, new String[]{}, false, 17, new String[][]{{"org.jsoup.parser.Tokeniser", "emit", "java.lang.String", "1E.5"}, {"org.jsoup.parser.Tokeniser", "advanceTransition", "org.jsoup.parser.TokeniserState", "<sample:2>"}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput106() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.parser.Tokeniser", "org.jsoup.parser.Tokeniser", "acknowledgeSelfClosingFlag", new String[]{}, new String[]{}, false, 8, new String[][]{{"org.jsoup.parser.Tokeniser", "emitDoctypePending", ""}, {"org.jsoup.parser.Tokeniser", "createTagPending", "boolean", "true"}}, 3);
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput107() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jsoup.parser.Tokeniser", "org.jsoup.parser.Tokeniser", "emit", new String[]{"org.jsoup.parser.Token"}, new String[]{"<null>"}, false, 0, new String[][]{{"org.jsoup.parser.Tokeniser", "emit", "java.lang.String", "1.1234567890123456"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput108() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jsoup.parser.Tokeniser", "org.jsoup.parser.Tokeniser", "emit", new String[]{"org.jsoup.parser.Token"}, new String[]{"<null>"}, false, 2, new String[][]{{"org.jsoup.parser.Tokeniser", "emit", "java.lang.String", "--"}, {"org.jsoup.parser.Tokeniser", "setTrackErrors", "boolean", "false"}, {"org.jsoup.parser.Tokeniser", "emit", "char", "#"}}, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput109() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.parser.Tokeniser", "org.jsoup.parser.Tokeniser", "eofError", new String[]{"org.jsoup.parser.TokeniserState"}, new String[]{"<null>"}, false, 0, null, 3);
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput110() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.parser.Tokeniser", "org.jsoup.parser.Tokeniser", "emitDoctypePending", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.jsoup.parser.Tokeniser", "createDoctypePending", ""}});
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput111() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.parser.Tokeniser", "org.jsoup.parser.Tokeniser", "getState", new String[]{}, new String[]{}, false, 0, null, 3);
  assertNotNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput112() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.parser.Tokeniser", "org.jsoup.parser.Tokeniser", "createDoctypePending", new String[]{}, new String[]{}, false, 3, new String[][]{{"org.jsoup.parser.Tokeniser", "emitCommentPending", ""}}, 2);
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput113() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.parser.Tokeniser", "org.jsoup.parser.Tokeniser", "eofError", new String[]{"org.jsoup.parser.TokeniserState"}, new String[]{"<sample:2>"}, false, 0, new String[][]{{"org.jsoup.parser.Tokeniser", "getState", ""}}, 2);
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput114() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.parser.Tokeniser", "org.jsoup.parser.Tokeniser", "advanceTransition", new String[]{"org.jsoup.parser.TokeniserState"}, new String[]{"<sample:7>"}, false, 0, null, 3);
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput115() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.parser.Tokeniser", "org.jsoup.parser.Tokeniser", "createTagPending", new String[]{"boolean"}, new String[]{"true"}, false, 0, new String[][]{{"org.jsoup.parser.Tokeniser", "setTrackErrors", "boolean", "false"}}, 1);
  assertNotNull(actual);
  assertEquals("org.jsoup.parser.Token$StartTag", actual.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput116() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.parser.Tokeniser", "org.jsoup.parser.Tokeniser", "emit", new String[]{"java.lang.String"}, new String[]{"1.12345678901234567"}, false, 13, new String[][]{}, 2);
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput117() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jsoup.parser.Tokeniser", "org.jsoup.parser.Tokeniser", "emitDoctypePending", new String[]{}, new String[]{}, false, 34, new String[][]{{"org.jsoup.parser.Tokeniser", "emit", "org.jsoup.parser.Token", "<sample:5>"}, {"org.jsoup.parser.Tokeniser", "appropriateEndTagName", ""}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput118() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.parser.Tokeniser", "org.jsoup.parser.Tokeniser", "currentNodeInHtmlNS", new String[]{}, new String[]{}, false, 1, new String[][]{{"org.jsoup.parser.Tokeniser", "emitTagPending", ""}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput119() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.parser.TokeniserState", "org.jsoup.parser.TokeniserState$1", "valueOf", new String[]{"java.lang.String"}, new String[]{"PLAINTEXT"}, true, 0, null, 2);
  assertNotNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput120() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.parser.Tokeniser", "org.jsoup.parser.Tokeniser", "transition", new String[]{"org.jsoup.parser.TokeniserState"}, new String[]{"<sample:8>"}, false, 15, new String[][]{{"org.jsoup.parser.Tokeniser", "transition", "org.jsoup.parser.TokeniserState", "<sample:3>"}, {"org.jsoup.parser.Tokeniser", "transition", "org.jsoup.parser.TokeniserState", "<null>"}, {"org.jsoup.parser.Tokeniser", "createTempBuffer", ""}}, 1);
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput121() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jsoup.parser.TokeniserState", "org.jsoup.parser.TokeniserState$1", "read", new String[]{"org.jsoup.parser.Tokeniser", "org.jsoup.parser.CharacterReader"}, new String[]{"<null>", "<sample:6>"}, false, 1, new String[][]{}, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput122() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.parser.Tokeniser", "org.jsoup.parser.Tokeniser", "createDoctypePending", new String[]{}, new String[]{}, false, 0, null, 1);
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput123() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.parser.Tokeniser", "org.jsoup.parser.Tokeniser", "advanceTransition", new String[]{"org.jsoup.parser.TokeniserState"}, new String[]{"<sample:7>"}, false, 0, new String[][]{{"org.jsoup.parser.Tokeniser", "transition", "org.jsoup.parser.TokeniserState", "<sample:4>"}, {"org.jsoup.parser.Tokeniser", "error", "org.jsoup.parser.TokeniserState", "<sample:6>"}}, 2);
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput124() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.parser.Tokeniser", "org.jsoup.parser.Tokeniser", "emit", new String[]{"org.jsoup.parser.Token"}, new String[]{"<sample:3>"}, false, 0, null, 2);
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput125() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jsoup.parser.Tokeniser", "org.jsoup.parser.Tokeniser", "emit", new String[]{"org.jsoup.parser.Token"}, new String[]{"<null>"}, false, 0, new String[][]{{"org.jsoup.parser.Tokeniser", "isAppropriateEndTagToken", ""}}, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput126() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.parser.Tokeniser", "org.jsoup.parser.Tokeniser", "setTrackErrors", new String[]{"boolean"}, new String[]{"true"}, false, 0, new String[][]{{"org.jsoup.parser.Tokeniser", "createTempBuffer", ""}, {"org.jsoup.parser.Tokeniser", "consumeCharacterReference", "java.lang.Character,boolean", "#", "false"}}, 1);
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput127() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.parser.Tokeniser", "org.jsoup.parser.Tokeniser", "consumeCharacterReference", new String[]{"java.lang.Character", "boolean"}, new String[]{"]", "false"}, false, 0, null, 2);
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput128() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.parser.Tokeniser", "org.jsoup.parser.Tokeniser", "consumeCharacterReference", new String[]{"java.lang.Character", "boolean"}, new String[]{"_", "false"}, false, 13, new String[][]{{"org.jsoup.parser.Tokeniser", "emitTagPending", ""}, {"org.jsoup.parser.Tokeniser", "emit", "char", ";"}, {"org.jsoup.parser.Tokeniser", "advanceTransition", "org.jsoup.parser.TokeniserState", "<sample:6>"}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Character", actual.getClass().getName());
  assertEquals("&", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput129() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.parser.Tokeniser", "org.jsoup.parser.Tokeniser", "consumeCharacterReference", new String[]{"java.lang.Character", "boolean"}, new String[]{",", "true"}, false, 13, new String[][]{{"org.jsoup.parser.Tokeniser", "emitTagPending", ""}, {"org.jsoup.parser.Tokeniser", "emit", "char", ";"}, {"org.jsoup.parser.Tokeniser", "advanceTransition", "org.jsoup.parser.TokeniserState", "<sample:2>"}}, 2);
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput130() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.parser.Tokeniser", "org.jsoup.parser.Tokeniser", "emitCommentPending", new String[]{}, new String[]{}, false, 1, new String[][]{{"org.jsoup.parser.Tokeniser", "eofError", "org.jsoup.parser.TokeniserState", "<sample:3>"}, {"org.jsoup.parser.Tokeniser", "createCommentPending", ""}, {"org.jsoup.parser.Tokeniser", "createTagPending", "boolean", "false"}}, 1);
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput131() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.parser.Tokeniser", "org.jsoup.parser.Tokeniser", "emitCommentPending", new String[]{}, new String[]{}, false, 7, new String[][]{{"org.jsoup.parser.Tokeniser", "createCommentPending", ""}, {"org.jsoup.parser.Tokeniser", "createTagPending", "boolean", "false"}});
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput132() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.parser.Tokeniser", "org.jsoup.parser.Tokeniser", "getState", new String[]{}, new String[]{}, false, 0, null, 2);
  assertNotNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput133() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jsoup.parser.Tokeniser", "org.jsoup.parser.Tokeniser", "emit", new String[]{"org.jsoup.parser.Token"}, new String[]{"<sample:7>"}, false, 0, new String[][]{{"org.jsoup.parser.Tokeniser", "currentNodeInHtmlNS", ""}, {"org.jsoup.parser.Tokeniser", "emitDoctypePending", ""}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput134() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jsoup.parser.Tokeniser", "org.jsoup.parser.Tokeniser", "isAppropriateEndTagToken", new String[]{}, new String[]{}, false, 19, new String[][]{{"org.jsoup.parser.Tokeniser", "transition", "org.jsoup.parser.TokeniserState", "<sample:0>"}}, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput135() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jsoup.parser.Tokeniser", "org.jsoup.parser.Tokeniser", "isAppropriateEndTagToken", new String[]{}, new String[]{}, false, 4, new String[][]{{"org.jsoup.parser.Tokeniser", "read", ""}}, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput136() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.parser.Tokeniser", "org.jsoup.parser.Tokeniser", "acknowledgeSelfClosingFlag", new String[]{}, new String[]{}, false, 11, new String[][]{{"org.jsoup.parser.Tokeniser", "getState", ""}}, 2);
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput137() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jsoup.parser.Tokeniser", "org.jsoup.parser.Tokeniser", "emitCommentPending", new String[]{}, new String[]{}, false, 4, new String[][]{}, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput138() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.parser.Tokeniser", "org.jsoup.parser.Tokeniser", "read", new String[]{}, new String[]{}, false, 0, null, 3);
  assertNotNull(actual);
  assertEquals("org.jsoup.parser.Token$Character", actual.getClass().getName());
  assertEquals("0", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput139() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.parser.Tokeniser", "org.jsoup.parser.Tokeniser", "read", new String[]{}, new String[]{}, false, 1, new String[][]{}, 3);
  assertNotNull(actual);
  assertEquals("org.jsoup.parser.Token$Character", actual.getClass().getName());
  assertEquals("sample", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput140() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.parser.Tokeniser", "org.jsoup.parser.Tokeniser", "read", new String[]{}, new String[]{}, false, 2, new String[][]{}, 3);
  assertNotNull(actual);
  assertEquals("org.jsoup.parser.Token$EOF", actual.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput141() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.parser.Tokeniser", "org.jsoup.parser.Tokeniser", "read", new String[]{}, new String[]{}, false, 3, new String[][]{}, 3);
  assertNotNull(actual);
  assertEquals("org.jsoup.parser.Token$Character", actual.getClass().getName());
  assertEquals("a", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput142() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.parser.Tokeniser", "org.jsoup.parser.Tokeniser", "isTrackErrors", new String[]{}, new String[]{}, false, 3, new String[][]{{"org.jsoup.parser.Tokeniser", "setTrackErrors", "boolean", "false"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput143() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.parser.Tokeniser", "org.jsoup.parser.Tokeniser", "createTempBuffer", new String[]{}, new String[]{}, false, 3, new String[][]{{"org.jsoup.parser.Tokeniser", "transition", "org.jsoup.parser.TokeniserState", "<sample:5>"}}, 2);
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput144() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.parser.Tokeniser", "org.jsoup.parser.Tokeniser", "createTempBuffer", new String[]{}, new String[]{}, false, 15, new String[][]{{"org.jsoup.parser.Tokeniser", "transition", "org.jsoup.parser.TokeniserState", "<sample:8>"}, {"org.jsoup.parser.Tokeniser", "isTrackErrors", ""}}, 1);
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput145() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jsoup.parser.Tokeniser", "org.jsoup.parser.Tokeniser", "emitTagPending", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.jsoup.parser.Tokeniser", "emitCommentPending", ""}}, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput146() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.parser.Tokeniser", "org.jsoup.parser.Tokeniser", "transition", new String[]{"org.jsoup.parser.TokeniserState"}, new String[]{"<sample:2>"}, false, 2, new String[][]{{"org.jsoup.parser.Tokeniser", "isAppropriateEndTagToken", ""}, {"org.jsoup.parser.Tokeniser", "currentNodeInHtmlNS", ""}}, 3);
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput147() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.parser.Tokeniser", "org.jsoup.parser.Tokeniser", "read", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.jsoup.parser.Tokeniser", "appropriateEndTagName", ""}}, 1);
  assertNotNull(actual);
  assertEquals("org.jsoup.parser.Token$Character", actual.getClass().getName());
  assertEquals("0", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput148() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.parser.Tokeniser", "org.jsoup.parser.Tokeniser", "read", new String[]{}, new String[]{}, false, 1, new String[][]{{"org.jsoup.parser.Tokeniser", "appropriateEndTagName", ""}}, 1);
  assertNotNull(actual);
  assertEquals("org.jsoup.parser.Token$Character", actual.getClass().getName());
  assertEquals("sample", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput149() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.parser.Tokeniser", "org.jsoup.parser.Tokeniser", "read", new String[]{}, new String[]{}, false, 2, new String[][]{{"org.jsoup.parser.Tokeniser", "appropriateEndTagName", ""}}, 1);
  assertNotNull(actual);
  assertEquals("org.jsoup.parser.Token$EOF", actual.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput150() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.parser.Tokeniser", "org.jsoup.parser.Tokeniser", "read", new String[]{}, new String[]{}, false, 3, new String[][]{{"org.jsoup.parser.Tokeniser", "appropriateEndTagName", ""}, {"org.jsoup.parser.Tokeniser", "error", "org.jsoup.parser.TokeniserState", "<sample:4>"}, {"org.jsoup.parser.Tokeniser", "consumeCharacterReference", "java.lang.Character,boolean", "<null>", "true"}}, 1);
  assertNotNull(actual);
  assertEquals("org.jsoup.parser.Token$Character", actual.getClass().getName());
  assertEquals("a", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput151() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.parser.Tokeniser", "org.jsoup.parser.Tokeniser", "read", new String[]{}, new String[]{}, false, 9, new String[][]{{"org.jsoup.parser.Tokeniser", "emit", "char", "t"}, {"org.jsoup.parser.Tokeniser", "error", "org.jsoup.parser.TokeniserState", "<sample:4>"}, {"org.jsoup.parser.Tokeniser", "consumeCharacterReference", "java.lang.Character,boolean", "#", "true"}}, 2);
  assertNotNull(actual);
  assertEquals("org.jsoup.parser.Token$Character", actual.getClass().getName());
  assertEquals("tsample", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput152() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.parser.Tokeniser", "org.jsoup.parser.Tokeniser", "read", new String[]{}, new String[]{}, false, 10, new String[][]{{"org.jsoup.parser.Tokeniser", "emit", "char", "t"}, {"org.jsoup.parser.Tokeniser", "error", "org.jsoup.parser.TokeniserState", "<sample:4>"}, {"org.jsoup.parser.Tokeniser", "consumeCharacterReference", "java.lang.Character,boolean", "#", "true"}}, 2);
  assertNotNull(actual);
  assertEquals("org.jsoup.parser.Token$Character", actual.getClass().getName());
  assertEquals("t", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput153() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jsoup.parser.Tokeniser", "org.jsoup.parser.Tokeniser", "emitCommentPending", new String[]{}, new String[]{}, false, 5, new String[][]{{"org.jsoup.parser.Tokeniser", "setTrackErrors", "boolean", "true"}, {"org.jsoup.parser.Tokeniser", "emitDoctypePending", ""}}, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput154() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.parser.Tokeniser", "org.jsoup.parser.Tokeniser", "emit", new String[]{"char"}, new String[]{"!"}, false, 0, null, 1);
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput155() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.parser.Tokeniser", "org.jsoup.parser.Tokeniser", "emit", new String[]{"char"}, new String[]{"O"}, false, 1, new String[][]{}, 3);
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput156() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.parser.Tokeniser", "org.jsoup.parser.Tokeniser", "read", new String[]{}, new String[]{}, false, 6, new String[][]{{"org.jsoup.parser.Tokeniser", "emitCommentPending", ""}, {"org.jsoup.parser.Tokeniser", "eofError", "org.jsoup.parser.TokeniserState", "<sample:3>"}}, 3);
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput157() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.parser.Tokeniser", "org.jsoup.parser.Tokeniser", "createCommentPending", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.jsoup.parser.Tokeniser", "consumeCharacterReference", "java.lang.Character,boolean", "X", "false"}}, 1);
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput158() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jsoup.parser.TokeniserState", "org.jsoup.parser.TokeniserState$1", "read", new String[]{"org.jsoup.parser.Tokeniser", "org.jsoup.parser.CharacterReader"}, new String[]{"<null>", "<sample:7>"}, false, 0, new String[][]{{"org.jsoup.parser.TokeniserState", "read", "org.jsoup.parser.Tokeniser,org.jsoup.parser.CharacterReader", "<sample:3>", "<sample:0>"}}, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput159() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jsoup.parser.Tokeniser", "org.jsoup.parser.Tokeniser", "emit", new String[]{"org.jsoup.parser.Token"}, new String[]{"<sample:4>"}, false, 6, new String[][]{{"org.jsoup.parser.Tokeniser", "emitCommentPending", ""}}, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput160() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.parser.Tokeniser", "org.jsoup.parser.Tokeniser", "transition", new String[]{"org.jsoup.parser.TokeniserState"}, new String[]{"<sample:2>"}, false, 0, null, 2);
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput161() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.parser.Tokeniser", "org.jsoup.parser.Tokeniser", "createTagPending", new String[]{"boolean"}, new String[]{"false"}, false, 2, new String[][]{{"org.jsoup.parser.Tokeniser", "currentNodeInHtmlNS", ""}, {"org.jsoup.parser.Tokeniser", "advanceTransition", "org.jsoup.parser.TokeniserState", "<null>"}}, 3);
  assertNotNull(actual);
  assertEquals("org.jsoup.parser.Token$EndTag", actual.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput162() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.parser.Tokeniser", "org.jsoup.parser.Tokeniser", "createDoctypePending", new String[]{}, new String[]{}, false, 1, new String[][]{}, 3);
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput163() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.parser.Tokeniser", "org.jsoup.parser.Tokeniser", "error", new String[]{"org.jsoup.parser.TokeniserState"}, new String[]{"<sample:1>"}, false, 0, null, 1);
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput164() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.parser.Tokeniser", "org.jsoup.parser.Tokeniser", "error", new String[]{"org.jsoup.parser.TokeniserState"}, new String[]{"<sample:0>"}, false, 0, null, 3);
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput165() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jsoup.parser.Tokeniser", "org.jsoup.parser.Tokeniser", "emitCommentPending", new String[]{}, new String[]{}, false, 15, new String[][]{{"org.jsoup.parser.Tokeniser", "emitCommentPending", ""}}, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput166() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jsoup.parser.Tokeniser", "org.jsoup.parser.Tokeniser", "emitCommentPending", new String[]{}, new String[]{}, false, 20, new String[][]{}, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput167() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.parser.Tokeniser", "org.jsoup.parser.Tokeniser", "eofError", new String[]{"org.jsoup.parser.TokeniserState"}, new String[]{"<sample:3>"}, false, 1, new String[][]{{"org.jsoup.parser.Tokeniser", "error", "org.jsoup.parser.TokeniserState", "<sample:6>"}}, 1);
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput168() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.parser.TokeniserState", "org.jsoup.parser.TokeniserState$1", "values", new String[]{}, new String[]{}, true, 0, null, 2);
  assertNotNull(actual);
  assertEquals("[Lorg.jsoup.parser.TokeniserState;", actual.getClass().getName());
  assertEquals("[Data, CharacterReferenceInData, Rcdata, CharacterReferenceInRcdata, Rawtext, ScriptData, PLAINTEXT, TagOpen, EndTagOpen, TagName, RcdataLessthanSign, RCDATAEndTagOpen, RCDATAEndTagName, RawtextLessth...#1490#-1802059412", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput169() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.parser.TokeniserState", "org.jsoup.parser.TokeniserState$1", "values", new String[]{}, new String[]{}, true, 0, null, 1);
  assertNotNull(actual);
  assertEquals("[Lorg.jsoup.parser.TokeniserState;", actual.getClass().getName());
  assertEquals("[Data, CharacterReferenceInData, Rcdata, CharacterReferenceInRcdata, Rawtext, ScriptData, PLAINTEXT, TagOpen, EndTagOpen, TagName, RcdataLessthanSign, RCDATAEndTagOpen, RCDATAEndTagName, RawtextLessth...#1490#-1802059412", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput170() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.parser.Tokeniser", "org.jsoup.parser.Tokeniser", "createTempBuffer", new String[]{}, new String[]{}, false, 9, new String[][]{{"org.jsoup.parser.Tokeniser", "advanceTransition", "org.jsoup.parser.TokeniserState", "<sample:4>"}, {"org.jsoup.parser.Tokeniser", "eofError", "org.jsoup.parser.TokeniserState", "<sample:5>"}, {"org.jsoup.parser.Tokeniser", "read", ""}}, 2);
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput171() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.parser.TokeniserState", "org.jsoup.parser.TokeniserState$1", "valueOf", new String[]{"java.lang.String"}, new String[]{"PLAINTEXT"}, true);
  assertNotNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput172() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jsoup.parser.TokeniserState", "org.jsoup.parser.TokeniserState$1", "valueOf", new String[]{"java.lang.String"}, new String[]{""}, true, 0, null, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput173() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.parser.Tokeniser", "org.jsoup.parser.Tokeniser", "getState", new String[]{}, new String[]{}, false, 11, new String[][]{{"org.jsoup.parser.Tokeniser", "transition", "org.jsoup.parser.TokeniserState", "<null>"}, {"org.jsoup.parser.Tokeniser", "emitCommentPending", ""}});
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput174() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.parser.Tokeniser", "org.jsoup.parser.Tokeniser", "eofError", new String[]{"org.jsoup.parser.TokeniserState"}, new String[]{"<sample:3>"}, false, 0, new String[][]{{"org.jsoup.parser.Tokeniser", "setTrackErrors", "boolean", "false"}});
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput175() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.parser.Tokeniser", "org.jsoup.parser.Tokeniser", "createTagPending", new String[]{"boolean"}, new String[]{"true"}, false, 0, new String[][]{{"org.jsoup.parser.Tokeniser", "advanceTransition", "org.jsoup.parser.TokeniserState", "<sample:7>"}, {"org.jsoup.parser.Tokeniser", "currentNodeInHtmlNS", ""}, {"org.jsoup.parser.Tokeniser", "read", ""}});
  assertNotNull(actual);
  assertEquals("org.jsoup.parser.Token$StartTag", actual.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput176() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.parser.Tokeniser", "org.jsoup.parser.Tokeniser", "createTagPending", new String[]{"boolean"}, new String[]{"true"}, false, 10, new String[][]{{"org.jsoup.parser.Tokeniser", "advanceTransition", "org.jsoup.parser.TokeniserState", "<sample:6>"}, {"org.jsoup.parser.Tokeniser", "read", ""}});
  assertNotNull(actual);
  assertEquals("org.jsoup.parser.Token$StartTag", actual.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput177() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.parser.Tokeniser", "org.jsoup.parser.Tokeniser", "createTagPending", new String[]{"boolean"}, new String[]{"true"}, false, 10, new String[][]{{"org.jsoup.parser.Tokeniser", "advanceTransition", "org.jsoup.parser.TokeniserState", "<sample:2>"}}, 2);
  assertNotNull(actual);
  assertEquals("org.jsoup.parser.Token$StartTag", actual.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput178() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.parser.Tokeniser", "org.jsoup.parser.Tokeniser", "createTagPending", new String[]{"boolean"}, new String[]{"false"}, false, 10, new String[][]{{"org.jsoup.parser.Tokeniser", "advanceTransition", "org.jsoup.parser.TokeniserState", "<sample:2>"}}, 2);
  assertNotNull(actual);
  assertEquals("org.jsoup.parser.Token$EndTag", actual.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput179() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jsoup.parser.Tokeniser", "org.jsoup.parser.Tokeniser", "emitTagPending", new String[]{}, new String[]{}, false, 17, new String[][]{{"org.jsoup.parser.Tokeniser", "setTrackErrors", "boolean", "true"}, {"org.jsoup.parser.Tokeniser", "emit", "char", "\000"}}, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput180() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.parser.TokeniserState", "org.jsoup.parser.TokeniserState$1", "values", new String[]{}, new String[]{}, true, 0, null, 3);
  assertNotNull(actual);
  assertEquals("[Lorg.jsoup.parser.TokeniserState;", actual.getClass().getName());
  assertEquals("[Data, CharacterReferenceInData, Rcdata, CharacterReferenceInRcdata, Rawtext, ScriptData, PLAINTEXT, TagOpen, EndTagOpen, TagName, RcdataLessthanSign, RCDATAEndTagOpen, RCDATAEndTagName, RawtextLessth...#1490#-1802059412", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput181() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.parser.Tokeniser", "org.jsoup.parser.Tokeniser", "read", new String[]{}, new String[]{}, false, 2, new String[][]{{"org.jsoup.parser.Tokeniser", "advanceTransition", "org.jsoup.parser.TokeniserState", "<sample:5>"}});
  assertNotNull(actual);
  assertEquals("org.jsoup.parser.Token$EOF", actual.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput182() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.parser.Tokeniser", "org.jsoup.parser.Tokeniser", "read", new String[]{}, new String[]{}, false, 33, new String[][]{{"org.jsoup.parser.Tokeniser", "advanceTransition", "org.jsoup.parser.TokeniserState", "<sample:7>"}});
  assertNotNull(actual);
  assertEquals("org.jsoup.parser.Token$EOF", actual.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput183() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jsoup.parser.Tokeniser", "org.jsoup.parser.Tokeniser", "emitDoctypePending", new String[]{}, new String[]{}, false, 10, new String[][]{{"org.jsoup.parser.Tokeniser", "transition", "org.jsoup.parser.TokeniserState", "<sample:3>"}, {"org.jsoup.parser.Tokeniser", "advanceTransition", "org.jsoup.parser.TokeniserState", "<sample:0>"}, {"org.jsoup.parser.Tokeniser", "appropriateEndTagName", ""}}, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput184() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.parser.TokeniserState", "org.jsoup.parser.TokeniserState$1", "valueOf", new String[]{"java.lang.String"}, new String[]{"Rcdata"}, true, 0, null, 3);
  assertNotNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput185() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jsoup.parser.Tokeniser", "org.jsoup.parser.Tokeniser", "emitDoctypePending", new String[]{}, new String[]{}, false, 1, new String[][]{{"org.jsoup.parser.Tokeniser", "emit", "org.jsoup.parser.Token", "<sample:1>"}}, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput186() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jsoup.parser.Tokeniser", "org.jsoup.parser.Tokeniser", "emitDoctypePending", new String[]{}, new String[]{}, false, 3, new String[][]{{"org.jsoup.parser.Tokeniser", "isTrackErrors", ""}, {"org.jsoup.parser.Tokeniser", "read", ""}}, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput187() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.parser.Tokeniser", "org.jsoup.parser.Tokeniser", "isTrackErrors", new String[]{}, new String[]{}, false, 0, null, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput188() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.parser.Tokeniser", "org.jsoup.parser.Tokeniser", "createTagPending", new String[]{"boolean"}, new String[]{"true"}, false, 0, new String[][]{{"org.jsoup.parser.Tokeniser", "appropriateEndTagName", ""}}, 3);
  assertNotNull(actual);
  assertEquals("org.jsoup.parser.Token$StartTag", actual.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput189() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jsoup.parser.TokeniserState", "org.jsoup.parser.TokeniserState$1", "valueOf", new String[]{"java.lang.String"}, new String[]{"<null>"}, true); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput190() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jsoup.parser.Tokeniser", "org.jsoup.parser.Tokeniser", "emitCommentPending", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.jsoup.parser.Tokeniser", "emit", "org.jsoup.parser.Token", "<sample:2>"}}, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput191() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.parser.Tokeniser", "org.jsoup.parser.Tokeniser", "read", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.jsoup.parser.Tokeniser", "emit", "java.lang.String", "3.1234567"}}, 1);
  assertNotNull(actual);
  assertEquals("org.jsoup.parser.Token$Character", actual.getClass().getName());
  assertEquals("3.12345670", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput192() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.parser.Tokeniser", "org.jsoup.parser.Tokeniser", "read", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.jsoup.parser.Tokeniser", "emit", "java.lang.String", "-1.5"}}, 1);
  assertNotNull(actual);
  assertEquals("org.jsoup.parser.Token$Character", actual.getClass().getName());
  assertEquals("-1.50", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput193() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.parser.Tokeniser", "org.jsoup.parser.Tokeniser", "read", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.jsoup.parser.Tokeniser", "emit", "java.lang.String", "-1-5"}}, 1);
  assertNotNull(actual);
  assertEquals("org.jsoup.parser.Token$Character", actual.getClass().getName());
  assertEquals("-1-50", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput194() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.parser.Tokeniser", "org.jsoup.parser.Tokeniser", "read", new String[]{}, new String[]{}, false, 3, new String[][]{{"org.jsoup.parser.Tokeniser", "emit", "java.lang.String", "-1-5"}}, 1);
  assertNotNull(actual);
  assertEquals("org.jsoup.parser.Token$Character", actual.getClass().getName());
  assertEquals("-1-5a", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput195() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.parser.Tokeniser", "org.jsoup.parser.Tokeniser", "emitTagPending", new String[]{}, new String[]{}, false, 4, new String[][]{{"org.jsoup.parser.Tokeniser", "createTagPending", "boolean", "true"}, {"org.jsoup.parser.Tokeniser", "createDoctypePending", ""}, {"org.jsoup.parser.Tokeniser", "emit", "char", "1"}}, 3);
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput196() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jsoup.parser.Tokeniser", "org.jsoup.parser.Tokeniser", "emitTagPending", new String[]{}, new String[]{}, false, 2, new String[][]{{"org.jsoup.parser.Tokeniser", "emit", "org.jsoup.parser.Token", "<sample:3>"}, {"org.jsoup.parser.Tokeniser", "consumeCharacterReference", "java.lang.Character,boolean", "#", "true"}, {"org.jsoup.parser.Tokeniser", "createTagPending", "boolean", "false"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput197() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jsoup.parser.Tokeniser", "org.jsoup.parser.Tokeniser", "emitCommentPending", new String[]{}, new String[]{}, false, 21, new String[][]{{"org.jsoup.parser.Tokeniser", "acknowledgeSelfClosingFlag", ""}, {"org.jsoup.parser.Tokeniser", "transition", "org.jsoup.parser.TokeniserState", "<sample:5>"}, {"org.jsoup.parser.Tokeniser", "read", ""}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput198() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.parser.Tokeniser", "org.jsoup.parser.Tokeniser", "consumeCharacterReference", new String[]{"java.lang.Character", "boolean"}, new String[]{"C", "false"}, false, 5, new String[][]{{"org.jsoup.parser.Tokeniser", "currentNodeInHtmlNS", ""}, {"org.jsoup.parser.Tokeniser", "createTagPending", "boolean", "true"}, {"org.jsoup.parser.Tokeniser", "advanceTransition", "org.jsoup.parser.TokeniserState", "<null>"}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Character", actual.getClass().getName());
  assertEquals("&", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput199() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.parser.Tokeniser", "org.jsoup.parser.Tokeniser", "read", new String[]{}, new String[]{}, false, 19, new String[][]{{"org.jsoup.parser.Tokeniser", "transition", "org.jsoup.parser.TokeniserState", "<sample:6>"}});
  assertNotNull(actual);
  assertEquals("org.jsoup.parser.Token$EOF", actual.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput200() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.parser.Tokeniser", "org.jsoup.parser.Tokeniser", "emitDoctypePending", new String[]{}, new String[]{}, false, 13, new String[][]{{"org.jsoup.parser.Tokeniser", "createDoctypePending", ""}, {"org.jsoup.parser.Tokeniser", "getState", ""}, {"org.jsoup.parser.Tokeniser", "acknowledgeSelfClosingFlag", ""}}, 2);
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput201() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jsoup.parser.Tokeniser", "org.jsoup.parser.Tokeniser", "read", new String[]{}, new String[]{}, false, 17, new String[][]{{"org.jsoup.parser.Tokeniser", "eofError", "org.jsoup.parser.TokeniserState", "<sample:1>"}, {"org.jsoup.parser.Tokeniser", "advanceTransition", "org.jsoup.parser.TokeniserState", "<null>"}}, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput202() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.parser.Tokeniser", "org.jsoup.parser.Tokeniser", "read", new String[]{}, new String[]{}, false, 3, new String[][]{{"org.jsoup.parser.Tokeniser", "emitDoctypePending", ""}, {"org.jsoup.parser.Tokeniser", "emit", "char", " "}, {"org.jsoup.parser.Tokeniser", "currentNodeInHtmlNS", ""}}, 3);
  assertNotNull(actual);
  assertEquals("org.jsoup.parser.Token$Character", actual.getClass().getName());
  assertEquals(" ", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput203() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.parser.Tokeniser", "org.jsoup.parser.Tokeniser", "read", new String[]{}, new String[]{}, false, 4, new String[][]{{"org.jsoup.parser.Tokeniser", "emitDoctypePending", ""}, {"org.jsoup.parser.Tokeniser", "emit", "char", "!"}, {"org.jsoup.parser.Tokeniser", "currentNodeInHtmlNS", ""}}, 3);
  assertNotNull(actual);
  assertEquals("org.jsoup.parser.Token$Character", actual.getClass().getName());
  assertEquals("!", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput204() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.parser.Tokeniser", "org.jsoup.parser.Tokeniser", "emitCommentPending", new String[]{}, new String[]{}, false, 10, new String[][]{{"org.jsoup.parser.Tokeniser", "createCommentPending", ""}}, 2);
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput205() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jsoup.parser.Tokeniser", "org.jsoup.parser.Tokeniser", "emit", new String[]{"org.jsoup.parser.Token"}, new String[]{"<sample:7>"}, false, 0, new String[][]{{"org.jsoup.parser.Tokeniser", "read", ""}, {"org.jsoup.parser.Tokeniser", "error", "org.jsoup.parser.TokeniserState", "<null>"}, {"org.jsoup.parser.Tokeniser", "createTempBuffer", ""}}, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput206() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jsoup.parser.Tokeniser", "org.jsoup.parser.Tokeniser", "emit", new String[]{"org.jsoup.parser.Token"}, new String[]{"<null>"}, false, 0, new String[][]{{"org.jsoup.parser.Tokeniser", "emitDoctypePending", ""}}, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput207() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.parser.Tokeniser", "org.jsoup.parser.Tokeniser", "emitTagPending", new String[]{}, new String[]{}, false, 6, new String[][]{{"org.jsoup.parser.Tokeniser", "createTagPending", "boolean", "false"}, {"org.jsoup.parser.Tokeniser", "isAppropriateEndTagToken", ""}}, 2);
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput208() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.parser.TokeniserState", "org.jsoup.parser.TokeniserState$1", "valueOf", new String[]{"java.lang.String"}, new String[]{"Data"}, true, 0, null, 1);
  assertNotNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput209() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.parser.Tokeniser", "org.jsoup.parser.Tokeniser", "read", new String[]{}, new String[]{}, false, 16, new String[][]{{"org.jsoup.parser.Tokeniser", "createCommentPending", ""}, {"org.jsoup.parser.Tokeniser", "emitTagPending", ""}, {"org.jsoup.parser.Tokeniser", "transition", "org.jsoup.parser.TokeniserState", "<sample:10>"}});
  assertNotNull(actual);
  assertEquals("org.jsoup.parser.Token$Character", actual.getClass().getName());
  assertEquals("<0", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput210() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jsoup.parser.Tokeniser", "org.jsoup.parser.Tokeniser", "read", new String[]{}, new String[]{}, false, 17, new String[][]{{"org.jsoup.parser.Tokeniser", "createCommentPending", ""}, {"org.jsoup.parser.Tokeniser", "emitTagPending", ""}, {"org.jsoup.parser.Tokeniser", "transition", "org.jsoup.parser.TokeniserState", "<sample:10>"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput211() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.parser.Tokeniser", "org.jsoup.parser.Tokeniser", "isTrackErrors", new String[]{}, new String[]{}, false, 8, new String[][]{{"org.jsoup.parser.Tokeniser", "setTrackErrors", "boolean", "false"}, {"org.jsoup.parser.Tokeniser", "emit", "java.lang.String", "<!"}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput212() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.parser.Tokeniser", "org.jsoup.parser.Tokeniser", "read", new String[]{}, new String[]{}, false, 16, new String[][]{{"org.jsoup.parser.Tokeniser", "transition", "org.jsoup.parser.TokeniserState", "<sample:13>"}, {"org.jsoup.parser.Tokeniser", "currentNodeInHtmlNS", ""}});
  assertNotNull(actual);
  assertEquals("org.jsoup.parser.Token$Character", actual.getClass().getName());
  assertEquals("<0", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput213() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.parser.Tokeniser", "org.jsoup.parser.Tokeniser", "emitDoctypePending", new String[]{}, new String[]{}, false, 10, new String[][]{{"org.jsoup.parser.Tokeniser", "createDoctypePending", ""}}, 1);
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput214() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jsoup.parser.Tokeniser", "org.jsoup.parser.Tokeniser", "read", new String[]{}, new String[]{}, false, 1, new String[][]{{"org.jsoup.parser.Tokeniser", "advanceTransition", "org.jsoup.parser.TokeniserState", "<sample:12>"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput215() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.parser.Tokeniser", "org.jsoup.parser.Tokeniser", "getState", new String[]{}, new String[]{}, false, 17, new String[][]{{"org.jsoup.parser.Tokeniser", "advanceTransition", "org.jsoup.parser.TokeniserState", "<null>"}, {"org.jsoup.parser.Tokeniser", "createTempBuffer", ""}}, 3);
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput216() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jsoup.parser.Tokeniser", "org.jsoup.parser.Tokeniser", "read", new String[]{}, new String[]{}, false, 2, new String[][]{{"org.jsoup.parser.Tokeniser", "transition", "org.jsoup.parser.TokeniserState", "<sample:12>"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput217() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jsoup.parser.Tokeniser", "org.jsoup.parser.Tokeniser", "read", new String[]{}, new String[]{}, false, 3, new String[][]{{"org.jsoup.parser.Tokeniser", "transition", "org.jsoup.parser.TokeniserState", "<sample:11>"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput218() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.parser.Tokeniser", "org.jsoup.parser.Tokeniser", "read", new String[]{}, new String[]{}, false, 4, new String[][]{{"org.jsoup.parser.Tokeniser", "transition", "org.jsoup.parser.TokeniserState", "<sample:11>"}});
  assertNotNull(actual);
  assertEquals("org.jsoup.parser.Token$Character", actual.getClass().getName());
  assertEquals("</0", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput219() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.parser.Tokeniser", "org.jsoup.parser.Tokeniser", "appropriateEndTagName", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.jsoup.parser.Tokeniser", "emit", "org.jsoup.parser.Token", "<sample:5>"}});
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput220() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.parser.Tokeniser", "org.jsoup.parser.Tokeniser", "appropriateEndTagName", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.jsoup.parser.Tokeniser", "emit", "org.jsoup.parser.Token", "<sample:5>"}}, 1);
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput221() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jsoup.parser.Tokeniser", "org.jsoup.parser.Tokeniser", "emitTagPending", new String[]{}, new String[]{}, false, 3, new String[][]{{"org.jsoup.parser.Tokeniser", "createTagPending", "boolean", "true"}, {"org.jsoup.parser.Tokeniser", "consumeCharacterReference", "java.lang.Character,boolean", "<", "true"}, {"org.jsoup.parser.Tokeniser", "emitTagPending", ""}}, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput222() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.parser.Tokeniser", "org.jsoup.parser.Tokeniser", "read", new String[]{}, new String[]{}, false, 10, new String[][]{{"org.jsoup.parser.Tokeniser", "advanceTransition", "org.jsoup.parser.TokeniserState", "<sample:8>"}});
  assertNotNull(actual);
  assertEquals("org.jsoup.parser.Token$Character", actual.getClass().getName());
  assertEquals("</", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput223() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.parser.Tokeniser", "org.jsoup.parser.Tokeniser", "read", new String[]{}, new String[]{}, false, 13, new String[][]{{"org.jsoup.parser.Tokeniser", "emitTagPending", ""}, {"org.jsoup.parser.Tokeniser", "advanceTransition", "org.jsoup.parser.TokeniserState", "<sample:8>"}});
  assertNotNull(actual);
  assertEquals("org.jsoup.parser.Token$EOF", actual.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput224() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.parser.Tokeniser", "org.jsoup.parser.Tokeniser", "consumeCharacterReference", new String[]{"java.lang.Character", "boolean"}, new String[]{"0", "false"}, false, 9, new String[][]{{"org.jsoup.parser.Tokeniser", "setTrackErrors", "boolean", "false"}, {"org.jsoup.parser.Tokeniser", "createTempBuffer", ""}, {"org.jsoup.parser.Tokeniser", "advanceTransition", "org.jsoup.parser.TokeniserState", "<sample:11>"}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Character", actual.getClass().getName());
  assertEquals("&", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput225() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.parser.Tokeniser", "org.jsoup.parser.Tokeniser", "read", new String[]{}, new String[]{}, false, 12, new String[][]{{"org.jsoup.parser.Tokeniser", "transition", "org.jsoup.parser.TokeniserState", "<sample:8>"}, {"org.jsoup.parser.Tokeniser", "error", "org.jsoup.parser.TokeniserState", "<sample:11>"}});
  assertNotNull(actual);
  assertEquals("org.jsoup.parser.Token$Comment", actual.getClass().getName());
  assertEquals("<!---->", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput226() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.parser.Tokeniser", "org.jsoup.parser.Tokeniser", "emitCommentPending", new String[]{}, new String[]{}, false, 1, new String[][]{{"org.jsoup.parser.Tokeniser", "createCommentPending", ""}}, 3);
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput227() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.parser.Tokeniser", "org.jsoup.parser.Tokeniser", "isTrackErrors", new String[]{}, new String[]{}, false, 4, new String[][]{{"org.jsoup.parser.Tokeniser", "setTrackErrors", "boolean", "false"}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput228() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.parser.Tokeniser", "org.jsoup.parser.Tokeniser", "emitDoctypePending", new String[]{}, new String[]{}, false, 13, new String[][]{{"org.jsoup.parser.Tokeniser", "createDoctypePending", ""}}, 3);
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput229() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jsoup.parser.TokeniserState", "org.jsoup.parser.TokeniserState$1", "valueOf", new String[]{"java.lang.String"}, new String[]{"<null>"}, true, 0, null, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput230() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.parser.Tokeniser", "org.jsoup.parser.Tokeniser", "appropriateEndTagName", new String[]{}, new String[]{}, false, 10, new String[][]{{"org.jsoup.parser.Tokeniser", "emit", "org.jsoup.parser.Token", "<sample:5>"}, {"org.jsoup.parser.Tokeniser", "consumeCharacterReference", "java.lang.Character,boolean", " ", "true"}, {"org.jsoup.parser.Tokeniser", "createCommentPending", ""}}, 2);
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput231() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.parser.Tokeniser", "org.jsoup.parser.Tokeniser", "consumeCharacterReference", new String[]{"java.lang.Character", "boolean"}, new String[]{"C", "false"}, false, 5, new String[][]{{"org.jsoup.parser.Tokeniser", "emit", "org.jsoup.parser.Token", "<sample:3>"}, {"org.jsoup.parser.Tokeniser", "emitCommentPending", ""}, {"org.jsoup.parser.Tokeniser", "advanceTransition", "org.jsoup.parser.TokeniserState", "<null>"}});
  assertNotNull(actual);
  assertEquals("java.lang.Character", actual.getClass().getName());
  assertEquals("&", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput232() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.parser.Tokeniser", "org.jsoup.parser.Tokeniser", "emitTagPending", new String[]{}, new String[]{}, false, 13, new String[][]{{"org.jsoup.parser.Tokeniser", "advanceTransition", "org.jsoup.parser.TokeniserState", "<sample:7>"}, {"org.jsoup.parser.Tokeniser", "read", ""}}, 1);
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput233() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jsoup.parser.TokeniserState", "org.jsoup.parser.TokeniserState$1", "valueOf", new String[]{"java.lang.String"}, new String[]{"<null>"}, true, 0, null, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput234() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.parser.Tokeniser", "org.jsoup.parser.Tokeniser", "isTrackErrors", new String[]{}, new String[]{}, false, 17, new String[][]{{"org.jsoup.parser.Tokeniser", "emitTagPending", ""}, {"org.jsoup.parser.Tokeniser", "setTrackErrors", "boolean", "false"}, {"org.jsoup.parser.Tokeniser", "eofError", "org.jsoup.parser.TokeniserState", "<sample:1>"}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput235() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.parser.Tokeniser", "org.jsoup.parser.Tokeniser", "getState", new String[]{}, new String[]{}, false, 5, new String[][]{{"org.jsoup.parser.Tokeniser", "advanceTransition", "org.jsoup.parser.TokeniserState", "<null>"}}, 2);
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput236() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jsoup.parser.Tokeniser", "org.jsoup.parser.Tokeniser", "emitTagPending", new String[]{}, new String[]{}, false, 4, new String[][]{{"org.jsoup.parser.Tokeniser", "read", ""}, {"org.jsoup.parser.Tokeniser", "createTagPending", "boolean", "false"}, {"org.jsoup.parser.Tokeniser", "emitTagPending", ""}}, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput237() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.parser.Tokeniser", "org.jsoup.parser.Tokeniser", "consumeCharacterReference", new String[]{"java.lang.Character", "boolean"}, new String[]{"n", "true"}, false, 5, new String[][]{{"org.jsoup.parser.Tokeniser", "emit", "java.lang.String", "<!"}, {"org.jsoup.parser.Tokeniser", "advanceTransition", "org.jsoup.parser.TokeniserState", "<sample:4>"}, {"org.jsoup.parser.Tokeniser", "consumeCharacterReference", "java.lang.Character,boolean", "0", "false"}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Character", actual.getClass().getName());
  assertEquals("\u2264", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput238() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jsoup.parser.Tokeniser", "org.jsoup.parser.Tokeniser", "emitTagPending", new String[]{}, new String[]{}, false, 1, new String[][]{{"org.jsoup.parser.Tokeniser", "createTagPending", "boolean", "true"}, {"org.jsoup.parser.Tokeniser", "emitCommentPending", ""}}, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput239() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.parser.Tokeniser", "org.jsoup.parser.Tokeniser", "read", new String[]{}, new String[]{}, false, 3, new String[][]{{"org.jsoup.parser.Tokeniser", "advanceTransition", "org.jsoup.parser.TokeniserState", "<sample:14>"}, {"org.jsoup.parser.Tokeniser", "emitTagPending", ""}});
  assertNotNull(actual);
  assertEquals("org.jsoup.parser.Token$Character", actual.getClass().getName());
  assertEquals("</", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput240() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jsoup.parser.Tokeniser", "org.jsoup.parser.Tokeniser", "read", new String[]{}, new String[]{}, false, 5, new String[][]{{"org.jsoup.parser.Tokeniser", "advanceTransition", "org.jsoup.parser.TokeniserState", "<sample:14>"}, {"org.jsoup.parser.Tokeniser", "emitTagPending", ""}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput241() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.parser.Tokeniser", "org.jsoup.parser.Tokeniser", "consumeCharacterReference", new String[]{"java.lang.Character", "boolean"}, new String[]{"c", "false"}, false, 1, new String[][]{{"org.jsoup.parser.Tokeniser", "advanceTransition", "org.jsoup.parser.TokeniserState", "<sample:12>"}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Character", actual.getClass().getName());
  assertEquals("&", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput242() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.parser.Tokeniser", "org.jsoup.parser.Tokeniser", "read", new String[]{}, new String[]{}, false, 6, new String[][]{{"org.jsoup.parser.Tokeniser", "createTempBuffer", ""}, {"org.jsoup.parser.Tokeniser", "createTagPending", "boolean", "true"}, {"org.jsoup.parser.Tokeniser", "transition", "org.jsoup.parser.TokeniserState", "<sample:12>"}}, 2);
  assertNotNull(actual);
  assertEquals("org.jsoup.parser.Token$Character", actual.getClass().getName());
  assertEquals("</", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput243() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.parser.Tokeniser", "org.jsoup.parser.Tokeniser", "read", new String[]{}, new String[]{}, false, 7, new String[][]{{"org.jsoup.parser.Tokeniser", "createTempBuffer", ""}, {"org.jsoup.parser.Tokeniser", "createTagPending", "boolean", "true"}, {"org.jsoup.parser.Tokeniser", "transition", "org.jsoup.parser.TokeniserState", "<sample:12>"}}, 2);
  assertNotNull(actual);
  assertEquals("org.jsoup.parser.Token$Character", actual.getClass().getName());
  assertEquals("</a", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput244() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jsoup.parser.TokeniserState", "org.jsoup.parser.TokeniserState$1", "valueOf", new String[]{"java.lang.String"}, new String[]{"<null>"}, true, 0, null, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput245() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.parser.Tokeniser", "org.jsoup.parser.Tokeniser", "appropriateEndTagName", new String[]{}, new String[]{}, false, 10, new String[][]{{"org.jsoup.parser.Tokeniser", "emit", "org.jsoup.parser.Token", "<sample:5>"}}, 3);
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput246() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.parser.Tokeniser", "org.jsoup.parser.Tokeniser", "read", new String[]{}, new String[]{}, false, 13, new String[][]{{"org.jsoup.parser.Tokeniser", "transition", "org.jsoup.parser.TokeniserState", "<sample:16>"}}, 3);
  assertNotNull(actual);
  assertEquals("org.jsoup.parser.Token$Character", actual.getClass().getName());
  assertEquals("<sample", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput247() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.parser.Tokeniser", "org.jsoup.parser.Tokeniser", "read", new String[]{}, new String[]{}, false, 13, new String[][]{{"org.jsoup.parser.Tokeniser", "transition", "org.jsoup.parser.TokeniserState", "<sample:19>"}}, 3);
  assertNotNull(actual);
  assertEquals("org.jsoup.parser.Token$Character", actual.getClass().getName());
  assertEquals("sample", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput248() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.parser.Tokeniser", "org.jsoup.parser.Tokeniser", "read", new String[]{}, new String[]{}, false, 11, new String[][]{{"org.jsoup.parser.Tokeniser", "emit", "char", ";"}, {"org.jsoup.parser.Tokeniser", "advanceTransition", "org.jsoup.parser.TokeniserState", "<sample:20>"}, {"org.jsoup.parser.Tokeniser", "emitTagPending", ""}});
  assertNotNull(actual);
  assertEquals("org.jsoup.parser.Token$Character", actual.getClass().getName());
  assertEquals(";", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput249() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.parser.Tokeniser", "org.jsoup.parser.Tokeniser", "read", new String[]{}, new String[]{}, false, 6, new String[][]{{"org.jsoup.parser.Tokeniser", "advanceTransition", "org.jsoup.parser.TokeniserState", "<sample:21>"}, {"org.jsoup.parser.Tokeniser", "eofError", "org.jsoup.parser.TokeniserState", "<sample:4>"}});
  assertNotNull(actual);
  assertEquals("org.jsoup.parser.Token$EOF", actual.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput250() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.parser.Tokeniser", "org.jsoup.parser.Tokeniser", "read", new String[]{}, new String[]{}, false, 1, new String[][]{{"org.jsoup.parser.Tokeniser", "advanceTransition", "org.jsoup.parser.TokeniserState", "<sample:21>"}, {"org.jsoup.parser.Tokeniser", "eofError", "org.jsoup.parser.TokeniserState", "<sample:2>"}});
  assertNotNull(actual);
  assertEquals("org.jsoup.parser.Token$Character", actual.getClass().getName());
  assertEquals("ample", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput251() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.parser.Tokeniser", "org.jsoup.parser.Tokeniser", "read", new String[]{}, new String[]{}, false, 5, new String[][]{{"org.jsoup.parser.Tokeniser", "advanceTransition", "org.jsoup.parser.TokeniserState", "<sample:23>"}}, 3);
  assertNotNull(actual);
  assertEquals("org.jsoup.parser.Token$Character", actual.getClass().getName());
  assertEquals("ample", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput252() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.parser.Tokeniser", "org.jsoup.parser.Tokeniser", "read", new String[]{}, new String[]{}, false, 6, new String[][]{{"org.jsoup.parser.Tokeniser", "advanceTransition", "org.jsoup.parser.TokeniserState", "<sample:23>"}}, 3);
  assertNotNull(actual);
  assertEquals("org.jsoup.parser.Token$EOF", actual.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput253() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jsoup.parser.Tokeniser", "org.jsoup.parser.Tokeniser", "read", new String[]{}, new String[]{}, false, 5, new String[][]{{"org.jsoup.parser.Tokeniser", "advanceTransition", "org.jsoup.parser.TokeniserState", "<sample:26>"}}, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput254() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.parser.Tokeniser", "org.jsoup.parser.Tokeniser", "read", new String[]{}, new String[]{}, false, 5, new String[][]{{"org.jsoup.parser.Tokeniser", "advanceTransition", "org.jsoup.parser.TokeniserState", "<sample:29>"}}, 3);
  assertNotNull(actual);
  assertEquals("org.jsoup.parser.Token$Character", actual.getClass().getName());
  assertEquals("ample", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput255() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.parser.Tokeniser", "org.jsoup.parser.Tokeniser", "read", new String[]{}, new String[]{}, false, 5, new String[][]{{"org.jsoup.parser.Tokeniser", "advanceTransition", "org.jsoup.parser.TokeniserState", "<sample:30>"}}, 3);
  assertNotNull(actual);
  assertEquals("org.jsoup.parser.Token$Character", actual.getClass().getName());
  assertEquals("ample", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput256() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.parser.Tokeniser", "org.jsoup.parser.Tokeniser", "getState", new String[]{}, new String[]{}, false, 7, new String[][]{{"org.jsoup.parser.Tokeniser", "transition", "org.jsoup.parser.TokeniserState", "<sample:4>"}, {"org.jsoup.parser.Tokeniser", "advanceTransition", "org.jsoup.parser.TokeniserState", "<sample:25>"}, {"org.jsoup.parser.Tokeniser", "read", ""}});
  assertNotNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput257() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.parser.Tokeniser", "org.jsoup.parser.Tokeniser", "read", new String[]{}, new String[]{}, false, 2, new String[][]{{"org.jsoup.parser.Tokeniser", "advanceTransition", "org.jsoup.parser.TokeniserState", "<sample:29>"}});
  assertNotNull(actual);
  assertEquals("org.jsoup.parser.Token$EOF", actual.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput258() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.parser.Tokeniser", "org.jsoup.parser.Tokeniser", "read", new String[]{}, new String[]{}, false, 2, new String[][]{{"org.jsoup.parser.Tokeniser", "setTrackErrors", "boolean", "false"}, {"org.jsoup.parser.Tokeniser", "transition", "org.jsoup.parser.TokeniserState", "<sample:30>"}});
  assertNotNull(actual);
  assertEquals("org.jsoup.parser.Token$EOF", actual.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput259() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jsoup.parser.Tokeniser", "org.jsoup.parser.Tokeniser", "read", new String[]{}, new String[]{}, false, 7, new String[][]{{"org.jsoup.parser.Tokeniser", "transition", "org.jsoup.parser.TokeniserState", "<sample:25>"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput260() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.parser.Tokeniser", "org.jsoup.parser.Tokeniser", "read", new String[]{}, new String[]{}, false, 4, new String[][]{{"org.jsoup.parser.Tokeniser", "advanceTransition", "org.jsoup.parser.TokeniserState", "<sample:24>"}});
  assertNotNull(actual);
  assertEquals("org.jsoup.parser.Token$Character", actual.getClass().getName());
  assertEquals("<", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput261() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.parser.Tokeniser", "org.jsoup.parser.Tokeniser", "read", new String[]{}, new String[]{}, false, 5, new String[][]{{"org.jsoup.parser.Tokeniser", "advanceTransition", "org.jsoup.parser.TokeniserState", "<sample:24>"}});
  assertNotNull(actual);
  assertEquals("org.jsoup.parser.Token$Character", actual.getClass().getName());
  assertEquals("<amplee", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput262() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.parser.Tokeniser", "org.jsoup.parser.Tokeniser", "read", new String[]{}, new String[]{}, false, 19, new String[][]{{"org.jsoup.parser.Tokeniser", "advanceTransition", "org.jsoup.parser.TokeniserState", "<sample:17>"}, {"org.jsoup.parser.Tokeniser", "getState", ""}, {"org.jsoup.parser.Tokeniser", "getState", ""}});
  assertNotNull(actual);
  assertEquals("org.jsoup.parser.Token$Character", actual.getClass().getName());
  assertEquals("</", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput263() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jsoup.parser.Tokeniser", "org.jsoup.parser.Tokeniser", "read", new String[]{}, new String[]{}, false, 29, new String[][]{{"org.jsoup.parser.Tokeniser", "createCommentPending", ""}, {"org.jsoup.parser.Tokeniser", "advanceTransition", "org.jsoup.parser.TokeniserState", "<sample:17>"}, {"org.jsoup.parser.Tokeniser", "getState", ""}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput264() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.parser.Tokeniser", "org.jsoup.parser.Tokeniser", "consumeCharacterReference", new String[]{"java.lang.Character", "boolean"}, new String[]{" ", "false"}, false, 1, new String[][]{{"org.jsoup.parser.Tokeniser", "acknowledgeSelfClosingFlag", ""}, {"org.jsoup.parser.Tokeniser", "advanceTransition", "org.jsoup.parser.TokeniserState", "<sample:15>"}, {"org.jsoup.parser.Tokeniser", "advanceTransition", "org.jsoup.parser.TokeniserState", "<sample:3>"}});
  assertNotNull(actual);
  assertEquals("java.lang.Character", actual.getClass().getName());
  assertEquals("\u2213", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput265() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.parser.Tokeniser", "org.jsoup.parser.Tokeniser", "read", new String[]{}, new String[]{}, false, 5, new String[][]{{"org.jsoup.parser.Tokeniser", "transition", "org.jsoup.parser.TokeniserState", "<sample:22>"}, {"org.jsoup.parser.Tokeniser", "acknowledgeSelfClosingFlag", ""}}, 1);
  assertNotNull(actual);
  assertEquals("org.jsoup.parser.Token$Character", actual.getClass().getName());
  assertEquals("sample", SearchInputFactory_scaffolding.observe(actual));
 }
}
