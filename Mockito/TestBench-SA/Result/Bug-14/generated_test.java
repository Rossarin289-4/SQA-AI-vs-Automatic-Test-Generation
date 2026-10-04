package generated.algorithm;

import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;
import static org.junit.Assert.*;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class SimulatedAnnealingGeneratedTest {
 @Test(timeout = 20000)
 public void generatedInput000() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.mockito.internal.MockitoCore", "org.mockito.internal.MockitoCore", "stubVoid", new String[]{"java.lang.Object"}, new String[]{"<s:>"}, false, 1, new String[][]{{"org.mockito.internal.MockitoCore", "stub", ""}, {"org.mockito.internal.MockitoCore", "reset", "java.lang.Object[]", "<empty>"}}, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("org.mockito.exceptions.misusing.NotAMockException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput001() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.mockito.internal.MockHandler", "org.mockito.internal.MockHandler", "getMockSettings", new String[]{}, new String[]{}, false, 7, new String[][]{{"org.mockito.internal.MockHandler", "getInvocationContainer", ""}, {"org.mockito.internal.MockHandler", "handle", "org.mockito.internal.invocation.Invocation", "<sample:3>"}}), new String[][]{{"getDefaultAnswer", "", "3"}});
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput002() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.mockito.internal.MockitoCore", "org.mockito.internal.MockitoCore", "mock", new String[]{"java.lang.Class", "org.mockito.MockSettings"}, new String[]{"<sample:6>", "<sample:3>"}, false, 0, new String[][]{{"org.mockito.internal.MockitoCore", "mock", "java.lang.Class,org.mockito.MockSettings", "<sample:3>", "<null>"}, {"org.mockito.internal.MockitoCore", "stub", "java.lang.Object", "<i:1>"}}, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.ClassCastException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput003() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.mockito.internal.MockitoCore", "org.mockito.internal.MockitoCore", "verifyNoMoreInteractions", new String[]{"java.lang.Object[]"}, new String[]{"<null>"}, false); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("org.mockito.exceptions.base.MockitoException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput004() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.mockito.internal.MockitoCore", "org.mockito.internal.MockitoCore", "mock", new String[]{"java.lang.Class", "org.mockito.MockSettings"}, new String[]{"<null>", "<sample:2>"}, false, 7, new String[][]{{"org.mockito.internal.MockitoCore", "verify", "java.lang.Object,org.mockito.verification.VerificationMode", "<i:2>", "<sample:4>"}, {"org.mockito.internal.MockitoCore", "inOrder", "java.lang.Object[]", "<empty>"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.ClassCastException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput005() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.mockito.internal.MockitoCore", "org.mockito.internal.MockitoCore", "verify", new String[]{"java.lang.Object", "org.mockito.verification.VerificationMode"}, new String[]{"<null>", "<sample:0>"}, false, 1, new String[][]{{"org.mockito.internal.MockitoCore", "getLastInvocation", ""}, {"org.mockito.internal.MockitoCore", "reset", "java.lang.Object[]", "<sample:5>"}}, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("org.mockito.exceptions.misusing.NullInsteadOfMockException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput006() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.mockito.internal.MockHandler", "org.mockito.internal.MockHandler", "getMockSettings", new String[]{}, new String[]{}, false, 14, new String[][]{{"org.mockito.internal.MockHandler", "voidMethodStubbable", "java.lang.Object", "<null>"}, {"org.mockito.internal.MockHandler", "handle", "org.mockito.internal.invocation.Invocation", "<sample:6>"}, {"org.mockito.internal.MockHandler", "getMockSettings", ""}}, 1), new String[][]{{"getMockName", "", "4"}});
  assertNotNull(actual);
  assertEquals("org.mockito.internal.util.MockName", actual.getClass().getName());
  assertEquals("string {isSurrogate=true}", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput007() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.mockito.internal.MockitoCore", "org.mockito.internal.MockitoCore", "reset", new String[]{"java.lang.Object[]"}, new String[]{"<sample:4>"}, false, 8, new String[][]{{"org.mockito.internal.MockitoCore", "when", "java.lang.Object", "<s:>"}, {"org.mockito.internal.MockitoCore", "verify", "java.lang.Object,org.mockito.verification.VerificationMode", "<i:0>", "<sample:5>"}, {"org.mockito.internal.MockitoCore", "doAnswer", "org.mockito.stubbing.Answer", "<sample:7>"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("org.mockito.exceptions.misusing.UnfinishedStubbingException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput008() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.mockito.internal.MockHandler", "org.mockito.internal.MockHandler", "handle", new String[]{"org.mockito.internal.invocation.Invocation"}, new String[]{"<sample:6>"}, false, 7, new String[][]{{"org.mockito.internal.MockHandler", "setAnswersForStubbing", "java.util.List", "<sample:1>"}}, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.ClassCastException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput009() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.mockito.internal.MockitoCore", "org.mockito.internal.MockitoCore", "mock", new String[]{"java.lang.Class", "org.mockito.MockSettings"}, new String[]{"<sample:9>", "<sample:4>"}, false, 15, new String[][]{{"org.mockito.internal.MockitoCore", "inOrder", "java.lang.Object[]", "<sample:3>"}, {"org.mockito.internal.MockitoCore", "reset", "java.lang.Object[]", "<sample:6>"}, {"org.mockito.internal.MockitoCore", "verifyNoMoreInteractions", "java.lang.Object[]", "<sample:0>"}}, 1), new String[][]{{"values", "", "3"}, {"add", "java.lang.Object", "7"}, {"getFirst", "", "1"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput010() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.mockito.internal.MockitoCore", "org.mockito.internal.MockitoCore", "when", new String[]{"java.lang.Object"}, new String[]{"<b:true>"}, false, 0, new String[][]{{"org.mockito.internal.MockitoCore", "validateMockitoUsage", ""}, {"org.mockito.internal.MockitoCore", "verifyNoMoreInteractionsInOrder", "java.util.List,org.mockito.internal.verification.api.InOrderContext", "<sample:3>", "<sample:5>"}}, 3);
  assertNotNull(actual);
  assertEquals("org.mockito.internal.stubbing.OngoingStubbingImpl", actual.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput011() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.mockito.internal.MockitoCore", "org.mockito.internal.MockitoCore", "verifyNoMoreInteractionsInOrder", new String[]{"java.util.List", "org.mockito.internal.verification.api.InOrderContext"}, new String[]{"<empty>", "<sample:6>"}, false, 0, new String[][]{{"org.mockito.internal.MockitoCore", "verifyNoMoreInteractions", "java.lang.Object[]", "<empty>"}}, 2);
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput012() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.mockito.internal.MockHandler", "org.mockito.internal.MockHandler", "voidMethodStubbable", new String[]{"java.lang.Object"}, new String[]{"<s:b>"}, false, 0, new String[][]{{"org.mockito.internal.MockHandler", "handle", "org.mockito.internal.invocation.Invocation", "<sample:3>"}}, 1);
  assertNotNull(actual);
  assertEquals("org.mockito.internal.stubbing.VoidMethodStubbableImpl", actual.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput013() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.mockito.internal.MockHandler", "org.mockito.internal.MockHandler", "voidMethodStubbable", new String[]{"java.lang.Object"}, new String[]{"<s:b>"}, false, 0, new String[][]{{"org.mockito.internal.MockHandler", "handle", "org.mockito.internal.invocation.Invocation", "<sample:3>"}}, 1), new String[][]{{"toAnswer", "org.mockito.stubbing.Answer", "6"}});
  assertNotNull(actual);
  assertEquals("org.mockito.internal.stubbing.VoidMethodStubbableImpl", actual.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput014() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.mockito.internal.MockHandler", "org.mockito.internal.MockHandler", "voidMethodStubbable", new String[]{"java.lang.Object"}, new String[]{"<s:c>"}, false, 0, new String[][]{{"org.mockito.internal.MockHandler", "setAnswersForStubbing", "java.util.List", "<empty>"}, {"org.mockito.internal.MockHandler", "handle", "org.mockito.internal.invocation.Invocation", "<sample:3>"}}, 1), new String[][]{{"toAnswer", "org.mockito.stubbing.Answer", "6"}});
  assertNotNull(actual);
  assertEquals("org.mockito.internal.stubbing.VoidMethodStubbableImpl", actual.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput015() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.mockito.internal.MockitoCore", "org.mockito.internal.MockitoCore", "stubVoid", new String[]{"java.lang.Object"}, new String[]{"<s:>"}, false, 1, new String[][]{{"org.mockito.internal.MockitoCore", "stub", ""}}, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("org.mockito.exceptions.misusing.NotAMockException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput016() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.mockito.internal.MockitoCore", "org.mockito.internal.MockitoCore", "verify", new String[]{"java.lang.Object", "org.mockito.verification.VerificationMode"}, new String[]{"<s:>", "<sample:4>"}, false, 0, null, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("org.mockito.exceptions.misusing.NotAMockException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput017() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.mockito.internal.MockHandler", "org.mockito.internal.MockHandler", "getMockSettings", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.mockito.internal.MockHandler", "handle", "org.mockito.internal.invocation.Invocation", "<sample:0>"}, {"org.mockito.internal.MockHandler", "handle", "org.mockito.internal.invocation.Invocation", "<sample:3>"}}, 3), new String[][]{{"getDefaultAnswer", "", "3"}, {"getExtraInterfaces", "", "4"}});
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput018() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.mockito.internal.MockHandler", "org.mockito.internal.MockHandler", "getMockSettings", new String[]{}, new String[]{}, false, 17, new String[][]{{"org.mockito.internal.MockHandler", "handle", "org.mockito.internal.invocation.Invocation", "<sample:0>"}, {"org.mockito.internal.MockHandler", "handle", "org.mockito.internal.invocation.Invocation", "<sample:3>"}}, 3), new String[][]{{"getDefaultAnswer", "", "3"}, {"spiedInstance", "java.lang.Object", "2"}});
  assertNotNull(actual);
  assertEquals("org.mockito.internal.creation.MockSettingsImpl", actual.getClass().getName());
  assertEquals("{getExtraInterfaces=null, isSerializable=false}", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput019() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.mockito.internal.MockHandler", "org.mockito.internal.MockHandler", "getMockSettings", new String[]{}, new String[]{}, false, 17, new String[][]{{"org.mockito.internal.MockHandler", "handle", "org.mockito.internal.invocation.Invocation", "<sample:2>"}, {"org.mockito.internal.MockHandler", "handle", "org.mockito.internal.invocation.Invocation", "<sample:6>"}, {"org.mockito.internal.MockHandler", "handle", "org.mockito.internal.invocation.Invocation", "<sample:3>"}}, 3), new String[][]{{"getDefaultAnswer", "", "3"}, {"spiedInstance", "java.lang.Object", "2"}});
  assertNotNull(actual);
  assertEquals("org.mockito.internal.creation.MockSettingsImpl", actual.getClass().getName());
  assertEquals("{getExtraInterfaces=null, isSerializable=false}", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput020() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.mockito.internal.MockHandler", "org.mockito.internal.MockHandler", "getInvocationContainer", new String[]{}, new String[]{}, false, 1, new String[][]{}, 3);
  assertNotNull(actual);
  assertEquals("org.mockito.internal.stubbing.InvocationContainerImpl", actual.getClass().getName());
  assertEquals("invocationForStubbing: null {hasAnswersForStubbing=false}", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput021() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.mockito.internal.MockitoCore", "org.mockito.internal.MockitoCore", "when", new String[]{"java.lang.Object"}, new String[]{"<sample:0>"}, false, 0, null, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("org.mockito.exceptions.misusing.MissingMethodInvocationException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput022() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.mockito.internal.MockHandler", "org.mockito.internal.MockHandler", "setAnswersForStubbing", new String[]{"java.util.List"}, new String[]{"<empty>"}, false, 0, new String[][]{{"org.mockito.internal.MockHandler", "getInvocationContainer", ""}, {"org.mockito.internal.MockHandler", "voidMethodStubbable", "java.lang.Object", "<s:>"}}, 1);
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput023() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.mockito.internal.MockitoCore", "org.mockito.internal.MockitoCore", "mock", new String[]{"java.lang.Class", "org.mockito.MockSettings"}, new String[]{"<sample:4>", "<sample:3>"}, false, 0, new String[][]{{"org.mockito.internal.MockitoCore", "doAnswer", "org.mockito.stubbing.Answer", "<sample:4>"}, {"org.mockito.internal.MockitoCore", "inOrder", "java.lang.Object[]", "<null>"}, {"org.mockito.internal.MockitoCore", "mock", "java.lang.Class,org.mockito.MockSettings", "<sample:0>", "<sample:4>"}}, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.ClassCastException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput024() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.mockito.internal.MockitoCore", "org.mockito.internal.MockitoCore", "mock", new String[]{"java.lang.Class", "org.mockito.MockSettings"}, new String[]{"<sample:4>", "<sample:4>"}, false, 0, new String[][]{{"org.mockito.internal.MockitoCore", "inOrder", "java.lang.Object[]", "<null>"}, {"org.mockito.internal.MockitoCore", "mock", "java.lang.Class,org.mockito.MockSettings", "<sample:0>", "<sample:4>"}}, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("org.mockito.exceptions.base.MockitoException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput025() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.mockito.internal.MockitoCore", "org.mockito.internal.MockitoCore", "mock", new String[]{"java.lang.Class", "org.mockito.MockSettings"}, new String[]{"<sample:6>", "<sample:4>"}, false, 0, new String[][]{{"org.mockito.internal.MockitoCore", "mock", "java.lang.Class,org.mockito.MockSettings", "<sample:3>", "<null>"}, {"org.mockito.internal.MockitoCore", "stub", "java.lang.Object", "<i:1>"}}, 1), new String[][]{{"retainAll", "java.util.Collection", "1"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput026() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.mockito.internal.MockitoCore", "org.mockito.internal.MockitoCore", "verifyNoMoreInteractions", new String[]{"java.lang.Object[]"}, new String[]{"<sample:0>"}, false, 0, null, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("org.mockito.exceptions.misusing.NotAMockException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput027() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.mockito.internal.MockitoCore", "org.mockito.internal.MockitoCore", "verifyNoMoreInteractions", new String[]{"java.lang.Object[]"}, new String[]{"<null>"}, false, 5, new String[][]{}, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("org.mockito.exceptions.base.MockitoException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput028() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.mockito.internal.MockitoCore", "org.mockito.internal.MockitoCore", "mock", new String[]{"java.lang.Class", "org.mockito.MockSettings"}, new String[]{"<sample:2>", "<sample:3>"}, false, 7, new String[][]{{"org.mockito.internal.MockitoCore", "verify", "java.lang.Object,org.mockito.verification.VerificationMode", "<i:2>", "<sample:4>"}, {"org.mockito.internal.MockitoCore", "inOrder", "java.lang.Object[]", "<empty>"}}, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.ClassCastException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput029() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.mockito.internal.MockitoCore", "org.mockito.internal.MockitoCore", "stub", new String[]{}, new String[]{}, false, 1, new String[][]{{"org.mockito.internal.MockitoCore", "inOrder", "java.lang.Object[]", "<sample:1>"}, {"org.mockito.internal.MockitoCore", "verifyNoMoreInteractionsInOrder", "java.util.List,org.mockito.internal.verification.api.InOrderContext", "<sample:3>", "<sample:7>"}}, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("org.mockito.exceptions.misusing.MissingMethodInvocationException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput030() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.mockito.internal.MockitoCore", "org.mockito.internal.MockitoCore", "when", new String[]{"java.lang.Object"}, new String[]{"<d:1.5>"}, false, 0, null, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("org.mockito.exceptions.misusing.MissingMethodInvocationException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput031() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.mockito.internal.MockitoCore", "org.mockito.internal.MockitoCore", "verifyNoMoreInteractions", new String[]{"java.lang.Object[]"}, new String[]{"<null>"}, false, 1, new String[][]{}, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("org.mockito.exceptions.base.MockitoException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput032() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.mockito.internal.MockitoCore", "org.mockito.internal.MockitoCore", "getLastInvocation", new String[]{}, new String[]{}, false, 1, new String[][]{}, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput033() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.mockito.internal.MockHandler", "org.mockito.internal.MockHandler", "setAnswersForStubbing", new String[]{"java.util.List"}, new String[]{"<sample:0>"}, false, 0, null, 2);
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput034() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.mockito.internal.MockitoCore", "org.mockito.internal.MockitoCore", "stub", new String[]{"java.lang.Object"}, new String[]{"<s:b>"}, false, 0, null, 1);
  assertNotNull(actual);
  assertEquals("org.mockito.internal.stubbing.OngoingStubbingImpl", actual.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput035() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.mockito.internal.MockHandler", "org.mockito.internal.MockHandler", "handle", new String[]{"org.mockito.internal.invocation.Invocation"}, new String[]{"<sample:5>"}, false, 0, new String[][]{{"org.mockito.internal.MockHandler", "getInvocationContainer", ""}, {"org.mockito.internal.MockHandler", "getInvocationContainer", ""}}, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput036() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.mockito.internal.MockHandler", "org.mockito.internal.MockHandler", "handle", new String[]{"org.mockito.internal.invocation.Invocation"}, new String[]{"<sample:5>"}, false, 1, new String[][]{{"org.mockito.internal.MockHandler", "handle", "org.mockito.internal.invocation.Invocation", "<sample:0>"}, {"org.mockito.internal.MockHandler", "getInvocationContainer", ""}, {"org.mockito.internal.MockHandler", "getInvocationContainer", ""}}, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput037() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.mockito.internal.MockHandler", "org.mockito.internal.MockHandler", "handle", new String[]{"org.mockito.internal.invocation.Invocation"}, new String[]{"<sample:6>"}, false, 2, new String[][]{{"org.mockito.internal.MockHandler", "setAnswersForStubbing", "java.util.List", "<sample:3>"}}, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.ClassCastException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput038() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.mockito.internal.MockHandler", "org.mockito.internal.MockHandler", "voidMethodStubbable", new String[]{"java.lang.Object"}, new String[]{"<i:0>"}, false, 0, null, 3);
  assertNotNull(actual);
  assertEquals("org.mockito.internal.stubbing.VoidMethodStubbableImpl", actual.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput039() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.mockito.internal.MockHandler", "org.mockito.internal.MockHandler", "handle", new String[]{"org.mockito.internal.invocation.Invocation"}, new String[]{"<sample:2>"}, false, 2, new String[][]{{"org.mockito.internal.MockHandler", "setAnswersForStubbing", "java.util.List", "<sample:2>"}}, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.ClassCastException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput040() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.mockito.internal.MockitoCore", "org.mockito.internal.MockitoCore", "verify", new String[]{"java.lang.Object", "org.mockito.verification.VerificationMode"}, new String[]{"<s:a>", "<sample:0>"}, false, 4, new String[][]{{"org.mockito.internal.MockitoCore", "verifyNoMoreInteractionsInOrder", "java.util.List,org.mockito.internal.verification.api.InOrderContext", "<null>", "<sample:1>"}}, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("org.mockito.exceptions.misusing.NotAMockException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput041() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.mockito.internal.MockitoCore", "org.mockito.internal.MockitoCore", "stub", new String[]{"java.lang.Object"}, new String[]{"<s:ey>"}, false, 1, new String[][]{{"org.mockito.internal.MockitoCore", "validateMockitoUsage", ""}, {"org.mockito.internal.MockitoCore", "stubVoid", "java.lang.Object", "<d:1.5>"}}, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("org.mockito.exceptions.misusing.MissingMethodInvocationException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput042() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.mockito.internal.MockitoCore", "org.mockito.internal.MockitoCore", "validateMockitoUsage", new String[]{}, new String[]{}, false, 15, new String[][]{{"org.mockito.internal.MockitoCore", "verifyNoMoreInteractions", "java.lang.Object[]", "<sample:4>"}, {"org.mockito.internal.MockitoCore", "reset", "java.lang.Object[]", "<sample:3>"}}, 1);
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput043() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.mockito.internal.MockitoCore", "org.mockito.internal.MockitoCore", "validateMockitoUsage", new String[]{}, new String[]{}, false, 17, new String[][]{{"org.mockito.internal.MockitoCore", "verifyNoMoreInteractions", "java.lang.Object[]", "<sample:1>"}, {"org.mockito.internal.MockitoCore", "when", "java.lang.Object", "<d:-1.5>"}, {"org.mockito.internal.MockitoCore", "reset", "java.lang.Object[]", "<sample:3>"}}, 2);
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput044() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.mockito.internal.MockitoCore", "org.mockito.internal.MockitoCore", "validateMockitoUsage", new String[]{}, new String[]{}, false, 21, new String[][]{{"org.mockito.internal.MockitoCore", "verify", "java.lang.Object,org.mockito.verification.VerificationMode", "<i:1>", "<null>"}, {"org.mockito.internal.MockitoCore", "verifyNoMoreInteractions", "java.lang.Object[]", "<sample:4>"}, {"org.mockito.internal.MockitoCore", "reset", "java.lang.Object[]", "<sample:2>"}}, 3);
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput045() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.mockito.internal.MockitoCore", "org.mockito.internal.MockitoCore", "verify", new String[]{"java.lang.Object", "org.mockito.verification.VerificationMode"}, new String[]{"<s:b>", "<sample:3>"}, false, 0, null, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("org.mockito.exceptions.misusing.NotAMockException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput046() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.mockito.internal.MockitoCore", "org.mockito.internal.MockitoCore", "when", new String[]{"java.lang.Object"}, new String[]{"<sample:0>"}, false, 7, new String[][]{{"org.mockito.internal.MockitoCore", "getLastInvocation", ""}}, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("org.mockito.exceptions.misusing.MissingMethodInvocationException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput047() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.mockito.internal.MockitoCore", "org.mockito.internal.MockitoCore", "stub", new String[]{}, new String[]{}, false, 2, new String[][]{}, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("org.mockito.exceptions.misusing.MissingMethodInvocationException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput048() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.mockito.internal.MockitoCore", "org.mockito.internal.MockitoCore", "reset", new String[]{"java.lang.Object[]"}, new String[]{"<sample:0>"}, false, 0, new String[][]{{"org.mockito.internal.MockitoCore", "reset", "java.lang.Object[]", "<sample:5>"}}, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("org.mockito.exceptions.misusing.NotAMockException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput049() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.mockito.internal.MockitoCore", "org.mockito.internal.MockitoCore", "inOrder", new String[]{"java.lang.Object[]"}, new String[]{"<empty>"}, false, 0, new String[][]{{"org.mockito.internal.MockitoCore", "stubVoid", "java.lang.Object", "<i:-1>"}, {"org.mockito.internal.MockitoCore", "stub", ""}}, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("org.mockito.exceptions.base.MockitoException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput050() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.mockito.internal.MockitoCore", "org.mockito.internal.MockitoCore", "inOrder", new String[]{"java.lang.Object[]"}, new String[]{"<sample:1>"}, false, 1, new String[][]{{"org.mockito.internal.MockitoCore", "stubVoid", "java.lang.Object", "<i:-1>"}, {"org.mockito.internal.MockitoCore", "stub", ""}, {"org.mockito.internal.MockitoCore", "stub", ""}}, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("org.mockito.exceptions.misusing.NotAMockException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput051() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.mockito.internal.MockHandler", "org.mockito.internal.MockHandler", "getInvocationContainer", new String[]{}, new String[]{}, false, 4, new String[][]{{"org.mockito.internal.MockHandler", "handle", "org.mockito.internal.invocation.Invocation", "<sample:2>"}}, 2), new String[][]{{"addAnswerForVoidMethod", "org.mockito.stubbing.Answer", "0"}, {"addAnswer", "org.mockito.stubbing.Answer,boolean", "3"}});
  assertNotNull(actual);
  assertEquals("org.mockito.internal.stubbing.InvocationContainerImpl", actual.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput052() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.mockito.internal.MockHandler", "org.mockito.internal.MockHandler", "getInvocationContainer", new String[]{}, new String[]{}, false, 10, new String[][]{{"org.mockito.internal.MockHandler", "handle", "org.mockito.internal.invocation.Invocation", "<sample:4>"}, {"org.mockito.internal.MockHandler", "voidMethodStubbable", "java.lang.Object", "<s:c>"}}, 2), new String[][]{{"addAnswerForVoidMethod", "org.mockito.stubbing.Answer", "0"}, {"addAnswer", "org.mockito.stubbing.Answer,boolean", "3"}, {"addAnswer", "org.mockito.stubbing.Answer", "6"}, {"getStubbedInvocations", "", "3"}});
  assertNotNull(actual);
  assertEquals("java.util.LinkedList", actual.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput053() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.mockito.internal.MockitoCore", "org.mockito.internal.MockitoCore", "stub", new String[]{"java.lang.Object"}, new String[]{"<b:false>"}, false, 10, new String[][]{}, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("org.mockito.exceptions.misusing.MissingMethodInvocationException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput054() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.mockito.internal.MockitoCore", "org.mockito.internal.MockitoCore", "doAnswer", new String[]{"org.mockito.stubbing.Answer"}, new String[]{"<null>"}, false, 0, null, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("org.mockito.exceptions.misusing.UnfinishedStubbingException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput055() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.mockito.internal.MockitoCore", "org.mockito.internal.MockitoCore", "doAnswer", new String[]{"org.mockito.stubbing.Answer"}, new String[]{"<sample:6>"}, false, 0, null, 2);
  assertNotNull(actual);
  assertEquals("org.mockito.internal.stubbing.StubberImpl", actual.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput056() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.mockito.internal.MockHandler", "org.mockito.internal.MockHandler", "handle", new String[]{"org.mockito.internal.invocation.Invocation"}, new String[]{"<sample:3>"}, false, 0, null, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput057() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.mockito.internal.MockitoCore", "org.mockito.internal.MockitoCore", "doAnswer", new String[]{"org.mockito.stubbing.Answer"}, new String[]{"<sample:3>"}, false, 5, new String[][]{{"org.mockito.internal.MockitoCore", "doAnswer", "org.mockito.stubbing.Answer", "<sample:1>"}}, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("org.mockito.exceptions.misusing.UnfinishedStubbingException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput058() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.mockito.internal.MockHandler", "org.mockito.internal.MockHandler", "getMockSettings", new String[]{}, new String[]{}, false, 3, new String[][]{{"org.mockito.internal.MockHandler", "voidMethodStubbable", "java.lang.Object", "<s:a>"}, {"org.mockito.internal.MockHandler", "setAnswersForStubbing", "java.util.List", "<null>"}}, 2);
  assertNotNull(actual);
  assertEquals("org.mockito.internal.creation.MockSettingsImpl", actual.getClass().getName());
  assertEquals("{getExtraInterfaces=null, isSerializable=false}", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput059() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.mockito.internal.MockHandler", "org.mockito.internal.MockHandler", "setAnswersForStubbing", new String[]{"java.util.List"}, new String[]{"<sample:0>"}, false, 1, new String[][]{{"org.mockito.internal.MockHandler", "handle", "org.mockito.internal.invocation.Invocation", "<sample:6>"}}, 3);
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput060() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.mockito.internal.MockitoCore", "org.mockito.internal.MockitoCore", "inOrder", new String[]{"java.lang.Object[]"}, new String[]{"<sample:5>"}, false, 0, null, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("org.mockito.exceptions.misusing.NotAMockException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput061() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.mockito.internal.MockitoCore", "org.mockito.internal.MockitoCore", "inOrder", new String[]{"java.lang.Object[]"}, new String[]{"<sample:3>"}, false, 0, new String[][]{{"org.mockito.internal.MockitoCore", "verifyNoMoreInteractions", "java.lang.Object[]", "<sample:1>"}, {"org.mockito.internal.MockitoCore", "getLastInvocation", ""}, {"org.mockito.internal.MockitoCore", "verify", "java.lang.Object,org.mockito.verification.VerificationMode", "<i:1>", "<sample:4>"}}, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("org.mockito.exceptions.misusing.NotAMockException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput062() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.mockito.internal.MockitoCore", "org.mockito.internal.MockitoCore", "verifyNoMoreInteractionsInOrder", new String[]{"java.util.List", "org.mockito.internal.verification.api.InOrderContext"}, new String[]{"<empty>", "<sample:5>"}, false, 0, null, 1);
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput063() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.mockito.internal.MockitoCore", "org.mockito.internal.MockitoCore", "mock", new String[]{"java.lang.Class", "org.mockito.MockSettings"}, new String[]{"<sample:0>", "<sample:2>"}, false, 0, null, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.ClassCastException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput064() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.mockito.internal.MockitoCore", "org.mockito.internal.MockitoCore", "getLastInvocation", new String[]{}, new String[]{}, false, 0, null, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput065() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.mockito.internal.MockitoCore", "org.mockito.internal.MockitoCore", "reset", new String[]{"java.lang.Object[]"}, new String[]{"<sample:3>"}, false, 0, new String[][]{{"org.mockito.internal.MockitoCore", "getLastInvocation", ""}}, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("org.mockito.exceptions.misusing.NotAMockException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput066() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.mockito.internal.MockitoCore", "org.mockito.internal.MockitoCore", "verifyNoMoreInteractionsInOrder", new String[]{"java.util.List", "org.mockito.internal.verification.api.InOrderContext"}, new String[]{"<sample:2>", "<sample:9>"}, false, 1, new String[][]{{"org.mockito.internal.MockitoCore", "verifyNoMoreInteractions", "java.lang.Object[]", "<empty>"}}, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("org.mockito.exceptions.misusing.NotAMockException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput067() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.mockito.internal.MockHandler", "org.mockito.internal.MockHandler", "getInvocationContainer", new String[]{}, new String[]{}, false, 5, new String[][]{{"org.mockito.internal.MockHandler", "handle", "org.mockito.internal.invocation.Invocation", "<sample:4>"}, {"org.mockito.internal.MockHandler", "getMockSettings", ""}, {"org.mockito.internal.MockHandler", "voidMethodStubbable", "java.lang.Object", "<sample:1>"}}, 3), new String[][]{{"addAnswer", "org.mockito.stubbing.Answer,boolean", "0"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.util.NoSuchElementException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput068() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.mockito.internal.MockHandler", "org.mockito.internal.MockHandler", "getInvocationContainer", new String[]{}, new String[]{}, false, 6, new String[][]{{"org.mockito.internal.MockHandler", "getMockSettings", ""}}, 3), new String[][]{{"addAnswer", "org.mockito.stubbing.Answer,boolean", "0"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput069() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.mockito.internal.MockitoCore", "org.mockito.internal.MockitoCore", "reset", new String[]{"java.lang.Object[]"}, new String[]{"<empty>"}, false, 0, null, 1);
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput070() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.mockito.internal.MockitoCore", "org.mockito.internal.MockitoCore", "reset", new String[]{"java.lang.Object[]"}, new String[]{"<sample:5>"}, false, 0, null, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("org.mockito.exceptions.misusing.NotAMockException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput071() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.mockito.internal.MockHandler", "org.mockito.internal.MockHandler", "getMockSettings", new String[]{}, new String[]{}, false, 2, new String[][]{{"org.mockito.internal.MockHandler", "getInvocationContainer", ""}}, 1);
  assertNotNull(actual);
  assertEquals("org.mockito.internal.creation.MockSettingsImpl", actual.getClass().getName());
  assertEquals("{getExtraInterfaces=null, isSerializable=false}", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput072() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.mockito.internal.MockHandler", "org.mockito.internal.MockHandler", "getMockSettings", new String[]{}, new String[]{}, false, 2, new String[][]{{"org.mockito.internal.MockHandler", "getInvocationContainer", ""}}, 1), new String[][]{{"getExtraInterfaces", "", "2"}});
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput073() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.mockito.internal.MockitoCore", "org.mockito.internal.MockitoCore", "mock", new String[]{"java.lang.Class", "org.mockito.MockSettings"}, new String[]{"<sample:0>", "<sample:8>"}, false, 0, null, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("org.mockito.exceptions.base.MockitoException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput074() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.mockito.internal.MockitoCore", "org.mockito.internal.MockitoCore", "mock", new String[]{"java.lang.Class", "org.mockito.MockSettings"}, new String[]{"<sample:6>", "<sample:4>"}, false, 0, new String[][]{{"org.mockito.internal.MockitoCore", "doAnswer", "org.mockito.stubbing.Answer", "<sample:4>"}}, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("org.mockito.exceptions.misusing.UnfinishedStubbingException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput075() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.mockito.internal.MockitoCore", "org.mockito.internal.MockitoCore", "verify", new String[]{"java.lang.Object", "org.mockito.verification.VerificationMode"}, new String[]{"<null>", "<sample:6>"}, false, 1, new String[][]{{"org.mockito.internal.MockitoCore", "mock", "java.lang.Class,org.mockito.MockSettings", "<empty>", "<sample:5>"}, {"org.mockito.internal.MockitoCore", "verifyNoMoreInteractions", "java.lang.Object[]", "<sample:4>"}}, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("org.mockito.exceptions.misusing.NullInsteadOfMockException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput076() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.mockito.internal.MockitoCore", "org.mockito.internal.MockitoCore", "when", new String[]{"java.lang.Object"}, new String[]{"<null>"}, false, 0, new String[][]{{"org.mockito.internal.MockitoCore", "verifyNoMoreInteractionsInOrder", "java.util.List,org.mockito.internal.verification.api.InOrderContext", "<sample:2>", "<sample:7>"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("org.mockito.exceptions.misusing.MissingMethodInvocationException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput077() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.mockito.internal.MockitoCore", "org.mockito.internal.MockitoCore", "stubVoid", new String[]{"java.lang.Object"}, new String[]{"<s:a>"}, false); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("org.mockito.exceptions.misusing.NotAMockException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput078() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.mockito.internal.MockitoCore", "org.mockito.internal.MockitoCore", "inOrder", new String[]{"java.lang.Object[]"}, new String[]{"<sample:2>"}, false); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("org.mockito.exceptions.misusing.NotAMockException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput079() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.mockito.internal.MockitoCore", "org.mockito.internal.MockitoCore", "inOrder", new String[]{"java.lang.Object[]"}, new String[]{"<sample:4>"}, false, 1, new String[][]{{"org.mockito.internal.MockitoCore", "verify", "java.lang.Object,org.mockito.verification.VerificationMode", "<i:1>", "<sample:3>"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("org.mockito.exceptions.misusing.NotAMockException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput080() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.mockito.internal.MockitoCore", "org.mockito.internal.MockitoCore", "inOrder", new String[]{"java.lang.Object[]"}, new String[]{"<sample:3>"}, false, 1, new String[][]{{"org.mockito.internal.MockitoCore", "reset", "java.lang.Object[]", "<sample:2>"}, {"org.mockito.internal.MockitoCore", "verify", "java.lang.Object,org.mockito.verification.VerificationMode", "<i:1>", "<sample:3>"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("org.mockito.exceptions.misusing.NotAMockException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput081() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.mockito.internal.MockitoCore", "org.mockito.internal.MockitoCore", "verify", new String[]{"java.lang.Object", "org.mockito.verification.VerificationMode"}, new String[]{"<s:c>", "<sample:4>"}, false); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("org.mockito.exceptions.misusing.NotAMockException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput082() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.mockito.internal.MockitoCore", "org.mockito.internal.MockitoCore", "doAnswer", new String[]{"org.mockito.stubbing.Answer"}, new String[]{"<sample:2>"}, false, 0, new String[][]{{"org.mockito.internal.MockitoCore", "reset", "java.lang.Object[]", "<sample:0>"}});
  assertNotNull(actual);
  assertEquals("org.mockito.internal.stubbing.StubberImpl", actual.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput083() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.mockito.internal.MockitoCore", "org.mockito.internal.MockitoCore", "doAnswer", new String[]{"org.mockito.stubbing.Answer"}, new String[]{"<sample:1>"}, false, 10, new String[][]{{"org.mockito.internal.MockitoCore", "validateMockitoUsage", ""}, {"org.mockito.internal.MockitoCore", "stub", "java.lang.Object", "<i:-1>"}});
  assertNotNull(actual);
  assertEquals("org.mockito.internal.stubbing.StubberImpl", actual.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput084() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.mockito.internal.MockHandler", "org.mockito.internal.MockHandler", "getMockSettings", new String[]{}, new String[]{}, false);
  assertNotNull(actual);
  assertEquals("org.mockito.internal.creation.MockSettingsImpl", actual.getClass().getName());
  assertEquals("{getExtraInterfaces=null, isSerializable=false}", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput085() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.mockito.internal.MockHandler", "org.mockito.internal.MockHandler", "getMockSettings", new String[]{}, new String[]{}, false, 1, new String[][]{});
  assertNotNull(actual);
  assertEquals("org.mockito.internal.creation.MockSettingsImpl", actual.getClass().getName());
  assertEquals("{getExtraInterfaces=null, isSerializable=false}", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput086() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.mockito.internal.MockHandler", "org.mockito.internal.MockHandler", "getMockSettings", new String[]{}, new String[]{}, false, 2, new String[][]{{"org.mockito.internal.MockHandler", "handle", "org.mockito.internal.invocation.Invocation", "<sample:7>"}}), new String[][]{{"getDefaultAnswer", "", "6"}});
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput087() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.mockito.internal.MockitoCore", "org.mockito.internal.MockitoCore", "validateMockitoUsage", new String[]{}, new String[]{}, false);
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput088() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.mockito.internal.MockHandler", "org.mockito.internal.MockHandler", "getInvocationContainer", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.mockito.internal.MockHandler", "voidMethodStubbable", "java.lang.Object", "<b:true>"}});
  assertNotNull(actual);
  assertEquals("org.mockito.internal.stubbing.InvocationContainerImpl", actual.getClass().getName());
  assertEquals("invocationForStubbing: null {hasAnswersForStubbing=false}", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput089() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.mockito.internal.MockHandler", "org.mockito.internal.MockHandler", "voidMethodStubbable", new String[]{"java.lang.Object"}, new String[]{"<sample:1>"}, false, 0, new String[][]{{"org.mockito.internal.MockHandler", "voidMethodStubbable", "java.lang.Object", "<s:>"}, {"org.mockito.internal.MockHandler", "voidMethodStubbable", "java.lang.Object", "<s:c>"}});
  assertNotNull(actual);
  assertEquals("org.mockito.internal.stubbing.VoidMethodStubbableImpl", actual.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput090() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.mockito.internal.MockitoCore", "org.mockito.internal.MockitoCore", "verifyNoMoreInteractionsInOrder", new String[]{"java.util.List", "org.mockito.internal.verification.api.InOrderContext"}, new String[]{"<sample:3>", "<sample:4>"}, false, 2, new String[][]{{"org.mockito.internal.MockitoCore", "verify", "java.lang.Object,org.mockito.verification.VerificationMode", "<b:true>", "<sample:1>"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("org.mockito.exceptions.misusing.NotAMockException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput091() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.mockito.internal.MockitoCore", "org.mockito.internal.MockitoCore", "verifyNoMoreInteractionsInOrder", new String[]{"java.util.List", "org.mockito.internal.verification.api.InOrderContext"}, new String[]{"<null>", "<sample:4>"}, false, 2, new String[][]{{"org.mockito.internal.MockitoCore", "verify", "java.lang.Object,org.mockito.verification.VerificationMode", "<b:true>", "<sample:1>"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput092() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.mockito.internal.MockHandler", "org.mockito.internal.MockHandler", "setAnswersForStubbing", new String[]{"java.util.List"}, new String[]{"<sample:0>"}, false);
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput093() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.mockito.internal.MockHandler", "org.mockito.internal.MockHandler", "setAnswersForStubbing", new String[]{"java.util.List"}, new String[]{"<null>"}, false, 0, new String[][]{{"org.mockito.internal.MockHandler", "getInvocationContainer", ""}, {"org.mockito.internal.MockHandler", "voidMethodStubbable", "java.lang.Object", "<s:>"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput094() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.mockito.internal.MockitoCore", "org.mockito.internal.MockitoCore", "mock", new String[]{"java.lang.Class", "org.mockito.MockSettings"}, new String[]{"<sample:2>", "<sample:9>"}, false); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.ClassCastException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput095() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.mockito.internal.MockitoCore", "org.mockito.internal.MockitoCore", "reset", new String[]{"java.lang.Object[]"}, new String[]{"<sample:1>"}, false); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("org.mockito.exceptions.misusing.NotAMockException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput096() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.mockito.internal.MockitoCore", "org.mockito.internal.MockitoCore", "reset", new String[]{"java.lang.Object[]"}, new String[]{"<null>"}, false); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput097() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.mockito.internal.MockitoCore", "org.mockito.internal.MockitoCore", "reset", new String[]{"java.lang.Object[]"}, new String[]{"<empty>"}, false);
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput098() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.mockito.internal.MockitoCore", "org.mockito.internal.MockitoCore", "verifyNoMoreInteractions", new String[]{"java.lang.Object[]"}, new String[]{"<sample:1>"}, false); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("org.mockito.exceptions.misusing.NotAMockException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput099() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.mockito.internal.MockitoCore", "org.mockito.internal.MockitoCore", "verifyNoMoreInteractions", new String[]{"java.lang.Object[]"}, new String[]{"<empty>"}, false, 0, new String[][]{{"org.mockito.internal.MockitoCore", "getLastInvocation", ""}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("org.mockito.exceptions.base.MockitoException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput100() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.mockito.internal.MockitoCore", "org.mockito.internal.MockitoCore", "stub", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.mockito.internal.MockitoCore", "inOrder", "java.lang.Object[]", "<sample:1>"}, {"org.mockito.internal.MockitoCore", "verifyNoMoreInteractionsInOrder", "java.util.List,org.mockito.internal.verification.api.InOrderContext", "<sample:3>", "<sample:7>"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("org.mockito.exceptions.misusing.MissingMethodInvocationException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput101() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.mockito.internal.MockHandler", "org.mockito.internal.MockHandler", "getMockSettings", new String[]{}, new String[]{}, false, 4, new String[][]{{"org.mockito.internal.MockHandler", "handle", "org.mockito.internal.invocation.Invocation", "<sample:5>"}, {"org.mockito.internal.MockHandler", "setAnswersForStubbing", "java.util.List", "<sample:0>"}}), new String[][]{{"getMockName", "", "6"}});
  assertNotNull(actual);
  assertEquals("org.mockito.internal.util.MockName", actual.getClass().getName());
  assertEquals("string {isSurrogate=true}", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput102() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.mockito.internal.MockHandler", "org.mockito.internal.MockHandler", "getMockSettings", new String[]{}, new String[]{}, false, 13, new String[][]{{"org.mockito.internal.MockHandler", "handle", "org.mockito.internal.invocation.Invocation", "<sample:2>"}, {"org.mockito.internal.MockHandler", "setAnswersForStubbing", "java.util.List", "<sample:1>"}, {"org.mockito.internal.MockHandler", "voidMethodStubbable", "java.lang.Object", "<s:key>"}}), new String[][]{{"getSpiedInstance", "", "5"}, {"isSerializable", "", "6"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput103() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.mockito.internal.MockHandler", "org.mockito.internal.MockHandler", "getMockSettings", new String[]{}, new String[]{}, false, 13, new String[][]{{"org.mockito.internal.MockHandler", "handle", "org.mockito.internal.invocation.Invocation", "<sample:2>"}, {"org.mockito.internal.MockHandler", "voidMethodStubbable", "java.lang.Object", "<s:key>"}}), new String[][]{{"serializable", "", "5"}, {"isSerializable", "", "6"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput104() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.mockito.internal.MockitoCore", "org.mockito.internal.MockitoCore", "getLastInvocation", new String[]{}, new String[]{}, false, 1, new String[][]{}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput105() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.mockito.internal.MockHandler", "org.mockito.internal.MockHandler", "getInvocationContainer", new String[]{}, new String[]{}, false), new String[][]{{"setInvocationForPotentialStubbing", "org.mockito.internal.invocation.InvocationMatcher", "0"}, {"hasAnswersForStubbing", "", "2"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput106() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.mockito.internal.MockHandler", "org.mockito.internal.MockHandler", "getInvocationContainer", new String[]{}, new String[]{}, false), new String[][]{{"hasAnswersForStubbing", "", "1"}, {"getInvocations", "", "4"}, {"lastIndexOf", "java.lang.Object", "2"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("-1", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput107() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.mockito.internal.MockitoCore", "org.mockito.internal.MockitoCore", "verifyNoMoreInteractionsInOrder", new String[]{"java.util.List", "org.mockito.internal.verification.api.InOrderContext"}, new String[]{"<empty>", "<sample:5>"}, false, 0, new String[][]{{"org.mockito.internal.MockitoCore", "verifyNoMoreInteractions", "java.lang.Object[]", "<sample:3>"}});
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput108() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.mockito.internal.MockHandler", "org.mockito.internal.MockHandler", "handle", new String[]{"org.mockito.internal.invocation.Invocation"}, new String[]{"<sample:6>"}, false, 0, new String[][]{{"org.mockito.internal.MockHandler", "getMockSettings", ""}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput109() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.mockito.internal.MockHandler", "org.mockito.internal.MockHandler", "handle", new String[]{"org.mockito.internal.invocation.Invocation"}, new String[]{"<sample:5>"}, false, 1, new String[][]{{"org.mockito.internal.MockHandler", "setAnswersForStubbing", "java.util.List", "<sample:3>"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.ClassCastException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput110() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.mockito.internal.MockHandler", "org.mockito.internal.MockHandler", "getInvocationContainer", new String[]{}, new String[]{}, false), new String[][]{{"resetInvocationForPotentialStubbing", "org.mockito.internal.invocation.InvocationMatcher", "6"}});
  assertNotNull(actual);
  assertEquals("org.mockito.internal.stubbing.InvocationContainerImpl", actual.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput111() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.mockito.internal.MockHandler", "org.mockito.internal.MockHandler", "getInvocationContainer", new String[]{}, new String[]{}, false), new String[][]{{"resetInvocationForPotentialStubbing", "org.mockito.internal.invocation.InvocationMatcher", "6"}, {"addAnswer", "org.mockito.stubbing.Answer", "2"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IndexOutOfBoundsException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput112() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.mockito.internal.MockitoCore", "org.mockito.internal.MockitoCore", "mock", new String[]{"java.lang.Class", "org.mockito.MockSettings"}, new String[]{"<empty>", "<null>"}, false); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("org.mockito.exceptions.base.MockitoException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput113() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.mockito.internal.MockitoCore", "org.mockito.internal.MockitoCore", "mock", new String[]{"java.lang.Class", "org.mockito.MockSettings"}, new String[]{"<null>", "<sample:4>"}, false, 1, new String[][]{}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput114() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.mockito.internal.MockitoCore", "org.mockito.internal.MockitoCore", "doAnswer", new String[]{"org.mockito.stubbing.Answer"}, new String[]{"<sample:3>"}, false, 0, new String[][]{{"org.mockito.internal.MockitoCore", "inOrder", "java.lang.Object[]", "<sample:4>"}}), new String[][]{{"doReturn", "java.lang.Object", "7"}, {"doAnswer", "org.mockito.stubbing.Answer", "5"}, {"when", "java.lang.Object", "7"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("org.mockito.exceptions.misusing.NotAMockException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput115() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.mockito.internal.MockitoCore", "org.mockito.internal.MockitoCore", "inOrder", new String[]{"java.lang.Object[]"}, new String[]{"<empty>"}, false, 0, new String[][]{{"org.mockito.internal.MockitoCore", "reset", "java.lang.Object[]", "<sample:0>"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("org.mockito.exceptions.base.MockitoException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput116() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.mockito.internal.MockHandler", "org.mockito.internal.MockHandler", "getInvocationContainer", new String[]{}, new String[]{}, false, 13, new String[][]{{"org.mockito.internal.MockHandler", "getInvocationContainer", ""}, {"org.mockito.internal.MockHandler", "handle", "org.mockito.internal.invocation.Invocation", "<sample:4>"}, {"org.mockito.internal.MockHandler", "voidMethodStubbable", "java.lang.Object", "<s:}>"}}), new String[][]{{"addAnswerForVoidMethod", "org.mockito.stubbing.Answer", "0"}, {"addAnswer", "org.mockito.stubbing.Answer,boolean", "3"}, {"addAnswer", "org.mockito.stubbing.Answer", "6"}, {"getStubbedInvocations", "", "3"}});
  assertNotNull(actual);
  assertEquals("java.util.LinkedList", actual.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput117() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.mockito.internal.MockitoCore", "org.mockito.internal.MockitoCore", "mock", new String[]{"java.lang.Class", "org.mockito.MockSettings"}, new String[]{"<sample:5>", "<sample:6>"}, false, 14, new String[][]{{"org.mockito.internal.MockitoCore", "doAnswer", "org.mockito.stubbing.Answer", "<sample:4>"}, {"org.mockito.internal.MockitoCore", "verifyNoMoreInteractions", "java.lang.Object[]", "<sample:1>"}, {"org.mockito.internal.MockitoCore", "stub", ""}}), new String[][]{{"getCallback", "int", "6"}});
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput118() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.mockito.internal.MockitoCore", "org.mockito.internal.MockitoCore", "stub", new String[]{}, new String[]{}, false, 1, new String[][]{{"org.mockito.internal.MockitoCore", "validateMockitoUsage", ""}}), new String[][]{{"toReturn", "java.lang.Object", "0"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("org.mockito.exceptions.misusing.WrongTypeOfReturnValue", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput119() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.mockito.internal.MockHandler", "org.mockito.internal.MockHandler", "getInvocationContainer", new String[]{}, new String[]{}, false, 2, new String[][]{{"org.mockito.internal.MockHandler", "getMockSettings", ""}}), new String[][]{{"addAnswer", "org.mockito.stubbing.Answer,boolean", "0"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput120() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.mockito.internal.MockHandler", "org.mockito.internal.MockHandler", "getInvocationContainer", new String[]{}, new String[]{}, false, 5, new String[][]{{"org.mockito.internal.MockHandler", "handle", "org.mockito.internal.invocation.Invocation", "<sample:4>"}, {"org.mockito.internal.MockHandler", "getMockSettings", ""}, {"org.mockito.internal.MockHandler", "voidMethodStubbable", "java.lang.Object", "<sample:1>"}}), new String[][]{{"addAnswer", "org.mockito.stubbing.Answer,boolean", "0"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.util.NoSuchElementException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput121() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.mockito.internal.MockHandler", "org.mockito.internal.MockHandler", "voidMethodStubbable", new String[]{"java.lang.Object"}, new String[]{"<b:true>"}, false, 0, new String[][]{{"org.mockito.internal.MockHandler", "voidMethodStubbable", "java.lang.Object", "<i:0>"}}), new String[][]{{"toAnswer", "org.mockito.stubbing.Answer", "2"}, {"toAnswer", "org.mockito.stubbing.Answer", "7"}, {"on", "", "3"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput122() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.mockito.internal.MockitoCore", "org.mockito.internal.MockitoCore", "verify", new String[]{"java.lang.Object", "org.mockito.verification.VerificationMode"}, new String[]{"<null>", "<sample:6>"}, false, 1, new String[][]{{"org.mockito.internal.MockitoCore", "mock", "java.lang.Class,org.mockito.MockSettings", "<empty>", "<sample:5>"}, {"org.mockito.internal.MockitoCore", "verifyNoMoreInteractions", "java.lang.Object[]", "<sample:4>"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("org.mockito.exceptions.misusing.NullInsteadOfMockException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput123() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.mockito.internal.MockitoCore", "org.mockito.internal.MockitoCore", "doAnswer", new String[]{"org.mockito.stubbing.Answer"}, new String[]{"<sample:3>"}, false, 0, null, 2), new String[][]{{"when", "java.lang.Object", "1"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("org.mockito.exceptions.misusing.NotAMockException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput124() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.mockito.internal.MockitoCore", "org.mockito.internal.MockitoCore", "when", new String[]{"java.lang.Object"}, new String[]{"<s:>"}, false, 0, null, 1);
  assertNotNull(actual);
  assertEquals("org.mockito.internal.stubbing.OngoingStubbingImpl", actual.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput125() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.mockito.internal.MockHandler", "org.mockito.internal.MockHandler", "getInvocationContainer", new String[]{}, new String[]{}, false, 0, null, 2);
  assertNotNull(actual);
  assertEquals("org.mockito.internal.stubbing.InvocationContainerImpl", actual.getClass().getName());
  assertEquals("invocationForStubbing: null {hasAnswersForStubbing=false}", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput126() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.mockito.internal.MockHandler", "org.mockito.internal.MockHandler", "getInvocationContainer", new String[]{}, new String[]{}, false, 4, new String[][]{{"org.mockito.internal.MockHandler", "handle", "org.mockito.internal.invocation.Invocation", "<sample:2>"}}, 2), new String[][]{{"findAnswerFor", "org.mockito.internal.invocation.Invocation", "7"}});
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput127() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.mockito.internal.MockHandler", "org.mockito.internal.MockHandler", "getInvocationContainer", new String[]{}, new String[]{}, false, 12, new String[][]{{"org.mockito.internal.MockHandler", "handle", "org.mockito.internal.invocation.Invocation", "<sample:1>"}, {"org.mockito.internal.MockHandler", "getMockSettings", ""}}, 1), new String[][]{{"findAnswerFor", "org.mockito.internal.invocation.Invocation", "7"}, {"getInvocations", "", "3"}, {"offerLast", "java.lang.Object", "0"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput128() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.mockito.internal.MockHandler", "org.mockito.internal.MockHandler", "getInvocationContainer", new String[]{}, new String[]{}, false, 12, new String[][]{{"org.mockito.internal.MockHandler", "getInvocationContainer", ""}, {"org.mockito.internal.MockHandler", "handle", "org.mockito.internal.invocation.Invocation", "<sample:5>"}, {"org.mockito.internal.MockHandler", "getMockSettings", ""}}, 1), new String[][]{{"findAnswerFor", "org.mockito.internal.invocation.Invocation", "7"}, {"addAnswer", "org.mockito.stubbing.Answer,boolean", "6"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.util.NoSuchElementException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput129() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.mockito.internal.MockHandler", "org.mockito.internal.MockHandler", "getInvocationContainer", new String[]{}, new String[]{}, false, 14, new String[][]{{"org.mockito.internal.MockHandler", "getInvocationContainer", ""}, {"org.mockito.internal.MockHandler", "handle", "org.mockito.internal.invocation.Invocation", "<null>"}, {"org.mockito.internal.MockHandler", "getMockSettings", ""}}, 1), new String[][]{{"findAnswerFor", "org.mockito.internal.invocation.Invocation", "7"}, {"addAnswer", "org.mockito.stubbing.Answer,boolean", "6"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput130() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.mockito.internal.MockitoCore", "org.mockito.internal.MockitoCore", "verifyNoMoreInteractions", new String[]{"java.lang.Object[]"}, new String[]{"<sample:5>"}, false, 5, new String[][]{{"org.mockito.internal.MockitoCore", "doAnswer", "org.mockito.stubbing.Answer", "<sample:0>"}}, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("org.mockito.exceptions.misusing.UnfinishedStubbingException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput131() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.mockito.internal.MockitoCore", "org.mockito.internal.MockitoCore", "reset", new String[]{"java.lang.Object[]"}, new String[]{"<empty>"}, false, 0, null, 2);
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput132() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.mockito.internal.MockitoCore", "org.mockito.internal.MockitoCore", "verifyNoMoreInteractions", new String[]{"java.lang.Object[]"}, new String[]{"<sample:0>"}, false, 0, new String[][]{{"org.mockito.internal.MockitoCore", "validateMockitoUsage", ""}}, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("org.mockito.exceptions.misusing.NotAMockException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput133() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.mockito.internal.MockitoCore", "org.mockito.internal.MockitoCore", "verifyNoMoreInteractions", new String[]{"java.lang.Object[]"}, new String[]{"<empty>"}, false, 2, new String[][]{{"org.mockito.internal.MockitoCore", "inOrder", "java.lang.Object[]", "<sample:0>"}, {"org.mockito.internal.MockitoCore", "when", "java.lang.Object", "<i:-2147483648>"}}, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("org.mockito.exceptions.base.MockitoException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput134() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.mockito.internal.MockitoCore", "org.mockito.internal.MockitoCore", "mock", new String[]{"java.lang.Class", "org.mockito.MockSettings"}, new String[]{"<sample:6>", "<null>"}, false, 0, new String[][]{{"org.mockito.internal.MockitoCore", "stub", "java.lang.Object", "<s:key>"}, {"org.mockito.internal.MockitoCore", "reset", "java.lang.Object[]", "<sample:3>"}}, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput135() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.mockito.internal.MockHandler", "org.mockito.internal.MockHandler", "voidMethodStubbable", new String[]{"java.lang.Object"}, new String[]{"<i:-16386>"}, false, 11, new String[][]{{"org.mockito.internal.MockHandler", "handle", "org.mockito.internal.invocation.Invocation", "<sample:2>"}, {"org.mockito.internal.MockHandler", "voidMethodStubbable", "java.lang.Object", "<s:[{>"}}), new String[][]{{"on", "", "3"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("-16386", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput136() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.mockito.internal.MockitoCore", "org.mockito.internal.MockitoCore", "inOrder", new String[]{"java.lang.Object[]"}, new String[]{"<null>"}, false, 15, new String[][]{}, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("org.mockito.exceptions.base.MockitoException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput137() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.mockito.internal.MockitoCore", "org.mockito.internal.MockitoCore", "getLastInvocation", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.mockito.internal.MockitoCore", "verifyNoMoreInteractionsInOrder", "java.util.List,org.mockito.internal.verification.api.InOrderContext", "<sample:2>", "<sample:4>"}}, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput138() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.mockito.internal.MockHandler", "org.mockito.internal.MockHandler", "getInvocationContainer", new String[]{}, new String[]{}, false, 5, new String[][]{{"org.mockito.internal.MockHandler", "setAnswersForStubbing", "java.util.List", "<sample:3>"}, {"org.mockito.internal.MockHandler", "setAnswersForStubbing", "java.util.List", "<null>"}}, 1), new String[][]{{"addAnswerForVoidMethod", "org.mockito.stubbing.Answer", "4"}});
  assertNotNull(actual);
  assertEquals("org.mockito.internal.stubbing.InvocationContainerImpl", actual.getClass().getName());
  assertEquals("invocationForStubbing: null {hasAnswersForStubbing=true}", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput139() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.mockito.internal.MockHandler", "org.mockito.internal.MockHandler", "getMockSettings", new String[]{}, new String[]{}, false, 3, new String[][]{{"org.mockito.internal.MockHandler", "getInvocationContainer", ""}, {"org.mockito.internal.MockHandler", "getInvocationContainer", ""}}, 2), new String[][]{{"spiedInstance", "java.lang.Object", "4"}, {"isSerializable", "", "2"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput140() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.mockito.internal.MockitoCore", "org.mockito.internal.MockitoCore", "reset", new String[]{"java.lang.Object[]"}, new String[]{"<null>"}, false, 1, new String[][]{{"org.mockito.internal.MockitoCore", "stubVoid", "java.lang.Object", "<i:1>"}, {"org.mockito.internal.MockitoCore", "verifyNoMoreInteractionsInOrder", "java.util.List,org.mockito.internal.verification.api.InOrderContext", "<sample:3>", "<sample:8>"}, {"org.mockito.internal.MockitoCore", "stub", "java.lang.Object", "<d:15.0>"}}, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput141() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.mockito.internal.MockitoCore", "org.mockito.internal.MockitoCore", "mock", new String[]{"java.lang.Class", "org.mockito.MockSettings"}, new String[]{"<sample:6>", "<sample:6>"}, false, 0, new String[][]{{"org.mockito.internal.MockitoCore", "reset", "java.lang.Object[]", "<empty>"}, {"org.mockito.internal.MockitoCore", "stubVoid", "java.lang.Object", "<i:1>"}}, 3), new String[][]{{"newInstance", "org.mockito.cglib.proxy.Callback[]", "6"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.ArrayIndexOutOfBoundsException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput142() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.mockito.internal.MockitoCore", "org.mockito.internal.MockitoCore", "verifyNoMoreInteractionsInOrder", new String[]{"java.util.List", "org.mockito.internal.verification.api.InOrderContext"}, new String[]{"<sample:1>", "<sample:5>"}, false, 4, new String[][]{{"org.mockito.internal.MockitoCore", "inOrder", "java.lang.Object[]", "<sample:5>"}}, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("org.mockito.exceptions.misusing.NotAMockException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput143() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.mockito.internal.MockitoCore", "org.mockito.internal.MockitoCore", "reset", new String[]{"java.lang.Object[]"}, new String[]{"<empty>"}, false, 0, new String[][]{{"org.mockito.internal.MockitoCore", "doAnswer", "org.mockito.stubbing.Answer", "<sample:7>"}}, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("org.mockito.exceptions.misusing.UnfinishedStubbingException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput144() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.mockito.internal.MockitoCore", "org.mockito.internal.MockitoCore", "mock", new String[]{"java.lang.Class", "org.mockito.MockSettings"}, new String[]{"<sample:3>", "<sample:4>"}, false, 4, new String[][]{{"org.mockito.internal.MockitoCore", "verifyNoMoreInteractions", "java.lang.Object[]", "<sample:3>"}, {"org.mockito.internal.MockitoCore", "inOrder", "java.lang.Object[]", "<sample:4>"}}, 2), new String[][]{{"getCallbacks", "", "1"}});
  assertNotNull(actual);
  assertEquals("[Lorg.mockito.cglib.proxy.Callback;", actual.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput145() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.mockito.internal.MockitoCore", "org.mockito.internal.MockitoCore", "when", new String[]{"java.lang.Object"}, new String[]{"<i:1>"}, false), new String[][]{{"thenReturn", "java.lang.Object,java.lang.Object[]", "6"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("org.mockito.exceptions.misusing.WrongTypeOfReturnValue", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput146() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.mockito.internal.MockHandler", "org.mockito.internal.MockHandler", "setAnswersForStubbing", new String[]{"java.util.List"}, new String[]{"<null>"}, false, 0, new String[][]{{"org.mockito.internal.MockHandler", "getInvocationContainer", ""}, {"org.mockito.internal.MockHandler", "handle", "org.mockito.internal.invocation.Invocation", "<sample:0>"}}, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput147() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.mockito.internal.MockHandler", "org.mockito.internal.MockHandler", "setAnswersForStubbing", new String[]{"java.util.List"}, new String[]{"<null>"}, false, 16, new String[][]{{"org.mockito.internal.MockHandler", "getInvocationContainer", ""}, {"org.mockito.internal.MockHandler", "handle", "org.mockito.internal.invocation.Invocation", "<sample:0>"}}, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput148() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.mockito.internal.MockitoCore", "org.mockito.internal.MockitoCore", "inOrder", new String[]{"java.lang.Object[]"}, new String[]{"<empty>"}, false, 0, new String[][]{{"org.mockito.internal.MockitoCore", "verifyNoMoreInteractions", "java.lang.Object[]", "<sample:4>"}, {"org.mockito.internal.MockitoCore", "stub", "java.lang.Object", "<i:0>"}, {"org.mockito.internal.MockitoCore", "stub", ""}}, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("org.mockito.exceptions.base.MockitoException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput149() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.mockito.internal.MockHandler", "org.mockito.internal.MockHandler", "voidMethodStubbable", new String[]{"java.lang.Object"}, new String[]{"<null>"}, false), new String[][]{{"toAnswer", "org.mockito.stubbing.Answer", "6"}, {"toAnswer", "org.mockito.stubbing.Answer", "2"}, {"on", "", "4"}});
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput150() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.mockito.internal.MockitoCore", "org.mockito.internal.MockitoCore", "doAnswer", new String[]{"org.mockito.stubbing.Answer"}, new String[]{"<sample:2>"}, false, 0, new String[][]{{"org.mockito.internal.MockitoCore", "validateMockitoUsage", ""}, {"org.mockito.internal.MockitoCore", "getLastInvocation", ""}}, 1), new String[][]{{"when", "java.lang.Object", "7"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("org.mockito.exceptions.misusing.NotAMockException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput151() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.mockito.internal.MockitoCore", "org.mockito.internal.MockitoCore", "verify", new String[]{"java.lang.Object", "org.mockito.verification.VerificationMode"}, new String[]{"<null>", "<sample:6>"}, false, 5, new String[][]{{"org.mockito.internal.MockitoCore", "inOrder", "java.lang.Object[]", "<sample:4>"}, {"org.mockito.internal.MockitoCore", "stub", ""}}, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("org.mockito.exceptions.misusing.NullInsteadOfMockException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput152() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.mockito.internal.MockitoCore", "org.mockito.internal.MockitoCore", "validateMockitoUsage", new String[]{}, new String[]{}, false, 2, new String[][]{{"org.mockito.internal.MockitoCore", "doAnswer", "org.mockito.stubbing.Answer", "<sample:0>"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("org.mockito.exceptions.misusing.UnfinishedStubbingException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput153() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.mockito.internal.MockitoCore", "org.mockito.internal.MockitoCore", "stub", new String[]{"java.lang.Object"}, new String[]{"<s:b>"}, false, 0, new String[][]{{"org.mockito.internal.MockitoCore", "doAnswer", "org.mockito.stubbing.Answer", "<sample:4>"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("org.mockito.exceptions.misusing.UnfinishedStubbingException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput154() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.mockito.internal.MockHandler", "org.mockito.internal.MockHandler", "getInvocationContainer", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.mockito.internal.MockHandler", "setAnswersForStubbing", "java.util.List", "<null>"}}, 2), new String[][]{{"resetInvocationForPotentialStubbing", "org.mockito.internal.invocation.InvocationMatcher", "3"}, {"getStubbedInvocations", "", "4"}});
  assertNotNull(actual);
  assertEquals("java.util.LinkedList", actual.getClass().getName());
  assertEquals("[]", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput155() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.mockito.internal.MockitoCore", "org.mockito.internal.MockitoCore", "mock", new String[]{"java.lang.Class", "org.mockito.MockSettings"}, new String[]{"<sample:0>", "<null>"}, false, 11, new String[][]{{"org.mockito.internal.MockitoCore", "inOrder", "java.lang.Object[]", "<sample:2>"}, {"org.mockito.internal.MockitoCore", "stub", ""}}, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("org.mockito.exceptions.base.MockitoException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput156() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.mockito.internal.MockitoCore", "org.mockito.internal.MockitoCore", "mock", new String[]{"java.lang.Class", "org.mockito.MockSettings"}, new String[]{"<sample:6>", "<sample:4>"}, false, 2, new String[][]{{"org.mockito.internal.MockitoCore", "verify", "java.lang.Object,org.mockito.verification.VerificationMode", "<i:1>", "<sample:4>"}, {"org.mockito.internal.MockitoCore", "inOrder", "java.lang.Object[]", "<sample:9>"}, {"org.mockito.internal.MockitoCore", "verifyNoMoreInteractions", "java.lang.Object[]", "<sample:5>"}}, 1), new String[][]{{"retainAll", "java.util.Collection", "5"}, {"retainAll", "java.util.Collection", "2"}, {"newInstance", "org.mockito.cglib.proxy.Callback", "6"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalStateException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput157() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.mockito.internal.MockitoCore", "org.mockito.internal.MockitoCore", "stub", new String[]{"java.lang.Object"}, new String[]{"<i:2>"}, false), new String[][]{{"toThrow", "java.lang.Throwable", "0"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("org.mockito.exceptions.base.MockitoException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput158() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.mockito.internal.MockitoCore", "org.mockito.internal.MockitoCore", "mock", new String[]{"java.lang.Class", "org.mockito.MockSettings"}, new String[]{"<sample:9>", "<sample:6>"}, false, 12, new String[][]{{"org.mockito.internal.MockitoCore", "verify", "java.lang.Object,org.mockito.verification.VerificationMode", "<i:1>", "<sample:4>"}, {"org.mockito.internal.MockitoCore", "verifyNoMoreInteractions", "java.lang.Object[]", "<sample:9>"}}, 3), new String[][]{{"containsValue", "java.lang.Object", "3"}, {"containsValue", "java.lang.Object", "5"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput159() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.mockito.internal.MockitoCore", "org.mockito.internal.MockitoCore", "mock", new String[]{"java.lang.Class", "org.mockito.MockSettings"}, new String[]{"<sample:11>", "<sample:6>"}, false, 12, new String[][]{{"org.mockito.internal.MockitoCore", "verify", "java.lang.Object,org.mockito.verification.VerificationMode", "<i:0>", "<sample:4>"}, {"org.mockito.internal.MockitoCore", "verifyNoMoreInteractions", "java.lang.Object[]", "<sample:0>"}}, 3);
  assertNotNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput160() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.mockito.internal.MockHandler", "org.mockito.internal.MockHandler", "voidMethodStubbable", new String[]{"java.lang.Object"}, new String[]{"<sample:1>"}, false, 4, new String[][]{{"org.mockito.internal.MockHandler", "voidMethodStubbable", "java.lang.Object", "<d:1.5>"}, {"org.mockito.internal.MockHandler", "setAnswersForStubbing", "java.util.List", "<sample:0>"}}, 2);
  assertNotNull(actual);
  assertEquals("org.mockito.internal.stubbing.VoidMethodStubbableImpl", actual.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput161() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.mockito.internal.MockitoCore", "org.mockito.internal.MockitoCore", "mock", new String[]{"java.lang.Class", "org.mockito.MockSettings"}, new String[]{"<sample:5>", "<sample:6>"}, false, 7, new String[][]{{"org.mockito.internal.MockitoCore", "verify", "java.lang.Object,org.mockito.verification.VerificationMode", "<i:53>", "<sample:4>"}, {"org.mockito.internal.MockitoCore", "inOrder", "java.lang.Object[]", "<null>"}, {"org.mockito.internal.MockitoCore", "verifyNoMoreInteractions", "java.lang.Object[]", "<sample:0>"}}, 3), new String[][]{{"getCallbacks", "", "3"}});
  assertNotNull(actual);
  assertEquals("[Lorg.mockito.cglib.proxy.Callback;", actual.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput162() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.mockito.internal.MockitoCore", "org.mockito.internal.MockitoCore", "stub", new String[]{"java.lang.Object"}, new String[]{"<null>"}, false, 0, new String[][]{{"org.mockito.internal.MockitoCore", "stubVoid", "java.lang.Object", "<i:0>"}, {"org.mockito.internal.MockitoCore", "doAnswer", "org.mockito.stubbing.Answer", "<sample:2>"}}, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("org.mockito.exceptions.misusing.UnfinishedStubbingException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput163() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.mockito.internal.MockitoCore", "org.mockito.internal.MockitoCore", "mock", new String[]{"java.lang.Class", "org.mockito.MockSettings"}, new String[]{"<sample:6>", "<sample:6>"}, false, 10, new String[][]{{"org.mockito.internal.MockitoCore", "inOrder", "java.lang.Object[]", "<sample:3>"}, {"org.mockito.internal.MockitoCore", "verifyNoMoreInteractions", "java.lang.Object[]", "<sample:5>"}}, 1), new String[][]{{"remove", "java.lang.Object", "3"}, {"newInstance", "java.lang.Class[],java.lang.Object[],org.mockito.cglib.proxy.Callback[]", "7"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput164() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.mockito.internal.MockitoCore", "org.mockito.internal.MockitoCore", "mock", new String[]{"java.lang.Class", "org.mockito.MockSettings"}, new String[]{"<sample:6>", "<null>"}, false, 2, new String[][]{{"org.mockito.internal.MockitoCore", "inOrder", "java.lang.Object[]", "<sample:1>"}, {"org.mockito.internal.MockitoCore", "reset", "java.lang.Object[]", "<sample:5>"}, {"org.mockito.internal.MockitoCore", "verifyNoMoreInteractions", "java.lang.Object[]", "<sample:0>"}}, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput165() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.mockito.internal.MockHandler", "org.mockito.internal.MockHandler", "getMockSettings", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.mockito.internal.MockHandler", "getMockSettings", ""}, {"org.mockito.internal.MockHandler", "getInvocationContainer", ""}}, 1), new String[][]{{"isSerializable", "", "1"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput166() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.mockito.internal.MockitoCore", "org.mockito.internal.MockitoCore", "when", new String[]{"java.lang.Object"}, new String[]{"<i:2>"}, false, 0, new String[][]{{"org.mockito.internal.MockitoCore", "validateMockitoUsage", ""}, {"org.mockito.internal.MockitoCore", "stubVoid", "java.lang.Object", "<d:1.5>"}}), new String[][]{{"toThrow", "java.lang.Throwable", "6"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("org.mockito.exceptions.base.MockitoException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput167() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.mockito.internal.MockitoCore", "org.mockito.internal.MockitoCore", "verifyNoMoreInteractionsInOrder", new String[]{"java.util.List", "org.mockito.internal.verification.api.InOrderContext"}, new String[]{"<null>", "<sample:2>"}, false, 0, null, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput168() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.mockito.internal.MockHandler", "org.mockito.internal.MockHandler", "voidMethodStubbable", new String[]{"java.lang.Object"}, new String[]{"<s:>"}, false, 3, new String[][]{{"org.mockito.internal.MockHandler", "setAnswersForStubbing", "java.util.List", "<sample:0>"}}), new String[][]{{"toAnswer", "org.mockito.stubbing.Answer", "0"}, {"on", "", "0"}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput169() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.mockito.internal.MockitoCore", "org.mockito.internal.MockitoCore", "stubVoid", new String[]{"java.lang.Object"}, new String[]{"<sample:1>"}, false, 0, new String[][]{{"org.mockito.internal.MockitoCore", "when", "java.lang.Object", "<i:2>"}}, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("org.mockito.exceptions.misusing.NotAMockException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput170() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.mockito.internal.MockitoCore", "org.mockito.internal.MockitoCore", "reset", new String[]{"java.lang.Object[]"}, new String[]{"<sample:2>"}, false, 0, new String[][]{{"org.mockito.internal.MockitoCore", "stub", ""}, {"org.mockito.internal.MockitoCore", "doAnswer", "org.mockito.stubbing.Answer", "<sample:2>"}}, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("org.mockito.exceptions.misusing.UnfinishedStubbingException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput171() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.mockito.internal.MockHandler", "org.mockito.internal.MockHandler", "voidMethodStubbable", new String[]{"java.lang.Object"}, new String[]{"<d:1.5>"}, false, 0, new String[][]{{"org.mockito.internal.MockHandler", "handle", "org.mockito.internal.invocation.Invocation", "<null>"}}, 1), new String[][]{{"on", "", "6"}});
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("1.5", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput172() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.mockito.internal.MockitoCore", "org.mockito.internal.MockitoCore", "stubVoid", new String[]{"java.lang.Object"}, new String[]{"<i:-1>"}, false, 0, null, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("org.mockito.exceptions.misusing.NotAMockException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput173() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.mockito.internal.MockitoCore", "org.mockito.internal.MockitoCore", "verifyNoMoreInteractionsInOrder", new String[]{"java.util.List", "org.mockito.internal.verification.api.InOrderContext"}, new String[]{"<sample:3>", "<sample:5>"}, false, 5, new String[][]{{"org.mockito.internal.MockitoCore", "validateMockitoUsage", ""}}, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("org.mockito.exceptions.misusing.NotAMockException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput174() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.mockito.internal.MockHandler", "org.mockito.internal.MockHandler", "getMockSettings", new String[]{}, new String[]{}, false), new String[][]{{"extraInterfaces", "java.lang.Class[]", "0"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("org.mockito.exceptions.base.MockitoException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput175() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.mockito.internal.MockHandler", "org.mockito.internal.MockHandler", "setAnswersForStubbing", new String[]{"java.util.List"}, new String[]{"<null>"}, false, 0, new String[][]{{"org.mockito.internal.MockHandler", "handle", "org.mockito.internal.invocation.Invocation", "<sample:4>"}}, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput176() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.mockito.internal.MockitoCore", "org.mockito.internal.MockitoCore", "verifyNoMoreInteractionsInOrder", new String[]{"java.util.List", "org.mockito.internal.verification.api.InOrderContext"}, new String[]{"<sample:3>", "<sample:0>"}, false, 0, new String[][]{{"org.mockito.internal.MockitoCore", "reset", "java.lang.Object[]", "<sample:2>"}, {"org.mockito.internal.MockitoCore", "doAnswer", "org.mockito.stubbing.Answer", "<sample:1>"}}, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("org.mockito.exceptions.misusing.UnfinishedStubbingException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput177() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.mockito.internal.MockHandler", "org.mockito.internal.MockHandler", "voidMethodStubbable", new String[]{"java.lang.Object"}, new String[]{"<s:key>"}, false), new String[][]{{"toThrow", "java.lang.Throwable", "2"}, {"toThrow", "java.lang.Throwable", "6"}, {"on", "", "3"}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("key", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput178() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.mockito.internal.MockHandler", "org.mockito.internal.MockHandler", "getInvocationContainer", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.mockito.internal.MockHandler", "setAnswersForStubbing", "java.util.List", "<sample:1>"}, {"org.mockito.internal.MockHandler", "setAnswersForStubbing", "java.util.List", "<sample:2>"}}, 3), new String[][]{{"setAnswersForStubbing", "java.util.List", "4"}, {"resetInvocationForPotentialStubbing", "org.mockito.internal.invocation.InvocationMatcher", "1"}, {"setAnswersForStubbing", "java.util.List", "6"}});
  assertNotNull(actual);
  assertEquals("org.mockito.internal.stubbing.InvocationContainerImpl", actual.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput179() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.mockito.internal.MockHandler", "org.mockito.internal.MockHandler", "voidMethodStubbable", new String[]{"java.lang.Object"}, new String[]{"<s:a>"}, false), new String[][]{{"on", "", "1"}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("a", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput180() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.mockito.internal.MockHandler", "org.mockito.internal.MockHandler", "getMockSettings", new String[]{}, new String[]{}, false), new String[][]{{"spiedInstance", "java.lang.Object", "5"}, {"getSpiedInstance", "", "6"}, {"getSpiedInstance", "", "4"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput181() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.mockito.internal.MockHandler", "org.mockito.internal.MockHandler", "getInvocationContainer", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.mockito.internal.MockHandler", "getMockSettings", ""}}, 2), new String[][]{{"setMethodForStubbing", "org.mockito.internal.invocation.InvocationMatcher", "1"}, {"addAnswer", "org.mockito.stubbing.Answer,boolean", "6"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.util.NoSuchElementException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput182() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.mockito.internal.MockitoCore", "org.mockito.internal.MockitoCore", "reset", new String[]{"java.lang.Object[]"}, new String[]{"<null>"}, false, 0, new String[][]{{"org.mockito.internal.MockitoCore", "verify", "java.lang.Object,org.mockito.verification.VerificationMode", "<s:key>", "<sample:4>"}, {"org.mockito.internal.MockitoCore", "verify", "java.lang.Object,org.mockito.verification.VerificationMode", "<sample:1>", "<sample:5>"}}, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput183() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.mockito.internal.MockHandler", "org.mockito.internal.MockHandler", "voidMethodStubbable", new String[]{"java.lang.Object"}, new String[]{"<s:c>"}, false), new String[][]{{"on", "", "5"}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("c", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput184() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.mockito.internal.MockitoCore", "org.mockito.internal.MockitoCore", "reset", new String[]{"java.lang.Object[]"}, new String[]{"<null>"}, false, 0, null, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput185() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.mockito.internal.MockHandler", "org.mockito.internal.MockHandler", "getInvocationContainer", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.mockito.internal.MockHandler", "getMockSettings", ""}, {"org.mockito.internal.MockHandler", "setAnswersForStubbing", "java.util.List", "<sample:0>"}}, 2), new String[][]{{"addConsecutiveAnswer", "org.mockito.stubbing.Answer", "0"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput186() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.mockito.internal.MockHandler", "org.mockito.internal.MockHandler", "getInvocationContainer", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.mockito.internal.MockHandler", "getInvocationContainer", ""}, {"org.mockito.internal.MockHandler", "handle", "org.mockito.internal.invocation.Invocation", "<sample:7>"}}, 3), new String[][]{{"findAnswerFor", "org.mockito.internal.invocation.Invocation", "7"}});
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput187() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.mockito.internal.MockHandler", "org.mockito.internal.MockHandler", "getMockSettings", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.mockito.internal.MockHandler", "setAnswersForStubbing", "java.util.List", "<sample:1>"}}, 1), new String[][]{{"extraInterfaces", "java.lang.Class[]", "2"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("org.mockito.exceptions.base.MockitoException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput188() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.mockito.internal.MockitoCore", "org.mockito.internal.MockitoCore", "getLastInvocation", new String[]{}, new String[]{}, false), new String[][]{{"getMock", "", "7"}, {"isVoid", "", "5"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput189() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.mockito.internal.MockHandler", "org.mockito.internal.MockHandler", "getMockSettings", new String[]{}, new String[]{}, false, 17, new String[][]{}, 3), new String[][]{{"serializable", "", "1"}, {"isSerializable", "", "5"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput190() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.mockito.internal.MockitoCore", "org.mockito.internal.MockitoCore", "verifyNoMoreInteractionsInOrder", new String[]{"java.util.List", "org.mockito.internal.verification.api.InOrderContext"}, new String[]{"<null>", "<sample:2>"}, false, 0, new String[][]{{"org.mockito.internal.MockitoCore", "verifyNoMoreInteractionsInOrder", "java.util.List,org.mockito.internal.verification.api.InOrderContext", "<empty>", "<sample:6>"}, {"org.mockito.internal.MockitoCore", "mock", "java.lang.Class,org.mockito.MockSettings", "<empty>", "<sample:2>"}}, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput191() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.mockito.internal.MockHandler", "org.mockito.internal.MockHandler", "getInvocationContainer", new String[]{}, new String[]{}, false, 1, new String[][]{{"org.mockito.internal.MockHandler", "handle", "org.mockito.internal.invocation.Invocation", "<sample:1>"}}, 1);
  assertNotNull(actual);
  assertEquals("org.mockito.internal.stubbing.InvocationContainerImpl", actual.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput192() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.mockito.internal.MockitoCore", "org.mockito.internal.MockitoCore", "doAnswer", new String[]{"org.mockito.stubbing.Answer"}, new String[]{"<sample:1>"}, false, 7, new String[][]{{"org.mockito.internal.MockitoCore", "verify", "java.lang.Object,org.mockito.verification.VerificationMode", "<s:>", "<sample:3>"}}, 3), new String[][]{{"doAnswer", "org.mockito.stubbing.Answer", "0"}, {"when", "java.lang.Object", "1"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("org.mockito.exceptions.misusing.NotAMockException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput193() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.mockito.internal.MockHandler", "org.mockito.internal.MockHandler", "voidMethodStubbable", new String[]{"java.lang.Object"}, new String[]{"<s:f>"}, false, 0, new String[][]{{"org.mockito.internal.MockHandler", "getMockSettings", ""}, {"org.mockito.internal.MockHandler", "setAnswersForStubbing", "java.util.List", "<sample:1>"}}, 3), new String[][]{{"on", "", "7"}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("f", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput194() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.mockito.internal.MockHandler", "org.mockito.internal.MockHandler", "voidMethodStubbable", new String[]{"java.lang.Object"}, new String[]{"<s::>"}, false, 0, new String[][]{{"org.mockito.internal.MockHandler", "getMockSettings", ""}, {"org.mockito.internal.MockHandler", "setAnswersForStubbing", "java.util.List", "<empty>"}}, 3), new String[][]{{"on", "", "7"}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals(":", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput195() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.mockito.internal.MockHandler", "org.mockito.internal.MockHandler", "voidMethodStubbable", new String[]{"java.lang.Object"}, new String[]{"<s:H>"}, false, 0, new String[][]{{"org.mockito.internal.MockHandler", "getMockSettings", ""}, {"org.mockito.internal.MockHandler", "setAnswersForStubbing", "java.util.List", "<empty>"}}, 3), new String[][]{{"on", "", "7"}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("H", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput196() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.mockito.internal.MockHandler", "org.mockito.internal.MockHandler", "voidMethodStubbable", new String[]{"java.lang.Object"}, new String[]{"<s:>"}, false, 0, new String[][]{{"org.mockito.internal.MockHandler", "getMockSettings", ""}, {"org.mockito.internal.MockHandler", "setAnswersForStubbing", "java.util.List", "<empty>"}}, 3), new String[][]{{"on", "", "7"}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput197() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.mockito.internal.MockHandler", "org.mockito.internal.MockHandler", "voidMethodStubbable", new String[]{"java.lang.Object"}, new String[]{"<i:-262144>"}, false, 0, null, 2), new String[][]{{"on", "", "1"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("-262144", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput198() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.mockito.internal.MockHandler", "org.mockito.internal.MockHandler", "voidMethodStubbable", new String[]{"java.lang.Object"}, new String[]{"<i:-524288>"}, false, 0, null, 2), new String[][]{{"on", "", "1"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("-524288", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput199() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.mockito.internal.MockHandler", "org.mockito.internal.MockHandler", "voidMethodStubbable", new String[]{"java.lang.Object"}, new String[]{"<i:-524267>"}, false, 0, null, 2), new String[][]{{"on", "", "1"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("-524267", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput200() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.mockito.internal.MockHandler", "org.mockito.internal.MockHandler", "voidMethodStubbable", new String[]{"java.lang.Object"}, new String[]{"<i:-1>"}, false, 0, null, 2), new String[][]{{"on", "", "1"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("-1", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput201() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.mockito.internal.MockHandler", "org.mockito.internal.MockHandler", "voidMethodStubbable", new String[]{"java.lang.Object"}, new String[]{"<i:1>"}, false, 9, new String[][]{{"org.mockito.internal.MockHandler", "getMockSettings", ""}}, 2), new String[][]{{"on", "", "1"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("1", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput202() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.mockito.internal.MockHandler", "org.mockito.internal.MockHandler", "voidMethodStubbable", new String[]{"java.lang.Object"}, new String[]{"<i:-16384>"}, false, 9, new String[][]{{"org.mockito.internal.MockHandler", "getMockSettings", ""}, {"org.mockito.internal.MockHandler", "getMockSettings", ""}, {"org.mockito.internal.MockHandler", "getInvocationContainer", ""}}, 2), new String[][]{{"on", "", "1"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("-16384", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput203() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.mockito.internal.MockHandler", "org.mockito.internal.MockHandler", "voidMethodStubbable", new String[]{"java.lang.Object"}, new String[]{"<i:16384>"}, false, 9, new String[][]{{"org.mockito.internal.MockHandler", "getMockSettings", ""}, {"org.mockito.internal.MockHandler", "getMockSettings", ""}, {"org.mockito.internal.MockHandler", "setAnswersForStubbing", "java.util.List", "<sample:1>"}}, 2), new String[][]{{"on", "", "1"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("16384", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput204() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.mockito.internal.MockitoCore", "org.mockito.internal.MockitoCore", "verifyNoMoreInteractionsInOrder", new String[]{"java.util.List", "org.mockito.internal.verification.api.InOrderContext"}, new String[]{"<null>", "<sample:0>"}, false, 1, new String[][]{}, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput205() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.mockito.internal.MockHandler", "org.mockito.internal.MockHandler", "getMockSettings", new String[]{}, new String[]{}, false, 1, new String[][]{{"org.mockito.internal.MockHandler", "setAnswersForStubbing", "java.util.List", "<sample:1>"}, {"org.mockito.internal.MockHandler", "setAnswersForStubbing", "java.util.List", "<sample:2>"}, {"org.mockito.internal.MockHandler", "handle", "org.mockito.internal.invocation.Invocation", "<sample:6>"}}, 1), new String[][]{{"getMockName", "", "7"}, {"isSurrogate", "", "1"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput206() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.mockito.internal.MockHandler", "org.mockito.internal.MockHandler", "getInvocationContainer", new String[]{}, new String[]{}, false, 1, new String[][]{}, 3), new String[][]{{"addAnswer", "org.mockito.stubbing.Answer", "0"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IndexOutOfBoundsException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput207() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.mockito.internal.MockHandler", "org.mockito.internal.MockHandler", "getMockSettings", new String[]{}, new String[]{}, false, 2, new String[][]{{"org.mockito.internal.MockHandler", "getInvocationContainer", ""}, {"org.mockito.internal.MockHandler", "setAnswersForStubbing", "java.util.List", "<sample:1>"}, {"org.mockito.internal.MockHandler", "getMockSettings", ""}}, 3), new String[][]{{"serializable", "", "2"}, {"getMockName", "", "5"}});
  assertNotNull(actual);
  assertEquals("org.mockito.internal.util.MockName", actual.getClass().getName());
  assertEquals("string {isSurrogate=true}", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput208() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.mockito.internal.MockitoCore", "org.mockito.internal.MockitoCore", "verifyNoMoreInteractionsInOrder", new String[]{"java.util.List", "org.mockito.internal.verification.api.InOrderContext"}, new String[]{"<empty>", "<sample:0>"}, false, 0, null, 3);
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput209() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.mockito.internal.MockHandler", "org.mockito.internal.MockHandler", "getMockSettings", new String[]{}, new String[]{}, false, 18, new String[][]{{"org.mockito.internal.MockHandler", "handle", "org.mockito.internal.invocation.Invocation", "<sample:2>"}, {"org.mockito.internal.MockHandler", "handle", "org.mockito.internal.invocation.Invocation", "<sample:2>"}}, 3), new String[][]{{"isSerializable", "", "6"}, {"getSpiedInstance", "", "7"}, {"getExtraInterfaces", "", "1"}, {"extraInterfaces", "java.lang.Class[]", "6"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("org.mockito.exceptions.base.MockitoException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput210() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.mockito.internal.MockHandler", "org.mockito.internal.MockHandler", "getInvocationContainer", new String[]{}, new String[]{}, false, 11, new String[][]{{"org.mockito.internal.MockHandler", "setAnswersForStubbing", "java.util.List", "<sample:0>"}}, 1), new String[][]{{"addAnswer", "org.mockito.stubbing.Answer", "0"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IndexOutOfBoundsException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput211() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.mockito.internal.MockHandler", "org.mockito.internal.MockHandler", "voidMethodStubbable", new String[]{"java.lang.Object"}, new String[]{"<s:kkDz>"}, false, 2, new String[][]{{"org.mockito.internal.MockHandler", "voidMethodStubbable", "java.lang.Object", "<s:>"}, {"org.mockito.internal.MockHandler", "setAnswersForStubbing", "java.util.List", "<sample:3>"}}, 3), new String[][]{{"on", "", "0"}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("kkDz", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput212() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.mockito.internal.MockHandler", "org.mockito.internal.MockHandler", "voidMethodStubbable", new String[]{"java.lang.Object"}, new String[]{"<s:kkDz/>"}, false, 2, new String[][]{{"org.mockito.internal.MockHandler", "voidMethodStubbable", "java.lang.Object", "<s:>"}, {"org.mockito.internal.MockHandler", "setAnswersForStubbing", "java.util.List", "<sample:3>"}}, 3), new String[][]{{"on", "", "0"}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("kkDz/", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput213() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.mockito.internal.MockHandler", "org.mockito.internal.MockHandler", "getInvocationContainer", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.mockito.internal.MockHandler", "setAnswersForStubbing", "java.util.List", "<sample:3>"}}, 3), new String[][]{{"getStubbedInvocations", "", "1"}});
  assertNotNull(actual);
  assertEquals("java.util.LinkedList", actual.getClass().getName());
  assertEquals("[]", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput214() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.mockito.internal.MockitoCore", "org.mockito.internal.MockitoCore", "reset", new String[]{"java.lang.Object[]"}, new String[]{"<sample:0>"}, false, 4, new String[][]{{"org.mockito.internal.MockitoCore", "stubVoid", "java.lang.Object", "<i:-29>"}, {"org.mockito.internal.MockitoCore", "doAnswer", "org.mockito.stubbing.Answer", "<sample:4>"}}, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("org.mockito.exceptions.misusing.UnfinishedStubbingException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput215() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.mockito.internal.MockHandler", "org.mockito.internal.MockHandler", "getMockSettings", new String[]{}, new String[]{}, false, 2, new String[][]{{"org.mockito.internal.MockHandler", "handle", "org.mockito.internal.invocation.Invocation", "<sample:6>"}}, 2), new String[][]{{"isSerializable", "", "6"}, {"spiedInstance", "java.lang.Object", "5"}, {"getDefaultAnswer", "", "5"}});
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput216() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.mockito.internal.MockitoCore", "org.mockito.internal.MockitoCore", "validateMockitoUsage", new String[]{}, new String[]{}, false, 1, new String[][]{{"org.mockito.internal.MockitoCore", "doAnswer", "org.mockito.stubbing.Answer", "<sample:5>"}, {"org.mockito.internal.MockitoCore", "stubVoid", "java.lang.Object", "<s:a>"}}, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("org.mockito.exceptions.misusing.UnfinishedStubbingException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput217() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.mockito.internal.MockHandler", "org.mockito.internal.MockHandler", "voidMethodStubbable", new String[]{"java.lang.Object"}, new String[]{"<sample:0>"}, false, 0, new String[][]{{"org.mockito.internal.MockHandler", "setAnswersForStubbing", "java.util.List", "<sample:0>"}, {"org.mockito.internal.MockHandler", "getInvocationContainer", ""}, {"org.mockito.internal.MockHandler", "handle", "org.mockito.internal.invocation.Invocation", "<null>"}}, 3), new String[][]{{"toThrow", "java.lang.Throwable", "7"}, {"on", "", "4"}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("a", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput218() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.mockito.internal.MockHandler", "org.mockito.internal.MockHandler", "getInvocationContainer", new String[]{}, new String[]{}, false, 14, new String[][]{{"org.mockito.internal.MockHandler", "handle", "org.mockito.internal.invocation.Invocation", "<sample:1>"}, {"org.mockito.internal.MockHandler", "handle", "org.mockito.internal.invocation.Invocation", "<sample:8>"}}, 1), new String[][]{{"resetInvocationForPotentialStubbing", "org.mockito.internal.invocation.InvocationMatcher", "4"}, {"getStubbedInvocations", "", "0"}});
  assertNotNull(actual);
  assertEquals("java.util.LinkedList", actual.getClass().getName());
  assertEquals("[]", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput219() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.mockito.internal.MockHandler", "org.mockito.internal.MockHandler", "getMockSettings", new String[]{}, new String[]{}, false), new String[][]{{"initiateMockName", "java.lang.Class", "2"}, {"getMockName", "", "5"}});
  assertNotNull(actual);
  assertEquals("org.mockito.internal.util.MockName", actual.getClass().getName());
  assertEquals("genericBase {isSurrogate=true}", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput220() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.mockito.internal.MockHandler", "org.mockito.internal.MockHandler", "getInvocationContainer", new String[]{}, new String[]{}, false, 4, new String[][]{{"org.mockito.internal.MockHandler", "setAnswersForStubbing", "java.util.List", "<null>"}, {"org.mockito.internal.MockHandler", "handle", "org.mockito.internal.invocation.Invocation", "<sample:5>"}, {"org.mockito.internal.MockHandler", "setAnswersForStubbing", "java.util.List", "<sample:1>"}}, 1), new String[][]{{"setMethodForStubbing", "org.mockito.internal.invocation.InvocationMatcher", "7"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.ClassCastException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput221() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.mockito.internal.MockitoCore", "org.mockito.internal.MockitoCore", "stub", new String[]{"java.lang.Object"}, new String[]{"<i:-134217740>"}, false, 0, new String[][]{{"org.mockito.internal.MockitoCore", "doAnswer", "org.mockito.stubbing.Answer", "<sample:6>"}}, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("org.mockito.exceptions.misusing.UnfinishedStubbingException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput222() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.mockito.internal.MockHandler", "org.mockito.internal.MockHandler", "getMockSettings", new String[]{}, new String[]{}, false, 10, new String[][]{{"org.mockito.internal.MockHandler", "setAnswersForStubbing", "java.util.List", "<null>"}, {"org.mockito.internal.MockHandler", "voidMethodStubbable", "java.lang.Object", "<sample:1>"}}, 2), new String[][]{{"extraInterfaces", "java.lang.Class[]", "4"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("org.mockito.exceptions.base.MockitoException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput223() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.mockito.internal.MockHandler", "org.mockito.internal.MockHandler", "getMockSettings", new String[]{}, new String[]{}, false, 2, new String[][]{{"org.mockito.internal.MockHandler", "voidMethodStubbable", "java.lang.Object", "<i:2>"}, {"org.mockito.internal.MockHandler", "getInvocationContainer", ""}}), new String[][]{{"defaultAnswer", "org.mockito.stubbing.Answer", "4"}, {"spiedInstance", "java.lang.Object", "7"}, {"getDefaultAnswer", "", "3"}});
  assertNotNull(actual);
  assertEquals("org.mockito.internal.stubbing.defaultanswers.GloballyConfiguredAnswer", actual.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput224() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.mockito.internal.MockitoCore", "org.mockito.internal.MockitoCore", "verifyNoMoreInteractionsInOrder", new String[]{"java.util.List", "org.mockito.internal.verification.api.InOrderContext"}, new String[]{"<sample:1>", "<sample:5>"}, false, 6, new String[][]{{"org.mockito.internal.MockitoCore", "doAnswer", "org.mockito.stubbing.Answer", "<sample:0>"}}, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("org.mockito.exceptions.misusing.UnfinishedStubbingException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput225() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.mockito.internal.MockHandler", "org.mockito.internal.MockHandler", "getMockSettings", new String[]{}, new String[]{}, false, 10, new String[][]{{"org.mockito.internal.MockHandler", "voidMethodStubbable", "java.lang.Object", "<b:true>"}}, 3), new String[][]{{"initiateMockName", "java.lang.Class", "6"}, {"isSerializable", "", "5"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput226() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.mockito.internal.MockHandler", "org.mockito.internal.MockHandler", "getInvocationContainer", new String[]{}, new String[]{}, false, 15, new String[][]{}, 2), new String[][]{{"getInvocations", "", "7"}, {"set", "int,java.lang.Object", "4"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IndexOutOfBoundsException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput227() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.mockito.internal.MockHandler", "org.mockito.internal.MockHandler", "getInvocationContainer", new String[]{}, new String[]{}, false, 0, null, 3), new String[][]{{"setInvocationForPotentialStubbing", "org.mockito.internal.invocation.InvocationMatcher", "2"}, {"setMethodForStubbing", "org.mockito.internal.invocation.InvocationMatcher", "5"}, {"hasAnswersForStubbing", "", "0"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput228() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.mockito.internal.MockitoCore", "org.mockito.internal.MockitoCore", "when", new String[]{"java.lang.Object"}, new String[]{"<s:bf}e>"}, false, 1, new String[][]{{"org.mockito.internal.MockitoCore", "inOrder", "java.lang.Object[]", "<sample:3>"}, {"org.mockito.internal.MockitoCore", "doAnswer", "org.mockito.stubbing.Answer", "<sample:1>"}}, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("org.mockito.exceptions.misusing.UnfinishedStubbingException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput229() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.mockito.internal.MockHandler", "org.mockito.internal.MockHandler", "voidMethodStubbable", new String[]{"java.lang.Object"}, new String[]{"<s:ke]z>"}, false, 1, new String[][]{{"org.mockito.internal.MockHandler", "getInvocationContainer", ""}, {"org.mockito.internal.MockHandler", "handle", "org.mockito.internal.invocation.Invocation", "<sample:4>"}, {"org.mockito.internal.MockHandler", "handle", "org.mockito.internal.invocation.Invocation", "<sample:4>"}}, 1), new String[][]{{"toAnswer", "org.mockito.stubbing.Answer", "1"}, {"toReturn", "", "1"}, {"toThrow", "java.lang.Throwable", "5"}, {"on", "", "3"}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("ke]z", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput230() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.mockito.internal.MockHandler", "org.mockito.internal.MockHandler", "voidMethodStubbable", new String[]{"java.lang.Object"}, new String[]{"<i:1>"}, false, 1, new String[][]{{"org.mockito.internal.MockHandler", "getInvocationContainer", ""}, {"org.mockito.internal.MockHandler", "handle", "org.mockito.internal.invocation.Invocation", "<sample:4>"}, {"org.mockito.internal.MockHandler", "handle", "org.mockito.internal.invocation.Invocation", "<sample:4>"}}, 1), new String[][]{{"toAnswer", "org.mockito.stubbing.Answer", "1"}, {"toReturn", "", "1"}, {"toThrow", "java.lang.Throwable", "5"}, {"on", "", "3"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("1", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput231() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.mockito.internal.MockHandler", "org.mockito.internal.MockHandler", "voidMethodStubbable", new String[]{"java.lang.Object"}, new String[]{"<i:2>"}, false, 1, new String[][]{{"org.mockito.internal.MockHandler", "getInvocationContainer", ""}, {"org.mockito.internal.MockHandler", "handle", "org.mockito.internal.invocation.Invocation", "<sample:4>"}, {"org.mockito.internal.MockHandler", "handle", "org.mockito.internal.invocation.Invocation", "<sample:4>"}}, 1), new String[][]{{"toAnswer", "org.mockito.stubbing.Answer", "1"}, {"toReturn", "", "1"}, {"toThrow", "java.lang.Throwable", "5"}, {"on", "", "3"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("2", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput232() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.mockito.internal.MockitoCore", "org.mockito.internal.MockitoCore", "stub", new String[]{"java.lang.Object"}, new String[]{"<i:-1>"}, false), new String[][]{{"thenReturn", "java.lang.Object,java.lang.Object[]", "7"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("org.mockito.exceptions.misusing.WrongTypeOfReturnValue", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput233() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.mockito.internal.MockHandler", "org.mockito.internal.MockHandler", "voidMethodStubbable", new String[]{"java.lang.Object"}, new String[]{"<s:--c>"}, false, 0, new String[][]{{"org.mockito.internal.MockHandler", "getMockSettings", ""}}, 1), new String[][]{{"toAnswer", "org.mockito.stubbing.Answer", "5"}, {"toThrow", "java.lang.Throwable", "7"}, {"on", "", "2"}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("--c", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput234() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.mockito.internal.MockHandler", "org.mockito.internal.MockHandler", "voidMethodStubbable", new String[]{"java.lang.Object"}, new String[]{"<s:a>"}, false, 8, new String[][]{{"org.mockito.internal.MockHandler", "handle", "org.mockito.internal.invocation.Invocation", "<sample:0>"}, {"org.mockito.internal.MockHandler", "getMockSettings", ""}}, 1), new String[][]{{"toAnswer", "org.mockito.stubbing.Answer", "2"}, {"on", "", "7"}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("a", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput235() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.mockito.internal.MockHandler", "org.mockito.internal.MockHandler", "voidMethodStubbable", new String[]{"java.lang.Object"}, new String[]{"<s:>"}, false, 8, new String[][]{{"org.mockito.internal.MockHandler", "handle", "org.mockito.internal.invocation.Invocation", "<sample:0>"}, {"org.mockito.internal.MockHandler", "getMockSettings", ""}}, 1), new String[][]{{"toAnswer", "org.mockito.stubbing.Answer", "2"}, {"on", "", "7"}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput236() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.mockito.internal.MockitoCore", "org.mockito.internal.MockitoCore", "validateMockitoUsage", new String[]{}, new String[]{}, false, 7, new String[][]{{"org.mockito.internal.MockitoCore", "inOrder", "java.lang.Object[]", "<sample:5>"}, {"org.mockito.internal.MockitoCore", "reset", "java.lang.Object[]", "<sample:3>"}, {"org.mockito.internal.MockitoCore", "doAnswer", "org.mockito.stubbing.Answer", "<sample:0>"}}, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("org.mockito.exceptions.misusing.UnfinishedStubbingException", thrown.getClass().getName());
 }
}
