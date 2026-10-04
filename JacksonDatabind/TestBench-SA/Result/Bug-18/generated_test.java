package generated.algorithm;

import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;
import static org.junit.Assert.*;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class SimulatedAnnealingGeneratedTest {
 @Test(timeout = 20000)
 public void generatedInput000() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.MappingIterator", "com.fasterxml.jackson.databind.MappingIterator", "hasNextValue", new String[]{}, new String[]{}, false, 6, new String[][]{{"com.fasterxml.jackson.databind.MappingIterator", "readAll", "java.util.List", "<sample:2>"}, {"com.fasterxml.jackson.databind.MappingIterator", "readAll", ""}, {"com.fasterxml.jackson.databind.MappingIterator", "readAll", "java.util.Collection", "<sample:1>"}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{hasNext=false, hasNextValue=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput001() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.MappingIterator", "com.fasterxml.jackson.databind.MappingIterator", "remove", new String[]{}, new String[]{}, false, 19, new String[][]{{"com.fasterxml.jackson.databind.MappingIterator", "next", ""}, {"com.fasterxml.jackson.databind.MappingIterator", "hasNext", ""}, {"com.fasterxml.jackson.databind.MappingIterator", "_resync", ""}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.UnsupportedOperationException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput002() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.MappingIterator", "com.fasterxml.jackson.databind.MappingIterator", "emptyIterator", new String[]{}, new String[]{}, true), new String[][]{{"close", "", "4"}, {"next", "", "5"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.util.NoSuchElementException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput003() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.MappingIterator", "com.fasterxml.jackson.databind.MappingIterator", "_resync", new String[]{}, new String[]{}, false, 19, new String[][]{});
  assertNull(actual);
  assertEquals("receiver state after the call", "{hasNext=true, hasNextValue=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput004() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.MappingIterator", "com.fasterxml.jackson.databind.MappingIterator", "getCurrentLocation", new String[]{}, new String[]{}, false, 10, new String[][]{{"com.fasterxml.jackson.databind.MappingIterator", "next", ""}, {"com.fasterxml.jackson.databind.MappingIterator", "close", ""}, {"com.fasterxml.jackson.databind.MappingIterator", "remove", ""}}, 3);
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.core.JsonLocation", actual.getClass().getName());
  assertEquals("[Source: <a><b>t</b></a>; line: 1, column: 2] {getByteOffset=-1, getCharOffset=1, getColumnNr=2, getLineNr=1}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{hasNext=false, hasNextValue=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput005() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.MappingIterator", "com.fasterxml.jackson.databind.MappingIterator", "readAll", new String[]{}, new String[]{}, false, 4, new String[][]{{"com.fasterxml.jackson.databind.MappingIterator", "getParser", ""}, {"com.fasterxml.jackson.databind.MappingIterator", "next", ""}}, 3), new String[][]{{"isEmpty", "", "0"}, {"iterator", "", "7"}});
  assertNotNull(actual);
  assertEquals("java.util.ArrayList$Itr", actual.getClass().getName());
  assertEquals("{hasNext=false}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{hasNext=false, hasNextValue=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput006() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.MappingIterator", "com.fasterxml.jackson.databind.MappingIterator", "readAll", new String[]{}, new String[]{}, false, 19, new String[][]{}, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.UnsupportedOperationException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput007() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.MappingIterator", "com.fasterxml.jackson.databind.MappingIterator", "_resync", new String[]{}, new String[]{}, false, 19, new String[][]{{"com.fasterxml.jackson.databind.MappingIterator", "readAll", "java.util.Collection", "<sample:1>"}, {"com.fasterxml.jackson.databind.MappingIterator", "getParserSchema", ""}, {"com.fasterxml.jackson.databind.MappingIterator", "readAll", "java.util.List", "<sample:1>"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{hasNext=false, hasNextValue=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput008() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.MappingIterator", "com.fasterxml.jackson.databind.MappingIterator", "getParserSchema", new String[]{}, new String[]{}, false, 2, new String[][]{{"com.fasterxml.jackson.databind.MappingIterator", "getParser", ""}, {"com.fasterxml.jackson.databind.MappingIterator", "_handleMappingException", "com.fasterxml.jackson.databind.JsonMappingException", "<sample:2>"}}, 3);
  assertNull(actual);
  assertEquals("receiver state after the call", "{hasNext=!RuntimeException, hasNextValue=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput009() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.MappingIterator", "com.fasterxml.jackson.databind.MappingIterator", "remove", new String[]{}, new String[]{}, false, 0, null, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.UnsupportedOperationException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput010() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.MappingIterator", "com.fasterxml.jackson.databind.MappingIterator", "close", new String[]{}, new String[]{}, false, 3, new String[][]{{"com.fasterxml.jackson.databind.MappingIterator", "readAll", ""}, {"com.fasterxml.jackson.databind.MappingIterator", "hasNext", ""}}, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput011() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.MappingIterator", "com.fasterxml.jackson.databind.MappingIterator", "readAll", new String[]{"java.util.List"}, new String[]{"<sample:1>"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.MappingIterator", "_throwNoSuchElement", ""}}, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.ArrayIndexOutOfBoundsException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput012() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.MappingIterator", "com.fasterxml.jackson.databind.MappingIterator", "next", new String[]{}, new String[]{}, false, 2, new String[][]{{"com.fasterxml.jackson.databind.MappingIterator", "remove", ""}}, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.RuntimeException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput013() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.MappingIterator", "com.fasterxml.jackson.databind.MappingIterator", "next", new String[]{}, new String[]{}, false, 8, new String[][]{{"com.fasterxml.jackson.databind.MappingIterator", "remove", ""}}, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.util.NoSuchElementException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput014() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.MappingIterator", "com.fasterxml.jackson.databind.MappingIterator", "next", new String[]{}, new String[]{}, false, 15, new String[][]{}, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.ArrayIndexOutOfBoundsException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput015() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.MappingIterator", "com.fasterxml.jackson.databind.MappingIterator", "readAll", new String[]{"java.util.Collection"}, new String[]{"<empty>"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.MappingIterator", "_handleMappingException", "com.fasterxml.jackson.databind.JsonMappingException", "<sample:2>"}}, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.ArrayIndexOutOfBoundsException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput016() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.MappingIterator", "com.fasterxml.jackson.databind.MappingIterator", "readAll", new String[]{"java.util.Collection"}, new String[]{"<sample:1>"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.MappingIterator", "readAll", "java.util.Collection", "<sample:1>"}}, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("com.fasterxml.jackson.core.JsonParseException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput017() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.MappingIterator", "com.fasterxml.jackson.databind.MappingIterator", "hasNextValue", new String[]{}, new String[]{}, false, 6, new String[][]{{"com.fasterxml.jackson.databind.MappingIterator", "readAll", "java.util.List", "<sample:2>"}, {"com.fasterxml.jackson.databind.MappingIterator", "readAll", ""}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{hasNext=false, hasNextValue=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput018() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.MappingIterator", "com.fasterxml.jackson.databind.MappingIterator", "hasNextValue", new String[]{}, new String[]{}, false, 9, new String[][]{{"com.fasterxml.jackson.databind.MappingIterator", "readAll", "java.util.List", "<sample:2>"}, {"com.fasterxml.jackson.databind.MappingIterator", "readAll", ""}}, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("com.fasterxml.jackson.core.JsonParseException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput019() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.MappingIterator", "com.fasterxml.jackson.databind.MappingIterator", "hasNextValue", new String[]{}, new String[]{}, false, 3, new String[][]{{"com.fasterxml.jackson.databind.MappingIterator", "readAll", ""}, {"com.fasterxml.jackson.databind.MappingIterator", "_handleIOException", "java.io.IOException", "<sample:1>"}}, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput020() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.MappingIterator", "com.fasterxml.jackson.databind.MappingIterator", "close", new String[]{}, new String[]{}, false, 14, new String[][]{}, 2);
  assertNull(actual);
  assertEquals("receiver state after the call", "{hasNext=false, hasNextValue=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput021() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.MappingIterator", "com.fasterxml.jackson.databind.MappingIterator", "_handleMappingException", new String[]{"com.fasterxml.jackson.databind.JsonMappingException"}, new String[]{"<sample:3>"}, false, 0, null, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("com.fasterxml.jackson.databind.RuntimeJsonMappingException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput022() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.MappingIterator", "com.fasterxml.jackson.databind.MappingIterator", "nextValue", new String[]{}, new String[]{}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.MappingIterator", "hasNext", ""}, {"com.fasterxml.jackson.databind.MappingIterator", "_throwNoSuchElement", ""}}, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("com.fasterxml.jackson.core.JsonParseException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput023() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.MappingIterator", "com.fasterxml.jackson.databind.MappingIterator", "getParser", new String[]{}, new String[]{}, false, 1, new String[][]{}, 3);
  assertNull(actual);
  assertEquals("receiver state after the call", "{hasNext=false, hasNextValue=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput024() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.MappingIterator", "com.fasterxml.jackson.databind.MappingIterator", "getParser", new String[]{}, new String[]{}, false, 2, new String[][]{{"com.fasterxml.jackson.databind.MappingIterator", "getCurrentLocation", ""}}, 3);
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.core.json.UTF8StreamJsonParser", actual.getClass().getName());
  assertEquals("{canReadObjectId=false, canReadTypeId=false, getBigIntegerValue=!JsonParseException, getBinaryValue=!JsonParseException, getBooleanValue=!JsonParseException, getByteValue=!JsonParseException, getCurre...#474#-733986353", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{hasNext=!RuntimeException, hasNextValue=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput025() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.MappingIterator", "com.fasterxml.jackson.databind.MappingIterator", "getParser", new String[]{}, new String[]{}, false, 3, new String[][]{{"com.fasterxml.jackson.databind.MappingIterator", "getCurrentLocation", ""}}, 3);
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.core.filter.FilteringParserDelegate", actual.getClass().getName());
  assertEquals("{canReadObjectId=!NullPointerException, canReadTypeId=!NullPointerException, getBigIntegerValue=!NullPointerException, getBinaryValue=!NullPointerException, getBooleanValue=!NullPointerException, getB...#544#1145599751", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{hasNext=!NullPointerException, hasNextValue=!NullPointerException}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput026() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.MappingIterator", "com.fasterxml.jackson.databind.MappingIterator", "getParser", new String[]{}, new String[]{}, false, 5, new String[][]{{"com.fasterxml.jackson.databind.MappingIterator", "getCurrentLocation", ""}}, 3);
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.core.json.UTF8StreamJsonParser", actual.getClass().getName());
  assertEquals("{canReadObjectId=false, canReadTypeId=false, getBigIntegerValue=!JsonParseException, getBinaryValue=!JsonParseException, getBooleanValue=!JsonParseException, getByteValue=!JsonParseException, getCurre...#474#-733986353", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{hasNext=!ArrayIndexOutOfBoundsException, hasNextValue=!JsonParseException}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput027() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.MappingIterator", "com.fasterxml.jackson.databind.MappingIterator", "getParser", new String[]{}, new String[]{}, false, 8, new String[][]{{"com.fasterxml.jackson.databind.MappingIterator", "getCurrentLocation", ""}}, 3);
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.core.json.ReaderBasedJsonParser", actual.getClass().getName());
  assertEquals("{canReadObjectId=false, canReadTypeId=false, getBigIntegerValue=!JsonParseException, getBinaryValue=!JsonParseException, getBooleanValue=!JsonParseException, getByteValue=!JsonParseException, getCurre...#474#-733986353", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{hasNext=false, hasNextValue=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput028() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.MappingIterator", "com.fasterxml.jackson.databind.MappingIterator", "getParser", new String[]{}, new String[]{}, false, 9, new String[][]{{"com.fasterxml.jackson.databind.MappingIterator", "getCurrentLocation", ""}}, 3);
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.core.json.ReaderBasedJsonParser", actual.getClass().getName());
  assertEquals("{canReadObjectId=false, canReadTypeId=false, getBigIntegerValue=!JsonParseException, getBinaryValue=!JsonParseException, getBooleanValue=!JsonParseException, getByteValue=!JsonParseException, getCurre...#483#1547596384", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{hasNext=!RuntimeException, hasNextValue=!JsonParseException}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput029() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.MappingIterator", "com.fasterxml.jackson.databind.MappingIterator", "getParser", new String[]{}, new String[]{}, false, 10, new String[][]{}, 3), new String[][]{{"hasTokenId", "int", "7"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{hasNext=!RuntimeException, hasNextValue=!JsonParseException}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput030() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.MappingIterator", "com.fasterxml.jackson.databind.MappingIterator", "getParser", new String[]{}, new String[]{}, false, 13, new String[][]{}, 3), new String[][]{{"isEnabled", "com.fasterxml.jackson.core.JsonParser$Feature", "7"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput031() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.MappingIterator", "com.fasterxml.jackson.databind.MappingIterator", "next", new String[]{}, new String[]{}, false, 4, new String[][]{{"com.fasterxml.jackson.databind.MappingIterator", "next", ""}}, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.util.NoSuchElementException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput032() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.MappingIterator", "com.fasterxml.jackson.databind.MappingIterator", "next", new String[]{}, new String[]{}, false, 5, new String[][]{{"com.fasterxml.jackson.databind.MappingIterator", "next", ""}}, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.RuntimeException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput033() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.MappingIterator", "com.fasterxml.jackson.databind.MappingIterator", "next", new String[]{}, new String[]{}, false, 13, new String[][]{{"com.fasterxml.jackson.databind.MappingIterator", "next", ""}}, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput034() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.MappingIterator", "com.fasterxml.jackson.databind.MappingIterator", "getCurrentLocation", new String[]{}, new String[]{}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.MappingIterator", "readAll", "java.util.Collection", "<sample:3>"}}, 3);
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.core.JsonLocation", actual.getClass().getName());
  assertEquals("[Source: 2; line: 1, column: 2] {getByteOffset=1, getCharOffset=-1, getColumnNr=2, getLineNr=1}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{hasNext=!RuntimeException, hasNextValue=!JsonParseException}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput035() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.MappingIterator", "com.fasterxml.jackson.databind.MappingIterator", "getCurrentLocation", new String[]{}, new String[]{}, false, 1, new String[][]{{"com.fasterxml.jackson.databind.MappingIterator", "readAll", "java.util.Collection", "<sample:1>"}}, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput036() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.MappingIterator", "com.fasterxml.jackson.databind.MappingIterator", "getCurrentLocation", new String[]{}, new String[]{}, false, 2, new String[][]{{"com.fasterxml.jackson.databind.MappingIterator", "readAll", "java.util.Collection", "<sample:1>"}}, 3), new String[][]{{"getCharOffset", "", "0"}});
  assertNotNull(actual);
  assertEquals("java.lang.Long", actual.getClass().getName());
  assertEquals("-1", String.valueOf(actual));
  assertEquals("receiver state after the call", "{hasNext=false, hasNextValue=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput037() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.MappingIterator", "com.fasterxml.jackson.databind.MappingIterator", "getCurrentLocation", new String[]{}, new String[]{}, false, 16, new String[][]{{"com.fasterxml.jackson.databind.MappingIterator", "getParser", ""}, {"com.fasterxml.jackson.databind.MappingIterator", "readAll", "java.util.Collection", "<sample:1>"}}, 2), new String[][]{{"getCharOffset", "", "0"}});
  assertNotNull(actual);
  assertEquals("java.lang.Long", actual.getClass().getName());
  assertEquals("2", String.valueOf(actual));
  assertEquals("receiver state after the call", "{hasNext=false, hasNextValue=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput038() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.MappingIterator", "com.fasterxml.jackson.databind.MappingIterator", "getCurrentLocation", new String[]{}, new String[]{}, false, 17, new String[][]{{"com.fasterxml.jackson.databind.MappingIterator", "getParser", ""}, {"com.fasterxml.jackson.databind.MappingIterator", "readAll", "java.util.Collection", "<sample:1>"}}, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput039() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.MappingIterator", "com.fasterxml.jackson.databind.MappingIterator", "_handleIOException", new String[]{"java.io.IOException"}, new String[]{"<sample:5>"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.MappingIterator", "readAll", "java.util.Collection", "<sample:3>"}, {"com.fasterxml.jackson.databind.MappingIterator", "_throwNoSuchElement", ""}, {"com.fasterxml.jackson.databind.MappingIterator", "readAll", "java.util.Collection", "<sample:0>"}}, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.RuntimeException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput040() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.MappingIterator", "com.fasterxml.jackson.databind.MappingIterator", "_handleIOException", new String[]{"java.io.IOException"}, new String[]{"<sample:3>"}, false, 1, new String[][]{{"com.fasterxml.jackson.databind.MappingIterator", "_throwNoSuchElement", ""}}, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.RuntimeException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput041() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.MappingIterator", "com.fasterxml.jackson.databind.MappingIterator", "readAll", new String[]{}, new String[]{}, false, 0, null, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.ArrayIndexOutOfBoundsException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput042() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.MappingIterator", "com.fasterxml.jackson.databind.MappingIterator", "readAll", new String[]{"java.util.Collection"}, new String[]{"<sample:0>"}, false, 1, new String[][]{{"com.fasterxml.jackson.databind.MappingIterator", "next", ""}}, 1);
  assertNotNull(actual);
  assertEquals("java.util.ArrayList", actual.getClass().getName());
  assertEquals("[]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{hasNext=false, hasNextValue=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput043() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.MappingIterator", "com.fasterxml.jackson.databind.MappingIterator", "readAll", new String[]{"java.util.Collection"}, new String[]{"<sample:3>"}, false, 1, new String[][]{{"com.fasterxml.jackson.databind.MappingIterator", "next", ""}}, 1);
  assertNotNull(actual);
  assertEquals("java.util.ArrayList", actual.getClass().getName());
  assertEquals("[sample]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{hasNext=false, hasNextValue=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput044() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.MappingIterator", "com.fasterxml.jackson.databind.MappingIterator", "readAll", new String[]{"java.util.Collection"}, new String[]{"<sample:0>"}, false, 1, new String[][]{{"com.fasterxml.jackson.databind.MappingIterator", "next", ""}}, 1), new String[][]{{"size", "", "0"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("1", String.valueOf(actual));
  assertEquals("receiver state after the call", "{hasNext=false, hasNextValue=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput045() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.MappingIterator", "com.fasterxml.jackson.databind.MappingIterator", "readAll", new String[]{"java.util.Collection"}, new String[]{"<null>"}, false, 1, new String[][]{{"com.fasterxml.jackson.databind.MappingIterator", "next", ""}}, 1);
  assertNull(actual);
  assertEquals("receiver state after the call", "{hasNext=false, hasNextValue=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput046() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.MappingIterator", "com.fasterxml.jackson.databind.MappingIterator", "readAll", new String[]{"java.util.Collection"}, new String[]{"<sample:2>"}, false, 1, new String[][]{{"com.fasterxml.jackson.databind.MappingIterator", "next", ""}}, 1), new String[][]{{"size", "", "0"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("3", String.valueOf(actual));
  assertEquals("receiver state after the call", "{hasNext=false, hasNextValue=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput047() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.MappingIterator", "com.fasterxml.jackson.databind.MappingIterator", "readAll", new String[]{}, new String[]{}, false, 4, new String[][]{{"com.fasterxml.jackson.databind.MappingIterator", "readAll", ""}}, 2), new String[][]{{"add", "java.lang.Object", "5"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
  assertEquals("receiver state after the call", "{hasNext=false, hasNextValue=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput048() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.MappingIterator", "com.fasterxml.jackson.databind.MappingIterator", "readAll", new String[]{}, new String[]{}, false, 5, new String[][]{{"com.fasterxml.jackson.databind.MappingIterator", "readAll", ""}}, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("com.fasterxml.jackson.core.JsonParseException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput049() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.MappingIterator", "com.fasterxml.jackson.databind.MappingIterator", "readAll", new String[]{}, new String[]{}, false, 11, new String[][]{{"com.fasterxml.jackson.databind.MappingIterator", "_throwNoSuchElement", ""}}, 2), new String[][]{{"ensureCapacity", "int", "3"}});
  assertNotNull(actual);
  assertEquals("java.util.ArrayList", actual.getClass().getName());
  assertEquals("[]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{hasNext=false, hasNextValue=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput050() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.MappingIterator", "com.fasterxml.jackson.databind.MappingIterator", "close", new String[]{}, new String[]{}, false, 0, null, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput051() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.MappingIterator", "com.fasterxml.jackson.databind.MappingIterator", "getCurrentLocation", new String[]{}, new String[]{}, false, 15, new String[][]{}, 1), new String[][]{{"getByteOffset", "", "4"}, {"getSourceRef", "", "6"}, {"getColumnNr", "", "7"}, {"getSourceRef", "", "2"}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("", String.valueOf(actual));
  assertEquals("receiver state after the call", "{hasNext=!ArrayIndexOutOfBoundsException, hasNextValue=!JsonParseException}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput052() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.MappingIterator", "com.fasterxml.jackson.databind.MappingIterator", "getCurrentLocation", new String[]{}, new String[]{}, false, 16, new String[][]{}, 1), new String[][]{{"getByteOffset", "", "4"}, {"getSourceRef", "", "6"}});
  assertNotNull(actual);
  assertEquals("[C", actual.getClass().getName());
  assertEquals("[ ]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{hasNext=false, hasNextValue=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput053() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.MappingIterator", "com.fasterxml.jackson.databind.MappingIterator", "getCurrentLocation", new String[]{}, new String[]{}, false, 17, new String[][]{}, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput054() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.MappingIterator", "com.fasterxml.jackson.databind.MappingIterator", "getCurrentLocation", new String[]{}, new String[]{}, false, 19, new String[][]{}, 1), new String[][]{{"getByteOffset", "", "4"}, {"getColumnNr", "", "6"}, {"getColumnNr", "", "7"}, {"getSourceRef", "", "2"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
  assertEquals("receiver state after the call", "{hasNext=true, hasNextValue=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput055() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.MappingIterator", "com.fasterxml.jackson.databind.MappingIterator", "getCurrentLocation", new String[]{}, new String[]{}, false, 20, new String[][]{}, 1), new String[][]{{"getByteOffset", "", "4"}, {"getColumnNr", "", "6"}, {"getColumnNr", "", "7"}, {"getSourceRef", "", "2"}});
  assertNotNull(actual);
  assertEquals("java.io.ByteArrayInputStream", actual.getClass().getName());
  assertEquals("receiver state after the call", "{hasNext=false, hasNextValue=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput056() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.MappingIterator", "com.fasterxml.jackson.databind.MappingIterator", "getCurrentLocation", new String[]{}, new String[]{}, false, 20, new String[][]{{"com.fasterxml.jackson.databind.MappingIterator", "readAll", ""}}, 1), new String[][]{{"getByteOffset", "", "4"}, {"getColumnNr", "", "6"}, {"getColumnNr", "", "7"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("1", String.valueOf(actual));
  assertEquals("receiver state after the call", "{hasNext=false, hasNextValue=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput057() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.MappingIterator", "com.fasterxml.jackson.databind.MappingIterator", "readAll", new String[]{"java.util.Collection"}, new String[]{"<sample:2>"}, false, 1, new String[][]{}, 2);
  assertNotNull(actual);
  assertEquals("java.util.ArrayList", actual.getClass().getName());
  assertEquals("[0, sample, ]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{hasNext=false, hasNextValue=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput058() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.MappingIterator", "com.fasterxml.jackson.databind.MappingIterator", "readAll", new String[]{"java.util.Collection"}, new String[]{"<sample:4>"}, false, 1, new String[][]{}, 2);
  assertNotNull(actual);
  assertEquals("java.util.ArrayList", actual.getClass().getName());
  assertEquals("[, a]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{hasNext=false, hasNextValue=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput059() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.MappingIterator", "com.fasterxml.jackson.databind.MappingIterator", "readAll", new String[]{"java.util.Collection"}, new String[]{"<sample:3>"}, false, 1, new String[][]{{"com.fasterxml.jackson.databind.MappingIterator", "getParserSchema", ""}}, 2);
  assertNotNull(actual);
  assertEquals("java.util.ArrayList", actual.getClass().getName());
  assertEquals("[sample]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{hasNext=false, hasNextValue=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput060() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.MappingIterator", "com.fasterxml.jackson.databind.MappingIterator", "readAll", new String[]{"java.util.Collection"}, new String[]{"<sample:3>"}, false, 1, new String[][]{{"com.fasterxml.jackson.databind.MappingIterator", "getParserSchema", ""}}, 2), new String[][]{{"clear", "", "1"}});
  assertNotNull(actual);
  assertEquals("java.util.ArrayList", actual.getClass().getName());
  assertEquals("[]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{hasNext=false, hasNextValue=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput061() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.MappingIterator", "com.fasterxml.jackson.databind.MappingIterator", "hasNextValue", new String[]{}, new String[]{}, false, 0, null, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.ArrayIndexOutOfBoundsException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput062() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.MappingIterator", "com.fasterxml.jackson.databind.MappingIterator", "hasNextValue", new String[]{}, new String[]{}, false, 3, new String[][]{}, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput063() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.MappingIterator", "com.fasterxml.jackson.databind.MappingIterator", "hasNextValue", new String[]{}, new String[]{}, false, 6, new String[][]{}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{hasNext=false, hasNextValue=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput064() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.MappingIterator", "com.fasterxml.jackson.databind.MappingIterator", "hasNext", new String[]{}, new String[]{}, false, 0, null, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.ArrayIndexOutOfBoundsException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput065() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.MappingIterator", "com.fasterxml.jackson.databind.MappingIterator", "hasNext", new String[]{}, new String[]{}, false, 6, new String[][]{{"com.fasterxml.jackson.databind.MappingIterator", "_handleIOException", "java.io.IOException", "<sample:3>"}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{hasNext=false, hasNextValue=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput066() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.MappingIterator", "com.fasterxml.jackson.databind.MappingIterator", "hasNext", new String[]{}, new String[]{}, false, 9, new String[][]{{"com.fasterxml.jackson.databind.MappingIterator", "_throwNoSuchElement", ""}, {"com.fasterxml.jackson.databind.MappingIterator", "_handleIOException", "java.io.IOException", "<sample:2>"}}, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.RuntimeException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput067() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.MappingIterator", "com.fasterxml.jackson.databind.MappingIterator", "getCurrentLocation", new String[]{}, new String[]{}, false, 2, new String[][]{{"com.fasterxml.jackson.databind.MappingIterator", "readAll", ""}, {"com.fasterxml.jackson.databind.MappingIterator", "readAll", "java.util.List", "<sample:3>"}}, 3);
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.core.JsonLocation", actual.getClass().getName());
  assertEquals("receiver state after the call", "{hasNext=false, hasNextValue=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput068() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.MappingIterator", "com.fasterxml.jackson.databind.MappingIterator", "getCurrentLocation", new String[]{}, new String[]{}, false, 6, new String[][]{{"com.fasterxml.jackson.databind.MappingIterator", "readAll", ""}, {"com.fasterxml.jackson.databind.MappingIterator", "readAll", "java.util.List", "<sample:6>"}}, 3), new String[][]{{"getByteOffset", "", "1"}});
  assertNotNull(actual);
  assertEquals("java.lang.Long", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{hasNext=false, hasNextValue=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput069() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.MappingIterator", "com.fasterxml.jackson.databind.MappingIterator", "hasNext", new String[]{}, new String[]{}, false, 2, new String[][]{{"com.fasterxml.jackson.databind.MappingIterator", "remove", ""}}, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.RuntimeException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput070() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.MappingIterator", "com.fasterxml.jackson.databind.MappingIterator", "hasNext", new String[]{}, new String[]{}, false, 3, new String[][]{{"com.fasterxml.jackson.databind.MappingIterator", "remove", ""}}, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput071() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.MappingIterator", "com.fasterxml.jackson.databind.MappingIterator", "getParserSchema", new String[]{}, new String[]{}, false, 0, null, 1);
  assertNull(actual);
  assertEquals("receiver state after the call", "{hasNext=!ArrayIndexOutOfBoundsException, hasNextValue=!JsonParseException}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput072() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.MappingIterator", "com.fasterxml.jackson.databind.MappingIterator", "getParserSchema", new String[]{}, new String[]{}, false, 1, new String[][]{}, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput073() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.MappingIterator", "com.fasterxml.jackson.databind.MappingIterator", "getParserSchema", new String[]{}, new String[]{}, false, 2, new String[][]{}, 1);
  assertNull(actual);
  assertEquals("receiver state after the call", "{hasNext=!RuntimeException, hasNextValue=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput074() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.MappingIterator", "com.fasterxml.jackson.databind.MappingIterator", "getParserSchema", new String[]{}, new String[]{}, false, 4, new String[][]{}, 1);
  assertNull(actual);
  assertEquals("receiver state after the call", "{hasNext=false, hasNextValue=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput075() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.MappingIterator", "com.fasterxml.jackson.databind.MappingIterator", "getParserSchema", new String[]{}, new String[]{}, false, 10, new String[][]{}, 1);
  assertNull(actual);
  assertEquals("receiver state after the call", "{hasNext=!RuntimeException, hasNextValue=!JsonParseException}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput076() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.MappingIterator", "com.fasterxml.jackson.databind.MappingIterator", "readAll", new String[]{"java.util.List"}, new String[]{"<sample:2>"}, false, 2, new String[][]{}, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("com.fasterxml.jackson.core.JsonParseException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput077() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.MappingIterator", "com.fasterxml.jackson.databind.MappingIterator", "readAll", new String[]{"java.util.List"}, new String[]{"<sample:2>"}, false, 3, new String[][]{}, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput078() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.MappingIterator", "com.fasterxml.jackson.databind.MappingIterator", "readAll", new String[]{"java.util.List"}, new String[]{"<sample:3>"}, false, 2, new String[][]{{"com.fasterxml.jackson.databind.MappingIterator", "close", ""}}, 2), new String[][]{{"iterator", "", "1"}, {"hasNext", "", "4"}, {"next", "", "3"}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("sample", String.valueOf(actual));
  assertEquals("receiver state after the call", "{hasNext=false, hasNextValue=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput079() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.MappingIterator", "com.fasterxml.jackson.databind.MappingIterator", "readAll", new String[]{"java.util.List"}, new String[]{"<sample:1>"}, false, 2, new String[][]{{"com.fasterxml.jackson.databind.MappingIterator", "close", ""}}, 2), new String[][]{{"iterator", "", "1"}, {"hasNext", "", "4"}, {"next", "", "3"}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("a", String.valueOf(actual));
  assertEquals("receiver state after the call", "{hasNext=false, hasNextValue=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput080() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.MappingIterator", "com.fasterxml.jackson.databind.MappingIterator", "readAll", new String[]{"java.util.List"}, new String[]{"<sample:2>"}, false, 2, new String[][]{{"com.fasterxml.jackson.databind.MappingIterator", "close", ""}}, 2), new String[][]{{"iterator", "", "1"}, {"hasNext", "", "4"}, {"next", "", "3"}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{hasNext=false, hasNextValue=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput081() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.MappingIterator", "com.fasterxml.jackson.databind.MappingIterator", "readAll", new String[]{"java.util.List"}, new String[]{"<null>"}, false, 2, new String[][]{{"com.fasterxml.jackson.databind.MappingIterator", "close", ""}, {"com.fasterxml.jackson.databind.MappingIterator", "close", ""}, {"com.fasterxml.jackson.databind.MappingIterator", "hasNextValue", ""}}, 2);
  assertNull(actual);
  assertEquals("receiver state after the call", "{hasNext=false, hasNextValue=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput082() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.MappingIterator", "com.fasterxml.jackson.databind.MappingIterator", "readAll", new String[]{"java.util.List"}, new String[]{"<sample:3>"}, false, 2, new String[][]{{"com.fasterxml.jackson.databind.MappingIterator", "close", ""}, {"com.fasterxml.jackson.databind.MappingIterator", "close", ""}, {"com.fasterxml.jackson.databind.MappingIterator", "hasNextValue", ""}}, 2), new String[][]{{"iterator", "", "1"}, {"hasNext", "", "4"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
  assertEquals("receiver state after the call", "{hasNext=false, hasNextValue=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput083() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.MappingIterator", "com.fasterxml.jackson.databind.MappingIterator", "readAll", new String[]{"java.util.List"}, new String[]{"<sample:2>"}, false, 2, new String[][]{{"com.fasterxml.jackson.databind.MappingIterator", "close", ""}, {"com.fasterxml.jackson.databind.MappingIterator", "close", ""}}, 2), new String[][]{{"iterator", "", "1"}});
  assertNotNull(actual);
  assertEquals("java.util.ArrayList$Itr", actual.getClass().getName());
  assertEquals("{hasNext=true}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{hasNext=false, hasNextValue=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput084() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.MappingIterator", "com.fasterxml.jackson.databind.MappingIterator", "hasNextValue", new String[]{}, new String[]{}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.MappingIterator", "_resync", ""}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.ArrayIndexOutOfBoundsException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput085() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.MappingIterator", "com.fasterxml.jackson.databind.MappingIterator", "hasNextValue", new String[]{}, new String[]{}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.MappingIterator", "readAll", "java.util.List", "<empty>"}, {"com.fasterxml.jackson.databind.MappingIterator", "_resync", ""}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("com.fasterxml.jackson.core.JsonParseException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput086() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.MappingIterator", "com.fasterxml.jackson.databind.MappingIterator", "hasNextValue", new String[]{}, new String[]{}, false, 1, new String[][]{{"com.fasterxml.jackson.databind.MappingIterator", "readAll", "java.util.List", "<empty>"}, {"com.fasterxml.jackson.databind.MappingIterator", "_resync", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{hasNext=false, hasNextValue=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput087() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.MappingIterator", "com.fasterxml.jackson.databind.MappingIterator", "hasNextValue", new String[]{}, new String[]{}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.MappingIterator", "close", ""}, {"com.fasterxml.jackson.databind.MappingIterator", "readAll", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{hasNext=false, hasNextValue=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput088() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.MappingIterator", "com.fasterxml.jackson.databind.MappingIterator", "hasNextValue", new String[]{}, new String[]{}, false, 1, new String[][]{{"com.fasterxml.jackson.databind.MappingIterator", "close", ""}, {"com.fasterxml.jackson.databind.MappingIterator", "readAll", ""}, {"com.fasterxml.jackson.databind.MappingIterator", "readAll", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{hasNext=false, hasNextValue=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput089() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.MappingIterator", "com.fasterxml.jackson.databind.MappingIterator", "hasNextValue", new String[]{}, new String[]{}, false, 2, new String[][]{{"com.fasterxml.jackson.databind.MappingIterator", "close", ""}, {"com.fasterxml.jackson.databind.MappingIterator", "readAll", ""}, {"com.fasterxml.jackson.databind.MappingIterator", "readAll", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{hasNext=false, hasNextValue=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput090() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.MappingIterator", "com.fasterxml.jackson.databind.MappingIterator", "hasNextValue", new String[]{}, new String[]{}, false, 3, new String[][]{{"com.fasterxml.jackson.databind.MappingIterator", "close", ""}, {"com.fasterxml.jackson.databind.MappingIterator", "readAll", ""}, {"com.fasterxml.jackson.databind.MappingIterator", "readAll", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{hasNext=false, hasNextValue=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput091() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.MappingIterator", "com.fasterxml.jackson.databind.MappingIterator", "readAll", new String[]{"java.util.List"}, new String[]{"<sample:1>"}, false); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.ArrayIndexOutOfBoundsException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput092() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.MappingIterator", "com.fasterxml.jackson.databind.MappingIterator", "remove", new String[]{}, new String[]{}, false); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.UnsupportedOperationException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput093() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.MappingIterator", "com.fasterxml.jackson.databind.MappingIterator", "close", new String[]{}, new String[]{}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.MappingIterator", "readAll", ""}, {"com.fasterxml.jackson.databind.MappingIterator", "hasNext", ""}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput094() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.MappingIterator", "com.fasterxml.jackson.databind.MappingIterator", "close", new String[]{}, new String[]{}, false, 1, new String[][]{{"com.fasterxml.jackson.databind.MappingIterator", "readAll", ""}, {"com.fasterxml.jackson.databind.MappingIterator", "hasNext", ""}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{hasNext=false, hasNextValue=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput095() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.MappingIterator", "com.fasterxml.jackson.databind.MappingIterator", "close", new String[]{}, new String[]{}, false, 2, new String[][]{{"com.fasterxml.jackson.databind.MappingIterator", "readAll", ""}, {"com.fasterxml.jackson.databind.MappingIterator", "hasNext", ""}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{hasNext=false, hasNextValue=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput096() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.MappingIterator", "com.fasterxml.jackson.databind.MappingIterator", "getCurrentLocation", new String[]{}, new String[]{}, false);
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.core.JsonLocation", actual.getClass().getName());
  assertEquals("[Source: 2; line: 1, column: 1] {getByteOffset=0, getCharOffset=-1, getColumnNr=1, getLineNr=1}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{hasNext=!ArrayIndexOutOfBoundsException, hasNextValue=!JsonParseException}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput097() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.MappingIterator", "com.fasterxml.jackson.databind.MappingIterator", "getCurrentLocation", new String[]{}, new String[]{}, false, 1, new String[][]{}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput098() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.MappingIterator", "com.fasterxml.jackson.databind.MappingIterator", "getCurrentLocation", new String[]{}, new String[]{}, false, 2, new String[][]{});
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.core.JsonLocation", actual.getClass().getName());
  assertEquals("receiver state after the call", "{hasNext=!RuntimeException, hasNextValue=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput099() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.MappingIterator", "com.fasterxml.jackson.databind.MappingIterator", "getCurrentLocation", new String[]{}, new String[]{}, false, 2, new String[][]{}), new String[][]{{"getSourceRef", "", "7"}});
  assertNotNull(actual);
  assertEquals("[B", actual.getClass().getName());
  assertEquals("[-1]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{hasNext=!RuntimeException, hasNextValue=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput100() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.MappingIterator", "com.fasterxml.jackson.databind.MappingIterator", "getCurrentLocation", new String[]{}, new String[]{}, false, 4, new String[][]{}), new String[][]{{"getSourceRef", "", "7"}});
  assertNotNull(actual);
  assertEquals("[B", actual.getClass().getName());
  assertEquals("[-1]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{hasNext=false, hasNextValue=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput101() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.MappingIterator", "com.fasterxml.jackson.databind.MappingIterator", "hasNext", new String[]{}, new String[]{}, false, 1, new String[][]{{"com.fasterxml.jackson.databind.MappingIterator", "next", ""}, {"com.fasterxml.jackson.databind.MappingIterator", "_resync", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{hasNext=false, hasNextValue=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput102() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.MappingIterator", "com.fasterxml.jackson.databind.MappingIterator", "getCurrentLocation", new String[]{}, new String[]{}, false, 5, new String[][]{}), new String[][]{{"getSourceRef", "", "7"}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("key", String.valueOf(actual));
  assertEquals("receiver state after the call", "{hasNext=!ArrayIndexOutOfBoundsException, hasNextValue=!JsonParseException}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput103() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.MappingIterator", "com.fasterxml.jackson.databind.MappingIterator", "getCurrentLocation", new String[]{}, new String[]{}, false, 6, new String[][]{{"com.fasterxml.jackson.databind.MappingIterator", "_throwNoSuchElement", ""}}), new String[][]{{"getSourceRef", "", "7"}});
  assertNotNull(actual);
  assertEquals("java.io.ByteArrayInputStream", actual.getClass().getName());
  assertEquals("receiver state after the call", "{hasNext=false, hasNextValue=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput104() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.MappingIterator", "com.fasterxml.jackson.databind.MappingIterator", "_handleMappingException", new String[]{"com.fasterxml.jackson.databind.JsonMappingException"}, new String[]{"<null>"}, false); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput105() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.MappingIterator", "com.fasterxml.jackson.databind.MappingIterator", "getCurrentLocation", new String[]{}, new String[]{}, false, 8, new String[][]{}), new String[][]{{"getSourceRef", "", "7"}});
  assertNotNull(actual);
  assertEquals("java.io.StringReader", actual.getClass().getName());
  assertEquals("receiver state after the call", "{hasNext=false, hasNextValue=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput106() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.MappingIterator", "com.fasterxml.jackson.databind.MappingIterator", "emptyIterator", new String[]{}, new String[]{}, true);
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.databind.MappingIterator", actual.getClass().getName());
  assertEquals("{hasNext=false, hasNextValue=false}", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput107() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.MappingIterator", "com.fasterxml.jackson.databind.MappingIterator", "next", new String[]{}, new String[]{}, false, 2, new String[][]{{"com.fasterxml.jackson.databind.MappingIterator", "remove", ""}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.RuntimeException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput108() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.MappingIterator", "com.fasterxml.jackson.databind.MappingIterator", "next", new String[]{}, new String[]{}, false, 3, new String[][]{{"com.fasterxml.jackson.databind.MappingIterator", "remove", ""}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput109() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.MappingIterator", "com.fasterxml.jackson.databind.MappingIterator", "readAll", new String[]{"java.util.Collection"}, new String[]{"<sample:3>"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.MappingIterator", "getCurrentLocation", ""}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.ArrayIndexOutOfBoundsException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput110() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.MappingIterator", "com.fasterxml.jackson.databind.MappingIterator", "readAll", new String[]{"java.util.Collection"}, new String[]{"<empty>"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.MappingIterator", "_handleMappingException", "com.fasterxml.jackson.databind.JsonMappingException", "<sample:2>"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.ArrayIndexOutOfBoundsException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput111() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.MappingIterator", "com.fasterxml.jackson.databind.MappingIterator", "readAll", new String[]{}, new String[]{}, false); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.ArrayIndexOutOfBoundsException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput112() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.MappingIterator", "com.fasterxml.jackson.databind.MappingIterator", "readAll", new String[]{}, new String[]{}, false, 1, new String[][]{});
  assertNotNull(actual);
  assertEquals("java.util.ArrayList", actual.getClass().getName());
  assertEquals("[]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{hasNext=false, hasNextValue=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput113() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.MappingIterator", "com.fasterxml.jackson.databind.MappingIterator", "getParser", new String[]{}, new String[]{}, false);
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.core.json.UTF8StreamJsonParser", actual.getClass().getName());
  assertEquals("{canReadObjectId=false, canReadTypeId=false, getBigIntegerValue=!JsonParseException, getBinaryValue=!JsonParseException, getBooleanValue=!JsonParseException, getByteValue=!JsonParseException, getCurre...#474#1075917232", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{hasNext=!ArrayIndexOutOfBoundsException, hasNextValue=!JsonParseException}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput114() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.MappingIterator", "com.fasterxml.jackson.databind.MappingIterator", "getParser", new String[]{}, new String[]{}, false, 1, new String[][]{});
  assertNull(actual);
  assertEquals("receiver state after the call", "{hasNext=false, hasNextValue=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput115() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.MappingIterator", "com.fasterxml.jackson.databind.MappingIterator", "getParser", new String[]{}, new String[]{}, false, 2, new String[][]{});
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.core.json.UTF8StreamJsonParser", actual.getClass().getName());
  assertEquals("{canReadObjectId=false, canReadTypeId=false, getBigIntegerValue=!JsonParseException, getBinaryValue=!JsonParseException, getBooleanValue=!JsonParseException, getByteValue=!JsonParseException, getCurre...#474#-733986353", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{hasNext=!RuntimeException, hasNextValue=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput116() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.MappingIterator", "com.fasterxml.jackson.databind.MappingIterator", "getParser", new String[]{}, new String[]{}, false, 3, new String[][]{}), new String[][]{{"getCurrentToken", "", "2"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{hasNext=!NullPointerException, hasNextValue=!NullPointerException}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput117() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.MappingIterator", "com.fasterxml.jackson.databind.MappingIterator", "_handleIOException", new String[]{"java.io.IOException"}, new String[]{"<null>"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.MappingIterator", "_throwNoSuchElement", ""}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput118() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.MappingIterator", "com.fasterxml.jackson.databind.MappingIterator", "_handleIOException", new String[]{"java.io.IOException"}, new String[]{"<sample:3>"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.MappingIterator", "_throwNoSuchElement", ""}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.RuntimeException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput119() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.MappingIterator", "com.fasterxml.jackson.databind.MappingIterator", "getParserSchema", new String[]{}, new String[]{}, false);
  assertNull(actual);
  assertEquals("receiver state after the call", "{hasNext=!ArrayIndexOutOfBoundsException, hasNextValue=!JsonParseException}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput120() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.MappingIterator", "com.fasterxml.jackson.databind.MappingIterator", "getParserSchema", new String[]{}, new String[]{}, false, 1, new String[][]{}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput121() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.MappingIterator", "com.fasterxml.jackson.databind.MappingIterator", "getParserSchema", new String[]{}, new String[]{}, false, 2, new String[][]{});
  assertNull(actual);
  assertEquals("receiver state after the call", "{hasNext=!RuntimeException, hasNextValue=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput122() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.MappingIterator", "com.fasterxml.jackson.databind.MappingIterator", "getParserSchema", new String[]{}, new String[]{}, false, 4, new String[][]{});
  assertNull(actual);
  assertEquals("receiver state after the call", "{hasNext=false, hasNextValue=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput123() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.MappingIterator", "com.fasterxml.jackson.databind.MappingIterator", "getParserSchema", new String[]{}, new String[]{}, false, 9, new String[][]{});
  assertNull(actual);
  assertEquals("receiver state after the call", "{hasNext=!RuntimeException, hasNextValue=!JsonParseException}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput124() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.MappingIterator", "com.fasterxml.jackson.databind.MappingIterator", "getCurrentLocation", new String[]{}, new String[]{}, false, 4, new String[][]{{"com.fasterxml.jackson.databind.MappingIterator", "getParser", ""}, {"com.fasterxml.jackson.databind.MappingIterator", "_throwNoSuchElement", ""}}), new String[][]{{"getCharOffset", "", "6"}});
  assertNotNull(actual);
  assertEquals("java.lang.Long", actual.getClass().getName());
  assertEquals("-1", String.valueOf(actual));
  assertEquals("receiver state after the call", "{hasNext=false, hasNextValue=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput125() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.MappingIterator", "com.fasterxml.jackson.databind.MappingIterator", "_resync", new String[]{}, new String[]{}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.MappingIterator", "nextValue", ""}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{hasNext=!RuntimeException, hasNextValue=!JsonParseException}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput126() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.MappingIterator", "com.fasterxml.jackson.databind.MappingIterator", "_resync", new String[]{}, new String[]{}, false, 1, new String[][]{{"com.fasterxml.jackson.databind.MappingIterator", "nextValue", ""}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput127() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.MappingIterator", "com.fasterxml.jackson.databind.MappingIterator", "_resync", new String[]{}, new String[]{}, false, 2, new String[][]{{"com.fasterxml.jackson.databind.MappingIterator", "nextValue", ""}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{hasNext=false, hasNextValue=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput128() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.MappingIterator", "com.fasterxml.jackson.databind.MappingIterator", "_resync", new String[]{}, new String[]{}, false, 3, new String[][]{{"com.fasterxml.jackson.databind.MappingIterator", "nextValue", ""}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{hasNext=!NullPointerException, hasNextValue=!NullPointerException}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput129() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.MappingIterator", "com.fasterxml.jackson.databind.MappingIterator", "emptyIterator", new String[]{}, new String[]{}, true), new String[][]{{"getParserSchema", "", "6"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput130() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.MappingIterator", "com.fasterxml.jackson.databind.MappingIterator", "_throwNoSuchElement", new String[]{}, new String[]{}, false); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.util.NoSuchElementException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput131() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.MappingIterator", "com.fasterxml.jackson.databind.MappingIterator", "_resync", new String[]{}, new String[]{}, false);
  assertNull(actual);
  assertEquals("receiver state after the call", "{hasNext=!ArrayIndexOutOfBoundsException, hasNextValue=!JsonParseException}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput132() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.MappingIterator", "com.fasterxml.jackson.databind.MappingIterator", "_handleMappingException", new String[]{"com.fasterxml.jackson.databind.JsonMappingException"}, new String[]{"<sample:4>"}, false); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("com.fasterxml.jackson.databind.RuntimeJsonMappingException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput133() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.MappingIterator", "com.fasterxml.jackson.databind.MappingIterator", "getCurrentLocation", new String[]{}, new String[]{}, false, 5, new String[][]{});
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.core.JsonLocation", actual.getClass().getName());
  assertEquals("[Source: key; line: 1, column: 1] {getByteOffset=0, getCharOffset=-1, getColumnNr=1, getLineNr=1}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{hasNext=!ArrayIndexOutOfBoundsException, hasNextValue=!JsonParseException}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput134() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.MappingIterator", "com.fasterxml.jackson.databind.MappingIterator", "getCurrentLocation", new String[]{}, new String[]{}, false, 9, new String[][]{{"com.fasterxml.jackson.databind.MappingIterator", "getParser", ""}});
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.core.JsonLocation", actual.getClass().getName());
  assertEquals("[Source: 0; line: 1, column: 1] {getByteOffset=-1, getCharOffset=0, getColumnNr=1, getLineNr=1}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{hasNext=!RuntimeException, hasNextValue=!JsonParseException}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput135() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.MappingIterator", "com.fasterxml.jackson.databind.MappingIterator", "next", new String[]{}, new String[]{}, false, 1, new String[][]{{"com.fasterxml.jackson.databind.MappingIterator", "getCurrentLocation", ""}, {"com.fasterxml.jackson.databind.MappingIterator", "hasNextValue", ""}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.util.NoSuchElementException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput136() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.MappingIterator", "com.fasterxml.jackson.databind.MappingIterator", "readAll", new String[]{"java.util.Collection"}, new String[]{"<sample:2>"}, false, 7, new String[][]{{"com.fasterxml.jackson.databind.MappingIterator", "remove", ""}});
  assertNotNull(actual);
  assertEquals("java.util.ArrayList", actual.getClass().getName());
  assertEquals("[0, sample, ]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{hasNext=false, hasNextValue=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput137() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.MappingIterator", "com.fasterxml.jackson.databind.MappingIterator", "readAll", new String[]{}, new String[]{}, false, 2, new String[][]{{"com.fasterxml.jackson.databind.MappingIterator", "remove", ""}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("com.fasterxml.jackson.core.JsonParseException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput138() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.MappingIterator", "com.fasterxml.jackson.databind.MappingIterator", "readAll", new String[]{}, new String[]{}, false, 3, new String[][]{{"com.fasterxml.jackson.databind.MappingIterator", "remove", ""}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput139() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.MappingIterator", "com.fasterxml.jackson.databind.MappingIterator", "readAll", new String[]{}, new String[]{}, false, 4, new String[][]{}), new String[][]{{"add", "int,java.lang.Object", "4"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IndexOutOfBoundsException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput140() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.MappingIterator", "com.fasterxml.jackson.databind.MappingIterator", "readAll", new String[]{"java.util.Collection"}, new String[]{"<sample:2>"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.MappingIterator", "_throwNoSuchElement", ""}, {"com.fasterxml.jackson.databind.MappingIterator", "next", ""}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("com.fasterxml.jackson.core.JsonParseException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput141() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.MappingIterator", "com.fasterxml.jackson.databind.MappingIterator", "readAll", new String[]{"java.util.Collection"}, new String[]{"<empty>"}, false, 1, new String[][]{{"com.fasterxml.jackson.databind.MappingIterator", "next", ""}});
  assertNotNull(actual);
  assertEquals("java.util.ArrayList", actual.getClass().getName());
  assertEquals("[]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{hasNext=false, hasNextValue=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput142() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.MappingIterator", "com.fasterxml.jackson.databind.MappingIterator", "readAll", new String[]{}, new String[]{}, false, 4, new String[][]{}), new String[][]{{"add", "java.lang.Object", "5"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
  assertEquals("receiver state after the call", "{hasNext=false, hasNextValue=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput143() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.MappingIterator", "com.fasterxml.jackson.databind.MappingIterator", "readAll", new String[]{"java.util.List"}, new String[]{"<sample:0>"}, false, 2, new String[][]{{"com.fasterxml.jackson.databind.MappingIterator", "readAll", ""}, {"com.fasterxml.jackson.databind.MappingIterator", "_handleMappingException", "com.fasterxml.jackson.databind.JsonMappingException", "<sample:6>"}});
  assertNotNull(actual);
  assertEquals("java.util.ArrayList", actual.getClass().getName());
  assertEquals("[]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{hasNext=false, hasNextValue=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput144() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.MappingIterator", "com.fasterxml.jackson.databind.MappingIterator", "readAll", new String[]{"java.util.List"}, new String[]{"<sample:2>"}, false, 2, new String[][]{{"com.fasterxml.jackson.databind.MappingIterator", "readAll", ""}, {"com.fasterxml.jackson.databind.MappingIterator", "_handleMappingException", "com.fasterxml.jackson.databind.JsonMappingException", "<sample:6>"}});
  assertNotNull(actual);
  assertEquals("java.util.ArrayList", actual.getClass().getName());
  assertEquals("[0, sample, ]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{hasNext=false, hasNextValue=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput145() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.MappingIterator", "com.fasterxml.jackson.databind.MappingIterator", "readAll", new String[]{"java.util.List"}, new String[]{"<sample:2>"}, false, 2, new String[][]{{"com.fasterxml.jackson.databind.MappingIterator", "readAll", ""}, {"com.fasterxml.jackson.databind.MappingIterator", "_handleMappingException", "com.fasterxml.jackson.databind.JsonMappingException", "<sample:1>"}}), new String[][]{{"indexOf", "java.lang.Object", "7"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("-1", String.valueOf(actual));
  assertEquals("receiver state after the call", "{hasNext=false, hasNextValue=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput146() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.MappingIterator", "com.fasterxml.jackson.databind.MappingIterator", "readAll", new String[]{"java.util.List"}, new String[]{"<null>"}, false, 2, new String[][]{{"com.fasterxml.jackson.databind.MappingIterator", "readAll", ""}, {"com.fasterxml.jackson.databind.MappingIterator", "_handleMappingException", "com.fasterxml.jackson.databind.JsonMappingException", "<sample:1>"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{hasNext=false, hasNextValue=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput147() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.MappingIterator", "com.fasterxml.jackson.databind.MappingIterator", "readAll", new String[]{"java.util.List"}, new String[]{"<sample:2>"}, false, 2, new String[][]{{"com.fasterxml.jackson.databind.MappingIterator", "_handleIOException", "java.io.IOException", "<sample:0>"}, {"com.fasterxml.jackson.databind.MappingIterator", "getParserSchema", ""}, {"com.fasterxml.jackson.databind.MappingIterator", "readAll", ""}}), new String[][]{{"indexOf", "java.lang.Object", "7"}, {"add", "int,java.lang.Object", "2"}});
  assertNotNull(actual);
  assertEquals("java.util.ArrayList", actual.getClass().getName());
  assertEquals("[2, 0, sample, ]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{hasNext=false, hasNextValue=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput148() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.MappingIterator", "com.fasterxml.jackson.databind.MappingIterator", "readAll", new String[]{"java.util.List"}, new String[]{"<sample:1>"}, false, 2, new String[][]{{"com.fasterxml.jackson.databind.MappingIterator", "_handleIOException", "java.io.IOException", "<sample:0>"}, {"com.fasterxml.jackson.databind.MappingIterator", "getParserSchema", ""}, {"com.fasterxml.jackson.databind.MappingIterator", "readAll", ""}}), new String[][]{{"indexOf", "java.lang.Object", "7"}, {"add", "int,java.lang.Object", "2"}});
  assertNotNull(actual);
  assertEquals("java.util.ArrayList", actual.getClass().getName());
  assertEquals("[2, a, 0]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{hasNext=false, hasNextValue=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput149() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.MappingIterator", "com.fasterxml.jackson.databind.MappingIterator", "readAll", new String[]{"java.util.List"}, new String[]{"<sample:0>"}, false, 2, new String[][]{{"com.fasterxml.jackson.databind.MappingIterator", "_handleIOException", "java.io.IOException", "<sample:0>"}, {"com.fasterxml.jackson.databind.MappingIterator", "getParserSchema", ""}, {"com.fasterxml.jackson.databind.MappingIterator", "readAll", ""}}), new String[][]{{"indexOf", "java.lang.Object", "7"}, {"add", "int,java.lang.Object", "2"}});
  assertNotNull(actual);
  assertEquals("java.util.ArrayList", actual.getClass().getName());
  assertEquals("[2, ]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{hasNext=false, hasNextValue=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput150() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.MappingIterator", "com.fasterxml.jackson.databind.MappingIterator", "nextValue", new String[]{}, new String[]{}, false); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.ArrayIndexOutOfBoundsException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput151() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.MappingIterator", "com.fasterxml.jackson.databind.MappingIterator", "nextValue", new String[]{}, new String[]{}, false, 1, new String[][]{}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.util.NoSuchElementException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput152() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.MappingIterator", "com.fasterxml.jackson.databind.MappingIterator", "nextValue", new String[]{}, new String[]{}, false, 2, new String[][]{}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("com.fasterxml.jackson.core.JsonParseException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput153() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.MappingIterator", "com.fasterxml.jackson.databind.MappingIterator", "nextValue", new String[]{}, new String[]{}, false, 3, new String[][]{}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput154() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.MappingIterator", "com.fasterxml.jackson.databind.MappingIterator", "_resync", new String[]{}, new String[]{}, false, 2, new String[][]{});
  assertNull(actual);
  assertEquals("receiver state after the call", "{hasNext=!RuntimeException, hasNextValue=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput155() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.MappingIterator", "com.fasterxml.jackson.databind.MappingIterator", "hasNext", new String[]{}, new String[]{}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.MappingIterator", "readAll", ""}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.RuntimeException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput156() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.MappingIterator", "com.fasterxml.jackson.databind.MappingIterator", "readAll", new String[]{"java.util.Collection"}, new String[]{"<sample:1>"}, false, 1, new String[][]{});
  assertNotNull(actual);
  assertEquals("java.util.ArrayList", actual.getClass().getName());
  assertEquals("[a, 0]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{hasNext=false, hasNextValue=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput157() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.MappingIterator", "com.fasterxml.jackson.databind.MappingIterator", "readAll", new String[]{"java.util.Collection"}, new String[]{"<null>"}, false, 1, new String[][]{});
  assertNull(actual);
  assertEquals("receiver state after the call", "{hasNext=false, hasNextValue=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput158() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.MappingIterator", "com.fasterxml.jackson.databind.MappingIterator", "hasNextValue", new String[]{}, new String[]{}, false, 3, new String[][]{}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput159() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.MappingIterator", "com.fasterxml.jackson.databind.MappingIterator", "next", new String[]{}, new String[]{}, false); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.ArrayIndexOutOfBoundsException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput160() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.MappingIterator", "com.fasterxml.jackson.databind.MappingIterator", "hasNext", new String[]{}, new String[]{}, false, 13, new String[][]{{"com.fasterxml.jackson.databind.MappingIterator", "hasNextValue", ""}, {"com.fasterxml.jackson.databind.MappingIterator", "_handleIOException", "java.io.IOException", "<sample:3>"}, {"com.fasterxml.jackson.databind.MappingIterator", "readAll", "java.util.List", "<null>"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput161() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.MappingIterator", "com.fasterxml.jackson.databind.MappingIterator", "getCurrentLocation", new String[]{}, new String[]{}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.MappingIterator", "hasNextValue", ""}, {"com.fasterxml.jackson.databind.MappingIterator", "readAll", ""}});
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.core.JsonLocation", actual.getClass().getName());
  assertEquals("[Source: 2; line: 1, column: 4] {getByteOffset=3, getCharOffset=-1, getColumnNr=4, getLineNr=1}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{hasNext=!RuntimeException, hasNextValue=!NullPointerException}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput162() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.MappingIterator", "com.fasterxml.jackson.databind.MappingIterator", "getCurrentLocation", new String[]{}, new String[]{}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.MappingIterator", "hasNextValue", ""}, {"com.fasterxml.jackson.databind.MappingIterator", "readAll", ""}, {"com.fasterxml.jackson.databind.MappingIterator", "readAll", "java.util.List", "<sample:3>"}});
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.core.JsonLocation", actual.getClass().getName());
  assertEquals("[Source: 2; line: 2, column: 3] {getByteOffset=6, getCharOffset=-1, getColumnNr=3, getLineNr=2}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{hasNext=!NullPointerException, hasNextValue=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput163() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.MappingIterator", "com.fasterxml.jackson.databind.MappingIterator", "hasNext", new String[]{}, new String[]{}, false); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.ArrayIndexOutOfBoundsException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput164() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.MappingIterator", "com.fasterxml.jackson.databind.MappingIterator", "getParser", new String[]{}, new String[]{}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.MappingIterator", "readAll", "java.util.Collection", "<sample:3>"}});
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.core.json.UTF8StreamJsonParser", actual.getClass().getName());
  assertEquals("{canReadObjectId=false, canReadTypeId=false, getBigIntegerValue=!JsonParseException, getBinaryValue=!JsonParseException, getBooleanValue=!JsonParseException, getByteValue=!JsonParseException, getCurre...#474#1075917232", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{hasNext=!RuntimeException, hasNextValue=!JsonParseException}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput165() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.MappingIterator", "com.fasterxml.jackson.databind.MappingIterator", "getParser", new String[]{}, new String[]{}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.MappingIterator", "readAll", ""}, {"com.fasterxml.jackson.databind.MappingIterator", "readAll", "java.util.Collection", "<sample:3>"}, {"com.fasterxml.jackson.databind.MappingIterator", "_handleIOException", "java.io.IOException", "<empty>"}}), new String[][]{{"getTextCharacters", "", "2"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{hasNext=!RuntimeException, hasNextValue=!NullPointerException}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput166() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.MappingIterator", "com.fasterxml.jackson.databind.MappingIterator", "getParser", new String[]{}, new String[]{}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.MappingIterator", "getParser", ""}, {"com.fasterxml.jackson.databind.MappingIterator", "readAll", "java.util.Collection", "<sample:2>"}, {"com.fasterxml.jackson.databind.MappingIterator", "_handleIOException", "java.io.IOException", "<empty>"}}, 3), new String[][]{{"getTextCharacters", "", "2"}, {"getCurrentLocation", "", "7"}});
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.core.JsonLocation", actual.getClass().getName());
  assertEquals("[Source: 2; line: 1, column: 2] {getByteOffset=1, getCharOffset=-1, getColumnNr=2, getLineNr=1}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{hasNext=!RuntimeException, hasNextValue=!JsonParseException}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput167() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.MappingIterator", "com.fasterxml.jackson.databind.MappingIterator", "getParser", new String[]{}, new String[]{}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.MappingIterator", "getParser", ""}, {"com.fasterxml.jackson.databind.MappingIterator", "readAll", "java.util.Collection", "<sample:2>"}, {"com.fasterxml.jackson.databind.MappingIterator", "_handleIOException", "java.io.IOException", "<empty>"}}, 3), new String[][]{{"getTextCharacters", "", "2"}, {"getCurrentLocation", "", "7"}, {"getSourceRef", "", "1"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("2", String.valueOf(actual));
  assertEquals("receiver state after the call", "{hasNext=!RuntimeException, hasNextValue=!JsonParseException}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput168() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.MappingIterator", "com.fasterxml.jackson.databind.MappingIterator", "getParser", new String[]{}, new String[]{}, false, 4, new String[][]{{"com.fasterxml.jackson.databind.MappingIterator", "getParser", ""}, {"com.fasterxml.jackson.databind.MappingIterator", "remove", ""}, {"com.fasterxml.jackson.databind.MappingIterator", "readAll", "java.util.Collection", "<sample:5>"}}), new String[][]{{"getTextCharacters", "", "0"}, {"getCurrentLocation", "", "7"}, {"getSourceRef", "", "6"}});
  assertNotNull(actual);
  assertEquals("[B", actual.getClass().getName());
  assertEquals("[-1]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{hasNext=false, hasNextValue=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput169() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.MappingIterator", "com.fasterxml.jackson.databind.MappingIterator", "getParser", new String[]{}, new String[]{}, false, 5, new String[][]{{"com.fasterxml.jackson.databind.MappingIterator", "getParser", ""}, {"com.fasterxml.jackson.databind.MappingIterator", "remove", ""}, {"com.fasterxml.jackson.databind.MappingIterator", "readAll", "java.util.Collection", "<sample:5>"}}), new String[][]{{"getTextCharacters", "", "0"}, {"getCurrentLocation", "", "7"}, {"getSourceRef", "", "6"}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("key", String.valueOf(actual));
  assertEquals("receiver state after the call", "{hasNext=!RuntimeException, hasNextValue=!JsonParseException}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput170() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.MappingIterator", "com.fasterxml.jackson.databind.MappingIterator", "getParser", new String[]{}, new String[]{}, false, 6, new String[][]{{"com.fasterxml.jackson.databind.MappingIterator", "getParser", ""}, {"com.fasterxml.jackson.databind.MappingIterator", "remove", ""}, {"com.fasterxml.jackson.databind.MappingIterator", "readAll", "java.util.Collection", "<sample:5>"}}), new String[][]{{"getTextCharacters", "", "0"}, {"getCurrentLocation", "", "7"}, {"getSourceRef", "", "6"}});
  assertNotNull(actual);
  assertEquals("java.io.ByteArrayInputStream", actual.getClass().getName());
  assertEquals("receiver state after the call", "{hasNext=false, hasNextValue=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput171() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.MappingIterator", "com.fasterxml.jackson.databind.MappingIterator", "getParser", new String[]{}, new String[]{}, false, 6, new String[][]{{"com.fasterxml.jackson.databind.MappingIterator", "getParser", ""}, {"com.fasterxml.jackson.databind.MappingIterator", "readAll", "java.util.Collection", "<sample:2>"}}, 2), new String[][]{{"getTextCharacters", "", "0"}, {"getCurrentLocation", "", "2"}, {"getSourceRef", "", "6"}});
  assertNotNull(actual);
  assertEquals("java.io.ByteArrayInputStream", actual.getClass().getName());
  assertEquals("receiver state after the call", "{hasNext=false, hasNextValue=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput172() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.MappingIterator", "com.fasterxml.jackson.databind.MappingIterator", "getParser", new String[]{}, new String[]{}, false, 7, new String[][]{{"com.fasterxml.jackson.databind.MappingIterator", "getParser", ""}, {"com.fasterxml.jackson.databind.MappingIterator", "readAll", "java.util.Collection", "<sample:2>"}}, 2);
  assertNull(actual);
  assertEquals("receiver state after the call", "{hasNext=false, hasNextValue=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput173() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.MappingIterator", "com.fasterxml.jackson.databind.MappingIterator", "getParser", new String[]{}, new String[]{}, false, 8, new String[][]{{"com.fasterxml.jackson.databind.MappingIterator", "getParser", ""}}), new String[][]{{"getTextCharacters", "", "0"}, {"getCurrentLocation", "", "2"}, {"getSourceRef", "", "6"}});
  assertNotNull(actual);
  assertEquals("java.io.StringReader", actual.getClass().getName());
  assertEquals("receiver state after the call", "{hasNext=false, hasNextValue=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput174() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.MappingIterator", "com.fasterxml.jackson.databind.MappingIterator", "getParser", new String[]{}, new String[]{}, false, 9, new String[][]{{"com.fasterxml.jackson.databind.MappingIterator", "getParser", ""}}), new String[][]{{"getTextCharacters", "", "0"}, {"getCurrentLocation", "", "2"}, {"getSourceRef", "", "6"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{hasNext=!RuntimeException, hasNextValue=!JsonParseException}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput175() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.MappingIterator", "com.fasterxml.jackson.databind.MappingIterator", "getParser", new String[]{}, new String[]{}, false, 10, new String[][]{{"com.fasterxml.jackson.databind.MappingIterator", "getParser", ""}}), new String[][]{{"getTextCharacters", "", "0"}, {"getCurrentLocation", "", "2"}, {"getSourceRef", "", "6"}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("<a><b>t</b></a>", String.valueOf(actual));
  assertEquals("receiver state after the call", "{hasNext=!RuntimeException, hasNextValue=!JsonParseException}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput176() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.MappingIterator", "com.fasterxml.jackson.databind.MappingIterator", "getParser", new String[]{}, new String[]{}, false, 13, new String[][]{{"com.fasterxml.jackson.databind.MappingIterator", "getParser", ""}}), new String[][]{{"getText", "", "0"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput177() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.MappingIterator", "com.fasterxml.jackson.databind.MappingIterator", "getParser", new String[]{}, new String[]{}, false, 14, new String[][]{{"com.fasterxml.jackson.databind.MappingIterator", "_handleMappingException", "com.fasterxml.jackson.databind.JsonMappingException", "<null>"}, {"com.fasterxml.jackson.databind.MappingIterator", "readAll", "java.util.Collection", "<empty>"}, {"com.fasterxml.jackson.databind.MappingIterator", "getParser", ""}}, 2), new String[][]{{"getTextCharacters", "", "0"}, {"getCurrentLocation", "", "2"}, {"getSourceRef", "", "6"}});
  assertNotNull(actual);
  assertEquals("[B", actual.getClass().getName());
  assertEquals("[-1]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{hasNext=false, hasNextValue=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput178() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.MappingIterator", "com.fasterxml.jackson.databind.MappingIterator", "getParser", new String[]{}, new String[]{}, false, 15, new String[][]{{"com.fasterxml.jackson.databind.MappingIterator", "_handleMappingException", "com.fasterxml.jackson.databind.JsonMappingException", "<null>"}, {"com.fasterxml.jackson.databind.MappingIterator", "readAll", "java.util.Collection", "<empty>"}, {"com.fasterxml.jackson.databind.MappingIterator", "getParser", ""}}, 2), new String[][]{{"getTextCharacters", "", "0"}, {"getCurrentLocation", "", "2"}, {"getSourceRef", "", "6"}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("", String.valueOf(actual));
  assertEquals("receiver state after the call", "{hasNext=!RuntimeException, hasNextValue=!JsonParseException}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput179() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.MappingIterator", "com.fasterxml.jackson.databind.MappingIterator", "getParser", new String[]{}, new String[]{}, false, 16, new String[][]{{"com.fasterxml.jackson.databind.MappingIterator", "_handleMappingException", "com.fasterxml.jackson.databind.JsonMappingException", "<null>"}, {"com.fasterxml.jackson.databind.MappingIterator", "readAll", "java.util.Collection", "<empty>"}, {"com.fasterxml.jackson.databind.MappingIterator", "getParser", ""}}, 2), new String[][]{{"getTextCharacters", "", "0"}, {"getCurrentLocation", "", "2"}, {"getSourceRef", "", "6"}});
  assertNotNull(actual);
  assertEquals("[C", actual.getClass().getName());
  assertEquals("[ ]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{hasNext=false, hasNextValue=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput180() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.MappingIterator", "com.fasterxml.jackson.databind.MappingIterator", "getCurrentLocation", new String[]{}, new String[]{}, false, 0, null, 2);
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.core.JsonLocation", actual.getClass().getName());
  assertEquals("[Source: 2; line: 1, column: 1] {getByteOffset=0, getCharOffset=-1, getColumnNr=1, getLineNr=1}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{hasNext=!ArrayIndexOutOfBoundsException, hasNextValue=!JsonParseException}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput181() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.MappingIterator", "com.fasterxml.jackson.databind.MappingIterator", "getParser", new String[]{}, new String[]{}, false, 16, new String[][]{{"com.fasterxml.jackson.databind.MappingIterator", "getCurrentLocation", ""}, {"com.fasterxml.jackson.databind.MappingIterator", "_handleMappingException", "com.fasterxml.jackson.databind.JsonMappingException", "<null>"}, {"com.fasterxml.jackson.databind.MappingIterator", "readAll", "java.util.Collection", "<sample:1>"}}, 2), new String[][]{{"getTextCharacters", "", "0"}, {"getCurrentLocation", "", "2"}});
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.core.JsonLocation", actual.getClass().getName());
  assertEquals("receiver state after the call", "{hasNext=false, hasNextValue=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput182() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.MappingIterator", "com.fasterxml.jackson.databind.MappingIterator", "getParser", new String[]{}, new String[]{}, false, 16, new String[][]{{"com.fasterxml.jackson.databind.MappingIterator", "getCurrentLocation", ""}, {"com.fasterxml.jackson.databind.MappingIterator", "_handleMappingException", "com.fasterxml.jackson.databind.JsonMappingException", "<null>"}}, 2), new String[][]{{"getTextCharacters", "", "0"}, {"getCurrentLocation", "", "2"}, {"getLineNr", "", "4"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("1", String.valueOf(actual));
  assertEquals("receiver state after the call", "{hasNext=false, hasNextValue=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput183() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.MappingIterator", "com.fasterxml.jackson.databind.MappingIterator", "getParser", new String[]{}, new String[]{}, false, 19, new String[][]{{"com.fasterxml.jackson.databind.MappingIterator", "getCurrentLocation", ""}, {"com.fasterxml.jackson.databind.MappingIterator", "_handleMappingException", "com.fasterxml.jackson.databind.JsonMappingException", "<null>"}}, 2), new String[][]{{"getTextCharacters", "", "0"}, {"getCurrentLocation", "", "2"}, {"getLineNr", "", "4"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("1", String.valueOf(actual));
  assertEquals("receiver state after the call", "{hasNext=true, hasNextValue=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput184() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.MappingIterator", "com.fasterxml.jackson.databind.MappingIterator", "getParser", new String[]{}, new String[]{}, false, 21, new String[][]{{"com.fasterxml.jackson.databind.MappingIterator", "getCurrentLocation", ""}, {"com.fasterxml.jackson.databind.MappingIterator", "_handleMappingException", "com.fasterxml.jackson.databind.JsonMappingException", "<null>"}}, 2), new String[][]{{"getTextLength", "", "0"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput185() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.MappingIterator", "com.fasterxml.jackson.databind.MappingIterator", "readAll", new String[]{}, new String[]{}, false, 2, new String[][]{{"com.fasterxml.jackson.databind.MappingIterator", "hasNext", ""}}), new String[][]{{"size", "", "4"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{hasNext=false, hasNextValue=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput186() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.MappingIterator", "com.fasterxml.jackson.databind.MappingIterator", "readAll", new String[]{}, new String[]{}, false, 0, null, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.ArrayIndexOutOfBoundsException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput187() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.MappingIterator", "com.fasterxml.jackson.databind.MappingIterator", "readAll", new String[]{}, new String[]{}, false, 1, new String[][]{}, 3), new String[][]{{"retainAll", "java.util.Collection", "7"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{hasNext=false, hasNextValue=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput188() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.MappingIterator", "com.fasterxml.jackson.databind.MappingIterator", "readAll", new String[]{}, new String[]{}, false, 2, new String[][]{{"com.fasterxml.jackson.databind.MappingIterator", "_throwNoSuchElement", ""}}, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("com.fasterxml.jackson.core.JsonParseException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput189() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.MappingIterator", "com.fasterxml.jackson.databind.MappingIterator", "readAll", new String[]{}, new String[]{}, false, 3, new String[][]{{"com.fasterxml.jackson.databind.MappingIterator", "_throwNoSuchElement", ""}}, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput190() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.MappingIterator", "com.fasterxml.jackson.databind.MappingIterator", "emptyIterator", new String[]{}, new String[]{}, true), new String[][]{{"getParser", "", "6"}, {"hasNextValue", "", "1"}, {"readAll", "", "7"}});
  assertNotNull(actual);
  assertEquals("java.util.ArrayList", actual.getClass().getName());
  assertEquals("[]", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput191() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.MappingIterator", "com.fasterxml.jackson.databind.MappingIterator", "readAll", new String[]{}, new String[]{}, false, 4, new String[][]{}), new String[][]{{"clone", "", "7"}, {"retainAll", "java.util.Collection", "2"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{hasNext=false, hasNextValue=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput192() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.MappingIterator", "com.fasterxml.jackson.databind.MappingIterator", "_throwNoSuchElement", new String[]{}, new String[]{}, false, 0, null, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.util.NoSuchElementException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput193() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.MappingIterator", "com.fasterxml.jackson.databind.MappingIterator", "readAll", new String[]{}, new String[]{}, false, 12, new String[][]{{"com.fasterxml.jackson.databind.MappingIterator", "next", ""}, {"com.fasterxml.jackson.databind.MappingIterator", "hasNext", ""}}, 1), new String[][]{{"clone", "", "7"}});
  assertNotNull(actual);
  assertEquals("java.util.ArrayList", actual.getClass().getName());
  assertEquals("[]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{hasNext=false, hasNextValue=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput194() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.MappingIterator", "com.fasterxml.jackson.databind.MappingIterator", "readAll", new String[]{}, new String[]{}, false, 13, new String[][]{{"com.fasterxml.jackson.databind.MappingIterator", "next", ""}, {"com.fasterxml.jackson.databind.MappingIterator", "hasNext", ""}}, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput195() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.MappingIterator", "com.fasterxml.jackson.databind.MappingIterator", "readAll", new String[]{}, new String[]{}, false, 12, new String[][]{{"com.fasterxml.jackson.databind.MappingIterator", "next", ""}, {"com.fasterxml.jackson.databind.MappingIterator", "hasNext", ""}}, 1), new String[][]{{"get", "int", "2"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IndexOutOfBoundsException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput196() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.MappingIterator", "com.fasterxml.jackson.databind.MappingIterator", "readAll", new String[]{}, new String[]{}, false, 14, new String[][]{{"com.fasterxml.jackson.databind.MappingIterator", "hasNext", ""}, {"com.fasterxml.jackson.databind.MappingIterator", "_throwNoSuchElement", ""}, {"com.fasterxml.jackson.databind.MappingIterator", "next", ""}}, 1), new String[][]{{"containsAll", "java.util.Collection", "2"}, {"remove", "java.lang.Object", "6"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{hasNext=false, hasNextValue=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput197() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.MappingIterator", "com.fasterxml.jackson.databind.MappingIterator", "_handleMappingException", new String[]{"com.fasterxml.jackson.databind.JsonMappingException"}, new String[]{"<sample:1>"}, false, 2, new String[][]{}, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("com.fasterxml.jackson.databind.RuntimeJsonMappingException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput198() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.MappingIterator", "com.fasterxml.jackson.databind.MappingIterator", "getParserSchema", new String[]{}, new String[]{}, false, 6, new String[][]{{"com.fasterxml.jackson.databind.MappingIterator", "remove", ""}, {"com.fasterxml.jackson.databind.MappingIterator", "next", ""}}, 2);
  assertNull(actual);
  assertEquals("receiver state after the call", "{hasNext=false, hasNextValue=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput199() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.MappingIterator", "com.fasterxml.jackson.databind.MappingIterator", "getParserSchema", new String[]{}, new String[]{}, false, 7, new String[][]{{"com.fasterxml.jackson.databind.MappingIterator", "remove", ""}, {"com.fasterxml.jackson.databind.MappingIterator", "next", ""}}, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput200() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.MappingIterator", "com.fasterxml.jackson.databind.MappingIterator", "getParserSchema", new String[]{}, new String[]{}, false, 6, new String[][]{{"com.fasterxml.jackson.databind.MappingIterator", "remove", ""}, {"com.fasterxml.jackson.databind.MappingIterator", "next", ""}}, 3);
  assertNull(actual);
  assertEquals("receiver state after the call", "{hasNext=false, hasNextValue=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput201() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.MappingIterator", "com.fasterxml.jackson.databind.MappingIterator", "_resync", new String[]{}, new String[]{}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.MappingIterator", "_handleIOException", "java.io.IOException", "<empty>"}}, 3);
  assertNull(actual);
  assertEquals("receiver state after the call", "{hasNext=!ArrayIndexOutOfBoundsException, hasNextValue=!JsonParseException}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput202() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.MappingIterator", "com.fasterxml.jackson.databind.MappingIterator", "_resync", new String[]{}, new String[]{}, false, 1, new String[][]{{"com.fasterxml.jackson.databind.MappingIterator", "_handleIOException", "java.io.IOException", "<empty>"}}, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput203() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.MappingIterator", "com.fasterxml.jackson.databind.MappingIterator", "getCurrentLocation", new String[]{}, new String[]{}, false, 6, new String[][]{{"com.fasterxml.jackson.databind.MappingIterator", "nextValue", ""}, {"com.fasterxml.jackson.databind.MappingIterator", "close", ""}}, 1);
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.core.JsonLocation", actual.getClass().getName());
  assertEquals("receiver state after the call", "{hasNext=false, hasNextValue=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput204() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.MappingIterator", "com.fasterxml.jackson.databind.MappingIterator", "getCurrentLocation", new String[]{}, new String[]{}, false, 9, new String[][]{{"com.fasterxml.jackson.databind.MappingIterator", "next", ""}, {"com.fasterxml.jackson.databind.MappingIterator", "close", ""}}, 1);
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.core.JsonLocation", actual.getClass().getName());
  assertEquals("[Source: 0; line: 1, column: 2] {getByteOffset=-1, getCharOffset=1, getColumnNr=2, getLineNr=1}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{hasNext=false, hasNextValue=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput205() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.MappingIterator", "com.fasterxml.jackson.databind.MappingIterator", "readAll", new String[]{}, new String[]{}, false, 6, new String[][]{{"com.fasterxml.jackson.databind.MappingIterator", "getCurrentLocation", ""}}, 3);
  assertNotNull(actual);
  assertEquals("java.util.ArrayList", actual.getClass().getName());
  assertEquals("[]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{hasNext=false, hasNextValue=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput206() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.MappingIterator", "com.fasterxml.jackson.databind.MappingIterator", "readAll", new String[]{"java.util.List"}, new String[]{"<sample:4>"}, false, 4, new String[][]{}, 3), new String[][]{{"trimToSize", "", "5"}, {"iterator", "", "7"}});
  assertNotNull(actual);
  assertEquals("java.util.ArrayList$Itr", actual.getClass().getName());
  assertEquals("{hasNext=true}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{hasNext=false, hasNextValue=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput207() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.MappingIterator", "com.fasterxml.jackson.databind.MappingIterator", "readAll", new String[]{"java.util.List"}, new String[]{"<empty>"}, false, 4, new String[][]{{"com.fasterxml.jackson.databind.MappingIterator", "_resync", ""}, {"com.fasterxml.jackson.databind.MappingIterator", "_throwNoSuchElement", ""}}, 3), new String[][]{{"trimToSize", "", "5"}, {"iterator", "", "7"}});
  assertNotNull(actual);
  assertEquals("java.util.ArrayList$Itr", actual.getClass().getName());
  assertEquals("{hasNext=false}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{hasNext=false, hasNextValue=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput208() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.MappingIterator", "com.fasterxml.jackson.databind.MappingIterator", "readAll", new String[]{"java.util.List"}, new String[]{"<empty>"}, false, 12, new String[][]{{"com.fasterxml.jackson.databind.MappingIterator", "_resync", ""}, {"com.fasterxml.jackson.databind.MappingIterator", "_throwNoSuchElement", ""}}, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("com.fasterxml.jackson.core.JsonParseException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput209() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.MappingIterator", "com.fasterxml.jackson.databind.MappingIterator", "readAll", new String[]{"java.util.List"}, new String[]{"<null>"}, false, 4, new String[][]{{"com.fasterxml.jackson.databind.MappingIterator", "readAll", "java.util.List", "<sample:0>"}, {"com.fasterxml.jackson.databind.MappingIterator", "hasNext", ""}}, 3);
  assertNull(actual);
  assertEquals("receiver state after the call", "{hasNext=false, hasNextValue=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput210() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.MappingIterator", "com.fasterxml.jackson.databind.MappingIterator", "readAll", new String[]{"java.util.List"}, new String[]{"<sample:3>"}, false, 4, new String[][]{{"com.fasterxml.jackson.databind.MappingIterator", "readAll", "java.util.List", "<sample:0>"}, {"com.fasterxml.jackson.databind.MappingIterator", "hasNext", ""}}, 3), new String[][]{{"trimToSize", "", "5"}, {"addAll", "java.util.Collection", "7"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
  assertEquals("receiver state after the call", "{hasNext=false, hasNextValue=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput211() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.MappingIterator", "com.fasterxml.jackson.databind.MappingIterator", "readAll", new String[]{"java.util.List"}, new String[]{"<sample:2>"}, false, 4, new String[][]{{"com.fasterxml.jackson.databind.MappingIterator", "readAll", "java.util.List", "<sample:2>"}, {"com.fasterxml.jackson.databind.MappingIterator", "close", ""}, {"com.fasterxml.jackson.databind.MappingIterator", "hasNext", ""}}, 3), new String[][]{{"lastIndexOf", "java.lang.Object", "5"}, {"addAll", "java.util.Collection", "7"}, {"ensureCapacity", "int", "7"}});
  assertNotNull(actual);
  assertEquals("java.util.ArrayList", actual.getClass().getName());
  assertEquals("[0, sample, , sample, ]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{hasNext=false, hasNextValue=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput212() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.MappingIterator", "com.fasterxml.jackson.databind.MappingIterator", "readAll", new String[]{}, new String[]{}, false, 4, new String[][]{}, 1), new String[][]{{"listIterator", "", "0"}});
  assertNotNull(actual);
  assertEquals("java.util.ArrayList$ListItr", actual.getClass().getName());
  assertEquals("{hasNext=false, hasPrevious=false}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{hasNext=false, hasNextValue=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput213() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.MappingIterator", "com.fasterxml.jackson.databind.MappingIterator", "readAll", new String[]{}, new String[]{}, false, 5, new String[][]{}, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.ArrayIndexOutOfBoundsException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput214() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.MappingIterator", "com.fasterxml.jackson.databind.MappingIterator", "readAll", new String[]{}, new String[]{}, false, 5, new String[][]{{"com.fasterxml.jackson.databind.MappingIterator", "hasNextValue", ""}, {"com.fasterxml.jackson.databind.MappingIterator", "_handleIOException", "java.io.IOException", "<sample:2>"}, {"com.fasterxml.jackson.databind.MappingIterator", "remove", ""}}, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("com.fasterxml.jackson.core.JsonParseException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput215() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.MappingIterator", "com.fasterxml.jackson.databind.MappingIterator", "emptyIterator", new String[]{}, new String[]{}, true, 0, null, 3);
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.databind.MappingIterator", actual.getClass().getName());
  assertEquals("{hasNext=false, hasNextValue=false}", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput216() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.MappingIterator", "com.fasterxml.jackson.databind.MappingIterator", "nextValue", new String[]{}, new String[]{}, false, 0, null, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.ArrayIndexOutOfBoundsException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput217() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.MappingIterator", "com.fasterxml.jackson.databind.MappingIterator", "readAll", new String[]{}, new String[]{}, false, 3, new String[][]{{"com.fasterxml.jackson.databind.MappingIterator", "next", ""}, {"com.fasterxml.jackson.databind.MappingIterator", "getParser", ""}, {"com.fasterxml.jackson.databind.MappingIterator", "next", ""}}, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput218() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.MappingIterator", "com.fasterxml.jackson.databind.MappingIterator", "readAll", new String[]{}, new String[]{}, false, 2, new String[][]{{"com.fasterxml.jackson.databind.MappingIterator", "next", ""}, {"com.fasterxml.jackson.databind.MappingIterator", "getParser", ""}}, 2), new String[][]{{"clone", "", "0"}, {"remove", "int", "5"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IndexOutOfBoundsException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput219() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.MappingIterator", "com.fasterxml.jackson.databind.MappingIterator", "readAll", new String[]{}, new String[]{}, false, 4, new String[][]{{"com.fasterxml.jackson.databind.MappingIterator", "_handleIOException", "java.io.IOException", "<sample:0>"}, {"com.fasterxml.jackson.databind.MappingIterator", "_handleMappingException", "com.fasterxml.jackson.databind.JsonMappingException", "<sample:1>"}}, 2), new String[][]{{"clone", "", "3"}, {"clone", "", "5"}, {"contains", "java.lang.Object", "5"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{hasNext=false, hasNextValue=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput220() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.MappingIterator", "com.fasterxml.jackson.databind.MappingIterator", "readAll", new String[]{}, new String[]{}, false, 4, new String[][]{{"com.fasterxml.jackson.databind.MappingIterator", "readAll", "java.util.List", "<empty>"}}, 2), new String[][]{{"isEmpty", "", "5"}, {"iterator", "", "7"}});
  assertNotNull(actual);
  assertEquals("java.util.ArrayList$Itr", actual.getClass().getName());
  assertEquals("{hasNext=false}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{hasNext=false, hasNextValue=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput221() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.MappingIterator", "com.fasterxml.jackson.databind.MappingIterator", "readAll", new String[]{}, new String[]{}, false, 4, new String[][]{{"com.fasterxml.jackson.databind.MappingIterator", "next", ""}}, 3), new String[][]{{"isEmpty", "", "0"}, {"iterator", "", "7"}, {"next", "", "4"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.util.NoSuchElementException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput222() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.MappingIterator", "com.fasterxml.jackson.databind.MappingIterator", "readAll", new String[]{}, new String[]{}, false, 2, new String[][]{{"com.fasterxml.jackson.databind.MappingIterator", "next", ""}, {"com.fasterxml.jackson.databind.MappingIterator", "close", ""}, {"com.fasterxml.jackson.databind.MappingIterator", "readAll", "java.util.Collection", "<sample:1>"}}, 3), new String[][]{{"subList", "int,int", "7"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IndexOutOfBoundsException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput223() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.MappingIterator", "com.fasterxml.jackson.databind.MappingIterator", "hasNextValue", new String[]{}, new String[]{}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.MappingIterator", "remove", ""}}, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.ArrayIndexOutOfBoundsException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput224() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.MappingIterator", "com.fasterxml.jackson.databind.MappingIterator", "readAll", new String[]{}, new String[]{}, false, 6, new String[][]{{"com.fasterxml.jackson.databind.MappingIterator", "_handleMappingException", "com.fasterxml.jackson.databind.JsonMappingException", "<sample:4>"}, {"com.fasterxml.jackson.databind.MappingIterator", "getParserSchema", ""}, {"com.fasterxml.jackson.databind.MappingIterator", "getParserSchema", ""}}, 1), new String[][]{{"addAll", "java.util.Collection", "5"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
  assertEquals("receiver state after the call", "{hasNext=false, hasNextValue=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput225() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.MappingIterator", "com.fasterxml.jackson.databind.MappingIterator", "getParser", new String[]{}, new String[]{}, false, 0, null, 1), new String[][]{{"getByteValue", "", "0"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("com.fasterxml.jackson.core.JsonParseException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput226() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.MappingIterator", "com.fasterxml.jackson.databind.MappingIterator", "getParser", new String[]{}, new String[]{}, false, 6, new String[][]{{"com.fasterxml.jackson.databind.MappingIterator", "getCurrentLocation", ""}, {"com.fasterxml.jackson.databind.MappingIterator", "getParserSchema", ""}}, 1), new String[][]{{"getTokenLocation", "", "7"}});
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.core.JsonLocation", actual.getClass().getName());
  assertEquals("receiver state after the call", "{hasNext=false, hasNextValue=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput227() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.MappingIterator", "com.fasterxml.jackson.databind.MappingIterator", "getParser", new String[]{}, new String[]{}, false, 7, new String[][]{{"com.fasterxml.jackson.databind.MappingIterator", "getCurrentLocation", ""}, {"com.fasterxml.jackson.databind.MappingIterator", "getParserSchema", ""}}, 1);
  assertNull(actual);
  assertEquals("receiver state after the call", "{hasNext=false, hasNextValue=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput228() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.MappingIterator", "com.fasterxml.jackson.databind.MappingIterator", "getParser", new String[]{}, new String[]{}, false, 5, new String[][]{{"com.fasterxml.jackson.databind.MappingIterator", "getCurrentLocation", ""}, {"com.fasterxml.jackson.databind.MappingIterator", "getParserSchema", ""}}, 1), new String[][]{{"getTokenLocation", "", "7"}});
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.core.JsonLocation", actual.getClass().getName());
  assertEquals("[Source: key; line: 1, column: 1] {getByteOffset=0, getCharOffset=-1, getColumnNr=1, getLineNr=1}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{hasNext=!ArrayIndexOutOfBoundsException, hasNextValue=!JsonParseException}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput229() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.MappingIterator", "com.fasterxml.jackson.databind.MappingIterator", "hasNextValue", new String[]{}, new String[]{}, false, 5, new String[][]{{"com.fasterxml.jackson.databind.MappingIterator", "readAll", ""}}, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("com.fasterxml.jackson.core.JsonParseException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput230() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.MappingIterator", "com.fasterxml.jackson.databind.MappingIterator", "hasNextValue", new String[]{}, new String[]{}, false, 2, new String[][]{{"com.fasterxml.jackson.databind.MappingIterator", "close", ""}, {"com.fasterxml.jackson.databind.MappingIterator", "next", ""}, {"com.fasterxml.jackson.databind.MappingIterator", "readAll", ""}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{hasNext=false, hasNextValue=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput231() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.MappingIterator", "com.fasterxml.jackson.databind.MappingIterator", "hasNextValue", new String[]{}, new String[]{}, false, 3, new String[][]{{"com.fasterxml.jackson.databind.MappingIterator", "readAll", ""}}, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput232() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.MappingIterator", "com.fasterxml.jackson.databind.MappingIterator", "hasNextValue", new String[]{}, new String[]{}, false, 2, new String[][]{{"com.fasterxml.jackson.databind.MappingIterator", "getParser", ""}}, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("com.fasterxml.jackson.core.JsonParseException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput233() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.MappingIterator", "com.fasterxml.jackson.databind.MappingIterator", "readAll", new String[]{"java.util.Collection"}, new String[]{"<sample:5>"}, false, 1, new String[][]{});
  assertNotNull(actual);
  assertEquals("java.util.ArrayList", actual.getClass().getName());
  assertEquals("[a, 0, sample]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{hasNext=false, hasNextValue=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput234() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.MappingIterator", "com.fasterxml.jackson.databind.MappingIterator", "getParserSchema", new String[]{}, new String[]{}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.MappingIterator", "readAll", "java.util.List", "<empty>"}}, 2);
  assertNull(actual);
  assertEquals("receiver state after the call", "{hasNext=!RuntimeException, hasNextValue=!JsonParseException}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput235() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.MappingIterator", "com.fasterxml.jackson.databind.MappingIterator", "getParserSchema", new String[]{}, new String[]{}, false, 0, null, 2);
  assertNull(actual);
  assertEquals("receiver state after the call", "{hasNext=!ArrayIndexOutOfBoundsException, hasNextValue=!JsonParseException}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput236() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.MappingIterator", "com.fasterxml.jackson.databind.MappingIterator", "getParserSchema", new String[]{}, new String[]{}, false, 0, null, 3);
  assertNull(actual);
  assertEquals("receiver state after the call", "{hasNext=!ArrayIndexOutOfBoundsException, hasNextValue=!JsonParseException}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput237() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.MappingIterator", "com.fasterxml.jackson.databind.MappingIterator", "getParserSchema", new String[]{}, new String[]{}, false, 1, new String[][]{}, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput238() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.MappingIterator", "com.fasterxml.jackson.databind.MappingIterator", "emptyIterator", new String[]{}, new String[]{}, true), new String[][]{{"readAll", "java.util.Collection", "6"}, {"subList", "int,int", "0"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IndexOutOfBoundsException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput239() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.MappingIterator", "com.fasterxml.jackson.databind.MappingIterator", "getParser", new String[]{}, new String[]{}, false, 0, null, 1);
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.core.json.UTF8StreamJsonParser", actual.getClass().getName());
  assertEquals("{canReadObjectId=false, canReadTypeId=false, getBigIntegerValue=!JsonParseException, getBinaryValue=!JsonParseException, getBooleanValue=!JsonParseException, getByteValue=!JsonParseException, getCurre...#474#1075917232", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{hasNext=!ArrayIndexOutOfBoundsException, hasNextValue=!JsonParseException}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput240() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.MappingIterator", "com.fasterxml.jackson.databind.MappingIterator", "_throwNoSuchElement", new String[]{}, new String[]{}, false, 0, null, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.util.NoSuchElementException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput241() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.MappingIterator", "com.fasterxml.jackson.databind.MappingIterator", "getCurrentLocation", new String[]{}, new String[]{}, false, 6, new String[][]{{"com.fasterxml.jackson.databind.MappingIterator", "hasNextValue", ""}, {"com.fasterxml.jackson.databind.MappingIterator", "hasNextValue", ""}}, 2), new String[][]{{"getLineNr", "", "5"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("1", String.valueOf(actual));
  assertEquals("receiver state after the call", "{hasNext=false, hasNextValue=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput242() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.MappingIterator", "com.fasterxml.jackson.databind.MappingIterator", "readAll", new String[]{"java.util.List"}, new String[]{"<sample:0>"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.MappingIterator", "nextValue", ""}}, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("com.fasterxml.jackson.core.JsonParseException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput243() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.MappingIterator", "com.fasterxml.jackson.databind.MappingIterator", "getCurrentLocation", new String[]{}, new String[]{}, false, 10, new String[][]{{"com.fasterxml.jackson.databind.MappingIterator", "remove", ""}, {"com.fasterxml.jackson.databind.MappingIterator", "readAll", ""}}, 1), new String[][]{{"getByteOffset", "", "5"}});
  assertNotNull(actual);
  assertEquals("java.lang.Long", actual.getClass().getName());
  assertEquals("-1", String.valueOf(actual));
  assertEquals("receiver state after the call", "{hasNext=!RuntimeException, hasNextValue=!JsonParseException}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput244() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.MappingIterator", "com.fasterxml.jackson.databind.MappingIterator", "getCurrentLocation", new String[]{}, new String[]{}, false, 6, new String[][]{{"com.fasterxml.jackson.databind.MappingIterator", "getCurrentLocation", ""}, {"com.fasterxml.jackson.databind.MappingIterator", "readAll", ""}, {"com.fasterxml.jackson.databind.MappingIterator", "remove", ""}}, 3), new String[][]{{"getLineNr", "", "4"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("1", String.valueOf(actual));
  assertEquals("receiver state after the call", "{hasNext=false, hasNextValue=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput245() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.MappingIterator", "com.fasterxml.jackson.databind.MappingIterator", "getCurrentLocation", new String[]{}, new String[]{}, false, 5, new String[][]{{"com.fasterxml.jackson.databind.MappingIterator", "readAll", ""}, {"com.fasterxml.jackson.databind.MappingIterator", "getParser", ""}, {"com.fasterxml.jackson.databind.MappingIterator", "readAll", "java.util.Collection", "<sample:1>"}}, 1), new String[][]{{"getLineNr", "", "1"}, {"getColumnNr", "", "5"}, {"getSourceRef", "", "7"}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("key", String.valueOf(actual));
  assertEquals("receiver state after the call", "{hasNext=!RuntimeException, hasNextValue=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput246() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.MappingIterator", "com.fasterxml.jackson.databind.MappingIterator", "getCurrentLocation", new String[]{}, new String[]{}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.MappingIterator", "readAll", ""}, {"com.fasterxml.jackson.databind.MappingIterator", "readAll", "java.util.Collection", "<sample:0>"}}, 1), new String[][]{{"getLineNr", "", "1"}, {"getCharOffset", "", "5"}, {"getSourceRef", "", "1"}, {"getCharOffset", "", "0"}});
  assertNotNull(actual);
  assertEquals("java.lang.Long", actual.getClass().getName());
  assertEquals("-1", String.valueOf(actual));
  assertEquals("receiver state after the call", "{hasNext=!RuntimeException, hasNextValue=!NullPointerException}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput247() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.MappingIterator", "com.fasterxml.jackson.databind.MappingIterator", "emptyIterator", new String[]{}, new String[]{}, true), new String[][]{{"getParser", "", "7"}, {"readAll", "java.util.Collection", "2"}, {"lastIndexOf", "java.lang.Object", "2"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("-1", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput248() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.MappingIterator", "com.fasterxml.jackson.databind.MappingIterator", "emptyIterator", new String[]{}, new String[]{}, true), new String[][]{{"remove", "", "1"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.UnsupportedOperationException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput249() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.MappingIterator", "com.fasterxml.jackson.databind.MappingIterator", "getCurrentLocation", new String[]{}, new String[]{}, false, 8, new String[][]{{"com.fasterxml.jackson.databind.MappingIterator", "readAll", "java.util.Collection", "<sample:2>"}, {"com.fasterxml.jackson.databind.MappingIterator", "getParserSchema", ""}, {"com.fasterxml.jackson.databind.MappingIterator", "readAll", ""}}, 2), new String[][]{{"getColumnNr", "", "4"}, {"getCharOffset", "", "5"}, {"getLineNr", "", "0"}, {"getCharOffset", "", "2"}});
  assertNotNull(actual);
  assertEquals("java.lang.Long", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{hasNext=false, hasNextValue=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput250() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.MappingIterator", "com.fasterxml.jackson.databind.MappingIterator", "nextValue", new String[]{}, new String[]{}, false, 0, null, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.ArrayIndexOutOfBoundsException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput251() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.MappingIterator", "com.fasterxml.jackson.databind.MappingIterator", "next", new String[]{}, new String[]{}, false, 0, null, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.ArrayIndexOutOfBoundsException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput252() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.MappingIterator", "com.fasterxml.jackson.databind.MappingIterator", "nextValue", new String[]{}, new String[]{}, false, 13, new String[][]{}, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput253() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.MappingIterator", "com.fasterxml.jackson.databind.MappingIterator", "nextValue", new String[]{}, new String[]{}, false, 4, new String[][]{{"com.fasterxml.jackson.databind.MappingIterator", "_handleIOException", "java.io.IOException", "<sample:3>"}}, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.util.NoSuchElementException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput254() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.MappingIterator", "com.fasterxml.jackson.databind.MappingIterator", "nextValue", new String[]{}, new String[]{}, false, 9, new String[][]{}, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("com.fasterxml.jackson.core.JsonParseException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput255() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.MappingIterator", "com.fasterxml.jackson.databind.MappingIterator", "nextValue", new String[]{}, new String[]{}, false, 19, new String[][]{{"com.fasterxml.jackson.databind.MappingIterator", "_handleMappingException", "com.fasterxml.jackson.databind.JsonMappingException", "<sample:3>"}, {"com.fasterxml.jackson.databind.MappingIterator", "getCurrentLocation", ""}}, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.UnsupportedOperationException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput256() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.MappingIterator", "com.fasterxml.jackson.databind.MappingIterator", "nextValue", new String[]{}, new String[]{}, false, 21, new String[][]{{"com.fasterxml.jackson.databind.MappingIterator", "_handleMappingException", "com.fasterxml.jackson.databind.JsonMappingException", "<sample:3>"}}, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput257() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.MappingIterator", "com.fasterxml.jackson.databind.MappingIterator", "nextValue", new String[]{}, new String[]{}, false, 22, new String[][]{{"com.fasterxml.jackson.databind.MappingIterator", "_handleMappingException", "com.fasterxml.jackson.databind.JsonMappingException", "<sample:3>"}}, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.util.NoSuchElementException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput258() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.MappingIterator", "com.fasterxml.jackson.databind.MappingIterator", "nextValue", new String[]{}, new String[]{}, false, 24, new String[][]{{"com.fasterxml.jackson.databind.MappingIterator", "_throwNoSuchElement", ""}, {"com.fasterxml.jackson.databind.MappingIterator", "_handleMappingException", "com.fasterxml.jackson.databind.JsonMappingException", "<sample:3>"}}, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("com.fasterxml.jackson.core.JsonParseException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput259() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.MappingIterator", "com.fasterxml.jackson.databind.MappingIterator", "readAll", new String[]{"java.util.Collection"}, new String[]{"<sample:3>"}, false, 6, new String[][]{{"com.fasterxml.jackson.databind.MappingIterator", "_handleMappingException", "com.fasterxml.jackson.databind.JsonMappingException", "<sample:5>"}});
  assertNotNull(actual);
  assertEquals("java.util.ArrayList", actual.getClass().getName());
  assertEquals("[sample]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{hasNext=false, hasNextValue=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput260() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.MappingIterator", "com.fasterxml.jackson.databind.MappingIterator", "_handleIOException", new String[]{"java.io.IOException"}, new String[]{"<sample:0>"}, false, 6, new String[][]{{"com.fasterxml.jackson.databind.MappingIterator", "_throwNoSuchElement", ""}, {"com.fasterxml.jackson.databind.MappingIterator", "remove", ""}, {"com.fasterxml.jackson.databind.MappingIterator", "readAll", "java.util.List", "<sample:1>"}}, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.RuntimeException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput261() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.MappingIterator", "com.fasterxml.jackson.databind.MappingIterator", "readAll", new String[]{"java.util.List"}, new String[]{"<sample:3>"}, false, 0, null, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.ArrayIndexOutOfBoundsException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput262() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.MappingIterator", "com.fasterxml.jackson.databind.MappingIterator", "hasNext", new String[]{}, new String[]{}, false, 4, new String[][]{}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{hasNext=false, hasNextValue=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput263() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.MappingIterator", "com.fasterxml.jackson.databind.MappingIterator", "hasNext", new String[]{}, new String[]{}, false, 5, new String[][]{}, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.ArrayIndexOutOfBoundsException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput264() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.MappingIterator", "com.fasterxml.jackson.databind.MappingIterator", "hasNext", new String[]{}, new String[]{}, false, 9, new String[][]{}, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.RuntimeException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput265() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.MappingIterator", "com.fasterxml.jackson.databind.MappingIterator", "hasNext", new String[]{}, new String[]{}, false, 13, new String[][]{}, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput266() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.MappingIterator", "com.fasterxml.jackson.databind.MappingIterator", "remove", new String[]{}, new String[]{}, false, 10, new String[][]{{"com.fasterxml.jackson.databind.MappingIterator", "hasNextValue", ""}, {"com.fasterxml.jackson.databind.MappingIterator", "_resync", ""}}, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.UnsupportedOperationException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput267() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.MappingIterator", "com.fasterxml.jackson.databind.MappingIterator", "getParserSchema", new String[]{}, new String[]{}, false, 10, new String[][]{{"com.fasterxml.jackson.databind.MappingIterator", "readAll", "java.util.List", "<sample:2>"}}, 3);
  assertNull(actual);
  assertEquals("receiver state after the call", "{hasNext=!RuntimeException, hasNextValue=!JsonParseException}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput268() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.MappingIterator", "com.fasterxml.jackson.databind.MappingIterator", "readAll", new String[]{"java.util.List"}, new String[]{"<sample:0>"}, false, 0, null, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.ArrayIndexOutOfBoundsException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput269() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.MappingIterator", "com.fasterxml.jackson.databind.MappingIterator", "_handleIOException", new String[]{"java.io.IOException"}, new String[]{"<null>"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.MappingIterator", "readAll", "java.util.List", "<sample:2>"}}, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput270() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.MappingIterator", "com.fasterxml.jackson.databind.MappingIterator", "readAll", new String[]{"java.util.Collection"}, new String[]{"<sample:1>"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.MappingIterator", "_resync", ""}}, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.ArrayIndexOutOfBoundsException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput271() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.MappingIterator", "com.fasterxml.jackson.databind.MappingIterator", "getCurrentLocation", new String[]{}, new String[]{}, false, 0, null, 3), new String[][]{{"getByteOffset", "", "1"}, {"getColumnNr", "", "6"}, {"getLineNr", "", "7"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("1", String.valueOf(actual));
  assertEquals("receiver state after the call", "{hasNext=!ArrayIndexOutOfBoundsException, hasNextValue=!JsonParseException}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput272() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.MappingIterator", "com.fasterxml.jackson.databind.MappingIterator", "nextValue", new String[]{}, new String[]{}, false, 2, new String[][]{{"com.fasterxml.jackson.databind.MappingIterator", "hasNext", ""}, {"com.fasterxml.jackson.databind.MappingIterator", "next", ""}}, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.util.NoSuchElementException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput273() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.MappingIterator", "com.fasterxml.jackson.databind.MappingIterator", "nextValue", new String[]{}, new String[]{}, false, 3, new String[][]{{"com.fasterxml.jackson.databind.MappingIterator", "hasNext", ""}, {"com.fasterxml.jackson.databind.MappingIterator", "next", ""}}, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput274() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.MappingIterator", "com.fasterxml.jackson.databind.MappingIterator", "next", new String[]{}, new String[]{}, false, 0, null, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.ArrayIndexOutOfBoundsException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput275() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.MappingIterator", "com.fasterxml.jackson.databind.MappingIterator", "getParser", new String[]{}, new String[]{}, false, 12, new String[][]{}, 1), new String[][]{{"getCurrentTokenId", "", "1"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{hasNext=!RuntimeException, hasNextValue=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput276() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.MappingIterator", "com.fasterxml.jackson.databind.MappingIterator", "getParser", new String[]{}, new String[]{}, false, 13, new String[][]{}, 1), new String[][]{{"getCurrentValue", "", "1"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput277() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.MappingIterator", "com.fasterxml.jackson.databind.MappingIterator", "getParser", new String[]{}, new String[]{}, false, 15, new String[][]{{"com.fasterxml.jackson.databind.MappingIterator", "readAll", "java.util.List", "<empty>"}}, 1), new String[][]{{"getCurrentTokenId", "", "1"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{hasNext=!RuntimeException, hasNextValue=!JsonParseException}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput278() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.MappingIterator", "com.fasterxml.jackson.databind.MappingIterator", "_resync", new String[]{}, new String[]{}, false, 8, new String[][]{{"com.fasterxml.jackson.databind.MappingIterator", "next", ""}, {"com.fasterxml.jackson.databind.MappingIterator", "readAll", "java.util.List", "<sample:0>"}}, 1);
  assertNull(actual);
  assertEquals("receiver state after the call", "{hasNext=false, hasNextValue=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput279() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.MappingIterator", "com.fasterxml.jackson.databind.MappingIterator", "_resync", new String[]{}, new String[]{}, false, 9, new String[][]{{"com.fasterxml.jackson.databind.MappingIterator", "next", ""}, {"com.fasterxml.jackson.databind.MappingIterator", "readAll", "java.util.List", "<sample:0>"}}, 1);
  assertNull(actual);
  assertEquals("receiver state after the call", "{hasNext=!RuntimeException, hasNextValue=!JsonParseException}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput280() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.MappingIterator", "com.fasterxml.jackson.databind.MappingIterator", "_resync", new String[]{}, new String[]{}, false, 11, new String[][]{{"com.fasterxml.jackson.databind.MappingIterator", "next", ""}, {"com.fasterxml.jackson.databind.MappingIterator", "readAll", "java.util.List", "<sample:0>"}}, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput281() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.MappingIterator", "com.fasterxml.jackson.databind.MappingIterator", "getCurrentLocation", new String[]{}, new String[]{}, false, 2, new String[][]{}, 2), new String[][]{{"getColumnNr", "", "6"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("1", String.valueOf(actual));
  assertEquals("receiver state after the call", "{hasNext=!RuntimeException, hasNextValue=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput282() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.MappingIterator", "com.fasterxml.jackson.databind.MappingIterator", "close", new String[]{}, new String[]{}, false, 4, new String[][]{{"com.fasterxml.jackson.databind.MappingIterator", "next", ""}}, 3);
  assertNull(actual);
  assertEquals("receiver state after the call", "{hasNext=false, hasNextValue=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput283() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.MappingIterator", "com.fasterxml.jackson.databind.MappingIterator", "readAll", new String[]{"java.util.List"}, new String[]{"<sample:2>"}, false, 7, new String[][]{{"com.fasterxml.jackson.databind.MappingIterator", "nextValue", ""}}, 1);
  assertNotNull(actual);
  assertEquals("java.util.ArrayList", actual.getClass().getName());
  assertEquals("[0, sample, ]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{hasNext=false, hasNextValue=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput284() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.MappingIterator", "com.fasterxml.jackson.databind.MappingIterator", "readAll", new String[]{"java.util.List"}, new String[]{"<sample:5>"}, false, 8, new String[][]{{"com.fasterxml.jackson.databind.MappingIterator", "nextValue", ""}}, 1);
  assertNotNull(actual);
  assertEquals("java.util.ArrayList", actual.getClass().getName());
  assertEquals("[a, 0, sample]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{hasNext=false, hasNextValue=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput285() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.MappingIterator", "com.fasterxml.jackson.databind.MappingIterator", "readAll", new String[]{"java.util.List"}, new String[]{"<sample:5>"}, false, 8, new String[][]{{"com.fasterxml.jackson.databind.MappingIterator", "nextValue", ""}, {"com.fasterxml.jackson.databind.MappingIterator", "remove", ""}}, 1), new String[][]{{"clear", "", "6"}});
  assertNotNull(actual);
  assertEquals("java.util.ArrayList", actual.getClass().getName());
  assertEquals("[]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{hasNext=false, hasNextValue=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput286() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.MappingIterator", "com.fasterxml.jackson.databind.MappingIterator", "_resync", new String[]{}, new String[]{}, false, 5, new String[][]{{"com.fasterxml.jackson.databind.MappingIterator", "hasNext", ""}, {"com.fasterxml.jackson.databind.MappingIterator", "hasNext", ""}}, 2);
  assertNull(actual);
  assertEquals("receiver state after the call", "{hasNext=!RuntimeException, hasNextValue=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput287() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.MappingIterator", "com.fasterxml.jackson.databind.MappingIterator", "_resync", new String[]{}, new String[]{}, false, 6, new String[][]{{"com.fasterxml.jackson.databind.MappingIterator", "hasNext", ""}, {"com.fasterxml.jackson.databind.MappingIterator", "hasNext", ""}}, 2);
  assertNull(actual);
  assertEquals("receiver state after the call", "{hasNext=false, hasNextValue=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput288() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.MappingIterator", "com.fasterxml.jackson.databind.MappingIterator", "_resync", new String[]{}, new String[]{}, false, 7, new String[][]{{"com.fasterxml.jackson.databind.MappingIterator", "hasNext", ""}, {"com.fasterxml.jackson.databind.MappingIterator", "hasNext", ""}}, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput289() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.MappingIterator", "com.fasterxml.jackson.databind.MappingIterator", "_resync", new String[]{}, new String[]{}, false, 9, new String[][]{{"com.fasterxml.jackson.databind.MappingIterator", "hasNext", ""}, {"com.fasterxml.jackson.databind.MappingIterator", "hasNext", ""}}, 2);
  assertNull(actual);
  assertEquals("receiver state after the call", "{hasNext=!RuntimeException, hasNextValue=!JsonParseException}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput290() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.MappingIterator", "com.fasterxml.jackson.databind.MappingIterator", "next", new String[]{}, new String[]{}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.MappingIterator", "getParser", ""}, {"com.fasterxml.jackson.databind.MappingIterator", "readAll", ""}}, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.RuntimeException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput291() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.MappingIterator", "com.fasterxml.jackson.databind.MappingIterator", "readAll", new String[]{"java.util.Collection"}, new String[]{"<null>"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.MappingIterator", "hasNextValue", ""}}, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("com.fasterxml.jackson.core.JsonParseException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput292() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.MappingIterator", "com.fasterxml.jackson.databind.MappingIterator", "hasNext", new String[]{}, new String[]{}, false, 16, new String[][]{}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{hasNext=false, hasNextValue=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput293() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.MappingIterator", "com.fasterxml.jackson.databind.MappingIterator", "next", new String[]{}, new String[]{}, false, 19, new String[][]{{"com.fasterxml.jackson.databind.MappingIterator", "remove", ""}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.UnsupportedOperationException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput294() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.MappingIterator", "com.fasterxml.jackson.databind.MappingIterator", "_handleMappingException", new String[]{"com.fasterxml.jackson.databind.JsonMappingException"}, new String[]{"<null>"}, false, 8, new String[][]{{"com.fasterxml.jackson.databind.MappingIterator", "hasNextValue", ""}, {"com.fasterxml.jackson.databind.MappingIterator", "hasNextValue", ""}}, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput295() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.MappingIterator", "com.fasterxml.jackson.databind.MappingIterator", "readAll", new String[]{"java.util.Collection"}, new String[]{"<sample:3>"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.MappingIterator", "next", ""}}, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("com.fasterxml.jackson.core.JsonParseException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput296() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.MappingIterator", "com.fasterxml.jackson.databind.MappingIterator", "hasNextValue", new String[]{}, new String[]{}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.MappingIterator", "getParserSchema", ""}, {"com.fasterxml.jackson.databind.MappingIterator", "_resync", ""}}, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.ArrayIndexOutOfBoundsException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput297() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.MappingIterator", "com.fasterxml.jackson.databind.MappingIterator", "readAll", new String[]{"java.util.Collection"}, new String[]{"<empty>"}, false, 2, new String[][]{{"com.fasterxml.jackson.databind.MappingIterator", "nextValue", ""}}, 2), new String[][]{{"iterator", "", "4"}, {"next", "", "1"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.util.NoSuchElementException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput298() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.MappingIterator", "com.fasterxml.jackson.databind.MappingIterator", "readAll", new String[]{"java.util.Collection"}, new String[]{"<sample:1>"}, false, 2, new String[][]{{"com.fasterxml.jackson.databind.MappingIterator", "nextValue", ""}}, 2), new String[][]{{"iterator", "", "4"}, {"next", "", "1"}, {"hasNext", "", "6"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
  assertEquals("receiver state after the call", "{hasNext=false, hasNextValue=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput299() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.MappingIterator", "com.fasterxml.jackson.databind.MappingIterator", "getParserSchema", new String[]{}, new String[]{}, false, 2, new String[][]{}, 2);
  assertNull(actual);
  assertEquals("receiver state after the call", "{hasNext=!RuntimeException, hasNextValue=false}", SearchInputFactory_scaffolding.receiverState());
 }
}
