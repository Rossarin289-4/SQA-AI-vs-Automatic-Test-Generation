package generated.algorithm;

import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;
import static org.junit.Assert.*;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class SimulatedAnnealingGeneratedTest {
 @Test(timeout = 20000)
 public void generatedInput000() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.impl.CreatorCollector", "com.fasterxml.jackson.databind.deser.impl.CreatorCollector", "addDelegatingCreator", new String[]{"com.fasterxml.jackson.databind.introspect.AnnotatedWithParams", "com.fasterxml.jackson.databind.deser.CreatorProperty[]"}, new String[]{"<sample:3>", "<sample:1>"}, false, 7, new String[][]{{"com.fasterxml.jackson.databind.deser.impl.CreatorCollector", "addPropertyCreator", "com.fasterxml.jackson.databind.introspect.AnnotatedWithParams,com.fasterxml.jackson.databind.deser.CreatorProperty[]", "<sample:2>", "<sample:0>"}, {"com.fasterxml.jackson.databind.deser.impl.CreatorCollector", "addIncompeteParameter", "com.fasterxml.jackson.databind.introspect.AnnotatedParameter", "<sample:1>"}, {"com.fasterxml.jackson.databind.deser.impl.CreatorCollector", "hasDelegatingCreator", ""}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{hasDefaultCreator=false, hasDelegatingCreator=false, hasPropertyBasedCreator=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput001() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.impl.CreatorCollector", "com.fasterxml.jackson.databind.deser.impl.CreatorCollector", "addDoubleCreator", new String[]{"com.fasterxml.jackson.databind.introspect.AnnotatedWithParams"}, new String[]{"<sample:3>"}, false, 6, new String[][]{{"com.fasterxml.jackson.databind.deser.impl.CreatorCollector", "hasDelegatingCreator", ""}, {"com.fasterxml.jackson.databind.deser.impl.CreatorCollector", "addIntCreator", "com.fasterxml.jackson.databind.introspect.AnnotatedWithParams", "<sample:2>"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{hasDefaultCreator=false, hasDelegatingCreator=false, hasPropertyBasedCreator=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput002() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.impl.CreatorCollector", "com.fasterxml.jackson.databind.deser.impl.CreatorCollector", "addIntCreator", new String[]{"com.fasterxml.jackson.databind.introspect.AnnotatedWithParams"}, new String[]{"<sample:3>"}, false, 13, new String[][]{{"com.fasterxml.jackson.databind.deser.impl.CreatorCollector", "setDefaultCreator", "com.fasterxml.jackson.databind.introspect.AnnotatedWithParams", "<sample:5>"}, {"com.fasterxml.jackson.databind.deser.impl.CreatorCollector", "addBooleanCreator", "com.fasterxml.jackson.databind.introspect.AnnotatedWithParams", "<sample:7>"}}, 1);
  assertNull(actual);
  assertEquals("receiver state after the call", "{hasDefaultCreator=false, hasDelegatingCreator=false, hasPropertyBasedCreator=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput003() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.impl.CreatorCollector", "com.fasterxml.jackson.databind.deser.impl.CreatorCollector", "addIncompeteParameter", new String[]{"com.fasterxml.jackson.databind.introspect.AnnotatedParameter"}, new String[]{"<sample:3>"}, false, 1, new String[][]{{"com.fasterxml.jackson.databind.deser.impl.CreatorCollector", "addIncompeteParameter", "com.fasterxml.jackson.databind.introspect.AnnotatedParameter", "<sample:2>"}, {"com.fasterxml.jackson.databind.deser.impl.CreatorCollector", "setDefaultCreator", "com.fasterxml.jackson.databind.introspect.AnnotatedWithParams", "<sample:2>"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{hasDefaultCreator=true, hasDelegatingCreator=false, hasPropertyBasedCreator=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput004() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.impl.CreatorCollector", "com.fasterxml.jackson.databind.deser.impl.CreatorCollector", "addLongCreator", new String[]{"com.fasterxml.jackson.databind.introspect.AnnotatedWithParams"}, new String[]{"<null>"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.deser.impl.CreatorCollector", "addIntCreator", "com.fasterxml.jackson.databind.introspect.AnnotatedWithParams,boolean", "<sample:3>", "true"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{hasDefaultCreator=false, hasDelegatingCreator=false, hasPropertyBasedCreator=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput005() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.impl.CreatorCollector", "com.fasterxml.jackson.databind.deser.impl.CreatorCollector", "addBooleanCreator", new String[]{"com.fasterxml.jackson.databind.introspect.AnnotatedWithParams", "boolean"}, new String[]{"<sample:6>", "true"}, false, 4, new String[][]{{"com.fasterxml.jackson.databind.deser.impl.CreatorCollector", "addIntCreator", "com.fasterxml.jackson.databind.introspect.AnnotatedWithParams", "<sample:7>"}, {"com.fasterxml.jackson.databind.deser.impl.CreatorCollector", "addStringCreator", "com.fasterxml.jackson.databind.introspect.AnnotatedWithParams", "<sample:3>"}, {"com.fasterxml.jackson.databind.deser.impl.CreatorCollector", "addBooleanCreator", "com.fasterxml.jackson.databind.introspect.AnnotatedWithParams,boolean", "<sample:5>", "true"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput006() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.impl.CreatorCollector", "com.fasterxml.jackson.databind.deser.impl.CreatorCollector", "addLongCreator", new String[]{"com.fasterxml.jackson.databind.introspect.AnnotatedWithParams", "boolean"}, new String[]{"<null>", "true"}, false, 3, new String[][]{{"com.fasterxml.jackson.databind.deser.impl.CreatorCollector", "constructValueInstantiator", "com.fasterxml.jackson.databind.DeserializationConfig", "<sample:6>"}}, 3);
  assertNull(actual);
  assertEquals("receiver state after the call", "{hasDefaultCreator=false, hasDelegatingCreator=false, hasPropertyBasedCreator=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput007() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.impl.CreatorCollector", "com.fasterxml.jackson.databind.deser.impl.CreatorCollector", "constructValueInstantiator", new String[]{"com.fasterxml.jackson.databind.DeserializationConfig"}, new String[]{"<sample:2>"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.deser.impl.CreatorCollector", "addPropertyCreator", "com.fasterxml.jackson.databind.introspect.AnnotatedWithParams,com.fasterxml.jackson.databind.deser.CreatorProperty[]", "<sample:0>", "<empty>"}, {"com.fasterxml.jackson.databind.deser.impl.CreatorCollector", "addIntCreator", "com.fasterxml.jackson.databind.introspect.AnnotatedWithParams,boolean", "<sample:0>", "true"}, {"com.fasterxml.jackson.databind.deser.impl.CreatorCollector", "addDelegatingCreator", "com.fasterxml.jackson.databind.introspect.AnnotatedWithParams,boolean,com.fasterxml.jackson.databind.deser.SettableBeanProperty[]", "<sample:3>", "true", "<null>"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput008() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.impl.CreatorCollector", "com.fasterxml.jackson.databind.deser.impl.CreatorCollector", "addPropertyCreator", new String[]{"com.fasterxml.jackson.databind.introspect.AnnotatedWithParams", "boolean", "com.fasterxml.jackson.databind.deser.SettableBeanProperty[]"}, new String[]{"<sample:3>", "false", "<sample:2>"}, false, 4, new String[][]{{"com.fasterxml.jackson.databind.deser.impl.CreatorCollector", "addDelegatingCreator", "com.fasterxml.jackson.databind.introspect.AnnotatedWithParams,boolean,com.fasterxml.jackson.databind.deser.SettableBeanProperty[]", "<sample:11>", "true", "<sample:0>"}, {"com.fasterxml.jackson.databind.deser.impl.CreatorCollector", "addDelegatingCreator", "com.fasterxml.jackson.databind.introspect.AnnotatedWithParams,com.fasterxml.jackson.databind.deser.CreatorProperty[]", "<sample:7>", "<sample:2>"}, {"com.fasterxml.jackson.databind.deser.impl.CreatorCollector", "constructValueInstantiator", "com.fasterxml.jackson.databind.DeserializationConfig", "<sample:7>"}}, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput009() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.impl.CreatorCollector", "com.fasterxml.jackson.databind.deser.impl.CreatorCollector", "addPropertyCreator", new String[]{"com.fasterxml.jackson.databind.introspect.AnnotatedWithParams", "boolean", "com.fasterxml.jackson.databind.deser.SettableBeanProperty[]"}, new String[]{"<null>", "true", "<sample:1>"}, false, 14, new String[][]{{"com.fasterxml.jackson.databind.deser.impl.CreatorCollector", "addDelegatingCreator", "com.fasterxml.jackson.databind.introspect.AnnotatedWithParams,boolean,com.fasterxml.jackson.databind.deser.SettableBeanProperty[]", "<sample:7>", "false", "<sample:0>"}, {"com.fasterxml.jackson.databind.deser.impl.CreatorCollector", "addDelegatingCreator", "com.fasterxml.jackson.databind.introspect.AnnotatedWithParams,com.fasterxml.jackson.databind.deser.CreatorProperty[]", "<sample:7>", "<sample:2>"}, {"com.fasterxml.jackson.databind.deser.impl.CreatorCollector", "constructValueInstantiator", "com.fasterxml.jackson.databind.DeserializationConfig", "<sample:1>"}}, 1);
  assertNull(actual);
  assertEquals("receiver state after the call", "{hasDefaultCreator=false, hasDelegatingCreator=true, hasPropertyBasedCreator=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput010() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.impl.CreatorCollector", "com.fasterxml.jackson.databind.deser.impl.CreatorCollector", "addPropertyCreator", new String[]{"com.fasterxml.jackson.databind.introspect.AnnotatedWithParams", "com.fasterxml.jackson.databind.deser.CreatorProperty[]"}, new String[]{"<sample:2>", "<sample:0>"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.deser.impl.CreatorCollector", "addPropertyCreator", "com.fasterxml.jackson.databind.introspect.AnnotatedWithParams,boolean,com.fasterxml.jackson.databind.deser.SettableBeanProperty[]", "<sample:7>", "true", "<null>"}, {"com.fasterxml.jackson.databind.deser.impl.CreatorCollector", "setDefaultCreator", "com.fasterxml.jackson.databind.introspect.AnnotatedWithParams", "<sample:4>"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{hasDefaultCreator=false, hasDelegatingCreator=false, hasPropertyBasedCreator=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput011() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.impl.CreatorCollector", "com.fasterxml.jackson.databind.deser.impl.CreatorCollector", "addDoubleCreator", new String[]{"com.fasterxml.jackson.databind.introspect.AnnotatedWithParams", "boolean"}, new String[]{"<sample:11>", "false"}, false, 9, new String[][]{{"com.fasterxml.jackson.databind.deser.impl.CreatorCollector", "setDefaultCreator", "com.fasterxml.jackson.databind.introspect.AnnotatedWithParams", "<sample:11>"}, {"com.fasterxml.jackson.databind.deser.impl.CreatorCollector", "hasPropertyBasedCreator", ""}, {"com.fasterxml.jackson.databind.deser.impl.CreatorCollector", "addDoubleCreator", "com.fasterxml.jackson.databind.introspect.AnnotatedWithParams", "<sample:12>"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{hasDefaultCreator=true, hasDelegatingCreator=false, hasPropertyBasedCreator=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput012() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.impl.CreatorCollector", "com.fasterxml.jackson.databind.deser.impl.CreatorCollector", "hasDefaultCreator", new String[]{}, new String[]{}, false, 5, new String[][]{}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{hasDefaultCreator=false, hasDelegatingCreator=false, hasPropertyBasedCreator=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput013() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.impl.CreatorCollector", "com.fasterxml.jackson.databind.deser.impl.CreatorCollector", "addDoubleCreator", new String[]{"com.fasterxml.jackson.databind.introspect.AnnotatedWithParams", "boolean"}, new String[]{"<sample:6>", "false"}, false, 0, null, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput014() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.impl.CreatorCollector", "com.fasterxml.jackson.databind.deser.impl.CreatorCollector", "addDoubleCreator", new String[]{"com.fasterxml.jackson.databind.introspect.AnnotatedWithParams", "boolean"}, new String[]{"<sample:2>", "true"}, false, 0, null, 3);
  assertNull(actual);
  assertEquals("receiver state after the call", "{hasDefaultCreator=false, hasDelegatingCreator=false, hasPropertyBasedCreator=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput015() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.impl.CreatorCollector", "com.fasterxml.jackson.databind.deser.impl.CreatorCollector", "addDoubleCreator", new String[]{"com.fasterxml.jackson.databind.introspect.AnnotatedWithParams"}, new String[]{"<sample:3>"}, false, 16, new String[][]{{"com.fasterxml.jackson.databind.deser.impl.CreatorCollector", "addDelegatingCreator", "com.fasterxml.jackson.databind.introspect.AnnotatedWithParams,boolean,com.fasterxml.jackson.databind.deser.SettableBeanProperty[]", "<sample:5>", "false", "<sample:0>"}, {"com.fasterxml.jackson.databind.deser.impl.CreatorCollector", "addIntCreator", "com.fasterxml.jackson.databind.introspect.AnnotatedWithParams", "<sample:2>"}}, 3);
  assertNull(actual);
  assertEquals("receiver state after the call", "{hasDefaultCreator=false, hasDelegatingCreator=false, hasPropertyBasedCreator=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput016() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.impl.CreatorCollector", "com.fasterxml.jackson.databind.deser.impl.CreatorCollector", "addIntCreator", new String[]{"com.fasterxml.jackson.databind.introspect.AnnotatedWithParams", "boolean"}, new String[]{"<sample:3>", "false"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.deser.impl.CreatorCollector", "addIncompeteParameter", "com.fasterxml.jackson.databind.introspect.AnnotatedParameter", "<sample:7>"}, {"com.fasterxml.jackson.databind.deser.impl.CreatorCollector", "addLongCreator", "com.fasterxml.jackson.databind.introspect.AnnotatedWithParams", "<sample:4>"}, {"com.fasterxml.jackson.databind.deser.impl.CreatorCollector", "constructValueInstantiator", "com.fasterxml.jackson.databind.DeserializationConfig", "<sample:4>"}}, 2);
  assertNull(actual);
  assertEquals("receiver state after the call", "{hasDefaultCreator=false, hasDelegatingCreator=false, hasPropertyBasedCreator=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput017() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.impl.CreatorCollector", "com.fasterxml.jackson.databind.deser.impl.CreatorCollector", "hasDefaultCreator", new String[]{}, new String[]{}, false, 6, new String[][]{{"com.fasterxml.jackson.databind.deser.impl.CreatorCollector", "addDoubleCreator", "com.fasterxml.jackson.databind.introspect.AnnotatedWithParams", "<sample:4>"}, {"com.fasterxml.jackson.databind.deser.impl.CreatorCollector", "addDoubleCreator", "com.fasterxml.jackson.databind.introspect.AnnotatedWithParams", "<sample:6>"}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{hasDefaultCreator=false, hasDelegatingCreator=false, hasPropertyBasedCreator=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput018() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.impl.CreatorCollector", "com.fasterxml.jackson.databind.deser.impl.CreatorCollector", "addStringCreator", new String[]{"com.fasterxml.jackson.databind.introspect.AnnotatedWithParams"}, new String[]{"<sample:3>"}, false, 0, null, 1);
  assertNull(actual);
  assertEquals("receiver state after the call", "{hasDefaultCreator=false, hasDelegatingCreator=false, hasPropertyBasedCreator=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput019() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.impl.CreatorCollector", "com.fasterxml.jackson.databind.deser.impl.CreatorCollector", "addIncompeteParameter", new String[]{"com.fasterxml.jackson.databind.introspect.AnnotatedParameter"}, new String[]{"<null>"}, false, 0, null, 2);
  assertNull(actual);
  assertEquals("receiver state after the call", "{hasDefaultCreator=false, hasDelegatingCreator=false, hasPropertyBasedCreator=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput020() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.impl.CreatorCollector", "com.fasterxml.jackson.databind.deser.impl.CreatorCollector", "addIncompeteParameter", new String[]{"com.fasterxml.jackson.databind.introspect.AnnotatedParameter"}, new String[]{"<sample:4>"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.deser.impl.CreatorCollector", "addDelegatingCreator", "com.fasterxml.jackson.databind.introspect.AnnotatedWithParams,boolean,com.fasterxml.jackson.databind.deser.SettableBeanProperty[]", "<sample:6>", "true", "<sample:1>"}}, 3);
  assertNull(actual);
  assertEquals("receiver state after the call", "{hasDefaultCreator=false, hasDelegatingCreator=false, hasPropertyBasedCreator=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput021() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.impl.CreatorCollector", "com.fasterxml.jackson.databind.deser.impl.CreatorCollector", "setDefaultCreator", new String[]{"com.fasterxml.jackson.databind.introspect.AnnotatedWithParams"}, new String[]{"<sample:7>"}, false, 2, new String[][]{{"com.fasterxml.jackson.databind.deser.impl.CreatorCollector", "addDoubleCreator", "com.fasterxml.jackson.databind.introspect.AnnotatedWithParams,boolean", "<sample:3>", "false"}}, 2);
  assertNull(actual);
  assertEquals("receiver state after the call", "{hasDefaultCreator=true, hasDelegatingCreator=false, hasPropertyBasedCreator=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput022() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.impl.CreatorCollector", "com.fasterxml.jackson.databind.deser.impl.CreatorCollector", "setDefaultCreator", new String[]{"com.fasterxml.jackson.databind.introspect.AnnotatedWithParams"}, new String[]{"<sample:5>"}, false, 2, new String[][]{{"com.fasterxml.jackson.databind.deser.impl.CreatorCollector", "addDoubleCreator", "com.fasterxml.jackson.databind.introspect.AnnotatedWithParams,boolean", "<sample:3>", "false"}}, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput023() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.impl.CreatorCollector", "com.fasterxml.jackson.databind.deser.impl.CreatorCollector", "setDefaultCreator", new String[]{"com.fasterxml.jackson.databind.introspect.AnnotatedWithParams"}, new String[]{"<sample:8>"}, false, 2, new String[][]{{"com.fasterxml.jackson.databind.deser.impl.CreatorCollector", "addDelegatingCreator", "com.fasterxml.jackson.databind.introspect.AnnotatedWithParams,boolean,com.fasterxml.jackson.databind.deser.SettableBeanProperty[]", "<sample:0>", "false", "<sample:1>"}}, 2);
  assertNull(actual);
  assertEquals("receiver state after the call", "{hasDefaultCreator=false, hasDelegatingCreator=false, hasPropertyBasedCreator=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput024() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.impl.CreatorCollector", "com.fasterxml.jackson.databind.deser.impl.CreatorCollector", "addDelegatingCreator", new String[]{"com.fasterxml.jackson.databind.introspect.AnnotatedWithParams", "boolean", "com.fasterxml.jackson.databind.deser.SettableBeanProperty[]"}, new String[]{"<sample:3>", "false", "<null>"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.deser.impl.CreatorCollector", "constructValueInstantiator", "com.fasterxml.jackson.databind.DeserializationConfig", "<sample:3>"}}, 2);
  assertNull(actual);
  assertEquals("receiver state after the call", "{hasDefaultCreator=false, hasDelegatingCreator=false, hasPropertyBasedCreator=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput025() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.impl.CreatorCollector", "com.fasterxml.jackson.databind.deser.impl.CreatorCollector", "addDelegatingCreator", new String[]{"com.fasterxml.jackson.databind.introspect.AnnotatedWithParams", "boolean", "com.fasterxml.jackson.databind.deser.SettableBeanProperty[]"}, new String[]{"<sample:3>", "false", "<null>"}, false, 10, new String[][]{{"com.fasterxml.jackson.databind.deser.impl.CreatorCollector", "addStringCreator", "com.fasterxml.jackson.databind.introspect.AnnotatedWithParams", "<sample:6>"}, {"com.fasterxml.jackson.databind.deser.impl.CreatorCollector", "addPropertyCreator", "com.fasterxml.jackson.databind.introspect.AnnotatedWithParams,boolean,com.fasterxml.jackson.databind.deser.SettableBeanProperty[]", "<sample:7>", "false", "<sample:2>"}}, 2);
  assertNull(actual);
  assertEquals("receiver state after the call", "{hasDefaultCreator=false, hasDelegatingCreator=false, hasPropertyBasedCreator=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput026() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.impl.CreatorCollector", "com.fasterxml.jackson.databind.deser.impl.CreatorCollector", "addDelegatingCreator", new String[]{"com.fasterxml.jackson.databind.introspect.AnnotatedWithParams", "boolean", "com.fasterxml.jackson.databind.deser.SettableBeanProperty[]"}, new String[]{"<sample:6>", "true", "<sample:0>"}, false, 11, new String[][]{{"com.fasterxml.jackson.databind.deser.impl.CreatorCollector", "addDelegatingCreator", "com.fasterxml.jackson.databind.introspect.AnnotatedWithParams,com.fasterxml.jackson.databind.deser.CreatorProperty[]", "<sample:2>", "<empty>"}, {"com.fasterxml.jackson.databind.deser.impl.CreatorCollector", "addPropertyCreator", "com.fasterxml.jackson.databind.introspect.AnnotatedWithParams,boolean,com.fasterxml.jackson.databind.deser.SettableBeanProperty[]", "<sample:8>", "true", "<sample:2>"}}, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput027() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.impl.CreatorCollector", "com.fasterxml.jackson.databind.deser.impl.CreatorCollector", "addIntCreator", new String[]{"com.fasterxml.jackson.databind.introspect.AnnotatedWithParams"}, new String[]{"<sample:1>"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.deser.impl.CreatorCollector", "addLongCreator", "com.fasterxml.jackson.databind.introspect.AnnotatedWithParams,boolean", "<sample:7>", "true"}}, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput028() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.impl.CreatorCollector", "com.fasterxml.jackson.databind.deser.impl.CreatorCollector", "addIntCreator", new String[]{"com.fasterxml.jackson.databind.introspect.AnnotatedWithParams"}, new String[]{"<null>"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.deser.impl.CreatorCollector", "addLongCreator", "com.fasterxml.jackson.databind.introspect.AnnotatedWithParams,boolean", "<sample:7>", "true"}}, 2);
  assertNull(actual);
  assertEquals("receiver state after the call", "{hasDefaultCreator=false, hasDelegatingCreator=false, hasPropertyBasedCreator=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput029() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.impl.CreatorCollector", "com.fasterxml.jackson.databind.deser.impl.CreatorCollector", "addIntCreator", new String[]{"com.fasterxml.jackson.databind.introspect.AnnotatedWithParams"}, new String[]{"<sample:4>"}, false, 13, new String[][]{{"com.fasterxml.jackson.databind.deser.impl.CreatorCollector", "setDefaultCreator", "com.fasterxml.jackson.databind.introspect.AnnotatedWithParams", "<sample:5>"}, {"com.fasterxml.jackson.databind.deser.impl.CreatorCollector", "addBooleanCreator", "com.fasterxml.jackson.databind.introspect.AnnotatedWithParams", "<sample:7>"}}, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput030() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.impl.CreatorCollector", "com.fasterxml.jackson.databind.deser.impl.CreatorCollector", "addLongCreator", new String[]{"com.fasterxml.jackson.databind.introspect.AnnotatedWithParams"}, new String[]{"<sample:8>"}, false, 13, new String[][]{{"com.fasterxml.jackson.databind.deser.impl.CreatorCollector", "addIntCreator", "com.fasterxml.jackson.databind.introspect.AnnotatedWithParams,boolean", "<sample:6>", "true"}}, 2);
  assertNull(actual);
  assertEquals("receiver state after the call", "{hasDefaultCreator=false, hasDelegatingCreator=false, hasPropertyBasedCreator=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput031() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.impl.CreatorCollector", "com.fasterxml.jackson.databind.deser.impl.CreatorCollector", "constructValueInstantiator", new String[]{"com.fasterxml.jackson.databind.DeserializationConfig"}, new String[]{"<sample:4>"}, false, 0, null, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput032() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.impl.CreatorCollector", "com.fasterxml.jackson.databind.deser.impl.CreatorCollector", "addStringCreator", new String[]{"com.fasterxml.jackson.databind.introspect.AnnotatedWithParams", "boolean"}, new String[]{"<sample:1>", "true"}, false, 0, null, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput033() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.impl.CreatorCollector", "com.fasterxml.jackson.databind.deser.impl.CreatorCollector", "constructValueInstantiator", new String[]{"com.fasterxml.jackson.databind.DeserializationConfig"}, new String[]{"<sample:3>"}, false, 1, new String[][]{{"com.fasterxml.jackson.databind.deser.impl.CreatorCollector", "addPropertyCreator", "com.fasterxml.jackson.databind.introspect.AnnotatedWithParams,com.fasterxml.jackson.databind.deser.CreatorProperty[]", "<sample:3>", "<sample:2>"}, {"com.fasterxml.jackson.databind.deser.impl.CreatorCollector", "addPropertyCreator", "com.fasterxml.jackson.databind.introspect.AnnotatedWithParams,boolean,com.fasterxml.jackson.databind.deser.SettableBeanProperty[]", "<sample:2>", "true", "<sample:2>"}, {"com.fasterxml.jackson.databind.deser.impl.CreatorCollector", "addLongCreator", "com.fasterxml.jackson.databind.introspect.AnnotatedWithParams,boolean", "<null>", "true"}}, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput034() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.impl.CreatorCollector", "com.fasterxml.jackson.databind.deser.impl.CreatorCollector", "constructValueInstantiator", new String[]{"com.fasterxml.jackson.databind.DeserializationConfig"}, new String[]{"<null>"}, false, 5, new String[][]{{"com.fasterxml.jackson.databind.deser.impl.CreatorCollector", "addPropertyCreator", "com.fasterxml.jackson.databind.introspect.AnnotatedWithParams,com.fasterxml.jackson.databind.deser.CreatorProperty[]", "<sample:2>", "<sample:1>"}, {"com.fasterxml.jackson.databind.deser.impl.CreatorCollector", "addPropertyCreator", "com.fasterxml.jackson.databind.introspect.AnnotatedWithParams,com.fasterxml.jackson.databind.deser.CreatorProperty[]", "<sample:1>", "<sample:0>"}}, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput035() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.impl.CreatorCollector", "com.fasterxml.jackson.databind.deser.impl.CreatorCollector", "addIntCreator", new String[]{"com.fasterxml.jackson.databind.introspect.AnnotatedWithParams"}, new String[]{"<sample:2>"}, false, 3, new String[][]{{"com.fasterxml.jackson.databind.deser.impl.CreatorCollector", "hasDelegatingCreator", ""}, {"com.fasterxml.jackson.databind.deser.impl.CreatorCollector", "addBooleanCreator", "com.fasterxml.jackson.databind.introspect.AnnotatedWithParams", "<null>"}}, 3);
  assertNull(actual);
  assertEquals("receiver state after the call", "{hasDefaultCreator=false, hasDelegatingCreator=false, hasPropertyBasedCreator=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput036() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.impl.CreatorCollector", "com.fasterxml.jackson.databind.deser.impl.CreatorCollector", "addPropertyCreator", new String[]{"com.fasterxml.jackson.databind.introspect.AnnotatedWithParams", "com.fasterxml.jackson.databind.deser.CreatorProperty[]"}, new String[]{"<sample:6>", "<sample:2>"}, false, 3, new String[][]{{"com.fasterxml.jackson.databind.deser.impl.CreatorCollector", "addPropertyCreator", "com.fasterxml.jackson.databind.introspect.AnnotatedWithParams,com.fasterxml.jackson.databind.deser.CreatorProperty[]", "<sample:2>", "<empty>"}}, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput037() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.impl.CreatorCollector", "com.fasterxml.jackson.databind.deser.impl.CreatorCollector", "addLongCreator", new String[]{"com.fasterxml.jackson.databind.introspect.AnnotatedWithParams"}, new String[]{"<sample:9>"}, false, 0, null, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput038() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.impl.CreatorCollector", "com.fasterxml.jackson.databind.deser.impl.CreatorCollector", "hasDelegatingCreator", new String[]{}, new String[]{}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.deser.impl.CreatorCollector", "hasDelegatingCreator", ""}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{hasDefaultCreator=false, hasDelegatingCreator=false, hasPropertyBasedCreator=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput039() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.impl.CreatorCollector", "com.fasterxml.jackson.databind.deser.impl.CreatorCollector", "addPropertyCreator", new String[]{"com.fasterxml.jackson.databind.introspect.AnnotatedWithParams", "com.fasterxml.jackson.databind.deser.CreatorProperty[]"}, new String[]{"<sample:3>", "<sample:2>"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.deser.impl.CreatorCollector", "addLongCreator", "com.fasterxml.jackson.databind.introspect.AnnotatedWithParams,boolean", "<sample:6>", "false"}}, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput040() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.impl.CreatorCollector", "com.fasterxml.jackson.databind.deser.impl.CreatorCollector", "addPropertyCreator", new String[]{"com.fasterxml.jackson.databind.introspect.AnnotatedWithParams", "com.fasterxml.jackson.databind.deser.CreatorProperty[]"}, new String[]{"<sample:3>", "<sample:1>"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.deser.impl.CreatorCollector", "addLongCreator", "com.fasterxml.jackson.databind.introspect.AnnotatedWithParams,boolean", "<sample:6>", "false"}}, 2);
  assertNull(actual);
  assertEquals("receiver state after the call", "{hasDefaultCreator=false, hasDelegatingCreator=false, hasPropertyBasedCreator=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput041() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.impl.CreatorCollector", "com.fasterxml.jackson.databind.deser.impl.CreatorCollector", "addStringCreator", new String[]{"com.fasterxml.jackson.databind.introspect.AnnotatedWithParams", "boolean"}, new String[]{"<sample:2>", "true"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.deser.impl.CreatorCollector", "addDelegatingCreator", "com.fasterxml.jackson.databind.introspect.AnnotatedWithParams,com.fasterxml.jackson.databind.deser.CreatorProperty[]", "<sample:7>", "<sample:0>"}, {"com.fasterxml.jackson.databind.deser.impl.CreatorCollector", "addLongCreator", "com.fasterxml.jackson.databind.introspect.AnnotatedWithParams,boolean", "<sample:7>", "true"}}, 3);
  assertNull(actual);
  assertEquals("receiver state after the call", "{hasDefaultCreator=false, hasDelegatingCreator=true, hasPropertyBasedCreator=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput042() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.impl.CreatorCollector", "com.fasterxml.jackson.databind.deser.impl.CreatorCollector", "addStringCreator", new String[]{"com.fasterxml.jackson.databind.introspect.AnnotatedWithParams", "boolean"}, new String[]{"<null>", "true"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.deser.impl.CreatorCollector", "addDelegatingCreator", "com.fasterxml.jackson.databind.introspect.AnnotatedWithParams,com.fasterxml.jackson.databind.deser.CreatorProperty[]", "<sample:3>", "<sample:0>"}, {"com.fasterxml.jackson.databind.deser.impl.CreatorCollector", "addLongCreator", "com.fasterxml.jackson.databind.introspect.AnnotatedWithParams,boolean", "<sample:7>", "true"}}, 3);
  assertNull(actual);
  assertEquals("receiver state after the call", "{hasDefaultCreator=false, hasDelegatingCreator=false, hasPropertyBasedCreator=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput043() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.impl.CreatorCollector", "com.fasterxml.jackson.databind.deser.impl.CreatorCollector", "addStringCreator", new String[]{"com.fasterxml.jackson.databind.introspect.AnnotatedWithParams", "boolean"}, new String[]{"<sample:4>", "false"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.deser.impl.CreatorCollector", "addDelegatingCreator", "com.fasterxml.jackson.databind.introspect.AnnotatedWithParams,com.fasterxml.jackson.databind.deser.CreatorProperty[]", "<sample:3>", "<sample:1>"}, {"com.fasterxml.jackson.databind.deser.impl.CreatorCollector", "addLongCreator", "com.fasterxml.jackson.databind.introspect.AnnotatedWithParams,boolean", "<sample:7>", "true"}, {"com.fasterxml.jackson.databind.deser.impl.CreatorCollector", "addIntCreator", "com.fasterxml.jackson.databind.introspect.AnnotatedWithParams", "<null>"}}, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput044() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.impl.CreatorCollector", "com.fasterxml.jackson.databind.deser.impl.CreatorCollector", "addPropertyCreator", new String[]{"com.fasterxml.jackson.databind.introspect.AnnotatedWithParams", "com.fasterxml.jackson.databind.deser.CreatorProperty[]"}, new String[]{"<sample:5>", "<sample:0>"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.deser.impl.CreatorCollector", "verifyNonDup", "com.fasterxml.jackson.databind.introspect.AnnotatedWithParams,int,boolean", "<sample:4>", "1", "false"}}, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput045() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.impl.CreatorCollector", "com.fasterxml.jackson.databind.deser.impl.CreatorCollector", "hasPropertyBasedCreator", new String[]{}, new String[]{}, false, 2, new String[][]{{"com.fasterxml.jackson.databind.deser.impl.CreatorCollector", "hasPropertyBasedCreator", ""}, {"com.fasterxml.jackson.databind.deser.impl.CreatorCollector", "addStringCreator", "com.fasterxml.jackson.databind.introspect.AnnotatedWithParams,boolean", "<sample:0>", "false"}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{hasDefaultCreator=false, hasDelegatingCreator=false, hasPropertyBasedCreator=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput046() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.impl.CreatorCollector", "com.fasterxml.jackson.databind.deser.impl.CreatorCollector", "addIncompeteParameter", new String[]{"com.fasterxml.jackson.databind.introspect.AnnotatedParameter"}, new String[]{"<sample:0>"}, false, 6, new String[][]{{"com.fasterxml.jackson.databind.deser.impl.CreatorCollector", "addBooleanCreator", "com.fasterxml.jackson.databind.introspect.AnnotatedWithParams", "<sample:2>"}, {"com.fasterxml.jackson.databind.deser.impl.CreatorCollector", "addPropertyCreator", "com.fasterxml.jackson.databind.introspect.AnnotatedWithParams,com.fasterxml.jackson.databind.deser.CreatorProperty[]", "<sample:7>", "<sample:1>"}}, 3);
  assertNull(actual);
  assertEquals("receiver state after the call", "{hasDefaultCreator=false, hasDelegatingCreator=false, hasPropertyBasedCreator=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput047() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.impl.CreatorCollector", "com.fasterxml.jackson.databind.deser.impl.CreatorCollector", "addStringCreator", new String[]{"com.fasterxml.jackson.databind.introspect.AnnotatedWithParams", "boolean"}, new String[]{"<sample:3>", "true"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.deser.impl.CreatorCollector", "addIntCreator", "com.fasterxml.jackson.databind.introspect.AnnotatedWithParams", "<sample:7>"}}, 2);
  assertNull(actual);
  assertEquals("receiver state after the call", "{hasDefaultCreator=false, hasDelegatingCreator=false, hasPropertyBasedCreator=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput048() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.impl.CreatorCollector", "com.fasterxml.jackson.databind.deser.impl.CreatorCollector", "addLongCreator", new String[]{"com.fasterxml.jackson.databind.introspect.AnnotatedWithParams", "boolean"}, new String[]{"<sample:3>", "false"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.deser.impl.CreatorCollector", "addBooleanCreator", "com.fasterxml.jackson.databind.introspect.AnnotatedWithParams", "<null>"}}, 2);
  assertNull(actual);
  assertEquals("receiver state after the call", "{hasDefaultCreator=false, hasDelegatingCreator=false, hasPropertyBasedCreator=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput049() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.impl.CreatorCollector", "com.fasterxml.jackson.databind.deser.impl.CreatorCollector", "addLongCreator", new String[]{"com.fasterxml.jackson.databind.introspect.AnnotatedWithParams", "boolean"}, new String[]{"<sample:4>", "true"}, false, 0, null, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput050() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.impl.CreatorCollector", "com.fasterxml.jackson.databind.deser.impl.CreatorCollector", "addBooleanCreator", new String[]{"com.fasterxml.jackson.databind.introspect.AnnotatedWithParams", "boolean"}, new String[]{"<sample:6>", "false"}, false, 3, new String[][]{{"com.fasterxml.jackson.databind.deser.impl.CreatorCollector", "addDelegatingCreator", "com.fasterxml.jackson.databind.introspect.AnnotatedWithParams,com.fasterxml.jackson.databind.deser.CreatorProperty[]", "<sample:7>", "<empty>"}}, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput051() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.impl.CreatorCollector", "com.fasterxml.jackson.databind.deser.impl.CreatorCollector", "addBooleanCreator", new String[]{"com.fasterxml.jackson.databind.introspect.AnnotatedWithParams", "boolean"}, new String[]{"<sample:7>", "false"}, false, 3, new String[][]{}, 1);
  assertNull(actual);
  assertEquals("receiver state after the call", "{hasDefaultCreator=false, hasDelegatingCreator=false, hasPropertyBasedCreator=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput052() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.impl.CreatorCollector", "com.fasterxml.jackson.databind.deser.impl.CreatorCollector", "addIntCreator", new String[]{"com.fasterxml.jackson.databind.introspect.AnnotatedWithParams", "boolean"}, new String[]{"<sample:6>", "true"}, false, 0, null, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput053() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.impl.CreatorCollector", "com.fasterxml.jackson.databind.deser.impl.CreatorCollector", "verifyNonDup", new String[]{"com.fasterxml.jackson.databind.introspect.AnnotatedWithParams", "int", "boolean"}, new String[]{"<sample:8>", "248", "true"}, false, 5, new String[][]{{"com.fasterxml.jackson.databind.deser.impl.CreatorCollector", "hasDelegatingCreator", ""}}, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.ArrayIndexOutOfBoundsException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput054() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.impl.CreatorCollector", "com.fasterxml.jackson.databind.deser.impl.CreatorCollector", "addLongCreator", new String[]{"com.fasterxml.jackson.databind.introspect.AnnotatedWithParams", "boolean"}, new String[]{"<sample:5>", "false"}, false, 15, new String[][]{{"com.fasterxml.jackson.databind.deser.impl.CreatorCollector", "addLongCreator", "com.fasterxml.jackson.databind.introspect.AnnotatedWithParams", "<sample:3>"}}, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput055() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.impl.CreatorCollector", "com.fasterxml.jackson.databind.deser.impl.CreatorCollector", "addStringCreator", new String[]{"com.fasterxml.jackson.databind.introspect.AnnotatedWithParams"}, new String[]{"<sample:7>"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.deser.impl.CreatorCollector", "setDefaultCreator", "com.fasterxml.jackson.databind.introspect.AnnotatedWithParams", "<sample:3>"}}, 2);
  assertNull(actual);
  assertEquals("receiver state after the call", "{hasDefaultCreator=true, hasDelegatingCreator=false, hasPropertyBasedCreator=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput056() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.impl.CreatorCollector", "com.fasterxml.jackson.databind.deser.impl.CreatorCollector", "addStringCreator", new String[]{"com.fasterxml.jackson.databind.introspect.AnnotatedWithParams"}, new String[]{"<sample:6>"}, false, 13, new String[][]{{"com.fasterxml.jackson.databind.deser.impl.CreatorCollector", "setDefaultCreator", "com.fasterxml.jackson.databind.introspect.AnnotatedWithParams", "<sample:3>"}}, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput057() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.impl.CreatorCollector", "com.fasterxml.jackson.databind.deser.impl.CreatorCollector", "addStringCreator", new String[]{"com.fasterxml.jackson.databind.introspect.AnnotatedWithParams"}, new String[]{"<sample:8>"}, false, 13, new String[][]{}, 2);
  assertNull(actual);
  assertEquals("receiver state after the call", "{hasDefaultCreator=false, hasDelegatingCreator=false, hasPropertyBasedCreator=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput058() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.impl.CreatorCollector", "com.fasterxml.jackson.databind.deser.impl.CreatorCollector", "setDefaultCreator", new String[]{"com.fasterxml.jackson.databind.introspect.AnnotatedWithParams"}, new String[]{"<sample:3>"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.deser.impl.CreatorCollector", "hasDelegatingCreator", ""}, {"com.fasterxml.jackson.databind.deser.impl.CreatorCollector", "addIntCreator", "com.fasterxml.jackson.databind.introspect.AnnotatedWithParams", "<sample:0>"}}, 3);
  assertNull(actual);
  assertEquals("receiver state after the call", "{hasDefaultCreator=true, hasDelegatingCreator=false, hasPropertyBasedCreator=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput059() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.impl.CreatorCollector", "com.fasterxml.jackson.databind.deser.impl.CreatorCollector", "setDefaultCreator", new String[]{"com.fasterxml.jackson.databind.introspect.AnnotatedWithParams"}, new String[]{"<null>"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.deser.impl.CreatorCollector", "hasDelegatingCreator", ""}, {"com.fasterxml.jackson.databind.deser.impl.CreatorCollector", "addIntCreator", "com.fasterxml.jackson.databind.introspect.AnnotatedWithParams", "<sample:0>"}}, 3);
  assertNull(actual);
  assertEquals("receiver state after the call", "{hasDefaultCreator=false, hasDelegatingCreator=false, hasPropertyBasedCreator=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput060() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.impl.CreatorCollector", "com.fasterxml.jackson.databind.deser.impl.CreatorCollector", "addDoubleCreator", new String[]{"com.fasterxml.jackson.databind.introspect.AnnotatedWithParams"}, new String[]{"<sample:4>"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.deser.impl.CreatorCollector", "setDefaultCreator", "com.fasterxml.jackson.databind.introspect.AnnotatedWithParams", "<sample:0>"}, {"com.fasterxml.jackson.databind.deser.impl.CreatorCollector", "addIncompeteParameter", "com.fasterxml.jackson.databind.introspect.AnnotatedParameter", "<sample:1>"}}, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput061() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.impl.CreatorCollector", "com.fasterxml.jackson.databind.deser.impl.CreatorCollector", "addDoubleCreator", new String[]{"com.fasterxml.jackson.databind.introspect.AnnotatedWithParams"}, new String[]{"<sample:2>"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.deser.impl.CreatorCollector", "addIncompeteParameter", "com.fasterxml.jackson.databind.introspect.AnnotatedParameter", "<sample:1>"}, {"com.fasterxml.jackson.databind.deser.impl.CreatorCollector", "addDelegatingCreator", "com.fasterxml.jackson.databind.introspect.AnnotatedWithParams,boolean,com.fasterxml.jackson.databind.deser.SettableBeanProperty[]", "<sample:7>", "true", "<null>"}}, 3);
  assertNull(actual);
  assertEquals("receiver state after the call", "{hasDefaultCreator=false, hasDelegatingCreator=true, hasPropertyBasedCreator=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput062() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.impl.CreatorCollector", "com.fasterxml.jackson.databind.deser.impl.CreatorCollector", "addPropertyCreator", new String[]{"com.fasterxml.jackson.databind.introspect.AnnotatedWithParams", "com.fasterxml.jackson.databind.deser.CreatorProperty[]"}, new String[]{"<sample:3>", "<sample:2>"}, false, 0, null, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput063() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.impl.CreatorCollector", "com.fasterxml.jackson.databind.deser.impl.CreatorCollector", "addDoubleCreator", new String[]{"com.fasterxml.jackson.databind.introspect.AnnotatedWithParams"}, new String[]{"<sample:7>"}, false, 3, new String[][]{{"com.fasterxml.jackson.databind.deser.impl.CreatorCollector", "addDoubleCreator", "com.fasterxml.jackson.databind.introspect.AnnotatedWithParams,boolean", "<sample:1>", "false"}, {"com.fasterxml.jackson.databind.deser.impl.CreatorCollector", "addDelegatingCreator", "com.fasterxml.jackson.databind.introspect.AnnotatedWithParams,com.fasterxml.jackson.databind.deser.CreatorProperty[]", "<sample:7>", "<sample:4>"}, {"com.fasterxml.jackson.databind.deser.impl.CreatorCollector", "addPropertyCreator", "com.fasterxml.jackson.databind.introspect.AnnotatedWithParams,com.fasterxml.jackson.databind.deser.CreatorProperty[]", "<sample:9>", "<sample:1>"}}, 2);
  assertNull(actual);
  assertEquals("receiver state after the call", "{hasDefaultCreator=false, hasDelegatingCreator=true, hasPropertyBasedCreator=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput064() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.impl.CreatorCollector", "com.fasterxml.jackson.databind.deser.impl.CreatorCollector", "addDoubleCreator", new String[]{"com.fasterxml.jackson.databind.introspect.AnnotatedWithParams"}, new String[]{"<sample:5>"}, false, 3, new String[][]{{"com.fasterxml.jackson.databind.deser.impl.CreatorCollector", "addDoubleCreator", "com.fasterxml.jackson.databind.introspect.AnnotatedWithParams,boolean", "<sample:1>", "false"}, {"com.fasterxml.jackson.databind.deser.impl.CreatorCollector", "addDelegatingCreator", "com.fasterxml.jackson.databind.introspect.AnnotatedWithParams,com.fasterxml.jackson.databind.deser.CreatorProperty[]", "<sample:7>", "<sample:4>"}, {"com.fasterxml.jackson.databind.deser.impl.CreatorCollector", "addPropertyCreator", "com.fasterxml.jackson.databind.introspect.AnnotatedWithParams,com.fasterxml.jackson.databind.deser.CreatorProperty[]", "<sample:9>", "<sample:1>"}}, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput065() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.impl.CreatorCollector", "com.fasterxml.jackson.databind.deser.impl.CreatorCollector", "hasDefaultCreator", new String[]{}, new String[]{}, false, 6, new String[][]{{"com.fasterxml.jackson.databind.deser.impl.CreatorCollector", "addLongCreator", "com.fasterxml.jackson.databind.introspect.AnnotatedWithParams,boolean", "<sample:5>", "false"}, {"com.fasterxml.jackson.databind.deser.impl.CreatorCollector", "addDelegatingCreator", "com.fasterxml.jackson.databind.introspect.AnnotatedWithParams,com.fasterxml.jackson.databind.deser.CreatorProperty[]", "<null>", "<sample:0>"}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{hasDefaultCreator=false, hasDelegatingCreator=false, hasPropertyBasedCreator=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput066() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.impl.CreatorCollector", "com.fasterxml.jackson.databind.deser.impl.CreatorCollector", "verifyNonDup", new String[]{"com.fasterxml.jackson.databind.introspect.AnnotatedWithParams", "int", "boolean"}, new String[]{"<sample:3>", "10", "false"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.deser.impl.CreatorCollector", "addDelegatingCreator", "com.fasterxml.jackson.databind.introspect.AnnotatedWithParams,boolean,com.fasterxml.jackson.databind.deser.SettableBeanProperty[]", "<null>", "false", "<null>"}}, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.ArrayIndexOutOfBoundsException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput067() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.impl.CreatorCollector", "com.fasterxml.jackson.databind.deser.impl.CreatorCollector", "addDoubleCreator", new String[]{"com.fasterxml.jackson.databind.introspect.AnnotatedWithParams"}, new String[]{"<sample:3>"}, false, 0, null, 2);
  assertNull(actual);
  assertEquals("receiver state after the call", "{hasDefaultCreator=false, hasDelegatingCreator=false, hasPropertyBasedCreator=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput068() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.impl.CreatorCollector", "com.fasterxml.jackson.databind.deser.impl.CreatorCollector", "verifyNonDup", new String[]{"com.fasterxml.jackson.databind.introspect.AnnotatedWithParams", "int", "boolean"}, new String[]{"<sample:3>", "-28", "false"}, false, 5, new String[][]{{"com.fasterxml.jackson.databind.deser.impl.CreatorCollector", "constructValueInstantiator", "com.fasterxml.jackson.databind.DeserializationConfig", "<sample:7>"}}, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.ArrayIndexOutOfBoundsException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput069() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.impl.CreatorCollector", "com.fasterxml.jackson.databind.deser.impl.CreatorCollector", "addBooleanCreator", new String[]{"com.fasterxml.jackson.databind.introspect.AnnotatedWithParams", "boolean"}, new String[]{"<sample:3>", "false"}, false, 13, new String[][]{{"com.fasterxml.jackson.databind.deser.impl.CreatorCollector", "addLongCreator", "com.fasterxml.jackson.databind.introspect.AnnotatedWithParams,boolean", "<sample:2>", "false"}}, 2);
  assertNull(actual);
  assertEquals("receiver state after the call", "{hasDefaultCreator=false, hasDelegatingCreator=false, hasPropertyBasedCreator=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput070() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.impl.CreatorCollector", "com.fasterxml.jackson.databind.deser.impl.CreatorCollector", "addBooleanCreator", new String[]{"com.fasterxml.jackson.databind.introspect.AnnotatedWithParams", "boolean"}, new String[]{"<sample:3>", "false"}, false, 13, new String[][]{{"com.fasterxml.jackson.databind.deser.impl.CreatorCollector", "addLongCreator", "com.fasterxml.jackson.databind.introspect.AnnotatedWithParams,boolean", "<sample:2>", "false"}, {"com.fasterxml.jackson.databind.deser.impl.CreatorCollector", "setDefaultCreator", "com.fasterxml.jackson.databind.introspect.AnnotatedWithParams", "<sample:7>"}}, 2);
  assertNull(actual);
  assertEquals("receiver state after the call", "{hasDefaultCreator=true, hasDelegatingCreator=false, hasPropertyBasedCreator=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput071() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.impl.CreatorCollector", "com.fasterxml.jackson.databind.deser.impl.CreatorCollector", "addStringCreator", new String[]{"com.fasterxml.jackson.databind.introspect.AnnotatedWithParams", "boolean"}, new String[]{"<sample:3>", "false"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.deser.impl.CreatorCollector", "addDelegatingCreator", "com.fasterxml.jackson.databind.introspect.AnnotatedWithParams,com.fasterxml.jackson.databind.deser.CreatorProperty[]", "<sample:11>", "<sample:2>"}}, 2);
  assertNull(actual);
  assertEquals("receiver state after the call", "{hasDefaultCreator=false, hasDelegatingCreator=true, hasPropertyBasedCreator=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput072() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.impl.CreatorCollector", "com.fasterxml.jackson.databind.deser.impl.CreatorCollector", "addIntCreator", new String[]{"com.fasterxml.jackson.databind.introspect.AnnotatedWithParams", "boolean"}, new String[]{"<sample:4>", "true"}, false, 0, null, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput073() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.impl.CreatorCollector", "com.fasterxml.jackson.databind.deser.impl.CreatorCollector", "addIntCreator", new String[]{"com.fasterxml.jackson.databind.introspect.AnnotatedWithParams", "boolean"}, new String[]{"<sample:3>", "false"}, false, 0, null, 1);
  assertNull(actual);
  assertEquals("receiver state after the call", "{hasDefaultCreator=false, hasDelegatingCreator=false, hasPropertyBasedCreator=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput074() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.impl.CreatorCollector", "com.fasterxml.jackson.databind.deser.impl.CreatorCollector", "verifyNonDup", new String[]{"com.fasterxml.jackson.databind.introspect.AnnotatedWithParams", "int", "boolean"}, new String[]{"<sample:12>", "0", "false"}, false, 4, new String[][]{{"com.fasterxml.jackson.databind.deser.impl.CreatorCollector", "addDoubleCreator", "com.fasterxml.jackson.databind.introspect.AnnotatedWithParams,boolean", "<sample:7>", "false"}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
  assertEquals("receiver state after the call", "{hasDefaultCreator=false, hasDelegatingCreator=false, hasPropertyBasedCreator=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput075() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.impl.CreatorCollector", "com.fasterxml.jackson.databind.deser.impl.CreatorCollector", "addDelegatingCreator", new String[]{"com.fasterxml.jackson.databind.introspect.AnnotatedWithParams", "com.fasterxml.jackson.databind.deser.CreatorProperty[]"}, new String[]{"<sample:2>", "<sample:2>"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.deser.impl.CreatorCollector", "addIntCreator", "com.fasterxml.jackson.databind.introspect.AnnotatedWithParams", "<sample:6>"}}, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.reflect.GenericSignatureFormatError", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput076() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.impl.CreatorCollector", "com.fasterxml.jackson.databind.deser.impl.CreatorCollector", "addDelegatingCreator", new String[]{"com.fasterxml.jackson.databind.introspect.AnnotatedWithParams", "com.fasterxml.jackson.databind.deser.CreatorProperty[]"}, new String[]{"<sample:3>", "<empty>"}, false, 0, null, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput077() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.impl.CreatorCollector", "com.fasterxml.jackson.databind.deser.impl.CreatorCollector", "addDelegatingCreator", new String[]{"com.fasterxml.jackson.databind.introspect.AnnotatedWithParams", "com.fasterxml.jackson.databind.deser.CreatorProperty[]"}, new String[]{"<sample:7>", "<empty>"}, false, 0, null, 3);
  assertNull(actual);
  assertEquals("receiver state after the call", "{hasDefaultCreator=false, hasDelegatingCreator=true, hasPropertyBasedCreator=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput078() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.impl.CreatorCollector", "com.fasterxml.jackson.databind.deser.impl.CreatorCollector", "addDoubleCreator", new String[]{"com.fasterxml.jackson.databind.introspect.AnnotatedWithParams", "boolean"}, new String[]{"<sample:0>", "true"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.deser.impl.CreatorCollector", "constructValueInstantiator", "com.fasterxml.jackson.databind.DeserializationConfig", "<sample:6>"}}, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput079() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.impl.CreatorCollector", "com.fasterxml.jackson.databind.deser.impl.CreatorCollector", "addDoubleCreator", new String[]{"com.fasterxml.jackson.databind.introspect.AnnotatedWithParams", "boolean"}, new String[]{"<sample:3>", "false"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.deser.impl.CreatorCollector", "verifyNonDup", "com.fasterxml.jackson.databind.introspect.AnnotatedWithParams,int,boolean", "<sample:10>", "2147483647", "false"}}, 2);
  assertNull(actual);
  assertEquals("receiver state after the call", "{hasDefaultCreator=false, hasDelegatingCreator=false, hasPropertyBasedCreator=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput080() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.impl.CreatorCollector", "com.fasterxml.jackson.databind.deser.impl.CreatorCollector", "addPropertyCreator", new String[]{"com.fasterxml.jackson.databind.introspect.AnnotatedWithParams", "com.fasterxml.jackson.databind.deser.CreatorProperty[]"}, new String[]{"<sample:14>", "<sample:1>"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.deser.impl.CreatorCollector", "addLongCreator", "com.fasterxml.jackson.databind.introspect.AnnotatedWithParams,boolean", "<sample:6>", "true"}}, 2);
  assertNull(actual);
  assertEquals("receiver state after the call", "{hasDefaultCreator=false, hasDelegatingCreator=false, hasPropertyBasedCreator=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput081() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.impl.CreatorCollector", "com.fasterxml.jackson.databind.deser.impl.CreatorCollector", "addPropertyCreator", new String[]{"com.fasterxml.jackson.databind.introspect.AnnotatedWithParams", "boolean", "com.fasterxml.jackson.databind.deser.SettableBeanProperty[]"}, new String[]{"<sample:11>", "false", "<sample:1>"}, false, 6, new String[][]{{"com.fasterxml.jackson.databind.deser.impl.CreatorCollector", "addStringCreator", "com.fasterxml.jackson.databind.introspect.AnnotatedWithParams,boolean", "<sample:2>", "false"}, {"com.fasterxml.jackson.databind.deser.impl.CreatorCollector", "addDoubleCreator", "com.fasterxml.jackson.databind.introspect.AnnotatedWithParams", "<sample:3>"}}, 3);
  assertNull(actual);
  assertEquals("receiver state after the call", "{hasDefaultCreator=false, hasDelegatingCreator=false, hasPropertyBasedCreator=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput082() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.impl.CreatorCollector", "com.fasterxml.jackson.databind.deser.impl.CreatorCollector", "addPropertyCreator", new String[]{"com.fasterxml.jackson.databind.introspect.AnnotatedWithParams", "boolean", "com.fasterxml.jackson.databind.deser.SettableBeanProperty[]"}, new String[]{"<sample:2>", "false", "<sample:0>"}, false, 11, new String[][]{}, 1);
  assertNull(actual);
  assertEquals("receiver state after the call", "{hasDefaultCreator=false, hasDelegatingCreator=false, hasPropertyBasedCreator=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput083() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.impl.CreatorCollector", "com.fasterxml.jackson.databind.deser.impl.CreatorCollector", "addPropertyCreator", new String[]{"com.fasterxml.jackson.databind.introspect.AnnotatedWithParams", "boolean", "com.fasterxml.jackson.databind.deser.SettableBeanProperty[]"}, new String[]{"<sample:5>", "false", "<sample:0>"}, false, 11, new String[][]{}, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput084() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.impl.CreatorCollector", "com.fasterxml.jackson.databind.deser.impl.CreatorCollector", "addStringCreator", new String[]{"com.fasterxml.jackson.databind.introspect.AnnotatedWithParams", "boolean"}, new String[]{"<sample:0>", "true"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.deser.impl.CreatorCollector", "addDoubleCreator", "com.fasterxml.jackson.databind.introspect.AnnotatedWithParams,boolean", "<sample:7>", "true"}, {"com.fasterxml.jackson.databind.deser.impl.CreatorCollector", "addPropertyCreator", "com.fasterxml.jackson.databind.introspect.AnnotatedWithParams,boolean,com.fasterxml.jackson.databind.deser.SettableBeanProperty[]", "<sample:3>", "true", "<null>"}, {"com.fasterxml.jackson.databind.deser.impl.CreatorCollector", "addStringCreator", "com.fasterxml.jackson.databind.introspect.AnnotatedWithParams", "<sample:6>"}}, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput085() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.impl.CreatorCollector", "com.fasterxml.jackson.databind.deser.impl.CreatorCollector", "addStringCreator", new String[]{"com.fasterxml.jackson.databind.introspect.AnnotatedWithParams", "boolean"}, new String[]{"<null>", "true"}, false, 12, new String[][]{{"com.fasterxml.jackson.databind.deser.impl.CreatorCollector", "addDoubleCreator", "com.fasterxml.jackson.databind.introspect.AnnotatedWithParams,boolean", "<sample:7>", "true"}, {"com.fasterxml.jackson.databind.deser.impl.CreatorCollector", "addPropertyCreator", "com.fasterxml.jackson.databind.introspect.AnnotatedWithParams,boolean,com.fasterxml.jackson.databind.deser.SettableBeanProperty[]", "<sample:3>", "true", "<null>"}}, 1);
  assertNull(actual);
  assertEquals("receiver state after the call", "{hasDefaultCreator=false, hasDelegatingCreator=false, hasPropertyBasedCreator=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput086() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.impl.CreatorCollector", "com.fasterxml.jackson.databind.deser.impl.CreatorCollector", "addStringCreator", new String[]{"com.fasterxml.jackson.databind.introspect.AnnotatedWithParams", "boolean"}, new String[]{"<null>", "false"}, false, 12, new String[][]{{"com.fasterxml.jackson.databind.deser.impl.CreatorCollector", "addDoubleCreator", "com.fasterxml.jackson.databind.introspect.AnnotatedWithParams,boolean", "<sample:7>", "true"}}, 1);
  assertNull(actual);
  assertEquals("receiver state after the call", "{hasDefaultCreator=false, hasDelegatingCreator=false, hasPropertyBasedCreator=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput087() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.impl.CreatorCollector", "com.fasterxml.jackson.databind.deser.impl.CreatorCollector", "addDelegatingCreator", new String[]{"com.fasterxml.jackson.databind.introspect.AnnotatedWithParams", "com.fasterxml.jackson.databind.deser.CreatorProperty[]"}, new String[]{"<sample:2>", "<empty>"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.deser.impl.CreatorCollector", "addPropertyCreator", "com.fasterxml.jackson.databind.introspect.AnnotatedWithParams,com.fasterxml.jackson.databind.deser.CreatorProperty[]", "<null>", "<null>"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.reflect.GenericSignatureFormatError", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput088() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.impl.CreatorCollector", "com.fasterxml.jackson.databind.deser.impl.CreatorCollector", "addDelegatingCreator", new String[]{"com.fasterxml.jackson.databind.introspect.AnnotatedWithParams", "com.fasterxml.jackson.databind.deser.CreatorProperty[]"}, new String[]{"<sample:2>", "<empty>"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.deser.impl.CreatorCollector", "addPropertyCreator", "com.fasterxml.jackson.databind.introspect.AnnotatedWithParams,com.fasterxml.jackson.databind.deser.CreatorProperty[]", "<null>", "<sample:1>"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.reflect.GenericSignatureFormatError", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput089() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.impl.CreatorCollector", "com.fasterxml.jackson.databind.deser.impl.CreatorCollector", "addDelegatingCreator", new String[]{"com.fasterxml.jackson.databind.introspect.AnnotatedWithParams", "com.fasterxml.jackson.databind.deser.CreatorProperty[]"}, new String[]{"<sample:2>", "<empty>"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.deser.impl.CreatorCollector", "addPropertyCreator", "com.fasterxml.jackson.databind.introspect.AnnotatedWithParams,com.fasterxml.jackson.databind.deser.CreatorProperty[]", "<sample:1>", "<sample:1>"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.reflect.GenericSignatureFormatError", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput090() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.impl.CreatorCollector", "com.fasterxml.jackson.databind.deser.impl.CreatorCollector", "addDelegatingCreator", new String[]{"com.fasterxml.jackson.databind.introspect.AnnotatedWithParams", "com.fasterxml.jackson.databind.deser.CreatorProperty[]"}, new String[]{"<sample:2>", "<empty>"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.deser.impl.CreatorCollector", "addPropertyCreator", "com.fasterxml.jackson.databind.introspect.AnnotatedWithParams,com.fasterxml.jackson.databind.deser.CreatorProperty[]", "<null>", "<sample:1>"}, {"com.fasterxml.jackson.databind.deser.impl.CreatorCollector", "addStringCreator", "com.fasterxml.jackson.databind.introspect.AnnotatedWithParams,boolean", "<sample:1>", "true"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.reflect.GenericSignatureFormatError", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput091() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.impl.CreatorCollector", "com.fasterxml.jackson.databind.deser.impl.CreatorCollector", "addDelegatingCreator", new String[]{"com.fasterxml.jackson.databind.introspect.AnnotatedWithParams", "com.fasterxml.jackson.databind.deser.CreatorProperty[]"}, new String[]{"<sample:2>", "<empty>"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.deser.impl.CreatorCollector", "addPropertyCreator", "com.fasterxml.jackson.databind.introspect.AnnotatedWithParams,com.fasterxml.jackson.databind.deser.CreatorProperty[]", "<null>", "<sample:1>"}, {"com.fasterxml.jackson.databind.deser.impl.CreatorCollector", "addIncompeteParameter", "com.fasterxml.jackson.databind.introspect.AnnotatedParameter", "<sample:2>"}, {"com.fasterxml.jackson.databind.deser.impl.CreatorCollector", "addStringCreator", "com.fasterxml.jackson.databind.introspect.AnnotatedWithParams,boolean", "<sample:0>", "true"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.reflect.GenericSignatureFormatError", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput092() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.impl.CreatorCollector", "com.fasterxml.jackson.databind.deser.impl.CreatorCollector", "addDelegatingCreator", new String[]{"com.fasterxml.jackson.databind.introspect.AnnotatedWithParams", "com.fasterxml.jackson.databind.deser.CreatorProperty[]"}, new String[]{"<sample:7>", "<empty>"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.deser.impl.CreatorCollector", "addPropertyCreator", "com.fasterxml.jackson.databind.introspect.AnnotatedWithParams,com.fasterxml.jackson.databind.deser.CreatorProperty[]", "<null>", "<sample:1>"}, {"com.fasterxml.jackson.databind.deser.impl.CreatorCollector", "addIncompeteParameter", "com.fasterxml.jackson.databind.introspect.AnnotatedParameter", "<sample:2>"}, {"com.fasterxml.jackson.databind.deser.impl.CreatorCollector", "addStringCreator", "com.fasterxml.jackson.databind.introspect.AnnotatedWithParams,boolean", "<sample:0>", "false"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{hasDefaultCreator=false, hasDelegatingCreator=true, hasPropertyBasedCreator=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput093() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.impl.CreatorCollector", "com.fasterxml.jackson.databind.deser.impl.CreatorCollector", "addDelegatingCreator", new String[]{"com.fasterxml.jackson.databind.introspect.AnnotatedWithParams", "com.fasterxml.jackson.databind.deser.CreatorProperty[]"}, new String[]{"<sample:7>", "<empty>"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.deser.impl.CreatorCollector", "addPropertyCreator", "com.fasterxml.jackson.databind.introspect.AnnotatedWithParams,com.fasterxml.jackson.databind.deser.CreatorProperty[]", "<sample:2>", "<sample:1>"}, {"com.fasterxml.jackson.databind.deser.impl.CreatorCollector", "addIncompeteParameter", "com.fasterxml.jackson.databind.introspect.AnnotatedParameter", "<sample:2>"}, {"com.fasterxml.jackson.databind.deser.impl.CreatorCollector", "addStringCreator", "com.fasterxml.jackson.databind.introspect.AnnotatedWithParams,boolean", "<sample:0>", "false"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{hasDefaultCreator=false, hasDelegatingCreator=true, hasPropertyBasedCreator=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput094() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.impl.CreatorCollector", "com.fasterxml.jackson.databind.deser.impl.CreatorCollector", "addDelegatingCreator", new String[]{"com.fasterxml.jackson.databind.introspect.AnnotatedWithParams", "com.fasterxml.jackson.databind.deser.CreatorProperty[]"}, new String[]{"<sample:9>", "<empty>"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.deser.impl.CreatorCollector", "addPropertyCreator", "com.fasterxml.jackson.databind.introspect.AnnotatedWithParams,com.fasterxml.jackson.databind.deser.CreatorProperty[]", "<sample:2>", "<sample:1>"}, {"com.fasterxml.jackson.databind.deser.impl.CreatorCollector", "addIncompeteParameter", "com.fasterxml.jackson.databind.introspect.AnnotatedParameter", "<sample:2>"}, {"com.fasterxml.jackson.databind.deser.impl.CreatorCollector", "addStringCreator", "com.fasterxml.jackson.databind.introspect.AnnotatedWithParams,boolean", "<sample:0>", "false"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput095() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.impl.CreatorCollector", "com.fasterxml.jackson.databind.deser.impl.CreatorCollector", "addDelegatingCreator", new String[]{"com.fasterxml.jackson.databind.introspect.AnnotatedWithParams", "com.fasterxml.jackson.databind.deser.CreatorProperty[]"}, new String[]{"<sample:7>", "<empty>"}, false, 3, new String[][]{{"com.fasterxml.jackson.databind.deser.impl.CreatorCollector", "addPropertyCreator", "com.fasterxml.jackson.databind.introspect.AnnotatedWithParams,com.fasterxml.jackson.databind.deser.CreatorProperty[]", "<sample:2>", "<sample:1>"}, {"com.fasterxml.jackson.databind.deser.impl.CreatorCollector", "addIncompeteParameter", "com.fasterxml.jackson.databind.introspect.AnnotatedParameter", "<sample:2>"}, {"com.fasterxml.jackson.databind.deser.impl.CreatorCollector", "addStringCreator", "com.fasterxml.jackson.databind.introspect.AnnotatedWithParams,boolean", "<sample:3>", "false"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{hasDefaultCreator=false, hasDelegatingCreator=true, hasPropertyBasedCreator=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput096() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.impl.CreatorCollector", "com.fasterxml.jackson.databind.deser.impl.CreatorCollector", "addPropertyCreator", new String[]{"com.fasterxml.jackson.databind.introspect.AnnotatedWithParams", "boolean", "com.fasterxml.jackson.databind.deser.SettableBeanProperty[]"}, new String[]{"<sample:6>", "true", "<empty>"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.deser.impl.CreatorCollector", "addDoubleCreator", "com.fasterxml.jackson.databind.introspect.AnnotatedWithParams", "<sample:1>"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput097() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.impl.CreatorCollector", "com.fasterxml.jackson.databind.deser.impl.CreatorCollector", "addDelegatingCreator", new String[]{"com.fasterxml.jackson.databind.introspect.AnnotatedWithParams", "com.fasterxml.jackson.databind.deser.CreatorProperty[]"}, new String[]{"<sample:6>", "<null>"}, false, 7, new String[][]{{"com.fasterxml.jackson.databind.deser.impl.CreatorCollector", "addPropertyCreator", "com.fasterxml.jackson.databind.introspect.AnnotatedWithParams,com.fasterxml.jackson.databind.deser.CreatorProperty[]", "<sample:2>", "<sample:1>"}, {"com.fasterxml.jackson.databind.deser.impl.CreatorCollector", "hasDelegatingCreator", ""}, {"com.fasterxml.jackson.databind.deser.impl.CreatorCollector", "addIncompeteParameter", "com.fasterxml.jackson.databind.introspect.AnnotatedParameter", "<sample:5>"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput098() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.impl.CreatorCollector", "com.fasterxml.jackson.databind.deser.impl.CreatorCollector", "addIntCreator", new String[]{"com.fasterxml.jackson.databind.introspect.AnnotatedWithParams", "boolean"}, new String[]{"<sample:4>", "false"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.deser.impl.CreatorCollector", "addPropertyCreator", "com.fasterxml.jackson.databind.introspect.AnnotatedWithParams,boolean,com.fasterxml.jackson.databind.deser.SettableBeanProperty[]", "<sample:0>", "false", "<sample:2>"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput099() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.impl.CreatorCollector", "com.fasterxml.jackson.databind.deser.impl.CreatorCollector", "addDelegatingCreator", new String[]{"com.fasterxml.jackson.databind.introspect.AnnotatedWithParams", "com.fasterxml.jackson.databind.deser.CreatorProperty[]"}, new String[]{"<sample:3>", "<sample:1>"}, false, 7, new String[][]{{"com.fasterxml.jackson.databind.deser.impl.CreatorCollector", "addPropertyCreator", "com.fasterxml.jackson.databind.introspect.AnnotatedWithParams,com.fasterxml.jackson.databind.deser.CreatorProperty[]", "<sample:2>", "<sample:1>"}, {"com.fasterxml.jackson.databind.deser.impl.CreatorCollector", "addIncompeteParameter", "com.fasterxml.jackson.databind.introspect.AnnotatedParameter", "<sample:1>"}, {"com.fasterxml.jackson.databind.deser.impl.CreatorCollector", "hasDelegatingCreator", ""}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{hasDefaultCreator=false, hasDelegatingCreator=false, hasPropertyBasedCreator=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput100() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.impl.CreatorCollector", "com.fasterxml.jackson.databind.deser.impl.CreatorCollector", "addDelegatingCreator", new String[]{"com.fasterxml.jackson.databind.introspect.AnnotatedWithParams", "com.fasterxml.jackson.databind.deser.CreatorProperty[]"}, new String[]{"<sample:3>", "<sample:1>"}, false, 7, new String[][]{{"com.fasterxml.jackson.databind.deser.impl.CreatorCollector", "addIncompeteParameter", "com.fasterxml.jackson.databind.introspect.AnnotatedParameter", "<sample:1>"}, {"com.fasterxml.jackson.databind.deser.impl.CreatorCollector", "hasDelegatingCreator", ""}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{hasDefaultCreator=false, hasDelegatingCreator=false, hasPropertyBasedCreator=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput101() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.impl.CreatorCollector", "com.fasterxml.jackson.databind.deser.impl.CreatorCollector", "hasDefaultCreator", new String[]{}, new String[]{}, false);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{hasDefaultCreator=false, hasDelegatingCreator=false, hasPropertyBasedCreator=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput102() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.impl.CreatorCollector", "com.fasterxml.jackson.databind.deser.impl.CreatorCollector", "addDoubleCreator", new String[]{"com.fasterxml.jackson.databind.introspect.AnnotatedWithParams"}, new String[]{"<sample:5>"}, false); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput103() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.impl.CreatorCollector", "com.fasterxml.jackson.databind.deser.impl.CreatorCollector", "addStringCreator", new String[]{"com.fasterxml.jackson.databind.introspect.AnnotatedWithParams", "boolean"}, new String[]{"<sample:6>", "false"}, false, 5, new String[][]{{"com.fasterxml.jackson.databind.deser.impl.CreatorCollector", "addDoubleCreator", "com.fasterxml.jackson.databind.introspect.AnnotatedWithParams", "<sample:6>"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput104() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.impl.CreatorCollector", "com.fasterxml.jackson.databind.deser.impl.CreatorCollector", "addStringCreator", new String[]{"com.fasterxml.jackson.databind.introspect.AnnotatedWithParams", "boolean"}, new String[]{"<sample:6>", "false"}, false, 5, new String[][]{{"com.fasterxml.jackson.databind.deser.impl.CreatorCollector", "addDoubleCreator", "com.fasterxml.jackson.databind.introspect.AnnotatedWithParams", "<null>"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput105() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.impl.CreatorCollector", "com.fasterxml.jackson.databind.deser.impl.CreatorCollector", "addStringCreator", new String[]{"com.fasterxml.jackson.databind.introspect.AnnotatedWithParams", "boolean"}, new String[]{"<sample:8>", "true"}, false, 5, new String[][]{{"com.fasterxml.jackson.databind.deser.impl.CreatorCollector", "addDoubleCreator", "com.fasterxml.jackson.databind.introspect.AnnotatedWithParams", "<null>"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{hasDefaultCreator=false, hasDelegatingCreator=false, hasPropertyBasedCreator=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput106() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.impl.CreatorCollector", "com.fasterxml.jackson.databind.deser.impl.CreatorCollector", "verifyNonDup", new String[]{"com.fasterxml.jackson.databind.introspect.AnnotatedWithParams", "int", "boolean"}, new String[]{"<sample:6>", "-1", "true"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.deser.impl.CreatorCollector", "addIntCreator", "com.fasterxml.jackson.databind.introspect.AnnotatedWithParams", "<sample:2>"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.ArrayIndexOutOfBoundsException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput107() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.impl.CreatorCollector", "com.fasterxml.jackson.databind.deser.impl.CreatorCollector", "addLongCreator", new String[]{"com.fasterxml.jackson.databind.introspect.AnnotatedWithParams", "boolean"}, new String[]{"<sample:0>", "true"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.deser.impl.CreatorCollector", "constructValueInstantiator", "com.fasterxml.jackson.databind.DeserializationConfig", "<sample:2>"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput108() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.impl.CreatorCollector", "com.fasterxml.jackson.databind.deser.impl.CreatorCollector", "addDoubleCreator", new String[]{"com.fasterxml.jackson.databind.introspect.AnnotatedWithParams", "boolean"}, new String[]{"<sample:0>", "true"}, false); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput109() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.impl.CreatorCollector", "com.fasterxml.jackson.databind.deser.impl.CreatorCollector", "addLongCreator", new String[]{"com.fasterxml.jackson.databind.introspect.AnnotatedWithParams", "boolean"}, new String[]{"<sample:3>", "false"}, false);
  assertNull(actual);
  assertEquals("receiver state after the call", "{hasDefaultCreator=false, hasDelegatingCreator=false, hasPropertyBasedCreator=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput110() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.impl.CreatorCollector", "com.fasterxml.jackson.databind.deser.impl.CreatorCollector", "addDoubleCreator", new String[]{"com.fasterxml.jackson.databind.introspect.AnnotatedWithParams"}, new String[]{"<null>"}, false);
  assertNull(actual);
  assertEquals("receiver state after the call", "{hasDefaultCreator=false, hasDelegatingCreator=false, hasPropertyBasedCreator=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput111() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.impl.CreatorCollector", "com.fasterxml.jackson.databind.deser.impl.CreatorCollector", "addDoubleCreator", new String[]{"com.fasterxml.jackson.databind.introspect.AnnotatedWithParams"}, new String[]{"<sample:2>"}, false, 6, new String[][]{{"com.fasterxml.jackson.databind.deser.impl.CreatorCollector", "hasDelegatingCreator", ""}, {"com.fasterxml.jackson.databind.deser.impl.CreatorCollector", "addIntCreator", "com.fasterxml.jackson.databind.introspect.AnnotatedWithParams", "<sample:2>"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput112() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.impl.CreatorCollector", "com.fasterxml.jackson.databind.deser.impl.CreatorCollector", "addBooleanCreator", new String[]{"com.fasterxml.jackson.databind.introspect.AnnotatedWithParams"}, new String[]{"<sample:6>"}, false); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput113() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.impl.CreatorCollector", "com.fasterxml.jackson.databind.deser.impl.CreatorCollector", "addStringCreator", new String[]{"com.fasterxml.jackson.databind.introspect.AnnotatedWithParams", "boolean"}, new String[]{"<sample:0>", "true"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.deser.impl.CreatorCollector", "addLongCreator", "com.fasterxml.jackson.databind.introspect.AnnotatedWithParams", "<sample:7>"}, {"com.fasterxml.jackson.databind.deser.impl.CreatorCollector", "addLongCreator", "com.fasterxml.jackson.databind.introspect.AnnotatedWithParams", "<sample:4>"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput114() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.impl.CreatorCollector", "com.fasterxml.jackson.databind.deser.impl.CreatorCollector", "addPropertyCreator", new String[]{"com.fasterxml.jackson.databind.introspect.AnnotatedWithParams", "boolean", "com.fasterxml.jackson.databind.deser.SettableBeanProperty[]"}, new String[]{"<sample:3>", "false", "<sample:0>"}, false);
  assertNull(actual);
  assertEquals("receiver state after the call", "{hasDefaultCreator=false, hasDelegatingCreator=false, hasPropertyBasedCreator=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput115() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.impl.CreatorCollector", "com.fasterxml.jackson.databind.deser.impl.CreatorCollector", "addBooleanCreator", new String[]{"com.fasterxml.jackson.databind.introspect.AnnotatedWithParams"}, new String[]{"<sample:2>"}, false);
  assertNull(actual);
  assertEquals("receiver state after the call", "{hasDefaultCreator=false, hasDelegatingCreator=false, hasPropertyBasedCreator=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput116() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.impl.CreatorCollector", "com.fasterxml.jackson.databind.deser.impl.CreatorCollector", "addBooleanCreator", new String[]{"com.fasterxml.jackson.databind.introspect.AnnotatedWithParams"}, new String[]{"<sample:0>"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.deser.impl.CreatorCollector", "addIntCreator", "com.fasterxml.jackson.databind.introspect.AnnotatedWithParams,boolean", "<sample:7>", "false"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput117() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.impl.CreatorCollector", "com.fasterxml.jackson.databind.deser.impl.CreatorCollector", "addIntCreator", new String[]{"com.fasterxml.jackson.databind.introspect.AnnotatedWithParams", "boolean"}, new String[]{"<sample:3>", "false"}, false);
  assertNull(actual);
  assertEquals("receiver state after the call", "{hasDefaultCreator=false, hasDelegatingCreator=false, hasPropertyBasedCreator=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput118() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.impl.CreatorCollector", "com.fasterxml.jackson.databind.deser.impl.CreatorCollector", "addIntCreator", new String[]{"com.fasterxml.jackson.databind.introspect.AnnotatedWithParams", "boolean"}, new String[]{"<sample:4>", "true"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.deser.impl.CreatorCollector", "addLongCreator", "com.fasterxml.jackson.databind.introspect.AnnotatedWithParams,boolean", "<sample:1>", "true"}, {"com.fasterxml.jackson.databind.deser.impl.CreatorCollector", "addIntCreator", "com.fasterxml.jackson.databind.introspect.AnnotatedWithParams,boolean", "<sample:7>", "false"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput119() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.impl.CreatorCollector", "com.fasterxml.jackson.databind.deser.impl.CreatorCollector", "setDefaultCreator", new String[]{"com.fasterxml.jackson.databind.introspect.AnnotatedWithParams"}, new String[]{"<sample:5>"}, false, 7, new String[][]{{"com.fasterxml.jackson.databind.deser.impl.CreatorCollector", "constructValueInstantiator", "com.fasterxml.jackson.databind.DeserializationConfig", "<sample:2>"}, {"com.fasterxml.jackson.databind.deser.impl.CreatorCollector", "addDelegatingCreator", "com.fasterxml.jackson.databind.introspect.AnnotatedWithParams,boolean,com.fasterxml.jackson.databind.deser.SettableBeanProperty[]", "<sample:7>", "false", "<empty>"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput120() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.impl.CreatorCollector", "com.fasterxml.jackson.databind.deser.impl.CreatorCollector", "setDefaultCreator", new String[]{"com.fasterxml.jackson.databind.introspect.AnnotatedWithParams"}, new String[]{"<sample:4>"}, false, 7, new String[][]{{"com.fasterxml.jackson.databind.deser.impl.CreatorCollector", "addDoubleCreator", "com.fasterxml.jackson.databind.introspect.AnnotatedWithParams,boolean", "<sample:2>", "true"}, {"com.fasterxml.jackson.databind.deser.impl.CreatorCollector", "constructValueInstantiator", "com.fasterxml.jackson.databind.DeserializationConfig", "<sample:1>"}, {"com.fasterxml.jackson.databind.deser.impl.CreatorCollector", "addDelegatingCreator", "com.fasterxml.jackson.databind.introspect.AnnotatedWithParams,boolean,com.fasterxml.jackson.databind.deser.SettableBeanProperty[]", "<sample:7>", "false", "<empty>"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput121() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.impl.CreatorCollector", "com.fasterxml.jackson.databind.deser.impl.CreatorCollector", "setDefaultCreator", new String[]{"com.fasterxml.jackson.databind.introspect.AnnotatedWithParams"}, new String[]{"<sample:2>"}, false, 7, new String[][]{{"com.fasterxml.jackson.databind.deser.impl.CreatorCollector", "addDoubleCreator", "com.fasterxml.jackson.databind.introspect.AnnotatedWithParams,boolean", "<sample:2>", "true"}, {"com.fasterxml.jackson.databind.deser.impl.CreatorCollector", "addDelegatingCreator", "com.fasterxml.jackson.databind.introspect.AnnotatedWithParams,boolean,com.fasterxml.jackson.databind.deser.SettableBeanProperty[]", "<sample:7>", "false", "<empty>"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{hasDefaultCreator=true, hasDelegatingCreator=true, hasPropertyBasedCreator=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput122() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.impl.CreatorCollector", "com.fasterxml.jackson.databind.deser.impl.CreatorCollector", "addIncompeteParameter", new String[]{"com.fasterxml.jackson.databind.introspect.AnnotatedParameter"}, new String[]{"<sample:4>"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.deser.impl.CreatorCollector", "addDelegatingCreator", "com.fasterxml.jackson.databind.introspect.AnnotatedWithParams,boolean,com.fasterxml.jackson.databind.deser.SettableBeanProperty[]", "<sample:6>", "true", "<sample:1>"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{hasDefaultCreator=false, hasDelegatingCreator=false, hasPropertyBasedCreator=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput123() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.impl.CreatorCollector", "com.fasterxml.jackson.databind.deser.impl.CreatorCollector", "setDefaultCreator", new String[]{"com.fasterxml.jackson.databind.introspect.AnnotatedWithParams"}, new String[]{"<sample:8>"}, false, 2, new String[][]{{"com.fasterxml.jackson.databind.deser.impl.CreatorCollector", "addDoubleCreator", "com.fasterxml.jackson.databind.introspect.AnnotatedWithParams,boolean", "<sample:3>", "false"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{hasDefaultCreator=false, hasDelegatingCreator=false, hasPropertyBasedCreator=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput124() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.impl.CreatorCollector", "com.fasterxml.jackson.databind.deser.impl.CreatorCollector", "setDefaultCreator", new String[]{"com.fasterxml.jackson.databind.introspect.AnnotatedWithParams"}, new String[]{"<sample:7>"}, false, 2, new String[][]{{"com.fasterxml.jackson.databind.deser.impl.CreatorCollector", "addDoubleCreator", "com.fasterxml.jackson.databind.introspect.AnnotatedWithParams,boolean", "<sample:3>", "false"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{hasDefaultCreator=true, hasDelegatingCreator=false, hasPropertyBasedCreator=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput125() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.impl.CreatorCollector", "com.fasterxml.jackson.databind.deser.impl.CreatorCollector", "addDelegatingCreator", new String[]{"com.fasterxml.jackson.databind.introspect.AnnotatedWithParams", "boolean", "com.fasterxml.jackson.databind.deser.SettableBeanProperty[]"}, new String[]{"<sample:3>", "false", "<null>"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.deser.impl.CreatorCollector", "constructValueInstantiator", "com.fasterxml.jackson.databind.DeserializationConfig", "<sample:3>"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{hasDefaultCreator=false, hasDelegatingCreator=false, hasPropertyBasedCreator=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput126() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.impl.CreatorCollector", "com.fasterxml.jackson.databind.deser.impl.CreatorCollector", "addDelegatingCreator", new String[]{"com.fasterxml.jackson.databind.introspect.AnnotatedWithParams", "boolean", "com.fasterxml.jackson.databind.deser.SettableBeanProperty[]"}, new String[]{"<sample:3>", "true", "<sample:1>"}, false); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput127() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.impl.CreatorCollector", "com.fasterxml.jackson.databind.deser.impl.CreatorCollector", "addStringCreator", new String[]{"com.fasterxml.jackson.databind.introspect.AnnotatedWithParams"}, new String[]{"<sample:7>"}, false, 2, new String[][]{{"com.fasterxml.jackson.databind.deser.impl.CreatorCollector", "hasDefaultCreator", ""}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{hasDefaultCreator=false, hasDelegatingCreator=false, hasPropertyBasedCreator=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput128() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.impl.CreatorCollector", "com.fasterxml.jackson.databind.deser.impl.CreatorCollector", "addDelegatingCreator", new String[]{"com.fasterxml.jackson.databind.introspect.AnnotatedWithParams", "boolean", "com.fasterxml.jackson.databind.deser.SettableBeanProperty[]"}, new String[]{"<sample:3>", "false", "<null>"}, false, 10, new String[][]{{"com.fasterxml.jackson.databind.deser.impl.CreatorCollector", "addStringCreator", "com.fasterxml.jackson.databind.introspect.AnnotatedWithParams", "<sample:6>"}, {"com.fasterxml.jackson.databind.deser.impl.CreatorCollector", "addPropertyCreator", "com.fasterxml.jackson.databind.introspect.AnnotatedWithParams,boolean,com.fasterxml.jackson.databind.deser.SettableBeanProperty[]", "<sample:7>", "false", "<sample:2>"}, {"com.fasterxml.jackson.databind.deser.impl.CreatorCollector", "constructValueInstantiator", "com.fasterxml.jackson.databind.DeserializationConfig", "<null>"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{hasDefaultCreator=false, hasDelegatingCreator=false, hasPropertyBasedCreator=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput129() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.impl.CreatorCollector", "com.fasterxml.jackson.databind.deser.impl.CreatorCollector", "constructValueInstantiator", new String[]{"com.fasterxml.jackson.databind.DeserializationConfig"}, new String[]{"<sample:0>"}, false, 4, new String[][]{{"com.fasterxml.jackson.databind.deser.impl.CreatorCollector", "hasDelegatingCreator", ""}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput130() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.impl.CreatorCollector", "com.fasterxml.jackson.databind.deser.impl.CreatorCollector", "hasPropertyBasedCreator", new String[]{}, new String[]{}, false);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{hasDefaultCreator=false, hasDelegatingCreator=false, hasPropertyBasedCreator=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput131() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.impl.CreatorCollector", "com.fasterxml.jackson.databind.deser.impl.CreatorCollector", "hasDelegatingCreator", new String[]{}, new String[]{}, false);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{hasDefaultCreator=false, hasDelegatingCreator=false, hasPropertyBasedCreator=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput132() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.impl.CreatorCollector", "com.fasterxml.jackson.databind.deser.impl.CreatorCollector", "addPropertyCreator", new String[]{"com.fasterxml.jackson.databind.introspect.AnnotatedWithParams", "com.fasterxml.jackson.databind.deser.CreatorProperty[]"}, new String[]{"<null>", "<sample:0>"}, false);
  assertNull(actual);
  assertEquals("receiver state after the call", "{hasDefaultCreator=false, hasDelegatingCreator=false, hasPropertyBasedCreator=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput133() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.impl.CreatorCollector", "com.fasterxml.jackson.databind.deser.impl.CreatorCollector", "addDelegatingCreator", new String[]{"com.fasterxml.jackson.databind.introspect.AnnotatedWithParams", "boolean", "com.fasterxml.jackson.databind.deser.SettableBeanProperty[]"}, new String[]{"<sample:2>", "true", "<sample:2>"}, false, 4, new String[][]{{"com.fasterxml.jackson.databind.deser.impl.CreatorCollector", "addDoubleCreator", "com.fasterxml.jackson.databind.introspect.AnnotatedWithParams,boolean", "<sample:3>", "true"}, {"com.fasterxml.jackson.databind.deser.impl.CreatorCollector", "addPropertyCreator", "com.fasterxml.jackson.databind.introspect.AnnotatedWithParams,com.fasterxml.jackson.databind.deser.CreatorProperty[]", "<sample:3>", "<sample:1>"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.reflect.GenericSignatureFormatError", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput134() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.impl.CreatorCollector", "com.fasterxml.jackson.databind.deser.impl.CreatorCollector", "addIncompeteParameter", new String[]{"com.fasterxml.jackson.databind.introspect.AnnotatedParameter"}, new String[]{"<sample:1>"}, false, 1, new String[][]{{"com.fasterxml.jackson.databind.deser.impl.CreatorCollector", "addPropertyCreator", "com.fasterxml.jackson.databind.introspect.AnnotatedWithParams,com.fasterxml.jackson.databind.deser.CreatorProperty[]", "<sample:2>", "<empty>"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{hasDefaultCreator=false, hasDelegatingCreator=false, hasPropertyBasedCreator=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput135() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.impl.CreatorCollector", "com.fasterxml.jackson.databind.deser.impl.CreatorCollector", "addIntCreator", new String[]{"com.fasterxml.jackson.databind.introspect.AnnotatedWithParams"}, new String[]{"<sample:2>"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.deser.impl.CreatorCollector", "addLongCreator", "com.fasterxml.jackson.databind.introspect.AnnotatedWithParams,boolean", "<sample:7>", "false"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{hasDefaultCreator=false, hasDelegatingCreator=false, hasPropertyBasedCreator=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput136() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.impl.CreatorCollector", "com.fasterxml.jackson.databind.deser.impl.CreatorCollector", "addIntCreator", new String[]{"com.fasterxml.jackson.databind.introspect.AnnotatedWithParams"}, new String[]{"<sample:1>"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.deser.impl.CreatorCollector", "addLongCreator", "com.fasterxml.jackson.databind.introspect.AnnotatedWithParams,boolean", "<sample:7>", "false"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput137() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.impl.CreatorCollector", "com.fasterxml.jackson.databind.deser.impl.CreatorCollector", "addIncompeteParameter", new String[]{"com.fasterxml.jackson.databind.introspect.AnnotatedParameter"}, new String[]{"<sample:6>"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.deser.impl.CreatorCollector", "setDefaultCreator", "com.fasterxml.jackson.databind.introspect.AnnotatedWithParams", "<sample:2>"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{hasDefaultCreator=true, hasDelegatingCreator=false, hasPropertyBasedCreator=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput138() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.impl.CreatorCollector", "com.fasterxml.jackson.databind.deser.impl.CreatorCollector", "addBooleanCreator", new String[]{"com.fasterxml.jackson.databind.introspect.AnnotatedWithParams", "boolean"}, new String[]{"<sample:3>", "false"}, false);
  assertNull(actual);
  assertEquals("receiver state after the call", "{hasDefaultCreator=false, hasDelegatingCreator=false, hasPropertyBasedCreator=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput139() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.impl.CreatorCollector", "com.fasterxml.jackson.databind.deser.impl.CreatorCollector", "addLongCreator", new String[]{"com.fasterxml.jackson.databind.introspect.AnnotatedWithParams"}, new String[]{"<sample:5>"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.deser.impl.CreatorCollector", "addIntCreator", "com.fasterxml.jackson.databind.introspect.AnnotatedWithParams,boolean", "<sample:3>", "true"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput140() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.impl.CreatorCollector", "com.fasterxml.jackson.databind.deser.impl.CreatorCollector", "addStringCreator", new String[]{"com.fasterxml.jackson.databind.introspect.AnnotatedWithParams"}, new String[]{"<sample:4>"}, false); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput141() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.impl.CreatorCollector", "com.fasterxml.jackson.databind.deser.impl.CreatorCollector", "addDelegatingCreator", new String[]{"com.fasterxml.jackson.databind.introspect.AnnotatedWithParams", "boolean", "com.fasterxml.jackson.databind.deser.SettableBeanProperty[]"}, new String[]{"<sample:7>", "true", "<sample:0>"}, false);
  assertNull(actual);
  assertEquals("receiver state after the call", "{hasDefaultCreator=false, hasDelegatingCreator=true, hasPropertyBasedCreator=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput142() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.impl.CreatorCollector", "com.fasterxml.jackson.databind.deser.impl.CreatorCollector", "addPropertyCreator", new String[]{"com.fasterxml.jackson.databind.introspect.AnnotatedWithParams", "com.fasterxml.jackson.databind.deser.CreatorProperty[]"}, new String[]{"<sample:3>", "<sample:0>"}, false);
  assertNull(actual);
  assertEquals("receiver state after the call", "{hasDefaultCreator=false, hasDelegatingCreator=false, hasPropertyBasedCreator=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput143() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.impl.CreatorCollector", "com.fasterxml.jackson.databind.deser.impl.CreatorCollector", "verifyNonDup", new String[]{"com.fasterxml.jackson.databind.introspect.AnnotatedWithParams", "int", "boolean"}, new String[]{"<sample:6>", "2", "true"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.deser.impl.CreatorCollector", "hasDefaultCreator", ""}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput144() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.impl.CreatorCollector", "com.fasterxml.jackson.databind.deser.impl.CreatorCollector", "hasDelegatingCreator", new String[]{}, new String[]{}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.deser.impl.CreatorCollector", "verifyNonDup", "com.fasterxml.jackson.databind.introspect.AnnotatedWithParams,int,boolean", "<sample:3>", "6", "false"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
  assertEquals("receiver state after the call", "{hasDefaultCreator=false, hasDelegatingCreator=true, hasPropertyBasedCreator=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput145() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.impl.CreatorCollector", "com.fasterxml.jackson.databind.deser.impl.CreatorCollector", "addPropertyCreator", new String[]{"com.fasterxml.jackson.databind.introspect.AnnotatedWithParams", "com.fasterxml.jackson.databind.deser.CreatorProperty[]"}, new String[]{"<sample:5>", "<sample:0>"}, false); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput146() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.impl.CreatorCollector", "com.fasterxml.jackson.databind.deser.impl.CreatorCollector", "addIntCreator", new String[]{"com.fasterxml.jackson.databind.introspect.AnnotatedWithParams"}, new String[]{"<sample:1>"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.deser.impl.CreatorCollector", "addBooleanCreator", "com.fasterxml.jackson.databind.introspect.AnnotatedWithParams", "<null>"}, {"com.fasterxml.jackson.databind.deser.impl.CreatorCollector", "addBooleanCreator", "com.fasterxml.jackson.databind.introspect.AnnotatedWithParams,boolean", "<sample:3>", "true"}, {"com.fasterxml.jackson.databind.deser.impl.CreatorCollector", "addDoubleCreator", "com.fasterxml.jackson.databind.introspect.AnnotatedWithParams", "<sample:1>"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{hasDefaultCreator=false, hasDelegatingCreator=false, hasPropertyBasedCreator=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput147() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.impl.CreatorCollector", "com.fasterxml.jackson.databind.deser.impl.CreatorCollector", "addDoubleCreator", new String[]{"com.fasterxml.jackson.databind.introspect.AnnotatedWithParams", "boolean"}, new String[]{"<sample:7>", "true"}, false);
  assertNull(actual);
  assertEquals("receiver state after the call", "{hasDefaultCreator=false, hasDelegatingCreator=false, hasPropertyBasedCreator=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput148() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.impl.CreatorCollector", "com.fasterxml.jackson.databind.deser.impl.CreatorCollector", "addPropertyCreator", new String[]{"com.fasterxml.jackson.databind.introspect.AnnotatedWithParams", "com.fasterxml.jackson.databind.deser.CreatorProperty[]"}, new String[]{"<sample:3>", "<sample:2>"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.deser.impl.CreatorCollector", "addLongCreator", "com.fasterxml.jackson.databind.introspect.AnnotatedWithParams,boolean", "<sample:6>", "false"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput149() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.impl.CreatorCollector", "com.fasterxml.jackson.databind.deser.impl.CreatorCollector", "addStringCreator", new String[]{"com.fasterxml.jackson.databind.introspect.AnnotatedWithParams", "boolean"}, new String[]{"<sample:3>", "true"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.deser.impl.CreatorCollector", "addDelegatingCreator", "com.fasterxml.jackson.databind.introspect.AnnotatedWithParams,com.fasterxml.jackson.databind.deser.CreatorProperty[]", "<sample:7>", "<sample:0>"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{hasDefaultCreator=false, hasDelegatingCreator=true, hasPropertyBasedCreator=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput150() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.impl.CreatorCollector", "com.fasterxml.jackson.databind.deser.impl.CreatorCollector", "verifyNonDup", new String[]{"com.fasterxml.jackson.databind.introspect.AnnotatedWithParams", "int", "boolean"}, new String[]{"<sample:7>", "0", "true"}, false);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
  assertEquals("receiver state after the call", "{hasDefaultCreator=true, hasDelegatingCreator=false, hasPropertyBasedCreator=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput151() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.impl.CreatorCollector", "com.fasterxml.jackson.databind.deser.impl.CreatorCollector", "verifyNonDup", new String[]{"com.fasterxml.jackson.databind.introspect.AnnotatedWithParams", "int", "boolean"}, new String[]{"<sample:10>", "0", "false"}, false, 5, new String[][]{});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
  assertEquals("receiver state after the call", "{hasDefaultCreator=false, hasDelegatingCreator=false, hasPropertyBasedCreator=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput152() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.impl.CreatorCollector", "com.fasterxml.jackson.databind.deser.impl.CreatorCollector", "addPropertyCreator", new String[]{"com.fasterxml.jackson.databind.introspect.AnnotatedWithParams", "boolean", "com.fasterxml.jackson.databind.deser.SettableBeanProperty[]"}, new String[]{"<sample:3>", "false", "<sample:2>"}, false, 1, new String[][]{}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput153() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.impl.CreatorCollector", "com.fasterxml.jackson.databind.deser.impl.CreatorCollector", "verifyNonDup", new String[]{"com.fasterxml.jackson.databind.introspect.AnnotatedWithParams", "int", "boolean"}, new String[]{"<sample:2>", "6", "false"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.deser.impl.CreatorCollector", "verifyNonDup", "com.fasterxml.jackson.databind.introspect.AnnotatedWithParams,int,boolean", "<sample:1>", "7", "true"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
  assertEquals("receiver state after the call", "{hasDefaultCreator=false, hasDelegatingCreator=true, hasPropertyBasedCreator=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput154() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.impl.CreatorCollector", "com.fasterxml.jackson.databind.deser.impl.CreatorCollector", "hasDefaultCreator", new String[]{}, new String[]{}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.deser.impl.CreatorCollector", "addPropertyCreator", "com.fasterxml.jackson.databind.introspect.AnnotatedWithParams,boolean,com.fasterxml.jackson.databind.deser.SettableBeanProperty[]", "<sample:7>", "true", "<sample:1>"}, {"com.fasterxml.jackson.databind.deser.impl.CreatorCollector", "setDefaultCreator", "com.fasterxml.jackson.databind.introspect.AnnotatedWithParams", "<sample:5>"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{hasDefaultCreator=false, hasDelegatingCreator=false, hasPropertyBasedCreator=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput155() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.impl.CreatorCollector", "com.fasterxml.jackson.databind.deser.impl.CreatorCollector", "hasDefaultCreator", new String[]{}, new String[]{}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.deser.impl.CreatorCollector", "setDefaultCreator", "com.fasterxml.jackson.databind.introspect.AnnotatedWithParams", "<sample:2>"}, {"com.fasterxml.jackson.databind.deser.impl.CreatorCollector", "addPropertyCreator", "com.fasterxml.jackson.databind.introspect.AnnotatedWithParams,boolean,com.fasterxml.jackson.databind.deser.SettableBeanProperty[]", "<sample:7>", "true", "<sample:1>"}, {"com.fasterxml.jackson.databind.deser.impl.CreatorCollector", "setDefaultCreator", "com.fasterxml.jackson.databind.introspect.AnnotatedWithParams", "<sample:5>"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
  assertEquals("receiver state after the call", "{hasDefaultCreator=true, hasDelegatingCreator=false, hasPropertyBasedCreator=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput156() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.impl.CreatorCollector", "com.fasterxml.jackson.databind.deser.impl.CreatorCollector", "hasDefaultCreator", new String[]{}, new String[]{}, false, 2, new String[][]{{"com.fasterxml.jackson.databind.deser.impl.CreatorCollector", "setDefaultCreator", "com.fasterxml.jackson.databind.introspect.AnnotatedWithParams", "<sample:2>"}, {"com.fasterxml.jackson.databind.deser.impl.CreatorCollector", "setDefaultCreator", "com.fasterxml.jackson.databind.introspect.AnnotatedWithParams", "<sample:5>"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
  assertEquals("receiver state after the call", "{hasDefaultCreator=true, hasDelegatingCreator=false, hasPropertyBasedCreator=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput157() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.impl.CreatorCollector", "com.fasterxml.jackson.databind.deser.impl.CreatorCollector", "addBooleanCreator", new String[]{"com.fasterxml.jackson.databind.introspect.AnnotatedWithParams", "boolean"}, new String[]{"<sample:6>", "false"}, false, 3, new String[][]{{"com.fasterxml.jackson.databind.deser.impl.CreatorCollector", "addDelegatingCreator", "com.fasterxml.jackson.databind.introspect.AnnotatedWithParams,com.fasterxml.jackson.databind.deser.CreatorProperty[]", "<sample:7>", "<empty>"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput158() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.impl.CreatorCollector", "com.fasterxml.jackson.databind.deser.impl.CreatorCollector", "addStringCreator", new String[]{"com.fasterxml.jackson.databind.introspect.AnnotatedWithParams"}, new String[]{"<sample:7>"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.deser.impl.CreatorCollector", "setDefaultCreator", "com.fasterxml.jackson.databind.introspect.AnnotatedWithParams", "<sample:3>"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{hasDefaultCreator=true, hasDelegatingCreator=false, hasPropertyBasedCreator=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput159() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.impl.CreatorCollector", "com.fasterxml.jackson.databind.deser.impl.CreatorCollector", "addDoubleCreator", new String[]{"com.fasterxml.jackson.databind.introspect.AnnotatedWithParams"}, new String[]{"<sample:3>"}, false, 1, new String[][]{{"com.fasterxml.jackson.databind.deser.impl.CreatorCollector", "addDelegatingCreator", "com.fasterxml.jackson.databind.introspect.AnnotatedWithParams,com.fasterxml.jackson.databind.deser.CreatorProperty[]", "<sample:7>", "<sample:2>"}, {"com.fasterxml.jackson.databind.deser.impl.CreatorCollector", "addPropertyCreator", "com.fasterxml.jackson.databind.introspect.AnnotatedWithParams,com.fasterxml.jackson.databind.deser.CreatorProperty[]", "<sample:0>", "<sample:0>"}, {"com.fasterxml.jackson.databind.deser.impl.CreatorCollector", "addIntCreator", "com.fasterxml.jackson.databind.introspect.AnnotatedWithParams", "<sample:7>"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{hasDefaultCreator=false, hasDelegatingCreator=true, hasPropertyBasedCreator=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput160() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.impl.CreatorCollector", "com.fasterxml.jackson.databind.deser.impl.CreatorCollector", "addDoubleCreator", new String[]{"com.fasterxml.jackson.databind.introspect.AnnotatedWithParams"}, new String[]{"<sample:3>"}, false, 2, new String[][]{{"com.fasterxml.jackson.databind.deser.impl.CreatorCollector", "addDelegatingCreator", "com.fasterxml.jackson.databind.introspect.AnnotatedWithParams,com.fasterxml.jackson.databind.deser.CreatorProperty[]", "<sample:7>", "<sample:2>"}, {"com.fasterxml.jackson.databind.deser.impl.CreatorCollector", "addPropertyCreator", "com.fasterxml.jackson.databind.introspect.AnnotatedWithParams,com.fasterxml.jackson.databind.deser.CreatorProperty[]", "<sample:7>", "<sample:0>"}, {"com.fasterxml.jackson.databind.deser.impl.CreatorCollector", "addIntCreator", "com.fasterxml.jackson.databind.introspect.AnnotatedWithParams", "<sample:7>"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{hasDefaultCreator=false, hasDelegatingCreator=true, hasPropertyBasedCreator=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput161() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.impl.CreatorCollector", "com.fasterxml.jackson.databind.deser.impl.CreatorCollector", "hasDefaultCreator", new String[]{}, new String[]{}, false, 2, new String[][]{{"com.fasterxml.jackson.databind.deser.impl.CreatorCollector", "addDelegatingCreator", "com.fasterxml.jackson.databind.introspect.AnnotatedWithParams,boolean,com.fasterxml.jackson.databind.deser.SettableBeanProperty[]", "<sample:0>", "false", "<empty>"}, {"com.fasterxml.jackson.databind.deser.impl.CreatorCollector", "verifyNonDup", "com.fasterxml.jackson.databind.introspect.AnnotatedWithParams,int,boolean", "<sample:7>", "6", "true"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{hasDefaultCreator=false, hasDelegatingCreator=true, hasPropertyBasedCreator=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput162() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.impl.CreatorCollector", "com.fasterxml.jackson.databind.deser.impl.CreatorCollector", "addDoubleCreator", new String[]{"com.fasterxml.jackson.databind.introspect.AnnotatedWithParams"}, new String[]{"<sample:3>"}, false, 2, new String[][]{{"com.fasterxml.jackson.databind.deser.impl.CreatorCollector", "addPropertyCreator", "com.fasterxml.jackson.databind.introspect.AnnotatedWithParams,com.fasterxml.jackson.databind.deser.CreatorProperty[]", "<sample:7>", "<sample:0>"}, {"com.fasterxml.jackson.databind.deser.impl.CreatorCollector", "addIntCreator", "com.fasterxml.jackson.databind.introspect.AnnotatedWithParams", "<sample:7>"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{hasDefaultCreator=false, hasDelegatingCreator=false, hasPropertyBasedCreator=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput163() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.impl.CreatorCollector", "com.fasterxml.jackson.databind.deser.impl.CreatorCollector", "addBooleanCreator", new String[]{"com.fasterxml.jackson.databind.introspect.AnnotatedWithParams", "boolean"}, new String[]{"<sample:2>", "false"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.deser.impl.CreatorCollector", "addDelegatingCreator", "com.fasterxml.jackson.databind.introspect.AnnotatedWithParams,com.fasterxml.jackson.databind.deser.CreatorProperty[]", "<sample:7>", "<sample:1>"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{hasDefaultCreator=false, hasDelegatingCreator=true, hasPropertyBasedCreator=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput164() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.impl.CreatorCollector", "com.fasterxml.jackson.databind.deser.impl.CreatorCollector", "addDelegatingCreator", new String[]{"com.fasterxml.jackson.databind.introspect.AnnotatedWithParams", "boolean", "com.fasterxml.jackson.databind.deser.SettableBeanProperty[]"}, new String[]{"<sample:11>", "false", "<sample:0>"}, false, 3, new String[][]{{"com.fasterxml.jackson.databind.deser.impl.CreatorCollector", "addDelegatingCreator", "com.fasterxml.jackson.databind.introspect.AnnotatedWithParams,boolean,com.fasterxml.jackson.databind.deser.SettableBeanProperty[]", "<sample:7>", "true", "<sample:1>"}, {"com.fasterxml.jackson.databind.deser.impl.CreatorCollector", "addDoubleCreator", "com.fasterxml.jackson.databind.introspect.AnnotatedWithParams", "<sample:4>"}, {"com.fasterxml.jackson.databind.deser.impl.CreatorCollector", "hasPropertyBasedCreator", ""}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{hasDefaultCreator=false, hasDelegatingCreator=true, hasPropertyBasedCreator=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput165() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.impl.CreatorCollector", "com.fasterxml.jackson.databind.deser.impl.CreatorCollector", "addLongCreator", new String[]{"com.fasterxml.jackson.databind.introspect.AnnotatedWithParams"}, new String[]{"<sample:2>"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.deser.impl.CreatorCollector", "addIntCreator", "com.fasterxml.jackson.databind.introspect.AnnotatedWithParams", "<sample:2>"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput166() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.impl.CreatorCollector", "com.fasterxml.jackson.databind.deser.impl.CreatorCollector", "addLongCreator", new String[]{"com.fasterxml.jackson.databind.introspect.AnnotatedWithParams", "boolean"}, new String[]{"<sample:3>", "false"}, false, 6, new String[][]{{"com.fasterxml.jackson.databind.deser.impl.CreatorCollector", "setDefaultCreator", "com.fasterxml.jackson.databind.introspect.AnnotatedWithParams", "<sample:3>"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{hasDefaultCreator=true, hasDelegatingCreator=false, hasPropertyBasedCreator=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput167() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.impl.CreatorCollector", "com.fasterxml.jackson.databind.deser.impl.CreatorCollector", "addBooleanCreator", new String[]{"com.fasterxml.jackson.databind.introspect.AnnotatedWithParams", "boolean"}, new String[]{"<sample:7>", "true"}, false, 4, new String[][]{{"com.fasterxml.jackson.databind.deser.impl.CreatorCollector", "addIntCreator", "com.fasterxml.jackson.databind.introspect.AnnotatedWithParams", "<sample:7>"}, {"com.fasterxml.jackson.databind.deser.impl.CreatorCollector", "addStringCreator", "com.fasterxml.jackson.databind.introspect.AnnotatedWithParams", "<sample:3>"}, {"com.fasterxml.jackson.databind.deser.impl.CreatorCollector", "addBooleanCreator", "com.fasterxml.jackson.databind.introspect.AnnotatedWithParams,boolean", "<sample:4>", "true"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput168() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.impl.CreatorCollector", "com.fasterxml.jackson.databind.deser.impl.CreatorCollector", "addLongCreator", new String[]{"com.fasterxml.jackson.databind.introspect.AnnotatedWithParams"}, new String[]{"<null>"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.deser.impl.CreatorCollector", "setDefaultCreator", "com.fasterxml.jackson.databind.introspect.AnnotatedWithParams", "<sample:6>"}, {"com.fasterxml.jackson.databind.deser.impl.CreatorCollector", "addPropertyCreator", "com.fasterxml.jackson.databind.introspect.AnnotatedWithParams,com.fasterxml.jackson.databind.deser.CreatorProperty[]", "<sample:2>", "<sample:2>"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{hasDefaultCreator=false, hasDelegatingCreator=false, hasPropertyBasedCreator=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput169() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.impl.CreatorCollector", "com.fasterxml.jackson.databind.deser.impl.CreatorCollector", "addIntCreator", new String[]{"com.fasterxml.jackson.databind.introspect.AnnotatedWithParams"}, new String[]{"<sample:4>"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.deser.impl.CreatorCollector", "addStringCreator", "com.fasterxml.jackson.databind.introspect.AnnotatedWithParams", "<sample:4>"}, {"com.fasterxml.jackson.databind.deser.impl.CreatorCollector", "addBooleanCreator", "com.fasterxml.jackson.databind.introspect.AnnotatedWithParams,boolean", "<sample:11>", "true"}, {"com.fasterxml.jackson.databind.deser.impl.CreatorCollector", "addPropertyCreator", "com.fasterxml.jackson.databind.introspect.AnnotatedWithParams,com.fasterxml.jackson.databind.deser.CreatorProperty[]", "<sample:2>", "<sample:2>"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{hasDefaultCreator=false, hasDelegatingCreator=false, hasPropertyBasedCreator=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput170() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.impl.CreatorCollector", "com.fasterxml.jackson.databind.deser.impl.CreatorCollector", "addBooleanCreator", new String[]{"com.fasterxml.jackson.databind.introspect.AnnotatedWithParams", "boolean"}, new String[]{"<sample:8>", "true"}, false, 10, new String[][]{{"com.fasterxml.jackson.databind.deser.impl.CreatorCollector", "addPropertyCreator", "com.fasterxml.jackson.databind.introspect.AnnotatedWithParams,com.fasterxml.jackson.databind.deser.CreatorProperty[]", "<sample:7>", "<null>"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{hasDefaultCreator=false, hasDelegatingCreator=false, hasPropertyBasedCreator=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput171() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.impl.CreatorCollector", "com.fasterxml.jackson.databind.deser.impl.CreatorCollector", "addIntCreator", new String[]{"com.fasterxml.jackson.databind.introspect.AnnotatedWithParams", "boolean"}, new String[]{"<sample:7>", "false"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.deser.impl.CreatorCollector", "addPropertyCreator", "com.fasterxml.jackson.databind.introspect.AnnotatedWithParams,com.fasterxml.jackson.databind.deser.CreatorProperty[]", "<sample:11>", "<null>"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{hasDefaultCreator=false, hasDelegatingCreator=false, hasPropertyBasedCreator=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput172() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.impl.CreatorCollector", "com.fasterxml.jackson.databind.deser.impl.CreatorCollector", "addDoubleCreator", new String[]{"com.fasterxml.jackson.databind.introspect.AnnotatedWithParams"}, new String[]{"<null>"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.deser.impl.CreatorCollector", "addIntCreator", "com.fasterxml.jackson.databind.introspect.AnnotatedWithParams", "<sample:1>"}, {"com.fasterxml.jackson.databind.deser.impl.CreatorCollector", "setDefaultCreator", "com.fasterxml.jackson.databind.introspect.AnnotatedWithParams", "<sample:7>"}, {"com.fasterxml.jackson.databind.deser.impl.CreatorCollector", "addDelegatingCreator", "com.fasterxml.jackson.databind.introspect.AnnotatedWithParams,boolean,com.fasterxml.jackson.databind.deser.SettableBeanProperty[]", "<sample:1>", "true", "<sample:1>"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{hasDefaultCreator=true, hasDelegatingCreator=false, hasPropertyBasedCreator=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput173() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.impl.CreatorCollector", "com.fasterxml.jackson.databind.deser.impl.CreatorCollector", "addStringCreator", new String[]{"com.fasterxml.jackson.databind.introspect.AnnotatedWithParams", "boolean"}, new String[]{"<null>", "true"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.deser.impl.CreatorCollector", "addPropertyCreator", "com.fasterxml.jackson.databind.introspect.AnnotatedWithParams,boolean,com.fasterxml.jackson.databind.deser.SettableBeanProperty[]", "<sample:3>", "false", "<null>"}, {"com.fasterxml.jackson.databind.deser.impl.CreatorCollector", "addStringCreator", "com.fasterxml.jackson.databind.introspect.AnnotatedWithParams", "<sample:6>"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{hasDefaultCreator=false, hasDelegatingCreator=false, hasPropertyBasedCreator=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput174() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.impl.CreatorCollector", "com.fasterxml.jackson.databind.deser.impl.CreatorCollector", "addDoubleCreator", new String[]{"com.fasterxml.jackson.databind.introspect.AnnotatedWithParams"}, new String[]{"<sample:3>"}, false, 1, new String[][]{}, 1);
  assertNull(actual);
  assertEquals("receiver state after the call", "{hasDefaultCreator=false, hasDelegatingCreator=false, hasPropertyBasedCreator=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput175() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.impl.CreatorCollector", "com.fasterxml.jackson.databind.deser.impl.CreatorCollector", "addDoubleCreator", new String[]{"com.fasterxml.jackson.databind.introspect.AnnotatedWithParams"}, new String[]{"<sample:0>"}, false, 1, new String[][]{}, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput176() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.impl.CreatorCollector", "com.fasterxml.jackson.databind.deser.impl.CreatorCollector", "addDoubleCreator", new String[]{"com.fasterxml.jackson.databind.introspect.AnnotatedWithParams"}, new String[]{"<sample:11>"}, false, 1, new String[][]{{"com.fasterxml.jackson.databind.deser.impl.CreatorCollector", "addPropertyCreator", "com.fasterxml.jackson.databind.introspect.AnnotatedWithParams,com.fasterxml.jackson.databind.deser.CreatorProperty[]", "<sample:11>", "<sample:2>"}}, 1);
  assertNull(actual);
  assertEquals("receiver state after the call", "{hasDefaultCreator=false, hasDelegatingCreator=false, hasPropertyBasedCreator=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput177() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.impl.CreatorCollector", "com.fasterxml.jackson.databind.deser.impl.CreatorCollector", "addBooleanCreator", new String[]{"com.fasterxml.jackson.databind.introspect.AnnotatedWithParams", "boolean"}, new String[]{"<sample:7>", "false"}, false, 5, new String[][]{{"com.fasterxml.jackson.databind.deser.impl.CreatorCollector", "addIncompeteParameter", "com.fasterxml.jackson.databind.introspect.AnnotatedParameter", "<sample:2>"}, {"com.fasterxml.jackson.databind.deser.impl.CreatorCollector", "verifyNonDup", "com.fasterxml.jackson.databind.introspect.AnnotatedWithParams,int,boolean", "<sample:7>", "0", "true"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{hasDefaultCreator=true, hasDelegatingCreator=false, hasPropertyBasedCreator=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput178() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.impl.CreatorCollector", "com.fasterxml.jackson.databind.deser.impl.CreatorCollector", "hasDelegatingCreator", new String[]{}, new String[]{}, false, 0, null, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{hasDefaultCreator=false, hasDelegatingCreator=false, hasPropertyBasedCreator=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput179() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.impl.CreatorCollector", "com.fasterxml.jackson.databind.deser.impl.CreatorCollector", "addBooleanCreator", new String[]{"com.fasterxml.jackson.databind.introspect.AnnotatedWithParams", "boolean"}, new String[]{"<sample:5>", "false"}, false, 0, null, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput180() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.impl.CreatorCollector", "com.fasterxml.jackson.databind.deser.impl.CreatorCollector", "hasDelegatingCreator", new String[]{}, new String[]{}, false, 21, new String[][]{{"com.fasterxml.jackson.databind.deser.impl.CreatorCollector", "addLongCreator", "com.fasterxml.jackson.databind.introspect.AnnotatedWithParams", "<sample:11>"}, {"com.fasterxml.jackson.databind.deser.impl.CreatorCollector", "addStringCreator", "com.fasterxml.jackson.databind.introspect.AnnotatedWithParams", "<sample:8>"}}, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput181() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.impl.CreatorCollector", "com.fasterxml.jackson.databind.deser.impl.CreatorCollector", "hasPropertyBasedCreator", new String[]{}, new String[]{}, false, 3, new String[][]{}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{hasDefaultCreator=false, hasDelegatingCreator=false, hasPropertyBasedCreator=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput182() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.impl.CreatorCollector", "com.fasterxml.jackson.databind.deser.impl.CreatorCollector", "addStringCreator", new String[]{"com.fasterxml.jackson.databind.introspect.AnnotatedWithParams"}, new String[]{"<sample:1>"}, false, 2, new String[][]{{"com.fasterxml.jackson.databind.deser.impl.CreatorCollector", "addBooleanCreator", "com.fasterxml.jackson.databind.introspect.AnnotatedWithParams", "<sample:4>"}}, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput183() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.impl.CreatorCollector", "com.fasterxml.jackson.databind.deser.impl.CreatorCollector", "addLongCreator", new String[]{"com.fasterxml.jackson.databind.introspect.AnnotatedWithParams"}, new String[]{"<sample:7>"}, false, 12, new String[][]{}, 3);
  assertNull(actual);
  assertEquals("receiver state after the call", "{hasDefaultCreator=false, hasDelegatingCreator=false, hasPropertyBasedCreator=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput184() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.impl.CreatorCollector", "com.fasterxml.jackson.databind.deser.impl.CreatorCollector", "addLongCreator", new String[]{"com.fasterxml.jackson.databind.introspect.AnnotatedWithParams"}, new String[]{"<sample:9>"}, false, 12, new String[][]{{"com.fasterxml.jackson.databind.deser.impl.CreatorCollector", "addIntCreator", "com.fasterxml.jackson.databind.introspect.AnnotatedWithParams", "<sample:1>"}}, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput185() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.impl.CreatorCollector", "com.fasterxml.jackson.databind.deser.impl.CreatorCollector", "addLongCreator", new String[]{"com.fasterxml.jackson.databind.introspect.AnnotatedWithParams"}, new String[]{"<sample:7>"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.deser.impl.CreatorCollector", "addDelegatingCreator", "com.fasterxml.jackson.databind.introspect.AnnotatedWithParams,com.fasterxml.jackson.databind.deser.CreatorProperty[]", "<sample:7>", "<sample:1>"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{hasDefaultCreator=false, hasDelegatingCreator=true, hasPropertyBasedCreator=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput186() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.impl.CreatorCollector", "com.fasterxml.jackson.databind.deser.impl.CreatorCollector", "addIntCreator", new String[]{"com.fasterxml.jackson.databind.introspect.AnnotatedWithParams", "boolean"}, new String[]{"<sample:6>", "true"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.deser.impl.CreatorCollector", "addDoubleCreator", "com.fasterxml.jackson.databind.introspect.AnnotatedWithParams,boolean", "<sample:3>", "false"}}, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput187() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.impl.CreatorCollector", "com.fasterxml.jackson.databind.deser.impl.CreatorCollector", "addDelegatingCreator", new String[]{"com.fasterxml.jackson.databind.introspect.AnnotatedWithParams", "com.fasterxml.jackson.databind.deser.CreatorProperty[]"}, new String[]{"<sample:12>", "<sample:0>"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.deser.impl.CreatorCollector", "addIncompeteParameter", "com.fasterxml.jackson.databind.introspect.AnnotatedParameter", "<null>"}}, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput188() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.impl.CreatorCollector", "com.fasterxml.jackson.databind.deser.impl.CreatorCollector", "addIntCreator", new String[]{"com.fasterxml.jackson.databind.introspect.AnnotatedWithParams"}, new String[]{"<sample:2>"}, false, 1, new String[][]{{"com.fasterxml.jackson.databind.deser.impl.CreatorCollector", "addDelegatingCreator", "com.fasterxml.jackson.databind.introspect.AnnotatedWithParams,com.fasterxml.jackson.databind.deser.CreatorProperty[]", "<sample:7>", "<null>"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{hasDefaultCreator=false, hasDelegatingCreator=true, hasPropertyBasedCreator=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput189() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.impl.CreatorCollector", "com.fasterxml.jackson.databind.deser.impl.CreatorCollector", "addBooleanCreator", new String[]{"com.fasterxml.jackson.databind.introspect.AnnotatedWithParams", "boolean"}, new String[]{"<sample:11>", "true"}, false, 0, null, 3);
  assertNull(actual);
  assertEquals("receiver state after the call", "{hasDefaultCreator=false, hasDelegatingCreator=false, hasPropertyBasedCreator=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput190() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.impl.CreatorCollector", "com.fasterxml.jackson.databind.deser.impl.CreatorCollector", "addStringCreator", new String[]{"com.fasterxml.jackson.databind.introspect.AnnotatedWithParams", "boolean"}, new String[]{"<null>", "true"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.deser.impl.CreatorCollector", "setDefaultCreator", "com.fasterxml.jackson.databind.introspect.AnnotatedWithParams", "<sample:2>"}, {"com.fasterxml.jackson.databind.deser.impl.CreatorCollector", "addDelegatingCreator", "com.fasterxml.jackson.databind.introspect.AnnotatedWithParams,com.fasterxml.jackson.databind.deser.CreatorProperty[]", "<sample:11>", "<sample:0>"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{hasDefaultCreator=true, hasDelegatingCreator=true, hasPropertyBasedCreator=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput191() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.impl.CreatorCollector", "com.fasterxml.jackson.databind.deser.impl.CreatorCollector", "setDefaultCreator", new String[]{"com.fasterxml.jackson.databind.introspect.AnnotatedWithParams"}, new String[]{"<sample:1>"}, false, 0, null, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput192() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.impl.CreatorCollector", "com.fasterxml.jackson.databind.deser.impl.CreatorCollector", "addBooleanCreator", new String[]{"com.fasterxml.jackson.databind.introspect.AnnotatedWithParams"}, new String[]{"<sample:4>"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.deser.impl.CreatorCollector", "addPropertyCreator", "com.fasterxml.jackson.databind.introspect.AnnotatedWithParams,com.fasterxml.jackson.databind.deser.CreatorProperty[]", "<sample:3>", "<sample:0>"}}, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput193() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.impl.CreatorCollector", "com.fasterxml.jackson.databind.deser.impl.CreatorCollector", "addStringCreator", new String[]{"com.fasterxml.jackson.databind.introspect.AnnotatedWithParams", "boolean"}, new String[]{"<null>", "false"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.deser.impl.CreatorCollector", "hasPropertyBasedCreator", ""}, {"com.fasterxml.jackson.databind.deser.impl.CreatorCollector", "addDoubleCreator", "com.fasterxml.jackson.databind.introspect.AnnotatedWithParams,boolean", "<sample:2>", "false"}, {"com.fasterxml.jackson.databind.deser.impl.CreatorCollector", "setDefaultCreator", "com.fasterxml.jackson.databind.introspect.AnnotatedWithParams", "<sample:2>"}}, 1);
  assertNull(actual);
  assertEquals("receiver state after the call", "{hasDefaultCreator=true, hasDelegatingCreator=false, hasPropertyBasedCreator=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput194() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.impl.CreatorCollector", "com.fasterxml.jackson.databind.deser.impl.CreatorCollector", "addDelegatingCreator", new String[]{"com.fasterxml.jackson.databind.introspect.AnnotatedWithParams", "boolean", "com.fasterxml.jackson.databind.deser.SettableBeanProperty[]"}, new String[]{"<sample:7>", "true", "<empty>"}, false, 0, null, 3);
  assertNull(actual);
  assertEquals("receiver state after the call", "{hasDefaultCreator=false, hasDelegatingCreator=true, hasPropertyBasedCreator=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput195() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.impl.CreatorCollector", "com.fasterxml.jackson.databind.deser.impl.CreatorCollector", "addDelegatingCreator", new String[]{"com.fasterxml.jackson.databind.introspect.AnnotatedWithParams", "boolean", "com.fasterxml.jackson.databind.deser.SettableBeanProperty[]"}, new String[]{"<sample:4>", "true", "<empty>"}, false, 0, null, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput196() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.impl.CreatorCollector", "com.fasterxml.jackson.databind.deser.impl.CreatorCollector", "addDelegatingCreator", new String[]{"com.fasterxml.jackson.databind.introspect.AnnotatedWithParams", "boolean", "com.fasterxml.jackson.databind.deser.SettableBeanProperty[]"}, new String[]{"<sample:3>", "true", "<empty>"}, false, 10, new String[][]{}, 3);
  assertNull(actual);
  assertEquals("receiver state after the call", "{hasDefaultCreator=false, hasDelegatingCreator=false, hasPropertyBasedCreator=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput197() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.impl.CreatorCollector", "com.fasterxml.jackson.databind.deser.impl.CreatorCollector", "addIntCreator", new String[]{"com.fasterxml.jackson.databind.introspect.AnnotatedWithParams"}, new String[]{"<sample:7>"}, false, 1, new String[][]{{"com.fasterxml.jackson.databind.deser.impl.CreatorCollector", "addBooleanCreator", "com.fasterxml.jackson.databind.introspect.AnnotatedWithParams,boolean", "<sample:3>", "true"}, {"com.fasterxml.jackson.databind.deser.impl.CreatorCollector", "addLongCreator", "com.fasterxml.jackson.databind.introspect.AnnotatedWithParams,boolean", "<sample:5>", "true"}, {"com.fasterxml.jackson.databind.deser.impl.CreatorCollector", "addDelegatingCreator", "com.fasterxml.jackson.databind.introspect.AnnotatedWithParams,boolean,com.fasterxml.jackson.databind.deser.SettableBeanProperty[]", "<sample:11>", "true", "<empty>"}}, 2);
  assertNull(actual);
  assertEquals("receiver state after the call", "{hasDefaultCreator=false, hasDelegatingCreator=true, hasPropertyBasedCreator=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput198() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.impl.CreatorCollector", "com.fasterxml.jackson.databind.deser.impl.CreatorCollector", "addStringCreator", new String[]{"com.fasterxml.jackson.databind.introspect.AnnotatedWithParams", "boolean"}, new String[]{"<sample:3>", "true"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.deser.impl.CreatorCollector", "setDefaultCreator", "com.fasterxml.jackson.databind.introspect.AnnotatedWithParams", "<sample:11>"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{hasDefaultCreator=true, hasDelegatingCreator=false, hasPropertyBasedCreator=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput199() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.impl.CreatorCollector", "com.fasterxml.jackson.databind.deser.impl.CreatorCollector", "addPropertyCreator", new String[]{"com.fasterxml.jackson.databind.introspect.AnnotatedWithParams", "com.fasterxml.jackson.databind.deser.CreatorProperty[]"}, new String[]{"<sample:7>", "<sample:0>"}, false, 0, null, 1);
  assertNull(actual);
  assertEquals("receiver state after the call", "{hasDefaultCreator=false, hasDelegatingCreator=false, hasPropertyBasedCreator=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput200() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.impl.CreatorCollector", "com.fasterxml.jackson.databind.deser.impl.CreatorCollector", "addIntCreator", new String[]{"com.fasterxml.jackson.databind.introspect.AnnotatedWithParams"}, new String[]{"<sample:3>"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.deser.impl.CreatorCollector", "addStringCreator", "com.fasterxml.jackson.databind.introspect.AnnotatedWithParams", "<sample:2>"}, {"com.fasterxml.jackson.databind.deser.impl.CreatorCollector", "addIntCreator", "com.fasterxml.jackson.databind.introspect.AnnotatedWithParams", "<sample:3>"}, {"com.fasterxml.jackson.databind.deser.impl.CreatorCollector", "addDelegatingCreator", "com.fasterxml.jackson.databind.introspect.AnnotatedWithParams,com.fasterxml.jackson.databind.deser.CreatorProperty[]", "<sample:7>", "<empty>"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput201() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.impl.CreatorCollector", "com.fasterxml.jackson.databind.deser.impl.CreatorCollector", "addBooleanCreator", new String[]{"com.fasterxml.jackson.databind.introspect.AnnotatedWithParams"}, new String[]{"<sample:7>"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.deser.impl.CreatorCollector", "addDelegatingCreator", "com.fasterxml.jackson.databind.introspect.AnnotatedWithParams,boolean,com.fasterxml.jackson.databind.deser.SettableBeanProperty[]", "<sample:7>", "false", "<sample:0>"}, {"com.fasterxml.jackson.databind.deser.impl.CreatorCollector", "addIntCreator", "com.fasterxml.jackson.databind.introspect.AnnotatedWithParams,boolean", "<sample:0>", "false"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{hasDefaultCreator=false, hasDelegatingCreator=true, hasPropertyBasedCreator=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput202() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.impl.CreatorCollector", "com.fasterxml.jackson.databind.deser.impl.CreatorCollector", "addStringCreator", new String[]{"com.fasterxml.jackson.databind.introspect.AnnotatedWithParams", "boolean"}, new String[]{"<sample:11>", "true"}, false, 1, new String[][]{{"com.fasterxml.jackson.databind.deser.impl.CreatorCollector", "setDefaultCreator", "com.fasterxml.jackson.databind.introspect.AnnotatedWithParams", "<sample:2>"}, {"com.fasterxml.jackson.databind.deser.impl.CreatorCollector", "addDelegatingCreator", "com.fasterxml.jackson.databind.introspect.AnnotatedWithParams,com.fasterxml.jackson.databind.deser.CreatorProperty[]", "<sample:4>", "<sample:3>"}, {"com.fasterxml.jackson.databind.deser.impl.CreatorCollector", "addIncompeteParameter", "com.fasterxml.jackson.databind.introspect.AnnotatedParameter", "<sample:7>"}}, 3);
  assertNull(actual);
  assertEquals("receiver state after the call", "{hasDefaultCreator=true, hasDelegatingCreator=false, hasPropertyBasedCreator=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput203() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.impl.CreatorCollector", "com.fasterxml.jackson.databind.deser.impl.CreatorCollector", "addLongCreator", new String[]{"com.fasterxml.jackson.databind.introspect.AnnotatedWithParams", "boolean"}, new String[]{"<sample:0>", "true"}, false, 13, new String[][]{{"com.fasterxml.jackson.databind.deser.impl.CreatorCollector", "constructValueInstantiator", "com.fasterxml.jackson.databind.DeserializationConfig", "<sample:6>"}}, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput204() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.impl.CreatorCollector", "com.fasterxml.jackson.databind.deser.impl.CreatorCollector", "addBooleanCreator", new String[]{"com.fasterxml.jackson.databind.introspect.AnnotatedWithParams", "boolean"}, new String[]{"<sample:5>", "false"}, false, 12, new String[][]{{"com.fasterxml.jackson.databind.deser.impl.CreatorCollector", "constructValueInstantiator", "com.fasterxml.jackson.databind.DeserializationConfig", "<sample:8>"}}, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput205() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.impl.CreatorCollector", "com.fasterxml.jackson.databind.deser.impl.CreatorCollector", "addStringCreator", new String[]{"com.fasterxml.jackson.databind.introspect.AnnotatedWithParams"}, new String[]{"<sample:7>"}, false, 14, new String[][]{{"com.fasterxml.jackson.databind.deser.impl.CreatorCollector", "addBooleanCreator", "com.fasterxml.jackson.databind.introspect.AnnotatedWithParams", "<sample:2>"}, {"com.fasterxml.jackson.databind.deser.impl.CreatorCollector", "addStringCreator", "com.fasterxml.jackson.databind.introspect.AnnotatedWithParams", "<sample:5>"}, {"com.fasterxml.jackson.databind.deser.impl.CreatorCollector", "addBooleanCreator", "com.fasterxml.jackson.databind.introspect.AnnotatedWithParams,boolean", "<sample:0>", "false"}}, 3);
  assertNull(actual);
  assertEquals("receiver state after the call", "{hasDefaultCreator=false, hasDelegatingCreator=false, hasPropertyBasedCreator=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput206() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.impl.CreatorCollector", "com.fasterxml.jackson.databind.deser.impl.CreatorCollector", "addStringCreator", new String[]{"com.fasterxml.jackson.databind.introspect.AnnotatedWithParams"}, new String[]{"<sample:6>"}, false, 14, new String[][]{{"com.fasterxml.jackson.databind.deser.impl.CreatorCollector", "addBooleanCreator", "com.fasterxml.jackson.databind.introspect.AnnotatedWithParams", "<sample:2>"}, {"com.fasterxml.jackson.databind.deser.impl.CreatorCollector", "addStringCreator", "com.fasterxml.jackson.databind.introspect.AnnotatedWithParams", "<sample:5>"}, {"com.fasterxml.jackson.databind.deser.impl.CreatorCollector", "addBooleanCreator", "com.fasterxml.jackson.databind.introspect.AnnotatedWithParams,boolean", "<sample:0>", "false"}}, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput207() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.impl.CreatorCollector", "com.fasterxml.jackson.databind.deser.impl.CreatorCollector", "verifyNonDup", new String[]{"com.fasterxml.jackson.databind.introspect.AnnotatedWithParams", "int", "boolean"}, new String[]{"<sample:2>", "7", "false"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.deser.impl.CreatorCollector", "constructValueInstantiator", "com.fasterxml.jackson.databind.DeserializationConfig", "<sample:4>"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
  assertEquals("receiver state after the call", "{hasDefaultCreator=false, hasDelegatingCreator=false, hasPropertyBasedCreator=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput208() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.impl.CreatorCollector", "com.fasterxml.jackson.databind.deser.impl.CreatorCollector", "addPropertyCreator", new String[]{"com.fasterxml.jackson.databind.introspect.AnnotatedWithParams", "com.fasterxml.jackson.databind.deser.CreatorProperty[]"}, new String[]{"<sample:5>", "<null>"}, false, 0, null, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput209() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.impl.CreatorCollector", "com.fasterxml.jackson.databind.deser.impl.CreatorCollector", "addPropertyCreator", new String[]{"com.fasterxml.jackson.databind.introspect.AnnotatedWithParams", "com.fasterxml.jackson.databind.deser.CreatorProperty[]"}, new String[]{"<sample:3>", "<sample:1>"}, false, 0, null, 3);
  assertNull(actual);
  assertEquals("receiver state after the call", "{hasDefaultCreator=false, hasDelegatingCreator=false, hasPropertyBasedCreator=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput210() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.impl.CreatorCollector", "com.fasterxml.jackson.databind.deser.impl.CreatorCollector", "addDelegatingCreator", new String[]{"com.fasterxml.jackson.databind.introspect.AnnotatedWithParams", "com.fasterxml.jackson.databind.deser.CreatorProperty[]"}, new String[]{"<sample:2>", "<empty>"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.deser.impl.CreatorCollector", "setDefaultCreator", "com.fasterxml.jackson.databind.introspect.AnnotatedWithParams", "<sample:5>"}, {"com.fasterxml.jackson.databind.deser.impl.CreatorCollector", "addIntCreator", "com.fasterxml.jackson.databind.introspect.AnnotatedWithParams,boolean", "<sample:0>", "false"}}, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.reflect.GenericSignatureFormatError", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput211() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.impl.CreatorCollector", "com.fasterxml.jackson.databind.deser.impl.CreatorCollector", "addDelegatingCreator", new String[]{"com.fasterxml.jackson.databind.introspect.AnnotatedWithParams", "com.fasterxml.jackson.databind.deser.CreatorProperty[]"}, new String[]{"<sample:11>", "<empty>"}, false, 13, new String[][]{{"com.fasterxml.jackson.databind.deser.impl.CreatorCollector", "setDefaultCreator", "com.fasterxml.jackson.databind.introspect.AnnotatedWithParams", "<sample:4>"}, {"com.fasterxml.jackson.databind.deser.impl.CreatorCollector", "addIntCreator", "com.fasterxml.jackson.databind.introspect.AnnotatedWithParams,boolean", "<sample:0>", "true"}}, 1);
  assertNull(actual);
  assertEquals("receiver state after the call", "{hasDefaultCreator=false, hasDelegatingCreator=true, hasPropertyBasedCreator=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput212() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.impl.CreatorCollector", "com.fasterxml.jackson.databind.deser.impl.CreatorCollector", "addIncompeteParameter", new String[]{"com.fasterxml.jackson.databind.introspect.AnnotatedParameter"}, new String[]{"<sample:6>"}, false, 6, new String[][]{{"com.fasterxml.jackson.databind.deser.impl.CreatorCollector", "addLongCreator", "com.fasterxml.jackson.databind.introspect.AnnotatedWithParams,boolean", "<sample:6>", "true"}}, 1);
  assertNull(actual);
  assertEquals("receiver state after the call", "{hasDefaultCreator=false, hasDelegatingCreator=false, hasPropertyBasedCreator=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput213() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.impl.CreatorCollector", "com.fasterxml.jackson.databind.deser.impl.CreatorCollector", "hasPropertyBasedCreator", new String[]{}, new String[]{}, false, 6, new String[][]{{"com.fasterxml.jackson.databind.deser.impl.CreatorCollector", "addLongCreator", "com.fasterxml.jackson.databind.introspect.AnnotatedWithParams,boolean", "<null>", "false"}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{hasDefaultCreator=false, hasDelegatingCreator=false, hasPropertyBasedCreator=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput214() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.impl.CreatorCollector", "com.fasterxml.jackson.databind.deser.impl.CreatorCollector", "hasPropertyBasedCreator", new String[]{}, new String[]{}, false, 13, new String[][]{{"com.fasterxml.jackson.databind.deser.impl.CreatorCollector", "setDefaultCreator", "com.fasterxml.jackson.databind.introspect.AnnotatedWithParams", "<sample:7>"}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{hasDefaultCreator=true, hasDelegatingCreator=false, hasPropertyBasedCreator=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput215() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.impl.CreatorCollector", "com.fasterxml.jackson.databind.deser.impl.CreatorCollector", "setDefaultCreator", new String[]{"com.fasterxml.jackson.databind.introspect.AnnotatedWithParams"}, new String[]{"<null>"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.deser.impl.CreatorCollector", "addPropertyCreator", "com.fasterxml.jackson.databind.introspect.AnnotatedWithParams,boolean,com.fasterxml.jackson.databind.deser.SettableBeanProperty[]", "<sample:7>", "false", "<null>"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{hasDefaultCreator=false, hasDelegatingCreator=false, hasPropertyBasedCreator=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput216() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.impl.CreatorCollector", "com.fasterxml.jackson.databind.deser.impl.CreatorCollector", "hasPropertyBasedCreator", new String[]{}, new String[]{}, false, 21, new String[][]{}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput217() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.impl.CreatorCollector", "com.fasterxml.jackson.databind.deser.impl.CreatorCollector", "addPropertyCreator", new String[]{"com.fasterxml.jackson.databind.introspect.AnnotatedWithParams", "com.fasterxml.jackson.databind.deser.CreatorProperty[]"}, new String[]{"<sample:2>", "<sample:0>"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.deser.impl.CreatorCollector", "addBooleanCreator", "com.fasterxml.jackson.databind.introspect.AnnotatedWithParams,boolean", "<sample:6>", "true"}, {"com.fasterxml.jackson.databind.deser.impl.CreatorCollector", "setDefaultCreator", "com.fasterxml.jackson.databind.introspect.AnnotatedWithParams", "<sample:2>"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{hasDefaultCreator=true, hasDelegatingCreator=false, hasPropertyBasedCreator=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput218() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.impl.CreatorCollector", "com.fasterxml.jackson.databind.deser.impl.CreatorCollector", "addPropertyCreator", new String[]{"com.fasterxml.jackson.databind.introspect.AnnotatedWithParams", "com.fasterxml.jackson.databind.deser.CreatorProperty[]"}, new String[]{"<null>", "<sample:0>"}, false, 7, new String[][]{{"com.fasterxml.jackson.databind.deser.impl.CreatorCollector", "hasDefaultCreator", ""}}, 3);
  assertNull(actual);
  assertEquals("receiver state after the call", "{hasDefaultCreator=false, hasDelegatingCreator=false, hasPropertyBasedCreator=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput219() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.impl.CreatorCollector", "com.fasterxml.jackson.databind.deser.impl.CreatorCollector", "addPropertyCreator", new String[]{"com.fasterxml.jackson.databind.introspect.AnnotatedWithParams", "com.fasterxml.jackson.databind.deser.CreatorProperty[]"}, new String[]{"<null>", "<sample:2>"}, false, 7, new String[][]{{"com.fasterxml.jackson.databind.deser.impl.CreatorCollector", "hasDefaultCreator", ""}}, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput220() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.impl.CreatorCollector", "com.fasterxml.jackson.databind.deser.impl.CreatorCollector", "verifyNonDup", new String[]{"com.fasterxml.jackson.databind.introspect.AnnotatedWithParams", "int", "boolean"}, new String[]{"<sample:6>", "1", "true"}, false, 0, null, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput221() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.impl.CreatorCollector", "com.fasterxml.jackson.databind.deser.impl.CreatorCollector", "hasPropertyBasedCreator", new String[]{}, new String[]{}, false, 21, new String[][]{{"com.fasterxml.jackson.databind.deser.impl.CreatorCollector", "addBooleanCreator", "com.fasterxml.jackson.databind.introspect.AnnotatedWithParams,boolean", "<null>", "true"}}, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput222() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.impl.CreatorCollector", "com.fasterxml.jackson.databind.deser.impl.CreatorCollector", "addDoubleCreator", new String[]{"com.fasterxml.jackson.databind.introspect.AnnotatedWithParams", "boolean"}, new String[]{"<sample:2>", "false"}, false, 5, new String[][]{{"com.fasterxml.jackson.databind.deser.impl.CreatorCollector", "setDefaultCreator", "com.fasterxml.jackson.databind.introspect.AnnotatedWithParams", "<sample:3>"}}, 3);
  assertNull(actual);
  assertEquals("receiver state after the call", "{hasDefaultCreator=true, hasDelegatingCreator=false, hasPropertyBasedCreator=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput223() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.impl.CreatorCollector", "com.fasterxml.jackson.databind.deser.impl.CreatorCollector", "addDoubleCreator", new String[]{"com.fasterxml.jackson.databind.introspect.AnnotatedWithParams", "boolean"}, new String[]{"<sample:11>", "false"}, false, 8, new String[][]{{"com.fasterxml.jackson.databind.deser.impl.CreatorCollector", "addPropertyCreator", "com.fasterxml.jackson.databind.introspect.AnnotatedWithParams,com.fasterxml.jackson.databind.deser.CreatorProperty[]", "<sample:11>", "<sample:1>"}, {"com.fasterxml.jackson.databind.deser.impl.CreatorCollector", "hasDelegatingCreator", ""}}, 2);
  assertNull(actual);
  assertEquals("receiver state after the call", "{hasDefaultCreator=false, hasDelegatingCreator=false, hasPropertyBasedCreator=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput224() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.impl.CreatorCollector", "com.fasterxml.jackson.databind.deser.impl.CreatorCollector", "constructValueInstantiator", new String[]{"com.fasterxml.jackson.databind.DeserializationConfig"}, new String[]{"<sample:7>"}, false, 13, new String[][]{{"com.fasterxml.jackson.databind.deser.impl.CreatorCollector", "addStringCreator", "com.fasterxml.jackson.databind.introspect.AnnotatedWithParams,boolean", "<sample:7>", "false"}, {"com.fasterxml.jackson.databind.deser.impl.CreatorCollector", "addDelegatingCreator", "com.fasterxml.jackson.databind.introspect.AnnotatedWithParams,com.fasterxml.jackson.databind.deser.CreatorProperty[]", "<sample:7>", "<empty>"}}, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput225() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.impl.CreatorCollector", "com.fasterxml.jackson.databind.deser.impl.CreatorCollector", "constructValueInstantiator", new String[]{"com.fasterxml.jackson.databind.DeserializationConfig"}, new String[]{"<sample:7>"}, false, 14, new String[][]{{"com.fasterxml.jackson.databind.deser.impl.CreatorCollector", "addIntCreator", "com.fasterxml.jackson.databind.introspect.AnnotatedWithParams", "<sample:7>"}, {"com.fasterxml.jackson.databind.deser.impl.CreatorCollector", "addDelegatingCreator", "com.fasterxml.jackson.databind.introspect.AnnotatedWithParams,com.fasterxml.jackson.databind.deser.CreatorProperty[]", "<sample:7>", "<sample:0>"}}, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput226() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.impl.CreatorCollector", "com.fasterxml.jackson.databind.deser.impl.CreatorCollector", "hasDelegatingCreator", new String[]{}, new String[]{}, false, 5, new String[][]{{"com.fasterxml.jackson.databind.deser.impl.CreatorCollector", "hasDelegatingCreator", ""}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{hasDefaultCreator=false, hasDelegatingCreator=false, hasPropertyBasedCreator=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput227() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.impl.CreatorCollector", "com.fasterxml.jackson.databind.deser.impl.CreatorCollector", "addBooleanCreator", new String[]{"com.fasterxml.jackson.databind.introspect.AnnotatedWithParams"}, new String[]{"<sample:11>"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.deser.impl.CreatorCollector", "hasDelegatingCreator", ""}, {"com.fasterxml.jackson.databind.deser.impl.CreatorCollector", "setDefaultCreator", "com.fasterxml.jackson.databind.introspect.AnnotatedWithParams", "<sample:2>"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{hasDefaultCreator=true, hasDelegatingCreator=false, hasPropertyBasedCreator=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput228() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.impl.CreatorCollector", "com.fasterxml.jackson.databind.deser.impl.CreatorCollector", "addBooleanCreator", new String[]{"com.fasterxml.jackson.databind.introspect.AnnotatedWithParams"}, new String[]{"<sample:9>"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.deser.impl.CreatorCollector", "addIntCreator", "com.fasterxml.jackson.databind.introspect.AnnotatedWithParams", "<sample:5>"}}, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput229() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.impl.CreatorCollector", "com.fasterxml.jackson.databind.deser.impl.CreatorCollector", "addBooleanCreator", new String[]{"com.fasterxml.jackson.databind.introspect.AnnotatedWithParams"}, new String[]{"<sample:3>"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.deser.impl.CreatorCollector", "addPropertyCreator", "com.fasterxml.jackson.databind.introspect.AnnotatedWithParams,com.fasterxml.jackson.databind.deser.CreatorProperty[]", "<sample:0>", "<empty>"}, {"com.fasterxml.jackson.databind.deser.impl.CreatorCollector", "addIntCreator", "com.fasterxml.jackson.databind.introspect.AnnotatedWithParams", "<sample:6>"}}, 1);
  assertNull(actual);
  assertEquals("receiver state after the call", "{hasDefaultCreator=false, hasDelegatingCreator=false, hasPropertyBasedCreator=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput230() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.impl.CreatorCollector", "com.fasterxml.jackson.databind.deser.impl.CreatorCollector", "addLongCreator", new String[]{"com.fasterxml.jackson.databind.introspect.AnnotatedWithParams"}, new String[]{"<sample:2>"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.deser.impl.CreatorCollector", "addIncompeteParameter", "com.fasterxml.jackson.databind.introspect.AnnotatedParameter", "<sample:2>"}}, 1);
  assertNull(actual);
  assertEquals("receiver state after the call", "{hasDefaultCreator=false, hasDelegatingCreator=false, hasPropertyBasedCreator=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput231() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.impl.CreatorCollector", "com.fasterxml.jackson.databind.deser.impl.CreatorCollector", "addLongCreator", new String[]{"com.fasterxml.jackson.databind.introspect.AnnotatedWithParams"}, new String[]{"<sample:0>"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.deser.impl.CreatorCollector", "addIncompeteParameter", "com.fasterxml.jackson.databind.introspect.AnnotatedParameter", "<sample:1>"}}, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput232() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.impl.CreatorCollector", "com.fasterxml.jackson.databind.deser.impl.CreatorCollector", "hasDelegatingCreator", new String[]{}, new String[]{}, false, 21, new String[][]{{"com.fasterxml.jackson.databind.deser.impl.CreatorCollector", "hasPropertyBasedCreator", ""}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput233() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.impl.CreatorCollector", "com.fasterxml.jackson.databind.deser.impl.CreatorCollector", "hasDelegatingCreator", new String[]{}, new String[]{}, false, 21, new String[][]{{"com.fasterxml.jackson.databind.deser.impl.CreatorCollector", "hasPropertyBasedCreator", ""}}, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput234() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.impl.CreatorCollector", "com.fasterxml.jackson.databind.deser.impl.CreatorCollector", "hasDelegatingCreator", new String[]{}, new String[]{}, false, 10, new String[][]{{"com.fasterxml.jackson.databind.deser.impl.CreatorCollector", "setDefaultCreator", "com.fasterxml.jackson.databind.introspect.AnnotatedWithParams", "<sample:7>"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{hasDefaultCreator=true, hasDelegatingCreator=false, hasPropertyBasedCreator=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput235() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.impl.CreatorCollector", "com.fasterxml.jackson.databind.deser.impl.CreatorCollector", "hasDelegatingCreator", new String[]{}, new String[]{}, false, 11, new String[][]{{"com.fasterxml.jackson.databind.deser.impl.CreatorCollector", "setDefaultCreator", "com.fasterxml.jackson.databind.introspect.AnnotatedWithParams", "<sample:7>"}, {"com.fasterxml.jackson.databind.deser.impl.CreatorCollector", "hasDefaultCreator", ""}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{hasDefaultCreator=true, hasDelegatingCreator=false, hasPropertyBasedCreator=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput236() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.impl.CreatorCollector", "com.fasterxml.jackson.databind.deser.impl.CreatorCollector", "addPropertyCreator", new String[]{"com.fasterxml.jackson.databind.introspect.AnnotatedWithParams", "com.fasterxml.jackson.databind.deser.CreatorProperty[]"}, new String[]{"<null>", "<sample:0>"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.deser.impl.CreatorCollector", "addBooleanCreator", "com.fasterxml.jackson.databind.introspect.AnnotatedWithParams", "<sample:11>"}}, 1);
  assertNull(actual);
  assertEquals("receiver state after the call", "{hasDefaultCreator=false, hasDelegatingCreator=false, hasPropertyBasedCreator=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput237() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.impl.CreatorCollector", "com.fasterxml.jackson.databind.deser.impl.CreatorCollector", "hasDefaultCreator", new String[]{}, new String[]{}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.deser.impl.CreatorCollector", "verifyNonDup", "com.fasterxml.jackson.databind.introspect.AnnotatedWithParams,int,boolean", "<sample:3>", "6", "true"}, {"com.fasterxml.jackson.databind.deser.impl.CreatorCollector", "addDoubleCreator", "com.fasterxml.jackson.databind.introspect.AnnotatedWithParams", "<sample:3>"}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{hasDefaultCreator=false, hasDelegatingCreator=true, hasPropertyBasedCreator=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput238() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.impl.CreatorCollector", "com.fasterxml.jackson.databind.deser.impl.CreatorCollector", "hasPropertyBasedCreator", new String[]{}, new String[]{}, false, 4, new String[][]{{"com.fasterxml.jackson.databind.deser.impl.CreatorCollector", "addLongCreator", "com.fasterxml.jackson.databind.introspect.AnnotatedWithParams", "<sample:5>"}, {"com.fasterxml.jackson.databind.deser.impl.CreatorCollector", "setDefaultCreator", "com.fasterxml.jackson.databind.introspect.AnnotatedWithParams", "<sample:3>"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{hasDefaultCreator=true, hasDelegatingCreator=false, hasPropertyBasedCreator=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput239() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.impl.CreatorCollector", "com.fasterxml.jackson.databind.deser.impl.CreatorCollector", "addDelegatingCreator", new String[]{"com.fasterxml.jackson.databind.introspect.AnnotatedWithParams", "boolean", "com.fasterxml.jackson.databind.deser.SettableBeanProperty[]"}, new String[]{"<sample:2>", "true", "<null>"}, false, 0, null, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.reflect.GenericSignatureFormatError", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput240() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.impl.CreatorCollector", "com.fasterxml.jackson.databind.deser.impl.CreatorCollector", "addBooleanCreator", new String[]{"com.fasterxml.jackson.databind.introspect.AnnotatedWithParams"}, new String[]{"<sample:2>"}, false, 2, new String[][]{{"com.fasterxml.jackson.databind.deser.impl.CreatorCollector", "addLongCreator", "com.fasterxml.jackson.databind.introspect.AnnotatedWithParams", "<sample:2>"}, {"com.fasterxml.jackson.databind.deser.impl.CreatorCollector", "addPropertyCreator", "com.fasterxml.jackson.databind.introspect.AnnotatedWithParams,com.fasterxml.jackson.databind.deser.CreatorProperty[]", "<null>", "<empty>"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput241() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.impl.CreatorCollector", "com.fasterxml.jackson.databind.deser.impl.CreatorCollector", "addIntCreator", new String[]{"com.fasterxml.jackson.databind.introspect.AnnotatedWithParams"}, new String[]{"<sample:6>"}, false, 13, new String[][]{{"com.fasterxml.jackson.databind.deser.impl.CreatorCollector", "hasDelegatingCreator", ""}, {"com.fasterxml.jackson.databind.deser.impl.CreatorCollector", "hasDefaultCreator", ""}, {"com.fasterxml.jackson.databind.deser.impl.CreatorCollector", "addDelegatingCreator", "com.fasterxml.jackson.databind.introspect.AnnotatedWithParams,com.fasterxml.jackson.databind.deser.CreatorProperty[]", "<sample:3>", "<sample:0>"}}, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput242() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.impl.CreatorCollector", "com.fasterxml.jackson.databind.deser.impl.CreatorCollector", "verifyNonDup", new String[]{"com.fasterxml.jackson.databind.introspect.AnnotatedWithParams", "int", "boolean"}, new String[]{"<sample:4>", "5", "true"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.deser.impl.CreatorCollector", "hasPropertyBasedCreator", ""}}, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput243() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.impl.CreatorCollector", "com.fasterxml.jackson.databind.deser.impl.CreatorCollector", "addBooleanCreator", new String[]{"com.fasterxml.jackson.databind.introspect.AnnotatedWithParams", "boolean"}, new String[]{"<sample:7>", "false"}, false, 7, new String[][]{{"com.fasterxml.jackson.databind.deser.impl.CreatorCollector", "setDefaultCreator", "com.fasterxml.jackson.databind.introspect.AnnotatedWithParams", "<sample:7>"}}, 3);
  assertNull(actual);
  assertEquals("receiver state after the call", "{hasDefaultCreator=true, hasDelegatingCreator=false, hasPropertyBasedCreator=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput244() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.impl.CreatorCollector", "com.fasterxml.jackson.databind.deser.impl.CreatorCollector", "verifyNonDup", new String[]{"com.fasterxml.jackson.databind.introspect.AnnotatedWithParams", "int", "boolean"}, new String[]{"<sample:3>", "6", "true"}, false, 7, new String[][]{{"com.fasterxml.jackson.databind.deser.impl.CreatorCollector", "setDefaultCreator", "com.fasterxml.jackson.databind.introspect.AnnotatedWithParams", "<sample:11>"}, {"com.fasterxml.jackson.databind.deser.impl.CreatorCollector", "addDoubleCreator", "com.fasterxml.jackson.databind.introspect.AnnotatedWithParams", "<sample:2>"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
  assertEquals("receiver state after the call", "{hasDefaultCreator=true, hasDelegatingCreator=true, hasPropertyBasedCreator=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput245() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.impl.CreatorCollector", "com.fasterxml.jackson.databind.deser.impl.CreatorCollector", "addDelegatingCreator", new String[]{"com.fasterxml.jackson.databind.introspect.AnnotatedWithParams", "com.fasterxml.jackson.databind.deser.CreatorProperty[]"}, new String[]{"<sample:1>", "<sample:0>"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.deser.impl.CreatorCollector", "hasDefaultCreator", ""}, {"com.fasterxml.jackson.databind.deser.impl.CreatorCollector", "hasDelegatingCreator", ""}}, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput246() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.impl.CreatorCollector", "com.fasterxml.jackson.databind.deser.impl.CreatorCollector", "addDelegatingCreator", new String[]{"com.fasterxml.jackson.databind.introspect.AnnotatedWithParams", "com.fasterxml.jackson.databind.deser.CreatorProperty[]"}, new String[]{"<sample:2>", "<sample:0>"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.deser.impl.CreatorCollector", "hasDefaultCreator", ""}, {"com.fasterxml.jackson.databind.deser.impl.CreatorCollector", "hasDelegatingCreator", ""}}, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.reflect.GenericSignatureFormatError", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput247() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.impl.CreatorCollector", "com.fasterxml.jackson.databind.deser.impl.CreatorCollector", "addStringCreator", new String[]{"com.fasterxml.jackson.databind.introspect.AnnotatedWithParams"}, new String[]{"<sample:11>"}, false, 10, new String[][]{{"com.fasterxml.jackson.databind.deser.impl.CreatorCollector", "addLongCreator", "com.fasterxml.jackson.databind.introspect.AnnotatedWithParams,boolean", "<sample:5>", "false"}, {"com.fasterxml.jackson.databind.deser.impl.CreatorCollector", "addPropertyCreator", "com.fasterxml.jackson.databind.introspect.AnnotatedWithParams,com.fasterxml.jackson.databind.deser.CreatorProperty[]", "<sample:2>", "<sample:0>"}}, 1);
  assertNull(actual);
  assertEquals("receiver state after the call", "{hasDefaultCreator=false, hasDelegatingCreator=false, hasPropertyBasedCreator=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput248() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.impl.CreatorCollector", "com.fasterxml.jackson.databind.deser.impl.CreatorCollector", "addPropertyCreator", new String[]{"com.fasterxml.jackson.databind.introspect.AnnotatedWithParams", "boolean", "com.fasterxml.jackson.databind.deser.SettableBeanProperty[]"}, new String[]{"<sample:9>", "false", "<null>"}, false, 0, null, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput249() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.impl.CreatorCollector", "com.fasterxml.jackson.databind.deser.impl.CreatorCollector", "addPropertyCreator", new String[]{"com.fasterxml.jackson.databind.introspect.AnnotatedWithParams", "boolean", "com.fasterxml.jackson.databind.deser.SettableBeanProperty[]"}, new String[]{"<sample:11>", "false", "<sample:0>"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.deser.impl.CreatorCollector", "addIntCreator", "com.fasterxml.jackson.databind.introspect.AnnotatedWithParams", "<sample:1>"}}, 2);
  assertNull(actual);
  assertEquals("receiver state after the call", "{hasDefaultCreator=false, hasDelegatingCreator=false, hasPropertyBasedCreator=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput250() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.impl.CreatorCollector", "com.fasterxml.jackson.databind.deser.impl.CreatorCollector", "addDelegatingCreator", new String[]{"com.fasterxml.jackson.databind.introspect.AnnotatedWithParams", "boolean", "com.fasterxml.jackson.databind.deser.SettableBeanProperty[]"}, new String[]{"<sample:1>", "false", "<empty>"}, false, 6, new String[][]{{"com.fasterxml.jackson.databind.deser.impl.CreatorCollector", "addIncompeteParameter", "com.fasterxml.jackson.databind.introspect.AnnotatedParameter", "<sample:7>"}}, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput251() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.impl.CreatorCollector", "com.fasterxml.jackson.databind.deser.impl.CreatorCollector", "addPropertyCreator", new String[]{"com.fasterxml.jackson.databind.introspect.AnnotatedWithParams", "boolean", "com.fasterxml.jackson.databind.deser.SettableBeanProperty[]"}, new String[]{"<null>", "true", "<sample:0>"}, false);
  assertNull(actual);
  assertEquals("receiver state after the call", "{hasDefaultCreator=false, hasDelegatingCreator=false, hasPropertyBasedCreator=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput252() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.impl.CreatorCollector", "com.fasterxml.jackson.databind.deser.impl.CreatorCollector", "addPropertyCreator", new String[]{"com.fasterxml.jackson.databind.introspect.AnnotatedWithParams", "com.fasterxml.jackson.databind.deser.CreatorProperty[]"}, new String[]{"<sample:7>", "<empty>"}, false, 1, new String[][]{{"com.fasterxml.jackson.databind.deser.impl.CreatorCollector", "addDelegatingCreator", "com.fasterxml.jackson.databind.introspect.AnnotatedWithParams,com.fasterxml.jackson.databind.deser.CreatorProperty[]", "<sample:11>", "<null>"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{hasDefaultCreator=false, hasDelegatingCreator=true, hasPropertyBasedCreator=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput253() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.impl.CreatorCollector", "com.fasterxml.jackson.databind.deser.impl.CreatorCollector", "addBooleanCreator", new String[]{"com.fasterxml.jackson.databind.introspect.AnnotatedWithParams"}, new String[]{"<null>"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.deser.impl.CreatorCollector", "addBooleanCreator", "com.fasterxml.jackson.databind.introspect.AnnotatedWithParams", "<sample:0>"}, {"com.fasterxml.jackson.databind.deser.impl.CreatorCollector", "addBooleanCreator", "com.fasterxml.jackson.databind.introspect.AnnotatedWithParams,boolean", "<sample:1>", "false"}}, 3);
  assertNull(actual);
  assertEquals("receiver state after the call", "{hasDefaultCreator=false, hasDelegatingCreator=false, hasPropertyBasedCreator=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput254() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.impl.CreatorCollector", "com.fasterxml.jackson.databind.deser.impl.CreatorCollector", "addBooleanCreator", new String[]{"com.fasterxml.jackson.databind.introspect.AnnotatedWithParams"}, new String[]{"<sample:2>"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.deser.impl.CreatorCollector", "addBooleanCreator", "com.fasterxml.jackson.databind.introspect.AnnotatedWithParams", "<sample:7>"}, {"com.fasterxml.jackson.databind.deser.impl.CreatorCollector", "addPropertyCreator", "com.fasterxml.jackson.databind.introspect.AnnotatedWithParams,com.fasterxml.jackson.databind.deser.CreatorProperty[]", "<sample:3>", "<empty>"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{hasDefaultCreator=false, hasDelegatingCreator=false, hasPropertyBasedCreator=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput255() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.impl.CreatorCollector", "com.fasterxml.jackson.databind.deser.impl.CreatorCollector", "addIntCreator", new String[]{"com.fasterxml.jackson.databind.introspect.AnnotatedWithParams", "boolean"}, new String[]{"<sample:3>", "false"}, false, 0, null, 3);
  assertNull(actual);
  assertEquals("receiver state after the call", "{hasDefaultCreator=false, hasDelegatingCreator=false, hasPropertyBasedCreator=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput256() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.impl.CreatorCollector", "com.fasterxml.jackson.databind.deser.impl.CreatorCollector", "addPropertyCreator", new String[]{"com.fasterxml.jackson.databind.introspect.AnnotatedWithParams", "boolean", "com.fasterxml.jackson.databind.deser.SettableBeanProperty[]"}, new String[]{"<sample:8>", "true", "<sample:4>"}, false, 6, new String[][]{{"com.fasterxml.jackson.databind.deser.impl.CreatorCollector", "addLongCreator", "com.fasterxml.jackson.databind.introspect.AnnotatedWithParams", "<sample:5>"}}, 2);
  assertNull(actual);
  assertEquals("receiver state after the call", "{hasDefaultCreator=false, hasDelegatingCreator=false, hasPropertyBasedCreator=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput257() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.impl.CreatorCollector", "com.fasterxml.jackson.databind.deser.impl.CreatorCollector", "addBooleanCreator", new String[]{"com.fasterxml.jackson.databind.introspect.AnnotatedWithParams"}, new String[]{"<sample:9>"}, false, 1, new String[][]{}, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput258() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.impl.CreatorCollector", "com.fasterxml.jackson.databind.deser.impl.CreatorCollector", "addBooleanCreator", new String[]{"com.fasterxml.jackson.databind.introspect.AnnotatedWithParams"}, new String[]{"<sample:2>"}, false, 1, new String[][]{}, 2);
  assertNull(actual);
  assertEquals("receiver state after the call", "{hasDefaultCreator=false, hasDelegatingCreator=false, hasPropertyBasedCreator=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput259() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.impl.CreatorCollector", "com.fasterxml.jackson.databind.deser.impl.CreatorCollector", "addIntCreator", new String[]{"com.fasterxml.jackson.databind.introspect.AnnotatedWithParams", "boolean"}, new String[]{"<sample:7>", "false"}, false, 3, new String[][]{{"com.fasterxml.jackson.databind.deser.impl.CreatorCollector", "addDelegatingCreator", "com.fasterxml.jackson.databind.introspect.AnnotatedWithParams,com.fasterxml.jackson.databind.deser.CreatorProperty[]", "<sample:7>", "<null>"}, {"com.fasterxml.jackson.databind.deser.impl.CreatorCollector", "hasDelegatingCreator", ""}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{hasDefaultCreator=false, hasDelegatingCreator=true, hasPropertyBasedCreator=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput260() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.impl.CreatorCollector", "com.fasterxml.jackson.databind.deser.impl.CreatorCollector", "setDefaultCreator", new String[]{"com.fasterxml.jackson.databind.introspect.AnnotatedWithParams"}, new String[]{"<sample:7>"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.deser.impl.CreatorCollector", "hasDelegatingCreator", ""}}, 1);
  assertNull(actual);
  assertEquals("receiver state after the call", "{hasDefaultCreator=true, hasDelegatingCreator=false, hasPropertyBasedCreator=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput261() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.impl.CreatorCollector", "com.fasterxml.jackson.databind.deser.impl.CreatorCollector", "addStringCreator", new String[]{"com.fasterxml.jackson.databind.introspect.AnnotatedWithParams"}, new String[]{"<sample:7>"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.deser.impl.CreatorCollector", "addStringCreator", "com.fasterxml.jackson.databind.introspect.AnnotatedWithParams,boolean", "<sample:6>", "false"}, {"com.fasterxml.jackson.databind.deser.impl.CreatorCollector", "addDelegatingCreator", "com.fasterxml.jackson.databind.introspect.AnnotatedWithParams,com.fasterxml.jackson.databind.deser.CreatorProperty[]", "<sample:11>", "<sample:2>"}, {"com.fasterxml.jackson.databind.deser.impl.CreatorCollector", "constructValueInstantiator", "com.fasterxml.jackson.databind.DeserializationConfig", "<null>"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{hasDefaultCreator=false, hasDelegatingCreator=true, hasPropertyBasedCreator=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput262() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.impl.CreatorCollector", "com.fasterxml.jackson.databind.deser.impl.CreatorCollector", "addStringCreator", new String[]{"com.fasterxml.jackson.databind.introspect.AnnotatedWithParams"}, new String[]{"<sample:11>"}, false, 1, new String[][]{{"com.fasterxml.jackson.databind.deser.impl.CreatorCollector", "addDelegatingCreator", "com.fasterxml.jackson.databind.introspect.AnnotatedWithParams,com.fasterxml.jackson.databind.deser.CreatorProperty[]", "<sample:11>", "<sample:0>"}, {"com.fasterxml.jackson.databind.deser.impl.CreatorCollector", "constructValueInstantiator", "com.fasterxml.jackson.databind.DeserializationConfig", "<sample:5>"}, {"com.fasterxml.jackson.databind.deser.impl.CreatorCollector", "constructValueInstantiator", "com.fasterxml.jackson.databind.DeserializationConfig", "<sample:5>"}}, 1);
  assertNull(actual);
  assertEquals("receiver state after the call", "{hasDefaultCreator=false, hasDelegatingCreator=true, hasPropertyBasedCreator=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput263() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.impl.CreatorCollector", "com.fasterxml.jackson.databind.deser.impl.CreatorCollector", "addStringCreator", new String[]{"com.fasterxml.jackson.databind.introspect.AnnotatedWithParams"}, new String[]{"<sample:2>"}, false, 1, new String[][]{{"com.fasterxml.jackson.databind.deser.impl.CreatorCollector", "addDelegatingCreator", "com.fasterxml.jackson.databind.introspect.AnnotatedWithParams,com.fasterxml.jackson.databind.deser.CreatorProperty[]", "<sample:11>", "<sample:0>"}, {"com.fasterxml.jackson.databind.deser.impl.CreatorCollector", "addDelegatingCreator", "com.fasterxml.jackson.databind.introspect.AnnotatedWithParams,com.fasterxml.jackson.databind.deser.CreatorProperty[]", "<sample:4>", "<sample:1>"}, {"com.fasterxml.jackson.databind.deser.impl.CreatorCollector", "constructValueInstantiator", "com.fasterxml.jackson.databind.DeserializationConfig", "<sample:5>"}}, 2);
  assertNull(actual);
  assertEquals("receiver state after the call", "{hasDefaultCreator=false, hasDelegatingCreator=true, hasPropertyBasedCreator=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput264() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.impl.CreatorCollector", "com.fasterxml.jackson.databind.deser.impl.CreatorCollector", "addPropertyCreator", new String[]{"com.fasterxml.jackson.databind.introspect.AnnotatedWithParams", "boolean", "com.fasterxml.jackson.databind.deser.SettableBeanProperty[]"}, new String[]{"<null>", "false", "<sample:1>"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.deser.impl.CreatorCollector", "hasDefaultCreator", ""}}, 3);
  assertNull(actual);
  assertEquals("receiver state after the call", "{hasDefaultCreator=false, hasDelegatingCreator=false, hasPropertyBasedCreator=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput265() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.impl.CreatorCollector", "com.fasterxml.jackson.databind.deser.impl.CreatorCollector", "hasDelegatingCreator", new String[]{}, new String[]{}, false, 3, new String[][]{{"com.fasterxml.jackson.databind.deser.impl.CreatorCollector", "addPropertyCreator", "com.fasterxml.jackson.databind.introspect.AnnotatedWithParams,com.fasterxml.jackson.databind.deser.CreatorProperty[]", "<sample:11>", "<null>"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{hasDefaultCreator=false, hasDelegatingCreator=false, hasPropertyBasedCreator=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput266() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.impl.CreatorCollector", "com.fasterxml.jackson.databind.deser.impl.CreatorCollector", "addPropertyCreator", new String[]{"com.fasterxml.jackson.databind.introspect.AnnotatedWithParams", "boolean", "com.fasterxml.jackson.databind.deser.SettableBeanProperty[]"}, new String[]{"<null>", "true", "<sample:2>"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.deser.impl.CreatorCollector", "addStringCreator", "com.fasterxml.jackson.databind.introspect.AnnotatedWithParams,boolean", "<sample:3>", "true"}, {"com.fasterxml.jackson.databind.deser.impl.CreatorCollector", "addDelegatingCreator", "com.fasterxml.jackson.databind.introspect.AnnotatedWithParams,com.fasterxml.jackson.databind.deser.CreatorProperty[]", "<sample:3>", "<sample:0>"}, {"com.fasterxml.jackson.databind.deser.impl.CreatorCollector", "constructValueInstantiator", "com.fasterxml.jackson.databind.DeserializationConfig", "<sample:2>"}}, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput267() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.impl.CreatorCollector", "com.fasterxml.jackson.databind.deser.impl.CreatorCollector", "addPropertyCreator", new String[]{"com.fasterxml.jackson.databind.introspect.AnnotatedWithParams", "boolean", "com.fasterxml.jackson.databind.deser.SettableBeanProperty[]"}, new String[]{"<sample:0>", "true", "<sample:5>"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.deser.impl.CreatorCollector", "addDelegatingCreator", "com.fasterxml.jackson.databind.introspect.AnnotatedWithParams,com.fasterxml.jackson.databind.deser.CreatorProperty[]", "<sample:3>", "<sample:0>"}, {"com.fasterxml.jackson.databind.deser.impl.CreatorCollector", "constructValueInstantiator", "com.fasterxml.jackson.databind.DeserializationConfig", "<sample:7>"}}, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput268() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.impl.CreatorCollector", "com.fasterxml.jackson.databind.deser.impl.CreatorCollector", "addPropertyCreator", new String[]{"com.fasterxml.jackson.databind.introspect.AnnotatedWithParams", "boolean", "com.fasterxml.jackson.databind.deser.SettableBeanProperty[]"}, new String[]{"<sample:7>", "false", "<sample:2>"}, false, 13, new String[][]{{"com.fasterxml.jackson.databind.deser.impl.CreatorCollector", "addDelegatingCreator", "com.fasterxml.jackson.databind.introspect.AnnotatedWithParams,com.fasterxml.jackson.databind.deser.CreatorProperty[]", "<sample:3>", "<sample:0>"}, {"com.fasterxml.jackson.databind.deser.impl.CreatorCollector", "constructValueInstantiator", "com.fasterxml.jackson.databind.DeserializationConfig", "<sample:4>"}, {"com.fasterxml.jackson.databind.deser.impl.CreatorCollector", "addDelegatingCreator", "com.fasterxml.jackson.databind.introspect.AnnotatedWithParams,com.fasterxml.jackson.databind.deser.CreatorProperty[]", "<sample:3>", "<sample:1>"}}, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput269() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.impl.CreatorCollector", "com.fasterxml.jackson.databind.deser.impl.CreatorCollector", "addPropertyCreator", new String[]{"com.fasterxml.jackson.databind.introspect.AnnotatedWithParams", "boolean", "com.fasterxml.jackson.databind.deser.SettableBeanProperty[]"}, new String[]{"<sample:3>", "false", "<empty>"}, false, 13, new String[][]{{"com.fasterxml.jackson.databind.deser.impl.CreatorCollector", "addDelegatingCreator", "com.fasterxml.jackson.databind.introspect.AnnotatedWithParams,com.fasterxml.jackson.databind.deser.CreatorProperty[]", "<sample:11>", "<sample:0>"}, {"com.fasterxml.jackson.databind.deser.impl.CreatorCollector", "constructValueInstantiator", "com.fasterxml.jackson.databind.DeserializationConfig", "<sample:4>"}, {"com.fasterxml.jackson.databind.deser.impl.CreatorCollector", "addDelegatingCreator", "com.fasterxml.jackson.databind.introspect.AnnotatedWithParams,com.fasterxml.jackson.databind.deser.CreatorProperty[]", "<sample:3>", "<sample:1>"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{hasDefaultCreator=false, hasDelegatingCreator=true, hasPropertyBasedCreator=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput270() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.impl.CreatorCollector", "com.fasterxml.jackson.databind.deser.impl.CreatorCollector", "addPropertyCreator", new String[]{"com.fasterxml.jackson.databind.introspect.AnnotatedWithParams", "boolean", "com.fasterxml.jackson.databind.deser.SettableBeanProperty[]"}, new String[]{"<sample:7>", "true", "<sample:0>"}, false, 8, new String[][]{{"com.fasterxml.jackson.databind.deser.impl.CreatorCollector", "addDelegatingCreator", "com.fasterxml.jackson.databind.introspect.AnnotatedWithParams,com.fasterxml.jackson.databind.deser.CreatorProperty[]", "<sample:11>", "<sample:3>"}, {"com.fasterxml.jackson.databind.deser.impl.CreatorCollector", "constructValueInstantiator", "com.fasterxml.jackson.databind.DeserializationConfig", "<sample:5>"}, {"com.fasterxml.jackson.databind.deser.impl.CreatorCollector", "addDelegatingCreator", "com.fasterxml.jackson.databind.introspect.AnnotatedWithParams,com.fasterxml.jackson.databind.deser.CreatorProperty[]", "<sample:3>", "<sample:0>"}}, 3);
  assertNull(actual);
  assertEquals("receiver state after the call", "{hasDefaultCreator=false, hasDelegatingCreator=true, hasPropertyBasedCreator=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput271() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.impl.CreatorCollector", "com.fasterxml.jackson.databind.deser.impl.CreatorCollector", "addPropertyCreator", new String[]{"com.fasterxml.jackson.databind.introspect.AnnotatedWithParams", "boolean", "com.fasterxml.jackson.databind.deser.SettableBeanProperty[]"}, new String[]{"<sample:3>", "true", "<sample:1>"}, false, 9, new String[][]{{"com.fasterxml.jackson.databind.deser.impl.CreatorCollector", "addDelegatingCreator", "com.fasterxml.jackson.databind.introspect.AnnotatedWithParams,com.fasterxml.jackson.databind.deser.CreatorProperty[]", "<sample:11>", "<sample:2>"}, {"com.fasterxml.jackson.databind.deser.impl.CreatorCollector", "constructValueInstantiator", "com.fasterxml.jackson.databind.DeserializationConfig", "<sample:1>"}, {"com.fasterxml.jackson.databind.deser.impl.CreatorCollector", "addStringCreator", "com.fasterxml.jackson.databind.introspect.AnnotatedWithParams", "<sample:6>"}}, 1);
  assertNull(actual);
  assertEquals("receiver state after the call", "{hasDefaultCreator=false, hasDelegatingCreator=true, hasPropertyBasedCreator=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput272() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.impl.CreatorCollector", "com.fasterxml.jackson.databind.deser.impl.CreatorCollector", "addPropertyCreator", new String[]{"com.fasterxml.jackson.databind.introspect.AnnotatedWithParams", "boolean", "com.fasterxml.jackson.databind.deser.SettableBeanProperty[]"}, new String[]{"<null>", "false", "<sample:1>"}, false, 14, new String[][]{{"com.fasterxml.jackson.databind.deser.impl.CreatorCollector", "addIncompeteParameter", "com.fasterxml.jackson.databind.introspect.AnnotatedParameter", "<sample:2>"}, {"com.fasterxml.jackson.databind.deser.impl.CreatorCollector", "addDelegatingCreator", "com.fasterxml.jackson.databind.introspect.AnnotatedWithParams,com.fasterxml.jackson.databind.deser.CreatorProperty[]", "<sample:11>", "<sample:1>"}, {"com.fasterxml.jackson.databind.deser.impl.CreatorCollector", "constructValueInstantiator", "com.fasterxml.jackson.databind.DeserializationConfig", "<sample:5>"}}, 3);
  assertNull(actual);
  assertEquals("receiver state after the call", "{hasDefaultCreator=false, hasDelegatingCreator=true, hasPropertyBasedCreator=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput273() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.impl.CreatorCollector", "com.fasterxml.jackson.databind.deser.impl.CreatorCollector", "addPropertyCreator", new String[]{"com.fasterxml.jackson.databind.introspect.AnnotatedWithParams", "boolean", "com.fasterxml.jackson.databind.deser.SettableBeanProperty[]"}, new String[]{"<sample:10>", "false", "<sample:1>"}, false, 7, new String[][]{{"com.fasterxml.jackson.databind.deser.impl.CreatorCollector", "addDelegatingCreator", "com.fasterxml.jackson.databind.introspect.AnnotatedWithParams,boolean,com.fasterxml.jackson.databind.deser.SettableBeanProperty[]", "<sample:11>", "false", "<sample:0>"}, {"com.fasterxml.jackson.databind.deser.impl.CreatorCollector", "addDelegatingCreator", "com.fasterxml.jackson.databind.introspect.AnnotatedWithParams,com.fasterxml.jackson.databind.deser.CreatorProperty[]", "<sample:7>", "<sample:0>"}, {"com.fasterxml.jackson.databind.deser.impl.CreatorCollector", "constructValueInstantiator", "com.fasterxml.jackson.databind.DeserializationConfig", "<sample:1>"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{hasDefaultCreator=false, hasDelegatingCreator=true, hasPropertyBasedCreator=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput274() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.impl.CreatorCollector", "com.fasterxml.jackson.databind.deser.impl.CreatorCollector", "addPropertyCreator", new String[]{"com.fasterxml.jackson.databind.introspect.AnnotatedWithParams", "boolean", "com.fasterxml.jackson.databind.deser.SettableBeanProperty[]"}, new String[]{"<sample:10>", "false", "<sample:1>"}, false, 7, new String[][]{{"com.fasterxml.jackson.databind.deser.impl.CreatorCollector", "addDelegatingCreator", "com.fasterxml.jackson.databind.introspect.AnnotatedWithParams,boolean,com.fasterxml.jackson.databind.deser.SettableBeanProperty[]", "<sample:11>", "false", "<sample:0>"}, {"com.fasterxml.jackson.databind.deser.impl.CreatorCollector", "addDelegatingCreator", "com.fasterxml.jackson.databind.introspect.AnnotatedWithParams,com.fasterxml.jackson.databind.deser.CreatorProperty[]", "<sample:7>", "<sample:0>"}, {"com.fasterxml.jackson.databind.deser.impl.CreatorCollector", "constructValueInstantiator", "com.fasterxml.jackson.databind.DeserializationConfig", "<sample:1>"}}, 2);
  assertNull(actual);
  assertEquals("receiver state after the call", "{hasDefaultCreator=false, hasDelegatingCreator=true, hasPropertyBasedCreator=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput275() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.impl.CreatorCollector", "com.fasterxml.jackson.databind.deser.impl.CreatorCollector", "addPropertyCreator", new String[]{"com.fasterxml.jackson.databind.introspect.AnnotatedWithParams", "boolean", "com.fasterxml.jackson.databind.deser.SettableBeanProperty[]"}, new String[]{"<sample:2>", "true", "<sample:1>"}, false, 6, new String[][]{{"com.fasterxml.jackson.databind.deser.impl.CreatorCollector", "addDelegatingCreator", "com.fasterxml.jackson.databind.introspect.AnnotatedWithParams,boolean,com.fasterxml.jackson.databind.deser.SettableBeanProperty[]", "<sample:11>", "false", "<sample:0>"}, {"com.fasterxml.jackson.databind.deser.impl.CreatorCollector", "addDelegatingCreator", "com.fasterxml.jackson.databind.introspect.AnnotatedWithParams,com.fasterxml.jackson.databind.deser.CreatorProperty[]", "<sample:7>", "<sample:3>"}, {"com.fasterxml.jackson.databind.deser.impl.CreatorCollector", "constructValueInstantiator", "com.fasterxml.jackson.databind.DeserializationConfig", "<sample:0>"}}, 2);
  assertNull(actual);
  assertEquals("receiver state after the call", "{hasDefaultCreator=false, hasDelegatingCreator=true, hasPropertyBasedCreator=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput276() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.impl.CreatorCollector", "com.fasterxml.jackson.databind.deser.impl.CreatorCollector", "verifyNonDup", new String[]{"com.fasterxml.jackson.databind.introspect.AnnotatedWithParams", "int", "boolean"}, new String[]{"<sample:11>", "7", "true"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.deser.impl.CreatorCollector", "hasPropertyBasedCreator", ""}, {"com.fasterxml.jackson.databind.deser.impl.CreatorCollector", "addPropertyCreator", "com.fasterxml.jackson.databind.introspect.AnnotatedWithParams,boolean,com.fasterxml.jackson.databind.deser.SettableBeanProperty[]", "<sample:11>", "true", "<sample:2>"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput277() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.impl.CreatorCollector", "com.fasterxml.jackson.databind.deser.impl.CreatorCollector", "addDoubleCreator", new String[]{"com.fasterxml.jackson.databind.introspect.AnnotatedWithParams", "boolean"}, new String[]{"<sample:3>", "false"}, false, 0, null, 1);
  assertNull(actual);
  assertEquals("receiver state after the call", "{hasDefaultCreator=false, hasDelegatingCreator=false, hasPropertyBasedCreator=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput278() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.impl.CreatorCollector", "com.fasterxml.jackson.databind.deser.impl.CreatorCollector", "hasPropertyBasedCreator", new String[]{}, new String[]{}, false, 2, new String[][]{{"com.fasterxml.jackson.databind.deser.impl.CreatorCollector", "addIncompeteParameter", "com.fasterxml.jackson.databind.introspect.AnnotatedParameter", "<sample:8>"}, {"com.fasterxml.jackson.databind.deser.impl.CreatorCollector", "addDelegatingCreator", "com.fasterxml.jackson.databind.introspect.AnnotatedWithParams,boolean,com.fasterxml.jackson.databind.deser.SettableBeanProperty[]", "<sample:7>", "false", "<sample:0>"}, {"com.fasterxml.jackson.databind.deser.impl.CreatorCollector", "addDelegatingCreator", "com.fasterxml.jackson.databind.introspect.AnnotatedWithParams,boolean,com.fasterxml.jackson.databind.deser.SettableBeanProperty[]", "<sample:2>", "true", "<sample:2>"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{hasDefaultCreator=false, hasDelegatingCreator=true, hasPropertyBasedCreator=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput279() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.impl.CreatorCollector", "com.fasterxml.jackson.databind.deser.impl.CreatorCollector", "hasDelegatingCreator", new String[]{}, new String[]{}, false, 4, new String[][]{{"com.fasterxml.jackson.databind.deser.impl.CreatorCollector", "addPropertyCreator", "com.fasterxml.jackson.databind.introspect.AnnotatedWithParams,com.fasterxml.jackson.databind.deser.CreatorProperty[]", "<sample:11>", "<sample:0>"}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{hasDefaultCreator=false, hasDelegatingCreator=false, hasPropertyBasedCreator=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput280() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.impl.CreatorCollector", "com.fasterxml.jackson.databind.deser.impl.CreatorCollector", "setDefaultCreator", new String[]{"com.fasterxml.jackson.databind.introspect.AnnotatedWithParams"}, new String[]{"<sample:6>"}, false, 0, null, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput281() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.impl.CreatorCollector", "com.fasterxml.jackson.databind.deser.impl.CreatorCollector", "addLongCreator", new String[]{"com.fasterxml.jackson.databind.introspect.AnnotatedWithParams", "boolean"}, new String[]{"<sample:3>", "false"}, false, 0, null, 1);
  assertNull(actual);
  assertEquals("receiver state after the call", "{hasDefaultCreator=false, hasDelegatingCreator=false, hasPropertyBasedCreator=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput282() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.impl.CreatorCollector", "com.fasterxml.jackson.databind.deser.impl.CreatorCollector", "addLongCreator", new String[]{"com.fasterxml.jackson.databind.introspect.AnnotatedWithParams", "boolean"}, new String[]{"<sample:11>", "true"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.deser.impl.CreatorCollector", "addLongCreator", "com.fasterxml.jackson.databind.introspect.AnnotatedWithParams,boolean", "<sample:11>", "true"}, {"com.fasterxml.jackson.databind.deser.impl.CreatorCollector", "addStringCreator", "com.fasterxml.jackson.databind.introspect.AnnotatedWithParams", "<sample:9>"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput283() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.impl.CreatorCollector", "com.fasterxml.jackson.databind.deser.impl.CreatorCollector", "addIntCreator", new String[]{"com.fasterxml.jackson.databind.introspect.AnnotatedWithParams"}, new String[]{"<sample:2>"}, false, 3, new String[][]{{"com.fasterxml.jackson.databind.deser.impl.CreatorCollector", "addLongCreator", "com.fasterxml.jackson.databind.introspect.AnnotatedWithParams", "<sample:2>"}}, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput284() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.impl.CreatorCollector", "com.fasterxml.jackson.databind.deser.impl.CreatorCollector", "addDelegatingCreator", new String[]{"com.fasterxml.jackson.databind.introspect.AnnotatedWithParams", "boolean", "com.fasterxml.jackson.databind.deser.SettableBeanProperty[]"}, new String[]{"<sample:11>", "true", "<sample:2>"}, false, 1, new String[][]{{"com.fasterxml.jackson.databind.deser.impl.CreatorCollector", "addDelegatingCreator", "com.fasterxml.jackson.databind.introspect.AnnotatedWithParams,boolean,com.fasterxml.jackson.databind.deser.SettableBeanProperty[]", "<sample:2>", "false", "<null>"}}, 1);
  assertNull(actual);
  assertEquals("receiver state after the call", "{hasDefaultCreator=false, hasDelegatingCreator=true, hasPropertyBasedCreator=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput285() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.impl.CreatorCollector", "com.fasterxml.jackson.databind.deser.impl.CreatorCollector", "addDelegatingCreator", new String[]{"com.fasterxml.jackson.databind.introspect.AnnotatedWithParams", "boolean", "com.fasterxml.jackson.databind.deser.SettableBeanProperty[]"}, new String[]{"<sample:2>", "true", "<sample:2>"}, false, 1, new String[][]{{"com.fasterxml.jackson.databind.deser.impl.CreatorCollector", "addDelegatingCreator", "com.fasterxml.jackson.databind.introspect.AnnotatedWithParams,boolean,com.fasterxml.jackson.databind.deser.SettableBeanProperty[]", "<sample:2>", "false", "<null>"}}, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.reflect.GenericSignatureFormatError", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput286() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.impl.CreatorCollector", "com.fasterxml.jackson.databind.deser.impl.CreatorCollector", "addBooleanCreator", new String[]{"com.fasterxml.jackson.databind.introspect.AnnotatedWithParams", "boolean"}, new String[]{"<sample:3>", "true"}, false, 3, new String[][]{{"com.fasterxml.jackson.databind.deser.impl.CreatorCollector", "addLongCreator", "com.fasterxml.jackson.databind.introspect.AnnotatedWithParams", "<sample:6>"}, {"com.fasterxml.jackson.databind.deser.impl.CreatorCollector", "addDelegatingCreator", "com.fasterxml.jackson.databind.introspect.AnnotatedWithParams,com.fasterxml.jackson.databind.deser.CreatorProperty[]", "<sample:7>", "<sample:0>"}}, 2);
  assertNull(actual);
  assertEquals("receiver state after the call", "{hasDefaultCreator=false, hasDelegatingCreator=true, hasPropertyBasedCreator=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput287() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.impl.CreatorCollector", "com.fasterxml.jackson.databind.deser.impl.CreatorCollector", "addLongCreator", new String[]{"com.fasterxml.jackson.databind.introspect.AnnotatedWithParams"}, new String[]{"<sample:2>"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.deser.impl.CreatorCollector", "setDefaultCreator", "com.fasterxml.jackson.databind.introspect.AnnotatedWithParams", "<sample:3>"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{hasDefaultCreator=true, hasDelegatingCreator=false, hasPropertyBasedCreator=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput288() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.impl.CreatorCollector", "com.fasterxml.jackson.databind.deser.impl.CreatorCollector", "addDelegatingCreator", new String[]{"com.fasterxml.jackson.databind.introspect.AnnotatedWithParams", "boolean", "com.fasterxml.jackson.databind.deser.SettableBeanProperty[]"}, new String[]{"<sample:11>", "false", "<sample:1>"}, false, 0, null, 2);
  assertNull(actual);
  assertEquals("receiver state after the call", "{hasDefaultCreator=false, hasDelegatingCreator=true, hasPropertyBasedCreator=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput289() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.impl.CreatorCollector", "com.fasterxml.jackson.databind.deser.impl.CreatorCollector", "addDelegatingCreator", new String[]{"com.fasterxml.jackson.databind.introspect.AnnotatedWithParams", "boolean", "com.fasterxml.jackson.databind.deser.SettableBeanProperty[]"}, new String[]{"<sample:3>", "true", "<sample:1>"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.deser.impl.CreatorCollector", "setDefaultCreator", "com.fasterxml.jackson.databind.introspect.AnnotatedWithParams", "<sample:11>"}, {"com.fasterxml.jackson.databind.deser.impl.CreatorCollector", "addStringCreator", "com.fasterxml.jackson.databind.introspect.AnnotatedWithParams", "<sample:5>"}}, 2);
  assertNull(actual);
  assertEquals("receiver state after the call", "{hasDefaultCreator=true, hasDelegatingCreator=false, hasPropertyBasedCreator=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput290() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.impl.CreatorCollector", "com.fasterxml.jackson.databind.deser.impl.CreatorCollector", "addDelegatingCreator", new String[]{"com.fasterxml.jackson.databind.introspect.AnnotatedWithParams", "boolean", "com.fasterxml.jackson.databind.deser.SettableBeanProperty[]"}, new String[]{"<sample:11>", "true", "<sample:1>"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.deser.impl.CreatorCollector", "setDefaultCreator", "com.fasterxml.jackson.databind.introspect.AnnotatedWithParams", "<sample:11>"}, {"com.fasterxml.jackson.databind.deser.impl.CreatorCollector", "addStringCreator", "com.fasterxml.jackson.databind.introspect.AnnotatedWithParams", "<sample:5>"}}, 2);
  assertNull(actual);
  assertEquals("receiver state after the call", "{hasDefaultCreator=true, hasDelegatingCreator=true, hasPropertyBasedCreator=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput291() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.impl.CreatorCollector", "com.fasterxml.jackson.databind.deser.impl.CreatorCollector", "addDelegatingCreator", new String[]{"com.fasterxml.jackson.databind.introspect.AnnotatedWithParams", "boolean", "com.fasterxml.jackson.databind.deser.SettableBeanProperty[]"}, new String[]{"<sample:3>", "true", "<null>"}, false, 1, new String[][]{{"com.fasterxml.jackson.databind.deser.impl.CreatorCollector", "addStringCreator", "com.fasterxml.jackson.databind.introspect.AnnotatedWithParams", "<null>"}, {"com.fasterxml.jackson.databind.deser.impl.CreatorCollector", "addStringCreator", "com.fasterxml.jackson.databind.introspect.AnnotatedWithParams", "<sample:1>"}, {"com.fasterxml.jackson.databind.deser.impl.CreatorCollector", "addPropertyCreator", "com.fasterxml.jackson.databind.introspect.AnnotatedWithParams,com.fasterxml.jackson.databind.deser.CreatorProperty[]", "<sample:3>", "<sample:0>"}}, 3);
  assertNull(actual);
  assertEquals("receiver state after the call", "{hasDefaultCreator=false, hasDelegatingCreator=false, hasPropertyBasedCreator=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput292() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.impl.CreatorCollector", "com.fasterxml.jackson.databind.deser.impl.CreatorCollector", "addIncompeteParameter", new String[]{"com.fasterxml.jackson.databind.introspect.AnnotatedParameter"}, new String[]{"<sample:5>"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.deser.impl.CreatorCollector", "constructValueInstantiator", "com.fasterxml.jackson.databind.DeserializationConfig", "<sample:3>"}, {"com.fasterxml.jackson.databind.deser.impl.CreatorCollector", "setDefaultCreator", "com.fasterxml.jackson.databind.introspect.AnnotatedWithParams", "<sample:7>"}}, 2);
  assertNull(actual);
  assertEquals("receiver state after the call", "{hasDefaultCreator=true, hasDelegatingCreator=false, hasPropertyBasedCreator=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput293() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.impl.CreatorCollector", "com.fasterxml.jackson.databind.deser.impl.CreatorCollector", "addDelegatingCreator", new String[]{"com.fasterxml.jackson.databind.introspect.AnnotatedWithParams", "boolean", "com.fasterxml.jackson.databind.deser.SettableBeanProperty[]"}, new String[]{"<sample:3>", "false", "<sample:0>"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.deser.impl.CreatorCollector", "addBooleanCreator", "com.fasterxml.jackson.databind.introspect.AnnotatedWithParams", "<null>"}, {"com.fasterxml.jackson.databind.deser.impl.CreatorCollector", "setDefaultCreator", "com.fasterxml.jackson.databind.introspect.AnnotatedWithParams", "<sample:7>"}, {"com.fasterxml.jackson.databind.deser.impl.CreatorCollector", "constructValueInstantiator", "com.fasterxml.jackson.databind.DeserializationConfig", "<sample:1>"}}, 1);
  assertNull(actual);
  assertEquals("receiver state after the call", "{hasDefaultCreator=true, hasDelegatingCreator=false, hasPropertyBasedCreator=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput294() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.impl.CreatorCollector", "com.fasterxml.jackson.databind.deser.impl.CreatorCollector", "addDelegatingCreator", new String[]{"com.fasterxml.jackson.databind.introspect.AnnotatedWithParams", "boolean", "com.fasterxml.jackson.databind.deser.SettableBeanProperty[]"}, new String[]{"<sample:3>", "true", "<sample:0>"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.deser.impl.CreatorCollector", "addBooleanCreator", "com.fasterxml.jackson.databind.introspect.AnnotatedWithParams", "<null>"}, {"com.fasterxml.jackson.databind.deser.impl.CreatorCollector", "constructValueInstantiator", "com.fasterxml.jackson.databind.DeserializationConfig", "<sample:1>"}}, 1);
  assertNull(actual);
  assertEquals("receiver state after the call", "{hasDefaultCreator=false, hasDelegatingCreator=false, hasPropertyBasedCreator=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput295() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.impl.CreatorCollector", "com.fasterxml.jackson.databind.deser.impl.CreatorCollector", "addPropertyCreator", new String[]{"com.fasterxml.jackson.databind.introspect.AnnotatedWithParams", "com.fasterxml.jackson.databind.deser.CreatorProperty[]"}, new String[]{"<sample:3>", "<sample:0>"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.deser.impl.CreatorCollector", "addDelegatingCreator", "com.fasterxml.jackson.databind.introspect.AnnotatedWithParams,com.fasterxml.jackson.databind.deser.CreatorProperty[]", "<sample:5>", "<sample:1>"}, {"com.fasterxml.jackson.databind.deser.impl.CreatorCollector", "setDefaultCreator", "com.fasterxml.jackson.databind.introspect.AnnotatedWithParams", "<sample:3>"}}, 3);
  assertNull(actual);
  assertEquals("receiver state after the call", "{hasDefaultCreator=true, hasDelegatingCreator=false, hasPropertyBasedCreator=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput296() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.impl.CreatorCollector", "com.fasterxml.jackson.databind.deser.impl.CreatorCollector", "addLongCreator", new String[]{"com.fasterxml.jackson.databind.introspect.AnnotatedWithParams"}, new String[]{"<sample:2>"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.deser.impl.CreatorCollector", "setDefaultCreator", "com.fasterxml.jackson.databind.introspect.AnnotatedWithParams", "<sample:11>"}}, 3);
  assertNull(actual);
  assertEquals("receiver state after the call", "{hasDefaultCreator=true, hasDelegatingCreator=false, hasPropertyBasedCreator=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput297() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.impl.CreatorCollector", "com.fasterxml.jackson.databind.deser.impl.CreatorCollector", "addBooleanCreator", new String[]{"com.fasterxml.jackson.databind.introspect.AnnotatedWithParams", "boolean"}, new String[]{"<sample:7>", "false"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.deser.impl.CreatorCollector", "addLongCreator", "com.fasterxml.jackson.databind.introspect.AnnotatedWithParams", "<sample:0>"}, {"com.fasterxml.jackson.databind.deser.impl.CreatorCollector", "addPropertyCreator", "com.fasterxml.jackson.databind.introspect.AnnotatedWithParams,boolean,com.fasterxml.jackson.databind.deser.SettableBeanProperty[]", "<sample:2>", "true", "<empty>"}, {"com.fasterxml.jackson.databind.deser.impl.CreatorCollector", "addPropertyCreator", "com.fasterxml.jackson.databind.introspect.AnnotatedWithParams,boolean,com.fasterxml.jackson.databind.deser.SettableBeanProperty[]", "<sample:1>", "false", "<empty>"}}, 1);
  assertNull(actual);
  assertEquals("receiver state after the call", "{hasDefaultCreator=false, hasDelegatingCreator=false, hasPropertyBasedCreator=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput298() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.impl.CreatorCollector", "com.fasterxml.jackson.databind.deser.impl.CreatorCollector", "addDelegatingCreator", new String[]{"com.fasterxml.jackson.databind.introspect.AnnotatedWithParams", "boolean", "com.fasterxml.jackson.databind.deser.SettableBeanProperty[]"}, new String[]{"<sample:7>", "false", "<sample:0>"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.deser.impl.CreatorCollector", "addPropertyCreator", "com.fasterxml.jackson.databind.introspect.AnnotatedWithParams,com.fasterxml.jackson.databind.deser.CreatorProperty[]", "<sample:7>", "<empty>"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{hasDefaultCreator=false, hasDelegatingCreator=true, hasPropertyBasedCreator=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput299() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.impl.CreatorCollector", "com.fasterxml.jackson.databind.deser.impl.CreatorCollector", "addDelegatingCreator", new String[]{"com.fasterxml.jackson.databind.introspect.AnnotatedWithParams", "boolean", "com.fasterxml.jackson.databind.deser.SettableBeanProperty[]"}, new String[]{"<sample:2>", "true", "<sample:1>"}, false, 14, new String[][]{{"com.fasterxml.jackson.databind.deser.impl.CreatorCollector", "addPropertyCreator", "com.fasterxml.jackson.databind.introspect.AnnotatedWithParams,com.fasterxml.jackson.databind.deser.CreatorProperty[]", "<sample:11>", "<empty>"}}, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.reflect.GenericSignatureFormatError", thrown.getClass().getName());
 }
}
