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
  try { SearchInputFactory_scaffolding.call("org.jsoup.nodes.Element", "org.jsoup.nodes.Element", "appendText", new String[]{"java.lang.String"}, new String[]{"a"}, false, 0, new String[][]{{"org.jsoup.nodes.Element", "hashCode", ""}, {"org.jsoup.nodes.Element", "getElementsByTag", "java.lang.String", "0x123456789"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput001() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jsoup.parser.Parser", "org.jsoup.parser.Parser", "parse", new String[]{"java.lang.String", "java.lang.String"}, new String[]{"nll<!", "12"}, true), new String[][]{{"append", "java.lang.String", "5"}});
  assertNotNull(actual);
  assertEquals("org.jsoup.nodes.Document", actual.getClass().getName());
  assertEquals("<!>\n<html>\n<head>\n</head>\n<body>\n nll \n</body>\n</html>a {hasText=true, isBlock=false}", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput002() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jsoup.parser.Parser", "org.jsoup.parser.Parser", "parse", new String[]{"java.lang.String", "java.lang.String"}, new String[]{"1.4", "http:D/exalple.com/?b=c"}, true), new String[][]{{"getElementsByAttributeValueContaining", "java.lang.String,java.lang.String", "2"}});
  assertNotNull(actual);
  assertEquals("org.jsoup.select.Elements", actual.getClass().getName());
  assertEquals("[]", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput003() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.parser.Tag", "org.jsoup.parser.Tag", "canContain", new String[]{"org.jsoup.parser.Tag"}, new String[]{"<sample:4>"}, false, 0, new String[][]{{"org.jsoup.parser.Tag", "preserveWhitespace", ""}, {"org.jsoup.parser.Tag", "hashCode", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "null {canContainBlock=false, getName=null, isBlock=false, isData=true, isEmpty=false, isInline=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput004() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jsoup.parser.Parser", "org.jsoup.parser.Parser", "parseBodyFragment", new String[]{"java.lang.String", "java.lang.String"}, new String[]{"L3i~8;/P;5,t;<o>:class!0", "1F\u00e9.;\n51LL"}, true), new String[][]{{"prependText", "java.lang.String", "3"}, {"getElementsByAttributeValue", "java.lang.String,java.lang.String", "6"}});
  assertNotNull(actual);
  assertEquals("org.jsoup.select.Elements", actual.getClass().getName());
  assertEquals("[]", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput005() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jsoup.parser.Parser", "org.jsoup.parser.Parser", "parseBodyFragment", new String[]{"java.lang.String", "java.lang.String"}, new String[]{"rL3i~8;/QQv;;4,t;<o", "`abaaaaaaaaaDaaaaaaaaa&aaaaa`"}, true, 0, null, 2), new String[][]{{"prependText", "java.lang.String", "3"}, {"appendText", "java.lang.String", "6"}, {"nextSibling", "", "3"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput006() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.parser.Tag", "org.jsoup.parser.Tag", "isData", new String[]{}, new String[]{}, false, 2, new String[][]{{"org.jsoup.parser.Tag", "isValidParent", "org.jsoup.parser.Tag", "<sample:3>"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
  assertEquals("receiver state after the call", "null {canContainBlock=false, getName=null, isBlock=false, isData=true, isEmpty=false, isInline=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput007() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jsoup.parser.Parser", "org.jsoup.parser.Parser", "parse", new String[]{"java.lang.String", "java.lang.String"}, new String[]{"Lw/t100CxQn77,..v<<o??7:valWlue>\\su+2.5fa b", "0"}, true), new String[][]{{"body", "", "2"}, {"isBlock", "", "0"}, {"lastElementSibling", "", "3"}, {"tag", "", "6"}});
  assertNotNull(actual);
  assertEquals("org.jsoup.parser.Tag", actual.getClass().getName());
  assertEquals("body {canContainBlock=true, getName=body, isBlock=true, isData=false, isEmpty=false, isInline=false}", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput008() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jsoup.parser.Parser", "org.jsoup.parser.Parser", "parse", new String[]{"java.lang.String", "java.lang.String"}, new String[]{"L2i~///_P;,:<<lo>:6clas\r0", ";1F\u00e9.51L1.1234567890"}, true), new String[][]{{"getElementsByAttributeValueStarting", "java.lang.String,java.lang.String", "5"}});
  assertNotNull(actual);
  assertEquals("org.jsoup.select.Elements", actual.getClass().getName());
  assertEquals("[]", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput009() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jsoup.parser.Parser", "org.jsoup.parser.Parser", "parse", new String[]{"java.lang.String", "java.lang.String"}, new String[]{"LKsj20cs\n,;v+5<m:", "<a>b</a>"}, true, 0, null, 2), new String[][]{{"getElementsByAttributeValueEnding", "java.lang.String,java.lang.String", "5"}});
  assertNotNull(actual);
  assertEquals("org.jsoup.select.Elements", actual.getClass().getName());
  assertEquals("[]", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput010() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jsoup.parser.Parser", "org.jsoup.parser.Parser", "parse", new String[]{"java.lang.String", "java.lang.String"}, new String[]{" 0\n>I^tv:>?.7x.d*[1;<<.<8_pt;=\u00ea\013\013\013xbc54C9113y#yH9-u=", ">f"}, true), new String[][]{{"data", "", "0"}, {"removeClass", "java.lang.String", "7"}, {"body", "", "3"}, {"getElementsByIndexLessThan", "int", "4"}});
  assertNotNull(actual);
  assertEquals("org.jsoup.select.Elements", actual.getClass().getName());
  assertEquals("[\n<body>\n  0 &gt;I^tv:&gt;?.7x.d*[1; &lt; &lt;. <8 _pt=\"\" bc54c9113y=\"\" yh9-u=\"\">\n </8>\n</body>, <8 _pt=\"\" bc54c9113y=\"\" yh9-u=\"\">\n </8>]", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput011() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jsoup.parser.Parser", "org.jsoup.parser.Parser", "parse", new String[]{"java.lang.String", "java.lang.String"}, new String[]{"oeLl\"<A>03T5Z$;zX+0B<;B6tt,-<8c55dmEe[0!E8mj1dzz&\\D\tI\t2=\u00e890xJJ\"9/116ik\"-0.0-</1", "lt;1.-f"}, true, 0, null, 2), new String[][]{{"data", "", "4"}, {"removeClass", "java.lang.String", "3"}, {"outerHtml", "", "1"}, {"getElementById", "java.lang.String", "5"}});
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput012() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jsoup.parser.Parser", "org.jsoup.parser.Parser", "parse", new String[]{"java.lang.String", "java.lang.String"}, new String[]{"IgLl\"<B/>T04X5Z$;z4,0B<;B6ts+-<c55\u00e9dPlEe[0!F8mjdzz&!D]I2=\u00e790xJJ\"9/116ik\"-0.0-</1", ",&&t9990vP-a56E::<p?:vaaue/?><>"}, true, 0, null, 1), new String[][]{{"head", "", "1"}, {"siblingElements", "", "3"}, {"addClass", "java.lang.String", "0"}, {"lastIndexOf", "java.lang.Object", "6"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("-1", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput013() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Element", "org.jsoup.nodes.Element", "hashCode", new String[]{}, new String[]{}, false, 17, new String[][]{{"org.jsoup.nodes.Element", "previousSibling", ""}, {"org.jsoup.nodes.Element", "getElementsByAttribute", "java.lang.String", "e1"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("1461345282", String.valueOf(actual));
  assertEquals("receiver state after the call", "<a comment=\"a\"></a> {hasText=false, isBlock=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput014() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jsoup.nodes.Element", "org.jsoup.nodes.Element", "toggleClass", new String[]{"java.lang.String"}, new String[]{"-s-1-9>"}, false, 5, new String[][]{{"org.jsoup.nodes.Element", "hasText", ""}, {"org.jsoup.nodes.Element", "parents", ""}}), new String[][]{{"replaceWith", "org.jsoup.nodes.Node", "5"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput015() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.parser.Parser", "org.jsoup.parser.Parser", "parseBodyFragmentRelaxed", new String[]{"java.lang.String", "java.lang.String"}, new String[]{"L2i8,9/P<5,t;<o>ps:clss!0<!--1.5val<!--", "bb"}, true, 0, null, 2);
  assertNotNull(actual);
  assertEquals("org.jsoup.nodes.Document", actual.getClass().getName());
  assertEquals("<html>\n<head>\n</head>\n<body>\n L2i8,9/P<5 t=\"\">\n  <o>\n   ps:clss!0\n   <!--1.5val<!--->\n  </o>\n </5>\n</body>\n</html> {hasText=true, isBlock=false}", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput016() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jsoup.parser.Parser", "org.jsoup.parser.Parser", "parseBodyFragmentRelaxed", new String[]{"java.lang.String", "java.lang.String"}, new String[]{"<a>b</a>", "idI"}, true, 0, null, 2), new String[][]{{"appendElement", "java.lang.String", "2"}, {"isBlock", "", "3"}, {"removeAttr", "java.lang.String", "1"}, {"nextElementSibling", "", "1"}});
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput017() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Element", "org.jsoup.nodes.Element", "data", new String[]{}, new String[]{}, false, 19, new String[][]{{"org.jsoup.nodes.Element", "addChild", "org.jsoup.nodes.Node", "<sample:7>"}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "<a\nb comment=\"a\">0\n</a\nb> {hasText=false, isBlock=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput018() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jsoup.parser.Parser", "org.jsoup.parser.Parser", "parse", new String[]{"java.lang.String", "java.lang.String"}, new String[]{"?T<1]``tX=\"^buab/\n?x-ee.f4vWdA92B7sri-c TLMrJD;oBl@>F#c5Kce?\\P\010a$3{k\"-1.0-</1", "\n2021-01./1"}, true, 0, null, 2), new String[][]{{"appendElement", "java.lang.String", "1"}, {"lastElementSibling", "", "2"}, {"previousSibling", "", "2"}, {"removeAttr", "java.lang.String", "5"}});
  assertNotNull(actual);
  assertEquals("org.jsoup.nodes.Element", actual.getClass().getName());
  assertEquals("\n<html>\n<head>\n</head>\n<body>\n ?T <1 tx=\"^buab/\n?x-ee.f4vWdA92B7sri-c TLMrJD;oBl@&gt;F#c5Kce?\\P\010a$3{k\" -1=\"\" 0-=\"\">\n </1>\n</body>\n</html> {hasText=true, isBlock=true}", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput019() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jsoup.parser.Parser", "org.jsoup.parser.Parser", "parse", new String[]{"java.lang.String", "java.lang.String"}, new String[]{"e\"<A^YoB;g,T/0&?E.T0nW<Q=\016IWb|eK(IIB48-& l\037;?BB)>9p6\"<<<<3.B$3\\[2k\"-1.0-</1<n1e", "+1I"}, true), new String[][]{{"getAllElements", "", "5"}, {"text", "", "5"}, {"addClass", "java.lang.String", "7"}});
  assertNotNull(actual);
  assertEquals("org.jsoup.select.Elements", actual.getClass().getName());
  assertEquals("[<html class=\" sample\">\n<head class=\" sample\">\n</head>\n<body class=\" sample\">\n e&quot; <a yob=\"\" g=\"\" t=\"\" 0=\"\" e=\"\" t0nw=\"\" class=\" sample\"><q bb=\"\" class=\" sample\">9p6&quot;&lt;&lt;&lt;<3 b=\"\" 3=\"\" ...#1103#553223794", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput020() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jsoup.parser.Parser", "org.jsoup.parser.Parser", "parse", new String[]{"java.lang.String", "java.lang.String"}, new String[]{"\t", "L2i~//\u00e9_P;,:<<lo>:clas\r0C"}, true, 0, null, 3), new String[][]{{"getAllElements", "", "5"}, {"text", "", "4"}, {"eq", "int", "7"}});
  assertNotNull(actual);
  assertEquals("org.jsoup.select.Elements", actual.getClass().getName());
  assertEquals("[]", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput021() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jsoup.parser.Parser", "org.jsoup.parser.Parser", "parse", new String[]{"java.lang.String", "java.lang.String"}, new String[]{"B1<1_Xo:6]B;f#--T-&.HH>\010VWWEc9<*`57qq) 6t, \0379DBa{u**popU<7=\0172\u00e9PJ\n$3\\{2k\"-1.0-</1", "1ee10"}, true), new String[][]{{"getAllElements", "", "5"}, {"text", "", "4"}, {"parents", "", "5"}});
  assertNotNull(actual);
  assertEquals("org.jsoup.select.Elements", actual.getClass().getName());
  assertEquals("[\n<html>\n<head>\n</head>\n<body>\n B1 <1 _xo:6=\"\" b=\"\" f=\"\" --t-=\"\" hh=\"\">\n  \010VWWEc9&lt;*`57qq) 6t, \0379DBa{u**popU<7 3=\"\" 2k=\"\" -1=\"\" 0-=\"\">\n  </7>\n </1>\n</body>\n</html>, \n<body>\n B1 <1 _xo:6=\"\" b=\"\" f=\"\"...#418#-1050342655", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput022() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Element", "org.jsoup.nodes.Element", "firstElementSibling", new String[]{}, new String[]{}, false, 6, new String[][]{{"org.jsoup.nodes.Element", "setParentNode", "org.jsoup.nodes.Node", "<sample:2>"}});
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput023() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.parser.Tag", "org.jsoup.parser.Tag", "isData", new String[]{}, new String[]{}, false, 18, new String[][]{{"org.jsoup.parser.Tag", "canContainBlock", ""}, {"org.jsoup.parser.Tag", "canContain", "org.jsoup.parser.Tag", "<sample:7>"}, {"org.jsoup.parser.Tag", "isValidAncestor", "org.jsoup.parser.Tag", "<sample:2>"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "a {canContainBlock=false, getName=a, isBlock=false, isData=false, isEmpty=false, isInline=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput024() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jsoup.nodes.Element", "org.jsoup.nodes.Element", "toggleClass", new String[]{"java.lang.String"}, new String[]{""}, false, 7, new String[][]{{"org.jsoup.nodes.Element", "prependElement", "java.lang.String", "T<1]``X=#^buab/\n?x-ee.f4vWdA92Br:sri-c TLM"}}, 1), new String[][]{{"getElementsByIndexLessThan", "int", "7"}});
  assertNotNull(actual);
  assertEquals("org.jsoup.select.Elements", actual.getClass().getName());
  assertEquals("[<x \t y comment=\"a\" class=\"\">\n<t<1]``x=#^buab/\n?x-ee.f4vwda92br:sri-c tlm>\n</t<1]``x=#^buab/\n?x-ee.f4vwda92br:sri-c tlm>\n</x \t y>, \n<t<1]``x=#^buab/\n?x-ee.f4vwda92br:sri-c tlm>\n</t<1]``x=#^buab/\n?x-ee...#223#412994339", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "<x \t y comment=\"a\" class=\"\">\n<t<1]``x=#^buab/\n?x-ee.f4vwda92br:sri-c tlm>\n</t<1]``x=#^buab/\n?x-ee.f4vwda92br:sri-c tlm>\n</x \t y> {hasText=false, isBlock=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput025() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jsoup.nodes.Element", "org.jsoup.nodes.Element", "prepend", new String[]{"java.lang.String"}, new String[]{"\r7<dE<A/>4b}Yo:C;y\010>C>\ns-7<2:!4fQP3&\"sru|/y\"4fBBLb]osFHF:=\t\u00e6bCKl#}126ik\"-0.0-</1"}, false, 7, new String[][]{{"org.jsoup.nodes.Element", "empty", ""}, {"org.jsoup.nodes.Element", "wrap", "java.lang.String", "B1<1_Xo96]B:f#--T-&.I/H>\010WEc9<*`57q) 6t,  \0379DBa{u**\u00e9pppU<7=\0172\u00e9PJ\n$3\\{2k\"-1.0-</1"}, {"org.jsoup.nodes.Element", "lastElementSibling", ""}}), new String[][]{{"html", "", "0"}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("7<de>\n<a></a>4b}Yo:C;y\010&gt;C&gt; s-7<2 :=\"\" 4fqp3=\"\" sru=\"\" y=\"\" 4fbblb=\"\" osfhf:=\"&aelig;bCKl#}126ik&quot;-0.0-\">\n</2>\n</de>", String.valueOf(actual));
  assertEquals("receiver state after the call", "<x \t y comment=\"a\">\n 7<de>\n<a></a>4b}Yo:C;y\010&gt;C&gt; s-7<2 :=\"\" 4fqp3=\"\" sru=\"\" y=\"\" 4fbblb=\"\" osfhf:=\"&aelig;bCKl#}126ik&quot;-0.0-\">\n</2>\n</de>\n</x \t y> {hasText=true, isBlock=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput026() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.parser.Tag", "org.jsoup.parser.Tag", "requiresSpecificParent", new String[]{}, new String[]{}, false, 7, new String[][]{{"org.jsoup.parser.Tag", "hashCode", ""}, {"org.jsoup.parser.Tag", "equals", "java.lang.Object", "<i:1>"}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "null {canContainBlock=false, getName=null, isBlock=false, isData=true, isEmpty=false, isInline=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput027() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jsoup.nodes.Element", "org.jsoup.nodes.Element", "children", new String[]{}, new String[]{}, false, 3, new String[][]{{"org.jsoup.nodes.Element", "absUrl", "java.lang.String", "1.22346678aa123456789001123456778901234567890TITLE"}, {"org.jsoup.nodes.Element", "wrap", "java.lang.String", "-'8v9+150j.6bn:5:<p1?:v_;xa?ue><<><n.-1./>"}, {"org.jsoup.nodes.Element", "appendElement", "java.lang.String", "textarea"}}, 2), new String[][]{{"removeAll", "java.util.Collection", "7"}, {"attr", "java.lang.String", "2"}, {"val", "java.lang.String", "7"}});
  assertNotNull(actual);
  assertEquals("org.jsoup.select.Elements", actual.getClass().getName());
  assertEquals("[\n<textarea>sample</textarea>]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "<<a><b>t</b></a> comment=\"a\">\n<textarea>sample</textarea>\n</<a><b>t</b></a>> {hasText=true, isBlock=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput028() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jsoup.nodes.Element", "org.jsoup.nodes.Element", "append", new String[]{"java.lang.String"}, new String[]{"Lw2i8,8,/P<5-,t;o=5qrcilst!0<!--1."}, false, 5, new String[][]{{"org.jsoup.nodes.Element", "removeChild", "org.jsoup.nodes.Node", "<sample:2>"}, {"org.jsoup.nodes.Element", "className", ""}}, 1), new String[][]{{"empty", "", "7"}, {"getElementsByClass", "java.lang.String", "3"}});
  assertNotNull(actual);
  assertEquals("org.jsoup.select.Elements", actual.getClass().getName());
  assertEquals("[]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "<{\"a\":1} comment=\"a\">\n</{\"a\":1}> {hasText=false, isBlock=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput029() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jsoup.nodes.Element", "org.jsoup.nodes.Element", "append", new String[]{"java.lang.String"}, new String[]{"!\tt99]@?06P-5/6D:9+<nn0=3\0133H44#IB9012455}9.03345689077il\"-0.01e10"}, false, 9, new String[][]{{"org.jsoup.nodes.Element", "removeClass", "java.lang.String", "<![CDATA["}, {"org.jsoup.nodes.Element", "setBaseUri", "java.lang.String", " "}, {"org.jsoup.nodes.Element", "wrap", "java.lang.String", "e019<A^Yo5B;g0-T.&/G.IT1WW<P=\rI8Dq}dI)I+49-&!\037;BB{u >1p5\"<o=2P-\t$3\\{2k\"-1.0-</1"}}, 3), new String[][]{{"className", "", "0"}, {"hasText", "", "3"}, {"hasClass", "java.lang.String", "6"}, {"prependChild", "org.jsoup.nodes.Node", "1"}});
  assertNotNull(actual);
  assertEquals("org.jsoup.nodes.Element", actual.getClass().getName());
  assertEquals("<line1\n\nline3 comment=\"a\" class=\"\">a!\tt99]@?06P-5/6D:9+<nn0 h44=\"\" ib9012455=\"\" 9=\"\" 03345689077il=\"\" -0=\"\" 01e10=\"\">\n</nn0>\n</line1\n\nline3> {hasText=true, isBlock=false}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "<line1\n\nline3 comment=\"a\" class=\"\">a!\tt99]@?06P-5/6D:9+<nn0 h44=\"\" ib9012455=\"\" 9=\"\" 03345689077il=\"\" -0=\"\" 01e10=\"\">\n</nn0>\n</line1\n\nline3> {hasText=true, isBlock=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput030() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jsoup.nodes.Element", "org.jsoup.nodes.Element", "append", new String[]{"java.lang.String"}, new String[]{"E\nf/C<A\\7qqq5AB;>gb/dC?TR\\E-]@.!?.j^<:$c5U<A<Q{;@\016{\r^]Idif"}, false, 3, new String[][]{{"org.jsoup.nodes.Element", "append", "java.lang.String", "4>F<!0>3}tH@i\"\u00e8)11'}A<6fts-=d85cntFb;33;OO3i66E4x DP0=7et115<ITM9/116ik\"-0.0-</1"}, {"org.jsoup.nodes.Element", "val", ""}, {"org.jsoup.nodes.Element", "text", ""}}, 3), new String[][]{{"append", "java.lang.String", "2"}, {"child", "int", "3"}});
  assertNotNull(actual);
  assertEquals("org.jsoup.nodes.Element", actual.getClass().getName());
  assertEquals("<a 7qqq5ab=\"\">gb/dC?TR\\E-]@.!?.j^&lt;:$c5U</a> {hasText=true, isBlock=false}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "<<a><b>t</b></a> comment=\"a\">\n4&gt;F<!0>3}tH@i&quot;&egrave;)11'}A<6fts -=\"d85cntFb;33;OO3i66E4x\" dp0=\"7et115\">\n<itm9 116ik=\"\" -0=\"\" 0-=\"\">\n</itm9>\n</6fts>E f/C<a 7qqq5ab=\"\">gb/dC?TR\\E-]@.!?.j^&lt;:$c...#278#-1768586709", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput031() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Element", "org.jsoup.nodes.Element", "nodeName", new String[]{}, new String[]{}, false, 3, new String[][]{{"org.jsoup.nodes.Element", "getElementsByIndexGreaterThan", "int", "-2147483648"}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("<a><b>t</b></a>", String.valueOf(actual));
  assertEquals("receiver state after the call", "<<a><b>t</b></a> comment=\"a\">\n</<a><b>t</b></a>> {hasText=false, isBlock=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput032() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Element", "org.jsoup.nodes.Element", "getElementsByIndexEquals", new String[]{"int"}, new String[]{"2147483647"}, false, 7, new String[][]{{"org.jsoup.nodes.Element", "html", "java.lang.String", "<![CDATA["}});
  assertNotNull(actual);
  assertEquals("org.jsoup.select.Elements", actual.getClass().getName());
  assertEquals("[]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "<x \t y comment=\"a\">\n</x \t y> {hasText=false, isBlock=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput033() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jsoup.nodes.Element", "org.jsoup.nodes.Element", "getElementsByAttributeValueNot", new String[]{"java.lang.String", "java.lang.String"}, new String[]{"P", ",&&t999900P-656\"::<p?:vaae?><>"}, false, 3, new String[][]{{"org.jsoup.nodes.Element", "previousElementSibling", ""}, {"org.jsoup.nodes.Element", "html", "java.lang.String", "B1<1_Xo:X6]B;f#---&.HH>\010VWWE/c9<*`573qq) 6t,B\0379DBa{u**popU<7=\017\u00e9PJ\n$3\\{2k\"-1.0-</"}}, 1), new String[][]{{"get", "int", "5"}, {"lastElementSibling", "", "3"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "<<a><b>t</b></a> comment=\"a\">\nB1<1 _xo:x6=\"\" b=\"\" f=\"\" ---=\"\" hh=\"\">\n\010VWWE/c9&lt;*`573qq) 6t,B\0379DBa{u**popU<7 3=\"\" 2k=\"\" -1=\"\" 0-=\"\">\n</7>\n</1>\n</<a><b>t</b></a>> {hasText=true, isBlock=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput034() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jsoup.parser.Parser", "org.jsoup.parser.Parser", "parseBodyFragment", new String[]{"java.lang.String", "java.lang.String"}, new String[]{"-'!8v9+150j.6b:5:<p1>:v`;xa?ue><<?<n.-1./><?1.12345678", "\u00ea.u2n bb"}, true, 0, null, 1), new String[][]{{"prependElement", "java.lang.String", "3"}, {"previousElementSibling", "", "2"}, {"lastElementSibling", "", "4"}, {"previousElementSibling", "", "0"}});
  assertNotNull(actual);
  assertEquals("org.jsoup.nodes.Element", actual.getClass().getName());
  assertEquals("\n<sample>\n</sample> {hasText=false, isBlock=false}", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput035() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Element", "org.jsoup.nodes.Element", "wrap", new String[]{"java.lang.String"}, new String[]{".! "}, false, 9, new String[][]{{"org.jsoup.nodes.Element", "val", "java.lang.String", "#rpot"}, {"org.jsoup.nodes.Element", "nextSibling", ""}});
  assertNull(actual);
  assertEquals("receiver state after the call", "<line1\n\nline3 comment=\"a\" value=\"#rpot\">\n</line1\n\nline3> {hasText=false, isBlock=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput036() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.parser.Parser", "org.jsoup.parser.Parser", "parse", new String[]{"java.lang.String", "java.lang.String"}, new String[]{"$3/r  d]d+s7+*fe\"Ks|DIG\rt2>fW14\rf3\014Lxxfi1fOP7@E\n&eet5c<Title/>oPPX0\u00e6l10EGEFFF-", "\r*.B10x1234567891"}, true);
  assertNotNull(actual);
  assertEquals("org.jsoup.nodes.Document", actual.getClass().getName());
  assertEquals("<html>\n<head>\n <title>oPPX0&aelig;l10EGEFFF-</title>\n</head>\n<body>\n $3/r d]d+s7+*fe&quot;Ks|DIG t2&gt;fW14 f3\014Lxxfi1fOP7@E &amp;eet5c \n</body>\n</html> {hasText=true, isBlock=false}", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput037() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jsoup.parser.Parser", "org.jsoup.parser.Parser", "parse", new String[]{"java.lang.String", "java.lang.String"}, new String[]{"F3 tvHPDC@5c6iE\"\taa!1*)A<9dr.<Title+\u00e84>E1.E5e3value-1", ""}, true, 0, null, 1), new String[][]{{"appendElement", "java.lang.String", "5"}, {"previousElementSibling", "", "4"}, {"firstElementSibling", "", "1"}, {"nextElementSibling", "", "6"}});
  assertNotNull(actual);
  assertEquals("org.jsoup.nodes.Element", actual.getClass().getName());
  assertEquals("<a></a> {hasText=false, isBlock=false}", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput038() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jsoup.nodes.Element", "org.jsoup.nodes.Element", "tagName", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.jsoup.nodes.Element", "prependElement", "java.lang.String", "null"}, {"org.jsoup.nodes.Element", "removeClass", "java.lang.String", "11.5f"}}, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput039() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Element", "org.jsoup.nodes.Element", "tagName", new String[]{}, new String[]{}, false, 3, new String[][]{{"org.jsoup.nodes.Element", "prependElement", "java.lang.String", "null"}, {"org.jsoup.nodes.Element", "removeClass", "java.lang.String", "11.5f"}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("<a><b>t</b></a>", String.valueOf(actual));
  assertEquals("receiver state after the call", "<<a><b>t</b></a> comment=\"a\" class=\"\">\n<null>\n</null>\n</<a><b>t</b></a>> {hasText=false, isBlock=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput040() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Element", "org.jsoup.nodes.Element", "tagName", new String[]{}, new String[]{}, false, 5, new String[][]{{"org.jsoup.nodes.Element", "prependElement", "java.lang.String", "null"}, {"org.jsoup.nodes.Element", "removeClass", "java.lang.String", "1F.51L"}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("{\"a\":1}", String.valueOf(actual));
  assertEquals("receiver state after the call", "<{\"a\":1} comment=\"a\" class=\"\">\n<null>\n</null>\n</{\"a\":1}> {hasText=false, isBlock=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput041() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Element", "org.jsoup.nodes.Element", "tagName", new String[]{}, new String[]{}, false, 3, new String[][]{{"org.jsoup.nodes.Element", "prependElement", "java.lang.String", "null"}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("<a><b>t</b></a>", String.valueOf(actual));
  assertEquals("receiver state after the call", "<<a><b>t</b></a> comment=\"a\">\n<null>\n</null>\n</<a><b>t</b></a>> {hasText=false, isBlock=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput042() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Element", "org.jsoup.nodes.Element", "tagName", new String[]{}, new String[]{}, false, 3, new String[][]{{"org.jsoup.nodes.Element", "prependElement", "java.lang.String", "nu\tl"}, {"org.jsoup.nodes.Element", "removeClass", "java.lang.String", "1F.51LL"}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("<a><b>t</b></a>", String.valueOf(actual));
  assertEquals("receiver state after the call", "<<a><b>t</b></a> comment=\"a\" class=\"\">\n<nu\tl>\n</nu\tl>\n</<a><b>t</b></a>> {hasText=false, isBlock=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput043() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Element", "org.jsoup.nodes.Element", "tagName", new String[]{}, new String[]{}, false, 3, new String[][]{{"org.jsoup.nodes.Element", "removeClass", "java.lang.String", "1F\u00e9.\n51LL"}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("<a><b>t</b></a>", String.valueOf(actual));
  assertEquals("receiver state after the call", "<<a><b>t</b></a> comment=\"a\" class=\"\">\n</<a><b>t</b></a>> {hasText=false, isBlock=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput044() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Element", "org.jsoup.nodes.Element", "tagName", new String[]{}, new String[]{}, false, 3, new String[][]{{"org.jsoup.nodes.Element", "prependElement", "java.lang.String", "null"}, {"org.jsoup.nodes.Element", "removeClass", "java.lang.String", "1F\u00e9.\n51LL"}, {"org.jsoup.nodes.Element", "val", "java.lang.String", "1.12345678901234567"}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("<a><b>t</b></a>", String.valueOf(actual));
  assertEquals("receiver state after the call", "<<a><b>t</b></a> comment=\"a\" class=\"\" value=\"1.12345678901234567\">\n<null>\n</null>\n</<a><b>t</b></a>> {hasText=false, isBlock=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput045() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Element", "org.jsoup.nodes.Element", "tagName", new String[]{}, new String[]{}, false, 3, new String[][]{{"org.jsoup.nodes.Element", "prependElement", "java.lang.String", "null"}, {"org.jsoup.nodes.Element", "val", "java.lang.String", "1.12345678901234567"}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("<a><b>t</b></a>", String.valueOf(actual));
  assertEquals("receiver state after the call", "<<a><b>t</b></a> comment=\"a\" value=\"1.12345678901234567\">\n<null>\n</null>\n</<a><b>t</b></a>> {hasText=false, isBlock=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput046() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.parser.Parser", "org.jsoup.parser.Parser", "parse", new String[]{"java.lang.String", "java.lang.String"}, new String[]{"aaaaaaaaaaaaaaaaaaaaaaaaaaaaaa", "\"a\":1}"}, true, 0, null, 3);
  assertNotNull(actual);
  assertEquals("org.jsoup.nodes.Document", actual.getClass().getName());
  assertEquals("<html>\n<head>\n</head>\n<body>\n aaaaaaaaaaaaaaaaaaaaaaaaaaaaaa \n</body>\n</html> {hasText=true, isBlock=false}", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput047() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jsoup.parser.Parser", "org.jsoup.parser.Parser", "parse", new String[]{"java.lang.String", "java.lang.String"}, new String[]{"F", "1#-5.5"}, true, 0, null, 1), new String[][]{{"getAllElements", "", "3"}});
  assertNotNull(actual);
  assertEquals("org.jsoup.select.Elements", actual.getClass().getName());
  assertEquals("[<html>\n<head>\n</head>\n<body>\n F \n</body>\n</html>, \n<html>\n<head>\n</head>\n<body>\n F \n</body>\n</html>, \n<head>\n</head>, \n<body>\n F \n</body>]", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput048() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jsoup.parser.Parser", "org.jsoup.parser.Parser", "parse", new String[]{"java.lang.String", "java.lang.String"}, new String[]{"1.12345678a", "-1e/./2345678901245"}, true, 0, null, 3), new String[][]{{"data", "", "3"}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput049() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jsoup.parser.Parser", "org.jsoup.parser.Parser", "parse", new String[]{"java.lang.String", "java.lang.String"}, new String[]{"-5", "null"}, true, 0, null, 3), new String[][]{{"data", "", "3"}, {"lastElementSibling", "", "1"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput050() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jsoup.nodes.Element", "org.jsoup.nodes.Element", "prepend", new String[]{"java.lang.String"}, new String[]{"[1,2]"}, false, 3, new String[][]{{"org.jsoup.nodes.Element", "hasClass", "java.lang.String", "1.12356{"}, {"org.jsoup.nodes.Element", "setParentNode", "org.jsoup.nodes.Node", "<null>"}}, 1), new String[][]{{"className", "", "4"}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("", String.valueOf(actual));
  assertEquals("receiver state after the call", "<<a><b>t</b></a> comment=\"a\">\n[1,2]\n</<a><b>t</b></a>> {hasText=true, isBlock=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput051() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jsoup.nodes.Element", "org.jsoup.nodes.Element", "prepend", new String[]{"java.lang.String"}, new String[]{"aaaaaaaaaaaaaaaaaaaaaaaaaaaaaa"}, false, 3, new String[][]{{"org.jsoup.nodes.Element", "hasClass", "java.lang.String", "1.12356|"}, {"org.jsoup.nodes.Element", "setParentNode", "org.jsoup.nodes.Node", "<null>"}}, 1), new String[][]{{"className", "", "4"}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("", String.valueOf(actual));
  assertEquals("receiver state after the call", "<<a><b>t</b></a> comment=\"a\">\naaaaaaaaaaaaaaaaaaaaaaaaaaaaaa\n</<a><b>t</b></a>> {hasText=true, isBlock=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput052() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jsoup.nodes.Element", "org.jsoup.nodes.Element", "prepend", new String[]{"java.lang.String"}, new String[]{"aaaaaaaaaaaaaaa:aaaaaaaaaaaaaa"}, false, 3, new String[][]{{"org.jsoup.nodes.Element", "hasClass", "java.lang.String", "1.12356|"}, {"org.jsoup.nodes.Element", "setParentNode", "org.jsoup.nodes.Node", "<null>"}}, 1), new String[][]{{"className", "", "4"}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("", String.valueOf(actual));
  assertEquals("receiver state after the call", "<<a><b>t</b></a> comment=\"a\">\naaaaaaaaaaaaaaa:aaaaaaaaaaaaaa\n</<a><b>t</b></a>> {hasText=true, isBlock=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput053() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jsoup.nodes.Element", "org.jsoup.nodes.Element", "prepend", new String[]{"java.lang.String"}, new String[]{"aaaaaaaaaaaaaaaaaaaaaaaaaaaaaa"}, false, 7, new String[][]{{"org.jsoup.nodes.Element", "hasClass", "java.lang.String", "1.12356|"}, {"org.jsoup.nodes.Element", "setParentNode", "org.jsoup.nodes.Node", "<null>"}}, 1), new String[][]{{"className", "", "4"}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("", String.valueOf(actual));
  assertEquals("receiver state after the call", "<x \t y comment=\"a\">\naaaaaaaaaaaaaaaaaaaaaaaaaaaaaa\n</x \t y> {hasText=true, isBlock=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput054() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jsoup.nodes.Element", "org.jsoup.nodes.Element", "prepend", new String[]{"java.lang.String"}, new String[]{"aaaaaaaaaaaaaaaaaaaaaraaaaaaaa"}, false, 7, new String[][]{{"org.jsoup.nodes.Element", "hasClass", "java.lang.String", "1.12356|"}, {"org.jsoup.nodes.Element", "setParentNode", "org.jsoup.nodes.Node", "<null>"}}, 1), new String[][]{{"className", "", "4"}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("", String.valueOf(actual));
  assertEquals("receiver state after the call", "<x \t y comment=\"a\">\naaaaaaaaaaaaaaaaaaaaaraaaaaaaa\n</x \t y> {hasText=true, isBlock=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput055() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jsoup.nodes.Element", "org.jsoup.nodes.Element", "prepend", new String[]{"java.lang.String"}, new String[]{"`aaaaaaaaaaaaaaaaaaaaaaaaaaa`"}, false, 7, new String[][]{{"org.jsoup.nodes.Element", "html", "java.lang.String", "FE,"}}, 2), new String[][]{{"className", "", "4"}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("", String.valueOf(actual));
  assertEquals("receiver state after the call", "<x \t y comment=\"a\">\n`aaaaaaaaaaaaaaaaaaaaaaaaaaa`FE,\n</x \t y> {hasText=true, isBlock=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput056() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jsoup.nodes.Element", "org.jsoup.nodes.Element", "prepend", new String[]{"java.lang.String"}, new String[]{"1.12345678901234467"}, false, 1, new String[][]{}, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput057() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jsoup.nodes.Element", "org.jsoup.nodes.Element", "prepend", new String[]{"java.lang.String"}, new String[]{"aaaaaaaaaaaaaaaaaaaaaraaaaaaaa"}, false, 1, new String[][]{{"org.jsoup.nodes.Element", "parents", ""}, {"org.jsoup.nodes.Element", "hasClass", "java.lang.String", "value"}}, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput058() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jsoup.parser.Parser", "org.jsoup.parser.Parser", "parse", new String[]{"java.lang.String", "java.lang.String"}, new String[]{"eI", "12334\r68890012x3456789012]4567890jd"}, true, 0, null, 3), new String[][]{{"remove", "", "5"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput059() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jsoup.parser.Parser", "org.jsoup.parser.Parser", "parse", new String[]{"java.lang.String", "java.lang.String"}, new String[]{"TITLE", "21/>"}, true, 0, null, 3), new String[][]{{"hasClass", "java.lang.String", "2"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput060() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jsoup.parser.Parser", "org.jsoup.parser.Parser", "parse", new String[]{"java.lang.String", "java.lang.String"}, new String[]{"aaaaaaaaaaaaaaaaaaaaaraaaaaaaa", "<21/>-0x.5\037"}, true, 0, null, 3), new String[][]{{"hasClass", "java.lang.String", "2"}, {"classNames", "", "3"}});
  assertNotNull(actual);
  assertEquals("java.util.LinkedHashSet", actual.getClass().getName());
  assertEquals("[]", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput061() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jsoup.parser.Parser", "org.jsoup.parser.Parser", "parse", new String[]{"java.lang.String", "java.lang.String"}, new String[]{"a:aaaaaaaaaaaaaaaaaaaaraaaaaaaa", "<21/?-x.5\037"}, true, 0, null, 3), new String[][]{{"hasClass", "java.lang.String", "2"}, {"classNames", "", "3"}, {"size", "", "1"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("1", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput062() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.parser.Parser", "org.jsoup.parser.Parser", "parse", new String[]{"java.lang.String", "java.lang.String"}, new String[]{"2.4", "I"}, true, 0, null, 2);
  assertNotNull(actual);
  assertEquals("org.jsoup.nodes.Document", actual.getClass().getName());
  assertEquals("<html>\n<head>\n</head>\n<body>\n 2.4 \n</body>\n</html> {hasText=true, isBlock=false}", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput063() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jsoup.parser.Parser", "org.jsoup.parser.Parser", "parseBodyFragment", new String[]{"java.lang.String", "java.lang.String"}, new String[]{"t8/0P6.", "`kXe11"}, true, 0, null, 3), new String[][]{{"append", "java.lang.String", "5"}, {"addClass", "java.lang.String", "0"}});
  assertNotNull(actual);
  assertEquals("org.jsoup.nodes.Document", actual.getClass().getName());
  assertEquals("<html>\n<head>\n</head>\n<body>\n t8/0P6.\n</body>\n</html>a {hasText=true, isBlock=false}", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput064() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Element", "org.jsoup.nodes.Element", "baseUri", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.jsoup.nodes.Element", "toggleClass", "java.lang.String", "`aaaaaaaaaaaaaaaaaaaaaaaaaaa`"}, {"org.jsoup.nodes.Element", "getElementsByAttributeValueEnding", "java.lang.String,java.lang.String", "1.5e300", "Hello, World"}}, 2);
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput065() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Element", "org.jsoup.nodes.Element", "nodeDepth", new String[]{}, new String[]{}, false, 4, new String[][]{{"org.jsoup.nodes.Element", "toString", ""}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput066() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jsoup.parser.Parser", "org.jsoup.parser.Parser", "parseBodyFragment", new String[]{"java.lang.String", "java.lang.String"}, new String[]{"itt8/0P6.;<?", "xkX61\r1.5"}, true, 0, null, 3), new String[][]{{"append", "java.lang.String", "5"}, {"addClass", "java.lang.String", "0"}});
  assertNotNull(actual);
  assertEquals("org.jsoup.nodes.Document", actual.getClass().getName());
  assertEquals("<html>\n<head>\n</head>\n<body>\n itt8/0P6.;<?>\n</body>\n</html>a {hasText=true, isBlock=false}", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput067() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jsoup.parser.Parser", "org.jsoup.parser.Parser", "parseBodyFragment", new String[]{"java.lang.String", "java.lang.String"}, new String[]{"it8/0P66.;<?", "12A34"}, true, 0, null, 3), new String[][]{{"append", "java.lang.String", "5"}, {"addClass", "java.lang.String", "0"}, {"hasAttr", "java.lang.String", "0"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput068() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jsoup.parser.Parser", "org.jsoup.parser.Parser", "parseBodyFragment", new String[]{"java.lang.String", "java.lang.String"}, new String[]{"it8/0P66..;<?", ".0E-5"}, true, 0, null, 1), new String[][]{{"prependChild", "org.jsoup.nodes.Node", "5"}, {"addClass", "java.lang.String", "0"}, {"hasAttr", "java.lang.String", "0"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput069() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jsoup.parser.Parser", "org.jsoup.parser.Parser", "parseBodyFragment", new String[]{"java.lang.String", "java.lang.String"}, new String[]{"Lit8/0P66,.;<o?:", "&lt;"}, true, 0, null, 1), new String[][]{{"prependChild", "org.jsoup.nodes.Node", "5"}, {"addClass", "java.lang.String", "0"}, {"hasAttr", "java.lang.String", "0"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput070() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jsoup.parser.Parser", "org.jsoup.parser.Parser", "parseBodyFragment", new String[]{"java.lang.String", "java.lang.String"}, new String[]{"Lit8/0P66,.;<o?:", "&lt;"}, true, 0, null, 1), new String[][]{{"prependChild", "org.jsoup.nodes.Node", "5"}, {"addClass", "java.lang.String", "0"}, {"hasAttr", "java.lang.String", "0"}, {"getElementsByAttributeValueNot", "java.lang.String,java.lang.String", "7"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput071() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jsoup.parser.Parser", "org.jsoup.parser.Parser", "parseBodyFragment", new String[]{"java.lang.String", "java.lang.String"}, new String[]{"Lit800P66,.;<o?:", "&lt;1.5f"}, true, 0, null, 1), new String[][]{{"prependChild", "org.jsoup.nodes.Node", "5"}, {"addClass", "java.lang.String", "0"}});
  assertNotNull(actual);
  assertEquals("org.jsoup.nodes.Document", actual.getClass().getName());
  assertEquals("<!a>\n<html>\n<head>\n</head>\n<body>\n Lit800P66,.;<o :=\"\">\n </o>\n</body>\n</html> {hasText=true, isBlock=false}", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput072() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jsoup.parser.Parser", "org.jsoup.parser.Parser", "parseBodyFragment", new String[]{"java.lang.String", "java.lang.String"}, new String[]{"Lit800P-66,.;<o?:", "&}t;1.5fn"}, true, 0, null, 1), new String[][]{{"prependChild", "org.jsoup.nodes.Node", "5"}, {"addClass", "java.lang.String", "0"}, {"absUrl", "java.lang.String", "1"}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput073() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jsoup.parser.Parser", "org.jsoup.parser.Parser", "parseBodyFragment", new String[]{"java.lang.String", "java.lang.String"}, new String[]{"Ljt800P-n66,.;<o?:value>", "&}t;1.5fn"}, true, 0, null, 1), new String[][]{{"prependChild", "org.jsoup.nodes.Node", "5"}, {"addClass", "java.lang.String", "0"}});
  assertNotNull(actual);
  assertEquals("org.jsoup.nodes.Document", actual.getClass().getName());
  assertEquals("<!a>\n<html>\n<head>\n</head>\n<body>\n Ljt800P-n66,.;<o :value=\"\">\n </o>\n</body>\n</html> {hasText=true, isBlock=false}", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput074() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jsoup.parser.Parser", "org.jsoup.parser.Parser", "parseBodyFragment", new String[]{"java.lang.String", "java.lang.String"}, new String[]{",s900P-n66,E:<o?:vaaueo?><", "1.1E34478<?"}, true, 0, null, 1), new String[][]{{"prependChild", "org.jsoup.nodes.Node", "1"}, {"addClass", "java.lang.String", "0"}});
  assertNotNull(actual);
  assertEquals("org.jsoup.nodes.Document", actual.getClass().getName());
  assertEquals("a\n<html>\n<head>\n</head>\n<body>\n ,s900P-n66,E:<o :vaaueo=\"\">\n  &lt;\n </o>\n</body>\n</html> {hasText=true, isBlock=false}", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput075() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jsoup.parser.Parser", "org.jsoup.parser.Parser", "parseBodyFragment", new String[]{"java.lang.String", "java.lang.String"}, new String[]{",s900P-66,E:<o?:vaaueo?><", "1.1E34478<?"}, true, 0, null, 1), new String[][]{{"prependChild", "org.jsoup.nodes.Node", "1"}, {"baseUri", "", "0"}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("1.1E34478<?", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput076() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jsoup.parser.Parser", "org.jsoup.parser.Parser", "parseBodyFragment", new String[]{"java.lang.String", "java.lang.String"}, new String[]{",&s900P-666E:<o?:vaaueo?><", "1.1E3478<?"}, true, 0, null, 1), new String[][]{{"prependChild", "org.jsoup.nodes.Node", "1"}, {"baseUri", "", "0"}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("1.1E3478<?", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput077() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jsoup.parser.Parser", "org.jsoup.parser.Parser", "parseBodyFragment", new String[]{"java.lang.String", "java.lang.String"}, new String[]{",&s900P-656E::<o?:vaaue?><", "1.1E3478<?a"}, true, 0, null, 1), new String[][]{{"prependChild", "org.jsoup.nodes.Node", "1"}, {"firstElementSibling", "", "6"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput078() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jsoup.parser.Parser", "org.jsoup.parser.Parser", "parseBodyFragment", new String[]{"java.lang.String", "java.lang.String"}, new String[]{",&&t99900P-656E::<p?:vaaue?><>", "FE,#root"}, true, 0, null, 1), new String[][]{{"prependChild", "org.jsoup.nodes.Node", "1"}});
  assertNotNull(actual);
  assertEquals("org.jsoup.nodes.Document", actual.getClass().getName());
  assertEquals("a\n<html>\n<head>\n</head>\n<body>\n ,&amp;&amp;t99900P-656E::\n <p :vaaue=\"\">&lt;&gt;</p>\n</body>\n</html> {hasText=true, isBlock=false}", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput079() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jsoup.parser.Parser", "org.jsoup.parser.Parser", "parseBodyFragment", new String[]{"java.lang.String", "java.lang.String"}, new String[]{",&&t99900P-656E::<o?:vaaue?><>", "FE,#root"}, true, 0, null, 1), new String[][]{{"getElementsByIndexEquals", "int", "1"}});
  assertNotNull(actual);
  assertEquals("org.jsoup.select.Elements", actual.getClass().getName());
  assertEquals("[]", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput080() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jsoup.parser.Parser", "org.jsoup.parser.Parser", "parseBodyFragment", new String[]{"java.lang.String", "java.lang.String"}, new String[]{"+!\rt99906uP-556D::<o0?223445IB90123456889.12345678:0Tiule40x1F", "ns,I"}, true, 0, null, 3), new String[][]{{"getElementsByIndexEquals", "int", "1"}, {"removeClass", "java.lang.String", "5"}});
  assertNotNull(actual);
  assertEquals("org.jsoup.select.Elements", actual.getClass().getName());
  assertEquals("[]", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput081() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.parser.Tag", "org.jsoup.parser.Tag", "equals", new String[]{"java.lang.Object"}, new String[]{"<sample:0>"}, false, 0, new String[][]{{"org.jsoup.parser.Tag", "preserveWhitespace", ""}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "null {canContainBlock=false, getName=null, isBlock=false, isData=true, isEmpty=false, isInline=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput082() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jsoup.parser.Parser", "org.jsoup.parser.Parser", "parseBodyFragment", new String[]{"java.lang.String", "java.lang.String"}, new String[]{"+!\rt9:9?06P-556D:+<o0?223H445IB9012345689.02345689:07iulf4+0x1F", "1.12346678aa123456789012345678901234567890"}, true, 0, null, 1), new String[][]{{"addClass", "java.lang.String", "1"}, {"getElementsByIndexLessThan", "int", "0"}});
  assertNotNull(actual);
  assertEquals("org.jsoup.select.Elements", actual.getClass().getName());
  assertEquals("[]", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput083() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jsoup.parser.Parser", "org.jsoup.parser.Parser", "parseBodyFragment", new String[]{"java.lang.String", "java.lang.String"}, new String[]{"+!\r:t9:9?0P-556D:+<o0?223H445IB9012345689.02345689:07iulf4+0x1F", "1.123466787aa12345678901234567890123456789abc"}, true, 0, null, 1), new String[][]{{"addClass", "java.lang.String", "1"}, {"prependText", "java.lang.String", "0"}});
  assertNotNull(actual);
  assertEquals("org.jsoup.nodes.Document", actual.getClass().getName());
  assertEquals("<html>\n<head>\n</head>\n<body>\n +! :t9:9?0P-556D:+<o0 223h445\u0131b9012345689=\"\" 02345689:07iulf4=\"\" 0x1f=\"\">\n </o0>\n</body>\n</html> {hasText=true, isBlock=false}", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput084() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jsoup.nodes.Element", "org.jsoup.nodes.Element", "getElementsByTag", new String[]{"java.lang.String"}, new String[]{"0x1F"}, false, 0, null, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput085() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jsoup.parser.Parser", "org.jsoup.parser.Parser", "parseBodyFragment", new String[]{"java.lang.String", "java.lang.String"}, new String[]{"*!\r:t9:93?0&.556D:+<n0?223H44?IB9012345788n02345689:07iulf4+0xF1e10I", "za\037\037b"}, true, 0, null, 3), new String[][]{{"addClass", "java.lang.String", "1"}, {"prependText", "java.lang.String", "0"}, {"nextElementSibling", "", "4"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput086() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jsoup.parser.Parser", "org.jsoup.parser.Parser", "parseBodyFragment", new String[]{"java.lang.String", "java.lang.String"}, new String[]{"*!\r:t99:93?00&4.556D:+<n0?223H404?B90122345798n0245689:07iulf4+/xF1e10Iid123456a", "Mjs900P-n66,E;<n?:vaue>=![CDATA[text`rea"}, true, 0, null, 3), new String[][]{{"addClass", "java.lang.String", "7"}, {"prependText", "java.lang.String", "0"}, {"data", "", "7"}, {"childNode", "int", "2"}});
  assertNotNull(actual);
  assertEquals("org.jsoup.nodes.TextNode", actual.getClass().getName());
  assertEquals(" {getWholeText=, isBlank=true}", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput087() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jsoup.parser.Parser", "org.jsoup.parser.Parser", "parseBodyFragment", new String[]{"java.lang.String", "java.lang.String"}, new String[]{"+!\r:t9:9?0P-556D:+<o0?223H445IB9012345689.02345689:07iulf4+0x1F", "12"}, true, 0, null, 3), new String[][]{{"addClass", "java.lang.String", "7"}, {"prependText", "java.lang.String", "0"}, {"child", "int", "7"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IndexOutOfBoundsException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput088() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jsoup.parser.Parser", "org.jsoup.parser.Parser", "parseBodyFragment", new String[]{"java.lang.String", "java.lang.String"}, new String[]{"<!--", "1.13445687n123456TITLETITLE"}, true, 0, null, 1), new String[][]{{"addClass", "java.lang.String", "6"}, {"getElementsByClass", "java.lang.String", "0"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput089() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.parser.Tag", "org.jsoup.parser.Tag", "equals", new String[]{"java.lang.Object"}, new String[]{"<i:0>"}, false, 0, null, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "null {canContainBlock=false, getName=null, isBlock=false, isData=true, isEmpty=false, isInline=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput090() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jsoup.nodes.Element", "org.jsoup.nodes.Element", "appendElement", new String[]{"java.lang.String"}, new String[]{"Ljt800P-n66,.;<o?:value>"}, false, 0, null, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput091() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jsoup.parser.Parser", "org.jsoup.parser.Parser", "parseBodyFragment", new String[]{"java.lang.String", "java.lang.String"}, new String[]{"F2\"\r\r:t7i:0}-;:4\nD:91e\t><n+11e101.12345678", "1.0T233456#8"}, true, 0, null, 2), new String[][]{{"appendText", "java.lang.String", "6"}});
  assertNotNull(actual);
  assertEquals("org.jsoup.nodes.Document", actual.getClass().getName());
  assertEquals("<html>\n<head>\n</head>\n<body>\n F2&quot; :t7i:0}-;:4 D:91e\t&gt;<n 11e101=\"\" 12345678=\"\">\n </n>\n</body>\n</html>0 {hasText=true, isBlock=false}", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput092() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Element", "org.jsoup.nodes.Element", "html", new String[]{}, new String[]{}, false, 7, new String[][]{{"org.jsoup.nodes.Element", "previousSibling", ""}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("", String.valueOf(actual));
  assertEquals("receiver state after the call", "<x \t y comment=\"a\">\n</x \t y> {hasText=false, isBlock=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput093() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jsoup.parser.Parser", "org.jsoup.parser.Parser", "parseBodyFragment", new String[]{"java.lang.String", "java.lang.String"}, new String[]{"F1\"\r\r:s6:0}l;:4\nc:91e\n><n+11e001.123456791E-5", "TTiutkeee"}, true, 0, null, 3), new String[][]{{"prepend", "java.lang.String", "1"}});
  assertNotNull(actual);
  assertEquals("org.jsoup.nodes.Document", actual.getClass().getName());
  assertEquals("a\n<html>\n<head>\n</head>\n<body>\n F1&quot; :s6:0}l;:4 c:91e &gt;<n 11e001=\"\" 123456791e-5=\"\">\n </n>\n</body>\n</html> {hasText=true, isBlock=false}", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput094() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jsoup.parser.Parser", "org.jsoup.parser.Parser", "parseBodyFragment", new String[]{"java.lang.String", "java.lang.String"}, new String[]{"<21/>-0x.5\037", "n\\ll<\t"}, true, 0, null, 1), new String[][]{{"baseUri", "", "3"}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("n\\ll<", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput095() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jsoup.nodes.Element", "org.jsoup.nodes.Element", "children", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.jsoup.nodes.Element", "absUrl", "java.lang.String", "{\"a\":1}"}, {"org.jsoup.nodes.Element", "appendText", "java.lang.String", "+!\r:t9:9?0P-556D:+<o0?223H445IB9012345689.02345689:07iulf4+0x1F"}}, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput096() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jsoup.parser.Parser", "org.jsoup.parser.Parser", "parseBodyFragment", new String[]{"java.lang.String", "java.lang.String"}, new String[]{"</", "http://example.com/a?b=c"}, true, 0, null, 1), new String[][]{{"children", "", "1"}});
  assertNotNull(actual);
  assertEquals("org.jsoup.select.Elements", actual.getClass().getName());
  assertEquals("[\n<html>\n<head>\n</head>\n<body>\n</body>\n</html>]", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput097() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jsoup.parser.Parser", "org.jsoup.parser.Parser", "parseBodyFragment", new String[]{"java.lang.String", "java.lang.String"}, new String[]{"rL3i~8;/QQv;;4,t;<o>9class!0-1", "`abaaaaaabaaaaDaaaaaaaaaaaaaa`"}, true, 0, null, 2), new String[][]{{"prependText", "java.lang.String", "3"}, {"appendText", "java.lang.String", "6"}});
  assertNotNull(actual);
  assertEquals("org.jsoup.nodes.Document", actual.getClass().getName());
  assertEquals("sample\n<html>\n<head>\n</head>\n<body>\n rL3i~8;/QQv;;4,t;<o>\n  9class!0-1\n </o>\n</body>\n</html>0 {hasText=true, isBlock=false}", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput098() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jsoup.parser.Parser", "org.jsoup.parser.Parser", "parse", new String[]{"java.lang.String", "java.lang.String"}, new String[]{"<a>b</a>", "!"}, true, 0, null, 2), new String[][]{{"nextElementSibling", "", "2"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput099() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jsoup.parser.Parser", "org.jsoup.parser.Parser", "parse", new String[]{"java.lang.String", "java.lang.String"}, new String[]{"<a?b</3a>", "\u00e9clasr"}, true, 0, null, 2), new String[][]{{"nextElementSibling", "", "2"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput100() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jsoup.parser.Parser", "org.jsoup.parser.Parser", "parse", new String[]{"java.lang.String", "java.lang.String"}, new String[]{"=a?b</a>", "\u00e9clasr"}, true, 0, null, 2), new String[][]{{"nextElementSibling", "", "2"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput101() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jsoup.parser.Parser", "org.jsoup.parser.Parser", "parse", new String[]{"java.lang.String", "java.lang.String"}, new String[]{"+!\016:t99??,1dP__-556lC:0<For?2{23G445JB9012X23 ,66689c-_13301.5d", "_"}, true, 0, null, 2), new String[][]{{"classNames", "", "2"}, {"size", "", "0"}, {"addAll", "java.util.Collection", "6"}, {"containsAll", "java.util.Collection", "4"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput102() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jsoup.nodes.Element", "org.jsoup.nodes.Element", "getElementsByIndexLessThan", new String[]{"int"}, new String[]{"-2147483648"}, false, 0, new String[][]{{"org.jsoup.nodes.Element", "indent", "java.lang.StringBuilder", "<sample:1>"}}, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput103() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jsoup.parser.Parser", "org.jsoup.parser.Parser", "parse", new String[]{"java.lang.String", "java.lang.String"}, new String[]{"+{!\r:t999??\n1dP^_.556lC:::0<Gor?2{2#3G445JB002X23 ,47768", "\u00e9+5texxtarfa.5idtetarea"}, true, 0, null, 3), new String[][]{{"classNames", "", "2"}, {"contains", "java.lang.Object", "0"}, {"addAll", "java.util.Collection", "3"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput104() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jsoup.parser.Parser", "org.jsoup.parser.Parser", "parse", new String[]{"java.lang.String", "java.lang.String"}, new String[]{"+{!\r:t999??\n1dP^_.556lC::0<Gor?2{2#3G445JB002X23 ,48768<!", "2020-02-30Ti25:61:61"}, true, 0, null, 3), new String[][]{{"classNames", "", "2"}, {"contains", "java.lang.Object", "0"}, {"addAll", "java.util.Collection", "3"}, {"clone", "", "3"}});
  assertNotNull(actual);
  assertEquals("java.util.LinkedHashSet", actual.getClass().getName());
  assertEquals("[, sample]", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput105() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jsoup.nodes.Element", "org.jsoup.nodes.Element", "children", new String[]{}, new String[]{}, false, 0, null, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput106() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jsoup.parser.Parser", "org.jsoup.parser.Parser", "parse", new String[]{"java.lang.String", "java.lang.String"}, new String[]{"{!\r:t99i9??\n1cP]_`.il\\lrC:::/<Gor?--11.1234567890123456", "<!"}, true, 0, null, 1), new String[][]{{"classNames", "", "2"}, {"contains", "java.lang.Object", "0"}, {"containsAll", "java.util.Collection", "3"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput107() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jsoup.parser.Parser", "org.jsoup.parser.Parser", "parse", new String[]{"java.lang.String", "java.lang.String"}, new String[]{"Ljt800P-n66,.;<o?:value>", "<a>b</a>"}, true, 0, null, 3), new String[][]{{"body", "", "2"}, {"isBlock", "", "0"}, {"lastElementSibling", "", "3"}});
  assertNotNull(actual);
  assertEquals("org.jsoup.nodes.Element", actual.getClass().getName());
  assertEquals("\n<body>\n Ljt800P-n66,.; <o :value=\"\">\n </o>\n</body> {hasText=true, isBlock=true}", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput108() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jsoup.parser.Parser", "org.jsoup.parser.Parser", "parse", new String[]{"java.lang.String", "java.lang.String"}, new String[]{"Lx/t800P-n66,.;<o?:value>", "\\_>c</a><\"--"}, true, 0, null, 2), new String[][]{{"body", "", "2"}, {"isBlock", "", "0"}, {"lastElementSibling", "", "3"}});
  assertNotNull(actual);
  assertEquals("org.jsoup.nodes.Element", actual.getClass().getName());
  assertEquals("\n<body>\n Lx/t800P-n66,.; <o :value=\"\">\n </o>\n</body> {hasText=true, isBlock=true}", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput109() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jsoup.nodes.Element", "org.jsoup.nodes.Element", "id", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.jsoup.nodes.Element", "id", ""}}, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput110() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jsoup.parser.Parser", "org.jsoup.parser.Parser", "parse", new String[]{"java.lang.String", "java.lang.String"}, new String[]{"Lw/t100CPn67,..<<o??:valWlue>\\su+1.5f", "<"}, true, 0, null, 1), new String[][]{{"body", "", "2"}, {"isBlock", "", "0"}, {"lastElementSibling", "", "3"}});
  assertNotNull(actual);
  assertEquals("org.jsoup.nodes.Element", actual.getClass().getName());
  assertEquals("\n<body>\n Lw/t100CPn67,.. &lt; <o :valwlue=\"\">\n  \\su+1.5f\n </o>\n</body> {hasText=true, isBlock=true}", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput111() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jsoup.parser.Parser", "org.jsoup.parser.Parser", "parse", new String[]{"java.lang.String", "java.lang.String"}, new String[]{"Lw/t110CxQn77,..v<<<o??7:valWlue>\\su+2.5fa b1.1234567890234567", ""}, true, 0, null, 2), new String[][]{{"body", "", "2"}, {"isBlock", "", "0"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput112() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jsoup.parser.Parser", "org.jsoup.parser.Parser", "parse", new String[]{"java.lang.String", "java.lang.String"}, new String[]{"Lw/vts110CxQ7,..D<<<p??8 ualWlue>\\", "!O6<"}, true, 0, null, 2), new String[][]{{"body", "", "2"}, {"isBlock", "", "0"}, {"getElementsByIndexEquals", "int", "6"}});
  assertNotNull(actual);
  assertEquals("org.jsoup.select.Elements", actual.getClass().getName());
  assertEquals("[]", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput113() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jsoup.nodes.Element", "org.jsoup.nodes.Element", "tagName", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.jsoup.nodes.Element", "prependElement", "java.lang.String", "null"}, {"org.jsoup.nodes.Element", "removeClass", "java.lang.String", "1.5f"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput114() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jsoup.nodes.Element", "org.jsoup.nodes.Element", "val", new String[]{}, new String[]{}, false); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput115() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jsoup.nodes.Element", "org.jsoup.nodes.Element", "removeAttr", new String[]{"java.lang.String"}, new String[]{"<!"}, false); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput116() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jsoup.nodes.Element", "org.jsoup.nodes.Element", "remove", new String[]{}, new String[]{}, false, 2, new String[][]{{"org.jsoup.nodes.Element", "replaceWith", "org.jsoup.nodes.Node", "<sample:1>"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput117() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.parser.Parser", "org.jsoup.parser.Parser", "parse", new String[]{"java.lang.String", "java.lang.String"}, new String[]{"1F\u00e9.\n51LL", "/>"}, true);
  assertNotNull(actual);
  assertEquals("org.jsoup.nodes.Document", actual.getClass().getName());
  assertEquals("<html>\n<head>\n</head>\n<body>\n 1F&eacute;. 51LL \n</body>\n</html> {hasText=true, isBlock=false}", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput118() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jsoup.parser.Parser", "org.jsoup.parser.Parser", "parse", new String[]{"java.lang.String", "java.lang.String"}, new String[]{"1?#.\n51LL", "<null>"}, true); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput119() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jsoup.parser.Parser", "org.jsoup.parser.Parser", "parse", new String[]{"java.lang.String", "java.lang.String"}, new String[]{"1.5", "#a\":1}\\s++1"}, true), new String[][]{{"nextElementSibling", "", "5"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput120() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jsoup.parser.Parser", "org.jsoup.parser.Parser", "parse", new String[]{"java.lang.String", "java.lang.String"}, new String[]{"FE-", "#a\":1}\\s+5+1<!"}, true), new String[][]{{"getAllElements", "", "3"}});
  assertNotNull(actual);
  assertEquals("org.jsoup.select.Elements", actual.getClass().getName());
  assertEquals("[<html>\n<head>\n</head>\n<body>\n FE- \n</body>\n</html>, \n<html>\n<head>\n</head>\n<body>\n FE- \n</body>\n</html>, \n<head>\n</head>, \n<body>\n FE- \n</body>]", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput121() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jsoup.parser.Parser", "org.jsoup.parser.Parser", "parse", new String[]{"java.lang.String", "java.lang.String"}, new String[]{"LL", "-1 1.123456789012345"}, true), new String[][]{{"child", "int", "1"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IndexOutOfBoundsException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput122() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jsoup.nodes.Element", "org.jsoup.nodes.Element", "attr", new String[]{"java.lang.String", "java.lang.String"}, new String[]{"-0.0", "i"}, false, 0, new String[][]{{"org.jsoup.nodes.Element", "prependElement", "java.lang.String", "\u00e9"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput123() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Element", "org.jsoup.nodes.Element", "equals", new String[]{"java.lang.Object"}, new String[]{"<sample:1>"}, false, 1, new String[][]{{"org.jsoup.nodes.Element", "previousElementSibling", ""}, {"org.jsoup.nodes.Element", "val", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput124() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jsoup.nodes.Element", "org.jsoup.nodes.Element", "text", new String[]{}, new String[]{}, false); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput125() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Element", "org.jsoup.nodes.Element", "text", new String[]{}, new String[]{}, false, 3, new String[][]{});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("", String.valueOf(actual));
  assertEquals("receiver state after the call", "<<a><b>t</b></a> comment=\"a\">\n</<a><b>t</b></a>> {hasText=false, isBlock=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput126() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Element", "org.jsoup.nodes.Element", "prepend", new String[]{"java.lang.String"}, new String[]{"FE-"}, false, 3, new String[][]{{"org.jsoup.nodes.Element", "hasClass", "java.lang.String", "1.1234567"}, {"org.jsoup.nodes.Element", "previousSibling", ""}});
  assertNotNull(actual);
  assertEquals("org.jsoup.nodes.Element", actual.getClass().getName());
  assertEquals("<<a><b>t</b></a> comment=\"a\">\nFE-\n</<a><b>t</b></a>> {hasText=true, isBlock=false}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "<<a><b>t</b></a> comment=\"a\">\nFE-\n</<a><b>t</b></a>> {hasText=true, isBlock=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput127() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Element", "org.jsoup.nodes.Element", "prepend", new String[]{"java.lang.String"}, new String[]{"FE-1.12345678901234567"}, false, 3, new String[][]{{"org.jsoup.nodes.Element", "hasClass", "java.lang.String", "1.1234567"}, {"org.jsoup.nodes.Element", "previousSibling", ""}});
  assertNotNull(actual);
  assertEquals("org.jsoup.nodes.Element", actual.getClass().getName());
  assertEquals("<<a><b>t</b></a> comment=\"a\">\nFE-1.12345678901234567\n</<a><b>t</b></a>> {hasText=true, isBlock=false}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "<<a><b>t</b></a> comment=\"a\">\nFE-1.12345678901234567\n</<a><b>t</b></a>> {hasText=true, isBlock=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput128() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Element", "org.jsoup.nodes.Element", "prepend", new String[]{"java.lang.String"}, new String[]{"F\nE-"}, false, 3, new String[][]{{"org.jsoup.nodes.Element", "hasClass", "java.lang.String", "1.1234567"}, {"org.jsoup.nodes.Element", "previousSibling", ""}});
  assertNotNull(actual);
  assertEquals("org.jsoup.nodes.Element", actual.getClass().getName());
  assertEquals("<<a><b>t</b></a> comment=\"a\">\nF E-\n</<a><b>t</b></a>> {hasText=true, isBlock=false}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "<<a><b>t</b></a> comment=\"a\">\nF E-\n</<a><b>t</b></a>> {hasText=true, isBlock=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput129() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Element", "org.jsoup.nodes.Element", "prepend", new String[]{"java.lang.String"}, new String[]{"F"}, false, 3, new String[][]{{"org.jsoup.nodes.Element", "hasClass", "java.lang.String", "1.1234567"}});
  assertNotNull(actual);
  assertEquals("org.jsoup.nodes.Element", actual.getClass().getName());
  assertEquals("<<a><b>t</b></a> comment=\"a\">\nF\n</<a><b>t</b></a>> {hasText=true, isBlock=false}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "<<a><b>t</b></a> comment=\"a\">\nF\n</<a><b>t</b></a>> {hasText=true, isBlock=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput130() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jsoup.nodes.Element", "org.jsoup.nodes.Element", "prepend", new String[]{"java.lang.String"}, new String[]{"F"}, false, 4, new String[][]{{"org.jsoup.nodes.Element", "hasClass", "java.lang.String", "1.123567"}, {"org.jsoup.nodes.Element", "setParentNode", "org.jsoup.nodes.Node", "<null>"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput131() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jsoup.nodes.Element", "org.jsoup.nodes.Element", "prepend", new String[]{"java.lang.String"}, new String[]{"F"}, false, 3, new String[][]{{"org.jsoup.nodes.Element", "hasClass", "java.lang.String", "1.123567"}, {"org.jsoup.nodes.Element", "setParentNode", "org.jsoup.nodes.Node", "<null>"}}), new String[][]{{"className", "", "4"}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("", String.valueOf(actual));
  assertEquals("receiver state after the call", "<<a><b>t</b></a> comment=\"a\">\nF\n</<a><b>t</b></a>> {hasText=true, isBlock=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput132() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jsoup.nodes.Element", "org.jsoup.nodes.Element", "prepend", new String[]{"java.lang.String"}, new String[]{"a"}, false, 3, new String[][]{{"org.jsoup.nodes.Element", "hasClass", "java.lang.String", "1.123567"}, {"org.jsoup.nodes.Element", "setParentNode", "org.jsoup.nodes.Node", "<null>"}}), new String[][]{{"className", "", "4"}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("", String.valueOf(actual));
  assertEquals("receiver state after the call", "<<a><b>t</b></a> comment=\"a\">\na\n</<a><b>t</b></a>> {hasText=true, isBlock=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput133() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jsoup.nodes.Element", "org.jsoup.nodes.Element", "prepend", new String[]{"java.lang.String"}, new String[]{"aaaaaaaaaaaaaaaaaaaaaraaaaaaaa"}, false, 7, new String[][]{{"org.jsoup.nodes.Element", "html", "java.lang.String", "FE-"}}), new String[][]{{"className", "", "4"}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("", String.valueOf(actual));
  assertEquals("receiver state after the call", "<x \t y comment=\"a\">\naaaaaaaaaaaaaaaaaaaaaraaaaaaaaFE-\n</x \t y> {hasText=true, isBlock=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput134() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jsoup.nodes.Element", "org.jsoup.nodes.Element", "prepend", new String[]{"java.lang.String"}, new String[]{"`aaaaaaaaaaaaaaaaaaaaaaaaaaa`"}, false, 7, new String[][]{{"org.jsoup.nodes.Element", "html", "java.lang.String", "FE,"}, {"org.jsoup.nodes.Element", "appendText", "java.lang.String", "value"}}), new String[][]{{"className", "", "4"}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("", String.valueOf(actual));
  assertEquals("receiver state after the call", "<x \t y comment=\"a\">\n`aaaaaaaaaaaaaaaaaaaaaaaaaaa`FE,value\n</x \t y> {hasText=true, isBlock=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput135() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jsoup.nodes.Element", "org.jsoup.nodes.Element", "prepend", new String[]{"java.lang.String"}, new String[]{"abc1.12345678901234"}, false, 10, new String[][]{{"org.jsoup.nodes.Element", "elementSiblingIndex", ""}, {"org.jsoup.nodes.Element", "hasClass", "java.lang.String", ">a"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput136() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jsoup.nodes.Element", "org.jsoup.nodes.Element", "childNodes", new String[]{}, new String[]{}, false); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput137() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.parser.Tag", "org.jsoup.parser.Tag", "isEmpty", new String[]{}, new String[]{}, false);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "null {canContainBlock=false, getName=null, isBlock=false, isData=true, isEmpty=false, isInline=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput138() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.parser.Tag", "org.jsoup.parser.Tag", "isInline", new String[]{}, new String[]{}, false, 6, new String[][]{{"org.jsoup.parser.Tag", "canContainBlock", ""}, {"org.jsoup.parser.Tag", "getName", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
  assertEquals("receiver state after the call", "{\"a\":1} {canContainBlock=true, getName={\"a\":1}, isBlock=false, isData=false, isEmpty=false, isInline=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput139() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jsoup.parser.Parser", "org.jsoup.parser.Parser", "parse", new String[]{"java.lang.String", "java.lang.String"}, new String[]{"nll<\t", "12"}, true), new String[][]{{"append", "java.lang.String", "5"}});
  assertNotNull(actual);
  assertEquals("org.jsoup.nodes.Document", actual.getClass().getName());
  assertEquals("<html>\n<head>\n</head>\n<body>\n nll &lt;\t \n</body>\n</html>a {hasText=true, isBlock=false}", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput140() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jsoup.parser.Parser", "org.jsoup.parser.Parser", "parse", new String[]{"java.lang.String", "java.lang.String"}, new String[]{"nmm<\t<!textarea", "12/>"}, true), new String[][]{{"append", "java.lang.String", "5"}});
  assertNotNull(actual);
  assertEquals("org.jsoup.nodes.Document", actual.getClass().getName());
  assertEquals("<!textarea>\n<html>\n<head>\n</head>\n<body>\n nmm &lt;\t \n</body>\n</html>a {hasText=true, isBlock=false}", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput141() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jsoup.parser.Parser", "org.jsoup.parser.Parser", "parse", new String[]{"java.lang.String", "java.lang.String"}, new String[]{"t", "<21/>-1x.5 "}, true), new String[][]{{"hasClass", "java.lang.String", "2"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput142() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jsoup.parser.Parser", "org.jsoup.parser.Parser", "parse", new String[]{"java.lang.String", "java.lang.String"}, new String[]{"aaaaaaaaaaaaaaaaaaaaaraaaaaaaa", "<21/>-1x.5 "}, true), new String[][]{{"hasClass", "java.lang.String", "2"}, {"baseUri", "", "6"}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("<21/>-1x.5", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput143() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jsoup.parser.Parser", "org.jsoup.parser.Parser", "parse", new String[]{"java.lang.String", "java.lang.String"}, new String[]{"aaaaaaaaaaaaaaaaaaaaaraaaaaaaa", "<21/>-0x.5 "}, true), new String[][]{{"hasClass", "java.lang.String", "2"}, {"baseUri", "", "6"}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("<21/>-0x.5", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput144() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jsoup.parser.Parser", "org.jsoup.parser.Parser", "parse", new String[]{"java.lang.String", "java.lang.String"}, new String[]{"aaaaaaaaaaaaaaaaaaaaaraaaaaaaa", "<21/>-0x.5 "}, true), new String[][]{{"hasClass", "java.lang.String", "2"}, {"attr", "java.lang.String", "6"}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput145() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jsoup.parser.Parser", "org.jsoup.parser.Parser", "parse", new String[]{"java.lang.String", "java.lang.String"}, new String[]{"aaaaaaaaaaaaaaaaaaaaaraaaaaaaa", "<21/>-0x.5\037"}, true), new String[][]{{"hasClass", "java.lang.String", "2"}, {"classNames", "", "3"}});
  assertNotNull(actual);
  assertEquals("java.util.LinkedHashSet", actual.getClass().getName());
  assertEquals("[]", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput146() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.parser.Tag", "org.jsoup.parser.Tag", "preserveWhitespace", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.jsoup.parser.Tag", "isEmpty", ""}, {"org.jsoup.parser.Tag", "isEmpty", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "null {canContainBlock=false, getName=null, isBlock=false, isData=true, isEmpty=false, isInline=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput147() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jsoup.nodes.Element", "org.jsoup.nodes.Element", "removeClass", new String[]{"java.lang.String"}, new String[]{"1.5"}, false); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput148() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jsoup.parser.Parser", "org.jsoup.parser.Parser", "parse", new String[]{"java.lang.String", "java.lang.String"}, new String[]{"1234567890123456789012234567890", ""}, true), new String[][]{{"getElementsByIndexEquals", "int", "7"}});
  assertNotNull(actual);
  assertEquals("org.jsoup.select.Elements", actual.getClass().getName());
  assertEquals("[]", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput149() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jsoup.parser.Parser", "org.jsoup.parser.Parser", "parse", new String[]{"java.lang.String", "java.lang.String"}, new String[]{"abc2.1234567890124", "!"}, true), new String[][]{{"getElementById", "java.lang.String", "7"}});
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput150() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.parser.Parser", "org.jsoup.parser.Parser", "parseBodyFragment", new String[]{"java.lang.String", "java.lang.String"}, new String[]{"--1", " "}, true);
  assertNotNull(actual);
  assertEquals("org.jsoup.nodes.Document", actual.getClass().getName());
  assertEquals("<html>\n<head>\n</head>\n<body>\n --1\n</body>\n</html> {hasText=true, isBlock=false}", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput151() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jsoup.nodes.Element", "org.jsoup.nodes.Element", "classNames", new String[]{"java.util.Set"}, new String[]{"<sample:3>"}, false, 0, new String[][]{{"org.jsoup.nodes.Element", "val", "java.lang.String", "1.12345678a"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput152() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jsoup.parser.Parser", "org.jsoup.parser.Parser", "parseBodyFragment", new String[]{"java.lang.String", "java.lang.String"}, new String[]{"-.5", "1.02344678901234567"}, true), new String[][]{{"append", "java.lang.String", "5"}, {"addClass", "java.lang.String", "0"}});
  assertNotNull(actual);
  assertEquals("org.jsoup.nodes.Document", actual.getClass().getName());
  assertEquals("<html>\n<head>\n</head>\n<body>\n -.5\n</body>\n</html>a {hasText=true, isBlock=false}", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput153() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jsoup.nodes.Element", "org.jsoup.nodes.Element", "getElementsByAttributeValueNot", new String[]{"java.lang.String", "java.lang.String"}, new String[]{"\n", "-0.0"}, false, 0, new String[][]{{"org.jsoup.nodes.Element", "attr", "java.lang.String,java.lang.String", "a b", "/a/b"}, {"org.jsoup.nodes.Element", "val", "java.lang.String", "1.12345678"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput154() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jsoup.nodes.Element", "org.jsoup.nodes.Element", "replaceChild", new String[]{"org.jsoup.nodes.Node", "org.jsoup.nodes.Node"}, new String[]{"<null>", "<sample:1>"}, false, 3, new String[][]{{"org.jsoup.nodes.Element", "attr", "java.lang.String", "&lt;"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput155() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jsoup.nodes.Element", "org.jsoup.nodes.Element", "replaceChild", new String[]{"org.jsoup.nodes.Node", "org.jsoup.nodes.Node"}, new String[]{"<sample:3>", "<sample:5>"}, false); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput156() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.parser.Tag", "org.jsoup.parser.Tag", "isInline", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.jsoup.parser.Tag", "preserveWhitespace", ""}, {"org.jsoup.parser.Tag", "isValidAncestor", "org.jsoup.parser.Tag", "<sample:5>"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
  assertEquals("receiver state after the call", "null {canContainBlock=false, getName=null, isBlock=false, isData=true, isEmpty=false, isInline=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput157() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jsoup.parser.Parser", "org.jsoup.parser.Parser", "parseBodyFragment", new String[]{"java.lang.String", "java.lang.String"}, new String[]{"it8/0P66..;<?", ".0E-5"}, true), new String[][]{{"prependChild", "org.jsoup.nodes.Node", "5"}, {"addClass", "java.lang.String", "0"}, {"hasAttr", "java.lang.String", "0"}, {"append", "java.lang.String", "4"}});
  assertNotNull(actual);
  assertEquals("org.jsoup.nodes.Document", actual.getClass().getName());
  assertEquals("<!a>\n<html>\n<head>\n</head>\n<body>\n it8/0P66..;<?>\n</body>\n</html> {hasText=true, isBlock=false}", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput158() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jsoup.parser.Parser", "org.jsoup.parser.Parser", "parseBodyFragment", new String[]{"java.lang.String", "java.lang.String"}, new String[]{"it8/0P66..;<?", ".0E-5"}, true), new String[][]{{"prependChild", "org.jsoup.nodes.Node", "5"}, {"addClass", "java.lang.String", "0"}, {"hasAttr", "java.lang.String", "0"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput159() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jsoup.nodes.Element", "org.jsoup.nodes.Element", "prependElement", new String[]{"java.lang.String"}, new String[]{"1.12345678"}, false); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput160() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jsoup.parser.Parser", "org.jsoup.parser.Parser", "parseBodyFragment", new String[]{"java.lang.String", "java.lang.String"}, new String[]{"Ljs900P-n66,E;<o?:vaue>", "={{"}, true), new String[][]{{"prependChild", "org.jsoup.nodes.Node", "1"}, {"addClass", "java.lang.String", "0"}});
  assertNotNull(actual);
  assertEquals("org.jsoup.nodes.Document", actual.getClass().getName());
  assertEquals("a\n<html>\n<head>\n</head>\n<body>\n Ljs900P-n66,E;<o :vaue=\"\">\n </o>\n</body>\n</html> {hasText=true, isBlock=false}", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput161() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jsoup.parser.Parser", "org.jsoup.parser.Parser", "parseBodyFragment", new String[]{"java.lang.String", "java.lang.String"}, new String[]{"Ljs900P-n66,E;<o?:vaue><![CDATA[", "={{"}, true), new String[][]{{"prependChild", "org.jsoup.nodes.Node", "1"}, {"addClass", "java.lang.String", "0"}});
  assertNotNull(actual);
  assertEquals("org.jsoup.nodes.Document", actual.getClass().getName());
  assertEquals("a\n<html>\n<head>\n</head>\n<body>\n Ljs900P-n66,E;<o :vaue=\"\">\n </o>\n</body>\n</html> {hasText=true, isBlock=false}", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput162() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.parser.Parser", "org.jsoup.parser.Parser", "parseBodyFragmentRelaxed", new String[]{"java.lang.String", "java.lang.String"}, new String[]{".5", "1e10"}, true);
  assertNotNull(actual);
  assertEquals("org.jsoup.nodes.Document", actual.getClass().getName());
  assertEquals("<html>\n<head>\n</head>\n<body>\n .5\n</body>\n</html> {hasText=true, isBlock=false}", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput163() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jsoup.parser.Parser", "org.jsoup.parser.Parser", "parseBodyFragment", new String[]{"java.lang.String", "java.lang.String"}, new String[]{"js900P-n66,E;<o?:vaaue><![CDATA[0x1F2147483648", "1}1.5f"}, true), new String[][]{{"prependChild", "org.jsoup.nodes.Node", "1"}, {"addClass", "java.lang.String", "0"}, {"previousSibling", "", "5"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput164() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.parser.Tag", "org.jsoup.parser.Tag", "toString", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.jsoup.parser.Tag", "canContainBlock", ""}});
  assertNull(actual);
  assertEquals("receiver state after the call", "null {canContainBlock=false, getName=null, isBlock=false, isData=true, isEmpty=false, isInline=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput165() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jsoup.nodes.Element", "org.jsoup.nodes.Element", "getElementsByIndexLessThan", new String[]{"int"}, new String[]{"1"}, false, 0, new String[][]{{"org.jsoup.nodes.Element", "getElementsByAttributeValueEnding", "java.lang.String,java.lang.String", "#a\":1}\\s+5+1<!", "{\"a\":1}"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput166() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jsoup.parser.Tag", "org.jsoup.parser.Tag", "getImplicitParent", new String[]{}, new String[]{}, false); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput167() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jsoup.nodes.Element", "org.jsoup.nodes.Element", "outerHtml", new String[]{"java.lang.StringBuilder"}, new String[]{"<sample:3>"}, false); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput168() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Element", "org.jsoup.nodes.Element", "nodeDepth", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.jsoup.nodes.Element", "html", "java.lang.String", "&lt;"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput169() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jsoup.nodes.Element", "org.jsoup.nodes.Element", "siblingElements", new String[]{}, new String[]{}, false); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput170() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jsoup.nodes.Element", "org.jsoup.nodes.Element", "isBlock", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.jsoup.nodes.Element", "removeClass", "java.lang.String", "Hello, World"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput171() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jsoup.nodes.Element", "org.jsoup.nodes.Element", "nodeName", new String[]{}, new String[]{}, false); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput172() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jsoup.parser.Parser", "org.jsoup.parser.Parser", "parseBodyFragment", new String[]{"java.lang.String", "java.lang.String"}, new String[]{"+!\r%t9990uP-556D::<o0?223445I890123456889.12345678:0Title", "\\ns,"}, true), new String[][]{{"getElementsByIndexEquals", "int", "1"}, {"hasClass", "java.lang.String", "5"}, {"text", "", "3"}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput173() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jsoup.nodes.Element", "org.jsoup.nodes.Element", "getElementsByAttributeValueContaining", new String[]{"java.lang.String", "java.lang.String"}, new String[]{"0x123456789", "FE,#root"}, false, 0, new String[][]{{"org.jsoup.nodes.Element", "absUrl", "java.lang.String", "FE,#root"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput174() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jsoup.nodes.Element", "org.jsoup.nodes.Element", "firstElementSibling", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.jsoup.nodes.Element", "text", "java.lang.String", "<"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput175() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jsoup.parser.Parser", "org.jsoup.parser.Parser", "parseBodyFragment", new String[]{"java.lang.String", "java.lang.String"}, new String[]{"+!\rt99906uP-556D::<o0?223445IB90123456889.12345678:0Title0x1F", "nt,"}, true), new String[][]{{"getElementsByIndexEquals", "int", "1"}, {"removeClass", "java.lang.String", "5"}});
  assertNotNull(actual);
  assertEquals("org.jsoup.select.Elements", actual.getClass().getName());
  assertEquals("[]", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput176() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.parser.Tag", "org.jsoup.parser.Tag", "canContainBlock", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.jsoup.parser.Tag", "isData", ""}, {"org.jsoup.parser.Tag", "isInline", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "null {canContainBlock=false, getName=null, isBlock=false, isData=true, isEmpty=false, isInline=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput177() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jsoup.parser.Parser", "org.jsoup.parser.Parser", "parseBodyFragment", new String[]{"java.lang.String", "java.lang.String"}, new String[]{"+!\rt99906uP-556D::<o0?223445IB9012345689.12345678:0Tiule4+0x1F", "id"}, true), new String[][]{{"getElementsByIndexEquals", "int", "1"}, {"removeClass", "java.lang.String", "5"}, {"listIterator", "", "1"}});
  assertNotNull(actual);
  assertEquals("java.util.ArrayList$ListItr", actual.getClass().getName());
  assertEquals("{hasNext=false, hasPrevious=false}", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput178() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jsoup.nodes.Element", "org.jsoup.nodes.Element", "getElementsByAttributeValueEnding", new String[]{"java.lang.String", "java.lang.String"}, new String[]{"null", "<!"}, false); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput179() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Element", "org.jsoup.nodes.Element", "attributes", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.jsoup.nodes.Element", "getElementsByAttribute", "java.lang.String", "FE,#root"}, {"org.jsoup.nodes.Element", "getElementsByAttributeValue", "java.lang.String,java.lang.String", "0", "xkX61\r1.5"}});
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput180() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Element", "org.jsoup.nodes.Element", "val", new String[]{}, new String[]{}, false, 7, new String[][]{{"org.jsoup.nodes.Element", "hasAttr", "java.lang.String", "&}t;1.5fn"}, {"org.jsoup.nodes.Element", "getElementsByAttributeValueNot", "java.lang.String,java.lang.String", "1.12345678a", "010"}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("", String.valueOf(actual));
  assertEquals("receiver state after the call", "<x \t y comment=\"a\">\n</x \t y> {hasText=false, isBlock=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput181() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jsoup.parser.Parser", "org.jsoup.parser.Parser", "parseBodyFragment", new String[]{"java.lang.String", "java.lang.String"}, new String[]{"*!\r:t99:93?00&4.556D:+<n0?223H404?B90122345798n0245689:07iulf4+/xF1e10Iid123456a", "Ljs900P-n66,E;<o?:vaue>=![CDATA[textarea"}, true), new String[][]{{"addClass", "java.lang.String", "1"}, {"child", "int", "0"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IndexOutOfBoundsException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput182() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.parser.Tag", "org.jsoup.parser.Tag", "hashCode", new String[]{}, new String[]{}, false);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "null {canContainBlock=false, getName=null, isBlock=false, isData=true, isEmpty=false, isInline=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput183() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.parser.Tag", "org.jsoup.parser.Tag", "equals", new String[]{"java.lang.Object"}, new String[]{"<sample:1>"}, false);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "null {canContainBlock=false, getName=null, isBlock=false, isData=true, isEmpty=false, isInline=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput184() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jsoup.nodes.Element", "org.jsoup.nodes.Element", "toString", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.jsoup.nodes.Element", "childNodes", ""}, {"org.jsoup.nodes.Element", "getElementsByAttributeValueContaining", "java.lang.String,java.lang.String", "1e10", "PT1H"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput185() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jsoup.nodes.Element", "org.jsoup.nodes.Element", "wrap", new String[]{"java.lang.String"}, new String[]{"&lt;"}, false); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput186() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jsoup.nodes.Element", "org.jsoup.nodes.Element", "child", new String[]{"int"}, new String[]{"10"}, false); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput187() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jsoup.nodes.Element", "org.jsoup.nodes.Element", "previousSibling", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.jsoup.nodes.Element", "absUrl", "java.lang.String", "<?"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput188() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jsoup.parser.Parser", "org.jsoup.parser.Parser", "parseBodyFragment", new String[]{"java.lang.String", "java.lang.String"}, new String[]{"+E\"\r:t819>0}-5;;4D:91e+><o", "1-11X234;56781.5g1E-5"}, true), new String[][]{{"addClass", "java.lang.String", "6"}, {"head", "", "0"}, {"firstElementSibling", "", "7"}, {"getElementsByAttribute", "java.lang.String", "6"}});
  assertNotNull(actual);
  assertEquals("org.jsoup.select.Elements", actual.getClass().getName());
  assertEquals("[]", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput189() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jsoup.nodes.Element", "org.jsoup.nodes.Element", "getElementsByIndexGreaterThan", new String[]{"int"}, new String[]{"10"}, false, 1, new String[][]{{"org.jsoup.nodes.Element", "getElementsByAttributeValue", "java.lang.String,java.lang.String", "", "<!"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput190() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jsoup.nodes.Element", "org.jsoup.nodes.Element", "getElementsByIndexEquals", new String[]{"int"}, new String[]{"-2147483648"}, false); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput191() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jsoup.nodes.Element", "org.jsoup.nodes.Element", "html", new String[]{"java.lang.String"}, new String[]{"1L"}, false, 2, new String[][]{{"org.jsoup.nodes.Element", "previousElementSibling", ""}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput192() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Element", "org.jsoup.nodes.Element", "indent", new String[]{"java.lang.StringBuilder"}, new String[]{"<sample:0>"}, false);
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput193() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jsoup.nodes.Element", "org.jsoup.nodes.Element", "append", new String[]{"java.lang.String"}, new String[]{"={{"}, false, 0, new String[][]{{"org.jsoup.nodes.Element", "absUrl", "java.lang.String", "[1,2]"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput194() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jsoup.nodes.Element", "org.jsoup.nodes.Element", "replaceWith", new String[]{"org.jsoup.nodes.Node"}, new String[]{"<null>"}, false, 0, new String[][]{{"org.jsoup.nodes.Element", "nextSibling", ""}, {"org.jsoup.nodes.Element", "previousElementSibling", ""}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput195() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jsoup.nodes.Element", "org.jsoup.nodes.Element", "absUrl", new String[]{"java.lang.String"}, new String[]{"1.5"}, false); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput196() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jsoup.nodes.Element", "org.jsoup.nodes.Element", "siblingNodes", new String[]{}, new String[]{}, false); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput197() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jsoup.nodes.Element", "org.jsoup.nodes.Element", "text", new String[]{"java.lang.String"}, new String[]{"#a\":1}\\s+5+1<!"}, false, 0, new String[][]{{"org.jsoup.nodes.Element", "firstElementSibling", ""}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput198() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jsoup.nodes.Element", "org.jsoup.nodes.Element", "data", new String[]{}, new String[]{}, false); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput199() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jsoup.nodes.Element", "org.jsoup.nodes.Element", "html", new String[]{}, new String[]{}, false); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput200() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jsoup.nodes.Element", "org.jsoup.nodes.Element", "prependText", new String[]{"java.lang.String"}, new String[]{"1.12346678aa123456789012345678901234567890"}, false); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput201() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jsoup.nodes.Element", "org.jsoup.nodes.Element", "addChild", new String[]{"org.jsoup.nodes.Node"}, new String[]{"<sample:0>"}, false); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput202() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jsoup.nodes.Element", "org.jsoup.nodes.Element", "indexInList", new String[]{"org.jsoup.nodes.Node", "java.util.List"}, new String[]{"<sample:3>", "<sample:3>"}, true); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.ClassCastException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput203() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jsoup.nodes.Element", "org.jsoup.nodes.Element", "id", new String[]{}, new String[]{}, false); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput204() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jsoup.nodes.Element", "org.jsoup.nodes.Element", "getElementById", new String[]{"java.lang.String"}, new String[]{"0x1F"}, false, 1, new String[][]{{"org.jsoup.nodes.Element", "childNodes", ""}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput205() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jsoup.nodes.Element", "org.jsoup.nodes.Element", "absUrl", new String[]{"java.lang.String"}, new String[]{"1L"}, false, 4, new String[][]{{"org.jsoup.nodes.Element", "getElementsByClass", "java.lang.String", "abc1.12345678901234"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput206() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jsoup.nodes.Element", "org.jsoup.nodes.Element", "select", new String[]{"java.lang.String"}, new String[]{"1.1234567"}, false, 6, new String[][]{{"org.jsoup.nodes.Element", "getElementsByTag", "java.lang.String", "&lt;1.5f"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput207() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jsoup.nodes.Element", "org.jsoup.nodes.Element", "hasText", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.jsoup.nodes.Element", "childNode", "int", "-2147483648"}, {"org.jsoup.nodes.Element", "html", "java.lang.String", "[1,2]"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput208() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jsoup.parser.Parser", "org.jsoup.parser.Parser", "parse", new String[]{"java.lang.String", "java.lang.String"}, new String[]{"+!\rt9:9?06P-556D:+<o0?223sH445IB9012345689.02345689:07iulf4+0x1F", "\013-1u1e10"}, true, 0, null, 2), new String[][]{{"body", "", "2"}});
  assertNotNull(actual);
  assertEquals("org.jsoup.nodes.Element", actual.getClass().getName());
  assertEquals("\n<body>\n +! t9:9?06P-556D:+ <o0 223sh445ib9012345689=\"\" 02345689:07iulf4=\"\" 0x1f=\"\">\n </o0>\n</body> {hasText=true, isBlock=true}", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput209() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jsoup.nodes.Element", "org.jsoup.nodes.Element", "attr", new String[]{"java.lang.String"}, new String[]{"<!--"}, false, 0, new String[][]{{"org.jsoup.nodes.Element", "removeChild", "org.jsoup.nodes.Node", "<sample:7>"}, {"org.jsoup.nodes.Element", "baseUri", ""}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput210() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jsoup.nodes.Element", "org.jsoup.nodes.Element", "appendChild", new String[]{"org.jsoup.nodes.Node"}, new String[]{"<sample:0>"}, false, 0, new String[][]{{"org.jsoup.nodes.Element", "hasAttr", "java.lang.String", "1.5e300"}, {"org.jsoup.nodes.Element", "siblingNodes", ""}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput211() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jsoup.nodes.Element", "org.jsoup.nodes.Element", "nextElementSibling", new String[]{}, new String[]{}, false); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput212() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jsoup.nodes.Element", "org.jsoup.nodes.Element", "getElementsByAttributeValueStarting", new String[]{"java.lang.String", "java.lang.String"}, new String[]{"http://example.com/a?b=c", "1.13445687n123456TITLETITLE"}, false); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput213() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jsoup.parser.Parser", "org.jsoup.parser.Parser", "parse", new String[]{"java.lang.String", "java.lang.String"}, new String[]{",&'t999050i-7f6E:5:<p?:vaaHue><>", "20\r3-1,30259b_19s1-T5<5."}, true, 0, null, 3), new String[][]{{"baseUri", "", "3"}, {"getElementsByIndexGreaterThan", "int", "0"}});
  assertNotNull(actual);
  assertEquals("org.jsoup.select.Elements", actual.getClass().getName());
  assertEquals("[<html>\n<head>\n</head>\n<body>\n ,&amp;'t999050i-7f6E:5: \n <p :vaahue=\"\">&lt;&gt;</p>\n</body>\n</html>, \n<html>\n<head>\n</head>\n<body>\n ,&amp;'t999050i-7f6E:5: \n <p :vaahue=\"\">&lt;&gt;</p>\n</body>\n</html>...#319#329529839", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput214() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jsoup.parser.Parser", "org.jsoup.parser.Parser", "parse", new String[]{"java.lang.String", "java.lang.String"}, new String[]{",'s99+050i.6bE:5:<p1?:v_; a?ue><<><!--1.1134567890", "#a\":1|\\s+5+1<!"}, true, 0, null, 2), new String[][]{{"baseUri", "", "3"}, {"getElementsByIndexGreaterThan", "int", "0"}});
  assertNotNull(actual);
  assertEquals("org.jsoup.select.Elements", actual.getClass().getName());
  assertEquals("[<html>\n<head>\n</head>\n<body>\n ,'s99+050i.6bE:5: <p1 :v_=\"\" a=\"\" ue=\"\">\n  &lt;&lt;&gt;\n  <!--1.1134567890-->\n </p1>\n</body>\n</html>, \n<html>\n<head>\n</head>\n<body>\n ,'s99+050i.6bE:5: <p1 :v_=\"\" a=\"\" ue...#453#-811799525", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput215() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jsoup.parser.Parser", "org.jsoup.parser.Parser", "parse", new String[]{"java.lang.String", "java.lang.String"}, new String[]{",'99+050i.6bE:5:<p1?:v_; a?ue><<><!--1.1134567890--1<", "b,b,c"}, true, 0, null, 2), new String[][]{{"baseUri", "", "3"}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("b,b,c", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput216() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jsoup.nodes.Element", "org.jsoup.nodes.Element", "toString", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.jsoup.nodes.Element", "html", "java.lang.String", ".5"}}, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput217() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jsoup.parser.Parser", "org.jsoup.parser.Parser", "parse", new String[]{"java.lang.String", "java.lang.String"}, new String[]{"-'89+150j.6bE:5:<p1?:v_;xa?ue><<><n.-1.11245678<90--x<", "\tTitle"}, true), new String[][]{{"baseUri", "", "3"}, {"getElementsByIndexGreaterThan", "int", "0"}, {"subList", "int,int", "1"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IndexOutOfBoundsException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput218() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jsoup.parser.Parser", "org.jsoup.parser.Parser", "parse", new String[]{"java.lang.String", "java.lang.String"}, new String[]{"-88+150j.6bdbE:5:<p1?:u_;xaa?e><><n.-1.1124678#<90-x.1234B67890123456<?!<?<1.123", "22L"}, true, 0, null, 1), new String[][]{{"baseUri", "", "3"}, {"removeClass", "java.lang.String", "0"}, {"head", "", "1"}, {"append", "java.lang.String", "1"}});
  assertNotNull(actual);
  assertEquals("org.jsoup.nodes.Element", actual.getClass().getName());
  assertEquals("\n<head>\n a\n</head> {hasText=true, isBlock=true}", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput219() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jsoup.parser.Parser", "org.jsoup.parser.Parser", "parse", new String[]{"java.lang.String", "java.lang.String"}, new String[]{"<21/>-0x.5\037", "03L"}, true), new String[][]{{"baseUri", "", "3"}, {"removeClass", "java.lang.String", "0"}, {"head", "", "1"}, {"append", "java.lang.String", "1"}});
  assertNotNull(actual);
  assertEquals("org.jsoup.nodes.Element", actual.getClass().getName());
  assertEquals("\n<head>\n a\n</head> {hasText=true, isBlock=true}", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput220() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jsoup.nodes.Element", "org.jsoup.nodes.Element", "childNode", new String[]{"int"}, new String[]{"0"}, false, 0, new String[][]{{"org.jsoup.nodes.Element", "siblingElements", ""}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput221() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jsoup.parser.Parser", "org.jsoup.parser.Parser", "parse", new String[]{"java.lang.String", "java.lang.String"}, new String[]{"+!\t\rt9:9?06P-556D:+<o0?223H44#IB901245689.03345689077iulf4+0x1FHello, World", "1.1234567890723456-"}, true, 0, null, 1), new String[][]{{"baseUri", "", "3"}, {"removeClass", "java.lang.String", "0"}, {"head", "", "1"}});
  assertNotNull(actual);
  assertEquals("org.jsoup.nodes.Element", actual.getClass().getName());
  assertEquals("\n<head>\n</head> {hasText=false, isBlock=true}", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput222() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Element", "org.jsoup.nodes.Element", "parents", new String[]{}, new String[]{}, false, 0, null, 2);
  assertNotNull(actual);
  assertEquals("org.jsoup.select.Elements", actual.getClass().getName());
  assertEquals("[]", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput223() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Element", "org.jsoup.nodes.Element", "baseUri", new String[]{}, new String[]{}, false, 1, new String[][]{{"org.jsoup.nodes.Element", "setBaseUri", "java.lang.String", "-1e/./2345678901245"}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("-1e/./2345678901245", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput224() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jsoup.nodes.Element", "org.jsoup.nodes.Element", "classNames", new String[]{}, new String[]{}, false, 4, new String[][]{{"org.jsoup.nodes.Element", "wrap", "java.lang.String", "true"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput225() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jsoup.parser.Parser", "org.jsoup.parser.Parser", "parse", new String[]{"java.lang.String", "java.lang.String"}, new String[]{"!\tt99]@?06P-5/6D:9+<nn0=3\0133H44#IB9012455}9.03345689077il\"-0.0", "1.5d1.1234567"}, true, 0, null, 3), new String[][]{{"baseUri", "", "3"}, {"getElementsByIndexLessThan", "int", "4"}, {"subList", "int,int", "1"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IndexOutOfBoundsException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput226() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.parser.Tag", "org.jsoup.parser.Tag", "requiresSpecificParent", new String[]{}, new String[]{}, false);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "null {canContainBlock=false, getName=null, isBlock=false, isData=true, isEmpty=false, isInline=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput227() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jsoup.nodes.Element", "org.jsoup.nodes.Element", "nextSibling", new String[]{}, new String[]{}, false); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput228() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jsoup.nodes.Element", "org.jsoup.nodes.Element", "children", new String[]{}, new String[]{}, false); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput229() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jsoup.nodes.Element", "org.jsoup.nodes.Element", "replaceChild", new String[]{"org.jsoup.nodes.Node", "org.jsoup.nodes.Node"}, new String[]{"<sample:0>", "<sample:2>"}, false, 0, null, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput230() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jsoup.parser.Parser", "org.jsoup.parser.Parser", "parse", new String[]{"java.lang.String", "java.lang.String"}, new String[]{"!\010s799\u00e9+6PP-4K7D::<mn?=3\013c>244#0xI2345:79NT1H214748264!2147483648", "A"}, true, 0, null, 3), new String[][]{{"getElementsByClass", "java.lang.String", "7"}});
  assertNotNull(actual);
  assertEquals("org.jsoup.select.Elements", actual.getClass().getName());
  assertEquals("[]", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput231() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jsoup.nodes.Element", "org.jsoup.nodes.Element", "previousElementSibling", new String[]{}, new String[]{}, false); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput232() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jsoup.nodes.Element", "org.jsoup.nodes.Element", "outerHtml", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.jsoup.nodes.Element", "classNames", ""}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput233() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jsoup.nodes.Element", "org.jsoup.nodes.Element", "val", new String[]{"java.lang.String"}, new String[]{"->"}, false); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput234() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Element", "org.jsoup.nodes.Element", "getElementsByClass", new String[]{"java.lang.String"}, new String[]{"nll<\t"}, false, 5, new String[][]{{"org.jsoup.nodes.Element", "attributes", ""}});
  assertNotNull(actual);
  assertEquals("org.jsoup.select.Elements", actual.getClass().getName());
  assertEquals("[]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "<{\"a\":1} comment=\"a\">\n</{\"a\":1}> {hasText=false, isBlock=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput235() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Element", "org.jsoup.nodes.Element", "setBaseUri", new String[]{"java.lang.String"}, new String[]{"1E-5"}, false);
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput236() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jsoup.parser.Parser", "org.jsoup.parser.Parser", "parse", new String[]{"java.lang.String", "java.lang.String"}, new String[]{"\010Pt798\u00e9;+71P-47H;ID:::\n8<mn?\\3\n=24L-_025e200a,b,<a5.1.5dlitle5.0x123456789#root", "&\"[aa,,c,c21448364W1H.5b.5"}, true, 0, null, 2), new String[][]{{"getElementsByIndexLessThan", "int", "4"}});
  assertNotNull(actual);
  assertEquals("org.jsoup.select.Elements", actual.getClass().getName());
  assertEquals("[<html>\n<head>\n</head>\n<body>\n \010Pt798&eacute;;+71P-47H;ID::: 8 <mn 3=\"24L-_025e200a,b,\">\n  <a5 1=\"\" 5dlitle5=\"\" 0x123456789=\"\" root=\"\">\n  </a5>\n </mn>\n</body>\n</html>, \n<html>\n<head>\n</head>\n<body>\n \010...#636#-1812060609", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput237() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jsoup.nodes.Element", "org.jsoup.nodes.Element", "removeChild", new String[]{"org.jsoup.nodes.Node"}, new String[]{"<sample:6>"}, false); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput238() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jsoup.nodes.Element", "org.jsoup.nodes.Element", "outerHtml", new String[]{}, new String[]{}, false, 0, null, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput239() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.parser.Parser", "org.jsoup.parser.Parser", "parse", new String[]{"java.lang.String", "java.lang.String"}, new String[]{"\010P7998;+728-57<;ID:::\n88<mnn?\\3\nX=24L-_025e200a,b-n<a5.1.5dlitle5.0x123456789#ro", "0x1234"}, true, 0, null, 1);
  assertNotNull(actual);
  assertEquals("org.jsoup.nodes.Document", actual.getClass().getName());
  assertEquals("<html>\n<head>\n</head>\n<body>\n \010P7998;+728-57 &lt;;ID::: 88 <mnn 3=\"\" x=\"24L-_025e200a,b-n\">\n  <a5 1=\"\" 5dlitle5=\"\" 0x123456789=\"\" ro=\"\">\n  </a5>\n </mnn>\n</body>\n</html> {hasText=true, isBlock=false}", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput240() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.parser.Parser", "org.jsoup.parser.Parser", "parseBodyFragmentRelaxed", new String[]{"java.lang.String", "java.lang.String"}, new String[]{"-", "1L"}, true, 0, null, 2);
  assertNotNull(actual);
  assertEquals("org.jsoup.nodes.Document", actual.getClass().getName());
  assertEquals("<html>\n<head>\n</head>\n<body>\n -\n</body>\n</html> {hasText=true, isBlock=false}", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput241() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jsoup.parser.Parser", "org.jsoup.parser.Parser", "parse", new String[]{"java.lang.String", "java.lang.String"}, new String[]{"\010P7998;+728-57<;ID:::\n88<mnn?\\3\nX=24L-_025e200a,b-n<a5.1.5dlitl!5.0x123456789#ro", "09123,r41.1234567890123456.5"}, true, 0, null, 1), new String[][]{{"hasText", "", "4"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput242() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jsoup.parser.Parser", "org.jsoup.parser.Parser", "parse", new String[]{"java.lang.String", "java.lang.String"}, new String[]{"\010P7998;+728-57<;ID:::\n88<mnn?\\3\nX=24L-_025e200a,b-n<a5.1", "09123,r41.1234567890123456.51.5d"}, true, 0, null, 1), new String[][]{{"elementSiblingIndex", "", "3"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput243() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.parser.Tag", "org.jsoup.parser.Tag", "isValidParent", new String[]{"org.jsoup.parser.Tag"}, new String[]{"<sample:1>"}, false);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "null {canContainBlock=false, getName=null, isBlock=false, isData=true, isEmpty=false, isInline=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput244() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jsoup.nodes.Element", "org.jsoup.nodes.Element", "getAllElements", new String[]{}, new String[]{}, false); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput245() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jsoup.nodes.Element", "org.jsoup.nodes.Element", "empty", new String[]{}, new String[]{}, false, 1, new String[][]{{"org.jsoup.nodes.Element", "preserveWhitespace", ""}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput246() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Element", "org.jsoup.nodes.Element", "hashCode", new String[]{}, new String[]{}, false, 1, new String[][]{{"org.jsoup.nodes.Element", "addChild", "org.jsoup.nodes.Node", "<sample:5>"}, {"org.jsoup.nodes.Element", "getElementsByIndexGreaterThan", "int", "1"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput247() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jsoup.nodes.Element", "org.jsoup.nodes.Element", "getElementsByTag", new String[]{"java.lang.String"}, new String[]{"->"}, false, 0, new String[][]{{"org.jsoup.nodes.Element", "equals", "java.lang.Object", "<i:0>"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput248() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Element", "org.jsoup.nodes.Element", "parent", new String[]{}, new String[]{}, false, 1, new String[][]{{"org.jsoup.nodes.Element", "setBaseUri", "java.lang.String", "1.1234567"}, {"org.jsoup.nodes.Element", "getElementsByAttributeValueStarting", "java.lang.String,java.lang.String", "<?", "1E-5"}});
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput249() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jsoup.nodes.Element", "org.jsoup.nodes.Element", "addClass", new String[]{"java.lang.String"}, new String[]{"aaaaaaaaaaaaaaaaaaaaaaaaaaaaaa"}, false); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput250() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jsoup.nodes.Element", "org.jsoup.nodes.Element", "siblingIndex", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.jsoup.nodes.Element", "siblingNodes", ""}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput251() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jsoup.nodes.Element", "org.jsoup.nodes.Element", "hasText", new String[]{}, new String[]{}, false, 0, null, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput252() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jsoup.nodes.Element", "org.jsoup.nodes.Element", "className", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.jsoup.nodes.Element", "wrap", "java.lang.String", "1L"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput253() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jsoup.parser.Tag", "org.jsoup.parser.Tag", "isValidAncestor", new String[]{"org.jsoup.parser.Tag"}, new String[]{"<null>"}, false); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput254() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Element", "org.jsoup.nodes.Element", "absUrl", new String[]{"java.lang.String"}, new String[]{"0x123456789"}, false, 7, new String[][]{{"org.jsoup.nodes.Element", "setParentNode", "org.jsoup.nodes.Node", "<sample:1>"}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput255() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.parser.Tag", "org.jsoup.parser.Tag", "getName", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.jsoup.parser.Tag", "hashCode", ""}});
  assertNull(actual);
  assertEquals("receiver state after the call", "null {canContainBlock=false, getName=null, isBlock=false, isData=true, isEmpty=false, isInline=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput256() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jsoup.nodes.Element", "org.jsoup.nodes.Element", "prependChild", new String[]{"org.jsoup.nodes.Node"}, new String[]{"<sample:3>"}, false); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput257() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Element", "org.jsoup.nodes.Element", "tag", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.jsoup.nodes.Element", "hasText", ""}});
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput258() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jsoup.nodes.Element", "org.jsoup.nodes.Element", "getElementsByIndexEquals", new String[]{"int"}, new String[]{"2147483647"}, false, 0, null, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput259() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jsoup.nodes.Element", "org.jsoup.nodes.Element", "hasClass", new String[]{"java.lang.String"}, new String[]{"0"}, false, 0, null, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput260() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jsoup.nodes.Element", "org.jsoup.nodes.Element", "data", new String[]{}, new String[]{}, false, 0, null, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput261() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Element", "org.jsoup.nodes.Element", "setParentNode", new String[]{"org.jsoup.nodes.Node"}, new String[]{"<sample:5>"}, false, 0, new String[][]{{"org.jsoup.nodes.Element", "getElementsByAttributeValueStarting", "java.lang.String,java.lang.String", "-1", "2147483648"}});
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput262() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jsoup.nodes.Element", "org.jsoup.nodes.Element", "toggleClass", new String[]{"java.lang.String"}, new String[]{"1.123466787aa12345678901234567890123456789abc"}, false, 0, new String[][]{{"org.jsoup.nodes.Element", "setBaseUri", "java.lang.String", "11.5f"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput263() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jsoup.nodes.Element", "org.jsoup.nodes.Element", "nextSibling", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.jsoup.nodes.Element", "getElementsByClass", "java.lang.String", "1.4"}}, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput264() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.parser.Tag", "org.jsoup.parser.Tag", "valueOf", new String[]{"java.lang.String"}, new String[]{"true"}, true);
  assertNotNull(actual);
  assertEquals("org.jsoup.parser.Tag", actual.getClass().getName());
  assertEquals("true {canContainBlock=true, getName=true, isBlock=false, isData=false, isEmpty=false, isInline=true}", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput265() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jsoup.nodes.Element", "org.jsoup.nodes.Element", "childNode", new String[]{"int"}, new String[]{"10"}, false, 0, new String[][]{{"org.jsoup.nodes.Element", "empty", ""}}, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput266() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jsoup.nodes.Element", "org.jsoup.nodes.Element", "childNode", new String[]{"int"}, new String[]{"1"}, false, 3, new String[][]{{"org.jsoup.nodes.Element", "removeChild", "org.jsoup.nodes.Node", "<sample:7>"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IndexOutOfBoundsException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput267() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.parser.Tag", "org.jsoup.parser.Tag", "isBlock", new String[]{}, new String[]{}, false);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "null {canContainBlock=false, getName=null, isBlock=false, isData=true, isEmpty=false, isInline=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput268() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jsoup.nodes.Element", "org.jsoup.nodes.Element", "preserveWhitespace", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.jsoup.nodes.Element", "getElementsByAttributeValueNot", "java.lang.String,java.lang.String", "<a>b</a>", "FE,"}}, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput269() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jsoup.nodes.Element", "org.jsoup.nodes.Element", "getElementsByAttributeValue", new String[]{"java.lang.String", "java.lang.String"}, new String[]{"<21/>-0x.5\037", "03L"}, false); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput270() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jsoup.nodes.Element", "org.jsoup.nodes.Element", "lastElementSibling", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.jsoup.nodes.Element", "text", "java.lang.String", "1F\u00e9.\n51LL"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput271() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jsoup.nodes.Element", "org.jsoup.nodes.Element", "toggleClass", new String[]{"java.lang.String"}, new String[]{"+E\"\r:t819>0}-5;;4D:91e+><o"}, false, 0, new String[][]{{"org.jsoup.nodes.Element", "attributes", ""}}, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput272() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jsoup.nodes.Element", "org.jsoup.nodes.Element", "nextElementSibling", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.jsoup.nodes.Element", "val", ""}, {"org.jsoup.nodes.Element", "setParentNode", "org.jsoup.nodes.Node", "<sample:0>"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.ClassCastException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput273() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jsoup.nodes.Element", "org.jsoup.nodes.Element", "getElementsByClass", new String[]{"java.lang.String"}, new String[]{"+E\"\r:t819>0}-5;;4D:91e+><o"}, false, 0, new String[][]{{"org.jsoup.nodes.Element", "removeAttr", "java.lang.String", "!\010s799\u00e9+6PP-4K7D::<mn?=3\013c>244#0xI2345:79NT1H214748264!2147483648"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput274() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Element", "org.jsoup.nodes.Element", "attr", new String[]{"java.lang.String", "java.lang.String"}, new String[]{"03L", "1.5e300"}, false, 7, new String[][]{{"org.jsoup.nodes.Element", "childNode", "int", "-1"}, {"org.jsoup.nodes.Element", "addClass", "java.lang.String", "a b"}});
  assertNotNull(actual);
  assertEquals("org.jsoup.nodes.Element", actual.getClass().getName());
  assertEquals("<x \t y comment=\"a\" class=\" a b\" 03l=\"1.5e300\">\n</x \t y> {hasText=false, isBlock=false}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "<x \t y comment=\"a\" class=\" a b\" 03l=\"1.5e300\">\n</x \t y> {hasText=false, isBlock=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput275() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jsoup.nodes.Element", "org.jsoup.nodes.Element", "hasAttr", new String[]{"java.lang.String"}, new String[]{"!\010s799\u00e9+6PP-4K7D::<mn?=3\013c>244#0xI2345:79NT1H214748264!2147483648"}, false, 0, new String[][]{{"org.jsoup.nodes.Element", "toggleClass", "java.lang.String", "true"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput276() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jsoup.nodes.Element", "org.jsoup.nodes.Element", "hasClass", new String[]{"java.lang.String"}, new String[]{"1F\u00e9.\n51LL"}, false); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput277() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jsoup.nodes.Element", "org.jsoup.nodes.Element", "removeChild", new String[]{"org.jsoup.nodes.Node"}, new String[]{"<sample:2>"}, false, 0, null, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput278() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Element", "org.jsoup.nodes.Element", "attributes", new String[]{}, new String[]{}, false, 0, null, 2);
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput279() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Element", "org.jsoup.nodes.Element", "hasClass", new String[]{"java.lang.String"}, new String[]{"+1"}, false, 7, new String[][]{{"org.jsoup.nodes.Element", "getElementsByAttributeValueEnding", "java.lang.String,java.lang.String", "=a?b</a>", "\\s+"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "<x \t y comment=\"a\">\n</x \t y> {hasText=false, isBlock=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput280() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jsoup.nodes.Element", "org.jsoup.nodes.Element", "text", new String[]{"java.lang.String"}, new String[]{"+!\rt9:9?06P-556D:+<o0?223H445IB9012345689.02345689:07iulf4+0x1F"}, false, 0, new String[][]{{"org.jsoup.nodes.Element", "select", "java.lang.String", "12:30:45"}}, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput281() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.parser.Tag", "org.jsoup.parser.Tag", "valueOf", new String[]{"java.lang.String"}, new String[]{"nll<\t"}, true);
  assertNotNull(actual);
  assertEquals("org.jsoup.parser.Tag", actual.getClass().getName());
  assertEquals("nll< {canContainBlock=true, getName=nll<, isBlock=false, isData=false, isEmpty=false, isInline=true}", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput282() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Element", "org.jsoup.nodes.Element", "elementSiblingIndex", new String[]{}, new String[]{}, false);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput283() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jsoup.parser.Tag", "org.jsoup.parser.Tag", "isValidParent", new String[]{"org.jsoup.parser.Tag"}, new String[]{"<null>"}, false, 0, new String[][]{{"org.jsoup.parser.Tag", "isValidAncestor", "org.jsoup.parser.Tag", "<sample:3>"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput284() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jsoup.nodes.Element", "org.jsoup.nodes.Element", "prependText", new String[]{"java.lang.String"}, new String[]{"null"}, false, 2, new String[][]{{"org.jsoup.nodes.Element", "setBaseUri", "java.lang.String", "#root"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput285() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jsoup.nodes.Element", "org.jsoup.nodes.Element", "firstElementSibling", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.jsoup.nodes.Element", "select", "java.lang.String", "a,b,c"}}, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput286() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Element", "org.jsoup.nodes.Element", "addChild", new String[]{"org.jsoup.nodes.Node"}, new String[]{"<sample:2>"}, false, 3, new String[][]{{"org.jsoup.nodes.Element", "removeAttr", "java.lang.String", "-1e/./2345678901245"}}, 1);
  assertNull(actual);
  assertEquals("receiver state after the call", "<<a><b>t</b></a> comment=\"a\">\n<#root>\n</#root>\n</<a><b>t</b></a>> {hasText=false, isBlock=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput287() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.parser.Tag", "org.jsoup.parser.Tag", "valueOf", new String[]{"java.lang.String"}, new String[]{",&&t99900P-656E::<p?:vaaue?><>"}, true);
  assertNotNull(actual);
  assertEquals("org.jsoup.parser.Tag", actual.getClass().getName());
  assertEquals(",&&t99900p-656e::<p?:vaaue?><> {canContainBlock=true, getName=,&&t99900p-656e::<p?:vaaue?><>, isBlock=false, isData=false, isEmpty=false, isInline=true}", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput288() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jsoup.nodes.Element", "org.jsoup.nodes.Element", "indexInList", new String[]{"org.jsoup.nodes.Node", "java.util.List"}, new String[]{"<null>", "<sample:3>"}, true); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput289() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jsoup.nodes.Element", "org.jsoup.nodes.Element", "preserveWhitespace", new String[]{}, new String[]{}, false); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput290() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.parser.Tag", "org.jsoup.parser.Tag", "isValidAncestor", new String[]{"org.jsoup.parser.Tag"}, new String[]{"<sample:6>"}, false, 0, new String[][]{{"org.jsoup.parser.Tag", "isInline", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "null {canContainBlock=false, getName=null, isBlock=false, isData=true, isEmpty=false, isInline=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput291() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Element", "org.jsoup.nodes.Element", "empty", new String[]{}, new String[]{}, false, 3, new String[][]{{"org.jsoup.nodes.Element", "getElementsByIndexLessThan", "int", "-2147483648"}});
  assertNotNull(actual);
  assertEquals("org.jsoup.nodes.Element", actual.getClass().getName());
  assertEquals("<<a><b>t</b></a> comment=\"a\">\n</<a><b>t</b></a>> {hasText=false, isBlock=false}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "<<a><b>t</b></a> comment=\"a\">\n</<a><b>t</b></a>> {hasText=false, isBlock=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput292() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jsoup.nodes.Element", "org.jsoup.nodes.Element", "prepend", new String[]{"java.lang.String"}, new String[]{" "}, false, 7, new String[][]{{"org.jsoup.nodes.Element", "hasClass", "java.lang.String", "1.12346678aa123456789012345678901234567890"}}), new String[][]{{"attr", "java.lang.String,java.lang.String", "6"}});
  assertNotNull(actual);
  assertEquals("org.jsoup.nodes.Element", actual.getClass().getName());
  assertEquals("<x \t y comment=\"a\" 0=\"sample\"> \n</x \t y> {hasText=false, isBlock=false}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "<x \t y comment=\"a\" 0=\"sample\"> \n</x \t y> {hasText=false, isBlock=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput293() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jsoup.parser.Parser", "org.jsoup.parser.Parser", "parse", new String[]{"java.lang.String", "java.lang.String"}, new String[]{"4>F<!0>3}tH@i\"\u00e8*11'}A<6fts-<d85c3tFbbo3;OO3i66E4x FP0=7eu115<IUM9/116ik\"-0.0-</1", "ad0c2.1224567890124E-5<!--1.5e300"}, true), new String[][]{{"data", "", "4"}, {"removeClass", "java.lang.String", "5"}, {"outerHtml", "", "3"}, {"className", "", "3"}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput294() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jsoup.nodes.Element", "org.jsoup.nodes.Element", "prependText", new String[]{"java.lang.String"}, new String[]{"FE,"}, false, 0, null, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput295() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.parser.Tag", "org.jsoup.parser.Tag", "isEmpty", new String[]{}, new String[]{}, false, 0, null, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "null {canContainBlock=false, getName=null, isBlock=false, isData=true, isEmpty=false, isInline=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput296() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Element", "org.jsoup.nodes.Element", "parents", new String[]{}, new String[]{}, false);
  assertNotNull(actual);
  assertEquals("org.jsoup.select.Elements", actual.getClass().getName());
  assertEquals("[]", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput297() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jsoup.nodes.Element", "org.jsoup.nodes.Element", "addClass", new String[]{"java.lang.String"}, new String[]{"\tTitle"}, false, 1, new String[][]{{"org.jsoup.nodes.Element", "removeClass", "java.lang.String", "1.5"}}, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput298() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jsoup.nodes.Element", "org.jsoup.nodes.Element", "getElementsByAttribute", new String[]{"java.lang.String"}, new String[]{"-0.0"}, false, 0, new String[][]{{"org.jsoup.nodes.Element", "replaceWith", "org.jsoup.nodes.Node", "<null>"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput299() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jsoup.nodes.Element", "org.jsoup.nodes.Element", "nextElementSibling", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.jsoup.nodes.Element", "hasText", ""}}, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
}
