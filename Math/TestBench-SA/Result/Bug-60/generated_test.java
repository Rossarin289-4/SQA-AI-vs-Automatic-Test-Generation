package generated.algorithm;

import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;
import static org.junit.Assert.*;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class SimulatedAnnealingGeneratedTest {
 @Test(timeout = 20000)
 public void generatedInput000() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.distribution.NormalDistributionImpl", "org.apache.commons.math.distribution.NormalDistributionImpl", "getDomainLowerBound", new String[]{"double"}, new String[]{"2.0"}, false, 0, new String[][]{{"org.apache.commons.math.distribution.NormalDistributionImpl", "cumulativeProbability", "double", "2.0"}});
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("0.0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getMean=0.0, getStandardDeviation=1.0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput001() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.distribution.NormalDistributionImpl", "org.apache.commons.math.distribution.NormalDistributionImpl", "getDomainLowerBound", new String[]{"double"}, new String[]{"2.0"}, false, 2, new String[][]{{"org.apache.commons.math.distribution.NormalDistributionImpl", "cumulativeProbability", "double", "2.0"}});
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("1.0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getMean=1.0, getStandardDeviation=Infinity}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput002() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.distribution.NormalDistributionImpl", "org.apache.commons.math.distribution.NormalDistributionImpl", "getDomainLowerBound", new String[]{"double"}, new String[]{"-15.0"}, false, 0, new String[][]{{"org.apache.commons.math.distribution.NormalDistributionImpl", "cumulativeProbability", "double", "2.0"}});
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("-1.7976931348623157E308", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getMean=0.0, getStandardDeviation=1.0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput003() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math.distribution.NormalDistributionImpl", "org.apache.commons.math.distribution.NormalDistributionImpl", "sample", new String[]{"int"}, new String[]{"-1"}, false, 0, new String[][]{{"org.apache.commons.math.distribution.NormalDistributionImpl", "getDomainUpperBound", "double", "1.0E-9"}, {"org.apache.commons.math.distribution.NormalDistributionImpl", "getMean", ""}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("org.apache.commons.math.exception.NotStrictlyPositiveException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput004() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math.distribution.NormalDistributionImpl", "org.apache.commons.math.distribution.NormalDistributionImpl", "sample", new String[]{"int"}, new String[]{"0"}, false, 13, new String[][]{{"org.apache.commons.math.distribution.NormalDistributionImpl", "cumulativeProbability", "double", "Infinity"}, {"org.apache.commons.math.distribution.NormalDistributionImpl", "getDomainUpperBound", "double", "1.0E-10"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("org.apache.commons.math.exception.NotStrictlyPositiveException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput005() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math.distribution.NormalDistributionImpl", "org.apache.commons.math.distribution.NormalDistributionImpl", "inverseCumulativeProbability", new String[]{"double"}, new String[]{"40.0"}, false, 0, new String[][]{{"org.apache.commons.math.distribution.NormalDistributionImpl", "inverseCumulativeProbability", "double", "-0.5"}, {"org.apache.commons.math.distribution.NormalDistributionImpl", "getSolverAbsoluteAccuracy", ""}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("org.apache.commons.math.exception.OutOfRangeException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput006() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.distribution.NormalDistributionImpl", "org.apache.commons.math.distribution.NormalDistributionImpl", "inverseCumulativeProbability", new String[]{"double"}, new String[]{"0.06523"}, false, 0, new String[][]{{"org.apache.commons.math.distribution.NormalDistributionImpl", "cumulativeProbability", "double", "-15.0"}, {"org.apache.commons.math.distribution.NormalDistributionImpl", "inverseCumulativeProbability", "double", "-0.5"}, {"org.apache.commons.math.distribution.NormalDistributionImpl", "getSolverAbsoluteAccuracy", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("-1.5122904085552373", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getMean=0.0, getStandardDeviation=1.0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput007() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math.distribution.NormalDistributionImpl", "org.apache.commons.math.distribution.NormalDistributionImpl", "inverseCumulativeProbability", new String[]{"double"}, new String[]{"0.06523"}, false, 2, new String[][]{{"org.apache.commons.math.distribution.NormalDistributionImpl", "cumulativeProbability", "double", "-15.0"}, {"org.apache.commons.math.distribution.NormalDistributionImpl", "inverseCumulativeProbability", "double", "-0.5"}, {"org.apache.commons.math.distribution.NormalDistributionImpl", "getSolverAbsoluteAccuracy", ""}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("org.apache.commons.math.MathException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput008() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math.distribution.NormalDistributionImpl", "org.apache.commons.math.distribution.NormalDistributionImpl", "inverseCumulativeProbability", new String[]{"double"}, new String[]{"0.6523"}, false, 2, new String[][]{{"org.apache.commons.math.distribution.NormalDistributionImpl", "cumulativeProbability", "double", "-15.0"}, {"org.apache.commons.math.distribution.NormalDistributionImpl", "inverseCumulativeProbability", "double", "-0.5"}, {"org.apache.commons.math.distribution.NormalDistributionImpl", "getSolverAbsoluteAccuracy", ""}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("org.apache.commons.math.MathException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput009() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.distribution.NormalDistributionImpl", "org.apache.commons.math.distribution.NormalDistributionImpl", "getDomainLowerBound", new String[]{"double"}, new String[]{"0.0"}, false, 0, null, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("-1.7976931348623157E308", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getMean=0.0, getStandardDeviation=1.0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput010() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.distribution.NormalDistributionImpl", "org.apache.commons.math.distribution.NormalDistributionImpl", "getDomainLowerBound", new String[]{"double"}, new String[]{"2.6"}, false, 0, null, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("0.0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getMean=0.0, getStandardDeviation=1.0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput011() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.distribution.NormalDistributionImpl", "org.apache.commons.math.distribution.NormalDistributionImpl", "cumulativeProbability", new String[]{"double", "double"}, new String[]{"1.0E-9", "0.5"}, false, 0, null, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("0.19146246087507068", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getMean=0.0, getStandardDeviation=1.0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput012() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.distribution.NormalDistributionImpl", "org.apache.commons.math.distribution.NormalDistributionImpl", "cumulativeProbability", new String[]{"double", "double"}, new String[]{"-0.199999999", "0.5"}, false, 0, null, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("0.27072217032207335", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getMean=0.0, getStandardDeviation=1.0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput013() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.distribution.NormalDistributionImpl", "org.apache.commons.math.distribution.NormalDistributionImpl", "cumulativeProbability", new String[]{"double", "double"}, new String[]{"-0.199999999", "0.5"}, false);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("0.27072217032207335", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getMean=0.0, getStandardDeviation=1.0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput014() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.distribution.NormalDistributionImpl", "org.apache.commons.math.distribution.NormalDistributionImpl", "cumulativeProbability", new String[]{"double", "double"}, new String[]{"-0.199999999", "0.552"}, false);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("0.2887855324129137", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getMean=0.0, getStandardDeviation=1.0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput015() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.distribution.NormalDistributionImpl", "org.apache.commons.math.distribution.NormalDistributionImpl", "cumulativeProbability", new String[]{"double", "double"}, new String[]{"0.199999999", "0.5520000000000002"}, false);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("0.13026611431679302", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getMean=0.0, getStandardDeviation=1.0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput016() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.distribution.NormalDistributionImpl", "org.apache.commons.math.distribution.NormalDistributionImpl", "cumulativeProbability", new String[]{"double", "double"}, new String[]{"-4.700000001", "0.5520000000000002"}, false);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("0.7095245225574058", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getMean=0.0, getStandardDeviation=1.0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput017() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.distribution.NormalDistributionImpl", "org.apache.commons.math.distribution.NormalDistributionImpl", "reseedRandomGenerator", new String[]{"long"}, new String[]{"0"}, false);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getMean=0.0, getStandardDeviation=1.0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput018() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.distribution.NormalDistributionImpl", "org.apache.commons.math.distribution.NormalDistributionImpl", "reseedRandomGenerator", new String[]{"long"}, new String[]{"4294769763817153394"}, false, 2, new String[][]{});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getMean=1.0, getStandardDeviation=Infinity}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput019() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.distribution.NormalDistributionImpl", "org.apache.commons.math.distribution.NormalDistributionImpl", "reseedRandomGenerator", new String[]{"long"}, new String[]{"4294769763817153394"}, false, 2, new String[][]{}, 2);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getMean=1.0, getStandardDeviation=Infinity}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput020() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.distribution.NormalDistributionImpl", "org.apache.commons.math.distribution.NormalDistributionImpl", "reseedRandomGenerator", new String[]{"long"}, new String[]{"1073727624252635244"}, false, 4, new String[][]{{"org.apache.commons.math.distribution.NormalDistributionImpl", "getInitialDomain", "double", "12.566370614359172"}, {"org.apache.commons.math.distribution.NormalDistributionImpl", "getInitialDomain", "double", "0.6283185307179586"}}, 2);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getMean=0.0, getStandardDeviation=1.0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput021() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.distribution.NormalDistributionImpl", "org.apache.commons.math.distribution.NormalDistributionImpl", "getDomainUpperBound", new String[]{"double"}, new String[]{"2.0"}, false, 0, new String[][]{{"org.apache.commons.math.distribution.NormalDistributionImpl", "cumulativeProbability", "double", "1.7976931348623157E308"}});
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("1.7976931348623157E308", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getMean=0.0, getStandardDeviation=1.0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput022() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.distribution.NormalDistributionImpl", "org.apache.commons.math.distribution.NormalDistributionImpl", "getDomainUpperBound", new String[]{"double"}, new String[]{"-2.0"}, false, 0, new String[][]{{"org.apache.commons.math.distribution.NormalDistributionImpl", "cumulativeProbability", "double", "2.0"}});
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("0.0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getMean=0.0, getStandardDeviation=1.0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput023() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.distribution.NormalDistributionImpl", "org.apache.commons.math.distribution.NormalDistributionImpl", "getDomainUpperBound", new String[]{"double"}, new String[]{"-8600.0"}, false, 0, null, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("0.0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getMean=0.0, getStandardDeviation=1.0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput024() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.distribution.NormalDistributionImpl", "org.apache.commons.math.distribution.NormalDistributionImpl", "getDomainUpperBound", new String[]{"double"}, new String[]{"2.0"}, false, 0, null, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("1.7976931348623157E308", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getMean=0.0, getStandardDeviation=1.0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput025() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.distribution.NormalDistributionImpl", "org.apache.commons.math.distribution.NormalDistributionImpl", "cumulativeProbability", new String[]{"double", "double"}, new String[]{"1.0E-10", "1.0E-9"}, false);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("3.5904812456521995E-10", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getMean=0.0, getStandardDeviation=1.0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput026() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.distribution.NormalDistributionImpl", "org.apache.commons.math.distribution.NormalDistributionImpl", "cumulativeProbability", new String[]{"double", "double"}, new String[]{"1.0E-10", "1.0E-9"}, false, 0, null, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("3.5904812456521995E-10", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getMean=0.0, getStandardDeviation=1.0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput027() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.distribution.NormalDistributionImpl", "org.apache.commons.math.distribution.NormalDistributionImpl", "cumulativeProbability", new String[]{"double", "double"}, new String[]{"0.0", "1.0E-9"}, false, 0, new String[][]{{"org.apache.commons.math.distribution.NormalDistributionImpl", "inverseCumulativeProbability", "double", "0.6523"}, {"org.apache.commons.math.distribution.NormalDistributionImpl", "cumulativeProbability", "double,double", "-15.0", "-1.0"}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("3.98942323620588E-10", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getMean=0.0, getStandardDeviation=1.0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput028() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.distribution.NormalDistributionImpl", "org.apache.commons.math.distribution.NormalDistributionImpl", "cumulativeProbability", new String[]{"double", "double"}, new String[]{"0.0", "1.0E-9"}, false, 15, new String[][]{{"org.apache.commons.math.distribution.NormalDistributionImpl", "inverseCumulativeProbability", "double", "1.3046"}, {"org.apache.commons.math.distribution.NormalDistributionImpl", "cumulativeProbability", "double,double", "-15.0", "-1.0"}});
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("3.98942323620588E-10", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getMean=0.0, getStandardDeviation=1.0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput029() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.distribution.NormalDistributionImpl", "org.apache.commons.math.distribution.NormalDistributionImpl", "cumulativeProbability", new String[]{"double", "double"}, new String[]{"0.0", "1.0E-8"}, false, 15, new String[][]{{"org.apache.commons.math.distribution.NormalDistributionImpl", "inverseCumulativeProbability", "double", "1.3046"}, {"org.apache.commons.math.distribution.NormalDistributionImpl", "cumulativeProbability", "double,double", "-15.0", "-1.0"}});
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("3.98942279211667E-9", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getMean=0.0, getStandardDeviation=1.0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput030() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.distribution.NormalDistributionImpl", "org.apache.commons.math.distribution.NormalDistributionImpl", "getStandardDeviation", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.math.distribution.NormalDistributionImpl", "sample", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("1.0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getMean=0.0, getStandardDeviation=1.0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput031() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.distribution.NormalDistributionImpl", "org.apache.commons.math.distribution.NormalDistributionImpl", "getInitialDomain", new String[]{"double"}, new String[]{"1.0"}, false, 0, new String[][]{{"org.apache.commons.math.distribution.NormalDistributionImpl", "sample", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("1.0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getMean=0.0, getStandardDeviation=1.0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput032() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.distribution.NormalDistributionImpl", "org.apache.commons.math.distribution.NormalDistributionImpl", "getInitialDomain", new String[]{"double"}, new String[]{"0.1"}, false, 0, new String[][]{{"org.apache.commons.math.distribution.NormalDistributionImpl", "sample", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("-1.0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getMean=0.0, getStandardDeviation=1.0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput033() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.distribution.NormalDistributionImpl", "org.apache.commons.math.distribution.NormalDistributionImpl", "getInitialDomain", new String[]{"double"}, new String[]{"1.0"}, false, 0, new String[][]{{"org.apache.commons.math.distribution.NormalDistributionImpl", "density", "double", "0.0"}, {"org.apache.commons.math.distribution.NormalDistributionImpl", "sample", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("1.0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getMean=0.0, getStandardDeviation=1.0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput034() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.distribution.NormalDistributionImpl", "org.apache.commons.math.distribution.NormalDistributionImpl", "getInitialDomain", new String[]{"double"}, new String[]{"1.0"}, false, 0, new String[][]{{"org.apache.commons.math.distribution.NormalDistributionImpl", "density", "double", "0.0"}, {"org.apache.commons.math.distribution.NormalDistributionImpl", "sample", ""}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("1.0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getMean=0.0, getStandardDeviation=1.0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput035() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.distribution.NormalDistributionImpl", "org.apache.commons.math.distribution.NormalDistributionImpl", "getInitialDomain", new String[]{"double"}, new String[]{"Infinity"}, false, 0, new String[][]{{"org.apache.commons.math.distribution.NormalDistributionImpl", "reseedRandomGenerator", "long", "41"}});
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("1.0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getMean=0.0, getStandardDeviation=1.0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput036() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.distribution.NormalDistributionImpl", "org.apache.commons.math.distribution.NormalDistributionImpl", "cumulativeProbability", new String[]{"double", "double"}, new String[]{"-0.5", "40.0"}, false);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("0.691462461274013", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getMean=0.0, getStandardDeviation=1.0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput037() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.distribution.NormalDistributionImpl", "org.apache.commons.math.distribution.NormalDistributionImpl", "getSolverAbsoluteAccuracy", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.math.distribution.NormalDistributionImpl", "getDomainUpperBound", "double", "0.0"}});
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("1.0E-9", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getMean=0.0, getStandardDeviation=1.0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput038() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.distribution.NormalDistributionImpl", "org.apache.commons.math.distribution.NormalDistributionImpl", "density", new String[]{"double"}, new String[]{"Infinity"}, false, 3, new String[][]{{"org.apache.commons.math.distribution.NormalDistributionImpl", "getMean", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("0.0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getMean=0.0, getStandardDeviation=1.0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput039() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.distribution.NormalDistributionImpl", "org.apache.commons.math.distribution.NormalDistributionImpl", "density", new String[]{"double"}, new String[]{"Infinity"}, false, 3, new String[][]{{"org.apache.commons.math.distribution.NormalDistributionImpl", "getMean", ""}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("0.0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getMean=0.0, getStandardDeviation=1.0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput040() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math.distribution.NormalDistributionImpl", "org.apache.commons.math.distribution.NormalDistributionImpl", "inverseCumulativeProbability", new String[]{"double"}, new String[]{"Infinity"}, false, 0, new String[][]{{"org.apache.commons.math.distribution.NormalDistributionImpl", "density", "double", "0.5"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("org.apache.commons.math.exception.OutOfRangeException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput041() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.distribution.NormalDistributionImpl", "org.apache.commons.math.distribution.NormalDistributionImpl", "inverseCumulativeProbability", new String[]{"double"}, new String[]{"0.13046"}, false, 0, new String[][]{{"org.apache.commons.math.distribution.NormalDistributionImpl", "density", "double", "0.4570000000000001"}, {"org.apache.commons.math.distribution.NormalDistributionImpl", "getDomainLowerBound", "double", "-1.7976931348623157E308"}});
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("-1.1242193088594006", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getMean=0.0, getStandardDeviation=1.0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput042() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.distribution.NormalDistributionImpl", "org.apache.commons.math.distribution.NormalDistributionImpl", "inverseCumulativeProbability", new String[]{"double"}, new String[]{"0.6523000000000001"}, false, 0, new String[][]{{"org.apache.commons.math.distribution.NormalDistributionImpl", "reseedRandomGenerator", "long", "41"}, {"org.apache.commons.math.distribution.NormalDistributionImpl", "density", "double", "0.4570000000000001"}, {"org.apache.commons.math.distribution.NormalDistributionImpl", "getDomainLowerBound", "double", "-8.988465674311579E307"}});
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("0.39153746690121716", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getMean=0.0, getStandardDeviation=1.0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput043() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.distribution.NormalDistributionImpl", "org.apache.commons.math.distribution.NormalDistributionImpl", "inverseCumulativeProbability", new String[]{"double"}, new String[]{"0.6523000000000001"}, false, 9, new String[][]{{"org.apache.commons.math.distribution.NormalDistributionImpl", "reseedRandomGenerator", "long", "8589540077390120675"}, {"org.apache.commons.math.distribution.NormalDistributionImpl", "getDomainUpperBound", "double", "6.283185307179586"}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("0.39153746690121716", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getMean=0.0, getStandardDeviation=1.0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput044() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.distribution.NormalDistributionImpl", "org.apache.commons.math.distribution.NormalDistributionImpl", "inverseCumulativeProbability", new String[]{"double"}, new String[]{"0.17230000000000012"}, false, 9, new String[][]{{"org.apache.commons.math.distribution.NormalDistributionImpl", "reseedRandomGenerator", "long", "8589540077390120675"}, {"org.apache.commons.math.distribution.NormalDistributionImpl", "getDomainUpperBound", "double", "6.283185307179586"}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("-0.9451153295646852", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getMean=0.0, getStandardDeviation=1.0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput045() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math.distribution.NormalDistributionImpl", "org.apache.commons.math.distribution.NormalDistributionImpl", "inverseCumulativeProbability", new String[]{"double"}, new String[]{"-24.8277"}, false, 9, new String[][]{{"org.apache.commons.math.distribution.NormalDistributionImpl", "reseedRandomGenerator", "long", "8589540077390120675"}, {"org.apache.commons.math.distribution.NormalDistributionImpl", "getInitialDomain", "double", "40.0"}, {"org.apache.commons.math.distribution.NormalDistributionImpl", "getDomainUpperBound", "double", "6.283185307179586"}}, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("org.apache.commons.math.exception.OutOfRangeException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput046() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.distribution.NormalDistributionImpl", "org.apache.commons.math.distribution.NormalDistributionImpl", "getMean", new String[]{}, new String[]{}, false, 0, null, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("0.0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getMean=0.0, getStandardDeviation=1.0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput047() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.distribution.NormalDistributionImpl", "org.apache.commons.math.distribution.NormalDistributionImpl", "getMean", new String[]{}, new String[]{}, false, 2, new String[][]{{"org.apache.commons.math.distribution.NormalDistributionImpl", "getMean", ""}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("1.0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getMean=1.0, getStandardDeviation=Infinity}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput048() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.distribution.NormalDistributionImpl", "org.apache.commons.math.distribution.NormalDistributionImpl", "getSolverAbsoluteAccuracy", new String[]{}, new String[]{}, false, 2, new String[][]{{"org.apache.commons.math.distribution.NormalDistributionImpl", "getDomainLowerBound", "double", "1.7976931348623157E308"}});
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("-Infinity", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getMean=1.0, getStandardDeviation=Infinity}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput049() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.distribution.NormalDistributionImpl", "org.apache.commons.math.distribution.NormalDistributionImpl", "getDomainUpperBound", new String[]{"double"}, new String[]{"-0.5"}, false, 4, new String[][]{{"org.apache.commons.math.distribution.NormalDistributionImpl", "getMean", ""}, {"org.apache.commons.math.distribution.NormalDistributionImpl", "cumulativeProbability", "double,double", "1.0E-9", "8589540077390120676"}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("0.0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getMean=0.0, getStandardDeviation=1.0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput050() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.distribution.NormalDistributionImpl", "org.apache.commons.math.distribution.NormalDistributionImpl", "sample", new String[]{}, new String[]{}, false, 2, new String[][]{});
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("Infinity", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getMean=1.0, getStandardDeviation=Infinity}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput051() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.distribution.NormalDistributionImpl", "org.apache.commons.math.distribution.NormalDistributionImpl", "sample", new String[]{}, new String[]{}, false, 2, new String[][]{{"org.apache.commons.math.distribution.NormalDistributionImpl", "getMean", ""}, {"org.apache.commons.math.distribution.NormalDistributionImpl", "getStandardDeviation", ""}, {"org.apache.commons.math.distribution.NormalDistributionImpl", "sample", ""}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("Infinity", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getMean=1.0, getStandardDeviation=Infinity}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput052() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.distribution.NormalDistributionImpl", "org.apache.commons.math.distribution.NormalDistributionImpl", "getMean", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.math.distribution.NormalDistributionImpl", "getDomainUpperBound", "double", "2.0"}});
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("0.0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getMean=0.0, getStandardDeviation=1.0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput053() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.distribution.NormalDistributionImpl", "org.apache.commons.math.distribution.NormalDistributionImpl", "getMean", new String[]{}, new String[]{}, false, 2, new String[][]{{"org.apache.commons.math.distribution.NormalDistributionImpl", "getDomainUpperBound", "double", "3.141592653589793"}});
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("1.0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getMean=1.0, getStandardDeviation=Infinity}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput054() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.distribution.NormalDistributionImpl", "org.apache.commons.math.distribution.NormalDistributionImpl", "inverseCumulativeProbability", new String[]{"double"}, new String[]{"0.4"}, false, 6, new String[][]{{"org.apache.commons.math.distribution.NormalDistributionImpl", "sample", ""}, {"org.apache.commons.math.distribution.NormalDistributionImpl", "getSolverAbsoluteAccuracy", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("-0.25334710332199034", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getMean=0.0, getStandardDeviation=1.0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput055() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.distribution.NormalDistributionImpl", "org.apache.commons.math.distribution.NormalDistributionImpl", "inverseCumulativeProbability", new String[]{"double"}, new String[]{"0.384"}, false, 6, new String[][]{{"org.apache.commons.math.distribution.NormalDistributionImpl", "sample", ""}, {"org.apache.commons.math.distribution.NormalDistributionImpl", "getSolverAbsoluteAccuracy", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("-0.2949919879041281", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getMean=0.0, getStandardDeviation=1.0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput056() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.distribution.NormalDistributionImpl", "org.apache.commons.math.distribution.NormalDistributionImpl", "inverseCumulativeProbability", new String[]{"double"}, new String[]{"0.7"}, false, 6, new String[][]{{"org.apache.commons.math.distribution.NormalDistributionImpl", "cumulativeProbability", "double", "-7.499999999999999"}, {"org.apache.commons.math.distribution.NormalDistributionImpl", "sample", ""}, {"org.apache.commons.math.distribution.NormalDistributionImpl", "getSolverAbsoluteAccuracy", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("0.5244005127080359", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getMean=0.0, getStandardDeviation=1.0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput057() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.distribution.NormalDistributionImpl", "org.apache.commons.math.distribution.NormalDistributionImpl", "inverseCumulativeProbability", new String[]{"double"}, new String[]{"0.746"}, false, 6, new String[][]{{"org.apache.commons.math.distribution.NormalDistributionImpl", "cumulativeProbability", "double", "-7.499999999999999"}, {"org.apache.commons.math.distribution.NormalDistributionImpl", "sample", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("0.6619550962881545", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getMean=0.0, getStandardDeviation=1.0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput058() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.distribution.NormalDistributionImpl", "org.apache.commons.math.distribution.NormalDistributionImpl", "getStandardDeviation", new String[]{}, new String[]{}, false, 2, new String[][]{{"org.apache.commons.math.distribution.NormalDistributionImpl", "getDomainLowerBound", "double", "8589540077390120676"}});
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("Infinity", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getMean=1.0, getStandardDeviation=Infinity}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput059() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.distribution.NormalDistributionImpl", "org.apache.commons.math.distribution.NormalDistributionImpl", "density", new String[]{"double"}, new String[]{"0.5"}, false, 0, new String[][]{{"org.apache.commons.math.distribution.NormalDistributionImpl", "getDomainUpperBound", "double", "6.283185307179586"}});
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("0.3520653267642995", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getMean=0.0, getStandardDeviation=1.0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput060() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.distribution.NormalDistributionImpl", "org.apache.commons.math.distribution.NormalDistributionImpl", "density", new String[]{"double"}, new String[]{"6.283185307179586"}, false, 0, new String[][]{{"org.apache.commons.math.distribution.NormalDistributionImpl", "getDomainUpperBound", "double", "12.566370614359172"}});
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("1.0672854918897263E-9", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getMean=0.0, getStandardDeviation=1.0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput061() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.distribution.NormalDistributionImpl", "org.apache.commons.math.distribution.NormalDistributionImpl", "density", new String[]{"double"}, new String[]{"0.06523"}, false, 0, new String[][]{{"org.apache.commons.math.distribution.NormalDistributionImpl", "getDomainUpperBound", "double", "51.12566370614359"}});
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("0.3980944422925617", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getMean=0.0, getStandardDeviation=1.0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput062() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.distribution.NormalDistributionImpl", "org.apache.commons.math.distribution.NormalDistributionImpl", "density", new String[]{"double"}, new String[]{"0.6523"}, false, 0, new String[][]{{"org.apache.commons.math.distribution.NormalDistributionImpl", "getDomainUpperBound", "double", "51.12566370614359"}});
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("0.3224890237514699", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getMean=0.0, getStandardDeviation=1.0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput063() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.distribution.NormalDistributionImpl", "org.apache.commons.math.distribution.NormalDistributionImpl", "density", new String[]{"double"}, new String[]{"1.3046"}, false, 0, new String[][]{{"org.apache.commons.math.distribution.NormalDistributionImpl", "getDomainUpperBound", "double", "5.112566370614359"}});
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("0.17034506361309226", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getMean=0.0, getStandardDeviation=1.0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput064() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.distribution.NormalDistributionImpl", "org.apache.commons.math.distribution.NormalDistributionImpl", "getInitialDomain", new String[]{"double"}, new String[]{"0.5"}, false, 0, new String[][]{{"org.apache.commons.math.distribution.NormalDistributionImpl", "cumulativeProbability", "double", "0.0"}});
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("0.0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getMean=0.0, getStandardDeviation=1.0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput065() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.distribution.NormalDistributionImpl", "org.apache.commons.math.distribution.NormalDistributionImpl", "getDomainLowerBound", new String[]{"double"}, new String[]{"-0.6857699999999995"}, false, 0, new String[][]{{"org.apache.commons.math.distribution.NormalDistributionImpl", "sample", ""}, {"org.apache.commons.math.distribution.NormalDistributionImpl", "inverseCumulativeProbability", "double", "1.0"}});
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("-1.7976931348623157E308", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getMean=0.0, getStandardDeviation=1.0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput066() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.distribution.NormalDistributionImpl", "org.apache.commons.math.distribution.NormalDistributionImpl", "getMean", new String[]{}, new String[]{}, false, 1, new String[][]{{"org.apache.commons.math.distribution.NormalDistributionImpl", "getInitialDomain", "double", "1.0"}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("0.0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getMean=0.0, getStandardDeviation=1.0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput067() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.distribution.NormalDistributionImpl", "org.apache.commons.math.distribution.NormalDistributionImpl", "inverseCumulativeProbability", new String[]{"double"}, new String[]{"2.0E-10"}, false);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("-6.254027715407199", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getMean=0.0, getStandardDeviation=1.0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput068() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.distribution.NormalDistributionImpl", "org.apache.commons.math.distribution.NormalDistributionImpl", "cumulativeProbability", new String[]{"double"}, new String[]{"0.6523"}, false, 0, new String[][]{{"org.apache.commons.math.distribution.NormalDistributionImpl", "cumulativeProbability", "double,double", "0.5", "0.06523"}});
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("0.7428961699735487", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getMean=0.0, getStandardDeviation=1.0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput069() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.distribution.NormalDistributionImpl", "org.apache.commons.math.distribution.NormalDistributionImpl", "reseedRandomGenerator", new String[]{"long"}, new String[]{"40"}, false, 0, null, 1);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getMean=0.0, getStandardDeviation=1.0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput070() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.distribution.NormalDistributionImpl", "org.apache.commons.math.distribution.NormalDistributionImpl", "density", new String[]{"double"}, new String[]{"0.0"}, false, 1, new String[][]{{"org.apache.commons.math.distribution.NormalDistributionImpl", "density", "double", "0.6523"}});
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("0.3989422804014327", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getMean=0.0, getStandardDeviation=1.0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput071() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.distribution.NormalDistributionImpl", "org.apache.commons.math.distribution.NormalDistributionImpl", "inverseCumulativeProbability", new String[]{"double"}, new String[]{"0.0"}, false);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("-Infinity", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getMean=0.0, getStandardDeviation=1.0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput072() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.distribution.NormalDistributionImpl", "org.apache.commons.math.distribution.NormalDistributionImpl", "getMean", new String[]{}, new String[]{}, false, 9, new String[][]{{"org.apache.commons.math.distribution.NormalDistributionImpl", "getInitialDomain", "double", "0.6523"}, {"org.apache.commons.math.distribution.NormalDistributionImpl", "inverseCumulativeProbability", "double", "-15.0"}, {"org.apache.commons.math.distribution.NormalDistributionImpl", "cumulativeProbability", "double", "0.06523"}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("0.0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getMean=0.0, getStandardDeviation=1.0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput073() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.distribution.NormalDistributionImpl", "org.apache.commons.math.distribution.NormalDistributionImpl", "reseedRandomGenerator", new String[]{"long"}, new String[]{"8589540077390120675"}, false, 0, null, 3);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getMean=0.0, getStandardDeviation=1.0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput074() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.distribution.NormalDistributionImpl", "org.apache.commons.math.distribution.NormalDistributionImpl", "cumulativeProbability", new String[]{"double"}, new String[]{"-1.7976931348623157E308"}, false, 2, new String[][]{{"org.apache.commons.math.distribution.NormalDistributionImpl", "getDomainUpperBound", "double", "0.0"}, {"org.apache.commons.math.distribution.NormalDistributionImpl", "cumulativeProbability", "double", "0.6523"}});
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("0.5", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getMean=1.0, getStandardDeviation=Infinity}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput075() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.distribution.NormalDistributionImpl", "org.apache.commons.math.distribution.NormalDistributionImpl", "cumulativeProbability", new String[]{"double"}, new String[]{"-1.7976931348623157E308"}, false, 1, new String[][]{{"org.apache.commons.math.distribution.NormalDistributionImpl", "cumulativeProbability", "double", "1.9999999999999998"}, {"org.apache.commons.math.distribution.NormalDistributionImpl", "getMean", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("0.0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getMean=0.0, getStandardDeviation=1.0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput076() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.distribution.NormalDistributionImpl", "org.apache.commons.math.distribution.NormalDistributionImpl", "cumulativeProbability", new String[]{"double"}, new String[]{"8.988465674311579E307"}, false, 1, new String[][]{{"org.apache.commons.math.distribution.NormalDistributionImpl", "cumulativeProbability", "double", "1.9999999999999998"}, {"org.apache.commons.math.distribution.NormalDistributionImpl", "getMean", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("1.0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getMean=0.0, getStandardDeviation=1.0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput077() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.distribution.NormalDistributionImpl", "org.apache.commons.math.distribution.NormalDistributionImpl", "getInitialDomain", new String[]{"double"}, new String[]{"-5.5477"}, false, 6, new String[][]{{"org.apache.commons.math.distribution.NormalDistributionImpl", "sample", ""}, {"org.apache.commons.math.distribution.NormalDistributionImpl", "reseedRandomGenerator", "long", "9223372036854775807"}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("-1.0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getMean=0.0, getStandardDeviation=1.0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput078() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.distribution.NormalDistributionImpl", "org.apache.commons.math.distribution.NormalDistributionImpl", "getSolverAbsoluteAccuracy", new String[]{}, new String[]{}, false, 1, new String[][]{}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("1.0E-9", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getMean=0.0, getStandardDeviation=1.0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput079() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.distribution.NormalDistributionImpl", "org.apache.commons.math.distribution.NormalDistributionImpl", "getSolverAbsoluteAccuracy", new String[]{}, new String[]{}, false, 2, new String[][]{}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("-Infinity", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getMean=1.0, getStandardDeviation=Infinity}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput080() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.distribution.NormalDistributionImpl", "org.apache.commons.math.distribution.NormalDistributionImpl", "getSolverAbsoluteAccuracy", new String[]{}, new String[]{}, false, 11, new String[][]{{"org.apache.commons.math.distribution.NormalDistributionImpl", "reseedRandomGenerator", "long", "-9223372036854775808"}, {"org.apache.commons.math.distribution.NormalDistributionImpl", "getMean", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("Infinity", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getMean=0.0, getStandardDeviation=1.0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput081() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.distribution.NormalDistributionImpl", "org.apache.commons.math.distribution.NormalDistributionImpl", "sample", new String[]{}, new String[]{}, false, 14, new String[][]{{"org.apache.commons.math.distribution.NormalDistributionImpl", "reseedRandomGenerator", "long", "8589540077390120676"}, {"org.apache.commons.math.distribution.NormalDistributionImpl", "getDomainLowerBound", "double", "8.589540077390121E18"}, {"org.apache.commons.math.distribution.NormalDistributionImpl", "getInitialDomain", "double", "8.5895400773901199E18"}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("0.7767032788776661", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getMean=0.0, getStandardDeviation=1.0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput082() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.distribution.NormalDistributionImpl", "org.apache.commons.math.distribution.NormalDistributionImpl", "getDomainUpperBound", new String[]{"double"}, new String[]{"Infinity"}, false, 1, new String[][]{{"org.apache.commons.math.distribution.NormalDistributionImpl", "getDomainLowerBound", "double", "1.0"}, {"org.apache.commons.math.distribution.NormalDistributionImpl", "getSolverAbsoluteAccuracy", ""}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("1.7976931348623157E308", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getMean=0.0, getStandardDeviation=1.0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput083() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math.distribution.NormalDistributionImpl", "org.apache.commons.math.distribution.NormalDistributionImpl", "sample", new String[]{"int"}, new String[]{"-2147483648"}, false, 0, new String[][]{{"org.apache.commons.math.distribution.NormalDistributionImpl", "getDomainUpperBound", "double", "-Infinity"}}, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("org.apache.commons.math.exception.NotStrictlyPositiveException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput084() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.distribution.NormalDistributionImpl", "org.apache.commons.math.distribution.NormalDistributionImpl", "cumulativeProbability", new String[]{"double"}, new String[]{"-3.0"}, false, 10, new String[][]{{"org.apache.commons.math.distribution.NormalDistributionImpl", "sample", "int", "41"}});
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("0.0013498980316301035", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getMean=0.0, getStandardDeviation=1.0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput085() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.distribution.NormalDistributionImpl", "org.apache.commons.math.distribution.NormalDistributionImpl", "cumulativeProbability", new String[]{"double"}, new String[]{"-1.5"}, false, 10, new String[][]{});
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("0.06680720126885803", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getMean=0.0, getStandardDeviation=1.0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput086() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.distribution.NormalDistributionImpl", "org.apache.commons.math.distribution.NormalDistributionImpl", "cumulativeProbability", new String[]{"double"}, new String[]{"0.06523"}, false, 10, new String[][]{});
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("0.5260045622796429", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getMean=0.0, getStandardDeviation=1.0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput087() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.distribution.NormalDistributionImpl", "org.apache.commons.math.distribution.NormalDistributionImpl", "cumulativeProbability", new String[]{"double"}, new String[]{"-5.287"}, false, 10, new String[][]{});
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("6.216931985880692E-8", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getMean=0.0, getStandardDeviation=1.0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput088() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.distribution.NormalDistributionImpl", "org.apache.commons.math.distribution.NormalDistributionImpl", "cumulativeProbability", new String[]{"double"}, new String[]{"-4.2707999999999995"}, false, 1, new String[][]{});
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("9.73865107511962E-6", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getMean=0.0, getStandardDeviation=1.0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput089() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math.distribution.NormalDistributionImpl", "org.apache.commons.math.distribution.NormalDistributionImpl", "inverseCumulativeProbability", new String[]{"double"}, new String[]{"-0.25"}, false, 0, null, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("org.apache.commons.math.exception.OutOfRangeException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput090() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math.distribution.NormalDistributionImpl", "org.apache.commons.math.distribution.NormalDistributionImpl", "inverseCumulativeProbability", new String[]{"double"}, new String[]{"NaN"}, false, 0, null, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("org.apache.commons.math.exception.MathUserException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput091() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.distribution.NormalDistributionImpl", "org.apache.commons.math.distribution.NormalDistributionImpl", "density", new String[]{"double"}, new String[]{"0.9999999999999999"}, false, 9, new String[][]{});
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("0.24197072451914342", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getMean=0.0, getStandardDeviation=1.0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput092() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.distribution.NormalDistributionImpl", "org.apache.commons.math.distribution.NormalDistributionImpl", "density", new String[]{"double"}, new String[]{"4.0"}, false, 1, new String[][]{{"org.apache.commons.math.distribution.NormalDistributionImpl", "reseedRandomGenerator", "long", "19"}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("1.3383022576488537E-4", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getMean=0.0, getStandardDeviation=1.0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput093() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.distribution.NormalDistributionImpl", "org.apache.commons.math.distribution.NormalDistributionImpl", "density", new String[]{"double"}, new String[]{"4.000000000000001"}, false, 1, new String[][]{}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("1.338302257648849E-4", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getMean=0.0, getStandardDeviation=1.0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput094() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.distribution.NormalDistributionImpl", "org.apache.commons.math.distribution.NormalDistributionImpl", "density", new String[]{"double"}, new String[]{"1.0E-10"}, false, 1, new String[][]{}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("0.3989422804014327", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getMean=0.0, getStandardDeviation=1.0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput095() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.distribution.NormalDistributionImpl", "org.apache.commons.math.distribution.NormalDistributionImpl", "density", new String[]{"double"}, new String[]{"0.6300000001"}, false, 1, new String[][]{}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("0.3271329769959451", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getMean=0.0, getStandardDeviation=1.0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput096() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.distribution.NormalDistributionImpl", "org.apache.commons.math.distribution.NormalDistributionImpl", "density", new String[]{"double"}, new String[]{"6.300000001"}, false, 1, new String[][]{}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("9.601433309823284E-10", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getMean=0.0, getStandardDeviation=1.0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput097() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.distribution.NormalDistributionImpl", "org.apache.commons.math.distribution.NormalDistributionImpl", "density", new String[]{"double"}, new String[]{"3.1500000005"}, false, 1, new String[][]{}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("0.0027942584104784884", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getMean=0.0, getStandardDeviation=1.0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput098() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.distribution.NormalDistributionImpl", "org.apache.commons.math.distribution.NormalDistributionImpl", "density", new String[]{"double"}, new String[]{"0.31500000005"}, false, 1, new String[][]{}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("0.37963271496789924", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getMean=0.0, getStandardDeviation=1.0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput099() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.distribution.NormalDistributionImpl", "org.apache.commons.math.distribution.NormalDistributionImpl", "density", new String[]{"double"}, new String[]{"2.0"}, false, 1, new String[][]{}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("0.05399096651318806", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getMean=0.0, getStandardDeviation=1.0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput100() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.distribution.NormalDistributionImpl", "org.apache.commons.math.distribution.NormalDistributionImpl", "density", new String[]{"double"}, new String[]{"2.0333000000000006"}, false, 2, new String[][]{{"org.apache.commons.math.distribution.NormalDistributionImpl", "getDomainLowerBound", "double", "-0.25"}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("0.0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getMean=1.0, getStandardDeviation=Infinity}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput101() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.distribution.NormalDistributionImpl", "org.apache.commons.math.distribution.NormalDistributionImpl", "sample", new String[]{}, new String[]{}, false, 17, new String[][]{{"org.apache.commons.math.distribution.NormalDistributionImpl", "density", "double", "2.0"}, {"org.apache.commons.math.distribution.NormalDistributionImpl", "getSolverAbsoluteAccuracy", ""}, {"org.apache.commons.math.distribution.NormalDistributionImpl", "sample", ""}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("Infinity", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getMean=1.0, getStandardDeviation=Infinity}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput102() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.distribution.NormalDistributionImpl", "org.apache.commons.math.distribution.NormalDistributionImpl", "getStandardDeviation", new String[]{}, new String[]{}, false, 2, new String[][]{{"org.apache.commons.math.distribution.NormalDistributionImpl", "getDomainUpperBound", "double", "6.283185307179586"}, {"org.apache.commons.math.distribution.NormalDistributionImpl", "cumulativeProbability", "double,double", "-15.0", "1.0E-9"}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("Infinity", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getMean=1.0, getStandardDeviation=Infinity}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput103() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.distribution.NormalDistributionImpl", "org.apache.commons.math.distribution.NormalDistributionImpl", "getStandardDeviation", new String[]{}, new String[]{}, false, 3, new String[][]{{"org.apache.commons.math.distribution.NormalDistributionImpl", "getStandardDeviation", ""}, {"org.apache.commons.math.distribution.NormalDistributionImpl", "getDomainUpperBound", "double", "6.283185307179586"}, {"org.apache.commons.math.distribution.NormalDistributionImpl", "cumulativeProbability", "double,double", "-15.0", "1.0E-9"}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("1.0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getMean=0.0, getStandardDeviation=1.0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput104() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.distribution.NormalDistributionImpl", "org.apache.commons.math.distribution.NormalDistributionImpl", "getStandardDeviation", new String[]{}, new String[]{}, false, 10, new String[][]{}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("1.0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getMean=0.0, getStandardDeviation=1.0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput105() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.distribution.NormalDistributionImpl", "org.apache.commons.math.distribution.NormalDistributionImpl", "getStandardDeviation", new String[]{}, new String[]{}, false, 17, new String[][]{}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("Infinity", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getMean=1.0, getStandardDeviation=Infinity}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput106() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.distribution.NormalDistributionImpl", "org.apache.commons.math.distribution.NormalDistributionImpl", "sample", new String[]{"int"}, new String[]{"131112"}, false, 7, new String[][]{{"org.apache.commons.math.distribution.NormalDistributionImpl", "inverseCumulativeProbability", "double", "-0.25"}, {"org.apache.commons.math.distribution.NormalDistributionImpl", "cumulativeProbability", "double", "4.2947700386950605E18"}});
  assertNotNull(actual);
  assertEquals("[D", actual.getClass().getName());
  assertEquals("receiver state after the call", "{getMean=1.0, getStandardDeviation=Infinity}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput107() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.distribution.NormalDistributionImpl", "org.apache.commons.math.distribution.NormalDistributionImpl", "density", new String[]{"double"}, new String[]{"2.0000000000000004"}, false, 9, new String[][]{{"org.apache.commons.math.distribution.NormalDistributionImpl", "density", "double", "2.0"}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("0.05399096651318801", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getMean=0.0, getStandardDeviation=1.0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput108() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.distribution.NormalDistributionImpl", "org.apache.commons.math.distribution.NormalDistributionImpl", "density", new String[]{"double"}, new String[]{"0.6523"}, false, 9, new String[][]{{"org.apache.commons.math.distribution.NormalDistributionImpl", "density", "double", "4.0"}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("0.3224890237514699", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getMean=0.0, getStandardDeviation=1.0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput109() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.distribution.NormalDistributionImpl", "org.apache.commons.math.distribution.NormalDistributionImpl", "cumulativeProbability", new String[]{"double"}, new String[]{"40.0"}, false, 0, new String[][]{{"org.apache.commons.math.distribution.NormalDistributionImpl", "reseedRandomGenerator", "long", "40"}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("1.0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getMean=0.0, getStandardDeviation=1.0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput110() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.distribution.NormalDistributionImpl", "org.apache.commons.math.distribution.NormalDistributionImpl", "cumulativeProbability", new String[]{"double", "double"}, new String[]{"-0.5", "NaN"}, false, 4, new String[][]{{"org.apache.commons.math.distribution.NormalDistributionImpl", "getDomainLowerBound", "double", "NaN"}, {"org.apache.commons.math.distribution.NormalDistributionImpl", "sample", "int", "40"}, {"org.apache.commons.math.distribution.NormalDistributionImpl", "getDomainUpperBound", "double", "1.0E-9"}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("NaN", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getMean=0.0, getStandardDeviation=1.0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput111() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.distribution.NormalDistributionImpl", "org.apache.commons.math.distribution.NormalDistributionImpl", "cumulativeProbability", new String[]{"double", "double"}, new String[]{"-46.500000000000014", "NaN"}, false, 8, new String[][]{{"org.apache.commons.math.distribution.NormalDistributionImpl", "cumulativeProbability", "double,double", "1.0E-9", "1.7976931348623157E308"}, {"org.apache.commons.math.distribution.NormalDistributionImpl", "getDomainLowerBound", "double", "NaN"}, {"org.apache.commons.math.distribution.NormalDistributionImpl", "getDomainUpperBound", "double", "1.0E-9"}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("NaN", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getMean=0.0, getStandardDeviation=1.0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput112() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.distribution.NormalDistributionImpl", "org.apache.commons.math.distribution.NormalDistributionImpl", "cumulativeProbability", new String[]{"double", "double"}, new String[]{"-0.6857699999999995", "NaN"}, false, 8, new String[][]{{"org.apache.commons.math.distribution.NormalDistributionImpl", "cumulativeProbability", "double,double", "1.0E-9", "1.7976931348623157E308"}, {"org.apache.commons.math.distribution.NormalDistributionImpl", "getDomainLowerBound", "double", "NaN"}, {"org.apache.commons.math.distribution.NormalDistributionImpl", "getDomainUpperBound", "double", "1.0E-9"}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("NaN", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getMean=0.0, getStandardDeviation=1.0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput113() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math.distribution.NormalDistributionImpl", "org.apache.commons.math.distribution.NormalDistributionImpl", "sample", new String[]{"int"}, new String[]{"-10"}, false, 1, new String[][]{{"org.apache.commons.math.distribution.NormalDistributionImpl", "getDomainLowerBound", "double", "-1.0"}, {"org.apache.commons.math.distribution.NormalDistributionImpl", "inverseCumulativeProbability", "double", "NaN"}}, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("org.apache.commons.math.exception.NotStrictlyPositiveException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput114() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.distribution.NormalDistributionImpl", "org.apache.commons.math.distribution.NormalDistributionImpl", "cumulativeProbability", new String[]{"double"}, new String[]{"NaN"}, false, 0, new String[][]{{"org.apache.commons.math.distribution.NormalDistributionImpl", "reseedRandomGenerator", "long", "8589540077390120677"}, {"org.apache.commons.math.distribution.NormalDistributionImpl", "cumulativeProbability", "double", "-0.5"}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("NaN", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getMean=0.0, getStandardDeviation=1.0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput115() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.distribution.NormalDistributionImpl", "org.apache.commons.math.distribution.NormalDistributionImpl", "sample", new String[]{"int"}, new String[]{"16385"}, false, 8, new String[][]{{"org.apache.commons.math.distribution.NormalDistributionImpl", "inverseCumulativeProbability", "double", "NaN"}, {"org.apache.commons.math.distribution.NormalDistributionImpl", "getSolverAbsoluteAccuracy", ""}}, 1);
  assertNotNull(actual);
  assertEquals("[D", actual.getClass().getName());
  assertEquals("receiver state after the call", "{getMean=0.0, getStandardDeviation=1.0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput116() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.distribution.NormalDistributionImpl", "org.apache.commons.math.distribution.NormalDistributionImpl", "sample", new String[]{"int"}, new String[]{"98"}, false, 1, new String[][]{{"org.apache.commons.math.distribution.NormalDistributionImpl", "reseedRandomGenerator", "long", "1"}}, 1);
  assertNotNull(actual);
  assertEquals("[D", actual.getClass().getName());
  assertEquals("[1.561581040188955, -0.6081826070068602, -1.0912278829447088, -0.6245401364066232, -1.1182832102556484, -1.6583217791337177, -1.8821643777572246, 0.059255494425680996, -0.4084113286637019, 0.287709502...#2023#138132302", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getMean=0.0, getStandardDeviation=1.0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput117() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.distribution.NormalDistributionImpl", "org.apache.commons.math.distribution.NormalDistributionImpl", "cumulativeProbability", new String[]{"double", "double"}, new String[]{"-1.0", "-0.6857699999999994"}, false, 0, new String[][]{{"org.apache.commons.math.distribution.NormalDistributionImpl", "getDomainUpperBound", "double", "NaN"}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("0.08777382456927862", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getMean=0.0, getStandardDeviation=1.0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput118() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.distribution.NormalDistributionImpl", "org.apache.commons.math.distribution.NormalDistributionImpl", "cumulativeProbability", new String[]{"double", "double"}, new String[]{"-65.09999999999998", "4.2947700386950605E18"}, false, 0, new String[][]{{"org.apache.commons.math.distribution.NormalDistributionImpl", "getDomainUpperBound", "double", "5.0"}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("1.0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getMean=0.0, getStandardDeviation=1.0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput119() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.distribution.NormalDistributionImpl", "org.apache.commons.math.distribution.NormalDistributionImpl", "cumulativeProbability", new String[]{"double", "double"}, new String[]{"25.099999999999984", "4.2947700386950605E18"}, false, 0, new String[][]{{"org.apache.commons.math.distribution.NormalDistributionImpl", "cumulativeProbability", "double", "1.9999999999999998"}, {"org.apache.commons.math.distribution.NormalDistributionImpl", "getDomainUpperBound", "double", "0.06523"}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("0.0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getMean=0.0, getStandardDeviation=1.0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput120() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.distribution.NormalDistributionImpl", "org.apache.commons.math.distribution.NormalDistributionImpl", "cumulativeProbability", new String[]{"double", "double"}, new String[]{"-55.599999999999966", "6.2201853071795865"}, false, 2, new String[][]{{"org.apache.commons.math.distribution.NormalDistributionImpl", "cumulativeProbability", "double", "5.0"}});
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("0.0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getMean=1.0, getStandardDeviation=Infinity}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput121() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.distribution.NormalDistributionImpl", "org.apache.commons.math.distribution.NormalDistributionImpl", "getDomainLowerBound", new String[]{"double"}, new String[]{"-15.0"}, false, 0, null, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("-1.7976931348623157E308", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getMean=0.0, getStandardDeviation=1.0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput122() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.distribution.NormalDistributionImpl", "org.apache.commons.math.distribution.NormalDistributionImpl", "getDomainUpperBound", new String[]{"double"}, new String[]{"-15.0"}, false, 0, null, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("0.0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getMean=0.0, getStandardDeviation=1.0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput123() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.distribution.NormalDistributionImpl", "org.apache.commons.math.distribution.NormalDistributionImpl", "inverseCumulativeProbability", new String[]{"double"}, new String[]{"0.014"}, false, 14, new String[][]{{"org.apache.commons.math.distribution.NormalDistributionImpl", "cumulativeProbability", "double,double", "-0.6857699999999995", "0.0"}, {"org.apache.commons.math.distribution.NormalDistributionImpl", "sample", "int", "10"}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("-2.1972863766695205", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getMean=0.0, getStandardDeviation=1.0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput124() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.distribution.NormalDistributionImpl", "org.apache.commons.math.distribution.NormalDistributionImpl", "getSolverAbsoluteAccuracy", new String[]{}, new String[]{}, false, 0, null, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("1.0E-9", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getMean=0.0, getStandardDeviation=1.0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput125() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.distribution.NormalDistributionImpl", "org.apache.commons.math.distribution.NormalDistributionImpl", "density", new String[]{"double"}, new String[]{"1.0E-9"}, false, 0, new String[][]{{"org.apache.commons.math.distribution.NormalDistributionImpl", "getStandardDeviation", ""}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("0.3989422804014327", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getMean=0.0, getStandardDeviation=1.0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput126() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.distribution.NormalDistributionImpl", "org.apache.commons.math.distribution.NormalDistributionImpl", "cumulativeProbability", new String[]{"double", "double"}, new String[]{"-1.7976931348623157E308", "25.999999999"}, false, 4, new String[][]{{"org.apache.commons.math.distribution.NormalDistributionImpl", "density", "double", "-1.7976931348623157E308"}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("1.0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getMean=0.0, getStandardDeviation=1.0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput127() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.distribution.NormalDistributionImpl", "org.apache.commons.math.distribution.NormalDistributionImpl", "cumulativeProbability", new String[]{"double"}, new String[]{"0.06523"}, false, 0, null, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("0.5260045622796429", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getMean=0.0, getStandardDeviation=1.0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput128() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.distribution.NormalDistributionImpl", "org.apache.commons.math.distribution.NormalDistributionImpl", "getInitialDomain", new String[]{"double"}, new String[]{"1.0"}, false, 2, new String[][]{{"org.apache.commons.math.distribution.NormalDistributionImpl", "getDomainLowerBound", "double", "0.0"}});
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("Infinity", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getMean=1.0, getStandardDeviation=Infinity}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput129() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.distribution.NormalDistributionImpl", "org.apache.commons.math.distribution.NormalDistributionImpl", "cumulativeProbability", new String[]{"double", "double"}, new String[]{"-6.857699999999997", "39.50000000005"}, false, 4, new String[][]{}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("0.999999999996501", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getMean=0.0, getStandardDeviation=1.0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput130() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.distribution.NormalDistributionImpl", "org.apache.commons.math.distribution.NormalDistributionImpl", "cumulativeProbability", new String[]{"double"}, new String[]{"-0.5219999999999999"}, false, 13, new String[][]{{"org.apache.commons.math.distribution.NormalDistributionImpl", "getInitialDomain", "double", "0.06523"}, {"org.apache.commons.math.distribution.NormalDistributionImpl", "getStandardDeviation", ""}, {"org.apache.commons.math.distribution.NormalDistributionImpl", "cumulativeProbability", "double", "1.0"}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("0.3008351652923451", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getMean=0.0, getStandardDeviation=1.0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput131() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.distribution.NormalDistributionImpl", "org.apache.commons.math.distribution.NormalDistributionImpl", "cumulativeProbability", new String[]{"double"}, new String[]{"-64.97489999999999"}, false, 13, new String[][]{{"org.apache.commons.math.distribution.NormalDistributionImpl", "cumulativeProbability", "double,double", "-15.0", "8589540077390120676"}, {"org.apache.commons.math.distribution.NormalDistributionImpl", "getInitialDomain", "double", "0.06523"}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("0.0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getMean=0.0, getStandardDeviation=1.0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput132() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.distribution.NormalDistributionImpl", "org.apache.commons.math.distribution.NormalDistributionImpl", "cumulativeProbability", new String[]{"double"}, new String[]{"-64.97489999999996"}, false, 4, new String[][]{{"org.apache.commons.math.distribution.NormalDistributionImpl", "cumulativeProbability", "double,double", "-26.0", "8.589540077390121E18"}, {"org.apache.commons.math.distribution.NormalDistributionImpl", "sample", "int", "2147483647"}, {"org.apache.commons.math.distribution.NormalDistributionImpl", "cumulativeProbability", "double", "-0.5"}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("0.0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getMean=0.0, getStandardDeviation=1.0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput133() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.distribution.NormalDistributionImpl", "org.apache.commons.math.distribution.NormalDistributionImpl", "cumulativeProbability", new String[]{"double"}, new String[]{"-6.497489999999996"}, false, 4, new String[][]{{"org.apache.commons.math.distribution.NormalDistributionImpl", "cumulativeProbability", "double,double", "-2.6", "8.589540077390121E18"}, {"org.apache.commons.math.distribution.NormalDistributionImpl", "cumulativeProbability", "double", "-0.5"}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("4.083555715794773E-11", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getMean=0.0, getStandardDeviation=1.0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput134() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.distribution.NormalDistributionImpl", "org.apache.commons.math.distribution.NormalDistributionImpl", "cumulativeProbability", new String[]{"double"}, new String[]{"-0.6497489999999997"}, false, 4, new String[][]{{"org.apache.commons.math.distribution.NormalDistributionImpl", "cumulativeProbability", "double,double", "-2.6", "8.589540077390121E18"}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("0.2579271834806139", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getMean=0.0, getStandardDeviation=1.0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput135() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.distribution.NormalDistributionImpl", "org.apache.commons.math.distribution.NormalDistributionImpl", "cumulativeProbability", new String[]{"double"}, new String[]{"-0.6097489999999995"}, false, 4, new String[][]{{"org.apache.commons.math.distribution.NormalDistributionImpl", "cumulativeProbability", "double,double", "-2.6", "8.589540077390121E18"}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("0.2710140450315768", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getMean=0.0, getStandardDeviation=1.0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput136() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.distribution.NormalDistributionImpl", "org.apache.commons.math.distribution.NormalDistributionImpl", "cumulativeProbability", new String[]{"double"}, new String[]{"0.6097489999999995"}, false, 4, new String[][]{{"org.apache.commons.math.distribution.NormalDistributionImpl", "cumulativeProbability", "double,double", "-2.6", "8.58954007739012E19"}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("0.7289859549684232", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getMean=0.0, getStandardDeviation=1.0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput137() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.distribution.NormalDistributionImpl", "org.apache.commons.math.distribution.NormalDistributionImpl", "cumulativeProbability", new String[]{"double"}, new String[]{"3.1097489999999994"}, false, 4, new String[][]{{"org.apache.commons.math.distribution.NormalDistributionImpl", "cumulativeProbability", "double,double", "-2.6", "8.58954007739012E19"}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("0.9990637680674848", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getMean=0.0, getStandardDeviation=1.0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput138() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.distribution.NormalDistributionImpl", "org.apache.commons.math.distribution.NormalDistributionImpl", "cumulativeProbability", new String[]{"double"}, new String[]{"-0.9902510000000011"}, false, 4, new String[][]{{"org.apache.commons.math.distribution.NormalDistributionImpl", "cumulativeProbability", "double,double", "-2.6", "1.717908015478024E20"}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("0.16102572515419977", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getMean=0.0, getStandardDeviation=1.0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput139() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.distribution.NormalDistributionImpl", "org.apache.commons.math.distribution.NormalDistributionImpl", "sample", new String[]{"int"}, new String[]{"10"}, false, 0, new String[][]{{"org.apache.commons.math.distribution.NormalDistributionImpl", "reseedRandomGenerator", "long", "0"}}, 2);
  assertNotNull(actual);
  assertEquals("[D", actual.getClass().getName());
  assertEquals("[0.8025330637390305, -0.9015460884175122, 2.080920790428163, 0.7637707684364894, 0.9845745328825128, -1.6834122587673428, -0.027290262907887285, 0.11524570286202315, -0.39016704137993785, -0.643388813...#208#1669801714", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getMean=0.0, getStandardDeviation=1.0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput140() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.distribution.NormalDistributionImpl", "org.apache.commons.math.distribution.NormalDistributionImpl", "density", new String[]{"double"}, new String[]{"0.3460000000000002"}, false, 1, new String[][]{{"org.apache.commons.math.distribution.NormalDistributionImpl", "sample", "int", "2147483647"}, {"org.apache.commons.math.distribution.NormalDistributionImpl", "getInitialDomain", "double", "0.6857699999999997"}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("0.3757630451934456", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getMean=0.0, getStandardDeviation=1.0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput141() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.distribution.NormalDistributionImpl", "org.apache.commons.math.distribution.NormalDistributionImpl", "density", new String[]{"double"}, new String[]{"-17.900000000000002"}, false, 10, new String[][]{{"org.apache.commons.math.distribution.NormalDistributionImpl", "getStandardDeviation", ""}, {"org.apache.commons.math.distribution.NormalDistributionImpl", "density", "double", "Infinity"}, {"org.apache.commons.math.distribution.NormalDistributionImpl", "sample", ""}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("1.0586748413640859E-70", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getMean=0.0, getStandardDeviation=1.0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput142() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.distribution.NormalDistributionImpl", "org.apache.commons.math.distribution.NormalDistributionImpl", "density", new String[]{"double"}, new String[]{"-0.6857699999999995"}, false, 10, new String[][]{{"org.apache.commons.math.distribution.NormalDistributionImpl", "reseedRandomGenerator", "long", "41"}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("0.3153479080437234", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getMean=0.0, getStandardDeviation=1.0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput143() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.distribution.NormalDistributionImpl", "org.apache.commons.math.distribution.NormalDistributionImpl", "density", new String[]{"double"}, new String[]{"1.8999999999999997"}, false, 10, new String[][]{{"org.apache.commons.math.distribution.NormalDistributionImpl", "cumulativeProbability", "double", "-1.7976931348623157E308"}, {"org.apache.commons.math.distribution.NormalDistributionImpl", "inverseCumulativeProbability", "double", "Infinity"}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("0.06561581477467664", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getMean=0.0, getStandardDeviation=1.0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput144() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.distribution.NormalDistributionImpl", "org.apache.commons.math.distribution.NormalDistributionImpl", "density", new String[]{"double"}, new String[]{"2.3434999999999997"}, false, 2, new String[][]{{"org.apache.commons.math.distribution.NormalDistributionImpl", "getDomainUpperBound", "double", "-3.4719999999500004"}, {"org.apache.commons.math.distribution.NormalDistributionImpl", "getSolverAbsoluteAccuracy", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("0.0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getMean=1.0, getStandardDeviation=Infinity}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput145() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.distribution.NormalDistributionImpl", "org.apache.commons.math.distribution.NormalDistributionImpl", "density", new String[]{"double"}, new String[]{"3.2831853071795845"}, false, 8, new String[][]{{"org.apache.commons.math.distribution.NormalDistributionImpl", "inverseCumulativeProbability", "double", "0.49999999999999994"}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("0.0018205959001016464", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getMean=0.0, getStandardDeviation=1.0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput146() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.distribution.NormalDistributionImpl", "org.apache.commons.math.distribution.NormalDistributionImpl", "density", new String[]{"double"}, new String[]{"-32.97200000000001"}, false, 6, new String[][]{{"org.apache.commons.math.distribution.NormalDistributionImpl", "inverseCumulativeProbability", "double", "0.9999999999999999"}, {"org.apache.commons.math.distribution.NormalDistributionImpl", "inverseCumulativeProbability", "double", "-0.0"}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("3.378177984746923E-237", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getMean=0.0, getStandardDeviation=1.0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput147() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.distribution.NormalDistributionImpl", "org.apache.commons.math.distribution.NormalDistributionImpl", "density", new String[]{"double"}, new String[]{"-27.77200000000001"}, false, 6, new String[][]{{"org.apache.commons.math.distribution.NormalDistributionImpl", "inverseCumulativeProbability", "double", "0.9999999999999999"}, {"org.apache.commons.math.distribution.NormalDistributionImpl", "inverseCumulativeProbability", "double", "-0.0"}, {"org.apache.commons.math.distribution.NormalDistributionImpl", "getSolverAbsoluteAccuracy", ""}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("1.3143800239713616E-168", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getMean=0.0, getStandardDeviation=1.0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput148() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.distribution.NormalDistributionImpl", "org.apache.commons.math.distribution.NormalDistributionImpl", "density", new String[]{"double"}, new String[]{"-28.302000000000007"}, false, 5, new String[][]{{"org.apache.commons.math.distribution.NormalDistributionImpl", "inverseCumulativeProbability", "double", "0.49999999999999994"}, {"org.apache.commons.math.distribution.NormalDistributionImpl", "inverseCumulativeProbability", "double", "-0.0"}, {"org.apache.commons.math.distribution.NormalDistributionImpl", "getInitialDomain", "double", "6.283185307179586"}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("4.6267317844167265E-175", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getMean=0.0, getStandardDeviation=1.0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput149() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.distribution.NormalDistributionImpl", "org.apache.commons.math.distribution.NormalDistributionImpl", "density", new String[]{"double"}, new String[]{"-7.075500000000002"}, false, 6, new String[][]{{"org.apache.commons.math.distribution.NormalDistributionImpl", "inverseCumulativeProbability", "double", "0.49999999999999994"}, {"org.apache.commons.math.distribution.NormalDistributionImpl", "inverseCumulativeProbability", "double", "-0.0"}, {"org.apache.commons.math.distribution.NormalDistributionImpl", "getInitialDomain", "double", "0.6523"}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("5.369487453682471E-12", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getMean=0.0, getStandardDeviation=1.0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput150() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.distribution.NormalDistributionImpl", "org.apache.commons.math.distribution.NormalDistributionImpl", "density", new String[]{"double"}, new String[]{"-14.151000000000002"}, false, 5, new String[][]{{"org.apache.commons.math.distribution.NormalDistributionImpl", "inverseCumulativeProbability", "double", "0.46399999999999997"}, {"org.apache.commons.math.distribution.NormalDistributionImpl", "inverseCumulativeProbability", "double", "-0.0"}, {"org.apache.commons.math.distribution.NormalDistributionImpl", "getInitialDomain", "double", "0.6523"}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("1.3091853303501108E-44", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getMean=0.0, getStandardDeviation=1.0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput151() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.distribution.NormalDistributionImpl", "org.apache.commons.math.distribution.NormalDistributionImpl", "density", new String[]{"double"}, new String[]{"-12.3342885"}, false, 11, new String[][]{{"org.apache.commons.math.distribution.NormalDistributionImpl", "inverseCumulativeProbability", "double", "0.464"}, {"org.apache.commons.math.distribution.NormalDistributionImpl", "inverseCumulativeProbability", "double", "-0.0"}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("3.675239233057869E-34", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getMean=0.0, getStandardDeviation=1.0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput152() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.distribution.NormalDistributionImpl", "org.apache.commons.math.distribution.NormalDistributionImpl", "getDomainLowerBound", new String[]{"double"}, new String[]{"1.7976931348623157E308"}, false, 0, new String[][]{{"org.apache.commons.math.distribution.NormalDistributionImpl", "getDomainUpperBound", "double", "NaN"}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("0.0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getMean=0.0, getStandardDeviation=1.0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput153() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.distribution.NormalDistributionImpl", "org.apache.commons.math.distribution.NormalDistributionImpl", "density", new String[]{"double"}, new String[]{"-23.0931423"}, false, 0, new String[][]{{"org.apache.commons.math.distribution.NormalDistributionImpl", "inverseCumulativeProbability", "double", "1.0"}, {"org.apache.commons.math.distribution.NormalDistributionImpl", "getDomainUpperBound", "double", "0.0"}, {"org.apache.commons.math.distribution.NormalDistributionImpl", "inverseCumulativeProbability", "double", "0.20200000006250002"}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("6.277091291711329E-117", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getMean=0.0, getStandardDeviation=1.0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput154() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.distribution.NormalDistributionImpl", "org.apache.commons.math.distribution.NormalDistributionImpl", "getDomainLowerBound", new String[]{"double"}, new String[]{"NaN"}, false, 2, new String[][]{{"org.apache.commons.math.distribution.NormalDistributionImpl", "getSolverAbsoluteAccuracy", ""}, {"org.apache.commons.math.distribution.NormalDistributionImpl", "getInitialDomain", "double", "-1.7976931348623157E308"}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("1.0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getMean=1.0, getStandardDeviation=Infinity}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput155() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.distribution.NormalDistributionImpl", "org.apache.commons.math.distribution.NormalDistributionImpl", "getDomainLowerBound", new String[]{"double"}, new String[]{"0.1"}, false, 12, new String[][]{{"org.apache.commons.math.distribution.NormalDistributionImpl", "getInitialDomain", "double", "-7.500000000000001"}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("-1.7976931348623157E308", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getMean=0.0, getStandardDeviation=1.0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput156() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.distribution.NormalDistributionImpl", "org.apache.commons.math.distribution.NormalDistributionImpl", "cumulativeProbability", new String[]{"double"}, new String[]{"0.06523"}, false, 2, new String[][]{}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("0.5", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getMean=1.0, getStandardDeviation=Infinity}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput157() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.distribution.NormalDistributionImpl", "org.apache.commons.math.distribution.NormalDistributionImpl", "getInitialDomain", new String[]{"double"}, new String[]{"-0.2"}, false, 7, new String[][]{{"org.apache.commons.math.distribution.NormalDistributionImpl", "getMean", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("-Infinity", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getMean=1.0, getStandardDeviation=Infinity}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput158() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.distribution.NormalDistributionImpl", "org.apache.commons.math.distribution.NormalDistributionImpl", "sample", new String[]{"int"}, new String[]{"1572822"}, false, 8, new String[][]{}, 3);
  assertNotNull(actual);
  assertEquals("[D", actual.getClass().getName());
  assertEquals("receiver state after the call", "{getMean=0.0, getStandardDeviation=1.0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput159() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math.distribution.NormalDistributionImpl", "org.apache.commons.math.distribution.NormalDistributionImpl", "sample", new String[]{"int"}, new String[]{"-1572822"}, false, 8, new String[][]{}, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("org.apache.commons.math.exception.NotStrictlyPositiveException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput160() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.distribution.NormalDistributionImpl", "org.apache.commons.math.distribution.NormalDistributionImpl", "getSolverAbsoluteAccuracy", new String[]{}, new String[]{}, false, 10, new String[][]{{"org.apache.commons.math.distribution.NormalDistributionImpl", "density", "double", "NaN"}, {"org.apache.commons.math.distribution.NormalDistributionImpl", "getSolverAbsoluteAccuracy", ""}, {"org.apache.commons.math.distribution.NormalDistributionImpl", "sample", "int", "41"}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("1.0E-9", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getMean=0.0, getStandardDeviation=1.0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput161() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.distribution.NormalDistributionImpl", "org.apache.commons.math.distribution.NormalDistributionImpl", "getSolverAbsoluteAccuracy", new String[]{}, new String[]{}, false, 11, new String[][]{{"org.apache.commons.math.distribution.NormalDistributionImpl", "density", "double", "NaN"}, {"org.apache.commons.math.distribution.NormalDistributionImpl", "getSolverAbsoluteAccuracy", ""}, {"org.apache.commons.math.distribution.NormalDistributionImpl", "sample", "int", "41"}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("Infinity", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getMean=0.0, getStandardDeviation=1.0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput162() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.distribution.NormalDistributionImpl", "org.apache.commons.math.distribution.NormalDistributionImpl", "getInitialDomain", new String[]{"double"}, new String[]{"Infinity"}, false, 4, new String[][]{{"org.apache.commons.math.distribution.NormalDistributionImpl", "density", "double", "2.0"}, {"org.apache.commons.math.distribution.NormalDistributionImpl", "getMean", ""}, {"org.apache.commons.math.distribution.NormalDistributionImpl", "cumulativeProbability", "double", "1.0E-10"}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("1.0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getMean=0.0, getStandardDeviation=1.0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput163() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.distribution.NormalDistributionImpl", "org.apache.commons.math.distribution.NormalDistributionImpl", "getInitialDomain", new String[]{"double"}, new String[]{"-1.7976931348623157E308"}, false, 4, new String[][]{{"org.apache.commons.math.distribution.NormalDistributionImpl", "density", "double", "2.0"}, {"org.apache.commons.math.distribution.NormalDistributionImpl", "getMean", ""}, {"org.apache.commons.math.distribution.NormalDistributionImpl", "cumulativeProbability", "double", "1.0E-9"}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("-1.0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getMean=0.0, getStandardDeviation=1.0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput164() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.distribution.NormalDistributionImpl", "org.apache.commons.math.distribution.NormalDistributionImpl", "getDomainLowerBound", new String[]{"double"}, new String[]{"7.5"}, false, 0, new String[][]{{"org.apache.commons.math.distribution.NormalDistributionImpl", "getMean", ""}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("0.0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getMean=0.0, getStandardDeviation=1.0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput165() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.distribution.NormalDistributionImpl", "org.apache.commons.math.distribution.NormalDistributionImpl", "getInitialDomain", new String[]{"double"}, new String[]{"0.0"}, false, 9, new String[][]{{"org.apache.commons.math.distribution.NormalDistributionImpl", "cumulativeProbability", "double,double", "1.0E-9", "Infinity"}, {"org.apache.commons.math.distribution.NormalDistributionImpl", "getSolverAbsoluteAccuracy", ""}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("-1.0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getMean=0.0, getStandardDeviation=1.0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput166() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.distribution.NormalDistributionImpl", "org.apache.commons.math.distribution.NormalDistributionImpl", "getSolverAbsoluteAccuracy", new String[]{}, new String[]{}, false, 2, new String[][]{{"org.apache.commons.math.distribution.NormalDistributionImpl", "inverseCumulativeProbability", "double", "1.7179080154780242E19"}, {"org.apache.commons.math.distribution.NormalDistributionImpl", "getStandardDeviation", ""}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("-Infinity", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getMean=1.0, getStandardDeviation=Infinity}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput167() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.distribution.NormalDistributionImpl", "org.apache.commons.math.distribution.NormalDistributionImpl", "density", new String[]{"double"}, new String[]{"2.0E-9"}, false, 2, new String[][]{{"org.apache.commons.math.distribution.NormalDistributionImpl", "reseedRandomGenerator", "long", "8589540077390120675"}, {"org.apache.commons.math.distribution.NormalDistributionImpl", "sample", ""}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("0.0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getMean=1.0, getStandardDeviation=Infinity}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput168() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.distribution.NormalDistributionImpl", "org.apache.commons.math.distribution.NormalDistributionImpl", "cumulativeProbability", new String[]{"double", "double"}, new String[]{"0.0", "1.0E-10"}, false, 0, new String[][]{{"org.apache.commons.math.distribution.NormalDistributionImpl", "cumulativeProbability", "double", "-1.7976931348623157E308"}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("3.989419905536806E-11", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getMean=0.0, getStandardDeviation=1.0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput169() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.distribution.NormalDistributionImpl", "org.apache.commons.math.distribution.NormalDistributionImpl", "cumulativeProbability", new String[]{"double", "double"}, new String[]{"0.0", "2.0E-10"}, false, 4, new String[][]{{"org.apache.commons.math.distribution.NormalDistributionImpl", "cumulativeProbability", "double", "-8.988465674311579E307"}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("7.978850913303859E-11", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getMean=0.0, getStandardDeviation=1.0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput170() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.distribution.NormalDistributionImpl", "org.apache.commons.math.distribution.NormalDistributionImpl", "cumulativeProbability", new String[]{"double", "double"}, new String[]{"0.0", "40.0"}, false, 4, new String[][]{{"org.apache.commons.math.distribution.NormalDistributionImpl", "cumulativeProbability", "double", "-8.988465674311579E307"}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("0.5", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getMean=0.0, getStandardDeviation=1.0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput171() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.distribution.NormalDistributionImpl", "org.apache.commons.math.distribution.NormalDistributionImpl", "cumulativeProbability", new String[]{"double", "double"}, new String[]{"-0.056", "40.0"}, false, 4, new String[][]{{"org.apache.commons.math.distribution.NormalDistributionImpl", "cumulativeProbability", "double", "1.0E-10"}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("0.5223290964185991", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getMean=0.0, getStandardDeviation=1.0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput172() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.distribution.NormalDistributionImpl", "org.apache.commons.math.distribution.NormalDistributionImpl", "getStandardDeviation", new String[]{}, new String[]{}, false, 13, new String[][]{{"org.apache.commons.math.distribution.NormalDistributionImpl", "inverseCumulativeProbability", "double", "0.0"}, {"org.apache.commons.math.distribution.NormalDistributionImpl", "getSolverAbsoluteAccuracy", ""}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("1.0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getMean=0.0, getStandardDeviation=1.0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput173() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.distribution.NormalDistributionImpl", "org.apache.commons.math.distribution.NormalDistributionImpl", "getStandardDeviation", new String[]{}, new String[]{}, false, 7, new String[][]{{"org.apache.commons.math.distribution.NormalDistributionImpl", "inverseCumulativeProbability", "double", "0.0"}, {"org.apache.commons.math.distribution.NormalDistributionImpl", "getSolverAbsoluteAccuracy", ""}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("Infinity", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getMean=1.0, getStandardDeviation=Infinity}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput174() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.distribution.NormalDistributionImpl", "org.apache.commons.math.distribution.NormalDistributionImpl", "cumulativeProbability", new String[]{"double", "double"}, new String[]{"1.9999999999999998", "2.0"}, false, 2, new String[][]{}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("0.0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getMean=1.0, getStandardDeviation=Infinity}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput175() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.distribution.NormalDistributionImpl", "org.apache.commons.math.distribution.NormalDistributionImpl", "cumulativeProbability", new String[]{"double", "double"}, new String[]{"-1.0", "2.0"}, false, 15, new String[][]{}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("0.8185946141203637", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getMean=0.0, getStandardDeviation=1.0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput176() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.distribution.NormalDistributionImpl", "org.apache.commons.math.distribution.NormalDistributionImpl", "cumulativeProbability", new String[]{"double", "double"}, new String[]{"-30.0", "-1.9999999999999998"}, false, 11, new String[][]{{"org.apache.commons.math.distribution.NormalDistributionImpl", "getStandardDeviation", ""}, {"org.apache.commons.math.distribution.NormalDistributionImpl", "density", "double", "0.0"}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("0.02275013194817921", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getMean=0.0, getStandardDeviation=1.0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput177() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.distribution.NormalDistributionImpl", "org.apache.commons.math.distribution.NormalDistributionImpl", "getInitialDomain", new String[]{"double"}, new String[]{"2.0"}, false, 0, null, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("1.0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getMean=0.0, getStandardDeviation=1.0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput178() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.distribution.NormalDistributionImpl", "org.apache.commons.math.distribution.NormalDistributionImpl", "inverseCumulativeProbability", new String[]{"double"}, new String[]{"1.0"}, false, 2, new String[][]{{"org.apache.commons.math.distribution.NormalDistributionImpl", "getSolverAbsoluteAccuracy", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("Infinity", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getMean=1.0, getStandardDeviation=Infinity}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput179() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.distribution.NormalDistributionImpl", "org.apache.commons.math.distribution.NormalDistributionImpl", "getInitialDomain", new String[]{"double"}, new String[]{"-16.1723"}, false, 2, new String[][]{{"org.apache.commons.math.distribution.NormalDistributionImpl", "getDomainLowerBound", "double", "-1.7976931348623157E308"}, {"org.apache.commons.math.distribution.NormalDistributionImpl", "getDomainUpperBound", "double", "39.99999999999999"}, {"org.apache.commons.math.distribution.NormalDistributionImpl", "getMean", ""}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("-Infinity", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getMean=1.0, getStandardDeviation=Infinity}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput180() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.distribution.NormalDistributionImpl", "org.apache.commons.math.distribution.NormalDistributionImpl", "inverseCumulativeProbability", new String[]{"double"}, new String[]{"1.0E-10"}, false, 0, new String[][]{{"org.apache.commons.math.distribution.NormalDistributionImpl", "getInitialDomain", "double", "-1.371539999999999"}, {"org.apache.commons.math.distribution.NormalDistributionImpl", "cumulativeProbability", "double,double", "-0.5", "-15.0"}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("-6.3613409313794325", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getMean=0.0, getStandardDeviation=1.0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput181() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.distribution.NormalDistributionImpl", "org.apache.commons.math.distribution.NormalDistributionImpl", "getMean", new String[]{}, new String[]{}, false, 2, new String[][]{{"org.apache.commons.math.distribution.NormalDistributionImpl", "cumulativeProbability", "double,double", "-15.0", "NaN"}, {"org.apache.commons.math.distribution.NormalDistributionImpl", "getMean", ""}, {"org.apache.commons.math.distribution.NormalDistributionImpl", "reseedRandomGenerator", "long", "1"}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("1.0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getMean=1.0, getStandardDeviation=Infinity}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput182() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.distribution.NormalDistributionImpl", "org.apache.commons.math.distribution.NormalDistributionImpl", "cumulativeProbability", new String[]{"double"}, new String[]{"40.0"}, false, 0, null, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("1.0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getMean=0.0, getStandardDeviation=1.0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput183() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.distribution.NormalDistributionImpl", "org.apache.commons.math.distribution.NormalDistributionImpl", "cumulativeProbability", new String[]{"double"}, new String[]{"-2.0"}, false, 0, new String[][]{{"org.apache.commons.math.distribution.NormalDistributionImpl", "inverseCumulativeProbability", "double", "5.0E-11"}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("0.02275013194817921", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getMean=0.0, getStandardDeviation=1.0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput184() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.distribution.NormalDistributionImpl", "org.apache.commons.math.distribution.NormalDistributionImpl", "cumulativeProbability", new String[]{"double"}, new String[]{"1.0"}, false, 6, new String[][]{}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("0.841344746068543", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getMean=0.0, getStandardDeviation=1.0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput185() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.distribution.NormalDistributionImpl", "org.apache.commons.math.distribution.NormalDistributionImpl", "cumulativeProbability", new String[]{"double"}, new String[]{"-2.0"}, false, 6, new String[][]{}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("0.02275013194817921", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getMean=0.0, getStandardDeviation=1.0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput186() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.distribution.NormalDistributionImpl", "org.apache.commons.math.distribution.NormalDistributionImpl", "cumulativeProbability", new String[]{"double"}, new String[]{"-4.0"}, false, 6, new String[][]{}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("3.167124183311998E-5", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getMean=0.0, getStandardDeviation=1.0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput187() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.distribution.NormalDistributionImpl", "org.apache.commons.math.distribution.NormalDistributionImpl", "cumulativeProbability", new String[]{"double"}, new String[]{"-4.39"}, false, 6, new String[][]{}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("5.667533041819883E-6", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getMean=0.0, getStandardDeviation=1.0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput188() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.distribution.NormalDistributionImpl", "org.apache.commons.math.distribution.NormalDistributionImpl", "sample", new String[]{"int"}, new String[]{"32"}, false, 0, new String[][]{{"org.apache.commons.math.distribution.NormalDistributionImpl", "getSolverAbsoluteAccuracy", ""}, {"org.apache.commons.math.distribution.NormalDistributionImpl", "reseedRandomGenerator", "long", "61"}}, 2);
  assertNotNull(actual);
  assertEquals("[D", actual.getClass().getName());
  assertEquals("[0.4886072724413566, -0.733170177190502, -0.6586914497498587, -0.5356473743003551, -0.4415558817253674, 0.9218396710299722, -0.910448889590231, 0.4864959653599366, 0.3302937667489272, 0.30103886506196...#662#-782118670", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getMean=0.0, getStandardDeviation=1.0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput189() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.distribution.NormalDistributionImpl", "org.apache.commons.math.distribution.NormalDistributionImpl", "getInitialDomain", new String[]{"double"}, new String[]{"0.5"}, false, 0, null, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("0.0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getMean=0.0, getStandardDeviation=1.0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput190() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.distribution.NormalDistributionImpl", "org.apache.commons.math.distribution.NormalDistributionImpl", "inverseCumulativeProbability", new String[]{"double"}, new String[]{"0.05999999999999997"}, false, 0, null, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("-1.5547735946032646", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getMean=0.0, getStandardDeviation=1.0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput191() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.distribution.NormalDistributionImpl", "org.apache.commons.math.distribution.NormalDistributionImpl", "inverseCumulativeProbability", new String[]{"double"}, new String[]{"0.6523"}, false, 0, null, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("0.39153746690121677", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getMean=0.0, getStandardDeviation=1.0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput192() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.distribution.NormalDistributionImpl", "org.apache.commons.math.distribution.NormalDistributionImpl", "inverseCumulativeProbability", new String[]{"double"}, new String[]{"1.0000000000000003E-9"}, false, 0, new String[][]{{"org.apache.commons.math.distribution.NormalDistributionImpl", "cumulativeProbability", "double,double", "1.0", "-14.999999999999998"}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("-5.997807014826545", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getMean=0.0, getStandardDeviation=1.0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput193() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.distribution.NormalDistributionImpl", "org.apache.commons.math.distribution.NormalDistributionImpl", "cumulativeProbability", new String[]{"double"}, new String[]{"1.0E-10"}, false, 3, new String[][]{{"org.apache.commons.math.distribution.NormalDistributionImpl", "sample", "int", "0"}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("0.5000000000398942", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getMean=0.0, getStandardDeviation=1.0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput194() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.distribution.NormalDistributionImpl", "org.apache.commons.math.distribution.NormalDistributionImpl", "cumulativeProbability", new String[]{"double", "double"}, new String[]{"5.0E-11", "2.1080615000000016"}, false, 0, new String[][]{{"org.apache.commons.math.distribution.NormalDistributionImpl", "sample", ""}, {"org.apache.commons.math.distribution.NormalDistributionImpl", "getStandardDeviation", ""}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("0.4824871649331721", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getMean=0.0, getStandardDeviation=1.0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput195() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math.distribution.NormalDistributionImpl", "org.apache.commons.math.distribution.NormalDistributionImpl", "inverseCumulativeProbability", new String[]{"double"}, new String[]{"-0.16477000000000003"}, false, 0, new String[][]{{"org.apache.commons.math.distribution.NormalDistributionImpl", "sample", "int", "-1"}}, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("org.apache.commons.math.exception.OutOfRangeException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput196() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.distribution.NormalDistributionImpl", "org.apache.commons.math.distribution.NormalDistributionImpl", "getDomainUpperBound", new String[]{"double"}, new String[]{"0.06523"}, false, 2, new String[][]{{"org.apache.commons.math.distribution.NormalDistributionImpl", "getInitialDomain", "double", "2.0"}, {"org.apache.commons.math.distribution.NormalDistributionImpl", "sample", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("1.0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getMean=1.0, getStandardDeviation=Infinity}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput197() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.distribution.NormalDistributionImpl", "org.apache.commons.math.distribution.NormalDistributionImpl", "cumulativeProbability", new String[]{"double", "double"}, new String[]{"1.0E-10", "504.15229999999997"}, false, 7, new String[][]{{"org.apache.commons.math.distribution.NormalDistributionImpl", "getStandardDeviation", ""}, {"org.apache.commons.math.distribution.NormalDistributionImpl", "sample", "int", "5"}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("0.0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getMean=1.0, getStandardDeviation=Infinity}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput198() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.distribution.NormalDistributionImpl", "org.apache.commons.math.distribution.NormalDistributionImpl", "inverseCumulativeProbability", new String[]{"double"}, new String[]{"2.0E-9"}, false, 0, new String[][]{{"org.apache.commons.math.distribution.NormalDistributionImpl", "cumulativeProbability", "double,double", "1.0000000000000003E-9", "1.9999999999999998"}, {"org.apache.commons.math.distribution.NormalDistributionImpl", "cumulativeProbability", "double,double", "1.9999999999999998", "Infinity"}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("-5.884193353396644", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getMean=0.0, getStandardDeviation=1.0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput199() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.distribution.NormalDistributionImpl", "org.apache.commons.math.distribution.NormalDistributionImpl", "inverseCumulativeProbability", new String[]{"double"}, new String[]{"1.0E-10"}, false, 0, new String[][]{{"org.apache.commons.math.distribution.NormalDistributionImpl", "cumulativeProbability", "double,double", "1.0000000000000003E-9", "1.9999999999999998"}, {"org.apache.commons.math.distribution.NormalDistributionImpl", "cumulativeProbability", "double,double", "1.9999999999999998", "Infinity"}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("-6.3613409313794325", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getMean=0.0, getStandardDeviation=1.0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput200() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.distribution.NormalDistributionImpl", "org.apache.commons.math.distribution.NormalDistributionImpl", "inverseCumulativeProbability", new String[]{"double"}, new String[]{"0.020000001"}, false, 3, new String[][]{}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("-2.0537488899927845", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getMean=0.0, getStandardDeviation=1.0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput201() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.distribution.NormalDistributionImpl", "org.apache.commons.math.distribution.NormalDistributionImpl", "getDomainUpperBound", new String[]{"double"}, new String[]{"0.5"}, false, 4, new String[][]{{"org.apache.commons.math.distribution.NormalDistributionImpl", "cumulativeProbability", "double,double", "40.0", "-0.5"}, {"org.apache.commons.math.distribution.NormalDistributionImpl", "getStandardDeviation", ""}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("1.7976931348623157E308", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getMean=0.0, getStandardDeviation=1.0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput202() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.distribution.NormalDistributionImpl", "org.apache.commons.math.distribution.NormalDistributionImpl", "getMean", new String[]{}, new String[]{}, false, 7, new String[][]{{"org.apache.commons.math.distribution.NormalDistributionImpl", "getInitialDomain", "double", "8.988465674311579E307"}, {"org.apache.commons.math.distribution.NormalDistributionImpl", "cumulativeProbability", "double", "-0.6857699999999995"}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("1.0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getMean=1.0, getStandardDeviation=Infinity}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput203() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.distribution.NormalDistributionImpl", "org.apache.commons.math.distribution.NormalDistributionImpl", "cumulativeProbability", new String[]{"double"}, new String[]{"1.0E-9"}, false, 0, null, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("0.5000000003989423", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getMean=0.0, getStandardDeviation=1.0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput204() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math.distribution.NormalDistributionImpl", "org.apache.commons.math.distribution.NormalDistributionImpl", "inverseCumulativeProbability", new String[]{"double"}, new String[]{"NaN"}, false, 0, new String[][]{{"org.apache.commons.math.distribution.NormalDistributionImpl", "inverseCumulativeProbability", "double", "0.6523"}}, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("org.apache.commons.math.exception.MathUserException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput205() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math.distribution.NormalDistributionImpl", "org.apache.commons.math.distribution.NormalDistributionImpl", "inverseCumulativeProbability", new String[]{"double"}, new String[]{"NaN"}, false, 8, new String[][]{{"org.apache.commons.math.distribution.NormalDistributionImpl", "sample", "int", "-58"}, {"org.apache.commons.math.distribution.NormalDistributionImpl", "inverseCumulativeProbability", "double", "0.6523"}}, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("org.apache.commons.math.exception.MathUserException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput206() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.distribution.NormalDistributionImpl", "org.apache.commons.math.distribution.NormalDistributionImpl", "inverseCumulativeProbability", new String[]{"double"}, new String[]{"0.45000000001"}, false, 0, new String[][]{{"org.apache.commons.math.distribution.NormalDistributionImpl", "getDomainUpperBound", "double", "0.5"}, {"org.apache.commons.math.distribution.NormalDistributionImpl", "density", "double", "0.0"}, {"org.apache.commons.math.distribution.NormalDistributionImpl", "getStandardDeviation", ""}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("-0.12566134683019978", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getMean=0.0, getStandardDeviation=1.0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput207() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.distribution.NormalDistributionImpl", "org.apache.commons.math.distribution.NormalDistributionImpl", "inverseCumulativeProbability", new String[]{"double"}, new String[]{"0.5000000000025"}, false, 10, new String[][]{{"org.apache.commons.math.distribution.NormalDistributionImpl", "inverseCumulativeProbability", "double", "-1.7976931348623157E308"}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("0.0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getMean=0.0, getStandardDeviation=1.0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput208() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.distribution.NormalDistributionImpl", "org.apache.commons.math.distribution.NormalDistributionImpl", "inverseCumulativeProbability", new String[]{"double"}, new String[]{"0.5000000000025"}, false, 10, new String[][]{{"org.apache.commons.math.distribution.NormalDistributionImpl", "reseedRandomGenerator", "long", "40"}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("0.0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getMean=0.0, getStandardDeviation=1.0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput209() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.distribution.NormalDistributionImpl", "org.apache.commons.math.distribution.NormalDistributionImpl", "inverseCumulativeProbability", new String[]{"double"}, new String[]{"5.000000000000001E-10"}, false, 9, new String[][]{{"org.apache.commons.math.distribution.NormalDistributionImpl", "sample", ""}, {"org.apache.commons.math.distribution.NormalDistributionImpl", "density", "double", "0.25"}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("-6.109410200766034", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getMean=0.0, getStandardDeviation=1.0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput210() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.distribution.NormalDistributionImpl", "org.apache.commons.math.distribution.NormalDistributionImpl", "inverseCumulativeProbability", new String[]{"double"}, new String[]{"0.7200000002499999"}, false, 10, new String[][]{{"org.apache.commons.math.distribution.NormalDistributionImpl", "getSolverAbsoluteAccuracy", ""}, {"org.apache.commons.math.distribution.NormalDistributionImpl", "getSolverAbsoluteAccuracy", ""}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("0.5828415080138784", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getMean=0.0, getStandardDeviation=1.0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput211() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.distribution.NormalDistributionImpl", "org.apache.commons.math.distribution.NormalDistributionImpl", "inverseCumulativeProbability", new String[]{"double"}, new String[]{"0.7200000002499999"}, false, 10, new String[][]{{"org.apache.commons.math.distribution.NormalDistributionImpl", "getSolverAbsoluteAccuracy", ""}, {"org.apache.commons.math.distribution.NormalDistributionImpl", "getSolverAbsoluteAccuracy", ""}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("0.5828415080138784", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getMean=0.0, getStandardDeviation=1.0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput212() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.distribution.NormalDistributionImpl", "org.apache.commons.math.distribution.NormalDistributionImpl", "inverseCumulativeProbability", new String[]{"double"}, new String[]{"1.0E-9"}, false, 4, new String[][]{{"org.apache.commons.math.distribution.NormalDistributionImpl", "getDomainUpperBound", "double", "0.5"}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("-5.997807014826545", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getMean=0.0, getStandardDeviation=1.0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput213() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.distribution.NormalDistributionImpl", "org.apache.commons.math.distribution.NormalDistributionImpl", "cumulativeProbability", new String[]{"double", "double"}, new String[]{"-Infinity", "0.0"}, false, 11, new String[][]{{"org.apache.commons.math.distribution.NormalDistributionImpl", "sample", ""}, {"org.apache.commons.math.distribution.NormalDistributionImpl", "getDomainLowerBound", "double", "1.0"}, {"org.apache.commons.math.distribution.NormalDistributionImpl", "getInitialDomain", "double", "8589540077390120676"}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("0.5", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getMean=0.0, getStandardDeviation=1.0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput214() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.distribution.NormalDistributionImpl", "org.apache.commons.math.distribution.NormalDistributionImpl", "density", new String[]{"double"}, new String[]{"3.1738500000000007"}, false, 2, new String[][]{{"org.apache.commons.math.distribution.NormalDistributionImpl", "getDomainLowerBound", "double", "1.7976931348623157E308"}, {"org.apache.commons.math.distribution.NormalDistributionImpl", "inverseCumulativeProbability", "double", "5.0E-11"}, {"org.apache.commons.math.distribution.NormalDistributionImpl", "getMean", ""}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("0.0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getMean=1.0, getStandardDeviation=Infinity}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput215() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.distribution.NormalDistributionImpl", "org.apache.commons.math.distribution.NormalDistributionImpl", "cumulativeProbability", new String[]{"double", "double"}, new String[]{"-15.0", "-3.6"}, false, 8, new String[][]{{"org.apache.commons.math.distribution.NormalDistributionImpl", "sample", "int", "19"}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("1.5910859015755285E-4", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getMean=0.0, getStandardDeviation=1.0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput216() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.distribution.NormalDistributionImpl", "org.apache.commons.math.distribution.NormalDistributionImpl", "cumulativeProbability", new String[]{"double", "double"}, new String[]{"-7.5", "-3.6"}, false, 3, new String[][]{{"org.apache.commons.math.distribution.NormalDistributionImpl", "sample", "int", "19"}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("1.5910859012563394E-4", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getMean=0.0, getStandardDeviation=1.0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput217() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.distribution.NormalDistributionImpl", "org.apache.commons.math.distribution.NormalDistributionImpl", "cumulativeProbability", new String[]{"double", "double"}, new String[]{"-15.0", "-4.300000000000001"}, false, 3, new String[][]{{"org.apache.commons.math.distribution.NormalDistributionImpl", "sample", "int", "2147483647"}, {"org.apache.commons.math.distribution.NormalDistributionImpl", "inverseCumulativeProbability", "double", "-1.0"}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("8.539905471005582E-6", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getMean=0.0, getStandardDeviation=1.0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput218() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.distribution.NormalDistributionImpl", "org.apache.commons.math.distribution.NormalDistributionImpl", "getInitialDomain", new String[]{"double"}, new String[]{"NaN"}, false, 0, null, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("0.0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getMean=0.0, getStandardDeviation=1.0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput219() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.distribution.NormalDistributionImpl", "org.apache.commons.math.distribution.NormalDistributionImpl", "getSolverAbsoluteAccuracy", new String[]{}, new String[]{}, false, 11, new String[][]{{"org.apache.commons.math.distribution.NormalDistributionImpl", "getDomainLowerBound", "double", "-1.0"}, {"org.apache.commons.math.distribution.NormalDistributionImpl", "getDomainLowerBound", "double", "NaN"}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("Infinity", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getMean=0.0, getStandardDeviation=1.0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput220() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.distribution.NormalDistributionImpl", "org.apache.commons.math.distribution.NormalDistributionImpl", "getInitialDomain", new String[]{"double"}, new String[]{"1.7976931348623157E308"}, false, 2, new String[][]{}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("Infinity", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getMean=1.0, getStandardDeviation=Infinity}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput221() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.distribution.NormalDistributionImpl", "org.apache.commons.math.distribution.NormalDistributionImpl", "cumulativeProbability", new String[]{"double"}, new String[]{"-0.019999999000000004"}, false, 0, new String[][]{{"org.apache.commons.math.distribution.NormalDistributionImpl", "sample", "int", "2147483631"}, {"org.apache.commons.math.distribution.NormalDistributionImpl", "inverseCumulativeProbability", "double", "Infinity"}, {"org.apache.commons.math.distribution.NormalDistributionImpl", "getStandardDeviation", ""}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("0.4920216866819605", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getMean=0.0, getStandardDeviation=1.0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput222() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.distribution.NormalDistributionImpl", "org.apache.commons.math.distribution.NormalDistributionImpl", "cumulativeProbability", new String[]{"double"}, new String[]{"0.013000000999999997"}, false, 0, new String[][]{{"org.apache.commons.math.distribution.NormalDistributionImpl", "sample", "int", "2147483631"}, {"org.apache.commons.math.distribution.NormalDistributionImpl", "inverseCumulativeProbability", "double", "Infinity"}, {"org.apache.commons.math.distribution.NormalDistributionImpl", "getStandardDeviation", ""}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("0.5051861039684652", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getMean=0.0, getStandardDeviation=1.0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput223() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.distribution.NormalDistributionImpl", "org.apache.commons.math.distribution.NormalDistributionImpl", "cumulativeProbability", new String[]{"double"}, new String[]{"0.6523"}, false, 0, new String[][]{{"org.apache.commons.math.distribution.NormalDistributionImpl", "sample", "int", "2147483631"}, {"org.apache.commons.math.distribution.NormalDistributionImpl", "inverseCumulativeProbability", "double", "Infinity"}, {"org.apache.commons.math.distribution.NormalDistributionImpl", "getStandardDeviation", ""}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("0.7428961699735487", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getMean=0.0, getStandardDeviation=1.0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput224() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.distribution.NormalDistributionImpl", "org.apache.commons.math.distribution.NormalDistributionImpl", "getSolverAbsoluteAccuracy", new String[]{}, new String[]{}, false, 2, new String[][]{{"org.apache.commons.math.distribution.NormalDistributionImpl", "cumulativeProbability", "double", "0.6523"}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("-Infinity", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getMean=1.0, getStandardDeviation=Infinity}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput225() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.distribution.NormalDistributionImpl", "org.apache.commons.math.distribution.NormalDistributionImpl", "getDomainUpperBound", new String[]{"double"}, new String[]{"1.0E-9"}, false, 7, new String[][]{{"org.apache.commons.math.distribution.NormalDistributionImpl", "cumulativeProbability", "double,double", "1.9999999999999998", "6.283185307179586"}, {"org.apache.commons.math.distribution.NormalDistributionImpl", "sample", ""}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("1.0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getMean=1.0, getStandardDeviation=Infinity}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput226() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.distribution.NormalDistributionImpl", "org.apache.commons.math.distribution.NormalDistributionImpl", "reseedRandomGenerator", new String[]{"long"}, new String[]{"4299273638322430864"}, false, 2, new String[][]{{"org.apache.commons.math.distribution.NormalDistributionImpl", "getDomainUpperBound", "double", "-0.3428849999999998"}}, 1);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getMean=1.0, getStandardDeviation=Infinity}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput227() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.distribution.NormalDistributionImpl", "org.apache.commons.math.distribution.NormalDistributionImpl", "cumulativeProbability", new String[]{"double"}, new String[]{"6.283185307179586"}, false, 7, new String[][]{{"org.apache.commons.math.distribution.NormalDistributionImpl", "inverseCumulativeProbability", "double", "0.5"}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("0.5", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getMean=1.0, getStandardDeviation=Infinity}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput228() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.distribution.NormalDistributionImpl", "org.apache.commons.math.distribution.NormalDistributionImpl", "getInitialDomain", new String[]{"double"}, new String[]{"1.7976931348623157E308"}, false, 7, new String[][]{{"org.apache.commons.math.distribution.NormalDistributionImpl", "getDomainUpperBound", "double", "8589540077390120676"}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("Infinity", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getMean=1.0, getStandardDeviation=Infinity}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput229() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.distribution.NormalDistributionImpl", "org.apache.commons.math.distribution.NormalDistributionImpl", "inverseCumulativeProbability", new String[]{"double"}, new String[]{"0.0065229999999999976"}, false, 0, new String[][]{{"org.apache.commons.math.distribution.NormalDistributionImpl", "getSolverAbsoluteAccuracy", ""}, {"org.apache.commons.math.distribution.NormalDistributionImpl", "cumulativeProbability", "double,double", "1.0E-10", "0.0"}, {"org.apache.commons.math.distribution.NormalDistributionImpl", "inverseCumulativeProbability", "double", "1.0"}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("-2.48251110898783", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getMean=0.0, getStandardDeviation=1.0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput230() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.distribution.NormalDistributionImpl", "org.apache.commons.math.distribution.NormalDistributionImpl", "cumulativeProbability", new String[]{"double", "double"}, new String[]{"-7.727000000000001", "4.2947700386950611E17"}, false, 7, new String[][]{{"org.apache.commons.math.distribution.NormalDistributionImpl", "getDomainLowerBound", "double", "-1.0"}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("0.0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getMean=1.0, getStandardDeviation=Infinity}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput231() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.distribution.NormalDistributionImpl", "org.apache.commons.math.distribution.NormalDistributionImpl", "getDomainUpperBound", new String[]{"double"}, new String[]{"0.9999999999999999"}, false, 2, new String[][]{{"org.apache.commons.math.distribution.NormalDistributionImpl", "getMean", ""}, {"org.apache.commons.math.distribution.NormalDistributionImpl", "getDomainUpperBound", "double", "15.0"}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("1.7976931348623157E308", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getMean=1.0, getStandardDeviation=Infinity}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput232() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.distribution.NormalDistributionImpl", "org.apache.commons.math.distribution.NormalDistributionImpl", "getSolverAbsoluteAccuracy", new String[]{}, new String[]{}, false, 11, new String[][]{}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("Infinity", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getMean=0.0, getStandardDeviation=1.0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput233() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.distribution.NormalDistributionImpl", "org.apache.commons.math.distribution.NormalDistributionImpl", "getInitialDomain", new String[]{"double"}, new String[]{"NaN"}, false, 1, new String[][]{{"org.apache.commons.math.distribution.NormalDistributionImpl", "inverseCumulativeProbability", "double", "0.05"}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("0.0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getMean=0.0, getStandardDeviation=1.0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput234() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.distribution.NormalDistributionImpl", "org.apache.commons.math.distribution.NormalDistributionImpl", "cumulativeProbability", new String[]{"double"}, new String[]{"5.243185307179586"}, false, 2, new String[][]{{"org.apache.commons.math.distribution.NormalDistributionImpl", "density", "double", "0.19999999999999996"}, {"org.apache.commons.math.distribution.NormalDistributionImpl", "reseedRandomGenerator", "long", "2"}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("0.5", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getMean=1.0, getStandardDeviation=Infinity}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput235() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.distribution.NormalDistributionImpl", "org.apache.commons.math.distribution.NormalDistributionImpl", "getInitialDomain", new String[]{"double"}, new String[]{"Infinity"}, false, 7, new String[][]{}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("Infinity", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getMean=1.0, getStandardDeviation=Infinity}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput236() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.distribution.NormalDistributionImpl", "org.apache.commons.math.distribution.NormalDistributionImpl", "getDomainLowerBound", new String[]{"double"}, new String[]{"-41.70000000000001"}, false, 2, new String[][]{{"org.apache.commons.math.distribution.NormalDistributionImpl", "getDomainLowerBound", "double", "3.141592653589793"}, {"org.apache.commons.math.distribution.NormalDistributionImpl", "getInitialDomain", "double", "-0.6857699999999995"}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("-1.7976931348623157E308", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getMean=1.0, getStandardDeviation=Infinity}", SearchInputFactory_scaffolding.receiverState());
 }
}
