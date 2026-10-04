package generated.algorithm;

import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;
import static org.junit.Assert.*;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class SimulatedAnnealingGeneratedTest {
 @Test(timeout = 20000)
 public void generatedInput000() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.impl.JavaUtilCollectionsDeserializers", "com.fasterxml.jackson.databind.deser.impl.JavaUtilCollectionsDeserializers", "findForCollection", new String[]{"com.fasterxml.jackson.databind.DeserializationContext", "com.fasterxml.jackson.databind.JavaType"}, new String[]{"<sample:5>", "<sample:0>"}, true);
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput001() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.impl.JavaUtilCollectionsDeserializers", "com.fasterxml.jackson.databind.deser.impl.JavaUtilCollectionsDeserializers", "findForCollection", new String[]{"com.fasterxml.jackson.databind.DeserializationContext", "com.fasterxml.jackson.databind.JavaType"}, new String[]{"<sample:4>", "<null>"}, true); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput002() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.impl.JavaUtilCollectionsDeserializers", "com.fasterxml.jackson.databind.deser.impl.JavaUtilCollectionsDeserializers", "findForMap", new String[]{"com.fasterxml.jackson.databind.DeserializationContext", "com.fasterxml.jackson.databind.JavaType"}, new String[]{"<sample:1>", "<null>"}, true, 0, null, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput003() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.impl.JavaUtilCollectionsDeserializers", "com.fasterxml.jackson.databind.deser.impl.JavaUtilCollectionsDeserializers", "findForCollection", new String[]{"com.fasterxml.jackson.databind.DeserializationContext", "com.fasterxml.jackson.databind.JavaType"}, new String[]{"<sample:4>", "<sample:4>"}, true, 0, null, 3);
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput004() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.impl.JavaUtilCollectionsDeserializers", "com.fasterxml.jackson.databind.deser.impl.JavaUtilCollectionsDeserializers", "findForMap", new String[]{"com.fasterxml.jackson.databind.DeserializationContext", "com.fasterxml.jackson.databind.JavaType"}, new String[]{"<sample:6>", "<null>"}, true); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput005() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.impl.JavaUtilCollectionsDeserializers", "com.fasterxml.jackson.databind.deser.impl.JavaUtilCollectionsDeserializers", "findForMap", new String[]{"com.fasterxml.jackson.databind.DeserializationContext", "com.fasterxml.jackson.databind.JavaType"}, new String[]{"<sample:2>", "<sample:7>"}, true);
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput006() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.impl.JavaUtilCollectionsDeserializers", "com.fasterxml.jackson.databind.deser.impl.JavaUtilCollectionsDeserializers", "converter", new String[]{"int", "com.fasterxml.jackson.databind.JavaType", "java.lang.Class"}, new String[]{"10", "<sample:0>", "<empty>"}, true);
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.databind.deser.impl.JavaUtilCollectionsDeserializers$JavaUtilCollectionsConverter", actual.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput007() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.impl.JavaUtilCollectionsDeserializers", "com.fasterxml.jackson.databind.deser.impl.JavaUtilCollectionsDeserializers", "converter", new String[]{"int", "com.fasterxml.jackson.databind.JavaType", "java.lang.Class"}, new String[]{"10", "<sample:0>", "<empty>"}, true), new String[][]{{"getInputType", "com.fasterxml.jackson.databind.type.TypeFactory", "0"}});
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput008() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.impl.JavaUtilCollectionsDeserializers", "com.fasterxml.jackson.databind.deser.impl.JavaUtilCollectionsDeserializers", "converter", new String[]{"int", "com.fasterxml.jackson.databind.JavaType", "java.lang.Class"}, new String[]{"8", "<sample:7>", "<empty>"}, true), new String[][]{{"convert", "java.lang.Object", "7"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput009() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.impl.JavaUtilCollectionsDeserializers", "com.fasterxml.jackson.databind.deser.impl.JavaUtilCollectionsDeserializers", "converter", new String[]{"int", "com.fasterxml.jackson.databind.JavaType", "java.lang.Class"}, new String[]{"1073741868", "<sample:6>", "<sample:0>"}, true, 0, null, 2), new String[][]{{"convert", "java.lang.Object", "7"}, {"getInputType", "com.fasterxml.jackson.databind.type.TypeFactory", "5"}});
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput010() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.impl.JavaUtilCollectionsDeserializers", "com.fasterxml.jackson.databind.deser.impl.JavaUtilCollectionsDeserializers", "converter", new String[]{"int", "com.fasterxml.jackson.databind.JavaType", "java.lang.Class"}, new String[]{"1073741868", "<sample:7>", "<null>"}, true, 0, null, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput011() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.impl.JavaUtilCollectionsDeserializers", "com.fasterxml.jackson.databind.deser.impl.JavaUtilCollectionsDeserializers", "converter", new String[]{"int", "com.fasterxml.jackson.databind.JavaType", "java.lang.Class"}, new String[]{"2147483647", "<sample:4>", "<sample:0>"}, true, 0, null, 2), new String[][]{{"convert", "java.lang.Object", "7"}, {"getInputType", "com.fasterxml.jackson.databind.type.TypeFactory", "5"}, {"getOutputType", "com.fasterxml.jackson.databind.type.TypeFactory", "2"}});
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput012() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.impl.JavaUtilCollectionsDeserializers", "com.fasterxml.jackson.databind.deser.impl.JavaUtilCollectionsDeserializers", "converter", new String[]{"int", "com.fasterxml.jackson.databind.JavaType", "java.lang.Class"}, new String[]{"0", "<sample:5>", "<sample:1>"}, true), new String[][]{{"getOutputType", "com.fasterxml.jackson.databind.type.TypeFactory", "6"}, {"convert", "java.lang.Object", "0"}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("a", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput013() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.impl.JavaUtilCollectionsDeserializers", "com.fasterxml.jackson.databind.deser.impl.JavaUtilCollectionsDeserializers", "findForCollection", new String[]{"com.fasterxml.jackson.databind.DeserializationContext", "com.fasterxml.jackson.databind.JavaType"}, new String[]{"<sample:5>", "<sample:5>"}, true, 0, null, 2);
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput014() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.impl.JavaUtilCollectionsDeserializers", "com.fasterxml.jackson.databind.deser.impl.JavaUtilCollectionsDeserializers", "converter", new String[]{"int", "com.fasterxml.jackson.databind.JavaType", "java.lang.Class"}, new String[]{"2", "<sample:3>", "<sample:0>"}, true), new String[][]{{"getInputType", "com.fasterxml.jackson.databind.type.TypeFactory", "1"}, {"convert", "java.lang.Object", "7"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.ClassCastException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput015() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.impl.JavaUtilCollectionsDeserializers", "com.fasterxml.jackson.databind.deser.impl.JavaUtilCollectionsDeserializers", "converter", new String[]{"int", "com.fasterxml.jackson.databind.JavaType", "java.lang.Class"}, new String[]{"2147483647", "<sample:5>", "<sample:5>"}, true), new String[][]{{"getOutputType", "com.fasterxml.jackson.databind.type.TypeFactory", "3"}});
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.databind.type.PlaceholderForType", actual.getClass().getName());
  assertEquals("$0 {getErasedSignature=$0, getGenericSignature=$0, getTypeName=$0, hasContentType=true, hasGenericTypes=false, hasHandlers=false, hasValueHandler=false, isAbstract=false, isArrayType=false, isCollecti...#332#-877153026", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput016() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.impl.JavaUtilCollectionsDeserializers", "com.fasterxml.jackson.databind.deser.impl.JavaUtilCollectionsDeserializers", "converter", new String[]{"int", "com.fasterxml.jackson.databind.JavaType", "java.lang.Class"}, new String[]{"-2147483648", "<null>", "<sample:0>"}, true); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput017() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.impl.JavaUtilCollectionsDeserializers", "com.fasterxml.jackson.databind.deser.impl.JavaUtilCollectionsDeserializers", "converter", new String[]{"int", "com.fasterxml.jackson.databind.JavaType", "java.lang.Class"}, new String[]{"0", "<sample:0>", "<sample:0>"}, true), new String[][]{{"convert", "java.lang.Object", "5"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput018() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.impl.JavaUtilCollectionsDeserializers", "com.fasterxml.jackson.databind.deser.impl.JavaUtilCollectionsDeserializers", "converter", new String[]{"int", "com.fasterxml.jackson.databind.JavaType", "java.lang.Class"}, new String[]{"-536870912", "<sample:4>", "<sample:3>"}, true), new String[][]{{"convert", "java.lang.Object", "0"}, {"getInputType", "com.fasterxml.jackson.databind.type.TypeFactory", "3"}, {"convert", "java.lang.Object", "3"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("2", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput019() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.impl.JavaUtilCollectionsDeserializers", "com.fasterxml.jackson.databind.deser.impl.JavaUtilCollectionsDeserializers", "findForMap", new String[]{"com.fasterxml.jackson.databind.DeserializationContext", "com.fasterxml.jackson.databind.JavaType"}, new String[]{"<sample:3>", "<null>"}, true, 0, null, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput020() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.impl.JavaUtilCollectionsDeserializers", "com.fasterxml.jackson.databind.deser.impl.JavaUtilCollectionsDeserializers", "findForMap", new String[]{"com.fasterxml.jackson.databind.DeserializationContext", "com.fasterxml.jackson.databind.JavaType"}, new String[]{"<sample:0>", "<sample:0>"}, true, 0, null, 3);
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput021() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.impl.JavaUtilCollectionsDeserializers", "com.fasterxml.jackson.databind.deser.impl.JavaUtilCollectionsDeserializers", "findForMap", new String[]{"com.fasterxml.jackson.databind.DeserializationContext", "com.fasterxml.jackson.databind.JavaType"}, new String[]{"<sample:1>", "<null>"}, true, 0, null, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput022() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.impl.JavaUtilCollectionsDeserializers", "com.fasterxml.jackson.databind.deser.impl.JavaUtilCollectionsDeserializers", "findForCollection", new String[]{"com.fasterxml.jackson.databind.DeserializationContext", "com.fasterxml.jackson.databind.JavaType"}, new String[]{"<sample:0>", "<null>"}, true, 0, null, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput023() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.impl.JavaUtilCollectionsDeserializers", "com.fasterxml.jackson.databind.deser.impl.JavaUtilCollectionsDeserializers", "converter", new String[]{"int", "com.fasterxml.jackson.databind.JavaType", "java.lang.Class"}, new String[]{"-131116", "<sample:7>", "<sample:0>"}, true), new String[][]{{"convert", "java.lang.Object", "6"}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput024() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.impl.JavaUtilCollectionsDeserializers", "com.fasterxml.jackson.databind.deser.impl.JavaUtilCollectionsDeserializers", "converter", new String[]{"int", "com.fasterxml.jackson.databind.JavaType", "java.lang.Class"}, new String[]{"-131106", "<sample:3>", "<sample:5>"}, true, 0, null, 3), new String[][]{{"convert", "java.lang.Object", "6"}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput025() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.impl.JavaUtilCollectionsDeserializers", "com.fasterxml.jackson.databind.deser.impl.JavaUtilCollectionsDeserializers", "findForMap", new String[]{"com.fasterxml.jackson.databind.DeserializationContext", "com.fasterxml.jackson.databind.JavaType"}, new String[]{"<sample:3>", "<sample:6>"}, true, 0, null, 2);
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput026() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.impl.JavaUtilCollectionsDeserializers", "com.fasterxml.jackson.databind.deser.impl.JavaUtilCollectionsDeserializers", "findForCollection", new String[]{"com.fasterxml.jackson.databind.DeserializationContext", "com.fasterxml.jackson.databind.JavaType"}, new String[]{"<sample:0>", "<sample:7>"}, true, 0, null, 1);
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput027() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.impl.JavaUtilCollectionsDeserializers", "com.fasterxml.jackson.databind.deser.impl.JavaUtilCollectionsDeserializers", "converter", new String[]{"int", "com.fasterxml.jackson.databind.JavaType", "java.lang.Class"}, new String[]{"-2147483648", "<sample:6>", "<empty>"}, true, 0, null, 2), new String[][]{{"convert", "java.lang.Object", "3"}, {"getInputType", "com.fasterxml.jackson.databind.type.TypeFactory", "2"}, {"convert", "java.lang.Object", "2"}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("b", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput028() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.impl.JavaUtilCollectionsDeserializers", "com.fasterxml.jackson.databind.deser.impl.JavaUtilCollectionsDeserializers", "converter", new String[]{"int", "com.fasterxml.jackson.databind.JavaType", "java.lang.Class"}, new String[]{"62", "<sample:1>", "<sample:2>"}, true, 0, null, 2), new String[][]{{"convert", "java.lang.Object", "3"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("2", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput029() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.impl.JavaUtilCollectionsDeserializers", "com.fasterxml.jackson.databind.deser.impl.JavaUtilCollectionsDeserializers", "converter", new String[]{"int", "com.fasterxml.jackson.databind.JavaType", "java.lang.Class"}, new String[]{"1", "<sample:4>", "<sample:2>"}, true, 0, null, 2), new String[][]{{"convert", "java.lang.Object", "3"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.ClassCastException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput030() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.impl.JavaUtilCollectionsDeserializers", "com.fasterxml.jackson.databind.deser.impl.JavaUtilCollectionsDeserializers", "converter", new String[]{"int", "com.fasterxml.jackson.databind.JavaType", "java.lang.Class"}, new String[]{"3", "<sample:2>", "<sample:4>"}, true, 0, null, 3);
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.databind.deser.impl.JavaUtilCollectionsDeserializers$JavaUtilCollectionsConverter", actual.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput031() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.impl.JavaUtilCollectionsDeserializers", "com.fasterxml.jackson.databind.deser.impl.JavaUtilCollectionsDeserializers", "findForCollection", new String[]{"com.fasterxml.jackson.databind.DeserializationContext", "com.fasterxml.jackson.databind.JavaType"}, new String[]{"<sample:5>", "<null>"}, true, 0, null, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput032() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.impl.JavaUtilCollectionsDeserializers", "com.fasterxml.jackson.databind.deser.impl.JavaUtilCollectionsDeserializers", "converter", new String[]{"int", "com.fasterxml.jackson.databind.JavaType", "java.lang.Class"}, new String[]{"3", "<sample:3>", "<null>"}, true, 0, null, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput033() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.impl.JavaUtilCollectionsDeserializers", "com.fasterxml.jackson.databind.deser.impl.JavaUtilCollectionsDeserializers", "findForCollection", new String[]{"com.fasterxml.jackson.databind.DeserializationContext", "com.fasterxml.jackson.databind.JavaType"}, new String[]{"<sample:0>", "<null>"}, true, 0, null, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput034() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.impl.JavaUtilCollectionsDeserializers", "com.fasterxml.jackson.databind.deser.impl.JavaUtilCollectionsDeserializers", "converter", new String[]{"int", "com.fasterxml.jackson.databind.JavaType", "java.lang.Class"}, new String[]{"-2147483648", "<sample:1>", "<sample:3>"}, true), new String[][]{{"convert", "java.lang.Object", "3"}, {"convert", "java.lang.Object", "4"}, {"convert", "java.lang.Object", "2"}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("b", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput035() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.impl.JavaUtilCollectionsDeserializers", "com.fasterxml.jackson.databind.deser.impl.JavaUtilCollectionsDeserializers", "findForMap", new String[]{"com.fasterxml.jackson.databind.DeserializationContext", "com.fasterxml.jackson.databind.JavaType"}, new String[]{"<sample:7>", "<sample:7>"}, true, 0, null, 1);
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput036() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.impl.JavaUtilCollectionsDeserializers", "com.fasterxml.jackson.databind.deser.impl.JavaUtilCollectionsDeserializers", "converter", new String[]{"int", "com.fasterxml.jackson.databind.JavaType", "java.lang.Class"}, new String[]{"7", "<sample:5>", "<sample:1>"}, true, 0, null, 2);
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.databind.deser.impl.JavaUtilCollectionsDeserializers$JavaUtilCollectionsConverter", actual.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput037() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.impl.JavaUtilCollectionsDeserializers", "com.fasterxml.jackson.databind.deser.impl.JavaUtilCollectionsDeserializers", "converter", new String[]{"int", "com.fasterxml.jackson.databind.JavaType", "java.lang.Class"}, new String[]{"1", "<sample:5>", "<sample:1>"}, true, 0, null, 1);
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.databind.deser.impl.JavaUtilCollectionsDeserializers$JavaUtilCollectionsConverter", actual.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput038() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.impl.JavaUtilCollectionsDeserializers", "com.fasterxml.jackson.databind.deser.impl.JavaUtilCollectionsDeserializers", "converter", new String[]{"int", "com.fasterxml.jackson.databind.JavaType", "java.lang.Class"}, new String[]{"5", "<sample:1>", "<sample:1>"}, true, 0, null, 3), new String[][]{{"getOutputType", "com.fasterxml.jackson.databind.type.TypeFactory", "0"}});
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput039() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.impl.JavaUtilCollectionsDeserializers", "com.fasterxml.jackson.databind.deser.impl.JavaUtilCollectionsDeserializers", "converter", new String[]{"int", "com.fasterxml.jackson.databind.JavaType", "java.lang.Class"}, new String[]{"-6", "<null>", "<sample:3>"}, true, 0, null, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput040() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.impl.JavaUtilCollectionsDeserializers", "com.fasterxml.jackson.databind.deser.impl.JavaUtilCollectionsDeserializers", "converter", new String[]{"int", "com.fasterxml.jackson.databind.JavaType", "java.lang.Class"}, new String[]{"7", "<sample:7>", "<sample:1>"}, true, 0, null, 1), new String[][]{{"convert", "java.lang.Object", "4"}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("key", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput041() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.impl.JavaUtilCollectionsDeserializers", "com.fasterxml.jackson.databind.deser.impl.JavaUtilCollectionsDeserializers", "converter", new String[]{"int", "com.fasterxml.jackson.databind.JavaType", "java.lang.Class"}, new String[]{"16", "<sample:4>", "<sample:1>"}, true, 0, null, 3), new String[][]{{"convert", "java.lang.Object", "7"}, {"getOutputType", "com.fasterxml.jackson.databind.type.TypeFactory", "1"}, {"convert", "java.lang.Object", "1"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("1", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput042() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.impl.JavaUtilCollectionsDeserializers", "com.fasterxml.jackson.databind.deser.impl.JavaUtilCollectionsDeserializers", "converter", new String[]{"int", "com.fasterxml.jackson.databind.JavaType", "java.lang.Class"}, new String[]{"-2147483648", "<sample:0>", "<sample:0>"}, true, 0, null, 3), new String[][]{{"getInputType", "com.fasterxml.jackson.databind.type.TypeFactory", "1"}, {"convert", "java.lang.Object", "0"}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("a", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput043() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.impl.JavaUtilCollectionsDeserializers", "com.fasterxml.jackson.databind.deser.impl.JavaUtilCollectionsDeserializers", "converter", new String[]{"int", "com.fasterxml.jackson.databind.JavaType", "java.lang.Class"}, new String[]{"4194234", "<sample:3>", "<sample:4>"}, true, 0, null, 1), new String[][]{{"convert", "java.lang.Object", "3"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("2", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput044() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.impl.JavaUtilCollectionsDeserializers", "com.fasterxml.jackson.databind.deser.impl.JavaUtilCollectionsDeserializers", "converter", new String[]{"int", "com.fasterxml.jackson.databind.JavaType", "java.lang.Class"}, new String[]{"10", "<sample:8>", "<sample:5>"}, true, 0, null, 2), new String[][]{{"getOutputType", "com.fasterxml.jackson.databind.type.TypeFactory", "6"}});
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.databind.type.PlaceholderForType", actual.getClass().getName());
  assertEquals("$0 {getErasedSignature=$0, getGenericSignature=$0, getTypeName=$0, hasContentType=true, hasGenericTypes=false, hasHandlers=false, hasValueHandler=false, isAbstract=false, isArrayType=false, isCollecti...#332#-877153026", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput045() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.impl.JavaUtilCollectionsDeserializers", "com.fasterxml.jackson.databind.deser.impl.JavaUtilCollectionsDeserializers", "converter", new String[]{"int", "com.fasterxml.jackson.databind.JavaType", "java.lang.Class"}, new String[]{"5", "<sample:6>", "<sample:1>"}, true, 0, null, 3), new String[][]{{"convert", "java.lang.Object", "0"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.ClassCastException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput046() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.impl.JavaUtilCollectionsDeserializers", "com.fasterxml.jackson.databind.deser.impl.JavaUtilCollectionsDeserializers", "converter", new String[]{"int", "com.fasterxml.jackson.databind.JavaType", "java.lang.Class"}, new String[]{"12", "<sample:4>", "<sample:2>"}, true, 0, null, 1), new String[][]{{"getOutputType", "com.fasterxml.jackson.databind.type.TypeFactory", "4"}, {"getOutputType", "com.fasterxml.jackson.databind.type.TypeFactory", "7"}, {"getOutputType", "com.fasterxml.jackson.databind.type.TypeFactory", "6"}});
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput047() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.impl.JavaUtilCollectionsDeserializers", "com.fasterxml.jackson.databind.deser.impl.JavaUtilCollectionsDeserializers", "converter", new String[]{"int", "com.fasterxml.jackson.databind.JavaType", "java.lang.Class"}, new String[]{"42", "<sample:9>", "<sample:0>"}, true, 0, null, 1), new String[][]{{"getInputType", "com.fasterxml.jackson.databind.type.TypeFactory", "4"}, {"withTypeHandler", "java.lang.Object", "7"}, {"withContentValueHandler", "java.lang.Object", "6"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.UnsupportedOperationException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput048() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.impl.JavaUtilCollectionsDeserializers", "com.fasterxml.jackson.databind.deser.impl.JavaUtilCollectionsDeserializers", "converter", new String[]{"int", "com.fasterxml.jackson.databind.JavaType", "java.lang.Class"}, new String[]{"-11", "<sample:3>", "<sample:4>"}, true, 0, null, 1), new String[][]{{"convert", "java.lang.Object", "0"}, {"convert", "java.lang.Object", "6"}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput049() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.impl.JavaUtilCollectionsDeserializers", "com.fasterxml.jackson.databind.deser.impl.JavaUtilCollectionsDeserializers", "converter", new String[]{"int", "com.fasterxml.jackson.databind.JavaType", "java.lang.Class"}, new String[]{"-1073741824", "<sample:3>", "<sample:0>"}, true, 0, null, 1), new String[][]{{"getInputType", "com.fasterxml.jackson.databind.type.TypeFactory", "5"}, {"convert", "java.lang.Object", "7"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput050() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.impl.JavaUtilCollectionsDeserializers", "com.fasterxml.jackson.databind.deser.impl.JavaUtilCollectionsDeserializers", "converter", new String[]{"int", "com.fasterxml.jackson.databind.JavaType", "java.lang.Class"}, new String[]{"4", "<sample:0>", "<sample:4>"}, true, 0, null, 2), new String[][]{{"getInputType", "com.fasterxml.jackson.databind.type.TypeFactory", "3"}, {"isFinal", "", "0"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput051() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.impl.JavaUtilCollectionsDeserializers", "com.fasterxml.jackson.databind.deser.impl.JavaUtilCollectionsDeserializers", "converter", new String[]{"int", "com.fasterxml.jackson.databind.JavaType", "java.lang.Class"}, new String[]{"-35", "<sample:5>", "<sample:3>"}, true, 0, null, 3), new String[][]{{"getInputType", "com.fasterxml.jackson.databind.type.TypeFactory", "4"}, {"convert", "java.lang.Object", "4"}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("key", String.valueOf(actual));
 }
}
