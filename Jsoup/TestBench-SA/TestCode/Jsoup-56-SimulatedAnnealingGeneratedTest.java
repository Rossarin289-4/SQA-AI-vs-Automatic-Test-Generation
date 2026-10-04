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
  try { SearchInputFactory_scaffolding.call("org.jsoup.parser.XmlTreeBuilder", "org.jsoup.parser.XmlTreeBuilder", "process", new String[]{"org.jsoup.parser.Token"}, new String[]{"<sample:1>"}, false); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput001() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jsoup.parser.XmlTreeBuilder", "org.jsoup.parser.XmlTreeBuilder", "process", new String[]{"org.jsoup.parser.Token"}, new String[]{"<sample:5>"}, false); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput002() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.parser.HtmlTreeBuilderState", "org.jsoup.parser.HtmlTreeBuilderState$1", "values", new String[]{}, new String[]{}, true, 0, null, 3);
  assertNotNull(actual);
  assertEquals("[Lorg.jsoup.parser.HtmlTreeBuilderState;", actual.getClass().getName());
  assertEquals("[Initial, BeforeHtml, BeforeHead, InHead, InHeadNoscript, AfterHead, InBody, Text, InTable, InTableText, InCaption, InColumnGroup, InTableBody, InRow, InCell, InSelect, InSelectInTable, AfterBody, InF...#275#355538594", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput003() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jsoup.nodes.DocumentType", "org.jsoup.nodes.DocumentType", "getOutputSettings", new String[]{}, new String[]{}, false, 16, new String[][]{}), new String[][]{{"clone", "", "7"}});
  assertNotNull(actual);
  assertEquals("org.jsoup.nodes.Document$OutputSettings", actual.getClass().getName());
  assertEquals("receiver state after the call", "<!DOCTYPE a PUBLIC \"0\" \"sample\">", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput004() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.parser.Token", "org.jsoup.parser.Token$Character", "tokenType", new String[]{}, new String[]{}, false, 1, new String[][]{{"org.jsoup.parser.Token", "asCharacter", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("Character", String.valueOf(actual));
  assertEquals("receiver state after the call", "null", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput005() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jsoup.parser.TokeniserState", "org.jsoup.parser.TokeniserState$1", "valueOf", new String[]{"java.lang.String"}, new String[]{"http://example.com/a?b=c"}, true); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput006() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.parser.Token", "org.jsoup.parser.Token$Character", "isEndTag", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.jsoup.parser.Token", "isEOF", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "null", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput007() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jsoup.nodes.DocumentType", "org.jsoup.nodes.DocumentType", "getOutputSettings", new String[]{}, new String[]{}, false, 16, new String[][]{{"org.jsoup.nodes.DocumentType", "siblingIndex", ""}, {"org.jsoup.nodes.DocumentType", "wrap", "java.lang.String", "\t<DOCTYPEpt+^l+c,c0x123456789-0.0"}, {"org.jsoup.nodes.DocumentType", "traverse", "org.jsoup.select.NodeVisitor", "<sample:5>"}}, 2), new String[][]{{"outline", "", "3"}, {"indentAmount", "", "2"}, {"escapeMode", "", "1"}});
  assertNotNull(actual);
  assertEquals("org.jsoup.nodes.Entities$EscapeMode", actual.getClass().getName());
  assertEquals("base", String.valueOf(actual));
  assertEquals("receiver state after the call", "<!DOCTYPE a PUBLIC \"0\" \"sample\">", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput008() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.parser.Token", "org.jsoup.parser.Token$Character", "reset", new String[]{"java.lang.StringBuilder"}, new String[]{"<null>"}, true);
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput009() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.parser.XmlTreeBuilder", "org.jsoup.parser.XmlTreeBuilder", "insert", new String[]{"org.jsoup.parser.Token$Comment"}, new String[]{"<sample:4>"}, false, 0, new String[][]{{"org.jsoup.parser.XmlTreeBuilder", "parse", "java.lang.String,java.lang.String", "\n<!DPCTYPE", "1.1234567890123456"}});
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput010() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.parser.XmlTreeBuilder", "org.jsoup.parser.XmlTreeBuilder", "processEndTag", new String[]{"java.lang.String"}, new String[]{"table"}, false, 0, new String[][]{{"org.jsoup.parser.XmlTreeBuilder", "insert", "org.jsoup.parser.Token$Comment", "<null>"}, {"org.jsoup.parser.XmlTreeBuilder", "parse", "java.lang.String,java.lang.String", "0x1F", "a b"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput011() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.parser.XmlTreeBuilder", "org.jsoup.parser.XmlTreeBuilder", "parseFragment", new String[]{"java.lang.String", "java.lang.String", "org.jsoup.parser.ParseErrorList", "org.jsoup.parser.ParseSettings"}, new String[]{"name", "td", "<null>", "<null>"}, false, 0, new String[][]{{"org.jsoup.parser.XmlTreeBuilder", "parse", "java.lang.String,java.lang.String", "<!doctype", "-0.0"}});
  assertNotNull(actual);
  assertEquals("java.util.Collections$UnmodifiableRandomAccessList", actual.getClass().getName());
  assertEquals("[\nname]", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput012() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jsoup.nodes.DocumentType", "org.jsoup.nodes.DocumentType", "childNodes", new String[]{}, new String[]{}, false, 20, new String[][]{{"org.jsoup.nodes.DocumentType", "remove", ""}, {"org.jsoup.nodes.DocumentType", "wrap", "java.lang.String", "<!e+;ty\nDe+"}, {"org.jsoup.nodes.DocumentType", "wrap", "java.lang.String", "C:9S<<OON2DD6B<!\"eaput8!P+[n!8Yih2 0g4 h4d2S7xxyt2#2233!/"}}), new String[][]{{"lastIndexOf", "java.lang.Object", "7"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("-1", String.valueOf(actual));
  assertEquals("receiver state after the call", "<!DOCTYPE a PUBLIC \"0\" \"sample\">", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput013() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jsoup.nodes.DocumentType", "org.jsoup.nodes.DocumentType", "childNodes", new String[]{}, new String[]{}, false, 20, new String[][]{{"org.jsoup.nodes.DocumentType", "wrap", "java.lang.String", "<!DOCTYPEp5r52  -iD4Bx"}, {"org.jsoup.nodes.DocumentType", "wrap", "java.lang.String", "<<x+O4CYrqPQ \"c0`pott#!t[Ywwlb m/G4 41eX\r4yx100tc21K4,-0.0tbod1y"}}, 1), new String[][]{{"contains", "java.lang.Object", "6"}, {"get", "int", "0"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IndexOutOfBoundsException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput014() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jsoup.nodes.DocumentType", "org.jsoup.nodes.DocumentType", "childNodes", new String[]{}, new String[]{}, false, 20, new String[][]{{"org.jsoup.nodes.DocumentType", "wrap", "java.lang.String", "\t<!DOCTYPEa fallaNd<!!dIoctzpe1.I-12345678"}, {"org.jsoup.nodes.DocumentType", "setParentNode", "org.jsoup.nodes.Node", "<sample:2>"}, {"org.jsoup.nodes.DocumentType", "wrap", "java.lang.String", "\t<!DOCTYPEp"}}), new String[][]{{"isEmpty", "", "4"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
  assertEquals("receiver state after the call", "<!DOCTYPE a PUBLIC \"0\" \"sample\">", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput015() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jsoup.nodes.DocumentType", "org.jsoup.nodes.DocumentType", "childNodes", new String[]{}, new String[]{}, false, 20, new String[][]{{"org.jsoup.nodes.DocumentType", "wrap", "java.lang.String", "\n<!DOCTYPEp ublicId "}, {"org.jsoup.nodes.DocumentType", "wrap", "java.lang.String", "<<yOoAY,trpU<POQ \n\"c0`@fnott#\"u0FY\nXxm#n/aqc.5 \",L.0Title "}}, 1), new String[][]{{"size", "", "7"}, {"clear", "", "5"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.UnsupportedOperationException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput016() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.parser.XmlTreeBuilder", "org.jsoup.parser.XmlTreeBuilder", "parse", new String[]{"java.lang.String", "java.lang.String"}, new String[]{"\t<!DOCTYPEp ublicId0x11i34577891.1234567", "\t<DOCTYPEpt+^l+c,c0x123456789-0.0"}, false, 0, new String[][]{{"org.jsoup.parser.XmlTreeBuilder", "insert", "org.jsoup.parser.Token$Character", "<sample:2>"}});
  assertNotNull(actual);
  assertEquals("org.jsoup.nodes.Document", actual.getClass().getName());
  assertEquals("<!DOCTYPE ublicId0x11i34577891.1234567> {hasText=false, isBlock=false}", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput017() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jsoup.parser.XmlTreeBuilder", "org.jsoup.parser.XmlTreeBuilder", "currentElement", new String[]{}, new String[]{}, false, 12, new String[][]{{"org.jsoup.parser.XmlTreeBuilder", "parseFragment", "java.lang.String,java.lang.String,org.jsoup.parser.ParseErrorList,org.jsoup.parser.ParseSettings", "\010<<ODN2CYC,IpP<!\"c`pptt!7t[n8m0 n0H4 5dX\r5yx1tc21f2334/H;/`naf1.55ee3001E-5-1n<!", "\n<;DOCTYPE", "<null>", "<sample:1>"}, {"org.jsoup.parser.XmlTreeBuilder", "processStartTag", "java.lang.String,org.jsoup.nodes.Attributes", "<<x+O4CYr>qPQ \"c0`pott#!t[Ywwlb m/G4 41eX\r4yx100tc21K4,-0.0tbod1y", "<sample:7>"}}), new String[][]{{"getElementsMatchingText", "java.lang.String", "5"}});
  assertNotNull(actual);
  assertEquals("org.jsoup.select.Elements", actual.getClass().getName());
  assertEquals("[]", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput018() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jsoup.parser.XmlTreeBuilder", "org.jsoup.parser.XmlTreeBuilder", "processStartTag", new String[]{"java.lang.String", "org.jsoup.nodes.Attributes"}, new String[]{"", "<sample:7>"}, false, 0, new String[][]{{"org.jsoup.parser.XmlTreeBuilder", "processStartTag", "java.lang.String,org.jsoup.nodes.Attributes", "1.5", "<null>"}, {"org.jsoup.parser.XmlTreeBuilder", "process", "org.jsoup.parser.Token", "<sample:7>"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput019() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jsoup.nodes.DocumentType", "org.jsoup.nodes.DocumentType", "wrap", new String[]{"java.lang.String"}, new String[]{"7s:<<r\tOb\" Y2t=uq"}, false, 14, new String[][]{{"org.jsoup.nodes.DocumentType", "outerHtmlTail", "java.lang.Appendable,int,org.jsoup.nodes.Document$OutputSettings", "<sample:2>", "32767", "<sample:4>"}, {"org.jsoup.nodes.DocumentType", "before", "java.lang.String", ">+1"}, {"org.jsoup.nodes.DocumentType", "childNodesCopy", ""}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput020() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jsoup.nodes.DocumentType", "org.jsoup.nodes.DocumentType", "wrap", new String[]{"java.lang.String"}, new String[]{"_N\":UM,07,<B\010I@^a_VD,\rx,11n3d___=:u/K@5BX\r>aUU\0141CecA0oP2ci !=<>>-s<!5fdCCATZPE0x"}, false, 11, new String[][]{{"org.jsoup.nodes.DocumentType", "outerHtmlHead", "java.lang.Appendable,int,org.jsoup.nodes.Document$OutputSettings", "<sample:0>", "0", "<sample:1>"}, {"org.jsoup.nodes.DocumentType", "wrap", "java.lang.String", "<`b</a>2162l-02.30T25:14:6"}, {"org.jsoup.nodes.DocumentType", "remove", ""}}, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput021() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jsoup.nodes.DocumentType", "org.jsoup.nodes.DocumentType", "wrap", new String[]{"java.lang.String"}, new String[]{"_\":UM,07,<B\010I@^a_V6D,\rx,12nS3d___=;u/L@5BX\r<apUU\0141,cA0<p1ci !=<X>-s<!5fdCCATZPE0"}, false, 5, new String[][]{{"org.jsoup.nodes.DocumentType", "wrap", "java.lang.String", "<`b</"}}, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput022() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jsoup.parser.HtmlTreeBuilderState", "org.jsoup.parser.HtmlTreeBuilderState$1", "process", new String[]{"org.jsoup.parser.Token", "org.jsoup.parser.HtmlTreeBuilder"}, new String[]{"<sample:7>", "<sample:2>"}, false, 0, new String[][]{{"org.jsoup.parser.HtmlTreeBuilderState", "process", "org.jsoup.parser.Token,org.jsoup.parser.HtmlTreeBuilder", "<sample:4>", "<sample:3>"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput023() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jsoup.nodes.DocumentType", "org.jsoup.nodes.DocumentType", "wrap", new String[]{"java.lang.String"}, new String[]{"gsE.C+SOes,8<Jtsa49:P\"..\"/\r\014a/IJ-mm=S/l6//!6IxuB\014<Mqfq2>n<  gox3X<pYp1 !=<X>-s<!"}, false, 2, new String[][]{{"org.jsoup.nodes.DocumentType", "wrap", "java.lang.String", "1.25"}, {"org.jsoup.nodes.DocumentType", "wrap", "java.lang.String", "\n\n<!DOCTYPE> .<<bicI7 "}, {"org.jsoup.nodes.DocumentType", "wrap", "java.lang.String", "<`b</b>2162l-/2.3022M1.1234567890123456"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput024() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jsoup.nodes.DocumentType", "org.jsoup.nodes.DocumentType", "wrap", new String[]{"java.lang.String"}, new String[]{"8gKB,ROOei.m<gsa4d;:P.-:///\014\016`/IJ.lY1Sl600!TC\014=<qfpho  go3yXS<pYp1 !=<X>-s<!1.1S"}, false, 16, new String[][]{{"org.jsoup.nodes.DocumentType", "wrap", "java.lang.String", "Ye<!DOCTYPEm .<;<=b_c77\n ASYScTEE+#d7octypd<1.5-F<.0abc"}, {"org.jsoup.nodes.DocumentType", "outerHtml", "java.lang.Appendable", "<null>"}, {"org.jsoup.nodes.DocumentType", "wrap", "java.lang.String", "<<`n</ba>/20665533"}}, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput025() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.DocumentType", "org.jsoup.nodes.DocumentType", "wrap", new String[]{"java.lang.String"}, new String[]{"\n\n<!DOCTYE> .<<bibI7 "}, false, 6, new String[][]{{"org.jsoup.nodes.DocumentType", "attr", "java.lang.String", "PUBLIC"}, {"org.jsoup.nodes.DocumentType", "doClone", "org.jsoup.nodes.Node", "<sample:1>"}}, 3);
  assertNull(actual);
  assertEquals("receiver state after the call", "<!DOCTYPE sample \"a\">", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput026() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jsoup.nodes.DocumentType", "org.jsoup.nodes.DocumentType", "wrap", new String[]{"java.lang.String"}, new String[]{"8hh8I#RP:h3ll1<p/2!42!d1ABB/.x//0b/<<_H^//!JK2f/.\n2l$P0yU\"C>sftey8hm#neoPyXX5S<"}, false, 16, new String[][]{{"org.jsoup.nodes.DocumentType", "wrap", "java.lang.String", "Ye<!DOCTYPEm .<;<>=bic77\n ASTcTEF+#d7ocypd<1.5-o<-0abcTitlnecol \""}}, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput027() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jsoup.nodes.DocumentType", "org.jsoup.nodes.DocumentType", "wrap", new String[]{"java.lang.String"}, new String[]{"C87FgKCeQ6Oeix<\"\"g,sst;33d;I.,</0/\014\017`..`J.l_ /T0n!C\r<gp`o  g3nyrepp1 !=<X>-s<!1"}, false, 16, new String[][]{{"org.jsoup.nodes.DocumentType", "childNodesAsArray", ""}, {"org.jsoup.nodes.DocumentType", "outerHtml", ""}, {"org.jsoup.nodes.DocumentType", "wrap", "java.lang.String", "\t<!DOCTYPEpmtD \"2020-02-130T25:61:61"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput028() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jsoup.nodes.DocumentType", "org.jsoup.nodes.DocumentType", "siblingNodes", new String[]{}, new String[]{}, false, 48, new String[][]{{"org.jsoup.nodes.DocumentType", "wrap", "java.lang.String", "/^LLLG\013/1N0o<lO\n\014ACb_^cx,H,-22=:S0qo5fii;;3bm\nEED5 5pH_=>>SYSTEM1.25"}}), new String[][]{{"removeAll", "java.util.Collection", "7"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "<!DOCTYPE a PUBLIC \"0\" \"sample\">", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput029() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jsoup.nodes.DocumentType", "org.jsoup.nodes.DocumentType", "siblingNodes", new String[]{}, new String[]{}, false, 48, new String[][]{{"org.jsoup.nodes.DocumentType", "wrap", "java.lang.String", "\014\r<!DOCTYPE:pttr,202.8-Y-3/TI55:81:6111.123578!:012345611-5namentll12:30:45"}, {"org.jsoup.nodes.DocumentType", "wrap", "java.lang.String", "nxaKL0bYMdPs..YY 00c:<PBF5Gd\rAlmX5<`8a\r+xOl444G.-3=u5:0D5fsip<<ndb\n<XEE6D65pHt="}, {"org.jsoup.nodes.DocumentType", "addChildren", "org.jsoup.nodes.Node[]", "<sample:2>"}}, 2), new String[][]{{"containsAll", "java.util.Collection", "2"}, {"containsAll", "java.util.Collection", "6"}, {"indexOf", "java.lang.Object", "3"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("-1", String.valueOf(actual));
  assertEquals("receiver state after the call", "<!DOCTYPE a PUBLIC \"0\" \"sample\"><!DOCTYPE a PUBLIC \"0\" \"sample\">\n <!--a-->a", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput030() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jsoup.parser.XmlTreeBuilder", "org.jsoup.parser.XmlTreeBuilder", "parse", new String[]{"java.lang.String", "java.lang.String"}, new String[]{"-1.5", "caption"}, false, 0, new String[][]{{"org.jsoup.parser.XmlTreeBuilder", "processEndTag", "java.lang.String", "-0.0"}, {"org.jsoup.parser.XmlTreeBuilder", "parse", "java.lang.String,java.lang.String", "gsE.C+SOes,8<Jtsa49:P\"..\"/\r\014a/IJ-mm=S/l6//!6IxuB\014<Mqfq2>n<  gox3X<pYp1 !=<X>-s<!", "_\":UM,07,<B\010I@^a_V6D,\rx,12nS3d___=;u/L@5BX\r<apUU\0141,cA0<p1ci !=<X>-s<!5fdCCATZPE0"}}), new String[][]{{"getElementsByIndexEquals", "int", "3"}});
  assertNotNull(actual);
  assertEquals("org.jsoup.select.Elements", actual.getClass().getName());
  assertEquals("[]", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput031() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.DocumentType", "org.jsoup.nodes.DocumentType", "parent", new String[]{}, new String[]{}, false, 17, new String[][]{{"org.jsoup.nodes.DocumentType", "attributes", ""}, {"org.jsoup.nodes.DocumentType", "removeAttr", "java.lang.String", "systemId"}, {"org.jsoup.nodes.DocumentType", "replaceWith", "org.jsoup.nodes.Node", "<null>"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "<!doctype 0 sample>", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput032() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.DocumentType", "org.jsoup.nodes.DocumentType", "setParentNode", new String[]{"org.jsoup.nodes.Node"}, new String[]{"<null>"}, false, 7, new String[][]{{"org.jsoup.nodes.DocumentType", "addChildren", "int,org.jsoup.nodes.Node[]", "0", "<sample:1>"}, {"org.jsoup.nodes.DocumentType", "wrap", "java.lang.String", "O067e!UxEh<w7EFKwMx53/h\007.e`N8\014/YaM_43iOpk/>>rx<de8cboSSxf\n=po10-nPyYXS<pYp1 != \""}, {"org.jsoup.nodes.DocumentType", "wrap", "java.lang.String", "SgKB,ROOeei.m<hsa4d;YP.-:///\014\016`/IJ.lY\n1Sl700!TB\014>;qfpho  foPyXS<pYp1 !=<X>-s<!1."}}, 1);
  assertNull(actual);
  assertEquals("receiver state after the call", "<!DOCTYPE a \"0\" \"sample\">\n <#root></#root><!DOCTYPE a PUBLIC \"0\" \"sample\">", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput033() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jsoup.nodes.DocumentType", "org.jsoup.nodes.DocumentType", "wrap", new String[]{"java.lang.String"}, new String[]{"g$DPxdEufps$\"Z#?2#oK</M+_DnX.`e3\"Jvt73y\r!S\r`\035`-MR7!S0fCKaL\r\r<8Ldoa7ys<pp1 !=<X>"}, false, 18, new String[][]{{"org.jsoup.nodes.DocumentType", "wrap", "java.lang.String", "\n<!DOCTYPEp "}, {"org.jsoup.nodes.DocumentType", "doClone", "org.jsoup.nodes.Node", "<sample:1>"}, {"org.jsoup.nodes.DocumentType", "wrap", "java.lang.String", "\n\n\n<!DOCTYPE .<<bicI7m publicId"}}, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput034() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.parser.XmlTreeBuilder", "org.jsoup.parser.XmlTreeBuilder", "parse", new String[]{"java.lang.String", "java.lang.String"}, new String[]{"O6/+yp!UyEh <wyEGLXMx553/m\007e`N9\014/YaM_3iOpl//>=rxce8LboSdx\013<po0-nPyYXS<pYp1 != \"p", "<!e+;ty\nDe+"}, false);
  assertNotNull(actual);
  assertEquals("org.jsoup.nodes.Document", actual.getClass().getName());
  assertEquals("O6/+yp!UyEh \n<wyEGLXMx553 m\007e`N9=\"\" YaM_3iOpl=\"\" />=rxce8LboSdx {hasText=true, isBlock=false}", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput035() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jsoup.nodes.DocumentType", "org.jsoup.nodes.DocumentType", "wrap", new String[]{"java.lang.String"}, new String[]{"Ye<!DOCTYPEmm .<;<>=bic77\n ASTcTEF+#d7ocypd<1.5-o<-0abcTitlnecol \".5"}, false, 14, new String[][]{{"org.jsoup.nodes.DocumentType", "wrap", "java.lang.String", "8gKB,R:OOei.mpgsa4.;:P.-:///\014\016`/IJ.lY1SlD020!TCI><qfphn0 go3LXS<pYp1 !=<X>-s<!1."}, {"org.jsoup.nodes.DocumentType", "childNode", "int", "-2147483648"}}, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput036() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jsoup.nodes.DocumentType", "org.jsoup.nodes.DocumentType", "wrap", new String[]{"java.lang.String"}, new String[]{"</>b</a>"}, false, 9, new String[][]{{"org.jsoup.nodes.DocumentType", "outerHtmlHead", "java.lang.Appendable,int,org.jsoup.nodes.Document$OutputSettings", "<sample:3>", "65534", "<sample:4>"}, {"org.jsoup.nodes.DocumentType", "parentNode", ""}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput037() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jsoup.nodes.DocumentType", "org.jsoup.nodes.DocumentType", "getOutputSettings", new String[]{}, new String[]{}, false, 16, new String[][]{}, 1), new String[][]{{"clone", "", "7"}});
  assertNotNull(actual);
  assertEquals("org.jsoup.nodes.Document$OutputSettings", actual.getClass().getName());
  assertEquals("receiver state after the call", "<!DOCTYPE a PUBLIC \"0\" \"sample\">", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput038() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jsoup.nodes.DocumentType", "org.jsoup.nodes.DocumentType", "getOutputSettings", new String[]{}, new String[]{}, false, 16, new String[][]{{"org.jsoup.nodes.DocumentType", "ownerDocument", ""}}, 3), new String[][]{{"clone", "", "5"}});
  assertNotNull(actual);
  assertEquals("org.jsoup.nodes.Document$OutputSettings", actual.getClass().getName());
  assertEquals("receiver state after the call", "<!DOCTYPE a PUBLIC \"0\" \"sample\">", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput039() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.DocumentType", "org.jsoup.nodes.DocumentType", "hasSameValue", new String[]{"java.lang.Object"}, new String[]{"<sample:0>"}, false, 0, new String[][]{{"org.jsoup.nodes.DocumentType", "nodeName", ""}, {"org.jsoup.nodes.DocumentType", "after", "java.lang.String", "5."}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "<!DOCTYPE a PUBLIC \"0\" \"sample\">", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput040() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jsoup.nodes.DocumentType", "org.jsoup.nodes.DocumentType", "getOutputSettings", new String[]{}, new String[]{}, false, 16, new String[][]{{"org.jsoup.nodes.DocumentType", "setParentNode", "org.jsoup.nodes.Node", "<sample:7>"}, {"org.jsoup.nodes.DocumentType", "absUrl", "java.lang.String", "123456789012345678901234567890"}}, 1), new String[][]{{"outline", "", "7"}, {"charset", "", "3"}, {"isRegistered", "", "3"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
  assertEquals("receiver state after the call", "<!DOCTYPE a PUBLIC \"0\" \"sample\">", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput041() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jsoup.nodes.DocumentType", "org.jsoup.nodes.DocumentType", "getOutputSettings", new String[]{}, new String[]{}, false, 7, new String[][]{{"org.jsoup.nodes.DocumentType", "setParentNode", "org.jsoup.nodes.Node", "<sample:7>"}}, 1), new String[][]{{"outline", "", "7"}, {"charset", "", "3"}, {"isRegistered", "", "3"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
  assertEquals("receiver state after the call", "<!DOCTYPE a \"0\" \"sample\">", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput042() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jsoup.nodes.DocumentType", "org.jsoup.nodes.DocumentType", "getOutputSettings", new String[]{}, new String[]{}, false, 17, new String[][]{{"org.jsoup.nodes.DocumentType", "setParentNode", "org.jsoup.nodes.Node", "<sample:7>"}}, 1), new String[][]{{"outline", "", "7"}, {"charset", "", "3"}, {"isRegistered", "", "3"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
  assertEquals("receiver state after the call", "<!DOCTYPE 0 sample \"a\">", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput043() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.DocumentType", "org.jsoup.nodes.DocumentType", "doClone", new String[]{"org.jsoup.nodes.Node"}, new String[]{"<sample:5>"}, false, 0, new String[][]{{"org.jsoup.nodes.DocumentType", "absUrl", "java.lang.String", "1.25"}, {"org.jsoup.nodes.DocumentType", "parent", ""}}, 1);
  assertNotNull(actual);
  assertEquals("org.jsoup.nodes.DocumentType", actual.getClass().getName());
  assertEquals("<!DOCTYPE a PUBLIC \"0\" \"sample\">", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "<!DOCTYPE a PUBLIC \"0\" \"sample\">", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput044() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jsoup.nodes.DocumentType", "org.jsoup.nodes.DocumentType", "getOutputSettings", new String[]{}, new String[]{}, false, 16, new String[][]{{"org.jsoup.nodes.DocumentType", "traverse", "org.jsoup.select.NodeVisitor", "<sample:2>"}, {"org.jsoup.nodes.DocumentType", "removeAttr", "java.lang.String", "TITLE"}}, 2), new String[][]{{"indentAmount", "", "7"}, {"charset", "", "3"}, {"isRegistered", "", "3"}, {"decode", "java.nio.ByteBuffer", "3"}});
  assertNotNull(actual);
  assertEquals("java.nio.HeapCharBuffer", actual.getClass().getName());
  assertEquals("\ufffd {get=\ufffd, hasArray=true, hasRemaining=false, isDirect=false, isReadOnly=false, length=0}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "<!DOCTYPE a PUBLIC \"0\" \"sample\">", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput045() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jsoup.nodes.DocumentType", "org.jsoup.nodes.DocumentType", "getOutputSettings", new String[]{}, new String[]{}, false, 17, new String[][]{{"org.jsoup.nodes.DocumentType", "traverse", "org.jsoup.select.NodeVisitor", "<sample:2>"}, {"org.jsoup.nodes.DocumentType", "removeAttr", "java.lang.String", "TIITLE"}}, 2), new String[][]{{"indentAmount", "", "7"}, {"charset", "", "3"}, {"isRegistered", "", "3"}, {"decode", "java.nio.ByteBuffer", "3"}});
  assertNotNull(actual);
  assertEquals("java.nio.HeapCharBuffer", actual.getClass().getName());
  assertEquals("\ufffd {get=\ufffd, hasArray=true, hasRemaining=false, isDirect=false, isReadOnly=false, length=0}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "<!DOCTYPE 0 sample \"a\">", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput046() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jsoup.nodes.DocumentType", "org.jsoup.nodes.DocumentType", "getOutputSettings", new String[]{}, new String[]{}, false, 16, new String[][]{{"org.jsoup.nodes.DocumentType", "wrap", "java.lang.String", "65535"}}, 2), new String[][]{{"indentAmount", "", "7"}, {"charset", "", "3"}, {"isRegistered", "", "3"}, {"decode", "java.nio.ByteBuffer", "3"}});
  assertNotNull(actual);
  assertEquals("java.nio.HeapCharBuffer", actual.getClass().getName());
  assertEquals("\ufffd {get=\ufffd, hasArray=true, hasRemaining=false, isDirect=false, isReadOnly=false, length=0}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "<!DOCTYPE a PUBLIC \"0\" \"sample\">", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput047() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jsoup.nodes.DocumentType", "org.jsoup.nodes.DocumentType", "getOutputSettings", new String[]{}, new String[]{}, false, 16, new String[][]{{"org.jsoup.nodes.DocumentType", "wrap", "java.lang.String", "655P5"}}, 2), new String[][]{{"indentAmount", "", "7"}, {"charset", "", "3"}, {"isRegistered", "", "3"}, {"name", "", "3"}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("UTF-8", String.valueOf(actual));
  assertEquals("receiver state after the call", "<!DOCTYPE a PUBLIC \"0\" \"sample\">", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput048() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jsoup.nodes.DocumentType", "org.jsoup.nodes.DocumentType", "getOutputSettings", new String[]{}, new String[]{}, false, 16, new String[][]{{"org.jsoup.nodes.DocumentType", "wrap", "java.lang.String", "#doctype"}}, 2), new String[][]{{"indentAmount", "", "7"}, {"charset", "", "3"}, {"isRegistered", "", "3"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
  assertEquals("receiver state after the call", "<!DOCTYPE a PUBLIC \"0\" \"sample\">", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput049() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jsoup.nodes.DocumentType", "org.jsoup.nodes.DocumentType", "getOutputSettings", new String[]{}, new String[]{}, false, 16, new String[][]{{"org.jsoup.nodes.DocumentType", "wrap", "java.lang.String", "#\roctype"}}, 2), new String[][]{{"indentAmount", "", "7"}, {"charset", "", "3"}});
  assertNotNull(actual);
  assertEquals("sun.nio.cs.UTF_8", actual.getClass().getName());
  assertEquals("UTF-8 {canEncode=true, isRegistered=true}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "<!DOCTYPE a PUBLIC \"0\" \"sample\">", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput050() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jsoup.nodes.DocumentType", "org.jsoup.nodes.DocumentType", "getOutputSettings", new String[]{}, new String[]{}, false, 15, new String[][]{{"org.jsoup.nodes.DocumentType", "wrap", "java.lang.String", "8-.5"}}, 2), new String[][]{{"indentAmount", "", "7"}, {"charset", "", "3"}, {"isRegistered", "", "3"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
  assertEquals("receiver state after the call", "<!DOCTYPE a \"0\" \"sample\">", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput051() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jsoup.nodes.DocumentType", "org.jsoup.nodes.DocumentType", "getOutputSettings", new String[]{}, new String[]{}, false, 16, new String[][]{{"org.jsoup.nodes.DocumentType", "wrap", "java.lang.String", "8-.6"}}, 2), new String[][]{{"indentAmount", "", "7"}, {"charset", "", "3"}, {"historicalName", "", "3"}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("UTF8", String.valueOf(actual));
  assertEquals("receiver state after the call", "<!DOCTYPE a PUBLIC \"0\" \"sample\">", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput052() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jsoup.nodes.DocumentType", "org.jsoup.nodes.DocumentType", "getOutputSettings", new String[]{}, new String[]{}, false, 16, new String[][]{{"org.jsoup.nodes.DocumentType", "wrap", "java.lang.String", "7--6"}}, 2), new String[][]{{"indentAmount", "", "7"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("1", String.valueOf(actual));
  assertEquals("receiver state after the call", "<!DOCTYPE a PUBLIC \"0\" \"sample\">", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput053() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jsoup.nodes.DocumentType", "org.jsoup.nodes.DocumentType", "getOutputSettings", new String[]{}, new String[]{}, false, 16, new String[][]{{"org.jsoup.nodes.DocumentType", "before", "java.lang.String", "12345678901234567890123467F890"}, {"org.jsoup.nodes.DocumentType", "previousSibling", ""}}, 1), new String[][]{{"indentAmount", "", "7"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("1", String.valueOf(actual));
  assertEquals("receiver state after the call", "<!DOCTYPE a PUBLIC \"0\" \"sample\">", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput054() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jsoup.nodes.DocumentType", "org.jsoup.nodes.DocumentType", "getOutputSettings", new String[]{}, new String[]{}, false, 16, new String[][]{{"org.jsoup.nodes.DocumentType", "hasSameValue", "java.lang.Object", "<s:a>"}}, 3), new String[][]{{"indentAmount", "", "6"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("1", String.valueOf(actual));
  assertEquals("receiver state after the call", "<!DOCTYPE a PUBLIC \"0\" \"sample\">", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput055() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jsoup.nodes.DocumentType", "org.jsoup.nodes.DocumentType", "getOutputSettings", new String[]{}, new String[]{}, false, 15, new String[][]{{"org.jsoup.nodes.DocumentType", "hasSameValue", "java.lang.Object", "<s:a>"}}, 3), new String[][]{{"indentAmount", "", "6"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("1", String.valueOf(actual));
  assertEquals("receiver state after the call", "<!DOCTYPE a \"0\" \"sample\">", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput056() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jsoup.nodes.DocumentType", "org.jsoup.nodes.DocumentType", "getOutputSettings", new String[]{}, new String[]{}, false, 17, new String[][]{{"org.jsoup.nodes.DocumentType", "hasSameValue", "java.lang.Object", "<s:a>"}}, 3), new String[][]{{"indentAmount", "", "6"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("1", String.valueOf(actual));
  assertEquals("receiver state after the call", "<!DOCTYPE 0 sample \"a\">", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput057() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jsoup.nodes.DocumentType", "org.jsoup.nodes.DocumentType", "getOutputSettings", new String[]{}, new String[]{}, false, 16, new String[][]{}, 3), new String[][]{{"indentAmount", "int", "6"}, {"syntax", "org.jsoup.nodes.Document$OutputSettings$Syntax", "5"}, {"indentAmount", "", "1"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("3", String.valueOf(actual));
  assertEquals("receiver state after the call", "<!DOCTYPE a PUBLIC \"0\" \"sample\">", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput058() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jsoup.nodes.DocumentType", "org.jsoup.nodes.DocumentType", "before", new String[]{"java.lang.String"}, new String[]{"<null>"}, false, 0, null, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput059() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.parser.Token", "org.jsoup.parser.Token$Character", "reset", new String[]{"java.lang.StringBuilder"}, new String[]{"<empty>"}, true, 0, null, 1);
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput060() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jsoup.parser.XmlTreeBuilder", "org.jsoup.parser.XmlTreeBuilder", "insert", new String[]{"org.jsoup.parser.Token$Doctype"}, new String[]{"<null>"}, false, 0, null, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput061() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.parser.Token", "org.jsoup.parser.Token$Character", "reset", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.jsoup.parser.Token", "isComment", ""}}, 2);
  assertNotNull(actual);
  assertEquals("org.jsoup.parser.Token$Character", actual.getClass().getName());
  assertEquals("null", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "null", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput062() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jsoup.nodes.DocumentType", "org.jsoup.nodes.DocumentType", "childNode", new String[]{"int"}, new String[]{"10"}, false, 0, new String[][]{{"org.jsoup.nodes.DocumentType", "hasSameValue", "java.lang.Object", "<s:key>"}}, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IndexOutOfBoundsException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput063() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jsoup.nodes.DocumentType", "org.jsoup.nodes.DocumentType", "getOutputSettings", new String[]{}, new String[]{}, false, 14, new String[][]{{"org.jsoup.nodes.DocumentType", "outerHtml", "java.lang.Appendable", "<sample:0>"}}, 3), new String[][]{{"escapeMode", "org.jsoup.nodes.Entities$EscapeMode", "3"}});
  assertNotNull(actual);
  assertEquals("org.jsoup.nodes.Document$OutputSettings", actual.getClass().getName());
  assertEquals("receiver state after the call", "<!DOCTYPE sample \"a\">", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput064() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jsoup.nodes.DocumentType", "org.jsoup.nodes.DocumentType", "getOutputSettings", new String[]{}, new String[]{}, false, 16, new String[][]{}, 3), new String[][]{{"prettyPrint", "", "7"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
  assertEquals("receiver state after the call", "<!DOCTYPE a PUBLIC \"0\" \"sample\">", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput065() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jsoup.nodes.DocumentType", "org.jsoup.nodes.DocumentType", "getOutputSettings", new String[]{}, new String[]{}, false, 16, new String[][]{{"org.jsoup.nodes.DocumentType", "outerHtmlTail", "java.lang.Appendable,int,org.jsoup.nodes.Document$OutputSettings", "<sample:2>", "0", "<sample:6>"}, {"org.jsoup.nodes.DocumentType", "after", "org.jsoup.nodes.Node", "<sample:6>"}}, 2), new String[][]{{"indentAmount", "int", "5"}});
  assertNotNull(actual);
  assertEquals("org.jsoup.nodes.Document$OutputSettings", actual.getClass().getName());
  assertEquals("receiver state after the call", "<!DOCTYPE a PUBLIC \"0\" \"sample\">", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput066() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jsoup.nodes.DocumentType", "org.jsoup.nodes.DocumentType", "getOutputSettings", new String[]{}, new String[]{}, false, 16, new String[][]{{"org.jsoup.nodes.DocumentType", "outerHtmlTail", "java.lang.Appendable,int,org.jsoup.nodes.Document$OutputSettings", "<sample:2>", "0", "<sample:6>"}, {"org.jsoup.nodes.DocumentType", "after", "org.jsoup.nodes.Node", "<sample:3>"}}, 2), new String[][]{{"indentAmount", "int", "5"}, {"indentAmount", "", "0"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("2", String.valueOf(actual));
  assertEquals("receiver state after the call", "<!DOCTYPE a PUBLIC \"0\" \"sample\">", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput067() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jsoup.nodes.DocumentType", "org.jsoup.nodes.DocumentType", "getOutputSettings", new String[]{}, new String[]{}, false, 16, new String[][]{{"org.jsoup.nodes.DocumentType", "nextSibling", ""}, {"org.jsoup.nodes.DocumentType", "absUrl", "java.lang.String", "1E-5"}, {"org.jsoup.nodes.DocumentType", "baseUri", ""}}, 3), new String[][]{{"charset", "", "5"}});
  assertNotNull(actual);
  assertEquals("sun.nio.cs.UTF_8", actual.getClass().getName());
  assertEquals("UTF-8 {canEncode=true, isRegistered=true}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "<!DOCTYPE a PUBLIC \"0\" \"sample\">", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput068() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jsoup.nodes.DocumentType", "org.jsoup.nodes.DocumentType", "getOutputSettings", new String[]{}, new String[]{}, false, 16, new String[][]{{"org.jsoup.nodes.DocumentType", "setSiblingIndex", "int", "65534"}, {"org.jsoup.nodes.DocumentType", "html", "java.lang.Appendable", "<null>"}}, 1), new String[][]{{"escapeMode", "", "0"}});
  assertNotNull(actual);
  assertEquals("org.jsoup.nodes.Entities$EscapeMode", actual.getClass().getName());
  assertEquals("base", String.valueOf(actual));
  assertEquals("receiver state after the call", "<!DOCTYPE a PUBLIC \"0\" \"sample\">", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput069() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jsoup.nodes.DocumentType", "org.jsoup.nodes.DocumentType", "getOutputSettings", new String[]{}, new String[]{}, false, 2, new String[][]{{"org.jsoup.nodes.DocumentType", "outerHtml", ""}}, 1), new String[][]{{"escapeMode", "", "6"}, {"syntax", "org.jsoup.nodes.Document$OutputSettings$Syntax", "5"}});
  assertNotNull(actual);
  assertEquals("org.jsoup.nodes.Document$OutputSettings", actual.getClass().getName());
  assertEquals("receiver state after the call", "<!DOCTYPE sample \"a\">", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput070() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.DocumentType", "org.jsoup.nodes.DocumentType", "clone", new String[]{}, new String[]{}, false, 0, null, 2);
  assertNotNull(actual);
  assertEquals("org.jsoup.nodes.DocumentType", actual.getClass().getName());
  assertEquals("<!DOCTYPE a PUBLIC \"0\" \"sample\">", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "<!DOCTYPE a PUBLIC \"0\" \"sample\">", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput071() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.DocumentType", "org.jsoup.nodes.DocumentType", "equals", new String[]{"java.lang.Object"}, new String[]{"<s:b>"}, false, 0, new String[][]{{"org.jsoup.nodes.DocumentType", "remove", ""}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "<!DOCTYPE a PUBLIC \"0\" \"sample\">", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput072() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jsoup.nodes.DocumentType", "org.jsoup.nodes.DocumentType", "getOutputSettings", new String[]{}, new String[]{}, false, 6, new String[][]{{"org.jsoup.nodes.DocumentType", "hasAttr", "java.lang.String", "nCmLe"}, {"org.jsoup.nodes.DocumentType", "setBaseUri", "java.lang.String", ""}}, 2), new String[][]{{"outline", "boolean", "7"}, {"indentAmount", "int", "5"}, {"indentAmount", "int", "6"}, {"indentAmount", "int", "6"}});
  assertNotNull(actual);
  assertEquals("org.jsoup.nodes.Document$OutputSettings", actual.getClass().getName());
  assertEquals("receiver state after the call", "<!DOCTYPE sample \"a\">", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput073() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jsoup.nodes.DocumentType", "org.jsoup.nodes.DocumentType", "getOutputSettings", new String[]{}, new String[]{}, false, 16, new String[][]{{"org.jsoup.nodes.DocumentType", "parent", ""}, {"org.jsoup.nodes.DocumentType", "wrap", "java.lang.String", "a\t"}, {"org.jsoup.nodes.DocumentType", "after", "java.lang.String", ",0"}}, 3), new String[][]{{"outline", "", "0"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "<!DOCTYPE a PUBLIC \"0\" \"sample\">", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput074() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jsoup.nodes.DocumentType", "org.jsoup.nodes.DocumentType", "remove", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.jsoup.nodes.DocumentType", "reparentChild", "org.jsoup.nodes.Node", "<sample:5>"}}, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput075() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jsoup.nodes.DocumentType", "org.jsoup.nodes.DocumentType", "getOutputSettings", new String[]{}, new String[]{}, false, 16, new String[][]{{"org.jsoup.nodes.DocumentType", "doClone", "org.jsoup.nodes.Node", "<sample:2>"}}, 3), new String[][]{{"escapeMode", "", "7"}});
  assertNotNull(actual);
  assertEquals("org.jsoup.nodes.Entities$EscapeMode", actual.getClass().getName());
  assertEquals("base", String.valueOf(actual));
  assertEquals("receiver state after the call", "<!DOCTYPE a PUBLIC \"0\" \"sample\">", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput076() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jsoup.nodes.DocumentType", "org.jsoup.nodes.DocumentType", "getOutputSettings", new String[]{}, new String[]{}, false, 16, new String[][]{{"org.jsoup.nodes.DocumentType", "addChildren", "org.jsoup.nodes.Node[]", "<sample:1>"}}, 3), new String[][]{{"escapeMode", "", "7"}});
  assertNotNull(actual);
  assertEquals("org.jsoup.nodes.Entities$EscapeMode", actual.getClass().getName());
  assertEquals("base", String.valueOf(actual));
  assertEquals("receiver state after the call", "<!DOCTYPE a PUBLIC \"0\" \"sample\">\n <#root></#root><!DOCTYPE a PUBLIC \"0\" \"sample\">", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput077() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jsoup.nodes.DocumentType", "org.jsoup.nodes.DocumentType", "getOutputSettings", new String[]{}, new String[]{}, false, 16, new String[][]{{"org.jsoup.nodes.DocumentType", "addChildren", "org.jsoup.nodes.Node[]", "<sample:0>"}, {"org.jsoup.nodes.DocumentType", "nodeName", ""}}, 1), new String[][]{{"escapeMode", "", "2"}});
  assertNotNull(actual);
  assertEquals("org.jsoup.nodes.Entities$EscapeMode", actual.getClass().getName());
  assertEquals("base", String.valueOf(actual));
  assertEquals("receiver state after the call", "<!DOCTYPE a PUBLIC \"0\" \"sample\">a", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput078() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jsoup.nodes.DocumentType", "org.jsoup.nodes.DocumentType", "getOutputSettings", new String[]{}, new String[]{}, false, 16, new String[][]{{"org.jsoup.nodes.DocumentType", "outerHtmlTail", "java.lang.Appendable,int,org.jsoup.nodes.Document$OutputSettings", "<sample:1>", "1", "<sample:4>"}, {"org.jsoup.nodes.DocumentType", "addChildren", "org.jsoup.nodes.Node[]", "<sample:0>"}, {"org.jsoup.nodes.DocumentType", "nodeName", ""}}, 1), new String[][]{{"escapeMode", "", "2"}, {"charset", "java.lang.String", "7"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.nio.charset.UnsupportedCharsetException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput079() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jsoup.nodes.DocumentType", "org.jsoup.nodes.DocumentType", "getOutputSettings", new String[]{}, new String[]{}, false, 16, new String[][]{{"org.jsoup.nodes.DocumentType", "outerHtmlTail", "java.lang.Appendable,int,org.jsoup.nodes.Document$OutputSettings", "<sample:0>", "1", "<sample:4>"}, {"org.jsoup.nodes.DocumentType", "addChildren", "org.jsoup.nodes.Node[]", "<sample:0>"}, {"org.jsoup.nodes.DocumentType", "nodeName", ""}}, 1), new String[][]{{"escapeMode", "", "2"}, {"charset", "", "7"}});
  assertNotNull(actual);
  assertEquals("sun.nio.cs.UTF_8", actual.getClass().getName());
  assertEquals("UTF-8 {canEncode=true, isRegistered=true}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "<!DOCTYPE a PUBLIC \"0\" \"sample\">a", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput080() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jsoup.nodes.DocumentType", "org.jsoup.nodes.DocumentType", "getOutputSettings", new String[]{}, new String[]{}, false, 16, new String[][]{{"org.jsoup.nodes.DocumentType", "outerHtmlTail", "java.lang.Appendable,int,org.jsoup.nodes.Document$OutputSettings", "<sample:2>", "1", "<sample:3>"}, {"org.jsoup.nodes.DocumentType", "nodeName", ""}}, 1), new String[][]{{"escapeMode", "", "2"}, {"charset", "", "7"}, {"encode", "java.nio.CharBuffer", "1"}});
  assertNotNull(actual);
  assertEquals("java.nio.HeapByteBuffer", actual.getClass().getName());
  assertEquals("java.nio.HeapByteBuffer[pos=0 lim=0 cap=0] {get=!BufferUnderflowException, getChar=!BufferUnderflowException, getDouble=!BufferUnderflowException, getFloat=!BufferUnderflowException, getInt=!BufferUnd...#356#1959125497", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "<!DOCTYPE a PUBLIC \"0\" \"sample\">", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput081() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jsoup.nodes.DocumentType", "org.jsoup.nodes.DocumentType", "getOutputSettings", new String[]{}, new String[]{}, false, 16, new String[][]{{"org.jsoup.nodes.DocumentType", "toString", ""}}, 1), new String[][]{{"escapeMode", "", "2"}, {"charset", "", "7"}, {"aliases", "", "4"}});
  assertNotNull(actual);
  assertEquals("java.util.Collections$UnmodifiableSet", actual.getClass().getName());
  assertEquals("[UTF8, unicode-1-1-utf-8]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "<!DOCTYPE a PUBLIC \"0\" \"sample\">", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput082() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jsoup.nodes.DocumentType", "org.jsoup.nodes.DocumentType", "getOutputSettings", new String[]{}, new String[]{}, false, 16, new String[][]{{"org.jsoup.nodes.DocumentType", "absUrl", "java.lang.String", "1.5e300td"}, {"org.jsoup.nodes.DocumentType", "wrap", "java.lang.String", "Yii8\rXtl<!doctype"}}, 1), new String[][]{{"indentAmount", "int", "2"}, {"charset", "java.lang.String", "7"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.nio.charset.UnsupportedCharsetException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput083() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.parser.Token", "org.jsoup.parser.Token$Character", "isDoctype", new String[]{}, new String[]{}, false, 0, null, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "null", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput084() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jsoup.nodes.DocumentType", "org.jsoup.nodes.DocumentType", "getOutputSettings", new String[]{}, new String[]{}, false, 16, new String[][]{{"org.jsoup.nodes.DocumentType", "absUrl", "java.lang.String", "0.5e310td"}, {"org.jsoup.nodes.DocumentType", "wrap", "java.lang.String", "Y>ii8\rXtl<!doccype"}}, 3), new String[][]{{"indentAmount", "int", "2"}, {"charset", "java.lang.String", "7"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.nio.charset.UnsupportedCharsetException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput085() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jsoup.nodes.DocumentType", "org.jsoup.nodes.DocumentType", "doClone", new String[]{"org.jsoup.nodes.Node"}, new String[]{"<sample:2>"}, false, 0, new String[][]{{"org.jsoup.nodes.DocumentType", "equals", "java.lang.Object", "<sample:0>"}}, 3), new String[][]{{"replaceWith", "org.jsoup.nodes.Node", "1"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.UnsupportedOperationException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput086() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jsoup.nodes.DocumentType", "org.jsoup.nodes.DocumentType", "before", new String[]{"java.lang.String"}, new String[]{"0xFFFFFFFF"}, false, 0, new String[][]{{"org.jsoup.nodes.DocumentType", "ownerDocument", ""}}, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput087() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jsoup.nodes.DocumentType", "org.jsoup.nodes.DocumentType", "replaceWith", new String[]{"org.jsoup.nodes.Node"}, new String[]{"<sample:7>"}, false, 0, new String[][]{{"org.jsoup.nodes.DocumentType", "childNodesCopy", ""}}, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput088() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.parser.XmlTreeBuilder", "org.jsoup.parser.XmlTreeBuilder", "parse", new String[]{"java.lang.String", "java.lang.String"}, new String[]{" ", "systemId"}, false, 0, null, 1);
  assertNotNull(actual);
  assertEquals("org.jsoup.nodes.Document", actual.getClass().getName());
  assertEquals(" {hasText=false, isBlock=false}", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput089() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.DocumentType", "org.jsoup.nodes.DocumentType", "traverse", new String[]{"org.jsoup.select.NodeVisitor"}, new String[]{"<sample:5>"}, false, 0, null, 2);
  assertNotNull(actual);
  assertEquals("org.jsoup.nodes.DocumentType", actual.getClass().getName());
  assertEquals("<!DOCTYPE a PUBLIC \"0\" \"sample\">", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "<!DOCTYPE a PUBLIC \"0\" \"sample\">", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput090() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.parser.TokeniserState", "org.jsoup.parser.TokeniserState$1", "values", new String[]{}, new String[]{}, true, 0, null, 3);
  assertNotNull(actual);
  assertEquals("[Lorg.jsoup.parser.TokeniserState;", actual.getClass().getName());
  assertEquals("[Data, CharacterReferenceInData, Rcdata, CharacterReferenceInRcdata, Rawtext, ScriptData, PLAINTEXT, TagOpen, EndTagOpen, TagName, RcdataLessthanSign, RCDATAEndTagOpen, RCDATAEndTagName, RawtextLessth...#1490#-1802059412", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput091() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.parser.XmlTreeBuilder", "org.jsoup.parser.XmlTreeBuilder", "defaultSettings", new String[]{}, new String[]{}, false, 1, new String[][]{{"org.jsoup.parser.XmlTreeBuilder", "processStartTag", "java.lang.String,org.jsoup.nodes.Attributes", "SYSTEM", "<null>"}}, 3);
  assertNotNull(actual);
  assertEquals("org.jsoup.parser.ParseSettings", actual.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput092() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.DocumentType", "org.jsoup.nodes.DocumentType", "addChildren", new String[]{"int", "org.jsoup.nodes.Node[]"}, new String[]{"0", "<sample:0>"}, false, 0, new String[][]{{"org.jsoup.nodes.DocumentType", "removeAttr", "java.lang.String", "col"}}, 3);
  assertNull(actual);
  assertEquals("receiver state after the call", "<!DOCTYPE a PUBLIC \"0\" \"sample\">a", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput093() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jsoup.nodes.DocumentType", "org.jsoup.nodes.DocumentType", "unwrap", new String[]{}, new String[]{}, false, 0, null, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput094() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jsoup.nodes.DocumentType", "org.jsoup.nodes.DocumentType", "traverse", new String[]{"org.jsoup.select.NodeVisitor"}, new String[]{"<null>"}, false, 1, new String[][]{{"org.jsoup.nodes.DocumentType", "ownerDocument", ""}}, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput095() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jsoup.parser.TokeniserState", "org.jsoup.parser.TokeniserState$1", "valueOf", new String[]{"java.lang.String"}, new String[]{"+1"}, true, 0, null, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput096() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.parser.XmlTreeBuilder", "org.jsoup.parser.XmlTreeBuilder", "parse", new String[]{"java.lang.String", "java.lang.String"}, new String[]{"1E-5", "col"}, false, 0, null, 2);
  assertNotNull(actual);
  assertEquals("org.jsoup.nodes.Document", actual.getClass().getName());
  assertEquals("1E-5 {hasText=true, isBlock=false}", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput097() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.DocumentType", "org.jsoup.nodes.DocumentType", "addChildren", new String[]{"org.jsoup.nodes.Node[]"}, new String[]{"<sample:2>"}, false, 0, null, 1);
  assertNull(actual);
  assertEquals("receiver state after the call", "<!DOCTYPE a PUBLIC \"0\" \"sample\"><!DOCTYPE a PUBLIC \"0\" \"sample\">\n <!--a-->a", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput098() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jsoup.nodes.DocumentType", "org.jsoup.nodes.DocumentType", "removeAttr", new String[]{"java.lang.String"}, new String[]{"tbody"}, false, 0, null, 1), new String[][]{{"siblingIndex", "", "3"}, {"siblingIndex", "", "2"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "<!DOCTYPE a PUBLIC \"0\" \"sample\">", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput099() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.parser.XmlTreeBuilder", "org.jsoup.parser.XmlTreeBuilder", "defaultSettings", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.jsoup.parser.XmlTreeBuilder", "defaultSettings", ""}}, 1);
  assertNotNull(actual);
  assertEquals("org.jsoup.parser.ParseSettings", actual.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput100() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jsoup.parser.XmlTreeBuilder", "org.jsoup.parser.XmlTreeBuilder", "runParser", new String[]{}, new String[]{}, false, 0, null, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput101() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.DocumentType", "org.jsoup.nodes.DocumentType", "toString", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.jsoup.nodes.DocumentType", "reparentChild", "org.jsoup.nodes.Node", "<sample:7>"}, {"org.jsoup.nodes.DocumentType", "parentNode", ""}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("<!DOCTYPE a PUBLIC \"0\" \"sample\">", String.valueOf(actual));
  assertEquals("receiver state after the call", "<!DOCTYPE a PUBLIC \"0\" \"sample\">", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput102() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.parser.XmlTreeBuilder", "org.jsoup.parser.XmlTreeBuilder", "parse", new String[]{"java.lang.String", "java.lang.String"}, new String[]{" \"", "-0.0"}, false, 0, new String[][]{{"org.jsoup.parser.XmlTreeBuilder", "process", "org.jsoup.parser.Token", "<sample:3>"}}, 3);
  assertNotNull(actual);
  assertEquals("org.jsoup.nodes.Document", actual.getClass().getName());
  assertEquals("\" {hasText=true, isBlock=false}", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput103() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jsoup.parser.XmlTreeBuilder", "org.jsoup.parser.XmlTreeBuilder", "runParser", new String[]{}, new String[]{}, false, 0, null, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput104() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.DocumentType", "org.jsoup.nodes.DocumentType", "doClone", new String[]{"org.jsoup.nodes.Node"}, new String[]{"<sample:6>"}, false, 0, null, 3);
  assertNotNull(actual);
  assertEquals("org.jsoup.nodes.DocumentType", actual.getClass().getName());
  assertEquals("<!DOCTYPE a PUBLIC \"0\" \"sample\">", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "<!DOCTYPE a PUBLIC \"0\" \"sample\">", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput105() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.DocumentType", "org.jsoup.nodes.DocumentType", "absUrl", new String[]{"java.lang.String"}, new String[]{"systemId"}, false, 0, new String[][]{{"org.jsoup.nodes.DocumentType", "replaceWith", "org.jsoup.nodes.Node", "<sample:7>"}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("", String.valueOf(actual));
  assertEquals("receiver state after the call", "<!DOCTYPE a PUBLIC \"0\" \"sample\">", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput106() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.parser.Token", "org.jsoup.parser.Token$Character", "asCharacter", new String[]{}, new String[]{}, false, 0, null, 2);
  assertNotNull(actual);
  assertEquals("org.jsoup.parser.Token$Character", actual.getClass().getName());
  assertEquals("null", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "null", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput107() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jsoup.nodes.DocumentType", "org.jsoup.nodes.DocumentType", "addChildren", new String[]{"int", "org.jsoup.nodes.Node[]"}, new String[]{"65534", "<sample:1>"}, false, 0, new String[][]{{"org.jsoup.nodes.DocumentType", "hasAttr", "java.lang.String", "<null>"}}, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IndexOutOfBoundsException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput108() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.DocumentType", "org.jsoup.nodes.DocumentType", "ownerDocument", new String[]{}, new String[]{}, false, 0, null, 3);
  assertNull(actual);
  assertEquals("receiver state after the call", "<!DOCTYPE a PUBLIC \"0\" \"sample\">", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput109() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.parser.XmlTreeBuilder", "org.jsoup.parser.XmlTreeBuilder", "parse", new String[]{"java.lang.String", "java.lang.String"}, new String[]{"+1", "1.12345678"}, false, 0, null, 1);
  assertNotNull(actual);
  assertEquals("org.jsoup.nodes.Document", actual.getClass().getName());
  assertEquals("+1 {hasText=true, isBlock=false}", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput110() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jsoup.nodes.DocumentType", "org.jsoup.nodes.DocumentType", "childNodes", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.jsoup.nodes.DocumentType", "childNodeSize", ""}}, 1), new String[][]{{"contains", "java.lang.Object", "7"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "<!DOCTYPE a PUBLIC \"0\" \"sample\">", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput111() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.parser.XmlTreeBuilder", "org.jsoup.parser.XmlTreeBuilder", "defaultSettings", new String[]{}, new String[]{}, false, 0, null, 2);
  assertNotNull(actual);
  assertEquals("org.jsoup.parser.ParseSettings", actual.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput112() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.DocumentType", "org.jsoup.nodes.DocumentType", "ownerDocument", new String[]{}, new String[]{}, false);
  assertNull(actual);
  assertEquals("receiver state after the call", "<!DOCTYPE a PUBLIC \"0\" \"sample\">", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput113() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.DocumentType", "org.jsoup.nodes.DocumentType", "ownerDocument", new String[]{}, new String[]{}, false, 1, new String[][]{});
  assertNull(actual);
  assertEquals("receiver state after the call", "<!DOCTYPE 0 sample \"a\">", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput114() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.DocumentType", "org.jsoup.nodes.DocumentType", "ownerDocument", new String[]{}, new String[]{}, false, 2, new String[][]{});
  assertNull(actual);
  assertEquals("receiver state after the call", "<!DOCTYPE sample \"a\">", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput115() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.DocumentType", "org.jsoup.nodes.DocumentType", "ownerDocument", new String[]{}, new String[]{}, false, 3, new String[][]{});
  assertNull(actual);
  assertEquals("receiver state after the call", "<!DOCTYPE a \"0\" \"sample\">", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput116() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.parser.XmlTreeBuilder", "org.jsoup.parser.XmlTreeBuilder", "process", new String[]{"org.jsoup.parser.Token"}, new String[]{"<sample:3>"}, false);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput117() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.DocumentType", "org.jsoup.nodes.DocumentType", "getOutputSettings", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.jsoup.nodes.DocumentType", "replaceChild", "org.jsoup.nodes.Node,org.jsoup.nodes.Node", "<sample:7>", "<null>"}, {"org.jsoup.nodes.DocumentType", "traverse", "org.jsoup.select.NodeVisitor", "<null>"}});
  assertNotNull(actual);
  assertEquals("org.jsoup.nodes.Document$OutputSettings", actual.getClass().getName());
  assertEquals("receiver state after the call", "<!DOCTYPE a PUBLIC \"0\" \"sample\">", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput118() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.DocumentType", "org.jsoup.nodes.DocumentType", "getOutputSettings", new String[]{}, new String[]{}, false, 1, new String[][]{{"org.jsoup.nodes.DocumentType", "replaceChild", "org.jsoup.nodes.Node,org.jsoup.nodes.Node", "<sample:7>", "<null>"}, {"org.jsoup.nodes.DocumentType", "traverse", "org.jsoup.select.NodeVisitor", "<null>"}});
  assertNotNull(actual);
  assertEquals("org.jsoup.nodes.Document$OutputSettings", actual.getClass().getName());
  assertEquals("receiver state after the call", "<!DOCTYPE 0 sample \"a\">", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput119() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.DocumentType", "org.jsoup.nodes.DocumentType", "getOutputSettings", new String[]{}, new String[]{}, false, 2, new String[][]{{"org.jsoup.nodes.DocumentType", "replaceChild", "org.jsoup.nodes.Node,org.jsoup.nodes.Node", "<sample:7>", "<null>"}, {"org.jsoup.nodes.DocumentType", "traverse", "org.jsoup.select.NodeVisitor", "<null>"}});
  assertNotNull(actual);
  assertEquals("org.jsoup.nodes.Document$OutputSettings", actual.getClass().getName());
  assertEquals("receiver state after the call", "<!DOCTYPE sample \"a\">", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput120() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.DocumentType", "org.jsoup.nodes.DocumentType", "getOutputSettings", new String[]{}, new String[]{}, false, 3, new String[][]{{"org.jsoup.nodes.DocumentType", "replaceChild", "org.jsoup.nodes.Node,org.jsoup.nodes.Node", "<sample:7>", "<null>"}, {"org.jsoup.nodes.DocumentType", "traverse", "org.jsoup.select.NodeVisitor", "<null>"}});
  assertNotNull(actual);
  assertEquals("org.jsoup.nodes.Document$OutputSettings", actual.getClass().getName());
  assertEquals("receiver state after the call", "<!DOCTYPE a \"0\" \"sample\">", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput121() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.DocumentType", "org.jsoup.nodes.DocumentType", "attr", new String[]{"java.lang.String"}, new String[]{"010"}, false, 0, new String[][]{{"org.jsoup.nodes.DocumentType", "toString", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("", String.valueOf(actual));
  assertEquals("receiver state after the call", "<!DOCTYPE a PUBLIC \"0\" \"sample\">", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput122() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jsoup.nodes.DocumentType", "org.jsoup.nodes.DocumentType", "getOutputSettings", new String[]{}, new String[]{}, false, 16, new String[][]{{"org.jsoup.nodes.DocumentType", "reparentChild", "org.jsoup.nodes.Node", "<sample:7>"}}), new String[][]{{"clone", "", "7"}, {"clone", "", "5"}, {"prettyPrint", "", "0"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
  assertEquals("receiver state after the call", "<!DOCTYPE a PUBLIC \"0\" \"sample\">", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput123() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.DocumentType", "org.jsoup.nodes.DocumentType", "absUrl", new String[]{"java.lang.String"}, new String[]{"\n"}, false, 0, new String[][]{{"org.jsoup.nodes.DocumentType", "parent", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("", String.valueOf(actual));
  assertEquals("receiver state after the call", "<!DOCTYPE a PUBLIC \"0\" \"sample\">", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput124() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.DocumentType", "org.jsoup.nodes.DocumentType", "ensureChildNodes", new String[]{}, new String[]{}, false);
  assertNull(actual);
  assertEquals("receiver state after the call", "<!DOCTYPE a PUBLIC \"0\" \"sample\">", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput125() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jsoup.nodes.DocumentType", "org.jsoup.nodes.DocumentType", "getOutputSettings", new String[]{}, new String[]{}, false, 16, new String[][]{{"org.jsoup.nodes.DocumentType", "ownerDocument", ""}}), new String[][]{{"clone", "", "5"}, {"charset", "java.lang.String", "4"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.nio.charset.IllegalCharsetNameException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput126() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jsoup.nodes.DocumentType", "org.jsoup.nodes.DocumentType", "getOutputSettings", new String[]{}, new String[]{}, false, 16, new String[][]{{"org.jsoup.nodes.DocumentType", "ownerDocument", ""}}), new String[][]{{"outline", "", "7"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "<!DOCTYPE a PUBLIC \"0\" \"sample\">", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput127() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jsoup.nodes.DocumentType", "org.jsoup.nodes.DocumentType", "getOutputSettings", new String[]{}, new String[]{}, false, 16, new String[][]{{"org.jsoup.nodes.DocumentType", "ownerDocument", ""}}), new String[][]{{"outline", "", "7"}, {"charset", "", "3"}});
  assertNotNull(actual);
  assertEquals("sun.nio.cs.UTF_8", actual.getClass().getName());
  assertEquals("UTF-8 {canEncode=true, isRegistered=true}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "<!DOCTYPE a PUBLIC \"0\" \"sample\">", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput128() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jsoup.parser.XmlTreeBuilder", "org.jsoup.parser.XmlTreeBuilder", "processStartTag", new String[]{"java.lang.String"}, new String[]{"010"}, false); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput129() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jsoup.nodes.DocumentType", "org.jsoup.nodes.DocumentType", "getOutputSettings", new String[]{}, new String[]{}, false, 16, new String[][]{}), new String[][]{{"outline", "", "7"}, {"charset", "", "3"}, {"isRegistered", "", "3"}, {"newEncoder", "", "5"}});
  assertNotNull(actual);
  assertEquals("sun.nio.cs.UTF_8$Encoder", actual.getClass().getName());
  assertEquals("receiver state after the call", "<!DOCTYPE a PUBLIC \"0\" \"sample\">", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput130() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.DocumentType", "org.jsoup.nodes.DocumentType", "previousSibling", new String[]{}, new String[]{}, false);
  assertNull(actual);
  assertEquals("receiver state after the call", "<!DOCTYPE a PUBLIC \"0\" \"sample\">", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput131() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.DocumentType", "org.jsoup.nodes.DocumentType", "indent", new String[]{"java.lang.Appendable", "int", "org.jsoup.nodes.Document$OutputSettings"}, new String[]{"<sample:1>", "65535", "<sample:3>"}, false, 0, new String[][]{{"org.jsoup.nodes.DocumentType", "ensureChildNodes", ""}, {"org.jsoup.nodes.DocumentType", "doClone", "org.jsoup.nodes.Node", "<sample:1>"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "<!DOCTYPE a PUBLIC \"0\" \"sample\">", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput132() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.DocumentType", "org.jsoup.nodes.DocumentType", "reparentChild", new String[]{"org.jsoup.nodes.Node"}, new String[]{"<sample:1>"}, false);
  assertNull(actual);
  assertEquals("receiver state after the call", "<!DOCTYPE a PUBLIC \"0\" \"sample\">", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput133() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.DocumentType", "org.jsoup.nodes.DocumentType", "hasSameValue", new String[]{"java.lang.Object"}, new String[]{"<s:key>"}, false, 0, new String[][]{{"org.jsoup.nodes.DocumentType", "attributes", ""}, {"org.jsoup.nodes.DocumentType", "hasAttr", "java.lang.String", "tfoot"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "<!DOCTYPE a PUBLIC \"0\" \"sample\">", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput134() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jsoup.nodes.DocumentType", "org.jsoup.nodes.DocumentType", "getOutputSettings", new String[]{}, new String[]{}, false, 16, new String[][]{{"org.jsoup.nodes.DocumentType", "setParentNode", "org.jsoup.nodes.Node", "<sample:6>"}, {"org.jsoup.nodes.DocumentType", "parentNode", ""}}), new String[][]{{"outline", "", "7"}, {"charset", "", "3"}, {"isRegistered", "", "3"}, {"decode", "java.nio.ByteBuffer", "3"}});
  assertNotNull(actual);
  assertEquals("java.nio.HeapCharBuffer", actual.getClass().getName());
  assertEquals("\ufffd {get=\ufffd, hasArray=true, hasRemaining=false, isDirect=false, isReadOnly=false, length=0}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "<!DOCTYPE a PUBLIC \"0\" \"sample\">", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput135() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jsoup.parser.XmlTreeBuilder", "org.jsoup.parser.XmlTreeBuilder", "insert", new String[]{"org.jsoup.parser.Token$Doctype"}, new String[]{"<sample:4>"}, false); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput136() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.DocumentType", "org.jsoup.nodes.DocumentType", "setBaseUri", new String[]{"java.lang.String"}, new String[]{"tbody"}, false, 6, new String[][]{{"org.jsoup.nodes.DocumentType", "clone", ""}});
  assertNull(actual);
  assertEquals("receiver state after the call", "<!DOCTYPE sample \"a\">", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput137() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jsoup.parser.XmlTreeBuilder", "org.jsoup.parser.XmlTreeBuilder", "process", new String[]{"org.jsoup.parser.Token"}, new String[]{"<null>"}, false, 0, new String[][]{{"org.jsoup.parser.XmlTreeBuilder", "parseFragment", "java.lang.String,java.lang.String,org.jsoup.parser.ParseErrorList,org.jsoup.parser.ParseSettings", "+1", "<!doctype", "<sample:6>", "<sample:2>"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput138() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jsoup.nodes.DocumentType", "org.jsoup.nodes.DocumentType", "replaceWith", new String[]{"org.jsoup.nodes.Node"}, new String[]{"<sample:7>"}, false); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput139() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.DocumentType", "org.jsoup.nodes.DocumentType", "hasAttr", new String[]{"java.lang.String"}, new String[]{"td"}, false);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "<!DOCTYPE a PUBLIC \"0\" \"sample\">", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput140() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jsoup.parser.HtmlTreeBuilderState", "org.jsoup.parser.HtmlTreeBuilderState$1", "process", new String[]{"org.jsoup.parser.Token", "org.jsoup.parser.HtmlTreeBuilder"}, new String[]{"<sample:5>", "<sample:0>"}, false); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput141() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.DocumentType", "org.jsoup.nodes.DocumentType", "childNodes", new String[]{}, new String[]{}, false);
  assertNotNull(actual);
  assertEquals("java.util.Collections$UnmodifiableRandomAccessList", actual.getClass().getName());
  assertEquals("[]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "<!DOCTYPE a PUBLIC \"0\" \"sample\">", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput142() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jsoup.parser.XmlTreeBuilder", "org.jsoup.parser.XmlTreeBuilder", "insert", new String[]{"org.jsoup.parser.Token$Comment"}, new String[]{"<sample:4>"}, false, 4, new String[][]{{"org.jsoup.parser.XmlTreeBuilder", "process", "org.jsoup.parser.Token", "<sample:4>"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput143() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.DocumentType", "org.jsoup.nodes.DocumentType", "toString", new String[]{}, new String[]{}, false, 7, new String[][]{{"org.jsoup.nodes.DocumentType", "childNodesAsArray", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("<!DOCTYPE a \"0\" \"sample\">", String.valueOf(actual));
  assertEquals("receiver state after the call", "<!DOCTYPE a \"0\" \"sample\">", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput144() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.DocumentType", "org.jsoup.nodes.DocumentType", "hasSameValue", new String[]{"java.lang.Object"}, new String[]{"<i:-1>"}, false, 1, new String[][]{{"org.jsoup.nodes.DocumentType", "indent", "java.lang.Appendable,int,org.jsoup.nodes.Document$OutputSettings", "<empty>", "1", "<sample:1>"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "<!DOCTYPE 0 sample \"a\">", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput145() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jsoup.nodes.DocumentType", "org.jsoup.nodes.DocumentType", "removeChild", new String[]{"org.jsoup.nodes.Node"}, new String[]{"<sample:1>"}, false); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput146() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jsoup.nodes.DocumentType", "org.jsoup.nodes.DocumentType", "getOutputSettings", new String[]{}, new String[]{}, false, 16, new String[][]{{"org.jsoup.nodes.DocumentType", "before", "java.lang.String", "12345678901234567890123467F890"}}), new String[][]{{"indentAmount", "", "7"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("1", String.valueOf(actual));
  assertEquals("receiver state after the call", "<!DOCTYPE a PUBLIC \"0\" \"sample\">", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput147() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.parser.Token", "org.jsoup.parser.Token$Character", "reset", new String[]{"java.lang.StringBuilder"}, new String[]{"<sample:2>"}, true);
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput148() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jsoup.nodes.DocumentType", "org.jsoup.nodes.DocumentType", "replaceChild", new String[]{"org.jsoup.nodes.Node", "org.jsoup.nodes.Node"}, new String[]{"<sample:5>", "<null>"}, false); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput149() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.parser.Token", "org.jsoup.parser.Token$Character", "asCharacter", new String[]{}, new String[]{}, false);
  assertNotNull(actual);
  assertEquals("org.jsoup.parser.Token$Character", actual.getClass().getName());
  assertEquals("null", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "null", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput150() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.DocumentType", "org.jsoup.nodes.DocumentType", "childNodes", new String[]{}, new String[]{}, false, 7, new String[][]{{"org.jsoup.nodes.DocumentType", "toString", ""}});
  assertNotNull(actual);
  assertEquals("java.util.Collections$UnmodifiableRandomAccessList", actual.getClass().getName());
  assertEquals("[]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "<!DOCTYPE a \"0\" \"sample\">", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput151() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jsoup.parser.Token", "org.jsoup.parser.Token$Character", "asEndTag", new String[]{}, new String[]{}, false); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.ClassCastException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput152() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.parser.XmlTreeBuilder", "org.jsoup.parser.XmlTreeBuilder", "processStartTag", new String[]{"java.lang.String", "org.jsoup.nodes.Attributes"}, new String[]{"TITLE", "<sample:5>"}, false, 0, new String[][]{{"org.jsoup.parser.XmlTreeBuilder", "parse", "java.lang.String,java.lang.String", "1.12345678901234567", "[1,2]"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput153() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jsoup.nodes.DocumentType", "org.jsoup.nodes.DocumentType", "outerHtml", new String[]{"java.lang.Appendable"}, new String[]{"<null>"}, false); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput154() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jsoup.parser.Token", "org.jsoup.parser.Token$Character", "asComment", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.jsoup.parser.Token", "isEndTag", ""}, {"org.jsoup.parser.Token", "isEndTag", ""}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.ClassCastException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput155() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jsoup.nodes.DocumentType", "org.jsoup.nodes.DocumentType", "after", new String[]{"java.lang.String"}, new String[]{"2147483648"}, false, 0, new String[][]{{"org.jsoup.nodes.DocumentType", "setSiblingIndex", "int", "65534"}, {"org.jsoup.nodes.DocumentType", "childNodes", ""}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput156() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.DocumentType", "org.jsoup.nodes.DocumentType", "outerHtml", new String[]{"java.lang.Appendable"}, new String[]{"<sample:3>"}, false);
  assertNull(actual);
  assertEquals("receiver state after the call", "<!DOCTYPE a PUBLIC \"0\" \"sample\">", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput157() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jsoup.nodes.DocumentType", "org.jsoup.nodes.DocumentType", "before", new String[]{"org.jsoup.nodes.Node"}, new String[]{"<sample:7>"}, false); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput158() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.parser.XmlTreeBuilder", "org.jsoup.parser.XmlTreeBuilder", "parseFragment", new String[]{"java.lang.String", "java.lang.String", "org.jsoup.parser.ParseErrorList", "org.jsoup.parser.ParseSettings"}, new String[]{"1.5d", "tbody", "<null>", "<null>"}, false);
  assertNotNull(actual);
  assertEquals("java.util.Collections$UnmodifiableRandomAccessList", actual.getClass().getName());
  assertEquals("[\n1.5d]", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput159() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jsoup.nodes.DocumentType", "org.jsoup.nodes.DocumentType", "before", new String[]{"java.lang.String"}, new String[]{"name"}, false, 0, new String[][]{{"org.jsoup.nodes.DocumentType", "clone", ""}, {"org.jsoup.nodes.DocumentType", "getOutputSettings", ""}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput160() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jsoup.nodes.DocumentType", "org.jsoup.nodes.DocumentType", "remove", new String[]{}, new String[]{}, false); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput161() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jsoup.nodes.DocumentType", "org.jsoup.nodes.DocumentType", "unwrap", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.jsoup.nodes.DocumentType", "removeAttr", "java.lang.String", "#doctype"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput162() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.DocumentType", "org.jsoup.nodes.DocumentType", "parentNode", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.jsoup.nodes.DocumentType", "removeAttr", "java.lang.String", "1.1234567890123456"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "<!DOCTYPE a PUBLIC \"0\" \"sample\">", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput163() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.DocumentType", "org.jsoup.nodes.DocumentType", "attributes", new String[]{}, new String[]{}, false, 4, new String[][]{{"org.jsoup.nodes.DocumentType", "removeAttr", "java.lang.String", "{\"a\":1}"}});
  assertNotNull(actual);
  assertEquals("org.jsoup.nodes.Attributes", actual.getClass().getName());
  assertEquals(" name=\"a\" publicId=\"0\" pubSysKey=\"PUBLIC\" systemId=\"sample\" {size=4}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "<!DOCTYPE a PUBLIC \"0\" \"sample\">", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput164() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.DocumentType", "org.jsoup.nodes.DocumentType", "addChildren", new String[]{"int", "org.jsoup.nodes.Node[]"}, new String[]{"65536", "<empty>"}, false);
  assertNull(actual);
  assertEquals("receiver state after the call", "<!DOCTYPE a PUBLIC \"0\" \"sample\">", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput165() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.DocumentType", "org.jsoup.nodes.DocumentType", "setSiblingIndex", new String[]{"int"}, new String[]{"2147483647"}, false, 0, new String[][]{{"org.jsoup.nodes.DocumentType", "previousSibling", ""}});
  assertNull(actual);
  assertEquals("receiver state after the call", "<!DOCTYPE a PUBLIC \"0\" \"sample\">", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput166() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jsoup.parser.Token", "org.jsoup.parser.Token$Character", "asStartTag", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.jsoup.parser.Token", "isComment", ""}, {"org.jsoup.parser.Token", "isStartTag", ""}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.ClassCastException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput167() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jsoup.parser.XmlTreeBuilder", "org.jsoup.parser.XmlTreeBuilder", "insert", new String[]{"org.jsoup.parser.Token$Character"}, new String[]{"<sample:5>"}, false); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput168() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.parser.Token", "org.jsoup.parser.Token$Character", "isStartTag", new String[]{}, new String[]{}, false);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "null", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput169() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jsoup.parser.HtmlTreeBuilderState", "org.jsoup.parser.HtmlTreeBuilderState$1", "process", new String[]{"org.jsoup.parser.Token", "org.jsoup.parser.HtmlTreeBuilder"}, new String[]{"<sample:3>", "<sample:6>"}, false); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput170() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.DocumentType", "org.jsoup.nodes.DocumentType", "nodeName", new String[]{}, new String[]{}, false);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("#doctype", String.valueOf(actual));
  assertEquals("receiver state after the call", "<!DOCTYPE a PUBLIC \"0\" \"sample\">", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput171() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.DocumentType", "org.jsoup.nodes.DocumentType", "outerHtmlHead", new String[]{"java.lang.Appendable", "int", "org.jsoup.nodes.Document$OutputSettings"}, new String[]{"<empty>", "65535", "<sample:6>"}, false);
  assertNull(actual);
  assertEquals("receiver state after the call", "<!DOCTYPE a PUBLIC \"0\" \"sample\">", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput172() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jsoup.parser.XmlTreeBuilder", "org.jsoup.parser.XmlTreeBuilder", "runParser", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.jsoup.parser.XmlTreeBuilder", "process", "org.jsoup.parser.Token", "<sample:7>"}, {"org.jsoup.parser.XmlTreeBuilder", "insert", "org.jsoup.parser.Token$Character", "<sample:2>"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput173() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.DocumentType", "org.jsoup.nodes.DocumentType", "siblingIndex", new String[]{}, new String[]{}, false);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "<!DOCTYPE a PUBLIC \"0\" \"sample\">", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput174() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jsoup.nodes.DocumentType", "org.jsoup.nodes.DocumentType", "replaceChild", new String[]{"org.jsoup.nodes.Node", "org.jsoup.nodes.Node"}, new String[]{"<null>", "<null>"}, false); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput175() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.DocumentType", "org.jsoup.nodes.DocumentType", "removeAttr", new String[]{"java.lang.String"}, new String[]{"<!DOCTYPE"}, false);
  assertNotNull(actual);
  assertEquals("org.jsoup.nodes.DocumentType", actual.getClass().getName());
  assertEquals("<!DOCTYPE a PUBLIC \"0\" \"sample\">", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "<!DOCTYPE a PUBLIC \"0\" \"sample\">", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput176() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.parser.HtmlTreeBuilderState", "org.jsoup.parser.HtmlTreeBuilderState$1", "values", new String[]{}, new String[]{}, true);
  assertNotNull(actual);
  assertEquals("[Lorg.jsoup.parser.HtmlTreeBuilderState;", actual.getClass().getName());
  assertEquals("[Initial, BeforeHtml, BeforeHead, InHead, InHeadNoscript, AfterHead, InBody, Text, InTable, InTableText, InCaption, InColumnGroup, InTableBody, InRow, InCell, InSelect, InSelectInTable, AfterBody, InF...#275#355538594", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput177() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jsoup.nodes.DocumentType", "org.jsoup.nodes.DocumentType", "addChildren", new String[]{"org.jsoup.nodes.Node[]"}, new String[]{"<null>"}, false, 0, new String[][]{{"org.jsoup.nodes.DocumentType", "indent", "java.lang.Appendable,int,org.jsoup.nodes.Document$OutputSettings", "<sample:0>", "65534", "<sample:6>"}, {"org.jsoup.nodes.DocumentType", "before", "java.lang.String", "1E-5"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput178() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.DocumentType", "org.jsoup.nodes.DocumentType", "parent", new String[]{}, new String[]{}, false);
  assertNull(actual);
  assertEquals("receiver state after the call", "<!DOCTYPE a PUBLIC \"0\" \"sample\">", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput179() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.parser.XmlTreeBuilder", "org.jsoup.parser.XmlTreeBuilder", "parse", new String[]{"java.lang.String", "java.lang.String"}, new String[]{"", "<!doctype"}, false);
  assertNotNull(actual);
  assertEquals("org.jsoup.nodes.Document", actual.getClass().getName());
  assertEquals(" {hasText=false, isBlock=false}", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput180() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.DocumentType", "org.jsoup.nodes.DocumentType", "attr", new String[]{"java.lang.String", "java.lang.String"}, new String[]{"12:30:45", "010"}, false, 0, new String[][]{{"org.jsoup.nodes.DocumentType", "indent", "java.lang.Appendable,int,org.jsoup.nodes.Document$OutputSettings", "<sample:2>", "2147483647", "<sample:5>"}, {"org.jsoup.nodes.DocumentType", "childNodesAsArray", ""}});
  assertNotNull(actual);
  assertEquals("org.jsoup.nodes.DocumentType", actual.getClass().getName());
  assertEquals("<!DOCTYPE a PUBLIC \"0\" \"sample\">", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "<!DOCTYPE a PUBLIC \"0\" \"sample\">", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput181() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.DocumentType", "org.jsoup.nodes.DocumentType", "baseUri", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.jsoup.nodes.DocumentType", "previousSibling", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("", String.valueOf(actual));
  assertEquals("receiver state after the call", "<!DOCTYPE a PUBLIC \"0\" \"sample\">", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput182() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.parser.XmlTreeBuilder", "org.jsoup.parser.XmlTreeBuilder", "defaultSettings", new String[]{}, new String[]{}, false);
  assertNotNull(actual);
  assertEquals("org.jsoup.parser.ParseSettings", actual.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput183() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jsoup.nodes.DocumentType", "org.jsoup.nodes.DocumentType", "attributes", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.jsoup.nodes.DocumentType", "equals", "java.lang.Object", "<sample:0>"}, {"org.jsoup.nodes.DocumentType", "getOutputSettings", ""}}), new String[][]{{"size", "", "1"}, {"iterator", "", "3"}});
  assertNotNull(actual);
  assertEquals("java.util.LinkedHashMap$LinkedValueIterator", actual.getClass().getName());
  assertEquals("{hasNext=true}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "<!DOCTYPE a PUBLIC \"0\" \"sample\">", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput184() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jsoup.nodes.DocumentType", "org.jsoup.nodes.DocumentType", "getOutputSettings", new String[]{}, new String[]{}, false, 16, new String[][]{{"org.jsoup.nodes.DocumentType", "wrap", "java.lang.String", "\t"}, {"org.jsoup.nodes.DocumentType", "after", "java.lang.String", "-1"}}), new String[][]{{"outline", "", "0"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "<!DOCTYPE a PUBLIC \"0\" \"sample\">", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput185() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jsoup.nodes.DocumentType", "org.jsoup.nodes.DocumentType", "getOutputSettings", new String[]{}, new String[]{}, false, 16, new String[][]{{"org.jsoup.nodes.DocumentType", "addChildren", "org.jsoup.nodes.Node[]", "<sample:0>"}, {"org.jsoup.nodes.DocumentType", "nodeName", ""}}), new String[][]{{"escapeMode", "", "2"}});
  assertNotNull(actual);
  assertEquals("org.jsoup.nodes.Entities$EscapeMode", actual.getClass().getName());
  assertEquals("base", String.valueOf(actual));
  assertEquals("receiver state after the call", "<!DOCTYPE a PUBLIC \"0\" \"sample\">a", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput186() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.parser.Token", "org.jsoup.parser.Token$Character", "isCharacter", new String[]{}, new String[]{}, false);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
  assertEquals("receiver state after the call", "null", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput187() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.DocumentType", "org.jsoup.nodes.DocumentType", "outerHtmlTail", new String[]{"java.lang.Appendable", "int", "org.jsoup.nodes.Document$OutputSettings"}, new String[]{"<null>", "65535", "<sample:4>"}, false);
  assertNull(actual);
  assertEquals("receiver state after the call", "<!DOCTYPE a PUBLIC \"0\" \"sample\">", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput188() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.DocumentType", "org.jsoup.nodes.DocumentType", "addChildren", new String[]{"org.jsoup.nodes.Node[]"}, new String[]{"<empty>"}, false, 0, new String[][]{{"org.jsoup.nodes.DocumentType", "toString", ""}, {"org.jsoup.nodes.DocumentType", "nextSibling", ""}});
  assertNull(actual);
  assertEquals("receiver state after the call", "<!DOCTYPE a PUBLIC \"0\" \"sample\">", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput189() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jsoup.parser.XmlTreeBuilder", "org.jsoup.parser.XmlTreeBuilder", "processEndTag", new String[]{"java.lang.String"}, new String[]{"caption"}, false); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput190() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.parser.Token", "org.jsoup.parser.Token$Character", "isComment", new String[]{}, new String[]{}, false, 2, new String[][]{{"org.jsoup.parser.Token", "asStartTag", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "null", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput191() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.DocumentType", "org.jsoup.nodes.DocumentType", "clone", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.jsoup.nodes.DocumentType", "childNodes", ""}});
  assertNotNull(actual);
  assertEquals("org.jsoup.nodes.DocumentType", actual.getClass().getName());
  assertEquals("<!DOCTYPE a PUBLIC \"0\" \"sample\">", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "<!DOCTYPE a PUBLIC \"0\" \"sample\">", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput192() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jsoup.nodes.DocumentType", "org.jsoup.nodes.DocumentType", "getOutputSettings", new String[]{}, new String[]{}, false, 16, new String[][]{{"org.jsoup.nodes.DocumentType", "absUrl", "java.lang.String", "0.5e300td"}, {"org.jsoup.nodes.DocumentType", "removeChild", "org.jsoup.nodes.Node", "<sample:5>"}, {"org.jsoup.nodes.DocumentType", "wrap", "java.lang.String", "Yii8\rXtl<!docype"}}), new String[][]{{"indentAmount", "int", "2"}, {"charset", "java.lang.String", "7"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.nio.charset.UnsupportedCharsetException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput193() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jsoup.nodes.DocumentType", "org.jsoup.nodes.DocumentType", "reparentChild", new String[]{"org.jsoup.nodes.Node"}, new String[]{"<null>"}, false, 0, new String[][]{{"org.jsoup.nodes.DocumentType", "setParentNode", "org.jsoup.nodes.Node", "<sample:0>"}, {"org.jsoup.nodes.DocumentType", "setParentNode", "org.jsoup.nodes.Node", "<sample:7>"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput194() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.parser.Token", "org.jsoup.parser.Token$Character", "reset", new String[]{}, new String[]{}, false);
  assertNotNull(actual);
  assertEquals("org.jsoup.parser.Token$Character", actual.getClass().getName());
  assertEquals("null", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "null", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput195() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.DocumentType", "org.jsoup.nodes.DocumentType", "setParentNode", new String[]{"org.jsoup.nodes.Node"}, new String[]{"<sample:1>"}, false);
  assertNull(actual);
  assertEquals("receiver state after the call", "<!DOCTYPE a PUBLIC \"0\" \"sample\">", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput196() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.parser.Token", "org.jsoup.parser.Token$Character", "isDoctype", new String[]{}, new String[]{}, false);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "null", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput197() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.DocumentType", "org.jsoup.nodes.DocumentType", "toString", new String[]{}, new String[]{}, false);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("<!DOCTYPE a PUBLIC \"0\" \"sample\">", String.valueOf(actual));
  assertEquals("receiver state after the call", "<!DOCTYPE a PUBLIC \"0\" \"sample\">", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput198() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jsoup.parser.XmlTreeBuilder", "org.jsoup.parser.XmlTreeBuilder", "insert", new String[]{"org.jsoup.parser.Token$StartTag"}, new String[]{"<sample:2>"}, false, 0, new String[][]{{"org.jsoup.parser.XmlTreeBuilder", "insert", "org.jsoup.parser.Token$StartTag", "<null>"}, {"org.jsoup.parser.XmlTreeBuilder", "processStartTag", "java.lang.String", "0"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput199() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jsoup.parser.HtmlTreeBuilderState", "org.jsoup.parser.HtmlTreeBuilderState$1", "process", new String[]{"org.jsoup.parser.Token", "org.jsoup.parser.HtmlTreeBuilder"}, new String[]{"<sample:5>", "<sample:2>"}, false, 3, new String[][]{{"org.jsoup.parser.HtmlTreeBuilderState", "process", "org.jsoup.parser.Token,org.jsoup.parser.HtmlTreeBuilder", "<sample:6>", "<sample:4>"}, {"org.jsoup.parser.HtmlTreeBuilderState", "process", "org.jsoup.parser.Token,org.jsoup.parser.HtmlTreeBuilder", "<sample:1>", "<sample:0>"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput200() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jsoup.parser.XmlTreeBuilder", "org.jsoup.parser.XmlTreeBuilder", "currentElement", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.jsoup.parser.XmlTreeBuilder", "currentElement", ""}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput201() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jsoup.parser.XmlTreeBuilder", "org.jsoup.parser.XmlTreeBuilder", "insert", new String[]{"org.jsoup.parser.Token$Comment"}, new String[]{"<null>"}, false, 0, new String[][]{{"org.jsoup.parser.XmlTreeBuilder", "parse", "java.lang.String,java.lang.String", "123456789012345678901234567890", "1.12345678901234567"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput202() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.DocumentType", "org.jsoup.nodes.DocumentType", "addChildren", new String[]{"int", "org.jsoup.nodes.Node[]"}, new String[]{"65532", "<empty>"}, false, 2, new String[][]{{"org.jsoup.nodes.DocumentType", "baseUri", ""}, {"org.jsoup.nodes.DocumentType", "setSiblingIndex", "int", "65532"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "<!DOCTYPE sample \"a\">", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput203() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.DocumentType", "org.jsoup.nodes.DocumentType", "siblingNodes", new String[]{}, new String[]{}, false);
  assertNotNull(actual);
  assertEquals("java.util.Collections$EmptyList", actual.getClass().getName());
  assertEquals("[]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "<!DOCTYPE a PUBLIC \"0\" \"sample\">", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput204() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.DocumentType", "org.jsoup.nodes.DocumentType", "wrap", new String[]{"java.lang.String"}, new String[]{"<!DOCTYPE"}, false, 0, new String[][]{{"org.jsoup.nodes.DocumentType", "removeAttr", "java.lang.String", "col"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "<!DOCTYPE a PUBLIC \"0\" \"sample\">", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput205() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.parser.XmlTreeBuilder", "org.jsoup.parser.XmlTreeBuilder", "processStartTag", new String[]{"java.lang.String"}, new String[]{"1.25"}, false, 7, new String[][]{{"org.jsoup.parser.XmlTreeBuilder", "parse", "java.lang.String,java.lang.String", "1.1234567890123456", "name"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput206() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.DocumentType", "org.jsoup.nodes.DocumentType", "equals", new String[]{"java.lang.Object"}, new String[]{"<i:0>"}, false);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "<!DOCTYPE a PUBLIC \"0\" \"sample\">", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput207() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jsoup.nodes.DocumentType", "org.jsoup.nodes.DocumentType", "addChildren", new String[]{"int", "org.jsoup.nodes.Node[]"}, new String[]{"65532", "<sample:0>"}, false, 0, new String[][]{{"org.jsoup.nodes.DocumentType", "attr", "java.lang.String", "a b"}, {"org.jsoup.nodes.DocumentType", "childNodesCopy", ""}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IndexOutOfBoundsException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput208() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.DocumentType", "org.jsoup.nodes.DocumentType", "hasSameValue", new String[]{"java.lang.Object"}, new String[]{"<b:true>"}, false, 6, new String[][]{{"org.jsoup.nodes.DocumentType", "setSiblingIndex", "int", "2147483647"}, {"org.jsoup.nodes.DocumentType", "ownerDocument", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "<!DOCTYPE sample \"a\">", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput209() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.parser.TokeniserState", "org.jsoup.parser.TokeniserState$1", "read", new String[]{"org.jsoup.parser.Tokeniser", "org.jsoup.parser.CharacterReader"}, new String[]{"<sample:0>", "<sample:5>"}, false);
  assertNull(actual);
  assertEquals("receiver state after the call", "null", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput210() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jsoup.parser.HtmlTreeBuilderState", "org.jsoup.parser.HtmlTreeBuilderState$1", "valueOf", new String[]{"java.lang.String"}, new String[]{"5."}, true); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput211() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jsoup.nodes.DocumentType", "org.jsoup.nodes.DocumentType", "wrap", new String[]{"java.lang.String"}, new String[]{"[1,2]"}, false); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput212() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.DocumentType", "org.jsoup.nodes.DocumentType", "hasAttr", new String[]{"java.lang.String"}, new String[]{"1.25"}, false, 6, new String[][]{{"org.jsoup.nodes.DocumentType", "addChildren", "int,org.jsoup.nodes.Node[]", "65535", "<sample:1>"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "<!DOCTYPE sample \"a\">", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput213() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jsoup.parser.Token", "org.jsoup.parser.Token$Character", "asDoctype", new String[]{}, new String[]{}, false); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.ClassCastException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput214() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jsoup.parser.XmlTreeBuilder", "org.jsoup.parser.XmlTreeBuilder", "processStartTag", new String[]{"java.lang.String", "org.jsoup.nodes.Attributes"}, new String[]{"<a>b</a>", "<sample:7>"}, false, 0, new String[][]{{"org.jsoup.parser.XmlTreeBuilder", "runParser", ""}, {"org.jsoup.parser.XmlTreeBuilder", "runParser", ""}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput215() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.DocumentType", "org.jsoup.nodes.DocumentType", "childNodesCopy", new String[]{}, new String[]{}, false, 2, new String[][]{{"org.jsoup.nodes.DocumentType", "after", "java.lang.String", "123456789012345678901234567890"}});
  assertNotNull(actual);
  assertEquals("java.util.ArrayList", actual.getClass().getName());
  assertEquals("[]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "<!DOCTYPE sample \"a\">", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput216() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.DocumentType", "org.jsoup.nodes.DocumentType", "nextSibling", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.jsoup.nodes.DocumentType", "doClone", "org.jsoup.nodes.Node", "<sample:4>"}, {"org.jsoup.nodes.DocumentType", "outerHtml", ""}});
  assertNull(actual);
  assertEquals("receiver state after the call", "<!DOCTYPE a PUBLIC \"0\" \"sample\">", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput217() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.parser.TokeniserState", "org.jsoup.parser.TokeniserState$1", "values", new String[]{}, new String[]{}, true);
  assertNotNull(actual);
  assertEquals("[Lorg.jsoup.parser.TokeniserState;", actual.getClass().getName());
  assertEquals("[Data, CharacterReferenceInData, Rcdata, CharacterReferenceInRcdata, Rawtext, ScriptData, PLAINTEXT, TagOpen, EndTagOpen, TagName, RcdataLessthanSign, RCDATAEndTagOpen, RCDATAEndTagName, RawtextLessth...#1490#-1802059412", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput218() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.parser.XmlTreeBuilder", "org.jsoup.parser.XmlTreeBuilder", "parse", new String[]{"java.lang.String", "java.lang.String"}, new String[]{"{\"a\":1}", "12:30:45"}, false);
  assertNotNull(actual);
  assertEquals("org.jsoup.nodes.Document", actual.getClass().getName());
  assertEquals("{\"a\":1} {hasText=true, isBlock=false}", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput219() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.parser.Token", "org.jsoup.parser.Token$Character", "isEOF", new String[]{}, new String[]{}, false);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "null", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput220() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jsoup.parser.TokeniserState", "org.jsoup.parser.TokeniserState$1", "read", new String[]{"org.jsoup.parser.Tokeniser", "org.jsoup.parser.CharacterReader"}, new String[]{"<null>", "<sample:4>"}, false); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput221() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.DocumentType", "org.jsoup.nodes.DocumentType", "reparentChild", new String[]{"org.jsoup.nodes.Node"}, new String[]{"<sample:1>"}, false, 5, new String[][]{{"org.jsoup.nodes.DocumentType", "attr", "java.lang.String", "i"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "<!DOCTYPE 0 sample \"a\">", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput222() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.parser.XmlTreeBuilder", "org.jsoup.parser.XmlTreeBuilder", "parse", new String[]{"java.lang.String", "java.lang.String", "org.jsoup.parser.ParseErrorList", "org.jsoup.parser.ParseSettings"}, new String[]{"publicId", "1.1234567890123456", "<null>", "<null>"}, false, 7, new String[][]{{"org.jsoup.parser.XmlTreeBuilder", "defaultSettings", ""}});
  assertNotNull(actual);
  assertEquals("org.jsoup.nodes.Document", actual.getClass().getName());
  assertEquals("publicId {hasText=true, isBlock=false}", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput223() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.DocumentType", "org.jsoup.nodes.DocumentType", "setBaseUri", new String[]{"java.lang.String"}, new String[]{"aaaaaaaaaaaaaaaaaaaaaaaaaaaaaa"}, false, 0, new String[][]{{"org.jsoup.nodes.DocumentType", "attr", "java.lang.String,java.lang.String", "1.1234567890123456", "1.12345678901234567"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "<!DOCTYPE a PUBLIC \"0\" \"sample\">", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput224() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.DocumentType", "org.jsoup.nodes.DocumentType", "nodeName", new String[]{}, new String[]{}, false, 6, new String[][]{{"org.jsoup.nodes.DocumentType", "childNodeSize", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("#doctype", String.valueOf(actual));
  assertEquals("receiver state after the call", "<!DOCTYPE sample \"a\">", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput225() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.DocumentType", "org.jsoup.nodes.DocumentType", "traverse", new String[]{"org.jsoup.select.NodeVisitor"}, new String[]{"<sample:0>"}, false, 0, new String[][]{{"org.jsoup.nodes.DocumentType", "outerHtml", ""}, {"org.jsoup.nodes.DocumentType", "nodeName", ""}});
  assertNotNull(actual);
  assertEquals("org.jsoup.nodes.DocumentType", actual.getClass().getName());
  assertEquals("<!DOCTYPE a PUBLIC \"0\" \"sample\">", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "<!DOCTYPE a PUBLIC \"0\" \"sample\">", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput226() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.DocumentType", "org.jsoup.nodes.DocumentType", "reparentChild", new String[]{"org.jsoup.nodes.Node"}, new String[]{"<sample:1>"}, false, 6, new String[][]{{"org.jsoup.nodes.DocumentType", "after", "java.lang.String", "1.5e300td"}, {"org.jsoup.nodes.DocumentType", "outerHtml", ""}});
  assertNull(actual);
  assertEquals("receiver state after the call", "<!DOCTYPE sample \"a\">", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput227() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.DocumentType", "org.jsoup.nodes.DocumentType", "childNodeSize", new String[]{}, new String[]{}, false);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "<!DOCTYPE a PUBLIC \"0\" \"sample\">", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput228() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.DocumentType", "org.jsoup.nodes.DocumentType", "parent", new String[]{}, new String[]{}, false, 5, new String[][]{{"org.jsoup.nodes.DocumentType", "wrap", "java.lang.String", "a"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "<!DOCTYPE 0 sample \"a\">", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput229() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jsoup.nodes.DocumentType", "org.jsoup.nodes.DocumentType", "childNodesCopy", new String[]{}, new String[]{}, false), new String[][]{{"addAll", "java.util.Collection", "4"}, {"removeAll", "java.util.Collection", "0"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
  assertEquals("receiver state after the call", "<!DOCTYPE a PUBLIC \"0\" \"sample\">", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput230() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.DocumentType", "org.jsoup.nodes.DocumentType", "outerHtmlHead", new String[]{"java.lang.Appendable", "int", "org.jsoup.nodes.Document$OutputSettings"}, new String[]{"<sample:0>", "1", "<sample:1>"}, false, 1, new String[][]{{"org.jsoup.nodes.DocumentType", "html", "java.lang.Appendable", "<sample:3>"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "<!DOCTYPE 0 sample \"a\">", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput231() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jsoup.nodes.DocumentType", "org.jsoup.nodes.DocumentType", "attributes", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.jsoup.nodes.DocumentType", "addChildren", "int,org.jsoup.nodes.Node[]", "0", "<sample:2>"}}), new String[][]{{"remove", "java.lang.String", "3"}, {"put", "java.lang.String,boolean", "0"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput232() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.DocumentType", "org.jsoup.nodes.DocumentType", "addChildren", new String[]{"org.jsoup.nodes.Node[]"}, new String[]{"<sample:2>"}, false, 0, new String[][]{{"org.jsoup.nodes.DocumentType", "nodeName", ""}});
  assertNull(actual);
  assertEquals("receiver state after the call", "<!DOCTYPE a PUBLIC \"0\" \"sample\"><!DOCTYPE a PUBLIC \"0\" \"sample\">\n <!--a-->a", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput233() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.DocumentType", "org.jsoup.nodes.DocumentType", "html", new String[]{"java.lang.Appendable"}, new String[]{"<sample:3>"}, false);
  assertNotNull(actual);
  assertEquals("java.lang.StringBuilder", actual.getClass().getName());
  assertEquals("<!DOCTYPE a PUBLIC \"0\" \"sample\">", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "<!DOCTYPE a PUBLIC \"0\" \"sample\">", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput234() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jsoup.nodes.DocumentType", "org.jsoup.nodes.DocumentType", "traverse", new String[]{"org.jsoup.select.NodeVisitor"}, new String[]{"<sample:0>"}, false, 3, new String[][]{{"org.jsoup.nodes.DocumentType", "absUrl", "java.lang.String", "<null>"}, {"org.jsoup.nodes.DocumentType", "outerHtmlHead", "java.lang.Appendable,int,org.jsoup.nodes.Document$OutputSettings", "<empty>", "-2147483648", "<sample:0>"}}), new String[][]{{"traverse", "org.jsoup.select.NodeVisitor", "6"}});
  assertNotNull(actual);
  assertEquals("org.jsoup.nodes.DocumentType", actual.getClass().getName());
  assertEquals("<!DOCTYPE a \"0\" \"sample\">", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "<!DOCTYPE a \"0\" \"sample\">", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput235() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.parser.XmlTreeBuilder", "org.jsoup.parser.XmlTreeBuilder", "parse", new String[]{"java.lang.String", "java.lang.String"}, new String[]{"table", "\u00e9"}, false);
  assertNotNull(actual);
  assertEquals("org.jsoup.nodes.Document", actual.getClass().getName());
  assertEquals("table {hasText=true, isBlock=false}", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput236() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jsoup.nodes.DocumentType", "org.jsoup.nodes.DocumentType", "clone", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.jsoup.nodes.DocumentType", "childNodes", ""}}), new String[][]{{"previousSibling", "", "7"}, {"outerHtml", "", "7"}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("<!DOCTYPE a PUBLIC \"0\" \"sample\">", String.valueOf(actual));
  assertEquals("receiver state after the call", "<!DOCTYPE a PUBLIC \"0\" \"sample\">", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput237() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.parser.XmlTreeBuilder", "org.jsoup.parser.XmlTreeBuilder", "insert", new String[]{"org.jsoup.parser.Token$Doctype"}, new String[]{"<sample:0>"}, false, 5, new String[][]{{"org.jsoup.parser.XmlTreeBuilder", "parse", "java.lang.String,java.lang.String", "1.5", "+1"}});
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput238() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.DocumentType", "org.jsoup.nodes.DocumentType", "doClone", new String[]{"org.jsoup.nodes.Node"}, new String[]{"<sample:7>"}, false, 0, new String[][]{{"org.jsoup.nodes.DocumentType", "removeAttr", "java.lang.String", "/a/b"}, {"org.jsoup.nodes.DocumentType", "nextSibling", ""}});
  assertNotNull(actual);
  assertEquals("org.jsoup.nodes.DocumentType", actual.getClass().getName());
  assertEquals("<!DOCTYPE a PUBLIC \"0\" \"sample\">", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "<!DOCTYPE a PUBLIC \"0\" \"sample\">", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput239() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jsoup.nodes.DocumentType", "org.jsoup.nodes.DocumentType", "childNodes", new String[]{}, new String[]{}, false, 2, new String[][]{{"org.jsoup.nodes.DocumentType", "removeChild", "org.jsoup.nodes.Node", "<sample:7>"}, {"org.jsoup.nodes.DocumentType", "childNodes", ""}}), new String[][]{{"retainAll", "java.util.Collection", "2"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.UnsupportedOperationException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput240() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.DocumentType", "org.jsoup.nodes.DocumentType", "doClone", new String[]{"org.jsoup.nodes.Node"}, new String[]{"<sample:3>"}, false, 6, new String[][]{{"org.jsoup.nodes.DocumentType", "outerHtmlHead", "java.lang.Appendable,int,org.jsoup.nodes.Document$OutputSettings", "<sample:3>", "65536", "<sample:3>"}});
  assertNotNull(actual);
  assertEquals("org.jsoup.nodes.DocumentType", actual.getClass().getName());
  assertEquals("<!DOCTYPE sample \"a\">", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "<!DOCTYPE sample \"a\">", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput241() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.parser.XmlTreeBuilder", "org.jsoup.parser.XmlTreeBuilder", "currentElement", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.jsoup.parser.XmlTreeBuilder", "parse", "java.lang.String,java.lang.String", "0.5e300td", "http://example.com/a?b=c"}});
  assertNotNull(actual);
  assertEquals("org.jsoup.nodes.Document", actual.getClass().getName());
  assertEquals("0.5e300td {hasText=true, isBlock=false}", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput242() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jsoup.nodes.DocumentType", "org.jsoup.nodes.DocumentType", "removeAttr", new String[]{"java.lang.String"}, new String[]{"1.5"}, false, 4, new String[][]{{"org.jsoup.nodes.DocumentType", "addChildren", "int,org.jsoup.nodes.Node[]", "1", "<sample:1>"}}), new String[][]{{"ownerDocument", "", "2"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "<!DOCTYPE a PUBLIC \"0\" \"sample\">", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput243() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jsoup.nodes.DocumentType", "org.jsoup.nodes.DocumentType", "childNodes", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.jsoup.nodes.DocumentType", "attr", "java.lang.String", "65535"}, {"org.jsoup.nodes.DocumentType", "previousSibling", ""}}), new String[][]{{"contains", "java.lang.Object", "1"}, {"listIterator", "", "0"}, {"hasPrevious", "", "7"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "<!DOCTYPE a PUBLIC \"0\" \"sample\">", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput244() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.parser.XmlTreeBuilder", "org.jsoup.parser.XmlTreeBuilder", "parse", new String[]{"java.lang.String", "java.lang.String"}, new String[]{"0x1F", "a,b,c"}, false, 0, new String[][]{{"org.jsoup.parser.XmlTreeBuilder", "insert", "org.jsoup.parser.Token$Comment", "<sample:6>"}, {"org.jsoup.parser.XmlTreeBuilder", "process", "org.jsoup.parser.Token", "<null>"}});
  assertNotNull(actual);
  assertEquals("org.jsoup.nodes.Document", actual.getClass().getName());
  assertEquals("0x1F {hasText=true, isBlock=false}", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput245() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.DocumentType", "org.jsoup.nodes.DocumentType", "outerHtml", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.jsoup.nodes.DocumentType", "after", "org.jsoup.nodes.Node", "<sample:0>"}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("<!DOCTYPE a PUBLIC \"0\" \"sample\">", String.valueOf(actual));
  assertEquals("receiver state after the call", "<!DOCTYPE a PUBLIC \"0\" \"sample\">", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput246() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jsoup.nodes.DocumentType", "org.jsoup.nodes.DocumentType", "clone", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.jsoup.nodes.DocumentType", "replaceWith", "org.jsoup.nodes.Node", "<sample:2>"}}), new String[][]{{"remove", "", "1"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput247() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.DocumentType", "org.jsoup.nodes.DocumentType", "previousSibling", new String[]{}, new String[]{}, false, 2, new String[][]{{"org.jsoup.nodes.DocumentType", "replaceWith", "org.jsoup.nodes.Node", "<sample:5>"}, {"org.jsoup.nodes.DocumentType", "previousSibling", ""}});
  assertNull(actual);
  assertEquals("receiver state after the call", "<!DOCTYPE sample \"a\">", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput248() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jsoup.nodes.DocumentType", "org.jsoup.nodes.DocumentType", "getOutputSettings", new String[]{}, new String[]{}, false, 16, new String[][]{{"org.jsoup.nodes.DocumentType", "setParentNode", "org.jsoup.nodes.Node", "<sample:2>"}, {"org.jsoup.nodes.DocumentType", "addChildren", "org.jsoup.nodes.Node[]", "<sample:2>"}, {"org.jsoup.nodes.DocumentType", "setBaseUri", "java.lang.String", "tasme"}}, 2), new String[][]{{"indentAmount", "int", "6"}, {"escapeMode", "org.jsoup.nodes.Entities$EscapeMode", "6"}, {"indentAmount", "", "4"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("3", String.valueOf(actual));
  assertEquals("receiver state after the call", "<!DOCTYPE a PUBLIC \"0\" \"sample\"><!DOCTYPE a PUBLIC \"0\" \"sample\">\n   <!--a-->a", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput249() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.DocumentType", "org.jsoup.nodes.DocumentType", "siblingIndex", new String[]{}, new String[]{}, false, 7, new String[][]{{"org.jsoup.nodes.DocumentType", "replaceChild", "org.jsoup.nodes.Node,org.jsoup.nodes.Node", "<sample:0>", "<sample:6>"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "<!DOCTYPE a \"0\" \"sample\">", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput250() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.DocumentType", "org.jsoup.nodes.DocumentType", "childNodesAsArray", new String[]{}, new String[]{}, false);
  assertNotNull(actual);
  assertEquals("[Lorg.jsoup.nodes.Node;", actual.getClass().getName());
  assertEquals("[]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "<!DOCTYPE a PUBLIC \"0\" \"sample\">", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput251() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.parser.XmlTreeBuilder", "org.jsoup.parser.XmlTreeBuilder", "currentElement", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.jsoup.parser.XmlTreeBuilder", "defaultSettings", ""}, {"org.jsoup.parser.XmlTreeBuilder", "parse", "java.lang.String,java.lang.String", "65535", "publicId"}});
  assertNotNull(actual);
  assertEquals("org.jsoup.nodes.Document", actual.getClass().getName());
  assertEquals("65535 {hasText=true, isBlock=false}", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput252() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.parser.Token", "org.jsoup.parser.Token$Character", "asCharacter", new String[]{}, new String[]{}, false, 0, null, 1);
  assertNotNull(actual);
  assertEquals("org.jsoup.parser.Token$Character", actual.getClass().getName());
  assertEquals("null", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "null", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput253() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.DocumentType", "org.jsoup.nodes.DocumentType", "nodeName", new String[]{}, new String[]{}, false, 0, null, 2);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("#doctype", String.valueOf(actual));
  assertEquals("receiver state after the call", "<!DOCTYPE a PUBLIC \"0\" \"sample\">", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput254() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jsoup.nodes.DocumentType", "org.jsoup.nodes.DocumentType", "after", new String[]{"java.lang.String"}, new String[]{"2147483648"}, false, 0, null, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput255() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.DocumentType", "org.jsoup.nodes.DocumentType", "outerHtml", new String[]{"java.lang.Appendable"}, new String[]{"<sample:2>"}, false, 0, new String[][]{{"org.jsoup.nodes.DocumentType", "reparentChild", "org.jsoup.nodes.Node", "<sample:2>"}, {"org.jsoup.nodes.DocumentType", "addChildren", "org.jsoup.nodes.Node[]", "<sample:1>"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "<!DOCTYPE a PUBLIC \"0\" \"sample\">\n <#root></#root><!DOCTYPE a PUBLIC \"0\" \"sample\">", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput256() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jsoup.nodes.DocumentType", "org.jsoup.nodes.DocumentType", "after", new String[]{"org.jsoup.nodes.Node"}, new String[]{"<sample:3>"}, false, 0, new String[][]{{"org.jsoup.nodes.DocumentType", "childNodes", ""}, {"org.jsoup.nodes.DocumentType", "setSiblingIndex", "int", "65533"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput257() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.DocumentType", "org.jsoup.nodes.DocumentType", "childNodes", new String[]{}, new String[]{}, false, 2, new String[][]{{"org.jsoup.nodes.DocumentType", "html", "java.lang.Appendable", "<sample:3>"}});
  assertNotNull(actual);
  assertEquals("java.util.Collections$UnmodifiableRandomAccessList", actual.getClass().getName());
  assertEquals("[]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "<!DOCTYPE sample \"a\">", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput258() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jsoup.nodes.DocumentType", "org.jsoup.nodes.DocumentType", "attr", new String[]{"java.lang.String", "java.lang.String"}, new String[]{"", "1.12345678901234567"}, false); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput259() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jsoup.parser.XmlTreeBuilder", "org.jsoup.parser.XmlTreeBuilder", "processEndTag", new String[]{"java.lang.String"}, new String[]{"0x123456789"}, false, 0, new String[][]{{"org.jsoup.parser.XmlTreeBuilder", "insert", "org.jsoup.parser.Token$Doctype", "<sample:4>"}}, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput260() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jsoup.parser.Token", "org.jsoup.parser.Token$Character", "asEndTag", new String[]{}, new String[]{}, false, 0, null, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.ClassCastException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput261() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.DocumentType", "org.jsoup.nodes.DocumentType", "previousSibling", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.jsoup.nodes.DocumentType", "traverse", "org.jsoup.select.NodeVisitor", "<sample:5>"}}, 2);
  assertNull(actual);
  assertEquals("receiver state after the call", "<!DOCTYPE a PUBLIC \"0\" \"sample\">", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput262() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.DocumentType", "org.jsoup.nodes.DocumentType", "attr", new String[]{"java.lang.String", "java.lang.String"}, new String[]{"1", "0"}, false, 2, new String[][]{{"org.jsoup.nodes.DocumentType", "before", "org.jsoup.nodes.Node", "<sample:3>"}, {"org.jsoup.nodes.DocumentType", "childNodesAsArray", ""}});
  assertNotNull(actual);
  assertEquals("org.jsoup.nodes.DocumentType", actual.getClass().getName());
  assertEquals("<!DOCTYPE sample \"a\">", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "<!DOCTYPE sample \"a\">", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput263() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jsoup.nodes.DocumentType", "org.jsoup.nodes.DocumentType", "addChildren", new String[]{"int", "org.jsoup.nodes.Node[]"}, new String[]{"1", "<null>"}, false); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput264() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.DocumentType", "org.jsoup.nodes.DocumentType", "attr", new String[]{"java.lang.String"}, new String[]{"publicId"}, false, 3, new String[][]{{"org.jsoup.nodes.DocumentType", "ensureChildNodes", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "<!DOCTYPE a \"0\" \"sample\">", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput265() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jsoup.nodes.DocumentType", "org.jsoup.nodes.DocumentType", "getOutputSettings", new String[]{}, new String[]{}, false, 16, new String[][]{{"org.jsoup.nodes.DocumentType", "wrap", "java.lang.String", "\n<;DOCTYPE"}, {"org.jsoup.nodes.DocumentType", "equals", "java.lang.Object", "<s:key>"}}, 2), new String[][]{{"charset", "java.nio.charset.Charset", "1"}, {"syntax", "org.jsoup.nodes.Document$OutputSettings$Syntax", "0"}, {"indentAmount", "", "0"}, {"charset", "java.lang.String", "1"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.nio.charset.UnsupportedCharsetException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput266() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jsoup.nodes.DocumentType", "org.jsoup.nodes.DocumentType", "getOutputSettings", new String[]{}, new String[]{}, false, 16, new String[][]{{"org.jsoup.nodes.DocumentType", "wrap", "java.lang.String", "\n<!DPCTYPE"}, {"org.jsoup.nodes.DocumentType", "equals", "java.lang.Object", "<s:key>"}}), new String[][]{{"charset", "java.nio.charset.Charset", "1"}, {"syntax", "org.jsoup.nodes.Document$OutputSettings$Syntax", "0"}, {"indentAmount", "", "0"}, {"charset", "java.lang.String", "1"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.nio.charset.UnsupportedCharsetException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput267() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jsoup.nodes.DocumentType", "org.jsoup.nodes.DocumentType", "getOutputSettings", new String[]{}, new String[]{}, false, 16, new String[][]{{"org.jsoup.nodes.DocumentType", "wrap", "java.lang.String", "\n<!DOCTYPEpublicId"}}), new String[][]{{"charset", "java.nio.charset.Charset", "1"}, {"indentAmount", "", "4"}, {"escapeMode", "", "0"}, {"charset", "java.lang.String", "1"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.nio.charset.UnsupportedCharsetException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput268() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jsoup.nodes.DocumentType", "org.jsoup.nodes.DocumentType", "getOutputSettings", new String[]{}, new String[]{}, false, 16, new String[][]{{"org.jsoup.nodes.DocumentType", "wrap", "java.lang.String", "\n<!DOCTYPEpublicId1"}, {"org.jsoup.nodes.DocumentType", "before", "org.jsoup.nodes.Node", "<sample:3>"}}), new String[][]{{"charset", "java.nio.charset.Charset", "1"}, {"indentAmount", "", "2"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("1", String.valueOf(actual));
  assertEquals("receiver state after the call", "<!DOCTYPE a PUBLIC \"0\" \"sample\">", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput269() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jsoup.nodes.DocumentType", "org.jsoup.nodes.DocumentType", "getOutputSettings", new String[]{}, new String[]{}, false, 16, new String[][]{{"org.jsoup.nodes.DocumentType", "siblingNodes", ""}, {"org.jsoup.nodes.DocumentType", "wrap", "java.lang.String", "\t<!DOCTYPEp"}}, 2), new String[][]{{"outline", "", "1"}, {"indentAmount", "", "2"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("1", String.valueOf(actual));
  assertEquals("receiver state after the call", "<!DOCTYPE a PUBLIC \"0\" \"sample\">", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput270() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.DocumentType", "org.jsoup.nodes.DocumentType", "setParentNode", new String[]{"org.jsoup.nodes.Node"}, new String[]{"<sample:5>"}, false, 5, new String[][]{{"org.jsoup.nodes.DocumentType", "after", "java.lang.String", "table"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "<!DOCTYPE 0 sample \"a\">", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput271() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.DocumentType", "org.jsoup.nodes.DocumentType", "siblingNodes", new String[]{}, new String[]{}, false, 0, null, 1);
  assertNotNull(actual);
  assertEquals("java.util.Collections$EmptyList", actual.getClass().getName());
  assertEquals("[]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "<!DOCTYPE a PUBLIC \"0\" \"sample\">", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput272() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.DocumentType", "org.jsoup.nodes.DocumentType", "absUrl", new String[]{"java.lang.String"}, new String[]{"1.5f"}, false, 0, null, 1);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("", String.valueOf(actual));
  assertEquals("receiver state after the call", "<!DOCTYPE a PUBLIC \"0\" \"sample\">", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput273() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.DocumentType", "org.jsoup.nodes.DocumentType", "nextSibling", new String[]{}, new String[]{}, false, 0, null, 2);
  assertNull(actual);
  assertEquals("receiver state after the call", "<!DOCTYPE a PUBLIC \"0\" \"sample\">", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput274() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.DocumentType", "org.jsoup.nodes.DocumentType", "traverse", new String[]{"org.jsoup.select.NodeVisitor"}, new String[]{"<sample:4>"}, false, 6, new String[][]{{"org.jsoup.nodes.DocumentType", "replaceChild", "org.jsoup.nodes.Node,org.jsoup.nodes.Node", "<sample:3>", "<sample:2>"}});
  assertNotNull(actual);
  assertEquals("org.jsoup.nodes.DocumentType", actual.getClass().getName());
  assertEquals("<!DOCTYPE sample \"a\">", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "<!DOCTYPE sample \"a\">", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput275() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jsoup.nodes.DocumentType", "org.jsoup.nodes.DocumentType", "outerHtmlHead", new String[]{"java.lang.Appendable", "int", "org.jsoup.nodes.Document$OutputSettings"}, new String[]{"<null>", "0", "<sample:0>"}, false); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput276() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jsoup.nodes.DocumentType", "org.jsoup.nodes.DocumentType", "html", new String[]{"java.lang.Appendable"}, new String[]{"<null>"}, false, 0, new String[][]{{"org.jsoup.nodes.DocumentType", "outerHtmlHead", "java.lang.Appendable,int,org.jsoup.nodes.Document$OutputSettings", "<null>", "10", "<sample:1>"}, {"org.jsoup.nodes.DocumentType", "outerHtmlHead", "java.lang.Appendable,int,org.jsoup.nodes.Document$OutputSettings", "<empty>", "0", "<sample:5>"}}, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput277() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jsoup.parser.HtmlTreeBuilderState", "org.jsoup.parser.HtmlTreeBuilderState$1", "process", new String[]{"org.jsoup.parser.Token", "org.jsoup.parser.HtmlTreeBuilder"}, new String[]{"<sample:2>", "<sample:5>"}, false, 0, null, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput278() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jsoup.nodes.DocumentType", "org.jsoup.nodes.DocumentType", "getOutputSettings", new String[]{}, new String[]{}, false, 16, new String[][]{{"org.jsoup.nodes.DocumentType", "childNode", "int", "65532"}, {"org.jsoup.nodes.DocumentType", "wrap", "java.lang.String", "\t<!DOCTYPEpt< \""}}), new String[][]{{"charset", "", "4"}, {"historicalName", "", "5"}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("UTF8", String.valueOf(actual));
  assertEquals("receiver state after the call", "<!DOCTYPE a PUBLIC \"0\" \"sample\">", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput279() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jsoup.nodes.DocumentType", "org.jsoup.nodes.DocumentType", "getOutputSettings", new String[]{}, new String[]{}, false, 16, new String[][]{{"org.jsoup.nodes.DocumentType", "wrap", "java.lang.String", "\t<!DOCTYPEpmt< \"2020-02-30T25:61:61"}}), new String[][]{{"charset", "", "7"}, {"historicalName", "", "7"}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("UTF8", String.valueOf(actual));
  assertEquals("receiver state after the call", "<!DOCTYPE a PUBLIC \"0\" \"sample\">", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput280() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.DocumentType", "org.jsoup.nodes.DocumentType", "outerHtml", new String[]{"java.lang.Appendable"}, new String[]{"<sample:0>"}, false, 0, null, 1);
  assertNull(actual);
  assertEquals("receiver state after the call", "<!DOCTYPE a PUBLIC \"0\" \"sample\">", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput281() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.parser.Token", "org.jsoup.parser.Token$Character", "isStartTag", new String[]{}, new String[]{}, false, 0, null, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "null", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput282() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jsoup.parser.XmlTreeBuilder", "org.jsoup.parser.XmlTreeBuilder", "parse", new String[]{"java.lang.String", "java.lang.String", "org.jsoup.parser.ParseErrorList", "org.jsoup.parser.ParseSettings"}, new String[]{"\n<!DPCTYPE", ".5", "<null>", "<null>"}, false, 0, new String[][]{{"org.jsoup.parser.XmlTreeBuilder", "insert", "org.jsoup.parser.Token$Doctype", "<sample:5>"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput283() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jsoup.nodes.DocumentType", "org.jsoup.nodes.DocumentType", "childNode", new String[]{"int"}, new String[]{"0"}, false, 0, new String[][]{{"org.jsoup.nodes.DocumentType", "outerHtml", "java.lang.Appendable", "<sample:0>"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IndexOutOfBoundsException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput284() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jsoup.nodes.DocumentType", "org.jsoup.nodes.DocumentType", "getOutputSettings", new String[]{}, new String[]{}, false, 16, new String[][]{{"org.jsoup.nodes.DocumentType", "wrap", "java.lang.String", "tbody"}, {"org.jsoup.nodes.DocumentType", "wrap", "java.lang.String", "\t<!DOCTYPEp4t< -\"caption01.12345678"}}, 2), new String[][]{{"charset", "", "5"}, {"canEncode", "", "5"}, {"encode", "java.lang.String", "3"}});
  assertNotNull(actual);
  assertEquals("java.nio.HeapByteBuffer", actual.getClass().getName());
  assertEquals("java.nio.HeapByteBuffer[pos=0 lim=6 cap=6] {get=115, getChar=\u616d, getDouble=!BufferUnderflowException, getFloat=!BufferUnderflowException, getInt=!BufferUnderflowException, getLong=!BufferUnderflowExcep...#289#1191895007", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "<!DOCTYPE a PUBLIC \"0\" \"sample\">", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput285() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jsoup.nodes.DocumentType", "org.jsoup.nodes.DocumentType", "html", new String[]{"java.lang.Appendable"}, new String[]{"<null>"}, false, 0, new String[][]{{"org.jsoup.nodes.DocumentType", "removeChild", "org.jsoup.nodes.Node", "<sample:6>"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput286() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.DocumentType", "org.jsoup.nodes.DocumentType", "childNodesAsArray", new String[]{}, new String[]{}, false, 5, new String[][]{{"org.jsoup.nodes.DocumentType", "setBaseUri", "java.lang.String", "a b"}, {"org.jsoup.nodes.DocumentType", "removeChild", "org.jsoup.nodes.Node", "<sample:5>"}});
  assertNotNull(actual);
  assertEquals("[Lorg.jsoup.nodes.Node;", actual.getClass().getName());
  assertEquals("[]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "<!DOCTYPE 0 sample \"a\">", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput287() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.DocumentType", "org.jsoup.nodes.DocumentType", "doClone", new String[]{"org.jsoup.nodes.Node"}, new String[]{"<sample:2>"}, false, 5, new String[][]{{"org.jsoup.nodes.DocumentType", "after", "java.lang.String", "tfoot"}, {"org.jsoup.nodes.DocumentType", "remove", ""}}, 3);
  assertNotNull(actual);
  assertEquals("org.jsoup.nodes.DocumentType", actual.getClass().getName());
  assertEquals("<!DOCTYPE 0 sample \"a\">", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "<!DOCTYPE 0 sample \"a\">", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput288() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jsoup.nodes.DocumentType", "org.jsoup.nodes.DocumentType", "getOutputSettings", new String[]{}, new String[]{}, false, 16, new String[][]{{"org.jsoup.nodes.DocumentType", "ensureChildNodes", ""}, {"org.jsoup.nodes.DocumentType", "wrap", "java.lang.String", "\t<ODOCTYPEpt< -\"captZn01.12g4 5d678"}}), new String[][]{{"charset", "", "5"}, {"aliases", "", "7"}});
  assertNotNull(actual);
  assertEquals("java.util.Collections$UnmodifiableSet", actual.getClass().getName());
  assertEquals("[UTF8, unicode-1-1-utf-8]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "<!DOCTYPE a PUBLIC \"0\" \"sample\">", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput289() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.parser.Token", "org.jsoup.parser.Token$Character", "isCharacter", new String[]{}, new String[]{}, false, 0, null, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
  assertEquals("receiver state after the call", "null", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput290() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.DocumentType", "org.jsoup.nodes.DocumentType", "nodeName", new String[]{}, new String[]{}, false, 3, new String[][]{{"org.jsoup.nodes.DocumentType", "before", "org.jsoup.nodes.Node", "<sample:4>"}, {"org.jsoup.nodes.DocumentType", "ensureChildNodes", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("#doctype", String.valueOf(actual));
  assertEquals("receiver state after the call", "<!DOCTYPE a \"0\" \"sample\">", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput291() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jsoup.parser.Token", "org.jsoup.parser.Token$Character", "asEndTag", new String[]{}, new String[]{}, false, 0, null, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.ClassCastException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput292() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jsoup.nodes.DocumentType", "org.jsoup.nodes.DocumentType", "replaceChild", new String[]{"org.jsoup.nodes.Node", "org.jsoup.nodes.Node"}, new String[]{"<sample:7>", "<sample:0>"}, false, 0, new String[][]{{"org.jsoup.nodes.DocumentType", "before", "org.jsoup.nodes.Node", "<sample:5>"}}, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput293() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jsoup.nodes.DocumentType", "org.jsoup.nodes.DocumentType", "attr", new String[]{"java.lang.String", "java.lang.String"}, new String[]{"table", "010"}, false), new String[][]{{"outerHtml", "", "0"}, {"outerHtml", "", "2"}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("<!DOCTYPE a PUBLIC \"0\" \"sample\">", String.valueOf(actual));
  assertEquals("receiver state after the call", "<!DOCTYPE a PUBLIC \"0\" \"sample\">", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput294() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jsoup.nodes.DocumentType", "org.jsoup.nodes.DocumentType", "getOutputSettings", new String[]{}, new String[]{}, false, 16, new String[][]{{"org.jsoup.nodes.DocumentType", "before", "org.jsoup.nodes.Node", "<sample:3>"}, {"org.jsoup.nodes.DocumentType", "wrap", "java.lang.String", "\t<lODOCTYQDIpC< \"capptZnm01.12g4 5d6865523td"}}), new String[][]{{"indentAmount", "int", "5"}, {"syntax", "", "2"}});
  assertNotNull(actual);
  assertEquals("org.jsoup.nodes.Document$OutputSettings$Syntax", actual.getClass().getName());
  assertEquals("html", String.valueOf(actual));
  assertEquals("receiver state after the call", "<!DOCTYPE a PUBLIC \"0\" \"sample\">", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput295() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.parser.XmlTreeBuilder", "org.jsoup.parser.XmlTreeBuilder", "parse", new String[]{"java.lang.String", "java.lang.String"}, new String[]{"2020-02-30T25:61:61", "\t<!DOCTYPEpmt< \"2020-02-30T25:61:61"}, false, 6, new String[][]{{"org.jsoup.parser.XmlTreeBuilder", "process", "org.jsoup.parser.Token", "<sample:5>"}, {"org.jsoup.parser.XmlTreeBuilder", "defaultSettings", ""}});
  assertNotNull(actual);
  assertEquals("org.jsoup.nodes.Document", actual.getClass().getName());
  assertEquals("2020-02-30T25:61:61 {hasText=true, isBlock=false}", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput296() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.parser.Token", "org.jsoup.parser.Token$Character", "tokenType", new String[]{}, new String[]{}, false, 0, null, 3);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("Character", String.valueOf(actual));
  assertEquals("receiver state after the call", "null", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput297() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jsoup.nodes.DocumentType", "org.jsoup.nodes.DocumentType", "getOutputSettings", new String[]{}, new String[]{}, false, 16, new String[][]{{"org.jsoup.nodes.DocumentType", "wrap", "java.lang.String", "\n<!DPCTYPE"}, {"org.jsoup.nodes.DocumentType", "wrap", "java.lang.String", "\t<ODOCTYQD,IpP< -\"capptZnm01.12g4 5d6865522td1.123456/nae"}, {"org.jsoup.nodes.DocumentType", "hasSameValue", "java.lang.Object", "<s:key>"}}, 3), new String[][]{{"indentAmount", "int", "5"}, {"outline", "boolean", "1"}, {"syntax", "", "4"}});
  assertNotNull(actual);
  assertEquals("org.jsoup.nodes.Document$OutputSettings$Syntax", actual.getClass().getName());
  assertEquals("html", String.valueOf(actual));
  assertEquals("receiver state after the call", "<!DOCTYPE a PUBLIC \"0\" \"sample\">", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput298() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.parser.Token", "org.jsoup.parser.Token$Character", "isEndTag", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.jsoup.parser.Token", "isEndTag", ""}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "null", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput299() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.DocumentType", "org.jsoup.nodes.DocumentType", "childNodesCopy", new String[]{}, new String[]{}, false, 0, null, 1);
  assertNotNull(actual);
  assertEquals("java.util.ArrayList", actual.getClass().getName());
  assertEquals("[]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "<!DOCTYPE a PUBLIC \"0\" \"sample\">", SearchInputFactory_scaffolding.receiverState());
 }
}
