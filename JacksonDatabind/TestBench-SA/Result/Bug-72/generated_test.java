package generated.algorithm;

import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;
import static org.junit.Assert.*;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class SimulatedAnnealingGeneratedTest {
 @Test(timeout = 20000)
 public void generatedInput000() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.impl.InnerClassProperty", "com.fasterxml.jackson.databind.deser.impl.InnerClassProperty", "writeReplace", new String[]{}, new String[]{}, false, 2, new String[][]{{"com.fasterxml.jackson.databind.deser.impl.InnerClassProperty", "setObjectIdInfo", "com.fasterxml.jackson.databind.introspect.ObjectIdInfo", "<sample:1>"}, {"com.fasterxml.jackson.databind.deser.impl.InnerClassProperty", "hasValueDeserializer", ""}}), new String[][]{{"getAnnotation", "java.lang.Class", "6"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "[property 'sample'] {getCreatorIndex=9, getManagedReferenceName=null, getName=sample, getPropertyIndex=-1, hasValueDeserializer=false, hasValueTypeDeserializer=false, hasViews=false, isRequired=false,...#217#-1576293160", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput001() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.impl.InnerClassProperty", "com.fasterxml.jackson.databind.deser.impl.InnerClassProperty", "readResolve", new String[]{}, new String[]{}, false); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput002() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.impl.InnerClassProperty", "com.fasterxml.jackson.databind.deser.impl.InnerClassProperty", "readResolve", new String[]{}, new String[]{}, false, 2, new String[][]{});
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.databind.deser.impl.InnerClassProperty", actual.getClass().getName());
  assertEquals("[property 'sample'] {getCreatorIndex=9, getManagedReferenceName=null, getName=sample, getPropertyIndex=-1, hasValueDeserializer=false, hasValueTypeDeserializer=false, hasViews=false, isRequired=false,...#217#-1576293160", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "[property 'sample'] {getCreatorIndex=9, getManagedReferenceName=null, getName=sample, getPropertyIndex=-1, hasValueDeserializer=false, hasValueTypeDeserializer=false, hasViews=false, isRequired=false,...#217#-1576293160", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput003() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.impl.InnerClassProperty", "com.fasterxml.jackson.databind.deser.impl.InnerClassProperty", "deserializeAndSet", new String[]{"com.fasterxml.jackson.core.JsonParser", "com.fasterxml.jackson.databind.DeserializationContext", "java.lang.Object"}, new String[]{"<sample:7>", "<null>", "<i:-1>"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.deser.impl.InnerClassProperty", "getObjectIdInfo", ""}, {"com.fasterxml.jackson.databind.deser.impl.InnerClassProperty", "getName", ""}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.UnsupportedOperationException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput004() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.impl.InnerClassProperty", "com.fasterxml.jackson.databind.deser.impl.InnerClassProperty", "findFormatOverrides", new String[]{"com.fasterxml.jackson.databind.AnnotationIntrospector"}, new String[]{"<sample:4>"}, false, 1, new String[][]{{"com.fasterxml.jackson.databind.deser.impl.InnerClassProperty", "deserializeAndSet", "com.fasterxml.jackson.core.JsonParser,com.fasterxml.jackson.databind.DeserializationContext,java.lang.Object", "<sample:0>", "<sample:3>", "<d:-40.0>"}, {"com.fasterxml.jackson.databind.deser.impl.InnerClassProperty", "getDeclaringClass", ""}, {"com.fasterxml.jackson.databind.deser.impl.InnerClassProperty", "withValueDeserializer", "com.fasterxml.jackson.databind.JsonDeserializer", "<sample:2>"}}, 2), new String[][]{{"hasPattern", "", "0"}, {"withLocale", "java.util.Locale", "2"}, {"getShape", "", "6"}, {"getFeature", "com.fasterxml.jackson.annotation.JsonFormat$Feature", "5"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "[property ''] {getCreatorIndex=8, getManagedReferenceName=null, getName=, getPropertyIndex=-1, hasValueDeserializer=false, hasValueTypeDeserializer=false, hasViews=false, isRequired=false, isVirtual=f...#205#1317967865", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput005() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.impl.InnerClassProperty", "com.fasterxml.jackson.databind.deser.impl.InnerClassProperty", "writeReplace", new String[]{}, new String[]{}, false, 13, new String[][]{{"com.fasterxml.jackson.databind.deser.impl.InnerClassProperty", "withSimpleName", "java.lang.String", "[1,2]"}, {"com.fasterxml.jackson.databind.deser.impl.InnerClassProperty", "getWrapperName", ""}, {"com.fasterxml.jackson.databind.deser.impl.InnerClassProperty", "getName", ""}}, 3), new String[][]{{"assignIndex", "int", "1"}});
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.databind.deser.impl.InnerClassProperty", actual.getClass().getName());
  assertEquals("[property ''] {getCreatorIndex=-2, getManagedReferenceName=null, getName=, getPropertyIndex=-1, hasValueDeserializer=false, hasValueTypeDeserializer=false, hasViews=false, isRequired=false, isVirtual=...#206#-996730246", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "[property ''] {getCreatorIndex=-2, getManagedReferenceName=null, getName=, getPropertyIndex=-1, hasValueDeserializer=false, hasValueTypeDeserializer=false, hasViews=false, isRequired=false, isVirtual=...#206#-996730246", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput006() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.impl.InnerClassProperty", "com.fasterxml.jackson.databind.deser.impl.InnerClassProperty", "_throwAsIOE", new String[]{"com.fasterxml.jackson.core.JsonParser", "java.lang.Exception", "java.lang.Object"}, new String[]{"<sample:1>", "<sample:0>", "<i:-1>"}, false, 1, new String[][]{{"com.fasterxml.jackson.databind.deser.impl.InnerClassProperty", "deserializeSetAndReturn", "com.fasterxml.jackson.core.JsonParser,com.fasterxml.jackson.databind.DeserializationContext,java.lang.Object", "<sample:6>", "<sample:3>", "<b:true>"}, {"com.fasterxml.jackson.databind.deser.impl.InnerClassProperty", "getWrapperName", ""}}, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("com.fasterxml.jackson.databind.JsonMappingException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput007() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.impl.InnerClassProperty", "com.fasterxml.jackson.databind.deser.impl.InnerClassProperty", "_throwAsIOE", new String[]{"com.fasterxml.jackson.core.JsonParser", "java.lang.Exception", "java.lang.Object"}, new String[]{"<sample:1>", "<null>", "<i:-32811>"}, false, 1, new String[][]{{"com.fasterxml.jackson.databind.deser.impl.InnerClassProperty", "getMember", ""}}, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput008() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.impl.InnerClassProperty", "com.fasterxml.jackson.databind.deser.impl.InnerClassProperty", "_throwAsIOE", new String[]{"com.fasterxml.jackson.core.JsonParser", "java.lang.Exception", "java.lang.Object"}, new String[]{"<sample:1>", "<sample:2>", "<i:-32811>"}, false, 1, new String[][]{{"com.fasterxml.jackson.databind.deser.impl.InnerClassProperty", "getMember", ""}}, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("com.fasterxml.jackson.databind.JsonMappingException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput009() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.impl.InnerClassProperty", "com.fasterxml.jackson.databind.deser.impl.InnerClassProperty", "_throwAsIOE", new String[]{"com.fasterxml.jackson.core.JsonParser", "java.lang.Exception", "java.lang.Object"}, new String[]{"<sample:0>", "<null>", "<i:8202>"}, false, 9, new String[][]{}, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput010() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.impl.InnerClassProperty", "com.fasterxml.jackson.databind.deser.impl.InnerClassProperty", "getValueDeserializer", new String[]{}, new String[]{}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.deser.impl.InnerClassProperty", "getCreatorIndex", ""}}, 3);
  assertNull(actual);
  assertEquals("receiver state after the call", "[property ''] {getCreatorIndex=7, getManagedReferenceName=null, getName=, getPropertyIndex=-1, hasValueDeserializer=false, hasValueTypeDeserializer=false, hasViews=false, isRequired=false, isVirtual=f...#205#1733294682", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput011() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.impl.InnerClassProperty", "com.fasterxml.jackson.databind.deser.impl.InnerClassProperty", "getValueDeserializer", new String[]{}, new String[]{}, false, 1, new String[][]{{"com.fasterxml.jackson.databind.deser.impl.InnerClassProperty", "getCreatorIndex", ""}}, 3);
  assertNull(actual);
  assertEquals("receiver state after the call", "[property ''] {getCreatorIndex=8, getManagedReferenceName=null, getName=, getPropertyIndex=-1, hasValueDeserializer=false, hasValueTypeDeserializer=false, hasViews=false, isRequired=false, isVirtual=f...#205#1317967865", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput012() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.impl.InnerClassProperty", "com.fasterxml.jackson.databind.deser.impl.InnerClassProperty", "getValueDeserializer", new String[]{}, new String[]{}, false, 2, new String[][]{{"com.fasterxml.jackson.databind.deser.impl.InnerClassProperty", "getCreatorIndex", ""}}, 3);
  assertNull(actual);
  assertEquals("receiver state after the call", "[property 'sample'] {getCreatorIndex=9, getManagedReferenceName=null, getName=sample, getPropertyIndex=-1, hasValueDeserializer=false, hasValueTypeDeserializer=false, hasViews=false, isRequired=false,...#217#-1576293160", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput013() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.impl.InnerClassProperty", "com.fasterxml.jackson.databind.deser.impl.InnerClassProperty", "getValueDeserializer", new String[]{}, new String[]{}, false, 3, new String[][]{{"com.fasterxml.jackson.databind.deser.impl.InnerClassProperty", "getCreatorIndex", ""}}, 3);
  assertNull(actual);
  assertEquals("receiver state after the call", "[property 'sample'] {getCreatorIndex=9, getManagedReferenceName=null, getName=sample, getPropertyIndex=-1, hasValueDeserializer=false, hasValueTypeDeserializer=false, hasViews=false, isRequired=true, ...#216#758135373", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput014() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.impl.InnerClassProperty", "com.fasterxml.jackson.databind.deser.impl.InnerClassProperty", "getValueDeserializer", new String[]{}, new String[]{}, false, 5, new String[][]{{"com.fasterxml.jackson.databind.deser.impl.InnerClassProperty", "getType", ""}, {"com.fasterxml.jackson.databind.deser.impl.InnerClassProperty", "getCreatorIndex", ""}, {"com.fasterxml.jackson.databind.deser.impl.InnerClassProperty", "isRequired", ""}}, 3);
  assertNull(actual);
  assertEquals("receiver state after the call", "[property ''] {getCreatorIndex=12, getManagedReferenceName=null, getName=, getPropertyIndex=-1, hasValueDeserializer=false, hasValueTypeDeserializer=false, hasViews=false, isRequired=false, isVirtual=...#206#-957648002", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput015() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.impl.InnerClassProperty", "com.fasterxml.jackson.databind.deser.impl.InnerClassProperty", "getDeclaringClass", new String[]{}, new String[]{}, false, 8, new String[][]{{"com.fasterxml.jackson.databind.deser.impl.InnerClassProperty", "withValueDeserializer", "com.fasterxml.jackson.databind.JsonDeserializer", "<sample:6>"}, {"com.fasterxml.jackson.databind.deser.impl.InnerClassProperty", "getMember", ""}}, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput016() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.impl.InnerClassProperty", "com.fasterxml.jackson.databind.deser.impl.InnerClassProperty", "withName", new String[]{"java.lang.String"}, new String[]{"-1.5"}, false, 0, null, 1), new String[][]{{"getContextAnnotation", "java.lang.Class", "4"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput017() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.impl.InnerClassProperty", "com.fasterxml.jackson.databind.deser.impl.InnerClassProperty", "withName", new String[]{"java.lang.String"}, new String[]{"-1.5"}, false, 0, null, 1);
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.databind.deser.impl.InnerClassProperty", actual.getClass().getName());
  assertEquals("[property '-1.5'] {getCreatorIndex=7, getManagedReferenceName=null, getName=-1.5, getPropertyIndex=-1, hasValueDeserializer=false, hasValueTypeDeserializer=false, hasViews=false, isRequired=false, isV...#213#-736159238", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "[property ''] {getCreatorIndex=7, getManagedReferenceName=null, getName=, getPropertyIndex=-1, hasValueDeserializer=false, hasValueTypeDeserializer=false, hasViews=false, isRequired=false, isVirtual=f...#205#1733294682", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput018() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.impl.InnerClassProperty", "com.fasterxml.jackson.databind.deser.impl.InnerClassProperty", "withName", new String[]{"java.lang.String"}, new String[]{"abc"}, false, 0, null, 1);
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.databind.deser.impl.InnerClassProperty", actual.getClass().getName());
  assertEquals("[property 'abc'] {getCreatorIndex=7, getManagedReferenceName=null, getName=abc, getPropertyIndex=-1, hasValueDeserializer=false, hasValueTypeDeserializer=false, hasViews=false, isRequired=false, isVir...#211#1705867286", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "[property ''] {getCreatorIndex=7, getManagedReferenceName=null, getName=, getPropertyIndex=-1, hasValueDeserializer=false, hasValueTypeDeserializer=false, hasViews=false, isRequired=false, isVirtual=f...#205#1733294682", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput019() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.impl.InnerClassProperty", "com.fasterxml.jackson.databind.deser.impl.InnerClassProperty", "_throwAsIOE", new String[]{"java.lang.Exception"}, new String[]{"<null>"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.deser.impl.InnerClassProperty", "_throwAsIOE", "com.fasterxml.jackson.core.JsonParser,java.lang.Exception,java.lang.Object", "<sample:3>", "<sample:3>", "<i:1>"}}, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput020() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.impl.InnerClassProperty", "com.fasterxml.jackson.databind.deser.impl.InnerClassProperty", "deserializeAndSet", new String[]{"com.fasterxml.jackson.core.JsonParser", "com.fasterxml.jackson.databind.DeserializationContext", "java.lang.Object"}, new String[]{"<sample:6>", "<sample:5>", "<s:\0130a>"}, false, 9, new String[][]{{"com.fasterxml.jackson.databind.deser.impl.InnerClassProperty", "getObjectIdInfo", ""}, {"com.fasterxml.jackson.databind.deser.impl.InnerClassProperty", "depositSchemaProperty", "com.fasterxml.jackson.databind.jsonFormatVisitors.JsonObjectFormatVisitor,com.fasterxml.jackson.databind.SerializerProvider", "<sample:5>", "<sample:5>"}, {"com.fasterxml.jackson.databind.deser.impl.InnerClassProperty", "findFormatOverrides", "com.fasterxml.jackson.databind.AnnotationIntrospector", "<sample:5>"}}, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput021() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.impl.InnerClassProperty", "com.fasterxml.jackson.databind.deser.impl.InnerClassProperty", "deserializeAndSet", new String[]{"com.fasterxml.jackson.core.JsonParser", "com.fasterxml.jackson.databind.DeserializationContext", "java.lang.Object"}, new String[]{"<sample:7>", "<sample:2>", "<i:-2147483648>"}, false, 12, new String[][]{}, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput022() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.impl.InnerClassProperty", "com.fasterxml.jackson.databind.deser.impl.InnerClassProperty", "deserializeAndSet", new String[]{"com.fasterxml.jackson.core.JsonParser", "com.fasterxml.jackson.databind.DeserializationContext", "java.lang.Object"}, new String[]{"<sample:8>", "<null>", "<i:-2147483648>"}, false, 5, new String[][]{}, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput023() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.impl.InnerClassProperty", "com.fasterxml.jackson.databind.deser.impl.InnerClassProperty", "setAndReturn", new String[]{"java.lang.Object", "java.lang.Object"}, new String[]{"<s:kez>", "<sample:1>"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.deser.impl.InnerClassProperty", "getPropertyIndex", ""}}, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalStateException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput024() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.impl.InnerClassProperty", "com.fasterxml.jackson.databind.deser.impl.InnerClassProperty", "setAndReturn", new String[]{"java.lang.Object", "java.lang.Object"}, new String[]{"<s:kkez>", "<sample:3>"}, false, 10, new String[][]{{"com.fasterxml.jackson.databind.deser.impl.InnerClassProperty", "getPropertyIndex", ""}}, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput025() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.impl.InnerClassProperty", "com.fasterxml.jackson.databind.deser.impl.InnerClassProperty", "withValueDeserializer", new String[]{"com.fasterxml.jackson.databind.JsonDeserializer"}, new String[]{"<null>"}, false, 6, new String[][]{{"com.fasterxml.jackson.databind.deser.impl.InnerClassProperty", "readResolve", ""}}, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput026() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.impl.InnerClassProperty", "com.fasterxml.jackson.databind.deser.impl.InnerClassProperty", "withValueDeserializer", new String[]{"com.fasterxml.jackson.databind.JsonDeserializer"}, new String[]{"<null>"}, false, 5, new String[][]{{"com.fasterxml.jackson.databind.deser.impl.InnerClassProperty", "getName", ""}, {"com.fasterxml.jackson.databind.deser.impl.InnerClassProperty", "readResolve", ""}}, 3);
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.databind.deser.impl.InnerClassProperty", actual.getClass().getName());
  assertEquals("[property ''] {getCreatorIndex=12, getManagedReferenceName=null, getName=, getPropertyIndex=-1, hasValueDeserializer=false, hasValueTypeDeserializer=false, hasViews=false, isRequired=false, isVirtual=...#206#-957648002", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "[property ''] {getCreatorIndex=12, getManagedReferenceName=null, getName=, getPropertyIndex=-1, hasValueDeserializer=false, hasValueTypeDeserializer=false, hasViews=false, isRequired=false, isVirtual=...#206#-957648002", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput027() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.impl.InnerClassProperty", "com.fasterxml.jackson.databind.deser.impl.InnerClassProperty", "withValueDeserializer", new String[]{"com.fasterxml.jackson.databind.JsonDeserializer"}, new String[]{"<null>"}, false, 5, new String[][]{{"com.fasterxml.jackson.databind.deser.impl.InnerClassProperty", "getName", ""}, {"com.fasterxml.jackson.databind.deser.impl.InnerClassProperty", "readResolve", ""}}, 3), new String[][]{{"getValueDeserializer", "", "0"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "[property ''] {getCreatorIndex=12, getManagedReferenceName=null, getName=, getPropertyIndex=-1, hasValueDeserializer=false, hasValueTypeDeserializer=false, hasViews=false, isRequired=false, isVirtual=...#206#-957648002", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput028() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.impl.InnerClassProperty", "com.fasterxml.jackson.databind.deser.impl.InnerClassProperty", "withValueDeserializer", new String[]{"com.fasterxml.jackson.databind.JsonDeserializer"}, new String[]{"<null>"}, false, 5, new String[][]{{"com.fasterxml.jackson.databind.deser.impl.InnerClassProperty", "getName", ""}, {"com.fasterxml.jackson.databind.deser.impl.InnerClassProperty", "readResolve", ""}}, 3), new String[][]{{"getValueDeserializer", "", "0"}, {"deserializeAndSet", "com.fasterxml.jackson.core.JsonParser,com.fasterxml.jackson.databind.DeserializationContext,java.lang.Object", "5"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput029() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.impl.InnerClassProperty", "com.fasterxml.jackson.databind.deser.impl.InnerClassProperty", "withValueDeserializer", new String[]{"com.fasterxml.jackson.databind.JsonDeserializer"}, new String[]{"<sample:1>"}, false, 7, new String[][]{{"com.fasterxml.jackson.databind.deser.impl.InnerClassProperty", "getName", ""}, {"com.fasterxml.jackson.databind.deser.impl.InnerClassProperty", "readResolve", ""}, {"com.fasterxml.jackson.databind.deser.impl.InnerClassProperty", "depositSchemaProperty", "com.fasterxml.jackson.databind.jsonFormatVisitors.JsonObjectFormatVisitor,com.fasterxml.jackson.databind.SerializerProvider", "<sample:5>", "<sample:3>"}}, 3), new String[][]{{"getValueDeserializer", "", "0"}, {"getPropertyIndex", "", "6"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("-1", String.valueOf(actual));
  assertEquals("receiver state after the call", "[property '<a><b>t</b></a>'] {getCreatorIndex=4, getManagedReferenceName=null, getName=<a><b>t</b></a>, getPropertyIndex=-1, hasValueDeserializer=false, hasValueTypeDeserializer=false, hasViews=false,...#235#1709416239", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput030() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.impl.InnerClassProperty", "com.fasterxml.jackson.databind.deser.impl.InnerClassProperty", "findPropertyInclusion", new String[]{"com.fasterxml.jackson.databind.cfg.MapperConfig", "java.lang.Class"}, new String[]{"<sample:2>", "<null>"}, false, 0, null, 3);
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.annotation.JsonInclude$Value", actual.getClass().getName());
  assertEquals("[value=USE_DEFAULTS,content=USE_DEFAULTS] {getContentInclusion=USE_DEFAULTS, getValueInclusion=USE_DEFAULTS}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "[property ''] {getCreatorIndex=7, getManagedReferenceName=null, getName=, getPropertyIndex=-1, hasValueDeserializer=false, hasValueTypeDeserializer=false, hasViews=false, isRequired=false, isVirtual=f...#205#1733294682", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput031() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.impl.InnerClassProperty", "com.fasterxml.jackson.databind.deser.impl.InnerClassProperty", "depositSchemaProperty", new String[]{"com.fasterxml.jackson.databind.jsonFormatVisitors.JsonObjectFormatVisitor", "com.fasterxml.jackson.databind.SerializerProvider"}, new String[]{"<sample:1>", "<sample:0>"}, false, 0, null, 2);
  assertNull(actual);
  assertEquals("receiver state after the call", "[property ''] {getCreatorIndex=7, getManagedReferenceName=null, getName=, getPropertyIndex=-1, hasValueDeserializer=false, hasValueTypeDeserializer=false, hasViews=false, isRequired=false, isVirtual=f...#205#1733294682", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput032() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.impl.InnerClassProperty", "com.fasterxml.jackson.databind.deser.impl.InnerClassProperty", "depositSchemaProperty", new String[]{"com.fasterxml.jackson.databind.jsonFormatVisitors.JsonObjectFormatVisitor", "com.fasterxml.jackson.databind.SerializerProvider"}, new String[]{"<sample:7>", "<sample:9>"}, false, 3, new String[][]{}, 2);
  assertNull(actual);
  assertEquals("receiver state after the call", "[property 'sample'] {getCreatorIndex=9, getManagedReferenceName=null, getName=sample, getPropertyIndex=-1, hasValueDeserializer=false, hasValueTypeDeserializer=false, hasViews=false, isRequired=true, ...#216#758135373", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput033() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.impl.InnerClassProperty", "com.fasterxml.jackson.databind.deser.impl.InnerClassProperty", "depositSchemaProperty", new String[]{"com.fasterxml.jackson.databind.jsonFormatVisitors.JsonObjectFormatVisitor", "com.fasterxml.jackson.databind.SerializerProvider"}, new String[]{"<sample:6>", "<sample:2>"}, false, 15, new String[][]{}, 2);
  assertNull(actual);
  assertEquals("receiver state after the call", "[property '<a><b>t</b></a>'] {getCreatorIndex=4, getManagedReferenceName=null, getName=<a><b>t</b></a>, getPropertyIndex=-1, hasValueDeserializer=false, hasValueTypeDeserializer=false, hasViews=false,...#235#1709416239", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput034() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.impl.InnerClassProperty", "com.fasterxml.jackson.databind.deser.impl.InnerClassProperty", "depositSchemaProperty", new String[]{"com.fasterxml.jackson.databind.jsonFormatVisitors.JsonObjectFormatVisitor", "com.fasterxml.jackson.databind.SerializerProvider"}, new String[]{"<sample:2>", "<sample:9>"}, false, 15, new String[][]{}, 1);
  assertNull(actual);
  assertEquals("receiver state after the call", "[property '<a><b>t</b></a>'] {getCreatorIndex=4, getManagedReferenceName=null, getName=<a><b>t</b></a>, getPropertyIndex=-1, hasValueDeserializer=false, hasValueTypeDeserializer=false, hasViews=false,...#235#1709416239", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput035() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.impl.InnerClassProperty", "com.fasterxml.jackson.databind.deser.impl.InnerClassProperty", "depositSchemaProperty", new String[]{"com.fasterxml.jackson.databind.jsonFormatVisitors.JsonObjectFormatVisitor", "com.fasterxml.jackson.databind.SerializerProvider"}, new String[]{"<sample:2>", "<sample:9>"}, false, 14, new String[][]{}, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput036() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.impl.InnerClassProperty", "com.fasterxml.jackson.databind.deser.impl.InnerClassProperty", "depositSchemaProperty", new String[]{"com.fasterxml.jackson.databind.jsonFormatVisitors.JsonObjectFormatVisitor", "com.fasterxml.jackson.databind.SerializerProvider"}, new String[]{"<sample:7>", "<sample:3>"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.deser.impl.InnerClassProperty", "readResolve", ""}}, 1);
  assertNull(actual);
  assertEquals("receiver state after the call", "[property ''] {getCreatorIndex=7, getManagedReferenceName=null, getName=, getPropertyIndex=-1, hasValueDeserializer=false, hasValueTypeDeserializer=false, hasViews=false, isRequired=false, isVirtual=f...#205#1733294682", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput037() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.impl.InnerClassProperty", "com.fasterxml.jackson.databind.deser.impl.InnerClassProperty", "writeReplace", new String[]{}, new String[]{}, false, 2, new String[][]{{"com.fasterxml.jackson.databind.deser.impl.InnerClassProperty", "withValueDeserializer", "com.fasterxml.jackson.databind.JsonDeserializer", "<sample:4>"}}, 2), new String[][]{{"withSimpleName", "java.lang.String", "6"}});
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.databind.deser.impl.InnerClassProperty", actual.getClass().getName());
  assertEquals("[property '0'] {getCreatorIndex=9, getManagedReferenceName=null, getName=0, getPropertyIndex=-1, hasValueDeserializer=false, hasValueTypeDeserializer=false, hasViews=false, isRequired=false, isVirtual...#207#-1323944452", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "[property 'sample'] {getCreatorIndex=9, getManagedReferenceName=null, getName=sample, getPropertyIndex=-1, hasValueDeserializer=false, hasValueTypeDeserializer=false, hasViews=false, isRequired=false,...#217#-1576293160", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput038() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.impl.InnerClassProperty", "com.fasterxml.jackson.databind.deser.impl.InnerClassProperty", "writeReplace", new String[]{}, new String[]{}, false, 10, new String[][]{{"com.fasterxml.jackson.databind.deser.impl.InnerClassProperty", "withValueDeserializer", "com.fasterxml.jackson.databind.JsonDeserializer", "<sample:4>"}}, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput039() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.impl.InnerClassProperty", "com.fasterxml.jackson.databind.deser.impl.InnerClassProperty", "writeReplace", new String[]{}, new String[]{}, false, 11, new String[][]{{"com.fasterxml.jackson.databind.deser.impl.InnerClassProperty", "getManagedReferenceName", ""}}, 2), new String[][]{{"deserialize", "com.fasterxml.jackson.core.JsonParser,com.fasterxml.jackson.databind.DeserializationContext", "2"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("com.fasterxml.jackson.databind.JsonMappingException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput040() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.impl.InnerClassProperty", "com.fasterxml.jackson.databind.deser.impl.InnerClassProperty", "setObjectIdInfo", new String[]{"com.fasterxml.jackson.databind.introspect.ObjectIdInfo"}, new String[]{"<sample:1>"}, false, 0, null, 1);
  assertNull(actual);
  assertEquals("receiver state after the call", "[property ''] {getCreatorIndex=7, getManagedReferenceName=null, getName=, getPropertyIndex=-1, hasValueDeserializer=false, hasValueTypeDeserializer=false, hasViews=false, isRequired=false, isVirtual=f...#205#1733294682", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput041() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.impl.InnerClassProperty", "com.fasterxml.jackson.databind.deser.impl.InnerClassProperty", "readResolve", new String[]{}, new String[]{}, false, 3, new String[][]{}, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput042() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.impl.InnerClassProperty", "com.fasterxml.jackson.databind.deser.impl.InnerClassProperty", "deserializeAndSet", new String[]{"com.fasterxml.jackson.core.JsonParser", "com.fasterxml.jackson.databind.DeserializationContext", "java.lang.Object"}, new String[]{"<sample:5>", "<sample:5>", "<i:0>"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.deser.impl.InnerClassProperty", "depositSchemaProperty", "com.fasterxml.jackson.databind.jsonFormatVisitors.JsonObjectFormatVisitor,com.fasterxml.jackson.databind.SerializerProvider", "<sample:5>", "<sample:0>"}, {"com.fasterxml.jackson.databind.deser.impl.InnerClassProperty", "deserializeAndSet", "com.fasterxml.jackson.core.JsonParser,com.fasterxml.jackson.databind.DeserializationContext,java.lang.Object", "<sample:4>", "<sample:1>", "<sample:1>"}, {"com.fasterxml.jackson.databind.deser.impl.InnerClassProperty", "getObjectIdInfo", ""}}, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.UnsupportedOperationException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput043() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.impl.InnerClassProperty", "com.fasterxml.jackson.databind.deser.impl.InnerClassProperty", "deserializeAndSet", new String[]{"com.fasterxml.jackson.core.JsonParser", "com.fasterxml.jackson.databind.DeserializationContext", "java.lang.Object"}, new String[]{"<sample:6>", "<sample:3>", "<s:K>"}, false, 2, new String[][]{{"com.fasterxml.jackson.databind.deser.impl.InnerClassProperty", "set", "java.lang.Object,java.lang.Object", "<b:true>", "<b:false>"}, {"com.fasterxml.jackson.databind.deser.impl.InnerClassProperty", "findPropertyInclusion", "com.fasterxml.jackson.databind.cfg.MapperConfig,java.lang.Class", "<sample:6>", "<sample:2>"}, {"com.fasterxml.jackson.databind.deser.impl.InnerClassProperty", "getMember", ""}}, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput044() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.impl.InnerClassProperty", "com.fasterxml.jackson.databind.deser.impl.InnerClassProperty", "deserializeAndSet", new String[]{"com.fasterxml.jackson.core.JsonParser", "com.fasterxml.jackson.databind.DeserializationContext", "java.lang.Object"}, new String[]{"<null>", "<sample:3>", "<s:KK>"}, false, 2, new String[][]{{"com.fasterxml.jackson.databind.deser.impl.InnerClassProperty", "set", "java.lang.Object,java.lang.Object", "<b:true>", "<b:false>"}, {"com.fasterxml.jackson.databind.deser.impl.InnerClassProperty", "findPropertyInclusion", "com.fasterxml.jackson.databind.cfg.MapperConfig,java.lang.Class", "<sample:6>", "<sample:2>"}, {"com.fasterxml.jackson.databind.deser.impl.InnerClassProperty", "getMember", ""}}, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput045() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.impl.InnerClassProperty", "com.fasterxml.jackson.databind.deser.impl.InnerClassProperty", "withValueDeserializer", new String[]{"com.fasterxml.jackson.databind.JsonDeserializer"}, new String[]{"<sample:6>"}, false, 0, null, 1), new String[][]{{"hasViews", "", "6"}, {"withName", "com.fasterxml.jackson.databind.PropertyName", "5"}});
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.databind.deser.impl.InnerClassProperty", actual.getClass().getName());
  assertEquals("[property '0'] {getCreatorIndex=7, getManagedReferenceName=null, getName=0, getPropertyIndex=-1, hasValueDeserializer=false, hasValueTypeDeserializer=false, hasViews=false, isRequired=false, isVirtual...#207#-1343485574", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "[property ''] {getCreatorIndex=7, getManagedReferenceName=null, getName=, getPropertyIndex=-1, hasValueDeserializer=false, hasValueTypeDeserializer=false, hasViews=false, isRequired=false, isVirtual=f...#205#1733294682", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput046() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.impl.InnerClassProperty", "com.fasterxml.jackson.databind.deser.impl.InnerClassProperty", "getCreatorIndex", new String[]{}, new String[]{}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.deser.impl.InnerClassProperty", "deserializeAndSet", "com.fasterxml.jackson.core.JsonParser,com.fasterxml.jackson.databind.DeserializationContext,java.lang.Object", "<sample:4>", "<sample:6>", "<s:b>"}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("7", String.valueOf(actual));
  assertEquals("receiver state after the call", "[property ''] {getCreatorIndex=7, getManagedReferenceName=null, getName=, getPropertyIndex=-1, hasValueDeserializer=false, hasValueTypeDeserializer=false, hasViews=false, isRequired=false, isVirtual=f...#205#1733294682", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput047() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.impl.InnerClassProperty", "com.fasterxml.jackson.databind.deser.impl.InnerClassProperty", "getCreatorIndex", new String[]{}, new String[]{}, false, 1, new String[][]{{"com.fasterxml.jackson.databind.deser.impl.InnerClassProperty", "deserializeAndSet", "com.fasterxml.jackson.core.JsonParser,com.fasterxml.jackson.databind.DeserializationContext,java.lang.Object", "<sample:4>", "<sample:6>", "<s:b>"}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("8", String.valueOf(actual));
  assertEquals("receiver state after the call", "[property ''] {getCreatorIndex=8, getManagedReferenceName=null, getName=, getPropertyIndex=-1, hasValueDeserializer=false, hasValueTypeDeserializer=false, hasViews=false, isRequired=false, isVirtual=f...#205#1317967865", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput048() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.impl.InnerClassProperty", "com.fasterxml.jackson.databind.deser.impl.InnerClassProperty", "getCreatorIndex", new String[]{}, new String[]{}, false, 2, new String[][]{{"com.fasterxml.jackson.databind.deser.impl.InnerClassProperty", "deserializeAndSet", "com.fasterxml.jackson.core.JsonParser,com.fasterxml.jackson.databind.DeserializationContext,java.lang.Object", "<sample:4>", "<sample:6>", "<s:b>"}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("9", String.valueOf(actual));
  assertEquals("receiver state after the call", "[property 'sample'] {getCreatorIndex=9, getManagedReferenceName=null, getName=sample, getPropertyIndex=-1, hasValueDeserializer=false, hasValueTypeDeserializer=false, hasViews=false, isRequired=false,...#217#-1576293160", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput049() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.impl.InnerClassProperty", "com.fasterxml.jackson.databind.deser.impl.InnerClassProperty", "getCreatorIndex", new String[]{}, new String[]{}, false, 3, new String[][]{{"com.fasterxml.jackson.databind.deser.impl.InnerClassProperty", "deserializeAndSet", "com.fasterxml.jackson.core.JsonParser,com.fasterxml.jackson.databind.DeserializationContext,java.lang.Object", "<sample:4>", "<sample:6>", "<s:c>"}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("9", String.valueOf(actual));
  assertEquals("receiver state after the call", "[property 'sample'] {getCreatorIndex=9, getManagedReferenceName=null, getName=sample, getPropertyIndex=-1, hasValueDeserializer=false, hasValueTypeDeserializer=false, hasViews=false, isRequired=true, ...#216#758135373", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput050() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.impl.InnerClassProperty", "com.fasterxml.jackson.databind.deser.impl.InnerClassProperty", "getCreatorIndex", new String[]{}, new String[]{}, false, 4, new String[][]{{"com.fasterxml.jackson.databind.deser.impl.InnerClassProperty", "deserializeAndSet", "com.fasterxml.jackson.core.JsonParser,com.fasterxml.jackson.databind.DeserializationContext,java.lang.Object", "<sample:4>", "<sample:6>", "<s:c>"}}, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput051() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.impl.InnerClassProperty", "com.fasterxml.jackson.databind.deser.impl.InnerClassProperty", "getCreatorIndex", new String[]{}, new String[]{}, false, 5, new String[][]{{"com.fasterxml.jackson.databind.deser.impl.InnerClassProperty", "deserializeAndSet", "com.fasterxml.jackson.core.JsonParser,com.fasterxml.jackson.databind.DeserializationContext,java.lang.Object", "<sample:4>", "<sample:6>", "<s:c>"}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("12", String.valueOf(actual));
  assertEquals("receiver state after the call", "[property ''] {getCreatorIndex=12, getManagedReferenceName=null, getName=, getPropertyIndex=-1, hasValueDeserializer=false, hasValueTypeDeserializer=false, hasViews=false, isRequired=false, isVirtual=...#206#-957648002", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput052() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.impl.InnerClassProperty", "com.fasterxml.jackson.databind.deser.impl.InnerClassProperty", "writeReplace", new String[]{}, new String[]{}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.deser.impl.InnerClassProperty", "deserializeAndSet", "com.fasterxml.jackson.core.JsonParser,com.fasterxml.jackson.databind.DeserializationContext,java.lang.Object", "<sample:6>", "<sample:3>", "<i:2>"}}, 1), new String[][]{{"setViews", "java.lang.Class[]", "3"}, {"getMetadata", "", "3"}});
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.databind.PropertyMetadata", actual.getClass().getName());
  assertEquals("{getDefaultValue=null, getDescription=null, getIndex=null, getRequired=null, hasDefaultValue=false, hasDefuaultValue=false, hasIndex=false, isRequired=false}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "[property ''] {getCreatorIndex=7, getManagedReferenceName=null, getName=, getPropertyIndex=-1, hasValueDeserializer=false, hasValueTypeDeserializer=false, hasViews=false, isRequired=false, isVirtual=f...#205#1733294682", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput053() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.impl.InnerClassProperty", "com.fasterxml.jackson.databind.deser.impl.InnerClassProperty", "writeReplace", new String[]{}, new String[]{}, false, 1, new String[][]{{"com.fasterxml.jackson.databind.deser.impl.InnerClassProperty", "deserializeAndSet", "com.fasterxml.jackson.core.JsonParser,com.fasterxml.jackson.databind.DeserializationContext,java.lang.Object", "<sample:6>", "<sample:3>", "<i:2>"}}, 1), new String[][]{{"setViews", "java.lang.Class[]", "3"}, {"getMetadata", "", "3"}});
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.databind.PropertyMetadata", actual.getClass().getName());
  assertEquals("{getDefaultValue=null, getDescription=null, getIndex=null, getRequired=null, hasDefaultValue=false, hasDefuaultValue=false, hasIndex=false, isRequired=false}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "[property ''] {getCreatorIndex=8, getManagedReferenceName=null, getName=, getPropertyIndex=-1, hasValueDeserializer=false, hasValueTypeDeserializer=false, hasViews=false, isRequired=false, isVirtual=f...#205#1317967865", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput054() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.impl.InnerClassProperty", "com.fasterxml.jackson.databind.deser.impl.InnerClassProperty", "writeReplace", new String[]{}, new String[]{}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.deser.impl.InnerClassProperty", "deserializeAndSet", "com.fasterxml.jackson.core.JsonParser,com.fasterxml.jackson.databind.DeserializationContext,java.lang.Object", "<sample:6>", "<sample:3>", "<i:2>"}}, 1), new String[][]{{"setViews", "java.lang.Class[]", "3"}});
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.databind.deser.impl.InnerClassProperty", actual.getClass().getName());
  assertEquals("[property ''] {getCreatorIndex=7, getManagedReferenceName=null, getName=, getPropertyIndex=-1, hasValueDeserializer=false, hasValueTypeDeserializer=false, hasViews=true, isRequired=false, isVirtual=fa...#204#1981869681", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "[property ''] {getCreatorIndex=7, getManagedReferenceName=null, getName=, getPropertyIndex=-1, hasValueDeserializer=false, hasValueTypeDeserializer=false, hasViews=false, isRequired=false, isVirtual=f...#205#1733294682", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput055() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.impl.InnerClassProperty", "com.fasterxml.jackson.databind.deser.impl.InnerClassProperty", "writeReplace", new String[]{}, new String[]{}, false, 2, new String[][]{{"com.fasterxml.jackson.databind.deser.impl.InnerClassProperty", "deserializeAndSet", "com.fasterxml.jackson.core.JsonParser,com.fasterxml.jackson.databind.DeserializationContext,java.lang.Object", "<sample:6>", "<sample:2>", "<i:25>"}}, 1), new String[][]{{"setViews", "java.lang.Class[]", "3"}});
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.databind.deser.impl.InnerClassProperty", actual.getClass().getName());
  assertEquals("[property 'sample'] {getCreatorIndex=9, getManagedReferenceName=null, getName=sample, getPropertyIndex=-1, hasValueDeserializer=false, hasValueTypeDeserializer=false, hasViews=true, isRequired=false, ...#216#2013656115", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "[property 'sample'] {getCreatorIndex=9, getManagedReferenceName=null, getName=sample, getPropertyIndex=-1, hasValueDeserializer=false, hasValueTypeDeserializer=false, hasViews=true, isRequired=false, ...#216#2013656115", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput056() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.impl.InnerClassProperty", "com.fasterxml.jackson.databind.deser.impl.InnerClassProperty", "writeReplace", new String[]{}, new String[]{}, false, 3, new String[][]{{"com.fasterxml.jackson.databind.deser.impl.InnerClassProperty", "deserializeAndSet", "com.fasterxml.jackson.core.JsonParser,com.fasterxml.jackson.databind.DeserializationContext,java.lang.Object", "<sample:6>", "<sample:2>", "<i:25>"}}, 1), new String[][]{{"setViews", "java.lang.Class[]", "3"}});
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.databind.deser.impl.InnerClassProperty", actual.getClass().getName());
  assertEquals("[property 'sample'] {getCreatorIndex=9, getManagedReferenceName=null, getName=sample, getPropertyIndex=-1, hasValueDeserializer=false, hasValueTypeDeserializer=false, hasViews=true, isRequired=true, i...#215#-1619911790", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "[property 'sample'] {getCreatorIndex=9, getManagedReferenceName=null, getName=sample, getPropertyIndex=-1, hasValueDeserializer=false, hasValueTypeDeserializer=false, hasViews=false, isRequired=true, ...#216#758135373", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput057() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.impl.InnerClassProperty", "com.fasterxml.jackson.databind.deser.impl.InnerClassProperty", "writeReplace", new String[]{}, new String[]{}, false, 4, new String[][]{{"com.fasterxml.jackson.databind.deser.impl.InnerClassProperty", "deserializeAndSet", "com.fasterxml.jackson.core.JsonParser,com.fasterxml.jackson.databind.DeserializationContext,java.lang.Object", "<sample:6>", "<sample:2>", "<i:25>"}}, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput058() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.impl.InnerClassProperty", "com.fasterxml.jackson.databind.deser.impl.InnerClassProperty", "writeReplace", new String[]{}, new String[]{}, false, 5, new String[][]{{"com.fasterxml.jackson.databind.deser.impl.InnerClassProperty", "deserializeAndSet", "com.fasterxml.jackson.core.JsonParser,com.fasterxml.jackson.databind.DeserializationContext,java.lang.Object", "<sample:6>", "<sample:2>", "<i:25>"}}, 1), new String[][]{{"setViews", "java.lang.Class[]", "3"}});
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.databind.deser.impl.InnerClassProperty", actual.getClass().getName());
  assertEquals("[property ''] {getCreatorIndex=12, getManagedReferenceName=null, getName=, getPropertyIndex=-1, hasValueDeserializer=false, hasValueTypeDeserializer=false, hasViews=true, isRequired=false, isVirtual=f...#205#509591757", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "[property ''] {getCreatorIndex=12, getManagedReferenceName=null, getName=, getPropertyIndex=-1, hasValueDeserializer=false, hasValueTypeDeserializer=false, hasViews=false, isRequired=false, isVirtual=...#206#-957648002", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput059() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.impl.InnerClassProperty", "com.fasterxml.jackson.databind.deser.impl.InnerClassProperty", "writeReplace", new String[]{}, new String[]{}, false, 7, new String[][]{{"com.fasterxml.jackson.databind.deser.impl.InnerClassProperty", "deserializeAndSet", "com.fasterxml.jackson.core.JsonParser,com.fasterxml.jackson.databind.DeserializationContext,java.lang.Object", "<sample:6>", "<sample:4>", "<i:25>"}, {"com.fasterxml.jackson.databind.deser.impl.InnerClassProperty", "depositSchemaProperty", "com.fasterxml.jackson.databind.jsonFormatVisitors.JsonObjectFormatVisitor,com.fasterxml.jackson.databind.SerializerProvider", "<sample:5>", "<sample:1>"}}, 1), new String[][]{{"setViews", "java.lang.Class[]", "3"}});
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.databind.deser.impl.InnerClassProperty", actual.getClass().getName());
  assertEquals("[property '<a><b>t</b></a>'] {getCreatorIndex=4, getManagedReferenceName=null, getName=<a><b>t</b></a>, getPropertyIndex=-1, hasValueDeserializer=false, hasValueTypeDeserializer=false, hasViews=true, ...#234#1288362748", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "[property '<a><b>t</b></a>'] {getCreatorIndex=4, getManagedReferenceName=null, getName=<a><b>t</b></a>, getPropertyIndex=-1, hasValueDeserializer=false, hasValueTypeDeserializer=false, hasViews=false,...#235#1709416239", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput060() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.impl.InnerClassProperty", "com.fasterxml.jackson.databind.deser.impl.InnerClassProperty", "writeReplace", new String[]{}, new String[]{}, false, 9, new String[][]{{"com.fasterxml.jackson.databind.deser.impl.InnerClassProperty", "deserializeAndSet", "com.fasterxml.jackson.core.JsonParser,com.fasterxml.jackson.databind.DeserializationContext,java.lang.Object", "<sample:6>", "<sample:4>", "<i:25>"}, {"com.fasterxml.jackson.databind.deser.impl.InnerClassProperty", "depositSchemaProperty", "com.fasterxml.jackson.databind.jsonFormatVisitors.JsonObjectFormatVisitor,com.fasterxml.jackson.databind.SerializerProvider", "<sample:5>", "<null>"}}, 1), new String[][]{{"hasValueDeserializer", "", "7"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "[property ''] {getCreatorIndex=64, getManagedReferenceName=null, getName=, getPropertyIndex=-1, hasValueDeserializer=false, hasValueTypeDeserializer=false, hasViews=false, isRequired=true, isVirtual=f...#205#1999798276", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput061() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.impl.InnerClassProperty", "com.fasterxml.jackson.databind.deser.impl.InnerClassProperty", "writeReplace", new String[]{}, new String[]{}, false, 9, new String[][]{{"com.fasterxml.jackson.databind.deser.impl.InnerClassProperty", "setViews", "java.lang.Class[]", "<sample:0>"}, {"com.fasterxml.jackson.databind.deser.impl.InnerClassProperty", "deserializeAndSet", "com.fasterxml.jackson.core.JsonParser,com.fasterxml.jackson.databind.DeserializationContext,java.lang.Object", "<sample:6>", "<sample:4>", "<i:25>"}, {"com.fasterxml.jackson.databind.deser.impl.InnerClassProperty", "depositSchemaProperty", "com.fasterxml.jackson.databind.jsonFormatVisitors.JsonObjectFormatVisitor,com.fasterxml.jackson.databind.SerializerProvider", "<sample:5>", "<null>"}}, 1), new String[][]{{"hasValueDeserializer", "", "7"}, {"hasValueDeserializer", "", "0"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "[property ''] {getCreatorIndex=64, getManagedReferenceName=null, getName=, getPropertyIndex=-1, hasValueDeserializer=false, hasValueTypeDeserializer=false, hasViews=true, isRequired=true, isVirtual=fa...#204#1606730491", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput062() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.impl.InnerClassProperty", "com.fasterxml.jackson.databind.deser.impl.InnerClassProperty", "writeReplace", new String[]{}, new String[]{}, false, 9, new String[][]{{"com.fasterxml.jackson.databind.deser.impl.InnerClassProperty", "setViews", "java.lang.Class[]", "<sample:0>"}, {"com.fasterxml.jackson.databind.deser.impl.InnerClassProperty", "deserializeAndSet", "com.fasterxml.jackson.core.JsonParser,com.fasterxml.jackson.databind.DeserializationContext,java.lang.Object", "<sample:6>", "<sample:4>", "<i:25>"}, {"com.fasterxml.jackson.databind.deser.impl.InnerClassProperty", "depositSchemaProperty", "com.fasterxml.jackson.databind.jsonFormatVisitors.JsonObjectFormatVisitor,com.fasterxml.jackson.databind.SerializerProvider", "<sample:5>", "<null>"}}, 1), new String[][]{{"hasValueDeserializer", "", "7"}, {"hasValueDeserializer", "", "0"}, {"getValueDeserializer", "", "0"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "[property ''] {getCreatorIndex=64, getManagedReferenceName=null, getName=, getPropertyIndex=-1, hasValueDeserializer=false, hasValueTypeDeserializer=false, hasViews=true, isRequired=true, isVirtual=fa...#204#1606730491", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput063() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.impl.InnerClassProperty", "com.fasterxml.jackson.databind.deser.impl.InnerClassProperty", "getWrapperName", new String[]{}, new String[]{}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.deser.impl.InnerClassProperty", "findPropertyFormat", "com.fasterxml.jackson.databind.cfg.MapperConfig,java.lang.Class", "<sample:3>", "<sample:0>"}}, 3);
  assertNull(actual);
  assertEquals("receiver state after the call", "[property ''] {getCreatorIndex=7, getManagedReferenceName=null, getName=, getPropertyIndex=-1, hasValueDeserializer=false, hasValueTypeDeserializer=false, hasViews=false, isRequired=false, isVirtual=f...#205#1733294682", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput064() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.impl.InnerClassProperty", "com.fasterxml.jackson.databind.deser.impl.InnerClassProperty", "getWrapperName", new String[]{}, new String[]{}, false, 7, new String[][]{{"com.fasterxml.jackson.databind.deser.impl.InnerClassProperty", "findPropertyFormat", "com.fasterxml.jackson.databind.cfg.MapperConfig,java.lang.Class", "<sample:3>", "<sample:0>"}}, 3);
  assertNull(actual);
  assertEquals("receiver state after the call", "[property '<a><b>t</b></a>'] {getCreatorIndex=4, getManagedReferenceName=null, getName=<a><b>t</b></a>, getPropertyIndex=-1, hasValueDeserializer=false, hasValueTypeDeserializer=false, hasViews=false,...#235#1709416239", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput065() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.impl.InnerClassProperty", "com.fasterxml.jackson.databind.deser.impl.InnerClassProperty", "visibleInView", new String[]{"java.lang.Class"}, new String[]{"<null>"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.deser.impl.InnerClassProperty", "writeReplace", ""}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
  assertEquals("receiver state after the call", "[property ''] {getCreatorIndex=7, getManagedReferenceName=null, getName=, getPropertyIndex=-1, hasValueDeserializer=false, hasValueTypeDeserializer=false, hasViews=false, isRequired=false, isVirtual=f...#205#1733294682", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput066() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.impl.InnerClassProperty", "com.fasterxml.jackson.databind.deser.impl.InnerClassProperty", "setViews", new String[]{"java.lang.Class[]"}, new String[]{"<sample:2>"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.deser.impl.InnerClassProperty", "getManagedReferenceName", ""}}, 3);
  assertNull(actual);
  assertEquals("receiver state after the call", "[property ''] {getCreatorIndex=7, getManagedReferenceName=null, getName=, getPropertyIndex=-1, hasValueDeserializer=false, hasValueTypeDeserializer=false, hasViews=true, isRequired=false, isVirtual=fa...#204#1981869681", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput067() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.impl.InnerClassProperty", "com.fasterxml.jackson.databind.deser.impl.InnerClassProperty", "setViews", new String[]{"java.lang.Class[]"}, new String[]{"<sample:3>"}, false, 1, new String[][]{{"com.fasterxml.jackson.databind.deser.impl.InnerClassProperty", "getManagedReferenceName", ""}, {"com.fasterxml.jackson.databind.deser.impl.InnerClassProperty", "getObjectIdInfo", ""}}, 3);
  assertNull(actual);
  assertEquals("receiver state after the call", "[property ''] {getCreatorIndex=8, getManagedReferenceName=null, getName=, getPropertyIndex=-1, hasValueDeserializer=false, hasValueTypeDeserializer=false, hasViews=true, isRequired=false, isVirtual=fa...#204#-2049400590", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput068() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.impl.InnerClassProperty", "com.fasterxml.jackson.databind.deser.impl.InnerClassProperty", "setViews", new String[]{"java.lang.Class[]"}, new String[]{"<sample:2>"}, false, 5, new String[][]{{"com.fasterxml.jackson.databind.deser.impl.InnerClassProperty", "getManagedReferenceName", ""}, {"com.fasterxml.jackson.databind.deser.impl.InnerClassProperty", "getObjectIdInfo", ""}}, 3);
  assertNull(actual);
  assertEquals("receiver state after the call", "[property ''] {getCreatorIndex=12, getManagedReferenceName=null, getName=, getPropertyIndex=-1, hasValueDeserializer=false, hasValueTypeDeserializer=false, hasViews=true, isRequired=false, isVirtual=f...#205#509591757", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput069() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.impl.InnerClassProperty", "com.fasterxml.jackson.databind.deser.impl.InnerClassProperty", "getType", new String[]{}, new String[]{}, false, 15, new String[][]{{"com.fasterxml.jackson.databind.deser.impl.InnerClassProperty", "writeReplace", ""}, {"com.fasterxml.jackson.databind.deser.impl.InnerClassProperty", "depositSchemaProperty", "com.fasterxml.jackson.databind.jsonFormatVisitors.JsonObjectFormatVisitor,com.fasterxml.jackson.databind.SerializerProvider", "<null>", "<null>"}}, 1);
  assertNull(actual);
  assertEquals("receiver state after the call", "[property '<a><b>t</b></a>'] {getCreatorIndex=4, getManagedReferenceName=null, getName=<a><b>t</b></a>, getPropertyIndex=-1, hasValueDeserializer=false, hasValueTypeDeserializer=false, hasViews=false,...#235#1709416239", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput070() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.impl.InnerClassProperty", "com.fasterxml.jackson.databind.deser.impl.InnerClassProperty", "getType", new String[]{}, new String[]{}, false, 16, new String[][]{{"com.fasterxml.jackson.databind.deser.impl.InnerClassProperty", "writeReplace", ""}, {"com.fasterxml.jackson.databind.deser.impl.InnerClassProperty", "depositSchemaProperty", "com.fasterxml.jackson.databind.jsonFormatVisitors.JsonObjectFormatVisitor,com.fasterxml.jackson.databind.SerializerProvider", "<null>", "<sample:7>"}}, 1);
  assertNull(actual);
  assertEquals("receiver state after the call", "[property ''] {getCreatorIndex=3, getManagedReferenceName=null, getName=, getPropertyIndex=-1, hasValueDeserializer=false, hasValueTypeDeserializer=false, hasViews=false, isRequired=false, isVirtual=f...#205#-900365346", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput071() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.impl.InnerClassProperty", "com.fasterxml.jackson.databind.deser.impl.InnerClassProperty", "getType", new String[]{}, new String[]{}, false, 17, new String[][]{{"com.fasterxml.jackson.databind.deser.impl.InnerClassProperty", "writeReplace", ""}, {"com.fasterxml.jackson.databind.deser.impl.InnerClassProperty", "depositSchemaProperty", "com.fasterxml.jackson.databind.jsonFormatVisitors.JsonObjectFormatVisitor,com.fasterxml.jackson.databind.SerializerProvider", "<null>", "<sample:7>"}}, 1);
  assertNull(actual);
  assertEquals("receiver state after the call", "[property ''] {getCreatorIndex=4, getManagedReferenceName=null, getName=, getPropertyIndex=-1, hasValueDeserializer=false, hasValueTypeDeserializer=false, hasViews=false, isRequired=false, isVirtual=f...#205#-1315692163", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput072() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.impl.InnerClassProperty", "com.fasterxml.jackson.databind.deser.impl.InnerClassProperty", "setObjectIdInfo", new String[]{"com.fasterxml.jackson.databind.introspect.ObjectIdInfo"}, new String[]{"<sample:2>"}, false, 6, new String[][]{{"com.fasterxml.jackson.databind.deser.impl.InnerClassProperty", "_throwAsIOE", "com.fasterxml.jackson.core.JsonParser,java.lang.Exception,java.lang.Object", "<sample:1>", "<empty>", "<null>"}}, 2);
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput073() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.impl.InnerClassProperty", "com.fasterxml.jackson.databind.deser.impl.InnerClassProperty", "withName", new String[]{"com.fasterxml.jackson.databind.PropertyName"}, new String[]{"<sample:7>"}, false, 5, new String[][]{{"com.fasterxml.jackson.databind.deser.impl.InnerClassProperty", "getManagedReferenceName", ""}, {"com.fasterxml.jackson.databind.deser.impl.InnerClassProperty", "deserializeAndSet", "com.fasterxml.jackson.core.JsonParser,com.fasterxml.jackson.databind.DeserializationContext,java.lang.Object", "<sample:5>", "<sample:2>", "<s:>"}}, 1);
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.databind.deser.impl.InnerClassProperty", actual.getClass().getName());
  assertEquals("[property ''] {getCreatorIndex=12, getManagedReferenceName=null, getName=, getPropertyIndex=-1, hasValueDeserializer=false, hasValueTypeDeserializer=false, hasViews=false, isRequired=false, isVirtual=...#206#-957648002", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "[property ''] {getCreatorIndex=12, getManagedReferenceName=null, getName=, getPropertyIndex=-1, hasValueDeserializer=false, hasValueTypeDeserializer=false, hasViews=false, isRequired=false, isVirtual=...#206#-957648002", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput074() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.impl.InnerClassProperty", "com.fasterxml.jackson.databind.deser.impl.InnerClassProperty", "withName", new String[]{"com.fasterxml.jackson.databind.PropertyName"}, new String[]{"<sample:7>"}, false, 8, new String[][]{{"com.fasterxml.jackson.databind.deser.impl.InnerClassProperty", "getManagedReferenceName", ""}, {"com.fasterxml.jackson.databind.deser.impl.InnerClassProperty", "deserializeAndSet", "com.fasterxml.jackson.core.JsonParser,com.fasterxml.jackson.databind.DeserializationContext,java.lang.Object", "<sample:5>", "<sample:2>", "<s:>"}}, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput075() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.impl.InnerClassProperty", "com.fasterxml.jackson.databind.deser.impl.InnerClassProperty", "withName", new String[]{"com.fasterxml.jackson.databind.PropertyName"}, new String[]{"<sample:7>"}, false, 9, new String[][]{{"com.fasterxml.jackson.databind.deser.impl.InnerClassProperty", "getManagedReferenceName", ""}, {"com.fasterxml.jackson.databind.deser.impl.InnerClassProperty", "deserializeAndSet", "com.fasterxml.jackson.core.JsonParser,com.fasterxml.jackson.databind.DeserializationContext,java.lang.Object", "<sample:5>", "<sample:2>", "<s:>"}}, 1);
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.databind.deser.impl.InnerClassProperty", actual.getClass().getName());
  assertEquals("[property ''] {getCreatorIndex=64, getManagedReferenceName=null, getName=, getPropertyIndex=-1, hasValueDeserializer=false, hasValueTypeDeserializer=false, hasViews=false, isRequired=true, isVirtual=f...#205#1999798276", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "[property ''] {getCreatorIndex=64, getManagedReferenceName=null, getName=, getPropertyIndex=-1, hasValueDeserializer=false, hasValueTypeDeserializer=false, hasViews=false, isRequired=true, isVirtual=f...#205#1999798276", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput076() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.impl.InnerClassProperty", "com.fasterxml.jackson.databind.deser.impl.InnerClassProperty", "withName", new String[]{"com.fasterxml.jackson.databind.PropertyName"}, new String[]{"<sample:7>"}, false, 9, new String[][]{{"com.fasterxml.jackson.databind.deser.impl.InnerClassProperty", "getManagedReferenceName", ""}, {"com.fasterxml.jackson.databind.deser.impl.InnerClassProperty", "deserializeAndSet", "com.fasterxml.jackson.core.JsonParser,com.fasterxml.jackson.databind.DeserializationContext,java.lang.Object", "<sample:5>", "<sample:2>", "<s:>"}}, 1), new String[][]{{"getPropertyIndex", "", "3"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("-1", String.valueOf(actual));
  assertEquals("receiver state after the call", "[property ''] {getCreatorIndex=64, getManagedReferenceName=null, getName=, getPropertyIndex=-1, hasValueDeserializer=false, hasValueTypeDeserializer=false, hasViews=false, isRequired=true, isVirtual=f...#205#1999798276", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput077() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.impl.InnerClassProperty", "com.fasterxml.jackson.databind.deser.impl.InnerClassProperty", "visibleInView", new String[]{"java.lang.Class"}, new String[]{"<sample:2>"}, false, 0, null, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
  assertEquals("receiver state after the call", "[property ''] {getCreatorIndex=7, getManagedReferenceName=null, getName=, getPropertyIndex=-1, hasValueDeserializer=false, hasValueTypeDeserializer=false, hasViews=false, isRequired=false, isVirtual=f...#205#1733294682", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput078() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.impl.InnerClassProperty", "com.fasterxml.jackson.databind.deser.impl.InnerClassProperty", "hasViews", new String[]{}, new String[]{}, false, 5, new String[][]{}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "[property ''] {getCreatorIndex=12, getManagedReferenceName=null, getName=, getPropertyIndex=-1, hasValueDeserializer=false, hasValueTypeDeserializer=false, hasViews=false, isRequired=false, isVirtual=...#206#-957648002", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput079() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.impl.InnerClassProperty", "com.fasterxml.jackson.databind.deser.impl.InnerClassProperty", "hasViews", new String[]{}, new String[]{}, false, 7, new String[][]{}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "[property '<a><b>t</b></a>'] {getCreatorIndex=4, getManagedReferenceName=null, getName=<a><b>t</b></a>, getPropertyIndex=-1, hasValueDeserializer=false, hasValueTypeDeserializer=false, hasViews=false,...#235#1709416239", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput080() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.impl.InnerClassProperty", "com.fasterxml.jackson.databind.deser.impl.InnerClassProperty", "getAnnotation", new String[]{"java.lang.Class"}, new String[]{"<empty>"}, false, 0, null, 3);
  assertNull(actual);
  assertEquals("receiver state after the call", "[property ''] {getCreatorIndex=7, getManagedReferenceName=null, getName=, getPropertyIndex=-1, hasValueDeserializer=false, hasValueTypeDeserializer=false, hasViews=false, isRequired=false, isVirtual=f...#205#1733294682", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput081() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.impl.InnerClassProperty", "com.fasterxml.jackson.databind.deser.impl.InnerClassProperty", "findPropertyFormat", new String[]{"com.fasterxml.jackson.databind.cfg.MapperConfig", "java.lang.Class"}, new String[]{"<sample:7>", "<empty>"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.deser.impl.InnerClassProperty", "setManagedReferenceName", "java.lang.String", "2020-02-30T25:61:61"}, {"com.fasterxml.jackson.databind.deser.impl.InnerClassProperty", "getType", ""}});
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.annotation.JsonFormat$Value", actual.getClass().getName());
  assertEquals("[pattern=,shape=ANY,locale=null,timezone=null] {getPattern=, getShape=ANY, hasLocale=false, hasPattern=false, hasShape=false, hasTimeZone=false}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "[property ''] {getCreatorIndex=7, getManagedReferenceName=2020-02-30T25:61:61, getName=, getPropertyIndex=-1, hasValueDeserializer=false, hasValueTypeDeserializer=false, hasViews=false, isRequired=fal...#220#-85843771", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput082() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.impl.InnerClassProperty", "com.fasterxml.jackson.databind.deser.impl.InnerClassProperty", "findPropertyFormat", new String[]{"com.fasterxml.jackson.databind.cfg.MapperConfig", "java.lang.Class"}, new String[]{"<sample:7>", "<empty>"}, false, 7, new String[][]{{"com.fasterxml.jackson.databind.deser.impl.InnerClassProperty", "setManagedReferenceName", "java.lang.String", "2020-02-30T25:61:61"}, {"com.fasterxml.jackson.databind.deser.impl.InnerClassProperty", "getType", ""}});
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.annotation.JsonFormat$Value", actual.getClass().getName());
  assertEquals("[pattern=,shape=ANY,locale=null,timezone=null] {getPattern=, getShape=ANY, hasLocale=false, hasPattern=false, hasShape=false, hasTimeZone=false}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "[property '<a><b>t</b></a>'] {getCreatorIndex=4, getManagedReferenceName=2020-02-30T25:61:61, getName=<a><b>t</b></a>, getPropertyIndex=-1, hasValueDeserializer=false, hasValueTypeDeserializer=false, ...#250#1429328662", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput083() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.impl.InnerClassProperty", "com.fasterxml.jackson.databind.deser.impl.InnerClassProperty", "findPropertyFormat", new String[]{"com.fasterxml.jackson.databind.cfg.MapperConfig", "java.lang.Class"}, new String[]{"<sample:7>", "<empty>"}, false, 7, new String[][]{{"com.fasterxml.jackson.databind.deser.impl.InnerClassProperty", "setManagedReferenceName", "java.lang.String", "2020-02-30T25:61:61"}, {"com.fasterxml.jackson.databind.deser.impl.InnerClassProperty", "getType", ""}}), new String[][]{{"getPattern", "", "4"}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("", String.valueOf(actual));
  assertEquals("receiver state after the call", "[property '<a><b>t</b></a>'] {getCreatorIndex=4, getManagedReferenceName=2020-02-30T25:61:61, getName=<a><b>t</b></a>, getPropertyIndex=-1, hasValueDeserializer=false, hasValueTypeDeserializer=false, ...#250#1429328662", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput084() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.impl.InnerClassProperty", "com.fasterxml.jackson.databind.deser.impl.InnerClassProperty", "findPropertyFormat", new String[]{"com.fasterxml.jackson.databind.cfg.MapperConfig", "java.lang.Class"}, new String[]{"<sample:7>", "<empty>"}, false, 7, new String[][]{{"com.fasterxml.jackson.databind.deser.impl.InnerClassProperty", "setManagedReferenceName", "java.lang.String", "2020-02-3025:61:61"}, {"com.fasterxml.jackson.databind.deser.impl.InnerClassProperty", "getType", ""}}), new String[][]{{"getPattern", "", "4"}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("", String.valueOf(actual));
  assertEquals("receiver state after the call", "[property '<a><b>t</b></a>'] {getCreatorIndex=4, getManagedReferenceName=2020-02-3025:61:61, getName=<a><b>t</b></a>, getPropertyIndex=-1, hasValueDeserializer=false, hasValueTypeDeserializer=false, h...#249#67733890", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput085() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.impl.InnerClassProperty", "com.fasterxml.jackson.databind.deser.impl.InnerClassProperty", "findPropertyFormat", new String[]{"com.fasterxml.jackson.databind.cfg.MapperConfig", "java.lang.Class"}, new String[]{"<sample:7>", "<empty>"}, false, 7, new String[][]{{"com.fasterxml.jackson.databind.deser.impl.InnerClassProperty", "setManagedReferenceName", "java.lang.String", "2020-02-31T25:61:61"}, {"com.fasterxml.jackson.databind.deser.impl.InnerClassProperty", "getType", ""}}), new String[][]{{"getPattern", "", "4"}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("", String.valueOf(actual));
  assertEquals("receiver state after the call", "[property '<a><b>t</b></a>'] {getCreatorIndex=4, getManagedReferenceName=2020-02-31T25:61:61, getName=<a><b>t</b></a>, getPropertyIndex=-1, hasValueDeserializer=false, hasValueTypeDeserializer=false, ...#250#1084412917", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput086() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.impl.InnerClassProperty", "com.fasterxml.jackson.databind.deser.impl.InnerClassProperty", "findPropertyFormat", new String[]{"com.fasterxml.jackson.databind.cfg.MapperConfig", "java.lang.Class"}, new String[]{"<sample:7>", "<empty>"}, false, 7, new String[][]{{"com.fasterxml.jackson.databind.deser.impl.InnerClassProperty", "assignIndex", "int", "-2147483648"}, {"com.fasterxml.jackson.databind.deser.impl.InnerClassProperty", "setManagedReferenceName", "java.lang.String", "2020-02-31T25:61:61"}, {"com.fasterxml.jackson.databind.deser.impl.InnerClassProperty", "getType", ""}}), new String[][]{{"getPattern", "", "4"}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("", String.valueOf(actual));
  assertEquals("receiver state after the call", "[property '<a><b>t</b></a>'] {getCreatorIndex=4, getManagedReferenceName=2020-02-31T25:61:61, getName=<a><b>t</b></a>, getPropertyIndex=-2147483648, hasValueDeserializer=false, hasValueTypeDeserialize...#259#1570329923", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput087() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.impl.InnerClassProperty", "com.fasterxml.jackson.databind.deser.impl.InnerClassProperty", "findPropertyFormat", new String[]{"com.fasterxml.jackson.databind.cfg.MapperConfig", "java.lang.Class"}, new String[]{"<sample:4>", "<empty>"}, false, 7, new String[][]{{"com.fasterxml.jackson.databind.deser.impl.InnerClassProperty", "assignIndex", "int", "-2147483648"}, {"com.fasterxml.jackson.databind.deser.impl.InnerClassProperty", "setManagedReferenceName", "java.lang.String", "2020-02-31T25:61:61"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput088() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.impl.InnerClassProperty", "com.fasterxml.jackson.databind.deser.impl.InnerClassProperty", "deserialize", new String[]{"com.fasterxml.jackson.core.JsonParser", "com.fasterxml.jackson.databind.DeserializationContext"}, new String[]{"<sample:4>", "<sample:5>"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.deser.impl.InnerClassProperty", "deserializeAndSet", "com.fasterxml.jackson.core.JsonParser,com.fasterxml.jackson.databind.DeserializationContext,java.lang.Object", "<null>", "<sample:0>", "<i:1>"}, {"com.fasterxml.jackson.databind.deser.impl.InnerClassProperty", "_throwAsIOE", "com.fasterxml.jackson.core.JsonParser,java.lang.Exception,java.lang.Object", "<sample:3>", "<null>", "<s:key>"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("com.fasterxml.jackson.databind.JsonMappingException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput089() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.impl.InnerClassProperty", "com.fasterxml.jackson.databind.deser.impl.InnerClassProperty", "deserialize", new String[]{"com.fasterxml.jackson.core.JsonParser", "com.fasterxml.jackson.databind.DeserializationContext"}, new String[]{"<sample:7>", "<sample:7>"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.deser.impl.InnerClassProperty", "deserializeAndSet", "com.fasterxml.jackson.core.JsonParser,com.fasterxml.jackson.databind.DeserializationContext,java.lang.Object", "<null>", "<sample:0>", "<i:0>"}, {"com.fasterxml.jackson.databind.deser.impl.InnerClassProperty", "setObjectIdInfo", "com.fasterxml.jackson.databind.introspect.ObjectIdInfo", "<null>"}, {"com.fasterxml.jackson.databind.deser.impl.InnerClassProperty", "_throwAsIOE", "com.fasterxml.jackson.core.JsonParser,java.lang.Exception,java.lang.Object", "<sample:3>", "<sample:3>", "<s:key>"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput090() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.impl.InnerClassProperty", "com.fasterxml.jackson.databind.deser.impl.InnerClassProperty", "getDeclaringClass", new String[]{}, new String[]{}, false); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput091() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.impl.InnerClassProperty", "com.fasterxml.jackson.databind.deser.impl.InnerClassProperty", "getDeclaringClass", new String[]{}, new String[]{}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.deser.impl.InnerClassProperty", "deserializeAndSet", "com.fasterxml.jackson.core.JsonParser,com.fasterxml.jackson.databind.DeserializationContext,java.lang.Object", "<sample:1>", "<null>", "<s:b>"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput092() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.impl.InnerClassProperty", "com.fasterxml.jackson.databind.deser.impl.InnerClassProperty", "getDeclaringClass", new String[]{}, new String[]{}, false, 1, new String[][]{{"com.fasterxml.jackson.databind.deser.impl.InnerClassProperty", "deserializeAndSet", "com.fasterxml.jackson.core.JsonParser,com.fasterxml.jackson.databind.DeserializationContext,java.lang.Object", "<sample:1>", "<null>", "<s:b>"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput093() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.impl.InnerClassProperty", "com.fasterxml.jackson.databind.deser.impl.InnerClassProperty", "getDeclaringClass", new String[]{}, new String[]{}, false, 2, new String[][]{{"com.fasterxml.jackson.databind.deser.impl.InnerClassProperty", "deserializeAndSet", "com.fasterxml.jackson.core.JsonParser,com.fasterxml.jackson.databind.DeserializationContext,java.lang.Object", "<sample:1>", "<null>", "<s:b>"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput094() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.impl.InnerClassProperty", "com.fasterxml.jackson.databind.deser.impl.InnerClassProperty", "getManagedReferenceName", new String[]{}, new String[]{}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.deser.impl.InnerClassProperty", "isVirtual", ""}});
  assertNull(actual);
  assertEquals("receiver state after the call", "[property ''] {getCreatorIndex=7, getManagedReferenceName=null, getName=, getPropertyIndex=-1, hasValueDeserializer=false, hasValueTypeDeserializer=false, hasViews=false, isRequired=false, isVirtual=f...#205#1733294682", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput095() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.impl.InnerClassProperty", "com.fasterxml.jackson.databind.deser.impl.InnerClassProperty", "getManagedReferenceName", new String[]{}, new String[]{}, false, 1, new String[][]{{"com.fasterxml.jackson.databind.deser.impl.InnerClassProperty", "isVirtual", ""}});
  assertNull(actual);
  assertEquals("receiver state after the call", "[property ''] {getCreatorIndex=8, getManagedReferenceName=null, getName=, getPropertyIndex=-1, hasValueDeserializer=false, hasValueTypeDeserializer=false, hasViews=false, isRequired=false, isVirtual=f...#205#1317967865", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput096() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.impl.InnerClassProperty", "com.fasterxml.jackson.databind.deser.impl.InnerClassProperty", "writeReplace", new String[]{}, new String[]{}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.deser.impl.InnerClassProperty", "setObjectIdInfo", "com.fasterxml.jackson.databind.introspect.ObjectIdInfo", "<sample:1>"}});
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.databind.deser.impl.InnerClassProperty", actual.getClass().getName());
  assertEquals("[property ''] {getCreatorIndex=7, getManagedReferenceName=null, getName=, getPropertyIndex=-1, hasValueDeserializer=false, hasValueTypeDeserializer=false, hasViews=false, isRequired=false, isVirtual=f...#205#1733294682", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "[property ''] {getCreatorIndex=7, getManagedReferenceName=null, getName=, getPropertyIndex=-1, hasValueDeserializer=false, hasValueTypeDeserializer=false, hasViews=false, isRequired=false, isVirtual=f...#205#1733294682", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput097() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.impl.InnerClassProperty", "com.fasterxml.jackson.databind.deser.impl.InnerClassProperty", "writeReplace", new String[]{}, new String[]{}, false, 1, new String[][]{{"com.fasterxml.jackson.databind.deser.impl.InnerClassProperty", "setObjectIdInfo", "com.fasterxml.jackson.databind.introspect.ObjectIdInfo", "<sample:1>"}, {"com.fasterxml.jackson.databind.deser.impl.InnerClassProperty", "hasValueDeserializer", ""}});
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.databind.deser.impl.InnerClassProperty", actual.getClass().getName());
  assertEquals("[property ''] {getCreatorIndex=8, getManagedReferenceName=null, getName=, getPropertyIndex=-1, hasValueDeserializer=false, hasValueTypeDeserializer=false, hasViews=false, isRequired=false, isVirtual=f...#205#1317967865", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "[property ''] {getCreatorIndex=8, getManagedReferenceName=null, getName=, getPropertyIndex=-1, hasValueDeserializer=false, hasValueTypeDeserializer=false, hasViews=false, isRequired=false, isVirtual=f...#205#1317967865", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput098() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.impl.InnerClassProperty", "com.fasterxml.jackson.databind.deser.impl.InnerClassProperty", "writeReplace", new String[]{}, new String[]{}, false, 1, new String[][]{{"com.fasterxml.jackson.databind.deser.impl.InnerClassProperty", "setObjectIdInfo", "com.fasterxml.jackson.databind.introspect.ObjectIdInfo", "<sample:1>"}, {"com.fasterxml.jackson.databind.deser.impl.InnerClassProperty", "hasValueDeserializer", ""}}), new String[][]{{"getAnnotation", "java.lang.Class", "6"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "[property ''] {getCreatorIndex=8, getManagedReferenceName=null, getName=, getPropertyIndex=-1, hasValueDeserializer=false, hasValueTypeDeserializer=false, hasViews=false, isRequired=false, isVirtual=f...#205#1317967865", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput099() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.impl.InnerClassProperty", "com.fasterxml.jackson.databind.deser.impl.InnerClassProperty", "depositSchemaProperty", new String[]{"com.fasterxml.jackson.databind.jsonFormatVisitors.JsonObjectFormatVisitor", "com.fasterxml.jackson.databind.SerializerProvider"}, new String[]{"<sample:0>", "<sample:3>"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.deser.impl.InnerClassProperty", "isRequired", ""}});
  assertNull(actual);
  assertEquals("receiver state after the call", "[property ''] {getCreatorIndex=7, getManagedReferenceName=null, getName=, getPropertyIndex=-1, hasValueDeserializer=false, hasValueTypeDeserializer=false, hasViews=false, isRequired=false, isVirtual=f...#205#1733294682", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput100() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.impl.InnerClassProperty", "com.fasterxml.jackson.databind.deser.impl.InnerClassProperty", "writeReplace", new String[]{}, new String[]{}, false, 3, new String[][]{{"com.fasterxml.jackson.databind.deser.impl.InnerClassProperty", "hasValueDeserializer", ""}}), new String[][]{{"getAnnotation", "java.lang.Class", "6"}, {"getValueDeserializer", "", "1"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "[property 'sample'] {getCreatorIndex=9, getManagedReferenceName=null, getName=sample, getPropertyIndex=-1, hasValueDeserializer=false, hasValueTypeDeserializer=false, hasViews=false, isRequired=true, ...#216#758135373", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput101() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.impl.InnerClassProperty", "com.fasterxml.jackson.databind.deser.impl.InnerClassProperty", "writeReplace", new String[]{}, new String[]{}, false, 4, new String[][]{{"com.fasterxml.jackson.databind.deser.impl.InnerClassProperty", "hasValueDeserializer", ""}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput102() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.impl.InnerClassProperty", "com.fasterxml.jackson.databind.deser.impl.InnerClassProperty", "getType", new String[]{}, new String[]{}, false);
  assertNull(actual);
  assertEquals("receiver state after the call", "[property ''] {getCreatorIndex=7, getManagedReferenceName=null, getName=, getPropertyIndex=-1, hasValueDeserializer=false, hasValueTypeDeserializer=false, hasViews=false, isRequired=false, isVirtual=f...#205#1733294682", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput103() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.impl.InnerClassProperty", "com.fasterxml.jackson.databind.deser.impl.InnerClassProperty", "_throwAsIOE", new String[]{"com.fasterxml.jackson.core.JsonParser", "java.lang.Exception", "java.lang.Object"}, new String[]{"<sample:7>", "<sample:1>", "<sample:1>"}, false); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("com.fasterxml.jackson.databind.JsonMappingException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput104() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.impl.InnerClassProperty", "com.fasterxml.jackson.databind.deser.impl.InnerClassProperty", "_throwAsIOE", new String[]{"com.fasterxml.jackson.core.JsonParser", "java.lang.Exception", "java.lang.Object"}, new String[]{"<sample:3>", "<null>", "<sample:1>"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.deser.impl.InnerClassProperty", "deserializeSetAndReturn", "com.fasterxml.jackson.core.JsonParser,com.fasterxml.jackson.databind.DeserializationContext,java.lang.Object", "<sample:6>", "<sample:3>", "<b:true>"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput105() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.impl.InnerClassProperty", "com.fasterxml.jackson.databind.deser.impl.InnerClassProperty", "getObjectIdInfo", new String[]{}, new String[]{}, false);
  assertNull(actual);
  assertEquals("receiver state after the call", "[property ''] {getCreatorIndex=7, getManagedReferenceName=null, getName=, getPropertyIndex=-1, hasValueDeserializer=false, hasValueTypeDeserializer=false, hasViews=false, isRequired=false, isVirtual=f...#205#1733294682", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput106() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.impl.InnerClassProperty", "com.fasterxml.jackson.databind.deser.impl.InnerClassProperty", "getObjectIdInfo", new String[]{}, new String[]{}, false, 1, new String[][]{});
  assertNull(actual);
  assertEquals("receiver state after the call", "[property ''] {getCreatorIndex=8, getManagedReferenceName=null, getName=, getPropertyIndex=-1, hasValueDeserializer=false, hasValueTypeDeserializer=false, hasViews=false, isRequired=false, isVirtual=f...#205#1317967865", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput107() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.impl.InnerClassProperty", "com.fasterxml.jackson.databind.deser.impl.InnerClassProperty", "getObjectIdInfo", new String[]{}, new String[]{}, false, 2, new String[][]{{"com.fasterxml.jackson.databind.deser.impl.InnerClassProperty", "getInjectableValueId", ""}, {"com.fasterxml.jackson.databind.deser.impl.InnerClassProperty", "getName", ""}});
  assertNull(actual);
  assertEquals("receiver state after the call", "[property 'sample'] {getCreatorIndex=9, getManagedReferenceName=null, getName=sample, getPropertyIndex=-1, hasValueDeserializer=false, hasValueTypeDeserializer=false, hasViews=false, isRequired=false,...#217#-1576293160", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput108() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.impl.InnerClassProperty", "com.fasterxml.jackson.databind.deser.impl.InnerClassProperty", "getObjectIdInfo", new String[]{}, new String[]{}, false, 3, new String[][]{{"com.fasterxml.jackson.databind.deser.impl.InnerClassProperty", "getInjectableValueId", ""}, {"com.fasterxml.jackson.databind.deser.impl.InnerClassProperty", "getName", ""}});
  assertNull(actual);
  assertEquals("receiver state after the call", "[property 'sample'] {getCreatorIndex=9, getManagedReferenceName=null, getName=sample, getPropertyIndex=-1, hasValueDeserializer=false, hasValueTypeDeserializer=false, hasViews=false, isRequired=true, ...#216#758135373", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput109() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.impl.InnerClassProperty", "com.fasterxml.jackson.databind.deser.impl.InnerClassProperty", "getObjectIdInfo", new String[]{}, new String[]{}, false, 5, new String[][]{{"com.fasterxml.jackson.databind.deser.impl.InnerClassProperty", "getInjectableValueId", ""}, {"com.fasterxml.jackson.databind.deser.impl.InnerClassProperty", "getName", ""}});
  assertNull(actual);
  assertEquals("receiver state after the call", "[property ''] {getCreatorIndex=12, getManagedReferenceName=null, getName=, getPropertyIndex=-1, hasValueDeserializer=false, hasValueTypeDeserializer=false, hasViews=false, isRequired=false, isVirtual=...#206#-957648002", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput110() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.impl.InnerClassProperty", "com.fasterxml.jackson.databind.deser.impl.InnerClassProperty", "setViews", new String[]{"java.lang.Class[]"}, new String[]{"<null>"}, false);
  assertNull(actual);
  assertEquals("receiver state after the call", "[property ''] {getCreatorIndex=7, getManagedReferenceName=null, getName=, getPropertyIndex=-1, hasValueDeserializer=false, hasValueTypeDeserializer=false, hasViews=false, isRequired=false, isVirtual=f...#205#1733294682", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput111() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.impl.InnerClassProperty", "com.fasterxml.jackson.databind.deser.impl.InnerClassProperty", "setViews", new String[]{"java.lang.Class[]"}, new String[]{"<sample:2>"}, false);
  assertNull(actual);
  assertEquals("receiver state after the call", "[property ''] {getCreatorIndex=7, getManagedReferenceName=null, getName=, getPropertyIndex=-1, hasValueDeserializer=false, hasValueTypeDeserializer=false, hasViews=true, isRequired=false, isVirtual=fa...#204#1981869681", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput112() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.impl.InnerClassProperty", "com.fasterxml.jackson.databind.deser.impl.InnerClassProperty", "setViews", new String[]{"java.lang.Class[]"}, new String[]{"<sample:2>"}, false, 1, new String[][]{});
  assertNull(actual);
  assertEquals("receiver state after the call", "[property ''] {getCreatorIndex=8, getManagedReferenceName=null, getName=, getPropertyIndex=-1, hasValueDeserializer=false, hasValueTypeDeserializer=false, hasViews=true, isRequired=false, isVirtual=fa...#204#-2049400590", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput113() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.impl.InnerClassProperty", "com.fasterxml.jackson.databind.deser.impl.InnerClassProperty", "withValueDeserializer", new String[]{"com.fasterxml.jackson.databind.JsonDeserializer"}, new String[]{"<sample:6>"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.deser.impl.InnerClassProperty", "getWrapperName", ""}, {"com.fasterxml.jackson.databind.deser.impl.InnerClassProperty", "setObjectIdInfo", "com.fasterxml.jackson.databind.introspect.ObjectIdInfo", "<sample:3>"}});
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.databind.deser.impl.InnerClassProperty", actual.getClass().getName());
  assertEquals("[property ''] {getCreatorIndex=7, getManagedReferenceName=null, getName=, getPropertyIndex=-1, hasValueDeserializer=false, hasValueTypeDeserializer=false, hasViews=false, isRequired=false, isVirtual=f...#205#1733294682", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "[property ''] {getCreatorIndex=7, getManagedReferenceName=null, getName=, getPropertyIndex=-1, hasValueDeserializer=false, hasValueTypeDeserializer=false, hasViews=false, isRequired=false, isVirtual=f...#205#1733294682", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput114() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.impl.InnerClassProperty", "com.fasterxml.jackson.databind.deser.impl.InnerClassProperty", "getWrapperName", new String[]{}, new String[]{}, false);
  assertNull(actual);
  assertEquals("receiver state after the call", "[property ''] {getCreatorIndex=7, getManagedReferenceName=null, getName=, getPropertyIndex=-1, hasValueDeserializer=false, hasValueTypeDeserializer=false, hasViews=false, isRequired=false, isVirtual=f...#205#1733294682", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput115() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.impl.InnerClassProperty", "com.fasterxml.jackson.databind.deser.impl.InnerClassProperty", "getWrapperName", new String[]{}, new String[]{}, false, 1, new String[][]{});
  assertNull(actual);
  assertEquals("receiver state after the call", "[property ''] {getCreatorIndex=8, getManagedReferenceName=null, getName=, getPropertyIndex=-1, hasValueDeserializer=false, hasValueTypeDeserializer=false, hasViews=false, isRequired=false, isVirtual=f...#205#1317967865", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput116() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.impl.InnerClassProperty", "com.fasterxml.jackson.databind.deser.impl.InnerClassProperty", "getWrapperName", new String[]{}, new String[]{}, false, 2, new String[][]{});
  assertNull(actual);
  assertEquals("receiver state after the call", "[property 'sample'] {getCreatorIndex=9, getManagedReferenceName=null, getName=sample, getPropertyIndex=-1, hasValueDeserializer=false, hasValueTypeDeserializer=false, hasViews=false, isRequired=false,...#217#-1576293160", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput117() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.impl.InnerClassProperty", "com.fasterxml.jackson.databind.deser.impl.InnerClassProperty", "getWrapperName", new String[]{}, new String[]{}, false, 3, new String[][]{});
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.databind.PropertyName", actual.getClass().getName());
  assertEquals("a {getNamespace=null, getSimpleName=a, hasNamespace=false, hasSimpleName=true, isEmpty=false}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "[property 'sample'] {getCreatorIndex=9, getManagedReferenceName=null, getName=sample, getPropertyIndex=-1, hasValueDeserializer=false, hasValueTypeDeserializer=false, hasViews=false, isRequired=true, ...#216#758135373", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput118() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.impl.InnerClassProperty", "com.fasterxml.jackson.databind.deser.impl.InnerClassProperty", "getWrapperName", new String[]{}, new String[]{}, false, 11, new String[][]{});
  assertNull(actual);
  assertEquals("receiver state after the call", "[property '<a><b>t</b></a>'] {getCreatorIndex=4, getManagedReferenceName=null, getName=<a><b>t</b></a>, getPropertyIndex=-1, hasValueDeserializer=false, hasValueTypeDeserializer=false, hasViews=false,...#235#1709416239", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput119() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.impl.InnerClassProperty", "com.fasterxml.jackson.databind.deser.impl.InnerClassProperty", "getMetadata", new String[]{}, new String[]{}, false);
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.databind.PropertyMetadata", actual.getClass().getName());
  assertEquals("{getDefaultValue=null, getDescription=null, getIndex=null, getRequired=null, hasDefaultValue=false, hasDefuaultValue=false, hasIndex=false, isRequired=false}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "[property ''] {getCreatorIndex=7, getManagedReferenceName=null, getName=, getPropertyIndex=-1, hasValueDeserializer=false, hasValueTypeDeserializer=false, hasViews=false, isRequired=false, isVirtual=f...#205#1733294682", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput120() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.impl.InnerClassProperty", "com.fasterxml.jackson.databind.deser.impl.InnerClassProperty", "getMetadata", new String[]{}, new String[]{}, false, 1, new String[][]{});
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.databind.PropertyMetadata", actual.getClass().getName());
  assertEquals("{getDefaultValue=null, getDescription=null, getIndex=null, getRequired=null, hasDefaultValue=false, hasDefuaultValue=false, hasIndex=false, isRequired=false}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "[property ''] {getCreatorIndex=8, getManagedReferenceName=null, getName=, getPropertyIndex=-1, hasValueDeserializer=false, hasValueTypeDeserializer=false, hasViews=false, isRequired=false, isVirtual=f...#205#1317967865", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput121() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.impl.InnerClassProperty", "com.fasterxml.jackson.databind.deser.impl.InnerClassProperty", "getMetadata", new String[]{}, new String[]{}, false, 2, new String[][]{});
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.databind.PropertyMetadata", actual.getClass().getName());
  assertEquals("{getDefaultValue=null, getDescription=null, getIndex=null, getRequired=null, hasDefaultValue=false, hasDefuaultValue=false, hasIndex=false, isRequired=false}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "[property 'sample'] {getCreatorIndex=9, getManagedReferenceName=null, getName=sample, getPropertyIndex=-1, hasValueDeserializer=false, hasValueTypeDeserializer=false, hasViews=false, isRequired=false,...#217#-1576293160", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput122() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.impl.InnerClassProperty", "com.fasterxml.jackson.databind.deser.impl.InnerClassProperty", "getMetadata", new String[]{}, new String[]{}, false, 3, new String[][]{});
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.databind.PropertyMetadata", actual.getClass().getName());
  assertEquals("{getDefaultValue=null, getDescription=, getIndex=null, getRequired=true, hasDefaultValue=false, hasDefuaultValue=false, hasIndex=false, isRequired=true}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "[property 'sample'] {getCreatorIndex=9, getManagedReferenceName=null, getName=sample, getPropertyIndex=-1, hasValueDeserializer=false, hasValueTypeDeserializer=false, hasViews=false, isRequired=true, ...#216#758135373", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput123() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.impl.InnerClassProperty", "com.fasterxml.jackson.databind.deser.impl.InnerClassProperty", "getMetadata", new String[]{}, new String[]{}, false, 4, new String[][]{});
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput124() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.impl.InnerClassProperty", "com.fasterxml.jackson.databind.deser.impl.InnerClassProperty", "_throwAsIOE", new String[]{"java.lang.Exception"}, new String[]{"<sample:3>"}, false); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("com.fasterxml.jackson.databind.JsonMappingException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput125() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.impl.InnerClassProperty", "com.fasterxml.jackson.databind.deser.impl.InnerClassProperty", "getName", new String[]{}, new String[]{}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.deser.impl.InnerClassProperty", "getName", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("", String.valueOf(actual));
  assertEquals("receiver state after the call", "[property ''] {getCreatorIndex=7, getManagedReferenceName=null, getName=, getPropertyIndex=-1, hasValueDeserializer=false, hasValueTypeDeserializer=false, hasViews=false, isRequired=false, isVirtual=f...#205#1733294682", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput126() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.impl.InnerClassProperty", "com.fasterxml.jackson.databind.deser.impl.InnerClassProperty", "getName", new String[]{}, new String[]{}, false, 1, new String[][]{{"com.fasterxml.jackson.databind.deser.impl.InnerClassProperty", "getName", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("", String.valueOf(actual));
  assertEquals("receiver state after the call", "[property ''] {getCreatorIndex=8, getManagedReferenceName=null, getName=, getPropertyIndex=-1, hasValueDeserializer=false, hasValueTypeDeserializer=false, hasViews=false, isRequired=false, isVirtual=f...#205#1317967865", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput127() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.impl.InnerClassProperty", "com.fasterxml.jackson.databind.deser.impl.InnerClassProperty", "withName", new String[]{"java.lang.String"}, new String[]{"abc"}, false);
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.databind.deser.impl.InnerClassProperty", actual.getClass().getName());
  assertEquals("[property 'abc'] {getCreatorIndex=7, getManagedReferenceName=null, getName=abc, getPropertyIndex=-1, hasValueDeserializer=false, hasValueTypeDeserializer=false, hasViews=false, isRequired=false, isVir...#211#1705867286", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "[property ''] {getCreatorIndex=7, getManagedReferenceName=null, getName=, getPropertyIndex=-1, hasValueDeserializer=false, hasValueTypeDeserializer=false, hasViews=false, isRequired=false, isVirtual=f...#205#1733294682", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput128() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.impl.InnerClassProperty", "com.fasterxml.jackson.databind.deser.impl.InnerClassProperty", "setAndReturn", new String[]{"java.lang.Object", "java.lang.Object"}, new String[]{"<i:2>", "<s:key>"}, false); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalStateException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput129() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.impl.InnerClassProperty", "com.fasterxml.jackson.databind.deser.impl.InnerClassProperty", "deserializeAndSet", new String[]{"com.fasterxml.jackson.core.JsonParser", "com.fasterxml.jackson.databind.DeserializationContext", "java.lang.Object"}, new String[]{"<sample:5>", "<null>", "<s:key>"}, false); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput130() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.impl.InnerClassProperty", "com.fasterxml.jackson.databind.deser.impl.InnerClassProperty", "findPropertyInclusion", new String[]{"com.fasterxml.jackson.databind.cfg.MapperConfig", "java.lang.Class"}, new String[]{"<sample:0>", "<sample:3>"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.deser.impl.InnerClassProperty", "set", "java.lang.Object,java.lang.Object", "<null>", "<s:>"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput131() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.impl.InnerClassProperty", "com.fasterxml.jackson.databind.deser.impl.InnerClassProperty", "deserializeAndSet", new String[]{"com.fasterxml.jackson.core.JsonParser", "com.fasterxml.jackson.databind.DeserializationContext", "java.lang.Object"}, new String[]{"<sample:6>", "<sample:4>", "<s:kk>"}, false, 13, new String[][]{{"com.fasterxml.jackson.databind.deser.impl.InnerClassProperty", "withValueDeserializer", "com.fasterxml.jackson.databind.JsonDeserializer", "<sample:7>"}, {"com.fasterxml.jackson.databind.deser.impl.InnerClassProperty", "readResolve", ""}, {"com.fasterxml.jackson.databind.deser.impl.InnerClassProperty", "findPropertyInclusion", "com.fasterxml.jackson.databind.cfg.MapperConfig,java.lang.Class", "<sample:6>", "<null>"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.InternalError", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput132() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.impl.InnerClassProperty", "com.fasterxml.jackson.databind.deser.impl.InnerClassProperty", "deserializeAndSet", new String[]{"com.fasterxml.jackson.core.JsonParser", "com.fasterxml.jackson.databind.DeserializationContext", "java.lang.Object"}, new String[]{"<sample:9>", "<sample:5>", "<s:kk>"}, false, 13, new String[][]{{"com.fasterxml.jackson.databind.deser.impl.InnerClassProperty", "withValueDeserializer", "com.fasterxml.jackson.databind.JsonDeserializer", "<sample:7>"}, {"com.fasterxml.jackson.databind.deser.impl.InnerClassProperty", "findPropertyInclusion", "com.fasterxml.jackson.databind.cfg.MapperConfig,java.lang.Class", "<sample:5>", "<null>"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput133() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.impl.InnerClassProperty", "com.fasterxml.jackson.databind.deser.impl.InnerClassProperty", "setAndReturn", new String[]{"java.lang.Object", "java.lang.Object"}, new String[]{"<s:lexp>", "<i:-2147483648>"}, false, 10, new String[][]{}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput134() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.impl.InnerClassProperty", "com.fasterxml.jackson.databind.deser.impl.InnerClassProperty", "getAnnotation", new String[]{"java.lang.Class"}, new String[]{"<sample:3>"}, false);
  assertNull(actual);
  assertEquals("receiver state after the call", "[property ''] {getCreatorIndex=7, getManagedReferenceName=null, getName=, getPropertyIndex=-1, hasValueDeserializer=false, hasValueTypeDeserializer=false, hasViews=false, isRequired=false, isVirtual=f...#205#1733294682", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput135() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.impl.InnerClassProperty", "com.fasterxml.jackson.databind.deser.impl.InnerClassProperty", "isRequired", new String[]{}, new String[]{}, false);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "[property ''] {getCreatorIndex=7, getManagedReferenceName=null, getName=, getPropertyIndex=-1, hasValueDeserializer=false, hasValueTypeDeserializer=false, hasViews=false, isRequired=false, isVirtual=f...#205#1733294682", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput136() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.impl.InnerClassProperty", "com.fasterxml.jackson.databind.deser.impl.InnerClassProperty", "isRequired", new String[]{}, new String[]{}, false, 1, new String[][]{});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "[property ''] {getCreatorIndex=8, getManagedReferenceName=null, getName=, getPropertyIndex=-1, hasValueDeserializer=false, hasValueTypeDeserializer=false, hasViews=false, isRequired=false, isVirtual=f...#205#1317967865", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput137() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.impl.InnerClassProperty", "com.fasterxml.jackson.databind.deser.impl.InnerClassProperty", "isRequired", new String[]{}, new String[]{}, false, 2, new String[][]{});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "[property 'sample'] {getCreatorIndex=9, getManagedReferenceName=null, getName=sample, getPropertyIndex=-1, hasValueDeserializer=false, hasValueTypeDeserializer=false, hasViews=false, isRequired=false,...#217#-1576293160", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput138() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.impl.InnerClassProperty", "com.fasterxml.jackson.databind.deser.impl.InnerClassProperty", "isRequired", new String[]{}, new String[]{}, false, 3, new String[][]{});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
  assertEquals("receiver state after the call", "[property 'sample'] {getCreatorIndex=9, getManagedReferenceName=null, getName=sample, getPropertyIndex=-1, hasValueDeserializer=false, hasValueTypeDeserializer=false, hasViews=false, isRequired=true, ...#216#758135373", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput139() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.impl.InnerClassProperty", "com.fasterxml.jackson.databind.deser.impl.InnerClassProperty", "isRequired", new String[]{}, new String[]{}, false, 4, new String[][]{}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput140() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.impl.InnerClassProperty", "com.fasterxml.jackson.databind.deser.impl.InnerClassProperty", "isRequired", new String[]{}, new String[]{}, false, 5, new String[][]{});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "[property ''] {getCreatorIndex=12, getManagedReferenceName=null, getName=, getPropertyIndex=-1, hasValueDeserializer=false, hasValueTypeDeserializer=false, hasViews=false, isRequired=false, isVirtual=...#206#-957648002", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput141() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.impl.InnerClassProperty", "com.fasterxml.jackson.databind.deser.impl.InnerClassProperty", "isRequired", new String[]{}, new String[]{}, false, 7, new String[][]{});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "[property '<a><b>t</b></a>'] {getCreatorIndex=4, getManagedReferenceName=null, getName=<a><b>t</b></a>, getPropertyIndex=-1, hasValueDeserializer=false, hasValueTypeDeserializer=false, hasViews=false,...#235#1709416239", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput142() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.impl.InnerClassProperty", "com.fasterxml.jackson.databind.deser.impl.InnerClassProperty", "withValueDeserializer", new String[]{"com.fasterxml.jackson.databind.JsonDeserializer"}, new String[]{"<sample:7>"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.deser.impl.InnerClassProperty", "readResolve", ""}, {"com.fasterxml.jackson.databind.deser.impl.InnerClassProperty", "setViews", "java.lang.Class[]", "<sample:0>"}});
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.databind.deser.impl.InnerClassProperty", actual.getClass().getName());
  assertEquals("[property ''] {getCreatorIndex=7, getManagedReferenceName=null, getName=, getPropertyIndex=-1, hasValueDeserializer=true, hasValueTypeDeserializer=false, hasViews=true, isRequired=false, isVirtual=fal...#203#1965110946", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "[property ''] {getCreatorIndex=7, getManagedReferenceName=null, getName=, getPropertyIndex=-1, hasValueDeserializer=false, hasValueTypeDeserializer=false, hasViews=true, isRequired=false, isVirtual=fa...#204#1981869681", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput143() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.impl.InnerClassProperty", "com.fasterxml.jackson.databind.deser.impl.InnerClassProperty", "withValueDeserializer", new String[]{"com.fasterxml.jackson.databind.JsonDeserializer"}, new String[]{"<sample:7>"}, false, 6, new String[][]{{"com.fasterxml.jackson.databind.deser.impl.InnerClassProperty", "readResolve", ""}, {"com.fasterxml.jackson.databind.deser.impl.InnerClassProperty", "setViews", "java.lang.Class[]", "<sample:0>"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput144() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.impl.InnerClassProperty", "com.fasterxml.jackson.databind.deser.impl.InnerClassProperty", "withValueDeserializer", new String[]{"com.fasterxml.jackson.databind.JsonDeserializer"}, new String[]{"<sample:1>"}, false, 7, new String[][]{{"com.fasterxml.jackson.databind.deser.impl.InnerClassProperty", "getName", ""}, {"com.fasterxml.jackson.databind.deser.impl.InnerClassProperty", "readResolve", ""}, {"com.fasterxml.jackson.databind.deser.impl.InnerClassProperty", "depositSchemaProperty", "com.fasterxml.jackson.databind.jsonFormatVisitors.JsonObjectFormatVisitor,com.fasterxml.jackson.databind.SerializerProvider", "<sample:5>", "<sample:3>"}}), new String[][]{{"getValueDeserializer", "", "0"}, {"deserializeAndSet", "com.fasterxml.jackson.core.JsonParser,com.fasterxml.jackson.databind.DeserializationContext,java.lang.Object", "6"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput145() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.impl.InnerClassProperty", "com.fasterxml.jackson.databind.deser.impl.InnerClassProperty", "depositSchemaProperty", new String[]{"com.fasterxml.jackson.databind.jsonFormatVisitors.JsonObjectFormatVisitor", "com.fasterxml.jackson.databind.SerializerProvider"}, new String[]{"<sample:0>", "<sample:5>"}, false, 15, new String[][]{});
  assertNull(actual);
  assertEquals("receiver state after the call", "[property '<a><b>t</b></a>'] {getCreatorIndex=4, getManagedReferenceName=null, getName=<a><b>t</b></a>, getPropertyIndex=-1, hasValueDeserializer=false, hasValueTypeDeserializer=false, hasViews=false,...#235#1709416239", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput146() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.impl.InnerClassProperty", "com.fasterxml.jackson.databind.deser.impl.InnerClassProperty", "_throwAsIOE", new String[]{"com.fasterxml.jackson.core.JsonParser", "java.lang.Exception"}, new String[]{"<sample:7>", "<sample:2>"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.deser.impl.InnerClassProperty", "hasViews", ""}, {"com.fasterxml.jackson.databind.deser.impl.InnerClassProperty", "setViews", "java.lang.Class[]", "<empty>"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("com.fasterxml.jackson.databind.JsonMappingException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput147() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.impl.InnerClassProperty", "com.fasterxml.jackson.databind.deser.impl.InnerClassProperty", "getAnnotation", new String[]{"java.lang.Class"}, new String[]{"<sample:2>"}, false, 9, new String[][]{});
  assertNull(actual);
  assertEquals("receiver state after the call", "[property ''] {getCreatorIndex=64, getManagedReferenceName=null, getName=, getPropertyIndex=-1, hasValueDeserializer=false, hasValueTypeDeserializer=false, hasViews=false, isRequired=true, isVirtual=f...#205#1999798276", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput148() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.impl.InnerClassProperty", "com.fasterxml.jackson.databind.deser.impl.InnerClassProperty", "visibleInView", new String[]{"java.lang.Class"}, new String[]{"<sample:2>"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.deser.impl.InnerClassProperty", "hasValueTypeDeserializer", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
  assertEquals("receiver state after the call", "[property ''] {getCreatorIndex=7, getManagedReferenceName=null, getName=, getPropertyIndex=-1, hasValueDeserializer=false, hasValueTypeDeserializer=false, hasViews=false, isRequired=false, isVirtual=f...#205#1733294682", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput149() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.impl.InnerClassProperty", "com.fasterxml.jackson.databind.deser.impl.InnerClassProperty", "visibleInView", new String[]{"java.lang.Class"}, new String[]{"<sample:2>"}, false, 2, new String[][]{{"com.fasterxml.jackson.databind.deser.impl.InnerClassProperty", "hasValueTypeDeserializer", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
  assertEquals("receiver state after the call", "[property 'sample'] {getCreatorIndex=9, getManagedReferenceName=null, getName=sample, getPropertyIndex=-1, hasValueDeserializer=false, hasValueTypeDeserializer=false, hasViews=false, isRequired=false,...#217#-1576293160", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput150() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.impl.InnerClassProperty", "com.fasterxml.jackson.databind.deser.impl.InnerClassProperty", "writeReplace", new String[]{}, new String[]{}, false), new String[][]{{"withSimpleName", "java.lang.String", "6"}});
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.databind.deser.impl.InnerClassProperty", actual.getClass().getName());
  assertEquals("[property '0'] {getCreatorIndex=7, getManagedReferenceName=null, getName=0, getPropertyIndex=-1, hasValueDeserializer=false, hasValueTypeDeserializer=false, hasViews=false, isRequired=false, isVirtual...#207#-1343485574", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "[property ''] {getCreatorIndex=7, getManagedReferenceName=null, getName=, getPropertyIndex=-1, hasValueDeserializer=false, hasValueTypeDeserializer=false, hasViews=false, isRequired=false, isVirtual=f...#205#1733294682", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput151() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.impl.InnerClassProperty", "com.fasterxml.jackson.databind.deser.impl.InnerClassProperty", "writeReplace", new String[]{}, new String[]{}, false, 11, new String[][]{{"com.fasterxml.jackson.databind.deser.impl.InnerClassProperty", "getManagedReferenceName", ""}}), new String[][]{{"deserialize", "com.fasterxml.jackson.core.JsonParser,com.fasterxml.jackson.databind.DeserializationContext", "2"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("com.fasterxml.jackson.databind.JsonMappingException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput152() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.impl.InnerClassProperty", "com.fasterxml.jackson.databind.deser.impl.InnerClassProperty", "findPropertyFormat", new String[]{"com.fasterxml.jackson.databind.cfg.MapperConfig", "java.lang.Class"}, new String[]{"<sample:5>", "<sample:3>"}, false);
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.annotation.JsonFormat$Value", actual.getClass().getName());
  assertEquals("[pattern=,shape=ANY,locale=null,timezone=null] {getPattern=, getShape=ANY, hasLocale=false, hasPattern=false, hasShape=false, hasTimeZone=false}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "[property ''] {getCreatorIndex=7, getManagedReferenceName=null, getName=, getPropertyIndex=-1, hasValueDeserializer=false, hasValueTypeDeserializer=false, hasViews=false, isRequired=false, isVirtual=f...#205#1733294682", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput153() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.impl.InnerClassProperty", "com.fasterxml.jackson.databind.deser.impl.InnerClassProperty", "setObjectIdInfo", new String[]{"com.fasterxml.jackson.databind.introspect.ObjectIdInfo"}, new String[]{"<sample:6>"}, false);
  assertNull(actual);
  assertEquals("receiver state after the call", "[property ''] {getCreatorIndex=7, getManagedReferenceName=null, getName=, getPropertyIndex=-1, hasValueDeserializer=false, hasValueTypeDeserializer=false, hasViews=false, isRequired=false, isVirtual=f...#205#1733294682", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput154() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.impl.InnerClassProperty", "com.fasterxml.jackson.databind.deser.impl.InnerClassProperty", "getCreatorIndex", new String[]{}, new String[]{}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.deser.impl.InnerClassProperty", "hasValueTypeDeserializer", ""}, {"com.fasterxml.jackson.databind.deser.impl.InnerClassProperty", "isRequired", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("7", String.valueOf(actual));
  assertEquals("receiver state after the call", "[property ''] {getCreatorIndex=7, getManagedReferenceName=null, getName=, getPropertyIndex=-1, hasValueDeserializer=false, hasValueTypeDeserializer=false, hasViews=false, isRequired=false, isVirtual=f...#205#1733294682", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput155() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.impl.InnerClassProperty", "com.fasterxml.jackson.databind.deser.impl.InnerClassProperty", "getCreatorIndex", new String[]{}, new String[]{}, false, 1, new String[][]{{"com.fasterxml.jackson.databind.deser.impl.InnerClassProperty", "hasValueTypeDeserializer", ""}, {"com.fasterxml.jackson.databind.deser.impl.InnerClassProperty", "isRequired", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("8", String.valueOf(actual));
  assertEquals("receiver state after the call", "[property ''] {getCreatorIndex=8, getManagedReferenceName=null, getName=, getPropertyIndex=-1, hasValueDeserializer=false, hasValueTypeDeserializer=false, hasViews=false, isRequired=false, isVirtual=f...#205#1317967865", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput156() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.impl.InnerClassProperty", "com.fasterxml.jackson.databind.deser.impl.InnerClassProperty", "getCreatorIndex", new String[]{}, new String[]{}, false, 2, new String[][]{{"com.fasterxml.jackson.databind.deser.impl.InnerClassProperty", "hasValueTypeDeserializer", ""}, {"com.fasterxml.jackson.databind.deser.impl.InnerClassProperty", "isRequired", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("9", String.valueOf(actual));
  assertEquals("receiver state after the call", "[property 'sample'] {getCreatorIndex=9, getManagedReferenceName=null, getName=sample, getPropertyIndex=-1, hasValueDeserializer=false, hasValueTypeDeserializer=false, hasViews=false, isRequired=false,...#217#-1576293160", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput157() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.impl.InnerClassProperty", "com.fasterxml.jackson.databind.deser.impl.InnerClassProperty", "getCreatorIndex", new String[]{}, new String[]{}, false, 3, new String[][]{{"com.fasterxml.jackson.databind.deser.impl.InnerClassProperty", "hasValueTypeDeserializer", ""}, {"com.fasterxml.jackson.databind.deser.impl.InnerClassProperty", "isRequired", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("9", String.valueOf(actual));
  assertEquals("receiver state after the call", "[property 'sample'] {getCreatorIndex=9, getManagedReferenceName=null, getName=sample, getPropertyIndex=-1, hasValueDeserializer=false, hasValueTypeDeserializer=false, hasViews=false, isRequired=true, ...#216#758135373", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput158() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.impl.InnerClassProperty", "com.fasterxml.jackson.databind.deser.impl.InnerClassProperty", "getCreatorIndex", new String[]{}, new String[]{}, false, 4, new String[][]{{"com.fasterxml.jackson.databind.deser.impl.InnerClassProperty", "hasValueTypeDeserializer", ""}, {"com.fasterxml.jackson.databind.deser.impl.InnerClassProperty", "isRequired", ""}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput159() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.impl.InnerClassProperty", "com.fasterxml.jackson.databind.deser.impl.InnerClassProperty", "getCreatorIndex", new String[]{}, new String[]{}, false, 5, new String[][]{{"com.fasterxml.jackson.databind.deser.impl.InnerClassProperty", "hasValueTypeDeserializer", ""}, {"com.fasterxml.jackson.databind.deser.impl.InnerClassProperty", "isRequired", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("12", String.valueOf(actual));
  assertEquals("receiver state after the call", "[property ''] {getCreatorIndex=12, getManagedReferenceName=null, getName=, getPropertyIndex=-1, hasValueDeserializer=false, hasValueTypeDeserializer=false, hasViews=false, isRequired=false, isVirtual=...#206#-957648002", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput160() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.impl.InnerClassProperty", "com.fasterxml.jackson.databind.deser.impl.InnerClassProperty", "hasValueDeserializer", new String[]{}, new String[]{}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.deser.impl.InnerClassProperty", "getPropertyIndex", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "[property ''] {getCreatorIndex=7, getManagedReferenceName=null, getName=, getPropertyIndex=-1, hasValueDeserializer=false, hasValueTypeDeserializer=false, hasViews=false, isRequired=false, isVirtual=f...#205#1733294682", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput161() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.impl.InnerClassProperty", "com.fasterxml.jackson.databind.deser.impl.InnerClassProperty", "writeReplace", new String[]{}, new String[]{}, false), new String[][]{{"isVirtual", "", "7"}, {"hasValueTypeDeserializer", "", "2"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "[property ''] {getCreatorIndex=7, getManagedReferenceName=null, getName=, getPropertyIndex=-1, hasValueDeserializer=false, hasValueTypeDeserializer=false, hasViews=false, isRequired=false, isVirtual=f...#205#1733294682", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput162() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.impl.InnerClassProperty", "com.fasterxml.jackson.databind.deser.impl.InnerClassProperty", "getType", new String[]{}, new String[]{}, false, 1, new String[][]{{"com.fasterxml.jackson.databind.deser.impl.InnerClassProperty", "withSimpleName", "java.lang.String", "{\"a\":1}"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "[property ''] {getCreatorIndex=8, getManagedReferenceName=null, getName=, getPropertyIndex=-1, hasValueDeserializer=false, hasValueTypeDeserializer=false, hasViews=false, isRequired=false, isVirtual=f...#205#1317967865", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput163() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.impl.InnerClassProperty", "com.fasterxml.jackson.databind.deser.impl.InnerClassProperty", "getType", new String[]{}, new String[]{}, false, 2, new String[][]{{"com.fasterxml.jackson.databind.deser.impl.InnerClassProperty", "withSimpleName", "java.lang.String", "{\"a\":1}"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "[property 'sample'] {getCreatorIndex=9, getManagedReferenceName=null, getName=sample, getPropertyIndex=-1, hasValueDeserializer=false, hasValueTypeDeserializer=false, hasViews=false, isRequired=false,...#217#-1576293160", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput164() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.impl.InnerClassProperty", "com.fasterxml.jackson.databind.deser.impl.InnerClassProperty", "getType", new String[]{}, new String[]{}, false, 3, new String[][]{{"com.fasterxml.jackson.databind.deser.impl.InnerClassProperty", "getValueTypeDeserializer", ""}});
  assertNull(actual);
  assertEquals("receiver state after the call", "[property 'sample'] {getCreatorIndex=9, getManagedReferenceName=null, getName=sample, getPropertyIndex=-1, hasValueDeserializer=false, hasValueTypeDeserializer=false, hasViews=false, isRequired=true, ...#216#758135373", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput165() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.impl.InnerClassProperty", "com.fasterxml.jackson.databind.deser.impl.InnerClassProperty", "getInjectableValueId", new String[]{}, new String[]{}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.deser.impl.InnerClassProperty", "getValueDeserializer", ""}});
  assertNull(actual);
  assertEquals("receiver state after the call", "[property ''] {getCreatorIndex=7, getManagedReferenceName=null, getName=, getPropertyIndex=-1, hasValueDeserializer=false, hasValueTypeDeserializer=false, hasViews=false, isRequired=false, isVirtual=f...#205#1733294682", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput166() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.impl.InnerClassProperty", "com.fasterxml.jackson.databind.deser.impl.InnerClassProperty", "getInjectableValueId", new String[]{}, new String[]{}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.deser.impl.InnerClassProperty", "getValueDeserializer", ""}, {"com.fasterxml.jackson.databind.deser.impl.InnerClassProperty", "setViews", "java.lang.Class[]", "<sample:2>"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "[property ''] {getCreatorIndex=7, getManagedReferenceName=null, getName=, getPropertyIndex=-1, hasValueDeserializer=false, hasValueTypeDeserializer=false, hasViews=true, isRequired=false, isVirtual=fa...#204#1981869681", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput167() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.impl.InnerClassProperty", "com.fasterxml.jackson.databind.deser.impl.InnerClassProperty", "getInjectableValueId", new String[]{}, new String[]{}, false, 1, new String[][]{{"com.fasterxml.jackson.databind.deser.impl.InnerClassProperty", "getValueDeserializer", ""}});
  assertNull(actual);
  assertEquals("receiver state after the call", "[property ''] {getCreatorIndex=8, getManagedReferenceName=null, getName=, getPropertyIndex=-1, hasValueDeserializer=false, hasValueTypeDeserializer=false, hasViews=false, isRequired=false, isVirtual=f...#205#1317967865", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput168() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.impl.InnerClassProperty", "com.fasterxml.jackson.databind.deser.impl.InnerClassProperty", "getInjectableValueId", new String[]{}, new String[]{}, false, 2, new String[][]{{"com.fasterxml.jackson.databind.deser.impl.InnerClassProperty", "getValueDeserializer", ""}});
  assertNull(actual);
  assertEquals("receiver state after the call", "[property 'sample'] {getCreatorIndex=9, getManagedReferenceName=null, getName=sample, getPropertyIndex=-1, hasValueDeserializer=false, hasValueTypeDeserializer=false, hasViews=false, isRequired=false,...#217#-1576293160", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput169() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.impl.InnerClassProperty", "com.fasterxml.jackson.databind.deser.impl.InnerClassProperty", "getInjectableValueId", new String[]{}, new String[]{}, false, 3, new String[][]{{"com.fasterxml.jackson.databind.deser.impl.InnerClassProperty", "getValueDeserializer", ""}});
  assertNull(actual);
  assertEquals("receiver state after the call", "[property 'sample'] {getCreatorIndex=9, getManagedReferenceName=null, getName=sample, getPropertyIndex=-1, hasValueDeserializer=false, hasValueTypeDeserializer=false, hasViews=false, isRequired=true, ...#216#758135373", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput170() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.impl.InnerClassProperty", "com.fasterxml.jackson.databind.deser.impl.InnerClassProperty", "_throwAsIOE", new String[]{"java.lang.Exception", "java.lang.Object"}, new String[]{"<null>", "<sample:0>"}, false); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput171() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.impl.InnerClassProperty", "com.fasterxml.jackson.databind.deser.impl.InnerClassProperty", "getFullName", new String[]{}, new String[]{}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.deser.impl.InnerClassProperty", "withName", "com.fasterxml.jackson.databind.PropertyName", "<sample:0>"}});
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.databind.PropertyName", actual.getClass().getName());
  assertEquals("{a} {getNamespace=a, getSimpleName=, hasNamespace=true, hasSimpleName=false, isEmpty=false}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "[property ''] {getCreatorIndex=7, getManagedReferenceName=null, getName=, getPropertyIndex=-1, hasValueDeserializer=false, hasValueTypeDeserializer=false, hasViews=false, isRequired=false, isVirtual=f...#205#1733294682", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput172() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.impl.InnerClassProperty", "com.fasterxml.jackson.databind.deser.impl.InnerClassProperty", "getValueDeserializer", new String[]{}, new String[]{}, false);
  assertNull(actual);
  assertEquals("receiver state after the call", "[property ''] {getCreatorIndex=7, getManagedReferenceName=null, getName=, getPropertyIndex=-1, hasValueDeserializer=false, hasValueTypeDeserializer=false, hasViews=false, isRequired=false, isVirtual=f...#205#1733294682", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput173() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.impl.InnerClassProperty", "com.fasterxml.jackson.databind.deser.impl.InnerClassProperty", "getValueDeserializer", new String[]{}, new String[]{}, false, 1, new String[][]{});
  assertNull(actual);
  assertEquals("receiver state after the call", "[property ''] {getCreatorIndex=8, getManagedReferenceName=null, getName=, getPropertyIndex=-1, hasValueDeserializer=false, hasValueTypeDeserializer=false, hasViews=false, isRequired=false, isVirtual=f...#205#1317967865", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput174() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.impl.InnerClassProperty", "com.fasterxml.jackson.databind.deser.impl.InnerClassProperty", "getValueDeserializer", new String[]{}, new String[]{}, false, 2, new String[][]{});
  assertNull(actual);
  assertEquals("receiver state after the call", "[property 'sample'] {getCreatorIndex=9, getManagedReferenceName=null, getName=sample, getPropertyIndex=-1, hasValueDeserializer=false, hasValueTypeDeserializer=false, hasViews=false, isRequired=false,...#217#-1576293160", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput175() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.impl.InnerClassProperty", "com.fasterxml.jackson.databind.deser.impl.InnerClassProperty", "getCreatorIndex", new String[]{}, new String[]{}, false, 7, new String[][]{{"com.fasterxml.jackson.databind.deser.impl.InnerClassProperty", "deserializeAndSet", "com.fasterxml.jackson.core.JsonParser,com.fasterxml.jackson.databind.DeserializationContext,java.lang.Object", "<sample:5>", "<sample:5>", "<s:c>"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("4", String.valueOf(actual));
  assertEquals("receiver state after the call", "[property '<a><b>t</b></a>'] {getCreatorIndex=4, getManagedReferenceName=null, getName=<a><b>t</b></a>, getPropertyIndex=-1, hasValueDeserializer=false, hasValueTypeDeserializer=false, hasViews=false,...#235#1709416239", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput176() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.impl.InnerClassProperty", "com.fasterxml.jackson.databind.deser.impl.InnerClassProperty", "getCreatorIndex", new String[]{}, new String[]{}, false, 9, new String[][]{{"com.fasterxml.jackson.databind.deser.impl.InnerClassProperty", "deserializeAndSet", "com.fasterxml.jackson.core.JsonParser,com.fasterxml.jackson.databind.DeserializationContext,java.lang.Object", "<sample:5>", "<sample:5>", "<s:c>"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("64", String.valueOf(actual));
  assertEquals("receiver state after the call", "[property ''] {getCreatorIndex=64, getManagedReferenceName=null, getName=, getPropertyIndex=-1, hasValueDeserializer=false, hasValueTypeDeserializer=false, hasViews=false, isRequired=true, isVirtual=f...#205#1999798276", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput177() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.impl.InnerClassProperty", "com.fasterxml.jackson.databind.deser.impl.InnerClassProperty", "writeReplace", new String[]{}, new String[]{}, false, 13, new String[][]{{"com.fasterxml.jackson.databind.deser.impl.InnerClassProperty", "deserializeAndSet", "com.fasterxml.jackson.core.JsonParser,com.fasterxml.jackson.databind.DeserializationContext,java.lang.Object", "<sample:2>", "<sample:4>", "<i:25>"}, {"com.fasterxml.jackson.databind.deser.impl.InnerClassProperty", "withName", "com.fasterxml.jackson.databind.PropertyName", "<sample:2>"}}), new String[][]{{"hasValueDeserializer", "", "7"}, {"hasValueDeserializer", "", "0"}, {"depositSchemaProperty", "com.fasterxml.jackson.databind.jsonFormatVisitors.JsonObjectFormatVisitor,com.fasterxml.jackson.databind.SerializerProvider", "3"}, {"getCreatorIndex", "", "1"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("-2", String.valueOf(actual));
  assertEquals("receiver state after the call", "[property ''] {getCreatorIndex=-2, getManagedReferenceName=null, getName=, getPropertyIndex=-1, hasValueDeserializer=false, hasValueTypeDeserializer=false, hasViews=false, isRequired=false, isVirtual=...#206#-996730246", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput178() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.impl.InnerClassProperty", "com.fasterxml.jackson.databind.deser.impl.InnerClassProperty", "writeReplace", new String[]{}, new String[]{}, false, 15, new String[][]{{"com.fasterxml.jackson.databind.deser.impl.InnerClassProperty", "deserializeAndSet", "com.fasterxml.jackson.core.JsonParser,com.fasterxml.jackson.databind.DeserializationContext,java.lang.Object", "<sample:2>", "<sample:4>", "<i:86>"}, {"com.fasterxml.jackson.databind.deser.impl.InnerClassProperty", "withName", "com.fasterxml.jackson.databind.PropertyName", "<sample:2>"}}), new String[][]{{"hasValueDeserializer", "", "7"}, {"hasValueDeserializer", "", "0"}, {"depositSchemaProperty", "com.fasterxml.jackson.databind.jsonFormatVisitors.JsonObjectFormatVisitor,com.fasterxml.jackson.databind.SerializerProvider", "3"}, {"getCreatorIndex", "", "1"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("4", String.valueOf(actual));
  assertEquals("receiver state after the call", "[property '<a><b>t</b></a>'] {getCreatorIndex=4, getManagedReferenceName=null, getName=<a><b>t</b></a>, getPropertyIndex=-1, hasValueDeserializer=false, hasValueTypeDeserializer=false, hasViews=false,...#235#1709416239", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput179() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.impl.InnerClassProperty", "com.fasterxml.jackson.databind.deser.impl.InnerClassProperty", "writeReplace", new String[]{}, new String[]{}, false, 16, new String[][]{{"com.fasterxml.jackson.databind.deser.impl.InnerClassProperty", "deserializeAndSet", "com.fasterxml.jackson.core.JsonParser,com.fasterxml.jackson.databind.DeserializationContext,java.lang.Object", "<sample:2>", "<sample:4>", "<i:86>"}, {"com.fasterxml.jackson.databind.deser.impl.InnerClassProperty", "withName", "com.fasterxml.jackson.databind.PropertyName", "<sample:2>"}}), new String[][]{{"hasValueDeserializer", "", "7"}, {"hasValueDeserializer", "", "0"}, {"depositSchemaProperty", "com.fasterxml.jackson.databind.jsonFormatVisitors.JsonObjectFormatVisitor,com.fasterxml.jackson.databind.SerializerProvider", "3"}, {"getCreatorIndex", "", "1"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("3", String.valueOf(actual));
  assertEquals("receiver state after the call", "[property ''] {getCreatorIndex=3, getManagedReferenceName=null, getName=, getPropertyIndex=-1, hasValueDeserializer=false, hasValueTypeDeserializer=false, hasViews=false, isRequired=false, isVirtual=f...#205#-900365346", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput180() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.impl.InnerClassProperty", "com.fasterxml.jackson.databind.deser.impl.InnerClassProperty", "writeReplace", new String[]{}, new String[]{}, false, 17, new String[][]{{"com.fasterxml.jackson.databind.deser.impl.InnerClassProperty", "deserializeAndSet", "com.fasterxml.jackson.core.JsonParser,com.fasterxml.jackson.databind.DeserializationContext,java.lang.Object", "<sample:2>", "<sample:4>", "<i:86>"}, {"com.fasterxml.jackson.databind.deser.impl.InnerClassProperty", "withName", "com.fasterxml.jackson.databind.PropertyName", "<sample:2>"}}), new String[][]{{"hasValueDeserializer", "", "7"}, {"hasValueDeserializer", "", "0"}, {"depositSchemaProperty", "com.fasterxml.jackson.databind.jsonFormatVisitors.JsonObjectFormatVisitor,com.fasterxml.jackson.databind.SerializerProvider", "3"}, {"getCreatorIndex", "", "1"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("4", String.valueOf(actual));
  assertEquals("receiver state after the call", "[property ''] {getCreatorIndex=4, getManagedReferenceName=null, getName=, getPropertyIndex=-1, hasValueDeserializer=false, hasValueTypeDeserializer=false, hasViews=false, isRequired=false, isVirtual=f...#205#-1315692163", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput181() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.impl.InnerClassProperty", "com.fasterxml.jackson.databind.deser.impl.InnerClassProperty", "hasValueTypeDeserializer", new String[]{}, new String[]{}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.deser.impl.InnerClassProperty", "setAndReturn", "java.lang.Object,java.lang.Object", "<sample:1>", "<sample:0>"}, {"com.fasterxml.jackson.databind.deser.impl.InnerClassProperty", "getValueTypeDeserializer", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "[property ''] {getCreatorIndex=7, getManagedReferenceName=null, getName=, getPropertyIndex=-1, hasValueDeserializer=false, hasValueTypeDeserializer=false, hasViews=false, isRequired=false, isVirtual=f...#205#1733294682", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput182() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.impl.InnerClassProperty", "com.fasterxml.jackson.databind.deser.impl.InnerClassProperty", "isVirtual", new String[]{}, new String[]{}, false);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "[property ''] {getCreatorIndex=7, getManagedReferenceName=null, getName=, getPropertyIndex=-1, hasValueDeserializer=false, hasValueTypeDeserializer=false, hasViews=false, isRequired=false, isVirtual=f...#205#1733294682", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput183() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.impl.InnerClassProperty", "com.fasterxml.jackson.databind.deser.impl.InnerClassProperty", "isVirtual", new String[]{}, new String[]{}, false, 1, new String[][]{});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "[property ''] {getCreatorIndex=8, getManagedReferenceName=null, getName=, getPropertyIndex=-1, hasValueDeserializer=false, hasValueTypeDeserializer=false, hasViews=false, isRequired=false, isVirtual=f...#205#1317967865", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput184() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.impl.InnerClassProperty", "com.fasterxml.jackson.databind.deser.impl.InnerClassProperty", "isVirtual", new String[]{}, new String[]{}, false, 2, new String[][]{});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "[property 'sample'] {getCreatorIndex=9, getManagedReferenceName=null, getName=sample, getPropertyIndex=-1, hasValueDeserializer=false, hasValueTypeDeserializer=false, hasViews=false, isRequired=false,...#217#-1576293160", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput185() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.impl.InnerClassProperty", "com.fasterxml.jackson.databind.deser.impl.InnerClassProperty", "isVirtual", new String[]{}, new String[]{}, false, 3, new String[][]{});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "[property 'sample'] {getCreatorIndex=9, getManagedReferenceName=null, getName=sample, getPropertyIndex=-1, hasValueDeserializer=false, hasValueTypeDeserializer=false, hasViews=false, isRequired=true, ...#216#758135373", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput186() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.impl.InnerClassProperty", "com.fasterxml.jackson.databind.deser.impl.InnerClassProperty", "getFullName", new String[]{}, new String[]{}, false, 1, new String[][]{}), new String[][]{{"internSimpleName", "", "6"}});
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.databind.PropertyName", actual.getClass().getName());
  assertEquals("{a} {getNamespace=a, getSimpleName=, hasNamespace=true, hasSimpleName=false, isEmpty=false}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "[property ''] {getCreatorIndex=8, getManagedReferenceName=null, getName=, getPropertyIndex=-1, hasValueDeserializer=false, hasValueTypeDeserializer=false, hasViews=false, isRequired=false, isVirtual=f...#205#1317967865", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput187() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.impl.InnerClassProperty", "com.fasterxml.jackson.databind.deser.impl.InnerClassProperty", "getFullName", new String[]{}, new String[]{}, false, 2, new String[][]{}), new String[][]{{"internSimpleName", "", "6"}});
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.databind.PropertyName", actual.getClass().getName());
  assertEquals("sample {getNamespace=null, getSimpleName=sample, hasNamespace=false, hasSimpleName=true, isEmpty=false}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "[property 'sample'] {getCreatorIndex=9, getManagedReferenceName=null, getName=sample, getPropertyIndex=-1, hasValueDeserializer=false, hasValueTypeDeserializer=false, hasViews=false, isRequired=false,...#217#-1576293160", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput188() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.impl.InnerClassProperty", "com.fasterxml.jackson.databind.deser.impl.InnerClassProperty", "getFullName", new String[]{}, new String[]{}, false, 3, new String[][]{}), new String[][]{{"internSimpleName", "", "6"}});
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.databind.PropertyName", actual.getClass().getName());
  assertEquals("sample {getNamespace=null, getSimpleName=sample, hasNamespace=false, hasSimpleName=true, isEmpty=false}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "[property 'sample'] {getCreatorIndex=9, getManagedReferenceName=null, getName=sample, getPropertyIndex=-1, hasValueDeserializer=false, hasValueTypeDeserializer=false, hasViews=false, isRequired=true, ...#216#758135373", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput189() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.impl.InnerClassProperty", "com.fasterxml.jackson.databind.deser.impl.InnerClassProperty", "getFullName", new String[]{}, new String[]{}, false, 3, new String[][]{}), new String[][]{{"isEmpty", "", "6"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "[property 'sample'] {getCreatorIndex=9, getManagedReferenceName=null, getName=sample, getPropertyIndex=-1, hasValueDeserializer=false, hasValueTypeDeserializer=false, hasViews=false, isRequired=true, ...#216#758135373", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput190() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.impl.InnerClassProperty", "com.fasterxml.jackson.databind.deser.impl.InnerClassProperty", "getFullName", new String[]{}, new String[]{}, false, 4, new String[][]{});
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput191() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.impl.InnerClassProperty", "com.fasterxml.jackson.databind.deser.impl.InnerClassProperty", "getFullName", new String[]{}, new String[]{}, false, 5, new String[][]{}), new String[][]{{"isEmpty", "", "6"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "[property ''] {getCreatorIndex=12, getManagedReferenceName=null, getName=, getPropertyIndex=-1, hasValueDeserializer=false, hasValueTypeDeserializer=false, hasViews=false, isRequired=false, isVirtual=...#206#-957648002", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput192() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.impl.InnerClassProperty", "com.fasterxml.jackson.databind.deser.impl.InnerClassProperty", "withName", new String[]{"java.lang.String"}, new String[]{"+1"}, false);
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.databind.deser.impl.InnerClassProperty", actual.getClass().getName());
  assertEquals("[property '+1'] {getCreatorIndex=7, getManagedReferenceName=null, getName=+1, getPropertyIndex=-1, hasValueDeserializer=false, hasValueTypeDeserializer=false, hasViews=false, isRequired=false, isVirtu...#209#641379226", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "[property ''] {getCreatorIndex=7, getManagedReferenceName=null, getName=, getPropertyIndex=-1, hasValueDeserializer=false, hasValueTypeDeserializer=false, hasViews=false, isRequired=false, isVirtual=f...#205#1733294682", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput193() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.impl.InnerClassProperty", "com.fasterxml.jackson.databind.deser.impl.InnerClassProperty", "withName", new String[]{"java.lang.String"}, new String[]{"+1"}, false, 1, new String[][]{});
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.databind.deser.impl.InnerClassProperty", actual.getClass().getName());
  assertEquals("[property '+1'] {getCreatorIndex=8, getManagedReferenceName=null, getName=+1, getPropertyIndex=-1, hasValueDeserializer=false, hasValueTypeDeserializer=false, hasViews=false, isRequired=false, isVirtu...#209#944266617", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "[property ''] {getCreatorIndex=8, getManagedReferenceName=null, getName=, getPropertyIndex=-1, hasValueDeserializer=false, hasValueTypeDeserializer=false, hasViews=false, isRequired=false, isVirtual=f...#205#1317967865", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput194() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.impl.InnerClassProperty", "com.fasterxml.jackson.databind.deser.impl.InnerClassProperty", "withName", new String[]{"java.lang.String"}, new String[]{"+1true"}, false, 1, new String[][]{}), new String[][]{{"setObjectIdInfo", "com.fasterxml.jackson.databind.introspect.ObjectIdInfo", "4"}});
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.databind.deser.impl.InnerClassProperty", actual.getClass().getName());
  assertEquals("[property '+1true'] {getCreatorIndex=8, getManagedReferenceName=null, getName=+1true, getPropertyIndex=-1, hasValueDeserializer=false, hasValueTypeDeserializer=false, hasViews=false, isRequired=false,...#217#-1242126663", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "[property ''] {getCreatorIndex=8, getManagedReferenceName=null, getName=, getPropertyIndex=-1, hasValueDeserializer=false, hasValueTypeDeserializer=false, hasViews=false, isRequired=false, isVirtual=f...#205#1317967865", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput195() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.impl.InnerClassProperty", "com.fasterxml.jackson.databind.deser.impl.InnerClassProperty", "withName", new String[]{"java.lang.String"}, new String[]{"+1trve"}, false, 1, new String[][]{}), new String[][]{{"setObjectIdInfo", "com.fasterxml.jackson.databind.introspect.ObjectIdInfo", "4"}});
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.databind.deser.impl.InnerClassProperty", actual.getClass().getName());
  assertEquals("[property '+1trve'] {getCreatorIndex=8, getManagedReferenceName=null, getName=+1trve, getPropertyIndex=-1, hasValueDeserializer=false, hasValueTypeDeserializer=false, hasViews=false, isRequired=false,...#217#-978855143", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "[property ''] {getCreatorIndex=8, getManagedReferenceName=null, getName=, getPropertyIndex=-1, hasValueDeserializer=false, hasValueTypeDeserializer=false, hasViews=false, isRequired=false, isVirtual=f...#205#1317967865", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput196() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.impl.InnerClassProperty", "com.fasterxml.jackson.databind.deser.impl.InnerClassProperty", "readResolve", new String[]{}, new String[]{}, false, 2, new String[][]{{"com.fasterxml.jackson.databind.deser.impl.InnerClassProperty", "deserialize", "com.fasterxml.jackson.core.JsonParser,com.fasterxml.jackson.databind.DeserializationContext", "<sample:4>", "<sample:5>"}, {"com.fasterxml.jackson.databind.deser.impl.InnerClassProperty", "withSimpleName", "java.lang.String", "2"}, {"com.fasterxml.jackson.databind.deser.impl.InnerClassProperty", "getObjectIdInfo", ""}}), new String[][]{{"getWrapperName", "", "3"}, {"getType", "", "6"}, {"isRequired", "", "2"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "[property 'sample'] {getCreatorIndex=9, getManagedReferenceName=null, getName=sample, getPropertyIndex=-1, hasValueDeserializer=false, hasValueTypeDeserializer=false, hasViews=false, isRequired=false,...#217#-1576293160", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput197() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.impl.InnerClassProperty", "com.fasterxml.jackson.databind.deser.impl.InnerClassProperty", "toString", new String[]{}, new String[]{}, false);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("[property '']", String.valueOf(actual));
  assertEquals("receiver state after the call", "[property ''] {getCreatorIndex=7, getManagedReferenceName=null, getName=, getPropertyIndex=-1, hasValueDeserializer=false, hasValueTypeDeserializer=false, hasViews=false, isRequired=false, isVirtual=f...#205#1733294682", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput198() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.impl.InnerClassProperty", "com.fasterxml.jackson.databind.deser.impl.InnerClassProperty", "getManagedReferenceName", new String[]{}, new String[]{}, false, 5, new String[][]{{"com.fasterxml.jackson.databind.deser.impl.InnerClassProperty", "visibleInView", "java.lang.Class", "<sample:0>"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "[property ''] {getCreatorIndex=12, getManagedReferenceName=null, getName=, getPropertyIndex=-1, hasValueDeserializer=false, hasValueTypeDeserializer=false, hasViews=false, isRequired=false, isVirtual=...#206#-957648002", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput199() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.impl.InnerClassProperty", "com.fasterxml.jackson.databind.deser.impl.InnerClassProperty", "getManagedReferenceName", new String[]{}, new String[]{}, false, 7, new String[][]{});
  assertNull(actual);
  assertEquals("receiver state after the call", "[property '<a><b>t</b></a>'] {getCreatorIndex=4, getManagedReferenceName=null, getName=<a><b>t</b></a>, getPropertyIndex=-1, hasValueDeserializer=false, hasValueTypeDeserializer=false, hasViews=false,...#235#1709416239", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput200() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.impl.InnerClassProperty", "com.fasterxml.jackson.databind.deser.impl.InnerClassProperty", "getManagedReferenceName", new String[]{}, new String[]{}, false, 9, new String[][]{});
  assertNull(actual);
  assertEquals("receiver state after the call", "[property ''] {getCreatorIndex=64, getManagedReferenceName=null, getName=, getPropertyIndex=-1, hasValueDeserializer=false, hasValueTypeDeserializer=false, hasViews=false, isRequired=true, isVirtual=f...#205#1999798276", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput201() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.impl.InnerClassProperty", "com.fasterxml.jackson.databind.deser.impl.InnerClassProperty", "getType", new String[]{}, new String[]{}, false, 9, new String[][]{});
  assertNull(actual);
  assertEquals("receiver state after the call", "[property ''] {getCreatorIndex=64, getManagedReferenceName=null, getName=, getPropertyIndex=-1, hasValueDeserializer=false, hasValueTypeDeserializer=false, hasViews=false, isRequired=true, isVirtual=f...#205#1999798276", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput202() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.impl.InnerClassProperty", "com.fasterxml.jackson.databind.deser.impl.InnerClassProperty", "findFormatOverrides", new String[]{"com.fasterxml.jackson.databind.AnnotationIntrospector"}, new String[]{"<sample:7>"}, false);
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.annotation.JsonFormat$Value", actual.getClass().getName());
  assertEquals("[pattern=,shape=ANY,locale=null,timezone=null] {getPattern=, getShape=ANY, hasLocale=false, hasPattern=false, hasShape=false, hasTimeZone=false}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "[property ''] {getCreatorIndex=7, getManagedReferenceName=null, getName=, getPropertyIndex=-1, hasValueDeserializer=false, hasValueTypeDeserializer=false, hasViews=false, isRequired=false, isVirtual=f...#205#1733294682", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput203() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.impl.InnerClassProperty", "com.fasterxml.jackson.databind.deser.impl.InnerClassProperty", "assignIndex", new String[]{"int"}, new String[]{"10"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.deser.impl.InnerClassProperty", "getFullName", ""}});
  assertNull(actual);
  assertEquals("receiver state after the call", "[property ''] {getCreatorIndex=7, getManagedReferenceName=null, getName=, getPropertyIndex=10, hasValueDeserializer=false, hasValueTypeDeserializer=false, hasViews=false, isRequired=false, isVirtual=f...#205#-1568956203", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput204() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.impl.InnerClassProperty", "com.fasterxml.jackson.databind.deser.impl.InnerClassProperty", "assignIndex", new String[]{"int"}, new String[]{"10"}, false, 1, new String[][]{{"com.fasterxml.jackson.databind.deser.impl.InnerClassProperty", "getFullName", ""}});
  assertNull(actual);
  assertEquals("receiver state after the call", "[property ''] {getCreatorIndex=8, getManagedReferenceName=null, getName=, getPropertyIndex=10, hasValueDeserializer=false, hasValueTypeDeserializer=false, hasViews=false, isRequired=false, isVirtual=f...#205#-1984283020", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput205() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.impl.InnerClassProperty", "com.fasterxml.jackson.databind.deser.impl.InnerClassProperty", "assignIndex", new String[]{"int"}, new String[]{"-29"}, false, 1, new String[][]{});
  assertNull(actual);
  assertEquals("receiver state after the call", "[property ''] {getCreatorIndex=8, getManagedReferenceName=null, getName=, getPropertyIndex=-29, hasValueDeserializer=false, hasValueTypeDeserializer=false, hasViews=false, isRequired=false, isVirtual=...#206#907296985", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput206() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.impl.InnerClassProperty", "com.fasterxml.jackson.databind.deser.impl.InnerClassProperty", "assignIndex", new String[]{"int"}, new String[]{"0"}, false, 1, new String[][]{{"com.fasterxml.jackson.databind.deser.impl.InnerClassProperty", "getInjectableValueId", ""}});
  assertNull(actual);
  assertEquals("receiver state after the call", "[property ''] {getCreatorIndex=8, getManagedReferenceName=null, getName=, getPropertyIndex=0, hasValueDeserializer=false, hasValueTypeDeserializer=false, hasViews=false, isRequired=false, isVirtual=fa...#204#-1641909291", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput207() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.impl.InnerClassProperty", "com.fasterxml.jackson.databind.deser.impl.InnerClassProperty", "assignIndex", new String[]{"int"}, new String[]{"-23"}, false, 1, new String[][]{{"com.fasterxml.jackson.databind.deser.impl.InnerClassProperty", "getInjectableValueId", ""}});
  assertNull(actual);
  assertEquals("receiver state after the call", "[property ''] {getCreatorIndex=8, getManagedReferenceName=null, getName=, getPropertyIndex=-23, hasValueDeserializer=false, hasValueTypeDeserializer=false, hasViews=false, isRequired=false, isVirtual=...#206#20829395", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput208() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.impl.InnerClassProperty", "com.fasterxml.jackson.databind.deser.impl.InnerClassProperty", "getContextAnnotation", new String[]{"java.lang.Class"}, new String[]{"<sample:0>"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.deser.impl.InnerClassProperty", "getValueTypeDeserializer", ""}, {"com.fasterxml.jackson.databind.deser.impl.InnerClassProperty", "setObjectIdInfo", "com.fasterxml.jackson.databind.introspect.ObjectIdInfo", "<sample:2>"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput209() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.impl.InnerClassProperty", "com.fasterxml.jackson.databind.deser.impl.InnerClassProperty", "getValueTypeDeserializer", new String[]{}, new String[]{}, false);
  assertNull(actual);
  assertEquals("receiver state after the call", "[property ''] {getCreatorIndex=7, getManagedReferenceName=null, getName=, getPropertyIndex=-1, hasValueDeserializer=false, hasValueTypeDeserializer=false, hasViews=false, isRequired=false, isVirtual=f...#205#1733294682", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput210() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.impl.InnerClassProperty", "com.fasterxml.jackson.databind.deser.impl.InnerClassProperty", "getValueTypeDeserializer", new String[]{}, new String[]{}, false, 11, new String[][]{});
  assertNull(actual);
  assertEquals("receiver state after the call", "[property '<a><b>t</b></a>'] {getCreatorIndex=4, getManagedReferenceName=null, getName=<a><b>t</b></a>, getPropertyIndex=-1, hasValueDeserializer=false, hasValueTypeDeserializer=false, hasViews=false,...#235#1709416239", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput211() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.impl.InnerClassProperty", "com.fasterxml.jackson.databind.deser.impl.InnerClassProperty", "getValueTypeDeserializer", new String[]{}, new String[]{}, false, 1, new String[][]{});
  assertNull(actual);
  assertEquals("receiver state after the call", "[property ''] {getCreatorIndex=8, getManagedReferenceName=null, getName=, getPropertyIndex=-1, hasValueDeserializer=false, hasValueTypeDeserializer=false, hasViews=false, isRequired=false, isVirtual=f...#205#1317967865", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput212() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.impl.InnerClassProperty", "com.fasterxml.jackson.databind.deser.impl.InnerClassProperty", "getValueTypeDeserializer", new String[]{}, new String[]{}, false, 2, new String[][]{});
  assertNull(actual);
  assertEquals("receiver state after the call", "[property 'sample'] {getCreatorIndex=9, getManagedReferenceName=null, getName=sample, getPropertyIndex=-1, hasValueDeserializer=false, hasValueTypeDeserializer=false, hasViews=false, isRequired=false,...#217#-1576293160", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput213() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.impl.InnerClassProperty", "com.fasterxml.jackson.databind.deser.impl.InnerClassProperty", "getValueTypeDeserializer", new String[]{}, new String[]{}, false, 3, new String[][]{});
  assertNull(actual);
  assertEquals("receiver state after the call", "[property 'sample'] {getCreatorIndex=9, getManagedReferenceName=null, getName=sample, getPropertyIndex=-1, hasValueDeserializer=false, hasValueTypeDeserializer=false, hasViews=false, isRequired=true, ...#216#758135373", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput214() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.impl.InnerClassProperty", "com.fasterxml.jackson.databind.deser.impl.InnerClassProperty", "getWrapperName", new String[]{}, new String[]{}, false, 3, new String[][]{}), new String[][]{{"withSimpleName", "java.lang.String", "2"}, {"hasNamespace", "", "2"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "[property 'sample'] {getCreatorIndex=9, getManagedReferenceName=null, getName=sample, getPropertyIndex=-1, hasValueDeserializer=false, hasValueTypeDeserializer=false, hasViews=false, isRequired=true, ...#216#758135373", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput215() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.impl.InnerClassProperty", "com.fasterxml.jackson.databind.deser.impl.InnerClassProperty", "getWrapperName", new String[]{}, new String[]{}, false, 3, new String[][]{}), new String[][]{{"withSimpleName", "java.lang.String", "2"}, {"hasNamespace", "", "2"}, {"withNamespace", "java.lang.String", "7"}});
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.databind.PropertyName", actual.getClass().getName());
  assertEquals("{sample}0 {getNamespace=sample, getSimpleName=0, hasNamespace=true, hasSimpleName=true, isEmpty=false}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "[property 'sample'] {getCreatorIndex=9, getManagedReferenceName=null, getName=sample, getPropertyIndex=-1, hasValueDeserializer=false, hasValueTypeDeserializer=false, hasViews=false, isRequired=true, ...#216#758135373", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput216() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.impl.InnerClassProperty", "com.fasterxml.jackson.databind.deser.impl.InnerClassProperty", "getWrapperName", new String[]{}, new String[]{}, false, 5, new String[][]{{"com.fasterxml.jackson.databind.deser.impl.InnerClassProperty", "setViews", "java.lang.Class[]", "<sample:1>"}, {"com.fasterxml.jackson.databind.deser.impl.InnerClassProperty", "writeReplace", ""}});
  assertNull(actual);
  assertEquals("receiver state after the call", "[property ''] {getCreatorIndex=12, getManagedReferenceName=null, getName=, getPropertyIndex=-1, hasValueDeserializer=false, hasValueTypeDeserializer=false, hasViews=true, isRequired=false, isVirtual=f...#205#509591757", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput217() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.impl.InnerClassProperty", "com.fasterxml.jackson.databind.deser.impl.InnerClassProperty", "withName", new String[]{"com.fasterxml.jackson.databind.PropertyName"}, new String[]{"<sample:7>"}, false, 4, new String[][]{{"com.fasterxml.jackson.databind.deser.impl.InnerClassProperty", "_throwAsIOE", "com.fasterxml.jackson.core.JsonParser,java.lang.Exception", "<null>", "<sample:3>"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput218() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.impl.InnerClassProperty", "com.fasterxml.jackson.databind.deser.impl.InnerClassProperty", "withName", new String[]{"com.fasterxml.jackson.databind.PropertyName"}, new String[]{"<sample:5>"}, false, 5, new String[][]{{"com.fasterxml.jackson.databind.deser.impl.InnerClassProperty", "_throwAsIOE", "com.fasterxml.jackson.core.JsonParser,java.lang.Exception", "<null>", "<sample:3>"}});
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.databind.deser.impl.InnerClassProperty", actual.getClass().getName());
  assertEquals("[property '0'] {getCreatorIndex=12, getManagedReferenceName=null, getName=0, getPropertyIndex=-1, hasValueDeserializer=false, hasValueTypeDeserializer=false, hasViews=false, isRequired=false, isVirtua...#208#-104976294", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "[property ''] {getCreatorIndex=12, getManagedReferenceName=null, getName=, getPropertyIndex=-1, hasValueDeserializer=false, hasValueTypeDeserializer=false, hasViews=false, isRequired=false, isVirtual=...#206#-957648002", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput219() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.impl.InnerClassProperty", "com.fasterxml.jackson.databind.deser.impl.InnerClassProperty", "withName", new String[]{"com.fasterxml.jackson.databind.PropertyName"}, new String[]{"<sample:7>"}, false, 5, new String[][]{{"com.fasterxml.jackson.databind.deser.impl.InnerClassProperty", "getManagedReferenceName", ""}, {"com.fasterxml.jackson.databind.deser.impl.InnerClassProperty", "deserializeAndSet", "com.fasterxml.jackson.core.JsonParser,com.fasterxml.jackson.databind.DeserializationContext,java.lang.Object", "<sample:5>", "<sample:2>", "<s:>"}});
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.databind.deser.impl.InnerClassProperty", actual.getClass().getName());
  assertEquals("[property ''] {getCreatorIndex=12, getManagedReferenceName=null, getName=, getPropertyIndex=-1, hasValueDeserializer=false, hasValueTypeDeserializer=false, hasViews=false, isRequired=false, isVirtual=...#206#-957648002", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "[property ''] {getCreatorIndex=12, getManagedReferenceName=null, getName=, getPropertyIndex=-1, hasValueDeserializer=false, hasValueTypeDeserializer=false, hasViews=false, isRequired=false, isVirtual=...#206#-957648002", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput220() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.impl.InnerClassProperty", "com.fasterxml.jackson.databind.deser.impl.InnerClassProperty", "hasViews", new String[]{}, new String[]{}, false, 6, new String[][]{{"com.fasterxml.jackson.databind.deser.impl.InnerClassProperty", "toString", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput221() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.impl.InnerClassProperty", "com.fasterxml.jackson.databind.deser.impl.InnerClassProperty", "hasViews", new String[]{}, new String[]{}, false, 1, new String[][]{{"com.fasterxml.jackson.databind.deser.impl.InnerClassProperty", "toString", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "[property ''] {getCreatorIndex=8, getManagedReferenceName=null, getName=, getPropertyIndex=-1, hasValueDeserializer=false, hasValueTypeDeserializer=false, hasViews=false, isRequired=false, isVirtual=f...#205#1317967865", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput222() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.impl.InnerClassProperty", "com.fasterxml.jackson.databind.deser.impl.InnerClassProperty", "hasViews", new String[]{}, new String[]{}, false, 2, new String[][]{});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "[property 'sample'] {getCreatorIndex=9, getManagedReferenceName=null, getName=sample, getPropertyIndex=-1, hasValueDeserializer=false, hasValueTypeDeserializer=false, hasViews=false, isRequired=false,...#217#-1576293160", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput223() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.impl.InnerClassProperty", "com.fasterxml.jackson.databind.deser.impl.InnerClassProperty", "hasViews", new String[]{}, new String[]{}, false, 5, new String[][]{});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "[property ''] {getCreatorIndex=12, getManagedReferenceName=null, getName=, getPropertyIndex=-1, hasValueDeserializer=false, hasValueTypeDeserializer=false, hasViews=false, isRequired=false, isVirtual=...#206#-957648002", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput224() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.impl.InnerClassProperty", "com.fasterxml.jackson.databind.deser.impl.InnerClassProperty", "getAnnotation", new String[]{"java.lang.Class"}, new String[]{"<sample:4>"}, false, 8, new String[][]{}, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput225() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.impl.InnerClassProperty", "com.fasterxml.jackson.databind.deser.impl.InnerClassProperty", "getAnnotation", new String[]{"java.lang.Class"}, new String[]{"<sample:1>"}, false, 9, new String[][]{{"com.fasterxml.jackson.databind.deser.impl.InnerClassProperty", "hasValueDeserializer", ""}}, 3);
  assertNull(actual);
  assertEquals("receiver state after the call", "[property ''] {getCreatorIndex=64, getManagedReferenceName=null, getName=, getPropertyIndex=-1, hasValueDeserializer=false, hasValueTypeDeserializer=false, hasViews=false, isRequired=true, isVirtual=f...#205#1999798276", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput226() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.impl.InnerClassProperty", "com.fasterxml.jackson.databind.deser.impl.InnerClassProperty", "hasViews", new String[]{}, new String[]{}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.deser.impl.InnerClassProperty", "assignIndex", "int", "-1"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "[property ''] {getCreatorIndex=7, getManagedReferenceName=null, getName=, getPropertyIndex=-1, hasValueDeserializer=false, hasValueTypeDeserializer=false, hasViews=false, isRequired=false, isVirtual=f...#205#1733294682", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput227() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.impl.InnerClassProperty", "com.fasterxml.jackson.databind.deser.impl.InnerClassProperty", "withName", new String[]{"com.fasterxml.jackson.databind.PropertyName"}, new String[]{"<sample:2>"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.deser.impl.InnerClassProperty", "deserialize", "com.fasterxml.jackson.core.JsonParser,com.fasterxml.jackson.databind.DeserializationContext", "<sample:7>", "<sample:0>"}}), new String[][]{{"getAnnotation", "java.lang.Class", "1"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "[property ''] {getCreatorIndex=7, getManagedReferenceName=null, getName=, getPropertyIndex=-1, hasValueDeserializer=false, hasValueTypeDeserializer=false, hasViews=false, isRequired=false, isVirtual=f...#205#1733294682", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput228() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.impl.InnerClassProperty", "com.fasterxml.jackson.databind.deser.impl.InnerClassProperty", "withName", new String[]{"com.fasterxml.jackson.databind.PropertyName"}, new String[]{"<sample:3>"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.deser.impl.InnerClassProperty", "deserialize", "com.fasterxml.jackson.core.JsonParser,com.fasterxml.jackson.databind.DeserializationContext", "<sample:7>", "<sample:0>"}}, 3), new String[][]{{"getAnnotation", "java.lang.Class", "1"}, {"getValueDeserializer", "", "5"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "[property ''] {getCreatorIndex=7, getManagedReferenceName=null, getName=, getPropertyIndex=-1, hasValueDeserializer=false, hasValueTypeDeserializer=false, hasViews=false, isRequired=false, isVirtual=f...#205#1733294682", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput229() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.impl.InnerClassProperty", "com.fasterxml.jackson.databind.deser.impl.InnerClassProperty", "withName", new String[]{"com.fasterxml.jackson.databind.PropertyName"}, new String[]{"<sample:3>"}, false, 12, new String[][]{{"com.fasterxml.jackson.databind.deser.impl.InnerClassProperty", "deserialize", "com.fasterxml.jackson.core.JsonParser,com.fasterxml.jackson.databind.DeserializationContext", "<sample:7>", "<sample:0>"}}, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput230() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.impl.InnerClassProperty", "com.fasterxml.jackson.databind.deser.impl.InnerClassProperty", "withName", new String[]{"com.fasterxml.jackson.databind.PropertyName"}, new String[]{"<sample:2>"}, false, 15, new String[][]{{"com.fasterxml.jackson.databind.deser.impl.InnerClassProperty", "deserialize", "com.fasterxml.jackson.core.JsonParser,com.fasterxml.jackson.databind.DeserializationContext", "<sample:7>", "<sample:1>"}}), new String[][]{{"getAnnotation", "java.lang.Class", "1"}, {"getValueDeserializer", "", "5"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "[property '<a><b>t</b></a>'] {getCreatorIndex=4, getManagedReferenceName=null, getName=<a><b>t</b></a>, getPropertyIndex=-1, hasValueDeserializer=false, hasValueTypeDeserializer=false, hasViews=false,...#235#1709416239", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput231() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.impl.InnerClassProperty", "com.fasterxml.jackson.databind.deser.impl.InnerClassProperty", "getName", new String[]{}, new String[]{}, false, 10, new String[][]{{"com.fasterxml.jackson.databind.deser.impl.InnerClassProperty", "getType", ""}, {"com.fasterxml.jackson.databind.deser.impl.InnerClassProperty", "visibleInView", "java.lang.Class", "<sample:1>"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput232() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.impl.InnerClassProperty", "com.fasterxml.jackson.databind.deser.impl.InnerClassProperty", "getName", new String[]{}, new String[]{}, false, 11, new String[][]{{"com.fasterxml.jackson.databind.deser.impl.InnerClassProperty", "getType", ""}, {"com.fasterxml.jackson.databind.deser.impl.InnerClassProperty", "visibleInView", "java.lang.Class", "<sample:1>"}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("<a><b>t</b></a>", String.valueOf(actual));
  assertEquals("receiver state after the call", "[property '<a><b>t</b></a>'] {getCreatorIndex=4, getManagedReferenceName=null, getName=<a><b>t</b></a>, getPropertyIndex=-1, hasValueDeserializer=false, hasValueTypeDeserializer=false, hasViews=false,...#235#1709416239", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput233() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.impl.InnerClassProperty", "com.fasterxml.jackson.databind.deser.impl.InnerClassProperty", "getName", new String[]{}, new String[]{}, false, 13, new String[][]{{"com.fasterxml.jackson.databind.deser.impl.InnerClassProperty", "getType", ""}, {"com.fasterxml.jackson.databind.deser.impl.InnerClassProperty", "visibleInView", "java.lang.Class", "<sample:1>"}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("", String.valueOf(actual));
  assertEquals("receiver state after the call", "[property ''] {getCreatorIndex=-2, getManagedReferenceName=null, getName=, getPropertyIndex=-1, hasValueDeserializer=false, hasValueTypeDeserializer=false, hasViews=false, isRequired=false, isVirtual=...#206#-996730246", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput234() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.impl.InnerClassProperty", "com.fasterxml.jackson.databind.deser.impl.InnerClassProperty", "getName", new String[]{}, new String[]{}, false, 14, new String[][]{{"com.fasterxml.jackson.databind.deser.impl.InnerClassProperty", "getType", ""}, {"com.fasterxml.jackson.databind.deser.impl.InnerClassProperty", "visibleInView", "java.lang.Class", "<sample:1>"}}, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput235() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.impl.InnerClassProperty", "com.fasterxml.jackson.databind.deser.impl.InnerClassProperty", "deserializeSetAndReturn", new String[]{"com.fasterxml.jackson.core.JsonParser", "com.fasterxml.jackson.databind.DeserializationContext", "java.lang.Object"}, new String[]{"<sample:6>", "<sample:7>", "<i:0>"}, false); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput236() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.impl.InnerClassProperty", "com.fasterxml.jackson.databind.deser.impl.InnerClassProperty", "deserializeSetAndReturn", new String[]{"com.fasterxml.jackson.core.JsonParser", "com.fasterxml.jackson.databind.DeserializationContext", "java.lang.Object"}, new String[]{"<sample:6>", "<sample:0>", "<i:0>"}, false); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("com.fasterxml.jackson.databind.JsonMappingException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput237() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.impl.InnerClassProperty", "com.fasterxml.jackson.databind.deser.impl.InnerClassProperty", "getDeclaringClass", new String[]{}, new String[]{}, false, 1, new String[][]{{"com.fasterxml.jackson.databind.deser.impl.InnerClassProperty", "readResolve", ""}}, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput238() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.impl.InnerClassProperty", "com.fasterxml.jackson.databind.deser.impl.InnerClassProperty", "_throwAsIOE", new String[]{"java.lang.Exception", "java.lang.Object"}, new String[]{"<empty>", "<null>"}, false); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("com.fasterxml.jackson.databind.JsonMappingException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput239() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.impl.InnerClassProperty", "com.fasterxml.jackson.databind.deser.impl.InnerClassProperty", "_throwAsIOE", new String[]{"java.lang.Exception", "java.lang.Object"}, new String[]{"<sample:2>", "<i:112>"}, false, 1, new String[][]{{"com.fasterxml.jackson.databind.deser.impl.InnerClassProperty", "setViews", "java.lang.Class[]", "<sample:2>"}}, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("com.fasterxml.jackson.databind.JsonMappingException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput240() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.impl.InnerClassProperty", "com.fasterxml.jackson.databind.deser.impl.InnerClassProperty", "getWrapperName", new String[]{}, new String[]{}, false, 1, new String[][]{{"com.fasterxml.jackson.databind.deser.impl.InnerClassProperty", "getMember", ""}}, 2);
  assertNull(actual);
  assertEquals("receiver state after the call", "[property ''] {getCreatorIndex=8, getManagedReferenceName=null, getName=, getPropertyIndex=-1, hasValueDeserializer=false, hasValueTypeDeserializer=false, hasViews=false, isRequired=false, isVirtual=f...#205#1317967865", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput241() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.impl.InnerClassProperty", "com.fasterxml.jackson.databind.deser.impl.InnerClassProperty", "getWrapperName", new String[]{}, new String[]{}, false, 2, new String[][]{{"com.fasterxml.jackson.databind.deser.impl.InnerClassProperty", "getMember", ""}}, 2);
  assertNull(actual);
  assertEquals("receiver state after the call", "[property 'sample'] {getCreatorIndex=9, getManagedReferenceName=null, getName=sample, getPropertyIndex=-1, hasValueDeserializer=false, hasValueTypeDeserializer=false, hasViews=false, isRequired=false,...#217#-1576293160", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput242() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.impl.InnerClassProperty", "com.fasterxml.jackson.databind.deser.impl.InnerClassProperty", "getWrapperName", new String[]{}, new String[]{}, false, 3, new String[][]{}, 2), new String[][]{{"getNamespace", "", "0"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "[property 'sample'] {getCreatorIndex=9, getManagedReferenceName=null, getName=sample, getPropertyIndex=-1, hasValueDeserializer=false, hasValueTypeDeserializer=false, hasViews=false, isRequired=true, ...#216#758135373", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput243() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.impl.InnerClassProperty", "com.fasterxml.jackson.databind.deser.impl.InnerClassProperty", "getPropertyIndex", new String[]{}, new String[]{}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.deser.impl.InnerClassProperty", "getValueDeserializer", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("-1", String.valueOf(actual));
  assertEquals("receiver state after the call", "[property ''] {getCreatorIndex=7, getManagedReferenceName=null, getName=, getPropertyIndex=-1, hasValueDeserializer=false, hasValueTypeDeserializer=false, hasViews=false, isRequired=false, isVirtual=f...#205#1733294682", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput244() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.impl.InnerClassProperty", "com.fasterxml.jackson.databind.deser.impl.InnerClassProperty", "getPropertyIndex", new String[]{}, new String[]{}, false, 1, new String[][]{{"com.fasterxml.jackson.databind.deser.impl.InnerClassProperty", "getValueDeserializer", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("-1", String.valueOf(actual));
  assertEquals("receiver state after the call", "[property ''] {getCreatorIndex=8, getManagedReferenceName=null, getName=, getPropertyIndex=-1, hasValueDeserializer=false, hasValueTypeDeserializer=false, hasViews=false, isRequired=false, isVirtual=f...#205#1317967865", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput245() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.impl.InnerClassProperty", "com.fasterxml.jackson.databind.deser.impl.InnerClassProperty", "getPropertyIndex", new String[]{}, new String[]{}, false, 2, new String[][]{{"com.fasterxml.jackson.databind.deser.impl.InnerClassProperty", "getValueDeserializer", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("-1", String.valueOf(actual));
  assertEquals("receiver state after the call", "[property 'sample'] {getCreatorIndex=9, getManagedReferenceName=null, getName=sample, getPropertyIndex=-1, hasValueDeserializer=false, hasValueTypeDeserializer=false, hasViews=false, isRequired=false,...#217#-1576293160", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput246() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.impl.InnerClassProperty", "com.fasterxml.jackson.databind.deser.impl.InnerClassProperty", "getPropertyIndex", new String[]{}, new String[]{}, false, 3, new String[][]{{"com.fasterxml.jackson.databind.deser.impl.InnerClassProperty", "getValueDeserializer", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("-1", String.valueOf(actual));
  assertEquals("receiver state after the call", "[property 'sample'] {getCreatorIndex=9, getManagedReferenceName=null, getName=sample, getPropertyIndex=-1, hasValueDeserializer=false, hasValueTypeDeserializer=false, hasViews=false, isRequired=true, ...#216#758135373", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput247() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.impl.InnerClassProperty", "com.fasterxml.jackson.databind.deser.impl.InnerClassProperty", "getPropertyIndex", new String[]{}, new String[]{}, false, 4, new String[][]{}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput248() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.impl.InnerClassProperty", "com.fasterxml.jackson.databind.deser.impl.InnerClassProperty", "getPropertyIndex", new String[]{}, new String[]{}, false, 5, new String[][]{});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("-1", String.valueOf(actual));
  assertEquals("receiver state after the call", "[property ''] {getCreatorIndex=12, getManagedReferenceName=null, getName=, getPropertyIndex=-1, hasValueDeserializer=false, hasValueTypeDeserializer=false, hasViews=false, isRequired=false, isVirtual=...#206#-957648002", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput249() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.impl.InnerClassProperty", "com.fasterxml.jackson.databind.deser.impl.InnerClassProperty", "getObjectIdInfo", new String[]{}, new String[]{}, false, 9, new String[][]{{"com.fasterxml.jackson.databind.deser.impl.InnerClassProperty", "getDeclaringClass", ""}, {"com.fasterxml.jackson.databind.deser.impl.InnerClassProperty", "getFullName", ""}, {"com.fasterxml.jackson.databind.deser.impl.InnerClassProperty", "deserializeSetAndReturn", "com.fasterxml.jackson.core.JsonParser,com.fasterxml.jackson.databind.DeserializationContext,java.lang.Object", "<null>", "<sample:2>", "<i:0>"}}, 2);
  assertNull(actual);
  assertEquals("receiver state after the call", "[property ''] {getCreatorIndex=64, getManagedReferenceName=null, getName=, getPropertyIndex=-1, hasValueDeserializer=false, hasValueTypeDeserializer=false, hasViews=false, isRequired=true, isVirtual=f...#205#1999798276", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput250() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.impl.InnerClassProperty", "com.fasterxml.jackson.databind.deser.impl.InnerClassProperty", "getObjectIdInfo", new String[]{}, new String[]{}, false, 11, new String[][]{{"com.fasterxml.jackson.databind.deser.impl.InnerClassProperty", "getDeclaringClass", ""}, {"com.fasterxml.jackson.databind.deser.impl.InnerClassProperty", "getFullName", ""}, {"com.fasterxml.jackson.databind.deser.impl.InnerClassProperty", "deserializeSetAndReturn", "com.fasterxml.jackson.core.JsonParser,com.fasterxml.jackson.databind.DeserializationContext,java.lang.Object", "<null>", "<sample:2>", "<i:0>"}}, 2);
  assertNull(actual);
  assertEquals("receiver state after the call", "[property '<a><b>t</b></a>'] {getCreatorIndex=4, getManagedReferenceName=null, getName=<a><b>t</b></a>, getPropertyIndex=-1, hasValueDeserializer=false, hasValueTypeDeserializer=false, hasViews=false,...#235#1709416239", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput251() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.impl.InnerClassProperty", "com.fasterxml.jackson.databind.deser.impl.InnerClassProperty", "toString", new String[]{}, new String[]{}, false, 1, new String[][]{{"com.fasterxml.jackson.databind.deser.impl.InnerClassProperty", "getValueDeserializer", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("[property '']", String.valueOf(actual));
  assertEquals("receiver state after the call", "[property ''] {getCreatorIndex=8, getManagedReferenceName=null, getName=, getPropertyIndex=-1, hasValueDeserializer=false, hasValueTypeDeserializer=false, hasViews=false, isRequired=false, isVirtual=f...#205#1317967865", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput252() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.impl.InnerClassProperty", "com.fasterxml.jackson.databind.deser.impl.InnerClassProperty", "toString", new String[]{}, new String[]{}, false, 2, new String[][]{{"com.fasterxml.jackson.databind.deser.impl.InnerClassProperty", "getValueDeserializer", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("[property 'sample']", String.valueOf(actual));
  assertEquals("receiver state after the call", "[property 'sample'] {getCreatorIndex=9, getManagedReferenceName=null, getName=sample, getPropertyIndex=-1, hasValueDeserializer=false, hasValueTypeDeserializer=false, hasViews=false, isRequired=false,...#217#-1576293160", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput253() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.impl.InnerClassProperty", "com.fasterxml.jackson.databind.deser.impl.InnerClassProperty", "toString", new String[]{}, new String[]{}, false, 3, new String[][]{{"com.fasterxml.jackson.databind.deser.impl.InnerClassProperty", "getValueDeserializer", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("[property 'sample']", String.valueOf(actual));
  assertEquals("receiver state after the call", "[property 'sample'] {getCreatorIndex=9, getManagedReferenceName=null, getName=sample, getPropertyIndex=-1, hasValueDeserializer=false, hasValueTypeDeserializer=false, hasViews=false, isRequired=true, ...#216#758135373", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput254() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.impl.InnerClassProperty", "com.fasterxml.jackson.databind.deser.impl.InnerClassProperty", "toString", new String[]{}, new String[]{}, false, 4, new String[][]{{"com.fasterxml.jackson.databind.deser.impl.InnerClassProperty", "_throwAsIOE", "com.fasterxml.jackson.core.JsonParser,java.lang.Exception,java.lang.Object", "<sample:0>", "<sample:0>", "<b:true>"}, {"com.fasterxml.jackson.databind.deser.impl.InnerClassProperty", "getValueDeserializer", ""}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput255() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.impl.InnerClassProperty", "com.fasterxml.jackson.databind.deser.impl.InnerClassProperty", "toString", new String[]{}, new String[]{}, false, 5, new String[][]{{"com.fasterxml.jackson.databind.deser.impl.InnerClassProperty", "_throwAsIOE", "com.fasterxml.jackson.core.JsonParser,java.lang.Exception,java.lang.Object", "<sample:0>", "<sample:0>", "<b:true>"}, {"com.fasterxml.jackson.databind.deser.impl.InnerClassProperty", "getValueDeserializer", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("[property '']", String.valueOf(actual));
  assertEquals("receiver state after the call", "[property ''] {getCreatorIndex=12, getManagedReferenceName=null, getName=, getPropertyIndex=-1, hasValueDeserializer=false, hasValueTypeDeserializer=false, hasViews=false, isRequired=false, isVirtual=...#206#-957648002", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput256() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.impl.InnerClassProperty", "com.fasterxml.jackson.databind.deser.impl.InnerClassProperty", "toString", new String[]{}, new String[]{}, false, 7, new String[][]{{"com.fasterxml.jackson.databind.deser.impl.InnerClassProperty", "_throwAsIOE", "com.fasterxml.jackson.core.JsonParser,java.lang.Exception,java.lang.Object", "<sample:0>", "<sample:0>", "<b:true>"}, {"com.fasterxml.jackson.databind.deser.impl.InnerClassProperty", "getValueDeserializer", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("[property '<a><b>t</b></a>']", String.valueOf(actual));
  assertEquals("receiver state after the call", "[property '<a><b>t</b></a>'] {getCreatorIndex=4, getManagedReferenceName=null, getName=<a><b>t</b></a>, getPropertyIndex=-1, hasValueDeserializer=false, hasValueTypeDeserializer=false, hasViews=false,...#235#1709416239", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput257() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.impl.InnerClassProperty", "com.fasterxml.jackson.databind.deser.impl.InnerClassProperty", "toString", new String[]{}, new String[]{}, false, 8, new String[][]{{"com.fasterxml.jackson.databind.deser.impl.InnerClassProperty", "_throwAsIOE", "com.fasterxml.jackson.core.JsonParser,java.lang.Exception,java.lang.Object", "<sample:0>", "<sample:0>", "<b:true>"}, {"com.fasterxml.jackson.databind.deser.impl.InnerClassProperty", "getValueDeserializer", ""}}, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput258() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.impl.InnerClassProperty", "com.fasterxml.jackson.databind.deser.impl.InnerClassProperty", "toString", new String[]{}, new String[]{}, false, 9, new String[][]{{"com.fasterxml.jackson.databind.deser.impl.InnerClassProperty", "_throwAsIOE", "com.fasterxml.jackson.core.JsonParser,java.lang.Exception,java.lang.Object", "<sample:0>", "<sample:0>", "<b:true>"}, {"com.fasterxml.jackson.databind.deser.impl.InnerClassProperty", "_throwAsIOE", "java.lang.Exception,java.lang.Object", "<sample:3>", "<d:1.5>"}, {"com.fasterxml.jackson.databind.deser.impl.InnerClassProperty", "getValueDeserializer", ""}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("[property '']", String.valueOf(actual));
  assertEquals("receiver state after the call", "[property ''] {getCreatorIndex=64, getManagedReferenceName=null, getName=, getPropertyIndex=-1, hasValueDeserializer=false, hasValueTypeDeserializer=false, hasViews=false, isRequired=true, isVirtual=f...#205#1999798276", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput259() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.impl.InnerClassProperty", "com.fasterxml.jackson.databind.deser.impl.InnerClassProperty", "toString", new String[]{}, new String[]{}, false, 11, new String[][]{{"com.fasterxml.jackson.databind.deser.impl.InnerClassProperty", "_throwAsIOE", "com.fasterxml.jackson.core.JsonParser,java.lang.Exception,java.lang.Object", "<sample:0>", "<sample:0>", "<b:true>"}, {"com.fasterxml.jackson.databind.deser.impl.InnerClassProperty", "getValueDeserializer", ""}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("[property '<a><b>t</b></a>']", String.valueOf(actual));
  assertEquals("receiver state after the call", "[property '<a><b>t</b></a>'] {getCreatorIndex=4, getManagedReferenceName=null, getName=<a><b>t</b></a>, getPropertyIndex=-1, hasValueDeserializer=false, hasValueTypeDeserializer=false, hasViews=false,...#235#1709416239", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput260() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.impl.InnerClassProperty", "com.fasterxml.jackson.databind.deser.impl.InnerClassProperty", "toString", new String[]{}, new String[]{}, false, 13, new String[][]{{"com.fasterxml.jackson.databind.deser.impl.InnerClassProperty", "_throwAsIOE", "com.fasterxml.jackson.core.JsonParser,java.lang.Exception,java.lang.Object", "<sample:0>", "<sample:0>", "<b:true>"}, {"com.fasterxml.jackson.databind.deser.impl.InnerClassProperty", "getValueDeserializer", ""}, {"com.fasterxml.jackson.databind.deser.impl.InnerClassProperty", "withName", "java.lang.String", "abc"}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("[property '']", String.valueOf(actual));
  assertEquals("receiver state after the call", "[property ''] {getCreatorIndex=-2, getManagedReferenceName=null, getName=, getPropertyIndex=-1, hasValueDeserializer=false, hasValueTypeDeserializer=false, hasViews=false, isRequired=false, isVirtual=...#206#-996730246", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput261() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.impl.InnerClassProperty", "com.fasterxml.jackson.databind.deser.impl.InnerClassProperty", "setObjectIdInfo", new String[]{"com.fasterxml.jackson.databind.introspect.ObjectIdInfo"}, new String[]{"<sample:3>"}, false, 1, new String[][]{{"com.fasterxml.jackson.databind.deser.impl.InnerClassProperty", "getWrapperName", ""}});
  assertNull(actual);
  assertEquals("receiver state after the call", "[property ''] {getCreatorIndex=8, getManagedReferenceName=null, getName=, getPropertyIndex=-1, hasValueDeserializer=false, hasValueTypeDeserializer=false, hasViews=false, isRequired=false, isVirtual=f...#205#1317967865", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput262() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.impl.InnerClassProperty", "com.fasterxml.jackson.databind.deser.impl.InnerClassProperty", "getAnnotation", new String[]{"java.lang.Class"}, new String[]{"<sample:2>"}, false, 0, null, 2);
  assertNull(actual);
  assertEquals("receiver state after the call", "[property ''] {getCreatorIndex=7, getManagedReferenceName=null, getName=, getPropertyIndex=-1, hasValueDeserializer=false, hasValueTypeDeserializer=false, hasViews=false, isRequired=false, isVirtual=f...#205#1733294682", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput263() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.impl.InnerClassProperty", "com.fasterxml.jackson.databind.deser.impl.InnerClassProperty", "getAnnotation", new String[]{"java.lang.Class"}, new String[]{"<sample:5>"}, false, 11, new String[][]{}, 2);
  assertNull(actual);
  assertEquals("receiver state after the call", "[property '<a><b>t</b></a>'] {getCreatorIndex=4, getManagedReferenceName=null, getName=<a><b>t</b></a>, getPropertyIndex=-1, hasValueDeserializer=false, hasValueTypeDeserializer=false, hasViews=false,...#235#1709416239", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput264() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.impl.InnerClassProperty", "com.fasterxml.jackson.databind.deser.impl.InnerClassProperty", "withName", new String[]{"java.lang.String"}, new String[]{"TITLE"}, false);
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.databind.deser.impl.InnerClassProperty", actual.getClass().getName());
  assertEquals("[property 'TITLE'] {getCreatorIndex=7, getManagedReferenceName=null, getName=TITLE, getPropertyIndex=-1, hasValueDeserializer=false, hasValueTypeDeserializer=false, hasViews=false, isRequired=false, i...#215#-26819990", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "[property ''] {getCreatorIndex=7, getManagedReferenceName=null, getName=, getPropertyIndex=-1, hasValueDeserializer=false, hasValueTypeDeserializer=false, hasViews=false, isRequired=false, isVirtual=f...#205#1733294682", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput265() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.impl.InnerClassProperty", "com.fasterxml.jackson.databind.deser.impl.InnerClassProperty", "withName", new String[]{"java.lang.String"}, new String[]{"TTLE"}, false);
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.databind.deser.impl.InnerClassProperty", actual.getClass().getName());
  assertEquals("[property 'TTLE'] {getCreatorIndex=7, getManagedReferenceName=null, getName=TTLE, getPropertyIndex=-1, hasValueDeserializer=false, hasValueTypeDeserializer=false, hasViews=false, isRequired=false, isV...#213#-2075357126", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "[property ''] {getCreatorIndex=7, getManagedReferenceName=null, getName=, getPropertyIndex=-1, hasValueDeserializer=false, hasValueTypeDeserializer=false, hasViews=false, isRequired=false, isVirtual=f...#205#1733294682", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput266() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.impl.InnerClassProperty", "com.fasterxml.jackson.databind.deser.impl.InnerClassProperty", "withName", new String[]{"java.lang.String"}, new String[]{"TTLE"}, false, 0, null, 2);
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.databind.deser.impl.InnerClassProperty", actual.getClass().getName());
  assertEquals("[property 'TTLE'] {getCreatorIndex=7, getManagedReferenceName=null, getName=TTLE, getPropertyIndex=-1, hasValueDeserializer=false, hasValueTypeDeserializer=false, hasViews=false, isRequired=false, isV...#213#-2075357126", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "[property ''] {getCreatorIndex=7, getManagedReferenceName=null, getName=, getPropertyIndex=-1, hasValueDeserializer=false, hasValueTypeDeserializer=false, hasViews=false, isRequired=false, isVirtual=f...#205#1733294682", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput267() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.impl.InnerClassProperty", "com.fasterxml.jackson.databind.deser.impl.InnerClassProperty", "withName", new String[]{"java.lang.String"}, new String[]{"UTLE"}, false, 0, null, 2);
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.databind.deser.impl.InnerClassProperty", actual.getClass().getName());
  assertEquals("[property 'UTLE'] {getCreatorIndex=7, getManagedReferenceName=null, getName=UTLE, getPropertyIndex=-1, hasValueDeserializer=false, hasValueTypeDeserializer=false, hasViews=false, isRequired=false, isV...#213#-329254822", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "[property ''] {getCreatorIndex=7, getManagedReferenceName=null, getName=, getPropertyIndex=-1, hasValueDeserializer=false, hasValueTypeDeserializer=false, hasViews=false, isRequired=false, isVirtual=f...#205#1733294682", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput268() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.impl.InnerClassProperty", "com.fasterxml.jackson.databind.deser.impl.InnerClassProperty", "withName", new String[]{"java.lang.String"}, new String[]{"UTrLE"}, false, 0, null, 2);
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.databind.deser.impl.InnerClassProperty", actual.getClass().getName());
  assertEquals("[property 'UTrLE'] {getCreatorIndex=7, getManagedReferenceName=null, getName=UTrLE, getPropertyIndex=-1, hasValueDeserializer=false, hasValueTypeDeserializer=false, hasViews=false, isRequired=false, i...#215#-2090668030", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "[property ''] {getCreatorIndex=7, getManagedReferenceName=null, getName=, getPropertyIndex=-1, hasValueDeserializer=false, hasValueTypeDeserializer=false, hasViews=false, isRequired=false, isVirtual=f...#205#1733294682", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput269() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.impl.InnerClassProperty", "com.fasterxml.jackson.databind.deser.impl.InnerClassProperty", "withName", new String[]{"java.lang.String"}, new String[]{"USrLE"}, false, 0, null, 2);
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.databind.deser.impl.InnerClassProperty", actual.getClass().getName());
  assertEquals("[property 'USrLE'] {getCreatorIndex=7, getManagedReferenceName=null, getName=USrLE, getPropertyIndex=-1, hasValueDeserializer=false, hasValueTypeDeserializer=false, hasViews=false, isRequired=false, i...#215#659453504", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "[property ''] {getCreatorIndex=7, getManagedReferenceName=null, getName=, getPropertyIndex=-1, hasValueDeserializer=false, hasValueTypeDeserializer=false, hasViews=false, isRequired=false, isVirtual=f...#205#1733294682", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput270() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.impl.InnerClassProperty", "com.fasterxml.jackson.databind.deser.impl.InnerClassProperty", "withName", new String[]{"java.lang.String"}, new String[]{"U"}, false, 0, null, 2);
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.databind.deser.impl.InnerClassProperty", actual.getClass().getName());
  assertEquals("[property 'U'] {getCreatorIndex=7, getManagedReferenceName=null, getName=U, getPropertyIndex=-1, hasValueDeserializer=false, hasValueTypeDeserializer=false, hasViews=false, isRequired=false, isVirtual...#207#540242480", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "[property ''] {getCreatorIndex=7, getManagedReferenceName=null, getName=, getPropertyIndex=-1, hasValueDeserializer=false, hasValueTypeDeserializer=false, hasViews=false, isRequired=false, isVirtual=f...#205#1733294682", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput271() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.impl.InnerClassProperty", "com.fasterxml.jackson.databind.deser.impl.InnerClassProperty", "withName", new String[]{"java.lang.String"}, new String[]{"_U"}, false, 0, null, 2);
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.databind.deser.impl.InnerClassProperty", actual.getClass().getName());
  assertEquals("[property '_U'] {getCreatorIndex=7, getManagedReferenceName=null, getName=_U, getPropertyIndex=-1, hasValueDeserializer=false, hasValueTypeDeserializer=false, hasViews=false, isRequired=false, isVirtu...#209#-325518950", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "[property ''] {getCreatorIndex=7, getManagedReferenceName=null, getName=, getPropertyIndex=-1, hasValueDeserializer=false, hasValueTypeDeserializer=false, hasViews=false, isRequired=false, isVirtual=f...#205#1733294682", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput272() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.impl.InnerClassProperty", "com.fasterxml.jackson.databind.deser.impl.InnerClassProperty", "withName", new String[]{"java.lang.String"}, new String[]{"`U"}, false, 0, null, 2);
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.databind.deser.impl.InnerClassProperty", actual.getClass().getName());
  assertEquals("[property '`U'] {getCreatorIndex=7, getManagedReferenceName=null, getName=`U, getPropertyIndex=-1, hasValueDeserializer=false, hasValueTypeDeserializer=false, hasViews=false, isRequired=false, isVirtu...#209#-591293062", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "[property ''] {getCreatorIndex=7, getManagedReferenceName=null, getName=, getPropertyIndex=-1, hasValueDeserializer=false, hasValueTypeDeserializer=false, hasViews=false, isRequired=false, isVirtual=f...#205#1733294682", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput273() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.impl.InnerClassProperty", "com.fasterxml.jackson.databind.deser.impl.InnerClassProperty", "withName", new String[]{"java.lang.String"}, new String[]{"`U"}, false, 0, null, 2), new String[][]{{"findFormatOverrides", "com.fasterxml.jackson.databind.AnnotationIntrospector", "4"}});
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.annotation.JsonFormat$Value", actual.getClass().getName());
  assertEquals("[pattern=,shape=ANY,locale=null,timezone=null] {getPattern=, getShape=ANY, hasLocale=false, hasPattern=false, hasShape=false, hasTimeZone=false}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "[property ''] {getCreatorIndex=7, getManagedReferenceName=null, getName=, getPropertyIndex=-1, hasValueDeserializer=false, hasValueTypeDeserializer=false, hasViews=false, isRequired=false, isVirtual=f...#205#1733294682", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput274() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.impl.InnerClassProperty", "com.fasterxml.jackson.databind.deser.impl.InnerClassProperty", "getWrapperName", new String[]{}, new String[]{}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.deser.impl.InnerClassProperty", "withName", "java.lang.String", "I"}}, 2);
  assertNull(actual);
  assertEquals("receiver state after the call", "[property ''] {getCreatorIndex=7, getManagedReferenceName=null, getName=, getPropertyIndex=-1, hasValueDeserializer=false, hasValueTypeDeserializer=false, hasViews=false, isRequired=false, isVirtual=f...#205#1733294682", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput275() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.impl.InnerClassProperty", "com.fasterxml.jackson.databind.deser.impl.InnerClassProperty", "getWrapperName", new String[]{}, new String[]{}, false, 3, new String[][]{}, 2);
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.databind.PropertyName", actual.getClass().getName());
  assertEquals("a {getNamespace=null, getSimpleName=a, hasNamespace=false, hasSimpleName=true, isEmpty=false}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "[property 'sample'] {getCreatorIndex=9, getManagedReferenceName=null, getName=sample, getPropertyIndex=-1, hasValueDeserializer=false, hasValueTypeDeserializer=false, hasViews=false, isRequired=true, ...#216#758135373", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput276() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.impl.InnerClassProperty", "com.fasterxml.jackson.databind.deser.impl.InnerClassProperty", "getWrapperName", new String[]{}, new String[]{}, false, 5, new String[][]{}, 2);
  assertNull(actual);
  assertEquals("receiver state after the call", "[property ''] {getCreatorIndex=12, getManagedReferenceName=null, getName=, getPropertyIndex=-1, hasValueDeserializer=false, hasValueTypeDeserializer=false, hasViews=false, isRequired=false, isVirtual=...#206#-957648002", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput277() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.impl.InnerClassProperty", "com.fasterxml.jackson.databind.deser.impl.InnerClassProperty", "_throwAsIOE", new String[]{"com.fasterxml.jackson.core.JsonParser", "java.lang.Exception"}, new String[]{"<sample:1>", "<sample:0>"}, false, 0, null, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("com.fasterxml.jackson.databind.JsonMappingException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput278() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.impl.InnerClassProperty", "com.fasterxml.jackson.databind.deser.impl.InnerClassProperty", "_throwAsIOE", new String[]{"com.fasterxml.jackson.core.JsonParser", "java.lang.Exception"}, new String[]{"<sample:0>", "<null>"}, false, 0, null, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput279() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.impl.InnerClassProperty", "com.fasterxml.jackson.databind.deser.impl.InnerClassProperty", "_throwAsIOE", new String[]{"com.fasterxml.jackson.core.JsonParser", "java.lang.Exception"}, new String[]{"<sample:5>", "<null>"}, false, 4, new String[][]{}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput280() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.impl.InnerClassProperty", "com.fasterxml.jackson.databind.deser.impl.InnerClassProperty", "setObjectIdInfo", new String[]{"com.fasterxml.jackson.databind.introspect.ObjectIdInfo"}, new String[]{"<null>"}, false, 0, null, 3);
  assertNull(actual);
  assertEquals("receiver state after the call", "[property ''] {getCreatorIndex=7, getManagedReferenceName=null, getName=, getPropertyIndex=-1, hasValueDeserializer=false, hasValueTypeDeserializer=false, hasViews=false, isRequired=false, isVirtual=f...#205#1733294682", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput281() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.impl.InnerClassProperty", "com.fasterxml.jackson.databind.deser.impl.InnerClassProperty", "getWrapperName", new String[]{}, new String[]{}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.deser.impl.InnerClassProperty", "assignIndex", "int", "1"}}, 1);
  assertNull(actual);
  assertEquals("receiver state after the call", "[property ''] {getCreatorIndex=7, getManagedReferenceName=null, getName=, getPropertyIndex=1, hasValueDeserializer=false, hasValueTypeDeserializer=false, hasViews=false, isRequired=false, isVirtual=fa...#204#1105449813", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput282() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.impl.InnerClassProperty", "com.fasterxml.jackson.databind.deser.impl.InnerClassProperty", "getWrapperName", new String[]{}, new String[]{}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.deser.impl.InnerClassProperty", "assignIndex", "int", "55"}}, 1);
  assertNull(actual);
  assertEquals("receiver state after the call", "[property ''] {getCreatorIndex=7, getManagedReferenceName=null, getName=, getPropertyIndex=55, hasValueDeserializer=false, hasValueTypeDeserializer=false, hasViews=false, isRequired=false, isVirtual=f...#205#310227798", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput283() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.impl.InnerClassProperty", "com.fasterxml.jackson.databind.deser.impl.InnerClassProperty", "getWrapperName", new String[]{}, new String[]{}, false, 1, new String[][]{{"com.fasterxml.jackson.databind.deser.impl.InnerClassProperty", "assignIndex", "int", "55"}}, 1);
  assertNull(actual);
  assertEquals("receiver state after the call", "[property ''] {getCreatorIndex=8, getManagedReferenceName=null, getName=, getPropertyIndex=55, hasValueDeserializer=false, hasValueTypeDeserializer=false, hasViews=false, isRequired=false, isVirtual=f...#205#-105099019", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput284() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.impl.InnerClassProperty", "com.fasterxml.jackson.databind.deser.impl.InnerClassProperty", "getWrapperName", new String[]{}, new String[]{}, false, 2, new String[][]{{"com.fasterxml.jackson.databind.deser.impl.InnerClassProperty", "assignIndex", "int", "55"}}, 1);
  assertNull(actual);
  assertEquals("receiver state after the call", "[property 'sample'] {getCreatorIndex=9, getManagedReferenceName=null, getName=sample, getPropertyIndex=55, hasValueDeserializer=false, hasValueTypeDeserializer=false, hasViews=false, isRequired=false,...#217#1295607252", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput285() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.impl.InnerClassProperty", "com.fasterxml.jackson.databind.deser.impl.InnerClassProperty", "hasValueTypeDeserializer", new String[]{}, new String[]{}, false, 1, new String[][]{{"com.fasterxml.jackson.databind.deser.impl.InnerClassProperty", "_throwAsIOE", "java.lang.Exception", "<sample:2>"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "[property ''] {getCreatorIndex=8, getManagedReferenceName=null, getName=, getPropertyIndex=-1, hasValueDeserializer=false, hasValueTypeDeserializer=false, hasViews=false, isRequired=false, isVirtual=f...#205#1317967865", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput286() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.impl.InnerClassProperty", "com.fasterxml.jackson.databind.deser.impl.InnerClassProperty", "hasValueTypeDeserializer", new String[]{}, new String[]{}, false, 1, new String[][]{{"com.fasterxml.jackson.databind.deser.impl.InnerClassProperty", "setManagedReferenceName", "java.lang.String", "123456789012345678901234567890"}, {"com.fasterxml.jackson.databind.deser.impl.InnerClassProperty", "_throwAsIOE", "java.lang.Exception", "<sample:2>"}, {"com.fasterxml.jackson.databind.deser.impl.InnerClassProperty", "set", "java.lang.Object,java.lang.Object", "<sample:0>", "<b:true>"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "[property ''] {getCreatorIndex=8, getManagedReferenceName=123456789012345678901234567890, getName=, getPropertyIndex=-1, hasValueDeserializer=false, hasValueTypeDeserializer=false, hasViews=false, isR...#231#757061487", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput287() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.impl.InnerClassProperty", "com.fasterxml.jackson.databind.deser.impl.InnerClassProperty", "hasValueTypeDeserializer", new String[]{}, new String[]{}, false, 1, new String[][]{{"com.fasterxml.jackson.databind.deser.impl.InnerClassProperty", "setManagedReferenceName", "java.lang.String", "123456789012345678901234567890"}, {"com.fasterxml.jackson.databind.deser.impl.InnerClassProperty", "_throwAsIOE", "java.lang.Exception", "<sample:2>"}, {"com.fasterxml.jackson.databind.deser.impl.InnerClassProperty", "set", "java.lang.Object,java.lang.Object", "<sample:0>", "<b:true>"}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "[property ''] {getCreatorIndex=8, getManagedReferenceName=123456789012345678901234567890, getName=, getPropertyIndex=-1, hasValueDeserializer=false, hasValueTypeDeserializer=false, hasViews=false, isR...#231#757061487", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput288() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.impl.InnerClassProperty", "com.fasterxml.jackson.databind.deser.impl.InnerClassProperty", "hasValueTypeDeserializer", new String[]{}, new String[]{}, false, 5, new String[][]{{"com.fasterxml.jackson.databind.deser.impl.InnerClassProperty", "setManagedReferenceName", "java.lang.String", "123456789012345678901234567890"}, {"com.fasterxml.jackson.databind.deser.impl.InnerClassProperty", "_throwAsIOE", "java.lang.Exception", "<sample:2>"}, {"com.fasterxml.jackson.databind.deser.impl.InnerClassProperty", "set", "java.lang.Object,java.lang.Object", "<sample:0>", "<b:true>"}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "[property ''] {getCreatorIndex=12, getManagedReferenceName=123456789012345678901234567890, getName=, getPropertyIndex=-1, hasValueDeserializer=false, hasValueTypeDeserializer=false, hasViews=false, is...#232#-890329420", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput289() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.impl.InnerClassProperty", "com.fasterxml.jackson.databind.deser.impl.InnerClassProperty", "hasValueTypeDeserializer", new String[]{}, new String[]{}, false, 5, new String[][]{{"com.fasterxml.jackson.databind.deser.impl.InnerClassProperty", "setManagedReferenceName", "java.lang.String", "123456789012345678901234568890"}, {"com.fasterxml.jackson.databind.deser.impl.InnerClassProperty", "_throwAsIOE", "java.lang.Exception", "<sample:2>"}, {"com.fasterxml.jackson.databind.deser.impl.InnerClassProperty", "set", "java.lang.Object,java.lang.Object", "<sample:0>", "<b:true>"}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "[property ''] {getCreatorIndex=12, getManagedReferenceName=123456789012345678901234568890, getName=, getPropertyIndex=-1, hasValueDeserializer=false, hasValueTypeDeserializer=false, hasViews=false, is...#232#75233397", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput290() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.impl.InnerClassProperty", "com.fasterxml.jackson.databind.deser.impl.InnerClassProperty", "hasValueTypeDeserializer", new String[]{}, new String[]{}, false, 7, new String[][]{{"com.fasterxml.jackson.databind.deser.impl.InnerClassProperty", "setManagedReferenceName", "java.lang.String", "123456789012345678901234568890"}, {"com.fasterxml.jackson.databind.deser.impl.InnerClassProperty", "_throwAsIOE", "java.lang.Exception", "<sample:2>"}, {"com.fasterxml.jackson.databind.deser.impl.InnerClassProperty", "set", "java.lang.Object,java.lang.Object", "<sample:0>", "<b:true>"}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "[property '<a><b>t</b></a>'] {getCreatorIndex=4, getManagedReferenceName=123456789012345678901234568890, getName=<a><b>t</b></a>, getPropertyIndex=-1, hasValueDeserializer=false, hasValueTypeDeseriali...#261#-591158888", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput291() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.impl.InnerClassProperty", "com.fasterxml.jackson.databind.deser.impl.InnerClassProperty", "hasValueTypeDeserializer", new String[]{}, new String[]{}, false, 3, new String[][]{{"com.fasterxml.jackson.databind.deser.impl.InnerClassProperty", "setManagedReferenceName", "java.lang.String", "123456789012345678901234568890"}, {"com.fasterxml.jackson.databind.deser.impl.InnerClassProperty", "_throwAsIOE", "java.lang.Exception", "<sample:2>"}, {"com.fasterxml.jackson.databind.deser.impl.InnerClassProperty", "set", "java.lang.Object,java.lang.Object", "<sample:0>", "<b:true>"}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "[property 'sample'] {getCreatorIndex=9, getManagedReferenceName=123456789012345678901234568890, getName=sample, getPropertyIndex=-1, hasValueDeserializer=false, hasValueTypeDeserializer=false, hasView...#242#436262070", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput292() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.impl.InnerClassProperty", "com.fasterxml.jackson.databind.deser.impl.InnerClassProperty", "setManagedReferenceName", new String[]{"java.lang.String"}, new String[]{"abc"}, false);
  assertNull(actual);
  assertEquals("receiver state after the call", "[property ''] {getCreatorIndex=7, getManagedReferenceName=abc, getName=, getPropertyIndex=-1, hasValueDeserializer=false, hasValueTypeDeserializer=false, hasViews=false, isRequired=false, isVirtual=fa...#204#-1002578877", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput293() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.impl.InnerClassProperty", "com.fasterxml.jackson.databind.deser.impl.InnerClassProperty", "setManagedReferenceName", new String[]{"java.lang.String"}, new String[]{"abc"}, false, 3, new String[][]{});
  assertNull(actual);
  assertEquals("receiver state after the call", "[property 'sample'] {getCreatorIndex=9, getManagedReferenceName=abc, getName=sample, getPropertyIndex=-1, hasValueDeserializer=false, hasValueTypeDeserializer=false, hasViews=false, isRequired=true, i...#215#-1381013676", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput294() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.impl.InnerClassProperty", "com.fasterxml.jackson.databind.deser.impl.InnerClassProperty", "setManagedReferenceName", new String[]{"java.lang.String"}, new String[]{"+1"}, false, 3, new String[][]{{"com.fasterxml.jackson.databind.deser.impl.InnerClassProperty", "getMetadata", ""}});
  assertNull(actual);
  assertEquals("receiver state after the call", "[property 'sample'] {getCreatorIndex=9, getManagedReferenceName=+1, getName=sample, getPropertyIndex=-1, hasValueDeserializer=false, hasValueTypeDeserializer=false, hasViews=false, isRequired=true, is...#214#1276018476", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput295() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.impl.InnerClassProperty", "com.fasterxml.jackson.databind.deser.impl.InnerClassProperty", "setManagedReferenceName", new String[]{"java.lang.String"}, new String[]{"\n"}, false, 3, new String[][]{});
  assertNull(actual);
  assertEquals("receiver state after the call", "[property 'sample'] {getCreatorIndex=9, getManagedReferenceName=\n, getName=sample, getPropertyIndex=-1, hasValueDeserializer=false, hasValueTypeDeserializer=false, hasViews=false, isRequired=true, isV...#213#200745084", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput296() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.impl.InnerClassProperty", "com.fasterxml.jackson.databind.deser.impl.InnerClassProperty", "setManagedReferenceName", new String[]{"java.lang.String"}, new String[]{""}, false, 3, new String[][]{});
  assertNull(actual);
  assertEquals("receiver state after the call", "[property 'sample'] {getCreatorIndex=9, getManagedReferenceName=, getName=sample, getPropertyIndex=-1, hasValueDeserializer=false, hasValueTypeDeserializer=false, hasViews=false, isRequired=true, isVi...#212#-290405562", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput297() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.impl.InnerClassProperty", "com.fasterxml.jackson.databind.deser.impl.InnerClassProperty", "withValueDeserializer", new String[]{"com.fasterxml.jackson.databind.JsonDeserializer"}, new String[]{"<sample:5>"}, false), new String[][]{{"getMember", "", "5"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "[property ''] {getCreatorIndex=7, getManagedReferenceName=null, getName=, getPropertyIndex=-1, hasValueDeserializer=false, hasValueTypeDeserializer=false, hasViews=false, isRequired=false, isVirtual=f...#205#1733294682", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput298() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.impl.InnerClassProperty", "com.fasterxml.jackson.databind.deser.impl.InnerClassProperty", "readResolve", new String[]{}, new String[]{}, false, 0, null, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput299() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.impl.InnerClassProperty", "com.fasterxml.jackson.databind.deser.impl.InnerClassProperty", "readResolve", new String[]{}, new String[]{}, false, 2, new String[][]{}, 3);
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.databind.deser.impl.InnerClassProperty", actual.getClass().getName());
  assertEquals("[property 'sample'] {getCreatorIndex=9, getManagedReferenceName=null, getName=sample, getPropertyIndex=-1, hasValueDeserializer=false, hasValueTypeDeserializer=false, hasViews=false, isRequired=false,...#217#-1576293160", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "[property 'sample'] {getCreatorIndex=9, getManagedReferenceName=null, getName=sample, getPropertyIndex=-1, hasValueDeserializer=false, hasValueTypeDeserializer=false, hasViews=false, isRequired=false,...#217#-1576293160", SearchInputFactory_scaffolding.receiverState());
 }
}
