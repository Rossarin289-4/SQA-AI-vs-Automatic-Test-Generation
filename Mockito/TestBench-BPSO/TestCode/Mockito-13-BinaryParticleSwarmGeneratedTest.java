package generated.algorithm;

import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;
import static org.junit.Assert.*;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class BinaryParticleSwarmGeneratedTest {
 @Test(timeout = 20000)
 public void generatedInput000() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.mockito.internal.MockHandler", "org.mockito.internal.MockHandler", "getMockSettings", new String[]{}, new String[]{}, false, 1, new String[][]{});
  assertNotNull(actual);
  assertEquals("org.mockito.internal.creation.MockSettingsImpl", actual.getClass().getName());
  assertEquals("{getExtraInterfaces=null, isSerializable=false}", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput001() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.mockito.internal.MockHandler", "org.mockito.internal.MockHandler", "getMockSettings", new String[]{}, new String[]{}, false, 0, null, 2), new String[][]{{"initiateMockName", "java.lang.Class", "3"}});
  assertNotNull(actual);
  assertEquals("org.mockito.internal.creation.MockSettingsImpl", actual.getClass().getName());
  assertEquals("{getExtraInterfaces=null, isSerializable=false}", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput002() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.mockito.internal.MockHandler", "org.mockito.internal.MockHandler", "getInvocationContainer", new String[]{}, new String[]{}, false);
  assertNotNull(actual);
  assertEquals("org.mockito.internal.stubbing.InvocationContainerImpl", actual.getClass().getName());
  assertEquals("invocationForStubbing: null {hasAnswersForStubbing=false}", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput003() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.mockito.internal.MockHandler", "org.mockito.internal.MockHandler", "handle", new String[]{"org.mockito.internal.invocation.Invocation"}, new String[]{"<sample:1>"}, false); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput004() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.mockito.internal.MockHandler", "org.mockito.internal.MockHandler", "getInvocationContainer", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.mockito.internal.MockHandler", "setAnswersForStubbing", "java.util.List", "<sample:0>"}}), new String[][]{{"getStubbedInvocations", "", "5"}});
  assertNotNull(actual);
  assertEquals("java.util.LinkedList", actual.getClass().getName());
  assertEquals("[]", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput005() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.mockito.internal.MockHandler", "org.mockito.internal.MockHandler", "getMockSettings", new String[]{}, new String[]{}, false), new String[][]{{"isSerializable", "", "1"}, {"getExtraInterfaces", "", "5"}, {"extraInterfaces", "java.lang.Class[]", "0"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("org.mockito.exceptions.base.MockitoException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput006() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.mockito.internal.MockHandler", "org.mockito.internal.MockHandler", "handle", new String[]{"org.mockito.internal.invocation.Invocation"}, new String[]{"<sample:5>"}, false, 0, new String[][]{{"org.mockito.internal.MockHandler", "voidMethodStubbable", "java.lang.Object", "<s:4>"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput007() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.mockito.internal.MockHandler", "org.mockito.internal.MockHandler", "getMockSettings", new String[]{}, new String[]{}, false), new String[][]{{"isSerializable", "", "1"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput008() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.mockito.internal.MockHandler", "org.mockito.internal.MockHandler", "voidMethodStubbable", new String[]{"java.lang.Object"}, new String[]{"<s:5>"}, false, 6, new String[][]{});
  assertNotNull(actual);
  assertEquals("org.mockito.internal.stubbing.VoidMethodStubbableImpl", actual.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput009() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.mockito.internal.MockHandler", "org.mockito.internal.MockHandler", "handle", new String[]{"org.mockito.internal.invocation.Invocation"}, new String[]{"<null>"}, false, 0, new String[][]{{"org.mockito.internal.MockHandler", "voidMethodStubbable", "java.lang.Object", "<s:}b>"}, {"org.mockito.internal.MockHandler", "setAnswersForStubbing", "java.util.List", "<sample:3>"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput010() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.mockito.internal.MockHandler", "org.mockito.internal.MockHandler", "setAnswersForStubbing", new String[]{"java.util.List"}, new String[]{"<sample:0>"}, false, 5, new String[][]{{"org.mockito.internal.MockHandler", "getInvocationContainer", ""}});
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput011() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.mockito.internal.MockHandler", "org.mockito.internal.MockHandler", "getInvocationContainer", new String[]{}, new String[]{}, false, 6, new String[][]{{"org.mockito.internal.MockHandler", "voidMethodStubbable", "java.lang.Object", "<d:3.0>"}}, 3), new String[][]{{"findAnswerFor", "org.mockito.internal.invocation.Invocation", "3"}});
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput012() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.mockito.internal.MockHandler", "org.mockito.internal.MockHandler", "setAnswersForStubbing", new String[]{"java.util.List"}, new String[]{"<null>"}, false, 4, new String[][]{}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput013() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.mockito.internal.MockHandler", "org.mockito.internal.MockHandler", "getMockSettings", new String[]{}, new String[]{}, false, 7, new String[][]{}), new String[][]{{"getExtraInterfaces", "", "1"}, {"getExtraInterfaces", "", "1"}});
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput014() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.mockito.internal.MockHandler", "org.mockito.internal.MockHandler", "getMockSettings", new String[]{}, new String[]{}, false, 1, new String[][]{}), new String[][]{{"getMockName", "", "4"}});
  assertNotNull(actual);
  assertEquals("org.mockito.internal.util.MockName", actual.getClass().getName());
  assertEquals("string {isSurrogate=true}", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput015() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.mockito.internal.MockHandler", "org.mockito.internal.MockHandler", "getInvocationContainer", new String[]{}, new String[]{}, false), new String[][]{{"findAnswerFor", "org.mockito.internal.invocation.Invocation", "6"}});
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput016() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.mockito.internal.MockHandler", "org.mockito.internal.MockHandler", "handle", new String[]{"org.mockito.internal.invocation.Invocation"}, new String[]{"<sample:1>"}, false, 0, new String[][]{{"org.mockito.internal.MockHandler", "handle", "org.mockito.internal.invocation.Invocation", "<sample:6>"}}, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput017() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.mockito.internal.MockHandler", "org.mockito.internal.MockHandler", "handle", new String[]{"org.mockito.internal.invocation.Invocation"}, new String[]{"<sample:1>"}, false, 1, new String[][]{{"org.mockito.internal.MockHandler", "handle", "org.mockito.internal.invocation.Invocation", "<sample:6>"}}, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput018() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.mockito.internal.MockHandler", "org.mockito.internal.MockHandler", "getInvocationContainer", new String[]{}, new String[]{}, false), new String[][]{{"resetInvocationForPotentialStubbing", "org.mockito.internal.invocation.InvocationMatcher", "2"}});
  assertNotNull(actual);
  assertEquals("org.mockito.internal.stubbing.InvocationContainerImpl", actual.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput019() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.mockito.internal.MockHandler", "org.mockito.internal.MockHandler", "getInvocationContainer", new String[]{}, new String[]{}, false, 2, new String[][]{}, 2), new String[][]{{"getInvocations", "", "7"}});
  assertNotNull(actual);
  assertEquals("java.util.LinkedList", actual.getClass().getName());
  assertEquals("[]", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput020() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.mockito.internal.MockHandler", "org.mockito.internal.MockHandler", "getInvocationContainer", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.mockito.internal.MockHandler", "getInvocationContainer", ""}}, 3);
  assertNotNull(actual);
  assertEquals("org.mockito.internal.stubbing.InvocationContainerImpl", actual.getClass().getName());
  assertEquals("invocationForStubbing: null {hasAnswersForStubbing=false}", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput021() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.mockito.internal.MockHandler", "org.mockito.internal.MockHandler", "handle", new String[]{"org.mockito.internal.invocation.Invocation"}, new String[]{"<sample:1>"}, false, 3, new String[][]{{"org.mockito.internal.MockHandler", "voidMethodStubbable", "java.lang.Object", "<i:-1>"}, {"org.mockito.internal.MockHandler", "setAnswersForStubbing", "java.util.List", "<sample:1>"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.ClassCastException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput022() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.mockito.internal.MockHandler", "org.mockito.internal.MockHandler", "setAnswersForStubbing", new String[]{"java.util.List"}, new String[]{"<sample:3>"}, false, 4, new String[][]{}, 2);
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput023() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.mockito.internal.MockHandler", "org.mockito.internal.MockHandler", "getMockSettings", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.mockito.internal.MockHandler", "getInvocationContainer", ""}}), new String[][]{{"spiedInstance", "java.lang.Object", "2"}, {"getSpiedInstance", "", "0"}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("b", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput024() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.mockito.internal.MockHandler", "org.mockito.internal.MockHandler", "voidMethodStubbable", new String[]{"java.lang.Object"}, new String[]{"<s:a>"}, false, 4, new String[][]{{"org.mockito.internal.MockHandler", "getInvocationContainer", ""}}, 2), new String[][]{{"on", "", "5"}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("a", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput025() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.mockito.internal.MockHandler", "org.mockito.internal.MockHandler", "getInvocationContainer", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.mockito.internal.MockHandler", "getInvocationContainer", ""}}), new String[][]{{"hasAnswersForStubbing", "", "3"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput026() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.mockito.internal.MockHandler", "org.mockito.internal.MockHandler", "voidMethodStubbable", new String[]{"java.lang.Object"}, new String[]{"<s:4>"}, false, 7, new String[][]{{"org.mockito.internal.MockHandler", "getMockSettings", ""}}, 3), new String[][]{{"toAnswer", "org.mockito.stubbing.Answer", "5"}});
  assertNotNull(actual);
  assertEquals("org.mockito.internal.stubbing.VoidMethodStubbableImpl", actual.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput027() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.mockito.internal.MockHandler", "org.mockito.internal.MockHandler", "getInvocationContainer", new String[]{}, new String[]{}, false, 4, new String[][]{{"org.mockito.internal.MockHandler", "voidMethodStubbable", "java.lang.Object", "<s:}c>"}}, 2);
  assertNotNull(actual);
  assertEquals("org.mockito.internal.stubbing.InvocationContainerImpl", actual.getClass().getName());
  assertEquals("invocationForStubbing: null {hasAnswersForStubbing=false}", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput028() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.mockito.internal.MockHandler", "org.mockito.internal.MockHandler", "handle", new String[]{"org.mockito.internal.invocation.Invocation"}, new String[]{"<sample:9>"}, false, 5, new String[][]{{"org.mockito.internal.MockHandler", "getMockSettings", ""}}, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput029() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.mockito.internal.MockHandler", "org.mockito.internal.MockHandler", "getInvocationContainer", new String[]{}, new String[]{}, false, 6, new String[][]{{"org.mockito.internal.MockHandler", "getMockSettings", ""}}), new String[][]{{"addAnswer", "org.mockito.stubbing.Answer,boolean", "5"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput030() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.mockito.internal.MockHandler", "org.mockito.internal.MockHandler", "setAnswersForStubbing", new String[]{"java.util.List"}, new String[]{"<sample:2>"}, false, 6, new String[][]{}, 3);
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput031() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.mockito.internal.MockHandler", "org.mockito.internal.MockHandler", "getMockSettings", new String[]{}, new String[]{}, false, 4, new String[][]{{"org.mockito.internal.MockHandler", "setAnswersForStubbing", "java.util.List", "<sample:1>"}}), new String[][]{{"serializable", "", "7"}, {"isSerializable", "", "5"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput032() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.mockito.internal.MockHandler", "org.mockito.internal.MockHandler", "voidMethodStubbable", new String[]{"java.lang.Object"}, new String[]{"<null>"}, false, 0, new String[][]{{"org.mockito.internal.MockHandler", "getMockSettings", ""}}, 1), new String[][]{{"toReturn", "", "0"}});
  assertNotNull(actual);
  assertEquals("org.mockito.internal.stubbing.VoidMethodStubbableImpl", actual.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput033() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.mockito.internal.MockHandler", "org.mockito.internal.MockHandler", "getMockSettings", new String[]{}, new String[]{}, false, 4, new String[][]{{"org.mockito.internal.MockHandler", "getInvocationContainer", ""}}, 3);
  assertNotNull(actual);
  assertEquals("org.mockito.internal.creation.MockSettingsImpl", actual.getClass().getName());
  assertEquals("{getExtraInterfaces=null, isSerializable=false}", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput034() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.mockito.internal.MockHandler", "org.mockito.internal.MockHandler", "setAnswersForStubbing", new String[]{"java.util.List"}, new String[]{"<empty>"}, false, 1, new String[][]{}, 1);
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput035() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.mockito.internal.MockHandler", "org.mockito.internal.MockHandler", "getInvocationContainer", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.mockito.internal.MockHandler", "handle", "org.mockito.internal.invocation.Invocation", "<sample:4>"}}, 2), new String[][]{{"setMethodForStubbing", "org.mockito.internal.invocation.InvocationMatcher", "4"}});
  assertNotNull(actual);
  assertEquals("org.mockito.internal.stubbing.InvocationContainerImpl", actual.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput036() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.mockito.internal.MockHandler", "org.mockito.internal.MockHandler", "getInvocationContainer", new String[]{}, new String[]{}, false, 6, new String[][]{{"org.mockito.internal.MockHandler", "handle", "org.mockito.internal.invocation.Invocation", "<sample:1>"}}, 3), new String[][]{{"addAnswerForVoidMethod", "org.mockito.stubbing.Answer", "1"}});
  assertNotNull(actual);
  assertEquals("org.mockito.internal.stubbing.InvocationContainerImpl", actual.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput037() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.mockito.internal.MockHandler", "org.mockito.internal.MockHandler", "getInvocationContainer", new String[]{}, new String[]{}, false, 4, new String[][]{}), new String[][]{{"addAnswer", "org.mockito.stubbing.Answer", "2"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IndexOutOfBoundsException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput038() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.mockito.internal.MockHandler", "org.mockito.internal.MockHandler", "getMockSettings", new String[]{}, new String[]{}, false, 6, new String[][]{}, 1), new String[][]{{"spiedInstance", "java.lang.Object", "3"}, {"extraInterfaces", "java.lang.Class[]", "7"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("org.mockito.exceptions.base.MockitoException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput039() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.mockito.internal.MockHandler", "org.mockito.internal.MockHandler", "handle", new String[]{"org.mockito.internal.invocation.Invocation"}, new String[]{"<sample:0>"}, false, 0, new String[][]{{"org.mockito.internal.MockHandler", "getInvocationContainer", ""}, {"org.mockito.internal.MockHandler", "setAnswersForStubbing", "java.util.List", "<sample:2>"}}, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.ClassCastException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput040() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.mockito.internal.MockHandler", "org.mockito.internal.MockHandler", "getMockSettings", new String[]{}, new String[]{}, false, 4, new String[][]{{"org.mockito.internal.MockHandler", "voidMethodStubbable", "java.lang.Object", "<s:>"}, {"org.mockito.internal.MockHandler", "getInvocationContainer", ""}}, 1);
  assertNotNull(actual);
  assertEquals("org.mockito.internal.creation.MockSettingsImpl", actual.getClass().getName());
  assertEquals("{getExtraInterfaces=null, isSerializable=false}", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput041() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.mockito.internal.MockHandler", "org.mockito.internal.MockHandler", "getInvocationContainer", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.mockito.internal.MockHandler", "handle", "org.mockito.internal.invocation.Invocation", "<sample:2>"}}, 2), new String[][]{{"addAnswerForVoidMethod", "org.mockito.stubbing.Answer", "0"}, {"addConsecutiveAnswer", "org.mockito.stubbing.Answer", "5"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.util.NoSuchElementException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput042() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.mockito.internal.MockHandler", "org.mockito.internal.MockHandler", "handle", new String[]{"org.mockito.internal.invocation.Invocation"}, new String[]{"<sample:7>"}, false, 0, new String[][]{{"org.mockito.internal.MockHandler", "setAnswersForStubbing", "java.util.List", "<sample:0>"}}, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.ClassCastException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput043() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.mockito.internal.MockHandler", "org.mockito.internal.MockHandler", "getInvocationContainer", new String[]{}, new String[]{}, false, 0, null, 3), new String[][]{{"getInvocations", "", "7"}});
  assertNotNull(actual);
  assertEquals("java.util.LinkedList", actual.getClass().getName());
  assertEquals("[]", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput044() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.mockito.internal.MockHandler", "org.mockito.internal.MockHandler", "getInvocationContainer", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.mockito.internal.MockHandler", "handle", "org.mockito.internal.invocation.Invocation", "<sample:2>"}}), new String[][]{{"addConsecutiveAnswer", "org.mockito.stubbing.Answer", "0"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.util.NoSuchElementException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput045() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.mockito.internal.MockHandler", "org.mockito.internal.MockHandler", "getInvocationContainer", new String[]{}, new String[]{}, false, 1, new String[][]{{"org.mockito.internal.MockHandler", "voidMethodStubbable", "java.lang.Object", "<sample:2>"}, {"org.mockito.internal.MockHandler", "getInvocationContainer", ""}}, 2), new String[][]{{"addConsecutiveAnswer", "org.mockito.stubbing.Answer", "3"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput046() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.mockito.internal.MockHandler", "org.mockito.internal.MockHandler", "getInvocationContainer", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.mockito.internal.MockHandler", "setAnswersForStubbing", "java.util.List", "<sample:5>"}, {"org.mockito.internal.MockHandler", "voidMethodStubbable", "java.lang.Object", "<sample:2>"}}), new String[][]{{"hasAnswersForStubbing", "", "3"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput047() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.mockito.internal.MockHandler", "org.mockito.internal.MockHandler", "setAnswersForStubbing", new String[]{"java.util.List"}, new String[]{"<null>"}, false, 0, new String[][]{{"org.mockito.internal.MockHandler", "getMockSettings", ""}}, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput048() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.mockito.internal.MockHandler", "org.mockito.internal.MockHandler", "getMockSettings", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.mockito.internal.MockHandler", "handle", "org.mockito.internal.invocation.Invocation", "<sample:7>"}}, 3), new String[][]{{"getExtraInterfaces", "", "2"}, {"getDefaultAnswer", "", "6"}});
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput049() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.mockito.internal.MockHandler", "org.mockito.internal.MockHandler", "getInvocationContainer", new String[]{}, new String[]{}, false, 3, new String[][]{{"org.mockito.internal.MockHandler", "voidMethodStubbable", "java.lang.Object", "<s:key>"}, {"org.mockito.internal.MockHandler", "getMockSettings", ""}}, 1), new String[][]{{"addAnswer", "org.mockito.stubbing.Answer,boolean", "5"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput050() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.mockito.internal.MockHandler", "org.mockito.internal.MockHandler", "handle", new String[]{"org.mockito.internal.invocation.Invocation"}, new String[]{"<sample:0>"}, false, 0, new String[][]{{"org.mockito.internal.MockHandler", "setAnswersForStubbing", "java.util.List", "<sample:0>"}}, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.ClassCastException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput051() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.mockito.internal.MockHandler", "org.mockito.internal.MockHandler", "getInvocationContainer", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.mockito.internal.MockHandler", "getInvocationContainer", ""}, {"org.mockito.internal.MockHandler", "getInvocationContainer", ""}}, 1);
  assertNotNull(actual);
  assertEquals("org.mockito.internal.stubbing.InvocationContainerImpl", actual.getClass().getName());
  assertEquals("invocationForStubbing: null {hasAnswersForStubbing=false}", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput052() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.mockito.internal.MockHandler", "org.mockito.internal.MockHandler", "getInvocationContainer", new String[]{}, new String[]{}, false, 1, new String[][]{{"org.mockito.internal.MockHandler", "getMockSettings", ""}}, 3), new String[][]{{"addConsecutiveAnswer", "org.mockito.stubbing.Answer", "2"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput053() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.mockito.internal.MockHandler", "org.mockito.internal.MockHandler", "setAnswersForStubbing", new String[]{"java.util.List"}, new String[]{"<null>"}, false, 2, new String[][]{{"org.mockito.internal.MockHandler", "getInvocationContainer", ""}}, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput054() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.mockito.internal.MockHandler", "org.mockito.internal.MockHandler", "getMockSettings", new String[]{}, new String[]{}, false, 0, null, 2), new String[][]{{"getSpiedInstance", "", "6"}});
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput055() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.mockito.internal.MockHandler", "org.mockito.internal.MockHandler", "voidMethodStubbable", new String[]{"java.lang.Object"}, new String[]{"<s:>"}, false, 0, new String[][]{{"org.mockito.internal.MockHandler", "handle", "org.mockito.internal.invocation.Invocation", "<sample:3>"}}), new String[][]{{"on", "", "2"}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput056() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.mockito.internal.MockHandler", "org.mockito.internal.MockHandler", "getMockSettings", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.mockito.internal.MockHandler", "handle", "org.mockito.internal.invocation.Invocation", "<null>"}}, 1), new String[][]{{"initiateMockName", "java.lang.Class", "1"}, {"getDefaultAnswer", "", "1"}});
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput057() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.mockito.internal.MockHandler", "org.mockito.internal.MockHandler", "voidMethodStubbable", new String[]{"java.lang.Object"}, new String[]{"<i:37>"}, false, 0, new String[][]{{"org.mockito.internal.MockHandler", "setAnswersForStubbing", "java.util.List", "<sample:0>"}}, 2);
  assertNotNull(actual);
  assertEquals("org.mockito.internal.stubbing.VoidMethodStubbableImpl", actual.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput058() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.mockito.internal.MockHandler", "org.mockito.internal.MockHandler", "getMockSettings", new String[]{}, new String[]{}, false, 0, null, 2), new String[][]{{"isSerializable", "", "0"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput059() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.mockito.internal.MockHandler", "org.mockito.internal.MockHandler", "getMockSettings", new String[]{}, new String[]{}, false, 1, new String[][]{}, 1), new String[][]{{"isSerializable", "", "3"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput060() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.mockito.internal.MockHandler", "org.mockito.internal.MockHandler", "getMockSettings", new String[]{}, new String[]{}, false, 5, new String[][]{}, 3), new String[][]{{"isSerializable", "", "2"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput061() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.mockito.internal.MockHandler", "org.mockito.internal.MockHandler", "voidMethodStubbable", new String[]{"java.lang.Object"}, new String[]{"<s:;>"}, false, 0, new String[][]{{"org.mockito.internal.MockHandler", "setAnswersForStubbing", "java.util.List", "<empty>"}}), new String[][]{{"on", "", "2"}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals(";", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput062() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.mockito.internal.MockHandler", "org.mockito.internal.MockHandler", "getInvocationContainer", new String[]{}, new String[]{}, false, 5, new String[][]{{"org.mockito.internal.MockHandler", "handle", "org.mockito.internal.invocation.Invocation", "<sample:9>"}, {"org.mockito.internal.MockHandler", "getInvocationContainer", ""}}, 3), new String[][]{{"getInvocations", "", "3"}, {"clone", "", "1"}});
  assertNotNull(actual);
  assertEquals("java.util.LinkedList", actual.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput063() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.mockito.internal.MockHandler", "org.mockito.internal.MockHandler", "getInvocationContainer", new String[]{}, new String[]{}, false, 6, new String[][]{{"org.mockito.internal.MockHandler", "setAnswersForStubbing", "java.util.List", "<sample:1>"}}), new String[][]{{"setMethodForStubbing", "org.mockito.internal.invocation.InvocationMatcher", "6"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.ClassCastException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput064() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.mockito.internal.MockHandler", "org.mockito.internal.MockHandler", "voidMethodStubbable", new String[]{"java.lang.Object"}, new String[]{"<s:}>"}, false, 7, new String[][]{{"org.mockito.internal.MockHandler", "setAnswersForStubbing", "java.util.List", "<sample:5>"}}), new String[][]{{"on", "", "4"}, {"on", "", "6"}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("}", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput065() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.mockito.internal.MockHandler", "org.mockito.internal.MockHandler", "setAnswersForStubbing", new String[]{"java.util.List"}, new String[]{"<null>"}, false, 5, new String[][]{{"org.mockito.internal.MockHandler", "setAnswersForStubbing", "java.util.List", "<sample:3>"}}, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput066() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.mockito.internal.MockHandler", "org.mockito.internal.MockHandler", "getInvocationContainer", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.mockito.internal.MockHandler", "handle", "org.mockito.internal.invocation.Invocation", "<sample:0>"}}, 3), new String[][]{{"getInvocations", "", "0"}, {"element", "", "0"}});
  assertNotNull(actual);
  assertEquals("org.mockito.internal.invocation.Invocation", actual.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput067() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.mockito.internal.MockHandler", "org.mockito.internal.MockHandler", "voidMethodStubbable", new String[]{"java.lang.Object"}, new String[]{"<d:3.0>"}, false, 0, new String[][]{{"org.mockito.internal.MockHandler", "voidMethodStubbable", "java.lang.Object", "<b:true>"}}, 1), new String[][]{{"on", "", "6"}, {"on", "", "4"}});
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("3.0", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput068() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.mockito.internal.MockHandler", "org.mockito.internal.MockHandler", "getInvocationContainer", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.mockito.internal.MockHandler", "handle", "org.mockito.internal.invocation.Invocation", "<null>"}}, 2), new String[][]{{"setMethodForStubbing", "org.mockito.internal.invocation.InvocationMatcher", "3"}, {"hasAnswersForStubbing", "", "5"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput069() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.mockito.internal.MockHandler", "org.mockito.internal.MockHandler", "getInvocationContainer", new String[]{}, new String[]{}, false, 7, new String[][]{{"org.mockito.internal.MockHandler", "getInvocationContainer", ""}}, 1), new String[][]{{"addAnswer", "org.mockito.stubbing.Answer", "6"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IndexOutOfBoundsException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput070() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.mockito.internal.MockHandler", "org.mockito.internal.MockHandler", "voidMethodStubbable", new String[]{"java.lang.Object"}, new String[]{"<b:false>"}, false, 0, new String[][]{{"org.mockito.internal.MockHandler", "setAnswersForStubbing", "java.util.List", "<sample:0>"}, {"org.mockito.internal.MockHandler", "handle", "org.mockito.internal.invocation.Invocation", "<sample:9>"}}), new String[][]{{"on", "", "3"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput071() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.mockito.internal.MockHandler", "org.mockito.internal.MockHandler", "getInvocationContainer", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.mockito.internal.MockHandler", "getInvocationContainer", ""}}, 1), new String[][]{{"setInvocationForPotentialStubbing", "org.mockito.internal.invocation.InvocationMatcher", "6"}, {"addAnswer", "org.mockito.stubbing.Answer", "0"}});
  assertNotNull(actual);
  assertEquals("org.mockito.internal.stubbing.InvocationContainerImpl", actual.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput072() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.mockito.internal.MockHandler", "org.mockito.internal.MockHandler", "voidMethodStubbable", new String[]{"java.lang.Object"}, new String[]{"<i:-1>"}, false, 7, new String[][]{{"org.mockito.internal.MockHandler", "getInvocationContainer", ""}, {"org.mockito.internal.MockHandler", "voidMethodStubbable", "java.lang.Object", "<sample:3>"}}), new String[][]{{"on", "", "4"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("-1", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput073() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.mockito.internal.MockHandler", "org.mockito.internal.MockHandler", "voidMethodStubbable", new String[]{"java.lang.Object"}, new String[]{"<null>"}, false, 0, new String[][]{{"org.mockito.internal.MockHandler", "getMockSettings", ""}, {"org.mockito.internal.MockHandler", "setAnswersForStubbing", "java.util.List", "<null>"}}, 1), new String[][]{{"on", "", "7"}});
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput074() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.mockito.internal.MockHandler", "org.mockito.internal.MockHandler", "voidMethodStubbable", new String[]{"java.lang.Object"}, new String[]{"<s:}b>"}, false, 2, new String[][]{{"org.mockito.internal.MockHandler", "getMockSettings", ""}}), new String[][]{{"toAnswer", "org.mockito.stubbing.Answer", "5"}, {"toReturn", "", "2"}, {"on", "", "7"}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("}b", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput075() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.mockito.internal.MockHandler", "org.mockito.internal.MockHandler", "getInvocationContainer", new String[]{}, new String[]{}, false, 7, new String[][]{}, 1), new String[][]{{"getInvocations", "", "3"}});
  assertNotNull(actual);
  assertEquals("java.util.LinkedList", actual.getClass().getName());
  assertEquals("[]", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput076() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.mockito.internal.MockHandler", "org.mockito.internal.MockHandler", "getMockSettings", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.mockito.internal.MockHandler", "voidMethodStubbable", "java.lang.Object", "<i:-44>"}, {"org.mockito.internal.MockHandler", "voidMethodStubbable", "java.lang.Object", "<s:5>"}}, 2), new String[][]{{"getExtraInterfaces", "", "1"}, {"extraInterfaces", "java.lang.Class[]", "7"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("org.mockito.exceptions.base.MockitoException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput077() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.mockito.internal.MockHandler", "org.mockito.internal.MockHandler", "getMockSettings", new String[]{}, new String[]{}, false, 7, new String[][]{}), new String[][]{{"spiedInstance", "java.lang.Object", "4"}, {"getSpiedInstance", "", "7"}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("key", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput078() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.mockito.internal.MockHandler", "org.mockito.internal.MockHandler", "getMockSettings", new String[]{}, new String[]{}, false, 3, new String[][]{}, 3), new String[][]{{"extraInterfaces", "java.lang.Class[]", "6"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("org.mockito.exceptions.base.MockitoException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput079() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.mockito.internal.MockHandler", "org.mockito.internal.MockHandler", "voidMethodStubbable", new String[]{"java.lang.Object"}, new String[]{"<s:b>"}, false, 7, new String[][]{{"org.mockito.internal.MockHandler", "getMockSettings", ""}}), new String[][]{{"toAnswer", "org.mockito.stubbing.Answer", "7"}, {"on", "", "5"}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("b", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput080() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.mockito.internal.MockHandler", "org.mockito.internal.MockHandler", "voidMethodStubbable", new String[]{"java.lang.Object"}, new String[]{"<i:25>"}, false, 3, new String[][]{{"org.mockito.internal.MockHandler", "voidMethodStubbable", "java.lang.Object", "<s:b>"}, {"org.mockito.internal.MockHandler", "getInvocationContainer", ""}}, 2), new String[][]{{"on", "", "3"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("25", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput081() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.mockito.internal.MockHandler", "org.mockito.internal.MockHandler", "voidMethodStubbable", new String[]{"java.lang.Object"}, new String[]{"<s:b4P>"}, false, 6, new String[][]{{"org.mockito.internal.MockHandler", "getInvocationContainer", ""}, {"org.mockito.internal.MockHandler", "voidMethodStubbable", "java.lang.Object", "<sample:2>"}}, 2), new String[][]{{"on", "", "7"}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("b4P", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput082() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.mockito.internal.MockHandler", "org.mockito.internal.MockHandler", "getInvocationContainer", new String[]{}, new String[]{}, false, 7, new String[][]{{"org.mockito.internal.MockHandler", "setAnswersForStubbing", "java.util.List", "<sample:2>"}, {"org.mockito.internal.MockHandler", "getInvocationContainer", ""}}, 1), new String[][]{{"setMethodForStubbing", "org.mockito.internal.invocation.InvocationMatcher", "0"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.ClassCastException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput083() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.mockito.internal.MockHandler", "org.mockito.internal.MockHandler", "getInvocationContainer", new String[]{}, new String[]{}, false, 3, new String[][]{{"org.mockito.internal.MockHandler", "handle", "org.mockito.internal.invocation.Invocation", "<sample:6>"}}, 2), new String[][]{{"findAnswerFor", "org.mockito.internal.invocation.Invocation", "6"}});
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput084() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.mockito.internal.MockHandler", "org.mockito.internal.MockHandler", "getInvocationContainer", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.mockito.internal.MockHandler", "voidMethodStubbable", "java.lang.Object", "<sample:0>"}}, 2), new String[][]{{"addAnswer", "org.mockito.stubbing.Answer", "6"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IndexOutOfBoundsException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput085() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.mockito.internal.MockHandler", "org.mockito.internal.MockHandler", "getMockSettings", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.mockito.internal.MockHandler", "setAnswersForStubbing", "java.util.List", "<sample:2>"}, {"org.mockito.internal.MockHandler", "setAnswersForStubbing", "java.util.List", "<sample:3>"}}), new String[][]{{"initiateMockName", "java.lang.Class", "2"}, {"getMockName", "", "4"}});
  assertNotNull(actual);
  assertEquals("org.mockito.internal.util.MockName", actual.getClass().getName());
  assertEquals("genericBase {isSurrogate=true}", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput086() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.mockito.internal.MockHandler", "org.mockito.internal.MockHandler", "getInvocationContainer", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.mockito.internal.MockHandler", "voidMethodStubbable", "java.lang.Object", "<sample:1>"}}, 1), new String[][]{{"hasAnswersForStubbing", "", "4"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput087() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.mockito.internal.MockHandler", "org.mockito.internal.MockHandler", "getInvocationContainer", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.mockito.internal.MockHandler", "voidMethodStubbable", "java.lang.Object", "<s:}b>"}, {"org.mockito.internal.MockHandler", "setAnswersForStubbing", "java.util.List", "<sample:3>"}}, 1), new String[][]{{"hasAnswersForStubbing", "", "7"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput088() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.mockito.internal.MockHandler", "org.mockito.internal.MockHandler", "voidMethodStubbable", new String[]{"java.lang.Object"}, new String[]{"<sample:0>"}, false, 7, new String[][]{{"org.mockito.internal.MockHandler", "getInvocationContainer", ""}}, 1), new String[][]{{"toReturn", "", "6"}, {"on", "", "6"}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("a", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput089() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.mockito.internal.MockHandler", "org.mockito.internal.MockHandler", "voidMethodStubbable", new String[]{"java.lang.Object"}, new String[]{"<i:1>"}, false, 3, new String[][]{{"org.mockito.internal.MockHandler", "voidMethodStubbable", "java.lang.Object", "<s:key>"}}, 3), new String[][]{{"on", "", "3"}, {"on", "", "4"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("1", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput090() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.mockito.internal.MockHandler", "org.mockito.internal.MockHandler", "getInvocationContainer", new String[]{}, new String[]{}, false, 7, new String[][]{}, 3), new String[][]{{"hasAnswersForStubbing", "", "2"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput091() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.mockito.internal.MockHandler", "org.mockito.internal.MockHandler", "voidMethodStubbable", new String[]{"java.lang.Object"}, new String[]{"<s:\n>"}, false, 4, new String[][]{{"org.mockito.internal.MockHandler", "getInvocationContainer", ""}}, 3), new String[][]{{"toAnswer", "org.mockito.stubbing.Answer", "7"}, {"on", "", "0"}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("\n", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput092() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.mockito.internal.MockHandler", "org.mockito.internal.MockHandler", "voidMethodStubbable", new String[]{"java.lang.Object"}, new String[]{"<s:>"}, false, 7, new String[][]{}, 1), new String[][]{{"toReturn", "", "0"}, {"on", "", "4"}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput093() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.mockito.internal.MockHandler", "org.mockito.internal.MockHandler", "voidMethodStubbable", new String[]{"java.lang.Object"}, new String[]{"<s:>"}, false, 1, new String[][]{{"org.mockito.internal.MockHandler", "handle", "org.mockito.internal.invocation.Invocation", "<sample:2>"}}, 2), new String[][]{{"toThrow", "java.lang.Throwable", "7"}, {"toThrow", "java.lang.Throwable", "1"}, {"on", "", "4"}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput094() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.mockito.internal.MockHandler", "org.mockito.internal.MockHandler", "voidMethodStubbable", new String[]{"java.lang.Object"}, new String[]{"<d:1.5>"}, false, 7, new String[][]{{"org.mockito.internal.MockHandler", "handle", "org.mockito.internal.invocation.Invocation", "<sample:3>"}}, 1), new String[][]{{"on", "", "0"}});
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("1.5", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput095() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.mockito.internal.MockHandler", "org.mockito.internal.MockHandler", "getMockSettings", new String[]{}, new String[]{}, false, 1, new String[][]{}, 1), new String[][]{{"getMockName", "", "2"}});
  assertNotNull(actual);
  assertEquals("org.mockito.internal.util.MockName", actual.getClass().getName());
  assertEquals("string {isSurrogate=true}", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput096() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.mockito.internal.MockHandler", "org.mockito.internal.MockHandler", "voidMethodStubbable", new String[]{"java.lang.Object"}, new String[]{"<s:kef>"}, false, 0, new String[][]{{"org.mockito.internal.MockHandler", "handle", "org.mockito.internal.invocation.Invocation", "<sample:8>"}}, 2), new String[][]{{"on", "", "0"}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("kef", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput097() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.mockito.internal.MockHandler", "org.mockito.internal.MockHandler", "voidMethodStubbable", new String[]{"java.lang.Object"}, new String[]{"<s:>>"}, false, 3, new String[][]{}, 1), new String[][]{{"toAnswer", "org.mockito.stubbing.Answer", "4"}, {"on", "", "2"}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals(">", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput098() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.mockito.internal.MockHandler", "org.mockito.internal.MockHandler", "voidMethodStubbable", new String[]{"java.lang.Object"}, new String[]{"<s:?}>"}, false, 5, new String[][]{{"org.mockito.internal.MockHandler", "voidMethodStubbable", "java.lang.Object", "<i:-1>"}, {"org.mockito.internal.MockHandler", "handle", "org.mockito.internal.invocation.Invocation", "<sample:7>"}}, 2), new String[][]{{"on", "", "5"}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("?}", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput099() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.mockito.internal.MockHandler", "org.mockito.internal.MockHandler", "voidMethodStubbable", new String[]{"java.lang.Object"}, new String[]{"<i:0>"}, false, 0, null, 1), new String[][]{{"toReturn", "", "0"}, {"on", "", "7"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput100() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.mockito.internal.MockHandler", "org.mockito.internal.MockHandler", "voidMethodStubbable", new String[]{"java.lang.Object"}, new String[]{"<s:keeC>"}, false, 7, new String[][]{{"org.mockito.internal.MockHandler", "voidMethodStubbable", "java.lang.Object", "<s:a>"}}, 3), new String[][]{{"on", "", "3"}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("keeC", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput101() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.mockito.internal.MockHandler", "org.mockito.internal.MockHandler", "voidMethodStubbable", new String[]{"java.lang.Object"}, new String[]{"<s:>"}, false, 3, new String[][]{{"org.mockito.internal.MockHandler", "voidMethodStubbable", "java.lang.Object", "<s:<>"}}, 3), new String[][]{{"toReturn", "", "7"}, {"on", "", "6"}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput102() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.mockito.internal.MockHandler", "org.mockito.internal.MockHandler", "voidMethodStubbable", new String[]{"java.lang.Object"}, new String[]{"<i:1>"}, false, 6, new String[][]{}, 2), new String[][]{{"on", "", "5"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("1", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput103() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.mockito.internal.MockHandler", "org.mockito.internal.MockHandler", "voidMethodStubbable", new String[]{"java.lang.Object"}, new String[]{"<sample:0>"}, false, 0, new String[][]{{"org.mockito.internal.MockHandler", "getMockSettings", ""}}, 3), new String[][]{{"on", "", "0"}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("a", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput104() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.mockito.internal.MockHandler", "org.mockito.internal.MockHandler", "voidMethodStubbable", new String[]{"java.lang.Object"}, new String[]{"<s:keyi>"}, false, 5, new String[][]{{"org.mockito.internal.MockHandler", "setAnswersForStubbing", "java.util.List", "<sample:2>"}}, 3), new String[][]{{"on", "", "0"}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("keyi", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput105() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.mockito.internal.MockHandler", "org.mockito.internal.MockHandler", "voidMethodStubbable", new String[]{"java.lang.Object"}, new String[]{"<b:true>"}, false, 3, new String[][]{{"org.mockito.internal.MockHandler", "voidMethodStubbable", "java.lang.Object", "<s::a>"}, {"org.mockito.internal.MockHandler", "voidMethodStubbable", "java.lang.Object", "<i:0>"}}, 3), new String[][]{{"on", "", "7"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput106() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.mockito.internal.MockHandler", "org.mockito.internal.MockHandler", "getMockSettings", new String[]{}, new String[]{}, false, 1, new String[][]{{"org.mockito.internal.MockHandler", "getInvocationContainer", ""}}, 3), new String[][]{{"getMockName", "", "3"}, {"isSurrogate", "", "6"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput107() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.mockito.internal.MockHandler", "org.mockito.internal.MockHandler", "getMockSettings", new String[]{}, new String[]{}, false, 4, new String[][]{{"org.mockito.internal.MockHandler", "setAnswersForStubbing", "java.util.List", "<sample:1>"}}, 2), new String[][]{{"getMockName", "", "1"}});
  assertNotNull(actual);
  assertEquals("org.mockito.internal.util.MockName", actual.getClass().getName());
  assertEquals("string {isSurrogate=true}", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput108() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.mockito.internal.MockHandler", "org.mockito.internal.MockHandler", "getMockSettings", new String[]{}, new String[]{}, false, 2, new String[][]{{"org.mockito.internal.MockHandler", "getMockSettings", ""}}, 3), new String[][]{{"getMockName", "", "0"}});
  assertNotNull(actual);
  assertEquals("org.mockito.internal.util.MockName", actual.getClass().getName());
  assertEquals("string {isSurrogate=true}", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput109() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.mockito.internal.MockHandler", "org.mockito.internal.MockHandler", "getMockSettings", new String[]{}, new String[]{}, false, 3, new String[][]{{"org.mockito.internal.MockHandler", "getInvocationContainer", ""}, {"org.mockito.internal.MockHandler", "setAnswersForStubbing", "java.util.List", "<sample:0>"}}, 2), new String[][]{{"serializable", "", "3"}, {"isSerializable", "", "3"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput110() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.mockito.internal.MockHandler", "org.mockito.internal.MockHandler", "getMockSettings", new String[]{}, new String[]{}, false, 7, new String[][]{{"org.mockito.internal.MockHandler", "handle", "org.mockito.internal.invocation.Invocation", "<sample:1>"}}, 3), new String[][]{{"spiedInstance", "java.lang.Object", "6"}, {"getSpiedInstance", "", "7"}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput111() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.mockito.internal.MockHandler", "org.mockito.internal.MockHandler", "getMockSettings", new String[]{}, new String[]{}, false, 7, new String[][]{{"org.mockito.internal.MockHandler", "voidMethodStubbable", "java.lang.Object", "<s:>"}}, 2), new String[][]{{"initiateMockName", "java.lang.Class", "7"}, {"getMockName", "", "4"}});
  assertNotNull(actual);
  assertEquals("org.mockito.internal.util.MockName", actual.getClass().getName());
  assertEquals("int {isSurrogate=true}", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput112() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.mockito.internal.MockHandler", "org.mockito.internal.MockHandler", "getMockSettings", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.mockito.internal.MockHandler", "getInvocationContainer", ""}}, 2), new String[][]{{"defaultAnswer", "org.mockito.stubbing.Answer", "7"}, {"getDefaultAnswer", "", "7"}});
  assertNotNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput113() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.mockito.internal.MockHandler", "org.mockito.internal.MockHandler", "getMockSettings", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.mockito.internal.MockHandler", "getMockSettings", ""}, {"org.mockito.internal.MockHandler", "getMockSettings", ""}}, 2), new String[][]{{"initiateMockName", "java.lang.Class", "1"}, {"getMockName", "", "0"}});
  assertNotNull(actual);
  assertEquals("org.mockito.internal.util.MockName", actual.getClass().getName());
  assertEquals("genericSub {isSurrogate=true}", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput114() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.mockito.internal.MockHandler", "org.mockito.internal.MockHandler", "getMockSettings", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.mockito.internal.MockHandler", "getMockSettings", ""}}, 3), new String[][]{{"defaultAnswer", "org.mockito.stubbing.Answer", "5"}, {"getDefaultAnswer", "", "3"}});
  assertNotNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput115() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.mockito.internal.MockHandler", "org.mockito.internal.MockHandler", "getMockSettings", new String[]{}, new String[]{}, false, 5, new String[][]{}, 1), new String[][]{{"defaultAnswer", "org.mockito.stubbing.Answer", "7"}, {"getDefaultAnswer", "", "6"}});
  assertNotNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput116() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.mockito.internal.MockHandler", "org.mockito.internal.MockHandler", "getMockSettings", new String[]{}, new String[]{}, false, 5, new String[][]{{"org.mockito.internal.MockHandler", "getInvocationContainer", ""}}, 1), new String[][]{{"initiateMockName", "java.lang.Class", "7"}, {"getMockName", "", "1"}});
  assertNotNull(actual);
  assertEquals("org.mockito.internal.util.MockName", actual.getClass().getName());
  assertEquals("int {isSurrogate=true}", SearchInputFactory_scaffolding.observe(actual));
 }
}
