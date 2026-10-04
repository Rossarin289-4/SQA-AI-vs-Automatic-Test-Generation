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
  try { SearchInputFactory_scaffolding.call("org.mockito.internal.MockitoCore", "org.mockito.internal.MockitoCore", "verifyNoMoreInteractions", new String[]{"java.lang.Object[]"}, new String[]{"<empty>"}, false); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("org.mockito.exceptions.base.MockitoException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput001() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.mockito.internal.MockitoCore", "org.mockito.internal.MockitoCore", "verifyNoMoreInteractions", new String[]{"java.lang.Object[]"}, new String[]{"<null>"}, false); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("org.mockito.exceptions.base.MockitoException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput002() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.mockito.Mockito", "org.mockito.Mockito", "spy", new String[]{"java.lang.Object"}, new String[]{"<i:0>"}, true); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("org.mockito.exceptions.base.MockitoException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput003() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.mockito.Mockito", "org.mockito.Mockito", "doReturn", new String[]{"java.lang.Object"}, new String[]{"<i:0>"}, true), new String[][]{{"doAnswer", "org.mockito.stubbing.Answer", "7"}});
  assertNotNull(actual);
  assertEquals("org.mockito.internal.stubbing.StubberImpl", actual.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput004() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.mockito.Mockito", "org.mockito.Mockito", "debug", new String[]{}, new String[]{}, true);
  assertNotNull(actual);
  assertEquals("org.mockito.internal.debugging.MockitoDebuggerImpl", actual.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput005() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.mockito.Mockito", "org.mockito.Mockito", "verify", new String[]{"java.lang.Object"}, new String[]{"<null>"}, true); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("org.mockito.exceptions.misusing.NullInsteadOfMockException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput006() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.mockito.Mockito", "org.mockito.Mockito", "only", new String[]{}, new String[]{}, true);
  assertNotNull(actual);
  assertEquals("org.mockito.internal.verification.Only", actual.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput007() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.mockito.Mockito", "org.mockito.Mockito", "atLeast", new String[]{"int"}, new String[]{"10"}, true, 0, null, 1), new String[][]{{"verifyInOrder", "org.mockito.internal.verification.api.VerificationData", "4"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.ClassCastException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput008() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.mockito.Mockito", "org.mockito.Mockito", "doAnswer", new String[]{"org.mockito.stubbing.Answer"}, new String[]{"<null>"}, true);
  assertNotNull(actual);
  assertEquals("org.mockito.internal.stubbing.StubberImpl", actual.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput009() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.mockito.internal.MockitoCore", "org.mockito.internal.MockitoCore", "verifyNoMoreInteractions", new String[]{"java.lang.Object[]"}, new String[]{"<sample:0>"}, false, 0, new String[][]{{"org.mockito.internal.MockitoCore", "validateMockitoUsage", ""}, {"org.mockito.internal.MockitoCore", "reset", "java.lang.Object[]", "<sample:0>"}, {"org.mockito.internal.MockitoCore", "inOrder", "java.lang.Object[]", "<sample:2>"}}, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("org.mockito.exceptions.misusing.NotAMockException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput010() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.mockito.Mockito", "org.mockito.Mockito", "atMost", new String[]{"int"}, new String[]{"1"}, true);
  assertNotNull(actual);
  assertEquals("org.mockito.internal.verification.AtMost", actual.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput011() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.mockito.Mockito", "org.mockito.Mockito", "doNothing", new String[]{}, new String[]{}, true);
  assertNotNull(actual);
  assertEquals("org.mockito.internal.stubbing.StubberImpl", actual.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput012() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.mockito.Mockito", "org.mockito.Mockito", "never", new String[]{}, new String[]{}, true);
  assertNotNull(actual);
  assertEquals("org.mockito.internal.verification.Times", actual.getClass().getName());
  assertEquals("Wanted invocations count: 0", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput013() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.mockito.Mockito", "org.mockito.Mockito", "reset", new String[]{"java.lang.Object[]"}, new String[]{"<empty>"}, true, 0, null, 3);
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput014() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.mockito.Mockito", "org.mockito.Mockito", "atLeastOnce", new String[]{}, new String[]{}, true);
  assertNotNull(actual);
  assertEquals("org.mockito.internal.verification.AtLeast", actual.getClass().getName());
  assertEquals("Wanted invocations count: at least 1", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput015() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.mockito.Mockito", "org.mockito.Mockito", "validateMockitoUsage", new String[]{}, new String[]{}, true, 0, null, 1);
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput016() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.mockito.internal.MockitoCore", "org.mockito.internal.MockitoCore", "mock", new String[]{"java.lang.Class", "org.mockito.MockSettings", "boolean"}, new String[]{"<sample:6>", "<sample:8>", "true"}, false, 2, new String[][]{{"org.mockito.internal.MockitoCore", "reset", "java.lang.Object[]", "<null>"}, {"org.mockito.internal.MockitoCore", "inOrder", "java.lang.Object[]", "<empty>"}, {"org.mockito.internal.MockitoCore", "inOrder", "java.lang.Object[]", "<null>"}}, 2);
  assertNotNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput017() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.mockito.internal.MockitoCore", "org.mockito.internal.MockitoCore", "mock", new String[]{"java.lang.Class", "org.mockito.MockSettings", "boolean"}, new String[]{"<sample:6>", "<sample:6>", "true"}, false, 0, new String[][]{{"org.mockito.internal.MockitoCore", "getLastInvocation", ""}, {"org.mockito.internal.MockitoCore", "verifyNoMoreInteractions", "java.lang.Object[]", "<sample:0>"}, {"org.mockito.internal.MockitoCore", "inOrder", "java.lang.Object[]", "<sample:6>"}}, 2), new String[][]{{"add", "int,java.lang.Object", "6"}, {"setCallbacks", "org.mockito.cglib.proxy.Callback[]", "3"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.ClassCastException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput018() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.mockito.internal.MockitoCore", "org.mockito.internal.MockitoCore", "reset", new String[]{"java.lang.Object[]"}, new String[]{"<empty>"}, false, 9, new String[][]{{"org.mockito.internal.MockitoCore", "when", "java.lang.Object", "<i:0>"}, {"org.mockito.internal.MockitoCore", "mock", "java.lang.Class,org.mockito.MockSettings,boolean", "<sample:2>", "<sample:3>", "false"}, {"org.mockito.internal.MockitoCore", "inOrder", "java.lang.Object[]", "<sample:5>"}}, 3);
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput019() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.mockito.Mockito", "org.mockito.Mockito", "intThat", new String[]{"org.hamcrest.Matcher"}, new String[]{"<sample:5>"}, true, 0, null, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput020() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.mockito.Mockito", "org.mockito.Mockito", "inOrder", new String[]{"java.lang.Object[]"}, new String[]{"<null>"}, true, 0, null, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("org.mockito.exceptions.base.MockitoException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput021() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.mockito.Mockito", "org.mockito.Mockito", "inOrder", new String[]{"java.lang.Object[]"}, new String[]{"<sample:2>"}, true, 0, null, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("org.mockito.exceptions.misusing.NotAMockException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput022() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.mockito.Mockito", "org.mockito.Mockito", "inOrder", new String[]{"java.lang.Object[]"}, new String[]{"<empty>"}, true, 0, null, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("org.mockito.exceptions.base.MockitoException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput023() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.mockito.Mockito", "org.mockito.Mockito", "eq", new String[]{"long"}, new String[]{"9223372036854775807"}, true, 0, null, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Long", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput024() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.mockito.Mockito", "org.mockito.Mockito", "mock", new String[]{"java.lang.Class", "org.mockito.stubbing.Answer"}, new String[]{"<null>", "<sample:2>"}, true, 0, null, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput025() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.mockito.Mockito", "org.mockito.Mockito", "verifyZeroInteractions", new String[]{"java.lang.Object[]"}, new String[]{"<null>"}, true, 0, null, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("org.mockito.exceptions.base.MockitoException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput026() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.mockito.Mockito", "org.mockito.Mockito", "eq", new String[]{"java.lang.Object"}, new String[]{"<b:true>"}, true, 0, null, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput027() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.mockito.Mockito", "org.mockito.Mockito", "eq", new String[]{"java.lang.Object"}, new String[]{"<sample:0>"}, true, 0, null, 2);
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput028() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.mockito.Mockito", "org.mockito.Mockito", "eq", new String[]{"boolean"}, new String[]{"false"}, true, 0, null, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput029() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.mockito.Mockito", "org.mockito.Mockito", "eq", new String[]{"char"}, new String[]{"8"}, true, 0, null, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Character", actual.getClass().getName());
  assertEquals("\000", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput030() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.mockito.Mockito", "org.mockito.Mockito", "refEq", new String[]{"java.lang.Object", "java.lang.String[]"}, new String[]{"<s:>", "<sample:0>"}, true, 0, null, 3);
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput031() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.mockito.Mockito", "org.mockito.Mockito", "atLeast", new String[]{"int"}, new String[]{"-1"}, true, 0, null, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("org.mockito.exceptions.base.MockitoException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput032() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.mockito.Mockito", "org.mockito.Mockito", "doReturn", new String[]{"java.lang.Object"}, new String[]{"<s:>"}, true, 0, null, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("org.mockito.exceptions.misusing.UnfinishedStubbingException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput033() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.mockito.Mockito", "org.mockito.Mockito", "eq", new String[]{"byte"}, new String[]{"0"}, true, 0, null, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Byte", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput034() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.mockito.internal.MockitoCore", "org.mockito.internal.MockitoCore", "inOrder", new String[]{"java.lang.Object[]"}, new String[]{"<sample:5>"}, false, 1, new String[][]{}, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("org.mockito.exceptions.misusing.NotAMockException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput035() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.mockito.internal.MockitoCore", "org.mockito.internal.MockitoCore", "inOrder", new String[]{"java.lang.Object[]"}, new String[]{"<null>"}, false, 1, new String[][]{{"org.mockito.internal.MockitoCore", "when", "java.lang.Object", "<i:0>"}}, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("org.mockito.exceptions.base.MockitoException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput036() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.mockito.internal.MockitoCore", "org.mockito.internal.MockitoCore", "mock", new String[]{"java.lang.Class", "org.mockito.MockSettings", "boolean"}, new String[]{"<empty>", "<sample:8>", "false"}, false, 1, new String[][]{{"org.mockito.internal.MockitoCore", "validateMockitoUsage", ""}}, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("org.mockito.exceptions.base.MockitoException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput037() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.mockito.Mockito", "org.mockito.Mockito", "charThat", new String[]{"org.hamcrest.Matcher"}, new String[]{"<sample:3>"}, true, 0, null, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Character", actual.getClass().getName());
  assertEquals("\000", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput038() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.mockito.Mockito", "org.mockito.Mockito", "charThat", new String[]{"org.hamcrest.Matcher"}, new String[]{"<sample:3>"}, true, 0, null, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Character", actual.getClass().getName());
  assertEquals("\000", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput039() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.mockito.Mockito", "org.mockito.Mockito", "verifyZeroInteractions", new String[]{"java.lang.Object[]"}, new String[]{"<sample:0>"}, true, 0, null, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("org.mockito.exceptions.misusing.NotAMockException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput040() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.mockito.Mockito", "org.mockito.Mockito", "verifyZeroInteractions", new String[]{"java.lang.Object[]"}, new String[]{"<empty>"}, true, 0, null, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("org.mockito.exceptions.base.MockitoException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput041() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.mockito.Mockito", "org.mockito.Mockito", "verifyZeroInteractions", new String[]{"java.lang.Object[]"}, new String[]{"<empty>"}, true, 0, null, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("org.mockito.exceptions.base.MockitoException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput042() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.mockito.Mockito", "org.mockito.Mockito", "verifyZeroInteractions", new String[]{"java.lang.Object[]"}, new String[]{"<sample:2>"}, true, 0, null, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("org.mockito.exceptions.misusing.NotAMockException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput043() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.mockito.internal.MockitoCore", "org.mockito.internal.MockitoCore", "mock", new String[]{"java.lang.Class", "org.mockito.MockSettings", "boolean"}, new String[]{"<empty>", "<sample:3>", "true"}, false, 6, new String[][]{{"org.mockito.internal.MockitoCore", "mock", "java.lang.Class,org.mockito.MockSettings,boolean", "<null>", "<sample:7>", "true"}, {"org.mockito.internal.MockitoCore", "when", "java.lang.Object", "<sample:0>"}, {"org.mockito.internal.MockitoCore", "reset", "java.lang.Object[]", "<sample:1>"}}, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.ClassCastException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput044() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.mockito.Mockito", "org.mockito.Mockito", "verify", new String[]{"java.lang.Object"}, new String[]{"<s:key>"}, true, 0, null, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("org.mockito.exceptions.misusing.NotAMockException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput045() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.mockito.Mockito", "org.mockito.Mockito", "eq", new String[]{"char"}, new String[]{"6"}, true, 0, null, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Character", actual.getClass().getName());
  assertEquals("\000", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput046() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.mockito.Mockito", "org.mockito.Mockito", "mock", new String[]{"java.lang.Class", "org.mockito.stubbing.Answer"}, new String[]{"<empty>", "<sample:5>"}, true, 0, null, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("org.mockito.exceptions.base.MockitoException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput047() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.mockito.Mockito", "org.mockito.Mockito", "mock", new String[]{"java.lang.Class", "java.lang.String"}, new String[]{"<null>", "gttp://exam\u00e9ple.com/a?b=c1E-5"}, true, 0, null, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput048() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.mockito.Mockito", "org.mockito.Mockito", "mock", new String[]{"java.lang.Class", "java.lang.String"}, new String[]{"<sample:1>", "gttpp://exam\u00e9ple.com/a?b=c1E-5\n"}, true, 0, null, 1), new String[][]{{"setCallback", "int,org.mockito.cglib.proxy.Callback", "2"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.ClassCastException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput049() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.mockito.Mockito", "org.mockito.Mockito", "mock", new String[]{"java.lang.Class", "java.lang.String"}, new String[]{"<sample:4>", "gttpp://exam\u00e9ple.com/a?b=c1E-5\n"}, true, 0, null, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("org.mockito.exceptions.base.MockitoException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput050() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.mockito.Mockito", "org.mockito.Mockito", "verify", new String[]{"java.lang.Object"}, new String[]{"<s:key>"}, true, 0, null, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("org.mockito.exceptions.misusing.NotAMockException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput051() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.mockito.Mockito", "org.mockito.Mockito", "mock", new String[]{"java.lang.Class"}, new String[]{"<sample:3>"}, true, 0, null, 1), new String[][]{{"newInstance", "org.mockito.cglib.proxy.Callback[]", "3"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.ArrayIndexOutOfBoundsException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput052() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.mockito.Mockito", "org.mockito.Mockito", "mock", new String[]{"java.lang.Class"}, new String[]{"<sample:2>"}, true, 0, null, 1), new String[][]{{"newInstance", "org.mockito.cglib.proxy.Callback[]", "1"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.ClassCastException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput053() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.mockito.Mockito", "org.mockito.Mockito", "mock", new String[]{"java.lang.Class"}, new String[]{"<empty>"}, true, 0, null, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("org.mockito.exceptions.base.MockitoException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput054() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.mockito.Mockito", "org.mockito.Mockito", "mock", new String[]{"java.lang.Class"}, new String[]{"<null>"}, true, 0, null, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput055() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.mockito.internal.MockitoCore", "org.mockito.internal.MockitoCore", "stubVoid", new String[]{"java.lang.Object"}, new String[]{"<sample:1>"}, false, 0, new String[][]{{"org.mockito.internal.MockitoCore", "verify", "java.lang.Object,org.mockito.internal.verification.api.VerificationMode", "<s:key>", "<sample:0>"}, {"org.mockito.internal.MockitoCore", "reset", "java.lang.Object[]", "<sample:0>"}}, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("org.mockito.exceptions.misusing.NotAMockException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput056() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.mockito.Mockito", "org.mockito.Mockito", "anyCollection", new String[]{}, new String[]{}, true, 0, null, 1), new String[][]{{"set", "int,java.lang.Object", "4"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IndexOutOfBoundsException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput057() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.mockito.Mockito", "org.mockito.Mockito", "atLeast", new String[]{"int"}, new String[]{"2147475485"}, true, 0, null, 2), new String[][]{{"verifyInOrder", "org.mockito.internal.verification.api.VerificationData", "4"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.ClassCastException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput058() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.mockito.Mockito", "org.mockito.Mockito", "atLeast", new String[]{"int"}, new String[]{"-2147483647"}, true, 0, null, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("org.mockito.exceptions.base.MockitoException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput059() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.mockito.internal.MockitoCore", "org.mockito.internal.MockitoCore", "when", new String[]{"java.lang.Object"}, new String[]{"<b:true>"}, false, 1, new String[][]{{"org.mockito.internal.MockitoCore", "stub", ""}}, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("org.mockito.exceptions.misusing.MissingMethodInvocationException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput060() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.mockito.Mockito", "org.mockito.Mockito", "matches", new String[]{"java.lang.String"}, new String[]{"2147473"}, true, 0, null, 1);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput061() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.mockito.Mockito", "org.mockito.Mockito", "anyCollection", new String[]{}, new String[]{}, true, 0, null, 3);
  assertNotNull(actual);
  assertEquals("java.util.LinkedList", actual.getClass().getName());
  assertEquals("[]", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput062() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.mockito.internal.MockitoCore", "org.mockito.internal.MockitoCore", "stub", new String[]{"java.lang.Object"}, new String[]{"<null>"}, false, 0, null, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("org.mockito.exceptions.misusing.MissingMethodInvocationException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput063() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.mockito.internal.MockitoCore", "org.mockito.internal.MockitoCore", "validateMockitoUsage", new String[]{}, new String[]{}, false, 6, new String[][]{{"org.mockito.internal.MockitoCore", "stub", "java.lang.Object", "<s:>"}, {"org.mockito.internal.MockitoCore", "stub", "java.lang.Object", "<s:>"}}, 2);
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput064() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.mockito.Mockito", "org.mockito.Mockito", "booleanThat", new String[]{"org.hamcrest.Matcher"}, new String[]{"<sample:6>"}, true, 0, null, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput065() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.mockito.Mockito", "org.mockito.Mockito", "booleanThat", new String[]{"org.hamcrest.Matcher"}, new String[]{"<sample:3>"}, true, 0, null, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput066() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.mockito.Mockito", "org.mockito.Mockito", "anyListOf", new String[]{"java.lang.Class"}, new String[]{"<sample:1>"}, true, 0, null, 1);
  assertNotNull(actual);
  assertEquals("java.util.LinkedList", actual.getClass().getName());
  assertEquals("[]", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput067() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.mockito.internal.MockitoCore", "org.mockito.internal.MockitoCore", "validateMockitoUsage", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.mockito.internal.MockitoCore", "reset", "java.lang.Object[]", "<sample:2>"}}, 3);
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput068() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.mockito.Mockito", "org.mockito.Mockito", "eq", new String[]{"double"}, new String[]{"-1.7976931348623155E308"}, true, 0, null, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("0.0", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput069() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.mockito.Mockito", "org.mockito.Mockito", "times", new String[]{"int"}, new String[]{"-2147483648"}, true, 0, null, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("org.mockito.exceptions.base.MockitoException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput070() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.mockito.Mockito", "org.mockito.Mockito", "times", new String[]{"int"}, new String[]{"0"}, true, 0, null, 2), new String[][]{{"verifyInOrder", "org.mockito.internal.verification.api.VerificationData", "5"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.ClassCastException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput071() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.mockito.Mockito", "org.mockito.Mockito", "times", new String[]{"int"}, new String[]{"-2147483648"}, true, 0, null, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("org.mockito.exceptions.base.MockitoException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput072() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.mockito.Mockito", "org.mockito.Mockito", "times", new String[]{"int"}, new String[]{"2147418112"}, true, 0, null, 3);
  assertNotNull(actual);
  assertEquals("org.mockito.internal.verification.Times", actual.getClass().getName());
  assertEquals("Wanted invocations count: 2147418112", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput073() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.mockito.Mockito", "org.mockito.Mockito", "times", new String[]{"int"}, new String[]{"1"}, true, 0, null, 3), new String[][]{{"verifyInOrder", "org.mockito.internal.verification.api.VerificationData", "3"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.ClassCastException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput074() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.mockito.Mockito", "org.mockito.Mockito", "byteThat", new String[]{"org.hamcrest.Matcher"}, new String[]{"<sample:6>"}, true, 0, null, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Byte", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput075() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.mockito.internal.MockitoCore", "org.mockito.internal.MockitoCore", "when", new String[]{"java.lang.Object"}, new String[]{"<s:1fz>"}, false, 0, new String[][]{{"org.mockito.internal.MockitoCore", "stub", "java.lang.Object", "<s:a>"}, {"org.mockito.internal.MockitoCore", "stubVoid", "java.lang.Object", "<i:-2>"}}, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("org.mockito.exceptions.misusing.MissingMethodInvocationException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput076() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.mockito.Mockito", "org.mockito.Mockito", "inOrder", new String[]{"java.lang.Object[]"}, new String[]{"<sample:1>"}, true, 0, null, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("org.mockito.exceptions.misusing.NotAMockException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput077() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.mockito.Mockito", "org.mockito.Mockito", "inOrder", new String[]{"java.lang.Object[]"}, new String[]{"<null>"}, true, 0, null, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("org.mockito.exceptions.base.MockitoException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput078() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.mockito.internal.MockitoCore", "org.mockito.internal.MockitoCore", "reset", new String[]{"java.lang.Object[]"}, new String[]{"<sample:1>"}, false, 0, null, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("org.mockito.exceptions.misusing.NotAMockException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput079() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.mockito.Mockito", "org.mockito.Mockito", "debug", new String[]{}, new String[]{}, true, 0, null, 2);
  assertNotNull(actual);
  assertEquals("org.mockito.internal.debugging.MockitoDebuggerImpl", actual.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput080() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.mockito.Mockito", "org.mockito.Mockito", "intThat", new String[]{"org.hamcrest.Matcher"}, new String[]{"<sample:4>"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput081() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.mockito.internal.MockitoCore", "org.mockito.internal.MockitoCore", "mock", new String[]{"java.lang.Class", "org.mockito.MockSettings", "boolean"}, new String[]{"<sample:0>", "<sample:1>", "false"}, false); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("org.mockito.exceptions.misusing.InvalidUseOfMatchersException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput082() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.mockito.Mockito", "org.mockito.Mockito", "notNull", new String[]{}, new String[]{}, true);
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput083() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.mockito.internal.MockitoCore", "org.mockito.internal.MockitoCore", "verifyNoMoreInteractions", new String[]{"java.lang.Object[]"}, new String[]{"<null>"}, false, 1, new String[][]{{"org.mockito.internal.MockitoCore", "mock", "java.lang.Class,org.mockito.MockSettings,boolean", "<sample:2>", "<sample:3>", "false"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("org.mockito.exceptions.base.MockitoException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput084() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.mockito.internal.MockitoCore", "org.mockito.internal.MockitoCore", "verifyNoMoreInteractions", new String[]{"java.lang.Object[]"}, new String[]{"<null>"}, false, 1, new String[][]{{"org.mockito.internal.MockitoCore", "mock", "java.lang.Class,org.mockito.MockSettings,boolean", "<sample:2>", "<sample:4>", "false"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("org.mockito.exceptions.base.MockitoException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput085() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.mockito.internal.MockitoCore", "org.mockito.internal.MockitoCore", "stub", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.mockito.internal.MockitoCore", "reset", "java.lang.Object[]", "<sample:1>"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("org.mockito.exceptions.misusing.MissingMethodInvocationException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput086() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.mockito.internal.MockitoCore", "org.mockito.internal.MockitoCore", "stub", new String[]{}, new String[]{}, false, 6, new String[][]{{"org.mockito.internal.MockitoCore", "reset", "java.lang.Object[]", "<empty>"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("org.mockito.exceptions.misusing.MissingMethodInvocationException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput087() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.mockito.Mockito", "org.mockito.Mockito", "stub", new String[]{"java.lang.Object"}, new String[]{"<s:a>"}, true); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("org.mockito.exceptions.misusing.MissingMethodInvocationException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput088() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.mockito.Mockito", "org.mockito.Mockito", "mock", new String[]{"java.lang.Class"}, new String[]{"<sample:0>"}, true); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("org.mockito.exceptions.base.MockitoException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput089() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.mockito.Mockito", "org.mockito.Mockito", "eq", new String[]{"long"}, new String[]{"1"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.Long", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput090() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.mockito.Mockito", "org.mockito.Mockito", "mock", new String[]{"java.lang.Class", "org.mockito.stubbing.Answer"}, new String[]{"<null>", "<sample:7>"}, true); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput091() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.mockito.Mockito", "org.mockito.Mockito", "verifyZeroInteractions", new String[]{"java.lang.Object[]"}, new String[]{"<null>"}, true); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("org.mockito.exceptions.base.MockitoException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput092() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.mockito.Mockito", "org.mockito.Mockito", "eq", new String[]{"java.lang.Object"}, new String[]{"<b:true>"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput093() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.mockito.Mockito", "org.mockito.Mockito", "eq", new String[]{"java.lang.Object"}, new String[]{"<d:1.5>"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("0.0", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput094() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.mockito.Mockito", "org.mockito.Mockito", "eq", new String[]{"java.lang.Object"}, new String[]{"<null>"}, true); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput095() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.mockito.Mockito", "org.mockito.Mockito", "eq", new String[]{"java.lang.Object"}, new String[]{"<s:key>"}, true);
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput096() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.mockito.Mockito", "org.mockito.Mockito", "eq", new String[]{"java.lang.Object"}, new String[]{"<i:2>"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput097() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.mockito.Mockito", "org.mockito.Mockito", "isA", new String[]{"java.lang.Class"}, new String[]{"<null>"}, true);
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput098() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.mockito.Mockito", "org.mockito.Mockito", "isA", new String[]{"java.lang.Class"}, new String[]{"<sample:4>"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput099() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.mockito.Mockito", "org.mockito.Mockito", "eq", new String[]{"boolean"}, new String[]{"true"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput100() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.mockito.Mockito", "org.mockito.Mockito", "validateMockitoUsage", new String[]{}, new String[]{}, true); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("org.mockito.exceptions.misusing.UnfinishedStubbingException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput101() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.mockito.Mockito", "org.mockito.Mockito", "isNull", new String[]{}, new String[]{}, true);
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput102() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.mockito.Mockito", "org.mockito.Mockito", "longThat", new String[]{"org.hamcrest.Matcher"}, new String[]{"<sample:6>"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.Long", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput103() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.mockito.Mockito", "org.mockito.Mockito", "eq", new String[]{"char"}, new String[]{"a"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.Character", actual.getClass().getName());
  assertEquals("\000", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput104() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.mockito.Mockito", "org.mockito.Mockito", "any", new String[]{"java.lang.Class"}, new String[]{"<sample:1>"}, true);
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput105() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.mockito.Mockito", "org.mockito.Mockito", "anyMap", new String[]{}, new String[]{}, true);
  assertNotNull(actual);
  assertEquals("java.util.HashMap", actual.getClass().getName());
  assertEquals("{}", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput106() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.mockito.Mockito", "org.mockito.Mockito", "reset", new String[]{"java.lang.Object[]"}, new String[]{"<null>"}, true); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("org.mockito.exceptions.misusing.UnfinishedStubbingException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput107() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.mockito.Mockito", "org.mockito.Mockito", "eq", new String[]{"byte"}, new String[]{"0"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.Byte", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput108() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.mockito.Mockito", "org.mockito.Mockito", "reset", new String[]{"java.lang.Object[]"}, new String[]{"<sample:1>"}, true); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("org.mockito.exceptions.misusing.NotAMockException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput109() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.mockito.internal.MockitoCore", "org.mockito.internal.MockitoCore", "mock", new String[]{"java.lang.Class", "org.mockito.MockSettings", "boolean"}, new String[]{"<sample:0>", "<sample:1>", "true"}, false); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.ClassCastException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput110() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.mockito.Mockito", "org.mockito.Mockito", "atLeast", new String[]{"int"}, new String[]{"-1"}, true); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("org.mockito.exceptions.base.MockitoException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput111() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.mockito.internal.MockitoCore", "org.mockito.internal.MockitoCore", "inOrder", new String[]{"java.lang.Object[]"}, new String[]{"<sample:2>"}, false); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("org.mockito.exceptions.misusing.NotAMockException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput112() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.mockito.Mockito", "org.mockito.Mockito", "anyListOf", new String[]{"java.lang.Class"}, new String[]{"<sample:0>"}, true);
  assertNotNull(actual);
  assertEquals("java.util.LinkedList", actual.getClass().getName());
  assertEquals("[]", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput113() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.mockito.Mockito", "org.mockito.Mockito", "anyListOf", new String[]{"java.lang.Class"}, new String[]{"<sample:0>"}, true), new String[][]{{"offerLast", "java.lang.Object", "0"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput114() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.mockito.Mockito", "org.mockito.Mockito", "verifyNoMoreInteractions", new String[]{"java.lang.Object[]"}, new String[]{"<empty>"}, true); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("org.mockito.exceptions.base.MockitoException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput115() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.mockito.Mockito", "org.mockito.Mockito", "verifyNoMoreInteractions", new String[]{"java.lang.Object[]"}, new String[]{"<sample:0>"}, true); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("org.mockito.exceptions.misusing.InvalidUseOfMatchersException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput116() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.mockito.Mockito", "org.mockito.Mockito", "anyVararg", new String[]{}, new String[]{}, true);
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput117() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.mockito.internal.MockitoCore", "org.mockito.internal.MockitoCore", "mock", new String[]{"java.lang.Class", "org.mockito.MockSettings", "boolean"}, new String[]{"<empty>", "<sample:6>", "true"}, false, 1, new String[][]{{"org.mockito.internal.MockitoCore", "validateMockitoUsage", ""}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("org.mockito.exceptions.base.MockitoException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput118() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.mockito.internal.MockitoCore", "org.mockito.internal.MockitoCore", "mock", new String[]{"java.lang.Class", "org.mockito.MockSettings", "boolean"}, new String[]{"<empty>", "<sample:6>", "false"}, false, 1, new String[][]{{"org.mockito.internal.MockitoCore", "validateMockitoUsage", ""}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("org.mockito.exceptions.base.MockitoException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput119() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.mockito.Mockito", "org.mockito.Mockito", "anyBoolean", new String[]{}, new String[]{}, true);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput120() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.mockito.Mockito", "org.mockito.Mockito", "anyLong", new String[]{}, new String[]{}, true);
  assertNotNull(actual);
  assertEquals("java.lang.Long", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput121() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.mockito.internal.MockitoCore", "org.mockito.internal.MockitoCore", "reset", new String[]{"java.lang.Object[]"}, new String[]{"<sample:0>"}, false, 0, new String[][]{{"org.mockito.internal.MockitoCore", "doAnswer", "org.mockito.stubbing.Answer", "<sample:6>"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("org.mockito.exceptions.misusing.UnfinishedStubbingException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput122() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.mockito.Mockito", "org.mockito.Mockito", "refEq", new String[]{"java.lang.Object", "java.lang.String[]"}, new String[]{"<i:2>", "<empty>"}, true);
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput123() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.mockito.Mockito", "org.mockito.Mockito", "charThat", new String[]{"org.hamcrest.Matcher"}, new String[]{"<sample:1>"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.Character", actual.getClass().getName());
  assertEquals("\000", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput124() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.mockito.Mockito", "org.mockito.Mockito", "isNotNull", new String[]{}, new String[]{}, true);
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput125() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.mockito.Mockito", "org.mockito.Mockito", "anyObject", new String[]{}, new String[]{}, true);
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput126() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.mockito.Mockito", "org.mockito.Mockito", "mock", new String[]{"java.lang.Class", "org.mockito.ReturnValues"}, new String[]{"<sample:3>", "<sample:4>"}, true), new String[][]{{"getCallback", "int", "7"}});
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput127() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.mockito.Mockito", "org.mockito.Mockito", "mock", new String[]{"java.lang.Class", "org.mockito.ReturnValues"}, new String[]{"<sample:6>", "<sample:4>"}, true), new String[][]{{"get", "int", "7"}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("key", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput128() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.mockito.Mockito", "org.mockito.Mockito", "mock", new String[]{"java.lang.Class", "org.mockito.ReturnValues"}, new String[]{"<empty>", "<sample:3>"}, true); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("org.mockito.exceptions.base.MockitoException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput129() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.mockito.Mockito", "org.mockito.Mockito", "argThat", new String[]{"org.hamcrest.Matcher"}, new String[]{"<sample:4>"}, true);
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput130() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.mockito.internal.MockitoCore", "org.mockito.internal.MockitoCore", "mock", new String[]{"java.lang.Class", "org.mockito.MockSettings", "boolean"}, new String[]{"<null>", "<sample:0>", "true"}, false, 0, new String[][]{{"org.mockito.internal.MockitoCore", "reset", "java.lang.Object[]", "<null>"}, {"org.mockito.internal.MockitoCore", "verify", "java.lang.Object,org.mockito.internal.verification.api.VerificationMode", "<s:a>", "<sample:3>"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.ClassCastException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput131() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.mockito.Mockito", "org.mockito.Mockito", "verify", new String[]{"java.lang.Object"}, new String[]{"<s:>"}, true); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("org.mockito.exceptions.misusing.NotAMockException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput132() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.mockito.Mockito", "org.mockito.Mockito", "mock", new String[]{"java.lang.Class", "org.mockito.stubbing.Answer"}, new String[]{"<empty>", "<sample:7>"}, true); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("org.mockito.exceptions.base.MockitoException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput133() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.mockito.Mockito", "org.mockito.Mockito", "mock", new String[]{"java.lang.Class", "java.lang.String"}, new String[]{"<sample:2>", "http://example.com/a?b=c"}, true), new String[][]{{"setCallback", "int,org.mockito.cglib.proxy.Callback", "2"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.ClassCastException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput134() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.mockito.Mockito", "org.mockito.Mockito", "mock", new String[]{"java.lang.Class", "java.lang.String"}, new String[]{"<sample:4>", "http://exam\u00e9ple.com/a?b=c1E-5"}, true); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("org.mockito.exceptions.base.MockitoException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput135() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.mockito.Mockito", "org.mockito.Mockito", "mock", new String[]{"java.lang.Class", "java.lang.String"}, new String[]{"<null>", "http://exam\u00e9ple.com/a?b=c1E-5"}, true); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput136() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.mockito.Mockito", "org.mockito.Mockito", "eq", new String[]{"double"}, new String[]{"Infinity"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("0.0", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput137() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.mockito.internal.MockitoCore", "org.mockito.internal.MockitoCore", "inOrder", new String[]{"java.lang.Object[]"}, new String[]{"<null>"}, false, 7, new String[][]{{"org.mockito.internal.MockitoCore", "verify", "java.lang.Object,org.mockito.internal.verification.api.VerificationMode", "<i:-1>", "<sample:2>"}, {"org.mockito.internal.MockitoCore", "stub", ""}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("org.mockito.exceptions.base.MockitoException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput138() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.mockito.Mockito", "org.mockito.Mockito", "startsWith", new String[]{"java.lang.String"}, new String[]{".5"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput139() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.mockito.Mockito", "org.mockito.Mockito", "withSettings", new String[]{}, new String[]{}, true);
  assertNotNull(actual);
  assertEquals("org.mockito.internal.creation.MockSettingsImpl", actual.getClass().getName());
  assertEquals("{getExtraInterfaces=null, isSerializable=false}", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput140() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.mockito.Mockito", "org.mockito.Mockito", "anyFloat", new String[]{}, new String[]{}, true);
  assertNotNull(actual);
  assertEquals("java.lang.Float", actual.getClass().getName());
  assertEquals("0.0", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput141() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.mockito.Mockito", "org.mockito.Mockito", "spy", new String[]{"java.lang.Object"}, new String[]{"<null>"}, true); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput142() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.mockito.Mockito", "org.mockito.Mockito", "anyInt", new String[]{}, new String[]{}, true);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput143() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.mockito.Mockito", "org.mockito.Mockito", "mock", new String[]{"java.lang.Class"}, new String[]{"<sample:1>"}, true), new String[][]{{"newInstance", "java.lang.Class[],java.lang.Object[],org.mockito.cglib.proxy.Callback[]", "5"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput144() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.mockito.Mockito", "org.mockito.Mockito", "mock", new String[]{"java.lang.Class"}, new String[]{"<sample:1>"}, true), new String[][]{{"setCallback", "int,org.mockito.cglib.proxy.Callback", "2"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.ClassCastException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput145() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.mockito.Mockito", "org.mockito.Mockito", "anyCollection", new String[]{}, new String[]{}, true);
  assertNotNull(actual);
  assertEquals("java.util.LinkedList", actual.getClass().getName());
  assertEquals("[]", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput146() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.mockito.internal.MockitoCore", "org.mockito.internal.MockitoCore", "stubVoid", new String[]{"java.lang.Object"}, new String[]{"<i:2>"}, false, 0, new String[][]{{"org.mockito.internal.MockitoCore", "inOrder", "java.lang.Object[]", "<empty>"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("org.mockito.exceptions.misusing.NotAMockException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput147() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.mockito.Mockito", "org.mockito.Mockito", "shortThat", new String[]{"org.hamcrest.Matcher"}, new String[]{"<null>"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.Short", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput148() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.mockito.Mockito", "org.mockito.Mockito", "atLeast", new String[]{"int"}, new String[]{"2147483647"}, true), new String[][]{{"verifyInOrder", "org.mockito.internal.verification.api.VerificationData", "4"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.ClassCastException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput149() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.mockito.Mockito", "org.mockito.Mockito", "doubleThat", new String[]{"org.hamcrest.Matcher"}, new String[]{"<sample:6>"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("0.0", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput150() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.mockito.Mockito", "org.mockito.Mockito", "mock", new String[]{"java.lang.Class", "org.mockito.ReturnValues"}, new String[]{"<sample:0>", "<sample:1>"}, true); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("org.mockito.exceptions.misusing.InvalidUseOfMatchersException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput151() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.mockito.Mockito", "org.mockito.Mockito", "same", new String[]{"java.lang.Object"}, new String[]{"<s:a>"}, true);
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput152() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.mockito.Mockito", "org.mockito.Mockito", "same", new String[]{"java.lang.Object"}, new String[]{"<null>"}, true); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput153() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.mockito.Mockito", "org.mockito.Mockito", "same", new String[]{"java.lang.Object"}, new String[]{"<sample:1>"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput154() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.mockito.Mockito", "org.mockito.Mockito", "debug", new String[]{}, new String[]{}, true), new String[][]{{"printInvocations", "java.lang.Object[]", "0"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("org.mockito.exceptions.misusing.NotAMockException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput155() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.mockito.Mockito", "org.mockito.Mockito", "doNothing", new String[]{}, new String[]{}, true); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("org.mockito.exceptions.misusing.InvalidUseOfMatchersException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput156() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.mockito.Mockito", "org.mockito.Mockito", "contains", new String[]{"java.lang.String"}, new String[]{"\u00e9"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput157() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.mockito.Mockito", "org.mockito.Mockito", "matches", new String[]{"java.lang.String"}, new String[]{"2147483648"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput158() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.mockito.Mockito", "org.mockito.Mockito", "anyShort", new String[]{}, new String[]{}, true);
  assertNotNull(actual);
  assertEquals("java.lang.Short", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput159() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.mockito.Mockito", "org.mockito.Mockito", "inOrder", new String[]{"java.lang.Object[]"}, new String[]{"<empty>"}, true); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("org.mockito.exceptions.base.MockitoException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput160() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.mockito.Mockito", "org.mockito.Mockito", "inOrder", new String[]{"java.lang.Object[]"}, new String[]{"<sample:2>"}, true); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("org.mockito.exceptions.misusing.NotAMockException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput161() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.mockito.Mockito", "org.mockito.Mockito", "stub", new String[]{"java.lang.Object"}, new String[]{"<null>"}, true); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("org.mockito.exceptions.misusing.InvalidUseOfMatchersException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput162() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.mockito.Mockito", "org.mockito.Mockito", "endsWith", new String[]{"java.lang.String"}, new String[]{" "}, true);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput163() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.mockito.Mockito", "org.mockito.Mockito", "times", new String[]{"int"}, new String[]{"2147483647"}, true);
  assertNotNull(actual);
  assertEquals("org.mockito.internal.verification.Times", actual.getClass().getName());
  assertEquals("Wanted invocations count: 2147483647", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput164() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.mockito.Mockito", "org.mockito.Mockito", "times", new String[]{"int"}, new String[]{"-2147483646"}, true); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("org.mockito.exceptions.base.MockitoException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput165() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.mockito.Mockito", "org.mockito.Mockito", "anyList", new String[]{}, new String[]{}, true);
  assertNotNull(actual);
  assertEquals("java.util.LinkedList", actual.getClass().getName());
  assertEquals("[]", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput166() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.mockito.internal.MockitoCore", "org.mockito.internal.MockitoCore", "verify", new String[]{"java.lang.Object", "org.mockito.internal.verification.api.VerificationMode"}, new String[]{"<d:1.5>", "<sample:1>"}, false); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("org.mockito.exceptions.misusing.NotAMockException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput167() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.mockito.Mockito", "org.mockito.Mockito", "booleanThat", new String[]{"org.hamcrest.Matcher"}, new String[]{"<sample:6>"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput168() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.mockito.Mockito", "org.mockito.Mockito", "anyChar", new String[]{}, new String[]{}, true);
  assertNotNull(actual);
  assertEquals("java.lang.Character", actual.getClass().getName());
  assertEquals("\000", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput169() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.mockito.Mockito", "org.mockito.Mockito", "anySetOf", new String[]{"java.lang.Class"}, new String[]{"<empty>"}, true);
  assertNotNull(actual);
  assertEquals("java.util.HashSet", actual.getClass().getName());
  assertEquals("[]", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput170() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.mockito.Mockito", "org.mockito.Mockito", "doAnswer", new String[]{"org.mockito.stubbing.Answer"}, new String[]{"<sample:6>"}, true); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("org.mockito.exceptions.misusing.UnfinishedStubbingException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput171() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.mockito.Mockito", "org.mockito.Mockito", "doAnswer", new String[]{"org.mockito.stubbing.Answer"}, new String[]{"<sample:3>"}, true), new String[][]{{"when", "java.lang.Object", "5"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("org.mockito.exceptions.misusing.NotAMockException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput172() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.mockito.Mockito", "org.mockito.Mockito", "atMost", new String[]{"int"}, new String[]{"-2147483648"}, true); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("org.mockito.exceptions.base.MockitoException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput173() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.mockito.internal.MockitoCore", "org.mockito.internal.MockitoCore", "verifyNoMoreInteractions", new String[]{"java.lang.Object[]"}, new String[]{"<sample:2>"}, false, 0, new String[][]{{"org.mockito.internal.MockitoCore", "reset", "java.lang.Object[]", "<sample:1>"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("org.mockito.exceptions.misusing.NotAMockException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput174() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.mockito.Mockito", "org.mockito.Mockito", "atLeast", new String[]{"int"}, new String[]{"1"}, true);
  assertNotNull(actual);
  assertEquals("org.mockito.internal.verification.AtLeast", actual.getClass().getName());
  assertEquals("Wanted invocations count: at least 1", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput175() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.mockito.Mockito", "org.mockito.Mockito", "eq", new String[]{"short"}, new String[]{"-1"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.Short", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput176() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.mockito.internal.MockitoCore", "org.mockito.internal.MockitoCore", "when", new String[]{"java.lang.Object"}, new String[]{"<i:1>"}, false); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("org.mockito.exceptions.misusing.InvalidUseOfMatchersException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput177() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.mockito.Mockito", "org.mockito.Mockito", "times", new String[]{"int"}, new String[]{"0"}, true), new String[][]{{"verifyInOrder", "org.mockito.internal.verification.api.VerificationData", "5"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.ClassCastException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput178() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.mockito.Mockito", "org.mockito.Mockito", "stubVoid", new String[]{"java.lang.Object"}, new String[]{"<i:0>"}, true); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("org.mockito.exceptions.misusing.NotAMockException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput179() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.mockito.Mockito", "org.mockito.Mockito", "same", new String[]{"java.lang.Object"}, new String[]{"<b:true>"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput180() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.mockito.Mockito", "org.mockito.Mockito", "anySet", new String[]{}, new String[]{}, true);
  assertNotNull(actual);
  assertEquals("java.util.HashSet", actual.getClass().getName());
  assertEquals("[]", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput181() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.mockito.Mockito", "org.mockito.Mockito", "byteThat", new String[]{"org.hamcrest.Matcher"}, new String[]{"<sample:4>"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.Byte", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput182() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.mockito.Mockito", "org.mockito.Mockito", "anyCollectionOf", new String[]{"java.lang.Class"}, new String[]{"<empty>"}, true);
  assertNotNull(actual);
  assertEquals("java.util.LinkedList", actual.getClass().getName());
  assertEquals("[]", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput183() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.mockito.Mockito", "org.mockito.Mockito", "anyDouble", new String[]{}, new String[]{}, true);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("0.0", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput184() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.mockito.Mockito", "org.mockito.Mockito", "anyCollectionOf", new String[]{"java.lang.Class"}, new String[]{"<null>"}, true), new String[][]{{"poll", "", "0"}});
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput185() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.mockito.Mockito", "org.mockito.Mockito", "anyCollectionOf", new String[]{"java.lang.Class"}, new String[]{"<null>"}, true), new String[][]{{"poll", "", "0"}, {"removeLast", "", "0"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.util.NoSuchElementException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput186() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.mockito.Mockito", "org.mockito.Mockito", "anyCollectionOf", new String[]{"java.lang.Class"}, new String[]{"<sample:1>"}, true), new String[][]{{"offer", "java.lang.Object", "2"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput187() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.mockito.Mockito", "org.mockito.Mockito", "atMost", new String[]{"int"}, new String[]{"1"}, true), new String[][]{{"verify", "org.mockito.internal.verification.api.VerificationData", "5"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.ClassCastException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput188() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.mockito.Mockito", "org.mockito.Mockito", "floatThat", new String[]{"org.hamcrest.Matcher"}, new String[]{"<sample:0>"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.Float", actual.getClass().getName());
  assertEquals("0.0", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput189() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.mockito.Mockito", "org.mockito.Mockito", "booleanThat", new String[]{"org.hamcrest.Matcher"}, new String[]{"<null>"}, true, 0, null, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput190() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.mockito.Mockito", "org.mockito.Mockito", "endsWith", new String[]{"java.lang.String"}, new String[]{"2020-01-30T25:51:61115"}, true, 0, null, 2);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput191() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.mockito.internal.MockitoCore", "org.mockito.internal.MockitoCore", "inOrder", new String[]{"java.lang.Object[]"}, new String[]{"<sample:1>"}, false, 0, null, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("org.mockito.exceptions.misusing.NotAMockException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput192() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.mockito.internal.MockitoCore", "org.mockito.internal.MockitoCore", "inOrder", new String[]{"java.lang.Object[]"}, new String[]{"<empty>"}, false, 0, new String[][]{{"org.mockito.internal.MockitoCore", "stub", ""}}, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("org.mockito.exceptions.base.MockitoException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput193() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.mockito.Mockito", "org.mockito.Mockito", "anySet", new String[]{}, new String[]{}, true, 0, null, 2);
  assertNotNull(actual);
  assertEquals("java.util.HashSet", actual.getClass().getName());
  assertEquals("[]", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput194() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.mockito.Mockito", "org.mockito.Mockito", "anyCollectionOf", new String[]{"java.lang.Class"}, new String[]{"<sample:0>"}, true, 0, null, 1);
  assertNotNull(actual);
  assertEquals("java.util.LinkedList", actual.getClass().getName());
  assertEquals("[]", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput195() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.mockito.Mockito", "org.mockito.Mockito", "anyCollectionOf", new String[]{"java.lang.Class"}, new String[]{"<sample:2>"}, true), new String[][]{{"contains", "java.lang.Object", "2"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput196() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.mockito.Mockito", "org.mockito.Mockito", "anyDouble", new String[]{}, new String[]{}, true, 0, null, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("0.0", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput197() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.mockito.Mockito", "org.mockito.Mockito", "eq", new String[]{"float"}, new String[]{"3.4028235E38"}, true, 0, null, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Float", actual.getClass().getName());
  assertEquals("0.0", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput198() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.mockito.Mockito", "org.mockito.Mockito", "same", new String[]{"java.lang.Object"}, new String[]{"<s:0\u00e9>"}, true, 0, null, 3);
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput199() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.mockito.Mockito", "org.mockito.Mockito", "same", new String[]{"java.lang.Object"}, new String[]{"<i:0>"}, true, 0, null, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput200() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.mockito.Mockito", "org.mockito.Mockito", "contains", new String[]{"java.lang.String"}, new String[]{"1.1234567"}, true, 0, null, 2);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput201() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.mockito.Mockito", "org.mockito.Mockito", "anyCollection", new String[]{}, new String[]{}, true, 0, null, 2);
  assertNotNull(actual);
  assertEquals("java.util.LinkedList", actual.getClass().getName());
  assertEquals("[]", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput202() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.mockito.Mockito", "org.mockito.Mockito", "any", new String[]{"java.lang.Class"}, new String[]{"<sample:3>"}, true, 0, null, 2);
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput203() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.mockito.Mockito", "org.mockito.Mockito", "any", new String[]{"java.lang.Class"}, new String[]{"<empty>"}, true, 0, null, 1);
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput204() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.mockito.Mockito", "org.mockito.Mockito", "only", new String[]{}, new String[]{}, true), new String[][]{{"verify", "org.mockito.internal.verification.api.VerificationData", "5"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.ClassCastException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput205() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.mockito.Mockito", "org.mockito.Mockito", "anyString", new String[]{}, new String[]{}, true);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput206() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.mockito.Mockito", "org.mockito.Mockito", "doThrow", new String[]{"java.lang.Throwable"}, new String[]{"<empty>"}, true, 0, null, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("org.mockito.exceptions.misusing.UnfinishedStubbingException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput207() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.mockito.Mockito", "org.mockito.Mockito", "doThrow", new String[]{"java.lang.Throwable"}, new String[]{"<sample:0>"}, true, 0, null, 2);
  assertNotNull(actual);
  assertEquals("org.mockito.internal.stubbing.StubberImpl", actual.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput208() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.mockito.Mockito", "org.mockito.Mockito", "mock", new String[]{"java.lang.Class", "org.mockito.stubbing.Answer"}, new String[]{"<sample:3>", "<sample:6>"}, true), new String[][]{{"newInstance", "org.mockito.cglib.proxy.Callback", "6"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalStateException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput209() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.mockito.Mockito", "org.mockito.Mockito", "verify", new String[]{"java.lang.Object", "org.mockito.internal.verification.api.VerificationMode"}, new String[]{"<s:b>", "<sample:6>"}, true); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("org.mockito.exceptions.misusing.NotAMockException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput210() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.mockito.internal.MockitoCore", "org.mockito.internal.MockitoCore", "validateMockitoUsage", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.mockito.internal.MockitoCore", "inOrder", "java.lang.Object[]", "<empty>"}, {"org.mockito.internal.MockitoCore", "doAnswer", "org.mockito.stubbing.Answer", "<sample:4>"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("org.mockito.exceptions.misusing.UnfinishedStubbingException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput211() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.mockito.Mockito", "org.mockito.Mockito", "argThat", new String[]{"org.hamcrest.Matcher"}, new String[]{"<sample:9>"}, true, 0, null, 2);
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput212() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.mockito.Mockito", "org.mockito.Mockito", "startsWith", new String[]{"java.lang.String"}, new String[]{"0x[23456781"}, true, 0, null, 3);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput213() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.mockito.Mockito", "org.mockito.Mockito", "anySetOf", new String[]{"java.lang.Class"}, new String[]{"<sample:0>"}, true), new String[][]{{"add", "java.lang.Object", "1"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput214() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.mockito.internal.MockitoCore", "org.mockito.internal.MockitoCore", "reset", new String[]{"java.lang.Object[]"}, new String[]{"<empty>"}, false);
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput215() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.mockito.internal.MockitoCore", "org.mockito.internal.MockitoCore", "verifyNoMoreInteractions", new String[]{"java.lang.Object[]"}, new String[]{"<empty>"}, false, 0, null, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("org.mockito.exceptions.base.MockitoException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput216() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.mockito.internal.MockitoCore", "org.mockito.internal.MockitoCore", "verifyNoMoreInteractions", new String[]{"java.lang.Object[]"}, new String[]{"<sample:1>"}, false, 0, null, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("org.mockito.exceptions.misusing.NotAMockException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput217() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.mockito.internal.MockitoCore", "org.mockito.internal.MockitoCore", "verifyNoMoreInteractions", new String[]{"java.lang.Object[]"}, new String[]{"<null>"}, false, 2, new String[][]{{"org.mockito.internal.MockitoCore", "inOrder", "java.lang.Object[]", "<sample:2>"}, {"org.mockito.internal.MockitoCore", "verifyNoMoreInteractions", "java.lang.Object[]", "<null>"}}, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("org.mockito.exceptions.base.MockitoException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput218() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.mockito.internal.MockitoCore", "org.mockito.internal.MockitoCore", "verifyNoMoreInteractions", new String[]{"java.lang.Object[]"}, new String[]{"<sample:0>"}, false, 12, new String[][]{{"org.mockito.internal.MockitoCore", "verify", "java.lang.Object,org.mockito.internal.verification.api.VerificationMode", "<s:a>", "<sample:6>"}}, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("org.mockito.exceptions.misusing.InvalidUseOfMatchersException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput219() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.mockito.Mockito", "org.mockito.Mockito", "anyMap", new String[]{}, new String[]{}, true), new String[][]{{"entrySet", "", "3"}});
  assertNotNull(actual);
  assertEquals("java.util.HashMap$EntrySet", actual.getClass().getName());
  assertEquals("[]", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput220() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.mockito.internal.MockitoCore", "org.mockito.internal.MockitoCore", "mock", new String[]{"java.lang.Class", "org.mockito.MockSettings", "boolean"}, new String[]{"<sample:6>", "<sample:6>", "false"}, false, 4, new String[][]{{"org.mockito.internal.MockitoCore", "stub", "java.lang.Object", "<sample:0>"}, {"org.mockito.internal.MockitoCore", "verify", "java.lang.Object,org.mockito.internal.verification.api.VerificationMode", "<sample:0>", "<sample:4>"}, {"org.mockito.internal.MockitoCore", "getLastInvocation", ""}}, 2), new String[][]{{"iterator", "", "6"}});
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput221() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.mockito.Mockito", "org.mockito.Mockito", "anyBoolean", new String[]{}, new String[]{}, true, 0, null, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput222() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.mockito.Mockito", "org.mockito.Mockito", "isA", new String[]{"java.lang.Class"}, new String[]{"<null>"}, true, 0, null, 1);
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput223() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.mockito.internal.MockitoCore", "org.mockito.internal.MockitoCore", "stub", new String[]{"java.lang.Object"}, new String[]{"<i:1>"}, false, 0, new String[][]{{"org.mockito.internal.MockitoCore", "getLastInvocation", ""}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("org.mockito.exceptions.misusing.InvalidUseOfMatchersException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput224() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.mockito.Mockito", "org.mockito.Mockito", "contains", new String[]{"java.lang.String"}, new String[]{"anc"}, true, 0, null, 3);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput225() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.mockito.internal.MockitoCore", "org.mockito.internal.MockitoCore", "stubVoid", new String[]{"java.lang.Object"}, new String[]{"<sample:0>"}, false, 2, new String[][]{{"org.mockito.internal.MockitoCore", "validateMockitoUsage", ""}, {"org.mockito.internal.MockitoCore", "verifyNoMoreInteractions", "java.lang.Object[]", "<sample:1>"}}, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("org.mockito.exceptions.misusing.NotAMockException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput226() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.mockito.Mockito", "org.mockito.Mockito", "mock", new String[]{"java.lang.Class", "org.mockito.MockSettings"}, new String[]{"<empty>", "<sample:6>"}, true); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("org.mockito.exceptions.base.MockitoException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput227() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.mockito.Mockito", "org.mockito.Mockito", "mock", new String[]{"java.lang.Class", "org.mockito.MockSettings"}, new String[]{"<empty>", "<sample:6>"}, true, 0, null, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("org.mockito.exceptions.base.MockitoException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput228() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.mockito.Mockito", "org.mockito.Mockito", "mock", new String[]{"java.lang.Class", "org.mockito.MockSettings"}, new String[]{"<empty>", "<sample:7>"}, true, 0, null, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.ClassCastException", thrown.getClass().getName());
 }
}
