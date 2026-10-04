package generated.algorithm;

import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;
import static org.junit.Assert.*;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class BinaryParticleSwarmGeneratedTest {
 @Test(timeout = 20000)
 public void generatedInput000() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.json.JsonWriteContext", "com.fasterxml.jackson.core.json.JsonWriteContext", "createChildObjectContext", new String[]{}, new String[]{}, false, 5, new String[][]{{"com.fasterxml.jackson.core.json.JsonWriteContext", "getParent", ""}, {"com.fasterxml.jackson.core.json.JsonWriteContext", "createChildObjectContext", ""}});
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.core.json.JsonWriteContext", actual.getClass().getName());
  assertEquals("{?} {getCurrentIndex=0, getCurrentName=null, getEntryCount=0, getTypeDesc=OBJECT}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "/ {getCurrentIndex=0, getCurrentName=null, getEntryCount=0, getTypeDesc=?}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput001() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.json.JsonWriteContext", "com.fasterxml.jackson.core.json.JsonWriteContext", "createRootContext", new String[]{}, new String[]{}, true), new String[][]{{"writeFieldName", "java.lang.String", "1"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput002() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.json.JsonWriteContext", "com.fasterxml.jackson.core.json.JsonWriteContext", "createChildArrayContext", new String[]{}, new String[]{}, false, 0, new String[][]{{"com.fasterxml.jackson.core.json.JsonWriteContext", "createChildArrayContext", ""}}, 1), new String[][]{{"setCurrentValue", "java.lang.Object", "4"}, {"writeValue", "", "7"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "/ {getCurrentIndex=0, getCurrentName=null, getEntryCount=0, getTypeDesc=?}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput003() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.json.JsonWriteContext", "com.fasterxml.jackson.core.json.JsonWriteContext", "createChildObjectContext", new String[]{}, new String[]{}, false), new String[][]{{"writeFieldName", "java.lang.String", "0"}, {"writeFieldName", "java.lang.String", "6"}, {"writeValue", "", "0"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("2", String.valueOf(actual));
  assertEquals("receiver state after the call", "/ {getCurrentIndex=0, getCurrentName=null, getEntryCount=0, getTypeDesc=?}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput004() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.json.JsonWriteContext", "com.fasterxml.jackson.core.json.JsonWriteContext", "createChildObjectContext", new String[]{}, new String[]{}, false, 4, new String[][]{{"com.fasterxml.jackson.core.json.JsonWriteContext", "inRoot", ""}, {"com.fasterxml.jackson.core.json.JsonWriteContext", "writeValue", ""}}), new String[][]{{"createChildArrayContext", "", "1"}});
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.core.json.JsonWriteContext", actual.getClass().getName());
  assertEquals("[0] {getCurrentIndex=0, getCurrentName=null, getEntryCount=0, getTypeDesc=ARRAY}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "/ {getCurrentIndex=0, getCurrentName=null, getEntryCount=1, getTypeDesc=ROOT}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput005() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.json.JsonWriteContext", "com.fasterxml.jackson.core.json.JsonWriteContext", "createChildObjectContext", new String[]{}, new String[]{}, false, 2, new String[][]{}), new String[][]{{"getEntryCount", "", "7"}, {"writeValue", "", "3"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("5", String.valueOf(actual));
  assertEquals("receiver state after the call", "[0] {getCurrentIndex=0, getCurrentName=null, getEntryCount=0, getTypeDesc=ARRAY}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput006() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.json.JsonWriteContext", "com.fasterxml.jackson.core.json.JsonWriteContext", "getParent", new String[]{}, new String[]{}, false, 1, new String[][]{}, 3), new String[][]{{"writeValue", "", "7"}, {"inObject", "", "0"}, {"writeValue", "", "2"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("3", String.valueOf(actual));
  assertEquals("receiver state after the call", "/ {getCurrentIndex=0, getCurrentName=null, getEntryCount=0, getTypeDesc=ROOT}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput007() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.json.JsonWriteContext", "com.fasterxml.jackson.core.json.JsonWriteContext", "reset", new String[]{"int"}, new String[]{"13"}, false, 4, new String[][]{}, 3), new String[][]{{"getCurrentValue", "", "3"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "/ {getCurrentIndex=0, getCurrentName=null, getEntryCount=0, getTypeDesc=?}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput008() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.json.JsonWriteContext", "com.fasterxml.jackson.core.json.JsonWriteContext", "createChildObjectContext", new String[]{}, new String[]{}, false, 5, new String[][]{{"com.fasterxml.jackson.core.json.JsonWriteContext", "getDupDetector", ""}, {"com.fasterxml.jackson.core.json.JsonWriteContext", "getCurrentIndex", ""}}, 3), new String[][]{{"writeFieldName", "java.lang.String", "2"}, {"withDupDetector", "com.fasterxml.jackson.core.json.DupDetector", "6"}});
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.core.json.JsonWriteContext", actual.getClass().getName());
  assertEquals("{\"0\"} {getCurrentIndex=0, getCurrentName=0, getEntryCount=0, getTypeDesc=OBJECT}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "/ {getCurrentIndex=0, getCurrentName=null, getEntryCount=0, getTypeDesc=?}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput009() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.json.JsonWriteContext", "com.fasterxml.jackson.core.json.JsonWriteContext", "createChildArrayContext", new String[]{}, new String[]{}, false, 7, new String[][]{}), new String[][]{{"writeValue", "", "4"}, {"writeValue", "", "3"}, {"withDupDetector", "com.fasterxml.jackson.core.json.DupDetector", "2"}});
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.core.json.JsonWriteContext", actual.getClass().getName());
  assertEquals("[1] {getCurrentIndex=1, getCurrentName=null, getEntryCount=2, getTypeDesc=ARRAY}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "/ {getCurrentIndex=0, getCurrentName=null, getEntryCount=0, getTypeDesc=?}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput010() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.json.JsonWriteContext", "com.fasterxml.jackson.core.json.JsonWriteContext", "reset", new String[]{"int"}, new String[]{"2147483647"}, false, 2, new String[][]{{"com.fasterxml.jackson.core.json.JsonWriteContext", "createChildArrayContext", ""}}, 2), new String[][]{{"writeValue", "", "4"}, {"writeFieldName", "java.lang.String", "0"}, {"getParent", "", "3"}});
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.core.json.JsonWriteContext", actual.getClass().getName());
  assertEquals("/ {getCurrentIndex=0, getCurrentName=null, getEntryCount=0, getTypeDesc=ROOT}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "/ {getCurrentIndex=0, getCurrentName=, getEntryCount=1, getTypeDesc=?}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput011() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.json.JsonWriteContext", "com.fasterxml.jackson.core.json.JsonWriteContext", "reset", new String[]{"int"}, new String[]{"1"}, false, 0, null, 2), new String[][]{{"inObject", "", "5"}, {"writeFieldName", "java.lang.String", "0"}, {"createChildObjectContext", "", "3"}});
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.core.json.JsonWriteContext", actual.getClass().getName());
  assertEquals("{?} {getCurrentIndex=0, getCurrentName=null, getEntryCount=0, getTypeDesc=OBJECT}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "[0] {getCurrentIndex=0, getCurrentName=, getEntryCount=0, getTypeDesc=ARRAY}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput012() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.json.JsonWriteContext", "com.fasterxml.jackson.core.json.JsonWriteContext", "createChildObjectContext", new String[]{}, new String[]{}, false, 7, new String[][]{}), new String[][]{{"writeFieldName", "java.lang.String", "0"}, {"writeValue", "", "5"}, {"writeFieldName", "java.lang.String", "4"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("com.fasterxml.jackson.core.JsonGenerationException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput013() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.json.JsonWriteContext", "com.fasterxml.jackson.core.json.JsonWriteContext", "createRootContext", new String[]{"com.fasterxml.jackson.core.json.DupDetector"}, new String[]{"<sample:6>"}, true, 0, null, 2), new String[][]{{"setCurrentValue", "java.lang.Object", "0"}});
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.core.json.JsonWriteContext", actual.getClass().getName());
  assertEquals("/ {getCurrentIndex=0, getCurrentName=null, getEntryCount=0, getTypeDesc=ROOT}", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput014() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.json.JsonWriteContext", "com.fasterxml.jackson.core.json.JsonWriteContext", "createChildArrayContext", new String[]{}, new String[]{}, false, 0, new String[][]{{"com.fasterxml.jackson.core.json.JsonWriteContext", "getEntryCount", ""}}, 1);
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.core.json.JsonWriteContext", actual.getClass().getName());
  assertEquals("[0] {getCurrentIndex=0, getCurrentName=null, getEntryCount=0, getTypeDesc=ARRAY}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "/ {getCurrentIndex=0, getCurrentName=null, getEntryCount=0, getTypeDesc=?}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput015() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.json.JsonWriteContext", "com.fasterxml.jackson.core.json.JsonWriteContext", "createRootContext", new String[]{"com.fasterxml.jackson.core.json.DupDetector"}, new String[]{"<sample:2>"}, true, 0, null, 3), new String[][]{{"getCurrentName", "", "1"}});
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput016() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.json.JsonWriteContext", "com.fasterxml.jackson.core.json.JsonWriteContext", "getCurrentValue", new String[]{}, new String[]{}, false, 7, new String[][]{}, 2);
  assertNull(actual);
  assertEquals("receiver state after the call", "/ {getCurrentIndex=0, getCurrentName=null, getEntryCount=0, getTypeDesc=?}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput017() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.json.JsonWriteContext", "com.fasterxml.jackson.core.json.JsonWriteContext", "createChildArrayContext", new String[]{}, new String[]{}, false, 0, new String[][]{{"com.fasterxml.jackson.core.json.JsonWriteContext", "getCurrentIndex", ""}}, 3), new String[][]{{"inArray", "", "1"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
  assertEquals("receiver state after the call", "/ {getCurrentIndex=0, getCurrentName=null, getEntryCount=0, getTypeDesc=?}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput018() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.json.JsonWriteContext", "com.fasterxml.jackson.core.json.JsonWriteContext", "setCurrentValue", new String[]{"java.lang.Object"}, new String[]{"<i:-2>"}, false, 3, new String[][]{}, 1);
  assertNull(actual);
  assertEquals("receiver state after the call", "/ {getCurrentIndex=0, getCurrentName=null, getEntryCount=0, getTypeDesc=?}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput019() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.json.JsonWriteContext", "com.fasterxml.jackson.core.json.JsonWriteContext", "appendDesc", new String[]{"java.lang.StringBuilder"}, new String[]{"<sample:6>"}, false, 7, new String[][]{}, 2);
  assertNull(actual);
  assertEquals("receiver state after the call", "/ {getCurrentIndex=0, getCurrentName=null, getEntryCount=0, getTypeDesc=?}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput020() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.json.JsonWriteContext", "com.fasterxml.jackson.core.json.JsonWriteContext", "appendDesc", new String[]{"java.lang.StringBuilder"}, new String[]{"<null>"}, false, 0, new String[][]{{"com.fasterxml.jackson.core.json.JsonWriteContext", "getCurrentIndex", ""}, {"com.fasterxml.jackson.core.json.JsonWriteContext", "appendDesc", "java.lang.StringBuilder", "<sample:2>"}}, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput021() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.json.JsonWriteContext", "com.fasterxml.jackson.core.json.JsonWriteContext", "getCurrentValue", new String[]{}, new String[]{}, false, 0, null, 3);
  assertNull(actual);
  assertEquals("receiver state after the call", "/ {getCurrentIndex=0, getCurrentName=null, getEntryCount=0, getTypeDesc=?}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput022() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.json.JsonWriteContext", "com.fasterxml.jackson.core.json.JsonWriteContext", "getParent", new String[]{}, new String[]{}, false, 3, new String[][]{{"com.fasterxml.jackson.core.json.JsonWriteContext", "getEntryCount", ""}}, 3), new String[][]{{"setCurrentValue", "java.lang.Object", "6"}});
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.core.json.JsonWriteContext", actual.getClass().getName());
  assertEquals("/ {getCurrentIndex=0, getCurrentName=null, getEntryCount=0, getTypeDesc=?}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "/ {getCurrentIndex=0, getCurrentName=null, getEntryCount=0, getTypeDesc=?}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput023() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.json.JsonWriteContext", "com.fasterxml.jackson.core.json.JsonWriteContext", "createRootContext", new String[]{}, new String[]{}, true, 0, null, 2);
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.core.json.JsonWriteContext", actual.getClass().getName());
  assertEquals("/ {getCurrentIndex=0, getCurrentName=null, getEntryCount=0, getTypeDesc=ROOT}", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput024() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.json.JsonWriteContext", "com.fasterxml.jackson.core.json.JsonWriteContext", "createChildArrayContext", new String[]{}, new String[]{}, false, 1, new String[][]{{"com.fasterxml.jackson.core.json.JsonWriteContext", "setCurrentValue", "java.lang.Object", "<s:a>"}}, 2);
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.core.json.JsonWriteContext", actual.getClass().getName());
  assertEquals("[0] {getCurrentIndex=0, getCurrentName=null, getEntryCount=0, getTypeDesc=ARRAY}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "/ {getCurrentIndex=0, getCurrentName=null, getEntryCount=0, getTypeDesc=ROOT}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput025() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.json.JsonWriteContext", "com.fasterxml.jackson.core.json.JsonWriteContext", "appendDesc", new String[]{"java.lang.StringBuilder"}, new String[]{"<sample:7>"}, false, 0, new String[][]{{"com.fasterxml.jackson.core.json.JsonWriteContext", "getCurrentName", ""}, {"com.fasterxml.jackson.core.json.JsonWriteContext", "getDupDetector", ""}}, 3);
  assertNull(actual);
  assertEquals("receiver state after the call", "/ {getCurrentIndex=0, getCurrentName=null, getEntryCount=0, getTypeDesc=?}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput026() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.json.JsonWriteContext", "com.fasterxml.jackson.core.json.JsonWriteContext", "reset", new String[]{"int"}, new String[]{"36"}, false, 3, new String[][]{{"com.fasterxml.jackson.core.json.JsonWriteContext", "getEntryCount", ""}}, 3);
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.core.json.JsonWriteContext", actual.getClass().getName());
  assertEquals("/ {getCurrentIndex=0, getCurrentName=null, getEntryCount=0, getTypeDesc=?}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "/ {getCurrentIndex=0, getCurrentName=null, getEntryCount=0, getTypeDesc=?}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput027() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.json.JsonWriteContext", "com.fasterxml.jackson.core.json.JsonWriteContext", "withDupDetector", new String[]{"com.fasterxml.jackson.core.json.DupDetector"}, new String[]{"<sample:8>"}, false, 0, new String[][]{{"com.fasterxml.jackson.core.json.JsonWriteContext", "appendDesc", "java.lang.StringBuilder", "<sample:2>"}}, 1), new String[][]{{"getCurrentIndex", "", "3"}, {"getCurrentValue", "", "6"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "/ {getCurrentIndex=0, getCurrentName=null, getEntryCount=0, getTypeDesc=?}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput028() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.json.JsonWriteContext", "com.fasterxml.jackson.core.json.JsonWriteContext", "setCurrentValue", new String[]{"java.lang.Object"}, new String[]{"<i:-8190>"}, false, 0, new String[][]{{"com.fasterxml.jackson.core.json.JsonWriteContext", "getParent", ""}}, 2);
  assertNull(actual);
  assertEquals("receiver state after the call", "/ {getCurrentIndex=0, getCurrentName=null, getEntryCount=0, getTypeDesc=?}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput029() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.json.JsonWriteContext", "com.fasterxml.jackson.core.json.JsonWriteContext", "createChildObjectContext", new String[]{}, new String[]{}, false, 2, new String[][]{}, 1), new String[][]{{"getCurrentName", "", "2"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "[0] {getCurrentIndex=0, getCurrentName=null, getEntryCount=0, getTypeDesc=ARRAY}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput030() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.json.JsonWriteContext", "com.fasterxml.jackson.core.json.JsonWriteContext", "createChildArrayContext", new String[]{}, new String[]{}, false, 0, new String[][]{{"com.fasterxml.jackson.core.json.JsonWriteContext", "writeValue", ""}}, 1);
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.core.json.JsonWriteContext", actual.getClass().getName());
  assertEquals("[0] {getCurrentIndex=0, getCurrentName=null, getEntryCount=0, getTypeDesc=ARRAY}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "/ {getCurrentIndex=0, getCurrentName=null, getEntryCount=1, getTypeDesc=?}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput031() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.json.JsonWriteContext", "com.fasterxml.jackson.core.json.JsonWriteContext", "getDupDetector", new String[]{}, new String[]{}, false, 0, new String[][]{{"com.fasterxml.jackson.core.json.JsonWriteContext", "setCurrentValue", "java.lang.Object", "<i:2>"}}, 3);
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.core.json.DupDetector", actual.getClass().getName());
  assertEquals("receiver state after the call", "/ {getCurrentIndex=0, getCurrentName=null, getEntryCount=0, getTypeDesc=?}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput032() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.json.JsonWriteContext", "com.fasterxml.jackson.core.json.JsonWriteContext", "getCurrentName", new String[]{}, new String[]{}, false, 0, new String[][]{{"com.fasterxml.jackson.core.json.JsonWriteContext", "setCurrentValue", "java.lang.Object", "<s:d>"}, {"com.fasterxml.jackson.core.json.JsonWriteContext", "toString", ""}}, 1);
  assertNull(actual);
  assertEquals("receiver state after the call", "/ {getCurrentIndex=0, getCurrentName=null, getEntryCount=0, getTypeDesc=?}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput033() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.json.JsonWriteContext", "com.fasterxml.jackson.core.json.JsonWriteContext", "getCurrentName", new String[]{}, new String[]{}, false, 0, new String[][]{{"com.fasterxml.jackson.core.json.JsonWriteContext", "writeFieldName", "java.lang.String", "abc"}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("abc", String.valueOf(actual));
  assertEquals("receiver state after the call", "/ {getCurrentIndex=0, getCurrentName=abc, getEntryCount=0, getTypeDesc=?}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput034() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.json.JsonWriteContext", "com.fasterxml.jackson.core.json.JsonWriteContext", "withDupDetector", new String[]{"com.fasterxml.jackson.core.json.DupDetector"}, new String[]{"<sample:5>"}, false, 3, new String[][]{{"com.fasterxml.jackson.core.json.JsonWriteContext", "getTypeDesc", ""}}, 1);
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.core.json.JsonWriteContext", actual.getClass().getName());
  assertEquals("/ {getCurrentIndex=0, getCurrentName=null, getEntryCount=0, getTypeDesc=?}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "/ {getCurrentIndex=0, getCurrentName=null, getEntryCount=0, getTypeDesc=?}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput035() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.json.JsonWriteContext", "com.fasterxml.jackson.core.json.JsonWriteContext", "createRootContext", new String[]{}, new String[]{}, true, 0, null, 1);
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.core.json.JsonWriteContext", actual.getClass().getName());
  assertEquals("/ {getCurrentIndex=0, getCurrentName=null, getEntryCount=0, getTypeDesc=ROOT}", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput036() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.json.JsonWriteContext", "com.fasterxml.jackson.core.json.JsonWriteContext", "createRootContext", new String[]{"com.fasterxml.jackson.core.json.DupDetector"}, new String[]{"<sample:5>"}, true, 0, null, 3), new String[][]{{"withDupDetector", "com.fasterxml.jackson.core.json.DupDetector", "0"}, {"inArray", "", "6"}, {"writeValue", "", "4"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput037() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.json.JsonWriteContext", "com.fasterxml.jackson.core.json.JsonWriteContext", "getCurrentValue", new String[]{}, new String[]{}, false, 0, null, 1);
  assertNull(actual);
  assertEquals("receiver state after the call", "/ {getCurrentIndex=0, getCurrentName=null, getEntryCount=0, getTypeDesc=?}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput038() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.json.JsonWriteContext", "com.fasterxml.jackson.core.json.JsonWriteContext", "createChildArrayContext", new String[]{}, new String[]{}, false, 3, new String[][]{{"com.fasterxml.jackson.core.json.JsonWriteContext", "getParent", ""}}, 1), new String[][]{{"withDupDetector", "com.fasterxml.jackson.core.json.DupDetector", "6"}, {"inRoot", "", "4"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "/ {getCurrentIndex=0, getCurrentName=null, getEntryCount=0, getTypeDesc=?}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput039() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.json.JsonWriteContext", "com.fasterxml.jackson.core.json.JsonWriteContext", "getCurrentName", new String[]{}, new String[]{}, false, 1, new String[][]{{"com.fasterxml.jackson.core.json.JsonWriteContext", "getCurrentValue", ""}, {"com.fasterxml.jackson.core.json.JsonWriteContext", "getTypeDesc", ""}}, 1);
  assertNull(actual);
  assertEquals("receiver state after the call", "/ {getCurrentIndex=0, getCurrentName=null, getEntryCount=0, getTypeDesc=ROOT}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput040() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.json.JsonWriteContext", "com.fasterxml.jackson.core.json.JsonWriteContext", "appendDesc", new String[]{"java.lang.StringBuilder"}, new String[]{"<null>"}, false, 7, new String[][]{{"com.fasterxml.jackson.core.json.JsonWriteContext", "withDupDetector", "com.fasterxml.jackson.core.json.DupDetector", "<sample:4>"}}, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput041() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.json.JsonWriteContext", "com.fasterxml.jackson.core.json.JsonWriteContext", "createRootContext", new String[]{}, new String[]{}, true, 0, null, 1), new String[][]{{"getParent", "", "4"}});
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput042() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.json.JsonWriteContext", "com.fasterxml.jackson.core.json.JsonWriteContext", "reset", new String[]{"int"}, new String[]{"2147483647"}, false, 0, new String[][]{{"com.fasterxml.jackson.core.json.JsonWriteContext", "getCurrentName", ""}}, 1);
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.core.json.JsonWriteContext", actual.getClass().getName());
  assertEquals("/ {getCurrentIndex=0, getCurrentName=null, getEntryCount=0, getTypeDesc=?}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "/ {getCurrentIndex=0, getCurrentName=null, getEntryCount=0, getTypeDesc=?}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput043() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.json.JsonWriteContext", "com.fasterxml.jackson.core.json.JsonWriteContext", "createChildArrayContext", new String[]{}, new String[]{}, false, 3, new String[][]{{"com.fasterxml.jackson.core.json.JsonWriteContext", "writeFieldName", "java.lang.String", "[1,2]"}, {"com.fasterxml.jackson.core.json.JsonWriteContext", "getCurrentValue", ""}}, 2), new String[][]{{"setCurrentValue", "java.lang.Object", "5"}, {"getCurrentName", "", "4"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "/ {getCurrentIndex=0, getCurrentName=[1,2], getEntryCount=0, getTypeDesc=?}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput044() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.json.JsonWriteContext", "com.fasterxml.jackson.core.json.JsonWriteContext", "createChildObjectContext", new String[]{}, new String[]{}, false, 0, null, 1), new String[][]{{"inArray", "", "3"}, {"createChildObjectContext", "", "6"}});
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.core.json.JsonWriteContext", actual.getClass().getName());
  assertEquals("{?} {getCurrentIndex=0, getCurrentName=null, getEntryCount=0, getTypeDesc=OBJECT}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "/ {getCurrentIndex=0, getCurrentName=null, getEntryCount=0, getTypeDesc=?}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput045() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.json.JsonWriteContext", "com.fasterxml.jackson.core.json.JsonWriteContext", "createChildArrayContext", new String[]{}, new String[]{}, false, 0, new String[][]{{"com.fasterxml.jackson.core.json.JsonWriteContext", "getCurrentValue", ""}, {"com.fasterxml.jackson.core.json.JsonWriteContext", "getParent", ""}}, 2), new String[][]{{"getParent", "", "0"}, {"inObject", "", "6"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "/ {getCurrentIndex=0, getCurrentName=null, getEntryCount=0, getTypeDesc=?}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput046() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.json.JsonWriteContext", "com.fasterxml.jackson.core.json.JsonWriteContext", "createChildObjectContext", new String[]{}, new String[]{}, false, 2, new String[][]{{"com.fasterxml.jackson.core.json.JsonWriteContext", "getCurrentValue", ""}}, 2), new String[][]{{"getParent", "", "6"}});
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.core.json.JsonWriteContext", actual.getClass().getName());
  assertEquals("[0] {getCurrentIndex=0, getCurrentName=null, getEntryCount=0, getTypeDesc=ARRAY}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "[0] {getCurrentIndex=0, getCurrentName=null, getEntryCount=0, getTypeDesc=ARRAY}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput047() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.json.JsonWriteContext", "com.fasterxml.jackson.core.json.JsonWriteContext", "getTypeDesc", new String[]{}, new String[]{}, false, 3, new String[][]{{"com.fasterxml.jackson.core.json.JsonWriteContext", "getCurrentIndex", ""}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("?", String.valueOf(actual));
  assertEquals("receiver state after the call", "/ {getCurrentIndex=0, getCurrentName=null, getEntryCount=0, getTypeDesc=?}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput048() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.json.JsonWriteContext", "com.fasterxml.jackson.core.json.JsonWriteContext", "getCurrentName", new String[]{}, new String[]{}, false, 0, new String[][]{{"com.fasterxml.jackson.core.json.JsonWriteContext", "setCurrentValue", "java.lang.Object", "<i:1>"}}, 3);
  assertNull(actual);
  assertEquals("receiver state after the call", "/ {getCurrentIndex=0, getCurrentName=null, getEntryCount=0, getTypeDesc=?}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput049() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.json.JsonWriteContext", "com.fasterxml.jackson.core.json.JsonWriteContext", "toString", new String[]{}, new String[]{}, false, 0, null, 1);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("/", String.valueOf(actual));
  assertEquals("receiver state after the call", "/ {getCurrentIndex=0, getCurrentName=null, getEntryCount=0, getTypeDesc=?}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput050() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.json.JsonWriteContext", "com.fasterxml.jackson.core.json.JsonWriteContext", "createRootContext", new String[]{}, new String[]{}, true, 0, null, 3);
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.core.json.JsonWriteContext", actual.getClass().getName());
  assertEquals("/ {getCurrentIndex=0, getCurrentName=null, getEntryCount=0, getTypeDesc=ROOT}", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput051() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.json.JsonWriteContext", "com.fasterxml.jackson.core.json.JsonWriteContext", "createRootContext", new String[]{"com.fasterxml.jackson.core.json.DupDetector"}, new String[]{"<sample:0>"}, true, 0, null, 3), new String[][]{{"inArray", "", "2"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput052() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.json.JsonWriteContext", "com.fasterxml.jackson.core.json.JsonWriteContext", "createRootContext", new String[]{"com.fasterxml.jackson.core.json.DupDetector"}, new String[]{"<sample:7>"}, true, 0, null, 1), new String[][]{{"setCurrentValue", "java.lang.Object", "6"}});
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.core.json.JsonWriteContext", actual.getClass().getName());
  assertEquals("/ {getCurrentIndex=0, getCurrentName=null, getEntryCount=0, getTypeDesc=ROOT}", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput053() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.json.JsonWriteContext", "com.fasterxml.jackson.core.json.JsonWriteContext", "withDupDetector", new String[]{"com.fasterxml.jackson.core.json.DupDetector"}, new String[]{"<sample:5>"}, false, 1, new String[][]{}, 1), new String[][]{{"withDupDetector", "com.fasterxml.jackson.core.json.DupDetector", "3"}, {"getCurrentIndex", "", "1"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "/ {getCurrentIndex=0, getCurrentName=null, getEntryCount=0, getTypeDesc=ROOT}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput054() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.json.JsonWriteContext", "com.fasterxml.jackson.core.json.JsonWriteContext", "inRoot", new String[]{}, new String[]{}, false, 0, new String[][]{{"com.fasterxml.jackson.core.json.JsonWriteContext", "createChildObjectContext", ""}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "/ {getCurrentIndex=0, getCurrentName=null, getEntryCount=0, getTypeDesc=?}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput055() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.json.JsonWriteContext", "com.fasterxml.jackson.core.json.JsonWriteContext", "getDupDetector", new String[]{}, new String[]{}, false, 6, new String[][]{}, 1), new String[][]{{"child", "", "4"}});
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.core.json.DupDetector", actual.getClass().getName());
  assertEquals("receiver state after the call", "/ {getCurrentIndex=0, getCurrentName=null, getEntryCount=0, getTypeDesc=?}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput056() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.json.JsonWriteContext", "com.fasterxml.jackson.core.json.JsonWriteContext", "createChildObjectContext", new String[]{}, new String[]{}, false, 0, new String[][]{{"com.fasterxml.jackson.core.json.JsonWriteContext", "writeValue", ""}}, 2), new String[][]{{"setCurrentValue", "java.lang.Object", "7"}});
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.core.json.JsonWriteContext", actual.getClass().getName());
  assertEquals("{?} {getCurrentIndex=0, getCurrentName=null, getEntryCount=0, getTypeDesc=OBJECT}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "/ {getCurrentIndex=0, getCurrentName=null, getEntryCount=1, getTypeDesc=?}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput057() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.json.JsonWriteContext", "com.fasterxml.jackson.core.json.JsonWriteContext", "writeFieldName", new String[]{"java.lang.String"}, new String[]{"I"}, false, 3, new String[][]{{"com.fasterxml.jackson.core.json.JsonWriteContext", "createChildArrayContext", ""}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "/ {getCurrentIndex=0, getCurrentName=I, getEntryCount=0, getTypeDesc=?}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput058() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.json.JsonWriteContext", "com.fasterxml.jackson.core.json.JsonWriteContext", "createChildArrayContext", new String[]{}, new String[]{}, false, 1, new String[][]{{"com.fasterxml.jackson.core.json.JsonWriteContext", "reset", "int", "-2"}, {"com.fasterxml.jackson.core.json.JsonWriteContext", "writeValue", ""}}, 1), new String[][]{{"inObject", "", "4"}, {"inArray", "", "0"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
  assertEquals("receiver state after the call", "/ {getCurrentIndex=0, getCurrentName=null, getEntryCount=1, getTypeDesc=?}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput059() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.json.JsonWriteContext", "com.fasterxml.jackson.core.json.JsonWriteContext", "getCurrentValue", new String[]{}, new String[]{}, false, 6, new String[][]{{"com.fasterxml.jackson.core.json.JsonWriteContext", "withDupDetector", "com.fasterxml.jackson.core.json.DupDetector", "<sample:2>"}, {"com.fasterxml.jackson.core.json.JsonWriteContext", "writeFieldName", "java.lang.String", "1.\t25"}}, 2);
  assertNull(actual);
  assertEquals("receiver state after the call", "/ {getCurrentIndex=0, getCurrentName=1.\t25, getEntryCount=0, getTypeDesc=?}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput060() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.json.JsonWriteContext", "com.fasterxml.jackson.core.json.JsonWriteContext", "createRootContext", new String[]{"com.fasterxml.jackson.core.json.DupDetector"}, new String[]{"<sample:11>"}, true, 0, null, 1), new String[][]{{"getDupDetector", "", "4"}, {"reset", "", "6"}});
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.core.json.DupDetector", actual.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput061() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.json.JsonWriteContext", "com.fasterxml.jackson.core.json.JsonWriteContext", "appendDesc", new String[]{"java.lang.StringBuilder"}, new String[]{"<sample:3>"}, false, 5, new String[][]{}, 1);
  assertNull(actual);
  assertEquals("receiver state after the call", "/ {getCurrentIndex=0, getCurrentName=null, getEntryCount=0, getTypeDesc=?}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput062() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.json.JsonWriteContext", "com.fasterxml.jackson.core.json.JsonWriteContext", "withDupDetector", new String[]{"com.fasterxml.jackson.core.json.DupDetector"}, new String[]{"<sample:2>"}, false, 0, null, 1), new String[][]{{"inArray", "", "7"}, {"writeValue", "", "6"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "/ {getCurrentIndex=0, getCurrentName=null, getEntryCount=1, getTypeDesc=?}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput063() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.json.JsonWriteContext", "com.fasterxml.jackson.core.json.JsonWriteContext", "writeFieldName", new String[]{"java.lang.String"}, new String[]{"0rue"}, false, 0, null, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "/ {getCurrentIndex=0, getCurrentName=0rue, getEntryCount=0, getTypeDesc=?}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput064() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.json.JsonWriteContext", "com.fasterxml.jackson.core.json.JsonWriteContext", "appendDesc", new String[]{"java.lang.StringBuilder"}, new String[]{"<empty>"}, false, 1, new String[][]{}, 1);
  assertNull(actual);
  assertEquals("receiver state after the call", "/ {getCurrentIndex=0, getCurrentName=null, getEntryCount=0, getTypeDesc=ROOT}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput065() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.json.JsonWriteContext", "com.fasterxml.jackson.core.json.JsonWriteContext", "createChildObjectContext", new String[]{}, new String[]{}, false, 0, null, 1), new String[][]{{"setCurrentValue", "java.lang.Object", "4"}, {"inRoot", "", "7"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "/ {getCurrentIndex=0, getCurrentName=null, getEntryCount=0, getTypeDesc=?}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput066() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.json.JsonWriteContext", "com.fasterxml.jackson.core.json.JsonWriteContext", "createRootContext", new String[]{"com.fasterxml.jackson.core.json.DupDetector"}, new String[]{"<sample:7>"}, true, 0, null, 3), new String[][]{{"setCurrentValue", "java.lang.Object", "2"}});
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.core.json.JsonWriteContext", actual.getClass().getName());
  assertEquals("/ {getCurrentIndex=0, getCurrentName=null, getEntryCount=0, getTypeDesc=ROOT}", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput067() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.json.JsonWriteContext", "com.fasterxml.jackson.core.json.JsonWriteContext", "getEntryCount", new String[]{}, new String[]{}, false, 1, new String[][]{}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "/ {getCurrentIndex=0, getCurrentName=null, getEntryCount=0, getTypeDesc=ROOT}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput068() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.json.JsonWriteContext", "com.fasterxml.jackson.core.json.JsonWriteContext", "getDupDetector", new String[]{}, new String[]{}, false, 1, new String[][]{{"com.fasterxml.jackson.core.json.JsonWriteContext", "getTypeDesc", ""}}, 1), new String[][]{{"child", "", "1"}});
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.core.json.DupDetector", actual.getClass().getName());
  assertEquals("receiver state after the call", "/ {getCurrentIndex=0, getCurrentName=null, getEntryCount=0, getTypeDesc=ROOT}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput069() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.json.JsonWriteContext", "com.fasterxml.jackson.core.json.JsonWriteContext", "writeFieldName", new String[]{"java.lang.String"}, new String[]{"1.123456789012345671.5d"}, false, 0, null, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "/ {getCurrentIndex=0, getCurrentName=1.123456789012345671.5d, getEntryCount=0, getTypeDesc=?}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput070() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.json.JsonWriteContext", "com.fasterxml.jackson.core.json.JsonWriteContext", "createChildArrayContext", new String[]{}, new String[]{}, false, 0, new String[][]{{"com.fasterxml.jackson.core.json.JsonWriteContext", "inObject", ""}}, 1), new String[][]{{"createChildObjectContext", "", "7"}});
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.core.json.JsonWriteContext", actual.getClass().getName());
  assertEquals("{?} {getCurrentIndex=0, getCurrentName=null, getEntryCount=0, getTypeDesc=OBJECT}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "/ {getCurrentIndex=0, getCurrentName=null, getEntryCount=0, getTypeDesc=?}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput071() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.json.JsonWriteContext", "com.fasterxml.jackson.core.json.JsonWriteContext", "writeFieldName", new String[]{"java.lang.String"}, new String[]{"[."}, false, 0, new String[][]{{"com.fasterxml.jackson.core.json.JsonWriteContext", "withDupDetector", "com.fasterxml.jackson.core.json.DupDetector", "<sample:4>"}, {"com.fasterxml.jackson.core.json.JsonWriteContext", "getCurrentName", ""}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "/ {getCurrentIndex=0, getCurrentName=[., getEntryCount=0, getTypeDesc=?}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput072() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.json.JsonWriteContext", "com.fasterxml.jackson.core.json.JsonWriteContext", "createChildArrayContext", new String[]{}, new String[]{}, false, 0, new String[][]{{"com.fasterxml.jackson.core.json.JsonWriteContext", "getEntryCount", ""}}, 3), new String[][]{{"writeFieldName", "java.lang.String", "6"}, {"createChildObjectContext", "", "2"}});
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.core.json.JsonWriteContext", actual.getClass().getName());
  assertEquals("{?} {getCurrentIndex=0, getCurrentName=null, getEntryCount=0, getTypeDesc=OBJECT}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "/ {getCurrentIndex=0, getCurrentName=null, getEntryCount=0, getTypeDesc=?}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput073() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.json.JsonWriteContext", "com.fasterxml.jackson.core.json.JsonWriteContext", "createRootContext", new String[]{"com.fasterxml.jackson.core.json.DupDetector"}, new String[]{"<sample:6>"}, true, 0, null, 1), new String[][]{{"writeValue", "", "4"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput074() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.json.JsonWriteContext", "com.fasterxml.jackson.core.json.JsonWriteContext", "reset", new String[]{"int"}, new String[]{"-2147483648"}, false, 6, new String[][]{{"com.fasterxml.jackson.core.json.JsonWriteContext", "createChildObjectContext", ""}}, 1), new String[][]{{"withDupDetector", "com.fasterxml.jackson.core.json.DupDetector", "0"}, {"getEntryCount", "", "1"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "/ {getCurrentIndex=0, getCurrentName=null, getEntryCount=0, getTypeDesc=?}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput075() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.json.JsonWriteContext", "com.fasterxml.jackson.core.json.JsonWriteContext", "getCurrentValue", new String[]{}, new String[]{}, false, 3, new String[][]{{"com.fasterxml.jackson.core.json.JsonWriteContext", "writeValue", ""}}, 3);
  assertNull(actual);
  assertEquals("receiver state after the call", "/ {getCurrentIndex=0, getCurrentName=null, getEntryCount=1, getTypeDesc=?}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput076() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.json.JsonWriteContext", "com.fasterxml.jackson.core.json.JsonWriteContext", "reset", new String[]{"int"}, new String[]{"-2147483648"}, false, 0, null, 2), new String[][]{{"setCurrentValue", "java.lang.Object", "2"}, {"writeFieldName", "java.lang.String", "6"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "/ {getCurrentIndex=0, getCurrentName=0, getEntryCount=0, getTypeDesc=?}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput077() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.json.JsonWriteContext", "com.fasterxml.jackson.core.json.JsonWriteContext", "getEntryCount", new String[]{}, new String[]{}, false, 0, null, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "/ {getCurrentIndex=0, getCurrentName=null, getEntryCount=0, getTypeDesc=?}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput078() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.json.JsonWriteContext", "com.fasterxml.jackson.core.json.JsonWriteContext", "createRootContext", new String[]{"com.fasterxml.jackson.core.json.DupDetector"}, new String[]{"<sample:3>"}, true, 0, null, 2), new String[][]{{"writeFieldName", "java.lang.String", "0"}, {"writeValue", "", "4"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput079() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.json.JsonWriteContext", "com.fasterxml.jackson.core.json.JsonWriteContext", "getCurrentIndex", new String[]{}, new String[]{}, false, 3, new String[][]{{"com.fasterxml.jackson.core.json.JsonWriteContext", "getCurrentIndex", ""}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "/ {getCurrentIndex=0, getCurrentName=null, getEntryCount=0, getTypeDesc=?}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput080() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.json.JsonWriteContext", "com.fasterxml.jackson.core.json.JsonWriteContext", "createChildObjectContext", new String[]{}, new String[]{}, false, 0, null, 3);
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.core.json.JsonWriteContext", actual.getClass().getName());
  assertEquals("{?} {getCurrentIndex=0, getCurrentName=null, getEntryCount=0, getTypeDesc=OBJECT}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "/ {getCurrentIndex=0, getCurrentName=null, getEntryCount=0, getTypeDesc=?}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput081() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.json.JsonWriteContext", "com.fasterxml.jackson.core.json.JsonWriteContext", "createChildArrayContext", new String[]{}, new String[]{}, false, 0, new String[][]{{"com.fasterxml.jackson.core.json.JsonWriteContext", "toString", ""}}, 3), new String[][]{{"getCurrentValue", "", "6"}, {"writeValue", "", "5"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "/ {getCurrentIndex=0, getCurrentName=null, getEntryCount=0, getTypeDesc=?}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput082() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.json.JsonWriteContext", "com.fasterxml.jackson.core.json.JsonWriteContext", "inRoot", new String[]{}, new String[]{}, false, 0, null, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "/ {getCurrentIndex=0, getCurrentName=null, getEntryCount=0, getTypeDesc=?}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput083() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.json.JsonWriteContext", "com.fasterxml.jackson.core.json.JsonWriteContext", "writeValue", new String[]{}, new String[]{}, false, 0, null, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "/ {getCurrentIndex=0, getCurrentName=null, getEntryCount=1, getTypeDesc=?}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput084() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.json.JsonWriteContext", "com.fasterxml.jackson.core.json.JsonWriteContext", "getCurrentIndex", new String[]{}, new String[]{}, false, 3, new String[][]{}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "/ {getCurrentIndex=0, getCurrentName=null, getEntryCount=0, getTypeDesc=?}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput085() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.json.JsonWriteContext", "com.fasterxml.jackson.core.json.JsonWriteContext", "getCurrentIndex", new String[]{}, new String[]{}, false, 0, null, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "/ {getCurrentIndex=0, getCurrentName=null, getEntryCount=0, getTypeDesc=?}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput086() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.json.JsonWriteContext", "com.fasterxml.jackson.core.json.JsonWriteContext", "createChildArrayContext", new String[]{}, new String[]{}, false, 0, null, 3), new String[][]{{"writeFieldName", "java.lang.String", "2"}, {"getCurrentName", "", "6"}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "/ {getCurrentIndex=0, getCurrentName=null, getEntryCount=0, getTypeDesc=?}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput087() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.json.JsonWriteContext", "com.fasterxml.jackson.core.json.JsonWriteContext", "getParent", new String[]{}, new String[]{}, false, 3, new String[][]{{"com.fasterxml.jackson.core.json.JsonWriteContext", "reset", "int", "4194305"}});
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.core.json.JsonWriteContext", actual.getClass().getName());
  assertEquals("/ {getCurrentIndex=0, getCurrentName=null, getEntryCount=0, getTypeDesc=?}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "/ {getCurrentIndex=0, getCurrentName=null, getEntryCount=0, getTypeDesc=?}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput088() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.json.JsonWriteContext", "com.fasterxml.jackson.core.json.JsonWriteContext", "writeFieldName", new String[]{"java.lang.String"}, new String[]{"\u00e9"}, false);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "/ {getCurrentIndex=0, getCurrentName=\u00e9, getEntryCount=0, getTypeDesc=?}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput089() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.json.JsonWriteContext", "com.fasterxml.jackson.core.json.JsonWriteContext", "writeValue", new String[]{}, new String[]{}, false);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "/ {getCurrentIndex=0, getCurrentName=null, getEntryCount=1, getTypeDesc=?}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput090() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.json.JsonWriteContext", "com.fasterxml.jackson.core.json.JsonWriteContext", "createRootContext", new String[]{}, new String[]{}, true);
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.core.json.JsonWriteContext", actual.getClass().getName());
  assertEquals("/ {getCurrentIndex=0, getCurrentName=null, getEntryCount=0, getTypeDesc=ROOT}", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput091() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.json.JsonWriteContext", "com.fasterxml.jackson.core.json.JsonWriteContext", "createRootContext", new String[]{"com.fasterxml.jackson.core.json.DupDetector"}, new String[]{"<sample:3>"}, true);
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.core.json.JsonWriteContext", actual.getClass().getName());
  assertEquals("/ {getCurrentIndex=0, getCurrentName=null, getEntryCount=0, getTypeDesc=ROOT}", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput092() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.json.JsonWriteContext", "com.fasterxml.jackson.core.json.JsonWriteContext", "setCurrentValue", new String[]{"java.lang.Object"}, new String[]{"<i:-1>"}, false);
  assertNull(actual);
  assertEquals("receiver state after the call", "/ {getCurrentIndex=0, getCurrentName=null, getEntryCount=0, getTypeDesc=?}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput093() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.json.JsonWriteContext", "com.fasterxml.jackson.core.json.JsonWriteContext", "getCurrentValue", new String[]{}, new String[]{}, false, 0, new String[][]{{"com.fasterxml.jackson.core.json.JsonWriteContext", "getCurrentValue", ""}});
  assertNull(actual);
  assertEquals("receiver state after the call", "/ {getCurrentIndex=0, getCurrentName=null, getEntryCount=0, getTypeDesc=?}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput094() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.json.JsonWriteContext", "com.fasterxml.jackson.core.json.JsonWriteContext", "getDupDetector", new String[]{}, new String[]{}, false);
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.core.json.DupDetector", actual.getClass().getName());
  assertEquals("receiver state after the call", "/ {getCurrentIndex=0, getCurrentName=null, getEntryCount=0, getTypeDesc=?}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput095() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.json.JsonWriteContext", "com.fasterxml.jackson.core.json.JsonWriteContext", "getCurrentName", new String[]{}, new String[]{}, false, 0, new String[][]{{"com.fasterxml.jackson.core.json.JsonWriteContext", "getCurrentIndex", ""}});
  assertNull(actual);
  assertEquals("receiver state after the call", "/ {getCurrentIndex=0, getCurrentName=null, getEntryCount=0, getTypeDesc=?}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput096() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.json.JsonWriteContext", "com.fasterxml.jackson.core.json.JsonWriteContext", "appendDesc", new String[]{"java.lang.StringBuilder"}, new String[]{"<sample:4>"}, false, 2, new String[][]{{"com.fasterxml.jackson.core.json.JsonWriteContext", "reset", "int", "134217671"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "/ {getCurrentIndex=0, getCurrentName=null, getEntryCount=0, getTypeDesc=?}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput097() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.json.JsonWriteContext", "com.fasterxml.jackson.core.json.JsonWriteContext", "createChildArrayContext", new String[]{}, new String[]{}, false, 1, new String[][]{{"com.fasterxml.jackson.core.json.JsonWriteContext", "withDupDetector", "com.fasterxml.jackson.core.json.DupDetector", "<sample:4>"}, {"com.fasterxml.jackson.core.json.JsonWriteContext", "writeFieldName", "java.lang.String", "<a>b</a>"}});
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.core.json.JsonWriteContext", actual.getClass().getName());
  assertEquals("[0] {getCurrentIndex=0, getCurrentName=null, getEntryCount=0, getTypeDesc=ARRAY}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "/ {getCurrentIndex=0, getCurrentName=<a>b</a>, getEntryCount=0, getTypeDesc=ROOT}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput098() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.json.JsonWriteContext", "com.fasterxml.jackson.core.json.JsonWriteContext", "createRootContext", new String[]{}, new String[]{}, true), new String[][]{{"inArray", "", "3"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput099() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.json.JsonWriteContext", "com.fasterxml.jackson.core.json.JsonWriteContext", "createChildObjectContext", new String[]{}, new String[]{}, false, 0, new String[][]{{"com.fasterxml.jackson.core.json.JsonWriteContext", "getEntryCount", ""}});
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.core.json.JsonWriteContext", actual.getClass().getName());
  assertEquals("{?} {getCurrentIndex=0, getCurrentName=null, getEntryCount=0, getTypeDesc=OBJECT}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "/ {getCurrentIndex=0, getCurrentName=null, getEntryCount=0, getTypeDesc=?}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput100() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.json.JsonWriteContext", "com.fasterxml.jackson.core.json.JsonWriteContext", "getTypeDesc", new String[]{}, new String[]{}, false, 7, new String[][]{{"com.fasterxml.jackson.core.json.JsonWriteContext", "createChildArrayContext", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("?", String.valueOf(actual));
  assertEquals("receiver state after the call", "/ {getCurrentIndex=0, getCurrentName=null, getEntryCount=0, getTypeDesc=?}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput101() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.json.JsonWriteContext", "com.fasterxml.jackson.core.json.JsonWriteContext", "getParent", new String[]{}, new String[]{}, false);
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.core.json.JsonWriteContext", actual.getClass().getName());
  assertEquals("[0] {getCurrentIndex=0, getCurrentName=null, getEntryCount=0, getTypeDesc=ARRAY}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "/ {getCurrentIndex=0, getCurrentName=null, getEntryCount=0, getTypeDesc=?}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput102() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.json.JsonWriteContext", "com.fasterxml.jackson.core.json.JsonWriteContext", "inObject", new String[]{}, new String[]{}, false, 6, new String[][]{{"com.fasterxml.jackson.core.json.JsonWriteContext", "getCurrentValue", ""}, {"com.fasterxml.jackson.core.json.JsonWriteContext", "getCurrentName", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "/ {getCurrentIndex=0, getCurrentName=null, getEntryCount=0, getTypeDesc=?}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput103() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.json.JsonWriteContext", "com.fasterxml.jackson.core.json.JsonWriteContext", "createRootContext", new String[]{"com.fasterxml.jackson.core.json.DupDetector"}, new String[]{"<sample:5>"}, true), new String[][]{{"getCurrentName", "", "7"}});
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput104() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.json.JsonWriteContext", "com.fasterxml.jackson.core.json.JsonWriteContext", "getParent", new String[]{}, new String[]{}, false), new String[][]{{"createChildObjectContext", "", "3"}, {"getTypeDesc", "", "0"}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("OBJECT", String.valueOf(actual));
  assertEquals("receiver state after the call", "/ {getCurrentIndex=0, getCurrentName=null, getEntryCount=0, getTypeDesc=?}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput105() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.json.JsonWriteContext", "com.fasterxml.jackson.core.json.JsonWriteContext", "createChildArrayContext", new String[]{}, new String[]{}, false, 7, new String[][]{{"com.fasterxml.jackson.core.json.JsonWriteContext", "inArray", ""}});
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.core.json.JsonWriteContext", actual.getClass().getName());
  assertEquals("[0] {getCurrentIndex=0, getCurrentName=null, getEntryCount=0, getTypeDesc=ARRAY}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "/ {getCurrentIndex=0, getCurrentName=null, getEntryCount=0, getTypeDesc=?}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput106() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.json.JsonWriteContext", "com.fasterxml.jackson.core.json.JsonWriteContext", "appendDesc", new String[]{"java.lang.StringBuilder"}, new String[]{"<sample:0>"}, false, 1, new String[][]{{"com.fasterxml.jackson.core.json.JsonWriteContext", "writeFieldName", "java.lang.String", "0xFFFFFFFFF\t"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "/ {getCurrentIndex=0, getCurrentName=0xFFFFFFFFF\t, getEntryCount=0, getTypeDesc=ROOT}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput107() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.json.JsonWriteContext", "com.fasterxml.jackson.core.json.JsonWriteContext", "writeFieldName", new String[]{"java.lang.String"}, new String[]{"TITL"}, false, 0, new String[][]{{"com.fasterxml.jackson.core.json.JsonWriteContext", "getDupDetector", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "/ {getCurrentIndex=0, getCurrentName=TITL, getEntryCount=0, getTypeDesc=?}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput108() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.json.JsonWriteContext", "com.fasterxml.jackson.core.json.JsonWriteContext", "getCurrentIndex", new String[]{}, new String[]{}, false, 2, new String[][]{{"com.fasterxml.jackson.core.json.JsonWriteContext", "reset", "int", "2147483647"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "/ {getCurrentIndex=0, getCurrentName=null, getEntryCount=0, getTypeDesc=?}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput109() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.json.JsonWriteContext", "com.fasterxml.jackson.core.json.JsonWriteContext", "getParent", new String[]{}, new String[]{}, false), new String[][]{{"writeValue", "", "7"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "/ {getCurrentIndex=0, getCurrentName=null, getEntryCount=0, getTypeDesc=?}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput110() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.json.JsonWriteContext", "com.fasterxml.jackson.core.json.JsonWriteContext", "appendDesc", new String[]{"java.lang.StringBuilder"}, new String[]{"<sample:3>"}, false, 1, new String[][]{{"com.fasterxml.jackson.core.json.JsonWriteContext", "createChildObjectContext", ""}});
  assertNull(actual);
  assertEquals("receiver state after the call", "/ {getCurrentIndex=0, getCurrentName=null, getEntryCount=0, getTypeDesc=ROOT}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput111() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.json.JsonWriteContext", "com.fasterxml.jackson.core.json.JsonWriteContext", "createChildArrayContext", new String[]{}, new String[]{}, false, 2, new String[][]{{"com.fasterxml.jackson.core.json.JsonWriteContext", "getCurrentValue", ""}}), new String[][]{{"inArray", "", "4"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
  assertEquals("receiver state after the call", "[0] {getCurrentIndex=0, getCurrentName=null, getEntryCount=0, getTypeDesc=ARRAY}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput112() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.json.JsonWriteContext", "com.fasterxml.jackson.core.json.JsonWriteContext", "appendDesc", new String[]{"java.lang.StringBuilder"}, new String[]{"<sample:3>"}, false, 2, new String[][]{});
  assertNull(actual);
  assertEquals("receiver state after the call", "[0] {getCurrentIndex=0, getCurrentName=null, getEntryCount=0, getTypeDesc=ARRAY}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput113() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.json.JsonWriteContext", "com.fasterxml.jackson.core.json.JsonWriteContext", "createRootContext", new String[]{"com.fasterxml.jackson.core.json.DupDetector"}, new String[]{"<sample:3>"}, true), new String[][]{{"writeFieldName", "java.lang.String", "6"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput114() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.json.JsonWriteContext", "com.fasterxml.jackson.core.json.JsonWriteContext", "createChildObjectContext", new String[]{}, new String[]{}, false, 2, new String[][]{{"com.fasterxml.jackson.core.json.JsonWriteContext", "inArray", ""}});
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.core.json.JsonWriteContext", actual.getClass().getName());
  assertEquals("{?} {getCurrentIndex=0, getCurrentName=null, getEntryCount=0, getTypeDesc=OBJECT}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "[0] {getCurrentIndex=0, getCurrentName=null, getEntryCount=0, getTypeDesc=ARRAY}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput115() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.json.JsonWriteContext", "com.fasterxml.jackson.core.json.JsonWriteContext", "getCurrentIndex", new String[]{}, new String[]{}, false, 1, new String[][]{});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "/ {getCurrentIndex=0, getCurrentName=null, getEntryCount=0, getTypeDesc=ROOT}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput116() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.json.JsonWriteContext", "com.fasterxml.jackson.core.json.JsonWriteContext", "toString", new String[]{}, new String[]{}, false, 0, new String[][]{{"com.fasterxml.jackson.core.json.JsonWriteContext", "inArray", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("/", String.valueOf(actual));
  assertEquals("receiver state after the call", "/ {getCurrentIndex=0, getCurrentName=null, getEntryCount=0, getTypeDesc=?}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput117() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.json.JsonWriteContext", "com.fasterxml.jackson.core.json.JsonWriteContext", "getTypeDesc", new String[]{}, new String[]{}, false, 1, new String[][]{});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("ROOT", String.valueOf(actual));
  assertEquals("receiver state after the call", "/ {getCurrentIndex=0, getCurrentName=null, getEntryCount=0, getTypeDesc=ROOT}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput118() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.json.JsonWriteContext", "com.fasterxml.jackson.core.json.JsonWriteContext", "createChildArrayContext", new String[]{}, new String[]{}, false, 0, new String[][]{{"com.fasterxml.jackson.core.json.JsonWriteContext", "inRoot", ""}, {"com.fasterxml.jackson.core.json.JsonWriteContext", "createChildObjectContext", ""}});
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.core.json.JsonWriteContext", actual.getClass().getName());
  assertEquals("[0] {getCurrentIndex=0, getCurrentName=null, getEntryCount=0, getTypeDesc=ARRAY}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "/ {getCurrentIndex=0, getCurrentName=null, getEntryCount=0, getTypeDesc=?}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput119() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.json.JsonWriteContext", "com.fasterxml.jackson.core.json.JsonWriteContext", "inArray", new String[]{}, new String[]{}, false, 0, new String[][]{{"com.fasterxml.jackson.core.json.JsonWriteContext", "writeFieldName", "java.lang.String", "{\"a\":1}1.12345678"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "/ {getCurrentIndex=0, getCurrentName={\"a\":1}1.12345678, getEntryCount=0, getTypeDesc=?}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput120() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.json.JsonWriteContext", "com.fasterxml.jackson.core.json.JsonWriteContext", "createRootContext", new String[]{}, new String[]{}, true), new String[][]{{"getTypeDesc", "", "6"}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("ROOT", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput121() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.json.JsonWriteContext", "com.fasterxml.jackson.core.json.JsonWriteContext", "createChildArrayContext", new String[]{}, new String[]{}, false), new String[][]{{"writeFieldName", "java.lang.String", "5"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "/ {getCurrentIndex=0, getCurrentName=null, getEntryCount=0, getTypeDesc=?}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput122() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.json.JsonWriteContext", "com.fasterxml.jackson.core.json.JsonWriteContext", "getEntryCount", new String[]{}, new String[]{}, false, 0, new String[][]{{"com.fasterxml.jackson.core.json.JsonWriteContext", "withDupDetector", "com.fasterxml.jackson.core.json.DupDetector", "<sample:3>"}, {"com.fasterxml.jackson.core.json.JsonWriteContext", "inRoot", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "/ {getCurrentIndex=0, getCurrentName=null, getEntryCount=0, getTypeDesc=?}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput123() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.json.JsonWriteContext", "com.fasterxml.jackson.core.json.JsonWriteContext", "appendDesc", new String[]{"java.lang.StringBuilder"}, new String[]{"<null>"}, false, 0, new String[][]{{"com.fasterxml.jackson.core.json.JsonWriteContext", "toString", ""}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput124() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.json.JsonWriteContext", "com.fasterxml.jackson.core.json.JsonWriteContext", "createChildArrayContext", new String[]{}, new String[]{}, false, 5, new String[][]{{"com.fasterxml.jackson.core.json.JsonWriteContext", "getParent", ""}}), new String[][]{{"getDupDetector", "", "4"}});
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.core.json.DupDetector", actual.getClass().getName());
  assertEquals("receiver state after the call", "/ {getCurrentIndex=0, getCurrentName=null, getEntryCount=0, getTypeDesc=?}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput125() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.json.JsonWriteContext", "com.fasterxml.jackson.core.json.JsonWriteContext", "getCurrentValue", new String[]{}, new String[]{}, false, 1, new String[][]{{"com.fasterxml.jackson.core.json.JsonWriteContext", "getParent", ""}});
  assertNull(actual);
  assertEquals("receiver state after the call", "/ {getCurrentIndex=0, getCurrentName=null, getEntryCount=0, getTypeDesc=ROOT}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput126() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.json.JsonWriteContext", "com.fasterxml.jackson.core.json.JsonWriteContext", "inArray", new String[]{}, new String[]{}, false, 2, new String[][]{{"com.fasterxml.jackson.core.json.JsonWriteContext", "toString", ""}, {"com.fasterxml.jackson.core.json.JsonWriteContext", "reset", "int", "2147483647"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "/ {getCurrentIndex=0, getCurrentName=null, getEntryCount=0, getTypeDesc=?}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput127() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.json.JsonWriteContext", "com.fasterxml.jackson.core.json.JsonWriteContext", "createRootContext", new String[]{"com.fasterxml.jackson.core.json.DupDetector"}, new String[]{"<sample:3>"}, true), new String[][]{{"inRoot", "", "7"}, {"inArray", "", "0"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput128() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.json.JsonWriteContext", "com.fasterxml.jackson.core.json.JsonWriteContext", "createChildObjectContext", new String[]{}, new String[]{}, false), new String[][]{{"inRoot", "", "0"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "/ {getCurrentIndex=0, getCurrentName=null, getEntryCount=0, getTypeDesc=?}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput129() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.json.JsonWriteContext", "com.fasterxml.jackson.core.json.JsonWriteContext", "createChildObjectContext", new String[]{}, new String[]{}, false, 1, new String[][]{{"com.fasterxml.jackson.core.json.JsonWriteContext", "getEntryCount", ""}}), new String[][]{{"getTypeDesc", "", "1"}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("OBJECT", String.valueOf(actual));
  assertEquals("receiver state after the call", "/ {getCurrentIndex=0, getCurrentName=null, getEntryCount=0, getTypeDesc=ROOT}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput130() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.json.JsonWriteContext", "com.fasterxml.jackson.core.json.JsonWriteContext", "writeFieldName", new String[]{"java.lang.String"}, new String[]{"2"}, false, 6, new String[][]{{"com.fasterxml.jackson.core.json.JsonWriteContext", "getEntryCount", ""}, {"com.fasterxml.jackson.core.json.JsonWriteContext", "writeFieldName", "java.lang.String", "[1,2]"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("4", String.valueOf(actual));
  assertEquals("receiver state after the call", "/ {getCurrentIndex=0, getCurrentName=[1,2], getEntryCount=0, getTypeDesc=?}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput131() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.json.JsonWriteContext", "com.fasterxml.jackson.core.json.JsonWriteContext", "getTypeDesc", new String[]{}, new String[]{}, false, 0, new String[][]{{"com.fasterxml.jackson.core.json.JsonWriteContext", "setCurrentValue", "java.lang.Object", "<null>"}, {"com.fasterxml.jackson.core.json.JsonWriteContext", "writeFieldName", "java.lang.String", "-0/0"}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("?", String.valueOf(actual));
  assertEquals("receiver state after the call", "/ {getCurrentIndex=0, getCurrentName=-0/0, getEntryCount=0, getTypeDesc=?}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput132() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.json.JsonWriteContext", "com.fasterxml.jackson.core.json.JsonWriteContext", "createChildArrayContext", new String[]{}, new String[]{}, false, 3, new String[][]{{"com.fasterxml.jackson.core.json.JsonWriteContext", "writeValue", ""}}), new String[][]{{"inObject", "", "6"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "/ {getCurrentIndex=0, getCurrentName=null, getEntryCount=1, getTypeDesc=?}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput133() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.json.JsonWriteContext", "com.fasterxml.jackson.core.json.JsonWriteContext", "createChildArrayContext", new String[]{}, new String[]{}, false, 1, new String[][]{{"com.fasterxml.jackson.core.json.JsonWriteContext", "toString", ""}});
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.core.json.JsonWriteContext", actual.getClass().getName());
  assertEquals("[0] {getCurrentIndex=0, getCurrentName=null, getEntryCount=0, getTypeDesc=ARRAY}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "/ {getCurrentIndex=0, getCurrentName=null, getEntryCount=0, getTypeDesc=ROOT}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput134() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.json.JsonWriteContext", "com.fasterxml.jackson.core.json.JsonWriteContext", "createRootContext", new String[]{}, new String[]{}, true), new String[][]{{"inRoot", "", "7"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput135() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.json.JsonWriteContext", "com.fasterxml.jackson.core.json.JsonWriteContext", "inObject", new String[]{}, new String[]{}, false, 7, new String[][]{{"com.fasterxml.jackson.core.json.JsonWriteContext", "writeFieldName", "java.lang.String", "12:30:45"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "/ {getCurrentIndex=0, getCurrentName=12:30:45, getEntryCount=0, getTypeDesc=?}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput136() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.json.JsonWriteContext", "com.fasterxml.jackson.core.json.JsonWriteContext", "createChildArrayContext", new String[]{}, new String[]{}, false, 0, new String[][]{{"com.fasterxml.jackson.core.json.JsonWriteContext", "toString", ""}}), new String[][]{{"getCurrentName", "", "2"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "/ {getCurrentIndex=0, getCurrentName=null, getEntryCount=0, getTypeDesc=?}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput137() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.json.JsonWriteContext", "com.fasterxml.jackson.core.json.JsonWriteContext", "getParent", new String[]{}, new String[]{}, false, 1, new String[][]{{"com.fasterxml.jackson.core.json.JsonWriteContext", "getParent", ""}}), new String[][]{{"inArray", "", "6"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "/ {getCurrentIndex=0, getCurrentName=null, getEntryCount=0, getTypeDesc=ROOT}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput138() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.json.JsonWriteContext", "com.fasterxml.jackson.core.json.JsonWriteContext", "withDupDetector", new String[]{"com.fasterxml.jackson.core.json.DupDetector"}, new String[]{"<sample:6>"}, false, 2, new String[][]{{"com.fasterxml.jackson.core.json.JsonWriteContext", "createChildArrayContext", ""}});
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.core.json.JsonWriteContext", actual.getClass().getName());
  assertEquals("[0] {getCurrentIndex=0, getCurrentName=null, getEntryCount=0, getTypeDesc=ARRAY}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "[0] {getCurrentIndex=0, getCurrentName=null, getEntryCount=0, getTypeDesc=ARRAY}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput139() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.json.JsonWriteContext", "com.fasterxml.jackson.core.json.JsonWriteContext", "getCurrentName", new String[]{}, new String[]{}, false, 1, new String[][]{});
  assertNull(actual);
  assertEquals("receiver state after the call", "/ {getCurrentIndex=0, getCurrentName=null, getEntryCount=0, getTypeDesc=ROOT}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput140() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.json.JsonWriteContext", "com.fasterxml.jackson.core.json.JsonWriteContext", "appendDesc", new String[]{"java.lang.StringBuilder"}, new String[]{"<sample:0>"}, false, 7, new String[][]{{"com.fasterxml.jackson.core.json.JsonWriteContext", "writeFieldName", "java.lang.String", "Duplicate f"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "/ {getCurrentIndex=0, getCurrentName=Duplicate f, getEntryCount=0, getTypeDesc=?}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput141() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.json.JsonWriteContext", "com.fasterxml.jackson.core.json.JsonWriteContext", "withDupDetector", new String[]{"com.fasterxml.jackson.core.json.DupDetector"}, new String[]{"<sample:3>"}, false), new String[][]{{"getDupDetector", "", "2"}});
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.core.json.DupDetector", actual.getClass().getName());
  assertEquals("receiver state after the call", "/ {getCurrentIndex=0, getCurrentName=null, getEntryCount=0, getTypeDesc=?}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput142() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.json.JsonWriteContext", "com.fasterxml.jackson.core.json.JsonWriteContext", "getCurrentName", new String[]{}, new String[]{}, false, 2, new String[][]{});
  assertNull(actual);
  assertEquals("receiver state after the call", "[0] {getCurrentIndex=0, getCurrentName=null, getEntryCount=0, getTypeDesc=ARRAY}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput143() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.json.JsonWriteContext", "com.fasterxml.jackson.core.json.JsonWriteContext", "createRootContext", new String[]{"com.fasterxml.jackson.core.json.DupDetector"}, new String[]{"<sample:5>"}, true), new String[][]{{"inRoot", "", "4"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput144() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.json.JsonWriteContext", "com.fasterxml.jackson.core.json.JsonWriteContext", "inRoot", new String[]{}, new String[]{}, false, 1, new String[][]{});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
  assertEquals("receiver state after the call", "/ {getCurrentIndex=0, getCurrentName=null, getEntryCount=0, getTypeDesc=ROOT}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput145() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.json.JsonWriteContext", "com.fasterxml.jackson.core.json.JsonWriteContext", "reset", new String[]{"int"}, new String[]{"2"}, false, 4, new String[][]{{"com.fasterxml.jackson.core.json.JsonWriteContext", "getDupDetector", ""}});
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.core.json.JsonWriteContext", actual.getClass().getName());
  assertEquals("{?} {getCurrentIndex=0, getCurrentName=null, getEntryCount=0, getTypeDesc=OBJECT}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{?} {getCurrentIndex=0, getCurrentName=null, getEntryCount=0, getTypeDesc=OBJECT}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput146() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.json.JsonWriteContext", "com.fasterxml.jackson.core.json.JsonWriteContext", "withDupDetector", new String[]{"com.fasterxml.jackson.core.json.DupDetector"}, new String[]{"<sample:2>"}, false, 6, new String[][]{{"com.fasterxml.jackson.core.json.JsonWriteContext", "setCurrentValue", "java.lang.Object", "<s:key>"}}), new String[][]{{"getParent", "", "0"}});
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.core.json.JsonWriteContext", actual.getClass().getName());
  assertEquals("/ {getCurrentIndex=0, getCurrentName=null, getEntryCount=0, getTypeDesc=?}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "/ {getCurrentIndex=0, getCurrentName=null, getEntryCount=0, getTypeDesc=?}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput147() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.json.JsonWriteContext", "com.fasterxml.jackson.core.json.JsonWriteContext", "createChildObjectContext", new String[]{}, new String[]{}, false, 5, new String[][]{}), new String[][]{{"getDupDetector", "", "0"}});
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.core.json.DupDetector", actual.getClass().getName());
  assertEquals("receiver state after the call", "/ {getCurrentIndex=0, getCurrentName=null, getEntryCount=0, getTypeDesc=?}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput148() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.json.JsonWriteContext", "com.fasterxml.jackson.core.json.JsonWriteContext", "writeFieldName", new String[]{"java.lang.String"}, new String[]{">"}, false, 2, new String[][]{});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "[0] {getCurrentIndex=0, getCurrentName=>, getEntryCount=0, getTypeDesc=ARRAY}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput149() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.json.JsonWriteContext", "com.fasterxml.jackson.core.json.JsonWriteContext", "writeFieldName", new String[]{"java.lang.String"}, new String[]{"itle"}, false);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "/ {getCurrentIndex=0, getCurrentName=itle, getEntryCount=0, getTypeDesc=?}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput150() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.json.JsonWriteContext", "com.fasterxml.jackson.core.json.JsonWriteContext", "withDupDetector", new String[]{"com.fasterxml.jackson.core.json.DupDetector"}, new String[]{"<sample:6>"}, false, 3, new String[][]{{"com.fasterxml.jackson.core.json.JsonWriteContext", "getParent", ""}, {"com.fasterxml.jackson.core.json.JsonWriteContext", "getDupDetector", ""}}), new String[][]{{"inRoot", "", "4"}, {"writeFieldName", "java.lang.String", "7"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "/ {getCurrentIndex=0, getCurrentName=sample, getEntryCount=0, getTypeDesc=?}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput151() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.json.JsonWriteContext", "com.fasterxml.jackson.core.json.JsonWriteContext", "reset", new String[]{"int"}, new String[]{"1"}, false, 0, new String[][]{{"com.fasterxml.jackson.core.json.JsonWriteContext", "createChildObjectContext", ""}});
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.core.json.JsonWriteContext", actual.getClass().getName());
  assertEquals("[0] {getCurrentIndex=0, getCurrentName=null, getEntryCount=0, getTypeDesc=ARRAY}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "[0] {getCurrentIndex=0, getCurrentName=null, getEntryCount=0, getTypeDesc=ARRAY}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput152() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.json.JsonWriteContext", "com.fasterxml.jackson.core.json.JsonWriteContext", "getCurrentName", new String[]{}, new String[]{}, false, 0, new String[][]{{"com.fasterxml.jackson.core.json.JsonWriteContext", "writeValue", ""}});
  assertNull(actual);
  assertEquals("receiver state after the call", "/ {getCurrentIndex=0, getCurrentName=null, getEntryCount=1, getTypeDesc=?}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput153() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.json.JsonWriteContext", "com.fasterxml.jackson.core.json.JsonWriteContext", "reset", new String[]{"int"}, new String[]{"14"}, false, 2, new String[][]{}), new String[][]{{"inArray", "", "6"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "/ {getCurrentIndex=0, getCurrentName=null, getEntryCount=0, getTypeDesc=?}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput154() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.json.JsonWriteContext", "com.fasterxml.jackson.core.json.JsonWriteContext", "writeFieldName", new String[]{"java.lang.String"}, new String[]{"PT1H010"}, false, 1, new String[][]{{"com.fasterxml.jackson.core.json.JsonWriteContext", "inRoot", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "/ {getCurrentIndex=0, getCurrentName=PT1H010, getEntryCount=0, getTypeDesc=ROOT}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput155() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.json.JsonWriteContext", "com.fasterxml.jackson.core.json.JsonWriteContext", "reset", new String[]{"int"}, new String[]{"0"}, false, 3, new String[][]{{"com.fasterxml.jackson.core.json.JsonWriteContext", "getCurrentIndex", ""}});
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.core.json.JsonWriteContext", actual.getClass().getName());
  assertEquals("/ {getCurrentIndex=0, getCurrentName=null, getEntryCount=0, getTypeDesc=ROOT}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "/ {getCurrentIndex=0, getCurrentName=null, getEntryCount=0, getTypeDesc=ROOT}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput156() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.json.JsonWriteContext", "com.fasterxml.jackson.core.json.JsonWriteContext", "getEntryCount", new String[]{}, new String[]{}, false, 2, new String[][]{});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "[0] {getCurrentIndex=0, getCurrentName=null, getEntryCount=0, getTypeDesc=ARRAY}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput157() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.json.JsonWriteContext", "com.fasterxml.jackson.core.json.JsonWriteContext", "inRoot", new String[]{}, new String[]{}, false, 0, new String[][]{{"com.fasterxml.jackson.core.json.JsonWriteContext", "inObject", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "/ {getCurrentIndex=0, getCurrentName=null, getEntryCount=0, getTypeDesc=?}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput158() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.json.JsonWriteContext", "com.fasterxml.jackson.core.json.JsonWriteContext", "createChildObjectContext", new String[]{}, new String[]{}, false), new String[][]{{"getEntryCount", "", "3"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "/ {getCurrentIndex=0, getCurrentName=null, getEntryCount=0, getTypeDesc=?}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput159() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.json.JsonWriteContext", "com.fasterxml.jackson.core.json.JsonWriteContext", "createChildArrayContext", new String[]{}, new String[]{}, false, 0, new String[][]{{"com.fasterxml.jackson.core.json.JsonWriteContext", "getCurrentIndex", ""}, {"com.fasterxml.jackson.core.json.JsonWriteContext", "getCurrentIndex", ""}}), new String[][]{{"withDupDetector", "com.fasterxml.jackson.core.json.DupDetector", "7"}, {"createChildObjectContext", "", "4"}});
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.core.json.JsonWriteContext", actual.getClass().getName());
  assertEquals("{?} {getCurrentIndex=0, getCurrentName=null, getEntryCount=0, getTypeDesc=OBJECT}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "/ {getCurrentIndex=0, getCurrentName=null, getEntryCount=0, getTypeDesc=?}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput160() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.json.JsonWriteContext", "com.fasterxml.jackson.core.json.JsonWriteContext", "createChildArrayContext", new String[]{}, new String[]{}, false, 0, new String[][]{{"com.fasterxml.jackson.core.json.JsonWriteContext", "withDupDetector", "com.fasterxml.jackson.core.json.DupDetector", "<sample:4>"}, {"com.fasterxml.jackson.core.json.JsonWriteContext", "appendDesc", "java.lang.StringBuilder", "<sample:1>"}}), new String[][]{{"getParent", "", "4"}});
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.core.json.JsonWriteContext", actual.getClass().getName());
  assertEquals("/ {getCurrentIndex=0, getCurrentName=null, getEntryCount=0, getTypeDesc=?}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "/ {getCurrentIndex=0, getCurrentName=null, getEntryCount=0, getTypeDesc=?}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput161() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.json.JsonWriteContext", "com.fasterxml.jackson.core.json.JsonWriteContext", "createChildObjectContext", new String[]{}, new String[]{}, false, 0, new String[][]{{"com.fasterxml.jackson.core.json.JsonWriteContext", "inArray", ""}, {"com.fasterxml.jackson.core.json.JsonWriteContext", "appendDesc", "java.lang.StringBuilder", "<sample:1>"}}), new String[][]{{"getParent", "", "2"}});
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.core.json.JsonWriteContext", actual.getClass().getName());
  assertEquals("/ {getCurrentIndex=0, getCurrentName=null, getEntryCount=0, getTypeDesc=?}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "/ {getCurrentIndex=0, getCurrentName=null, getEntryCount=0, getTypeDesc=?}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput162() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.json.JsonWriteContext", "com.fasterxml.jackson.core.json.JsonWriteContext", "inRoot", new String[]{}, new String[]{}, false, 2, new String[][]{{"com.fasterxml.jackson.core.json.JsonWriteContext", "getCurrentValue", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "[0] {getCurrentIndex=0, getCurrentName=null, getEntryCount=0, getTypeDesc=ARRAY}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput163() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.json.JsonWriteContext", "com.fasterxml.jackson.core.json.JsonWriteContext", "createChildArrayContext", new String[]{}, new String[]{}, false), new String[][]{{"getTypeDesc", "", "2"}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("ARRAY", String.valueOf(actual));
  assertEquals("receiver state after the call", "/ {getCurrentIndex=0, getCurrentName=null, getEntryCount=0, getTypeDesc=?}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput164() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.json.JsonWriteContext", "com.fasterxml.jackson.core.json.JsonWriteContext", "createRootContext", new String[]{"com.fasterxml.jackson.core.json.DupDetector"}, new String[]{"<null>"}, true), new String[][]{{"getTypeDesc", "", "0"}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("ROOT", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput165() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.json.JsonWriteContext", "com.fasterxml.jackson.core.json.JsonWriteContext", "getTypeDesc", new String[]{}, new String[]{}, false, 2, new String[][]{});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("ARRAY", String.valueOf(actual));
  assertEquals("receiver state after the call", "[0] {getCurrentIndex=0, getCurrentName=null, getEntryCount=0, getTypeDesc=ARRAY}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput166() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.json.JsonWriteContext", "com.fasterxml.jackson.core.json.JsonWriteContext", "inObject", new String[]{}, new String[]{}, false, 6, new String[][]{{"com.fasterxml.jackson.core.json.JsonWriteContext", "writeValue", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "/ {getCurrentIndex=0, getCurrentName=null, getEntryCount=1, getTypeDesc=?}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput167() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.json.JsonWriteContext", "com.fasterxml.jackson.core.json.JsonWriteContext", "getCurrentValue", new String[]{}, new String[]{}, false, 3, new String[][]{{"com.fasterxml.jackson.core.json.JsonWriteContext", "setCurrentValue", "java.lang.Object", "<d:1.5>"}, {"com.fasterxml.jackson.core.json.JsonWriteContext", "appendDesc", "java.lang.StringBuilder", "<null>"}});
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("1.5", String.valueOf(actual));
  assertEquals("receiver state after the call", "/ {getCurrentIndex=0, getCurrentName=null, getEntryCount=0, getTypeDesc=?}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput168() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.json.JsonWriteContext", "com.fasterxml.jackson.core.json.JsonWriteContext", "toString", new String[]{}, new String[]{}, false, 4, new String[][]{{"com.fasterxml.jackson.core.json.JsonWriteContext", "getCurrentValue", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("/", String.valueOf(actual));
  assertEquals("receiver state after the call", "/ {getCurrentIndex=0, getCurrentName=null, getEntryCount=0, getTypeDesc=ROOT}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput169() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.json.JsonWriteContext", "com.fasterxml.jackson.core.json.JsonWriteContext", "createChildObjectContext", new String[]{}, new String[]{}, false, 4, new String[][]{{"com.fasterxml.jackson.core.json.JsonWriteContext", "withDupDetector", "com.fasterxml.jackson.core.json.DupDetector", "<sample:4>"}}), new String[][]{{"createChildArrayContext", "", "5"}, {"getTypeDesc", "", "2"}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("ARRAY", String.valueOf(actual));
  assertEquals("receiver state after the call", "/ {getCurrentIndex=0, getCurrentName=null, getEntryCount=0, getTypeDesc=ROOT}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput170() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.json.JsonWriteContext", "com.fasterxml.jackson.core.json.JsonWriteContext", "createChildArrayContext", new String[]{}, new String[]{}, false, 4, new String[][]{{"com.fasterxml.jackson.core.json.JsonWriteContext", "getEntryCount", ""}}), new String[][]{{"getParent", "", "4"}});
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.core.json.JsonWriteContext", actual.getClass().getName());
  assertEquals("/ {getCurrentIndex=0, getCurrentName=null, getEntryCount=0, getTypeDesc=ROOT}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "/ {getCurrentIndex=0, getCurrentName=null, getEntryCount=0, getTypeDesc=ROOT}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput171() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.json.JsonWriteContext", "com.fasterxml.jackson.core.json.JsonWriteContext", "setCurrentValue", new String[]{"java.lang.Object"}, new String[]{"<d:0.15>"}, false, 2, new String[][]{{"com.fasterxml.jackson.core.json.JsonWriteContext", "withDupDetector", "com.fasterxml.jackson.core.json.DupDetector", "<null>"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "[0] {getCurrentIndex=0, getCurrentName=null, getEntryCount=0, getTypeDesc=ARRAY}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput172() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.json.JsonWriteContext", "com.fasterxml.jackson.core.json.JsonWriteContext", "createRootContext", new String[]{}, new String[]{}, true), new String[][]{{"inRoot", "", "0"}, {"getCurrentName", "", "0"}});
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput173() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.json.JsonWriteContext", "com.fasterxml.jackson.core.json.JsonWriteContext", "reset", new String[]{"int"}, new String[]{"5"}, false, 7, new String[][]{}), new String[][]{{"getCurrentIndex", "", "1"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "/ {getCurrentIndex=0, getCurrentName=null, getEntryCount=0, getTypeDesc=?}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput174() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.json.JsonWriteContext", "com.fasterxml.jackson.core.json.JsonWriteContext", "writeValue", new String[]{}, new String[]{}, false, 1, new String[][]{{"com.fasterxml.jackson.core.json.JsonWriteContext", "getParent", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "/ {getCurrentIndex=0, getCurrentName=null, getEntryCount=1, getTypeDesc=ROOT}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput175() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.json.JsonWriteContext", "com.fasterxml.jackson.core.json.JsonWriteContext", "reset", new String[]{"int"}, new String[]{"-2147483648"}, false), new String[][]{{"writeFieldName", "java.lang.String", "2"}, {"writeFieldName", "java.lang.String", "0"}, {"setCurrentValue", "java.lang.Object", "0"}});
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.core.json.JsonWriteContext", actual.getClass().getName());
  assertEquals("/ {getCurrentIndex=0, getCurrentName=0, getEntryCount=0, getTypeDesc=?}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "/ {getCurrentIndex=0, getCurrentName=0, getEntryCount=0, getTypeDesc=?}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput176() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.json.JsonWriteContext", "com.fasterxml.jackson.core.json.JsonWriteContext", "setCurrentValue", new String[]{"java.lang.Object"}, new String[]{"<s:ley>"}, false, 4, new String[][]{{"com.fasterxml.jackson.core.json.JsonWriteContext", "inArray", ""}});
  assertNull(actual);
  assertEquals("receiver state after the call", "/ {getCurrentIndex=0, getCurrentName=null, getEntryCount=0, getTypeDesc=ROOT}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput177() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.json.JsonWriteContext", "com.fasterxml.jackson.core.json.JsonWriteContext", "createRootContext", new String[]{"com.fasterxml.jackson.core.json.DupDetector"}, new String[]{"<sample:8>"}, true), new String[][]{{"createChildObjectContext", "", "5"}});
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.core.json.JsonWriteContext", actual.getClass().getName());
  assertEquals("{?} {getCurrentIndex=0, getCurrentName=null, getEntryCount=0, getTypeDesc=OBJECT}", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput178() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.json.JsonWriteContext", "com.fasterxml.jackson.core.json.JsonWriteContext", "createChildObjectContext", new String[]{}, new String[]{}, false, 6, new String[][]{{"com.fasterxml.jackson.core.json.JsonWriteContext", "writeValue", ""}}), new String[][]{{"withDupDetector", "com.fasterxml.jackson.core.json.DupDetector", "0"}});
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.core.json.JsonWriteContext", actual.getClass().getName());
  assertEquals("{?} {getCurrentIndex=0, getCurrentName=null, getEntryCount=0, getTypeDesc=OBJECT}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "/ {getCurrentIndex=0, getCurrentName=null, getEntryCount=1, getTypeDesc=?}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput179() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.json.JsonWriteContext", "com.fasterxml.jackson.core.json.JsonWriteContext", "getCurrentValue", new String[]{}, new String[]{}, false, 2, new String[][]{{"com.fasterxml.jackson.core.json.JsonWriteContext", "getCurrentName", ""}});
  assertNull(actual);
  assertEquals("receiver state after the call", "[0] {getCurrentIndex=0, getCurrentName=null, getEntryCount=0, getTypeDesc=ARRAY}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput180() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.json.JsonWriteContext", "com.fasterxml.jackson.core.json.JsonWriteContext", "getParent", new String[]{}, new String[]{}, false, 2, new String[][]{}), new String[][]{{"createChildArrayContext", "", "3"}, {"inArray", "", "0"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
  assertEquals("receiver state after the call", "[0] {getCurrentIndex=0, getCurrentName=null, getEntryCount=0, getTypeDesc=ARRAY}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput181() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.json.JsonWriteContext", "com.fasterxml.jackson.core.json.JsonWriteContext", "getDupDetector", new String[]{}, new String[]{}, false, 0, new String[][]{{"com.fasterxml.jackson.core.json.JsonWriteContext", "createChildObjectContext", ""}, {"com.fasterxml.jackson.core.json.JsonWriteContext", "writeValue", ""}}), new String[][]{{"reset", "", "2"}});
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.core.json.DupDetector", actual.getClass().getName());
  assertEquals("receiver state after the call", "/ {getCurrentIndex=0, getCurrentName=null, getEntryCount=1, getTypeDesc=?}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput182() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.json.JsonWriteContext", "com.fasterxml.jackson.core.json.JsonWriteContext", "createChildObjectContext", new String[]{}, new String[]{}, false, 4, new String[][]{}), new String[][]{{"setCurrentValue", "java.lang.Object", "6"}});
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.core.json.JsonWriteContext", actual.getClass().getName());
  assertEquals("{?} {getCurrentIndex=0, getCurrentName=null, getEntryCount=0, getTypeDesc=OBJECT}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "/ {getCurrentIndex=0, getCurrentName=null, getEntryCount=0, getTypeDesc=ROOT}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput183() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.json.JsonWriteContext", "com.fasterxml.jackson.core.json.JsonWriteContext", "createChildObjectContext", new String[]{}, new String[]{}, false, 0, new String[][]{{"com.fasterxml.jackson.core.json.JsonWriteContext", "getEntryCount", ""}}), new String[][]{{"getCurrentValue", "", "6"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "/ {getCurrentIndex=0, getCurrentName=null, getEntryCount=0, getTypeDesc=?}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput184() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.json.JsonWriteContext", "com.fasterxml.jackson.core.json.JsonWriteContext", "getCurrentValue", new String[]{}, new String[]{}, false, 0, new String[][]{{"com.fasterxml.jackson.core.json.JsonWriteContext", "writeValue", ""}, {"com.fasterxml.jackson.core.json.JsonWriteContext", "getEntryCount", ""}});
  assertNull(actual);
  assertEquals("receiver state after the call", "/ {getCurrentIndex=0, getCurrentName=null, getEntryCount=1, getTypeDesc=?}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput185() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.json.JsonWriteContext", "com.fasterxml.jackson.core.json.JsonWriteContext", "createRootContext", new String[]{}, new String[]{}, true), new String[][]{{"createChildObjectContext", "", "2"}});
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.core.json.JsonWriteContext", actual.getClass().getName());
  assertEquals("{?} {getCurrentIndex=0, getCurrentName=null, getEntryCount=0, getTypeDesc=OBJECT}", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput186() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.json.JsonWriteContext", "com.fasterxml.jackson.core.json.JsonWriteContext", "reset", new String[]{"int"}, new String[]{"16383"}, false, 0, new String[][]{{"com.fasterxml.jackson.core.json.JsonWriteContext", "inArray", ""}}), new String[][]{{"writeValue", "", "4"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "/ {getCurrentIndex=0, getCurrentName=null, getEntryCount=1, getTypeDesc=?}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput187() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.json.JsonWriteContext", "com.fasterxml.jackson.core.json.JsonWriteContext", "getEntryCount", new String[]{}, new String[]{}, false, 1, new String[][]{{"com.fasterxml.jackson.core.json.JsonWriteContext", "getEntryCount", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "/ {getCurrentIndex=0, getCurrentName=null, getEntryCount=0, getTypeDesc=ROOT}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput188() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.json.JsonWriteContext", "com.fasterxml.jackson.core.json.JsonWriteContext", "getEntryCount", new String[]{}, new String[]{}, false, 0, new String[][]{{"com.fasterxml.jackson.core.json.JsonWriteContext", "writeFieldName", "java.lang.String", "null-1.5"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "/ {getCurrentIndex=0, getCurrentName=null-1.5, getEntryCount=0, getTypeDesc=?}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput189() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.json.JsonWriteContext", "com.fasterxml.jackson.core.json.JsonWriteContext", "inObject", new String[]{}, new String[]{}, false, 1, new String[][]{{"com.fasterxml.jackson.core.json.JsonWriteContext", "setCurrentValue", "java.lang.Object", "<null>"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "/ {getCurrentIndex=0, getCurrentName=null, getEntryCount=0, getTypeDesc=ROOT}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput190() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.json.JsonWriteContext", "com.fasterxml.jackson.core.json.JsonWriteContext", "toString", new String[]{}, new String[]{}, false, 2, new String[][]{});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("[0]", String.valueOf(actual));
  assertEquals("receiver state after the call", "[0] {getCurrentIndex=0, getCurrentName=null, getEntryCount=0, getTypeDesc=ARRAY}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput191() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.json.JsonWriteContext", "com.fasterxml.jackson.core.json.JsonWriteContext", "getDupDetector", new String[]{}, new String[]{}, false), new String[][]{{"isDup", "java.lang.String", "1"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "/ {getCurrentIndex=0, getCurrentName=null, getEntryCount=0, getTypeDesc=?}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput192() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.json.JsonWriteContext", "com.fasterxml.jackson.core.json.JsonWriteContext", "reset", new String[]{"int"}, new String[]{"18"}, false, 0, new String[][]{{"com.fasterxml.jackson.core.json.JsonWriteContext", "createChildArrayContext", ""}}), new String[][]{{"getCurrentName", "", "1"}, {"withDupDetector", "com.fasterxml.jackson.core.json.DupDetector", "0"}, {"writeFieldName", "java.lang.String", "5"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "/ {getCurrentIndex=0, getCurrentName=a, getEntryCount=0, getTypeDesc=?}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput193() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.json.JsonWriteContext", "com.fasterxml.jackson.core.json.JsonWriteContext", "reset", new String[]{"int"}, new String[]{"1"}, false, 3, new String[][]{}), new String[][]{{"writeValue", "", "6"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "[0] {getCurrentIndex=0, getCurrentName=null, getEntryCount=1, getTypeDesc=ARRAY}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput194() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.json.JsonWriteContext", "com.fasterxml.jackson.core.json.JsonWriteContext", "toString", new String[]{}, new String[]{}, false, 0, null, 3);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("/", String.valueOf(actual));
  assertEquals("receiver state after the call", "/ {getCurrentIndex=0, getCurrentName=null, getEntryCount=0, getTypeDesc=?}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput195() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.json.JsonWriteContext", "com.fasterxml.jackson.core.json.JsonWriteContext", "withDupDetector", new String[]{"com.fasterxml.jackson.core.json.DupDetector"}, new String[]{"<sample:2>"}, false, 1, new String[][]{}, 3), new String[][]{{"writeFieldName", "java.lang.String", "0"}, {"inObject", "", "6"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "/ {getCurrentIndex=0, getCurrentName=, getEntryCount=0, getTypeDesc=ROOT}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput196() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.json.JsonWriteContext", "com.fasterxml.jackson.core.json.JsonWriteContext", "writeValue", new String[]{}, new String[]{}, false, 0, new String[][]{{"com.fasterxml.jackson.core.json.JsonWriteContext", "getDupDetector", ""}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "/ {getCurrentIndex=0, getCurrentName=null, getEntryCount=1, getTypeDesc=?}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput197() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.json.JsonWriteContext", "com.fasterxml.jackson.core.json.JsonWriteContext", "writeFieldName", new String[]{"java.lang.String"}, new String[]{"aaaaaaaaaaaaaaaaaaaaaaaaaaaaa"}, false, 1, new String[][]{{"com.fasterxml.jackson.core.json.JsonWriteContext", "createChildObjectContext", ""}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "/ {getCurrentIndex=0, getCurrentName=aaaaaaaaaaaaaaaaaaaaaaaaaaaaa, getEntryCount=0, getTypeDesc=ROOT}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput198() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.json.JsonWriteContext", "com.fasterxml.jackson.core.json.JsonWriteContext", "createRootContext", new String[]{}, new String[]{}, true, 0, null, 1), new String[][]{{"writeFieldName", "java.lang.String", "7"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput199() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.json.JsonWriteContext", "com.fasterxml.jackson.core.json.JsonWriteContext", "inArray", new String[]{}, new String[]{}, false, 1, new String[][]{}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "/ {getCurrentIndex=0, getCurrentName=null, getEntryCount=0, getTypeDesc=ROOT}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput200() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.json.JsonWriteContext", "com.fasterxml.jackson.core.json.JsonWriteContext", "appendDesc", new String[]{"java.lang.StringBuilder"}, new String[]{"<sample:0>"}, false, 0, new String[][]{{"com.fasterxml.jackson.core.json.JsonWriteContext", "writeValue", ""}, {"com.fasterxml.jackson.core.json.JsonWriteContext", "writeFieldName", "java.lang.String", "1.123456799012345670"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "/ {getCurrentIndex=0, getCurrentName=1.123456799012345670, getEntryCount=1, getTypeDesc=?}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput201() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.json.JsonWriteContext", "com.fasterxml.jackson.core.json.JsonWriteContext", "writeFieldName", new String[]{"java.lang.String"}, new String[]{"5"}, false, 0, null, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "/ {getCurrentIndex=0, getCurrentName=5, getEntryCount=0, getTypeDesc=?}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput202() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.json.JsonWriteContext", "com.fasterxml.jackson.core.json.JsonWriteContext", "getParent", new String[]{}, new String[]{}, false, 0, null, 3), new String[][]{{"setCurrentValue", "java.lang.Object", "4"}, {"writeValue", "", "3"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "/ {getCurrentIndex=0, getCurrentName=null, getEntryCount=0, getTypeDesc=?}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput203() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.json.JsonWriteContext", "com.fasterxml.jackson.core.json.JsonWriteContext", "getParent", new String[]{}, new String[]{}, false, 0, null, 1), new String[][]{{"createChildArrayContext", "", "6"}});
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.core.json.JsonWriteContext", actual.getClass().getName());
  assertEquals("[0] {getCurrentIndex=0, getCurrentName=null, getEntryCount=0, getTypeDesc=ARRAY}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "/ {getCurrentIndex=0, getCurrentName=null, getEntryCount=0, getTypeDesc=?}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput204() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.json.JsonWriteContext", "com.fasterxml.jackson.core.json.JsonWriteContext", "getDupDetector", new String[]{}, new String[]{}, false, 4, new String[][]{{"com.fasterxml.jackson.core.json.JsonWriteContext", "createChildObjectContext", ""}});
  assertNull(actual);
  assertEquals("receiver state after the call", "/ {getCurrentIndex=0, getCurrentName=null, getEntryCount=0, getTypeDesc=ROOT}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput205() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.json.JsonWriteContext", "com.fasterxml.jackson.core.json.JsonWriteContext", "createChildObjectContext", new String[]{}, new String[]{}, false, 0, new String[][]{{"com.fasterxml.jackson.core.json.JsonWriteContext", "inArray", ""}}, 2), new String[][]{{"getEntryCount", "", "3"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "/ {getCurrentIndex=0, getCurrentName=null, getEntryCount=0, getTypeDesc=?}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput206() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.json.JsonWriteContext", "com.fasterxml.jackson.core.json.JsonWriteContext", "getParent", new String[]{}, new String[]{}, false, 2, new String[][]{}, 3), new String[][]{{"withDupDetector", "com.fasterxml.jackson.core.json.DupDetector", "2"}});
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.core.json.JsonWriteContext", actual.getClass().getName());
  assertEquals("/ {getCurrentIndex=0, getCurrentName=null, getEntryCount=0, getTypeDesc=ROOT}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "[0] {getCurrentIndex=0, getCurrentName=null, getEntryCount=0, getTypeDesc=ARRAY}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput207() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.json.JsonWriteContext", "com.fasterxml.jackson.core.json.JsonWriteContext", "createRootContext", new String[]{}, new String[]{}, true), new String[][]{{"writeValue", "", "6"}, {"writeFieldName", "java.lang.String", "5"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("1", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput208() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.json.JsonWriteContext", "com.fasterxml.jackson.core.json.JsonWriteContext", "getCurrentName", new String[]{}, new String[]{}, false, 0, null, 2);
  assertNull(actual);
  assertEquals("receiver state after the call", "/ {getCurrentIndex=0, getCurrentName=null, getEntryCount=0, getTypeDesc=?}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput209() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.json.JsonWriteContext", "com.fasterxml.jackson.core.json.JsonWriteContext", "createChildObjectContext", new String[]{}, new String[]{}, false, 0, new String[][]{{"com.fasterxml.jackson.core.json.JsonWriteContext", "writeFieldName", "java.lang.String", "123456789012345678901234567890"}});
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.core.json.JsonWriteContext", actual.getClass().getName());
  assertEquals("{?} {getCurrentIndex=0, getCurrentName=null, getEntryCount=0, getTypeDesc=OBJECT}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "/ {getCurrentIndex=0, getCurrentName=123456789012345678901234567890, getEntryCount=0, getTypeDesc=?}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput210() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.json.JsonWriteContext", "com.fasterxml.jackson.core.json.JsonWriteContext", "getEntryCount", new String[]{}, new String[]{}, false, 1, new String[][]{{"com.fasterxml.jackson.core.json.JsonWriteContext", "inArray", ""}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "/ {getCurrentIndex=0, getCurrentName=null, getEntryCount=0, getTypeDesc=ROOT}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput211() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.json.JsonWriteContext", "com.fasterxml.jackson.core.json.JsonWriteContext", "getParent", new String[]{}, new String[]{}, false), new String[][]{{"getParent", "", "4"}});
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.core.json.JsonWriteContext", actual.getClass().getName());
  assertEquals("{?} {getCurrentIndex=0, getCurrentName=null, getEntryCount=0, getTypeDesc=OBJECT}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "/ {getCurrentIndex=0, getCurrentName=null, getEntryCount=0, getTypeDesc=?}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput212() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.json.JsonWriteContext", "com.fasterxml.jackson.core.json.JsonWriteContext", "withDupDetector", new String[]{"com.fasterxml.jackson.core.json.DupDetector"}, new String[]{"<sample:3>"}, false), new String[][]{{"getCurrentValue", "", "4"}, {"writeValue", "", "6"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "/ {getCurrentIndex=0, getCurrentName=null, getEntryCount=1, getTypeDesc=?}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput213() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.json.JsonWriteContext", "com.fasterxml.jackson.core.json.JsonWriteContext", "writeFieldName", new String[]{"java.lang.String"}, new String[]{"I"}, false, 3, new String[][]{{"com.fasterxml.jackson.core.json.JsonWriteContext", "toString", ""}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "/ {getCurrentIndex=0, getCurrentName=I, getEntryCount=0, getTypeDesc=?}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput214() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.json.JsonWriteContext", "com.fasterxml.jackson.core.json.JsonWriteContext", "withDupDetector", new String[]{"com.fasterxml.jackson.core.json.DupDetector"}, new String[]{"<null>"}, false, 0, null, 1), new String[][]{{"getCurrentName", "", "2"}, {"writeFieldName", "java.lang.String", "7"}, {"getCurrentName", "", "3"}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("sample", String.valueOf(actual));
  assertEquals("receiver state after the call", "/ {getCurrentIndex=0, getCurrentName=sample, getEntryCount=0, getTypeDesc=?}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput215() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.json.JsonWriteContext", "com.fasterxml.jackson.core.json.JsonWriteContext", "writeValue", new String[]{}, new String[]{}, false, 1, new String[][]{}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "/ {getCurrentIndex=0, getCurrentName=null, getEntryCount=1, getTypeDesc=ROOT}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput216() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.json.JsonWriteContext", "com.fasterxml.jackson.core.json.JsonWriteContext", "getParent", new String[]{}, new String[]{}, false, 2, new String[][]{}), new String[][]{{"getCurrentName", "", "4"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "[0] {getCurrentIndex=0, getCurrentName=null, getEntryCount=0, getTypeDesc=ARRAY}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput217() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.json.JsonWriteContext", "com.fasterxml.jackson.core.json.JsonWriteContext", "getParent", new String[]{}, new String[]{}, false, 0, new String[][]{{"com.fasterxml.jackson.core.json.JsonWriteContext", "getCurrentValue", ""}}), new String[][]{{"getTypeDesc", "", "0"}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("ARRAY", String.valueOf(actual));
  assertEquals("receiver state after the call", "/ {getCurrentIndex=0, getCurrentName=null, getEntryCount=0, getTypeDesc=?}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput218() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.json.JsonWriteContext", "com.fasterxml.jackson.core.json.JsonWriteContext", "createChildObjectContext", new String[]{}, new String[]{}, false, 0, new String[][]{{"com.fasterxml.jackson.core.json.JsonWriteContext", "getCurrentValue", ""}, {"com.fasterxml.jackson.core.json.JsonWriteContext", "writeFieldName", "java.lang.String", "\u00e9Title"}}, 1);
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.core.json.JsonWriteContext", actual.getClass().getName());
  assertEquals("{?} {getCurrentIndex=0, getCurrentName=null, getEntryCount=0, getTypeDesc=OBJECT}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "/ {getCurrentIndex=0, getCurrentName=\u00e9Title, getEntryCount=0, getTypeDesc=?}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput219() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.json.JsonWriteContext", "com.fasterxml.jackson.core.json.JsonWriteContext", "withDupDetector", new String[]{"com.fasterxml.jackson.core.json.DupDetector"}, new String[]{"<sample:0>"}, false, 7, new String[][]{}, 1), new String[][]{{"writeValue", "", "3"}, {"getEntryCount", "", "1"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("1", String.valueOf(actual));
  assertEquals("receiver state after the call", "/ {getCurrentIndex=0, getCurrentName=null, getEntryCount=1, getTypeDesc=?}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput220() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.json.JsonWriteContext", "com.fasterxml.jackson.core.json.JsonWriteContext", "createRootContext", new String[]{"com.fasterxml.jackson.core.json.DupDetector"}, new String[]{"<sample:6>"}, true), new String[][]{{"getDupDetector", "", "5"}});
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.core.json.DupDetector", actual.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput221() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.json.JsonWriteContext", "com.fasterxml.jackson.core.json.JsonWriteContext", "toString", new String[]{}, new String[]{}, false, 1, new String[][]{{"com.fasterxml.jackson.core.json.JsonWriteContext", "appendDesc", "java.lang.StringBuilder", "<sample:0>"}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("/", String.valueOf(actual));
  assertEquals("receiver state after the call", "/ {getCurrentIndex=0, getCurrentName=null, getEntryCount=0, getTypeDesc=ROOT}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput222() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.json.JsonWriteContext", "com.fasterxml.jackson.core.json.JsonWriteContext", "inObject", new String[]{}, new String[]{}, false, 2, new String[][]{});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "[0] {getCurrentIndex=0, getCurrentName=null, getEntryCount=0, getTypeDesc=ARRAY}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput223() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.json.JsonWriteContext", "com.fasterxml.jackson.core.json.JsonWriteContext", "reset", new String[]{"int"}, new String[]{"-2147483648"}, false, 7, new String[][]{}), new String[][]{{"getDupDetector", "", "0"}, {"child", "", "7"}});
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.core.json.DupDetector", actual.getClass().getName());
  assertEquals("receiver state after the call", "/ {getCurrentIndex=0, getCurrentName=null, getEntryCount=0, getTypeDesc=?}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput224() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.json.JsonWriteContext", "com.fasterxml.jackson.core.json.JsonWriteContext", "createChildArrayContext", new String[]{}, new String[]{}, false, 0, new String[][]{{"com.fasterxml.jackson.core.json.JsonWriteContext", "withDupDetector", "com.fasterxml.jackson.core.json.DupDetector", "<sample:3>"}}, 3), new String[][]{{"getParent", "", "2"}});
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.core.json.JsonWriteContext", actual.getClass().getName());
  assertEquals("/ {getCurrentIndex=0, getCurrentName=null, getEntryCount=0, getTypeDesc=?}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "/ {getCurrentIndex=0, getCurrentName=null, getEntryCount=0, getTypeDesc=?}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput225() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.json.JsonWriteContext", "com.fasterxml.jackson.core.json.JsonWriteContext", "createChildObjectContext", new String[]{}, new String[]{}, false, 6, new String[][]{}, 1), new String[][]{{"writeValue", "", "0"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("5", String.valueOf(actual));
  assertEquals("receiver state after the call", "/ {getCurrentIndex=0, getCurrentName=null, getEntryCount=0, getTypeDesc=?}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput226() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.json.JsonWriteContext", "com.fasterxml.jackson.core.json.JsonWriteContext", "writeValue", new String[]{}, new String[]{}, false, 0, new String[][]{{"com.fasterxml.jackson.core.json.JsonWriteContext", "getParent", ""}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "/ {getCurrentIndex=0, getCurrentName=null, getEntryCount=1, getTypeDesc=?}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput227() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.json.JsonWriteContext", "com.fasterxml.jackson.core.json.JsonWriteContext", "getCurrentIndex", new String[]{}, new String[]{}, false, 1, new String[][]{{"com.fasterxml.jackson.core.json.JsonWriteContext", "setCurrentValue", "java.lang.Object", "<b:true>"}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "/ {getCurrentIndex=0, getCurrentName=null, getEntryCount=0, getTypeDesc=ROOT}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput228() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.json.JsonWriteContext", "com.fasterxml.jackson.core.json.JsonWriteContext", "createChildArrayContext", new String[]{}, new String[]{}, false, 1, new String[][]{{"com.fasterxml.jackson.core.json.JsonWriteContext", "createChildObjectContext", ""}}, 1), new String[][]{{"getEntryCount", "", "1"}, {"inObject", "", "3"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "/ {getCurrentIndex=0, getCurrentName=null, getEntryCount=0, getTypeDesc=ROOT}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput229() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.json.JsonWriteContext", "com.fasterxml.jackson.core.json.JsonWriteContext", "getEntryCount", new String[]{}, new String[]{}, false, 2, new String[][]{}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "[0] {getCurrentIndex=0, getCurrentName=null, getEntryCount=0, getTypeDesc=ARRAY}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput230() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.json.JsonWriteContext", "com.fasterxml.jackson.core.json.JsonWriteContext", "createChildObjectContext", new String[]{}, new String[]{}, false, 0, new String[][]{{"com.fasterxml.jackson.core.json.JsonWriteContext", "toString", ""}, {"com.fasterxml.jackson.core.json.JsonWriteContext", "writeValue", ""}}, 3), new String[][]{{"getCurrentValue", "", "6"}, {"withDupDetector", "com.fasterxml.jackson.core.json.DupDetector", "2"}});
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.core.json.JsonWriteContext", actual.getClass().getName());
  assertEquals("{?} {getCurrentIndex=0, getCurrentName=null, getEntryCount=0, getTypeDesc=OBJECT}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "/ {getCurrentIndex=0, getCurrentName=null, getEntryCount=1, getTypeDesc=?}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput231() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.json.JsonWriteContext", "com.fasterxml.jackson.core.json.JsonWriteContext", "writeFieldName", new String[]{"java.lang.String"}, new String[]{"1.12345678901234567"}, false, 3, new String[][]{}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "/ {getCurrentIndex=0, getCurrentName=1.12345678901234567, getEntryCount=0, getTypeDesc=?}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput232() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.json.JsonWriteContext", "com.fasterxml.jackson.core.json.JsonWriteContext", "getCurrentValue", new String[]{}, new String[]{}, false, 0, new String[][]{{"com.fasterxml.jackson.core.json.JsonWriteContext", "writeValue", ""}}, 2);
  assertNull(actual);
  assertEquals("receiver state after the call", "/ {getCurrentIndex=0, getCurrentName=null, getEntryCount=1, getTypeDesc=?}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput233() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.json.JsonWriteContext", "com.fasterxml.jackson.core.json.JsonWriteContext", "reset", new String[]{"int"}, new String[]{"2147483647"}, false, 0, null, 3), new String[][]{{"inArray", "", "0"}, {"setCurrentValue", "java.lang.Object", "7"}, {"writeValue", "", "0"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "/ {getCurrentIndex=0, getCurrentName=null, getEntryCount=1, getTypeDesc=?}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput234() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.json.JsonWriteContext", "com.fasterxml.jackson.core.json.JsonWriteContext", "writeFieldName", new String[]{"java.lang.String"}, new String[]{"<a>b</a>"}, false, 1, new String[][]{{"com.fasterxml.jackson.core.json.JsonWriteContext", "getCurrentName", ""}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "/ {getCurrentIndex=0, getCurrentName=<a>b</a>, getEntryCount=0, getTypeDesc=ROOT}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput235() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.json.JsonWriteContext", "com.fasterxml.jackson.core.json.JsonWriteContext", "getParent", new String[]{}, new String[]{}, false, 3, new String[][]{}), new String[][]{{"getParent", "", "6"}, {"getDupDetector", "", "6"}});
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.core.json.DupDetector", actual.getClass().getName());
  assertEquals("receiver state after the call", "/ {getCurrentIndex=0, getCurrentName=null, getEntryCount=0, getTypeDesc=?}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput236() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.json.JsonWriteContext", "com.fasterxml.jackson.core.json.JsonWriteContext", "getCurrentValue", new String[]{}, new String[]{}, false, 1, new String[][]{{"com.fasterxml.jackson.core.json.JsonWriteContext", "toString", ""}, {"com.fasterxml.jackson.core.json.JsonWriteContext", "inRoot", ""}}, 3);
  assertNull(actual);
  assertEquals("receiver state after the call", "/ {getCurrentIndex=0, getCurrentName=null, getEntryCount=0, getTypeDesc=ROOT}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput237() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.json.JsonWriteContext", "com.fasterxml.jackson.core.json.JsonWriteContext", "writeFieldName", new String[]{"java.lang.String"}, new String[]{"{"}, false, 0, new String[][]{{"com.fasterxml.jackson.core.json.JsonWriteContext", "getCurrentValue", ""}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "/ {getCurrentIndex=0, getCurrentName={, getEntryCount=0, getTypeDesc=?}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput238() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.json.JsonWriteContext", "com.fasterxml.jackson.core.json.JsonWriteContext", "reset", new String[]{"int"}, new String[]{"2"}, false, 0, null, 1), new String[][]{{"getCurrentIndex", "", "0"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{?} {getCurrentIndex=0, getCurrentName=null, getEntryCount=0, getTypeDesc=OBJECT}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput239() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.json.JsonWriteContext", "com.fasterxml.jackson.core.json.JsonWriteContext", "createRootContext", new String[]{"com.fasterxml.jackson.core.json.DupDetector"}, new String[]{"<sample:2>"}, true, 0, null, 3), new String[][]{{"getDupDetector", "", "0"}, {"reset", "", "0"}});
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.core.json.DupDetector", actual.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput240() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.json.JsonWriteContext", "com.fasterxml.jackson.core.json.JsonWriteContext", "withDupDetector", new String[]{"com.fasterxml.jackson.core.json.DupDetector"}, new String[]{"<sample:8>"}, false, 0, null, 1), new String[][]{{"writeFieldName", "java.lang.String", "2"}, {"setCurrentValue", "java.lang.Object", "6"}, {"writeValue", "", "3"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "/ {getCurrentIndex=0, getCurrentName=0, getEntryCount=1, getTypeDesc=?}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput241() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.json.JsonWriteContext", "com.fasterxml.jackson.core.json.JsonWriteContext", "createChildArrayContext", new String[]{}, new String[]{}, false, 0, new String[][]{{"com.fasterxml.jackson.core.json.JsonWriteContext", "getParent", ""}}, 1), new String[][]{{"writeFieldName", "java.lang.String", "6"}, {"writeFieldName", "java.lang.String", "2"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("4", String.valueOf(actual));
  assertEquals("receiver state after the call", "/ {getCurrentIndex=0, getCurrentName=null, getEntryCount=0, getTypeDesc=?}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput242() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.json.JsonWriteContext", "com.fasterxml.jackson.core.json.JsonWriteContext", "withDupDetector", new String[]{"com.fasterxml.jackson.core.json.DupDetector"}, new String[]{"<sample:0>"}, false), new String[][]{{"getCurrentValue", "", "4"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "/ {getCurrentIndex=0, getCurrentName=null, getEntryCount=0, getTypeDesc=?}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput243() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.json.JsonWriteContext", "com.fasterxml.jackson.core.json.JsonWriteContext", "createRootContext", new String[]{"com.fasterxml.jackson.core.json.DupDetector"}, new String[]{"<sample:4>"}, true, 0, null, 1), new String[][]{{"writeFieldName", "java.lang.String", "2"}, {"getTypeDesc", "", "0"}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("ROOT", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput244() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.json.JsonWriteContext", "com.fasterxml.jackson.core.json.JsonWriteContext", "createRootContext", new String[]{}, new String[]{}, true), new String[][]{{"createChildArrayContext", "", "2"}});
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.core.json.JsonWriteContext", actual.getClass().getName());
  assertEquals("[0] {getCurrentIndex=0, getCurrentName=null, getEntryCount=0, getTypeDesc=ARRAY}", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput245() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.json.JsonWriteContext", "com.fasterxml.jackson.core.json.JsonWriteContext", "withDupDetector", new String[]{"com.fasterxml.jackson.core.json.DupDetector"}, new String[]{"<sample:8>"}, false), new String[][]{{"writeFieldName", "java.lang.String", "0"}, {"createChildArrayContext", "", "0"}});
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.core.json.JsonWriteContext", actual.getClass().getName());
  assertEquals("[0] {getCurrentIndex=0, getCurrentName=null, getEntryCount=0, getTypeDesc=ARRAY}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "/ {getCurrentIndex=0, getCurrentName=, getEntryCount=0, getTypeDesc=?}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput246() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.json.JsonWriteContext", "com.fasterxml.jackson.core.json.JsonWriteContext", "createChildArrayContext", new String[]{}, new String[]{}, false, 0, null, 1), new String[][]{{"writeFieldName", "java.lang.String", "6"}, {"getCurrentValue", "", "3"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "/ {getCurrentIndex=0, getCurrentName=null, getEntryCount=0, getTypeDesc=?}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput247() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.json.JsonWriteContext", "com.fasterxml.jackson.core.json.JsonWriteContext", "createChildObjectContext", new String[]{}, new String[]{}, false, 0, new String[][]{{"com.fasterxml.jackson.core.json.JsonWriteContext", "getDupDetector", ""}}, 3), new String[][]{{"inObject", "", "7"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
  assertEquals("receiver state after the call", "/ {getCurrentIndex=0, getCurrentName=null, getEntryCount=0, getTypeDesc=?}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput248() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.json.JsonWriteContext", "com.fasterxml.jackson.core.json.JsonWriteContext", "withDupDetector", new String[]{"com.fasterxml.jackson.core.json.DupDetector"}, new String[]{"<sample:6>"}, false, 0, null, 3), new String[][]{{"getEntryCount", "", "0"}, {"inRoot", "", "4"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "/ {getCurrentIndex=0, getCurrentName=null, getEntryCount=0, getTypeDesc=?}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput249() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.json.JsonWriteContext", "com.fasterxml.jackson.core.json.JsonWriteContext", "createChildArrayContext", new String[]{}, new String[]{}, false, 2, new String[][]{{"com.fasterxml.jackson.core.json.JsonWriteContext", "writeFieldName", "java.lang.String", "-.5"}, {"com.fasterxml.jackson.core.json.JsonWriteContext", "toString", ""}}), new String[][]{{"setCurrentValue", "java.lang.Object", "7"}});
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.core.json.JsonWriteContext", actual.getClass().getName());
  assertEquals("[0] {getCurrentIndex=0, getCurrentName=null, getEntryCount=0, getTypeDesc=ARRAY}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "[0] {getCurrentIndex=0, getCurrentName=-.5, getEntryCount=0, getTypeDesc=ARRAY}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput250() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.json.JsonWriteContext", "com.fasterxml.jackson.core.json.JsonWriteContext", "createRootContext", new String[]{}, new String[]{}, true, 0, null, 3), new String[][]{{"inRoot", "", "0"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput251() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.json.JsonWriteContext", "com.fasterxml.jackson.core.json.JsonWriteContext", "createChildObjectContext", new String[]{}, new String[]{}, false, 0, new String[][]{{"com.fasterxml.jackson.core.json.JsonWriteContext", "getCurrentIndex", ""}}, 2), new String[][]{{"getParent", "", "3"}});
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.core.json.JsonWriteContext", actual.getClass().getName());
  assertEquals("/ {getCurrentIndex=0, getCurrentName=null, getEntryCount=0, getTypeDesc=?}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "/ {getCurrentIndex=0, getCurrentName=null, getEntryCount=0, getTypeDesc=?}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput252() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.json.JsonWriteContext", "com.fasterxml.jackson.core.json.JsonWriteContext", "createChildObjectContext", new String[]{}, new String[]{}, false, 0, null, 3), new String[][]{{"writeFieldName", "java.lang.String", "0"}, {"writeValue", "", "0"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("2", String.valueOf(actual));
  assertEquals("receiver state after the call", "/ {getCurrentIndex=0, getCurrentName=null, getEntryCount=0, getTypeDesc=?}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput253() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.json.JsonWriteContext", "com.fasterxml.jackson.core.json.JsonWriteContext", "getCurrentName", new String[]{}, new String[]{}, false, 0, new String[][]{{"com.fasterxml.jackson.core.json.JsonWriteContext", "getEntryCount", ""}, {"com.fasterxml.jackson.core.json.JsonWriteContext", "reset", "int", "2"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{?} {getCurrentIndex=0, getCurrentName=null, getEntryCount=0, getTypeDesc=OBJECT}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput254() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.json.JsonWriteContext", "com.fasterxml.jackson.core.json.JsonWriteContext", "withDupDetector", new String[]{"com.fasterxml.jackson.core.json.DupDetector"}, new String[]{"<sample:4>"}, false, 0, new String[][]{{"com.fasterxml.jackson.core.json.JsonWriteContext", "getParent", ""}}, 3), new String[][]{{"setCurrentValue", "java.lang.Object", "6"}});
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.core.json.JsonWriteContext", actual.getClass().getName());
  assertEquals("/ {getCurrentIndex=0, getCurrentName=null, getEntryCount=0, getTypeDesc=?}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "/ {getCurrentIndex=0, getCurrentName=null, getEntryCount=0, getTypeDesc=?}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput255() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.json.JsonWriteContext", "com.fasterxml.jackson.core.json.JsonWriteContext", "setCurrentValue", new String[]{"java.lang.Object"}, new String[]{"<s::>"}, false, 0, null, 3);
  assertNull(actual);
  assertEquals("receiver state after the call", "/ {getCurrentIndex=0, getCurrentName=null, getEntryCount=0, getTypeDesc=?}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput256() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.json.JsonWriteContext", "com.fasterxml.jackson.core.json.JsonWriteContext", "createRootContext", new String[]{}, new String[]{}, true, 0, null, 2), new String[][]{{"getDupDetector", "", "7"}});
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput257() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.json.JsonWriteContext", "com.fasterxml.jackson.core.json.JsonWriteContext", "getCurrentIndex", new String[]{}, new String[]{}, false, 2, new String[][]{{"com.fasterxml.jackson.core.json.JsonWriteContext", "inRoot", ""}, {"com.fasterxml.jackson.core.json.JsonWriteContext", "getCurrentIndex", ""}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "[0] {getCurrentIndex=0, getCurrentName=null, getEntryCount=0, getTypeDesc=ARRAY}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput258() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.json.JsonWriteContext", "com.fasterxml.jackson.core.json.JsonWriteContext", "createRootContext", new String[]{}, new String[]{}, true, 0, null, 3), new String[][]{{"getCurrentName", "", "7"}});
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput259() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.json.JsonWriteContext", "com.fasterxml.jackson.core.json.JsonWriteContext", "writeValue", new String[]{}, new String[]{}, false, 2, new String[][]{});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "[0] {getCurrentIndex=0, getCurrentName=null, getEntryCount=1, getTypeDesc=ARRAY}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput260() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.json.JsonWriteContext", "com.fasterxml.jackson.core.json.JsonWriteContext", "getCurrentValue", new String[]{}, new String[]{}, false, 0, new String[][]{{"com.fasterxml.jackson.core.json.JsonWriteContext", "setCurrentValue", "java.lang.Object", "<d:0.15>"}, {"com.fasterxml.jackson.core.json.JsonWriteContext", "getParent", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("0.15", String.valueOf(actual));
  assertEquals("receiver state after the call", "/ {getCurrentIndex=0, getCurrentName=null, getEntryCount=0, getTypeDesc=?}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput261() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.json.JsonWriteContext", "com.fasterxml.jackson.core.json.JsonWriteContext", "createRootContext", new String[]{"com.fasterxml.jackson.core.json.DupDetector"}, new String[]{"<sample:8>"}, true, 0, null, 3), new String[][]{{"getCurrentIndex", "", "2"}, {"inRoot", "", "3"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput262() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.json.JsonWriteContext", "com.fasterxml.jackson.core.json.JsonWriteContext", "getTypeDesc", new String[]{}, new String[]{}, false, 0, new String[][]{{"com.fasterxml.jackson.core.json.JsonWriteContext", "writeValue", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("?", String.valueOf(actual));
  assertEquals("receiver state after the call", "/ {getCurrentIndex=0, getCurrentName=null, getEntryCount=1, getTypeDesc=?}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput263() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.json.JsonWriteContext", "com.fasterxml.jackson.core.json.JsonWriteContext", "getParent", new String[]{}, new String[]{}, false, 7, new String[][]{}, 2);
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.core.json.JsonWriteContext", actual.getClass().getName());
  assertEquals("/ {getCurrentIndex=0, getCurrentName=null, getEntryCount=0, getTypeDesc=?}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "/ {getCurrentIndex=0, getCurrentName=null, getEntryCount=0, getTypeDesc=?}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput264() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.json.JsonWriteContext", "com.fasterxml.jackson.core.json.JsonWriteContext", "createChildArrayContext", new String[]{}, new String[]{}, false, 0, new String[][]{{"com.fasterxml.jackson.core.json.JsonWriteContext", "getTypeDesc", ""}}, 3);
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.core.json.JsonWriteContext", actual.getClass().getName());
  assertEquals("[0] {getCurrentIndex=0, getCurrentName=null, getEntryCount=0, getTypeDesc=ARRAY}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "/ {getCurrentIndex=0, getCurrentName=null, getEntryCount=0, getTypeDesc=?}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput265() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.json.JsonWriteContext", "com.fasterxml.jackson.core.json.JsonWriteContext", "inObject", new String[]{}, new String[]{}, false, 0, null, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "/ {getCurrentIndex=0, getCurrentName=null, getEntryCount=0, getTypeDesc=?}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput266() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.json.JsonWriteContext", "com.fasterxml.jackson.core.json.JsonWriteContext", "writeFieldName", new String[]{"java.lang.String"}, new String[]{"1.134567890123456"}, false, 0, null, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "/ {getCurrentIndex=0, getCurrentName=1.134567890123456, getEntryCount=0, getTypeDesc=?}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput267() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.json.JsonWriteContext", "com.fasterxml.jackson.core.json.JsonWriteContext", "getTypeDesc", new String[]{}, new String[]{}, false, 4, new String[][]{}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("ROOT", String.valueOf(actual));
  assertEquals("receiver state after the call", "/ {getCurrentIndex=0, getCurrentName=null, getEntryCount=0, getTypeDesc=ROOT}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput268() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.json.JsonWriteContext", "com.fasterxml.jackson.core.json.JsonWriteContext", "getEntryCount", new String[]{}, new String[]{}, false, 0, new String[][]{{"com.fasterxml.jackson.core.json.JsonWriteContext", "getCurrentValue", ""}, {"com.fasterxml.jackson.core.json.JsonWriteContext", "getDupDetector", ""}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "/ {getCurrentIndex=0, getCurrentName=null, getEntryCount=0, getTypeDesc=?}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput269() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.json.JsonWriteContext", "com.fasterxml.jackson.core.json.JsonWriteContext", "withDupDetector", new String[]{"com.fasterxml.jackson.core.json.DupDetector"}, new String[]{"<sample:8>"}, false, 7, new String[][]{}, 1), new String[][]{{"inRoot", "", "7"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "/ {getCurrentIndex=0, getCurrentName=null, getEntryCount=0, getTypeDesc=?}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput270() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.json.JsonWriteContext", "com.fasterxml.jackson.core.json.JsonWriteContext", "appendDesc", new String[]{"java.lang.StringBuilder"}, new String[]{"<sample:2>"}, false, 0, new String[][]{{"com.fasterxml.jackson.core.json.JsonWriteContext", "writeFieldName", "java.lang.String", "/a/b0x1F"}, {"com.fasterxml.jackson.core.json.JsonWriteContext", "getCurrentName", ""}}, 1);
  assertNull(actual);
  assertEquals("receiver state after the call", "/ {getCurrentIndex=0, getCurrentName=/a/b0x1F, getEntryCount=0, getTypeDesc=?}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput271() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.json.JsonWriteContext", "com.fasterxml.jackson.core.json.JsonWriteContext", "withDupDetector", new String[]{"com.fasterxml.jackson.core.json.DupDetector"}, new String[]{"<sample:2>"}, false, 0, new String[][]{{"com.fasterxml.jackson.core.json.JsonWriteContext", "getEntryCount", ""}}), new String[][]{{"inRoot", "", "5"}, {"inRoot", "", "2"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "/ {getCurrentIndex=0, getCurrentName=null, getEntryCount=0, getTypeDesc=?}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput272() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.json.JsonWriteContext", "com.fasterxml.jackson.core.json.JsonWriteContext", "getEntryCount", new String[]{}, new String[]{}, false, 0, null, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "/ {getCurrentIndex=0, getCurrentName=null, getEntryCount=0, getTypeDesc=?}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput273() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.json.JsonWriteContext", "com.fasterxml.jackson.core.json.JsonWriteContext", "withDupDetector", new String[]{"com.fasterxml.jackson.core.json.DupDetector"}, new String[]{"<sample:4>"}, false, 0, null, 2), new String[][]{{"createChildObjectContext", "", "2"}});
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.core.json.JsonWriteContext", actual.getClass().getName());
  assertEquals("{?} {getCurrentIndex=0, getCurrentName=null, getEntryCount=0, getTypeDesc=OBJECT}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "/ {getCurrentIndex=0, getCurrentName=null, getEntryCount=0, getTypeDesc=?}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput274() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.json.JsonWriteContext", "com.fasterxml.jackson.core.json.JsonWriteContext", "createRootContext", new String[]{}, new String[]{}, true, 0, null, 3), new String[][]{{"getTypeDesc", "", "2"}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("ROOT", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput275() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.json.JsonWriteContext", "com.fasterxml.jackson.core.json.JsonWriteContext", "createChildArrayContext", new String[]{}, new String[]{}, false, 0, null, 1), new String[][]{{"inObject", "", "3"}, {"getDupDetector", "", "2"}});
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.core.json.DupDetector", actual.getClass().getName());
  assertEquals("receiver state after the call", "/ {getCurrentIndex=0, getCurrentName=null, getEntryCount=0, getTypeDesc=?}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput276() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.json.JsonWriteContext", "com.fasterxml.jackson.core.json.JsonWriteContext", "toString", new String[]{}, new String[]{}, false, 0, null, 2);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("/", String.valueOf(actual));
  assertEquals("receiver state after the call", "/ {getCurrentIndex=0, getCurrentName=null, getEntryCount=0, getTypeDesc=?}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput277() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.json.JsonWriteContext", "com.fasterxml.jackson.core.json.JsonWriteContext", "reset", new String[]{"int"}, new String[]{"-2147483648"}, false, 0, new String[][]{{"com.fasterxml.jackson.core.json.JsonWriteContext", "reset", "int", "-2147483648"}}, 2), new String[][]{{"setCurrentValue", "java.lang.Object", "2"}});
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.core.json.JsonWriteContext", actual.getClass().getName());
  assertEquals("/ {getCurrentIndex=0, getCurrentName=null, getEntryCount=0, getTypeDesc=?}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "/ {getCurrentIndex=0, getCurrentName=null, getEntryCount=0, getTypeDesc=?}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput278() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.json.JsonWriteContext", "com.fasterxml.jackson.core.json.JsonWriteContext", "getParent", new String[]{}, new String[]{}, false, 0, null, 3), new String[][]{{"getTypeDesc", "", "7"}, {"createChildObjectContext", "", "0"}, {"inRoot", "", "3"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "/ {getCurrentIndex=0, getCurrentName=null, getEntryCount=0, getTypeDesc=?}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput279() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.json.JsonWriteContext", "com.fasterxml.jackson.core.json.JsonWriteContext", "appendDesc", new String[]{"java.lang.StringBuilder"}, new String[]{"<sample:3>"}, false, 0, new String[][]{{"com.fasterxml.jackson.core.json.JsonWriteContext", "reset", "int", "1"}}, 3);
  assertNull(actual);
  assertEquals("receiver state after the call", "[0] {getCurrentIndex=0, getCurrentName=null, getEntryCount=0, getTypeDesc=ARRAY}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput280() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.json.JsonWriteContext", "com.fasterxml.jackson.core.json.JsonWriteContext", "createChildArrayContext", new String[]{}, new String[]{}, false, 4, new String[][]{{"com.fasterxml.jackson.core.json.JsonWriteContext", "getParent", ""}}, 3);
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.core.json.JsonWriteContext", actual.getClass().getName());
  assertEquals("[0] {getCurrentIndex=0, getCurrentName=null, getEntryCount=0, getTypeDesc=ARRAY}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "/ {getCurrentIndex=0, getCurrentName=null, getEntryCount=0, getTypeDesc=ROOT}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput281() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.json.JsonWriteContext", "com.fasterxml.jackson.core.json.JsonWriteContext", "reset", new String[]{"int"}, new String[]{"0"}, false, 5, new String[][]{{"com.fasterxml.jackson.core.json.JsonWriteContext", "inObject", ""}}), new String[][]{{"inObject", "", "7"}, {"inRoot", "", "0"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
  assertEquals("receiver state after the call", "/ {getCurrentIndex=0, getCurrentName=null, getEntryCount=0, getTypeDesc=ROOT}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput282() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.json.JsonWriteContext", "com.fasterxml.jackson.core.json.JsonWriteContext", "getDupDetector", new String[]{}, new String[]{}, false, 4, new String[][]{}, 1);
  assertNull(actual);
  assertEquals("receiver state after the call", "/ {getCurrentIndex=0, getCurrentName=null, getEntryCount=0, getTypeDesc=ROOT}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput283() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.json.JsonWriteContext", "com.fasterxml.jackson.core.json.JsonWriteContext", "getTypeDesc", new String[]{}, new String[]{}, false, 0, new String[][]{{"com.fasterxml.jackson.core.json.JsonWriteContext", "writeFieldName", "java.lang.String", "0xx1F"}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("?", String.valueOf(actual));
  assertEquals("receiver state after the call", "/ {getCurrentIndex=0, getCurrentName=0xx1F, getEntryCount=0, getTypeDesc=?}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput284() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.json.JsonWriteContext", "com.fasterxml.jackson.core.json.JsonWriteContext", "writeFieldName", new String[]{"java.lang.String"}, new String[]{"1.5"}, false, 0, null, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "/ {getCurrentIndex=0, getCurrentName=1.5, getEntryCount=0, getTypeDesc=?}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput285() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.json.JsonWriteContext", "com.fasterxml.jackson.core.json.JsonWriteContext", "createChildArrayContext", new String[]{}, new String[]{}, false, 2, new String[][]{{"com.fasterxml.jackson.core.json.JsonWriteContext", "inObject", ""}}, 3);
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.core.json.JsonWriteContext", actual.getClass().getName());
  assertEquals("[0] {getCurrentIndex=0, getCurrentName=null, getEntryCount=0, getTypeDesc=ARRAY}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "[0] {getCurrentIndex=0, getCurrentName=null, getEntryCount=0, getTypeDesc=ARRAY}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput286() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.json.JsonWriteContext", "com.fasterxml.jackson.core.json.JsonWriteContext", "createChildArrayContext", new String[]{}, new String[]{}, false, 0, new String[][]{{"com.fasterxml.jackson.core.json.JsonWriteContext", "reset", "int", "1"}}, 1), new String[][]{{"inArray", "", "4"}, {"inArray", "", "6"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
  assertEquals("receiver state after the call", "[0] {getCurrentIndex=0, getCurrentName=null, getEntryCount=0, getTypeDesc=ARRAY}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput287() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.json.JsonWriteContext", "com.fasterxml.jackson.core.json.JsonWriteContext", "setCurrentValue", new String[]{"java.lang.Object"}, new String[]{"<i:0>"}, false, 0, new String[][]{{"com.fasterxml.jackson.core.json.JsonWriteContext", "writeFieldName", "java.lang.String", "b"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "/ {getCurrentIndex=0, getCurrentName=b, getEntryCount=0, getTypeDesc=?}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput288() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.json.JsonWriteContext", "com.fasterxml.jackson.core.json.JsonWriteContext", "createRootContext", new String[]{}, new String[]{}, true, 0, null, 2), new String[][]{{"withDupDetector", "com.fasterxml.jackson.core.json.DupDetector", "4"}, {"writeValue", "", "3"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput289() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.json.JsonWriteContext", "com.fasterxml.jackson.core.json.JsonWriteContext", "withDupDetector", new String[]{"com.fasterxml.jackson.core.json.DupDetector"}, new String[]{"<sample:2>"}, false), new String[][]{{"writeValue", "", "3"}, {"writeValue", "", "3"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("3", String.valueOf(actual));
  assertEquals("receiver state after the call", "/ {getCurrentIndex=1, getCurrentName=null, getEntryCount=2, getTypeDesc=?}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput290() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.json.JsonWriteContext", "com.fasterxml.jackson.core.json.JsonWriteContext", "createRootContext", new String[]{}, new String[]{}, true, 0, null, 3), new String[][]{{"writeFieldName", "java.lang.String", "7"}, {"writeFieldName", "java.lang.String", "5"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("4", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput291() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.json.JsonWriteContext", "com.fasterxml.jackson.core.json.JsonWriteContext", "createRootContext", new String[]{}, new String[]{}, true, 0, null, 3), new String[][]{{"writeValue", "", "1"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput292() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.json.JsonWriteContext", "com.fasterxml.jackson.core.json.JsonWriteContext", "withDupDetector", new String[]{"com.fasterxml.jackson.core.json.DupDetector"}, new String[]{"<sample:7>"}, false, 0, new String[][]{{"com.fasterxml.jackson.core.json.JsonWriteContext", "createChildArrayContext", ""}}, 2), new String[][]{{"writeValue", "", "0"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "/ {getCurrentIndex=0, getCurrentName=null, getEntryCount=1, getTypeDesc=?}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput293() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.json.JsonWriteContext", "com.fasterxml.jackson.core.json.JsonWriteContext", "createChildArrayContext", new String[]{}, new String[]{}, false, 0, new String[][]{{"com.fasterxml.jackson.core.json.JsonWriteContext", "toString", ""}}, 3), new String[][]{{"getCurrentName", "", "0"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "/ {getCurrentIndex=0, getCurrentName=null, getEntryCount=0, getTypeDesc=?}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput294() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.json.JsonWriteContext", "com.fasterxml.jackson.core.json.JsonWriteContext", "createRootContext", new String[]{}, new String[]{}, true, 0, null, 3), new String[][]{{"getEntryCount", "", "4"}, {"withDupDetector", "com.fasterxml.jackson.core.json.DupDetector", "6"}, {"getDupDetector", "", "0"}});
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.core.json.DupDetector", actual.getClass().getName());
 }
}
