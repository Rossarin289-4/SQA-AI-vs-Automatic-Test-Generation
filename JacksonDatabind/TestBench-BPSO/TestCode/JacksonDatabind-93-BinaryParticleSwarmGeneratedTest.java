package generated.algorithm;

import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;
import static org.junit.Assert.*;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class BinaryParticleSwarmGeneratedTest {
 @Test(timeout = 20000)
 public void generatedInput000() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.jsontype.impl.SubTypeValidator", "com.fasterxml.jackson.databind.jsontype.impl.SubTypeValidator", "validateSubType", new String[]{"com.fasterxml.jackson.databind.DeserializationContext", "com.fasterxml.jackson.databind.JavaType"}, new String[]{"<null>", "<sample:1>"}, false, 4, new String[][]{{"com.fasterxml.jackson.databind.jsontype.impl.SubTypeValidator", "validateSubType", "com.fasterxml.jackson.databind.DeserializationContext,com.fasterxml.jackson.databind.JavaType", "<null>", "<sample:4>"}});
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput001() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.jsontype.impl.SubTypeValidator", "com.fasterxml.jackson.databind.jsontype.impl.SubTypeValidator", "validateSubType", new String[]{"com.fasterxml.jackson.databind.DeserializationContext", "com.fasterxml.jackson.databind.JavaType"}, new String[]{"<null>", "<sample:6>"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.jsontype.impl.SubTypeValidator", "validateSubType", "com.fasterxml.jackson.databind.DeserializationContext,com.fasterxml.jackson.databind.JavaType", "<sample:2>", "<sample:6>"}});
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput002() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.jsontype.impl.SubTypeValidator", "com.fasterxml.jackson.databind.jsontype.impl.SubTypeValidator", "validateSubType", new String[]{"com.fasterxml.jackson.databind.DeserializationContext", "com.fasterxml.jackson.databind.JavaType"}, new String[]{"<sample:0>", "<sample:0>"}, false, 0, null, 1);
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput003() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.jsontype.impl.SubTypeValidator", "com.fasterxml.jackson.databind.jsontype.impl.SubTypeValidator", "instance", new String[]{}, new String[]{}, true, 0, null, 3);
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.databind.jsontype.impl.SubTypeValidator", actual.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput004() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.jsontype.impl.SubTypeValidator", "com.fasterxml.jackson.databind.jsontype.impl.SubTypeValidator", "instance", new String[]{}, new String[]{}, true);
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.databind.jsontype.impl.SubTypeValidator", actual.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput005() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.jsontype.impl.SubTypeValidator", "com.fasterxml.jackson.databind.jsontype.impl.SubTypeValidator", "validateSubType", new String[]{"com.fasterxml.jackson.databind.DeserializationContext", "com.fasterxml.jackson.databind.JavaType"}, new String[]{"<sample:3>", "<sample:5>"}, false, 0, null, 2);
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput006() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.jsontype.impl.SubTypeValidator", "com.fasterxml.jackson.databind.jsontype.impl.SubTypeValidator", "instance", new String[]{}, new String[]{}, true, 0, null, 1);
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.databind.jsontype.impl.SubTypeValidator", actual.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput007() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.jsontype.impl.SubTypeValidator", "com.fasterxml.jackson.databind.jsontype.impl.SubTypeValidator", "instance", new String[]{}, new String[]{}, true, 0, null, 2), new String[][]{{"validateSubType", "com.fasterxml.jackson.databind.DeserializationContext,com.fasterxml.jackson.databind.JavaType", "1"}});
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.databind.jsontype.impl.SubTypeValidator", actual.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput008() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.jsontype.impl.SubTypeValidator", "com.fasterxml.jackson.databind.jsontype.impl.SubTypeValidator", "validateSubType", new String[]{"com.fasterxml.jackson.databind.DeserializationContext", "com.fasterxml.jackson.databind.JavaType"}, new String[]{"<sample:1>", "<sample:4>"}, false, 0, null, 3);
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput009() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.jsontype.impl.SubTypeValidator", "com.fasterxml.jackson.databind.jsontype.impl.SubTypeValidator", "validateSubType", new String[]{"com.fasterxml.jackson.databind.DeserializationContext", "com.fasterxml.jackson.databind.JavaType"}, new String[]{"<sample:2>", "<null>"}, false); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput010() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.jsontype.impl.SubTypeValidator", "com.fasterxml.jackson.databind.jsontype.impl.SubTypeValidator", "validateSubType", new String[]{"com.fasterxml.jackson.databind.DeserializationContext", "com.fasterxml.jackson.databind.JavaType"}, new String[]{"<sample:7>", "<null>"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.jsontype.impl.SubTypeValidator", "validateSubType", "com.fasterxml.jackson.databind.DeserializationContext,com.fasterxml.jackson.databind.JavaType", "<sample:7>", "<sample:6>"}}, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput011() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.jsontype.impl.SubTypeValidator", "com.fasterxml.jackson.databind.jsontype.impl.SubTypeValidator", "validateSubType", new String[]{"com.fasterxml.jackson.databind.DeserializationContext", "com.fasterxml.jackson.databind.JavaType"}, new String[]{"<sample:7>", "<null>"}, false, 5, new String[][]{}, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput012() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.jsontype.impl.SubTypeValidator", "com.fasterxml.jackson.databind.jsontype.impl.SubTypeValidator", "validateSubType", new String[]{"com.fasterxml.jackson.databind.DeserializationContext", "com.fasterxml.jackson.databind.JavaType"}, new String[]{"<sample:2>", "<null>"}, false, 4, new String[][]{}, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
}
