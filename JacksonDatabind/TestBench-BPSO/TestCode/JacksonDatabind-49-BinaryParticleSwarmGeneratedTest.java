package generated.algorithm;

import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;
import static org.junit.Assert.*;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class BinaryParticleSwarmGeneratedTest {
 @Test(timeout = 20000)
 public void generatedInput000() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ser.impl.WritableObjectId", "com.fasterxml.jackson.databind.ser.impl.WritableObjectId", "generateId", new String[]{"java.lang.Object"}, new String[]{"<s:8>"}, false, 7, new String[][]{{"com.fasterxml.jackson.databind.ser.impl.WritableObjectId", "generateId", "java.lang.Object", "<sample:1>"}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("-1", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput001() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ser.impl.WritableObjectId", "com.fasterxml.jackson.databind.ser.impl.WritableObjectId", "writeAsId", new String[]{"com.fasterxml.jackson.core.JsonGenerator", "com.fasterxml.jackson.databind.SerializerProvider", "com.fasterxml.jackson.databind.ser.impl.ObjectIdWriter"}, new String[]{"<sample:5>", "<sample:9>", "<null>"}, false);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput002() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ser.impl.WritableObjectId", "com.fasterxml.jackson.databind.ser.impl.WritableObjectId", "writeAsField", new String[]{"com.fasterxml.jackson.core.JsonGenerator", "com.fasterxml.jackson.databind.SerializerProvider", "com.fasterxml.jackson.databind.ser.impl.ObjectIdWriter"}, new String[]{"<sample:3>", "<sample:6>", "<sample:4>"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.ser.impl.WritableObjectId", "generateId", "java.lang.Object", "<i:-2147483648>"}}, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput003() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ser.impl.WritableObjectId", "com.fasterxml.jackson.databind.ser.impl.WritableObjectId", "writeAsField", new String[]{"com.fasterxml.jackson.core.JsonGenerator", "com.fasterxml.jackson.databind.SerializerProvider", "com.fasterxml.jackson.databind.ser.impl.ObjectIdWriter"}, new String[]{"<sample:6>", "<sample:1>", "<sample:7>"}, false, 7, new String[][]{{"com.fasterxml.jackson.databind.ser.impl.WritableObjectId", "writeAsField", "com.fasterxml.jackson.core.JsonGenerator,com.fasterxml.jackson.databind.SerializerProvider,com.fasterxml.jackson.databind.ser.impl.ObjectIdWriter", "<sample:3>", "<sample:2>", "<sample:3>"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput004() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ser.impl.WritableObjectId", "com.fasterxml.jackson.databind.ser.impl.WritableObjectId", "writeAsField", new String[]{"com.fasterxml.jackson.core.JsonGenerator", "com.fasterxml.jackson.databind.SerializerProvider", "com.fasterxml.jackson.databind.ser.impl.ObjectIdWriter"}, new String[]{"<sample:2>", "<sample:9>", "<sample:7>"}, false, 1, new String[][]{{"com.fasterxml.jackson.databind.ser.impl.WritableObjectId", "writeAsField", "com.fasterxml.jackson.core.JsonGenerator,com.fasterxml.jackson.databind.SerializerProvider,com.fasterxml.jackson.databind.ser.impl.ObjectIdWriter", "<sample:2>", "<sample:7>", "<sample:4>"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("com.fasterxml.jackson.databind.JsonMappingException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput005() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ser.impl.WritableObjectId", "com.fasterxml.jackson.databind.ser.impl.WritableObjectId", "generateId", new String[]{"java.lang.Object"}, new String[]{"<i:-524286>"}, false), new String[][]{{"version", "", "1"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("4", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput006() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ser.impl.WritableObjectId", "com.fasterxml.jackson.databind.ser.impl.WritableObjectId", "generateId", new String[]{"java.lang.Object"}, new String[]{"<sample:1>"}, false, 4, new String[][]{{"com.fasterxml.jackson.databind.ser.impl.WritableObjectId", "generateId", "java.lang.Object", "<s:X>"}}), new String[][]{{"node", "", "6"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.UnsupportedOperationException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput007() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ser.impl.WritableObjectId", "com.fasterxml.jackson.databind.ser.impl.WritableObjectId", "generateId", new String[]{"java.lang.Object"}, new String[]{"<b:true>"}, false, 0, null, 3), new String[][]{{"timestamp", "", "4"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.UnsupportedOperationException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput008() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ser.impl.WritableObjectId", "com.fasterxml.jackson.databind.ser.impl.WritableObjectId", "generateId", new String[]{"java.lang.Object"}, new String[]{"<b:true>"}, false, 5, new String[][]{{"com.fasterxml.jackson.databind.ser.impl.WritableObjectId", "generateId", "java.lang.Object", "<i:0>"}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("2", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput009() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ser.impl.WritableObjectId", "com.fasterxml.jackson.databind.ser.impl.WritableObjectId", "generateId", new String[]{"java.lang.Object"}, new String[]{"<s:aI>"}, false, 5, new String[][]{});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("2", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput010() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ser.impl.WritableObjectId", "com.fasterxml.jackson.databind.ser.impl.WritableObjectId", "generateId", new String[]{"java.lang.Object"}, new String[]{"<i:10>"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.ser.impl.WritableObjectId", "writeAsField", "com.fasterxml.jackson.core.JsonGenerator,com.fasterxml.jackson.databind.SerializerProvider,com.fasterxml.jackson.databind.ser.impl.ObjectIdWriter", "<sample:0>", "<sample:7>", "<null>"}}, 1), new String[][]{{"node", "", "3"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.UnsupportedOperationException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput011() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ser.impl.WritableObjectId", "com.fasterxml.jackson.databind.ser.impl.WritableObjectId", "generateId", new String[]{"java.lang.Object"}, new String[]{"<s:kecly>"}, false, 7, new String[][]{{"com.fasterxml.jackson.databind.ser.impl.WritableObjectId", "writeAsId", "com.fasterxml.jackson.core.JsonGenerator,com.fasterxml.jackson.databind.SerializerProvider,com.fasterxml.jackson.databind.ser.impl.ObjectIdWriter", "<sample:5>", "<sample:1>", "<sample:6>"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("-1", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput012() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ser.impl.WritableObjectId", "com.fasterxml.jackson.databind.ser.impl.WritableObjectId", "generateId", new String[]{"java.lang.Object"}, new String[]{"<s:a>"}, false, 3, new String[][]{{"com.fasterxml.jackson.databind.ser.impl.WritableObjectId", "writeAsField", "com.fasterxml.jackson.core.JsonGenerator,com.fasterxml.jackson.databind.SerializerProvider,com.fasterxml.jackson.databind.ser.impl.ObjectIdWriter", "<sample:6>", "<sample:7>", "<sample:7>"}, {"com.fasterxml.jackson.databind.ser.impl.WritableObjectId", "generateId", "java.lang.Object", "<s:b>"}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("-1", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput013() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ser.impl.WritableObjectId", "com.fasterxml.jackson.databind.ser.impl.WritableObjectId", "writeAsField", new String[]{"com.fasterxml.jackson.core.JsonGenerator", "com.fasterxml.jackson.databind.SerializerProvider", "com.fasterxml.jackson.databind.ser.impl.ObjectIdWriter"}, new String[]{"<sample:2>", "<sample:3>", "<sample:3>"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.ser.impl.WritableObjectId", "writeAsId", "com.fasterxml.jackson.core.JsonGenerator,com.fasterxml.jackson.databind.SerializerProvider,com.fasterxml.jackson.databind.ser.impl.ObjectIdWriter", "<sample:2>", "<sample:9>", "<sample:3>"}, {"com.fasterxml.jackson.databind.ser.impl.WritableObjectId", "generateId", "java.lang.Object", "<s:d>"}}, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.ClassCastException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput014() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ser.impl.WritableObjectId", "com.fasterxml.jackson.databind.ser.impl.WritableObjectId", "writeAsField", new String[]{"com.fasterxml.jackson.core.JsonGenerator", "com.fasterxml.jackson.databind.SerializerProvider", "com.fasterxml.jackson.databind.ser.impl.ObjectIdWriter"}, new String[]{"<sample:5>", "<sample:5>", "<sample:4>"}, false, 0, null, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IndexOutOfBoundsException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput015() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ser.impl.WritableObjectId", "com.fasterxml.jackson.databind.ser.impl.WritableObjectId", "writeAsField", new String[]{"com.fasterxml.jackson.core.JsonGenerator", "com.fasterxml.jackson.databind.SerializerProvider", "com.fasterxml.jackson.databind.ser.impl.ObjectIdWriter"}, new String[]{"<sample:5>", "<sample:5>", "<sample:4>"}, false, 5, new String[][]{}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IndexOutOfBoundsException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput016() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ser.impl.WritableObjectId", "com.fasterxml.jackson.databind.ser.impl.WritableObjectId", "writeAsField", new String[]{"com.fasterxml.jackson.core.JsonGenerator", "com.fasterxml.jackson.databind.SerializerProvider", "com.fasterxml.jackson.databind.ser.impl.ObjectIdWriter"}, new String[]{"<sample:2>", "<sample:9>", "<sample:0>"}, false, 6, new String[][]{}, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput017() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ser.impl.WritableObjectId", "com.fasterxml.jackson.databind.ser.impl.WritableObjectId", "writeAsId", new String[]{"com.fasterxml.jackson.core.JsonGenerator", "com.fasterxml.jackson.databind.SerializerProvider", "com.fasterxml.jackson.databind.ser.impl.ObjectIdWriter"}, new String[]{"<sample:0>", "<sample:3>", "<sample:0>"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.ser.impl.WritableObjectId", "writeAsId", "com.fasterxml.jackson.core.JsonGenerator,com.fasterxml.jackson.databind.SerializerProvider,com.fasterxml.jackson.databind.ser.impl.ObjectIdWriter", "<sample:5>", "<sample:3>", "<sample:3>"}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput018() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ser.impl.WritableObjectId", "com.fasterxml.jackson.databind.ser.impl.WritableObjectId", "writeAsField", new String[]{"com.fasterxml.jackson.core.JsonGenerator", "com.fasterxml.jackson.databind.SerializerProvider", "com.fasterxml.jackson.databind.ser.impl.ObjectIdWriter"}, new String[]{"<sample:0>", "<sample:10>", "<sample:3>"}, false, 0, null, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput019() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ser.impl.WritableObjectId", "com.fasterxml.jackson.databind.ser.impl.WritableObjectId", "writeAsId", new String[]{"com.fasterxml.jackson.core.JsonGenerator", "com.fasterxml.jackson.databind.SerializerProvider", "com.fasterxml.jackson.databind.ser.impl.ObjectIdWriter"}, new String[]{"<sample:0>", "<sample:1>", "<sample:3>"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.ser.impl.WritableObjectId", "generateId", "java.lang.Object", "<i:2>"}, {"com.fasterxml.jackson.databind.ser.impl.WritableObjectId", "generateId", "java.lang.Object", "<sample:0>"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput020() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ser.impl.WritableObjectId", "com.fasterxml.jackson.databind.ser.impl.WritableObjectId", "writeAsField", new String[]{"com.fasterxml.jackson.core.JsonGenerator", "com.fasterxml.jackson.databind.SerializerProvider", "com.fasterxml.jackson.databind.ser.impl.ObjectIdWriter"}, new String[]{"<sample:2>", "<sample:4>", "<sample:0>"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.ser.impl.WritableObjectId", "writeAsId", "com.fasterxml.jackson.core.JsonGenerator,com.fasterxml.jackson.databind.SerializerProvider,com.fasterxml.jackson.databind.ser.impl.ObjectIdWriter", "<sample:6>", "<sample:2>", "<sample:3>"}, {"com.fasterxml.jackson.databind.ser.impl.WritableObjectId", "generateId", "java.lang.Object", "<s:>"}}, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.ClassCastException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput021() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ser.impl.WritableObjectId", "com.fasterxml.jackson.databind.ser.impl.WritableObjectId", "generateId", new String[]{"java.lang.Object"}, new String[]{"<s:8>"}, false, 6, new String[][]{{"com.fasterxml.jackson.databind.ser.impl.WritableObjectId", "writeAsId", "com.fasterxml.jackson.core.JsonGenerator,com.fasterxml.jackson.databind.SerializerProvider,com.fasterxml.jackson.databind.ser.impl.ObjectIdWriter", "<sample:4>", "<sample:8>", "<sample:7>"}}, 2), new String[][]{{"node", "", "6"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.UnsupportedOperationException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput022() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ser.impl.WritableObjectId", "com.fasterxml.jackson.databind.ser.impl.WritableObjectId", "writeAsField", new String[]{"com.fasterxml.jackson.core.JsonGenerator", "com.fasterxml.jackson.databind.SerializerProvider", "com.fasterxml.jackson.databind.ser.impl.ObjectIdWriter"}, new String[]{"<sample:5>", "<sample:2>", "<sample:2>"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.ser.impl.WritableObjectId", "writeAsId", "com.fasterxml.jackson.core.JsonGenerator,com.fasterxml.jackson.databind.SerializerProvider,com.fasterxml.jackson.databind.ser.impl.ObjectIdWriter", "<sample:7>", "<sample:2>", "<sample:1>"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.ArrayIndexOutOfBoundsException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput023() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ser.impl.WritableObjectId", "com.fasterxml.jackson.databind.ser.impl.WritableObjectId", "writeAsId", new String[]{"com.fasterxml.jackson.core.JsonGenerator", "com.fasterxml.jackson.databind.SerializerProvider", "com.fasterxml.jackson.databind.ser.impl.ObjectIdWriter"}, new String[]{"<sample:2>", "<sample:3>", "<sample:0>"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.ser.impl.WritableObjectId", "generateId", "java.lang.Object", "<s:`>"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.ClassCastException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput024() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ser.impl.WritableObjectId", "com.fasterxml.jackson.databind.ser.impl.WritableObjectId", "writeAsField", new String[]{"com.fasterxml.jackson.core.JsonGenerator", "com.fasterxml.jackson.databind.SerializerProvider", "com.fasterxml.jackson.databind.ser.impl.ObjectIdWriter"}, new String[]{"<sample:1>", "<sample:3>", "<sample:3>"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.ser.impl.WritableObjectId", "generateId", "java.lang.Object", "<s:`4>"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.ClassCastException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput025() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ser.impl.WritableObjectId", "com.fasterxml.jackson.databind.ser.impl.WritableObjectId", "writeAsId", new String[]{"com.fasterxml.jackson.core.JsonGenerator", "com.fasterxml.jackson.databind.SerializerProvider", "com.fasterxml.jackson.databind.ser.impl.ObjectIdWriter"}, new String[]{"<sample:7>", "<sample:1>", "<sample:2>"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.ser.impl.WritableObjectId", "generateId", "java.lang.Object", "<s:`>"}, {"com.fasterxml.jackson.databind.ser.impl.WritableObjectId", "generateId", "java.lang.Object", "<s:ley>"}}, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput026() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ser.impl.WritableObjectId", "com.fasterxml.jackson.databind.ser.impl.WritableObjectId", "writeAsId", new String[]{"com.fasterxml.jackson.core.JsonGenerator", "com.fasterxml.jackson.databind.SerializerProvider", "com.fasterxml.jackson.databind.ser.impl.ObjectIdWriter"}, new String[]{"<sample:8>", "<sample:5>", "<sample:5>"}, false, 7, new String[][]{{"com.fasterxml.jackson.databind.ser.impl.WritableObjectId", "writeAsId", "com.fasterxml.jackson.core.JsonGenerator,com.fasterxml.jackson.databind.SerializerProvider,com.fasterxml.jackson.databind.ser.impl.ObjectIdWriter", "<sample:4>", "<sample:4>", "<null>"}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput027() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ser.impl.WritableObjectId", "com.fasterxml.jackson.databind.ser.impl.WritableObjectId", "writeAsField", new String[]{"com.fasterxml.jackson.core.JsonGenerator", "com.fasterxml.jackson.databind.SerializerProvider", "com.fasterxml.jackson.databind.ser.impl.ObjectIdWriter"}, new String[]{"<sample:2>", "<null>", "<sample:6>"}, false, 2, new String[][]{{"com.fasterxml.jackson.databind.ser.impl.WritableObjectId", "writeAsField", "com.fasterxml.jackson.core.JsonGenerator,com.fasterxml.jackson.databind.SerializerProvider,com.fasterxml.jackson.databind.ser.impl.ObjectIdWriter", "<sample:1>", "<sample:9>", "<sample:3>"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput028() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ser.impl.WritableObjectId", "com.fasterxml.jackson.databind.ser.impl.WritableObjectId", "writeAsId", new String[]{"com.fasterxml.jackson.core.JsonGenerator", "com.fasterxml.jackson.databind.SerializerProvider", "com.fasterxml.jackson.databind.ser.impl.ObjectIdWriter"}, new String[]{"<sample:3>", "<sample:9>", "<sample:2>"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.ser.impl.WritableObjectId", "generateId", "java.lang.Object", "<i:-2147483648>"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput029() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ser.impl.WritableObjectId", "com.fasterxml.jackson.databind.ser.impl.WritableObjectId", "generateId", new String[]{"java.lang.Object"}, new String[]{"<i:-2147483648>"}, false, 2, new String[][]{{"com.fasterxml.jackson.databind.ser.impl.WritableObjectId", "writeAsField", "com.fasterxml.jackson.core.JsonGenerator,com.fasterxml.jackson.databind.SerializerProvider,com.fasterxml.jackson.databind.ser.impl.ObjectIdWriter", "<null>", "<sample:1>", "<sample:2>"}}, 2), new String[][]{{"variant", "", "6"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("2", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput030() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ser.impl.WritableObjectId", "com.fasterxml.jackson.databind.ser.impl.WritableObjectId", "writeAsField", new String[]{"com.fasterxml.jackson.core.JsonGenerator", "com.fasterxml.jackson.databind.SerializerProvider", "com.fasterxml.jackson.databind.ser.impl.ObjectIdWriter"}, new String[]{"<sample:2>", "<sample:1>", "<sample:2>"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.ser.impl.WritableObjectId", "generateId", "java.lang.Object", "<s:key>"}}, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.ClassCastException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput031() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ser.impl.WritableObjectId", "com.fasterxml.jackson.databind.ser.impl.WritableObjectId", "generateId", new String[]{"java.lang.Object"}, new String[]{"<i:1>"}, false, 1, new String[][]{{"com.fasterxml.jackson.databind.ser.impl.WritableObjectId", "writeAsField", "com.fasterxml.jackson.core.JsonGenerator,com.fasterxml.jackson.databind.SerializerProvider,com.fasterxml.jackson.databind.ser.impl.ObjectIdWriter", "<null>", "<sample:3>", "<null>"}, {"com.fasterxml.jackson.databind.ser.impl.WritableObjectId", "writeAsId", "com.fasterxml.jackson.core.JsonGenerator,com.fasterxml.jackson.databind.SerializerProvider,com.fasterxml.jackson.databind.ser.impl.ObjectIdWriter", "<sample:8>", "<sample:6>", "<sample:2>"}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("1", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput032() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ser.impl.WritableObjectId", "com.fasterxml.jackson.databind.ser.impl.WritableObjectId", "writeAsId", new String[]{"com.fasterxml.jackson.core.JsonGenerator", "com.fasterxml.jackson.databind.SerializerProvider", "com.fasterxml.jackson.databind.ser.impl.ObjectIdWriter"}, new String[]{"<sample:10>", "<sample:9>", "<sample:1>"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.ser.impl.WritableObjectId", "writeAsField", "com.fasterxml.jackson.core.JsonGenerator,com.fasterxml.jackson.databind.SerializerProvider,com.fasterxml.jackson.databind.ser.impl.ObjectIdWriter", "<sample:4>", "<sample:4>", "<sample:6>"}, {"com.fasterxml.jackson.databind.ser.impl.WritableObjectId", "generateId", "java.lang.Object", "<i:0>"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.ClassCastException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput033() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ser.impl.WritableObjectId", "com.fasterxml.jackson.databind.ser.impl.WritableObjectId", "generateId", new String[]{"java.lang.Object"}, new String[]{"<s:a>"}, false, 5, new String[][]{{"com.fasterxml.jackson.databind.ser.impl.WritableObjectId", "writeAsField", "com.fasterxml.jackson.core.JsonGenerator,com.fasterxml.jackson.databind.SerializerProvider,com.fasterxml.jackson.databind.ser.impl.ObjectIdWriter", "<sample:2>", "<sample:5>", "<sample:6>"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("2", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput034() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ser.impl.WritableObjectId", "com.fasterxml.jackson.databind.ser.impl.WritableObjectId", "writeAsId", new String[]{"com.fasterxml.jackson.core.JsonGenerator", "com.fasterxml.jackson.databind.SerializerProvider", "com.fasterxml.jackson.databind.ser.impl.ObjectIdWriter"}, new String[]{"<sample:3>", "<sample:4>", "<sample:2>"}, false, 2, new String[][]{{"com.fasterxml.jackson.databind.ser.impl.WritableObjectId", "writeAsId", "com.fasterxml.jackson.core.JsonGenerator,com.fasterxml.jackson.databind.SerializerProvider,com.fasterxml.jackson.databind.ser.impl.ObjectIdWriter", "<sample:7>", "<sample:7>", "<sample:8>"}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput035() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ser.impl.WritableObjectId", "com.fasterxml.jackson.databind.ser.impl.WritableObjectId", "writeAsField", new String[]{"com.fasterxml.jackson.core.JsonGenerator", "com.fasterxml.jackson.databind.SerializerProvider", "com.fasterxml.jackson.databind.ser.impl.ObjectIdWriter"}, new String[]{"<sample:10>", "<sample:2>", "<sample:0>"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.ser.impl.WritableObjectId", "writeAsField", "com.fasterxml.jackson.core.JsonGenerator,com.fasterxml.jackson.databind.SerializerProvider,com.fasterxml.jackson.databind.ser.impl.ObjectIdWriter", "<sample:3>", "<sample:0>", "<sample:0>"}, {"com.fasterxml.jackson.databind.ser.impl.WritableObjectId", "writeAsId", "com.fasterxml.jackson.core.JsonGenerator,com.fasterxml.jackson.databind.SerializerProvider,com.fasterxml.jackson.databind.ser.impl.ObjectIdWriter", "<sample:0>", "<sample:1>", "<null>"}});
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput036() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ser.impl.WritableObjectId", "com.fasterxml.jackson.databind.ser.impl.WritableObjectId", "writeAsId", new String[]{"com.fasterxml.jackson.core.JsonGenerator", "com.fasterxml.jackson.databind.SerializerProvider", "com.fasterxml.jackson.databind.ser.impl.ObjectIdWriter"}, new String[]{"<sample:5>", "<sample:11>", "<sample:4>"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.ser.impl.WritableObjectId", "generateId", "java.lang.Object", "<b:true>"}}, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.ClassCastException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput037() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ser.impl.WritableObjectId", "com.fasterxml.jackson.databind.ser.impl.WritableObjectId", "writeAsField", new String[]{"com.fasterxml.jackson.core.JsonGenerator", "com.fasterxml.jackson.databind.SerializerProvider", "com.fasterxml.jackson.databind.ser.impl.ObjectIdWriter"}, new String[]{"<sample:5>", "<sample:6>", "<sample:7>"}, false, 4, new String[][]{{"com.fasterxml.jackson.databind.ser.impl.WritableObjectId", "generateId", "java.lang.Object", "<sample:4>"}, {"com.fasterxml.jackson.databind.ser.impl.WritableObjectId", "writeAsField", "com.fasterxml.jackson.core.JsonGenerator,com.fasterxml.jackson.databind.SerializerProvider,com.fasterxml.jackson.databind.ser.impl.ObjectIdWriter", "<sample:4>", "<sample:3>", "<sample:7>"}}, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("com.fasterxml.jackson.databind.JsonMappingException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput038() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ser.impl.WritableObjectId", "com.fasterxml.jackson.databind.ser.impl.WritableObjectId", "writeAsId", new String[]{"com.fasterxml.jackson.core.JsonGenerator", "com.fasterxml.jackson.databind.SerializerProvider", "com.fasterxml.jackson.databind.ser.impl.ObjectIdWriter"}, new String[]{"<sample:7>", "<sample:6>", "<sample:8>"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.ser.impl.WritableObjectId", "generateId", "java.lang.Object", "<s:`r>"}}, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput039() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ser.impl.WritableObjectId", "com.fasterxml.jackson.databind.ser.impl.WritableObjectId", "writeAsId", new String[]{"com.fasterxml.jackson.core.JsonGenerator", "com.fasterxml.jackson.databind.SerializerProvider", "com.fasterxml.jackson.databind.ser.impl.ObjectIdWriter"}, new String[]{"<sample:7>", "<sample:0>", "<sample:2>"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.ser.impl.WritableObjectId", "writeAsId", "com.fasterxml.jackson.core.JsonGenerator,com.fasterxml.jackson.databind.SerializerProvider,com.fasterxml.jackson.databind.ser.impl.ObjectIdWriter", "<sample:1>", "<sample:8>", "<sample:2>"}, {"com.fasterxml.jackson.databind.ser.impl.WritableObjectId", "generateId", "java.lang.Object", "<s:Xey>"}}, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput040() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ser.impl.WritableObjectId", "com.fasterxml.jackson.databind.ser.impl.WritableObjectId", "writeAsId", new String[]{"com.fasterxml.jackson.core.JsonGenerator", "com.fasterxml.jackson.databind.SerializerProvider", "com.fasterxml.jackson.databind.ser.impl.ObjectIdWriter"}, new String[]{"<sample:1>", "<sample:7>", "<sample:8>"}, false, 4, new String[][]{{"com.fasterxml.jackson.databind.ser.impl.WritableObjectId", "generateId", "java.lang.Object", "<s:>"}}, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.ClassCastException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput041() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ser.impl.WritableObjectId", "com.fasterxml.jackson.databind.ser.impl.WritableObjectId", "writeAsField", new String[]{"com.fasterxml.jackson.core.JsonGenerator", "com.fasterxml.jackson.databind.SerializerProvider", "com.fasterxml.jackson.databind.ser.impl.ObjectIdWriter"}, new String[]{"<sample:9>", "<null>", "<sample:2>"}, false, 0, null, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.ArrayIndexOutOfBoundsException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput042() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ser.impl.WritableObjectId", "com.fasterxml.jackson.databind.ser.impl.WritableObjectId", "writeAsId", new String[]{"com.fasterxml.jackson.core.JsonGenerator", "com.fasterxml.jackson.databind.SerializerProvider", "com.fasterxml.jackson.databind.ser.impl.ObjectIdWriter"}, new String[]{"<sample:9>", "<sample:11>", "<sample:7>"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.ser.impl.WritableObjectId", "writeAsField", "com.fasterxml.jackson.core.JsonGenerator,com.fasterxml.jackson.databind.SerializerProvider,com.fasterxml.jackson.databind.ser.impl.ObjectIdWriter", "<sample:2>", "<sample:3>", "<sample:7>"}, {"com.fasterxml.jackson.databind.ser.impl.WritableObjectId", "generateId", "java.lang.Object", "<sample:3>"}}, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("com.fasterxml.jackson.databind.JsonMappingException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput043() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ser.impl.WritableObjectId", "com.fasterxml.jackson.databind.ser.impl.WritableObjectId", "writeAsField", new String[]{"com.fasterxml.jackson.core.JsonGenerator", "com.fasterxml.jackson.databind.SerializerProvider", "com.fasterxml.jackson.databind.ser.impl.ObjectIdWriter"}, new String[]{"<sample:2>", "<sample:2>", "<sample:2>"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.ser.impl.WritableObjectId", "writeAsId", "com.fasterxml.jackson.core.JsonGenerator,com.fasterxml.jackson.databind.SerializerProvider,com.fasterxml.jackson.databind.ser.impl.ObjectIdWriter", "<sample:1>", "<sample:11>", "<null>"}}, 3);
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput044() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ser.impl.WritableObjectId", "com.fasterxml.jackson.databind.ser.impl.WritableObjectId", "writeAsField", new String[]{"com.fasterxml.jackson.core.JsonGenerator", "com.fasterxml.jackson.databind.SerializerProvider", "com.fasterxml.jackson.databind.ser.impl.ObjectIdWriter"}, new String[]{"<sample:2>", "<null>", "<sample:4>"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.ser.impl.WritableObjectId", "writeAsField", "com.fasterxml.jackson.core.JsonGenerator,com.fasterxml.jackson.databind.SerializerProvider,com.fasterxml.jackson.databind.ser.impl.ObjectIdWriter", "<sample:4>", "<sample:1>", "<sample:4>"}, {"com.fasterxml.jackson.databind.ser.impl.WritableObjectId", "writeAsId", "com.fasterxml.jackson.core.JsonGenerator,com.fasterxml.jackson.databind.SerializerProvider,com.fasterxml.jackson.databind.ser.impl.ObjectIdWriter", "<sample:8>", "<sample:3>", "<sample:5>"}}, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput045() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ser.impl.WritableObjectId", "com.fasterxml.jackson.databind.ser.impl.WritableObjectId", "writeAsField", new String[]{"com.fasterxml.jackson.core.JsonGenerator", "com.fasterxml.jackson.databind.SerializerProvider", "com.fasterxml.jackson.databind.ser.impl.ObjectIdWriter"}, new String[]{"<sample:10>", "<sample:2>", "<sample:2>"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.ser.impl.WritableObjectId", "writeAsField", "com.fasterxml.jackson.core.JsonGenerator,com.fasterxml.jackson.databind.SerializerProvider,com.fasterxml.jackson.databind.ser.impl.ObjectIdWriter", "<sample:11>", "<sample:6>", "<sample:1>"}}, 2);
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput046() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ser.impl.WritableObjectId", "com.fasterxml.jackson.databind.ser.impl.WritableObjectId", "writeAsField", new String[]{"com.fasterxml.jackson.core.JsonGenerator", "com.fasterxml.jackson.databind.SerializerProvider", "com.fasterxml.jackson.databind.ser.impl.ObjectIdWriter"}, new String[]{"<sample:1>", "<sample:5>", "<sample:4>"}, false, 3, new String[][]{{"com.fasterxml.jackson.databind.ser.impl.WritableObjectId", "writeAsId", "com.fasterxml.jackson.core.JsonGenerator,com.fasterxml.jackson.databind.SerializerProvider,com.fasterxml.jackson.databind.ser.impl.ObjectIdWriter", "<sample:6>", "<sample:3>", "<sample:4>"}}, 1);
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput047() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ser.impl.WritableObjectId", "com.fasterxml.jackson.databind.ser.impl.WritableObjectId", "writeAsId", new String[]{"com.fasterxml.jackson.core.JsonGenerator", "com.fasterxml.jackson.databind.SerializerProvider", "com.fasterxml.jackson.databind.ser.impl.ObjectIdWriter"}, new String[]{"<sample:5>", "<sample:7>", "<sample:6>"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.ser.impl.WritableObjectId", "generateId", "java.lang.Object", "<s:c>"}}, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.ClassCastException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput048() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ser.impl.WritableObjectId", "com.fasterxml.jackson.databind.ser.impl.WritableObjectId", "writeAsField", new String[]{"com.fasterxml.jackson.core.JsonGenerator", "com.fasterxml.jackson.databind.SerializerProvider", "com.fasterxml.jackson.databind.ser.impl.ObjectIdWriter"}, new String[]{"<sample:1>", "<sample:0>", "<sample:7>"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.ser.impl.WritableObjectId", "writeAsField", "com.fasterxml.jackson.core.JsonGenerator,com.fasterxml.jackson.databind.SerializerProvider,com.fasterxml.jackson.databind.ser.impl.ObjectIdWriter", "<sample:6>", "<sample:8>", "<sample:0>"}}, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("com.fasterxml.jackson.databind.JsonMappingException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput049() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ser.impl.WritableObjectId", "com.fasterxml.jackson.databind.ser.impl.WritableObjectId", "writeAsField", new String[]{"com.fasterxml.jackson.core.JsonGenerator", "com.fasterxml.jackson.databind.SerializerProvider", "com.fasterxml.jackson.databind.ser.impl.ObjectIdWriter"}, new String[]{"<sample:1>", "<null>", "<sample:6>"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.ser.impl.WritableObjectId", "writeAsId", "com.fasterxml.jackson.core.JsonGenerator,com.fasterxml.jackson.databind.SerializerProvider,com.fasterxml.jackson.databind.ser.impl.ObjectIdWriter", "<sample:4>", "<sample:9>", "<sample:4>"}}, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput050() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ser.impl.WritableObjectId", "com.fasterxml.jackson.databind.ser.impl.WritableObjectId", "writeAsField", new String[]{"com.fasterxml.jackson.core.JsonGenerator", "com.fasterxml.jackson.databind.SerializerProvider", "com.fasterxml.jackson.databind.ser.impl.ObjectIdWriter"}, new String[]{"<sample:5>", "<sample:7>", "<sample:7>"}, false, 7, new String[][]{{"com.fasterxml.jackson.databind.ser.impl.WritableObjectId", "generateId", "java.lang.Object", "<s:>"}, {"com.fasterxml.jackson.databind.ser.impl.WritableObjectId", "writeAsField", "com.fasterxml.jackson.core.JsonGenerator,com.fasterxml.jackson.databind.SerializerProvider,com.fasterxml.jackson.databind.ser.impl.ObjectIdWriter", "<sample:9>", "<sample:4>", "<sample:5>"}}, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("com.fasterxml.jackson.databind.JsonMappingException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput051() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ser.impl.WritableObjectId", "com.fasterxml.jackson.databind.ser.impl.WritableObjectId", "writeAsField", new String[]{"com.fasterxml.jackson.core.JsonGenerator", "com.fasterxml.jackson.databind.SerializerProvider", "com.fasterxml.jackson.databind.ser.impl.ObjectIdWriter"}, new String[]{"<sample:5>", "<sample:5>", "<sample:6>"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.ser.impl.WritableObjectId", "writeAsField", "com.fasterxml.jackson.core.JsonGenerator,com.fasterxml.jackson.databind.SerializerProvider,com.fasterxml.jackson.databind.ser.impl.ObjectIdWriter", "<sample:0>", "<sample:1>", "<null>"}}, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IndexOutOfBoundsException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput052() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ser.impl.WritableObjectId", "com.fasterxml.jackson.databind.ser.impl.WritableObjectId", "writeAsId", new String[]{"com.fasterxml.jackson.core.JsonGenerator", "com.fasterxml.jackson.databind.SerializerProvider", "com.fasterxml.jackson.databind.ser.impl.ObjectIdWriter"}, new String[]{"<sample:13>", "<sample:3>", "<sample:7>"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.ser.impl.WritableObjectId", "writeAsField", "com.fasterxml.jackson.core.JsonGenerator,com.fasterxml.jackson.databind.SerializerProvider,com.fasterxml.jackson.databind.ser.impl.ObjectIdWriter", "<sample:4>", "<sample:0>", "<sample:10>"}, {"com.fasterxml.jackson.databind.ser.impl.WritableObjectId", "generateId", "java.lang.Object", "<s:eb>"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("com.fasterxml.jackson.databind.JsonMappingException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput053() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ser.impl.WritableObjectId", "com.fasterxml.jackson.databind.ser.impl.WritableObjectId", "writeAsField", new String[]{"com.fasterxml.jackson.core.JsonGenerator", "com.fasterxml.jackson.databind.SerializerProvider", "com.fasterxml.jackson.databind.ser.impl.ObjectIdWriter"}, new String[]{"<sample:5>", "<null>", "<sample:4>"}, false, 0, null, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput054() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ser.impl.WritableObjectId", "com.fasterxml.jackson.databind.ser.impl.WritableObjectId", "writeAsField", new String[]{"com.fasterxml.jackson.core.JsonGenerator", "com.fasterxml.jackson.databind.SerializerProvider", "com.fasterxml.jackson.databind.ser.impl.ObjectIdWriter"}, new String[]{"<sample:5>", "<sample:2>", "<sample:3>"}, false, 6, new String[][]{{"com.fasterxml.jackson.databind.ser.impl.WritableObjectId", "writeAsField", "com.fasterxml.jackson.core.JsonGenerator,com.fasterxml.jackson.databind.SerializerProvider,com.fasterxml.jackson.databind.ser.impl.ObjectIdWriter", "<sample:1>", "<sample:9>", "<sample:1>"}, {"com.fasterxml.jackson.databind.ser.impl.WritableObjectId", "writeAsId", "com.fasterxml.jackson.core.JsonGenerator,com.fasterxml.jackson.databind.SerializerProvider,com.fasterxml.jackson.databind.ser.impl.ObjectIdWriter", "<sample:3>", "<sample:6>", "<sample:6>"}}, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IndexOutOfBoundsException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput055() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ser.impl.WritableObjectId", "com.fasterxml.jackson.databind.ser.impl.WritableObjectId", "writeAsId", new String[]{"com.fasterxml.jackson.core.JsonGenerator", "com.fasterxml.jackson.databind.SerializerProvider", "com.fasterxml.jackson.databind.ser.impl.ObjectIdWriter"}, new String[]{"<sample:1>", "<sample:9>", "<sample:7>"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.ser.impl.WritableObjectId", "writeAsField", "com.fasterxml.jackson.core.JsonGenerator,com.fasterxml.jackson.databind.SerializerProvider,com.fasterxml.jackson.databind.ser.impl.ObjectIdWriter", "<sample:10>", "<sample:4>", "<sample:1>"}, {"com.fasterxml.jackson.databind.ser.impl.WritableObjectId", "generateId", "java.lang.Object", "<s:>"}}, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("com.fasterxml.jackson.databind.JsonMappingException", thrown.getClass().getName());
 }
}
