package generated.algorithm;

import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;
import static org.junit.Assert.*;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class BinaryParticleSwarmGeneratedTest {
 @Test(timeout = 20000)
 public void generatedInput000() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.mockito.internal.verification.VerificationOverTimeImpl", "org.mockito.internal.verification.VerificationOverTimeImpl", "getPollingPeriod", new String[]{}, new String[]{}, false, 6, new String[][]{});
  assertNotNull(actual);
  assertEquals("java.lang.Long", actual.getClass().getName());
  assertEquals("4", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getDuration=5, getPollingPeriod=4}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput001() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.mockito.internal.verification.VerificationOverTimeImpl", "org.mockito.internal.verification.VerificationOverTimeImpl", "getDelegate", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.mockito.internal.verification.VerificationOverTimeImpl", "getDuration", ""}}, 1);
  assertNotNull(actual);
  assertEquals("receiver state after the call", "{getDuration=0, getPollingPeriod=-1}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput002() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.mockito.internal.verification.VerificationOverTimeImpl", "org.mockito.internal.verification.VerificationOverTimeImpl", "canRecoverFromFailure", new String[]{"org.mockito.verification.VerificationMode"}, new String[]{"<sample:6>"}, false, 0, null, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getDuration=0, getPollingPeriod=-1}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput003() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.mockito.internal.verification.VerificationOverTimeImpl", "org.mockito.internal.verification.VerificationOverTimeImpl", "canRecoverFromFailure", new String[]{"org.mockito.verification.VerificationMode"}, new String[]{"<sample:3>"}, false, 3, new String[][]{});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getDuration=2, getPollingPeriod=9223372036854775807}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput004() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.mockito.internal.verification.VerificationOverTimeImpl", "org.mockito.internal.verification.VerificationOverTimeImpl", "getDuration", new String[]{}, new String[]{}, false, 3, new String[][]{});
  assertNotNull(actual);
  assertEquals("java.lang.Long", actual.getClass().getName());
  assertEquals("2", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getDuration=2, getPollingPeriod=9223372036854775807}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput005() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.mockito.internal.verification.VerificationOverTimeImpl", "org.mockito.internal.verification.VerificationOverTimeImpl", "getPollingPeriod", new String[]{}, new String[]{}, false);
  assertNotNull(actual);
  assertEquals("java.lang.Long", actual.getClass().getName());
  assertEquals("-1", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getDuration=0, getPollingPeriod=-1}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput006() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.mockito.internal.verification.VerificationOverTimeImpl", "org.mockito.internal.verification.VerificationOverTimeImpl", "getDuration", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.mockito.internal.verification.VerificationOverTimeImpl", "getDuration", ""}, {"org.mockito.internal.verification.VerificationOverTimeImpl", "verify", "org.mockito.internal.verification.api.VerificationData", "<sample:8>"}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Long", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getDuration=0, getPollingPeriod=-1}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput007() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.mockito.internal.verification.VerificationOverTimeImpl", "org.mockito.internal.verification.VerificationOverTimeImpl", "getDelegate", new String[]{}, new String[]{}, false);
  assertNotNull(actual);
  assertEquals("receiver state after the call", "{getDuration=0, getPollingPeriod=-1}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput008() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.mockito.internal.verification.VerificationOverTimeImpl", "org.mockito.internal.verification.VerificationOverTimeImpl", "getDelegate", new String[]{}, new String[]{}, false, 1, new String[][]{{"org.mockito.internal.verification.VerificationOverTimeImpl", "canRecoverFromFailure", "org.mockito.verification.VerificationMode", "<sample:6>"}}), new String[][]{{"never", "", "5"}, {"verify", "org.mockito.internal.verification.api.VerificationData", "2"}, {"atLeast", "int", "1"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("org.mockito.exceptions.base.MockitoException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput009() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.mockito.internal.verification.VerificationOverTimeImpl", "org.mockito.internal.verification.VerificationOverTimeImpl", "getDuration", new String[]{}, new String[]{}, false);
  assertNotNull(actual);
  assertEquals("java.lang.Long", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getDuration=0, getPollingPeriod=-1}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput010() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.mockito.internal.verification.VerificationOverTimeImpl", "org.mockito.internal.verification.VerificationOverTimeImpl", "canRecoverFromFailure", new String[]{"org.mockito.verification.VerificationMode"}, new String[]{"<null>"}, false, 0, new String[][]{{"org.mockito.internal.verification.VerificationOverTimeImpl", "verify", "org.mockito.internal.verification.api.VerificationData", "<sample:8>"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getDuration=0, getPollingPeriod=-1}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput011() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.mockito.internal.verification.VerificationOverTimeImpl", "org.mockito.internal.verification.VerificationOverTimeImpl", "getDuration", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.mockito.internal.verification.VerificationOverTimeImpl", "canRecoverFromFailure", "org.mockito.verification.VerificationMode", "<sample:3>"}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Long", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getDuration=0, getPollingPeriod=-1}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput012() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.mockito.internal.verification.VerificationOverTimeImpl", "org.mockito.internal.verification.VerificationOverTimeImpl", "getDelegate", new String[]{}, new String[]{}, false, 7, new String[][]{}), new String[][]{{"never", "", "2"}});
  assertNotNull(actual);
  assertEquals("org.mockito.verification.After", actual.getClass().getName());
  assertEquals("receiver state after the call", "{getDuration=6, getPollingPeriod=5}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput013() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.mockito.internal.verification.VerificationOverTimeImpl", "org.mockito.internal.verification.VerificationOverTimeImpl", "getDuration", new String[]{}, new String[]{}, false, 6, new String[][]{{"org.mockito.internal.verification.VerificationOverTimeImpl", "getDelegate", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.Long", actual.getClass().getName());
  assertEquals("5", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getDuration=5, getPollingPeriod=4}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput014() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.mockito.internal.verification.VerificationOverTimeImpl", "org.mockito.internal.verification.VerificationOverTimeImpl", "canRecoverFromFailure", new String[]{"org.mockito.verification.VerificationMode"}, new String[]{"<sample:2>"}, false, 2, new String[][]{{"org.mockito.internal.verification.VerificationOverTimeImpl", "getPollingPeriod", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getDuration=9223372036854775807, getPollingPeriod=1}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput015() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.mockito.internal.verification.VerificationOverTimeImpl", "org.mockito.internal.verification.VerificationOverTimeImpl", "getDelegate", new String[]{}, new String[]{}, false, 5, new String[][]{{"org.mockito.internal.verification.VerificationOverTimeImpl", "canRecoverFromFailure", "org.mockito.verification.VerificationMode", "<sample:2>"}}, 3), new String[][]{{"only", "", "3"}});
  assertNotNull(actual);
  assertEquals("org.mockito.verification.After", actual.getClass().getName());
  assertEquals("receiver state after the call", "{getDuration=4, getPollingPeriod=3}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput016() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.mockito.internal.verification.VerificationOverTimeImpl", "org.mockito.internal.verification.VerificationOverTimeImpl", "getDelegate", new String[]{}, new String[]{}, false, 5, new String[][]{{"org.mockito.internal.verification.VerificationOverTimeImpl", "verify", "org.mockito.internal.verification.api.VerificationData", "<sample:4>"}});
  assertNotNull(actual);
  assertEquals("org.mockito.verification.After", actual.getClass().getName());
  assertEquals("receiver state after the call", "{getDuration=4, getPollingPeriod=3}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput017() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.mockito.internal.verification.VerificationOverTimeImpl", "org.mockito.internal.verification.VerificationOverTimeImpl", "getDuration", new String[]{}, new String[]{}, false, 1, new String[][]{{"org.mockito.internal.verification.VerificationOverTimeImpl", "canRecoverFromFailure", "org.mockito.verification.VerificationMode", "<sample:12>"}, {"org.mockito.internal.verification.VerificationOverTimeImpl", "getPollingPeriod", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.Long", actual.getClass().getName());
  assertEquals("1", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getDuration=1, getPollingPeriod=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput018() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.mockito.internal.verification.VerificationOverTimeImpl", "org.mockito.internal.verification.VerificationOverTimeImpl", "getPollingPeriod", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.mockito.internal.verification.VerificationOverTimeImpl", "getPollingPeriod", ""}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Long", actual.getClass().getName());
  assertEquals("-1", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getDuration=0, getPollingPeriod=-1}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput019() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.mockito.internal.verification.VerificationOverTimeImpl", "org.mockito.internal.verification.VerificationOverTimeImpl", "getPollingPeriod", new String[]{}, new String[]{}, false, 2, new String[][]{{"org.mockito.internal.verification.VerificationOverTimeImpl", "getDuration", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.Long", actual.getClass().getName());
  assertEquals("1", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getDuration=9223372036854775807, getPollingPeriod=1}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput020() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.mockito.internal.verification.VerificationOverTimeImpl", "org.mockito.internal.verification.VerificationOverTimeImpl", "canRecoverFromFailure", new String[]{"org.mockito.verification.VerificationMode"}, new String[]{"<sample:5>"}, false, 1, new String[][]{{"org.mockito.internal.verification.VerificationOverTimeImpl", "canRecoverFromFailure", "org.mockito.verification.VerificationMode", "<sample:7>"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getDuration=1, getPollingPeriod=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput021() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.mockito.internal.verification.VerificationOverTimeImpl", "org.mockito.internal.verification.VerificationOverTimeImpl", "getDelegate", new String[]{}, new String[]{}, false, 1, new String[][]{{"org.mockito.internal.verification.VerificationOverTimeImpl", "getDuration", ""}, {"org.mockito.internal.verification.VerificationOverTimeImpl", "getDelegate", ""}}, 3), new String[][]{{"verify", "org.mockito.internal.verification.api.VerificationData", "0"}});
  assertNotNull(actual);
  assertEquals("org.mockito.verification.After", actual.getClass().getName());
  assertEquals("receiver state after the call", "{getDuration=1, getPollingPeriod=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput022() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.mockito.internal.verification.VerificationOverTimeImpl", "org.mockito.internal.verification.VerificationOverTimeImpl", "verify", new String[]{"org.mockito.internal.verification.api.VerificationData"}, new String[]{"<sample:10>"}, false, 0, new String[][]{{"org.mockito.internal.verification.VerificationOverTimeImpl", "getPollingPeriod", ""}, {"org.mockito.internal.verification.VerificationOverTimeImpl", "getPollingPeriod", ""}}, 1);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getDuration=0, getPollingPeriod=-1}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput023() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.mockito.internal.verification.VerificationOverTimeImpl", "org.mockito.internal.verification.VerificationOverTimeImpl", "getDelegate", new String[]{}, new String[]{}, false, 1, new String[][]{{"org.mockito.internal.verification.VerificationOverTimeImpl", "getDelegate", ""}}), new String[][]{{"atLeast", "int", "2"}, {"verify", "org.mockito.internal.verification.api.VerificationData", "7"}});
  assertNotNull(actual);
  assertEquals("org.mockito.verification.After", actual.getClass().getName());
  assertEquals("receiver state after the call", "{getDuration=1, getPollingPeriod=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput024() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.mockito.internal.verification.VerificationOverTimeImpl", "org.mockito.internal.verification.VerificationOverTimeImpl", "verify", new String[]{"org.mockito.internal.verification.api.VerificationData"}, new String[]{"<sample:2>"}, false, 0, new String[][]{{"org.mockito.internal.verification.VerificationOverTimeImpl", "getDuration", ""}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getDuration=0, getPollingPeriod=-1}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput025() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.mockito.internal.verification.VerificationOverTimeImpl", "org.mockito.internal.verification.VerificationOverTimeImpl", "getDelegate", new String[]{}, new String[]{}, false, 4, new String[][]{}, 3), new String[][]{{"verify", "org.mockito.internal.verification.api.VerificationData", "3"}});
  assertNotNull(actual);
  assertEquals("receiver state after the call", "{getDuration=3, getPollingPeriod=2}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput026() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.mockito.internal.verification.VerificationOverTimeImpl", "org.mockito.internal.verification.VerificationOverTimeImpl", "verify", new String[]{"org.mockito.internal.verification.api.VerificationData"}, new String[]{"<sample:3>"}, false, 1, new String[][]{{"org.mockito.internal.verification.VerificationOverTimeImpl", "canRecoverFromFailure", "org.mockito.verification.VerificationMode", "<sample:7>"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getDuration=1, getPollingPeriod=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput027() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.mockito.internal.verification.VerificationOverTimeImpl", "org.mockito.internal.verification.VerificationOverTimeImpl", "getDelegate", new String[]{}, new String[]{}, false, 4, new String[][]{{"org.mockito.internal.verification.VerificationOverTimeImpl", "getDelegate", ""}, {"org.mockito.internal.verification.VerificationOverTimeImpl", "getDelegate", ""}}), new String[][]{{"verify", "org.mockito.internal.verification.api.VerificationData", "3"}});
  assertNotNull(actual);
  assertEquals("receiver state after the call", "{getDuration=3, getPollingPeriod=2}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput028() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.mockito.internal.verification.VerificationOverTimeImpl", "org.mockito.internal.verification.VerificationOverTimeImpl", "verify", new String[]{"org.mockito.internal.verification.api.VerificationData"}, new String[]{"<sample:5>"}, false, 6, new String[][]{{"org.mockito.internal.verification.VerificationOverTimeImpl", "getDelegate", ""}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getDuration=5, getPollingPeriod=4}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput029() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.mockito.internal.verification.VerificationOverTimeImpl", "org.mockito.internal.verification.VerificationOverTimeImpl", "getDelegate", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.mockito.internal.verification.VerificationOverTimeImpl", "canRecoverFromFailure", "org.mockito.verification.VerificationMode", "<sample:9>"}}, 3), new String[][]{{"verify", "org.mockito.internal.verification.api.VerificationData", "7"}});
  assertNotNull(actual);
  assertEquals("receiver state after the call", "{getDuration=0, getPollingPeriod=-1}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput030() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.mockito.internal.verification.VerificationOverTimeImpl", "org.mockito.internal.verification.VerificationOverTimeImpl", "verify", new String[]{"org.mockito.internal.verification.api.VerificationData"}, new String[]{"<sample:8>"}, false, 1, new String[][]{}, 1);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getDuration=1, getPollingPeriod=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput031() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.mockito.internal.verification.VerificationOverTimeImpl", "org.mockito.internal.verification.VerificationOverTimeImpl", "getDelegate", new String[]{}, new String[]{}, false, 1, new String[][]{{"org.mockito.internal.verification.VerificationOverTimeImpl", "getDelegate", ""}, {"org.mockito.internal.verification.VerificationOverTimeImpl", "canRecoverFromFailure", "org.mockito.verification.VerificationMode", "<sample:5>"}}, 2);
  assertNotNull(actual);
  assertEquals("org.mockito.verification.After", actual.getClass().getName());
  assertEquals("receiver state after the call", "{getDuration=1, getPollingPeriod=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput032() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.mockito.internal.verification.VerificationOverTimeImpl", "org.mockito.internal.verification.VerificationOverTimeImpl", "verify", new String[]{"org.mockito.internal.verification.api.VerificationData"}, new String[]{"<sample:9>"}, false, 0, null, 3);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getDuration=0, getPollingPeriod=-1}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput033() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.mockito.internal.verification.VerificationOverTimeImpl", "org.mockito.internal.verification.VerificationOverTimeImpl", "getDelegate", new String[]{}, new String[]{}, false, 6, new String[][]{{"org.mockito.internal.verification.VerificationOverTimeImpl", "verify", "org.mockito.internal.verification.api.VerificationData", "<sample:12>"}});
  assertNotNull(actual);
  assertEquals("receiver state after the call", "{getDuration=5, getPollingPeriod=4}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput034() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.mockito.internal.verification.VerificationOverTimeImpl", "org.mockito.internal.verification.VerificationOverTimeImpl", "getDuration", new String[]{}, new String[]{}, false, 0, null, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Long", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getDuration=0, getPollingPeriod=-1}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput035() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.mockito.internal.verification.VerificationOverTimeImpl", "org.mockito.internal.verification.VerificationOverTimeImpl", "canRecoverFromFailure", new String[]{"org.mockito.verification.VerificationMode"}, new String[]{"<sample:2>"}, false, 0, new String[][]{{"org.mockito.internal.verification.VerificationOverTimeImpl", "canRecoverFromFailure", "org.mockito.verification.VerificationMode", "<sample:2>"}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getDuration=0, getPollingPeriod=-1}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput036() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.mockito.internal.verification.VerificationOverTimeImpl", "org.mockito.internal.verification.VerificationOverTimeImpl", "getPollingPeriod", new String[]{}, new String[]{}, false, 1, new String[][]{{"org.mockito.internal.verification.VerificationOverTimeImpl", "getDuration", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.Long", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getDuration=1, getPollingPeriod=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput037() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.mockito.internal.verification.VerificationOverTimeImpl", "org.mockito.internal.verification.VerificationOverTimeImpl", "verify", new String[]{"org.mockito.internal.verification.api.VerificationData"}, new String[]{"<sample:0>"}, false, 7, new String[][]{});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getDuration=6, getPollingPeriod=5}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput038() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.mockito.internal.verification.VerificationOverTimeImpl", "org.mockito.internal.verification.VerificationOverTimeImpl", "getDuration", new String[]{}, new String[]{}, false, 4, new String[][]{{"org.mockito.internal.verification.VerificationOverTimeImpl", "getDelegate", ""}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Long", actual.getClass().getName());
  assertEquals("3", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getDuration=3, getPollingPeriod=2}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput039() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.mockito.internal.verification.VerificationOverTimeImpl", "org.mockito.internal.verification.VerificationOverTimeImpl", "verify", new String[]{"org.mockito.internal.verification.api.VerificationData"}, new String[]{"<sample:8>"}, false, 0, new String[][]{{"org.mockito.internal.verification.VerificationOverTimeImpl", "canRecoverFromFailure", "org.mockito.verification.VerificationMode", "<sample:5>"}}, 2);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getDuration=0, getPollingPeriod=-1}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput040() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.mockito.internal.verification.VerificationOverTimeImpl", "org.mockito.internal.verification.VerificationOverTimeImpl", "canRecoverFromFailure", new String[]{"org.mockito.verification.VerificationMode"}, new String[]{"<sample:10>"}, false, 0, new String[][]{{"org.mockito.internal.verification.VerificationOverTimeImpl", "canRecoverFromFailure", "org.mockito.verification.VerificationMode", "<sample:6>"}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getDuration=0, getPollingPeriod=-1}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput041() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.mockito.internal.verification.VerificationOverTimeImpl", "org.mockito.internal.verification.VerificationOverTimeImpl", "canRecoverFromFailure", new String[]{"org.mockito.verification.VerificationMode"}, new String[]{"<sample:1>"}, false, 4, new String[][]{{"org.mockito.internal.verification.VerificationOverTimeImpl", "getDuration", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getDuration=3, getPollingPeriod=2}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput042() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.mockito.internal.verification.VerificationOverTimeImpl", "org.mockito.internal.verification.VerificationOverTimeImpl", "getDuration", new String[]{}, new String[]{}, false, 1, new String[][]{{"org.mockito.internal.verification.VerificationOverTimeImpl", "canRecoverFromFailure", "org.mockito.verification.VerificationMode", "<sample:7>"}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Long", actual.getClass().getName());
  assertEquals("1", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getDuration=1, getPollingPeriod=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput043() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.mockito.internal.verification.VerificationOverTimeImpl", "org.mockito.internal.verification.VerificationOverTimeImpl", "verify", new String[]{"org.mockito.internal.verification.api.VerificationData"}, new String[]{"<sample:4>"}, false, 5, new String[][]{{"org.mockito.internal.verification.VerificationOverTimeImpl", "getDelegate", ""}}, 3);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getDuration=4, getPollingPeriod=3}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput044() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.mockito.internal.verification.VerificationOverTimeImpl", "org.mockito.internal.verification.VerificationOverTimeImpl", "getDelegate", new String[]{}, new String[]{}, false, 2, new String[][]{}), new String[][]{{"verify", "org.mockito.internal.verification.api.VerificationData", "6"}, {"verify", "org.mockito.internal.verification.api.VerificationData", "3"}});
  assertNotNull(actual);
  assertEquals("receiver state after the call", "{getDuration=9223372036854775807, getPollingPeriod=1}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput045() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.mockito.internal.verification.VerificationOverTimeImpl", "org.mockito.internal.verification.VerificationOverTimeImpl", "getDelegate", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.mockito.internal.verification.VerificationOverTimeImpl", "getDuration", ""}}, 2), new String[][]{{"verify", "org.mockito.internal.verification.api.VerificationData", "6"}, {"verify", "org.mockito.internal.verification.api.VerificationData", "3"}});
  assertNotNull(actual);
  assertEquals("receiver state after the call", "{getDuration=0, getPollingPeriod=-1}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput046() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.mockito.internal.verification.VerificationOverTimeImpl", "org.mockito.internal.verification.VerificationOverTimeImpl", "canRecoverFromFailure", new String[]{"org.mockito.verification.VerificationMode"}, new String[]{"<sample:7>"}, false, 4, new String[][]{{"org.mockito.internal.verification.VerificationOverTimeImpl", "verify", "org.mockito.internal.verification.api.VerificationData", "<sample:0>"}, {"org.mockito.internal.verification.VerificationOverTimeImpl", "canRecoverFromFailure", "org.mockito.verification.VerificationMode", "<sample:1>"}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getDuration=3, getPollingPeriod=2}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput047() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.mockito.internal.verification.VerificationOverTimeImpl", "org.mockito.internal.verification.VerificationOverTimeImpl", "canRecoverFromFailure", new String[]{"org.mockito.verification.VerificationMode"}, new String[]{"<null>"}, false, 3, new String[][]{{"org.mockito.internal.verification.VerificationOverTimeImpl", "getDelegate", ""}, {"org.mockito.internal.verification.VerificationOverTimeImpl", "getDelegate", ""}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getDuration=2, getPollingPeriod=9223372036854775807}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput048() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.mockito.internal.verification.VerificationOverTimeImpl", "org.mockito.internal.verification.VerificationOverTimeImpl", "verify", new String[]{"org.mockito.internal.verification.api.VerificationData"}, new String[]{"<sample:3>"}, false, 7, new String[][]{{"org.mockito.internal.verification.VerificationOverTimeImpl", "getDuration", ""}, {"org.mockito.internal.verification.VerificationOverTimeImpl", "verify", "org.mockito.internal.verification.api.VerificationData", "<sample:8>"}}, 2);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getDuration=6, getPollingPeriod=5}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput049() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.mockito.internal.verification.VerificationOverTimeImpl", "org.mockito.internal.verification.VerificationOverTimeImpl", "canRecoverFromFailure", new String[]{"org.mockito.verification.VerificationMode"}, new String[]{"<sample:0>"}, false, 6, new String[][]{{"org.mockito.internal.verification.VerificationOverTimeImpl", "canRecoverFromFailure", "org.mockito.verification.VerificationMode", "<sample:4>"}, {"org.mockito.internal.verification.VerificationOverTimeImpl", "verify", "org.mockito.internal.verification.api.VerificationData", "<sample:0>"}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getDuration=5, getPollingPeriod=4}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput050() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.mockito.internal.verification.VerificationOverTimeImpl", "org.mockito.internal.verification.VerificationOverTimeImpl", "verify", new String[]{"org.mockito.internal.verification.api.VerificationData"}, new String[]{"<sample:1>"}, false, 7, new String[][]{{"org.mockito.internal.verification.VerificationOverTimeImpl", "verify", "org.mockito.internal.verification.api.VerificationData", "<sample:4>"}}, 3);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getDuration=6, getPollingPeriod=5}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput051() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.mockito.internal.verification.VerificationOverTimeImpl", "org.mockito.internal.verification.VerificationOverTimeImpl", "canRecoverFromFailure", new String[]{"org.mockito.verification.VerificationMode"}, new String[]{"<sample:3>"}, false, 1, new String[][]{{"org.mockito.internal.verification.VerificationOverTimeImpl", "getDelegate", ""}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getDuration=1, getPollingPeriod=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput052() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.mockito.internal.verification.VerificationOverTimeImpl", "org.mockito.internal.verification.VerificationOverTimeImpl", "getDuration", new String[]{}, new String[]{}, false, 2, new String[][]{{"org.mockito.internal.verification.VerificationOverTimeImpl", "getDelegate", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.Long", actual.getClass().getName());
  assertEquals("9223372036854775807", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getDuration=9223372036854775807, getPollingPeriod=1}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput053() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.mockito.internal.verification.VerificationOverTimeImpl", "org.mockito.internal.verification.VerificationOverTimeImpl", "verify", new String[]{"org.mockito.internal.verification.api.VerificationData"}, new String[]{"<sample:6>"}, false, 6, new String[][]{}, 3);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getDuration=5, getPollingPeriod=4}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput054() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.mockito.internal.verification.VerificationOverTimeImpl", "org.mockito.internal.verification.VerificationOverTimeImpl", "getDelegate", new String[]{}, new String[]{}, false, 7, new String[][]{{"org.mockito.internal.verification.VerificationOverTimeImpl", "verify", "org.mockito.internal.verification.api.VerificationData", "<sample:10>"}}, 2), new String[][]{{"atLeast", "int", "6"}});
  assertNotNull(actual);
  assertEquals("org.mockito.verification.After", actual.getClass().getName());
  assertEquals("receiver state after the call", "{getDuration=6, getPollingPeriod=5}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput055() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.mockito.internal.verification.VerificationOverTimeImpl", "org.mockito.internal.verification.VerificationOverTimeImpl", "verify", new String[]{"org.mockito.internal.verification.api.VerificationData"}, new String[]{"<sample:6>"}, false, 1, new String[][]{{"org.mockito.internal.verification.VerificationOverTimeImpl", "getPollingPeriod", ""}, {"org.mockito.internal.verification.VerificationOverTimeImpl", "canRecoverFromFailure", "org.mockito.verification.VerificationMode", "<sample:1>"}}, 2);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getDuration=1, getPollingPeriod=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput056() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.mockito.internal.verification.VerificationOverTimeImpl", "org.mockito.internal.verification.VerificationOverTimeImpl", "getPollingPeriod", new String[]{}, new String[]{}, false, 4, new String[][]{}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Long", actual.getClass().getName());
  assertEquals("2", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getDuration=3, getPollingPeriod=2}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput057() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.mockito.internal.verification.VerificationOverTimeImpl", "org.mockito.internal.verification.VerificationOverTimeImpl", "getDuration", new String[]{}, new String[]{}, false, 3, new String[][]{}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Long", actual.getClass().getName());
  assertEquals("2", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getDuration=2, getPollingPeriod=9223372036854775807}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput058() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.mockito.internal.verification.VerificationOverTimeImpl", "org.mockito.internal.verification.VerificationOverTimeImpl", "verify", new String[]{"org.mockito.internal.verification.api.VerificationData"}, new String[]{"<sample:3>"}, false, 3, new String[][]{{"org.mockito.internal.verification.VerificationOverTimeImpl", "getDelegate", ""}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getDuration=2, getPollingPeriod=9223372036854775807}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput059() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.mockito.internal.verification.VerificationOverTimeImpl", "org.mockito.internal.verification.VerificationOverTimeImpl", "getDuration", new String[]{}, new String[]{}, false, 4, new String[][]{{"org.mockito.internal.verification.VerificationOverTimeImpl", "getDuration", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.Long", actual.getClass().getName());
  assertEquals("3", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getDuration=3, getPollingPeriod=2}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput060() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.mockito.internal.verification.VerificationOverTimeImpl", "org.mockito.internal.verification.VerificationOverTimeImpl", "getDelegate", new String[]{}, new String[]{}, false, 5, new String[][]{}, 2), new String[][]{{"atLeast", "int", "6"}, {"verify", "org.mockito.internal.verification.api.VerificationData", "2"}});
  assertNotNull(actual);
  assertEquals("org.mockito.verification.After", actual.getClass().getName());
  assertEquals("receiver state after the call", "{getDuration=4, getPollingPeriod=3}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput061() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.mockito.internal.verification.VerificationOverTimeImpl", "org.mockito.internal.verification.VerificationOverTimeImpl", "verify", new String[]{"org.mockito.internal.verification.api.VerificationData"}, new String[]{"<sample:5>"}, false, 4, new String[][]{}, 2);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getDuration=3, getPollingPeriod=2}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput062() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.mockito.internal.verification.VerificationOverTimeImpl", "org.mockito.internal.verification.VerificationOverTimeImpl", "canRecoverFromFailure", new String[]{"org.mockito.verification.VerificationMode"}, new String[]{"<sample:6>"}, false, 5, new String[][]{}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getDuration=4, getPollingPeriod=3}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput063() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.mockito.internal.verification.VerificationOverTimeImpl", "org.mockito.internal.verification.VerificationOverTimeImpl", "getPollingPeriod", new String[]{}, new String[]{}, false, 7, new String[][]{{"org.mockito.internal.verification.VerificationOverTimeImpl", "getPollingPeriod", ""}, {"org.mockito.internal.verification.VerificationOverTimeImpl", "getDuration", ""}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Long", actual.getClass().getName());
  assertEquals("5", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getDuration=6, getPollingPeriod=5}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput064() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.mockito.internal.verification.VerificationOverTimeImpl", "org.mockito.internal.verification.VerificationOverTimeImpl", "canRecoverFromFailure", new String[]{"org.mockito.verification.VerificationMode"}, new String[]{"<sample:3>"}, false, 1, new String[][]{{"org.mockito.internal.verification.VerificationOverTimeImpl", "getDelegate", ""}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getDuration=1, getPollingPeriod=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput065() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.mockito.internal.verification.VerificationOverTimeImpl", "org.mockito.internal.verification.VerificationOverTimeImpl", "getDelegate", new String[]{}, new String[]{}, false, 4, new String[][]{{"org.mockito.internal.verification.VerificationOverTimeImpl", "getDuration", ""}}, 1), new String[][]{{"verify", "org.mockito.internal.verification.api.VerificationData", "3"}});
  assertNotNull(actual);
  assertEquals("receiver state after the call", "{getDuration=3, getPollingPeriod=2}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput066() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.mockito.internal.verification.VerificationOverTimeImpl", "org.mockito.internal.verification.VerificationOverTimeImpl", "getDelegate", new String[]{}, new String[]{}, false, 7, new String[][]{{"org.mockito.internal.verification.VerificationOverTimeImpl", "getDuration", ""}, {"org.mockito.internal.verification.VerificationOverTimeImpl", "getPollingPeriod", ""}}, 3);
  assertNotNull(actual);
  assertEquals("org.mockito.verification.After", actual.getClass().getName());
  assertEquals("receiver state after the call", "{getDuration=6, getPollingPeriod=5}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput067() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.mockito.internal.verification.VerificationOverTimeImpl", "org.mockito.internal.verification.VerificationOverTimeImpl", "getPollingPeriod", new String[]{}, new String[]{}, false, 4, new String[][]{{"org.mockito.internal.verification.VerificationOverTimeImpl", "getDelegate", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.Long", actual.getClass().getName());
  assertEquals("2", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getDuration=3, getPollingPeriod=2}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput068() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.mockito.internal.verification.VerificationOverTimeImpl", "org.mockito.internal.verification.VerificationOverTimeImpl", "getDuration", new String[]{}, new String[]{}, false, 5, new String[][]{{"org.mockito.internal.verification.VerificationOverTimeImpl", "getDuration", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.Long", actual.getClass().getName());
  assertEquals("4", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getDuration=4, getPollingPeriod=3}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput069() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.mockito.internal.verification.VerificationOverTimeImpl", "org.mockito.internal.verification.VerificationOverTimeImpl", "getPollingPeriod", new String[]{}, new String[]{}, false, 5, new String[][]{{"org.mockito.internal.verification.VerificationOverTimeImpl", "getPollingPeriod", ""}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Long", actual.getClass().getName());
  assertEquals("3", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getDuration=4, getPollingPeriod=3}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput070() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.mockito.internal.verification.VerificationOverTimeImpl", "org.mockito.internal.verification.VerificationOverTimeImpl", "getPollingPeriod", new String[]{}, new String[]{}, false, 7, new String[][]{{"org.mockito.internal.verification.VerificationOverTimeImpl", "canRecoverFromFailure", "org.mockito.verification.VerificationMode", "<sample:6>"}});
  assertNotNull(actual);
  assertEquals("java.lang.Long", actual.getClass().getName());
  assertEquals("5", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getDuration=6, getPollingPeriod=5}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput071() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.mockito.internal.verification.VerificationOverTimeImpl", "org.mockito.internal.verification.VerificationOverTimeImpl", "getDelegate", new String[]{}, new String[]{}, false, 5, new String[][]{{"org.mockito.internal.verification.VerificationOverTimeImpl", "getPollingPeriod", ""}}, 2), new String[][]{{"atLeastOnce", "", "6"}, {"times", "int", "1"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("org.mockito.exceptions.base.MockitoException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput072() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.mockito.internal.verification.VerificationOverTimeImpl", "org.mockito.internal.verification.VerificationOverTimeImpl", "getPollingPeriod", new String[]{}, new String[]{}, false, 3, new String[][]{{"org.mockito.internal.verification.VerificationOverTimeImpl", "canRecoverFromFailure", "org.mockito.verification.VerificationMode", "<sample:6>"}, {"org.mockito.internal.verification.VerificationOverTimeImpl", "canRecoverFromFailure", "org.mockito.verification.VerificationMode", "<sample:3>"}});
  assertNotNull(actual);
  assertEquals("java.lang.Long", actual.getClass().getName());
  assertEquals("9223372036854775807", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getDuration=2, getPollingPeriod=9223372036854775807}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput073() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.mockito.internal.verification.VerificationOverTimeImpl", "org.mockito.internal.verification.VerificationOverTimeImpl", "getPollingPeriod", new String[]{}, new String[]{}, false, 1, new String[][]{{"org.mockito.internal.verification.VerificationOverTimeImpl", "canRecoverFromFailure", "org.mockito.verification.VerificationMode", "<sample:0>"}, {"org.mockito.internal.verification.VerificationOverTimeImpl", "verify", "org.mockito.internal.verification.api.VerificationData", "<sample:11>"}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Long", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getDuration=1, getPollingPeriod=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput074() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.mockito.internal.verification.VerificationOverTimeImpl", "org.mockito.internal.verification.VerificationOverTimeImpl", "getPollingPeriod", new String[]{}, new String[]{}, false, 0, null, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Long", actual.getClass().getName());
  assertEquals("-1", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getDuration=0, getPollingPeriod=-1}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput075() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.mockito.internal.verification.VerificationOverTimeImpl", "org.mockito.internal.verification.VerificationOverTimeImpl", "getDuration", new String[]{}, new String[]{}, false, 5, new String[][]{{"org.mockito.internal.verification.VerificationOverTimeImpl", "verify", "org.mockito.internal.verification.api.VerificationData", "<sample:0>"}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Long", actual.getClass().getName());
  assertEquals("4", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getDuration=4, getPollingPeriod=3}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput076() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.mockito.internal.verification.VerificationOverTimeImpl", "org.mockito.internal.verification.VerificationOverTimeImpl", "canRecoverFromFailure", new String[]{"org.mockito.verification.VerificationMode"}, new String[]{"<sample:4>"}, false, 4, new String[][]{{"org.mockito.internal.verification.VerificationOverTimeImpl", "getDuration", ""}, {"org.mockito.internal.verification.VerificationOverTimeImpl", "getDelegate", ""}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getDuration=3, getPollingPeriod=2}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput077() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.mockito.internal.verification.VerificationOverTimeImpl", "org.mockito.internal.verification.VerificationOverTimeImpl", "getPollingPeriod", new String[]{}, new String[]{}, false, 5, new String[][]{{"org.mockito.internal.verification.VerificationOverTimeImpl", "canRecoverFromFailure", "org.mockito.verification.VerificationMode", "<null>"}, {"org.mockito.internal.verification.VerificationOverTimeImpl", "getDelegate", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.Long", actual.getClass().getName());
  assertEquals("3", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getDuration=4, getPollingPeriod=3}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput078() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.mockito.internal.verification.VerificationOverTimeImpl", "org.mockito.internal.verification.VerificationOverTimeImpl", "getDelegate", new String[]{}, new String[]{}, false, 2, new String[][]{}, 2), new String[][]{{"verify", "org.mockito.internal.verification.api.VerificationData", "4"}});
  assertNotNull(actual);
  assertEquals("receiver state after the call", "{getDuration=9223372036854775807, getPollingPeriod=1}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput079() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.mockito.internal.verification.VerificationOverTimeImpl", "org.mockito.internal.verification.VerificationOverTimeImpl", "getDuration", new String[]{}, new String[]{}, false, 7, new String[][]{{"org.mockito.internal.verification.VerificationOverTimeImpl", "getPollingPeriod", ""}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Long", actual.getClass().getName());
  assertEquals("6", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getDuration=6, getPollingPeriod=5}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput080() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.mockito.internal.verification.VerificationOverTimeImpl", "org.mockito.internal.verification.VerificationOverTimeImpl", "getDuration", new String[]{}, new String[]{}, false, 7, new String[][]{{"org.mockito.internal.verification.VerificationOverTimeImpl", "verify", "org.mockito.internal.verification.api.VerificationData", "<sample:6>"}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Long", actual.getClass().getName());
  assertEquals("6", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getDuration=6, getPollingPeriod=5}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput081() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.mockito.internal.verification.VerificationOverTimeImpl", "org.mockito.internal.verification.VerificationOverTimeImpl", "getDuration", new String[]{}, new String[]{}, false, 7, new String[][]{{"org.mockito.internal.verification.VerificationOverTimeImpl", "getPollingPeriod", ""}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Long", actual.getClass().getName());
  assertEquals("6", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getDuration=6, getPollingPeriod=5}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput082() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.mockito.internal.verification.VerificationOverTimeImpl", "org.mockito.internal.verification.VerificationOverTimeImpl", "getPollingPeriod", new String[]{}, new String[]{}, false, 5, new String[][]{{"org.mockito.internal.verification.VerificationOverTimeImpl", "getDelegate", ""}, {"org.mockito.internal.verification.VerificationOverTimeImpl", "canRecoverFromFailure", "org.mockito.verification.VerificationMode", "<sample:5>"}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Long", actual.getClass().getName());
  assertEquals("3", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getDuration=4, getPollingPeriod=3}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput083() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.mockito.internal.verification.VerificationOverTimeImpl", "org.mockito.internal.verification.VerificationOverTimeImpl", "getPollingPeriod", new String[]{}, new String[]{}, false, 4, new String[][]{{"org.mockito.internal.verification.VerificationOverTimeImpl", "getDelegate", ""}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Long", actual.getClass().getName());
  assertEquals("2", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getDuration=3, getPollingPeriod=2}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput084() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.mockito.internal.verification.VerificationOverTimeImpl", "org.mockito.internal.verification.VerificationOverTimeImpl", "canRecoverFromFailure", new String[]{"org.mockito.verification.VerificationMode"}, new String[]{"<sample:1>"}, false, 1, new String[][]{{"org.mockito.internal.verification.VerificationOverTimeImpl", "verify", "org.mockito.internal.verification.api.VerificationData", "<sample:8>"}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getDuration=1, getPollingPeriod=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput085() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.mockito.internal.verification.VerificationOverTimeImpl", "org.mockito.internal.verification.VerificationOverTimeImpl", "verify", new String[]{"org.mockito.internal.verification.api.VerificationData"}, new String[]{"<sample:6>"}, false, 4, new String[][]{{"org.mockito.internal.verification.VerificationOverTimeImpl", "getDuration", ""}, {"org.mockito.internal.verification.VerificationOverTimeImpl", "getPollingPeriod", ""}}, 1);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getDuration=3, getPollingPeriod=2}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput086() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.mockito.internal.verification.VerificationOverTimeImpl", "org.mockito.internal.verification.VerificationOverTimeImpl", "getDuration", new String[]{}, new String[]{}, false, 1, new String[][]{}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Long", actual.getClass().getName());
  assertEquals("1", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getDuration=1, getPollingPeriod=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput087() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.mockito.internal.verification.VerificationOverTimeImpl", "org.mockito.internal.verification.VerificationOverTimeImpl", "getDuration", new String[]{}, new String[]{}, false, 5, new String[][]{{"org.mockito.internal.verification.VerificationOverTimeImpl", "getDuration", ""}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Long", actual.getClass().getName());
  assertEquals("4", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getDuration=4, getPollingPeriod=3}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput088() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.mockito.internal.verification.VerificationOverTimeImpl", "org.mockito.internal.verification.VerificationOverTimeImpl", "getDelegate", new String[]{}, new String[]{}, false, 1, new String[][]{{"org.mockito.internal.verification.VerificationOverTimeImpl", "canRecoverFromFailure", "org.mockito.verification.VerificationMode", "<sample:6>"}, {"org.mockito.internal.verification.VerificationOverTimeImpl", "getPollingPeriod", ""}}, 1);
  assertNotNull(actual);
  assertEquals("org.mockito.verification.After", actual.getClass().getName());
  assertEquals("receiver state after the call", "{getDuration=1, getPollingPeriod=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput089() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.mockito.internal.verification.VerificationOverTimeImpl", "org.mockito.internal.verification.VerificationOverTimeImpl", "canRecoverFromFailure", new String[]{"org.mockito.verification.VerificationMode"}, new String[]{"<sample:2>"}, false, 5, new String[][]{}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getDuration=4, getPollingPeriod=3}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput090() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.mockito.internal.verification.VerificationOverTimeImpl", "org.mockito.internal.verification.VerificationOverTimeImpl", "verify", new String[]{"org.mockito.internal.verification.api.VerificationData"}, new String[]{"<sample:4>"}, false, 6, new String[][]{{"org.mockito.internal.verification.VerificationOverTimeImpl", "getPollingPeriod", ""}, {"org.mockito.internal.verification.VerificationOverTimeImpl", "getDelegate", ""}}, 1);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getDuration=5, getPollingPeriod=4}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput091() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.mockito.internal.verification.VerificationOverTimeImpl", "org.mockito.internal.verification.VerificationOverTimeImpl", "getDelegate", new String[]{}, new String[]{}, false, 6, new String[][]{{"org.mockito.internal.verification.VerificationOverTimeImpl", "getDuration", ""}, {"org.mockito.internal.verification.VerificationOverTimeImpl", "getDuration", ""}}, 2), new String[][]{{"verify", "org.mockito.internal.verification.api.VerificationData", "6"}, {"verify", "org.mockito.internal.verification.api.VerificationData", "1"}});
  assertNotNull(actual);
  assertEquals("receiver state after the call", "{getDuration=5, getPollingPeriod=4}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput092() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.mockito.internal.verification.VerificationOverTimeImpl", "org.mockito.internal.verification.VerificationOverTimeImpl", "getPollingPeriod", new String[]{}, new String[]{}, false, 6, new String[][]{{"org.mockito.internal.verification.VerificationOverTimeImpl", "canRecoverFromFailure", "org.mockito.verification.VerificationMode", "<sample:1>"}, {"org.mockito.internal.verification.VerificationOverTimeImpl", "getDelegate", ""}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Long", actual.getClass().getName());
  assertEquals("4", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getDuration=5, getPollingPeriod=4}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput093() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.mockito.internal.verification.VerificationOverTimeImpl", "org.mockito.internal.verification.VerificationOverTimeImpl", "getDuration", new String[]{}, new String[]{}, false, 7, new String[][]{{"org.mockito.internal.verification.VerificationOverTimeImpl", "canRecoverFromFailure", "org.mockito.verification.VerificationMode", "<sample:1>"}});
  assertNotNull(actual);
  assertEquals("java.lang.Long", actual.getClass().getName());
  assertEquals("6", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getDuration=6, getPollingPeriod=5}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput094() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.mockito.internal.verification.VerificationOverTimeImpl", "org.mockito.internal.verification.VerificationOverTimeImpl", "getDelegate", new String[]{}, new String[]{}, false, 3, new String[][]{{"org.mockito.internal.verification.VerificationOverTimeImpl", "getPollingPeriod", ""}, {"org.mockito.internal.verification.VerificationOverTimeImpl", "getPollingPeriod", ""}}, 1), new String[][]{{"atLeastOnce", "", "7"}, {"atLeastOnce", "", "4"}});
  assertNotNull(actual);
  assertEquals("org.mockito.verification.After", actual.getClass().getName());
  assertEquals("receiver state after the call", "{getDuration=2, getPollingPeriod=9223372036854775807}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput095() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.mockito.internal.verification.VerificationOverTimeImpl", "org.mockito.internal.verification.VerificationOverTimeImpl", "getPollingPeriod", new String[]{}, new String[]{}, false, 2, new String[][]{{"org.mockito.internal.verification.VerificationOverTimeImpl", "getPollingPeriod", ""}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Long", actual.getClass().getName());
  assertEquals("1", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getDuration=9223372036854775807, getPollingPeriod=1}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput096() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.mockito.internal.verification.VerificationOverTimeImpl", "org.mockito.internal.verification.VerificationOverTimeImpl", "verify", new String[]{"org.mockito.internal.verification.api.VerificationData"}, new String[]{"<sample:6>"}, false, 3, new String[][]{}, 1);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getDuration=2, getPollingPeriod=9223372036854775807}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput097() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.mockito.internal.verification.VerificationOverTimeImpl", "org.mockito.internal.verification.VerificationOverTimeImpl", "getPollingPeriod", new String[]{}, new String[]{}, false, 3, new String[][]{{"org.mockito.internal.verification.VerificationOverTimeImpl", "getPollingPeriod", ""}, {"org.mockito.internal.verification.VerificationOverTimeImpl", "verify", "org.mockito.internal.verification.api.VerificationData", "<sample:8>"}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Long", actual.getClass().getName());
  assertEquals("9223372036854775807", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getDuration=2, getPollingPeriod=9223372036854775807}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput098() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.mockito.internal.verification.VerificationOverTimeImpl", "org.mockito.internal.verification.VerificationOverTimeImpl", "getDuration", new String[]{}, new String[]{}, false, 3, new String[][]{{"org.mockito.internal.verification.VerificationOverTimeImpl", "canRecoverFromFailure", "org.mockito.verification.VerificationMode", "<sample:9>"}, {"org.mockito.internal.verification.VerificationOverTimeImpl", "canRecoverFromFailure", "org.mockito.verification.VerificationMode", "<sample:5>"}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Long", actual.getClass().getName());
  assertEquals("2", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getDuration=2, getPollingPeriod=9223372036854775807}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput099() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.mockito.internal.verification.VerificationOverTimeImpl", "org.mockito.internal.verification.VerificationOverTimeImpl", "verify", new String[]{"org.mockito.internal.verification.api.VerificationData"}, new String[]{"<sample:7>"}, false, 3, new String[][]{}, 2);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getDuration=2, getPollingPeriod=9223372036854775807}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput100() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.mockito.internal.verification.VerificationOverTimeImpl", "org.mockito.internal.verification.VerificationOverTimeImpl", "getDuration", new String[]{}, new String[]{}, false, 3, new String[][]{{"org.mockito.internal.verification.VerificationOverTimeImpl", "getDelegate", ""}, {"org.mockito.internal.verification.VerificationOverTimeImpl", "getDelegate", ""}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Long", actual.getClass().getName());
  assertEquals("2", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getDuration=2, getPollingPeriod=9223372036854775807}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput101() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.mockito.internal.verification.VerificationOverTimeImpl", "org.mockito.internal.verification.VerificationOverTimeImpl", "getDelegate", new String[]{}, new String[]{}, false, 7, new String[][]{}, 1);
  assertNotNull(actual);
  assertEquals("org.mockito.verification.After", actual.getClass().getName());
  assertEquals("receiver state after the call", "{getDuration=6, getPollingPeriod=5}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput102() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.mockito.internal.verification.VerificationOverTimeImpl", "org.mockito.internal.verification.VerificationOverTimeImpl", "getDuration", new String[]{}, new String[]{}, false, 2, new String[][]{}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Long", actual.getClass().getName());
  assertEquals("9223372036854775807", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getDuration=9223372036854775807, getPollingPeriod=1}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput103() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.mockito.internal.verification.VerificationOverTimeImpl", "org.mockito.internal.verification.VerificationOverTimeImpl", "getDuration", new String[]{}, new String[]{}, false, 2, new String[][]{{"org.mockito.internal.verification.VerificationOverTimeImpl", "getDelegate", ""}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Long", actual.getClass().getName());
  assertEquals("9223372036854775807", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getDuration=9223372036854775807, getPollingPeriod=1}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput104() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.mockito.internal.verification.VerificationOverTimeImpl", "org.mockito.internal.verification.VerificationOverTimeImpl", "getDuration", new String[]{}, new String[]{}, false, 6, new String[][]{{"org.mockito.internal.verification.VerificationOverTimeImpl", "canRecoverFromFailure", "org.mockito.verification.VerificationMode", "<sample:3>"}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Long", actual.getClass().getName());
  assertEquals("5", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getDuration=5, getPollingPeriod=4}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput105() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.mockito.internal.verification.VerificationOverTimeImpl", "org.mockito.internal.verification.VerificationOverTimeImpl", "getPollingPeriod", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.mockito.internal.verification.VerificationOverTimeImpl", "getPollingPeriod", ""}, {"org.mockito.internal.verification.VerificationOverTimeImpl", "getDelegate", ""}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Long", actual.getClass().getName());
  assertEquals("-1", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getDuration=0, getPollingPeriod=-1}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput106() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.mockito.internal.verification.VerificationOverTimeImpl", "org.mockito.internal.verification.VerificationOverTimeImpl", "verify", new String[]{"org.mockito.internal.verification.api.VerificationData"}, new String[]{"<sample:5>"}, false, 1, new String[][]{{"org.mockito.internal.verification.VerificationOverTimeImpl", "getDelegate", ""}}, 3);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getDuration=1, getPollingPeriod=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput107() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.mockito.internal.verification.VerificationOverTimeImpl", "org.mockito.internal.verification.VerificationOverTimeImpl", "canRecoverFromFailure", new String[]{"org.mockito.verification.VerificationMode"}, new String[]{"<sample:5>"}, false, 3, new String[][]{{"org.mockito.internal.verification.VerificationOverTimeImpl", "getPollingPeriod", ""}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getDuration=2, getPollingPeriod=9223372036854775807}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput108() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.mockito.internal.verification.VerificationOverTimeImpl", "org.mockito.internal.verification.VerificationOverTimeImpl", "getDuration", new String[]{}, new String[]{}, false, 1, new String[][]{{"org.mockito.internal.verification.VerificationOverTimeImpl", "getPollingPeriod", ""}, {"org.mockito.internal.verification.VerificationOverTimeImpl", "getDuration", ""}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Long", actual.getClass().getName());
  assertEquals("1", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getDuration=1, getPollingPeriod=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput109() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.mockito.internal.verification.VerificationOverTimeImpl", "org.mockito.internal.verification.VerificationOverTimeImpl", "getPollingPeriod", new String[]{}, new String[]{}, false, 3, new String[][]{{"org.mockito.internal.verification.VerificationOverTimeImpl", "getPollingPeriod", ""}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Long", actual.getClass().getName());
  assertEquals("9223372036854775807", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getDuration=2, getPollingPeriod=9223372036854775807}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput110() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.mockito.internal.verification.VerificationOverTimeImpl", "org.mockito.internal.verification.VerificationOverTimeImpl", "getDelegate", new String[]{}, new String[]{}, false, 3, new String[][]{{"org.mockito.internal.verification.VerificationOverTimeImpl", "getPollingPeriod", ""}}, 3), new String[][]{{"atMost", "int", "5"}, {"verify", "org.mockito.internal.verification.api.VerificationData", "5"}});
  assertNotNull(actual);
  assertEquals("org.mockito.verification.After", actual.getClass().getName());
  assertEquals("receiver state after the call", "{getDuration=2, getPollingPeriod=9223372036854775807}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput111() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.mockito.internal.verification.VerificationOverTimeImpl", "org.mockito.internal.verification.VerificationOverTimeImpl", "getDuration", new String[]{}, new String[]{}, false, 6, new String[][]{}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Long", actual.getClass().getName());
  assertEquals("5", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getDuration=5, getPollingPeriod=4}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput112() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.mockito.internal.verification.VerificationOverTimeImpl", "org.mockito.internal.verification.VerificationOverTimeImpl", "getDuration", new String[]{}, new String[]{}, false, 5, new String[][]{{"org.mockito.internal.verification.VerificationOverTimeImpl", "canRecoverFromFailure", "org.mockito.verification.VerificationMode", "<sample:0>"}, {"org.mockito.internal.verification.VerificationOverTimeImpl", "getDuration", ""}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Long", actual.getClass().getName());
  assertEquals("4", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getDuration=4, getPollingPeriod=3}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput113() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.mockito.internal.verification.VerificationOverTimeImpl", "org.mockito.internal.verification.VerificationOverTimeImpl", "getDelegate", new String[]{}, new String[]{}, false, 5, new String[][]{{"org.mockito.internal.verification.VerificationOverTimeImpl", "getDuration", ""}, {"org.mockito.internal.verification.VerificationOverTimeImpl", "getDelegate", ""}}, 1);
  assertNotNull(actual);
  assertEquals("org.mockito.verification.After", actual.getClass().getName());
  assertEquals("receiver state after the call", "{getDuration=4, getPollingPeriod=3}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput114() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.mockito.internal.verification.VerificationOverTimeImpl", "org.mockito.internal.verification.VerificationOverTimeImpl", "getDuration", new String[]{}, new String[]{}, false, 6, new String[][]{{"org.mockito.internal.verification.VerificationOverTimeImpl", "getPollingPeriod", ""}, {"org.mockito.internal.verification.VerificationOverTimeImpl", "canRecoverFromFailure", "org.mockito.verification.VerificationMode", "<sample:6>"}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Long", actual.getClass().getName());
  assertEquals("5", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getDuration=5, getPollingPeriod=4}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput115() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.mockito.internal.verification.VerificationOverTimeImpl", "org.mockito.internal.verification.VerificationOverTimeImpl", "getPollingPeriod", new String[]{}, new String[]{}, false, 1, new String[][]{}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Long", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getDuration=1, getPollingPeriod=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput116() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.mockito.internal.verification.VerificationOverTimeImpl", "org.mockito.internal.verification.VerificationOverTimeImpl", "getDuration", new String[]{}, new String[]{}, false, 4, new String[][]{{"org.mockito.internal.verification.VerificationOverTimeImpl", "getPollingPeriod", ""}, {"org.mockito.internal.verification.VerificationOverTimeImpl", "verify", "org.mockito.internal.verification.api.VerificationData", "<null>"}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Long", actual.getClass().getName());
  assertEquals("3", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getDuration=3, getPollingPeriod=2}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput117() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.mockito.internal.verification.VerificationOverTimeImpl", "org.mockito.internal.verification.VerificationOverTimeImpl", "getDelegate", new String[]{}, new String[]{}, false, 3, new String[][]{{"org.mockito.internal.verification.VerificationOverTimeImpl", "verify", "org.mockito.internal.verification.api.VerificationData", "<null>"}}, 3), new String[][]{{"atMost", "int", "1"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("org.mockito.exceptions.base.MockitoException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput118() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.mockito.internal.verification.VerificationOverTimeImpl", "org.mockito.internal.verification.VerificationOverTimeImpl", "getDuration", new String[]{}, new String[]{}, false, 4, new String[][]{}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Long", actual.getClass().getName());
  assertEquals("3", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getDuration=3, getPollingPeriod=2}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput119() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.mockito.internal.verification.VerificationOverTimeImpl", "org.mockito.internal.verification.VerificationOverTimeImpl", "getPollingPeriod", new String[]{}, new String[]{}, false, 1, new String[][]{{"org.mockito.internal.verification.VerificationOverTimeImpl", "getDelegate", ""}, {"org.mockito.internal.verification.VerificationOverTimeImpl", "verify", "org.mockito.internal.verification.api.VerificationData", "<sample:3>"}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Long", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getDuration=1, getPollingPeriod=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput120() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.mockito.internal.verification.VerificationOverTimeImpl", "org.mockito.internal.verification.VerificationOverTimeImpl", "getPollingPeriod", new String[]{}, new String[]{}, false, 7, new String[][]{{"org.mockito.internal.verification.VerificationOverTimeImpl", "getPollingPeriod", ""}, {"org.mockito.internal.verification.VerificationOverTimeImpl", "getDelegate", ""}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Long", actual.getClass().getName());
  assertEquals("5", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getDuration=6, getPollingPeriod=5}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput121() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.mockito.internal.verification.VerificationOverTimeImpl", "org.mockito.internal.verification.VerificationOverTimeImpl", "getPollingPeriod", new String[]{}, new String[]{}, false, 7, new String[][]{{"org.mockito.internal.verification.VerificationOverTimeImpl", "getDuration", ""}, {"org.mockito.internal.verification.VerificationOverTimeImpl", "canRecoverFromFailure", "org.mockito.verification.VerificationMode", "<null>"}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Long", actual.getClass().getName());
  assertEquals("5", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getDuration=6, getPollingPeriod=5}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput122() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.mockito.internal.verification.VerificationOverTimeImpl", "org.mockito.internal.verification.VerificationOverTimeImpl", "getDuration", new String[]{}, new String[]{}, false, 2, new String[][]{}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Long", actual.getClass().getName());
  assertEquals("9223372036854775807", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getDuration=9223372036854775807, getPollingPeriod=1}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput123() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.mockito.internal.verification.VerificationOverTimeImpl", "org.mockito.internal.verification.VerificationOverTimeImpl", "canRecoverFromFailure", new String[]{"org.mockito.verification.VerificationMode"}, new String[]{"<sample:5>"}, false, 4, new String[][]{{"org.mockito.internal.verification.VerificationOverTimeImpl", "getPollingPeriod", ""}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getDuration=3, getPollingPeriod=2}", SearchInputFactory_scaffolding.receiverState());
 }
}
