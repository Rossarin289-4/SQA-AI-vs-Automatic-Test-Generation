package generated.algorithm;

import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;
import static org.junit.Assert.*;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class SimulatedAnnealingGeneratedTest {
 @Test(timeout = 20000)
 public void generatedInput000() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.csv.CSVParser", "org.apache.commons.csv.CSVParser", "iterator", new String[]{}, new String[]{}, false);
  assertNotNull(actual);
  assertEquals("org.apache.commons.csv.CSVParser$CSVRecordIterator", actual.getClass().getName());
  assertEquals("{hasNext=true}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getCurrentLineNumber=0, getFirstEndOfLine=null, getRecordNumber=1, isClosed=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput001() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.csv.CSVParser", "org.apache.commons.csv.CSVParser", "iterator", new String[]{}, new String[]{}, false, 5, new String[][]{{"org.apache.commons.csv.CSVParser", "close", ""}}, 2);
  assertNotNull(actual);
  assertEquals("org.apache.commons.csv.CSVParser$CSVRecordIterator", actual.getClass().getName());
  assertEquals("{hasNext=false}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getCurrentLineNumber=0, getFirstEndOfLine=null, getRecordNumber=5, isClosed=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput002() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.csv.CSVParser", "org.apache.commons.csv.CSVParser", "parse", new String[]{"java.nio.file.Path", "java.nio.charset.Charset", "org.apache.commons.csv.CSVFormat"}, new String[]{"<sample:2>", "<sample:2>", "<sample:6>"}, true); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput003() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.csv.CSVParser", "org.apache.commons.csv.CSVParser", "iterator", new String[]{}, new String[]{}, false, 4, new String[][]{}), new String[][]{{"next", "", "4"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.util.NoSuchElementException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput004() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.csv.CSVParser", "org.apache.commons.csv.CSVParser", "parse", new String[]{"java.net.URL", "java.nio.charset.Charset", "org.apache.commons.csv.CSVFormat"}, new String[]{"<sample:0>", "<empty>", "<sample:7>"}, true); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput005() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.csv.CSVParser", "org.apache.commons.csv.CSVParser", "parse", new String[]{"java.lang.String", "org.apache.commons.csv.CSVFormat"}, new String[]{"a", "<sample:1>"}, true), new String[][]{{"iterator", "", "2"}, {"remove", "", "5"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.UnsupportedOperationException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput006() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.csv.CSVParser", "org.apache.commons.csv.CSVParser", "parse", new String[]{"java.io.File", "java.nio.charset.Charset", "org.apache.commons.csv.CSVFormat"}, new String[]{"<sample:3>", "<sample:3>", "<sample:3>"}, true); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.io.FileNotFoundException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput007() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.csv.CSVParser", "org.apache.commons.csv.CSVParser", "parse", new String[]{"java.lang.String", "org.apache.commons.csv.CSVFormat"}, new String[]{"+n-..0\r1", "<sample:2>"}, true), new String[][]{{"iterator", "", "7"}, {"hasNext", "", "2"}, {"hasNext", "", "1"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput008() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.csv.CSVParser", "org.apache.commons.csv.CSVParser", "parse", new String[]{"java.io.InputStream", "java.nio.charset.Charset", "org.apache.commons.csv.CSVFormat"}, new String[]{"<sample:1>", "<sample:0>", "<sample:1>"}, true, 0, null, 3), new String[][]{{"iterator", "", "7"}, {"next", "", "2"}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.csv.CSVRecord", actual.getClass().getName());
  assertEquals("CSVRecord [comment=null, mapping=null, recordNumber=1, values=[a]] {getCharacterPosition=0, getComment=null, getRecordNumber=1, hasComment=false, isConsistent=true, size=1}", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput009() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.csv.CSVParser", "org.apache.commons.csv.CSVParser", "iterator", new String[]{}, new String[]{}, false, 1, new String[][]{{"org.apache.commons.csv.CSVParser", "close", ""}}), new String[][]{{"next", "", "6"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.util.NoSuchElementException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput010() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.csv.CSVParser", "org.apache.commons.csv.CSVParser", "iterator", new String[]{}, new String[]{}, false, 15, new String[][]{{"org.apache.commons.csv.CSVParser", "getHeaderMap", ""}, {"org.apache.commons.csv.CSVParser", "iterator", ""}, {"org.apache.commons.csv.CSVParser", "getRecords", ""}}, 3), new String[][]{{"hasNext", "", "4"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getCurrentLineNumber=1, getFirstEndOfLine=\r, getRecordNumber=101, isClosed=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput011() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.csv.CSVParser", "org.apache.commons.csv.CSVParser", "parse", new String[]{"java.lang.String", "org.apache.commons.csv.CSVFormat"}, new String[]{"Tjjtm2a", "<sample:12>"}, true, 0, null, 1), new String[][]{{"getFirstEndOfLine", "", "5"}, {"getHeaderMap", "", "2"}, {"getRecords", "", "0"}, {"iterator", "", "6"}});
  assertNotNull(actual);
  assertEquals("java.util.ArrayList$Itr", actual.getClass().getName());
  assertEquals("{hasNext=true}", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput012() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.csv.CSVParser", "org.apache.commons.csv.CSVParser", "iterator", new String[]{}, new String[]{}, false, 14, new String[][]{{"org.apache.commons.csv.CSVParser", "iterator", ""}}, 2), new String[][]{{"hasNext", "", "6"}, {"next", "", "7"}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.csv.CSVRecord", actual.getClass().getName());
  assertEquals("CSVRecord [comment=null, mapping=null, recordNumber=1, values=[a,b]] {getCharacterPosition=0, getComment=null, getRecordNumber=1, hasComment=false, isConsistent=true, size=1}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getCurrentLineNumber=1, getFirstEndOfLine=\n, getRecordNumber=1, isClosed=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput013() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.csv.CSVParser", "org.apache.commons.csv.CSVParser", "iterator", new String[]{}, new String[]{}, false, 5, new String[][]{}, 2);
  assertNotNull(actual);
  assertEquals("org.apache.commons.csv.CSVParser$CSVRecordIterator", actual.getClass().getName());
  assertEquals("{hasNext=true}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getCurrentLineNumber=0, getFirstEndOfLine=null, getRecordNumber=6, isClosed=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput014() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.csv.CSVParser", "org.apache.commons.csv.CSVParser", "iterator", new String[]{}, new String[]{}, false, 6, new String[][]{{"org.apache.commons.csv.CSVParser", "close", ""}}, 2);
  assertNotNull(actual);
  assertEquals("org.apache.commons.csv.CSVParser$CSVRecordIterator", actual.getClass().getName());
  assertEquals("{hasNext=false}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getCurrentLineNumber=0, getFirstEndOfLine=null, getRecordNumber=0, isClosed=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput015() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.csv.CSVParser", "org.apache.commons.csv.CSVParser", "iterator", new String[]{}, new String[]{}, false, 7, new String[][]{{"org.apache.commons.csv.CSVParser", "close", ""}}, 2);
  assertNotNull(actual);
  assertEquals("org.apache.commons.csv.CSVParser$CSVRecordIterator", actual.getClass().getName());
  assertEquals("{hasNext=false}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getCurrentLineNumber=0, getFirstEndOfLine=null, getRecordNumber=7, isClosed=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput016() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.csv.CSVParser", "org.apache.commons.csv.CSVParser", "parse", new String[]{"java.io.InputStream", "java.nio.charset.Charset", "org.apache.commons.csv.CSVFormat"}, new String[]{"<sample:0>", "<sample:3>", "<sample:4>"}, true, 0, null, 2);
  assertNotNull(actual);
  assertEquals("org.apache.commons.csv.CSVParser", actual.getClass().getName());
  assertEquals("{getCurrentLineNumber=0, getFirstEndOfLine=null, getRecordNumber=0, isClosed=false}", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput017() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.csv.CSVParser", "org.apache.commons.csv.CSVParser", "parse", new String[]{"java.net.URL", "java.nio.charset.Charset", "org.apache.commons.csv.CSVFormat"}, new String[]{"<null>", "<sample:2>", "<sample:7>"}, true, 0, null, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput018() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.csv.CSVParser", "org.apache.commons.csv.CSVParser", "parse", new String[]{"java.net.URL", "java.nio.charset.Charset", "org.apache.commons.csv.CSVFormat"}, new String[]{"<sample:1>", "<sample:2>", "<sample:6>"}, true, 0, null, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput019() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.csv.CSVParser", "org.apache.commons.csv.CSVParser", "parse", new String[]{"java.net.URL", "java.nio.charset.Charset", "org.apache.commons.csv.CSVFormat"}, new String[]{"<sample:9>", "<sample:0>", "<sample:7>"}, true, 0, null, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput020() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.csv.CSVParser", "org.apache.commons.csv.CSVParser", "parse", new String[]{"java.io.Reader", "org.apache.commons.csv.CSVFormat"}, new String[]{"<sample:2>", "<sample:0>"}, true, 0, null, 1);
  assertNotNull(actual);
  assertEquals("org.apache.commons.csv.CSVParser", actual.getClass().getName());
  assertEquals("{getCurrentLineNumber=0, getFirstEndOfLine=null, getRecordNumber=0, isClosed=false}", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput021() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.csv.CSVParser", "org.apache.commons.csv.CSVParser", "parse", new String[]{"java.io.Reader", "org.apache.commons.csv.CSVFormat"}, new String[]{"<null>", "<sample:0>"}, true, 0, null, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput022() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.csv.CSVParser", "org.apache.commons.csv.CSVParser", "parse", new String[]{"java.nio.file.Path", "java.nio.charset.Charset", "org.apache.commons.csv.CSVFormat"}, new String[]{"<sample:2>", "<sample:3>", "<sample:3>"}, true, 0, null, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput023() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.csv.CSVParser", "org.apache.commons.csv.CSVParser", "parse", new String[]{"java.lang.String", "org.apache.commons.csv.CSVFormat"}, new String[]{"inputStream", "<sample:7>"}, true, 0, null, 2), new String[][]{{"getRecords", "", "5"}, {"removeAll", "java.util.Collection", "4"}, {"add", "int,java.lang.Object", "1"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IndexOutOfBoundsException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput024() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.csv.CSVParser", "org.apache.commons.csv.CSVParser", "parse", new String[]{"java.lang.String", "org.apache.commons.csv.CSVFormat"}, new String[]{"a b", "<null>"}, true, 0, null, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput025() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.csv.CSVParser", "org.apache.commons.csv.CSVParser", "getCurrentLineNumber", new String[]{}, new String[]{}, false, 1, new String[][]{{"org.apache.commons.csv.CSVParser", "getCurrentLineNumber", ""}, {"org.apache.commons.csv.CSVParser", "iterator", ""}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Long", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getCurrentLineNumber=0, getFirstEndOfLine=null, getRecordNumber=1, isClosed=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput026() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.csv.CSVParser", "org.apache.commons.csv.CSVParser", "getCurrentLineNumber", new String[]{}, new String[]{}, false, 2, new String[][]{{"org.apache.commons.csv.CSVParser", "getCurrentLineNumber", ""}, {"org.apache.commons.csv.CSVParser", "isClosed", ""}, {"org.apache.commons.csv.CSVParser", "iterator", ""}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Long", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getCurrentLineNumber=0, getFirstEndOfLine=null, getRecordNumber=0, isClosed=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput027() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.csv.CSVParser", "org.apache.commons.csv.CSVParser", "parse", new String[]{"java.io.Reader", "org.apache.commons.csv.CSVFormat"}, new String[]{"<sample:2>", "<sample:3>"}, true, 0, null, 3);
  assertNotNull(actual);
  assertEquals("org.apache.commons.csv.CSVParser", actual.getClass().getName());
  assertEquals("{getCurrentLineNumber=0, getFirstEndOfLine=null, getRecordNumber=0, isClosed=false}", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput028() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.csv.CSVParser", "org.apache.commons.csv.CSVParser", "getRecordNumber", new String[]{}, new String[]{}, false, 4, new String[][]{{"org.apache.commons.csv.CSVParser", "close", ""}, {"org.apache.commons.csv.CSVParser", "nextRecord", ""}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Long", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getCurrentLineNumber=0, getFirstEndOfLine=null, getRecordNumber=0, isClosed=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput029() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.csv.CSVParser", "org.apache.commons.csv.CSVParser", "getRecordNumber", new String[]{}, new String[]{}, false, 5, new String[][]{{"org.apache.commons.csv.CSVParser", "close", ""}, {"org.apache.commons.csv.CSVParser", "nextRecord", ""}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Long", actual.getClass().getName());
  assertEquals("5", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getCurrentLineNumber=0, getFirstEndOfLine=null, getRecordNumber=5, isClosed=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput030() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.csv.CSVParser", "org.apache.commons.csv.CSVParser", "getRecordNumber", new String[]{}, new String[]{}, false, 6, new String[][]{{"org.apache.commons.csv.CSVParser", "nextRecord", ""}, {"org.apache.commons.csv.CSVParser", "close", ""}, {"org.apache.commons.csv.CSVParser", "nextRecord", ""}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Long", actual.getClass().getName());
  assertEquals("1", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getCurrentLineNumber=0, getFirstEndOfLine=null, getRecordNumber=1, isClosed=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput031() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.csv.CSVParser", "org.apache.commons.csv.CSVParser", "getRecordNumber", new String[]{}, new String[]{}, false, 7, new String[][]{{"org.apache.commons.csv.CSVParser", "nextRecord", ""}, {"org.apache.commons.csv.CSVParser", "close", ""}, {"org.apache.commons.csv.CSVParser", "getFirstEndOfLine", ""}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Long", actual.getClass().getName());
  assertEquals("8", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getCurrentLineNumber=0, getFirstEndOfLine=null, getRecordNumber=8, isClosed=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput032() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.csv.CSVParser", "org.apache.commons.csv.CSVParser", "getRecordNumber", new String[]{}, new String[]{}, false, 7, new String[][]{{"org.apache.commons.csv.CSVParser", "close", ""}, {"org.apache.commons.csv.CSVParser", "getFirstEndOfLine", ""}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Long", actual.getClass().getName());
  assertEquals("7", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getCurrentLineNumber=0, getFirstEndOfLine=null, getRecordNumber=7, isClosed=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput033() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.csv.CSVParser", "org.apache.commons.csv.CSVParser", "getRecordNumber", new String[]{}, new String[]{}, false, 8, new String[][]{{"org.apache.commons.csv.CSVParser", "nextRecord", ""}, {"org.apache.commons.csv.CSVParser", "close", ""}, {"org.apache.commons.csv.CSVParser", "getFirstEndOfLine", ""}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Long", actual.getClass().getName());
  assertEquals("1", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getCurrentLineNumber=1, getFirstEndOfLine=\n, getRecordNumber=1, isClosed=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput034() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.csv.CSVParser", "org.apache.commons.csv.CSVParser", "getRecordNumber", new String[]{}, new String[]{}, false, 9, new String[][]{{"org.apache.commons.csv.CSVParser", "nextRecord", ""}, {"org.apache.commons.csv.CSVParser", "close", ""}, {"org.apache.commons.csv.CSVParser", "getFirstEndOfLine", ""}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Long", actual.getClass().getName());
  assertEquals("10", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getCurrentLineNumber=1, getFirstEndOfLine=\n, getRecordNumber=10, isClosed=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput035() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.csv.CSVParser", "org.apache.commons.csv.CSVParser", "getRecordNumber", new String[]{}, new String[]{}, false, 10, new String[][]{{"org.apache.commons.csv.CSVParser", "nextRecord", ""}, {"org.apache.commons.csv.CSVParser", "close", ""}, {"org.apache.commons.csv.CSVParser", "getFirstEndOfLine", ""}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Long", actual.getClass().getName());
  assertEquals("1", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getCurrentLineNumber=1, getFirstEndOfLine=\r\n, getRecordNumber=1, isClosed=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput036() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.csv.CSVParser", "org.apache.commons.csv.CSVParser", "getRecordNumber", new String[]{}, new String[]{}, false, 11, new String[][]{{"org.apache.commons.csv.CSVParser", "nextRecord", ""}, {"org.apache.commons.csv.CSVParser", "close", ""}, {"org.apache.commons.csv.CSVParser", "getFirstEndOfLine", ""}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Long", actual.getClass().getName());
  assertEquals("11", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getCurrentLineNumber=0, getFirstEndOfLine=null, getRecordNumber=11, isClosed=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput037() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.csv.CSVParser", "org.apache.commons.csv.CSVParser", "getRecordNumber", new String[]{}, new String[]{}, false, 12, new String[][]{{"org.apache.commons.csv.CSVParser", "nextRecord", ""}, {"org.apache.commons.csv.CSVParser", "close", ""}, {"org.apache.commons.csv.CSVParser", "getFirstEndOfLine", ""}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Long", actual.getClass().getName());
  assertEquals("1", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getCurrentLineNumber=1, getFirstEndOfLine=\r, getRecordNumber=1, isClosed=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput038() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.csv.CSVParser", "org.apache.commons.csv.CSVParser", "getRecordNumber", new String[]{}, new String[]{}, false, 13, new String[][]{{"org.apache.commons.csv.CSVParser", "nextRecord", ""}, {"org.apache.commons.csv.CSVParser", "close", ""}, {"org.apache.commons.csv.CSVParser", "getFirstEndOfLine", ""}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Long", actual.getClass().getName());
  assertEquals("32", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getCurrentLineNumber=1, getFirstEndOfLine=\n, getRecordNumber=32, isClosed=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput039() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.csv.CSVParser", "org.apache.commons.csv.CSVParser", "getRecordNumber", new String[]{}, new String[]{}, false, 15, new String[][]{{"org.apache.commons.csv.CSVParser", "nextRecord", ""}, {"org.apache.commons.csv.CSVParser", "close", ""}, {"org.apache.commons.csv.CSVParser", "getFirstEndOfLine", ""}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Long", actual.getClass().getName());
  assertEquals("100", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getCurrentLineNumber=1, getFirstEndOfLine=\r, getRecordNumber=100, isClosed=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput040() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.csv.CSVParser", "org.apache.commons.csv.CSVParser", "parse", new String[]{"java.io.File", "java.nio.charset.Charset", "org.apache.commons.csv.CSVFormat"}, new String[]{"<sample:5>", "<sample:2>", "<sample:3>"}, true, 0, null, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.io.FileNotFoundException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput041() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.csv.CSVParser", "org.apache.commons.csv.CSVParser", "iterator", new String[]{}, new String[]{}, false, 4, new String[][]{{"org.apache.commons.csv.CSVParser", "getCurrentLineNumber", ""}}, 2);
  assertNotNull(actual);
  assertEquals("org.apache.commons.csv.CSVParser$CSVRecordIterator", actual.getClass().getName());
  assertEquals("{hasNext=false}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getCurrentLineNumber=0, getFirstEndOfLine=null, getRecordNumber=0, isClosed=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput042() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.csv.CSVParser", "org.apache.commons.csv.CSVParser", "iterator", new String[]{}, new String[]{}, false, 6, new String[][]{{"org.apache.commons.csv.CSVParser", "iterator", ""}, {"org.apache.commons.csv.CSVParser", "getCurrentLineNumber", ""}}, 2);
  assertNotNull(actual);
  assertEquals("org.apache.commons.csv.CSVParser$CSVRecordIterator", actual.getClass().getName());
  assertEquals("{hasNext=true}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getCurrentLineNumber=0, getFirstEndOfLine=null, getRecordNumber=1, isClosed=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput043() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.csv.CSVParser", "org.apache.commons.csv.CSVParser", "iterator", new String[]{}, new String[]{}, false, 12, new String[][]{{"org.apache.commons.csv.CSVParser", "iterator", ""}, {"org.apache.commons.csv.CSVParser", "getCurrentLineNumber", ""}}, 2), new String[][]{{"remove", "", "7"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.UnsupportedOperationException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput044() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.csv.CSVParser", "org.apache.commons.csv.CSVParser", "iterator", new String[]{}, new String[]{}, false, 15, new String[][]{{"org.apache.commons.csv.CSVParser", "iterator", ""}, {"org.apache.commons.csv.CSVParser", "getCurrentLineNumber", ""}, {"org.apache.commons.csv.CSVParser", "getRecordNumber", ""}}, 2), new String[][]{{"next", "", "0"}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.csv.CSVRecord", actual.getClass().getName());
  assertEquals("CSVRecord [comment=null, mapping=null, recordNumber=100, values=[a]] {getCharacterPosition=64, getComment=null, getRecordNumber=100, hasComment=false, isConsistent=true, size=1}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getCurrentLineNumber=1, getFirstEndOfLine=\r, getRecordNumber=100, isClosed=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput045() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.csv.CSVParser", "org.apache.commons.csv.CSVParser", "getRecordNumber", new String[]{}, new String[]{}, false, 1, new String[][]{{"org.apache.commons.csv.CSVParser", "getHeaderMap", ""}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Long", actual.getClass().getName());
  assertEquals("1", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getCurrentLineNumber=0, getFirstEndOfLine=null, getRecordNumber=1, isClosed=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput046() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.csv.CSVParser", "org.apache.commons.csv.CSVParser", "getRecordNumber", new String[]{}, new String[]{}, false, 2, new String[][]{{"org.apache.commons.csv.CSVParser", "getHeaderMap", ""}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Long", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getCurrentLineNumber=0, getFirstEndOfLine=null, getRecordNumber=0, isClosed=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput047() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.csv.CSVParser", "org.apache.commons.csv.CSVParser", "getRecordNumber", new String[]{}, new String[]{}, false, 3, new String[][]{{"org.apache.commons.csv.CSVParser", "getHeaderMap", ""}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Long", actual.getClass().getName());
  assertEquals("3", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getCurrentLineNumber=0, getFirstEndOfLine=null, getRecordNumber=3, isClosed=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput048() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.csv.CSVParser", "org.apache.commons.csv.CSVParser", "getRecordNumber", new String[]{}, new String[]{}, false, 5, new String[][]{}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Long", actual.getClass().getName());
  assertEquals("5", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getCurrentLineNumber=0, getFirstEndOfLine=null, getRecordNumber=5, isClosed=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput049() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.csv.CSVParser", "org.apache.commons.csv.CSVParser", "getRecordNumber", new String[]{}, new String[]{}, false, 7, new String[][]{}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Long", actual.getClass().getName());
  assertEquals("7", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getCurrentLineNumber=0, getFirstEndOfLine=null, getRecordNumber=7, isClosed=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput050() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.csv.CSVParser", "org.apache.commons.csv.CSVParser", "getRecordNumber", new String[]{}, new String[]{}, false, 9, new String[][]{}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Long", actual.getClass().getName());
  assertEquals("9", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getCurrentLineNumber=0, getFirstEndOfLine=null, getRecordNumber=9, isClosed=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput051() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.csv.CSVParser", "org.apache.commons.csv.CSVParser", "parse", new String[]{"java.lang.String", "org.apache.commons.csv.CSVFormat"}, new String[]{"2147483648", "<sample:6>"}, true, 0, null, 1);
  assertNotNull(actual);
  assertEquals("org.apache.commons.csv.CSVParser", actual.getClass().getName());
  assertEquals("{getCurrentLineNumber=0, getFirstEndOfLine=null, getRecordNumber=0, isClosed=false}", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput052() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.csv.CSVParser", "org.apache.commons.csv.CSVParser", "nextRecord", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.csv.CSVParser", "getRecords", ""}, {"org.apache.commons.csv.CSVParser", "getCurrentLineNumber", ""}}, 1);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getCurrentLineNumber=0, getFirstEndOfLine=null, getRecordNumber=1, isClosed=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput053() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.csv.CSVParser", "org.apache.commons.csv.CSVParser", "nextRecord", new String[]{}, new String[]{}, false, 1, new String[][]{{"org.apache.commons.csv.CSVParser", "getRecords", ""}, {"org.apache.commons.csv.CSVParser", "getCurrentLineNumber", ""}}, 1);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getCurrentLineNumber=1, getFirstEndOfLine=\n, getRecordNumber=3, isClosed=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput054() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.csv.CSVParser", "org.apache.commons.csv.CSVParser", "nextRecord", new String[]{}, new String[]{}, false, 2, new String[][]{{"org.apache.commons.csv.CSVParser", "getRecords", ""}, {"org.apache.commons.csv.CSVParser", "getCurrentLineNumber", ""}, {"org.apache.commons.csv.CSVParser", "getRecordNumber", ""}}, 1);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getCurrentLineNumber=2, getFirstEndOfLine=\r\n, getRecordNumber=2, isClosed=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput055() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.csv.CSVParser", "org.apache.commons.csv.CSVParser", "parse", new String[]{"java.io.Reader", "org.apache.commons.csv.CSVFormat"}, new String[]{"<sample:0>", "<sample:2>"}, true, 0, null, 2);
  assertNotNull(actual);
  assertEquals("org.apache.commons.csv.CSVParser", actual.getClass().getName());
  assertEquals("{getCurrentLineNumber=0, getFirstEndOfLine=null, getRecordNumber=0, isClosed=false}", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput056() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.csv.CSVParser", "org.apache.commons.csv.CSVParser", "parse", new String[]{"java.io.Reader", "org.apache.commons.csv.CSVFormat"}, new String[]{"<null>", "<sample:1>"}, true, 0, null, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput057() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.csv.CSVParser", "org.apache.commons.csv.CSVParser", "getRecords", new String[]{}, new String[]{}, false, 3, new String[][]{{"org.apache.commons.csv.CSVParser", "getFirstEndOfLine", ""}}, 2), new String[][]{{"addAll", "int,java.util.Collection", "4"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IndexOutOfBoundsException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput058() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.csv.CSVParser", "org.apache.commons.csv.CSVParser", "iterator", new String[]{}, new String[]{}, false, 0, null, 3);
  assertNotNull(actual);
  assertEquals("org.apache.commons.csv.CSVParser$CSVRecordIterator", actual.getClass().getName());
  assertEquals("{hasNext=true}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getCurrentLineNumber=0, getFirstEndOfLine=null, getRecordNumber=1, isClosed=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput059() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.csv.CSVParser", "org.apache.commons.csv.CSVParser", "iterator", new String[]{}, new String[]{}, false, 0, null, 1);
  assertNotNull(actual);
  assertEquals("org.apache.commons.csv.CSVParser$CSVRecordIterator", actual.getClass().getName());
  assertEquals("{hasNext=true}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getCurrentLineNumber=0, getFirstEndOfLine=null, getRecordNumber=1, isClosed=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput060() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.csv.CSVParser", "org.apache.commons.csv.CSVParser", "isClosed", new String[]{}, new String[]{}, false, 14, new String[][]{{"org.apache.commons.csv.CSVParser", "getRecordNumber", ""}, {"org.apache.commons.csv.CSVParser", "getRecordNumber", ""}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getCurrentLineNumber=0, getFirstEndOfLine=null, getRecordNumber=0, isClosed=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput061() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.csv.CSVParser", "org.apache.commons.csv.CSVParser", "isClosed", new String[]{}, new String[]{}, false, 15, new String[][]{{"org.apache.commons.csv.CSVParser", "getRecordNumber", ""}, {"org.apache.commons.csv.CSVParser", "getRecordNumber", ""}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getCurrentLineNumber=0, getFirstEndOfLine=null, getRecordNumber=99, isClosed=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput062() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.csv.CSVParser", "org.apache.commons.csv.CSVParser", "parse", new String[]{"java.net.URL", "java.nio.charset.Charset", "org.apache.commons.csv.CSVFormat"}, new String[]{"<null>", "<sample:1>", "<sample:6>"}, true, 0, null, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput063() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.csv.CSVParser", "org.apache.commons.csv.CSVParser", "isClosed", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.csv.CSVParser", "nextRecord", ""}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getCurrentLineNumber=0, getFirstEndOfLine=null, getRecordNumber=1, isClosed=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput064() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.csv.CSVParser", "org.apache.commons.csv.CSVParser", "isClosed", new String[]{}, new String[]{}, false, 1, new String[][]{{"org.apache.commons.csv.CSVParser", "nextRecord", ""}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getCurrentLineNumber=1, getFirstEndOfLine=\n, getRecordNumber=2, isClosed=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput065() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.csv.CSVParser", "org.apache.commons.csv.CSVParser", "isClosed", new String[]{}, new String[]{}, false, 2, new String[][]{{"org.apache.commons.csv.CSVParser", "getCurrentLineNumber", ""}, {"org.apache.commons.csv.CSVParser", "nextRecord", ""}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getCurrentLineNumber=1, getFirstEndOfLine=\r\n, getRecordNumber=1, isClosed=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput066() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.csv.CSVParser", "org.apache.commons.csv.CSVParser", "isClosed", new String[]{}, new String[]{}, false, 3, new String[][]{{"org.apache.commons.csv.CSVParser", "getCurrentLineNumber", ""}, {"org.apache.commons.csv.CSVParser", "nextRecord", ""}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getCurrentLineNumber=1, getFirstEndOfLine=\r, getRecordNumber=4, isClosed=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput067() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.csv.CSVParser", "org.apache.commons.csv.CSVParser", "parse", new String[]{"java.nio.file.Path", "java.nio.charset.Charset", "org.apache.commons.csv.CSVFormat"}, new String[]{"<sample:7>", "<sample:0>", "<null>"}, true, 0, null, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput068() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.csv.CSVParser", "org.apache.commons.csv.CSVParser", "parse", new String[]{"java.lang.String", "org.apache.commons.csv.CSVFormat"}, new String[]{"(lie\036", "<sample:6>"}, true, 0, null, 2);
  assertNotNull(actual);
  assertEquals("org.apache.commons.csv.CSVParser", actual.getClass().getName());
  assertEquals("{getCurrentLineNumber=0, getFirstEndOfLine=null, getRecordNumber=0, isClosed=false}", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput069() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.csv.CSVParser", "org.apache.commons.csv.CSVParser", "parse", new String[]{"java.lang.String", "org.apache.commons.csv.CSVFormat"}, new String[]{"(lieO", "<sample:4>"}, true, 0, null, 2), new String[][]{{"iterator", "", "7"}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.csv.CSVParser$CSVRecordIterator", actual.getClass().getName());
  assertEquals("{hasNext=true}", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput070() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.csv.CSVParser", "org.apache.commons.csv.CSVParser", "parse", new String[]{"java.io.File", "java.nio.charset.Charset", "org.apache.commons.csv.CSVFormat"}, new String[]{"<sample:1>", "<sample:0>", "<sample:6>"}, true, 0, null, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.io.FileNotFoundException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput071() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.csv.CSVParser", "org.apache.commons.csv.CSVParser", "parse", new String[]{"java.nio.file.Path", "java.nio.charset.Charset", "org.apache.commons.csv.CSVFormat"}, new String[]{"<sample:0>", "<sample:0>", "<sample:2>"}, true, 0, null, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput072() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.csv.CSVParser", "org.apache.commons.csv.CSVParser", "parse", new String[]{"java.nio.file.Path", "java.nio.charset.Charset", "org.apache.commons.csv.CSVFormat"}, new String[]{"<null>", "<sample:0>", "<sample:8>"}, true, 0, null, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput073() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.csv.CSVParser", "org.apache.commons.csv.CSVParser", "getCurrentLineNumber", new String[]{}, new String[]{}, false, 3, new String[][]{{"org.apache.commons.csv.CSVParser", "nextRecord", ""}, {"org.apache.commons.csv.CSVParser", "close", ""}, {"org.apache.commons.csv.CSVParser", "getFirstEndOfLine", ""}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Long", actual.getClass().getName());
  assertEquals("1", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getCurrentLineNumber=1, getFirstEndOfLine=\r, getRecordNumber=4, isClosed=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput074() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.csv.CSVParser", "org.apache.commons.csv.CSVParser", "getCurrentLineNumber", new String[]{}, new String[]{}, false, 4, new String[][]{{"org.apache.commons.csv.CSVParser", "nextRecord", ""}, {"org.apache.commons.csv.CSVParser", "close", ""}, {"org.apache.commons.csv.CSVParser", "getFirstEndOfLine", ""}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Long", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getCurrentLineNumber=0, getFirstEndOfLine=null, getRecordNumber=0, isClosed=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput075() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.csv.CSVParser", "org.apache.commons.csv.CSVParser", "getCurrentLineNumber", new String[]{}, new String[]{}, false, 5, new String[][]{{"org.apache.commons.csv.CSVParser", "close", ""}, {"org.apache.commons.csv.CSVParser", "isClosed", ""}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Long", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getCurrentLineNumber=0, getFirstEndOfLine=null, getRecordNumber=5, isClosed=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput076() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.csv.CSVParser", "org.apache.commons.csv.CSVParser", "getCurrentLineNumber", new String[]{}, new String[]{}, false, 6, new String[][]{{"org.apache.commons.csv.CSVParser", "close", ""}, {"org.apache.commons.csv.CSVParser", "isClosed", ""}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Long", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getCurrentLineNumber=0, getFirstEndOfLine=null, getRecordNumber=0, isClosed=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput077() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.csv.CSVParser", "org.apache.commons.csv.CSVParser", "getCurrentLineNumber", new String[]{}, new String[]{}, false, 7, new String[][]{{"org.apache.commons.csv.CSVParser", "close", ""}, {"org.apache.commons.csv.CSVParser", "isClosed", ""}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Long", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getCurrentLineNumber=0, getFirstEndOfLine=null, getRecordNumber=7, isClosed=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput078() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.csv.CSVParser", "org.apache.commons.csv.CSVParser", "getCurrentLineNumber", new String[]{}, new String[]{}, false, 7, new String[][]{{"org.apache.commons.csv.CSVParser", "isClosed", ""}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Long", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getCurrentLineNumber=0, getFirstEndOfLine=null, getRecordNumber=7, isClosed=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput079() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.csv.CSVParser", "org.apache.commons.csv.CSVParser", "getCurrentLineNumber", new String[]{}, new String[]{}, false, 8, new String[][]{{"org.apache.commons.csv.CSVParser", "isClosed", ""}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Long", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getCurrentLineNumber=0, getFirstEndOfLine=null, getRecordNumber=0, isClosed=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput080() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.csv.CSVParser", "org.apache.commons.csv.CSVParser", "getHeaderMap", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.csv.CSVParser", "getRecords", ""}, {"org.apache.commons.csv.CSVParser", "getFirstEndOfLine", ""}}, 3);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getCurrentLineNumber=0, getFirstEndOfLine=null, getRecordNumber=1, isClosed=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput081() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.csv.CSVParser", "org.apache.commons.csv.CSVParser", "getHeaderMap", new String[]{}, new String[]{}, false, 1, new String[][]{{"org.apache.commons.csv.CSVParser", "getRecords", ""}, {"org.apache.commons.csv.CSVParser", "getFirstEndOfLine", ""}}, 3);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getCurrentLineNumber=1, getFirstEndOfLine=\n, getRecordNumber=3, isClosed=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput082() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.csv.CSVParser", "org.apache.commons.csv.CSVParser", "getHeaderMap", new String[]{}, new String[]{}, false, 2, new String[][]{{"org.apache.commons.csv.CSVParser", "getRecords", ""}, {"org.apache.commons.csv.CSVParser", "getFirstEndOfLine", ""}}, 3);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getCurrentLineNumber=2, getFirstEndOfLine=\r\n, getRecordNumber=2, isClosed=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput083() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.csv.CSVParser", "org.apache.commons.csv.CSVParser", "getHeaderMap", new String[]{}, new String[]{}, false, 15, new String[][]{{"org.apache.commons.csv.CSVParser", "getRecords", ""}, {"org.apache.commons.csv.CSVParser", "getFirstEndOfLine", ""}}, 3);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getCurrentLineNumber=1, getFirstEndOfLine=\r, getRecordNumber=101, isClosed=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput084() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.csv.CSVParser", "org.apache.commons.csv.CSVParser", "getHeaderMap", new String[]{}, new String[]{}, false, 17, new String[][]{{"org.apache.commons.csv.CSVParser", "getRecords", ""}, {"org.apache.commons.csv.CSVParser", "getFirstEndOfLine", ""}}, 3);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getCurrentLineNumber=0, getFirstEndOfLine=null, getRecordNumber=256, isClosed=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput085() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.csv.CSVParser", "org.apache.commons.csv.CSVParser", "parse", new String[]{"java.net.URL", "java.nio.charset.Charset", "org.apache.commons.csv.CSVFormat"}, new String[]{"<sample:2>", "<empty>", "<null>"}, true, 0, null, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput086() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.csv.CSVParser", "org.apache.commons.csv.CSVParser", "getRecords", new String[]{}, new String[]{}, false, 0, null, 3), new String[][]{{"listIterator", "int", "5"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IndexOutOfBoundsException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput087() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.csv.CSVParser", "org.apache.commons.csv.CSVParser", "getRecords", new String[]{}, new String[]{}, false, 1, new String[][]{}, 3), new String[][]{{"listIterator", "int", "5"}});
  assertNotNull(actual);
  assertEquals("java.util.ArrayList$ListItr", actual.getClass().getName());
  assertEquals("{hasNext=false, hasPrevious=true}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getCurrentLineNumber=1, getFirstEndOfLine=\n, getRecordNumber=3, isClosed=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput088() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.csv.CSVParser", "org.apache.commons.csv.CSVParser", "iterator", new String[]{}, new String[]{}, false, 1, new String[][]{});
  assertNotNull(actual);
  assertEquals("org.apache.commons.csv.CSVParser$CSVRecordIterator", actual.getClass().getName());
  assertEquals("{hasNext=true}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getCurrentLineNumber=1, getFirstEndOfLine=\n, getRecordNumber=2, isClosed=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput089() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.csv.CSVParser", "org.apache.commons.csv.CSVParser", "iterator", new String[]{}, new String[]{}, false, 2, new String[][]{});
  assertNotNull(actual);
  assertEquals("org.apache.commons.csv.CSVParser$CSVRecordIterator", actual.getClass().getName());
  assertEquals("{hasNext=true}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getCurrentLineNumber=1, getFirstEndOfLine=\r\n, getRecordNumber=1, isClosed=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput090() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.csv.CSVParser", "org.apache.commons.csv.CSVParser", "iterator", new String[]{}, new String[]{}, false, 3, new String[][]{});
  assertNotNull(actual);
  assertEquals("org.apache.commons.csv.CSVParser$CSVRecordIterator", actual.getClass().getName());
  assertEquals("{hasNext=true}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getCurrentLineNumber=1, getFirstEndOfLine=\r, getRecordNumber=4, isClosed=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput091() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.csv.CSVParser", "org.apache.commons.csv.CSVParser", "iterator", new String[]{}, new String[]{}, false, 4, new String[][]{});
  assertNotNull(actual);
  assertEquals("org.apache.commons.csv.CSVParser$CSVRecordIterator", actual.getClass().getName());
  assertEquals("{hasNext=false}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getCurrentLineNumber=0, getFirstEndOfLine=null, getRecordNumber=0, isClosed=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput092() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.csv.CSVParser", "org.apache.commons.csv.CSVParser", "iterator", new String[]{}, new String[]{}, false, 5, new String[][]{});
  assertNotNull(actual);
  assertEquals("org.apache.commons.csv.CSVParser$CSVRecordIterator", actual.getClass().getName());
  assertEquals("{hasNext=true}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getCurrentLineNumber=0, getFirstEndOfLine=null, getRecordNumber=6, isClosed=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput093() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.csv.CSVParser", "org.apache.commons.csv.CSVParser", "isClosed", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.csv.CSVParser", "getRecordNumber", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getCurrentLineNumber=0, getFirstEndOfLine=null, getRecordNumber=0, isClosed=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput094() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.csv.CSVParser", "org.apache.commons.csv.CSVParser", "isClosed", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.csv.CSVParser", "getRecordNumber", ""}, {"org.apache.commons.csv.CSVParser", "getRecords", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getCurrentLineNumber=0, getFirstEndOfLine=null, getRecordNumber=1, isClosed=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput095() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.csv.CSVParser", "org.apache.commons.csv.CSVParser", "isClosed", new String[]{}, new String[]{}, false, 1, new String[][]{{"org.apache.commons.csv.CSVParser", "getRecordNumber", ""}, {"org.apache.commons.csv.CSVParser", "getRecords", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getCurrentLineNumber=1, getFirstEndOfLine=\n, getRecordNumber=3, isClosed=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput096() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.csv.CSVParser", "org.apache.commons.csv.CSVParser", "isClosed", new String[]{}, new String[]{}, false, 2, new String[][]{{"org.apache.commons.csv.CSVParser", "getRecordNumber", ""}, {"org.apache.commons.csv.CSVParser", "getRecords", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getCurrentLineNumber=2, getFirstEndOfLine=\r\n, getRecordNumber=2, isClosed=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput097() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.csv.CSVParser", "org.apache.commons.csv.CSVParser", "isClosed", new String[]{}, new String[]{}, false, 3, new String[][]{{"org.apache.commons.csv.CSVParser", "getRecordNumber", ""}, {"org.apache.commons.csv.CSVParser", "getRecords", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getCurrentLineNumber=1, getFirstEndOfLine=\r, getRecordNumber=5, isClosed=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput098() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.csv.CSVParser", "org.apache.commons.csv.CSVParser", "isClosed", new String[]{}, new String[]{}, false, 2, new String[][]{{"org.apache.commons.csv.CSVParser", "getRecordNumber", ""}, {"org.apache.commons.csv.CSVParser", "getRecords", ""}, {"org.apache.commons.csv.CSVParser", "close", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getCurrentLineNumber=2, getFirstEndOfLine=\r\n, getRecordNumber=2, isClosed=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput099() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.csv.CSVParser", "org.apache.commons.csv.CSVParser", "isClosed", new String[]{}, new String[]{}, false, 6, new String[][]{{"org.apache.commons.csv.CSVParser", "getRecordNumber", ""}, {"org.apache.commons.csv.CSVParser", "getRecords", ""}, {"org.apache.commons.csv.CSVParser", "close", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getCurrentLineNumber=0, getFirstEndOfLine=null, getRecordNumber=1, isClosed=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput100() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.csv.CSVParser", "org.apache.commons.csv.CSVParser", "isClosed", new String[]{}, new String[]{}, false, 9, new String[][]{{"org.apache.commons.csv.CSVParser", "getRecordNumber", ""}, {"org.apache.commons.csv.CSVParser", "getRecords", ""}, {"org.apache.commons.csv.CSVParser", "close", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getCurrentLineNumber=1, getFirstEndOfLine=\n, getRecordNumber=10, isClosed=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput101() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.csv.CSVParser", "org.apache.commons.csv.CSVParser", "iterator", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.csv.CSVParser", "getHeaderMap", ""}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.csv.CSVParser$CSVRecordIterator", actual.getClass().getName());
  assertEquals("{hasNext=true}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getCurrentLineNumber=0, getFirstEndOfLine=null, getRecordNumber=1, isClosed=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput102() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.csv.CSVParser", "org.apache.commons.csv.CSVParser", "iterator", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.csv.CSVParser", "getHeaderMap", ""}}), new String[][]{{"next", "", "4"}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.csv.CSVRecord", actual.getClass().getName());
  assertEquals("CSVRecord [comment=null, mapping=null, recordNumber=1, values=[a]] {getCharacterPosition=0, getComment=null, getRecordNumber=1, hasComment=false, isConsistent=true, size=1}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getCurrentLineNumber=0, getFirstEndOfLine=null, getRecordNumber=1, isClosed=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput103() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.csv.CSVParser", "org.apache.commons.csv.CSVParser", "iterator", new String[]{}, new String[]{}, false, 14, new String[][]{{"org.apache.commons.csv.CSVParser", "iterator", ""}, {"org.apache.commons.csv.CSVParser", "nextRecord", ""}}), new String[][]{{"next", "", "4"}, {"getCharacterPosition", "", "7"}});
  assertNotNull(actual);
  assertEquals("java.lang.Long", actual.getClass().getName());
  assertEquals("4", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getCurrentLineNumber=2, getFirstEndOfLine=\n, getRecordNumber=2, isClosed=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput104() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.csv.CSVParser", "org.apache.commons.csv.CSVParser", "iterator", new String[]{}, new String[]{}, false, 15, new String[][]{{"org.apache.commons.csv.CSVParser", "iterator", ""}, {"org.apache.commons.csv.CSVParser", "nextRecord", ""}}), new String[][]{{"next", "", "4"}, {"getCharacterPosition", "", "7"}});
  assertNotNull(actual);
  assertEquals("java.lang.Long", actual.getClass().getName());
  assertEquals("66", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getCurrentLineNumber=1, getFirstEndOfLine=\r, getRecordNumber=101, isClosed=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput105() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.csv.CSVParser", "org.apache.commons.csv.CSVParser", "iterator", new String[]{}, new String[]{}, false, 20, new String[][]{{"org.apache.commons.csv.CSVParser", "iterator", ""}}), new String[][]{{"next", "", "4"}, {"getCharacterPosition", "", "7"}});
  assertNotNull(actual);
  assertEquals("java.lang.Long", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getCurrentLineNumber=0, getFirstEndOfLine=null, getRecordNumber=1, isClosed=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput106() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.csv.CSVParser", "org.apache.commons.csv.CSVParser", "iterator", new String[]{}, new String[]{}, false, 7, new String[][]{});
  assertNotNull(actual);
  assertEquals("org.apache.commons.csv.CSVParser$CSVRecordIterator", actual.getClass().getName());
  assertEquals("{hasNext=true}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getCurrentLineNumber=0, getFirstEndOfLine=null, getRecordNumber=8, isClosed=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput107() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.csv.CSVParser", "org.apache.commons.csv.CSVParser", "iterator", new String[]{}, new String[]{}, false, 9, new String[][]{{"org.apache.commons.csv.CSVParser", "iterator", ""}}), new String[][]{{"hasNext", "", "5"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getCurrentLineNumber=1, getFirstEndOfLine=\n, getRecordNumber=10, isClosed=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput108() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.csv.CSVParser", "org.apache.commons.csv.CSVParser", "parse", new String[]{"java.io.InputStream", "java.nio.charset.Charset", "org.apache.commons.csv.CSVFormat"}, new String[]{"<sample:0>", "<sample:3>", "<sample:4>"}, true);
  assertNotNull(actual);
  assertEquals("org.apache.commons.csv.CSVParser", actual.getClass().getName());
  assertEquals("{getCurrentLineNumber=0, getFirstEndOfLine=null, getRecordNumber=0, isClosed=false}", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput109() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.csv.CSVParser", "org.apache.commons.csv.CSVParser", "getCurrentLineNumber", new String[]{}, new String[]{}, false);
  assertNotNull(actual);
  assertEquals("java.lang.Long", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getCurrentLineNumber=0, getFirstEndOfLine=null, getRecordNumber=0, isClosed=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput110() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.csv.CSVParser", "org.apache.commons.csv.CSVParser", "getCurrentLineNumber", new String[]{}, new String[]{}, false, 1, new String[][]{});
  assertNotNull(actual);
  assertEquals("java.lang.Long", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getCurrentLineNumber=0, getFirstEndOfLine=null, getRecordNumber=1, isClosed=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput111() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.csv.CSVParser", "org.apache.commons.csv.CSVParser", "getCurrentLineNumber", new String[]{}, new String[]{}, false, 3, new String[][]{});
  assertNotNull(actual);
  assertEquals("java.lang.Long", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getCurrentLineNumber=0, getFirstEndOfLine=null, getRecordNumber=3, isClosed=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput112() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.csv.CSVParser", "org.apache.commons.csv.CSVParser", "getCurrentLineNumber", new String[]{}, new String[]{}, false, 5, new String[][]{});
  assertNotNull(actual);
  assertEquals("java.lang.Long", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getCurrentLineNumber=0, getFirstEndOfLine=null, getRecordNumber=5, isClosed=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput113() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.csv.CSVParser", "org.apache.commons.csv.CSVParser", "getCurrentLineNumber", new String[]{}, new String[]{}, false, 7, new String[][]{});
  assertNotNull(actual);
  assertEquals("java.lang.Long", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getCurrentLineNumber=0, getFirstEndOfLine=null, getRecordNumber=7, isClosed=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput114() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.csv.CSVParser", "org.apache.commons.csv.CSVParser", "parse", new String[]{"java.io.Reader", "org.apache.commons.csv.CSVFormat"}, new String[]{"<null>", "<sample:2>"}, true); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput115() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.csv.CSVParser", "org.apache.commons.csv.CSVParser", "parse", new String[]{"java.io.Reader", "org.apache.commons.csv.CSVFormat"}, new String[]{"<sample:0>", "<sample:2>"}, true);
  assertNotNull(actual);
  assertEquals("org.apache.commons.csv.CSVParser", actual.getClass().getName());
  assertEquals("{getCurrentLineNumber=0, getFirstEndOfLine=null, getRecordNumber=0, isClosed=false}", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput116() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.csv.CSVParser", "org.apache.commons.csv.CSVParser", "parse", new String[]{"java.io.Reader", "org.apache.commons.csv.CSVFormat"}, new String[]{"<sample:1>", "<sample:0>"}, true), new String[][]{{"iterator", "", "1"}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.csv.CSVParser$CSVRecordIterator", actual.getClass().getName());
  assertEquals("{hasNext=true}", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput117() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.csv.CSVParser", "org.apache.commons.csv.CSVParser", "parse", new String[]{"java.net.URL", "java.nio.charset.Charset", "org.apache.commons.csv.CSVFormat"}, new String[]{"<sample:3>", "<null>", "<sample:7>"}, true); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput118() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.csv.CSVParser", "org.apache.commons.csv.CSVParser", "parse", new String[]{"java.lang.String", "org.apache.commons.csv.CSVFormat"}, new String[]{"string", "<sample:5>"}, true);
  assertNotNull(actual);
  assertEquals("org.apache.commons.csv.CSVParser", actual.getClass().getName());
  assertEquals("{getCurrentLineNumber=0, getFirstEndOfLine=null, getRecordNumber=0, isClosed=false}", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput119() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.csv.CSVParser", "org.apache.commons.csv.CSVParser", "parse", new String[]{"java.lang.String", "org.apache.commons.csv.CSVFormat"}, new String[]{"string", "<null>"}, true); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput120() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.csv.CSVParser", "org.apache.commons.csv.CSVParser", "parse", new String[]{"java.lang.String", "org.apache.commons.csv.CSVFormat"}, new String[]{"string", "<sample:6>"}, true), new String[][]{{"getHeaderMap", "", "6"}});
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput121() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.csv.CSVParser", "org.apache.commons.csv.CSVParser", "getHeaderMap", new String[]{}, new String[]{}, false);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getCurrentLineNumber=0, getFirstEndOfLine=null, getRecordNumber=0, isClosed=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput122() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.csv.CSVParser", "org.apache.commons.csv.CSVParser", "getHeaderMap", new String[]{}, new String[]{}, false, 1, new String[][]{});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getCurrentLineNumber=0, getFirstEndOfLine=null, getRecordNumber=1, isClosed=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput123() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.csv.CSVParser", "org.apache.commons.csv.CSVParser", "getHeaderMap", new String[]{}, new String[]{}, false, 3, new String[][]{});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getCurrentLineNumber=0, getFirstEndOfLine=null, getRecordNumber=3, isClosed=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput124() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.csv.CSVParser", "org.apache.commons.csv.CSVParser", "getHeaderMap", new String[]{}, new String[]{}, false, 5, new String[][]{});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getCurrentLineNumber=0, getFirstEndOfLine=null, getRecordNumber=5, isClosed=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput125() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.csv.CSVParser", "org.apache.commons.csv.CSVParser", "getHeaderMap", new String[]{}, new String[]{}, false, 7, new String[][]{});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getCurrentLineNumber=0, getFirstEndOfLine=null, getRecordNumber=7, isClosed=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput126() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.csv.CSVParser", "org.apache.commons.csv.CSVParser", "nextRecord", new String[]{}, new String[]{}, false);
  assertNotNull(actual);
  assertEquals("org.apache.commons.csv.CSVRecord", actual.getClass().getName());
  assertEquals("CSVRecord [comment=null, mapping=null, recordNumber=1, values=[a]] {getCharacterPosition=0, getComment=null, getRecordNumber=1, hasComment=false, isConsistent=true, size=1}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getCurrentLineNumber=0, getFirstEndOfLine=null, getRecordNumber=1, isClosed=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput127() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.csv.CSVParser", "org.apache.commons.csv.CSVParser", "nextRecord", new String[]{}, new String[]{}, false, 1, new String[][]{});
  assertNotNull(actual);
  assertEquals("org.apache.commons.csv.CSVRecord", actual.getClass().getName());
  assertEquals("CSVRecord [comment=null, mapping=null, recordNumber=2, values=[a]] {getCharacterPosition=9223372036854775807, getComment=null, getRecordNumber=2, hasComment=false, isConsistent=true, size=1}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getCurrentLineNumber=1, getFirstEndOfLine=\n, getRecordNumber=2, isClosed=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput128() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.csv.CSVParser", "org.apache.commons.csv.CSVParser", "parse", new String[]{"java.io.Reader", "org.apache.commons.csv.CSVFormat"}, new String[]{"<sample:1>", "<sample:6>"}, true), new String[][]{{"iterator", "", "2"}, {"hasNext", "", "0"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput129() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.csv.CSVParser", "org.apache.commons.csv.CSVParser", "parse", new String[]{"java.io.Reader", "org.apache.commons.csv.CSVFormat"}, new String[]{"<sample:2>", "<sample:1>"}, true), new String[][]{{"iterator", "", "2"}, {"hasNext", "", "0"}, {"remove", "", "7"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.UnsupportedOperationException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput130() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.csv.CSVParser", "org.apache.commons.csv.CSVParser", "parse", new String[]{"java.lang.String", "org.apache.commons.csv.CSVFormat"}, new String[]{"Hello, World", "<sample:6>"}, true), new String[][]{{"getRecords", "", "0"}, {"removeAll", "java.util.Collection", "4"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput131() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.csv.CSVParser", "org.apache.commons.csv.CSVParser", "parse", new String[]{"java.lang.String", "org.apache.commons.csv.CSVFormat"}, new String[]{"Hel;gp,W", "<sample:7>"}, true), new String[][]{{"getRecords", "", "5"}, {"removeAll", "java.util.Collection", "4"}, {"add", "int,java.lang.Object", "1"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IndexOutOfBoundsException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput132() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.csv.CSVParser", "org.apache.commons.csv.CSVParser", "close", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.csv.CSVParser", "getCurrentLineNumber", ""}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getCurrentLineNumber=0, getFirstEndOfLine=null, getRecordNumber=0, isClosed=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput133() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.csv.CSVParser", "org.apache.commons.csv.CSVParser", "getRecordNumber", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.csv.CSVParser", "nextRecord", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.Long", actual.getClass().getName());
  assertEquals("1", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getCurrentLineNumber=0, getFirstEndOfLine=null, getRecordNumber=1, isClosed=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput134() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.csv.CSVParser", "org.apache.commons.csv.CSVParser", "getRecordNumber", new String[]{}, new String[]{}, false, 1, new String[][]{{"org.apache.commons.csv.CSVParser", "nextRecord", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.Long", actual.getClass().getName());
  assertEquals("2", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getCurrentLineNumber=1, getFirstEndOfLine=\n, getRecordNumber=2, isClosed=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput135() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.csv.CSVParser", "org.apache.commons.csv.CSVParser", "getRecordNumber", new String[]{}, new String[]{}, false, 2, new String[][]{{"org.apache.commons.csv.CSVParser", "nextRecord", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.Long", actual.getClass().getName());
  assertEquals("1", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getCurrentLineNumber=1, getFirstEndOfLine=\r\n, getRecordNumber=1, isClosed=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput136() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.csv.CSVParser", "org.apache.commons.csv.CSVParser", "getRecordNumber", new String[]{}, new String[]{}, false, 3, new String[][]{{"org.apache.commons.csv.CSVParser", "nextRecord", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.Long", actual.getClass().getName());
  assertEquals("4", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getCurrentLineNumber=1, getFirstEndOfLine=\r, getRecordNumber=4, isClosed=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput137() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.csv.CSVParser", "org.apache.commons.csv.CSVParser", "getRecordNumber", new String[]{}, new String[]{}, false, 4, new String[][]{{"org.apache.commons.csv.CSVParser", "nextRecord", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.Long", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getCurrentLineNumber=0, getFirstEndOfLine=null, getRecordNumber=0, isClosed=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput138() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.csv.CSVParser", "org.apache.commons.csv.CSVParser", "getRecordNumber", new String[]{}, new String[]{}, false, 5, new String[][]{});
  assertNotNull(actual);
  assertEquals("java.lang.Long", actual.getClass().getName());
  assertEquals("5", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getCurrentLineNumber=0, getFirstEndOfLine=null, getRecordNumber=5, isClosed=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput139() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.csv.CSVParser", "org.apache.commons.csv.CSVParser", "getRecordNumber", new String[]{}, new String[]{}, false, 7, new String[][]{});
  assertNotNull(actual);
  assertEquals("java.lang.Long", actual.getClass().getName());
  assertEquals("7", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getCurrentLineNumber=0, getFirstEndOfLine=null, getRecordNumber=7, isClosed=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput140() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.csv.CSVParser", "org.apache.commons.csv.CSVParser", "nextRecord", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.csv.CSVParser", "isClosed", ""}, {"org.apache.commons.csv.CSVParser", "nextRecord", ""}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getCurrentLineNumber=0, getFirstEndOfLine=null, getRecordNumber=1, isClosed=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput141() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.csv.CSVParser", "org.apache.commons.csv.CSVParser", "nextRecord", new String[]{}, new String[]{}, false), new String[][]{{"get", "java.lang.Enum", "3"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput142() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.csv.CSVParser", "org.apache.commons.csv.CSVParser", "nextRecord", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.csv.CSVParser", "isClosed", ""}}), new String[][]{{"get", "java.lang.String", "5"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalStateException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput143() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.csv.CSVParser", "org.apache.commons.csv.CSVParser", "nextRecord", new String[]{}, new String[]{}, false, 4, new String[][]{});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getCurrentLineNumber=0, getFirstEndOfLine=null, getRecordNumber=0, isClosed=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput144() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.csv.CSVParser", "org.apache.commons.csv.CSVParser", "nextRecord", new String[]{}, new String[]{}, false, 3, new String[][]{});
  assertNotNull(actual);
  assertEquals("org.apache.commons.csv.CSVRecord", actual.getClass().getName());
  assertEquals("CSVRecord [comment=null, mapping=null, recordNumber=4, values=[a]] {getCharacterPosition=3, getComment=null, getRecordNumber=4, hasComment=false, isConsistent=true, size=1}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getCurrentLineNumber=1, getFirstEndOfLine=\r, getRecordNumber=4, isClosed=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput145() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.csv.CSVParser", "org.apache.commons.csv.CSVParser", "getRecords", new String[]{}, new String[]{}, false);
  assertNotNull(actual);
  assertEquals("java.util.ArrayList", actual.getClass().getName());
  assertEquals("[CSVRecord [comment=null, mapping=null, recordNumber=1, values=[a]]]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getCurrentLineNumber=0, getFirstEndOfLine=null, getRecordNumber=1, isClosed=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput146() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.csv.CSVParser", "org.apache.commons.csv.CSVParser", "getRecords", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.csv.CSVParser", "isClosed", ""}}), new String[][]{{"size", "", "1"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("1", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getCurrentLineNumber=0, getFirstEndOfLine=null, getRecordNumber=1, isClosed=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput147() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.csv.CSVParser", "org.apache.commons.csv.CSVParser", "getRecords", new String[]{}, new String[]{}, false, 1, new String[][]{{"org.apache.commons.csv.CSVParser", "isClosed", ""}}), new String[][]{{"size", "", "1"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("2", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getCurrentLineNumber=1, getFirstEndOfLine=\n, getRecordNumber=3, isClosed=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput148() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.csv.CSVParser", "org.apache.commons.csv.CSVParser", "getRecords", new String[]{}, new String[]{}, false, 2, new String[][]{{"org.apache.commons.csv.CSVParser", "isClosed", ""}}), new String[][]{{"size", "", "1"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("2", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getCurrentLineNumber=2, getFirstEndOfLine=\r\n, getRecordNumber=2, isClosed=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput149() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.csv.CSVParser", "org.apache.commons.csv.CSVParser", "getRecords", new String[]{}, new String[]{}, false, 3, new String[][]{{"org.apache.commons.csv.CSVParser", "isClosed", ""}}), new String[][]{{"size", "", "1"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("2", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getCurrentLineNumber=1, getFirstEndOfLine=\r, getRecordNumber=5, isClosed=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput150() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.csv.CSVParser", "org.apache.commons.csv.CSVParser", "getRecordNumber", new String[]{}, new String[]{}, false, 3, new String[][]{});
  assertNotNull(actual);
  assertEquals("java.lang.Long", actual.getClass().getName());
  assertEquals("3", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getCurrentLineNumber=0, getFirstEndOfLine=null, getRecordNumber=3, isClosed=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput151() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.csv.CSVParser", "org.apache.commons.csv.CSVParser", "getRecordNumber", new String[]{}, new String[]{}, false, 9, new String[][]{});
  assertNotNull(actual);
  assertEquals("java.lang.Long", actual.getClass().getName());
  assertEquals("9", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getCurrentLineNumber=0, getFirstEndOfLine=null, getRecordNumber=9, isClosed=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput152() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.csv.CSVParser", "org.apache.commons.csv.CSVParser", "getRecordNumber", new String[]{}, new String[]{}, false, 11, new String[][]{});
  assertNotNull(actual);
  assertEquals("java.lang.Long", actual.getClass().getName());
  assertEquals("11", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getCurrentLineNumber=0, getFirstEndOfLine=null, getRecordNumber=11, isClosed=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput153() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.csv.CSVParser", "org.apache.commons.csv.CSVParser", "getRecordNumber", new String[]{}, new String[]{}, false, 13, new String[][]{});
  assertNotNull(actual);
  assertEquals("java.lang.Long", actual.getClass().getName());
  assertEquals("31", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getCurrentLineNumber=0, getFirstEndOfLine=null, getRecordNumber=31, isClosed=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput154() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.csv.CSVParser", "org.apache.commons.csv.CSVParser", "getRecordNumber", new String[]{}, new String[]{}, false, 15, new String[][]{});
  assertNotNull(actual);
  assertEquals("java.lang.Long", actual.getClass().getName());
  assertEquals("99", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getCurrentLineNumber=0, getFirstEndOfLine=null, getRecordNumber=99, isClosed=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput155() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.csv.CSVParser", "org.apache.commons.csv.CSVParser", "getFirstEndOfLine", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.csv.CSVParser", "isClosed", ""}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getCurrentLineNumber=0, getFirstEndOfLine=null, getRecordNumber=0, isClosed=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput156() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.csv.CSVParser", "org.apache.commons.csv.CSVParser", "close", new String[]{}, new String[]{}, false, 5, new String[][]{{"org.apache.commons.csv.CSVParser", "nextRecord", ""}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getCurrentLineNumber=0, getFirstEndOfLine=null, getRecordNumber=6, isClosed=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput157() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.csv.CSVParser", "org.apache.commons.csv.CSVParser", "close", new String[]{}, new String[]{}, false, 6, new String[][]{{"org.apache.commons.csv.CSVParser", "nextRecord", ""}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getCurrentLineNumber=0, getFirstEndOfLine=null, getRecordNumber=1, isClosed=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput158() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.csv.CSVParser", "org.apache.commons.csv.CSVParser", "close", new String[]{}, new String[]{}, false, 7, new String[][]{{"org.apache.commons.csv.CSVParser", "nextRecord", ""}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getCurrentLineNumber=0, getFirstEndOfLine=null, getRecordNumber=8, isClosed=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput159() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.csv.CSVParser", "org.apache.commons.csv.CSVParser", "iterator", new String[]{}, new String[]{}, false, 4, new String[][]{{"org.apache.commons.csv.CSVParser", "getCurrentLineNumber", ""}}), new String[][]{{"remove", "", "0"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.UnsupportedOperationException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput160() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.csv.CSVParser", "org.apache.commons.csv.CSVParser", "getFirstEndOfLine", new String[]{}, new String[]{}, false, 1, new String[][]{{"org.apache.commons.csv.CSVParser", "iterator", ""}, {"org.apache.commons.csv.CSVParser", "getFirstEndOfLine", ""}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getCurrentLineNumber=0, getFirstEndOfLine=null, getRecordNumber=1, isClosed=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput161() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.csv.CSVParser", "org.apache.commons.csv.CSVParser", "getFirstEndOfLine", new String[]{}, new String[]{}, false, 1, new String[][]{{"org.apache.commons.csv.CSVParser", "iterator", ""}, {"org.apache.commons.csv.CSVParser", "getFirstEndOfLine", ""}, {"org.apache.commons.csv.CSVParser", "getRecords", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("\n", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getCurrentLineNumber=1, getFirstEndOfLine=\n, getRecordNumber=3, isClosed=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput162() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.csv.CSVParser", "org.apache.commons.csv.CSVParser", "getFirstEndOfLine", new String[]{}, new String[]{}, false, 2, new String[][]{{"org.apache.commons.csv.CSVParser", "iterator", ""}, {"org.apache.commons.csv.CSVParser", "getFirstEndOfLine", ""}, {"org.apache.commons.csv.CSVParser", "getRecords", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("\r\n", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getCurrentLineNumber=2, getFirstEndOfLine=\r\n, getRecordNumber=2, isClosed=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput163() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.csv.CSVParser", "org.apache.commons.csv.CSVParser", "getFirstEndOfLine", new String[]{}, new String[]{}, false, 3, new String[][]{{"org.apache.commons.csv.CSVParser", "iterator", ""}, {"org.apache.commons.csv.CSVParser", "getRecords", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("\r", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getCurrentLineNumber=1, getFirstEndOfLine=\r, getRecordNumber=5, isClosed=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput164() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.csv.CSVParser", "org.apache.commons.csv.CSVParser", "getFirstEndOfLine", new String[]{}, new String[]{}, false, 8, new String[][]{{"org.apache.commons.csv.CSVParser", "iterator", ""}, {"org.apache.commons.csv.CSVParser", "isClosed", ""}, {"org.apache.commons.csv.CSVParser", "getRecords", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("\n", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getCurrentLineNumber=1, getFirstEndOfLine=\n, getRecordNumber=2, isClosed=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput165() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.csv.CSVParser", "org.apache.commons.csv.CSVParser", "getFirstEndOfLine", new String[]{}, new String[]{}, false, 9, new String[][]{{"org.apache.commons.csv.CSVParser", "iterator", ""}, {"org.apache.commons.csv.CSVParser", "isClosed", ""}, {"org.apache.commons.csv.CSVParser", "getRecords", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("\n", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getCurrentLineNumber=1, getFirstEndOfLine=\n, getRecordNumber=10, isClosed=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput166() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.csv.CSVParser", "org.apache.commons.csv.CSVParser", "getFirstEndOfLine", new String[]{}, new String[]{}, false, 11, new String[][]{{"org.apache.commons.csv.CSVParser", "iterator", ""}, {"org.apache.commons.csv.CSVParser", "isClosed", ""}, {"org.apache.commons.csv.CSVParser", "getRecords", ""}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getCurrentLineNumber=0, getFirstEndOfLine=null, getRecordNumber=11, isClosed=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput167() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.csv.CSVParser", "org.apache.commons.csv.CSVParser", "parse", new String[]{"java.io.Reader", "org.apache.commons.csv.CSVFormat"}, new String[]{"<sample:0>", "<sample:2>"}, true), new String[][]{{"getCurrentLineNumber", "", "5"}});
  assertNotNull(actual);
  assertEquals("java.lang.Long", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput168() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.csv.CSVParser", "org.apache.commons.csv.CSVParser", "getRecords", new String[]{}, new String[]{}, false), new String[][]{{"addAll", "int,java.util.Collection", "4"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IndexOutOfBoundsException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput169() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.csv.CSVParser", "org.apache.commons.csv.CSVParser", "parse", new String[]{"java.lang.String", "org.apache.commons.csv.CSVFormat"}, new String[]{"i", "<sample:0>"}, true), new String[][]{{"close", "", "5"}, {"getRecordNumber", "", "6"}});
  assertNotNull(actual);
  assertEquals("java.lang.Long", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput170() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.csv.CSVParser", "org.apache.commons.csv.CSVParser", "parse", new String[]{"java.io.File", "java.nio.charset.Charset", "org.apache.commons.csv.CSVFormat"}, new String[]{"<sample:0>", "<sample:1>", "<null>"}, true); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput171() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.csv.CSVParser", "org.apache.commons.csv.CSVParser", "parse", new String[]{"java.nio.file.Path", "java.nio.charset.Charset", "org.apache.commons.csv.CSVFormat"}, new String[]{"<null>", "<sample:2>", "<sample:1>"}, true); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput172() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.csv.CSVParser", "org.apache.commons.csv.CSVParser", "parse", new String[]{"java.io.InputStream", "java.nio.charset.Charset", "org.apache.commons.csv.CSVFormat"}, new String[]{"<sample:2>", "<null>", "<sample:0>"}, true); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput173() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.csv.CSVParser", "org.apache.commons.csv.CSVParser", "parse", new String[]{"java.io.InputStream", "java.nio.charset.Charset", "org.apache.commons.csv.CSVFormat"}, new String[]{"<sample:0>", "<empty>", "<null>"}, true); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput174() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.csv.CSVParser", "org.apache.commons.csv.CSVParser", "parse", new String[]{"java.io.InputStream", "java.nio.charset.Charset", "org.apache.commons.csv.CSVFormat"}, new String[]{"<sample:0>", "<empty>", "<sample:4>"}, true), new String[][]{{"iterator", "", "2"}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.csv.CSVParser$CSVRecordIterator", actual.getClass().getName());
  assertEquals("{hasNext=false}", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput175() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.csv.CSVParser", "org.apache.commons.csv.CSVParser", "parse", new String[]{"java.io.InputStream", "java.nio.charset.Charset", "org.apache.commons.csv.CSVFormat"}, new String[]{"<sample:3>", "<empty>", "<sample:0>"}, true), new String[][]{{"iterator", "", "2"}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.csv.CSVParser$CSVRecordIterator", actual.getClass().getName());
  assertEquals("{hasNext=true}", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput176() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.csv.CSVParser", "org.apache.commons.csv.CSVParser", "parse", new String[]{"java.lang.String", "org.apache.commons.csv.CSVFormat"}, new String[]{"(3dO", "<sample:3>"}, true), new String[][]{{"iterator", "", "7"}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.csv.CSVParser$CSVRecordIterator", actual.getClass().getName());
  assertEquals("{hasNext=true}", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput177() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.csv.CSVParser", "org.apache.commons.csv.CSVParser", "parse", new String[]{"java.lang.String", "org.apache.commons.csv.CSVFormat"}, new String[]{"", "<sample:5>"}, true), new String[][]{{"iterator", "", "7"}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.csv.CSVParser$CSVRecordIterator", actual.getClass().getName());
  assertEquals("{hasNext=false}", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput178() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.csv.CSVParser", "org.apache.commons.csv.CSVParser", "parse", new String[]{"java.lang.String", "org.apache.commons.csv.CSVFormat"}, new String[]{"\n", "<sample:7>"}, true), new String[][]{{"iterator", "", "7"}, {"hasNext", "", "2"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput179() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.csv.CSVParser", "org.apache.commons.csv.CSVParser", "parse", new String[]{"java.lang.String", "org.apache.commons.csv.CSVFormat"}, new String[]{" n-0.0", "<sample:8>"}, true), new String[][]{{"iterator", "", "7"}, {"hasNext", "", "2"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput180() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.csv.CSVParser", "org.apache.commons.csv.CSVParser", "parse", new String[]{"java.io.Reader", "org.apache.commons.csv.CSVFormat"}, new String[]{"<empty>", "<sample:8>"}, true), new String[][]{{"getHeaderMap", "", "5"}});
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput181() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.csv.CSVParser", "org.apache.commons.csv.CSVParser", "parse", new String[]{"java.io.Reader", "org.apache.commons.csv.CSVFormat"}, new String[]{"<empty>", "<sample:12>"}, true), new String[][]{{"getRecords", "", "3"}});
  assertNotNull(actual);
  assertEquals("java.util.ArrayList", actual.getClass().getName());
  assertEquals("[]", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput182() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.csv.CSVParser", "org.apache.commons.csv.CSVParser", "close", new String[]{}, new String[]{}, false, 2, new String[][]{{"org.apache.commons.csv.CSVParser", "getFirstEndOfLine", ""}, {"org.apache.commons.csv.CSVParser", "nextRecord", ""}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getCurrentLineNumber=1, getFirstEndOfLine=\r\n, getRecordNumber=1, isClosed=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput183() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.csv.CSVParser", "org.apache.commons.csv.CSVParser", "getCurrentLineNumber", new String[]{}, new String[]{}, false, 1, new String[][]{{"org.apache.commons.csv.CSVParser", "nextRecord", ""}, {"org.apache.commons.csv.CSVParser", "close", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.Long", actual.getClass().getName());
  assertEquals("1", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getCurrentLineNumber=1, getFirstEndOfLine=\n, getRecordNumber=2, isClosed=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput184() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.csv.CSVParser", "org.apache.commons.csv.CSVParser", "getRecords", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.csv.CSVParser", "getHeaderMap", ""}, {"org.apache.commons.csv.CSVParser", "getRecords", ""}});
  assertNotNull(actual);
  assertEquals("java.util.ArrayList", actual.getClass().getName());
  assertEquals("[]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getCurrentLineNumber=0, getFirstEndOfLine=null, getRecordNumber=1, isClosed=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput185() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.csv.CSVParser", "org.apache.commons.csv.CSVParser", "getRecords", new String[]{}, new String[]{}, false, 4, new String[][]{{"org.apache.commons.csv.CSVParser", "getHeaderMap", ""}, {"org.apache.commons.csv.CSVParser", "iterator", ""}, {"org.apache.commons.csv.CSVParser", "getRecords", ""}});
  assertNotNull(actual);
  assertEquals("java.util.ArrayList", actual.getClass().getName());
  assertEquals("[]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getCurrentLineNumber=0, getFirstEndOfLine=null, getRecordNumber=0, isClosed=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput186() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.csv.CSVParser", "org.apache.commons.csv.CSVParser", "getRecords", new String[]{}, new String[]{}, false, 5, new String[][]{{"org.apache.commons.csv.CSVParser", "getHeaderMap", ""}, {"org.apache.commons.csv.CSVParser", "iterator", ""}, {"org.apache.commons.csv.CSVParser", "getRecords", ""}});
  assertNotNull(actual);
  assertEquals("java.util.ArrayList", actual.getClass().getName());
  assertEquals("[]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getCurrentLineNumber=0, getFirstEndOfLine=null, getRecordNumber=6, isClosed=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput187() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.csv.CSVParser", "org.apache.commons.csv.CSVParser", "nextRecord", new String[]{}, new String[]{}, false, 1, new String[][]{{"org.apache.commons.csv.CSVParser", "nextRecord", ""}}), new String[][]{{"get", "int", "5"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.ArrayIndexOutOfBoundsException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput188() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.csv.CSVParser", "org.apache.commons.csv.CSVParser", "getRecords", new String[]{}, new String[]{}, false, 2, new String[][]{}, 3), new String[][]{{"listIterator", "int", "5"}});
  assertNotNull(actual);
  assertEquals("java.util.ArrayList$ListItr", actual.getClass().getName());
  assertEquals("{hasNext=false, hasPrevious=true}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getCurrentLineNumber=2, getFirstEndOfLine=\r\n, getRecordNumber=2, isClosed=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput189() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.csv.CSVParser", "org.apache.commons.csv.CSVParser", "parse", new String[]{"java.io.InputStream", "java.nio.charset.Charset", "org.apache.commons.csv.CSVFormat"}, new String[]{"<sample:1>", "<sample:0>", "<sample:0>"}, true), new String[][]{{"close", "", "0"}, {"getHeaderMap", "", "7"}});
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput190() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.csv.CSVParser", "org.apache.commons.csv.CSVParser", "parse", new String[]{"java.io.File", "java.nio.charset.Charset", "org.apache.commons.csv.CSVFormat"}, new String[]{"<sample:1>", "<sample:0>", "<sample:8>"}, true, 0, null, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.io.FileNotFoundException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput191() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.csv.CSVParser", "org.apache.commons.csv.CSVParser", "parse", new String[]{"java.io.File", "java.nio.charset.Charset", "org.apache.commons.csv.CSVFormat"}, new String[]{"<null>", "<sample:1>", "<sample:8>"}, true, 0, null, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput192() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.csv.CSVParser", "org.apache.commons.csv.CSVParser", "parse", new String[]{"java.io.Reader", "org.apache.commons.csv.CSVFormat"}, new String[]{"<sample:1>", "<sample:2>"}, true, 0, null, 1), new String[][]{{"getCurrentLineNumber", "", "3"}});
  assertNotNull(actual);
  assertEquals("java.lang.Long", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput193() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.csv.CSVParser", "org.apache.commons.csv.CSVParser", "getHeaderMap", new String[]{}, new String[]{}, false, 12, new String[][]{{"org.apache.commons.csv.CSVParser", "getHeaderMap", ""}, {"org.apache.commons.csv.CSVParser", "getCurrentLineNumber", ""}}, 1);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getCurrentLineNumber=0, getFirstEndOfLine=null, getRecordNumber=0, isClosed=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput194() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.csv.CSVParser", "org.apache.commons.csv.CSVParser", "getHeaderMap", new String[]{}, new String[]{}, false, 13, new String[][]{{"org.apache.commons.csv.CSVParser", "getHeaderMap", ""}, {"org.apache.commons.csv.CSVParser", "getCurrentLineNumber", ""}}, 1);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getCurrentLineNumber=0, getFirstEndOfLine=null, getRecordNumber=31, isClosed=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput195() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.csv.CSVParser", "org.apache.commons.csv.CSVParser", "getHeaderMap", new String[]{}, new String[]{}, false, 5, new String[][]{{"org.apache.commons.csv.CSVParser", "getCurrentLineNumber", ""}, {"org.apache.commons.csv.CSVParser", "getHeaderMap", ""}, {"org.apache.commons.csv.CSVParser", "getCurrentLineNumber", ""}}, 1);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getCurrentLineNumber=0, getFirstEndOfLine=null, getRecordNumber=5, isClosed=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput196() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.csv.CSVParser", "org.apache.commons.csv.CSVParser", "getHeaderMap", new String[]{}, new String[]{}, false, 7, new String[][]{{"org.apache.commons.csv.CSVParser", "getCurrentLineNumber", ""}, {"org.apache.commons.csv.CSVParser", "getHeaderMap", ""}}, 1);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getCurrentLineNumber=0, getFirstEndOfLine=null, getRecordNumber=7, isClosed=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput197() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.csv.CSVParser", "org.apache.commons.csv.CSVParser", "getHeaderMap", new String[]{}, new String[]{}, false, 9, new String[][]{{"org.apache.commons.csv.CSVParser", "getCurrentLineNumber", ""}, {"org.apache.commons.csv.CSVParser", "getHeaderMap", ""}}, 1);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getCurrentLineNumber=0, getFirstEndOfLine=null, getRecordNumber=9, isClosed=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput198() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.csv.CSVParser", "org.apache.commons.csv.CSVParser", "iterator", new String[]{}, new String[]{}, false, 5, new String[][]{}), new String[][]{{"next", "", "7"}, {"hasComment", "", "4"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getCurrentLineNumber=0, getFirstEndOfLine=null, getRecordNumber=6, isClosed=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput199() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.csv.CSVParser", "org.apache.commons.csv.CSVParser", "iterator", new String[]{}, new String[]{}, false, 13, new String[][]{}, 1), new String[][]{{"next", "", "7"}, {"hasComment", "", "5"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getCurrentLineNumber=1, getFirstEndOfLine=\n, getRecordNumber=32, isClosed=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput200() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.csv.CSVParser", "org.apache.commons.csv.CSVParser", "iterator", new String[]{}, new String[]{}, false, 13, new String[][]{}, 1), new String[][]{{"next", "", "7"}, {"hasComment", "", "5"}, {"iterator", "", "4"}});
  assertNotNull(actual);
  assertEquals("java.util.Arrays$ArrayItr", actual.getClass().getName());
  assertEquals("{hasNext=true}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getCurrentLineNumber=1, getFirstEndOfLine=\n, getRecordNumber=32, isClosed=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput201() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.csv.CSVParser", "org.apache.commons.csv.CSVParser", "iterator", new String[]{}, new String[]{}, false, 14, new String[][]{}, 1), new String[][]{{"next", "", "7"}, {"hasComment", "", "5"}, {"iterator", "", "4"}});
  assertNotNull(actual);
  assertEquals("java.util.Arrays$ArrayItr", actual.getClass().getName());
  assertEquals("{hasNext=true}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getCurrentLineNumber=1, getFirstEndOfLine=\n, getRecordNumber=1, isClosed=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput202() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.csv.CSVParser", "org.apache.commons.csv.CSVParser", "iterator", new String[]{}, new String[]{}, false, 15, new String[][]{}, 1), new String[][]{{"next", "", "7"}, {"hasComment", "", "5"}, {"iterator", "", "4"}});
  assertNotNull(actual);
  assertEquals("java.util.Arrays$ArrayItr", actual.getClass().getName());
  assertEquals("{hasNext=true}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getCurrentLineNumber=1, getFirstEndOfLine=\r, getRecordNumber=100, isClosed=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput203() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.csv.CSVParser", "org.apache.commons.csv.CSVParser", "iterator", new String[]{}, new String[]{}, false, 7, new String[][]{}, 1), new String[][]{{"next", "", "7"}, {"hasComment", "", "5"}, {"iterator", "", "6"}});
  assertNotNull(actual);
  assertEquals("java.util.Arrays$ArrayItr", actual.getClass().getName());
  assertEquals("{hasNext=true}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getCurrentLineNumber=0, getFirstEndOfLine=null, getRecordNumber=8, isClosed=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput204() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.csv.CSVParser", "org.apache.commons.csv.CSVParser", "iterator", new String[]{}, new String[]{}, false, 9, new String[][]{}, 1), new String[][]{{"next", "", "7"}, {"hasComment", "", "5"}, {"iterator", "", "6"}});
  assertNotNull(actual);
  assertEquals("java.util.Arrays$ArrayItr", actual.getClass().getName());
  assertEquals("{hasNext=true}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getCurrentLineNumber=1, getFirstEndOfLine=\n, getRecordNumber=10, isClosed=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput205() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.csv.CSVParser", "org.apache.commons.csv.CSVParser", "iterator", new String[]{}, new String[]{}, false, 11, new String[][]{}, 1), new String[][]{{"next", "", "7"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.util.NoSuchElementException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput206() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.csv.CSVParser", "org.apache.commons.csv.CSVParser", "nextRecord", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.csv.CSVParser", "iterator", ""}}, 2), new String[][]{{"get", "java.lang.Enum", "0"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput207() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.csv.CSVParser", "org.apache.commons.csv.CSVParser", "nextRecord", new String[]{}, new String[]{}, false, 4, new String[][]{{"org.apache.commons.csv.CSVParser", "getFirstEndOfLine", ""}}, 2);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getCurrentLineNumber=0, getFirstEndOfLine=null, getRecordNumber=0, isClosed=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput208() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.csv.CSVParser", "org.apache.commons.csv.CSVParser", "getHeaderMap", new String[]{}, new String[]{}, false, 4, new String[][]{}, 2);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getCurrentLineNumber=0, getFirstEndOfLine=null, getRecordNumber=0, isClosed=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput209() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.csv.CSVParser", "org.apache.commons.csv.CSVParser", "nextRecord", new String[]{}, new String[]{}, false, 2, new String[][]{{"org.apache.commons.csv.CSVParser", "getHeaderMap", ""}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.csv.CSVRecord", actual.getClass().getName());
  assertEquals("CSVRecord [comment=null, mapping=null, recordNumber=1, values=[a]] {getCharacterPosition=0, getComment=null, getRecordNumber=1, hasComment=false, isConsistent=true, size=1}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getCurrentLineNumber=1, getFirstEndOfLine=\r\n, getRecordNumber=1, isClosed=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput210() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.csv.CSVParser", "org.apache.commons.csv.CSVParser", "nextRecord", new String[]{}, new String[]{}, false, 3, new String[][]{{"org.apache.commons.csv.CSVParser", "getHeaderMap", ""}, {"org.apache.commons.csv.CSVParser", "isClosed", ""}}, 2);
  assertNotNull(actual);
  assertEquals("org.apache.commons.csv.CSVRecord", actual.getClass().getName());
  assertEquals("CSVRecord [comment=null, mapping=null, recordNumber=4, values=[a]] {getCharacterPosition=3, getComment=null, getRecordNumber=4, hasComment=false, isConsistent=true, size=1}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getCurrentLineNumber=1, getFirstEndOfLine=\r, getRecordNumber=4, isClosed=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput211() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.csv.CSVParser", "org.apache.commons.csv.CSVParser", "getCurrentLineNumber", new String[]{}, new String[]{}, false, 7, new String[][]{}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Long", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getCurrentLineNumber=0, getFirstEndOfLine=null, getRecordNumber=7, isClosed=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput212() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.csv.CSVParser", "org.apache.commons.csv.CSVParser", "getCurrentLineNumber", new String[]{}, new String[]{}, false, 9, new String[][]{}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Long", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getCurrentLineNumber=0, getFirstEndOfLine=null, getRecordNumber=9, isClosed=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput213() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.csv.CSVParser", "org.apache.commons.csv.CSVParser", "getCurrentLineNumber", new String[]{}, new String[]{}, false, 11, new String[][]{}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Long", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getCurrentLineNumber=0, getFirstEndOfLine=null, getRecordNumber=11, isClosed=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput214() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.csv.CSVParser", "org.apache.commons.csv.CSVParser", "getFirstEndOfLine", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.csv.CSVParser", "nextRecord", ""}}, 1);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getCurrentLineNumber=0, getFirstEndOfLine=null, getRecordNumber=1, isClosed=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput215() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.csv.CSVParser", "org.apache.commons.csv.CSVParser", "getFirstEndOfLine", new String[]{}, new String[]{}, false, 1, new String[][]{{"org.apache.commons.csv.CSVParser", "nextRecord", ""}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("\n", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getCurrentLineNumber=1, getFirstEndOfLine=\n, getRecordNumber=2, isClosed=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput216() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.csv.CSVParser", "org.apache.commons.csv.CSVParser", "getFirstEndOfLine", new String[]{}, new String[]{}, false, 2, new String[][]{{"org.apache.commons.csv.CSVParser", "nextRecord", ""}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("\r\n", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getCurrentLineNumber=1, getFirstEndOfLine=\r\n, getRecordNumber=1, isClosed=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput217() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.csv.CSVParser", "org.apache.commons.csv.CSVParser", "getFirstEndOfLine", new String[]{}, new String[]{}, false, 3, new String[][]{{"org.apache.commons.csv.CSVParser", "nextRecord", ""}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("\r", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getCurrentLineNumber=1, getFirstEndOfLine=\r, getRecordNumber=4, isClosed=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput218() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.csv.CSVParser", "org.apache.commons.csv.CSVParser", "getFirstEndOfLine", new String[]{}, new String[]{}, false, 4, new String[][]{{"org.apache.commons.csv.CSVParser", "nextRecord", ""}}, 1);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getCurrentLineNumber=0, getFirstEndOfLine=null, getRecordNumber=0, isClosed=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput219() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.csv.CSVParser", "org.apache.commons.csv.CSVParser", "getFirstEndOfLine", new String[]{}, new String[]{}, false, 3, new String[][]{}, 1);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getCurrentLineNumber=0, getFirstEndOfLine=null, getRecordNumber=3, isClosed=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput220() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.csv.CSVParser", "org.apache.commons.csv.CSVParser", "getCurrentLineNumber", new String[]{}, new String[]{}, false, 3, new String[][]{{"org.apache.commons.csv.CSVParser", "isClosed", ""}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Long", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getCurrentLineNumber=0, getFirstEndOfLine=null, getRecordNumber=3, isClosed=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput221() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.csv.CSVParser", "org.apache.commons.csv.CSVParser", "getCurrentLineNumber", new String[]{}, new String[]{}, false, 2, new String[][]{{"org.apache.commons.csv.CSVParser", "isClosed", ""}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Long", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getCurrentLineNumber=0, getFirstEndOfLine=null, getRecordNumber=0, isClosed=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput222() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.csv.CSVParser", "org.apache.commons.csv.CSVParser", "getCurrentLineNumber", new String[]{}, new String[]{}, false, 5, new String[][]{{"org.apache.commons.csv.CSVParser", "isClosed", ""}, {"org.apache.commons.csv.CSVParser", "close", ""}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Long", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getCurrentLineNumber=0, getFirstEndOfLine=null, getRecordNumber=5, isClosed=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput223() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.csv.CSVParser", "org.apache.commons.csv.CSVParser", "getCurrentLineNumber", new String[]{}, new String[]{}, false, 7, new String[][]{{"org.apache.commons.csv.CSVParser", "isClosed", ""}, {"org.apache.commons.csv.CSVParser", "close", ""}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Long", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getCurrentLineNumber=0, getFirstEndOfLine=null, getRecordNumber=7, isClosed=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput224() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.csv.CSVParser", "org.apache.commons.csv.CSVParser", "nextRecord", new String[]{}, new String[]{}, false, 1, new String[][]{}), new String[][]{{"isSet", "java.lang.String", "4"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getCurrentLineNumber=1, getFirstEndOfLine=\n, getRecordNumber=2, isClosed=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput225() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.csv.CSVParser", "org.apache.commons.csv.CSVParser", "getRecordNumber", new String[]{}, new String[]{}, false, 11, new String[][]{{"org.apache.commons.csv.CSVParser", "getRecords", ""}, {"org.apache.commons.csv.CSVParser", "getCurrentLineNumber", ""}, {"org.apache.commons.csv.CSVParser", "nextRecord", ""}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Long", actual.getClass().getName());
  assertEquals("11", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getCurrentLineNumber=0, getFirstEndOfLine=null, getRecordNumber=11, isClosed=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput226() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.csv.CSVParser", "org.apache.commons.csv.CSVParser", "getRecordNumber", new String[]{}, new String[]{}, false, 12, new String[][]{{"org.apache.commons.csv.CSVParser", "getRecords", ""}, {"org.apache.commons.csv.CSVParser", "getCurrentLineNumber", ""}, {"org.apache.commons.csv.CSVParser", "nextRecord", ""}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Long", actual.getClass().getName());
  assertEquals("2", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getCurrentLineNumber=1, getFirstEndOfLine=\r, getRecordNumber=2, isClosed=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput227() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.csv.CSVParser", "org.apache.commons.csv.CSVParser", "getRecordNumber", new String[]{}, new String[]{}, false, 2, new String[][]{{"org.apache.commons.csv.CSVParser", "getRecords", ""}, {"org.apache.commons.csv.CSVParser", "getCurrentLineNumber", ""}, {"org.apache.commons.csv.CSVParser", "nextRecord", ""}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Long", actual.getClass().getName());
  assertEquals("2", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getCurrentLineNumber=2, getFirstEndOfLine=\r\n, getRecordNumber=2, isClosed=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput228() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.csv.CSVParser", "org.apache.commons.csv.CSVParser", "getRecordNumber", new String[]{}, new String[]{}, false, 3, new String[][]{{"org.apache.commons.csv.CSVParser", "getRecords", ""}, {"org.apache.commons.csv.CSVParser", "getCurrentLineNumber", ""}, {"org.apache.commons.csv.CSVParser", "nextRecord", ""}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Long", actual.getClass().getName());
  assertEquals("5", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getCurrentLineNumber=1, getFirstEndOfLine=\r, getRecordNumber=5, isClosed=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput229() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.csv.CSVParser", "org.apache.commons.csv.CSVParser", "nextRecord", new String[]{}, new String[]{}, false, 2, new String[][]{{"org.apache.commons.csv.CSVParser", "isClosed", ""}, {"org.apache.commons.csv.CSVParser", "getFirstEndOfLine", ""}}, 3), new String[][]{{"get", "java.lang.String", "5"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalStateException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput230() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.csv.CSVParser", "org.apache.commons.csv.CSVParser", "nextRecord", new String[]{}, new String[]{}, false, 4, new String[][]{{"org.apache.commons.csv.CSVParser", "isClosed", ""}, {"org.apache.commons.csv.CSVParser", "getFirstEndOfLine", ""}}, 3);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getCurrentLineNumber=0, getFirstEndOfLine=null, getRecordNumber=0, isClosed=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput231() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.csv.CSVParser", "org.apache.commons.csv.CSVParser", "nextRecord", new String[]{}, new String[]{}, false, 3, new String[][]{{"org.apache.commons.csv.CSVParser", "isClosed", ""}, {"org.apache.commons.csv.CSVParser", "getFirstEndOfLine", ""}}, 3);
  assertNotNull(actual);
  assertEquals("org.apache.commons.csv.CSVRecord", actual.getClass().getName());
  assertEquals("CSVRecord [comment=null, mapping=null, recordNumber=4, values=[a]] {getCharacterPosition=3, getComment=null, getRecordNumber=4, hasComment=false, isConsistent=true, size=1}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getCurrentLineNumber=1, getFirstEndOfLine=\r, getRecordNumber=4, isClosed=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput232() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.csv.CSVParser", "org.apache.commons.csv.CSVParser", "nextRecord", new String[]{}, new String[]{}, false, 5, new String[][]{{"org.apache.commons.csv.CSVParser", "isClosed", ""}, {"org.apache.commons.csv.CSVParser", "getFirstEndOfLine", ""}}, 3);
  assertNotNull(actual);
  assertEquals("org.apache.commons.csv.CSVRecord", actual.getClass().getName());
  assertEquals("CSVRecord [comment=null, mapping=null, recordNumber=6, values=[<a><b>t</b></a>]] {getCharacterPosition=5, getComment=null, getRecordNumber=6, hasComment=false, isConsistent=true, size=1}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getCurrentLineNumber=0, getFirstEndOfLine=null, getRecordNumber=6, isClosed=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput233() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.csv.CSVParser", "org.apache.commons.csv.CSVParser", "nextRecord", new String[]{}, new String[]{}, false, 14, new String[][]{{"org.apache.commons.csv.CSVParser", "isClosed", ""}, {"org.apache.commons.csv.CSVParser", "getFirstEndOfLine", ""}}, 3);
  assertNotNull(actual);
  assertEquals("org.apache.commons.csv.CSVRecord", actual.getClass().getName());
  assertEquals("CSVRecord [comment=null, mapping=null, recordNumber=1, values=[a,b]] {getCharacterPosition=0, getComment=null, getRecordNumber=1, hasComment=false, isConsistent=true, size=1}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getCurrentLineNumber=1, getFirstEndOfLine=\n, getRecordNumber=1, isClosed=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput234() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.csv.CSVParser", "org.apache.commons.csv.CSVParser", "nextRecord", new String[]{}, new String[]{}, false, 14, new String[][]{{"org.apache.commons.csv.CSVParser", "isClosed", ""}, {"org.apache.commons.csv.CSVParser", "getFirstEndOfLine", ""}}, 3), new String[][]{{"isConsistent", "", "1"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getCurrentLineNumber=1, getFirstEndOfLine=\n, getRecordNumber=1, isClosed=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput235() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.csv.CSVParser", "org.apache.commons.csv.CSVParser", "nextRecord", new String[]{}, new String[]{}, false, 15, new String[][]{{"org.apache.commons.csv.CSVParser", "isClosed", ""}, {"org.apache.commons.csv.CSVParser", "getFirstEndOfLine", ""}}, 3), new String[][]{{"isConsistent", "", "1"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getCurrentLineNumber=1, getFirstEndOfLine=\r, getRecordNumber=100, isClosed=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput236() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.csv.CSVParser", "org.apache.commons.csv.CSVParser", "nextRecord", new String[]{}, new String[]{}, false, 16, new String[][]{{"org.apache.commons.csv.CSVParser", "isClosed", ""}, {"org.apache.commons.csv.CSVParser", "getFirstEndOfLine", ""}}, 3), new String[][]{{"isConsistent", "", "1"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getCurrentLineNumber=0, getFirstEndOfLine=null, getRecordNumber=1, isClosed=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput237() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.csv.CSVParser", "org.apache.commons.csv.CSVParser", "nextRecord", new String[]{}, new String[]{}, false, 17, new String[][]{{"org.apache.commons.csv.CSVParser", "isClosed", ""}, {"org.apache.commons.csv.CSVParser", "getFirstEndOfLine", ""}}), new String[][]{{"isConsistent", "", "1"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getCurrentLineNumber=0, getFirstEndOfLine=null, getRecordNumber=256, isClosed=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput238() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.csv.CSVParser", "org.apache.commons.csv.CSVParser", "getRecords", new String[]{}, new String[]{}, false, 1, new String[][]{}), new String[][]{{"iterator", "", "4"}});
  assertNotNull(actual);
  assertEquals("java.util.ArrayList$Itr", actual.getClass().getName());
  assertEquals("{hasNext=true}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getCurrentLineNumber=1, getFirstEndOfLine=\n, getRecordNumber=3, isClosed=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput239() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.csv.CSVParser", "org.apache.commons.csv.CSVParser", "getRecords", new String[]{}, new String[]{}, false, 4, new String[][]{}, 2);
  assertNotNull(actual);
  assertEquals("java.util.ArrayList", actual.getClass().getName());
  assertEquals("[]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getCurrentLineNumber=0, getFirstEndOfLine=null, getRecordNumber=0, isClosed=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput240() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.csv.CSVParser", "org.apache.commons.csv.CSVParser", "getRecords", new String[]{}, new String[]{}, false, 5, new String[][]{}, 2);
  assertNotNull(actual);
  assertEquals("java.util.ArrayList", actual.getClass().getName());
  assertEquals("[CSVRecord [comment=null, mapping=null, recordNumber=6, values=[<a><b>t</b></a>]]]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getCurrentLineNumber=0, getFirstEndOfLine=null, getRecordNumber=6, isClosed=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput241() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.csv.CSVParser", "org.apache.commons.csv.CSVParser", "getRecords", new String[]{}, new String[]{}, false, 6, new String[][]{}, 2);
  assertNotNull(actual);
  assertEquals("java.util.ArrayList", actual.getClass().getName());
  assertEquals("[CSVRecord [comment=null, mapping=null, recordNumber=1, values=[a]]]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getCurrentLineNumber=0, getFirstEndOfLine=null, getRecordNumber=1, isClosed=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput242() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.csv.CSVParser", "org.apache.commons.csv.CSVParser", "getRecords", new String[]{}, new String[]{}, false, 7, new String[][]{{"org.apache.commons.csv.CSVParser", "isClosed", ""}}, 2);
  assertNotNull(actual);
  assertEquals("java.util.ArrayList", actual.getClass().getName());
  assertEquals("[CSVRecord [comment=null, mapping=null, recordNumber=8, values=[ x \t y ]]]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getCurrentLineNumber=0, getFirstEndOfLine=null, getRecordNumber=8, isClosed=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput243() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.csv.CSVParser", "org.apache.commons.csv.CSVParser", "getRecords", new String[]{}, new String[]{}, false, 8, new String[][]{{"org.apache.commons.csv.CSVParser", "isClosed", ""}}, 2);
  assertNotNull(actual);
  assertEquals("java.util.ArrayList", actual.getClass().getName());
  assertEquals("[CSVRecord [comment=null, mapping=null, recordNumber=1, values=[a]], CSVRecord [comment=null, mapping=null, recordNumber=2, values=[b]]]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getCurrentLineNumber=1, getFirstEndOfLine=\n, getRecordNumber=2, isClosed=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput244() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.csv.CSVParser", "org.apache.commons.csv.CSVParser", "getRecords", new String[]{}, new String[]{}, false, 9, new String[][]{{"org.apache.commons.csv.CSVParser", "isClosed", ""}}, 2);
  assertNotNull(actual);
  assertEquals("java.util.ArrayList", actual.getClass().getName());
  assertEquals("[CSVRecord [comment=null, mapping=null, recordNumber=10, values=[]]]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getCurrentLineNumber=1, getFirstEndOfLine=\n, getRecordNumber=10, isClosed=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput245() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.csv.CSVParser", "org.apache.commons.csv.CSVParser", "getRecords", new String[]{}, new String[]{}, false, 6, new String[][]{{"org.apache.commons.csv.CSVParser", "iterator", ""}}, 2), new String[][]{{"add", "java.lang.Object", "0"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getCurrentLineNumber=0, getFirstEndOfLine=null, getRecordNumber=1, isClosed=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput246() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.csv.CSVParser", "org.apache.commons.csv.CSVParser", "getRecords", new String[]{}, new String[]{}, false, 6, new String[][]{{"org.apache.commons.csv.CSVParser", "iterator", ""}}), new String[][]{{"add", "java.lang.Object", "0"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getCurrentLineNumber=0, getFirstEndOfLine=null, getRecordNumber=1, isClosed=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput247() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.csv.CSVParser", "org.apache.commons.csv.CSVParser", "getFirstEndOfLine", new String[]{}, new String[]{}, false, 0, null, 3);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getCurrentLineNumber=0, getFirstEndOfLine=null, getRecordNumber=0, isClosed=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput248() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.csv.CSVParser", "org.apache.commons.csv.CSVParser", "getFirstEndOfLine", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.csv.CSVParser", "nextRecord", ""}}, 3);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getCurrentLineNumber=0, getFirstEndOfLine=null, getRecordNumber=1, isClosed=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput249() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.csv.CSVParser", "org.apache.commons.csv.CSVParser", "getFirstEndOfLine", new String[]{}, new String[]{}, false, 1, new String[][]{{"org.apache.commons.csv.CSVParser", "nextRecord", ""}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("\n", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getCurrentLineNumber=1, getFirstEndOfLine=\n, getRecordNumber=2, isClosed=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput250() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.csv.CSVParser", "org.apache.commons.csv.CSVParser", "getFirstEndOfLine", new String[]{}, new String[]{}, false, 2, new String[][]{{"org.apache.commons.csv.CSVParser", "nextRecord", ""}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("\r\n", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getCurrentLineNumber=1, getFirstEndOfLine=\r\n, getRecordNumber=1, isClosed=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput251() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.csv.CSVParser", "org.apache.commons.csv.CSVParser", "getFirstEndOfLine", new String[]{}, new String[]{}, false, 3, new String[][]{{"org.apache.commons.csv.CSVParser", "nextRecord", ""}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("\r", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getCurrentLineNumber=1, getFirstEndOfLine=\r, getRecordNumber=4, isClosed=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput252() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.csv.CSVParser", "org.apache.commons.csv.CSVParser", "getFirstEndOfLine", new String[]{}, new String[]{}, false, 5, new String[][]{{"org.apache.commons.csv.CSVParser", "getFirstEndOfLine", ""}, {"org.apache.commons.csv.CSVParser", "nextRecord", ""}}, 3);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getCurrentLineNumber=0, getFirstEndOfLine=null, getRecordNumber=6, isClosed=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput253() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.csv.CSVParser", "org.apache.commons.csv.CSVParser", "getFirstEndOfLine", new String[]{}, new String[]{}, false, 7, new String[][]{{"org.apache.commons.csv.CSVParser", "getCurrentLineNumber", ""}, {"org.apache.commons.csv.CSVParser", "nextRecord", ""}}, 3);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getCurrentLineNumber=0, getFirstEndOfLine=null, getRecordNumber=8, isClosed=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput254() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.csv.CSVParser", "org.apache.commons.csv.CSVParser", "getFirstEndOfLine", new String[]{}, new String[]{}, false, 15, new String[][]{{"org.apache.commons.csv.CSVParser", "getCurrentLineNumber", ""}, {"org.apache.commons.csv.CSVParser", "nextRecord", ""}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("\r", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getCurrentLineNumber=1, getFirstEndOfLine=\r, getRecordNumber=100, isClosed=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput255() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.csv.CSVParser", "org.apache.commons.csv.CSVParser", "getHeaderMap", new String[]{}, new String[]{}, false, 4, new String[][]{{"org.apache.commons.csv.CSVParser", "iterator", ""}, {"org.apache.commons.csv.CSVParser", "getHeaderMap", ""}, {"org.apache.commons.csv.CSVParser", "close", ""}}, 2);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getCurrentLineNumber=0, getFirstEndOfLine=null, getRecordNumber=0, isClosed=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput256() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.csv.CSVParser", "org.apache.commons.csv.CSVParser", "getHeaderMap", new String[]{}, new String[]{}, false, 3, new String[][]{{"org.apache.commons.csv.CSVParser", "iterator", ""}, {"org.apache.commons.csv.CSVParser", "getHeaderMap", ""}, {"org.apache.commons.csv.CSVParser", "close", ""}}, 2);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getCurrentLineNumber=0, getFirstEndOfLine=null, getRecordNumber=3, isClosed=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput257() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.csv.CSVParser", "org.apache.commons.csv.CSVParser", "getHeaderMap", new String[]{}, new String[]{}, false, 5, new String[][]{{"org.apache.commons.csv.CSVParser", "iterator", ""}, {"org.apache.commons.csv.CSVParser", "close", ""}}, 2);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getCurrentLineNumber=0, getFirstEndOfLine=null, getRecordNumber=5, isClosed=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput258() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.csv.CSVParser", "org.apache.commons.csv.CSVParser", "getHeaderMap", new String[]{}, new String[]{}, false, 7, new String[][]{{"org.apache.commons.csv.CSVParser", "iterator", ""}, {"org.apache.commons.csv.CSVParser", "iterator", ""}, {"org.apache.commons.csv.CSVParser", "close", ""}}, 2);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getCurrentLineNumber=0, getFirstEndOfLine=null, getRecordNumber=7, isClosed=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput259() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.csv.CSVParser", "org.apache.commons.csv.CSVParser", "getRecords", new String[]{}, new String[]{}, false, 3, new String[][]{{"org.apache.commons.csv.CSVParser", "getFirstEndOfLine", ""}, {"org.apache.commons.csv.CSVParser", "close", ""}, {"org.apache.commons.csv.CSVParser", "iterator", ""}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.io.IOException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput260() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.csv.CSVParser", "org.apache.commons.csv.CSVParser", "getRecords", new String[]{}, new String[]{}, false, 4, new String[][]{{"org.apache.commons.csv.CSVParser", "getFirstEndOfLine", ""}, {"org.apache.commons.csv.CSVParser", "iterator", ""}}, 3), new String[][]{{"trimToSize", "", "3"}});
  assertNotNull(actual);
  assertEquals("java.util.ArrayList", actual.getClass().getName());
  assertEquals("[]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getCurrentLineNumber=0, getFirstEndOfLine=null, getRecordNumber=0, isClosed=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput261() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.csv.CSVParser", "org.apache.commons.csv.CSVParser", "close", new String[]{}, new String[]{}, false, 1, new String[][]{}, 3);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getCurrentLineNumber=0, getFirstEndOfLine=null, getRecordNumber=1, isClosed=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput262() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.csv.CSVParser", "org.apache.commons.csv.CSVParser", "close", new String[]{}, new String[]{}, false, 2, new String[][]{}, 3);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getCurrentLineNumber=0, getFirstEndOfLine=null, getRecordNumber=0, isClosed=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput263() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.csv.CSVParser", "org.apache.commons.csv.CSVParser", "close", new String[]{}, new String[]{}, false, 3, new String[][]{{"org.apache.commons.csv.CSVParser", "getFirstEndOfLine", ""}}, 3);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getCurrentLineNumber=0, getFirstEndOfLine=null, getRecordNumber=3, isClosed=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput264() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.csv.CSVParser", "org.apache.commons.csv.CSVParser", "close", new String[]{}, new String[]{}, false, 5, new String[][]{}, 3);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getCurrentLineNumber=0, getFirstEndOfLine=null, getRecordNumber=5, isClosed=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput265() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.csv.CSVParser", "org.apache.commons.csv.CSVParser", "isClosed", new String[]{}, new String[]{}, false, 3, new String[][]{{"org.apache.commons.csv.CSVParser", "getRecords", ""}, {"org.apache.commons.csv.CSVParser", "isClosed", ""}, {"org.apache.commons.csv.CSVParser", "isClosed", ""}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getCurrentLineNumber=1, getFirstEndOfLine=\r, getRecordNumber=5, isClosed=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput266() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.csv.CSVParser", "org.apache.commons.csv.CSVParser", "isClosed", new String[]{}, new String[]{}, false, 4, new String[][]{{"org.apache.commons.csv.CSVParser", "getRecords", ""}, {"org.apache.commons.csv.CSVParser", "isClosed", ""}, {"org.apache.commons.csv.CSVParser", "isClosed", ""}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getCurrentLineNumber=0, getFirstEndOfLine=null, getRecordNumber=0, isClosed=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput267() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.csv.CSVParser", "org.apache.commons.csv.CSVParser", "isClosed", new String[]{}, new String[]{}, false, 3, new String[][]{{"org.apache.commons.csv.CSVParser", "getRecords", ""}, {"org.apache.commons.csv.CSVParser", "isClosed", ""}, {"org.apache.commons.csv.CSVParser", "isClosed", ""}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getCurrentLineNumber=1, getFirstEndOfLine=\r, getRecordNumber=5, isClosed=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput268() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.csv.CSVParser", "org.apache.commons.csv.CSVParser", "close", new String[]{}, new String[]{}, false, 1, new String[][]{{"org.apache.commons.csv.CSVParser", "isClosed", ""}}, 2);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getCurrentLineNumber=0, getFirstEndOfLine=null, getRecordNumber=1, isClosed=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput269() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.csv.CSVParser", "org.apache.commons.csv.CSVParser", "close", new String[]{}, new String[]{}, false, 2, new String[][]{{"org.apache.commons.csv.CSVParser", "isClosed", ""}}, 2);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getCurrentLineNumber=0, getFirstEndOfLine=null, getRecordNumber=0, isClosed=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput270() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.csv.CSVParser", "org.apache.commons.csv.CSVParser", "close", new String[]{}, new String[]{}, false, 3, new String[][]{{"org.apache.commons.csv.CSVParser", "isClosed", ""}}, 2);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getCurrentLineNumber=0, getFirstEndOfLine=null, getRecordNumber=3, isClosed=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput271() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.csv.CSVParser", "org.apache.commons.csv.CSVParser", "parse", new String[]{"java.io.InputStream", "java.nio.charset.Charset", "org.apache.commons.csv.CSVFormat"}, new String[]{"<empty>", "<sample:0>", "<sample:6>"}, true, 0, null, 3);
  assertNotNull(actual);
  assertEquals("org.apache.commons.csv.CSVParser", actual.getClass().getName());
  assertEquals("{getCurrentLineNumber=0, getFirstEndOfLine=null, getRecordNumber=0, isClosed=false}", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput272() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.csv.CSVParser", "org.apache.commons.csv.CSVParser", "parse", new String[]{"java.io.InputStream", "java.nio.charset.Charset", "org.apache.commons.csv.CSVFormat"}, new String[]{"<sample:2>", "<sample:0>", "<sample:7>"}, true), new String[][]{{"getCurrentLineNumber", "", "7"}});
  assertNotNull(actual);
  assertEquals("java.lang.Long", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput273() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.csv.CSVParser", "org.apache.commons.csv.CSVParser", "parse", new String[]{"java.io.InputStream", "java.nio.charset.Charset", "org.apache.commons.csv.CSVFormat"}, new String[]{"<sample:2>", "<sample:0>", "<sample:7>"}, true, 0, null, 3), new String[][]{{"getCurrentLineNumber", "", "7"}});
  assertNotNull(actual);
  assertEquals("java.lang.Long", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput274() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.csv.CSVParser", "org.apache.commons.csv.CSVParser", "parse", new String[]{"java.io.InputStream", "java.nio.charset.Charset", "org.apache.commons.csv.CSVFormat"}, new String[]{"<sample:1>", "<sample:0>", "<sample:7>"}, true, 0, null, 3), new String[][]{{"iterator", "", "7"}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.csv.CSVParser$CSVRecordIterator", actual.getClass().getName());
  assertEquals("{hasNext=true}", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput275() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.csv.CSVParser", "org.apache.commons.csv.CSVParser", "parse", new String[]{"java.io.InputStream", "java.nio.charset.Charset", "org.apache.commons.csv.CSVFormat"}, new String[]{"<sample:0>", "<sample:0>", "<sample:7>"}, true, 0, null, 3), new String[][]{{"iterator", "", "7"}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.csv.CSVParser$CSVRecordIterator", actual.getClass().getName());
  assertEquals("{hasNext=false}", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput276() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.csv.CSVParser", "org.apache.commons.csv.CSVParser", "parse", new String[]{"java.io.InputStream", "java.nio.charset.Charset", "org.apache.commons.csv.CSVFormat"}, new String[]{"<sample:0>", "<sample:0>", "<sample:7>"}, true, 0, null, 3), new String[][]{{"iterator", "", "7"}, {"next", "", "2"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.util.NoSuchElementException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput277() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.csv.CSVParser", "org.apache.commons.csv.CSVParser", "parse", new String[]{"java.io.InputStream", "java.nio.charset.Charset", "org.apache.commons.csv.CSVFormat"}, new String[]{"<sample:1>", "<null>", "<sample:1>"}, true, 0, null, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput278() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.csv.CSVParser", "org.apache.commons.csv.CSVParser", "parse", new String[]{"java.io.InputStream", "java.nio.charset.Charset", "org.apache.commons.csv.CSVFormat"}, new String[]{"<sample:5>", "<empty>", "<sample:2>"}, true, 0, null, 3), new String[][]{{"getHeaderMap", "", "6"}, {"getFirstEndOfLine", "", "2"}});
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput279() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.csv.CSVParser", "org.apache.commons.csv.CSVParser", "parse", new String[]{"java.io.Reader", "org.apache.commons.csv.CSVFormat"}, new String[]{"<sample:2>", "<sample:8>"}, true, 0, null, 2), new String[][]{{"getRecords", "", "1"}});
  assertNotNull(actual);
  assertEquals("java.util.ArrayList", actual.getClass().getName());
  assertEquals("[CSVRecord [comment=null, mapping=null, recordNumber=1, values=[a]], CSVRecord [comment=null, mapping=null, recordNumber=2, values=[b]]]", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput280() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.csv.CSVParser", "org.apache.commons.csv.CSVParser", "parse", new String[]{"java.io.Reader", "org.apache.commons.csv.CSVFormat"}, new String[]{"<sample:1>", "<sample:8>"}, true, 0, null, 2), new String[][]{{"getHeaderMap", "", "1"}});
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput281() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.csv.CSVParser", "org.apache.commons.csv.CSVParser", "parse", new String[]{"java.io.File", "java.nio.charset.Charset", "org.apache.commons.csv.CSVFormat"}, new String[]{"<sample:4>", "<sample:3>", "<null>"}, true, 0, null, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput282() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.csv.CSVParser", "org.apache.commons.csv.CSVParser", "getRecordNumber", new String[]{}, new String[]{}, false, 13, new String[][]{}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Long", actual.getClass().getName());
  assertEquals("31", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getCurrentLineNumber=0, getFirstEndOfLine=null, getRecordNumber=31, isClosed=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput283() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.csv.CSVParser", "org.apache.commons.csv.CSVParser", "getRecordNumber", new String[]{}, new String[]{}, false, 15, new String[][]{}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Long", actual.getClass().getName());
  assertEquals("99", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getCurrentLineNumber=0, getFirstEndOfLine=null, getRecordNumber=99, isClosed=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput284() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.csv.CSVParser", "org.apache.commons.csv.CSVParser", "getRecordNumber", new String[]{}, new String[]{}, false, 17, new String[][]{}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Long", actual.getClass().getName());
  assertEquals("255", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getCurrentLineNumber=0, getFirstEndOfLine=null, getRecordNumber=255, isClosed=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput285() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.csv.CSVParser", "org.apache.commons.csv.CSVParser", "getRecordNumber", new String[]{}, new String[]{}, false, 19, new String[][]{}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Long", actual.getClass().getName());
  assertEquals("-3", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getCurrentLineNumber=0, getFirstEndOfLine=null, getRecordNumber=-3, isClosed=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput286() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.csv.CSVParser", "org.apache.commons.csv.CSVParser", "iterator", new String[]{}, new String[]{}, false), new String[][]{{"next", "", "6"}, {"get", "int", "2"}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("a", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getCurrentLineNumber=0, getFirstEndOfLine=null, getRecordNumber=1, isClosed=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput287() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.csv.CSVParser", "org.apache.commons.csv.CSVParser", "parse", new String[]{"java.io.Reader", "org.apache.commons.csv.CSVFormat"}, new String[]{"<sample:2>", "<null>"}, true, 0, null, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput288() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.csv.CSVParser", "org.apache.commons.csv.CSVParser", "nextRecord", new String[]{}, new String[]{}, false, 8, new String[][]{{"org.apache.commons.csv.CSVParser", "nextRecord", ""}}), new String[][]{{"isConsistent", "", "5"}, {"size", "", "0"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("1", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getCurrentLineNumber=1, getFirstEndOfLine=\n, getRecordNumber=2, isClosed=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput289() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.csv.CSVParser", "org.apache.commons.csv.CSVParser", "parse", new String[]{"java.io.InputStream", "java.nio.charset.Charset", "org.apache.commons.csv.CSVFormat"}, new String[]{"<empty>", "<sample:2>", "<sample:9>"}, true, 0, null, 2), new String[][]{{"getFirstEndOfLine", "", "2"}});
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput290() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.csv.CSVParser", "org.apache.commons.csv.CSVParser", "getCurrentLineNumber", new String[]{}, new String[]{}, false, 1, new String[][]{{"org.apache.commons.csv.CSVParser", "getRecords", ""}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Long", actual.getClass().getName());
  assertEquals("1", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getCurrentLineNumber=1, getFirstEndOfLine=\n, getRecordNumber=3, isClosed=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput291() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.csv.CSVParser", "org.apache.commons.csv.CSVParser", "getCurrentLineNumber", new String[]{}, new String[]{}, false, 2, new String[][]{{"org.apache.commons.csv.CSVParser", "getRecords", ""}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Long", actual.getClass().getName());
  assertEquals("2", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getCurrentLineNumber=2, getFirstEndOfLine=\r\n, getRecordNumber=2, isClosed=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput292() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.csv.CSVParser", "org.apache.commons.csv.CSVParser", "getRecords", new String[]{}, new String[]{}, false, 3, new String[][]{{"org.apache.commons.csv.CSVParser", "nextRecord", ""}}, 3), new String[][]{{"trimToSize", "", "5"}});
  assertNotNull(actual);
  assertEquals("java.util.ArrayList", actual.getClass().getName());
  assertEquals("[CSVRecord [comment=null, mapping=null, recordNumber=5, values=[b]]]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getCurrentLineNumber=1, getFirstEndOfLine=\r, getRecordNumber=5, isClosed=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput293() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.csv.CSVParser", "org.apache.commons.csv.CSVParser", "getRecords", new String[]{}, new String[]{}, false, 8, new String[][]{{"org.apache.commons.csv.CSVParser", "iterator", ""}, {"org.apache.commons.csv.CSVParser", "close", ""}, {"org.apache.commons.csv.CSVParser", "nextRecord", ""}}, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.io.IOException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput294() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.csv.CSVParser", "org.apache.commons.csv.CSVParser", "getFirstEndOfLine", new String[]{}, new String[]{}, false, 1, new String[][]{{"org.apache.commons.csv.CSVParser", "getRecords", ""}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("\n", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getCurrentLineNumber=1, getFirstEndOfLine=\n, getRecordNumber=3, isClosed=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput295() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.csv.CSVParser", "org.apache.commons.csv.CSVParser", "getFirstEndOfLine", new String[]{}, new String[]{}, false, 12, new String[][]{{"org.apache.commons.csv.CSVParser", "getRecords", ""}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("\r", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getCurrentLineNumber=1, getFirstEndOfLine=\r, getRecordNumber=2, isClosed=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput296() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.csv.CSVParser", "org.apache.commons.csv.CSVParser", "parse", new String[]{"java.nio.file.Path", "java.nio.charset.Charset", "org.apache.commons.csv.CSVFormat"}, new String[]{"<sample:1>", "<empty>", "<sample:7>"}, true, 0, null, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput297() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.csv.CSVParser", "org.apache.commons.csv.CSVParser", "isClosed", new String[]{}, new String[]{}, false, 1, new String[][]{}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getCurrentLineNumber=0, getFirstEndOfLine=null, getRecordNumber=1, isClosed=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput298() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.csv.CSVParser", "org.apache.commons.csv.CSVParser", "isClosed", new String[]{}, new String[]{}, false, 3, new String[][]{}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getCurrentLineNumber=0, getFirstEndOfLine=null, getRecordNumber=3, isClosed=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput299() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.csv.CSVParser", "org.apache.commons.csv.CSVParser", "nextRecord", new String[]{}, new String[]{}, false, 10, new String[][]{{"org.apache.commons.csv.CSVParser", "getFirstEndOfLine", ""}}, 2);
  assertNotNull(actual);
  assertEquals("org.apache.commons.csv.CSVRecord", actual.getClass().getName());
  assertEquals("CSVRecord [comment=null, mapping=null, recordNumber=1, values=[a]] {getCharacterPosition=0, getComment=null, getRecordNumber=1, hasComment=false, isConsistent=true, size=1}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getCurrentLineNumber=1, getFirstEndOfLine=\r\n, getRecordNumber=1, isClosed=false}", SearchInputFactory_scaffolding.receiverState());
 }
}
