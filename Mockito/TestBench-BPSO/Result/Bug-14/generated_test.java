package generated.algorithm;

import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;
import static org.junit.Assert.*;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class BinaryParticleSwarmGeneratedTest {
 @Test(timeout = 20000)
 public void generatedInput000() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.mockito.internal.MockHandler", "org.mockito.internal.MockHandler", "getInvocationContainer", new String[]{}, new String[]{}, false, 7, new String[][]{{"org.mockito.internal.MockHandler", "getMockSettings", ""}});
  assertNotNull(actual);
  assertEquals("org.mockito.internal.stubbing.InvocationContainerImpl", actual.getClass().getName());
  assertEquals("invocationForStubbing: null {hasAnswersForStubbing=false}", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput001() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.mockito.internal.MockitoCore", "org.mockito.internal.MockitoCore", "stubVoid", new String[]{"java.lang.Object"}, new String[]{"<i:0>"}, false, 0, new String[][]{{"org.mockito.internal.MockitoCore", "reset", "java.lang.Object[]", "<empty>"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("org.mockito.exceptions.misusing.NotAMockException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput002() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.mockito.internal.MockitoCore", "org.mockito.internal.MockitoCore", "verifyNoMoreInteractions", new String[]{"java.lang.Object[]"}, new String[]{"<null>"}, false, 4, new String[][]{}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("org.mockito.exceptions.base.MockitoException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput003() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.mockito.internal.MockitoCore", "org.mockito.internal.MockitoCore", "doAnswer", new String[]{"org.mockito.stubbing.Answer"}, new String[]{"<sample:2>"}, false, 0, new String[][]{{"org.mockito.internal.MockitoCore", "reset", "java.lang.Object[]", "<sample:6>"}}), new String[][]{{"doNothing", "", "2"}, {"doThrow", "java.lang.Throwable", "0"}, {"when", "java.lang.Object", "2"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("org.mockito.exceptions.misusing.NotAMockException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput004() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.mockito.internal.MockitoCore", "org.mockito.internal.MockitoCore", "inOrder", new String[]{"java.lang.Object[]"}, new String[]{"<null>"}, false, 5, new String[][]{{"org.mockito.internal.MockitoCore", "mock", "java.lang.Class,org.mockito.MockSettings", "<sample:5>", "<sample:8>"}, {"org.mockito.internal.MockitoCore", "verifyNoMoreInteractions", "java.lang.Object[]", "<empty>"}}, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("org.mockito.exceptions.base.MockitoException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput005() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.mockito.internal.MockitoCore", "org.mockito.internal.MockitoCore", "validateMockitoUsage", new String[]{}, new String[]{}, false, 4, new String[][]{{"org.mockito.internal.MockitoCore", "verify", "java.lang.Object,org.mockito.verification.VerificationMode", "<null>", "<sample:6>"}, {"org.mockito.internal.MockitoCore", "doAnswer", "org.mockito.stubbing.Answer", "<sample:1>"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("org.mockito.exceptions.misusing.UnfinishedStubbingException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput006() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.mockito.internal.MockitoCore", "org.mockito.internal.MockitoCore", "verifyNoMoreInteractionsInOrder", new String[]{"java.util.List", "org.mockito.internal.verification.api.InOrderContext"}, new String[]{"<empty>", "<sample:7>"}, false, 4, new String[][]{{"org.mockito.internal.MockitoCore", "validateMockitoUsage", ""}, {"org.mockito.internal.MockitoCore", "when", "java.lang.Object", "<d:1.5>"}}, 2);
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput007() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.mockito.internal.MockHandler", "org.mockito.internal.MockHandler", "voidMethodStubbable", new String[]{"java.lang.Object"}, new String[]{"<i:-11>"}, false, 1, new String[][]{{"org.mockito.internal.MockHandler", "setAnswersForStubbing", "java.util.List", "<sample:1>"}, {"org.mockito.internal.MockHandler", "handle", "org.mockito.internal.invocation.Invocation", "<sample:6>"}}, 2), new String[][]{{"on", "", "3"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("-11", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput008() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.mockito.internal.MockitoCore", "org.mockito.internal.MockitoCore", "doAnswer", new String[]{"org.mockito.stubbing.Answer"}, new String[]{"<sample:4>"}, false, 4, new String[][]{}, 3), new String[][]{{"when", "java.lang.Object", "0"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("org.mockito.exceptions.misusing.NotAMockException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput009() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.mockito.internal.MockitoCore", "org.mockito.internal.MockitoCore", "inOrder", new String[]{"java.lang.Object[]"}, new String[]{"<empty>"}, false, 0, null, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("org.mockito.exceptions.base.MockitoException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput010() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.mockito.internal.MockHandler", "org.mockito.internal.MockHandler", "handle", new String[]{"org.mockito.internal.invocation.Invocation"}, new String[]{"<null>"}, false, 0, new String[][]{{"org.mockito.internal.MockHandler", "getInvocationContainer", ""}}, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput011() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.mockito.internal.MockitoCore", "org.mockito.internal.MockitoCore", "verifyNoMoreInteractionsInOrder", new String[]{"java.util.List", "org.mockito.internal.verification.api.InOrderContext"}, new String[]{"<null>", "<sample:6>"}, false, 2, new String[][]{}, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("org.mockito.exceptions.misusing.UnfinishedStubbingException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput012() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.mockito.internal.MockitoCore", "org.mockito.internal.MockitoCore", "stub", new String[]{"java.lang.Object"}, new String[]{"<i:-42>"}, false, 0, null, 3);
  assertNotNull(actual);
  assertEquals("org.mockito.internal.stubbing.OngoingStubbingImpl", actual.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput013() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.mockito.internal.MockHandler", "org.mockito.internal.MockHandler", "getInvocationContainer", new String[]{}, new String[]{}, false, 0, null, 2), new String[][]{{"hasAnswersForStubbing", "", "6"}, {"addAnswerForVoidMethod", "org.mockito.stubbing.Answer", "3"}});
  assertNotNull(actual);
  assertEquals("org.mockito.internal.stubbing.InvocationContainerImpl", actual.getClass().getName());
  assertEquals("invocationForStubbing: null {hasAnswersForStubbing=true}", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput014() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.mockito.internal.MockHandler", "org.mockito.internal.MockHandler", "handle", new String[]{"org.mockito.internal.invocation.Invocation"}, new String[]{"<sample:5>"}, false, 5, new String[][]{}, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput015() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.mockito.internal.MockitoCore", "org.mockito.internal.MockitoCore", "stub", new String[]{"java.lang.Object"}, new String[]{"<s:+>"}, false, 0, new String[][]{{"org.mockito.internal.MockitoCore", "when", "java.lang.Object", "<s:>"}}, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("org.mockito.exceptions.misusing.MissingMethodInvocationException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput016() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.mockito.internal.MockitoCore", "org.mockito.internal.MockitoCore", "when", new String[]{"java.lang.Object"}, new String[]{"<d:3.0>"}, false, 4, new String[][]{}, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("org.mockito.exceptions.misusing.MissingMethodInvocationException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput017() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.mockito.internal.MockHandler", "org.mockito.internal.MockHandler", "voidMethodStubbable", new String[]{"java.lang.Object"}, new String[]{"<i:-17>"}, false, 0, new String[][]{{"org.mockito.internal.MockHandler", "handle", "org.mockito.internal.invocation.Invocation", "<sample:3>"}}, 1), new String[][]{{"toAnswer", "org.mockito.stubbing.Answer", "6"}, {"toThrow", "java.lang.Throwable", "1"}});
  assertNotNull(actual);
  assertEquals("org.mockito.internal.stubbing.VoidMethodStubbableImpl", actual.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput018() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.mockito.internal.MockitoCore", "org.mockito.internal.MockitoCore", "reset", new String[]{"java.lang.Object[]"}, new String[]{"<null>"}, false, 0, new String[][]{{"org.mockito.internal.MockitoCore", "verifyNoMoreInteractions", "java.lang.Object[]", "<sample:4>"}}, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput019() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.mockito.internal.MockHandler", "org.mockito.internal.MockHandler", "getInvocationContainer", new String[]{}, new String[]{}, false, 2, new String[][]{{"org.mockito.internal.MockHandler", "getInvocationContainer", ""}}, 1), new String[][]{{"setInvocationForPotentialStubbing", "org.mockito.internal.invocation.InvocationMatcher", "5"}, {"setAnswersForStubbing", "java.util.List", "5"}, {"addAnswer", "org.mockito.stubbing.Answer", "3"}});
  assertNotNull(actual);
  assertEquals("org.mockito.internal.stubbing.InvocationContainerImpl", actual.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput020() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.mockito.internal.MockHandler", "org.mockito.internal.MockHandler", "getInvocationContainer", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.mockito.internal.MockHandler", "getMockSettings", ""}}, 2), new String[][]{{"setInvocationForPotentialStubbing", "org.mockito.internal.invocation.InvocationMatcher", "0"}, {"setMethodForStubbing", "org.mockito.internal.invocation.InvocationMatcher", "2"}});
  assertNotNull(actual);
  assertEquals("org.mockito.internal.stubbing.InvocationContainerImpl", actual.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput021() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.mockito.internal.MockitoCore", "org.mockito.internal.MockitoCore", "stubVoid", new String[]{"java.lang.Object"}, new String[]{"<sample:2>"}, false, 0, new String[][]{{"org.mockito.internal.MockitoCore", "stub", ""}, {"org.mockito.internal.MockitoCore", "verifyNoMoreInteractions", "java.lang.Object[]", "<sample:4>"}}, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("org.mockito.exceptions.misusing.NotAMockException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput022() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.mockito.internal.MockitoCore", "org.mockito.internal.MockitoCore", "mock", new String[]{"java.lang.Class", "org.mockito.MockSettings"}, new String[]{"<sample:2>", "<sample:7>"}, false, 7, new String[][]{{"org.mockito.internal.MockitoCore", "getLastInvocation", ""}}, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.ClassCastException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput023() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.mockito.internal.MockitoCore", "org.mockito.internal.MockitoCore", "reset", new String[]{"java.lang.Object[]"}, new String[]{"<sample:2>"}, false, 0, null, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("org.mockito.exceptions.misusing.NotAMockException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput024() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.mockito.internal.MockitoCore", "org.mockito.internal.MockitoCore", "reset", new String[]{"java.lang.Object[]"}, new String[]{"<sample:2>"}, false, 0, new String[][]{{"org.mockito.internal.MockitoCore", "verify", "java.lang.Object,org.mockito.verification.VerificationMode", "<i:-262140>", "<sample:0>"}}, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("org.mockito.exceptions.misusing.NotAMockException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput025() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.mockito.internal.MockitoCore", "org.mockito.internal.MockitoCore", "stubVoid", new String[]{"java.lang.Object"}, new String[]{"<i:2>"}, false, 5, new String[][]{}, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("org.mockito.exceptions.misusing.NotAMockException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput026() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.mockito.internal.MockHandler", "org.mockito.internal.MockHandler", "getInvocationContainer", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.mockito.internal.MockHandler", "handle", "org.mockito.internal.invocation.Invocation", "<sample:6>"}}, 3), new String[][]{{"setAnswersForStubbing", "java.util.List", "1"}});
  assertNotNull(actual);
  assertEquals("org.mockito.internal.stubbing.InvocationContainerImpl", actual.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput027() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.mockito.internal.MockHandler", "org.mockito.internal.MockHandler", "handle", new String[]{"org.mockito.internal.invocation.Invocation"}, new String[]{"<null>"}, false, 4, new String[][]{{"org.mockito.internal.MockHandler", "setAnswersForStubbing", "java.util.List", "<sample:3>"}}, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput028() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.mockito.internal.MockHandler", "org.mockito.internal.MockHandler", "getInvocationContainer", new String[]{}, new String[]{}, false, 0, null, 3), new String[][]{{"addAnswerForVoidMethod", "org.mockito.stubbing.Answer", "1"}});
  assertNotNull(actual);
  assertEquals("org.mockito.internal.stubbing.InvocationContainerImpl", actual.getClass().getName());
  assertEquals("invocationForStubbing: null {hasAnswersForStubbing=true}", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput029() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.mockito.internal.MockHandler", "org.mockito.internal.MockHandler", "getMockSettings", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.mockito.internal.MockHandler", "voidMethodStubbable", "java.lang.Object", "<i:-21>"}}, 2);
  assertNotNull(actual);
  assertEquals("org.mockito.internal.creation.MockSettingsImpl", actual.getClass().getName());
  assertEquals("{getExtraInterfaces=null, isSerializable=false}", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput030() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.mockito.internal.MockHandler", "org.mockito.internal.MockHandler", "handle", new String[]{"org.mockito.internal.invocation.Invocation"}, new String[]{"<sample:5>"}, false, 0, new String[][]{{"org.mockito.internal.MockHandler", "handle", "org.mockito.internal.invocation.Invocation", "<sample:5>"}}, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput031() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.mockito.internal.MockHandler", "org.mockito.internal.MockHandler", "getInvocationContainer", new String[]{}, new String[]{}, false, 5, new String[][]{}, 2), new String[][]{{"addAnswerForVoidMethod", "org.mockito.stubbing.Answer", "1"}, {"getInvocations", "", "7"}});
  assertNotNull(actual);
  assertEquals("java.util.LinkedList", actual.getClass().getName());
  assertEquals("[]", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput032() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.mockito.internal.MockitoCore", "org.mockito.internal.MockitoCore", "getLastInvocation", new String[]{}, new String[]{}, false, 1, new String[][]{{"org.mockito.internal.MockitoCore", "verify", "java.lang.Object,org.mockito.verification.VerificationMode", "<d:3.0>", "<sample:5>"}}, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput033() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.mockito.internal.MockitoCore", "org.mockito.internal.MockitoCore", "inOrder", new String[]{"java.lang.Object[]"}, new String[]{"<sample:3>"}, false, 0, new String[][]{{"org.mockito.internal.MockitoCore", "getLastInvocation", ""}}, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("org.mockito.exceptions.misusing.NotAMockException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput034() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.mockito.internal.MockitoCore", "org.mockito.internal.MockitoCore", "verify", new String[]{"java.lang.Object", "org.mockito.verification.VerificationMode"}, new String[]{"<s:ley >", "<sample:1>"}, false, 0, null, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("org.mockito.exceptions.misusing.NotAMockException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput035() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.mockito.internal.MockitoCore", "org.mockito.internal.MockitoCore", "stub", new String[]{}, new String[]{}, false, 6, new String[][]{{"org.mockito.internal.MockitoCore", "stub", "java.lang.Object", "<d:-3.0>"}}, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("org.mockito.exceptions.misusing.MissingMethodInvocationException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput036() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.mockito.internal.MockitoCore", "org.mockito.internal.MockitoCore", "stub", new String[]{"java.lang.Object"}, new String[]{"<d:1.5>"}, false, 0, new String[][]{{"org.mockito.internal.MockitoCore", "when", "java.lang.Object", "<d:30.0>"}, {"org.mockito.internal.MockitoCore", "doAnswer", "org.mockito.stubbing.Answer", "<sample:2>"}}, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("org.mockito.exceptions.misusing.UnfinishedStubbingException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput037() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.mockito.internal.MockitoCore", "org.mockito.internal.MockitoCore", "validateMockitoUsage", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.mockito.internal.MockitoCore", "verify", "java.lang.Object,org.mockito.verification.VerificationMode", "<i:-42>", "<sample:5>"}}, 1);
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput038() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.mockito.internal.MockHandler", "org.mockito.internal.MockHandler", "handle", new String[]{"org.mockito.internal.invocation.Invocation"}, new String[]{"<sample:2>"}, false, 6, new String[][]{{"org.mockito.internal.MockHandler", "voidMethodStubbable", "java.lang.Object", "<i:-1>"}}, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("org.mockito.exceptions.misusing.UnfinishedStubbingException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput039() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.mockito.internal.MockitoCore", "org.mockito.internal.MockitoCore", "doAnswer", new String[]{"org.mockito.stubbing.Answer"}, new String[]{"<sample:7>"}, false, 0, new String[][]{{"org.mockito.internal.MockitoCore", "stub", "java.lang.Object", "<s:ke8 >"}}, 2), new String[][]{{"doAnswer", "org.mockito.stubbing.Answer", "0"}});
  assertNotNull(actual);
  assertEquals("org.mockito.internal.stubbing.StubberImpl", actual.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput040() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.mockito.internal.MockitoCore", "org.mockito.internal.MockitoCore", "getLastInvocation", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.mockito.internal.MockitoCore", "reset", "java.lang.Object[]", "<sample:1>"}, {"org.mockito.internal.MockitoCore", "reset", "java.lang.Object[]", "<sample:3>"}}, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput041() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.mockito.internal.MockitoCore", "org.mockito.internal.MockitoCore", "reset", new String[]{"java.lang.Object[]"}, new String[]{"<sample:0>"}, false, 4, new String[][]{}, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("org.mockito.exceptions.misusing.NotAMockException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput042() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.mockito.internal.MockitoCore", "org.mockito.internal.MockitoCore", "mock", new String[]{"java.lang.Class", "org.mockito.MockSettings"}, new String[]{"<empty>", "<sample:6>"}, false, 3, new String[][]{}, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("org.mockito.exceptions.base.MockitoException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput043() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.mockito.internal.MockitoCore", "org.mockito.internal.MockitoCore", "verifyNoMoreInteractions", new String[]{"java.lang.Object[]"}, new String[]{"<sample:1>"}, false, 0, new String[][]{{"org.mockito.internal.MockitoCore", "stub", "java.lang.Object", "<i:1>"}}, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("org.mockito.exceptions.misusing.NotAMockException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput044() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.mockito.internal.MockHandler", "org.mockito.internal.MockHandler", "setAnswersForStubbing", new String[]{"java.util.List"}, new String[]{"<sample:1>"}, false, 7, new String[][]{{"org.mockito.internal.MockHandler", "voidMethodStubbable", "java.lang.Object", "<s:key>"}, {"org.mockito.internal.MockHandler", "getInvocationContainer", ""}}, 2);
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput045() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.mockito.internal.MockitoCore", "org.mockito.internal.MockitoCore", "verifyNoMoreInteractions", new String[]{"java.lang.Object[]"}, new String[]{"<sample:2>"}, false, 2, new String[][]{{"org.mockito.internal.MockitoCore", "doAnswer", "org.mockito.stubbing.Answer", "<sample:8>"}}, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("org.mockito.exceptions.misusing.UnfinishedStubbingException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput046() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.mockito.internal.MockitoCore", "org.mockito.internal.MockitoCore", "inOrder", new String[]{"java.lang.Object[]"}, new String[]{"<sample:1>"}, false, 0, new String[][]{{"org.mockito.internal.MockitoCore", "stubVoid", "java.lang.Object", "<s:>"}, {"org.mockito.internal.MockitoCore", "stub", "java.lang.Object", "<i:-42>"}}, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("org.mockito.exceptions.misusing.NotAMockException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput047() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.mockito.internal.MockitoCore", "org.mockito.internal.MockitoCore", "validateMockitoUsage", new String[]{}, new String[]{}, false, 6, new String[][]{{"org.mockito.internal.MockitoCore", "doAnswer", "org.mockito.stubbing.Answer", "<sample:7>"}}, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("org.mockito.exceptions.misusing.UnfinishedStubbingException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput048() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.mockito.internal.MockitoCore", "org.mockito.internal.MockitoCore", "when", new String[]{"java.lang.Object"}, new String[]{"<d:1.5>"}, false, 0, new String[][]{{"org.mockito.internal.MockitoCore", "stubVoid", "java.lang.Object", "<b:true>"}}, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("org.mockito.exceptions.misusing.MissingMethodInvocationException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput049() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.mockito.internal.MockitoCore", "org.mockito.internal.MockitoCore", "validateMockitoUsage", new String[]{}, new String[]{}, false, 1, new String[][]{{"org.mockito.internal.MockitoCore", "stub", "java.lang.Object", "<b:true>"}}, 3);
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput050() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.mockito.internal.MockitoCore", "org.mockito.internal.MockitoCore", "stub", new String[]{"java.lang.Object"}, new String[]{"<b:false>"}, false, 1, new String[][]{{"org.mockito.internal.MockitoCore", "when", "java.lang.Object", "<s:[>"}, {"org.mockito.internal.MockitoCore", "stubVoid", "java.lang.Object", "<i:-13>"}}, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("org.mockito.exceptions.misusing.MissingMethodInvocationException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput051() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.mockito.internal.MockitoCore", "org.mockito.internal.MockitoCore", "inOrder", new String[]{"java.lang.Object[]"}, new String[]{"<sample:2>"}, false, 1, new String[][]{{"org.mockito.internal.MockitoCore", "stubVoid", "java.lang.Object", "<s:-Xkey>"}}, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("org.mockito.exceptions.misusing.NotAMockException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput052() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.mockito.internal.MockitoCore", "org.mockito.internal.MockitoCore", "stub", new String[]{}, new String[]{}, false, 1, new String[][]{{"org.mockito.internal.MockitoCore", "validateMockitoUsage", ""}, {"org.mockito.internal.MockitoCore", "stub", ""}}, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("org.mockito.exceptions.misusing.MissingMethodInvocationException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput053() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.mockito.internal.MockitoCore", "org.mockito.internal.MockitoCore", "when", new String[]{"java.lang.Object"}, new String[]{"<sample:0>"}, false, 1, new String[][]{}, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("org.mockito.exceptions.misusing.MissingMethodInvocationException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput054() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.mockito.internal.MockitoCore", "org.mockito.internal.MockitoCore", "validateMockitoUsage", new String[]{}, new String[]{}, false, 3, new String[][]{{"org.mockito.internal.MockitoCore", "verifyNoMoreInteractions", "java.lang.Object[]", "<sample:7>"}}, 2);
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput055() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.mockito.internal.MockitoCore", "org.mockito.internal.MockitoCore", "stubVoid", new String[]{"java.lang.Object"}, new String[]{"<i:1>"}, false, 5, new String[][]{{"org.mockito.internal.MockitoCore", "verify", "java.lang.Object,org.mockito.verification.VerificationMode", "<i:-7>", "<sample:13>"}}, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("org.mockito.exceptions.misusing.NotAMockException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput056() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.mockito.internal.MockitoCore", "org.mockito.internal.MockitoCore", "mock", new String[]{"java.lang.Class", "org.mockito.MockSettings"}, new String[]{"<sample:2>", "<sample:0>"}, false, 0, null, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.ClassCastException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput057() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.mockito.internal.MockHandler", "org.mockito.internal.MockHandler", "getMockSettings", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.mockito.internal.MockHandler", "voidMethodStubbable", "java.lang.Object", "<i:42>"}}, 3), new String[][]{{"extraInterfaces", "java.lang.Class[]", "4"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("org.mockito.exceptions.base.MockitoException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput058() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.mockito.internal.MockHandler", "org.mockito.internal.MockHandler", "voidMethodStubbable", new String[]{"java.lang.Object"}, new String[]{"<s:aX>"}, false, 2, new String[][]{{"org.mockito.internal.MockHandler", "voidMethodStubbable", "java.lang.Object", "<s:>"}}, 3), new String[][]{{"on", "", "1"}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("aX", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput059() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.mockito.internal.MockitoCore", "org.mockito.internal.MockitoCore", "inOrder", new String[]{"java.lang.Object[]"}, new String[]{"<empty>"}, false, 0, new String[][]{{"org.mockito.internal.MockitoCore", "verify", "java.lang.Object,org.mockito.verification.VerificationMode", "<d:-30.0>", "<sample:0>"}}, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("org.mockito.exceptions.base.MockitoException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput060() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.mockito.internal.MockHandler", "org.mockito.internal.MockHandler", "getInvocationContainer", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.mockito.internal.MockHandler", "voidMethodStubbable", "java.lang.Object", "<s:key>"}, {"org.mockito.internal.MockHandler", "getInvocationContainer", ""}}, 2), new String[][]{{"addConsecutiveAnswer", "org.mockito.stubbing.Answer", "5"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput061() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.mockito.internal.MockHandler", "org.mockito.internal.MockHandler", "getInvocationContainer", new String[]{}, new String[]{}, false, 0, null, 1);
  assertNotNull(actual);
  assertEquals("org.mockito.internal.stubbing.InvocationContainerImpl", actual.getClass().getName());
  assertEquals("invocationForStubbing: null {hasAnswersForStubbing=false}", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput062() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.mockito.internal.MockHandler", "org.mockito.internal.MockHandler", "setAnswersForStubbing", new String[]{"java.util.List"}, new String[]{"<sample:2>"}, false, 6, new String[][]{}, 1);
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput063() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.mockito.internal.MockitoCore", "org.mockito.internal.MockitoCore", "validateMockitoUsage", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.mockito.internal.MockitoCore", "verify", "java.lang.Object,org.mockito.verification.VerificationMode", "<b:false>", "<sample:0>"}, {"org.mockito.internal.MockitoCore", "doAnswer", "org.mockito.stubbing.Answer", "<sample:5>"}}, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("org.mockito.exceptions.misusing.UnfinishedStubbingException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput064() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.mockito.internal.MockitoCore", "org.mockito.internal.MockitoCore", "mock", new String[]{"java.lang.Class", "org.mockito.MockSettings"}, new String[]{"<sample:3>", "<sample:7>"}, false, 0, new String[][]{{"org.mockito.internal.MockitoCore", "verify", "java.lang.Object,org.mockito.verification.VerificationMode", "<i:0>", "<sample:8>"}}, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.ClassCastException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput065() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.mockito.internal.MockHandler", "org.mockito.internal.MockHandler", "getMockSettings", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.mockito.internal.MockHandler", "getInvocationContainer", ""}}, 3), new String[][]{{"isSerializable", "", "0"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput066() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.mockito.internal.MockHandler", "org.mockito.internal.MockHandler", "getMockSettings", new String[]{}, new String[]{}, false, 4, new String[][]{}, 2), new String[][]{{"getMockName", "", "0"}, {"isSurrogate", "", "2"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput067() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.mockito.internal.MockitoCore", "org.mockito.internal.MockitoCore", "verifyNoMoreInteractions", new String[]{"java.lang.Object[]"}, new String[]{"<sample:1>"}, false, 0, new String[][]{{"org.mockito.internal.MockitoCore", "verifyNoMoreInteractions", "java.lang.Object[]", "<sample:3>"}}, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("org.mockito.exceptions.misusing.NotAMockException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput068() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.mockito.internal.MockitoCore", "org.mockito.internal.MockitoCore", "mock", new String[]{"java.lang.Class", "org.mockito.MockSettings"}, new String[]{"<sample:4>", "<null>"}, false, 0, new String[][]{{"org.mockito.internal.MockitoCore", "validateMockitoUsage", ""}}, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("org.mockito.exceptions.base.MockitoException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput069() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.mockito.internal.MockHandler", "org.mockito.internal.MockHandler", "getMockSettings", new String[]{}, new String[]{}, false, 6, new String[][]{{"org.mockito.internal.MockHandler", "setAnswersForStubbing", "java.util.List", "<empty>"}}, 1), new String[][]{{"spiedInstance", "java.lang.Object", "3"}});
  assertNotNull(actual);
  assertEquals("org.mockito.internal.creation.MockSettingsImpl", actual.getClass().getName());
  assertEquals("{getExtraInterfaces=null, isSerializable=false}", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput070() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.mockito.internal.MockHandler", "org.mockito.internal.MockHandler", "setAnswersForStubbing", new String[]{"java.util.List"}, new String[]{"<sample:3>"}, false, 0, new String[][]{{"org.mockito.internal.MockHandler", "setAnswersForStubbing", "java.util.List", "<sample:5>"}}, 3);
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput071() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.mockito.internal.MockHandler", "org.mockito.internal.MockHandler", "getMockSettings", new String[]{}, new String[]{}, false, 4, new String[][]{}, 3), new String[][]{{"getDefaultAnswer", "", "2"}});
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput072() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.mockito.internal.MockitoCore", "org.mockito.internal.MockitoCore", "when", new String[]{"java.lang.Object"}, new String[]{"<i:1>"}, false, 0, new String[][]{{"org.mockito.internal.MockitoCore", "inOrder", "java.lang.Object[]", "<sample:0>"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("org.mockito.exceptions.misusing.MissingMethodInvocationException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput073() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.mockito.internal.MockitoCore", "org.mockito.internal.MockitoCore", "validateMockitoUsage", new String[]{}, new String[]{}, false, 5, new String[][]{});
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput074() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.mockito.internal.MockHandler", "org.mockito.internal.MockHandler", "setAnswersForStubbing", new String[]{"java.util.List"}, new String[]{"<sample:1>"}, false);
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput075() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.mockito.internal.MockHandler", "org.mockito.internal.MockHandler", "handle", new String[]{"org.mockito.internal.invocation.Invocation"}, new String[]{"<sample:1>"}, false); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput076() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.mockito.internal.MockitoCore", "org.mockito.internal.MockitoCore", "stubVoid", new String[]{"java.lang.Object"}, new String[]{"<s:je>"}, false); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("org.mockito.exceptions.misusing.NotAMockException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput077() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.mockito.internal.MockHandler", "org.mockito.internal.MockHandler", "handle", new String[]{"org.mockito.internal.invocation.Invocation"}, new String[]{"<sample:6>"}, false, 7, new String[][]{}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput078() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.mockito.internal.MockitoCore", "org.mockito.internal.MockitoCore", "stub", new String[]{}, new String[]{}, false, 3, new String[][]{{"org.mockito.internal.MockitoCore", "stub", ""}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("org.mockito.exceptions.misusing.MissingMethodInvocationException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput079() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.mockito.internal.MockitoCore", "org.mockito.internal.MockitoCore", "validateMockitoUsage", new String[]{}, new String[]{}, false, 4, new String[][]{{"org.mockito.internal.MockitoCore", "verify", "java.lang.Object,org.mockito.verification.VerificationMode", "<i:0>", "<sample:5>"}});
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput080() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.mockito.internal.MockHandler", "org.mockito.internal.MockHandler", "voidMethodStubbable", new String[]{"java.lang.Object"}, new String[]{"<d:3.0>"}, false);
  assertNotNull(actual);
  assertEquals("org.mockito.internal.stubbing.VoidMethodStubbableImpl", actual.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput081() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.mockito.internal.MockitoCore", "org.mockito.internal.MockitoCore", "getLastInvocation", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.mockito.internal.MockitoCore", "verify", "java.lang.Object,org.mockito.verification.VerificationMode", "<s:a>", "<sample:0>"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput082() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.mockito.internal.MockitoCore", "org.mockito.internal.MockitoCore", "mock", new String[]{"java.lang.Class", "org.mockito.MockSettings"}, new String[]{"<empty>", "<sample:2>"}, false); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.ClassCastException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput083() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.mockito.internal.MockitoCore", "org.mockito.internal.MockitoCore", "verify", new String[]{"java.lang.Object", "org.mockito.verification.VerificationMode"}, new String[]{"<i:0>", "<sample:0>"}, false, 2, new String[][]{{"org.mockito.internal.MockitoCore", "getLastInvocation", ""}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("org.mockito.exceptions.misusing.NotAMockException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput084() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.mockito.internal.MockHandler", "org.mockito.internal.MockHandler", "getInvocationContainer", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.mockito.internal.MockHandler", "getMockSettings", ""}}), new String[][]{{"getInvocations", "", "4"}});
  assertNotNull(actual);
  assertEquals("java.util.LinkedList", actual.getClass().getName());
  assertEquals("[]", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput085() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.mockito.internal.MockitoCore", "org.mockito.internal.MockitoCore", "inOrder", new String[]{"java.lang.Object[]"}, new String[]{"<sample:2>"}, false, 0, new String[][]{{"org.mockito.internal.MockitoCore", "stubVoid", "java.lang.Object", "<i:2>"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("org.mockito.exceptions.misusing.NotAMockException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput086() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.mockito.internal.MockitoCore", "org.mockito.internal.MockitoCore", "inOrder", new String[]{"java.lang.Object[]"}, new String[]{"<empty>"}, false, 5, new String[][]{{"org.mockito.internal.MockitoCore", "getLastInvocation", ""}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("org.mockito.exceptions.base.MockitoException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput087() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.mockito.internal.MockHandler", "org.mockito.internal.MockHandler", "getMockSettings", new String[]{}, new String[]{}, false);
  assertNotNull(actual);
  assertEquals("org.mockito.internal.creation.MockSettingsImpl", actual.getClass().getName());
  assertEquals("{getExtraInterfaces=null, isSerializable=false}", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput088() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.mockito.internal.MockitoCore", "org.mockito.internal.MockitoCore", "mock", new String[]{"java.lang.Class", "org.mockito.MockSettings"}, new String[]{"<empty>", "<sample:4>"}, false, 0, new String[][]{{"org.mockito.internal.MockitoCore", "validateMockitoUsage", ""}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("org.mockito.exceptions.base.MockitoException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput089() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.mockito.internal.MockitoCore", "org.mockito.internal.MockitoCore", "stub", new String[]{"java.lang.Object"}, new String[]{"<i:-1>"}, false, 5, new String[][]{}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("org.mockito.exceptions.misusing.MissingMethodInvocationException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput090() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.mockito.internal.MockitoCore", "org.mockito.internal.MockitoCore", "verify", new String[]{"java.lang.Object", "org.mockito.verification.VerificationMode"}, new String[]{"<s:b>", "<sample:3>"}, false, 0, new String[][]{{"org.mockito.internal.MockitoCore", "reset", "java.lang.Object[]", "<sample:4>"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("org.mockito.exceptions.misusing.NotAMockException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput091() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.mockito.internal.MockitoCore", "org.mockito.internal.MockitoCore", "verifyNoMoreInteractionsInOrder", new String[]{"java.util.List", "org.mockito.internal.verification.api.InOrderContext"}, new String[]{"<sample:1>", "<sample:4>"}, false, 0, new String[][]{{"org.mockito.internal.MockitoCore", "inOrder", "java.lang.Object[]", "<sample:5>"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("org.mockito.exceptions.misusing.NotAMockException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput092() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.mockito.internal.MockitoCore", "org.mockito.internal.MockitoCore", "reset", new String[]{"java.lang.Object[]"}, new String[]{"<sample:2>"}, false); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("org.mockito.exceptions.misusing.NotAMockException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput093() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.mockito.internal.MockitoCore", "org.mockito.internal.MockitoCore", "reset", new String[]{"java.lang.Object[]"}, new String[]{"<null>"}, false); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput094() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.mockito.internal.MockHandler", "org.mockito.internal.MockHandler", "getInvocationContainer", new String[]{}, new String[]{}, false, 4, new String[][]{{"org.mockito.internal.MockHandler", "handle", "org.mockito.internal.invocation.Invocation", "<sample:1>"}});
  assertNotNull(actual);
  assertEquals("org.mockito.internal.stubbing.InvocationContainerImpl", actual.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput095() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.mockito.internal.MockHandler", "org.mockito.internal.MockHandler", "getMockSettings", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.mockito.internal.MockHandler", "handle", "org.mockito.internal.invocation.Invocation", "<sample:3>"}, {"org.mockito.internal.MockHandler", "getMockSettings", ""}}), new String[][]{{"getMockName", "", "1"}});
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput096() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.mockito.internal.MockHandler", "org.mockito.internal.MockHandler", "setAnswersForStubbing", new String[]{"java.util.List"}, new String[]{"<null>"}, false, 6, new String[][]{{"org.mockito.internal.MockHandler", "voidMethodStubbable", "java.lang.Object", "<d:3.0>"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput097() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.mockito.internal.MockitoCore", "org.mockito.internal.MockitoCore", "verifyNoMoreInteractions", new String[]{"java.lang.Object[]"}, new String[]{"<sample:1>"}, false, 0, new String[][]{{"org.mockito.internal.MockitoCore", "stubVoid", "java.lang.Object", "<i:-35>"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("org.mockito.exceptions.misusing.NotAMockException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput098() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.mockito.internal.MockHandler", "org.mockito.internal.MockHandler", "getMockSettings", new String[]{}, new String[]{}, false, 2, new String[][]{}), new String[][]{{"isSerializable", "", "1"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput099() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.mockito.internal.MockHandler", "org.mockito.internal.MockHandler", "getMockSettings", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.mockito.internal.MockHandler", "handle", "org.mockito.internal.invocation.Invocation", "<sample:9>"}}), new String[][]{{"getExtraInterfaces", "", "1"}, {"extraInterfaces", "java.lang.Class[]", "5"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("org.mockito.exceptions.base.MockitoException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput100() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.mockito.internal.MockitoCore", "org.mockito.internal.MockitoCore", "mock", new String[]{"java.lang.Class", "org.mockito.MockSettings"}, new String[]{"<sample:2>", "<sample:6>"}, false, 0, new String[][]{{"org.mockito.internal.MockitoCore", "mock", "java.lang.Class,org.mockito.MockSettings", "<sample:3>", "<sample:5>"}, {"org.mockito.internal.MockitoCore", "doAnswer", "org.mockito.stubbing.Answer", "<sample:1>"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("org.mockito.exceptions.misusing.UnfinishedStubbingException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput101() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.mockito.internal.MockHandler", "org.mockito.internal.MockHandler", "getInvocationContainer", new String[]{}, new String[]{}, false, 4, new String[][]{{"org.mockito.internal.MockHandler", "voidMethodStubbable", "java.lang.Object", "<sample:4>"}}), new String[][]{{"findAnswerFor", "org.mockito.internal.invocation.Invocation", "3"}});
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput102() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.mockito.internal.MockHandler", "org.mockito.internal.MockHandler", "voidMethodStubbable", new String[]{"java.lang.Object"}, new String[]{"<s:>a>"}, false, 0, new String[][]{{"org.mockito.internal.MockHandler", "voidMethodStubbable", "java.lang.Object", "<d:3.0>"}, {"org.mockito.internal.MockHandler", "setAnswersForStubbing", "java.util.List", "<sample:2>"}}), new String[][]{{"on", "", "3"}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals(">a", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput103() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.mockito.internal.MockHandler", "org.mockito.internal.MockHandler", "voidMethodStubbable", new String[]{"java.lang.Object"}, new String[]{"<s:\037>"}, false, 0, new String[][]{{"org.mockito.internal.MockHandler", "getInvocationContainer", ""}}), new String[][]{{"on", "", "4"}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("\037", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput104() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.mockito.internal.MockitoCore", "org.mockito.internal.MockitoCore", "reset", new String[]{"java.lang.Object[]"}, new String[]{"<empty>"}, false);
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput105() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.mockito.internal.MockitoCore", "org.mockito.internal.MockitoCore", "verifyNoMoreInteractionsInOrder", new String[]{"java.util.List", "org.mockito.internal.verification.api.InOrderContext"}, new String[]{"<sample:3>", "<sample:5>"}, false, 0, new String[][]{{"org.mockito.internal.MockitoCore", "verifyNoMoreInteractions", "java.lang.Object[]", "<empty>"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("org.mockito.exceptions.misusing.NotAMockException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput106() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.mockito.internal.MockitoCore", "org.mockito.internal.MockitoCore", "stub", new String[]{"java.lang.Object"}, new String[]{"<sample:1>"}, false, 4, new String[][]{{"org.mockito.internal.MockitoCore", "validateMockitoUsage", ""}});
  assertNotNull(actual);
  assertEquals("org.mockito.internal.stubbing.OngoingStubbingImpl", actual.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput107() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.mockito.internal.MockHandler", "org.mockito.internal.MockHandler", "voidMethodStubbable", new String[]{"java.lang.Object"}, new String[]{"<sample:0>"}, false, 0, new String[][]{{"org.mockito.internal.MockHandler", "handle", "org.mockito.internal.invocation.Invocation", "<sample:4>"}}), new String[][]{{"on", "", "3"}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("a", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput108() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.mockito.internal.MockitoCore", "org.mockito.internal.MockitoCore", "verifyNoMoreInteractionsInOrder", new String[]{"java.util.List", "org.mockito.internal.verification.api.InOrderContext"}, new String[]{"<sample:2>", "<null>"}, false, 0, new String[][]{{"org.mockito.internal.MockitoCore", "doAnswer", "org.mockito.stubbing.Answer", "<sample:7>"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("org.mockito.exceptions.misusing.UnfinishedStubbingException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput109() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.mockito.internal.MockHandler", "org.mockito.internal.MockHandler", "voidMethodStubbable", new String[]{"java.lang.Object"}, new String[]{"<s:>"}, false, 0, new String[][]{{"org.mockito.internal.MockHandler", "voidMethodStubbable", "java.lang.Object", "<i:-87>"}}), new String[][]{{"on", "", "5"}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput110() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.mockito.internal.MockHandler", "org.mockito.internal.MockHandler", "voidMethodStubbable", new String[]{"java.lang.Object"}, new String[]{"<d:-30.0>"}, false, 7, new String[][]{}), new String[][]{{"on", "", "5"}});
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("-30.0", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput111() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.mockito.internal.MockitoCore", "org.mockito.internal.MockitoCore", "reset", new String[]{"java.lang.Object[]"}, new String[]{"<sample:2>"}, false, 0, new String[][]{{"org.mockito.internal.MockitoCore", "stub", ""}, {"org.mockito.internal.MockitoCore", "inOrder", "java.lang.Object[]", "<null>"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("org.mockito.exceptions.misusing.NotAMockException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput112() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.mockito.internal.MockHandler", "org.mockito.internal.MockHandler", "handle", new String[]{"org.mockito.internal.invocation.Invocation"}, new String[]{"<sample:10>"}, false, 3, new String[][]{{"org.mockito.internal.MockHandler", "setAnswersForStubbing", "java.util.List", "<sample:0>"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.ClassCastException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput113() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.mockito.internal.MockitoCore", "org.mockito.internal.MockitoCore", "verifyNoMoreInteractionsInOrder", new String[]{"java.util.List", "org.mockito.internal.verification.api.InOrderContext"}, new String[]{"<null>", "<sample:2>"}, false, 1, new String[][]{}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput114() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.mockito.internal.MockitoCore", "org.mockito.internal.MockitoCore", "validateMockitoUsage", new String[]{}, new String[]{}, false, 3, new String[][]{{"org.mockito.internal.MockitoCore", "doAnswer", "org.mockito.stubbing.Answer", "<sample:6>"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("org.mockito.exceptions.misusing.UnfinishedStubbingException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput115() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.mockito.internal.MockitoCore", "org.mockito.internal.MockitoCore", "verifyNoMoreInteractions", new String[]{"java.lang.Object[]"}, new String[]{"<sample:2>"}, false, 0, new String[][]{{"org.mockito.internal.MockitoCore", "doAnswer", "org.mockito.stubbing.Answer", "<sample:7>"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("org.mockito.exceptions.misusing.UnfinishedStubbingException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput116() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.mockito.internal.MockHandler", "org.mockito.internal.MockHandler", "getInvocationContainer", new String[]{}, new String[]{}, false, 1, new String[][]{{"org.mockito.internal.MockHandler", "getInvocationContainer", ""}}), new String[][]{{"addAnswer", "org.mockito.stubbing.Answer", "3"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IndexOutOfBoundsException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput117() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.mockito.internal.MockitoCore", "org.mockito.internal.MockitoCore", "mock", new String[]{"java.lang.Class", "org.mockito.MockSettings"}, new String[]{"<null>", "<sample:4>"}, false, 4, new String[][]{{"org.mockito.internal.MockitoCore", "doAnswer", "org.mockito.stubbing.Answer", "<sample:3>"}, {"org.mockito.internal.MockitoCore", "stubVoid", "java.lang.Object", "<s:>"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput118() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.mockito.internal.MockHandler", "org.mockito.internal.MockHandler", "voidMethodStubbable", new String[]{"java.lang.Object"}, new String[]{"<s:aC>"}, false, 0, new String[][]{{"org.mockito.internal.MockHandler", "setAnswersForStubbing", "java.util.List", "<sample:2>"}}), new String[][]{{"on", "", "0"}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("aC", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput119() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.mockito.internal.MockitoCore", "org.mockito.internal.MockitoCore", "mock", new String[]{"java.lang.Class", "org.mockito.MockSettings"}, new String[]{"<sample:2>", "<sample:8>"}, false, 6, new String[][]{{"org.mockito.internal.MockitoCore", "doAnswer", "org.mockito.stubbing.Answer", "<sample:5>"}, {"org.mockito.internal.MockitoCore", "doAnswer", "org.mockito.stubbing.Answer", "<sample:2>"}}), new String[][]{{"newInstance", "org.mockito.cglib.proxy.Callback[]", "3"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.ArrayIndexOutOfBoundsException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput120() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.mockito.internal.MockitoCore", "org.mockito.internal.MockitoCore", "doAnswer", new String[]{"org.mockito.stubbing.Answer"}, new String[]{"<sample:7>"}, false, 0, new String[][]{{"org.mockito.internal.MockitoCore", "verifyNoMoreInteractions", "java.lang.Object[]", "<sample:0>"}}, 1), new String[][]{{"doReturn", "java.lang.Object", "2"}});
  assertNotNull(actual);
  assertEquals("org.mockito.internal.stubbing.StubberImpl", actual.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput121() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.mockito.internal.MockitoCore", "org.mockito.internal.MockitoCore", "doAnswer", new String[]{"org.mockito.stubbing.Answer"}, new String[]{"<sample:5>"}, false, 0, new String[][]{{"org.mockito.internal.MockitoCore", "validateMockitoUsage", ""}}, 3);
  assertNotNull(actual);
  assertEquals("org.mockito.internal.stubbing.StubberImpl", actual.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput122() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.mockito.internal.MockitoCore", "org.mockito.internal.MockitoCore", "getLastInvocation", new String[]{}, new String[]{}, false, 6, new String[][]{{"org.mockito.internal.MockitoCore", "stubVoid", "java.lang.Object", "<s::>"}, {"org.mockito.internal.MockitoCore", "verify", "java.lang.Object,org.mockito.verification.VerificationMode", "<b:true>", "<sample:5>"}}, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput123() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.mockito.internal.MockitoCore", "org.mockito.internal.MockitoCore", "doAnswer", new String[]{"org.mockito.stubbing.Answer"}, new String[]{"<sample:0>"}, false, 1, new String[][]{{"org.mockito.internal.MockitoCore", "stub", "java.lang.Object", "<sample:1>"}, {"org.mockito.internal.MockitoCore", "doAnswer", "org.mockito.stubbing.Answer", "<sample:7>"}}, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("org.mockito.exceptions.misusing.UnfinishedStubbingException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput124() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.mockito.internal.MockHandler", "org.mockito.internal.MockHandler", "voidMethodStubbable", new String[]{"java.lang.Object"}, new String[]{"<s:>b>"}, false, 6, new String[][]{{"org.mockito.internal.MockHandler", "setAnswersForStubbing", "java.util.List", "<sample:0>"}, {"org.mockito.internal.MockHandler", "setAnswersForStubbing", "java.util.List", "<sample:0>"}}, 2);
  assertNotNull(actual);
  assertEquals("org.mockito.internal.stubbing.VoidMethodStubbableImpl", actual.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput125() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.mockito.internal.MockitoCore", "org.mockito.internal.MockitoCore", "verify", new String[]{"java.lang.Object", "org.mockito.verification.VerificationMode"}, new String[]{"<i:1>", "<sample:5>"}, false, 4, new String[][]{{"org.mockito.internal.MockitoCore", "stub", "java.lang.Object", "<s:key>"}, {"org.mockito.internal.MockitoCore", "stubVoid", "java.lang.Object", "<d:1.492>"}}, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("org.mockito.exceptions.misusing.NotAMockException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput126() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.mockito.internal.MockitoCore", "org.mockito.internal.MockitoCore", "verifyNoMoreInteractions", new String[]{"java.lang.Object[]"}, new String[]{"<null>"}, false, 7, new String[][]{{"org.mockito.internal.MockitoCore", "verifyNoMoreInteractions", "java.lang.Object[]", "<empty>"}, {"org.mockito.internal.MockitoCore", "verifyNoMoreInteractions", "java.lang.Object[]", "<empty>"}}, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("org.mockito.exceptions.base.MockitoException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput127() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.mockito.internal.MockHandler", "org.mockito.internal.MockHandler", "voidMethodStubbable", new String[]{"java.lang.Object"}, new String[]{"<s:ley >"}, false, 5, new String[][]{{"org.mockito.internal.MockHandler", "getInvocationContainer", ""}}, 3), new String[][]{{"on", "", "0"}, {"on", "", "3"}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("ley ", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput128() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.mockito.internal.MockitoCore", "org.mockito.internal.MockitoCore", "verifyNoMoreInteractions", new String[]{"java.lang.Object[]"}, new String[]{"<empty>"}, false, 4, new String[][]{{"org.mockito.internal.MockitoCore", "stub", ""}, {"org.mockito.internal.MockitoCore", "verify", "java.lang.Object,org.mockito.verification.VerificationMode", "<d:0.15>", "<sample:0>"}}, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("org.mockito.exceptions.base.MockitoException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput129() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.mockito.internal.MockitoCore", "org.mockito.internal.MockitoCore", "reset", new String[]{"java.lang.Object[]"}, new String[]{"<empty>"}, false, 0, new String[][]{{"org.mockito.internal.MockitoCore", "validateMockitoUsage", ""}}, 2);
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput130() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.mockito.internal.MockitoCore", "org.mockito.internal.MockitoCore", "reset", new String[]{"java.lang.Object[]"}, new String[]{"<empty>"}, false, 6, new String[][]{{"org.mockito.internal.MockitoCore", "when", "java.lang.Object", "<i:4>"}}, 3);
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput131() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.mockito.internal.MockitoCore", "org.mockito.internal.MockitoCore", "reset", new String[]{"java.lang.Object[]"}, new String[]{"<empty>"}, false, 5, new String[][]{{"org.mockito.internal.MockitoCore", "verify", "java.lang.Object,org.mockito.verification.VerificationMode", "<sample:2>", "<sample:3>"}}, 1);
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput132() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.mockito.internal.MockitoCore", "org.mockito.internal.MockitoCore", "reset", new String[]{"java.lang.Object[]"}, new String[]{"<null>"}, false, 0, new String[][]{{"org.mockito.internal.MockitoCore", "getLastInvocation", ""}}, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput133() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.mockito.internal.MockHandler", "org.mockito.internal.MockHandler", "setAnswersForStubbing", new String[]{"java.util.List"}, new String[]{"<null>"}, false, 3, new String[][]{{"org.mockito.internal.MockHandler", "getMockSettings", ""}}, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput134() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.mockito.internal.MockHandler", "org.mockito.internal.MockHandler", "getMockSettings", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.mockito.internal.MockHandler", "handle", "org.mockito.internal.invocation.Invocation", "<sample:4>"}}, 3);
  assertNotNull(actual);
  assertEquals("org.mockito.internal.creation.MockSettingsImpl", actual.getClass().getName());
  assertEquals("{getExtraInterfaces=null, isSerializable=false}", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput135() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.mockito.internal.MockitoCore", "org.mockito.internal.MockitoCore", "reset", new String[]{"java.lang.Object[]"}, new String[]{"<null>"}, false, 0, null, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput136() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.mockito.internal.MockitoCore", "org.mockito.internal.MockitoCore", "mock", new String[]{"java.lang.Class", "org.mockito.MockSettings"}, new String[]{"<sample:1>", "<sample:4>"}, false, 4, new String[][]{{"org.mockito.internal.MockitoCore", "doAnswer", "org.mockito.stubbing.Answer", "<sample:5>"}}, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("org.mockito.exceptions.misusing.UnfinishedStubbingException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput137() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.mockito.internal.MockitoCore", "org.mockito.internal.MockitoCore", "verifyNoMoreInteractions", new String[]{"java.lang.Object[]"}, new String[]{"<null>"}, false, 0, new String[][]{{"org.mockito.internal.MockitoCore", "reset", "java.lang.Object[]", "<sample:4>"}}, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("org.mockito.exceptions.base.MockitoException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput138() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.mockito.internal.MockitoCore", "org.mockito.internal.MockitoCore", "verify", new String[]{"java.lang.Object", "org.mockito.verification.VerificationMode"}, new String[]{"<null>", "<sample:8>"}, false, 7, new String[][]{}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("org.mockito.exceptions.misusing.NullInsteadOfMockException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput139() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.mockito.internal.MockHandler", "org.mockito.internal.MockHandler", "getInvocationContainer", new String[]{}, new String[]{}, false, 4, new String[][]{{"org.mockito.internal.MockHandler", "setAnswersForStubbing", "java.util.List", "<empty>"}}), new String[][]{{"addAnswer", "org.mockito.stubbing.Answer,boolean", "7"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput140() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.mockito.internal.MockHandler", "org.mockito.internal.MockHandler", "handle", new String[]{"org.mockito.internal.invocation.Invocation"}, new String[]{"<sample:2>"}, false, 4, new String[][]{{"org.mockito.internal.MockHandler", "setAnswersForStubbing", "java.util.List", "<sample:3>"}}, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.ClassCastException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput141() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.mockito.internal.MockitoCore", "org.mockito.internal.MockitoCore", "mock", new String[]{"java.lang.Class", "org.mockito.MockSettings"}, new String[]{"<sample:2>", "<null>"}, false, 6, new String[][]{}, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput142() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.mockito.internal.MockitoCore", "org.mockito.internal.MockitoCore", "mock", new String[]{"java.lang.Class", "org.mockito.MockSettings"}, new String[]{"<sample:5>", "<sample:6>"}, false, 0, new String[][]{{"org.mockito.internal.MockitoCore", "getLastInvocation", ""}}), new String[][]{{"getCallback", "int", "3"}});
  assertNotNull(actual);
  assertEquals("org.mockito.internal.creation.jmock.SerializableNoOp", actual.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput143() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.mockito.internal.MockitoCore", "org.mockito.internal.MockitoCore", "when", new String[]{"java.lang.Object"}, new String[]{"<s:>"}, false, 0, new String[][]{{"org.mockito.internal.MockitoCore", "stub", ""}, {"org.mockito.internal.MockitoCore", "doAnswer", "org.mockito.stubbing.Answer", "<sample:7>"}}, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("org.mockito.exceptions.misusing.UnfinishedStubbingException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput144() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.mockito.internal.MockitoCore", "org.mockito.internal.MockitoCore", "mock", new String[]{"java.lang.Class", "org.mockito.MockSettings"}, new String[]{"<sample:1>", "<sample:10>"}, false, 6, new String[][]{{"org.mockito.internal.MockitoCore", "getLastInvocation", ""}}, 2), new String[][]{{"newInstance", "org.mockito.cglib.proxy.Callback", "3"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalStateException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput145() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.mockito.internal.MockitoCore", "org.mockito.internal.MockitoCore", "verifyNoMoreInteractionsInOrder", new String[]{"java.util.List", "org.mockito.internal.verification.api.InOrderContext"}, new String[]{"<sample:0>", "<sample:4>"}, false, 0, new String[][]{{"org.mockito.internal.MockitoCore", "verify", "java.lang.Object,org.mockito.verification.VerificationMode", "<d:3.189>", "<sample:5>"}}, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("org.mockito.exceptions.misusing.NotAMockException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput146() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.mockito.internal.MockHandler", "org.mockito.internal.MockHandler", "getInvocationContainer", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.mockito.internal.MockHandler", "getInvocationContainer", ""}, {"org.mockito.internal.MockHandler", "setAnswersForStubbing", "java.util.List", "<sample:1>"}}), new String[][]{{"setMethodForStubbing", "org.mockito.internal.invocation.InvocationMatcher", "0"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.ClassCastException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput147() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.mockito.internal.MockitoCore", "org.mockito.internal.MockitoCore", "reset", new String[]{"java.lang.Object[]"}, new String[]{"<empty>"}, false, 7, new String[][]{{"org.mockito.internal.MockitoCore", "verify", "java.lang.Object,org.mockito.verification.VerificationMode", "<i:-2147483648>", "<sample:0>"}}, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("org.mockito.exceptions.misusing.UnfinishedStubbingException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput148() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.mockito.internal.MockHandler", "org.mockito.internal.MockHandler", "getMockSettings", new String[]{}, new String[]{}, false, 0, null, 2), new String[][]{{"extraInterfaces", "java.lang.Class[]", "1"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("org.mockito.exceptions.base.MockitoException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput149() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.mockito.internal.MockitoCore", "org.mockito.internal.MockitoCore", "mock", new String[]{"java.lang.Class", "org.mockito.MockSettings"}, new String[]{"<sample:0>", "<sample:4>"}, false, 2, new String[][]{{"org.mockito.internal.MockitoCore", "doAnswer", "org.mockito.stubbing.Answer", "<sample:0>"}}, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("org.mockito.exceptions.base.MockitoException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput150() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.mockito.internal.MockitoCore", "org.mockito.internal.MockitoCore", "verifyNoMoreInteractionsInOrder", new String[]{"java.util.List", "org.mockito.internal.verification.api.InOrderContext"}, new String[]{"<sample:2>", "<sample:7>"}, false, 6, new String[][]{}, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("org.mockito.exceptions.misusing.NotAMockException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput151() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.mockito.internal.MockHandler", "org.mockito.internal.MockHandler", "getInvocationContainer", new String[]{}, new String[]{}, false, 2, new String[][]{{"org.mockito.internal.MockHandler", "getInvocationContainer", ""}}, 3), new String[][]{{"addAnswer", "org.mockito.stubbing.Answer", "4"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IndexOutOfBoundsException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput152() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.mockito.internal.MockHandler", "org.mockito.internal.MockHandler", "getMockSettings", new String[]{}, new String[]{}, false, 3, new String[][]{{"org.mockito.internal.MockHandler", "handle", "org.mockito.internal.invocation.Invocation", "<null>"}, {"org.mockito.internal.MockHandler", "setAnswersForStubbing", "java.util.List", "<sample:5>"}}, 1), new String[][]{{"name", "java.lang.String", "2"}, {"extraInterfaces", "java.lang.Class[]", "1"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("org.mockito.exceptions.base.MockitoException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput153() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.mockito.internal.MockHandler", "org.mockito.internal.MockHandler", "getInvocationContainer", new String[]{}, new String[]{}, false, 6, new String[][]{{"org.mockito.internal.MockHandler", "setAnswersForStubbing", "java.util.List", "<sample:3>"}}, 3), new String[][]{{"hasAnswersForStubbing", "", "2"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput154() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.mockito.internal.MockitoCore", "org.mockito.internal.MockitoCore", "stub", new String[]{"java.lang.Object"}, new String[]{"<d:1.477>"}, false, 2, new String[][]{}, 1);
  assertNotNull(actual);
  assertEquals("org.mockito.internal.stubbing.OngoingStubbingImpl", actual.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput155() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.mockito.internal.MockitoCore", "org.mockito.internal.MockitoCore", "verifyNoMoreInteractionsInOrder", new String[]{"java.util.List", "org.mockito.internal.verification.api.InOrderContext"}, new String[]{"<null>", "<sample:5>"}, false, 0, new String[][]{{"org.mockito.internal.MockitoCore", "verify", "java.lang.Object,org.mockito.verification.VerificationMode", "<s:ley>", "<sample:6>"}}, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput156() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.mockito.internal.MockHandler", "org.mockito.internal.MockHandler", "getInvocationContainer", new String[]{}, new String[]{}, false, 4, new String[][]{{"org.mockito.internal.MockHandler", "voidMethodStubbable", "java.lang.Object", "<s:keyya>"}}, 2), new String[][]{{"addAnswer", "org.mockito.stubbing.Answer", "6"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IndexOutOfBoundsException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput157() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.mockito.internal.MockHandler", "org.mockito.internal.MockHandler", "getMockSettings", new String[]{}, new String[]{}, false, 5, new String[][]{{"org.mockito.internal.MockHandler", "voidMethodStubbable", "java.lang.Object", "<i:1>"}, {"org.mockito.internal.MockHandler", "handle", "org.mockito.internal.invocation.Invocation", "<sample:1>"}}, 2), new String[][]{{"getExtraInterfaces", "", "1"}});
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput158() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.mockito.internal.MockitoCore", "org.mockito.internal.MockitoCore", "mock", new String[]{"java.lang.Class", "org.mockito.MockSettings"}, new String[]{"<sample:2>", "<null>"}, false, 6, new String[][]{{"org.mockito.internal.MockitoCore", "getLastInvocation", ""}}, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput159() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.mockito.internal.MockitoCore", "org.mockito.internal.MockitoCore", "doAnswer", new String[]{"org.mockito.stubbing.Answer"}, new String[]{"<sample:1>"}, false, 0, new String[][]{{"org.mockito.internal.MockitoCore", "getLastInvocation", ""}, {"org.mockito.internal.MockitoCore", "getLastInvocation", ""}}, 1), new String[][]{{"when", "java.lang.Object", "1"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("org.mockito.exceptions.misusing.NotAMockException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput160() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.mockito.internal.MockHandler", "org.mockito.internal.MockHandler", "getMockSettings", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.mockito.internal.MockHandler", "voidMethodStubbable", "java.lang.Object", "<i:-1>"}}, 1), new String[][]{{"getSpiedInstance", "", "3"}});
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput161() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.mockito.internal.MockitoCore", "org.mockito.internal.MockitoCore", "verifyNoMoreInteractionsInOrder", new String[]{"java.util.List", "org.mockito.internal.verification.api.InOrderContext"}, new String[]{"<empty>", "<sample:9>"}, false, 5, new String[][]{{"org.mockito.internal.MockitoCore", "validateMockitoUsage", ""}}, 3);
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput162() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.mockito.internal.MockHandler", "org.mockito.internal.MockHandler", "getInvocationContainer", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.mockito.internal.MockHandler", "handle", "org.mockito.internal.invocation.Invocation", "<sample:8>"}}, 2), new String[][]{{"findAnswerFor", "org.mockito.internal.invocation.Invocation", "0"}});
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput163() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.mockito.internal.MockitoCore", "org.mockito.internal.MockitoCore", "stub", new String[]{"java.lang.Object"}, new String[]{"<i:0>"}, false, 2, new String[][]{{"org.mockito.internal.MockitoCore", "inOrder", "java.lang.Object[]", "<sample:2>"}}, 3), new String[][]{{"thenAnswer", "org.mockito.stubbing.Answer", "0"}, {"thenCallRealMethod", "", "6"}});
  assertNotNull(actual);
  assertEquals("org.mockito.internal.stubbing.ConsecutiveStubbing", actual.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput164() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.mockito.internal.MockHandler", "org.mockito.internal.MockHandler", "voidMethodStubbable", new String[]{"java.lang.Object"}, new String[]{"<b:true>"}, false, 0, new String[][]{{"org.mockito.internal.MockHandler", "handle", "org.mockito.internal.invocation.Invocation", "<sample:0>"}}, 3);
  assertNotNull(actual);
  assertEquals("org.mockito.internal.stubbing.VoidMethodStubbableImpl", actual.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput165() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.mockito.internal.MockHandler", "org.mockito.internal.MockHandler", "voidMethodStubbable", new String[]{"java.lang.Object"}, new String[]{"<i:35>"}, false, 6, new String[][]{}, 3), new String[][]{{"on", "", "0"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("35", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput166() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.mockito.internal.MockHandler", "org.mockito.internal.MockHandler", "setAnswersForStubbing", new String[]{"java.util.List"}, new String[]{"<null>"}, false, 0, new String[][]{{"org.mockito.internal.MockHandler", "getInvocationContainer", ""}}, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput167() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.mockito.internal.MockHandler", "org.mockito.internal.MockHandler", "voidMethodStubbable", new String[]{"java.lang.Object"}, new String[]{"<i:-48>"}, false, 0, new String[][]{{"org.mockito.internal.MockHandler", "getMockSettings", ""}, {"org.mockito.internal.MockHandler", "getInvocationContainer", ""}}), new String[][]{{"toAnswer", "org.mockito.stubbing.Answer", "2"}, {"on", "", "4"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("-48", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput168() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.mockito.internal.MockHandler", "org.mockito.internal.MockHandler", "getMockSettings", new String[]{}, new String[]{}, false, 2, new String[][]{{"org.mockito.internal.MockHandler", "getMockSettings", ""}}, 2), new String[][]{{"getMockName", "", "2"}});
  assertNotNull(actual);
  assertEquals("org.mockito.internal.util.MockName", actual.getClass().getName());
  assertEquals("string {isSurrogate=true}", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput169() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.mockito.internal.MockitoCore", "org.mockito.internal.MockitoCore", "mock", new String[]{"java.lang.Class", "org.mockito.MockSettings"}, new String[]{"<null>", "<null>"}, false, 4, new String[][]{{"org.mockito.internal.MockitoCore", "doAnswer", "org.mockito.stubbing.Answer", "<sample:2>"}}, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput170() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.mockito.internal.MockHandler", "org.mockito.internal.MockHandler", "setAnswersForStubbing", new String[]{"java.util.List"}, new String[]{"<null>"}, false, 0, new String[][]{{"org.mockito.internal.MockHandler", "handle", "org.mockito.internal.invocation.Invocation", "<sample:2>"}}, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput171() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.mockito.internal.MockHandler", "org.mockito.internal.MockHandler", "handle", new String[]{"org.mockito.internal.invocation.Invocation"}, new String[]{"<sample:7>"}, false, 0, new String[][]{{"org.mockito.internal.MockHandler", "setAnswersForStubbing", "java.util.List", "<sample:3>"}, {"org.mockito.internal.MockHandler", "getInvocationContainer", ""}}, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.ClassCastException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput172() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.mockito.internal.MockitoCore", "org.mockito.internal.MockitoCore", "when", new String[]{"java.lang.Object"}, new String[]{"<b:false>"}, false, 0, new String[][]{{"org.mockito.internal.MockitoCore", "verifyNoMoreInteractions", "java.lang.Object[]", "<sample:4>"}, {"org.mockito.internal.MockitoCore", "doAnswer", "org.mockito.stubbing.Answer", "<sample:2>"}}, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("org.mockito.exceptions.misusing.UnfinishedStubbingException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput173() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.mockito.internal.MockitoCore", "org.mockito.internal.MockitoCore", "verifyNoMoreInteractionsInOrder", new String[]{"java.util.List", "org.mockito.internal.verification.api.InOrderContext"}, new String[]{"<null>", "<sample:5>"}, false, 0, new String[][]{{"org.mockito.internal.MockitoCore", "stubVoid", "java.lang.Object", "<sample:4>"}, {"org.mockito.internal.MockitoCore", "validateMockitoUsage", ""}}, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput174() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.mockito.internal.MockHandler", "org.mockito.internal.MockHandler", "voidMethodStubbable", new String[]{"java.lang.Object"}, new String[]{"<s:b{>"}, false, 0, new String[][]{{"org.mockito.internal.MockHandler", "voidMethodStubbable", "java.lang.Object", "<s:keey>"}}, 2), new String[][]{{"toThrow", "java.lang.Throwable", "0"}, {"on", "", "1"}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("b{", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput175() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.mockito.internal.MockitoCore", "org.mockito.internal.MockitoCore", "verifyNoMoreInteractionsInOrder", new String[]{"java.util.List", "org.mockito.internal.verification.api.InOrderContext"}, new String[]{"<null>", "<sample:9>"}, false, 0, new String[][]{{"org.mockito.internal.MockitoCore", "stubVoid", "java.lang.Object", "<i:20>"}, {"org.mockito.internal.MockitoCore", "getLastInvocation", ""}}, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput176() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.mockito.internal.MockHandler", "org.mockito.internal.MockHandler", "getMockSettings", new String[]{}, new String[]{}, false, 0, null, 2), new String[][]{{"isSerializable", "", "3"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput177() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.mockito.internal.MockHandler", "org.mockito.internal.MockHandler", "voidMethodStubbable", new String[]{"java.lang.Object"}, new String[]{"<b:true>"}, false), new String[][]{{"on", "", "7"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput178() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.mockito.internal.MockHandler", "org.mockito.internal.MockHandler", "getInvocationContainer", new String[]{}, new String[]{}, false, 7, new String[][]{}), new String[][]{{"hasAnswersForStubbing", "", "0"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput179() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.mockito.internal.MockHandler", "org.mockito.internal.MockHandler", "voidMethodStubbable", new String[]{"java.lang.Object"}, new String[]{"<d:3.0>"}, false, 6, new String[][]{{"org.mockito.internal.MockHandler", "getMockSettings", ""}}, 1), new String[][]{{"on", "", "3"}});
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("3.0", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput180() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.mockito.internal.MockHandler", "org.mockito.internal.MockHandler", "getInvocationContainer", new String[]{}, new String[]{}, false, 2, new String[][]{}, 3), new String[][]{{"getInvocations", "", "1"}});
  assertNotNull(actual);
  assertEquals("java.util.LinkedList", actual.getClass().getName());
  assertEquals("[]", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput181() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.mockito.internal.MockHandler", "org.mockito.internal.MockHandler", "getInvocationContainer", new String[]{}, new String[]{}, false, 5, new String[][]{{"org.mockito.internal.MockHandler", "getMockSettings", ""}}, 1), new String[][]{{"addAnswer", "org.mockito.stubbing.Answer,boolean", "6"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput182() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.mockito.internal.MockHandler", "org.mockito.internal.MockHandler", "getInvocationContainer", new String[]{}, new String[]{}, false, 6, new String[][]{{"org.mockito.internal.MockHandler", "getMockSettings", ""}, {"org.mockito.internal.MockHandler", "getInvocationContainer", ""}}, 3), new String[][]{{"hasAnswersForStubbing", "", "6"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput183() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.mockito.internal.MockitoCore", "org.mockito.internal.MockitoCore", "stub", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.mockito.internal.MockitoCore", "validateMockitoUsage", ""}, {"org.mockito.internal.MockitoCore", "verifyNoMoreInteractionsInOrder", "java.util.List,org.mockito.internal.verification.api.InOrderContext", "<sample:2>", "<sample:10>"}}), new String[][]{{"toAnswer", "org.mockito.stubbing.Answer", "7"}});
  assertNotNull(actual);
  assertEquals("org.mockito.internal.stubbing.ConsecutiveStubbing", actual.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput184() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.mockito.internal.MockHandler", "org.mockito.internal.MockHandler", "getMockSettings", new String[]{}, new String[]{}, false, 2, new String[][]{{"org.mockito.internal.MockHandler", "getMockSettings", ""}}, 3), new String[][]{{"getMockName", "", "6"}});
  assertNotNull(actual);
  assertEquals("org.mockito.internal.util.MockName", actual.getClass().getName());
  assertEquals("string {isSurrogate=true}", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput185() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.mockito.internal.MockHandler", "org.mockito.internal.MockHandler", "handle", new String[]{"org.mockito.internal.invocation.Invocation"}, new String[]{"<sample:3>"}, false, 2, new String[][]{{"org.mockito.internal.MockHandler", "setAnswersForStubbing", "java.util.List", "<sample:2>"}}, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.ClassCastException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput186() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.mockito.internal.MockHandler", "org.mockito.internal.MockHandler", "getInvocationContainer", new String[]{}, new String[]{}, false, 1, new String[][]{{"org.mockito.internal.MockHandler", "handle", "org.mockito.internal.invocation.Invocation", "<sample:4>"}}, 1), new String[][]{{"findAnswerFor", "org.mockito.internal.invocation.Invocation", "7"}});
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput187() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.mockito.internal.MockHandler", "org.mockito.internal.MockHandler", "getMockSettings", new String[]{}, new String[]{}, false, 1, new String[][]{{"org.mockito.internal.MockHandler", "getInvocationContainer", ""}}), new String[][]{{"getMockName", "", "2"}});
  assertNotNull(actual);
  assertEquals("org.mockito.internal.util.MockName", actual.getClass().getName());
  assertEquals("string {isSurrogate=true}", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput188() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.mockito.internal.MockHandler", "org.mockito.internal.MockHandler", "getInvocationContainer", new String[]{}, new String[]{}, false, 7, new String[][]{}, 1), new String[][]{{"addAnswer", "org.mockito.stubbing.Answer", "2"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IndexOutOfBoundsException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput189() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.mockito.internal.MockitoCore", "org.mockito.internal.MockitoCore", "verifyNoMoreInteractionsInOrder", new String[]{"java.util.List", "org.mockito.internal.verification.api.InOrderContext"}, new String[]{"<sample:3>", "<sample:7>"}, false, 0, new String[][]{{"org.mockito.internal.MockitoCore", "stub", ""}, {"org.mockito.internal.MockitoCore", "doAnswer", "org.mockito.stubbing.Answer", "<sample:5>"}}, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("org.mockito.exceptions.misusing.UnfinishedStubbingException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput190() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.mockito.internal.MockHandler", "org.mockito.internal.MockHandler", "getInvocationContainer", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.mockito.internal.MockHandler", "voidMethodStubbable", "java.lang.Object", "<i:-42>"}}, 2), new String[][]{{"getInvocations", "", "6"}, {"lastIndexOf", "java.lang.Object", "1"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("-1", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput191() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.mockito.internal.MockitoCore", "org.mockito.internal.MockitoCore", "when", new String[]{"java.lang.Object"}, new String[]{"<i:0>"}, false, 2, new String[][]{{"org.mockito.internal.MockitoCore", "verifyNoMoreInteractions", "java.lang.Object[]", "<sample:0>"}}, 3), new String[][]{{"thenThrow", "java.lang.Throwable[]", "5"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("org.mockito.exceptions.base.MockitoException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput192() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.mockito.internal.MockitoCore", "org.mockito.internal.MockitoCore", "getLastInvocation", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.mockito.internal.MockitoCore", "validateMockitoUsage", ""}, {"org.mockito.internal.MockitoCore", "mock", "java.lang.Class,org.mockito.MockSettings", "<empty>", "<sample:7>"}}, 3);
  assertNotNull(actual);
  assertEquals("org.mockito.internal.invocation.Invocation", actual.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput193() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.mockito.internal.MockHandler", "org.mockito.internal.MockHandler", "getInvocationContainer", new String[]{}, new String[]{}, false, 6, new String[][]{{"org.mockito.internal.MockHandler", "voidMethodStubbable", "java.lang.Object", "<sample:1>"}, {"org.mockito.internal.MockHandler", "handle", "org.mockito.internal.invocation.Invocation", "<sample:9>"}}, 1), new String[][]{{"addConsecutiveAnswer", "org.mockito.stubbing.Answer", "7"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.util.NoSuchElementException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput194() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.mockito.internal.MockHandler", "org.mockito.internal.MockHandler", "getInvocationContainer", new String[]{}, new String[]{}, false, 2, new String[][]{{"org.mockito.internal.MockHandler", "setAnswersForStubbing", "java.util.List", "<sample:0>"}}, 2), new String[][]{{"setMethodForStubbing", "org.mockito.internal.invocation.InvocationMatcher", "6"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.ClassCastException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput195() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.mockito.internal.MockHandler", "org.mockito.internal.MockHandler", "getInvocationContainer", new String[]{}, new String[]{}, false, 2, new String[][]{}, 3), new String[][]{{"addAnswer", "org.mockito.stubbing.Answer,boolean", "3"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput196() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.mockito.internal.MockitoCore", "org.mockito.internal.MockitoCore", "verify", new String[]{"java.lang.Object", "org.mockito.verification.VerificationMode"}, new String[]{"<s:key>", "<sample:8>"}, false, 0, null, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("org.mockito.exceptions.misusing.NotAMockException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput197() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.mockito.internal.MockHandler", "org.mockito.internal.MockHandler", "getMockSettings", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.mockito.internal.MockHandler", "setAnswersForStubbing", "java.util.List", "<sample:4>"}}, 1), new String[][]{{"isSerializable", "", "4"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput198() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.mockito.internal.MockitoCore", "org.mockito.internal.MockitoCore", "mock", new String[]{"java.lang.Class", "org.mockito.MockSettings"}, new String[]{"<sample:1>", "<sample:4>"}, false, 6, new String[][]{{"org.mockito.internal.MockitoCore", "mock", "java.lang.Class,org.mockito.MockSettings", "<sample:1>", "<sample:5>"}}, 2);
  assertNotNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput199() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.mockito.internal.MockitoCore", "org.mockito.internal.MockitoCore", "verify", new String[]{"java.lang.Object", "org.mockito.verification.VerificationMode"}, new String[]{"<null>", "<sample:4>"}, false, 0, new String[][]{{"org.mockito.internal.MockitoCore", "stub", ""}, {"org.mockito.internal.MockitoCore", "inOrder", "java.lang.Object[]", "<empty>"}}, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("org.mockito.exceptions.misusing.NullInsteadOfMockException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput200() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.mockito.internal.MockitoCore", "org.mockito.internal.MockitoCore", "mock", new String[]{"java.lang.Class", "org.mockito.MockSettings"}, new String[]{"<sample:1>", "<sample:8>"}, false, 7, new String[][]{{"org.mockito.internal.MockitoCore", "stub", ""}, {"org.mockito.internal.MockitoCore", "inOrder", "java.lang.Object[]", "<sample:7>"}}, 2), new String[][]{{"newInstance", "java.lang.Class[],java.lang.Object[],org.mockito.cglib.proxy.Callback[]", "3"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput201() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.mockito.internal.MockitoCore", "org.mockito.internal.MockitoCore", "stub", new String[]{"java.lang.Object"}, new String[]{"<s:a>"}, false, 7, new String[][]{{"org.mockito.internal.MockitoCore", "inOrder", "java.lang.Object[]", "<sample:6>"}, {"org.mockito.internal.MockitoCore", "verifyNoMoreInteractions", "java.lang.Object[]", "<sample:1>"}}, 2), new String[][]{{"getRegisteredInvocations", "", "3"}});
  assertNotNull(actual);
  assertEquals("java.util.LinkedList", actual.getClass().getName());
  assertEquals("[]", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput202() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.mockito.internal.MockitoCore", "org.mockito.internal.MockitoCore", "stub", new String[]{}, new String[]{}, false, 0, null, 3), new String[][]{{"thenReturn", "java.lang.Object", "1"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("org.mockito.exceptions.misusing.WrongTypeOfReturnValue", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput203() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.mockito.internal.MockitoCore", "org.mockito.internal.MockitoCore", "verifyNoMoreInteractionsInOrder", new String[]{"java.util.List", "org.mockito.internal.verification.api.InOrderContext"}, new String[]{"<empty>", "<sample:4>"}, false, 2, new String[][]{}, 1);
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput204() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.mockito.internal.MockHandler", "org.mockito.internal.MockHandler", "voidMethodStubbable", new String[]{"java.lang.Object"}, new String[]{"<i:0>"}, false, 6, new String[][]{{"org.mockito.internal.MockHandler", "getInvocationContainer", ""}, {"org.mockito.internal.MockHandler", "handle", "org.mockito.internal.invocation.Invocation", "<sample:4>"}}, 3), new String[][]{{"on", "", "4"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput205() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.mockito.internal.MockHandler", "org.mockito.internal.MockHandler", "getInvocationContainer", new String[]{}, new String[]{}, false, 4, new String[][]{}, 3), new String[][]{{"findAnswerFor", "org.mockito.internal.invocation.Invocation", "4"}});
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput206() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.mockito.internal.MockitoCore", "org.mockito.internal.MockitoCore", "verifyNoMoreInteractions", new String[]{"java.lang.Object[]"}, new String[]{"<sample:6>"}, false, 6, new String[][]{{"org.mockito.internal.MockitoCore", "stub", "java.lang.Object", "<i:0>"}}, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("org.mockito.exceptions.misusing.UnfinishedStubbingException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput207() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.mockito.internal.MockHandler", "org.mockito.internal.MockHandler", "voidMethodStubbable", new String[]{"java.lang.Object"}, new String[]{"<s:le>"}, false, 0, new String[][]{{"org.mockito.internal.MockHandler", "getMockSettings", ""}, {"org.mockito.internal.MockHandler", "handle", "org.mockito.internal.invocation.Invocation", "<sample:2>"}}, 3), new String[][]{{"on", "", "7"}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("le", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput208() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.mockito.internal.MockHandler", "org.mockito.internal.MockHandler", "getMockSettings", new String[]{}, new String[]{}, false, 4, new String[][]{{"org.mockito.internal.MockHandler", "getMockSettings", ""}}), new String[][]{{"defaultAnswer", "org.mockito.stubbing.Answer", "7"}, {"getDefaultAnswer", "", "3"}});
  assertNotNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput209() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.mockito.internal.MockitoCore", "org.mockito.internal.MockitoCore", "verify", new String[]{"java.lang.Object", "org.mockito.verification.VerificationMode"}, new String[]{"<null>", "<sample:2>"}, false, 0, new String[][]{{"org.mockito.internal.MockitoCore", "mock", "java.lang.Class,org.mockito.MockSettings", "<empty>", "<sample:4>"}}, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("org.mockito.exceptions.misusing.NullInsteadOfMockException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput210() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.mockito.internal.MockHandler", "org.mockito.internal.MockHandler", "voidMethodStubbable", new String[]{"java.lang.Object"}, new String[]{"<i:-8>"}, false, 6, new String[][]{{"org.mockito.internal.MockHandler", "getMockSettings", ""}}, 2), new String[][]{{"on", "", "5"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("-8", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput211() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.mockito.internal.MockHandler", "org.mockito.internal.MockHandler", "voidMethodStubbable", new String[]{"java.lang.Object"}, new String[]{"<s:la>"}, false, 1, new String[][]{{"org.mockito.internal.MockHandler", "setAnswersForStubbing", "java.util.List", "<sample:2>"}}, 3), new String[][]{{"on", "", "4"}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("la", String.valueOf(actual));
 }
}
