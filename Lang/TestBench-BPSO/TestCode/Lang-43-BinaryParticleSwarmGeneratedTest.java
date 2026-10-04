package generated.algorithm;

import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;
import static org.junit.Assert.*;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class BinaryParticleSwarmGeneratedTest {
 @Test(timeout = 20000)
 public void generatedInput000() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.text.ExtendedMessageFormat", "org.apache.commons.lang.text.ExtendedMessageFormat", "applyPattern", new String[]{"java.lang.String"}, new String[]{"F,b,c"}, false, 0, new String[][]{{"org.apache.commons.lang.text.ExtendedMessageFormat", "applyPattern", "java.lang.String", ".544"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getFormats=[], getFormatsByArgumentIndex=[]}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput001() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.lang.text.ExtendedMessageFormat", "org.apache.commons.lang.text.ExtendedMessageFormat", "setFormat", new String[]{"int", "java.text.Format"}, new String[]{"16", "<sample:4>"}, false); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.UnsupportedOperationException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput002() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.lang.text.ExtendedMessageFormat", "org.apache.commons.lang.text.ExtendedMessageFormat", "setFormatsByArgumentIndex", new String[]{"java.text.Format[]"}, new String[]{"<empty>"}, false, 4, new String[][]{}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.UnsupportedOperationException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput003() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.text.ExtendedMessageFormat", "org.apache.commons.lang.text.ExtendedMessageFormat", "applyPattern", new String[]{"java.lang.String"}, new String[]{"a,b,c"}, false, 0, null, 3);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getFormats=[], getFormatsByArgumentIndex=[]}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput004() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.text.ExtendedMessageFormat", "org.apache.commons.lang.text.ExtendedMessageFormat", "toPattern", new String[]{}, new String[]{}, false, 5, new String[][]{});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getFormats=[], getFormatsByArgumentIndex=[]}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput005() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.lang.text.ExtendedMessageFormat", "org.apache.commons.lang.text.ExtendedMessageFormat", "setFormatsByArgumentIndex", new String[]{"java.text.Format[]"}, new String[]{"<null>"}, false, 0, null, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.UnsupportedOperationException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput006() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.lang.text.ExtendedMessageFormat", "org.apache.commons.lang.text.ExtendedMessageFormat", "setFormats", new String[]{"java.text.Format[]"}, new String[]{"<empty>"}, false, 2, new String[][]{}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.UnsupportedOperationException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput007() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.lang.text.ExtendedMessageFormat", "org.apache.commons.lang.text.ExtendedMessageFormat", "setFormatByArgumentIndex", new String[]{"int", "java.text.Format"}, new String[]{"-1", "<null>"}, false, 0, new String[][]{{"org.apache.commons.lang.text.ExtendedMessageFormat", "setFormat", "int,java.text.Format", "126", "<sample:1>"}}, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.UnsupportedOperationException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput008() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.lang.text.ExtendedMessageFormat", "org.apache.commons.lang.text.ExtendedMessageFormat", "setFormats", new String[]{"java.text.Format[]"}, new String[]{"<sample:2>"}, false, 3, new String[][]{{"org.apache.commons.lang.text.ExtendedMessageFormat", "toPattern", ""}}, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.UnsupportedOperationException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput009() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.text.ExtendedMessageFormat", "org.apache.commons.lang.text.ExtendedMessageFormat", "toPattern", new String[]{}, new String[]{}, false);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("a", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getFormats=[], getFormatsByArgumentIndex=[]}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput010() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.text.ExtendedMessageFormat", "org.apache.commons.lang.text.ExtendedMessageFormat", "applyPattern", new String[]{"java.lang.String"}, new String[]{"2"}, false, 1, new String[][]{{"org.apache.commons.lang.text.ExtendedMessageFormat", "setFormatByArgumentIndex", "int,java.text.Format", "-8388485", "<sample:6>"}}, 2);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getFormats=[], getFormatsByArgumentIndex=[]}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput011() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.lang.text.ExtendedMessageFormat", "org.apache.commons.lang.text.ExtendedMessageFormat", "setFormat", new String[]{"int", "java.text.Format"}, new String[]{"0", "<sample:7>"}, false, 0, new String[][]{{"org.apache.commons.lang.text.ExtendedMessageFormat", "applyPattern", "java.lang.String", "F,b-c"}}, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.UnsupportedOperationException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput012() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.lang.text.ExtendedMessageFormat", "org.apache.commons.lang.text.ExtendedMessageFormat", "setFormats", new String[]{"java.text.Format[]"}, new String[]{"<sample:0>"}, false, 0, null, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.UnsupportedOperationException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput013() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.lang.text.ExtendedMessageFormat", "org.apache.commons.lang.text.ExtendedMessageFormat", "setFormatByArgumentIndex", new String[]{"int", "java.text.Format"}, new String[]{"16", "<null>"}, false, 7, new String[][]{{"org.apache.commons.lang.text.ExtendedMessageFormat", "setFormats", "java.text.Format[]", "<sample:0>"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.UnsupportedOperationException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput014() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.lang.text.ExtendedMessageFormat", "org.apache.commons.lang.text.ExtendedMessageFormat", "setFormat", new String[]{"int", "java.text.Format"}, new String[]{"-1073741824", "<sample:1>"}, false, 0, null, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.UnsupportedOperationException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput015() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.lang.text.ExtendedMessageFormat", "org.apache.commons.lang.text.ExtendedMessageFormat", "setFormatsByArgumentIndex", new String[]{"java.text.Format[]"}, new String[]{"<sample:0>"}, false, 0, new String[][]{{"org.apache.commons.lang.text.ExtendedMessageFormat", "toPattern", ""}, {"org.apache.commons.lang.text.ExtendedMessageFormat", "applyPattern", "java.lang.String", "2020,01-01"}}, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.UnsupportedOperationException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput016() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.lang.text.ExtendedMessageFormat", "org.apache.commons.lang.text.ExtendedMessageFormat", "applyPattern", new String[]{"java.lang.String"}, new String[]{"{\"a\":1}2020-02-30T25:61:61"}, false, 2, new String[][]{{"org.apache.commons.lang.text.ExtendedMessageFormat", "toPattern", ""}, {"org.apache.commons.lang.text.ExtendedMessageFormat", "setFormatByArgumentIndex", "int,java.text.Format", "36", "<sample:9>"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput017() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.text.ExtendedMessageFormat", "org.apache.commons.lang.text.ExtendedMessageFormat", "applyPattern", new String[]{"java.lang.String"}, new String[]{".5441.1234567"}, false, 2, new String[][]{{"org.apache.commons.lang.text.ExtendedMessageFormat", "setFormatByArgumentIndex", "int,java.text.Format", "488", "<sample:5>"}}, 1);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getFormats=[], getFormatsByArgumentIndex=[]}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput018() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.lang.text.ExtendedMessageFormat", "org.apache.commons.lang.text.ExtendedMessageFormat", "applyPattern", new String[]{"java.lang.String"}, new String[]{"<null>"}, false, 4, new String[][]{{"org.apache.commons.lang.text.ExtendedMessageFormat", "setFormatsByArgumentIndex", "java.text.Format[]", "<sample:0>"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput019() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.text.ExtendedMessageFormat", "org.apache.commons.lang.text.ExtendedMessageFormat", "toPattern", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.lang.text.ExtendedMessageFormat", "toPattern", ""}, {"org.apache.commons.lang.text.ExtendedMessageFormat", "applyPattern", "java.lang.String", "BPT\u00e9H"}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("BPT\u00e9H", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getFormats=[], getFormatsByArgumentIndex=[]}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput020() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.lang.text.ExtendedMessageFormat", "org.apache.commons.lang.text.ExtendedMessageFormat", "setFormats", new String[]{"java.text.Format[]"}, new String[]{"<sample:0>"}, false, 0, new String[][]{{"org.apache.commons.lang.text.ExtendedMessageFormat", "setFormat", "int,java.text.Format", "-2147483648", "<sample:6>"}}, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.UnsupportedOperationException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput021() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.text.ExtendedMessageFormat", "org.apache.commons.lang.text.ExtendedMessageFormat", "toPattern", new String[]{}, new String[]{}, false, 2, new String[][]{{"org.apache.commons.lang.text.ExtendedMessageFormat", "setFormatsByArgumentIndex", "java.text.Format[]", "<sample:3>"}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("sample", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getFormats=[], getFormatsByArgumentIndex=[]}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput022() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.lang.text.ExtendedMessageFormat", "org.apache.commons.lang.text.ExtendedMessageFormat", "setFormat", new String[]{"int", "java.text.Format"}, new String[]{"18", "<sample:2>"}, false, 0, new String[][]{{"org.apache.commons.lang.text.ExtendedMessageFormat", "setFormats", "java.text.Format[]", "<empty>"}, {"org.apache.commons.lang.text.ExtendedMessageFormat", "setFormatByArgumentIndex", "int,java.text.Format", "-2147483648", "<sample:5>"}}, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.UnsupportedOperationException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput023() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.lang.text.ExtendedMessageFormat", "org.apache.commons.lang.text.ExtendedMessageFormat", "setFormatByArgumentIndex", new String[]{"int", "java.text.Format"}, new String[]{"126", "<sample:6>"}, false, 3, new String[][]{{"org.apache.commons.lang.text.ExtendedMessageFormat", "toPattern", ""}}, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.UnsupportedOperationException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput024() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.text.ExtendedMessageFormat", "org.apache.commons.lang.text.ExtendedMessageFormat", "toPattern", new String[]{}, new String[]{}, false, 2, new String[][]{}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("sample", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getFormats=[], getFormatsByArgumentIndex=[]}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput025() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.lang.text.ExtendedMessageFormat", "org.apache.commons.lang.text.ExtendedMessageFormat", "setFormat", new String[]{"int", "java.text.Format"}, new String[]{"2145386495", "<sample:6>"}, false, 2, new String[][]{{"org.apache.commons.lang.text.ExtendedMessageFormat", "applyPattern", "java.lang.String", "12:30:45''"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.UnsupportedOperationException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput026() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.lang.text.ExtendedMessageFormat", "org.apache.commons.lang.text.ExtendedMessageFormat", "setFormatByArgumentIndex", new String[]{"int", "java.text.Format"}, new String[]{"10", "<sample:9>"}, false, 2, new String[][]{{"org.apache.commons.lang.text.ExtendedMessageFormat", "setFormat", "int,java.text.Format", "2147483647", "<sample:3>"}, {"org.apache.commons.lang.text.ExtendedMessageFormat", "setFormatByArgumentIndex", "int,java.text.Format", "103", "<sample:4>"}}, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.UnsupportedOperationException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput027() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.text.ExtendedMessageFormat", "org.apache.commons.lang.text.ExtendedMessageFormat", "toPattern", new String[]{}, new String[]{}, false, 2, new String[][]{{"org.apache.commons.lang.text.ExtendedMessageFormat", "toPattern", ""}, {"org.apache.commons.lang.text.ExtendedMessageFormat", "setFormats", "java.text.Format[]", "<empty>"}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("sample", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getFormats=[], getFormatsByArgumentIndex=[]}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput028() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.lang.text.ExtendedMessageFormat", "org.apache.commons.lang.text.ExtendedMessageFormat", "applyPattern", new String[]{"java.lang.String"}, new String[]{"Hell{o, World"}, false, 6, new String[][]{}, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput029() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.text.ExtendedMessageFormat", "org.apache.commons.lang.text.ExtendedMessageFormat", "toPattern", new String[]{}, new String[]{}, false, 3, new String[][]{{"org.apache.commons.lang.text.ExtendedMessageFormat", "toPattern", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getFormats=[], getFormatsByArgumentIndex=[]}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput030() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.text.ExtendedMessageFormat", "org.apache.commons.lang.text.ExtendedMessageFormat", "toPattern", new String[]{}, new String[]{}, false, 6, new String[][]{{"org.apache.commons.lang.text.ExtendedMessageFormat", "setFormats", "java.text.Format[]", "<empty>"}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("sample", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getFormats=[], getFormatsByArgumentIndex=[]}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput031() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.text.ExtendedMessageFormat", "org.apache.commons.lang.text.ExtendedMessageFormat", "toPattern", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.lang.text.ExtendedMessageFormat", "setFormatByArgumentIndex", "int,java.text.Format", "2147483647", "<sample:0>"}, {"org.apache.commons.lang.text.ExtendedMessageFormat", "setFormat", "int,java.text.Format", "38", "<sample:4>"}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("a", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getFormats=[], getFormatsByArgumentIndex=[]}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput032() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.text.ExtendedMessageFormat", "org.apache.commons.lang.text.ExtendedMessageFormat", "toPattern", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.lang.text.ExtendedMessageFormat", "applyPattern", "java.lang.String", "Titlh"}, {"org.apache.commons.lang.text.ExtendedMessageFormat", "applyPattern", "java.lang.String", "\013"}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("\013", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getFormats=[], getFormatsByArgumentIndex=[]}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput033() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.text.ExtendedMessageFormat", "org.apache.commons.lang.text.ExtendedMessageFormat", "applyPattern", new String[]{"java.lang.String"}, new String[]{"d.12345678"}, false, 3, new String[][]{{"org.apache.commons.lang.text.ExtendedMessageFormat", "applyPattern", "java.lang.String", "1.1{234567890123456"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getFormats=[], getFormatsByArgumentIndex=[]}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput034() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.lang.text.ExtendedMessageFormat", "org.apache.commons.lang.text.ExtendedMessageFormat", "applyPattern", new String[]{"java.lang.String"}, new String[]{"{\"a\":1}nulla"}, false, 0, new String[][]{{"org.apache.commons.lang.text.ExtendedMessageFormat", "toPattern", ""}}, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput035() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.text.ExtendedMessageFormat", "org.apache.commons.lang.text.ExtendedMessageFormat", "toPattern", new String[]{}, new String[]{}, false, 3, new String[][]{{"org.apache.commons.lang.text.ExtendedMessageFormat", "setFormats", "java.text.Format[]", "<sample:2>"}, {"org.apache.commons.lang.text.ExtendedMessageFormat", "setFormat", "int,java.text.Format", "24", "<sample:12>"}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getFormats=[], getFormatsByArgumentIndex=[]}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput036() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.text.ExtendedMessageFormat", "org.apache.commons.lang.text.ExtendedMessageFormat", "toPattern", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.lang.text.ExtendedMessageFormat", "setFormat", "int,java.text.Format", "125", "<sample:6>"}, {"org.apache.commons.lang.text.ExtendedMessageFormat", "setFormatByArgumentIndex", "int,java.text.Format", "10", "<sample:6>"}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("a", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getFormats=[], getFormatsByArgumentIndex=[]}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput037() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.text.ExtendedMessageFormat", "org.apache.commons.lang.text.ExtendedMessageFormat", "toPattern", new String[]{}, new String[]{}, false, 0, null, 3);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("a", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getFormats=[], getFormatsByArgumentIndex=[]}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput038() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.text.ExtendedMessageFormat", "org.apache.commons.lang.text.ExtendedMessageFormat", "toPattern", new String[]{}, new String[]{}, false, 2, new String[][]{{"org.apache.commons.lang.text.ExtendedMessageFormat", "setFormat", "int,java.text.Format", "-42", "<sample:4>"}, {"org.apache.commons.lang.text.ExtendedMessageFormat", "applyPattern", "java.lang.String", "a,b+,9c"}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("a,b+,9c", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getFormats=[], getFormatsByArgumentIndex=[]}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput039() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.lang.text.ExtendedMessageFormat", "org.apache.commons.lang.text.ExtendedMessageFormat", "setFormatsByArgumentIndex", new String[]{"java.text.Format[]"}, new String[]{"<sample:1>"}, false, 7, new String[][]{}, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.UnsupportedOperationException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput040() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.text.ExtendedMessageFormat", "org.apache.commons.lang.text.ExtendedMessageFormat", "toPattern", new String[]{}, new String[]{}, false, 2, new String[][]{{"org.apache.commons.lang.text.ExtendedMessageFormat", "applyPattern", "java.lang.String", "/a"}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("/a", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getFormats=[], getFormatsByArgumentIndex=[]}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput041() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.text.ExtendedMessageFormat", "org.apache.commons.lang.text.ExtendedMessageFormat", "toPattern", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.lang.text.ExtendedMessageFormat", "applyPattern", "java.lang.String", "1.5d1.1234567890123456"}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("1.5d1.1234567890123456", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getFormats=[], getFormatsByArgumentIndex=[]}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput042() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.lang.text.ExtendedMessageFormat", "org.apache.commons.lang.text.ExtendedMessageFormat", "applyPattern", new String[]{"java.lang.String"}, new String[]{"1.1{23456780123456"}, false, 7, new String[][]{{"org.apache.commons.lang.text.ExtendedMessageFormat", "setFormatByArgumentIndex", "int,java.text.Format", "126", "<sample:12>"}}, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput043() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.text.ExtendedMessageFormat", "org.apache.commons.lang.text.ExtendedMessageFormat", "toPattern", new String[]{}, new String[]{}, false, 7, new String[][]{{"org.apache.commons.lang.text.ExtendedMessageFormat", "setFormat", "int,java.text.Format", "-16", "<sample:5>"}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getFormats=[], getFormatsByArgumentIndex=[]}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput044() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.lang.text.ExtendedMessageFormat", "org.apache.commons.lang.text.ExtendedMessageFormat", "applyPattern", new String[]{"java.lang.String"}, new String[]{"1.1{"}, false, 6, new String[][]{{"org.apache.commons.lang.text.ExtendedMessageFormat", "applyPattern", "java.lang.String", "<a?b</a="}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.ArrayIndexOutOfBoundsException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput045() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.text.ExtendedMessageFormat", "org.apache.commons.lang.text.ExtendedMessageFormat", "toPattern", new String[]{}, new String[]{}, false, 5, new String[][]{}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getFormats=[], getFormatsByArgumentIndex=[]}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput046() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.text.ExtendedMessageFormat", "org.apache.commons.lang.text.ExtendedMessageFormat", "toPattern", new String[]{}, new String[]{}, false, 3, new String[][]{{"org.apache.commons.lang.text.ExtendedMessageFormat", "applyPattern", "java.lang.String", "\n"}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("\n", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getFormats=[], getFormatsByArgumentIndex=[]}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput047() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.text.ExtendedMessageFormat", "org.apache.commons.lang.text.ExtendedMessageFormat", "toPattern", new String[]{}, new String[]{}, false, 2, new String[][]{{"org.apache.commons.lang.text.ExtendedMessageFormat", "applyPattern", "java.lang.String", "4\n"}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("4\n", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getFormats=[], getFormatsByArgumentIndex=[]}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput048() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.text.ExtendedMessageFormat", "org.apache.commons.lang.text.ExtendedMessageFormat", "toPattern", new String[]{}, new String[]{}, false, 3, new String[][]{{"org.apache.commons.lang.text.ExtendedMessageFormat", "setFormatByArgumentIndex", "int,java.text.Format", "2147483647", "<sample:1>"}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getFormats=[], getFormatsByArgumentIndex=[]}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput049() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.text.ExtendedMessageFormat", "org.apache.commons.lang.text.ExtendedMessageFormat", "toPattern", new String[]{}, new String[]{}, false, 1, new String[][]{{"org.apache.commons.lang.text.ExtendedMessageFormat", "setFormatByArgumentIndex", "int,java.text.Format", "0", "<sample:2>"}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getFormats=[], getFormatsByArgumentIndex=[]}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput050() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.text.ExtendedMessageFormat", "org.apache.commons.lang.text.ExtendedMessageFormat", "toPattern", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.lang.text.ExtendedMessageFormat", "applyPattern", "java.lang.String", "1.12L4567890123456"}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("1.12L4567890123456", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getFormats=[], getFormatsByArgumentIndex=[]}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput051() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.lang.text.ExtendedMessageFormat", "org.apache.commons.lang.text.ExtendedMessageFormat", "applyPattern", new String[]{"java.lang.String"}, new String[]{"1.1{234567890123456\n"}, false, 3, new String[][]{}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.StringIndexOutOfBoundsException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput052() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.lang.text.ExtendedMessageFormat", "org.apache.commons.lang.text.ExtendedMessageFormat", "setFormatsByArgumentIndex", new String[]{"java.text.Format[]"}, new String[]{"<empty>"}, false, 2, new String[][]{{"org.apache.commons.lang.text.ExtendedMessageFormat", "applyPattern", "java.lang.String", "1.1{234567890123456\n\t"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.UnsupportedOperationException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput053() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.lang.text.ExtendedMessageFormat", "org.apache.commons.lang.text.ExtendedMessageFormat", "applyPattern", new String[]{"java.lang.String"}, new String[]{"E.1{234567890123456\n5."}, false, 2, new String[][]{{"org.apache.commons.lang.text.ExtendedMessageFormat", "applyPattern", "java.lang.String", "2020-02-30T25:61:61"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput054() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.lang.text.ExtendedMessageFormat", "org.apache.commons.lang.text.ExtendedMessageFormat", "applyPattern", new String[]{"java.lang.String"}, new String[]{"<null>"}, false, 3, new String[][]{}, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput055() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.lang.text.ExtendedMessageFormat", "org.apache.commons.lang.text.ExtendedMessageFormat", "applyPattern", new String[]{"java.lang.String"}, new String[]{"1.1{244567890123456\n"}, false, 6, new String[][]{{"org.apache.commons.lang.text.ExtendedMessageFormat", "setFormatsByArgumentIndex", "java.text.Format[]", "<sample:0>"}}, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.StringIndexOutOfBoundsException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput056() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.text.ExtendedMessageFormat", "org.apache.commons.lang.text.ExtendedMessageFormat", "toPattern", new String[]{}, new String[]{}, false, 2, new String[][]{{"org.apache.commons.lang.text.ExtendedMessageFormat", "applyPattern", "java.lang.String", "1.5"}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("1.5", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getFormats=[], getFormatsByArgumentIndex=[]}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput057() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.lang.text.ExtendedMessageFormat", "org.apache.commons.lang.text.ExtendedMessageFormat", "applyPattern", new String[]{"java.lang.String"}, new String[]{"1.1{234567890123456\n"}, false, 2, new String[][]{{"org.apache.commons.lang.text.ExtendedMessageFormat", "setFormatByArgumentIndex", "int,java.text.Format", "268", "<sample:8>"}}, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.StringIndexOutOfBoundsException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput058() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.text.ExtendedMessageFormat", "org.apache.commons.lang.text.ExtendedMessageFormat", "toPattern", new String[]{}, new String[]{}, false, 4, new String[][]{{"org.apache.commons.lang.text.ExtendedMessageFormat", "applyPattern", "java.lang.String", "5."}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("5.", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getFormats=[], getFormatsByArgumentIndex=[]}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput059() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.text.ExtendedMessageFormat", "org.apache.commons.lang.text.ExtendedMessageFormat", "toPattern", new String[]{}, new String[]{}, false, 6, new String[][]{{"org.apache.commons.lang.text.ExtendedMessageFormat", "applyPattern", "java.lang.String", "I>"}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("I>", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getFormats=[], getFormatsByArgumentIndex=[]}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput060() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.text.ExtendedMessageFormat", "org.apache.commons.lang.text.ExtendedMessageFormat", "toPattern", new String[]{}, new String[]{}, false, 2, new String[][]{{"org.apache.commons.lang.text.ExtendedMessageFormat", "setFormatByArgumentIndex", "int,java.text.Format", "39", "<sample:2>"}, {"org.apache.commons.lang.text.ExtendedMessageFormat", "applyPattern", "java.lang.String", "123456789012345678901234567890"}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("123456789012345678901234567890", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getFormats=[], getFormatsByArgumentIndex=[]}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput061() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.lang.text.ExtendedMessageFormat", "org.apache.commons.lang.text.ExtendedMessageFormat", "applyPattern", new String[]{"java.lang.String"}, new String[]{"1{"}, false, 6, new String[][]{}, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.ArrayIndexOutOfBoundsException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput062() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.text.ExtendedMessageFormat", "org.apache.commons.lang.text.ExtendedMessageFormat", "toPattern", new String[]{}, new String[]{}, false, 2, new String[][]{{"org.apache.commons.lang.text.ExtendedMessageFormat", "applyPattern", "java.lang.String", "t1"}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("t1", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getFormats=[], getFormatsByArgumentIndex=[]}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput063() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.text.ExtendedMessageFormat", "org.apache.commons.lang.text.ExtendedMessageFormat", "toPattern", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.lang.text.ExtendedMessageFormat", "applyPattern", "java.lang.String", "-"}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("-", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getFormats=[], getFormatsByArgumentIndex=[]}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput064() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.lang.text.ExtendedMessageFormat", "org.apache.commons.lang.text.ExtendedMessageFormat", "applyPattern", new String[]{"java.lang.String"}, new String[]{"1.1{2345678,0123446"}, false, 3, new String[][]{{"org.apache.commons.lang.text.ExtendedMessageFormat", "applyPattern", "java.lang.String", ".544"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput065() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.text.ExtendedMessageFormat", "org.apache.commons.lang.text.ExtendedMessageFormat", "toPattern", new String[]{}, new String[]{}, false, 7, new String[][]{{"org.apache.commons.lang.text.ExtendedMessageFormat", "toPattern", ""}, {"org.apache.commons.lang.text.ExtendedMessageFormat", "applyPattern", "java.lang.String", "38"}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("38", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getFormats=[], getFormatsByArgumentIndex=[]}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput066() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.text.ExtendedMessageFormat", "org.apache.commons.lang.text.ExtendedMessageFormat", "toPattern", new String[]{}, new String[]{}, false, 7, new String[][]{{"org.apache.commons.lang.text.ExtendedMessageFormat", "applyPattern", "java.lang.String", "Hello, World/a/b"}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("Hello, World/a/b", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getFormats=[], getFormatsByArgumentIndex=[]}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput067() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.text.ExtendedMessageFormat", "org.apache.commons.lang.text.ExtendedMessageFormat", "toPattern", new String[]{}, new String[]{}, false, 6, new String[][]{{"org.apache.commons.lang.text.ExtendedMessageFormat", "applyPattern", "java.lang.String", "0x123456789"}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("0x123456789", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getFormats=[], getFormatsByArgumentIndex=[]}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput068() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.text.ExtendedMessageFormat", "org.apache.commons.lang.text.ExtendedMessageFormat", "toPattern", new String[]{}, new String[]{}, false, 1, new String[][]{{"org.apache.commons.lang.text.ExtendedMessageFormat", "applyPattern", "java.lang.String", "http://example.com/a?b=c"}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("http://example.com/a?b=c", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getFormats=[], getFormatsByArgumentIndex=[]}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput069() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.lang.text.ExtendedMessageFormat", "org.apache.commons.lang.text.ExtendedMessageFormat", "applyPattern", new String[]{"java.lang.String"}, new String[]{"<null>"}, false, 0, new String[][]{{"org.apache.commons.lang.text.ExtendedMessageFormat", "setFormatByArgumentIndex", "int,java.text.Format", "-6", "<sample:1>"}}, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput070() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.lang.text.ExtendedMessageFormat", "org.apache.commons.lang.text.ExtendedMessageFormat", "setFormat", new String[]{"int", "java.text.Format"}, new String[]{"1", "<sample:5>"}, false, 7, new String[][]{{"org.apache.commons.lang.text.ExtendedMessageFormat", "applyPattern", "java.lang.String", "1.12345678"}, {"org.apache.commons.lang.text.ExtendedMessageFormat", "applyPattern", "java.lang.String", "1.1{2345678,}123446"}}, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.UnsupportedOperationException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput071() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.lang.text.ExtendedMessageFormat", "org.apache.commons.lang.text.ExtendedMessageFormat", "applyPattern", new String[]{"java.lang.String"}, new String[]{"1.1{234567890123456\n\t"}, false, 7, new String[][]{}, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.StringIndexOutOfBoundsException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput072() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.lang.text.ExtendedMessageFormat", "org.apache.commons.lang.text.ExtendedMessageFormat", "applyPattern", new String[]{"java.lang.String"}, new String[]{"E.1{23456789012345}\n5.123"}, false, 2, new String[][]{}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput073() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.lang.text.ExtendedMessageFormat", "org.apache.commons.lang.text.ExtendedMessageFormat", "applyPattern", new String[]{"java.lang.String"}, new String[]{"1.1{2345678}1234461.5"}, false, 7, new String[][]{{"org.apache.commons.lang.text.ExtendedMessageFormat", "toPattern", ""}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput074() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.text.ExtendedMessageFormat", "org.apache.commons.lang.text.ExtendedMessageFormat", "toPattern", new String[]{}, new String[]{}, false, 2, new String[][]{{"org.apache.commons.lang.text.ExtendedMessageFormat", "applyPattern", "java.lang.String", "1.1{2345678,{\"a\":1}"}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("sample", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getFormats=[], getFormatsByArgumentIndex=[]}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput075() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.lang.text.ExtendedMessageFormat", "org.apache.commons.lang.text.ExtendedMessageFormat", "setFormat", new String[]{"int", "java.text.Format"}, new String[]{"-634", "<sample:9>"}, false, 7, new String[][]{{"org.apache.commons.lang.text.ExtendedMessageFormat", "applyPattern", "java.lang.String", "1.1{2,45678,}1234465."}}, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.UnsupportedOperationException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput076() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.text.ExtendedMessageFormat", "org.apache.commons.lang.text.ExtendedMessageFormat", "applyPattern", new String[]{"java.lang.String"}, new String[]{"1.1{2,,45678,}1234465."}, false);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getFormats=[null], getFormatsByArgumentIndex=[null, null, null]}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput077() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.text.ExtendedMessageFormat", "org.apache.commons.lang.text.ExtendedMessageFormat", "applyPattern", new String[]{"java.lang.String"}, new String[]{"1.1{2,,45678,}123446"}, false, 2, new String[][]{{"org.apache.commons.lang.text.ExtendedMessageFormat", "setFormatsByArgumentIndex", "java.text.Format[]", "<sample:1>"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getFormats=[null], getFormatsByArgumentIndex=[null, null, null]}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput078() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.text.ExtendedMessageFormat", "org.apache.commons.lang.text.ExtendedMessageFormat", "applyPattern", new String[]{"java.lang.String"}, new String[]{"1.1{2,,,45678,}123446"}, false, 2, new String[][]{{"org.apache.commons.lang.text.ExtendedMessageFormat", "setFormatByArgumentIndex", "int,java.text.Format", "36", "<sample:0>"}}, 1);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getFormats=[null], getFormatsByArgumentIndex=[null, null, null]}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput079() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.text.ExtendedMessageFormat", "org.apache.commons.lang.text.ExtendedMessageFormat", "applyPattern", new String[]{"java.lang.String"}, new String[]{"1.1{2,,45678,}123446123456789012345678901234567890"}, false, 0, new String[][]{{"org.apache.commons.lang.text.ExtendedMessageFormat", "setFormatByArgumentIndex", "int,java.text.Format", "125", "<sample:2>"}, {"org.apache.commons.lang.text.ExtendedMessageFormat", "toPattern", ""}}, 2);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getFormats=[null], getFormatsByArgumentIndex=[null, null, null]}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput080() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.text.ExtendedMessageFormat", "org.apache.commons.lang.text.ExtendedMessageFormat", "applyPattern", new String[]{"java.lang.String"}, new String[]{"1.1{2,,45678,}1234461.5d"}, false, 3, new String[][]{{"org.apache.commons.lang.text.ExtendedMessageFormat", "setFormats", "java.text.Format[]", "<sample:0>"}, {"org.apache.commons.lang.text.ExtendedMessageFormat", "setFormatsByArgumentIndex", "java.text.Format[]", "<empty>"}}, 3);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getFormats=[null], getFormatsByArgumentIndex=[null, null, null]}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput081() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.text.ExtendedMessageFormat", "org.apache.commons.lang.text.ExtendedMessageFormat", "applyPattern", new String[]{"java.lang.String"}, new String[]{"1.1{3,,45678,}123446"}, false, 0, new String[][]{{"org.apache.commons.lang.text.ExtendedMessageFormat", "setFormats", "java.text.Format[]", "<sample:1>"}, {"org.apache.commons.lang.text.ExtendedMessageFormat", "setFormatByArgumentIndex", "int,java.text.Format", "5", "<sample:7>"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getFormats=[null], getFormatsByArgumentIndex=[null, null, null, null]}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput082() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.text.ExtendedMessageFormat", "org.apache.commons.lang.text.ExtendedMessageFormat", "applyPattern", new String[]{"java.lang.String"}, new String[]{"1.1{3,,45678,}123446"}, false, 0, null, 3);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getFormats=[null], getFormatsByArgumentIndex=[null, null, null, null]}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput083() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.text.ExtendedMessageFormat", "org.apache.commons.lang.text.ExtendedMessageFormat", "applyPattern", new String[]{"java.lang.String"}, new String[]{"1.1{1,,45678,}124446"}, false, 0, new String[][]{{"org.apache.commons.lang.text.ExtendedMessageFormat", "setFormatsByArgumentIndex", "java.text.Format[]", "<sample:2>"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getFormats=[null], getFormatsByArgumentIndex=[null, null]}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput084() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.text.ExtendedMessageFormat", "org.apache.commons.lang.text.ExtendedMessageFormat", "toPattern", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.lang.text.ExtendedMessageFormat", "applyPattern", "java.lang.String", "1.1{2,,45677,}123446"}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("1.1{2}123446", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getFormats=[null], getFormatsByArgumentIndex=[null, null, null]}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput085() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.lang.text.ExtendedMessageFormat", "org.apache.commons.lang.text.ExtendedMessageFormat", "setFormat", new String[]{"int", "java.text.Format"}, new String[]{"125", "<sample:2>"}, false, 2, new String[][]{{"org.apache.commons.lang.text.ExtendedMessageFormat", "applyPattern", "java.lang.String", "1.1{2345678,{\"a\"':}"}, {"org.apache.commons.lang.text.ExtendedMessageFormat", "applyPattern", "java.lang.String", "1.1234"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.UnsupportedOperationException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput086() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.lang.text.ExtendedMessageFormat", "org.apache.commons.lang.text.ExtendedMessageFormat", "applyPattern", new String[]{"java.lang.String"}, new String[]{"1.1{,,45678,}123446{\"a\":1}"}, false, 3, new String[][]{}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput087() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.lang.text.ExtendedMessageFormat", "org.apache.commons.lang.text.ExtendedMessageFormat", "applyPattern", new String[]{"java.lang.String"}, new String[]{"1.1{2345678,"}, false, 3, new String[][]{{"org.apache.commons.lang.text.ExtendedMessageFormat", "setFormatsByArgumentIndex", "java.text.Format[]", "<null>"}}, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.ArrayIndexOutOfBoundsException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput088() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.text.ExtendedMessageFormat", "org.apache.commons.lang.text.ExtendedMessageFormat", "applyPattern", new String[]{"java.lang.String"}, new String[]{"1.1{22,,45678,}123476"}, false, 6, new String[][]{});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getFormats=[null], getFormatsByArgumentIndex=[null, null, null, null, null, null, null, null, null, null,..}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput089() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.lang.text.ExtendedMessageFormat", "org.apache.commons.lang.text.ExtendedMessageFormat", "applyPattern", new String[]{"java.lang.String"}, new String[]{"E.1{2345678901234\n}\n5.123"}, false, 3, new String[][]{{"org.apache.commons.lang.text.ExtendedMessageFormat", "toPattern", ""}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput090() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.text.ExtendedMessageFormat", "org.apache.commons.lang.text.ExtendedMessageFormat", "applyPattern", new String[]{"java.lang.String"}, new String[]{"1.1{22,,45678,}123446"}, false, 0, null, 2);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getFormats=[null], getFormatsByArgumentIndex=[null, null, null, null, null, null, null, null, null, null,..}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput091() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.lang.text.ExtendedMessageFormat", "org.apache.commons.lang.text.ExtendedMessageFormat", "applyPattern", new String[]{"java.lang.String"}, new String[]{"<null>"}, false, 1, new String[][]{}, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput092() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.text.ExtendedMessageFormat", "org.apache.commons.lang.text.ExtendedMessageFormat", "toPattern", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.lang.text.ExtendedMessageFormat", "applyPattern", "java.lang.String", "1.1{2,,45678,}123446"}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("1.1{2}123446", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getFormats=[null], getFormatsByArgumentIndex=[null, null, null]}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput093() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.text.ExtendedMessageFormat", "org.apache.commons.lang.text.ExtendedMessageFormat", "applyPattern", new String[]{"java.lang.String"}, new String[]{"1.0{1,,45678,}123446"}, false, 0, null, 3);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getFormats=[null], getFormatsByArgumentIndex=[null, null]}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput094() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.text.ExtendedMessageFormat", "org.apache.commons.lang.text.ExtendedMessageFormat", "toPattern", new String[]{}, new String[]{}, false, 6, new String[][]{{"org.apache.commons.lang.text.ExtendedMessageFormat", "setFormat", "int,java.text.Format", "78", "<sample:5>"}, {"org.apache.commons.lang.text.ExtendedMessageFormat", "applyPattern", "java.lang.String", "1.1{2,,45678,}1234446"}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("1.1{2}1234446", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getFormats=[null], getFormatsByArgumentIndex=[null, null, null]}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput095() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.text.ExtendedMessageFormat", "org.apache.commons.lang.text.ExtendedMessageFormat", "toPattern", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.lang.text.ExtendedMessageFormat", "setFormat", "int,java.text.Format", "78", "<sample:1>"}, {"org.apache.commons.lang.text.ExtendedMessageFormat", "applyPattern", "java.lang.String", "1.1{1,,45678,}123446"}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("1.1{1}123446", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getFormats=[null], getFormatsByArgumentIndex=[null, null]}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput096() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.text.ExtendedMessageFormat", "org.apache.commons.lang.text.ExtendedMessageFormat", "applyPattern", new String[]{"java.lang.String"}, new String[]{"1.1{3,,45678,}123446"}, false, 1, new String[][]{{"org.apache.commons.lang.text.ExtendedMessageFormat", "toPattern", ""}}, 2);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getFormats=[null], getFormatsByArgumentIndex=[null, null, null, null]}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput097() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.text.ExtendedMessageFormat", "org.apache.commons.lang.text.ExtendedMessageFormat", "applyPattern", new String[]{"java.lang.String"}, new String[]{"1.1{1,,45678,}123446"}, false, 7, new String[][]{{"org.apache.commons.lang.text.ExtendedMessageFormat", "toPattern", ""}}, 1);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getFormats=[null], getFormatsByArgumentIndex=[null, null]}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput098() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.lang.text.ExtendedMessageFormat", "org.apache.commons.lang.text.ExtendedMessageFormat", "applyPattern", new String[]{"java.lang.String"}, new String[]{"1.1{"}, false, 7, new String[][]{}, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.ArrayIndexOutOfBoundsException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput099() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.text.ExtendedMessageFormat", "org.apache.commons.lang.text.ExtendedMessageFormat", "applyPattern", new String[]{"java.lang.String"}, new String[]{"1.1{22,,45678,}123446-2362048321261811743"}, false, 0, null, 1);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getFormats=[null], getFormatsByArgumentIndex=[null, null, null, null, null, null, null, null, null, null,..}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput100() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.text.ExtendedMessageFormat", "org.apache.commons.lang.text.ExtendedMessageFormat", "toPattern", new String[]{}, new String[]{}, false, 2, new String[][]{{"org.apache.commons.lang.text.ExtendedMessageFormat", "applyPattern", "java.lang.String", "1912345678"}, {"org.apache.commons.lang.text.ExtendedMessageFormat", "applyPattern", "java.lang.String", "1.1{2,,45678,}123446"}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("1.1{2}123446", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getFormats=[null], getFormatsByArgumentIndex=[null, null, null]}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput101() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.lang.text.ExtendedMessageFormat", "org.apache.commons.lang.text.ExtendedMessageFormat", "applyPattern", new String[]{"java.lang.String"}, new String[]{"1.1{234567 ,{\"a\"':}1.25"}, false, 6, new String[][]{{"org.apache.commons.lang.text.ExtendedMessageFormat", "setFormatsByArgumentIndex", "java.text.Format[]", "<sample:0>"}, {"org.apache.commons.lang.text.ExtendedMessageFormat", "setFormatByArgumentIndex", "int,java.text.Format", "-2147483648", "<sample:7>"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput102() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.text.ExtendedMessageFormat", "org.apache.commons.lang.text.ExtendedMessageFormat", "applyPattern", new String[]{"java.lang.String"}, new String[]{"1.1{3,,4568,}123446"}, false, 2, new String[][]{}, 1);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getFormats=[null], getFormatsByArgumentIndex=[null, null, null, null]}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput103() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.text.ExtendedMessageFormat", "org.apache.commons.lang.text.ExtendedMessageFormat", "applyPattern", new String[]{"java.lang.String"}, new String[]{"E.1{234}56789012345}\n5.123"}, false, 0, new String[][]{{"org.apache.commons.lang.text.ExtendedMessageFormat", "setFormatByArgumentIndex", "int,java.text.Format", "2147483647", "<sample:2>"}, {"org.apache.commons.lang.text.ExtendedMessageFormat", "setFormat", "int,java.text.Format", "44", "<null>"}}, 3);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getFormats=[null], getFormatsByArgumentIndex=?}", SearchInputFactory_scaffolding.receiverState());
 }
}
