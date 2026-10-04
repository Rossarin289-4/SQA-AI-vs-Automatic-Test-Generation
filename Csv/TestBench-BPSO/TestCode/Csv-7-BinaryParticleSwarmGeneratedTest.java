package generated.algorithm;

import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;
import static org.junit.Assert.*;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class BinaryParticleSwarmGeneratedTest {
 @Test(timeout = 20000)
 public void generatedInput000() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.csv.CSVParser", "org.apache.commons.csv.CSVParser", "getRecords", new String[]{}, new String[]{}, false, 6, new String[][]{}, 1);
  assertNotNull(actual);
  assertEquals("java.util.ArrayList", actual.getClass().getName());
  assertEquals("[[{\", \":1}]]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getCurrentLineNumber=0, getRecordNumber=1, isClosed=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput001() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.csv.CSVParser", "org.apache.commons.csv.CSVParser", "close", new String[]{}, new String[]{}, false, 0, null, 2);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getCurrentLineNumber=!NullPointerException, getRecordNumber=0, isClosed=!NullPointerException}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput002() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.csv.CSVParser", "org.apache.commons.csv.CSVParser", "iterator", new String[]{}, new String[]{}, false, 6, new String[][]{}), new String[][]{{"remove", "", "5"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.UnsupportedOperationException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput003() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.csv.CSVParser", "org.apache.commons.csv.CSVParser", "parse", new String[]{"java.net.URL", "java.nio.charset.Charset", "org.apache.commons.csv.CSVFormat"}, new String[]{"<sample:6>", "<sample:3>", "<sample:0>"}, true); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput004() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.csv.CSVParser", "org.apache.commons.csv.CSVParser", "iterator", new String[]{}, new String[]{}, false, 2, new String[][]{{"org.apache.commons.csv.CSVParser", "getRecords", "java.util.Collection", "<empty>"}}), new String[][]{{"next", "", "1"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.util.NoSuchElementException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput005() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.csv.CSVParser", "org.apache.commons.csv.CSVParser", "iterator", new String[]{}, new String[]{}, false, 2, new String[][]{{"org.apache.commons.csv.CSVParser", "getCurrentLineNumber", ""}}), new String[][]{{"hasNext", "", "1"}, {"next", "", "1"}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.csv.CSVRecord", actual.getClass().getName());
  assertEquals("[a] {getComment=null, getRecordNumber=1, isConsistent=true, size=1}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getCurrentLineNumber=1, getRecordNumber=1, isClosed=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput006() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.csv.CSVParser", "org.apache.commons.csv.CSVParser", "iterator", new String[]{}, new String[]{}, false, 6, new String[][]{}), new String[][]{{"hasNext", "", "4"}, {"hasNext", "", "2"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getCurrentLineNumber=0, getRecordNumber=1, isClosed=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput007() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.csv.CSVParser", "org.apache.commons.csv.CSVParser", "iterator", new String[]{}, new String[]{}, false, 2, new String[][]{{"org.apache.commons.csv.CSVParser", "close", ""}}), new String[][]{{"next", "", "0"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.util.NoSuchElementException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput008() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.csv.CSVParser", "org.apache.commons.csv.CSVParser", "iterator", new String[]{}, new String[]{}, false, 6, new String[][]{{"org.apache.commons.csv.CSVParser", "getRecords", ""}, {"org.apache.commons.csv.CSVParser", "getHeaderMap", ""}}, 3), new String[][]{{"hasNext", "", "5"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getCurrentLineNumber=0, getRecordNumber=1, isClosed=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput009() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.csv.CSVParser", "org.apache.commons.csv.CSVParser", "iterator", new String[]{}, new String[]{}, false, 2, new String[][]{{"org.apache.commons.csv.CSVParser", "close", ""}}), new String[][]{{"hasNext", "", "7"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getCurrentLineNumber=0, getRecordNumber=0, isClosed=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput010() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.csv.CSVParser", "org.apache.commons.csv.CSVParser", "parse", new String[]{"java.lang.String", "org.apache.commons.csv.CSVFormat"}, new String[]{"1.5eL00", "<sample:6>"}, true, 0, null, 1), new String[][]{{"iterator", "", "1"}, {"next", "", "5"}, {"isSet", "java.lang.String", "2"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput011() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.csv.CSVParser", "org.apache.commons.csv.CSVParser", "nextRecord", new String[]{}, new String[]{}, false, 2, new String[][]{}, 1);
  assertNotNull(actual);
  assertEquals("org.apache.commons.csv.CSVRecord", actual.getClass().getName());
  assertEquals("[a] {getComment=null, getRecordNumber=1, isConsistent=true, size=1}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getCurrentLineNumber=1, getRecordNumber=1, isClosed=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput012() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.csv.CSVParser", "org.apache.commons.csv.CSVParser", "getHeaderMap", new String[]{}, new String[]{}, false, 5, new String[][]{}, 3);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getCurrentLineNumber=!NullPointerException, getRecordNumber=0, isClosed=!NullPointerException}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput013() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.csv.CSVParser", "org.apache.commons.csv.CSVParser", "getRecordNumber", new String[]{}, new String[]{}, false, 6, new String[][]{{"org.apache.commons.csv.CSVParser", "iterator", ""}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Long", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getCurrentLineNumber=0, getRecordNumber=0, isClosed=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput014() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.csv.CSVParser", "org.apache.commons.csv.CSVParser", "nextRecord", new String[]{}, new String[]{}, false, 6, new String[][]{}, 3), new String[][]{{"get", "java.lang.String", "1"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalStateException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput015() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.csv.CSVParser", "org.apache.commons.csv.CSVParser", "getRecords", new String[]{}, new String[]{}, false, 7, new String[][]{}, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput016() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.csv.CSVParser", "org.apache.commons.csv.CSVParser", "getRecordNumber", new String[]{}, new String[]{}, false, 5, new String[][]{}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Long", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getCurrentLineNumber=!NullPointerException, getRecordNumber=0, isClosed=!NullPointerException}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput017() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.csv.CSVParser", "org.apache.commons.csv.CSVParser", "getRecords", new String[]{"java.util.Collection"}, new String[]{"<sample:1>"}, false, 5, new String[][]{}, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput018() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.csv.CSVParser", "org.apache.commons.csv.CSVParser", "getCurrentLineNumber", new String[]{}, new String[]{}, false, 6, new String[][]{}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Long", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getCurrentLineNumber=0, getRecordNumber=0, isClosed=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput019() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.csv.CSVParser", "org.apache.commons.csv.CSVParser", "getRecords", new String[]{}, new String[]{}, false, 0, null, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput020() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.csv.CSVParser", "org.apache.commons.csv.CSVParser", "parse", new String[]{"java.io.File", "org.apache.commons.csv.CSVFormat"}, new String[]{"<sample:2>", "<sample:1>"}, true, 0, null, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.io.FileNotFoundException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput021() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.csv.CSVParser", "org.apache.commons.csv.CSVParser", "close", new String[]{}, new String[]{}, false, 7, new String[][]{}, 1);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getCurrentLineNumber=!NullPointerException, getRecordNumber=0, isClosed=!NullPointerException}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput022() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.csv.CSVParser", "org.apache.commons.csv.CSVParser", "close", new String[]{}, new String[]{}, false, 3, new String[][]{}, 3);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getCurrentLineNumber=!NullPointerException, getRecordNumber=0, isClosed=!NullPointerException}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput023() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.csv.CSVParser", "org.apache.commons.csv.CSVParser", "close", new String[]{}, new String[]{}, false, 2, new String[][]{}, 2);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getCurrentLineNumber=0, getRecordNumber=0, isClosed=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput024() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.csv.CSVParser", "org.apache.commons.csv.CSVParser", "getHeaderMap", new String[]{}, new String[]{}, false, 6, new String[][]{}, 3);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getCurrentLineNumber=0, getRecordNumber=0, isClosed=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput025() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.csv.CSVParser", "org.apache.commons.csv.CSVParser", "getRecords", new String[]{"java.util.Collection"}, new String[]{"<null>"}, false, 7, new String[][]{}, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput026() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.csv.CSVParser", "org.apache.commons.csv.CSVParser", "close", new String[]{}, new String[]{}, false, 6, new String[][]{}, 3);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getCurrentLineNumber=0, getRecordNumber=0, isClosed=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput027() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.csv.CSVParser", "org.apache.commons.csv.CSVParser", "isClosed", new String[]{}, new String[]{}, false, 2, new String[][]{{"org.apache.commons.csv.CSVParser", "getCurrentLineNumber", ""}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getCurrentLineNumber=0, getRecordNumber=0, isClosed=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput028() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.csv.CSVParser", "org.apache.commons.csv.CSVParser", "getHeaderMap", new String[]{}, new String[]{}, false, 2, new String[][]{}, 1);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getCurrentLineNumber=0, getRecordNumber=0, isClosed=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput029() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.csv.CSVParser", "org.apache.commons.csv.CSVParser", "getCurrentLineNumber", new String[]{}, new String[]{}, false, 4, new String[][]{}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Long", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getCurrentLineNumber=0, getRecordNumber=0, isClosed=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput030() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.csv.CSVParser", "org.apache.commons.csv.CSVParser", "iterator", new String[]{}, new String[]{}, false, 6, new String[][]{}, 1), new String[][]{{"next", "", "3"}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.csv.CSVRecord", actual.getClass().getName());
  assertEquals("[{\", \":1}] {getComment=null, getRecordNumber=1, isConsistent=true, size=2}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getCurrentLineNumber=0, getRecordNumber=1, isClosed=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput031() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.csv.CSVParser", "org.apache.commons.csv.CSVParser", "iterator", new String[]{}, new String[]{}, false, 0, null, 1);
  assertNotNull(actual);
  assertEquals("receiver state after the call", "{getCurrentLineNumber=!NullPointerException, getRecordNumber=0, isClosed=!NullPointerException}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput032() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.csv.CSVParser", "org.apache.commons.csv.CSVParser", "getRecords", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.csv.CSVParser", "close", ""}}, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput033() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.csv.CSVParser", "org.apache.commons.csv.CSVParser", "getHeaderMap", new String[]{}, new String[]{}, false, 4, new String[][]{{"org.apache.commons.csv.CSVParser", "getRecords", ""}}, 3);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getCurrentLineNumber=2, getRecordNumber=2, isClosed=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput034() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.csv.CSVParser", "org.apache.commons.csv.CSVParser", "parse", new String[]{"java.io.File", "org.apache.commons.csv.CSVFormat"}, new String[]{"<empty>", "<sample:3>"}, true, 0, null, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.io.FileNotFoundException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput035() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.csv.CSVParser", "org.apache.commons.csv.CSVParser", "getCurrentLineNumber", new String[]{}, new String[]{}, false, 0, null, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput036() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.csv.CSVParser", "org.apache.commons.csv.CSVParser", "close", new String[]{}, new String[]{}, false, 6, new String[][]{{"org.apache.commons.csv.CSVParser", "getRecords", "java.util.Collection", "<sample:0>"}}, 2);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getCurrentLineNumber=0, getRecordNumber=1, isClosed=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput037() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.csv.CSVParser", "org.apache.commons.csv.CSVParser", "getRecordNumber", new String[]{}, new String[]{}, false, 7, new String[][]{}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Long", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getCurrentLineNumber=!NullPointerException, getRecordNumber=0, isClosed=!NullPointerException}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput038() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.csv.CSVParser", "org.apache.commons.csv.CSVParser", "getRecords", new String[]{"java.util.Collection"}, new String[]{"<sample:3>"}, false, 6, new String[][]{}, 3), new String[][]{{"clear", "", "2"}});
  assertNotNull(actual);
  assertEquals("java.util.ArrayList", actual.getClass().getName());
  assertEquals("[]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getCurrentLineNumber=0, getRecordNumber=1, isClosed=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput039() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.csv.CSVParser", "org.apache.commons.csv.CSVParser", "parse", new String[]{"java.net.URL", "java.nio.charset.Charset", "org.apache.commons.csv.CSVFormat"}, new String[]{"<sample:6>", "<null>", "<sample:8>"}, true, 0, null, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput040() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.csv.CSVParser", "org.apache.commons.csv.CSVParser", "getHeaderMap", new String[]{}, new String[]{}, false, 7, new String[][]{}, 1);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getCurrentLineNumber=!NullPointerException, getRecordNumber=0, isClosed=!NullPointerException}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput041() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.csv.CSVParser", "org.apache.commons.csv.CSVParser", "getRecords", new String[]{"java.util.Collection"}, new String[]{"<sample:0>"}, false, 4, new String[][]{}, 1);
  assertNotNull(actual);
  assertEquals("java.util.ArrayList", actual.getClass().getName());
  assertEquals("[, [a,b], [1,2]]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getCurrentLineNumber=2, getRecordNumber=2, isClosed=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput042() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.csv.CSVParser", "org.apache.commons.csv.CSVParser", "getHeaderMap", new String[]{}, new String[]{}, false, 4, new String[][]{}, 2);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getCurrentLineNumber=0, getRecordNumber=0, isClosed=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput043() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.csv.CSVParser", "org.apache.commons.csv.CSVParser", "getRecordNumber", new String[]{}, new String[]{}, false, 2, new String[][]{{"org.apache.commons.csv.CSVParser", "getHeaderMap", ""}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Long", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getCurrentLineNumber=0, getRecordNumber=0, isClosed=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput044() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.csv.CSVParser", "org.apache.commons.csv.CSVParser", "getRecords", new String[]{"java.util.Collection"}, new String[]{"<sample:5>"}, false, 6, new String[][]{}, 1);
  assertNotNull(actual);
  assertEquals("java.util.ArrayList", actual.getClass().getName());
  assertEquals("[a, 0, sample, [{\", \":1}]]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getCurrentLineNumber=0, getRecordNumber=1, isClosed=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput045() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.csv.CSVParser", "org.apache.commons.csv.CSVParser", "isClosed", new String[]{}, new String[]{}, false, 6, new String[][]{{"org.apache.commons.csv.CSVParser", "close", ""}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getCurrentLineNumber=0, getRecordNumber=0, isClosed=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput046() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.csv.CSVParser", "org.apache.commons.csv.CSVParser", "getRecords", new String[]{"java.util.Collection"}, new String[]{"<empty>"}, false, 6, new String[][]{}, 3), new String[][]{{"lastIndexOf", "java.lang.Object", "7"}, {"indexOf", "java.lang.Object", "5"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("-1", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getCurrentLineNumber=0, getRecordNumber=1, isClosed=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput047() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.csv.CSVParser", "org.apache.commons.csv.CSVParser", "getHeaderMap", new String[]{}, new String[]{}, false, 0, null, 2);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getCurrentLineNumber=!NullPointerException, getRecordNumber=0, isClosed=!NullPointerException}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput048() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.csv.CSVParser", "org.apache.commons.csv.CSVParser", "getRecords", new String[]{}, new String[]{}, false, 6, new String[][]{{"org.apache.commons.csv.CSVParser", "close", ""}}, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.io.IOException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput049() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.csv.CSVParser", "org.apache.commons.csv.CSVParser", "iterator", new String[]{}, new String[]{}, false, 0, null, 2), new String[][]{{"hasNext", "", "4"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput050() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.csv.CSVParser", "org.apache.commons.csv.CSVParser", "getRecords", new String[]{}, new String[]{}, false, 2, new String[][]{}, 1), new String[][]{{"get", "int", "0"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IndexOutOfBoundsException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput051() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.csv.CSVParser", "org.apache.commons.csv.CSVParser", "iterator", new String[]{}, new String[]{}, false, 6, new String[][]{{"org.apache.commons.csv.CSVParser", "iterator", ""}}, 1), new String[][]{{"hasNext", "", "5"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getCurrentLineNumber=0, getRecordNumber=1, isClosed=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput052() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.csv.CSVParser", "org.apache.commons.csv.CSVParser", "getCurrentLineNumber", new String[]{}, new String[]{}, false, 5, new String[][]{}, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput053() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.csv.CSVParser", "org.apache.commons.csv.CSVParser", "isClosed", new String[]{}, new String[]{}, false, 7, new String[][]{}, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput054() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.csv.CSVParser", "org.apache.commons.csv.CSVParser", "iterator", new String[]{}, new String[]{}, false, 2, new String[][]{{"org.apache.commons.csv.CSVParser", "nextRecord", ""}}, 1), new String[][]{{"hasNext", "", "0"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getCurrentLineNumber=2, getRecordNumber=2, isClosed=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput055() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.csv.CSVParser", "org.apache.commons.csv.CSVParser", "parse", new String[]{"java.net.URL", "java.nio.charset.Charset", "org.apache.commons.csv.CSVFormat"}, new String[]{"<sample:1>", "<sample:3>", "<sample:5>"}, true, 0, null, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput056() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.csv.CSVParser", "org.apache.commons.csv.CSVParser", "getRecords", new String[]{"java.util.Collection"}, new String[]{"<sample:2>"}, false, 2, new String[][]{}, 2);
  assertNotNull(actual);
  assertEquals("java.util.ArrayList", actual.getClass().getName());
  assertEquals("[0, sample, , [a], [b]]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getCurrentLineNumber=2, getRecordNumber=2, isClosed=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput057() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.csv.CSVParser", "org.apache.commons.csv.CSVParser", "getHeaderMap", new String[]{}, new String[]{}, false, 2, new String[][]{{"org.apache.commons.csv.CSVParser", "nextRecord", ""}}, 1);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getCurrentLineNumber=1, getRecordNumber=1, isClosed=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput058() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.csv.CSVParser", "org.apache.commons.csv.CSVParser", "close", new String[]{}, new String[]{}, false, 2, new String[][]{}, 1);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getCurrentLineNumber=0, getRecordNumber=0, isClosed=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput059() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.csv.CSVParser", "org.apache.commons.csv.CSVParser", "parse", new String[]{"java.net.URL", "java.nio.charset.Charset", "org.apache.commons.csv.CSVFormat"}, new String[]{"<sample:2>", "<empty>", "<null>"}, true, 0, null, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput060() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.csv.CSVParser", "org.apache.commons.csv.CSVParser", "iterator", new String[]{}, new String[]{}, false, 0, null, 2), new String[][]{{"remove", "", "1"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.UnsupportedOperationException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput061() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.csv.CSVParser", "org.apache.commons.csv.CSVParser", "getRecordNumber", new String[]{}, new String[]{}, false, 0, null, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Long", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getCurrentLineNumber=!NullPointerException, getRecordNumber=0, isClosed=!NullPointerException}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput062() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.csv.CSVParser", "org.apache.commons.csv.CSVParser", "isClosed", new String[]{}, new String[]{}, false, 6, new String[][]{}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getCurrentLineNumber=0, getRecordNumber=0, isClosed=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput063() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.csv.CSVParser", "org.apache.commons.csv.CSVParser", "getHeaderMap", new String[]{}, new String[]{}, false, 2, new String[][]{{"org.apache.commons.csv.CSVParser", "getRecords", ""}}, 1);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getCurrentLineNumber=2, getRecordNumber=2, isClosed=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput064() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.csv.CSVParser", "org.apache.commons.csv.CSVParser", "getRecords", new String[]{"java.util.Collection"}, new String[]{"<sample:0>"}, false, 2, new String[][]{}, 1), new String[][]{{"clone", "", "1"}});
  assertNotNull(actual);
  assertEquals("java.util.ArrayList", actual.getClass().getName());
  assertEquals("[, [a], [b]]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getCurrentLineNumber=2, getRecordNumber=2, isClosed=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput065() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.csv.CSVParser", "org.apache.commons.csv.CSVParser", "getRecordNumber", new String[]{}, new String[]{}, false, 6, new String[][]{}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Long", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getCurrentLineNumber=0, getRecordNumber=0, isClosed=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput066() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.csv.CSVParser", "org.apache.commons.csv.CSVParser", "iterator", new String[]{}, new String[]{}, false, 7, new String[][]{}, 1), new String[][]{{"hasNext", "", "3"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput067() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.csv.CSVParser", "org.apache.commons.csv.CSVParser", "parse", new String[]{"java.io.File", "org.apache.commons.csv.CSVFormat"}, new String[]{"<sample:4>", "<sample:6>"}, true, 0, null, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.io.FileNotFoundException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput068() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.csv.CSVParser", "org.apache.commons.csv.CSVParser", "getRecords", new String[]{"java.util.Collection"}, new String[]{"<sample:0>"}, false, 6, new String[][]{}, 1), new String[][]{{"containsAll", "java.util.Collection", "2"}, {"removeAll", "java.util.Collection", "1"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getCurrentLineNumber=0, getRecordNumber=1, isClosed=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput069() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.csv.CSVParser", "org.apache.commons.csv.CSVParser", "getRecords", new String[]{}, new String[]{}, false, 2, new String[][]{}, 1), new String[][]{{"clear", "", "2"}});
  assertNotNull(actual);
  assertEquals("java.util.ArrayList", actual.getClass().getName());
  assertEquals("[]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getCurrentLineNumber=2, getRecordNumber=2, isClosed=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput070() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.csv.CSVParser", "org.apache.commons.csv.CSVParser", "iterator", new String[]{}, new String[]{}, false, 1, new String[][]{}, 3), new String[][]{{"hasNext", "", "7"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput071() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.csv.CSVParser", "org.apache.commons.csv.CSVParser", "getRecords", new String[]{"java.util.Collection"}, new String[]{"<sample:3>"}, false, 6, new String[][]{}, 1), new String[][]{{"iterator", "", "1"}});
  assertNotNull(actual);
  assertEquals("java.util.ArrayList$Itr", actual.getClass().getName());
  assertEquals("{hasNext=true}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getCurrentLineNumber=0, getRecordNumber=1, isClosed=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput072() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.csv.CSVParser", "org.apache.commons.csv.CSVParser", "iterator", new String[]{}, new String[]{}, false, 4, new String[][]{}, 1);
  assertNotNull(actual);
  assertEquals("receiver state after the call", "{getCurrentLineNumber=0, getRecordNumber=0, isClosed=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput073() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.csv.CSVParser", "org.apache.commons.csv.CSVParser", "parse", new String[]{"java.net.URL", "java.nio.charset.Charset", "org.apache.commons.csv.CSVFormat"}, new String[]{"<sample:7>", "<sample:2>", "<sample:6>"}, true, 0, null, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput074() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.csv.CSVParser", "org.apache.commons.csv.CSVParser", "iterator", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.csv.CSVParser", "isClosed", ""}}, 3), new String[][]{{"remove", "", "2"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.UnsupportedOperationException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput075() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.csv.CSVParser", "org.apache.commons.csv.CSVParser", "getRecords", new String[]{}, new String[]{}, false, 4, new String[][]{}, 3);
  assertNotNull(actual);
  assertEquals("java.util.ArrayList", actual.getClass().getName());
  assertEquals("[[a,b], [1,2]]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getCurrentLineNumber=2, getRecordNumber=2, isClosed=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput076() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.csv.CSVParser", "org.apache.commons.csv.CSVParser", "isClosed", new String[]{}, new String[]{}, false, 6, new String[][]{}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getCurrentLineNumber=0, getRecordNumber=0, isClosed=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput077() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.csv.CSVParser", "org.apache.commons.csv.CSVParser", "iterator", new String[]{}, new String[]{}, false, 6, new String[][]{{"org.apache.commons.csv.CSVParser", "getHeaderMap", ""}}, 1), new String[][]{{"remove", "", "7"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.UnsupportedOperationException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput078() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.csv.CSVParser", "org.apache.commons.csv.CSVParser", "getRecords", new String[]{"java.util.Collection"}, new String[]{"<sample:5>"}, false, 4, new String[][]{}, 2);
  assertNotNull(actual);
  assertEquals("java.util.ArrayList", actual.getClass().getName());
  assertEquals("[a, 0, sample, [a,b], [1,2]]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getCurrentLineNumber=2, getRecordNumber=2, isClosed=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput079() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.csv.CSVParser", "org.apache.commons.csv.CSVParser", "nextRecord", new String[]{}, new String[]{}, false, 6, new String[][]{}, 1), new String[][]{{"get", "java.lang.Enum", "1"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput080() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.csv.CSVParser", "org.apache.commons.csv.CSVParser", "getRecords", new String[]{}, new String[]{}, false, 4, new String[][]{}, 1);
  assertNotNull(actual);
  assertEquals("java.util.ArrayList", actual.getClass().getName());
  assertEquals("[[a,b], [1,2]]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getCurrentLineNumber=2, getRecordNumber=2, isClosed=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput081() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.csv.CSVParser", "org.apache.commons.csv.CSVParser", "parse", new String[]{"java.lang.String", "org.apache.commons.csv.CSVFormat"}, new String[]{"0x12345578:", "<sample:5>"}, true, 0, null, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalStateException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput082() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.csv.CSVParser", "org.apache.commons.csv.CSVParser", "iterator", new String[]{}, new String[]{}, false, 2, new String[][]{}, 3), new String[][]{{"hasNext", "", "7"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getCurrentLineNumber=1, getRecordNumber=1, isClosed=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput083() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.csv.CSVParser", "org.apache.commons.csv.CSVParser", "iterator", new String[]{}, new String[]{}, false, 6, new String[][]{}, 2);
  assertNotNull(actual);
  assertEquals("receiver state after the call", "{getCurrentLineNumber=0, getRecordNumber=0, isClosed=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput084() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.csv.CSVParser", "org.apache.commons.csv.CSVParser", "getRecords", new String[]{"java.util.Collection"}, new String[]{"<empty>"}, false, 2, new String[][]{}, 3);
  assertNotNull(actual);
  assertEquals("java.util.ArrayList", actual.getClass().getName());
  assertEquals("[[a], [b]]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getCurrentLineNumber=2, getRecordNumber=2, isClosed=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput085() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.csv.CSVParser", "org.apache.commons.csv.CSVParser", "nextRecord", new String[]{}, new String[]{}, false, 6, new String[][]{}, 3), new String[][]{{"size", "", "2"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("2", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getCurrentLineNumber=0, getRecordNumber=1, isClosed=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput086() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.csv.CSVParser", "org.apache.commons.csv.CSVParser", "getHeaderMap", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.csv.CSVParser", "isClosed", ""}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getCurrentLineNumber=!NullPointerException, getRecordNumber=0, isClosed=!NullPointerException}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput087() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.csv.CSVParser", "org.apache.commons.csv.CSVParser", "isClosed", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.csv.CSVParser", "nextRecord", ""}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput088() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.csv.CSVParser", "org.apache.commons.csv.CSVParser", "getHeaderMap", new String[]{}, new String[]{}, false, 4, new String[][]{{"org.apache.commons.csv.CSVParser", "nextRecord", ""}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getCurrentLineNumber=1, getRecordNumber=1, isClosed=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput089() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.csv.CSVParser", "org.apache.commons.csv.CSVParser", "getRecordNumber", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.csv.CSVParser", "isClosed", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.Long", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getCurrentLineNumber=!NullPointerException, getRecordNumber=0, isClosed=!NullPointerException}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput090() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.csv.CSVParser", "org.apache.commons.csv.CSVParser", "parse", new String[]{"java.net.URL", "java.nio.charset.Charset", "org.apache.commons.csv.CSVFormat"}, new String[]{"<sample:5>", "<sample:4>", "<null>"}, true); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput091() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.csv.CSVParser", "org.apache.commons.csv.CSVParser", "getRecords", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.csv.CSVParser", "getRecordNumber", ""}, {"org.apache.commons.csv.CSVParser", "getRecords", ""}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput092() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.csv.CSVParser", "org.apache.commons.csv.CSVParser", "iterator", new String[]{}, new String[]{}, false, 6, new String[][]{});
  assertNotNull(actual);
  assertEquals("receiver state after the call", "{getCurrentLineNumber=0, getRecordNumber=0, isClosed=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput093() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.csv.CSVParser", "org.apache.commons.csv.CSVParser", "close", new String[]{}, new String[]{}, false);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getCurrentLineNumber=!NullPointerException, getRecordNumber=0, isClosed=!NullPointerException}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput094() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.csv.CSVParser", "org.apache.commons.csv.CSVParser", "getCurrentLineNumber", new String[]{}, new String[]{}, false, 6, new String[][]{});
  assertNotNull(actual);
  assertEquals("java.lang.Long", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getCurrentLineNumber=0, getRecordNumber=0, isClosed=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput095() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.csv.CSVParser", "org.apache.commons.csv.CSVParser", "parse", new String[]{"java.lang.String", "org.apache.commons.csv.CSVFormat"}, new String[]{"0xXF", "<sample:3>"}, true); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalStateException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput096() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.csv.CSVParser", "org.apache.commons.csv.CSVParser", "nextRecord", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.csv.CSVParser", "nextRecord", ""}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput097() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.csv.CSVParser", "org.apache.commons.csv.CSVParser", "close", new String[]{}, new String[]{}, false, 2, new String[][]{{"org.apache.commons.csv.CSVParser", "getRecords", ""}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getCurrentLineNumber=2, getRecordNumber=2, isClosed=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput098() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.csv.CSVParser", "org.apache.commons.csv.CSVParser", "parse", new String[]{"java.io.File", "org.apache.commons.csv.CSVFormat"}, new String[]{"<empty>", "<sample:1>"}, true); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.io.FileNotFoundException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput099() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.csv.CSVParser", "org.apache.commons.csv.CSVParser", "getRecords", new String[]{"java.util.Collection"}, new String[]{"<sample:3>"}, false, 2, new String[][]{});
  assertNotNull(actual);
  assertEquals("java.util.ArrayList", actual.getClass().getName());
  assertEquals("[sample, [a], [b]]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getCurrentLineNumber=2, getRecordNumber=2, isClosed=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput100() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.csv.CSVParser", "org.apache.commons.csv.CSVParser", "getRecords", new String[]{}, new String[]{}, false, 2, new String[][]{}), new String[][]{{"listIterator", "int", "4"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IndexOutOfBoundsException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput101() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.csv.CSVParser", "org.apache.commons.csv.CSVParser", "getRecords", new String[]{}, new String[]{}, false, 2, new String[][]{{"org.apache.commons.csv.CSVParser", "nextRecord", ""}});
  assertNotNull(actual);
  assertEquals("java.util.ArrayList", actual.getClass().getName());
  assertEquals("[[b]]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getCurrentLineNumber=2, getRecordNumber=2, isClosed=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput102() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.csv.CSVParser", "org.apache.commons.csv.CSVParser", "nextRecord", new String[]{}, new String[]{}, false, 2, new String[][]{{"org.apache.commons.csv.CSVParser", "getHeaderMap", ""}}), new String[][]{{"isMapped", "java.lang.String", "6"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getCurrentLineNumber=1, getRecordNumber=1, isClosed=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput103() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.csv.CSVParser", "org.apache.commons.csv.CSVParser", "getRecords", new String[]{}, new String[]{}, false, 4, new String[][]{{"org.apache.commons.csv.CSVParser", "nextRecord", ""}}), new String[][]{{"lastIndexOf", "java.lang.Object", "7"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("-1", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getCurrentLineNumber=2, getRecordNumber=2, isClosed=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput104() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.csv.CSVParser", "org.apache.commons.csv.CSVParser", "iterator", new String[]{}, new String[]{}, false, 3, new String[][]{});
  assertNotNull(actual);
  assertEquals("receiver state after the call", "{getCurrentLineNumber=!NullPointerException, getRecordNumber=0, isClosed=!NullPointerException}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput105() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.csv.CSVParser", "org.apache.commons.csv.CSVParser", "iterator", new String[]{}, new String[]{}, false, 6, new String[][]{{"org.apache.commons.csv.CSVParser", "getRecords", "java.util.Collection", "<sample:1>"}, {"org.apache.commons.csv.CSVParser", "nextRecord", ""}});
  assertNotNull(actual);
  assertEquals("receiver state after the call", "{getCurrentLineNumber=0, getRecordNumber=1, isClosed=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput106() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.csv.CSVParser", "org.apache.commons.csv.CSVParser", "getCurrentLineNumber", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.csv.CSVParser", "nextRecord", ""}, {"org.apache.commons.csv.CSVParser", "getRecords", ""}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput107() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.csv.CSVParser", "org.apache.commons.csv.CSVParser", "isClosed", new String[]{}, new String[]{}, false, 2, new String[][]{{"org.apache.commons.csv.CSVParser", "getCurrentLineNumber", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getCurrentLineNumber=0, getRecordNumber=0, isClosed=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput108() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.csv.CSVParser", "org.apache.commons.csv.CSVParser", "close", new String[]{}, new String[]{}, false, 4, new String[][]{});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getCurrentLineNumber=0, getRecordNumber=0, isClosed=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput109() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.csv.CSVParser", "org.apache.commons.csv.CSVParser", "getRecordNumber", new String[]{}, new String[]{}, false, 6, new String[][]{});
  assertNotNull(actual);
  assertEquals("java.lang.Long", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getCurrentLineNumber=0, getRecordNumber=0, isClosed=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput110() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.csv.CSVParser", "org.apache.commons.csv.CSVParser", "getRecords", new String[]{}, new String[]{}, false, 2, new String[][]{});
  assertNotNull(actual);
  assertEquals("java.util.ArrayList", actual.getClass().getName());
  assertEquals("[[a], [b]]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getCurrentLineNumber=2, getRecordNumber=2, isClosed=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput111() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.csv.CSVParser", "org.apache.commons.csv.CSVParser", "getRecords", new String[]{}, new String[]{}, false, 2, new String[][]{{"org.apache.commons.csv.CSVParser", "getHeaderMap", ""}}), new String[][]{{"containsAll", "java.util.Collection", "2"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getCurrentLineNumber=2, getRecordNumber=2, isClosed=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput112() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.csv.CSVParser", "org.apache.commons.csv.CSVParser", "parse", new String[]{"java.lang.String", "org.apache.commons.csv.CSVFormat"}, new String[]{"abc", "<sample:4>"}, true);
  assertNotNull(actual);
  assertEquals("org.apache.commons.csv.CSVParser", actual.getClass().getName());
  assertEquals("{getCurrentLineNumber=0, getRecordNumber=0, isClosed=false}", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput113() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.csv.CSVParser", "org.apache.commons.csv.CSVParser", "iterator", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.csv.CSVParser", "getRecordNumber", ""}}), new String[][]{{"next", "", "7"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput114() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.csv.CSVParser", "org.apache.commons.csv.CSVParser", "isClosed", new String[]{}, new String[]{}, false, 4, new String[][]{{"org.apache.commons.csv.CSVParser", "getRecords", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getCurrentLineNumber=2, getRecordNumber=2, isClosed=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput115() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.csv.CSVParser", "org.apache.commons.csv.CSVParser", "getRecords", new String[]{"java.util.Collection"}, new String[]{"<null>"}, false, 2, new String[][]{}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput116() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.csv.CSVParser", "org.apache.commons.csv.CSVParser", "getRecords", new String[]{"java.util.Collection"}, new String[]{"<sample:3>"}, false, 4, new String[][]{});
  assertNotNull(actual);
  assertEquals("java.util.ArrayList", actual.getClass().getName());
  assertEquals("[sample, [a,b], [1,2]]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getCurrentLineNumber=2, getRecordNumber=2, isClosed=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput117() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.csv.CSVParser", "org.apache.commons.csv.CSVParser", "getHeaderMap", new String[]{}, new String[]{}, false, 2, new String[][]{{"org.apache.commons.csv.CSVParser", "getCurrentLineNumber", ""}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getCurrentLineNumber=0, getRecordNumber=0, isClosed=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput118() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.csv.CSVParser", "org.apache.commons.csv.CSVParser", "iterator", new String[]{}, new String[]{}, false, 6, new String[][]{}), new String[][]{{"hasNext", "", "7"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getCurrentLineNumber=0, getRecordNumber=1, isClosed=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput119() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.csv.CSVParser", "org.apache.commons.csv.CSVParser", "isClosed", new String[]{}, new String[]{}, false, 4, new String[][]{{"org.apache.commons.csv.CSVParser", "getRecordNumber", ""}, {"org.apache.commons.csv.CSVParser", "nextRecord", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getCurrentLineNumber=1, getRecordNumber=1, isClosed=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput120() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.csv.CSVParser", "org.apache.commons.csv.CSVParser", "getRecords", new String[]{}, new String[]{}, false, 4, new String[][]{{"org.apache.commons.csv.CSVParser", "close", ""}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.io.IOException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput121() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.csv.CSVParser", "org.apache.commons.csv.CSVParser", "getRecords", new String[]{}, new String[]{}, false, 2, new String[][]{{"org.apache.commons.csv.CSVParser", "getRecordNumber", ""}}), new String[][]{{"containsAll", "java.util.Collection", "1"}, {"add", "java.lang.Object", "5"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getCurrentLineNumber=2, getRecordNumber=2, isClosed=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput122() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.csv.CSVParser", "org.apache.commons.csv.CSVParser", "getRecordNumber", new String[]{}, new String[]{}, false, 4, new String[][]{{"org.apache.commons.csv.CSVParser", "getRecords", "java.util.Collection", "<sample:3>"}});
  assertNotNull(actual);
  assertEquals("java.lang.Long", actual.getClass().getName());
  assertEquals("2", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getCurrentLineNumber=2, getRecordNumber=2, isClosed=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput123() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.csv.CSVParser", "org.apache.commons.csv.CSVParser", "getRecords", new String[]{"java.util.Collection"}, new String[]{"<sample:4>"}, false, 6, new String[][]{});
  assertNotNull(actual);
  assertEquals("java.util.ArrayList", actual.getClass().getName());
  assertEquals("[, a, [{\", \":1}]]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getCurrentLineNumber=0, getRecordNumber=1, isClosed=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput124() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.csv.CSVParser", "org.apache.commons.csv.CSVParser", "getHeaderMap", new String[]{}, new String[]{}, false, 6, new String[][]{{"org.apache.commons.csv.CSVParser", "getRecords", "java.util.Collection", "<sample:2>"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getCurrentLineNumber=0, getRecordNumber=1, isClosed=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput125() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.csv.CSVParser", "org.apache.commons.csv.CSVParser", "getRecords", new String[]{"java.util.Collection"}, new String[]{"<sample:3>"}, false, 6, new String[][]{}), new String[][]{{"add", "java.lang.Object", "0"}, {"containsAll", "java.util.Collection", "3"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getCurrentLineNumber=0, getRecordNumber=1, isClosed=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput126() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.csv.CSVParser", "org.apache.commons.csv.CSVParser", "close", new String[]{}, new String[]{}, false, 6, new String[][]{{"org.apache.commons.csv.CSVParser", "getRecords", ""}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getCurrentLineNumber=0, getRecordNumber=1, isClosed=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput127() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.csv.CSVParser", "org.apache.commons.csv.CSVParser", "iterator", new String[]{}, new String[]{}, false, 6, new String[][]{}), new String[][]{{"next", "", "3"}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.csv.CSVRecord", actual.getClass().getName());
  assertEquals("[{\", \":1}] {getComment=null, getRecordNumber=1, isConsistent=true, size=2}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getCurrentLineNumber=0, getRecordNumber=1, isClosed=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput128() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.csv.CSVParser", "org.apache.commons.csv.CSVParser", "iterator", new String[]{}, new String[]{}, false, 6, new String[][]{}), new String[][]{{"next", "", "3"}, {"isMapped", "java.lang.String", "0"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getCurrentLineNumber=0, getRecordNumber=1, isClosed=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput129() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.csv.CSVParser", "org.apache.commons.csv.CSVParser", "getRecords", new String[]{"java.util.Collection"}, new String[]{"<empty>"}, false, 6, new String[][]{});
  assertNotNull(actual);
  assertEquals("java.util.ArrayList", actual.getClass().getName());
  assertEquals("[[{\", \":1}]]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getCurrentLineNumber=0, getRecordNumber=1, isClosed=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput130() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.csv.CSVParser", "org.apache.commons.csv.CSVParser", "getRecords", new String[]{"java.util.Collection"}, new String[]{"<sample:4>"}, false, 6, new String[][]{}), new String[][]{{"add", "int,java.lang.Object", "6"}, {"contains", "java.lang.Object", "3"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getCurrentLineNumber=0, getRecordNumber=1, isClosed=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput131() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.csv.CSVParser", "org.apache.commons.csv.CSVParser", "getRecords", new String[]{"java.util.Collection"}, new String[]{"<sample:3>"}, false, 6, new String[][]{});
  assertNotNull(actual);
  assertEquals("java.util.ArrayList", actual.getClass().getName());
  assertEquals("[sample, [{\", \":1}]]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getCurrentLineNumber=0, getRecordNumber=1, isClosed=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput132() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.csv.CSVParser", "org.apache.commons.csv.CSVParser", "getCurrentLineNumber", new String[]{}, new String[]{}, false, 6, new String[][]{{"org.apache.commons.csv.CSVParser", "getRecords", "java.util.Collection", "<sample:2>"}, {"org.apache.commons.csv.CSVParser", "getCurrentLineNumber", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.Long", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getCurrentLineNumber=0, getRecordNumber=1, isClosed=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput133() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.csv.CSVParser", "org.apache.commons.csv.CSVParser", "parse", new String[]{"java.lang.String", "org.apache.commons.csv.CSVFormat"}, new String[]{"http://fxample.com/a?b=cPT1H", "<sample:6>"}, true), new String[][]{{"iterator", "", "2"}});
  assertNotNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput134() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.csv.CSVParser", "org.apache.commons.csv.CSVParser", "getRecords", new String[]{}, new String[]{}, false, 6, new String[][]{});
  assertNotNull(actual);
  assertEquals("java.util.ArrayList", actual.getClass().getName());
  assertEquals("[[{\", \":1}]]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getCurrentLineNumber=0, getRecordNumber=1, isClosed=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput135() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.csv.CSVParser", "org.apache.commons.csv.CSVParser", "getHeaderMap", new String[]{}, new String[]{}, false, 4, new String[][]{{"org.apache.commons.csv.CSVParser", "nextRecord", ""}, {"org.apache.commons.csv.CSVParser", "close", ""}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getCurrentLineNumber=1, getRecordNumber=1, isClosed=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput136() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.csv.CSVParser", "org.apache.commons.csv.CSVParser", "getRecords", new String[]{"java.util.Collection"}, new String[]{"<sample:1>"}, false, 6, new String[][]{}, 1), new String[][]{{"add", "int,java.lang.Object", "3"}});
  assertNotNull(actual);
  assertEquals("java.util.ArrayList", actual.getClass().getName());
  assertEquals("[a, key, 0, [{\", \":1}]]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getCurrentLineNumber=0, getRecordNumber=1, isClosed=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput137() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.csv.CSVParser", "org.apache.commons.csv.CSVParser", "iterator", new String[]{}, new String[]{}, false, 4, new String[][]{{"org.apache.commons.csv.CSVParser", "iterator", ""}}), new String[][]{{"hasNext", "", "4"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getCurrentLineNumber=1, getRecordNumber=1, isClosed=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput138() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.csv.CSVParser", "org.apache.commons.csv.CSVParser", "iterator", new String[]{}, new String[]{}, false, 4, new String[][]{}, 1), new String[][]{{"hasNext", "", "1"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getCurrentLineNumber=1, getRecordNumber=1, isClosed=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput139() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.csv.CSVParser", "org.apache.commons.csv.CSVParser", "getRecords", new String[]{}, new String[]{}, false, 4, new String[][]{{"org.apache.commons.csv.CSVParser", "getRecords", ""}, {"org.apache.commons.csv.CSVParser", "close", ""}}, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.io.IOException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput140() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.csv.CSVParser", "org.apache.commons.csv.CSVParser", "getCurrentLineNumber", new String[]{}, new String[]{}, false, 0, null, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput141() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.csv.CSVParser", "org.apache.commons.csv.CSVParser", "getRecords", new String[]{"java.util.Collection"}, new String[]{"<sample:5>"}, false, 6, new String[][]{}, 3);
  assertNotNull(actual);
  assertEquals("java.util.ArrayList", actual.getClass().getName());
  assertEquals("[a, 0, sample, [{\", \":1}]]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getCurrentLineNumber=0, getRecordNumber=1, isClosed=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput142() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.csv.CSVParser", "org.apache.commons.csv.CSVParser", "parse", new String[]{"java.lang.String", "org.apache.commons.csv.CSVFormat"}, new String[]{"cu", "<sample:6>"}, true), new String[][]{{"getCurrentLineNumber", "", "1"}});
  assertNotNull(actual);
  assertEquals("java.lang.Long", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput143() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.csv.CSVParser", "org.apache.commons.csv.CSVParser", "nextRecord", new String[]{}, new String[]{}, false, 0, null, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput144() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.csv.CSVParser", "org.apache.commons.csv.CSVParser", "getRecords", new String[]{}, new String[]{}, false, 2, new String[][]{{"org.apache.commons.csv.CSVParser", "getCurrentLineNumber", ""}}, 3), new String[][]{{"indexOf", "java.lang.Object", "3"}, {"retainAll", "java.util.Collection", "3"}, {"listIterator", "int", "5"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IndexOutOfBoundsException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput145() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.csv.CSVParser", "org.apache.commons.csv.CSVParser", "getCurrentLineNumber", new String[]{}, new String[]{}, false, 4, new String[][]{{"org.apache.commons.csv.CSVParser", "getRecords", ""}, {"org.apache.commons.csv.CSVParser", "getCurrentLineNumber", ""}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Long", actual.getClass().getName());
  assertEquals("2", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getCurrentLineNumber=2, getRecordNumber=2, isClosed=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput146() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.csv.CSVParser", "org.apache.commons.csv.CSVParser", "getRecords", new String[]{"java.util.Collection"}, new String[]{"<empty>"}, false, 4, new String[][]{{"org.apache.commons.csv.CSVParser", "close", ""}}, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.io.IOException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput147() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.csv.CSVParser", "org.apache.commons.csv.CSVParser", "getRecords", new String[]{"java.util.Collection"}, new String[]{"<null>"}, false, 6, new String[][]{}, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput148() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.csv.CSVParser", "org.apache.commons.csv.CSVParser", "getCurrentLineNumber", new String[]{}, new String[]{}, false, 6, new String[][]{{"org.apache.commons.csv.CSVParser", "close", ""}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Long", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getCurrentLineNumber=0, getRecordNumber=0, isClosed=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput149() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.csv.CSVParser", "org.apache.commons.csv.CSVParser", "parse", new String[]{"java.lang.String", "org.apache.commons.csv.CSVFormat"}, new String[]{"fi", "<sample:6>"}, true, 0, null, 1);
  assertNotNull(actual);
  assertEquals("org.apache.commons.csv.CSVParser", actual.getClass().getName());
  assertEquals("{getCurrentLineNumber=0, getRecordNumber=0, isClosed=false}", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput150() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.csv.CSVParser", "org.apache.commons.csv.CSVParser", "getRecordNumber", new String[]{}, new String[]{}, false, 4, new String[][]{{"org.apache.commons.csv.CSVParser", "nextRecord", ""}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Long", actual.getClass().getName());
  assertEquals("1", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getCurrentLineNumber=1, getRecordNumber=1, isClosed=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput151() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.csv.CSVParser", "org.apache.commons.csv.CSVParser", "getRecords", new String[]{}, new String[]{}, false, 6, new String[][]{{"org.apache.commons.csv.CSVParser", "getRecords", ""}}, 3), new String[][]{{"removeAll", "java.util.Collection", "1"}, {"retainAll", "java.util.Collection", "7"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getCurrentLineNumber=0, getRecordNumber=1, isClosed=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput152() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.csv.CSVParser", "org.apache.commons.csv.CSVParser", "isClosed", new String[]{}, new String[]{}, false, 6, new String[][]{{"org.apache.commons.csv.CSVParser", "getRecords", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getCurrentLineNumber=0, getRecordNumber=1, isClosed=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput153() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.csv.CSVParser", "org.apache.commons.csv.CSVParser", "getRecords", new String[]{}, new String[]{}, false, 4, new String[][]{}, 1), new String[][]{{"clear", "", "5"}, {"containsAll", "java.util.Collection", "0"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getCurrentLineNumber=2, getRecordNumber=2, isClosed=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput154() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.csv.CSVParser", "org.apache.commons.csv.CSVParser", "isClosed", new String[]{}, new String[]{}, false, 6, new String[][]{{"org.apache.commons.csv.CSVParser", "getRecords", ""}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getCurrentLineNumber=0, getRecordNumber=1, isClosed=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput155() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.csv.CSVParser", "org.apache.commons.csv.CSVParser", "getCurrentLineNumber", new String[]{}, new String[]{}, false, 4, new String[][]{{"org.apache.commons.csv.CSVParser", "nextRecord", ""}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Long", actual.getClass().getName());
  assertEquals("1", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getCurrentLineNumber=1, getRecordNumber=1, isClosed=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput156() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.csv.CSVParser", "org.apache.commons.csv.CSVParser", "getRecordNumber", new String[]{}, new String[]{}, false, 6, new String[][]{{"org.apache.commons.csv.CSVParser", "getRecords", ""}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Long", actual.getClass().getName());
  assertEquals("1", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getCurrentLineNumber=0, getRecordNumber=1, isClosed=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput157() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.csv.CSVParser", "org.apache.commons.csv.CSVParser", "iterator", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.csv.CSVParser", "getHeaderMap", ""}}, 3);
  assertNotNull(actual);
  assertEquals("receiver state after the call", "{getCurrentLineNumber=!NullPointerException, getRecordNumber=0, isClosed=!NullPointerException}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput158() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.csv.CSVParser", "org.apache.commons.csv.CSVParser", "nextRecord", new String[]{}, new String[]{}, false, 6, new String[][]{});
  assertNotNull(actual);
  assertEquals("org.apache.commons.csv.CSVRecord", actual.getClass().getName());
  assertEquals("[{\", \":1}] {getComment=null, getRecordNumber=1, isConsistent=true, size=2}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getCurrentLineNumber=0, getRecordNumber=1, isClosed=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput159() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.csv.CSVParser", "org.apache.commons.csv.CSVParser", "isClosed", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.csv.CSVParser", "getCurrentLineNumber", ""}}, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput160() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.csv.CSVParser", "org.apache.commons.csv.CSVParser", "getCurrentLineNumber", new String[]{}, new String[]{}, false, 6, new String[][]{{"org.apache.commons.csv.CSVParser", "close", ""}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Long", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getCurrentLineNumber=0, getRecordNumber=0, isClosed=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput161() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.csv.CSVParser", "org.apache.commons.csv.CSVParser", "getHeaderMap", new String[]{}, new String[]{}, false, 4, new String[][]{{"org.apache.commons.csv.CSVParser", "getRecords", ""}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getCurrentLineNumber=2, getRecordNumber=2, isClosed=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput162() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.csv.CSVParser", "org.apache.commons.csv.CSVParser", "isClosed", new String[]{}, new String[]{}, false, 2, new String[][]{{"org.apache.commons.csv.CSVParser", "close", ""}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getCurrentLineNumber=0, getRecordNumber=0, isClosed=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput163() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.csv.CSVParser", "org.apache.commons.csv.CSVParser", "isClosed", new String[]{}, new String[]{}, false, 6, new String[][]{{"org.apache.commons.csv.CSVParser", "getRecords", ""}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getCurrentLineNumber=0, getRecordNumber=1, isClosed=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput164() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.csv.CSVParser", "org.apache.commons.csv.CSVParser", "getHeaderMap", new String[]{}, new String[]{}, false, 4, new String[][]{{"org.apache.commons.csv.CSVParser", "nextRecord", ""}}, 3);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getCurrentLineNumber=1, getRecordNumber=1, isClosed=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput165() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.csv.CSVParser", "org.apache.commons.csv.CSVParser", "getCurrentLineNumber", new String[]{}, new String[]{}, false, 2, new String[][]{{"org.apache.commons.csv.CSVParser", "nextRecord", ""}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Long", actual.getClass().getName());
  assertEquals("1", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getCurrentLineNumber=1, getRecordNumber=1, isClosed=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput166() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.csv.CSVParser", "org.apache.commons.csv.CSVParser", "parse", new String[]{"java.lang.String", "org.apache.commons.csv.CSVFormat"}, new String[]{"str\nng", "<sample:0>"}, true, 0, null, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalStateException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput167() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.csv.CSVParser", "org.apache.commons.csv.CSVParser", "isClosed", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.csv.CSVParser", "isClosed", ""}}, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput168() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.csv.CSVParser", "org.apache.commons.csv.CSVParser", "getRecords", new String[]{"java.util.Collection"}, new String[]{"<empty>"}, false, 4, new String[][]{}, 2), new String[][]{{"addAll", "java.util.Collection", "6"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getCurrentLineNumber=2, getRecordNumber=2, isClosed=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput169() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.csv.CSVParser", "org.apache.commons.csv.CSVParser", "nextRecord", new String[]{}, new String[]{}, false, 4, new String[][]{}, 1), new String[][]{{"size", "", "3"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("1", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getCurrentLineNumber=1, getRecordNumber=1, isClosed=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput170() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.csv.CSVParser", "org.apache.commons.csv.CSVParser", "getRecords", new String[]{"java.util.Collection"}, new String[]{"<sample:2>"}, false, 2, new String[][]{{"org.apache.commons.csv.CSVParser", "getRecords", ""}}, 3);
  assertNotNull(actual);
  assertEquals("java.util.ArrayList", actual.getClass().getName());
  assertEquals("[0, sample, ]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getCurrentLineNumber=2, getRecordNumber=2, isClosed=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput171() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.csv.CSVParser", "org.apache.commons.csv.CSVParser", "close", new String[]{}, new String[]{}, false, 2, new String[][]{{"org.apache.commons.csv.CSVParser", "nextRecord", ""}}, 3);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getCurrentLineNumber=1, getRecordNumber=1, isClosed=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput172() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.csv.CSVParser", "org.apache.commons.csv.CSVParser", "getRecordNumber", new String[]{}, new String[]{}, false, 6, new String[][]{{"org.apache.commons.csv.CSVParser", "getRecords", "java.util.Collection", "<empty>"}, {"org.apache.commons.csv.CSVParser", "getRecordNumber", ""}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Long", actual.getClass().getName());
  assertEquals("1", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getCurrentLineNumber=0, getRecordNumber=1, isClosed=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput173() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.csv.CSVParser", "org.apache.commons.csv.CSVParser", "iterator", new String[]{}, new String[]{}, false, 6, new String[][]{{"org.apache.commons.csv.CSVParser", "getHeaderMap", ""}, {"org.apache.commons.csv.CSVParser", "close", ""}});
  assertNotNull(actual);
  assertEquals("receiver state after the call", "{getCurrentLineNumber=0, getRecordNumber=0, isClosed=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput174() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.csv.CSVParser", "org.apache.commons.csv.CSVParser", "getCurrentLineNumber", new String[]{}, new String[]{}, false, 4, new String[][]{{"org.apache.commons.csv.CSVParser", "nextRecord", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.Long", actual.getClass().getName());
  assertEquals("1", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getCurrentLineNumber=1, getRecordNumber=1, isClosed=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput175() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.csv.CSVParser", "org.apache.commons.csv.CSVParser", "getRecordNumber", new String[]{}, new String[]{}, false, 4, new String[][]{{"org.apache.commons.csv.CSVParser", "close", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.Long", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getCurrentLineNumber=0, getRecordNumber=0, isClosed=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput176() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.csv.CSVParser", "org.apache.commons.csv.CSVParser", "getCurrentLineNumber", new String[]{}, new String[]{}, false, 2, new String[][]{{"org.apache.commons.csv.CSVParser", "getRecords", "java.util.Collection", "<sample:3>"}});
  assertNotNull(actual);
  assertEquals("java.lang.Long", actual.getClass().getName());
  assertEquals("2", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getCurrentLineNumber=2, getRecordNumber=2, isClosed=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput177() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.csv.CSVParser", "org.apache.commons.csv.CSVParser", "iterator", new String[]{}, new String[]{}, false, 6, new String[][]{{"org.apache.commons.csv.CSVParser", "getHeaderMap", ""}}), new String[][]{{"next", "", "5"}, {"getComment", "", "6"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getCurrentLineNumber=0, getRecordNumber=1, isClosed=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput178() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.csv.CSVParser", "org.apache.commons.csv.CSVParser", "nextRecord", new String[]{}, new String[]{}, false, 4, new String[][]{{"org.apache.commons.csv.CSVParser", "getHeaderMap", ""}}), new String[][]{{"getRecordNumber", "", "5"}});
  assertNotNull(actual);
  assertEquals("java.lang.Long", actual.getClass().getName());
  assertEquals("1", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getCurrentLineNumber=1, getRecordNumber=1, isClosed=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput179() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.csv.CSVParser", "org.apache.commons.csv.CSVParser", "iterator", new String[]{}, new String[]{}, false, 4, new String[][]{}), new String[][]{{"next", "", "4"}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.csv.CSVRecord", actual.getClass().getName());
  assertEquals("[a,b] {getComment=null, getRecordNumber=1, isConsistent=true, size=1}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getCurrentLineNumber=1, getRecordNumber=1, isClosed=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput180() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.csv.CSVParser", "org.apache.commons.csv.CSVParser", "parse", new String[]{"java.lang.String", "org.apache.commons.csv.CSVFormat"}, new String[]{"0x1234F56789/a/b", "<null>"}, true); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput181() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.csv.CSVParser", "org.apache.commons.csv.CSVParser", "nextRecord", new String[]{}, new String[]{}, false, 6, new String[][]{{"org.apache.commons.csv.CSVParser", "getRecords", ""}, {"org.apache.commons.csv.CSVParser", "iterator", ""}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getCurrentLineNumber=0, getRecordNumber=1, isClosed=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput182() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.csv.CSVParser", "org.apache.commons.csv.CSVParser", "isClosed", new String[]{}, new String[]{}, false, 6, new String[][]{{"org.apache.commons.csv.CSVParser", "close", ""}, {"org.apache.commons.csv.CSVParser", "getRecords", "java.util.Collection", "<sample:0>"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getCurrentLineNumber=0, getRecordNumber=0, isClosed=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput183() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.csv.CSVParser", "org.apache.commons.csv.CSVParser", "nextRecord", new String[]{}, new String[]{}, false, 4, new String[][]{});
  assertNotNull(actual);
  assertEquals("org.apache.commons.csv.CSVRecord", actual.getClass().getName());
  assertEquals("[a,b] {getComment=null, getRecordNumber=1, isConsistent=true, size=1}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getCurrentLineNumber=1, getRecordNumber=1, isClosed=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput184() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.csv.CSVParser", "org.apache.commons.csv.CSVParser", "isClosed", new String[]{}, new String[]{}, false, 4, new String[][]{{"org.apache.commons.csv.CSVParser", "nextRecord", ""}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getCurrentLineNumber=1, getRecordNumber=1, isClosed=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput185() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.csv.CSVParser", "org.apache.commons.csv.CSVParser", "getHeaderMap", new String[]{}, new String[]{}, false, 6, new String[][]{{"org.apache.commons.csv.CSVParser", "close", ""}}, 2);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getCurrentLineNumber=0, getRecordNumber=0, isClosed=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput186() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.csv.CSVParser", "org.apache.commons.csv.CSVParser", "getRecords", new String[]{}, new String[]{}, false, 2, new String[][]{{"org.apache.commons.csv.CSVParser", "close", ""}}, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.io.IOException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput187() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.csv.CSVParser", "org.apache.commons.csv.CSVParser", "getHeaderMap", new String[]{}, new String[]{}, false, 6, new String[][]{{"org.apache.commons.csv.CSVParser", "getRecords", ""}}, 1);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getCurrentLineNumber=0, getRecordNumber=1, isClosed=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput188() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.csv.CSVParser", "org.apache.commons.csv.CSVParser", "getRecords", new String[]{"java.util.Collection"}, new String[]{"<sample:1>"}, false, 6, new String[][]{}, 3), new String[][]{{"clone", "", "1"}, {"remove", "int", "7"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IndexOutOfBoundsException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput189() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.csv.CSVParser", "org.apache.commons.csv.CSVParser", "nextRecord", new String[]{}, new String[]{}, false, 2, new String[][]{{"org.apache.commons.csv.CSVParser", "getRecords", ""}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getCurrentLineNumber=2, getRecordNumber=2, isClosed=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput190() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.csv.CSVParser", "org.apache.commons.csv.CSVParser", "getRecords", new String[]{}, new String[]{}, false, 4, new String[][]{}, 2);
  assertNotNull(actual);
  assertEquals("java.util.ArrayList", actual.getClass().getName());
  assertEquals("[[a,b], [1,2]]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getCurrentLineNumber=2, getRecordNumber=2, isClosed=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput191() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.csv.CSVParser", "org.apache.commons.csv.CSVParser", "getRecords", new String[]{}, new String[]{}, false, 2, new String[][]{}, 1), new String[][]{{"ensureCapacity", "int", "0"}});
  assertNotNull(actual);
  assertEquals("java.util.ArrayList", actual.getClass().getName());
  assertEquals("[[a], [b]]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getCurrentLineNumber=2, getRecordNumber=2, isClosed=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput192() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.csv.CSVParser", "org.apache.commons.csv.CSVParser", "parse", new String[]{"java.io.File", "org.apache.commons.csv.CSVFormat"}, new String[]{"<sample:1>", "<null>"}, true); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput193() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.csv.CSVParser", "org.apache.commons.csv.CSVParser", "close", new String[]{}, new String[]{}, false, 6, new String[][]{{"org.apache.commons.csv.CSVParser", "nextRecord", ""}}, 1);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getCurrentLineNumber=0, getRecordNumber=1, isClosed=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput194() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.csv.CSVParser", "org.apache.commons.csv.CSVParser", "getRecords", new String[]{}, new String[]{}, false, 4, new String[][]{}, 2), new String[][]{{"listIterator", "", "2"}});
  assertNotNull(actual);
  assertEquals("java.util.ArrayList$ListItr", actual.getClass().getName());
  assertEquals("{hasNext=true, hasPrevious=false}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getCurrentLineNumber=2, getRecordNumber=2, isClosed=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput195() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.csv.CSVParser", "org.apache.commons.csv.CSVParser", "parse", new String[]{"java.lang.String", "org.apache.commons.csv.CSVFormat"}, new String[]{"ql", "<sample:6>"}, true, 0, null, 2), new String[][]{{"getRecordNumber", "", "7"}});
  assertNotNull(actual);
  assertEquals("java.lang.Long", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput196() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.csv.CSVParser", "org.apache.commons.csv.CSVParser", "getRecords", new String[]{}, new String[]{}, false, 2, new String[][]{}, 2), new String[][]{{"get", "int", "3"}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.csv.CSVRecord", actual.getClass().getName());
  assertEquals("[b] {getComment=null, getRecordNumber=2, isConsistent=true, size=1}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getCurrentLineNumber=2, getRecordNumber=2, isClosed=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput197() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.csv.CSVParser", "org.apache.commons.csv.CSVParser", "close", new String[]{}, new String[]{}, false, 4, new String[][]{{"org.apache.commons.csv.CSVParser", "getRecords", "java.util.Collection", "<null>"}}, 1);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getCurrentLineNumber=1, getRecordNumber=1, isClosed=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput198() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.csv.CSVParser", "org.apache.commons.csv.CSVParser", "parse", new String[]{"java.lang.String", "org.apache.commons.csv.CSVFormat"}, new String[]{"forms", "<sample:6>"}, true), new String[][]{{"getRecords", "java.util.Collection", "1"}});
  assertNotNull(actual);
  assertEquals("java.util.ArrayList", actual.getClass().getName());
  assertEquals("[a, 0, [forms]]", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput199() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.csv.CSVParser", "org.apache.commons.csv.CSVParser", "nextRecord", new String[]{}, new String[]{}, false, 6, new String[][]{{"org.apache.commons.csv.CSVParser", "close", ""}}, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.io.IOException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput200() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.csv.CSVParser", "org.apache.commons.csv.CSVParser", "getRecords", new String[]{}, new String[]{}, false, 6, new String[][]{}, 1), new String[][]{{"addAll", "java.util.Collection", "5"}, {"addAll", "java.util.Collection", "7"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getCurrentLineNumber=0, getRecordNumber=1, isClosed=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput201() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.csv.CSVParser", "org.apache.commons.csv.CSVParser", "parse", new String[]{"java.lang.String", "org.apache.commons.csv.CSVFormat"}, new String[]{"PT0H", "<sample:4>"}, true, 0, null, 1), new String[][]{{"getHeaderMap", "", "2"}});
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput202() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.csv.CSVParser", "org.apache.commons.csv.CSVParser", "getRecords", new String[]{}, new String[]{}, false, 6, new String[][]{}, 3);
  assertNotNull(actual);
  assertEquals("java.util.ArrayList", actual.getClass().getName());
  assertEquals("[[{\", \":1}]]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getCurrentLineNumber=0, getRecordNumber=1, isClosed=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput203() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.csv.CSVParser", "org.apache.commons.csv.CSVParser", "nextRecord", new String[]{}, new String[]{}, false, 6, new String[][]{{"org.apache.commons.csv.CSVParser", "getRecords", "java.util.Collection", "<sample:3>"}}, 3);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getCurrentLineNumber=0, getRecordNumber=1, isClosed=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput204() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.csv.CSVParser", "org.apache.commons.csv.CSVParser", "getRecordNumber", new String[]{}, new String[]{}, false, 4, new String[][]{{"org.apache.commons.csv.CSVParser", "nextRecord", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.Long", actual.getClass().getName());
  assertEquals("1", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getCurrentLineNumber=1, getRecordNumber=1, isClosed=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput205() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.csv.CSVParser", "org.apache.commons.csv.CSVParser", "getRecords", new String[]{"java.util.Collection"}, new String[]{"<sample:0>"}, false, 6, new String[][]{}, 3), new String[][]{{"add", "java.lang.Object", "1"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getCurrentLineNumber=0, getRecordNumber=1, isClosed=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput206() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.csv.CSVParser", "org.apache.commons.csv.CSVParser", "nextRecord", new String[]{}, new String[]{}, false, 6, new String[][]{}), new String[][]{{"get", "int", "5"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.ArrayIndexOutOfBoundsException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput207() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.csv.CSVParser", "org.apache.commons.csv.CSVParser", "getRecords", new String[]{}, new String[]{}, false, 2, new String[][]{}, 3);
  assertNotNull(actual);
  assertEquals("java.util.ArrayList", actual.getClass().getName());
  assertEquals("[[a], [b]]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getCurrentLineNumber=2, getRecordNumber=2, isClosed=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput208() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.csv.CSVParser", "org.apache.commons.csv.CSVParser", "iterator", new String[]{}, new String[]{}, false, 6, new String[][]{{"org.apache.commons.csv.CSVParser", "iterator", ""}, {"org.apache.commons.csv.CSVParser", "nextRecord", ""}}, 3), new String[][]{{"next", "", "7"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.util.NoSuchElementException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput209() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.csv.CSVParser", "org.apache.commons.csv.CSVParser", "getRecordNumber", new String[]{}, new String[]{}, false, 6, new String[][]{{"org.apache.commons.csv.CSVParser", "getRecords", "java.util.Collection", "<sample:1>"}});
  assertNotNull(actual);
  assertEquals("java.lang.Long", actual.getClass().getName());
  assertEquals("1", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getCurrentLineNumber=0, getRecordNumber=1, isClosed=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput210() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.csv.CSVParser", "org.apache.commons.csv.CSVParser", "getCurrentLineNumber", new String[]{}, new String[]{}, false, 4, new String[][]{{"org.apache.commons.csv.CSVParser", "getHeaderMap", ""}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Long", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getCurrentLineNumber=0, getRecordNumber=0, isClosed=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput211() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.csv.CSVParser", "org.apache.commons.csv.CSVParser", "getRecords", new String[]{"java.util.Collection"}, new String[]{"<sample:0>"}, false, 4, new String[][]{}, 2);
  assertNotNull(actual);
  assertEquals("java.util.ArrayList", actual.getClass().getName());
  assertEquals("[, [a,b], [1,2]]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getCurrentLineNumber=2, getRecordNumber=2, isClosed=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput212() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.csv.CSVParser", "org.apache.commons.csv.CSVParser", "parse", new String[]{"java.lang.String", "org.apache.commons.csv.CSVFormat"}, new String[]{"TImLE", "<null>"}, true, 0, null, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput213() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.csv.CSVParser", "org.apache.commons.csv.CSVParser", "getHeaderMap", new String[]{}, new String[]{}, false, 6, new String[][]{{"org.apache.commons.csv.CSVParser", "nextRecord", ""}}, 3);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getCurrentLineNumber=0, getRecordNumber=1, isClosed=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput214() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.csv.CSVParser", "org.apache.commons.csv.CSVParser", "close", new String[]{}, new String[]{}, false, 2, new String[][]{{"org.apache.commons.csv.CSVParser", "getRecords", "java.util.Collection", "<sample:2>"}}, 1);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getCurrentLineNumber=2, getRecordNumber=2, isClosed=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput215() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.csv.CSVParser", "org.apache.commons.csv.CSVParser", "parse", new String[]{"java.lang.String", "org.apache.commons.csv.CSVFormat"}, new String[]{"", "<null>"}, true, 0, null, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput216() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.csv.CSVParser", "org.apache.commons.csv.CSVParser", "iterator", new String[]{}, new String[]{}, false, 4, new String[][]{{"org.apache.commons.csv.CSVParser", "getCurrentLineNumber", ""}}), new String[][]{{"next", "", "1"}, {"getRecordNumber", "", "6"}});
  assertNotNull(actual);
  assertEquals("java.lang.Long", actual.getClass().getName());
  assertEquals("1", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getCurrentLineNumber=1, getRecordNumber=1, isClosed=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput217() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.csv.CSVParser", "org.apache.commons.csv.CSVParser", "getRecords", new String[]{}, new String[]{}, false, 6, new String[][]{}, 3), new String[][]{{"indexOf", "java.lang.Object", "4"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("-1", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getCurrentLineNumber=0, getRecordNumber=1, isClosed=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput218() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.csv.CSVParser", "org.apache.commons.csv.CSVParser", "getRecordNumber", new String[]{}, new String[]{}, false, 2, new String[][]{{"org.apache.commons.csv.CSVParser", "nextRecord", ""}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Long", actual.getClass().getName());
  assertEquals("1", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getCurrentLineNumber=1, getRecordNumber=1, isClosed=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput219() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.csv.CSVParser", "org.apache.commons.csv.CSVParser", "isClosed", new String[]{}, new String[]{}, false, 6, new String[][]{{"org.apache.commons.csv.CSVParser", "getRecords", "java.util.Collection", "<sample:0>"}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getCurrentLineNumber=0, getRecordNumber=1, isClosed=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput220() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.csv.CSVParser", "org.apache.commons.csv.CSVParser", "iterator", new String[]{}, new String[]{}, false, 6, new String[][]{{"org.apache.commons.csv.CSVParser", "getRecords", "java.util.Collection", "<sample:0>"}}), new String[][]{{"hasNext", "", "1"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getCurrentLineNumber=0, getRecordNumber=1, isClosed=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput221() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.csv.CSVParser", "org.apache.commons.csv.CSVParser", "getCurrentLineNumber", new String[]{}, new String[]{}, false, 6, new String[][]{{"org.apache.commons.csv.CSVParser", "getRecords", "java.util.Collection", "<sample:2>"}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Long", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getCurrentLineNumber=0, getRecordNumber=1, isClosed=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput222() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.csv.CSVParser", "org.apache.commons.csv.CSVParser", "iterator", new String[]{}, new String[]{}, false, 2, new String[][]{{"org.apache.commons.csv.CSVParser", "getRecords", ""}, {"org.apache.commons.csv.CSVParser", "getRecords", ""}}, 2);
  assertNotNull(actual);
  assertEquals("receiver state after the call", "{getCurrentLineNumber=2, getRecordNumber=2, isClosed=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput223() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.csv.CSVParser", "org.apache.commons.csv.CSVParser", "nextRecord", new String[]{}, new String[]{}, false, 6, new String[][]{}, 1), new String[][]{{"isSet", "java.lang.String", "6"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getCurrentLineNumber=0, getRecordNumber=1, isClosed=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput224() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.csv.CSVParser", "org.apache.commons.csv.CSVParser", "nextRecord", new String[]{}, new String[]{}, false, 6, new String[][]{{"org.apache.commons.csv.CSVParser", "close", ""}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.io.IOException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput225() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.csv.CSVParser", "org.apache.commons.csv.CSVParser", "iterator", new String[]{}, new String[]{}, false, 3, new String[][]{{"org.apache.commons.csv.CSVParser", "iterator", ""}}, 2);
  assertNotNull(actual);
  assertEquals("receiver state after the call", "{getCurrentLineNumber=!NullPointerException, getRecordNumber=0, isClosed=!NullPointerException}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput226() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.csv.CSVParser", "org.apache.commons.csv.CSVParser", "parse", new String[]{"java.io.File", "org.apache.commons.csv.CSVFormat"}, new String[]{"<sample:4>", "<null>"}, true, 0, null, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput227() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.csv.CSVParser", "org.apache.commons.csv.CSVParser", "iterator", new String[]{}, new String[]{}, false, 6, new String[][]{}, 3);
  assertNotNull(actual);
  assertEquals("receiver state after the call", "{getCurrentLineNumber=0, getRecordNumber=0, isClosed=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput228() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.csv.CSVParser", "org.apache.commons.csv.CSVParser", "getCurrentLineNumber", new String[]{}, new String[]{}, false, 6, new String[][]{{"org.apache.commons.csv.CSVParser", "close", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.Long", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getCurrentLineNumber=0, getRecordNumber=0, isClosed=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput229() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.csv.CSVParser", "org.apache.commons.csv.CSVParser", "close", new String[]{}, new String[]{}, false, 6, new String[][]{{"org.apache.commons.csv.CSVParser", "getRecords", "java.util.Collection", "<null>"}}, 3);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getCurrentLineNumber=0, getRecordNumber=1, isClosed=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput230() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.csv.CSVParser", "org.apache.commons.csv.CSVParser", "iterator", new String[]{}, new String[]{}, false, 2, new String[][]{{"org.apache.commons.csv.CSVParser", "getRecords", ""}}, 1), new String[][]{{"next", "", "1"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.util.NoSuchElementException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput231() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.csv.CSVParser", "org.apache.commons.csv.CSVParser", "nextRecord", new String[]{}, new String[]{}, false, 4, new String[][]{}, 3), new String[][]{{"isConsistent", "", "7"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getCurrentLineNumber=1, getRecordNumber=1, isClosed=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput232() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.csv.CSVParser", "org.apache.commons.csv.CSVParser", "iterator", new String[]{}, new String[]{}, false, 6, new String[][]{}, 3), new String[][]{{"next", "", "6"}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.csv.CSVRecord", actual.getClass().getName());
  assertEquals("[{\", \":1}] {getComment=null, getRecordNumber=1, isConsistent=true, size=2}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getCurrentLineNumber=0, getRecordNumber=1, isClosed=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput233() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.csv.CSVParser", "org.apache.commons.csv.CSVParser", "iterator", new String[]{}, new String[]{}, false, 4, new String[][]{{"org.apache.commons.csv.CSVParser", "getRecords", ""}, {"org.apache.commons.csv.CSVParser", "nextRecord", ""}}, 3), new String[][]{{"hasNext", "", "5"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getCurrentLineNumber=2, getRecordNumber=2, isClosed=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput234() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.csv.CSVParser", "org.apache.commons.csv.CSVParser", "getCurrentLineNumber", new String[]{}, new String[]{}, false, 6, new String[][]{{"org.apache.commons.csv.CSVParser", "nextRecord", ""}, {"org.apache.commons.csv.CSVParser", "getCurrentLineNumber", ""}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Long", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getCurrentLineNumber=0, getRecordNumber=1, isClosed=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput235() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.csv.CSVParser", "org.apache.commons.csv.CSVParser", "getRecords", new String[]{}, new String[]{}, false, 6, new String[][]{}, 2), new String[][]{{"get", "int", "2"}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.csv.CSVRecord", actual.getClass().getName());
  assertEquals("[{\", \":1}] {getComment=null, getRecordNumber=1, isConsistent=true, size=2}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getCurrentLineNumber=0, getRecordNumber=1, isClosed=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput236() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.csv.CSVParser", "org.apache.commons.csv.CSVParser", "getRecordNumber", new String[]{}, new String[]{}, false, 2, new String[][]{{"org.apache.commons.csv.CSVParser", "close", ""}, {"org.apache.commons.csv.CSVParser", "getRecordNumber", ""}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Long", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getCurrentLineNumber=0, getRecordNumber=0, isClosed=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput237() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.csv.CSVParser", "org.apache.commons.csv.CSVParser", "parse", new String[]{"java.lang.String", "org.apache.commons.csv.CSVFormat"}, new String[]{"0xFFFoFF+FF", "<sample:6>"}, true, 0, null, 1), new String[][]{{"getRecordNumber", "", "7"}});
  assertNotNull(actual);
  assertEquals("java.lang.Long", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput238() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.csv.CSVParser", "org.apache.commons.csv.CSVParser", "iterator", new String[]{}, new String[]{}, false, 6, new String[][]{}), new String[][]{{"next", "", "4"}, {"get", "int", "2"}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("{\"", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getCurrentLineNumber=0, getRecordNumber=1, isClosed=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput239() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.csv.CSVParser", "org.apache.commons.csv.CSVParser", "nextRecord", new String[]{}, new String[]{}, false, 4, new String[][]{{"org.apache.commons.csv.CSVParser", "getRecordNumber", ""}}, 1), new String[][]{{"isConsistent", "", "7"}, {"get", "java.lang.String", "0"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalStateException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput240() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.csv.CSVParser", "org.apache.commons.csv.CSVParser", "parse", new String[]{"java.net.URL", "java.nio.charset.Charset", "org.apache.commons.csv.CSVFormat"}, new String[]{"<sample:3>", "<sample:6>", "<sample:10>"}, true, 0, null, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput241() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.csv.CSVParser", "org.apache.commons.csv.CSVParser", "parse", new String[]{"java.net.URL", "java.nio.charset.Charset", "org.apache.commons.csv.CSVFormat"}, new String[]{"<sample:7>", "<sample:1>", "<null>"}, true, 0, null, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput242() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.csv.CSVParser", "org.apache.commons.csv.CSVParser", "getRecords", new String[]{}, new String[]{}, false, 4, new String[][]{{"org.apache.commons.csv.CSVParser", "getHeaderMap", ""}}, 2), new String[][]{{"lastIndexOf", "java.lang.Object", "5"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("-1", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getCurrentLineNumber=2, getRecordNumber=2, isClosed=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput243() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.csv.CSVParser", "org.apache.commons.csv.CSVParser", "isClosed", new String[]{}, new String[]{}, false, 4, new String[][]{{"org.apache.commons.csv.CSVParser", "getRecords", "java.util.Collection", "<sample:2>"}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getCurrentLineNumber=2, getRecordNumber=2, isClosed=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput244() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.csv.CSVParser", "org.apache.commons.csv.CSVParser", "close", new String[]{}, new String[]{}, false, 4, new String[][]{{"org.apache.commons.csv.CSVParser", "nextRecord", ""}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getCurrentLineNumber=1, getRecordNumber=1, isClosed=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput245() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.csv.CSVParser", "org.apache.commons.csv.CSVParser", "nextRecord", new String[]{}, new String[]{}, false, 3, new String[][]{}, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput246() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.csv.CSVParser", "org.apache.commons.csv.CSVParser", "iterator", new String[]{}, new String[]{}, false, 6, new String[][]{{"org.apache.commons.csv.CSVParser", "close", ""}, {"org.apache.commons.csv.CSVParser", "isClosed", ""}}, 1);
  assertNotNull(actual);
  assertEquals("receiver state after the call", "{getCurrentLineNumber=0, getRecordNumber=0, isClosed=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput247() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.csv.CSVParser", "org.apache.commons.csv.CSVParser", "parse", new String[]{"java.lang.String", "org.apache.commons.csv.CSVFormat"}, new String[]{"{_a\":1}", "<sample:6>"}, true, 0, null, 1), new String[][]{{"close", "", "6"}, {"getRecords", "java.util.Collection", "6"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.io.IOException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput248() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.csv.CSVParser", "org.apache.commons.csv.CSVParser", "nextRecord", new String[]{}, new String[]{}, false, 6, new String[][]{}, 2), new String[][]{{"isSet", "java.lang.String", "2"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getCurrentLineNumber=0, getRecordNumber=1, isClosed=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput249() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.csv.CSVParser", "org.apache.commons.csv.CSVParser", "iterator", new String[]{}, new String[]{}, false, 2, new String[][]{{"org.apache.commons.csv.CSVParser", "getCurrentLineNumber", ""}}, 1), new String[][]{{"next", "", "0"}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.csv.CSVRecord", actual.getClass().getName());
  assertEquals("[a] {getComment=null, getRecordNumber=1, isConsistent=true, size=1}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getCurrentLineNumber=1, getRecordNumber=1, isClosed=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput250() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.csv.CSVParser", "org.apache.commons.csv.CSVParser", "parse", new String[]{"java.lang.String", "org.apache.commons.csv.CSVFormat"}, new String[]{" ", "<sample:4>"}, true, 0, null, 3);
  assertNotNull(actual);
  assertEquals("org.apache.commons.csv.CSVParser", actual.getClass().getName());
  assertEquals("{getCurrentLineNumber=0, getRecordNumber=0, isClosed=false}", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput251() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.csv.CSVParser", "org.apache.commons.csv.CSVParser", "nextRecord", new String[]{}, new String[]{}, false, 2, new String[][]{{"org.apache.commons.csv.CSVParser", "iterator", ""}}, 1), new String[][]{{"getRecordNumber", "", "4"}});
  assertNotNull(actual);
  assertEquals("java.lang.Long", actual.getClass().getName());
  assertEquals("1", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getCurrentLineNumber=1, getRecordNumber=1, isClosed=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput252() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.csv.CSVParser", "org.apache.commons.csv.CSVParser", "getRecords", new String[]{"java.util.Collection"}, new String[]{"<sample:4>"}, false, 4, new String[][]{}, 2);
  assertNotNull(actual);
  assertEquals("java.util.ArrayList", actual.getClass().getName());
  assertEquals("[, a, [a,b], [1,2]]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getCurrentLineNumber=2, getRecordNumber=2, isClosed=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput253() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.csv.CSVParser", "org.apache.commons.csv.CSVParser", "iterator", new String[]{}, new String[]{}, false, 2, new String[][]{{"org.apache.commons.csv.CSVParser", "getRecordNumber", ""}}), new String[][]{{"next", "", "1"}, {"isSet", "java.lang.String", "0"}, {"iterator", "", "4"}});
  assertNotNull(actual);
  assertEquals("java.util.Arrays$ArrayItr", actual.getClass().getName());
  assertEquals("{hasNext=true}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getCurrentLineNumber=1, getRecordNumber=1, isClosed=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput254() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.csv.CSVParser", "org.apache.commons.csv.CSVParser", "parse", new String[]{"java.lang.String", "org.apache.commons.csv.CSVFormat"}, new String[]{"string", "<sample:4>"}, true, 0, null, 1), new String[][]{{"getRecords", "", "1"}});
  assertNotNull(actual);
  assertEquals("java.util.ArrayList", actual.getClass().getName());
  assertEquals("[[string]]", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput255() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.csv.CSVParser", "org.apache.commons.csv.CSVParser", "getRecords", new String[]{"java.util.Collection"}, new String[]{"<sample:1>"}, false, 2, new String[][]{{"org.apache.commons.csv.CSVParser", "getRecords", "java.util.Collection", "<empty>"}}, 2), new String[][]{{"listIterator", "int", "0"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IndexOutOfBoundsException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput256() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.csv.CSVParser", "org.apache.commons.csv.CSVParser", "isClosed", new String[]{}, new String[]{}, false, 4, new String[][]{{"org.apache.commons.csv.CSVParser", "nextRecord", ""}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getCurrentLineNumber=1, getRecordNumber=1, isClosed=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput257() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.csv.CSVParser", "org.apache.commons.csv.CSVParser", "nextRecord", new String[]{}, new String[]{}, false, 4, new String[][]{}, 1);
  assertNotNull(actual);
  assertEquals("org.apache.commons.csv.CSVRecord", actual.getClass().getName());
  assertEquals("[a,b] {getComment=null, getRecordNumber=1, isConsistent=true, size=1}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getCurrentLineNumber=1, getRecordNumber=1, isClosed=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput258() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.csv.CSVParser", "org.apache.commons.csv.CSVParser", "nextRecord", new String[]{}, new String[]{}, false, 6, new String[][]{}, 3);
  assertNotNull(actual);
  assertEquals("org.apache.commons.csv.CSVRecord", actual.getClass().getName());
  assertEquals("[{\", \":1}] {getComment=null, getRecordNumber=1, isConsistent=true, size=2}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getCurrentLineNumber=0, getRecordNumber=1, isClosed=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput259() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.csv.CSVParser", "org.apache.commons.csv.CSVParser", "getCurrentLineNumber", new String[]{}, new String[]{}, false, 4, new String[][]{{"org.apache.commons.csv.CSVParser", "close", ""}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Long", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getCurrentLineNumber=0, getRecordNumber=0, isClosed=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput260() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.csv.CSVParser", "org.apache.commons.csv.CSVParser", "parse", new String[]{"java.lang.String", "org.apache.commons.csv.CSVFormat"}, new String[]{"IT\nE", "<sample:8>"}, true, 0, null, 2);
  assertNotNull(actual);
  assertEquals("org.apache.commons.csv.CSVParser", actual.getClass().getName());
  assertEquals("{getCurrentLineNumber=0, getRecordNumber=0, isClosed=false}", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput261() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.csv.CSVParser", "org.apache.commons.csv.CSVParser", "parse", new String[]{"java.lang.String", "org.apache.commons.csv.CSVFormat"}, new String[]{"TITCE", "<sample:8>"}, true, 0, null, 3), new String[][]{{"getCurrentLineNumber", "", "7"}});
  assertNotNull(actual);
  assertEquals("java.lang.Long", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput262() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.csv.CSVParser", "org.apache.commons.csv.CSVParser", "getHeaderMap", new String[]{}, new String[]{}, false, 6, new String[][]{{"org.apache.commons.csv.CSVParser", "getRecords", "java.util.Collection", "<sample:2>"}}, 2);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getCurrentLineNumber=0, getRecordNumber=1, isClosed=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput263() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.csv.CSVParser", "org.apache.commons.csv.CSVParser", "iterator", new String[]{}, new String[]{}, false, 4, new String[][]{}, 1), new String[][]{{"next", "", "5"}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.csv.CSVRecord", actual.getClass().getName());
  assertEquals("[a,b] {getComment=null, getRecordNumber=1, isConsistent=true, size=1}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getCurrentLineNumber=1, getRecordNumber=1, isClosed=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput264() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.csv.CSVParser", "org.apache.commons.csv.CSVParser", "iterator", new String[]{}, new String[]{}, false, 6, new String[][]{{"org.apache.commons.csv.CSVParser", "getRecords", ""}}, 2), new String[][]{{"next", "", "0"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.util.NoSuchElementException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput265() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.csv.CSVParser", "org.apache.commons.csv.CSVParser", "iterator", new String[]{}, new String[]{}, false, 4, new String[][]{}, 1), new String[][]{{"next", "", "5"}, {"isMapped", "java.lang.String", "0"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getCurrentLineNumber=1, getRecordNumber=1, isClosed=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput266() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.csv.CSVParser", "org.apache.commons.csv.CSVParser", "close", new String[]{}, new String[]{}, false, 4, new String[][]{{"org.apache.commons.csv.CSVParser", "getRecords", ""}}, 2);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getCurrentLineNumber=2, getRecordNumber=2, isClosed=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput267() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.csv.CSVParser", "org.apache.commons.csv.CSVParser", "close", new String[]{}, new String[]{}, false, 4, new String[][]{{"org.apache.commons.csv.CSVParser", "getRecords", ""}}, 3);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getCurrentLineNumber=2, getRecordNumber=2, isClosed=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput268() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.csv.CSVParser", "org.apache.commons.csv.CSVParser", "getRecords", new String[]{}, new String[]{}, false, 6, new String[][]{{"org.apache.commons.csv.CSVParser", "getHeaderMap", ""}, {"org.apache.commons.csv.CSVParser", "nextRecord", ""}}, 2), new String[][]{{"clear", "", "1"}});
  assertNotNull(actual);
  assertEquals("java.util.ArrayList", actual.getClass().getName());
  assertEquals("[]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getCurrentLineNumber=0, getRecordNumber=1, isClosed=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput269() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.csv.CSVParser", "org.apache.commons.csv.CSVParser", "parse", new String[]{"java.lang.String", "org.apache.commons.csv.CSVFormat"}, new String[]{"aaaaaaaaaaaaaaaaaaaaaaaaaaaaaa2B20-01-01", "<sample:6>"}, true), new String[][]{{"getHeaderMap", "", "0"}});
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput270() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.csv.CSVParser", "org.apache.commons.csv.CSVParser", "getRecordNumber", new String[]{}, new String[]{}, false, 4, new String[][]{{"org.apache.commons.csv.CSVParser", "getRecords", "java.util.Collection", "<sample:2>"}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Long", actual.getClass().getName());
  assertEquals("2", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getCurrentLineNumber=2, getRecordNumber=2, isClosed=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput271() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.csv.CSVParser", "org.apache.commons.csv.CSVParser", "parse", new String[]{"java.lang.String", "org.apache.commons.csv.CSVFormat"}, new String[]{"1E5", "<sample:2>"}, true, 0, null, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalStateException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput272() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.csv.CSVParser", "org.apache.commons.csv.CSVParser", "parse", new String[]{"java.lang.String", "org.apache.commons.csv.CSVFormat"}, new String[]{"0x1F", "<sample:10>"}, true, 0, null, 3), new String[][]{{"getRecords", "java.util.Collection", "5"}});
  assertNotNull(actual);
  assertEquals("java.util.ArrayList", actual.getClass().getName());
  assertEquals("[a, 0, sample, [, x1F]]", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput273() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.csv.CSVParser", "org.apache.commons.csv.CSVParser", "isClosed", new String[]{}, new String[]{}, false, 4, new String[][]{{"org.apache.commons.csv.CSVParser", "getRecords", "java.util.Collection", "<sample:0>"}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getCurrentLineNumber=2, getRecordNumber=2, isClosed=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput274() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.csv.CSVParser", "org.apache.commons.csv.CSVParser", "getRecords", new String[]{"java.util.Collection"}, new String[]{"<sample:2>"}, false, 6, new String[][]{}, 2);
  assertNotNull(actual);
  assertEquals("java.util.ArrayList", actual.getClass().getName());
  assertEquals("[0, sample, , [{\", \":1}]]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getCurrentLineNumber=0, getRecordNumber=1, isClosed=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput275() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.csv.CSVParser", "org.apache.commons.csv.CSVParser", "iterator", new String[]{}, new String[]{}, false, 2, new String[][]{}, 3), new String[][]{{"next", "", "0"}, {"getRecordNumber", "", "3"}});
  assertNotNull(actual);
  assertEquals("java.lang.Long", actual.getClass().getName());
  assertEquals("1", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getCurrentLineNumber=1, getRecordNumber=1, isClosed=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput276() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.csv.CSVParser", "org.apache.commons.csv.CSVParser", "getRecordNumber", new String[]{}, new String[]{}, false, 6, new String[][]{{"org.apache.commons.csv.CSVParser", "getRecords", ""}, {"org.apache.commons.csv.CSVParser", "close", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.Long", actual.getClass().getName());
  assertEquals("1", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getCurrentLineNumber=0, getRecordNumber=1, isClosed=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput277() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.csv.CSVParser", "org.apache.commons.csv.CSVParser", "iterator", new String[]{}, new String[]{}, false, 4, new String[][]{{"org.apache.commons.csv.CSVParser", "getRecordNumber", ""}}, 2), new String[][]{{"next", "", "2"}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.csv.CSVRecord", actual.getClass().getName());
  assertEquals("[a,b] {getComment=null, getRecordNumber=1, isConsistent=true, size=1}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getCurrentLineNumber=1, getRecordNumber=1, isClosed=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput278() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.csv.CSVParser", "org.apache.commons.csv.CSVParser", "getRecordNumber", new String[]{}, new String[]{}, false, 4, new String[][]{{"org.apache.commons.csv.CSVParser", "getRecords", "java.util.Collection", "<sample:3>"}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Long", actual.getClass().getName());
  assertEquals("2", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getCurrentLineNumber=2, getRecordNumber=2, isClosed=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput279() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.csv.CSVParser", "org.apache.commons.csv.CSVParser", "getRecordNumber", new String[]{}, new String[]{}, false, 4, new String[][]{{"org.apache.commons.csv.CSVParser", "getRecords", "java.util.Collection", "<sample:6>"}, {"org.apache.commons.csv.CSVParser", "close", ""}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Long", actual.getClass().getName());
  assertEquals("2", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getCurrentLineNumber=2, getRecordNumber=2, isClosed=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput280() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.csv.CSVParser", "org.apache.commons.csv.CSVParser", "isClosed", new String[]{}, new String[]{}, false, 2, new String[][]{{"org.apache.commons.csv.CSVParser", "getRecords", ""}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getCurrentLineNumber=2, getRecordNumber=2, isClosed=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput281() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.csv.CSVParser", "org.apache.commons.csv.CSVParser", "isClosed", new String[]{}, new String[]{}, false, 6, new String[][]{{"org.apache.commons.csv.CSVParser", "close", ""}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getCurrentLineNumber=0, getRecordNumber=0, isClosed=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput282() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.csv.CSVParser", "org.apache.commons.csv.CSVParser", "nextRecord", new String[]{}, new String[]{}, false, 4, new String[][]{{"org.apache.commons.csv.CSVParser", "getRecords", "java.util.Collection", "<sample:6>"}}, 2);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getCurrentLineNumber=2, getRecordNumber=2, isClosed=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput283() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.csv.CSVParser", "org.apache.commons.csv.CSVParser", "nextRecord", new String[]{}, new String[]{}, false, 4, new String[][]{{"org.apache.commons.csv.CSVParser", "nextRecord", ""}}, 1), new String[][]{{"isSet", "java.lang.String", "6"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getCurrentLineNumber=2, getRecordNumber=2, isClosed=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput284() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.csv.CSVParser", "org.apache.commons.csv.CSVParser", "parse", new String[]{"java.lang.String", "org.apache.commons.csv.CSVFormat"}, new String[]{".72020-02-30T25:61:61", "<sample:4>"}, true), new String[][]{{"getRecords", "", "4"}, {"iterator", "", "7"}});
  assertNotNull(actual);
  assertEquals("java.util.ArrayList$Itr", actual.getClass().getName());
  assertEquals("{hasNext=true}", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput285() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.csv.CSVParser", "org.apache.commons.csv.CSVParser", "parse", new String[]{"java.io.File", "org.apache.commons.csv.CSVFormat"}, new String[]{"<sample:2>", "<null>"}, true, 0, null, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput286() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.csv.CSVParser", "org.apache.commons.csv.CSVParser", "getCurrentLineNumber", new String[]{}, new String[]{}, false, 6, new String[][]{{"org.apache.commons.csv.CSVParser", "getRecords", ""}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Long", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getCurrentLineNumber=0, getRecordNumber=1, isClosed=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput287() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.csv.CSVParser", "org.apache.commons.csv.CSVParser", "iterator", new String[]{}, new String[]{}, false, 2, new String[][]{}, 2), new String[][]{{"next", "", "2"}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.csv.CSVRecord", actual.getClass().getName());
  assertEquals("[a] {getComment=null, getRecordNumber=1, isConsistent=true, size=1}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getCurrentLineNumber=1, getRecordNumber=1, isClosed=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput288() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.csv.CSVParser", "org.apache.commons.csv.CSVParser", "iterator", new String[]{}, new String[]{}, false, 6, new String[][]{}, 2), new String[][]{{"next", "", "6"}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.csv.CSVRecord", actual.getClass().getName());
  assertEquals("[{\", \":1}] {getComment=null, getRecordNumber=1, isConsistent=true, size=2}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getCurrentLineNumber=0, getRecordNumber=1, isClosed=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput289() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.csv.CSVParser", "org.apache.commons.csv.CSVParser", "iterator", new String[]{}, new String[]{}, false, 6, new String[][]{{"org.apache.commons.csv.CSVParser", "getRecordNumber", ""}}, 2), new String[][]{{"next", "", "1"}, {"size", "", "6"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("2", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getCurrentLineNumber=0, getRecordNumber=1, isClosed=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput290() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.csv.CSVParser", "org.apache.commons.csv.CSVParser", "getRecordNumber", new String[]{}, new String[]{}, false, 6, new String[][]{{"org.apache.commons.csv.CSVParser", "close", ""}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Long", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getCurrentLineNumber=0, getRecordNumber=0, isClosed=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput291() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.csv.CSVParser", "org.apache.commons.csv.CSVParser", "parse", new String[]{"java.lang.String", "org.apache.commons.csv.CSVFormat"}, new String[]{"12:3(0:45", "<sample:4>"}, true), new String[][]{{"getRecords", "java.util.Collection", "7"}, {"lastIndexOf", "java.lang.Object", "0"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("-1", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput292() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.csv.CSVParser", "org.apache.commons.csv.CSVParser", "parse", new String[]{"java.io.File", "org.apache.commons.csv.CSVFormat"}, new String[]{"<null>", "<sample:7>"}, true, 0, null, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput293() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.csv.CSVParser", "org.apache.commons.csv.CSVParser", "getCurrentLineNumber", new String[]{}, new String[]{}, false, 2, new String[][]{{"org.apache.commons.csv.CSVParser", "nextRecord", ""}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Long", actual.getClass().getName());
  assertEquals("1", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getCurrentLineNumber=1, getRecordNumber=1, isClosed=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput294() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.csv.CSVParser", "org.apache.commons.csv.CSVParser", "isClosed", new String[]{}, new String[]{}, false, 6, new String[][]{{"org.apache.commons.csv.CSVParser", "getRecords", "java.util.Collection", "<sample:2>"}, {"org.apache.commons.csv.CSVParser", "close", ""}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getCurrentLineNumber=0, getRecordNumber=1, isClosed=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput295() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.csv.CSVParser", "org.apache.commons.csv.CSVParser", "nextRecord", new String[]{}, new String[]{}, false, 4, new String[][]{}, 3), new String[][]{{"getRecordNumber", "", "7"}});
  assertNotNull(actual);
  assertEquals("java.lang.Long", actual.getClass().getName());
  assertEquals("1", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getCurrentLineNumber=1, getRecordNumber=1, isClosed=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput296() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.csv.CSVParser", "org.apache.commons.csv.CSVParser", "nextRecord", new String[]{}, new String[]{}, false, 6, new String[][]{}, 2), new String[][]{{"get", "java.lang.String", "3"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalStateException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput297() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.csv.CSVParser", "org.apache.commons.csv.CSVParser", "parse", new String[]{"java.lang.String", "org.apache.commons.csv.CSVFormat"}, new String[]{"<", "<sample:6>"}, true, 0, null, 3), new String[][]{{"iterator", "", "6"}});
  assertNotNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput298() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.csv.CSVParser", "org.apache.commons.csv.CSVParser", "close", new String[]{}, new String[]{}, false, 2, new String[][]{{"org.apache.commons.csv.CSVParser", "nextRecord", ""}}, 2);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getCurrentLineNumber=1, getRecordNumber=1, isClosed=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput299() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.csv.CSVParser", "org.apache.commons.csv.CSVParser", "parse", new String[]{"java.lang.String", "org.apache.commons.csv.CSVFormat"}, new String[]{"00", "<sample:6>"}, true, 0, null, 3), new String[][]{{"getRecords", "java.util.Collection", "7"}});
  assertNotNull(actual);
  assertEquals("java.util.ArrayList", actual.getClass().getName());
  assertEquals("[sample, , [00]]", SearchInputFactory_scaffolding.observe(actual));
 }
}
