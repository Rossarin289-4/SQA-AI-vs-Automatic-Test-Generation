package generated.algorithm;

import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;
import static org.junit.Assert.*;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class SimulatedAnnealingGeneratedTest {
 @Test(timeout = 20000)
 public void generatedInput000() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.json.JsonWriteContext", "com.fasterxml.jackson.core.json.JsonWriteContext", "createChildObjectContext", new String[]{}, new String[]{}, false, 15, new String[][]{{"com.fasterxml.jackson.core.json.JsonWriteContext", "inObject", ""}, {"com.fasterxml.jackson.core.json.JsonWriteContext", "createChildObjectContext", ""}}, 1), new String[][]{{"inArray", "", "3"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "/ {getCurrentIndex=0, getCurrentName=null, getEntryCount=0, getTypeDesc=?}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput001() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.json.JsonWriteContext", "com.fasterxml.jackson.core.json.JsonWriteContext", "getDupDetector", new String[]{}, new String[]{}, false, 3, new String[][]{{"com.fasterxml.jackson.core.json.JsonWriteContext", "writeFieldName", "java.lang.String", "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaa"}, {"com.fasterxml.jackson.core.json.JsonWriteContext", "writeFieldName", "java.lang.String", "0x1F"}, {"com.fasterxml.jackson.core.json.JsonWriteContext", "getParent", ""}}), new String[][]{{"reset", "", "1"}, {"reset", "", "7"}});
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.core.json.DupDetector", actual.getClass().getName());
  assertEquals("receiver state after the call", "/ {getCurrentIndex=0, getCurrentName=aaaaaaaaaaaaaaaaaaaaaaaaaaaaaa, getEntryCount=0, getTypeDesc=?}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput002() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.json.JsonWriteContext", "com.fasterxml.jackson.core.json.JsonWriteContext", "writeValue", new String[]{}, new String[]{}, false, 0, new String[][]{{"com.fasterxml.jackson.core.json.JsonWriteContext", "writeValue", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("3", String.valueOf(actual));
  assertEquals("receiver state after the call", "/ {getCurrentIndex=1, getCurrentName=null, getEntryCount=2, getTypeDesc=?}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput003() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.json.JsonWriteContext", "com.fasterxml.jackson.core.json.JsonWriteContext", "writeValue", new String[]{}, new String[]{}, false, 2, new String[][]{{"com.fasterxml.jackson.core.json.JsonWriteContext", "writeValue", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("1", String.valueOf(actual));
  assertEquals("receiver state after the call", "[1] {getCurrentIndex=1, getCurrentName=null, getEntryCount=2, getTypeDesc=ARRAY}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput004() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.json.JsonWriteContext", "com.fasterxml.jackson.core.json.JsonWriteContext", "createChildArrayContext", new String[]{}, new String[]{}, false, 16, new String[][]{{"com.fasterxml.jackson.core.json.JsonWriteContext", "createChildObjectContext", ""}}, 2), new String[][]{{"writeFieldName", "java.lang.String", "4"}, {"writeValue", "", "0"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "/ {getCurrentIndex=0, getCurrentName=null, getEntryCount=0, getTypeDesc=ROOT}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput005() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.json.JsonWriteContext", "com.fasterxml.jackson.core.json.JsonWriteContext", "setCurrentValue", new String[]{"java.lang.Object"}, new String[]{"<s:>"}, false, 3, new String[][]{{"com.fasterxml.jackson.core.json.JsonWriteContext", "getCurrentValue", ""}, {"com.fasterxml.jackson.core.json.JsonWriteContext", "writeValue", ""}, {"com.fasterxml.jackson.core.json.JsonWriteContext", "writeFieldName", "java.lang.String", "124f456789012345678901234567890"}}, 1);
  assertNull(actual);
  assertEquals("receiver state after the call", "/ {getCurrentIndex=0, getCurrentName=124f456789012345678901234567890, getEntryCount=1, getTypeDesc=?}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput006() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.json.JsonWriteContext", "com.fasterxml.jackson.core.json.JsonWriteContext", "getParent", new String[]{}, new String[]{}, false, 2, new String[][]{{"com.fasterxml.jackson.core.json.JsonWriteContext", "writeValue", ""}, {"com.fasterxml.jackson.core.json.JsonWriteContext", "getCurrentIndex", ""}, {"com.fasterxml.jackson.core.json.JsonWriteContext", "toString", ""}}, 2), new String[][]{{"createChildObjectContext", "", "1"}});
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.core.json.JsonWriteContext", actual.getClass().getName());
  assertEquals("{?} {getCurrentIndex=0, getCurrentName=null, getEntryCount=0, getTypeDesc=OBJECT}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "[0] {getCurrentIndex=0, getCurrentName=null, getEntryCount=1, getTypeDesc=ARRAY}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput007() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.json.JsonWriteContext", "com.fasterxml.jackson.core.json.JsonWriteContext", "reset", new String[]{"int"}, new String[]{"2"}, false, 14, new String[][]{{"com.fasterxml.jackson.core.json.JsonWriteContext", "createChildArrayContext", ""}, {"com.fasterxml.jackson.core.json.JsonWriteContext", "inRoot", ""}}, 3), new String[][]{{"writeFieldName", "java.lang.String", "3"}, {"writeValue", "", "7"}, {"writeValue", "", "0"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("5", String.valueOf(actual));
  assertEquals("receiver state after the call", "{\"sample\"} {getCurrentIndex=0, getCurrentName=sample, getEntryCount=1, getTypeDesc=OBJECT}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput008() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.json.JsonWriteContext", "com.fasterxml.jackson.core.json.JsonWriteContext", "createChildArrayContext", new String[]{}, new String[]{}, false, 16, new String[][]{{"com.fasterxml.jackson.core.json.JsonWriteContext", "writeFieldName", "java.lang.String", "123456689012245678901234567890"}}, 2), new String[][]{{"withDupDetector", "com.fasterxml.jackson.core.json.DupDetector", "5"}, {"createChildObjectContext", "", "5"}});
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.core.json.JsonWriteContext", actual.getClass().getName());
  assertEquals("{?} {getCurrentIndex=0, getCurrentName=null, getEntryCount=0, getTypeDesc=OBJECT}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "/ {getCurrentIndex=0, getCurrentName=123456689012245678901234567890, getEntryCount=0, getTypeDesc=ROOT}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput009() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.json.JsonWriteContext", "com.fasterxml.jackson.core.json.JsonWriteContext", "getCurrentIndex", new String[]{}, new String[]{}, false, 7, new String[][]{{"com.fasterxml.jackson.core.json.JsonWriteContext", "inObject", ""}, {"com.fasterxml.jackson.core.json.JsonWriteContext", "getTypeDesc", ""}, {"com.fasterxml.jackson.core.json.JsonWriteContext", "writeFieldName", "java.lang.String", "1.5"}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "/ {getCurrentIndex=0, getCurrentName=1.5, getEntryCount=0, getTypeDesc=?}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput010() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.json.JsonWriteContext", "com.fasterxml.jackson.core.json.JsonWriteContext", "getCurrentIndex", new String[]{}, new String[]{}, false, 16, new String[][]{}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "/ {getCurrentIndex=0, getCurrentName=null, getEntryCount=0, getTypeDesc=ROOT}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput011() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.json.JsonWriteContext", "com.fasterxml.jackson.core.json.JsonWriteContext", "getCurrentIndex", new String[]{}, new String[]{}, false, 17, new String[][]{}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "/ {getCurrentIndex=0, getCurrentName=null, getEntryCount=0, getTypeDesc=?}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput012() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.json.JsonWriteContext", "com.fasterxml.jackson.core.json.JsonWriteContext", "getTypeDesc", new String[]{}, new String[]{}, false, 0, null, 1);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("?", String.valueOf(actual));
  assertEquals("receiver state after the call", "/ {getCurrentIndex=0, getCurrentName=null, getEntryCount=0, getTypeDesc=?}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput013() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.json.JsonWriteContext", "com.fasterxml.jackson.core.json.JsonWriteContext", "getTypeDesc", new String[]{}, new String[]{}, false, 1, new String[][]{}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("ROOT", String.valueOf(actual));
  assertEquals("receiver state after the call", "/ {getCurrentIndex=0, getCurrentName=null, getEntryCount=0, getTypeDesc=ROOT}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput014() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.json.JsonWriteContext", "com.fasterxml.jackson.core.json.JsonWriteContext", "getTypeDesc", new String[]{}, new String[]{}, false, 2, new String[][]{}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("ARRAY", String.valueOf(actual));
  assertEquals("receiver state after the call", "[0] {getCurrentIndex=0, getCurrentName=null, getEntryCount=0, getTypeDesc=ARRAY}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput015() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.json.JsonWriteContext", "com.fasterxml.jackson.core.json.JsonWriteContext", "getCurrentIndex", new String[]{}, new String[]{}, false, 0, new String[][]{{"com.fasterxml.jackson.core.json.JsonWriteContext", "setCurrentValue", "java.lang.Object", "<sample:1>"}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "/ {getCurrentIndex=0, getCurrentName=null, getEntryCount=0, getTypeDesc=?}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput016() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.json.JsonWriteContext", "com.fasterxml.jackson.core.json.JsonWriteContext", "getCurrentIndex", new String[]{}, new String[]{}, false, 1, new String[][]{}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "/ {getCurrentIndex=0, getCurrentName=null, getEntryCount=0, getTypeDesc=ROOT}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput017() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.json.JsonWriteContext", "com.fasterxml.jackson.core.json.JsonWriteContext", "getCurrentIndex", new String[]{}, new String[]{}, false, 2, new String[][]{{"com.fasterxml.jackson.core.json.JsonWriteContext", "getTypeDesc", ""}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "[0] {getCurrentIndex=0, getCurrentName=null, getEntryCount=0, getTypeDesc=ARRAY}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput018() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.json.JsonWriteContext", "com.fasterxml.jackson.core.json.JsonWriteContext", "createRootContext", new String[]{"com.fasterxml.jackson.core.json.DupDetector"}, new String[]{"<sample:7>"}, true, 0, null, 3);
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.core.json.JsonWriteContext", actual.getClass().getName());
  assertEquals("/ {getCurrentIndex=0, getCurrentName=null, getEntryCount=0, getTypeDesc=ROOT}", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput019() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.json.JsonWriteContext", "com.fasterxml.jackson.core.json.JsonWriteContext", "createRootContext", new String[]{"com.fasterxml.jackson.core.json.DupDetector"}, new String[]{"<sample:7>"}, true, 0, null, 3), new String[][]{{"getParent", "", "3"}});
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput020() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.json.JsonWriteContext", "com.fasterxml.jackson.core.json.JsonWriteContext", "getEntryCount", new String[]{}, new String[]{}, false, 1, new String[][]{}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "/ {getCurrentIndex=0, getCurrentName=null, getEntryCount=0, getTypeDesc=ROOT}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput021() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.json.JsonWriteContext", "com.fasterxml.jackson.core.json.JsonWriteContext", "inRoot", new String[]{}, new String[]{}, false, 4, new String[][]{{"com.fasterxml.jackson.core.json.JsonWriteContext", "toString", ""}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
  assertEquals("receiver state after the call", "/ {getCurrentIndex=0, getCurrentName=null, getEntryCount=0, getTypeDesc=ROOT}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput022() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.json.JsonWriteContext", "com.fasterxml.jackson.core.json.JsonWriteContext", "inRoot", new String[]{}, new String[]{}, false, 5, new String[][]{{"com.fasterxml.jackson.core.json.JsonWriteContext", "getEntryCount", ""}, {"com.fasterxml.jackson.core.json.JsonWriteContext", "getEntryCount", ""}, {"com.fasterxml.jackson.core.json.JsonWriteContext", "toString", ""}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "/ {getCurrentIndex=0, getCurrentName=null, getEntryCount=0, getTypeDesc=?}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput023() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.json.JsonWriteContext", "com.fasterxml.jackson.core.json.JsonWriteContext", "inRoot", new String[]{}, new String[]{}, false, 2, new String[][]{{"com.fasterxml.jackson.core.json.JsonWriteContext", "getEntryCount", ""}, {"com.fasterxml.jackson.core.json.JsonWriteContext", "getEntryCount", ""}, {"com.fasterxml.jackson.core.json.JsonWriteContext", "toString", ""}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "[0] {getCurrentIndex=0, getCurrentName=null, getEntryCount=0, getTypeDesc=ARRAY}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput024() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.json.JsonWriteContext", "com.fasterxml.jackson.core.json.JsonWriteContext", "createRootContext", new String[]{"com.fasterxml.jackson.core.json.DupDetector"}, new String[]{"<sample:1>"}, true, 0, null, 2), new String[][]{{"getDupDetector", "", "1"}});
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.core.json.DupDetector", actual.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput025() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.json.JsonWriteContext", "com.fasterxml.jackson.core.json.JsonWriteContext", "getTypeDesc", new String[]{}, new String[]{}, false, 0, null, 3);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("?", String.valueOf(actual));
  assertEquals("receiver state after the call", "/ {getCurrentIndex=0, getCurrentName=null, getEntryCount=0, getTypeDesc=?}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput026() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.json.JsonWriteContext", "com.fasterxml.jackson.core.json.JsonWriteContext", "getTypeDesc", new String[]{}, new String[]{}, false, 1, new String[][]{}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("ROOT", String.valueOf(actual));
  assertEquals("receiver state after the call", "/ {getCurrentIndex=0, getCurrentName=null, getEntryCount=0, getTypeDesc=ROOT}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput027() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.json.JsonWriteContext", "com.fasterxml.jackson.core.json.JsonWriteContext", "getTypeDesc", new String[]{}, new String[]{}, false, 2, new String[][]{}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("ARRAY", String.valueOf(actual));
  assertEquals("receiver state after the call", "[0] {getCurrentIndex=0, getCurrentName=null, getEntryCount=0, getTypeDesc=ARRAY}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput028() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.json.JsonWriteContext", "com.fasterxml.jackson.core.json.JsonWriteContext", "getTypeDesc", new String[]{}, new String[]{}, false, 4, new String[][]{{"com.fasterxml.jackson.core.json.JsonWriteContext", "writeValue", ""}, {"com.fasterxml.jackson.core.json.JsonWriteContext", "getCurrentName", ""}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("ROOT", String.valueOf(actual));
  assertEquals("receiver state after the call", "/ {getCurrentIndex=0, getCurrentName=null, getEntryCount=1, getTypeDesc=ROOT}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput029() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.json.JsonWriteContext", "com.fasterxml.jackson.core.json.JsonWriteContext", "getTypeDesc", new String[]{}, new String[]{}, false, 5, new String[][]{{"com.fasterxml.jackson.core.json.JsonWriteContext", "writeValue", ""}, {"com.fasterxml.jackson.core.json.JsonWriteContext", "getCurrentName", ""}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("?", String.valueOf(actual));
  assertEquals("receiver state after the call", "/ {getCurrentIndex=0, getCurrentName=null, getEntryCount=1, getTypeDesc=?}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput030() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.json.JsonWriteContext", "com.fasterxml.jackson.core.json.JsonWriteContext", "getTypeDesc", new String[]{}, new String[]{}, false, 13, new String[][]{{"com.fasterxml.jackson.core.json.JsonWriteContext", "writeFieldName", "java.lang.String", ""}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("?", String.valueOf(actual));
  assertEquals("receiver state after the call", "/ {getCurrentIndex=0, getCurrentName=, getEntryCount=0, getTypeDesc=?}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput031() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.json.JsonWriteContext", "com.fasterxml.jackson.core.json.JsonWriteContext", "writeFieldName", new String[]{"java.lang.String"}, new String[]{"2"}, false, 0, new String[][]{{"com.fasterxml.jackson.core.json.JsonWriteContext", "createChildObjectContext", ""}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "/ {getCurrentIndex=0, getCurrentName=2, getEntryCount=0, getTypeDesc=?}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput032() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.json.JsonWriteContext", "com.fasterxml.jackson.core.json.JsonWriteContext", "writeFieldName", new String[]{"java.lang.String"}, new String[]{""}, false, 0, new String[][]{{"com.fasterxml.jackson.core.json.JsonWriteContext", "createChildObjectContext", ""}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "/ {getCurrentIndex=0, getCurrentName=, getEntryCount=0, getTypeDesc=?}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput033() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.json.JsonWriteContext", "com.fasterxml.jackson.core.json.JsonWriteContext", "inArray", new String[]{}, new String[]{}, false, 1, new String[][]{{"com.fasterxml.jackson.core.json.JsonWriteContext", "getTypeDesc", ""}, {"com.fasterxml.jackson.core.json.JsonWriteContext", "writeValue", ""}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "/ {getCurrentIndex=0, getCurrentName=null, getEntryCount=1, getTypeDesc=ROOT}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput034() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.json.JsonWriteContext", "com.fasterxml.jackson.core.json.JsonWriteContext", "inArray", new String[]{}, new String[]{}, false, 2, new String[][]{{"com.fasterxml.jackson.core.json.JsonWriteContext", "getTypeDesc", ""}, {"com.fasterxml.jackson.core.json.JsonWriteContext", "writeValue", ""}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
  assertEquals("receiver state after the call", "[0] {getCurrentIndex=0, getCurrentName=null, getEntryCount=1, getTypeDesc=ARRAY}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput035() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.json.JsonWriteContext", "com.fasterxml.jackson.core.json.JsonWriteContext", "inArray", new String[]{}, new String[]{}, false, 3, new String[][]{{"com.fasterxml.jackson.core.json.JsonWriteContext", "getTypeDesc", ""}, {"com.fasterxml.jackson.core.json.JsonWriteContext", "writeValue", ""}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "/ {getCurrentIndex=0, getCurrentName=null, getEntryCount=1, getTypeDesc=?}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput036() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.json.JsonWriteContext", "com.fasterxml.jackson.core.json.JsonWriteContext", "createChildArrayContext", new String[]{}, new String[]{}, false, 3, new String[][]{{"com.fasterxml.jackson.core.json.JsonWriteContext", "getCurrentName", ""}}, 3), new String[][]{{"getEntryCount", "", "6"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "/ {getCurrentIndex=0, getCurrentName=null, getEntryCount=0, getTypeDesc=?}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput037() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.json.JsonWriteContext", "com.fasterxml.jackson.core.json.JsonWriteContext", "createChildArrayContext", new String[]{}, new String[]{}, false, 4, new String[][]{}, 3), new String[][]{{"getEntryCount", "", "6"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "/ {getCurrentIndex=0, getCurrentName=null, getEntryCount=0, getTypeDesc=ROOT}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput038() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.json.JsonWriteContext", "com.fasterxml.jackson.core.json.JsonWriteContext", "getParent", new String[]{}, new String[]{}, false, 13, new String[][]{{"com.fasterxml.jackson.core.json.JsonWriteContext", "reset", "int", "10"}, {"com.fasterxml.jackson.core.json.JsonWriteContext", "writeFieldName", "java.lang.String", "http://example.cCom/a?b=c"}}, 3), new String[][]{{"getCurrentValue", "", "5"}, {"getCurrentValue", "", "7"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "/ {getCurrentIndex=0, getCurrentName=http://example.cCom/a?b=c, getEntryCount=0, getTypeDesc=?}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput039() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.json.JsonWriteContext", "com.fasterxml.jackson.core.json.JsonWriteContext", "createChildArrayContext", new String[]{}, new String[]{}, false, 0, null, 1);
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.core.json.JsonWriteContext", actual.getClass().getName());
  assertEquals("[0] {getCurrentIndex=0, getCurrentName=null, getEntryCount=0, getTypeDesc=ARRAY}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "/ {getCurrentIndex=0, getCurrentName=null, getEntryCount=0, getTypeDesc=?}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput040() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.json.JsonWriteContext", "com.fasterxml.jackson.core.json.JsonWriteContext", "createChildArrayContext", new String[]{}, new String[]{}, false, 1, new String[][]{}, 1), new String[][]{{"withDupDetector", "com.fasterxml.jackson.core.json.DupDetector", "4"}});
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.core.json.JsonWriteContext", actual.getClass().getName());
  assertEquals("[0] {getCurrentIndex=0, getCurrentName=null, getEntryCount=0, getTypeDesc=ARRAY}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "/ {getCurrentIndex=0, getCurrentName=null, getEntryCount=0, getTypeDesc=ROOT}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput041() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.json.JsonWriteContext", "com.fasterxml.jackson.core.json.JsonWriteContext", "getDupDetector", new String[]{}, new String[]{}, false, 0, null, 1), new String[][]{{"reset", "", "7"}, {"child", "", "0"}});
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.core.json.DupDetector", actual.getClass().getName());
  assertEquals("receiver state after the call", "/ {getCurrentIndex=0, getCurrentName=null, getEntryCount=0, getTypeDesc=?}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput042() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.json.JsonWriteContext", "com.fasterxml.jackson.core.json.JsonWriteContext", "getDupDetector", new String[]{}, new String[]{}, false, 1, new String[][]{{"com.fasterxml.jackson.core.json.JsonWriteContext", "getCurrentValue", ""}}, 1), new String[][]{{"reset", "", "7"}, {"child", "", "0"}, {"reset", "", "4"}});
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.core.json.DupDetector", actual.getClass().getName());
  assertEquals("receiver state after the call", "/ {getCurrentIndex=0, getCurrentName=null, getEntryCount=0, getTypeDesc=ROOT}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput043() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.json.JsonWriteContext", "com.fasterxml.jackson.core.json.JsonWriteContext", "getDupDetector", new String[]{}, new String[]{}, false, 2, new String[][]{{"com.fasterxml.jackson.core.json.JsonWriteContext", "getCurrentValue", ""}}, 1), new String[][]{{"reset", "", "7"}, {"child", "", "0"}, {"reset", "", "4"}});
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.core.json.DupDetector", actual.getClass().getName());
  assertEquals("receiver state after the call", "[0] {getCurrentIndex=0, getCurrentName=null, getEntryCount=0, getTypeDesc=ARRAY}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput044() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.json.JsonWriteContext", "com.fasterxml.jackson.core.json.JsonWriteContext", "withDupDetector", new String[]{"com.fasterxml.jackson.core.json.DupDetector"}, new String[]{"<sample:7>"}, false, 0, null, 3);
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.core.json.JsonWriteContext", actual.getClass().getName());
  assertEquals("/ {getCurrentIndex=0, getCurrentName=null, getEntryCount=0, getTypeDesc=?}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "/ {getCurrentIndex=0, getCurrentName=null, getEntryCount=0, getTypeDesc=?}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput045() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.json.JsonWriteContext", "com.fasterxml.jackson.core.json.JsonWriteContext", "writeFieldName", new String[]{"java.lang.String"}, new String[]{"1"}, false, 3, new String[][]{{"com.fasterxml.jackson.core.json.JsonWriteContext", "getCurrentName", ""}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "/ {getCurrentIndex=0, getCurrentName=1, getEntryCount=0, getTypeDesc=?}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput046() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.json.JsonWriteContext", "com.fasterxml.jackson.core.json.JsonWriteContext", "writeFieldName", new String[]{"java.lang.String"}, new String[]{">"}, false, 3, new String[][]{{"com.fasterxml.jackson.core.json.JsonWriteContext", "getCurrentName", ""}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "/ {getCurrentIndex=0, getCurrentName=>, getEntryCount=0, getTypeDesc=?}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput047() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.json.JsonWriteContext", "com.fasterxml.jackson.core.json.JsonWriteContext", "createChildObjectContext", new String[]{}, new String[]{}, false, 10, new String[][]{}, 1), new String[][]{{"writeFieldName", "java.lang.String", "5"}, {"getTypeDesc", "", "3"}, {"inObject", "", "5"}, {"getParent", "", "2"}});
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.core.json.JsonWriteContext", actual.getClass().getName());
  assertEquals("/ {getCurrentIndex=0, getCurrentName=null, getEntryCount=0, getTypeDesc=?}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "/ {getCurrentIndex=0, getCurrentName=null, getEntryCount=0, getTypeDesc=?}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput048() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.json.JsonWriteContext", "com.fasterxml.jackson.core.json.JsonWriteContext", "createChildObjectContext", new String[]{}, new String[]{}, false, 4, new String[][]{}, 1), new String[][]{{"writeFieldName", "java.lang.String", "5"}, {"getTypeDesc", "", "3"}, {"inObject", "", "5"}, {"getParent", "", "2"}});
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.core.json.JsonWriteContext", actual.getClass().getName());
  assertEquals("/ {getCurrentIndex=0, getCurrentName=null, getEntryCount=0, getTypeDesc=ROOT}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "/ {getCurrentIndex=0, getCurrentName=null, getEntryCount=0, getTypeDesc=ROOT}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput049() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.json.JsonWriteContext", "com.fasterxml.jackson.core.json.JsonWriteContext", "withDupDetector", new String[]{"com.fasterxml.jackson.core.json.DupDetector"}, new String[]{"<sample:5>"}, false, 0, new String[][]{{"com.fasterxml.jackson.core.json.JsonWriteContext", "appendDesc", "java.lang.StringBuilder", "<sample:1>"}, {"com.fasterxml.jackson.core.json.JsonWriteContext", "inObject", ""}}, 1);
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.core.json.JsonWriteContext", actual.getClass().getName());
  assertEquals("/ {getCurrentIndex=0, getCurrentName=null, getEntryCount=0, getTypeDesc=?}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "/ {getCurrentIndex=0, getCurrentName=null, getEntryCount=0, getTypeDesc=?}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput050() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.json.JsonWriteContext", "com.fasterxml.jackson.core.json.JsonWriteContext", "createRootContext", new String[]{"com.fasterxml.jackson.core.json.DupDetector"}, new String[]{"<sample:4>"}, true, 0, null, 3), new String[][]{{"writeValue", "", "7"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput051() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.json.JsonWriteContext", "com.fasterxml.jackson.core.json.JsonWriteContext", "getCurrentValue", new String[]{}, new String[]{}, false, 17, new String[][]{}, 3);
  assertNull(actual);
  assertEquals("receiver state after the call", "/ {getCurrentIndex=0, getCurrentName=null, getEntryCount=0, getTypeDesc=?}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput052() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.json.JsonWriteContext", "com.fasterxml.jackson.core.json.JsonWriteContext", "getCurrentValue", new String[]{}, new String[]{}, false, 18, new String[][]{}, 3);
  assertNull(actual);
  assertEquals("receiver state after the call", "/ {getCurrentIndex=0, getCurrentName=null, getEntryCount=0, getTypeDesc=ROOT}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput053() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.json.JsonWriteContext", "com.fasterxml.jackson.core.json.JsonWriteContext", "getCurrentValue", new String[]{}, new String[]{}, false, 23, new String[][]{{"com.fasterxml.jackson.core.json.JsonWriteContext", "getEntryCount", ""}, {"com.fasterxml.jackson.core.json.JsonWriteContext", "getParent", ""}}, 2);
  assertNull(actual);
  assertEquals("receiver state after the call", "/ {getCurrentIndex=0, getCurrentName=null, getEntryCount=0, getTypeDesc=?}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput054() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.json.JsonWriteContext", "com.fasterxml.jackson.core.json.JsonWriteContext", "getCurrentValue", new String[]{}, new String[]{}, false, 24, new String[][]{{"com.fasterxml.jackson.core.json.JsonWriteContext", "getEntryCount", ""}, {"com.fasterxml.jackson.core.json.JsonWriteContext", "getParent", ""}}, 2);
  assertNull(actual);
  assertEquals("receiver state after the call", "/ {getCurrentIndex=0, getCurrentName=null, getEntryCount=0, getTypeDesc=ROOT}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput055() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.json.JsonWriteContext", "com.fasterxml.jackson.core.json.JsonWriteContext", "getCurrentValue", new String[]{}, new String[]{}, false, 25, new String[][]{{"com.fasterxml.jackson.core.json.JsonWriteContext", "getEntryCount", ""}, {"com.fasterxml.jackson.core.json.JsonWriteContext", "getParent", ""}, {"com.fasterxml.jackson.core.json.JsonWriteContext", "writeFieldName", "java.lang.String", "\t"}}, 2);
  assertNull(actual);
  assertEquals("receiver state after the call", "/ {getCurrentIndex=0, getCurrentName=\t, getEntryCount=0, getTypeDesc=?}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput056() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.json.JsonWriteContext", "com.fasterxml.jackson.core.json.JsonWriteContext", "getCurrentValue", new String[]{}, new String[]{}, false, 26, new String[][]{{"com.fasterxml.jackson.core.json.JsonWriteContext", "getEntryCount", ""}, {"com.fasterxml.jackson.core.json.JsonWriteContext", "getParent", ""}, {"com.fasterxml.jackson.core.json.JsonWriteContext", "writeFieldName", "java.lang.String", "\t"}}, 2);
  assertNull(actual);
  assertEquals("receiver state after the call", "/ {getCurrentIndex=0, getCurrentName=\t, getEntryCount=0, getTypeDesc=ROOT}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput057() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.json.JsonWriteContext", "com.fasterxml.jackson.core.json.JsonWriteContext", "createChildObjectContext", new String[]{}, new String[]{}, false, 15, new String[][]{{"com.fasterxml.jackson.core.json.JsonWriteContext", "inObject", ""}}, 1), new String[][]{{"inArray", "", "3"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "/ {getCurrentIndex=0, getCurrentName=null, getEntryCount=0, getTypeDesc=?}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput058() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.json.JsonWriteContext", "com.fasterxml.jackson.core.json.JsonWriteContext", "inObject", new String[]{}, new String[]{}, false, 2, new String[][]{{"com.fasterxml.jackson.core.json.JsonWriteContext", "writeValue", ""}, {"com.fasterxml.jackson.core.json.JsonWriteContext", "getDupDetector", ""}, {"com.fasterxml.jackson.core.json.JsonWriteContext", "getDupDetector", ""}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "[0] {getCurrentIndex=0, getCurrentName=null, getEntryCount=1, getTypeDesc=ARRAY}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput059() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.json.JsonWriteContext", "com.fasterxml.jackson.core.json.JsonWriteContext", "inObject", new String[]{}, new String[]{}, false, 3, new String[][]{{"com.fasterxml.jackson.core.json.JsonWriteContext", "writeValue", ""}, {"com.fasterxml.jackson.core.json.JsonWriteContext", "getDupDetector", ""}, {"com.fasterxml.jackson.core.json.JsonWriteContext", "getDupDetector", ""}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "/ {getCurrentIndex=0, getCurrentName=null, getEntryCount=1, getTypeDesc=?}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput060() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.json.JsonWriteContext", "com.fasterxml.jackson.core.json.JsonWriteContext", "inObject", new String[]{}, new String[]{}, false, 1, new String[][]{{"com.fasterxml.jackson.core.json.JsonWriteContext", "writeValue", ""}, {"com.fasterxml.jackson.core.json.JsonWriteContext", "getDupDetector", ""}, {"com.fasterxml.jackson.core.json.JsonWriteContext", "getDupDetector", ""}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "/ {getCurrentIndex=0, getCurrentName=null, getEntryCount=1, getTypeDesc=ROOT}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput061() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.json.JsonWriteContext", "com.fasterxml.jackson.core.json.JsonWriteContext", "getEntryCount", new String[]{}, new String[]{}, false, 6, new String[][]{{"com.fasterxml.jackson.core.json.JsonWriteContext", "reset", "int", "-16"}, {"com.fasterxml.jackson.core.json.JsonWriteContext", "getDupDetector", ""}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "/ {getCurrentIndex=0, getCurrentName=null, getEntryCount=0, getTypeDesc=?}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput062() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.json.JsonWriteContext", "com.fasterxml.jackson.core.json.JsonWriteContext", "writeValue", new String[]{}, new String[]{}, false, 2, new String[][]{{"com.fasterxml.jackson.core.json.JsonWriteContext", "reset", "int", "2"}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("5", String.valueOf(actual));
  assertEquals("receiver state after the call", "{?} {getCurrentIndex=0, getCurrentName=null, getEntryCount=0, getTypeDesc=OBJECT}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput063() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.json.JsonWriteContext", "com.fasterxml.jackson.core.json.JsonWriteContext", "getCurrentName", new String[]{}, new String[]{}, false, 0, null, 2);
  assertNull(actual);
  assertEquals("receiver state after the call", "/ {getCurrentIndex=0, getCurrentName=null, getEntryCount=0, getTypeDesc=?}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput064() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.json.JsonWriteContext", "com.fasterxml.jackson.core.json.JsonWriteContext", "getCurrentName", new String[]{}, new String[]{}, false, 1, new String[][]{}, 2);
  assertNull(actual);
  assertEquals("receiver state after the call", "/ {getCurrentIndex=0, getCurrentName=null, getEntryCount=0, getTypeDesc=ROOT}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput065() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.json.JsonWriteContext", "com.fasterxml.jackson.core.json.JsonWriteContext", "getCurrentName", new String[]{}, new String[]{}, false, 2, new String[][]{}, 2);
  assertNull(actual);
  assertEquals("receiver state after the call", "[0] {getCurrentIndex=0, getCurrentName=null, getEntryCount=0, getTypeDesc=ARRAY}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput066() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.json.JsonWriteContext", "com.fasterxml.jackson.core.json.JsonWriteContext", "toString", new String[]{}, new String[]{}, false, 5, new String[][]{{"com.fasterxml.jackson.core.json.JsonWriteContext", "reset", "int", "67108864"}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("/", String.valueOf(actual));
  assertEquals("receiver state after the call", "/ {getCurrentIndex=0, getCurrentName=null, getEntryCount=0, getTypeDesc=?}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput067() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.json.JsonWriteContext", "com.fasterxml.jackson.core.json.JsonWriteContext", "getDupDetector", new String[]{}, new String[]{}, false, 0, new String[][]{{"com.fasterxml.jackson.core.json.JsonWriteContext", "inRoot", ""}}, 3), new String[][]{{"findLocation", "", "6"}, {"getColumnNr", "", "7"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("5", String.valueOf(actual));
  assertEquals("receiver state after the call", "/ {getCurrentIndex=0, getCurrentName=null, getEntryCount=0, getTypeDesc=?}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput068() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.json.JsonWriteContext", "com.fasterxml.jackson.core.json.JsonWriteContext", "getDupDetector", new String[]{}, new String[]{}, false, 1, new String[][]{{"com.fasterxml.jackson.core.json.JsonWriteContext", "inRoot", ""}, {"com.fasterxml.jackson.core.json.JsonWriteContext", "setCurrentValue", "java.lang.Object", "<s:key>"}}, 3), new String[][]{{"findLocation", "", "6"}, {"isDup", "java.lang.String", "7"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "/ {getCurrentIndex=0, getCurrentName=null, getEntryCount=0, getTypeDesc=ROOT}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput069() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.json.JsonWriteContext", "com.fasterxml.jackson.core.json.JsonWriteContext", "getDupDetector", new String[]{}, new String[]{}, false, 2, new String[][]{{"com.fasterxml.jackson.core.json.JsonWriteContext", "inRoot", ""}, {"com.fasterxml.jackson.core.json.JsonWriteContext", "setCurrentValue", "java.lang.Object", "<s:key>"}}, 3), new String[][]{{"findLocation", "", "6"}, {"getColumnNr", "", "7"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("5", String.valueOf(actual));
  assertEquals("receiver state after the call", "[0] {getCurrentIndex=0, getCurrentName=null, getEntryCount=0, getTypeDesc=ARRAY}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput070() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.json.JsonWriteContext", "com.fasterxml.jackson.core.json.JsonWriteContext", "getDupDetector", new String[]{}, new String[]{}, false, 2, new String[][]{{"com.fasterxml.jackson.core.json.JsonWriteContext", "inRoot", ""}, {"com.fasterxml.jackson.core.json.JsonWriteContext", "setCurrentValue", "java.lang.Object", "<s:key>"}}, 3), new String[][]{{"findLocation", "", "6"}});
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.core.JsonLocation", actual.getClass().getName());
  assertEquals("[Source: 2; line: 1, column: 5] {getByteOffset=-1, getCharOffset=4, getColumnNr=5, getLineNr=1}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "[0] {getCurrentIndex=0, getCurrentName=null, getEntryCount=0, getTypeDesc=ARRAY}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput071() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.json.JsonWriteContext", "com.fasterxml.jackson.core.json.JsonWriteContext", "getTypeDesc", new String[]{}, new String[]{}, false, 3, new String[][]{}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("?", String.valueOf(actual));
  assertEquals("receiver state after the call", "/ {getCurrentIndex=0, getCurrentName=null, getEntryCount=0, getTypeDesc=?}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput072() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.json.JsonWriteContext", "com.fasterxml.jackson.core.json.JsonWriteContext", "getTypeDesc", new String[]{}, new String[]{}, false, 4, new String[][]{}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("ROOT", String.valueOf(actual));
  assertEquals("receiver state after the call", "/ {getCurrentIndex=0, getCurrentName=null, getEntryCount=0, getTypeDesc=ROOT}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput073() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.json.JsonWriteContext", "com.fasterxml.jackson.core.json.JsonWriteContext", "createRootContext", new String[]{"com.fasterxml.jackson.core.json.DupDetector"}, new String[]{"<sample:0>"}, true, 0, null, 1), new String[][]{{"withDupDetector", "com.fasterxml.jackson.core.json.DupDetector", "0"}, {"createChildArrayContext", "", "4"}, {"setCurrentValue", "java.lang.Object", "5"}, {"inObject", "", "6"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput074() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.json.JsonWriteContext", "com.fasterxml.jackson.core.json.JsonWriteContext", "appendDesc", new String[]{"java.lang.StringBuilder"}, new String[]{"<sample:3>"}, false, 0, null, 1);
  assertNull(actual);
  assertEquals("receiver state after the call", "/ {getCurrentIndex=0, getCurrentName=null, getEntryCount=0, getTypeDesc=?}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput075() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.json.JsonWriteContext", "com.fasterxml.jackson.core.json.JsonWriteContext", "createChildObjectContext", new String[]{}, new String[]{}, false, 1, new String[][]{{"com.fasterxml.jackson.core.json.JsonWriteContext", "getDupDetector", ""}}, 2);
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.core.json.JsonWriteContext", actual.getClass().getName());
  assertEquals("{?} {getCurrentIndex=0, getCurrentName=null, getEntryCount=0, getTypeDesc=OBJECT}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "/ {getCurrentIndex=0, getCurrentName=null, getEntryCount=0, getTypeDesc=ROOT}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput076() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.json.JsonWriteContext", "com.fasterxml.jackson.core.json.JsonWriteContext", "createChildObjectContext", new String[]{}, new String[]{}, false, 2, new String[][]{{"com.fasterxml.jackson.core.json.JsonWriteContext", "getDupDetector", ""}}, 2);
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.core.json.JsonWriteContext", actual.getClass().getName());
  assertEquals("{?} {getCurrentIndex=0, getCurrentName=null, getEntryCount=0, getTypeDesc=OBJECT}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "[0] {getCurrentIndex=0, getCurrentName=null, getEntryCount=0, getTypeDesc=ARRAY}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput077() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.json.JsonWriteContext", "com.fasterxml.jackson.core.json.JsonWriteContext", "createChildObjectContext", new String[]{}, new String[]{}, false, 3, new String[][]{}, 2);
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.core.json.JsonWriteContext", actual.getClass().getName());
  assertEquals("{?} {getCurrentIndex=0, getCurrentName=null, getEntryCount=0, getTypeDesc=OBJECT}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "/ {getCurrentIndex=0, getCurrentName=null, getEntryCount=0, getTypeDesc=?}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput078() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.json.JsonWriteContext", "com.fasterxml.jackson.core.json.JsonWriteContext", "createChildObjectContext", new String[]{}, new String[]{}, false, 4, new String[][]{}, 3);
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.core.json.JsonWriteContext", actual.getClass().getName());
  assertEquals("{?} {getCurrentIndex=0, getCurrentName=null, getEntryCount=0, getTypeDesc=OBJECT}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "/ {getCurrentIndex=0, getCurrentName=null, getEntryCount=0, getTypeDesc=ROOT}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput079() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.json.JsonWriteContext", "com.fasterxml.jackson.core.json.JsonWriteContext", "createChildObjectContext", new String[]{}, new String[]{}, false, 5, new String[][]{}, 3);
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.core.json.JsonWriteContext", actual.getClass().getName());
  assertEquals("{?} {getCurrentIndex=0, getCurrentName=null, getEntryCount=0, getTypeDesc=OBJECT}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "/ {getCurrentIndex=0, getCurrentName=null, getEntryCount=0, getTypeDesc=?}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput080() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.json.JsonWriteContext", "com.fasterxml.jackson.core.json.JsonWriteContext", "getDupDetector", new String[]{}, new String[]{}, false, 2, new String[][]{{"com.fasterxml.jackson.core.json.JsonWriteContext", "writeFieldName", "java.lang.String", "0x1F"}}, 1), new String[][]{{"reset", "", "1"}, {"reset", "", "7"}});
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.core.json.DupDetector", actual.getClass().getName());
  assertEquals("receiver state after the call", "[0] {getCurrentIndex=0, getCurrentName=0x1F, getEntryCount=0, getTypeDesc=ARRAY}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput081() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.json.JsonWriteContext", "com.fasterxml.jackson.core.json.JsonWriteContext", "getCurrentValue", new String[]{}, new String[]{}, false, 18, new String[][]{{"com.fasterxml.jackson.core.json.JsonWriteContext", "createChildObjectContext", ""}}, 1);
  assertNull(actual);
  assertEquals("receiver state after the call", "/ {getCurrentIndex=0, getCurrentName=null, getEntryCount=0, getTypeDesc=ROOT}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput082() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.json.JsonWriteContext", "com.fasterxml.jackson.core.json.JsonWriteContext", "getCurrentValue", new String[]{}, new String[]{}, false, 19, new String[][]{{"com.fasterxml.jackson.core.json.JsonWriteContext", "createChildObjectContext", ""}}, 1);
  assertNull(actual);
  assertEquals("receiver state after the call", "/ {getCurrentIndex=0, getCurrentName=null, getEntryCount=0, getTypeDesc=?}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput083() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.json.JsonWriteContext", "com.fasterxml.jackson.core.json.JsonWriteContext", "createRootContext", new String[]{}, new String[]{}, true, 0, null, 2);
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.core.json.JsonWriteContext", actual.getClass().getName());
  assertEquals("/ {getCurrentIndex=0, getCurrentName=null, getEntryCount=0, getTypeDesc=ROOT}", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput084() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.json.JsonWriteContext", "com.fasterxml.jackson.core.json.JsonWriteContext", "reset", new String[]{"int"}, new String[]{"5"}, false, 0, new String[][]{{"com.fasterxml.jackson.core.json.JsonWriteContext", "getCurrentValue", ""}});
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.core.json.JsonWriteContext", actual.getClass().getName());
  assertEquals("/ {getCurrentIndex=0, getCurrentName=null, getEntryCount=0, getTypeDesc=?}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "/ {getCurrentIndex=0, getCurrentName=null, getEntryCount=0, getTypeDesc=?}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput085() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.json.JsonWriteContext", "com.fasterxml.jackson.core.json.JsonWriteContext", "reset", new String[]{"int"}, new String[]{"-1048576"}, false, 0, new String[][]{{"com.fasterxml.jackson.core.json.JsonWriteContext", "getCurrentValue", ""}}), new String[][]{{"inArray", "", "4"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "/ {getCurrentIndex=0, getCurrentName=null, getEntryCount=0, getTypeDesc=?}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput086() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.json.JsonWriteContext", "com.fasterxml.jackson.core.json.JsonWriteContext", "createChildObjectContext", new String[]{}, new String[]{}, false);
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.core.json.JsonWriteContext", actual.getClass().getName());
  assertEquals("{?} {getCurrentIndex=0, getCurrentName=null, getEntryCount=0, getTypeDesc=OBJECT}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "/ {getCurrentIndex=0, getCurrentName=null, getEntryCount=0, getTypeDesc=?}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput087() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.json.JsonWriteContext", "com.fasterxml.jackson.core.json.JsonWriteContext", "withDupDetector", new String[]{"com.fasterxml.jackson.core.json.DupDetector"}, new String[]{"<sample:3>"}, false, 5, new String[][]{{"com.fasterxml.jackson.core.json.JsonWriteContext", "writeValue", ""}});
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.core.json.JsonWriteContext", actual.getClass().getName());
  assertEquals("/ {getCurrentIndex=0, getCurrentName=null, getEntryCount=1, getTypeDesc=?}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "/ {getCurrentIndex=0, getCurrentName=null, getEntryCount=1, getTypeDesc=?}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput088() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.json.JsonWriteContext", "com.fasterxml.jackson.core.json.JsonWriteContext", "inObject", new String[]{}, new String[]{}, false, 0, new String[][]{{"com.fasterxml.jackson.core.json.JsonWriteContext", "inObject", ""}, {"com.fasterxml.jackson.core.json.JsonWriteContext", "getCurrentValue", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "/ {getCurrentIndex=0, getCurrentName=null, getEntryCount=0, getTypeDesc=?}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput089() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.json.JsonWriteContext", "com.fasterxml.jackson.core.json.JsonWriteContext", "inObject", new String[]{}, new String[]{}, false, 1, new String[][]{{"com.fasterxml.jackson.core.json.JsonWriteContext", "inObject", ""}, {"com.fasterxml.jackson.core.json.JsonWriteContext", "getCurrentValue", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "/ {getCurrentIndex=0, getCurrentName=null, getEntryCount=0, getTypeDesc=ROOT}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput090() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.json.JsonWriteContext", "com.fasterxml.jackson.core.json.JsonWriteContext", "inObject", new String[]{}, new String[]{}, false, 1, new String[][]{{"com.fasterxml.jackson.core.json.JsonWriteContext", "createChildArrayContext", ""}, {"com.fasterxml.jackson.core.json.JsonWriteContext", "inObject", ""}, {"com.fasterxml.jackson.core.json.JsonWriteContext", "getCurrentValue", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "/ {getCurrentIndex=0, getCurrentName=null, getEntryCount=0, getTypeDesc=ROOT}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput091() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.json.JsonWriteContext", "com.fasterxml.jackson.core.json.JsonWriteContext", "inObject", new String[]{}, new String[]{}, false, 2, new String[][]{{"com.fasterxml.jackson.core.json.JsonWriteContext", "createChildArrayContext", ""}, {"com.fasterxml.jackson.core.json.JsonWriteContext", "inObject", ""}, {"com.fasterxml.jackson.core.json.JsonWriteContext", "getCurrentValue", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "[0] {getCurrentIndex=0, getCurrentName=null, getEntryCount=0, getTypeDesc=ARRAY}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput092() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.json.JsonWriteContext", "com.fasterxml.jackson.core.json.JsonWriteContext", "getDupDetector", new String[]{}, new String[]{}, false);
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.core.json.DupDetector", actual.getClass().getName());
  assertEquals("receiver state after the call", "/ {getCurrentIndex=0, getCurrentName=null, getEntryCount=0, getTypeDesc=?}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput093() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.json.JsonWriteContext", "com.fasterxml.jackson.core.json.JsonWriteContext", "getCurrentIndex", new String[]{}, new String[]{}, false, 0, new String[][]{{"com.fasterxml.jackson.core.json.JsonWriteContext", "inObject", ""}, {"com.fasterxml.jackson.core.json.JsonWriteContext", "writeFieldName", "java.lang.String", "1.5"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "/ {getCurrentIndex=0, getCurrentName=1.5, getEntryCount=0, getTypeDesc=?}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput094() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.json.JsonWriteContext", "com.fasterxml.jackson.core.json.JsonWriteContext", "getCurrentIndex", new String[]{}, new String[]{}, false, 1, new String[][]{{"com.fasterxml.jackson.core.json.JsonWriteContext", "inObject", ""}, {"com.fasterxml.jackson.core.json.JsonWriteContext", "writeFieldName", "java.lang.String", "1.5"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "/ {getCurrentIndex=0, getCurrentName=1.5, getEntryCount=0, getTypeDesc=ROOT}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput095() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.json.JsonWriteContext", "com.fasterxml.jackson.core.json.JsonWriteContext", "getCurrentIndex", new String[]{}, new String[]{}, false, 2, new String[][]{{"com.fasterxml.jackson.core.json.JsonWriteContext", "inObject", ""}, {"com.fasterxml.jackson.core.json.JsonWriteContext", "getTypeDesc", ""}, {"com.fasterxml.jackson.core.json.JsonWriteContext", "writeFieldName", "java.lang.String", "1.5"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "[0] {getCurrentIndex=0, getCurrentName=1.5, getEntryCount=0, getTypeDesc=ARRAY}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput096() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.json.JsonWriteContext", "com.fasterxml.jackson.core.json.JsonWriteContext", "getCurrentIndex", new String[]{}, new String[]{}, false, 4, new String[][]{{"com.fasterxml.jackson.core.json.JsonWriteContext", "inObject", ""}, {"com.fasterxml.jackson.core.json.JsonWriteContext", "getTypeDesc", ""}, {"com.fasterxml.jackson.core.json.JsonWriteContext", "writeFieldName", "java.lang.String", "1.5"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "/ {getCurrentIndex=0, getCurrentName=1.5, getEntryCount=0, getTypeDesc=ROOT}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput097() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.json.JsonWriteContext", "com.fasterxml.jackson.core.json.JsonWriteContext", "getCurrentIndex", new String[]{}, new String[]{}, false, 11, new String[][]{{"com.fasterxml.jackson.core.json.JsonWriteContext", "inObject", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "/ {getCurrentIndex=0, getCurrentName=null, getEntryCount=0, getTypeDesc=?}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput098() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.json.JsonWriteContext", "com.fasterxml.jackson.core.json.JsonWriteContext", "getCurrentIndex", new String[]{}, new String[]{}, false, 16, new String[][]{});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "/ {getCurrentIndex=0, getCurrentName=null, getEntryCount=0, getTypeDesc=ROOT}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput099() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.json.JsonWriteContext", "com.fasterxml.jackson.core.json.JsonWriteContext", "createChildObjectContext", new String[]{}, new String[]{}, false, 1, new String[][]{{"com.fasterxml.jackson.core.json.JsonWriteContext", "getTypeDesc", ""}});
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.core.json.JsonWriteContext", actual.getClass().getName());
  assertEquals("{?} {getCurrentIndex=0, getCurrentName=null, getEntryCount=0, getTypeDesc=OBJECT}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "/ {getCurrentIndex=0, getCurrentName=null, getEntryCount=0, getTypeDesc=ROOT}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput100() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.json.JsonWriteContext", "com.fasterxml.jackson.core.json.JsonWriteContext", "createChildObjectContext", new String[]{}, new String[]{}, false, 2, new String[][]{{"com.fasterxml.jackson.core.json.JsonWriteContext", "getTypeDesc", ""}});
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.core.json.JsonWriteContext", actual.getClass().getName());
  assertEquals("{?} {getCurrentIndex=0, getCurrentName=null, getEntryCount=0, getTypeDesc=OBJECT}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "[0] {getCurrentIndex=0, getCurrentName=null, getEntryCount=0, getTypeDesc=ARRAY}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput101() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.json.JsonWriteContext", "com.fasterxml.jackson.core.json.JsonWriteContext", "createChildObjectContext", new String[]{}, new String[]{}, false, 3, new String[][]{{"com.fasterxml.jackson.core.json.JsonWriteContext", "getTypeDesc", ""}}), new String[][]{{"inArray", "", "7"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "/ {getCurrentIndex=0, getCurrentName=null, getEntryCount=0, getTypeDesc=?}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput102() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.json.JsonWriteContext", "com.fasterxml.jackson.core.json.JsonWriteContext", "createChildObjectContext", new String[]{}, new String[]{}, false, 4, new String[][]{{"com.fasterxml.jackson.core.json.JsonWriteContext", "getTypeDesc", ""}}), new String[][]{{"inArray", "", "7"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "/ {getCurrentIndex=0, getCurrentName=null, getEntryCount=0, getTypeDesc=ROOT}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput103() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.json.JsonWriteContext", "com.fasterxml.jackson.core.json.JsonWriteContext", "getCurrentValue", new String[]{}, new String[]{}, false);
  assertNull(actual);
  assertEquals("receiver state after the call", "/ {getCurrentIndex=0, getCurrentName=null, getEntryCount=0, getTypeDesc=?}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput104() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.json.JsonWriteContext", "com.fasterxml.jackson.core.json.JsonWriteContext", "getTypeDesc", new String[]{}, new String[]{}, false, 2, new String[][]{});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("ARRAY", String.valueOf(actual));
  assertEquals("receiver state after the call", "[0] {getCurrentIndex=0, getCurrentName=null, getEntryCount=0, getTypeDesc=ARRAY}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput105() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.json.JsonWriteContext", "com.fasterxml.jackson.core.json.JsonWriteContext", "getCurrentIndex", new String[]{}, new String[]{}, false, 0, new String[][]{{"com.fasterxml.jackson.core.json.JsonWriteContext", "setCurrentValue", "java.lang.Object", "<sample:1>"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "/ {getCurrentIndex=0, getCurrentName=null, getEntryCount=0, getTypeDesc=?}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput106() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.json.JsonWriteContext", "com.fasterxml.jackson.core.json.JsonWriteContext", "getTypeDesc", new String[]{}, new String[]{}, false);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("?", String.valueOf(actual));
  assertEquals("receiver state after the call", "/ {getCurrentIndex=0, getCurrentName=null, getEntryCount=0, getTypeDesc=?}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput107() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.json.JsonWriteContext", "com.fasterxml.jackson.core.json.JsonWriteContext", "getTypeDesc", new String[]{}, new String[]{}, false, 1, new String[][]{});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("ROOT", String.valueOf(actual));
  assertEquals("receiver state after the call", "/ {getCurrentIndex=0, getCurrentName=null, getEntryCount=0, getTypeDesc=ROOT}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput108() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.json.JsonWriteContext", "com.fasterxml.jackson.core.json.JsonWriteContext", "writeValue", new String[]{}, new String[]{}, false);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "/ {getCurrentIndex=0, getCurrentName=null, getEntryCount=1, getTypeDesc=?}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput109() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.json.JsonWriteContext", "com.fasterxml.jackson.core.json.JsonWriteContext", "writeValue", new String[]{}, new String[]{}, false, 1, new String[][]{});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "/ {getCurrentIndex=0, getCurrentName=null, getEntryCount=1, getTypeDesc=ROOT}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput110() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.json.JsonWriteContext", "com.fasterxml.jackson.core.json.JsonWriteContext", "writeValue", new String[]{}, new String[]{}, false, 2, new String[][]{});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "[0] {getCurrentIndex=0, getCurrentName=null, getEntryCount=1, getTypeDesc=ARRAY}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput111() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.json.JsonWriteContext", "com.fasterxml.jackson.core.json.JsonWriteContext", "getEntryCount", new String[]{}, new String[]{}, false);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "/ {getCurrentIndex=0, getCurrentName=null, getEntryCount=0, getTypeDesc=?}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput112() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.json.JsonWriteContext", "com.fasterxml.jackson.core.json.JsonWriteContext", "getEntryCount", new String[]{}, new String[]{}, false, 1, new String[][]{});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "/ {getCurrentIndex=0, getCurrentName=null, getEntryCount=0, getTypeDesc=ROOT}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput113() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.json.JsonWriteContext", "com.fasterxml.jackson.core.json.JsonWriteContext", "inRoot", new String[]{}, new String[]{}, false, 0, new String[][]{{"com.fasterxml.jackson.core.json.JsonWriteContext", "toString", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "/ {getCurrentIndex=0, getCurrentName=null, getEntryCount=0, getTypeDesc=?}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput114() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.json.JsonWriteContext", "com.fasterxml.jackson.core.json.JsonWriteContext", "inRoot", new String[]{}, new String[]{}, false, 1, new String[][]{{"com.fasterxml.jackson.core.json.JsonWriteContext", "toString", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
  assertEquals("receiver state after the call", "/ {getCurrentIndex=0, getCurrentName=null, getEntryCount=0, getTypeDesc=ROOT}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput115() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.json.JsonWriteContext", "com.fasterxml.jackson.core.json.JsonWriteContext", "inRoot", new String[]{}, new String[]{}, false, 2, new String[][]{{"com.fasterxml.jackson.core.json.JsonWriteContext", "toString", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "[0] {getCurrentIndex=0, getCurrentName=null, getEntryCount=0, getTypeDesc=ARRAY}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput116() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.json.JsonWriteContext", "com.fasterxml.jackson.core.json.JsonWriteContext", "createRootContext", new String[]{"com.fasterxml.jackson.core.json.DupDetector"}, new String[]{"<sample:3>"}, true);
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.core.json.JsonWriteContext", actual.getClass().getName());
  assertEquals("/ {getCurrentIndex=0, getCurrentName=null, getEntryCount=0, getTypeDesc=ROOT}", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput117() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.json.JsonWriteContext", "com.fasterxml.jackson.core.json.JsonWriteContext", "createRootContext", new String[]{"com.fasterxml.jackson.core.json.DupDetector"}, new String[]{"<sample:3>"}, true), new String[][]{{"getCurrentValue", "", "7"}});
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput118() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.json.JsonWriteContext", "com.fasterxml.jackson.core.json.JsonWriteContext", "createRootContext", new String[]{"com.fasterxml.jackson.core.json.DupDetector"}, new String[]{"<sample:1>"}, true), new String[][]{{"getDupDetector", "", "1"}});
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.core.json.DupDetector", actual.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput119() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.json.JsonWriteContext", "com.fasterxml.jackson.core.json.JsonWriteContext", "inArray", new String[]{}, new String[]{}, false, 7, new String[][]{{"com.fasterxml.jackson.core.json.JsonWriteContext", "appendDesc", "java.lang.StringBuilder", "<sample:1>"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "/ {getCurrentIndex=0, getCurrentName=null, getEntryCount=0, getTypeDesc=?}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput120() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.json.JsonWriteContext", "com.fasterxml.jackson.core.json.JsonWriteContext", "createRootContext", new String[]{"com.fasterxml.jackson.core.json.DupDetector"}, new String[]{"<sample:4>"}, true), new String[][]{{"getEntryCount", "", "4"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput121() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.json.JsonWriteContext", "com.fasterxml.jackson.core.json.JsonWriteContext", "createRootContext", new String[]{"com.fasterxml.jackson.core.json.DupDetector"}, new String[]{"<sample:7>"}, true), new String[][]{{"getEntryCount", "", "6"}, {"inArray", "", "4"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput122() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.json.JsonWriteContext", "com.fasterxml.jackson.core.json.JsonWriteContext", "createRootContext", new String[]{"com.fasterxml.jackson.core.json.DupDetector"}, new String[]{"<sample:2>"}, true), new String[][]{{"getEntryCount", "", "6"}, {"inArray", "", "4"}, {"createChildArrayContext", "", "7"}});
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.core.json.JsonWriteContext", actual.getClass().getName());
  assertEquals("[0] {getCurrentIndex=0, getCurrentName=null, getEntryCount=0, getTypeDesc=ARRAY}", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput123() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.json.JsonWriteContext", "com.fasterxml.jackson.core.json.JsonWriteContext", "getDupDetector", new String[]{}, new String[]{}, false, 2, new String[][]{{"com.fasterxml.jackson.core.json.JsonWriteContext", "getCurrentValue", ""}}), new String[][]{{"isDup", "java.lang.String", "6"}, {"reset", "", "1"}});
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.core.json.DupDetector", actual.getClass().getName());
  assertEquals("receiver state after the call", "[0] {getCurrentIndex=0, getCurrentName=null, getEntryCount=0, getTypeDesc=ARRAY}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput124() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.json.JsonWriteContext", "com.fasterxml.jackson.core.json.JsonWriteContext", "createRootContext", new String[]{}, new String[]{}, true);
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.core.json.JsonWriteContext", actual.getClass().getName());
  assertEquals("/ {getCurrentIndex=0, getCurrentName=null, getEntryCount=0, getTypeDesc=ROOT}", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput125() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.json.JsonWriteContext", "com.fasterxml.jackson.core.json.JsonWriteContext", "getCurrentName", new String[]{}, new String[]{}, false);
  assertNull(actual);
  assertEquals("receiver state after the call", "/ {getCurrentIndex=0, getCurrentName=null, getEntryCount=0, getTypeDesc=?}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput126() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.json.JsonWriteContext", "com.fasterxml.jackson.core.json.JsonWriteContext", "getCurrentName", new String[]{}, new String[]{}, false, 1, new String[][]{});
  assertNull(actual);
  assertEquals("receiver state after the call", "/ {getCurrentIndex=0, getCurrentName=null, getEntryCount=0, getTypeDesc=ROOT}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput127() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.json.JsonWriteContext", "com.fasterxml.jackson.core.json.JsonWriteContext", "getCurrentName", new String[]{}, new String[]{}, false, 2, new String[][]{});
  assertNull(actual);
  assertEquals("receiver state after the call", "[0] {getCurrentIndex=0, getCurrentName=null, getEntryCount=0, getTypeDesc=ARRAY}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput128() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.json.JsonWriteContext", "com.fasterxml.jackson.core.json.JsonWriteContext", "appendDesc", new String[]{"java.lang.StringBuilder"}, new String[]{"<sample:1>"}, false, 2, new String[][]{{"com.fasterxml.jackson.core.json.JsonWriteContext", "getParent", ""}});
  assertNull(actual);
  assertEquals("receiver state after the call", "[0] {getCurrentIndex=0, getCurrentName=null, getEntryCount=0, getTypeDesc=ARRAY}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput129() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.json.JsonWriteContext", "com.fasterxml.jackson.core.json.JsonWriteContext", "getTypeDesc", new String[]{}, new String[]{}, false, 14, new String[][]{{"com.fasterxml.jackson.core.json.JsonWriteContext", "writeFieldName", "java.lang.String", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("?", String.valueOf(actual));
  assertEquals("receiver state after the call", "/ {getCurrentIndex=0, getCurrentName=, getEntryCount=0, getTypeDesc=?}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput130() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.json.JsonWriteContext", "com.fasterxml.jackson.core.json.JsonWriteContext", "getTypeDesc", new String[]{}, new String[]{}, false, 16, new String[][]{{"com.fasterxml.jackson.core.json.JsonWriteContext", "writeFieldName", "java.lang.String", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("ROOT", String.valueOf(actual));
  assertEquals("receiver state after the call", "/ {getCurrentIndex=0, getCurrentName=, getEntryCount=0, getTypeDesc=ROOT}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput131() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.json.JsonWriteContext", "com.fasterxml.jackson.core.json.JsonWriteContext", "getTypeDesc", new String[]{}, new String[]{}, false, 17, new String[][]{{"com.fasterxml.jackson.core.json.JsonWriteContext", "writeFieldName", "java.lang.String", "W"}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("?", String.valueOf(actual));
  assertEquals("receiver state after the call", "/ {getCurrentIndex=0, getCurrentName=W, getEntryCount=0, getTypeDesc=?}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput132() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.json.JsonWriteContext", "com.fasterxml.jackson.core.json.JsonWriteContext", "getTypeDesc", new String[]{}, new String[]{}, false, 18, new String[][]{{"com.fasterxml.jackson.core.json.JsonWriteContext", "writeFieldName", "java.lang.String", "W"}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("ROOT", String.valueOf(actual));
  assertEquals("receiver state after the call", "/ {getCurrentIndex=0, getCurrentName=W, getEntryCount=0, getTypeDesc=ROOT}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput133() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.json.JsonWriteContext", "com.fasterxml.jackson.core.json.JsonWriteContext", "getCurrentValue", new String[]{}, new String[]{}, false, 1, new String[][]{{"com.fasterxml.jackson.core.json.JsonWriteContext", "getCurrentValue", ""}});
  assertNull(actual);
  assertEquals("receiver state after the call", "/ {getCurrentIndex=0, getCurrentName=null, getEntryCount=0, getTypeDesc=ROOT}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput134() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.json.JsonWriteContext", "com.fasterxml.jackson.core.json.JsonWriteContext", "getCurrentValue", new String[]{}, new String[]{}, false, 2, new String[][]{{"com.fasterxml.jackson.core.json.JsonWriteContext", "getCurrentValue", ""}});
  assertNull(actual);
  assertEquals("receiver state after the call", "[0] {getCurrentIndex=0, getCurrentName=null, getEntryCount=0, getTypeDesc=ARRAY}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput135() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.json.JsonWriteContext", "com.fasterxml.jackson.core.json.JsonWriteContext", "getCurrentValue", new String[]{}, new String[]{}, false, 4, new String[][]{{"com.fasterxml.jackson.core.json.JsonWriteContext", "createChildArrayContext", ""}, {"com.fasterxml.jackson.core.json.JsonWriteContext", "getCurrentValue", ""}});
  assertNull(actual);
  assertEquals("receiver state after the call", "/ {getCurrentIndex=0, getCurrentName=null, getEntryCount=0, getTypeDesc=ROOT}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput136() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.json.JsonWriteContext", "com.fasterxml.jackson.core.json.JsonWriteContext", "writeFieldName", new String[]{"java.lang.String"}, new String[]{""}, false, 0, new String[][]{{"com.fasterxml.jackson.core.json.JsonWriteContext", "createChildObjectContext", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "/ {getCurrentIndex=0, getCurrentName=, getEntryCount=0, getTypeDesc=?}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput137() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.json.JsonWriteContext", "com.fasterxml.jackson.core.json.JsonWriteContext", "writeFieldName", new String[]{"java.lang.String"}, new String[]{"0xFFFFFFFF"}, false, 0, new String[][]{{"com.fasterxml.jackson.core.json.JsonWriteContext", "createChildObjectContext", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "/ {getCurrentIndex=0, getCurrentName=0xFFFFFFFF, getEntryCount=0, getTypeDesc=?}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput138() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.json.JsonWriteContext", "com.fasterxml.jackson.core.json.JsonWriteContext", "writeFieldName", new String[]{"java.lang.String"}, new String[]{"0xFFFFFFF"}, false, 0, new String[][]{{"com.fasterxml.jackson.core.json.JsonWriteContext", "createChildObjectContext", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "/ {getCurrentIndex=0, getCurrentName=0xFFFFFFF, getEntryCount=0, getTypeDesc=?}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput139() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.json.JsonWriteContext", "com.fasterxml.jackson.core.json.JsonWriteContext", "writeFieldName", new String[]{"java.lang.String"}, new String[]{"0xFFFFFGF"}, false, 0, new String[][]{{"com.fasterxml.jackson.core.json.JsonWriteContext", "createChildObjectContext", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "/ {getCurrentIndex=0, getCurrentName=0xFFFFFGF, getEntryCount=0, getTypeDesc=?}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput140() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.json.JsonWriteContext", "com.fasterxml.jackson.core.json.JsonWriteContext", "toString", new String[]{}, new String[]{}, false);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("/", String.valueOf(actual));
  assertEquals("receiver state after the call", "/ {getCurrentIndex=0, getCurrentName=null, getEntryCount=0, getTypeDesc=?}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput141() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.json.JsonWriteContext", "com.fasterxml.jackson.core.json.JsonWriteContext", "toString", new String[]{}, new String[]{}, false, 1, new String[][]{});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("/", String.valueOf(actual));
  assertEquals("receiver state after the call", "/ {getCurrentIndex=0, getCurrentName=null, getEntryCount=0, getTypeDesc=ROOT}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput142() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.json.JsonWriteContext", "com.fasterxml.jackson.core.json.JsonWriteContext", "toString", new String[]{}, new String[]{}, false, 2, new String[][]{{"com.fasterxml.jackson.core.json.JsonWriteContext", "getCurrentValue", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("[0]", String.valueOf(actual));
  assertEquals("receiver state after the call", "[0] {getCurrentIndex=0, getCurrentName=null, getEntryCount=0, getTypeDesc=ARRAY}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput143() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.json.JsonWriteContext", "com.fasterxml.jackson.core.json.JsonWriteContext", "withDupDetector", new String[]{"com.fasterxml.jackson.core.json.DupDetector"}, new String[]{"<sample:0>"}, false, 7, new String[][]{{"com.fasterxml.jackson.core.json.JsonWriteContext", "setCurrentValue", "java.lang.Object", "<s:>"}});
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.core.json.JsonWriteContext", actual.getClass().getName());
  assertEquals("/ {getCurrentIndex=0, getCurrentName=null, getEntryCount=0, getTypeDesc=?}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "/ {getCurrentIndex=0, getCurrentName=null, getEntryCount=0, getTypeDesc=?}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput144() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.json.JsonWriteContext", "com.fasterxml.jackson.core.json.JsonWriteContext", "inArray", new String[]{}, new String[]{}, false, 0, new String[][]{{"com.fasterxml.jackson.core.json.JsonWriteContext", "getTypeDesc", ""}, {"com.fasterxml.jackson.core.json.JsonWriteContext", "writeValue", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "/ {getCurrentIndex=0, getCurrentName=null, getEntryCount=1, getTypeDesc=?}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput145() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.json.JsonWriteContext", "com.fasterxml.jackson.core.json.JsonWriteContext", "inArray", new String[]{}, new String[]{}, false, 1, new String[][]{{"com.fasterxml.jackson.core.json.JsonWriteContext", "getTypeDesc", ""}, {"com.fasterxml.jackson.core.json.JsonWriteContext", "writeValue", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "/ {getCurrentIndex=0, getCurrentName=null, getEntryCount=1, getTypeDesc=ROOT}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput146() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.json.JsonWriteContext", "com.fasterxml.jackson.core.json.JsonWriteContext", "createChildArrayContext", new String[]{}, new String[]{}, false, 0, new String[][]{{"com.fasterxml.jackson.core.json.JsonWriteContext", "getCurrentName", ""}});
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.core.json.JsonWriteContext", actual.getClass().getName());
  assertEquals("[0] {getCurrentIndex=0, getCurrentName=null, getEntryCount=0, getTypeDesc=ARRAY}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "/ {getCurrentIndex=0, getCurrentName=null, getEntryCount=0, getTypeDesc=?}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput147() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.json.JsonWriteContext", "com.fasterxml.jackson.core.json.JsonWriteContext", "createChildArrayContext", new String[]{}, new String[]{}, false, 1, new String[][]{{"com.fasterxml.jackson.core.json.JsonWriteContext", "getCurrentName", ""}});
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.core.json.JsonWriteContext", actual.getClass().getName());
  assertEquals("[0] {getCurrentIndex=0, getCurrentName=null, getEntryCount=0, getTypeDesc=ARRAY}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "/ {getCurrentIndex=0, getCurrentName=null, getEntryCount=0, getTypeDesc=ROOT}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput148() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.json.JsonWriteContext", "com.fasterxml.jackson.core.json.JsonWriteContext", "createChildArrayContext", new String[]{}, new String[]{}, false, 2, new String[][]{{"com.fasterxml.jackson.core.json.JsonWriteContext", "getCurrentName", ""}});
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.core.json.JsonWriteContext", actual.getClass().getName());
  assertEquals("[0] {getCurrentIndex=0, getCurrentName=null, getEntryCount=0, getTypeDesc=ARRAY}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "[0] {getCurrentIndex=0, getCurrentName=null, getEntryCount=0, getTypeDesc=ARRAY}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput149() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.json.JsonWriteContext", "com.fasterxml.jackson.core.json.JsonWriteContext", "createChildArrayContext", new String[]{}, new String[]{}, false, 2, new String[][]{{"com.fasterxml.jackson.core.json.JsonWriteContext", "getCurrentName", ""}}), new String[][]{{"getEntryCount", "", "6"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "[0] {getCurrentIndex=0, getCurrentName=null, getEntryCount=0, getTypeDesc=ARRAY}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput150() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.json.JsonWriteContext", "com.fasterxml.jackson.core.json.JsonWriteContext", "getParent", new String[]{}, new String[]{}, false, 0, new String[][]{{"com.fasterxml.jackson.core.json.JsonWriteContext", "writeFieldName", "java.lang.String", "<null>"}});
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.core.json.JsonWriteContext", actual.getClass().getName());
  assertEquals("[0] {getCurrentIndex=0, getCurrentName=null, getEntryCount=0, getTypeDesc=ARRAY}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "/ {getCurrentIndex=0, getCurrentName=null, getEntryCount=0, getTypeDesc=?}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput151() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.json.JsonWriteContext", "com.fasterxml.jackson.core.json.JsonWriteContext", "getParent", new String[]{}, new String[]{}, false, 1, new String[][]{{"com.fasterxml.jackson.core.json.JsonWriteContext", "writeFieldName", "java.lang.String", "<null>"}});
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.core.json.JsonWriteContext", actual.getClass().getName());
  assertEquals("/ {getCurrentIndex=0, getCurrentName=null, getEntryCount=0, getTypeDesc=?}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "/ {getCurrentIndex=0, getCurrentName=null, getEntryCount=0, getTypeDesc=ROOT}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput152() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.json.JsonWriteContext", "com.fasterxml.jackson.core.json.JsonWriteContext", "getParent", new String[]{}, new String[]{}, false, 0, new String[][]{{"com.fasterxml.jackson.core.json.JsonWriteContext", "writeFieldName", "java.lang.String", "\t"}});
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.core.json.JsonWriteContext", actual.getClass().getName());
  assertEquals("[0] {getCurrentIndex=0, getCurrentName=null, getEntryCount=0, getTypeDesc=ARRAY}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "/ {getCurrentIndex=0, getCurrentName=\t, getEntryCount=0, getTypeDesc=?}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput153() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.json.JsonWriteContext", "com.fasterxml.jackson.core.json.JsonWriteContext", "getParent", new String[]{}, new String[]{}, false, 0, new String[][]{{"com.fasterxml.jackson.core.json.JsonWriteContext", "writeFieldName", "java.lang.String", ""}});
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.core.json.JsonWriteContext", actual.getClass().getName());
  assertEquals("[0] {getCurrentIndex=0, getCurrentName=null, getEntryCount=0, getTypeDesc=ARRAY}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "/ {getCurrentIndex=0, getCurrentName=, getEntryCount=0, getTypeDesc=?}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput154() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.json.JsonWriteContext", "com.fasterxml.jackson.core.json.JsonWriteContext", "getParent", new String[]{}, new String[]{}, false, 0, new String[][]{{"com.fasterxml.jackson.core.json.JsonWriteContext", "writeFieldName", "java.lang.String", ""}}), new String[][]{{"getCurrentValue", "", "0"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "/ {getCurrentIndex=0, getCurrentName=, getEntryCount=0, getTypeDesc=?}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput155() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.json.JsonWriteContext", "com.fasterxml.jackson.core.json.JsonWriteContext", "getParent", new String[]{}, new String[]{}, false, 13, new String[][]{{"com.fasterxml.jackson.core.json.JsonWriteContext", "writeFieldName", "java.lang.String", "http://example.com/a?b=c"}}), new String[][]{{"getCurrentValue", "", "5"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "/ {getCurrentIndex=0, getCurrentName=http://example.com/a?b=c, getEntryCount=0, getTypeDesc=?}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput156() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.json.JsonWriteContext", "com.fasterxml.jackson.core.json.JsonWriteContext", "getParent", new String[]{}, new String[]{}, false, 13, new String[][]{{"com.fasterxml.jackson.core.json.JsonWriteContext", "writeFieldName", "java.lang.String", "http://example.cCom/a?b=c"}}), new String[][]{{"getCurrentValue", "", "5"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "/ {getCurrentIndex=0, getCurrentName=http://example.cCom/a?b=c, getEntryCount=0, getTypeDesc=?}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput157() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.json.JsonWriteContext", "com.fasterxml.jackson.core.json.JsonWriteContext", "getParent", new String[]{}, new String[]{}, false, 0, new String[][]{{"com.fasterxml.jackson.core.json.JsonWriteContext", "getCurrentIndex", ""}, {"com.fasterxml.jackson.core.json.JsonWriteContext", "appendDesc", "java.lang.StringBuilder", "<sample:1>"}}), new String[][]{{"getParent", "", "3"}, {"withDupDetector", "com.fasterxml.jackson.core.json.DupDetector", "5"}});
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.core.json.JsonWriteContext", actual.getClass().getName());
  assertEquals("{?} {getCurrentIndex=0, getCurrentName=null, getEntryCount=0, getTypeDesc=OBJECT}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "/ {getCurrentIndex=0, getCurrentName=null, getEntryCount=0, getTypeDesc=?}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput158() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.json.JsonWriteContext", "com.fasterxml.jackson.core.json.JsonWriteContext", "writeFieldName", new String[]{"java.lang.String"}, new String[]{"2020-02-30T25:61:61"}, false, 5, new String[][]{{"com.fasterxml.jackson.core.json.JsonWriteContext", "toString", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "/ {getCurrentIndex=0, getCurrentName=2020-02-30T25:61:61, getEntryCount=0, getTypeDesc=?}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput159() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.json.JsonWriteContext", "com.fasterxml.jackson.core.json.JsonWriteContext", "withDupDetector", new String[]{"com.fasterxml.jackson.core.json.DupDetector"}, new String[]{"<sample:3>"}, false), new String[][]{{"getDupDetector", "", "4"}, {"reset", "", "6"}, {"reset", "", "6"}});
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.core.json.DupDetector", actual.getClass().getName());
  assertEquals("receiver state after the call", "/ {getCurrentIndex=0, getCurrentName=null, getEntryCount=0, getTypeDesc=?}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput160() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.json.JsonWriteContext", "com.fasterxml.jackson.core.json.JsonWriteContext", "withDupDetector", new String[]{"com.fasterxml.jackson.core.json.DupDetector"}, new String[]{"<sample:9>"}, false, 0, new String[][]{{"com.fasterxml.jackson.core.json.JsonWriteContext", "setCurrentValue", "java.lang.Object", "<d:6.0>"}}), new String[][]{{"getEntryCount", "", "4"}, {"inRoot", "", "6"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "/ {getCurrentIndex=0, getCurrentName=null, getEntryCount=0, getTypeDesc=?}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput161() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.json.JsonWriteContext", "com.fasterxml.jackson.core.json.JsonWriteContext", "createChildObjectContext", new String[]{}, new String[]{}, false, 4, new String[][]{{"com.fasterxml.jackson.core.json.JsonWriteContext", "reset", "int", "-3"}});
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.core.json.JsonWriteContext", actual.getClass().getName());
  assertEquals("{?} {getCurrentIndex=0, getCurrentName=null, getEntryCount=0, getTypeDesc=OBJECT}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "/ {getCurrentIndex=0, getCurrentName=null, getEntryCount=0, getTypeDesc=?}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput162() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.json.JsonWriteContext", "com.fasterxml.jackson.core.json.JsonWriteContext", "inArray", new String[]{}, new String[]{}, false, 1, new String[][]{});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "/ {getCurrentIndex=0, getCurrentName=null, getEntryCount=0, getTypeDesc=ROOT}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput163() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.json.JsonWriteContext", "com.fasterxml.jackson.core.json.JsonWriteContext", "inArray", new String[]{}, new String[]{}, false, 2, new String[][]{});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
  assertEquals("receiver state after the call", "[0] {getCurrentIndex=0, getCurrentName=null, getEntryCount=0, getTypeDesc=ARRAY}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput164() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.json.JsonWriteContext", "com.fasterxml.jackson.core.json.JsonWriteContext", "withDupDetector", new String[]{"com.fasterxml.jackson.core.json.DupDetector"}, new String[]{"<sample:5>"}, false), new String[][]{{"getCurrentIndex", "", "2"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "/ {getCurrentIndex=0, getCurrentName=null, getEntryCount=0, getTypeDesc=?}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput165() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.json.JsonWriteContext", "com.fasterxml.jackson.core.json.JsonWriteContext", "createChildObjectContext", new String[]{}, new String[]{}, false, 6, new String[][]{{"com.fasterxml.jackson.core.json.JsonWriteContext", "inObject", ""}, {"com.fasterxml.jackson.core.json.JsonWriteContext", "writeFieldName", "java.lang.String", "Title"}});
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.core.json.JsonWriteContext", actual.getClass().getName());
  assertEquals("{?} {getCurrentIndex=0, getCurrentName=null, getEntryCount=0, getTypeDesc=OBJECT}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "/ {getCurrentIndex=0, getCurrentName=Title, getEntryCount=0, getTypeDesc=?}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput166() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.json.JsonWriteContext", "com.fasterxml.jackson.core.json.JsonWriteContext", "createChildObjectContext", new String[]{}, new String[]{}, false, 11, new String[][]{{"com.fasterxml.jackson.core.json.JsonWriteContext", "inRoot", ""}, {"com.fasterxml.jackson.core.json.JsonWriteContext", "inObject", ""}, {"com.fasterxml.jackson.core.json.JsonWriteContext", "writeFieldName", "java.lang.String", "1.5d"}});
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.core.json.JsonWriteContext", actual.getClass().getName());
  assertEquals("{?} {getCurrentIndex=0, getCurrentName=null, getEntryCount=0, getTypeDesc=OBJECT}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "/ {getCurrentIndex=0, getCurrentName=1.5d, getEntryCount=0, getTypeDesc=?}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput167() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.json.JsonWriteContext", "com.fasterxml.jackson.core.json.JsonWriteContext", "getCurrentValue", new String[]{}, new String[]{}, false, 1, new String[][]{{"com.fasterxml.jackson.core.json.JsonWriteContext", "reset", "int", "-1"}, {"com.fasterxml.jackson.core.json.JsonWriteContext", "setCurrentValue", "java.lang.Object", "<d:1.5>"}});
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("1.5", String.valueOf(actual));
  assertEquals("receiver state after the call", "/ {getCurrentIndex=0, getCurrentName=null, getEntryCount=0, getTypeDesc=?}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput168() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.json.JsonWriteContext", "com.fasterxml.jackson.core.json.JsonWriteContext", "getCurrentValue", new String[]{}, new String[]{}, false, 7, new String[][]{{"com.fasterxml.jackson.core.json.JsonWriteContext", "reset", "int", "-23"}, {"com.fasterxml.jackson.core.json.JsonWriteContext", "writeFieldName", "java.lang.String", "<null>"}, {"com.fasterxml.jackson.core.json.JsonWriteContext", "setCurrentValue", "java.lang.Object", "<d:-44.5>"}});
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("-44.5", String.valueOf(actual));
  assertEquals("receiver state after the call", "/ {getCurrentIndex=0, getCurrentName=null, getEntryCount=0, getTypeDesc=?}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput169() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.json.JsonWriteContext", "com.fasterxml.jackson.core.json.JsonWriteContext", "getCurrentValue", new String[]{}, new String[]{}, false, 8, new String[][]{{"com.fasterxml.jackson.core.json.JsonWriteContext", "reset", "int", "-23"}, {"com.fasterxml.jackson.core.json.JsonWriteContext", "writeFieldName", "java.lang.String", "0"}, {"com.fasterxml.jackson.core.json.JsonWriteContext", "setCurrentValue", "java.lang.Object", "<d:-44.5>"}});
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("-44.5", String.valueOf(actual));
  assertEquals("receiver state after the call", "/ {getCurrentIndex=0, getCurrentName=0, getEntryCount=0, getTypeDesc=?}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput170() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.json.JsonWriteContext", "com.fasterxml.jackson.core.json.JsonWriteContext", "getDupDetector", new String[]{}, new String[]{}, false, 0, new String[][]{{"com.fasterxml.jackson.core.json.JsonWriteContext", "getParent", ""}}), new String[][]{{"child", "", "0"}, {"isDup", "java.lang.String", "4"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "/ {getCurrentIndex=0, getCurrentName=null, getEntryCount=0, getTypeDesc=?}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput171() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.json.JsonWriteContext", "com.fasterxml.jackson.core.json.JsonWriteContext", "getDupDetector", new String[]{}, new String[]{}, false, 1, new String[][]{{"com.fasterxml.jackson.core.json.JsonWriteContext", "getParent", ""}}), new String[][]{{"child", "", "0"}, {"isDup", "java.lang.String", "4"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "/ {getCurrentIndex=0, getCurrentName=null, getEntryCount=0, getTypeDesc=ROOT}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput172() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.json.JsonWriteContext", "com.fasterxml.jackson.core.json.JsonWriteContext", "getDupDetector", new String[]{}, new String[]{}, false, 4, new String[][]{{"com.fasterxml.jackson.core.json.JsonWriteContext", "getParent", ""}});
  assertNull(actual);
  assertEquals("receiver state after the call", "/ {getCurrentIndex=0, getCurrentName=null, getEntryCount=0, getTypeDesc=ROOT}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput173() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.json.JsonWriteContext", "com.fasterxml.jackson.core.json.JsonWriteContext", "createChildObjectContext", new String[]{}, new String[]{}, false), new String[][]{{"writeFieldName", "java.lang.String", "5"}, {"getTypeDesc", "", "3"}, {"inObject", "", "5"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
  assertEquals("receiver state after the call", "/ {getCurrentIndex=0, getCurrentName=null, getEntryCount=0, getTypeDesc=?}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput174() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.json.JsonWriteContext", "com.fasterxml.jackson.core.json.JsonWriteContext", "createChildObjectContext", new String[]{}, new String[]{}, false, 7, new String[][]{}), new String[][]{{"writeFieldName", "java.lang.String", "5"}, {"getTypeDesc", "", "3"}, {"inObject", "", "5"}, {"getParent", "", "2"}});
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.core.json.JsonWriteContext", actual.getClass().getName());
  assertEquals("/ {getCurrentIndex=0, getCurrentName=null, getEntryCount=0, getTypeDesc=?}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "/ {getCurrentIndex=0, getCurrentName=null, getEntryCount=0, getTypeDesc=?}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput175() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.json.JsonWriteContext", "com.fasterxml.jackson.core.json.JsonWriteContext", "withDupDetector", new String[]{"com.fasterxml.jackson.core.json.DupDetector"}, new String[]{"<sample:4>"}, false, 2, new String[][]{});
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.core.json.JsonWriteContext", actual.getClass().getName());
  assertEquals("[0] {getCurrentIndex=0, getCurrentName=null, getEntryCount=0, getTypeDesc=ARRAY}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "[0] {getCurrentIndex=0, getCurrentName=null, getEntryCount=0, getTypeDesc=ARRAY}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput176() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.json.JsonWriteContext", "com.fasterxml.jackson.core.json.JsonWriteContext", "appendDesc", new String[]{"java.lang.StringBuilder"}, new String[]{"<empty>"}, false, 0, new String[][]{{"com.fasterxml.jackson.core.json.JsonWriteContext", "getCurrentValue", ""}});
  assertNull(actual);
  assertEquals("receiver state after the call", "/ {getCurrentIndex=0, getCurrentName=null, getEntryCount=0, getTypeDesc=?}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput177() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.json.JsonWriteContext", "com.fasterxml.jackson.core.json.JsonWriteContext", "inObject", new String[]{}, new String[]{}, false, 7, new String[][]{{"com.fasterxml.jackson.core.json.JsonWriteContext", "writeValue", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "/ {getCurrentIndex=0, getCurrentName=null, getEntryCount=1, getTypeDesc=?}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput178() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.json.JsonWriteContext", "com.fasterxml.jackson.core.json.JsonWriteContext", "inObject", new String[]{}, new String[]{}, false, 1, new String[][]{{"com.fasterxml.jackson.core.json.JsonWriteContext", "writeValue", ""}, {"com.fasterxml.jackson.core.json.JsonWriteContext", "getDupDetector", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "/ {getCurrentIndex=0, getCurrentName=null, getEntryCount=1, getTypeDesc=ROOT}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput179() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.json.JsonWriteContext", "com.fasterxml.jackson.core.json.JsonWriteContext", "inObject", new String[]{}, new String[]{}, false, 2, new String[][]{{"com.fasterxml.jackson.core.json.JsonWriteContext", "writeValue", ""}, {"com.fasterxml.jackson.core.json.JsonWriteContext", "getDupDetector", ""}, {"com.fasterxml.jackson.core.json.JsonWriteContext", "getDupDetector", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "[0] {getCurrentIndex=0, getCurrentName=null, getEntryCount=1, getTypeDesc=ARRAY}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput180() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.json.JsonWriteContext", "com.fasterxml.jackson.core.json.JsonWriteContext", "inRoot", new String[]{}, new String[]{}, false, 4, new String[][]{{"com.fasterxml.jackson.core.json.JsonWriteContext", "writeFieldName", "java.lang.String", "\t"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
  assertEquals("receiver state after the call", "/ {getCurrentIndex=0, getCurrentName=\t, getEntryCount=0, getTypeDesc=ROOT}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput181() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.json.JsonWriteContext", "com.fasterxml.jackson.core.json.JsonWriteContext", "setCurrentValue", new String[]{"java.lang.Object"}, new String[]{"<d:1.5>"}, false, 0, new String[][]{{"com.fasterxml.jackson.core.json.JsonWriteContext", "toString", ""}});
  assertNull(actual);
  assertEquals("receiver state after the call", "/ {getCurrentIndex=0, getCurrentName=null, getEntryCount=0, getTypeDesc=?}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput182() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.json.JsonWriteContext", "com.fasterxml.jackson.core.json.JsonWriteContext", "reset", new String[]{"int"}, new String[]{"-6"}, false, 11, new String[][]{{"com.fasterxml.jackson.core.json.JsonWriteContext", "inArray", ""}}), new String[][]{{"getCurrentValue", "", "3"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "/ {getCurrentIndex=0, getCurrentName=null, getEntryCount=0, getTypeDesc=?}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput183() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.json.JsonWriteContext", "com.fasterxml.jackson.core.json.JsonWriteContext", "reset", new String[]{"int"}, new String[]{"-6"}, false, 11, new String[][]{{"com.fasterxml.jackson.core.json.JsonWriteContext", "inArray", ""}}), new String[][]{{"getCurrentValue", "", "3"}, {"createChildObjectContext", "", "1"}});
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.core.json.JsonWriteContext", actual.getClass().getName());
  assertEquals("{?} {getCurrentIndex=0, getCurrentName=null, getEntryCount=0, getTypeDesc=OBJECT}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "/ {getCurrentIndex=0, getCurrentName=null, getEntryCount=0, getTypeDesc=?}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput184() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.json.JsonWriteContext", "com.fasterxml.jackson.core.json.JsonWriteContext", "writeValue", new String[]{}, new String[]{}, false, 0, new String[][]{{"com.fasterxml.jackson.core.json.JsonWriteContext", "reset", "int", "2"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("5", String.valueOf(actual));
  assertEquals("receiver state after the call", "{?} {getCurrentIndex=0, getCurrentName=null, getEntryCount=0, getTypeDesc=OBJECT}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput185() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.json.JsonWriteContext", "com.fasterxml.jackson.core.json.JsonWriteContext", "getDupDetector", new String[]{}, new String[]{}, false, 2, new String[][]{{"com.fasterxml.jackson.core.json.JsonWriteContext", "inRoot", ""}, {"com.fasterxml.jackson.core.json.JsonWriteContext", "getCurrentIndex", ""}, {"com.fasterxml.jackson.core.json.JsonWriteContext", "setCurrentValue", "java.lang.Object", "<s:key>"}}), new String[][]{{"findLocation", "", "6"}});
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.core.JsonLocation", actual.getClass().getName());
  assertEquals("[Source: 2; line: 1, column: 5] {getByteOffset=-1, getCharOffset=4, getColumnNr=5, getLineNr=1}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "[0] {getCurrentIndex=0, getCurrentName=null, getEntryCount=0, getTypeDesc=ARRAY}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput186() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.json.JsonWriteContext", "com.fasterxml.jackson.core.json.JsonWriteContext", "createChildArrayContext", new String[]{}, new String[]{}, false, 0, new String[][]{{"com.fasterxml.jackson.core.json.JsonWriteContext", "toString", ""}, {"com.fasterxml.jackson.core.json.JsonWriteContext", "inObject", ""}}), new String[][]{{"getDupDetector", "", "7"}});
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.core.json.DupDetector", actual.getClass().getName());
  assertEquals("receiver state after the call", "/ {getCurrentIndex=0, getCurrentName=null, getEntryCount=0, getTypeDesc=?}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput187() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.json.JsonWriteContext", "com.fasterxml.jackson.core.json.JsonWriteContext", "createChildArrayContext", new String[]{}, new String[]{}, false, 4, new String[][]{{"com.fasterxml.jackson.core.json.JsonWriteContext", "toString", ""}}), new String[][]{{"getDupDetector", "", "7"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "/ {getCurrentIndex=0, getCurrentName=null, getEntryCount=0, getTypeDesc=ROOT}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput188() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.json.JsonWriteContext", "com.fasterxml.jackson.core.json.JsonWriteContext", "createChildArrayContext", new String[]{}, new String[]{}, false, 5, new String[][]{{"com.fasterxml.jackson.core.json.JsonWriteContext", "getCurrentName", ""}}), new String[][]{{"getDupDetector", "", "7"}, {"isDup", "java.lang.String", "0"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "/ {getCurrentIndex=0, getCurrentName=null, getEntryCount=0, getTypeDesc=?}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput189() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.json.JsonWriteContext", "com.fasterxml.jackson.core.json.JsonWriteContext", "inRoot", new String[]{}, new String[]{}, false, 0, new String[][]{{"com.fasterxml.jackson.core.json.JsonWriteContext", "writeFieldName", "java.lang.String", "010"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "/ {getCurrentIndex=0, getCurrentName=010, getEntryCount=0, getTypeDesc=?}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput190() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.json.JsonWriteContext", "com.fasterxml.jackson.core.json.JsonWriteContext", "inRoot", new String[]{}, new String[]{}, false, 1, new String[][]{{"com.fasterxml.jackson.core.json.JsonWriteContext", "writeFieldName", "java.lang.String", "010"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
  assertEquals("receiver state after the call", "/ {getCurrentIndex=0, getCurrentName=010, getEntryCount=0, getTypeDesc=ROOT}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput191() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.json.JsonWriteContext", "com.fasterxml.jackson.core.json.JsonWriteContext", "setCurrentValue", new String[]{"java.lang.Object"}, new String[]{"<i:4>"}, false, 1, new String[][]{{"com.fasterxml.jackson.core.json.JsonWriteContext", "getEntryCount", ""}});
  assertNull(actual);
  assertEquals("receiver state after the call", "/ {getCurrentIndex=0, getCurrentName=null, getEntryCount=0, getTypeDesc=ROOT}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput192() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.json.JsonWriteContext", "com.fasterxml.jackson.core.json.JsonWriteContext", "withDupDetector", new String[]{"com.fasterxml.jackson.core.json.DupDetector"}, new String[]{"<sample:0>"}, false), new String[][]{{"writeValue", "", "2"}, {"createChildObjectContext", "", "3"}, {"createChildObjectContext", "", "0"}});
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.core.json.JsonWriteContext", actual.getClass().getName());
  assertEquals("{?} {getCurrentIndex=0, getCurrentName=null, getEntryCount=0, getTypeDesc=OBJECT}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "/ {getCurrentIndex=0, getCurrentName=null, getEntryCount=1, getTypeDesc=?}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput193() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.json.JsonWriteContext", "com.fasterxml.jackson.core.json.JsonWriteContext", "appendDesc", new String[]{"java.lang.StringBuilder"}, new String[]{"<null>"}, false); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput194() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.json.JsonWriteContext", "com.fasterxml.jackson.core.json.JsonWriteContext", "getDupDetector", new String[]{}, new String[]{}, false, 0, new String[][]{{"com.fasterxml.jackson.core.json.JsonWriteContext", "writeValue", ""}});
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.core.json.DupDetector", actual.getClass().getName());
  assertEquals("receiver state after the call", "/ {getCurrentIndex=0, getCurrentName=null, getEntryCount=1, getTypeDesc=?}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput195() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.json.JsonWriteContext", "com.fasterxml.jackson.core.json.JsonWriteContext", "getParent", new String[]{}, new String[]{}, false, 0, new String[][]{{"com.fasterxml.jackson.core.json.JsonWriteContext", "toString", ""}}), new String[][]{{"inRoot", "", "0"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "/ {getCurrentIndex=0, getCurrentName=null, getEntryCount=0, getTypeDesc=?}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput196() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.json.JsonWriteContext", "com.fasterxml.jackson.core.json.JsonWriteContext", "getParent", new String[]{}, new String[]{}, false, 2, new String[][]{{"com.fasterxml.jackson.core.json.JsonWriteContext", "toString", ""}}), new String[][]{{"inRoot", "", "0"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
  assertEquals("receiver state after the call", "[0] {getCurrentIndex=0, getCurrentName=null, getEntryCount=0, getTypeDesc=ARRAY}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput197() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.json.JsonWriteContext", "com.fasterxml.jackson.core.json.JsonWriteContext", "createRootContext", new String[]{}, new String[]{}, true), new String[][]{{"getParent", "", "2"}});
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput198() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.json.JsonWriteContext", "com.fasterxml.jackson.core.json.JsonWriteContext", "getDupDetector", new String[]{}, new String[]{}, false, 0, new String[][]{{"com.fasterxml.jackson.core.json.JsonWriteContext", "writeFieldName", "java.lang.String", "0x1F"}, {"com.fasterxml.jackson.core.json.JsonWriteContext", "createChildArrayContext", ""}}), new String[][]{{"reset", "", "2"}});
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.core.json.DupDetector", actual.getClass().getName());
  assertEquals("receiver state after the call", "/ {getCurrentIndex=0, getCurrentName=0x1F, getEntryCount=0, getTypeDesc=?}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput199() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.json.JsonWriteContext", "com.fasterxml.jackson.core.json.JsonWriteContext", "getCurrentName", new String[]{}, new String[]{}, false, 4, new String[][]{{"com.fasterxml.jackson.core.json.JsonWriteContext", "writeFieldName", "java.lang.String", "{\"a\":1}"}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("{\"a\":1}", String.valueOf(actual));
  assertEquals("receiver state after the call", "/ {getCurrentIndex=0, getCurrentName={\"a\":1}, getEntryCount=0, getTypeDesc=ROOT}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput200() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.json.JsonWriteContext", "com.fasterxml.jackson.core.json.JsonWriteContext", "getCurrentName", new String[]{}, new String[]{}, false, 5, new String[][]{{"com.fasterxml.jackson.core.json.JsonWriteContext", "writeFieldName", "java.lang.String", "{\"a\":1}"}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("{\"a\":1}", String.valueOf(actual));
  assertEquals("receiver state after the call", "/ {getCurrentIndex=0, getCurrentName={\"a\":1}, getEntryCount=0, getTypeDesc=?}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput201() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.json.JsonWriteContext", "com.fasterxml.jackson.core.json.JsonWriteContext", "getCurrentName", new String[]{}, new String[]{}, false, 11, new String[][]{{"com.fasterxml.jackson.core.json.JsonWriteContext", "writeFieldName", "java.lang.String", "|\"a\":1}"}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("|\"a\":1}", String.valueOf(actual));
  assertEquals("receiver state after the call", "/ {getCurrentIndex=0, getCurrentName=|\"a\":1}, getEntryCount=0, getTypeDesc=?}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput202() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.json.JsonWriteContext", "com.fasterxml.jackson.core.json.JsonWriteContext", "getEntryCount", new String[]{}, new String[]{}, false, 2, new String[][]{{"com.fasterxml.jackson.core.json.JsonWriteContext", "inArray", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "[0] {getCurrentIndex=0, getCurrentName=null, getEntryCount=0, getTypeDesc=ARRAY}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput203() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.json.JsonWriteContext", "com.fasterxml.jackson.core.json.JsonWriteContext", "getCurrentIndex", new String[]{}, new String[]{}, false, 0, null, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "/ {getCurrentIndex=0, getCurrentName=null, getEntryCount=0, getTypeDesc=?}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput204() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.json.JsonWriteContext", "com.fasterxml.jackson.core.json.JsonWriteContext", "getCurrentIndex", new String[]{}, new String[]{}, false, 1, new String[][]{}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "/ {getCurrentIndex=0, getCurrentName=null, getEntryCount=0, getTypeDesc=ROOT}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput205() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.json.JsonWriteContext", "com.fasterxml.jackson.core.json.JsonWriteContext", "getCurrentIndex", new String[]{}, new String[]{}, false, 2, new String[][]{}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "[0] {getCurrentIndex=0, getCurrentName=null, getEntryCount=0, getTypeDesc=ARRAY}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput206() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.json.JsonWriteContext", "com.fasterxml.jackson.core.json.JsonWriteContext", "getCurrentIndex", new String[]{}, new String[]{}, false, 10, new String[][]{{"com.fasterxml.jackson.core.json.JsonWriteContext", "writeValue", ""}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "/ {getCurrentIndex=0, getCurrentName=null, getEntryCount=1, getTypeDesc=?}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput207() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.json.JsonWriteContext", "com.fasterxml.jackson.core.json.JsonWriteContext", "getCurrentIndex", new String[]{}, new String[]{}, false, 10, new String[][]{{"com.fasterxml.jackson.core.json.JsonWriteContext", "writeFieldName", "java.lang.String", ""}, {"com.fasterxml.jackson.core.json.JsonWriteContext", "writeValue", ""}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "/ {getCurrentIndex=0, getCurrentName=, getEntryCount=1, getTypeDesc=?}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput208() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.json.JsonWriteContext", "com.fasterxml.jackson.core.json.JsonWriteContext", "createChildArrayContext", new String[]{}, new String[]{}, false, 0, new String[][]{{"com.fasterxml.jackson.core.json.JsonWriteContext", "inRoot", ""}, {"com.fasterxml.jackson.core.json.JsonWriteContext", "writeValue", ""}});
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.core.json.JsonWriteContext", actual.getClass().getName());
  assertEquals("[0] {getCurrentIndex=0, getCurrentName=null, getEntryCount=0, getTypeDesc=ARRAY}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "/ {getCurrentIndex=0, getCurrentName=null, getEntryCount=1, getTypeDesc=?}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput209() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.json.JsonWriteContext", "com.fasterxml.jackson.core.json.JsonWriteContext", "createChildArrayContext", new String[]{}, new String[]{}, false, 4, new String[][]{{"com.fasterxml.jackson.core.json.JsonWriteContext", "inRoot", ""}, {"com.fasterxml.jackson.core.json.JsonWriteContext", "writeValue", ""}});
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.core.json.JsonWriteContext", actual.getClass().getName());
  assertEquals("[0] {getCurrentIndex=0, getCurrentName=null, getEntryCount=0, getTypeDesc=ARRAY}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "/ {getCurrentIndex=0, getCurrentName=null, getEntryCount=1, getTypeDesc=ROOT}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput210() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.json.JsonWriteContext", "com.fasterxml.jackson.core.json.JsonWriteContext", "createChildArrayContext", new String[]{}, new String[]{}, false, 10, new String[][]{{"com.fasterxml.jackson.core.json.JsonWriteContext", "inRoot", ""}, {"com.fasterxml.jackson.core.json.JsonWriteContext", "writeValue", ""}, {"com.fasterxml.jackson.core.json.JsonWriteContext", "createChildObjectContext", ""}}), new String[][]{{"getDupDetector", "", "2"}, {"child", "", "6"}});
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.core.json.DupDetector", actual.getClass().getName());
  assertEquals("receiver state after the call", "/ {getCurrentIndex=0, getCurrentName=null, getEntryCount=1, getTypeDesc=?}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput211() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.json.JsonWriteContext", "com.fasterxml.jackson.core.json.JsonWriteContext", "writeFieldName", new String[]{"java.lang.String"}, new String[]{"1.5e300"}, false, 0, new String[][]{{"com.fasterxml.jackson.core.json.JsonWriteContext", "writeFieldName", "java.lang.String", "5."}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("4", String.valueOf(actual));
  assertEquals("receiver state after the call", "/ {getCurrentIndex=0, getCurrentName=5., getEntryCount=0, getTypeDesc=?}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput212() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.json.JsonWriteContext", "com.fasterxml.jackson.core.json.JsonWriteContext", "writeFieldName", new String[]{"java.lang.String"}, new String[]{"1.5e300"}, false, 0, new String[][]{{"com.fasterxml.jackson.core.json.JsonWriteContext", "writeFieldName", "java.lang.String", "5."}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("4", String.valueOf(actual));
  assertEquals("receiver state after the call", "/ {getCurrentIndex=0, getCurrentName=5., getEntryCount=0, getTypeDesc=?}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput213() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.json.JsonWriteContext", "com.fasterxml.jackson.core.json.JsonWriteContext", "writeFieldName", new String[]{"java.lang.String"}, new String[]{"1/5e300"}, false, 0, new String[][]{{"com.fasterxml.jackson.core.json.JsonWriteContext", "writeFieldName", "java.lang.String", "5.12:30:45"}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("4", String.valueOf(actual));
  assertEquals("receiver state after the call", "/ {getCurrentIndex=0, getCurrentName=5.12:30:45, getEntryCount=0, getTypeDesc=?}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput214() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.json.JsonWriteContext", "com.fasterxml.jackson.core.json.JsonWriteContext", "withDupDetector", new String[]{"com.fasterxml.jackson.core.json.DupDetector"}, new String[]{"<null>"}, false, 12, new String[][]{}), new String[][]{{"getTypeDesc", "", "1"}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("?", String.valueOf(actual));
  assertEquals("receiver state after the call", "/ {getCurrentIndex=0, getCurrentName=null, getEntryCount=0, getTypeDesc=?}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput215() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.json.JsonWriteContext", "com.fasterxml.jackson.core.json.JsonWriteContext", "getDupDetector", new String[]{}, new String[]{}, false), new String[][]{{"findLocation", "", "5"}, {"getCharOffset", "", "6"}});
  assertNotNull(actual);
  assertEquals("java.lang.Long", actual.getClass().getName());
  assertEquals("4", String.valueOf(actual));
  assertEquals("receiver state after the call", "/ {getCurrentIndex=0, getCurrentName=null, getEntryCount=0, getTypeDesc=?}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput216() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.json.JsonWriteContext", "com.fasterxml.jackson.core.json.JsonWriteContext", "getEntryCount", new String[]{}, new String[]{}, false, 0, new String[][]{{"com.fasterxml.jackson.core.json.JsonWriteContext", "appendDesc", "java.lang.StringBuilder", "<sample:0>"}, {"com.fasterxml.jackson.core.json.JsonWriteContext", "inArray", ""}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "/ {getCurrentIndex=0, getCurrentName=null, getEntryCount=0, getTypeDesc=?}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput217() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.json.JsonWriteContext", "com.fasterxml.jackson.core.json.JsonWriteContext", "getEntryCount", new String[]{}, new String[]{}, false, 2, new String[][]{{"com.fasterxml.jackson.core.json.JsonWriteContext", "appendDesc", "java.lang.StringBuilder", "<sample:0>"}, {"com.fasterxml.jackson.core.json.JsonWriteContext", "inArray", ""}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "[0] {getCurrentIndex=0, getCurrentName=null, getEntryCount=0, getTypeDesc=ARRAY}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput218() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.json.JsonWriteContext", "com.fasterxml.jackson.core.json.JsonWriteContext", "getDupDetector", new String[]{}, new String[]{}, false, 0, new String[][]{{"com.fasterxml.jackson.core.json.JsonWriteContext", "getTypeDesc", ""}}, 2), new String[][]{{"reset", "", "4"}});
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.core.json.DupDetector", actual.getClass().getName());
  assertEquals("receiver state after the call", "/ {getCurrentIndex=0, getCurrentName=null, getEntryCount=0, getTypeDesc=?}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput219() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.json.JsonWriteContext", "com.fasterxml.jackson.core.json.JsonWriteContext", "getDupDetector", new String[]{}, new String[]{}, false, 1, new String[][]{}, 2), new String[][]{{"reset", "", "4"}});
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.core.json.DupDetector", actual.getClass().getName());
  assertEquals("receiver state after the call", "/ {getCurrentIndex=0, getCurrentName=null, getEntryCount=0, getTypeDesc=ROOT}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput220() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.json.JsonWriteContext", "com.fasterxml.jackson.core.json.JsonWriteContext", "getDupDetector", new String[]{}, new String[]{}, false, 2, new String[][]{}, 2), new String[][]{{"reset", "", "4"}});
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.core.json.DupDetector", actual.getClass().getName());
  assertEquals("receiver state after the call", "[0] {getCurrentIndex=0, getCurrentName=null, getEntryCount=0, getTypeDesc=ARRAY}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput221() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.json.JsonWriteContext", "com.fasterxml.jackson.core.json.JsonWriteContext", "createChildArrayContext", new String[]{}, new String[]{}, false, 2, new String[][]{{"com.fasterxml.jackson.core.json.JsonWriteContext", "inArray", ""}}), new String[][]{{"createChildObjectContext", "", "3"}});
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.core.json.JsonWriteContext", actual.getClass().getName());
  assertEquals("{?} {getCurrentIndex=0, getCurrentName=null, getEntryCount=0, getTypeDesc=OBJECT}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "[0] {getCurrentIndex=0, getCurrentName=null, getEntryCount=0, getTypeDesc=ARRAY}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput222() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.json.JsonWriteContext", "com.fasterxml.jackson.core.json.JsonWriteContext", "getDupDetector", new String[]{}, new String[]{}, false, 2, new String[][]{{"com.fasterxml.jackson.core.json.JsonWriteContext", "appendDesc", "java.lang.StringBuilder", "<empty>"}, {"com.fasterxml.jackson.core.json.JsonWriteContext", "createChildObjectContext", ""}}, 1), new String[][]{{"findLocation", "", "0"}});
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.core.JsonLocation", actual.getClass().getName());
  assertEquals("[Source: 2; line: 1, column: 5] {getByteOffset=-1, getCharOffset=4, getColumnNr=5, getLineNr=1}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "[0] {getCurrentIndex=0, getCurrentName=null, getEntryCount=0, getTypeDesc=ARRAY}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput223() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.json.JsonWriteContext", "com.fasterxml.jackson.core.json.JsonWriteContext", "createRootContext", new String[]{"com.fasterxml.jackson.core.json.DupDetector"}, new String[]{"<sample:1>"}, true, 0, null, 2);
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.core.json.JsonWriteContext", actual.getClass().getName());
  assertEquals("/ {getCurrentIndex=0, getCurrentName=null, getEntryCount=0, getTypeDesc=ROOT}", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput224() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.json.JsonWriteContext", "com.fasterxml.jackson.core.json.JsonWriteContext", "withDupDetector", new String[]{"com.fasterxml.jackson.core.json.DupDetector"}, new String[]{"<sample:2>"}, false, 0, new String[][]{{"com.fasterxml.jackson.core.json.JsonWriteContext", "setCurrentValue", "java.lang.Object", "<sample:0>"}}), new String[][]{{"writeFieldName", "java.lang.String", "1"}, {"inObject", "", "5"}, {"inArray", "", "4"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "/ {getCurrentIndex=0, getCurrentName=a, getEntryCount=0, getTypeDesc=?}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput225() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.json.JsonWriteContext", "com.fasterxml.jackson.core.json.JsonWriteContext", "appendDesc", new String[]{"java.lang.StringBuilder"}, new String[]{"<sample:2>"}, false, 0, null, 3);
  assertNull(actual);
  assertEquals("receiver state after the call", "/ {getCurrentIndex=0, getCurrentName=null, getEntryCount=0, getTypeDesc=?}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput226() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.json.JsonWriteContext", "com.fasterxml.jackson.core.json.JsonWriteContext", "appendDesc", new String[]{"java.lang.StringBuilder"}, new String[]{"<sample:3>"}, false, 6, new String[][]{{"com.fasterxml.jackson.core.json.JsonWriteContext", "createChildArrayContext", ""}, {"com.fasterxml.jackson.core.json.JsonWriteContext", "writeValue", ""}});
  assertNull(actual);
  assertEquals("receiver state after the call", "/ {getCurrentIndex=0, getCurrentName=null, getEntryCount=1, getTypeDesc=?}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput227() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.json.JsonWriteContext", "com.fasterxml.jackson.core.json.JsonWriteContext", "appendDesc", new String[]{"java.lang.StringBuilder"}, new String[]{"<sample:0>"}, false, 4, new String[][]{{"com.fasterxml.jackson.core.json.JsonWriteContext", "createChildArrayContext", ""}, {"com.fasterxml.jackson.core.json.JsonWriteContext", "getTypeDesc", ""}});
  assertNull(actual);
  assertEquals("receiver state after the call", "/ {getCurrentIndex=0, getCurrentName=null, getEntryCount=0, getTypeDesc=ROOT}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput228() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.json.JsonWriteContext", "com.fasterxml.jackson.core.json.JsonWriteContext", "appendDesc", new String[]{"java.lang.StringBuilder"}, new String[]{"<empty>"}, false, 4, new String[][]{{"com.fasterxml.jackson.core.json.JsonWriteContext", "getCurrentValue", ""}, {"com.fasterxml.jackson.core.json.JsonWriteContext", "getTypeDesc", ""}}, 1);
  assertNull(actual);
  assertEquals("receiver state after the call", "/ {getCurrentIndex=0, getCurrentName=null, getEntryCount=0, getTypeDesc=ROOT}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput229() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.json.JsonWriteContext", "com.fasterxml.jackson.core.json.JsonWriteContext", "inArray", new String[]{}, new String[]{}, false, 14, new String[][]{{"com.fasterxml.jackson.core.json.JsonWriteContext", "inObject", ""}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "/ {getCurrentIndex=0, getCurrentName=null, getEntryCount=0, getTypeDesc=?}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput230() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.json.JsonWriteContext", "com.fasterxml.jackson.core.json.JsonWriteContext", "toString", new String[]{}, new String[]{}, false, 4, new String[][]{{"com.fasterxml.jackson.core.json.JsonWriteContext", "writeFieldName", "java.lang.String", "+1"}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("/", String.valueOf(actual));
  assertEquals("receiver state after the call", "/ {getCurrentIndex=0, getCurrentName=+1, getEntryCount=0, getTypeDesc=ROOT}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput231() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.json.JsonWriteContext", "com.fasterxml.jackson.core.json.JsonWriteContext", "toString", new String[]{}, new String[]{}, false, 4, new String[][]{{"com.fasterxml.jackson.core.json.JsonWriteContext", "writeFieldName", "java.lang.String", "+0"}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("/", String.valueOf(actual));
  assertEquals("receiver state after the call", "/ {getCurrentIndex=0, getCurrentName=+0, getEntryCount=0, getTypeDesc=ROOT}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput232() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.json.JsonWriteContext", "com.fasterxml.jackson.core.json.JsonWriteContext", "toString", new String[]{}, new String[]{}, false, 4, new String[][]{}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("/", String.valueOf(actual));
  assertEquals("receiver state after the call", "/ {getCurrentIndex=0, getCurrentName=null, getEntryCount=0, getTypeDesc=ROOT}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput233() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.json.JsonWriteContext", "com.fasterxml.jackson.core.json.JsonWriteContext", "toString", new String[]{}, new String[]{}, false, 4, new String[][]{{"com.fasterxml.jackson.core.json.JsonWriteContext", "reset", "int", "-2147483648"}, {"com.fasterxml.jackson.core.json.JsonWriteContext", "writeFieldName", "java.lang.String", "+0"}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("/", String.valueOf(actual));
  assertEquals("receiver state after the call", "/ {getCurrentIndex=0, getCurrentName=+0, getEntryCount=0, getTypeDesc=?}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput234() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.json.JsonWriteContext", "com.fasterxml.jackson.core.json.JsonWriteContext", "reset", new String[]{"int"}, new String[]{"0"}, false);
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.core.json.JsonWriteContext", actual.getClass().getName());
  assertEquals("/ {getCurrentIndex=0, getCurrentName=null, getEntryCount=0, getTypeDesc=ROOT}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "/ {getCurrentIndex=0, getCurrentName=null, getEntryCount=0, getTypeDesc=ROOT}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput235() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.json.JsonWriteContext", "com.fasterxml.jackson.core.json.JsonWriteContext", "reset", new String[]{"int"}, new String[]{"0"}, false), new String[][]{{"getCurrentIndex", "", "1"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "/ {getCurrentIndex=0, getCurrentName=null, getEntryCount=0, getTypeDesc=ROOT}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput236() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.json.JsonWriteContext", "com.fasterxml.jackson.core.json.JsonWriteContext", "reset", new String[]{"int"}, new String[]{"2147483647"}, false, 2, new String[][]{{"com.fasterxml.jackson.core.json.JsonWriteContext", "inArray", ""}}, 2), new String[][]{{"getCurrentIndex", "", "1"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "/ {getCurrentIndex=0, getCurrentName=null, getEntryCount=0, getTypeDesc=?}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput237() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.json.JsonWriteContext", "com.fasterxml.jackson.core.json.JsonWriteContext", "reset", new String[]{"int"}, new String[]{"2"}, false, 2, new String[][]{{"com.fasterxml.jackson.core.json.JsonWriteContext", "inArray", ""}}, 2), new String[][]{{"getCurrentIndex", "", "1"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{?} {getCurrentIndex=0, getCurrentName=null, getEntryCount=0, getTypeDesc=OBJECT}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput238() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.json.JsonWriteContext", "com.fasterxml.jackson.core.json.JsonWriteContext", "writeValue", new String[]{}, new String[]{}, false, 0, new String[][]{{"com.fasterxml.jackson.core.json.JsonWriteContext", "reset", "int", "-3"}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "/ {getCurrentIndex=0, getCurrentName=null, getEntryCount=1, getTypeDesc=?}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput239() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.json.JsonWriteContext", "com.fasterxml.jackson.core.json.JsonWriteContext", "writeValue", new String[]{}, new String[]{}, false, 1, new String[][]{}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "/ {getCurrentIndex=0, getCurrentName=null, getEntryCount=1, getTypeDesc=ROOT}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput240() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.json.JsonWriteContext", "com.fasterxml.jackson.core.json.JsonWriteContext", "writeValue", new String[]{}, new String[]{}, false, 2, new String[][]{{"com.fasterxml.jackson.core.json.JsonWriteContext", "getParent", ""}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "[0] {getCurrentIndex=0, getCurrentName=null, getEntryCount=1, getTypeDesc=ARRAY}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput241() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.json.JsonWriteContext", "com.fasterxml.jackson.core.json.JsonWriteContext", "writeValue", new String[]{}, new String[]{}, false, 14, new String[][]{{"com.fasterxml.jackson.core.json.JsonWriteContext", "writeFieldName", "java.lang.String", "{\"a\":1}"}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "/ {getCurrentIndex=0, getCurrentName={\"a\":1}, getEntryCount=1, getTypeDesc=?}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput242() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.json.JsonWriteContext", "com.fasterxml.jackson.core.json.JsonWriteContext", "writeValue", new String[]{}, new String[]{}, false, 16, new String[][]{{"com.fasterxml.jackson.core.json.JsonWriteContext", "writeFieldName", "java.lang.String", "{\"a\":1}"}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "/ {getCurrentIndex=0, getCurrentName={\"a\":1}, getEntryCount=1, getTypeDesc=ROOT}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput243() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.json.JsonWriteContext", "com.fasterxml.jackson.core.json.JsonWriteContext", "createChildObjectContext", new String[]{}, new String[]{}, false, 4, new String[][]{{"com.fasterxml.jackson.core.json.JsonWriteContext", "inArray", ""}, {"com.fasterxml.jackson.core.json.JsonWriteContext", "getParent", ""}, {"com.fasterxml.jackson.core.json.JsonWriteContext", "withDupDetector", "com.fasterxml.jackson.core.json.DupDetector", "<sample:5>"}}), new String[][]{{"getCurrentIndex", "", "5"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "/ {getCurrentIndex=0, getCurrentName=null, getEntryCount=0, getTypeDesc=ROOT}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput244() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.json.JsonWriteContext", "com.fasterxml.jackson.core.json.JsonWriteContext", "createChildObjectContext", new String[]{}, new String[]{}, false, 5, new String[][]{{"com.fasterxml.jackson.core.json.JsonWriteContext", "inArray", ""}, {"com.fasterxml.jackson.core.json.JsonWriteContext", "getParent", ""}, {"com.fasterxml.jackson.core.json.JsonWriteContext", "withDupDetector", "com.fasterxml.jackson.core.json.DupDetector", "<sample:5>"}}, 2), new String[][]{{"getCurrentIndex", "", "5"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "/ {getCurrentIndex=0, getCurrentName=null, getEntryCount=0, getTypeDesc=?}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput245() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.json.JsonWriteContext", "com.fasterxml.jackson.core.json.JsonWriteContext", "inRoot", new String[]{}, new String[]{}, false, 0, new String[][]{{"com.fasterxml.jackson.core.json.JsonWriteContext", "getCurrentName", ""}, {"com.fasterxml.jackson.core.json.JsonWriteContext", "inArray", ""}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "/ {getCurrentIndex=0, getCurrentName=null, getEntryCount=0, getTypeDesc=?}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput246() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.json.JsonWriteContext", "com.fasterxml.jackson.core.json.JsonWriteContext", "inRoot", new String[]{}, new String[]{}, false, 1, new String[][]{{"com.fasterxml.jackson.core.json.JsonWriteContext", "getCurrentName", ""}, {"com.fasterxml.jackson.core.json.JsonWriteContext", "inArray", ""}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
  assertEquals("receiver state after the call", "/ {getCurrentIndex=0, getCurrentName=null, getEntryCount=0, getTypeDesc=ROOT}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput247() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.json.JsonWriteContext", "com.fasterxml.jackson.core.json.JsonWriteContext", "inRoot", new String[]{}, new String[]{}, false, 2, new String[][]{{"com.fasterxml.jackson.core.json.JsonWriteContext", "getCurrentName", ""}, {"com.fasterxml.jackson.core.json.JsonWriteContext", "inArray", ""}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "[0] {getCurrentIndex=0, getCurrentName=null, getEntryCount=0, getTypeDesc=ARRAY}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput248() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.json.JsonWriteContext", "com.fasterxml.jackson.core.json.JsonWriteContext", "createChildArrayContext", new String[]{}, new String[]{}, false), new String[][]{{"getCurrentName", "", "0"}, {"withDupDetector", "com.fasterxml.jackson.core.json.DupDetector", "7"}, {"inArray", "", "3"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
  assertEquals("receiver state after the call", "/ {getCurrentIndex=0, getCurrentName=null, getEntryCount=0, getTypeDesc=?}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput249() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.json.JsonWriteContext", "com.fasterxml.jackson.core.json.JsonWriteContext", "setCurrentValue", new String[]{"java.lang.Object"}, new String[]{"<s:key>"}, false, 0, null, 1);
  assertNull(actual);
  assertEquals("receiver state after the call", "/ {getCurrentIndex=0, getCurrentName=null, getEntryCount=0, getTypeDesc=?}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput250() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.json.JsonWriteContext", "com.fasterxml.jackson.core.json.JsonWriteContext", "writeValue", new String[]{}, new String[]{}, false, 1, new String[][]{{"com.fasterxml.jackson.core.json.JsonWriteContext", "writeValue", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("3", String.valueOf(actual));
  assertEquals("receiver state after the call", "/ {getCurrentIndex=1, getCurrentName=null, getEntryCount=2, getTypeDesc=ROOT}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput251() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.json.JsonWriteContext", "com.fasterxml.jackson.core.json.JsonWriteContext", "getCurrentIndex", new String[]{}, new String[]{}, false, 2, new String[][]{{"com.fasterxml.jackson.core.json.JsonWriteContext", "getDupDetector", ""}, {"com.fasterxml.jackson.core.json.JsonWriteContext", "inObject", ""}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "[0] {getCurrentIndex=0, getCurrentName=null, getEntryCount=0, getTypeDesc=ARRAY}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput252() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.json.JsonWriteContext", "com.fasterxml.jackson.core.json.JsonWriteContext", "getParent", new String[]{}, new String[]{}, false), new String[][]{{"getDupDetector", "", "2"}});
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.core.json.DupDetector", actual.getClass().getName());
  assertEquals("receiver state after the call", "/ {getCurrentIndex=0, getCurrentName=null, getEntryCount=0, getTypeDesc=?}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput253() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.json.JsonWriteContext", "com.fasterxml.jackson.core.json.JsonWriteContext", "getDupDetector", new String[]{}, new String[]{}, false, 7, new String[][]{{"com.fasterxml.jackson.core.json.JsonWriteContext", "getTypeDesc", ""}, {"com.fasterxml.jackson.core.json.JsonWriteContext", "createChildObjectContext", ""}}, 1), new String[][]{{"findLocation", "", "6"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "/ {getCurrentIndex=0, getCurrentName=null, getEntryCount=0, getTypeDesc=?}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput254() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.json.JsonWriteContext", "com.fasterxml.jackson.core.json.JsonWriteContext", "getDupDetector", new String[]{}, new String[]{}, false, 11, new String[][]{{"com.fasterxml.jackson.core.json.JsonWriteContext", "reset", "int", "-524299"}}, 1), new String[][]{{"isDup", "java.lang.String", "0"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "/ {getCurrentIndex=0, getCurrentName=null, getEntryCount=0, getTypeDesc=?}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput255() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.json.JsonWriteContext", "com.fasterxml.jackson.core.json.JsonWriteContext", "getEntryCount", new String[]{}, new String[]{}, false, 0, null, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "/ {getCurrentIndex=0, getCurrentName=null, getEntryCount=0, getTypeDesc=?}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput256() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.json.JsonWriteContext", "com.fasterxml.jackson.core.json.JsonWriteContext", "getEntryCount", new String[]{}, new String[]{}, false, 1, new String[][]{}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "/ {getCurrentIndex=0, getCurrentName=null, getEntryCount=0, getTypeDesc=ROOT}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput257() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.json.JsonWriteContext", "com.fasterxml.jackson.core.json.JsonWriteContext", "getEntryCount", new String[]{}, new String[]{}, false, 2, new String[][]{}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "[0] {getCurrentIndex=0, getCurrentName=null, getEntryCount=0, getTypeDesc=ARRAY}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput258() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.json.JsonWriteContext", "com.fasterxml.jackson.core.json.JsonWriteContext", "getEntryCount", new String[]{}, new String[]{}, false, 4, new String[][]{{"com.fasterxml.jackson.core.json.JsonWriteContext", "appendDesc", "java.lang.StringBuilder", "<sample:0>"}, {"com.fasterxml.jackson.core.json.JsonWriteContext", "inArray", ""}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "/ {getCurrentIndex=0, getCurrentName=null, getEntryCount=0, getTypeDesc=ROOT}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput259() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.json.JsonWriteContext", "com.fasterxml.jackson.core.json.JsonWriteContext", "getParent", new String[]{}, new String[]{}, false, 4, new String[][]{}, 3);
  assertNull(actual);
  assertEquals("receiver state after the call", "/ {getCurrentIndex=0, getCurrentName=null, getEntryCount=0, getTypeDesc=ROOT}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput260() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.json.JsonWriteContext", "com.fasterxml.jackson.core.json.JsonWriteContext", "getParent", new String[]{}, new String[]{}, false, 5, new String[][]{}, 3), new String[][]{{"setCurrentValue", "java.lang.Object", "0"}});
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.core.json.JsonWriteContext", actual.getClass().getName());
  assertEquals("/ {getCurrentIndex=0, getCurrentName=null, getEntryCount=0, getTypeDesc=?}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "/ {getCurrentIndex=0, getCurrentName=null, getEntryCount=0, getTypeDesc=?}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput261() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.json.JsonWriteContext", "com.fasterxml.jackson.core.json.JsonWriteContext", "inArray", new String[]{}, new String[]{}, false, 8, new String[][]{{"com.fasterxml.jackson.core.json.JsonWriteContext", "setCurrentValue", "java.lang.Object", "<s:>"}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "/ {getCurrentIndex=0, getCurrentName=null, getEntryCount=0, getTypeDesc=?}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput262() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.json.JsonWriteContext", "com.fasterxml.jackson.core.json.JsonWriteContext", "getCurrentName", new String[]{}, new String[]{}, false, 3, new String[][]{{"com.fasterxml.jackson.core.json.JsonWriteContext", "getCurrentName", ""}}, 3);
  assertNull(actual);
  assertEquals("receiver state after the call", "/ {getCurrentIndex=0, getCurrentName=null, getEntryCount=0, getTypeDesc=?}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput263() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.json.JsonWriteContext", "com.fasterxml.jackson.core.json.JsonWriteContext", "getCurrentName", new String[]{}, new String[]{}, false, 4, new String[][]{{"com.fasterxml.jackson.core.json.JsonWriteContext", "getCurrentName", ""}}, 3);
  assertNull(actual);
  assertEquals("receiver state after the call", "/ {getCurrentIndex=0, getCurrentName=null, getEntryCount=0, getTypeDesc=ROOT}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput264() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.json.JsonWriteContext", "com.fasterxml.jackson.core.json.JsonWriteContext", "getCurrentName", new String[]{}, new String[]{}, false, 6, new String[][]{{"com.fasterxml.jackson.core.json.JsonWriteContext", "createChildObjectContext", ""}, {"com.fasterxml.jackson.core.json.JsonWriteContext", "getCurrentName", ""}, {"com.fasterxml.jackson.core.json.JsonWriteContext", "writeFieldName", "java.lang.String", "2020-01-01"}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("2020-01-01", String.valueOf(actual));
  assertEquals("receiver state after the call", "/ {getCurrentIndex=0, getCurrentName=2020-01-01, getEntryCount=0, getTypeDesc=?}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput265() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.json.JsonWriteContext", "com.fasterxml.jackson.core.json.JsonWriteContext", "getCurrentName", new String[]{}, new String[]{}, false, 6, new String[][]{{"com.fasterxml.jackson.core.json.JsonWriteContext", "createChildObjectContext", ""}, {"com.fasterxml.jackson.core.json.JsonWriteContext", "getCurrentName", ""}, {"com.fasterxml.jackson.core.json.JsonWriteContext", "writeFieldName", "java.lang.String", "2020-01-/1"}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("2020-01-/1", String.valueOf(actual));
  assertEquals("receiver state after the call", "/ {getCurrentIndex=0, getCurrentName=2020-01-/1, getEntryCount=0, getTypeDesc=?}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput266() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.json.JsonWriteContext", "com.fasterxml.jackson.core.json.JsonWriteContext", "getTypeDesc", new String[]{}, new String[]{}, false, 2, new String[][]{}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("ARRAY", String.valueOf(actual));
  assertEquals("receiver state after the call", "[0] {getCurrentIndex=0, getCurrentName=null, getEntryCount=0, getTypeDesc=ARRAY}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput267() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.json.JsonWriteContext", "com.fasterxml.jackson.core.json.JsonWriteContext", "getCurrentName", new String[]{}, new String[]{}, false, 0, new String[][]{{"com.fasterxml.jackson.core.json.JsonWriteContext", "getEntryCount", ""}, {"com.fasterxml.jackson.core.json.JsonWriteContext", "setCurrentValue", "java.lang.Object", "<s:key>"}}, 1);
  assertNull(actual);
  assertEquals("receiver state after the call", "/ {getCurrentIndex=0, getCurrentName=null, getEntryCount=0, getTypeDesc=?}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput268() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.json.JsonWriteContext", "com.fasterxml.jackson.core.json.JsonWriteContext", "getCurrentName", new String[]{}, new String[]{}, false, 1, new String[][]{{"com.fasterxml.jackson.core.json.JsonWriteContext", "getEntryCount", ""}}, 1);
  assertNull(actual);
  assertEquals("receiver state after the call", "/ {getCurrentIndex=0, getCurrentName=null, getEntryCount=0, getTypeDesc=ROOT}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput269() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.json.JsonWriteContext", "com.fasterxml.jackson.core.json.JsonWriteContext", "getCurrentName", new String[]{}, new String[]{}, false, 2, new String[][]{{"com.fasterxml.jackson.core.json.JsonWriteContext", "getEntryCount", ""}}, 1);
  assertNull(actual);
  assertEquals("receiver state after the call", "[0] {getCurrentIndex=0, getCurrentName=null, getEntryCount=0, getTypeDesc=ARRAY}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput270() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.json.JsonWriteContext", "com.fasterxml.jackson.core.json.JsonWriteContext", "toString", new String[]{}, new String[]{}, false, 6, new String[][]{{"com.fasterxml.jackson.core.json.JsonWriteContext", "writeFieldName", "java.lang.String", "-1"}, {"com.fasterxml.jackson.core.json.JsonWriteContext", "getCurrentName", ""}, {"com.fasterxml.jackson.core.json.JsonWriteContext", "toString", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("/", String.valueOf(actual));
  assertEquals("receiver state after the call", "/ {getCurrentIndex=0, getCurrentName=-1, getEntryCount=0, getTypeDesc=?}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput271() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.json.JsonWriteContext", "com.fasterxml.jackson.core.json.JsonWriteContext", "toString", new String[]{}, new String[]{}, false, 7, new String[][]{{"com.fasterxml.jackson.core.json.JsonWriteContext", "writeFieldName", "java.lang.String", "-1"}, {"com.fasterxml.jackson.core.json.JsonWriteContext", "getCurrentName", ""}, {"com.fasterxml.jackson.core.json.JsonWriteContext", "toString", ""}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("/", String.valueOf(actual));
  assertEquals("receiver state after the call", "/ {getCurrentIndex=0, getCurrentName=-1, getEntryCount=0, getTypeDesc=?}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput272() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.json.JsonWriteContext", "com.fasterxml.jackson.core.json.JsonWriteContext", "toString", new String[]{}, new String[]{}, false, 7, new String[][]{{"com.fasterxml.jackson.core.json.JsonWriteContext", "writeFieldName", "java.lang.String", "'"}, {"com.fasterxml.jackson.core.json.JsonWriteContext", "toString", ""}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("/", String.valueOf(actual));
  assertEquals("receiver state after the call", "/ {getCurrentIndex=0, getCurrentName=', getEntryCount=0, getTypeDesc=?}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput273() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.json.JsonWriteContext", "com.fasterxml.jackson.core.json.JsonWriteContext", "toString", new String[]{}, new String[]{}, false, 8, new String[][]{{"com.fasterxml.jackson.core.json.JsonWriteContext", "writeFieldName", "java.lang.String", "L'"}, {"com.fasterxml.jackson.core.json.JsonWriteContext", "toString", ""}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("/", String.valueOf(actual));
  assertEquals("receiver state after the call", "/ {getCurrentIndex=0, getCurrentName=L', getEntryCount=0, getTypeDesc=?}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput274() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.json.JsonWriteContext", "com.fasterxml.jackson.core.json.JsonWriteContext", "toString", new String[]{}, new String[]{}, false, 8, new String[][]{{"com.fasterxml.jackson.core.json.JsonWriteContext", "writeFieldName", "java.lang.String", "L'"}, {"com.fasterxml.jackson.core.json.JsonWriteContext", "toString", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("/", String.valueOf(actual));
  assertEquals("receiver state after the call", "/ {getCurrentIndex=0, getCurrentName=L', getEntryCount=0, getTypeDesc=?}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput275() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.json.JsonWriteContext", "com.fasterxml.jackson.core.json.JsonWriteContext", "createRootContext", new String[]{}, new String[]{}, true), new String[][]{{"writeFieldName", "java.lang.String", "4"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput276() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.json.JsonWriteContext", "com.fasterxml.jackson.core.json.JsonWriteContext", "setCurrentValue", new String[]{"java.lang.Object"}, new String[]{"<b:true>"}, false, 0, new String[][]{{"com.fasterxml.jackson.core.json.JsonWriteContext", "setCurrentValue", "java.lang.Object", "<b:true>"}, {"com.fasterxml.jackson.core.json.JsonWriteContext", "writeFieldName", "java.lang.String", "/a/b"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "/ {getCurrentIndex=0, getCurrentName=/a/b, getEntryCount=0, getTypeDesc=?}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput277() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.json.JsonWriteContext", "com.fasterxml.jackson.core.json.JsonWriteContext", "setCurrentValue", new String[]{"java.lang.Object"}, new String[]{"<b:true>"}, false, 0, new String[][]{{"com.fasterxml.jackson.core.json.JsonWriteContext", "writeFieldName", "java.lang.String", "/a/_b"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "/ {getCurrentIndex=0, getCurrentName=/a/_b, getEntryCount=0, getTypeDesc=?}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput278() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.json.JsonWriteContext", "com.fasterxml.jackson.core.json.JsonWriteContext", "setCurrentValue", new String[]{"java.lang.Object"}, new String[]{"<b:true>"}, false, 0, new String[][]{{"com.fasterxml.jackson.core.json.JsonWriteContext", "writeFieldName", "java.lang.String", "Hello, World"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "/ {getCurrentIndex=0, getCurrentName=Hello, World, getEntryCount=0, getTypeDesc=?}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput279() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.json.JsonWriteContext", "com.fasterxml.jackson.core.json.JsonWriteContext", "createRootContext", new String[]{"com.fasterxml.jackson.core.json.DupDetector"}, new String[]{"<null>"}, true), new String[][]{{"getTypeDesc", "", "3"}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("ROOT", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput280() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.json.JsonWriteContext", "com.fasterxml.jackson.core.json.JsonWriteContext", "createChildArrayContext", new String[]{}, new String[]{}, false, 11, new String[][]{{"com.fasterxml.jackson.core.json.JsonWriteContext", "toString", ""}, {"com.fasterxml.jackson.core.json.JsonWriteContext", "getEntryCount", ""}}, 1), new String[][]{{"getCurrentIndex", "", "2"}, {"getCurrentName", "", "5"}, {"inArray", "", "7"}, {"getCurrentValue", "", "7"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "/ {getCurrentIndex=0, getCurrentName=null, getEntryCount=0, getTypeDesc=?}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput281() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.json.JsonWriteContext", "com.fasterxml.jackson.core.json.JsonWriteContext", "getParent", new String[]{}, new String[]{}, false, 4, new String[][]{{"com.fasterxml.jackson.core.json.JsonWriteContext", "withDupDetector", "com.fasterxml.jackson.core.json.DupDetector", "<sample:3>"}}, 1);
  assertNull(actual);
  assertEquals("receiver state after the call", "/ {getCurrentIndex=0, getCurrentName=null, getEntryCount=0, getTypeDesc=ROOT}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput282() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.json.JsonWriteContext", "com.fasterxml.jackson.core.json.JsonWriteContext", "getParent", new String[]{}, new String[]{}, false, 5, new String[][]{{"com.fasterxml.jackson.core.json.JsonWriteContext", "withDupDetector", "com.fasterxml.jackson.core.json.DupDetector", "<sample:0>"}}, 1), new String[][]{{"inArray", "", "6"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "/ {getCurrentIndex=0, getCurrentName=null, getEntryCount=0, getTypeDesc=?}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput283() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.json.JsonWriteContext", "com.fasterxml.jackson.core.json.JsonWriteContext", "getCurrentValue", new String[]{}, new String[]{}, false, 2, new String[][]{{"com.fasterxml.jackson.core.json.JsonWriteContext", "getTypeDesc", ""}}, 3);
  assertNull(actual);
  assertEquals("receiver state after the call", "[0] {getCurrentIndex=0, getCurrentName=null, getEntryCount=0, getTypeDesc=ARRAY}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput284() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.json.JsonWriteContext", "com.fasterxml.jackson.core.json.JsonWriteContext", "toString", new String[]{}, new String[]{}, false, 2, new String[][]{{"com.fasterxml.jackson.core.json.JsonWriteContext", "createChildObjectContext", ""}, {"com.fasterxml.jackson.core.json.JsonWriteContext", "getTypeDesc", ""}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("[0]", String.valueOf(actual));
  assertEquals("receiver state after the call", "[0] {getCurrentIndex=0, getCurrentName=null, getEntryCount=0, getTypeDesc=ARRAY}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput285() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.json.JsonWriteContext", "com.fasterxml.jackson.core.json.JsonWriteContext", "toString", new String[]{}, new String[]{}, false, 3, new String[][]{{"com.fasterxml.jackson.core.json.JsonWriteContext", "createChildObjectContext", ""}, {"com.fasterxml.jackson.core.json.JsonWriteContext", "getTypeDesc", ""}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("/", String.valueOf(actual));
  assertEquals("receiver state after the call", "/ {getCurrentIndex=0, getCurrentName=null, getEntryCount=0, getTypeDesc=?}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput286() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.json.JsonWriteContext", "com.fasterxml.jackson.core.json.JsonWriteContext", "reset", new String[]{"int"}, new String[]{"1"}, false, 0, new String[][]{{"com.fasterxml.jackson.core.json.JsonWriteContext", "toString", ""}}), new String[][]{{"inObject", "", "4"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "[0] {getCurrentIndex=0, getCurrentName=null, getEntryCount=0, getTypeDesc=ARRAY}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput287() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.json.JsonWriteContext", "com.fasterxml.jackson.core.json.JsonWriteContext", "reset", new String[]{"int"}, new String[]{"-2147483648"}, false, 0, null, 3);
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.core.json.JsonWriteContext", actual.getClass().getName());
  assertEquals("/ {getCurrentIndex=0, getCurrentName=null, getEntryCount=0, getTypeDesc=?}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "/ {getCurrentIndex=0, getCurrentName=null, getEntryCount=0, getTypeDesc=?}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput288() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.json.JsonWriteContext", "com.fasterxml.jackson.core.json.JsonWriteContext", "reset", new String[]{"int"}, new String[]{"0"}, false, 0, null, 3);
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.core.json.JsonWriteContext", actual.getClass().getName());
  assertEquals("/ {getCurrentIndex=0, getCurrentName=null, getEntryCount=0, getTypeDesc=ROOT}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "/ {getCurrentIndex=0, getCurrentName=null, getEntryCount=0, getTypeDesc=ROOT}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput289() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.json.JsonWriteContext", "com.fasterxml.jackson.core.json.JsonWriteContext", "getCurrentName", new String[]{}, new String[]{}, false, 0, new String[][]{{"com.fasterxml.jackson.core.json.JsonWriteContext", "writeFieldName", "java.lang.String", "2020-01-01"}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("2020-01-01", String.valueOf(actual));
  assertEquals("receiver state after the call", "/ {getCurrentIndex=0, getCurrentName=2020-01-01, getEntryCount=0, getTypeDesc=?}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput290() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.json.JsonWriteContext", "com.fasterxml.jackson.core.json.JsonWriteContext", "getCurrentName", new String[]{}, new String[]{}, false, 0, new String[][]{{"com.fasterxml.jackson.core.json.JsonWriteContext", "writeFieldName", "java.lang.String", "020-01-01"}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("020-01-01", String.valueOf(actual));
  assertEquals("receiver state after the call", "/ {getCurrentIndex=0, getCurrentName=020-01-01, getEntryCount=0, getTypeDesc=?}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput291() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.json.JsonWriteContext", "com.fasterxml.jackson.core.json.JsonWriteContext", "getCurrentName", new String[]{}, new String[]{}, false, 1, new String[][]{{"com.fasterxml.jackson.core.json.JsonWriteContext", "writeFieldName", "java.lang.String", "020-01-01"}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("020-01-01", String.valueOf(actual));
  assertEquals("receiver state after the call", "/ {getCurrentIndex=0, getCurrentName=020-01-01, getEntryCount=0, getTypeDesc=ROOT}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput292() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.json.JsonWriteContext", "com.fasterxml.jackson.core.json.JsonWriteContext", "getCurrentName", new String[]{}, new String[]{}, false, 2, new String[][]{{"com.fasterxml.jackson.core.json.JsonWriteContext", "writeFieldName", "java.lang.String", "020-01-01"}, {"com.fasterxml.jackson.core.json.JsonWriteContext", "setCurrentValue", "java.lang.Object", "<d:1.5>"}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("020-01-01", String.valueOf(actual));
  assertEquals("receiver state after the call", "[0] {getCurrentIndex=0, getCurrentName=020-01-01, getEntryCount=0, getTypeDesc=ARRAY}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput293() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.json.JsonWriteContext", "com.fasterxml.jackson.core.json.JsonWriteContext", "inArray", new String[]{}, new String[]{}, false, 3, new String[][]{{"com.fasterxml.jackson.core.json.JsonWriteContext", "getParent", ""}, {"com.fasterxml.jackson.core.json.JsonWriteContext", "inRoot", ""}, {"com.fasterxml.jackson.core.json.JsonWriteContext", "withDupDetector", "com.fasterxml.jackson.core.json.DupDetector", "<sample:3>"}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "/ {getCurrentIndex=0, getCurrentName=null, getEntryCount=0, getTypeDesc=?}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput294() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.json.JsonWriteContext", "com.fasterxml.jackson.core.json.JsonWriteContext", "inArray", new String[]{}, new String[]{}, false, 4, new String[][]{{"com.fasterxml.jackson.core.json.JsonWriteContext", "getParent", ""}, {"com.fasterxml.jackson.core.json.JsonWriteContext", "inRoot", ""}, {"com.fasterxml.jackson.core.json.JsonWriteContext", "withDupDetector", "com.fasterxml.jackson.core.json.DupDetector", "<sample:3>"}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "/ {getCurrentIndex=0, getCurrentName=null, getEntryCount=0, getTypeDesc=ROOT}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput295() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.json.JsonWriteContext", "com.fasterxml.jackson.core.json.JsonWriteContext", "inArray", new String[]{}, new String[]{}, false, 16, new String[][]{{"com.fasterxml.jackson.core.json.JsonWriteContext", "getParent", ""}, {"com.fasterxml.jackson.core.json.JsonWriteContext", "withDupDetector", "com.fasterxml.jackson.core.json.DupDetector", "<sample:0>"}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "/ {getCurrentIndex=0, getCurrentName=null, getEntryCount=0, getTypeDesc=ROOT}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput296() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.json.JsonWriteContext", "com.fasterxml.jackson.core.json.JsonWriteContext", "getParent", new String[]{}, new String[]{}, false, 9, new String[][]{{"com.fasterxml.jackson.core.json.JsonWriteContext", "reset", "int", "-2113929216"}, {"com.fasterxml.jackson.core.json.JsonWriteContext", "inArray", ""}, {"com.fasterxml.jackson.core.json.JsonWriteContext", "withDupDetector", "com.fasterxml.jackson.core.json.DupDetector", "<sample:3>"}}), new String[][]{{"getEntryCount", "", "0"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "/ {getCurrentIndex=0, getCurrentName=null, getEntryCount=0, getTypeDesc=?}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput297() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.json.JsonWriteContext", "com.fasterxml.jackson.core.json.JsonWriteContext", "getParent", new String[]{}, new String[]{}, false, 1, new String[][]{{"com.fasterxml.jackson.core.json.JsonWriteContext", "writeValue", ""}}, 1);
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.core.json.JsonWriteContext", actual.getClass().getName());
  assertEquals("/ {getCurrentIndex=0, getCurrentName=null, getEntryCount=0, getTypeDesc=?}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "/ {getCurrentIndex=0, getCurrentName=null, getEntryCount=1, getTypeDesc=ROOT}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput298() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.json.JsonWriteContext", "com.fasterxml.jackson.core.json.JsonWriteContext", "getParent", new String[]{}, new String[]{}, false, 2, new String[][]{}, 1);
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.core.json.JsonWriteContext", actual.getClass().getName());
  assertEquals("/ {getCurrentIndex=0, getCurrentName=null, getEntryCount=0, getTypeDesc=ROOT}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "[0] {getCurrentIndex=0, getCurrentName=null, getEntryCount=0, getTypeDesc=ARRAY}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput299() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.json.JsonWriteContext", "com.fasterxml.jackson.core.json.JsonWriteContext", "getDupDetector", new String[]{}, new String[]{}, false, 14, new String[][]{{"com.fasterxml.jackson.core.json.JsonWriteContext", "writeFieldName", "java.lang.String", "TITLE"}, {"com.fasterxml.jackson.core.json.JsonWriteContext", "inRoot", ""}}, 1), new String[][]{{"findLocation", "", "2"}});
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.core.JsonLocation", actual.getClass().getName());
  assertEquals("[Source: 2; line: 1, column: 5] {getByteOffset=-1, getCharOffset=4, getColumnNr=5, getLineNr=1}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "/ {getCurrentIndex=0, getCurrentName=TITLE, getEntryCount=0, getTypeDesc=?}", SearchInputFactory_scaffolding.receiverState());
 }
}
