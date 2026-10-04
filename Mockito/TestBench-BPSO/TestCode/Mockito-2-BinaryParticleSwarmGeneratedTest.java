package generated.algorithm;

import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;
import static org.junit.Assert.*;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class BinaryParticleSwarmGeneratedTest {
 @Test(timeout = 20000)
 public void generatedInput000() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.mockito.internal.util.Timer", "org.mockito.internal.util.Timer", "isCounting", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.mockito.internal.util.Timer", "isCounting", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{isCounting=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput001() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.mockito.internal.util.Timer", "org.mockito.internal.util.Timer", "start", new String[]{}, new String[]{}, false, 6, new String[][]{{"org.mockito.internal.util.Timer", "start", ""}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{isCounting=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput002() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.mockito.internal.util.Timer", "org.mockito.internal.util.Timer", "isCounting", new String[]{}, new String[]{}, false, 0, null, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{isCounting=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput003() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.mockito.internal.util.Timer", "org.mockito.internal.util.Timer", "start", new String[]{}, new String[]{}, false, 4, new String[][]{{"org.mockito.internal.util.Timer", "isCounting", ""}}, 2);
  assertNull(actual);
  assertEquals("receiver state after the call", "{isCounting=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput004() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.mockito.internal.util.Timer", "org.mockito.internal.util.Timer", "start", new String[]{}, new String[]{}, false, 7, new String[][]{{"org.mockito.internal.util.Timer", "isCounting", ""}, {"org.mockito.internal.util.Timer", "start", ""}}, 3);
  assertNull(actual);
  assertEquals("receiver state after the call", "{isCounting=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput005() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.mockito.internal.util.Timer", "org.mockito.internal.util.Timer", "start", new String[]{}, new String[]{}, false, 4, new String[][]{{"org.mockito.internal.util.Timer", "isCounting", ""}}, 1);
  assertNull(actual);
  assertEquals("receiver state after the call", "{isCounting=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput006() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.mockito.internal.util.Timer", "org.mockito.internal.util.Timer", "isCounting", new String[]{}, new String[]{}, false, 3, new String[][]{});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
  assertEquals("receiver state after the call", "{isCounting=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput007() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.mockito.internal.util.Timer", "org.mockito.internal.util.Timer", "isCounting", new String[]{}, new String[]{}, false, 1, new String[][]{}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{isCounting=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput008() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.mockito.internal.util.Timer", "org.mockito.internal.util.Timer", "isCounting", new String[]{}, new String[]{}, false, 3, new String[][]{{"org.mockito.internal.util.Timer", "isCounting", ""}, {"org.mockito.internal.util.Timer", "isCounting", ""}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
  assertEquals("receiver state after the call", "{isCounting=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput009() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.mockito.internal.util.Timer", "org.mockito.internal.util.Timer", "isCounting", new String[]{}, new String[]{}, false, 5, new String[][]{{"org.mockito.internal.util.Timer", "start", ""}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
  assertEquals("receiver state after the call", "{isCounting=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput010() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.mockito.internal.util.Timer", "org.mockito.internal.util.Timer", "isCounting", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.mockito.internal.util.Timer", "isCounting", ""}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{isCounting=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput011() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.mockito.internal.util.Timer", "org.mockito.internal.util.Timer", "start", new String[]{}, new String[]{}, false, 1, new String[][]{}, 2);
  assertNull(actual);
  assertEquals("receiver state after the call", "{isCounting=false}", SearchInputFactory_scaffolding.receiverState());
 }
}
