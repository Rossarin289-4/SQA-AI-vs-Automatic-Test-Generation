package generated.algorithm;

import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;
import static org.junit.Assert.*;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class BinaryParticleSwarmGeneratedTest {
 @Test(timeout = 20000)
 public void generatedInput000() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.jsontype.impl.ClassNameIdResolver", "com.fasterxml.jackson.databind.jsontype.impl.ClassNameIdResolver", "_typeFromId", new String[]{"java.lang.String", "com.fasterxml.jackson.databind.DatabindContext"}, new String[]{"<a>b=", "<sample:7>"}, false, 4, new String[][]{}, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput001() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.jsontype.impl.ClassNameIdResolver", "com.fasterxml.jackson.databind.jsontype.impl.ClassNameIdResolver", "idFromBaseType", new String[]{}, new String[]{}, false, 7, new String[][]{});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("java.lang.Object", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getDescForKnownTypeIds=class name used as type id, getMechanism=CLASS}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput002() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.jsontype.impl.ClassNameIdResolver", "com.fasterxml.jackson.databind.jsontype.impl.ClassNameIdResolver", "getDescForKnownTypeIds", new String[]{}, new String[]{}, false, 1, new String[][]{{"com.fasterxml.jackson.databind.jsontype.impl.ClassNameIdResolver", "typeFromId", "com.fasterxml.jackson.databind.DatabindContext,java.lang.String", "<sample:0>", "Invalid type id '"}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("class name used as type id", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getDescForKnownTypeIds=class name used as type id, getMechanism=CLASS}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput003() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.jsontype.impl.ClassNameIdResolver", "com.fasterxml.jackson.databind.jsontype.impl.ClassNameIdResolver", "getDescForKnownTypeIds", new String[]{}, new String[]{}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.jsontype.impl.ClassNameIdResolver", "idFromBaseType", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("class name used as type id", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getDescForKnownTypeIds=class name used as type id, getMechanism=CLASS}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput004() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.jsontype.impl.ClassNameIdResolver", "com.fasterxml.jackson.databind.jsontype.impl.ClassNameIdResolver", "_typeFromId", new String[]{"java.lang.String", "com.fasterxml.jackson.databind.DatabindContext"}, new String[]{"1.123456", "<sample:7>"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.jsontype.impl.ClassNameIdResolver", "idFromValueAndType", "java.lang.Object,java.lang.Class", "<i:1>", "<sample:0>"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput005() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.jsontype.impl.ClassNameIdResolver", "com.fasterxml.jackson.databind.jsontype.impl.ClassNameIdResolver", "getMechanism", new String[]{}, new String[]{}, false, 5, new String[][]{{"com.fasterxml.jackson.databind.jsontype.impl.ClassNameIdResolver", "init", "com.fasterxml.jackson.databind.JavaType", "<sample:2>"}}, 3);
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.annotation.JsonTypeInfo$Id", actual.getClass().getName());
  assertEquals("CLASS", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getDescForKnownTypeIds=class name used as type id, getMechanism=CLASS}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput006() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.jsontype.impl.ClassNameIdResolver", "com.fasterxml.jackson.databind.jsontype.impl.ClassNameIdResolver", "registerSubtype", new String[]{"java.lang.Class", "java.lang.String"}, new String[]{"<null>", "1"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.jsontype.impl.ClassNameIdResolver", "typeFromId", "com.fasterxml.jackson.databind.DatabindContext,java.lang.String", "<sample:5>", "[Hello, World"}, {"com.fasterxml.jackson.databind.jsontype.impl.ClassNameIdResolver", "_idFrom", "java.lang.Object,java.lang.Class,com.fasterxml.jackson.databind.type.TypeFactory", "<i:-2147483648>", "<sample:0>", "<sample:2>"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getDescForKnownTypeIds=class name used as type id, getMechanism=CLASS}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput007() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.jsontype.impl.ClassNameIdResolver", "com.fasterxml.jackson.databind.jsontype.impl.ClassNameIdResolver", "idFromValue", new String[]{"java.lang.Object"}, new String[]{"<b:true>"}, false, 0, null, 1);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("java.lang.Boolean", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getDescForKnownTypeIds=class name used as type id, getMechanism=CLASS}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput008() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.jsontype.impl.ClassNameIdResolver", "com.fasterxml.jackson.databind.jsontype.impl.ClassNameIdResolver", "_typeFromId", new String[]{"java.lang.String", "com.fasterxml.jackson.databind.DatabindContext"}, new String[]{"a[1,2]", "<sample:2>"}, false, 5, new String[][]{}, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput009() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.jsontype.impl.ClassNameIdResolver", "com.fasterxml.jackson.databind.jsontype.impl.ClassNameIdResolver", "getMechanism", new String[]{}, new String[]{}, false, 5, new String[][]{});
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.annotation.JsonTypeInfo$Id", actual.getClass().getName());
  assertEquals("CLASS", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getDescForKnownTypeIds=class name used as type id, getMechanism=CLASS}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput010() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.jsontype.impl.ClassNameIdResolver", "com.fasterxml.jackson.databind.jsontype.impl.ClassNameIdResolver", "idFromBaseType", new String[]{}, new String[]{}, false);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("generated.algorithm.SearchInputFactory_scaffolding$GenericSub", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getDescForKnownTypeIds=class name used as type id, getMechanism=CLASS}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput011() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.jsontype.impl.ClassNameIdResolver", "com.fasterxml.jackson.databind.jsontype.impl.ClassNameIdResolver", "_typeFromId", new String[]{"java.lang.String", "com.fasterxml.jackson.databind.DatabindContext"}, new String[]{"PT1", "<sample:6>"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.jsontype.impl.ClassNameIdResolver", "idFromValueAndType", "java.lang.Object,java.lang.Class", "<s:a>", "<sample:6>"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput012() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.jsontype.impl.ClassNameIdResolver", "com.fasterxml.jackson.databind.jsontype.impl.ClassNameIdResolver", "_idFrom", new String[]{"java.lang.Object", "java.lang.Class", "com.fasterxml.jackson.databind.type.TypeFactory"}, new String[]{"<i:-2147483648>", "<empty>", "<sample:3>"}, false);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("java.lang.String", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getDescForKnownTypeIds=class name used as type id, getMechanism=CLASS}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput013() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.jsontype.impl.ClassNameIdResolver", "com.fasterxml.jackson.databind.jsontype.impl.ClassNameIdResolver", "_idFrom", new String[]{"java.lang.Object", "java.lang.Class", "com.fasterxml.jackson.databind.type.TypeFactory"}, new String[]{"<s:ke'>", "<sample:6>", "<sample:0>"}, false, 5, new String[][]{});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("java.util.List", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getDescForKnownTypeIds=class name used as type id, getMechanism=CLASS}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput014() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.jsontype.impl.ClassNameIdResolver", "com.fasterxml.jackson.databind.jsontype.impl.ClassNameIdResolver", "getDescForKnownTypeIds", new String[]{}, new String[]{}, false, 0, null, 3);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("class name used as type id", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getDescForKnownTypeIds=class name used as type id, getMechanism=CLASS}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput015() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.jsontype.impl.ClassNameIdResolver", "com.fasterxml.jackson.databind.jsontype.impl.ClassNameIdResolver", "typeFromId", new String[]{"com.fasterxml.jackson.databind.DatabindContext", "java.lang.String"}, new String[]{"<sample:4>", "{THTLE"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.jsontype.impl.ClassNameIdResolver", "_idFrom", "java.lang.Object,java.lang.Class,com.fasterxml.jackson.databind.type.TypeFactory", "<s:a>", "<sample:1>", "<sample:4>"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput016() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.jsontype.impl.ClassNameIdResolver", "com.fasterxml.jackson.databind.jsontype.impl.ClassNameIdResolver", "typeFromId", new String[]{"com.fasterxml.jackson.databind.DatabindContext", "java.lang.String"}, new String[]{"<sample:0>", ".Arrays$http://example.com/a?b=c"}, false, 5, new String[][]{}, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput017() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.jsontype.impl.ClassNameIdResolver", "com.fasterxml.jackson.databind.jsontype.impl.ClassNameIdResolver", "_typeFromId", new String[]{"java.lang.String", "com.fasterxml.jackson.databind.DatabindContext"}, new String[]{"1.1234567890123456", "<sample:5>"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.jsontype.impl.ClassNameIdResolver", "idFromBaseType", ""}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getDescForKnownTypeIds=class name used as type id, getMechanism=CLASS}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput018() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.jsontype.impl.ClassNameIdResolver", "com.fasterxml.jackson.databind.jsontype.impl.ClassNameIdResolver", "_idFrom", new String[]{"java.lang.Object", "java.lang.Class", "com.fasterxml.jackson.databind.type.TypeFactory"}, new String[]{"<i:2>", "<sample:1>", "<sample:3>"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.jsontype.impl.ClassNameIdResolver", "idFromValueAndType", "java.lang.Object,java.lang.Class", "<i:30>", "<sample:2>"}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("generated.algorithm.SearchInputFactory_scaffolding$GenericSub", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getDescForKnownTypeIds=class name used as type id, getMechanism=CLASS}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput019() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.jsontype.impl.ClassNameIdResolver", "com.fasterxml.jackson.databind.jsontype.impl.ClassNameIdResolver", "typeFromId", new String[]{"com.fasterxml.jackson.databind.DatabindContext", "java.lang.String"}, new String[]{"<sample:5>", "1.55d"}, false, 0, null, 2);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getDescForKnownTypeIds=class name used as type id, getMechanism=CLASS}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput020() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.jsontype.impl.ClassNameIdResolver", "com.fasterxml.jackson.databind.jsontype.impl.ClassNameIdResolver", "init", new String[]{"com.fasterxml.jackson.databind.JavaType"}, new String[]{"<sample:0>"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.jsontype.impl.ClassNameIdResolver", "init", "com.fasterxml.jackson.databind.JavaType", "<sample:7>"}, {"com.fasterxml.jackson.databind.jsontype.impl.ClassNameIdResolver", "registerSubtype", "java.lang.Class,java.lang.String", "<sample:6>", "a!b"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getDescForKnownTypeIds=class name used as type id, getMechanism=CLASS}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput021() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.jsontype.impl.ClassNameIdResolver", "com.fasterxml.jackson.databind.jsontype.impl.ClassNameIdResolver", "typeFromId", new String[]{"com.fasterxml.jackson.databind.DatabindContext", "java.lang.String"}, new String[]{"<sample:7>", "a bListnull"}, false, 6, new String[][]{{"com.fasterxml.jackson.databind.jsontype.impl.ClassNameIdResolver", "idFromValue", "java.lang.Object", "<b:true>"}, {"com.fasterxml.jackson.databind.jsontype.impl.ClassNameIdResolver", "_typeFromId", "java.lang.String,com.fasterxml.jackson.databind.DatabindContext", "1e105.", "<sample:2>"}}, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput022() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.jsontype.impl.ClassNameIdResolver", "com.fasterxml.jackson.databind.jsontype.impl.ClassNameIdResolver", "idFromValue", new String[]{"java.lang.Object"}, new String[]{"<i:2>"}, false);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("java.lang.Integer", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getDescForKnownTypeIds=class name used as type id, getMechanism=CLASS}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput023() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.jsontype.impl.ClassNameIdResolver", "com.fasterxml.jackson.databind.jsontype.impl.ClassNameIdResolver", "_idFrom", new String[]{"java.lang.Object", "java.lang.Class", "com.fasterxml.jackson.databind.type.TypeFactory"}, new String[]{"<d:41.0>", "<sample:0>", "<sample:3>"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.jsontype.impl.ClassNameIdResolver", "typeFromId", "com.fasterxml.jackson.databind.DatabindContext,java.lang.String", "<sample:9>", "0x123456789"}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("java.lang.String", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getDescForKnownTypeIds=class name used as type id, getMechanism=CLASS}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput024() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.jsontype.impl.ClassNameIdResolver", "com.fasterxml.jackson.databind.jsontype.impl.ClassNameIdResolver", "_idFrom", new String[]{"java.lang.Object", "java.lang.Class", "com.fasterxml.jackson.databind.type.TypeFactory"}, new String[]{"<sample:2>", "<null>", "<sample:6>"}, false); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput025() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.jsontype.impl.ClassNameIdResolver", "com.fasterxml.jackson.databind.jsontype.impl.ClassNameIdResolver", "idFromValue", new String[]{"java.lang.Object"}, new String[]{"<s:kfy>"}, false, 3, new String[][]{{"com.fasterxml.jackson.databind.jsontype.impl.ClassNameIdResolver", "idFromBaseType", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("java.lang.String", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getDescForKnownTypeIds=class name used as type id, getMechanism=CLASS}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput026() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.jsontype.impl.ClassNameIdResolver", "com.fasterxml.jackson.databind.jsontype.impl.ClassNameIdResolver", "init", new String[]{"com.fasterxml.jackson.databind.JavaType"}, new String[]{"<sample:1>"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.jsontype.impl.ClassNameIdResolver", "init", "com.fasterxml.jackson.databind.JavaType", "<sample:0>"}}, 3);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getDescForKnownTypeIds=class name used as type id, getMechanism=CLASS}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput027() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.jsontype.impl.ClassNameIdResolver", "com.fasterxml.jackson.databind.jsontype.impl.ClassNameIdResolver", "idFromValue", new String[]{"java.lang.Object"}, new String[]{"<d:1.5>"}, false);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("java.lang.Double", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getDescForKnownTypeIds=class name used as type id, getMechanism=CLASS}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput028() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.jsontype.impl.ClassNameIdResolver", "com.fasterxml.jackson.databind.jsontype.impl.ClassNameIdResolver", "_typeFromId", new String[]{"java.lang.String", "com.fasterxml.jackson.databind.DatabindContext"}, new String[]{"aic-1", "<sample:5>"}, false, 0, null, 3);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getDescForKnownTypeIds=class name used as type id, getMechanism=CLASS}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput029() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.jsontype.impl.ClassNameIdResolver", "com.fasterxml.jackson.databind.jsontype.impl.ClassNameIdResolver", "typeFromId", new String[]{"com.fasterxml.jackson.databind.DatabindContext", "java.lang.String"}, new String[]{"<sample:2>", "i\t"}, false, 2, new String[][]{{"com.fasterxml.jackson.databind.jsontype.impl.ClassNameIdResolver", "idFromBaseType", ""}}, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput030() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.jsontype.impl.ClassNameIdResolver", "com.fasterxml.jackson.databind.jsontype.impl.ClassNameIdResolver", "idFromValue", new String[]{"java.lang.Object"}, new String[]{"<null>"}, false, 0, null, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput031() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.jsontype.impl.ClassNameIdResolver", "com.fasterxml.jackson.databind.jsontype.impl.ClassNameIdResolver", "init", new String[]{"com.fasterxml.jackson.databind.JavaType"}, new String[]{"<null>"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.jsontype.impl.ClassNameIdResolver", "init", "com.fasterxml.jackson.databind.JavaType", "<sample:3>"}, {"com.fasterxml.jackson.databind.jsontype.impl.ClassNameIdResolver", "idFromValue", "java.lang.Object", "<s:kB'ey>"}}, 1);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getDescForKnownTypeIds=class name used as type id, getMechanism=CLASS}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput032() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.jsontype.impl.ClassNameIdResolver", "com.fasterxml.jackson.databind.jsontype.impl.ClassNameIdResolver", "_idFrom", new String[]{"java.lang.Object", "java.lang.Class", "com.fasterxml.jackson.databind.type.TypeFactory"}, new String[]{"<i:-2147483648>", "<sample:2>", "<sample:4>"}, false, 0, null, 1);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("generated.algorithm.SearchInputFactory_scaffolding$GenericBase", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getDescForKnownTypeIds=class name used as type id, getMechanism=CLASS}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput033() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.jsontype.impl.ClassNameIdResolver", "com.fasterxml.jackson.databind.jsontype.impl.ClassNameIdResolver", "idFromValueAndType", new String[]{"java.lang.Object", "java.lang.Class"}, new String[]{"<s:` >", "<sample:0>"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.jsontype.impl.ClassNameIdResolver", "idFromValue", "java.lang.Object", "<b:true>"}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("java.lang.String", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getDescForKnownTypeIds=class name used as type id, getMechanism=CLASS}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput034() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.jsontype.impl.ClassNameIdResolver", "com.fasterxml.jackson.databind.jsontype.impl.ClassNameIdResolver", "idFromValue", new String[]{"java.lang.Object"}, new String[]{"<s:a>"}, false, 5, new String[][]{{"com.fasterxml.jackson.databind.jsontype.impl.ClassNameIdResolver", "registerSubtype", "java.lang.Class,java.lang.String", "<null>", "Hello,, World1.5f"}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("java.lang.String", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getDescForKnownTypeIds=class name used as type id, getMechanism=CLASS}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput035() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.jsontype.impl.ClassNameIdResolver", "com.fasterxml.jackson.databind.jsontype.impl.ClassNameIdResolver", "idFromValue", new String[]{"java.lang.Object"}, new String[]{"<b:true>"}, false);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("java.lang.Boolean", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getDescForKnownTypeIds=class name used as type id, getMechanism=CLASS}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput036() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.jsontype.impl.ClassNameIdResolver", "com.fasterxml.jackson.databind.jsontype.impl.ClassNameIdResolver", "_idFrom", new String[]{"java.lang.Object", "java.lang.Class", "com.fasterxml.jackson.databind.type.TypeFactory"}, new String[]{"<s:b>", "<sample:5>", "<null>"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.jsontype.impl.ClassNameIdResolver", "idFromBaseType", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("java.lang.Object", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getDescForKnownTypeIds=class name used as type id, getMechanism=CLASS}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput037() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.jsontype.impl.ClassNameIdResolver", "com.fasterxml.jackson.databind.jsontype.impl.ClassNameIdResolver", "_idFrom", new String[]{"java.lang.Object", "java.lang.Class", "com.fasterxml.jackson.databind.type.TypeFactory"}, new String[]{"<sample:1>", "<sample:7>", "<sample:5>"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.jsontype.impl.ClassNameIdResolver", "_idFrom", "java.lang.Object,java.lang.Class,com.fasterxml.jackson.databind.type.TypeFactory", "<i:2>", "<sample:0>", "<sample:6>"}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("int", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getDescForKnownTypeIds=class name used as type id, getMechanism=CLASS}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput038() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.jsontype.impl.ClassNameIdResolver", "com.fasterxml.jackson.databind.jsontype.impl.ClassNameIdResolver", "_typeFromId", new String[]{"java.lang.String", "com.fasterxml.jackson.databind.DatabindContext"}, new String[]{"java.ttil.ArrayLjst", "<sample:0>"}, false, 0, null, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput039() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.jsontype.impl.ClassNameIdResolver", "com.fasterxml.jackson.databind.jsontype.impl.ClassNameIdResolver", "typeFromId", new String[]{"com.fasterxml.jackson.databind.DatabindContext", "java.lang.String"}, new String[]{"<sample:5>", "\u00e91.5"}, false, 4, new String[][]{}, 1);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getDescForKnownTypeIds=class name used as type id, getMechanism=CLASS}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput040() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.jsontype.impl.ClassNameIdResolver", "com.fasterxml.jackson.databind.jsontype.impl.ClassNameIdResolver", "idFromBaseType", new String[]{}, new String[]{}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.jsontype.impl.ClassNameIdResolver", "typeFromId", "com.fasterxml.jackson.databind.DatabindContext,java.lang.String", "<sample:7>", "1.5c"}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("generated.algorithm.SearchInputFactory_scaffolding$GenericSub", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getDescForKnownTypeIds=class name used as type id, getMechanism=CLASS}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput041() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.jsontype.impl.ClassNameIdResolver", "com.fasterxml.jackson.databind.jsontype.impl.ClassNameIdResolver", "idFromValue", new String[]{"java.lang.Object"}, new String[]{"<s:a>"}, false, 4, new String[][]{}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("java.lang.String", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getDescForKnownTypeIds=class name used as type id, getMechanism=CLASS}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput042() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.jsontype.impl.ClassNameIdResolver", "com.fasterxml.jackson.databind.jsontype.impl.ClassNameIdResolver", "idFromValueAndType", new String[]{"java.lang.Object", "java.lang.Class"}, new String[]{"<null>", "<sample:2>"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.jsontype.impl.ClassNameIdResolver", "_idFrom", "java.lang.Object,java.lang.Class,com.fasterxml.jackson.databind.type.TypeFactory", "<s:kvey>", "<sample:4>", "<sample:3>"}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("generated.algorithm.SearchInputFactory_scaffolding$GenericBase", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getDescForKnownTypeIds=class name used as type id, getMechanism=CLASS}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput043() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.jsontype.impl.ClassNameIdResolver", "com.fasterxml.jackson.databind.jsontype.impl.ClassNameIdResolver", "idFromValueAndType", new String[]{"java.lang.Object", "java.lang.Class"}, new String[]{"<sample:3>", "<sample:2>"}, false, 0, null, 3);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("generated.algorithm.SearchInputFactory_scaffolding$GenericBase", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getDescForKnownTypeIds=class name used as type id, getMechanism=CLASS}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput044() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.jsontype.impl.ClassNameIdResolver", "com.fasterxml.jackson.databind.jsontype.impl.ClassNameIdResolver", "idFromValueAndType", new String[]{"java.lang.Object", "java.lang.Class"}, new String[]{"<sample:1>", "<sample:4>"}, false);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("java.lang.Integer", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getDescForKnownTypeIds=class name used as type id, getMechanism=CLASS}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput045() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.jsontype.impl.ClassNameIdResolver", "com.fasterxml.jackson.databind.jsontype.impl.ClassNameIdResolver", "_idFrom", new String[]{"java.lang.Object", "java.lang.Class", "com.fasterxml.jackson.databind.type.TypeFactory"}, new String[]{"<i:-1>", "<sample:3>", "<sample:5>"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.jsontype.impl.ClassNameIdResolver", "getMechanism", ""}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("generated.algorithm.SearchInputFactory_scaffolding$GenericLeaf", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getDescForKnownTypeIds=class name used as type id, getMechanism=CLASS}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput046() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.jsontype.impl.ClassNameIdResolver", "com.fasterxml.jackson.databind.jsontype.impl.ClassNameIdResolver", "getDescForKnownTypeIds", new String[]{}, new String[]{}, false, 0, null, 1);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("class name used as type id", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getDescForKnownTypeIds=class name used as type id, getMechanism=CLASS}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput047() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.jsontype.impl.ClassNameIdResolver", "com.fasterxml.jackson.databind.jsontype.impl.ClassNameIdResolver", "idFromValueAndType", new String[]{"java.lang.Object", "java.lang.Class"}, new String[]{"<null>", "<null>"}, false); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput048() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.jsontype.impl.ClassNameIdResolver", "com.fasterxml.jackson.databind.jsontype.impl.ClassNameIdResolver", "idFromValue", new String[]{"java.lang.Object"}, new String[]{"<s:>"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.jsontype.impl.ClassNameIdResolver", "getDescForKnownTypeIds", ""}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("java.lang.String", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getDescForKnownTypeIds=class name used as type id, getMechanism=CLASS}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput049() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.jsontype.impl.ClassNameIdResolver", "com.fasterxml.jackson.databind.jsontype.impl.ClassNameIdResolver", "idFromValue", new String[]{"java.lang.Object"}, new String[]{"<null>"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.jsontype.impl.ClassNameIdResolver", "init", "com.fasterxml.jackson.databind.JavaType", "<sample:8>"}, {"com.fasterxml.jackson.databind.jsontype.impl.ClassNameIdResolver", "_idFrom", "java.lang.Object,java.lang.Class,com.fasterxml.jackson.databind.type.TypeFactory", "<null>", "<sample:3>", "<sample:6>"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput050() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.jsontype.impl.ClassNameIdResolver", "com.fasterxml.jackson.databind.jsontype.impl.ClassNameIdResolver", "_idFrom", new String[]{"java.lang.Object", "java.lang.Class", "com.fasterxml.jackson.databind.type.TypeFactory"}, new String[]{"<s:<>", "<null>", "<sample:6>"}, false, 0, null, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput051() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.jsontype.impl.ClassNameIdResolver", "com.fasterxml.jackson.databind.jsontype.impl.ClassNameIdResolver", "typeFromId", new String[]{"com.fasterxml.jackson.databind.DatabindContext", "java.lang.String"}, new String[]{"<sample:5>", "0y10"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.jsontype.impl.ClassNameIdResolver", "getDescForKnownTypeIds", ""}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getDescForKnownTypeIds=class name used as type id, getMechanism=CLASS}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput052() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.jsontype.impl.ClassNameIdResolver", "com.fasterxml.jackson.databind.jsontype.impl.ClassNameIdResolver", "idFromValue", new String[]{"java.lang.Object"}, new String[]{"<i:-1073741824>"}, false, 0, null, 3);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("java.lang.Integer", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getDescForKnownTypeIds=class name used as type id, getMechanism=CLASS}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput053() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.jsontype.impl.ClassNameIdResolver", "com.fasterxml.jackson.databind.jsontype.impl.ClassNameIdResolver", "_idFrom", new String[]{"java.lang.Object", "java.lang.Class", "com.fasterxml.jackson.databind.type.TypeFactory"}, new String[]{"<b:false>", "<sample:5>", "<sample:4>"}, false, 0, null, 1);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("java.lang.Object", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getDescForKnownTypeIds=class name used as type id, getMechanism=CLASS}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput054() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.jsontype.impl.ClassNameIdResolver", "com.fasterxml.jackson.databind.jsontype.impl.ClassNameIdResolver", "idFromBaseType", new String[]{}, new String[]{}, false, 0, null, 1);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("generated.algorithm.SearchInputFactory_scaffolding$GenericSub", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getDescForKnownTypeIds=class name used as type id, getMechanism=CLASS}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput055() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.jsontype.impl.ClassNameIdResolver", "com.fasterxml.jackson.databind.jsontype.impl.ClassNameIdResolver", "_idFrom", new String[]{"java.lang.Object", "java.lang.Class", "com.fasterxml.jackson.databind.type.TypeFactory"}, new String[]{"<i:-1>", "<sample:3>", "<sample:3>"}, false, 6, new String[][]{{"com.fasterxml.jackson.databind.jsontype.impl.ClassNameIdResolver", "idFromBaseType", ""}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("generated.algorithm.SearchInputFactory_scaffolding$GenericLeaf", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getDescForKnownTypeIds=class name used as type id, getMechanism=CLASS}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput056() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.jsontype.impl.ClassNameIdResolver", "com.fasterxml.jackson.databind.jsontype.impl.ClassNameIdResolver", "_idFrom", new String[]{"java.lang.Object", "java.lang.Class", "com.fasterxml.jackson.databind.type.TypeFactory"}, new String[]{"<sample:1>", "<sample:6>", "<sample:2>"}, false, 1, new String[][]{}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("java.util.List", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getDescForKnownTypeIds=class name used as type id, getMechanism=CLASS}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput057() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.jsontype.impl.ClassNameIdResolver", "com.fasterxml.jackson.databind.jsontype.impl.ClassNameIdResolver", "getDescForKnownTypeIds", new String[]{}, new String[]{}, false, 2, new String[][]{}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("class name used as type id", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getDescForKnownTypeIds=class name used as type id, getMechanism=CLASS}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput058() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.jsontype.impl.ClassNameIdResolver", "com.fasterxml.jackson.databind.jsontype.impl.ClassNameIdResolver", "_idFrom", new String[]{"java.lang.Object", "java.lang.Class", "com.fasterxml.jackson.databind.type.TypeFactory"}, new String[]{"<i:5>", "<sample:4>", "<sample:7>"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.jsontype.impl.ClassNameIdResolver", "_idFrom", "java.lang.Object,java.lang.Class,com.fasterxml.jackson.databind.type.TypeFactory", "<sample:0>", "<sample:2>", "<sample:0>"}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("java.lang.Integer", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getDescForKnownTypeIds=class name used as type id, getMechanism=CLASS}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput059() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.jsontype.impl.ClassNameIdResolver", "com.fasterxml.jackson.databind.jsontype.impl.ClassNameIdResolver", "getMechanism", new String[]{}, new String[]{}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.jsontype.impl.ClassNameIdResolver", "_idFrom", "java.lang.Object,java.lang.Class,com.fasterxml.jackson.databind.type.TypeFactory", "<i:-2147483648>", "<sample:3>", "<sample:1>"}}, 2);
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.annotation.JsonTypeInfo$Id", actual.getClass().getName());
  assertEquals("CLASS", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getDescForKnownTypeIds=class name used as type id, getMechanism=CLASS}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput060() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.jsontype.impl.ClassNameIdResolver", "com.fasterxml.jackson.databind.jsontype.impl.ClassNameIdResolver", "_idFrom", new String[]{"java.lang.Object", "java.lang.Class", "com.fasterxml.jackson.databind.type.TypeFactory"}, new String[]{"<i:2>", "<sample:4>", "<sample:2>"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.jsontype.impl.ClassNameIdResolver", "getMechanism", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("java.lang.Integer", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getDescForKnownTypeIds=class name used as type id, getMechanism=CLASS}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput061() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.jsontype.impl.ClassNameIdResolver", "com.fasterxml.jackson.databind.jsontype.impl.ClassNameIdResolver", "idFromValueAndType", new String[]{"java.lang.Object", "java.lang.Class"}, new String[]{"<s:b>", "<sample:6>"}, false, 5, new String[][]{{"com.fasterxml.jackson.databind.jsontype.impl.ClassNameIdResolver", "idFromBaseType", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("java.util.List", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getDescForKnownTypeIds=class name used as type id, getMechanism=CLASS}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput062() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.jsontype.impl.ClassNameIdResolver", "com.fasterxml.jackson.databind.jsontype.impl.ClassNameIdResolver", "registerSubtype", new String[]{"java.lang.Class", "java.lang.String"}, new String[]{"<empty>", "5."}, false, 3, new String[][]{}, 3);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getDescForKnownTypeIds=class name used as type id, getMechanism=CLASS}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput063() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.jsontype.impl.ClassNameIdResolver", "com.fasterxml.jackson.databind.jsontype.impl.ClassNameIdResolver", "idFromValue", new String[]{"java.lang.Object"}, new String[]{"<i:-1>"}, false, 0, null, 2);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("java.lang.Integer", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getDescForKnownTypeIds=class name used as type id, getMechanism=CLASS}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput064() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.jsontype.impl.ClassNameIdResolver", "com.fasterxml.jackson.databind.jsontype.impl.ClassNameIdResolver", "_idFrom", new String[]{"java.lang.Object", "java.lang.Class", "com.fasterxml.jackson.databind.type.TypeFactory"}, new String[]{"<sample:2>", "<sample:4>", "<sample:4>"}, false, 5, new String[][]{{"com.fasterxml.jackson.databind.jsontype.impl.ClassNameIdResolver", "_typeFromId", "java.lang.String,com.fasterxml.jackson.databind.DatabindContext", "2020-01-01", "<sample:4>"}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("java.lang.Integer", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getDescForKnownTypeIds=class name used as type id, getMechanism=CLASS}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput065() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.jsontype.impl.ClassNameIdResolver", "com.fasterxml.jackson.databind.jsontype.impl.ClassNameIdResolver", "idFromBaseType", new String[]{}, new String[]{}, false, 7, new String[][]{}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("java.lang.Object", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getDescForKnownTypeIds=class name used as type id, getMechanism=CLASS}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput066() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.jsontype.impl.ClassNameIdResolver", "com.fasterxml.jackson.databind.jsontype.impl.ClassNameIdResolver", "getDescForKnownTypeIds", new String[]{}, new String[]{}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.jsontype.impl.ClassNameIdResolver", "_idFrom", "java.lang.Object,java.lang.Class,com.fasterxml.jackson.databind.type.TypeFactory", "<b:true>", "<null>", "<sample:3>"}, {"com.fasterxml.jackson.databind.jsontype.impl.ClassNameIdResolver", "_typeFromId", "java.lang.String,com.fasterxml.jackson.databind.DatabindContext", "1.12345678901234567<a>b</a>", "<sample:5>"}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("class name used as type id", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getDescForKnownTypeIds=class name used as type id, getMechanism=CLASS}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput067() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.jsontype.impl.ClassNameIdResolver", "com.fasterxml.jackson.databind.jsontype.impl.ClassNameIdResolver", "registerSubtype", new String[]{"java.lang.Class", "java.lang.String"}, new String[]{"<empty>", "1.55e3/0"}, false, 7, new String[][]{{"com.fasterxml.jackson.databind.jsontype.impl.ClassNameIdResolver", "idFromValueAndType", "java.lang.Object,java.lang.Class", "<i:-1>", "<sample:4>"}}, 2);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getDescForKnownTypeIds=class name used as type id, getMechanism=CLASS}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput068() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.jsontype.impl.ClassNameIdResolver", "com.fasterxml.jackson.databind.jsontype.impl.ClassNameIdResolver", "idFromValueAndType", new String[]{"java.lang.Object", "java.lang.Class"}, new String[]{"<d:1.5>", "<sample:5>"}, false);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("java.lang.Object", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getDescForKnownTypeIds=class name used as type id, getMechanism=CLASS}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput069() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.jsontype.impl.ClassNameIdResolver", "com.fasterxml.jackson.databind.jsontype.impl.ClassNameIdResolver", "_idFrom", new String[]{"java.lang.Object", "java.lang.Class", "com.fasterxml.jackson.databind.type.TypeFactory"}, new String[]{"<i:-2147483648>", "<empty>", "<sample:5>"}, false, 0, null, 3);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("java.lang.String", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getDescForKnownTypeIds=class name used as type id, getMechanism=CLASS}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput070() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.jsontype.impl.ClassNameIdResolver", "com.fasterxml.jackson.databind.jsontype.impl.ClassNameIdResolver", "idFromBaseType", new String[]{}, new String[]{}, false, 5, new String[][]{{"com.fasterxml.jackson.databind.jsontype.impl.ClassNameIdResolver", "_idFrom", "java.lang.Object,java.lang.Class,com.fasterxml.jackson.databind.type.TypeFactory", "<s:Fb>", "<null>", "<sample:2>"}, {"com.fasterxml.jackson.databind.jsontype.impl.ClassNameIdResolver", "getDescForKnownTypeIds", ""}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("java.lang.Object", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getDescForKnownTypeIds=class name used as type id, getMechanism=CLASS}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput071() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.jsontype.impl.ClassNameIdResolver", "com.fasterxml.jackson.databind.jsontype.impl.ClassNameIdResolver", "registerSubtype", new String[]{"java.lang.Class", "java.lang.String"}, new String[]{"<sample:3>", "java.util.ArrayList"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.jsontype.impl.ClassNameIdResolver", "_typeFromId", "java.lang.String,com.fasterxml.jackson.databind.DatabindContext", "http://example.com/a?b=c", "<null>"}}, 1);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getDescForKnownTypeIds=class name used as type id, getMechanism=CLASS}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput072() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.jsontype.impl.ClassNameIdResolver", "com.fasterxml.jackson.databind.jsontype.impl.ClassNameIdResolver", "idFromValueAndType", new String[]{"java.lang.Object", "java.lang.Class"}, new String[]{"<d:3.0>", "<sample:3>"}, false, 1, new String[][]{{"com.fasterxml.jackson.databind.jsontype.impl.ClassNameIdResolver", "getDescForKnownTypeIds", ""}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("generated.algorithm.SearchInputFactory_scaffolding$GenericLeaf", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getDescForKnownTypeIds=class name used as type id, getMechanism=CLASS}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput073() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.jsontype.impl.ClassNameIdResolver", "com.fasterxml.jackson.databind.jsontype.impl.ClassNameIdResolver", "_idFrom", new String[]{"java.lang.Object", "java.lang.Class", "com.fasterxml.jackson.databind.type.TypeFactory"}, new String[]{"<i:-2147483648>", "<empty>", "<sample:4>"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.jsontype.impl.ClassNameIdResolver", "idFromBaseType", ""}, {"com.fasterxml.jackson.databind.jsontype.impl.ClassNameIdResolver", "idFromBaseType", ""}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("java.lang.String", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getDescForKnownTypeIds=class name used as type id, getMechanism=CLASS}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput074() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.jsontype.impl.ClassNameIdResolver", "com.fasterxml.jackson.databind.jsontype.impl.ClassNameIdResolver", "_idFrom", new String[]{"java.lang.Object", "java.lang.Class", "com.fasterxml.jackson.databind.type.TypeFactory"}, new String[]{"<s:{C>", "<sample:9>", "<sample:7>"}, false, 1, new String[][]{{"com.fasterxml.jackson.databind.jsontype.impl.ClassNameIdResolver", "registerSubtype", "java.lang.Class,java.lang.String", "<sample:1>", "0"}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("java.util.Map", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getDescForKnownTypeIds=class name used as type id, getMechanism=CLASS}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput075() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.jsontype.impl.ClassNameIdResolver", "com.fasterxml.jackson.databind.jsontype.impl.ClassNameIdResolver", "idFromValueAndType", new String[]{"java.lang.Object", "java.lang.Class"}, new String[]{"<s:l>", "<sample:3>"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.jsontype.impl.ClassNameIdResolver", "registerSubtype", "java.lang.Class,java.lang.String", "<sample:1>", "a"}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("generated.algorithm.SearchInputFactory_scaffolding$GenericLeaf", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getDescForKnownTypeIds=class name used as type id, getMechanism=CLASS}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput076() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.jsontype.impl.ClassNameIdResolver", "com.fasterxml.jackson.databind.jsontype.impl.ClassNameIdResolver", "idFromBaseType", new String[]{}, new String[]{}, false, 7, new String[][]{}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("java.lang.Object", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getDescForKnownTypeIds=class name used as type id, getMechanism=CLASS}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput077() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.jsontype.impl.ClassNameIdResolver", "com.fasterxml.jackson.databind.jsontype.impl.ClassNameIdResolver", "_idFrom", new String[]{"java.lang.Object", "java.lang.Class", "com.fasterxml.jackson.databind.type.TypeFactory"}, new String[]{"<null>", "<sample:5>", "<sample:2>"}, false, 3, new String[][]{}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("java.lang.Object", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getDescForKnownTypeIds=class name used as type id, getMechanism=CLASS}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput078() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.jsontype.impl.ClassNameIdResolver", "com.fasterxml.jackson.databind.jsontype.impl.ClassNameIdResolver", "idFromValueAndType", new String[]{"java.lang.Object", "java.lang.Class"}, new String[]{"<i:-1>", "<sample:0>"}, false, 7, new String[][]{{"com.fasterxml.jackson.databind.jsontype.impl.ClassNameIdResolver", "idFromValueAndType", "java.lang.Object,java.lang.Class", "<sample:0>", "<sample:0>"}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("java.lang.String", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getDescForKnownTypeIds=class name used as type id, getMechanism=CLASS}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput079() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.jsontype.impl.ClassNameIdResolver", "com.fasterxml.jackson.databind.jsontype.impl.ClassNameIdResolver", "idFromBaseType", new String[]{}, new String[]{}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.jsontype.impl.ClassNameIdResolver", "idFromBaseType", ""}, {"com.fasterxml.jackson.databind.jsontype.impl.ClassNameIdResolver", "getMechanism", ""}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("generated.algorithm.SearchInputFactory_scaffolding$GenericSub", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getDescForKnownTypeIds=class name used as type id, getMechanism=CLASS}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput080() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.jsontype.impl.ClassNameIdResolver", "com.fasterxml.jackson.databind.jsontype.impl.ClassNameIdResolver", "_idFrom", new String[]{"java.lang.Object", "java.lang.Class", "com.fasterxml.jackson.databind.type.TypeFactory"}, new String[]{"<s:A>", "<sample:5>", "<sample:1>"}, false, 4, new String[][]{{"com.fasterxml.jackson.databind.jsontype.impl.ClassNameIdResolver", "init", "com.fasterxml.jackson.databind.JavaType", "<sample:5>"}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("java.lang.Object", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getDescForKnownTypeIds=class name used as type id, getMechanism=CLASS}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput081() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.jsontype.impl.ClassNameIdResolver", "com.fasterxml.jackson.databind.jsontype.impl.ClassNameIdResolver", "idFromValueAndType", new String[]{"java.lang.Object", "java.lang.Class"}, new String[]{"<s:b.>", "<sample:0>"}, false, 3, new String[][]{}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("java.lang.String", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getDescForKnownTypeIds=class name used as type id, getMechanism=CLASS}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput082() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.jsontype.impl.ClassNameIdResolver", "com.fasterxml.jackson.databind.jsontype.impl.ClassNameIdResolver", "_idFrom", new String[]{"java.lang.Object", "java.lang.Class", "com.fasterxml.jackson.databind.type.TypeFactory"}, new String[]{"<s:a>", "<null>", "<sample:6>"}, false, 7, new String[][]{{"com.fasterxml.jackson.databind.jsontype.impl.ClassNameIdResolver", "_idFrom", "java.lang.Object,java.lang.Class,com.fasterxml.jackson.databind.type.TypeFactory", "<i:2>", "<sample:8>", "<sample:7>"}}, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput083() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.jsontype.impl.ClassNameIdResolver", "com.fasterxml.jackson.databind.jsontype.impl.ClassNameIdResolver", "_idFrom", new String[]{"java.lang.Object", "java.lang.Class", "com.fasterxml.jackson.databind.type.TypeFactory"}, new String[]{"<i:14>", "<sample:6>", "<sample:1>"}, false, 7, new String[][]{}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("java.util.List", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getDescForKnownTypeIds=class name used as type id, getMechanism=CLASS}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput084() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.jsontype.impl.ClassNameIdResolver", "com.fasterxml.jackson.databind.jsontype.impl.ClassNameIdResolver", "idFromValueAndType", new String[]{"java.lang.Object", "java.lang.Class"}, new String[]{"<i:-1>", "<null>"}, false, 0, null, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput085() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.jsontype.impl.ClassNameIdResolver", "com.fasterxml.jackson.databind.jsontype.impl.ClassNameIdResolver", "_typeFromId", new String[]{"java.lang.String", "com.fasterxml.jackson.databind.DatabindContext"}, new String[]{">\t", "<sample:5>"}, false, 5, new String[][]{{"com.fasterxml.jackson.databind.jsontype.impl.ClassNameIdResolver", "_typeFromId", "java.lang.String,com.fasterxml.jackson.databind.DatabindContext", "0x1FInvalid type id '", "<sample:6>"}}, 1);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getDescForKnownTypeIds=class name used as type id, getMechanism=CLASS}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput086() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.jsontype.impl.ClassNameIdResolver", "com.fasterxml.jackson.databind.jsontype.impl.ClassNameIdResolver", "idFromValue", new String[]{"java.lang.Object"}, new String[]{"<b:true>"}, false, 0, null, 3);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("java.lang.Boolean", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getDescForKnownTypeIds=class name used as type id, getMechanism=CLASS}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput087() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.jsontype.impl.ClassNameIdResolver", "com.fasterxml.jackson.databind.jsontype.impl.ClassNameIdResolver", "typeFromId", new String[]{"com.fasterxml.jackson.databind.DatabindContext", "java.lang.String"}, new String[]{"<sample:5>", "-1.5"}, false, 6, new String[][]{}, 3);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getDescForKnownTypeIds=class name used as type id, getMechanism=CLASS}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput088() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.jsontype.impl.ClassNameIdResolver", "com.fasterxml.jackson.databind.jsontype.impl.ClassNameIdResolver", "getMechanism", new String[]{}, new String[]{}, false, 7, new String[][]{{"com.fasterxml.jackson.databind.jsontype.impl.ClassNameIdResolver", "idFromValueAndType", "java.lang.Object,java.lang.Class", "<s:a>", "<empty>"}}, 1);
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.annotation.JsonTypeInfo$Id", actual.getClass().getName());
  assertEquals("CLASS", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getDescForKnownTypeIds=class name used as type id, getMechanism=CLASS}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput089() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.jsontype.impl.ClassNameIdResolver", "com.fasterxml.jackson.databind.jsontype.impl.ClassNameIdResolver", "_idFrom", new String[]{"java.lang.Object", "java.lang.Class", "com.fasterxml.jackson.databind.type.TypeFactory"}, new String[]{"<s:kex>", "<sample:9>", "<sample:0>"}, false, 0, null, 1);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("java.util.Map", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getDescForKnownTypeIds=class name used as type id, getMechanism=CLASS}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput090() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.jsontype.impl.ClassNameIdResolver", "com.fasterxml.jackson.databind.jsontype.impl.ClassNameIdResolver", "init", new String[]{"com.fasterxml.jackson.databind.JavaType"}, new String[]{"<sample:5>"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.jsontype.impl.ClassNameIdResolver", "init", "com.fasterxml.jackson.databind.JavaType", "<sample:4>"}, {"com.fasterxml.jackson.databind.jsontype.impl.ClassNameIdResolver", "idFromValueAndType", "java.lang.Object,java.lang.Class", "<s:b,>", "<sample:0>"}}, 2);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getDescForKnownTypeIds=class name used as type id, getMechanism=CLASS}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput091() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.jsontype.impl.ClassNameIdResolver", "com.fasterxml.jackson.databind.jsontype.impl.ClassNameIdResolver", "idFromValue", new String[]{"java.lang.Object"}, new String[]{"<d:1.5>"}, false, 0, null, 3);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("java.lang.Double", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getDescForKnownTypeIds=class name used as type id, getMechanism=CLASS}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput092() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.jsontype.impl.ClassNameIdResolver", "com.fasterxml.jackson.databind.jsontype.impl.ClassNameIdResolver", "idFromValueAndType", new String[]{"java.lang.Object", "java.lang.Class"}, new String[]{"<i:-53>", "<sample:6>"}, false, 4, new String[][]{}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("java.util.List", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getDescForKnownTypeIds=class name used as type id, getMechanism=CLASS}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput093() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.jsontype.impl.ClassNameIdResolver", "com.fasterxml.jackson.databind.jsontype.impl.ClassNameIdResolver", "_idFrom", new String[]{"java.lang.Object", "java.lang.Class", "com.fasterxml.jackson.databind.type.TypeFactory"}, new String[]{"<i:-8>", "<sample:4>", "<sample:4>"}, false, 0, null, 1);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("java.lang.Integer", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getDescForKnownTypeIds=class name used as type id, getMechanism=CLASS}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput094() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.jsontype.impl.ClassNameIdResolver", "com.fasterxml.jackson.databind.jsontype.impl.ClassNameIdResolver", "idFromValueAndType", new String[]{"java.lang.Object", "java.lang.Class"}, new String[]{"<d:0.15>", "<sample:6>"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.jsontype.impl.ClassNameIdResolver", "idFromValue", "java.lang.Object", "<i:4>"}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("java.util.List", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getDescForKnownTypeIds=class name used as type id, getMechanism=CLASS}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput095() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.jsontype.impl.ClassNameIdResolver", "com.fasterxml.jackson.databind.jsontype.impl.ClassNameIdResolver", "idFromValueAndType", new String[]{"java.lang.Object", "java.lang.Class"}, new String[]{"<i:1>", "<null>"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.jsontype.impl.ClassNameIdResolver", "idFromValueAndType", "java.lang.Object,java.lang.Class", "<null>", "<sample:6>"}}, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput096() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.jsontype.impl.ClassNameIdResolver", "com.fasterxml.jackson.databind.jsontype.impl.ClassNameIdResolver", "_idFrom", new String[]{"java.lang.Object", "java.lang.Class", "com.fasterxml.jackson.databind.type.TypeFactory"}, new String[]{"<s:0b>", "<null>", "<sample:7>"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.jsontype.impl.ClassNameIdResolver", "typeFromId", "com.fasterxml.jackson.databind.DatabindContext,java.lang.String", "<sample:0>", "jyava.uti.ArrayList"}, {"com.fasterxml.jackson.databind.jsontype.impl.ClassNameIdResolver", "idFromValue", "java.lang.Object", "<s:a>"}}, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput097() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.jsontype.impl.ClassNameIdResolver", "com.fasterxml.jackson.databind.jsontype.impl.ClassNameIdResolver", "_idFrom", new String[]{"java.lang.Object", "java.lang.Class", "com.fasterxml.jackson.databind.type.TypeFactory"}, new String[]{"<d:1.536>", "<sample:6>", "<sample:7>"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.jsontype.impl.ClassNameIdResolver", "_idFrom", "java.lang.Object,java.lang.Class,com.fasterxml.jackson.databind.type.TypeFactory", "<null>", "<sample:1>", "<sample:1>"}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("java.util.List", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getDescForKnownTypeIds=class name used as type id, getMechanism=CLASS}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput098() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.jsontype.impl.ClassNameIdResolver", "com.fasterxml.jackson.databind.jsontype.impl.ClassNameIdResolver", "idFromValueAndType", new String[]{"java.lang.Object", "java.lang.Class"}, new String[]{"<i:0>", "<sample:8>"}, false, 6, new String[][]{{"com.fasterxml.jackson.databind.jsontype.impl.ClassNameIdResolver", "registerSubtype", "java.lang.Class,java.lang.String", "<sample:6>", "1.12345678801234567"}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("[Ljava.lang.String;", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getDescForKnownTypeIds=class name used as type id, getMechanism=CLASS}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput099() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.jsontype.impl.ClassNameIdResolver", "com.fasterxml.jackson.databind.jsontype.impl.ClassNameIdResolver", "idFromValueAndType", new String[]{"java.lang.Object", "java.lang.Class"}, new String[]{"<sample:0>", "<sample:9>"}, false);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("java.util.Map", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getDescForKnownTypeIds=class name used as type id, getMechanism=CLASS}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput100() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.jsontype.impl.ClassNameIdResolver", "com.fasterxml.jackson.databind.jsontype.impl.ClassNameIdResolver", "_idFrom", new String[]{"java.lang.Object", "java.lang.Class", "com.fasterxml.jackson.databind.type.TypeFactory"}, new String[]{"<s:key>", "<sample:7>", "<sample:0>"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.jsontype.impl.ClassNameIdResolver", "typeFromId", "com.fasterxml.jackson.databind.DatabindContext,java.lang.String", "<sample:5>", ""}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("int", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getDescForKnownTypeIds=class name used as type id, getMechanism=CLASS}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput101() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.jsontype.impl.ClassNameIdResolver", "com.fasterxml.jackson.databind.jsontype.impl.ClassNameIdResolver", "idFromValue", new String[]{"java.lang.Object"}, new String[]{"<i:0>"}, false, 0, null, 1);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("java.lang.Integer", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getDescForKnownTypeIds=class name used as type id, getMechanism=CLASS}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput102() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.jsontype.impl.ClassNameIdResolver", "com.fasterxml.jackson.databind.jsontype.impl.ClassNameIdResolver", "idFromValue", new String[]{"java.lang.Object"}, new String[]{"<null>"}, false, 6, new String[][]{{"com.fasterxml.jackson.databind.jsontype.impl.ClassNameIdResolver", "registerSubtype", "java.lang.Class,java.lang.String", "<sample:6>", "//b"}}, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput103() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.jsontype.impl.ClassNameIdResolver", "com.fasterxml.jackson.databind.jsontype.impl.ClassNameIdResolver", "_typeFromId", new String[]{"java.lang.String", "com.fasterxml.jackson.databind.DatabindContext"}, new String[]{"Mist<a>b</a>", "<sample:5>"}, false, 2, new String[][]{{"com.fasterxml.jackson.databind.jsontype.impl.ClassNameIdResolver", "getMechanism", ""}, {"com.fasterxml.jackson.databind.jsontype.impl.ClassNameIdResolver", "idFromBaseType", ""}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput104() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.jsontype.impl.ClassNameIdResolver", "com.fasterxml.jackson.databind.jsontype.impl.ClassNameIdResolver", "_idFrom", new String[]{"java.lang.Object", "java.lang.Class", "com.fasterxml.jackson.databind.type.TypeFactory"}, new String[]{"<sample:2>", "<sample:11>", "<sample:9>"}, false, 5, new String[][]{}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("java.lang.Number", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getDescForKnownTypeIds=class name used as type id, getMechanism=CLASS}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput105() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.jsontype.impl.ClassNameIdResolver", "com.fasterxml.jackson.databind.jsontype.impl.ClassNameIdResolver", "idFromValueAndType", new String[]{"java.lang.Object", "java.lang.Class"}, new String[]{"<sample:0>", "<empty>"}, false, 5, new String[][]{{"com.fasterxml.jackson.databind.jsontype.impl.ClassNameIdResolver", "getMechanism", ""}, {"com.fasterxml.jackson.databind.jsontype.impl.ClassNameIdResolver", "idFromValueAndType", "java.lang.Object,java.lang.Class", "<s:a>", "<null>"}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("java.lang.String", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getDescForKnownTypeIds=class name used as type id, getMechanism=CLASS}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput106() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.jsontype.impl.ClassNameIdResolver", "com.fasterxml.jackson.databind.jsontype.impl.ClassNameIdResolver", "idFromValueAndType", new String[]{"java.lang.Object", "java.lang.Class"}, new String[]{"<s:>", "<sample:6>"}, false, 6, new String[][]{{"com.fasterxml.jackson.databind.jsontype.impl.ClassNameIdResolver", "idFromBaseType", ""}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("java.util.List", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getDescForKnownTypeIds=class name used as type id, getMechanism=CLASS}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput107() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.jsontype.impl.ClassNameIdResolver", "com.fasterxml.jackson.databind.jsontype.impl.ClassNameIdResolver", "_idFrom", new String[]{"java.lang.Object", "java.lang.Class", "com.fasterxml.jackson.databind.type.TypeFactory"}, new String[]{"<s:bb>", "<sample:8>", "<sample:3>"}, false, 5, new String[][]{}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("[Ljava.lang.String;", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getDescForKnownTypeIds=class name used as type id, getMechanism=CLASS}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput108() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.jsontype.impl.ClassNameIdResolver", "com.fasterxml.jackson.databind.jsontype.impl.ClassNameIdResolver", "idFromValue", new String[]{"java.lang.Object"}, new String[]{"<b:true>"}, false, 0, null, 2);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("java.lang.Boolean", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getDescForKnownTypeIds=class name used as type id, getMechanism=CLASS}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput109() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.jsontype.impl.ClassNameIdResolver", "com.fasterxml.jackson.databind.jsontype.impl.ClassNameIdResolver", "idFromValueAndType", new String[]{"java.lang.Object", "java.lang.Class"}, new String[]{"<s:>", "<sample:5>"}, false, 0, null, 3);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("java.lang.Object", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getDescForKnownTypeIds=class name used as type id, getMechanism=CLASS}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput110() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.jsontype.impl.ClassNameIdResolver", "com.fasterxml.jackson.databind.jsontype.impl.ClassNameIdResolver", "idFromValueAndType", new String[]{"java.lang.Object", "java.lang.Class"}, new String[]{"<i:1>", "<null>"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.jsontype.impl.ClassNameIdResolver", "idFromValueAndType", "java.lang.Object,java.lang.Class", "<i:-2>", "<sample:1>"}, {"com.fasterxml.jackson.databind.jsontype.impl.ClassNameIdResolver", "idFromValueAndType", "java.lang.Object,java.lang.Class", "<i:0>", "<sample:6>"}}, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput111() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.jsontype.impl.ClassNameIdResolver", "com.fasterxml.jackson.databind.jsontype.impl.ClassNameIdResolver", "_idFrom", new String[]{"java.lang.Object", "java.lang.Class", "com.fasterxml.jackson.databind.type.TypeFactory"}, new String[]{"<i:1>", "<sample:12>", "<sample:2>"}, false, 2, new String[][]{{"com.fasterxml.jackson.databind.jsontype.impl.ClassNameIdResolver", "idFromValueAndType", "java.lang.Object,java.lang.Class", "<s:a>", "<sample:6>"}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("java.util.Collection", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getDescForKnownTypeIds=class name used as type id, getMechanism=CLASS}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput112() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.jsontype.impl.ClassNameIdResolver", "com.fasterxml.jackson.databind.jsontype.impl.ClassNameIdResolver", "typeFromId", new String[]{"com.fasterxml.jackson.databind.DatabindContext", "java.lang.String"}, new String[]{"<sample:8>", "=a>b</a>"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.jsontype.impl.ClassNameIdResolver", "getMechanism", ""}}, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput113() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.jsontype.impl.ClassNameIdResolver", "com.fasterxml.jackson.databind.jsontype.impl.ClassNameIdResolver", "idFromValueAndType", new String[]{"java.lang.Object", "java.lang.Class"}, new String[]{"<s:>", "<sample:9>"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.jsontype.impl.ClassNameIdResolver", "getMechanism", ""}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("java.util.Map", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getDescForKnownTypeIds=class name used as type id, getMechanism=CLASS}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput114() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.jsontype.impl.ClassNameIdResolver", "com.fasterxml.jackson.databind.jsontype.impl.ClassNameIdResolver", "idFromValueAndType", new String[]{"java.lang.Object", "java.lang.Class"}, new String[]{"<sample:0>", "<sample:5>"}, false, 2, new String[][]{}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("java.lang.Object", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getDescForKnownTypeIds=class name used as type id, getMechanism=CLASS}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput115() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.jsontype.impl.ClassNameIdResolver", "com.fasterxml.jackson.databind.jsontype.impl.ClassNameIdResolver", "_typeFromId", new String[]{"java.lang.String", "com.fasterxml.jackson.databind.DatabindContext"}, new String[]{"1.5e310", "<sample:5>"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.jsontype.impl.ClassNameIdResolver", "typeFromId", "com.fasterxml.jackson.databind.DatabindContext,java.lang.String", "<sample:2>", ".Arrays$"}}, 2);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getDescForKnownTypeIds=class name used as type id, getMechanism=CLASS}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput116() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.jsontype.impl.ClassNameIdResolver", "com.fasterxml.jackson.databind.jsontype.impl.ClassNameIdResolver", "typeFromId", new String[]{"com.fasterxml.jackson.databind.DatabindContext", "java.lang.String"}, new String[]{"<sample:5>", "1.12345f678901234567<a>b</a>"}, false, 2, new String[][]{{"com.fasterxml.jackson.databind.jsontype.impl.ClassNameIdResolver", "init", "com.fasterxml.jackson.databind.JavaType", "<sample:5>"}, {"com.fasterxml.jackson.databind.jsontype.impl.ClassNameIdResolver", "getDescForKnownTypeIds", ""}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput117() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.jsontype.impl.ClassNameIdResolver", "com.fasterxml.jackson.databind.jsontype.impl.ClassNameIdResolver", "idFromValueAndType", new String[]{"java.lang.Object", "java.lang.Class"}, new String[]{"<s:`>", "<sample:4>"}, false, 2, new String[][]{{"com.fasterxml.jackson.databind.jsontype.impl.ClassNameIdResolver", "idFromBaseType", ""}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("java.lang.Integer", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getDescForKnownTypeIds=class name used as type id, getMechanism=CLASS}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput118() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.jsontype.impl.ClassNameIdResolver", "com.fasterxml.jackson.databind.jsontype.impl.ClassNameIdResolver", "idFromValueAndType", new String[]{"java.lang.Object", "java.lang.Class"}, new String[]{"<s:>a>", "<sample:9>"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.jsontype.impl.ClassNameIdResolver", "getMechanism", ""}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("java.util.Map", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getDescForKnownTypeIds=class name used as type id, getMechanism=CLASS}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput119() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.jsontype.impl.ClassNameIdResolver", "com.fasterxml.jackson.databind.jsontype.impl.ClassNameIdResolver", "_typeFromId", new String[]{"java.lang.String", "com.fasterxml.jackson.databind.DatabindContext"}, new String[]{"java.util.ArrayList", "<sample:5>"}, false, 0, null, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput120() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.jsontype.impl.ClassNameIdResolver", "com.fasterxml.jackson.databind.jsontype.impl.ClassNameIdResolver", "_idFrom", new String[]{"java.lang.Object", "java.lang.Class", "com.fasterxml.jackson.databind.type.TypeFactory"}, new String[]{"<b:false>", "<sample:7>", "<sample:3>"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.jsontype.impl.ClassNameIdResolver", "_idFrom", "java.lang.Object,java.lang.Class,com.fasterxml.jackson.databind.type.TypeFactory", "<s:a>", "<sample:2>", "<sample:0>"}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("int", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getDescForKnownTypeIds=class name used as type id, getMechanism=CLASS}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput121() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.jsontype.impl.ClassNameIdResolver", "com.fasterxml.jackson.databind.jsontype.impl.ClassNameIdResolver", "idFromValueAndType", new String[]{"java.lang.Object", "java.lang.Class"}, new String[]{"<s:b>", "<sample:8>"}, false, 0, null, 1);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("[Ljava.lang.String;", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getDescForKnownTypeIds=class name used as type id, getMechanism=CLASS}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput122() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.jsontype.impl.ClassNameIdResolver", "com.fasterxml.jackson.databind.jsontype.impl.ClassNameIdResolver", "idFromValue", new String[]{"java.lang.Object"}, new String[]{"<d:150.0>"}, false, 0, null, 1);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("java.lang.Double", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getDescForKnownTypeIds=class name used as type id, getMechanism=CLASS}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput123() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.jsontype.impl.ClassNameIdResolver", "com.fasterxml.jackson.databind.jsontype.impl.ClassNameIdResolver", "idFromValueAndType", new String[]{"java.lang.Object", "java.lang.Class"}, new String[]{"<b:true>", "<sample:5>"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.jsontype.impl.ClassNameIdResolver", "registerSubtype", "java.lang.Class,java.lang.String", "<sample:2>", ""}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("java.lang.Object", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getDescForKnownTypeIds=class name used as type id, getMechanism=CLASS}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput124() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.jsontype.impl.ClassNameIdResolver", "com.fasterxml.jackson.databind.jsontype.impl.ClassNameIdResolver", "idFromValue", new String[]{"java.lang.Object"}, new String[]{"<d:15.0>"}, false, 6, new String[][]{{"com.fasterxml.jackson.databind.jsontype.impl.ClassNameIdResolver", "idFromValueAndType", "java.lang.Object,java.lang.Class", "<s:ky>", "<sample:4>"}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("java.lang.Double", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getDescForKnownTypeIds=class name used as type id, getMechanism=CLASS}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput125() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.jsontype.impl.ClassNameIdResolver", "com.fasterxml.jackson.databind.jsontype.impl.ClassNameIdResolver", "idFromValueAndType", new String[]{"java.lang.Object", "java.lang.Class"}, new String[]{"<s:[>", "<sample:9>"}, false, 0, null, 2);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("java.util.Map", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getDescForKnownTypeIds=class name used as type id, getMechanism=CLASS}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput126() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.jsontype.impl.ClassNameIdResolver", "com.fasterxml.jackson.databind.jsontype.impl.ClassNameIdResolver", "getMechanism", new String[]{}, new String[]{}, false, 3, new String[][]{{"com.fasterxml.jackson.databind.jsontype.impl.ClassNameIdResolver", "typeFromId", "com.fasterxml.jackson.databind.DatabindContext,java.lang.String", "<sample:5>", "java.util.ArrayList"}});
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.annotation.JsonTypeInfo$Id", actual.getClass().getName());
  assertEquals("CLASS", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getDescForKnownTypeIds=class name used as type id, getMechanism=CLASS}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput127() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.jsontype.impl.ClassNameIdResolver", "com.fasterxml.jackson.databind.jsontype.impl.ClassNameIdResolver", "idFromValueAndType", new String[]{"java.lang.Object", "java.lang.Class"}, new String[]{"<s:kee>", "<sample:8>"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.jsontype.impl.ClassNameIdResolver", "getMechanism", ""}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("[Ljava.lang.String;", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getDescForKnownTypeIds=class name used as type id, getMechanism=CLASS}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput128() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.jsontype.impl.ClassNameIdResolver", "com.fasterxml.jackson.databind.jsontype.impl.ClassNameIdResolver", "idFromValueAndType", new String[]{"java.lang.Object", "java.lang.Class"}, new String[]{"<i:-1>", "<sample:7>"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.jsontype.impl.ClassNameIdResolver", "init", "com.fasterxml.jackson.databind.JavaType", "<null>"}, {"com.fasterxml.jackson.databind.jsontype.impl.ClassNameIdResolver", "registerSubtype", "java.lang.Class,java.lang.String", "<sample:7>", "+b,c"}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("int", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getDescForKnownTypeIds=class name used as type id, getMechanism=CLASS}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput129() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.jsontype.impl.ClassNameIdResolver", "com.fasterxml.jackson.databind.jsontype.impl.ClassNameIdResolver", "idFromValueAndType", new String[]{"java.lang.Object", "java.lang.Class"}, new String[]{"<s:B>", "<sample:4>"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.jsontype.impl.ClassNameIdResolver", "init", "com.fasterxml.jackson.databind.JavaType", "<sample:0>"}, {"com.fasterxml.jackson.databind.jsontype.impl.ClassNameIdResolver", "idFromBaseType", ""}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("java.lang.Integer", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getDescForKnownTypeIds=class name used as type id, getMechanism=CLASS}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput130() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.jsontype.impl.ClassNameIdResolver", "com.fasterxml.jackson.databind.jsontype.impl.ClassNameIdResolver", "idFromValue", new String[]{"java.lang.Object"}, new String[]{"<null>"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.jsontype.impl.ClassNameIdResolver", "idFromValueAndType", "java.lang.Object,java.lang.Class", "<b:true>", "<sample:2>"}, {"com.fasterxml.jackson.databind.jsontype.impl.ClassNameIdResolver", "idFromBaseType", ""}}, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
}
