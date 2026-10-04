package generated.algorithm;

import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;
import static org.junit.Assert.*;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class BinaryParticleSwarmGeneratedTest {
 @Test(timeout = 20000)
 public void generatedInput000() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.std.StdValueInstantiator", "com.fasterxml.jackson.databind.deser.std.StdValueInstantiator", "configureFromObjectSettings", new String[]{"com.fasterxml.jackson.databind.introspect.AnnotatedWithParams", "com.fasterxml.jackson.databind.introspect.AnnotatedWithParams", "com.fasterxml.jackson.databind.JavaType", "com.fasterxml.jackson.databind.deser.SettableBeanProperty[]", "com.fasterxml.jackson.databind.introspect.AnnotatedWithParams", "com.fasterxml.jackson.databind.deser.SettableBeanProperty[]"}, new String[]{"<null>", "<sample:6>", "<sample:3>", "<null>", "<sample:1>", "<sample:0>"}, false, 5, new String[][]{}, 3);
  assertNull(actual);
  assertEquals("receiver state after the call", "{canCreateFromBoolean=false, canCreateFromDouble=false, canCreateFromInt=false, canCreateFromLong=false, canCreateFromObjectWith=true, canCreateFromString=false, canCreateUsingArrayDelegate=false, can...#297#-1469694047", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput001() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.ValueInstantiator", "com.fasterxml.jackson.databind.deser.ValueInstantiator$Base", "getDefaultCreator", new String[]{}, new String[]{}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.deser.ValueInstantiator", "getWithArgsCreator", ""}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{canCreateFromBoolean=false, canCreateFromDouble=false, canCreateFromInt=false, canCreateFromLong=false, canCreateFromObjectWith=false, canCreateFromString=false, canCreateUsingArrayDelegate=false, ca...#313#-516867540", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput002() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.ValueInstantiator", "com.fasterxml.jackson.databind.deser.ValueInstantiator$Base", "getDelegateType", new String[]{"com.fasterxml.jackson.databind.DeserializationConfig"}, new String[]{"<sample:2>"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.deser.ValueInstantiator", "getIncompleteParameter", ""}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{canCreateFromBoolean=false, canCreateFromDouble=false, canCreateFromInt=false, canCreateFromLong=false, canCreateFromObjectWith=false, canCreateFromString=false, canCreateUsingArrayDelegate=false, ca...#313#-516867540", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput003() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.std.StdValueInstantiator", "com.fasterxml.jackson.databind.deser.std.StdValueInstantiator", "getIncompleteParameter", new String[]{}, new String[]{}, false, 2, new String[][]{{"com.fasterxml.jackson.databind.deser.std.StdValueInstantiator", "createFromLong", "com.fasterxml.jackson.databind.DeserializationContext,long", "<sample:3>", "42"}}, 3);
  assertNull(actual);
  assertEquals("receiver state after the call", "{canCreateFromBoolean=false, canCreateFromDouble=false, canCreateFromInt=false, canCreateFromLong=false, canCreateFromObjectWith=false, canCreateFromString=false, canCreateUsingArrayDelegate=false, ca...#314#1636553649", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput004() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.std.StdValueInstantiator", "com.fasterxml.jackson.databind.deser.std.StdValueInstantiator", "createUsingArrayDelegate", new String[]{"com.fasterxml.jackson.databind.DeserializationContext", "java.lang.Object"}, new String[]{"<sample:3>", "<s:key>"}, false, 5, new String[][]{{"com.fasterxml.jackson.databind.deser.std.StdValueInstantiator", "configureFromArraySettings", "com.fasterxml.jackson.databind.introspect.AnnotatedWithParams,com.fasterxml.jackson.databind.JavaType,com.fasterxml.jackson.databind.deser.SettableBeanProperty[]", "<sample:2>", "<sample:6>", "<sample:0>"}, {"com.fasterxml.jackson.databind.deser.std.StdValueInstantiator", "createFromBoolean", "com.fasterxml.jackson.databind.DeserializationContext,boolean", "<sample:2>", "true"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput005() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.std.StdValueInstantiator", "com.fasterxml.jackson.databind.deser.std.StdValueInstantiator", "configureFromArraySettings", new String[]{"com.fasterxml.jackson.databind.introspect.AnnotatedWithParams", "com.fasterxml.jackson.databind.JavaType", "com.fasterxml.jackson.databind.deser.SettableBeanProperty[]"}, new String[]{"<sample:10>", "<sample:6>", "<empty>"}, false, 7, new String[][]{{"com.fasterxml.jackson.databind.deser.std.StdValueInstantiator", "createFromString", "com.fasterxml.jackson.databind.DeserializationContext,java.lang.String", "<sample:8>", ""}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{canCreateFromBoolean=false, canCreateFromDouble=false, canCreateFromInt=false, canCreateFromLong=false, canCreateFromObjectWith=false, canCreateFromString=false, canCreateUsingArrayDelegate=true, can...#327#2109716695", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput006() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.std.StdValueInstantiator", "com.fasterxml.jackson.databind.deser.std.StdValueInstantiator", "configureFromDoubleCreator", new String[]{"com.fasterxml.jackson.databind.introspect.AnnotatedWithParams"}, new String[]{"<sample:6>"}, false, 4, new String[][]{{"com.fasterxml.jackson.databind.deser.std.StdValueInstantiator", "getFromObjectArguments", "com.fasterxml.jackson.databind.DeserializationConfig", "<sample:3>"}, {"com.fasterxml.jackson.databind.deser.std.StdValueInstantiator", "configureFromStringCreator", "com.fasterxml.jackson.databind.introspect.AnnotatedWithParams", "<sample:5>"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{canCreateFromBoolean=false, canCreateFromDouble=true, canCreateFromInt=false, canCreateFromLong=false, canCreateFromObjectWith=false, canCreateFromString=true, canCreateUsingArrayDelegate=false, canC...#306#1172443278", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput007() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.std.StdValueInstantiator", "com.fasterxml.jackson.databind.deser.std.StdValueInstantiator", "configureIncompleteParameter", new String[]{"com.fasterxml.jackson.databind.introspect.AnnotatedParameter"}, new String[]{"<sample:0>"}, false, 4, new String[][]{{"com.fasterxml.jackson.databind.deser.std.StdValueInstantiator", "getArrayDelegateType", "com.fasterxml.jackson.databind.DeserializationConfig", "<sample:0>"}, {"com.fasterxml.jackson.databind.deser.std.StdValueInstantiator", "configureFromBooleanCreator", "com.fasterxml.jackson.databind.introspect.AnnotatedWithParams", "<sample:3>"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{canCreateFromBoolean=true, canCreateFromDouble=false, canCreateFromInt=false, canCreateFromLong=false, canCreateFromObjectWith=false, canCreateFromString=false, canCreateUsingArrayDelegate=false, can...#307#1700626987", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput008() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.std.StdValueInstantiator", "com.fasterxml.jackson.databind.deser.std.StdValueInstantiator", "canCreateFromString", new String[]{}, new String[]{}, false, 5, new String[][]{{"com.fasterxml.jackson.databind.deser.std.StdValueInstantiator", "getWithArgsCreator", ""}, {"com.fasterxml.jackson.databind.deser.std.StdValueInstantiator", "createUsingArrayDelegate", "com.fasterxml.jackson.databind.DeserializationContext,java.lang.Object", "<sample:9>", "<i:1>"}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{canCreateFromBoolean=false, canCreateFromDouble=false, canCreateFromInt=false, canCreateFromLong=false, canCreateFromObjectWith=false, canCreateFromString=false, canCreateUsingArrayDelegate=false, ca...#300#1048321612", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput009() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.std.StdValueInstantiator", "com.fasterxml.jackson.databind.deser.std.StdValueInstantiator", "_createFromStringFallbacks", new String[]{"com.fasterxml.jackson.databind.DeserializationContext", "java.lang.String"}, new String[]{"<sample:3>", "1.12345678901234567"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.deser.std.StdValueInstantiator", "configureFromLongCreator", "com.fasterxml.jackson.databind.introspect.AnnotatedWithParams", "<sample:3>"}, {"com.fasterxml.jackson.databind.deser.std.StdValueInstantiator", "createFromInt", "com.fasterxml.jackson.databind.DeserializationContext,int", "<sample:8>", "-2147483648"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput010() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.std.StdValueInstantiator", "com.fasterxml.jackson.databind.deser.std.StdValueInstantiator", "createUsingArrayDelegate", new String[]{"com.fasterxml.jackson.databind.DeserializationContext", "java.lang.Object"}, new String[]{"<sample:4>", "<i:1>"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.deser.std.StdValueInstantiator", "wrapException", "java.lang.Throwable", "<sample:8>"}, {"com.fasterxml.jackson.databind.deser.std.StdValueInstantiator", "configureFromObjectSettings", "com.fasterxml.jackson.databind.introspect.AnnotatedWithParams,com.fasterxml.jackson.databind.introspect.AnnotatedWithParams,com.fasterxml.jackson.databind.JavaType,com.fasterxml.jackson.databind.deser.SettableBeanProperty[],com.fasterxml.jackson.databind.introspect.AnnotatedWithParams,com.fasterxml.jackson.databind.deser.SettableBeanProperty[]", "<sample:7>", "<sample:1>", "<sample:5>", "<sample:4>", "<sample:1>", "<empty>"}}, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("com.fasterxml.jackson.databind.JsonMappingException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput011() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.std.StdValueInstantiator", "com.fasterxml.jackson.databind.deser.std.StdValueInstantiator", "configureFromLongCreator", new String[]{"com.fasterxml.jackson.databind.introspect.AnnotatedWithParams"}, new String[]{"<sample:4>"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.deser.std.StdValueInstantiator", "getDefaultCreator", ""}}, 1);
  assertNull(actual);
  assertEquals("receiver state after the call", "{canCreateFromBoolean=false, canCreateFromDouble=false, canCreateFromInt=false, canCreateFromLong=true, canCreateFromObjectWith=false, canCreateFromString=false, canCreateUsingArrayDelegate=false, can...#297#1101176383", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput012() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.std.StdValueInstantiator", "com.fasterxml.jackson.databind.deser.std.StdValueInstantiator", "configureFromIntCreator", new String[]{"com.fasterxml.jackson.databind.introspect.AnnotatedWithParams"}, new String[]{"<sample:6>"}, false, 5, new String[][]{{"com.fasterxml.jackson.databind.deser.std.StdValueInstantiator", "createFromInt", "com.fasterxml.jackson.databind.DeserializationContext,int", "<sample:7>", "-2"}}, 3);
  assertNull(actual);
  assertEquals("receiver state after the call", "{canCreateFromBoolean=false, canCreateFromDouble=false, canCreateFromInt=true, canCreateFromLong=false, canCreateFromObjectWith=false, canCreateFromString=false, canCreateUsingArrayDelegate=false, can...#298#-1055719514", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput013() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.std.StdValueInstantiator", "com.fasterxml.jackson.databind.deser.std.StdValueInstantiator", "createFromObjectWith", new String[]{"com.fasterxml.jackson.databind.DeserializationContext", "java.lang.Object[]"}, new String[]{"<sample:3>", "<sample:0>"}, false, 1, new String[][]{{"com.fasterxml.jackson.databind.deser.std.StdValueInstantiator", "configureFromArraySettings", "com.fasterxml.jackson.databind.introspect.AnnotatedWithParams,com.fasterxml.jackson.databind.JavaType,com.fasterxml.jackson.databind.deser.SettableBeanProperty[]", "<sample:1>", "<sample:7>", "<null>"}, {"com.fasterxml.jackson.databind.deser.std.StdValueInstantiator", "createUsingDelegate", "com.fasterxml.jackson.databind.DeserializationContext,java.lang.Object", "<sample:5>", "<d:0.15>"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput014() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.ValueInstantiator", "com.fasterxml.jackson.databind.deser.ValueInstantiator$Base", "getArrayDelegateType", new String[]{"com.fasterxml.jackson.databind.DeserializationConfig"}, new String[]{"<sample:10>"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.deser.ValueInstantiator", "getDelegateCreator", ""}, {"com.fasterxml.jackson.databind.deser.ValueInstantiator", "getArrayDelegateCreator", ""}}, 2);
  assertNull(actual);
  assertEquals("receiver state after the call", "{canCreateFromBoolean=false, canCreateFromDouble=false, canCreateFromInt=false, canCreateFromLong=false, canCreateFromObjectWith=false, canCreateFromString=false, canCreateUsingArrayDelegate=false, ca...#313#-516867540", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput015() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.std.StdValueInstantiator", "com.fasterxml.jackson.databind.deser.std.StdValueInstantiator", "createFromString", new String[]{"com.fasterxml.jackson.databind.DeserializationContext", "java.lang.String"}, new String[]{"<sample:3>", " 5."}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.deser.std.StdValueInstantiator", "configureFromBooleanCreator", "com.fasterxml.jackson.databind.introspect.AnnotatedWithParams", "<sample:2>"}, {"com.fasterxml.jackson.databind.deser.std.StdValueInstantiator", "_createFromStringFallbacks", "com.fasterxml.jackson.databind.DeserializationContext,java.lang.String", "<sample:8>", "1.5"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput016() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.ValueInstantiator", "com.fasterxml.jackson.databind.deser.ValueInstantiator$Base", "getFromObjectArguments", new String[]{"com.fasterxml.jackson.databind.DeserializationConfig"}, new String[]{"<sample:7>"}, false, 1, new String[][]{{"com.fasterxml.jackson.databind.deser.ValueInstantiator", "createFromString", "com.fasterxml.jackson.databind.DeserializationContext,java.lang.String", "<sample:5>", "1.12345678901234H567"}, {"com.fasterxml.jackson.databind.deser.ValueInstantiator", "createFromLong", "com.fasterxml.jackson.databind.DeserializationContext,long", "<sample:12>", "-9223372036854775808"}}, 1);
  assertNull(actual);
  assertEquals("receiver state after the call", "{canCreateFromBoolean=false, canCreateFromDouble=false, canCreateFromInt=false, canCreateFromLong=false, canCreateFromObjectWith=false, canCreateFromString=false, canCreateUsingArrayDelegate=false, ca...#359#219967482", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput017() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.std.StdValueInstantiator", "com.fasterxml.jackson.databind.deser.std.StdValueInstantiator", "configureFromDoubleCreator", new String[]{"com.fasterxml.jackson.databind.introspect.AnnotatedWithParams"}, new String[]{"<sample:6>"}, false, 2, new String[][]{{"com.fasterxml.jackson.databind.deser.std.StdValueInstantiator", "canCreateUsingDefault", ""}, {"com.fasterxml.jackson.databind.deser.std.StdValueInstantiator", "getArrayDelegateCreator", ""}}, 3);
  assertNull(actual);
  assertEquals("receiver state after the call", "{canCreateFromBoolean=false, canCreateFromDouble=true, canCreateFromInt=false, canCreateFromLong=false, canCreateFromObjectWith=false, canCreateFromString=false, canCreateUsingArrayDelegate=false, can...#312#-1784724411", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput018() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.std.StdValueInstantiator", "com.fasterxml.jackson.databind.deser.std.StdValueInstantiator", "createFromLong", new String[]{"com.fasterxml.jackson.databind.DeserializationContext", "long"}, new String[]{"<sample:2>", "-1"}, false, 6, new String[][]{{"com.fasterxml.jackson.databind.deser.std.StdValueInstantiator", "getDelegateCreator", ""}, {"com.fasterxml.jackson.databind.deser.std.StdValueInstantiator", "configureFromLongCreator", "com.fasterxml.jackson.databind.introspect.AnnotatedWithParams", "<sample:7>"}}, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput019() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.std.StdValueInstantiator", "com.fasterxml.jackson.databind.deser.std.StdValueInstantiator", "createFromString", new String[]{"com.fasterxml.jackson.databind.DeserializationContext", "java.lang.String"}, new String[]{"<sample:12>", "PT1H"}, false, 5, new String[][]{{"com.fasterxml.jackson.databind.deser.std.StdValueInstantiator", "configureFromStringCreator", "com.fasterxml.jackson.databind.introspect.AnnotatedWithParams", "<sample:3>"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput020() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.std.StdValueInstantiator", "com.fasterxml.jackson.databind.deser.std.StdValueInstantiator", "configureFromIntCreator", new String[]{"com.fasterxml.jackson.databind.introspect.AnnotatedWithParams"}, new String[]{"<sample:10>"}, false, 2, new String[][]{{"com.fasterxml.jackson.databind.deser.std.StdValueInstantiator", "createUsingDelegate", "com.fasterxml.jackson.databind.DeserializationContext,java.lang.Object", "<sample:1>", "<s:kKeyP>"}, {"com.fasterxml.jackson.databind.deser.std.StdValueInstantiator", "createFromBoolean", "com.fasterxml.jackson.databind.DeserializationContext,boolean", "<sample:5>", "false"}}, 2);
  assertNull(actual);
  assertEquals("receiver state after the call", "{canCreateFromBoolean=false, canCreateFromDouble=false, canCreateFromInt=false, canCreateFromLong=false, canCreateFromObjectWith=false, canCreateFromString=false, canCreateUsingArrayDelegate=false, ca...#314#1636553649", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput021() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.std.StdValueInstantiator", "com.fasterxml.jackson.databind.deser.std.StdValueInstantiator", "createFromObjectWith", new String[]{"com.fasterxml.jackson.databind.DeserializationContext", "java.lang.Object[]"}, new String[]{"<sample:7>", "<null>"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.deser.std.StdValueInstantiator", "configureFromObjectSettings", "com.fasterxml.jackson.databind.introspect.AnnotatedWithParams,com.fasterxml.jackson.databind.introspect.AnnotatedWithParams,com.fasterxml.jackson.databind.JavaType,com.fasterxml.jackson.databind.deser.SettableBeanProperty[],com.fasterxml.jackson.databind.introspect.AnnotatedWithParams,com.fasterxml.jackson.databind.deser.SettableBeanProperty[]", "<sample:1>", "<sample:1>", "<sample:8>", "<sample:2>", "<sample:3>", "<sample:7>"}, {"com.fasterxml.jackson.databind.deser.std.StdValueInstantiator", "configureFromArraySettings", "com.fasterxml.jackson.databind.introspect.AnnotatedWithParams,com.fasterxml.jackson.databind.JavaType,com.fasterxml.jackson.databind.deser.SettableBeanProperty[]", "<null>", "<sample:0>", "<sample:3>"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput022() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.std.StdValueInstantiator", "com.fasterxml.jackson.databind.deser.std.StdValueInstantiator", "createFromDouble", new String[]{"com.fasterxml.jackson.databind.DeserializationContext", "double"}, new String[]{"<sample:8>", "-1.7976931348623155E308"}, false, 2, new String[][]{{"com.fasterxml.jackson.databind.deser.std.StdValueInstantiator", "configureFromDoubleCreator", "com.fasterxml.jackson.databind.introspect.AnnotatedWithParams", "<sample:3>"}, {"com.fasterxml.jackson.databind.deser.std.StdValueInstantiator", "createUsingDefault", "com.fasterxml.jackson.databind.DeserializationContext", "<sample:12>"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput023() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.std.StdValueInstantiator", "com.fasterxml.jackson.databind.deser.std.StdValueInstantiator", "rewrapCtorProblem", new String[]{"com.fasterxml.jackson.databind.DeserializationContext", "java.lang.Throwable"}, new String[]{"<sample:2>", "<sample:1>"}, false, 6, new String[][]{{"com.fasterxml.jackson.databind.deser.std.StdValueInstantiator", "createFromDouble", "com.fasterxml.jackson.databind.DeserializationContext,double", "<sample:5>", "-8.988465674311577E307"}, {"com.fasterxml.jackson.databind.deser.std.StdValueInstantiator", "unwrapAndWrapException", "com.fasterxml.jackson.databind.DeserializationContext,java.lang.Throwable", "<sample:1>", "<sample:1>"}}, 2);
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.databind.JsonMappingException", actual.getClass().getName());
  assertEquals("com.fasterxml.jackson.databind.JsonMappingException: Can not construct instance of java.lang.Object, problem: 0 {getLocalizedMessage=Can not construct instance of java.lang.Object, problem: 0, getMess...#457#-1921071880", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{canCreateFromBoolean=false, canCreateFromDouble=false, canCreateFromInt=false, canCreateFromLong=false, canCreateFromObjectWith=false, canCreateFromString=false, canCreateUsingArrayDelegate=false, ca...#309#-1951095057", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput024() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.std.StdValueInstantiator", "com.fasterxml.jackson.databind.deser.std.StdValueInstantiator", "createFromBoolean", new String[]{"com.fasterxml.jackson.databind.DeserializationContext", "boolean"}, new String[]{"<sample:8>", "false"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.deser.std.StdValueInstantiator", "configureFromBooleanCreator", "com.fasterxml.jackson.databind.introspect.AnnotatedWithParams", "<sample:7>"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput025() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.std.StdValueInstantiator", "com.fasterxml.jackson.databind.deser.std.StdValueInstantiator", "createFromInt", new String[]{"com.fasterxml.jackson.databind.DeserializationContext", "int"}, new String[]{"<sample:3>", "-2147483648"}, false, 1, new String[][]{{"com.fasterxml.jackson.databind.deser.std.StdValueInstantiator", "configureFromIntCreator", "com.fasterxml.jackson.databind.introspect.AnnotatedWithParams", "<sample:2>"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput026() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.std.StdValueInstantiator", "com.fasterxml.jackson.databind.deser.std.StdValueInstantiator", "getDelegateType", new String[]{"com.fasterxml.jackson.databind.DeserializationConfig"}, new String[]{"<sample:6>"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.deser.std.StdValueInstantiator", "configureFromObjectSettings", "com.fasterxml.jackson.databind.introspect.AnnotatedWithParams,com.fasterxml.jackson.databind.introspect.AnnotatedWithParams,com.fasterxml.jackson.databind.JavaType,com.fasterxml.jackson.databind.deser.SettableBeanProperty[],com.fasterxml.jackson.databind.introspect.AnnotatedWithParams,com.fasterxml.jackson.databind.deser.SettableBeanProperty[]", "<sample:6>", "<sample:5>", "<sample:3>", "<null>", "<sample:0>", "<empty>"}, {"com.fasterxml.jackson.databind.deser.std.StdValueInstantiator", "configureFromStringCreator", "com.fasterxml.jackson.databind.introspect.AnnotatedWithParams", "<sample:2>"}}), new String[][]{{"getGenericSignature", "", "7"}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("Ljava/lang/Object<$0$0>;", String.valueOf(actual));
  assertEquals("receiver state after the call", "{canCreateFromBoolean=false, canCreateFromDouble=false, canCreateFromInt=false, canCreateFromLong=false, canCreateFromObjectWith=true, canCreateFromString=true, canCreateUsingArrayDelegate=false, canC...#294#1091086808", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput027() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.std.StdValueInstantiator", "com.fasterxml.jackson.databind.deser.std.StdValueInstantiator", "createUsingDefault", new String[]{"com.fasterxml.jackson.databind.DeserializationContext"}, new String[]{"<sample:6>"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.deser.std.StdValueInstantiator", "configureFromObjectSettings", "com.fasterxml.jackson.databind.introspect.AnnotatedWithParams,com.fasterxml.jackson.databind.introspect.AnnotatedWithParams,com.fasterxml.jackson.databind.JavaType,com.fasterxml.jackson.databind.deser.SettableBeanProperty[],com.fasterxml.jackson.databind.introspect.AnnotatedWithParams,com.fasterxml.jackson.databind.deser.SettableBeanProperty[]", "<sample:2>", "<sample:2>", "<null>", "<empty>", "<sample:0>", "<sample:0>"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput028() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.std.StdValueInstantiator", "com.fasterxml.jackson.databind.deser.std.StdValueInstantiator", "configureFromObjectSettings", new String[]{"com.fasterxml.jackson.databind.introspect.AnnotatedWithParams", "com.fasterxml.jackson.databind.introspect.AnnotatedWithParams", "com.fasterxml.jackson.databind.JavaType", "com.fasterxml.jackson.databind.deser.SettableBeanProperty[]", "com.fasterxml.jackson.databind.introspect.AnnotatedWithParams", "com.fasterxml.jackson.databind.deser.SettableBeanProperty[]"}, new String[]{"<sample:7>", "<null>", "<sample:4>", "<sample:1>", "<sample:0>", "<sample:0>"}, false, 0, null, 2);
  assertNull(actual);
  assertEquals("receiver state after the call", "{canCreateFromBoolean=false, canCreateFromDouble=false, canCreateFromInt=false, canCreateFromLong=false, canCreateFromObjectWith=true, canCreateFromString=false, canCreateUsingArrayDelegate=false, can...#295#-1741164875", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput029() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.ValueInstantiator", "com.fasterxml.jackson.databind.deser.ValueInstantiator$Base", "canCreateFromLong", new String[]{}, new String[]{}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.deser.ValueInstantiator", "createUsingArrayDelegate", "com.fasterxml.jackson.databind.DeserializationContext,java.lang.Object", "<sample:0>", "<s:kez>"}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{canCreateFromBoolean=false, canCreateFromDouble=false, canCreateFromInt=false, canCreateFromLong=false, canCreateFromObjectWith=false, canCreateFromString=false, canCreateUsingArrayDelegate=false, ca...#313#-516867540", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput030() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.std.StdValueInstantiator", "com.fasterxml.jackson.databind.deser.std.StdValueInstantiator", "configureIncompleteParameter", new String[]{"com.fasterxml.jackson.databind.introspect.AnnotatedParameter"}, new String[]{"<sample:6>"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.deser.std.StdValueInstantiator", "configureFromObjectSettings", "com.fasterxml.jackson.databind.introspect.AnnotatedWithParams,com.fasterxml.jackson.databind.introspect.AnnotatedWithParams,com.fasterxml.jackson.databind.JavaType,com.fasterxml.jackson.databind.deser.SettableBeanProperty[],com.fasterxml.jackson.databind.introspect.AnnotatedWithParams,com.fasterxml.jackson.databind.deser.SettableBeanProperty[]", "<sample:0>", "<sample:0>", "<sample:0>", "<sample:0>", "<sample:4>", "<null>"}}, 2);
  assertNull(actual);
  assertEquals("receiver state after the call", "{canCreateFromBoolean=false, canCreateFromDouble=false, canCreateFromInt=false, canCreateFromLong=false, canCreateFromObjectWith=true, canCreateFromString=false, canCreateUsingArrayDelegate=false, can...#295#-1741164875", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput031() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.std.StdValueInstantiator", "com.fasterxml.jackson.databind.deser.std.StdValueInstantiator", "configureFromDoubleCreator", new String[]{"com.fasterxml.jackson.databind.introspect.AnnotatedWithParams"}, new String[]{"<sample:6>"}, false, 5, new String[][]{}, 3);
  assertNull(actual);
  assertEquals("receiver state after the call", "{canCreateFromBoolean=false, canCreateFromDouble=true, canCreateFromInt=false, canCreateFromLong=false, canCreateFromObjectWith=false, canCreateFromString=false, canCreateUsingArrayDelegate=false, can...#298#1512530400", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput032() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.ValueInstantiator", "com.fasterxml.jackson.databind.deser.ValueInstantiator$Base", "canCreateFromString", new String[]{}, new String[]{}, false, 5, new String[][]{}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{canCreateFromBoolean=false, canCreateFromDouble=false, canCreateFromInt=false, canCreateFromLong=false, canCreateFromObjectWith=false, canCreateFromString=false, canCreateUsingArrayDelegate=false, ca...#311#-229031103", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput033() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.std.StdValueInstantiator", "com.fasterxml.jackson.databind.deser.std.StdValueInstantiator", "configureFromStringCreator", new String[]{"com.fasterxml.jackson.databind.introspect.AnnotatedWithParams"}, new String[]{"<sample:6>"}, false, 4, new String[][]{}, 1);
  assertNull(actual);
  assertEquals("receiver state after the call", "{canCreateFromBoolean=false, canCreateFromDouble=false, canCreateFromInt=false, canCreateFromLong=false, canCreateFromObjectWith=false, canCreateFromString=true, canCreateUsingArrayDelegate=false, can...#307#855313459", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput034() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.std.StdValueInstantiator", "com.fasterxml.jackson.databind.deser.std.StdValueInstantiator", "createFromBoolean", new String[]{"com.fasterxml.jackson.databind.DeserializationContext", "boolean"}, new String[]{"<sample:5>", "false"}, false, 1, new String[][]{}, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput035() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.std.StdValueInstantiator", "com.fasterxml.jackson.databind.deser.std.StdValueInstantiator", "canCreateUsingDefault", new String[]{}, new String[]{}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.deser.std.StdValueInstantiator", "getArrayDelegateType", "com.fasterxml.jackson.databind.DeserializationConfig", "<sample:6>"}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{canCreateFromBoolean=false, canCreateFromDouble=false, canCreateFromInt=false, canCreateFromLong=false, canCreateFromObjectWith=false, canCreateFromString=false, canCreateUsingArrayDelegate=false, ca...#299#-1213177389", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput036() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.std.StdValueInstantiator", "com.fasterxml.jackson.databind.deser.std.StdValueInstantiator", "canCreateFromInt", new String[]{}, new String[]{}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.deser.std.StdValueInstantiator", "createFromObjectWith", "com.fasterxml.jackson.databind.DeserializationContext,com.fasterxml.jackson.databind.deser.SettableBeanProperty[],com.fasterxml.jackson.databind.deser.impl.PropertyValueBuffer", "<sample:5>", "<empty>", "<sample:5>"}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{canCreateFromBoolean=false, canCreateFromDouble=false, canCreateFromInt=false, canCreateFromLong=false, canCreateFromObjectWith=false, canCreateFromString=false, canCreateUsingArrayDelegate=false, ca...#299#-1213177389", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput037() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.ValueInstantiator", "com.fasterxml.jackson.databind.deser.ValueInstantiator$Base", "getValueClass", new String[]{}, new String[]{}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.deser.ValueInstantiator", "getDelegateType", "com.fasterxml.jackson.databind.DeserializationConfig", "<sample:6>"}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Class", actual.getClass().getName());
  assertEquals("class java.lang.Object {getAnnotatedInterfaces=[], getAnnotations=[], getCanonicalName=java.lang.Object, getClasses=[], getConstructors=[public java.lang.Object()], getDeclaredAnnotations=[], getDecla...#543#-946457427", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{canCreateFromBoolean=false, canCreateFromDouble=false, canCreateFromInt=false, canCreateFromLong=false, canCreateFromObjectWith=false, canCreateFromString=false, canCreateUsingArrayDelegate=false, ca...#313#-516867540", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput038() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.std.StdValueInstantiator", "com.fasterxml.jackson.databind.deser.std.StdValueInstantiator", "canCreateFromLong", new String[]{}, new String[]{}, false, 0, null, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{canCreateFromBoolean=false, canCreateFromDouble=false, canCreateFromInt=false, canCreateFromLong=false, canCreateFromObjectWith=false, canCreateFromString=false, canCreateUsingArrayDelegate=false, ca...#299#-1213177389", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput039() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.std.StdValueInstantiator", "com.fasterxml.jackson.databind.deser.std.StdValueInstantiator", "_createFromStringFallbacks", new String[]{"com.fasterxml.jackson.databind.DeserializationContext", "java.lang.String"}, new String[]{"<sample:0>", ".1"}, false, 0, null, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput040() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.ValueInstantiator", "com.fasterxml.jackson.databind.deser.ValueInstantiator$Base", "canCreateUsingDefault", new String[]{}, new String[]{}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.deser.ValueInstantiator", "canCreateUsingDelegate", ""}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{canCreateFromBoolean=false, canCreateFromDouble=false, canCreateFromInt=false, canCreateFromLong=false, canCreateFromObjectWith=false, canCreateFromString=false, canCreateUsingArrayDelegate=false, ca...#313#-516867540", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput041() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.ValueInstantiator", "com.fasterxml.jackson.databind.deser.ValueInstantiator$Base", "getIncompleteParameter", new String[]{}, new String[]{}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.deser.ValueInstantiator", "createUsingArrayDelegate", "com.fasterxml.jackson.databind.DeserializationContext,java.lang.Object", "<sample:6>", "<s:key;>"}}, 1);
  assertNull(actual);
  assertEquals("receiver state after the call", "{canCreateFromBoolean=false, canCreateFromDouble=false, canCreateFromInt=false, canCreateFromLong=false, canCreateFromObjectWith=false, canCreateFromString=false, canCreateUsingArrayDelegate=false, ca...#313#-516867540", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput042() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.ValueInstantiator", "com.fasterxml.jackson.databind.deser.ValueInstantiator$Base", "createUsingDefault", new String[]{"com.fasterxml.jackson.databind.DeserializationContext"}, new String[]{"<sample:7>"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.deser.ValueInstantiator", "canCreateFromInt", ""}, {"com.fasterxml.jackson.databind.deser.ValueInstantiator", "canCreateFromInt", ""}}, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput043() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.std.StdValueInstantiator", "com.fasterxml.jackson.databind.deser.std.StdValueInstantiator", "getValueTypeDesc", new String[]{}, new String[]{}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.deser.std.StdValueInstantiator", "configureFromDoubleCreator", "com.fasterxml.jackson.databind.introspect.AnnotatedWithParams", "<sample:4>"}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("$0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{canCreateFromBoolean=false, canCreateFromDouble=true, canCreateFromInt=false, canCreateFromLong=false, canCreateFromObjectWith=false, canCreateFromString=false, canCreateUsingArrayDelegate=false, can...#297#1988385727", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput044() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.std.StdValueInstantiator", "com.fasterxml.jackson.databind.deser.std.StdValueInstantiator", "canCreateFromLong", new String[]{}, new String[]{}, false, 5, new String[][]{{"com.fasterxml.jackson.databind.deser.std.StdValueInstantiator", "getIncompleteParameter", ""}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{canCreateFromBoolean=false, canCreateFromDouble=false, canCreateFromInt=false, canCreateFromLong=false, canCreateFromObjectWith=false, canCreateFromString=false, canCreateUsingArrayDelegate=false, ca...#300#1048321612", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput045() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.ValueInstantiator", "com.fasterxml.jackson.databind.deser.ValueInstantiator$Base", "getIncompleteParameter", new String[]{}, new String[]{}, false, 5, new String[][]{}, 2);
  assertNull(actual);
  assertEquals("receiver state after the call", "{canCreateFromBoolean=false, canCreateFromDouble=false, canCreateFromInt=false, canCreateFromLong=false, canCreateFromObjectWith=false, canCreateFromString=false, canCreateUsingArrayDelegate=false, ca...#311#-229031103", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput046() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.ValueInstantiator", "com.fasterxml.jackson.databind.deser.ValueInstantiator$Base", "createFromDouble", new String[]{"com.fasterxml.jackson.databind.DeserializationContext", "double"}, new String[]{"<sample:6>", "4.9E-324"}, false, 0, null, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput047() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.ValueInstantiator", "com.fasterxml.jackson.databind.deser.ValueInstantiator$Base", "createFromObjectWith", new String[]{"com.fasterxml.jackson.databind.DeserializationContext", "java.lang.Object[]"}, new String[]{"<sample:6>", "<sample:1>"}, false, 5, new String[][]{}, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput048() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.ValueInstantiator", "com.fasterxml.jackson.databind.deser.ValueInstantiator$Base", "getFromObjectArguments", new String[]{"com.fasterxml.jackson.databind.DeserializationConfig"}, new String[]{"<sample:1>"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.deser.ValueInstantiator", "createUsingDefault", "com.fasterxml.jackson.databind.DeserializationContext", "<sample:5>"}}, 2);
  assertNull(actual);
  assertEquals("receiver state after the call", "{canCreateFromBoolean=false, canCreateFromDouble=false, canCreateFromInt=false, canCreateFromLong=false, canCreateFromObjectWith=false, canCreateFromString=false, canCreateUsingArrayDelegate=false, ca...#313#-516867540", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput049() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.std.StdValueInstantiator", "com.fasterxml.jackson.databind.deser.std.StdValueInstantiator", "unwrapAndWrapException", new String[]{"com.fasterxml.jackson.databind.DeserializationContext", "java.lang.Throwable"}, new String[]{"<sample:0>", "<null>"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.deser.std.StdValueInstantiator", "getArrayDelegateCreator", ""}}, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput050() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.std.StdValueInstantiator", "com.fasterxml.jackson.databind.deser.std.StdValueInstantiator", "getIncompleteParameter", new String[]{}, new String[]{}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.deser.std.StdValueInstantiator", "createFromBoolean", "com.fasterxml.jackson.databind.DeserializationContext,boolean", "<sample:2>", "false"}}, 1);
  assertNull(actual);
  assertEquals("receiver state after the call", "{canCreateFromBoolean=false, canCreateFromDouble=false, canCreateFromInt=false, canCreateFromLong=false, canCreateFromObjectWith=false, canCreateFromString=false, canCreateUsingArrayDelegate=false, ca...#299#-1213177389", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput051() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.std.StdValueInstantiator", "com.fasterxml.jackson.databind.deser.std.StdValueInstantiator", "configureFromLongCreator", new String[]{"com.fasterxml.jackson.databind.introspect.AnnotatedWithParams"}, new String[]{"<sample:4>"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.deser.std.StdValueInstantiator", "createFromObjectWith", "com.fasterxml.jackson.databind.DeserializationContext,com.fasterxml.jackson.databind.deser.SettableBeanProperty[],com.fasterxml.jackson.databind.deser.impl.PropertyValueBuffer", "<sample:2>", "<sample:3>", "<sample:5>"}}, 2);
  assertNull(actual);
  assertEquals("receiver state after the call", "{canCreateFromBoolean=false, canCreateFromDouble=false, canCreateFromInt=false, canCreateFromLong=true, canCreateFromObjectWith=false, canCreateFromString=false, canCreateUsingArrayDelegate=false, can...#297#1101176383", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput052() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.std.StdValueInstantiator", "com.fasterxml.jackson.databind.deser.std.StdValueInstantiator", "getFromObjectArguments", new String[]{"com.fasterxml.jackson.databind.DeserializationConfig"}, new String[]{"<null>"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.deser.std.StdValueInstantiator", "createUsingArrayDelegate", "com.fasterxml.jackson.databind.DeserializationContext,java.lang.Object", "<sample:5>", "<s:b>"}}, 3);
  assertNull(actual);
  assertEquals("receiver state after the call", "{canCreateFromBoolean=false, canCreateFromDouble=false, canCreateFromInt=false, canCreateFromLong=false, canCreateFromObjectWith=false, canCreateFromString=false, canCreateUsingArrayDelegate=false, ca...#299#-1213177389", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput053() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.ValueInstantiator", "com.fasterxml.jackson.databind.deser.ValueInstantiator$Base", "createUsingArrayDelegate", new String[]{"com.fasterxml.jackson.databind.DeserializationContext", "java.lang.Object"}, new String[]{"<sample:0>", "<i:-26>"}, false, 0, null, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput054() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.ValueInstantiator", "com.fasterxml.jackson.databind.deser.ValueInstantiator$Base", "canCreateFromString", new String[]{}, new String[]{}, false, 0, null, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{canCreateFromBoolean=false, canCreateFromDouble=false, canCreateFromInt=false, canCreateFromLong=false, canCreateFromObjectWith=false, canCreateFromString=false, canCreateUsingArrayDelegate=false, ca...#313#-516867540", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput055() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.ValueInstantiator", "com.fasterxml.jackson.databind.deser.ValueInstantiator$Base", "createFromDouble", new String[]{"com.fasterxml.jackson.databind.DeserializationContext", "double"}, new String[]{"<sample:3>", "1.7976931348623157E308"}, false, 0, null, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput056() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.std.StdValueInstantiator", "com.fasterxml.jackson.databind.deser.std.StdValueInstantiator", "rewrapCtorProblem", new String[]{"com.fasterxml.jackson.databind.DeserializationContext", "java.lang.Throwable"}, new String[]{"<null>", "<sample:4>"}, false, 4, new String[][]{}, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput057() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.ValueInstantiator", "com.fasterxml.jackson.databind.deser.ValueInstantiator$Base", "canCreateFromDouble", new String[]{}, new String[]{}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.deser.ValueInstantiator", "canCreateUsingDefault", ""}, {"com.fasterxml.jackson.databind.deser.ValueInstantiator", "createFromLong", "com.fasterxml.jackson.databind.DeserializationContext,long", "<sample:2>", "1"}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{canCreateFromBoolean=false, canCreateFromDouble=false, canCreateFromInt=false, canCreateFromLong=false, canCreateFromObjectWith=false, canCreateFromString=false, canCreateUsingArrayDelegate=false, ca...#313#-516867540", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput058() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.std.StdValueInstantiator", "com.fasterxml.jackson.databind.deser.std.StdValueInstantiator", "canCreateUsingArrayDelegate", new String[]{}, new String[]{}, false, 0, null, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{canCreateFromBoolean=false, canCreateFromDouble=false, canCreateFromInt=false, canCreateFromLong=false, canCreateFromObjectWith=false, canCreateFromString=false, canCreateUsingArrayDelegate=false, ca...#299#-1213177389", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput059() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.ValueInstantiator", "com.fasterxml.jackson.databind.deser.ValueInstantiator$Base", "canCreateUsingArrayDelegate", new String[]{}, new String[]{}, false, 0, null, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{canCreateFromBoolean=false, canCreateFromDouble=false, canCreateFromInt=false, canCreateFromLong=false, canCreateFromObjectWith=false, canCreateFromString=false, canCreateUsingArrayDelegate=false, ca...#313#-516867540", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput060() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.std.StdValueInstantiator", "com.fasterxml.jackson.databind.deser.std.StdValueInstantiator", "canCreateUsingDelegate", new String[]{}, new String[]{}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.deser.std.StdValueInstantiator", "getWithArgsCreator", ""}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{canCreateFromBoolean=false, canCreateFromDouble=false, canCreateFromInt=false, canCreateFromLong=false, canCreateFromObjectWith=false, canCreateFromString=false, canCreateUsingArrayDelegate=false, ca...#299#-1213177389", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput061() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.std.StdValueInstantiator", "com.fasterxml.jackson.databind.deser.std.StdValueInstantiator", "createUsingArrayDelegate", new String[]{"com.fasterxml.jackson.databind.DeserializationContext", "java.lang.Object"}, new String[]{"<sample:1>", "<s:kkey>"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.deser.std.StdValueInstantiator", "createFromBoolean", "com.fasterxml.jackson.databind.DeserializationContext,boolean", "<sample:10>", "false"}}, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalStateException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput062() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.ValueInstantiator", "com.fasterxml.jackson.databind.deser.ValueInstantiator$Base", "getValueTypeDesc", new String[]{}, new String[]{}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.deser.ValueInstantiator", "getDefaultCreator", ""}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("java.lang.Object", String.valueOf(actual));
  assertEquals("receiver state after the call", "{canCreateFromBoolean=false, canCreateFromDouble=false, canCreateFromInt=false, canCreateFromLong=false, canCreateFromObjectWith=false, canCreateFromString=false, canCreateUsingArrayDelegate=false, ca...#313#-516867540", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput063() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.std.StdValueInstantiator", "com.fasterxml.jackson.databind.deser.std.StdValueInstantiator", "canCreateFromObjectWith", new String[]{}, new String[]{}, false, 0, null, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{canCreateFromBoolean=false, canCreateFromDouble=false, canCreateFromInt=false, canCreateFromLong=false, canCreateFromObjectWith=false, canCreateFromString=false, canCreateUsingArrayDelegate=false, ca...#299#-1213177389", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput064() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.ValueInstantiator", "com.fasterxml.jackson.databind.deser.ValueInstantiator$Base", "createFromObjectWith", new String[]{"com.fasterxml.jackson.databind.DeserializationContext", "com.fasterxml.jackson.databind.deser.SettableBeanProperty[]", "com.fasterxml.jackson.databind.deser.impl.PropertyValueBuffer"}, new String[]{"<sample:4>", "<sample:0>", "<sample:6>"}, false, 7, new String[][]{{"com.fasterxml.jackson.databind.deser.ValueInstantiator", "canCreateFromObjectWith", ""}}, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalStateException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput065() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.ValueInstantiator", "com.fasterxml.jackson.databind.deser.ValueInstantiator$Base", "canCreateFromInt", new String[]{}, new String[]{}, false, 0, null, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{canCreateFromBoolean=false, canCreateFromDouble=false, canCreateFromInt=false, canCreateFromLong=false, canCreateFromObjectWith=false, canCreateFromString=false, canCreateUsingArrayDelegate=false, ca...#313#-516867540", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput066() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.ValueInstantiator", "com.fasterxml.jackson.databind.deser.ValueInstantiator$Base", "createFromString", new String[]{"com.fasterxml.jackson.databind.DeserializationContext", "java.lang.String"}, new String[]{"<sample:0>", "Ti"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.deser.ValueInstantiator", "createUsingArrayDelegate", "com.fasterxml.jackson.databind.DeserializationContext,java.lang.Object", "<null>", "<i:2>"}}, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput067() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.ValueInstantiator", "com.fasterxml.jackson.databind.deser.ValueInstantiator$Base", "_createFromStringFallbacks", new String[]{"com.fasterxml.jackson.databind.DeserializationContext", "java.lang.String"}, new String[]{"<sample:2>", "+1"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.deser.ValueInstantiator", "canInstantiate", ""}}, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput068() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.ValueInstantiator", "com.fasterxml.jackson.databind.deser.ValueInstantiator$Base", "createFromLong", new String[]{"com.fasterxml.jackson.databind.DeserializationContext", "long"}, new String[]{"<sample:2>", "-9223372036854775808"}, false, 0, null, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput069() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.ValueInstantiator", "com.fasterxml.jackson.databind.deser.ValueInstantiator$Base", "canCreateUsingDelegate", new String[]{}, new String[]{}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.deser.ValueInstantiator", "canInstantiate", ""}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{canCreateFromBoolean=false, canCreateFromDouble=false, canCreateFromInt=false, canCreateFromLong=false, canCreateFromObjectWith=false, canCreateFromString=false, canCreateUsingArrayDelegate=false, ca...#313#-516867540", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput070() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.ValueInstantiator", "com.fasterxml.jackson.databind.deser.ValueInstantiator$Base", "canCreateFromDouble", new String[]{}, new String[]{}, false, 0, null, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{canCreateFromBoolean=false, canCreateFromDouble=false, canCreateFromInt=false, canCreateFromLong=false, canCreateFromObjectWith=false, canCreateFromString=false, canCreateUsingArrayDelegate=false, ca...#313#-516867540", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput071() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.ValueInstantiator", "com.fasterxml.jackson.databind.deser.ValueInstantiator$Base", "canCreateUsingDefault", new String[]{}, new String[]{}, false, 7, new String[][]{}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{canCreateFromBoolean=false, canCreateFromDouble=false, canCreateFromInt=false, canCreateFromLong=false, canCreateFromObjectWith=false, canCreateFromString=false, canCreateUsingArrayDelegate=false, ca...#316#-1594774090", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput072() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.std.StdValueInstantiator", "com.fasterxml.jackson.databind.deser.std.StdValueInstantiator", "canCreateFromString", new String[]{}, new String[]{}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.deser.std.StdValueInstantiator", "createFromDouble", "com.fasterxml.jackson.databind.DeserializationContext,double", "<sample:1>", "-0.9999999999999999"}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{canCreateFromBoolean=false, canCreateFromDouble=false, canCreateFromInt=false, canCreateFromLong=false, canCreateFromObjectWith=false, canCreateFromString=false, canCreateUsingArrayDelegate=false, ca...#299#-1213177389", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput073() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.std.StdValueInstantiator", "com.fasterxml.jackson.databind.deser.std.StdValueInstantiator", "canCreateFromString", new String[]{}, new String[]{}, false, 3, new String[][]{}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{canCreateFromBoolean=false, canCreateFromDouble=false, canCreateFromInt=false, canCreateFromLong=false, canCreateFromObjectWith=false, canCreateFromString=false, canCreateUsingArrayDelegate=false, ca...#324#-2126697502", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput074() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.ValueInstantiator", "com.fasterxml.jackson.databind.deser.ValueInstantiator$Base", "canCreateFromBoolean", new String[]{}, new String[]{}, false, 6, new String[][]{}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{canCreateFromBoolean=false, canCreateFromDouble=false, canCreateFromInt=false, canCreateFromLong=false, canCreateFromObjectWith=false, canCreateFromString=false, canCreateUsingArrayDelegate=false, ca...#318#1611653153", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput075() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.ValueInstantiator", "com.fasterxml.jackson.databind.deser.ValueInstantiator$Base", "getArrayDelegateCreator", new String[]{}, new String[]{}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.deser.ValueInstantiator", "canInstantiate", ""}}, 1);
  assertNull(actual);
  assertEquals("receiver state after the call", "{canCreateFromBoolean=false, canCreateFromDouble=false, canCreateFromInt=false, canCreateFromLong=false, canCreateFromObjectWith=false, canCreateFromString=false, canCreateUsingArrayDelegate=false, ca...#313#-516867540", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput076() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.std.StdValueInstantiator", "com.fasterxml.jackson.databind.deser.std.StdValueInstantiator", "canCreateFromLong", new String[]{}, new String[]{}, false, 5, new String[][]{{"com.fasterxml.jackson.databind.deser.std.StdValueInstantiator", "getValueTypeDesc", ""}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{canCreateFromBoolean=false, canCreateFromDouble=false, canCreateFromInt=false, canCreateFromLong=false, canCreateFromObjectWith=false, canCreateFromString=false, canCreateUsingArrayDelegate=false, ca...#300#1048321612", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput077() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.std.StdValueInstantiator", "com.fasterxml.jackson.databind.deser.std.StdValueInstantiator", "configureIncompleteParameter", new String[]{"com.fasterxml.jackson.databind.introspect.AnnotatedParameter"}, new String[]{"<sample:3>"}, false, 6, new String[][]{{"com.fasterxml.jackson.databind.deser.std.StdValueInstantiator", "createUsingDelegate", "com.fasterxml.jackson.databind.DeserializationContext,java.lang.Object", "<sample:5>", "<b:true>"}}, 1);
  assertNull(actual);
  assertEquals("receiver state after the call", "{canCreateFromBoolean=false, canCreateFromDouble=false, canCreateFromInt=false, canCreateFromLong=false, canCreateFromObjectWith=false, canCreateFromString=false, canCreateUsingArrayDelegate=false, ca...#309#-1951095057", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput078() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.std.StdValueInstantiator", "com.fasterxml.jackson.databind.deser.std.StdValueInstantiator", "configureFromLongCreator", new String[]{"com.fasterxml.jackson.databind.introspect.AnnotatedWithParams"}, new String[]{"<sample:4>"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.deser.std.StdValueInstantiator", "canCreateFromObjectWith", ""}}, 3);
  assertNull(actual);
  assertEquals("receiver state after the call", "{canCreateFromBoolean=false, canCreateFromDouble=false, canCreateFromInt=false, canCreateFromLong=true, canCreateFromObjectWith=false, canCreateFromString=false, canCreateUsingArrayDelegate=false, can...#297#1101176383", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput079() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.ValueInstantiator", "com.fasterxml.jackson.databind.deser.ValueInstantiator$Base", "getFromObjectArguments", new String[]{"com.fasterxml.jackson.databind.DeserializationConfig"}, new String[]{"<sample:1>"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.deser.ValueInstantiator", "getDefaultCreator", ""}}, 1);
  assertNull(actual);
  assertEquals("receiver state after the call", "{canCreateFromBoolean=false, canCreateFromDouble=false, canCreateFromInt=false, canCreateFromLong=false, canCreateFromObjectWith=false, canCreateFromString=false, canCreateUsingArrayDelegate=false, ca...#313#-516867540", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput080() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.std.StdValueInstantiator", "com.fasterxml.jackson.databind.deser.std.StdValueInstantiator", "canCreateUsingDelegate", new String[]{}, new String[]{}, false, 4, new String[][]{{"com.fasterxml.jackson.databind.deser.std.StdValueInstantiator", "configureFromStringCreator", "com.fasterxml.jackson.databind.introspect.AnnotatedWithParams", "<sample:6>"}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{canCreateFromBoolean=false, canCreateFromDouble=false, canCreateFromInt=false, canCreateFromLong=false, canCreateFromObjectWith=false, canCreateFromString=true, canCreateUsingArrayDelegate=false, can...#307#855313459", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput081() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.ValueInstantiator", "com.fasterxml.jackson.databind.deser.ValueInstantiator$Base", "canCreateFromLong", new String[]{}, new String[]{}, false, 0, null, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{canCreateFromBoolean=false, canCreateFromDouble=false, canCreateFromInt=false, canCreateFromLong=false, canCreateFromObjectWith=false, canCreateFromString=false, canCreateUsingArrayDelegate=false, ca...#313#-516867540", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput082() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.ValueInstantiator", "com.fasterxml.jackson.databind.deser.ValueInstantiator$Base", "canCreateUsingArrayDelegate", new String[]{}, new String[]{}, false, 6, new String[][]{}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{canCreateFromBoolean=false, canCreateFromDouble=false, canCreateFromInt=false, canCreateFromLong=false, canCreateFromObjectWith=false, canCreateFromString=false, canCreateUsingArrayDelegate=false, ca...#318#1611653153", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput083() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.std.StdValueInstantiator", "com.fasterxml.jackson.databind.deser.std.StdValueInstantiator", "getWithArgsCreator", new String[]{}, new String[]{}, false, 0, null, 1);
  assertNull(actual);
  assertEquals("receiver state after the call", "{canCreateFromBoolean=false, canCreateFromDouble=false, canCreateFromInt=false, canCreateFromLong=false, canCreateFromObjectWith=false, canCreateFromString=false, canCreateUsingArrayDelegate=false, ca...#299#-1213177389", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput084() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.ValueInstantiator", "com.fasterxml.jackson.databind.deser.ValueInstantiator$Base", "createFromObjectWith", new String[]{"com.fasterxml.jackson.databind.DeserializationContext", "java.lang.Object[]"}, new String[]{"<sample:1>", "<sample:1>"}, false, 0, null, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput085() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.std.StdValueInstantiator", "com.fasterxml.jackson.databind.deser.std.StdValueInstantiator", "getDelegateType", new String[]{"com.fasterxml.jackson.databind.DeserializationConfig"}, new String[]{"<sample:4>"}, false, 0, null, 1);
  assertNull(actual);
  assertEquals("receiver state after the call", "{canCreateFromBoolean=false, canCreateFromDouble=false, canCreateFromInt=false, canCreateFromLong=false, canCreateFromObjectWith=false, canCreateFromString=false, canCreateUsingArrayDelegate=false, ca...#299#-1213177389", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput086() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.std.StdValueInstantiator", "com.fasterxml.jackson.databind.deser.std.StdValueInstantiator", "configureFromBooleanCreator", new String[]{"com.fasterxml.jackson.databind.introspect.AnnotatedWithParams"}, new String[]{"<sample:2>"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.deser.std.StdValueInstantiator", "canCreateFromString", ""}}, 1);
  assertNull(actual);
  assertEquals("receiver state after the call", "{canCreateFromBoolean=true, canCreateFromDouble=false, canCreateFromInt=false, canCreateFromLong=false, canCreateFromObjectWith=false, canCreateFromString=false, canCreateUsingArrayDelegate=false, can...#297#1843058703", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput087() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.ValueInstantiator", "com.fasterxml.jackson.databind.deser.ValueInstantiator$Base", "createFromDouble", new String[]{"com.fasterxml.jackson.databind.DeserializationContext", "double"}, new String[]{"<sample:0>", "-Infinity"}, false, 7, new String[][]{{"com.fasterxml.jackson.databind.deser.ValueInstantiator", "getFromObjectArguments", "com.fasterxml.jackson.databind.DeserializationConfig", "<sample:6>"}}, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput088() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.ValueInstantiator", "com.fasterxml.jackson.databind.deser.ValueInstantiator$Base", "getArrayDelegateType", new String[]{"com.fasterxml.jackson.databind.DeserializationConfig"}, new String[]{"<sample:5>"}, false, 3, new String[][]{{"com.fasterxml.jackson.databind.deser.ValueInstantiator", "getValueTypeDesc", ""}}, 1);
  assertNull(actual);
  assertEquals("receiver state after the call", "{canCreateFromBoolean=false, canCreateFromDouble=false, canCreateFromInt=false, canCreateFromLong=false, canCreateFromObjectWith=false, canCreateFromString=false, canCreateUsingArrayDelegate=false, ca...#314#1636553649", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput089() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.std.StdValueInstantiator", "com.fasterxml.jackson.databind.deser.std.StdValueInstantiator", "getWithArgsCreator", new String[]{}, new String[]{}, false, 1, new String[][]{{"com.fasterxml.jackson.databind.deser.std.StdValueInstantiator", "canCreateFromLong", ""}}, 2);
  assertNull(actual);
  assertEquals("receiver state after the call", "{canCreateFromBoolean=false, canCreateFromDouble=false, canCreateFromInt=false, canCreateFromLong=false, canCreateFromObjectWith=false, canCreateFromString=false, canCreateUsingArrayDelegate=false, ca...#346#-691812784", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput090() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.std.StdValueInstantiator", "com.fasterxml.jackson.databind.deser.std.StdValueInstantiator", "canCreateFromBoolean", new String[]{}, new String[]{}, false, 7, new String[][]{{"com.fasterxml.jackson.databind.deser.std.StdValueInstantiator", "rewrapCtorProblem", "com.fasterxml.jackson.databind.DeserializationContext,java.lang.Throwable", "<sample:6>", "<null>"}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{canCreateFromBoolean=false, canCreateFromDouble=false, canCreateFromInt=false, canCreateFromLong=false, canCreateFromObjectWith=false, canCreateFromString=false, canCreateUsingArrayDelegate=false, ca...#329#-1747445055", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput091() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.ValueInstantiator", "com.fasterxml.jackson.databind.deser.ValueInstantiator$Base", "canCreateFromBoolean", new String[]{}, new String[]{}, false, 0, null, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{canCreateFromBoolean=false, canCreateFromDouble=false, canCreateFromInt=false, canCreateFromLong=false, canCreateFromObjectWith=false, canCreateFromString=false, canCreateUsingArrayDelegate=false, ca...#313#-516867540", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput092() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.std.StdValueInstantiator", "com.fasterxml.jackson.databind.deser.std.StdValueInstantiator", "canCreateUsingArrayDelegate", new String[]{}, new String[]{}, false, 0, null, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{canCreateFromBoolean=false, canCreateFromDouble=false, canCreateFromInt=false, canCreateFromLong=false, canCreateFromObjectWith=false, canCreateFromString=false, canCreateUsingArrayDelegate=false, ca...#299#-1213177389", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput093() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.ValueInstantiator", "com.fasterxml.jackson.databind.deser.ValueInstantiator$Base", "canCreateFromObjectWith", new String[]{}, new String[]{}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.deser.ValueInstantiator", "canCreateFromInt", ""}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{canCreateFromBoolean=false, canCreateFromDouble=false, canCreateFromInt=false, canCreateFromLong=false, canCreateFromObjectWith=false, canCreateFromString=false, canCreateUsingArrayDelegate=false, ca...#313#-516867540", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput094() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.ValueInstantiator", "com.fasterxml.jackson.databind.deser.ValueInstantiator$Base", "canCreateFromObjectWith", new String[]{}, new String[]{}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.deser.ValueInstantiator", "canCreateUsingDefault", ""}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{canCreateFromBoolean=false, canCreateFromDouble=false, canCreateFromInt=false, canCreateFromLong=false, canCreateFromObjectWith=false, canCreateFromString=false, canCreateUsingArrayDelegate=false, ca...#313#-516867540", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput095() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.ValueInstantiator", "com.fasterxml.jackson.databind.deser.ValueInstantiator$Base", "getArrayDelegateCreator", new String[]{}, new String[]{}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.deser.ValueInstantiator", "canCreateFromDouble", ""}}, 3);
  assertNull(actual);
  assertEquals("receiver state after the call", "{canCreateFromBoolean=false, canCreateFromDouble=false, canCreateFromInt=false, canCreateFromLong=false, canCreateFromObjectWith=false, canCreateFromString=false, canCreateUsingArrayDelegate=false, ca...#313#-516867540", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput096() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.std.StdValueInstantiator", "com.fasterxml.jackson.databind.deser.std.StdValueInstantiator", "wrapException", new String[]{"java.lang.Throwable"}, new String[]{"<sample:0>"}, false, 0, null, 1);
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.databind.JsonMappingException", actual.getClass().getName());
  assertEquals("com.fasterxml.jackson.databind.JsonMappingException: Instantiation of $0 value failed: null {getLocalizedMessage=Instantiation of $0 value failed: null, getMessage=Instantiation of $0 value failed: nu...#377#260452057", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{canCreateFromBoolean=false, canCreateFromDouble=false, canCreateFromInt=false, canCreateFromLong=false, canCreateFromObjectWith=false, canCreateFromString=false, canCreateUsingArrayDelegate=false, ca...#299#-1213177389", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput097() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.std.StdValueInstantiator", "com.fasterxml.jackson.databind.deser.std.StdValueInstantiator", "canCreateFromInt", new String[]{}, new String[]{}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.deser.std.StdValueInstantiator", "configureFromLongCreator", "com.fasterxml.jackson.databind.introspect.AnnotatedWithParams", "<sample:4>"}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{canCreateFromBoolean=false, canCreateFromDouble=false, canCreateFromInt=false, canCreateFromLong=true, canCreateFromObjectWith=false, canCreateFromString=false, canCreateUsingArrayDelegate=false, can...#297#1101176383", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput098() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.std.StdValueInstantiator", "com.fasterxml.jackson.databind.deser.std.StdValueInstantiator", "canCreateFromDouble", new String[]{}, new String[]{}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.deser.std.StdValueInstantiator", "configureFromStringCreator", "com.fasterxml.jackson.databind.introspect.AnnotatedWithParams", "<sample:5>"}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{canCreateFromBoolean=false, canCreateFromDouble=false, canCreateFromInt=false, canCreateFromLong=false, canCreateFromObjectWith=false, canCreateFromString=true, canCreateUsingArrayDelegate=false, can...#297#1475595287", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput099() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.ValueInstantiator", "com.fasterxml.jackson.databind.deser.ValueInstantiator$Base", "createUsingArrayDelegate", new String[]{"com.fasterxml.jackson.databind.DeserializationContext", "java.lang.Object"}, new String[]{"<sample:6>", "<i:-2>"}, false, 1, new String[][]{{"com.fasterxml.jackson.databind.deser.ValueInstantiator", "createFromDouble", "com.fasterxml.jackson.databind.DeserializationContext,double", "<sample:6>", "-8.988465674311579E307"}}, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput100() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.std.StdValueInstantiator", "com.fasterxml.jackson.databind.deser.std.StdValueInstantiator", "canCreateFromString", new String[]{}, new String[]{}, false, 4, new String[][]{{"com.fasterxml.jackson.databind.deser.std.StdValueInstantiator", "createFromInt", "com.fasterxml.jackson.databind.DeserializationContext,int", "<sample:8>", "2147483647"}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{canCreateFromBoolean=false, canCreateFromDouble=false, canCreateFromInt=false, canCreateFromLong=false, canCreateFromObjectWith=false, canCreateFromString=false, canCreateUsingArrayDelegate=false, ca...#309#-1951095057", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput101() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.ValueInstantiator", "com.fasterxml.jackson.databind.deser.ValueInstantiator$Base", "createUsingDelegate", new String[]{"com.fasterxml.jackson.databind.DeserializationContext", "java.lang.Object"}, new String[]{"<sample:4>", "<i:2>"}, false, 0, null, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput102() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.ValueInstantiator", "com.fasterxml.jackson.databind.deser.ValueInstantiator$Base", "canInstantiate", new String[]{}, new String[]{}, false, 0, null, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{canCreateFromBoolean=false, canCreateFromDouble=false, canCreateFromInt=false, canCreateFromLong=false, canCreateFromObjectWith=false, canCreateFromString=false, canCreateUsingArrayDelegate=false, ca...#313#-516867540", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput103() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.std.StdValueInstantiator", "com.fasterxml.jackson.databind.deser.std.StdValueInstantiator", "createUsingDefault", new String[]{"com.fasterxml.jackson.databind.DeserializationContext"}, new String[]{"<sample:4>"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.deser.std.StdValueInstantiator", "configureFromBooleanCreator", "com.fasterxml.jackson.databind.introspect.AnnotatedWithParams", "<sample:4>"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput104() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.ValueInstantiator", "com.fasterxml.jackson.databind.deser.ValueInstantiator$Base", "getIncompleteParameter", new String[]{}, new String[]{}, false, 4, new String[][]{{"com.fasterxml.jackson.databind.deser.ValueInstantiator", "canCreateUsingDelegate", ""}, {"com.fasterxml.jackson.databind.deser.ValueInstantiator", "canCreateFromInt", ""}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{canCreateFromBoolean=false, canCreateFromDouble=false, canCreateFromInt=false, canCreateFromLong=false, canCreateFromObjectWith=false, canCreateFromString=false, canCreateUsingArrayDelegate=false, ca...#318#1611653153", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput105() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.std.StdValueInstantiator", "com.fasterxml.jackson.databind.deser.std.StdValueInstantiator", "createFromBoolean", new String[]{"com.fasterxml.jackson.databind.DeserializationContext", "boolean"}, new String[]{"<sample:5>", "true"}, false, 1, new String[][]{}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput106() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.std.StdValueInstantiator", "com.fasterxml.jackson.databind.deser.std.StdValueInstantiator", "createFromLong", new String[]{"com.fasterxml.jackson.databind.DeserializationContext", "long"}, new String[]{"<sample:3>", "-9223372036854775808"}, false); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput107() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.std.StdValueInstantiator", "com.fasterxml.jackson.databind.deser.std.StdValueInstantiator", "canCreateFromObjectWith", new String[]{}, new String[]{}, false);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{canCreateFromBoolean=false, canCreateFromDouble=false, canCreateFromInt=false, canCreateFromLong=false, canCreateFromObjectWith=false, canCreateFromString=false, canCreateUsingArrayDelegate=false, ca...#299#-1213177389", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput108() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.ValueInstantiator", "com.fasterxml.jackson.databind.deser.ValueInstantiator$Base", "getArrayDelegateType", new String[]{"com.fasterxml.jackson.databind.DeserializationConfig"}, new String[]{"<sample:0>"}, false);
  assertNull(actual);
  assertEquals("receiver state after the call", "{canCreateFromBoolean=false, canCreateFromDouble=false, canCreateFromInt=false, canCreateFromLong=false, canCreateFromObjectWith=false, canCreateFromString=false, canCreateUsingArrayDelegate=false, ca...#313#-516867540", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput109() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.ValueInstantiator", "com.fasterxml.jackson.databind.deser.ValueInstantiator$Base", "getValueTypeDesc", new String[]{}, new String[]{}, false);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("java.lang.Object", String.valueOf(actual));
  assertEquals("receiver state after the call", "{canCreateFromBoolean=false, canCreateFromDouble=false, canCreateFromInt=false, canCreateFromLong=false, canCreateFromObjectWith=false, canCreateFromString=false, canCreateUsingArrayDelegate=false, ca...#313#-516867540", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput110() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.ValueInstantiator", "com.fasterxml.jackson.databind.deser.ValueInstantiator$Base", "canCreateUsingArrayDelegate", new String[]{}, new String[]{}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.deser.ValueInstantiator", "canInstantiate", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{canCreateFromBoolean=false, canCreateFromDouble=false, canCreateFromInt=false, canCreateFromLong=false, canCreateFromObjectWith=false, canCreateFromString=false, canCreateUsingArrayDelegate=false, ca...#313#-516867540", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput111() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.ValueInstantiator", "com.fasterxml.jackson.databind.deser.ValueInstantiator$Base", "createFromLong", new String[]{"com.fasterxml.jackson.databind.DeserializationContext", "long"}, new String[]{"<sample:2>", "-9223372036854775743"}, false); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput112() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.std.StdValueInstantiator", "com.fasterxml.jackson.databind.deser.std.StdValueInstantiator", "createUsingDelegate", new String[]{"com.fasterxml.jackson.databind.DeserializationContext", "java.lang.Object"}, new String[]{"<sample:4>", "<null>"}, false, 1, new String[][]{}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalStateException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput113() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.ValueInstantiator", "com.fasterxml.jackson.databind.deser.ValueInstantiator$Base", "createFromDouble", new String[]{"com.fasterxml.jackson.databind.DeserializationContext", "double"}, new String[]{"<sample:2>", "Infinity"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.deser.ValueInstantiator", "getArrayDelegateType", "com.fasterxml.jackson.databind.DeserializationConfig", "<sample:6>"}, {"com.fasterxml.jackson.databind.deser.ValueInstantiator", "canCreateFromLong", ""}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput114() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.std.StdValueInstantiator", "com.fasterxml.jackson.databind.deser.std.StdValueInstantiator", "canCreateFromDouble", new String[]{}, new String[]{}, false, 7, new String[][]{});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{canCreateFromBoolean=false, canCreateFromDouble=false, canCreateFromInt=false, canCreateFromLong=false, canCreateFromObjectWith=false, canCreateFromString=false, canCreateUsingArrayDelegate=false, ca...#329#-1747445055", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput115() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.ValueInstantiator", "com.fasterxml.jackson.databind.deser.ValueInstantiator$Base", "getValueClass", new String[]{}, new String[]{}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.deser.ValueInstantiator", "canCreateFromLong", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.Class", actual.getClass().getName());
  assertEquals("class java.lang.Object {getAnnotatedInterfaces=[], getAnnotations=[], getCanonicalName=java.lang.Object, getClasses=[], getConstructors=[public java.lang.Object()], getDeclaredAnnotations=[], getDecla...#543#-946457427", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{canCreateFromBoolean=false, canCreateFromDouble=false, canCreateFromInt=false, canCreateFromLong=false, canCreateFromObjectWith=false, canCreateFromString=false, canCreateUsingArrayDelegate=false, ca...#313#-516867540", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput116() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.ValueInstantiator", "com.fasterxml.jackson.databind.deser.ValueInstantiator$Base", "canInstantiate", new String[]{}, new String[]{}, false);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{canCreateFromBoolean=false, canCreateFromDouble=false, canCreateFromInt=false, canCreateFromLong=false, canCreateFromObjectWith=false, canCreateFromString=false, canCreateUsingArrayDelegate=false, ca...#313#-516867540", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput117() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.ValueInstantiator", "com.fasterxml.jackson.databind.deser.ValueInstantiator$Base", "canCreateFromObjectWith", new String[]{}, new String[]{}, false);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{canCreateFromBoolean=false, canCreateFromDouble=false, canCreateFromInt=false, canCreateFromLong=false, canCreateFromObjectWith=false, canCreateFromString=false, canCreateUsingArrayDelegate=false, ca...#313#-516867540", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput118() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.std.StdValueInstantiator", "com.fasterxml.jackson.databind.deser.std.StdValueInstantiator", "canCreateFromDouble", new String[]{}, new String[]{}, false);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{canCreateFromBoolean=false, canCreateFromDouble=false, canCreateFromInt=false, canCreateFromLong=false, canCreateFromObjectWith=false, canCreateFromString=false, canCreateUsingArrayDelegate=false, ca...#299#-1213177389", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput119() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.ValueInstantiator", "com.fasterxml.jackson.databind.deser.ValueInstantiator$Base", "createUsingDelegate", new String[]{"com.fasterxml.jackson.databind.DeserializationContext", "java.lang.Object"}, new String[]{"<sample:2>", "<i:-2147483648>"}, false); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput120() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.ValueInstantiator", "com.fasterxml.jackson.databind.deser.ValueInstantiator$Base", "canCreateFromString", new String[]{}, new String[]{}, false, 4, new String[][]{});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{canCreateFromBoolean=false, canCreateFromDouble=false, canCreateFromInt=false, canCreateFromLong=false, canCreateFromObjectWith=false, canCreateFromString=false, canCreateUsingArrayDelegate=false, ca...#318#1611653153", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput121() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.ValueInstantiator", "com.fasterxml.jackson.databind.deser.ValueInstantiator$Base", "createUsingArrayDelegate", new String[]{"com.fasterxml.jackson.databind.DeserializationContext", "java.lang.Object"}, new String[]{"<sample:3>", "<sample:2>"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.deser.ValueInstantiator", "canCreateFromDouble", ""}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput122() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.std.StdValueInstantiator", "com.fasterxml.jackson.databind.deser.std.StdValueInstantiator", "createFromDouble", new String[]{"com.fasterxml.jackson.databind.DeserializationContext", "double"}, new String[]{"<sample:6>", "0.1"}, false, 6, new String[][]{{"com.fasterxml.jackson.databind.deser.std.StdValueInstantiator", "createFromBoolean", "com.fasterxml.jackson.databind.DeserializationContext,boolean", "<sample:2>", "false"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput123() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.std.StdValueInstantiator", "com.fasterxml.jackson.databind.deser.std.StdValueInstantiator", "configureFromLongCreator", new String[]{"com.fasterxml.jackson.databind.introspect.AnnotatedWithParams"}, new String[]{"<sample:6>"}, false);
  assertNull(actual);
  assertEquals("receiver state after the call", "{canCreateFromBoolean=false, canCreateFromDouble=false, canCreateFromInt=false, canCreateFromLong=true, canCreateFromObjectWith=false, canCreateFromString=false, canCreateUsingArrayDelegate=false, can...#297#1101176383", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput124() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.std.StdValueInstantiator", "com.fasterxml.jackson.databind.deser.std.StdValueInstantiator", "canCreateUsingDefault", new String[]{}, new String[]{}, false, 5, new String[][]{});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{canCreateFromBoolean=false, canCreateFromDouble=false, canCreateFromInt=false, canCreateFromLong=false, canCreateFromObjectWith=false, canCreateFromString=false, canCreateUsingArrayDelegate=false, ca...#300#1048321612", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput125() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.ValueInstantiator", "com.fasterxml.jackson.databind.deser.ValueInstantiator$Base", "canCreateFromLong", new String[]{}, new String[]{}, false);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{canCreateFromBoolean=false, canCreateFromDouble=false, canCreateFromInt=false, canCreateFromLong=false, canCreateFromObjectWith=false, canCreateFromString=false, canCreateUsingArrayDelegate=false, ca...#313#-516867540", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput126() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.std.StdValueInstantiator", "com.fasterxml.jackson.databind.deser.std.StdValueInstantiator", "canCreateFromString", new String[]{}, new String[]{}, false, 3, new String[][]{{"com.fasterxml.jackson.databind.deser.std.StdValueInstantiator", "getFromObjectArguments", "com.fasterxml.jackson.databind.DeserializationConfig", "<sample:3>"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{canCreateFromBoolean=false, canCreateFromDouble=false, canCreateFromInt=false, canCreateFromLong=false, canCreateFromObjectWith=false, canCreateFromString=false, canCreateUsingArrayDelegate=false, ca...#324#-2126697502", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput127() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.ValueInstantiator", "com.fasterxml.jackson.databind.deser.ValueInstantiator$Base", "getDelegateType", new String[]{"com.fasterxml.jackson.databind.DeserializationConfig"}, new String[]{"<sample:7>"}, false, 1, new String[][]{});
  assertNull(actual);
  assertEquals("receiver state after the call", "{canCreateFromBoolean=false, canCreateFromDouble=false, canCreateFromInt=false, canCreateFromLong=false, canCreateFromObjectWith=false, canCreateFromString=false, canCreateUsingArrayDelegate=false, ca...#359#219967482", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput128() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.ValueInstantiator", "com.fasterxml.jackson.databind.deser.ValueInstantiator$Base", "canInstantiate", new String[]{}, new String[]{}, false, 6, new String[][]{});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{canCreateFromBoolean=false, canCreateFromDouble=false, canCreateFromInt=false, canCreateFromLong=false, canCreateFromObjectWith=false, canCreateFromString=false, canCreateUsingArrayDelegate=false, ca...#318#1611653153", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput129() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.ValueInstantiator", "com.fasterxml.jackson.databind.deser.ValueInstantiator$Base", "_createFromStringFallbacks", new String[]{"com.fasterxml.jackson.databind.DeserializationContext", "java.lang.String"}, new String[]{"<sample:0>", "-1.5+1"}, false); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput130() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.ValueInstantiator", "com.fasterxml.jackson.databind.deser.ValueInstantiator$Base", "getFromObjectArguments", new String[]{"com.fasterxml.jackson.databind.DeserializationConfig"}, new String[]{"<sample:0>"}, false, 1, new String[][]{{"com.fasterxml.jackson.databind.deser.ValueInstantiator", "createUsingDefault", "com.fasterxml.jackson.databind.DeserializationContext", "<sample:1>"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{canCreateFromBoolean=false, canCreateFromDouble=false, canCreateFromInt=false, canCreateFromLong=false, canCreateFromObjectWith=false, canCreateFromString=false, canCreateUsingArrayDelegate=false, ca...#359#219967482", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput131() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.std.StdValueInstantiator", "com.fasterxml.jackson.databind.deser.std.StdValueInstantiator", "getValueClass", new String[]{}, new String[]{}, false, 7, new String[][]{{"com.fasterxml.jackson.databind.deser.std.StdValueInstantiator", "configureFromBooleanCreator", "com.fasterxml.jackson.databind.introspect.AnnotatedWithParams", "<sample:4>"}});
  assertNotNull(actual);
  assertEquals("java.lang.Class", actual.getClass().getName());
  assertEquals("class java.lang.String {getAnnotatedInterfaces=?, getAnnotations=[], getCanonicalName=java.lang.String, getClasses=[], getConstructors=[public java.lang.String(byte[]), public java.lang.String(by.., g...#779#-421279309", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{canCreateFromBoolean=true, canCreateFromDouble=false, canCreateFromInt=false, canCreateFromLong=false, canCreateFromObjectWith=false, canCreateFromString=false, canCreateUsingArrayDelegate=false, can...#327#-614531075", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput132() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.std.StdValueInstantiator", "com.fasterxml.jackson.databind.deser.std.StdValueInstantiator", "wrapException", new String[]{"java.lang.Throwable"}, new String[]{"<sample:3>"}, false);
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.databind.JsonMappingException", actual.getClass().getName());
  assertEquals("com.fasterxml.jackson.databind.JsonMappingException: Instantiation of $0 value failed:  {getLocalizedMessage=Instantiation of $0 value failed: , getMessage=Instantiation of $0 value failed: , getOrigi...#361#-126487125", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{canCreateFromBoolean=false, canCreateFromDouble=false, canCreateFromInt=false, canCreateFromLong=false, canCreateFromObjectWith=false, canCreateFromString=false, canCreateUsingArrayDelegate=false, ca...#299#-1213177389", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput133() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.std.StdValueInstantiator", "com.fasterxml.jackson.databind.deser.std.StdValueInstantiator", "canInstantiate", new String[]{}, new String[]{}, false, 1, new String[][]{{"com.fasterxml.jackson.databind.deser.std.StdValueInstantiator", "canCreateFromInt", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{canCreateFromBoolean=false, canCreateFromDouble=false, canCreateFromInt=false, canCreateFromLong=false, canCreateFromObjectWith=false, canCreateFromString=false, canCreateUsingArrayDelegate=false, ca...#346#-691812784", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput134() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.std.StdValueInstantiator", "com.fasterxml.jackson.databind.deser.std.StdValueInstantiator", "createFromInt", new String[]{"com.fasterxml.jackson.databind.DeserializationContext", "int"}, new String[]{"<sample:9>", "-1"}, false, 5, new String[][]{}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput135() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.std.StdValueInstantiator", "com.fasterxml.jackson.databind.deser.std.StdValueInstantiator", "configureFromArraySettings", new String[]{"com.fasterxml.jackson.databind.introspect.AnnotatedWithParams", "com.fasterxml.jackson.databind.JavaType", "com.fasterxml.jackson.databind.deser.SettableBeanProperty[]"}, new String[]{"<sample:1>", "<sample:2>", "<sample:4>"}, false);
  assertNull(actual);
  assertEquals("receiver state after the call", "{canCreateFromBoolean=false, canCreateFromDouble=false, canCreateFromInt=false, canCreateFromLong=false, canCreateFromObjectWith=false, canCreateFromString=false, canCreateUsingArrayDelegate=true, can...#297#417376873", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput136() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.std.StdValueInstantiator", "com.fasterxml.jackson.databind.deser.std.StdValueInstantiator", "createFromObjectWith", new String[]{"com.fasterxml.jackson.databind.DeserializationContext", "com.fasterxml.jackson.databind.deser.SettableBeanProperty[]", "com.fasterxml.jackson.databind.deser.impl.PropertyValueBuffer"}, new String[]{"<sample:2>", "<sample:3>", "<sample:5>"}, false, 3, new String[][]{}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalStateException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput137() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.std.StdValueInstantiator", "com.fasterxml.jackson.databind.deser.std.StdValueInstantiator", "canCreateFromLong", new String[]{}, new String[]{}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.deser.std.StdValueInstantiator", "getDelegateType", "com.fasterxml.jackson.databind.DeserializationConfig", "<sample:0>"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{canCreateFromBoolean=false, canCreateFromDouble=false, canCreateFromInt=false, canCreateFromLong=false, canCreateFromObjectWith=false, canCreateFromString=false, canCreateUsingArrayDelegate=false, ca...#299#-1213177389", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput138() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.std.StdValueInstantiator", "com.fasterxml.jackson.databind.deser.std.StdValueInstantiator", "wrapException", new String[]{"java.lang.Throwable"}, new String[]{"<null>"}, false); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput139() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.ValueInstantiator", "com.fasterxml.jackson.databind.deser.ValueInstantiator$Base", "getFromObjectArguments", new String[]{"com.fasterxml.jackson.databind.DeserializationConfig"}, new String[]{"<sample:5>"}, false);
  assertNull(actual);
  assertEquals("receiver state after the call", "{canCreateFromBoolean=false, canCreateFromDouble=false, canCreateFromInt=false, canCreateFromLong=false, canCreateFromObjectWith=false, canCreateFromString=false, canCreateUsingArrayDelegate=false, ca...#313#-516867540", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput140() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.std.StdValueInstantiator", "com.fasterxml.jackson.databind.deser.std.StdValueInstantiator", "configureFromLongCreator", new String[]{"com.fasterxml.jackson.databind.introspect.AnnotatedWithParams"}, new String[]{"<sample:7>"}, false, 6, new String[][]{});
  assertNull(actual);
  assertEquals("receiver state after the call", "{canCreateFromBoolean=false, canCreateFromDouble=false, canCreateFromInt=false, canCreateFromLong=true, canCreateFromObjectWith=false, canCreateFromString=false, canCreateUsingArrayDelegate=false, can...#307#965168219", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput141() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.ValueInstantiator", "com.fasterxml.jackson.databind.deser.ValueInstantiator$Base", "createFromObjectWith", new String[]{"com.fasterxml.jackson.databind.DeserializationContext", "com.fasterxml.jackson.databind.deser.SettableBeanProperty[]", "com.fasterxml.jackson.databind.deser.impl.PropertyValueBuffer"}, new String[]{"<sample:2>", "<sample:1>", "<sample:4>"}, false, 1, new String[][]{}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalStateException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput142() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.ValueInstantiator", "com.fasterxml.jackson.databind.deser.ValueInstantiator$Base", "getValueClass", new String[]{}, new String[]{}, false, 1, new String[][]{});
  assertNotNull(actual);
  assertEquals("java.lang.Class", actual.getClass().getName());
  assertEquals("class generated.algorithm.SearchInputFactory_scaffolding$GenericBase {getAnnotatedInterfaces=[], getAnnotations=[], getCanonicalName=generated.algorithm.SearchInputFactory_scaffolding.GenericBa.., get...#765#-1415182251", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{canCreateFromBoolean=false, canCreateFromDouble=false, canCreateFromInt=false, canCreateFromLong=false, canCreateFromObjectWith=false, canCreateFromString=false, canCreateUsingArrayDelegate=false, ca...#359#219967482", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput143() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.ValueInstantiator", "com.fasterxml.jackson.databind.deser.ValueInstantiator$Base", "getValueClass", new String[]{}, new String[]{}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.deser.ValueInstantiator", "getDelegateCreator", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.Class", actual.getClass().getName());
  assertEquals("class java.lang.Object {getAnnotatedInterfaces=[], getAnnotations=[], getCanonicalName=java.lang.Object, getClasses=[], getConstructors=[public java.lang.Object()], getDeclaredAnnotations=[], getDecla...#543#-946457427", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{canCreateFromBoolean=false, canCreateFromDouble=false, canCreateFromInt=false, canCreateFromLong=false, canCreateFromObjectWith=false, canCreateFromString=false, canCreateUsingArrayDelegate=false, ca...#313#-516867540", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput144() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.ValueInstantiator", "com.fasterxml.jackson.databind.deser.ValueInstantiator$Base", "getDelegateCreator", new String[]{}, new String[]{}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.deser.ValueInstantiator", "createUsingDelegate", "com.fasterxml.jackson.databind.DeserializationContext,java.lang.Object", "<sample:2>", "<i:2>"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{canCreateFromBoolean=false, canCreateFromDouble=false, canCreateFromInt=false, canCreateFromLong=false, canCreateFromObjectWith=false, canCreateFromString=false, canCreateUsingArrayDelegate=false, ca...#313#-516867540", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput145() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.std.StdValueInstantiator", "com.fasterxml.jackson.databind.deser.std.StdValueInstantiator", "configureFromObjectSettings", new String[]{"com.fasterxml.jackson.databind.introspect.AnnotatedWithParams", "com.fasterxml.jackson.databind.introspect.AnnotatedWithParams", "com.fasterxml.jackson.databind.JavaType", "com.fasterxml.jackson.databind.deser.SettableBeanProperty[]", "com.fasterxml.jackson.databind.introspect.AnnotatedWithParams", "com.fasterxml.jackson.databind.deser.SettableBeanProperty[]"}, new String[]{"<null>", "<sample:5>", "<sample:4>", "<null>", "<sample:3>", "<sample:0>"}, false);
  assertNull(actual);
  assertEquals("receiver state after the call", "{canCreateFromBoolean=false, canCreateFromDouble=false, canCreateFromInt=false, canCreateFromLong=false, canCreateFromObjectWith=true, canCreateFromString=false, canCreateUsingArrayDelegate=false, can...#296#1476542942", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput146() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.std.StdValueInstantiator", "com.fasterxml.jackson.databind.deser.std.StdValueInstantiator", "canCreateFromInt", new String[]{}, new String[]{}, false, 1, new String[][]{{"com.fasterxml.jackson.databind.deser.std.StdValueInstantiator", "configureIncompleteParameter", "com.fasterxml.jackson.databind.introspect.AnnotatedParameter", "<sample:4>"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{canCreateFromBoolean=false, canCreateFromDouble=false, canCreateFromInt=false, canCreateFromLong=false, canCreateFromObjectWith=false, canCreateFromString=false, canCreateUsingArrayDelegate=false, ca...#346#-691812784", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput147() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.ValueInstantiator", "com.fasterxml.jackson.databind.deser.ValueInstantiator$Base", "getFromObjectArguments", new String[]{"com.fasterxml.jackson.databind.DeserializationConfig"}, new String[]{"<sample:7>"}, false, 3, new String[][]{});
  assertNull(actual);
  assertEquals("receiver state after the call", "{canCreateFromBoolean=false, canCreateFromDouble=false, canCreateFromInt=false, canCreateFromLong=false, canCreateFromObjectWith=false, canCreateFromString=false, canCreateUsingArrayDelegate=false, ca...#314#1636553649", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput148() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.ValueInstantiator", "com.fasterxml.jackson.databind.deser.ValueInstantiator$Base", "canCreateFromLong", new String[]{}, new String[]{}, false, 4, new String[][]{});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{canCreateFromBoolean=false, canCreateFromDouble=false, canCreateFromInt=false, canCreateFromLong=false, canCreateFromObjectWith=false, canCreateFromString=false, canCreateUsingArrayDelegate=false, ca...#318#1611653153", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput149() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.ValueInstantiator", "com.fasterxml.jackson.databind.deser.ValueInstantiator$Base", "createUsingDefault", new String[]{"com.fasterxml.jackson.databind.DeserializationContext"}, new String[]{"<sample:7>"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.deser.ValueInstantiator", "getWithArgsCreator", ""}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput150() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.ValueInstantiator", "com.fasterxml.jackson.databind.deser.ValueInstantiator$Base", "canCreateUsingArrayDelegate", new String[]{}, new String[]{}, false, 4, new String[][]{});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{canCreateFromBoolean=false, canCreateFromDouble=false, canCreateFromInt=false, canCreateFromLong=false, canCreateFromObjectWith=false, canCreateFromString=false, canCreateUsingArrayDelegate=false, ca...#318#1611653153", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput151() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.std.StdValueInstantiator", "com.fasterxml.jackson.databind.deser.std.StdValueInstantiator", "configureFromBooleanCreator", new String[]{"com.fasterxml.jackson.databind.introspect.AnnotatedWithParams"}, new String[]{"<sample:1>"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.deser.std.StdValueInstantiator", "configureFromLongCreator", "com.fasterxml.jackson.databind.introspect.AnnotatedWithParams", "<sample:3>"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{canCreateFromBoolean=true, canCreateFromDouble=false, canCreateFromInt=false, canCreateFromLong=true, canCreateFromObjectWith=false, canCreateFromString=false, canCreateUsingArrayDelegate=false, canC...#296#729285130", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput152() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.ValueInstantiator", "com.fasterxml.jackson.databind.deser.ValueInstantiator$Base", "canCreateUsingDefault", new String[]{}, new String[]{}, false, 4, new String[][]{});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{canCreateFromBoolean=false, canCreateFromDouble=false, canCreateFromInt=false, canCreateFromLong=false, canCreateFromObjectWith=false, canCreateFromString=false, canCreateUsingArrayDelegate=false, ca...#318#1611653153", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput153() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.ValueInstantiator", "com.fasterxml.jackson.databind.deser.ValueInstantiator$Base", "canCreateUsingDelegate", new String[]{}, new String[]{}, false, 6, new String[][]{});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{canCreateFromBoolean=false, canCreateFromDouble=false, canCreateFromInt=false, canCreateFromLong=false, canCreateFromObjectWith=false, canCreateFromString=false, canCreateUsingArrayDelegate=false, ca...#318#1611653153", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput154() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.std.StdValueInstantiator", "com.fasterxml.jackson.databind.deser.std.StdValueInstantiator", "canCreateFromLong", new String[]{}, new String[]{}, false, 6, new String[][]{});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{canCreateFromBoolean=false, canCreateFromDouble=false, canCreateFromInt=false, canCreateFromLong=false, canCreateFromObjectWith=false, canCreateFromString=false, canCreateUsingArrayDelegate=false, ca...#309#-1951095057", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput155() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.std.StdValueInstantiator", "com.fasterxml.jackson.databind.deser.std.StdValueInstantiator", "canCreateUsingArrayDelegate", new String[]{}, new String[]{}, false);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{canCreateFromBoolean=false, canCreateFromDouble=false, canCreateFromInt=false, canCreateFromLong=false, canCreateFromObjectWith=false, canCreateFromString=false, canCreateUsingArrayDelegate=false, ca...#299#-1213177389", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput156() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.ValueInstantiator", "com.fasterxml.jackson.databind.deser.ValueInstantiator$Base", "getValueTypeDesc", new String[]{}, new String[]{}, false, 5, new String[][]{{"com.fasterxml.jackson.databind.deser.ValueInstantiator", "createFromInt", "com.fasterxml.jackson.databind.DeserializationContext,int", "<sample:0>", "-2147483648"}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("java.util.List", String.valueOf(actual));
  assertEquals("receiver state after the call", "{canCreateFromBoolean=false, canCreateFromDouble=false, canCreateFromInt=false, canCreateFromLong=false, canCreateFromObjectWith=false, canCreateFromString=false, canCreateUsingArrayDelegate=false, ca...#311#-229031103", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput157() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.ValueInstantiator", "com.fasterxml.jackson.databind.deser.ValueInstantiator$Base", "getWithArgsCreator", new String[]{}, new String[]{}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.deser.ValueInstantiator", "getIncompleteParameter", ""}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{canCreateFromBoolean=false, canCreateFromDouble=false, canCreateFromInt=false, canCreateFromLong=false, canCreateFromObjectWith=false, canCreateFromString=false, canCreateUsingArrayDelegate=false, ca...#313#-516867540", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput158() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.ValueInstantiator", "com.fasterxml.jackson.databind.deser.ValueInstantiator$Base", "canCreateFromDouble", new String[]{}, new String[]{}, false, 7, new String[][]{});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{canCreateFromBoolean=false, canCreateFromDouble=false, canCreateFromInt=false, canCreateFromLong=false, canCreateFromObjectWith=false, canCreateFromString=false, canCreateUsingArrayDelegate=false, ca...#316#-1594774090", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput159() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.ValueInstantiator", "com.fasterxml.jackson.databind.deser.ValueInstantiator$Base", "canCreateFromDouble", new String[]{}, new String[]{}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.deser.ValueInstantiator", "createFromBoolean", "com.fasterxml.jackson.databind.DeserializationContext,boolean", "<sample:3>", "true"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{canCreateFromBoolean=false, canCreateFromDouble=false, canCreateFromInt=false, canCreateFromLong=false, canCreateFromObjectWith=false, canCreateFromString=false, canCreateUsingArrayDelegate=false, ca...#313#-516867540", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput160() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.ValueInstantiator", "com.fasterxml.jackson.databind.deser.ValueInstantiator$Base", "canCreateFromString", new String[]{}, new String[]{}, false);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{canCreateFromBoolean=false, canCreateFromDouble=false, canCreateFromInt=false, canCreateFromLong=false, canCreateFromObjectWith=false, canCreateFromString=false, canCreateUsingArrayDelegate=false, ca...#313#-516867540", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput161() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.ValueInstantiator", "com.fasterxml.jackson.databind.deser.ValueInstantiator$Base", "canInstantiate", new String[]{}, new String[]{}, false, 5, new String[][]{});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{canCreateFromBoolean=false, canCreateFromDouble=false, canCreateFromInt=false, canCreateFromLong=false, canCreateFromObjectWith=false, canCreateFromString=false, canCreateUsingArrayDelegate=false, ca...#311#-229031103", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput162() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.std.StdValueInstantiator", "com.fasterxml.jackson.databind.deser.std.StdValueInstantiator", "createFromObjectWith", new String[]{"com.fasterxml.jackson.databind.DeserializationContext", "java.lang.Object[]"}, new String[]{"<sample:5>", "<null>"}, false); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput163() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.std.StdValueInstantiator", "com.fasterxml.jackson.databind.deser.std.StdValueInstantiator", "configureFromDoubleCreator", new String[]{"com.fasterxml.jackson.databind.introspect.AnnotatedWithParams"}, new String[]{"<sample:3>"}, false, 1, new String[][]{{"com.fasterxml.jackson.databind.deser.std.StdValueInstantiator", "getValueTypeDesc", ""}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{canCreateFromBoolean=false, canCreateFromDouble=true, canCreateFromInt=false, canCreateFromLong=false, canCreateFromObjectWith=false, canCreateFromString=false, canCreateUsingArrayDelegate=false, can...#344#567273188", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput164() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.std.StdValueInstantiator", "com.fasterxml.jackson.databind.deser.std.StdValueInstantiator", "getValueTypeDesc", new String[]{}, new String[]{}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.deser.std.StdValueInstantiator", "createUsingDefault", "com.fasterxml.jackson.databind.DeserializationContext", "<sample:3>"}, {"com.fasterxml.jackson.databind.deser.std.StdValueInstantiator", "createUsingArrayDelegate", "com.fasterxml.jackson.databind.DeserializationContext,java.lang.Object", "<sample:7>", "<s:a>"}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("$0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{canCreateFromBoolean=false, canCreateFromDouble=false, canCreateFromInt=false, canCreateFromLong=false, canCreateFromObjectWith=false, canCreateFromString=false, canCreateUsingArrayDelegate=false, ca...#299#-1213177389", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput165() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.ValueInstantiator", "com.fasterxml.jackson.databind.deser.ValueInstantiator$Base", "canCreateFromDouble", new String[]{}, new String[]{}, false, 6, new String[][]{{"com.fasterxml.jackson.databind.deser.ValueInstantiator", "_createFromStringFallbacks", "com.fasterxml.jackson.databind.DeserializationContext,java.lang.String", "<sample:2>", "UNKNOWN TYPE"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{canCreateFromBoolean=false, canCreateFromDouble=false, canCreateFromInt=false, canCreateFromLong=false, canCreateFromObjectWith=false, canCreateFromString=false, canCreateUsingArrayDelegate=false, ca...#318#1611653153", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput166() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.std.StdValueInstantiator", "com.fasterxml.jackson.databind.deser.std.StdValueInstantiator", "canCreateFromDouble", new String[]{}, new String[]{}, false, 4, new String[][]{{"com.fasterxml.jackson.databind.deser.std.StdValueInstantiator", "canCreateUsingArrayDelegate", ""}, {"com.fasterxml.jackson.databind.deser.std.StdValueInstantiator", "createFromInt", "com.fasterxml.jackson.databind.DeserializationContext,int", "<sample:3>", "1"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{canCreateFromBoolean=false, canCreateFromDouble=false, canCreateFromInt=false, canCreateFromLong=false, canCreateFromObjectWith=false, canCreateFromString=false, canCreateUsingArrayDelegate=false, ca...#309#-1951095057", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput167() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.ValueInstantiator", "com.fasterxml.jackson.databind.deser.ValueInstantiator$Base", "createFromObjectWith", new String[]{"com.fasterxml.jackson.databind.DeserializationContext", "java.lang.Object[]"}, new String[]{"<sample:1>", "<sample:1>"}, false); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput168() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.ValueInstantiator", "com.fasterxml.jackson.databind.deser.ValueInstantiator$Base", "getArrayDelegateType", new String[]{"com.fasterxml.jackson.databind.DeserializationConfig"}, new String[]{"<sample:2>"}, false, 5, new String[][]{{"com.fasterxml.jackson.databind.deser.ValueInstantiator", "canCreateUsingDelegate", ""}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{canCreateFromBoolean=false, canCreateFromDouble=false, canCreateFromInt=false, canCreateFromLong=false, canCreateFromObjectWith=false, canCreateFromString=false, canCreateUsingArrayDelegate=false, ca...#311#-229031103", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput169() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.std.StdValueInstantiator", "com.fasterxml.jackson.databind.deser.std.StdValueInstantiator", "canCreateUsingArrayDelegate", new String[]{}, new String[]{}, false, 4, new String[][]{{"com.fasterxml.jackson.databind.deser.std.StdValueInstantiator", "getArrayDelegateCreator", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{canCreateFromBoolean=false, canCreateFromDouble=false, canCreateFromInt=false, canCreateFromLong=false, canCreateFromObjectWith=false, canCreateFromString=false, canCreateUsingArrayDelegate=false, ca...#309#-1951095057", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput170() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.ValueInstantiator", "com.fasterxml.jackson.databind.deser.ValueInstantiator$Base", "canInstantiate", new String[]{}, new String[]{}, false, 7, new String[][]{{"com.fasterxml.jackson.databind.deser.ValueInstantiator", "createFromObjectWith", "com.fasterxml.jackson.databind.DeserializationContext,com.fasterxml.jackson.databind.deser.SettableBeanProperty[],com.fasterxml.jackson.databind.deser.impl.PropertyValueBuffer", "<sample:11>", "<sample:0>", "<sample:4>"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{canCreateFromBoolean=false, canCreateFromDouble=false, canCreateFromInt=false, canCreateFromLong=false, canCreateFromObjectWith=false, canCreateFromString=false, canCreateUsingArrayDelegate=false, ca...#316#-1594774090", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput171() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.std.StdValueInstantiator", "com.fasterxml.jackson.databind.deser.std.StdValueInstantiator", "configureFromLongCreator", new String[]{"com.fasterxml.jackson.databind.introspect.AnnotatedWithParams"}, new String[]{"<sample:2>"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.deser.std.StdValueInstantiator", "configureFromBooleanCreator", "com.fasterxml.jackson.databind.introspect.AnnotatedWithParams", "<sample:0>"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{canCreateFromBoolean=true, canCreateFromDouble=false, canCreateFromInt=false, canCreateFromLong=true, canCreateFromObjectWith=false, canCreateFromString=false, canCreateUsingArrayDelegate=false, canC...#296#729285130", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput172() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.ValueInstantiator", "com.fasterxml.jackson.databind.deser.ValueInstantiator$Base", "getIncompleteParameter", new String[]{}, new String[]{}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.deser.ValueInstantiator", "createFromObjectWith", "com.fasterxml.jackson.databind.DeserializationContext,java.lang.Object[]", "<sample:5>", "<sample:2>"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{canCreateFromBoolean=false, canCreateFromDouble=false, canCreateFromInt=false, canCreateFromLong=false, canCreateFromObjectWith=false, canCreateFromString=false, canCreateUsingArrayDelegate=false, ca...#313#-516867540", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput173() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.std.StdValueInstantiator", "com.fasterxml.jackson.databind.deser.std.StdValueInstantiator", "configureFromDoubleCreator", new String[]{"com.fasterxml.jackson.databind.introspect.AnnotatedWithParams"}, new String[]{"<sample:4>"}, false, 5, new String[][]{});
  assertNull(actual);
  assertEquals("receiver state after the call", "{canCreateFromBoolean=false, canCreateFromDouble=true, canCreateFromInt=false, canCreateFromLong=false, canCreateFromObjectWith=false, canCreateFromString=false, canCreateUsingArrayDelegate=false, can...#298#1512530400", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput174() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.ValueInstantiator", "com.fasterxml.jackson.databind.deser.ValueInstantiator$Base", "canCreateFromInt", new String[]{}, new String[]{}, false, 7, new String[][]{{"com.fasterxml.jackson.databind.deser.ValueInstantiator", "getArrayDelegateType", "com.fasterxml.jackson.databind.DeserializationConfig", "<sample:2>"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{canCreateFromBoolean=false, canCreateFromDouble=false, canCreateFromInt=false, canCreateFromLong=false, canCreateFromObjectWith=false, canCreateFromString=false, canCreateUsingArrayDelegate=false, ca...#316#-1594774090", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput175() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.ValueInstantiator", "com.fasterxml.jackson.databind.deser.ValueInstantiator$Base", "canCreateFromInt", new String[]{}, new String[]{}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.deser.ValueInstantiator", "createFromObjectWith", "com.fasterxml.jackson.databind.DeserializationContext,com.fasterxml.jackson.databind.deser.SettableBeanProperty[],com.fasterxml.jackson.databind.deser.impl.PropertyValueBuffer", "<sample:2>", "<sample:0>", "<sample:6>"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{canCreateFromBoolean=false, canCreateFromDouble=false, canCreateFromInt=false, canCreateFromLong=false, canCreateFromObjectWith=false, canCreateFromString=false, canCreateUsingArrayDelegate=false, ca...#313#-516867540", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput176() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.std.StdValueInstantiator", "com.fasterxml.jackson.databind.deser.std.StdValueInstantiator", "getValueClass", new String[]{}, new String[]{}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.deser.std.StdValueInstantiator", "wrapException", "java.lang.Throwable", "<sample:3>"}, {"com.fasterxml.jackson.databind.deser.std.StdValueInstantiator", "canInstantiate", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.Class", actual.getClass().getName());
  assertEquals("class java.lang.Object {getAnnotatedInterfaces=[], getAnnotations=[], getCanonicalName=java.lang.Object, getClasses=[], getConstructors=[public java.lang.Object()], getDeclaredAnnotations=[], getDecla...#543#-946457427", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{canCreateFromBoolean=false, canCreateFromDouble=false, canCreateFromInt=false, canCreateFromLong=false, canCreateFromObjectWith=false, canCreateFromString=false, canCreateUsingArrayDelegate=false, ca...#299#-1213177389", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput177() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.std.StdValueInstantiator", "com.fasterxml.jackson.databind.deser.std.StdValueInstantiator", "configureFromArraySettings", new String[]{"com.fasterxml.jackson.databind.introspect.AnnotatedWithParams", "com.fasterxml.jackson.databind.JavaType", "com.fasterxml.jackson.databind.deser.SettableBeanProperty[]"}, new String[]{"<sample:0>", "<sample:10>", "<sample:2>"}, false, 6, new String[][]{});
  assertNull(actual);
  assertEquals("receiver state after the call", "{canCreateFromBoolean=false, canCreateFromDouble=false, canCreateFromInt=false, canCreateFromLong=false, canCreateFromObjectWith=false, canCreateFromString=false, canCreateUsingArrayDelegate=true, can...#307#-1054102523", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput178() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.std.StdValueInstantiator", "com.fasterxml.jackson.databind.deser.std.StdValueInstantiator", "canCreateUsingDelegate", new String[]{}, new String[]{}, false);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{canCreateFromBoolean=false, canCreateFromDouble=false, canCreateFromInt=false, canCreateFromLong=false, canCreateFromObjectWith=false, canCreateFromString=false, canCreateUsingArrayDelegate=false, ca...#299#-1213177389", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput179() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.ValueInstantiator", "com.fasterxml.jackson.databind.deser.ValueInstantiator$Base", "canCreateFromObjectWith", new String[]{}, new String[]{}, false, 1, new String[][]{{"com.fasterxml.jackson.databind.deser.ValueInstantiator", "getIncompleteParameter", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{canCreateFromBoolean=false, canCreateFromDouble=false, canCreateFromInt=false, canCreateFromLong=false, canCreateFromObjectWith=false, canCreateFromString=false, canCreateUsingArrayDelegate=false, ca...#359#219967482", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput180() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.std.StdValueInstantiator", "com.fasterxml.jackson.databind.deser.std.StdValueInstantiator", "canCreateFromBoolean", new String[]{}, new String[]{}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.deser.std.StdValueInstantiator", "configureFromLongCreator", "com.fasterxml.jackson.databind.introspect.AnnotatedWithParams", "<sample:0>"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{canCreateFromBoolean=false, canCreateFromDouble=false, canCreateFromInt=false, canCreateFromLong=true, canCreateFromObjectWith=false, canCreateFromString=false, canCreateUsingArrayDelegate=false, can...#297#1101176383", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput181() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.std.StdValueInstantiator", "com.fasterxml.jackson.databind.deser.std.StdValueInstantiator", "canCreateUsingArrayDelegate", new String[]{}, new String[]{}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.deser.std.StdValueInstantiator", "getDefaultCreator", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{canCreateFromBoolean=false, canCreateFromDouble=false, canCreateFromInt=false, canCreateFromLong=false, canCreateFromObjectWith=false, canCreateFromString=false, canCreateUsingArrayDelegate=false, ca...#299#-1213177389", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput182() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.ValueInstantiator", "com.fasterxml.jackson.databind.deser.ValueInstantiator$Base", "createFromString", new String[]{"com.fasterxml.jackson.databind.DeserializationContext", "java.lang.String"}, new String[]{"<sample:1>", ""}, false, 5, new String[][]{{"com.fasterxml.jackson.databind.deser.ValueInstantiator", "getValueTypeDesc", ""}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput183() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.ValueInstantiator", "com.fasterxml.jackson.databind.deser.ValueInstantiator$Base", "createFromBoolean", new String[]{"com.fasterxml.jackson.databind.DeserializationContext", "boolean"}, new String[]{"<sample:1>", "true"}, false, 5, new String[][]{{"com.fasterxml.jackson.databind.deser.ValueInstantiator", "getDelegateType", "com.fasterxml.jackson.databind.DeserializationConfig", "<sample:3>"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput184() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.std.StdValueInstantiator", "com.fasterxml.jackson.databind.deser.std.StdValueInstantiator", "getWithArgsCreator", new String[]{}, new String[]{}, false, 3, new String[][]{});
  assertNull(actual);
  assertEquals("receiver state after the call", "{canCreateFromBoolean=false, canCreateFromDouble=false, canCreateFromInt=false, canCreateFromLong=false, canCreateFromObjectWith=false, canCreateFromString=false, canCreateUsingArrayDelegate=false, ca...#324#-2126697502", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput185() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.ValueInstantiator", "com.fasterxml.jackson.databind.deser.ValueInstantiator$Base", "getFromObjectArguments", new String[]{"com.fasterxml.jackson.databind.DeserializationConfig"}, new String[]{"<sample:3>"}, false, 5, new String[][]{});
  assertNull(actual);
  assertEquals("receiver state after the call", "{canCreateFromBoolean=false, canCreateFromDouble=false, canCreateFromInt=false, canCreateFromLong=false, canCreateFromObjectWith=false, canCreateFromString=false, canCreateUsingArrayDelegate=false, ca...#311#-229031103", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput186() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.ValueInstantiator", "com.fasterxml.jackson.databind.deser.ValueInstantiator$Base", "getValueTypeDesc", new String[]{}, new String[]{}, false, 7, new String[][]{});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("[Ljava.lang.String;", String.valueOf(actual));
  assertEquals("receiver state after the call", "{canCreateFromBoolean=false, canCreateFromDouble=false, canCreateFromInt=false, canCreateFromLong=false, canCreateFromObjectWith=false, canCreateFromString=false, canCreateUsingArrayDelegate=false, ca...#316#-1594774090", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput187() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.ValueInstantiator", "com.fasterxml.jackson.databind.deser.ValueInstantiator$Base", "getArrayDelegateCreator", new String[]{}, new String[]{}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.deser.ValueInstantiator", "getWithArgsCreator", ""}, {"com.fasterxml.jackson.databind.deser.ValueInstantiator", "getFromObjectArguments", "com.fasterxml.jackson.databind.DeserializationConfig", "<sample:5>"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{canCreateFromBoolean=false, canCreateFromDouble=false, canCreateFromInt=false, canCreateFromLong=false, canCreateFromObjectWith=false, canCreateFromString=false, canCreateUsingArrayDelegate=false, ca...#313#-516867540", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput188() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.std.StdValueInstantiator", "com.fasterxml.jackson.databind.deser.std.StdValueInstantiator", "getDelegateType", new String[]{"com.fasterxml.jackson.databind.DeserializationConfig"}, new String[]{"<sample:1>"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.deser.std.StdValueInstantiator", "configureFromStringCreator", "com.fasterxml.jackson.databind.introspect.AnnotatedWithParams", "<sample:5>"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{canCreateFromBoolean=false, canCreateFromDouble=false, canCreateFromInt=false, canCreateFromLong=false, canCreateFromObjectWith=false, canCreateFromString=true, canCreateUsingArrayDelegate=false, can...#297#1475595287", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput189() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.std.StdValueInstantiator", "com.fasterxml.jackson.databind.deser.std.StdValueInstantiator", "canCreateFromBoolean", new String[]{}, new String[]{}, false, 4, new String[][]{{"com.fasterxml.jackson.databind.deser.std.StdValueInstantiator", "createFromInt", "com.fasterxml.jackson.databind.DeserializationContext,int", "<sample:0>", "0"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{canCreateFromBoolean=false, canCreateFromDouble=false, canCreateFromInt=false, canCreateFromLong=false, canCreateFromObjectWith=false, canCreateFromString=false, canCreateUsingArrayDelegate=false, ca...#309#-1951095057", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput190() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.ValueInstantiator", "com.fasterxml.jackson.databind.deser.ValueInstantiator$Base", "canInstantiate", new String[]{}, new String[]{}, false, 1, new String[][]{});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{canCreateFromBoolean=false, canCreateFromDouble=false, canCreateFromInt=false, canCreateFromLong=false, canCreateFromObjectWith=false, canCreateFromString=false, canCreateUsingArrayDelegate=false, ca...#359#219967482", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput191() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.ValueInstantiator", "com.fasterxml.jackson.databind.deser.ValueInstantiator$Base", "canCreateFromInt", new String[]{}, new String[]{}, false, 3, new String[][]{{"com.fasterxml.jackson.databind.deser.ValueInstantiator", "getValueTypeDesc", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{canCreateFromBoolean=false, canCreateFromDouble=false, canCreateFromInt=false, canCreateFromLong=false, canCreateFromObjectWith=false, canCreateFromString=false, canCreateUsingArrayDelegate=false, ca...#314#1636553649", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput192() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.std.StdValueInstantiator", "com.fasterxml.jackson.databind.deser.std.StdValueInstantiator", "configureFromStringCreator", new String[]{"com.fasterxml.jackson.databind.introspect.AnnotatedWithParams"}, new String[]{"<null>"}, false);
  assertNull(actual);
  assertEquals("receiver state after the call", "{canCreateFromBoolean=false, canCreateFromDouble=false, canCreateFromInt=false, canCreateFromLong=false, canCreateFromObjectWith=false, canCreateFromString=false, canCreateUsingArrayDelegate=false, ca...#299#-1213177389", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput193() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.std.StdValueInstantiator", "com.fasterxml.jackson.databind.deser.std.StdValueInstantiator", "rewrapCtorProblem", new String[]{"com.fasterxml.jackson.databind.DeserializationContext", "java.lang.Throwable"}, new String[]{"<sample:8>", "<sample:0>"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.deser.std.StdValueInstantiator", "configureFromLongCreator", "com.fasterxml.jackson.databind.introspect.AnnotatedWithParams", "<sample:7>"}});
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.databind.JsonMappingException", actual.getClass().getName());
  assertEquals("com.fasterxml.jackson.databind.JsonMappingException: Can not construct instance of java.lang.Object, problem: null {getLocalizedMessage=Can not construct instance of java.lang.Object, problem: nul.., ...#472#368045148", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{canCreateFromBoolean=false, canCreateFromDouble=false, canCreateFromInt=false, canCreateFromLong=true, canCreateFromObjectWith=false, canCreateFromString=false, canCreateUsingArrayDelegate=false, can...#297#1101176383", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput194() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.std.StdValueInstantiator", "com.fasterxml.jackson.databind.deser.std.StdValueInstantiator", "configureFromIntCreator", new String[]{"com.fasterxml.jackson.databind.introspect.AnnotatedWithParams"}, new String[]{"<sample:6>"}, false);
  assertNull(actual);
  assertEquals("receiver state after the call", "{canCreateFromBoolean=false, canCreateFromDouble=false, canCreateFromInt=true, canCreateFromLong=false, canCreateFromObjectWith=false, canCreateFromString=false, canCreateUsingArrayDelegate=false, can...#297#-865407687", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput195() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.std.StdValueInstantiator", "com.fasterxml.jackson.databind.deser.std.StdValueInstantiator", "getDelegateCreator", new String[]{}, new String[]{}, false, 4, new String[][]{{"com.fasterxml.jackson.databind.deser.std.StdValueInstantiator", "getArrayDelegateType", "com.fasterxml.jackson.databind.DeserializationConfig", "<sample:3>"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{canCreateFromBoolean=false, canCreateFromDouble=false, canCreateFromInt=false, canCreateFromLong=false, canCreateFromObjectWith=false, canCreateFromString=false, canCreateUsingArrayDelegate=false, ca...#309#-1951095057", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput196() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.ValueInstantiator", "com.fasterxml.jackson.databind.deser.ValueInstantiator$Base", "getIncompleteParameter", new String[]{}, new String[]{}, false, 5, new String[][]{{"com.fasterxml.jackson.databind.deser.ValueInstantiator", "canCreateUsingDelegate", ""}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{canCreateFromBoolean=false, canCreateFromDouble=false, canCreateFromInt=false, canCreateFromLong=false, canCreateFromObjectWith=false, canCreateFromString=false, canCreateUsingArrayDelegate=false, ca...#311#-229031103", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput197() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.ValueInstantiator", "com.fasterxml.jackson.databind.deser.ValueInstantiator$Base", "canCreateFromInt", new String[]{}, new String[]{}, false, 6, new String[][]{{"com.fasterxml.jackson.databind.deser.ValueInstantiator", "createUsingDelegate", "com.fasterxml.jackson.databind.DeserializationContext,java.lang.Object", "<sample:9>", "<d:3.0>"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{canCreateFromBoolean=false, canCreateFromDouble=false, canCreateFromInt=false, canCreateFromLong=false, canCreateFromObjectWith=false, canCreateFromString=false, canCreateUsingArrayDelegate=false, ca...#318#1611653153", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput198() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.std.StdValueInstantiator", "com.fasterxml.jackson.databind.deser.std.StdValueInstantiator", "getDelegateType", new String[]{"com.fasterxml.jackson.databind.DeserializationConfig"}, new String[]{"<sample:5>"}, false);
  assertNull(actual);
  assertEquals("receiver state after the call", "{canCreateFromBoolean=false, canCreateFromDouble=false, canCreateFromInt=false, canCreateFromLong=false, canCreateFromObjectWith=false, canCreateFromString=false, canCreateUsingArrayDelegate=false, ca...#299#-1213177389", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput199() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.ValueInstantiator", "com.fasterxml.jackson.databind.deser.ValueInstantiator$Base", "getDelegateCreator", new String[]{}, new String[]{}, false, 3, new String[][]{{"com.fasterxml.jackson.databind.deser.ValueInstantiator", "createFromObjectWith", "com.fasterxml.jackson.databind.DeserializationContext,com.fasterxml.jackson.databind.deser.SettableBeanProperty[],com.fasterxml.jackson.databind.deser.impl.PropertyValueBuffer", "<sample:3>", "<sample:3>", "<sample:9>"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{canCreateFromBoolean=false, canCreateFromDouble=false, canCreateFromInt=false, canCreateFromLong=false, canCreateFromObjectWith=false, canCreateFromString=false, canCreateUsingArrayDelegate=false, ca...#314#1636553649", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput200() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.std.StdValueInstantiator", "com.fasterxml.jackson.databind.deser.std.StdValueInstantiator", "getFromObjectArguments", new String[]{"com.fasterxml.jackson.databind.DeserializationConfig"}, new String[]{"<sample:5>"}, false, 5, new String[][]{{"com.fasterxml.jackson.databind.deser.std.StdValueInstantiator", "createFromBoolean", "com.fasterxml.jackson.databind.DeserializationContext,boolean", "<sample:2>", "true"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{canCreateFromBoolean=false, canCreateFromDouble=false, canCreateFromInt=false, canCreateFromLong=false, canCreateFromObjectWith=false, canCreateFromString=false, canCreateUsingArrayDelegate=false, ca...#300#1048321612", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput201() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.ValueInstantiator", "com.fasterxml.jackson.databind.deser.ValueInstantiator$Base", "canCreateFromString", new String[]{}, new String[]{}, false, 5, new String[][]{{"com.fasterxml.jackson.databind.deser.ValueInstantiator", "_createFromStringFallbacks", "com.fasterxml.jackson.databind.DeserializationContext,java.lang.String", "<sample:6>", "0x2F"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{canCreateFromBoolean=false, canCreateFromDouble=false, canCreateFromInt=false, canCreateFromLong=false, canCreateFromObjectWith=false, canCreateFromString=false, canCreateUsingArrayDelegate=false, ca...#311#-229031103", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput202() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.std.StdValueInstantiator", "com.fasterxml.jackson.databind.deser.std.StdValueInstantiator", "canCreateFromInt", new String[]{}, new String[]{}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.deser.std.StdValueInstantiator", "_createFromStringFallbacks", "com.fasterxml.jackson.databind.DeserializationContext,java.lang.String", "<sample:8>", "Title"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{canCreateFromBoolean=false, canCreateFromDouble=false, canCreateFromInt=false, canCreateFromLong=false, canCreateFromObjectWith=false, canCreateFromString=false, canCreateUsingArrayDelegate=false, ca...#299#-1213177389", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput203() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.std.StdValueInstantiator", "com.fasterxml.jackson.databind.deser.std.StdValueInstantiator", "getDelegateType", new String[]{"com.fasterxml.jackson.databind.DeserializationConfig"}, new String[]{"<sample:3>"}, false, 4, new String[][]{{"com.fasterxml.jackson.databind.deser.std.StdValueInstantiator", "canCreateFromObjectWith", ""}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{canCreateFromBoolean=false, canCreateFromDouble=false, canCreateFromInt=false, canCreateFromLong=false, canCreateFromObjectWith=false, canCreateFromString=false, canCreateUsingArrayDelegate=false, ca...#309#-1951095057", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput204() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.std.StdValueInstantiator", "com.fasterxml.jackson.databind.deser.std.StdValueInstantiator", "canInstantiate", new String[]{}, new String[]{}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.deser.std.StdValueInstantiator", "_createFromStringFallbacks", "com.fasterxml.jackson.databind.DeserializationContext,java.lang.String", "<sample:11>", " value failed:"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{canCreateFromBoolean=false, canCreateFromDouble=false, canCreateFromInt=false, canCreateFromLong=false, canCreateFromObjectWith=false, canCreateFromString=false, canCreateUsingArrayDelegate=false, ca...#299#-1213177389", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput205() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.ValueInstantiator", "com.fasterxml.jackson.databind.deser.ValueInstantiator$Base", "canCreateFromBoolean", new String[]{}, new String[]{}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.deser.ValueInstantiator", "getDefaultCreator", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{canCreateFromBoolean=false, canCreateFromDouble=false, canCreateFromInt=false, canCreateFromLong=false, canCreateFromObjectWith=false, canCreateFromString=false, canCreateUsingArrayDelegate=false, ca...#313#-516867540", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput206() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.ValueInstantiator", "com.fasterxml.jackson.databind.deser.ValueInstantiator$Base", "getWithArgsCreator", new String[]{}, new String[]{}, false, 1, new String[][]{});
  assertNull(actual);
  assertEquals("receiver state after the call", "{canCreateFromBoolean=false, canCreateFromDouble=false, canCreateFromInt=false, canCreateFromLong=false, canCreateFromObjectWith=false, canCreateFromString=false, canCreateUsingArrayDelegate=false, ca...#359#219967482", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput207() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.ValueInstantiator", "com.fasterxml.jackson.databind.deser.ValueInstantiator$Base", "getValueTypeDesc", new String[]{}, new String[]{}, false, 1, new String[][]{{"com.fasterxml.jackson.databind.deser.ValueInstantiator", "getArrayDelegateCreator", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("generated.algorithm.SearchInputFactory_scaffolding$GenericBase", String.valueOf(actual));
  assertEquals("receiver state after the call", "{canCreateFromBoolean=false, canCreateFromDouble=false, canCreateFromInt=false, canCreateFromLong=false, canCreateFromObjectWith=false, canCreateFromString=false, canCreateUsingArrayDelegate=false, ca...#359#219967482", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput208() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.ValueInstantiator", "com.fasterxml.jackson.databind.deser.ValueInstantiator$Base", "canCreateUsingDefault", new String[]{}, new String[]{}, false);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{canCreateFromBoolean=false, canCreateFromDouble=false, canCreateFromInt=false, canCreateFromLong=false, canCreateFromObjectWith=false, canCreateFromString=false, canCreateUsingArrayDelegate=false, ca...#313#-516867540", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput209() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.std.StdValueInstantiator", "com.fasterxml.jackson.databind.deser.std.StdValueInstantiator", "configureFromLongCreator", new String[]{"com.fasterxml.jackson.databind.introspect.AnnotatedWithParams"}, new String[]{"<sample:7>"}, false, 3, new String[][]{{"com.fasterxml.jackson.databind.deser.std.StdValueInstantiator", "canCreateFromBoolean", ""}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{canCreateFromBoolean=false, canCreateFromDouble=false, canCreateFromInt=false, canCreateFromLong=true, canCreateFromObjectWith=false, canCreateFromString=false, canCreateUsingArrayDelegate=false, can...#322#1656062198", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput210() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.ValueInstantiator", "com.fasterxml.jackson.databind.deser.ValueInstantiator$Base", "getArrayDelegateCreator", new String[]{}, new String[]{}, false, 1, new String[][]{{"com.fasterxml.jackson.databind.deser.ValueInstantiator", "getIncompleteParameter", ""}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{canCreateFromBoolean=false, canCreateFromDouble=false, canCreateFromInt=false, canCreateFromLong=false, canCreateFromObjectWith=false, canCreateFromString=false, canCreateUsingArrayDelegate=false, ca...#359#219967482", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput211() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.std.StdValueInstantiator", "com.fasterxml.jackson.databind.deser.std.StdValueInstantiator", "createFromBoolean", new String[]{"com.fasterxml.jackson.databind.DeserializationContext", "boolean"}, new String[]{"<sample:8>", "false"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.deser.std.StdValueInstantiator", "createFromString", "com.fasterxml.jackson.databind.DeserializationContext,java.lang.String", "<sample:12>", "TITL"}, {"com.fasterxml.jackson.databind.deser.std.StdValueInstantiator", "canCreateFromObjectWith", ""}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput212() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.std.StdValueInstantiator", "com.fasterxml.jackson.databind.deser.std.StdValueInstantiator", "createUsingArrayDelegate", new String[]{"com.fasterxml.jackson.databind.DeserializationContext", "java.lang.Object"}, new String[]{"<sample:9>", "<sample:0>"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.deser.std.StdValueInstantiator", "canCreateFromString", ""}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalStateException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput213() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.std.StdValueInstantiator", "com.fasterxml.jackson.databind.deser.std.StdValueInstantiator", "canCreateFromBoolean", new String[]{}, new String[]{}, false);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{canCreateFromBoolean=false, canCreateFromDouble=false, canCreateFromInt=false, canCreateFromLong=false, canCreateFromObjectWith=false, canCreateFromString=false, canCreateUsingArrayDelegate=false, ca...#299#-1213177389", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput214() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.std.StdValueInstantiator", "com.fasterxml.jackson.databind.deser.std.StdValueInstantiator", "getIncompleteParameter", new String[]{}, new String[]{}, false);
  assertNull(actual);
  assertEquals("receiver state after the call", "{canCreateFromBoolean=false, canCreateFromDouble=false, canCreateFromInt=false, canCreateFromLong=false, canCreateFromObjectWith=false, canCreateFromString=false, canCreateUsingArrayDelegate=false, ca...#299#-1213177389", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput215() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.std.StdValueInstantiator", "com.fasterxml.jackson.databind.deser.std.StdValueInstantiator", "canCreateUsingArrayDelegate", new String[]{}, new String[]{}, false, 7, new String[][]{{"com.fasterxml.jackson.databind.deser.std.StdValueInstantiator", "canCreateFromInt", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{canCreateFromBoolean=false, canCreateFromDouble=false, canCreateFromInt=false, canCreateFromLong=false, canCreateFromObjectWith=false, canCreateFromString=false, canCreateUsingArrayDelegate=false, ca...#329#-1747445055", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput216() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.std.StdValueInstantiator", "com.fasterxml.jackson.databind.deser.std.StdValueInstantiator", "canCreateFromDouble", new String[]{}, new String[]{}, false, 5, new String[][]{});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{canCreateFromBoolean=false, canCreateFromDouble=false, canCreateFromInt=false, canCreateFromLong=false, canCreateFromObjectWith=false, canCreateFromString=false, canCreateUsingArrayDelegate=false, ca...#300#1048321612", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput217() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.std.StdValueInstantiator", "com.fasterxml.jackson.databind.deser.std.StdValueInstantiator", "configureFromBooleanCreator", new String[]{"com.fasterxml.jackson.databind.introspect.AnnotatedWithParams"}, new String[]{"<sample:2>"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.deser.std.StdValueInstantiator", "createFromString", "com.fasterxml.jackson.databind.DeserializationContext,java.lang.String", "<sample:0>", "1.12345678"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{canCreateFromBoolean=true, canCreateFromDouble=false, canCreateFromInt=false, canCreateFromLong=false, canCreateFromObjectWith=false, canCreateFromString=false, canCreateUsingArrayDelegate=false, can...#297#1843058703", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput218() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.ValueInstantiator", "com.fasterxml.jackson.databind.deser.ValueInstantiator$Base", "canCreateUsingDelegate", new String[]{}, new String[]{}, false);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{canCreateFromBoolean=false, canCreateFromDouble=false, canCreateFromInt=false, canCreateFromLong=false, canCreateFromObjectWith=false, canCreateFromString=false, canCreateUsingArrayDelegate=false, ca...#313#-516867540", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput219() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.std.StdValueInstantiator", "com.fasterxml.jackson.databind.deser.std.StdValueInstantiator", "getValueClass", new String[]{}, new String[]{}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.deser.std.StdValueInstantiator", "configureFromIntCreator", "com.fasterxml.jackson.databind.introspect.AnnotatedWithParams", "<null>"}, {"com.fasterxml.jackson.databind.deser.std.StdValueInstantiator", "configureFromDoubleCreator", "com.fasterxml.jackson.databind.introspect.AnnotatedWithParams", "<sample:3>"}});
  assertNotNull(actual);
  assertEquals("java.lang.Class", actual.getClass().getName());
  assertEquals("class java.lang.Object {getAnnotatedInterfaces=[], getAnnotations=[], getCanonicalName=java.lang.Object, getClasses=[], getConstructors=[public java.lang.Object()], getDeclaredAnnotations=[], getDecla...#543#-946457427", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{canCreateFromBoolean=false, canCreateFromDouble=true, canCreateFromInt=false, canCreateFromLong=false, canCreateFromObjectWith=false, canCreateFromString=false, canCreateUsingArrayDelegate=false, can...#297#1988385727", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput220() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.std.StdValueInstantiator", "com.fasterxml.jackson.databind.deser.std.StdValueInstantiator", "configureFromStringCreator", new String[]{"com.fasterxml.jackson.databind.introspect.AnnotatedWithParams"}, new String[]{"<sample:6>"}, false);
  assertNull(actual);
  assertEquals("receiver state after the call", "{canCreateFromBoolean=false, canCreateFromDouble=false, canCreateFromInt=false, canCreateFromLong=false, canCreateFromObjectWith=false, canCreateFromString=true, canCreateUsingArrayDelegate=false, can...#297#1475595287", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput221() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.std.StdValueInstantiator", "com.fasterxml.jackson.databind.deser.std.StdValueInstantiator", "wrapException", new String[]{"java.lang.Throwable"}, new String[]{"<sample:3>"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.deser.std.StdValueInstantiator", "getWithArgsCreator", ""}}), new String[][]{{"getCause", "", "2"}});
  assertNotNull(actual);
  assertEquals("java.lang.Throwable", actual.getClass().getName());
  assertEquals("java.lang.Throwable:  {getLocalizedMessage=, getMessage=, getStackTrace=[java.base/jdk.internal.reflect.NativeConstructorAccessorImp.., getSuppressed=[]}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{canCreateFromBoolean=false, canCreateFromDouble=false, canCreateFromInt=false, canCreateFromLong=false, canCreateFromObjectWith=false, canCreateFromString=false, canCreateUsingArrayDelegate=false, ca...#299#-1213177389", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput222() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.ValueInstantiator", "com.fasterxml.jackson.databind.deser.ValueInstantiator$Base", "getArrayDelegateType", new String[]{"com.fasterxml.jackson.databind.DeserializationConfig"}, new String[]{"<sample:2>"}, false, 7, new String[][]{});
  assertNull(actual);
  assertEquals("receiver state after the call", "{canCreateFromBoolean=false, canCreateFromDouble=false, canCreateFromInt=false, canCreateFromLong=false, canCreateFromObjectWith=false, canCreateFromString=false, canCreateUsingArrayDelegate=false, ca...#316#-1594774090", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput223() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.std.StdValueInstantiator", "com.fasterxml.jackson.databind.deser.std.StdValueInstantiator", "canCreateUsingDefault", new String[]{}, new String[]{}, false, 1, new String[][]{{"com.fasterxml.jackson.databind.deser.std.StdValueInstantiator", "createFromObjectWith", "com.fasterxml.jackson.databind.DeserializationContext,java.lang.Object[]", "<sample:0>", "<empty>"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{canCreateFromBoolean=false, canCreateFromDouble=false, canCreateFromInt=false, canCreateFromLong=false, canCreateFromObjectWith=false, canCreateFromString=false, canCreateUsingArrayDelegate=false, ca...#346#-691812784", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput224() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.ValueInstantiator", "com.fasterxml.jackson.databind.deser.ValueInstantiator$Base", "canCreateFromObjectWith", new String[]{}, new String[]{}, false, 5, new String[][]{{"com.fasterxml.jackson.databind.deser.ValueInstantiator", "canCreateUsingDelegate", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{canCreateFromBoolean=false, canCreateFromDouble=false, canCreateFromInt=false, canCreateFromLong=false, canCreateFromObjectWith=false, canCreateFromString=false, canCreateUsingArrayDelegate=false, ca...#311#-229031103", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput225() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.std.StdValueInstantiator", "com.fasterxml.jackson.databind.deser.std.StdValueInstantiator", "wrapAsJsonMappingException", new String[]{"com.fasterxml.jackson.databind.DeserializationContext", "java.lang.Throwable"}, new String[]{"<null>", "<null>"}, false, 3, new String[][]{{"com.fasterxml.jackson.databind.deser.std.StdValueInstantiator", "canInstantiate", ""}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput226() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.std.StdValueInstantiator", "com.fasterxml.jackson.databind.deser.std.StdValueInstantiator", "canCreateFromInt", new String[]{}, new String[]{}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.deser.std.StdValueInstantiator", "configureFromLongCreator", "com.fasterxml.jackson.databind.introspect.AnnotatedWithParams", "<sample:4>"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{canCreateFromBoolean=false, canCreateFromDouble=false, canCreateFromInt=false, canCreateFromLong=true, canCreateFromObjectWith=false, canCreateFromString=false, canCreateUsingArrayDelegate=false, can...#297#1101176383", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput227() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.ValueInstantiator", "com.fasterxml.jackson.databind.deser.ValueInstantiator$Base", "canCreateFromBoolean", new String[]{}, new String[]{}, false, 6, new String[][]{{"com.fasterxml.jackson.databind.deser.ValueInstantiator", "canCreateFromInt", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{canCreateFromBoolean=false, canCreateFromDouble=false, canCreateFromInt=false, canCreateFromLong=false, canCreateFromObjectWith=false, canCreateFromString=false, canCreateUsingArrayDelegate=false, ca...#318#1611653153", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput228() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.std.StdValueInstantiator", "com.fasterxml.jackson.databind.deser.std.StdValueInstantiator", "canCreateFromString", new String[]{}, new String[]{}, false);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{canCreateFromBoolean=false, canCreateFromDouble=false, canCreateFromInt=false, canCreateFromLong=false, canCreateFromObjectWith=false, canCreateFromString=false, canCreateUsingArrayDelegate=false, ca...#299#-1213177389", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput229() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.std.StdValueInstantiator", "com.fasterxml.jackson.databind.deser.std.StdValueInstantiator", "getIncompleteParameter", new String[]{}, new String[]{}, false, 5, new String[][]{{"com.fasterxml.jackson.databind.deser.std.StdValueInstantiator", "wrapException", "java.lang.Throwable", "<sample:0>"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{canCreateFromBoolean=false, canCreateFromDouble=false, canCreateFromInt=false, canCreateFromLong=false, canCreateFromObjectWith=false, canCreateFromString=false, canCreateUsingArrayDelegate=false, ca...#300#1048321612", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput230() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.ValueInstantiator", "com.fasterxml.jackson.databind.deser.ValueInstantiator$Base", "getDefaultCreator", new String[]{}, new String[]{}, false, 1, new String[][]{{"com.fasterxml.jackson.databind.deser.ValueInstantiator", "createFromLong", "com.fasterxml.jackson.databind.DeserializationContext,long", "<sample:6>", "0"}, {"com.fasterxml.jackson.databind.deser.ValueInstantiator", "canCreateUsingDefault", ""}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{canCreateFromBoolean=false, canCreateFromDouble=false, canCreateFromInt=false, canCreateFromLong=false, canCreateFromObjectWith=false, canCreateFromString=false, canCreateUsingArrayDelegate=false, ca...#359#219967482", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput231() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.std.StdValueInstantiator", "com.fasterxml.jackson.databind.deser.std.StdValueInstantiator", "createFromDouble", new String[]{"com.fasterxml.jackson.databind.DeserializationContext", "double"}, new String[]{"<sample:11>", "Infinity"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.deser.std.StdValueInstantiator", "canCreateUsingDefault", ""}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("com.fasterxml.jackson.databind.JsonMappingException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput232() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.std.StdValueInstantiator", "com.fasterxml.jackson.databind.deser.std.StdValueInstantiator", "getWithArgsCreator", new String[]{}, new String[]{}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.deser.std.StdValueInstantiator", "getWithArgsCreator", ""}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{canCreateFromBoolean=false, canCreateFromDouble=false, canCreateFromInt=false, canCreateFromLong=false, canCreateFromObjectWith=false, canCreateFromString=false, canCreateUsingArrayDelegate=false, ca...#299#-1213177389", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput233() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.std.StdValueInstantiator", "com.fasterxml.jackson.databind.deser.std.StdValueInstantiator", "wrapAsJsonMappingException", new String[]{"com.fasterxml.jackson.databind.DeserializationContext", "java.lang.Throwable"}, new String[]{"<sample:0>", "<sample:1>"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.deser.std.StdValueInstantiator", "getWithArgsCreator", ""}});
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.databind.JsonMappingException", actual.getClass().getName());
  assertEquals("com.fasterxml.jackson.databind.JsonMappingException: Can not construct instance of java.lang.Object, problem: 0 {getLocalizedMessage=Can not construct instance of java.lang.Object, problem: 0, getMess...#457#-1921071880", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{canCreateFromBoolean=false, canCreateFromDouble=false, canCreateFromInt=false, canCreateFromLong=false, canCreateFromObjectWith=false, canCreateFromString=false, canCreateUsingArrayDelegate=false, ca...#299#-1213177389", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput234() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.std.StdValueInstantiator", "com.fasterxml.jackson.databind.deser.std.StdValueInstantiator", "getIncompleteParameter", new String[]{}, new String[]{}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.deser.std.StdValueInstantiator", "configureFromArraySettings", "com.fasterxml.jackson.databind.introspect.AnnotatedWithParams,com.fasterxml.jackson.databind.JavaType,com.fasterxml.jackson.databind.deser.SettableBeanProperty[]", "<null>", "<sample:3>", "<null>"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{canCreateFromBoolean=false, canCreateFromDouble=false, canCreateFromInt=false, canCreateFromLong=false, canCreateFromObjectWith=false, canCreateFromString=false, canCreateUsingArrayDelegate=true, can...#297#417376873", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput235() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.std.StdValueInstantiator", "com.fasterxml.jackson.databind.deser.std.StdValueInstantiator", "canCreateFromBoolean", new String[]{}, new String[]{}, false, 1, new String[][]{{"com.fasterxml.jackson.databind.deser.std.StdValueInstantiator", "canCreateFromBoolean", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{canCreateFromBoolean=false, canCreateFromDouble=false, canCreateFromInt=false, canCreateFromLong=false, canCreateFromObjectWith=false, canCreateFromString=false, canCreateUsingArrayDelegate=false, ca...#346#-691812784", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput236() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.std.StdValueInstantiator", "com.fasterxml.jackson.databind.deser.std.StdValueInstantiator", "canCreateFromInt", new String[]{}, new String[]{}, false, 5, new String[][]{{"com.fasterxml.jackson.databind.deser.std.StdValueInstantiator", "_createFromStringFallbacks", "com.fasterxml.jackson.databind.DeserializationContext,java.lang.String", "<sample:6>", "1L"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{canCreateFromBoolean=false, canCreateFromDouble=false, canCreateFromInt=false, canCreateFromLong=false, canCreateFromObjectWith=false, canCreateFromString=false, canCreateUsingArrayDelegate=false, ca...#300#1048321612", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput237() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.std.StdValueInstantiator", "com.fasterxml.jackson.databind.deser.std.StdValueInstantiator", "configureFromBooleanCreator", new String[]{"com.fasterxml.jackson.databind.introspect.AnnotatedWithParams"}, new String[]{"<sample:4>"}, false, 7, new String[][]{{"com.fasterxml.jackson.databind.deser.std.StdValueInstantiator", "createFromString", "com.fasterxml.jackson.databind.DeserializationContext,java.lang.String", "<sample:12>", "I1.5e300"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{canCreateFromBoolean=true, canCreateFromDouble=false, canCreateFromInt=false, canCreateFromLong=false, canCreateFromObjectWith=false, canCreateFromString=false, canCreateUsingArrayDelegate=false, can...#327#-614531075", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput238() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.std.StdValueInstantiator", "com.fasterxml.jackson.databind.deser.std.StdValueInstantiator", "createFromString", new String[]{"com.fasterxml.jackson.databind.DeserializationContext", "java.lang.String"}, new String[]{"<sample:12>", "1.5"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.deser.std.StdValueInstantiator", "canCreateUsingArrayDelegate", ""}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput239() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.std.StdValueInstantiator", "com.fasterxml.jackson.databind.deser.std.StdValueInstantiator", "unwrapAndWrapException", new String[]{"com.fasterxml.jackson.databind.DeserializationContext", "java.lang.Throwable"}, new String[]{"<sample:6>", "<sample:0>"}, false, 7, new String[][]{{"com.fasterxml.jackson.databind.deser.std.StdValueInstantiator", "wrapAsJsonMappingException", "com.fasterxml.jackson.databind.DeserializationContext,java.lang.Throwable", "<null>", "<sample:2>"}});
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.databind.JsonMappingException", actual.getClass().getName());
  assertEquals("com.fasterxml.jackson.databind.JsonMappingException: Can not construct instance of java.lang.String, problem: null {getLocalizedMessage=Can not construct instance of java.lang.String, problem: nul.., ...#472#-983453220", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{canCreateFromBoolean=false, canCreateFromDouble=false, canCreateFromInt=false, canCreateFromLong=false, canCreateFromObjectWith=false, canCreateFromString=false, canCreateUsingArrayDelegate=false, ca...#329#-1747445055", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput240() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.ValueInstantiator", "com.fasterxml.jackson.databind.deser.ValueInstantiator$Base", "canCreateFromDouble", new String[]{}, new String[]{}, false, 1, new String[][]{{"com.fasterxml.jackson.databind.deser.ValueInstantiator", "createUsingArrayDelegate", "com.fasterxml.jackson.databind.DeserializationContext,java.lang.Object", "<sample:0>", "<i:-2147483648>"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{canCreateFromBoolean=false, canCreateFromDouble=false, canCreateFromInt=false, canCreateFromLong=false, canCreateFromObjectWith=false, canCreateFromString=false, canCreateUsingArrayDelegate=false, ca...#359#219967482", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput241() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.ValueInstantiator", "com.fasterxml.jackson.databind.deser.ValueInstantiator$Base", "getFromObjectArguments", new String[]{"com.fasterxml.jackson.databind.DeserializationConfig"}, new String[]{"<sample:4>"}, false, 7, new String[][]{{"com.fasterxml.jackson.databind.deser.ValueInstantiator", "createFromBoolean", "com.fasterxml.jackson.databind.DeserializationContext,boolean", "<sample:6>", "true"}, {"com.fasterxml.jackson.databind.deser.ValueInstantiator", "createUsingDelegate", "com.fasterxml.jackson.databind.DeserializationContext,java.lang.Object", "<sample:3>", "<sample:1>"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{canCreateFromBoolean=false, canCreateFromDouble=false, canCreateFromInt=false, canCreateFromLong=false, canCreateFromObjectWith=false, canCreateFromString=false, canCreateUsingArrayDelegate=false, ca...#316#-1594774090", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput242() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.std.StdValueInstantiator", "com.fasterxml.jackson.databind.deser.std.StdValueInstantiator", "canCreateFromInt", new String[]{}, new String[]{}, false, 3, new String[][]{{"com.fasterxml.jackson.databind.deser.std.StdValueInstantiator", "createUsingDelegate", "com.fasterxml.jackson.databind.DeserializationContext,java.lang.Object", "<sample:15>", "<i:0>"}, {"com.fasterxml.jackson.databind.deser.std.StdValueInstantiator", "createFromLong", "com.fasterxml.jackson.databind.DeserializationContext,long", "<sample:9>", "-9223372036854775808"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{canCreateFromBoolean=false, canCreateFromDouble=false, canCreateFromInt=false, canCreateFromLong=false, canCreateFromObjectWith=false, canCreateFromString=false, canCreateUsingArrayDelegate=false, ca...#324#-2126697502", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput243() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.ValueInstantiator", "com.fasterxml.jackson.databind.deser.ValueInstantiator$Base", "canCreateFromObjectWith", new String[]{}, new String[]{}, false, 4, new String[][]{{"com.fasterxml.jackson.databind.deser.ValueInstantiator", "getDelegateType", "com.fasterxml.jackson.databind.DeserializationConfig", "<sample:0>"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{canCreateFromBoolean=false, canCreateFromDouble=false, canCreateFromInt=false, canCreateFromLong=false, canCreateFromObjectWith=false, canCreateFromString=false, canCreateUsingArrayDelegate=false, ca...#318#1611653153", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput244() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.std.StdValueInstantiator", "com.fasterxml.jackson.databind.deser.std.StdValueInstantiator", "canCreateUsingDefault", new String[]{}, new String[]{}, false);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{canCreateFromBoolean=false, canCreateFromDouble=false, canCreateFromInt=false, canCreateFromLong=false, canCreateFromObjectWith=false, canCreateFromString=false, canCreateUsingArrayDelegate=false, ca...#299#-1213177389", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput245() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.std.StdValueInstantiator", "com.fasterxml.jackson.databind.deser.std.StdValueInstantiator", "getFromObjectArguments", new String[]{"com.fasterxml.jackson.databind.DeserializationConfig"}, new String[]{"<sample:6>"}, false);
  assertNull(actual);
  assertEquals("receiver state after the call", "{canCreateFromBoolean=false, canCreateFromDouble=false, canCreateFromInt=false, canCreateFromLong=false, canCreateFromObjectWith=false, canCreateFromString=false, canCreateUsingArrayDelegate=false, ca...#299#-1213177389", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput246() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.std.StdValueInstantiator", "com.fasterxml.jackson.databind.deser.std.StdValueInstantiator", "configureIncompleteParameter", new String[]{"com.fasterxml.jackson.databind.introspect.AnnotatedParameter"}, new String[]{"<null>"}, false);
  assertNull(actual);
  assertEquals("receiver state after the call", "{canCreateFromBoolean=false, canCreateFromDouble=false, canCreateFromInt=false, canCreateFromLong=false, canCreateFromObjectWith=false, canCreateFromString=false, canCreateUsingArrayDelegate=false, ca...#299#-1213177389", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput247() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.ValueInstantiator", "com.fasterxml.jackson.databind.deser.ValueInstantiator$Base", "canCreateFromBoolean", new String[]{}, new String[]{}, false, 5, new String[][]{});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{canCreateFromBoolean=false, canCreateFromDouble=false, canCreateFromInt=false, canCreateFromLong=false, canCreateFromObjectWith=false, canCreateFromString=false, canCreateUsingArrayDelegate=false, ca...#311#-229031103", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput248() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.std.StdValueInstantiator", "com.fasterxml.jackson.databind.deser.std.StdValueInstantiator", "getWithArgsCreator", new String[]{}, new String[]{}, false, 1, new String[][]{{"com.fasterxml.jackson.databind.deser.std.StdValueInstantiator", "getDelegateType", "com.fasterxml.jackson.databind.DeserializationConfig", "<sample:7>"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{canCreateFromBoolean=false, canCreateFromDouble=false, canCreateFromInt=false, canCreateFromLong=false, canCreateFromObjectWith=false, canCreateFromString=false, canCreateUsingArrayDelegate=false, ca...#346#-691812784", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput249() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.ValueInstantiator", "com.fasterxml.jackson.databind.deser.ValueInstantiator$Base", "getArrayDelegateType", new String[]{"com.fasterxml.jackson.databind.DeserializationConfig"}, new String[]{"<sample:7>"}, false, 3, new String[][]{});
  assertNull(actual);
  assertEquals("receiver state after the call", "{canCreateFromBoolean=false, canCreateFromDouble=false, canCreateFromInt=false, canCreateFromLong=false, canCreateFromObjectWith=false, canCreateFromString=false, canCreateUsingArrayDelegate=false, ca...#314#1636553649", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput250() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.std.StdValueInstantiator", "com.fasterxml.jackson.databind.deser.std.StdValueInstantiator", "canCreateFromLong", new String[]{}, new String[]{}, false, 7, new String[][]{{"com.fasterxml.jackson.databind.deser.std.StdValueInstantiator", "getValueTypeDesc", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{canCreateFromBoolean=false, canCreateFromDouble=false, canCreateFromInt=false, canCreateFromLong=false, canCreateFromObjectWith=false, canCreateFromString=false, canCreateUsingArrayDelegate=false, ca...#329#-1747445055", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput251() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.ValueInstantiator", "com.fasterxml.jackson.databind.deser.ValueInstantiator$Base", "getIncompleteParameter", new String[]{}, new String[]{}, false, 1, new String[][]{{"com.fasterxml.jackson.databind.deser.ValueInstantiator", "canCreateUsingArrayDelegate", ""}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{canCreateFromBoolean=false, canCreateFromDouble=false, canCreateFromInt=false, canCreateFromLong=false, canCreateFromObjectWith=false, canCreateFromString=false, canCreateUsingArrayDelegate=false, ca...#359#219967482", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput252() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.std.StdValueInstantiator", "com.fasterxml.jackson.databind.deser.std.StdValueInstantiator", "configureFromObjectSettings", new String[]{"com.fasterxml.jackson.databind.introspect.AnnotatedWithParams", "com.fasterxml.jackson.databind.introspect.AnnotatedWithParams", "com.fasterxml.jackson.databind.JavaType", "com.fasterxml.jackson.databind.deser.SettableBeanProperty[]", "com.fasterxml.jackson.databind.introspect.AnnotatedWithParams", "com.fasterxml.jackson.databind.deser.SettableBeanProperty[]"}, new String[]{"<sample:5>", "<sample:3>", "<sample:4>", "<sample:4>", "<sample:1>", "<null>"}, false);
  assertNull(actual);
  assertEquals("receiver state after the call", "{canCreateFromBoolean=false, canCreateFromDouble=false, canCreateFromInt=false, canCreateFromLong=false, canCreateFromObjectWith=true, canCreateFromString=false, canCreateUsingArrayDelegate=false, can...#295#-1741164875", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput253() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.ValueInstantiator", "com.fasterxml.jackson.databind.deser.ValueInstantiator$Base", "canCreateFromString", new String[]{}, new String[]{}, false, 1, new String[][]{{"com.fasterxml.jackson.databind.deser.ValueInstantiator", "createFromInt", "com.fasterxml.jackson.databind.DeserializationContext,int", "<sample:7>", "0"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{canCreateFromBoolean=false, canCreateFromDouble=false, canCreateFromInt=false, canCreateFromLong=false, canCreateFromObjectWith=false, canCreateFromString=false, canCreateUsingArrayDelegate=false, ca...#359#219967482", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput254() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.std.StdValueInstantiator", "com.fasterxml.jackson.databind.deser.std.StdValueInstantiator", "configureFromLongCreator", new String[]{"com.fasterxml.jackson.databind.introspect.AnnotatedWithParams"}, new String[]{"<sample:2>"}, false, 1, new String[][]{});
  assertNull(actual);
  assertEquals("receiver state after the call", "{canCreateFromBoolean=false, canCreateFromDouble=false, canCreateFromInt=false, canCreateFromLong=true, canCreateFromObjectWith=false, canCreateFromString=false, canCreateUsingArrayDelegate=false, can...#344#301880420", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput255() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.ValueInstantiator", "com.fasterxml.jackson.databind.deser.ValueInstantiator$Base", "getDelegateCreator", new String[]{}, new String[]{}, false, 1, new String[][]{{"com.fasterxml.jackson.databind.deser.ValueInstantiator", "canInstantiate", ""}, {"com.fasterxml.jackson.databind.deser.ValueInstantiator", "createFromObjectWith", "com.fasterxml.jackson.databind.DeserializationContext,java.lang.Object[]", "<sample:1>", "<empty>"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{canCreateFromBoolean=false, canCreateFromDouble=false, canCreateFromInt=false, canCreateFromLong=false, canCreateFromObjectWith=false, canCreateFromString=false, canCreateUsingArrayDelegate=false, ca...#359#219967482", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput256() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.ValueInstantiator", "com.fasterxml.jackson.databind.deser.ValueInstantiator$Base", "getFromObjectArguments", new String[]{"com.fasterxml.jackson.databind.DeserializationConfig"}, new String[]{"<sample:6>"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.deser.ValueInstantiator", "canCreateFromObjectWith", ""}}, 3);
  assertNull(actual);
  assertEquals("receiver state after the call", "{canCreateFromBoolean=false, canCreateFromDouble=false, canCreateFromInt=false, canCreateFromLong=false, canCreateFromObjectWith=false, canCreateFromString=false, canCreateUsingArrayDelegate=false, ca...#313#-516867540", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput257() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.std.StdValueInstantiator", "com.fasterxml.jackson.databind.deser.std.StdValueInstantiator", "getIncompleteParameter", new String[]{}, new String[]{}, false, 1, new String[][]{{"com.fasterxml.jackson.databind.deser.std.StdValueInstantiator", "configureFromArraySettings", "com.fasterxml.jackson.databind.introspect.AnnotatedWithParams,com.fasterxml.jackson.databind.JavaType,com.fasterxml.jackson.databind.deser.SettableBeanProperty[]", "<sample:1>", "<sample:0>", "<sample:0>"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{canCreateFromBoolean=false, canCreateFromDouble=false, canCreateFromInt=false, canCreateFromLong=false, canCreateFromObjectWith=false, canCreateFromString=false, canCreateUsingArrayDelegate=true, can...#344#-1982507270", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput258() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.std.StdValueInstantiator", "com.fasterxml.jackson.databind.deser.std.StdValueInstantiator", "canCreateUsingDelegate", new String[]{}, new String[]{}, false, 1, new String[][]{{"com.fasterxml.jackson.databind.deser.std.StdValueInstantiator", "createFromLong", "com.fasterxml.jackson.databind.DeserializationContext,long", "<sample:16>", "4611686018427387903"}, {"com.fasterxml.jackson.databind.deser.std.StdValueInstantiator", "configureFromObjectSettings", "com.fasterxml.jackson.databind.introspect.AnnotatedWithParams,com.fasterxml.jackson.databind.introspect.AnnotatedWithParams,com.fasterxml.jackson.databind.JavaType,com.fasterxml.jackson.databind.deser.SettableBeanProperty[],com.fasterxml.jackson.databind.introspect.AnnotatedWithParams,com.fasterxml.jackson.databind.deser.SettableBeanProperty[]", "<sample:3>", "<sample:2>", "<sample:0>", "<sample:2>", "<sample:3>", "<sample:0>"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
  assertEquals("receiver state after the call", "{canCreateFromBoolean=false, canCreateFromDouble=false, canCreateFromInt=false, canCreateFromLong=false, canCreateFromObjectWith=true, canCreateFromString=false, canCreateUsingArrayDelegate=false, can...#342#684040494", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput259() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.std.StdValueInstantiator", "com.fasterxml.jackson.databind.deser.std.StdValueInstantiator", "configureFromObjectSettings", new String[]{"com.fasterxml.jackson.databind.introspect.AnnotatedWithParams", "com.fasterxml.jackson.databind.introspect.AnnotatedWithParams", "com.fasterxml.jackson.databind.JavaType", "com.fasterxml.jackson.databind.deser.SettableBeanProperty[]", "com.fasterxml.jackson.databind.introspect.AnnotatedWithParams", "com.fasterxml.jackson.databind.deser.SettableBeanProperty[]"}, new String[]{"<sample:3>", "<sample:1>", "<sample:1>", "<sample:7>", "<sample:7>", "<sample:2>"}, false, 0, null, 1);
  assertNull(actual);
  assertEquals("receiver state after the call", "{canCreateFromBoolean=false, canCreateFromDouble=false, canCreateFromInt=false, canCreateFromLong=false, canCreateFromObjectWith=true, canCreateFromString=false, canCreateUsingArrayDelegate=false, can...#295#-1741164875", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput260() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.ValueInstantiator", "com.fasterxml.jackson.databind.deser.ValueInstantiator$Base", "getDefaultCreator", new String[]{}, new String[]{}, false, 4, new String[][]{{"com.fasterxml.jackson.databind.deser.ValueInstantiator", "createUsingDefault", "com.fasterxml.jackson.databind.DeserializationContext", "<sample:7>"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{canCreateFromBoolean=false, canCreateFromDouble=false, canCreateFromInt=false, canCreateFromLong=false, canCreateFromObjectWith=false, canCreateFromString=false, canCreateUsingArrayDelegate=false, ca...#318#1611653153", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput261() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.ValueInstantiator", "com.fasterxml.jackson.databind.deser.ValueInstantiator$Base", "createFromInt", new String[]{"com.fasterxml.jackson.databind.DeserializationContext", "int"}, new String[]{"<sample:6>", "-2147483648"}, false, 4, new String[][]{{"com.fasterxml.jackson.databind.deser.ValueInstantiator", "getDelegateType", "com.fasterxml.jackson.databind.DeserializationConfig", "<sample:1>"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput262() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.std.StdValueInstantiator", "com.fasterxml.jackson.databind.deser.std.StdValueInstantiator", "getArrayDelegateType", new String[]{"com.fasterxml.jackson.databind.DeserializationConfig"}, new String[]{"<sample:0>"}, false, 0, null, 1);
  assertNull(actual);
  assertEquals("receiver state after the call", "{canCreateFromBoolean=false, canCreateFromDouble=false, canCreateFromInt=false, canCreateFromLong=false, canCreateFromObjectWith=false, canCreateFromString=false, canCreateUsingArrayDelegate=false, ca...#299#-1213177389", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput263() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.std.StdValueInstantiator", "com.fasterxml.jackson.databind.deser.std.StdValueInstantiator", "canCreateUsingDefault", new String[]{}, new String[]{}, false, 7, new String[][]{{"com.fasterxml.jackson.databind.deser.std.StdValueInstantiator", "canCreateUsingDelegate", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{canCreateFromBoolean=false, canCreateFromDouble=false, canCreateFromInt=false, canCreateFromLong=false, canCreateFromObjectWith=false, canCreateFromString=false, canCreateUsingArrayDelegate=false, ca...#329#-1747445055", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput264() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.std.StdValueInstantiator", "com.fasterxml.jackson.databind.deser.std.StdValueInstantiator", "_createFromStringFallbacks", new String[]{"com.fasterxml.jackson.databind.DeserializationContext", "java.lang.String"}, new String[]{"<sample:4>", "1.25abc"}, false, 5, new String[][]{}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput265() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.std.StdValueInstantiator", "com.fasterxml.jackson.databind.deser.std.StdValueInstantiator", "canCreateUsingDelegate", new String[]{}, new String[]{}, false, 6, new String[][]{{"com.fasterxml.jackson.databind.deser.std.StdValueInstantiator", "createFromLong", "com.fasterxml.jackson.databind.DeserializationContext,long", "<sample:4>", "-9223372036854775743"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{canCreateFromBoolean=false, canCreateFromDouble=false, canCreateFromInt=false, canCreateFromLong=false, canCreateFromObjectWith=false, canCreateFromString=false, canCreateUsingArrayDelegate=false, ca...#309#-1951095057", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput266() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.std.StdValueInstantiator", "com.fasterxml.jackson.databind.deser.std.StdValueInstantiator", "configureFromIntCreator", new String[]{"com.fasterxml.jackson.databind.introspect.AnnotatedWithParams"}, new String[]{"<sample:2>"}, false, 4, new String[][]{{"com.fasterxml.jackson.databind.deser.std.StdValueInstantiator", "getValueTypeDesc", ""}, {"com.fasterxml.jackson.databind.deser.std.StdValueInstantiator", "configureFromLongCreator", "com.fasterxml.jackson.databind.introspect.AnnotatedWithParams", "<sample:6>"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{canCreateFromBoolean=false, canCreateFromDouble=false, canCreateFromInt=true, canCreateFromLong=true, canCreateFromObjectWith=false, canCreateFromString=false, canCreateUsingArrayDelegate=false, canC...#306#1029359740", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput267() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.std.StdValueInstantiator", "com.fasterxml.jackson.databind.deser.std.StdValueInstantiator", "configureFromObjectSettings", new String[]{"com.fasterxml.jackson.databind.introspect.AnnotatedWithParams", "com.fasterxml.jackson.databind.introspect.AnnotatedWithParams", "com.fasterxml.jackson.databind.JavaType", "com.fasterxml.jackson.databind.deser.SettableBeanProperty[]", "com.fasterxml.jackson.databind.introspect.AnnotatedWithParams", "com.fasterxml.jackson.databind.deser.SettableBeanProperty[]"}, new String[]{"<sample:4>", "<sample:7>", "<sample:3>", "<sample:5>", "<sample:1>", "<null>"}, false, 3, new String[][]{{"com.fasterxml.jackson.databind.deser.std.StdValueInstantiator", "createFromBoolean", "com.fasterxml.jackson.databind.DeserializationContext,boolean", "<sample:2>", "false"}, {"com.fasterxml.jackson.databind.deser.std.StdValueInstantiator", "wrapException", "java.lang.Throwable", "<empty>"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{canCreateFromBoolean=false, canCreateFromDouble=false, canCreateFromInt=false, canCreateFromLong=false, canCreateFromObjectWith=true, canCreateFromString=false, canCreateUsingArrayDelegate=false, can...#320#-236551872", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput268() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.std.StdValueInstantiator", "com.fasterxml.jackson.databind.deser.std.StdValueInstantiator", "configureFromIntCreator", new String[]{"com.fasterxml.jackson.databind.introspect.AnnotatedWithParams"}, new String[]{"<sample:3>"}, false, 4, new String[][]{}, 2);
  assertNull(actual);
  assertEquals("receiver state after the call", "{canCreateFromBoolean=false, canCreateFromDouble=false, canCreateFromInt=true, canCreateFromLong=false, canCreateFromObjectWith=false, canCreateFromString=false, canCreateUsingArrayDelegate=false, can...#307#1878741", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput269() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.std.StdValueInstantiator", "com.fasterxml.jackson.databind.deser.std.StdValueInstantiator", "createFromObjectWith", new String[]{"com.fasterxml.jackson.databind.DeserializationContext", "java.lang.Object[]"}, new String[]{"<sample:1>", "<sample:2>"}, false, 5, new String[][]{{"com.fasterxml.jackson.databind.deser.std.StdValueInstantiator", "getWithArgsCreator", ""}}, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput270() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.std.StdValueInstantiator", "com.fasterxml.jackson.databind.deser.std.StdValueInstantiator", "canCreateFromDouble", new String[]{}, new String[]{}, false, 0, null, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{canCreateFromBoolean=false, canCreateFromDouble=false, canCreateFromInt=false, canCreateFromLong=false, canCreateFromObjectWith=false, canCreateFromString=false, canCreateUsingArrayDelegate=false, ca...#299#-1213177389", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput271() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.std.StdValueInstantiator", "com.fasterxml.jackson.databind.deser.std.StdValueInstantiator", "canInstantiate", new String[]{}, new String[]{}, false, 6, new String[][]{{"com.fasterxml.jackson.databind.deser.std.StdValueInstantiator", "createUsingDefault", "com.fasterxml.jackson.databind.DeserializationContext", "<sample:12>"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{canCreateFromBoolean=false, canCreateFromDouble=false, canCreateFromInt=false, canCreateFromLong=false, canCreateFromObjectWith=false, canCreateFromString=false, canCreateUsingArrayDelegate=false, ca...#309#-1951095057", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput272() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.std.StdValueInstantiator", "com.fasterxml.jackson.databind.deser.std.StdValueInstantiator", "configureFromDoubleCreator", new String[]{"com.fasterxml.jackson.databind.introspect.AnnotatedWithParams"}, new String[]{"<sample:2>"}, false, 6, new String[][]{{"com.fasterxml.jackson.databind.deser.std.StdValueInstantiator", "getDelegateCreator", ""}}, 1);
  assertNull(actual);
  assertEquals("receiver state after the call", "{canCreateFromBoolean=false, canCreateFromDouble=true, canCreateFromInt=false, canCreateFromLong=false, canCreateFromObjectWith=false, canCreateFromString=false, canCreateUsingArrayDelegate=false, can...#307#-746968613", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput273() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.std.StdValueInstantiator", "com.fasterxml.jackson.databind.deser.std.StdValueInstantiator", "configureFromObjectSettings", new String[]{"com.fasterxml.jackson.databind.introspect.AnnotatedWithParams", "com.fasterxml.jackson.databind.introspect.AnnotatedWithParams", "com.fasterxml.jackson.databind.JavaType", "com.fasterxml.jackson.databind.deser.SettableBeanProperty[]", "com.fasterxml.jackson.databind.introspect.AnnotatedWithParams", "com.fasterxml.jackson.databind.deser.SettableBeanProperty[]"}, new String[]{"<sample:0>", "<sample:1>", "<null>", "<sample:3>", "<sample:4>", "<sample:3>"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.deser.std.StdValueInstantiator", "canCreateFromInt", ""}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{canCreateFromBoolean=false, canCreateFromDouble=false, canCreateFromInt=false, canCreateFromLong=false, canCreateFromObjectWith=true, canCreateFromString=false, canCreateUsingArrayDelegate=false, can...#296#-1063538864", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput274() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.std.StdValueInstantiator", "com.fasterxml.jackson.databind.deser.std.StdValueInstantiator", "canInstantiate", new String[]{}, new String[]{}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.deser.std.StdValueInstantiator", "canCreateFromString", ""}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{canCreateFromBoolean=false, canCreateFromDouble=false, canCreateFromInt=false, canCreateFromLong=false, canCreateFromObjectWith=false, canCreateFromString=false, canCreateUsingArrayDelegate=false, ca...#299#-1213177389", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput275() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.std.StdValueInstantiator", "com.fasterxml.jackson.databind.deser.std.StdValueInstantiator", "wrapException", new String[]{"java.lang.Throwable"}, new String[]{"<sample:4>"}, false, 4, new String[][]{{"com.fasterxml.jackson.databind.deser.std.StdValueInstantiator", "createFromLong", "com.fasterxml.jackson.databind.DeserializationContext,long", "<sample:7>", "-9223372036846387200"}});
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.databind.JsonMappingException", actual.getClass().getName());
  assertEquals("com.fasterxml.jackson.databind.JsonMappingException: Instantiation of UNKNOWN TYPE value failed: a {getLocalizedMessage=Instantiation of UNKNOWN TYPE value failed: a, getMessage=Instantiation of UNKNO...#405#1863108983", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{canCreateFromBoolean=false, canCreateFromDouble=false, canCreateFromInt=false, canCreateFromLong=false, canCreateFromObjectWith=false, canCreateFromString=false, canCreateUsingArrayDelegate=false, ca...#309#-1951095057", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput276() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.ValueInstantiator", "com.fasterxml.jackson.databind.deser.ValueInstantiator$Base", "getDelegateCreator", new String[]{}, new String[]{}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.deser.ValueInstantiator", "createFromString", "com.fasterxml.jackson.databind.DeserializationContext,java.lang.String", "<sample:5>", "2147483648"}}, 3);
  assertNull(actual);
  assertEquals("receiver state after the call", "{canCreateFromBoolean=false, canCreateFromDouble=false, canCreateFromInt=false, canCreateFromLong=false, canCreateFromObjectWith=false, canCreateFromString=false, canCreateUsingArrayDelegate=false, ca...#313#-516867540", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput277() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.std.StdValueInstantiator", "com.fasterxml.jackson.databind.deser.std.StdValueInstantiator", "getDelegateCreator", new String[]{}, new String[]{}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.deser.std.StdValueInstantiator", "getDelegateType", "com.fasterxml.jackson.databind.DeserializationConfig", "<sample:5>"}, {"com.fasterxml.jackson.databind.deser.std.StdValueInstantiator", "getValueTypeDesc", ""}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{canCreateFromBoolean=false, canCreateFromDouble=false, canCreateFromInt=false, canCreateFromLong=false, canCreateFromObjectWith=false, canCreateFromString=false, canCreateUsingArrayDelegate=false, ca...#299#-1213177389", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput278() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.std.StdValueInstantiator", "com.fasterxml.jackson.databind.deser.std.StdValueInstantiator", "getArrayDelegateType", new String[]{"com.fasterxml.jackson.databind.DeserializationConfig"}, new String[]{"<sample:5>"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.deser.std.StdValueInstantiator", "configureFromArraySettings", "com.fasterxml.jackson.databind.introspect.AnnotatedWithParams,com.fasterxml.jackson.databind.JavaType,com.fasterxml.jackson.databind.deser.SettableBeanProperty[]", "<sample:2>", "<sample:0>", "<sample:0>"}});
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.databind.type.ArrayType", actual.getClass().getName());
  assertEquals("[array type, component type: $0] {getErasedSignature=[$0, getGenericSignature=[$0, getTypeName=[array type, component type: $0], hasContentType=true, hasGenericTypes=false, hasHandlers=true, hasValueH...#390#725501520", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{canCreateFromBoolean=false, canCreateFromDouble=false, canCreateFromInt=false, canCreateFromLong=false, canCreateFromObjectWith=false, canCreateFromString=false, canCreateUsingArrayDelegate=true, can...#297#417376873", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput279() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.ValueInstantiator", "com.fasterxml.jackson.databind.deser.ValueInstantiator$Base", "getWithArgsCreator", new String[]{}, new String[]{}, false, 5, new String[][]{{"com.fasterxml.jackson.databind.deser.ValueInstantiator", "canCreateFromInt", ""}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{canCreateFromBoolean=false, canCreateFromDouble=false, canCreateFromInt=false, canCreateFromLong=false, canCreateFromObjectWith=false, canCreateFromString=false, canCreateUsingArrayDelegate=false, ca...#311#-229031103", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput280() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.std.StdValueInstantiator", "com.fasterxml.jackson.databind.deser.std.StdValueInstantiator", "wrapException", new String[]{"java.lang.Throwable"}, new String[]{"<sample:0>"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.deser.std.StdValueInstantiator", "createFromString", "com.fasterxml.jackson.databind.DeserializationContext,java.lang.String", "<sample:4>", "{\"a!:1"}, {"com.fasterxml.jackson.databind.deser.std.StdValueInstantiator", "configureFromStringCreator", "com.fasterxml.jackson.databind.introspect.AnnotatedWithParams", "<sample:5>"}}, 1), new String[][]{{"prependPath", "com.fasterxml.jackson.databind.JsonMappingException$Reference", "4"}});
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.databind.JsonMappingException", actual.getClass().getName());
  assertEquals("com.fasterxml.jackson.databind.JsonMappingException: Instantiation of $0 value failed: null (through reference chain: UNKNOWN[?]) {getLocalizedMessage=Instantiation of $0 value failed: null (through r...#473#-1595761995", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{canCreateFromBoolean=false, canCreateFromDouble=false, canCreateFromInt=false, canCreateFromLong=false, canCreateFromObjectWith=false, canCreateFromString=true, canCreateUsingArrayDelegate=false, can...#297#1475595287", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput281() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.ValueInstantiator", "com.fasterxml.jackson.databind.deser.ValueInstantiator$Base", "getIncompleteParameter", new String[]{}, new String[]{}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.deser.ValueInstantiator", "createUsingArrayDelegate", "com.fasterxml.jackson.databind.DeserializationContext,java.lang.Object", "<sample:7>", "<sample:1>"}}, 2);
  assertNull(actual);
  assertEquals("receiver state after the call", "{canCreateFromBoolean=false, canCreateFromDouble=false, canCreateFromInt=false, canCreateFromLong=false, canCreateFromObjectWith=false, canCreateFromString=false, canCreateUsingArrayDelegate=false, ca...#313#-516867540", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput282() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.std.StdValueInstantiator", "com.fasterxml.jackson.databind.deser.std.StdValueInstantiator", "configureIncompleteParameter", new String[]{"com.fasterxml.jackson.databind.introspect.AnnotatedParameter"}, new String[]{"<sample:1>"}, false, 7, new String[][]{{"com.fasterxml.jackson.databind.deser.std.StdValueInstantiator", "getDelegateCreator", ""}, {"com.fasterxml.jackson.databind.deser.std.StdValueInstantiator", "configureFromBooleanCreator", "com.fasterxml.jackson.databind.introspect.AnnotatedWithParams", "<null>"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{canCreateFromBoolean=false, canCreateFromDouble=false, canCreateFromInt=false, canCreateFromLong=false, canCreateFromObjectWith=false, canCreateFromString=false, canCreateUsingArrayDelegate=false, ca...#329#-1747445055", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput283() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.ValueInstantiator", "com.fasterxml.jackson.databind.deser.ValueInstantiator$Base", "getArrayDelegateType", new String[]{"com.fasterxml.jackson.databind.DeserializationConfig"}, new String[]{"<sample:0>"}, false, 7, new String[][]{{"com.fasterxml.jackson.databind.deser.ValueInstantiator", "canInstantiate", ""}}, 2);
  assertNull(actual);
  assertEquals("receiver state after the call", "{canCreateFromBoolean=false, canCreateFromDouble=false, canCreateFromInt=false, canCreateFromLong=false, canCreateFromObjectWith=false, canCreateFromString=false, canCreateUsingArrayDelegate=false, ca...#316#-1594774090", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput284() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.std.StdValueInstantiator", "com.fasterxml.jackson.databind.deser.std.StdValueInstantiator", "configureFromLongCreator", new String[]{"com.fasterxml.jackson.databind.introspect.AnnotatedWithParams"}, new String[]{"<null>"}, false, 3, new String[][]{{"com.fasterxml.jackson.databind.deser.std.StdValueInstantiator", "getValueTypeDesc", ""}}, 1);
  assertNull(actual);
  assertEquals("receiver state after the call", "{canCreateFromBoolean=false, canCreateFromDouble=false, canCreateFromInt=false, canCreateFromLong=false, canCreateFromObjectWith=false, canCreateFromString=false, canCreateUsingArrayDelegate=false, ca...#324#-2126697502", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput285() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.ValueInstantiator", "com.fasterxml.jackson.databind.deser.ValueInstantiator$Base", "getDelegateType", new String[]{"com.fasterxml.jackson.databind.DeserializationConfig"}, new String[]{"<sample:6>"}, false, 6, new String[][]{{"com.fasterxml.jackson.databind.deser.ValueInstantiator", "canCreateUsingDelegate", ""}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{canCreateFromBoolean=false, canCreateFromDouble=false, canCreateFromInt=false, canCreateFromLong=false, canCreateFromObjectWith=false, canCreateFromString=false, canCreateUsingArrayDelegate=false, ca...#318#1611653153", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput286() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.ValueInstantiator", "com.fasterxml.jackson.databind.deser.ValueInstantiator$Base", "getValueTypeDesc", new String[]{}, new String[]{}, false, 6, new String[][]{{"com.fasterxml.jackson.databind.deser.ValueInstantiator", "createUsingDelegate", "com.fasterxml.jackson.databind.DeserializationContext,java.lang.Object", "<sample:7>", "<i:2>"}, {"com.fasterxml.jackson.databind.deser.ValueInstantiator", "canCreateFromInt", ""}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput287() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.std.StdValueInstantiator", "com.fasterxml.jackson.databind.deser.std.StdValueInstantiator", "configureIncompleteParameter", new String[]{"com.fasterxml.jackson.databind.introspect.AnnotatedParameter"}, new String[]{"<sample:7>"}, false, 4, new String[][]{{"com.fasterxml.jackson.databind.deser.std.StdValueInstantiator", "createFromBoolean", "com.fasterxml.jackson.databind.DeserializationContext,boolean", "<sample:13>", "false"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{canCreateFromBoolean=false, canCreateFromDouble=false, canCreateFromInt=false, canCreateFromLong=false, canCreateFromObjectWith=false, canCreateFromString=false, canCreateUsingArrayDelegate=false, ca...#309#-1951095057", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput288() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.std.StdValueInstantiator", "com.fasterxml.jackson.databind.deser.std.StdValueInstantiator", "canCreateFromObjectWith", new String[]{}, new String[]{}, false, 1, new String[][]{{"com.fasterxml.jackson.databind.deser.std.StdValueInstantiator", "configureFromArraySettings", "com.fasterxml.jackson.databind.introspect.AnnotatedWithParams,com.fasterxml.jackson.databind.JavaType,com.fasterxml.jackson.databind.deser.SettableBeanProperty[]", "<sample:4>", "<sample:6>", "<sample:3>"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{canCreateFromBoolean=false, canCreateFromDouble=false, canCreateFromInt=false, canCreateFromLong=false, canCreateFromObjectWith=false, canCreateFromString=false, canCreateUsingArrayDelegate=true, can...#344#-1982507270", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput289() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.ValueInstantiator", "com.fasterxml.jackson.databind.deser.ValueInstantiator$Base", "getDelegateType", new String[]{"com.fasterxml.jackson.databind.DeserializationConfig"}, new String[]{"<sample:2>"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.deser.ValueInstantiator", "getWithArgsCreator", ""}}, 1);
  assertNull(actual);
  assertEquals("receiver state after the call", "{canCreateFromBoolean=false, canCreateFromDouble=false, canCreateFromInt=false, canCreateFromLong=false, canCreateFromObjectWith=false, canCreateFromString=false, canCreateUsingArrayDelegate=false, ca...#313#-516867540", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput290() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.ValueInstantiator", "com.fasterxml.jackson.databind.deser.ValueInstantiator$Base", "canCreateFromBoolean", new String[]{}, new String[]{}, false, 7, new String[][]{{"com.fasterxml.jackson.databind.deser.ValueInstantiator", "createUsingDefault", "com.fasterxml.jackson.databind.DeserializationContext", "<sample:8>"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{canCreateFromBoolean=false, canCreateFromDouble=false, canCreateFromInt=false, canCreateFromLong=false, canCreateFromObjectWith=false, canCreateFromString=false, canCreateUsingArrayDelegate=false, ca...#316#-1594774090", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput291() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.std.StdValueInstantiator", "com.fasterxml.jackson.databind.deser.std.StdValueInstantiator", "configureFromObjectSettings", new String[]{"com.fasterxml.jackson.databind.introspect.AnnotatedWithParams", "com.fasterxml.jackson.databind.introspect.AnnotatedWithParams", "com.fasterxml.jackson.databind.JavaType", "com.fasterxml.jackson.databind.deser.SettableBeanProperty[]", "com.fasterxml.jackson.databind.introspect.AnnotatedWithParams", "com.fasterxml.jackson.databind.deser.SettableBeanProperty[]"}, new String[]{"<sample:3>", "<sample:7>", "<sample:0>", "<null>", "<sample:1>", "<sample:4>"}, false, 1, new String[][]{{"com.fasterxml.jackson.databind.deser.std.StdValueInstantiator", "canCreateUsingArrayDelegate", ""}, {"com.fasterxml.jackson.databind.deser.std.StdValueInstantiator", "getDelegateType", "com.fasterxml.jackson.databind.DeserializationConfig", "<sample:3>"}}, 3);
  assertNull(actual);
  assertEquals("receiver state after the call", "{canCreateFromBoolean=false, canCreateFromDouble=false, canCreateFromInt=false, canCreateFromLong=false, canCreateFromObjectWith=true, canCreateFromString=false, canCreateUsingArrayDelegate=false, can...#342#684040494", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput292() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.std.StdValueInstantiator", "com.fasterxml.jackson.databind.deser.std.StdValueInstantiator", "configureFromBooleanCreator", new String[]{"com.fasterxml.jackson.databind.introspect.AnnotatedWithParams"}, new String[]{"<sample:2>"}, false, 1, new String[][]{{"com.fasterxml.jackson.databind.deser.std.StdValueInstantiator", "createFromObjectWith", "com.fasterxml.jackson.databind.DeserializationContext,com.fasterxml.jackson.databind.deser.SettableBeanProperty[],com.fasterxml.jackson.databind.deser.impl.PropertyValueBuffer", "<sample:2>", "<empty>", "<sample:10>"}, {"com.fasterxml.jackson.databind.deser.std.StdValueInstantiator", "configureFromObjectSettings", "com.fasterxml.jackson.databind.introspect.AnnotatedWithParams,com.fasterxml.jackson.databind.introspect.AnnotatedWithParams,com.fasterxml.jackson.databind.JavaType,com.fasterxml.jackson.databind.deser.SettableBeanProperty[],com.fasterxml.jackson.databind.introspect.AnnotatedWithParams,com.fasterxml.jackson.databind.deser.SettableBeanProperty[]", "<sample:6>", "<sample:3>", "<sample:6>", "<null>", "<sample:8>", "<sample:3>"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{canCreateFromBoolean=true, canCreateFromDouble=false, canCreateFromInt=false, canCreateFromLong=false, canCreateFromObjectWith=false, canCreateFromString=false, canCreateUsingArrayDelegate=false, can...#342#1794699110", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput293() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.ValueInstantiator", "com.fasterxml.jackson.databind.deser.ValueInstantiator$Base", "createFromString", new String[]{"com.fasterxml.jackson.databind.DeserializationContext", "java.lang.String"}, new String[]{"<sample:5>", "1"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.deser.ValueInstantiator", "createUsingDefault", "com.fasterxml.jackson.databind.DeserializationContext", "<sample:5>"}, {"com.fasterxml.jackson.databind.deser.ValueInstantiator", "canCreateFromDouble", ""}}, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput294() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.std.StdValueInstantiator", "com.fasterxml.jackson.databind.deser.std.StdValueInstantiator", "canCreateFromBoolean", new String[]{}, new String[]{}, false, 3, new String[][]{});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{canCreateFromBoolean=false, canCreateFromDouble=false, canCreateFromInt=false, canCreateFromLong=false, canCreateFromObjectWith=false, canCreateFromString=false, canCreateUsingArrayDelegate=false, ca...#324#-2126697502", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput295() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.std.StdValueInstantiator", "com.fasterxml.jackson.databind.deser.std.StdValueInstantiator", "getArrayDelegateType", new String[]{"com.fasterxml.jackson.databind.DeserializationConfig"}, new String[]{"<sample:2>"}, false, 3, new String[][]{{"com.fasterxml.jackson.databind.deser.std.StdValueInstantiator", "createFromLong", "com.fasterxml.jackson.databind.DeserializationContext,long", "<sample:4>", "2"}, {"com.fasterxml.jackson.databind.deser.std.StdValueInstantiator", "createFromDouble", "com.fasterxml.jackson.databind.DeserializationContext,double", "<sample:3>", "Infinity"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{canCreateFromBoolean=false, canCreateFromDouble=false, canCreateFromInt=false, canCreateFromLong=false, canCreateFromObjectWith=false, canCreateFromString=false, canCreateUsingArrayDelegate=false, ca...#324#-2126697502", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput296() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.std.StdValueInstantiator", "com.fasterxml.jackson.databind.deser.std.StdValueInstantiator", "createFromDouble", new String[]{"com.fasterxml.jackson.databind.DeserializationContext", "double"}, new String[]{"<sample:10>", "-2.0"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.deser.std.StdValueInstantiator", "canCreateUsingDefault", ""}}, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput297() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.std.StdValueInstantiator", "com.fasterxml.jackson.databind.deser.std.StdValueInstantiator", "canCreateFromString", new String[]{}, new String[]{}, false, 7, new String[][]{{"com.fasterxml.jackson.databind.deser.std.StdValueInstantiator", "createFromBoolean", "com.fasterxml.jackson.databind.DeserializationContext,boolean", "<sample:2>", "false"}, {"com.fasterxml.jackson.databind.deser.std.StdValueInstantiator", "createFromLong", "com.fasterxml.jackson.databind.DeserializationContext,long", "<sample:3>", "2"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{canCreateFromBoolean=false, canCreateFromDouble=false, canCreateFromInt=false, canCreateFromLong=false, canCreateFromObjectWith=false, canCreateFromString=false, canCreateUsingArrayDelegate=false, ca...#329#-1747445055", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput298() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.ValueInstantiator", "com.fasterxml.jackson.databind.deser.ValueInstantiator$Base", "getDelegateType", new String[]{"com.fasterxml.jackson.databind.DeserializationConfig"}, new String[]{"<sample:7>"}, false, 5, new String[][]{});
  assertNull(actual);
  assertEquals("receiver state after the call", "{canCreateFromBoolean=false, canCreateFromDouble=false, canCreateFromInt=false, canCreateFromLong=false, canCreateFromObjectWith=false, canCreateFromString=false, canCreateUsingArrayDelegate=false, ca...#311#-229031103", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput299() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.std.StdValueInstantiator", "com.fasterxml.jackson.databind.deser.std.StdValueInstantiator", "canCreateUsingDelegate", new String[]{}, new String[]{}, false, 2, new String[][]{{"com.fasterxml.jackson.databind.deser.std.StdValueInstantiator", "wrapException", "java.lang.Throwable", "<empty>"}, {"com.fasterxml.jackson.databind.deser.std.StdValueInstantiator", "configureFromLongCreator", "com.fasterxml.jackson.databind.introspect.AnnotatedWithParams", "<sample:4>"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{canCreateFromBoolean=false, canCreateFromDouble=false, canCreateFromInt=false, canCreateFromLong=true, canCreateFromObjectWith=false, canCreateFromString=false, canCreateUsingArrayDelegate=false, can...#312#-823938619", SearchInputFactory_scaffolding.receiverState());
 }
}
