package generated.algorithm;

import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;
import static org.junit.Assert.*;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class SimulatedAnnealingGeneratedTest {
 @Test(timeout = 20000)
 public void generatedInput000() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.impl.CreatorCollector", "com.fasterxml.jackson.databind.deser.impl.CreatorCollector", "addDoubleCreator", new String[]{"com.fasterxml.jackson.databind.introspect.AnnotatedWithParams", "boolean"}, new String[]{"<sample:8>", "false"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.deser.impl.CreatorCollector", "constructValueInstantiator", "com.fasterxml.jackson.databind.DeserializationConfig", "<sample:2>"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{hasDefaultCreator=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput001() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.impl.CreatorCollector", "com.fasterxml.jackson.databind.deser.impl.CreatorCollector", "setDefaultCreator", new String[]{"com.fasterxml.jackson.databind.introspect.AnnotatedWithParams"}, new String[]{"<sample:11>"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.deser.impl.CreatorCollector", "addStringCreator", "com.fasterxml.jackson.databind.introspect.AnnotatedWithParams", "<sample:1>"}, {"com.fasterxml.jackson.databind.deser.impl.CreatorCollector", "addPropertyCreator", "com.fasterxml.jackson.databind.introspect.AnnotatedWithParams,boolean,com.fasterxml.jackson.databind.deser.CreatorProperty[]", "<sample:0>", "false", "<sample:1>"}}, 1);
  assertNull(actual);
  assertEquals("receiver state after the call", "{hasDefaultCreator=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput002() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.impl.CreatorCollector", "com.fasterxml.jackson.databind.deser.impl.CreatorCollector", "addBooleanCreator", new String[]{"com.fasterxml.jackson.databind.introspect.AnnotatedWithParams"}, new String[]{"<sample:5>"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.deser.impl.CreatorCollector", "addIntCreator", "com.fasterxml.jackson.databind.introspect.AnnotatedWithParams,boolean", "<null>", "false"}, {"com.fasterxml.jackson.databind.deser.impl.CreatorCollector", "addLongCreator", "com.fasterxml.jackson.databind.introspect.AnnotatedWithParams", "<sample:6>"}, {"com.fasterxml.jackson.databind.deser.impl.CreatorCollector", "addLongCreator", "com.fasterxml.jackson.databind.introspect.AnnotatedWithParams,boolean", "<sample:12>", "false"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput003() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.impl.CreatorCollector", "com.fasterxml.jackson.databind.deser.impl.CreatorCollector", "constructValueInstantiator", new String[]{"com.fasterxml.jackson.databind.DeserializationConfig"}, new String[]{"<sample:10>"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.deser.impl.CreatorCollector", "addIncompeteParameter", "com.fasterxml.jackson.databind.introspect.AnnotatedParameter", "<sample:2>"}, {"com.fasterxml.jackson.databind.deser.impl.CreatorCollector", "addIncompeteParameter", "com.fasterxml.jackson.databind.introspect.AnnotatedParameter", "<sample:5>"}, {"com.fasterxml.jackson.databind.deser.impl.CreatorCollector", "addLongCreator", "com.fasterxml.jackson.databind.introspect.AnnotatedWithParams", "<sample:1>"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput004() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.impl.CreatorCollector", "com.fasterxml.jackson.databind.deser.impl.CreatorCollector", "addDelegatingCreator", new String[]{"com.fasterxml.jackson.databind.introspect.AnnotatedWithParams", "com.fasterxml.jackson.databind.deser.CreatorProperty[]"}, new String[]{"<sample:7>", "<sample:13>"}, false, 12, new String[][]{{"com.fasterxml.jackson.databind.deser.impl.CreatorCollector", "addPropertyCreator", "com.fasterxml.jackson.databind.introspect.AnnotatedWithParams,com.fasterxml.jackson.databind.deser.CreatorProperty[]", "<sample:3>", "<sample:8>"}, {"com.fasterxml.jackson.databind.deser.impl.CreatorCollector", "addPropertyCreator", "com.fasterxml.jackson.databind.introspect.AnnotatedWithParams,boolean,com.fasterxml.jackson.databind.deser.CreatorProperty[]", "<sample:10>", "true", "<sample:10>"}, {"com.fasterxml.jackson.databind.deser.impl.CreatorCollector", "addDelegatingCreator", "com.fasterxml.jackson.databind.introspect.AnnotatedWithParams,boolean,com.fasterxml.jackson.databind.deser.CreatorProperty[]", "<sample:11>", "false", "<sample:7>"}}, 1);
  assertNull(actual);
  assertEquals("receiver state after the call", "{hasDefaultCreator=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput005() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.impl.CreatorCollector", "com.fasterxml.jackson.databind.deser.impl.CreatorCollector", "addBooleanCreator", new String[]{"com.fasterxml.jackson.databind.introspect.AnnotatedWithParams"}, new String[]{"<sample:2>"}, false, 7, new String[][]{{"com.fasterxml.jackson.databind.deser.impl.CreatorCollector", "addPropertyCreator", "com.fasterxml.jackson.databind.introspect.AnnotatedWithParams,com.fasterxml.jackson.databind.deser.CreatorProperty[]", "<sample:10>", "<sample:11>"}, {"com.fasterxml.jackson.databind.deser.impl.CreatorCollector", "addLongCreator", "com.fasterxml.jackson.databind.introspect.AnnotatedWithParams", "<sample:11>"}, {"com.fasterxml.jackson.databind.deser.impl.CreatorCollector", "addDoubleCreator", "com.fasterxml.jackson.databind.introspect.AnnotatedWithParams", "<sample:18>"}}, 2);
  assertNull(actual);
  assertEquals("receiver state after the call", "{hasDefaultCreator=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput006() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.impl.CreatorCollector", "com.fasterxml.jackson.databind.deser.impl.CreatorCollector", "verifyNonDup", new String[]{"com.fasterxml.jackson.databind.introspect.AnnotatedWithParams", "int", "boolean"}, new String[]{"<sample:10>", "131064", "false"}, false, 1, new String[][]{{"com.fasterxml.jackson.databind.deser.impl.CreatorCollector", "addDelegatingCreator", "com.fasterxml.jackson.databind.introspect.AnnotatedWithParams,com.fasterxml.jackson.databind.deser.CreatorProperty[]", "<sample:12>", "<sample:0>"}, {"com.fasterxml.jackson.databind.deser.impl.CreatorCollector", "constructValueInstantiator", "com.fasterxml.jackson.databind.DeserializationConfig", "<sample:0>"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.ArrayIndexOutOfBoundsException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput007() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.impl.CreatorCollector", "com.fasterxml.jackson.databind.deser.impl.CreatorCollector", "addIntCreator", new String[]{"com.fasterxml.jackson.databind.introspect.AnnotatedWithParams"}, new String[]{"<sample:10>"}, false, 9, new String[][]{{"com.fasterxml.jackson.databind.deser.impl.CreatorCollector", "verifyNonDup", "com.fasterxml.jackson.databind.introspect.AnnotatedWithParams,int,boolean", "<sample:2>", "5", "true"}, {"com.fasterxml.jackson.databind.deser.impl.CreatorCollector", "addPropertyCreator", "com.fasterxml.jackson.databind.introspect.AnnotatedWithParams,boolean,com.fasterxml.jackson.databind.deser.CreatorProperty[]", "<sample:4>", "true", "<sample:11>"}, {"com.fasterxml.jackson.databind.deser.impl.CreatorCollector", "setDefaultCreator", "com.fasterxml.jackson.databind.introspect.AnnotatedWithParams", "<sample:4>"}}, 3);
  assertNull(actual);
  assertEquals("receiver state after the call", "{hasDefaultCreator=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput008() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.impl.CreatorCollector", "com.fasterxml.jackson.databind.deser.impl.CreatorCollector", "addDelegatingCreator", new String[]{"com.fasterxml.jackson.databind.introspect.AnnotatedWithParams", "boolean", "com.fasterxml.jackson.databind.deser.CreatorProperty[]"}, new String[]{"<sample:13>", "false", "<null>"}, false, 5, new String[][]{{"com.fasterxml.jackson.databind.deser.impl.CreatorCollector", "addDelegatingCreator", "com.fasterxml.jackson.databind.introspect.AnnotatedWithParams,com.fasterxml.jackson.databind.deser.CreatorProperty[]", "<sample:7>", "<null>"}, {"com.fasterxml.jackson.databind.deser.impl.CreatorCollector", "addLongCreator", "com.fasterxml.jackson.databind.introspect.AnnotatedWithParams,boolean", "<sample:12>", "false"}, {"com.fasterxml.jackson.databind.deser.impl.CreatorCollector", "constructValueInstantiator", "com.fasterxml.jackson.databind.DeserializationConfig", "<sample:6>"}}, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput009() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.impl.CreatorCollector", "com.fasterxml.jackson.databind.deser.impl.CreatorCollector", "addDelegatingCreator", new String[]{"com.fasterxml.jackson.databind.introspect.AnnotatedWithParams", "boolean", "com.fasterxml.jackson.databind.deser.CreatorProperty[]"}, new String[]{"<sample:12>", "true", "<sample:3>"}, false, 5, new String[][]{{"com.fasterxml.jackson.databind.deser.impl.CreatorCollector", "addDelegatingCreator", "com.fasterxml.jackson.databind.introspect.AnnotatedWithParams,boolean,com.fasterxml.jackson.databind.deser.CreatorProperty[]", "<sample:12>", "true", "<sample:2>"}, {"com.fasterxml.jackson.databind.deser.impl.CreatorCollector", "addDoubleCreator", "com.fasterxml.jackson.databind.introspect.AnnotatedWithParams", "<sample:10>"}, {"com.fasterxml.jackson.databind.deser.impl.CreatorCollector", "constructValueInstantiator", "com.fasterxml.jackson.databind.DeserializationConfig", "<sample:3>"}}, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput010() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.impl.CreatorCollector", "com.fasterxml.jackson.databind.deser.impl.CreatorCollector", "verifyNonDup", new String[]{"com.fasterxml.jackson.databind.introspect.AnnotatedWithParams", "int"}, new String[]{"<sample:19>", "0"}, false, 5, new String[][]{{"com.fasterxml.jackson.databind.deser.impl.CreatorCollector", "addPropertyCreator", "com.fasterxml.jackson.databind.introspect.AnnotatedWithParams,boolean,com.fasterxml.jackson.databind.deser.CreatorProperty[]", "<sample:3>", "true", "<sample:12>"}, {"com.fasterxml.jackson.databind.deser.impl.CreatorCollector", "constructValueInstantiator", "com.fasterxml.jackson.databind.DeserializationConfig", "<sample:10>"}}, 2), new String[][]{{"getModifiers", "", "6"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("1025", String.valueOf(actual));
  assertEquals("receiver state after the call", "{hasDefaultCreator=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput011() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.impl.CreatorCollector", "com.fasterxml.jackson.databind.deser.impl.CreatorCollector", "verifyNonDup", new String[]{"com.fasterxml.jackson.databind.introspect.AnnotatedWithParams", "int"}, new String[]{"<sample:7>", "5"}, false, 1, new String[][]{{"com.fasterxml.jackson.databind.deser.impl.CreatorCollector", "addDelegatingCreator", "com.fasterxml.jackson.databind.introspect.AnnotatedWithParams,com.fasterxml.jackson.databind.deser.CreatorProperty[]", "<sample:7>", "<sample:0>"}}, 3);
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.databind.introspect.AnnotatedMethod", actual.getClass().getName());
  assertEquals("[method java.util.List#get(1 params)] {getAnnotationCount=0, getFullName=java.util.List#get(1 params), getGenericParameterTypes=[int], getModifiers=1025, getName=get, getParameterCount=1, getRawParame...#250#-1323839922", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{hasDefaultCreator=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput012() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.impl.CreatorCollector", "com.fasterxml.jackson.databind.deser.impl.CreatorCollector", "verifyNonDup", new String[]{"com.fasterxml.jackson.databind.introspect.AnnotatedWithParams", "int"}, new String[]{"<sample:7>", "48"}, false, 1, new String[][]{{"com.fasterxml.jackson.databind.deser.impl.CreatorCollector", "addDelegatingCreator", "com.fasterxml.jackson.databind.introspect.AnnotatedWithParams,com.fasterxml.jackson.databind.deser.CreatorProperty[]", "<sample:7>", "<sample:0>"}}, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.ArrayIndexOutOfBoundsException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput013() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.impl.CreatorCollector", "com.fasterxml.jackson.databind.deser.impl.CreatorCollector", "verifyNonDup", new String[]{"com.fasterxml.jackson.databind.introspect.AnnotatedWithParams", "int"}, new String[]{"<sample:9>", "-4"}, false, 1, new String[][]{{"com.fasterxml.jackson.databind.deser.impl.CreatorCollector", "addDoubleCreator", "com.fasterxml.jackson.databind.introspect.AnnotatedWithParams", "<sample:7>"}, {"com.fasterxml.jackson.databind.deser.impl.CreatorCollector", "addDelegatingCreator", "com.fasterxml.jackson.databind.introspect.AnnotatedWithParams,com.fasterxml.jackson.databind.deser.CreatorProperty[]", "<sample:7>", "<sample:0>"}}, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.ArrayIndexOutOfBoundsException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput014() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.impl.CreatorCollector", "com.fasterxml.jackson.databind.deser.impl.CreatorCollector", "hasDefaultCreator", new String[]{}, new String[]{}, false, 3, new String[][]{{"com.fasterxml.jackson.databind.deser.impl.CreatorCollector", "addDoubleCreator", "com.fasterxml.jackson.databind.introspect.AnnotatedWithParams,boolean", "<sample:2>", "false"}, {"com.fasterxml.jackson.databind.deser.impl.CreatorCollector", "addDelegatingCreator", "com.fasterxml.jackson.databind.introspect.AnnotatedWithParams,boolean,com.fasterxml.jackson.databind.deser.CreatorProperty[]", "<sample:6>", "false", "<null>"}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{hasDefaultCreator=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput015() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.impl.CreatorCollector", "com.fasterxml.jackson.databind.deser.impl.CreatorCollector", "hasDefaultCreator", new String[]{}, new String[]{}, false, 3, new String[][]{{"com.fasterxml.jackson.databind.deser.impl.CreatorCollector", "addDoubleCreator", "com.fasterxml.jackson.databind.introspect.AnnotatedWithParams,boolean", "<sample:2>", "false"}, {"com.fasterxml.jackson.databind.deser.impl.CreatorCollector", "addDelegatingCreator", "com.fasterxml.jackson.databind.introspect.AnnotatedWithParams,boolean,com.fasterxml.jackson.databind.deser.CreatorProperty[]", "<sample:8>", "false", "<null>"}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{hasDefaultCreator=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput016() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.impl.CreatorCollector", "com.fasterxml.jackson.databind.deser.impl.CreatorCollector", "setDefaultCreator", new String[]{"com.fasterxml.jackson.databind.introspect.AnnotatedWithParams"}, new String[]{"<sample:2>"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.deser.impl.CreatorCollector", "addStringCreator", "com.fasterxml.jackson.databind.introspect.AnnotatedWithParams", "<sample:1>"}}, 1);
  assertNull(actual);
  assertEquals("receiver state after the call", "{hasDefaultCreator=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput017() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.impl.CreatorCollector", "com.fasterxml.jackson.databind.deser.impl.CreatorCollector", "addPropertyCreator", new String[]{"com.fasterxml.jackson.databind.introspect.AnnotatedWithParams", "boolean", "com.fasterxml.jackson.databind.deser.CreatorProperty[]"}, new String[]{"<sample:11>", "false", "<sample:1>"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.deser.impl.CreatorCollector", "addPropertyCreator", "com.fasterxml.jackson.databind.introspect.AnnotatedWithParams,com.fasterxml.jackson.databind.deser.CreatorProperty[]", "<null>", "<sample:2>"}, {"com.fasterxml.jackson.databind.deser.impl.CreatorCollector", "addStringCreator", "com.fasterxml.jackson.databind.introspect.AnnotatedWithParams", "<sample:9>"}, {"com.fasterxml.jackson.databind.deser.impl.CreatorCollector", "addIntCreator", "com.fasterxml.jackson.databind.introspect.AnnotatedWithParams,boolean", "<sample:11>", "false"}}, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput018() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.impl.CreatorCollector", "com.fasterxml.jackson.databind.deser.impl.CreatorCollector", "addPropertyCreator", new String[]{"com.fasterxml.jackson.databind.introspect.AnnotatedWithParams", "boolean", "com.fasterxml.jackson.databind.deser.CreatorProperty[]"}, new String[]{"<sample:7>", "false", "<sample:1>"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.deser.impl.CreatorCollector", "addPropertyCreator", "com.fasterxml.jackson.databind.introspect.AnnotatedWithParams,com.fasterxml.jackson.databind.deser.CreatorProperty[]", "<null>", "<empty>"}, {"com.fasterxml.jackson.databind.deser.impl.CreatorCollector", "addStringCreator", "com.fasterxml.jackson.databind.introspect.AnnotatedWithParams", "<sample:12>"}}, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput019() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.impl.CreatorCollector", "com.fasterxml.jackson.databind.deser.impl.CreatorCollector", "addPropertyCreator", new String[]{"com.fasterxml.jackson.databind.introspect.AnnotatedWithParams", "boolean", "com.fasterxml.jackson.databind.deser.CreatorProperty[]"}, new String[]{"<sample:8>", "false", "<sample:1>"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.deser.impl.CreatorCollector", "addPropertyCreator", "com.fasterxml.jackson.databind.introspect.AnnotatedWithParams,com.fasterxml.jackson.databind.deser.CreatorProperty[]", "<sample:9>", "<empty>"}, {"com.fasterxml.jackson.databind.deser.impl.CreatorCollector", "addStringCreator", "com.fasterxml.jackson.databind.introspect.AnnotatedWithParams", "<sample:10>"}}, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput020() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.impl.CreatorCollector", "com.fasterxml.jackson.databind.deser.impl.CreatorCollector", "addPropertyCreator", new String[]{"com.fasterxml.jackson.databind.introspect.AnnotatedWithParams", "boolean", "com.fasterxml.jackson.databind.deser.CreatorProperty[]"}, new String[]{"<sample:8>", "true", "<empty>"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.deser.impl.CreatorCollector", "addPropertyCreator", "com.fasterxml.jackson.databind.introspect.AnnotatedWithParams,com.fasterxml.jackson.databind.deser.CreatorProperty[]", "<sample:9>", "<null>"}, {"com.fasterxml.jackson.databind.deser.impl.CreatorCollector", "addStringCreator", "com.fasterxml.jackson.databind.introspect.AnnotatedWithParams", "<sample:10>"}}, 1);
  assertNull(actual);
  assertEquals("receiver state after the call", "{hasDefaultCreator=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput021() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.impl.CreatorCollector", "com.fasterxml.jackson.databind.deser.impl.CreatorCollector", "addDelegatingCreator", new String[]{"com.fasterxml.jackson.databind.introspect.AnnotatedWithParams", "boolean", "com.fasterxml.jackson.databind.deser.CreatorProperty[]"}, new String[]{"<sample:6>", "true", "<sample:1>"}, false, 0, null, 1);
  assertNull(actual);
  assertEquals("receiver state after the call", "{hasDefaultCreator=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput022() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.impl.CreatorCollector", "com.fasterxml.jackson.databind.deser.impl.CreatorCollector", "addDelegatingCreator", new String[]{"com.fasterxml.jackson.databind.introspect.AnnotatedWithParams", "boolean", "com.fasterxml.jackson.databind.deser.CreatorProperty[]"}, new String[]{"<sample:6>", "false", "<sample:1>"}, false, 1, new String[][]{}, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput023() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.impl.CreatorCollector", "com.fasterxml.jackson.databind.deser.impl.CreatorCollector", "verifyNonDup", new String[]{"com.fasterxml.jackson.databind.introspect.AnnotatedWithParams", "int", "boolean"}, new String[]{"<sample:4>", "-4120", "false"}, false, 0, null, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.ArrayIndexOutOfBoundsException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput024() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.impl.CreatorCollector", "com.fasterxml.jackson.databind.deser.impl.CreatorCollector", "verifyNonDup", new String[]{"com.fasterxml.jackson.databind.introspect.AnnotatedWithParams", "int", "boolean"}, new String[]{"<sample:4>", "4", "true"}, false, 0, null, 3);
  assertNull(actual);
  assertEquals("receiver state after the call", "{hasDefaultCreator=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput025() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.impl.CreatorCollector", "com.fasterxml.jackson.databind.deser.impl.CreatorCollector", "addBooleanCreator", new String[]{"com.fasterxml.jackson.databind.introspect.AnnotatedWithParams"}, new String[]{"<sample:1>"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.deser.impl.CreatorCollector", "addDelegatingCreator", "com.fasterxml.jackson.databind.introspect.AnnotatedWithParams,boolean,com.fasterxml.jackson.databind.deser.CreatorProperty[]", "<sample:7>", "false", "<sample:2>"}}, 3);
  assertNull(actual);
  assertEquals("receiver state after the call", "{hasDefaultCreator=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput026() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.impl.CreatorCollector", "com.fasterxml.jackson.databind.deser.impl.CreatorCollector", "addBooleanCreator", new String[]{"com.fasterxml.jackson.databind.introspect.AnnotatedWithParams"}, new String[]{"<sample:14>"}, false, 0, null, 2);
  assertNull(actual);
  assertEquals("receiver state after the call", "{hasDefaultCreator=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput027() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.impl.CreatorCollector", "com.fasterxml.jackson.databind.deser.impl.CreatorCollector", "addBooleanCreator", new String[]{"com.fasterxml.jackson.databind.introspect.AnnotatedWithParams"}, new String[]{"<sample:4>"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.deser.impl.CreatorCollector", "addLongCreator", "com.fasterxml.jackson.databind.introspect.AnnotatedWithParams,boolean", "<sample:9>", "true"}}, 2);
  assertNull(actual);
  assertEquals("receiver state after the call", "{hasDefaultCreator=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput028() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.impl.CreatorCollector", "com.fasterxml.jackson.databind.deser.impl.CreatorCollector", "addBooleanCreator", new String[]{"com.fasterxml.jackson.databind.introspect.AnnotatedWithParams"}, new String[]{"<sample:6>"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.deser.impl.CreatorCollector", "addLongCreator", "com.fasterxml.jackson.databind.introspect.AnnotatedWithParams", "<sample:6>"}, {"com.fasterxml.jackson.databind.deser.impl.CreatorCollector", "addLongCreator", "com.fasterxml.jackson.databind.introspect.AnnotatedWithParams,boolean", "<sample:9>", "true"}}, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput029() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.impl.CreatorCollector", "com.fasterxml.jackson.databind.deser.impl.CreatorCollector", "addDoubleCreator", new String[]{"com.fasterxml.jackson.databind.introspect.AnnotatedWithParams", "boolean"}, new String[]{"<sample:7>", "true"}, false, 0, null, 1);
  assertNull(actual);
  assertEquals("receiver state after the call", "{hasDefaultCreator=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput030() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.impl.CreatorCollector", "com.fasterxml.jackson.databind.deser.impl.CreatorCollector", "addLongCreator", new String[]{"com.fasterxml.jackson.databind.introspect.AnnotatedWithParams", "boolean"}, new String[]{"<sample:6>", "true"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.deser.impl.CreatorCollector", "addBooleanCreator", "com.fasterxml.jackson.databind.introspect.AnnotatedWithParams", "<sample:6>"}}, 3);
  assertNull(actual);
  assertEquals("receiver state after the call", "{hasDefaultCreator=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput031() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.impl.CreatorCollector", "com.fasterxml.jackson.databind.deser.impl.CreatorCollector", "addDelegatingCreator", new String[]{"com.fasterxml.jackson.databind.introspect.AnnotatedWithParams", "boolean", "com.fasterxml.jackson.databind.deser.CreatorProperty[]"}, new String[]{"<sample:8>", "false", "<sample:0>"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.deser.impl.CreatorCollector", "addIntCreator", "com.fasterxml.jackson.databind.introspect.AnnotatedWithParams", "<sample:1>"}, {"com.fasterxml.jackson.databind.deser.impl.CreatorCollector", "constructValueInstantiator", "com.fasterxml.jackson.databind.DeserializationConfig", "<sample:2>"}, {"com.fasterxml.jackson.databind.deser.impl.CreatorCollector", "setDefaultCreator", "com.fasterxml.jackson.databind.introspect.AnnotatedWithParams", "<sample:5>"}}, 3);
  assertNull(actual);
  assertEquals("receiver state after the call", "{hasDefaultCreator=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput032() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.impl.CreatorCollector", "com.fasterxml.jackson.databind.deser.impl.CreatorCollector", "addDelegatingCreator", new String[]{"com.fasterxml.jackson.databind.introspect.AnnotatedWithParams", "boolean", "com.fasterxml.jackson.databind.deser.CreatorProperty[]"}, new String[]{"<sample:3>", "true", "<sample:0>"}, false, 11, new String[][]{{"com.fasterxml.jackson.databind.deser.impl.CreatorCollector", "addIntCreator", "com.fasterxml.jackson.databind.introspect.AnnotatedWithParams", "<sample:1>"}, {"com.fasterxml.jackson.databind.deser.impl.CreatorCollector", "constructValueInstantiator", "com.fasterxml.jackson.databind.DeserializationConfig", "<sample:2>"}, {"com.fasterxml.jackson.databind.deser.impl.CreatorCollector", "setDefaultCreator", "com.fasterxml.jackson.databind.introspect.AnnotatedWithParams", "<sample:5>"}}, 3);
  assertNull(actual);
  assertEquals("receiver state after the call", "{hasDefaultCreator=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput033() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.impl.CreatorCollector", "com.fasterxml.jackson.databind.deser.impl.CreatorCollector", "addDelegatingCreator", new String[]{"com.fasterxml.jackson.databind.introspect.AnnotatedWithParams", "boolean", "com.fasterxml.jackson.databind.deser.CreatorProperty[]"}, new String[]{"<sample:6>", "true", "<sample:0>"}, false, 11, new String[][]{{"com.fasterxml.jackson.databind.deser.impl.CreatorCollector", "addIntCreator", "com.fasterxml.jackson.databind.introspect.AnnotatedWithParams", "<sample:1>"}, {"com.fasterxml.jackson.databind.deser.impl.CreatorCollector", "constructValueInstantiator", "com.fasterxml.jackson.databind.DeserializationConfig", "<sample:2>"}, {"com.fasterxml.jackson.databind.deser.impl.CreatorCollector", "setDefaultCreator", "com.fasterxml.jackson.databind.introspect.AnnotatedWithParams", "<sample:5>"}}, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput034() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.impl.CreatorCollector", "com.fasterxml.jackson.databind.deser.impl.CreatorCollector", "addBooleanCreator", new String[]{"com.fasterxml.jackson.databind.introspect.AnnotatedWithParams", "boolean"}, new String[]{"<sample:1>", "true"}, false, 0, null, 3);
  assertNull(actual);
  assertEquals("receiver state after the call", "{hasDefaultCreator=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput035() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.impl.CreatorCollector", "com.fasterxml.jackson.databind.deser.impl.CreatorCollector", "addStringCreator", new String[]{"com.fasterxml.jackson.databind.introspect.AnnotatedWithParams"}, new String[]{"<sample:6>"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.deser.impl.CreatorCollector", "hasDefaultCreator", ""}}, 2);
  assertNull(actual);
  assertEquals("receiver state after the call", "{hasDefaultCreator=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput036() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.impl.CreatorCollector", "com.fasterxml.jackson.databind.deser.impl.CreatorCollector", "addStringCreator", new String[]{"com.fasterxml.jackson.databind.introspect.AnnotatedWithParams"}, new String[]{"<null>"}, false, 0, null, 1);
  assertNull(actual);
  assertEquals("receiver state after the call", "{hasDefaultCreator=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput037() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.impl.CreatorCollector", "com.fasterxml.jackson.databind.deser.impl.CreatorCollector", "addBooleanCreator", new String[]{"com.fasterxml.jackson.databind.introspect.AnnotatedWithParams"}, new String[]{"<sample:3>"}, false, 0, null, 1);
  assertNull(actual);
  assertEquals("receiver state after the call", "{hasDefaultCreator=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput038() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.impl.CreatorCollector", "com.fasterxml.jackson.databind.deser.impl.CreatorCollector", "addPropertyCreator", new String[]{"com.fasterxml.jackson.databind.introspect.AnnotatedWithParams", "boolean", "com.fasterxml.jackson.databind.deser.CreatorProperty[]"}, new String[]{"<sample:1>", "false", "<empty>"}, false, 0, null, 3);
  assertNull(actual);
  assertEquals("receiver state after the call", "{hasDefaultCreator=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput039() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.impl.CreatorCollector", "com.fasterxml.jackson.databind.deser.impl.CreatorCollector", "addIntCreator", new String[]{"com.fasterxml.jackson.databind.introspect.AnnotatedWithParams", "boolean"}, new String[]{"<sample:5>", "true"}, false, 12, new String[][]{{"com.fasterxml.jackson.databind.deser.impl.CreatorCollector", "addBooleanCreator", "com.fasterxml.jackson.databind.introspect.AnnotatedWithParams", "<sample:11>"}, {"com.fasterxml.jackson.databind.deser.impl.CreatorCollector", "hasDefaultCreator", ""}}, 3);
  assertNull(actual);
  assertEquals("receiver state after the call", "{hasDefaultCreator=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput040() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.impl.CreatorCollector", "com.fasterxml.jackson.databind.deser.impl.CreatorCollector", "verifyNonDup", new String[]{"com.fasterxml.jackson.databind.introspect.AnnotatedWithParams", "int", "boolean"}, new String[]{"<null>", "-2147483648", "true"}, false, 4, new String[][]{{"com.fasterxml.jackson.databind.deser.impl.CreatorCollector", "addIntCreator", "com.fasterxml.jackson.databind.introspect.AnnotatedWithParams,boolean", "<sample:7>", "false"}}, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.ArrayIndexOutOfBoundsException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput041() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.impl.CreatorCollector", "com.fasterxml.jackson.databind.deser.impl.CreatorCollector", "constructValueInstantiator", new String[]{"com.fasterxml.jackson.databind.DeserializationConfig"}, new String[]{"<sample:5>"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.deser.impl.CreatorCollector", "addIntCreator", "com.fasterxml.jackson.databind.introspect.AnnotatedWithParams", "<sample:3>"}}, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput042() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.impl.CreatorCollector", "com.fasterxml.jackson.databind.deser.impl.CreatorCollector", "hasDefaultCreator", new String[]{}, new String[]{}, false, 2, new String[][]{}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{hasDefaultCreator=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput043() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.impl.CreatorCollector", "com.fasterxml.jackson.databind.deser.impl.CreatorCollector", "addPropertyCreator", new String[]{"com.fasterxml.jackson.databind.introspect.AnnotatedWithParams", "boolean", "com.fasterxml.jackson.databind.deser.CreatorProperty[]"}, new String[]{"<sample:7>", "false", "<sample:2>"}, false, 15, new String[][]{{"com.fasterxml.jackson.databind.deser.impl.CreatorCollector", "addBooleanCreator", "com.fasterxml.jackson.databind.introspect.AnnotatedWithParams", "<sample:8>"}, {"com.fasterxml.jackson.databind.deser.impl.CreatorCollector", "addPropertyCreator", "com.fasterxml.jackson.databind.introspect.AnnotatedWithParams,com.fasterxml.jackson.databind.deser.CreatorProperty[]", "<sample:4>", "<sample:2>"}}, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput044() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.impl.CreatorCollector", "com.fasterxml.jackson.databind.deser.impl.CreatorCollector", "addDelegatingCreator", new String[]{"com.fasterxml.jackson.databind.introspect.AnnotatedWithParams", "boolean", "com.fasterxml.jackson.databind.deser.CreatorProperty[]"}, new String[]{"<sample:14>", "true", "<sample:1>"}, false, 6, new String[][]{{"com.fasterxml.jackson.databind.deser.impl.CreatorCollector", "addIncompeteParameter", "com.fasterxml.jackson.databind.introspect.AnnotatedParameter", "<null>"}, {"com.fasterxml.jackson.databind.deser.impl.CreatorCollector", "addBooleanCreator", "com.fasterxml.jackson.databind.introspect.AnnotatedWithParams,boolean", "<sample:1>", "true"}, {"com.fasterxml.jackson.databind.deser.impl.CreatorCollector", "addLongCreator", "com.fasterxml.jackson.databind.introspect.AnnotatedWithParams", "<sample:1>"}}, 2);
  assertNull(actual);
  assertEquals("receiver state after the call", "{hasDefaultCreator=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput045() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.impl.CreatorCollector", "com.fasterxml.jackson.databind.deser.impl.CreatorCollector", "addDoubleCreator", new String[]{"com.fasterxml.jackson.databind.introspect.AnnotatedWithParams"}, new String[]{"<sample:12>"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.deser.impl.CreatorCollector", "addIntCreator", "com.fasterxml.jackson.databind.introspect.AnnotatedWithParams,boolean", "<sample:1>", "true"}}, 1);
  assertNull(actual);
  assertEquals("receiver state after the call", "{hasDefaultCreator=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput046() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.impl.CreatorCollector", "com.fasterxml.jackson.databind.deser.impl.CreatorCollector", "addDoubleCreator", new String[]{"com.fasterxml.jackson.databind.introspect.AnnotatedWithParams"}, new String[]{"<sample:9>"}, false, 13, new String[][]{{"com.fasterxml.jackson.databind.deser.impl.CreatorCollector", "addPropertyCreator", "com.fasterxml.jackson.databind.introspect.AnnotatedWithParams,com.fasterxml.jackson.databind.deser.CreatorProperty[]", "<sample:8>", "<sample:1>"}, {"com.fasterxml.jackson.databind.deser.impl.CreatorCollector", "addPropertyCreator", "com.fasterxml.jackson.databind.introspect.AnnotatedWithParams,boolean,com.fasterxml.jackson.databind.deser.CreatorProperty[]", "<sample:4>", "false", "<sample:0>"}}, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput047() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.impl.CreatorCollector", "com.fasterxml.jackson.databind.deser.impl.CreatorCollector", "addIntCreator", new String[]{"com.fasterxml.jackson.databind.introspect.AnnotatedWithParams", "boolean"}, new String[]{"<sample:11>", "false"}, false, 0, null, 2);
  assertNull(actual);
  assertEquals("receiver state after the call", "{hasDefaultCreator=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput048() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.impl.CreatorCollector", "com.fasterxml.jackson.databind.deser.impl.CreatorCollector", "addIntCreator", new String[]{"com.fasterxml.jackson.databind.introspect.AnnotatedWithParams", "boolean"}, new String[]{"<sample:0>", "false"}, false, 3, new String[][]{}, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput049() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.impl.CreatorCollector", "com.fasterxml.jackson.databind.deser.impl.CreatorCollector", "addStringCreator", new String[]{"com.fasterxml.jackson.databind.introspect.AnnotatedWithParams", "boolean"}, new String[]{"<sample:9>", "false"}, false, 0, null, 1);
  assertNull(actual);
  assertEquals("receiver state after the call", "{hasDefaultCreator=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput050() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.impl.CreatorCollector", "com.fasterxml.jackson.databind.deser.impl.CreatorCollector", "setDefaultCreator", new String[]{"com.fasterxml.jackson.databind.introspect.AnnotatedWithParams"}, new String[]{"<sample:4>"}, false, 5, new String[][]{{"com.fasterxml.jackson.databind.deser.impl.CreatorCollector", "addBooleanCreator", "com.fasterxml.jackson.databind.introspect.AnnotatedWithParams", "<sample:0>"}}, 2);
  assertNull(actual);
  assertEquals("receiver state after the call", "{hasDefaultCreator=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput051() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.impl.CreatorCollector", "com.fasterxml.jackson.databind.deser.impl.CreatorCollector", "setDefaultCreator", new String[]{"com.fasterxml.jackson.databind.introspect.AnnotatedWithParams"}, new String[]{"<sample:0>"}, false, 5, new String[][]{}, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput052() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.impl.CreatorCollector", "com.fasterxml.jackson.databind.deser.impl.CreatorCollector", "setDefaultCreator", new String[]{"com.fasterxml.jackson.databind.introspect.AnnotatedWithParams"}, new String[]{"<null>"}, false, 5, new String[][]{}, 2);
  assertNull(actual);
  assertEquals("receiver state after the call", "{hasDefaultCreator=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput053() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.impl.CreatorCollector", "com.fasterxml.jackson.databind.deser.impl.CreatorCollector", "verifyNonDup", new String[]{"com.fasterxml.jackson.databind.introspect.AnnotatedWithParams", "int"}, new String[]{"<sample:5>", "-1"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.deser.impl.CreatorCollector", "setDefaultCreator", "com.fasterxml.jackson.databind.introspect.AnnotatedWithParams", "<sample:0>"}, {"com.fasterxml.jackson.databind.deser.impl.CreatorCollector", "addLongCreator", "com.fasterxml.jackson.databind.introspect.AnnotatedWithParams", "<sample:10>"}}, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.ArrayIndexOutOfBoundsException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput054() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.impl.CreatorCollector", "com.fasterxml.jackson.databind.deser.impl.CreatorCollector", "verifyNonDup", new String[]{"com.fasterxml.jackson.databind.introspect.AnnotatedWithParams", "int"}, new String[]{"<sample:5>", "1"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.deser.impl.CreatorCollector", "setDefaultCreator", "com.fasterxml.jackson.databind.introspect.AnnotatedWithParams", "<sample:0>"}, {"com.fasterxml.jackson.databind.deser.impl.CreatorCollector", "addLongCreator", "com.fasterxml.jackson.databind.introspect.AnnotatedWithParams", "<sample:10>"}}, 2), new String[][]{{"addOrOverride", "java.lang.annotation.Annotation", "2"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput055() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.impl.CreatorCollector", "com.fasterxml.jackson.databind.deser.impl.CreatorCollector", "addLongCreator", new String[]{"com.fasterxml.jackson.databind.introspect.AnnotatedWithParams"}, new String[]{"<sample:5>"}, false, 0, null, 3);
  assertNull(actual);
  assertEquals("receiver state after the call", "{hasDefaultCreator=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput056() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.impl.CreatorCollector", "com.fasterxml.jackson.databind.deser.impl.CreatorCollector", "constructValueInstantiator", new String[]{"com.fasterxml.jackson.databind.DeserializationConfig"}, new String[]{"<sample:4>"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.deser.impl.CreatorCollector", "addDoubleCreator", "com.fasterxml.jackson.databind.introspect.AnnotatedWithParams", "<sample:3>"}}, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput057() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.impl.CreatorCollector", "com.fasterxml.jackson.databind.deser.impl.CreatorCollector", "addPropertyCreator", new String[]{"com.fasterxml.jackson.databind.introspect.AnnotatedWithParams", "com.fasterxml.jackson.databind.deser.CreatorProperty[]"}, new String[]{"<sample:0>", "<sample:2>"}, false, 0, null, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput058() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.impl.CreatorCollector", "com.fasterxml.jackson.databind.deser.impl.CreatorCollector", "addPropertyCreator", new String[]{"com.fasterxml.jackson.databind.introspect.AnnotatedWithParams", "com.fasterxml.jackson.databind.deser.CreatorProperty[]"}, new String[]{"<sample:4>", "<sample:4>"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.deser.impl.CreatorCollector", "addDoubleCreator", "com.fasterxml.jackson.databind.introspect.AnnotatedWithParams,boolean", "<sample:4>", "true"}, {"com.fasterxml.jackson.databind.deser.impl.CreatorCollector", "constructValueInstantiator", "com.fasterxml.jackson.databind.DeserializationConfig", "<sample:6>"}}, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput059() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.impl.CreatorCollector", "com.fasterxml.jackson.databind.deser.impl.CreatorCollector", "addPropertyCreator", new String[]{"com.fasterxml.jackson.databind.introspect.AnnotatedWithParams", "com.fasterxml.jackson.databind.deser.CreatorProperty[]"}, new String[]{"<sample:4>", "<sample:2>"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.deser.impl.CreatorCollector", "addDoubleCreator", "com.fasterxml.jackson.databind.introspect.AnnotatedWithParams,boolean", "<sample:4>", "true"}, {"com.fasterxml.jackson.databind.deser.impl.CreatorCollector", "constructValueInstantiator", "com.fasterxml.jackson.databind.DeserializationConfig", "<sample:6>"}}, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput060() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.impl.CreatorCollector", "com.fasterxml.jackson.databind.deser.impl.CreatorCollector", "addPropertyCreator", new String[]{"com.fasterxml.jackson.databind.introspect.AnnotatedWithParams", "com.fasterxml.jackson.databind.deser.CreatorProperty[]"}, new String[]{"<sample:1>", "<empty>"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.deser.impl.CreatorCollector", "addDoubleCreator", "com.fasterxml.jackson.databind.introspect.AnnotatedWithParams,boolean", "<sample:4>", "false"}, {"com.fasterxml.jackson.databind.deser.impl.CreatorCollector", "addBooleanCreator", "com.fasterxml.jackson.databind.introspect.AnnotatedWithParams", "<sample:7>"}, {"com.fasterxml.jackson.databind.deser.impl.CreatorCollector", "constructValueInstantiator", "com.fasterxml.jackson.databind.DeserializationConfig", "<sample:6>"}}, 2);
  assertNull(actual);
  assertEquals("receiver state after the call", "{hasDefaultCreator=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput061() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.impl.CreatorCollector", "com.fasterxml.jackson.databind.deser.impl.CreatorCollector", "addPropertyCreator", new String[]{"com.fasterxml.jackson.databind.introspect.AnnotatedWithParams", "boolean", "com.fasterxml.jackson.databind.deser.CreatorProperty[]"}, new String[]{"<sample:4>", "true", "<sample:2>"}, false, 1, new String[][]{{"com.fasterxml.jackson.databind.deser.impl.CreatorCollector", "addDoubleCreator", "com.fasterxml.jackson.databind.introspect.AnnotatedWithParams", "<null>"}}, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput062() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.impl.CreatorCollector", "com.fasterxml.jackson.databind.deser.impl.CreatorCollector", "addPropertyCreator", new String[]{"com.fasterxml.jackson.databind.introspect.AnnotatedWithParams", "boolean", "com.fasterxml.jackson.databind.deser.CreatorProperty[]"}, new String[]{"<sample:4>", "true", "<sample:1>"}, false, 2, new String[][]{{"com.fasterxml.jackson.databind.deser.impl.CreatorCollector", "addDoubleCreator", "com.fasterxml.jackson.databind.introspect.AnnotatedWithParams", "<null>"}}, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput063() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.impl.CreatorCollector", "com.fasterxml.jackson.databind.deser.impl.CreatorCollector", "addPropertyCreator", new String[]{"com.fasterxml.jackson.databind.introspect.AnnotatedWithParams", "boolean", "com.fasterxml.jackson.databind.deser.CreatorProperty[]"}, new String[]{"<sample:7>", "true", "<sample:0>"}, false, 2, new String[][]{{"com.fasterxml.jackson.databind.deser.impl.CreatorCollector", "addDoubleCreator", "com.fasterxml.jackson.databind.introspect.AnnotatedWithParams", "<sample:7>"}}, 2);
  assertNull(actual);
  assertEquals("receiver state after the call", "{hasDefaultCreator=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput064() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.impl.CreatorCollector", "com.fasterxml.jackson.databind.deser.impl.CreatorCollector", "addPropertyCreator", new String[]{"com.fasterxml.jackson.databind.introspect.AnnotatedWithParams", "boolean", "com.fasterxml.jackson.databind.deser.CreatorProperty[]"}, new String[]{"<sample:12>", "false", "<sample:8>"}, false, 2, new String[][]{{"com.fasterxml.jackson.databind.deser.impl.CreatorCollector", "addLongCreator", "com.fasterxml.jackson.databind.introspect.AnnotatedWithParams", "<sample:2>"}, {"com.fasterxml.jackson.databind.deser.impl.CreatorCollector", "addIntCreator", "com.fasterxml.jackson.databind.introspect.AnnotatedWithParams", "<sample:7>"}}, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput065() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.impl.CreatorCollector", "com.fasterxml.jackson.databind.deser.impl.CreatorCollector", "setDefaultCreator", new String[]{"com.fasterxml.jackson.databind.introspect.AnnotatedWithParams"}, new String[]{"<sample:6>"}, false, 5, new String[][]{{"com.fasterxml.jackson.databind.deser.impl.CreatorCollector", "addPropertyCreator", "com.fasterxml.jackson.databind.introspect.AnnotatedWithParams,com.fasterxml.jackson.databind.deser.CreatorProperty[]", "<sample:1>", "<sample:8>"}}, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput066() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.impl.CreatorCollector", "com.fasterxml.jackson.databind.deser.impl.CreatorCollector", "setDefaultCreator", new String[]{"com.fasterxml.jackson.databind.introspect.AnnotatedWithParams"}, new String[]{"<sample:4>"}, false, 5, new String[][]{{"com.fasterxml.jackson.databind.deser.impl.CreatorCollector", "addPropertyCreator", "com.fasterxml.jackson.databind.introspect.AnnotatedWithParams,com.fasterxml.jackson.databind.deser.CreatorProperty[]", "<sample:1>", "<sample:8>"}, {"com.fasterxml.jackson.databind.deser.impl.CreatorCollector", "verifyNonDup", "com.fasterxml.jackson.databind.introspect.AnnotatedWithParams,int,boolean", "<sample:9>", "0", "false"}}, 3);
  assertNull(actual);
  assertEquals("receiver state after the call", "{hasDefaultCreator=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput067() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.impl.CreatorCollector", "com.fasterxml.jackson.databind.deser.impl.CreatorCollector", "addStringCreator", new String[]{"com.fasterxml.jackson.databind.introspect.AnnotatedWithParams", "boolean"}, new String[]{"<null>", "true"}, false, 2, new String[][]{{"com.fasterxml.jackson.databind.deser.impl.CreatorCollector", "setDefaultCreator", "com.fasterxml.jackson.databind.introspect.AnnotatedWithParams", "<sample:0>"}}, 2);
  assertNull(actual);
  assertEquals("receiver state after the call", "{hasDefaultCreator=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput068() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.impl.CreatorCollector", "com.fasterxml.jackson.databind.deser.impl.CreatorCollector", "addPropertyCreator", new String[]{"com.fasterxml.jackson.databind.introspect.AnnotatedWithParams", "com.fasterxml.jackson.databind.deser.CreatorProperty[]"}, new String[]{"<null>", "<sample:1>"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.deser.impl.CreatorCollector", "addBooleanCreator", "com.fasterxml.jackson.databind.introspect.AnnotatedWithParams", "<sample:8>"}, {"com.fasterxml.jackson.databind.deser.impl.CreatorCollector", "addDelegatingCreator", "com.fasterxml.jackson.databind.introspect.AnnotatedWithParams,com.fasterxml.jackson.databind.deser.CreatorProperty[]", "<sample:11>", "<sample:1>"}, {"com.fasterxml.jackson.databind.deser.impl.CreatorCollector", "addDelegatingCreator", "com.fasterxml.jackson.databind.introspect.AnnotatedWithParams,boolean,com.fasterxml.jackson.databind.deser.CreatorProperty[]", "<sample:0>", "false", "<sample:1>"}}, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput069() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.impl.CreatorCollector", "com.fasterxml.jackson.databind.deser.impl.CreatorCollector", "addPropertyCreator", new String[]{"com.fasterxml.jackson.databind.introspect.AnnotatedWithParams", "com.fasterxml.jackson.databind.deser.CreatorProperty[]"}, new String[]{"<sample:1>", "<sample:0>"}, false, 14, new String[][]{}, 3);
  assertNull(actual);
  assertEquals("receiver state after the call", "{hasDefaultCreator=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput070() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.impl.CreatorCollector", "com.fasterxml.jackson.databind.deser.impl.CreatorCollector", "addIncompeteParameter", new String[]{"com.fasterxml.jackson.databind.introspect.AnnotatedParameter"}, new String[]{"<sample:1>"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.deser.impl.CreatorCollector", "addBooleanCreator", "com.fasterxml.jackson.databind.introspect.AnnotatedWithParams,boolean", "<null>", "false"}}, 1);
  assertNull(actual);
  assertEquals("receiver state after the call", "{hasDefaultCreator=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput071() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.impl.CreatorCollector", "com.fasterxml.jackson.databind.deser.impl.CreatorCollector", "addDelegatingCreator", new String[]{"com.fasterxml.jackson.databind.introspect.AnnotatedWithParams", "boolean", "com.fasterxml.jackson.databind.deser.CreatorProperty[]"}, new String[]{"<sample:1>", "true", "<sample:7>"}, false, 9, new String[][]{{"com.fasterxml.jackson.databind.deser.impl.CreatorCollector", "addPropertyCreator", "com.fasterxml.jackson.databind.introspect.AnnotatedWithParams,boolean,com.fasterxml.jackson.databind.deser.CreatorProperty[]", "<sample:4>", "false", "<sample:2>"}, {"com.fasterxml.jackson.databind.deser.impl.CreatorCollector", "addStringCreator", "com.fasterxml.jackson.databind.introspect.AnnotatedWithParams", "<sample:10>"}, {"com.fasterxml.jackson.databind.deser.impl.CreatorCollector", "addIntCreator", "com.fasterxml.jackson.databind.introspect.AnnotatedWithParams", "<null>"}}, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput072() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.impl.CreatorCollector", "com.fasterxml.jackson.databind.deser.impl.CreatorCollector", "addDelegatingCreator", new String[]{"com.fasterxml.jackson.databind.introspect.AnnotatedWithParams", "boolean", "com.fasterxml.jackson.databind.deser.CreatorProperty[]"}, new String[]{"<sample:0>", "true", "<empty>"}, false, 12, new String[][]{{"com.fasterxml.jackson.databind.deser.impl.CreatorCollector", "hasDefaultCreator", ""}, {"com.fasterxml.jackson.databind.deser.impl.CreatorCollector", "addPropertyCreator", "com.fasterxml.jackson.databind.introspect.AnnotatedWithParams,boolean,com.fasterxml.jackson.databind.deser.CreatorProperty[]", "<sample:3>", "false", "<sample:0>"}, {"com.fasterxml.jackson.databind.deser.impl.CreatorCollector", "addDelegatingCreator", "com.fasterxml.jackson.databind.introspect.AnnotatedWithParams,boolean,com.fasterxml.jackson.databind.deser.CreatorProperty[]", "<sample:9>", "true", "<sample:0>"}}, 1);
  assertNull(actual);
  assertEquals("receiver state after the call", "{hasDefaultCreator=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput073() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.impl.CreatorCollector", "com.fasterxml.jackson.databind.deser.impl.CreatorCollector", "addStringCreator", new String[]{"com.fasterxml.jackson.databind.introspect.AnnotatedWithParams"}, new String[]{"<sample:1>"}, false, 4, new String[][]{{"com.fasterxml.jackson.databind.deser.impl.CreatorCollector", "addPropertyCreator", "com.fasterxml.jackson.databind.introspect.AnnotatedWithParams,boolean,com.fasterxml.jackson.databind.deser.CreatorProperty[]", "<sample:4>", "false", "<sample:0>"}}, 3);
  assertNull(actual);
  assertEquals("receiver state after the call", "{hasDefaultCreator=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput074() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.impl.CreatorCollector", "com.fasterxml.jackson.databind.deser.impl.CreatorCollector", "addDoubleCreator", new String[]{"com.fasterxml.jackson.databind.introspect.AnnotatedWithParams", "boolean"}, new String[]{"<sample:8>", "true"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.deser.impl.CreatorCollector", "addDoubleCreator", "com.fasterxml.jackson.databind.introspect.AnnotatedWithParams,boolean", "<sample:2>", "true"}}, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput075() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.impl.CreatorCollector", "com.fasterxml.jackson.databind.deser.impl.CreatorCollector", "addIntCreator", new String[]{"com.fasterxml.jackson.databind.introspect.AnnotatedWithParams"}, new String[]{"<sample:11>"}, false, 8, new String[][]{{"com.fasterxml.jackson.databind.deser.impl.CreatorCollector", "addIntCreator", "com.fasterxml.jackson.databind.introspect.AnnotatedWithParams", "<sample:3>"}}, 2);
  assertNull(actual);
  assertEquals("receiver state after the call", "{hasDefaultCreator=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput076() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.impl.CreatorCollector", "com.fasterxml.jackson.databind.deser.impl.CreatorCollector", "addIntCreator", new String[]{"com.fasterxml.jackson.databind.introspect.AnnotatedWithParams"}, new String[]{"<sample:11>"}, false, 8, new String[][]{{"com.fasterxml.jackson.databind.deser.impl.CreatorCollector", "addIntCreator", "com.fasterxml.jackson.databind.introspect.AnnotatedWithParams", "<sample:5>"}}, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput077() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.impl.CreatorCollector", "com.fasterxml.jackson.databind.deser.impl.CreatorCollector", "addDelegatingCreator", new String[]{"com.fasterxml.jackson.databind.introspect.AnnotatedWithParams", "com.fasterxml.jackson.databind.deser.CreatorProperty[]"}, new String[]{"<sample:8>", "<sample:10>"}, false, 1, new String[][]{{"com.fasterxml.jackson.databind.deser.impl.CreatorCollector", "addStringCreator", "com.fasterxml.jackson.databind.introspect.AnnotatedWithParams", "<sample:7>"}}, 2);
  assertNull(actual);
  assertEquals("receiver state after the call", "{hasDefaultCreator=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput078() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.impl.CreatorCollector", "com.fasterxml.jackson.databind.deser.impl.CreatorCollector", "addDelegatingCreator", new String[]{"com.fasterxml.jackson.databind.introspect.AnnotatedWithParams", "com.fasterxml.jackson.databind.deser.CreatorProperty[]"}, new String[]{"<sample:6>", "<empty>"}, false, 1, new String[][]{{"com.fasterxml.jackson.databind.deser.impl.CreatorCollector", "addStringCreator", "com.fasterxml.jackson.databind.introspect.AnnotatedWithParams", "<sample:10>"}, {"com.fasterxml.jackson.databind.deser.impl.CreatorCollector", "addLongCreator", "com.fasterxml.jackson.databind.introspect.AnnotatedWithParams", "<sample:3>"}}, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput079() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.impl.CreatorCollector", "com.fasterxml.jackson.databind.deser.impl.CreatorCollector", "addDelegatingCreator", new String[]{"com.fasterxml.jackson.databind.introspect.AnnotatedWithParams", "com.fasterxml.jackson.databind.deser.CreatorProperty[]"}, new String[]{"<sample:3>", "<sample:0>"}, false, 3, new String[][]{{"com.fasterxml.jackson.databind.deser.impl.CreatorCollector", "addPropertyCreator", "com.fasterxml.jackson.databind.introspect.AnnotatedWithParams,com.fasterxml.jackson.databind.deser.CreatorProperty[]", "<sample:3>", "<sample:8>"}, {"com.fasterxml.jackson.databind.deser.impl.CreatorCollector", "addLongCreator", "com.fasterxml.jackson.databind.introspect.AnnotatedWithParams", "<sample:2>"}}, 3);
  assertNull(actual);
  assertEquals("receiver state after the call", "{hasDefaultCreator=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput080() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.impl.CreatorCollector", "com.fasterxml.jackson.databind.deser.impl.CreatorCollector", "addDelegatingCreator", new String[]{"com.fasterxml.jackson.databind.introspect.AnnotatedWithParams", "com.fasterxml.jackson.databind.deser.CreatorProperty[]"}, new String[]{"<sample:6>", "<sample:0>"}, false, 3, new String[][]{{"com.fasterxml.jackson.databind.deser.impl.CreatorCollector", "addDelegatingCreator", "com.fasterxml.jackson.databind.introspect.AnnotatedWithParams,com.fasterxml.jackson.databind.deser.CreatorProperty[]", "<sample:9>", "<null>"}, {"com.fasterxml.jackson.databind.deser.impl.CreatorCollector", "addPropertyCreator", "com.fasterxml.jackson.databind.introspect.AnnotatedWithParams,com.fasterxml.jackson.databind.deser.CreatorProperty[]", "<sample:3>", "<sample:8>"}}, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput081() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.impl.CreatorCollector", "com.fasterxml.jackson.databind.deser.impl.CreatorCollector", "addStringCreator", new String[]{"com.fasterxml.jackson.databind.introspect.AnnotatedWithParams"}, new String[]{"<sample:6>"}, false, 1, new String[][]{{"com.fasterxml.jackson.databind.deser.impl.CreatorCollector", "addDoubleCreator", "com.fasterxml.jackson.databind.introspect.AnnotatedWithParams,boolean", "<sample:10>", "true"}}, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput082() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.impl.CreatorCollector", "com.fasterxml.jackson.databind.deser.impl.CreatorCollector", "addDelegatingCreator", new String[]{"com.fasterxml.jackson.databind.introspect.AnnotatedWithParams", "com.fasterxml.jackson.databind.deser.CreatorProperty[]"}, new String[]{"<sample:11>", "<sample:2>"}, false, 12, new String[][]{{"com.fasterxml.jackson.databind.deser.impl.CreatorCollector", "addPropertyCreator", "com.fasterxml.jackson.databind.introspect.AnnotatedWithParams,com.fasterxml.jackson.databind.deser.CreatorProperty[]", "<sample:2>", "<sample:10>"}, {"com.fasterxml.jackson.databind.deser.impl.CreatorCollector", "verifyNonDup", "com.fasterxml.jackson.databind.introspect.AnnotatedWithParams,int,boolean", "<sample:11>", "-1", "false"}, {"com.fasterxml.jackson.databind.deser.impl.CreatorCollector", "addDelegatingCreator", "com.fasterxml.jackson.databind.introspect.AnnotatedWithParams,boolean,com.fasterxml.jackson.databind.deser.CreatorProperty[]", "<sample:11>", "false", "<sample:8>"}}, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput083() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.impl.CreatorCollector", "com.fasterxml.jackson.databind.deser.impl.CreatorCollector", "addBooleanCreator", new String[]{"com.fasterxml.jackson.databind.introspect.AnnotatedWithParams"}, new String[]{"<sample:13>"}, false, 9, new String[][]{{"com.fasterxml.jackson.databind.deser.impl.CreatorCollector", "addIntCreator", "com.fasterxml.jackson.databind.introspect.AnnotatedWithParams,boolean", "<sample:10>", "true"}, {"com.fasterxml.jackson.databind.deser.impl.CreatorCollector", "hasDefaultCreator", ""}, {"com.fasterxml.jackson.databind.deser.impl.CreatorCollector", "addPropertyCreator", "com.fasterxml.jackson.databind.introspect.AnnotatedWithParams,com.fasterxml.jackson.databind.deser.CreatorProperty[]", "<sample:2>", "<sample:8>"}}, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput084() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.impl.CreatorCollector", "com.fasterxml.jackson.databind.deser.impl.CreatorCollector", "addBooleanCreator", new String[]{"com.fasterxml.jackson.databind.introspect.AnnotatedWithParams"}, new String[]{"<sample:4>"}, false, 2, new String[][]{{"com.fasterxml.jackson.databind.deser.impl.CreatorCollector", "addPropertyCreator", "com.fasterxml.jackson.databind.introspect.AnnotatedWithParams,com.fasterxml.jackson.databind.deser.CreatorProperty[]", "<sample:1>", "<sample:10>"}, {"com.fasterxml.jackson.databind.deser.impl.CreatorCollector", "addDoubleCreator", "com.fasterxml.jackson.databind.introspect.AnnotatedWithParams", "<sample:4>"}}, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput085() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.impl.CreatorCollector", "com.fasterxml.jackson.databind.deser.impl.CreatorCollector", "addBooleanCreator", new String[]{"com.fasterxml.jackson.databind.introspect.AnnotatedWithParams"}, new String[]{"<sample:4>"}, false, 8, new String[][]{{"com.fasterxml.jackson.databind.deser.impl.CreatorCollector", "addPropertyCreator", "com.fasterxml.jackson.databind.introspect.AnnotatedWithParams,com.fasterxml.jackson.databind.deser.CreatorProperty[]", "<sample:1>", "<sample:10>"}, {"com.fasterxml.jackson.databind.deser.impl.CreatorCollector", "addPropertyCreator", "com.fasterxml.jackson.databind.introspect.AnnotatedWithParams,boolean,com.fasterxml.jackson.databind.deser.CreatorProperty[]", "<sample:2>", "true", "<sample:1>"}, {"com.fasterxml.jackson.databind.deser.impl.CreatorCollector", "addDoubleCreator", "com.fasterxml.jackson.databind.introspect.AnnotatedWithParams", "<sample:4>"}}, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput086() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.impl.CreatorCollector", "com.fasterxml.jackson.databind.deser.impl.CreatorCollector", "verifyNonDup", new String[]{"com.fasterxml.jackson.databind.introspect.AnnotatedWithParams", "int"}, new String[]{"<sample:4>", "4"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.deser.impl.CreatorCollector", "addDelegatingCreator", "com.fasterxml.jackson.databind.introspect.AnnotatedWithParams,com.fasterxml.jackson.databind.deser.CreatorProperty[]", "<sample:4>", "<sample:0>"}});
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.databind.introspect.AnnotatedConstructor", actual.getClass().getName());
  assertEquals("[constructor for java.lang.String, annotations: [null]] {getAnnotationCount=0, getModifiers=1, getName=java.lang.String, getParameterCount=0, isPublic=true}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{hasDefaultCreator=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput087() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.impl.CreatorCollector", "com.fasterxml.jackson.databind.deser.impl.CreatorCollector", "verifyNonDup", new String[]{"com.fasterxml.jackson.databind.introspect.AnnotatedWithParams", "int"}, new String[]{"<sample:4>", "4"}, false, 1, new String[][]{{"com.fasterxml.jackson.databind.deser.impl.CreatorCollector", "addDelegatingCreator", "com.fasterxml.jackson.databind.introspect.AnnotatedWithParams,com.fasterxml.jackson.databind.deser.CreatorProperty[]", "<sample:4>", "<sample:0>"}});
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.databind.introspect.AnnotatedConstructor", actual.getClass().getName());
  assertEquals("[constructor for java.lang.String, annotations: [null]] {getAnnotationCount=0, getModifiers=1, getName=java.lang.String, getParameterCount=0, isPublic=true}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{hasDefaultCreator=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput088() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.impl.CreatorCollector", "com.fasterxml.jackson.databind.deser.impl.CreatorCollector", "verifyNonDup", new String[]{"com.fasterxml.jackson.databind.introspect.AnnotatedWithParams", "int"}, new String[]{"<sample:4>", "8"}, false, 1, new String[][]{{"com.fasterxml.jackson.databind.deser.impl.CreatorCollector", "addDelegatingCreator", "com.fasterxml.jackson.databind.introspect.AnnotatedWithParams,com.fasterxml.jackson.databind.deser.CreatorProperty[]", "<sample:7>", "<sample:0>"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.ArrayIndexOutOfBoundsException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput089() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.impl.CreatorCollector", "com.fasterxml.jackson.databind.deser.impl.CreatorCollector", "verifyNonDup", new String[]{"com.fasterxml.jackson.databind.introspect.AnnotatedWithParams", "int"}, new String[]{"<sample:7>", "5"}, false, 1, new String[][]{{"com.fasterxml.jackson.databind.deser.impl.CreatorCollector", "addDelegatingCreator", "com.fasterxml.jackson.databind.introspect.AnnotatedWithParams,com.fasterxml.jackson.databind.deser.CreatorProperty[]", "<sample:7>", "<sample:0>"}});
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.databind.introspect.AnnotatedMethod", actual.getClass().getName());
  assertEquals("[method java.util.List#get(1 params)] {getAnnotationCount=0, getFullName=java.util.List#get(1 params), getGenericParameterTypes=[int], getModifiers=1025, getName=get, getParameterCount=1, getRawParame...#250#-1323839922", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{hasDefaultCreator=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput090() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.impl.CreatorCollector", "com.fasterxml.jackson.databind.deser.impl.CreatorCollector", "hasDefaultCreator", new String[]{}, new String[]{}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.deser.impl.CreatorCollector", "addDoubleCreator", "com.fasterxml.jackson.databind.introspect.AnnotatedWithParams,boolean", "<sample:2>", "false"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{hasDefaultCreator=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput091() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.impl.CreatorCollector", "com.fasterxml.jackson.databind.deser.impl.CreatorCollector", "addDelegatingCreator", new String[]{"com.fasterxml.jackson.databind.introspect.AnnotatedWithParams", "boolean", "com.fasterxml.jackson.databind.deser.CreatorProperty[]"}, new String[]{"<sample:4>", "true", "<sample:0>"}, false);
  assertNull(actual);
  assertEquals("receiver state after the call", "{hasDefaultCreator=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput092() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.impl.CreatorCollector", "com.fasterxml.jackson.databind.deser.impl.CreatorCollector", "addDoubleCreator", new String[]{"com.fasterxml.jackson.databind.introspect.AnnotatedWithParams", "boolean"}, new String[]{"<sample:0>", "true"}, false, 1, new String[][]{{"com.fasterxml.jackson.databind.deser.impl.CreatorCollector", "constructValueInstantiator", "com.fasterxml.jackson.databind.DeserializationConfig", "<sample:7>"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput093() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.impl.CreatorCollector", "com.fasterxml.jackson.databind.deser.impl.CreatorCollector", "addDoubleCreator", new String[]{"com.fasterxml.jackson.databind.introspect.AnnotatedWithParams", "boolean"}, new String[]{"<sample:0>", "true"}, false, 1, new String[][]{{"com.fasterxml.jackson.databind.deser.impl.CreatorCollector", "addBooleanCreator", "com.fasterxml.jackson.databind.introspect.AnnotatedWithParams", "<sample:4>"}, {"com.fasterxml.jackson.databind.deser.impl.CreatorCollector", "constructValueInstantiator", "com.fasterxml.jackson.databind.DeserializationConfig", "<sample:7>"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput094() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.impl.CreatorCollector", "com.fasterxml.jackson.databind.deser.impl.CreatorCollector", "addBooleanCreator", new String[]{"com.fasterxml.jackson.databind.introspect.AnnotatedWithParams", "boolean"}, new String[]{"<sample:7>", "false"}, false);
  assertNull(actual);
  assertEquals("receiver state after the call", "{hasDefaultCreator=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput095() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.impl.CreatorCollector", "com.fasterxml.jackson.databind.deser.impl.CreatorCollector", "addPropertyCreator", new String[]{"com.fasterxml.jackson.databind.introspect.AnnotatedWithParams", "boolean", "com.fasterxml.jackson.databind.deser.CreatorProperty[]"}, new String[]{"<sample:11>", "false", "<sample:1>"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.deser.impl.CreatorCollector", "addPropertyCreator", "com.fasterxml.jackson.databind.introspect.AnnotatedWithParams,com.fasterxml.jackson.databind.deser.CreatorProperty[]", "<null>", "<sample:2>"}, {"com.fasterxml.jackson.databind.deser.impl.CreatorCollector", "addIntCreator", "com.fasterxml.jackson.databind.introspect.AnnotatedWithParams,boolean", "<sample:11>", "false"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput096() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.impl.CreatorCollector", "com.fasterxml.jackson.databind.deser.impl.CreatorCollector", "addIncompeteParameter", new String[]{"com.fasterxml.jackson.databind.introspect.AnnotatedParameter"}, new String[]{"<sample:4>"}, false);
  assertNull(actual);
  assertEquals("receiver state after the call", "{hasDefaultCreator=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput097() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.impl.CreatorCollector", "com.fasterxml.jackson.databind.deser.impl.CreatorCollector", "addPropertyCreator", new String[]{"com.fasterxml.jackson.databind.introspect.AnnotatedWithParams", "boolean", "com.fasterxml.jackson.databind.deser.CreatorProperty[]"}, new String[]{"<sample:8>", "false", "<sample:1>"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.deser.impl.CreatorCollector", "addPropertyCreator", "com.fasterxml.jackson.databind.introspect.AnnotatedWithParams,com.fasterxml.jackson.databind.deser.CreatorProperty[]", "<sample:9>", "<empty>"}, {"com.fasterxml.jackson.databind.deser.impl.CreatorCollector", "addStringCreator", "com.fasterxml.jackson.databind.introspect.AnnotatedWithParams", "<sample:11>"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput098() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.impl.CreatorCollector", "com.fasterxml.jackson.databind.deser.impl.CreatorCollector", "addPropertyCreator", new String[]{"com.fasterxml.jackson.databind.introspect.AnnotatedWithParams", "boolean", "com.fasterxml.jackson.databind.deser.CreatorProperty[]"}, new String[]{"<sample:7>", "true", "<empty>"}, false, 13, new String[][]{{"com.fasterxml.jackson.databind.deser.impl.CreatorCollector", "addPropertyCreator", "com.fasterxml.jackson.databind.introspect.AnnotatedWithParams,com.fasterxml.jackson.databind.deser.CreatorProperty[]", "<sample:9>", "<null>"}, {"com.fasterxml.jackson.databind.deser.impl.CreatorCollector", "addStringCreator", "com.fasterxml.jackson.databind.introspect.AnnotatedWithParams", "<sample:9>"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{hasDefaultCreator=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput099() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.impl.CreatorCollector", "com.fasterxml.jackson.databind.deser.impl.CreatorCollector", "addDoubleCreator", new String[]{"com.fasterxml.jackson.databind.introspect.AnnotatedWithParams", "boolean"}, new String[]{"<sample:8>", "true"}, false, 1, new String[][]{{"com.fasterxml.jackson.databind.deser.impl.CreatorCollector", "addIntCreator", "com.fasterxml.jackson.databind.introspect.AnnotatedWithParams", "<sample:12>"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{hasDefaultCreator=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput100() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.impl.CreatorCollector", "com.fasterxml.jackson.databind.deser.impl.CreatorCollector", "addStringCreator", new String[]{"com.fasterxml.jackson.databind.introspect.AnnotatedWithParams", "boolean"}, new String[]{"<sample:5>", "true"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.deser.impl.CreatorCollector", "verifyNonDup", "com.fasterxml.jackson.databind.introspect.AnnotatedWithParams,int", "<sample:10>", "5"}, {"com.fasterxml.jackson.databind.deser.impl.CreatorCollector", "hasDefaultCreator", ""}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{hasDefaultCreator=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput101() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.impl.CreatorCollector", "com.fasterxml.jackson.databind.deser.impl.CreatorCollector", "addDelegatingCreator", new String[]{"com.fasterxml.jackson.databind.introspect.AnnotatedWithParams", "boolean", "com.fasterxml.jackson.databind.deser.CreatorProperty[]"}, new String[]{"<sample:13>", "false", "<sample:0>"}, false, 13, new String[][]{{"com.fasterxml.jackson.databind.deser.impl.CreatorCollector", "addLongCreator", "com.fasterxml.jackson.databind.introspect.AnnotatedWithParams", "<sample:0>"}, {"com.fasterxml.jackson.databind.deser.impl.CreatorCollector", "hasDefaultCreator", ""}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput102() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.impl.CreatorCollector", "com.fasterxml.jackson.databind.deser.impl.CreatorCollector", "addPropertyCreator", new String[]{"com.fasterxml.jackson.databind.introspect.AnnotatedWithParams", "com.fasterxml.jackson.databind.deser.CreatorProperty[]"}, new String[]{"<sample:12>", "<sample:2>"}, false); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput103() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.impl.CreatorCollector", "com.fasterxml.jackson.databind.deser.impl.CreatorCollector", "addPropertyCreator", new String[]{"com.fasterxml.jackson.databind.introspect.AnnotatedWithParams", "com.fasterxml.jackson.databind.deser.CreatorProperty[]"}, new String[]{"<sample:12>", "<sample:1>"}, false); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput104() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.impl.CreatorCollector", "com.fasterxml.jackson.databind.deser.impl.CreatorCollector", "addPropertyCreator", new String[]{"com.fasterxml.jackson.databind.introspect.AnnotatedWithParams", "com.fasterxml.jackson.databind.deser.CreatorProperty[]"}, new String[]{"<sample:12>", "<sample:0>"}, false);
  assertNull(actual);
  assertEquals("receiver state after the call", "{hasDefaultCreator=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput105() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.impl.CreatorCollector", "com.fasterxml.jackson.databind.deser.impl.CreatorCollector", "verifyNonDup", new String[]{"com.fasterxml.jackson.databind.introspect.AnnotatedWithParams", "int", "boolean"}, new String[]{"<sample:9>", "4", "true"}, false);
  assertNull(actual);
  assertEquals("receiver state after the call", "{hasDefaultCreator=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput106() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.impl.CreatorCollector", "com.fasterxml.jackson.databind.deser.impl.CreatorCollector", "verifyNonDup", new String[]{"com.fasterxml.jackson.databind.introspect.AnnotatedWithParams", "int", "boolean"}, new String[]{"<sample:9>", "-24", "true"}, false); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.ArrayIndexOutOfBoundsException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput107() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.impl.CreatorCollector", "com.fasterxml.jackson.databind.deser.impl.CreatorCollector", "addBooleanCreator", new String[]{"com.fasterxml.jackson.databind.introspect.AnnotatedWithParams"}, new String[]{"<sample:12>"}, false);
  assertNull(actual);
  assertEquals("receiver state after the call", "{hasDefaultCreator=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput108() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.impl.CreatorCollector", "com.fasterxml.jackson.databind.deser.impl.CreatorCollector", "addIntCreator", new String[]{"com.fasterxml.jackson.databind.introspect.AnnotatedWithParams"}, new String[]{"<sample:2>"}, false, 1, new String[][]{{"com.fasterxml.jackson.databind.deser.impl.CreatorCollector", "addBooleanCreator", "com.fasterxml.jackson.databind.introspect.AnnotatedWithParams,boolean", "<sample:6>", "false"}, {"com.fasterxml.jackson.databind.deser.impl.CreatorCollector", "addIntCreator", "com.fasterxml.jackson.databind.introspect.AnnotatedWithParams", "<sample:3>"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{hasDefaultCreator=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput109() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.impl.CreatorCollector", "com.fasterxml.jackson.databind.deser.impl.CreatorCollector", "addIntCreator", new String[]{"com.fasterxml.jackson.databind.introspect.AnnotatedWithParams"}, new String[]{"<sample:5>"}, false, 1, new String[][]{{"com.fasterxml.jackson.databind.deser.impl.CreatorCollector", "addBooleanCreator", "com.fasterxml.jackson.databind.introspect.AnnotatedWithParams,boolean", "<sample:6>", "false"}, {"com.fasterxml.jackson.databind.deser.impl.CreatorCollector", "addIntCreator", "com.fasterxml.jackson.databind.introspect.AnnotatedWithParams", "<sample:3>"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput110() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.impl.CreatorCollector", "com.fasterxml.jackson.databind.deser.impl.CreatorCollector", "addIntCreator", new String[]{"com.fasterxml.jackson.databind.introspect.AnnotatedWithParams"}, new String[]{"<sample:3>"}, false, 1, new String[][]{{"com.fasterxml.jackson.databind.deser.impl.CreatorCollector", "addBooleanCreator", "com.fasterxml.jackson.databind.introspect.AnnotatedWithParams,boolean", "<sample:6>", "false"}, {"com.fasterxml.jackson.databind.deser.impl.CreatorCollector", "addIntCreator", "com.fasterxml.jackson.databind.introspect.AnnotatedWithParams", "<sample:3>"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput111() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.impl.CreatorCollector", "com.fasterxml.jackson.databind.deser.impl.CreatorCollector", "setDefaultCreator", new String[]{"com.fasterxml.jackson.databind.introspect.AnnotatedWithParams"}, new String[]{"<sample:4>"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.deser.impl.CreatorCollector", "addPropertyCreator", "com.fasterxml.jackson.databind.introspect.AnnotatedWithParams,com.fasterxml.jackson.databind.deser.CreatorProperty[]", "<sample:9>", "<empty>"}, {"com.fasterxml.jackson.databind.deser.impl.CreatorCollector", "addPropertyCreator", "com.fasterxml.jackson.databind.introspect.AnnotatedWithParams,com.fasterxml.jackson.databind.deser.CreatorProperty[]", "<sample:10>", "<null>"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{hasDefaultCreator=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput112() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.impl.CreatorCollector", "com.fasterxml.jackson.databind.deser.impl.CreatorCollector", "addLongCreator", new String[]{"com.fasterxml.jackson.databind.introspect.AnnotatedWithParams"}, new String[]{"<sample:10>"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.deser.impl.CreatorCollector", "verifyNonDup", "com.fasterxml.jackson.databind.introspect.AnnotatedWithParams,int,boolean", "<sample:12>", "7", "false"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{hasDefaultCreator=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput113() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.impl.CreatorCollector", "com.fasterxml.jackson.databind.deser.impl.CreatorCollector", "addLongCreator", new String[]{"com.fasterxml.jackson.databind.introspect.AnnotatedWithParams"}, new String[]{"<sample:0>"}, false, 10, new String[][]{{"com.fasterxml.jackson.databind.deser.impl.CreatorCollector", "addLongCreator", "com.fasterxml.jackson.databind.introspect.AnnotatedWithParams", "<sample:0>"}, {"com.fasterxml.jackson.databind.deser.impl.CreatorCollector", "addDoubleCreator", "com.fasterxml.jackson.databind.introspect.AnnotatedWithParams", "<null>"}, {"com.fasterxml.jackson.databind.deser.impl.CreatorCollector", "verifyNonDup", "com.fasterxml.jackson.databind.introspect.AnnotatedWithParams,int,boolean", "<sample:12>", "7", "false"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput114() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.impl.CreatorCollector", "com.fasterxml.jackson.databind.deser.impl.CreatorCollector", "addDoubleCreator", new String[]{"com.fasterxml.jackson.databind.introspect.AnnotatedWithParams"}, new String[]{"<sample:10>"}, false);
  assertNull(actual);
  assertEquals("receiver state after the call", "{hasDefaultCreator=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput115() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.impl.CreatorCollector", "com.fasterxml.jackson.databind.deser.impl.CreatorCollector", "addIntCreator", new String[]{"com.fasterxml.jackson.databind.introspect.AnnotatedWithParams", "boolean"}, new String[]{"<sample:4>", "false"}, false);
  assertNull(actual);
  assertEquals("receiver state after the call", "{hasDefaultCreator=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput116() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.impl.CreatorCollector", "com.fasterxml.jackson.databind.deser.impl.CreatorCollector", "addIntCreator", new String[]{"com.fasterxml.jackson.databind.introspect.AnnotatedWithParams", "boolean"}, new String[]{"<sample:1>", "false"}, false, 1, new String[][]{}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput117() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.impl.CreatorCollector", "com.fasterxml.jackson.databind.deser.impl.CreatorCollector", "addLongCreator", new String[]{"com.fasterxml.jackson.databind.introspect.AnnotatedWithParams", "boolean"}, new String[]{"<sample:6>", "true"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.deser.impl.CreatorCollector", "addBooleanCreator", "com.fasterxml.jackson.databind.introspect.AnnotatedWithParams", "<sample:6>"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{hasDefaultCreator=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput118() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.impl.CreatorCollector", "com.fasterxml.jackson.databind.deser.impl.CreatorCollector", "addStringCreator", new String[]{"com.fasterxml.jackson.databind.introspect.AnnotatedWithParams"}, new String[]{"<sample:3>"}, false);
  assertNull(actual);
  assertEquals("receiver state after the call", "{hasDefaultCreator=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput119() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.impl.CreatorCollector", "com.fasterxml.jackson.databind.deser.impl.CreatorCollector", "verifyNonDup", new String[]{"com.fasterxml.jackson.databind.introspect.AnnotatedWithParams", "int"}, new String[]{"<sample:6>", "5"}, false, 6, new String[][]{{"com.fasterxml.jackson.databind.deser.impl.CreatorCollector", "addDelegatingCreator", "com.fasterxml.jackson.databind.introspect.AnnotatedWithParams,boolean,com.fasterxml.jackson.databind.deser.CreatorProperty[]", "<sample:3>", "true", "<sample:1>"}});
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.databind.introspect.AnnotatedMethod", actual.getClass().getName());
  assertEquals("receiver state after the call", "{hasDefaultCreator=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput120() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.impl.CreatorCollector", "com.fasterxml.jackson.databind.deser.impl.CreatorCollector", "verifyNonDup", new String[]{"com.fasterxml.jackson.databind.introspect.AnnotatedWithParams", "int"}, new String[]{"<sample:6>", "5"}, false, 6, new String[][]{{"com.fasterxml.jackson.databind.deser.impl.CreatorCollector", "addDelegatingCreator", "com.fasterxml.jackson.databind.introspect.AnnotatedWithParams,boolean,com.fasterxml.jackson.databind.deser.CreatorProperty[]", "<sample:5>", "true", "<sample:1>"}}), new String[][]{{"getAnnotated", "", "7"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{hasDefaultCreator=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput121() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.impl.CreatorCollector", "com.fasterxml.jackson.databind.deser.impl.CreatorCollector", "verifyNonDup", new String[]{"com.fasterxml.jackson.databind.introspect.AnnotatedWithParams", "int"}, new String[]{"<sample:5>", "5"}, false, 6, new String[][]{{"com.fasterxml.jackson.databind.deser.impl.CreatorCollector", "addDelegatingCreator", "com.fasterxml.jackson.databind.introspect.AnnotatedWithParams,boolean,com.fasterxml.jackson.databind.deser.CreatorProperty[]", "<sample:5>", "true", "<sample:1>"}}), new String[][]{{"getAnnotated", "", "7"}, {"getGenericType", "", "0"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput122() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.impl.CreatorCollector", "com.fasterxml.jackson.databind.deser.impl.CreatorCollector", "verifyNonDup", new String[]{"com.fasterxml.jackson.databind.introspect.AnnotatedWithParams", "int"}, new String[]{"<sample:7>", "5"}, false, 6, new String[][]{{"com.fasterxml.jackson.databind.deser.impl.CreatorCollector", "addDelegatingCreator", "com.fasterxml.jackson.databind.introspect.AnnotatedWithParams,boolean,com.fasterxml.jackson.databind.deser.CreatorProperty[]", "<sample:5>", "true", "<empty>"}}), new String[][]{{"getAnnotated", "", "7"}, {"getParameterCount", "", "0"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("1", String.valueOf(actual));
  assertEquals("receiver state after the call", "{hasDefaultCreator=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput123() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.impl.CreatorCollector", "com.fasterxml.jackson.databind.deser.impl.CreatorCollector", "addDelegatingCreator", new String[]{"com.fasterxml.jackson.databind.introspect.AnnotatedWithParams", "boolean", "com.fasterxml.jackson.databind.deser.CreatorProperty[]"}, new String[]{"<sample:8>", "true", "<sample:1>"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.deser.impl.CreatorCollector", "constructValueInstantiator", "com.fasterxml.jackson.databind.DeserializationConfig", "<sample:3>"}, {"com.fasterxml.jackson.databind.deser.impl.CreatorCollector", "setDefaultCreator", "com.fasterxml.jackson.databind.introspect.AnnotatedWithParams", "<sample:5>"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{hasDefaultCreator=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput124() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.impl.CreatorCollector", "com.fasterxml.jackson.databind.deser.impl.CreatorCollector", "setDefaultCreator", new String[]{"com.fasterxml.jackson.databind.introspect.AnnotatedWithParams"}, new String[]{"<sample:10>"}, false);
  assertNull(actual);
  assertEquals("receiver state after the call", "{hasDefaultCreator=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput125() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.impl.CreatorCollector", "com.fasterxml.jackson.databind.deser.impl.CreatorCollector", "addDoubleCreator", new String[]{"com.fasterxml.jackson.databind.introspect.AnnotatedWithParams", "boolean"}, new String[]{"<sample:3>", "true"}, false, 12, new String[][]{{"com.fasterxml.jackson.databind.deser.impl.CreatorCollector", "addDoubleCreator", "com.fasterxml.jackson.databind.introspect.AnnotatedWithParams", "<sample:7>"}, {"com.fasterxml.jackson.databind.deser.impl.CreatorCollector", "addStringCreator", "com.fasterxml.jackson.databind.introspect.AnnotatedWithParams,boolean", "<sample:5>", "false"}, {"com.fasterxml.jackson.databind.deser.impl.CreatorCollector", "setDefaultCreator", "com.fasterxml.jackson.databind.introspect.AnnotatedWithParams", "<sample:1>"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{hasDefaultCreator=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput126() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.impl.CreatorCollector", "com.fasterxml.jackson.databind.deser.impl.CreatorCollector", "verifyNonDup", new String[]{"com.fasterxml.jackson.databind.introspect.AnnotatedWithParams", "int", "boolean"}, new String[]{"<sample:1>", "5", "true"}, false, 1, new String[][]{{"com.fasterxml.jackson.databind.deser.impl.CreatorCollector", "addLongCreator", "com.fasterxml.jackson.databind.introspect.AnnotatedWithParams", "<sample:6>"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput127() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.impl.CreatorCollector", "com.fasterxml.jackson.databind.deser.impl.CreatorCollector", "addStringCreator", new String[]{"com.fasterxml.jackson.databind.introspect.AnnotatedWithParams"}, new String[]{"<sample:8>"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.deser.impl.CreatorCollector", "verifyNonDup", "com.fasterxml.jackson.databind.introspect.AnnotatedWithParams,int", "<sample:4>", "1"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput128() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.impl.CreatorCollector", "com.fasterxml.jackson.databind.deser.impl.CreatorCollector", "verifyNonDup", new String[]{"com.fasterxml.jackson.databind.introspect.AnnotatedWithParams", "int"}, new String[]{"<sample:0>", "4"}, false);
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.databind.introspect.AnnotatedConstructor", actual.getClass().getName());
  assertEquals("receiver state after the call", "{hasDefaultCreator=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput129() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.impl.CreatorCollector", "com.fasterxml.jackson.databind.deser.impl.CreatorCollector", "addDelegatingCreator", new String[]{"com.fasterxml.jackson.databind.introspect.AnnotatedWithParams", "com.fasterxml.jackson.databind.deser.CreatorProperty[]"}, new String[]{"<sample:4>", "<empty>"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.deser.impl.CreatorCollector", "verifyNonDup", "com.fasterxml.jackson.databind.introspect.AnnotatedWithParams,int", "<sample:0>", "0"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{hasDefaultCreator=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput130() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.impl.CreatorCollector", "com.fasterxml.jackson.databind.deser.impl.CreatorCollector", "verifyNonDup", new String[]{"com.fasterxml.jackson.databind.introspect.AnnotatedWithParams", "int"}, new String[]{"<sample:11>", "0"}, false, 2, new String[][]{}), new String[][]{{"getName", "", "7"}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("asList", String.valueOf(actual));
  assertEquals("receiver state after the call", "{hasDefaultCreator=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput131() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.impl.CreatorCollector", "com.fasterxml.jackson.databind.deser.impl.CreatorCollector", "constructValueInstantiator", new String[]{"com.fasterxml.jackson.databind.DeserializationConfig"}, new String[]{"<sample:0>"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.deser.impl.CreatorCollector", "addIntCreator", "com.fasterxml.jackson.databind.introspect.AnnotatedWithParams", "<sample:3>"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput132() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.impl.CreatorCollector", "com.fasterxml.jackson.databind.deser.impl.CreatorCollector", "addDelegatingCreator", new String[]{"com.fasterxml.jackson.databind.introspect.AnnotatedWithParams", "com.fasterxml.jackson.databind.deser.CreatorProperty[]"}, new String[]{"<sample:1>", "<sample:1>"}, false);
  assertNull(actual);
  assertEquals("receiver state after the call", "{hasDefaultCreator=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput133() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.impl.CreatorCollector", "com.fasterxml.jackson.databind.deser.impl.CreatorCollector", "addIntCreator", new String[]{"com.fasterxml.jackson.databind.introspect.AnnotatedWithParams"}, new String[]{"<sample:3>"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.deser.impl.CreatorCollector", "addDoubleCreator", "com.fasterxml.jackson.databind.introspect.AnnotatedWithParams", "<sample:7>"}, {"com.fasterxml.jackson.databind.deser.impl.CreatorCollector", "addPropertyCreator", "com.fasterxml.jackson.databind.introspect.AnnotatedWithParams,boolean,com.fasterxml.jackson.databind.deser.CreatorProperty[]", "<sample:6>", "true", "<sample:2>"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{hasDefaultCreator=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput134() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.impl.CreatorCollector", "com.fasterxml.jackson.databind.deser.impl.CreatorCollector", "addPropertyCreator", new String[]{"com.fasterxml.jackson.databind.introspect.AnnotatedWithParams", "boolean", "com.fasterxml.jackson.databind.deser.CreatorProperty[]"}, new String[]{"<sample:7>", "true", "<sample:2>"}, false, 15, new String[][]{{"com.fasterxml.jackson.databind.deser.impl.CreatorCollector", "addBooleanCreator", "com.fasterxml.jackson.databind.introspect.AnnotatedWithParams,boolean", "<sample:11>", "true"}, {"com.fasterxml.jackson.databind.deser.impl.CreatorCollector", "addBooleanCreator", "com.fasterxml.jackson.databind.introspect.AnnotatedWithParams", "<sample:5>"}, {"com.fasterxml.jackson.databind.deser.impl.CreatorCollector", "addPropertyCreator", "com.fasterxml.jackson.databind.introspect.AnnotatedWithParams,com.fasterxml.jackson.databind.deser.CreatorProperty[]", "<sample:4>", "<sample:2>"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput135() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.impl.CreatorCollector", "com.fasterxml.jackson.databind.deser.impl.CreatorCollector", "addDoubleCreator", new String[]{"com.fasterxml.jackson.databind.introspect.AnnotatedWithParams"}, new String[]{"<sample:5>"}, false, 1, new String[][]{}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput136() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.impl.CreatorCollector", "com.fasterxml.jackson.databind.deser.impl.CreatorCollector", "addBooleanCreator", new String[]{"com.fasterxml.jackson.databind.introspect.AnnotatedWithParams", "boolean"}, new String[]{"<sample:1>", "true"}, false, 1, new String[][]{{"com.fasterxml.jackson.databind.deser.impl.CreatorCollector", "verifyNonDup", "com.fasterxml.jackson.databind.introspect.AnnotatedWithParams,int", "<sample:2>", "3"}, {"com.fasterxml.jackson.databind.deser.impl.CreatorCollector", "addIncompeteParameter", "com.fasterxml.jackson.databind.introspect.AnnotatedParameter", "<sample:0>"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput137() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.impl.CreatorCollector", "com.fasterxml.jackson.databind.deser.impl.CreatorCollector", "addBooleanCreator", new String[]{"com.fasterxml.jackson.databind.introspect.AnnotatedWithParams", "boolean"}, new String[]{"<sample:12>", "true"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.deser.impl.CreatorCollector", "setDefaultCreator", "com.fasterxml.jackson.databind.introspect.AnnotatedWithParams", "<sample:6>"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{hasDefaultCreator=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput138() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.impl.CreatorCollector", "com.fasterxml.jackson.databind.deser.impl.CreatorCollector", "addDelegatingCreator", new String[]{"com.fasterxml.jackson.databind.introspect.AnnotatedWithParams", "com.fasterxml.jackson.databind.deser.CreatorProperty[]"}, new String[]{"<sample:9>", "<sample:1>"}, false, 5, new String[][]{{"com.fasterxml.jackson.databind.deser.impl.CreatorCollector", "constructValueInstantiator", "com.fasterxml.jackson.databind.DeserializationConfig", "<sample:7>"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput139() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.impl.CreatorCollector", "com.fasterxml.jackson.databind.deser.impl.CreatorCollector", "addIncompeteParameter", new String[]{"com.fasterxml.jackson.databind.introspect.AnnotatedParameter"}, new String[]{"<sample:4>"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.deser.impl.CreatorCollector", "setDefaultCreator", "com.fasterxml.jackson.databind.introspect.AnnotatedWithParams", "<sample:5>"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{hasDefaultCreator=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput140() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.impl.CreatorCollector", "com.fasterxml.jackson.databind.deser.impl.CreatorCollector", "addPropertyCreator", new String[]{"com.fasterxml.jackson.databind.introspect.AnnotatedWithParams", "com.fasterxml.jackson.databind.deser.CreatorProperty[]"}, new String[]{"<sample:0>", "<sample:10>"}, false, 6, new String[][]{{"com.fasterxml.jackson.databind.deser.impl.CreatorCollector", "addStringCreator", "com.fasterxml.jackson.databind.introspect.AnnotatedWithParams", "<sample:11>"}, {"com.fasterxml.jackson.databind.deser.impl.CreatorCollector", "addIncompeteParameter", "com.fasterxml.jackson.databind.introspect.AnnotatedParameter", "<sample:5>"}, {"com.fasterxml.jackson.databind.deser.impl.CreatorCollector", "addPropertyCreator", "com.fasterxml.jackson.databind.introspect.AnnotatedWithParams,com.fasterxml.jackson.databind.deser.CreatorProperty[]", "<sample:13>", "<empty>"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{hasDefaultCreator=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput141() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.impl.CreatorCollector", "com.fasterxml.jackson.databind.deser.impl.CreatorCollector", "addStringCreator", new String[]{"com.fasterxml.jackson.databind.introspect.AnnotatedWithParams", "boolean"}, new String[]{"<sample:1>", "false"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.deser.impl.CreatorCollector", "addStringCreator", "com.fasterxml.jackson.databind.introspect.AnnotatedWithParams", "<sample:7>"}, {"com.fasterxml.jackson.databind.deser.impl.CreatorCollector", "addDelegatingCreator", "com.fasterxml.jackson.databind.introspect.AnnotatedWithParams,com.fasterxml.jackson.databind.deser.CreatorProperty[]", "<sample:9>", "<sample:0>"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput142() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.impl.CreatorCollector", "com.fasterxml.jackson.databind.deser.impl.CreatorCollector", "addDelegatingCreator", new String[]{"com.fasterxml.jackson.databind.introspect.AnnotatedWithParams", "com.fasterxml.jackson.databind.deser.CreatorProperty[]"}, new String[]{"<sample:11>", "<sample:6>"}, false, 8, new String[][]{{"com.fasterxml.jackson.databind.deser.impl.CreatorCollector", "addDelegatingCreator", "com.fasterxml.jackson.databind.introspect.AnnotatedWithParams,com.fasterxml.jackson.databind.deser.CreatorProperty[]", "<sample:2>", "<sample:8>"}, {"com.fasterxml.jackson.databind.deser.impl.CreatorCollector", "addPropertyCreator", "com.fasterxml.jackson.databind.introspect.AnnotatedWithParams,com.fasterxml.jackson.databind.deser.CreatorProperty[]", "<sample:0>", "<sample:10>"}, {"com.fasterxml.jackson.databind.deser.impl.CreatorCollector", "addDelegatingCreator", "com.fasterxml.jackson.databind.introspect.AnnotatedWithParams,boolean,com.fasterxml.jackson.databind.deser.CreatorProperty[]", "<sample:11>", "false", "<sample:8>"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput143() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.impl.CreatorCollector", "com.fasterxml.jackson.databind.deser.impl.CreatorCollector", "addBooleanCreator", new String[]{"com.fasterxml.jackson.databind.introspect.AnnotatedWithParams"}, new String[]{"<sample:6>"}, false, 14, new String[][]{{"com.fasterxml.jackson.databind.deser.impl.CreatorCollector", "setDefaultCreator", "com.fasterxml.jackson.databind.introspect.AnnotatedWithParams", "<sample:7>"}, {"com.fasterxml.jackson.databind.deser.impl.CreatorCollector", "addDelegatingCreator", "com.fasterxml.jackson.databind.introspect.AnnotatedWithParams,boolean,com.fasterxml.jackson.databind.deser.CreatorProperty[]", "<sample:8>", "true", "<null>"}, {"com.fasterxml.jackson.databind.deser.impl.CreatorCollector", "addBooleanCreator", "com.fasterxml.jackson.databind.introspect.AnnotatedWithParams", "<sample:16>"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{hasDefaultCreator=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput144() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.impl.CreatorCollector", "com.fasterxml.jackson.databind.deser.impl.CreatorCollector", "addBooleanCreator", new String[]{"com.fasterxml.jackson.databind.introspect.AnnotatedWithParams"}, new String[]{"<sample:12>"}, false, 14, new String[][]{{"com.fasterxml.jackson.databind.deser.impl.CreatorCollector", "addBooleanCreator", "com.fasterxml.jackson.databind.introspect.AnnotatedWithParams", "<sample:16>"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput145() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.impl.CreatorCollector", "com.fasterxml.jackson.databind.deser.impl.CreatorCollector", "addBooleanCreator", new String[]{"com.fasterxml.jackson.databind.introspect.AnnotatedWithParams"}, new String[]{"<sample:5>"}, false, 7, new String[][]{{"com.fasterxml.jackson.databind.deser.impl.CreatorCollector", "addPropertyCreator", "com.fasterxml.jackson.databind.introspect.AnnotatedWithParams,com.fasterxml.jackson.databind.deser.CreatorProperty[]", "<sample:1>", "<sample:10>"}, {"com.fasterxml.jackson.databind.deser.impl.CreatorCollector", "addPropertyCreator", "com.fasterxml.jackson.databind.introspect.AnnotatedWithParams,boolean,com.fasterxml.jackson.databind.deser.CreatorProperty[]", "<sample:2>", "true", "<sample:1>"}, {"com.fasterxml.jackson.databind.deser.impl.CreatorCollector", "addDoubleCreator", "com.fasterxml.jackson.databind.introspect.AnnotatedWithParams", "<sample:4>"}}, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput146() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.impl.CreatorCollector", "com.fasterxml.jackson.databind.deser.impl.CreatorCollector", "addBooleanCreator", new String[]{"com.fasterxml.jackson.databind.introspect.AnnotatedWithParams"}, new String[]{"<sample:4>"}, false, 8, new String[][]{{"com.fasterxml.jackson.databind.deser.impl.CreatorCollector", "addPropertyCreator", "com.fasterxml.jackson.databind.introspect.AnnotatedWithParams,com.fasterxml.jackson.databind.deser.CreatorProperty[]", "<sample:1>", "<sample:10>"}, {"com.fasterxml.jackson.databind.deser.impl.CreatorCollector", "addPropertyCreator", "com.fasterxml.jackson.databind.introspect.AnnotatedWithParams,boolean,com.fasterxml.jackson.databind.deser.CreatorProperty[]", "<sample:2>", "true", "<sample:1>"}, {"com.fasterxml.jackson.databind.deser.impl.CreatorCollector", "addDoubleCreator", "com.fasterxml.jackson.databind.introspect.AnnotatedWithParams", "<sample:4>"}}, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput147() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.impl.CreatorCollector", "com.fasterxml.jackson.databind.deser.impl.CreatorCollector", "constructValueInstantiator", new String[]{"com.fasterxml.jackson.databind.DeserializationConfig"}, new String[]{"<sample:7>"}, false, 0, null, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput148() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.impl.CreatorCollector", "com.fasterxml.jackson.databind.deser.impl.CreatorCollector", "addPropertyCreator", new String[]{"com.fasterxml.jackson.databind.introspect.AnnotatedWithParams", "com.fasterxml.jackson.databind.deser.CreatorProperty[]"}, new String[]{"<sample:4>", "<sample:1>"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.deser.impl.CreatorCollector", "verifyNonDup", "com.fasterxml.jackson.databind.introspect.AnnotatedWithParams,int,boolean", "<sample:12>", "10", "false"}, {"com.fasterxml.jackson.databind.deser.impl.CreatorCollector", "constructValueInstantiator", "com.fasterxml.jackson.databind.DeserializationConfig", "<sample:5>"}}, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput149() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.impl.CreatorCollector", "com.fasterxml.jackson.databind.deser.impl.CreatorCollector", "addPropertyCreator", new String[]{"com.fasterxml.jackson.databind.introspect.AnnotatedWithParams", "com.fasterxml.jackson.databind.deser.CreatorProperty[]"}, new String[]{"<sample:17>", "<sample:11>"}, false, 6, new String[][]{{"com.fasterxml.jackson.databind.deser.impl.CreatorCollector", "verifyNonDup", "com.fasterxml.jackson.databind.introspect.AnnotatedWithParams,int", "<sample:4>", "0"}, {"com.fasterxml.jackson.databind.deser.impl.CreatorCollector", "constructValueInstantiator", "com.fasterxml.jackson.databind.DeserializationConfig", "<sample:7>"}, {"com.fasterxml.jackson.databind.deser.impl.CreatorCollector", "addBooleanCreator", "com.fasterxml.jackson.databind.introspect.AnnotatedWithParams,boolean", "<sample:5>", "false"}}, 3);
  assertNull(actual);
  assertEquals("receiver state after the call", "{hasDefaultCreator=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput150() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.impl.CreatorCollector", "com.fasterxml.jackson.databind.deser.impl.CreatorCollector", "addPropertyCreator", new String[]{"com.fasterxml.jackson.databind.introspect.AnnotatedWithParams", "com.fasterxml.jackson.databind.deser.CreatorProperty[]"}, new String[]{"<sample:17>", "<sample:11>"}, false, 6, new String[][]{{"com.fasterxml.jackson.databind.deser.impl.CreatorCollector", "verifyNonDup", "com.fasterxml.jackson.databind.introspect.AnnotatedWithParams,int", "<sample:4>", "0"}, {"com.fasterxml.jackson.databind.deser.impl.CreatorCollector", "constructValueInstantiator", "com.fasterxml.jackson.databind.DeserializationConfig", "<sample:1>"}, {"com.fasterxml.jackson.databind.deser.impl.CreatorCollector", "addBooleanCreator", "com.fasterxml.jackson.databind.introspect.AnnotatedWithParams,boolean", "<sample:5>", "false"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{hasDefaultCreator=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput151() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.impl.CreatorCollector", "com.fasterxml.jackson.databind.deser.impl.CreatorCollector", "addDoubleCreator", new String[]{"com.fasterxml.jackson.databind.introspect.AnnotatedWithParams", "boolean"}, new String[]{"<sample:12>", "false"}, false, 0, null, 2);
  assertNull(actual);
  assertEquals("receiver state after the call", "{hasDefaultCreator=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput152() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.impl.CreatorCollector", "com.fasterxml.jackson.databind.deser.impl.CreatorCollector", "addPropertyCreator", new String[]{"com.fasterxml.jackson.databind.introspect.AnnotatedWithParams", "com.fasterxml.jackson.databind.deser.CreatorProperty[]"}, new String[]{"<sample:4>", "<sample:8>"}, false, 6, new String[][]{{"com.fasterxml.jackson.databind.deser.impl.CreatorCollector", "addStringCreator", "com.fasterxml.jackson.databind.introspect.AnnotatedWithParams,boolean", "<sample:10>", "false"}, {"com.fasterxml.jackson.databind.deser.impl.CreatorCollector", "constructValueInstantiator", "com.fasterxml.jackson.databind.DeserializationConfig", "<sample:1>"}, {"com.fasterxml.jackson.databind.deser.impl.CreatorCollector", "addStringCreator", "com.fasterxml.jackson.databind.introspect.AnnotatedWithParams", "<sample:18>"}}, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput153() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.impl.CreatorCollector", "com.fasterxml.jackson.databind.deser.impl.CreatorCollector", "addPropertyCreator", new String[]{"com.fasterxml.jackson.databind.introspect.AnnotatedWithParams", "com.fasterxml.jackson.databind.deser.CreatorProperty[]"}, new String[]{"<sample:4>", "<sample:10>"}, false, 6, new String[][]{{"com.fasterxml.jackson.databind.deser.impl.CreatorCollector", "addStringCreator", "com.fasterxml.jackson.databind.introspect.AnnotatedWithParams,boolean", "<sample:10>", "false"}, {"com.fasterxml.jackson.databind.deser.impl.CreatorCollector", "constructValueInstantiator", "com.fasterxml.jackson.databind.DeserializationConfig", "<sample:1>"}, {"com.fasterxml.jackson.databind.deser.impl.CreatorCollector", "addStringCreator", "com.fasterxml.jackson.databind.introspect.AnnotatedWithParams", "<sample:18>"}}, 1);
  assertNull(actual);
  assertEquals("receiver state after the call", "{hasDefaultCreator=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput154() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.impl.CreatorCollector", "com.fasterxml.jackson.databind.deser.impl.CreatorCollector", "addIncompeteParameter", new String[]{"com.fasterxml.jackson.databind.introspect.AnnotatedParameter"}, new String[]{"<sample:3>"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.deser.impl.CreatorCollector", "hasDefaultCreator", ""}}, 3);
  assertNull(actual);
  assertEquals("receiver state after the call", "{hasDefaultCreator=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput155() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.impl.CreatorCollector", "com.fasterxml.jackson.databind.deser.impl.CreatorCollector", "verifyNonDup", new String[]{"com.fasterxml.jackson.databind.introspect.AnnotatedWithParams", "int"}, new String[]{"<sample:12>", "2147483619"}, false, 6, new String[][]{{"com.fasterxml.jackson.databind.deser.impl.CreatorCollector", "addBooleanCreator", "com.fasterxml.jackson.databind.introspect.AnnotatedWithParams", "<sample:12>"}}, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.ArrayIndexOutOfBoundsException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput156() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.impl.CreatorCollector", "com.fasterxml.jackson.databind.deser.impl.CreatorCollector", "verifyNonDup", new String[]{"com.fasterxml.jackson.databind.introspect.AnnotatedWithParams", "int"}, new String[]{"<sample:2>", "7"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.deser.impl.CreatorCollector", "addDoubleCreator", "com.fasterxml.jackson.databind.introspect.AnnotatedWithParams,boolean", "<sample:5>", "false"}}, 2), new String[][]{{"getAnnotated", "", "1"}, {"canAccess", "java.lang.Object", "5"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput157() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.impl.CreatorCollector", "com.fasterxml.jackson.databind.deser.impl.CreatorCollector", "verifyNonDup", new String[]{"com.fasterxml.jackson.databind.introspect.AnnotatedWithParams", "int"}, new String[]{"<sample:10>", "3"}, false, 3, new String[][]{{"com.fasterxml.jackson.databind.deser.impl.CreatorCollector", "addDoubleCreator", "com.fasterxml.jackson.databind.introspect.AnnotatedWithParams,boolean", "<sample:5>", "false"}, {"com.fasterxml.jackson.databind.deser.impl.CreatorCollector", "verifyNonDup", "com.fasterxml.jackson.databind.introspect.AnnotatedWithParams,int", "<sample:1>", "0"}}, 2);
  assertNull(actual);
  assertEquals("receiver state after the call", "{hasDefaultCreator=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput158() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.impl.CreatorCollector", "com.fasterxml.jackson.databind.deser.impl.CreatorCollector", "verifyNonDup", new String[]{"com.fasterxml.jackson.databind.introspect.AnnotatedWithParams", "int"}, new String[]{"<sample:10>", "3"}, false, 3, new String[][]{{"com.fasterxml.jackson.databind.deser.impl.CreatorCollector", "addDoubleCreator", "com.fasterxml.jackson.databind.introspect.AnnotatedWithParams,boolean", "<sample:5>", "false"}, {"com.fasterxml.jackson.databind.deser.impl.CreatorCollector", "verifyNonDup", "com.fasterxml.jackson.databind.introspect.AnnotatedWithParams,int", "<sample:18>", "0"}}, 2);
  assertNull(actual);
  assertEquals("receiver state after the call", "{hasDefaultCreator=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput159() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.impl.CreatorCollector", "com.fasterxml.jackson.databind.deser.impl.CreatorCollector", "addDoubleCreator", new String[]{"com.fasterxml.jackson.databind.introspect.AnnotatedWithParams"}, new String[]{"<sample:9>"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.deser.impl.CreatorCollector", "addDoubleCreator", "com.fasterxml.jackson.databind.introspect.AnnotatedWithParams", "<sample:8>"}, {"com.fasterxml.jackson.databind.deser.impl.CreatorCollector", "verifyNonDup", "com.fasterxml.jackson.databind.introspect.AnnotatedWithParams,int", "<sample:6>", "1"}, {"com.fasterxml.jackson.databind.deser.impl.CreatorCollector", "addPropertyCreator", "com.fasterxml.jackson.databind.introspect.AnnotatedWithParams,boolean,com.fasterxml.jackson.databind.deser.CreatorProperty[]", "<sample:17>", "true", "<sample:10>"}}, 2);
  assertNull(actual);
  assertEquals("receiver state after the call", "{hasDefaultCreator=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput160() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.impl.CreatorCollector", "com.fasterxml.jackson.databind.deser.impl.CreatorCollector", "addDoubleCreator", new String[]{"com.fasterxml.jackson.databind.introspect.AnnotatedWithParams"}, new String[]{"<sample:1>"}, false, 1, new String[][]{{"com.fasterxml.jackson.databind.deser.impl.CreatorCollector", "addPropertyCreator", "com.fasterxml.jackson.databind.introspect.AnnotatedWithParams,boolean,com.fasterxml.jackson.databind.deser.CreatorProperty[]", "<sample:11>", "true", "<empty>"}, {"com.fasterxml.jackson.databind.deser.impl.CreatorCollector", "addPropertyCreator", "com.fasterxml.jackson.databind.introspect.AnnotatedWithParams,boolean,com.fasterxml.jackson.databind.deser.CreatorProperty[]", "<sample:17>", "true", "<sample:10>"}}, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput161() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.impl.CreatorCollector", "com.fasterxml.jackson.databind.deser.impl.CreatorCollector", "addIncompeteParameter", new String[]{"com.fasterxml.jackson.databind.introspect.AnnotatedParameter"}, new String[]{"<sample:1>"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.deser.impl.CreatorCollector", "addStringCreator", "com.fasterxml.jackson.databind.introspect.AnnotatedWithParams,boolean", "<sample:1>", "false"}}, 2);
  assertNull(actual);
  assertEquals("receiver state after the call", "{hasDefaultCreator=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput162() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.impl.CreatorCollector", "com.fasterxml.jackson.databind.deser.impl.CreatorCollector", "addDoubleCreator", new String[]{"com.fasterxml.jackson.databind.introspect.AnnotatedWithParams", "boolean"}, new String[]{"<sample:9>", "true"}, false, 9, new String[][]{}, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput163() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.impl.CreatorCollector", "com.fasterxml.jackson.databind.deser.impl.CreatorCollector", "addDoubleCreator", new String[]{"com.fasterxml.jackson.databind.introspect.AnnotatedWithParams", "boolean"}, new String[]{"<sample:11>", "true"}, false, 9, new String[][]{{"com.fasterxml.jackson.databind.deser.impl.CreatorCollector", "addPropertyCreator", "com.fasterxml.jackson.databind.introspect.AnnotatedWithParams,com.fasterxml.jackson.databind.deser.CreatorProperty[]", "<sample:1>", "<null>"}}, 3);
  assertNull(actual);
  assertEquals("receiver state after the call", "{hasDefaultCreator=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput164() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.impl.CreatorCollector", "com.fasterxml.jackson.databind.deser.impl.CreatorCollector", "addLongCreator", new String[]{"com.fasterxml.jackson.databind.introspect.AnnotatedWithParams"}, new String[]{"<sample:6>"}, false, 0, null, 1);
  assertNull(actual);
  assertEquals("receiver state after the call", "{hasDefaultCreator=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput165() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.impl.CreatorCollector", "com.fasterxml.jackson.databind.deser.impl.CreatorCollector", "addLongCreator", new String[]{"com.fasterxml.jackson.databind.introspect.AnnotatedWithParams"}, new String[]{"<sample:1>"}, false, 9, new String[][]{{"com.fasterxml.jackson.databind.deser.impl.CreatorCollector", "addIntCreator", "com.fasterxml.jackson.databind.introspect.AnnotatedWithParams,boolean", "<sample:8>", "false"}, {"com.fasterxml.jackson.databind.deser.impl.CreatorCollector", "addStringCreator", "com.fasterxml.jackson.databind.introspect.AnnotatedWithParams,boolean", "<sample:2>", "true"}}, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput166() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.impl.CreatorCollector", "com.fasterxml.jackson.databind.deser.impl.CreatorCollector", "addIntCreator", new String[]{"com.fasterxml.jackson.databind.introspect.AnnotatedWithParams"}, new String[]{"<sample:9>"}, false, 10, new String[][]{}, 1);
  assertNull(actual);
  assertEquals("receiver state after the call", "{hasDefaultCreator=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput167() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.impl.CreatorCollector", "com.fasterxml.jackson.databind.deser.impl.CreatorCollector", "addIntCreator", new String[]{"com.fasterxml.jackson.databind.introspect.AnnotatedWithParams"}, new String[]{"<sample:14>"}, false, 10, new String[][]{{"com.fasterxml.jackson.databind.deser.impl.CreatorCollector", "verifyNonDup", "com.fasterxml.jackson.databind.introspect.AnnotatedWithParams,int", "<sample:4>", "0"}, {"com.fasterxml.jackson.databind.deser.impl.CreatorCollector", "addIncompeteParameter", "com.fasterxml.jackson.databind.introspect.AnnotatedParameter", "<sample:1>"}}, 1);
  assertNull(actual);
  assertEquals("receiver state after the call", "{hasDefaultCreator=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput168() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.impl.CreatorCollector", "com.fasterxml.jackson.databind.deser.impl.CreatorCollector", "addLongCreator", new String[]{"com.fasterxml.jackson.databind.introspect.AnnotatedWithParams"}, new String[]{"<sample:6>"}, false, 1, new String[][]{{"com.fasterxml.jackson.databind.deser.impl.CreatorCollector", "addIncompeteParameter", "com.fasterxml.jackson.databind.introspect.AnnotatedParameter", "<sample:1>"}, {"com.fasterxml.jackson.databind.deser.impl.CreatorCollector", "addBooleanCreator", "com.fasterxml.jackson.databind.introspect.AnnotatedWithParams,boolean", "<sample:4>", "false"}, {"com.fasterxml.jackson.databind.deser.impl.CreatorCollector", "addLongCreator", "com.fasterxml.jackson.databind.introspect.AnnotatedWithParams,boolean", "<sample:0>", "false"}}, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput169() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.impl.CreatorCollector", "com.fasterxml.jackson.databind.deser.impl.CreatorCollector", "addBooleanCreator", new String[]{"com.fasterxml.jackson.databind.introspect.AnnotatedWithParams", "boolean"}, new String[]{"<sample:11>", "true"}, false, 10, new String[][]{{"com.fasterxml.jackson.databind.deser.impl.CreatorCollector", "addBooleanCreator", "com.fasterxml.jackson.databind.introspect.AnnotatedWithParams,boolean", "<sample:0>", "false"}, {"com.fasterxml.jackson.databind.deser.impl.CreatorCollector", "addDelegatingCreator", "com.fasterxml.jackson.databind.introspect.AnnotatedWithParams,com.fasterxml.jackson.databind.deser.CreatorProperty[]", "<sample:11>", "<sample:11>"}}, 2);
  assertNull(actual);
  assertEquals("receiver state after the call", "{hasDefaultCreator=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput170() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.impl.CreatorCollector", "com.fasterxml.jackson.databind.deser.impl.CreatorCollector", "addDoubleCreator", new String[]{"com.fasterxml.jackson.databind.introspect.AnnotatedWithParams", "boolean"}, new String[]{"<sample:1>", "true"}, false, 3, new String[][]{}, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput171() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.impl.CreatorCollector", "com.fasterxml.jackson.databind.deser.impl.CreatorCollector", "addIncompeteParameter", new String[]{"com.fasterxml.jackson.databind.introspect.AnnotatedParameter"}, new String[]{"<sample:3>"}, false, 4, new String[][]{{"com.fasterxml.jackson.databind.deser.impl.CreatorCollector", "setDefaultCreator", "com.fasterxml.jackson.databind.introspect.AnnotatedWithParams", "<sample:0>"}, {"com.fasterxml.jackson.databind.deser.impl.CreatorCollector", "addLongCreator", "com.fasterxml.jackson.databind.introspect.AnnotatedWithParams,boolean", "<sample:13>", "true"}, {"com.fasterxml.jackson.databind.deser.impl.CreatorCollector", "addDelegatingCreator", "com.fasterxml.jackson.databind.introspect.AnnotatedWithParams,com.fasterxml.jackson.databind.deser.CreatorProperty[]", "<sample:11>", "<sample:11>"}}, 2);
  assertNull(actual);
  assertEquals("receiver state after the call", "{hasDefaultCreator=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput172() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.impl.CreatorCollector", "com.fasterxml.jackson.databind.deser.impl.CreatorCollector", "addBooleanCreator", new String[]{"com.fasterxml.jackson.databind.introspect.AnnotatedWithParams", "boolean"}, new String[]{"<sample:4>", "true"}, false, 10, new String[][]{{"com.fasterxml.jackson.databind.deser.impl.CreatorCollector", "addStringCreator", "com.fasterxml.jackson.databind.introspect.AnnotatedWithParams,boolean", "<sample:7>", "false"}}, 1);
  assertNull(actual);
  assertEquals("receiver state after the call", "{hasDefaultCreator=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput173() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.impl.CreatorCollector", "com.fasterxml.jackson.databind.deser.impl.CreatorCollector", "addLongCreator", new String[]{"com.fasterxml.jackson.databind.introspect.AnnotatedWithParams", "boolean"}, new String[]{"<sample:0>", "false"}, false, 3, new String[][]{{"com.fasterxml.jackson.databind.deser.impl.CreatorCollector", "addDelegatingCreator", "com.fasterxml.jackson.databind.introspect.AnnotatedWithParams,com.fasterxml.jackson.databind.deser.CreatorProperty[]", "<sample:10>", "<empty>"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput174() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.impl.CreatorCollector", "com.fasterxml.jackson.databind.deser.impl.CreatorCollector", "addIntCreator", new String[]{"com.fasterxml.jackson.databind.introspect.AnnotatedWithParams"}, new String[]{"<sample:6>"}, false, 6, new String[][]{{"com.fasterxml.jackson.databind.deser.impl.CreatorCollector", "setDefaultCreator", "com.fasterxml.jackson.databind.introspect.AnnotatedWithParams", "<sample:12>"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{hasDefaultCreator=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput175() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.impl.CreatorCollector", "com.fasterxml.jackson.databind.deser.impl.CreatorCollector", "addIntCreator", new String[]{"com.fasterxml.jackson.databind.introspect.AnnotatedWithParams"}, new String[]{"<sample:6>"}, false, 5, new String[][]{{"com.fasterxml.jackson.databind.deser.impl.CreatorCollector", "setDefaultCreator", "com.fasterxml.jackson.databind.introspect.AnnotatedWithParams", "<sample:12>"}}, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput176() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.impl.CreatorCollector", "com.fasterxml.jackson.databind.deser.impl.CreatorCollector", "verifyNonDup", new String[]{"com.fasterxml.jackson.databind.introspect.AnnotatedWithParams", "int"}, new String[]{"<sample:9>", "1"}, false, 6, new String[][]{{"com.fasterxml.jackson.databind.deser.impl.CreatorCollector", "addDoubleCreator", "com.fasterxml.jackson.databind.introspect.AnnotatedWithParams", "<sample:7>"}, {"com.fasterxml.jackson.databind.deser.impl.CreatorCollector", "addPropertyCreator", "com.fasterxml.jackson.databind.introspect.AnnotatedWithParams,boolean,com.fasterxml.jackson.databind.deser.CreatorProperty[]", "<sample:7>", "false", "<sample:1>"}, {"com.fasterxml.jackson.databind.deser.impl.CreatorCollector", "constructValueInstantiator", "com.fasterxml.jackson.databind.DeserializationConfig", "<sample:3>"}}, 1), new String[][]{{"getAnnotation", "java.lang.Class", "5"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput177() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.impl.CreatorCollector", "com.fasterxml.jackson.databind.deser.impl.CreatorCollector", "verifyNonDup", new String[]{"com.fasterxml.jackson.databind.introspect.AnnotatedWithParams", "int"}, new String[]{"<sample:8>", "1"}, false, 6, new String[][]{{"com.fasterxml.jackson.databind.deser.impl.CreatorCollector", "addIntCreator", "com.fasterxml.jackson.databind.introspect.AnnotatedWithParams", "<sample:12>"}, {"com.fasterxml.jackson.databind.deser.impl.CreatorCollector", "addDoubleCreator", "com.fasterxml.jackson.databind.introspect.AnnotatedWithParams", "<sample:7>"}, {"com.fasterxml.jackson.databind.deser.impl.CreatorCollector", "constructValueInstantiator", "com.fasterxml.jackson.databind.DeserializationConfig", "<sample:3>"}}, 1);
  assertNull(actual);
  assertEquals("receiver state after the call", "{hasDefaultCreator=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput178() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.impl.CreatorCollector", "com.fasterxml.jackson.databind.deser.impl.CreatorCollector", "setDefaultCreator", new String[]{"com.fasterxml.jackson.databind.introspect.AnnotatedWithParams"}, new String[]{"<sample:10>"}, false, 0, null, 3);
  assertNull(actual);
  assertEquals("receiver state after the call", "{hasDefaultCreator=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput179() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.impl.CreatorCollector", "com.fasterxml.jackson.databind.deser.impl.CreatorCollector", "addLongCreator", new String[]{"com.fasterxml.jackson.databind.introspect.AnnotatedWithParams", "boolean"}, new String[]{"<null>", "true"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.deser.impl.CreatorCollector", "addStringCreator", "com.fasterxml.jackson.databind.introspect.AnnotatedWithParams", "<sample:12>"}, {"com.fasterxml.jackson.databind.deser.impl.CreatorCollector", "setDefaultCreator", "com.fasterxml.jackson.databind.introspect.AnnotatedWithParams", "<sample:11>"}}, 3);
  assertNull(actual);
  assertEquals("receiver state after the call", "{hasDefaultCreator=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput180() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.impl.CreatorCollector", "com.fasterxml.jackson.databind.deser.impl.CreatorCollector", "addIntCreator", new String[]{"com.fasterxml.jackson.databind.introspect.AnnotatedWithParams"}, new String[]{"<null>"}, false, 15, new String[][]{}, 3);
  assertNull(actual);
  assertEquals("receiver state after the call", "{hasDefaultCreator=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput181() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.impl.CreatorCollector", "com.fasterxml.jackson.databind.deser.impl.CreatorCollector", "verifyNonDup", new String[]{"com.fasterxml.jackson.databind.introspect.AnnotatedWithParams", "int", "boolean"}, new String[]{"<sample:9>", "-3", "true"}, false, 12, new String[][]{}, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.ArrayIndexOutOfBoundsException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput182() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.impl.CreatorCollector", "com.fasterxml.jackson.databind.deser.impl.CreatorCollector", "verifyNonDup", new String[]{"com.fasterxml.jackson.databind.introspect.AnnotatedWithParams", "int", "boolean"}, new String[]{"<sample:8>", "4", "true"}, false, 2, new String[][]{{"com.fasterxml.jackson.databind.deser.impl.CreatorCollector", "addDelegatingCreator", "com.fasterxml.jackson.databind.introspect.AnnotatedWithParams,com.fasterxml.jackson.databind.deser.CreatorProperty[]", "<null>", "<sample:10>"}, {"com.fasterxml.jackson.databind.deser.impl.CreatorCollector", "addIntCreator", "com.fasterxml.jackson.databind.introspect.AnnotatedWithParams", "<sample:11>"}}, 2);
  assertNull(actual);
  assertEquals("receiver state after the call", "{hasDefaultCreator=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput183() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.impl.CreatorCollector", "com.fasterxml.jackson.databind.deser.impl.CreatorCollector", "verifyNonDup", new String[]{"com.fasterxml.jackson.databind.introspect.AnnotatedWithParams", "int", "boolean"}, new String[]{"<sample:0>", "4", "true"}, false, 1, new String[][]{{"com.fasterxml.jackson.databind.deser.impl.CreatorCollector", "addDelegatingCreator", "com.fasterxml.jackson.databind.introspect.AnnotatedWithParams,com.fasterxml.jackson.databind.deser.CreatorProperty[]", "<null>", "<sample:10>"}, {"com.fasterxml.jackson.databind.deser.impl.CreatorCollector", "addIntCreator", "com.fasterxml.jackson.databind.introspect.AnnotatedWithParams", "<sample:11>"}}, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput184() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.impl.CreatorCollector", "com.fasterxml.jackson.databind.deser.impl.CreatorCollector", "hasDefaultCreator", new String[]{}, new String[]{}, false, 12, new String[][]{{"com.fasterxml.jackson.databind.deser.impl.CreatorCollector", "addBooleanCreator", "com.fasterxml.jackson.databind.introspect.AnnotatedWithParams", "<sample:22>"}, {"com.fasterxml.jackson.databind.deser.impl.CreatorCollector", "setDefaultCreator", "com.fasterxml.jackson.databind.introspect.AnnotatedWithParams", "<sample:8>"}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{hasDefaultCreator=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput185() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.impl.CreatorCollector", "com.fasterxml.jackson.databind.deser.impl.CreatorCollector", "hasDefaultCreator", new String[]{}, new String[]{}, false, 12, new String[][]{{"com.fasterxml.jackson.databind.deser.impl.CreatorCollector", "addBooleanCreator", "com.fasterxml.jackson.databind.introspect.AnnotatedWithParams", "<sample:22>"}, {"com.fasterxml.jackson.databind.deser.impl.CreatorCollector", "setDefaultCreator", "com.fasterxml.jackson.databind.introspect.AnnotatedWithParams", "<sample:7>"}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
  assertEquals("receiver state after the call", "{hasDefaultCreator=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput186() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.impl.CreatorCollector", "com.fasterxml.jackson.databind.deser.impl.CreatorCollector", "hasDefaultCreator", new String[]{}, new String[]{}, false, 12, new String[][]{{"com.fasterxml.jackson.databind.deser.impl.CreatorCollector", "addBooleanCreator", "com.fasterxml.jackson.databind.introspect.AnnotatedWithParams", "<sample:22>"}, {"com.fasterxml.jackson.databind.deser.impl.CreatorCollector", "setDefaultCreator", "com.fasterxml.jackson.databind.introspect.AnnotatedWithParams", "<sample:7>"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
  assertEquals("receiver state after the call", "{hasDefaultCreator=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput187() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.impl.CreatorCollector", "com.fasterxml.jackson.databind.deser.impl.CreatorCollector", "addLongCreator", new String[]{"com.fasterxml.jackson.databind.introspect.AnnotatedWithParams", "boolean"}, new String[]{"<sample:7>", "false"}, false, 0, null, 1);
  assertNull(actual);
  assertEquals("receiver state after the call", "{hasDefaultCreator=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput188() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.impl.CreatorCollector", "com.fasterxml.jackson.databind.deser.impl.CreatorCollector", "addIntCreator", new String[]{"com.fasterxml.jackson.databind.introspect.AnnotatedWithParams"}, new String[]{"<sample:9>"}, false, 1, new String[][]{{"com.fasterxml.jackson.databind.deser.impl.CreatorCollector", "verifyNonDup", "com.fasterxml.jackson.databind.introspect.AnnotatedWithParams,int,boolean", "<sample:6>", "6", "false"}}, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput189() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.impl.CreatorCollector", "com.fasterxml.jackson.databind.deser.impl.CreatorCollector", "addLongCreator", new String[]{"com.fasterxml.jackson.databind.introspect.AnnotatedWithParams", "boolean"}, new String[]{"<sample:8>", "true"}, false, 2, new String[][]{{"com.fasterxml.jackson.databind.deser.impl.CreatorCollector", "addDoubleCreator", "com.fasterxml.jackson.databind.introspect.AnnotatedWithParams,boolean", "<sample:18>", "true"}, {"com.fasterxml.jackson.databind.deser.impl.CreatorCollector", "verifyNonDup", "com.fasterxml.jackson.databind.introspect.AnnotatedWithParams,int,boolean", "<sample:0>", "3", "true"}}, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput190() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.impl.CreatorCollector", "com.fasterxml.jackson.databind.deser.impl.CreatorCollector", "verifyNonDup", new String[]{"com.fasterxml.jackson.databind.introspect.AnnotatedWithParams", "int"}, new String[]{"<sample:6>", "0"}, false, 2, new String[][]{}, 2);
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.databind.introspect.AnnotatedMethod", actual.getClass().getName());
  assertEquals("receiver state after the call", "{hasDefaultCreator=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput191() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.impl.CreatorCollector", "com.fasterxml.jackson.databind.deser.impl.CreatorCollector", "verifyNonDup", new String[]{"com.fasterxml.jackson.databind.introspect.AnnotatedWithParams", "int"}, new String[]{"<sample:11>", "0"}, false, 2, new String[][]{}, 2);
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.databind.introspect.AnnotatedMethod", actual.getClass().getName());
  assertEquals("[method java.util.Arrays#asList(1 params)] {getAnnotationCount=0, getFullName=java.util.Arrays#asList(1 params), getGenericParameterTypes=[T[]], getModifiers=137, getName=asList, getParameterCount=1, ...#284#1809028230", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{hasDefaultCreator=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput192() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.impl.CreatorCollector", "com.fasterxml.jackson.databind.deser.impl.CreatorCollector", "addLongCreator", new String[]{"com.fasterxml.jackson.databind.introspect.AnnotatedWithParams", "boolean"}, new String[]{"<sample:3>", "true"}, false, 1, new String[][]{{"com.fasterxml.jackson.databind.deser.impl.CreatorCollector", "setDefaultCreator", "com.fasterxml.jackson.databind.introspect.AnnotatedWithParams", "<sample:7>"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{hasDefaultCreator=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput193() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.impl.CreatorCollector", "com.fasterxml.jackson.databind.deser.impl.CreatorCollector", "addLongCreator", new String[]{"com.fasterxml.jackson.databind.introspect.AnnotatedWithParams", "boolean"}, new String[]{"<sample:0>", "false"}, false, 1, new String[][]{{"com.fasterxml.jackson.databind.deser.impl.CreatorCollector", "addPropertyCreator", "com.fasterxml.jackson.databind.introspect.AnnotatedWithParams,boolean,com.fasterxml.jackson.databind.deser.CreatorProperty[]", "<sample:8>", "false", "<sample:14>"}}, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput194() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.impl.CreatorCollector", "com.fasterxml.jackson.databind.deser.impl.CreatorCollector", "addDoubleCreator", new String[]{"com.fasterxml.jackson.databind.introspect.AnnotatedWithParams"}, new String[]{"<sample:0>"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.deser.impl.CreatorCollector", "addIntCreator", "com.fasterxml.jackson.databind.introspect.AnnotatedWithParams,boolean", "<sample:4>", "false"}, {"com.fasterxml.jackson.databind.deser.impl.CreatorCollector", "addStringCreator", "com.fasterxml.jackson.databind.introspect.AnnotatedWithParams", "<sample:8>"}}, 3);
  assertNull(actual);
  assertEquals("receiver state after the call", "{hasDefaultCreator=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput195() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.impl.CreatorCollector", "com.fasterxml.jackson.databind.deser.impl.CreatorCollector", "addIntCreator", new String[]{"com.fasterxml.jackson.databind.introspect.AnnotatedWithParams", "boolean"}, new String[]{"<null>", "false"}, false, 6, new String[][]{{"com.fasterxml.jackson.databind.deser.impl.CreatorCollector", "setDefaultCreator", "com.fasterxml.jackson.databind.introspect.AnnotatedWithParams", "<sample:12>"}, {"com.fasterxml.jackson.databind.deser.impl.CreatorCollector", "addStringCreator", "com.fasterxml.jackson.databind.introspect.AnnotatedWithParams,boolean", "<null>", "true"}, {"com.fasterxml.jackson.databind.deser.impl.CreatorCollector", "addDoubleCreator", "com.fasterxml.jackson.databind.introspect.AnnotatedWithParams,boolean", "<sample:8>", "false"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{hasDefaultCreator=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput196() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.impl.CreatorCollector", "com.fasterxml.jackson.databind.deser.impl.CreatorCollector", "addIntCreator", new String[]{"com.fasterxml.jackson.databind.introspect.AnnotatedWithParams", "boolean"}, new String[]{"<sample:1>", "false"}, false, 7, new String[][]{{"com.fasterxml.jackson.databind.deser.impl.CreatorCollector", "setDefaultCreator", "com.fasterxml.jackson.databind.introspect.AnnotatedWithParams", "<sample:2>"}, {"com.fasterxml.jackson.databind.deser.impl.CreatorCollector", "addStringCreator", "com.fasterxml.jackson.databind.introspect.AnnotatedWithParams,boolean", "<sample:9>", "false"}, {"com.fasterxml.jackson.databind.deser.impl.CreatorCollector", "addDoubleCreator", "com.fasterxml.jackson.databind.introspect.AnnotatedWithParams,boolean", "<sample:7>", "true"}}, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput197() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.impl.CreatorCollector", "com.fasterxml.jackson.databind.deser.impl.CreatorCollector", "addIntCreator", new String[]{"com.fasterxml.jackson.databind.introspect.AnnotatedWithParams", "boolean"}, new String[]{"<sample:1>", "false"}, false, 8, new String[][]{{"com.fasterxml.jackson.databind.deser.impl.CreatorCollector", "setDefaultCreator", "com.fasterxml.jackson.databind.introspect.AnnotatedWithParams", "<sample:2>"}, {"com.fasterxml.jackson.databind.deser.impl.CreatorCollector", "addStringCreator", "com.fasterxml.jackson.databind.introspect.AnnotatedWithParams,boolean", "<sample:9>", "false"}, {"com.fasterxml.jackson.databind.deser.impl.CreatorCollector", "addDoubleCreator", "com.fasterxml.jackson.databind.introspect.AnnotatedWithParams,boolean", "<sample:7>", "false"}}, 3);
  assertNull(actual);
  assertEquals("receiver state after the call", "{hasDefaultCreator=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput198() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.impl.CreatorCollector", "com.fasterxml.jackson.databind.deser.impl.CreatorCollector", "addPropertyCreator", new String[]{"com.fasterxml.jackson.databind.introspect.AnnotatedWithParams", "boolean", "com.fasterxml.jackson.databind.deser.CreatorProperty[]"}, new String[]{"<sample:2>", "true", "<sample:1>"}, false, 1, new String[][]{{"com.fasterxml.jackson.databind.deser.impl.CreatorCollector", "verifyNonDup", "com.fasterxml.jackson.databind.introspect.AnnotatedWithParams,int,boolean", "<sample:3>", "2", "true"}, {"com.fasterxml.jackson.databind.deser.impl.CreatorCollector", "addIncompeteParameter", "com.fasterxml.jackson.databind.introspect.AnnotatedParameter", "<sample:1>"}}, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput199() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.impl.CreatorCollector", "com.fasterxml.jackson.databind.deser.impl.CreatorCollector", "addDelegatingCreator", new String[]{"com.fasterxml.jackson.databind.introspect.AnnotatedWithParams", "boolean", "com.fasterxml.jackson.databind.deser.CreatorProperty[]"}, new String[]{"<sample:7>", "false", "<null>"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.deser.impl.CreatorCollector", "setDefaultCreator", "com.fasterxml.jackson.databind.introspect.AnnotatedWithParams", "<sample:11>"}}, 2);
  assertNull(actual);
  assertEquals("receiver state after the call", "{hasDefaultCreator=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput200() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.impl.CreatorCollector", "com.fasterxml.jackson.databind.deser.impl.CreatorCollector", "addIntCreator", new String[]{"com.fasterxml.jackson.databind.introspect.AnnotatedWithParams", "boolean"}, new String[]{"<sample:3>", "true"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.deser.impl.CreatorCollector", "hasDefaultCreator", ""}}, 1);
  assertNull(actual);
  assertEquals("receiver state after the call", "{hasDefaultCreator=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput201() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.impl.CreatorCollector", "com.fasterxml.jackson.databind.deser.impl.CreatorCollector", "addIntCreator", new String[]{"com.fasterxml.jackson.databind.introspect.AnnotatedWithParams", "boolean"}, new String[]{"<sample:13>", "true"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.deser.impl.CreatorCollector", "hasDefaultCreator", ""}, {"com.fasterxml.jackson.databind.deser.impl.CreatorCollector", "setDefaultCreator", "com.fasterxml.jackson.databind.introspect.AnnotatedWithParams", "<sample:5>"}}, 1);
  assertNull(actual);
  assertEquals("receiver state after the call", "{hasDefaultCreator=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput202() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.impl.CreatorCollector", "com.fasterxml.jackson.databind.deser.impl.CreatorCollector", "verifyNonDup", new String[]{"com.fasterxml.jackson.databind.introspect.AnnotatedWithParams", "int", "boolean"}, new String[]{"<sample:9>", "3", "true"}, false, 9, new String[][]{}, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput203() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.impl.CreatorCollector", "com.fasterxml.jackson.databind.deser.impl.CreatorCollector", "addDelegatingCreator", new String[]{"com.fasterxml.jackson.databind.introspect.AnnotatedWithParams", "com.fasterxml.jackson.databind.deser.CreatorProperty[]"}, new String[]{"<sample:6>", "<sample:8>"}, false, 1, new String[][]{}, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput204() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.impl.CreatorCollector", "com.fasterxml.jackson.databind.deser.impl.CreatorCollector", "addStringCreator", new String[]{"com.fasterxml.jackson.databind.introspect.AnnotatedWithParams", "boolean"}, new String[]{"<sample:10>", "false"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.deser.impl.CreatorCollector", "setDefaultCreator", "com.fasterxml.jackson.databind.introspect.AnnotatedWithParams", "<sample:3>"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{hasDefaultCreator=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput205() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.impl.CreatorCollector", "com.fasterxml.jackson.databind.deser.impl.CreatorCollector", "addStringCreator", new String[]{"com.fasterxml.jackson.databind.introspect.AnnotatedWithParams", "boolean"}, new String[]{"<sample:13>", "true"}, false, 2, new String[][]{{"com.fasterxml.jackson.databind.deser.impl.CreatorCollector", "setDefaultCreator", "com.fasterxml.jackson.databind.introspect.AnnotatedWithParams", "<sample:3>"}}, 3);
  assertNull(actual);
  assertEquals("receiver state after the call", "{hasDefaultCreator=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput206() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.impl.CreatorCollector", "com.fasterxml.jackson.databind.deser.impl.CreatorCollector", "addLongCreator", new String[]{"com.fasterxml.jackson.databind.introspect.AnnotatedWithParams"}, new String[]{"<sample:13>"}, false, 4, new String[][]{{"com.fasterxml.jackson.databind.deser.impl.CreatorCollector", "addIntCreator", "com.fasterxml.jackson.databind.introspect.AnnotatedWithParams,boolean", "<sample:8>", "false"}, {"com.fasterxml.jackson.databind.deser.impl.CreatorCollector", "addBooleanCreator", "com.fasterxml.jackson.databind.introspect.AnnotatedWithParams,boolean", "<sample:12>", "false"}}, 2);
  assertNull(actual);
  assertEquals("receiver state after the call", "{hasDefaultCreator=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput207() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.impl.CreatorCollector", "com.fasterxml.jackson.databind.deser.impl.CreatorCollector", "setDefaultCreator", new String[]{"com.fasterxml.jackson.databind.introspect.AnnotatedWithParams"}, new String[]{"<null>"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.deser.impl.CreatorCollector", "verifyNonDup", "com.fasterxml.jackson.databind.introspect.AnnotatedWithParams,int,boolean", "<sample:6>", "4", "false"}, {"com.fasterxml.jackson.databind.deser.impl.CreatorCollector", "addStringCreator", "com.fasterxml.jackson.databind.introspect.AnnotatedWithParams", "<sample:18>"}, {"com.fasterxml.jackson.databind.deser.impl.CreatorCollector", "constructValueInstantiator", "com.fasterxml.jackson.databind.DeserializationConfig", "<sample:7>"}}, 1);
  assertNull(actual);
  assertEquals("receiver state after the call", "{hasDefaultCreator=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput208() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.impl.CreatorCollector", "com.fasterxml.jackson.databind.deser.impl.CreatorCollector", "setDefaultCreator", new String[]{"com.fasterxml.jackson.databind.introspect.AnnotatedWithParams"}, new String[]{"<sample:5>"}, false, 7, new String[][]{{"com.fasterxml.jackson.databind.deser.impl.CreatorCollector", "verifyNonDup", "com.fasterxml.jackson.databind.introspect.AnnotatedWithParams,int,boolean", "<sample:6>", "4", "true"}, {"com.fasterxml.jackson.databind.deser.impl.CreatorCollector", "addStringCreator", "com.fasterxml.jackson.databind.introspect.AnnotatedWithParams", "<sample:18>"}, {"com.fasterxml.jackson.databind.deser.impl.CreatorCollector", "constructValueInstantiator", "com.fasterxml.jackson.databind.DeserializationConfig", "<sample:7>"}}, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput209() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.impl.CreatorCollector", "com.fasterxml.jackson.databind.deser.impl.CreatorCollector", "addBooleanCreator", new String[]{"com.fasterxml.jackson.databind.introspect.AnnotatedWithParams", "boolean"}, new String[]{"<sample:1>", "true"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.deser.impl.CreatorCollector", "setDefaultCreator", "com.fasterxml.jackson.databind.introspect.AnnotatedWithParams", "<sample:7>"}}, 2);
  assertNull(actual);
  assertEquals("receiver state after the call", "{hasDefaultCreator=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput210() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.impl.CreatorCollector", "com.fasterxml.jackson.databind.deser.impl.CreatorCollector", "addDoubleCreator", new String[]{"com.fasterxml.jackson.databind.introspect.AnnotatedWithParams"}, new String[]{"<sample:13>"}, false, 4, new String[][]{{"com.fasterxml.jackson.databind.deser.impl.CreatorCollector", "setDefaultCreator", "com.fasterxml.jackson.databind.introspect.AnnotatedWithParams", "<sample:9>"}, {"com.fasterxml.jackson.databind.deser.impl.CreatorCollector", "addLongCreator", "com.fasterxml.jackson.databind.introspect.AnnotatedWithParams", "<sample:0>"}}, 1);
  assertNull(actual);
  assertEquals("receiver state after the call", "{hasDefaultCreator=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput211() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.impl.CreatorCollector", "com.fasterxml.jackson.databind.deser.impl.CreatorCollector", "addStringCreator", new String[]{"com.fasterxml.jackson.databind.introspect.AnnotatedWithParams", "boolean"}, new String[]{"<sample:7>", "false"}, false, 12, new String[][]{}, 3);
  assertNull(actual);
  assertEquals("receiver state after the call", "{hasDefaultCreator=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput212() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.impl.CreatorCollector", "com.fasterxml.jackson.databind.deser.impl.CreatorCollector", "verifyNonDup", new String[]{"com.fasterxml.jackson.databind.introspect.AnnotatedWithParams", "int"}, new String[]{"<sample:9>", "7"}, false, 1, new String[][]{{"com.fasterxml.jackson.databind.deser.impl.CreatorCollector", "addLongCreator", "com.fasterxml.jackson.databind.introspect.AnnotatedWithParams", "<sample:3>"}}, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput213() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.impl.CreatorCollector", "com.fasterxml.jackson.databind.deser.impl.CreatorCollector", "addDoubleCreator", new String[]{"com.fasterxml.jackson.databind.introspect.AnnotatedWithParams"}, new String[]{"<sample:13>"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.deser.impl.CreatorCollector", "addStringCreator", "com.fasterxml.jackson.databind.introspect.AnnotatedWithParams,boolean", "<null>", "false"}, {"com.fasterxml.jackson.databind.deser.impl.CreatorCollector", "addBooleanCreator", "com.fasterxml.jackson.databind.introspect.AnnotatedWithParams,boolean", "<sample:6>", "false"}, {"com.fasterxml.jackson.databind.deser.impl.CreatorCollector", "constructValueInstantiator", "com.fasterxml.jackson.databind.DeserializationConfig", "<sample:4>"}}, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput214() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.impl.CreatorCollector", "com.fasterxml.jackson.databind.deser.impl.CreatorCollector", "addPropertyCreator", new String[]{"com.fasterxml.jackson.databind.introspect.AnnotatedWithParams", "boolean", "com.fasterxml.jackson.databind.deser.CreatorProperty[]"}, new String[]{"<sample:5>", "false", "<empty>"}, false, 2, new String[][]{{"com.fasterxml.jackson.databind.deser.impl.CreatorCollector", "setDefaultCreator", "com.fasterxml.jackson.databind.introspect.AnnotatedWithParams", "<sample:18>"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{hasDefaultCreator=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput215() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.impl.CreatorCollector", "com.fasterxml.jackson.databind.deser.impl.CreatorCollector", "verifyNonDup", new String[]{"com.fasterxml.jackson.databind.introspect.AnnotatedWithParams", "int"}, new String[]{"<sample:6>", "6"}, false, 0, null, 3);
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.databind.introspect.AnnotatedMethod", actual.getClass().getName());
  assertEquals("receiver state after the call", "{hasDefaultCreator=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput216() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.impl.CreatorCollector", "com.fasterxml.jackson.databind.deser.impl.CreatorCollector", "verifyNonDup", new String[]{"com.fasterxml.jackson.databind.introspect.AnnotatedWithParams", "int", "boolean"}, new String[]{"<sample:12>", "0", "true"}, false);
  assertNull(actual);
  assertEquals("receiver state after the call", "{hasDefaultCreator=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput217() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.impl.CreatorCollector", "com.fasterxml.jackson.databind.deser.impl.CreatorCollector", "constructValueInstantiator", new String[]{"com.fasterxml.jackson.databind.DeserializationConfig"}, new String[]{"<sample:5>"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.deser.impl.CreatorCollector", "addDelegatingCreator", "com.fasterxml.jackson.databind.introspect.AnnotatedWithParams,boolean,com.fasterxml.jackson.databind.deser.CreatorProperty[]", "<sample:18>", "true", "<sample:8>"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput218() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.impl.CreatorCollector", "com.fasterxml.jackson.databind.deser.impl.CreatorCollector", "setDefaultCreator", new String[]{"com.fasterxml.jackson.databind.introspect.AnnotatedWithParams"}, new String[]{"<sample:13>"}, false, 7, new String[][]{{"com.fasterxml.jackson.databind.deser.impl.CreatorCollector", "addDoubleCreator", "com.fasterxml.jackson.databind.introspect.AnnotatedWithParams", "<sample:13>"}, {"com.fasterxml.jackson.databind.deser.impl.CreatorCollector", "addIntCreator", "com.fasterxml.jackson.databind.introspect.AnnotatedWithParams,boolean", "<sample:7>", "true"}, {"com.fasterxml.jackson.databind.deser.impl.CreatorCollector", "addDelegatingCreator", "com.fasterxml.jackson.databind.introspect.AnnotatedWithParams,boolean,com.fasterxml.jackson.databind.deser.CreatorProperty[]", "<sample:8>", "true", "<sample:10>"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput219() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.impl.CreatorCollector", "com.fasterxml.jackson.databind.deser.impl.CreatorCollector", "addLongCreator", new String[]{"com.fasterxml.jackson.databind.introspect.AnnotatedWithParams"}, new String[]{"<sample:4>"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.deser.impl.CreatorCollector", "addPropertyCreator", "com.fasterxml.jackson.databind.introspect.AnnotatedWithParams,com.fasterxml.jackson.databind.deser.CreatorProperty[]", "<sample:12>", "<empty>"}, {"com.fasterxml.jackson.databind.deser.impl.CreatorCollector", "addIntCreator", "com.fasterxml.jackson.databind.introspect.AnnotatedWithParams", "<sample:4>"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput220() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.impl.CreatorCollector", "com.fasterxml.jackson.databind.deser.impl.CreatorCollector", "addBooleanCreator", new String[]{"com.fasterxml.jackson.databind.introspect.AnnotatedWithParams", "boolean"}, new String[]{"<sample:7>", "false"}, false, 4, new String[][]{{"com.fasterxml.jackson.databind.deser.impl.CreatorCollector", "addIntCreator", "com.fasterxml.jackson.databind.introspect.AnnotatedWithParams", "<sample:7>"}}, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput221() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.impl.CreatorCollector", "com.fasterxml.jackson.databind.deser.impl.CreatorCollector", "addBooleanCreator", new String[]{"com.fasterxml.jackson.databind.introspect.AnnotatedWithParams", "boolean"}, new String[]{"<sample:7>", "false"}, false, 4, new String[][]{{"com.fasterxml.jackson.databind.deser.impl.CreatorCollector", "addIntCreator", "com.fasterxml.jackson.databind.introspect.AnnotatedWithParams", "<sample:6>"}}, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput222() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.impl.CreatorCollector", "com.fasterxml.jackson.databind.deser.impl.CreatorCollector", "addStringCreator", new String[]{"com.fasterxml.jackson.databind.introspect.AnnotatedWithParams"}, new String[]{"<sample:6>"}, false, 7, new String[][]{{"com.fasterxml.jackson.databind.deser.impl.CreatorCollector", "constructValueInstantiator", "com.fasterxml.jackson.databind.DeserializationConfig", "<sample:5>"}, {"com.fasterxml.jackson.databind.deser.impl.CreatorCollector", "addPropertyCreator", "com.fasterxml.jackson.databind.introspect.AnnotatedWithParams,com.fasterxml.jackson.databind.deser.CreatorProperty[]", "<sample:7>", "<sample:8>"}, {"com.fasterxml.jackson.databind.deser.impl.CreatorCollector", "addStringCreator", "com.fasterxml.jackson.databind.introspect.AnnotatedWithParams", "<null>"}}, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput223() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.impl.CreatorCollector", "com.fasterxml.jackson.databind.deser.impl.CreatorCollector", "verifyNonDup", new String[]{"com.fasterxml.jackson.databind.introspect.AnnotatedWithParams", "int"}, new String[]{"<sample:11>", "4"}, false, 11, new String[][]{{"com.fasterxml.jackson.databind.deser.impl.CreatorCollector", "addLongCreator", "com.fasterxml.jackson.databind.introspect.AnnotatedWithParams,boolean", "<null>", "false"}, {"com.fasterxml.jackson.databind.deser.impl.CreatorCollector", "addPropertyCreator", "com.fasterxml.jackson.databind.introspect.AnnotatedWithParams,boolean,com.fasterxml.jackson.databind.deser.CreatorProperty[]", "<sample:1>", "false", "<null>"}, {"com.fasterxml.jackson.databind.deser.impl.CreatorCollector", "setDefaultCreator", "com.fasterxml.jackson.databind.introspect.AnnotatedWithParams", "<sample:6>"}}, 2), new String[][]{{"getRawReturnType", "", "7"}});
  assertNotNull(actual);
  assertEquals("java.lang.Class", actual.getClass().getName());
  assertEquals("interface java.util.List {getAnnotatedInterfaces=?, getAnnotations=[], getCanonicalName=java.util.List, getClasses=[], getConstructors=[], getDeclaredAnnotations=[], getDeclaredClasses=[], getDeclared...#548#-367284043", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{hasDefaultCreator=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput224() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.impl.CreatorCollector", "com.fasterxml.jackson.databind.deser.impl.CreatorCollector", "addStringCreator", new String[]{"com.fasterxml.jackson.databind.introspect.AnnotatedWithParams"}, new String[]{"<sample:3>"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.deser.impl.CreatorCollector", "addStringCreator", "com.fasterxml.jackson.databind.introspect.AnnotatedWithParams", "<sample:5>"}}, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput225() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.impl.CreatorCollector", "com.fasterxml.jackson.databind.deser.impl.CreatorCollector", "addStringCreator", new String[]{"com.fasterxml.jackson.databind.introspect.AnnotatedWithParams"}, new String[]{"<sample:15>"}, false, 1, new String[][]{{"com.fasterxml.jackson.databind.deser.impl.CreatorCollector", "addStringCreator", "com.fasterxml.jackson.databind.introspect.AnnotatedWithParams", "<sample:5>"}, {"com.fasterxml.jackson.databind.deser.impl.CreatorCollector", "addStringCreator", "com.fasterxml.jackson.databind.introspect.AnnotatedWithParams", "<sample:3>"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput226() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.impl.CreatorCollector", "com.fasterxml.jackson.databind.deser.impl.CreatorCollector", "addDoubleCreator", new String[]{"com.fasterxml.jackson.databind.introspect.AnnotatedWithParams"}, new String[]{"<sample:18>"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.deser.impl.CreatorCollector", "addLongCreator", "com.fasterxml.jackson.databind.introspect.AnnotatedWithParams", "<sample:18>"}}, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput227() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.impl.CreatorCollector", "com.fasterxml.jackson.databind.deser.impl.CreatorCollector", "verifyNonDup", new String[]{"com.fasterxml.jackson.databind.introspect.AnnotatedWithParams", "int"}, new String[]{"<sample:12>", "6"}, false, 5, new String[][]{{"com.fasterxml.jackson.databind.deser.impl.CreatorCollector", "addIncompeteParameter", "com.fasterxml.jackson.databind.introspect.AnnotatedParameter", "<sample:2>"}}, 3), new String[][]{{"withAnnotations", "com.fasterxml.jackson.databind.introspect.AnnotationMap", "5"}, {"isPublic", "", "7"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
  assertEquals("receiver state after the call", "{hasDefaultCreator=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput228() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.impl.CreatorCollector", "com.fasterxml.jackson.databind.deser.impl.CreatorCollector", "verifyNonDup", new String[]{"com.fasterxml.jackson.databind.introspect.AnnotatedWithParams", "int"}, new String[]{"<sample:14>", "6"}, false, 5, new String[][]{{"com.fasterxml.jackson.databind.deser.impl.CreatorCollector", "addIncompeteParameter", "com.fasterxml.jackson.databind.introspect.AnnotatedParameter", "<sample:2>"}}, 3), new String[][]{{"withAnnotations", "com.fasterxml.jackson.databind.introspect.AnnotationMap", "5"}, {"isPublic", "", "7"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{hasDefaultCreator=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput229() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.impl.CreatorCollector", "com.fasterxml.jackson.databind.deser.impl.CreatorCollector", "addDelegatingCreator", new String[]{"com.fasterxml.jackson.databind.introspect.AnnotatedWithParams", "boolean", "com.fasterxml.jackson.databind.deser.CreatorProperty[]"}, new String[]{"<sample:7>", "false", "<sample:0>"}, false, 5, new String[][]{{"com.fasterxml.jackson.databind.deser.impl.CreatorCollector", "addDelegatingCreator", "com.fasterxml.jackson.databind.introspect.AnnotatedWithParams,com.fasterxml.jackson.databind.deser.CreatorProperty[]", "<sample:7>", "<sample:7>"}, {"com.fasterxml.jackson.databind.deser.impl.CreatorCollector", "addLongCreator", "com.fasterxml.jackson.databind.introspect.AnnotatedWithParams,boolean", "<sample:12>", "false"}, {"com.fasterxml.jackson.databind.deser.impl.CreatorCollector", "constructValueInstantiator", "com.fasterxml.jackson.databind.DeserializationConfig", "<sample:6>"}}, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput230() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.impl.CreatorCollector", "com.fasterxml.jackson.databind.deser.impl.CreatorCollector", "addDelegatingCreator", new String[]{"com.fasterxml.jackson.databind.introspect.AnnotatedWithParams", "boolean", "com.fasterxml.jackson.databind.deser.CreatorProperty[]"}, new String[]{"<sample:2>", "false", "<sample:11>"}, false, 6, new String[][]{{"com.fasterxml.jackson.databind.deser.impl.CreatorCollector", "addDelegatingCreator", "com.fasterxml.jackson.databind.introspect.AnnotatedWithParams,com.fasterxml.jackson.databind.deser.CreatorProperty[]", "<sample:2>", "<sample:1>"}, {"com.fasterxml.jackson.databind.deser.impl.CreatorCollector", "constructValueInstantiator", "com.fasterxml.jackson.databind.DeserializationConfig", "<sample:2>"}, {"com.fasterxml.jackson.databind.deser.impl.CreatorCollector", "hasDefaultCreator", ""}}, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput231() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.impl.CreatorCollector", "com.fasterxml.jackson.databind.deser.impl.CreatorCollector", "addDelegatingCreator", new String[]{"com.fasterxml.jackson.databind.introspect.AnnotatedWithParams", "boolean", "com.fasterxml.jackson.databind.deser.CreatorProperty[]"}, new String[]{"<sample:2>", "false", "<sample:9>"}, false, 7, new String[][]{{"com.fasterxml.jackson.databind.deser.impl.CreatorCollector", "addDelegatingCreator", "com.fasterxml.jackson.databind.introspect.AnnotatedWithParams,com.fasterxml.jackson.databind.deser.CreatorProperty[]", "<sample:2>", "<sample:1>"}, {"com.fasterxml.jackson.databind.deser.impl.CreatorCollector", "constructValueInstantiator", "com.fasterxml.jackson.databind.DeserializationConfig", "<sample:6>"}, {"com.fasterxml.jackson.databind.deser.impl.CreatorCollector", "hasDefaultCreator", ""}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput232() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.impl.CreatorCollector", "com.fasterxml.jackson.databind.deser.impl.CreatorCollector", "verifyNonDup", new String[]{"com.fasterxml.jackson.databind.introspect.AnnotatedWithParams", "int"}, new String[]{"<sample:4>", "5"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.deser.impl.CreatorCollector", "addDelegatingCreator", "com.fasterxml.jackson.databind.introspect.AnnotatedWithParams,boolean,com.fasterxml.jackson.databind.deser.CreatorProperty[]", "<sample:6>", "false", "<empty>"}, {"com.fasterxml.jackson.databind.deser.impl.CreatorCollector", "addLongCreator", "com.fasterxml.jackson.databind.introspect.AnnotatedWithParams,boolean", "<sample:5>", "false"}}, 1);
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.databind.introspect.AnnotatedConstructor", actual.getClass().getName());
  assertEquals("[constructor for java.lang.String, annotations: [null]] {getAnnotationCount=0, getModifiers=1, getName=java.lang.String, getParameterCount=0, isPublic=true}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{hasDefaultCreator=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput233() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.impl.CreatorCollector", "com.fasterxml.jackson.databind.deser.impl.CreatorCollector", "verifyNonDup", new String[]{"com.fasterxml.jackson.databind.introspect.AnnotatedWithParams", "int"}, new String[]{"<sample:3>", "7"}, false, 15, new String[][]{}, 2), new String[][]{{"getName", "", "1"}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("format", String.valueOf(actual));
  assertEquals("receiver state after the call", "{hasDefaultCreator=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput234() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.impl.CreatorCollector", "com.fasterxml.jackson.databind.deser.impl.CreatorCollector", "addDoubleCreator", new String[]{"com.fasterxml.jackson.databind.introspect.AnnotatedWithParams"}, new String[]{"<sample:11>"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.deser.impl.CreatorCollector", "addIncompeteParameter", "com.fasterxml.jackson.databind.introspect.AnnotatedParameter", "<sample:0>"}, {"com.fasterxml.jackson.databind.deser.impl.CreatorCollector", "setDefaultCreator", "com.fasterxml.jackson.databind.introspect.AnnotatedWithParams", "<sample:0>"}, {"com.fasterxml.jackson.databind.deser.impl.CreatorCollector", "addStringCreator", "com.fasterxml.jackson.databind.introspect.AnnotatedWithParams,boolean", "<sample:7>", "true"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{hasDefaultCreator=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput235() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.impl.CreatorCollector", "com.fasterxml.jackson.databind.deser.impl.CreatorCollector", "addStringCreator", new String[]{"com.fasterxml.jackson.databind.introspect.AnnotatedWithParams", "boolean"}, new String[]{"<sample:8>", "true"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.deser.impl.CreatorCollector", "addStringCreator", "com.fasterxml.jackson.databind.introspect.AnnotatedWithParams,boolean", "<sample:7>", "true"}, {"com.fasterxml.jackson.databind.deser.impl.CreatorCollector", "constructValueInstantiator", "com.fasterxml.jackson.databind.DeserializationConfig", "<sample:7>"}}, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput236() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.impl.CreatorCollector", "com.fasterxml.jackson.databind.deser.impl.CreatorCollector", "addStringCreator", new String[]{"com.fasterxml.jackson.databind.introspect.AnnotatedWithParams", "boolean"}, new String[]{"<sample:18>", "false"}, false, 9, new String[][]{{"com.fasterxml.jackson.databind.deser.impl.CreatorCollector", "addLongCreator", "com.fasterxml.jackson.databind.introspect.AnnotatedWithParams,boolean", "<sample:10>", "false"}, {"com.fasterxml.jackson.databind.deser.impl.CreatorCollector", "addStringCreator", "com.fasterxml.jackson.databind.introspect.AnnotatedWithParams", "<sample:18>"}, {"com.fasterxml.jackson.databind.deser.impl.CreatorCollector", "addPropertyCreator", "com.fasterxml.jackson.databind.introspect.AnnotatedWithParams,com.fasterxml.jackson.databind.deser.CreatorProperty[]", "<sample:3>", "<sample:0>"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput237() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.impl.CreatorCollector", "com.fasterxml.jackson.databind.deser.impl.CreatorCollector", "addStringCreator", new String[]{"com.fasterxml.jackson.databind.introspect.AnnotatedWithParams", "boolean"}, new String[]{"<sample:20>", "true"}, false, 9, new String[][]{{"com.fasterxml.jackson.databind.deser.impl.CreatorCollector", "addLongCreator", "com.fasterxml.jackson.databind.introspect.AnnotatedWithParams,boolean", "<sample:10>", "false"}, {"com.fasterxml.jackson.databind.deser.impl.CreatorCollector", "addStringCreator", "com.fasterxml.jackson.databind.introspect.AnnotatedWithParams", "<sample:18>"}, {"com.fasterxml.jackson.databind.deser.impl.CreatorCollector", "addPropertyCreator", "com.fasterxml.jackson.databind.introspect.AnnotatedWithParams,com.fasterxml.jackson.databind.deser.CreatorProperty[]", "<sample:3>", "<sample:0>"}}, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput238() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.impl.CreatorCollector", "com.fasterxml.jackson.databind.deser.impl.CreatorCollector", "hasDefaultCreator", new String[]{}, new String[]{}, false, 6, new String[][]{{"com.fasterxml.jackson.databind.deser.impl.CreatorCollector", "setDefaultCreator", "com.fasterxml.jackson.databind.introspect.AnnotatedWithParams", "<sample:13>"}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
  assertEquals("receiver state after the call", "{hasDefaultCreator=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput239() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.impl.CreatorCollector", "com.fasterxml.jackson.databind.deser.impl.CreatorCollector", "addLongCreator", new String[]{"com.fasterxml.jackson.databind.introspect.AnnotatedWithParams", "boolean"}, new String[]{"<sample:12>", "false"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.deser.impl.CreatorCollector", "addIntCreator", "com.fasterxml.jackson.databind.introspect.AnnotatedWithParams,boolean", "<sample:11>", "false"}}, 2);
  assertNull(actual);
  assertEquals("receiver state after the call", "{hasDefaultCreator=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput240() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.impl.CreatorCollector", "com.fasterxml.jackson.databind.deser.impl.CreatorCollector", "addLongCreator", new String[]{"com.fasterxml.jackson.databind.introspect.AnnotatedWithParams"}, new String[]{"<sample:2>"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.deser.impl.CreatorCollector", "setDefaultCreator", "com.fasterxml.jackson.databind.introspect.AnnotatedWithParams", "<sample:5>"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{hasDefaultCreator=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput241() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.impl.CreatorCollector", "com.fasterxml.jackson.databind.deser.impl.CreatorCollector", "addLongCreator", new String[]{"com.fasterxml.jackson.databind.introspect.AnnotatedWithParams"}, new String[]{"<sample:12>"}, false, 15, new String[][]{{"com.fasterxml.jackson.databind.deser.impl.CreatorCollector", "setDefaultCreator", "com.fasterxml.jackson.databind.introspect.AnnotatedWithParams", "<sample:12>"}}, 2);
  assertNull(actual);
  assertEquals("receiver state after the call", "{hasDefaultCreator=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput242() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.impl.CreatorCollector", "com.fasterxml.jackson.databind.deser.impl.CreatorCollector", "addStringCreator", new String[]{"com.fasterxml.jackson.databind.introspect.AnnotatedWithParams"}, new String[]{"<sample:12>"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.deser.impl.CreatorCollector", "addIntCreator", "com.fasterxml.jackson.databind.introspect.AnnotatedWithParams", "<sample:6>"}, {"com.fasterxml.jackson.databind.deser.impl.CreatorCollector", "setDefaultCreator", "com.fasterxml.jackson.databind.introspect.AnnotatedWithParams", "<sample:11>"}, {"com.fasterxml.jackson.databind.deser.impl.CreatorCollector", "addBooleanCreator", "com.fasterxml.jackson.databind.introspect.AnnotatedWithParams,boolean", "<sample:9>", "false"}}, 1);
  assertNull(actual);
  assertEquals("receiver state after the call", "{hasDefaultCreator=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput243() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.impl.CreatorCollector", "com.fasterxml.jackson.databind.deser.impl.CreatorCollector", "addIntCreator", new String[]{"com.fasterxml.jackson.databind.introspect.AnnotatedWithParams"}, new String[]{"<sample:3>"}, false, 1, new String[][]{{"com.fasterxml.jackson.databind.deser.impl.CreatorCollector", "verifyNonDup", "com.fasterxml.jackson.databind.introspect.AnnotatedWithParams,int", "<null>", "0"}, {"com.fasterxml.jackson.databind.deser.impl.CreatorCollector", "addBooleanCreator", "com.fasterxml.jackson.databind.introspect.AnnotatedWithParams,boolean", "<sample:3>", "false"}, {"com.fasterxml.jackson.databind.deser.impl.CreatorCollector", "verifyNonDup", "com.fasterxml.jackson.databind.introspect.AnnotatedWithParams,int,boolean", "<sample:11>", "8", "true"}}, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput244() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.impl.CreatorCollector", "com.fasterxml.jackson.databind.deser.impl.CreatorCollector", "verifyNonDup", new String[]{"com.fasterxml.jackson.databind.introspect.AnnotatedWithParams", "int", "boolean"}, new String[]{"<sample:0>", "5", "true"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.deser.impl.CreatorCollector", "addDelegatingCreator", "com.fasterxml.jackson.databind.introspect.AnnotatedWithParams,boolean,com.fasterxml.jackson.databind.deser.CreatorProperty[]", "<sample:9>", "true", "<sample:3>"}}, 1);
  assertNull(actual);
  assertEquals("receiver state after the call", "{hasDefaultCreator=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput245() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.impl.CreatorCollector", "com.fasterxml.jackson.databind.deser.impl.CreatorCollector", "verifyNonDup", new String[]{"com.fasterxml.jackson.databind.introspect.AnnotatedWithParams", "int", "boolean"}, new String[]{"<sample:0>", "5", "true"}, false, 13, new String[][]{{"com.fasterxml.jackson.databind.deser.impl.CreatorCollector", "addDelegatingCreator", "com.fasterxml.jackson.databind.introspect.AnnotatedWithParams,boolean,com.fasterxml.jackson.databind.deser.CreatorProperty[]", "<sample:9>", "true", "<sample:3>"}}, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput246() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.impl.CreatorCollector", "com.fasterxml.jackson.databind.deser.impl.CreatorCollector", "addStringCreator", new String[]{"com.fasterxml.jackson.databind.introspect.AnnotatedWithParams", "boolean"}, new String[]{"<sample:1>", "true"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.deser.impl.CreatorCollector", "addDoubleCreator", "com.fasterxml.jackson.databind.introspect.AnnotatedWithParams", "<sample:1>"}}, 2);
  assertNull(actual);
  assertEquals("receiver state after the call", "{hasDefaultCreator=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput247() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.impl.CreatorCollector", "com.fasterxml.jackson.databind.deser.impl.CreatorCollector", "addStringCreator", new String[]{"com.fasterxml.jackson.databind.introspect.AnnotatedWithParams"}, new String[]{"<sample:3>"}, false, 8, new String[][]{{"com.fasterxml.jackson.databind.deser.impl.CreatorCollector", "addDelegatingCreator", "com.fasterxml.jackson.databind.introspect.AnnotatedWithParams,boolean,com.fasterxml.jackson.databind.deser.CreatorProperty[]", "<null>", "false", "<sample:11>"}, {"com.fasterxml.jackson.databind.deser.impl.CreatorCollector", "setDefaultCreator", "com.fasterxml.jackson.databind.introspect.AnnotatedWithParams", "<sample:5>"}, {"com.fasterxml.jackson.databind.deser.impl.CreatorCollector", "hasDefaultCreator", ""}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{hasDefaultCreator=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput248() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.impl.CreatorCollector", "com.fasterxml.jackson.databind.deser.impl.CreatorCollector", "addBooleanCreator", new String[]{"com.fasterxml.jackson.databind.introspect.AnnotatedWithParams", "boolean"}, new String[]{"<sample:9>", "true"}, false, 1, new String[][]{}, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput249() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.impl.CreatorCollector", "com.fasterxml.jackson.databind.deser.impl.CreatorCollector", "addDoubleCreator", new String[]{"com.fasterxml.jackson.databind.introspect.AnnotatedWithParams", "boolean"}, new String[]{"<sample:2>", "true"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.deser.impl.CreatorCollector", "setDefaultCreator", "com.fasterxml.jackson.databind.introspect.AnnotatedWithParams", "<sample:13>"}, {"com.fasterxml.jackson.databind.deser.impl.CreatorCollector", "addPropertyCreator", "com.fasterxml.jackson.databind.introspect.AnnotatedWithParams,com.fasterxml.jackson.databind.deser.CreatorProperty[]", "<sample:18>", "<sample:2>"}}, 2);
  assertNull(actual);
  assertEquals("receiver state after the call", "{hasDefaultCreator=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput250() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.impl.CreatorCollector", "com.fasterxml.jackson.databind.deser.impl.CreatorCollector", "addDelegatingCreator", new String[]{"com.fasterxml.jackson.databind.introspect.AnnotatedWithParams", "com.fasterxml.jackson.databind.deser.CreatorProperty[]"}, new String[]{"<sample:7>", "<sample:8>"}, false, 12, new String[][]{{"com.fasterxml.jackson.databind.deser.impl.CreatorCollector", "addBooleanCreator", "com.fasterxml.jackson.databind.introspect.AnnotatedWithParams", "<sample:13>"}, {"com.fasterxml.jackson.databind.deser.impl.CreatorCollector", "setDefaultCreator", "com.fasterxml.jackson.databind.introspect.AnnotatedWithParams", "<sample:12>"}, {"com.fasterxml.jackson.databind.deser.impl.CreatorCollector", "addIntCreator", "com.fasterxml.jackson.databind.introspect.AnnotatedWithParams,boolean", "<sample:6>", "false"}}, 2);
  assertNull(actual);
  assertEquals("receiver state after the call", "{hasDefaultCreator=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput251() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.impl.CreatorCollector", "com.fasterxml.jackson.databind.deser.impl.CreatorCollector", "addBooleanCreator", new String[]{"com.fasterxml.jackson.databind.introspect.AnnotatedWithParams", "boolean"}, new String[]{"<sample:12>", "false"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.deser.impl.CreatorCollector", "addDoubleCreator", "com.fasterxml.jackson.databind.introspect.AnnotatedWithParams", "<sample:12>"}, {"com.fasterxml.jackson.databind.deser.impl.CreatorCollector", "addDoubleCreator", "com.fasterxml.jackson.databind.introspect.AnnotatedWithParams", "<sample:12>"}, {"com.fasterxml.jackson.databind.deser.impl.CreatorCollector", "addDoubleCreator", "com.fasterxml.jackson.databind.introspect.AnnotatedWithParams,boolean", "<sample:7>", "true"}}, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput252() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.impl.CreatorCollector", "com.fasterxml.jackson.databind.deser.impl.CreatorCollector", "verifyNonDup", new String[]{"com.fasterxml.jackson.databind.introspect.AnnotatedWithParams", "int"}, new String[]{"<sample:12>", "7"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.deser.impl.CreatorCollector", "addBooleanCreator", "com.fasterxml.jackson.databind.introspect.AnnotatedWithParams", "<sample:6>"}, {"com.fasterxml.jackson.databind.deser.impl.CreatorCollector", "addPropertyCreator", "com.fasterxml.jackson.databind.introspect.AnnotatedWithParams,com.fasterxml.jackson.databind.deser.CreatorProperty[]", "<sample:8>", "<sample:0>"}}, 3), new String[][]{{"getParameter", "int", "6"}});
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.databind.introspect.AnnotatedParameter", actual.getClass().getName());
  assertEquals("[parameter #3, annotations: null] {getIndex=3, getModifiers=1, getName=, isPublic=true}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{hasDefaultCreator=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput253() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.impl.CreatorCollector", "com.fasterxml.jackson.databind.deser.impl.CreatorCollector", "verifyNonDup", new String[]{"com.fasterxml.jackson.databind.introspect.AnnotatedWithParams", "int"}, new String[]{"<sample:11>", "7"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.deser.impl.CreatorCollector", "addBooleanCreator", "com.fasterxml.jackson.databind.introspect.AnnotatedWithParams", "<sample:6>"}, {"com.fasterxml.jackson.databind.deser.impl.CreatorCollector", "addPropertyCreator", "com.fasterxml.jackson.databind.introspect.AnnotatedWithParams,com.fasterxml.jackson.databind.deser.CreatorProperty[]", "<sample:8>", "<sample:0>"}}, 3), new String[][]{{"getContextClass", "", "6"}});
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.databind.introspect.AnnotatedClass", actual.getClass().getName());
  assertEquals("[AnnotedClass java.lang.String] {getFieldCount=3, getMemberMethodCount=62, getModifiers=17, getName=java.lang.String, hasAnnotations=false, isPublic=true}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{hasDefaultCreator=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput254() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.impl.CreatorCollector", "com.fasterxml.jackson.databind.deser.impl.CreatorCollector", "addDoubleCreator", new String[]{"com.fasterxml.jackson.databind.introspect.AnnotatedWithParams"}, new String[]{"<sample:16>"}, false, 9, new String[][]{{"com.fasterxml.jackson.databind.deser.impl.CreatorCollector", "addLongCreator", "com.fasterxml.jackson.databind.introspect.AnnotatedWithParams", "<sample:12>"}, {"com.fasterxml.jackson.databind.deser.impl.CreatorCollector", "addPropertyCreator", "com.fasterxml.jackson.databind.introspect.AnnotatedWithParams,com.fasterxml.jackson.databind.deser.CreatorProperty[]", "<sample:7>", "<sample:1>"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput255() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.impl.CreatorCollector", "com.fasterxml.jackson.databind.deser.impl.CreatorCollector", "addDoubleCreator", new String[]{"com.fasterxml.jackson.databind.introspect.AnnotatedWithParams"}, new String[]{"<null>"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.deser.impl.CreatorCollector", "addBooleanCreator", "com.fasterxml.jackson.databind.introspect.AnnotatedWithParams", "<sample:8>"}, {"com.fasterxml.jackson.databind.deser.impl.CreatorCollector", "setDefaultCreator", "com.fasterxml.jackson.databind.introspect.AnnotatedWithParams", "<sample:18>"}}, 3);
  assertNull(actual);
  assertEquals("receiver state after the call", "{hasDefaultCreator=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput256() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.impl.CreatorCollector", "com.fasterxml.jackson.databind.deser.impl.CreatorCollector", "addBooleanCreator", new String[]{"com.fasterxml.jackson.databind.introspect.AnnotatedWithParams", "boolean"}, new String[]{"<sample:4>", "false"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.deser.impl.CreatorCollector", "addLongCreator", "com.fasterxml.jackson.databind.introspect.AnnotatedWithParams", "<sample:4>"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput257() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.impl.CreatorCollector", "com.fasterxml.jackson.databind.deser.impl.CreatorCollector", "addDoubleCreator", new String[]{"com.fasterxml.jackson.databind.introspect.AnnotatedWithParams"}, new String[]{"<sample:2>"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.deser.impl.CreatorCollector", "constructValueInstantiator", "com.fasterxml.jackson.databind.DeserializationConfig", "<sample:1>"}, {"com.fasterxml.jackson.databind.deser.impl.CreatorCollector", "addBooleanCreator", "com.fasterxml.jackson.databind.introspect.AnnotatedWithParams,boolean", "<sample:2>", "false"}, {"com.fasterxml.jackson.databind.deser.impl.CreatorCollector", "addStringCreator", "com.fasterxml.jackson.databind.introspect.AnnotatedWithParams", "<sample:2>"}}, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput258() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.impl.CreatorCollector", "com.fasterxml.jackson.databind.deser.impl.CreatorCollector", "addLongCreator", new String[]{"com.fasterxml.jackson.databind.introspect.AnnotatedWithParams", "boolean"}, new String[]{"<sample:18>", "false"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.deser.impl.CreatorCollector", "verifyNonDup", "com.fasterxml.jackson.databind.introspect.AnnotatedWithParams,int,boolean", "<sample:0>", "0", "true"}}, 1);
  assertNull(actual);
  assertEquals("receiver state after the call", "{hasDefaultCreator=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput259() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.impl.CreatorCollector", "com.fasterxml.jackson.databind.deser.impl.CreatorCollector", "addBooleanCreator", new String[]{"com.fasterxml.jackson.databind.introspect.AnnotatedWithParams", "boolean"}, new String[]{"<sample:6>", "true"}, false, 1, new String[][]{{"com.fasterxml.jackson.databind.deser.impl.CreatorCollector", "constructValueInstantiator", "com.fasterxml.jackson.databind.DeserializationConfig", "<sample:10>"}}, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput260() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.impl.CreatorCollector", "com.fasterxml.jackson.databind.deser.impl.CreatorCollector", "addLongCreator", new String[]{"com.fasterxml.jackson.databind.introspect.AnnotatedWithParams"}, new String[]{"<sample:4>"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.deser.impl.CreatorCollector", "addIntCreator", "com.fasterxml.jackson.databind.introspect.AnnotatedWithParams", "<sample:4>"}, {"com.fasterxml.jackson.databind.deser.impl.CreatorCollector", "addLongCreator", "com.fasterxml.jackson.databind.introspect.AnnotatedWithParams", "<sample:4>"}}, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput261() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.impl.CreatorCollector", "com.fasterxml.jackson.databind.deser.impl.CreatorCollector", "addLongCreator", new String[]{"com.fasterxml.jackson.databind.introspect.AnnotatedWithParams"}, new String[]{"<sample:9>"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.deser.impl.CreatorCollector", "setDefaultCreator", "com.fasterxml.jackson.databind.introspect.AnnotatedWithParams", "<sample:9>"}}, 1);
  assertNull(actual);
  assertEquals("receiver state after the call", "{hasDefaultCreator=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput262() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.impl.CreatorCollector", "com.fasterxml.jackson.databind.deser.impl.CreatorCollector", "addLongCreator", new String[]{"com.fasterxml.jackson.databind.introspect.AnnotatedWithParams", "boolean"}, new String[]{"<sample:12>", "true"}, false, 4, new String[][]{{"com.fasterxml.jackson.databind.deser.impl.CreatorCollector", "hasDefaultCreator", ""}, {"com.fasterxml.jackson.databind.deser.impl.CreatorCollector", "addLongCreator", "com.fasterxml.jackson.databind.introspect.AnnotatedWithParams,boolean", "<sample:12>", "true"}, {"com.fasterxml.jackson.databind.deser.impl.CreatorCollector", "verifyNonDup", "com.fasterxml.jackson.databind.introspect.AnnotatedWithParams,int,boolean", "<sample:1>", "26", "false"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput263() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.impl.CreatorCollector", "com.fasterxml.jackson.databind.deser.impl.CreatorCollector", "addLongCreator", new String[]{"com.fasterxml.jackson.databind.introspect.AnnotatedWithParams"}, new String[]{"<sample:7>"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.deser.impl.CreatorCollector", "addPropertyCreator", "com.fasterxml.jackson.databind.introspect.AnnotatedWithParams,com.fasterxml.jackson.databind.deser.CreatorProperty[]", "<sample:17>", "<sample:11>"}, {"com.fasterxml.jackson.databind.deser.impl.CreatorCollector", "addIntCreator", "com.fasterxml.jackson.databind.introspect.AnnotatedWithParams", "<sample:7>"}, {"com.fasterxml.jackson.databind.deser.impl.CreatorCollector", "addIntCreator", "com.fasterxml.jackson.databind.introspect.AnnotatedWithParams", "<sample:1>"}}, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput264() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.impl.CreatorCollector", "com.fasterxml.jackson.databind.deser.impl.CreatorCollector", "addLongCreator", new String[]{"com.fasterxml.jackson.databind.introspect.AnnotatedWithParams"}, new String[]{"<sample:13>"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.deser.impl.CreatorCollector", "addIntCreator", "com.fasterxml.jackson.databind.introspect.AnnotatedWithParams,boolean", "<sample:11>", "false"}, {"com.fasterxml.jackson.databind.deser.impl.CreatorCollector", "addPropertyCreator", "com.fasterxml.jackson.databind.introspect.AnnotatedWithParams,com.fasterxml.jackson.databind.deser.CreatorProperty[]", "<sample:0>", "<sample:11>"}, {"com.fasterxml.jackson.databind.deser.impl.CreatorCollector", "addIntCreator", "com.fasterxml.jackson.databind.introspect.AnnotatedWithParams", "<sample:11>"}}, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput265() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.impl.CreatorCollector", "com.fasterxml.jackson.databind.deser.impl.CreatorCollector", "verifyNonDup", new String[]{"com.fasterxml.jackson.databind.introspect.AnnotatedWithParams", "int"}, new String[]{"<sample:9>", "5"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.deser.impl.CreatorCollector", "addLongCreator", "com.fasterxml.jackson.databind.introspect.AnnotatedWithParams,boolean", "<sample:6>", "true"}, {"com.fasterxml.jackson.databind.deser.impl.CreatorCollector", "hasDefaultCreator", ""}}, 1);
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.databind.introspect.AnnotatedMethod", actual.getClass().getName());
  assertEquals("receiver state after the call", "{hasDefaultCreator=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput266() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.impl.CreatorCollector", "com.fasterxml.jackson.databind.deser.impl.CreatorCollector", "addLongCreator", new String[]{"com.fasterxml.jackson.databind.introspect.AnnotatedWithParams", "boolean"}, new String[]{"<sample:13>", "true"}, false, 1, new String[][]{{"com.fasterxml.jackson.databind.deser.impl.CreatorCollector", "addDelegatingCreator", "com.fasterxml.jackson.databind.introspect.AnnotatedWithParams,boolean,com.fasterxml.jackson.databind.deser.CreatorProperty[]", "<sample:12>", "false", "<null>"}}, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput267() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.impl.CreatorCollector", "com.fasterxml.jackson.databind.deser.impl.CreatorCollector", "addIntCreator", new String[]{"com.fasterxml.jackson.databind.introspect.AnnotatedWithParams", "boolean"}, new String[]{"<sample:3>", "true"}, false, 2, new String[][]{{"com.fasterxml.jackson.databind.deser.impl.CreatorCollector", "addIntCreator", "com.fasterxml.jackson.databind.introspect.AnnotatedWithParams,boolean", "<sample:13>", "true"}, {"com.fasterxml.jackson.databind.deser.impl.CreatorCollector", "verifyNonDup", "com.fasterxml.jackson.databind.introspect.AnnotatedWithParams,int", "<sample:13>", "1"}}, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput268() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.impl.CreatorCollector", "com.fasterxml.jackson.databind.deser.impl.CreatorCollector", "addDoubleCreator", new String[]{"com.fasterxml.jackson.databind.introspect.AnnotatedWithParams", "boolean"}, new String[]{"<sample:12>", "false"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.deser.impl.CreatorCollector", "addDoubleCreator", "com.fasterxml.jackson.databind.introspect.AnnotatedWithParams,boolean", "<sample:12>", "false"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput269() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.impl.CreatorCollector", "com.fasterxml.jackson.databind.deser.impl.CreatorCollector", "addDoubleCreator", new String[]{"com.fasterxml.jackson.databind.introspect.AnnotatedWithParams"}, new String[]{"<sample:2>"}, false, 9, new String[][]{{"com.fasterxml.jackson.databind.deser.impl.CreatorCollector", "setDefaultCreator", "com.fasterxml.jackson.databind.introspect.AnnotatedWithParams", "<sample:4>"}}, 2);
  assertNull(actual);
  assertEquals("receiver state after the call", "{hasDefaultCreator=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput270() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.impl.CreatorCollector", "com.fasterxml.jackson.databind.deser.impl.CreatorCollector", "addStringCreator", new String[]{"com.fasterxml.jackson.databind.introspect.AnnotatedWithParams", "boolean"}, new String[]{"<sample:5>", "true"}, false, 11, new String[][]{{"com.fasterxml.jackson.databind.deser.impl.CreatorCollector", "addStringCreator", "com.fasterxml.jackson.databind.introspect.AnnotatedWithParams,boolean", "<null>", "true"}, {"com.fasterxml.jackson.databind.deser.impl.CreatorCollector", "addIntCreator", "com.fasterxml.jackson.databind.introspect.AnnotatedWithParams,boolean", "<sample:12>", "true"}, {"com.fasterxml.jackson.databind.deser.impl.CreatorCollector", "addDoubleCreator", "com.fasterxml.jackson.databind.introspect.AnnotatedWithParams,boolean", "<sample:3>", "true"}}, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput271() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.impl.CreatorCollector", "com.fasterxml.jackson.databind.deser.impl.CreatorCollector", "addLongCreator", new String[]{"com.fasterxml.jackson.databind.introspect.AnnotatedWithParams"}, new String[]{"<sample:22>"}, false, 9, new String[][]{{"com.fasterxml.jackson.databind.deser.impl.CreatorCollector", "setDefaultCreator", "com.fasterxml.jackson.databind.introspect.AnnotatedWithParams", "<sample:11>"}}, 3);
  assertNull(actual);
  assertEquals("receiver state after the call", "{hasDefaultCreator=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput272() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.impl.CreatorCollector", "com.fasterxml.jackson.databind.deser.impl.CreatorCollector", "addPropertyCreator", new String[]{"com.fasterxml.jackson.databind.introspect.AnnotatedWithParams", "boolean", "com.fasterxml.jackson.databind.deser.CreatorProperty[]"}, new String[]{"<sample:12>", "false", "<sample:11>"}, false, 16, new String[][]{{"com.fasterxml.jackson.databind.deser.impl.CreatorCollector", "addBooleanCreator", "com.fasterxml.jackson.databind.introspect.AnnotatedWithParams,boolean", "<sample:13>", "true"}, {"com.fasterxml.jackson.databind.deser.impl.CreatorCollector", "addBooleanCreator", "com.fasterxml.jackson.databind.introspect.AnnotatedWithParams", "<sample:4>"}, {"com.fasterxml.jackson.databind.deser.impl.CreatorCollector", "setDefaultCreator", "com.fasterxml.jackson.databind.introspect.AnnotatedWithParams", "<sample:1>"}}, 1);
  assertNull(actual);
  assertEquals("receiver state after the call", "{hasDefaultCreator=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput273() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.impl.CreatorCollector", "com.fasterxml.jackson.databind.deser.impl.CreatorCollector", "verifyNonDup", new String[]{"com.fasterxml.jackson.databind.introspect.AnnotatedWithParams", "int"}, new String[]{"<sample:15>", "1"}, false, 0, null, 1);
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.databind.introspect.AnnotatedMethod", actual.getClass().getName());
  assertEquals("[method java.lang.String#format(2 params)] {getAnnotationCount=0, getFullName=java.lang.String#format(2 params), getGenericParameterTypes=[class java.lang.String, class [Ljava.lang.Object;], getModifi...#354#2039936895", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{hasDefaultCreator=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput274() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.impl.CreatorCollector", "com.fasterxml.jackson.databind.deser.impl.CreatorCollector", "verifyNonDup", new String[]{"com.fasterxml.jackson.databind.introspect.AnnotatedWithParams", "int"}, new String[]{"<sample:15>", "0"}, false, 0, null, 1);
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.databind.introspect.AnnotatedMethod", actual.getClass().getName());
  assertEquals("[method java.lang.String#format(2 params)] {getAnnotationCount=0, getFullName=java.lang.String#format(2 params), getGenericParameterTypes=[class java.lang.String, class [Ljava.lang.Object;], getModifi...#354#2039936895", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{hasDefaultCreator=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput275() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.impl.CreatorCollector", "com.fasterxml.jackson.databind.deser.impl.CreatorCollector", "addIntCreator", new String[]{"com.fasterxml.jackson.databind.introspect.AnnotatedWithParams"}, new String[]{"<sample:4>"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.deser.impl.CreatorCollector", "addIntCreator", "com.fasterxml.jackson.databind.introspect.AnnotatedWithParams", "<sample:4>"}}, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput276() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.impl.CreatorCollector", "com.fasterxml.jackson.databind.deser.impl.CreatorCollector", "addBooleanCreator", new String[]{"com.fasterxml.jackson.databind.introspect.AnnotatedWithParams"}, new String[]{"<null>"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.deser.impl.CreatorCollector", "setDefaultCreator", "com.fasterxml.jackson.databind.introspect.AnnotatedWithParams", "<sample:5>"}, {"com.fasterxml.jackson.databind.deser.impl.CreatorCollector", "addDelegatingCreator", "com.fasterxml.jackson.databind.introspect.AnnotatedWithParams,boolean,com.fasterxml.jackson.databind.deser.CreatorProperty[]", "<sample:18>", "false", "<sample:11>"}, {"com.fasterxml.jackson.databind.deser.impl.CreatorCollector", "addBooleanCreator", "com.fasterxml.jackson.databind.introspect.AnnotatedWithParams,boolean", "<sample:9>", "true"}}, 2);
  assertNull(actual);
  assertEquals("receiver state after the call", "{hasDefaultCreator=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput277() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.impl.CreatorCollector", "com.fasterxml.jackson.databind.deser.impl.CreatorCollector", "verifyNonDup", new String[]{"com.fasterxml.jackson.databind.introspect.AnnotatedWithParams", "int", "boolean"}, new String[]{"<sample:6>", "6", "true"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.deser.impl.CreatorCollector", "addDelegatingCreator", "com.fasterxml.jackson.databind.introspect.AnnotatedWithParams,com.fasterxml.jackson.databind.deser.CreatorProperty[]", "<sample:18>", "<empty>"}, {"com.fasterxml.jackson.databind.deser.impl.CreatorCollector", "setDefaultCreator", "com.fasterxml.jackson.databind.introspect.AnnotatedWithParams", "<sample:4>"}}, 2);
  assertNull(actual);
  assertEquals("receiver state after the call", "{hasDefaultCreator=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput278() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.impl.CreatorCollector", "com.fasterxml.jackson.databind.deser.impl.CreatorCollector", "verifyNonDup", new String[]{"com.fasterxml.jackson.databind.introspect.AnnotatedWithParams", "int", "boolean"}, new String[]{"<sample:18>", "4", "false"}, false, 8, new String[][]{{"com.fasterxml.jackson.databind.deser.impl.CreatorCollector", "addIncompeteParameter", "com.fasterxml.jackson.databind.introspect.AnnotatedParameter", "<sample:6>"}, {"com.fasterxml.jackson.databind.deser.impl.CreatorCollector", "verifyNonDup", "com.fasterxml.jackson.databind.introspect.AnnotatedWithParams,int", "<sample:2>", "-1073741824"}, {"com.fasterxml.jackson.databind.deser.impl.CreatorCollector", "addDoubleCreator", "com.fasterxml.jackson.databind.introspect.AnnotatedWithParams,boolean", "<sample:18>", "false"}}, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput279() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.impl.CreatorCollector", "com.fasterxml.jackson.databind.deser.impl.CreatorCollector", "verifyNonDup", new String[]{"com.fasterxml.jackson.databind.introspect.AnnotatedWithParams", "int", "boolean"}, new String[]{"<sample:18>", "4", "false"}, false, 8, new String[][]{{"com.fasterxml.jackson.databind.deser.impl.CreatorCollector", "verifyNonDup", "com.fasterxml.jackson.databind.introspect.AnnotatedWithParams,int,boolean", "<sample:9>", "10", "false"}, {"com.fasterxml.jackson.databind.deser.impl.CreatorCollector", "addDoubleCreator", "com.fasterxml.jackson.databind.introspect.AnnotatedWithParams,boolean", "<sample:18>", "false"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput280() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.impl.CreatorCollector", "com.fasterxml.jackson.databind.deser.impl.CreatorCollector", "hasDefaultCreator", new String[]{}, new String[]{}, false, 14, new String[][]{{"com.fasterxml.jackson.databind.deser.impl.CreatorCollector", "setDefaultCreator", "com.fasterxml.jackson.databind.introspect.AnnotatedWithParams", "<sample:0>"}, {"com.fasterxml.jackson.databind.deser.impl.CreatorCollector", "constructValueInstantiator", "com.fasterxml.jackson.databind.DeserializationConfig", "<sample:4>"}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
  assertEquals("receiver state after the call", "{hasDefaultCreator=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput281() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.impl.CreatorCollector", "com.fasterxml.jackson.databind.deser.impl.CreatorCollector", "addIncompeteParameter", new String[]{"com.fasterxml.jackson.databind.introspect.AnnotatedParameter"}, new String[]{"<sample:0>"}, false, 2, new String[][]{{"com.fasterxml.jackson.databind.deser.impl.CreatorCollector", "setDefaultCreator", "com.fasterxml.jackson.databind.introspect.AnnotatedWithParams", "<sample:9>"}, {"com.fasterxml.jackson.databind.deser.impl.CreatorCollector", "addBooleanCreator", "com.fasterxml.jackson.databind.introspect.AnnotatedWithParams,boolean", "<sample:11>", "true"}}, 3);
  assertNull(actual);
  assertEquals("receiver state after the call", "{hasDefaultCreator=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput282() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.impl.CreatorCollector", "com.fasterxml.jackson.databind.deser.impl.CreatorCollector", "addDoubleCreator", new String[]{"com.fasterxml.jackson.databind.introspect.AnnotatedWithParams"}, new String[]{"<sample:4>"}, false, 10, new String[][]{{"com.fasterxml.jackson.databind.deser.impl.CreatorCollector", "addBooleanCreator", "com.fasterxml.jackson.databind.introspect.AnnotatedWithParams,boolean", "<sample:4>", "false"}, {"com.fasterxml.jackson.databind.deser.impl.CreatorCollector", "verifyNonDup", "com.fasterxml.jackson.databind.introspect.AnnotatedWithParams,int", "<sample:0>", "2147483647"}}, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput283() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.impl.CreatorCollector", "com.fasterxml.jackson.databind.deser.impl.CreatorCollector", "addStringCreator", new String[]{"com.fasterxml.jackson.databind.introspect.AnnotatedWithParams"}, new String[]{"<sample:3>"}, false, 1, new String[][]{{"com.fasterxml.jackson.databind.deser.impl.CreatorCollector", "setDefaultCreator", "com.fasterxml.jackson.databind.introspect.AnnotatedWithParams", "<sample:3>"}}, 2);
  assertNull(actual);
  assertEquals("receiver state after the call", "{hasDefaultCreator=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput284() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.impl.CreatorCollector", "com.fasterxml.jackson.databind.deser.impl.CreatorCollector", "verifyNonDup", new String[]{"com.fasterxml.jackson.databind.introspect.AnnotatedWithParams", "int"}, new String[]{"<sample:11>", "0"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.deser.impl.CreatorCollector", "addLongCreator", "com.fasterxml.jackson.databind.introspect.AnnotatedWithParams,boolean", "<sample:9>", "true"}}, 3), new String[][]{{"getMember", "", "7"}});
  assertNotNull(actual);
  assertEquals("java.lang.reflect.Method", actual.getClass().getName());
  assertEquals("public static java.util.List java.util.Arrays.asList(java.lang.Object[]) {getAnnotatedExceptionTypes=[], getAnnotatedParameterTypes=?, getAnnotations=?, getDeclaredAnnotations=?, getExceptionTypes=[],...#479#1579258602", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{hasDefaultCreator=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput285() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.impl.CreatorCollector", "com.fasterxml.jackson.databind.deser.impl.CreatorCollector", "verifyNonDup", new String[]{"com.fasterxml.jackson.databind.introspect.AnnotatedWithParams", "int", "boolean"}, new String[]{"<sample:18>", "0", "true"}, false, 0, null, 1);
  assertNull(actual);
  assertEquals("receiver state after the call", "{hasDefaultCreator=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput286() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.impl.CreatorCollector", "com.fasterxml.jackson.databind.deser.impl.CreatorCollector", "addDoubleCreator", new String[]{"com.fasterxml.jackson.databind.introspect.AnnotatedWithParams", "boolean"}, new String[]{"<sample:13>", "true"}, false, 14, new String[][]{{"com.fasterxml.jackson.databind.deser.impl.CreatorCollector", "setDefaultCreator", "com.fasterxml.jackson.databind.introspect.AnnotatedWithParams", "<sample:3>"}, {"com.fasterxml.jackson.databind.deser.impl.CreatorCollector", "addIntCreator", "com.fasterxml.jackson.databind.introspect.AnnotatedWithParams", "<sample:9>"}}, 1);
  assertNull(actual);
  assertEquals("receiver state after the call", "{hasDefaultCreator=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput287() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.impl.CreatorCollector", "com.fasterxml.jackson.databind.deser.impl.CreatorCollector", "addStringCreator", new String[]{"com.fasterxml.jackson.databind.introspect.AnnotatedWithParams", "boolean"}, new String[]{"<sample:12>", "false"}, false, 1, new String[][]{{"com.fasterxml.jackson.databind.deser.impl.CreatorCollector", "verifyNonDup", "com.fasterxml.jackson.databind.introspect.AnnotatedWithParams,int", "<sample:4>", "1"}, {"com.fasterxml.jackson.databind.deser.impl.CreatorCollector", "addLongCreator", "com.fasterxml.jackson.databind.introspect.AnnotatedWithParams", "<sample:12>"}}, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput288() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.impl.CreatorCollector", "com.fasterxml.jackson.databind.deser.impl.CreatorCollector", "verifyNonDup", new String[]{"com.fasterxml.jackson.databind.introspect.AnnotatedWithParams", "int"}, new String[]{"<sample:3>", "2"}, false, 1, new String[][]{}, 1), new String[][]{{"getAnnotation", "java.lang.Class", "6"}, {"setValue", "java.lang.Object,java.lang.Object", "7"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput289() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.impl.CreatorCollector", "com.fasterxml.jackson.databind.deser.impl.CreatorCollector", "addDelegatingCreator", new String[]{"com.fasterxml.jackson.databind.introspect.AnnotatedWithParams", "boolean", "com.fasterxml.jackson.databind.deser.CreatorProperty[]"}, new String[]{"<sample:6>", "false", "<sample:10>"}, false, 16, new String[][]{{"com.fasterxml.jackson.databind.deser.impl.CreatorCollector", "addLongCreator", "com.fasterxml.jackson.databind.introspect.AnnotatedWithParams", "<sample:2>"}, {"com.fasterxml.jackson.databind.deser.impl.CreatorCollector", "addPropertyCreator", "com.fasterxml.jackson.databind.introspect.AnnotatedWithParams,boolean,com.fasterxml.jackson.databind.deser.CreatorProperty[]", "<sample:8>", "false", "<sample:0>"}, {"com.fasterxml.jackson.databind.deser.impl.CreatorCollector", "setDefaultCreator", "com.fasterxml.jackson.databind.introspect.AnnotatedWithParams", "<sample:5>"}}, 1);
  assertNull(actual);
  assertEquals("receiver state after the call", "{hasDefaultCreator=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput290() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.impl.CreatorCollector", "com.fasterxml.jackson.databind.deser.impl.CreatorCollector", "addDelegatingCreator", new String[]{"com.fasterxml.jackson.databind.introspect.AnnotatedWithParams", "com.fasterxml.jackson.databind.deser.CreatorProperty[]"}, new String[]{"<sample:3>", "<sample:1>"}, false, 12, new String[][]{{"com.fasterxml.jackson.databind.deser.impl.CreatorCollector", "setDefaultCreator", "com.fasterxml.jackson.databind.introspect.AnnotatedWithParams", "<sample:3>"}, {"com.fasterxml.jackson.databind.deser.impl.CreatorCollector", "addDoubleCreator", "com.fasterxml.jackson.databind.introspect.AnnotatedWithParams,boolean", "<sample:18>", "true"}, {"com.fasterxml.jackson.databind.deser.impl.CreatorCollector", "addPropertyCreator", "com.fasterxml.jackson.databind.introspect.AnnotatedWithParams,com.fasterxml.jackson.databind.deser.CreatorProperty[]", "<sample:2>", "<sample:10>"}}, 3);
  assertNull(actual);
  assertEquals("receiver state after the call", "{hasDefaultCreator=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput291() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.impl.CreatorCollector", "com.fasterxml.jackson.databind.deser.impl.CreatorCollector", "addIntCreator", new String[]{"com.fasterxml.jackson.databind.introspect.AnnotatedWithParams"}, new String[]{"<sample:18>"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.deser.impl.CreatorCollector", "verifyNonDup", "com.fasterxml.jackson.databind.introspect.AnnotatedWithParams,int,boolean", "<sample:0>", "0", "true"}}, 2);
  assertNull(actual);
  assertEquals("receiver state after the call", "{hasDefaultCreator=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput292() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.impl.CreatorCollector", "com.fasterxml.jackson.databind.deser.impl.CreatorCollector", "verifyNonDup", new String[]{"com.fasterxml.jackson.databind.introspect.AnnotatedWithParams", "int", "boolean"}, new String[]{"<sample:18>", "0", "true"}, false, 14, new String[][]{{"com.fasterxml.jackson.databind.deser.impl.CreatorCollector", "verifyNonDup", "com.fasterxml.jackson.databind.introspect.AnnotatedWithParams,int", "<sample:4>", "-34"}, {"com.fasterxml.jackson.databind.deser.impl.CreatorCollector", "constructValueInstantiator", "com.fasterxml.jackson.databind.DeserializationConfig", "<sample:5>"}}, 3);
  assertNull(actual);
  assertEquals("receiver state after the call", "{hasDefaultCreator=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput293() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.impl.CreatorCollector", "com.fasterxml.jackson.databind.deser.impl.CreatorCollector", "verifyNonDup", new String[]{"com.fasterxml.jackson.databind.introspect.AnnotatedWithParams", "int"}, new String[]{"<sample:2>", "3"}, false, 4, new String[][]{{"com.fasterxml.jackson.databind.deser.impl.CreatorCollector", "addPropertyCreator", "com.fasterxml.jackson.databind.introspect.AnnotatedWithParams,boolean,com.fasterxml.jackson.databind.deser.CreatorProperty[]", "<sample:1>", "false", "<sample:0>"}, {"com.fasterxml.jackson.databind.deser.impl.CreatorCollector", "addStringCreator", "com.fasterxml.jackson.databind.introspect.AnnotatedWithParams,boolean", "<sample:13>", "true"}}, 1), new String[][]{{"getName", "", "1"}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("java.lang.Integer", String.valueOf(actual));
  assertEquals("receiver state after the call", "{hasDefaultCreator=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput294() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.impl.CreatorCollector", "com.fasterxml.jackson.databind.deser.impl.CreatorCollector", "addIntCreator", new String[]{"com.fasterxml.jackson.databind.introspect.AnnotatedWithParams", "boolean"}, new String[]{"<sample:5>", "true"}, false, 2, new String[][]{{"com.fasterxml.jackson.databind.deser.impl.CreatorCollector", "addPropertyCreator", "com.fasterxml.jackson.databind.introspect.AnnotatedWithParams,boolean,com.fasterxml.jackson.databind.deser.CreatorProperty[]", "<sample:10>", "false", "<sample:2>"}, {"com.fasterxml.jackson.databind.deser.impl.CreatorCollector", "setDefaultCreator", "com.fasterxml.jackson.databind.introspect.AnnotatedWithParams", "<sample:18>"}}, 2);
  assertNull(actual);
  assertEquals("receiver state after the call", "{hasDefaultCreator=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput295() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.impl.CreatorCollector", "com.fasterxml.jackson.databind.deser.impl.CreatorCollector", "addIncompeteParameter", new String[]{"com.fasterxml.jackson.databind.introspect.AnnotatedParameter"}, new String[]{"<sample:5>"}, false, 2, new String[][]{{"com.fasterxml.jackson.databind.deser.impl.CreatorCollector", "verifyNonDup", "com.fasterxml.jackson.databind.introspect.AnnotatedWithParams,int", "<sample:12>", "8"}, {"com.fasterxml.jackson.databind.deser.impl.CreatorCollector", "verifyNonDup", "com.fasterxml.jackson.databind.introspect.AnnotatedWithParams,int", "<sample:9>", "0"}}, 1);
  assertNull(actual);
  assertEquals("receiver state after the call", "{hasDefaultCreator=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput296() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.impl.CreatorCollector", "com.fasterxml.jackson.databind.deser.impl.CreatorCollector", "addBooleanCreator", new String[]{"com.fasterxml.jackson.databind.introspect.AnnotatedWithParams", "boolean"}, new String[]{"<sample:10>", "false"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.deser.impl.CreatorCollector", "verifyNonDup", "com.fasterxml.jackson.databind.introspect.AnnotatedWithParams,int", "<sample:6>", "0"}, {"com.fasterxml.jackson.databind.deser.impl.CreatorCollector", "addLongCreator", "com.fasterxml.jackson.databind.introspect.AnnotatedWithParams,boolean", "<sample:0>", "false"}}, 3);
  assertNull(actual);
  assertEquals("receiver state after the call", "{hasDefaultCreator=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput297() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.impl.CreatorCollector", "com.fasterxml.jackson.databind.deser.impl.CreatorCollector", "addStringCreator", new String[]{"com.fasterxml.jackson.databind.introspect.AnnotatedWithParams", "boolean"}, new String[]{"<sample:11>", "false"}, false, 10, new String[][]{{"com.fasterxml.jackson.databind.deser.impl.CreatorCollector", "addPropertyCreator", "com.fasterxml.jackson.databind.introspect.AnnotatedWithParams,com.fasterxml.jackson.databind.deser.CreatorProperty[]", "<sample:13>", "<sample:11>"}, {"com.fasterxml.jackson.databind.deser.impl.CreatorCollector", "addStringCreator", "com.fasterxml.jackson.databind.introspect.AnnotatedWithParams", "<sample:11>"}, {"com.fasterxml.jackson.databind.deser.impl.CreatorCollector", "addIntCreator", "com.fasterxml.jackson.databind.introspect.AnnotatedWithParams", "<sample:8>"}}, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput298() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.impl.CreatorCollector", "com.fasterxml.jackson.databind.deser.impl.CreatorCollector", "addLongCreator", new String[]{"com.fasterxml.jackson.databind.introspect.AnnotatedWithParams", "boolean"}, new String[]{"<sample:13>", "false"}, false, 10, new String[][]{{"com.fasterxml.jackson.databind.deser.impl.CreatorCollector", "setDefaultCreator", "com.fasterxml.jackson.databind.introspect.AnnotatedWithParams", "<sample:9>"}}, 2);
  assertNull(actual);
  assertEquals("receiver state after the call", "{hasDefaultCreator=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput299() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.impl.CreatorCollector", "com.fasterxml.jackson.databind.deser.impl.CreatorCollector", "addBooleanCreator", new String[]{"com.fasterxml.jackson.databind.introspect.AnnotatedWithParams"}, new String[]{"<sample:8>"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.deser.impl.CreatorCollector", "verifyNonDup", "com.fasterxml.jackson.databind.introspect.AnnotatedWithParams,int,boolean", "<sample:12>", "-4", "true"}, {"com.fasterxml.jackson.databind.deser.impl.CreatorCollector", "setDefaultCreator", "com.fasterxml.jackson.databind.introspect.AnnotatedWithParams", "<sample:9>"}}, 1);
  assertNull(actual);
  assertEquals("receiver state after the call", "{hasDefaultCreator=true}", SearchInputFactory_scaffolding.receiverState());
 }
}
