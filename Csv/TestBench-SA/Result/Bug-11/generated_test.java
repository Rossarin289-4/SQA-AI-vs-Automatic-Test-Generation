package generated.algorithm;

import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;
import static org.junit.Assert.*;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class SimulatedAnnealingGeneratedTest {
 @Test(timeout = 20000)
 public void generatedInput000() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.csv.CSVParser", "org.apache.commons.csv.CSVParser", "nextRecord", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.csv.CSVParser", "getRecordNumber", ""}, {"org.apache.commons.csv.CSVParser", "getRecordNumber", ""}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.csv.CSVRecord", actual.getClass().getName());
  assertEquals("[a] {getComment=null, getRecordNumber=1, isConsistent=true, size=1}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getCurrentLineNumber=0, getRecordNumber=1, isClosed=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput001() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.csv.CSVParser", "org.apache.commons.csv.CSVParser", "parse", new String[]{"java.net.URL", "java.nio.charset.Charset", "org.apache.commons.csv.CSVFormat"}, new String[]{"<sample:1>", "<sample:2>", "<sample:2>"}, true); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput002() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.csv.CSVParser", "org.apache.commons.csv.CSVParser", "iterator", new String[]{}, new String[]{}, false, 11, new String[][]{{"org.apache.commons.csv.CSVParser", "getCurrentLineNumber", ""}, {"org.apache.commons.csv.CSVParser", "getRecordNumber", ""}}), new String[][]{{"next", "", "3"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.util.NoSuchElementException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput003() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.csv.CSVParser", "org.apache.commons.csv.CSVParser", "parse", new String[]{"java.io.File", "java.nio.charset.Charset", "org.apache.commons.csv.CSVFormat"}, new String[]{"<sample:3>", "<null>", "<sample:0>"}, true); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.io.FileNotFoundException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput004() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.csv.CSVParser", "org.apache.commons.csv.CSVParser", "iterator", new String[]{}, new String[]{}, false, 1, new String[][]{{"org.apache.commons.csv.CSVParser", "nextRecord", ""}}), new String[][]{{"hasNext", "", "1"}, {"remove", "", "1"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.UnsupportedOperationException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput005() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.csv.CSVParser", "org.apache.commons.csv.CSVParser", "iterator", new String[]{}, new String[]{}, false), new String[][]{{"hasNext", "", "3"}, {"next", "", "0"}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.csv.CSVRecord", actual.getClass().getName());
  assertEquals("[a] {getComment=null, getRecordNumber=1, isConsistent=true, size=1}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getCurrentLineNumber=0, getRecordNumber=1, isClosed=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput006() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.csv.CSVParser", "org.apache.commons.csv.CSVParser", "iterator", new String[]{}, new String[]{}, false, 15, new String[][]{{"org.apache.commons.csv.CSVParser", "getCurrentLineNumber", ""}}), new String[][]{{"hasNext", "", "3"}, {"hasNext", "", "5"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getCurrentLineNumber=1, getRecordNumber=1, isClosed=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput007() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.csv.CSVParser", "org.apache.commons.csv.CSVParser", "iterator", new String[]{}, new String[]{}, false, 13, new String[][]{{"org.apache.commons.csv.CSVParser", "getRecords", ""}}, 3), new String[][]{{"hasNext", "", "4"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getCurrentLineNumber=1, getRecordNumber=2, isClosed=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput008() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.csv.CSVParser", "org.apache.commons.csv.CSVParser", "iterator", new String[]{}, new String[]{}, false, 3, new String[][]{{"org.apache.commons.csv.CSVParser", "close", ""}, {"org.apache.commons.csv.CSVParser", "getRecordNumber", ""}}), new String[][]{{"hasNext", "", "5"}, {"hasNext", "", "2"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getCurrentLineNumber=0, getRecordNumber=0, isClosed=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput009() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.csv.CSVParser", "org.apache.commons.csv.CSVParser", "iterator", new String[]{}, new String[]{}, false, 11, new String[][]{{"org.apache.commons.csv.CSVParser", "close", ""}, {"org.apache.commons.csv.CSVParser", "nextRecord", ""}, {"org.apache.commons.csv.CSVParser", "isClosed", ""}}, 1), new String[][]{{"next", "", "4"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.util.NoSuchElementException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput010() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.csv.CSVParser", "org.apache.commons.csv.CSVParser", "iterator", new String[]{}, new String[]{}, false, 1, new String[][]{{"org.apache.commons.csv.CSVParser", "getHeaderMap", ""}, {"org.apache.commons.csv.CSVParser", "nextRecord", ""}, {"org.apache.commons.csv.CSVParser", "getHeaderMap", ""}}, 1), new String[][]{{"next", "", "1"}, {"iterator", "", "2"}});
  assertNotNull(actual);
  assertEquals("java.util.Arrays$ArrayItr", actual.getClass().getName());
  assertEquals("{hasNext=true}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getCurrentLineNumber=1, getRecordNumber=2, isClosed=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput011() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.csv.CSVParser", "org.apache.commons.csv.CSVParser", "parse", new String[]{"java.lang.String", "org.apache.commons.csv.CSVFormat"}, new String[]{"1.1243667890F235562020-02-30T2561:61", "<sample:10>"}, true), new String[][]{{"getRecords", "", "1"}, {"listIterator", "", "6"}});
  assertNotNull(actual);
  assertEquals("java.util.ArrayList$ListItr", actual.getClass().getName());
  assertEquals("{hasNext=true, hasPrevious=false}", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput012() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.csv.CSVParser", "org.apache.commons.csv.CSVParser", "parse", new String[]{"java.lang.String", "org.apache.commons.csv.CSVFormat"}, new String[]{"file", "<sample:7>"}, true, 0, null, 3);
  assertNotNull(actual);
  assertEquals("org.apache.commons.csv.CSVParser", actual.getClass().getName());
  assertEquals("{getCurrentLineNumber=0, getRecordNumber=0, isClosed=false}", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput013() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.csv.CSVParser", "org.apache.commons.csv.CSVParser", "getRecordNumber", new String[]{}, new String[]{}, false, 2, new String[][]{}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Long", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getCurrentLineNumber=0, getRecordNumber=0, isClosed=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput014() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.csv.CSVParser", "org.apache.commons.csv.CSVParser", "parse", new String[]{"java.net.URL", "java.nio.charset.Charset", "org.apache.commons.csv.CSVFormat"}, new String[]{"<sample:7>", "<sample:2>", "<sample:5>"}, true, 0, null, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput015() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.csv.CSVParser", "org.apache.commons.csv.CSVParser", "nextRecord", new String[]{}, new String[]{}, false, 9, new String[][]{{"org.apache.commons.csv.CSVParser", "nextRecord", ""}}, 3);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getCurrentLineNumber=1, getRecordNumber=1, isClosed=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput016() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.csv.CSVParser", "org.apache.commons.csv.CSVParser", "nextRecord", new String[]{}, new String[]{}, false, 10, new String[][]{{"org.apache.commons.csv.CSVParser", "nextRecord", ""}}, 3), new String[][]{{"size", "", "3"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("1", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getCurrentLineNumber=2, getRecordNumber=2, isClosed=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput017() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.csv.CSVParser", "org.apache.commons.csv.CSVParser", "nextRecord", new String[]{}, new String[]{}, false, 11, new String[][]{{"org.apache.commons.csv.CSVParser", "nextRecord", ""}}, 3);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getCurrentLineNumber=0, getRecordNumber=0, isClosed=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput018() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.csv.CSVParser", "org.apache.commons.csv.CSVParser", "nextRecord", new String[]{}, new String[]{}, false, 12, new String[][]{{"org.apache.commons.csv.CSVParser", "nextRecord", ""}}, 3), new String[][]{{"size", "", "3"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("1", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getCurrentLineNumber=1, getRecordNumber=2, isClosed=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput019() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.csv.CSVParser", "org.apache.commons.csv.CSVParser", "nextRecord", new String[]{}, new String[]{}, false, 16, new String[][]{}, 3), new String[][]{{"size", "", "3"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("1", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getCurrentLineNumber=0, getRecordNumber=1, isClosed=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput020() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.csv.CSVParser", "org.apache.commons.csv.CSVParser", "parse", new String[]{"java.net.URL", "java.nio.charset.Charset", "org.apache.commons.csv.CSVFormat"}, new String[]{"<null>", "<sample:1>", "<sample:2>"}, true, 0, null, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput021() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.csv.CSVParser", "org.apache.commons.csv.CSVParser", "parse", new String[]{"java.net.URL", "java.nio.charset.Charset", "org.apache.commons.csv.CSVFormat"}, new String[]{"<sample:1>", "<sample:0>", "<sample:5>"}, true, 0, null, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput022() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.csv.CSVParser", "org.apache.commons.csv.CSVParser", "getCurrentLineNumber", new String[]{}, new String[]{}, false, 19, new String[][]{{"org.apache.commons.csv.CSVParser", "close", ""}, {"org.apache.commons.csv.CSVParser", "nextRecord", ""}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Long", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getCurrentLineNumber=0, getRecordNumber=0, isClosed=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput023() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.csv.CSVParser", "org.apache.commons.csv.CSVParser", "getCurrentLineNumber", new String[]{}, new String[]{}, false, 19, new String[][]{{"org.apache.commons.csv.CSVParser", "nextRecord", ""}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Long", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getCurrentLineNumber=0, getRecordNumber=1, isClosed=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput024() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.csv.CSVParser", "org.apache.commons.csv.CSVParser", "getCurrentLineNumber", new String[]{}, new String[]{}, false, 19, new String[][]{}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Long", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getCurrentLineNumber=0, getRecordNumber=0, isClosed=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput025() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.csv.CSVParser", "org.apache.commons.csv.CSVParser", "getCurrentLineNumber", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.csv.CSVParser", "isClosed", ""}, {"org.apache.commons.csv.CSVParser", "close", ""}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Long", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getCurrentLineNumber=0, getRecordNumber=0, isClosed=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput026() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.csv.CSVParser", "org.apache.commons.csv.CSVParser", "getCurrentLineNumber", new String[]{}, new String[]{}, false, 5, new String[][]{{"org.apache.commons.csv.CSVParser", "isClosed", ""}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Long", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getCurrentLineNumber=0, getRecordNumber=0, isClosed=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput027() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.csv.CSVParser", "org.apache.commons.csv.CSVParser", "getCurrentLineNumber", new String[]{}, new String[]{}, false, 16, new String[][]{{"org.apache.commons.csv.CSVParser", "iterator", ""}, {"org.apache.commons.csv.CSVParser", "close", ""}, {"org.apache.commons.csv.CSVParser", "getRecords", ""}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Long", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getCurrentLineNumber=0, getRecordNumber=0, isClosed=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput028() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.csv.CSVParser", "org.apache.commons.csv.CSVParser", "getCurrentLineNumber", new String[]{}, new String[]{}, false, 21, new String[][]{{"org.apache.commons.csv.CSVParser", "getHeaderMap", ""}, {"org.apache.commons.csv.CSVParser", "nextRecord", ""}, {"org.apache.commons.csv.CSVParser", "iterator", ""}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Long", actual.getClass().getName());
  assertEquals("1", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getCurrentLineNumber=1, getRecordNumber=1, isClosed=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput029() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.csv.CSVParser", "org.apache.commons.csv.CSVParser", "getCurrentLineNumber", new String[]{}, new String[]{}, false, 32, new String[][]{{"org.apache.commons.csv.CSVParser", "iterator", ""}, {"org.apache.commons.csv.CSVParser", "nextRecord", ""}, {"org.apache.commons.csv.CSVParser", "iterator", ""}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Long", actual.getClass().getName());
  assertEquals("1", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getCurrentLineNumber=1, getRecordNumber=1, isClosed=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput030() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.csv.CSVParser", "org.apache.commons.csv.CSVParser", "getCurrentLineNumber", new String[]{}, new String[]{}, false, 32, new String[][]{{"org.apache.commons.csv.CSVParser", "iterator", ""}, {"org.apache.commons.csv.CSVParser", "nextRecord", ""}, {"org.apache.commons.csv.CSVParser", "iterator", ""}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Long", actual.getClass().getName());
  assertEquals("1", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getCurrentLineNumber=1, getRecordNumber=1, isClosed=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput031() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.csv.CSVParser", "org.apache.commons.csv.CSVParser", "iterator", new String[]{}, new String[]{}, false, 11, new String[][]{{"org.apache.commons.csv.CSVParser", "iterator", ""}, {"org.apache.commons.csv.CSVParser", "isClosed", ""}}, 2);
  assertNotNull(actual);
  assertEquals("receiver state after the call", "{getCurrentLineNumber=0, getRecordNumber=0, isClosed=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput032() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.csv.CSVParser", "org.apache.commons.csv.CSVParser", "getRecords", new String[]{"java.util.Collection"}, new String[]{"<null>"}, false, 0, new String[][]{{"org.apache.commons.csv.CSVParser", "nextRecord", ""}}, 1);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getCurrentLineNumber=0, getRecordNumber=1, isClosed=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput033() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.csv.CSVParser", "org.apache.commons.csv.CSVParser", "getRecords", new String[]{"java.util.Collection"}, new String[]{"<sample:2>"}, false, 0, new String[][]{{"org.apache.commons.csv.CSVParser", "nextRecord", ""}}, 1), new String[][]{{"removeAll", "java.util.Collection", "7"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getCurrentLineNumber=0, getRecordNumber=1, isClosed=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput034() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.csv.CSVParser", "org.apache.commons.csv.CSVParser", "getRecords", new String[]{"java.util.Collection"}, new String[]{"<sample:1>"}, false, 0, null, 1), new String[][]{{"removeAll", "java.util.Collection", "7"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getCurrentLineNumber=0, getRecordNumber=1, isClosed=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput035() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.csv.CSVParser", "org.apache.commons.csv.CSVParser", "getRecordNumber", new String[]{}, new String[]{}, false, 17, new String[][]{{"org.apache.commons.csv.CSVParser", "isClosed", ""}, {"org.apache.commons.csv.CSVParser", "isClosed", ""}, {"org.apache.commons.csv.CSVParser", "getCurrentLineNumber", ""}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Long", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getCurrentLineNumber=0, getRecordNumber=0, isClosed=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput036() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.csv.CSVParser", "org.apache.commons.csv.CSVParser", "getHeaderMap", new String[]{}, new String[]{}, false, 1, new String[][]{{"org.apache.commons.csv.CSVParser", "nextRecord", ""}, {"org.apache.commons.csv.CSVParser", "getHeaderMap", ""}}, 1);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getCurrentLineNumber=1, getRecordNumber=1, isClosed=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput037() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.csv.CSVParser", "org.apache.commons.csv.CSVParser", "getHeaderMap", new String[]{}, new String[]{}, false, 1, new String[][]{}, 1);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getCurrentLineNumber=0, getRecordNumber=0, isClosed=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput038() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.csv.CSVParser", "org.apache.commons.csv.CSVParser", "getRecords", new String[]{"java.util.Collection"}, new String[]{"<sample:5>"}, false, 0, null, 1), new String[][]{{"ensureCapacity", "int", "2"}});
  assertNotNull(actual);
  assertEquals("java.util.ArrayList", actual.getClass().getName());
  assertEquals("[a, 0, sample, [a]]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getCurrentLineNumber=0, getRecordNumber=1, isClosed=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput039() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.csv.CSVParser", "org.apache.commons.csv.CSVParser", "getRecords", new String[]{"java.util.Collection"}, new String[]{"<sample:0>"}, false, 0, null, 1), new String[][]{{"ensureCapacity", "int", "5"}});
  assertNotNull(actual);
  assertEquals("java.util.ArrayList", actual.getClass().getName());
  assertEquals("[, [a]]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getCurrentLineNumber=0, getRecordNumber=1, isClosed=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput040() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.csv.CSVParser", "org.apache.commons.csv.CSVParser", "getRecords", new String[]{"java.util.Collection"}, new String[]{"<null>"}, false, 0, null, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput041() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.csv.CSVParser", "org.apache.commons.csv.CSVParser", "getRecords", new String[]{"java.util.Collection"}, new String[]{"<sample:2>"}, false, 0, null, 1), new String[][]{{"ensureCapacity", "int", "5"}});
  assertNotNull(actual);
  assertEquals("java.util.ArrayList", actual.getClass().getName());
  assertEquals("[0, sample, , [a]]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getCurrentLineNumber=0, getRecordNumber=1, isClosed=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput042() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.csv.CSVParser", "org.apache.commons.csv.CSVParser", "getRecords", new String[]{}, new String[]{}, false, 9, new String[][]{{"org.apache.commons.csv.CSVParser", "getRecords", ""}, {"org.apache.commons.csv.CSVParser", "nextRecord", ""}, {"org.apache.commons.csv.CSVParser", "isClosed", ""}}, 3), new String[][]{{"subList", "int,int", "6"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IndexOutOfBoundsException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput043() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.csv.CSVParser", "org.apache.commons.csv.CSVParser", "getRecords", new String[]{}, new String[]{}, false, 9, new String[][]{{"org.apache.commons.csv.CSVParser", "getRecords", ""}, {"org.apache.commons.csv.CSVParser", "nextRecord", ""}, {"org.apache.commons.csv.CSVParser", "isClosed", ""}}, 3), new String[][]{{"containsAll", "java.util.Collection", "6"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getCurrentLineNumber=1, getRecordNumber=1, isClosed=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput044() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.csv.CSVParser", "org.apache.commons.csv.CSVParser", "getRecords", new String[]{}, new String[]{}, false, 10, new String[][]{{"org.apache.commons.csv.CSVParser", "getRecords", ""}, {"org.apache.commons.csv.CSVParser", "nextRecord", ""}, {"org.apache.commons.csv.CSVParser", "isClosed", ""}}, 3), new String[][]{{"containsAll", "java.util.Collection", "6"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getCurrentLineNumber=2, getRecordNumber=2, isClosed=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput045() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.csv.CSVParser", "org.apache.commons.csv.CSVParser", "getRecords", new String[]{}, new String[]{}, false, 11, new String[][]{{"org.apache.commons.csv.CSVParser", "nextRecord", ""}, {"org.apache.commons.csv.CSVParser", "isClosed", ""}}, 3), new String[][]{{"containsAll", "java.util.Collection", "6"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getCurrentLineNumber=0, getRecordNumber=0, isClosed=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput046() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.csv.CSVParser", "org.apache.commons.csv.CSVParser", "getRecords", new String[]{}, new String[]{}, false, 12, new String[][]{{"org.apache.commons.csv.CSVParser", "nextRecord", ""}, {"org.apache.commons.csv.CSVParser", "isClosed", ""}}, 3), new String[][]{{"containsAll", "java.util.Collection", "6"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getCurrentLineNumber=1, getRecordNumber=2, isClosed=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput047() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.csv.CSVParser", "org.apache.commons.csv.CSVParser", "getRecords", new String[]{}, new String[]{}, false, 15, new String[][]{{"org.apache.commons.csv.CSVParser", "nextRecord", ""}, {"org.apache.commons.csv.CSVParser", "close", ""}, {"org.apache.commons.csv.CSVParser", "isClosed", ""}}, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.io.IOException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput048() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.csv.CSVParser", "org.apache.commons.csv.CSVParser", "getRecords", new String[]{"java.util.Collection"}, new String[]{"<sample:4>"}, false, 15, new String[][]{{"org.apache.commons.csv.CSVParser", "getHeaderMap", ""}, {"org.apache.commons.csv.CSVParser", "nextRecord", ""}}, 1), new String[][]{{"remove", "int", "7"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IndexOutOfBoundsException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput049() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.csv.CSVParser", "org.apache.commons.csv.CSVParser", "getRecords", new String[]{"java.util.Collection"}, new String[]{"<empty>"}, false, 15, new String[][]{{"org.apache.commons.csv.CSVParser", "getHeaderMap", ""}, {"org.apache.commons.csv.CSVParser", "nextRecord", ""}}, 1);
  assertNotNull(actual);
  assertEquals("java.util.ArrayList", actual.getClass().getName());
  assertEquals("[[b]]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getCurrentLineNumber=1, getRecordNumber=2, isClosed=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput050() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.csv.CSVParser", "org.apache.commons.csv.CSVParser", "getRecords", new String[]{"java.util.Collection"}, new String[]{"<empty>"}, false, 14, new String[][]{{"org.apache.commons.csv.CSVParser", "getHeaderMap", ""}, {"org.apache.commons.csv.CSVParser", "nextRecord", ""}}, 1);
  assertNotNull(actual);
  assertEquals("java.util.ArrayList", actual.getClass().getName());
  assertEquals("[[1,2]]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getCurrentLineNumber=2, getRecordNumber=2, isClosed=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput051() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.csv.CSVParser", "org.apache.commons.csv.CSVParser", "nextRecord", new String[]{}, new String[]{}, false, 10, new String[][]{}, 2), new String[][]{{"isMapped", "java.lang.String", "4"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getCurrentLineNumber=1, getRecordNumber=1, isClosed=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput052() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.csv.CSVParser", "org.apache.commons.csv.CSVParser", "nextRecord", new String[]{}, new String[]{}, false, 10, new String[][]{}, 2), new String[][]{{"isMapped", "java.lang.String", "4"}, {"get", "int", "2"}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("a", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getCurrentLineNumber=1, getRecordNumber=1, isClosed=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput053() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.csv.CSVParser", "org.apache.commons.csv.CSVParser", "nextRecord", new String[]{}, new String[]{}, false, 11, new String[][]{}, 2);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getCurrentLineNumber=0, getRecordNumber=0, isClosed=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput054() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.csv.CSVParser", "org.apache.commons.csv.CSVParser", "getRecordNumber", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.csv.CSVParser", "close", ""}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Long", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getCurrentLineNumber=0, getRecordNumber=0, isClosed=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput055() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.csv.CSVParser", "org.apache.commons.csv.CSVParser", "getRecordNumber", new String[]{}, new String[]{}, false, 5, new String[][]{{"org.apache.commons.csv.CSVParser", "nextRecord", ""}, {"org.apache.commons.csv.CSVParser", "close", ""}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Long", actual.getClass().getName());
  assertEquals("1", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getCurrentLineNumber=0, getRecordNumber=1, isClosed=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput056() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.csv.CSVParser", "org.apache.commons.csv.CSVParser", "getRecordNumber", new String[]{}, new String[]{}, false, 6, new String[][]{{"org.apache.commons.csv.CSVParser", "nextRecord", ""}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Long", actual.getClass().getName());
  assertEquals("1", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getCurrentLineNumber=0, getRecordNumber=1, isClosed=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput057() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.csv.CSVParser", "org.apache.commons.csv.CSVParser", "getRecordNumber", new String[]{}, new String[]{}, false, 15, new String[][]{{"org.apache.commons.csv.CSVParser", "nextRecord", ""}, {"org.apache.commons.csv.CSVParser", "getRecordNumber", ""}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Long", actual.getClass().getName());
  assertEquals("1", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getCurrentLineNumber=1, getRecordNumber=1, isClosed=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput058() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.csv.CSVParser", "org.apache.commons.csv.CSVParser", "getCurrentLineNumber", new String[]{}, new String[]{}, false, 27, new String[][]{{"org.apache.commons.csv.CSVParser", "getRecords", "java.util.Collection", "<sample:1>"}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Long", actual.getClass().getName());
  assertEquals("1", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getCurrentLineNumber=1, getRecordNumber=2, isClosed=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput059() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.csv.CSVParser", "org.apache.commons.csv.CSVParser", "getRecords", new String[]{"java.util.Collection"}, new String[]{"<sample:0>"}, false, 12, new String[][]{{"org.apache.commons.csv.CSVParser", "getRecordNumber", ""}, {"org.apache.commons.csv.CSVParser", "getRecords", ""}}, 2), new String[][]{{"add", "int,java.lang.Object", "2"}, {"ensureCapacity", "int", "3"}});
  assertNotNull(actual);
  assertEquals("java.util.ArrayList", actual.getClass().getName());
  assertEquals("[2, ]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getCurrentLineNumber=1, getRecordNumber=2, isClosed=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput060() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.csv.CSVParser", "org.apache.commons.csv.CSVParser", "getRecords", new String[]{"java.util.Collection"}, new String[]{"<empty>"}, false, 12, new String[][]{{"org.apache.commons.csv.CSVParser", "getRecordNumber", ""}, {"org.apache.commons.csv.CSVParser", "getRecords", ""}}, 2), new String[][]{{"add", "int,java.lang.Object", "2"}, {"ensureCapacity", "int", "3"}});
  assertNotNull(actual);
  assertEquals("java.util.ArrayList", actual.getClass().getName());
  assertEquals("[2]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getCurrentLineNumber=1, getRecordNumber=2, isClosed=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput061() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.csv.CSVParser", "org.apache.commons.csv.CSVParser", "getRecords", new String[]{"java.util.Collection"}, new String[]{"<sample:3>"}, false, 12, new String[][]{{"org.apache.commons.csv.CSVParser", "getRecordNumber", ""}, {"org.apache.commons.csv.CSVParser", "getRecords", ""}}, 2), new String[][]{{"add", "int,java.lang.Object", "2"}, {"ensureCapacity", "int", "3"}});
  assertNotNull(actual);
  assertEquals("java.util.ArrayList", actual.getClass().getName());
  assertEquals("[2, sample]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getCurrentLineNumber=1, getRecordNumber=2, isClosed=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput062() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.csv.CSVParser", "org.apache.commons.csv.CSVParser", "getRecords", new String[]{"java.util.Collection"}, new String[]{"<sample:1>"}, false, 12, new String[][]{{"org.apache.commons.csv.CSVParser", "getRecordNumber", ""}, {"org.apache.commons.csv.CSVParser", "getRecords", ""}}, 2), new String[][]{{"add", "int,java.lang.Object", "2"}, {"ensureCapacity", "int", "3"}});
  assertNotNull(actual);
  assertEquals("java.util.ArrayList", actual.getClass().getName());
  assertEquals("[2, a, 0]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getCurrentLineNumber=1, getRecordNumber=2, isClosed=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput063() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.csv.CSVParser", "org.apache.commons.csv.CSVParser", "getRecords", new String[]{"java.util.Collection"}, new String[]{"<sample:2>"}, false, 12, new String[][]{{"org.apache.commons.csv.CSVParser", "getRecordNumber", ""}, {"org.apache.commons.csv.CSVParser", "getRecords", ""}}, 2), new String[][]{{"add", "int,java.lang.Object", "2"}, {"ensureCapacity", "int", "3"}});
  assertNotNull(actual);
  assertEquals("java.util.ArrayList", actual.getClass().getName());
  assertEquals("[2, 0, sample, ]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getCurrentLineNumber=1, getRecordNumber=2, isClosed=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput064() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.csv.CSVParser", "org.apache.commons.csv.CSVParser", "getRecords", new String[]{"java.util.Collection"}, new String[]{"<null>"}, false, 12, new String[][]{{"org.apache.commons.csv.CSVParser", "getRecordNumber", ""}, {"org.apache.commons.csv.CSVParser", "getRecords", ""}}, 2);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getCurrentLineNumber=1, getRecordNumber=2, isClosed=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput065() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.csv.CSVParser", "org.apache.commons.csv.CSVParser", "getRecords", new String[]{"java.util.Collection"}, new String[]{"<sample:2>"}, false, 4, new String[][]{{"org.apache.commons.csv.CSVParser", "getRecordNumber", ""}, {"org.apache.commons.csv.CSVParser", "getRecords", ""}, {"org.apache.commons.csv.CSVParser", "getCurrentLineNumber", ""}}, 2), new String[][]{{"add", "int,java.lang.Object", "2"}, {"ensureCapacity", "int", "3"}});
  assertNotNull(actual);
  assertEquals("java.util.ArrayList", actual.getClass().getName());
  assertEquals("[2, 0, sample, ]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getCurrentLineNumber=0, getRecordNumber=0, isClosed=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput066() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.csv.CSVParser", "org.apache.commons.csv.CSVParser", "close", new String[]{}, new String[]{}, false, 3, new String[][]{{"org.apache.commons.csv.CSVParser", "getCurrentLineNumber", ""}, {"org.apache.commons.csv.CSVParser", "isClosed", ""}}, 3);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getCurrentLineNumber=0, getRecordNumber=0, isClosed=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput067() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.csv.CSVParser", "org.apache.commons.csv.CSVParser", "iterator", new String[]{}, new String[]{}, false, 3, new String[][]{}, 3), new String[][]{{"hasNext", "", "3"}, {"next", "", "0"}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.csv.CSVRecord", actual.getClass().getName());
  assertEquals("[a] {getComment=null, getRecordNumber=1, isConsistent=true, size=1}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getCurrentLineNumber=1, getRecordNumber=1, isClosed=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput068() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.csv.CSVParser", "org.apache.commons.csv.CSVParser", "iterator", new String[]{}, new String[]{}, false, 3, new String[][]{{"org.apache.commons.csv.CSVParser", "getCurrentLineNumber", ""}}, 3), new String[][]{{"hasNext", "", "3"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getCurrentLineNumber=1, getRecordNumber=1, isClosed=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput069() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.csv.CSVParser", "org.apache.commons.csv.CSVParser", "iterator", new String[]{}, new String[]{}, false, 4, new String[][]{{"org.apache.commons.csv.CSVParser", "getCurrentLineNumber", ""}}, 3), new String[][]{{"hasNext", "", "3"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getCurrentLineNumber=0, getRecordNumber=0, isClosed=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput070() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.csv.CSVParser", "org.apache.commons.csv.CSVParser", "close", new String[]{}, new String[]{}, false, 0, null, 2);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getCurrentLineNumber=0, getRecordNumber=0, isClosed=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput071() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.csv.CSVParser", "org.apache.commons.csv.CSVParser", "getHeaderMap", new String[]{}, new String[]{}, false, 3, new String[][]{{"org.apache.commons.csv.CSVParser", "close", ""}, {"org.apache.commons.csv.CSVParser", "nextRecord", ""}, {"org.apache.commons.csv.CSVParser", "nextRecord", ""}}, 1);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getCurrentLineNumber=0, getRecordNumber=0, isClosed=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput072() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.csv.CSVParser", "org.apache.commons.csv.CSVParser", "getHeaderMap", new String[]{}, new String[]{}, false, 10, new String[][]{{"org.apache.commons.csv.CSVParser", "getRecords", "java.util.Collection", "<sample:2>"}}, 1);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getCurrentLineNumber=2, getRecordNumber=2, isClosed=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput073() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.csv.CSVParser", "org.apache.commons.csv.CSVParser", "getHeaderMap", new String[]{}, new String[]{}, false, 12, new String[][]{{"org.apache.commons.csv.CSVParser", "getRecords", "java.util.Collection", "<sample:2>"}}, 1);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getCurrentLineNumber=1, getRecordNumber=2, isClosed=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput074() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.csv.CSVParser", "org.apache.commons.csv.CSVParser", "getHeaderMap", new String[]{}, new String[]{}, false, 4, new String[][]{}, 2);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getCurrentLineNumber=0, getRecordNumber=0, isClosed=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput075() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.csv.CSVParser", "org.apache.commons.csv.CSVParser", "getHeaderMap", new String[]{}, new String[]{}, false, 12, new String[][]{{"org.apache.commons.csv.CSVParser", "nextRecord", ""}}, 2);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getCurrentLineNumber=1, getRecordNumber=1, isClosed=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput076() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.csv.CSVParser", "org.apache.commons.csv.CSVParser", "getHeaderMap", new String[]{}, new String[]{}, false, 5, new String[][]{{"org.apache.commons.csv.CSVParser", "nextRecord", ""}}, 2);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getCurrentLineNumber=0, getRecordNumber=1, isClosed=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput077() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.csv.CSVParser", "org.apache.commons.csv.CSVParser", "close", new String[]{}, new String[]{}, false, 0, null, 1);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getCurrentLineNumber=0, getRecordNumber=0, isClosed=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput078() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.csv.CSVParser", "org.apache.commons.csv.CSVParser", "close", new String[]{}, new String[]{}, false, 16, new String[][]{{"org.apache.commons.csv.CSVParser", "getRecords", ""}}, 1);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getCurrentLineNumber=0, getRecordNumber=1, isClosed=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput079() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.csv.CSVParser", "org.apache.commons.csv.CSVParser", "close", new String[]{}, new String[]{}, false, 21, new String[][]{{"org.apache.commons.csv.CSVParser", "getRecords", ""}}, 1);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getCurrentLineNumber=1, getRecordNumber=1, isClosed=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput080() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.csv.CSVParser", "org.apache.commons.csv.CSVParser", "close", new String[]{}, new String[]{}, false, 10, new String[][]{{"org.apache.commons.csv.CSVParser", "getRecordNumber", ""}, {"org.apache.commons.csv.CSVParser", "getRecords", "java.util.Collection", "<sample:2>"}}, 2);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getCurrentLineNumber=2, getRecordNumber=2, isClosed=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput081() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.csv.CSVParser", "org.apache.commons.csv.CSVParser", "close", new String[]{}, new String[]{}, false, 7, new String[][]{{"org.apache.commons.csv.CSVParser", "getRecordNumber", ""}, {"org.apache.commons.csv.CSVParser", "getRecords", "java.util.Collection", "<sample:2>"}}, 2);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getCurrentLineNumber=0, getRecordNumber=1, isClosed=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput082() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.csv.CSVParser", "org.apache.commons.csv.CSVParser", "close", new String[]{}, new String[]{}, false, 8, new String[][]{{"org.apache.commons.csv.CSVParser", "getRecordNumber", ""}, {"org.apache.commons.csv.CSVParser", "getRecords", "java.util.Collection", "<sample:1>"}}, 2);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getCurrentLineNumber=1, getRecordNumber=2, isClosed=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput083() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.csv.CSVParser", "org.apache.commons.csv.CSVParser", "close", new String[]{}, new String[]{}, false, 9, new String[][]{{"org.apache.commons.csv.CSVParser", "getRecordNumber", ""}, {"org.apache.commons.csv.CSVParser", "getRecords", "java.util.Collection", "<sample:1>"}}, 2);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getCurrentLineNumber=1, getRecordNumber=1, isClosed=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput084() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.csv.CSVParser", "org.apache.commons.csv.CSVParser", "getRecords", new String[]{}, new String[]{}, false, 2, new String[][]{{"org.apache.commons.csv.CSVParser", "getHeaderMap", ""}}, 2), new String[][]{{"ensureCapacity", "int", "1"}});
  assertNotNull(actual);
  assertEquals("java.util.ArrayList", actual.getClass().getName());
  assertEquals("[[a], [b]]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getCurrentLineNumber=2, getRecordNumber=2, isClosed=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput085() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.csv.CSVParser", "org.apache.commons.csv.CSVParser", "getRecords", new String[]{}, new String[]{}, false, 3, new String[][]{{"org.apache.commons.csv.CSVParser", "getHeaderMap", ""}}, 2), new String[][]{{"ensureCapacity", "int", "1"}});
  assertNotNull(actual);
  assertEquals("java.util.ArrayList", actual.getClass().getName());
  assertEquals("[[a], [b]]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getCurrentLineNumber=1, getRecordNumber=2, isClosed=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput086() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.csv.CSVParser", "org.apache.commons.csv.CSVParser", "isClosed", new String[]{}, new String[]{}, false, 7, new String[][]{}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getCurrentLineNumber=0, getRecordNumber=0, isClosed=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput087() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.csv.CSVParser", "org.apache.commons.csv.CSVParser", "nextRecord", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.csv.CSVParser", "getRecordNumber", ""}, {"org.apache.commons.csv.CSVParser", "getRecordNumber", ""}}), new String[][]{{"isSet", "java.lang.String", "3"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getCurrentLineNumber=0, getRecordNumber=1, isClosed=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput088() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.csv.CSVParser", "org.apache.commons.csv.CSVParser", "nextRecord", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.csv.CSVParser", "getRecordNumber", ""}, {"org.apache.commons.csv.CSVParser", "getRecordNumber", ""}}), new String[][]{{"getComment", "", "0"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getCurrentLineNumber=0, getRecordNumber=1, isClosed=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput089() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.csv.CSVParser", "org.apache.commons.csv.CSVParser", "nextRecord", new String[]{}, new String[]{}, false, 1, new String[][]{{"org.apache.commons.csv.CSVParser", "getRecordNumber", ""}, {"org.apache.commons.csv.CSVParser", "getRecordNumber", ""}}), new String[][]{{"getComment", "", "0"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getCurrentLineNumber=1, getRecordNumber=1, isClosed=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput090() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.csv.CSVParser", "org.apache.commons.csv.CSVParser", "nextRecord", new String[]{}, new String[]{}, false, 4, new String[][]{{"org.apache.commons.csv.CSVParser", "getRecordNumber", ""}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getCurrentLineNumber=0, getRecordNumber=0, isClosed=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput091() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.csv.CSVParser", "org.apache.commons.csv.CSVParser", "nextRecord", new String[]{}, new String[]{}, false, 5, new String[][]{{"org.apache.commons.csv.CSVParser", "getRecordNumber", ""}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.csv.CSVRecord", actual.getClass().getName());
  assertEquals("[<a><b>t</b></a>] {getComment=null, getRecordNumber=1, isConsistent=true, size=1}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getCurrentLineNumber=0, getRecordNumber=1, isClosed=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput092() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.csv.CSVParser", "org.apache.commons.csv.CSVParser", "nextRecord", new String[]{}, new String[]{}, false, 7, new String[][]{{"org.apache.commons.csv.CSVParser", "getRecordNumber", ""}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.csv.CSVRecord", actual.getClass().getName());
  assertEquals("[ x \t y ] {getComment=null, getRecordNumber=1, isConsistent=true, size=1}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getCurrentLineNumber=0, getRecordNumber=1, isClosed=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput093() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.csv.CSVParser", "org.apache.commons.csv.CSVParser", "close", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.csv.CSVParser", "isClosed", ""}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getCurrentLineNumber=0, getRecordNumber=0, isClosed=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput094() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.csv.CSVParser", "org.apache.commons.csv.CSVParser", "nextRecord", new String[]{}, new String[]{}, false, 9, new String[][]{{"org.apache.commons.csv.CSVParser", "getRecordNumber", ""}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.csv.CSVRecord", actual.getClass().getName());
  assertEquals("[] {getComment=null, getRecordNumber=1, isConsistent=true, size=1}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getCurrentLineNumber=1, getRecordNumber=1, isClosed=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput095() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.csv.CSVParser", "org.apache.commons.csv.CSVParser", "nextRecord", new String[]{}, new String[]{}, false, 5, new String[][]{{"org.apache.commons.csv.CSVParser", "getRecordNumber", ""}}), new String[][]{{"size", "", "7"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("1", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getCurrentLineNumber=0, getRecordNumber=1, isClosed=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput096() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.csv.CSVParser", "org.apache.commons.csv.CSVParser", "isClosed", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.csv.CSVParser", "getRecords", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getCurrentLineNumber=0, getRecordNumber=1, isClosed=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput097() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.csv.CSVParser", "org.apache.commons.csv.CSVParser", "isClosed", new String[]{}, new String[]{}, false, 1, new String[][]{{"org.apache.commons.csv.CSVParser", "getRecords", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getCurrentLineNumber=1, getRecordNumber=2, isClosed=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput098() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.csv.CSVParser", "org.apache.commons.csv.CSVParser", "isClosed", new String[]{}, new String[]{}, false);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getCurrentLineNumber=0, getRecordNumber=0, isClosed=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput099() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.csv.CSVParser", "org.apache.commons.csv.CSVParser", "getRecordNumber", new String[]{}, new String[]{}, false);
  assertNotNull(actual);
  assertEquals("java.lang.Long", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getCurrentLineNumber=0, getRecordNumber=0, isClosed=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput100() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.csv.CSVParser", "org.apache.commons.csv.CSVParser", "nextRecord", new String[]{}, new String[]{}, false, 8, new String[][]{{"org.apache.commons.csv.CSVParser", "nextRecord", ""}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.csv.CSVRecord", actual.getClass().getName());
  assertEquals("[b] {getComment=null, getRecordNumber=2, isConsistent=true, size=1}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getCurrentLineNumber=1, getRecordNumber=2, isClosed=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput101() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.csv.CSVParser", "org.apache.commons.csv.CSVParser", "parse", new String[]{"java.lang.String", "org.apache.commons.csv.CSVFormat"}, new String[]{"2147483648", "<sample:6>"}, true), new String[][]{{"getRecordNumber", "", "7"}});
  assertNotNull(actual);
  assertEquals("java.lang.Long", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput102() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.csv.CSVParser", "org.apache.commons.csv.CSVParser", "nextRecord", new String[]{}, new String[]{}, false, 14, new String[][]{{"org.apache.commons.csv.CSVParser", "nextRecord", ""}}), new String[][]{{"size", "", "3"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("1", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getCurrentLineNumber=2, getRecordNumber=2, isClosed=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput103() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.csv.CSVParser", "org.apache.commons.csv.CSVParser", "getRecordNumber", new String[]{}, new String[]{}, false, 2, new String[][]{{"org.apache.commons.csv.CSVParser", "getRecords", "java.util.Collection", "<sample:1>"}, {"org.apache.commons.csv.CSVParser", "getHeaderMap", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.Long", actual.getClass().getName());
  assertEquals("2", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getCurrentLineNumber=2, getRecordNumber=2, isClosed=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput104() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.csv.CSVParser", "org.apache.commons.csv.CSVParser", "getRecordNumber", new String[]{}, new String[]{}, false, 7, new String[][]{{"org.apache.commons.csv.CSVParser", "getHeaderMap", ""}, {"org.apache.commons.csv.CSVParser", "getCurrentLineNumber", ""}, {"org.apache.commons.csv.CSVParser", "getRecords", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.Long", actual.getClass().getName());
  assertEquals("1", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getCurrentLineNumber=0, getRecordNumber=1, isClosed=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput105() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.csv.CSVParser", "org.apache.commons.csv.CSVParser", "getRecordNumber", new String[]{}, new String[]{}, false, 8, new String[][]{{"org.apache.commons.csv.CSVParser", "getHeaderMap", ""}, {"org.apache.commons.csv.CSVParser", "getCurrentLineNumber", ""}, {"org.apache.commons.csv.CSVParser", "getRecords", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.Long", actual.getClass().getName());
  assertEquals("2", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getCurrentLineNumber=1, getRecordNumber=2, isClosed=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput106() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.csv.CSVParser", "org.apache.commons.csv.CSVParser", "getRecordNumber", new String[]{}, new String[]{}, false, 9, new String[][]{{"org.apache.commons.csv.CSVParser", "getHeaderMap", ""}, {"org.apache.commons.csv.CSVParser", "getCurrentLineNumber", ""}, {"org.apache.commons.csv.CSVParser", "getRecords", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.Long", actual.getClass().getName());
  assertEquals("1", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getCurrentLineNumber=1, getRecordNumber=1, isClosed=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput107() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.csv.CSVParser", "org.apache.commons.csv.CSVParser", "getCurrentLineNumber", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.csv.CSVParser", "nextRecord", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.Long", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getCurrentLineNumber=0, getRecordNumber=1, isClosed=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput108() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.csv.CSVParser", "org.apache.commons.csv.CSVParser", "getCurrentLineNumber", new String[]{}, new String[]{}, false);
  assertNotNull(actual);
  assertEquals("java.lang.Long", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getCurrentLineNumber=0, getRecordNumber=0, isClosed=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput109() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.csv.CSVParser", "org.apache.commons.csv.CSVParser", "getCurrentLineNumber", new String[]{}, new String[]{}, false, 13, new String[][]{{"org.apache.commons.csv.CSVParser", "nextRecord", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.Long", actual.getClass().getName());
  assertEquals("1", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getCurrentLineNumber=1, getRecordNumber=1, isClosed=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput110() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.csv.CSVParser", "org.apache.commons.csv.CSVParser", "getCurrentLineNumber", new String[]{}, new String[]{}, false, 13, new String[][]{{"org.apache.commons.csv.CSVParser", "close", ""}, {"org.apache.commons.csv.CSVParser", "nextRecord", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.Long", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getCurrentLineNumber=0, getRecordNumber=0, isClosed=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput111() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.csv.CSVParser", "org.apache.commons.csv.CSVParser", "getRecords", new String[]{}, new String[]{}, false);
  assertNotNull(actual);
  assertEquals("java.util.ArrayList", actual.getClass().getName());
  assertEquals("[[a]]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getCurrentLineNumber=0, getRecordNumber=1, isClosed=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput112() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.csv.CSVParser", "org.apache.commons.csv.CSVParser", "getRecords", new String[]{}, new String[]{}, false, 1, new String[][]{});
  assertNotNull(actual);
  assertEquals("java.util.ArrayList", actual.getClass().getName());
  assertEquals("[[a], [b]]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getCurrentLineNumber=1, getRecordNumber=2, isClosed=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput113() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.csv.CSVParser", "org.apache.commons.csv.CSVParser", "getRecords", new String[]{}, new String[]{}, false, 2, new String[][]{});
  assertNotNull(actual);
  assertEquals("java.util.ArrayList", actual.getClass().getName());
  assertEquals("[[a], [b]]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getCurrentLineNumber=2, getRecordNumber=2, isClosed=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput114() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.csv.CSVParser", "org.apache.commons.csv.CSVParser", "getRecords", new String[]{}, new String[]{}, false, 4, new String[][]{{"org.apache.commons.csv.CSVParser", "getRecordNumber", ""}});
  assertNotNull(actual);
  assertEquals("java.util.ArrayList", actual.getClass().getName());
  assertEquals("[]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getCurrentLineNumber=0, getRecordNumber=0, isClosed=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput115() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.csv.CSVParser", "org.apache.commons.csv.CSVParser", "getRecords", new String[]{}, new String[]{}, false, 5, new String[][]{{"org.apache.commons.csv.CSVParser", "getRecordNumber", ""}});
  assertNotNull(actual);
  assertEquals("java.util.ArrayList", actual.getClass().getName());
  assertEquals("[[<a><b>t</b></a>]]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getCurrentLineNumber=0, getRecordNumber=1, isClosed=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput116() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.csv.CSVParser", "org.apache.commons.csv.CSVParser", "getRecords", new String[]{}, new String[]{}, false, 7, new String[][]{{"org.apache.commons.csv.CSVParser", "getRecordNumber", ""}});
  assertNotNull(actual);
  assertEquals("java.util.ArrayList", actual.getClass().getName());
  assertEquals("[[ x \t y ]]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getCurrentLineNumber=0, getRecordNumber=1, isClosed=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput117() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.csv.CSVParser", "org.apache.commons.csv.CSVParser", "getRecords", new String[]{}, new String[]{}, false, 9, new String[][]{{"org.apache.commons.csv.CSVParser", "getRecordNumber", ""}});
  assertNotNull(actual);
  assertEquals("java.util.ArrayList", actual.getClass().getName());
  assertEquals("[[]]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getCurrentLineNumber=1, getRecordNumber=1, isClosed=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput118() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.csv.CSVParser", "org.apache.commons.csv.CSVParser", "getRecords", new String[]{}, new String[]{}, false, 9, new String[][]{{"org.apache.commons.csv.CSVParser", "getRecordNumber", ""}}), new String[][]{{"subList", "int,int", "5"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IndexOutOfBoundsException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput119() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.csv.CSVParser", "org.apache.commons.csv.CSVParser", "parse", new String[]{"java.io.File", "java.nio.charset.Charset", "org.apache.commons.csv.CSVFormat"}, new String[]{"<null>", "<null>", "<sample:5>"}, true); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput120() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.csv.CSVParser", "org.apache.commons.csv.CSVParser", "getCurrentLineNumber", new String[]{}, new String[]{}, false, 22, new String[][]{{"org.apache.commons.csv.CSVParser", "getRecords", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.Long", actual.getClass().getName());
  assertEquals("2", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getCurrentLineNumber=2, getRecordNumber=3, isClosed=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput121() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.csv.CSVParser", "org.apache.commons.csv.CSVParser", "iterator", new String[]{}, new String[]{}, false, 7, new String[][]{{"org.apache.commons.csv.CSVParser", "iterator", ""}, {"org.apache.commons.csv.CSVParser", "isClosed", ""}});
  assertNotNull(actual);
  assertEquals("receiver state after the call", "{getCurrentLineNumber=0, getRecordNumber=0, isClosed=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput122() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.csv.CSVParser", "org.apache.commons.csv.CSVParser", "close", new String[]{}, new String[]{}, false, 5, new String[][]{{"org.apache.commons.csv.CSVParser", "getCurrentLineNumber", ""}, {"org.apache.commons.csv.CSVParser", "getRecords", ""}, {"org.apache.commons.csv.CSVParser", "iterator", ""}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getCurrentLineNumber=0, getRecordNumber=1, isClosed=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput123() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.csv.CSVParser", "org.apache.commons.csv.CSVParser", "getRecords", new String[]{"java.util.Collection"}, new String[]{"<sample:2>"}, false, 0, new String[][]{{"org.apache.commons.csv.CSVParser", "nextRecord", ""}});
  assertNotNull(actual);
  assertEquals("java.util.ArrayList", actual.getClass().getName());
  assertEquals("[0, sample, ]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getCurrentLineNumber=0, getRecordNumber=1, isClosed=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput124() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.csv.CSVParser", "org.apache.commons.csv.CSVParser", "getRecords", new String[]{"java.util.Collection"}, new String[]{"<null>"}, false, 0, new String[][]{{"org.apache.commons.csv.CSVParser", "nextRecord", ""}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getCurrentLineNumber=0, getRecordNumber=1, isClosed=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput125() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.csv.CSVParser", "org.apache.commons.csv.CSVParser", "getRecords", new String[]{"java.util.Collection"}, new String[]{"<sample:0>"}, false), new String[][]{{"removeAll", "java.util.Collection", "7"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getCurrentLineNumber=0, getRecordNumber=1, isClosed=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput126() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.csv.CSVParser", "org.apache.commons.csv.CSVParser", "getHeaderMap", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.csv.CSVParser", "nextRecord", ""}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getCurrentLineNumber=0, getRecordNumber=1, isClosed=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput127() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.csv.CSVParser", "org.apache.commons.csv.CSVParser", "getHeaderMap", new String[]{}, new String[]{}, false, 1, new String[][]{{"org.apache.commons.csv.CSVParser", "nextRecord", ""}, {"org.apache.commons.csv.CSVParser", "getHeaderMap", ""}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getCurrentLineNumber=1, getRecordNumber=1, isClosed=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput128() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.csv.CSVParser", "org.apache.commons.csv.CSVParser", "iterator", new String[]{}, new String[]{}, false, 6, new String[][]{{"org.apache.commons.csv.CSVParser", "getCurrentLineNumber", ""}, {"org.apache.commons.csv.CSVParser", "getRecordNumber", ""}}), new String[][]{{"next", "", "3"}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.csv.CSVRecord", actual.getClass().getName());
  assertEquals("[a] {getComment=null, getRecordNumber=1, isConsistent=true, size=1}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getCurrentLineNumber=0, getRecordNumber=1, isClosed=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput129() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.csv.CSVParser", "org.apache.commons.csv.CSVParser", "iterator", new String[]{}, new String[]{}, false, 7, new String[][]{{"org.apache.commons.csv.CSVParser", "getCurrentLineNumber", ""}, {"org.apache.commons.csv.CSVParser", "getRecordNumber", ""}}), new String[][]{{"next", "", "3"}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.csv.CSVRecord", actual.getClass().getName());
  assertEquals("[ x \t y ] {getComment=null, getRecordNumber=1, isConsistent=true, size=1}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getCurrentLineNumber=0, getRecordNumber=1, isClosed=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput130() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.csv.CSVParser", "org.apache.commons.csv.CSVParser", "iterator", new String[]{}, new String[]{}, false, 8, new String[][]{{"org.apache.commons.csv.CSVParser", "getCurrentLineNumber", ""}, {"org.apache.commons.csv.CSVParser", "getRecordNumber", ""}}), new String[][]{{"next", "", "3"}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.csv.CSVRecord", actual.getClass().getName());
  assertEquals("[a] {getComment=null, getRecordNumber=1, isConsistent=true, size=1}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getCurrentLineNumber=1, getRecordNumber=1, isClosed=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput131() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.csv.CSVParser", "org.apache.commons.csv.CSVParser", "iterator", new String[]{}, new String[]{}, false, 9, new String[][]{{"org.apache.commons.csv.CSVParser", "getCurrentLineNumber", ""}, {"org.apache.commons.csv.CSVParser", "getRecordNumber", ""}}), new String[][]{{"next", "", "3"}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.csv.CSVRecord", actual.getClass().getName());
  assertEquals("[] {getComment=null, getRecordNumber=1, isConsistent=true, size=1}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getCurrentLineNumber=1, getRecordNumber=1, isClosed=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput132() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.csv.CSVParser", "org.apache.commons.csv.CSVParser", "getRecords", new String[]{"java.util.Collection"}, new String[]{"<sample:2>"}, false), new String[][]{{"ensureCapacity", "int", "2"}});
  assertNotNull(actual);
  assertEquals("java.util.ArrayList", actual.getClass().getName());
  assertEquals("[0, sample, , [a]]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getCurrentLineNumber=0, getRecordNumber=1, isClosed=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput133() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.csv.CSVParser", "org.apache.commons.csv.CSVParser", "getRecords", new String[]{"java.util.Collection"}, new String[]{"<sample:3>"}, false), new String[][]{{"ensureCapacity", "int", "2"}});
  assertNotNull(actual);
  assertEquals("java.util.ArrayList", actual.getClass().getName());
  assertEquals("[sample, [a]]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getCurrentLineNumber=0, getRecordNumber=1, isClosed=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput134() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.csv.CSVParser", "org.apache.commons.csv.CSVParser", "getRecords", new String[]{"java.util.Collection"}, new String[]{"<sample:1>"}, false), new String[][]{{"ensureCapacity", "int", "2"}});
  assertNotNull(actual);
  assertEquals("java.util.ArrayList", actual.getClass().getName());
  assertEquals("[a, 0, [a]]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getCurrentLineNumber=0, getRecordNumber=1, isClosed=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput135() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.csv.CSVParser", "org.apache.commons.csv.CSVParser", "getRecords", new String[]{"java.util.Collection"}, new String[]{"<sample:4>"}, false), new String[][]{{"ensureCapacity", "int", "2"}});
  assertNotNull(actual);
  assertEquals("java.util.ArrayList", actual.getClass().getName());
  assertEquals("[, a, [a]]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getCurrentLineNumber=0, getRecordNumber=1, isClosed=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput136() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.csv.CSVParser", "org.apache.commons.csv.CSVParser", "getRecords", new String[]{"java.util.Collection"}, new String[]{"<sample:6>"}, false), new String[][]{{"ensureCapacity", "int", "2"}});
  assertNotNull(actual);
  assertEquals("java.util.ArrayList", actual.getClass().getName());
  assertEquals("[0, [a]]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getCurrentLineNumber=0, getRecordNumber=1, isClosed=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput137() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.csv.CSVParser", "org.apache.commons.csv.CSVParser", "getHeaderMap", new String[]{}, new String[]{}, false, 4, new String[][]{{"org.apache.commons.csv.CSVParser", "getRecordNumber", ""}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getCurrentLineNumber=0, getRecordNumber=0, isClosed=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput138() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.csv.CSVParser", "org.apache.commons.csv.CSVParser", "getRecords", new String[]{}, new String[]{}, false), new String[][]{{"listIterator", "", "6"}});
  assertNotNull(actual);
  assertEquals("java.util.ArrayList$ListItr", actual.getClass().getName());
  assertEquals("{hasNext=true, hasPrevious=false}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getCurrentLineNumber=0, getRecordNumber=1, isClosed=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput139() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.csv.CSVParser", "org.apache.commons.csv.CSVParser", "parse", new String[]{"java.lang.String", "org.apache.commons.csv.CSVFormat"}, new String[]{"reader", "<sample:2>"}, true), new String[][]{{"getRecords", "java.util.Collection", "5"}, {"isEmpty", "", "6"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput140() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.csv.CSVParser", "org.apache.commons.csv.CSVParser", "parse", new String[]{"java.lang.String", "org.apache.commons.csv.CSVFormat"}, new String[]{"reade", "<sample:3>"}, true), new String[][]{{"getRecords", "java.util.Collection", "5"}});
  assertNotNull(actual);
  assertEquals("java.util.ArrayList", actual.getClass().getName());
  assertEquals("[a, 0, sample, [reade]]", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput141() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.csv.CSVParser", "org.apache.commons.csv.CSVParser", "parse", new String[]{"java.lang.String", "org.apache.commons.csv.CSVFormat"}, new String[]{"reade", "<sample:3>"}, true), new String[][]{{"getRecords", "java.util.Collection", "1"}});
  assertNotNull(actual);
  assertEquals("java.util.ArrayList", actual.getClass().getName());
  assertEquals("[a, 0, [reade]]", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput142() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.csv.CSVParser", "org.apache.commons.csv.CSVParser", "parse", new String[]{"java.lang.String", "org.apache.commons.csv.CSVFormat"}, new String[]{"rea", "<sample:2>"}, true), new String[][]{{"getRecords", "java.util.Collection", "1"}});
  assertNotNull(actual);
  assertEquals("java.util.ArrayList", actual.getClass().getName());
  assertEquals("[a, 0, [rea]]", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput143() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.csv.CSVParser", "org.apache.commons.csv.CSVParser", "parse", new String[]{"java.lang.String", "org.apache.commons.csv.CSVFormat"}, new String[]{"qea", "<sample:7>"}, true), new String[][]{{"getRecords", "java.util.Collection", "1"}});
  assertNotNull(actual);
  assertEquals("java.util.ArrayList", actual.getClass().getName());
  assertEquals("[a, 0, [qea]]", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput144() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.csv.CSVParser", "org.apache.commons.csv.CSVParser", "getRecords", new String[]{"java.util.Collection"}, new String[]{"<sample:3>"}, false, 2, new String[][]{{"org.apache.commons.csv.CSVParser", "getHeaderMap", ""}, {"org.apache.commons.csv.CSVParser", "getRecordNumber", ""}});
  assertNotNull(actual);
  assertEquals("java.util.ArrayList", actual.getClass().getName());
  assertEquals("[sample, [a], [b]]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getCurrentLineNumber=2, getRecordNumber=2, isClosed=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput145() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.csv.CSVParser", "org.apache.commons.csv.CSVParser", "getRecords", new String[]{"java.util.Collection"}, new String[]{"<sample:0>"}, false, 3, new String[][]{{"org.apache.commons.csv.CSVParser", "getHeaderMap", ""}, {"org.apache.commons.csv.CSVParser", "getRecordNumber", ""}});
  assertNotNull(actual);
  assertEquals("java.util.ArrayList", actual.getClass().getName());
  assertEquals("[, [a], [b]]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getCurrentLineNumber=1, getRecordNumber=2, isClosed=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput146() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.csv.CSVParser", "org.apache.commons.csv.CSVParser", "getRecords", new String[]{"java.util.Collection"}, new String[]{"<sample:1>"}, false, 9, new String[][]{{"org.apache.commons.csv.CSVParser", "getHeaderMap", ""}, {"org.apache.commons.csv.CSVParser", "getRecordNumber", ""}, {"org.apache.commons.csv.CSVParser", "isClosed", ""}});
  assertNotNull(actual);
  assertEquals("java.util.ArrayList", actual.getClass().getName());
  assertEquals("[a, 0, []]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getCurrentLineNumber=1, getRecordNumber=1, isClosed=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput147() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.csv.CSVParser", "org.apache.commons.csv.CSVParser", "iterator", new String[]{}, new String[]{}, false, 4, new String[][]{{"org.apache.commons.csv.CSVParser", "nextRecord", ""}}), new String[][]{{"hasNext", "", "1"}, {"remove", "", "1"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.UnsupportedOperationException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput148() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.csv.CSVParser", "org.apache.commons.csv.CSVParser", "parse", new String[]{"java.lang.String", "org.apache.commons.csv.CSVFormat"}, new String[]{"Title", "<null>"}, true); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput149() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.csv.CSVParser", "org.apache.commons.csv.CSVParser", "iterator", new String[]{}, new String[]{}, false), new String[][]{{"hasNext", "", "0"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getCurrentLineNumber=0, getRecordNumber=1, isClosed=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput150() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.csv.CSVParser", "org.apache.commons.csv.CSVParser", "getCurrentLineNumber", new String[]{}, new String[]{}, false, 32, new String[][]{{"org.apache.commons.csv.CSVParser", "isClosed", ""}, {"org.apache.commons.csv.CSVParser", "getRecords", ""}, {"org.apache.commons.csv.CSVParser", "getRecords", "java.util.Collection", "<sample:2>"}});
  assertNotNull(actual);
  assertEquals("java.lang.Long", actual.getClass().getName());
  assertEquals("1", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getCurrentLineNumber=1, getRecordNumber=2, isClosed=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput151() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.csv.CSVParser", "org.apache.commons.csv.CSVParser", "nextRecord", new String[]{}, new String[]{}, false), new String[][]{{"iterator", "", "7"}});
  assertNotNull(actual);
  assertEquals("java.util.Arrays$ArrayItr", actual.getClass().getName());
  assertEquals("{hasNext=true}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getCurrentLineNumber=0, getRecordNumber=1, isClosed=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput152() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.csv.CSVParser", "org.apache.commons.csv.CSVParser", "parse", new String[]{"java.lang.String", "org.apache.commons.csv.CSVFormat"}, new String[]{"null", "<sample:1>"}, true);
  assertNotNull(actual);
  assertEquals("org.apache.commons.csv.CSVParser", actual.getClass().getName());
  assertEquals("{getCurrentLineNumber=0, getRecordNumber=0, isClosed=false}", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput153() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.csv.CSVParser", "org.apache.commons.csv.CSVParser", "close", new String[]{}, new String[]{}, false, 8, new String[][]{{"org.apache.commons.csv.CSVParser", "getRecordNumber", ""}, {"org.apache.commons.csv.CSVParser", "getRecords", "java.util.Collection", "<sample:1>"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getCurrentLineNumber=1, getRecordNumber=2, isClosed=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput154() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.csv.CSVParser", "org.apache.commons.csv.CSVParser", "close", new String[]{}, new String[]{}, false, 9, new String[][]{{"org.apache.commons.csv.CSVParser", "getRecordNumber", ""}, {"org.apache.commons.csv.CSVParser", "getRecords", "java.util.Collection", "<sample:1>"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getCurrentLineNumber=1, getRecordNumber=1, isClosed=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput155() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.csv.CSVParser", "org.apache.commons.csv.CSVParser", "close", new String[]{}, new String[]{}, false, 10, new String[][]{{"org.apache.commons.csv.CSVParser", "getRecordNumber", ""}, {"org.apache.commons.csv.CSVParser", "getRecords", "java.util.Collection", "<sample:1>"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getCurrentLineNumber=2, getRecordNumber=2, isClosed=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput156() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.csv.CSVParser", "org.apache.commons.csv.CSVParser", "getHeaderMap", new String[]{}, new String[]{}, false, 2, new String[][]{{"org.apache.commons.csv.CSVParser", "nextRecord", ""}, {"org.apache.commons.csv.CSVParser", "nextRecord", ""}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getCurrentLineNumber=2, getRecordNumber=2, isClosed=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput157() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.csv.CSVParser", "org.apache.commons.csv.CSVParser", "getHeaderMap", new String[]{}, new String[]{}, false, 3, new String[][]{{"org.apache.commons.csv.CSVParser", "nextRecord", ""}, {"org.apache.commons.csv.CSVParser", "nextRecord", ""}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getCurrentLineNumber=1, getRecordNumber=2, isClosed=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput158() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.csv.CSVParser", "org.apache.commons.csv.CSVParser", "isClosed", new String[]{}, new String[]{}, false, 7, new String[][]{{"org.apache.commons.csv.CSVParser", "getRecords", "java.util.Collection", "<empty>"}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getCurrentLineNumber=0, getRecordNumber=1, isClosed=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput159() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.csv.CSVParser", "org.apache.commons.csv.CSVParser", "isClosed", new String[]{}, new String[]{}, false, 8, new String[][]{{"org.apache.commons.csv.CSVParser", "getRecords", "java.util.Collection", "<sample:0>"}, {"org.apache.commons.csv.CSVParser", "getCurrentLineNumber", ""}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getCurrentLineNumber=1, getRecordNumber=2, isClosed=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput160() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.csv.CSVParser", "org.apache.commons.csv.CSVParser", "isClosed", new String[]{}, new String[]{}, false, 9, new String[][]{{"org.apache.commons.csv.CSVParser", "getRecords", "java.util.Collection", "<sample:2>"}, {"org.apache.commons.csv.CSVParser", "getCurrentLineNumber", ""}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getCurrentLineNumber=1, getRecordNumber=1, isClosed=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput161() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.csv.CSVParser", "org.apache.commons.csv.CSVParser", "isClosed", new String[]{}, new String[]{}, false, 14, new String[][]{{"org.apache.commons.csv.CSVParser", "getRecords", "java.util.Collection", "<sample:1>"}, {"org.apache.commons.csv.CSVParser", "getCurrentLineNumber", ""}, {"org.apache.commons.csv.CSVParser", "getHeaderMap", ""}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getCurrentLineNumber=2, getRecordNumber=2, isClosed=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput162() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.csv.CSVParser", "org.apache.commons.csv.CSVParser", "iterator", new String[]{}, new String[]{}, false), new String[][]{{"next", "", "1"}, {"isMapped", "java.lang.String", "3"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getCurrentLineNumber=0, getRecordNumber=1, isClosed=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput163() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.csv.CSVParser", "org.apache.commons.csv.CSVParser", "iterator", new String[]{}, new String[]{}, false, 0, null, 2), new String[][]{{"next", "", "1"}, {"isMapped", "java.lang.String", "3"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getCurrentLineNumber=0, getRecordNumber=1, isClosed=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput164() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.csv.CSVParser", "org.apache.commons.csv.CSVParser", "iterator", new String[]{}, new String[]{}, false, 1, new String[][]{}, 2), new String[][]{{"next", "", "1"}, {"isMapped", "java.lang.String", "3"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getCurrentLineNumber=1, getRecordNumber=1, isClosed=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput165() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.csv.CSVParser", "org.apache.commons.csv.CSVParser", "iterator", new String[]{}, new String[]{}, false, 4, new String[][]{}, 2), new String[][]{{"next", "", "1"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.util.NoSuchElementException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput166() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.csv.CSVParser", "org.apache.commons.csv.CSVParser", "iterator", new String[]{}, new String[]{}, false, 14, new String[][]{{"org.apache.commons.csv.CSVParser", "nextRecord", ""}, {"org.apache.commons.csv.CSVParser", "isClosed", ""}}, 2), new String[][]{{"next", "", "1"}, {"isMapped", "java.lang.String", "3"}, {"isSet", "java.lang.String", "6"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getCurrentLineNumber=2, getRecordNumber=2, isClosed=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput167() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.csv.CSVParser", "org.apache.commons.csv.CSVParser", "iterator", new String[]{}, new String[]{}, false, 15, new String[][]{{"org.apache.commons.csv.CSVParser", "nextRecord", ""}, {"org.apache.commons.csv.CSVParser", "isClosed", ""}}, 2), new String[][]{{"next", "", "1"}, {"isMapped", "java.lang.String", "3"}, {"isSet", "java.lang.String", "6"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getCurrentLineNumber=1, getRecordNumber=2, isClosed=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput168() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.csv.CSVParser", "org.apache.commons.csv.CSVParser", "getCurrentLineNumber", new String[]{}, new String[]{}, false, 2, new String[][]{{"org.apache.commons.csv.CSVParser", "getRecords", "java.util.Collection", "<sample:0>"}, {"org.apache.commons.csv.CSVParser", "iterator", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.Long", actual.getClass().getName());
  assertEquals("2", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getCurrentLineNumber=2, getRecordNumber=2, isClosed=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput169() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.csv.CSVParser", "org.apache.commons.csv.CSVParser", "getRecords", new String[]{"java.util.Collection"}, new String[]{"<sample:2>"}, false, 0, null, 3);
  assertNotNull(actual);
  assertEquals("java.util.ArrayList", actual.getClass().getName());
  assertEquals("[0, sample, , [a]]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getCurrentLineNumber=0, getRecordNumber=1, isClosed=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput170() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.csv.CSVParser", "org.apache.commons.csv.CSVParser", "getRecords", new String[]{"java.util.Collection"}, new String[]{"<sample:2>"}, false, 0, null, 3), new String[][]{{"addAll", "java.util.Collection", "0"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getCurrentLineNumber=0, getRecordNumber=1, isClosed=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput171() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.csv.CSVParser", "org.apache.commons.csv.CSVParser", "getRecords", new String[]{"java.util.Collection"}, new String[]{"<sample:1>"}, false, 11, new String[][]{}, 3), new String[][]{{"addAll", "java.util.Collection", "0"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getCurrentLineNumber=0, getRecordNumber=0, isClosed=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput172() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.csv.CSVParser", "org.apache.commons.csv.CSVParser", "getRecords", new String[]{"java.util.Collection"}, new String[]{"<null>"}, false, 11, new String[][]{}, 3);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getCurrentLineNumber=0, getRecordNumber=0, isClosed=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput173() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.csv.CSVParser", "org.apache.commons.csv.CSVParser", "isClosed", new String[]{}, new String[]{}, false, 2, new String[][]{{"org.apache.commons.csv.CSVParser", "isClosed", ""}, {"org.apache.commons.csv.CSVParser", "getRecords", "java.util.Collection", "<sample:3>"}, {"org.apache.commons.csv.CSVParser", "nextRecord", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getCurrentLineNumber=2, getRecordNumber=2, isClosed=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput174() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.csv.CSVParser", "org.apache.commons.csv.CSVParser", "isClosed", new String[]{}, new String[]{}, false, 8, new String[][]{{"org.apache.commons.csv.CSVParser", "isClosed", ""}, {"org.apache.commons.csv.CSVParser", "nextRecord", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getCurrentLineNumber=1, getRecordNumber=1, isClosed=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput175() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.csv.CSVParser", "org.apache.commons.csv.CSVParser", "getRecordNumber", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.csv.CSVParser", "close", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.Long", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getCurrentLineNumber=0, getRecordNumber=0, isClosed=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput176() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.csv.CSVParser", "org.apache.commons.csv.CSVParser", "getRecordNumber", new String[]{}, new String[]{}, false, 4, new String[][]{{"org.apache.commons.csv.CSVParser", "close", ""}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Long", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getCurrentLineNumber=0, getRecordNumber=0, isClosed=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput177() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.csv.CSVParser", "org.apache.commons.csv.CSVParser", "iterator", new String[]{}, new String[]{}, false, 5, new String[][]{{"org.apache.commons.csv.CSVParser", "getRecordNumber", ""}}, 2), new String[][]{{"hasNext", "", "4"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getCurrentLineNumber=0, getRecordNumber=1, isClosed=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput178() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.csv.CSVParser", "org.apache.commons.csv.CSVParser", "iterator", new String[]{}, new String[]{}, false, 12, new String[][]{}, 3);
  assertNotNull(actual);
  assertEquals("receiver state after the call", "{getCurrentLineNumber=0, getRecordNumber=0, isClosed=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput179() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.csv.CSVParser", "org.apache.commons.csv.CSVParser", "iterator", new String[]{}, new String[]{}, false, 14, new String[][]{{"org.apache.commons.csv.CSVParser", "getRecords", ""}}, 3);
  assertNotNull(actual);
  assertEquals("receiver state after the call", "{getCurrentLineNumber=2, getRecordNumber=2, isClosed=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput180() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.csv.CSVParser", "org.apache.commons.csv.CSVParser", "parse", new String[]{"java.io.File", "java.nio.charset.Charset", "org.apache.commons.csv.CSVFormat"}, new String[]{"<sample:1>", "<sample:2>", "<sample:4>"}, true, 0, null, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.io.FileNotFoundException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput181() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.csv.CSVParser", "org.apache.commons.csv.CSVParser", "getRecordNumber", new String[]{}, new String[]{}, false, 2, new String[][]{{"org.apache.commons.csv.CSVParser", "getRecordNumber", ""}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Long", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getCurrentLineNumber=0, getRecordNumber=0, isClosed=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput182() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.csv.CSVParser", "org.apache.commons.csv.CSVParser", "iterator", new String[]{}, new String[]{}, false), new String[][]{{"next", "", "5"}, {"get", "int", "7"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.ArrayIndexOutOfBoundsException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput183() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.csv.CSVParser", "org.apache.commons.csv.CSVParser", "parse", new String[]{"java.net.URL", "java.nio.charset.Charset", "org.apache.commons.csv.CSVFormat"}, new String[]{"<sample:5>", "<sample:1>", "<null>"}, true); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput184() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.csv.CSVParser", "org.apache.commons.csv.CSVParser", "getRecords", new String[]{}, new String[]{}, false, 7, new String[][]{}, 2), new String[][]{{"size", "", "5"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("1", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getCurrentLineNumber=0, getRecordNumber=1, isClosed=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput185() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.csv.CSVParser", "org.apache.commons.csv.CSVParser", "getRecords", new String[]{}, new String[]{}, false, 8, new String[][]{}, 2), new String[][]{{"size", "", "5"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("2", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getCurrentLineNumber=1, getRecordNumber=2, isClosed=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput186() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.csv.CSVParser", "org.apache.commons.csv.CSVParser", "getRecords", new String[]{}, new String[]{}, false, 9, new String[][]{}, 2), new String[][]{{"size", "", "5"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("1", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getCurrentLineNumber=1, getRecordNumber=1, isClosed=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput187() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.csv.CSVParser", "org.apache.commons.csv.CSVParser", "getRecords", new String[]{}, new String[]{}, false, 9, new String[][]{}, 2), new String[][]{{"size", "", "5"}, {"ensureCapacity", "int", "3"}});
  assertNotNull(actual);
  assertEquals("java.util.ArrayList", actual.getClass().getName());
  assertEquals("[[]]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getCurrentLineNumber=1, getRecordNumber=1, isClosed=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput188() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.csv.CSVParser", "org.apache.commons.csv.CSVParser", "getRecords", new String[]{}, new String[]{}, false, 11, new String[][]{{"org.apache.commons.csv.CSVParser", "getCurrentLineNumber", ""}}, 2), new String[][]{{"size", "", "5"}, {"ensureCapacity", "int", "3"}});
  assertNotNull(actual);
  assertEquals("java.util.ArrayList", actual.getClass().getName());
  assertEquals("[]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getCurrentLineNumber=0, getRecordNumber=0, isClosed=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput189() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.csv.CSVParser", "org.apache.commons.csv.CSVParser", "iterator", new String[]{}, new String[]{}, false, 2, new String[][]{{"org.apache.commons.csv.CSVParser", "getRecordNumber", ""}, {"org.apache.commons.csv.CSVParser", "getRecords", "java.util.Collection", "<null>"}}), new String[][]{{"hasNext", "", "7"}, {"next", "", "5"}, {"get", "java.lang.Enum", "5"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput190() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.csv.CSVParser", "org.apache.commons.csv.CSVParser", "parse", new String[]{"java.io.File", "java.nio.charset.Charset", "org.apache.commons.csv.CSVFormat"}, new String[]{"<null>", "<sample:1>", "<sample:2>"}, true, 0, null, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput191() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.csv.CSVParser", "org.apache.commons.csv.CSVParser", "parse", new String[]{"java.io.File", "java.nio.charset.Charset", "org.apache.commons.csv.CSVFormat"}, new String[]{"<sample:1>", "<sample:1>", "<sample:2>"}, true, 0, null, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.io.FileNotFoundException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput192() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.csv.CSVParser", "org.apache.commons.csv.CSVParser", "iterator", new String[]{}, new String[]{}, false, 3, new String[][]{{"org.apache.commons.csv.CSVParser", "getRecords", ""}}), new String[][]{{"hasNext", "", "1"}, {"hasNext", "", "6"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getCurrentLineNumber=1, getRecordNumber=2, isClosed=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput193() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.csv.CSVParser", "org.apache.commons.csv.CSVParser", "iterator", new String[]{}, new String[]{}, false, 10, new String[][]{{"org.apache.commons.csv.CSVParser", "getRecords", ""}}), new String[][]{{"hasNext", "", "6"}, {"hasNext", "", "6"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getCurrentLineNumber=2, getRecordNumber=2, isClosed=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput194() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.csv.CSVParser", "org.apache.commons.csv.CSVParser", "iterator", new String[]{}, new String[]{}, false, 22, new String[][]{{"org.apache.commons.csv.CSVParser", "getRecords", ""}, {"org.apache.commons.csv.CSVParser", "getRecords", ""}}), new String[][]{{"hasNext", "", "6"}, {"hasNext", "", "6"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getCurrentLineNumber=2, getRecordNumber=3, isClosed=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput195() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.csv.CSVParser", "org.apache.commons.csv.CSVParser", "parse", new String[]{"java.lang.String", "org.apache.commons.csv.CSVFormat"}, new String[]{"1E-5", "<sample:7>"}, true, 0, null, 2);
  assertNotNull(actual);
  assertEquals("org.apache.commons.csv.CSVParser", actual.getClass().getName());
  assertEquals("{getCurrentLineNumber=0, getRecordNumber=0, isClosed=false}", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput196() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.csv.CSVParser", "org.apache.commons.csv.CSVParser", "iterator", new String[]{}, new String[]{}, false, 1, new String[][]{{"org.apache.commons.csv.CSVParser", "nextRecord", ""}}, 2), new String[][]{{"next", "", "4"}, {"getComment", "", "5"}, {"getComment", "", "2"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getCurrentLineNumber=1, getRecordNumber=2, isClosed=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput197() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.csv.CSVParser", "org.apache.commons.csv.CSVParser", "iterator", new String[]{}, new String[]{}, false, 2, new String[][]{{"org.apache.commons.csv.CSVParser", "nextRecord", ""}}, 2), new String[][]{{"next", "", "4"}, {"getComment", "", "5"}, {"getComment", "", "2"}, {"toMap", "", "4"}});
  assertNotNull(actual);
  assertEquals("java.util.HashMap", actual.getClass().getName());
  assertEquals("{}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getCurrentLineNumber=2, getRecordNumber=2, isClosed=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput198() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.csv.CSVParser", "org.apache.commons.csv.CSVParser", "isClosed", new String[]{}, new String[]{}, false, 1, new String[][]{}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getCurrentLineNumber=0, getRecordNumber=0, isClosed=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput199() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.csv.CSVParser", "org.apache.commons.csv.CSVParser", "isClosed", new String[]{}, new String[]{}, false, 1, new String[][]{{"org.apache.commons.csv.CSVParser", "getRecords", "java.util.Collection", "<empty>"}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getCurrentLineNumber=1, getRecordNumber=2, isClosed=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput200() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.csv.CSVParser", "org.apache.commons.csv.CSVParser", "isClosed", new String[]{}, new String[]{}, false, 2, new String[][]{{"org.apache.commons.csv.CSVParser", "getRecords", "java.util.Collection", "<empty>"}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getCurrentLineNumber=2, getRecordNumber=2, isClosed=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput201() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.csv.CSVParser", "org.apache.commons.csv.CSVParser", "getRecords", new String[]{"java.util.Collection"}, new String[]{"<sample:5>"}, false, 0, new String[][]{{"org.apache.commons.csv.CSVParser", "isClosed", ""}}, 3), new String[][]{{"remove", "java.lang.Object", "5"}, {"clear", "", "1"}, {"contains", "java.lang.Object", "7"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getCurrentLineNumber=0, getRecordNumber=1, isClosed=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput202() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.csv.CSVParser", "org.apache.commons.csv.CSVParser", "getRecords", new String[]{"java.util.Collection"}, new String[]{"<sample:5>"}, false, 6, new String[][]{{"org.apache.commons.csv.CSVParser", "isClosed", ""}, {"org.apache.commons.csv.CSVParser", "getRecordNumber", ""}}, 3), new String[][]{{"remove", "java.lang.Object", "5"}, {"clear", "", "1"}});
  assertNotNull(actual);
  assertEquals("java.util.ArrayList", actual.getClass().getName());
  assertEquals("[]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getCurrentLineNumber=0, getRecordNumber=1, isClosed=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput203() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.csv.CSVParser", "org.apache.commons.csv.CSVParser", "getRecords", new String[]{"java.util.Collection"}, new String[]{"<null>"}, false, 6, new String[][]{{"org.apache.commons.csv.CSVParser", "isClosed", ""}, {"org.apache.commons.csv.CSVParser", "getRecordNumber", ""}}, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput204() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.csv.CSVParser", "org.apache.commons.csv.CSVParser", "getRecords", new String[]{"java.util.Collection"}, new String[]{"<sample:6>"}, false, 6, new String[][]{{"org.apache.commons.csv.CSVParser", "isClosed", ""}}, 3), new String[][]{{"remove", "java.lang.Object", "5"}, {"clear", "", "1"}, {"addAll", "int,java.util.Collection", "1"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IndexOutOfBoundsException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput205() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.csv.CSVParser", "org.apache.commons.csv.CSVParser", "iterator", new String[]{}, new String[]{}, false, 5, new String[][]{}, 2), new String[][]{{"next", "", "1"}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.csv.CSVRecord", actual.getClass().getName());
  assertEquals("[<a><b>t</b></a>] {getComment=null, getRecordNumber=1, isConsistent=true, size=1}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getCurrentLineNumber=0, getRecordNumber=1, isClosed=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput206() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.csv.CSVParser", "org.apache.commons.csv.CSVParser", "iterator", new String[]{}, new String[]{}, false, 6, new String[][]{}, 2), new String[][]{{"next", "", "1"}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.csv.CSVRecord", actual.getClass().getName());
  assertEquals("[a] {getComment=null, getRecordNumber=1, isConsistent=true, size=1}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getCurrentLineNumber=0, getRecordNumber=1, isClosed=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput207() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.csv.CSVParser", "org.apache.commons.csv.CSVParser", "iterator", new String[]{}, new String[]{}, false, 14, new String[][]{}), new String[][]{{"next", "", "1"}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.csv.CSVRecord", actual.getClass().getName());
  assertEquals("[a,b] {getComment=null, getRecordNumber=1, isConsistent=true, size=1}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getCurrentLineNumber=1, getRecordNumber=1, isClosed=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput208() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.csv.CSVParser", "org.apache.commons.csv.CSVParser", "getCurrentLineNumber", new String[]{}, new String[]{}, false, 3, new String[][]{{"org.apache.commons.csv.CSVParser", "getRecords", ""}, {"org.apache.commons.csv.CSVParser", "iterator", ""}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Long", actual.getClass().getName());
  assertEquals("1", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getCurrentLineNumber=1, getRecordNumber=2, isClosed=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput209() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.csv.CSVParser", "org.apache.commons.csv.CSVParser", "getCurrentLineNumber", new String[]{}, new String[]{}, false, 4, new String[][]{{"org.apache.commons.csv.CSVParser", "getRecords", ""}, {"org.apache.commons.csv.CSVParser", "iterator", ""}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Long", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getCurrentLineNumber=0, getRecordNumber=0, isClosed=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput210() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.csv.CSVParser", "org.apache.commons.csv.CSVParser", "getCurrentLineNumber", new String[]{}, new String[]{}, false, 5, new String[][]{{"org.apache.commons.csv.CSVParser", "getRecords", ""}, {"org.apache.commons.csv.CSVParser", "iterator", ""}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Long", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getCurrentLineNumber=0, getRecordNumber=1, isClosed=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput211() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.csv.CSVParser", "org.apache.commons.csv.CSVParser", "getHeaderMap", new String[]{}, new String[]{}, false, 3, new String[][]{{"org.apache.commons.csv.CSVParser", "getRecords", "java.util.Collection", "<sample:0>"}}, 2);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getCurrentLineNumber=1, getRecordNumber=2, isClosed=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput212() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.csv.CSVParser", "org.apache.commons.csv.CSVParser", "nextRecord", new String[]{}, new String[]{}, false, 3, new String[][]{{"org.apache.commons.csv.CSVParser", "getRecordNumber", ""}}, 2);
  assertNotNull(actual);
  assertEquals("org.apache.commons.csv.CSVRecord", actual.getClass().getName());
  assertEquals("[a] {getComment=null, getRecordNumber=1, isConsistent=true, size=1}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getCurrentLineNumber=1, getRecordNumber=1, isClosed=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput213() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.csv.CSVParser", "org.apache.commons.csv.CSVParser", "nextRecord", new String[]{}, new String[]{}, false, 5, new String[][]{{"org.apache.commons.csv.CSVParser", "getHeaderMap", ""}, {"org.apache.commons.csv.CSVParser", "getRecordNumber", ""}}, 2);
  assertNotNull(actual);
  assertEquals("org.apache.commons.csv.CSVRecord", actual.getClass().getName());
  assertEquals("[<a><b>t</b></a>] {getComment=null, getRecordNumber=1, isConsistent=true, size=1}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getCurrentLineNumber=0, getRecordNumber=1, isClosed=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput214() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.csv.CSVParser", "org.apache.commons.csv.CSVParser", "nextRecord", new String[]{}, new String[]{}, false, 5, new String[][]{{"org.apache.commons.csv.CSVParser", "close", ""}}, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.io.IOException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput215() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.csv.CSVParser", "org.apache.commons.csv.CSVParser", "nextRecord", new String[]{}, new String[]{}, false, 10, new String[][]{{"org.apache.commons.csv.CSVParser", "getRecordNumber", ""}, {"org.apache.commons.csv.CSVParser", "iterator", ""}}, 2), new String[][]{{"isSet", "java.lang.String", "6"}, {"size", "", "2"}, {"toMap", "", "1"}, {"getOrDefault", "java.lang.Object,java.lang.Object", "5"}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getCurrentLineNumber=1, getRecordNumber=1, isClosed=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput216() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.csv.CSVParser", "org.apache.commons.csv.CSVParser", "nextRecord", new String[]{}, new String[]{}, false, 3, new String[][]{{"org.apache.commons.csv.CSVParser", "getRecordNumber", ""}, {"org.apache.commons.csv.CSVParser", "iterator", ""}}, 2), new String[][]{{"isMapped", "java.lang.String", "6"}, {"size", "", "2"}, {"toMap", "", "1"}});
  assertNotNull(actual);
  assertEquals("java.util.HashMap", actual.getClass().getName());
  assertEquals("{}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getCurrentLineNumber=1, getRecordNumber=1, isClosed=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput217() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.csv.CSVParser", "org.apache.commons.csv.CSVParser", "getRecords", new String[]{}, new String[]{}, false, 3, new String[][]{{"org.apache.commons.csv.CSVParser", "getRecords", "java.util.Collection", "<sample:3>"}, {"org.apache.commons.csv.CSVParser", "getRecordNumber", ""}}, 2), new String[][]{{"isEmpty", "", "4"}, {"listIterator", "int", "6"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IndexOutOfBoundsException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput218() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.csv.CSVParser", "org.apache.commons.csv.CSVParser", "getRecords", new String[]{}, new String[]{}, false, 3, new String[][]{{"org.apache.commons.csv.CSVParser", "getRecords", "java.util.Collection", "<sample:3>"}, {"org.apache.commons.csv.CSVParser", "getRecordNumber", ""}, {"org.apache.commons.csv.CSVParser", "getRecordNumber", ""}}, 2), new String[][]{{"isEmpty", "", "4"}, {"clone", "", "6"}, {"remove", "java.lang.Object", "6"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getCurrentLineNumber=1, getRecordNumber=2, isClosed=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput219() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.csv.CSVParser", "org.apache.commons.csv.CSVParser", "getRecords", new String[]{}, new String[]{}, false, 4, new String[][]{{"org.apache.commons.csv.CSVParser", "getRecordNumber", ""}, {"org.apache.commons.csv.CSVParser", "getRecordNumber", ""}}, 2), new String[][]{{"isEmpty", "", "4"}, {"clone", "", "6"}, {"remove", "java.lang.Object", "6"}, {"add", "java.lang.Object", "6"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getCurrentLineNumber=0, getRecordNumber=0, isClosed=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput220() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.csv.CSVParser", "org.apache.commons.csv.CSVParser", "getRecords", new String[]{}, new String[]{}, false, 13, new String[][]{}, 1), new String[][]{{"isEmpty", "", "4"}, {"clone", "", "6"}});
  assertNotNull(actual);
  assertEquals("java.util.ArrayList", actual.getClass().getName());
  assertEquals("[[a], [b]]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getCurrentLineNumber=1, getRecordNumber=2, isClosed=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput221() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.csv.CSVParser", "org.apache.commons.csv.CSVParser", "isClosed", new String[]{}, new String[]{}, false, 2, new String[][]{{"org.apache.commons.csv.CSVParser", "iterator", ""}, {"org.apache.commons.csv.CSVParser", "close", ""}, {"org.apache.commons.csv.CSVParser", "getRecords", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getCurrentLineNumber=0, getRecordNumber=0, isClosed=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput222() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.csv.CSVParser", "org.apache.commons.csv.CSVParser", "isClosed", new String[]{}, new String[]{}, false, 5, new String[][]{{"org.apache.commons.csv.CSVParser", "getRecords", ""}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getCurrentLineNumber=0, getRecordNumber=1, isClosed=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput223() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.csv.CSVParser", "org.apache.commons.csv.CSVParser", "isClosed", new String[]{}, new String[]{}, false, 6, new String[][]{}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getCurrentLineNumber=0, getRecordNumber=0, isClosed=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput224() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.csv.CSVParser", "org.apache.commons.csv.CSVParser", "nextRecord", new String[]{}, new String[]{}, false, 6, new String[][]{{"org.apache.commons.csv.CSVParser", "getHeaderMap", ""}, {"org.apache.commons.csv.CSVParser", "close", ""}}, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.io.IOException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput225() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.csv.CSVParser", "org.apache.commons.csv.CSVParser", "parse", new String[]{"java.net.URL", "java.nio.charset.Charset", "org.apache.commons.csv.CSVFormat"}, new String[]{"<sample:0>", "<sample:0>", "<sample:4>"}, true, 0, null, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput226() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.csv.CSVParser", "org.apache.commons.csv.CSVParser", "getCurrentLineNumber", new String[]{}, new String[]{}, false, 10, new String[][]{{"org.apache.commons.csv.CSVParser", "getRecords", "java.util.Collection", "<sample:1>"}, {"org.apache.commons.csv.CSVParser", "getHeaderMap", ""}, {"org.apache.commons.csv.CSVParser", "getHeaderMap", ""}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Long", actual.getClass().getName());
  assertEquals("2", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getCurrentLineNumber=2, getRecordNumber=2, isClosed=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput227() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.csv.CSVParser", "org.apache.commons.csv.CSVParser", "getCurrentLineNumber", new String[]{}, new String[]{}, false, 12, new String[][]{{"org.apache.commons.csv.CSVParser", "getRecords", "java.util.Collection", "<sample:1>"}, {"org.apache.commons.csv.CSVParser", "getHeaderMap", ""}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Long", actual.getClass().getName());
  assertEquals("1", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getCurrentLineNumber=1, getRecordNumber=2, isClosed=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput228() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.csv.CSVParser", "org.apache.commons.csv.CSVParser", "getCurrentLineNumber", new String[]{}, new String[]{}, false, 16, new String[][]{{"org.apache.commons.csv.CSVParser", "getRecords", "java.util.Collection", "<sample:1>"}, {"org.apache.commons.csv.CSVParser", "getHeaderMap", ""}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Long", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getCurrentLineNumber=0, getRecordNumber=1, isClosed=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput229() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.csv.CSVParser", "org.apache.commons.csv.CSVParser", "getCurrentLineNumber", new String[]{}, new String[]{}, false, 22, new String[][]{{"org.apache.commons.csv.CSVParser", "getCurrentLineNumber", ""}, {"org.apache.commons.csv.CSVParser", "getRecords", "java.util.Collection", "<sample:0>"}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Long", actual.getClass().getName());
  assertEquals("2", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getCurrentLineNumber=2, getRecordNumber=3, isClosed=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput230() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.csv.CSVParser", "org.apache.commons.csv.CSVParser", "iterator", new String[]{}, new String[]{}, false, 6, new String[][]{}, 3), new String[][]{{"remove", "", "7"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.UnsupportedOperationException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput231() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.csv.CSVParser", "org.apache.commons.csv.CSVParser", "parse", new String[]{"java.io.File", "java.nio.charset.Charset", "org.apache.commons.csv.CSVFormat"}, new String[]{"<null>", "<null>", "<sample:1>"}, true, 0, null, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput232() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.csv.CSVParser", "org.apache.commons.csv.CSVParser", "getRecords", new String[]{}, new String[]{}, false, 22, new String[][]{{"org.apache.commons.csv.CSVParser", "getRecords", ""}, {"org.apache.commons.csv.CSVParser", "iterator", ""}});
  assertNotNull(actual);
  assertEquals("java.util.ArrayList", actual.getClass().getName());
  assertEquals("[]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getCurrentLineNumber=2, getRecordNumber=3, isClosed=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput233() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.csv.CSVParser", "org.apache.commons.csv.CSVParser", "getRecordNumber", new String[]{}, new String[]{}, false, 2, new String[][]{{"org.apache.commons.csv.CSVParser", "getCurrentLineNumber", ""}, {"org.apache.commons.csv.CSVParser", "getRecords", ""}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Long", actual.getClass().getName());
  assertEquals("2", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getCurrentLineNumber=2, getRecordNumber=2, isClosed=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput234() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.csv.CSVParser", "org.apache.commons.csv.CSVParser", "getRecordNumber", new String[]{}, new String[]{}, false, 3, new String[][]{{"org.apache.commons.csv.CSVParser", "getCurrentLineNumber", ""}, {"org.apache.commons.csv.CSVParser", "getHeaderMap", ""}, {"org.apache.commons.csv.CSVParser", "getRecords", ""}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Long", actual.getClass().getName());
  assertEquals("2", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getCurrentLineNumber=1, getRecordNumber=2, isClosed=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput235() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.csv.CSVParser", "org.apache.commons.csv.CSVParser", "getRecordNumber", new String[]{}, new String[]{}, false, 21, new String[][]{{"org.apache.commons.csv.CSVParser", "getRecords", ""}, {"org.apache.commons.csv.CSVParser", "close", ""}, {"org.apache.commons.csv.CSVParser", "getHeaderMap", ""}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Long", actual.getClass().getName());
  assertEquals("1", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getCurrentLineNumber=1, getRecordNumber=1, isClosed=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput236() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.csv.CSVParser", "org.apache.commons.csv.CSVParser", "getRecordNumber", new String[]{}, new String[]{}, false, 22, new String[][]{{"org.apache.commons.csv.CSVParser", "getRecords", ""}, {"org.apache.commons.csv.CSVParser", "close", ""}, {"org.apache.commons.csv.CSVParser", "getHeaderMap", ""}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Long", actual.getClass().getName());
  assertEquals("3", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getCurrentLineNumber=2, getRecordNumber=3, isClosed=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput237() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.csv.CSVParser", "org.apache.commons.csv.CSVParser", "iterator", new String[]{}, new String[]{}, false, 9, new String[][]{{"org.apache.commons.csv.CSVParser", "iterator", ""}}, 1), new String[][]{{"hasNext", "", "3"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getCurrentLineNumber=1, getRecordNumber=1, isClosed=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput238() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.csv.CSVParser", "org.apache.commons.csv.CSVParser", "iterator", new String[]{}, new String[]{}, false, 9, new String[][]{{"org.apache.commons.csv.CSVParser", "iterator", ""}}, 1);
  assertNotNull(actual);
  assertEquals("receiver state after the call", "{getCurrentLineNumber=0, getRecordNumber=0, isClosed=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput239() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.csv.CSVParser", "org.apache.commons.csv.CSVParser", "iterator", new String[]{}, new String[]{}, false, 11, new String[][]{{"org.apache.commons.csv.CSVParser", "getHeaderMap", ""}, {"org.apache.commons.csv.CSVParser", "isClosed", ""}, {"org.apache.commons.csv.CSVParser", "getRecords", ""}}, 3), new String[][]{{"next", "", "5"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.util.NoSuchElementException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput240() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.csv.CSVParser", "org.apache.commons.csv.CSVParser", "getRecords", new String[]{"java.util.Collection"}, new String[]{"<sample:0>"}, false, 4, new String[][]{{"org.apache.commons.csv.CSVParser", "iterator", ""}});
  assertNotNull(actual);
  assertEquals("java.util.ArrayList", actual.getClass().getName());
  assertEquals("[]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getCurrentLineNumber=0, getRecordNumber=0, isClosed=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput241() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.csv.CSVParser", "org.apache.commons.csv.CSVParser", "iterator", new String[]{}, new String[]{}, false, 8, new String[][]{{"org.apache.commons.csv.CSVParser", "nextRecord", ""}, {"org.apache.commons.csv.CSVParser", "isClosed", ""}}, 1), new String[][]{{"next", "", "4"}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.csv.CSVRecord", actual.getClass().getName());
  assertEquals("[b] {getComment=null, getRecordNumber=2, isConsistent=true, size=1}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getCurrentLineNumber=1, getRecordNumber=2, isClosed=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput242() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.csv.CSVParser", "org.apache.commons.csv.CSVParser", "iterator", new String[]{}, new String[]{}, false, 9, new String[][]{{"org.apache.commons.csv.CSVParser", "nextRecord", ""}, {"org.apache.commons.csv.CSVParser", "isClosed", ""}}, 1), new String[][]{{"next", "", "4"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.util.NoSuchElementException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput243() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.csv.CSVParser", "org.apache.commons.csv.CSVParser", "iterator", new String[]{}, new String[]{}, false, 10, new String[][]{{"org.apache.commons.csv.CSVParser", "nextRecord", ""}, {"org.apache.commons.csv.CSVParser", "isClosed", ""}}, 1), new String[][]{{"next", "", "4"}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.csv.CSVRecord", actual.getClass().getName());
  assertEquals("[b] {getComment=null, getRecordNumber=2, isConsistent=true, size=1}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getCurrentLineNumber=2, getRecordNumber=2, isClosed=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput244() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.csv.CSVParser", "org.apache.commons.csv.CSVParser", "nextRecord", new String[]{}, new String[]{}, false, 2, new String[][]{{"org.apache.commons.csv.CSVParser", "iterator", ""}}, 1);
  assertNotNull(actual);
  assertEquals("org.apache.commons.csv.CSVRecord", actual.getClass().getName());
  assertEquals("[a] {getComment=null, getRecordNumber=1, isConsistent=true, size=1}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getCurrentLineNumber=1, getRecordNumber=1, isClosed=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput245() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.csv.CSVParser", "org.apache.commons.csv.CSVParser", "nextRecord", new String[]{}, new String[]{}, false, 4, new String[][]{{"org.apache.commons.csv.CSVParser", "iterator", ""}}, 1);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getCurrentLineNumber=0, getRecordNumber=0, isClosed=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput246() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.csv.CSVParser", "org.apache.commons.csv.CSVParser", "nextRecord", new String[]{}, new String[]{}, false, 5, new String[][]{{"org.apache.commons.csv.CSVParser", "iterator", ""}}, 1);
  assertNotNull(actual);
  assertEquals("org.apache.commons.csv.CSVRecord", actual.getClass().getName());
  assertEquals("[<a><b>t</b></a>] {getComment=null, getRecordNumber=1, isConsistent=true, size=1}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getCurrentLineNumber=0, getRecordNumber=1, isClosed=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput247() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.csv.CSVParser", "org.apache.commons.csv.CSVParser", "nextRecord", new String[]{}, new String[]{}, false, 7, new String[][]{{"org.apache.commons.csv.CSVParser", "iterator", ""}}, 1);
  assertNotNull(actual);
  assertEquals("org.apache.commons.csv.CSVRecord", actual.getClass().getName());
  assertEquals("[ x \t y ] {getComment=null, getRecordNumber=1, isConsistent=true, size=1}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getCurrentLineNumber=0, getRecordNumber=1, isClosed=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput248() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.csv.CSVParser", "org.apache.commons.csv.CSVParser", "nextRecord", new String[]{}, new String[]{}, false, 8, new String[][]{{"org.apache.commons.csv.CSVParser", "iterator", ""}}, 1), new String[][]{{"get", "java.lang.String", "6"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalStateException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput249() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.csv.CSVParser", "org.apache.commons.csv.CSVParser", "nextRecord", new String[]{}, new String[]{}, false, 8, new String[][]{{"org.apache.commons.csv.CSVParser", "iterator", ""}, {"org.apache.commons.csv.CSVParser", "getRecords", ""}}, 1);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getCurrentLineNumber=1, getRecordNumber=2, isClosed=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput250() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.csv.CSVParser", "org.apache.commons.csv.CSVParser", "nextRecord", new String[]{}, new String[]{}, false, 10, new String[][]{{"org.apache.commons.csv.CSVParser", "iterator", ""}, {"org.apache.commons.csv.CSVParser", "getRecords", ""}}, 1);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getCurrentLineNumber=2, getRecordNumber=2, isClosed=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput251() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.csv.CSVParser", "org.apache.commons.csv.CSVParser", "nextRecord", new String[]{}, new String[]{}, false, 22, new String[][]{{"org.apache.commons.csv.CSVParser", "nextRecord", ""}, {"org.apache.commons.csv.CSVParser", "getRecords", ""}, {"org.apache.commons.csv.CSVParser", "getRecordNumber", ""}}, 1);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getCurrentLineNumber=2, getRecordNumber=3, isClosed=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput252() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.csv.CSVParser", "org.apache.commons.csv.CSVParser", "nextRecord", new String[]{}, new String[]{}, false, 22, new String[][]{{"org.apache.commons.csv.CSVParser", "getRecords", ""}, {"org.apache.commons.csv.CSVParser", "getRecordNumber", ""}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getCurrentLineNumber=2, getRecordNumber=3, isClosed=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput253() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.csv.CSVParser", "org.apache.commons.csv.CSVParser", "parse", new String[]{"java.lang.String", "org.apache.commons.csv.CSVFormat"}, new String[]{"123456789012346678901234567890", "<sample:7>"}, true, 0, null, 2), new String[][]{{"getCurrentLineNumber", "", "0"}});
  assertNotNull(actual);
  assertEquals("java.lang.Long", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput254() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.csv.CSVParser", "org.apache.commons.csv.CSVParser", "parse", new String[]{"java.io.File", "java.nio.charset.Charset", "org.apache.commons.csv.CSVFormat"}, new String[]{"<null>", "<null>", "<null>"}, true, 0, null, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput255() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.csv.CSVParser", "org.apache.commons.csv.CSVParser", "parse", new String[]{"java.io.File", "java.nio.charset.Charset", "org.apache.commons.csv.CSVFormat"}, new String[]{"<sample:5>", "<sample:2>", "<sample:4>"}, true, 0, null, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.io.FileNotFoundException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput256() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.csv.CSVParser", "org.apache.commons.csv.CSVParser", "close", new String[]{}, new String[]{}, false, 1, new String[][]{{"org.apache.commons.csv.CSVParser", "getRecords", ""}}, 1);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getCurrentLineNumber=1, getRecordNumber=2, isClosed=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput257() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.csv.CSVParser", "org.apache.commons.csv.CSVParser", "close", new String[]{}, new String[]{}, false, 2, new String[][]{{"org.apache.commons.csv.CSVParser", "getRecords", ""}}, 1);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getCurrentLineNumber=2, getRecordNumber=2, isClosed=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput258() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.csv.CSVParser", "org.apache.commons.csv.CSVParser", "getCurrentLineNumber", new String[]{}, new String[]{}, false, 2, new String[][]{{"org.apache.commons.csv.CSVParser", "getRecords", ""}, {"org.apache.commons.csv.CSVParser", "getHeaderMap", ""}, {"org.apache.commons.csv.CSVParser", "getRecords", "java.util.Collection", "<null>"}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Long", actual.getClass().getName());
  assertEquals("2", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getCurrentLineNumber=2, getRecordNumber=2, isClosed=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput259() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.csv.CSVParser", "org.apache.commons.csv.CSVParser", "getRecords", new String[]{}, new String[]{}, false, 6, new String[][]{{"org.apache.commons.csv.CSVParser", "close", ""}}, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.io.IOException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput260() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.csv.CSVParser", "org.apache.commons.csv.CSVParser", "getRecords", new String[]{}, new String[]{}, false, 1, new String[][]{{"org.apache.commons.csv.CSVParser", "nextRecord", ""}, {"org.apache.commons.csv.CSVParser", "nextRecord", ""}}, 1), new String[][]{{"lastIndexOf", "java.lang.Object", "3"}, {"set", "int,java.lang.Object", "0"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IndexOutOfBoundsException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput261() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.csv.CSVParser", "org.apache.commons.csv.CSVParser", "parse", new String[]{"java.net.URL", "java.nio.charset.Charset", "org.apache.commons.csv.CSVFormat"}, new String[]{"<sample:3>", "<empty>", "<null>"}, true, 0, null, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput262() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.csv.CSVParser", "org.apache.commons.csv.CSVParser", "parse", new String[]{"java.lang.String", "org.apache.commons.csv.CSVFormat"}, new String[]{"\"", "<sample:3>"}, true, 0, null, 2), new String[][]{{"getRecords", "java.util.Collection", "5"}});
  assertNotNull(actual);
  assertEquals("java.util.ArrayList", actual.getClass().getName());
  assertEquals("[a, 0, sample, [\"]]", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput263() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.csv.CSVParser", "org.apache.commons.csv.CSVParser", "getRecords", new String[]{}, new String[]{}, false, 14, new String[][]{{"org.apache.commons.csv.CSVParser", "getHeaderMap", ""}}, 1), new String[][]{{"isEmpty", "", "5"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getCurrentLineNumber=2, getRecordNumber=2, isClosed=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput264() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.csv.CSVParser", "org.apache.commons.csv.CSVParser", "getRecords", new String[]{}, new String[]{}, false, 16, new String[][]{{"org.apache.commons.csv.CSVParser", "getHeaderMap", ""}}, 1), new String[][]{{"isEmpty", "", "5"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getCurrentLineNumber=0, getRecordNumber=1, isClosed=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput265() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.csv.CSVParser", "org.apache.commons.csv.CSVParser", "getRecords", new String[]{}, new String[]{}, false, 21, new String[][]{}, 1), new String[][]{{"isEmpty", "", "7"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getCurrentLineNumber=1, getRecordNumber=1, isClosed=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput266() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.csv.CSVParser", "org.apache.commons.csv.CSVParser", "getRecords", new String[]{}, new String[]{}, false, 22, new String[][]{}, 1), new String[][]{{"isEmpty", "", "7"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getCurrentLineNumber=2, getRecordNumber=3, isClosed=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput267() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.csv.CSVParser", "org.apache.commons.csv.CSVParser", "getRecords", new String[]{}, new String[]{}, false, 23, new String[][]{}, 1), new String[][]{{"isEmpty", "", "7"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getCurrentLineNumber=0, getRecordNumber=0, isClosed=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput268() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.csv.CSVParser", "org.apache.commons.csv.CSVParser", "getRecords", new String[]{}, new String[]{}, false, 28, new String[][]{}, 1), new String[][]{{"isEmpty", "", "7"}, {"clear", "", "6"}});
  assertNotNull(actual);
  assertEquals("java.util.ArrayList", actual.getClass().getName());
  assertEquals("[]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getCurrentLineNumber=0, getRecordNumber=0, isClosed=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput269() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.csv.CSVParser", "org.apache.commons.csv.CSVParser", "getRecordNumber", new String[]{}, new String[]{}, false, 2, new String[][]{{"org.apache.commons.csv.CSVParser", "nextRecord", ""}, {"org.apache.commons.csv.CSVParser", "close", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.Long", actual.getClass().getName());
  assertEquals("1", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getCurrentLineNumber=1, getRecordNumber=1, isClosed=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput270() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.csv.CSVParser", "org.apache.commons.csv.CSVParser", "nextRecord", new String[]{}, new String[]{}, false, 14, new String[][]{{"org.apache.commons.csv.CSVParser", "nextRecord", ""}, {"org.apache.commons.csv.CSVParser", "isClosed", ""}}, 3), new String[][]{{"get", "java.lang.String", "4"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalStateException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput271() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.csv.CSVParser", "org.apache.commons.csv.CSVParser", "nextRecord", new String[]{}, new String[]{}, false, 14, new String[][]{{"org.apache.commons.csv.CSVParser", "isClosed", ""}}, 3);
  assertNotNull(actual);
  assertEquals("org.apache.commons.csv.CSVRecord", actual.getClass().getName());
  assertEquals("[a,b] {getComment=null, getRecordNumber=1, isConsistent=true, size=1}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getCurrentLineNumber=1, getRecordNumber=1, isClosed=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput272() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.csv.CSVParser", "org.apache.commons.csv.CSVParser", "nextRecord", new String[]{}, new String[]{}, false, 15, new String[][]{{"org.apache.commons.csv.CSVParser", "isClosed", ""}}, 3);
  assertNotNull(actual);
  assertEquals("org.apache.commons.csv.CSVRecord", actual.getClass().getName());
  assertEquals("[a] {getComment=null, getRecordNumber=1, isConsistent=true, size=1}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getCurrentLineNumber=1, getRecordNumber=1, isClosed=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput273() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.csv.CSVParser", "org.apache.commons.csv.CSVParser", "getHeaderMap", new String[]{}, new String[]{}, false, 24, new String[][]{{"org.apache.commons.csv.CSVParser", "getCurrentLineNumber", ""}}, 3);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getCurrentLineNumber=0, getRecordNumber=0, isClosed=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput274() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.csv.CSVParser", "org.apache.commons.csv.CSVParser", "getRecordNumber", new String[]{}, new String[]{}, false, 5, new String[][]{{"org.apache.commons.csv.CSVParser", "getRecords", "java.util.Collection", "<sample:3>"}, {"org.apache.commons.csv.CSVParser", "getHeaderMap", ""}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Long", actual.getClass().getName());
  assertEquals("1", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getCurrentLineNumber=0, getRecordNumber=1, isClosed=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput275() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.csv.CSVParser", "org.apache.commons.csv.CSVParser", "getRecordNumber", new String[]{}, new String[]{}, false, 8, new String[][]{{"org.apache.commons.csv.CSVParser", "getRecordNumber", ""}, {"org.apache.commons.csv.CSVParser", "getRecords", "java.util.Collection", "<sample:3>"}, {"org.apache.commons.csv.CSVParser", "getHeaderMap", ""}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Long", actual.getClass().getName());
  assertEquals("2", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getCurrentLineNumber=1, getRecordNumber=2, isClosed=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput276() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.csv.CSVParser", "org.apache.commons.csv.CSVParser", "getRecordNumber", new String[]{}, new String[]{}, false, 5, new String[][]{{"org.apache.commons.csv.CSVParser", "nextRecord", ""}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Long", actual.getClass().getName());
  assertEquals("1", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getCurrentLineNumber=0, getRecordNumber=1, isClosed=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput277() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.csv.CSVParser", "org.apache.commons.csv.CSVParser", "iterator", new String[]{}, new String[]{}, false, 7, new String[][]{{"org.apache.commons.csv.CSVParser", "getCurrentLineNumber", ""}, {"org.apache.commons.csv.CSVParser", "getCurrentLineNumber", ""}, {"org.apache.commons.csv.CSVParser", "close", ""}}, 3);
  assertNotNull(actual);
  assertEquals("receiver state after the call", "{getCurrentLineNumber=0, getRecordNumber=0, isClosed=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput278() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.csv.CSVParser", "org.apache.commons.csv.CSVParser", "iterator", new String[]{}, new String[]{}, false, 16, new String[][]{{"org.apache.commons.csv.CSVParser", "getCurrentLineNumber", ""}, {"org.apache.commons.csv.CSVParser", "getCurrentLineNumber", ""}, {"org.apache.commons.csv.CSVParser", "close", ""}}, 1);
  assertNotNull(actual);
  assertEquals("receiver state after the call", "{getCurrentLineNumber=0, getRecordNumber=0, isClosed=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput279() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.csv.CSVParser", "org.apache.commons.csv.CSVParser", "getRecords", new String[]{"java.util.Collection"}, new String[]{"<sample:4>"}, false, 0, new String[][]{{"org.apache.commons.csv.CSVParser", "close", ""}}, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.io.IOException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput280() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.csv.CSVParser", "org.apache.commons.csv.CSVParser", "getRecords", new String[]{"java.util.Collection"}, new String[]{"<null>"}, false, 0, new String[][]{{"org.apache.commons.csv.CSVParser", "getCurrentLineNumber", ""}, {"org.apache.commons.csv.CSVParser", "iterator", ""}}, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput281() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.csv.CSVParser", "org.apache.commons.csv.CSVParser", "getRecords", new String[]{"java.util.Collection"}, new String[]{"<null>"}, false, 0, new String[][]{{"org.apache.commons.csv.CSVParser", "getCurrentLineNumber", ""}, {"org.apache.commons.csv.CSVParser", "iterator", ""}, {"org.apache.commons.csv.CSVParser", "getRecords", ""}}, 2);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getCurrentLineNumber=0, getRecordNumber=1, isClosed=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput282() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.csv.CSVParser", "org.apache.commons.csv.CSVParser", "getRecords", new String[]{"java.util.Collection"}, new String[]{"<empty>"}, false, 0, new String[][]{{"org.apache.commons.csv.CSVParser", "iterator", ""}, {"org.apache.commons.csv.CSVParser", "getRecords", ""}}, 2);
  assertNotNull(actual);
  assertEquals("java.util.ArrayList", actual.getClass().getName());
  assertEquals("[]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getCurrentLineNumber=0, getRecordNumber=1, isClosed=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput283() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.csv.CSVParser", "org.apache.commons.csv.CSVParser", "getRecordNumber", new String[]{}, new String[]{}, false, 3, new String[][]{{"org.apache.commons.csv.CSVParser", "getRecords", "java.util.Collection", "<empty>"}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Long", actual.getClass().getName());
  assertEquals("2", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getCurrentLineNumber=1, getRecordNumber=2, isClosed=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput284() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.csv.CSVParser", "org.apache.commons.csv.CSVParser", "getRecords", new String[]{}, new String[]{}, false, 10, new String[][]{}, 3), new String[][]{{"ensureCapacity", "int", "1"}, {"add", "java.lang.Object", "2"}, {"trimToSize", "", "2"}, {"get", "int", "5"}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("b", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getCurrentLineNumber=2, getRecordNumber=2, isClosed=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput285() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.csv.CSVParser", "org.apache.commons.csv.CSVParser", "getRecords", new String[]{}, new String[]{}, false, 22, new String[][]{}, 3), new String[][]{{"ensureCapacity", "int", "1"}, {"add", "java.lang.Object", "2"}, {"trimToSize", "", "2"}, {"get", "int", "5"}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.csv.CSVRecord", actual.getClass().getName());
  assertEquals("[line3] {getComment=null, getRecordNumber=3, isConsistent=true, size=1}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getCurrentLineNumber=2, getRecordNumber=3, isClosed=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput286() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.csv.CSVParser", "org.apache.commons.csv.CSVParser", "getRecords", new String[]{}, new String[]{}, false, 0, null, 3);
  assertNotNull(actual);
  assertEquals("java.util.ArrayList", actual.getClass().getName());
  assertEquals("[[a]]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getCurrentLineNumber=0, getRecordNumber=1, isClosed=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput287() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.csv.CSVParser", "org.apache.commons.csv.CSVParser", "getRecords", new String[]{}, new String[]{}, false, 1, new String[][]{}, 3);
  assertNotNull(actual);
  assertEquals("java.util.ArrayList", actual.getClass().getName());
  assertEquals("[[a], [b]]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getCurrentLineNumber=1, getRecordNumber=2, isClosed=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput288() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.csv.CSVParser", "org.apache.commons.csv.CSVParser", "getRecords", new String[]{}, new String[]{}, false, 3, new String[][]{}, 3), new String[][]{{"indexOf", "java.lang.Object", "5"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("-1", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getCurrentLineNumber=1, getRecordNumber=2, isClosed=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput289() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.csv.CSVParser", "org.apache.commons.csv.CSVParser", "getRecords", new String[]{}, new String[]{}, false, 14, new String[][]{}, 1), new String[][]{{"indexOf", "java.lang.Object", "3"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("-1", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getCurrentLineNumber=2, getRecordNumber=2, isClosed=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput290() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.csv.CSVParser", "org.apache.commons.csv.CSVParser", "parse", new String[]{"java.lang.String", "org.apache.commons.csv.CSVFormat"}, new String[]{"stringh", "<sample:4>"}, true, 0, null, 3), new String[][]{{"getHeaderMap", "", "4"}, {"getHeaderMap", "", "1"}});
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput291() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.csv.CSVParser", "org.apache.commons.csv.CSVParser", "iterator", new String[]{}, new String[]{}, false, 3, new String[][]{{"org.apache.commons.csv.CSVParser", "nextRecord", ""}, {"org.apache.commons.csv.CSVParser", "getRecords", "java.util.Collection", "<empty>"}}, 1), new String[][]{{"remove", "", "6"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.UnsupportedOperationException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput292() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.csv.CSVParser", "org.apache.commons.csv.CSVParser", "iterator", new String[]{}, new String[]{}, false, 17, new String[][]{{"org.apache.commons.csv.CSVParser", "nextRecord", ""}, {"org.apache.commons.csv.CSVParser", "close", ""}}, 2);
  assertNotNull(actual);
  assertEquals("receiver state after the call", "{getCurrentLineNumber=0, getRecordNumber=1, isClosed=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput293() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.csv.CSVParser", "org.apache.commons.csv.CSVParser", "getHeaderMap", new String[]{}, new String[]{}, false, 2, new String[][]{{"org.apache.commons.csv.CSVParser", "getRecords", "java.util.Collection", "<null>"}, {"org.apache.commons.csv.CSVParser", "isClosed", ""}}, 3);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getCurrentLineNumber=1, getRecordNumber=1, isClosed=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput294() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.csv.CSVParser", "org.apache.commons.csv.CSVParser", "getHeaderMap", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.csv.CSVParser", "getRecords", "java.util.Collection", "<null>"}, {"org.apache.commons.csv.CSVParser", "isClosed", ""}}, 3);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getCurrentLineNumber=0, getRecordNumber=1, isClosed=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput295() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.csv.CSVParser", "org.apache.commons.csv.CSVParser", "nextRecord", new String[]{}, new String[]{}, false, 8, new String[][]{{"org.apache.commons.csv.CSVParser", "isClosed", ""}}, 3), new String[][]{{"size", "", "3"}, {"getRecordNumber", "", "2"}});
  assertNotNull(actual);
  assertEquals("java.lang.Long", actual.getClass().getName());
  assertEquals("1", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getCurrentLineNumber=1, getRecordNumber=1, isClosed=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput296() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.csv.CSVParser", "org.apache.commons.csv.CSVParser", "nextRecord", new String[]{}, new String[]{}, false, 8, new String[][]{{"org.apache.commons.csv.CSVParser", "isClosed", ""}}, 3), new String[][]{{"size", "", "3"}, {"getRecordNumber", "", "2"}, {"isSet", "java.lang.String", "6"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getCurrentLineNumber=1, getRecordNumber=1, isClosed=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput297() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.csv.CSVParser", "org.apache.commons.csv.CSVParser", "getHeaderMap", new String[]{}, new String[]{}, false, 2, new String[][]{{"org.apache.commons.csv.CSVParser", "iterator", ""}, {"org.apache.commons.csv.CSVParser", "getRecords", "java.util.Collection", "<sample:2>"}, {"org.apache.commons.csv.CSVParser", "nextRecord", ""}}, 3);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getCurrentLineNumber=2, getRecordNumber=2, isClosed=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput298() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.csv.CSVParser", "org.apache.commons.csv.CSVParser", "getHeaderMap", new String[]{}, new String[]{}, false, 15, new String[][]{{"org.apache.commons.csv.CSVParser", "iterator", ""}, {"org.apache.commons.csv.CSVParser", "getRecords", "java.util.Collection", "<sample:2>"}, {"org.apache.commons.csv.CSVParser", "nextRecord", ""}}, 3);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getCurrentLineNumber=1, getRecordNumber=2, isClosed=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput299() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.csv.CSVParser", "org.apache.commons.csv.CSVParser", "getRecords", new String[]{"java.util.Collection"}, new String[]{"<sample:1>"}, false, 1, new String[][]{{"org.apache.commons.csv.CSVParser", "getRecordNumber", ""}}, 3);
  assertNotNull(actual);
  assertEquals("java.util.ArrayList", actual.getClass().getName());
  assertEquals("[a, 0, [a], [b]]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getCurrentLineNumber=1, getRecordNumber=2, isClosed=false}", SearchInputFactory_scaffolding.receiverState());
 }
}
