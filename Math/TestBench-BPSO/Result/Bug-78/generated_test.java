package generated.algorithm;

import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;
import static org.junit.Assert.*;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class BinaryParticleSwarmGeneratedTest {
 @Test(timeout = 20000)
 public void generatedInput000() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.ode.events.EventState", "org.apache.commons.math.ode.events.EventState", "getMaxCheckInterval", new String[]{}, new String[]{}, false);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("0.0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getConvergence=1.0, getEventTime=NaN, getMaxCheckInterval=0.0, getMaxIterationCount=2147483647}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput001() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.ode.events.EventState", "org.apache.commons.math.ode.events.EventState", "reset", new String[]{"double", "double[]"}, new String[]{"0.0", "<empty>"}, false, 1, new String[][]{});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getConvergence=Infinity, getEventTime=NaN, getMaxCheckInterval=1.0, getMaxIterationCount=2}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput002() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.ode.events.EventState", "org.apache.commons.math.ode.events.EventState", "reinitializeBegin", new String[]{"double", "double[]"}, new String[]{"NaN", "<sample:1>"}, false, 0, new String[][]{{"org.apache.commons.math.ode.events.EventState", "getMaxIterationCount", ""}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getConvergence=1.0, getEventTime=NaN, getMaxCheckInterval=0.0, getMaxIterationCount=2147483647}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput003() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.ode.events.EventState", "org.apache.commons.math.ode.events.EventState", "getMaxIterationCount", new String[]{}, new String[]{}, false, 0, null, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("2147483647", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getConvergence=1.0, getEventTime=NaN, getMaxCheckInterval=0.0, getMaxIterationCount=2147483647}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput004() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.ode.events.EventState", "org.apache.commons.math.ode.events.EventState", "getMaxCheckInterval", new String[]{}, new String[]{}, false, 6, new String[][]{{"org.apache.commons.math.ode.events.EventState", "getConvergence", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("1.0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getConvergence=Infinity, getEventTime=NaN, getMaxCheckInterval=1.0, getMaxIterationCount=7}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput005() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.ode.events.EventState", "org.apache.commons.math.ode.events.EventState", "getConvergence", new String[]{}, new String[]{}, false, 7, new String[][]{{"org.apache.commons.math.ode.events.EventState", "reset", "double,double[]", "1.0", "<sample:0>"}});
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("Infinity", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getConvergence=Infinity, getEventTime=NaN, getMaxCheckInterval=Infinity, getMaxIterationCount=8}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput006() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.ode.events.EventState", "org.apache.commons.math.ode.events.EventState", "stepAccepted", new String[]{"double", "double[]"}, new String[]{"Infinity", "<sample:1>"}, false, 0, new String[][]{{"org.apache.commons.math.ode.events.EventState", "getMaxIterationCount", ""}}, 3);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getConvergence=1.0, getEventTime=NaN, getMaxCheckInterval=0.0, getMaxIterationCount=2147483647}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput007() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.ode.events.EventState", "org.apache.commons.math.ode.events.EventState", "reset", new String[]{"double", "double[]"}, new String[]{"NaN", "<sample:0>"}, false, 6, new String[][]{{"org.apache.commons.math.ode.events.EventState", "reinitializeBegin", "double,double[]", "1.7976931348623157E308", "<sample:3>"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getConvergence=Infinity, getEventTime=NaN, getMaxCheckInterval=1.0, getMaxIterationCount=7}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput008() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.ode.events.EventState", "org.apache.commons.math.ode.events.EventState", "getConvergence", new String[]{}, new String[]{}, false, 2, new String[][]{});
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("Infinity", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getConvergence=Infinity, getEventTime=NaN, getMaxCheckInterval=Infinity, getMaxIterationCount=3}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput009() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.ode.events.EventState", "org.apache.commons.math.ode.events.EventState", "getEventHandler", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.math.ode.events.EventState", "getEventTime", ""}}, 3);
  assertNotNull(actual);
  assertEquals("receiver state after the call", "{getConvergence=1.0, getEventTime=NaN, getMaxCheckInterval=0.0, getMaxIterationCount=2147483647}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput010() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.ode.events.EventState", "org.apache.commons.math.ode.events.EventState", "stepAccepted", new String[]{"double", "double[]"}, new String[]{"Infinity", "<sample:7>"}, false, 0, new String[][]{{"org.apache.commons.math.ode.events.EventState", "getConvergence", ""}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getConvergence=1.0, getEventTime=NaN, getMaxCheckInterval=0.0, getMaxIterationCount=2147483647}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput011() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.ode.events.EventState", "org.apache.commons.math.ode.events.EventState", "stepAccepted", new String[]{"double", "double[]"}, new String[]{"0.1", "<sample:1>"}, false, 4, new String[][]{});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getConvergence=0.0, getEventTime=NaN, getMaxCheckInterval=-1.0, getMaxIterationCount=5}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput012() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.ode.events.EventState", "org.apache.commons.math.ode.events.EventState", "stepAccepted", new String[]{"double", "double[]"}, new String[]{"-0.45", "<sample:2>"}, false, 6, new String[][]{});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getConvergence=Infinity, getEventTime=NaN, getMaxCheckInterval=1.0, getMaxIterationCount=7}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput013() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.ode.events.EventState", "org.apache.commons.math.ode.events.EventState", "getEventTime", new String[]{}, new String[]{}, false);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("NaN", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getConvergence=1.0, getEventTime=NaN, getMaxCheckInterval=0.0, getMaxIterationCount=2147483647}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput014() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.ode.events.EventState", "org.apache.commons.math.ode.events.EventState", "getConvergence", new String[]{}, new String[]{}, false, 6, new String[][]{{"org.apache.commons.math.ode.events.EventState", "getConvergence", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("Infinity", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getConvergence=Infinity, getEventTime=NaN, getMaxCheckInterval=1.0, getMaxIterationCount=7}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput015() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.ode.events.EventState", "org.apache.commons.math.ode.events.EventState", "stop", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.math.ode.events.EventState", "getMaxCheckInterval", ""}, {"org.apache.commons.math.ode.events.EventState", "reinitializeBegin", "double,double[]", "0.2", "<sample:3>"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getConvergence=1.0, getEventTime=NaN, getMaxCheckInterval=0.0, getMaxIterationCount=2147483647}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput016() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.ode.events.EventState", "org.apache.commons.math.ode.events.EventState", "getMaxCheckInterval", new String[]{}, new String[]{}, false, 7, new String[][]{{"org.apache.commons.math.ode.events.EventState", "getConvergence", ""}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("Infinity", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getConvergence=Infinity, getEventTime=NaN, getMaxCheckInterval=Infinity, getMaxIterationCount=8}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput017() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.ode.events.EventState", "org.apache.commons.math.ode.events.EventState", "reset", new String[]{"double", "double[]"}, new String[]{"0.05", "<null>"}, false, 0, new String[][]{{"org.apache.commons.math.ode.events.EventState", "getEventHandler", ""}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getConvergence=1.0, getEventTime=NaN, getMaxCheckInterval=0.0, getMaxIterationCount=2147483647}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput018() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.ode.events.EventState", "org.apache.commons.math.ode.events.EventState", "getMaxIterationCount", new String[]{}, new String[]{}, false);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("2147483647", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getConvergence=1.0, getEventTime=NaN, getMaxCheckInterval=0.0, getMaxIterationCount=2147483647}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput019() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.ode.events.EventState", "org.apache.commons.math.ode.events.EventState", "getEventTime", new String[]{}, new String[]{}, false, 2, new String[][]{});
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("NaN", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getConvergence=Infinity, getEventTime=NaN, getMaxCheckInterval=Infinity, getMaxIterationCount=3}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput020() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.ode.events.EventState", "org.apache.commons.math.ode.events.EventState", "getEventTime", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.math.ode.events.EventState", "getMaxIterationCount", ""}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("NaN", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getConvergence=1.0, getEventTime=NaN, getMaxCheckInterval=0.0, getMaxIterationCount=2147483647}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput021() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.ode.events.EventState", "org.apache.commons.math.ode.events.EventState", "getEventHandler", new String[]{}, new String[]{}, false, 2, new String[][]{{"org.apache.commons.math.ode.events.EventState", "stop", ""}, {"org.apache.commons.math.ode.events.EventState", "reset", "double,double[]", "-0.25", "<sample:3>"}}, 3);
  assertNotNull(actual);
  assertEquals("receiver state after the call", "{getConvergence=Infinity, getEventTime=NaN, getMaxCheckInterval=Infinity, getMaxIterationCount=3}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput022() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.ode.events.EventState", "org.apache.commons.math.ode.events.EventState", "stepAccepted", new String[]{"double", "double[]"}, new String[]{"0.25000000000000006", "<empty>"}, false, 0, null, 2);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getConvergence=1.0, getEventTime=NaN, getMaxCheckInterval=0.0, getMaxIterationCount=2147483647}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput023() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.ode.events.EventState", "org.apache.commons.math.ode.events.EventState", "getConvergence", new String[]{}, new String[]{}, false, 0, null, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("1.0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getConvergence=1.0, getEventTime=NaN, getMaxCheckInterval=0.0, getMaxIterationCount=2147483647}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput024() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.ode.events.EventState", "org.apache.commons.math.ode.events.EventState", "getConvergence", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.math.ode.events.EventState", "getConvergence", ""}, {"org.apache.commons.math.ode.events.EventState", "getEventTime", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("1.0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getConvergence=1.0, getEventTime=NaN, getMaxCheckInterval=0.0, getMaxIterationCount=2147483647}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput025() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.ode.events.EventState", "org.apache.commons.math.ode.events.EventState", "stop", new String[]{}, new String[]{}, false, 7, new String[][]{});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getConvergence=Infinity, getEventTime=NaN, getMaxCheckInterval=Infinity, getMaxIterationCount=8}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput026() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.ode.events.EventState", "org.apache.commons.math.ode.events.EventState", "getEventHandler", new String[]{}, new String[]{}, false, 4, new String[][]{{"org.apache.commons.math.ode.events.EventState", "getMaxCheckInterval", ""}});
  assertNotNull(actual);
  assertEquals("receiver state after the call", "{getConvergence=0.0, getEventTime=NaN, getMaxCheckInterval=-1.0, getMaxIterationCount=5}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput027() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.ode.events.EventState", "org.apache.commons.math.ode.events.EventState", "getEventHandler", new String[]{}, new String[]{}, false, 7, new String[][]{{"org.apache.commons.math.ode.events.EventState", "getMaxCheckInterval", ""}});
  assertNotNull(actual);
  assertEquals("receiver state after the call", "{getConvergence=Infinity, getEventTime=NaN, getMaxCheckInterval=Infinity, getMaxIterationCount=8}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput028() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.ode.events.EventState", "org.apache.commons.math.ode.events.EventState", "stepAccepted", new String[]{"double", "double[]"}, new String[]{"NaN", "<sample:3>"}, false, 7, new String[][]{{"org.apache.commons.math.ode.events.EventState", "getEventTime", ""}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getConvergence=Infinity, getEventTime=NaN, getMaxCheckInterval=Infinity, getMaxIterationCount=8}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput029() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.ode.events.EventState", "org.apache.commons.math.ode.events.EventState", "evaluateStep", new String[]{"org.apache.commons.math.ode.sampling.StepInterpolator"}, new String[]{"<sample:5>"}, false, 6, new String[][]{{"org.apache.commons.math.ode.events.EventState", "getMaxIterationCount", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getConvergence=Infinity, getEventTime=NaN, getMaxCheckInterval=1.0, getMaxIterationCount=7}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput030() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.ode.events.EventState", "org.apache.commons.math.ode.events.EventState", "getEventHandler", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.math.ode.events.EventState", "stop", ""}}, 2);
  assertNotNull(actual);
  assertEquals("receiver state after the call", "{getConvergence=1.0, getEventTime=NaN, getMaxCheckInterval=0.0, getMaxIterationCount=2147483647}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput031() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.ode.events.EventState", "org.apache.commons.math.ode.events.EventState", "stop", new String[]{}, new String[]{}, false, 6, new String[][]{{"org.apache.commons.math.ode.events.EventState", "getConvergence", ""}, {"org.apache.commons.math.ode.events.EventState", "reset", "double,double[]", "Infinity", "<sample:1>"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getConvergence=Infinity, getEventTime=NaN, getMaxCheckInterval=1.0, getMaxIterationCount=7}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput032() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.ode.events.EventState", "org.apache.commons.math.ode.events.EventState", "getEventTime", new String[]{}, new String[]{}, false, 6, new String[][]{{"org.apache.commons.math.ode.events.EventState", "stepAccepted", "double,double[]", "-1.7976931348623157E308", "<null>"}, {"org.apache.commons.math.ode.events.EventState", "getEventTime", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("NaN", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getConvergence=Infinity, getEventTime=NaN, getMaxCheckInterval=1.0, getMaxIterationCount=7}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput033() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math.ode.events.EventState", "org.apache.commons.math.ode.events.EventState", "getEventHandler", new String[]{}, new String[]{}, false, 1, new String[][]{}, 3), new String[][]{{"resetState", "double,double[]", "2"}, {"g", "double,double[]", "6"}});
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("0.0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getConvergence=Infinity, getEventTime=NaN, getMaxCheckInterval=1.0, getMaxIterationCount=2}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput034() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.ode.events.EventState", "org.apache.commons.math.ode.events.EventState", "stop", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.math.ode.events.EventState", "getEventTime", ""}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getConvergence=1.0, getEventTime=NaN, getMaxCheckInterval=0.0, getMaxIterationCount=2147483647}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput035() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.ode.events.EventState", "org.apache.commons.math.ode.events.EventState", "getEventHandler", new String[]{}, new String[]{}, false);
  assertNotNull(actual);
  assertEquals("receiver state after the call", "{getConvergence=1.0, getEventTime=NaN, getMaxCheckInterval=0.0, getMaxIterationCount=2147483647}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput036() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.ode.events.EventState", "org.apache.commons.math.ode.events.EventState", "stop", new String[]{}, new String[]{}, false, 1, new String[][]{{"org.apache.commons.math.ode.events.EventState", "getMaxIterationCount", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getConvergence=Infinity, getEventTime=NaN, getMaxCheckInterval=1.0, getMaxIterationCount=2}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput037() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.ode.events.EventState", "org.apache.commons.math.ode.events.EventState", "reset", new String[]{"double", "double[]"}, new String[]{"-0.9999999999999999", "<sample:3>"}, false, 0, new String[][]{{"org.apache.commons.math.ode.events.EventState", "stepAccepted", "double,double[]", "-1.0", "<sample:3>"}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getConvergence=1.0, getEventTime=NaN, getMaxCheckInterval=0.0, getMaxIterationCount=2147483647}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput038() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math.ode.events.EventState", "org.apache.commons.math.ode.events.EventState", "evaluateStep", new String[]{"org.apache.commons.math.ode.sampling.StepInterpolator"}, new String[]{"<sample:8>"}, false, 1, new String[][]{{"org.apache.commons.math.ode.events.EventState", "getMaxIterationCount", ""}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput039() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.ode.events.EventState", "org.apache.commons.math.ode.events.EventState", "getEventHandler", new String[]{}, new String[]{}, false, 3, new String[][]{});
  assertNotNull(actual);
  assertEquals("receiver state after the call", "{getConvergence=1.0, getEventTime=NaN, getMaxCheckInterval=-Infinity, getMaxIterationCount=4}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput040() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.ode.events.EventState", "org.apache.commons.math.ode.events.EventState", "stop", new String[]{}, new String[]{}, false, 3, new String[][]{});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getConvergence=1.0, getEventTime=NaN, getMaxCheckInterval=-Infinity, getMaxIterationCount=4}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput041() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math.ode.events.EventState", "org.apache.commons.math.ode.events.EventState", "evaluateStep", new String[]{"org.apache.commons.math.ode.sampling.StepInterpolator"}, new String[]{"<sample:10>"}, false, 4, new String[][]{}, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput042() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.ode.events.EventState", "org.apache.commons.math.ode.events.EventState", "getMaxIterationCount", new String[]{}, new String[]{}, false, 6, new String[][]{{"org.apache.commons.math.ode.events.EventState", "reset", "double,double[]", "-1.7976931348623157E308", "<sample:0>"}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("7", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getConvergence=Infinity, getEventTime=NaN, getMaxCheckInterval=1.0, getMaxIterationCount=7}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput043() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.ode.events.EventState", "org.apache.commons.math.ode.events.EventState", "stepAccepted", new String[]{"double", "double[]"}, new String[]{"NaN", "<null>"}, false, 3, new String[][]{});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getConvergence=1.0, getEventTime=NaN, getMaxCheckInterval=-Infinity, getMaxIterationCount=4}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput044() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.ode.events.EventState", "org.apache.commons.math.ode.events.EventState", "getEventHandler", new String[]{}, new String[]{}, false, 6, new String[][]{});
  assertNotNull(actual);
  assertEquals("receiver state after the call", "{getConvergence=Infinity, getEventTime=NaN, getMaxCheckInterval=1.0, getMaxIterationCount=7}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput045() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math.ode.events.EventState", "org.apache.commons.math.ode.events.EventState", "getEventHandler", new String[]{}, new String[]{}, false, 2, new String[][]{{"org.apache.commons.math.ode.events.EventState", "getMaxCheckInterval", ""}, {"org.apache.commons.math.ode.events.EventState", "evaluateStep", "org.apache.commons.math.ode.sampling.StepInterpolator", "<sample:2>"}}), new String[][]{{"g", "double,double[]", "0"}});
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("1.0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getConvergence=Infinity, getEventTime=NaN, getMaxCheckInterval=Infinity, getMaxIterationCount=3}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput046() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.ode.events.EventState", "org.apache.commons.math.ode.events.EventState", "getMaxIterationCount", new String[]{}, new String[]{}, false, 4, new String[][]{});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("5", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getConvergence=0.0, getEventTime=NaN, getMaxCheckInterval=-1.0, getMaxIterationCount=5}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput047() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.ode.events.EventState", "org.apache.commons.math.ode.events.EventState", "getEventHandler", new String[]{}, new String[]{}, false, 2, new String[][]{{"org.apache.commons.math.ode.events.EventState", "stepAccepted", "double,double[]", "0.19999999999999998", "<sample:0>"}, {"org.apache.commons.math.ode.events.EventState", "stepAccepted", "double,double[]", "-0.56", "<null>"}}, 2);
  assertNotNull(actual);
  assertEquals("receiver state after the call", "{getConvergence=Infinity, getEventTime=NaN, getMaxCheckInterval=Infinity, getMaxIterationCount=3}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput048() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.ode.events.EventState", "org.apache.commons.math.ode.events.EventState", "getMaxCheckInterval", new String[]{}, new String[]{}, false, 4, new String[][]{{"org.apache.commons.math.ode.events.EventState", "reset", "double,double[]", "-0.25", "<sample:4>"}});
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("-1.0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getConvergence=0.0, getEventTime=NaN, getMaxCheckInterval=-1.0, getMaxIterationCount=5}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput049() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.ode.events.EventState", "org.apache.commons.math.ode.events.EventState", "getMaxIterationCount", new String[]{}, new String[]{}, false, 2, new String[][]{{"org.apache.commons.math.ode.events.EventState", "reinitializeBegin", "double,double[]", "Infinity", "<sample:0>"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("3", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getConvergence=Infinity, getEventTime=NaN, getMaxCheckInterval=Infinity, getMaxIterationCount=3}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput050() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.ode.events.EventState", "org.apache.commons.math.ode.events.EventState", "getEventTime", new String[]{}, new String[]{}, false, 0, null, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("NaN", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getConvergence=1.0, getEventTime=NaN, getMaxCheckInterval=0.0, getMaxIterationCount=2147483647}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput051() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.ode.events.EventState", "org.apache.commons.math.ode.events.EventState", "getMaxCheckInterval", new String[]{}, new String[]{}, false, 5, new String[][]{}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("0.0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getConvergence=1.0, getEventTime=NaN, getMaxCheckInterval=0.0, getMaxIterationCount=6}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput052() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math.ode.events.EventState", "org.apache.commons.math.ode.events.EventState", "getEventHandler", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.math.ode.events.EventState", "getMaxCheckInterval", ""}, {"org.apache.commons.math.ode.events.EventState", "getConvergence", ""}}), new String[][]{{"eventOccurred", "double,double[],boolean", "2"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("-1", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getConvergence=1.0, getEventTime=NaN, getMaxCheckInterval=0.0, getMaxIterationCount=2147483647}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput053() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.ode.events.EventState", "org.apache.commons.math.ode.events.EventState", "getEventHandler", new String[]{}, new String[]{}, false, 2, new String[][]{}, 1);
  assertNotNull(actual);
  assertEquals("receiver state after the call", "{getConvergence=Infinity, getEventTime=NaN, getMaxCheckInterval=Infinity, getMaxIterationCount=3}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput054() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.ode.events.EventState", "org.apache.commons.math.ode.events.EventState", "stop", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.math.ode.events.EventState", "getEventHandler", ""}, {"org.apache.commons.math.ode.events.EventState", "getMaxCheckInterval", ""}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getConvergence=1.0, getEventTime=NaN, getMaxCheckInterval=0.0, getMaxIterationCount=2147483647}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput055() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.ode.events.EventState", "org.apache.commons.math.ode.events.EventState", "getConvergence", new String[]{}, new String[]{}, false, 3, new String[][]{}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("1.0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getConvergence=1.0, getEventTime=NaN, getMaxCheckInterval=-Infinity, getMaxIterationCount=4}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput056() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.ode.events.EventState", "org.apache.commons.math.ode.events.EventState", "getConvergence", new String[]{}, new String[]{}, false, 4, new String[][]{{"org.apache.commons.math.ode.events.EventState", "reinitializeBegin", "double,double[]", "1.7976931348623157E308", "<sample:2>"}});
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("0.0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getConvergence=0.0, getEventTime=NaN, getMaxCheckInterval=-1.0, getMaxIterationCount=5}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput057() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.ode.events.EventState", "org.apache.commons.math.ode.events.EventState", "stepAccepted", new String[]{"double", "double[]"}, new String[]{"-17.0", "<sample:2>"}, false, 6, new String[][]{}, 3);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getConvergence=Infinity, getEventTime=NaN, getMaxCheckInterval=1.0, getMaxIterationCount=7}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput058() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.ode.events.EventState", "org.apache.commons.math.ode.events.EventState", "getMaxCheckInterval", new String[]{}, new String[]{}, false, 1, new String[][]{{"org.apache.commons.math.ode.events.EventState", "evaluateStep", "org.apache.commons.math.ode.sampling.StepInterpolator", "<sample:1>"}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("1.0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getConvergence=Infinity, getEventTime=NaN, getMaxCheckInterval=1.0, getMaxIterationCount=2}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput059() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math.ode.events.EventState", "org.apache.commons.math.ode.events.EventState", "getEventHandler", new String[]{}, new String[]{}, false), new String[][]{{"resetState", "double,double[]", "2"}, {"g", "double,double[]", "7"}});
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("-1.0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getConvergence=1.0, getEventTime=NaN, getMaxCheckInterval=0.0, getMaxIterationCount=2147483647}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput060() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.ode.events.EventState", "org.apache.commons.math.ode.events.EventState", "getMaxCheckInterval", new String[]{}, new String[]{}, false, 6, new String[][]{{"org.apache.commons.math.ode.events.EventState", "stepAccepted", "double,double[]", "1.0", "<sample:4>"}, {"org.apache.commons.math.ode.events.EventState", "getMaxIterationCount", ""}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("1.0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getConvergence=Infinity, getEventTime=NaN, getMaxCheckInterval=1.0, getMaxIterationCount=7}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput061() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.ode.events.EventState", "org.apache.commons.math.ode.events.EventState", "stepAccepted", new String[]{"double", "double[]"}, new String[]{"1.7976931348623155E308", "<sample:3>"}, false, 4, new String[][]{}, 3);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getConvergence=0.0, getEventTime=NaN, getMaxCheckInterval=-1.0, getMaxIterationCount=5}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput062() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.ode.events.EventState", "org.apache.commons.math.ode.events.EventState", "getMaxCheckInterval", new String[]{}, new String[]{}, false, 3, new String[][]{}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("-Infinity", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getConvergence=1.0, getEventTime=NaN, getMaxCheckInterval=-Infinity, getMaxIterationCount=4}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput063() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.ode.events.EventState", "org.apache.commons.math.ode.events.EventState", "reset", new String[]{"double", "double[]"}, new String[]{"0.2", "<sample:0>"}, false, 2, new String[][]{{"org.apache.commons.math.ode.events.EventState", "evaluateStep", "org.apache.commons.math.ode.sampling.StepInterpolator", "<sample:1>"}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getConvergence=Infinity, getEventTime=NaN, getMaxCheckInterval=Infinity, getMaxIterationCount=3}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput064() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.ode.events.EventState", "org.apache.commons.math.ode.events.EventState", "reinitializeBegin", new String[]{"double", "double[]"}, new String[]{"1.7976931348623158E307", "<sample:0>"}, false, 2, new String[][]{{"org.apache.commons.math.ode.events.EventState", "getMaxCheckInterval", ""}}, 1);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getConvergence=Infinity, getEventTime=NaN, getMaxCheckInterval=Infinity, getMaxIterationCount=3}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput065() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.ode.events.EventState", "org.apache.commons.math.ode.events.EventState", "evaluateStep", new String[]{"org.apache.commons.math.ode.sampling.StepInterpolator"}, new String[]{"<sample:7>"}, false, 2, new String[][]{{"org.apache.commons.math.ode.events.EventState", "getConvergence", ""}, {"org.apache.commons.math.ode.events.EventState", "getConvergence", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getConvergence=Infinity, getEventTime=NaN, getMaxCheckInterval=Infinity, getMaxIterationCount=3}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput066() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.ode.events.EventState", "org.apache.commons.math.ode.events.EventState", "getEventTime", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.math.ode.events.EventState", "getEventTime", ""}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("NaN", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getConvergence=1.0, getEventTime=NaN, getMaxCheckInterval=0.0, getMaxIterationCount=2147483647}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput067() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.ode.events.EventState", "org.apache.commons.math.ode.events.EventState", "getConvergence", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.math.ode.events.EventState", "getConvergence", ""}, {"org.apache.commons.math.ode.events.EventState", "evaluateStep", "org.apache.commons.math.ode.sampling.StepInterpolator", "<sample:5>"}});
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("1.0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getConvergence=1.0, getEventTime=NaN, getMaxCheckInterval=0.0, getMaxIterationCount=2147483647}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput068() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.ode.events.EventState", "org.apache.commons.math.ode.events.EventState", "getEventTime", new String[]{}, new String[]{}, false, 7, new String[][]{{"org.apache.commons.math.ode.events.EventState", "reset", "double,double[]", "-4.9E-324", "<sample:2>"}});
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("NaN", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getConvergence=Infinity, getEventTime=NaN, getMaxCheckInterval=Infinity, getMaxIterationCount=8}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput069() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.ode.events.EventState", "org.apache.commons.math.ode.events.EventState", "getMaxIterationCount", new String[]{}, new String[]{}, false, 5, new String[][]{});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("6", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getConvergence=1.0, getEventTime=NaN, getMaxCheckInterval=0.0, getMaxIterationCount=6}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput070() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.ode.events.EventState", "org.apache.commons.math.ode.events.EventState", "getEventTime", new String[]{}, new String[]{}, false, 3, new String[][]{{"org.apache.commons.math.ode.events.EventState", "stop", ""}, {"org.apache.commons.math.ode.events.EventState", "getMaxCheckInterval", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("NaN", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getConvergence=1.0, getEventTime=NaN, getMaxCheckInterval=-Infinity, getMaxIterationCount=4}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput071() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.ode.events.EventState", "org.apache.commons.math.ode.events.EventState", "getMaxCheckInterval", new String[]{}, new String[]{}, false, 5, new String[][]{{"org.apache.commons.math.ode.events.EventState", "evaluateStep", "org.apache.commons.math.ode.sampling.StepInterpolator", "<sample:1>"}});
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("0.0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getConvergence=1.0, getEventTime=NaN, getMaxCheckInterval=0.0, getMaxIterationCount=6}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput072() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.ode.events.EventState", "org.apache.commons.math.ode.events.EventState", "reinitializeBegin", new String[]{"double", "double[]"}, new String[]{"0.12499999999999999", "<sample:0>"}, false, 4, new String[][]{{"org.apache.commons.math.ode.events.EventState", "getEventTime", ""}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getConvergence=0.0, getEventTime=NaN, getMaxCheckInterval=-1.0, getMaxIterationCount=5}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput073() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.ode.events.EventState", "org.apache.commons.math.ode.events.EventState", "getConvergence", new String[]{}, new String[]{}, false, 1, new String[][]{{"org.apache.commons.math.ode.events.EventState", "stop", ""}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("Infinity", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getConvergence=Infinity, getEventTime=NaN, getMaxCheckInterval=1.0, getMaxIterationCount=2}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput074() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math.ode.events.EventState", "org.apache.commons.math.ode.events.EventState", "getEventHandler", new String[]{}, new String[]{}, false, 2, new String[][]{}, 1), new String[][]{{"eventOccurred", "double,double[],boolean", "6"}, {"eventOccurred", "double,double[],boolean", "1"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("1", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getConvergence=Infinity, getEventTime=NaN, getMaxCheckInterval=Infinity, getMaxIterationCount=3}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput075() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.ode.events.EventState", "org.apache.commons.math.ode.events.EventState", "stepAccepted", new String[]{"double", "double[]"}, new String[]{"1.7976931348623157E308", "<sample:1>"}, false, 5, new String[][]{{"org.apache.commons.math.ode.events.EventState", "getConvergence", ""}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getConvergence=1.0, getEventTime=NaN, getMaxCheckInterval=0.0, getMaxIterationCount=6}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput076() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.ode.events.EventState", "org.apache.commons.math.ode.events.EventState", "getMaxCheckInterval", new String[]{}, new String[]{}, false, 2, new String[][]{{"org.apache.commons.math.ode.events.EventState", "getMaxCheckInterval", ""}, {"org.apache.commons.math.ode.events.EventState", "getMaxCheckInterval", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("Infinity", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getConvergence=Infinity, getEventTime=NaN, getMaxCheckInterval=Infinity, getMaxIterationCount=3}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput077() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.ode.events.EventState", "org.apache.commons.math.ode.events.EventState", "getEventTime", new String[]{}, new String[]{}, false, 5, new String[][]{}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("NaN", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getConvergence=1.0, getEventTime=NaN, getMaxCheckInterval=0.0, getMaxIterationCount=6}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput078() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.ode.events.EventState", "org.apache.commons.math.ode.events.EventState", "getMaxCheckInterval", new String[]{}, new String[]{}, false, 0, null, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("0.0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getConvergence=1.0, getEventTime=NaN, getMaxCheckInterval=0.0, getMaxIterationCount=2147483647}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput079() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.ode.events.EventState", "org.apache.commons.math.ode.events.EventState", "reset", new String[]{"double", "double[]"}, new String[]{"NaN", "<empty>"}, false);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getConvergence=1.0, getEventTime=NaN, getMaxCheckInterval=0.0, getMaxIterationCount=2147483647}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput080() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math.ode.events.EventState", "org.apache.commons.math.ode.events.EventState", "getEventHandler", new String[]{}, new String[]{}, false, 6, new String[][]{}, 1), new String[][]{{"resetState", "double,double[]", "4"}});
  assertNotNull(actual);
  assertEquals("receiver state after the call", "{getConvergence=Infinity, getEventTime=NaN, getMaxCheckInterval=1.0, getMaxIterationCount=7}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput081() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math.ode.events.EventState", "org.apache.commons.math.ode.events.EventState", "getEventHandler", new String[]{}, new String[]{}, false, 6, new String[][]{{"org.apache.commons.math.ode.events.EventState", "evaluateStep", "org.apache.commons.math.ode.sampling.StepInterpolator", "<sample:1>"}, {"org.apache.commons.math.ode.events.EventState", "getEventTime", ""}}), new String[][]{{"g", "double,double[]", "0"}});
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("0.0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getConvergence=Infinity, getEventTime=NaN, getMaxCheckInterval=1.0, getMaxIterationCount=7}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput082() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.ode.events.EventState", "org.apache.commons.math.ode.events.EventState", "reinitializeBegin", new String[]{"double", "double[]"}, new String[]{"0.125", "<sample:3>"}, false, 5, new String[][]{});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getConvergence=1.0, getEventTime=NaN, getMaxCheckInterval=0.0, getMaxIterationCount=6}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput083() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.ode.events.EventState", "org.apache.commons.math.ode.events.EventState", "reset", new String[]{"double", "double[]"}, new String[]{"NaN", "<empty>"}, false, 5, new String[][]{{"org.apache.commons.math.ode.events.EventState", "evaluateStep", "org.apache.commons.math.ode.sampling.StepInterpolator", "<null>"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getConvergence=1.0, getEventTime=NaN, getMaxCheckInterval=0.0, getMaxIterationCount=6}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput084() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.ode.events.EventState", "org.apache.commons.math.ode.events.EventState", "getMaxCheckInterval", new String[]{}, new String[]{}, false, 3, new String[][]{});
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("-Infinity", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getConvergence=1.0, getEventTime=NaN, getMaxCheckInterval=-Infinity, getMaxIterationCount=4}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput085() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.ode.events.EventState", "org.apache.commons.math.ode.events.EventState", "reinitializeBegin", new String[]{"double", "double[]"}, new String[]{"0.10000000000000002", "<empty>"}, false, 0, null, 2);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getConvergence=1.0, getEventTime=NaN, getMaxCheckInterval=0.0, getMaxIterationCount=2147483647}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput086() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.ode.events.EventState", "org.apache.commons.math.ode.events.EventState", "evaluateStep", new String[]{"org.apache.commons.math.ode.sampling.StepInterpolator"}, new String[]{"<sample:7>"}, false, 1, new String[][]{{"org.apache.commons.math.ode.events.EventState", "evaluateStep", "org.apache.commons.math.ode.sampling.StepInterpolator", "<sample:5>"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getConvergence=Infinity, getEventTime=NaN, getMaxCheckInterval=1.0, getMaxIterationCount=2}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput087() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.ode.events.EventState", "org.apache.commons.math.ode.events.EventState", "getMaxCheckInterval", new String[]{}, new String[]{}, false, 5, new String[][]{{"org.apache.commons.math.ode.events.EventState", "getMaxCheckInterval", ""}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("0.0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getConvergence=1.0, getEventTime=NaN, getMaxCheckInterval=0.0, getMaxIterationCount=6}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput088() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math.ode.events.EventState", "org.apache.commons.math.ode.events.EventState", "getEventHandler", new String[]{}, new String[]{}, false, 6, new String[][]{{"org.apache.commons.math.ode.events.EventState", "getEventHandler", ""}, {"org.apache.commons.math.ode.events.EventState", "getEventHandler", ""}}), new String[][]{{"eventOccurred", "double,double[],boolean", "6"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("4", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getConvergence=Infinity, getEventTime=NaN, getMaxCheckInterval=1.0, getMaxIterationCount=7}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput089() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math.ode.events.EventState", "org.apache.commons.math.ode.events.EventState", "getEventHandler", new String[]{}, new String[]{}, false, 6, new String[][]{}, 2), new String[][]{{"eventOccurred", "double,double[],boolean", "0"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("4", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getConvergence=Infinity, getEventTime=NaN, getMaxCheckInterval=1.0, getMaxIterationCount=7}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput090() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.ode.events.EventState", "org.apache.commons.math.ode.events.EventState", "stepAccepted", new String[]{"double", "double[]"}, new String[]{"-1.0", "<sample:0>"}, false, 5, new String[][]{{"org.apache.commons.math.ode.events.EventState", "stop", ""}}, 3);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getConvergence=1.0, getEventTime=NaN, getMaxCheckInterval=0.0, getMaxIterationCount=6}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput091() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.ode.events.EventState", "org.apache.commons.math.ode.events.EventState", "getConvergence", new String[]{}, new String[]{}, false, 5, new String[][]{});
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("1.0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getConvergence=1.0, getEventTime=NaN, getMaxCheckInterval=0.0, getMaxIterationCount=6}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput092() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.ode.events.EventState", "org.apache.commons.math.ode.events.EventState", "getMaxIterationCount", new String[]{}, new String[]{}, false, 1, new String[][]{{"org.apache.commons.math.ode.events.EventState", "stepAccepted", "double,double[]", "-1.7976931348623157E308", "<empty>"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("2", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getConvergence=Infinity, getEventTime=NaN, getMaxCheckInterval=1.0, getMaxIterationCount=2}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput093() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.ode.events.EventState", "org.apache.commons.math.ode.events.EventState", "getMaxCheckInterval", new String[]{}, new String[]{}, false, 7, new String[][]{{"org.apache.commons.math.ode.events.EventState", "getMaxCheckInterval", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("Infinity", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getConvergence=Infinity, getEventTime=NaN, getMaxCheckInterval=Infinity, getMaxIterationCount=8}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput094() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.ode.events.EventState", "org.apache.commons.math.ode.events.EventState", "getMaxCheckInterval", new String[]{}, new String[]{}, false, 1, new String[][]{{"org.apache.commons.math.ode.events.EventState", "getMaxIterationCount", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("1.0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getConvergence=Infinity, getEventTime=NaN, getMaxCheckInterval=1.0, getMaxIterationCount=2}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput095() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.ode.events.EventState", "org.apache.commons.math.ode.events.EventState", "evaluateStep", new String[]{"org.apache.commons.math.ode.sampling.StepInterpolator"}, new String[]{"<sample:9>"}, false, 6, new String[][]{}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getConvergence=Infinity, getEventTime=NaN, getMaxCheckInterval=1.0, getMaxIterationCount=7}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput096() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.ode.events.EventState", "org.apache.commons.math.ode.events.EventState", "getMaxIterationCount", new String[]{}, new String[]{}, false, 7, new String[][]{{"org.apache.commons.math.ode.events.EventState", "stop", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("8", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getConvergence=Infinity, getEventTime=NaN, getMaxCheckInterval=Infinity, getMaxIterationCount=8}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput097() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.ode.events.EventState", "org.apache.commons.math.ode.events.EventState", "reset", new String[]{"double", "double[]"}, new String[]{"0.19999999999999998", "<sample:5>"}, false, 5, new String[][]{}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getConvergence=1.0, getEventTime=NaN, getMaxCheckInterval=0.0, getMaxIterationCount=6}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput098() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.ode.events.EventState", "org.apache.commons.math.ode.events.EventState", "reset", new String[]{"double", "double[]"}, new String[]{"1.7976931348623157E308", "<sample:3>"}, false, 0, new String[][]{{"org.apache.commons.math.ode.events.EventState", "stop", ""}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getConvergence=1.0, getEventTime=NaN, getMaxCheckInterval=0.0, getMaxIterationCount=2147483647}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput099() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.ode.events.EventState", "org.apache.commons.math.ode.events.EventState", "stepAccepted", new String[]{"double", "double[]"}, new String[]{"-1.7976931348623157E308", "<sample:3>"}, false, 3, new String[][]{{"org.apache.commons.math.ode.events.EventState", "reset", "double,double[]", "-0.25", "<null>"}}, 2);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getConvergence=1.0, getEventTime=NaN, getMaxCheckInterval=-Infinity, getMaxIterationCount=4}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput100() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.ode.events.EventState", "org.apache.commons.math.ode.events.EventState", "stepAccepted", new String[]{"double", "double[]"}, new String[]{"0.45", "<sample:0>"}, false, 1, new String[][]{{"org.apache.commons.math.ode.events.EventState", "stepAccepted", "double,double[]", "1.7976931348623158E307", "<sample:3>"}}, 3);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getConvergence=Infinity, getEventTime=NaN, getMaxCheckInterval=1.0, getMaxIterationCount=2}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput101() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.ode.events.EventState", "org.apache.commons.math.ode.events.EventState", "getEventHandler", new String[]{}, new String[]{}, false, 1, new String[][]{}, 2);
  assertNotNull(actual);
  assertEquals("receiver state after the call", "{getConvergence=Infinity, getEventTime=NaN, getMaxCheckInterval=1.0, getMaxIterationCount=2}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput102() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.ode.events.EventState", "org.apache.commons.math.ode.events.EventState", "getEventTime", new String[]{}, new String[]{}, false, 1, new String[][]{}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("NaN", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getConvergence=Infinity, getEventTime=NaN, getMaxCheckInterval=1.0, getMaxIterationCount=2}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput103() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.ode.events.EventState", "org.apache.commons.math.ode.events.EventState", "getConvergence", new String[]{}, new String[]{}, false, 2, new String[][]{}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("Infinity", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getConvergence=Infinity, getEventTime=NaN, getMaxCheckInterval=Infinity, getMaxIterationCount=3}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput104() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.ode.events.EventState", "org.apache.commons.math.ode.events.EventState", "evaluateStep", new String[]{"org.apache.commons.math.ode.sampling.StepInterpolator"}, new String[]{"<sample:9>"}, false, 1, new String[][]{}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getConvergence=Infinity, getEventTime=NaN, getMaxCheckInterval=1.0, getMaxIterationCount=2}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput105() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.ode.events.EventState", "org.apache.commons.math.ode.events.EventState", "getConvergence", new String[]{}, new String[]{}, false, 1, new String[][]{{"org.apache.commons.math.ode.events.EventState", "getEventHandler", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("Infinity", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getConvergence=Infinity, getEventTime=NaN, getMaxCheckInterval=1.0, getMaxIterationCount=2}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput106() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math.ode.events.EventState", "org.apache.commons.math.ode.events.EventState", "getEventHandler", new String[]{}, new String[]{}, false, 0, null, 3), new String[][]{{"eventOccurred", "double,double[],boolean", "3"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("-1", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getConvergence=1.0, getEventTime=NaN, getMaxCheckInterval=0.0, getMaxIterationCount=2147483647}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput107() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math.ode.events.EventState", "org.apache.commons.math.ode.events.EventState", "evaluateStep", new String[]{"org.apache.commons.math.ode.sampling.StepInterpolator"}, new String[]{"<sample:6>"}, false, 1, new String[][]{}, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput108() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.ode.events.EventState", "org.apache.commons.math.ode.events.EventState", "reinitializeBegin", new String[]{"double", "double[]"}, new String[]{"NaN", "<sample:2>"}, false, 2, new String[][]{{"org.apache.commons.math.ode.events.EventState", "getConvergence", ""}}, 3);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getConvergence=Infinity, getEventTime=NaN, getMaxCheckInterval=Infinity, getMaxIterationCount=3}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput109() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.ode.events.EventState", "org.apache.commons.math.ode.events.EventState", "reinitializeBegin", new String[]{"double", "double[]"}, new String[]{"-1.7976931348623155E308", "<sample:3>"}, false, 7, new String[][]{{"org.apache.commons.math.ode.events.EventState", "stepAccepted", "double,double[]", "-18.9", "<null>"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getConvergence=Infinity, getEventTime=NaN, getMaxCheckInterval=Infinity, getMaxIterationCount=8}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput110() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.ode.events.EventState", "org.apache.commons.math.ode.events.EventState", "stop", new String[]{}, new String[]{}, false, 1, new String[][]{{"org.apache.commons.math.ode.events.EventState", "getMaxIterationCount", ""}, {"org.apache.commons.math.ode.events.EventState", "getEventTime", ""}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getConvergence=Infinity, getEventTime=NaN, getMaxCheckInterval=1.0, getMaxIterationCount=2}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput111() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.ode.events.EventState", "org.apache.commons.math.ode.events.EventState", "getMaxCheckInterval", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.math.ode.events.EventState", "stepAccepted", "double,double[]", "59.0", "<sample:5>"}, {"org.apache.commons.math.ode.events.EventState", "getConvergence", ""}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("0.0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getConvergence=1.0, getEventTime=NaN, getMaxCheckInterval=0.0, getMaxIterationCount=2147483647}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput112() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.ode.events.EventState", "org.apache.commons.math.ode.events.EventState", "getMaxIterationCount", new String[]{}, new String[]{}, false, 4, new String[][]{{"org.apache.commons.math.ode.events.EventState", "evaluateStep", "org.apache.commons.math.ode.sampling.StepInterpolator", "<sample:0>"}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("5", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getConvergence=0.0, getEventTime=NaN, getMaxCheckInterval=-1.0, getMaxIterationCount=5}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput113() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.ode.events.EventState", "org.apache.commons.math.ode.events.EventState", "stepAccepted", new String[]{"double", "double[]"}, new String[]{"0.974", "<sample:6>"}, false, 2, new String[][]{});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getConvergence=Infinity, getEventTime=NaN, getMaxCheckInterval=Infinity, getMaxIterationCount=3}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput114() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.ode.events.EventState", "org.apache.commons.math.ode.events.EventState", "reinitializeBegin", new String[]{"double", "double[]"}, new String[]{"-4.9E-324", "<empty>"}, false, 5, new String[][]{{"org.apache.commons.math.ode.events.EventState", "getEventHandler", ""}}, 1);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getConvergence=1.0, getEventTime=NaN, getMaxCheckInterval=0.0, getMaxIterationCount=6}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput115() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.ode.events.EventState", "org.apache.commons.math.ode.events.EventState", "reset", new String[]{"double", "double[]"}, new String[]{"-0.5", "<sample:0>"}, false, 4, new String[][]{{"org.apache.commons.math.ode.events.EventState", "reinitializeBegin", "double,double[]", "NaN", "<empty>"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getConvergence=0.0, getEventTime=NaN, getMaxCheckInterval=-1.0, getMaxIterationCount=5}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput116() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.ode.events.EventState", "org.apache.commons.math.ode.events.EventState", "stepAccepted", new String[]{"double", "double[]"}, new String[]{"1.7976931348623157E308", "<sample:2>"}, false, 0, new String[][]{{"org.apache.commons.math.ode.events.EventState", "stop", ""}}, 1);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getConvergence=1.0, getEventTime=NaN, getMaxCheckInterval=0.0, getMaxIterationCount=2147483647}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput117() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.ode.events.EventState", "org.apache.commons.math.ode.events.EventState", "reset", new String[]{"double", "double[]"}, new String[]{"-0.45000000000000007", "<sample:2>"}, false, 1, new String[][]{{"org.apache.commons.math.ode.events.EventState", "evaluateStep", "org.apache.commons.math.ode.sampling.StepInterpolator", "<sample:6>"}, {"org.apache.commons.math.ode.events.EventState", "getEventTime", ""}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getConvergence=Infinity, getEventTime=NaN, getMaxCheckInterval=1.0, getMaxIterationCount=2}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput118() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math.ode.events.EventState", "org.apache.commons.math.ode.events.EventState", "getEventHandler", new String[]{}, new String[]{}, false, 1, new String[][]{{"org.apache.commons.math.ode.events.EventState", "reinitializeBegin", "double,double[]", "1.7976931348623157E308", "<sample:1>"}}), new String[][]{{"eventOccurred", "double,double[],boolean", "7"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getConvergence=Infinity, getEventTime=NaN, getMaxCheckInterval=1.0, getMaxIterationCount=2}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput119() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.ode.events.EventState", "org.apache.commons.math.ode.events.EventState", "stop", new String[]{}, new String[]{}, false, 5, new String[][]{{"org.apache.commons.math.ode.events.EventState", "getMaxCheckInterval", ""}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getConvergence=1.0, getEventTime=NaN, getMaxCheckInterval=0.0, getMaxIterationCount=6}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput120() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.ode.events.EventState", "org.apache.commons.math.ode.events.EventState", "getMaxCheckInterval", new String[]{}, new String[]{}, false, 7, new String[][]{{"org.apache.commons.math.ode.events.EventState", "getEventTime", ""}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("Infinity", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getConvergence=Infinity, getEventTime=NaN, getMaxCheckInterval=Infinity, getMaxIterationCount=8}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput121() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.ode.events.EventState", "org.apache.commons.math.ode.events.EventState", "getConvergence", new String[]{}, new String[]{}, false, 2, new String[][]{{"org.apache.commons.math.ode.events.EventState", "getMaxCheckInterval", ""}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("Infinity", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getConvergence=Infinity, getEventTime=NaN, getMaxCheckInterval=Infinity, getMaxIterationCount=3}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput122() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.ode.events.EventState", "org.apache.commons.math.ode.events.EventState", "stepAccepted", new String[]{"double", "double[]"}, new String[]{"NaN", "<sample:0>"}, false, 4, new String[][]{{"org.apache.commons.math.ode.events.EventState", "reset", "double,double[]", "-Infinity", "<sample:1>"}}, 1);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getConvergence=0.0, getEventTime=NaN, getMaxCheckInterval=-1.0, getMaxIterationCount=5}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput123() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.ode.events.EventState", "org.apache.commons.math.ode.events.EventState", "getConvergence", new String[]{}, new String[]{}, false, 0, null, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("1.0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getConvergence=1.0, getEventTime=NaN, getMaxCheckInterval=0.0, getMaxIterationCount=2147483647}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput124() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.ode.events.EventState", "org.apache.commons.math.ode.events.EventState", "reinitializeBegin", new String[]{"double", "double[]"}, new String[]{"Infinity", "<null>"}, false, 3, new String[][]{{"org.apache.commons.math.ode.events.EventState", "getConvergence", ""}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getConvergence=1.0, getEventTime=NaN, getMaxCheckInterval=-Infinity, getMaxIterationCount=4}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput125() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.ode.events.EventState", "org.apache.commons.math.ode.events.EventState", "stop", new String[]{}, new String[]{}, false, 7, new String[][]{{"org.apache.commons.math.ode.events.EventState", "getEventTime", ""}, {"org.apache.commons.math.ode.events.EventState", "evaluateStep", "org.apache.commons.math.ode.sampling.StepInterpolator", "<sample:2>"}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getConvergence=Infinity, getEventTime=NaN, getMaxCheckInterval=Infinity, getMaxIterationCount=8}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput126() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math.ode.events.EventState", "org.apache.commons.math.ode.events.EventState", "evaluateStep", new String[]{"org.apache.commons.math.ode.sampling.StepInterpolator"}, new String[]{"<sample:8>"}, false, 0, new String[][]{{"org.apache.commons.math.ode.events.EventState", "getEventHandler", ""}}, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput127() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.ode.events.EventState", "org.apache.commons.math.ode.events.EventState", "evaluateStep", new String[]{"org.apache.commons.math.ode.sampling.StepInterpolator"}, new String[]{"<sample:0>"}, false, 4, new String[][]{{"org.apache.commons.math.ode.events.EventState", "getEventHandler", ""}, {"org.apache.commons.math.ode.events.EventState", "reinitializeBegin", "double,double[]", "-0.45", "<sample:1>"}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getConvergence=0.0, getEventTime=NaN, getMaxCheckInterval=-1.0, getMaxIterationCount=5}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput128() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.ode.events.EventState", "org.apache.commons.math.ode.events.EventState", "reset", new String[]{"double", "double[]"}, new String[]{"1.0", "<empty>"}, false, 7, new String[][]{});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getConvergence=Infinity, getEventTime=NaN, getMaxCheckInterval=Infinity, getMaxIterationCount=8}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput129() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.ode.events.EventState", "org.apache.commons.math.ode.events.EventState", "stepAccepted", new String[]{"double", "double[]"}, new String[]{"-0.25", "<sample:2>"}, false, 5, new String[][]{{"org.apache.commons.math.ode.events.EventState", "stepAccepted", "double,double[]", "1.7976931348623157E308", "<sample:1>"}}, 2);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getConvergence=1.0, getEventTime=NaN, getMaxCheckInterval=0.0, getMaxIterationCount=6}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput130() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math.ode.events.EventState", "org.apache.commons.math.ode.events.EventState", "getEventHandler", new String[]{}, new String[]{}, false, 5, new String[][]{{"org.apache.commons.math.ode.events.EventState", "reinitializeBegin", "double,double[]", "-1.7976931348623157E308", "<sample:1>"}}, 3), new String[][]{{"resetState", "double,double[]", "2"}});
  assertNotNull(actual);
  assertEquals("receiver state after the call", "{getConvergence=1.0, getEventTime=NaN, getMaxCheckInterval=0.0, getMaxIterationCount=6}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput131() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math.ode.events.EventState", "org.apache.commons.math.ode.events.EventState", "getEventHandler", new String[]{}, new String[]{}, false, 6, new String[][]{{"org.apache.commons.math.ode.events.EventState", "stop", ""}}, 3), new String[][]{{"eventOccurred", "double,double[],boolean", "0"}, {"resetState", "double,double[]", "0"}, {"g", "double,double[]", "0"}});
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("0.0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getConvergence=Infinity, getEventTime=NaN, getMaxCheckInterval=1.0, getMaxIterationCount=7}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput132() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math.ode.events.EventState", "org.apache.commons.math.ode.events.EventState", "getEventHandler", new String[]{}, new String[]{}, false, 0, null, 1), new String[][]{{"resetState", "double,double[]", "0"}});
  assertNotNull(actual);
  assertEquals("receiver state after the call", "{getConvergence=1.0, getEventTime=NaN, getMaxCheckInterval=0.0, getMaxIterationCount=2147483647}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput133() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.ode.events.EventState", "org.apache.commons.math.ode.events.EventState", "stop", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.math.ode.events.EventState", "stop", ""}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getConvergence=1.0, getEventTime=NaN, getMaxCheckInterval=0.0, getMaxIterationCount=2147483647}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput134() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.ode.events.EventState", "org.apache.commons.math.ode.events.EventState", "getMaxIterationCount", new String[]{}, new String[]{}, false, 3, new String[][]{{"org.apache.commons.math.ode.events.EventState", "getEventHandler", ""}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("4", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getConvergence=1.0, getEventTime=NaN, getMaxCheckInterval=-Infinity, getMaxIterationCount=4}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput135() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.ode.events.EventState", "org.apache.commons.math.ode.events.EventState", "stop", new String[]{}, new String[]{}, false, 7, new String[][]{}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getConvergence=Infinity, getEventTime=NaN, getMaxCheckInterval=Infinity, getMaxIterationCount=8}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput136() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.ode.events.EventState", "org.apache.commons.math.ode.events.EventState", "getMaxIterationCount", new String[]{}, new String[]{}, false, 3, new String[][]{{"org.apache.commons.math.ode.events.EventState", "getMaxCheckInterval", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("4", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getConvergence=1.0, getEventTime=NaN, getMaxCheckInterval=-Infinity, getMaxIterationCount=4}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput137() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.ode.events.EventState", "org.apache.commons.math.ode.events.EventState", "stop", new String[]{}, new String[]{}, false, 1, new String[][]{}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getConvergence=Infinity, getEventTime=NaN, getMaxCheckInterval=1.0, getMaxIterationCount=2}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput138() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.ode.events.EventState", "org.apache.commons.math.ode.events.EventState", "evaluateStep", new String[]{"org.apache.commons.math.ode.sampling.StepInterpolator"}, new String[]{"<sample:5>"}, false, 3, new String[][]{{"org.apache.commons.math.ode.events.EventState", "reset", "double,double[]", "-Infinity", "<sample:1>"}, {"org.apache.commons.math.ode.events.EventState", "stepAccepted", "double,double[]", "1.7000000000000002", "<sample:2>"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getConvergence=1.0, getEventTime=NaN, getMaxCheckInterval=-Infinity, getMaxIterationCount=4}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput139() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.ode.events.EventState", "org.apache.commons.math.ode.events.EventState", "evaluateStep", new String[]{"org.apache.commons.math.ode.sampling.StepInterpolator"}, new String[]{"<sample:2>"}, false, 7, new String[][]{{"org.apache.commons.math.ode.events.EventState", "reinitializeBegin", "double,double[]", "-0.45", "<sample:1>"}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getConvergence=Infinity, getEventTime=NaN, getMaxCheckInterval=Infinity, getMaxIterationCount=8}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput140() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.ode.events.EventState", "org.apache.commons.math.ode.events.EventState", "getConvergence", new String[]{}, new String[]{}, false, 7, new String[][]{{"org.apache.commons.math.ode.events.EventState", "evaluateStep", "org.apache.commons.math.ode.sampling.StepInterpolator", "<sample:0>"}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("Infinity", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getConvergence=Infinity, getEventTime=NaN, getMaxCheckInterval=Infinity, getMaxIterationCount=8}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput141() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math.ode.events.EventState", "org.apache.commons.math.ode.events.EventState", "getEventHandler", new String[]{}, new String[]{}, false, 1, new String[][]{{"org.apache.commons.math.ode.events.EventState", "getConvergence", ""}, {"org.apache.commons.math.ode.events.EventState", "evaluateStep", "org.apache.commons.math.ode.sampling.StepInterpolator", "<sample:5>"}}, 3), new String[][]{{"g", "double,double[]", "2"}, {"eventOccurred", "double,double[],boolean", "0"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getConvergence=Infinity, getEventTime=NaN, getMaxCheckInterval=1.0, getMaxIterationCount=2}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput142() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math.ode.events.EventState", "org.apache.commons.math.ode.events.EventState", "getEventHandler", new String[]{}, new String[]{}, false, 2, new String[][]{{"org.apache.commons.math.ode.events.EventState", "getEventTime", ""}}), new String[][]{{"eventOccurred", "double,double[],boolean", "0"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("1", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getConvergence=Infinity, getEventTime=NaN, getMaxCheckInterval=Infinity, getMaxIterationCount=3}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput143() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.ode.events.EventState", "org.apache.commons.math.ode.events.EventState", "getEventTime", new String[]{}, new String[]{}, false, 1, new String[][]{{"org.apache.commons.math.ode.events.EventState", "evaluateStep", "org.apache.commons.math.ode.sampling.StepInterpolator", "<sample:1>"}, {"org.apache.commons.math.ode.events.EventState", "reset", "double,double[]", "1.7976931348623157E308", "<sample:3>"}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("NaN", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getConvergence=Infinity, getEventTime=NaN, getMaxCheckInterval=1.0, getMaxIterationCount=2}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput144() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.ode.events.EventState", "org.apache.commons.math.ode.events.EventState", "getConvergence", new String[]{}, new String[]{}, false, 3, new String[][]{{"org.apache.commons.math.ode.events.EventState", "stepAccepted", "double,double[]", "Infinity", "<null>"}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("1.0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getConvergence=1.0, getEventTime=NaN, getMaxCheckInterval=-Infinity, getMaxIterationCount=4}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput145() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.ode.events.EventState", "org.apache.commons.math.ode.events.EventState", "stop", new String[]{}, new String[]{}, false, 5, new String[][]{{"org.apache.commons.math.ode.events.EventState", "stepAccepted", "double,double[]", "-1.0", "<sample:0>"}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getConvergence=1.0, getEventTime=NaN, getMaxCheckInterval=0.0, getMaxIterationCount=6}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput146() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.ode.events.EventState", "org.apache.commons.math.ode.events.EventState", "getEventTime", new String[]{}, new String[]{}, false, 1, new String[][]{{"org.apache.commons.math.ode.events.EventState", "stop", ""}, {"org.apache.commons.math.ode.events.EventState", "stepAccepted", "double,double[]", "Infinity", "<sample:0>"}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("NaN", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getConvergence=Infinity, getEventTime=NaN, getMaxCheckInterval=1.0, getMaxIterationCount=2}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput147() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.ode.events.EventState", "org.apache.commons.math.ode.events.EventState", "getEventHandler", new String[]{}, new String[]{}, false, 5, new String[][]{}, 1);
  assertNotNull(actual);
  assertEquals("receiver state after the call", "{getConvergence=1.0, getEventTime=NaN, getMaxCheckInterval=0.0, getMaxIterationCount=6}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput148() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.ode.events.EventState", "org.apache.commons.math.ode.events.EventState", "getMaxIterationCount", new String[]{}, new String[]{}, false, 1, new String[][]{{"org.apache.commons.math.ode.events.EventState", "getMaxIterationCount", ""}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("2", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getConvergence=Infinity, getEventTime=NaN, getMaxCheckInterval=1.0, getMaxIterationCount=2}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput149() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.ode.events.EventState", "org.apache.commons.math.ode.events.EventState", "getConvergence", new String[]{}, new String[]{}, false, 3, new String[][]{{"org.apache.commons.math.ode.events.EventState", "getEventHandler", ""}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("1.0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getConvergence=1.0, getEventTime=NaN, getMaxCheckInterval=-Infinity, getMaxIterationCount=4}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput150() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.ode.events.EventState", "org.apache.commons.math.ode.events.EventState", "getMaxCheckInterval", new String[]{}, new String[]{}, false, 1, new String[][]{}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("1.0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getConvergence=Infinity, getEventTime=NaN, getMaxCheckInterval=1.0, getMaxIterationCount=2}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput151() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.ode.events.EventState", "org.apache.commons.math.ode.events.EventState", "getEventTime", new String[]{}, new String[]{}, false, 7, new String[][]{{"org.apache.commons.math.ode.events.EventState", "getEventHandler", ""}, {"org.apache.commons.math.ode.events.EventState", "getEventTime", ""}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("NaN", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getConvergence=Infinity, getEventTime=NaN, getMaxCheckInterval=Infinity, getMaxIterationCount=8}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput152() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.ode.events.EventState", "org.apache.commons.math.ode.events.EventState", "stop", new String[]{}, new String[]{}, false, 4, new String[][]{}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getConvergence=0.0, getEventTime=NaN, getMaxCheckInterval=-1.0, getMaxIterationCount=5}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput153() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.ode.events.EventState", "org.apache.commons.math.ode.events.EventState", "getMaxCheckInterval", new String[]{}, new String[]{}, false, 7, new String[][]{{"org.apache.commons.math.ode.events.EventState", "stop", ""}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("Infinity", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getConvergence=Infinity, getEventTime=NaN, getMaxCheckInterval=Infinity, getMaxIterationCount=8}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput154() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.ode.events.EventState", "org.apache.commons.math.ode.events.EventState", "stepAccepted", new String[]{"double", "double[]"}, new String[]{"0.2", "<sample:1>"}, false, 5, new String[][]{{"org.apache.commons.math.ode.events.EventState", "evaluateStep", "org.apache.commons.math.ode.sampling.StepInterpolator", "<sample:5>"}}, 1);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getConvergence=1.0, getEventTime=NaN, getMaxCheckInterval=0.0, getMaxIterationCount=6}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput155() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.ode.events.EventState", "org.apache.commons.math.ode.events.EventState", "getMaxIterationCount", new String[]{}, new String[]{}, false, 1, new String[][]{{"org.apache.commons.math.ode.events.EventState", "stepAccepted", "double,double[]", "6.550000000000001", "<empty>"}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("2", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getConvergence=Infinity, getEventTime=NaN, getMaxCheckInterval=1.0, getMaxIterationCount=2}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput156() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.ode.events.EventState", "org.apache.commons.math.ode.events.EventState", "reinitializeBegin", new String[]{"double", "double[]"}, new String[]{"-0.22500000000000003", "<sample:5>"}, false, 1, new String[][]{{"org.apache.commons.math.ode.events.EventState", "getMaxIterationCount", ""}, {"org.apache.commons.math.ode.events.EventState", "getEventHandler", ""}}, 2);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getConvergence=Infinity, getEventTime=NaN, getMaxCheckInterval=1.0, getMaxIterationCount=2}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput157() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.ode.events.EventState", "org.apache.commons.math.ode.events.EventState", "getMaxCheckInterval", new String[]{}, new String[]{}, false, 4, new String[][]{{"org.apache.commons.math.ode.events.EventState", "stop", ""}, {"org.apache.commons.math.ode.events.EventState", "evaluateStep", "org.apache.commons.math.ode.sampling.StepInterpolator", "<null>"}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("-1.0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getConvergence=0.0, getEventTime=NaN, getMaxCheckInterval=-1.0, getMaxIterationCount=5}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput158() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.ode.events.EventState", "org.apache.commons.math.ode.events.EventState", "getConvergence", new String[]{}, new String[]{}, false, 7, new String[][]{}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("Infinity", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getConvergence=Infinity, getEventTime=NaN, getMaxCheckInterval=Infinity, getMaxIterationCount=8}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput159() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.ode.events.EventState", "org.apache.commons.math.ode.events.EventState", "reinitializeBegin", new String[]{"double", "double[]"}, new String[]{"0.2", "<sample:2>"}, false, 0, new String[][]{{"org.apache.commons.math.ode.events.EventState", "reinitializeBegin", "double,double[]", "Infinity", "<sample:1>"}}, 3);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getConvergence=1.0, getEventTime=NaN, getMaxCheckInterval=0.0, getMaxIterationCount=2147483647}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput160() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.ode.events.EventState", "org.apache.commons.math.ode.events.EventState", "evaluateStep", new String[]{"org.apache.commons.math.ode.sampling.StepInterpolator"}, new String[]{"<sample:5>"}, false, 0, new String[][]{{"org.apache.commons.math.ode.events.EventState", "reinitializeBegin", "double,double[]", "-Infinity", "<sample:3>"}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getConvergence=1.0, getEventTime=NaN, getMaxCheckInterval=0.0, getMaxIterationCount=2147483647}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput161() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.ode.events.EventState", "org.apache.commons.math.ode.events.EventState", "evaluateStep", new String[]{"org.apache.commons.math.ode.sampling.StepInterpolator"}, new String[]{"<sample:5>"}, false, 7, new String[][]{{"org.apache.commons.math.ode.events.EventState", "stepAccepted", "double,double[]", "-0.387", "<sample:3>"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getConvergence=Infinity, getEventTime=NaN, getMaxCheckInterval=Infinity, getMaxIterationCount=8}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput162() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math.ode.events.EventState", "org.apache.commons.math.ode.events.EventState", "getEventHandler", new String[]{}, new String[]{}, false, 0, null, 1), new String[][]{{"eventOccurred", "double,double[],boolean", "4"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("-1", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getConvergence=1.0, getEventTime=NaN, getMaxCheckInterval=0.0, getMaxIterationCount=2147483647}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput163() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.ode.events.EventState", "org.apache.commons.math.ode.events.EventState", "getMaxIterationCount", new String[]{}, new String[]{}, false, 6, new String[][]{{"org.apache.commons.math.ode.events.EventState", "reinitializeBegin", "double,double[]", "Infinity", "<sample:0>"}, {"org.apache.commons.math.ode.events.EventState", "getMaxCheckInterval", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("7", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getConvergence=Infinity, getEventTime=NaN, getMaxCheckInterval=1.0, getMaxIterationCount=7}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput164() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.ode.events.EventState", "org.apache.commons.math.ode.events.EventState", "getMaxIterationCount", new String[]{}, new String[]{}, false, 5, new String[][]{{"org.apache.commons.math.ode.events.EventState", "stop", ""}, {"org.apache.commons.math.ode.events.EventState", "getMaxIterationCount", ""}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("6", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getConvergence=1.0, getEventTime=NaN, getMaxCheckInterval=0.0, getMaxIterationCount=6}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput165() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.ode.events.EventState", "org.apache.commons.math.ode.events.EventState", "stepAccepted", new String[]{"double", "double[]"}, new String[]{"0.24999999999999997", "<sample:0>"}, false, 1, new String[][]{{"org.apache.commons.math.ode.events.EventState", "reset", "double,double[]", "Infinity", "<null>"}, {"org.apache.commons.math.ode.events.EventState", "getConvergence", ""}}, 2);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getConvergence=Infinity, getEventTime=NaN, getMaxCheckInterval=1.0, getMaxIterationCount=2}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput166() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.ode.events.EventState", "org.apache.commons.math.ode.events.EventState", "getMaxCheckInterval", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.math.ode.events.EventState", "getEventTime", ""}, {"org.apache.commons.math.ode.events.EventState", "stop", ""}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("0.0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getConvergence=1.0, getEventTime=NaN, getMaxCheckInterval=0.0, getMaxIterationCount=2147483647}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput167() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.ode.events.EventState", "org.apache.commons.math.ode.events.EventState", "stop", new String[]{}, new String[]{}, false, 3, new String[][]{{"org.apache.commons.math.ode.events.EventState", "getMaxCheckInterval", ""}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getConvergence=1.0, getEventTime=NaN, getMaxCheckInterval=-Infinity, getMaxIterationCount=4}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput168() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.ode.events.EventState", "org.apache.commons.math.ode.events.EventState", "getEventHandler", new String[]{}, new String[]{}, false, 3, new String[][]{{"org.apache.commons.math.ode.events.EventState", "getConvergence", ""}}, 3);
  assertNotNull(actual);
  assertEquals("receiver state after the call", "{getConvergence=1.0, getEventTime=NaN, getMaxCheckInterval=-Infinity, getMaxIterationCount=4}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput169() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.ode.events.EventState", "org.apache.commons.math.ode.events.EventState", "getEventTime", new String[]{}, new String[]{}, false, 7, new String[][]{}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("NaN", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getConvergence=Infinity, getEventTime=NaN, getMaxCheckInterval=Infinity, getMaxIterationCount=8}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput170() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.ode.events.EventState", "org.apache.commons.math.ode.events.EventState", "getMaxIterationCount", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.math.ode.events.EventState", "getMaxIterationCount", ""}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("2147483647", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getConvergence=1.0, getEventTime=NaN, getMaxCheckInterval=0.0, getMaxIterationCount=2147483647}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput171() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.ode.events.EventState", "org.apache.commons.math.ode.events.EventState", "getMaxIterationCount", new String[]{}, new String[]{}, false, 4, new String[][]{{"org.apache.commons.math.ode.events.EventState", "reset", "double,double[]", "8.988465674311579E307", "<sample:3>"}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("5", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getConvergence=0.0, getEventTime=NaN, getMaxCheckInterval=-1.0, getMaxIterationCount=5}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput172() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.ode.events.EventState", "org.apache.commons.math.ode.events.EventState", "getEventTime", new String[]{}, new String[]{}, false, 3, new String[][]{}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("NaN", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getConvergence=1.0, getEventTime=NaN, getMaxCheckInterval=-Infinity, getMaxIterationCount=4}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput173() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.ode.events.EventState", "org.apache.commons.math.ode.events.EventState", "stop", new String[]{}, new String[]{}, false, 6, new String[][]{{"org.apache.commons.math.ode.events.EventState", "getEventHandler", ""}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getConvergence=Infinity, getEventTime=NaN, getMaxCheckInterval=1.0, getMaxIterationCount=7}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput174() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math.ode.events.EventState", "org.apache.commons.math.ode.events.EventState", "getEventHandler", new String[]{}, new String[]{}, false, 4, new String[][]{}), new String[][]{{"g", "double,double[]", "0"}});
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("-Infinity", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getConvergence=0.0, getEventTime=NaN, getMaxCheckInterval=-1.0, getMaxIterationCount=5}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput175() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math.ode.events.EventState", "org.apache.commons.math.ode.events.EventState", "getEventHandler", new String[]{}, new String[]{}, false, 4, new String[][]{{"org.apache.commons.math.ode.events.EventState", "reinitializeBegin", "double,double[]", "-1.7976931348623157E308", "<sample:2>"}}, 1), new String[][]{{"resetState", "double,double[]", "3"}, {"eventOccurred", "double,double[],boolean", "2"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("2", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getConvergence=0.0, getEventTime=NaN, getMaxCheckInterval=-1.0, getMaxIterationCount=5}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput176() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.ode.events.EventState", "org.apache.commons.math.ode.events.EventState", "stop", new String[]{}, new String[]{}, false, 3, new String[][]{{"org.apache.commons.math.ode.events.EventState", "stop", ""}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getConvergence=1.0, getEventTime=NaN, getMaxCheckInterval=-Infinity, getMaxIterationCount=4}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput177() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.ode.events.EventState", "org.apache.commons.math.ode.events.EventState", "stepAccepted", new String[]{"double", "double[]"}, new String[]{"-4.5", "<sample:1>"}, false, 4, new String[][]{{"org.apache.commons.math.ode.events.EventState", "reset", "double,double[]", "NaN", "<empty>"}, {"org.apache.commons.math.ode.events.EventState", "getMaxCheckInterval", ""}}, 2);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getConvergence=0.0, getEventTime=NaN, getMaxCheckInterval=-1.0, getMaxIterationCount=5}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput178() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math.ode.events.EventState", "org.apache.commons.math.ode.events.EventState", "getEventHandler", new String[]{}, new String[]{}, false, 3, new String[][]{{"org.apache.commons.math.ode.events.EventState", "evaluateStep", "org.apache.commons.math.ode.sampling.StepInterpolator", "<sample:7>"}}, 2), new String[][]{{"g", "double,double[]", "3"}});
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("-1.0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getConvergence=1.0, getEventTime=NaN, getMaxCheckInterval=-Infinity, getMaxIterationCount=4}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput179() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.ode.events.EventState", "org.apache.commons.math.ode.events.EventState", "getMaxCheckInterval", new String[]{}, new String[]{}, false, 5, new String[][]{{"org.apache.commons.math.ode.events.EventState", "reset", "double,double[]", "-0.25", "<sample:2>"}, {"org.apache.commons.math.ode.events.EventState", "getMaxCheckInterval", ""}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("0.0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getConvergence=1.0, getEventTime=NaN, getMaxCheckInterval=0.0, getMaxIterationCount=6}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput180() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.ode.events.EventState", "org.apache.commons.math.ode.events.EventState", "getMaxCheckInterval", new String[]{}, new String[]{}, false, 2, new String[][]{}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("Infinity", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getConvergence=Infinity, getEventTime=NaN, getMaxCheckInterval=Infinity, getMaxIterationCount=3}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput181() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.ode.events.EventState", "org.apache.commons.math.ode.events.EventState", "getConvergence", new String[]{}, new String[]{}, false, 4, new String[][]{}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("0.0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getConvergence=0.0, getEventTime=NaN, getMaxCheckInterval=-1.0, getMaxIterationCount=5}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput182() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.ode.events.EventState", "org.apache.commons.math.ode.events.EventState", "getConvergence", new String[]{}, new String[]{}, false, 5, new String[][]{{"org.apache.commons.math.ode.events.EventState", "getEventHandler", ""}, {"org.apache.commons.math.ode.events.EventState", "stepAccepted", "double,double[]", "-0.45", "<empty>"}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("1.0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getConvergence=1.0, getEventTime=NaN, getMaxCheckInterval=0.0, getMaxIterationCount=6}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput183() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.ode.events.EventState", "org.apache.commons.math.ode.events.EventState", "evaluateStep", new String[]{"org.apache.commons.math.ode.sampling.StepInterpolator"}, new String[]{"<sample:1>"}, false, 1, new String[][]{{"org.apache.commons.math.ode.events.EventState", "reset", "double,double[]", "0.1", "<null>"}, {"org.apache.commons.math.ode.events.EventState", "getMaxIterationCount", ""}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getConvergence=Infinity, getEventTime=NaN, getMaxCheckInterval=1.0, getMaxIterationCount=2}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput184() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.ode.events.EventState", "org.apache.commons.math.ode.events.EventState", "getMaxIterationCount", new String[]{}, new String[]{}, false, 2, new String[][]{{"org.apache.commons.math.ode.events.EventState", "getMaxCheckInterval", ""}, {"org.apache.commons.math.ode.events.EventState", "evaluateStep", "org.apache.commons.math.ode.sampling.StepInterpolator", "<sample:7>"}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("3", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getConvergence=Infinity, getEventTime=NaN, getMaxCheckInterval=Infinity, getMaxIterationCount=3}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput185() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.ode.events.EventState", "org.apache.commons.math.ode.events.EventState", "getConvergence", new String[]{}, new String[]{}, false, 6, new String[][]{}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("Infinity", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getConvergence=Infinity, getEventTime=NaN, getMaxCheckInterval=1.0, getMaxIterationCount=7}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput186() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.ode.events.EventState", "org.apache.commons.math.ode.events.EventState", "getConvergence", new String[]{}, new String[]{}, false, 1, new String[][]{{"org.apache.commons.math.ode.events.EventState", "getEventTime", ""}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("Infinity", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getConvergence=Infinity, getEventTime=NaN, getMaxCheckInterval=1.0, getMaxIterationCount=2}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput187() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.ode.events.EventState", "org.apache.commons.math.ode.events.EventState", "reset", new String[]{"double", "double[]"}, new String[]{"0.2", "<sample:4>"}, false, 7, new String[][]{{"org.apache.commons.math.ode.events.EventState", "reinitializeBegin", "double,double[]", "-0.24999999999999997", "<sample:2>"}, {"org.apache.commons.math.ode.events.EventState", "getConvergence", ""}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getConvergence=Infinity, getEventTime=NaN, getMaxCheckInterval=Infinity, getMaxIterationCount=8}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput188() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.ode.events.EventState", "org.apache.commons.math.ode.events.EventState", "stepAccepted", new String[]{"double", "double[]"}, new String[]{"Infinity", "<sample:0>"}, false, 7, new String[][]{{"org.apache.commons.math.ode.events.EventState", "getEventHandler", ""}}, 1);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getConvergence=Infinity, getEventTime=NaN, getMaxCheckInterval=Infinity, getMaxIterationCount=8}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput189() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.ode.events.EventState", "org.apache.commons.math.ode.events.EventState", "getEventHandler", new String[]{}, new String[]{}, false, 4, new String[][]{}, 2);
  assertNotNull(actual);
  assertEquals("receiver state after the call", "{getConvergence=0.0, getEventTime=NaN, getMaxCheckInterval=-1.0, getMaxIterationCount=5}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput190() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math.ode.events.EventState", "org.apache.commons.math.ode.events.EventState", "getEventHandler", new String[]{}, new String[]{}, false, 5, new String[][]{}, 1), new String[][]{{"g", "double,double[]", "3"}});
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("-1.0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getConvergence=1.0, getEventTime=NaN, getMaxCheckInterval=0.0, getMaxIterationCount=6}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput191() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.ode.events.EventState", "org.apache.commons.math.ode.events.EventState", "reinitializeBegin", new String[]{"double", "double[]"}, new String[]{"-0.25", "<sample:5>"}, false, 0, new String[][]{{"org.apache.commons.math.ode.events.EventState", "evaluateStep", "org.apache.commons.math.ode.sampling.StepInterpolator", "<sample:5>"}, {"org.apache.commons.math.ode.events.EventState", "reset", "double,double[]", "-0.025", "<empty>"}}, 1);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getConvergence=1.0, getEventTime=NaN, getMaxCheckInterval=0.0, getMaxIterationCount=2147483647}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput192() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.ode.events.EventState", "org.apache.commons.math.ode.events.EventState", "getConvergence", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.math.ode.events.EventState", "getEventHandler", ""}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("1.0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getConvergence=1.0, getEventTime=NaN, getMaxCheckInterval=0.0, getMaxIterationCount=2147483647}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput193() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.ode.events.EventState", "org.apache.commons.math.ode.events.EventState", "reinitializeBegin", new String[]{"double", "double[]"}, new String[]{"NaN", "<empty>"}, false, 3, new String[][]{{"org.apache.commons.math.ode.events.EventState", "reset", "double,double[]", "-0.25", "<sample:3>"}}, 1);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getConvergence=1.0, getEventTime=NaN, getMaxCheckInterval=-Infinity, getMaxIterationCount=4}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput194() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.ode.events.EventState", "org.apache.commons.math.ode.events.EventState", "evaluateStep", new String[]{"org.apache.commons.math.ode.sampling.StepInterpolator"}, new String[]{"<sample:5>"}, false, 0, new String[][]{{"org.apache.commons.math.ode.events.EventState", "stepAccepted", "double,double[]", "NaN", "<null>"}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getConvergence=1.0, getEventTime=NaN, getMaxCheckInterval=0.0, getMaxIterationCount=2147483647}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput195() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.ode.events.EventState", "org.apache.commons.math.ode.events.EventState", "stepAccepted", new String[]{"double", "double[]"}, new String[]{"-59.9", "<sample:2>"}, false, 1, new String[][]{{"org.apache.commons.math.ode.events.EventState", "getEventTime", ""}}, 1);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getConvergence=Infinity, getEventTime=NaN, getMaxCheckInterval=1.0, getMaxIterationCount=2}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput196() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.ode.events.EventState", "org.apache.commons.math.ode.events.EventState", "getEventTime", new String[]{}, new String[]{}, false, 5, new String[][]{{"org.apache.commons.math.ode.events.EventState", "getEventTime", ""}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("NaN", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getConvergence=1.0, getEventTime=NaN, getMaxCheckInterval=0.0, getMaxIterationCount=6}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput197() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.ode.events.EventState", "org.apache.commons.math.ode.events.EventState", "getMaxIterationCount", new String[]{}, new String[]{}, false, 3, new String[][]{}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("4", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getConvergence=1.0, getEventTime=NaN, getMaxCheckInterval=-Infinity, getMaxIterationCount=4}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput198() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.ode.events.EventState", "org.apache.commons.math.ode.events.EventState", "getConvergence", new String[]{}, new String[]{}, false, 6, new String[][]{{"org.apache.commons.math.ode.events.EventState", "stop", ""}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("Infinity", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getConvergence=Infinity, getEventTime=NaN, getMaxCheckInterval=1.0, getMaxIterationCount=7}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput199() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.ode.events.EventState", "org.apache.commons.math.ode.events.EventState", "getMaxCheckInterval", new String[]{}, new String[]{}, false, 1, new String[][]{}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("1.0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getConvergence=Infinity, getEventTime=NaN, getMaxCheckInterval=1.0, getMaxIterationCount=2}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput200() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.ode.events.EventState", "org.apache.commons.math.ode.events.EventState", "stop", new String[]{}, new String[]{}, false, 1, new String[][]{{"org.apache.commons.math.ode.events.EventState", "getMaxIterationCount", ""}, {"org.apache.commons.math.ode.events.EventState", "stepAccepted", "double,double[]", "NaN", "<sample:0>"}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getConvergence=Infinity, getEventTime=NaN, getMaxCheckInterval=1.0, getMaxIterationCount=2}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput201() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.ode.events.EventState", "org.apache.commons.math.ode.events.EventState", "getMaxIterationCount", new String[]{}, new String[]{}, false, 1, new String[][]{{"org.apache.commons.math.ode.events.EventState", "reset", "double,double[]", "-1.7976931348623157E308", "<null>"}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("2", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getConvergence=Infinity, getEventTime=NaN, getMaxCheckInterval=1.0, getMaxIterationCount=2}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput202() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.ode.events.EventState", "org.apache.commons.math.ode.events.EventState", "evaluateStep", new String[]{"org.apache.commons.math.ode.sampling.StepInterpolator"}, new String[]{"<sample:1>"}, false, 1, new String[][]{{"org.apache.commons.math.ode.events.EventState", "getEventHandler", ""}, {"org.apache.commons.math.ode.events.EventState", "stop", ""}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getConvergence=Infinity, getEventTime=NaN, getMaxCheckInterval=1.0, getMaxIterationCount=2}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput203() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.ode.events.EventState", "org.apache.commons.math.ode.events.EventState", "getConvergence", new String[]{}, new String[]{}, false, 4, new String[][]{{"org.apache.commons.math.ode.events.EventState", "reset", "double,double[]", "0.5", "<empty>"}, {"org.apache.commons.math.ode.events.EventState", "getMaxIterationCount", ""}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("0.0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getConvergence=0.0, getEventTime=NaN, getMaxCheckInterval=-1.0, getMaxIterationCount=5}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput204() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.ode.events.EventState", "org.apache.commons.math.ode.events.EventState", "evaluateStep", new String[]{"org.apache.commons.math.ode.sampling.StepInterpolator"}, new String[]{"<sample:7>"}, false, 2, new String[][]{{"org.apache.commons.math.ode.events.EventState", "stepAccepted", "double,double[]", "-62.9", "<sample:0>"}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getConvergence=Infinity, getEventTime=NaN, getMaxCheckInterval=Infinity, getMaxIterationCount=3}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput205() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.ode.events.EventState", "org.apache.commons.math.ode.events.EventState", "getEventTime", new String[]{}, new String[]{}, false, 2, new String[][]{{"org.apache.commons.math.ode.events.EventState", "getMaxCheckInterval", ""}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("NaN", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getConvergence=Infinity, getEventTime=NaN, getMaxCheckInterval=Infinity, getMaxIterationCount=3}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput206() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math.ode.events.EventState", "org.apache.commons.math.ode.events.EventState", "getEventHandler", new String[]{}, new String[]{}, false, 2, new String[][]{}, 3), new String[][]{{"eventOccurred", "double,double[],boolean", "0"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("1", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getConvergence=Infinity, getEventTime=NaN, getMaxCheckInterval=Infinity, getMaxIterationCount=3}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput207() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.ode.events.EventState", "org.apache.commons.math.ode.events.EventState", "getEventTime", new String[]{}, new String[]{}, false, 3, new String[][]{}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("NaN", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getConvergence=1.0, getEventTime=NaN, getMaxCheckInterval=-Infinity, getMaxIterationCount=4}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput208() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.ode.events.EventState", "org.apache.commons.math.ode.events.EventState", "reinitializeBegin", new String[]{"double", "double[]"}, new String[]{"-1.0", "<sample:4>"}, false, 1, new String[][]{}, 1);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getConvergence=Infinity, getEventTime=NaN, getMaxCheckInterval=1.0, getMaxIterationCount=2}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput209() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.ode.events.EventState", "org.apache.commons.math.ode.events.EventState", "getEventTime", new String[]{}, new String[]{}, false, 5, new String[][]{}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("NaN", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getConvergence=1.0, getEventTime=NaN, getMaxCheckInterval=0.0, getMaxIterationCount=6}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput210() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.ode.events.EventState", "org.apache.commons.math.ode.events.EventState", "getMaxCheckInterval", new String[]{}, new String[]{}, false, 4, new String[][]{{"org.apache.commons.math.ode.events.EventState", "getEventHandler", ""}, {"org.apache.commons.math.ode.events.EventState", "getMaxIterationCount", ""}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("-1.0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getConvergence=0.0, getEventTime=NaN, getMaxCheckInterval=-1.0, getMaxIterationCount=5}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput211() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.ode.events.EventState", "org.apache.commons.math.ode.events.EventState", "evaluateStep", new String[]{"org.apache.commons.math.ode.sampling.StepInterpolator"}, new String[]{"<sample:5>"}, false, 2, new String[][]{{"org.apache.commons.math.ode.events.EventState", "getEventTime", ""}, {"org.apache.commons.math.ode.events.EventState", "stepAccepted", "double,double[]", "-2.0", "<sample:0>"}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getConvergence=Infinity, getEventTime=NaN, getMaxCheckInterval=Infinity, getMaxIterationCount=3}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput212() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.ode.events.EventState", "org.apache.commons.math.ode.events.EventState", "getConvergence", new String[]{}, new String[]{}, false, 4, new String[][]{}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("0.0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getConvergence=0.0, getEventTime=NaN, getMaxCheckInterval=-1.0, getMaxIterationCount=5}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput213() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.ode.events.EventState", "org.apache.commons.math.ode.events.EventState", "stop", new String[]{}, new String[]{}, false, 2, new String[][]{{"org.apache.commons.math.ode.events.EventState", "stop", ""}, {"org.apache.commons.math.ode.events.EventState", "getEventHandler", ""}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getConvergence=Infinity, getEventTime=NaN, getMaxCheckInterval=Infinity, getMaxIterationCount=3}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput214() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.ode.events.EventState", "org.apache.commons.math.ode.events.EventState", "getMaxIterationCount", new String[]{}, new String[]{}, false, 6, new String[][]{}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("7", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getConvergence=Infinity, getEventTime=NaN, getMaxCheckInterval=1.0, getMaxIterationCount=7}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput215() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.ode.events.EventState", "org.apache.commons.math.ode.events.EventState", "evaluateStep", new String[]{"org.apache.commons.math.ode.sampling.StepInterpolator"}, new String[]{"<sample:1>"}, false, 4, new String[][]{{"org.apache.commons.math.ode.events.EventState", "reinitializeBegin", "double,double[]", "6.3500000000000005", "<sample:2>"}, {"org.apache.commons.math.ode.events.EventState", "evaluateStep", "org.apache.commons.math.ode.sampling.StepInterpolator", "<sample:7>"}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getConvergence=0.0, getEventTime=NaN, getMaxCheckInterval=-1.0, getMaxIterationCount=5}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput216() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math.ode.events.EventState", "org.apache.commons.math.ode.events.EventState", "getEventHandler", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.math.ode.events.EventState", "reinitializeBegin", "double,double[]", "0.0", "<sample:2>"}}, 3), new String[][]{{"g", "double,double[]", "0"}});
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("-1.0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getConvergence=1.0, getEventTime=NaN, getMaxCheckInterval=0.0, getMaxIterationCount=2147483647}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput217() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math.ode.events.EventState", "org.apache.commons.math.ode.events.EventState", "getEventHandler", new String[]{}, new String[]{}, false, 3, new String[][]{{"org.apache.commons.math.ode.events.EventState", "stepAccepted", "double,double[]", "0.1", "<null>"}}, 1), new String[][]{{"resetState", "double,double[]", "0"}, {"g", "double,double[]", "4"}});
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("-1.0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getConvergence=1.0, getEventTime=NaN, getMaxCheckInterval=-Infinity, getMaxIterationCount=4}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput218() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math.ode.events.EventState", "org.apache.commons.math.ode.events.EventState", "getEventHandler", new String[]{}, new String[]{}, false, 4, new String[][]{}, 3), new String[][]{{"eventOccurred", "double,double[],boolean", "0"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("2", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getConvergence=0.0, getEventTime=NaN, getMaxCheckInterval=-1.0, getMaxIterationCount=5}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput219() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.ode.events.EventState", "org.apache.commons.math.ode.events.EventState", "reset", new String[]{"double", "double[]"}, new String[]{"NaN", "<sample:2>"}, false, 6, new String[][]{}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getConvergence=Infinity, getEventTime=NaN, getMaxCheckInterval=1.0, getMaxIterationCount=7}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput220() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.ode.events.EventState", "org.apache.commons.math.ode.events.EventState", "getMaxCheckInterval", new String[]{}, new String[]{}, false, 2, new String[][]{{"org.apache.commons.math.ode.events.EventState", "getMaxIterationCount", ""}, {"org.apache.commons.math.ode.events.EventState", "getMaxCheckInterval", ""}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("Infinity", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getConvergence=Infinity, getEventTime=NaN, getMaxCheckInterval=Infinity, getMaxIterationCount=3}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput221() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.ode.events.EventState", "org.apache.commons.math.ode.events.EventState", "getMaxIterationCount", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.math.ode.events.EventState", "getEventHandler", ""}, {"org.apache.commons.math.ode.events.EventState", "getMaxCheckInterval", ""}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("2147483647", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getConvergence=1.0, getEventTime=NaN, getMaxCheckInterval=0.0, getMaxIterationCount=2147483647}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput222() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.ode.events.EventState", "org.apache.commons.math.ode.events.EventState", "getMaxIterationCount", new String[]{}, new String[]{}, false, 7, new String[][]{{"org.apache.commons.math.ode.events.EventState", "getMaxCheckInterval", ""}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("8", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getConvergence=Infinity, getEventTime=NaN, getMaxCheckInterval=Infinity, getMaxIterationCount=8}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput223() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.ode.events.EventState", "org.apache.commons.math.ode.events.EventState", "getEventTime", new String[]{}, new String[]{}, false, 6, new String[][]{{"org.apache.commons.math.ode.events.EventState", "reset", "double,double[]", "2.0", "<sample:1>"}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("NaN", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getConvergence=Infinity, getEventTime=NaN, getMaxCheckInterval=1.0, getMaxIterationCount=7}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput224() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.ode.events.EventState", "org.apache.commons.math.ode.events.EventState", "getMaxCheckInterval", new String[]{}, new String[]{}, false, 3, new String[][]{{"org.apache.commons.math.ode.events.EventState", "getEventHandler", ""}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("-Infinity", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getConvergence=1.0, getEventTime=NaN, getMaxCheckInterval=-Infinity, getMaxIterationCount=4}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput225() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.ode.events.EventState", "org.apache.commons.math.ode.events.EventState", "getMaxCheckInterval", new String[]{}, new String[]{}, false, 3, new String[][]{{"org.apache.commons.math.ode.events.EventState", "stepAccepted", "double,double[]", "Infinity", "<sample:0>"}, {"org.apache.commons.math.ode.events.EventState", "getMaxCheckInterval", ""}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("-Infinity", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getConvergence=1.0, getEventTime=NaN, getMaxCheckInterval=-Infinity, getMaxIterationCount=4}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput226() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.ode.events.EventState", "org.apache.commons.math.ode.events.EventState", "getMaxIterationCount", new String[]{}, new String[]{}, false, 6, new String[][]{{"org.apache.commons.math.ode.events.EventState", "getMaxCheckInterval", ""}, {"org.apache.commons.math.ode.events.EventState", "getConvergence", ""}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("7", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getConvergence=Infinity, getEventTime=NaN, getMaxCheckInterval=1.0, getMaxIterationCount=7}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput227() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math.ode.events.EventState", "org.apache.commons.math.ode.events.EventState", "getEventHandler", new String[]{}, new String[]{}, false, 3, new String[][]{{"org.apache.commons.math.ode.events.EventState", "reset", "double,double[]", "NaN", "<sample:2>"}}, 2), new String[][]{{"eventOccurred", "double,double[],boolean", "4"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("-1", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getConvergence=1.0, getEventTime=NaN, getMaxCheckInterval=-Infinity, getMaxIterationCount=4}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput228() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.ode.events.EventState", "org.apache.commons.math.ode.events.EventState", "evaluateStep", new String[]{"org.apache.commons.math.ode.sampling.StepInterpolator"}, new String[]{"<sample:0>"}, false, 2, new String[][]{{"org.apache.commons.math.ode.events.EventState", "evaluateStep", "org.apache.commons.math.ode.sampling.StepInterpolator", "<sample:2>"}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getConvergence=Infinity, getEventTime=NaN, getMaxCheckInterval=Infinity, getMaxIterationCount=3}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput229() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.ode.events.EventState", "org.apache.commons.math.ode.events.EventState", "reset", new String[]{"double", "double[]"}, new String[]{"0.1", "<sample:0>"}, false, 1, new String[][]{}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getConvergence=Infinity, getEventTime=NaN, getMaxCheckInterval=1.0, getMaxIterationCount=2}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput230() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.ode.events.EventState", "org.apache.commons.math.ode.events.EventState", "getMaxIterationCount", new String[]{}, new String[]{}, false, 3, new String[][]{{"org.apache.commons.math.ode.events.EventState", "getMaxIterationCount", ""}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("4", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getConvergence=1.0, getEventTime=NaN, getMaxCheckInterval=-Infinity, getMaxIterationCount=4}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput231() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math.ode.events.EventState", "org.apache.commons.math.ode.events.EventState", "getEventHandler", new String[]{}, new String[]{}, false, 2, new String[][]{}, 2), new String[][]{{"eventOccurred", "double,double[],boolean", "1"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("1", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getConvergence=Infinity, getEventTime=NaN, getMaxCheckInterval=Infinity, getMaxIterationCount=3}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput232() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.ode.events.EventState", "org.apache.commons.math.ode.events.EventState", "getMaxIterationCount", new String[]{}, new String[]{}, false, 7, new String[][]{{"org.apache.commons.math.ode.events.EventState", "getEventHandler", ""}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("8", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getConvergence=Infinity, getEventTime=NaN, getMaxCheckInterval=Infinity, getMaxIterationCount=8}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput233() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math.ode.events.EventState", "org.apache.commons.math.ode.events.EventState", "getEventHandler", new String[]{}, new String[]{}, false, 2, new String[][]{}, 2), new String[][]{{"g", "double,double[]", "0"}});
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("1.0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getConvergence=Infinity, getEventTime=NaN, getMaxCheckInterval=Infinity, getMaxIterationCount=3}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput234() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.ode.events.EventState", "org.apache.commons.math.ode.events.EventState", "getMaxCheckInterval", new String[]{}, new String[]{}, false, 4, new String[][]{}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("-1.0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getConvergence=0.0, getEventTime=NaN, getMaxCheckInterval=-1.0, getMaxIterationCount=5}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput235() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.ode.events.EventState", "org.apache.commons.math.ode.events.EventState", "reinitializeBegin", new String[]{"double", "double[]"}, new String[]{"-2.7750000000000004", "<empty>"}, false, 3, new String[][]{{"org.apache.commons.math.ode.events.EventState", "evaluateStep", "org.apache.commons.math.ode.sampling.StepInterpolator", "<sample:2>"}}, 3);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getConvergence=1.0, getEventTime=NaN, getMaxCheckInterval=-Infinity, getMaxIterationCount=4}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput236() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.ode.events.EventState", "org.apache.commons.math.ode.events.EventState", "reinitializeBegin", new String[]{"double", "double[]"}, new String[]{"0.0", "<sample:4>"}, false, 5, new String[][]{{"org.apache.commons.math.ode.events.EventState", "evaluateStep", "org.apache.commons.math.ode.sampling.StepInterpolator", "<sample:0>"}, {"org.apache.commons.math.ode.events.EventState", "stepAccepted", "double,double[]", "0.2", "<null>"}}, 3);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getConvergence=1.0, getEventTime=NaN, getMaxCheckInterval=0.0, getMaxIterationCount=6}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput237() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math.ode.events.EventState", "org.apache.commons.math.ode.events.EventState", "getEventHandler", new String[]{}, new String[]{}, false, 1, new String[][]{{"org.apache.commons.math.ode.events.EventState", "reset", "double,double[]", "Infinity", "<sample:1>"}}, 2), new String[][]{{"resetState", "double,double[]", "1"}, {"g", "double,double[]", "0"}});
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("0.0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getConvergence=Infinity, getEventTime=NaN, getMaxCheckInterval=1.0, getMaxIterationCount=2}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput238() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.ode.events.EventState", "org.apache.commons.math.ode.events.EventState", "getMaxCheckInterval", new String[]{}, new String[]{}, false, 6, new String[][]{{"org.apache.commons.math.ode.events.EventState", "getMaxIterationCount", ""}, {"org.apache.commons.math.ode.events.EventState", "stepAccepted", "double,double[]", "0.2", "<sample:1>"}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("1.0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getConvergence=Infinity, getEventTime=NaN, getMaxCheckInterval=1.0, getMaxIterationCount=7}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput239() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.ode.events.EventState", "org.apache.commons.math.ode.events.EventState", "getEventHandler", new String[]{}, new String[]{}, false, 7, new String[][]{{"org.apache.commons.math.ode.events.EventState", "stepAccepted", "double,double[]", "-8.988465674311579E307", "<sample:3>"}, {"org.apache.commons.math.ode.events.EventState", "reset", "double,double[]", "-Infinity", "<sample:3>"}}, 2);
  assertNotNull(actual);
  assertEquals("receiver state after the call", "{getConvergence=Infinity, getEventTime=NaN, getMaxCheckInterval=Infinity, getMaxIterationCount=8}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput240() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.ode.events.EventState", "org.apache.commons.math.ode.events.EventState", "getConvergence", new String[]{}, new String[]{}, false, 2, new String[][]{{"org.apache.commons.math.ode.events.EventState", "getEventTime", ""}, {"org.apache.commons.math.ode.events.EventState", "getMaxCheckInterval", ""}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("Infinity", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getConvergence=Infinity, getEventTime=NaN, getMaxCheckInterval=Infinity, getMaxIterationCount=3}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput241() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.ode.events.EventState", "org.apache.commons.math.ode.events.EventState", "reinitializeBegin", new String[]{"double", "double[]"}, new String[]{"-0.25", "<sample:2>"}, false, 7, new String[][]{{"org.apache.commons.math.ode.events.EventState", "getEventHandler", ""}, {"org.apache.commons.math.ode.events.EventState", "stop", ""}}, 3);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getConvergence=Infinity, getEventTime=NaN, getMaxCheckInterval=Infinity, getMaxIterationCount=8}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput242() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.ode.events.EventState", "org.apache.commons.math.ode.events.EventState", "reset", new String[]{"double", "double[]"}, new String[]{"0.20000000000000004", "<null>"}, false, 3, new String[][]{{"org.apache.commons.math.ode.events.EventState", "getEventTime", ""}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getConvergence=1.0, getEventTime=NaN, getMaxCheckInterval=-Infinity, getMaxIterationCount=4}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput243() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.ode.events.EventState", "org.apache.commons.math.ode.events.EventState", "getMaxIterationCount", new String[]{}, new String[]{}, false, 7, new String[][]{{"org.apache.commons.math.ode.events.EventState", "reinitializeBegin", "double,double[]", "-8.988465674311579E307", "<sample:0>"}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("8", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getConvergence=Infinity, getEventTime=NaN, getMaxCheckInterval=Infinity, getMaxIterationCount=8}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput244() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.ode.events.EventState", "org.apache.commons.math.ode.events.EventState", "reset", new String[]{"double", "double[]"}, new String[]{"-2.0", "<sample:1>"}, false, 5, new String[][]{{"org.apache.commons.math.ode.events.EventState", "reset", "double,double[]", "Infinity", "<sample:0>"}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getConvergence=1.0, getEventTime=NaN, getMaxCheckInterval=0.0, getMaxIterationCount=6}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput245() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.ode.events.EventState", "org.apache.commons.math.ode.events.EventState", "reset", new String[]{"double", "double[]"}, new String[]{"-0.004", "<sample:4>"}, false, 3, new String[][]{{"org.apache.commons.math.ode.events.EventState", "getEventTime", ""}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getConvergence=1.0, getEventTime=NaN, getMaxCheckInterval=-Infinity, getMaxIterationCount=4}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput246() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.ode.events.EventState", "org.apache.commons.math.ode.events.EventState", "getConvergence", new String[]{}, new String[]{}, false, 7, new String[][]{{"org.apache.commons.math.ode.events.EventState", "getMaxCheckInterval", ""}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("Infinity", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getConvergence=Infinity, getEventTime=NaN, getMaxCheckInterval=Infinity, getMaxIterationCount=8}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput247() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math.ode.events.EventState", "org.apache.commons.math.ode.events.EventState", "getEventHandler", new String[]{}, new String[]{}, false, 6, new String[][]{{"org.apache.commons.math.ode.events.EventState", "reinitializeBegin", "double,double[]", "-1.7976931348623155E308", "<sample:4>"}}, 1), new String[][]{{"g", "double,double[]", "1"}, {"eventOccurred", "double,double[],boolean", "6"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("4", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getConvergence=Infinity, getEventTime=NaN, getMaxCheckInterval=1.0, getMaxIterationCount=7}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput248() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.ode.events.EventState", "org.apache.commons.math.ode.events.EventState", "getMaxIterationCount", new String[]{}, new String[]{}, false, 4, new String[][]{{"org.apache.commons.math.ode.events.EventState", "getEventHandler", ""}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("5", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getConvergence=0.0, getEventTime=NaN, getMaxCheckInterval=-1.0, getMaxIterationCount=5}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput249() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.ode.events.EventState", "org.apache.commons.math.ode.events.EventState", "reset", new String[]{"double", "double[]"}, new String[]{"0.09999999999999999", "<sample:0>"}, false, 5, new String[][]{{"org.apache.commons.math.ode.events.EventState", "reinitializeBegin", "double,double[]", "-0.12499999999999999", "<sample:3>"}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getConvergence=1.0, getEventTime=NaN, getMaxCheckInterval=0.0, getMaxIterationCount=6}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput250() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.ode.events.EventState", "org.apache.commons.math.ode.events.EventState", "getMaxIterationCount", new String[]{}, new String[]{}, false, 5, new String[][]{{"org.apache.commons.math.ode.events.EventState", "stepAccepted", "double,double[]", "-0.18", "<empty>"}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("6", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getConvergence=1.0, getEventTime=NaN, getMaxCheckInterval=0.0, getMaxIterationCount=6}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput251() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.ode.events.EventState", "org.apache.commons.math.ode.events.EventState", "getMaxIterationCount", new String[]{}, new String[]{}, false, 2, new String[][]{{"org.apache.commons.math.ode.events.EventState", "stepAccepted", "double,double[]", "Infinity", "<sample:4>"}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("3", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getConvergence=Infinity, getEventTime=NaN, getMaxCheckInterval=Infinity, getMaxIterationCount=3}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput252() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.ode.events.EventState", "org.apache.commons.math.ode.events.EventState", "reinitializeBegin", new String[]{"double", "double[]"}, new String[]{"-0.2", "<sample:3>"}, false, 3, new String[][]{{"org.apache.commons.math.ode.events.EventState", "getEventTime", ""}, {"org.apache.commons.math.ode.events.EventState", "getConvergence", ""}}, 2);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getConvergence=1.0, getEventTime=NaN, getMaxCheckInterval=-Infinity, getMaxIterationCount=4}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput253() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.ode.events.EventState", "org.apache.commons.math.ode.events.EventState", "reset", new String[]{"double", "double[]"}, new String[]{"-0.1", "<sample:0>"}, false, 2, new String[][]{{"org.apache.commons.math.ode.events.EventState", "stepAccepted", "double,double[]", "-8.988465674311579E307", "<sample:2>"}, {"org.apache.commons.math.ode.events.EventState", "getEventTime", ""}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getConvergence=Infinity, getEventTime=NaN, getMaxCheckInterval=Infinity, getMaxIterationCount=3}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput254() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math.ode.events.EventState", "org.apache.commons.math.ode.events.EventState", "getEventHandler", new String[]{}, new String[]{}, false, 1, new String[][]{}, 1), new String[][]{{"g", "double,double[]", "3"}});
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("0.0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getConvergence=Infinity, getEventTime=NaN, getMaxCheckInterval=1.0, getMaxIterationCount=2}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput255() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.ode.events.EventState", "org.apache.commons.math.ode.events.EventState", "evaluateStep", new String[]{"org.apache.commons.math.ode.sampling.StepInterpolator"}, new String[]{"<sample:0>"}, false, 6, new String[][]{{"org.apache.commons.math.ode.events.EventState", "evaluateStep", "org.apache.commons.math.ode.sampling.StepInterpolator", "<sample:8>"}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getConvergence=Infinity, getEventTime=NaN, getMaxCheckInterval=1.0, getMaxIterationCount=7}", SearchInputFactory_scaffolding.receiverState());
 }
}
