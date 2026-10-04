package generated.algorithm;

import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;
import static org.junit.Assert.*;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class BinaryParticleSwarmGeneratedTest {
 @Test(timeout = 20000)
 public void generatedInput000() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ser.PropertyBuilder", "com.fasterxml.jackson.databind.ser.PropertyBuilder", "getDefaultValue", new String[]{"com.fasterxml.jackson.databind.JavaType"}, new String[]{"<sample:0>"}, false);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput001() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ser.PropertyBuilder", "com.fasterxml.jackson.databind.ser.PropertyBuilder", "_throwWrapped", new String[]{"java.lang.Exception", "java.lang.String", "java.lang.Object"}, new String[]{"<sample:3>", "020-02-30T25:61:61", "<s:key>"}, false, 0, null, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput002() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ser.PropertyBuilder", "com.fasterxml.jackson.databind.ser.PropertyBuilder", "getDefaultValue", new String[]{"com.fasterxml.jackson.databind.JavaType"}, new String[]{"<sample:2>"}, false);
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.annotation.JsonInclude$Include", actual.getClass().getName());
  assertEquals("NON_EMPTY", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput003() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ser.PropertyBuilder", "com.fasterxml.jackson.databind.ser.PropertyBuilder", "_throwWrapped", new String[]{"java.lang.Exception", "java.lang.String", "java.lang.Object"}, new String[]{"<sample:3>", "Hello, World", "<s:b>"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.ser.PropertyBuilder", "_throwWrapped", "java.lang.Exception,java.lang.String,java.lang.Object", "<sample:6>", "5. instance", "<b:true>"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput004() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ser.PropertyBuilder", "com.fasterxml.jackson.databind.ser.PropertyBuilder", "findSerializationType", new String[]{"com.fasterxml.jackson.databind.introspect.Annotated", "boolean", "com.fasterxml.jackson.databind.JavaType"}, new String[]{"<sample:4>", "true", "<sample:5>"}, false, 7, new String[][]{}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput005() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ser.PropertyBuilder", "com.fasterxml.jackson.databind.ser.PropertyBuilder", "getClassAnnotations", new String[]{}, new String[]{}, false); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput006() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ser.PropertyBuilder", "com.fasterxml.jackson.databind.ser.PropertyBuilder", "getDefaultValue", new String[]{"com.fasterxml.jackson.databind.JavaType"}, new String[]{"<sample:4>"}, false, 3, new String[][]{}, 2);
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput007() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ser.PropertyBuilder", "com.fasterxml.jackson.databind.ser.PropertyBuilder", "_throwWrapped", new String[]{"java.lang.Exception", "java.lang.String", "java.lang.Object"}, new String[]{"<sample:3>", "02", "<i:1>"}, false, 4, new String[][]{{"com.fasterxml.jackson.databind.ser.PropertyBuilder", "getDefaultBean", ""}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput008() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ser.PropertyBuilder", "com.fasterxml.jackson.databind.ser.PropertyBuilder", "getPropertyDefaultValue", new String[]{"java.lang.String", "com.fasterxml.jackson.databind.introspect.AnnotatedMember", "com.fasterxml.jackson.databind.JavaType"}, new String[]{"i", "<sample:7>", "<null>"}, false); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput009() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ser.PropertyBuilder", "com.fasterxml.jackson.databind.ser.PropertyBuilder", "_throwWrapped", new String[]{"java.lang.Exception", "java.lang.String", "java.lang.Object"}, new String[]{"<null>", "i1.1234567890123456", "<sample:0>"}, false, 5, new String[][]{{"com.fasterxml.jackson.databind.ser.PropertyBuilder", "_throwWrapped", "java.lang.Exception,java.lang.String,java.lang.Object", "<sample:1>", "1.1234567890123456", "<s:`>"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput010() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ser.PropertyBuilder", "com.fasterxml.jackson.databind.ser.PropertyBuilder", "_throwWrapped", new String[]{"java.lang.Exception", "java.lang.String", "java.lang.Object"}, new String[]{"<null>", "a d", "<s:>"}, false, 6, new String[][]{{"com.fasterxml.jackson.databind.ser.PropertyBuilder", "getDefaultBean", ""}, {"com.fasterxml.jackson.databind.ser.PropertyBuilder", "getPropertyDefaultValue", "java.lang.String,com.fasterxml.jackson.databind.introspect.AnnotatedMember,com.fasterxml.jackson.databind.JavaType", "xa ob", "<sample:3>", "<sample:1>"}}, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput011() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ser.PropertyBuilder", "com.fasterxml.jackson.databind.ser.PropertyBuilder", "buildWriter", new String[]{"com.fasterxml.jackson.databind.SerializerProvider", "com.fasterxml.jackson.databind.introspect.BeanPropertyDefinition", "com.fasterxml.jackson.databind.JavaType", "com.fasterxml.jackson.databind.JsonSerializer", "com.fasterxml.jackson.databind.jsontype.TypeSerializer", "com.fasterxml.jackson.databind.jsontype.TypeSerializer", "com.fasterxml.jackson.databind.introspect.AnnotatedMember", "boolean"}, new String[]{"<sample:5>", "<sample:3>", "<sample:2>", "<sample:6>", "<sample:2>", "<sample:7>", "<null>", "true"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.ser.PropertyBuilder", "getDefaultValue", "com.fasterxml.jackson.databind.JavaType", "<sample:3>"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput012() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ser.PropertyBuilder", "com.fasterxml.jackson.databind.ser.PropertyBuilder", "getClassAnnotations", new String[]{}, new String[]{}, false, 5, new String[][]{{"com.fasterxml.jackson.databind.ser.PropertyBuilder", "getDefaultBean", ""}}, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput013() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ser.PropertyBuilder", "com.fasterxml.jackson.databind.ser.PropertyBuilder", "buildWriter", new String[]{"com.fasterxml.jackson.databind.SerializerProvider", "com.fasterxml.jackson.databind.introspect.BeanPropertyDefinition", "com.fasterxml.jackson.databind.JavaType", "com.fasterxml.jackson.databind.JsonSerializer", "com.fasterxml.jackson.databind.jsontype.TypeSerializer", "com.fasterxml.jackson.databind.jsontype.TypeSerializer", "com.fasterxml.jackson.databind.introspect.AnnotatedMember", "boolean"}, new String[]{"<sample:7>", "<sample:6>", "<sample:5>", "<sample:5>", "<sample:2>", "<sample:5>", "<sample:1>", "false"}, false, 1, new String[][]{}, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput014() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ser.PropertyBuilder", "com.fasterxml.jackson.databind.ser.PropertyBuilder", "getDefaultValue", new String[]{"com.fasterxml.jackson.databind.JavaType"}, new String[]{"<sample:7>"}, false);
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput015() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ser.PropertyBuilder", "com.fasterxml.jackson.databind.ser.PropertyBuilder", "getClassAnnotations", new String[]{}, new String[]{}, false, 0, null, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput016() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ser.PropertyBuilder", "com.fasterxml.jackson.databind.ser.PropertyBuilder", "_throwWrapped", new String[]{"java.lang.Exception", "java.lang.String", "java.lang.Object"}, new String[]{"<sample:3>", "abbc", "<d:-6.6>"}, false, 6, new String[][]{{"com.fasterxml.jackson.databind.ser.PropertyBuilder", "getClassAnnotations", ""}}, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput017() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ser.PropertyBuilder", "com.fasterxml.jackson.databind.ser.PropertyBuilder", "getDefaultValue", new String[]{"com.fasterxml.jackson.databind.JavaType"}, new String[]{"<sample:0>"}, false, 1, new String[][]{{"com.fasterxml.jackson.databind.ser.PropertyBuilder", "buildWriter", "com.fasterxml.jackson.databind.SerializerProvider,com.fasterxml.jackson.databind.introspect.BeanPropertyDefinition,com.fasterxml.jackson.databind.JavaType,com.fasterxml.jackson.databind.JsonSerializer,com.fasterxml.jackson.databind.jsontype.TypeSerializer,com.fasterxml.jackson.databind.jsontype.TypeSerializer,com.fasterxml.jackson.databind.introspect.AnnotatedMember,boolean", "<sample:6>", "<sample:5>", "<sample:7>", "<sample:2>", "<null>", "<sample:0>", "<sample:2>", "true"}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput018() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ser.PropertyBuilder", "com.fasterxml.jackson.databind.ser.PropertyBuilder", "getDefaultValue", new String[]{"com.fasterxml.jackson.databind.JavaType"}, new String[]{"<sample:5>"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.ser.PropertyBuilder", "buildWriter", "com.fasterxml.jackson.databind.SerializerProvider,com.fasterxml.jackson.databind.introspect.BeanPropertyDefinition,com.fasterxml.jackson.databind.JavaType,com.fasterxml.jackson.databind.JsonSerializer,com.fasterxml.jackson.databind.jsontype.TypeSerializer,com.fasterxml.jackson.databind.jsontype.TypeSerializer,com.fasterxml.jackson.databind.introspect.AnnotatedMember,boolean", "<sample:2>", "<sample:6>", "<sample:6>", "<sample:1>", "<sample:0>", "<sample:2>", "<sample:3>", "false"}, {"com.fasterxml.jackson.databind.ser.PropertyBuilder", "getDefaultBean", ""}});
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.annotation.JsonInclude$Include", actual.getClass().getName());
  assertEquals("NON_EMPTY", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput019() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ser.PropertyBuilder", "com.fasterxml.jackson.databind.ser.PropertyBuilder", "_throwWrapped", new String[]{"java.lang.Exception", "java.lang.String", "java.lang.Object"}, new String[]{"<null>", "<a>b</aa>", "<s:jfy>"}, false, 3, new String[][]{{"com.fasterxml.jackson.databind.ser.PropertyBuilder", "getClassAnnotations", ""}, {"com.fasterxml.jackson.databind.ser.PropertyBuilder", "_throwWrapped", "java.lang.Exception,java.lang.String,java.lang.Object", "<sample:0>", "j", "<s:b>"}}, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput020() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ser.PropertyBuilder", "com.fasterxml.jackson.databind.ser.PropertyBuilder", "getPropertyDefaultValue", new String[]{"java.lang.String", "com.fasterxml.jackson.databind.introspect.AnnotatedMember", "com.fasterxml.jackson.databind.JavaType"}, new String[]{"{\"a\":1}", "<sample:8>", "<sample:0>"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.ser.PropertyBuilder", "getClassAnnotations", ""}}, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput021() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ser.PropertyBuilder", "com.fasterxml.jackson.databind.ser.PropertyBuilder", "getDefaultValue", new String[]{"com.fasterxml.jackson.databind.JavaType"}, new String[]{"<null>"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.ser.PropertyBuilder", "getPropertyDefaultValue", "java.lang.String,com.fasterxml.jackson.databind.introspect.AnnotatedMember,com.fasterxml.jackson.databind.JavaType", "-1", "<sample:2>", "<sample:4>"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput022() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ser.PropertyBuilder", "com.fasterxml.jackson.databind.ser.PropertyBuilder", "getDefaultBean", new String[]{}, new String[]{}, false, 4, new String[][]{{"com.fasterxml.jackson.databind.ser.PropertyBuilder", "getClassAnnotations", ""}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput023() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ser.PropertyBuilder", "com.fasterxml.jackson.databind.ser.PropertyBuilder", "getPropertyDefaultValue", new String[]{"java.lang.String", "com.fasterxml.jackson.databind.introspect.AnnotatedMember", "com.fasterxml.jackson.databind.JavaType"}, new String[]{"1.12345678901334567", "<sample:4>", "<sample:8>"}, false, 2, new String[][]{{"com.fasterxml.jackson.databind.ser.PropertyBuilder", "getClassAnnotations", ""}}, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput024() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ser.PropertyBuilder", "com.fasterxml.jackson.databind.ser.PropertyBuilder", "buildWriter", new String[]{"com.fasterxml.jackson.databind.SerializerProvider", "com.fasterxml.jackson.databind.introspect.BeanPropertyDefinition", "com.fasterxml.jackson.databind.JavaType", "com.fasterxml.jackson.databind.JsonSerializer", "com.fasterxml.jackson.databind.jsontype.TypeSerializer", "com.fasterxml.jackson.databind.jsontype.TypeSerializer", "com.fasterxml.jackson.databind.introspect.AnnotatedMember", "boolean"}, new String[]{"<sample:3>", "<sample:6>", "<sample:10>", "<sample:6>", "<sample:1>", "<sample:3>", "<sample:5>", "false"}, false, 6, new String[][]{}, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput025() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ser.PropertyBuilder", "com.fasterxml.jackson.databind.ser.PropertyBuilder", "_throwWrapped", new String[]{"java.lang.Exception", "java.lang.String", "java.lang.Object"}, new String[]{"<empty>", "15d': class ", "<i:2>"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.ser.PropertyBuilder", "getPropertyDefaultValue", "java.lang.String,com.fasterxml.jackson.databind.introspect.AnnotatedMember,com.fasterxml.jackson.databind.JavaType", "<a>b</a>", "<sample:6>", "<sample:3>"}}, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput026() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ser.PropertyBuilder", "com.fasterxml.jackson.databind.ser.PropertyBuilder", "getPropertyDefaultValue", new String[]{"java.lang.String", "com.fasterxml.jackson.databind.introspect.AnnotatedMember", "com.fasterxml.jackson.databind.JavaType"}, new String[]{"' of defaullt ", "<sample:4>", "<sample:7>"}, false, 7, new String[][]{}, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput027() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ser.PropertyBuilder", "com.fasterxml.jackson.databind.ser.PropertyBuilder", "findSerializationType", new String[]{"com.fasterxml.jackson.databind.introspect.Annotated", "boolean", "com.fasterxml.jackson.databind.JavaType"}, new String[]{"<sample:7>", "false", "<sample:5>"}, false, 6, new String[][]{}, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput028() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ser.PropertyBuilder", "com.fasterxml.jackson.databind.ser.PropertyBuilder", "getDefaultValue", new String[]{"com.fasterxml.jackson.databind.JavaType"}, new String[]{"<sample:5>"}, false, 0, null, 2);
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.annotation.JsonInclude$Include", actual.getClass().getName());
  assertEquals("NON_EMPTY", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput029() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ser.PropertyBuilder", "com.fasterxml.jackson.databind.ser.PropertyBuilder", "findSerializationType", new String[]{"com.fasterxml.jackson.databind.introspect.Annotated", "boolean", "com.fasterxml.jackson.databind.JavaType"}, new String[]{"<null>", "false", "<sample:4>"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.ser.PropertyBuilder", "findSerializationType", "com.fasterxml.jackson.databind.introspect.Annotated,boolean,com.fasterxml.jackson.databind.JavaType", "<sample:7>", "true", "<sample:4>"}}, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput030() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ser.PropertyBuilder", "com.fasterxml.jackson.databind.ser.PropertyBuilder", "getClassAnnotations", new String[]{}, new String[]{}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.ser.PropertyBuilder", "getDefaultValue", "com.fasterxml.jackson.databind.JavaType", "<sample:1>"}, {"com.fasterxml.jackson.databind.ser.PropertyBuilder", "getPropertyDefaultValue", "java.lang.String,com.fasterxml.jackson.databind.introspect.AnnotatedMember,com.fasterxml.jackson.databind.JavaType", "a,b,c", "<sample:4>", "<sample:7>"}}, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput031() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ser.PropertyBuilder", "com.fasterxml.jackson.databind.ser.PropertyBuilder", "getDefaultValue", new String[]{"com.fasterxml.jackson.databind.JavaType"}, new String[]{"<sample:1>"}, false, 7, new String[][]{{"com.fasterxml.jackson.databind.ser.PropertyBuilder", "findSerializationType", "com.fasterxml.jackson.databind.introspect.Annotated,boolean,com.fasterxml.jackson.databind.JavaType", "<sample:7>", "false", "<sample:5>"}}, 1);
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.annotation.JsonInclude$Include", actual.getClass().getName());
  assertEquals("NON_EMPTY", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput032() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ser.PropertyBuilder", "com.fasterxml.jackson.databind.ser.PropertyBuilder", "findSerializationType", new String[]{"com.fasterxml.jackson.databind.introspect.Annotated", "boolean", "com.fasterxml.jackson.databind.JavaType"}, new String[]{"<sample:2>", "false", "<sample:6>"}, false, 6, new String[][]{{"com.fasterxml.jackson.databind.ser.PropertyBuilder", "findSerializationType", "com.fasterxml.jackson.databind.introspect.Annotated,boolean,com.fasterxml.jackson.databind.JavaType", "<sample:6>", "false", "<sample:11>"}}, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput033() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ser.PropertyBuilder", "com.fasterxml.jackson.databind.ser.PropertyBuilder", "getDefaultValue", new String[]{"com.fasterxml.jackson.databind.JavaType"}, new String[]{"<sample:6>"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.ser.PropertyBuilder", "_throwWrapped", "java.lang.Exception,java.lang.String,java.lang.Object", "<null>", "+1", "<s:b>"}}, 3);
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput034() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ser.PropertyBuilder", "com.fasterxml.jackson.databind.ser.PropertyBuilder", "getDefaultBean", new String[]{}, new String[]{}, false, 0, null, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput035() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ser.PropertyBuilder", "com.fasterxml.jackson.databind.ser.PropertyBuilder", "buildWriter", new String[]{"com.fasterxml.jackson.databind.SerializerProvider", "com.fasterxml.jackson.databind.introspect.BeanPropertyDefinition", "com.fasterxml.jackson.databind.JavaType", "com.fasterxml.jackson.databind.JsonSerializer", "com.fasterxml.jackson.databind.jsontype.TypeSerializer", "com.fasterxml.jackson.databind.jsontype.TypeSerializer", "com.fasterxml.jackson.databind.introspect.AnnotatedMember", "boolean"}, new String[]{"<sample:2>", "<sample:7>", "<sample:7>", "<sample:4>", "<sample:4>", "<sample:7>", "<null>", "true"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.ser.PropertyBuilder", "getDefaultValue", "com.fasterxml.jackson.databind.JavaType", "<null>"}}, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput036() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ser.PropertyBuilder", "com.fasterxml.jackson.databind.ser.PropertyBuilder", "getDefaultBean", new String[]{}, new String[]{}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.ser.PropertyBuilder", "getDefaultBean", ""}}, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput037() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ser.PropertyBuilder", "com.fasterxml.jackson.databind.ser.PropertyBuilder", "getDefaultBean", new String[]{}, new String[]{}, false, 0, null, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput038() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ser.PropertyBuilder", "com.fasterxml.jackson.databind.ser.PropertyBuilder", "getDefaultValue", new String[]{"com.fasterxml.jackson.databind.JavaType"}, new String[]{"<null>"}, false, 5, new String[][]{}, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput039() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ser.PropertyBuilder", "com.fasterxml.jackson.databind.ser.PropertyBuilder", "getDefaultValue", new String[]{"com.fasterxml.jackson.databind.JavaType"}, new String[]{"<sample:9>"}, false, 2, new String[][]{{"com.fasterxml.jackson.databind.ser.PropertyBuilder", "findSerializationType", "com.fasterxml.jackson.databind.introspect.Annotated,boolean,com.fasterxml.jackson.databind.JavaType", "<sample:1>", "false", "<sample:3>"}, {"com.fasterxml.jackson.databind.ser.PropertyBuilder", "getClassAnnotations", ""}}, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput040() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ser.PropertyBuilder", "com.fasterxml.jackson.databind.ser.PropertyBuilder", "_throwWrapped", new String[]{"java.lang.Exception", "java.lang.String", "java.lang.Object"}, new String[]{"<null>", "1LFailed to get property '", "<i:0>"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.ser.PropertyBuilder", "buildWriter", "com.fasterxml.jackson.databind.SerializerProvider,com.fasterxml.jackson.databind.introspect.BeanPropertyDefinition,com.fasterxml.jackson.databind.JavaType,com.fasterxml.jackson.databind.JsonSerializer,com.fasterxml.jackson.databind.jsontype.TypeSerializer,com.fasterxml.jackson.databind.jsontype.TypeSerializer,com.fasterxml.jackson.databind.introspect.AnnotatedMember,boolean", "<sample:4>", "<sample:6>", "<sample:1>", "<sample:0>", "<sample:8>", "<sample:5>", "<sample:5>", "false"}}, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput041() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ser.PropertyBuilder", "com.fasterxml.jackson.databind.ser.PropertyBuilder", "getDefaultValue", new String[]{"com.fasterxml.jackson.databind.JavaType"}, new String[]{"<sample:8>"}, false, 5, new String[][]{{"com.fasterxml.jackson.databind.ser.PropertyBuilder", "_throwWrapped", "java.lang.Exception,java.lang.String,java.lang.Object", "<sample:1>", "'c(o type ", "<s:>"}, {"com.fasterxml.jackson.databind.ser.PropertyBuilder", "getDefaultBean", ""}}, 1);
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput042() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ser.PropertyBuilder", "com.fasterxml.jackson.databind.ser.PropertyBuilder", "getDefaultValue", new String[]{"com.fasterxml.jackson.databind.JavaType"}, new String[]{"<sample:1>"}, false, 4, new String[][]{{"com.fasterxml.jackson.databind.ser.PropertyBuilder", "getPropertyDefaultValue", "java.lang.String,com.fasterxml.jackson.databind.introspect.AnnotatedMember,com.fasterxml.jackson.databind.JavaType", "{\"a\":1}\u00e9", "<sample:3>", "<sample:5>"}}, 3);
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.annotation.JsonInclude$Include", actual.getClass().getName());
  assertEquals("NON_EMPTY", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput043() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ser.PropertyBuilder", "com.fasterxml.jackson.databind.ser.PropertyBuilder", "getDefaultValue", new String[]{"com.fasterxml.jackson.databind.JavaType"}, new String[]{"<sample:0>"}, false, 6, new String[][]{{"com.fasterxml.jackson.databind.ser.PropertyBuilder", "findSerializationType", "com.fasterxml.jackson.databind.introspect.Annotated,boolean,com.fasterxml.jackson.databind.JavaType", "<sample:2>", "true", "<sample:1>"}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput044() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ser.PropertyBuilder", "com.fasterxml.jackson.databind.ser.PropertyBuilder", "getDefaultValue", new String[]{"com.fasterxml.jackson.databind.JavaType"}, new String[]{"<sample:9>"}, false, 5, new String[][]{{"com.fasterxml.jackson.databind.ser.PropertyBuilder", "findSerializationType", "com.fasterxml.jackson.databind.introspect.Annotated,boolean,com.fasterxml.jackson.databind.JavaType", "<sample:0>", "true", "<sample:4>"}}, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput045() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ser.PropertyBuilder", "com.fasterxml.jackson.databind.ser.PropertyBuilder", "getDefaultValue", new String[]{"com.fasterxml.jackson.databind.JavaType"}, new String[]{"<sample:0>"}, false, 6, new String[][]{{"com.fasterxml.jackson.databind.ser.PropertyBuilder", "buildWriter", "com.fasterxml.jackson.databind.SerializerProvider,com.fasterxml.jackson.databind.introspect.BeanPropertyDefinition,com.fasterxml.jackson.databind.JavaType,com.fasterxml.jackson.databind.JsonSerializer,com.fasterxml.jackson.databind.jsontype.TypeSerializer,com.fasterxml.jackson.databind.jsontype.TypeSerializer,com.fasterxml.jackson.databind.introspect.AnnotatedMember,boolean", "<sample:0>", "<sample:6>", "<sample:4>", "<sample:5>", "<sample:6>", "<sample:1>", "<sample:3>", "false"}, {"com.fasterxml.jackson.databind.ser.PropertyBuilder", "getDefaultValue", "com.fasterxml.jackson.databind.JavaType", "<sample:4>"}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
 }
}
