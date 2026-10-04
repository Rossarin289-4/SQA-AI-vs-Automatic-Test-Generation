package generated.algorithm;

import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;
import static org.junit.Assert.*;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class SimulatedAnnealingGeneratedTest {
 @Test(timeout = 20000)
 public void generatedInput000() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Attribute", "org.jsoup.nodes.Attribute", "equals", new String[]{"java.lang.Object"}, new String[]{"<null>"}, false, 5, new String[][]{{"org.jsoup.nodes.Attribute", "setKey", "java.lang.String", "formnovalidate"}, {"org.jsoup.nodes.Attribute", "getValue", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "formnovalidate=\"sample\" {getKey=formnovalidate, getValue=sample}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput001() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Attribute", "org.jsoup.nodes.Attribute", "isDataAttribute", new String[]{}, new String[]{}, false, 2, new String[][]{{"org.jsoup.nodes.Attribute", "clone", ""}, {"org.jsoup.nodes.Attribute", "isBooleanAttribute", ""}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "sample=\"\" {getKey=sample, getValue=}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput002() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Attribute", "org.jsoup.nodes.Attribute", "toString", new String[]{}, new String[]{}, false, 23, new String[][]{{"org.jsoup.nodes.Attribute", "setKey", "java.lang.String", "a\"hsa"}, {"org.jsoup.nodes.Attribute", "equals", "java.lang.Object", "<d:1.5>"}, {"org.jsoup.nodes.Attribute", "isBooleanAttribute", ""}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("a\"hsa", String.valueOf(actual));
  assertEquals("receiver state after the call", "a\"hsa {getKey=a\"hsa, getValue=null}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput003() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Attribute", "org.jsoup.nodes.Attribute", "isBooleanAttribute", new String[]{}, new String[]{}, false, 20, new String[][]{{"org.jsoup.nodes.Attribute", "setKey", "java.lang.String", "muted"}, {"org.jsoup.nodes.Attribute", "clone", ""}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
  assertEquals("receiver state after the call", "muted=\"line1\n\nline3\" {getKey=muted, getValue=line1\n\nline3}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput004() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Attribute", "org.jsoup.nodes.Attribute", "shouldCollapseAttribute", new String[]{"org.jsoup.nodes.Document$OutputSettings"}, new String[]{"<sample:8>"}, false, 11, new String[][]{{"org.jsoup.nodes.Attribute", "hashCode", ""}, {"org.jsoup.nodes.Attribute", "getKey", ""}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
  assertEquals("receiver state after the call", "null {getKey=null, getValue=null}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput005() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Attribute", "org.jsoup.nodes.Attribute", "isDataAttribute", new String[]{"java.lang.String"}, new String[]{"data-"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput006() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Attribute", "org.jsoup.nodes.Attribute", "isDataAttribute", new String[]{"java.lang.String"}, new String[]{"data-1.12345678"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput007() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Attribute", "org.jsoup.nodes.Attribute", "hashCode", new String[]{}, new String[]{}, false, 5, new String[][]{{"org.jsoup.nodes.Attribute", "setValue", "java.lang.String", "c2:<48:30"}, {"org.jsoup.nodes.Attribute", "setKey", "java.lang.String", "<a>b=/a>"}, {"org.jsoup.nodes.Attribute", "isDataAttribute", ""}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("-1665092566", String.valueOf(actual));
  assertEquals("receiver state after the call", "<a>b=/a>=\"c2:<48:30\" {getKey=<a>b=/a>, getValue=c2:<48:30}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput008() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Attribute", "org.jsoup.nodes.Attribute", "shouldCollapseAttribute", new String[]{"java.lang.String", "java.lang.String", "org.jsoup.nodes.Document$OutputSettings"}, new String[]{"muted", "muted", "<sample:5>"}, true, 0, null, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput009() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Attribute", "org.jsoup.nodes.Attribute", "setKey", new String[]{"java.lang.String"}, new String[]{"0xFFFFFFFF"}, false, 3, new String[][]{{"org.jsoup.nodes.Attribute", "setValue", "java.lang.String", "P1H"}}, 2);
  assertNull(actual);
  assertEquals("receiver state after the call", "0xFFFFFFFF {getKey=0xFFFFFFFF, getValue=null}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput010() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jsoup.nodes.Attribute", "org.jsoup.nodes.Attribute", "setKey", new String[]{"java.lang.String"}, new String[]{"\n"}, false, 3, new String[][]{{"org.jsoup.nodes.Attribute", "setValue", "java.lang.String", "P1H"}, {"org.jsoup.nodes.Attribute", "isDataAttribute", ""}}, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput011() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Attribute", "org.jsoup.nodes.Attribute", "setKey", new String[]{"java.lang.String"}, new String[]{"0xFFFFFFFF"}, false, 3, new String[][]{{"org.jsoup.nodes.Attribute", "setValue", "java.lang.String", "P1H"}, {"org.jsoup.nodes.Attribute", "isDataAttribute", ""}, {"org.jsoup.nodes.Attribute", "hashCode", ""}}, 2);
  assertNull(actual);
  assertEquals("receiver state after the call", "0xFFFFFFFF {getKey=0xFFFFFFFF, getValue=null}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput012() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Attribute", "org.jsoup.nodes.Attribute", "setKey", new String[]{"java.lang.String"}, new String[]{"0xFFGFFFFF"}, false, 3, new String[][]{{"org.jsoup.nodes.Attribute", "setValue", "java.lang.String", "P1H"}, {"org.jsoup.nodes.Attribute", "isDataAttribute", ""}, {"org.jsoup.nodes.Attribute", "hashCode", ""}}, 2);
  assertNull(actual);
  assertEquals("receiver state after the call", "0xFFGFFFFF {getKey=0xFFGFFFFF, getValue=null}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput013() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Attribute", "org.jsoup.nodes.Attribute", "setKey", new String[]{"java.lang.String"}, new String[]{"0xFFGFFF\u00e9F"}, false, 3, new String[][]{{"org.jsoup.nodes.Attribute", "isDataAttribute", ""}, {"org.jsoup.nodes.Attribute", "hashCode", ""}}, 2);
  assertNull(actual);
  assertEquals("receiver state after the call", "0xFFGFFF\u00e9F {getKey=0xFFGFFF\u00e9F, getValue=null}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput014() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Attribute", "org.jsoup.nodes.Attribute", "setKey", new String[]{"java.lang.String"}, new String[]{"null"}, false, 3, new String[][]{{"org.jsoup.nodes.Attribute", "isDataAttribute", ""}, {"org.jsoup.nodes.Attribute", "hashCode", ""}}, 2);
  assertNull(actual);
  assertEquals("receiver state after the call", "null {getKey=null, getValue=null}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput015() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Attribute", "org.jsoup.nodes.Attribute", "setKey", new String[]{"java.lang.String"}, new String[]{"nukl"}, false, 3, new String[][]{{"org.jsoup.nodes.Attribute", "isDataAttribute", ""}, {"org.jsoup.nodes.Attribute", "hashCode", ""}}, 2);
  assertNull(actual);
  assertEquals("receiver state after the call", "nukl {getKey=nukl, getValue=null}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput016() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Attribute", "org.jsoup.nodes.Attribute", "setKey", new String[]{"java.lang.String"}, new String[]{"ismap"}, false, 3, new String[][]{{"org.jsoup.nodes.Attribute", "equals", "java.lang.Object", "<i:0>"}, {"org.jsoup.nodes.Attribute", "isDataAttribute", ""}, {"org.jsoup.nodes.Attribute", "hashCode", ""}}, 2);
  assertNull(actual);
  assertEquals("receiver state after the call", "ismap {getKey=ismap, getValue=null}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput017() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jsoup.nodes.Attribute", "org.jsoup.nodes.Attribute", "createFromEncoded", new String[]{"java.lang.String", "java.lang.String"}, new String[]{"0x123456789", "5."}, true, 0, null, 3), new String[][]{{"getKey", "", "1"}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("0x123456789", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput018() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jsoup.nodes.Attribute", "org.jsoup.nodes.Attribute", "createFromEncoded", new String[]{"java.lang.String", "java.lang.String"}, new String[]{"0x1234+6789", "5."}, true, 0, null, 3), new String[][]{{"getKey", "", "1"}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("0x1234+6789", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput019() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jsoup.nodes.Attribute", "org.jsoup.nodes.Attribute", "createFromEncoded", new String[]{"java.lang.String", "java.lang.String"}, new String[]{"0x1234*5789a,b,d", "2020-02-30T25:61:61"}, true, 0, null, 2), new String[][]{{"getKey", "", "1"}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("0x1234*5789a,b,d", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput020() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jsoup.nodes.Attribute", "org.jsoup.nodes.Attribute", "createFromEncoded", new String[]{"java.lang.String", "java.lang.String"}, new String[]{"0x1224*5789a,b,d", "220-02-30T25:61:61"}, true, 0, null, 2), new String[][]{{"getKey", "", "1"}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("0x1224*5789a,b,d", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput021() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jsoup.nodes.Attribute", "org.jsoup.nodes.Attribute", "createFromEncoded", new String[]{"java.lang.String", "java.lang.String"}, new String[]{"0x1224*5789a,b,d", "220-02-30T25:61:61"}, true, 0, null, 2), new String[][]{{"clone", "", "1"}});
  assertNotNull(actual);
  assertEquals("org.jsoup.nodes.Attribute", actual.getClass().getName());
  assertEquals("0x1224*5789a,b,d=\"220-02-30T25:61:61\" {getKey=0x1224*5789a,b,d, getValue=220-02-30T25:61:61}", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput022() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Attribute", "org.jsoup.nodes.Attribute", "equals", new String[]{"java.lang.Object"}, new String[]{"<b:true>"}, false, 1, new String[][]{}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "0=\"sample\" {getKey=0, getValue=sample}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput023() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Attribute", "org.jsoup.nodes.Attribute", "isBooleanAttribute", new String[]{"java.lang.String"}, new String[]{"1.5"}, true, 0, null, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput024() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Attribute", "org.jsoup.nodes.Attribute", "isDataAttribute", new String[]{"java.lang.String"}, new String[]{"2+03001-011"}, true, 0, null, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput025() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Attribute", "org.jsoup.nodes.Attribute", "isDataAttribute", new String[]{}, new String[]{}, false, 1, new String[][]{}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "0=\"sample\" {getKey=0, getValue=sample}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput026() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Attribute", "org.jsoup.nodes.Attribute", "isDataAttribute", new String[]{}, new String[]{}, false, 2, new String[][]{}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "sample=\"\" {getKey=sample, getValue=}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput027() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jsoup.nodes.Attribute", "org.jsoup.nodes.Attribute", "isDataAttribute", new String[]{}, new String[]{}, false, 3, new String[][]{{"org.jsoup.nodes.Attribute", "equals", "java.lang.Object", "<i:-1>"}}, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput028() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Attribute", "org.jsoup.nodes.Attribute", "isDataAttribute", new String[]{}, new String[]{}, false, 4, new String[][]{{"org.jsoup.nodes.Attribute", "equals", "java.lang.Object", "<i:-1>"}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "<a><b>t</b></a>=\"{&quot;a&quot;:1}\" {getKey=<a><b>t</b></a>, getValue={\"a\":1}}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput029() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Attribute", "org.jsoup.nodes.Attribute", "isDataAttribute", new String[]{}, new String[]{}, false, 6, new String[][]{{"org.jsoup.nodes.Attribute", "hashCode", ""}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "a=\"0\" {getKey=a, getValue=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput030() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Attribute", "org.jsoup.nodes.Attribute", "isDataAttribute", new String[]{}, new String[]{}, false, 14, new String[][]{{"org.jsoup.nodes.Attribute", "hashCode", ""}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{\"a\":1}=\" x \t y \" {getKey={\"a\":1}, getValue= x \t y }", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput031() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Attribute", "org.jsoup.nodes.Attribute", "setKey", new String[]{"java.lang.String"}, new String[]{"0x123456789"}, false, 0, new String[][]{{"org.jsoup.nodes.Attribute", "isBooleanAttribute", ""}}, 2);
  assertNull(actual);
  assertEquals("receiver state after the call", "0x123456789=\"0\" {getKey=0x123456789, getValue=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput032() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Attribute", "org.jsoup.nodes.Attribute", "setKey", new String[]{"java.lang.String"}, new String[]{"0x123456789"}, false, 1, new String[][]{{"org.jsoup.nodes.Attribute", "isBooleanAttribute", ""}}, 2);
  assertNull(actual);
  assertEquals("receiver state after the call", "0x123456789=\"sample\" {getKey=0x123456789, getValue=sample}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput033() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Attribute", "org.jsoup.nodes.Attribute", "shouldCollapseAttribute", new String[]{"org.jsoup.nodes.Document$OutputSettings"}, new String[]{"<sample:3>"}, false, 0, new String[][]{{"org.jsoup.nodes.Attribute", "equals", "java.lang.Object", "<s:b>"}, {"org.jsoup.nodes.Attribute", "hashCode", ""}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "a=\"0\" {getKey=a, getValue=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput034() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jsoup.nodes.Attribute", "org.jsoup.nodes.Attribute", "shouldCollapseAttribute", new String[]{"org.jsoup.nodes.Document$OutputSettings"}, new String[]{"<null>"}, false, 0, new String[][]{{"org.jsoup.nodes.Attribute", "equals", "java.lang.Object", "<s:>"}, {"org.jsoup.nodes.Attribute", "hashCode", ""}, {"org.jsoup.nodes.Attribute", "html", ""}}, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput035() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Attribute", "org.jsoup.nodes.Attribute", "equals", new String[]{"java.lang.Object"}, new String[]{"<s:>"}, false, 0, new String[][]{{"org.jsoup.nodes.Attribute", "getValue", ""}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "a=\"0\" {getKey=a, getValue=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput036() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Attribute", "org.jsoup.nodes.Attribute", "html", new String[]{"java.lang.String", "java.lang.String", "java.lang.Appendable", "org.jsoup.nodes.Document$OutputSettings"}, new String[]{"-0.0", "5.", "<sample:2>", "<sample:3>"}, true, 0, null, 1);
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput037() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Attribute", "org.jsoup.nodes.Attribute", "isBooleanAttribute", new String[]{"java.lang.String"}, new String[]{"-0.0"}, true, 0, null, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput038() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Attribute", "org.jsoup.nodes.Attribute", "isDataAttribute", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.jsoup.nodes.Attribute", "isBooleanAttribute", ""}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "a=\"0\" {getKey=a, getValue=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput039() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Attribute", "org.jsoup.nodes.Attribute", "isDataAttribute", new String[]{}, new String[]{}, false, 1, new String[][]{{"org.jsoup.nodes.Attribute", "isBooleanAttribute", ""}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "0=\"sample\" {getKey=0, getValue=sample}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput040() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jsoup.nodes.Attribute", "org.jsoup.nodes.Attribute", "isDataAttribute", new String[]{}, new String[]{}, false, 3, new String[][]{{"org.jsoup.nodes.Attribute", "clone", ""}, {"org.jsoup.nodes.Attribute", "isBooleanAttribute", ""}}, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput041() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Attribute", "org.jsoup.nodes.Attribute", "isDataAttribute", new String[]{}, new String[]{}, false, 4, new String[][]{{"org.jsoup.nodes.Attribute", "clone", ""}, {"org.jsoup.nodes.Attribute", "isBooleanAttribute", ""}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "<a><b>t</b></a>=\"{&quot;a&quot;:1}\" {getKey=<a><b>t</b></a>, getValue={\"a\":1}}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput042() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Attribute", "org.jsoup.nodes.Attribute", "isDataAttribute", new String[]{}, new String[]{}, false, 10, new String[][]{{"org.jsoup.nodes.Attribute", "clone", ""}, {"org.jsoup.nodes.Attribute", "isBooleanAttribute", ""}, {"org.jsoup.nodes.Attribute", "isBooleanAttribute", ""}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{\"a\":1}=\" x \t y \" {getKey={\"a\":1}, getValue= x \t y }", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput043() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Attribute", "org.jsoup.nodes.Attribute", "isBooleanAttribute", new String[]{}, new String[]{}, false, 0, null, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "a=\"0\" {getKey=a, getValue=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput044() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Attribute", "org.jsoup.nodes.Attribute", "isBooleanAttribute", new String[]{}, new String[]{}, false, 1, new String[][]{}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "0=\"sample\" {getKey=0, getValue=sample}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput045() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Attribute", "org.jsoup.nodes.Attribute", "shouldCollapseAttribute", new String[]{"org.jsoup.nodes.Document$OutputSettings"}, new String[]{"<sample:6>"}, false, 0, null, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "a=\"0\" {getKey=a, getValue=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput046() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Attribute", "org.jsoup.nodes.Attribute", "toString", new String[]{}, new String[]{}, false, 1, new String[][]{{"org.jsoup.nodes.Attribute", "getKey", ""}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("0=\"sample\"", String.valueOf(actual));
  assertEquals("receiver state after the call", "0=\"sample\" {getKey=0, getValue=sample}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput047() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Attribute", "org.jsoup.nodes.Attribute", "toString", new String[]{}, new String[]{}, false, 2, new String[][]{{"org.jsoup.nodes.Attribute", "getKey", ""}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("sample=\"\"", String.valueOf(actual));
  assertEquals("receiver state after the call", "sample=\"\" {getKey=sample, getValue=}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput048() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Attribute", "org.jsoup.nodes.Attribute", "toString", new String[]{}, new String[]{}, false, 3, new String[][]{{"org.jsoup.nodes.Attribute", "getKey", ""}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("null", String.valueOf(actual));
  assertEquals("receiver state after the call", "null {getKey=null, getValue=null}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput049() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Attribute", "org.jsoup.nodes.Attribute", "toString", new String[]{}, new String[]{}, false, 4, new String[][]{{"org.jsoup.nodes.Attribute", "getKey", ""}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("<a><b>t</b></a>=\"{&quot;a&quot;:1}\"", String.valueOf(actual));
  assertEquals("receiver state after the call", "<a><b>t</b></a>=\"{&quot;a&quot;:1}\" {getKey=<a><b>t</b></a>, getValue={\"a\":1}}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput050() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Attribute", "org.jsoup.nodes.Attribute", "toString", new String[]{}, new String[]{}, false, 6, new String[][]{{"org.jsoup.nodes.Attribute", "getKey", ""}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("a=\"0\"", String.valueOf(actual));
  assertEquals("receiver state after the call", "a=\"0\" {getKey=a, getValue=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput051() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Attribute", "org.jsoup.nodes.Attribute", "shouldCollapseAttribute", new String[]{"org.jsoup.nodes.Document$OutputSettings"}, new String[]{"<sample:5>"}, false, 3, new String[][]{}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
  assertEquals("receiver state after the call", "null {getKey=null, getValue=null}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput052() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Attribute", "org.jsoup.nodes.Attribute", "shouldCollapseAttribute", new String[]{"org.jsoup.nodes.Document$OutputSettings"}, new String[]{"<sample:2>"}, false, 3, new String[][]{}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
  assertEquals("receiver state after the call", "null {getKey=null, getValue=null}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput053() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jsoup.nodes.Attribute", "org.jsoup.nodes.Attribute", "isBooleanAttribute", new String[]{}, new String[]{}, false, 7, new String[][]{}, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput054() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Attribute", "org.jsoup.nodes.Attribute", "isBooleanAttribute", new String[]{}, new String[]{}, false, 8, new String[][]{}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "<a><b>t</b></a>=\"{&quot;a&quot;:1}\" {getKey=<a><b>t</b></a>, getValue={\"a\":1}}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput055() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Attribute", "org.jsoup.nodes.Attribute", "isBooleanAttribute", new String[]{}, new String[]{}, false, 9, new String[][]{}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "0=\"sample\" {getKey=0, getValue=sample}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput056() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Attribute", "org.jsoup.nodes.Attribute", "isBooleanAttribute", new String[]{}, new String[]{}, false, 10, new String[][]{}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{\"a\":1}=\" x \t y \" {getKey={\"a\":1}, getValue= x \t y }", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput057() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Attribute", "org.jsoup.nodes.Attribute", "isBooleanAttribute", new String[]{}, new String[]{}, false, 12, new String[][]{}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "a=\"0\" {getKey=a, getValue=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput058() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jsoup.nodes.Attribute", "org.jsoup.nodes.Attribute", "clone", new String[]{}, new String[]{}, false, 3, new String[][]{}, 3), new String[][]{{"clone", "", "6"}});
  assertNotNull(actual);
  assertEquals("org.jsoup.nodes.Attribute", actual.getClass().getName());
  assertEquals("null {getKey=null, getValue=null}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "null {getKey=null, getValue=null}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput059() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jsoup.nodes.Attribute", "org.jsoup.nodes.Attribute", "clone", new String[]{}, new String[]{}, false, 4, new String[][]{}, 3), new String[][]{{"clone", "", "6"}});
  assertNotNull(actual);
  assertEquals("org.jsoup.nodes.Attribute", actual.getClass().getName());
  assertEquals("<a><b>t</b></a>=\"{&quot;a&quot;:1}\" {getKey=<a><b>t</b></a>, getValue={\"a\":1}}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "<a><b>t</b></a>=\"{&quot;a&quot;:1}\" {getKey=<a><b>t</b></a>, getValue={\"a\":1}}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput060() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jsoup.nodes.Attribute", "org.jsoup.nodes.Attribute", "clone", new String[]{}, new String[]{}, false, 5, new String[][]{}, 3), new String[][]{{"clone", "", "6"}});
  assertNotNull(actual);
  assertEquals("org.jsoup.nodes.Attribute", actual.getClass().getName());
  assertEquals("0=\"sample\" {getKey=0, getValue=sample}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "0=\"sample\" {getKey=0, getValue=sample}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput061() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jsoup.nodes.Attribute", "org.jsoup.nodes.Attribute", "clone", new String[]{}, new String[]{}, false, 5, new String[][]{}, 3), new String[][]{{"clone", "", "6"}, {"getKey", "", "7"}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "0=\"sample\" {getKey=0, getValue=sample}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput062() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Attribute", "org.jsoup.nodes.Attribute", "html", new String[]{}, new String[]{}, false, 26, new String[][]{{"org.jsoup.nodes.Attribute", "isBooleanAttribute", ""}, {"org.jsoup.nodes.Attribute", "isBooleanAttribute", ""}, {"org.jsoup.nodes.Attribute", "html", "java.lang.Appendable,org.jsoup.nodes.Document$OutputSettings", "<sample:0>", "<sample:5>"}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("line1\n\nline3=\"\n\"", String.valueOf(actual));
  assertEquals("receiver state after the call", "line1\n\nline3=\"\n\" {getKey=line1\n\nline3, getValue=\n}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput063() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Attribute", "org.jsoup.nodes.Attribute", "html", new String[]{}, new String[]{}, false, 27, new String[][]{{"org.jsoup.nodes.Attribute", "isBooleanAttribute", ""}, {"org.jsoup.nodes.Attribute", "isBooleanAttribute", ""}, {"org.jsoup.nodes.Attribute", "html", "java.lang.Appendable,org.jsoup.nodes.Document$OutputSettings", "<sample:0>", "<sample:5>"}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("null", String.valueOf(actual));
  assertEquals("receiver state after the call", "null {getKey=null, getValue=null}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput064() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Attribute", "org.jsoup.nodes.Attribute", "html", new String[]{}, new String[]{}, false, 28, new String[][]{{"org.jsoup.nodes.Attribute", "isBooleanAttribute", ""}, {"org.jsoup.nodes.Attribute", "isBooleanAttribute", ""}, {"org.jsoup.nodes.Attribute", "html", "java.lang.Appendable,org.jsoup.nodes.Document$OutputSettings", "<sample:0>", "<sample:4>"}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("a=\"0\"", String.valueOf(actual));
  assertEquals("receiver state after the call", "a=\"0\" {getKey=a, getValue=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput065() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Attribute", "org.jsoup.nodes.Attribute", "html", new String[]{}, new String[]{}, false, 29, new String[][]{{"org.jsoup.nodes.Attribute", "isBooleanAttribute", ""}, {"org.jsoup.nodes.Attribute", "isDataAttribute", ""}, {"org.jsoup.nodes.Attribute", "html", "java.lang.Appendable,org.jsoup.nodes.Document$OutputSettings", "<sample:0>", "<sample:4>"}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("0=\"sample\"", String.valueOf(actual));
  assertEquals("receiver state after the call", "0=\"sample\" {getKey=0, getValue=sample}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput066() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jsoup.nodes.Attribute", "org.jsoup.nodes.Attribute", "html", new String[]{"java.lang.String", "java.lang.String", "java.lang.Appendable", "org.jsoup.nodes.Document$OutputSettings"}, new String[]{"null", "0x123456789", "<null>", "<sample:3>"}, true, 0, null, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput067() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Attribute", "org.jsoup.nodes.Attribute", "equals", new String[]{"java.lang.Object"}, new String[]{"<s:,>"}, false, 0, new String[][]{{"org.jsoup.nodes.Attribute", "html", "java.lang.Appendable,org.jsoup.nodes.Document$OutputSettings", "<sample:3>", "<sample:2>"}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "a=\"0\" {getKey=a, getValue=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput068() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Attribute", "org.jsoup.nodes.Attribute", "isDataAttribute", new String[]{"java.lang.String"}, new String[]{"1.12345678901224567u"}, true, 0, null, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput069() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Attribute", "org.jsoup.nodes.Attribute", "hashCode", new String[]{}, new String[]{}, false, 3, new String[][]{}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "null {getKey=null, getValue=null}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput070() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Attribute", "org.jsoup.nodes.Attribute", "hashCode", new String[]{}, new String[]{}, false, 4, new String[][]{}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("1630186666", String.valueOf(actual));
  assertEquals("receiver state after the call", "<a><b>t</b></a>=\"{&quot;a&quot;:1}\" {getKey=<a><b>t</b></a>, getValue={\"a\":1}}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput071() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Attribute", "org.jsoup.nodes.Attribute", "hashCode", new String[]{}, new String[]{}, false, 5, new String[][]{}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("-909673606", String.valueOf(actual));
  assertEquals("receiver state after the call", "0=\"sample\" {getKey=0, getValue=sample}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput072() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Attribute", "org.jsoup.nodes.Attribute", "hashCode", new String[]{}, new String[]{}, false, 6, new String[][]{{"org.jsoup.nodes.Attribute", "html", ""}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("3055", String.valueOf(actual));
  assertEquals("receiver state after the call", "a=\"0\" {getKey=a, getValue=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput073() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Attribute", "org.jsoup.nodes.Attribute", "hashCode", new String[]{}, new String[]{}, false, 10, new String[][]{}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("43599560", String.valueOf(actual));
  assertEquals("receiver state after the call", "{\"a\":1}=\" x \t y \" {getKey={\"a\":1}, getValue= x \t y }", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput074() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Attribute", "org.jsoup.nodes.Attribute", "shouldCollapseAttribute", new String[]{"org.jsoup.nodes.Document$OutputSettings"}, new String[]{"<sample:6>"}, false, 0, null, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "a=\"0\" {getKey=a, getValue=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput075() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Attribute", "org.jsoup.nodes.Attribute", "shouldCollapseAttribute", new String[]{"org.jsoup.nodes.Document$OutputSettings"}, new String[]{"<sample:5>"}, false, 1, new String[][]{{"org.jsoup.nodes.Attribute", "shouldCollapseAttribute", "org.jsoup.nodes.Document$OutputSettings", "<sample:0>"}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "0=\"sample\" {getKey=0, getValue=sample}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput076() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Attribute", "org.jsoup.nodes.Attribute", "shouldCollapseAttribute", new String[]{"org.jsoup.nodes.Document$OutputSettings"}, new String[]{"<sample:5>"}, false, 4, new String[][]{{"org.jsoup.nodes.Attribute", "shouldCollapseAttribute", "org.jsoup.nodes.Document$OutputSettings", "<sample:3>"}, {"org.jsoup.nodes.Attribute", "shouldCollapseAttribute", "org.jsoup.nodes.Document$OutputSettings", "<sample:0>"}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "<a><b>t</b></a>=\"{&quot;a&quot;:1}\" {getKey=<a><b>t</b></a>, getValue={\"a\":1}}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput077() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Attribute", "org.jsoup.nodes.Attribute", "shouldCollapseAttribute", new String[]{"org.jsoup.nodes.Document$OutputSettings"}, new String[]{"<sample:4>"}, false, 10, new String[][]{{"org.jsoup.nodes.Attribute", "shouldCollapseAttribute", "org.jsoup.nodes.Document$OutputSettings", "<sample:4>"}, {"org.jsoup.nodes.Attribute", "shouldCollapseAttribute", "org.jsoup.nodes.Document$OutputSettings", "<sample:0>"}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{\"a\":1}=\" x \t y \" {getKey={\"a\":1}, getValue= x \t y }", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput078() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Attribute", "org.jsoup.nodes.Attribute", "equals", new String[]{"java.lang.Object"}, new String[]{"<d:1.481>"}, false, 1, new String[][]{{"org.jsoup.nodes.Attribute", "getValue", ""}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "0=\"sample\" {getKey=0, getValue=sample}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput079() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Attribute", "org.jsoup.nodes.Attribute", "equals", new String[]{"java.lang.Object"}, new String[]{"<d:1.971>"}, false, 1, new String[][]{{"org.jsoup.nodes.Attribute", "setKey", "java.lang.String", "/a/b"}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "/a/b=\"sample\" {getKey=/a/b, getValue=sample}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput080() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Attribute", "org.jsoup.nodes.Attribute", "equals", new String[]{"java.lang.Object"}, new String[]{"<d:43.942>"}, false, 1, new String[][]{{"org.jsoup.nodes.Attribute", "setKey", "java.lang.String", "1"}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "1=\"sample\" {getKey=1, getValue=sample}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput081() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Attribute", "org.jsoup.nodes.Attribute", "equals", new String[]{"java.lang.Object"}, new String[]{"<d:43.942>"}, false, 1, new String[][]{{"org.jsoup.nodes.Attribute", "setKey", "java.lang.String", "1.12345678"}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "1.12345678=\"sample\" {getKey=1.12345678, getValue=sample}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput082() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Attribute", "org.jsoup.nodes.Attribute", "isDataAttribute", new String[]{"java.lang.String"}, new String[]{"4 i"}, true, 0, null, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput083() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Attribute", "org.jsoup.nodes.Attribute", "shouldCollapseAttribute", new String[]{"org.jsoup.nodes.Document$OutputSettings"}, new String[]{"<sample:5>"}, false, 0, new String[][]{{"org.jsoup.nodes.Attribute", "setKey", "java.lang.String", "1"}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "1=\"0\" {getKey=1, getValue=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput084() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Attribute", "org.jsoup.nodes.Attribute", "setKey", new String[]{"java.lang.String"}, new String[]{"0xFFFFFFFF"}, false, 3, new String[][]{{"org.jsoup.nodes.Attribute", "setValue", "java.lang.String", "PT1H"}, {"org.jsoup.nodes.Attribute", "getValue", ""}});
  assertNull(actual);
  assertEquals("receiver state after the call", "0xFFFFFFFF {getKey=0xFFFFFFFF, getValue=null}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput085() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Attribute", "org.jsoup.nodes.Attribute", "setKey", new String[]{"java.lang.String"}, new String[]{"0xFFFFFFF"}, false, 3, new String[][]{{"org.jsoup.nodes.Attribute", "setValue", "java.lang.String", "PT1H"}, {"org.jsoup.nodes.Attribute", "getValue", ""}});
  assertNull(actual);
  assertEquals("receiver state after the call", "0xFFFFFFF {getKey=0xFFFFFFF, getValue=null}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput086() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jsoup.nodes.Attribute", "org.jsoup.nodes.Attribute", "setValue", new String[]{"java.lang.String"}, new String[]{"1L"}, false, 3, new String[][]{{"org.jsoup.nodes.Attribute", "getValue", ""}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput087() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Attribute", "org.jsoup.nodes.Attribute", "setKey", new String[]{"java.lang.String"}, new String[]{"ismbp"}, false, 3, new String[][]{{"org.jsoup.nodes.Attribute", "equals", "java.lang.Object", "<s:`>"}, {"org.jsoup.nodes.Attribute", "getValue", ""}});
  assertNull(actual);
  assertEquals("receiver state after the call", "ismbp {getKey=ismbp, getValue=null}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput088() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Attribute", "org.jsoup.nodes.Attribute", "setKey", new String[]{"java.lang.String"}, new String[]{"Lsmbp"}, false, 3, new String[][]{{"org.jsoup.nodes.Attribute", "equals", "java.lang.Object", "<i:2>"}, {"org.jsoup.nodes.Attribute", "equals", "java.lang.Object", "<s:`>"}, {"org.jsoup.nodes.Attribute", "getValue", ""}});
  assertNull(actual);
  assertEquals("receiver state after the call", "Lsmbp {getKey=Lsmbp, getValue=null}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput089() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Attribute", "org.jsoup.nodes.Attribute", "setKey", new String[]{"java.lang.String"}, new String[]{"ismbp"}, false, 4, new String[][]{{"org.jsoup.nodes.Attribute", "equals", "java.lang.Object", "<i:2>"}, {"org.jsoup.nodes.Attribute", "getValue", ""}});
  assertNull(actual);
  assertEquals("receiver state after the call", "ismbp=\"{&quot;a&quot;:1}\" {getKey=ismbp, getValue={\"a\":1}}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput090() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Attribute", "org.jsoup.nodes.Attribute", "setKey", new String[]{"java.lang.String"}, new String[]{"imbp"}, false, 4, new String[][]{{"org.jsoup.nodes.Attribute", "equals", "java.lang.Object", "<i:2>"}, {"org.jsoup.nodes.Attribute", "getValue", ""}});
  assertNull(actual);
  assertEquals("receiver state after the call", "imbp=\"{&quot;a&quot;:1}\" {getKey=imbp, getValue={\"a\":1}}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput091() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jsoup.nodes.Attribute", "org.jsoup.nodes.Attribute", "createFromEncoded", new String[]{"java.lang.String", "java.lang.String"}, new String[]{"1.12345678901234567", "<null>"}, true); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput092() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Attribute", "org.jsoup.nodes.Attribute", "createFromEncoded", new String[]{"java.lang.String", "java.lang.String"}, new String[]{"1.12345678901234567", "123456789012345678901234567890"}, true);
  assertNotNull(actual);
  assertEquals("org.jsoup.nodes.Attribute", actual.getClass().getName());
  assertEquals("1.12345678901234567=\"123456789012345678901234567890\" {getKey=1.12345678901234567, getValue=123456789012345678901234567890}", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput093() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Attribute", "org.jsoup.nodes.Attribute", "createFromEncoded", new String[]{"java.lang.String", "java.lang.String"}, new String[]{"1.12345678911234567", "1233567890123456789/12345678902020-02-30T25:61:61"}, true);
  assertNotNull(actual);
  assertEquals("org.jsoup.nodes.Attribute", actual.getClass().getName());
  assertEquals("1.12345678911234567=\"1233567890123456789/12345678902020-02-30T25:61:61\" {getKey=1.12345678911234567, getValue=1233567890123456789/12345678902020-02-30T25:61:61}", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput094() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jsoup.nodes.Attribute", "org.jsoup.nodes.Attribute", "createFromEncoded", new String[]{"java.lang.String", "java.lang.String"}, new String[]{"<null>", "1123366890123457889/12345678902020-02-30T25:61:611.5da"}, true); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput095() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Attribute", "org.jsoup.nodes.Attribute", "createFromEncoded", new String[]{"java.lang.String", "java.lang.String"}, new String[]{"as", "1123366890123457889/12345678902020-02-30T25:61:611.5da"}, true);
  assertNotNull(actual);
  assertEquals("org.jsoup.nodes.Attribute", actual.getClass().getName());
  assertEquals("as=\"1123366890123457889/12345678902020-02-30T25:61:611.5da\" {getKey=as, getValue=1123366890123457889/12345678902020-02-30T25:61:611.5da}", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput096() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jsoup.nodes.Attribute", "org.jsoup.nodes.Attribute", "createFromEncoded", new String[]{"java.lang.String", "java.lang.String"}, new String[]{"checked", "5."}, true), new String[][]{{"setKey", "java.lang.String", "1"}});
  assertNotNull(actual);
  assertEquals("org.jsoup.nodes.Attribute", actual.getClass().getName());
  assertEquals("a=\"5.\" {getKey=a, getValue=5.}", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput097() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jsoup.nodes.Attribute", "org.jsoup.nodes.Attribute", "createFromEncoded", new String[]{"java.lang.String", "java.lang.String"}, new String[]{"Hello, World", "5."}, true), new String[][]{{"getKey", "", "1"}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("Hello, World", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput098() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jsoup.nodes.Attribute", "org.jsoup.nodes.Attribute", "createFromEncoded", new String[]{"java.lang.String", "java.lang.String"}, new String[]{"0x123456789", "5."}, true), new String[][]{{"getKey", "", "1"}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("0x123456789", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput099() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Attribute", "org.jsoup.nodes.Attribute", "equals", new String[]{"java.lang.Object"}, new String[]{"<b:true>"}, false);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "a=\"0\" {getKey=a, getValue=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput100() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Attribute", "org.jsoup.nodes.Attribute", "equals", new String[]{"java.lang.Object"}, new String[]{"<b:true>"}, false, 1, new String[][]{});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "0=\"sample\" {getKey=0, getValue=sample}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput101() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Attribute", "org.jsoup.nodes.Attribute", "equals", new String[]{"java.lang.Object"}, new String[]{"<b:true>"}, false, 7, new String[][]{});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "null {getKey=null, getValue=null}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput102() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Attribute", "org.jsoup.nodes.Attribute", "isDataAttribute", new String[]{}, new String[]{}, false);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "a=\"0\" {getKey=a, getValue=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput103() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Attribute", "org.jsoup.nodes.Attribute", "isDataAttribute", new String[]{}, new String[]{}, false, 1, new String[][]{});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "0=\"sample\" {getKey=0, getValue=sample}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput104() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Attribute", "org.jsoup.nodes.Attribute", "isDataAttribute", new String[]{}, new String[]{}, false, 2, new String[][]{});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "sample=\"\" {getKey=sample, getValue=}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput105() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jsoup.nodes.Attribute", "org.jsoup.nodes.Attribute", "isDataAttribute", new String[]{}, new String[]{}, false, 3, new String[][]{}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput106() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Attribute", "org.jsoup.nodes.Attribute", "hashCode", new String[]{}, new String[]{}, false);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("3055", String.valueOf(actual));
  assertEquals("receiver state after the call", "a=\"0\" {getKey=a, getValue=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput107() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Attribute", "org.jsoup.nodes.Attribute", "isDataAttribute", new String[]{"java.lang.String"}, new String[]{"2020-01-01"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput108() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jsoup.nodes.Attribute", "org.jsoup.nodes.Attribute", "html", new String[]{"java.lang.String", "java.lang.String", "java.lang.Appendable", "org.jsoup.nodes.Document$OutputSettings"}, new String[]{"220-02-30T25:61:61", "1.12345678901234567", "<sample:2>", "<null>"}, true); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput109() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Attribute", "org.jsoup.nodes.Attribute", "html", new String[]{}, new String[]{}, false);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("a=\"0\"", String.valueOf(actual));
  assertEquals("receiver state after the call", "a=\"0\" {getKey=a, getValue=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput110() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Attribute", "org.jsoup.nodes.Attribute", "html", new String[]{}, new String[]{}, false, 1, new String[][]{});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("0=\"sample\"", String.valueOf(actual));
  assertEquals("receiver state after the call", "0=\"sample\" {getKey=0, getValue=sample}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput111() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Attribute", "org.jsoup.nodes.Attribute", "html", new String[]{}, new String[]{}, false, 2, new String[][]{});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("sample=\"\"", String.valueOf(actual));
  assertEquals("receiver state after the call", "sample=\"\" {getKey=sample, getValue=}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput112() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Attribute", "org.jsoup.nodes.Attribute", "html", new String[]{}, new String[]{}, false, 3, new String[][]{});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("null", String.valueOf(actual));
  assertEquals("receiver state after the call", "null {getKey=null, getValue=null}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput113() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Attribute", "org.jsoup.nodes.Attribute", "html", new String[]{}, new String[]{}, false, 4, new String[][]{});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("<a><b>t</b></a>=\"{&quot;a&quot;:1}\"", String.valueOf(actual));
  assertEquals("receiver state after the call", "<a><b>t</b></a>=\"{&quot;a&quot;:1}\" {getKey=<a><b>t</b></a>, getValue={\"a\":1}}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput114() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Attribute", "org.jsoup.nodes.Attribute", "html", new String[]{"java.lang.String", "java.lang.String", "java.lang.Appendable", "org.jsoup.nodes.Document$OutputSettings"}, new String[]{"multiple", "+P1", "<sample:2>", "<sample:1>"}, true);
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput115() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Attribute", "org.jsoup.nodes.Attribute", "getKey", new String[]{}, new String[]{}, false);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("a", String.valueOf(actual));
  assertEquals("receiver state after the call", "a=\"0\" {getKey=a, getValue=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput116() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Attribute", "org.jsoup.nodes.Attribute", "getKey", new String[]{}, new String[]{}, false, 1, new String[][]{});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "0=\"sample\" {getKey=0, getValue=sample}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput117() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Attribute", "org.jsoup.nodes.Attribute", "getKey", new String[]{}, new String[]{}, false, 1, new String[][]{{"org.jsoup.nodes.Attribute", "setValue", "java.lang.String", "a,b,c"}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "0=\"a,b,c\" {getKey=0, getValue=a,b,c}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput118() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Attribute", "org.jsoup.nodes.Attribute", "getValue", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.jsoup.nodes.Attribute", "equals", "java.lang.Object", "<s:a>"}, {"org.jsoup.nodes.Attribute", "getValue", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "a=\"0\" {getKey=a, getValue=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput119() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Attribute", "org.jsoup.nodes.Attribute", "getValue", new String[]{}, new String[]{}, false, 1, new String[][]{{"org.jsoup.nodes.Attribute", "equals", "java.lang.Object", "<s:a>"}, {"org.jsoup.nodes.Attribute", "getValue", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("sample", String.valueOf(actual));
  assertEquals("receiver state after the call", "0=\"sample\" {getKey=0, getValue=sample}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput120() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Attribute", "org.jsoup.nodes.Attribute", "equals", new String[]{"java.lang.Object"}, new String[]{"<s:key>"}, false, 4, new String[][]{{"org.jsoup.nodes.Attribute", "equals", "java.lang.Object", "<i:1>"}, {"org.jsoup.nodes.Attribute", "setValue", "java.lang.String", "declare"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "<a><b>t</b></a>=\"{&quot;a&quot;:1}\" {getKey=<a><b>t</b></a>, getValue={\"a\":1}}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput121() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Attribute", "org.jsoup.nodes.Attribute", "isBooleanAttribute", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.jsoup.nodes.Attribute", "setValue", "java.lang.String", "--1"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "a=\"0\" {getKey=a, getValue=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput122() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Attribute", "org.jsoup.nodes.Attribute", "shouldCollapseAttribute", new String[]{"org.jsoup.nodes.Document$OutputSettings"}, new String[]{"<sample:6>"}, false, 0, new String[][]{{"org.jsoup.nodes.Attribute", "equals", "java.lang.Object", "<s:b>"}, {"org.jsoup.nodes.Attribute", "hashCode", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "a=\"0\" {getKey=a, getValue=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput123() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jsoup.nodes.Attribute", "org.jsoup.nodes.Attribute", "shouldCollapseAttribute", new String[]{"org.jsoup.nodes.Document$OutputSettings"}, new String[]{"<null>"}, false, 0, new String[][]{{"org.jsoup.nodes.Attribute", "equals", "java.lang.Object", "<s:>"}, {"org.jsoup.nodes.Attribute", "html", ""}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput124() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Attribute", "org.jsoup.nodes.Attribute", "shouldCollapseAttribute", new String[]{"org.jsoup.nodes.Document$OutputSettings"}, new String[]{"<sample:5>"}, false, 11, new String[][]{});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
  assertEquals("receiver state after the call", "null {getKey=null, getValue=null}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput125() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Attribute", "org.jsoup.nodes.Attribute", "shouldCollapseAttribute", new String[]{"org.jsoup.nodes.Document$OutputSettings"}, new String[]{"<sample:9>"}, false, 13, new String[][]{{"org.jsoup.nodes.Attribute", "getValue", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "0=\"sample\" {getKey=0, getValue=sample}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput126() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Attribute", "org.jsoup.nodes.Attribute", "shouldCollapseAttribute", new String[]{"org.jsoup.nodes.Document$OutputSettings"}, new String[]{"<sample:1>"}, false, 14, new String[][]{});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{\"a\":1}=\" x \t y \" {getKey={\"a\":1}, getValue= x \t y }", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput127() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Attribute", "org.jsoup.nodes.Attribute", "getKey", new String[]{}, new String[]{}, false, 2, new String[][]{{"org.jsoup.nodes.Attribute", "getValue", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("sample", String.valueOf(actual));
  assertEquals("receiver state after the call", "sample=\"\" {getKey=sample, getValue=}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput128() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Attribute", "org.jsoup.nodes.Attribute", "getKey", new String[]{}, new String[]{}, false, 3, new String[][]{{"org.jsoup.nodes.Attribute", "getValue", ""}});
  assertNull(actual);
  assertEquals("receiver state after the call", "null {getKey=null, getValue=null}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput129() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Attribute", "org.jsoup.nodes.Attribute", "getKey", new String[]{}, new String[]{}, false, 14, new String[][]{{"org.jsoup.nodes.Attribute", "getValue", ""}, {"org.jsoup.nodes.Attribute", "shouldCollapseAttribute", "org.jsoup.nodes.Document$OutputSettings", "<null>"}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("{\"a\":1}", String.valueOf(actual));
  assertEquals("receiver state after the call", "{\"a\":1}=\" x \t y \" {getKey={\"a\":1}, getValue= x \t y }", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput130() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Attribute", "org.jsoup.nodes.Attribute", "getKey", new String[]{}, new String[]{}, false, 16, new String[][]{{"org.jsoup.nodes.Attribute", "isDataAttribute", ""}, {"org.jsoup.nodes.Attribute", "getValue", ""}, {"org.jsoup.nodes.Attribute", "shouldCollapseAttribute", "org.jsoup.nodes.Document$OutputSettings", "<null>"}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("x \t y", String.valueOf(actual));
  assertEquals("receiver state after the call", "x \t y=\"line1\n\nline3\" {getKey=x \t y, getValue=line1\n\nline3}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput131() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Attribute", "org.jsoup.nodes.Attribute", "getKey", new String[]{}, new String[]{}, false, 22, new String[][]{{"org.jsoup.nodes.Attribute", "isDataAttribute", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("line1\n\nline3", String.valueOf(actual));
  assertEquals("receiver state after the call", "line1\n\nline3=\"\n\" {getKey=line1\n\nline3, getValue=\n}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput132() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Attribute", "org.jsoup.nodes.Attribute", "equals", new String[]{"java.lang.Object"}, new String[]{"<s:key>"}, false, 5, new String[][]{{"org.jsoup.nodes.Attribute", "setKey", "java.lang.String", "formnovalidate"}, {"org.jsoup.nodes.Attribute", "getValue", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "formnovalidate=\"sample\" {getKey=formnovalidate, getValue=sample}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput133() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Attribute", "org.jsoup.nodes.Attribute", "isBooleanAttribute", new String[]{}, new String[]{}, false, 1, new String[][]{});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "0=\"sample\" {getKey=0, getValue=sample}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput134() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Attribute", "org.jsoup.nodes.Attribute", "isBooleanAttribute", new String[]{}, new String[]{}, false, 2, new String[][]{});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "sample=\"\" {getKey=sample, getValue=}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput135() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jsoup.nodes.Attribute", "org.jsoup.nodes.Attribute", "isBooleanAttribute", new String[]{}, new String[]{}, false, 3, new String[][]{}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput136() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Attribute", "org.jsoup.nodes.Attribute", "isBooleanAttribute", new String[]{}, new String[]{}, false, 4, new String[][]{{"org.jsoup.nodes.Attribute", "equals", "java.lang.Object", "<i:19>"}, {"org.jsoup.nodes.Attribute", "isDataAttribute", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "<a><b>t</b></a>=\"{&quot;a&quot;:1}\" {getKey=<a><b>t</b></a>, getValue={\"a\":1}}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput137() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Attribute", "org.jsoup.nodes.Attribute", "getKey", new String[]{}, new String[]{}, false, 4, new String[][]{{"org.jsoup.nodes.Attribute", "isBooleanAttribute", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("<a><b>t</b></a>", String.valueOf(actual));
  assertEquals("receiver state after the call", "<a><b>t</b></a>=\"{&quot;a&quot;:1}\" {getKey=<a><b>t</b></a>, getValue={\"a\":1}}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput138() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Attribute", "org.jsoup.nodes.Attribute", "getKey", new String[]{}, new String[]{}, false, 6, new String[][]{{"org.jsoup.nodes.Attribute", "isBooleanAttribute", ""}, {"org.jsoup.nodes.Attribute", "setKey", "java.lang.String", "-1"}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("-1", String.valueOf(actual));
  assertEquals("receiver state after the call", "-1=\"0\" {getKey=-1, getValue=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput139() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Attribute", "org.jsoup.nodes.Attribute", "isDataAttribute", new String[]{}, new String[]{}, false, 4, new String[][]{});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "<a><b>t</b></a>=\"{&quot;a&quot;:1}\" {getKey=<a><b>t</b></a>, getValue={\"a\":1}}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput140() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Attribute", "org.jsoup.nodes.Attribute", "isDataAttribute", new String[]{}, new String[]{}, false, 16, new String[][]{});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "x \t y=\"line1\n\nline3\" {getKey=x \t y, getValue=line1\n\nline3}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput141() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Attribute", "org.jsoup.nodes.Attribute", "hashCode", new String[]{}, new String[]{}, false, 1, new String[][]{{"org.jsoup.nodes.Attribute", "setValue", "java.lang.String", "010"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("49183", String.valueOf(actual));
  assertEquals("receiver state after the call", "0=\"010\" {getKey=0, getValue=010}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput142() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Attribute", "org.jsoup.nodes.Attribute", "hashCode", new String[]{}, new String[]{}, false, 2, new String[][]{{"org.jsoup.nodes.Attribute", "setValue", "java.lang.String", "010"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("1864843158", String.valueOf(actual));
  assertEquals("receiver state after the call", "sample=\"\" {getKey=sample, getValue=}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput143() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Attribute", "org.jsoup.nodes.Attribute", "hashCode", new String[]{}, new String[]{}, false, 3, new String[][]{{"org.jsoup.nodes.Attribute", "setValue", "java.lang.String", "0\"10"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "null {getKey=null, getValue=null}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput144() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Attribute", "org.jsoup.nodes.Attribute", "shouldCollapseAttribute", new String[]{"java.lang.String", "java.lang.String", "org.jsoup.nodes.Document$OutputSettings"}, new String[]{"I", "P1H", "<sample:1>"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput145() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Attribute", "org.jsoup.nodes.Attribute", "toString", new String[]{}, new String[]{}, false);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("a=\"0\"", String.valueOf(actual));
  assertEquals("receiver state after the call", "a=\"0\" {getKey=a, getValue=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput146() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Attribute", "org.jsoup.nodes.Attribute", "toString", new String[]{}, new String[]{}, false, 1, new String[][]{{"org.jsoup.nodes.Attribute", "getKey", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("0=\"sample\"", String.valueOf(actual));
  assertEquals("receiver state after the call", "0=\"sample\" {getKey=0, getValue=sample}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput147() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Attribute", "org.jsoup.nodes.Attribute", "isBooleanAttribute", new String[]{"java.lang.String"}, new String[]{"1L"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput148() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Attribute", "org.jsoup.nodes.Attribute", "getValue", new String[]{}, new String[]{}, false, 2, new String[][]{{"org.jsoup.nodes.Attribute", "equals", "java.lang.Object", "<d:1.5>"}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("", String.valueOf(actual));
  assertEquals("receiver state after the call", "sample=\"\" {getKey=sample, getValue=}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput149() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Attribute", "org.jsoup.nodes.Attribute", "clone", new String[]{}, new String[]{}, false);
  assertNotNull(actual);
  assertEquals("org.jsoup.nodes.Attribute", actual.getClass().getName());
  assertEquals("a=\"0\" {getKey=a, getValue=0}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "a=\"0\" {getKey=a, getValue=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput150() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Attribute", "org.jsoup.nodes.Attribute", "clone", new String[]{}, new String[]{}, false, 1, new String[][]{});
  assertNotNull(actual);
  assertEquals("org.jsoup.nodes.Attribute", actual.getClass().getName());
  assertEquals("0=\"sample\" {getKey=0, getValue=sample}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "0=\"sample\" {getKey=0, getValue=sample}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput151() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jsoup.nodes.Attribute", "org.jsoup.nodes.Attribute", "clone", new String[]{}, new String[]{}, false, 2, new String[][]{}), new String[][]{{"clone", "", "6"}});
  assertNotNull(actual);
  assertEquals("org.jsoup.nodes.Attribute", actual.getClass().getName());
  assertEquals("sample=\"\" {getKey=sample, getValue=}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "sample=\"\" {getKey=sample, getValue=}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput152() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jsoup.nodes.Attribute", "org.jsoup.nodes.Attribute", "clone", new String[]{}, new String[]{}, false, 3, new String[][]{}), new String[][]{{"clone", "", "6"}});
  assertNotNull(actual);
  assertEquals("org.jsoup.nodes.Attribute", actual.getClass().getName());
  assertEquals("null {getKey=null, getValue=null}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "null {getKey=null, getValue=null}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput153() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Attribute", "org.jsoup.nodes.Attribute", "clone", new String[]{}, new String[]{}, false, 4, new String[][]{{"org.jsoup.nodes.Attribute", "getKey", ""}});
  assertNotNull(actual);
  assertEquals("org.jsoup.nodes.Attribute", actual.getClass().getName());
  assertEquals("<a><b>t</b></a>=\"{&quot;a&quot;:1}\" {getKey=<a><b>t</b></a>, getValue={\"a\":1}}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "<a><b>t</b></a>=\"{&quot;a&quot;:1}\" {getKey=<a><b>t</b></a>, getValue={\"a\":1}}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput154() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Attribute", "org.jsoup.nodes.Attribute", "getValue", new String[]{}, new String[]{}, false, 3, new String[][]{});
  assertNull(actual);
  assertEquals("receiver state after the call", "null {getKey=null, getValue=null}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput155() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Attribute", "org.jsoup.nodes.Attribute", "getValue", new String[]{}, new String[]{}, false, 4, new String[][]{});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("{\"a\":1}", String.valueOf(actual));
  assertEquals("receiver state after the call", "<a><b>t</b></a>=\"{&quot;a&quot;:1}\" {getKey=<a><b>t</b></a>, getValue={\"a\":1}}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput156() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Attribute", "org.jsoup.nodes.Attribute", "getValue", new String[]{}, new String[]{}, false, 10, new String[][]{});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals(" x \t y ", String.valueOf(actual));
  assertEquals("receiver state after the call", "{\"a\":1}=\" x \t y \" {getKey={\"a\":1}, getValue= x \t y }", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput157() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Attribute", "org.jsoup.nodes.Attribute", "isBooleanAttribute", new String[]{"java.lang.String"}, new String[]{"nohref"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput158() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Attribute", "org.jsoup.nodes.Attribute", "html", new String[]{}, new String[]{}, false, 10, new String[][]{{"org.jsoup.nodes.Attribute", "getKey", ""}, {"org.jsoup.nodes.Attribute", "html", "java.lang.Appendable,org.jsoup.nodes.Document$OutputSettings", "<sample:1>", "<sample:3>"}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("{\"a\":1}=\" x \t y \"", String.valueOf(actual));
  assertEquals("receiver state after the call", "{\"a\":1}=\" x \t y \" {getKey={\"a\":1}, getValue= x \t y }", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput159() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Attribute", "org.jsoup.nodes.Attribute", "html", new String[]{}, new String[]{}, false, 16, new String[][]{{"org.jsoup.nodes.Attribute", "getKey", ""}, {"org.jsoup.nodes.Attribute", "getValue", ""}, {"org.jsoup.nodes.Attribute", "html", "java.lang.Appendable,org.jsoup.nodes.Document$OutputSettings", "<sample:1>", "<sample:2>"}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("x \t y=\"line1\n\nline3\"", String.valueOf(actual));
  assertEquals("receiver state after the call", "x \t y=\"line1\n\nline3\" {getKey=x \t y, getValue=line1\n\nline3}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput160() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Attribute", "org.jsoup.nodes.Attribute", "html", new String[]{}, new String[]{}, false, 22, new String[][]{{"org.jsoup.nodes.Attribute", "getValue", ""}, {"org.jsoup.nodes.Attribute", "isBooleanAttribute", ""}, {"org.jsoup.nodes.Attribute", "html", "java.lang.Appendable,org.jsoup.nodes.Document$OutputSettings", "<sample:0>", "<sample:2>"}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("line1\n\nline3=\"\n\"", String.valueOf(actual));
  assertEquals("receiver state after the call", "line1\n\nline3=\"\n\" {getKey=line1\n\nline3, getValue=\n}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput161() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jsoup.nodes.Attribute", "org.jsoup.nodes.Attribute", "clone", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.jsoup.nodes.Attribute", "setKey", "java.lang.String", "1L"}}), new String[][]{{"getKey", "", "2"}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("1L", String.valueOf(actual));
  assertEquals("receiver state after the call", "1L=\"0\" {getKey=1L, getValue=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput162() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Attribute", "org.jsoup.nodes.Attribute", "isBooleanAttribute", new String[]{}, new String[]{}, false, 10, new String[][]{{"org.jsoup.nodes.Attribute", "hashCode", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{\"a\":1}=\" x \t y \" {getKey={\"a\":1}, getValue= x \t y }", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput163() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jsoup.nodes.Attribute", "org.jsoup.nodes.Attribute", "clone", new String[]{}, new String[]{}, false, 1, new String[][]{{"org.jsoup.nodes.Attribute", "toString", ""}}), new String[][]{{"setKey", "java.lang.String", "5"}});
  assertNotNull(actual);
  assertEquals("org.jsoup.nodes.Attribute", actual.getClass().getName());
  assertEquals("a=\"sample\" {getKey=a, getValue=sample}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "0=\"sample\" {getKey=0, getValue=sample}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput164() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jsoup.nodes.Attribute", "org.jsoup.nodes.Attribute", "clone", new String[]{}, new String[]{}, false, 2, new String[][]{{"org.jsoup.nodes.Attribute", "toString", ""}}), new String[][]{{"setKey", "java.lang.String", "5"}});
  assertNotNull(actual);
  assertEquals("org.jsoup.nodes.Attribute", actual.getClass().getName());
  assertEquals("a=\"\" {getKey=a, getValue=}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "sample=\"\" {getKey=sample, getValue=}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput165() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jsoup.nodes.Attribute", "org.jsoup.nodes.Attribute", "clone", new String[]{}, new String[]{}, false, 16, new String[][]{{"org.jsoup.nodes.Attribute", "toString", ""}}), new String[][]{{"setKey", "java.lang.String", "5"}});
  assertNotNull(actual);
  assertEquals("org.jsoup.nodes.Attribute", actual.getClass().getName());
  assertEquals("a=\"line1\n\nline3\" {getKey=a, getValue=line1\n\nline3}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "x \t y=\"line1\n\nline3\" {getKey=x \t y, getValue=line1\n\nline3}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput166() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jsoup.nodes.Attribute", "org.jsoup.nodes.Attribute", "clone", new String[]{}, new String[]{}, false, 22, new String[][]{{"org.jsoup.nodes.Attribute", "equals", "java.lang.Object", "<i:-57>"}}), new String[][]{{"setKey", "java.lang.String", "5"}});
  assertNotNull(actual);
  assertEquals("org.jsoup.nodes.Attribute", actual.getClass().getName());
  assertEquals("a=\"\n\" {getKey=a, getValue=\n}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "line1\n\nline3=\"\n\" {getKey=line1\n\nline3, getValue=\n}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput167() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Attribute", "org.jsoup.nodes.Attribute", "setValue", new String[]{"java.lang.String"}, new String[]{"noresize"}, false, 5, new String[][]{{"org.jsoup.nodes.Attribute", "html", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("", String.valueOf(actual));
  assertEquals("receiver state after the call", "0=\"noresize\" {getKey=0, getValue=noresize}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput168() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Attribute", "org.jsoup.nodes.Attribute", "setValue", new String[]{"java.lang.String"}, new String[]{"TIITLE"}, false, 5, new String[][]{{"org.jsoup.nodes.Attribute", "html", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("", String.valueOf(actual));
  assertEquals("receiver state after the call", "0=\"TIITLE\" {getKey=0, getValue=TIITLE}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput169() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Attribute", "org.jsoup.nodes.Attribute", "setValue", new String[]{"java.lang.String"}, new String[]{"1.1234567"}, false, 5, new String[][]{{"org.jsoup.nodes.Attribute", "html", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("", String.valueOf(actual));
  assertEquals("receiver state after the call", "0=\"1.1234567\" {getKey=0, getValue=1.1234567}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput170() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Attribute", "org.jsoup.nodes.Attribute", "setValue", new String[]{"java.lang.String"}, new String[]{"1.12345672147483648"}, false, 5, new String[][]{{"org.jsoup.nodes.Attribute", "html", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("", String.valueOf(actual));
  assertEquals("receiver state after the call", "0=\"1.12345672147483648\" {getKey=0, getValue=1.12345672147483648}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput171() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Attribute", "org.jsoup.nodes.Attribute", "toString", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.jsoup.nodes.Attribute", "setKey", "java.lang.String", "http://example.com/a?b=c"}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("http://example.com/a?b=c=\"0\"", String.valueOf(actual));
  assertEquals("receiver state after the call", "http://example.com/a?b=c=\"0\" {getKey=http://example.com/a?b=c, getValue=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput172() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Attribute", "org.jsoup.nodes.Attribute", "toString", new String[]{}, new String[]{}, false, 1, new String[][]{{"org.jsoup.nodes.Attribute", "setKey", "java.lang.String", "http://example.com/a?b=c"}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("http://example.com/a?b=c=\"sample\"", String.valueOf(actual));
  assertEquals("receiver state after the call", "http://example.com/a?b=c=\"sample\" {getKey=http://example.com/a?b=c, getValue=sample}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput173() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Attribute", "org.jsoup.nodes.Attribute", "toString", new String[]{}, new String[]{}, false, 2, new String[][]{{"org.jsoup.nodes.Attribute", "setKey", "java.lang.String", "http://example.com/a?b=c"}, {"org.jsoup.nodes.Attribute", "shouldCollapseAttribute", "org.jsoup.nodes.Document$OutputSettings", "<sample:2>"}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("http://example.com/a?b=c=\"\"", String.valueOf(actual));
  assertEquals("receiver state after the call", "http://example.com/a?b=c=\"\" {getKey=http://example.com/a?b=c, getValue=}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput174() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Attribute", "org.jsoup.nodes.Attribute", "hashCode", new String[]{}, new String[]{}, false, 1, new String[][]{});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("-909673606", String.valueOf(actual));
  assertEquals("receiver state after the call", "0=\"sample\" {getKey=0, getValue=sample}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput175() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Attribute", "org.jsoup.nodes.Attribute", "hashCode", new String[]{}, new String[]{}, false, 8, new String[][]{{"org.jsoup.nodes.Attribute", "isBooleanAttribute", ""}, {"org.jsoup.nodes.Attribute", "isBooleanAttribute", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("1630186666", String.valueOf(actual));
  assertEquals("receiver state after the call", "<a><b>t</b></a>=\"{&quot;a&quot;:1}\" {getKey=<a><b>t</b></a>, getValue={\"a\":1}}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput176() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Attribute", "org.jsoup.nodes.Attribute", "hashCode", new String[]{}, new String[]{}, false, 10, new String[][]{{"org.jsoup.nodes.Attribute", "isBooleanAttribute", ""}, {"org.jsoup.nodes.Attribute", "isBooleanAttribute", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("43599560", String.valueOf(actual));
  assertEquals("receiver state after the call", "{\"a\":1}=\" x \t y \" {getKey={\"a\":1}, getValue= x \t y }", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput177() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jsoup.nodes.Attribute", "org.jsoup.nodes.Attribute", "isDataAttribute", new String[]{"java.lang.String"}, new String[]{"<null>"}, true); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput178() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Attribute", "org.jsoup.nodes.Attribute", "shouldCollapseAttribute", new String[]{"org.jsoup.nodes.Document$OutputSettings"}, new String[]{"<sample:5>"}, false, 0, new String[][]{{"org.jsoup.nodes.Attribute", "setKey", "java.lang.String", "1L"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "1L=\"0\" {getKey=1L, getValue=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput179() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Attribute", "org.jsoup.nodes.Attribute", "shouldCollapseAttribute", new String[]{"org.jsoup.nodes.Document$OutputSettings"}, new String[]{"<sample:5>"}, false, 0, new String[][]{{"org.jsoup.nodes.Attribute", "setKey", "java.lang.String", "1"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "1=\"0\" {getKey=1, getValue=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput180() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Attribute", "org.jsoup.nodes.Attribute", "toString", new String[]{}, new String[]{}, false, 2, new String[][]{{"org.jsoup.nodes.Attribute", "toString", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("sample=\"\"", String.valueOf(actual));
  assertEquals("receiver state after the call", "sample=\"\" {getKey=sample, getValue=}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput181() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Attribute", "org.jsoup.nodes.Attribute", "toString", new String[]{}, new String[]{}, false, 3, new String[][]{{"org.jsoup.nodes.Attribute", "toString", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("null", String.valueOf(actual));
  assertEquals("receiver state after the call", "null {getKey=null, getValue=null}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput182() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Attribute", "org.jsoup.nodes.Attribute", "toString", new String[]{}, new String[]{}, false, 4, new String[][]{{"org.jsoup.nodes.Attribute", "toString", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("<a><b>t</b></a>=\"{&quot;a&quot;:1}\"", String.valueOf(actual));
  assertEquals("receiver state after the call", "<a><b>t</b></a>=\"{&quot;a&quot;:1}\" {getKey=<a><b>t</b></a>, getValue={\"a\":1}}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput183() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Attribute", "org.jsoup.nodes.Attribute", "html", new String[]{}, new String[]{}, false, 5, new String[][]{{"org.jsoup.nodes.Attribute", "shouldCollapseAttribute", "org.jsoup.nodes.Document$OutputSettings", "<sample:4>"}, {"org.jsoup.nodes.Attribute", "isDataAttribute", ""}, {"org.jsoup.nodes.Attribute", "setValue", "java.lang.String", "--1"}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("0=\"--1\"", String.valueOf(actual));
  assertEquals("receiver state after the call", "0=\"--1\" {getKey=0, getValue=--1}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput184() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Attribute", "org.jsoup.nodes.Attribute", "setKey", new String[]{"java.lang.String"}, new String[]{"0"}, false, 0, new String[][]{{"org.jsoup.nodes.Attribute", "getKey", ""}});
  assertNull(actual);
  assertEquals("receiver state after the call", "0=\"0\" {getKey=0, getValue=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput185() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jsoup.nodes.Attribute", "org.jsoup.nodes.Attribute", "setKey", new String[]{"java.lang.String"}, new String[]{""}, false, 5, new String[][]{{"org.jsoup.nodes.Attribute", "html", "java.lang.Appendable,org.jsoup.nodes.Document$OutputSettings", "<null>", "<null>"}, {"org.jsoup.nodes.Attribute", "html", "java.lang.Appendable,org.jsoup.nodes.Document$OutputSettings", "<sample:0>", "<sample:1>"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput186() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Attribute", "org.jsoup.nodes.Attribute", "setKey", new String[]{"java.lang.String"}, new String[]{"7"}, false, 5, new String[][]{{"org.jsoup.nodes.Attribute", "html", "java.lang.Appendable,org.jsoup.nodes.Document$OutputSettings", "<null>", "<null>"}, {"org.jsoup.nodes.Attribute", "html", "java.lang.Appendable,org.jsoup.nodes.Document$OutputSettings", "<sample:0>", "<sample:1>"}}, 3);
  assertNull(actual);
  assertEquals("receiver state after the call", "7=\"sample\" {getKey=7, getValue=sample}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput187() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Attribute", "org.jsoup.nodes.Attribute", "setKey", new String[]{"java.lang.String"}, new String[]{"6"}, false, 5, new String[][]{{"org.jsoup.nodes.Attribute", "html", "java.lang.Appendable,org.jsoup.nodes.Document$OutputSettings", "<null>", "<null>"}, {"org.jsoup.nodes.Attribute", "html", "java.lang.Appendable,org.jsoup.nodes.Document$OutputSettings", "<sample:0>", "<sample:1>"}}, 3);
  assertNull(actual);
  assertEquals("receiver state after the call", "6=\"sample\" {getKey=6, getValue=sample}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput188() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Attribute", "org.jsoup.nodes.Attribute", "setKey", new String[]{"java.lang.String"}, new String[]{"<"}, false, 5, new String[][]{{"org.jsoup.nodes.Attribute", "html", "java.lang.Appendable,org.jsoup.nodes.Document$OutputSettings", "<null>", "<null>"}, {"org.jsoup.nodes.Attribute", "html", "java.lang.Appendable,org.jsoup.nodes.Document$OutputSettings", "<sample:0>", "<sample:1>"}}, 3);
  assertNull(actual);
  assertEquals("receiver state after the call", "<=\"sample\" {getKey=<, getValue=sample}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput189() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Attribute", "org.jsoup.nodes.Attribute", "setKey", new String[]{"java.lang.String"}, new String[]{"n"}, false, 5, new String[][]{{"org.jsoup.nodes.Attribute", "html", "java.lang.Appendable,org.jsoup.nodes.Document$OutputSettings", "<null>", "<null>"}, {"org.jsoup.nodes.Attribute", "html", "java.lang.Appendable,org.jsoup.nodes.Document$OutputSettings", "<sample:0>", "<sample:1>"}}, 3);
  assertNull(actual);
  assertEquals("receiver state after the call", "n=\"sample\" {getKey=n, getValue=sample}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput190() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Attribute", "org.jsoup.nodes.Attribute", "setKey", new String[]{"java.lang.String"}, new String[]{"n"}, false, 6, new String[][]{{"org.jsoup.nodes.Attribute", "html", "java.lang.Appendable,org.jsoup.nodes.Document$OutputSettings", "<sample:2>", "<null>"}, {"org.jsoup.nodes.Attribute", "html", "java.lang.Appendable,org.jsoup.nodes.Document$OutputSettings", "<sample:0>", "<sample:1>"}}, 3);
  assertNull(actual);
  assertEquals("receiver state after the call", "n=\"0\" {getKey=n, getValue=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput191() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jsoup.nodes.Attribute", "org.jsoup.nodes.Attribute", "setKey", new String[]{"java.lang.String"}, new String[]{""}, false, 6, new String[][]{{"org.jsoup.nodes.Attribute", "html", "java.lang.Appendable,org.jsoup.nodes.Document$OutputSettings", "<sample:2>", "<sample:7>"}, {"org.jsoup.nodes.Attribute", "html", "java.lang.Appendable,org.jsoup.nodes.Document$OutputSettings", "<sample:0>", "<sample:1>"}}, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput192() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Attribute", "org.jsoup.nodes.Attribute", "hashCode", new String[]{}, new String[]{}, false, 0, null, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("3055", String.valueOf(actual));
  assertEquals("receiver state after the call", "a=\"0\" {getKey=a, getValue=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput193() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jsoup.nodes.Attribute", "org.jsoup.nodes.Attribute", "createFromEncoded", new String[]{"java.lang.String", "java.lang.String"}, new String[]{"12147483648", "5.i.41.5e300"}, true, 0, null, 3), new String[][]{{"getValue", "", "2"}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("5.i.41.5e300", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput194() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jsoup.nodes.Attribute", "org.jsoup.nodes.Attribute", "createFromEncoded", new String[]{"java.lang.String", "java.lang.String"}, new String[]{"12147483648", "5.i.40.5e300"}, true, 0, null, 3), new String[][]{{"getValue", "", "2"}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("5.i.40.5e300", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput195() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Attribute", "org.jsoup.nodes.Attribute", "toString", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.jsoup.nodes.Attribute", "setKey", "java.lang.String", "http:/example.com/a?b=c"}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("http:/example.com/a?b=c=\"0\"", String.valueOf(actual));
  assertEquals("receiver state after the call", "http:/example.com/a?b=c=\"0\" {getKey=http:/example.com/a?b=c, getValue=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput196() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Attribute", "org.jsoup.nodes.Attribute", "toString", new String[]{}, new String[]{}, false, 2, new String[][]{{"org.jsoup.nodes.Attribute", "html", ""}, {"org.jsoup.nodes.Attribute", "setKey", "java.lang.String", "http:0/example.com/a?b=c"}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("http:0/example.com/a?b=c=\"\"", String.valueOf(actual));
  assertEquals("receiver state after the call", "http:0/example.com/a?b=c=\"\" {getKey=http:0/example.com/a?b=c, getValue=}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput197() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Attribute", "org.jsoup.nodes.Attribute", "toString", new String[]{}, new String[]{}, false, 3, new String[][]{{"org.jsoup.nodes.Attribute", "html", ""}, {"org.jsoup.nodes.Attribute", "setKey", "java.lang.String", "http:0/example.com/a?b=c"}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("http:0/example.com/a?b=c", String.valueOf(actual));
  assertEquals("receiver state after the call", "http:0/example.com/a?b=c {getKey=http:0/example.com/a?b=c, getValue=null}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput198() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Attribute", "org.jsoup.nodes.Attribute", "toString", new String[]{}, new String[]{}, false, 4, new String[][]{{"org.jsoup.nodes.Attribute", "html", ""}, {"org.jsoup.nodes.Attribute", "setKey", "java.lang.String", "http:0/example.com/a?b=c"}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("http:0/example.com/a?b=c=\"{&quot;a&quot;:1}\"", String.valueOf(actual));
  assertEquals("receiver state after the call", "http:0/example.com/a?b=c=\"{&quot;a&quot;:1}\" {getKey=http:0/example.com/a?b=c, getValue={\"a\":1}}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput199() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jsoup.nodes.Attribute", "org.jsoup.nodes.Attribute", "isDataAttribute", new String[]{"java.lang.String"}, new String[]{"<null>"}, true, 0, null, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput200() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Attribute", "org.jsoup.nodes.Attribute", "html", new String[]{"java.lang.String", "java.lang.String", "java.lang.Appendable", "org.jsoup.nodes.Document$OutputSettings"}, new String[]{"1.1234567890123456", "=\"", "<sample:2>", "<sample:1>"}, true, 0, null, 3);
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput201() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Attribute", "org.jsoup.nodes.Attribute", "html", new String[]{"java.lang.Appendable", "org.jsoup.nodes.Document$OutputSettings"}, new String[]{"<sample:2>", "<sample:7>"}, false);
  assertNull(actual);
  assertEquals("receiver state after the call", "a=\"0\" {getKey=a, getValue=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput202() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Attribute", "org.jsoup.nodes.Attribute", "toString", new String[]{}, new String[]{}, false, 10, new String[][]{}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("{\"a\":1}=\" x \t y \"", String.valueOf(actual));
  assertEquals("receiver state after the call", "{\"a\":1}=\" x \t y \" {getKey={\"a\":1}, getValue= x \t y }", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput203() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Attribute", "org.jsoup.nodes.Attribute", "isBooleanAttribute", new String[]{"java.lang.String"}, new String[]{"declare"}, true, 0, null, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput204() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jsoup.nodes.Attribute", "org.jsoup.nodes.Attribute", "shouldCollapseAttribute", new String[]{"java.lang.String", "java.lang.String", "org.jsoup.nodes.Document$OutputSettings"}, new String[]{"-0<0", "default", "<null>"}, true); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput205() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Attribute", "org.jsoup.nodes.Attribute", "setValue", new String[]{"java.lang.String"}, new String[]{"a,\nD"}, false, 1, new String[][]{{"org.jsoup.nodes.Attribute", "isBooleanAttribute", ""}, {"org.jsoup.nodes.Attribute", "setValue", "java.lang.String", "+1"}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("", String.valueOf(actual));
  assertEquals("receiver state after the call", "0=\"a,\nD\" {getKey=0, getValue=a,\nD}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput206() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Attribute", "org.jsoup.nodes.Attribute", "setValue", new String[]{"java.lang.String"}, new String[]{"1.3_"}, false, 1, new String[][]{{"org.jsoup.nodes.Attribute", "equals", "java.lang.Object", "<sample:0>"}, {"org.jsoup.nodes.Attribute", "setValue", "java.lang.String", "TITLE"}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("", String.valueOf(actual));
  assertEquals("receiver state after the call", "0=\"1.3_\" {getKey=0, getValue=1.3_}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput207() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Attribute", "org.jsoup.nodes.Attribute", "setValue", new String[]{"java.lang.String"}, new String[]{".3_"}, false, 1, new String[][]{{"org.jsoup.nodes.Attribute", "equals", "java.lang.Object", "<sample:0>"}, {"org.jsoup.nodes.Attribute", "setValue", "java.lang.String", "TITLE"}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("", String.valueOf(actual));
  assertEquals("receiver state after the call", "0=\".3_\" {getKey=0, getValue=.3_}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput208() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Attribute", "org.jsoup.nodes.Attribute", "setValue", new String[]{"java.lang.String"}, new String[]{".33_"}, false, 1, new String[][]{{"org.jsoup.nodes.Attribute", "equals", "java.lang.Object", "<sample:0>"}, {"org.jsoup.nodes.Attribute", "setValue", "java.lang.String", "TITLE"}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("", String.valueOf(actual));
  assertEquals("receiver state after the call", "0=\".33_\" {getKey=0, getValue=.33_}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput209() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jsoup.nodes.Attribute", "org.jsoup.nodes.Attribute", "setValue", new String[]{"java.lang.String"}, new String[]{".33_"}, false, 2, new String[][]{{"org.jsoup.nodes.Attribute", "equals", "java.lang.Object", "<sample:0>"}, {"org.jsoup.nodes.Attribute", "setValue", "java.lang.String", "TITLE"}}, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput210() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Attribute", "org.jsoup.nodes.Attribute", "isBooleanAttribute", new String[]{}, new String[]{}, false, 5, new String[][]{}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "0=\"sample\" {getKey=0, getValue=sample}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput211() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Attribute", "org.jsoup.nodes.Attribute", "isBooleanAttribute", new String[]{}, new String[]{}, false, 6, new String[][]{}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "a=\"0\" {getKey=a, getValue=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput212() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jsoup.nodes.Attribute", "org.jsoup.nodes.Attribute", "isBooleanAttribute", new String[]{}, new String[]{}, false, 7, new String[][]{}, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput213() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Attribute", "org.jsoup.nodes.Attribute", "isBooleanAttribute", new String[]{}, new String[]{}, false, 8, new String[][]{{"org.jsoup.nodes.Attribute", "hashCode", ""}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "<a><b>t</b></a>=\"{&quot;a&quot;:1}\" {getKey=<a><b>t</b></a>, getValue={\"a\":1}}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput214() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Attribute", "org.jsoup.nodes.Attribute", "isBooleanAttribute", new String[]{}, new String[]{}, false, 10, new String[][]{{"org.jsoup.nodes.Attribute", "hashCode", ""}, {"org.jsoup.nodes.Attribute", "hashCode", ""}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{\"a\":1}=\" x \t y \" {getKey={\"a\":1}, getValue= x \t y }", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput215() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jsoup.nodes.Attribute", "org.jsoup.nodes.Attribute", "html", new String[]{"java.lang.Appendable", "org.jsoup.nodes.Document$OutputSettings"}, new String[]{"<null>", "<sample:2>"}, false, 0, new String[][]{{"org.jsoup.nodes.Attribute", "shouldCollapseAttribute", "org.jsoup.nodes.Document$OutputSettings", "<sample:5>"}, {"org.jsoup.nodes.Attribute", "getKey", ""}}, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput216() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Attribute", "org.jsoup.nodes.Attribute", "html", new String[]{"java.lang.Appendable", "org.jsoup.nodes.Document$OutputSettings"}, new String[]{"<empty>", "<sample:2>"}, false, 0, new String[][]{{"org.jsoup.nodes.Attribute", "shouldCollapseAttribute", "org.jsoup.nodes.Document$OutputSettings", "<sample:5>"}, {"org.jsoup.nodes.Attribute", "getKey", ""}}, 1);
  assertNull(actual);
  assertEquals("receiver state after the call", "a=\"0\" {getKey=a, getValue=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput217() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jsoup.nodes.Attribute", "org.jsoup.nodes.Attribute", "html", new String[]{"java.lang.Appendable", "org.jsoup.nodes.Document$OutputSettings"}, new String[]{"<sample:0>", "<null>"}, false, 0, new String[][]{{"org.jsoup.nodes.Attribute", "shouldCollapseAttribute", "org.jsoup.nodes.Document$OutputSettings", "<sample:1>"}, {"org.jsoup.nodes.Attribute", "getKey", ""}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput218() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Attribute", "org.jsoup.nodes.Attribute", "html", new String[]{"java.lang.Appendable", "org.jsoup.nodes.Document$OutputSettings"}, new String[]{"<sample:3>", "<sample:2>"}, false, 2, new String[][]{});
  assertNull(actual);
  assertEquals("receiver state after the call", "sample=\"\" {getKey=sample, getValue=}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput219() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Attribute", "org.jsoup.nodes.Attribute", "isDataAttribute", new String[]{}, new String[]{}, false, 2, new String[][]{{"org.jsoup.nodes.Attribute", "clone", ""}, {"org.jsoup.nodes.Attribute", "setKey", "java.lang.String", "defer"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "defer {getKey=defer, getValue=}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput220() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Attribute", "org.jsoup.nodes.Attribute", "isDataAttribute", new String[]{}, new String[]{}, false, 2, new String[][]{{"org.jsoup.nodes.Attribute", "clone", ""}, {"org.jsoup.nodes.Attribute", "setKey", "java.lang.String", "cefer"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "cefer=\"\" {getKey=cefer, getValue=}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput221() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Attribute", "org.jsoup.nodes.Attribute", "html", new String[]{}, new String[]{}, false, 17, new String[][]{{"org.jsoup.nodes.Attribute", "isBooleanAttribute", ""}, {"org.jsoup.nodes.Attribute", "isDataAttribute", ""}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("0=\"sample\"", String.valueOf(actual));
  assertEquals("receiver state after the call", "0=\"sample\" {getKey=0, getValue=sample}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput222() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Attribute", "org.jsoup.nodes.Attribute", "html", new String[]{}, new String[]{}, false, 18, new String[][]{{"org.jsoup.nodes.Attribute", "isBooleanAttribute", ""}, {"org.jsoup.nodes.Attribute", "isDataAttribute", ""}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("a=\"0\"", String.valueOf(actual));
  assertEquals("receiver state after the call", "a=\"0\" {getKey=a, getValue=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput223() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Attribute", "org.jsoup.nodes.Attribute", "html", new String[]{}, new String[]{}, false, 19, new String[][]{{"org.jsoup.nodes.Attribute", "isBooleanAttribute", ""}, {"org.jsoup.nodes.Attribute", "isDataAttribute", ""}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("null", String.valueOf(actual));
  assertEquals("receiver state after the call", "null {getKey=null, getValue=null}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput224() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Attribute", "org.jsoup.nodes.Attribute", "html", new String[]{}, new String[]{}, false, 20, new String[][]{{"org.jsoup.nodes.Attribute", "isBooleanAttribute", ""}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("x \t y=\"line1\n\nline3\"", String.valueOf(actual));
  assertEquals("receiver state after the call", "x \t y=\"line1\n\nline3\" {getKey=x \t y, getValue=line1\n\nline3}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput225() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Attribute", "org.jsoup.nodes.Attribute", "html", new String[]{}, new String[]{}, false, 22, new String[][]{{"org.jsoup.nodes.Attribute", "isBooleanAttribute", ""}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("line1\n\nline3=\"\n\"", String.valueOf(actual));
  assertEquals("receiver state after the call", "line1\n\nline3=\"\n\" {getKey=line1\n\nline3, getValue=\n}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput226() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Attribute", "org.jsoup.nodes.Attribute", "equals", new String[]{"java.lang.Object"}, new String[]{"<null>"}, false, 2, new String[][]{{"org.jsoup.nodes.Attribute", "toString", ""}, {"org.jsoup.nodes.Attribute", "clone", ""}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "sample=\"\" {getKey=sample, getValue=}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput227() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Attribute", "org.jsoup.nodes.Attribute", "equals", new String[]{"java.lang.Object"}, new String[]{"<s:key>"}, false, 2, new String[][]{{"org.jsoup.nodes.Attribute", "toString", ""}, {"org.jsoup.nodes.Attribute", "clone", ""}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "sample=\"\" {getKey=sample, getValue=}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput228() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Attribute", "org.jsoup.nodes.Attribute", "equals", new String[]{"java.lang.Object"}, new String[]{"<s:ddkePy>"}, false, 5, new String[][]{}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "0=\"sample\" {getKey=0, getValue=sample}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput229() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Attribute", "org.jsoup.nodes.Attribute", "equals", new String[]{"java.lang.Object"}, new String[]{"<i:0>"}, false, 6, new String[][]{}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "a=\"0\" {getKey=a, getValue=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput230() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Attribute", "org.jsoup.nodes.Attribute", "toString", new String[]{}, new String[]{}, false, 6, new String[][]{{"org.jsoup.nodes.Attribute", "html", "java.lang.Appendable,org.jsoup.nodes.Document$OutputSettings", "<empty>", "<sample:1>"}, {"org.jsoup.nodes.Attribute", "shouldCollapseAttribute", "org.jsoup.nodes.Document$OutputSettings", "<sample:4>"}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("a=\"0\"", String.valueOf(actual));
  assertEquals("receiver state after the call", "a=\"0\" {getKey=a, getValue=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput231() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Attribute", "org.jsoup.nodes.Attribute", "toString", new String[]{}, new String[]{}, false, 7, new String[][]{{"org.jsoup.nodes.Attribute", "html", "java.lang.Appendable,org.jsoup.nodes.Document$OutputSettings", "<empty>", "<sample:1>"}, {"org.jsoup.nodes.Attribute", "shouldCollapseAttribute", "org.jsoup.nodes.Document$OutputSettings", "<sample:7>"}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("null", String.valueOf(actual));
  assertEquals("receiver state after the call", "null {getKey=null, getValue=null}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput232() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Attribute", "org.jsoup.nodes.Attribute", "toString", new String[]{}, new String[]{}, false, 8, new String[][]{{"org.jsoup.nodes.Attribute", "html", "java.lang.Appendable,org.jsoup.nodes.Document$OutputSettings", "<empty>", "<sample:1>"}, {"org.jsoup.nodes.Attribute", "shouldCollapseAttribute", "org.jsoup.nodes.Document$OutputSettings", "<sample:6>"}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("<a><b>t</b></a>=\"{&quot;a&quot;:1}\"", String.valueOf(actual));
  assertEquals("receiver state after the call", "<a><b>t</b></a>=\"{&quot;a&quot;:1}\" {getKey=<a><b>t</b></a>, getValue={\"a\":1}}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput233() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Attribute", "org.jsoup.nodes.Attribute", "toString", new String[]{}, new String[]{}, false, 9, new String[][]{{"org.jsoup.nodes.Attribute", "html", "java.lang.Appendable,org.jsoup.nodes.Document$OutputSettings", "<empty>", "<sample:1>"}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("0=\"sample\"", String.valueOf(actual));
  assertEquals("receiver state after the call", "0=\"sample\" {getKey=0, getValue=sample}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput234() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Attribute", "org.jsoup.nodes.Attribute", "toString", new String[]{}, new String[]{}, false, 10, new String[][]{{"org.jsoup.nodes.Attribute", "html", "java.lang.Appendable,org.jsoup.nodes.Document$OutputSettings", "<empty>", "<sample:1>"}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("{\"a\":1}=\" x \t y \"", String.valueOf(actual));
  assertEquals("receiver state after the call", "{\"a\":1}=\" x \t y \" {getKey={\"a\":1}, getValue= x \t y }", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput235() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jsoup.nodes.Attribute", "org.jsoup.nodes.Attribute", "createFromEncoded", new String[]{"java.lang.String", "java.lang.String"}, new String[]{"allowfullscreen", "5.dFHault"}, true, 0, null, 2), new String[][]{{"html", "", "4"}, {"setValue", "java.lang.String", "1"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput236() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Attribute", "org.jsoup.nodes.Attribute", "getKey", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.jsoup.nodes.Attribute", "getKey", ""}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("a", String.valueOf(actual));
  assertEquals("receiver state after the call", "a=\"0\" {getKey=a, getValue=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput237() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Attribute", "org.jsoup.nodes.Attribute", "getKey", new String[]{}, new String[]{}, false, 1, new String[][]{{"org.jsoup.nodes.Attribute", "getKey", ""}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "0=\"sample\" {getKey=0, getValue=sample}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput238() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Attribute", "org.jsoup.nodes.Attribute", "getKey", new String[]{}, new String[]{}, false, 4, new String[][]{{"org.jsoup.nodes.Attribute", "html", "java.lang.Appendable,org.jsoup.nodes.Document$OutputSettings", "<sample:1>", "<sample:2>"}, {"org.jsoup.nodes.Attribute", "getValue", ""}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("<a><b>t</b></a>", String.valueOf(actual));
  assertEquals("receiver state after the call", "<a><b>t</b></a>=\"{&quot;a&quot;:1}\" {getKey=<a><b>t</b></a>, getValue={\"a\":1}}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput239() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Attribute", "org.jsoup.nodes.Attribute", "getKey", new String[]{}, new String[]{}, false, 2, new String[][]{{"org.jsoup.nodes.Attribute", "html", "java.lang.Appendable,org.jsoup.nodes.Document$OutputSettings", "<sample:1>", "<sample:2>"}, {"org.jsoup.nodes.Attribute", "html", ""}, {"org.jsoup.nodes.Attribute", "getValue", ""}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("sample", String.valueOf(actual));
  assertEquals("receiver state after the call", "sample=\"\" {getKey=sample, getValue=}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput240() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Attribute", "org.jsoup.nodes.Attribute", "getKey", new String[]{}, new String[]{}, false, 3, new String[][]{{"org.jsoup.nodes.Attribute", "html", "java.lang.Appendable,org.jsoup.nodes.Document$OutputSettings", "<sample:1>", "<sample:2>"}, {"org.jsoup.nodes.Attribute", "html", ""}, {"org.jsoup.nodes.Attribute", "getValue", ""}}, 1);
  assertNull(actual);
  assertEquals("receiver state after the call", "null {getKey=null, getValue=null}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput241() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Attribute", "org.jsoup.nodes.Attribute", "html", new String[]{"java.lang.String", "java.lang.String", "java.lang.Appendable", "org.jsoup.nodes.Document$OutputSettings"}, new String[]{"1", "1.1", "<empty>", "<sample:1>"}, true, 0, null, 2);
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput242() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Attribute", "org.jsoup.nodes.Attribute", "clone", new String[]{}, new String[]{}, false, 6, new String[][]{{"org.jsoup.nodes.Attribute", "isDataAttribute", ""}}, 1);
  assertNotNull(actual);
  assertEquals("org.jsoup.nodes.Attribute", actual.getClass().getName());
  assertEquals("a=\"0\" {getKey=a, getValue=0}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "a=\"0\" {getKey=a, getValue=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput243() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Attribute", "org.jsoup.nodes.Attribute", "clone", new String[]{}, new String[]{}, false, 6, new String[][]{{"org.jsoup.nodes.Attribute", "setKey", "java.lang.String", "PT1H"}, {"org.jsoup.nodes.Attribute", "isDataAttribute", ""}}, 1);
  assertNotNull(actual);
  assertEquals("org.jsoup.nodes.Attribute", actual.getClass().getName());
  assertEquals("PT1H=\"0\" {getKey=PT1H, getValue=0}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "PT1H=\"0\" {getKey=PT1H, getValue=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput244() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Attribute", "org.jsoup.nodes.Attribute", "html", new String[]{}, new String[]{}, false, 0, null, 1);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("a=\"0\"", String.valueOf(actual));
  assertEquals("receiver state after the call", "a=\"0\" {getKey=a, getValue=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput245() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Attribute", "org.jsoup.nodes.Attribute", "html", new String[]{}, new String[]{}, false, 1, new String[][]{}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("0=\"sample\"", String.valueOf(actual));
  assertEquals("receiver state after the call", "0=\"sample\" {getKey=0, getValue=sample}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput246() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Attribute", "org.jsoup.nodes.Attribute", "html", new String[]{}, new String[]{}, false, 2, new String[][]{}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("sample=\"\"", String.valueOf(actual));
  assertEquals("receiver state after the call", "sample=\"\" {getKey=sample, getValue=}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput247() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Attribute", "org.jsoup.nodes.Attribute", "html", new String[]{}, new String[]{}, false, 3, new String[][]{}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("null", String.valueOf(actual));
  assertEquals("receiver state after the call", "null {getKey=null, getValue=null}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput248() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Attribute", "org.jsoup.nodes.Attribute", "html", new String[]{}, new String[]{}, false, 4, new String[][]{}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("<a><b>t</b></a>=\"{&quot;a&quot;:1}\"", String.valueOf(actual));
  assertEquals("receiver state after the call", "<a><b>t</b></a>=\"{&quot;a&quot;:1}\" {getKey=<a><b>t</b></a>, getValue={\"a\":1}}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput249() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Attribute", "org.jsoup.nodes.Attribute", "setKey", new String[]{"java.lang.String"}, new String[]{"1"}, false, 0, new String[][]{{"org.jsoup.nodes.Attribute", "equals", "java.lang.Object", "<i:-2>"}}, 1);
  assertNull(actual);
  assertEquals("receiver state after the call", "1=\"0\" {getKey=1, getValue=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput250() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jsoup.nodes.Attribute", "org.jsoup.nodes.Attribute", "setKey", new String[]{"java.lang.String"}, new String[]{""}, false, 0, new String[][]{{"org.jsoup.nodes.Attribute", "equals", "java.lang.Object", "<i:-2>"}}, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput251() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Attribute", "org.jsoup.nodes.Attribute", "html", new String[]{}, new String[]{}, false, 8, new String[][]{{"org.jsoup.nodes.Attribute", "shouldCollapseAttribute", "org.jsoup.nodes.Document$OutputSettings", "<sample:2>"}, {"org.jsoup.nodes.Attribute", "getValue", ""}, {"org.jsoup.nodes.Attribute", "setKey", "java.lang.String", "nohref"}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("nohref=\"{&quot;a&quot;:1}\"", String.valueOf(actual));
  assertEquals("receiver state after the call", "nohref=\"{&quot;a&quot;:1}\" {getKey=nohref, getValue={\"a\":1}}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput252() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Attribute", "org.jsoup.nodes.Attribute", "html", new String[]{}, new String[]{}, false, 9, new String[][]{{"org.jsoup.nodes.Attribute", "shouldCollapseAttribute", "org.jsoup.nodes.Document$OutputSettings", "<sample:2>"}, {"org.jsoup.nodes.Attribute", "getValue", ""}, {"org.jsoup.nodes.Attribute", "setKey", "java.lang.String", "nohref"}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("nohref=\"sample\"", String.valueOf(actual));
  assertEquals("receiver state after the call", "nohref=\"sample\" {getKey=nohref, getValue=sample}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput253() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Attribute", "org.jsoup.nodes.Attribute", "html", new String[]{}, new String[]{}, false, 10, new String[][]{{"org.jsoup.nodes.Attribute", "shouldCollapseAttribute", "org.jsoup.nodes.Document$OutputSettings", "<sample:2>"}, {"org.jsoup.nodes.Attribute", "getValue", ""}, {"org.jsoup.nodes.Attribute", "setKey", "java.lang.String", "nohref"}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("nohref=\" x \t y \"", String.valueOf(actual));
  assertEquals("receiver state after the call", "nohref=\" x \t y \" {getKey=nohref, getValue= x \t y }", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput254() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Attribute", "org.jsoup.nodes.Attribute", "html", new String[]{}, new String[]{}, false, 10, new String[][]{{"org.jsoup.nodes.Attribute", "shouldCollapseAttribute", "org.jsoup.nodes.Document$OutputSettings", "<sample:2>"}, {"org.jsoup.nodes.Attribute", "getValue", ""}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("{\"a\":1}=\" x \t y \"", String.valueOf(actual));
  assertEquals("receiver state after the call", "{\"a\":1}=\" x \t y \" {getKey={\"a\":1}, getValue= x \t y }", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput255() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Attribute", "org.jsoup.nodes.Attribute", "html", new String[]{}, new String[]{}, false, 16, new String[][]{{"org.jsoup.nodes.Attribute", "shouldCollapseAttribute", "org.jsoup.nodes.Document$OutputSettings", "<sample:2>"}, {"org.jsoup.nodes.Attribute", "getValue", ""}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("x \t y=\"line1\n\nline3\"", String.valueOf(actual));
  assertEquals("receiver state after the call", "x \t y=\"line1\n\nline3\" {getKey=x \t y, getValue=line1\n\nline3}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput256() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Attribute", "org.jsoup.nodes.Attribute", "shouldCollapseAttribute", new String[]{"java.lang.String", "java.lang.String", "org.jsoup.nodes.Document$OutputSettings"}, new String[]{"nosesiyea", "1.kC2456789b12356", "<sample:0>"}, true, 0, null, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput257() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Attribute", "org.jsoup.nodes.Attribute", "createFromEncoded", new String[]{"java.lang.String", "java.lang.String"}, new String[]{"2020-01-01", "{\"9\":1}"}, true, 0, null, 2);
  assertNotNull(actual);
  assertEquals("org.jsoup.nodes.Attribute", actual.getClass().getName());
  assertEquals("2020-01-01=\"{&quot;9&quot;:1}\" {getKey=2020-01-01, getValue={\"9\":1}}", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput258() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jsoup.nodes.Attribute", "org.jsoup.nodes.Attribute", "createFromEncoded", new String[]{"java.lang.String", "java.lang.String"}, new String[]{"checked", "{\"9\":1}"}, true, 0, null, 2), new String[][]{{"clone", "", "5"}});
  assertNotNull(actual);
  assertEquals("org.jsoup.nodes.Attribute", actual.getClass().getName());
  assertEquals("checked=\"{&quot;9&quot;:1}\" {getKey=checked, getValue={\"9\":1}}", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput259() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jsoup.nodes.Attribute", "org.jsoup.nodes.Attribute", "createFromEncoded", new String[]{"java.lang.String", "java.lang.String"}, new String[]{"\thecked", "{\"9\":1}"}, true, 0, null, 2), new String[][]{{"clone", "", "5"}});
  assertNotNull(actual);
  assertEquals("org.jsoup.nodes.Attribute", actual.getClass().getName());
  assertEquals("hecked=\"{&quot;9&quot;:1}\" {getKey=hecked, getValue={\"9\":1}}", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput260() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jsoup.nodes.Attribute", "org.jsoup.nodes.Attribute", "createFromEncoded", new String[]{"java.lang.String", "java.lang.String"}, new String[]{"\thecjed", "{\"9\":1}"}, true, 0, null, 2), new String[][]{{"clone", "", "5"}});
  assertNotNull(actual);
  assertEquals("org.jsoup.nodes.Attribute", actual.getClass().getName());
  assertEquals("hecjed=\"{&quot;9&quot;:1}\" {getKey=hecjed, getValue={\"9\":1}}", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput261() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jsoup.nodes.Attribute", "org.jsoup.nodes.Attribute", "clone", new String[]{}, new String[]{}, false, 16, new String[][]{{"org.jsoup.nodes.Attribute", "html", "java.lang.Appendable,org.jsoup.nodes.Document$OutputSettings", "<null>", "<null>"}}, 2), new String[][]{{"setValue", "java.lang.String", "7"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput262() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jsoup.nodes.Attribute", "org.jsoup.nodes.Attribute", "clone", new String[]{}, new String[]{}, false, 17, new String[][]{{"org.jsoup.nodes.Attribute", "html", "java.lang.Appendable,org.jsoup.nodes.Document$OutputSettings", "<null>", "<null>"}}, 2), new String[][]{{"setValue", "java.lang.String", "7"}, {"setValue", "java.lang.String", "2"}, {"setKey", "java.lang.String", "1"}, {"html", "", "7"}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("a=\"0\"", String.valueOf(actual));
  assertEquals("receiver state after the call", "0=\"sample\" {getKey=0, getValue=sample}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput263() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Attribute", "org.jsoup.nodes.Attribute", "toString", new String[]{}, new String[]{}, false, 1, new String[][]{{"org.jsoup.nodes.Attribute", "isBooleanAttribute", ""}, {"org.jsoup.nodes.Attribute", "setKey", "java.lang.String", "1.4d"}, {"org.jsoup.nodes.Attribute", "setValue", "java.lang.String", "5/"}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("1.4d=\"5/\"", String.valueOf(actual));
  assertEquals("receiver state after the call", "1.4d=\"5/\" {getKey=1.4d, getValue=5/}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput264() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Attribute", "org.jsoup.nodes.Attribute", "toString", new String[]{}, new String[]{}, false, 2, new String[][]{{"org.jsoup.nodes.Attribute", "isBooleanAttribute", ""}, {"org.jsoup.nodes.Attribute", "setKey", "java.lang.String", "1.4d"}, {"org.jsoup.nodes.Attribute", "setValue", "java.lang.String", "5/"}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("1.4d=\"\"", String.valueOf(actual));
  assertEquals("receiver state after the call", "1.4d=\"\" {getKey=1.4d, getValue=}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput265() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Attribute", "org.jsoup.nodes.Attribute", "toString", new String[]{}, new String[]{}, false, 3, new String[][]{{"org.jsoup.nodes.Attribute", "isBooleanAttribute", ""}, {"org.jsoup.nodes.Attribute", "setKey", "java.lang.String", "1.4d"}, {"org.jsoup.nodes.Attribute", "setValue", "java.lang.String", "5/"}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("1.4d", String.valueOf(actual));
  assertEquals("receiver state after the call", "1.4d {getKey=1.4d, getValue=null}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput266() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Attribute", "org.jsoup.nodes.Attribute", "toString", new String[]{}, new String[]{}, false, 4, new String[][]{{"org.jsoup.nodes.Attribute", "isBooleanAttribute", ""}, {"org.jsoup.nodes.Attribute", "setKey", "java.lang.String", "1.4d"}, {"org.jsoup.nodes.Attribute", "setValue", "java.lang.String", "5/"}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("1.4d=\"{&quot;a&quot;:1}\"", String.valueOf(actual));
  assertEquals("receiver state after the call", "1.4d=\"{&quot;a&quot;:1}\" {getKey=1.4d, getValue={\"a\":1}}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput267() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Attribute", "org.jsoup.nodes.Attribute", "isBooleanAttribute", new String[]{}, new String[]{}, false, 1, new String[][]{{"org.jsoup.nodes.Attribute", "setValue", "java.lang.String", "PT1H"}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "0=\"PT1H\" {getKey=0, getValue=PT1H}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput268() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Attribute", "org.jsoup.nodes.Attribute", "html", new String[]{}, new String[]{}, false, 5, new String[][]{{"org.jsoup.nodes.Attribute", "toString", ""}, {"org.jsoup.nodes.Attribute", "setValue", "java.lang.String", "1.25"}, {"org.jsoup.nodes.Attribute", "html", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("0=\"1.25\"", String.valueOf(actual));
  assertEquals("receiver state after the call", "0=\"1.25\" {getKey=0, getValue=1.25}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput269() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Attribute", "org.jsoup.nodes.Attribute", "html", new String[]{}, new String[]{}, false, 9, new String[][]{{"org.jsoup.nodes.Attribute", "toString", ""}, {"org.jsoup.nodes.Attribute", "setValue", "java.lang.String", ""}, {"org.jsoup.nodes.Attribute", "html", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("0=\"\"", String.valueOf(actual));
  assertEquals("receiver state after the call", "0=\"\" {getKey=0, getValue=}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput270() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Attribute", "org.jsoup.nodes.Attribute", "html", new String[]{}, new String[]{}, false, 14, new String[][]{{"org.jsoup.nodes.Attribute", "getKey", ""}, {"org.jsoup.nodes.Attribute", "getValue", ""}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("{\"a\":1}=\" x \t y \"", String.valueOf(actual));
  assertEquals("receiver state after the call", "{\"a\":1}=\" x \t y \" {getKey={\"a\":1}, getValue= x \t y }", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput271() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Attribute", "org.jsoup.nodes.Attribute", "html", new String[]{}, new String[]{}, false, 4, new String[][]{{"org.jsoup.nodes.Attribute", "getKey", ""}, {"org.jsoup.nodes.Attribute", "getKey", ""}, {"org.jsoup.nodes.Attribute", "getValue", ""}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("<a><b>t</b></a>=\"{&quot;a&quot;:1}\"", String.valueOf(actual));
  assertEquals("receiver state after the call", "<a><b>t</b></a>=\"{&quot;a&quot;:1}\" {getKey=<a><b>t</b></a>, getValue={\"a\":1}}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput272() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Attribute", "org.jsoup.nodes.Attribute", "isBooleanAttribute", new String[]{}, new String[]{}, false, 2, new String[][]{{"org.jsoup.nodes.Attribute", "equals", "java.lang.Object", "<s:key>"}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "sample=\"\" {getKey=sample, getValue=}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput273() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Attribute", "org.jsoup.nodes.Attribute", "isBooleanAttribute", new String[]{}, new String[]{}, false, 7, new String[][]{{"org.jsoup.nodes.Attribute", "setKey", "java.lang.String", "220-02-30T25:61:61"}, {"org.jsoup.nodes.Attribute", "isDataAttribute", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
  assertEquals("receiver state after the call", "220-02-30T25:61:61 {getKey=220-02-30T25:61:61, getValue=null}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput274() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jsoup.nodes.Attribute", "org.jsoup.nodes.Attribute", "isDataAttribute", new String[]{"java.lang.String"}, new String[]{"<null>"}, true, 0, null, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput275() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Attribute", "org.jsoup.nodes.Attribute", "toString", new String[]{}, new String[]{}, false, 21, new String[][]{{"org.jsoup.nodes.Attribute", "getKey", ""}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("0=\"sample\"", String.valueOf(actual));
  assertEquals("receiver state after the call", "0=\"sample\" {getKey=0, getValue=sample}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput276() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Attribute", "org.jsoup.nodes.Attribute", "toString", new String[]{}, new String[]{}, false, 22, new String[][]{{"org.jsoup.nodes.Attribute", "getKey", ""}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("line1\n\nline3=\"\n\"", String.valueOf(actual));
  assertEquals("receiver state after the call", "line1\n\nline3=\"\n\" {getKey=line1\n\nline3, getValue=\n}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput277() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Attribute", "org.jsoup.nodes.Attribute", "toString", new String[]{}, new String[]{}, false, 23, new String[][]{{"org.jsoup.nodes.Attribute", "getKey", ""}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("null", String.valueOf(actual));
  assertEquals("receiver state after the call", "null {getKey=null, getValue=null}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput278() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Attribute", "org.jsoup.nodes.Attribute", "toString", new String[]{}, new String[]{}, false, 24, new String[][]{}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("a=\"0\"", String.valueOf(actual));
  assertEquals("receiver state after the call", "a=\"0\" {getKey=a, getValue=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput279() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jsoup.nodes.Attribute", "org.jsoup.nodes.Attribute", "setValue", new String[]{"java.lang.String"}, new String[]{"a,b,c"}, false, 0, null, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput280() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Attribute", "org.jsoup.nodes.Attribute", "setValue", new String[]{"java.lang.String"}, new String[]{"a,b,c"}, false, 1, new String[][]{}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("", String.valueOf(actual));
  assertEquals("receiver state after the call", "0=\"a,b,c\" {getKey=0, getValue=a,b,c}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput281() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Attribute", "org.jsoup.nodes.Attribute", "setValue", new String[]{"java.lang.String"}, new String[]{"`,b,c"}, false, 1, new String[][]{}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("", String.valueOf(actual));
  assertEquals("receiver state after the call", "0=\"`,b,c\" {getKey=0, getValue=`,b,c}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput282() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Attribute", "org.jsoup.nodes.Attribute", "setValue", new String[]{"java.lang.String"}, new String[]{"`,w,c"}, false, 1, new String[][]{}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("", String.valueOf(actual));
  assertEquals("receiver state after the call", "0=\"`,w,c\" {getKey=0, getValue=`,w,c}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput283() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Attribute", "org.jsoup.nodes.Attribute", "setValue", new String[]{"java.lang.String"}, new String[]{"`,w0,Ec"}, false, 1, new String[][]{{"org.jsoup.nodes.Attribute", "hashCode", ""}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("", String.valueOf(actual));
  assertEquals("receiver state after the call", "0=\"`,w0,Ec\" {getKey=0, getValue=`,w0,Ec}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput284() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Attribute", "org.jsoup.nodes.Attribute", "setValue", new String[]{"java.lang.String"}, new String[]{"`,w0,EEc"}, false, 1, new String[][]{{"org.jsoup.nodes.Attribute", "hashCode", ""}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("", String.valueOf(actual));
  assertEquals("receiver state after the call", "0=\"`,w0,EEc\" {getKey=0, getValue=`,w0,EEc}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput285() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Attribute", "org.jsoup.nodes.Attribute", "isDataAttribute", new String[]{}, new String[]{}, false, 2, new String[][]{{"org.jsoup.nodes.Attribute", "setValue", "java.lang.String", "0xFFFFFFFF"}, {"org.jsoup.nodes.Attribute", "hashCode", ""}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "sample=\"\" {getKey=sample, getValue=}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput286() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jsoup.nodes.Attribute", "org.jsoup.nodes.Attribute", "isDataAttribute", new String[]{}, new String[]{}, false, 3, new String[][]{{"org.jsoup.nodes.Attribute", "setValue", "java.lang.String", "/xFFFFFFFF"}, {"org.jsoup.nodes.Attribute", "hashCode", ""}}, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput287() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Attribute", "org.jsoup.nodes.Attribute", "isDataAttribute", new String[]{}, new String[]{}, false, 4, new String[][]{{"org.jsoup.nodes.Attribute", "html", "java.lang.Appendable,org.jsoup.nodes.Document$OutputSettings", "<sample:1>", "<sample:1>"}, {"org.jsoup.nodes.Attribute", "setValue", "java.lang.String", "/xFFFFFFFF"}, {"org.jsoup.nodes.Attribute", "hashCode", ""}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "<a><b>t</b></a>=\"{&quot;a&quot;:1}\" {getKey=<a><b>t</b></a>, getValue={\"a\":1}}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput288() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Attribute", "org.jsoup.nodes.Attribute", "isDataAttribute", new String[]{}, new String[]{}, false, 5, new String[][]{{"org.jsoup.nodes.Attribute", "html", "java.lang.Appendable,org.jsoup.nodes.Document$OutputSettings", "<sample:1>", "<sample:1>"}, {"org.jsoup.nodes.Attribute", "setValue", "java.lang.String", "/xFFFFFFFF"}, {"org.jsoup.nodes.Attribute", "hashCode", ""}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "0=\"/xFFFFFFFF\" {getKey=0, getValue=/xFFFFFFFF}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput289() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Attribute", "org.jsoup.nodes.Attribute", "isDataAttribute", new String[]{}, new String[]{}, false, 6, new String[][]{{"org.jsoup.nodes.Attribute", "html", "java.lang.Appendable,org.jsoup.nodes.Document$OutputSettings", "<sample:1>", "<sample:1>"}, {"org.jsoup.nodes.Attribute", "setValue", "java.lang.String", "/xFFFFFFFF"}, {"org.jsoup.nodes.Attribute", "hashCode", ""}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "a=\"0\" {getKey=a, getValue=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput290() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Attribute", "org.jsoup.nodes.Attribute", "clone", new String[]{}, new String[]{}, false, 2, new String[][]{{"org.jsoup.nodes.Attribute", "equals", "java.lang.Object", "<sample:0>"}}, 3);
  assertNotNull(actual);
  assertEquals("org.jsoup.nodes.Attribute", actual.getClass().getName());
  assertEquals("sample=\"\" {getKey=sample, getValue=}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "sample=\"\" {getKey=sample, getValue=}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput291() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Attribute", "org.jsoup.nodes.Attribute", "hashCode", new String[]{}, new String[]{}, false, 8, new String[][]{}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("1630186666", String.valueOf(actual));
  assertEquals("receiver state after the call", "<a><b>t</b></a>=\"{&quot;a&quot;:1}\" {getKey=<a><b>t</b></a>, getValue={\"a\":1}}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput292() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Attribute", "org.jsoup.nodes.Attribute", "hashCode", new String[]{}, new String[]{}, false, 9, new String[][]{}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("-909673606", String.valueOf(actual));
  assertEquals("receiver state after the call", "0=\"sample\" {getKey=0, getValue=sample}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput293() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Attribute", "org.jsoup.nodes.Attribute", "hashCode", new String[]{}, new String[]{}, false, 2, new String[][]{}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("1864843158", String.valueOf(actual));
  assertEquals("receiver state after the call", "sample=\"\" {getKey=sample, getValue=}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput294() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Attribute", "org.jsoup.nodes.Attribute", "hashCode", new String[]{}, new String[]{}, false, 3, new String[][]{}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "null {getKey=null, getValue=null}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput295() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Attribute", "org.jsoup.nodes.Attribute", "createFromEncoded", new String[]{"java.lang.String", "java.lang.String"}, new String[]{"-1.5", "\t"}, true, 0, null, 2);
  assertNotNull(actual);
  assertEquals("org.jsoup.nodes.Attribute", actual.getClass().getName());
  assertEquals("-1.5=\"\t\" {getKey=-1.5, getValue=\t}", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput296() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Attribute", "org.jsoup.nodes.Attribute", "getKey", new String[]{}, new String[]{}, false, 11, new String[][]{{"org.jsoup.nodes.Attribute", "getKey", ""}, {"org.jsoup.nodes.Attribute", "html", "java.lang.Appendable,org.jsoup.nodes.Document$OutputSettings", "<sample:0>", "<sample:7>"}}, 2);
  assertNull(actual);
  assertEquals("receiver state after the call", "null {getKey=null, getValue=null}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput297() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Attribute", "org.jsoup.nodes.Attribute", "getValue", new String[]{}, new String[]{}, false, 5, new String[][]{{"org.jsoup.nodes.Attribute", "html", "java.lang.Appendable,org.jsoup.nodes.Document$OutputSettings", "<sample:1>", "<sample:5>"}, {"org.jsoup.nodes.Attribute", "isDataAttribute", ""}, {"org.jsoup.nodes.Attribute", "shouldCollapseAttribute", "org.jsoup.nodes.Document$OutputSettings", "<sample:2>"}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("sample", String.valueOf(actual));
  assertEquals("receiver state after the call", "0=\"sample\" {getKey=0, getValue=sample}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput298() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Attribute", "org.jsoup.nodes.Attribute", "getValue", new String[]{}, new String[]{}, false, 6, new String[][]{{"org.jsoup.nodes.Attribute", "isDataAttribute", ""}, {"org.jsoup.nodes.Attribute", "shouldCollapseAttribute", "org.jsoup.nodes.Document$OutputSettings", "<sample:2>"}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "a=\"0\" {getKey=a, getValue=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput299() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Attribute", "org.jsoup.nodes.Attribute", "isBooleanAttribute", new String[]{"java.lang.String"}, new String[]{"defer"}, true, 0, null, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
 }
}
