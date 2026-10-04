package generated.algorithm;

import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;
import static org.junit.Assert.*;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class SimulatedAnnealingGeneratedTest {
 @Test(timeout = 20000)
 public void generatedInput000() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Attribute", "org.jsoup.nodes.Attribute", "isDataAttribute", new String[]{}, new String[]{}, false, 2, new String[][]{{"org.jsoup.nodes.Attribute", "setKey", "java.lang.String", "autofocus"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "autofocus {getKey=autofocus, getValue=}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput001() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Attribute", "org.jsoup.nodes.Attribute", "html", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.jsoup.nodes.Attribute", "isBooleanAttribute", ""}, {"org.jsoup.nodes.Attribute", "equals", "java.lang.Object", "<null>"}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("a=\"0\"", String.valueOf(actual));
  assertEquals("receiver state after the call", "a=\"0\" {getKey=a, getValue=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput002() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Attribute", "org.jsoup.nodes.Attribute", "getValue", new String[]{}, new String[]{}, false, 11, new String[][]{{"org.jsoup.nodes.Attribute", "setKey", "java.lang.String", "/a/b"}, {"org.jsoup.nodes.Attribute", "isBooleanAttribute", ""}, {"org.jsoup.nodes.Attribute", "equals", "java.lang.Object", "<s:>"}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("", String.valueOf(actual));
  assertEquals("receiver state after the call", "/a/b {getKey=/a/b, getValue=}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput003() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jsoup.nodes.Attribute", "org.jsoup.nodes.Attribute", "clone", new String[]{}, new String[]{}, false, 6, new String[][]{{"org.jsoup.nodes.Attribute", "html", "java.lang.Appendable,org.jsoup.nodes.Document$OutputSettings", "<sample:0>", "<sample:2>"}}, 1), new String[][]{{"setKey", "java.lang.String", "5"}, {"setKey", "java.lang.String", "6"}});
  assertNotNull(actual);
  assertEquals("org.jsoup.nodes.Attribute", actual.getClass().getName());
  assertEquals("0=\"0\" {getKey=0, getValue=0}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "a=\"0\" {getKey=a, getValue=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput004() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Attribute", "org.jsoup.nodes.Attribute", "hashCode", new String[]{}, new String[]{}, false, 14, new String[][]{{"org.jsoup.nodes.Attribute", "isBooleanAttribute", ""}, {"org.jsoup.nodes.Attribute", "setValue", "java.lang.String", "=\""}, {"org.jsoup.nodes.Attribute", "html", ""}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("-1757098681", String.valueOf(actual));
  assertEquals("receiver state after the call", "{\"a\":1}=\"=&quot;\" {getKey={\"a\":1}, getValue==\"}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput005() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Attribute", "org.jsoup.nodes.Attribute", "shouldCollapseAttribute", new String[]{"org.jsoup.nodes.Document$OutputSettings"}, new String[]{"<sample:7>"}, false, 7, new String[][]{{"org.jsoup.nodes.Attribute", "hashCode", ""}, {"org.jsoup.nodes.Attribute", "shouldCollapseAttribute", "org.jsoup.nodes.Document$OutputSettings", "<sample:3>"}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
  assertEquals("receiver state after the call", "null {getKey=null, getValue=}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput006() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Attribute", "org.jsoup.nodes.Attribute", "isDataAttribute", new String[]{"java.lang.String"}, new String[]{"data-"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput007() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Attribute", "org.jsoup.nodes.Attribute", "isBooleanAttribute", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.jsoup.nodes.Attribute", "setKey", "java.lang.String", "ismap"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
  assertEquals("receiver state after the call", "ismap=\"0\" {getKey=ismap, getValue=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput008() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Attribute", "org.jsoup.nodes.Attribute", "setKey", new String[]{"java.lang.String"}, new String[]{"gormnovak.1.5"}, false, 13, new String[][]{{"org.jsoup.nodes.Attribute", "setValue", "java.lang.String", "{\"a:1}"}, {"org.jsoup.nodes.Attribute", "setKey", "java.lang.String", "0"}, {"org.jsoup.nodes.Attribute", "equals", "java.lang.Object", "<i:1>"}}, 2);
  assertNull(actual);
  assertEquals("receiver state after the call", "gormnovak.1.5=\"{&quot;a:1}\" {getKey=gormnovak.1.5, getValue={\"a:1}}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput009() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Attribute", "org.jsoup.nodes.Attribute", "isDataAttribute", new String[]{"java.lang.String"}, new String[]{"data-default"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput010() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Attribute", "org.jsoup.nodes.Attribute", "isDataAttribute", new String[]{}, new String[]{}, false, 2, new String[][]{{"org.jsoup.nodes.Attribute", "shouldCollapseAttribute", "org.jsoup.nodes.Document$OutputSettings", "<sample:4>"}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "sample=\"\" {getKey=sample, getValue=}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput011() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jsoup.nodes.Attribute", "org.jsoup.nodes.Attribute", "isDataAttribute", new String[]{}, new String[]{}, false, 3, new String[][]{{"org.jsoup.nodes.Attribute", "shouldCollapseAttribute", "org.jsoup.nodes.Document$OutputSettings", "<sample:4>"}}, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput012() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Attribute", "org.jsoup.nodes.Attribute", "isDataAttribute", new String[]{}, new String[]{}, false, 9, new String[][]{{"org.jsoup.nodes.Attribute", "shouldCollapseAttribute", "org.jsoup.nodes.Document$OutputSettings", "<sample:4>"}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "0=\"sample\" {getKey=0, getValue=sample}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput013() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Attribute", "org.jsoup.nodes.Attribute", "isDataAttribute", new String[]{}, new String[]{}, false, 10, new String[][]{{"org.jsoup.nodes.Attribute", "shouldCollapseAttribute", "org.jsoup.nodes.Document$OutputSettings", "<sample:4>"}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{\"a\":1}=\" x \t y \" {getKey={\"a\":1}, getValue= x \t y }", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput014() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Attribute", "org.jsoup.nodes.Attribute", "isDataAttribute", new String[]{}, new String[]{}, false, 12, new String[][]{{"org.jsoup.nodes.Attribute", "shouldCollapseAttribute", "org.jsoup.nodes.Document$OutputSettings", "<null>"}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "a=\"0\" {getKey=a, getValue=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput015() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Attribute", "org.jsoup.nodes.Attribute", "isDataAttribute", new String[]{}, new String[]{}, false, 16, new String[][]{{"org.jsoup.nodes.Attribute", "html", "java.lang.Appendable,org.jsoup.nodes.Document$OutputSettings", "<sample:3>", "<sample:2>"}, {"org.jsoup.nodes.Attribute", "shouldCollapseAttribute", "org.jsoup.nodes.Document$OutputSettings", "<sample:1>"}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "x \t y=\"line1\n\nline3\" {getKey=x \t y, getValue=line1\n\nline3}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput016() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Attribute", "org.jsoup.nodes.Attribute", "hashCode", new String[]{}, new String[]{}, false, 19, new String[][]{{"org.jsoup.nodes.Attribute", "html", "java.lang.Appendable,org.jsoup.nodes.Document$OutputSettings", "<sample:0>", "<sample:5>"}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "null {getKey=null, getValue=}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput017() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Attribute", "org.jsoup.nodes.Attribute", "hashCode", new String[]{}, new String[]{}, false, 20, new String[][]{{"org.jsoup.nodes.Attribute", "html", "java.lang.Appendable,org.jsoup.nodes.Document$OutputSettings", "<sample:0>", "<sample:5>"}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("-1608105752", String.valueOf(actual));
  assertEquals("receiver state after the call", "x \t y=\"line1\n\nline3\" {getKey=x \t y, getValue=line1\n\nline3}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput018() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Attribute", "org.jsoup.nodes.Attribute", "hashCode", new String[]{}, new String[]{}, false, 21, new String[][]{{"org.jsoup.nodes.Attribute", "html", "java.lang.Appendable,org.jsoup.nodes.Document$OutputSettings", "<sample:0>", "<sample:5>"}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("-909673606", String.valueOf(actual));
  assertEquals("receiver state after the call", "0=\"sample\" {getKey=0, getValue=sample}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput019() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Attribute", "org.jsoup.nodes.Attribute", "hashCode", new String[]{}, new String[]{}, false, 22, new String[][]{}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("1636555816", String.valueOf(actual));
  assertEquals("receiver state after the call", "line1\n\nline3=\"\n\" {getKey=line1\n\nline3, getValue=\n}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput020() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Attribute", "org.jsoup.nodes.Attribute", "setKey", new String[]{"java.lang.String"}, new String[]{"deckare"}, false, 0, new String[][]{{"org.jsoup.nodes.Attribute", "html", "java.lang.Appendable,org.jsoup.nodes.Document$OutputSettings", "<null>", "<sample:2>"}, {"org.jsoup.nodes.Attribute", "toString", ""}, {"org.jsoup.nodes.Attribute", "shouldCollapseAttribute", "org.jsoup.nodes.Document$OutputSettings", "<sample:0>"}}, 3);
  assertNull(actual);
  assertEquals("receiver state after the call", "deckare=\"0\" {getKey=deckare, getValue=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput021() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Attribute", "org.jsoup.nodes.Attribute", "setKey", new String[]{"java.lang.String"}, new String[]{"deckare-1.5.5"}, false, 0, new String[][]{{"org.jsoup.nodes.Attribute", "html", "java.lang.Appendable,org.jsoup.nodes.Document$OutputSettings", "<null>", "<sample:2>"}, {"org.jsoup.nodes.Attribute", "toString", ""}, {"org.jsoup.nodes.Attribute", "shouldCollapseAttribute", "org.jsoup.nodes.Document$OutputSettings", "<sample:0>"}}, 3);
  assertNull(actual);
  assertEquals("receiver state after the call", "deckare-1.5.5=\"0\" {getKey=deckare-1.5.5, getValue=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput022() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Attribute", "org.jsoup.nodes.Attribute", "setKey", new String[]{"java.lang.String"}, new String[]{"deeckare-1.5.5"}, false, 0, new String[][]{{"org.jsoup.nodes.Attribute", "html", "java.lang.Appendable,org.jsoup.nodes.Document$OutputSettings", "<null>", "<sample:2>"}, {"org.jsoup.nodes.Attribute", "toString", ""}, {"org.jsoup.nodes.Attribute", "shouldCollapseAttribute", "org.jsoup.nodes.Document$OutputSettings", "<sample:0>"}}, 3);
  assertNull(actual);
  assertEquals("receiver state after the call", "deeckare-1.5.5=\"0\" {getKey=deeckare-1.5.5, getValue=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput023() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Attribute", "org.jsoup.nodes.Attribute", "setKey", new String[]{"java.lang.String"}, new String[]{"deeckare-2.5.5"}, false, 0, new String[][]{{"org.jsoup.nodes.Attribute", "html", "java.lang.Appendable,org.jsoup.nodes.Document$OutputSettings", "<null>", "<sample:2>"}, {"org.jsoup.nodes.Attribute", "toString", ""}, {"org.jsoup.nodes.Attribute", "shouldCollapseAttribute", "org.jsoup.nodes.Document$OutputSettings", "<sample:0>"}}, 3);
  assertNull(actual);
  assertEquals("receiver state after the call", "deeckare-2.5.5=\"0\" {getKey=deeckare-2.5.5, getValue=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput024() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Attribute", "org.jsoup.nodes.Attribute", "setKey", new String[]{"java.lang.String"}, new String[]{"ddeckare-2.5.5"}, false, 0, new String[][]{{"org.jsoup.nodes.Attribute", "html", "java.lang.Appendable,org.jsoup.nodes.Document$OutputSettings", "<null>", "<sample:2>"}, {"org.jsoup.nodes.Attribute", "toString", ""}, {"org.jsoup.nodes.Attribute", "shouldCollapseAttribute", "org.jsoup.nodes.Document$OutputSettings", "<sample:1>"}}, 3);
  assertNull(actual);
  assertEquals("receiver state after the call", "ddeckare-2.5.5=\"0\" {getKey=ddeckare-2.5.5, getValue=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput025() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Attribute", "org.jsoup.nodes.Attribute", "setKey", new String[]{"java.lang.String"}, new String[]{"autofoccus"}, false, 0, new String[][]{{"org.jsoup.nodes.Attribute", "getKey", ""}, {"org.jsoup.nodes.Attribute", "html", "java.lang.Appendable,org.jsoup.nodes.Document$OutputSettings", "<null>", "<sample:4>"}}, 1);
  assertNull(actual);
  assertEquals("receiver state after the call", "autofoccus=\"0\" {getKey=autofoccus, getValue=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput026() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Attribute", "org.jsoup.nodes.Attribute", "setKey", new String[]{"java.lang.String"}, new String[]{"attofoccus"}, false, 0, new String[][]{{"org.jsoup.nodes.Attribute", "getKey", ""}, {"org.jsoup.nodes.Attribute", "shouldCollapseAttribute", "org.jsoup.nodes.Document$OutputSettings", "<sample:0>"}, {"org.jsoup.nodes.Attribute", "html", "java.lang.Appendable,org.jsoup.nodes.Document$OutputSettings", "<null>", "<sample:5>"}}, 1);
  assertNull(actual);
  assertEquals("receiver state after the call", "attofoccus=\"0\" {getKey=attofoccus, getValue=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput027() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Attribute", "org.jsoup.nodes.Attribute", "isDataAttribute", new String[]{}, new String[]{}, false, 2, new String[][]{{"org.jsoup.nodes.Attribute", "setKey", "java.lang.String", "autofocus"}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "autofocus {getKey=autofocus, getValue=}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput028() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Attribute", "org.jsoup.nodes.Attribute", "isDataAttribute", new String[]{}, new String[]{}, false, 3, new String[][]{{"org.jsoup.nodes.Attribute", "setKey", "java.lang.String", "autoffocus"}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "autoffocus {getKey=autoffocus, getValue=}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput029() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Attribute", "org.jsoup.nodes.Attribute", "isDataAttribute", new String[]{}, new String[]{}, false, 4, new String[][]{{"org.jsoup.nodes.Attribute", "setKey", "java.lang.String", "autoffocus"}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "autoffocus=\"{&quot;a&quot;:1}\" {getKey=autoffocus, getValue={\"a\":1}}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput030() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Attribute", "org.jsoup.nodes.Attribute", "isDataAttribute", new String[]{}, new String[]{}, false, 5, new String[][]{{"org.jsoup.nodes.Attribute", "setKey", "java.lang.String", "autoffocus"}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "autoffocus=\"sample\" {getKey=autoffocus, getValue=sample}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput031() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Attribute", "org.jsoup.nodes.Attribute", "isDataAttribute", new String[]{}, new String[]{}, false, 5, new String[][]{}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "0=\"sample\" {getKey=0, getValue=sample}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput032() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jsoup.nodes.Attribute", "org.jsoup.nodes.Attribute", "isDataAttribute", new String[]{}, new String[]{}, false, 7, new String[][]{}, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput033() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Attribute", "org.jsoup.nodes.Attribute", "shouldCollapseAttribute", new String[]{"org.jsoup.nodes.Document$OutputSettings"}, new String[]{"<sample:7>"}, false, 0, null, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "a=\"0\" {getKey=a, getValue=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput034() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Attribute", "org.jsoup.nodes.Attribute", "shouldCollapseAttribute", new String[]{"org.jsoup.nodes.Document$OutputSettings"}, new String[]{"<sample:6>"}, false, 1, new String[][]{}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "0=\"sample\" {getKey=0, getValue=sample}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput035() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Attribute", "org.jsoup.nodes.Attribute", "isDataAttribute", new String[]{}, new String[]{}, false, 0, null, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "a=\"0\" {getKey=a, getValue=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput036() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Attribute", "org.jsoup.nodes.Attribute", "isDataAttribute", new String[]{}, new String[]{}, false, 1, new String[][]{}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "0=\"sample\" {getKey=0, getValue=sample}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput037() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Attribute", "org.jsoup.nodes.Attribute", "isDataAttribute", new String[]{}, new String[]{}, false, 2, new String[][]{}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "sample=\"\" {getKey=sample, getValue=}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput038() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jsoup.nodes.Attribute", "org.jsoup.nodes.Attribute", "isDataAttribute", new String[]{}, new String[]{}, false, 3, new String[][]{}, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput039() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Attribute", "org.jsoup.nodes.Attribute", "isDataAttribute", new String[]{}, new String[]{}, false, 4, new String[][]{}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "<a><b>t</b></a>=\"{&quot;a&quot;:1}\" {getKey=<a><b>t</b></a>, getValue={\"a\":1}}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput040() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jsoup.nodes.Attribute", "org.jsoup.nodes.Attribute", "html", new String[]{"java.lang.Appendable", "org.jsoup.nodes.Document$OutputSettings"}, new String[]{"<sample:5>", "<null>"}, false, 0, new String[][]{{"org.jsoup.nodes.Attribute", "setKey", "java.lang.String", "2020-02-30T25:61:61"}, {"org.jsoup.nodes.Attribute", "setValue", "java.lang.String", "nohref"}}, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput041() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Attribute", "org.jsoup.nodes.Attribute", "html", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.jsoup.nodes.Attribute", "setKey", "java.lang.String", "a"}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("a=\"0\"", String.valueOf(actual));
  assertEquals("receiver state after the call", "a=\"0\" {getKey=a, getValue=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput042() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Attribute", "org.jsoup.nodes.Attribute", "html", new String[]{}, new String[]{}, false, 1, new String[][]{{"org.jsoup.nodes.Attribute", "setKey", "java.lang.String", "a"}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("a=\"sample\"", String.valueOf(actual));
  assertEquals("receiver state after the call", "a=\"sample\" {getKey=a, getValue=sample}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput043() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Attribute", "org.jsoup.nodes.Attribute", "html", new String[]{}, new String[]{}, false, 2, new String[][]{{"org.jsoup.nodes.Attribute", "setKey", "java.lang.String", "a"}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("a=\"\"", String.valueOf(actual));
  assertEquals("receiver state after the call", "a=\"\" {getKey=a, getValue=}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput044() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Attribute", "org.jsoup.nodes.Attribute", "html", new String[]{}, new String[]{}, false, 3, new String[][]{{"org.jsoup.nodes.Attribute", "setKey", "java.lang.String", "a"}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("a", String.valueOf(actual));
  assertEquals("receiver state after the call", "a {getKey=a, getValue=}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput045() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Attribute", "org.jsoup.nodes.Attribute", "html", new String[]{}, new String[]{}, false, 3, new String[][]{{"org.jsoup.nodes.Attribute", "setKey", "java.lang.String", "-0.01.1234567"}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("-0.01.1234567", String.valueOf(actual));
  assertEquals("receiver state after the call", "-0.01.1234567 {getKey=-0.01.1234567, getValue=}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput046() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Attribute", "org.jsoup.nodes.Attribute", "hashCode", new String[]{}, new String[]{}, false, 16, new String[][]{{"org.jsoup.nodes.Attribute", "clone", ""}, {"org.jsoup.nodes.Attribute", "html", ""}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("-1608105752", String.valueOf(actual));
  assertEquals("receiver state after the call", "x \t y=\"line1\n\nline3\" {getKey=x \t y, getValue=line1\n\nline3}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput047() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Attribute", "org.jsoup.nodes.Attribute", "hashCode", new String[]{}, new String[]{}, false, 8, new String[][]{{"org.jsoup.nodes.Attribute", "clone", ""}, {"org.jsoup.nodes.Attribute", "html", ""}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("1630186666", String.valueOf(actual));
  assertEquals("receiver state after the call", "<a><b>t</b></a>=\"{&quot;a&quot;:1}\" {getKey=<a><b>t</b></a>, getValue={\"a\":1}}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput048() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Attribute", "org.jsoup.nodes.Attribute", "hashCode", new String[]{}, new String[]{}, false, 9, new String[][]{{"org.jsoup.nodes.Attribute", "clone", ""}, {"org.jsoup.nodes.Attribute", "html", ""}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("-909673606", String.valueOf(actual));
  assertEquals("receiver state after the call", "0=\"sample\" {getKey=0, getValue=sample}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput049() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Attribute", "org.jsoup.nodes.Attribute", "toString", new String[]{}, new String[]{}, false, 0, null, 3);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("a=\"0\"", String.valueOf(actual));
  assertEquals("receiver state after the call", "a=\"0\" {getKey=a, getValue=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput050() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Attribute", "org.jsoup.nodes.Attribute", "toString", new String[]{}, new String[]{}, false, 1, new String[][]{}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("0=\"sample\"", String.valueOf(actual));
  assertEquals("receiver state after the call", "0=\"sample\" {getKey=0, getValue=sample}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput051() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Attribute", "org.jsoup.nodes.Attribute", "hashCode", new String[]{}, new String[]{}, false, 7, new String[][]{{"org.jsoup.nodes.Attribute", "getValue", ""}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "null {getKey=null, getValue=}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput052() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Attribute", "org.jsoup.nodes.Attribute", "hashCode", new String[]{}, new String[]{}, false, 8, new String[][]{{"org.jsoup.nodes.Attribute", "getValue", ""}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("1630186666", String.valueOf(actual));
  assertEquals("receiver state after the call", "<a><b>t</b></a>=\"{&quot;a&quot;:1}\" {getKey=<a><b>t</b></a>, getValue={\"a\":1}}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput053() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Attribute", "org.jsoup.nodes.Attribute", "hashCode", new String[]{}, new String[]{}, false, 9, new String[][]{}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("-909673606", String.valueOf(actual));
  assertEquals("receiver state after the call", "0=\"sample\" {getKey=0, getValue=sample}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput054() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Attribute", "org.jsoup.nodes.Attribute", "hashCode", new String[]{}, new String[]{}, false, 10, new String[][]{}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("43599560", String.valueOf(actual));
  assertEquals("receiver state after the call", "{\"a\":1}=\" x \t y \" {getKey={\"a\":1}, getValue= x \t y }", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput055() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Attribute", "org.jsoup.nodes.Attribute", "hashCode", new String[]{}, new String[]{}, false, 12, new String[][]{{"org.jsoup.nodes.Attribute", "getKey", ""}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("3055", String.valueOf(actual));
  assertEquals("receiver state after the call", "a=\"0\" {getKey=a, getValue=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput056() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Attribute", "org.jsoup.nodes.Attribute", "hashCode", new String[]{}, new String[]{}, false, 13, new String[][]{{"org.jsoup.nodes.Attribute", "getKey", ""}, {"org.jsoup.nodes.Attribute", "setValue", "java.lang.String", "1.25"}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("1507056", String.valueOf(actual));
  assertEquals("receiver state after the call", "0=\"1.25\" {getKey=0, getValue=1.25}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput057() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Attribute", "org.jsoup.nodes.Attribute", "hashCode", new String[]{}, new String[]{}, false, 14, new String[][]{{"org.jsoup.nodes.Attribute", "getKey", ""}, {"org.jsoup.nodes.Attribute", "setValue", "java.lang.String", "1.25"}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("-1755595038", String.valueOf(actual));
  assertEquals("receiver state after the call", "{\"a\":1}=\"1.25\" {getKey={\"a\":1}, getValue=1.25}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput058() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Attribute", "org.jsoup.nodes.Attribute", "hashCode", new String[]{}, new String[]{}, false, 15, new String[][]{{"org.jsoup.nodes.Attribute", "getKey", ""}, {"org.jsoup.nodes.Attribute", "setValue", "java.lang.String", "1.25"}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("1505568", String.valueOf(actual));
  assertEquals("receiver state after the call", "null=\"1.25\" {getKey=null, getValue=1.25}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput059() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Attribute", "org.jsoup.nodes.Attribute", "hashCode", new String[]{}, new String[]{}, false, 16, new String[][]{{"org.jsoup.nodes.Attribute", "getKey", ""}, {"org.jsoup.nodes.Attribute", "setValue", "java.lang.String", "1.25"}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("-828108314", String.valueOf(actual));
  assertEquals("receiver state after the call", "x \t y=\"1.25\" {getKey=x \t y, getValue=1.25}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput060() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Attribute", "org.jsoup.nodes.Attribute", "setKey", new String[]{"java.lang.String"}, new String[]{"http://example.com/a?b=c"}, false, 0, null, 1);
  assertNull(actual);
  assertEquals("receiver state after the call", "http://example.com/a?b=c=\"0\" {getKey=http://example.com/a?b=c, getValue=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput061() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Attribute", "org.jsoup.nodes.Attribute", "setKey", new String[]{"java.lang.String"}, new String[]{"http://example.coA/a?b=c"}, false, 0, null, 1);
  assertNull(actual);
  assertEquals("receiver state after the call", "http://example.coA/a?b=c=\"0\" {getKey=http://example.coA/a?b=c, getValue=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput062() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Attribute", "org.jsoup.nodes.Attribute", "setKey", new String[]{"java.lang.String"}, new String[]{"htt://example.coA/a?b=c"}, false, 0, null, 1);
  assertNull(actual);
  assertEquals("receiver state after the call", "htt://example.coA/a?b=c=\"0\" {getKey=htt://example.coA/a?b=c, getValue=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput063() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jsoup.nodes.Attribute", "org.jsoup.nodes.Attribute", "setKey", new String[]{"java.lang.String"}, new String[]{" "}, false, 0, null, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput064() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Attribute", "org.jsoup.nodes.Attribute", "html", new String[]{}, new String[]{}, false, 3, new String[][]{{"org.jsoup.nodes.Attribute", "html", ""}, {"org.jsoup.nodes.Attribute", "clone", ""}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("null", String.valueOf(actual));
  assertEquals("receiver state after the call", "null {getKey=null, getValue=}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput065() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Attribute", "org.jsoup.nodes.Attribute", "html", new String[]{}, new String[]{}, false, 4, new String[][]{{"org.jsoup.nodes.Attribute", "html", ""}, {"org.jsoup.nodes.Attribute", "clone", ""}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("<a><b>t</b></a>=\"{&quot;a&quot;:1}\"", String.valueOf(actual));
  assertEquals("receiver state after the call", "<a><b>t</b></a>=\"{&quot;a&quot;:1}\" {getKey=<a><b>t</b></a>, getValue={\"a\":1}}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput066() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Attribute", "org.jsoup.nodes.Attribute", "getKey", new String[]{}, new String[]{}, false, 1, new String[][]{{"org.jsoup.nodes.Attribute", "clone", ""}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "0=\"sample\" {getKey=0, getValue=sample}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput067() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Attribute", "org.jsoup.nodes.Attribute", "getKey", new String[]{}, new String[]{}, false, 2, new String[][]{{"org.jsoup.nodes.Attribute", "clone", ""}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("sample", String.valueOf(actual));
  assertEquals("receiver state after the call", "sample=\"\" {getKey=sample, getValue=}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput068() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Attribute", "org.jsoup.nodes.Attribute", "getKey", new String[]{}, new String[]{}, false, 3, new String[][]{{"org.jsoup.nodes.Attribute", "clone", ""}, {"org.jsoup.nodes.Attribute", "getKey", ""}}, 2);
  assertNull(actual);
  assertEquals("receiver state after the call", "null {getKey=null, getValue=}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput069() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Attribute", "org.jsoup.nodes.Attribute", "getKey", new String[]{}, new String[]{}, false, 4, new String[][]{{"org.jsoup.nodes.Attribute", "clone", ""}, {"org.jsoup.nodes.Attribute", "getKey", ""}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("<a><b>t</b></a>", String.valueOf(actual));
  assertEquals("receiver state after the call", "<a><b>t</b></a>=\"{&quot;a&quot;:1}\" {getKey=<a><b>t</b></a>, getValue={\"a\":1}}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput070() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Attribute", "org.jsoup.nodes.Attribute", "getKey", new String[]{}, new String[]{}, false, 6, new String[][]{{"org.jsoup.nodes.Attribute", "clone", ""}, {"org.jsoup.nodes.Attribute", "getKey", ""}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("a", String.valueOf(actual));
  assertEquals("receiver state after the call", "a=\"0\" {getKey=a, getValue=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput071() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Attribute", "org.jsoup.nodes.Attribute", "getKey", new String[]{}, new String[]{}, false, 6, new String[][]{{"org.jsoup.nodes.Attribute", "clone", ""}, {"org.jsoup.nodes.Attribute", "getKey", ""}, {"org.jsoup.nodes.Attribute", "setValue", "java.lang.String", "autofocus"}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("a", String.valueOf(actual));
  assertEquals("receiver state after the call", "a=\"autofocus\" {getKey=a, getValue=autofocus}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput072() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Attribute", "org.jsoup.nodes.Attribute", "getKey", new String[]{}, new String[]{}, false, 7, new String[][]{{"org.jsoup.nodes.Attribute", "clone", ""}, {"org.jsoup.nodes.Attribute", "getKey", ""}, {"org.jsoup.nodes.Attribute", "setValue", "java.lang.String", "autofocus"}}, 2);
  assertNull(actual);
  assertEquals("receiver state after the call", "null=\"autofocus\" {getKey=null, getValue=autofocus}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput073() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Attribute", "org.jsoup.nodes.Attribute", "getKey", new String[]{}, new String[]{}, false, 8, new String[][]{{"org.jsoup.nodes.Attribute", "clone", ""}, {"org.jsoup.nodes.Attribute", "getKey", ""}, {"org.jsoup.nodes.Attribute", "setValue", "java.lang.String", "autofocus"}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("<a><b>t</b></a>", String.valueOf(actual));
  assertEquals("receiver state after the call", "<a><b>t</b></a>=\"autofocus\" {getKey=<a><b>t</b></a>, getValue=autofocus}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput074() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Attribute", "org.jsoup.nodes.Attribute", "getKey", new String[]{}, new String[]{}, false, 9, new String[][]{{"org.jsoup.nodes.Attribute", "clone", ""}, {"org.jsoup.nodes.Attribute", "getKey", ""}, {"org.jsoup.nodes.Attribute", "setValue", "java.lang.String", "autofocus"}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "0=\"autofocus\" {getKey=0, getValue=autofocus}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput075() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Attribute", "org.jsoup.nodes.Attribute", "getKey", new String[]{}, new String[]{}, false, 10, new String[][]{{"org.jsoup.nodes.Attribute", "clone", ""}, {"org.jsoup.nodes.Attribute", "setValue", "java.lang.String", "autofocus"}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("{\"a\":1}", String.valueOf(actual));
  assertEquals("receiver state after the call", "{\"a\":1}=\"autofocus\" {getKey={\"a\":1}, getValue=autofocus}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput076() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Attribute", "org.jsoup.nodes.Attribute", "getKey", new String[]{}, new String[]{}, false, 16, new String[][]{{"org.jsoup.nodes.Attribute", "equals", "java.lang.Object", "<d:1.5>"}, {"org.jsoup.nodes.Attribute", "isDataAttribute", ""}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("x \t y", String.valueOf(actual));
  assertEquals("receiver state after the call", "x \t y=\"line1\n\nline3\" {getKey=x \t y, getValue=line1\n\nline3}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput077() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jsoup.nodes.Attribute", "org.jsoup.nodes.Attribute", "clone", new String[]{}, new String[]{}, false, 16, new String[][]{}, 1), new String[][]{{"getValue", "", "0"}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("line1\n\nline3", String.valueOf(actual));
  assertEquals("receiver state after the call", "x \t y=\"line1\n\nline3\" {getKey=x \t y, getValue=line1\n\nline3}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput078() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jsoup.nodes.Attribute", "org.jsoup.nodes.Attribute", "clone", new String[]{}, new String[]{}, false, 16, new String[][]{}, 1), new String[][]{{"getValue", "", "0"}, {"getKey", "", "3"}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("x \t y", String.valueOf(actual));
  assertEquals("receiver state after the call", "x \t y=\"line1\n\nline3\" {getKey=x \t y, getValue=line1\n\nline3}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput079() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jsoup.nodes.Attribute", "org.jsoup.nodes.Attribute", "clone", new String[]{}, new String[]{}, false, 17, new String[][]{}, 1), new String[][]{{"getValue", "", "0"}, {"getKey", "", "3"}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "0=\"sample\" {getKey=0, getValue=sample}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput080() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jsoup.nodes.Attribute", "org.jsoup.nodes.Attribute", "clone", new String[]{}, new String[]{}, false, 18, new String[][]{}, 1), new String[][]{{"getValue", "", "0"}, {"getKey", "", "3"}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("a", String.valueOf(actual));
  assertEquals("receiver state after the call", "a=\"0\" {getKey=a, getValue=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput081() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jsoup.nodes.Attribute", "org.jsoup.nodes.Attribute", "clone", new String[]{}, new String[]{}, false, 19, new String[][]{}, 1), new String[][]{{"getValue", "", "0"}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("", String.valueOf(actual));
  assertEquals("receiver state after the call", "null {getKey=null, getValue=}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput082() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jsoup.nodes.Attribute", "org.jsoup.nodes.Attribute", "clone", new String[]{}, new String[]{}, false, 21, new String[][]{}, 1), new String[][]{{"getValue", "", "0"}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("sample", String.valueOf(actual));
  assertEquals("receiver state after the call", "0=\"sample\" {getKey=0, getValue=sample}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput083() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Attribute", "org.jsoup.nodes.Attribute", "isBooleanAttribute", new String[]{}, new String[]{}, false, 13, new String[][]{{"org.jsoup.nodes.Attribute", "shouldCollapseAttribute", "org.jsoup.nodes.Document$OutputSettings", "<sample:0>"}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "0=\"sample\" {getKey=0, getValue=sample}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput084() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Attribute", "org.jsoup.nodes.Attribute", "isBooleanAttribute", new String[]{}, new String[]{}, false, 14, new String[][]{{"org.jsoup.nodes.Attribute", "shouldCollapseAttribute", "org.jsoup.nodes.Document$OutputSettings", "<sample:0>"}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{\"a\":1}=\" x \t y \" {getKey={\"a\":1}, getValue= x \t y }", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput085() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Attribute", "org.jsoup.nodes.Attribute", "isDataAttribute", new String[]{"java.lang.String"}, new String[]{"1.25"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput086() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Attribute", "org.jsoup.nodes.Attribute", "setKey", new String[]{"java.lang.String"}, new String[]{"-0.0"}, false);
  assertNull(actual);
  assertEquals("receiver state after the call", "-0.0=\"0\" {getKey=-0.0, getValue=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput087() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Attribute", "org.jsoup.nodes.Attribute", "setKey", new String[]{"java.lang.String"}, new String[]{"-0.01.1234567"}, false);
  assertNull(actual);
  assertEquals("receiver state after the call", "-0.01.1234567=\"0\" {getKey=-0.01.1234567, getValue=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput088() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Attribute", "org.jsoup.nodes.Attribute", "setKey", new String[]{"java.lang.String"}, new String[]{"-0.01.1234567"}, false, 11, new String[][]{});
  assertNull(actual);
  assertEquals("receiver state after the call", "-0.01.1234567 {getKey=-0.01.1234567, getValue=}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput089() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Attribute", "org.jsoup.nodes.Attribute", "setKey", new String[]{"java.lang.String"}, new String[]{"-0.02.2234567"}, false, 11, new String[][]{});
  assertNull(actual);
  assertEquals("receiver state after the call", "-0.02.2234567 {getKey=-0.02.2234567, getValue=}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput090() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Attribute", "org.jsoup.nodes.Attribute", "setKey", new String[]{"java.lang.String"}, new String[]{"-0.01.1234567"}, false, 12, new String[][]{});
  assertNull(actual);
  assertEquals("receiver state after the call", "-0.01.1234567=\"0\" {getKey=-0.01.1234567, getValue=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput091() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Attribute", "org.jsoup.nodes.Attribute", "setKey", new String[]{"java.lang.String"}, new String[]{"2147483648"}, false, 12, new String[][]{});
  assertNull(actual);
  assertEquals("receiver state after the call", "2147483648=\"0\" {getKey=2147483648, getValue=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput092() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Attribute", "org.jsoup.nodes.Attribute", "setKey", new String[]{"java.lang.String"}, new String[]{"-0.01.0334567"}, false, 12, new String[][]{});
  assertNull(actual);
  assertEquals("receiver state after the call", "-0.01.0334567=\"0\" {getKey=-0.01.0334567, getValue=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput093() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Attribute", "org.jsoup.nodes.Attribute", "isBooleanAttribute", new String[]{}, new String[]{}, false);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "a=\"0\" {getKey=a, getValue=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput094() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Attribute", "org.jsoup.nodes.Attribute", "isBooleanAttribute", new String[]{}, new String[]{}, false, 1, new String[][]{});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "0=\"sample\" {getKey=0, getValue=sample}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput095() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Attribute", "org.jsoup.nodes.Attribute", "isBooleanAttribute", new String[]{}, new String[]{}, false, 2, new String[][]{});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "sample=\"\" {getKey=sample, getValue=}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput096() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Attribute", "org.jsoup.nodes.Attribute", "isBooleanAttribute", new String[]{}, new String[]{}, false, 2, new String[][]{{"org.jsoup.nodes.Attribute", "isDataAttribute", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "sample=\"\" {getKey=sample, getValue=}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput097() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jsoup.nodes.Attribute", "org.jsoup.nodes.Attribute", "isBooleanAttribute", new String[]{}, new String[]{}, false, 3, new String[][]{}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput098() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Attribute", "org.jsoup.nodes.Attribute", "isBooleanAttribute", new String[]{}, new String[]{}, false, 2, new String[][]{{"org.jsoup.nodes.Attribute", "shouldCollapseAttribute", "org.jsoup.nodes.Document$OutputSettings", "<sample:2>"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "sample=\"\" {getKey=sample, getValue=}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput099() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Attribute", "org.jsoup.nodes.Attribute", "isBooleanAttribute", new String[]{}, new String[]{}, false, 4, new String[][]{{"org.jsoup.nodes.Attribute", "shouldCollapseAttribute", "org.jsoup.nodes.Document$OutputSettings", "<sample:2>"}, {"org.jsoup.nodes.Attribute", "isBooleanAttribute", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "<a><b>t</b></a>=\"{&quot;a&quot;:1}\" {getKey=<a><b>t</b></a>, getValue={\"a\":1}}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput100() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Attribute", "org.jsoup.nodes.Attribute", "isDataAttribute", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.jsoup.nodes.Attribute", "shouldCollapseAttribute", "org.jsoup.nodes.Document$OutputSettings", "<sample:4>"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "a=\"0\" {getKey=a, getValue=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput101() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Attribute", "org.jsoup.nodes.Attribute", "isDataAttribute", new String[]{}, new String[]{}, false, 1, new String[][]{{"org.jsoup.nodes.Attribute", "shouldCollapseAttribute", "org.jsoup.nodes.Document$OutputSettings", "<sample:4>"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "0=\"sample\" {getKey=0, getValue=sample}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput102() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Attribute", "org.jsoup.nodes.Attribute", "isDataAttribute", new String[]{}, new String[]{}, false, 2, new String[][]{{"org.jsoup.nodes.Attribute", "shouldCollapseAttribute", "org.jsoup.nodes.Document$OutputSettings", "<sample:4>"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "sample=\"\" {getKey=sample, getValue=}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput103() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Attribute", "org.jsoup.nodes.Attribute", "hashCode", new String[]{}, new String[]{}, false);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("3055", String.valueOf(actual));
  assertEquals("receiver state after the call", "a=\"0\" {getKey=a, getValue=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput104() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Attribute", "org.jsoup.nodes.Attribute", "hashCode", new String[]{}, new String[]{}, false, 1, new String[][]{});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("-909673606", String.valueOf(actual));
  assertEquals("receiver state after the call", "0=\"sample\" {getKey=0, getValue=sample}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput105() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Attribute", "org.jsoup.nodes.Attribute", "hashCode", new String[]{}, new String[]{}, false, 2, new String[][]{});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("1864843158", String.valueOf(actual));
  assertEquals("receiver state after the call", "sample=\"\" {getKey=sample, getValue=}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput106() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Attribute", "org.jsoup.nodes.Attribute", "html", new String[]{"java.lang.Appendable", "org.jsoup.nodes.Document$OutputSettings"}, new String[]{"<sample:3>", "<sample:7>"}, false);
  assertNull(actual);
  assertEquals("receiver state after the call", "a=\"0\" {getKey=a, getValue=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput107() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Attribute", "org.jsoup.nodes.Attribute", "hashCode", new String[]{}, new String[]{}, false, 3, new String[][]{});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "null {getKey=null, getValue=}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput108() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Attribute", "org.jsoup.nodes.Attribute", "hashCode", new String[]{}, new String[]{}, false, 4, new String[][]{});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("1630186666", String.valueOf(actual));
  assertEquals("receiver state after the call", "<a><b>t</b></a>=\"{&quot;a&quot;:1}\" {getKey=<a><b>t</b></a>, getValue={\"a\":1}}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput109() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Attribute", "org.jsoup.nodes.Attribute", "hashCode", new String[]{}, new String[]{}, false, 16, new String[][]{{"org.jsoup.nodes.Attribute", "html", "java.lang.Appendable,org.jsoup.nodes.Document$OutputSettings", "<empty>", "<sample:2>"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("-1608105752", String.valueOf(actual));
  assertEquals("receiver state after the call", "x \t y=\"line1\n\nline3\" {getKey=x \t y, getValue=line1\n\nline3}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput110() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Attribute", "org.jsoup.nodes.Attribute", "hashCode", new String[]{}, new String[]{}, false, 22, new String[][]{{"org.jsoup.nodes.Attribute", "html", "java.lang.Appendable,org.jsoup.nodes.Document$OutputSettings", "<sample:0>", "<sample:2>"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("1636555816", String.valueOf(actual));
  assertEquals("receiver state after the call", "line1\n\nline3=\"\n\" {getKey=line1\n\nline3, getValue=\n}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput111() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Attribute", "org.jsoup.nodes.Attribute", "setKey", new String[]{"java.lang.String"}, new String[]{"declare"}, false, 0, new String[][]{{"org.jsoup.nodes.Attribute", "equals", "java.lang.Object", "<d:1.5>"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "declare=\"0\" {getKey=declare, getValue=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput112() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Attribute", "org.jsoup.nodes.Attribute", "clone", new String[]{}, new String[]{}, false);
  assertNotNull(actual);
  assertEquals("org.jsoup.nodes.Attribute", actual.getClass().getName());
  assertEquals("a=\"0\" {getKey=a, getValue=0}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "a=\"0\" {getKey=a, getValue=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput113() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Attribute", "org.jsoup.nodes.Attribute", "clone", new String[]{}, new String[]{}, false, 1, new String[][]{});
  assertNotNull(actual);
  assertEquals("org.jsoup.nodes.Attribute", actual.getClass().getName());
  assertEquals("0=\"sample\" {getKey=0, getValue=sample}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "0=\"sample\" {getKey=0, getValue=sample}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput114() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jsoup.nodes.Attribute", "org.jsoup.nodes.Attribute", "clone", new String[]{}, new String[]{}, false, 1, new String[][]{}), new String[][]{{"setValue", "java.lang.String", "2"}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("", String.valueOf(actual));
  assertEquals("receiver state after the call", "0=\"sample\" {getKey=0, getValue=sample}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput115() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jsoup.nodes.Attribute", "org.jsoup.nodes.Attribute", "clone", new String[]{}, new String[]{}, false, 2, new String[][]{}), new String[][]{{"setValue", "java.lang.String", "2"}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("", String.valueOf(actual));
  assertEquals("receiver state after the call", "sample=\"\" {getKey=sample, getValue=}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput116() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jsoup.nodes.Attribute", "org.jsoup.nodes.Attribute", "clone", new String[]{}, new String[]{}, false, 3, new String[][]{}), new String[][]{{"setValue", "java.lang.String", "2"}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("", String.valueOf(actual));
  assertEquals("receiver state after the call", "null {getKey=null, getValue=}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput117() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jsoup.nodes.Attribute", "org.jsoup.nodes.Attribute", "clone", new String[]{}, new String[]{}, false, 3, new String[][]{}), new String[][]{{"setValue", "java.lang.String", "2"}, {"setKey", "java.lang.String", "0"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput118() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Attribute", "org.jsoup.nodes.Attribute", "isDataAttribute", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.jsoup.nodes.Attribute", "setKey", "java.lang.String", "autofocus"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "autofocus=\"0\" {getKey=autofocus, getValue=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput119() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Attribute", "org.jsoup.nodes.Attribute", "isDataAttribute", new String[]{}, new String[]{}, false, 1, new String[][]{{"org.jsoup.nodes.Attribute", "setKey", "java.lang.String", "autofocus"}, {"org.jsoup.nodes.Attribute", "getKey", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "autofocus=\"sample\" {getKey=autofocus, getValue=sample}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput120() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jsoup.nodes.Attribute", "org.jsoup.nodes.Attribute", "isDataAttribute", new String[]{}, new String[]{}, false, 11, new String[][]{{"org.jsoup.nodes.Attribute", "setValue", "java.lang.String", "{\"a\":1}"}, {"org.jsoup.nodes.Attribute", "clone", ""}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput121() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Attribute", "org.jsoup.nodes.Attribute", "isDataAttribute", new String[]{}, new String[]{}, false, 12, new String[][]{{"org.jsoup.nodes.Attribute", "setValue", "java.lang.String", "{\"a\":1}"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "a=\"{&quot;a&quot;:1}\" {getKey=a, getValue={\"a\":1}}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput122() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Attribute", "org.jsoup.nodes.Attribute", "toString", new String[]{}, new String[]{}, false, 2, new String[][]{{"org.jsoup.nodes.Attribute", "equals", "java.lang.Object", "<i:1>"}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("sample=\"\"", String.valueOf(actual));
  assertEquals("receiver state after the call", "sample=\"\" {getKey=sample, getValue=}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput123() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Attribute", "org.jsoup.nodes.Attribute", "toString", new String[]{}, new String[]{}, false, 3, new String[][]{{"org.jsoup.nodes.Attribute", "equals", "java.lang.Object", "<i:0>"}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("null", String.valueOf(actual));
  assertEquals("receiver state after the call", "null {getKey=null, getValue=}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput124() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Attribute", "org.jsoup.nodes.Attribute", "toString", new String[]{}, new String[]{}, false, 4, new String[][]{{"org.jsoup.nodes.Attribute", "getValue", ""}, {"org.jsoup.nodes.Attribute", "getKey", ""}, {"org.jsoup.nodes.Attribute", "equals", "java.lang.Object", "<i:0>"}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("<a><b>t</b></a>=\"{&quot;a&quot;:1}\"", String.valueOf(actual));
  assertEquals("receiver state after the call", "<a><b>t</b></a>=\"{&quot;a&quot;:1}\" {getKey=<a><b>t</b></a>, getValue={\"a\":1}}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput125() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Attribute", "org.jsoup.nodes.Attribute", "toString", new String[]{}, new String[]{}, false, 5, new String[][]{{"org.jsoup.nodes.Attribute", "getValue", ""}, {"org.jsoup.nodes.Attribute", "getKey", ""}, {"org.jsoup.nodes.Attribute", "equals", "java.lang.Object", "<i:0>"}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("0=\"sample\"", String.valueOf(actual));
  assertEquals("receiver state after the call", "0=\"sample\" {getKey=0, getValue=sample}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput126() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Attribute", "org.jsoup.nodes.Attribute", "toString", new String[]{}, new String[]{}, false, 6, new String[][]{{"org.jsoup.nodes.Attribute", "getValue", ""}, {"org.jsoup.nodes.Attribute", "getKey", ""}, {"org.jsoup.nodes.Attribute", "equals", "java.lang.Object", "<i:0>"}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("a=\"0\"", String.valueOf(actual));
  assertEquals("receiver state after the call", "a=\"0\" {getKey=a, getValue=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput127() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Attribute", "org.jsoup.nodes.Attribute", "html", new String[]{"java.lang.String", "java.lang.String", "java.lang.Appendable", "org.jsoup.nodes.Document$OutputSettings"}, new String[]{"true", "a", "<sample:0>", "<sample:6>"}, true);
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput128() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Attribute", "org.jsoup.nodes.Attribute", "setValue", new String[]{"java.lang.String"}, new String[]{"nohref"}, false, 0, new String[][]{{"org.jsoup.nodes.Attribute", "isBooleanAttribute", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "a=\"nohref\" {getKey=a, getValue=nohref}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput129() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Attribute", "org.jsoup.nodes.Attribute", "setValue", new String[]{"java.lang.String"}, new String[]{"ohref"}, false, 0, new String[][]{{"org.jsoup.nodes.Attribute", "isBooleanAttribute", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "a=\"ohref\" {getKey=a, getValue=ohref}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput130() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Attribute", "org.jsoup.nodes.Attribute", "setValue", new String[]{"java.lang.String"}, new String[]{"phref"}, false, 0, new String[][]{{"org.jsoup.nodes.Attribute", "isBooleanAttribute", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "a=\"phref\" {getKey=a, getValue=phref}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput131() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Attribute", "org.jsoup.nodes.Attribute", "setValue", new String[]{"java.lang.String"}, new String[]{"phreff"}, false, 0, new String[][]{{"org.jsoup.nodes.Attribute", "isBooleanAttribute", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "a=\"phreff\" {getKey=a, getValue=phreff}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput132() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jsoup.nodes.Attribute", "org.jsoup.nodes.Attribute", "html", new String[]{"java.lang.Appendable", "org.jsoup.nodes.Document$OutputSettings"}, new String[]{"<sample:0>", "<null>"}, false, 0, new String[][]{{"org.jsoup.nodes.Attribute", "setValue", "java.lang.String", "nohref"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput133() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Attribute", "org.jsoup.nodes.Attribute", "html", new String[]{"java.lang.Appendable", "org.jsoup.nodes.Document$OutputSettings"}, new String[]{"<sample:5>", "<sample:2>"}, false, 0, new String[][]{{"org.jsoup.nodes.Attribute", "setValue", "java.lang.String", "nohref"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "a=\"nohref\" {getKey=a, getValue=nohref}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput134() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Attribute", "org.jsoup.nodes.Attribute", "html", new String[]{"java.lang.Appendable", "org.jsoup.nodes.Document$OutputSettings"}, new String[]{"<sample:5>", "<sample:2>"}, false, 0, new String[][]{{"org.jsoup.nodes.Attribute", "setKey", "java.lang.String", "2020-02-30T25:61:61"}, {"org.jsoup.nodes.Attribute", "setValue", "java.lang.String", "nohref"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "2020-02-30T25:61:61=\"nohref\" {getKey=2020-02-30T25:61:61, getValue=nohref}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput135() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Attribute", "org.jsoup.nodes.Attribute", "isBooleanAttribute", new String[]{"java.lang.String"}, new String[]{"2020-01-01"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput136() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Attribute", "org.jsoup.nodes.Attribute", "isBooleanAttribute", new String[]{"java.lang.String"}, new String[]{"autofocus"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput137() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Attribute", "org.jsoup.nodes.Attribute", "getValue", new String[]{}, new String[]{}, false);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "a=\"0\" {getKey=a, getValue=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput138() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Attribute", "org.jsoup.nodes.Attribute", "getValue", new String[]{}, new String[]{}, false, 1, new String[][]{{"org.jsoup.nodes.Attribute", "clone", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("sample", String.valueOf(actual));
  assertEquals("receiver state after the call", "0=\"sample\" {getKey=0, getValue=sample}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput139() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Attribute", "org.jsoup.nodes.Attribute", "html", new String[]{}, new String[]{}, false);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("a=\"0\"", String.valueOf(actual));
  assertEquals("receiver state after the call", "a=\"0\" {getKey=a, getValue=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput140() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Attribute", "org.jsoup.nodes.Attribute", "html", new String[]{}, new String[]{}, false, 1, new String[][]{});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("0=\"sample\"", String.valueOf(actual));
  assertEquals("receiver state after the call", "0=\"sample\" {getKey=0, getValue=sample}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput141() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Attribute", "org.jsoup.nodes.Attribute", "html", new String[]{}, new String[]{}, false, 2, new String[][]{});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("sample=\"\"", String.valueOf(actual));
  assertEquals("receiver state after the call", "sample=\"\" {getKey=sample, getValue=}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput142() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Attribute", "org.jsoup.nodes.Attribute", "html", new String[]{}, new String[]{}, false, 3, new String[][]{});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("null", String.valueOf(actual));
  assertEquals("receiver state after the call", "null {getKey=null, getValue=}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput143() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jsoup.nodes.Attribute", "org.jsoup.nodes.Attribute", "shouldCollapseAttribute", new String[]{"org.jsoup.nodes.Document$OutputSettings"}, new String[]{"<null>"}, false); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput144() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Attribute", "org.jsoup.nodes.Attribute", "shouldCollapseAttribute", new String[]{"org.jsoup.nodes.Document$OutputSettings"}, new String[]{"<sample:4>"}, false);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "a=\"0\" {getKey=a, getValue=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput145() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Attribute", "org.jsoup.nodes.Attribute", "shouldCollapseAttribute", new String[]{"org.jsoup.nodes.Document$OutputSettings"}, new String[]{"<sample:2>"}, false, 0, new String[][]{{"org.jsoup.nodes.Attribute", "setKey", "java.lang.String", "0x123456789"}, {"org.jsoup.nodes.Attribute", "isDataAttribute", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "0x123456789=\"0\" {getKey=0x123456789, getValue=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput146() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Attribute", "org.jsoup.nodes.Attribute", "shouldCollapseAttribute", new String[]{"org.jsoup.nodes.Document$OutputSettings"}, new String[]{"<sample:6>"}, false, 0, new String[][]{{"org.jsoup.nodes.Attribute", "setKey", "java.lang.String", "0x12345B6789"}, {"org.jsoup.nodes.Attribute", "isDataAttribute", ""}, {"org.jsoup.nodes.Attribute", "clone", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "0x12345B6789=\"0\" {getKey=0x12345B6789, getValue=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput147() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Attribute", "org.jsoup.nodes.Attribute", "shouldCollapseAttribute", new String[]{"org.jsoup.nodes.Document$OutputSettings"}, new String[]{"<sample:2>"}, false, 11, new String[][]{{"org.jsoup.nodes.Attribute", "isDataAttribute", ""}, {"org.jsoup.nodes.Attribute", "toString", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
  assertEquals("receiver state after the call", "null {getKey=null, getValue=}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput148() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Attribute", "org.jsoup.nodes.Attribute", "hashCode", new String[]{}, new String[]{}, false, 10, new String[][]{});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("43599560", String.valueOf(actual));
  assertEquals("receiver state after the call", "{\"a\":1}=\" x \t y \" {getKey={\"a\":1}, getValue= x \t y }", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput149() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Attribute", "org.jsoup.nodes.Attribute", "hashCode", new String[]{}, new String[]{}, false, 12, new String[][]{{"org.jsoup.nodes.Attribute", "setValue", "java.lang.String", "123456789012345678901234567890"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("1395805776", String.valueOf(actual));
  assertEquals("receiver state after the call", "a=\"123456789012345678901234567890\" {getKey=a, getValue=123456789012345678901234567890}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput150() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Attribute", "org.jsoup.nodes.Attribute", "html", new String[]{"java.lang.Appendable", "org.jsoup.nodes.Document$OutputSettings"}, new String[]{"<empty>", "<sample:5>"}, false, 5, new String[][]{{"org.jsoup.nodes.Attribute", "shouldCollapseAttribute", "org.jsoup.nodes.Document$OutputSettings", "<sample:3>"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "0=\"sample\" {getKey=0, getValue=sample}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput151() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Attribute", "org.jsoup.nodes.Attribute", "getKey", new String[]{}, new String[]{}, false);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("a", String.valueOf(actual));
  assertEquals("receiver state after the call", "a=\"0\" {getKey=a, getValue=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput152() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Attribute", "org.jsoup.nodes.Attribute", "getKey", new String[]{}, new String[]{}, false, 1, new String[][]{});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "0=\"sample\" {getKey=0, getValue=sample}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput153() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Attribute", "org.jsoup.nodes.Attribute", "getKey", new String[]{}, new String[]{}, false, 2, new String[][]{});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("sample", String.valueOf(actual));
  assertEquals("receiver state after the call", "sample=\"\" {getKey=sample, getValue=}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput154() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Attribute", "org.jsoup.nodes.Attribute", "getKey", new String[]{}, new String[]{}, false, 2, new String[][]{{"org.jsoup.nodes.Attribute", "setValue", "java.lang.String", "1E-5"}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("sample", String.valueOf(actual));
  assertEquals("receiver state after the call", "sample=\"1E-5\" {getKey=sample, getValue=1E-5}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput155() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Attribute", "org.jsoup.nodes.Attribute", "getKey", new String[]{}, new String[]{}, false, 3, new String[][]{{"org.jsoup.nodes.Attribute", "setValue", "java.lang.String", "1E-5"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "null=\"1E-5\" {getKey=null, getValue=1E-5}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput156() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Attribute", "org.jsoup.nodes.Attribute", "createFromEncoded", new String[]{"java.lang.String", "java.lang.String"}, new String[]{"Hello, World", "1"}, true);
  assertNotNull(actual);
  assertEquals("org.jsoup.nodes.Attribute", actual.getClass().getName());
  assertEquals("Hello, World=\"1\" {getKey=Hello, World, getValue=1}", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput157() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Attribute", "org.jsoup.nodes.Attribute", "createFromEncoded", new String[]{"java.lang.String", "java.lang.String"}, new String[]{"Helmo, World", "1"}, true);
  assertNotNull(actual);
  assertEquals("org.jsoup.nodes.Attribute", actual.getClass().getName());
  assertEquals("Helmo, World=\"1\" {getKey=Helmo, World, getValue=1}", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput158() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Attribute", "org.jsoup.nodes.Attribute", "createFromEncoded", new String[]{"java.lang.String", "java.lang.String"}, new String[]{"Helmo, World", "1/"}, true);
  assertNotNull(actual);
  assertEquals("org.jsoup.nodes.Attribute", actual.getClass().getName());
  assertEquals("Helmo, World=\"1/\" {getKey=Helmo, World, getValue=1/}", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput159() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Attribute", "org.jsoup.nodes.Attribute", "createFromEncoded", new String[]{"java.lang.String", "java.lang.String"}, new String[]{"Helmo, Worldhidden", "1/"}, true);
  assertNotNull(actual);
  assertEquals("org.jsoup.nodes.Attribute", actual.getClass().getName());
  assertEquals("Helmo, Worldhidden=\"1/\" {getKey=Helmo, Worldhidden, getValue=1/}", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput160() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Attribute", "org.jsoup.nodes.Attribute", "createFromEncoded", new String[]{"java.lang.String", "java.lang.String"}, new String[]{"Helmo, W-rldhiddendeclare", "1/"}, true);
  assertNotNull(actual);
  assertEquals("org.jsoup.nodes.Attribute", actual.getClass().getName());
  assertEquals("Helmo, W-rldhiddendeclare=\"1/\" {getKey=Helmo, W-rldhiddendeclare, getValue=1/}", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput161() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jsoup.nodes.Attribute", "org.jsoup.nodes.Attribute", "createFromEncoded", new String[]{"java.lang.String", "java.lang.String"}, new String[]{"Helmo, W-rldhiddendeclare", "1/"}, true), new String[][]{{"getKey", "", "0"}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("Helmo, W-rldhiddendeclare", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput162() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Attribute", "org.jsoup.nodes.Attribute", "createFromEncoded", new String[]{"java.lang.String", "java.lang.String"}, new String[]{"Helmo, r-rldhiddendeclare", "1/"}, true);
  assertNotNull(actual);
  assertEquals("org.jsoup.nodes.Attribute", actual.getClass().getName());
  assertEquals("Helmo, r-rldhiddendeclare=\"1/\" {getKey=Helmo, r-rldhiddendeclare, getValue=1/}", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput163() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jsoup.nodes.Attribute", "org.jsoup.nodes.Attribute", "html", new String[]{"java.lang.String", "java.lang.String", "java.lang.Appendable", "org.jsoup.nodes.Document$OutputSettings"}, new String[]{"1e10", "0xFFFFFFFF", "<sample:2>", "<null>"}, true); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput164() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Attribute", "org.jsoup.nodes.Attribute", "hashCode", new String[]{}, new String[]{}, false, 16, new String[][]{{"org.jsoup.nodes.Attribute", "getKey", ""}, {"org.jsoup.nodes.Attribute", "setValue", "java.lang.String", "1.25"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("-828108314", String.valueOf(actual));
  assertEquals("receiver state after the call", "x \t y=\"1.25\" {getKey=x \t y, getValue=1.25}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput165() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Attribute", "org.jsoup.nodes.Attribute", "hashCode", new String[]{}, new String[]{}, false, 3, new String[][]{{"org.jsoup.nodes.Attribute", "getKey", ""}, {"org.jsoup.nodes.Attribute", "setValue", "java.lang.String", "1.25"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("1505568", String.valueOf(actual));
  assertEquals("receiver state after the call", "null=\"1.25\" {getKey=null, getValue=1.25}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput166() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Attribute", "org.jsoup.nodes.Attribute", "hashCode", new String[]{}, new String[]{}, false, 4, new String[][]{{"org.jsoup.nodes.Attribute", "getKey", ""}, {"org.jsoup.nodes.Attribute", "setValue", "java.lang.String", "1.25"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("-1221121076", String.valueOf(actual));
  assertEquals("receiver state after the call", "<a><b>t</b></a>=\"1.25\" {getKey=<a><b>t</b></a>, getValue=1.25}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput167() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Attribute", "org.jsoup.nodes.Attribute", "hashCode", new String[]{}, new String[]{}, false, 5, new String[][]{{"org.jsoup.nodes.Attribute", "getKey", ""}, {"org.jsoup.nodes.Attribute", "setValue", "java.lang.String", "1.25"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("1507056", String.valueOf(actual));
  assertEquals("receiver state after the call", "0=\"1.25\" {getKey=0, getValue=1.25}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput168() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Attribute", "org.jsoup.nodes.Attribute", "hashCode", new String[]{}, new String[]{}, false, 6, new String[][]{{"org.jsoup.nodes.Attribute", "getKey", ""}, {"org.jsoup.nodes.Attribute", "setValue", "java.lang.String", "1.25"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("1508575", String.valueOf(actual));
  assertEquals("receiver state after the call", "a=\"1.25\" {getKey=a, getValue=1.25}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput169() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Attribute", "org.jsoup.nodes.Attribute", "html", new String[]{"java.lang.Appendable", "org.jsoup.nodes.Document$OutputSettings"}, new String[]{"<sample:2>", "<sample:7>"}, false, 7, new String[][]{{"org.jsoup.nodes.Attribute", "isBooleanAttribute", ""}});
  assertNull(actual);
  assertEquals("receiver state after the call", "null {getKey=null, getValue=}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput170() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Attribute", "org.jsoup.nodes.Attribute", "html", new String[]{}, new String[]{}, false, 4, new String[][]{{"org.jsoup.nodes.Attribute", "html", ""}, {"org.jsoup.nodes.Attribute", "clone", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("<a><b>t</b></a>=\"{&quot;a&quot;:1}\"", String.valueOf(actual));
  assertEquals("receiver state after the call", "<a><b>t</b></a>=\"{&quot;a&quot;:1}\" {getKey=<a><b>t</b></a>, getValue={\"a\":1}}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput171() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Attribute", "org.jsoup.nodes.Attribute", "getKey", new String[]{}, new String[]{}, false, 4, new String[][]{{"org.jsoup.nodes.Attribute", "hashCode", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("<a><b>t</b></a>", String.valueOf(actual));
  assertEquals("receiver state after the call", "<a><b>t</b></a>=\"{&quot;a&quot;:1}\" {getKey=<a><b>t</b></a>, getValue={\"a\":1}}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput172() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Attribute", "org.jsoup.nodes.Attribute", "getKey", new String[]{}, new String[]{}, false, 9, new String[][]{{"org.jsoup.nodes.Attribute", "clone", ""}, {"org.jsoup.nodes.Attribute", "setValue", "java.lang.String", "1.12345678901234567"}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "0=\"1.12345678901234567\" {getKey=0, getValue=1.12345678901234567}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput173() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Attribute", "org.jsoup.nodes.Attribute", "getKey", new String[]{}, new String[]{}, false, 10, new String[][]{{"org.jsoup.nodes.Attribute", "clone", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("{\"a\":1}", String.valueOf(actual));
  assertEquals("receiver state after the call", "{\"a\":1}=\" x \t y \" {getKey={\"a\":1}, getValue= x \t y }", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput174() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Attribute", "org.jsoup.nodes.Attribute", "getKey", new String[]{}, new String[]{}, false, 11, new String[][]{{"org.jsoup.nodes.Attribute", "clone", ""}});
  assertNull(actual);
  assertEquals("receiver state after the call", "null {getKey=null, getValue=}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput175() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Attribute", "org.jsoup.nodes.Attribute", "getKey", new String[]{}, new String[]{}, false, 16, new String[][]{{"org.jsoup.nodes.Attribute", "equals", "java.lang.Object", "<d:1.5>"}, {"org.jsoup.nodes.Attribute", "clone", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("x \t y", String.valueOf(actual));
  assertEquals("receiver state after the call", "x \t y=\"line1\n\nline3\" {getKey=x \t y, getValue=line1\n\nline3}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput176() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jsoup.nodes.Attribute", "org.jsoup.nodes.Attribute", "clone", new String[]{}, new String[]{}, false, 1, new String[][]{}), new String[][]{{"getValue", "", "0"}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("sample", String.valueOf(actual));
  assertEquals("receiver state after the call", "0=\"sample\" {getKey=0, getValue=sample}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput177() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jsoup.nodes.Attribute", "org.jsoup.nodes.Attribute", "clone", new String[]{}, new String[]{}, false, 14, new String[][]{}), new String[][]{{"getValue", "", "0"}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals(" x \t y ", String.valueOf(actual));
  assertEquals("receiver state after the call", "{\"a\":1}=\" x \t y \" {getKey={\"a\":1}, getValue= x \t y }", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput178() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jsoup.nodes.Attribute", "org.jsoup.nodes.Attribute", "clone", new String[]{}, new String[]{}, false, 16, new String[][]{}), new String[][]{{"getValue", "", "0"}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("line1\n\nline3", String.valueOf(actual));
  assertEquals("receiver state after the call", "x \t y=\"line1\n\nline3\" {getKey=x \t y, getValue=line1\n\nline3}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput179() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jsoup.nodes.Attribute", "org.jsoup.nodes.Attribute", "isBooleanAttribute", new String[]{}, new String[]{}, false, 15, new String[][]{{"org.jsoup.nodes.Attribute", "shouldCollapseAttribute", "org.jsoup.nodes.Document$OutputSettings", "<sample:0>"}, {"org.jsoup.nodes.Attribute", "html", "java.lang.Appendable,org.jsoup.nodes.Document$OutputSettings", "<sample:3>", "<sample:7>"}, {"org.jsoup.nodes.Attribute", "isBooleanAttribute", ""}}, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput180() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Attribute", "org.jsoup.nodes.Attribute", "isBooleanAttribute", new String[]{}, new String[]{}, false, 16, new String[][]{{"org.jsoup.nodes.Attribute", "shouldCollapseAttribute", "org.jsoup.nodes.Document$OutputSettings", "<null>"}, {"org.jsoup.nodes.Attribute", "shouldCollapseAttribute", "org.jsoup.nodes.Document$OutputSettings", "<sample:1>"}, {"org.jsoup.nodes.Attribute", "html", "java.lang.Appendable,org.jsoup.nodes.Document$OutputSettings", "<sample:3>", "<sample:7>"}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "x \t y=\"line1\n\nline3\" {getKey=x \t y, getValue=line1\n\nline3}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput181() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Attribute", "org.jsoup.nodes.Attribute", "isBooleanAttribute", new String[]{}, new String[]{}, false, 18, new String[][]{{"org.jsoup.nodes.Attribute", "shouldCollapseAttribute", "org.jsoup.nodes.Document$OutputSettings", "<null>"}, {"org.jsoup.nodes.Attribute", "shouldCollapseAttribute", "org.jsoup.nodes.Document$OutputSettings", "<sample:1>"}, {"org.jsoup.nodes.Attribute", "html", "java.lang.Appendable,org.jsoup.nodes.Document$OutputSettings", "<sample:3>", "<sample:7>"}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "a=\"0\" {getKey=a, getValue=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput182() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Attribute", "org.jsoup.nodes.Attribute", "createFromEncoded", new String[]{"java.lang.String", "java.lang.String"}, new String[]{"compact", "1.5f"}, true, 0, null, 3);
  assertNotNull(actual);
  assertEquals("org.jsoup.nodes.Attribute", actual.getClass().getName());
  assertEquals("compact=\"1.5f\" {getKey=compact, getValue=1.5f}", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput183() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Attribute", "org.jsoup.nodes.Attribute", "createFromEncoded", new String[]{"java.lang.String", "java.lang.String"}, new String[]{"ompact", "1.5f"}, true, 0, null, 3);
  assertNotNull(actual);
  assertEquals("org.jsoup.nodes.Attribute", actual.getClass().getName());
  assertEquals("ompact=\"1.5f\" {getKey=ompact, getValue=1.5f}", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput184() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Attribute", "org.jsoup.nodes.Attribute", "createFromEncoded", new String[]{"java.lang.String", "java.lang.String"}, new String[]{"ompact ", "1.f"}, true, 0, null, 3);
  assertNotNull(actual);
  assertEquals("org.jsoup.nodes.Attribute", actual.getClass().getName());
  assertEquals("ompact=\"1.f\" {getKey=ompact, getValue=1.f}", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput185() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Attribute", "org.jsoup.nodes.Attribute", "createFromEncoded", new String[]{"java.lang.String", "java.lang.String"}, new String[]{"ompabt i", "1.f"}, true, 0, null, 3);
  assertNotNull(actual);
  assertEquals("org.jsoup.nodes.Attribute", actual.getClass().getName());
  assertEquals("ompabt i=\"1.f\" {getKey=ompabt i, getValue=1.f}", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput186() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Attribute", "org.jsoup.nodes.Attribute", "createFromEncoded", new String[]{"java.lang.String", "java.lang.String"}, new String[]{"ompabt i", "1.fa"}, true, 0, null, 3);
  assertNotNull(actual);
  assertEquals("org.jsoup.nodes.Attribute", actual.getClass().getName());
  assertEquals("ompabt i=\"1.fa\" {getKey=ompabt i, getValue=1.fa}", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput187() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Attribute", "org.jsoup.nodes.Attribute", "createFromEncoded", new String[]{"java.lang.String", "java.lang.String"}, new String[]{"ompabt i", "1/fa"}, true, 0, null, 3);
  assertNotNull(actual);
  assertEquals("org.jsoup.nodes.Attribute", actual.getClass().getName());
  assertEquals("ompabt i=\"1/fa\" {getKey=ompabt i, getValue=1/fa}", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput188() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Attribute", "org.jsoup.nodes.Attribute", "createFromEncoded", new String[]{"java.lang.String", "java.lang.String"}, new String[]{"ompabt i", "1/fb"}, true, 0, null, 3);
  assertNotNull(actual);
  assertEquals("org.jsoup.nodes.Attribute", actual.getClass().getName());
  assertEquals("ompabt i=\"1/fb\" {getKey=ompabt i, getValue=1/fb}", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput189() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Attribute", "org.jsoup.nodes.Attribute", "createFromEncoded", new String[]{"java.lang.String", "java.lang.String"}, new String[]{"ompabt i", "1/f"}, true, 0, null, 3);
  assertNotNull(actual);
  assertEquals("org.jsoup.nodes.Attribute", actual.getClass().getName());
  assertEquals("ompabt i=\"1/f\" {getKey=ompabt i, getValue=1/f}", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput190() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Attribute", "org.jsoup.nodes.Attribute", "clone", new String[]{}, new String[]{}, false, 2, new String[][]{});
  assertNotNull(actual);
  assertEquals("org.jsoup.nodes.Attribute", actual.getClass().getName());
  assertEquals("sample=\"\" {getKey=sample, getValue=}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "sample=\"\" {getKey=sample, getValue=}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput191() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Attribute", "org.jsoup.nodes.Attribute", "clone", new String[]{}, new String[]{}, false, 3, new String[][]{{"org.jsoup.nodes.Attribute", "clone", ""}});
  assertNotNull(actual);
  assertEquals("org.jsoup.nodes.Attribute", actual.getClass().getName());
  assertEquals("null {getKey=null, getValue=}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "null {getKey=null, getValue=}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput192() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Attribute", "org.jsoup.nodes.Attribute", "clone", new String[]{}, new String[]{}, false, 4, new String[][]{{"org.jsoup.nodes.Attribute", "clone", ""}, {"org.jsoup.nodes.Attribute", "clone", ""}});
  assertNotNull(actual);
  assertEquals("org.jsoup.nodes.Attribute", actual.getClass().getName());
  assertEquals("<a><b>t</b></a>=\"{&quot;a&quot;:1}\" {getKey=<a><b>t</b></a>, getValue={\"a\":1}}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "<a><b>t</b></a>=\"{&quot;a&quot;:1}\" {getKey=<a><b>t</b></a>, getValue={\"a\":1}}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput193() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Attribute", "org.jsoup.nodes.Attribute", "shouldCollapseAttribute", new String[]{"java.lang.String", "java.lang.String", "org.jsoup.nodes.Document$OutputSettings"}, new String[]{"data-", "=\"", "<sample:5>"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput194() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Attribute", "org.jsoup.nodes.Attribute", "shouldCollapseAttribute", new String[]{"java.lang.String", "java.lang.String", "org.jsoup.nodes.Document$OutputSettings"}, new String[]{"data-", "=\"defe", "<sample:8>"}, true, 0, null, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput195() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Attribute", "org.jsoup.nodes.Attribute", "getValue", new String[]{}, new String[]{}, false, 0, null, 2);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "a=\"0\" {getKey=a, getValue=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput196() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Attribute", "org.jsoup.nodes.Attribute", "getValue", new String[]{}, new String[]{}, false, 1, new String[][]{}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("sample", String.valueOf(actual));
  assertEquals("receiver state after the call", "0=\"sample\" {getKey=0, getValue=sample}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput197() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Attribute", "org.jsoup.nodes.Attribute", "getValue", new String[]{}, new String[]{}, false, 2, new String[][]{}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("", String.valueOf(actual));
  assertEquals("receiver state after the call", "sample=\"\" {getKey=sample, getValue=}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput198() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Attribute", "org.jsoup.nodes.Attribute", "getValue", new String[]{}, new String[]{}, false, 3, new String[][]{}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("", String.valueOf(actual));
  assertEquals("receiver state after the call", "null {getKey=null, getValue=}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput199() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Attribute", "org.jsoup.nodes.Attribute", "getValue", new String[]{}, new String[]{}, false, 4, new String[][]{}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("{\"a\":1}", String.valueOf(actual));
  assertEquals("receiver state after the call", "<a><b>t</b></a>=\"{&quot;a&quot;:1}\" {getKey=<a><b>t</b></a>, getValue={\"a\":1}}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput200() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Attribute", "org.jsoup.nodes.Attribute", "getValue", new String[]{}, new String[]{}, false, 5, new String[][]{{"org.jsoup.nodes.Attribute", "toString", ""}, {"org.jsoup.nodes.Attribute", "setValue", "java.lang.String", "PT1H"}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("PT1H", String.valueOf(actual));
  assertEquals("receiver state after the call", "0=\"PT1H\" {getKey=0, getValue=PT1H}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput201() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Attribute", "org.jsoup.nodes.Attribute", "getValue", new String[]{}, new String[]{}, false, 5, new String[][]{{"org.jsoup.nodes.Attribute", "toString", ""}, {"org.jsoup.nodes.Attribute", "setValue", "java.lang.String", "2020-02-30T25:61:61"}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("2020-02-30T25:61:61", String.valueOf(actual));
  assertEquals("receiver state after the call", "0=\"2020-02-30T25:61:61\" {getKey=0, getValue=2020-02-30T25:61:61}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput202() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Attribute", "org.jsoup.nodes.Attribute", "getValue", new String[]{}, new String[]{}, false, 6, new String[][]{{"org.jsoup.nodes.Attribute", "toString", ""}, {"org.jsoup.nodes.Attribute", "setValue", "java.lang.String", "2020-02-30T25:61:61"}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("2020-02-30T25:61:61", String.valueOf(actual));
  assertEquals("receiver state after the call", "a=\"2020-02-30T25:61:61\" {getKey=a, getValue=2020-02-30T25:61:61}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput203() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Attribute", "org.jsoup.nodes.Attribute", "getValue", new String[]{}, new String[]{}, false, 7, new String[][]{{"org.jsoup.nodes.Attribute", "toString", ""}, {"org.jsoup.nodes.Attribute", "setValue", "java.lang.String", "2020-02-30T25:61:61"}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("2020-02-30T25:61:61", String.valueOf(actual));
  assertEquals("receiver state after the call", "null=\"2020-02-30T25:61:61\" {getKey=null, getValue=2020-02-30T25:61:61}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput204() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Attribute", "org.jsoup.nodes.Attribute", "getValue", new String[]{}, new String[]{}, false, 7, new String[][]{{"org.jsoup.nodes.Attribute", "toString", ""}, {"org.jsoup.nodes.Attribute", "setValue", "java.lang.String", "I2020-02-30T25:61:61"}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("I2020-02-30T25:61:61", String.valueOf(actual));
  assertEquals("receiver state after the call", "null=\"I2020-02-30T25:61:61\" {getKey=null, getValue=I2020-02-30T25:61:61}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput205() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Attribute", "org.jsoup.nodes.Attribute", "getValue", new String[]{}, new String[]{}, false, 8, new String[][]{{"org.jsoup.nodes.Attribute", "equals", "java.lang.Object", "<sample:1>"}, {"org.jsoup.nodes.Attribute", "toString", ""}, {"org.jsoup.nodes.Attribute", "setValue", "java.lang.String", "I2020-02-30T25:61:61"}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("I2020-02-30T25:61:61", String.valueOf(actual));
  assertEquals("receiver state after the call", "<a><b>t</b></a>=\"I2020-02-30T25:61:61\" {getKey=<a><b>t</b></a>, getValue=I2020-02-30T25:61:61}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput206() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Attribute", "org.jsoup.nodes.Attribute", "getValue", new String[]{}, new String[]{}, false, 14, new String[][]{{"org.jsoup.nodes.Attribute", "equals", "java.lang.Object", "<d:1.5>"}, {"org.jsoup.nodes.Attribute", "toString", ""}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals(" x \t y ", String.valueOf(actual));
  assertEquals("receiver state after the call", "{\"a\":1}=\" x \t y \" {getKey={\"a\":1}, getValue= x \t y }", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput207() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Attribute", "org.jsoup.nodes.Attribute", "getValue", new String[]{}, new String[]{}, false, 19, new String[][]{});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("", String.valueOf(actual));
  assertEquals("receiver state after the call", "null {getKey=null, getValue=}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput208() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Attribute", "org.jsoup.nodes.Attribute", "getValue", new String[]{}, new String[]{}, false, 20, new String[][]{});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("line1\n\nline3", String.valueOf(actual));
  assertEquals("receiver state after the call", "x \t y=\"line1\n\nline3\" {getKey=x \t y, getValue=line1\n\nline3}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput209() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Attribute", "org.jsoup.nodes.Attribute", "getValue", new String[]{}, new String[]{}, false, 22, new String[][]{});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("\n", String.valueOf(actual));
  assertEquals("receiver state after the call", "line1\n\nline3=\"\n\" {getKey=line1\n\nline3, getValue=\n}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput210() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Attribute", "org.jsoup.nodes.Attribute", "getValue", new String[]{}, new String[]{}, false, 22, new String[][]{{"org.jsoup.nodes.Attribute", "setKey", "java.lang.String", "null"}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("\n", String.valueOf(actual));
  assertEquals("receiver state after the call", "null=\"\n\" {getKey=null, getValue=\n}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput211() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Attribute", "org.jsoup.nodes.Attribute", "getValue", new String[]{}, new String[]{}, false, 22, new String[][]{{"org.jsoup.nodes.Attribute", "setKey", "java.lang.String", "oull"}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("\n", String.valueOf(actual));
  assertEquals("receiver state after the call", "oull=\"\n\" {getKey=oull, getValue=\n}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput212() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Attribute", "org.jsoup.nodes.Attribute", "getValue", new String[]{}, new String[]{}, false, 23, new String[][]{{"org.jsoup.nodes.Attribute", "setKey", "java.lang.String", "oull"}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("", String.valueOf(actual));
  assertEquals("receiver state after the call", "oull {getKey=oull, getValue=}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput213() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Attribute", "org.jsoup.nodes.Attribute", "getValue", new String[]{}, new String[]{}, false, 24, new String[][]{{"org.jsoup.nodes.Attribute", "setKey", "java.lang.String", "oull"}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "oull=\"0\" {getKey=oull, getValue=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput214() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Attribute", "org.jsoup.nodes.Attribute", "getValue", new String[]{}, new String[]{}, false, 14, new String[][]{{"org.jsoup.nodes.Attribute", "isDataAttribute", ""}, {"org.jsoup.nodes.Attribute", "setKey", "java.lang.String", "+1"}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals(" x \t y ", String.valueOf(actual));
  assertEquals("receiver state after the call", "+1=\" x \t y \" {getKey=+1, getValue= x \t y }", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput215() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Attribute", "org.jsoup.nodes.Attribute", "getKey", new String[]{}, new String[]{}, false, 9, new String[][]{{"org.jsoup.nodes.Attribute", "setKey", "java.lang.String", "-1"}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("-1", String.valueOf(actual));
  assertEquals("receiver state after the call", "-1=\"sample\" {getKey=-1, getValue=sample}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput216() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Attribute", "org.jsoup.nodes.Attribute", "getKey", new String[]{}, new String[]{}, false, 9, new String[][]{{"org.jsoup.nodes.Attribute", "setKey", "java.lang.String", "-1"}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("-1", String.valueOf(actual));
  assertEquals("receiver state after the call", "-1=\"sample\" {getKey=-1, getValue=sample}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput217() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Attribute", "org.jsoup.nodes.Attribute", "getKey", new String[]{}, new String[]{}, false, 10, new String[][]{{"org.jsoup.nodes.Attribute", "shouldCollapseAttribute", "org.jsoup.nodes.Document$OutputSettings", "<sample:3>"}, {"org.jsoup.nodes.Attribute", "setKey", "java.lang.String", "-1"}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("-1", String.valueOf(actual));
  assertEquals("receiver state after the call", "-1=\" x \t y \" {getKey=-1, getValue= x \t y }", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput218() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Attribute", "org.jsoup.nodes.Attribute", "toString", new String[]{}, new String[]{}, false, 10, new String[][]{});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("{\"a\":1}=\" x \t y \"", String.valueOf(actual));
  assertEquals("receiver state after the call", "{\"a\":1}=\" x \t y \" {getKey={\"a\":1}, getValue= x \t y }", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput219() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Attribute", "org.jsoup.nodes.Attribute", "getValue", new String[]{}, new String[]{}, false, 4, new String[][]{{"org.jsoup.nodes.Attribute", "isBooleanAttribute", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("{\"a\":1}", String.valueOf(actual));
  assertEquals("receiver state after the call", "<a><b>t</b></a>=\"{&quot;a&quot;:1}\" {getKey=<a><b>t</b></a>, getValue={\"a\":1}}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput220() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Attribute", "org.jsoup.nodes.Attribute", "html", new String[]{}, new String[]{}, false, 1, new String[][]{{"org.jsoup.nodes.Attribute", "setKey", "java.lang.String", "a"}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("a=\"sample\"", String.valueOf(actual));
  assertEquals("receiver state after the call", "a=\"sample\" {getKey=a, getValue=sample}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput221() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Attribute", "org.jsoup.nodes.Attribute", "html", new String[]{}, new String[]{}, false, 2, new String[][]{{"org.jsoup.nodes.Attribute", "setKey", "java.lang.String", "a"}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("a=\"\"", String.valueOf(actual));
  assertEquals("receiver state after the call", "a=\"\" {getKey=a, getValue=}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput222() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Attribute", "org.jsoup.nodes.Attribute", "html", new String[]{}, new String[]{}, false, 3, new String[][]{{"org.jsoup.nodes.Attribute", "setKey", "java.lang.String", "a"}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("a", String.valueOf(actual));
  assertEquals("receiver state after the call", "a {getKey=a, getValue=}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput223() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Attribute", "org.jsoup.nodes.Attribute", "html", new String[]{}, new String[]{}, false, 4, new String[][]{{"org.jsoup.nodes.Attribute", "setKey", "java.lang.String", "a"}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("a=\"{&quot;a&quot;:1}\"", String.valueOf(actual));
  assertEquals("receiver state after the call", "a=\"{&quot;a&quot;:1}\" {getKey=a, getValue={\"a\":1}}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput224() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Attribute", "org.jsoup.nodes.Attribute", "html", new String[]{}, new String[]{}, false, 4, new String[][]{{"org.jsoup.nodes.Attribute", "setKey", "java.lang.String", "a"}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("a=\"{&quot;a&quot;:1}\"", String.valueOf(actual));
  assertEquals("receiver state after the call", "a=\"{&quot;a&quot;:1}\" {getKey=a, getValue={\"a\":1}}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput225() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Attribute", "org.jsoup.nodes.Attribute", "html", new String[]{}, new String[]{}, false, 5, new String[][]{{"org.jsoup.nodes.Attribute", "setKey", "java.lang.String", "a"}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("a=\"sample\"", String.valueOf(actual));
  assertEquals("receiver state after the call", "a=\"sample\" {getKey=a, getValue=sample}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput226() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Attribute", "org.jsoup.nodes.Attribute", "html", new String[]{}, new String[]{}, false, 6, new String[][]{{"org.jsoup.nodes.Attribute", "setKey", "java.lang.String", "a"}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("a=\"0\"", String.valueOf(actual));
  assertEquals("receiver state after the call", "a=\"0\" {getKey=a, getValue=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput227() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Attribute", "org.jsoup.nodes.Attribute", "html", new String[]{}, new String[]{}, false, 8, new String[][]{{"org.jsoup.nodes.Attribute", "setValue", "java.lang.String", "1"}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("<a><b>t</b></a>=\"1\"", String.valueOf(actual));
  assertEquals("receiver state after the call", "<a><b>t</b></a>=\"1\" {getKey=<a><b>t</b></a>, getValue=1}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput228() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Attribute", "org.jsoup.nodes.Attribute", "html", new String[]{}, new String[]{}, false, 8, new String[][]{{"org.jsoup.nodes.Attribute", "setValue", "java.lang.String", "D1"}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("<a><b>t</b></a>=\"D1\"", String.valueOf(actual));
  assertEquals("receiver state after the call", "<a><b>t</b></a>=\"D1\" {getKey=<a><b>t</b></a>, getValue=D1}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput229() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Attribute", "org.jsoup.nodes.Attribute", "html", new String[]{}, new String[]{}, false, 9, new String[][]{{"org.jsoup.nodes.Attribute", "setValue", "java.lang.String", "D1"}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("0=\"D1\"", String.valueOf(actual));
  assertEquals("receiver state after the call", "0=\"D1\" {getKey=0, getValue=D1}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput230() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Attribute", "org.jsoup.nodes.Attribute", "html", new String[]{}, new String[]{}, false, 10, new String[][]{{"org.jsoup.nodes.Attribute", "setValue", "java.lang.String", "D1"}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("{\"a\":1}=\"D1\"", String.valueOf(actual));
  assertEquals("receiver state after the call", "{\"a\":1}=\"D1\" {getKey={\"a\":1}, getValue=D1}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput231() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Attribute", "org.jsoup.nodes.Attribute", "html", new String[]{}, new String[]{}, false, 10, new String[][]{{"org.jsoup.nodes.Attribute", "setKey", "java.lang.String", "=\""}, {"org.jsoup.nodes.Attribute", "html", ""}, {"org.jsoup.nodes.Attribute", "setValue", "java.lang.String", "D1"}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("=\"=\"D1\"", String.valueOf(actual));
  assertEquals("receiver state after the call", "=\"=\"D1\" {getKey==\", getValue=D1}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput232() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Attribute", "org.jsoup.nodes.Attribute", "html", new String[]{}, new String[]{}, false, 11, new String[][]{{"org.jsoup.nodes.Attribute", "setKey", "java.lang.String", "=\""}, {"org.jsoup.nodes.Attribute", "html", ""}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("=\"", String.valueOf(actual));
  assertEquals("receiver state after the call", "=\" {getKey==\", getValue=}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput233() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Attribute", "org.jsoup.nodes.Attribute", "html", new String[]{}, new String[]{}, false, 12, new String[][]{{"org.jsoup.nodes.Attribute", "html", ""}, {"org.jsoup.nodes.Attribute", "setValue", "java.lang.String", "D1"}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("a=\"D1\"", String.valueOf(actual));
  assertEquals("receiver state after the call", "a=\"D1\" {getKey=a, getValue=D1}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput234() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Attribute", "org.jsoup.nodes.Attribute", "shouldCollapseAttribute", new String[]{"java.lang.String", "java.lang.String", "org.jsoup.nodes.Document$OutputSettings"}, new String[]{"-/.01.242c45{allowfullscreen", "tutofoc", "<sample:0>"}, true, 0, null, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput235() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Attribute", "org.jsoup.nodes.Attribute", "equals", new String[]{"java.lang.Object"}, new String[]{"<s:>"}, false);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "a=\"0\" {getKey=a, getValue=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput236() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Attribute", "org.jsoup.nodes.Attribute", "equals", new String[]{"java.lang.Object"}, new String[]{"<i:-2147483648>"}, false, 0, null, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "a=\"0\" {getKey=a, getValue=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput237() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Attribute", "org.jsoup.nodes.Attribute", "equals", new String[]{"java.lang.Object"}, new String[]{"<i:0>"}, false, 1, new String[][]{});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "0=\"sample\" {getKey=0, getValue=sample}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput238() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Attribute", "org.jsoup.nodes.Attribute", "equals", new String[]{"java.lang.Object"}, new String[]{"<sample:0>"}, false, 14, new String[][]{{"org.jsoup.nodes.Attribute", "toString", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{\"a\":1}=\" x \t y \" {getKey={\"a\":1}, getValue= x \t y }", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput239() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Attribute", "org.jsoup.nodes.Attribute", "equals", new String[]{"java.lang.Object"}, new String[]{"<sample:0>"}, false, 14, new String[][]{{"org.jsoup.nodes.Attribute", "shouldCollapseAttribute", "org.jsoup.nodes.Document$OutputSettings", "<sample:6>"}, {"org.jsoup.nodes.Attribute", "setKey", "java.lang.String", "data-"}, {"org.jsoup.nodes.Attribute", "toString", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "data-=\" x \t y \" {getKey=data-, getValue= x \t y }", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput240() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Attribute", "org.jsoup.nodes.Attribute", "equals", new String[]{"java.lang.Object"}, new String[]{"<sample:0>"}, false, 14, new String[][]{{"org.jsoup.nodes.Attribute", "shouldCollapseAttribute", "org.jsoup.nodes.Document$OutputSettings", "<sample:6>"}, {"org.jsoup.nodes.Attribute", "setKey", "java.lang.String", "data--"}, {"org.jsoup.nodes.Attribute", "toString", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "data--=\" x \t y \" {getKey=data--, getValue= x \t y }", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput241() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Attribute", "org.jsoup.nodes.Attribute", "html", new String[]{}, new String[]{}, false, 1, new String[][]{{"org.jsoup.nodes.Attribute", "setKey", "java.lang.String", "--1"}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("--1=\"sample\"", String.valueOf(actual));
  assertEquals("receiver state after the call", "--1=\"sample\" {getKey=--1, getValue=sample}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput242() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Attribute", "org.jsoup.nodes.Attribute", "html", new String[]{}, new String[]{}, false, 1, new String[][]{}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("0=\"sample\"", String.valueOf(actual));
  assertEquals("receiver state after the call", "0=\"sample\" {getKey=0, getValue=sample}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput243() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Attribute", "org.jsoup.nodes.Attribute", "html", new String[]{}, new String[]{}, false, 2, new String[][]{}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("sample=\"\"", String.valueOf(actual));
  assertEquals("receiver state after the call", "sample=\"\" {getKey=sample, getValue=}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput244() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Attribute", "org.jsoup.nodes.Attribute", "html", new String[]{}, new String[]{}, false, 3, new String[][]{}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("null", String.valueOf(actual));
  assertEquals("receiver state after the call", "null {getKey=null, getValue=}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput245() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Attribute", "org.jsoup.nodes.Attribute", "html", new String[]{}, new String[]{}, false, 4, new String[][]{}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("<a><b>t</b></a>=\"{&quot;a&quot;:1}\"", String.valueOf(actual));
  assertEquals("receiver state after the call", "<a><b>t</b></a>=\"{&quot;a&quot;:1}\" {getKey=<a><b>t</b></a>, getValue={\"a\":1}}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput246() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Attribute", "org.jsoup.nodes.Attribute", "html", new String[]{}, new String[]{}, false, 6, new String[][]{}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("a=\"0\"", String.valueOf(actual));
  assertEquals("receiver state after the call", "a=\"0\" {getKey=a, getValue=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput247() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Attribute", "org.jsoup.nodes.Attribute", "html", new String[]{}, new String[]{}, false, 10, new String[][]{}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("{\"a\":1}=\" x \t y \"", String.valueOf(actual));
  assertEquals("receiver state after the call", "{\"a\":1}=\" x \t y \" {getKey={\"a\":1}, getValue= x \t y }", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput248() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jsoup.nodes.Attribute", "org.jsoup.nodes.Attribute", "setKey", new String[]{"java.lang.String"}, new String[]{"\n"}, false); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput249() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Attribute", "org.jsoup.nodes.Attribute", "createFromEncoded", new String[]{"java.lang.String", "java.lang.String"}, new String[]{"checked", "1.1234567890123456"}, true);
  assertNotNull(actual);
  assertEquals("org.jsoup.nodes.Attribute", actual.getClass().getName());
  assertEquals("checked=\"1.1234567890123456\" {getKey=checked, getValue=1.1234567890123456}", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput250() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jsoup.nodes.Attribute", "org.jsoup.nodes.Attribute", "createFromEncoded", new String[]{"java.lang.String", "java.lang.String"}, new String[]{"12345678>90123\"5678901234567890", ""}, true, 0, null, 2), new String[][]{{"setValue", "java.lang.String", "1"}, {"setValue", "java.lang.String", "5"}, {"getKey", "", "1"}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("12345678>90123\"5678901234567890", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput251() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Attribute", "org.jsoup.nodes.Attribute", "getValue", new String[]{}, new String[]{}, false, 21, new String[][]{{"org.jsoup.nodes.Attribute", "html", ""}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("sample", String.valueOf(actual));
  assertEquals("receiver state after the call", "0=\"sample\" {getKey=0, getValue=sample}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput252() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Attribute", "org.jsoup.nodes.Attribute", "getValue", new String[]{}, new String[]{}, false, 22, new String[][]{{"org.jsoup.nodes.Attribute", "html", ""}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("\n", String.valueOf(actual));
  assertEquals("receiver state after the call", "line1\n\nline3=\"\n\" {getKey=line1\n\nline3, getValue=\n}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput253() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Attribute", "org.jsoup.nodes.Attribute", "getValue", new String[]{}, new String[]{}, false, 23, new String[][]{{"org.jsoup.nodes.Attribute", "html", ""}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("", String.valueOf(actual));
  assertEquals("receiver state after the call", "null {getKey=null, getValue=}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput254() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Attribute", "org.jsoup.nodes.Attribute", "getValue", new String[]{}, new String[]{}, false, 24, new String[][]{{"org.jsoup.nodes.Attribute", "html", ""}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "a=\"0\" {getKey=a, getValue=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput255() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Attribute", "org.jsoup.nodes.Attribute", "getValue", new String[]{}, new String[]{}, false, 24, new String[][]{{"org.jsoup.nodes.Attribute", "setValue", "java.lang.String", "formnovalidate"}, {"org.jsoup.nodes.Attribute", "html", ""}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("formnovalidate", String.valueOf(actual));
  assertEquals("receiver state after the call", "a=\"formnovalidate\" {getKey=a, getValue=formnovalidate}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput256() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Attribute", "org.jsoup.nodes.Attribute", "getValue", new String[]{}, new String[]{}, false, 12, new String[][]{{"org.jsoup.nodes.Attribute", "setValue", "java.lang.String", "formnovalidate"}, {"org.jsoup.nodes.Attribute", "setValue", "java.lang.String", ""}, {"org.jsoup.nodes.Attribute", "html", ""}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("", String.valueOf(actual));
  assertEquals("receiver state after the call", "a=\"\" {getKey=a, getValue=}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput257() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Attribute", "org.jsoup.nodes.Attribute", "getValue", new String[]{}, new String[]{}, false, 13, new String[][]{{"org.jsoup.nodes.Attribute", "setValue", "java.lang.String", "formnovalidate"}, {"org.jsoup.nodes.Attribute", "html", ""}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("formnovalidate", String.valueOf(actual));
  assertEquals("receiver state after the call", "0=\"formnovalidate\" {getKey=0, getValue=formnovalidate}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput258() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Attribute", "org.jsoup.nodes.Attribute", "getValue", new String[]{}, new String[]{}, false, 14, new String[][]{{"org.jsoup.nodes.Attribute", "setValue", "java.lang.String", "formnovalidate"}, {"org.jsoup.nodes.Attribute", "html", ""}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("formnovalidate", String.valueOf(actual));
  assertEquals("receiver state after the call", "{\"a\":1}=\"formnovalidate\" {getKey={\"a\":1}, getValue=formnovalidate}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput259() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Attribute", "org.jsoup.nodes.Attribute", "getValue", new String[]{}, new String[]{}, false, 14, new String[][]{{"org.jsoup.nodes.Attribute", "setValue", "java.lang.String", "formovalidate"}, {"org.jsoup.nodes.Attribute", "html", ""}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("formovalidate", String.valueOf(actual));
  assertEquals("receiver state after the call", "{\"a\":1}=\"formovalidate\" {getKey={\"a\":1}, getValue=formovalidate}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput260() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Attribute", "org.jsoup.nodes.Attribute", "getValue", new String[]{}, new String[]{}, false, 15, new String[][]{{"org.jsoup.nodes.Attribute", "setValue", "java.lang.String", "formovalidate"}, {"org.jsoup.nodes.Attribute", "html", ""}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("formovalidate", String.valueOf(actual));
  assertEquals("receiver state after the call", "null=\"formovalidate\" {getKey=null, getValue=formovalidate}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput261() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Attribute", "org.jsoup.nodes.Attribute", "getValue", new String[]{}, new String[]{}, false, 15, new String[][]{{"org.jsoup.nodes.Attribute", "setValue", "java.lang.String", "formovalidate"}, {"org.jsoup.nodes.Attribute", "html", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("formovalidate", String.valueOf(actual));
  assertEquals("receiver state after the call", "null=\"formovalidate\" {getKey=null, getValue=formovalidate}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput262() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Attribute", "org.jsoup.nodes.Attribute", "getValue", new String[]{}, new String[]{}, false, 4, new String[][]{}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("{\"a\":1}", String.valueOf(actual));
  assertEquals("receiver state after the call", "<a><b>t</b></a>=\"{&quot;a&quot;:1}\" {getKey=<a><b>t</b></a>, getValue={\"a\":1}}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput263() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Attribute", "org.jsoup.nodes.Attribute", "getValue", new String[]{}, new String[]{}, false, 10, new String[][]{}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals(" x \t y ", String.valueOf(actual));
  assertEquals("receiver state after the call", "{\"a\":1}=\" x \t y \" {getKey={\"a\":1}, getValue= x \t y }", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput264() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Attribute", "org.jsoup.nodes.Attribute", "clone", new String[]{}, new String[]{}, false, 0, null, 1);
  assertNotNull(actual);
  assertEquals("org.jsoup.nodes.Attribute", actual.getClass().getName());
  assertEquals("a=\"0\" {getKey=a, getValue=0}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "a=\"0\" {getKey=a, getValue=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput265() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Attribute", "org.jsoup.nodes.Attribute", "clone", new String[]{}, new String[]{}, false, 1, new String[][]{}, 1);
  assertNotNull(actual);
  assertEquals("org.jsoup.nodes.Attribute", actual.getClass().getName());
  assertEquals("0=\"sample\" {getKey=0, getValue=sample}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "0=\"sample\" {getKey=0, getValue=sample}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput266() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Attribute", "org.jsoup.nodes.Attribute", "clone", new String[]{}, new String[]{}, false, 2, new String[][]{}, 1);
  assertNotNull(actual);
  assertEquals("org.jsoup.nodes.Attribute", actual.getClass().getName());
  assertEquals("sample=\"\" {getKey=sample, getValue=}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "sample=\"\" {getKey=sample, getValue=}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput267() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Attribute", "org.jsoup.nodes.Attribute", "clone", new String[]{}, new String[]{}, false, 4, new String[][]{{"org.jsoup.nodes.Attribute", "getKey", ""}}, 1);
  assertNotNull(actual);
  assertEquals("org.jsoup.nodes.Attribute", actual.getClass().getName());
  assertEquals("<a><b>t</b></a>=\"{&quot;a&quot;:1}\" {getKey=<a><b>t</b></a>, getValue={\"a\":1}}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "<a><b>t</b></a>=\"{&quot;a&quot;:1}\" {getKey=<a><b>t</b></a>, getValue={\"a\":1}}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput268() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Attribute", "org.jsoup.nodes.Attribute", "hashCode", new String[]{}, new String[]{}, false, 2, new String[][]{}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("1864843158", String.valueOf(actual));
  assertEquals("receiver state after the call", "sample=\"\" {getKey=sample, getValue=}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput269() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Attribute", "org.jsoup.nodes.Attribute", "hashCode", new String[]{}, new String[]{}, false, 9, new String[][]{{"org.jsoup.nodes.Attribute", "setKey", "java.lang.String", "TITLE"}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("1565168242", String.valueOf(actual));
  assertEquals("receiver state after the call", "TITLE=\"sample\" {getKey=TITLE, getValue=sample}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput270() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Attribute", "org.jsoup.nodes.Attribute", "hashCode", new String[]{}, new String[]{}, false, 9, new String[][]{{"org.jsoup.nodes.Attribute", "setKey", "java.lang.String", "TILE"}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("-829849412", String.valueOf(actual));
  assertEquals("receiver state after the call", "TILE=\"sample\" {getKey=TILE, getValue=sample}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput271() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Attribute", "org.jsoup.nodes.Attribute", "html", new String[]{"java.lang.Appendable", "org.jsoup.nodes.Document$OutputSettings"}, new String[]{"<sample:2>", "<sample:5>"}, false, 2, new String[][]{{"org.jsoup.nodes.Attribute", "setValue", "java.lang.String", "abAc"}}, 3);
  assertNull(actual);
  assertEquals("receiver state after the call", "sample=\"abAc\" {getKey=sample, getValue=abAc}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput272() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Attribute", "org.jsoup.nodes.Attribute", "html", new String[]{"java.lang.Appendable", "org.jsoup.nodes.Document$OutputSettings"}, new String[]{"<sample:4>", "<sample:5>"}, false, 2, new String[][]{}, 3);
  assertNull(actual);
  assertEquals("receiver state after the call", "sample=\"\" {getKey=sample, getValue=}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput273() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Attribute", "org.jsoup.nodes.Attribute", "html", new String[]{"java.lang.Appendable", "org.jsoup.nodes.Document$OutputSettings"}, new String[]{"<sample:4>", "<sample:4>"}, false, 3, new String[][]{}, 3);
  assertNull(actual);
  assertEquals("receiver state after the call", "null {getKey=null, getValue=}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput274() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Attribute", "org.jsoup.nodes.Attribute", "isBooleanAttribute", new String[]{"java.lang.String"}, new String[]{"i"}, true, 0, null, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput275() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Attribute", "org.jsoup.nodes.Attribute", "toString", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.jsoup.nodes.Attribute", "setValue", "java.lang.String", "1.5"}, {"org.jsoup.nodes.Attribute", "clone", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("a=\"1.5\"", String.valueOf(actual));
  assertEquals("receiver state after the call", "a=\"1.5\" {getKey=a, getValue=1.5}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput276() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Attribute", "org.jsoup.nodes.Attribute", "toString", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.jsoup.nodes.Attribute", "setValue", "java.lang.String", "1.5"}, {"org.jsoup.nodes.Attribute", "setKey", "java.lang.String", "+1"}, {"org.jsoup.nodes.Attribute", "clone", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("+1=\"1.5\"", String.valueOf(actual));
  assertEquals("receiver state after the call", "+1=\"1.5\" {getKey=+1, getValue=1.5}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput277() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Attribute", "org.jsoup.nodes.Attribute", "toString", new String[]{}, new String[]{}, false, 1, new String[][]{{"org.jsoup.nodes.Attribute", "setValue", "java.lang.String", "1."}, {"org.jsoup.nodes.Attribute", "setKey", "java.lang.String", "+1"}, {"org.jsoup.nodes.Attribute", "clone", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("+1=\"1.\"", String.valueOf(actual));
  assertEquals("receiver state after the call", "+1=\"1.\" {getKey=+1, getValue=1.}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput278() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Attribute", "org.jsoup.nodes.Attribute", "toString", new String[]{}, new String[]{}, false, 7, new String[][]{{"org.jsoup.nodes.Attribute", "setValue", "java.lang.String", "1."}, {"org.jsoup.nodes.Attribute", "setKey", "java.lang.String", "+1"}, {"org.jsoup.nodes.Attribute", "clone", ""}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("+1=\"1.\"", String.valueOf(actual));
  assertEquals("receiver state after the call", "+1=\"1.\" {getKey=+1, getValue=1.}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput279() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Attribute", "org.jsoup.nodes.Attribute", "toString", new String[]{}, new String[]{}, false, 12, new String[][]{{"org.jsoup.nodes.Attribute", "setValue", "java.lang.String", "1."}, {"org.jsoup.nodes.Attribute", "setKey", "java.lang.String", "+E1"}, {"org.jsoup.nodes.Attribute", "clone", ""}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("+E1=\"1.\"", String.valueOf(actual));
  assertEquals("receiver state after the call", "+E1=\"1.\" {getKey=+E1, getValue=1.}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput280() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Attribute", "org.jsoup.nodes.Attribute", "html", new String[]{}, new String[]{}, false, 10, new String[][]{{"org.jsoup.nodes.Attribute", "isDataAttribute", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("{\"a\":1}=\" x \t y \"", String.valueOf(actual));
  assertEquals("receiver state after the call", "{\"a\":1}=\" x \t y \" {getKey={\"a\":1}, getValue= x \t y }", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput281() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Attribute", "org.jsoup.nodes.Attribute", "html", new String[]{}, new String[]{}, false, 10, new String[][]{{"org.jsoup.nodes.Attribute", "isDataAttribute", ""}, {"org.jsoup.nodes.Attribute", "setValue", "java.lang.String", "declare"}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("{\"a\":1}=\"declare\"", String.valueOf(actual));
  assertEquals("receiver state after the call", "{\"a\":1}=\"declare\" {getKey={\"a\":1}, getValue=declare}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput282() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Attribute", "org.jsoup.nodes.Attribute", "isBooleanAttribute", new String[]{"java.lang.String"}, new String[]{"1.25"}, true, 0, null, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput283() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jsoup.nodes.Attribute", "org.jsoup.nodes.Attribute", "createFromEncoded", new String[]{"java.lang.String", "java.lang.String"}, new String[]{"` ", "202z1-01-h02true1.1234567"}, true, 0, null, 2), new String[][]{{"clone", "", "0"}, {"getValue", "", "5"}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("202z1-01-h02true1.1234567", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput284() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jsoup.nodes.Attribute", "org.jsoup.nodes.Attribute", "createFromEncoded", new String[]{"java.lang.String", "java.lang.String"}, new String[]{"` ", "2082z1-01-h02true1.1234567"}, true, 0, null, 2), new String[][]{{"clone", "", "0"}, {"getValue", "", "5"}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("2082z1-01-h02true1.1234567", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput285() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Attribute", "org.jsoup.nodes.Attribute", "shouldCollapseAttribute", new String[]{"org.jsoup.nodes.Document$OutputSettings"}, new String[]{"<sample:2>"}, false, 1, new String[][]{{"org.jsoup.nodes.Attribute", "setKey", "java.lang.String", "2020-01-01"}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "2020-01-01=\"sample\" {getKey=2020-01-01, getValue=sample}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput286() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Attribute", "org.jsoup.nodes.Attribute", "shouldCollapseAttribute", new String[]{"org.jsoup.nodes.Document$OutputSettings"}, new String[]{"<sample:3>"}, false, 5, new String[][]{{"org.jsoup.nodes.Attribute", "setKey", "java.lang.String", "1E-5"}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "1E-5=\"sample\" {getKey=1E-5, getValue=sample}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput287() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Attribute", "org.jsoup.nodes.Attribute", "shouldCollapseAttribute", new String[]{"org.jsoup.nodes.Document$OutputSettings"}, new String[]{"<sample:3>"}, false, 5, new String[][]{{"org.jsoup.nodes.Attribute", "setKey", "java.lang.String", "2E-5"}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "2E-5=\"sample\" {getKey=2E-5, getValue=sample}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput288() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Attribute", "org.jsoup.nodes.Attribute", "html", new String[]{"java.lang.String", "java.lang.String", "java.lang.Appendable", "org.jsoup.nodes.Document$OutputSettings"}, new String[]{"0x123456789", "abc", "<sample:3>", "<sample:1>"}, true, 0, null, 2);
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput289() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jsoup.nodes.Attribute", "org.jsoup.nodes.Attribute", "clone", new String[]{}, new String[]{}, false, 6, new String[][]{{"org.jsoup.nodes.Attribute", "setKey", "java.lang.String", "itemscope"}}, 2), new String[][]{{"clone", "", "2"}, {"getKey", "", "5"}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("itemscope", String.valueOf(actual));
  assertEquals("receiver state after the call", "itemscope=\"0\" {getKey=itemscope, getValue=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput290() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jsoup.nodes.Attribute", "org.jsoup.nodes.Attribute", "clone", new String[]{}, new String[]{}, false, 7, new String[][]{{"org.jsoup.nodes.Attribute", "setKey", "java.lang.String", "itemscope"}, {"org.jsoup.nodes.Attribute", "html", ""}}, 2), new String[][]{{"clone", "", "2"}, {"getKey", "", "5"}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("itemscope", String.valueOf(actual));
  assertEquals("receiver state after the call", "itemscope {getKey=itemscope, getValue=}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput291() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jsoup.nodes.Attribute", "org.jsoup.nodes.Attribute", "clone", new String[]{}, new String[]{}, false, 8, new String[][]{{"org.jsoup.nodes.Attribute", "setKey", "java.lang.String", "itemscope"}, {"org.jsoup.nodes.Attribute", "html", ""}, {"org.jsoup.nodes.Attribute", "shouldCollapseAttribute", "org.jsoup.nodes.Document$OutputSettings", "<sample:7>"}}, 2), new String[][]{{"clone", "", "2"}, {"getKey", "", "5"}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("itemscope", String.valueOf(actual));
  assertEquals("receiver state after the call", "itemscope=\"{&quot;a&quot;:1}\" {getKey=itemscope, getValue={\"a\":1}}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput292() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jsoup.nodes.Attribute", "org.jsoup.nodes.Attribute", "clone", new String[]{}, new String[]{}, false, 8, new String[][]{{"org.jsoup.nodes.Attribute", "setKey", "java.lang.String", "itemscope"}, {"org.jsoup.nodes.Attribute", "html", ""}, {"org.jsoup.nodes.Attribute", "shouldCollapseAttribute", "org.jsoup.nodes.Document$OutputSettings", "<sample:7>"}}), new String[][]{{"clone", "", "2"}, {"getKey", "", "5"}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("itemscope", String.valueOf(actual));
  assertEquals("receiver state after the call", "itemscope=\"{&quot;a&quot;:1}\" {getKey=itemscope, getValue={\"a\":1}}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput293() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jsoup.nodes.Attribute", "org.jsoup.nodes.Attribute", "clone", new String[]{}, new String[]{}, false, 9, new String[][]{{"org.jsoup.nodes.Attribute", "setKey", "java.lang.String", "itemscope"}, {"org.jsoup.nodes.Attribute", "html", ""}, {"org.jsoup.nodes.Attribute", "shouldCollapseAttribute", "org.jsoup.nodes.Document$OutputSettings", "<sample:7>"}}), new String[][]{{"clone", "", "2"}, {"getKey", "", "5"}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("itemscope", String.valueOf(actual));
  assertEquals("receiver state after the call", "itemscope=\"sample\" {getKey=itemscope, getValue=sample}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput294() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Attribute", "org.jsoup.nodes.Attribute", "shouldCollapseAttribute", new String[]{"org.jsoup.nodes.Document$OutputSettings"}, new String[]{"<sample:4>"}, false, 5, new String[][]{{"org.jsoup.nodes.Attribute", "toString", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "0=\"sample\" {getKey=0, getValue=sample}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput295() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Attribute", "org.jsoup.nodes.Attribute", "shouldCollapseAttribute", new String[]{"org.jsoup.nodes.Document$OutputSettings"}, new String[]{"<sample:6>"}, false, 4, new String[][]{{"org.jsoup.nodes.Attribute", "html", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "<a><b>t</b></a>=\"{&quot;a&quot;:1}\" {getKey=<a><b>t</b></a>, getValue={\"a\":1}}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput296() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Attribute", "org.jsoup.nodes.Attribute", "shouldCollapseAttribute", new String[]{"org.jsoup.nodes.Document$OutputSettings"}, new String[]{"<sample:3>"}, false, 4, new String[][]{}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "<a><b>t</b></a>=\"{&quot;a&quot;:1}\" {getKey=<a><b>t</b></a>, getValue={\"a\":1}}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput297() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jsoup.nodes.Attribute", "org.jsoup.nodes.Attribute", "shouldCollapseAttribute", new String[]{"org.jsoup.nodes.Document$OutputSettings"}, new String[]{"<null>"}, false, 4, new String[][]{}, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput298() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Attribute", "org.jsoup.nodes.Attribute", "setValue", new String[]{"java.lang.String"}, new String[]{".5"}, false, 2, new String[][]{{"org.jsoup.nodes.Attribute", "equals", "java.lang.Object", "<s:key>"}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("", String.valueOf(actual));
  assertEquals("receiver state after the call", "sample=\".5\" {getKey=sample, getValue=.5}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput299() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Attribute", "org.jsoup.nodes.Attribute", "setValue", new String[]{"java.lang.String"}, new String[]{"H5"}, false, 2, new String[][]{{"org.jsoup.nodes.Attribute", "equals", "java.lang.Object", "<s:key>"}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("", String.valueOf(actual));
  assertEquals("receiver state after the call", "sample=\"H5\" {getKey=sample, getValue=H5}", SearchInputFactory_scaffolding.receiverState());
 }
}
