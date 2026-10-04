package generated.algorithm;

import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;
import static org.junit.Assert.*;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class SimulatedAnnealingGeneratedTest {
 @Test(timeout = 20000)
 public void generatedInput000() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.std.StdValueInstantiator", "com.fasterxml.jackson.databind.deser.std.StdValueInstantiator", "getIncompleteParameter", new String[]{}, new String[]{}, false, 4, new String[][]{{"com.fasterxml.jackson.databind.deser.std.StdValueInstantiator", "createFromLong", "com.fasterxml.jackson.databind.DeserializationContext,long", "<sample:9>", "0"}, {"com.fasterxml.jackson.databind.deser.std.StdValueInstantiator", "canCreateFromString", ""}, {"com.fasterxml.jackson.databind.deser.std.StdValueInstantiator", "configureFromIntCreator", "com.fasterxml.jackson.databind.introspect.AnnotatedWithParams", "<sample:3>"}}, 3);
  assertNull(actual);
  assertEquals("receiver state after the call", "{canCreateFromBoolean=false, canCreateFromDouble=false, canCreateFromInt=true, canCreateFromLong=false, canCreateFromObjectWith=false, canCreateFromString=false, canCreateUsingArrayDelegate=false, can...#307#1878741", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput001() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.std.StdValueInstantiator", "com.fasterxml.jackson.databind.deser.std.StdValueInstantiator", "unwrapAndWrapException", new String[]{"com.fasterxml.jackson.databind.DeserializationContext", "java.lang.Throwable"}, new String[]{"<sample:2>", "<sample:1>"}, false, 15, new String[][]{{"com.fasterxml.jackson.databind.deser.std.StdValueInstantiator", "createUsingArrayDelegate", "com.fasterxml.jackson.databind.DeserializationContext,java.lang.Object", "<sample:9>", "<s:k{y>"}, {"com.fasterxml.jackson.databind.deser.std.StdValueInstantiator", "createFromInt", "com.fasterxml.jackson.databind.DeserializationContext,int", "<sample:3>", "0"}, {"com.fasterxml.jackson.databind.deser.std.StdValueInstantiator", "rewrapCtorProblem", "com.fasterxml.jackson.databind.DeserializationContext,java.lang.Throwable", "<sample:12>", "<sample:1>"}}, 1), new String[][]{{"setStackTrace", "java.lang.StackTraceElement[]", "1"}, {"getPath", "", "0"}});
  assertNotNull(actual);
  assertEquals("java.util.Collections$EmptyList", actual.getClass().getName());
  assertEquals("[]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{canCreateFromBoolean=false, canCreateFromDouble=false, canCreateFromInt=false, canCreateFromLong=false, canCreateFromObjectWith=false, canCreateFromString=false, canCreateUsingArrayDelegate=false, ca...#299#-1213177327", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput002() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.ValueInstantiator", "com.fasterxml.jackson.databind.deser.ValueInstantiator$Base", "canCreateFromDouble", new String[]{}, new String[]{}, false, 11, new String[][]{{"com.fasterxml.jackson.databind.deser.ValueInstantiator", "getArrayDelegateType", "com.fasterxml.jackson.databind.DeserializationConfig", "<sample:5>"}, {"com.fasterxml.jackson.databind.deser.ValueInstantiator", "getFromObjectArguments", "com.fasterxml.jackson.databind.DeserializationConfig", "<null>"}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{canCreateFromBoolean=false, canCreateFromDouble=false, canCreateFromInt=false, canCreateFromLong=false, canCreateFromObjectWith=false, canCreateFromString=false, canCreateUsingArrayDelegate=false, ca...#317#-1505475647", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput003() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.std.StdValueInstantiator", "com.fasterxml.jackson.databind.deser.std.StdValueInstantiator", "createUsingDelegate", new String[]{"com.fasterxml.jackson.databind.DeserializationContext", "java.lang.Object"}, new String[]{"<sample:5>", "<s:b>"}, false, 1, new String[][]{{"com.fasterxml.jackson.databind.deser.std.StdValueInstantiator", "configureFromBooleanCreator", "com.fasterxml.jackson.databind.introspect.AnnotatedWithParams", "<sample:3>"}, {"com.fasterxml.jackson.databind.deser.std.StdValueInstantiator", "getDelegateType", "com.fasterxml.jackson.databind.DeserializationConfig", "<sample:6>"}, {"com.fasterxml.jackson.databind.deser.std.StdValueInstantiator", "createFromString", "com.fasterxml.jackson.databind.DeserializationContext,java.lang.String", "<sample:1>", "i1.1234567890123456"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalStateException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput004() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.std.StdValueInstantiator", "com.fasterxml.jackson.databind.deser.std.StdValueInstantiator", "getDefaultCreator", new String[]{}, new String[]{}, false, 1, new String[][]{{"com.fasterxml.jackson.databind.deser.std.StdValueInstantiator", "getArrayDelegateType", "com.fasterxml.jackson.databind.DeserializationConfig", "<sample:6>"}, {"com.fasterxml.jackson.databind.deser.std.StdValueInstantiator", "_createFromStringFallbacks", "com.fasterxml.jackson.databind.DeserializationContext,java.lang.String", "<sample:6>", "1.1234567890123456"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{canCreateFromBoolean=false, canCreateFromDouble=false, canCreateFromInt=false, canCreateFromLong=false, canCreateFromObjectWith=false, canCreateFromString=false, canCreateUsingArrayDelegate=false, ca...#346#-691812784", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput005() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.std.StdValueInstantiator", "com.fasterxml.jackson.databind.deser.std.StdValueInstantiator", "configureFromArraySettings", new String[]{"com.fasterxml.jackson.databind.introspect.AnnotatedWithParams", "com.fasterxml.jackson.databind.JavaType", "com.fasterxml.jackson.databind.deser.SettableBeanProperty[]"}, new String[]{"<sample:6>", "<sample:6>", "<sample:2>"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.deser.std.StdValueInstantiator", "configureFromObjectSettings", "com.fasterxml.jackson.databind.introspect.AnnotatedWithParams,com.fasterxml.jackson.databind.introspect.AnnotatedWithParams,com.fasterxml.jackson.databind.JavaType,com.fasterxml.jackson.databind.deser.SettableBeanProperty[],com.fasterxml.jackson.databind.introspect.AnnotatedWithParams,com.fasterxml.jackson.databind.deser.SettableBeanProperty[]", "<sample:0>", "<null>", "<sample:7>", "<sample:2>", "<sample:6>", "<sample:0>"}, {"com.fasterxml.jackson.databind.deser.std.StdValueInstantiator", "configureFromObjectSettings", "com.fasterxml.jackson.databind.introspect.AnnotatedWithParams,com.fasterxml.jackson.databind.introspect.AnnotatedWithParams,com.fasterxml.jackson.databind.JavaType,com.fasterxml.jackson.databind.deser.SettableBeanProperty[],com.fasterxml.jackson.databind.introspect.AnnotatedWithParams,com.fasterxml.jackson.databind.deser.SettableBeanProperty[]", "<sample:2>", "<sample:4>", "<sample:1>", "<sample:2>", "<sample:2>", "<sample:0>"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{canCreateFromBoolean=false, canCreateFromDouble=false, canCreateFromInt=false, canCreateFromLong=false, canCreateFromObjectWith=true, canCreateFromString=false, canCreateUsingArrayDelegate=true, canC...#294#-438504278", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput006() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.ValueInstantiator", "com.fasterxml.jackson.databind.deser.ValueInstantiator$Base", "getIncompleteParameter", new String[]{}, new String[]{}, false, 33, new String[][]{{"com.fasterxml.jackson.databind.deser.ValueInstantiator", "getWithArgsCreator", ""}, {"com.fasterxml.jackson.databind.deser.ValueInstantiator", "createFromLong", "com.fasterxml.jackson.databind.DeserializationContext,long", "<sample:7>", "0"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{canCreateFromBoolean=false, canCreateFromDouble=false, canCreateFromInt=false, canCreateFromLong=false, canCreateFromObjectWith=false, canCreateFromString=false, canCreateUsingArrayDelegate=false, ca...#314#1636553649", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput007() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.std.StdValueInstantiator", "com.fasterxml.jackson.databind.deser.std.StdValueInstantiator", "getDelegateCreator", new String[]{}, new String[]{}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.deser.std.StdValueInstantiator", "configureFromDoubleCreator", "com.fasterxml.jackson.databind.introspect.AnnotatedWithParams", "<sample:5>"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{canCreateFromBoolean=false, canCreateFromDouble=true, canCreateFromInt=false, canCreateFromLong=false, canCreateFromObjectWith=false, canCreateFromString=false, canCreateUsingArrayDelegate=false, can...#297#1988385727", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput008() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.ValueInstantiator", "com.fasterxml.jackson.databind.deser.ValueInstantiator$Base", "getDelegateType", new String[]{"com.fasterxml.jackson.databind.DeserializationConfig"}, new String[]{"<sample:7>"}, false, 11, new String[][]{{"com.fasterxml.jackson.databind.deser.ValueInstantiator", "getArrayDelegateCreator", ""}, {"com.fasterxml.jackson.databind.deser.ValueInstantiator", "createUsingArrayDelegate", "com.fasterxml.jackson.databind.DeserializationContext,java.lang.Object", "<null>", "<i:0>"}, {"com.fasterxml.jackson.databind.deser.ValueInstantiator", "getDelegateCreator", ""}}, 1);
  assertNull(actual);
  assertEquals("receiver state after the call", "{canCreateFromBoolean=false, canCreateFromDouble=false, canCreateFromInt=false, canCreateFromLong=false, canCreateFromObjectWith=false, canCreateFromString=false, canCreateUsingArrayDelegate=false, ca...#317#-1505475647", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput009() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.std.StdValueInstantiator", "com.fasterxml.jackson.databind.deser.std.StdValueInstantiator", "getFromObjectArguments", new String[]{"com.fasterxml.jackson.databind.DeserializationConfig"}, new String[]{"<sample:2>"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.deser.std.StdValueInstantiator", "configureFromArraySettings", "com.fasterxml.jackson.databind.introspect.AnnotatedWithParams,com.fasterxml.jackson.databind.JavaType,com.fasterxml.jackson.databind.deser.SettableBeanProperty[]", "<sample:6>", "<sample:6>", "<empty>"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{canCreateFromBoolean=false, canCreateFromDouble=false, canCreateFromInt=false, canCreateFromLong=false, canCreateFromObjectWith=false, canCreateFromString=false, canCreateUsingArrayDelegate=true, can...#297#417376873", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput010() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.std.StdValueInstantiator", "com.fasterxml.jackson.databind.deser.std.StdValueInstantiator", "createFromString", new String[]{"com.fasterxml.jackson.databind.DeserializationContext", "java.lang.String"}, new String[]{"<sample:6>", "TITLE"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.deser.std.StdValueInstantiator", "configureFromStringCreator", "com.fasterxml.jackson.databind.introspect.AnnotatedWithParams", "<sample:5>"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput011() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.std.StdValueInstantiator", "com.fasterxml.jackson.databind.deser.std.StdValueInstantiator", "createUsingDefault", new String[]{"com.fasterxml.jackson.databind.DeserializationContext"}, new String[]{"<sample:4>"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.deser.std.StdValueInstantiator", "configureFromObjectSettings", "com.fasterxml.jackson.databind.introspect.AnnotatedWithParams,com.fasterxml.jackson.databind.introspect.AnnotatedWithParams,com.fasterxml.jackson.databind.JavaType,com.fasterxml.jackson.databind.deser.SettableBeanProperty[],com.fasterxml.jackson.databind.introspect.AnnotatedWithParams,com.fasterxml.jackson.databind.deser.SettableBeanProperty[]", "<sample:2>", "<sample:7>", "<sample:3>", "<sample:1>", "<sample:5>", "<empty>"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput012() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.std.StdValueInstantiator", "com.fasterxml.jackson.databind.deser.std.StdValueInstantiator", "createFromInt", new String[]{"com.fasterxml.jackson.databind.DeserializationContext", "int"}, new String[]{"<sample:1>", "-1"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.deser.std.StdValueInstantiator", "configureFromLongCreator", "com.fasterxml.jackson.databind.introspect.AnnotatedWithParams", "<sample:1>"}, {"com.fasterxml.jackson.databind.deser.std.StdValueInstantiator", "getValueClass", ""}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput013() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.std.StdValueInstantiator", "com.fasterxml.jackson.databind.deser.std.StdValueInstantiator", "getArrayDelegateCreator", new String[]{}, new String[]{}, false, 20, new String[][]{{"com.fasterxml.jackson.databind.deser.std.StdValueInstantiator", "configureFromIntCreator", "com.fasterxml.jackson.databind.introspect.AnnotatedWithParams", "<sample:4>"}, {"com.fasterxml.jackson.databind.deser.std.StdValueInstantiator", "createFromInt", "com.fasterxml.jackson.databind.DeserializationContext,int", "<sample:2>", "-2147483648"}, {"com.fasterxml.jackson.databind.deser.std.StdValueInstantiator", "rewrapCtorProblem", "com.fasterxml.jackson.databind.DeserializationContext,java.lang.Throwable", "<sample:0>", "<sample:6>"}}, 3);
  assertNull(actual);
  assertEquals("receiver state after the call", "{canCreateFromBoolean=false, canCreateFromDouble=false, canCreateFromInt=true, canCreateFromLong=false, canCreateFromObjectWith=false, canCreateFromString=false, canCreateUsingArrayDelegate=false, can...#307#1878741", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput014() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.std.StdValueInstantiator", "com.fasterxml.jackson.databind.deser.std.StdValueInstantiator", "configureFromLongCreator", new String[]{"com.fasterxml.jackson.databind.introspect.AnnotatedWithParams"}, new String[]{"<sample:1>"}, false, 4, new String[][]{{"com.fasterxml.jackson.databind.deser.std.StdValueInstantiator", "createFromObjectWith", "com.fasterxml.jackson.databind.DeserializationContext,java.lang.Object[]", "<sample:1>", "<sample:0>"}, {"com.fasterxml.jackson.databind.deser.std.StdValueInstantiator", "getWithArgsCreator", ""}}, 1);
  assertNull(actual);
  assertEquals("receiver state after the call", "{canCreateFromBoolean=false, canCreateFromDouble=false, canCreateFromInt=false, canCreateFromLong=true, canCreateFromObjectWith=false, canCreateFromString=false, canCreateUsingArrayDelegate=false, can...#307#965168219", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput015() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.std.StdValueInstantiator", "com.fasterxml.jackson.databind.deser.std.StdValueInstantiator", "createFromBoolean", new String[]{"com.fasterxml.jackson.databind.DeserializationContext", "boolean"}, new String[]{"<null>", "false"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.deser.std.StdValueInstantiator", "configureFromBooleanCreator", "com.fasterxml.jackson.databind.introspect.AnnotatedWithParams", "<sample:4>"}, {"com.fasterxml.jackson.databind.deser.std.StdValueInstantiator", "canCreateFromLong", ""}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput016() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.std.StdValueInstantiator", "com.fasterxml.jackson.databind.deser.std.StdValueInstantiator", "createFromLong", new String[]{"com.fasterxml.jackson.databind.DeserializationContext", "long"}, new String[]{"<sample:7>", "-7"}, false, 1, new String[][]{{"com.fasterxml.jackson.databind.deser.std.StdValueInstantiator", "createFromBoolean", "com.fasterxml.jackson.databind.DeserializationContext,boolean", "<sample:1>", "false"}, {"com.fasterxml.jackson.databind.deser.std.StdValueInstantiator", "configureFromLongCreator", "com.fasterxml.jackson.databind.introspect.AnnotatedWithParams", "<sample:5>"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput017() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.std.StdValueInstantiator", "com.fasterxml.jackson.databind.deser.std.StdValueInstantiator", "getValueTypeDesc", new String[]{}, new String[]{}, false, 14, new String[][]{{"com.fasterxml.jackson.databind.deser.std.StdValueInstantiator", "configureFromBooleanCreator", "com.fasterxml.jackson.databind.introspect.AnnotatedWithParams", "<sample:4>"}, {"com.fasterxml.jackson.databind.deser.std.StdValueInstantiator", "createUsingDefault", "com.fasterxml.jackson.databind.DeserializationContext", "<sample:2>"}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("UNKNOWN TYPE", String.valueOf(actual));
  assertEquals("receiver state after the call", "{canCreateFromBoolean=true, canCreateFromDouble=false, canCreateFromInt=false, canCreateFromLong=false, canCreateFromObjectWith=false, canCreateFromString=false, canCreateUsingArrayDelegate=false, can...#307#1700626987", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput018() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.std.StdValueInstantiator", "com.fasterxml.jackson.databind.deser.std.StdValueInstantiator", "unwrapAndWrapException", new String[]{"com.fasterxml.jackson.databind.DeserializationContext", "java.lang.Throwable"}, new String[]{"<sample:3>", "<sample:2>"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.deser.std.StdValueInstantiator", "configureFromArraySettings", "com.fasterxml.jackson.databind.introspect.AnnotatedWithParams,com.fasterxml.jackson.databind.JavaType,com.fasterxml.jackson.databind.deser.SettableBeanProperty[]", "<sample:3>", "<sample:0>", "<sample:2>"}, {"com.fasterxml.jackson.databind.deser.std.StdValueInstantiator", "createUsingArrayDelegate", "com.fasterxml.jackson.databind.DeserializationContext,java.lang.Object", "<sample:7>", "<i:-1>"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput019() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.std.StdValueInstantiator", "com.fasterxml.jackson.databind.deser.std.StdValueInstantiator", "createFromObjectWith", new String[]{"com.fasterxml.jackson.databind.DeserializationContext", "java.lang.Object[]"}, new String[]{"<sample:6>", "<null>"}, false, 14, new String[][]{{"com.fasterxml.jackson.databind.deser.std.StdValueInstantiator", "configureFromObjectSettings", "com.fasterxml.jackson.databind.introspect.AnnotatedWithParams,com.fasterxml.jackson.databind.introspect.AnnotatedWithParams,com.fasterxml.jackson.databind.JavaType,com.fasterxml.jackson.databind.deser.SettableBeanProperty[],com.fasterxml.jackson.databind.introspect.AnnotatedWithParams,com.fasterxml.jackson.databind.deser.SettableBeanProperty[]", "<sample:6>", "<sample:7>", "<sample:5>", "<empty>", "<sample:0>", "<sample:0>"}, {"com.fasterxml.jackson.databind.deser.std.StdValueInstantiator", "configureFromArraySettings", "com.fasterxml.jackson.databind.introspect.AnnotatedWithParams,com.fasterxml.jackson.databind.JavaType,com.fasterxml.jackson.databind.deser.SettableBeanProperty[]", "<sample:5>", "<sample:4>", "<null>"}, {"com.fasterxml.jackson.databind.deser.std.StdValueInstantiator", "createFromDouble", "com.fasterxml.jackson.databind.DeserializationContext,double", "<null>", "Infinity"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput020() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.std.StdValueInstantiator", "com.fasterxml.jackson.databind.deser.std.StdValueInstantiator", "configureFromStringCreator", new String[]{"com.fasterxml.jackson.databind.introspect.AnnotatedWithParams"}, new String[]{"<sample:7>"}, false, 2, new String[][]{{"com.fasterxml.jackson.databind.deser.std.StdValueInstantiator", "wrapException", "java.lang.Throwable", "<sample:3>"}, {"com.fasterxml.jackson.databind.deser.std.StdValueInstantiator", "configureIncompleteParameter", "com.fasterxml.jackson.databind.introspect.AnnotatedParameter", "<sample:7>"}}, 3);
  assertNull(actual);
  assertEquals("receiver state after the call", "{canCreateFromBoolean=false, canCreateFromDouble=false, canCreateFromInt=false, canCreateFromLong=false, canCreateFromObjectWith=false, canCreateFromString=true, canCreateUsingArrayDelegate=false, can...#312#595990765", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput021() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.ValueInstantiator", "com.fasterxml.jackson.databind.deser.ValueInstantiator$Base", "getValueTypeDesc", new String[]{}, new String[]{}, false, 2, new String[][]{{"com.fasterxml.jackson.databind.deser.ValueInstantiator", "createFromDouble", "com.fasterxml.jackson.databind.DeserializationContext,double", "<sample:9>", "Infinity"}, {"com.fasterxml.jackson.databind.deser.ValueInstantiator", "createUsingDefault", "com.fasterxml.jackson.databind.DeserializationContext", "<sample:7>"}, {"com.fasterxml.jackson.databind.deser.ValueInstantiator", "_createFromStringFallbacks", "com.fasterxml.jackson.databind.DeserializationContext,java.lang.String", "<sample:9>", ""}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("java.lang.Object", String.valueOf(actual));
  assertEquals("receiver state after the call", "{canCreateFromBoolean=false, canCreateFromDouble=false, canCreateFromInt=false, canCreateFromLong=false, canCreateFromObjectWith=false, canCreateFromString=false, canCreateUsingArrayDelegate=false, ca...#313#-516867540", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput022() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.std.StdValueInstantiator", "com.fasterxml.jackson.databind.deser.std.StdValueInstantiator", "createUsingArrayDelegate", new String[]{"com.fasterxml.jackson.databind.DeserializationContext", "java.lang.Object"}, new String[]{"<sample:10>", "<i:1>"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.deser.std.StdValueInstantiator", "createFromObjectWith", "com.fasterxml.jackson.databind.DeserializationContext,java.lang.Object[]", "<sample:2>", "<sample:2>"}, {"com.fasterxml.jackson.databind.deser.std.StdValueInstantiator", "configureFromObjectSettings", "com.fasterxml.jackson.databind.introspect.AnnotatedWithParams,com.fasterxml.jackson.databind.introspect.AnnotatedWithParams,com.fasterxml.jackson.databind.JavaType,com.fasterxml.jackson.databind.deser.SettableBeanProperty[],com.fasterxml.jackson.databind.introspect.AnnotatedWithParams,com.fasterxml.jackson.databind.deser.SettableBeanProperty[]", "<null>", "<sample:0>", "<sample:0>", "<sample:0>", "<sample:0>", "<sample:0>"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("com.fasterxml.jackson.databind.JsonMappingException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput023() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.ValueInstantiator", "com.fasterxml.jackson.databind.deser.ValueInstantiator$Base", "createFromObjectWith", new String[]{"com.fasterxml.jackson.databind.DeserializationContext", "com.fasterxml.jackson.databind.deser.SettableBeanProperty[]", "com.fasterxml.jackson.databind.deser.impl.PropertyValueBuffer"}, new String[]{"<sample:4>", "<sample:2>", "<sample:6>"}, false, 2, new String[][]{{"com.fasterxml.jackson.databind.deser.ValueInstantiator", "createFromString", "com.fasterxml.jackson.databind.DeserializationContext,java.lang.String", "<sample:7>", "<null>"}}, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalStateException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput024() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.std.StdValueInstantiator", "com.fasterxml.jackson.databind.deser.std.StdValueInstantiator", "getIncompleteParameter", new String[]{}, new String[]{}, false, 5, new String[][]{{"com.fasterxml.jackson.databind.deser.std.StdValueInstantiator", "createFromLong", "com.fasterxml.jackson.databind.DeserializationContext,long", "<sample:9>", "0"}, {"com.fasterxml.jackson.databind.deser.std.StdValueInstantiator", "canCreateFromString", ""}, {"com.fasterxml.jackson.databind.deser.std.StdValueInstantiator", "configureFromIntCreator", "com.fasterxml.jackson.databind.introspect.AnnotatedWithParams", "<sample:3>"}}, 3);
  assertNull(actual);
  assertEquals("receiver state after the call", "{canCreateFromBoolean=false, canCreateFromDouble=false, canCreateFromInt=true, canCreateFromLong=false, canCreateFromObjectWith=false, canCreateFromString=false, canCreateUsingArrayDelegate=false, can...#298#-1055719514", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput025() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.std.StdValueInstantiator", "com.fasterxml.jackson.databind.deser.std.StdValueInstantiator", "canCreateFromObjectWith", new String[]{}, new String[]{}, false, 3, new String[][]{{"com.fasterxml.jackson.databind.deser.std.StdValueInstantiator", "canCreateFromBoolean", ""}, {"com.fasterxml.jackson.databind.deser.std.StdValueInstantiator", "configureFromArraySettings", "com.fasterxml.jackson.databind.introspect.AnnotatedWithParams,com.fasterxml.jackson.databind.JavaType,com.fasterxml.jackson.databind.deser.SettableBeanProperty[]", "<sample:0>", "<sample:0>", "<sample:2>"}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{canCreateFromBoolean=false, canCreateFromDouble=false, canCreateFromInt=false, canCreateFromLong=false, canCreateFromObjectWith=false, canCreateFromString=false, canCreateUsingArrayDelegate=true, can...#322#180656140", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput026() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.std.StdValueInstantiator", "com.fasterxml.jackson.databind.deser.std.StdValueInstantiator", "getIncompleteParameter", new String[]{}, new String[]{}, false, 1, new String[][]{{"com.fasterxml.jackson.databind.deser.std.StdValueInstantiator", "createFromLong", "com.fasterxml.jackson.databind.DeserializationContext,long", "<sample:9>", "0"}, {"com.fasterxml.jackson.databind.deser.std.StdValueInstantiator", "configureFromIntCreator", "com.fasterxml.jackson.databind.introspect.AnnotatedWithParams", "<sample:3>"}}, 3);
  assertNull(actual);
  assertEquals("receiver state after the call", "{canCreateFromBoolean=false, canCreateFromDouble=false, canCreateFromInt=true, canCreateFromLong=false, canCreateFromObjectWith=false, canCreateFromString=false, canCreateUsingArrayDelegate=false, can...#344#-345351638", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput027() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.std.StdValueInstantiator", "com.fasterxml.jackson.databind.deser.std.StdValueInstantiator", "getIncompleteParameter", new String[]{}, new String[]{}, false, 1, new String[][]{{"com.fasterxml.jackson.databind.deser.std.StdValueInstantiator", "createFromLong", "com.fasterxml.jackson.databind.DeserializationContext,long", "<sample:9>", "0"}, {"com.fasterxml.jackson.databind.deser.std.StdValueInstantiator", "configureIncompleteParameter", "com.fasterxml.jackson.databind.introspect.AnnotatedParameter", "<sample:0>"}, {"com.fasterxml.jackson.databind.deser.std.StdValueInstantiator", "configureFromIntCreator", "com.fasterxml.jackson.databind.introspect.AnnotatedWithParams", "<sample:3>"}}, 3);
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.databind.introspect.AnnotatedParameter", actual.getClass().getName());
  assertEquals("[parameter #2147483647, annotations: [null]] {getIndex=2147483647, getModifiers=!NullPointerException, getName=, isPublic=!NullPointerException}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{canCreateFromBoolean=false, canCreateFromDouble=false, canCreateFromInt=true, canCreateFromLong=false, canCreateFromObjectWith=false, canCreateFromString=false, canCreateUsingArrayDelegate=false, can...#344#-345351638", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput028() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.std.StdValueInstantiator", "com.fasterxml.jackson.databind.deser.std.StdValueInstantiator", "getIncompleteParameter", new String[]{}, new String[]{}, false, 2, new String[][]{{"com.fasterxml.jackson.databind.deser.std.StdValueInstantiator", "createFromLong", "com.fasterxml.jackson.databind.DeserializationContext,long", "<sample:9>", "0"}, {"com.fasterxml.jackson.databind.deser.std.StdValueInstantiator", "configureIncompleteParameter", "com.fasterxml.jackson.databind.introspect.AnnotatedParameter", "<sample:0>"}, {"com.fasterxml.jackson.databind.deser.std.StdValueInstantiator", "configureFromIntCreator", "com.fasterxml.jackson.databind.introspect.AnnotatedWithParams", "<sample:3>"}}, 3);
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.databind.introspect.AnnotatedParameter", actual.getClass().getName());
  assertEquals("[parameter #2147483647, annotations: [null]] {getIndex=2147483647, getModifiers=!NullPointerException, getName=, isPublic=!NullPointerException}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{canCreateFromBoolean=false, canCreateFromDouble=false, canCreateFromInt=true, canCreateFromLong=false, canCreateFromObjectWith=false, canCreateFromString=false, canCreateUsingArrayDelegate=false, can...#312#354963339", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput029() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.std.StdValueInstantiator", "com.fasterxml.jackson.databind.deser.std.StdValueInstantiator", "getIncompleteParameter", new String[]{}, new String[]{}, false, 2, new String[][]{{"com.fasterxml.jackson.databind.deser.std.StdValueInstantiator", "createFromLong", "com.fasterxml.jackson.databind.DeserializationContext,long", "<sample:9>", "0"}, {"com.fasterxml.jackson.databind.deser.std.StdValueInstantiator", "configureIncompleteParameter", "com.fasterxml.jackson.databind.introspect.AnnotatedParameter", "<sample:3>"}, {"com.fasterxml.jackson.databind.deser.std.StdValueInstantiator", "configureFromIntCreator", "com.fasterxml.jackson.databind.introspect.AnnotatedWithParams", "<sample:3>"}}, 3);
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.databind.introspect.AnnotatedParameter", actual.getClass().getName());
  assertEquals("[parameter #4, annotations: [null]] {getIndex=4, getModifiers=!NullPointerException, getName=, isPublic=!NullPointerException}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{canCreateFromBoolean=false, canCreateFromDouble=false, canCreateFromInt=true, canCreateFromLong=false, canCreateFromObjectWith=false, canCreateFromString=false, canCreateUsingArrayDelegate=false, can...#312#354963339", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput030() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.std.StdValueInstantiator", "com.fasterxml.jackson.databind.deser.std.StdValueInstantiator", "getIncompleteParameter", new String[]{}, new String[]{}, false, 3, new String[][]{{"com.fasterxml.jackson.databind.deser.std.StdValueInstantiator", "createFromLong", "com.fasterxml.jackson.databind.DeserializationContext,long", "<sample:9>", "0"}, {"com.fasterxml.jackson.databind.deser.std.StdValueInstantiator", "configureIncompleteParameter", "com.fasterxml.jackson.databind.introspect.AnnotatedParameter", "<sample:0>"}, {"com.fasterxml.jackson.databind.deser.std.StdValueInstantiator", "configureFromIntCreator", "com.fasterxml.jackson.databind.introspect.AnnotatedWithParams", "<sample:3>"}}, 3);
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.databind.introspect.AnnotatedParameter", actual.getClass().getName());
  assertEquals("[parameter #2147483647, annotations: [null]] {getIndex=2147483647, getModifiers=!NullPointerException, getName=, isPublic=!NullPointerException}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{canCreateFromBoolean=false, canCreateFromDouble=false, canCreateFromInt=true, canCreateFromLong=false, canCreateFromObjectWith=false, canCreateFromString=false, canCreateUsingArrayDelegate=false, can...#322#243015484", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput031() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.std.StdValueInstantiator", "com.fasterxml.jackson.databind.deser.std.StdValueInstantiator", "getIncompleteParameter", new String[]{}, new String[]{}, false, 3, new String[][]{{"com.fasterxml.jackson.databind.deser.std.StdValueInstantiator", "createFromLong", "com.fasterxml.jackson.databind.DeserializationContext,long", "<sample:9>", "0"}, {"com.fasterxml.jackson.databind.deser.std.StdValueInstantiator", "configureIncompleteParameter", "com.fasterxml.jackson.databind.introspect.AnnotatedParameter", "<sample:0>"}, {"com.fasterxml.jackson.databind.deser.std.StdValueInstantiator", "configureFromIntCreator", "com.fasterxml.jackson.databind.introspect.AnnotatedWithParams", "<sample:3>"}}, 3), new String[][]{{"getDeclaringClass", "", "5"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput032() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.ValueInstantiator", "com.fasterxml.jackson.databind.deser.ValueInstantiator$Base", "getArrayDelegateCreator", new String[]{}, new String[]{}, false, 1, new String[][]{{"com.fasterxml.jackson.databind.deser.ValueInstantiator", "_createFromStringFallbacks", "com.fasterxml.jackson.databind.DeserializationContext,java.lang.String", "<sample:9>", "TITLE"}, {"com.fasterxml.jackson.databind.deser.ValueInstantiator", "createFromObjectWith", "com.fasterxml.jackson.databind.DeserializationContext,com.fasterxml.jackson.databind.deser.SettableBeanProperty[],com.fasterxml.jackson.databind.deser.impl.PropertyValueBuffer", "<sample:3>", "<empty>", "<sample:4>"}, {"com.fasterxml.jackson.databind.deser.ValueInstantiator", "getArrayDelegateCreator", ""}}, 2);
  assertNull(actual);
  assertEquals("receiver state after the call", "{canCreateFromBoolean=false, canCreateFromDouble=false, canCreateFromInt=false, canCreateFromLong=false, canCreateFromObjectWith=false, canCreateFromString=false, canCreateUsingArrayDelegate=false, ca...#359#219967482", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput033() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.ValueInstantiator", "com.fasterxml.jackson.databind.deser.ValueInstantiator$Base", "getArrayDelegateCreator", new String[]{}, new String[]{}, false, 2, new String[][]{{"com.fasterxml.jackson.databind.deser.ValueInstantiator", "_createFromStringFallbacks", "com.fasterxml.jackson.databind.DeserializationContext,java.lang.String", "<sample:9>", "TITLE"}, {"com.fasterxml.jackson.databind.deser.ValueInstantiator", "getArrayDelegateCreator", ""}}, 2);
  assertNull(actual);
  assertEquals("receiver state after the call", "{canCreateFromBoolean=false, canCreateFromDouble=false, canCreateFromInt=false, canCreateFromLong=false, canCreateFromObjectWith=false, canCreateFromString=false, canCreateUsingArrayDelegate=false, ca...#313#-516867540", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput034() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.ValueInstantiator", "com.fasterxml.jackson.databind.deser.ValueInstantiator$Base", "getArrayDelegateCreator", new String[]{}, new String[]{}, false, 3, new String[][]{{"com.fasterxml.jackson.databind.deser.ValueInstantiator", "_createFromStringFallbacks", "com.fasterxml.jackson.databind.DeserializationContext,java.lang.String", "<sample:9>", "TITLE"}, {"com.fasterxml.jackson.databind.deser.ValueInstantiator", "getArrayDelegateCreator", ""}}, 2);
  assertNull(actual);
  assertEquals("receiver state after the call", "{canCreateFromBoolean=false, canCreateFromDouble=false, canCreateFromInt=false, canCreateFromLong=false, canCreateFromObjectWith=false, canCreateFromString=false, canCreateUsingArrayDelegate=false, ca...#314#1636553649", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput035() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.ValueInstantiator", "com.fasterxml.jackson.databind.deser.ValueInstantiator$Base", "getArrayDelegateCreator", new String[]{}, new String[]{}, false, 4, new String[][]{{"com.fasterxml.jackson.databind.deser.ValueInstantiator", "_createFromStringFallbacks", "com.fasterxml.jackson.databind.DeserializationContext,java.lang.String", "<sample:9>", "TITLE"}, {"com.fasterxml.jackson.databind.deser.ValueInstantiator", "getArrayDelegateCreator", ""}}, 2);
  assertNull(actual);
  assertEquals("receiver state after the call", "{canCreateFromBoolean=false, canCreateFromDouble=false, canCreateFromInt=false, canCreateFromLong=false, canCreateFromObjectWith=false, canCreateFromString=false, canCreateUsingArrayDelegate=false, ca...#318#1611653153", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput036() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.ValueInstantiator", "com.fasterxml.jackson.databind.deser.ValueInstantiator$Base", "getArrayDelegateCreator", new String[]{}, new String[]{}, false, 5, new String[][]{{"com.fasterxml.jackson.databind.deser.ValueInstantiator", "_createFromStringFallbacks", "com.fasterxml.jackson.databind.DeserializationContext,java.lang.String", "<sample:9>", "TITLE"}, {"com.fasterxml.jackson.databind.deser.ValueInstantiator", "getArrayDelegateCreator", ""}}, 2);
  assertNull(actual);
  assertEquals("receiver state after the call", "{canCreateFromBoolean=false, canCreateFromDouble=false, canCreateFromInt=false, canCreateFromLong=false, canCreateFromObjectWith=false, canCreateFromString=false, canCreateUsingArrayDelegate=false, ca...#311#-229031103", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput037() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.std.StdValueInstantiator", "com.fasterxml.jackson.databind.deser.std.StdValueInstantiator", "configureFromObjectSettings", new String[]{"com.fasterxml.jackson.databind.introspect.AnnotatedWithParams", "com.fasterxml.jackson.databind.introspect.AnnotatedWithParams", "com.fasterxml.jackson.databind.JavaType", "com.fasterxml.jackson.databind.deser.SettableBeanProperty[]", "com.fasterxml.jackson.databind.introspect.AnnotatedWithParams", "com.fasterxml.jackson.databind.deser.SettableBeanProperty[]"}, new String[]{"<sample:4>", "<sample:7>", "<sample:2>", "<empty>", "<sample:7>", "<sample:0>"}, false, 0, null, 2);
  assertNull(actual);
  assertEquals("receiver state after the call", "{canCreateFromBoolean=false, canCreateFromDouble=false, canCreateFromInt=false, canCreateFromLong=false, canCreateFromObjectWith=true, canCreateFromString=false, canCreateUsingArrayDelegate=false, can...#295#-1741164875", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput038() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.std.StdValueInstantiator", "com.fasterxml.jackson.databind.deser.std.StdValueInstantiator", "unwrapAndWrapException", new String[]{"com.fasterxml.jackson.databind.DeserializationContext", "java.lang.Throwable"}, new String[]{"<sample:9>", "<empty>"}, false, 0, null, 2);
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.databind.JsonMappingException", actual.getClass().getName());
  assertEquals("com.fasterxml.jackson.databind.JsonMappingException: Can not construct instance of java.lang.Object, problem: null {getLocalizedMessage=Can not construct instance of java.lang.Object, problem: nul.., ...#472#368045148", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{canCreateFromBoolean=false, canCreateFromDouble=false, canCreateFromInt=false, canCreateFromLong=false, canCreateFromObjectWith=false, canCreateFromString=false, canCreateUsingArrayDelegate=false, ca...#299#-1213177389", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput039() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.std.StdValueInstantiator", "com.fasterxml.jackson.databind.deser.std.StdValueInstantiator", "unwrapAndWrapException", new String[]{"com.fasterxml.jackson.databind.DeserializationContext", "java.lang.Throwable"}, new String[]{"<sample:0>", "<sample:4>"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.deser.std.StdValueInstantiator", "createFromObjectWith", "com.fasterxml.jackson.databind.DeserializationContext,com.fasterxml.jackson.databind.deser.SettableBeanProperty[],com.fasterxml.jackson.databind.deser.impl.PropertyValueBuffer", "<sample:2>", "<null>", "<sample:1>"}, {"com.fasterxml.jackson.databind.deser.std.StdValueInstantiator", "createUsingArrayDelegate", "com.fasterxml.jackson.databind.DeserializationContext,java.lang.Object", "<sample:4>", "<s:key>"}}, 1), new String[][]{{"setStackTrace", "java.lang.StackTraceElement[]", "6"}});
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.databind.JsonMappingException", actual.getClass().getName());
  assertEquals("com.fasterxml.jackson.databind.JsonMappingException: Can not construct instance of java.lang.Object, problem: a {getLocalizedMessage=Can not construct instance of java.lang.Object, problem: a, getMess...#414#-368377506", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{canCreateFromBoolean=false, canCreateFromDouble=false, canCreateFromInt=false, canCreateFromLong=false, canCreateFromObjectWith=false, canCreateFromString=false, canCreateUsingArrayDelegate=false, ca...#299#-1213177389", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput040() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.std.StdValueInstantiator", "com.fasterxml.jackson.databind.deser.std.StdValueInstantiator", "unwrapAndWrapException", new String[]{"com.fasterxml.jackson.databind.DeserializationContext", "java.lang.Throwable"}, new String[]{"<sample:0>", "<null>"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.deser.std.StdValueInstantiator", "createFromObjectWith", "com.fasterxml.jackson.databind.DeserializationContext,com.fasterxml.jackson.databind.deser.SettableBeanProperty[],com.fasterxml.jackson.databind.deser.impl.PropertyValueBuffer", "<sample:2>", "<null>", "<sample:1>"}, {"com.fasterxml.jackson.databind.deser.std.StdValueInstantiator", "createUsingArrayDelegate", "com.fasterxml.jackson.databind.DeserializationContext,java.lang.Object", "<sample:4>", "<s:key>"}}, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput041() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.std.StdValueInstantiator", "com.fasterxml.jackson.databind.deser.std.StdValueInstantiator", "unwrapAndWrapException", new String[]{"com.fasterxml.jackson.databind.DeserializationContext", "java.lang.Throwable"}, new String[]{"<sample:5>", "<sample:2>"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.deser.std.StdValueInstantiator", "createFromObjectWith", "com.fasterxml.jackson.databind.DeserializationContext,com.fasterxml.jackson.databind.deser.SettableBeanProperty[],com.fasterxml.jackson.databind.deser.impl.PropertyValueBuffer", "<sample:2>", "<empty>", "<sample:5>"}, {"com.fasterxml.jackson.databind.deser.std.StdValueInstantiator", "createUsingArrayDelegate", "com.fasterxml.jackson.databind.DeserializationContext,java.lang.Object", "<sample:4>", "<s:ke{y>"}, {"com.fasterxml.jackson.databind.deser.std.StdValueInstantiator", "getFromObjectArguments", "com.fasterxml.jackson.databind.DeserializationConfig", "<sample:1>"}}, 1), new String[][]{{"setStackTrace", "java.lang.StackTraceElement[]", "5"}});
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.databind.JsonMappingException", actual.getClass().getName());
  assertEquals("com.fasterxml.jackson.databind.JsonMappingException: Can not construct instance of java.lang.Object, problem: java.lang.Throwable:  {getLocalizedMessage=Can not construct instance of java.lang.Object,...#475#-981079191", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{canCreateFromBoolean=false, canCreateFromDouble=false, canCreateFromInt=false, canCreateFromLong=false, canCreateFromObjectWith=false, canCreateFromString=false, canCreateUsingArrayDelegate=false, ca...#299#-1213177389", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput042() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.std.StdValueInstantiator", "com.fasterxml.jackson.databind.deser.std.StdValueInstantiator", "unwrapAndWrapException", new String[]{"com.fasterxml.jackson.databind.DeserializationContext", "java.lang.Throwable"}, new String[]{"<sample:9>", "<sample:0>"}, false, 8, new String[][]{{"com.fasterxml.jackson.databind.deser.std.StdValueInstantiator", "createUsingArrayDelegate", "com.fasterxml.jackson.databind.DeserializationContext,java.lang.Object", "<sample:6>", "<s:ke{y>"}, {"com.fasterxml.jackson.databind.deser.std.StdValueInstantiator", "getFromObjectArguments", "com.fasterxml.jackson.databind.DeserializationConfig", "<sample:1>"}}, 1), new String[][]{{"setStackTrace", "java.lang.StackTraceElement[]", "5"}});
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.databind.JsonMappingException", actual.getClass().getName());
  assertEquals("com.fasterxml.jackson.databind.JsonMappingException: Can not construct instance of java.lang.Object, problem: null {getLocalizedMessage=Can not construct instance of java.lang.Object, problem: nul.., ...#458#1184771292", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{canCreateFromBoolean=false, canCreateFromDouble=false, canCreateFromInt=false, canCreateFromLong=false, canCreateFromObjectWith=false, canCreateFromString=false, canCreateUsingArrayDelegate=false, ca...#309#-1951095057", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput043() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.std.StdValueInstantiator", "com.fasterxml.jackson.databind.deser.std.StdValueInstantiator", "unwrapAndWrapException", new String[]{"com.fasterxml.jackson.databind.DeserializationContext", "java.lang.Throwable"}, new String[]{"<sample:9>", "<sample:2>"}, false, 9, new String[][]{{"com.fasterxml.jackson.databind.deser.std.StdValueInstantiator", "createUsingArrayDelegate", "com.fasterxml.jackson.databind.DeserializationContext,java.lang.Object", "<sample:6>", "<s:k{y>"}, {"com.fasterxml.jackson.databind.deser.std.StdValueInstantiator", "getFromObjectArguments", "com.fasterxml.jackson.databind.DeserializationConfig", "<sample:3>"}}, 1), new String[][]{{"setStackTrace", "java.lang.StackTraceElement[]", "5"}});
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.databind.JsonMappingException", actual.getClass().getName());
  assertEquals("com.fasterxml.jackson.databind.JsonMappingException: Can not construct instance of java.lang.Object, problem: java.lang.Throwable:  {getLocalizedMessage=Can not construct instance of java.lang.Object,...#475#-981079191", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{canCreateFromBoolean=false, canCreateFromDouble=false, canCreateFromInt=false, canCreateFromLong=false, canCreateFromObjectWith=false, canCreateFromString=false, canCreateUsingArrayDelegate=false, ca...#299#-1213177358", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput044() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.std.StdValueInstantiator", "com.fasterxml.jackson.databind.deser.std.StdValueInstantiator", "unwrapAndWrapException", new String[]{"com.fasterxml.jackson.databind.DeserializationContext", "java.lang.Throwable"}, new String[]{"<sample:9>", "<sample:2>"}, false, 8, new String[][]{{"com.fasterxml.jackson.databind.deser.std.StdValueInstantiator", "createUsingArrayDelegate", "com.fasterxml.jackson.databind.DeserializationContext,java.lang.Object", "<sample:6>", "<s:k{y>"}, {"com.fasterxml.jackson.databind.deser.std.StdValueInstantiator", "rewrapCtorProblem", "com.fasterxml.jackson.databind.DeserializationContext,java.lang.Throwable", "<null>", "<sample:3>"}, {"com.fasterxml.jackson.databind.deser.std.StdValueInstantiator", "getFromObjectArguments", "com.fasterxml.jackson.databind.DeserializationConfig", "<sample:3>"}}, 1), new String[][]{{"setStackTrace", "java.lang.StackTraceElement[]", "5"}});
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.databind.JsonMappingException", actual.getClass().getName());
  assertEquals("com.fasterxml.jackson.databind.JsonMappingException: Can not construct instance of java.lang.Object, problem: java.lang.Throwable:  {getLocalizedMessage=Can not construct instance of java.lang.Object,...#475#-981079191", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{canCreateFromBoolean=false, canCreateFromDouble=false, canCreateFromInt=false, canCreateFromLong=false, canCreateFromObjectWith=false, canCreateFromString=false, canCreateUsingArrayDelegate=false, ca...#309#-1951095057", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput045() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.std.StdValueInstantiator", "com.fasterxml.jackson.databind.deser.std.StdValueInstantiator", "unwrapAndWrapException", new String[]{"com.fasterxml.jackson.databind.DeserializationContext", "java.lang.Throwable"}, new String[]{"<sample:2>", "<sample:3>"}, false, 7, new String[][]{{"com.fasterxml.jackson.databind.deser.std.StdValueInstantiator", "createUsingArrayDelegate", "com.fasterxml.jackson.databind.DeserializationContext,java.lang.Object", "<sample:6>", "<s:k{y>"}, {"com.fasterxml.jackson.databind.deser.std.StdValueInstantiator", "rewrapCtorProblem", "com.fasterxml.jackson.databind.DeserializationContext,java.lang.Throwable", "<null>", "<sample:2>"}, {"com.fasterxml.jackson.databind.deser.std.StdValueInstantiator", "getFromObjectArguments", "com.fasterxml.jackson.databind.DeserializationConfig", "<sample:7>"}}, 1), new String[][]{{"setStackTrace", "java.lang.StackTraceElement[]", "5"}});
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.databind.JsonMappingException", actual.getClass().getName());
  assertEquals("com.fasterxml.jackson.databind.JsonMappingException: Can not construct instance of java.lang.String, problem:  {getLocalizedMessage=Can not construct instance of java.lang.String, problem: , getMessag...#439#949383934", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{canCreateFromBoolean=false, canCreateFromDouble=false, canCreateFromInt=false, canCreateFromLong=false, canCreateFromObjectWith=false, canCreateFromString=false, canCreateUsingArrayDelegate=false, ca...#329#-1747445055", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput046() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.std.StdValueInstantiator", "com.fasterxml.jackson.databind.deser.std.StdValueInstantiator", "unwrapAndWrapException", new String[]{"com.fasterxml.jackson.databind.DeserializationContext", "java.lang.Throwable"}, new String[]{"<sample:2>", "<sample:4>"}, false, 8, new String[][]{{"com.fasterxml.jackson.databind.deser.std.StdValueInstantiator", "createUsingArrayDelegate", "com.fasterxml.jackson.databind.DeserializationContext,java.lang.Object", "<sample:6>", "<s:k{y>"}, {"com.fasterxml.jackson.databind.deser.std.StdValueInstantiator", "rewrapCtorProblem", "com.fasterxml.jackson.databind.DeserializationContext,java.lang.Throwable", "<null>", "<sample:2>"}, {"com.fasterxml.jackson.databind.deser.std.StdValueInstantiator", "getFromObjectArguments", "com.fasterxml.jackson.databind.DeserializationConfig", "<sample:7>"}}, 1), new String[][]{{"setStackTrace", "java.lang.StackTraceElement[]", "5"}, {"getPath", "", "0"}});
  assertNotNull(actual);
  assertEquals("java.util.Collections$EmptyList", actual.getClass().getName());
  assertEquals("[]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{canCreateFromBoolean=false, canCreateFromDouble=false, canCreateFromInt=false, canCreateFromLong=false, canCreateFromObjectWith=false, canCreateFromString=false, canCreateUsingArrayDelegate=false, ca...#309#-1951095057", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput047() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.std.StdValueInstantiator", "com.fasterxml.jackson.databind.deser.std.StdValueInstantiator", "unwrapAndWrapException", new String[]{"com.fasterxml.jackson.databind.DeserializationContext", "java.lang.Throwable"}, new String[]{"<sample:2>", "<sample:4>"}, false, 8, new String[][]{{"com.fasterxml.jackson.databind.deser.std.StdValueInstantiator", "createUsingArrayDelegate", "com.fasterxml.jackson.databind.DeserializationContext,java.lang.Object", "<sample:6>", "<s:k{y>"}, {"com.fasterxml.jackson.databind.deser.std.StdValueInstantiator", "rewrapCtorProblem", "com.fasterxml.jackson.databind.DeserializationContext,java.lang.Throwable", "<sample:9>", "<sample:2>"}, {"com.fasterxml.jackson.databind.deser.std.StdValueInstantiator", "getFromObjectArguments", "com.fasterxml.jackson.databind.DeserializationConfig", "<sample:7>"}}, 1), new String[][]{{"setStackTrace", "java.lang.StackTraceElement[]", "5"}, {"getPath", "", "0"}});
  assertNotNull(actual);
  assertEquals("java.util.Collections$EmptyList", actual.getClass().getName());
  assertEquals("[]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{canCreateFromBoolean=false, canCreateFromDouble=false, canCreateFromInt=false, canCreateFromLong=false, canCreateFromObjectWith=false, canCreateFromString=false, canCreateUsingArrayDelegate=false, ca...#309#-1951095057", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput048() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.std.StdValueInstantiator", "com.fasterxml.jackson.databind.deser.std.StdValueInstantiator", "unwrapAndWrapException", new String[]{"com.fasterxml.jackson.databind.DeserializationContext", "java.lang.Throwable"}, new String[]{"<sample:4>", "<sample:1>"}, false, 6, new String[][]{{"com.fasterxml.jackson.databind.deser.std.StdValueInstantiator", "canCreateUsingArrayDelegate", ""}, {"com.fasterxml.jackson.databind.deser.std.StdValueInstantiator", "createUsingArrayDelegate", "com.fasterxml.jackson.databind.DeserializationContext,java.lang.Object", "<sample:9>", "<s:k{y>"}, {"com.fasterxml.jackson.databind.deser.std.StdValueInstantiator", "rewrapCtorProblem", "com.fasterxml.jackson.databind.DeserializationContext,java.lang.Throwable", "<sample:9>", "<sample:1>"}}, 1), new String[][]{{"setStackTrace", "java.lang.StackTraceElement[]", "1"}, {"getPath", "", "0"}, {"size", "", "0"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{canCreateFromBoolean=false, canCreateFromDouble=false, canCreateFromInt=false, canCreateFromLong=false, canCreateFromObjectWith=false, canCreateFromString=false, canCreateUsingArrayDelegate=false, ca...#309#-1951095057", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput049() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.std.StdValueInstantiator", "com.fasterxml.jackson.databind.deser.std.StdValueInstantiator", "unwrapAndWrapException", new String[]{"com.fasterxml.jackson.databind.DeserializationContext", "java.lang.Throwable"}, new String[]{"<sample:2>", "<sample:2>"}, false, 5, new String[][]{{"com.fasterxml.jackson.databind.deser.std.StdValueInstantiator", "createUsingArrayDelegate", "com.fasterxml.jackson.databind.DeserializationContext,java.lang.Object", "<sample:9>", "<s:jv{y>"}, {"com.fasterxml.jackson.databind.deser.std.StdValueInstantiator", "createFromInt", "com.fasterxml.jackson.databind.DeserializationContext,int", "<sample:3>", "-1"}, {"com.fasterxml.jackson.databind.deser.std.StdValueInstantiator", "rewrapCtorProblem", "com.fasterxml.jackson.databind.DeserializationContext,java.lang.Throwable", "<sample:13>", "<sample:2>"}}, 1), new String[][]{{"getSuppressed", "", "2"}});
  assertNotNull(actual);
  assertEquals("[Ljava.lang.Throwable;", actual.getClass().getName());
  assertEquals("[]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{canCreateFromBoolean=false, canCreateFromDouble=false, canCreateFromInt=false, canCreateFromLong=false, canCreateFromObjectWith=false, canCreateFromString=false, canCreateUsingArrayDelegate=false, ca...#300#1048321612", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput050() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.std.StdValueInstantiator", "com.fasterxml.jackson.databind.deser.std.StdValueInstantiator", "getDelegateType", new String[]{"com.fasterxml.jackson.databind.DeserializationConfig"}, new String[]{"<sample:7>"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.deser.std.StdValueInstantiator", "canCreateFromObjectWith", ""}, {"com.fasterxml.jackson.databind.deser.std.StdValueInstantiator", "createFromObjectWith", "com.fasterxml.jackson.databind.DeserializationContext,com.fasterxml.jackson.databind.deser.SettableBeanProperty[],com.fasterxml.jackson.databind.deser.impl.PropertyValueBuffer", "<sample:0>", "<sample:0>", "<sample:0>"}}, 1);
  assertNull(actual);
  assertEquals("receiver state after the call", "{canCreateFromBoolean=false, canCreateFromDouble=false, canCreateFromInt=false, canCreateFromLong=false, canCreateFromObjectWith=false, canCreateFromString=false, canCreateUsingArrayDelegate=false, ca...#299#-1213177389", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput051() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.std.StdValueInstantiator", "com.fasterxml.jackson.databind.deser.std.StdValueInstantiator", "unwrapAndWrapException", new String[]{"com.fasterxml.jackson.databind.DeserializationContext", "java.lang.Throwable"}, new String[]{"<sample:0>", "<sample:4>"}, false, 2, new String[][]{{"com.fasterxml.jackson.databind.deser.std.StdValueInstantiator", "createUsingArrayDelegate", "com.fasterxml.jackson.databind.DeserializationContext,java.lang.Object", "<sample:10>", "<i:1>"}, {"com.fasterxml.jackson.databind.deser.std.StdValueInstantiator", "createFromInt", "com.fasterxml.jackson.databind.DeserializationContext,int", "<sample:6>", "-1"}, {"com.fasterxml.jackson.databind.deser.std.StdValueInstantiator", "rewrapCtorProblem", "com.fasterxml.jackson.databind.DeserializationContext,java.lang.Throwable", "<sample:13>", "<sample:2>"}}, 2), new String[][]{{"getSuppressed", "", "4"}});
  assertNotNull(actual);
  assertEquals("[Ljava.lang.Throwable;", actual.getClass().getName());
  assertEquals("[]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{canCreateFromBoolean=false, canCreateFromDouble=false, canCreateFromInt=false, canCreateFromLong=false, canCreateFromObjectWith=false, canCreateFromString=false, canCreateUsingArrayDelegate=false, ca...#314#1636553649", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput052() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.std.StdValueInstantiator", "com.fasterxml.jackson.databind.deser.std.StdValueInstantiator", "unwrapAndWrapException", new String[]{"com.fasterxml.jackson.databind.DeserializationContext", "java.lang.Throwable"}, new String[]{"<sample:2>", "<empty>"}, false, 2, new String[][]{{"com.fasterxml.jackson.databind.deser.std.StdValueInstantiator", "createUsingArrayDelegate", "com.fasterxml.jackson.databind.DeserializationContext,java.lang.Object", "<sample:10>", "<i:1>"}, {"com.fasterxml.jackson.databind.deser.std.StdValueInstantiator", "createFromInt", "com.fasterxml.jackson.databind.DeserializationContext,int", "<sample:3>", "1"}, {"com.fasterxml.jackson.databind.deser.std.StdValueInstantiator", "rewrapCtorProblem", "com.fasterxml.jackson.databind.DeserializationContext,java.lang.Throwable", "<sample:13>", "<sample:5>"}}, 3), new String[][]{{"getSuppressed", "", "4"}});
  assertNotNull(actual);
  assertEquals("[Ljava.lang.Throwable;", actual.getClass().getName());
  assertEquals("[]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{canCreateFromBoolean=false, canCreateFromDouble=false, canCreateFromInt=false, canCreateFromLong=false, canCreateFromObjectWith=false, canCreateFromString=false, canCreateUsingArrayDelegate=false, ca...#314#1636553649", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput053() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.std.StdValueInstantiator", "com.fasterxml.jackson.databind.deser.std.StdValueInstantiator", "unwrapAndWrapException", new String[]{"com.fasterxml.jackson.databind.DeserializationContext", "java.lang.Throwable"}, new String[]{"<sample:2>", "<empty>"}, false, 5, new String[][]{{"com.fasterxml.jackson.databind.deser.std.StdValueInstantiator", "createUsingArrayDelegate", "com.fasterxml.jackson.databind.DeserializationContext,java.lang.Object", "<sample:10>", "<i:1>"}, {"com.fasterxml.jackson.databind.deser.std.StdValueInstantiator", "createFromInt", "com.fasterxml.jackson.databind.DeserializationContext,int", "<sample:3>", "1"}, {"com.fasterxml.jackson.databind.deser.std.StdValueInstantiator", "rewrapCtorProblem", "com.fasterxml.jackson.databind.DeserializationContext,java.lang.Throwable", "<sample:13>", "<sample:5>"}}, 3), new String[][]{{"getSuppressed", "", "4"}});
  assertNotNull(actual);
  assertEquals("[Ljava.lang.Throwable;", actual.getClass().getName());
  assertEquals("[]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{canCreateFromBoolean=false, canCreateFromDouble=false, canCreateFromInt=false, canCreateFromLong=false, canCreateFromObjectWith=false, canCreateFromString=false, canCreateUsingArrayDelegate=false, ca...#300#1048321612", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput054() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.std.StdValueInstantiator", "com.fasterxml.jackson.databind.deser.std.StdValueInstantiator", "unwrapAndWrapException", new String[]{"com.fasterxml.jackson.databind.DeserializationContext", "java.lang.Throwable"}, new String[]{"<sample:4>", "<sample:3>"}, false, 11, new String[][]{{"com.fasterxml.jackson.databind.deser.std.StdValueInstantiator", "createUsingArrayDelegate", "com.fasterxml.jackson.databind.DeserializationContext,java.lang.Object", "<sample:9>", "<i:1>"}, {"com.fasterxml.jackson.databind.deser.std.StdValueInstantiator", "createFromInt", "com.fasterxml.jackson.databind.DeserializationContext,int", "<sample:3>", "1"}, {"com.fasterxml.jackson.databind.deser.std.StdValueInstantiator", "rewrapCtorProblem", "com.fasterxml.jackson.databind.DeserializationContext,java.lang.Throwable", "<sample:13>", "<sample:2>"}}, 3), new String[][]{{"getSuppressed", "", "4"}});
  assertNotNull(actual);
  assertEquals("[Ljava.lang.Throwable;", actual.getClass().getName());
  assertEquals("[]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{canCreateFromBoolean=false, canCreateFromDouble=false, canCreateFromInt=false, canCreateFromLong=false, canCreateFromObjectWith=false, canCreateFromString=false, canCreateUsingArrayDelegate=false, ca...#359#-742779505", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput055() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.std.StdValueInstantiator", "com.fasterxml.jackson.databind.deser.std.StdValueInstantiator", "unwrapAndWrapException", new String[]{"com.fasterxml.jackson.databind.DeserializationContext", "java.lang.Throwable"}, new String[]{"<sample:7>", "<sample:3>"}, false, 2, new String[][]{{"com.fasterxml.jackson.databind.deser.std.StdValueInstantiator", "createUsingArrayDelegate", "com.fasterxml.jackson.databind.DeserializationContext,java.lang.Object", "<sample:9>", "<i:1>"}, {"com.fasterxml.jackson.databind.deser.std.StdValueInstantiator", "createFromInt", "com.fasterxml.jackson.databind.DeserializationContext,int", "<sample:3>", "1"}, {"com.fasterxml.jackson.databind.deser.std.StdValueInstantiator", "rewrapCtorProblem", "com.fasterxml.jackson.databind.DeserializationContext,java.lang.Throwable", "<sample:13>", "<sample:2>"}}, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput056() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.std.StdValueInstantiator", "com.fasterxml.jackson.databind.deser.std.StdValueInstantiator", "canCreateFromObjectWith", new String[]{}, new String[]{}, false, 0, null, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{canCreateFromBoolean=false, canCreateFromDouble=false, canCreateFromInt=false, canCreateFromLong=false, canCreateFromObjectWith=false, canCreateFromString=false, canCreateUsingArrayDelegate=false, ca...#299#-1213177389", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput057() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.std.StdValueInstantiator", "com.fasterxml.jackson.databind.deser.std.StdValueInstantiator", "configureFromBooleanCreator", new String[]{"com.fasterxml.jackson.databind.introspect.AnnotatedWithParams"}, new String[]{"<sample:1>"}, false, 0, null, 2);
  assertNull(actual);
  assertEquals("receiver state after the call", "{canCreateFromBoolean=true, canCreateFromDouble=false, canCreateFromInt=false, canCreateFromLong=false, canCreateFromObjectWith=false, canCreateFromString=false, canCreateUsingArrayDelegate=false, can...#297#1843058703", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput058() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.std.StdValueInstantiator", "com.fasterxml.jackson.databind.deser.std.StdValueInstantiator", "unwrapAndWrapException", new String[]{"com.fasterxml.jackson.databind.DeserializationContext", "java.lang.Throwable"}, new String[]{"<sample:1>", "<sample:6>"}, false, 3, new String[][]{{"com.fasterxml.jackson.databind.deser.std.StdValueInstantiator", "createUsingArrayDelegate", "com.fasterxml.jackson.databind.DeserializationContext,java.lang.Object", "<sample:9>", "<i:-2047>"}, {"com.fasterxml.jackson.databind.deser.std.StdValueInstantiator", "createFromInt", "com.fasterxml.jackson.databind.DeserializationContext,int", "<sample:0>", "0"}, {"com.fasterxml.jackson.databind.deser.std.StdValueInstantiator", "rewrapCtorProblem", "com.fasterxml.jackson.databind.DeserializationContext,java.lang.Throwable", "<sample:4>", "<sample:5>"}}, 3), new String[][]{{"getSuppressed", "", "4"}});
  assertNotNull(actual);
  assertEquals("[Ljava.lang.Throwable;", actual.getClass().getName());
  assertEquals("[]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{canCreateFromBoolean=false, canCreateFromDouble=false, canCreateFromInt=false, canCreateFromLong=false, canCreateFromObjectWith=false, canCreateFromString=false, canCreateUsingArrayDelegate=false, ca...#324#-2126697502", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput059() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.std.StdValueInstantiator", "com.fasterxml.jackson.databind.deser.std.StdValueInstantiator", "unwrapAndWrapException", new String[]{"com.fasterxml.jackson.databind.DeserializationContext", "java.lang.Throwable"}, new String[]{"<sample:1>", "<sample:6>"}, false, 1, new String[][]{{"com.fasterxml.jackson.databind.deser.std.StdValueInstantiator", "createUsingArrayDelegate", "com.fasterxml.jackson.databind.DeserializationContext,java.lang.Object", "<sample:9>", "<i:-2047>"}, {"com.fasterxml.jackson.databind.deser.std.StdValueInstantiator", "createFromInt", "com.fasterxml.jackson.databind.DeserializationContext,int", "<sample:0>", "0"}, {"com.fasterxml.jackson.databind.deser.std.StdValueInstantiator", "rewrapCtorProblem", "com.fasterxml.jackson.databind.DeserializationContext,java.lang.Throwable", "<sample:4>", "<sample:5>"}}, 3), new String[][]{{"getSuppressed", "", "4"}});
  assertNotNull(actual);
  assertEquals("[Ljava.lang.Throwable;", actual.getClass().getName());
  assertEquals("[]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{canCreateFromBoolean=false, canCreateFromDouble=false, canCreateFromInt=false, canCreateFromLong=false, canCreateFromObjectWith=false, canCreateFromString=false, canCreateUsingArrayDelegate=false, ca...#346#-691812784", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput060() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.std.StdValueInstantiator", "com.fasterxml.jackson.databind.deser.std.StdValueInstantiator", "unwrapAndWrapException", new String[]{"com.fasterxml.jackson.databind.DeserializationContext", "java.lang.Throwable"}, new String[]{"<sample:5>", "<sample:0>"}, false, 5, new String[][]{{"com.fasterxml.jackson.databind.deser.std.StdValueInstantiator", "createUsingArrayDelegate", "com.fasterxml.jackson.databind.DeserializationContext,java.lang.Object", "<sample:5>", "<s:b>"}, {"com.fasterxml.jackson.databind.deser.std.StdValueInstantiator", "createFromInt", "com.fasterxml.jackson.databind.DeserializationContext,int", "<sample:9>", "0"}, {"com.fasterxml.jackson.databind.deser.std.StdValueInstantiator", "rewrapCtorProblem", "com.fasterxml.jackson.databind.DeserializationContext,java.lang.Throwable", "<sample:4>", "<empty>"}}, 2), new String[][]{{"getLocalizedMessage", "", "7"}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("Can not construct instance of int, problem: null", String.valueOf(actual));
  assertEquals("receiver state after the call", "{canCreateFromBoolean=false, canCreateFromDouble=false, canCreateFromInt=false, canCreateFromLong=false, canCreateFromObjectWith=false, canCreateFromString=false, canCreateUsingArrayDelegate=false, ca...#300#1048321612", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput061() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.std.StdValueInstantiator", "com.fasterxml.jackson.databind.deser.std.StdValueInstantiator", "unwrapAndWrapException", new String[]{"com.fasterxml.jackson.databind.DeserializationContext", "java.lang.Throwable"}, new String[]{"<sample:4>", "<sample:0>"}, false, 5, new String[][]{{"com.fasterxml.jackson.databind.deser.std.StdValueInstantiator", "createUsingArrayDelegate", "com.fasterxml.jackson.databind.DeserializationContext,java.lang.Object", "<sample:0>", "<s:aD>"}, {"com.fasterxml.jackson.databind.deser.std.StdValueInstantiator", "createFromInt", "com.fasterxml.jackson.databind.DeserializationContext,int", "<sample:9>", "9"}, {"com.fasterxml.jackson.databind.deser.std.StdValueInstantiator", "rewrapCtorProblem", "com.fasterxml.jackson.databind.DeserializationContext,java.lang.Throwable", "<sample:5>", "<empty>"}}, 2), new String[][]{{"initCause", "java.lang.Throwable", "0"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalStateException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput062() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.std.StdValueInstantiator", "com.fasterxml.jackson.databind.deser.std.StdValueInstantiator", "unwrapAndWrapException", new String[]{"com.fasterxml.jackson.databind.DeserializationContext", "java.lang.Throwable"}, new String[]{"<sample:5>", "<sample:3>"}, false, 6, new String[][]{{"com.fasterxml.jackson.databind.deser.std.StdValueInstantiator", "createUsingArrayDelegate", "com.fasterxml.jackson.databind.DeserializationContext,java.lang.Object", "<sample:0>", "<s:aD>"}, {"com.fasterxml.jackson.databind.deser.std.StdValueInstantiator", "createFromInt", "com.fasterxml.jackson.databind.DeserializationContext,int", "<sample:9>", "9"}, {"com.fasterxml.jackson.databind.deser.std.StdValueInstantiator", "rewrapCtorProblem", "com.fasterxml.jackson.databind.DeserializationContext,java.lang.Throwable", "<sample:5>", "<empty>"}}, 2), new String[][]{{"fillInStackTrace", "", "2"}});
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.databind.JsonMappingException", actual.getClass().getName());
  assertEquals("com.fasterxml.jackson.databind.JsonMappingException: Can not construct instance of java.lang.Object, problem:  {getLocalizedMessage=Can not construct instance of java.lang.Object, problem: , getMessag...#453#-840505170", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{canCreateFromBoolean=false, canCreateFromDouble=false, canCreateFromInt=false, canCreateFromLong=false, canCreateFromObjectWith=false, canCreateFromString=false, canCreateUsingArrayDelegate=false, ca...#309#-1951095057", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput063() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.ValueInstantiator", "com.fasterxml.jackson.databind.deser.ValueInstantiator$Base", "createFromString", new String[]{"com.fasterxml.jackson.databind.DeserializationContext", "java.lang.String"}, new String[]{"<sample:3>", "1.1234567"}, false, 0, null, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput064() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.std.StdValueInstantiator", "com.fasterxml.jackson.databind.deser.std.StdValueInstantiator", "unwrapAndWrapException", new String[]{"com.fasterxml.jackson.databind.DeserializationContext", "java.lang.Throwable"}, new String[]{"<sample:4>", "<sample:4>"}, false, 6, new String[][]{{"com.fasterxml.jackson.databind.deser.std.StdValueInstantiator", "createUsingArrayDelegate", "com.fasterxml.jackson.databind.DeserializationContext,java.lang.Object", "<sample:0>", "<s:aD>"}, {"com.fasterxml.jackson.databind.deser.std.StdValueInstantiator", "createFromInt", "com.fasterxml.jackson.databind.DeserializationContext,int", "<sample:4>", "9"}, {"com.fasterxml.jackson.databind.deser.std.StdValueInstantiator", "rewrapCtorProblem", "com.fasterxml.jackson.databind.DeserializationContext,java.lang.Throwable", "<sample:4>", "<sample:0>"}}, 2), new String[][]{{"fillInStackTrace", "", "2"}, {"getPathReference", "java.lang.StringBuilder", "7"}, {"insert", "int,double", "6"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.StringIndexOutOfBoundsException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput065() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.std.StdValueInstantiator", "com.fasterxml.jackson.databind.deser.std.StdValueInstantiator", "unwrapAndWrapException", new String[]{"com.fasterxml.jackson.databind.DeserializationContext", "java.lang.Throwable"}, new String[]{"<sample:4>", "<null>"}, false, 4, new String[][]{{"com.fasterxml.jackson.databind.deser.std.StdValueInstantiator", "createUsingArrayDelegate", "com.fasterxml.jackson.databind.DeserializationContext,java.lang.Object", "<sample:0>", "<s:aD>"}, {"com.fasterxml.jackson.databind.deser.std.StdValueInstantiator", "createFromInt", "com.fasterxml.jackson.databind.DeserializationContext,int", "<sample:4>", "9"}, {"com.fasterxml.jackson.databind.deser.std.StdValueInstantiator", "rewrapCtorProblem", "com.fasterxml.jackson.databind.DeserializationContext,java.lang.Throwable", "<sample:4>", "<sample:0>"}}, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput066() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.std.StdValueInstantiator", "com.fasterxml.jackson.databind.deser.std.StdValueInstantiator", "unwrapAndWrapException", new String[]{"com.fasterxml.jackson.databind.DeserializationContext", "java.lang.Throwable"}, new String[]{"<sample:4>", "<sample:3>"}, false, 3, new String[][]{{"com.fasterxml.jackson.databind.deser.std.StdValueInstantiator", "createUsingArrayDelegate", "com.fasterxml.jackson.databind.DeserializationContext,java.lang.Object", "<sample:0>", "<s:-D>"}, {"com.fasterxml.jackson.databind.deser.std.StdValueInstantiator", "createFromInt", "com.fasterxml.jackson.databind.DeserializationContext,int", "<sample:4>", "-2147483648"}, {"com.fasterxml.jackson.databind.deser.std.StdValueInstantiator", "rewrapCtorProblem", "com.fasterxml.jackson.databind.DeserializationContext,java.lang.Throwable", "<sample:4>", "<sample:0>"}}, 2), new String[][]{{"fillInStackTrace", "", "2"}, {"getSuppressed", "", "7"}});
  assertNotNull(actual);
  assertEquals("[Ljava.lang.Throwable;", actual.getClass().getName());
  assertEquals("[]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{canCreateFromBoolean=false, canCreateFromDouble=false, canCreateFromInt=false, canCreateFromLong=false, canCreateFromObjectWith=false, canCreateFromString=false, canCreateUsingArrayDelegate=false, ca...#324#-2126697502", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput067() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.ValueInstantiator", "com.fasterxml.jackson.databind.deser.ValueInstantiator$Base", "createUsingDefault", new String[]{"com.fasterxml.jackson.databind.DeserializationContext"}, new String[]{"<sample:0>"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.deser.ValueInstantiator", "canCreateUsingDelegate", ""}}, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput068() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.ValueInstantiator", "com.fasterxml.jackson.databind.deser.ValueInstantiator$Base", "canCreateFromDouble", new String[]{}, new String[]{}, false, 12, new String[][]{{"com.fasterxml.jackson.databind.deser.ValueInstantiator", "getArrayDelegateType", "com.fasterxml.jackson.databind.DeserializationConfig", "<sample:5>"}, {"com.fasterxml.jackson.databind.deser.ValueInstantiator", "getFromObjectArguments", "com.fasterxml.jackson.databind.DeserializationConfig", "<null>"}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{canCreateFromBoolean=false, canCreateFromDouble=false, canCreateFromInt=false, canCreateFromLong=false, canCreateFromObjectWith=false, canCreateFromString=false, canCreateUsingArrayDelegate=false, ca...#318#1611653153", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput069() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.ValueInstantiator", "com.fasterxml.jackson.databind.deser.ValueInstantiator$Base", "canCreateFromDouble", new String[]{}, new String[]{}, false, 13, new String[][]{{"com.fasterxml.jackson.databind.deser.ValueInstantiator", "getArrayDelegateType", "com.fasterxml.jackson.databind.DeserializationConfig", "<sample:5>"}, {"com.fasterxml.jackson.databind.deser.ValueInstantiator", "getFromObjectArguments", "com.fasterxml.jackson.databind.DeserializationConfig", "<null>"}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{canCreateFromBoolean=false, canCreateFromDouble=false, canCreateFromInt=false, canCreateFromLong=false, canCreateFromObjectWith=false, canCreateFromString=false, canCreateUsingArrayDelegate=false, ca...#316#-1061607836", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput070() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.std.StdValueInstantiator", "com.fasterxml.jackson.databind.deser.std.StdValueInstantiator", "getArrayDelegateCreator", new String[]{}, new String[]{}, false, 3, new String[][]{{"com.fasterxml.jackson.databind.deser.std.StdValueInstantiator", "canCreateFromInt", ""}, {"com.fasterxml.jackson.databind.deser.std.StdValueInstantiator", "canCreateUsingArrayDelegate", ""}}, 3);
  assertNull(actual);
  assertEquals("receiver state after the call", "{canCreateFromBoolean=false, canCreateFromDouble=false, canCreateFromInt=false, canCreateFromLong=false, canCreateFromObjectWith=false, canCreateFromString=false, canCreateUsingArrayDelegate=false, ca...#324#-2126697502", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput071() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.std.StdValueInstantiator", "com.fasterxml.jackson.databind.deser.std.StdValueInstantiator", "getArrayDelegateCreator", new String[]{}, new String[]{}, false, 4, new String[][]{{"com.fasterxml.jackson.databind.deser.std.StdValueInstantiator", "canCreateFromInt", ""}, {"com.fasterxml.jackson.databind.deser.std.StdValueInstantiator", "canCreateUsingArrayDelegate", ""}}, 3);
  assertNull(actual);
  assertEquals("receiver state after the call", "{canCreateFromBoolean=false, canCreateFromDouble=false, canCreateFromInt=false, canCreateFromLong=false, canCreateFromObjectWith=false, canCreateFromString=false, canCreateUsingArrayDelegate=false, ca...#309#-1951095057", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput072() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.std.StdValueInstantiator", "com.fasterxml.jackson.databind.deser.std.StdValueInstantiator", "getArrayDelegateCreator", new String[]{}, new String[]{}, false, 5, new String[][]{{"com.fasterxml.jackson.databind.deser.std.StdValueInstantiator", "canCreateFromInt", ""}, {"com.fasterxml.jackson.databind.deser.std.StdValueInstantiator", "canCreateUsingArrayDelegate", ""}}, 3);
  assertNull(actual);
  assertEquals("receiver state after the call", "{canCreateFromBoolean=false, canCreateFromDouble=false, canCreateFromInt=false, canCreateFromLong=false, canCreateFromObjectWith=false, canCreateFromString=false, canCreateUsingArrayDelegate=false, ca...#300#1048321612", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput073() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.std.StdValueInstantiator", "com.fasterxml.jackson.databind.deser.std.StdValueInstantiator", "getArrayDelegateCreator", new String[]{}, new String[]{}, false, 10, new String[][]{{"com.fasterxml.jackson.databind.deser.std.StdValueInstantiator", "canCreateFromInt", ""}}, 2);
  assertNull(actual);
  assertEquals("receiver state after the call", "{canCreateFromBoolean=false, canCreateFromDouble=false, canCreateFromInt=false, canCreateFromLong=false, canCreateFromObjectWith=false, canCreateFromString=false, canCreateUsingArrayDelegate=false, ca...#309#-1951095057", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput074() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.std.StdValueInstantiator", "com.fasterxml.jackson.databind.deser.std.StdValueInstantiator", "getArrayDelegateCreator", new String[]{}, new String[]{}, false, 11, new String[][]{}, 2);
  assertNull(actual);
  assertEquals("receiver state after the call", "{canCreateFromBoolean=false, canCreateFromDouble=false, canCreateFromInt=false, canCreateFromLong=false, canCreateFromObjectWith=false, canCreateFromString=false, canCreateUsingArrayDelegate=false, ca...#359#-742779505", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput075() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.std.StdValueInstantiator", "com.fasterxml.jackson.databind.deser.std.StdValueInstantiator", "getArrayDelegateCreator", new String[]{}, new String[]{}, false, 12, new String[][]{{"com.fasterxml.jackson.databind.deser.std.StdValueInstantiator", "createFromInt", "com.fasterxml.jackson.databind.DeserializationContext,int", "<sample:3>", "0"}, {"com.fasterxml.jackson.databind.deser.std.StdValueInstantiator", "wrapException", "java.lang.Throwable", "<sample:3>"}, {"com.fasterxml.jackson.databind.deser.std.StdValueInstantiator", "canCreateFromDouble", ""}}, 1);
  assertNull(actual);
  assertEquals("receiver state after the call", "{canCreateFromBoolean=false, canCreateFromDouble=false, canCreateFromInt=false, canCreateFromLong=false, canCreateFromObjectWith=false, canCreateFromString=false, canCreateUsingArrayDelegate=false, ca...#309#-1951095057", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput076() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.std.StdValueInstantiator", "com.fasterxml.jackson.databind.deser.std.StdValueInstantiator", "getArrayDelegateCreator", new String[]{}, new String[]{}, false, 13, new String[][]{{"com.fasterxml.jackson.databind.deser.std.StdValueInstantiator", "createFromInt", "com.fasterxml.jackson.databind.DeserializationContext,int", "<sample:3>", "0"}, {"com.fasterxml.jackson.databind.deser.std.StdValueInstantiator", "wrapException", "java.lang.Throwable", "<sample:3>"}, {"com.fasterxml.jackson.databind.deser.std.StdValueInstantiator", "canCreateFromDouble", ""}}, 1);
  assertNull(actual);
  assertEquals("receiver state after the call", "{canCreateFromBoolean=false, canCreateFromDouble=false, canCreateFromInt=false, canCreateFromLong=false, canCreateFromObjectWith=false, canCreateFromString=false, canCreateUsingArrayDelegate=false, ca...#359#1344507954", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput077() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.std.StdValueInstantiator", "com.fasterxml.jackson.databind.deser.std.StdValueInstantiator", "getArrayDelegateCreator", new String[]{}, new String[]{}, false, 15, new String[][]{{"com.fasterxml.jackson.databind.deser.std.StdValueInstantiator", "createFromInt", "com.fasterxml.jackson.databind.DeserializationContext,int", "<sample:3>", "0"}, {"com.fasterxml.jackson.databind.deser.std.StdValueInstantiator", "wrapException", "java.lang.Throwable", "<sample:3>"}, {"com.fasterxml.jackson.databind.deser.std.StdValueInstantiator", "canCreateFromDouble", ""}}, 1);
  assertNull(actual);
  assertEquals("receiver state after the call", "{canCreateFromBoolean=false, canCreateFromDouble=false, canCreateFromInt=false, canCreateFromLong=false, canCreateFromObjectWith=false, canCreateFromString=false, canCreateUsingArrayDelegate=false, ca...#299#-1213177327", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput078() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.std.StdValueInstantiator", "com.fasterxml.jackson.databind.deser.std.StdValueInstantiator", "getArrayDelegateCreator", new String[]{}, new String[]{}, false, 17, new String[][]{{"com.fasterxml.jackson.databind.deser.std.StdValueInstantiator", "createFromInt", "com.fasterxml.jackson.databind.DeserializationContext,int", "<sample:3>", "0"}, {"com.fasterxml.jackson.databind.deser.std.StdValueInstantiator", "wrapException", "java.lang.Throwable", "<sample:3>"}, {"com.fasterxml.jackson.databind.deser.std.StdValueInstantiator", "canCreateFromDouble", ""}}, 1);
  assertNull(actual);
  assertEquals("receiver state after the call", "{canCreateFromBoolean=false, canCreateFromDouble=false, canCreateFromInt=false, canCreateFromLong=false, canCreateFromObjectWith=false, canCreateFromString=false, canCreateUsingArrayDelegate=false, ca...#314#1636553649", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput079() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.std.StdValueInstantiator", "com.fasterxml.jackson.databind.deser.std.StdValueInstantiator", "getDelegateCreator", new String[]{}, new String[]{}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.deser.std.StdValueInstantiator", "canInstantiate", ""}}, 2);
  assertNull(actual);
  assertEquals("receiver state after the call", "{canCreateFromBoolean=false, canCreateFromDouble=false, canCreateFromInt=false, canCreateFromLong=false, canCreateFromObjectWith=false, canCreateFromString=false, canCreateUsingArrayDelegate=false, ca...#299#-1213177389", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput080() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.ValueInstantiator", "com.fasterxml.jackson.databind.deser.ValueInstantiator$Base", "getFromObjectArguments", new String[]{"com.fasterxml.jackson.databind.DeserializationConfig"}, new String[]{"<sample:7>"}, false, 5, new String[][]{}, 2);
  assertNull(actual);
  assertEquals("receiver state after the call", "{canCreateFromBoolean=false, canCreateFromDouble=false, canCreateFromInt=false, canCreateFromLong=false, canCreateFromObjectWith=false, canCreateFromString=false, canCreateUsingArrayDelegate=false, ca...#311#-229031103", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput081() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.ValueInstantiator", "com.fasterxml.jackson.databind.deser.ValueInstantiator$Base", "canCreateUsingDelegate", new String[]{}, new String[]{}, false, 1, new String[][]{{"com.fasterxml.jackson.databind.deser.ValueInstantiator", "getDelegateType", "com.fasterxml.jackson.databind.DeserializationConfig", "<sample:4>"}, {"com.fasterxml.jackson.databind.deser.ValueInstantiator", "canCreateUsingDefault", ""}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{canCreateFromBoolean=false, canCreateFromDouble=false, canCreateFromInt=false, canCreateFromLong=false, canCreateFromObjectWith=false, canCreateFromString=false, canCreateUsingArrayDelegate=false, ca...#359#219967482", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput082() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.ValueInstantiator", "com.fasterxml.jackson.databind.deser.ValueInstantiator$Base", "canCreateUsingDelegate", new String[]{}, new String[]{}, false, 2, new String[][]{{"com.fasterxml.jackson.databind.deser.ValueInstantiator", "getDelegateType", "com.fasterxml.jackson.databind.DeserializationConfig", "<sample:4>"}, {"com.fasterxml.jackson.databind.deser.ValueInstantiator", "canCreateUsingDefault", ""}, {"com.fasterxml.jackson.databind.deser.ValueInstantiator", "canCreateUsingDefault", ""}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{canCreateFromBoolean=false, canCreateFromDouble=false, canCreateFromInt=false, canCreateFromLong=false, canCreateFromObjectWith=false, canCreateFromString=false, canCreateUsingArrayDelegate=false, ca...#313#-516867540", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput083() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.ValueInstantiator", "com.fasterxml.jackson.databind.deser.ValueInstantiator$Base", "canCreateUsingDelegate", new String[]{}, new String[]{}, false, 3, new String[][]{{"com.fasterxml.jackson.databind.deser.ValueInstantiator", "getDelegateType", "com.fasterxml.jackson.databind.DeserializationConfig", "<sample:7>"}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{canCreateFromBoolean=false, canCreateFromDouble=false, canCreateFromInt=false, canCreateFromLong=false, canCreateFromObjectWith=false, canCreateFromString=false, canCreateUsingArrayDelegate=false, ca...#314#1636553649", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput084() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.ValueInstantiator", "com.fasterxml.jackson.databind.deser.ValueInstantiator$Base", "canCreateUsingDelegate", new String[]{}, new String[]{}, false, 4, new String[][]{{"com.fasterxml.jackson.databind.deser.ValueInstantiator", "getDelegateType", "com.fasterxml.jackson.databind.DeserializationConfig", "<sample:7>"}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{canCreateFromBoolean=false, canCreateFromDouble=false, canCreateFromInt=false, canCreateFromLong=false, canCreateFromObjectWith=false, canCreateFromString=false, canCreateUsingArrayDelegate=false, ca...#318#1611653153", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput085() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.ValueInstantiator", "com.fasterxml.jackson.databind.deser.ValueInstantiator$Base", "canCreateUsingDelegate", new String[]{}, new String[]{}, false, 5, new String[][]{}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{canCreateFromBoolean=false, canCreateFromDouble=false, canCreateFromInt=false, canCreateFromLong=false, canCreateFromObjectWith=false, canCreateFromString=false, canCreateUsingArrayDelegate=false, ca...#311#-229031103", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput086() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.ValueInstantiator", "com.fasterxml.jackson.databind.deser.ValueInstantiator$Base", "canCreateUsingDelegate", new String[]{}, new String[]{}, false, 16, new String[][]{{"com.fasterxml.jackson.databind.deser.ValueInstantiator", "canCreateFromObjectWith", ""}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{canCreateFromBoolean=false, canCreateFromDouble=false, canCreateFromInt=false, canCreateFromLong=false, canCreateFromObjectWith=false, canCreateFromString=false, canCreateUsingArrayDelegate=false, ca...#318#1611653153", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput087() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.ValueInstantiator", "com.fasterxml.jackson.databind.deser.ValueInstantiator$Base", "canCreateUsingDelegate", new String[]{}, new String[]{}, false, 17, new String[][]{{"com.fasterxml.jackson.databind.deser.ValueInstantiator", "canCreateFromObjectWith", ""}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{canCreateFromBoolean=false, canCreateFromDouble=false, canCreateFromInt=false, canCreateFromLong=false, canCreateFromObjectWith=false, canCreateFromString=false, canCreateUsingArrayDelegate=false, ca...#359#229321856", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput088() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.ValueInstantiator", "com.fasterxml.jackson.databind.deser.ValueInstantiator$Base", "canCreateUsingDelegate", new String[]{}, new String[]{}, false, 19, new String[][]{{"com.fasterxml.jackson.databind.deser.ValueInstantiator", "canCreateFromObjectWith", ""}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{canCreateFromBoolean=false, canCreateFromDouble=false, canCreateFromInt=false, canCreateFromLong=false, canCreateFromObjectWith=false, canCreateFromString=false, canCreateUsingArrayDelegate=false, ca...#313#-516867540", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput089() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.ValueInstantiator", "com.fasterxml.jackson.databind.deser.ValueInstantiator$Base", "canCreateUsingDelegate", new String[]{}, new String[]{}, false, 21, new String[][]{{"com.fasterxml.jackson.databind.deser.ValueInstantiator", "canCreateFromObjectWith", ""}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{canCreateFromBoolean=false, canCreateFromDouble=false, canCreateFromInt=false, canCreateFromLong=false, canCreateFromObjectWith=false, canCreateFromString=false, canCreateUsingArrayDelegate=false, ca...#300#1048321612", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput090() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.ValueInstantiator", "com.fasterxml.jackson.databind.deser.ValueInstantiator$Base", "canCreateUsingDelegate", new String[]{}, new String[]{}, false, 23, new String[][]{{"com.fasterxml.jackson.databind.deser.ValueInstantiator", "canCreateFromObjectWith", ""}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{canCreateFromBoolean=false, canCreateFromDouble=false, canCreateFromInt=false, canCreateFromLong=false, canCreateFromObjectWith=false, canCreateFromString=false, canCreateUsingArrayDelegate=false, ca...#310#131181247", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput091() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.std.StdValueInstantiator", "com.fasterxml.jackson.databind.deser.std.StdValueInstantiator", "configureFromObjectSettings", new String[]{"com.fasterxml.jackson.databind.introspect.AnnotatedWithParams", "com.fasterxml.jackson.databind.introspect.AnnotatedWithParams", "com.fasterxml.jackson.databind.JavaType", "com.fasterxml.jackson.databind.deser.SettableBeanProperty[]", "com.fasterxml.jackson.databind.introspect.AnnotatedWithParams", "com.fasterxml.jackson.databind.deser.SettableBeanProperty[]"}, new String[]{"<sample:6>", "<sample:0>", "<sample:0>", "<empty>", "<sample:1>", "<sample:5>"}, false, 0, null, 1);
  assertNull(actual);
  assertEquals("receiver state after the call", "{canCreateFromBoolean=false, canCreateFromDouble=false, canCreateFromInt=false, canCreateFromLong=false, canCreateFromObjectWith=true, canCreateFromString=false, canCreateUsingArrayDelegate=false, can...#295#-1741164875", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput092() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.std.StdValueInstantiator", "com.fasterxml.jackson.databind.deser.std.StdValueInstantiator", "createFromInt", new String[]{"com.fasterxml.jackson.databind.DeserializationContext", "int"}, new String[]{"<sample:5>", "2147483647"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.deser.std.StdValueInstantiator", "canCreateFromLong", ""}, {"com.fasterxml.jackson.databind.deser.std.StdValueInstantiator", "canCreateFromInt", ""}}, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput093() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.std.StdValueInstantiator", "com.fasterxml.jackson.databind.deser.std.StdValueInstantiator", "canCreateFromDouble", new String[]{}, new String[]{}, false, 24, new String[][]{{"com.fasterxml.jackson.databind.deser.std.StdValueInstantiator", "canCreateFromDouble", ""}, {"com.fasterxml.jackson.databind.deser.std.StdValueInstantiator", "_createFromStringFallbacks", "com.fasterxml.jackson.databind.DeserializationContext,java.lang.String", "<sample:5>", "\n"}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{canCreateFromBoolean=false, canCreateFromDouble=false, canCreateFromInt=false, canCreateFromLong=false, canCreateFromObjectWith=false, canCreateFromString=false, canCreateUsingArrayDelegate=false, ca...#309#-1951095057", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput094() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.std.StdValueInstantiator", "com.fasterxml.jackson.databind.deser.std.StdValueInstantiator", "canCreateFromDouble", new String[]{}, new String[]{}, false, 25, new String[][]{{"com.fasterxml.jackson.databind.deser.std.StdValueInstantiator", "canCreateFromDouble", ""}, {"com.fasterxml.jackson.databind.deser.std.StdValueInstantiator", "_createFromStringFallbacks", "com.fasterxml.jackson.databind.DeserializationContext,java.lang.String", "<sample:5>", "\n"}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{canCreateFromBoolean=false, canCreateFromDouble=false, canCreateFromInt=false, canCreateFromLong=false, canCreateFromObjectWith=false, canCreateFromString=false, canCreateUsingArrayDelegate=false, ca...#329#-1747445055", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput095() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.ValueInstantiator", "com.fasterxml.jackson.databind.deser.ValueInstantiator$Base", "createFromObjectWith", new String[]{"com.fasterxml.jackson.databind.DeserializationContext", "com.fasterxml.jackson.databind.deser.SettableBeanProperty[]", "com.fasterxml.jackson.databind.deser.impl.PropertyValueBuffer"}, new String[]{"<sample:7>", "<sample:2>", "<null>"}, false, 7, new String[][]{{"com.fasterxml.jackson.databind.deser.ValueInstantiator", "_createFromStringFallbacks", "com.fasterxml.jackson.databind.DeserializationContext,java.lang.String", "<sample:5>", " "}}, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput096() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.std.StdValueInstantiator", "com.fasterxml.jackson.databind.deser.std.StdValueInstantiator", "createUsingDelegate", new String[]{"com.fasterxml.jackson.databind.DeserializationContext", "java.lang.Object"}, new String[]{"<sample:5>", "<s:ziyI>"}, false, 5, new String[][]{{"com.fasterxml.jackson.databind.deser.std.StdValueInstantiator", "createFromInt", "com.fasterxml.jackson.databind.DeserializationContext,int", "<sample:6>", "-3"}, {"com.fasterxml.jackson.databind.deser.std.StdValueInstantiator", "canCreateFromBoolean", ""}, {"com.fasterxml.jackson.databind.deser.std.StdValueInstantiator", "createFromString", "com.fasterxml.jackson.databind.DeserializationContext,java.lang.String", "<sample:7>", "i"}}, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalStateException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput097() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.std.StdValueInstantiator", "com.fasterxml.jackson.databind.deser.std.StdValueInstantiator", "createUsingDelegate", new String[]{"com.fasterxml.jackson.databind.DeserializationContext", "java.lang.Object"}, new String[]{"<sample:0>", "<s:b9>"}, false, 1, new String[][]{{"com.fasterxml.jackson.databind.deser.std.StdValueInstantiator", "wrapAsJsonMappingException", "com.fasterxml.jackson.databind.DeserializationContext,java.lang.Throwable", "<null>", "<sample:0>"}, {"com.fasterxml.jackson.databind.deser.std.StdValueInstantiator", "configureFromBooleanCreator", "com.fasterxml.jackson.databind.introspect.AnnotatedWithParams", "<sample:5>"}, {"com.fasterxml.jackson.databind.deser.std.StdValueInstantiator", "createFromString", "com.fasterxml.jackson.databind.DeserializationContext,java.lang.String", "<sample:1>", "i1.1234567890123456"}}, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalStateException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput098() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.ValueInstantiator", "com.fasterxml.jackson.databind.deser.ValueInstantiator$Base", "createFromObjectWith", new String[]{"com.fasterxml.jackson.databind.DeserializationContext", "com.fasterxml.jackson.databind.deser.SettableBeanProperty[]", "com.fasterxml.jackson.databind.deser.impl.PropertyValueBuffer"}, new String[]{"<sample:4>", "<sample:2>", "<sample:6>"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.deser.ValueInstantiator", "getValueClass", ""}, {"com.fasterxml.jackson.databind.deser.ValueInstantiator", "createFromString", "com.fasterxml.jackson.databind.DeserializationContext,java.lang.String", "<sample:7>", "<null>"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalStateException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput099() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.ValueInstantiator", "com.fasterxml.jackson.databind.deser.ValueInstantiator$Base", "createFromObjectWith", new String[]{"com.fasterxml.jackson.databind.DeserializationContext", "com.fasterxml.jackson.databind.deser.SettableBeanProperty[]", "com.fasterxml.jackson.databind.deser.impl.PropertyValueBuffer"}, new String[]{"<sample:4>", "<sample:2>", "<sample:6>"}, false, 2, new String[][]{{"com.fasterxml.jackson.databind.deser.ValueInstantiator", "createFromString", "com.fasterxml.jackson.databind.DeserializationContext,java.lang.String", "<sample:7>", "a"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalStateException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput100() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.ValueInstantiator", "com.fasterxml.jackson.databind.deser.ValueInstantiator$Base", "createFromObjectWith", new String[]{"com.fasterxml.jackson.databind.DeserializationContext", "com.fasterxml.jackson.databind.deser.SettableBeanProperty[]", "com.fasterxml.jackson.databind.deser.impl.PropertyValueBuffer"}, new String[]{"<sample:4>", "<null>", "<sample:6>"}, false, 2, new String[][]{{"com.fasterxml.jackson.databind.deser.ValueInstantiator", "createFromString", "com.fasterxml.jackson.databind.DeserializationContext,java.lang.String", "<sample:7>", "a"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput101() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.ValueInstantiator", "com.fasterxml.jackson.databind.deser.ValueInstantiator$Base", "createFromObjectWith", new String[]{"com.fasterxml.jackson.databind.DeserializationContext", "com.fasterxml.jackson.databind.deser.SettableBeanProperty[]", "com.fasterxml.jackson.databind.deser.impl.PropertyValueBuffer"}, new String[]{"<sample:5>", "<sample:2>", "<sample:6>"}, false, 2, new String[][]{{"com.fasterxml.jackson.databind.deser.ValueInstantiator", "getDelegateCreator", ""}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalStateException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput102() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.std.StdValueInstantiator", "com.fasterxml.jackson.databind.deser.std.StdValueInstantiator", "canCreateUsingDefault", new String[]{}, new String[]{}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.deser.std.StdValueInstantiator", "canCreateFromDouble", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{canCreateFromBoolean=false, canCreateFromDouble=false, canCreateFromInt=false, canCreateFromLong=false, canCreateFromObjectWith=false, canCreateFromString=false, canCreateUsingArrayDelegate=false, ca...#299#-1213177389", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput103() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.std.StdValueInstantiator", "com.fasterxml.jackson.databind.deser.std.StdValueInstantiator", "canCreateUsingDefault", new String[]{}, new String[]{}, false, 1, new String[][]{{"com.fasterxml.jackson.databind.deser.std.StdValueInstantiator", "canCreateFromDouble", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{canCreateFromBoolean=false, canCreateFromDouble=false, canCreateFromInt=false, canCreateFromLong=false, canCreateFromObjectWith=false, canCreateFromString=false, canCreateUsingArrayDelegate=false, ca...#346#-691812784", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput104() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.std.StdValueInstantiator", "com.fasterxml.jackson.databind.deser.std.StdValueInstantiator", "canCreateUsingDefault", new String[]{}, new String[]{}, false, 2, new String[][]{{"com.fasterxml.jackson.databind.deser.std.StdValueInstantiator", "canCreateFromDouble", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{canCreateFromBoolean=false, canCreateFromDouble=false, canCreateFromInt=false, canCreateFromLong=false, canCreateFromObjectWith=false, canCreateFromString=false, canCreateUsingArrayDelegate=false, ca...#314#1636553649", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput105() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.std.StdValueInstantiator", "com.fasterxml.jackson.databind.deser.std.StdValueInstantiator", "getArrayDelegateCreator", new String[]{}, new String[]{}, false);
  assertNull(actual);
  assertEquals("receiver state after the call", "{canCreateFromBoolean=false, canCreateFromDouble=false, canCreateFromInt=false, canCreateFromLong=false, canCreateFromObjectWith=false, canCreateFromString=false, canCreateUsingArrayDelegate=false, ca...#299#-1213177389", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput106() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.std.StdValueInstantiator", "com.fasterxml.jackson.databind.deser.std.StdValueInstantiator", "getArrayDelegateCreator", new String[]{}, new String[]{}, false, 1, new String[][]{});
  assertNull(actual);
  assertEquals("receiver state after the call", "{canCreateFromBoolean=false, canCreateFromDouble=false, canCreateFromInt=false, canCreateFromLong=false, canCreateFromObjectWith=false, canCreateFromString=false, canCreateUsingArrayDelegate=false, ca...#346#-691812784", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput107() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.std.StdValueInstantiator", "com.fasterxml.jackson.databind.deser.std.StdValueInstantiator", "getArrayDelegateCreator", new String[]{}, new String[]{}, false, 2, new String[][]{});
  assertNull(actual);
  assertEquals("receiver state after the call", "{canCreateFromBoolean=false, canCreateFromDouble=false, canCreateFromInt=false, canCreateFromLong=false, canCreateFromObjectWith=false, canCreateFromString=false, canCreateUsingArrayDelegate=false, ca...#314#1636553649", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput108() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.std.StdValueInstantiator", "com.fasterxml.jackson.databind.deser.std.StdValueInstantiator", "getArrayDelegateCreator", new String[]{}, new String[]{}, false, 3, new String[][]{{"com.fasterxml.jackson.databind.deser.std.StdValueInstantiator", "canCreateFromInt", ""}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{canCreateFromBoolean=false, canCreateFromDouble=false, canCreateFromInt=false, canCreateFromLong=false, canCreateFromObjectWith=false, canCreateFromString=false, canCreateUsingArrayDelegate=false, ca...#324#-2126697502", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput109() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.std.StdValueInstantiator", "com.fasterxml.jackson.databind.deser.std.StdValueInstantiator", "canCreateFromObjectWith", new String[]{}, new String[]{}, false, 2, new String[][]{{"com.fasterxml.jackson.databind.deser.std.StdValueInstantiator", "canCreateFromLong", ""}, {"com.fasterxml.jackson.databind.deser.std.StdValueInstantiator", "getWithArgsCreator", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{canCreateFromBoolean=false, canCreateFromDouble=false, canCreateFromInt=false, canCreateFromLong=false, canCreateFromObjectWith=false, canCreateFromString=false, canCreateUsingArrayDelegate=false, ca...#314#1636553649", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput110() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.std.StdValueInstantiator", "com.fasterxml.jackson.databind.deser.std.StdValueInstantiator", "canCreateFromObjectWith", new String[]{}, new String[]{}, false, 3, new String[][]{{"com.fasterxml.jackson.databind.deser.std.StdValueInstantiator", "canCreateFromLong", ""}, {"com.fasterxml.jackson.databind.deser.std.StdValueInstantiator", "getWithArgsCreator", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{canCreateFromBoolean=false, canCreateFromDouble=false, canCreateFromInt=false, canCreateFromLong=false, canCreateFromObjectWith=false, canCreateFromString=false, canCreateUsingArrayDelegate=false, ca...#324#-2126697502", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput111() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.std.StdValueInstantiator", "com.fasterxml.jackson.databind.deser.std.StdValueInstantiator", "canCreateFromObjectWith", new String[]{}, new String[]{}, false, 3, new String[][]{{"com.fasterxml.jackson.databind.deser.std.StdValueInstantiator", "canCreateFromLong", ""}, {"com.fasterxml.jackson.databind.deser.std.StdValueInstantiator", "getWithArgsCreator", ""}, {"com.fasterxml.jackson.databind.deser.std.StdValueInstantiator", "configureFromDoubleCreator", "com.fasterxml.jackson.databind.introspect.AnnotatedWithParams", "<null>"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{canCreateFromBoolean=false, canCreateFromDouble=false, canCreateFromInt=false, canCreateFromLong=false, canCreateFromObjectWith=false, canCreateFromString=false, canCreateUsingArrayDelegate=false, ca...#324#-2126697502", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput112() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.std.StdValueInstantiator", "com.fasterxml.jackson.databind.deser.std.StdValueInstantiator", "canCreateFromObjectWith", new String[]{}, new String[]{}, false, 4, new String[][]{{"com.fasterxml.jackson.databind.deser.std.StdValueInstantiator", "canCreateFromLong", ""}, {"com.fasterxml.jackson.databind.deser.std.StdValueInstantiator", "getWithArgsCreator", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{canCreateFromBoolean=false, canCreateFromDouble=false, canCreateFromInt=false, canCreateFromLong=false, canCreateFromObjectWith=false, canCreateFromString=false, canCreateUsingArrayDelegate=false, ca...#309#-1951095057", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput113() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.std.StdValueInstantiator", "com.fasterxml.jackson.databind.deser.std.StdValueInstantiator", "canCreateFromObjectWith", new String[]{}, new String[]{}, false, 5, new String[][]{{"com.fasterxml.jackson.databind.deser.std.StdValueInstantiator", "canCreateFromLong", ""}, {"com.fasterxml.jackson.databind.deser.std.StdValueInstantiator", "getWithArgsCreator", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{canCreateFromBoolean=false, canCreateFromDouble=false, canCreateFromInt=false, canCreateFromLong=false, canCreateFromObjectWith=false, canCreateFromString=false, canCreateUsingArrayDelegate=false, ca...#300#1048321612", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput114() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.std.StdValueInstantiator", "com.fasterxml.jackson.databind.deser.std.StdValueInstantiator", "canCreateFromObjectWith", new String[]{}, new String[]{}, false, 5, new String[][]{{"com.fasterxml.jackson.databind.deser.std.StdValueInstantiator", "canCreateFromLong", ""}, {"com.fasterxml.jackson.databind.deser.std.StdValueInstantiator", "getWithArgsCreator", ""}, {"com.fasterxml.jackson.databind.deser.std.StdValueInstantiator", "getArrayDelegateType", "com.fasterxml.jackson.databind.DeserializationConfig", "<sample:2>"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{canCreateFromBoolean=false, canCreateFromDouble=false, canCreateFromInt=false, canCreateFromLong=false, canCreateFromObjectWith=false, canCreateFromString=false, canCreateUsingArrayDelegate=false, ca...#300#1048321612", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput115() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.std.StdValueInstantiator", "com.fasterxml.jackson.databind.deser.std.StdValueInstantiator", "canCreateFromObjectWith", new String[]{}, new String[]{}, false, 7, new String[][]{{"com.fasterxml.jackson.databind.deser.std.StdValueInstantiator", "canCreateFromLong", ""}, {"com.fasterxml.jackson.databind.deser.std.StdValueInstantiator", "getArrayDelegateType", "com.fasterxml.jackson.databind.DeserializationConfig", "<sample:2>"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{canCreateFromBoolean=false, canCreateFromDouble=false, canCreateFromInt=false, canCreateFromLong=false, canCreateFromObjectWith=false, canCreateFromString=false, canCreateUsingArrayDelegate=false, ca...#329#-1747445055", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput116() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.std.StdValueInstantiator", "com.fasterxml.jackson.databind.deser.std.StdValueInstantiator", "canCreateFromObjectWith", new String[]{}, new String[]{}, false, 8, new String[][]{{"com.fasterxml.jackson.databind.deser.std.StdValueInstantiator", "canCreateFromLong", ""}, {"com.fasterxml.jackson.databind.deser.std.StdValueInstantiator", "getArrayDelegateType", "com.fasterxml.jackson.databind.DeserializationConfig", "<sample:2>"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{canCreateFromBoolean=false, canCreateFromDouble=false, canCreateFromInt=false, canCreateFromLong=false, canCreateFromObjectWith=false, canCreateFromString=false, canCreateUsingArrayDelegate=false, ca...#309#-1951095057", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput117() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.std.StdValueInstantiator", "com.fasterxml.jackson.databind.deser.std.StdValueInstantiator", "canCreateFromObjectWith", new String[]{}, new String[]{}, false, 9, new String[][]{{"com.fasterxml.jackson.databind.deser.std.StdValueInstantiator", "canCreateFromLong", ""}, {"com.fasterxml.jackson.databind.deser.std.StdValueInstantiator", "getArrayDelegateType", "com.fasterxml.jackson.databind.DeserializationConfig", "<sample:2>"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{canCreateFromBoolean=false, canCreateFromDouble=false, canCreateFromInt=false, canCreateFromLong=false, canCreateFromObjectWith=false, canCreateFromString=false, canCreateUsingArrayDelegate=false, ca...#299#-1213177358", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput118() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.std.StdValueInstantiator", "com.fasterxml.jackson.databind.deser.std.StdValueInstantiator", "canCreateFromObjectWith", new String[]{}, new String[]{}, false, 15, new String[][]{{"com.fasterxml.jackson.databind.deser.std.StdValueInstantiator", "getValueClass", ""}, {"com.fasterxml.jackson.databind.deser.std.StdValueInstantiator", "canCreateFromLong", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{canCreateFromBoolean=false, canCreateFromDouble=false, canCreateFromInt=false, canCreateFromLong=false, canCreateFromObjectWith=false, canCreateFromString=false, canCreateUsingArrayDelegate=false, ca...#299#-1213177327", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput119() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.ValueInstantiator", "com.fasterxml.jackson.databind.deser.ValueInstantiator$Base", "getArrayDelegateCreator", new String[]{}, new String[]{}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.deser.ValueInstantiator", "canCreateFromString", ""}, {"com.fasterxml.jackson.databind.deser.ValueInstantiator", "canCreateFromInt", ""}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{canCreateFromBoolean=false, canCreateFromDouble=false, canCreateFromInt=false, canCreateFromLong=false, canCreateFromObjectWith=false, canCreateFromString=false, canCreateUsingArrayDelegate=false, ca...#313#-516867540", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput120() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.ValueInstantiator", "com.fasterxml.jackson.databind.deser.ValueInstantiator$Base", "getArrayDelegateCreator", new String[]{}, new String[]{}, false, 1, new String[][]{{"com.fasterxml.jackson.databind.deser.ValueInstantiator", "canCreateFromString", ""}, {"com.fasterxml.jackson.databind.deser.ValueInstantiator", "canCreateFromInt", ""}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{canCreateFromBoolean=false, canCreateFromDouble=false, canCreateFromInt=false, canCreateFromLong=false, canCreateFromObjectWith=false, canCreateFromString=false, canCreateUsingArrayDelegate=false, ca...#359#219967482", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput121() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.ValueInstantiator", "com.fasterxml.jackson.databind.deser.ValueInstantiator$Base", "getArrayDelegateCreator", new String[]{}, new String[]{}, false, 3, new String[][]{{"com.fasterxml.jackson.databind.deser.ValueInstantiator", "canCreateFromInt", ""}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{canCreateFromBoolean=false, canCreateFromDouble=false, canCreateFromInt=false, canCreateFromLong=false, canCreateFromObjectWith=false, canCreateFromString=false, canCreateUsingArrayDelegate=false, ca...#314#1636553649", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput122() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.ValueInstantiator", "com.fasterxml.jackson.databind.deser.ValueInstantiator$Base", "getArrayDelegateCreator", new String[]{}, new String[]{}, false, 4, new String[][]{{"com.fasterxml.jackson.databind.deser.ValueInstantiator", "canCreateFromInt", ""}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{canCreateFromBoolean=false, canCreateFromDouble=false, canCreateFromInt=false, canCreateFromLong=false, canCreateFromObjectWith=false, canCreateFromString=false, canCreateUsingArrayDelegate=false, ca...#318#1611653153", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput123() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.std.StdValueInstantiator", "com.fasterxml.jackson.databind.deser.std.StdValueInstantiator", "getIncompleteParameter", new String[]{}, new String[]{}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.deser.std.StdValueInstantiator", "createFromLong", "com.fasterxml.jackson.databind.DeserializationContext,long", "<sample:7>", "0"}, {"com.fasterxml.jackson.databind.deser.std.StdValueInstantiator", "getValueClass", ""}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{canCreateFromBoolean=false, canCreateFromDouble=false, canCreateFromInt=false, canCreateFromLong=false, canCreateFromObjectWith=false, canCreateFromString=false, canCreateUsingArrayDelegate=false, ca...#299#-1213177389", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput124() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.std.StdValueInstantiator", "com.fasterxml.jackson.databind.deser.std.StdValueInstantiator", "getIncompleteParameter", new String[]{}, new String[]{}, false, 1, new String[][]{{"com.fasterxml.jackson.databind.deser.std.StdValueInstantiator", "createFromLong", "com.fasterxml.jackson.databind.DeserializationContext,long", "<sample:7>", "0"}, {"com.fasterxml.jackson.databind.deser.std.StdValueInstantiator", "getValueClass", ""}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{canCreateFromBoolean=false, canCreateFromDouble=false, canCreateFromInt=false, canCreateFromLong=false, canCreateFromObjectWith=false, canCreateFromString=false, canCreateUsingArrayDelegate=false, ca...#346#-691812784", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput125() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.std.StdValueInstantiator", "com.fasterxml.jackson.databind.deser.std.StdValueInstantiator", "getIncompleteParameter", new String[]{}, new String[]{}, false, 2, new String[][]{{"com.fasterxml.jackson.databind.deser.std.StdValueInstantiator", "createFromLong", "com.fasterxml.jackson.databind.DeserializationContext,long", "<sample:7>", "0"}, {"com.fasterxml.jackson.databind.deser.std.StdValueInstantiator", "getValueClass", ""}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{canCreateFromBoolean=false, canCreateFromDouble=false, canCreateFromInt=false, canCreateFromLong=false, canCreateFromObjectWith=false, canCreateFromString=false, canCreateUsingArrayDelegate=false, ca...#314#1636553649", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput126() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.std.StdValueInstantiator", "com.fasterxml.jackson.databind.deser.std.StdValueInstantiator", "getIncompleteParameter", new String[]{}, new String[]{}, false, 3, new String[][]{{"com.fasterxml.jackson.databind.deser.std.StdValueInstantiator", "createFromLong", "com.fasterxml.jackson.databind.DeserializationContext,long", "<sample:7>", "0"}, {"com.fasterxml.jackson.databind.deser.std.StdValueInstantiator", "getValueClass", ""}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{canCreateFromBoolean=false, canCreateFromDouble=false, canCreateFromInt=false, canCreateFromLong=false, canCreateFromObjectWith=false, canCreateFromString=false, canCreateUsingArrayDelegate=false, ca...#324#-2126697502", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput127() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.std.StdValueInstantiator", "com.fasterxml.jackson.databind.deser.std.StdValueInstantiator", "getIncompleteParameter", new String[]{}, new String[]{}, false, 4, new String[][]{{"com.fasterxml.jackson.databind.deser.std.StdValueInstantiator", "createFromLong", "com.fasterxml.jackson.databind.DeserializationContext,long", "<sample:7>", "0"}, {"com.fasterxml.jackson.databind.deser.std.StdValueInstantiator", "getValueClass", ""}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{canCreateFromBoolean=false, canCreateFromDouble=false, canCreateFromInt=false, canCreateFromLong=false, canCreateFromObjectWith=false, canCreateFromString=false, canCreateUsingArrayDelegate=false, ca...#309#-1951095057", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput128() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.std.StdValueInstantiator", "com.fasterxml.jackson.databind.deser.std.StdValueInstantiator", "configureFromObjectSettings", new String[]{"com.fasterxml.jackson.databind.introspect.AnnotatedWithParams", "com.fasterxml.jackson.databind.introspect.AnnotatedWithParams", "com.fasterxml.jackson.databind.JavaType", "com.fasterxml.jackson.databind.deser.SettableBeanProperty[]", "com.fasterxml.jackson.databind.introspect.AnnotatedWithParams", "com.fasterxml.jackson.databind.deser.SettableBeanProperty[]"}, new String[]{"<sample:4>", "<sample:0>", "<sample:2>", "<sample:2>", "<sample:5>", "<sample:0>"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.deser.std.StdValueInstantiator", "canCreateFromLong", ""}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{canCreateFromBoolean=false, canCreateFromDouble=false, canCreateFromInt=false, canCreateFromLong=false, canCreateFromObjectWith=true, canCreateFromString=false, canCreateUsingArrayDelegate=false, can...#295#-1741164875", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput129() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.std.StdValueInstantiator", "com.fasterxml.jackson.databind.deser.std.StdValueInstantiator", "getIncompleteParameter", new String[]{}, new String[]{}, false, 1, new String[][]{{"com.fasterxml.jackson.databind.deser.std.StdValueInstantiator", "createFromLong", "com.fasterxml.jackson.databind.DeserializationContext,long", "<sample:9>", "0"}, {"com.fasterxml.jackson.databind.deser.std.StdValueInstantiator", "canCreateFromString", ""}, {"com.fasterxml.jackson.databind.deser.std.StdValueInstantiator", "configureFromIntCreator", "com.fasterxml.jackson.databind.introspect.AnnotatedWithParams", "<sample:3>"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{canCreateFromBoolean=false, canCreateFromDouble=false, canCreateFromInt=true, canCreateFromLong=false, canCreateFromObjectWith=false, canCreateFromString=false, canCreateUsingArrayDelegate=false, can...#344#-345351638", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput130() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.std.StdValueInstantiator", "com.fasterxml.jackson.databind.deser.std.StdValueInstantiator", "wrapAsJsonMappingException", new String[]{"com.fasterxml.jackson.databind.DeserializationContext", "java.lang.Throwable"}, new String[]{"<sample:3>", "<sample:0>"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.deser.std.StdValueInstantiator", "canCreateFromBoolean", ""}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput131() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.ValueInstantiator", "com.fasterxml.jackson.databind.deser.ValueInstantiator$Base", "getArrayDelegateCreator", new String[]{}, new String[]{}, false, 5, new String[][]{});
  assertNull(actual);
  assertEquals("receiver state after the call", "{canCreateFromBoolean=false, canCreateFromDouble=false, canCreateFromInt=false, canCreateFromLong=false, canCreateFromObjectWith=false, canCreateFromString=false, canCreateUsingArrayDelegate=false, ca...#311#-229031103", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput132() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.ValueInstantiator", "com.fasterxml.jackson.databind.deser.ValueInstantiator$Base", "getArrayDelegateCreator", new String[]{}, new String[]{}, false, 7, new String[][]{});
  assertNull(actual);
  assertEquals("receiver state after the call", "{canCreateFromBoolean=false, canCreateFromDouble=false, canCreateFromInt=false, canCreateFromLong=false, canCreateFromObjectWith=false, canCreateFromString=false, canCreateUsingArrayDelegate=false, ca...#316#-1594774090", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput133() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.std.StdValueInstantiator", "com.fasterxml.jackson.databind.deser.std.StdValueInstantiator", "createFromObjectWith", new String[]{"com.fasterxml.jackson.databind.DeserializationContext", "com.fasterxml.jackson.databind.deser.SettableBeanProperty[]", "com.fasterxml.jackson.databind.deser.impl.PropertyValueBuffer"}, new String[]{"<sample:9>", "<empty>", "<sample:6>"}, false); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.ArrayIndexOutOfBoundsException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput134() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.std.StdValueInstantiator", "com.fasterxml.jackson.databind.deser.std.StdValueInstantiator", "unwrapAndWrapException", new String[]{"com.fasterxml.jackson.databind.DeserializationContext", "java.lang.Throwable"}, new String[]{"<sample:9>", "<empty>"}, false);
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.databind.JsonMappingException", actual.getClass().getName());
  assertEquals("com.fasterxml.jackson.databind.JsonMappingException: Can not construct instance of java.lang.Object, problem: null {getLocalizedMessage=Can not construct instance of java.lang.Object, problem: nul.., ...#472#368045148", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{canCreateFromBoolean=false, canCreateFromDouble=false, canCreateFromInt=false, canCreateFromLong=false, canCreateFromObjectWith=false, canCreateFromString=false, canCreateUsingArrayDelegate=false, ca...#299#-1213177389", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput135() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.std.StdValueInstantiator", "com.fasterxml.jackson.databind.deser.std.StdValueInstantiator", "createFromInt", new String[]{"com.fasterxml.jackson.databind.DeserializationContext", "int"}, new String[]{"<sample:1>", "2"}, false); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput136() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.std.StdValueInstantiator", "com.fasterxml.jackson.databind.deser.std.StdValueInstantiator", "unwrapAndWrapException", new String[]{"com.fasterxml.jackson.databind.DeserializationContext", "java.lang.Throwable"}, new String[]{"<sample:3>", "<empty>"}, false); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput137() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.std.StdValueInstantiator", "com.fasterxml.jackson.databind.deser.std.StdValueInstantiator", "unwrapAndWrapException", new String[]{"com.fasterxml.jackson.databind.DeserializationContext", "java.lang.Throwable"}, new String[]{"<sample:0>", "<sample:2>"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.deser.std.StdValueInstantiator", "createUsingArrayDelegate", "com.fasterxml.jackson.databind.DeserializationContext,java.lang.Object", "<null>", "<s:key>"}, {"com.fasterxml.jackson.databind.deser.std.StdValueInstantiator", "canInstantiate", ""}});
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.databind.JsonMappingException", actual.getClass().getName());
  assertEquals("com.fasterxml.jackson.databind.JsonMappingException: Can not construct instance of java.lang.Object, problem: java.lang.Throwable:  {getLocalizedMessage=Can not construct instance of java.lang.Object,...#489#1263317033", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{canCreateFromBoolean=false, canCreateFromDouble=false, canCreateFromInt=false, canCreateFromLong=false, canCreateFromObjectWith=false, canCreateFromString=false, canCreateUsingArrayDelegate=false, ca...#299#-1213177389", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput138() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.std.StdValueInstantiator", "com.fasterxml.jackson.databind.deser.std.StdValueInstantiator", "createFromLong", new String[]{"com.fasterxml.jackson.databind.DeserializationContext", "long"}, new String[]{"<sample:9>", "2"}, false, 6, new String[][]{{"com.fasterxml.jackson.databind.deser.std.StdValueInstantiator", "createFromObjectWith", "com.fasterxml.jackson.databind.DeserializationContext,java.lang.Object[]", "<sample:1>", "<sample:1>"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput139() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.std.StdValueInstantiator", "com.fasterxml.jackson.databind.deser.std.StdValueInstantiator", "unwrapAndWrapException", new String[]{"com.fasterxml.jackson.databind.DeserializationContext", "java.lang.Throwable"}, new String[]{"<sample:0>", "<sample:2>"}, false, 1, new String[][]{{"com.fasterxml.jackson.databind.deser.std.StdValueInstantiator", "createUsingArrayDelegate", "com.fasterxml.jackson.databind.DeserializationContext,java.lang.Object", "<sample:7>", "<s:key>"}, {"com.fasterxml.jackson.databind.deser.std.StdValueInstantiator", "canInstantiate", ""}}), new String[][]{{"setStackTrace", "java.lang.StackTraceElement[]", "6"}});
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.databind.JsonMappingException", actual.getClass().getName());
  assertEquals("com.fasterxml.jackson.databind.JsonMappingException: Can not construct instance of java.lang.Object, problem: java.lang.Throwable:  {getLocalizedMessage=Can not construct instance of java.lang.Object,...#446#-359867057", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{canCreateFromBoolean=false, canCreateFromDouble=false, canCreateFromInt=false, canCreateFromLong=false, canCreateFromObjectWith=false, canCreateFromString=false, canCreateUsingArrayDelegate=false, ca...#346#-691812784", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput140() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.std.StdValueInstantiator", "com.fasterxml.jackson.databind.deser.std.StdValueInstantiator", "canCreateFromLong", new String[]{}, new String[]{}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.deser.std.StdValueInstantiator", "wrapAsJsonMappingException", "com.fasterxml.jackson.databind.DeserializationContext,java.lang.Throwable", "<sample:6>", "<sample:3>"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{canCreateFromBoolean=false, canCreateFromDouble=false, canCreateFromInt=false, canCreateFromLong=false, canCreateFromObjectWith=false, canCreateFromString=false, canCreateUsingArrayDelegate=false, ca...#299#-1213177389", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput141() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.std.StdValueInstantiator", "com.fasterxml.jackson.databind.deser.std.StdValueInstantiator", "unwrapAndWrapException", new String[]{"com.fasterxml.jackson.databind.DeserializationContext", "java.lang.Throwable"}, new String[]{"<sample:5>", "<sample:6>"}, false, 7, new String[][]{{"com.fasterxml.jackson.databind.deser.std.StdValueInstantiator", "createUsingArrayDelegate", "com.fasterxml.jackson.databind.DeserializationContext,java.lang.Object", "<sample:9>", "<s:k{y>"}, {"com.fasterxml.jackson.databind.deser.std.StdValueInstantiator", "rewrapCtorProblem", "com.fasterxml.jackson.databind.DeserializationContext,java.lang.Throwable", "<sample:9>", "<sample:4>"}, {"com.fasterxml.jackson.databind.deser.std.StdValueInstantiator", "getFromObjectArguments", "com.fasterxml.jackson.databind.DeserializationConfig", "<sample:7>"}}), new String[][]{{"setStackTrace", "java.lang.StackTraceElement[]", "1"}, {"getPath", "", "0"}});
  assertNotNull(actual);
  assertEquals("java.util.Collections$EmptyList", actual.getClass().getName());
  assertEquals("[]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{canCreateFromBoolean=false, canCreateFromDouble=false, canCreateFromInt=false, canCreateFromLong=false, canCreateFromObjectWith=false, canCreateFromString=false, canCreateUsingArrayDelegate=false, ca...#329#-1747445055", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput142() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.std.StdValueInstantiator", "com.fasterxml.jackson.databind.deser.std.StdValueInstantiator", "unwrapAndWrapException", new String[]{"com.fasterxml.jackson.databind.DeserializationContext", "java.lang.Throwable"}, new String[]{"<sample:5>", "<sample:2>"}, false, 6, new String[][]{{"com.fasterxml.jackson.databind.deser.std.StdValueInstantiator", "canCreateUsingArrayDelegate", ""}, {"com.fasterxml.jackson.databind.deser.std.StdValueInstantiator", "createUsingArrayDelegate", "com.fasterxml.jackson.databind.DeserializationContext,java.lang.Object", "<sample:9>", "<s:k{y>"}, {"com.fasterxml.jackson.databind.deser.std.StdValueInstantiator", "rewrapCtorProblem", "com.fasterxml.jackson.databind.DeserializationContext,java.lang.Throwable", "<sample:9>", "<sample:1>"}}), new String[][]{{"setStackTrace", "java.lang.StackTraceElement[]", "1"}, {"getPath", "", "0"}});
  assertNotNull(actual);
  assertEquals("java.util.Collections$EmptyList", actual.getClass().getName());
  assertEquals("[]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{canCreateFromBoolean=false, canCreateFromDouble=false, canCreateFromInt=false, canCreateFromLong=false, canCreateFromObjectWith=false, canCreateFromString=false, canCreateUsingArrayDelegate=false, ca...#309#-1951095057", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput143() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.ValueInstantiator", "com.fasterxml.jackson.databind.deser.ValueInstantiator$Base", "canInstantiate", new String[]{}, new String[]{}, false);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{canCreateFromBoolean=false, canCreateFromDouble=false, canCreateFromInt=false, canCreateFromLong=false, canCreateFromObjectWith=false, canCreateFromString=false, canCreateUsingArrayDelegate=false, ca...#313#-516867540", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput144() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.ValueInstantiator", "com.fasterxml.jackson.databind.deser.ValueInstantiator$Base", "createFromBoolean", new String[]{"com.fasterxml.jackson.databind.DeserializationContext", "boolean"}, new String[]{"<sample:2>", "false"}, false); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput145() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.std.StdValueInstantiator", "com.fasterxml.jackson.databind.deser.std.StdValueInstantiator", "unwrapAndWrapException", new String[]{"com.fasterxml.jackson.databind.DeserializationContext", "java.lang.Throwable"}, new String[]{"<sample:4>", "<sample:2>"}, false, 6, new String[][]{{"com.fasterxml.jackson.databind.deser.std.StdValueInstantiator", "canCreateUsingArrayDelegate", ""}, {"com.fasterxml.jackson.databind.deser.std.StdValueInstantiator", "createUsingArrayDelegate", "com.fasterxml.jackson.databind.DeserializationContext,java.lang.Object", "<sample:9>", "<s:k{y>"}, {"com.fasterxml.jackson.databind.deser.std.StdValueInstantiator", "rewrapCtorProblem", "com.fasterxml.jackson.databind.DeserializationContext,java.lang.Throwable", "<sample:9>", "<sample:1>"}}), new String[][]{{"setStackTrace", "java.lang.StackTraceElement[]", "1"}, {"getPath", "", "0"}, {"size", "", "0"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{canCreateFromBoolean=false, canCreateFromDouble=false, canCreateFromInt=false, canCreateFromLong=false, canCreateFromObjectWith=false, canCreateFromString=false, canCreateUsingArrayDelegate=false, ca...#309#-1951095057", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput146() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.std.StdValueInstantiator", "com.fasterxml.jackson.databind.deser.std.StdValueInstantiator", "unwrapAndWrapException", new String[]{"com.fasterxml.jackson.databind.DeserializationContext", "java.lang.Throwable"}, new String[]{"<sample:4>", "<sample:1>"}, false, 6, new String[][]{{"com.fasterxml.jackson.databind.deser.std.StdValueInstantiator", "canCreateUsingArrayDelegate", ""}, {"com.fasterxml.jackson.databind.deser.std.StdValueInstantiator", "createUsingArrayDelegate", "com.fasterxml.jackson.databind.DeserializationContext,java.lang.Object", "<sample:9>", "<s:k{y>"}, {"com.fasterxml.jackson.databind.deser.std.StdValueInstantiator", "rewrapCtorProblem", "com.fasterxml.jackson.databind.DeserializationContext,java.lang.Throwable", "<sample:9>", "<sample:1>"}}), new String[][]{{"setStackTrace", "java.lang.StackTraceElement[]", "1"}, {"getPath", "", "0"}, {"size", "", "0"}, {"listIterator", "", "4"}});
  assertNotNull(actual);
  assertEquals("java.util.Collections$EmptyListIterator", actual.getClass().getName());
  assertEquals("{hasNext=false, hasPrevious=false}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{canCreateFromBoolean=false, canCreateFromDouble=false, canCreateFromInt=false, canCreateFromLong=false, canCreateFromObjectWith=false, canCreateFromString=false, canCreateUsingArrayDelegate=false, ca...#309#-1951095057", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput147() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.std.StdValueInstantiator", "com.fasterxml.jackson.databind.deser.std.StdValueInstantiator", "configureFromIntCreator", new String[]{"com.fasterxml.jackson.databind.introspect.AnnotatedWithParams"}, new String[]{"<sample:3>"}, false, 6, new String[][]{{"com.fasterxml.jackson.databind.deser.std.StdValueInstantiator", "createFromDouble", "com.fasterxml.jackson.databind.DeserializationContext,double", "<sample:9>", "0.0"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{canCreateFromBoolean=false, canCreateFromDouble=false, canCreateFromInt=true, canCreateFromLong=false, canCreateFromObjectWith=false, canCreateFromString=false, canCreateUsingArrayDelegate=false, can...#307#1878741", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput148() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.std.StdValueInstantiator", "com.fasterxml.jackson.databind.deser.std.StdValueInstantiator", "_createFromStringFallbacks", new String[]{"com.fasterxml.jackson.databind.DeserializationContext", "java.lang.String"}, new String[]{"<sample:9>", "1.1234567890123456"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.deser.std.StdValueInstantiator", "createFromObjectWith", "com.fasterxml.jackson.databind.DeserializationContext,com.fasterxml.jackson.databind.deser.SettableBeanProperty[],com.fasterxml.jackson.databind.deser.impl.PropertyValueBuffer", "<sample:6>", "<empty>", "<sample:3>"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput149() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.std.StdValueInstantiator", "com.fasterxml.jackson.databind.deser.std.StdValueInstantiator", "canCreateUsingDelegate", new String[]{}, new String[]{}, false);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{canCreateFromBoolean=false, canCreateFromDouble=false, canCreateFromInt=false, canCreateFromLong=false, canCreateFromObjectWith=false, canCreateFromString=false, canCreateUsingArrayDelegate=false, ca...#299#-1213177389", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput150() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.ValueInstantiator", "com.fasterxml.jackson.databind.deser.ValueInstantiator$Base", "_createFromStringFallbacks", new String[]{"com.fasterxml.jackson.databind.DeserializationContext", "java.lang.String"}, new String[]{"<sample:2>", "PT1H"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.deser.ValueInstantiator", "canCreateFromObjectWith", ""}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput151() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.ValueInstantiator", "com.fasterxml.jackson.databind.deser.ValueInstantiator$Base", "canCreateFromObjectWith", new String[]{}, new String[]{}, false, 2, new String[][]{{"com.fasterxml.jackson.databind.deser.ValueInstantiator", "canInstantiate", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{canCreateFromBoolean=false, canCreateFromDouble=false, canCreateFromInt=false, canCreateFromLong=false, canCreateFromObjectWith=false, canCreateFromString=false, canCreateUsingArrayDelegate=false, ca...#313#-516867540", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput152() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.std.StdValueInstantiator", "com.fasterxml.jackson.databind.deser.std.StdValueInstantiator", "getArrayDelegateType", new String[]{"com.fasterxml.jackson.databind.DeserializationConfig"}, new String[]{"<sample:1>"}, false, 7, new String[][]{{"com.fasterxml.jackson.databind.deser.std.StdValueInstantiator", "getValueTypeDesc", ""}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{canCreateFromBoolean=false, canCreateFromDouble=false, canCreateFromInt=false, canCreateFromLong=false, canCreateFromObjectWith=false, canCreateFromString=false, canCreateUsingArrayDelegate=false, ca...#329#-1747445055", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput153() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.std.StdValueInstantiator", "com.fasterxml.jackson.databind.deser.std.StdValueInstantiator", "configureIncompleteParameter", new String[]{"com.fasterxml.jackson.databind.introspect.AnnotatedParameter"}, new String[]{"<sample:0>"}, false, 1, new String[][]{{"com.fasterxml.jackson.databind.deser.std.StdValueInstantiator", "canCreateUsingDelegate", ""}, {"com.fasterxml.jackson.databind.deser.std.StdValueInstantiator", "configureIncompleteParameter", "com.fasterxml.jackson.databind.introspect.AnnotatedParameter", "<sample:0>"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{canCreateFromBoolean=false, canCreateFromDouble=false, canCreateFromInt=false, canCreateFromLong=false, canCreateFromObjectWith=false, canCreateFromString=false, canCreateUsingArrayDelegate=false, ca...#346#-691812784", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput154() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.std.StdValueInstantiator", "com.fasterxml.jackson.databind.deser.std.StdValueInstantiator", "unwrapAndWrapException", new String[]{"com.fasterxml.jackson.databind.DeserializationContext", "java.lang.Throwable"}, new String[]{"<sample:1>", "<sample:3>"}, false, 2, new String[][]{{"com.fasterxml.jackson.databind.deser.std.StdValueInstantiator", "createUsingArrayDelegate", "com.fasterxml.jackson.databind.DeserializationContext,java.lang.Object", "<sample:10>", "<i:1>"}, {"com.fasterxml.jackson.databind.deser.std.StdValueInstantiator", "createFromInt", "com.fasterxml.jackson.databind.DeserializationContext,int", "<sample:6>", "-1"}, {"com.fasterxml.jackson.databind.deser.std.StdValueInstantiator", "rewrapCtorProblem", "com.fasterxml.jackson.databind.DeserializationContext,java.lang.Throwable", "<sample:13>", "<sample:2>"}}), new String[][]{{"getSuppressed", "", "4"}});
  assertNotNull(actual);
  assertEquals("[Ljava.lang.Throwable;", actual.getClass().getName());
  assertEquals("[]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{canCreateFromBoolean=false, canCreateFromDouble=false, canCreateFromInt=false, canCreateFromLong=false, canCreateFromObjectWith=false, canCreateFromString=false, canCreateUsingArrayDelegate=false, ca...#314#1636553649", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput155() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.ValueInstantiator", "com.fasterxml.jackson.databind.deser.ValueInstantiator$Base", "createFromObjectWith", new String[]{"com.fasterxml.jackson.databind.DeserializationContext", "java.lang.Object[]"}, new String[]{"<sample:3>", "<sample:1>"}, false, 5, new String[][]{{"com.fasterxml.jackson.databind.deser.ValueInstantiator", "createFromDouble", "com.fasterxml.jackson.databind.DeserializationContext,double", "<sample:3>", "-1.7976931348623157E308"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput156() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.ValueInstantiator", "com.fasterxml.jackson.databind.deser.ValueInstantiator$Base", "getArrayDelegateType", new String[]{"com.fasterxml.jackson.databind.DeserializationConfig"}, new String[]{"<sample:2>"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.deser.ValueInstantiator", "getValueTypeDesc", ""}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{canCreateFromBoolean=false, canCreateFromDouble=false, canCreateFromInt=false, canCreateFromLong=false, canCreateFromObjectWith=false, canCreateFromString=false, canCreateUsingArrayDelegate=false, ca...#313#-516867540", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput157() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.std.StdValueInstantiator", "com.fasterxml.jackson.databind.deser.std.StdValueInstantiator", "unwrapAndWrapException", new String[]{"com.fasterxml.jackson.databind.DeserializationContext", "java.lang.Throwable"}, new String[]{"<sample:4>", "<sample:4>"}, false, 3, new String[][]{{"com.fasterxml.jackson.databind.deser.std.StdValueInstantiator", "createUsingArrayDelegate", "com.fasterxml.jackson.databind.DeserializationContext,java.lang.Object", "<sample:10>", "<i:1>"}, {"com.fasterxml.jackson.databind.deser.std.StdValueInstantiator", "createFromInt", "com.fasterxml.jackson.databind.DeserializationContext,int", "<sample:6>", "-1"}, {"com.fasterxml.jackson.databind.deser.std.StdValueInstantiator", "rewrapCtorProblem", "com.fasterxml.jackson.databind.DeserializationContext,java.lang.Throwable", "<sample:13>", "<sample:2>"}}), new String[][]{{"getSuppressed", "", "4"}});
  assertNotNull(actual);
  assertEquals("[Ljava.lang.Throwable;", actual.getClass().getName());
  assertEquals("[]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{canCreateFromBoolean=false, canCreateFromDouble=false, canCreateFromInt=false, canCreateFromLong=false, canCreateFromObjectWith=false, canCreateFromString=false, canCreateUsingArrayDelegate=false, ca...#324#-2126697502", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput158() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.ValueInstantiator", "com.fasterxml.jackson.databind.deser.ValueInstantiator$Base", "getArrayDelegateCreator", new String[]{}, new String[]{}, false, 6, new String[][]{{"com.fasterxml.jackson.databind.deser.ValueInstantiator", "getFromObjectArguments", "com.fasterxml.jackson.databind.DeserializationConfig", "<sample:6>"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{canCreateFromBoolean=false, canCreateFromDouble=false, canCreateFromInt=false, canCreateFromLong=false, canCreateFromObjectWith=false, canCreateFromString=false, canCreateUsingArrayDelegate=false, ca...#318#1611653153", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput159() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.std.StdValueInstantiator", "com.fasterxml.jackson.databind.deser.std.StdValueInstantiator", "configureIncompleteParameter", new String[]{"com.fasterxml.jackson.databind.introspect.AnnotatedParameter"}, new String[]{"<sample:3>"}, false);
  assertNull(actual);
  assertEquals("receiver state after the call", "{canCreateFromBoolean=false, canCreateFromDouble=false, canCreateFromInt=false, canCreateFromLong=false, canCreateFromObjectWith=false, canCreateFromString=false, canCreateUsingArrayDelegate=false, ca...#299#-1213177389", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput160() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.std.StdValueInstantiator", "com.fasterxml.jackson.databind.deser.std.StdValueInstantiator", "unwrapAndWrapException", new String[]{"com.fasterxml.jackson.databind.DeserializationContext", "java.lang.Throwable"}, new String[]{"<sample:6>", "<sample:0>"}, false, 5, new String[][]{{"com.fasterxml.jackson.databind.deser.std.StdValueInstantiator", "createUsingArrayDelegate", "com.fasterxml.jackson.databind.DeserializationContext,java.lang.Object", "<sample:9>", "<i:-2047>"}, {"com.fasterxml.jackson.databind.deser.std.StdValueInstantiator", "createFromInt", "com.fasterxml.jackson.databind.DeserializationContext,int", "<sample:6>", "0"}, {"com.fasterxml.jackson.databind.deser.std.StdValueInstantiator", "rewrapCtorProblem", "com.fasterxml.jackson.databind.DeserializationContext,java.lang.Throwable", "<sample:4>", "<sample:5>"}}), new String[][]{{"getSuppressed", "", "4"}});
  assertNotNull(actual);
  assertEquals("[Ljava.lang.Throwable;", actual.getClass().getName());
  assertEquals("[]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{canCreateFromBoolean=false, canCreateFromDouble=false, canCreateFromInt=false, canCreateFromLong=false, canCreateFromObjectWith=false, canCreateFromString=false, canCreateUsingArrayDelegate=false, ca...#300#1048321612", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput161() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.std.StdValueInstantiator", "com.fasterxml.jackson.databind.deser.std.StdValueInstantiator", "canCreateFromLong", new String[]{}, new String[]{}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.deser.std.StdValueInstantiator", "configureFromLongCreator", "com.fasterxml.jackson.databind.introspect.AnnotatedWithParams", "<sample:3>"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
  assertEquals("receiver state after the call", "{canCreateFromBoolean=false, canCreateFromDouble=false, canCreateFromInt=false, canCreateFromLong=true, canCreateFromObjectWith=false, canCreateFromString=false, canCreateUsingArrayDelegate=false, can...#297#1101176383", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput162() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.std.StdValueInstantiator", "com.fasterxml.jackson.databind.deser.std.StdValueInstantiator", "configureFromStringCreator", new String[]{"com.fasterxml.jackson.databind.introspect.AnnotatedWithParams"}, new String[]{"<sample:3>"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.deser.std.StdValueInstantiator", "canCreateUsingArrayDelegate", ""}, {"com.fasterxml.jackson.databind.deser.std.StdValueInstantiator", "configureFromLongCreator", "com.fasterxml.jackson.databind.introspect.AnnotatedWithParams", "<sample:1>"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{canCreateFromBoolean=false, canCreateFromDouble=false, canCreateFromInt=false, canCreateFromLong=true, canCreateFromObjectWith=false, canCreateFromString=true, canCreateUsingArrayDelegate=false, canC...#296#802677682", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput163() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.std.StdValueInstantiator", "com.fasterxml.jackson.databind.deser.std.StdValueInstantiator", "canCreateFromInt", new String[]{}, new String[]{}, false);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{canCreateFromBoolean=false, canCreateFromDouble=false, canCreateFromInt=false, canCreateFromLong=false, canCreateFromObjectWith=false, canCreateFromString=false, canCreateUsingArrayDelegate=false, ca...#299#-1213177389", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput164() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.ValueInstantiator", "com.fasterxml.jackson.databind.deser.ValueInstantiator$Base", "createUsingDelegate", new String[]{"com.fasterxml.jackson.databind.DeserializationContext", "java.lang.Object"}, new String[]{"<sample:2>", "<s:k{y>"}, false); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput165() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.ValueInstantiator", "com.fasterxml.jackson.databind.deser.ValueInstantiator$Base", "getIncompleteParameter", new String[]{}, new String[]{}, false);
  assertNull(actual);
  assertEquals("receiver state after the call", "{canCreateFromBoolean=false, canCreateFromDouble=false, canCreateFromInt=false, canCreateFromLong=false, canCreateFromObjectWith=false, canCreateFromString=false, canCreateUsingArrayDelegate=false, ca...#313#-516867540", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput166() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.std.StdValueInstantiator", "com.fasterxml.jackson.databind.deser.std.StdValueInstantiator", "configureFromIntCreator", new String[]{"com.fasterxml.jackson.databind.introspect.AnnotatedWithParams"}, new String[]{"<sample:7>"}, false);
  assertNull(actual);
  assertEquals("receiver state after the call", "{canCreateFromBoolean=false, canCreateFromDouble=false, canCreateFromInt=true, canCreateFromLong=false, canCreateFromObjectWith=false, canCreateFromString=false, canCreateUsingArrayDelegate=false, can...#297#-865407687", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput167() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.std.StdValueInstantiator", "com.fasterxml.jackson.databind.deser.std.StdValueInstantiator", "unwrapAndWrapException", new String[]{"com.fasterxml.jackson.databind.DeserializationContext", "java.lang.Throwable"}, new String[]{"<sample:5>", "<sample:0>"}, false, 5, new String[][]{{"com.fasterxml.jackson.databind.deser.std.StdValueInstantiator", "createUsingArrayDelegate", "com.fasterxml.jackson.databind.DeserializationContext,java.lang.Object", "<sample:5>", "<s:b>"}, {"com.fasterxml.jackson.databind.deser.std.StdValueInstantiator", "createFromInt", "com.fasterxml.jackson.databind.DeserializationContext,int", "<sample:9>", "0"}, {"com.fasterxml.jackson.databind.deser.std.StdValueInstantiator", "rewrapCtorProblem", "com.fasterxml.jackson.databind.DeserializationContext,java.lang.Throwable", "<sample:4>", "<empty>"}}), new String[][]{{"getLocalizedMessage", "", "7"}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("Can not construct instance of int, problem: null", String.valueOf(actual));
  assertEquals("receiver state after the call", "{canCreateFromBoolean=false, canCreateFromDouble=false, canCreateFromInt=false, canCreateFromLong=false, canCreateFromObjectWith=false, canCreateFromString=false, canCreateUsingArrayDelegate=false, ca...#300#1048321612", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput168() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.ValueInstantiator", "com.fasterxml.jackson.databind.deser.ValueInstantiator$Base", "canCreateFromDouble", new String[]{}, new String[]{}, false);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{canCreateFromBoolean=false, canCreateFromDouble=false, canCreateFromInt=false, canCreateFromLong=false, canCreateFromObjectWith=false, canCreateFromString=false, canCreateUsingArrayDelegate=false, ca...#313#-516867540", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput169() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.std.StdValueInstantiator", "com.fasterxml.jackson.databind.deser.std.StdValueInstantiator", "createFromObjectWith", new String[]{"com.fasterxml.jackson.databind.DeserializationContext", "com.fasterxml.jackson.databind.deser.SettableBeanProperty[]", "com.fasterxml.jackson.databind.deser.impl.PropertyValueBuffer"}, new String[]{"<sample:1>", "<sample:1>", "<sample:2>"}, false, 1, new String[][]{{"com.fasterxml.jackson.databind.deser.std.StdValueInstantiator", "canCreateUsingDefault", ""}, {"com.fasterxml.jackson.databind.deser.std.StdValueInstantiator", "configureIncompleteParameter", "com.fasterxml.jackson.databind.introspect.AnnotatedParameter", "<sample:0>"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalStateException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput170() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.ValueInstantiator", "com.fasterxml.jackson.databind.deser.ValueInstantiator$Base", "getDelegateType", new String[]{"com.fasterxml.jackson.databind.DeserializationConfig"}, new String[]{"<sample:7>"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.deser.ValueInstantiator", "getDelegateCreator", ""}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{canCreateFromBoolean=false, canCreateFromDouble=false, canCreateFromInt=false, canCreateFromLong=false, canCreateFromObjectWith=false, canCreateFromString=false, canCreateUsingArrayDelegate=false, ca...#313#-516867540", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput171() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.std.StdValueInstantiator", "com.fasterxml.jackson.databind.deser.std.StdValueInstantiator", "getFromObjectArguments", new String[]{"com.fasterxml.jackson.databind.DeserializationConfig"}, new String[]{"<sample:3>"}, false);
  assertNull(actual);
  assertEquals("receiver state after the call", "{canCreateFromBoolean=false, canCreateFromDouble=false, canCreateFromInt=false, canCreateFromLong=false, canCreateFromObjectWith=false, canCreateFromString=false, canCreateUsingArrayDelegate=false, ca...#299#-1213177389", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput172() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.std.StdValueInstantiator", "com.fasterxml.jackson.databind.deser.std.StdValueInstantiator", "canCreateUsingArrayDelegate", new String[]{}, new String[]{}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.deser.std.StdValueInstantiator", "createUsingDefault", "com.fasterxml.jackson.databind.DeserializationContext", "<sample:5>"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{canCreateFromBoolean=false, canCreateFromDouble=false, canCreateFromInt=false, canCreateFromLong=false, canCreateFromObjectWith=false, canCreateFromString=false, canCreateUsingArrayDelegate=false, ca...#299#-1213177389", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput173() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.std.StdValueInstantiator", "com.fasterxml.jackson.databind.deser.std.StdValueInstantiator", "canCreateUsingArrayDelegate", new String[]{}, new String[]{}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.deser.std.StdValueInstantiator", "createUsingDefault", "com.fasterxml.jackson.databind.DeserializationContext", "<sample:5>"}, {"com.fasterxml.jackson.databind.deser.std.StdValueInstantiator", "configureFromStringCreator", "com.fasterxml.jackson.databind.introspect.AnnotatedWithParams", "<sample:5>"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{canCreateFromBoolean=false, canCreateFromDouble=false, canCreateFromInt=false, canCreateFromLong=false, canCreateFromObjectWith=false, canCreateFromString=true, canCreateUsingArrayDelegate=false, can...#297#1475595287", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput174() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.ValueInstantiator", "com.fasterxml.jackson.databind.deser.ValueInstantiator$Base", "canCreateFromString", new String[]{}, new String[]{}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.deser.ValueInstantiator", "canCreateFromDouble", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{canCreateFromBoolean=false, canCreateFromDouble=false, canCreateFromInt=false, canCreateFromLong=false, canCreateFromObjectWith=false, canCreateFromString=false, canCreateUsingArrayDelegate=false, ca...#313#-516867540", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput175() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.ValueInstantiator", "com.fasterxml.jackson.databind.deser.ValueInstantiator$Base", "canCreateFromString", new String[]{}, new String[]{}, false, 1, new String[][]{{"com.fasterxml.jackson.databind.deser.ValueInstantiator", "canInstantiate", ""}, {"com.fasterxml.jackson.databind.deser.ValueInstantiator", "canCreateFromDouble", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{canCreateFromBoolean=false, canCreateFromDouble=false, canCreateFromInt=false, canCreateFromLong=false, canCreateFromObjectWith=false, canCreateFromString=false, canCreateUsingArrayDelegate=false, ca...#359#219967482", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput176() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.ValueInstantiator", "com.fasterxml.jackson.databind.deser.ValueInstantiator$Base", "createUsingDefault", new String[]{"com.fasterxml.jackson.databind.DeserializationContext"}, new String[]{"<sample:0>"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.deser.ValueInstantiator", "canCreateUsingDelegate", ""}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput177() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.ValueInstantiator", "com.fasterxml.jackson.databind.deser.ValueInstantiator$Base", "canCreateFromDouble", new String[]{}, new String[]{}, false, 1, new String[][]{{"com.fasterxml.jackson.databind.deser.ValueInstantiator", "canInstantiate", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{canCreateFromBoolean=false, canCreateFromDouble=false, canCreateFromInt=false, canCreateFromLong=false, canCreateFromObjectWith=false, canCreateFromString=false, canCreateUsingArrayDelegate=false, ca...#359#219967482", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput178() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.ValueInstantiator", "com.fasterxml.jackson.databind.deser.ValueInstantiator$Base", "canCreateFromDouble", new String[]{}, new String[]{}, false, 3, new String[][]{{"com.fasterxml.jackson.databind.deser.ValueInstantiator", "canInstantiate", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{canCreateFromBoolean=false, canCreateFromDouble=false, canCreateFromInt=false, canCreateFromLong=false, canCreateFromObjectWith=false, canCreateFromString=false, canCreateUsingArrayDelegate=false, ca...#314#1636553649", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput179() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.ValueInstantiator", "com.fasterxml.jackson.databind.deser.ValueInstantiator$Base", "canCreateFromDouble", new String[]{}, new String[]{}, false, 4, new String[][]{});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{canCreateFromBoolean=false, canCreateFromDouble=false, canCreateFromInt=false, canCreateFromLong=false, canCreateFromObjectWith=false, canCreateFromString=false, canCreateUsingArrayDelegate=false, ca...#318#1611653153", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput180() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.ValueInstantiator", "com.fasterxml.jackson.databind.deser.ValueInstantiator$Base", "canCreateFromDouble", new String[]{}, new String[]{}, false, 5, new String[][]{});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{canCreateFromBoolean=false, canCreateFromDouble=false, canCreateFromInt=false, canCreateFromLong=false, canCreateFromObjectWith=false, canCreateFromString=false, canCreateUsingArrayDelegate=false, ca...#311#-229031103", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput181() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.std.StdValueInstantiator", "com.fasterxml.jackson.databind.deser.std.StdValueInstantiator", "getArrayDelegateCreator", new String[]{}, new String[]{}, false, 6, new String[][]{{"com.fasterxml.jackson.databind.deser.std.StdValueInstantiator", "canCreateFromDouble", ""}, {"com.fasterxml.jackson.databind.deser.std.StdValueInstantiator", "canCreateFromInt", ""}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{canCreateFromBoolean=false, canCreateFromDouble=false, canCreateFromInt=false, canCreateFromLong=false, canCreateFromObjectWith=false, canCreateFromString=false, canCreateUsingArrayDelegate=false, ca...#309#-1951095057", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput182() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.std.StdValueInstantiator", "com.fasterxml.jackson.databind.deser.std.StdValueInstantiator", "getArrayDelegateCreator", new String[]{}, new String[]{}, false, 11, new String[][]{{"com.fasterxml.jackson.databind.deser.std.StdValueInstantiator", "createFromInt", "com.fasterxml.jackson.databind.DeserializationContext,int", "<sample:3>", "0"}, {"com.fasterxml.jackson.databind.deser.std.StdValueInstantiator", "wrapException", "java.lang.Throwable", "<sample:3>"}, {"com.fasterxml.jackson.databind.deser.std.StdValueInstantiator", "canCreateFromDouble", ""}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{canCreateFromBoolean=false, canCreateFromDouble=false, canCreateFromInt=false, canCreateFromLong=false, canCreateFromObjectWith=false, canCreateFromString=false, canCreateUsingArrayDelegate=false, ca...#359#-742779505", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput183() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.std.StdValueInstantiator", "com.fasterxml.jackson.databind.deser.std.StdValueInstantiator", "getArrayDelegateType", new String[]{"com.fasterxml.jackson.databind.DeserializationConfig"}, new String[]{"<sample:5>"}, false);
  assertNull(actual);
  assertEquals("receiver state after the call", "{canCreateFromBoolean=false, canCreateFromDouble=false, canCreateFromInt=false, canCreateFromLong=false, canCreateFromObjectWith=false, canCreateFromString=false, canCreateUsingArrayDelegate=false, ca...#299#-1213177389", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput184() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.std.StdValueInstantiator", "com.fasterxml.jackson.databind.deser.std.StdValueInstantiator", "getArrayDelegateType", new String[]{"com.fasterxml.jackson.databind.DeserializationConfig"}, new String[]{"<sample:5>"}, false, 12, new String[][]{});
  assertNull(actual);
  assertEquals("receiver state after the call", "{canCreateFromBoolean=false, canCreateFromDouble=false, canCreateFromInt=false, canCreateFromLong=false, canCreateFromObjectWith=false, canCreateFromString=false, canCreateUsingArrayDelegate=false, ca...#309#-1951095057", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput185() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.ValueInstantiator", "com.fasterxml.jackson.databind.deser.ValueInstantiator$Base", "getFromObjectArguments", new String[]{"com.fasterxml.jackson.databind.DeserializationConfig"}, new String[]{"<sample:2>"}, false, 6, new String[][]{{"com.fasterxml.jackson.databind.deser.ValueInstantiator", "_createFromStringFallbacks", "com.fasterxml.jackson.databind.DeserializationContext,java.lang.String", "<sample:7>", "<a>b</a>"}, {"com.fasterxml.jackson.databind.deser.ValueInstantiator", "canCreateFromDouble", ""}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{canCreateFromBoolean=false, canCreateFromDouble=false, canCreateFromInt=false, canCreateFromLong=false, canCreateFromObjectWith=false, canCreateFromString=false, canCreateUsingArrayDelegate=false, ca...#318#1611653153", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput186() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.ValueInstantiator", "com.fasterxml.jackson.databind.deser.ValueInstantiator$Base", "getFromObjectArguments", new String[]{"com.fasterxml.jackson.databind.DeserializationConfig"}, new String[]{"<sample:1>"}, false, 9, new String[][]{{"com.fasterxml.jackson.databind.deser.ValueInstantiator", "createUsingDelegate", "com.fasterxml.jackson.databind.DeserializationContext,java.lang.Object", "<sample:4>", "<b:true>"}, {"com.fasterxml.jackson.databind.deser.ValueInstantiator", "_createFromStringFallbacks", "com.fasterxml.jackson.databind.DeserializationContext,java.lang.String", "<sample:7>", "<a>b</a>"}, {"com.fasterxml.jackson.databind.deser.ValueInstantiator", "canCreateFromDouble", ""}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{canCreateFromBoolean=false, canCreateFromDouble=false, canCreateFromInt=false, canCreateFromLong=false, canCreateFromObjectWith=false, canCreateFromString=false, canCreateUsingArrayDelegate=false, ca...#317#1180324081", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput187() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.ValueInstantiator", "com.fasterxml.jackson.databind.deser.ValueInstantiator$Base", "getFromObjectArguments", new String[]{"com.fasterxml.jackson.databind.DeserializationConfig"}, new String[]{"<sample:7>"}, false, 5, new String[][]{});
  assertNull(actual);
  assertEquals("receiver state after the call", "{canCreateFromBoolean=false, canCreateFromDouble=false, canCreateFromInt=false, canCreateFromLong=false, canCreateFromObjectWith=false, canCreateFromString=false, canCreateUsingArrayDelegate=false, ca...#311#-229031103", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput188() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.ValueInstantiator", "com.fasterxml.jackson.databind.deser.ValueInstantiator$Base", "canCreateUsingDelegate", new String[]{}, new String[]{}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.deser.ValueInstantiator", "getDelegateType", "com.fasterxml.jackson.databind.DeserializationConfig", "<sample:3>"}, {"com.fasterxml.jackson.databind.deser.ValueInstantiator", "canCreateUsingDefault", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{canCreateFromBoolean=false, canCreateFromDouble=false, canCreateFromInt=false, canCreateFromLong=false, canCreateFromObjectWith=false, canCreateFromString=false, canCreateUsingArrayDelegate=false, ca...#313#-516867540", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput189() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.ValueInstantiator", "com.fasterxml.jackson.databind.deser.ValueInstantiator$Base", "canCreateUsingDelegate", new String[]{}, new String[]{}, false, 1, new String[][]{{"com.fasterxml.jackson.databind.deser.ValueInstantiator", "getDelegateType", "com.fasterxml.jackson.databind.DeserializationConfig", "<sample:3>"}, {"com.fasterxml.jackson.databind.deser.ValueInstantiator", "canCreateUsingDefault", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{canCreateFromBoolean=false, canCreateFromDouble=false, canCreateFromInt=false, canCreateFromLong=false, canCreateFromObjectWith=false, canCreateFromString=false, canCreateUsingArrayDelegate=false, ca...#359#219967482", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput190() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.ValueInstantiator", "com.fasterxml.jackson.databind.deser.ValueInstantiator$Base", "canCreateUsingDelegate", new String[]{}, new String[]{}, false, 8, new String[][]{});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{canCreateFromBoolean=false, canCreateFromDouble=false, canCreateFromInt=false, canCreateFromLong=false, canCreateFromObjectWith=false, canCreateFromString=false, canCreateUsingArrayDelegate=false, ca...#318#1611653153", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput191() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.ValueInstantiator", "com.fasterxml.jackson.databind.deser.ValueInstantiator$Base", "canCreateUsingDelegate", new String[]{}, new String[]{}, false, 9, new String[][]{});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{canCreateFromBoolean=false, canCreateFromDouble=false, canCreateFromInt=false, canCreateFromLong=false, canCreateFromObjectWith=false, canCreateFromString=false, canCreateUsingArrayDelegate=false, ca...#317#1180324081", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput192() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.ValueInstantiator", "com.fasterxml.jackson.databind.deser.ValueInstantiator$Base", "canCreateUsingDelegate", new String[]{}, new String[]{}, false, 11, new String[][]{{"com.fasterxml.jackson.databind.deser.ValueInstantiator", "canCreateFromObjectWith", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{canCreateFromBoolean=false, canCreateFromDouble=false, canCreateFromInt=false, canCreateFromLong=false, canCreateFromObjectWith=false, canCreateFromString=false, canCreateUsingArrayDelegate=false, ca...#317#-1505475647", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput193() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.std.StdValueInstantiator", "com.fasterxml.jackson.databind.deser.std.StdValueInstantiator", "getValueClass", new String[]{}, new String[]{}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.deser.std.StdValueInstantiator", "createFromString", "com.fasterxml.jackson.databind.DeserializationContext,java.lang.String", "<sample:0>", "0x123456789"}});
  assertNotNull(actual);
  assertEquals("java.lang.Class", actual.getClass().getName());
  assertEquals("class java.lang.Object {getAnnotatedInterfaces=[], getAnnotations=[], getCanonicalName=java.lang.Object, getClasses=[], getConstructors=[public java.lang.Object()], getDeclaredAnnotations=[], getDecla...#543#-946457427", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{canCreateFromBoolean=false, canCreateFromDouble=false, canCreateFromInt=false, canCreateFromLong=false, canCreateFromObjectWith=false, canCreateFromString=false, canCreateUsingArrayDelegate=false, ca...#299#-1213177389", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput194() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.std.StdValueInstantiator", "com.fasterxml.jackson.databind.deser.std.StdValueInstantiator", "getValueClass", new String[]{}, new String[]{}, false, 1, new String[][]{});
  assertNotNull(actual);
  assertEquals("java.lang.Class", actual.getClass().getName());
  assertEquals("class java.lang.Object {getAnnotatedInterfaces=[], getAnnotations=[], getCanonicalName=java.lang.Object, getClasses=[], getConstructors=[public java.lang.Object()], getDeclaredAnnotations=[], getDecla...#543#-946457427", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{canCreateFromBoolean=false, canCreateFromDouble=false, canCreateFromInt=false, canCreateFromLong=false, canCreateFromObjectWith=false, canCreateFromString=false, canCreateUsingArrayDelegate=false, ca...#346#-691812784", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput195() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.std.StdValueInstantiator", "com.fasterxml.jackson.databind.deser.std.StdValueInstantiator", "getValueClass", new String[]{}, new String[]{}, false, 2, new String[][]{});
  assertNotNull(actual);
  assertEquals("java.lang.Class", actual.getClass().getName());
  assertEquals("class java.lang.Integer {getAnnotatedInterfaces=?, getAnnotations=[], getCanonicalName=java.lang.Integer, getClasses=[], getConstructors=[public java.lang.Integer(java.lang.String) throws java.lang..,...#840#1423407143", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{canCreateFromBoolean=false, canCreateFromDouble=false, canCreateFromInt=false, canCreateFromLong=false, canCreateFromObjectWith=false, canCreateFromString=false, canCreateUsingArrayDelegate=false, ca...#314#1636553649", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput196() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.std.StdValueInstantiator", "com.fasterxml.jackson.databind.deser.std.StdValueInstantiator", "getValueClass", new String[]{}, new String[]{}, false, 3, new String[][]{});
  assertNotNull(actual);
  assertEquals("java.lang.Class", actual.getClass().getName());
  assertEquals("class generated.algorithm.SearchInputFactory_scaffolding$GenericSub {getAnnotatedInterfaces=[], getAnnotations=[], getCanonicalName=generated.algorithm.SearchInputFactory_scaffolding.GenericSu.., getC...#704#-369832670", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{canCreateFromBoolean=false, canCreateFromDouble=false, canCreateFromInt=false, canCreateFromLong=false, canCreateFromObjectWith=false, canCreateFromString=false, canCreateUsingArrayDelegate=false, ca...#324#-2126697502", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput197() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.std.StdValueInstantiator", "com.fasterxml.jackson.databind.deser.std.StdValueInstantiator", "getValueClass", new String[]{}, new String[]{}, false, 4, new String[][]{});
  assertNotNull(actual);
  assertEquals("java.lang.Class", actual.getClass().getName());
  assertEquals("class java.lang.Object {getAnnotatedInterfaces=[], getAnnotations=[], getCanonicalName=java.lang.Object, getClasses=[], getConstructors=[public java.lang.Object()], getDeclaredAnnotations=[], getDecla...#543#-946457427", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{canCreateFromBoolean=false, canCreateFromDouble=false, canCreateFromInt=false, canCreateFromLong=false, canCreateFromObjectWith=false, canCreateFromString=false, canCreateUsingArrayDelegate=false, ca...#309#-1951095057", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput198() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.std.StdValueInstantiator", "com.fasterxml.jackson.databind.deser.std.StdValueInstantiator", "getValueClass", new String[]{}, new String[]{}, false, 5, new String[][]{});
  assertNotNull(actual);
  assertEquals("java.lang.Class", actual.getClass().getName());
  assertEquals("int {getAnnotatedInterfaces=[], getAnnotations=[], getCanonicalName=int, getClasses=[], getConstructors=[], getDeclaredAnnotations=[], getDeclaredClasses=[], getDeclaredConstructors=[], getDeclaredFie...#344#1759716971", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{canCreateFromBoolean=false, canCreateFromDouble=false, canCreateFromInt=false, canCreateFromLong=false, canCreateFromObjectWith=false, canCreateFromString=false, canCreateUsingArrayDelegate=false, ca...#300#1048321612", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput199() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.std.StdValueInstantiator", "com.fasterxml.jackson.databind.deser.std.StdValueInstantiator", "getValueClass", new String[]{}, new String[]{}, false, 7, new String[][]{});
  assertNotNull(actual);
  assertEquals("java.lang.Class", actual.getClass().getName());
  assertEquals("class java.lang.String {getAnnotatedInterfaces=?, getAnnotations=[], getCanonicalName=java.lang.String, getClasses=[], getConstructors=[public java.lang.String(byte[]), public java.lang.String(by.., g...#779#-421279309", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{canCreateFromBoolean=false, canCreateFromDouble=false, canCreateFromInt=false, canCreateFromLong=false, canCreateFromObjectWith=false, canCreateFromString=false, canCreateUsingArrayDelegate=false, ca...#329#-1747445055", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput200() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.std.StdValueInstantiator", "com.fasterxml.jackson.databind.deser.std.StdValueInstantiator", "canCreateFromLong", new String[]{}, new String[]{}, false, 6, new String[][]{{"com.fasterxml.jackson.databind.deser.std.StdValueInstantiator", "configureFromStringCreator", "com.fasterxml.jackson.databind.introspect.AnnotatedWithParams", "<sample:6>"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{canCreateFromBoolean=false, canCreateFromDouble=false, canCreateFromInt=false, canCreateFromLong=false, canCreateFromObjectWith=false, canCreateFromString=true, canCreateUsingArrayDelegate=false, can...#307#855313459", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput201() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.std.StdValueInstantiator", "com.fasterxml.jackson.databind.deser.std.StdValueInstantiator", "configureFromObjectSettings", new String[]{"com.fasterxml.jackson.databind.introspect.AnnotatedWithParams", "com.fasterxml.jackson.databind.introspect.AnnotatedWithParams", "com.fasterxml.jackson.databind.JavaType", "com.fasterxml.jackson.databind.deser.SettableBeanProperty[]", "com.fasterxml.jackson.databind.introspect.AnnotatedWithParams", "com.fasterxml.jackson.databind.deser.SettableBeanProperty[]"}, new String[]{"<sample:6>", "<sample:5>", "<null>", "<null>", "<sample:1>", "<empty>"}, false);
  assertNull(actual);
  assertEquals("receiver state after the call", "{canCreateFromBoolean=false, canCreateFromDouble=false, canCreateFromInt=false, canCreateFromLong=false, canCreateFromObjectWith=true, canCreateFromString=false, canCreateUsingArrayDelegate=false, can...#296#-1063538864", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput202() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.std.StdValueInstantiator", "com.fasterxml.jackson.databind.deser.std.StdValueInstantiator", "canCreateFromDouble", new String[]{}, new String[]{}, false);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{canCreateFromBoolean=false, canCreateFromDouble=false, canCreateFromInt=false, canCreateFromLong=false, canCreateFromObjectWith=false, canCreateFromString=false, canCreateUsingArrayDelegate=false, ca...#299#-1213177389", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput203() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.std.StdValueInstantiator", "com.fasterxml.jackson.databind.deser.std.StdValueInstantiator", "canCreateFromDouble", new String[]{}, new String[]{}, false, 1, new String[][]{});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{canCreateFromBoolean=false, canCreateFromDouble=false, canCreateFromInt=false, canCreateFromLong=false, canCreateFromObjectWith=false, canCreateFromString=false, canCreateUsingArrayDelegate=false, ca...#346#-691812784", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput204() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.std.StdValueInstantiator", "com.fasterxml.jackson.databind.deser.std.StdValueInstantiator", "canCreateFromDouble", new String[]{}, new String[]{}, false, 2, new String[][]{});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{canCreateFromBoolean=false, canCreateFromDouble=false, canCreateFromInt=false, canCreateFromLong=false, canCreateFromObjectWith=false, canCreateFromString=false, canCreateUsingArrayDelegate=false, ca...#314#1636553649", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput205() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.std.StdValueInstantiator", "com.fasterxml.jackson.databind.deser.std.StdValueInstantiator", "canCreateFromDouble", new String[]{}, new String[]{}, false, 3, new String[][]{});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{canCreateFromBoolean=false, canCreateFromDouble=false, canCreateFromInt=false, canCreateFromLong=false, canCreateFromObjectWith=false, canCreateFromString=false, canCreateUsingArrayDelegate=false, ca...#324#-2126697502", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput206() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.std.StdValueInstantiator", "com.fasterxml.jackson.databind.deser.std.StdValueInstantiator", "canCreateFromDouble", new String[]{}, new String[]{}, false, 4, new String[][]{{"com.fasterxml.jackson.databind.deser.std.StdValueInstantiator", "canCreateFromInt", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{canCreateFromBoolean=false, canCreateFromDouble=false, canCreateFromInt=false, canCreateFromLong=false, canCreateFromObjectWith=false, canCreateFromString=false, canCreateUsingArrayDelegate=false, ca...#309#-1951095057", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput207() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.std.StdValueInstantiator", "com.fasterxml.jackson.databind.deser.std.StdValueInstantiator", "canCreateFromDouble", new String[]{}, new String[]{}, false, 20, new String[][]{{"com.fasterxml.jackson.databind.deser.std.StdValueInstantiator", "_createFromStringFallbacks", "com.fasterxml.jackson.databind.DeserializationContext,java.lang.String", "<sample:4>", ""}, {"com.fasterxml.jackson.databind.deser.std.StdValueInstantiator", "createFromObjectWith", "com.fasterxml.jackson.databind.DeserializationContext,com.fasterxml.jackson.databind.deser.SettableBeanProperty[],com.fasterxml.jackson.databind.deser.impl.PropertyValueBuffer", "<sample:3>", "<sample:0>", "<sample:7>"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{canCreateFromBoolean=false, canCreateFromDouble=false, canCreateFromInt=false, canCreateFromLong=false, canCreateFromObjectWith=false, canCreateFromString=false, canCreateUsingArrayDelegate=false, ca...#309#-1951095057", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput208() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.std.StdValueInstantiator", "com.fasterxml.jackson.databind.deser.std.StdValueInstantiator", "createUsingDelegate", new String[]{"com.fasterxml.jackson.databind.DeserializationContext", "java.lang.Object"}, new String[]{"<sample:9>", "<s:k{y>"}, false, 5, new String[][]{{"com.fasterxml.jackson.databind.deser.std.StdValueInstantiator", "createFromInt", "com.fasterxml.jackson.databind.DeserializationContext,int", "<sample:5>", "-1"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalStateException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput209() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.std.StdValueInstantiator", "com.fasterxml.jackson.databind.deser.std.StdValueInstantiator", "createFromBoolean", new String[]{"com.fasterxml.jackson.databind.DeserializationContext", "boolean"}, new String[]{"<sample:2>", "false"}, false); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput210() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.std.StdValueInstantiator", "com.fasterxml.jackson.databind.deser.std.StdValueInstantiator", "canInstantiate", new String[]{}, new String[]{}, false);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{canCreateFromBoolean=false, canCreateFromDouble=false, canCreateFromInt=false, canCreateFromLong=false, canCreateFromObjectWith=false, canCreateFromString=false, canCreateUsingArrayDelegate=false, ca...#299#-1213177389", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput211() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.std.StdValueInstantiator", "com.fasterxml.jackson.databind.deser.std.StdValueInstantiator", "canInstantiate", new String[]{}, new String[]{}, false, 1, new String[][]{});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{canCreateFromBoolean=false, canCreateFromDouble=false, canCreateFromInt=false, canCreateFromLong=false, canCreateFromObjectWith=false, canCreateFromString=false, canCreateUsingArrayDelegate=false, ca...#346#-691812784", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput212() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.std.StdValueInstantiator", "com.fasterxml.jackson.databind.deser.std.StdValueInstantiator", "configureFromIntCreator", new String[]{"com.fasterxml.jackson.databind.introspect.AnnotatedWithParams"}, new String[]{"<sample:0>"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.deser.std.StdValueInstantiator", "configureFromArraySettings", "com.fasterxml.jackson.databind.introspect.AnnotatedWithParams,com.fasterxml.jackson.databind.JavaType,com.fasterxml.jackson.databind.deser.SettableBeanProperty[]", "<sample:4>", "<sample:4>", "<sample:0>"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{canCreateFromBoolean=false, canCreateFromDouble=false, canCreateFromInt=true, canCreateFromLong=false, canCreateFromObjectWith=false, canCreateFromString=false, canCreateUsingArrayDelegate=true, canC...#296#1620683722", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput213() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.std.StdValueInstantiator", "com.fasterxml.jackson.databind.deser.std.StdValueInstantiator", "configureFromIntCreator", new String[]{"com.fasterxml.jackson.databind.introspect.AnnotatedWithParams"}, new String[]{"<sample:10>"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.deser.std.StdValueInstantiator", "configureFromArraySettings", "com.fasterxml.jackson.databind.introspect.AnnotatedWithParams,com.fasterxml.jackson.databind.JavaType,com.fasterxml.jackson.databind.deser.SettableBeanProperty[]", "<sample:4>", "<sample:4>", "<sample:0>"}, {"com.fasterxml.jackson.databind.deser.std.StdValueInstantiator", "configureIncompleteParameter", "com.fasterxml.jackson.databind.introspect.AnnotatedParameter", "<sample:5>"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{canCreateFromBoolean=false, canCreateFromDouble=false, canCreateFromInt=false, canCreateFromLong=false, canCreateFromObjectWith=false, canCreateFromString=false, canCreateUsingArrayDelegate=true, can...#297#417376873", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput214() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.std.StdValueInstantiator", "com.fasterxml.jackson.databind.deser.std.StdValueInstantiator", "getDefaultCreator", new String[]{}, new String[]{}, false, 2, new String[][]{{"com.fasterxml.jackson.databind.deser.std.StdValueInstantiator", "getArrayDelegateType", "com.fasterxml.jackson.databind.DeserializationConfig", "<sample:5>"}, {"com.fasterxml.jackson.databind.deser.std.StdValueInstantiator", "_createFromStringFallbacks", "com.fasterxml.jackson.databind.DeserializationContext,java.lang.String", "<sample:3>", "1.1234567890123456"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{canCreateFromBoolean=false, canCreateFromDouble=false, canCreateFromInt=false, canCreateFromLong=false, canCreateFromObjectWith=false, canCreateFromString=false, canCreateUsingArrayDelegate=false, ca...#314#1636553649", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput215() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.std.StdValueInstantiator", "com.fasterxml.jackson.databind.deser.std.StdValueInstantiator", "getDefaultCreator", new String[]{}, new String[]{}, false, 3, new String[][]{{"com.fasterxml.jackson.databind.deser.std.StdValueInstantiator", "configureIncompleteParameter", "com.fasterxml.jackson.databind.introspect.AnnotatedParameter", "<sample:0>"}, {"com.fasterxml.jackson.databind.deser.std.StdValueInstantiator", "getArrayDelegateType", "com.fasterxml.jackson.databind.DeserializationConfig", "<sample:9>"}, {"com.fasterxml.jackson.databind.deser.std.StdValueInstantiator", "_createFromStringFallbacks", "com.fasterxml.jackson.databind.DeserializationContext,java.lang.String", "<sample:3>", "1.0234567890123456"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{canCreateFromBoolean=false, canCreateFromDouble=false, canCreateFromInt=false, canCreateFromLong=false, canCreateFromObjectWith=false, canCreateFromString=false, canCreateUsingArrayDelegate=false, ca...#324#-2126697502", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput216() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.std.StdValueInstantiator", "com.fasterxml.jackson.databind.deser.std.StdValueInstantiator", "getDefaultCreator", new String[]{}, new String[]{}, false, 3, new String[][]{{"com.fasterxml.jackson.databind.deser.std.StdValueInstantiator", "configureIncompleteParameter", "com.fasterxml.jackson.databind.introspect.AnnotatedParameter", "<sample:0>"}, {"com.fasterxml.jackson.databind.deser.std.StdValueInstantiator", "getArrayDelegateType", "com.fasterxml.jackson.databind.DeserializationConfig", "<sample:9>"}, {"com.fasterxml.jackson.databind.deser.std.StdValueInstantiator", "_createFromStringFallbacks", "com.fasterxml.jackson.databind.DeserializationContext,java.lang.String", "<sample:3>", "1.0234567890123456"}}, 2);
  assertNull(actual);
  assertEquals("receiver state after the call", "{canCreateFromBoolean=false, canCreateFromDouble=false, canCreateFromInt=false, canCreateFromLong=false, canCreateFromObjectWith=false, canCreateFromString=false, canCreateUsingArrayDelegate=false, ca...#324#-2126697502", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput217() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.std.StdValueInstantiator", "com.fasterxml.jackson.databind.deser.std.StdValueInstantiator", "getDefaultCreator", new String[]{}, new String[]{}, false, 4, new String[][]{{"com.fasterxml.jackson.databind.deser.std.StdValueInstantiator", "configureIncompleteParameter", "com.fasterxml.jackson.databind.introspect.AnnotatedParameter", "<sample:0>"}, {"com.fasterxml.jackson.databind.deser.std.StdValueInstantiator", "getArrayDelegateType", "com.fasterxml.jackson.databind.DeserializationConfig", "<sample:9>"}, {"com.fasterxml.jackson.databind.deser.std.StdValueInstantiator", "_createFromStringFallbacks", "com.fasterxml.jackson.databind.DeserializationContext,java.lang.String", "<sample:3>", "1.0234567890123456"}}, 2);
  assertNull(actual);
  assertEquals("receiver state after the call", "{canCreateFromBoolean=false, canCreateFromDouble=false, canCreateFromInt=false, canCreateFromLong=false, canCreateFromObjectWith=false, canCreateFromString=false, canCreateUsingArrayDelegate=false, ca...#309#-1951095057", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput218() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.std.StdValueInstantiator", "com.fasterxml.jackson.databind.deser.std.StdValueInstantiator", "getDefaultCreator", new String[]{}, new String[]{}, false, 5, new String[][]{{"com.fasterxml.jackson.databind.deser.std.StdValueInstantiator", "configureIncompleteParameter", "com.fasterxml.jackson.databind.introspect.AnnotatedParameter", "<sample:0>"}, {"com.fasterxml.jackson.databind.deser.std.StdValueInstantiator", "getArrayDelegateType", "com.fasterxml.jackson.databind.DeserializationConfig", "<sample:9>"}, {"com.fasterxml.jackson.databind.deser.std.StdValueInstantiator", "_createFromStringFallbacks", "com.fasterxml.jackson.databind.DeserializationContext,java.lang.String", "<sample:3>", "1.0234567890123456"}}, 2);
  assertNull(actual);
  assertEquals("receiver state after the call", "{canCreateFromBoolean=false, canCreateFromDouble=false, canCreateFromInt=false, canCreateFromLong=false, canCreateFromObjectWith=false, canCreateFromString=false, canCreateUsingArrayDelegate=false, ca...#300#1048321612", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput219() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.std.StdValueInstantiator", "com.fasterxml.jackson.databind.deser.std.StdValueInstantiator", "getDefaultCreator", new String[]{}, new String[]{}, false, 7, new String[][]{{"com.fasterxml.jackson.databind.deser.std.StdValueInstantiator", "configureIncompleteParameter", "com.fasterxml.jackson.databind.introspect.AnnotatedParameter", "<sample:0>"}, {"com.fasterxml.jackson.databind.deser.std.StdValueInstantiator", "getArrayDelegateType", "com.fasterxml.jackson.databind.DeserializationConfig", "<sample:9>"}, {"com.fasterxml.jackson.databind.deser.std.StdValueInstantiator", "_createFromStringFallbacks", "com.fasterxml.jackson.databind.DeserializationContext,java.lang.String", "<sample:3>", "1.0234567890123456"}}, 2);
  assertNull(actual);
  assertEquals("receiver state after the call", "{canCreateFromBoolean=false, canCreateFromDouble=false, canCreateFromInt=false, canCreateFromLong=false, canCreateFromObjectWith=false, canCreateFromString=false, canCreateUsingArrayDelegate=false, ca...#329#-1747445055", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput220() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.std.StdValueInstantiator", "com.fasterxml.jackson.databind.deser.std.StdValueInstantiator", "getDefaultCreator", new String[]{}, new String[]{}, false, 9, new String[][]{{"com.fasterxml.jackson.databind.deser.std.StdValueInstantiator", "configureIncompleteParameter", "com.fasterxml.jackson.databind.introspect.AnnotatedParameter", "<sample:0>"}, {"com.fasterxml.jackson.databind.deser.std.StdValueInstantiator", "getArrayDelegateType", "com.fasterxml.jackson.databind.DeserializationConfig", "<sample:9>"}, {"com.fasterxml.jackson.databind.deser.std.StdValueInstantiator", "_createFromStringFallbacks", "com.fasterxml.jackson.databind.DeserializationContext,java.lang.String", "<sample:3>", "1.0234567890123456"}}, 2);
  assertNull(actual);
  assertEquals("receiver state after the call", "{canCreateFromBoolean=false, canCreateFromDouble=false, canCreateFromInt=false, canCreateFromLong=false, canCreateFromObjectWith=false, canCreateFromString=false, canCreateUsingArrayDelegate=false, ca...#299#-1213177358", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput221() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.std.StdValueInstantiator", "com.fasterxml.jackson.databind.deser.std.StdValueInstantiator", "getDefaultCreator", new String[]{}, new String[]{}, false, 10, new String[][]{{"com.fasterxml.jackson.databind.deser.std.StdValueInstantiator", "configureIncompleteParameter", "com.fasterxml.jackson.databind.introspect.AnnotatedParameter", "<sample:0>"}, {"com.fasterxml.jackson.databind.deser.std.StdValueInstantiator", "getArrayDelegateType", "com.fasterxml.jackson.databind.DeserializationConfig", "<sample:12>"}, {"com.fasterxml.jackson.databind.deser.std.StdValueInstantiator", "canCreateUsingDefault", ""}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{canCreateFromBoolean=false, canCreateFromDouble=false, canCreateFromInt=false, canCreateFromLong=false, canCreateFromObjectWith=false, canCreateFromString=false, canCreateUsingArrayDelegate=false, ca...#309#-1951095057", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput222() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.std.StdValueInstantiator", "com.fasterxml.jackson.databind.deser.std.StdValueInstantiator", "getDefaultCreator", new String[]{}, new String[]{}, false, 11, new String[][]{{"com.fasterxml.jackson.databind.deser.std.StdValueInstantiator", "configureIncompleteParameter", "com.fasterxml.jackson.databind.introspect.AnnotatedParameter", "<sample:0>"}, {"com.fasterxml.jackson.databind.deser.std.StdValueInstantiator", "getArrayDelegateType", "com.fasterxml.jackson.databind.DeserializationConfig", "<sample:12>"}, {"com.fasterxml.jackson.databind.deser.std.StdValueInstantiator", "canCreateUsingDefault", ""}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{canCreateFromBoolean=false, canCreateFromDouble=false, canCreateFromInt=false, canCreateFromLong=false, canCreateFromObjectWith=false, canCreateFromString=false, canCreateUsingArrayDelegate=false, ca...#359#-742779505", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput223() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.std.StdValueInstantiator", "com.fasterxml.jackson.databind.deser.std.StdValueInstantiator", "rewrapCtorProblem", new String[]{"com.fasterxml.jackson.databind.DeserializationContext", "java.lang.Throwable"}, new String[]{"<sample:5>", "<null>"}, false, 6, new String[][]{{"com.fasterxml.jackson.databind.deser.std.StdValueInstantiator", "getDefaultCreator", ""}, {"com.fasterxml.jackson.databind.deser.std.StdValueInstantiator", "getDelegateType", "com.fasterxml.jackson.databind.DeserializationConfig", "<sample:7>"}}, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput224() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.std.StdValueInstantiator", "com.fasterxml.jackson.databind.deser.std.StdValueInstantiator", "rewrapCtorProblem", new String[]{"com.fasterxml.jackson.databind.DeserializationContext", "java.lang.Throwable"}, new String[]{"<sample:5>", "<null>"}, false, 6, new String[][]{{"com.fasterxml.jackson.databind.deser.std.StdValueInstantiator", "getDefaultCreator", ""}, {"com.fasterxml.jackson.databind.deser.std.StdValueInstantiator", "getDelegateType", "com.fasterxml.jackson.databind.DeserializationConfig", "<sample:7>"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput225() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.std.StdValueInstantiator", "com.fasterxml.jackson.databind.deser.std.StdValueInstantiator", "rewrapCtorProblem", new String[]{"com.fasterxml.jackson.databind.DeserializationContext", "java.lang.Throwable"}, new String[]{"<sample:2>", "<sample:1>"}, false, 9, new String[][]{{"com.fasterxml.jackson.databind.deser.std.StdValueInstantiator", "getDefaultCreator", ""}, {"com.fasterxml.jackson.databind.deser.std.StdValueInstantiator", "getDelegateType", "com.fasterxml.jackson.databind.DeserializationConfig", "<sample:7>"}});
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.databind.JsonMappingException", actual.getClass().getName());
  assertEquals("com.fasterxml.jackson.databind.JsonMappingException: Can not construct instance of java.lang.Object, problem: 0 {getLocalizedMessage=Can not construct instance of java.lang.Object, problem: 0, getMess...#457#-1921071880", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{canCreateFromBoolean=false, canCreateFromDouble=false, canCreateFromInt=false, canCreateFromLong=false, canCreateFromObjectWith=false, canCreateFromString=false, canCreateUsingArrayDelegate=false, ca...#299#-1213177358", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput226() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.ValueInstantiator", "com.fasterxml.jackson.databind.deser.ValueInstantiator$Base", "getIncompleteParameter", new String[]{}, new String[]{}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.deser.ValueInstantiator", "canCreateFromInt", ""}}, 3);
  assertNull(actual);
  assertEquals("receiver state after the call", "{canCreateFromBoolean=false, canCreateFromDouble=false, canCreateFromInt=false, canCreateFromLong=false, canCreateFromObjectWith=false, canCreateFromString=false, canCreateUsingArrayDelegate=false, ca...#313#-516867540", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput227() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.ValueInstantiator", "com.fasterxml.jackson.databind.deser.ValueInstantiator$Base", "getIncompleteParameter", new String[]{}, new String[]{}, false, 1, new String[][]{{"com.fasterxml.jackson.databind.deser.ValueInstantiator", "canCreateFromInt", ""}}, 3);
  assertNull(actual);
  assertEquals("receiver state after the call", "{canCreateFromBoolean=false, canCreateFromDouble=false, canCreateFromInt=false, canCreateFromLong=false, canCreateFromObjectWith=false, canCreateFromString=false, canCreateUsingArrayDelegate=false, ca...#359#219967482", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput228() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.ValueInstantiator", "com.fasterxml.jackson.databind.deser.ValueInstantiator$Base", "getIncompleteParameter", new String[]{}, new String[]{}, false, 3, new String[][]{{"com.fasterxml.jackson.databind.deser.ValueInstantiator", "canCreateFromInt", ""}}, 3);
  assertNull(actual);
  assertEquals("receiver state after the call", "{canCreateFromBoolean=false, canCreateFromDouble=false, canCreateFromInt=false, canCreateFromLong=false, canCreateFromObjectWith=false, canCreateFromString=false, canCreateUsingArrayDelegate=false, ca...#314#1636553649", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput229() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.ValueInstantiator", "com.fasterxml.jackson.databind.deser.ValueInstantiator$Base", "getIncompleteParameter", new String[]{}, new String[]{}, false, 4, new String[][]{{"com.fasterxml.jackson.databind.deser.ValueInstantiator", "canCreateFromInt", ""}}, 3);
  assertNull(actual);
  assertEquals("receiver state after the call", "{canCreateFromBoolean=false, canCreateFromDouble=false, canCreateFromInt=false, canCreateFromLong=false, canCreateFromObjectWith=false, canCreateFromString=false, canCreateUsingArrayDelegate=false, ca...#318#1611653153", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput230() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.ValueInstantiator", "com.fasterxml.jackson.databind.deser.ValueInstantiator$Base", "getIncompleteParameter", new String[]{}, new String[]{}, false, 5, new String[][]{{"com.fasterxml.jackson.databind.deser.ValueInstantiator", "canCreateFromInt", ""}}, 3);
  assertNull(actual);
  assertEquals("receiver state after the call", "{canCreateFromBoolean=false, canCreateFromDouble=false, canCreateFromInt=false, canCreateFromLong=false, canCreateFromObjectWith=false, canCreateFromString=false, canCreateUsingArrayDelegate=false, ca...#311#-229031103", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput231() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.std.StdValueInstantiator", "com.fasterxml.jackson.databind.deser.std.StdValueInstantiator", "createFromObjectWith", new String[]{"com.fasterxml.jackson.databind.DeserializationContext", "java.lang.Object[]"}, new String[]{"<null>", "<empty>"}, false); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput232() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.std.StdValueInstantiator", "com.fasterxml.jackson.databind.deser.std.StdValueInstantiator", "configureFromDoubleCreator", new String[]{"com.fasterxml.jackson.databind.introspect.AnnotatedWithParams"}, new String[]{"<sample:1>"}, false, 6, new String[][]{{"com.fasterxml.jackson.databind.deser.std.StdValueInstantiator", "canCreateUsingDefault", ""}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{canCreateFromBoolean=false, canCreateFromDouble=true, canCreateFromInt=false, canCreateFromLong=false, canCreateFromObjectWith=false, canCreateFromString=false, canCreateUsingArrayDelegate=false, can...#307#-746968613", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput233() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.ValueInstantiator", "com.fasterxml.jackson.databind.deser.ValueInstantiator$Base", "getIncompleteParameter", new String[]{}, new String[]{}, false, 10, new String[][]{{"com.fasterxml.jackson.databind.deser.ValueInstantiator", "canCreateFromInt", ""}, {"com.fasterxml.jackson.databind.deser.ValueInstantiator", "getValueTypeDesc", ""}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{canCreateFromBoolean=false, canCreateFromDouble=false, canCreateFromInt=false, canCreateFromLong=false, canCreateFromObjectWith=false, canCreateFromString=false, canCreateUsingArrayDelegate=false, ca...#318#1611653153", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput234() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.ValueInstantiator", "com.fasterxml.jackson.databind.deser.ValueInstantiator$Base", "getIncompleteParameter", new String[]{}, new String[]{}, false, 11, new String[][]{{"com.fasterxml.jackson.databind.deser.ValueInstantiator", "canCreateFromInt", ""}, {"com.fasterxml.jackson.databind.deser.ValueInstantiator", "getValueTypeDesc", ""}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{canCreateFromBoolean=false, canCreateFromDouble=false, canCreateFromInt=false, canCreateFromLong=false, canCreateFromObjectWith=false, canCreateFromString=false, canCreateUsingArrayDelegate=false, ca...#317#-1505475647", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput235() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.ValueInstantiator", "com.fasterxml.jackson.databind.deser.ValueInstantiator$Base", "getIncompleteParameter", new String[]{}, new String[]{}, false, 7, new String[][]{{"com.fasterxml.jackson.databind.deser.ValueInstantiator", "canCreateFromInt", ""}, {"com.fasterxml.jackson.databind.deser.ValueInstantiator", "getValueTypeDesc", ""}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{canCreateFromBoolean=false, canCreateFromDouble=false, canCreateFromInt=false, canCreateFromLong=false, canCreateFromObjectWith=false, canCreateFromString=false, canCreateUsingArrayDelegate=false, ca...#316#-1594774090", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput236() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.ValueInstantiator", "com.fasterxml.jackson.databind.deser.ValueInstantiator$Base", "getIncompleteParameter", new String[]{}, new String[]{}, false, 9, new String[][]{{"com.fasterxml.jackson.databind.deser.ValueInstantiator", "canCreateFromInt", ""}, {"com.fasterxml.jackson.databind.deser.ValueInstantiator", "getValueTypeDesc", ""}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{canCreateFromBoolean=false, canCreateFromDouble=false, canCreateFromInt=false, canCreateFromLong=false, canCreateFromObjectWith=false, canCreateFromString=false, canCreateUsingArrayDelegate=false, ca...#317#1180324081", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput237() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.std.StdValueInstantiator", "com.fasterxml.jackson.databind.deser.std.StdValueInstantiator", "createFromDouble", new String[]{"com.fasterxml.jackson.databind.DeserializationContext", "double"}, new String[]{"<sample:4>", "NaN"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.deser.std.StdValueInstantiator", "createUsingArrayDelegate", "com.fasterxml.jackson.databind.DeserializationContext,java.lang.Object", "<sample:7>", "<s:key>"}}, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput238() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.ValueInstantiator", "com.fasterxml.jackson.databind.deser.ValueInstantiator$Base", "createUsingArrayDelegate", new String[]{"com.fasterxml.jackson.databind.DeserializationContext", "java.lang.Object"}, new String[]{"<sample:6>", "<i:-1>"}, false); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput239() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.std.StdValueInstantiator", "com.fasterxml.jackson.databind.deser.std.StdValueInstantiator", "createFromDouble", new String[]{"com.fasterxml.jackson.databind.DeserializationContext", "double"}, new String[]{"<sample:9>", "NaN"}, false); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput240() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.ValueInstantiator", "com.fasterxml.jackson.databind.deser.ValueInstantiator$Base", "getIncompleteParameter", new String[]{}, new String[]{}, false, 69, new String[][]{{"com.fasterxml.jackson.databind.deser.ValueInstantiator", "createFromLong", "com.fasterxml.jackson.databind.DeserializationContext,long", "<sample:9>", "-4611686018427387904"}}, 1);
  assertNull(actual);
  assertEquals("receiver state after the call", "{canCreateFromBoolean=false, canCreateFromDouble=false, canCreateFromInt=false, canCreateFromLong=false, canCreateFromObjectWith=false, canCreateFromString=false, canCreateUsingArrayDelegate=false, ca...#317#1180324081", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput241() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.ValueInstantiator", "com.fasterxml.jackson.databind.deser.ValueInstantiator$Base", "getIncompleteParameter", new String[]{}, new String[]{}, false, 70, new String[][]{{"com.fasterxml.jackson.databind.deser.ValueInstantiator", "createFromLong", "com.fasterxml.jackson.databind.DeserializationContext,long", "<sample:9>", "-4612811918334230528"}}, 1);
  assertNull(actual);
  assertEquals("receiver state after the call", "{canCreateFromBoolean=false, canCreateFromDouble=false, canCreateFromInt=false, canCreateFromLong=false, canCreateFromObjectWith=false, canCreateFromString=false, canCreateUsingArrayDelegate=false, ca...#318#1611653153", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput242() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.ValueInstantiator", "com.fasterxml.jackson.databind.deser.ValueInstantiator$Base", "getIncompleteParameter", new String[]{}, new String[]{}, false, 71, new String[][]{{"com.fasterxml.jackson.databind.deser.ValueInstantiator", "createFromLong", "com.fasterxml.jackson.databind.DeserializationContext,long", "<sample:9>", "-4612811918334230528"}, {"com.fasterxml.jackson.databind.deser.ValueInstantiator", "canCreateFromBoolean", ""}}, 1);
  assertNull(actual);
  assertEquals("receiver state after the call", "{canCreateFromBoolean=false, canCreateFromDouble=false, canCreateFromInt=false, canCreateFromLong=false, canCreateFromObjectWith=false, canCreateFromString=false, canCreateUsingArrayDelegate=false, ca...#317#-1505475647", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput243() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.ValueInstantiator", "com.fasterxml.jackson.databind.deser.ValueInstantiator$Base", "getIncompleteParameter", new String[]{}, new String[]{}, false, 73, new String[][]{{"com.fasterxml.jackson.databind.deser.ValueInstantiator", "createFromInt", "com.fasterxml.jackson.databind.DeserializationContext,int", "<sample:2>", "0"}, {"com.fasterxml.jackson.databind.deser.ValueInstantiator", "createFromLong", "com.fasterxml.jackson.databind.DeserializationContext,long", "<sample:1>", "-4612811918317453312"}}, 1);
  assertNull(actual);
  assertEquals("receiver state after the call", "{canCreateFromBoolean=false, canCreateFromDouble=false, canCreateFromInt=false, canCreateFromLong=false, canCreateFromObjectWith=false, canCreateFromString=false, canCreateUsingArrayDelegate=false, ca...#316#-1061607836", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput244() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.ValueInstantiator", "com.fasterxml.jackson.databind.deser.ValueInstantiator$Base", "getIncompleteParameter", new String[]{}, new String[]{}, false, 75, new String[][]{{"com.fasterxml.jackson.databind.deser.ValueInstantiator", "createFromInt", "com.fasterxml.jackson.databind.DeserializationContext,int", "<sample:2>", "0"}, {"com.fasterxml.jackson.databind.deser.ValueInstantiator", "createFromLong", "com.fasterxml.jackson.databind.DeserializationContext,long", "<sample:1>", "-4612811918317453312"}}, 1);
  assertNull(actual);
  assertEquals("receiver state after the call", "{canCreateFromBoolean=false, canCreateFromDouble=false, canCreateFromInt=false, canCreateFromLong=false, canCreateFromObjectWith=false, canCreateFromString=false, canCreateUsingArrayDelegate=false, ca...#359#236263159", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput245() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.ValueInstantiator", "com.fasterxml.jackson.databind.deser.ValueInstantiator$Base", "getIncompleteParameter", new String[]{}, new String[]{}, false, 2, new String[][]{{"com.fasterxml.jackson.databind.deser.ValueInstantiator", "createFromString", "com.fasterxml.jackson.databind.DeserializationContext,java.lang.String", "<sample:7>", "-a"}}, 2);
  assertNull(actual);
  assertEquals("receiver state after the call", "{canCreateFromBoolean=false, canCreateFromDouble=false, canCreateFromInt=false, canCreateFromLong=false, canCreateFromObjectWith=false, canCreateFromString=false, canCreateUsingArrayDelegate=false, ca...#313#-516867540", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput246() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.ValueInstantiator", "com.fasterxml.jackson.databind.deser.ValueInstantiator$Base", "getIncompleteParameter", new String[]{}, new String[]{}, false, 3, new String[][]{{"com.fasterxml.jackson.databind.deser.ValueInstantiator", "createFromString", "com.fasterxml.jackson.databind.DeserializationContext,java.lang.String", "<sample:7>", "-a"}}, 2);
  assertNull(actual);
  assertEquals("receiver state after the call", "{canCreateFromBoolean=false, canCreateFromDouble=false, canCreateFromInt=false, canCreateFromLong=false, canCreateFromObjectWith=false, canCreateFromString=false, canCreateUsingArrayDelegate=false, ca...#314#1636553649", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput247() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.ValueInstantiator", "com.fasterxml.jackson.databind.deser.ValueInstantiator$Base", "getIncompleteParameter", new String[]{}, new String[]{}, false, 4, new String[][]{{"com.fasterxml.jackson.databind.deser.ValueInstantiator", "createFromString", "com.fasterxml.jackson.databind.DeserializationContext,java.lang.String", "<sample:7>", "-a"}}, 2);
  assertNull(actual);
  assertEquals("receiver state after the call", "{canCreateFromBoolean=false, canCreateFromDouble=false, canCreateFromInt=false, canCreateFromLong=false, canCreateFromObjectWith=false, canCreateFromString=false, canCreateUsingArrayDelegate=false, ca...#318#1611653153", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput248() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.ValueInstantiator", "com.fasterxml.jackson.databind.deser.ValueInstantiator$Base", "getIncompleteParameter", new String[]{}, new String[]{}, false, 5, new String[][]{{"com.fasterxml.jackson.databind.deser.ValueInstantiator", "createFromString", "com.fasterxml.jackson.databind.DeserializationContext,java.lang.String", "<sample:7>", "-a"}}, 2);
  assertNull(actual);
  assertEquals("receiver state after the call", "{canCreateFromBoolean=false, canCreateFromDouble=false, canCreateFromInt=false, canCreateFromLong=false, canCreateFromObjectWith=false, canCreateFromString=false, canCreateUsingArrayDelegate=false, ca...#311#-229031103", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput249() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.std.StdValueInstantiator", "com.fasterxml.jackson.databind.deser.std.StdValueInstantiator", "wrapException", new String[]{"java.lang.Throwable"}, new String[]{"<sample:0>"}, false);
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.databind.JsonMappingException", actual.getClass().getName());
  assertEquals("com.fasterxml.jackson.databind.JsonMappingException: Instantiation of $0 value failed: null {getLocalizedMessage=Instantiation of $0 value failed: null, getMessage=Instantiation of $0 value failed: nu...#377#260452057", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{canCreateFromBoolean=false, canCreateFromDouble=false, canCreateFromInt=false, canCreateFromLong=false, canCreateFromObjectWith=false, canCreateFromString=false, canCreateUsingArrayDelegate=false, ca...#299#-1213177389", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput250() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.ValueInstantiator", "com.fasterxml.jackson.databind.deser.ValueInstantiator$Base", "getIncompleteParameter", new String[]{}, new String[]{}, false, 7, new String[][]{{"com.fasterxml.jackson.databind.deser.ValueInstantiator", "createFromString", "com.fasterxml.jackson.databind.DeserializationContext,java.lang.String", "<sample:8>", "-a"}}, 2);
  assertNull(actual);
  assertEquals("receiver state after the call", "{canCreateFromBoolean=false, canCreateFromDouble=false, canCreateFromInt=false, canCreateFromLong=false, canCreateFromObjectWith=false, canCreateFromString=false, canCreateUsingArrayDelegate=false, ca...#316#-1594774090", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput251() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.ValueInstantiator", "com.fasterxml.jackson.databind.deser.ValueInstantiator$Base", "getDelegateType", new String[]{"com.fasterxml.jackson.databind.DeserializationConfig"}, new String[]{"<sample:7>"}, false, 13, new String[][]{});
  assertNull(actual);
  assertEquals("receiver state after the call", "{canCreateFromBoolean=false, canCreateFromDouble=false, canCreateFromInt=false, canCreateFromLong=false, canCreateFromObjectWith=false, canCreateFromString=false, canCreateUsingArrayDelegate=false, ca...#316#-1061607836", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput252() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.ValueInstantiator", "com.fasterxml.jackson.databind.deser.ValueInstantiator$Base", "getDelegateType", new String[]{"com.fasterxml.jackson.databind.DeserializationConfig"}, new String[]{"<sample:5>"}, false, 8, new String[][]{});
  assertNull(actual);
  assertEquals("receiver state after the call", "{canCreateFromBoolean=false, canCreateFromDouble=false, canCreateFromInt=false, canCreateFromLong=false, canCreateFromObjectWith=false, canCreateFromString=false, canCreateUsingArrayDelegate=false, ca...#318#1611653153", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput253() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.std.StdValueInstantiator", "com.fasterxml.jackson.databind.deser.std.StdValueInstantiator", "canCreateFromBoolean", new String[]{}, new String[]{}, false);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{canCreateFromBoolean=false, canCreateFromDouble=false, canCreateFromInt=false, canCreateFromLong=false, canCreateFromObjectWith=false, canCreateFromString=false, canCreateUsingArrayDelegate=false, ca...#299#-1213177389", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput254() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.ValueInstantiator", "com.fasterxml.jackson.databind.deser.ValueInstantiator$Base", "getDelegateType", new String[]{"com.fasterxml.jackson.databind.DeserializationConfig"}, new String[]{"<sample:5>"}, false, 11, new String[][]{});
  assertNull(actual);
  assertEquals("receiver state after the call", "{canCreateFromBoolean=false, canCreateFromDouble=false, canCreateFromInt=false, canCreateFromLong=false, canCreateFromObjectWith=false, canCreateFromString=false, canCreateUsingArrayDelegate=false, ca...#317#-1505475647", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput255() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.std.StdValueInstantiator", "com.fasterxml.jackson.databind.deser.std.StdValueInstantiator", "getDelegateCreator", new String[]{}, new String[]{}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.deser.std.StdValueInstantiator", "unwrapAndWrapException", "com.fasterxml.jackson.databind.DeserializationContext,java.lang.Throwable", "<sample:7>", "<empty>"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{canCreateFromBoolean=false, canCreateFromDouble=false, canCreateFromInt=false, canCreateFromLong=false, canCreateFromObjectWith=false, canCreateFromString=false, canCreateUsingArrayDelegate=false, ca...#299#-1213177389", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput256() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.ValueInstantiator", "com.fasterxml.jackson.databind.deser.ValueInstantiator$Base", "getDelegateType", new String[]{"com.fasterxml.jackson.databind.DeserializationConfig"}, new String[]{"<sample:0>"}, false, 11, new String[][]{{"com.fasterxml.jackson.databind.deser.ValueInstantiator", "createFromBoolean", "com.fasterxml.jackson.databind.DeserializationContext,boolean", "<sample:1>", "false"}, {"com.fasterxml.jackson.databind.deser.ValueInstantiator", "getArrayDelegateCreator", ""}, {"com.fasterxml.jackson.databind.deser.ValueInstantiator", "createUsingArrayDelegate", "com.fasterxml.jackson.databind.DeserializationContext,java.lang.Object", "<null>", "<i:0>"}}, 3);
  assertNull(actual);
  assertEquals("receiver state after the call", "{canCreateFromBoolean=false, canCreateFromDouble=false, canCreateFromInt=false, canCreateFromLong=false, canCreateFromObjectWith=false, canCreateFromString=false, canCreateUsingArrayDelegate=false, ca...#317#-1505475647", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput257() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.ValueInstantiator", "com.fasterxml.jackson.databind.deser.ValueInstantiator$Base", "getDelegateType", new String[]{"com.fasterxml.jackson.databind.DeserializationConfig"}, new String[]{"<sample:0>"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.deser.ValueInstantiator", "getIncompleteParameter", ""}, {"com.fasterxml.jackson.databind.deser.ValueInstantiator", "createFromBoolean", "com.fasterxml.jackson.databind.DeserializationContext,boolean", "<sample:1>", "false"}}, 3);
  assertNull(actual);
  assertEquals("receiver state after the call", "{canCreateFromBoolean=false, canCreateFromDouble=false, canCreateFromInt=false, canCreateFromLong=false, canCreateFromObjectWith=false, canCreateFromString=false, canCreateUsingArrayDelegate=false, ca...#313#-516867540", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput258() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.std.StdValueInstantiator", "com.fasterxml.jackson.databind.deser.std.StdValueInstantiator", "canCreateFromString", new String[]{}, new String[]{}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.deser.std.StdValueInstantiator", "canCreateUsingDelegate", ""}, {"com.fasterxml.jackson.databind.deser.std.StdValueInstantiator", "createUsingArrayDelegate", "com.fasterxml.jackson.databind.DeserializationContext,java.lang.Object", "<sample:3>", "<s:key>"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{canCreateFromBoolean=false, canCreateFromDouble=false, canCreateFromInt=false, canCreateFromLong=false, canCreateFromObjectWith=false, canCreateFromString=false, canCreateUsingArrayDelegate=false, ca...#299#-1213177389", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput259() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.ValueInstantiator", "com.fasterxml.jackson.databind.deser.ValueInstantiator$Base", "createFromLong", new String[]{"com.fasterxml.jackson.databind.DeserializationContext", "long"}, new String[]{"<sample:3>", "-1"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.deser.ValueInstantiator", "getArrayDelegateCreator", ""}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput260() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.std.StdValueInstantiator", "com.fasterxml.jackson.databind.deser.std.StdValueInstantiator", "getValueTypeDesc", new String[]{}, new String[]{}, false);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("$0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{canCreateFromBoolean=false, canCreateFromDouble=false, canCreateFromInt=false, canCreateFromLong=false, canCreateFromObjectWith=false, canCreateFromString=false, canCreateUsingArrayDelegate=false, ca...#299#-1213177389", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput261() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.ValueInstantiator", "com.fasterxml.jackson.databind.deser.ValueInstantiator$Base", "createFromObjectWith", new String[]{"com.fasterxml.jackson.databind.DeserializationContext", "com.fasterxml.jackson.databind.deser.SettableBeanProperty[]", "com.fasterxml.jackson.databind.deser.impl.PropertyValueBuffer"}, new String[]{"<sample:3>", "<empty>", "<sample:2>"}, false); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.ArrayIndexOutOfBoundsException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput262() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.ValueInstantiator", "com.fasterxml.jackson.databind.deser.ValueInstantiator$Base", "getDelegateType", new String[]{"com.fasterxml.jackson.databind.DeserializationConfig"}, new String[]{"<sample:2>"}, false, 14, new String[][]{{"com.fasterxml.jackson.databind.deser.ValueInstantiator", "getArrayDelegateType", "com.fasterxml.jackson.databind.DeserializationConfig", "<sample:0>"}}, 3);
  assertNull(actual);
  assertEquals("receiver state after the call", "{canCreateFromBoolean=false, canCreateFromDouble=false, canCreateFromInt=false, canCreateFromLong=false, canCreateFromObjectWith=false, canCreateFromString=false, canCreateUsingArrayDelegate=false, ca...#318#1611653153", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput263() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.ValueInstantiator", "com.fasterxml.jackson.databind.deser.ValueInstantiator$Base", "getDelegateType", new String[]{"com.fasterxml.jackson.databind.DeserializationConfig"}, new String[]{"<sample:0>"}, false, 5, new String[][]{{"com.fasterxml.jackson.databind.deser.ValueInstantiator", "createFromDouble", "com.fasterxml.jackson.databind.DeserializationContext,double", "<sample:3>", "-1.7976931348623157E308"}, {"com.fasterxml.jackson.databind.deser.ValueInstantiator", "getArrayDelegateType", "com.fasterxml.jackson.databind.DeserializationConfig", "<sample:4>"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{canCreateFromBoolean=false, canCreateFromDouble=false, canCreateFromInt=false, canCreateFromLong=false, canCreateFromObjectWith=false, canCreateFromString=false, canCreateUsingArrayDelegate=false, ca...#311#-229031103", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput264() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.ValueInstantiator", "com.fasterxml.jackson.databind.deser.ValueInstantiator$Base", "canCreateFromInt", new String[]{}, new String[]{}, false, 7, new String[][]{{"com.fasterxml.jackson.databind.deser.ValueInstantiator", "createUsingArrayDelegate", "com.fasterxml.jackson.databind.DeserializationContext,java.lang.Object", "<sample:1>", "<s:b>"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{canCreateFromBoolean=false, canCreateFromDouble=false, canCreateFromInt=false, canCreateFromLong=false, canCreateFromObjectWith=false, canCreateFromString=false, canCreateUsingArrayDelegate=false, ca...#316#-1594774090", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput265() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.std.StdValueInstantiator", "com.fasterxml.jackson.databind.deser.std.StdValueInstantiator", "configureFromArraySettings", new String[]{"com.fasterxml.jackson.databind.introspect.AnnotatedWithParams", "com.fasterxml.jackson.databind.JavaType", "com.fasterxml.jackson.databind.deser.SettableBeanProperty[]"}, new String[]{"<null>", "<sample:1>", "<sample:2>"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.deser.std.StdValueInstantiator", "_createFromStringFallbacks", "com.fasterxml.jackson.databind.DeserializationContext,java.lang.String", "<sample:4>", "UNKNOWN TYPE"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{canCreateFromBoolean=false, canCreateFromDouble=false, canCreateFromInt=false, canCreateFromLong=false, canCreateFromObjectWith=false, canCreateFromString=false, canCreateUsingArrayDelegate=true, can...#297#417376873", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput266() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.ValueInstantiator", "com.fasterxml.jackson.databind.deser.ValueInstantiator$Base", "canCreateFromLong", new String[]{}, new String[]{}, false);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{canCreateFromBoolean=false, canCreateFromDouble=false, canCreateFromInt=false, canCreateFromLong=false, canCreateFromObjectWith=false, canCreateFromString=false, canCreateUsingArrayDelegate=false, ca...#313#-516867540", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput267() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.ValueInstantiator", "com.fasterxml.jackson.databind.deser.ValueInstantiator$Base", "canCreateFromLong", new String[]{}, new String[]{}, false, 1, new String[][]{{"com.fasterxml.jackson.databind.deser.ValueInstantiator", "getWithArgsCreator", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{canCreateFromBoolean=false, canCreateFromDouble=false, canCreateFromInt=false, canCreateFromLong=false, canCreateFromObjectWith=false, canCreateFromString=false, canCreateUsingArrayDelegate=false, ca...#359#219967482", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput268() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.ValueInstantiator", "com.fasterxml.jackson.databind.deser.ValueInstantiator$Base", "canCreateFromLong", new String[]{}, new String[]{}, false, 3, new String[][]{{"com.fasterxml.jackson.databind.deser.ValueInstantiator", "canCreateUsingDelegate", ""}, {"com.fasterxml.jackson.databind.deser.ValueInstantiator", "getWithArgsCreator", ""}, {"com.fasterxml.jackson.databind.deser.ValueInstantiator", "canCreateFromLong", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{canCreateFromBoolean=false, canCreateFromDouble=false, canCreateFromInt=false, canCreateFromLong=false, canCreateFromObjectWith=false, canCreateFromString=false, canCreateUsingArrayDelegate=false, ca...#314#1636553649", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput269() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.ValueInstantiator", "com.fasterxml.jackson.databind.deser.ValueInstantiator$Base", "canCreateFromLong", new String[]{}, new String[]{}, false, 4, new String[][]{{"com.fasterxml.jackson.databind.deser.ValueInstantiator", "getWithArgsCreator", ""}, {"com.fasterxml.jackson.databind.deser.ValueInstantiator", "canCreateFromLong", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{canCreateFromBoolean=false, canCreateFromDouble=false, canCreateFromInt=false, canCreateFromLong=false, canCreateFromObjectWith=false, canCreateFromString=false, canCreateUsingArrayDelegate=false, ca...#318#1611653153", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput270() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.ValueInstantiator", "com.fasterxml.jackson.databind.deser.ValueInstantiator$Base", "canCreateFromLong", new String[]{}, new String[]{}, false, 5, new String[][]{{"com.fasterxml.jackson.databind.deser.ValueInstantiator", "getWithArgsCreator", ""}, {"com.fasterxml.jackson.databind.deser.ValueInstantiator", "canCreateFromLong", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{canCreateFromBoolean=false, canCreateFromDouble=false, canCreateFromInt=false, canCreateFromLong=false, canCreateFromObjectWith=false, canCreateFromString=false, canCreateUsingArrayDelegate=false, ca...#311#-229031103", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput271() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.ValueInstantiator", "com.fasterxml.jackson.databind.deser.ValueInstantiator$Base", "createUsingArrayDelegate", new String[]{"com.fasterxml.jackson.databind.DeserializationContext", "java.lang.Object"}, new String[]{"<sample:5>", "<b:true>"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.deser.ValueInstantiator", "getFromObjectArguments", "com.fasterxml.jackson.databind.DeserializationConfig", "<sample:3>"}, {"com.fasterxml.jackson.databind.deser.ValueInstantiator", "canInstantiate", ""}}, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput272() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.std.StdValueInstantiator", "com.fasterxml.jackson.databind.deser.std.StdValueInstantiator", "getFromObjectArguments", new String[]{"com.fasterxml.jackson.databind.DeserializationConfig"}, new String[]{"<sample:7>"}, false, 0, null, 1);
  assertNull(actual);
  assertEquals("receiver state after the call", "{canCreateFromBoolean=false, canCreateFromDouble=false, canCreateFromInt=false, canCreateFromLong=false, canCreateFromObjectWith=false, canCreateFromString=false, canCreateUsingArrayDelegate=false, ca...#299#-1213177389", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput273() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.ValueInstantiator", "com.fasterxml.jackson.databind.deser.ValueInstantiator$Base", "getWithArgsCreator", new String[]{}, new String[]{}, false);
  assertNull(actual);
  assertEquals("receiver state after the call", "{canCreateFromBoolean=false, canCreateFromDouble=false, canCreateFromInt=false, canCreateFromLong=false, canCreateFromObjectWith=false, canCreateFromString=false, canCreateUsingArrayDelegate=false, ca...#313#-516867540", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput274() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.ValueInstantiator", "com.fasterxml.jackson.databind.deser.ValueInstantiator$Base", "getWithArgsCreator", new String[]{}, new String[]{}, false, 1, new String[][]{});
  assertNull(actual);
  assertEquals("receiver state after the call", "{canCreateFromBoolean=false, canCreateFromDouble=false, canCreateFromInt=false, canCreateFromLong=false, canCreateFromObjectWith=false, canCreateFromString=false, canCreateUsingArrayDelegate=false, ca...#359#219967482", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput275() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.ValueInstantiator", "com.fasterxml.jackson.databind.deser.ValueInstantiator$Base", "getWithArgsCreator", new String[]{}, new String[]{}, false, 3, new String[][]{});
  assertNull(actual);
  assertEquals("receiver state after the call", "{canCreateFromBoolean=false, canCreateFromDouble=false, canCreateFromInt=false, canCreateFromLong=false, canCreateFromObjectWith=false, canCreateFromString=false, canCreateUsingArrayDelegate=false, ca...#314#1636553649", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput276() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.ValueInstantiator", "com.fasterxml.jackson.databind.deser.ValueInstantiator$Base", "getWithArgsCreator", new String[]{}, new String[]{}, false, 4, new String[][]{});
  assertNull(actual);
  assertEquals("receiver state after the call", "{canCreateFromBoolean=false, canCreateFromDouble=false, canCreateFromInt=false, canCreateFromLong=false, canCreateFromObjectWith=false, canCreateFromString=false, canCreateUsingArrayDelegate=false, ca...#318#1611653153", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput277() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.ValueInstantiator", "com.fasterxml.jackson.databind.deser.ValueInstantiator$Base", "getWithArgsCreator", new String[]{}, new String[]{}, false, 5, new String[][]{});
  assertNull(actual);
  assertEquals("receiver state after the call", "{canCreateFromBoolean=false, canCreateFromDouble=false, canCreateFromInt=false, canCreateFromLong=false, canCreateFromObjectWith=false, canCreateFromString=false, canCreateUsingArrayDelegate=false, ca...#311#-229031103", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput278() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.std.StdValueInstantiator", "com.fasterxml.jackson.databind.deser.std.StdValueInstantiator", "rewrapCtorProblem", new String[]{"com.fasterxml.jackson.databind.DeserializationContext", "java.lang.Throwable"}, new String[]{"<sample:1>", "<sample:3>"}, false), new String[][]{{"printStackTrace", "", "2"}, {"getLocalizedMessage", "", "1"}, {"getPathReference", "java.lang.StringBuilder", "4"}});
  assertNotNull(actual);
  assertEquals("java.lang.StringBuilder", actual.getClass().getName());
  assertEquals("", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{canCreateFromBoolean=false, canCreateFromDouble=false, canCreateFromInt=false, canCreateFromLong=false, canCreateFromObjectWith=false, canCreateFromString=false, canCreateUsingArrayDelegate=false, ca...#299#-1213177389", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput279() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.ValueInstantiator", "com.fasterxml.jackson.databind.deser.ValueInstantiator$Base", "canInstantiate", new String[]{}, new String[]{}, false, 1, new String[][]{});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{canCreateFromBoolean=false, canCreateFromDouble=false, canCreateFromInt=false, canCreateFromLong=false, canCreateFromObjectWith=false, canCreateFromString=false, canCreateUsingArrayDelegate=false, ca...#359#219967482", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput280() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.ValueInstantiator", "com.fasterxml.jackson.databind.deser.ValueInstantiator$Base", "canInstantiate", new String[]{}, new String[]{}, false, 3, new String[][]{});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{canCreateFromBoolean=false, canCreateFromDouble=false, canCreateFromInt=false, canCreateFromLong=false, canCreateFromObjectWith=false, canCreateFromString=false, canCreateUsingArrayDelegate=false, ca...#314#1636553649", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput281() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.ValueInstantiator", "com.fasterxml.jackson.databind.deser.ValueInstantiator$Base", "canInstantiate", new String[]{}, new String[]{}, false, 4, new String[][]{});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{canCreateFromBoolean=false, canCreateFromDouble=false, canCreateFromInt=false, canCreateFromLong=false, canCreateFromObjectWith=false, canCreateFromString=false, canCreateUsingArrayDelegate=false, ca...#318#1611653153", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput282() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.ValueInstantiator", "com.fasterxml.jackson.databind.deser.ValueInstantiator$Base", "canInstantiate", new String[]{}, new String[]{}, false, 5, new String[][]{});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{canCreateFromBoolean=false, canCreateFromDouble=false, canCreateFromInt=false, canCreateFromLong=false, canCreateFromObjectWith=false, canCreateFromString=false, canCreateUsingArrayDelegate=false, ca...#311#-229031103", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput283() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.ValueInstantiator", "com.fasterxml.jackson.databind.deser.ValueInstantiator$Base", "canInstantiate", new String[]{}, new String[]{}, false, 10, new String[][]{}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{canCreateFromBoolean=false, canCreateFromDouble=false, canCreateFromInt=false, canCreateFromLong=false, canCreateFromObjectWith=false, canCreateFromString=false, canCreateUsingArrayDelegate=false, ca...#318#1611653153", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput284() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.ValueInstantiator", "com.fasterxml.jackson.databind.deser.ValueInstantiator$Base", "canInstantiate", new String[]{}, new String[]{}, false, 11, new String[][]{}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{canCreateFromBoolean=false, canCreateFromDouble=false, canCreateFromInt=false, canCreateFromLong=false, canCreateFromObjectWith=false, canCreateFromString=false, canCreateUsingArrayDelegate=false, ca...#317#-1505475647", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput285() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.ValueInstantiator", "com.fasterxml.jackson.databind.deser.ValueInstantiator$Base", "canInstantiate", new String[]{}, new String[]{}, false, 13, new String[][]{}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{canCreateFromBoolean=false, canCreateFromDouble=false, canCreateFromInt=false, canCreateFromLong=false, canCreateFromObjectWith=false, canCreateFromString=false, canCreateUsingArrayDelegate=false, ca...#316#-1061607836", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput286() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.ValueInstantiator", "com.fasterxml.jackson.databind.deser.ValueInstantiator$Base", "canInstantiate", new String[]{}, new String[]{}, false, 15, new String[][]{}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{canCreateFromBoolean=false, canCreateFromDouble=false, canCreateFromInt=false, canCreateFromLong=false, canCreateFromObjectWith=false, canCreateFromString=false, canCreateUsingArrayDelegate=false, ca...#359#236263159", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput287() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.ValueInstantiator", "com.fasterxml.jackson.databind.deser.ValueInstantiator$Base", "canInstantiate", new String[]{}, new String[]{}, false, 17, new String[][]{}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{canCreateFromBoolean=false, canCreateFromDouble=false, canCreateFromInt=false, canCreateFromLong=false, canCreateFromObjectWith=false, canCreateFromString=false, canCreateUsingArrayDelegate=false, ca...#359#229321856", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput288() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.ValueInstantiator", "com.fasterxml.jackson.databind.deser.ValueInstantiator$Base", "canInstantiate", new String[]{}, new String[]{}, false, 16, new String[][]{{"com.fasterxml.jackson.databind.deser.ValueInstantiator", "createFromBoolean", "com.fasterxml.jackson.databind.DeserializationContext,boolean", "<sample:0>", "false"}, {"com.fasterxml.jackson.databind.deser.ValueInstantiator", "createUsingDefault", "com.fasterxml.jackson.databind.DeserializationContext", "<sample:1>"}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{canCreateFromBoolean=false, canCreateFromDouble=false, canCreateFromInt=false, canCreateFromLong=false, canCreateFromObjectWith=false, canCreateFromString=false, canCreateUsingArrayDelegate=false, ca...#318#1611653153", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput289() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.ValueInstantiator", "com.fasterxml.jackson.databind.deser.ValueInstantiator$Base", "canInstantiate", new String[]{}, new String[]{}, false, 17, new String[][]{{"com.fasterxml.jackson.databind.deser.ValueInstantiator", "createUsingDefault", "com.fasterxml.jackson.databind.DeserializationContext", "<sample:1>"}, {"com.fasterxml.jackson.databind.deser.ValueInstantiator", "createFromString", "com.fasterxml.jackson.databind.DeserializationContext,java.lang.String", "<sample:9>", "--1"}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{canCreateFromBoolean=false, canCreateFromDouble=false, canCreateFromInt=false, canCreateFromLong=false, canCreateFromObjectWith=false, canCreateFromString=false, canCreateUsingArrayDelegate=false, ca...#359#229321856", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput290() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.ValueInstantiator", "com.fasterxml.jackson.databind.deser.ValueInstantiator$Base", "canInstantiate", new String[]{}, new String[]{}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.deser.ValueInstantiator", "createUsingDefault", "com.fasterxml.jackson.databind.DeserializationContext", "<sample:1>"}, {"com.fasterxml.jackson.databind.deser.ValueInstantiator", "createFromString", "com.fasterxml.jackson.databind.DeserializationContext,java.lang.String", "<sample:9>", "010"}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{canCreateFromBoolean=false, canCreateFromDouble=false, canCreateFromInt=false, canCreateFromLong=false, canCreateFromObjectWith=false, canCreateFromString=false, canCreateUsingArrayDelegate=false, ca...#313#-516867540", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput291() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.ValueInstantiator", "com.fasterxml.jackson.databind.deser.ValueInstantiator$Base", "canCreateUsingDefault", new String[]{}, new String[]{}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.deser.ValueInstantiator", "getIncompleteParameter", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{canCreateFromBoolean=false, canCreateFromDouble=false, canCreateFromInt=false, canCreateFromLong=false, canCreateFromObjectWith=false, canCreateFromString=false, canCreateUsingArrayDelegate=false, ca...#313#-516867540", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput292() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.ValueInstantiator", "com.fasterxml.jackson.databind.deser.ValueInstantiator$Base", "canCreateUsingDefault", new String[]{}, new String[]{}, false, 1, new String[][]{{"com.fasterxml.jackson.databind.deser.ValueInstantiator", "getIncompleteParameter", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{canCreateFromBoolean=false, canCreateFromDouble=false, canCreateFromInt=false, canCreateFromLong=false, canCreateFromObjectWith=false, canCreateFromString=false, canCreateUsingArrayDelegate=false, ca...#359#219967482", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput293() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.ValueInstantiator", "com.fasterxml.jackson.databind.deser.ValueInstantiator$Base", "canCreateUsingDefault", new String[]{}, new String[]{}, false, 3, new String[][]{{"com.fasterxml.jackson.databind.deser.ValueInstantiator", "getIncompleteParameter", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{canCreateFromBoolean=false, canCreateFromDouble=false, canCreateFromInt=false, canCreateFromLong=false, canCreateFromObjectWith=false, canCreateFromString=false, canCreateUsingArrayDelegate=false, ca...#314#1636553649", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput294() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.ValueInstantiator", "com.fasterxml.jackson.databind.deser.ValueInstantiator$Base", "canCreateUsingDefault", new String[]{}, new String[]{}, false, 4, new String[][]{{"com.fasterxml.jackson.databind.deser.ValueInstantiator", "getIncompleteParameter", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{canCreateFromBoolean=false, canCreateFromDouble=false, canCreateFromInt=false, canCreateFromLong=false, canCreateFromObjectWith=false, canCreateFromString=false, canCreateUsingArrayDelegate=false, ca...#318#1611653153", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput295() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.ValueInstantiator", "com.fasterxml.jackson.databind.deser.ValueInstantiator$Base", "getArrayDelegateCreator", new String[]{}, new String[]{}, false, 16, new String[][]{{"com.fasterxml.jackson.databind.deser.ValueInstantiator", "canCreateFromBoolean", ""}, {"com.fasterxml.jackson.databind.deser.ValueInstantiator", "canCreateFromString", ""}, {"com.fasterxml.jackson.databind.deser.ValueInstantiator", "getFromObjectArguments", "com.fasterxml.jackson.databind.DeserializationConfig", "<sample:7>"}}, 1);
  assertNull(actual);
  assertEquals("receiver state after the call", "{canCreateFromBoolean=false, canCreateFromDouble=false, canCreateFromInt=false, canCreateFromLong=false, canCreateFromObjectWith=false, canCreateFromString=false, canCreateUsingArrayDelegate=false, ca...#318#1611653153", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput296() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.ValueInstantiator", "com.fasterxml.jackson.databind.deser.ValueInstantiator$Base", "getArrayDelegateCreator", new String[]{}, new String[]{}, false, 17, new String[][]{{"com.fasterxml.jackson.databind.deser.ValueInstantiator", "canCreateFromBoolean", ""}, {"com.fasterxml.jackson.databind.deser.ValueInstantiator", "canCreateFromString", ""}, {"com.fasterxml.jackson.databind.deser.ValueInstantiator", "getFromObjectArguments", "com.fasterxml.jackson.databind.DeserializationConfig", "<sample:7>"}}, 1);
  assertNull(actual);
  assertEquals("receiver state after the call", "{canCreateFromBoolean=false, canCreateFromDouble=false, canCreateFromInt=false, canCreateFromLong=false, canCreateFromObjectWith=false, canCreateFromString=false, canCreateUsingArrayDelegate=false, ca...#359#229321856", SearchInputFactory_scaffolding.receiverState());
 }
}
