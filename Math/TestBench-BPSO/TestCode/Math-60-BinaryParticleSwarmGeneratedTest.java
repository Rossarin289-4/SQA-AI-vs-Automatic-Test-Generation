package generated.algorithm;

import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;
import static org.junit.Assert.*;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class BinaryParticleSwarmGeneratedTest {
 @Test(timeout = 20000)
 public void generatedInput000() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.distribution.NormalDistributionImpl", "org.apache.commons.math.distribution.NormalDistributionImpl", "density", new String[]{"double"}, new String[]{"-0.5"}, false, 0, new String[][]{{"org.apache.commons.math.distribution.NormalDistributionImpl", "getDomainLowerBound", "double", "0.0"}});
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("0.3520653267642995", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getMean=0.0, getStandardDeviation=1.0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput001() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.distribution.NormalDistributionImpl", "org.apache.commons.math.distribution.NormalDistributionImpl", "cumulativeProbability", new String[]{"double"}, new String[]{"0.66"}, false, 2, new String[][]{{"org.apache.commons.math.distribution.NormalDistributionImpl", "sample", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("0.5", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getMean=1.0, getStandardDeviation=Infinity}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput002() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.distribution.NormalDistributionImpl", "org.apache.commons.math.distribution.NormalDistributionImpl", "getSolverAbsoluteAccuracy", new String[]{}, new String[]{}, false, 7, new String[][]{{"org.apache.commons.math.distribution.NormalDistributionImpl", "getMean", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("1.0E-9", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getMean=1.0, getStandardDeviation=Infinity}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput003() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.distribution.NormalDistributionImpl", "org.apache.commons.math.distribution.NormalDistributionImpl", "inverseCumulativeProbability", new String[]{"double"}, new String[]{"0.19999999999999998"}, false);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("-0.841621233572914", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getMean=0.0, getStandardDeviation=1.0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput004() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.distribution.NormalDistributionImpl", "org.apache.commons.math.distribution.NormalDistributionImpl", "getMean", new String[]{}, new String[]{}, false, 6, new String[][]{{"org.apache.commons.math.distribution.NormalDistributionImpl", "getDomainLowerBound", "double", "2.0000000000000004"}});
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("0.0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getMean=0.0, getStandardDeviation=1.0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput005() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.distribution.NormalDistributionImpl", "org.apache.commons.math.distribution.NormalDistributionImpl", "density", new String[]{"double"}, new String[]{"-1.0"}, false, 1, new String[][]{}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("0.24197072451914337", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getMean=0.0, getStandardDeviation=1.0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput006() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.distribution.NormalDistributionImpl", "org.apache.commons.math.distribution.NormalDistributionImpl", "getDomainLowerBound", new String[]{"double"}, new String[]{"0.66"}, false);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("0.0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getMean=0.0, getStandardDeviation=1.0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput007() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math.distribution.NormalDistributionImpl", "org.apache.commons.math.distribution.NormalDistributionImpl", "inverseCumulativeProbability", new String[]{"double"}, new String[]{"Infinity"}, false, 0, new String[][]{{"org.apache.commons.math.distribution.NormalDistributionImpl", "getInitialDomain", "double", "-0.05"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("org.apache.commons.math.exception.OutOfRangeException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput008() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.distribution.NormalDistributionImpl", "org.apache.commons.math.distribution.NormalDistributionImpl", "getStandardDeviation", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.math.distribution.NormalDistributionImpl", "getInitialDomain", "double", "58.0"}, {"org.apache.commons.math.distribution.NormalDistributionImpl", "getDomainLowerBound", "double", "-0.5"}});
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("1.0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getMean=0.0, getStandardDeviation=1.0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput009() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.distribution.NormalDistributionImpl", "org.apache.commons.math.distribution.NormalDistributionImpl", "getInitialDomain", new String[]{"double"}, new String[]{"-6.283185307179586"}, false);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("-1.0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getMean=0.0, getStandardDeviation=1.0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput010() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.distribution.NormalDistributionImpl", "org.apache.commons.math.distribution.NormalDistributionImpl", "cumulativeProbability", new String[]{"double"}, new String[]{"-40.0"}, false, 0, new String[][]{{"org.apache.commons.math.distribution.NormalDistributionImpl", "getStandardDeviation", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("0.0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getMean=0.0, getStandardDeviation=1.0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput011() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.distribution.NormalDistributionImpl", "org.apache.commons.math.distribution.NormalDistributionImpl", "getInitialDomain", new String[]{"double"}, new String[]{"1.0E-10"}, false, 5, new String[][]{});
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("-1.0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getMean=0.0, getStandardDeviation=1.0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput012() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.distribution.NormalDistributionImpl", "org.apache.commons.math.distribution.NormalDistributionImpl", "cumulativeProbability", new String[]{"double"}, new String[]{"-1.0"}, false);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("0.15865525393145702", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getMean=0.0, getStandardDeviation=1.0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput013() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.distribution.NormalDistributionImpl", "org.apache.commons.math.distribution.NormalDistributionImpl", "cumulativeProbability", new String[]{"double", "double"}, new String[]{"-1.7179080154780242E19", "0.12"}, false);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("0.5477584260205839", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getMean=0.0, getStandardDeviation=1.0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput014() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.distribution.NormalDistributionImpl", "org.apache.commons.math.distribution.NormalDistributionImpl", "cumulativeProbability", new String[]{"double"}, new String[]{"1.0E-9"}, false);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("0.5000000003989423", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getMean=0.0, getStandardDeviation=1.0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput015() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.distribution.NormalDistributionImpl", "org.apache.commons.math.distribution.NormalDistributionImpl", "density", new String[]{"double"}, new String[]{"-57.99999999999999"}, false, 0, new String[][]{{"org.apache.commons.math.distribution.NormalDistributionImpl", "getSolverAbsoluteAccuracy", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("0.0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getMean=0.0, getStandardDeviation=1.0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput016() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.distribution.NormalDistributionImpl", "org.apache.commons.math.distribution.NormalDistributionImpl", "reseedRandomGenerator", new String[]{"long"}, new String[]{"9223372036854775807"}, false, 5, new String[][]{});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getMean=0.0, getStandardDeviation=1.0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput017() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.distribution.NormalDistributionImpl", "org.apache.commons.math.distribution.NormalDistributionImpl", "density", new String[]{"double"}, new String[]{"8.2"}, false, 0, new String[][]{{"org.apache.commons.math.distribution.NormalDistributionImpl", "cumulativeProbability", "double", "-0.0029999999899999997"}});
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("9.99837874849718E-16", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getMean=0.0, getStandardDeviation=1.0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput018() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.distribution.NormalDistributionImpl", "org.apache.commons.math.distribution.NormalDistributionImpl", "getSolverAbsoluteAccuracy", new String[]{}, new String[]{}, false, 5, new String[][]{}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("1.0E-9", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getMean=0.0, getStandardDeviation=1.0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput019() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.distribution.NormalDistributionImpl", "org.apache.commons.math.distribution.NormalDistributionImpl", "cumulativeProbability", new String[]{"double"}, new String[]{"Infinity"}, false, 3, new String[][]{{"org.apache.commons.math.distribution.NormalDistributionImpl", "sample", "int", "82"}, {"org.apache.commons.math.distribution.NormalDistributionImpl", "getMean", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("1.0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getMean=0.0, getStandardDeviation=1.0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput020() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.distribution.NormalDistributionImpl", "org.apache.commons.math.distribution.NormalDistributionImpl", "cumulativeProbability", new String[]{"double"}, new String[]{"-0.107"}, false);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("0.4573944898778655", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getMean=0.0, getStandardDeviation=1.0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput021() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.distribution.NormalDistributionImpl", "org.apache.commons.math.distribution.NormalDistributionImpl", "cumulativeProbability", new String[]{"double"}, new String[]{"0.56"}, false, 4, new String[][]{{"org.apache.commons.math.distribution.NormalDistributionImpl", "inverseCumulativeProbability", "double", "58.0"}});
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("0.712260281150973", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getMean=0.0, getStandardDeviation=1.0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput022() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.distribution.NormalDistributionImpl", "org.apache.commons.math.distribution.NormalDistributionImpl", "density", new String[]{"double"}, new String[]{"0.45399999999999996"}, false);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("0.35987571861535667", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getMean=0.0, getStandardDeviation=1.0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput023() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math.distribution.NormalDistributionImpl", "org.apache.commons.math.distribution.NormalDistributionImpl", "sample", new String[]{"int"}, new String[]{"-134217727"}, false); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("org.apache.commons.math.exception.NotStrictlyPositiveException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput024() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.distribution.NormalDistributionImpl", "org.apache.commons.math.distribution.NormalDistributionImpl", "getSolverAbsoluteAccuracy", new String[]{}, new String[]{}, false);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("1.0E-9", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getMean=0.0, getStandardDeviation=1.0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput025() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.distribution.NormalDistributionImpl", "org.apache.commons.math.distribution.NormalDistributionImpl", "cumulativeProbability", new String[]{"double", "double"}, new String[]{"1.9999999999999997E-9", "38.000000001"}, false);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("0.49999999920211546", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getMean=0.0, getStandardDeviation=1.0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput026() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.distribution.NormalDistributionImpl", "org.apache.commons.math.distribution.NormalDistributionImpl", "getDomainLowerBound", new String[]{"double"}, new String[]{"0.11999999999999998"}, false, 0, new String[][]{{"org.apache.commons.math.distribution.NormalDistributionImpl", "getMean", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("-1.7976931348623157E308", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getMean=0.0, getStandardDeviation=1.0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput027() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.distribution.NormalDistributionImpl", "org.apache.commons.math.distribution.NormalDistributionImpl", "cumulativeProbability", new String[]{"double", "double"}, new String[]{"2.62", "29.62"}, false, 0, new String[][]{{"org.apache.commons.math.distribution.NormalDistributionImpl", "reseedRandomGenerator", "long", "9223372036854775807"}});
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("0.004396488348121341", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getMean=0.0, getStandardDeviation=1.0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput028() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.distribution.NormalDistributionImpl", "org.apache.commons.math.distribution.NormalDistributionImpl", "inverseCumulativeProbability", new String[]{"double"}, new String[]{"1.0E-9"}, false);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("-5.997807014826545", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getMean=0.0, getStandardDeviation=1.0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput029() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.distribution.NormalDistributionImpl", "org.apache.commons.math.distribution.NormalDistributionImpl", "getInitialDomain", new String[]{"double"}, new String[]{"9.999999999999999E-11"}, false, 7, new String[][]{{"org.apache.commons.math.distribution.NormalDistributionImpl", "getStandardDeviation", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("-Infinity", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getMean=1.0, getStandardDeviation=Infinity}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput030() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.distribution.NormalDistributionImpl", "org.apache.commons.math.distribution.NormalDistributionImpl", "getInitialDomain", new String[]{"double"}, new String[]{"580.037"}, false, 0, new String[][]{{"org.apache.commons.math.distribution.NormalDistributionImpl", "getStandardDeviation", ""}, {"org.apache.commons.math.distribution.NormalDistributionImpl", "getMean", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("1.0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getMean=0.0, getStandardDeviation=1.0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput031() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.distribution.NormalDistributionImpl", "org.apache.commons.math.distribution.NormalDistributionImpl", "density", new String[]{"double"}, new String[]{"0.12"}, false, 0, new String[][]{{"org.apache.commons.math.distribution.NormalDistributionImpl", "getStandardDeviation", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("0.3960802117936561", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getMean=0.0, getStandardDeviation=1.0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput032() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.distribution.NormalDistributionImpl", "org.apache.commons.math.distribution.NormalDistributionImpl", "cumulativeProbability", new String[]{"double"}, new String[]{"1.0"}, false);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("0.841344746068543", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getMean=0.0, getStandardDeviation=1.0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput033() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.distribution.NormalDistributionImpl", "org.apache.commons.math.distribution.NormalDistributionImpl", "inverseCumulativeProbability", new String[]{"double"}, new String[]{"0.05"}, false, 4, new String[][]{{"org.apache.commons.math.distribution.NormalDistributionImpl", "cumulativeProbability", "double,double", "-0.9999999999999999", "8589540077390120676"}});
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("-1.6448536269535292", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getMean=0.0, getStandardDeviation=1.0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput034() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.distribution.NormalDistributionImpl", "org.apache.commons.math.distribution.NormalDistributionImpl", "getDomainUpperBound", new String[]{"double"}, new String[]{"-1.002"}, false, 1, new String[][]{{"org.apache.commons.math.distribution.NormalDistributionImpl", "reseedRandomGenerator", "long", "5"}});
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("0.0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getMean=0.0, getStandardDeviation=1.0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput035() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.distribution.NormalDistributionImpl", "org.apache.commons.math.distribution.NormalDistributionImpl", "cumulativeProbability", new String[]{"double"}, new String[]{"-0.014"}, false, 0, new String[][]{{"org.apache.commons.math.distribution.NormalDistributionImpl", "sample", "int", "82"}, {"org.apache.commons.math.distribution.NormalDistributionImpl", "getInitialDomain", "double", "5.0E-10"}});
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("0.494414990518619", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getMean=0.0, getStandardDeviation=1.0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput036() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.distribution.NormalDistributionImpl", "org.apache.commons.math.distribution.NormalDistributionImpl", "cumulativeProbability", new String[]{"double"}, new String[]{"1.0"}, false, 0, new String[][]{{"org.apache.commons.math.distribution.NormalDistributionImpl", "sample", "int", "-20"}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("0.841344746068543", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getMean=0.0, getStandardDeviation=1.0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput037() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.distribution.NormalDistributionImpl", "org.apache.commons.math.distribution.NormalDistributionImpl", "density", new String[]{"double"}, new String[]{"-1.0"}, false);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("0.24197072451914337", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getMean=0.0, getStandardDeviation=1.0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput038() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.distribution.NormalDistributionImpl", "org.apache.commons.math.distribution.NormalDistributionImpl", "inverseCumulativeProbability", new String[]{"double"}, new String[]{"0.5"}, false);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("0.0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getMean=0.0, getStandardDeviation=1.0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput039() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.distribution.NormalDistributionImpl", "org.apache.commons.math.distribution.NormalDistributionImpl", "density", new String[]{"double"}, new String[]{"-1.9800000000000002"}, false, 0, new String[][]{{"org.apache.commons.math.distribution.NormalDistributionImpl", "inverseCumulativeProbability", "double", "8589540077390120676"}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("0.056183141903868014", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getMean=0.0, getStandardDeviation=1.0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput040() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.distribution.NormalDistributionImpl", "org.apache.commons.math.distribution.NormalDistributionImpl", "cumulativeProbability", new String[]{"double", "double"}, new String[]{"-0.5", "NaN"}, false);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("NaN", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getMean=0.0, getStandardDeviation=1.0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput041() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.distribution.NormalDistributionImpl", "org.apache.commons.math.distribution.NormalDistributionImpl", "getInitialDomain", new String[]{"double"}, new String[]{"2.9000000000000004"}, false, 7, new String[][]{{"org.apache.commons.math.distribution.NormalDistributionImpl", "cumulativeProbability", "double", "-1.7976931348623157E308"}});
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("Infinity", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getMean=1.0, getStandardDeviation=Infinity}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput042() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.distribution.NormalDistributionImpl", "org.apache.commons.math.distribution.NormalDistributionImpl", "cumulativeProbability", new String[]{"double"}, new String[]{"6.66"}, false, 0, new String[][]{{"org.apache.commons.math.distribution.NormalDistributionImpl", "inverseCumulativeProbability", "double", "2.0"}});
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("0.9999999999863086", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getMean=0.0, getStandardDeviation=1.0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput043() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.distribution.NormalDistributionImpl", "org.apache.commons.math.distribution.NormalDistributionImpl", "getDomainUpperBound", new String[]{"double"}, new String[]{"29.0"}, false, 5, new String[][]{}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("1.7976931348623157E308", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getMean=0.0, getStandardDeviation=1.0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput044() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.distribution.NormalDistributionImpl", "org.apache.commons.math.distribution.NormalDistributionImpl", "cumulativeProbability", new String[]{"double", "double"}, new String[]{"-Infinity", "-2.2"}, false, 2, new String[][]{});
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("NaN", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getMean=1.0, getStandardDeviation=Infinity}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput045() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.distribution.NormalDistributionImpl", "org.apache.commons.math.distribution.NormalDistributionImpl", "density", new String[]{"double"}, new String[]{"10.0"}, false);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("7.69459862670642E-23", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getMean=0.0, getStandardDeviation=1.0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput046() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.distribution.NormalDistributionImpl", "org.apache.commons.math.distribution.NormalDistributionImpl", "density", new String[]{"double"}, new String[]{"6.283185307179586"}, false);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("1.0672854918897263E-9", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getMean=0.0, getStandardDeviation=1.0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput047() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.distribution.NormalDistributionImpl", "org.apache.commons.math.distribution.NormalDistributionImpl", "inverseCumulativeProbability", new String[]{"double"}, new String[]{"1.0"}, false, 1, new String[][]{});
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("Infinity", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getMean=0.0, getStandardDeviation=1.0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput048() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.distribution.NormalDistributionImpl", "org.apache.commons.math.distribution.NormalDistributionImpl", "cumulativeProbability", new String[]{"double", "double"}, new String[]{"0.066", "46.0"}, false, 0, new String[][]{{"org.apache.commons.math.distribution.NormalDistributionImpl", "reseedRandomGenerator", "long", "33554432"}});
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("0.4736889127280771", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getMean=0.0, getStandardDeviation=1.0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput049() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.distribution.NormalDistributionImpl", "org.apache.commons.math.distribution.NormalDistributionImpl", "cumulativeProbability", new String[]{"double"}, new String[]{"-1.717908015478024E19"}, false, 0, new String[][]{{"org.apache.commons.math.distribution.NormalDistributionImpl", "getDomainLowerBound", "double", "8.589540077390122E18"}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("0.0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getMean=0.0, getStandardDeviation=1.0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput050() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.distribution.NormalDistributionImpl", "org.apache.commons.math.distribution.NormalDistributionImpl", "density", new String[]{"double"}, new String[]{"5.400000001"}, false, 4, new String[][]{});
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("1.857361834525535E-7", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getMean=0.0, getStandardDeviation=1.0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput051() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.distribution.NormalDistributionImpl", "org.apache.commons.math.distribution.NormalDistributionImpl", "getMean", new String[]{}, new String[]{}, false, 6, new String[][]{{"org.apache.commons.math.distribution.NormalDistributionImpl", "getDomainLowerBound", "double", "0.6600000000000001"}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("0.0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getMean=0.0, getStandardDeviation=1.0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput052() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.distribution.NormalDistributionImpl", "org.apache.commons.math.distribution.NormalDistributionImpl", "sample", new String[]{"int"}, new String[]{"524329"}, false, 0, new String[][]{{"org.apache.commons.math.distribution.NormalDistributionImpl", "getMean", ""}});
  assertNotNull(actual);
  assertEquals("[D", actual.getClass().getName());
  assertEquals("receiver state after the call", "{getMean=0.0, getStandardDeviation=1.0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput053() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.distribution.NormalDistributionImpl", "org.apache.commons.math.distribution.NormalDistributionImpl", "cumulativeProbability", new String[]{"double", "double"}, new String[]{"0.25", "2.0000000000000004"}, false, 5, new String[][]{{"org.apache.commons.math.distribution.NormalDistributionImpl", "getMean", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("0.3785435423688971", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getMean=0.0, getStandardDeviation=1.0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput054() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.distribution.NormalDistributionImpl", "org.apache.commons.math.distribution.NormalDistributionImpl", "getInitialDomain", new String[]{"double"}, new String[]{"3.141592653589793"}, false, 4, new String[][]{{"org.apache.commons.math.distribution.NormalDistributionImpl", "getInitialDomain", "double", "2.0"}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("1.0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getMean=0.0, getStandardDeviation=1.0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput055() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.distribution.NormalDistributionImpl", "org.apache.commons.math.distribution.NormalDistributionImpl", "cumulativeProbability", new String[]{"double", "double"}, new String[]{"1.0000000000000001E-11", "1.0"}, false, 1, new String[][]{{"org.apache.commons.math.distribution.NormalDistributionImpl", "getMean", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("0.34134474606455356", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getMean=0.0, getStandardDeviation=1.0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput056() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.distribution.NormalDistributionImpl", "org.apache.commons.math.distribution.NormalDistributionImpl", "cumulativeProbability", new String[]{"double", "double"}, new String[]{"-6.800000000000001", "2.0"}, false, 4, new String[][]{{"org.apache.commons.math.distribution.NormalDistributionImpl", "inverseCumulativeProbability", "double", "-0.49999999999999994"}});
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("0.9772498680465898", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getMean=0.0, getStandardDeviation=1.0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput057() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.distribution.NormalDistributionImpl", "org.apache.commons.math.distribution.NormalDistributionImpl", "inverseCumulativeProbability", new String[]{"double"}, new String[]{"0.0"}, false);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("-Infinity", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getMean=0.0, getStandardDeviation=1.0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput058() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.distribution.NormalDistributionImpl", "org.apache.commons.math.distribution.NormalDistributionImpl", "getDomainLowerBound", new String[]{"double"}, new String[]{"4.9999999999999995E-11"}, false, 0, null, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("-1.7976931348623157E308", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getMean=0.0, getStandardDeviation=1.0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput059() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math.distribution.NormalDistributionImpl", "org.apache.commons.math.distribution.NormalDistributionImpl", "inverseCumulativeProbability", new String[]{"double"}, new String[]{"2.328318530717959"}, false, 0, new String[][]{{"org.apache.commons.math.distribution.NormalDistributionImpl", "sample", ""}}, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("org.apache.commons.math.exception.OutOfRangeException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput060() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.distribution.NormalDistributionImpl", "org.apache.commons.math.distribution.NormalDistributionImpl", "cumulativeProbability", new String[]{"double", "double"}, new String[]{"0.5000000000000001", "0.9999999999999999"}, false, 0, new String[][]{{"org.apache.commons.math.distribution.NormalDistributionImpl", "getInitialDomain", "double", "1.939"}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("0.1498822847945298", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getMean=0.0, getStandardDeviation=1.0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput061() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.distribution.NormalDistributionImpl", "org.apache.commons.math.distribution.NormalDistributionImpl", "getStandardDeviation", new String[]{}, new String[]{}, false, 4, new String[][]{}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("1.0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getMean=0.0, getStandardDeviation=1.0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput062() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.distribution.NormalDistributionImpl", "org.apache.commons.math.distribution.NormalDistributionImpl", "getInitialDomain", new String[]{"double"}, new String[]{"6.1000000000000005"}, false, 2, new String[][]{}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("Infinity", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getMean=1.0, getStandardDeviation=Infinity}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput063() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.distribution.NormalDistributionImpl", "org.apache.commons.math.distribution.NormalDistributionImpl", "cumulativeProbability", new String[]{"double", "double"}, new String[]{"2.0", "8.589540077390121E18"}, false, 4, new String[][]{{"org.apache.commons.math.distribution.NormalDistributionImpl", "density", "double", "2.0210000000000004"}, {"org.apache.commons.math.distribution.NormalDistributionImpl", "density", "double", "80.0"}});
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("0.02275013194817921", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getMean=0.0, getStandardDeviation=1.0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput064() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.distribution.NormalDistributionImpl", "org.apache.commons.math.distribution.NormalDistributionImpl", "inverseCumulativeProbability", new String[]{"double"}, new String[]{"0.5"}, false, 7, new String[][]{});
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("1.0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getMean=1.0, getStandardDeviation=Infinity}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput065() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.distribution.NormalDistributionImpl", "org.apache.commons.math.distribution.NormalDistributionImpl", "inverseCumulativeProbability", new String[]{"double"}, new String[]{"0.24"}, false, 0, new String[][]{{"org.apache.commons.math.distribution.NormalDistributionImpl", "cumulativeProbability", "double,double", "5.0E-10", "0.19999999999999996"}});
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("-0.7063025628400823", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getMean=0.0, getStandardDeviation=1.0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput066() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.distribution.NormalDistributionImpl", "org.apache.commons.math.distribution.NormalDistributionImpl", "reseedRandomGenerator", new String[]{"long"}, new String[]{"-6917529027641081907"}, false, 4, new String[][]{{"org.apache.commons.math.distribution.NormalDistributionImpl", "getDomainLowerBound", "double", "3.141592653589793"}}, 2);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getMean=0.0, getStandardDeviation=1.0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput067() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.distribution.NormalDistributionImpl", "org.apache.commons.math.distribution.NormalDistributionImpl", "inverseCumulativeProbability", new String[]{"double"}, new String[]{"0.066"}, false);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("-1.5062617232855746", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getMean=0.0, getStandardDeviation=1.0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput068() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.distribution.NormalDistributionImpl", "org.apache.commons.math.distribution.NormalDistributionImpl", "inverseCumulativeProbability", new String[]{"double"}, new String[]{"0.9999999999999999"}, false, 4, new String[][]{});
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("9.0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getMean=0.0, getStandardDeviation=1.0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput069() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math.distribution.NormalDistributionImpl", "org.apache.commons.math.distribution.NormalDistributionImpl", "inverseCumulativeProbability", new String[]{"double"}, new String[]{"NaN"}, false, 5, new String[][]{{"org.apache.commons.math.distribution.NormalDistributionImpl", "getMean", ""}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("org.apache.commons.math.exception.MathUserException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput070() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math.distribution.NormalDistributionImpl", "org.apache.commons.math.distribution.NormalDistributionImpl", "inverseCumulativeProbability", new String[]{"double"}, new String[]{"Infinity"}, false, 0, null, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("org.apache.commons.math.exception.OutOfRangeException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput071() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.distribution.NormalDistributionImpl", "org.apache.commons.math.distribution.NormalDistributionImpl", "inverseCumulativeProbability", new String[]{"double"}, new String[]{"1.0E-10"}, false, 0, new String[][]{{"org.apache.commons.math.distribution.NormalDistributionImpl", "inverseCumulativeProbability", "double", "-1.7976931348623155E308"}, {"org.apache.commons.math.distribution.NormalDistributionImpl", "cumulativeProbability", "double,double", "1.0", "1.0"}});
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("-6.3613409313794325", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getMean=0.0, getStandardDeviation=1.0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput072() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.distribution.NormalDistributionImpl", "org.apache.commons.math.distribution.NormalDistributionImpl", "getDomainUpperBound", new String[]{"double"}, new String[]{"6.6000000000000005"}, false, 1, new String[][]{{"org.apache.commons.math.distribution.NormalDistributionImpl", "getSolverAbsoluteAccuracy", ""}, {"org.apache.commons.math.distribution.NormalDistributionImpl", "sample", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("1.7976931348623157E308", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getMean=0.0, getStandardDeviation=1.0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput073() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.distribution.NormalDistributionImpl", "org.apache.commons.math.distribution.NormalDistributionImpl", "cumulativeProbability", new String[]{"double"}, new String[]{"4.0"}, false, 5, new String[][]{}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("0.9999683287581669", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getMean=0.0, getStandardDeviation=1.0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput074() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.distribution.NormalDistributionImpl", "org.apache.commons.math.distribution.NormalDistributionImpl", "getDomainUpperBound", new String[]{"double"}, new String[]{"-1.0"}, false, 7, new String[][]{{"org.apache.commons.math.distribution.NormalDistributionImpl", "inverseCumulativeProbability", "double", "NaN"}});
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("1.0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getMean=1.0, getStandardDeviation=Infinity}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput075() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.distribution.NormalDistributionImpl", "org.apache.commons.math.distribution.NormalDistributionImpl", "getSolverAbsoluteAccuracy", new String[]{}, new String[]{}, false, 2, new String[][]{});
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("-Infinity", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getMean=1.0, getStandardDeviation=Infinity}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput076() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.distribution.NormalDistributionImpl", "org.apache.commons.math.distribution.NormalDistributionImpl", "density", new String[]{"double"}, new String[]{"0.024"}, false, 2, new String[][]{{"org.apache.commons.math.distribution.NormalDistributionImpl", "getSolverAbsoluteAccuracy", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("0.0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getMean=1.0, getStandardDeviation=Infinity}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput077() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.distribution.NormalDistributionImpl", "org.apache.commons.math.distribution.NormalDistributionImpl", "density", new String[]{"double"}, new String[]{"58.0"}, false, 0, null, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("0.0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getMean=0.0, getStandardDeviation=1.0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput078() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.distribution.NormalDistributionImpl", "org.apache.commons.math.distribution.NormalDistributionImpl", "cumulativeProbability", new String[]{"double"}, new String[]{"0.39999999999999997"}, false, 5, new String[][]{{"org.apache.commons.math.distribution.NormalDistributionImpl", "sample", ""}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("0.6554217416103242", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getMean=0.0, getStandardDeviation=1.0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput079() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.distribution.NormalDistributionImpl", "org.apache.commons.math.distribution.NormalDistributionImpl", "cumulativeProbability", new String[]{"double"}, new String[]{"0.96"}, false, 0, null, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("0.8314723925331622", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getMean=0.0, getStandardDeviation=1.0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput080() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.distribution.NormalDistributionImpl", "org.apache.commons.math.distribution.NormalDistributionImpl", "getInitialDomain", new String[]{"double"}, new String[]{"-8.988465674311579E306"}, false, 7, new String[][]{}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("-Infinity", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getMean=1.0, getStandardDeviation=Infinity}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput081() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.distribution.NormalDistributionImpl", "org.apache.commons.math.distribution.NormalDistributionImpl", "getStandardDeviation", new String[]{}, new String[]{}, false, 2, new String[][]{{"org.apache.commons.math.distribution.NormalDistributionImpl", "sample", "int", "45"}});
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("Infinity", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getMean=1.0, getStandardDeviation=Infinity}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput082() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.distribution.NormalDistributionImpl", "org.apache.commons.math.distribution.NormalDistributionImpl", "getMean", new String[]{}, new String[]{}, false, 5, new String[][]{{"org.apache.commons.math.distribution.NormalDistributionImpl", "reseedRandomGenerator", "long", "8589540077390120638"}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("0.0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getMean=0.0, getStandardDeviation=1.0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput083() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.distribution.NormalDistributionImpl", "org.apache.commons.math.distribution.NormalDistributionImpl", "inverseCumulativeProbability", new String[]{"double"}, new String[]{"4.9E-324"}, false, 3, new String[][]{}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("-9.0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getMean=0.0, getStandardDeviation=1.0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput084() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.distribution.NormalDistributionImpl", "org.apache.commons.math.distribution.NormalDistributionImpl", "cumulativeProbability", new String[]{"double"}, new String[]{"2.0000000000000004"}, false, 0, new String[][]{{"org.apache.commons.math.distribution.NormalDistributionImpl", "getSolverAbsoluteAccuracy", ""}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("0.9772498680518208", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getMean=0.0, getStandardDeviation=1.0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput085() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.distribution.NormalDistributionImpl", "org.apache.commons.math.distribution.NormalDistributionImpl", "cumulativeProbability", new String[]{"double"}, new String[]{"0.05"}, false, 0, null, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("0.5199388058383725", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getMean=0.0, getStandardDeviation=1.0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput086() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.distribution.NormalDistributionImpl", "org.apache.commons.math.distribution.NormalDistributionImpl", "getInitialDomain", new String[]{"double"}, new String[]{"1.7976931348623157E308"}, false, 0, null, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("1.0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getMean=0.0, getStandardDeviation=1.0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput087() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.distribution.NormalDistributionImpl", "org.apache.commons.math.distribution.NormalDistributionImpl", "density", new String[]{"double"}, new String[]{"2.0"}, false, 7, new String[][]{}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("0.0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getMean=1.0, getStandardDeviation=Infinity}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput088() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.distribution.NormalDistributionImpl", "org.apache.commons.math.distribution.NormalDistributionImpl", "cumulativeProbability", new String[]{"double"}, new String[]{"-0.05"}, false, 5, new String[][]{}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("0.4800611941616275", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getMean=0.0, getStandardDeviation=1.0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput089() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.distribution.NormalDistributionImpl", "org.apache.commons.math.distribution.NormalDistributionImpl", "getStandardDeviation", new String[]{}, new String[]{}, false, 3, new String[][]{{"org.apache.commons.math.distribution.NormalDistributionImpl", "getStandardDeviation", ""}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("1.0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getMean=0.0, getStandardDeviation=1.0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput090() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.distribution.NormalDistributionImpl", "org.apache.commons.math.distribution.NormalDistributionImpl", "cumulativeProbability", new String[]{"double"}, new String[]{"2.0E-10"}, false, 2, new String[][]{}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("0.5", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getMean=1.0, getStandardDeviation=Infinity}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput091() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.distribution.NormalDistributionImpl", "org.apache.commons.math.distribution.NormalDistributionImpl", "inverseCumulativeProbability", new String[]{"double"}, new String[]{"0.19999999999999998"}, false, 1, new String[][]{}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("-0.841621233572914", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getMean=0.0, getStandardDeviation=1.0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput092() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.distribution.NormalDistributionImpl", "org.apache.commons.math.distribution.NormalDistributionImpl", "cumulativeProbability", new String[]{"double"}, new String[]{"Infinity"}, false, 0, new String[][]{{"org.apache.commons.math.distribution.NormalDistributionImpl", "getStandardDeviation", ""}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("1.0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getMean=0.0, getStandardDeviation=1.0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput093() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.distribution.NormalDistributionImpl", "org.apache.commons.math.distribution.NormalDistributionImpl", "cumulativeProbability", new String[]{"double", "double"}, new String[]{"1.0E-10", "16.66"}, false, 6, new String[][]{}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("0.4999999999601058", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getMean=0.0, getStandardDeviation=1.0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput094() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.distribution.NormalDistributionImpl", "org.apache.commons.math.distribution.NormalDistributionImpl", "cumulativeProbability", new String[]{"double"}, new String[]{"0.19999999999999998"}, false, 0, new String[][]{{"org.apache.commons.math.distribution.NormalDistributionImpl", "inverseCumulativeProbability", "double", "NaN"}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("0.579259709439103", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getMean=0.0, getStandardDeviation=1.0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput095() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math.distribution.NormalDistributionImpl", "org.apache.commons.math.distribution.NormalDistributionImpl", "inverseCumulativeProbability", new String[]{"double"}, new String[]{"8589540077390120676"}, false, 0, null, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("org.apache.commons.math.exception.OutOfRangeException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput096() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.distribution.NormalDistributionImpl", "org.apache.commons.math.distribution.NormalDistributionImpl", "cumulativeProbability", new String[]{"double"}, new String[]{"40.2"}, false, 1, new String[][]{{"org.apache.commons.math.distribution.NormalDistributionImpl", "getInitialDomain", "double", "-0.5"}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("1.0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getMean=0.0, getStandardDeviation=1.0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput097() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.distribution.NormalDistributionImpl", "org.apache.commons.math.distribution.NormalDistributionImpl", "getStandardDeviation", new String[]{}, new String[]{}, false, 0, null, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("1.0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getMean=0.0, getStandardDeviation=1.0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput098() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.distribution.NormalDistributionImpl", "org.apache.commons.math.distribution.NormalDistributionImpl", "density", new String[]{"double"}, new String[]{"0.06"}, false, 3, new String[][]{}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("0.39822483019560695", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getMean=0.0, getStandardDeviation=1.0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput099() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.distribution.NormalDistributionImpl", "org.apache.commons.math.distribution.NormalDistributionImpl", "cumulativeProbability", new String[]{"double"}, new String[]{"0.23000000000000004"}, false, 7, new String[][]{{"org.apache.commons.math.distribution.NormalDistributionImpl", "density", "double", "40.0"}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("0.5", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getMean=1.0, getStandardDeviation=Infinity}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput100() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.distribution.NormalDistributionImpl", "org.apache.commons.math.distribution.NormalDistributionImpl", "inverseCumulativeProbability", new String[]{"double"}, new String[]{"1.0"}, false, 0, new String[][]{{"org.apache.commons.math.distribution.NormalDistributionImpl", "getSolverAbsoluteAccuracy", ""}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("Infinity", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getMean=0.0, getStandardDeviation=1.0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput101() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.distribution.NormalDistributionImpl", "org.apache.commons.math.distribution.NormalDistributionImpl", "getInitialDomain", new String[]{"double"}, new String[]{"0.5"}, false);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("0.0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getMean=0.0, getStandardDeviation=1.0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput102() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.distribution.NormalDistributionImpl", "org.apache.commons.math.distribution.NormalDistributionImpl", "density", new String[]{"double"}, new String[]{"5.0"}, false, 0, new String[][]{{"org.apache.commons.math.distribution.NormalDistributionImpl", "cumulativeProbability", "double", "Infinity"}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("1.4867195147342979E-6", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getMean=0.0, getStandardDeviation=1.0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput103() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.distribution.NormalDistributionImpl", "org.apache.commons.math.distribution.NormalDistributionImpl", "getDomainLowerBound", new String[]{"double"}, new String[]{"19.999999999999996"}, false, 2, new String[][]{{"org.apache.commons.math.distribution.NormalDistributionImpl", "getInitialDomain", "double", "2.0"}});
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("1.0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getMean=1.0, getStandardDeviation=Infinity}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput104() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.distribution.NormalDistributionImpl", "org.apache.commons.math.distribution.NormalDistributionImpl", "reseedRandomGenerator", new String[]{"long"}, new String[]{"8589540077390120675"}, false, 7, new String[][]{});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getMean=1.0, getStandardDeviation=Infinity}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput105() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.distribution.NormalDistributionImpl", "org.apache.commons.math.distribution.NormalDistributionImpl", "cumulativeProbability", new String[]{"double"}, new String[]{"-0.319999999"}, false, 4, new String[][]{{"org.apache.commons.math.distribution.NormalDistributionImpl", "inverseCumulativeProbability", "double", "1.7976931348623157E308"}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("0.3744841656557105", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getMean=0.0, getStandardDeviation=1.0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput106() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.distribution.NormalDistributionImpl", "org.apache.commons.math.distribution.NormalDistributionImpl", "cumulativeProbability", new String[]{"double"}, new String[]{"-2.0000000000000004"}, false, 6, new String[][]{{"org.apache.commons.math.distribution.NormalDistributionImpl", "getInitialDomain", "double", "-1.7976931348623155E308"}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("0.02275013194817921", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getMean=0.0, getStandardDeviation=1.0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput107() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.distribution.NormalDistributionImpl", "org.apache.commons.math.distribution.NormalDistributionImpl", "cumulativeProbability", new String[]{"double"}, new String[]{"NaN"}, false, 2, new String[][]{}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("NaN", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getMean=1.0, getStandardDeviation=Infinity}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput108() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.distribution.NormalDistributionImpl", "org.apache.commons.math.distribution.NormalDistributionImpl", "cumulativeProbability", new String[]{"double", "double"}, new String[]{"-8.988465674311579E307", "1.0"}, false, 0, new String[][]{{"org.apache.commons.math.distribution.NormalDistributionImpl", "cumulativeProbability", "double", "6.153185307179587"}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("0.841344746068543", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getMean=0.0, getStandardDeviation=1.0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput109() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.distribution.NormalDistributionImpl", "org.apache.commons.math.distribution.NormalDistributionImpl", "inverseCumulativeProbability", new String[]{"double"}, new String[]{"0.12000000000000001"}, false, 0, new String[][]{{"org.apache.commons.math.distribution.NormalDistributionImpl", "getMean", ""}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("-1.1749867921259005", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getMean=0.0, getStandardDeviation=1.0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput110() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.distribution.NormalDistributionImpl", "org.apache.commons.math.distribution.NormalDistributionImpl", "cumulativeProbability", new String[]{"double"}, new String[]{"3.9000000000000004"}, false, 3, new String[][]{}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("0.9999519036559824", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getMean=0.0, getStandardDeviation=1.0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput111() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.distribution.NormalDistributionImpl", "org.apache.commons.math.distribution.NormalDistributionImpl", "reseedRandomGenerator", new String[]{"long"}, new String[]{"1152921504606846976"}, false, 0, null, 3);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getMean=0.0, getStandardDeviation=1.0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput112() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.distribution.NormalDistributionImpl", "org.apache.commons.math.distribution.NormalDistributionImpl", "cumulativeProbability", new String[]{"double", "double"}, new String[]{"-2.0", "-1.0"}, false, 0, new String[][]{{"org.apache.commons.math.distribution.NormalDistributionImpl", "cumulativeProbability", "double,double", "40.0", "1.7690000000000001"}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("0.1359051219832778", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getMean=0.0, getStandardDeviation=1.0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput113() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.distribution.NormalDistributionImpl", "org.apache.commons.math.distribution.NormalDistributionImpl", "inverseCumulativeProbability", new String[]{"double"}, new String[]{"5.0E-11"}, false, 0, null, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("-6.4669511572405565", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getMean=0.0, getStandardDeviation=1.0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput114() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.distribution.NormalDistributionImpl", "org.apache.commons.math.distribution.NormalDistributionImpl", "cumulativeProbability", new String[]{"double"}, new String[]{"-0.09999999999999999"}, false, 0, new String[][]{{"org.apache.commons.math.distribution.NormalDistributionImpl", "getSolverAbsoluteAccuracy", ""}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("0.460172162722971", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getMean=0.0, getStandardDeviation=1.0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput115() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.distribution.NormalDistributionImpl", "org.apache.commons.math.distribution.NormalDistributionImpl", "getSolverAbsoluteAccuracy", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.math.distribution.NormalDistributionImpl", "sample", "int", "1"}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("1.0E-9", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getMean=0.0, getStandardDeviation=1.0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput116() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math.distribution.NormalDistributionImpl", "org.apache.commons.math.distribution.NormalDistributionImpl", "inverseCumulativeProbability", new String[]{"double"}, new String[]{"NaN"}, false, 0, new String[][]{{"org.apache.commons.math.distribution.NormalDistributionImpl", "cumulativeProbability", "double,double", "1.0E-9", "0.11999999999999998"}}, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("org.apache.commons.math.exception.MathUserException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput117() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.distribution.NormalDistributionImpl", "org.apache.commons.math.distribution.NormalDistributionImpl", "cumulativeProbability", new String[]{"double", "double"}, new String[]{"-1.7976931348623157E308", "NaN"}, false, 0, new String[][]{{"org.apache.commons.math.distribution.NormalDistributionImpl", "getStandardDeviation", ""}, {"org.apache.commons.math.distribution.NormalDistributionImpl", "sample", ""}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("NaN", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getMean=0.0, getStandardDeviation=1.0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput118() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.distribution.NormalDistributionImpl", "org.apache.commons.math.distribution.NormalDistributionImpl", "getDomainLowerBound", new String[]{"double"}, new String[]{"NaN"}, false, 0, new String[][]{{"org.apache.commons.math.distribution.NormalDistributionImpl", "cumulativeProbability", "double,double", "4.0", "-1.7976931348623157E308"}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("0.0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getMean=0.0, getStandardDeviation=1.0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput119() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.distribution.NormalDistributionImpl", "org.apache.commons.math.distribution.NormalDistributionImpl", "inverseCumulativeProbability", new String[]{"double"}, new String[]{"0.06"}, false, 0, new String[][]{{"org.apache.commons.math.distribution.NormalDistributionImpl", "cumulativeProbability", "double,double", "-0.018000000000000002", "-1.834"}, {"org.apache.commons.math.distribution.NormalDistributionImpl", "getDomainLowerBound", "double", "-1.0899999999999999"}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("-1.5547735946032641", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getMean=0.0, getStandardDeviation=1.0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput120() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.distribution.NormalDistributionImpl", "org.apache.commons.math.distribution.NormalDistributionImpl", "reseedRandomGenerator", new String[]{"long"}, new String[]{"9223372036854775807"}, false, 4, new String[][]{{"org.apache.commons.math.distribution.NormalDistributionImpl", "getInitialDomain", "double", "-1.7179080154780244E19"}, {"org.apache.commons.math.distribution.NormalDistributionImpl", "cumulativeProbability", "double,double", "-0.05", "2.0"}}, 1);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getMean=0.0, getStandardDeviation=1.0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput121() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.distribution.NormalDistributionImpl", "org.apache.commons.math.distribution.NormalDistributionImpl", "inverseCumulativeProbability", new String[]{"double"}, new String[]{"5.0E-10"}, false, 0, null, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("-6.109410200766035", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getMean=0.0, getStandardDeviation=1.0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput122() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.distribution.NormalDistributionImpl", "org.apache.commons.math.distribution.NormalDistributionImpl", "sample", new String[]{}, new String[]{}, false, 7, new String[][]{}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("Infinity", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getMean=1.0, getStandardDeviation=Infinity}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput123() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.distribution.NormalDistributionImpl", "org.apache.commons.math.distribution.NormalDistributionImpl", "cumulativeProbability", new String[]{"double", "double"}, new String[]{"2.0", "2.0"}, false, 0, new String[][]{{"org.apache.commons.math.distribution.NormalDistributionImpl", "getDomainUpperBound", "double", "0.12000000000000001"}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("0.0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getMean=0.0, getStandardDeviation=1.0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput124() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.distribution.NormalDistributionImpl", "org.apache.commons.math.distribution.NormalDistributionImpl", "inverseCumulativeProbability", new String[]{"double"}, new String[]{"0.12"}, false, 0, new String[][]{{"org.apache.commons.math.distribution.NormalDistributionImpl", "inverseCumulativeProbability", "double", "0.12"}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("-1.1749867921259005", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getMean=0.0, getStandardDeviation=1.0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput125() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.distribution.NormalDistributionImpl", "org.apache.commons.math.distribution.NormalDistributionImpl", "inverseCumulativeProbability", new String[]{"double"}, new String[]{"0.25"}, false, 0, new String[][]{{"org.apache.commons.math.distribution.NormalDistributionImpl", "getDomainLowerBound", "double", "NaN"}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("-0.6744897501960754", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getMean=0.0, getStandardDeviation=1.0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput126() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.distribution.NormalDistributionImpl", "org.apache.commons.math.distribution.NormalDistributionImpl", "cumulativeProbability", new String[]{"double", "double"}, new String[]{"6.0", "31.0"}, false, 0, new String[][]{{"org.apache.commons.math.distribution.NormalDistributionImpl", "getMean", ""}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("9.865877004244794E-10", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getMean=0.0, getStandardDeviation=1.0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput127() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.distribution.NormalDistributionImpl", "org.apache.commons.math.distribution.NormalDistributionImpl", "getSolverAbsoluteAccuracy", new String[]{}, new String[]{}, false, 1, new String[][]{{"org.apache.commons.math.distribution.NormalDistributionImpl", "getInitialDomain", "double", "-4.2947700386950605E18"}, {"org.apache.commons.math.distribution.NormalDistributionImpl", "getStandardDeviation", ""}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("1.0E-9", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getMean=0.0, getStandardDeviation=1.0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput128() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.distribution.NormalDistributionImpl", "org.apache.commons.math.distribution.NormalDistributionImpl", "cumulativeProbability", new String[]{"double", "double"}, new String[]{"0.39999999999999997", "NaN"}, false, 4, new String[][]{}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("NaN", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getMean=0.0, getStandardDeviation=1.0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput129() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.distribution.NormalDistributionImpl", "org.apache.commons.math.distribution.NormalDistributionImpl", "getDomainLowerBound", new String[]{"double"}, new String[]{"0.2550000005"}, false, 0, new String[][]{{"org.apache.commons.math.distribution.NormalDistributionImpl", "cumulativeProbability", "double", "58.0"}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("-1.7976931348623157E308", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getMean=0.0, getStandardDeviation=1.0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput130() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.distribution.NormalDistributionImpl", "org.apache.commons.math.distribution.NormalDistributionImpl", "inverseCumulativeProbability", new String[]{"double"}, new String[]{"9.999999999999999E-10"}, false, 0, new String[][]{{"org.apache.commons.math.distribution.NormalDistributionImpl", "cumulativeProbability", "double", "1.0"}, {"org.apache.commons.math.distribution.NormalDistributionImpl", "sample", "int", "-2147483647"}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("-5.997807014826545", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getMean=0.0, getStandardDeviation=1.0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput131() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.distribution.NormalDistributionImpl", "org.apache.commons.math.distribution.NormalDistributionImpl", "inverseCumulativeProbability", new String[]{"double"}, new String[]{"0.6599999999999999"}, false, 3, new String[][]{}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("0.41246312944143737", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getMean=0.0, getStandardDeviation=1.0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput132() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.distribution.NormalDistributionImpl", "org.apache.commons.math.distribution.NormalDistributionImpl", "inverseCumulativeProbability", new String[]{"double"}, new String[]{"0.49999999999999994"}, false, 0, null, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("0.0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getMean=0.0, getStandardDeviation=1.0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput133() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.distribution.NormalDistributionImpl", "org.apache.commons.math.distribution.NormalDistributionImpl", "inverseCumulativeProbability", new String[]{"double"}, new String[]{"1.0E-10"}, false, 0, new String[][]{{"org.apache.commons.math.distribution.NormalDistributionImpl", "getSolverAbsoluteAccuracy", ""}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("-6.3613409313794325", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getMean=0.0, getStandardDeviation=1.0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput134() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.distribution.NormalDistributionImpl", "org.apache.commons.math.distribution.NormalDistributionImpl", "cumulativeProbability", new String[]{"double", "double"}, new String[]{"-1.7976931348623157E308", "-2.0E-9"}, false, 0, new String[][]{{"org.apache.commons.math.distribution.NormalDistributionImpl", "getInitialDomain", "double", "1.7179080154780244E19"}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("0.49999999920211546", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getMean=0.0, getStandardDeviation=1.0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput135() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math.distribution.NormalDistributionImpl", "org.apache.commons.math.distribution.NormalDistributionImpl", "inverseCumulativeProbability", new String[]{"double"}, new String[]{"NaN"}, false, 1, new String[][]{}, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("org.apache.commons.math.exception.MathUserException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput136() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.distribution.NormalDistributionImpl", "org.apache.commons.math.distribution.NormalDistributionImpl", "getStandardDeviation", new String[]{}, new String[]{}, false, 2, new String[][]{{"org.apache.commons.math.distribution.NormalDistributionImpl", "getInitialDomain", "double", "8.589540077390122E18"}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("Infinity", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getMean=1.0, getStandardDeviation=Infinity}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput137() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.distribution.NormalDistributionImpl", "org.apache.commons.math.distribution.NormalDistributionImpl", "getDomainUpperBound", new String[]{"double"}, new String[]{"1.0"}, false, 2, new String[][]{}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("1.7976931348623157E308", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getMean=1.0, getStandardDeviation=Infinity}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput138() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.distribution.NormalDistributionImpl", "org.apache.commons.math.distribution.NormalDistributionImpl", "getInitialDomain", new String[]{"double"}, new String[]{"-3.4358160309560484E19"}, false, 0, new String[][]{{"org.apache.commons.math.distribution.NormalDistributionImpl", "reseedRandomGenerator", "long", "9223372036854775807"}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("-1.0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getMean=0.0, getStandardDeviation=1.0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput139() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.distribution.NormalDistributionImpl", "org.apache.commons.math.distribution.NormalDistributionImpl", "getInitialDomain", new String[]{"double"}, new String[]{"-1.7976931348623157E308"}, false, 0, new String[][]{{"org.apache.commons.math.distribution.NormalDistributionImpl", "getInitialDomain", "double", "-0.25"}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("-1.0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getMean=0.0, getStandardDeviation=1.0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput140() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.distribution.NormalDistributionImpl", "org.apache.commons.math.distribution.NormalDistributionImpl", "inverseCumulativeProbability", new String[]{"double"}, new String[]{"1.0E-10"}, false, 0, null, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("-6.3613409313794325", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getMean=0.0, getStandardDeviation=1.0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput141() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.distribution.NormalDistributionImpl", "org.apache.commons.math.distribution.NormalDistributionImpl", "getInitialDomain", new String[]{"double"}, new String[]{"0.5"}, false, 5, new String[][]{}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("0.0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getMean=0.0, getStandardDeviation=1.0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput142() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.distribution.NormalDistributionImpl", "org.apache.commons.math.distribution.NormalDistributionImpl", "cumulativeProbability", new String[]{"double", "double"}, new String[]{"28.68", "58.0"}, false, 0, null, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("0.0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getMean=0.0, getStandardDeviation=1.0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput143() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.distribution.NormalDistributionImpl", "org.apache.commons.math.distribution.NormalDistributionImpl", "inverseCumulativeProbability", new String[]{"double"}, new String[]{"4.999999999999999E-10"}, false, 0, new String[][]{{"org.apache.commons.math.distribution.NormalDistributionImpl", "cumulativeProbability", "double", "-23.699999999"}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("-6.109410200766035", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getMean=0.0, getStandardDeviation=1.0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput144() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.distribution.NormalDistributionImpl", "org.apache.commons.math.distribution.NormalDistributionImpl", "cumulativeProbability", new String[]{"double", "double"}, new String[]{"0.19999999999999998", "1.7976931348623157E308"}, false, 3, new String[][]{}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("0.420740290560897", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getMean=0.0, getStandardDeviation=1.0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput145() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.distribution.NormalDistributionImpl", "org.apache.commons.math.distribution.NormalDistributionImpl", "getDomainUpperBound", new String[]{"double"}, new String[]{"Infinity"}, false, 0, new String[][]{{"org.apache.commons.math.distribution.NormalDistributionImpl", "cumulativeProbability", "double,double", "Infinity", "0.19999999999999998"}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("1.7976931348623157E308", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getMean=0.0, getStandardDeviation=1.0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput146() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.distribution.NormalDistributionImpl", "org.apache.commons.math.distribution.NormalDistributionImpl", "getDomainLowerBound", new String[]{"double"}, new String[]{"0.19999999999999998"}, false, 0, new String[][]{{"org.apache.commons.math.distribution.NormalDistributionImpl", "cumulativeProbability", "double,double", "-0.47000000000000003", "1.0"}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("-1.7976931348623157E308", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getMean=0.0, getStandardDeviation=1.0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput147() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.distribution.NormalDistributionImpl", "org.apache.commons.math.distribution.NormalDistributionImpl", "cumulativeProbability", new String[]{"double", "double"}, new String[]{"2.0", "1.7976931348623157E308"}, false, 0, null, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("0.02275013194817921", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getMean=0.0, getStandardDeviation=1.0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput148() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.distribution.NormalDistributionImpl", "org.apache.commons.math.distribution.NormalDistributionImpl", "getInitialDomain", new String[]{"double"}, new String[]{"-0.025"}, false, 0, new String[][]{{"org.apache.commons.math.distribution.NormalDistributionImpl", "getDomainUpperBound", "double", "2.0"}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("-1.0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getMean=0.0, getStandardDeviation=1.0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput149() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.distribution.NormalDistributionImpl", "org.apache.commons.math.distribution.NormalDistributionImpl", "getInitialDomain", new String[]{"double"}, new String[]{"1.7976931348623157E308"}, false, 0, new String[][]{{"org.apache.commons.math.distribution.NormalDistributionImpl", "getStandardDeviation", ""}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("1.0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getMean=0.0, getStandardDeviation=1.0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput150() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.distribution.NormalDistributionImpl", "org.apache.commons.math.distribution.NormalDistributionImpl", "getDomainLowerBound", new String[]{"double"}, new String[]{"0.66"}, false, 1, new String[][]{{"org.apache.commons.math.distribution.NormalDistributionImpl", "sample", ""}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("0.0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getMean=0.0, getStandardDeviation=1.0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput151() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.distribution.NormalDistributionImpl", "org.apache.commons.math.distribution.NormalDistributionImpl", "inverseCumulativeProbability", new String[]{"double"}, new String[]{"0.66"}, false, 0, new String[][]{{"org.apache.commons.math.distribution.NormalDistributionImpl", "density", "double", "5.2"}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("0.4124631294414378", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getMean=0.0, getStandardDeviation=1.0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput152() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.distribution.NormalDistributionImpl", "org.apache.commons.math.distribution.NormalDistributionImpl", "cumulativeProbability", new String[]{"double", "double"}, new String[]{"-2.0", "8.589540077390121E18"}, false, 0, null, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("0.9772498680518208", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getMean=0.0, getStandardDeviation=1.0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput153() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.distribution.NormalDistributionImpl", "org.apache.commons.math.distribution.NormalDistributionImpl", "inverseCumulativeProbability", new String[]{"double"}, new String[]{"0.5"}, false, 4, new String[][]{{"org.apache.commons.math.distribution.NormalDistributionImpl", "cumulativeProbability", "double,double", "Infinity", "-0.09999999999999999"}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("0.0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getMean=0.0, getStandardDeviation=1.0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput154() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.distribution.NormalDistributionImpl", "org.apache.commons.math.distribution.NormalDistributionImpl", "density", new String[]{"double"}, new String[]{"NaN"}, false, 1, new String[][]{{"org.apache.commons.math.distribution.NormalDistributionImpl", "cumulativeProbability", "double", "8.589540077390121E18"}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("NaN", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getMean=0.0, getStandardDeviation=1.0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput155() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.distribution.NormalDistributionImpl", "org.apache.commons.math.distribution.NormalDistributionImpl", "getDomainLowerBound", new String[]{"double"}, new String[]{"-0.5"}, false, 2, new String[][]{}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("-1.7976931348623157E308", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getMean=1.0, getStandardDeviation=Infinity}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput156() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math.distribution.NormalDistributionImpl", "org.apache.commons.math.distribution.NormalDistributionImpl", "sample", new String[]{"int"}, new String[]{"-1"}, false, 6, new String[][]{{"org.apache.commons.math.distribution.NormalDistributionImpl", "reseedRandomGenerator", "long", "60"}}, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("org.apache.commons.math.exception.NotStrictlyPositiveException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput157() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.distribution.NormalDistributionImpl", "org.apache.commons.math.distribution.NormalDistributionImpl", "cumulativeProbability", new String[]{"double", "double"}, new String[]{"-1.7976931348623157E308", "0.12"}, false, 0, new String[][]{{"org.apache.commons.math.distribution.NormalDistributionImpl", "getStandardDeviation", ""}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("0.5477584260205839", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getMean=0.0, getStandardDeviation=1.0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput158() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.distribution.NormalDistributionImpl", "org.apache.commons.math.distribution.NormalDistributionImpl", "density", new String[]{"double"}, new String[]{"0.0"}, false, 1, new String[][]{{"org.apache.commons.math.distribution.NormalDistributionImpl", "density", "double", "58.00000000000001"}, {"org.apache.commons.math.distribution.NormalDistributionImpl", "getDomainUpperBound", "double", "-1.717908015478024E19"}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("0.3989422804014327", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getMean=0.0, getStandardDeviation=1.0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput159() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.distribution.NormalDistributionImpl", "org.apache.commons.math.distribution.NormalDistributionImpl", "density", new String[]{"double"}, new String[]{"0.66"}, false, 0, null, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("0.3208638037711725", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getMean=0.0, getStandardDeviation=1.0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput160() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.distribution.NormalDistributionImpl", "org.apache.commons.math.distribution.NormalDistributionImpl", "density", new String[]{"double"}, new String[]{"1.7976931348623157E308"}, false, 4, new String[][]{}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("0.0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getMean=0.0, getStandardDeviation=1.0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput161() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.distribution.NormalDistributionImpl", "org.apache.commons.math.distribution.NormalDistributionImpl", "density", new String[]{"double"}, new String[]{"0.0"}, false, 0, new String[][]{{"org.apache.commons.math.distribution.NormalDistributionImpl", "getInitialDomain", "double", "0.12000000000000001"}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("0.3989422804014327", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getMean=0.0, getStandardDeviation=1.0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput162() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.distribution.NormalDistributionImpl", "org.apache.commons.math.distribution.NormalDistributionImpl", "getDomainLowerBound", new String[]{"double"}, new String[]{"0.9199999999999999"}, false, 3, new String[][]{{"org.apache.commons.math.distribution.NormalDistributionImpl", "sample", ""}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("0.0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getMean=0.0, getStandardDeviation=1.0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput163() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.distribution.NormalDistributionImpl", "org.apache.commons.math.distribution.NormalDistributionImpl", "density", new String[]{"double"}, new String[]{"0.11999999999999998"}, false, 0, new String[][]{{"org.apache.commons.math.distribution.NormalDistributionImpl", "sample", ""}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("0.3960802117936561", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getMean=0.0, getStandardDeviation=1.0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput164() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.distribution.NormalDistributionImpl", "org.apache.commons.math.distribution.NormalDistributionImpl", "density", new String[]{"double"}, new String[]{"0.35"}, false, 0, new String[][]{{"org.apache.commons.math.distribution.NormalDistributionImpl", "getStandardDeviation", ""}, {"org.apache.commons.math.distribution.NormalDistributionImpl", "getDomainUpperBound", "double", "40.0"}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("0.3752403469169379", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getMean=0.0, getStandardDeviation=1.0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput165() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.distribution.NormalDistributionImpl", "org.apache.commons.math.distribution.NormalDistributionImpl", "density", new String[]{"double"}, new String[]{"-4.5999999999000005"}, false, 0, new String[][]{{"org.apache.commons.math.distribution.NormalDistributionImpl", "getMean", ""}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("1.0140852070151516E-5", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getMean=0.0, getStandardDeviation=1.0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput166() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.distribution.NormalDistributionImpl", "org.apache.commons.math.distribution.NormalDistributionImpl", "reseedRandomGenerator", new String[]{"long"}, new String[]{"-509"}, false, 2, new String[][]{}, 3);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getMean=1.0, getStandardDeviation=Infinity}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput167() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.distribution.NormalDistributionImpl", "org.apache.commons.math.distribution.NormalDistributionImpl", "inverseCumulativeProbability", new String[]{"double"}, new String[]{"0.11999999999999998"}, false, 0, new String[][]{{"org.apache.commons.math.distribution.NormalDistributionImpl", "getDomainLowerBound", "double", "0.06599999999999999"}, {"org.apache.commons.math.distribution.NormalDistributionImpl", "sample", "int", "0"}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("-1.1749867921259007", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getMean=0.0, getStandardDeviation=1.0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput168() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.distribution.NormalDistributionImpl", "org.apache.commons.math.distribution.NormalDistributionImpl", "getDomainUpperBound", new String[]{"double"}, new String[]{"1.7976931348623157E308"}, false, 2, new String[][]{}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("1.7976931348623157E308", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getMean=1.0, getStandardDeviation=Infinity}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput169() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.distribution.NormalDistributionImpl", "org.apache.commons.math.distribution.NormalDistributionImpl", "cumulativeProbability", new String[]{"double", "double"}, new String[]{"1.0", "1.9530000000000005"}, false, 1, new String[][]{{"org.apache.commons.math.distribution.NormalDistributionImpl", "sample", "int", "-2147483648"}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("0.13324545633572749", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getMean=0.0, getStandardDeviation=1.0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput170() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.distribution.NormalDistributionImpl", "org.apache.commons.math.distribution.NormalDistributionImpl", "cumulativeProbability", new String[]{"double", "double"}, new String[]{"-1.0E-10", "9.978"}, false, 6, new String[][]{}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("0.5000000000398943", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getMean=0.0, getStandardDeviation=1.0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput171() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.distribution.NormalDistributionImpl", "org.apache.commons.math.distribution.NormalDistributionImpl", "cumulativeProbability", new String[]{"double"}, new String[]{"0.12"}, false, 0, null, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("0.5477584260205839", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getMean=0.0, getStandardDeviation=1.0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput172() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.distribution.NormalDistributionImpl", "org.apache.commons.math.distribution.NormalDistributionImpl", "cumulativeProbability", new String[]{"double"}, new String[]{"-1.0"}, false, 7, new String[][]{{"org.apache.commons.math.distribution.NormalDistributionImpl", "sample", ""}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("0.5", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getMean=1.0, getStandardDeviation=Infinity}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput173() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.distribution.NormalDistributionImpl", "org.apache.commons.math.distribution.NormalDistributionImpl", "getMean", new String[]{}, new String[]{}, false, 0, null, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("0.0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getMean=0.0, getStandardDeviation=1.0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput174() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.distribution.NormalDistributionImpl", "org.apache.commons.math.distribution.NormalDistributionImpl", "cumulativeProbability", new String[]{"double"}, new String[]{"4.2"}, false, 0, new String[][]{{"org.apache.commons.math.distribution.NormalDistributionImpl", "cumulativeProbability", "double,double", "-0.25", "-0.25"}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("0.9999866542509841", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getMean=0.0, getStandardDeviation=1.0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput175() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.distribution.NormalDistributionImpl", "org.apache.commons.math.distribution.NormalDistributionImpl", "cumulativeProbability", new String[]{"double", "double"}, new String[]{"-2.0", "0.5"}, false, 0, new String[][]{{"org.apache.commons.math.distribution.NormalDistributionImpl", "inverseCumulativeProbability", "double", "4.9E-324"}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("0.6687123293258338", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getMean=0.0, getStandardDeviation=1.0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput176() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.distribution.NormalDistributionImpl", "org.apache.commons.math.distribution.NormalDistributionImpl", "cumulativeProbability", new String[]{"double", "double"}, new String[]{"-Infinity", "1.0"}, false, 2, new String[][]{{"org.apache.commons.math.distribution.NormalDistributionImpl", "reseedRandomGenerator", "long", "4294967335"}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("NaN", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getMean=1.0, getStandardDeviation=Infinity}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput177() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.distribution.NormalDistributionImpl", "org.apache.commons.math.distribution.NormalDistributionImpl", "density", new String[]{"double"}, new String[]{"0.2"}, false, 0, null, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("0.3910426939754559", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getMean=0.0, getStandardDeviation=1.0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput178() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.distribution.NormalDistributionImpl", "org.apache.commons.math.distribution.NormalDistributionImpl", "density", new String[]{"double"}, new String[]{"0.19999999999999998"}, false, 0, null, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("0.3910426939754559", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getMean=0.0, getStandardDeviation=1.0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput179() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.distribution.NormalDistributionImpl", "org.apache.commons.math.distribution.NormalDistributionImpl", "cumulativeProbability", new String[]{"double", "double"}, new String[]{"0.06", "8.988465674311579E307"}, false, 7, new String[][]{}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("0.0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getMean=1.0, getStandardDeviation=Infinity}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput180() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.distribution.NormalDistributionImpl", "org.apache.commons.math.distribution.NormalDistributionImpl", "inverseCumulativeProbability", new String[]{"double"}, new String[]{"1.0E-9"}, false, 0, null, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("-5.997807014826545", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getMean=0.0, getStandardDeviation=1.0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput181() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.distribution.NormalDistributionImpl", "org.apache.commons.math.distribution.NormalDistributionImpl", "getDomainUpperBound", new String[]{"double"}, new String[]{"NaN"}, false, 1, new String[][]{}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("1.7976931348623157E308", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getMean=0.0, getStandardDeviation=1.0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput182() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math.distribution.NormalDistributionImpl", "org.apache.commons.math.distribution.NormalDistributionImpl", "sample", new String[]{"int"}, new String[]{"-20"}, false, 4, new String[][]{{"org.apache.commons.math.distribution.NormalDistributionImpl", "getMean", ""}}, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("org.apache.commons.math.exception.NotStrictlyPositiveException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput183() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.distribution.NormalDistributionImpl", "org.apache.commons.math.distribution.NormalDistributionImpl", "density", new String[]{"double"}, new String[]{"0.39999999999999997"}, false, 0, new String[][]{{"org.apache.commons.math.distribution.NormalDistributionImpl", "getStandardDeviation", ""}, {"org.apache.commons.math.distribution.NormalDistributionImpl", "cumulativeProbability", "double", "-5.499999999"}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("0.36827014030332333", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getMean=0.0, getStandardDeviation=1.0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput184() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.distribution.NormalDistributionImpl", "org.apache.commons.math.distribution.NormalDistributionImpl", "cumulativeProbability", new String[]{"double"}, new String[]{"2.0"}, false, 0, new String[][]{{"org.apache.commons.math.distribution.NormalDistributionImpl", "sample", ""}, {"org.apache.commons.math.distribution.NormalDistributionImpl", "getInitialDomain", "double", "-0.12"}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("0.9772498680518208", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getMean=0.0, getStandardDeviation=1.0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput185() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.distribution.NormalDistributionImpl", "org.apache.commons.math.distribution.NormalDistributionImpl", "cumulativeProbability", new String[]{"double"}, new String[]{"-0.1"}, false, 5, new String[][]{}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("0.460172162722971", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getMean=0.0, getStandardDeviation=1.0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput186() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.distribution.NormalDistributionImpl", "org.apache.commons.math.distribution.NormalDistributionImpl", "cumulativeProbability", new String[]{"double", "double"}, new String[]{"-1.7976931348623157E308", "40.0"}, false, 1, new String[][]{{"org.apache.commons.math.distribution.NormalDistributionImpl", "getDomainLowerBound", "double", "-40.00000000000001"}, {"org.apache.commons.math.distribution.NormalDistributionImpl", "getSolverAbsoluteAccuracy", ""}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("1.0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getMean=0.0, getStandardDeviation=1.0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput187() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.distribution.NormalDistributionImpl", "org.apache.commons.math.distribution.NormalDistributionImpl", "cumulativeProbability", new String[]{"double", "double"}, new String[]{"1.0E-9", "80.0"}, false, 0, null, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("0.4999999996010577", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getMean=0.0, getStandardDeviation=1.0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput188() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.distribution.NormalDistributionImpl", "org.apache.commons.math.distribution.NormalDistributionImpl", "cumulativeProbability", new String[]{"double"}, new String[]{"0.09999999999999999"}, false, 6, new String[][]{{"org.apache.commons.math.distribution.NormalDistributionImpl", "sample", "int", "2147483647"}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("0.539827837277029", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getMean=0.0, getStandardDeviation=1.0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput189() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.distribution.NormalDistributionImpl", "org.apache.commons.math.distribution.NormalDistributionImpl", "getDomainUpperBound", new String[]{"double"}, new String[]{"4.9E-324"}, false, 0, null, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("0.0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getMean=0.0, getStandardDeviation=1.0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput190() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.distribution.NormalDistributionImpl", "org.apache.commons.math.distribution.NormalDistributionImpl", "sample", new String[]{}, new String[]{}, false, 2, new String[][]{}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("Infinity", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getMean=1.0, getStandardDeviation=Infinity}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput191() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.distribution.NormalDistributionImpl", "org.apache.commons.math.distribution.NormalDistributionImpl", "inverseCumulativeProbability", new String[]{"double"}, new String[]{"1.0"}, false, 2, new String[][]{}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("Infinity", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getMean=1.0, getStandardDeviation=Infinity}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput192() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.distribution.NormalDistributionImpl", "org.apache.commons.math.distribution.NormalDistributionImpl", "density", new String[]{"double"}, new String[]{"1.053"}, false, 4, new String[][]{}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("0.22915812003340233", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getMean=0.0, getStandardDeviation=1.0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput193() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.distribution.NormalDistributionImpl", "org.apache.commons.math.distribution.NormalDistributionImpl", "density", new String[]{"double"}, new String[]{"Infinity"}, false, 7, new String[][]{{"org.apache.commons.math.distribution.NormalDistributionImpl", "sample", "int", "5"}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("NaN", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getMean=1.0, getStandardDeviation=Infinity}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput194() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.distribution.NormalDistributionImpl", "org.apache.commons.math.distribution.NormalDistributionImpl", "cumulativeProbability", new String[]{"double", "double"}, new String[]{"0.0", "58.0"}, false, 5, new String[][]{}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("0.5", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getMean=0.0, getStandardDeviation=1.0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput195() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.distribution.NormalDistributionImpl", "org.apache.commons.math.distribution.NormalDistributionImpl", "getMean", new String[]{}, new String[]{}, false, 7, new String[][]{}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("1.0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getMean=1.0, getStandardDeviation=Infinity}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput196() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.distribution.NormalDistributionImpl", "org.apache.commons.math.distribution.NormalDistributionImpl", "cumulativeProbability", new String[]{"double", "double"}, new String[]{"6.283185307179586", "8589540077390120676"}, false, 4, new String[][]{{"org.apache.commons.math.distribution.NormalDistributionImpl", "cumulativeProbability", "double,double", "2.0000000000000004", "12.566370614359172"}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("1.6585266493507334E-10", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getMean=0.0, getStandardDeviation=1.0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput197() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.distribution.NormalDistributionImpl", "org.apache.commons.math.distribution.NormalDistributionImpl", "inverseCumulativeProbability", new String[]{"double"}, new String[]{"0.0"}, false, 7, new String[][]{{"org.apache.commons.math.distribution.NormalDistributionImpl", "density", "double", "3.141592653589793"}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("-Infinity", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getMean=1.0, getStandardDeviation=Infinity}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput198() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.distribution.NormalDistributionImpl", "org.apache.commons.math.distribution.NormalDistributionImpl", "cumulativeProbability", new String[]{"double", "double"}, new String[]{"-1.7179080154780242E19", "-3.1999999990000005"}, false, 0, null, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("6.871379402999533E-4", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getMean=0.0, getStandardDeviation=1.0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput199() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.distribution.NormalDistributionImpl", "org.apache.commons.math.distribution.NormalDistributionImpl", "cumulativeProbability", new String[]{"double", "double"}, new String[]{"-4.9E-324", "2.0"}, false, 0, new String[][]{{"org.apache.commons.math.distribution.NormalDistributionImpl", "cumulativeProbability", "double,double", "0.5", "Infinity"}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("0.4772498680518208", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getMean=0.0, getStandardDeviation=1.0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput200() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.distribution.NormalDistributionImpl", "org.apache.commons.math.distribution.NormalDistributionImpl", "getMean", new String[]{}, new String[]{}, false, 7, new String[][]{{"org.apache.commons.math.distribution.NormalDistributionImpl", "cumulativeProbability", "double,double", "0.012", "-0.05000000000000001"}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("1.0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getMean=1.0, getStandardDeviation=Infinity}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput201() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.distribution.NormalDistributionImpl", "org.apache.commons.math.distribution.NormalDistributionImpl", "density", new String[]{"double"}, new String[]{"-1.0E-9"}, false, 5, new String[][]{{"org.apache.commons.math.distribution.NormalDistributionImpl", "getInitialDomain", "double", "6.800000000000001"}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("0.3989422804014327", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getMean=0.0, getStandardDeviation=1.0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput202() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.distribution.NormalDistributionImpl", "org.apache.commons.math.distribution.NormalDistributionImpl", "reseedRandomGenerator", new String[]{"long"}, new String[]{"-9223372036854775808"}, false, 7, new String[][]{{"org.apache.commons.math.distribution.NormalDistributionImpl", "cumulativeProbability", "double,double", "-8.589540077390121E18", "1.0E-9"}}, 2);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getMean=1.0, getStandardDeviation=Infinity}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput203() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.distribution.NormalDistributionImpl", "org.apache.commons.math.distribution.NormalDistributionImpl", "cumulativeProbability", new String[]{"double", "double"}, new String[]{"-27.11", "0.66"}, false, 0, new String[][]{{"org.apache.commons.math.distribution.NormalDistributionImpl", "getSolverAbsoluteAccuracy", ""}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("0.7453730853286639", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getMean=0.0, getStandardDeviation=1.0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput204() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math.distribution.NormalDistributionImpl", "org.apache.commons.math.distribution.NormalDistributionImpl", "sample", new String[]{"int"}, new String[]{"-2147483648"}, false, 0, null, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("org.apache.commons.math.exception.NotStrictlyPositiveException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput205() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.distribution.NormalDistributionImpl", "org.apache.commons.math.distribution.NormalDistributionImpl", "getInitialDomain", new String[]{"double"}, new String[]{"0.66"}, false, 7, new String[][]{}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("Infinity", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getMean=1.0, getStandardDeviation=Infinity}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput206() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.distribution.NormalDistributionImpl", "org.apache.commons.math.distribution.NormalDistributionImpl", "density", new String[]{"double"}, new String[]{"2.0000000000000004"}, false, 4, new String[][]{}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("0.05399096651318801", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getMean=0.0, getStandardDeviation=1.0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput207() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.distribution.NormalDistributionImpl", "org.apache.commons.math.distribution.NormalDistributionImpl", "sample", new String[]{"int"}, new String[]{"19"}, false, 7, new String[][]{{"org.apache.commons.math.distribution.NormalDistributionImpl", "reseedRandomGenerator", "long", "3"}}, 1);
  assertNotNull(actual);
  assertEquals("[D", actual.getClass().getName());
  assertEquals("[Infinity, -Infinity, -Infinity, Infinity, Infinity, -Infinity, -Infinity, -Infinity, -Infinity, -Infinity, -Infinity, Infinity, Infinity, Infinity, Infinity, -Infinity, Infinity, Infinity, -Infinity]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getMean=1.0, getStandardDeviation=Infinity}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput208() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.distribution.NormalDistributionImpl", "org.apache.commons.math.distribution.NormalDistributionImpl", "getSolverAbsoluteAccuracy", new String[]{}, new String[]{}, false, 2, new String[][]{{"org.apache.commons.math.distribution.NormalDistributionImpl", "sample", "int", "2147483627"}, {"org.apache.commons.math.distribution.NormalDistributionImpl", "reseedRandomGenerator", "long", "-21"}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("-Infinity", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getMean=1.0, getStandardDeviation=Infinity}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput209() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.distribution.NormalDistributionImpl", "org.apache.commons.math.distribution.NormalDistributionImpl", "density", new String[]{"double"}, new String[]{"2.0000000000000004"}, false, 0, new String[][]{{"org.apache.commons.math.distribution.NormalDistributionImpl", "inverseCumulativeProbability", "double", "13.831853071795859"}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("0.05399096651318801", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getMean=0.0, getStandardDeviation=1.0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput210() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.distribution.NormalDistributionImpl", "org.apache.commons.math.distribution.NormalDistributionImpl", "density", new String[]{"double"}, new String[]{"-0.5"}, false, 3, new String[][]{}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("0.3520653267642995", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getMean=0.0, getStandardDeviation=1.0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput211() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.distribution.NormalDistributionImpl", "org.apache.commons.math.distribution.NormalDistributionImpl", "getDomainUpperBound", new String[]{"double"}, new String[]{"0.12"}, false, 5, new String[][]{{"org.apache.commons.math.distribution.NormalDistributionImpl", "getInitialDomain", "double", "-0.1"}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("0.0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getMean=0.0, getStandardDeviation=1.0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput212() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.distribution.NormalDistributionImpl", "org.apache.commons.math.distribution.NormalDistributionImpl", "density", new String[]{"double"}, new String[]{"6.283185307179587"}, false, 5, new String[][]{{"org.apache.commons.math.distribution.NormalDistributionImpl", "getDomainUpperBound", "double", "-1.7976931348623157E308"}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("1.0672854918897226E-9", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getMean=0.0, getStandardDeviation=1.0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput213() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.distribution.NormalDistributionImpl", "org.apache.commons.math.distribution.NormalDistributionImpl", "inverseCumulativeProbability", new String[]{"double"}, new String[]{"1.0"}, false, 7, new String[][]{}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("Infinity", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getMean=1.0, getStandardDeviation=Infinity}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput214() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.distribution.NormalDistributionImpl", "org.apache.commons.math.distribution.NormalDistributionImpl", "getStandardDeviation", new String[]{}, new String[]{}, false, 7, new String[][]{{"org.apache.commons.math.distribution.NormalDistributionImpl", "getSolverAbsoluteAccuracy", ""}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("Infinity", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getMean=1.0, getStandardDeviation=Infinity}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput215() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.distribution.NormalDistributionImpl", "org.apache.commons.math.distribution.NormalDistributionImpl", "getMean", new String[]{}, new String[]{}, false, 7, new String[][]{{"org.apache.commons.math.distribution.NormalDistributionImpl", "reseedRandomGenerator", "long", "16"}, {"org.apache.commons.math.distribution.NormalDistributionImpl", "sample", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("1.0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getMean=1.0, getStandardDeviation=Infinity}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput216() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.distribution.NormalDistributionImpl", "org.apache.commons.math.distribution.NormalDistributionImpl", "getStandardDeviation", new String[]{}, new String[]{}, false, 2, new String[][]{{"org.apache.commons.math.distribution.NormalDistributionImpl", "getMean", ""}, {"org.apache.commons.math.distribution.NormalDistributionImpl", "density", "double", "Infinity"}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("Infinity", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getMean=1.0, getStandardDeviation=Infinity}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput217() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.distribution.NormalDistributionImpl", "org.apache.commons.math.distribution.NormalDistributionImpl", "getInitialDomain", new String[]{"double"}, new String[]{"-5.0"}, false, 7, new String[][]{{"org.apache.commons.math.distribution.NormalDistributionImpl", "inverseCumulativeProbability", "double", "23.0"}, {"org.apache.commons.math.distribution.NormalDistributionImpl", "density", "double", "-1.7976931348623155E308"}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("-Infinity", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getMean=1.0, getStandardDeviation=Infinity}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput218() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.distribution.NormalDistributionImpl", "org.apache.commons.math.distribution.NormalDistributionImpl", "getSolverAbsoluteAccuracy", new String[]{}, new String[]{}, false, 7, new String[][]{{"org.apache.commons.math.distribution.NormalDistributionImpl", "inverseCumulativeProbability", "double", "1.0000000000000003E-9"}, {"org.apache.commons.math.distribution.NormalDistributionImpl", "sample", "int", "2147483647"}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("1.0E-9", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getMean=1.0, getStandardDeviation=Infinity}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput219() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.distribution.NormalDistributionImpl", "org.apache.commons.math.distribution.NormalDistributionImpl", "density", new String[]{"double"}, new String[]{"38.000000001"}, false, 0, new String[][]{{"org.apache.commons.math.distribution.NormalDistributionImpl", "getInitialDomain", "double", "-0.004999999999999999"}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("1.0972210105E-314", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getMean=0.0, getStandardDeviation=1.0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput220() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.distribution.NormalDistributionImpl", "org.apache.commons.math.distribution.NormalDistributionImpl", "getDomainUpperBound", new String[]{"double"}, new String[]{"-0.44"}, false, 0, null, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("0.0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getMean=0.0, getStandardDeviation=1.0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput221() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.distribution.NormalDistributionImpl", "org.apache.commons.math.distribution.NormalDistributionImpl", "getDomainLowerBound", new String[]{"double"}, new String[]{"4.000000000000001"}, false, 7, new String[][]{{"org.apache.commons.math.distribution.NormalDistributionImpl", "getInitialDomain", "double", "1.7976931348623157E308"}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("1.0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getMean=1.0, getStandardDeviation=Infinity}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput222() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.distribution.NormalDistributionImpl", "org.apache.commons.math.distribution.NormalDistributionImpl", "reseedRandomGenerator", new String[]{"long"}, new String[]{"8591791877203805923"}, false, 7, new String[][]{{"org.apache.commons.math.distribution.NormalDistributionImpl", "getSolverAbsoluteAccuracy", ""}, {"org.apache.commons.math.distribution.NormalDistributionImpl", "density", "double", "-0.19999999999999998"}}, 1);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getMean=1.0, getStandardDeviation=Infinity}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput223() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.distribution.NormalDistributionImpl", "org.apache.commons.math.distribution.NormalDistributionImpl", "getMean", new String[]{}, new String[]{}, false, 7, new String[][]{{"org.apache.commons.math.distribution.NormalDistributionImpl", "inverseCumulativeProbability", "double", "0.0"}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("1.0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getMean=1.0, getStandardDeviation=Infinity}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput224() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.distribution.NormalDistributionImpl", "org.apache.commons.math.distribution.NormalDistributionImpl", "density", new String[]{"double"}, new String[]{"1.0"}, false, 7, new String[][]{{"org.apache.commons.math.distribution.NormalDistributionImpl", "getMean", ""}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("0.0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getMean=1.0, getStandardDeviation=Infinity}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput225() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math.distribution.NormalDistributionImpl", "org.apache.commons.math.distribution.NormalDistributionImpl", "inverseCumulativeProbability", new String[]{"double"}, new String[]{"115.99999999999999"}, false); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("org.apache.commons.math.exception.OutOfRangeException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput226() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.distribution.NormalDistributionImpl", "org.apache.commons.math.distribution.NormalDistributionImpl", "cumulativeProbability", new String[]{"double", "double"}, new String[]{"0.5", "8.5895400773901199E18"}, false, 7, new String[][]{}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("0.0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getMean=1.0, getStandardDeviation=Infinity}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput227() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.distribution.NormalDistributionImpl", "org.apache.commons.math.distribution.NormalDistributionImpl", "getSolverAbsoluteAccuracy", new String[]{}, new String[]{}, false, 2, new String[][]{{"org.apache.commons.math.distribution.NormalDistributionImpl", "getMean", ""}, {"org.apache.commons.math.distribution.NormalDistributionImpl", "getSolverAbsoluteAccuracy", ""}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("-Infinity", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getMean=1.0, getStandardDeviation=Infinity}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput228() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.distribution.NormalDistributionImpl", "org.apache.commons.math.distribution.NormalDistributionImpl", "getInitialDomain", new String[]{"double"}, new String[]{"NaN"}, false, 0, new String[][]{{"org.apache.commons.math.distribution.NormalDistributionImpl", "cumulativeProbability", "double", "-0.125"}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("0.0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getMean=0.0, getStandardDeviation=1.0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput229() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.distribution.NormalDistributionImpl", "org.apache.commons.math.distribution.NormalDistributionImpl", "getInitialDomain", new String[]{"double"}, new String[]{"-0.545"}, false, 2, new String[][]{{"org.apache.commons.math.distribution.NormalDistributionImpl", "cumulativeProbability", "double", "61.95"}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("-Infinity", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getMean=1.0, getStandardDeviation=Infinity}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput230() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.distribution.NormalDistributionImpl", "org.apache.commons.math.distribution.NormalDistributionImpl", "getDomainUpperBound", new String[]{"double"}, new String[]{"-35.0"}, false, 7, new String[][]{{"org.apache.commons.math.distribution.NormalDistributionImpl", "getDomainUpperBound", "double", "0.66"}, {"org.apache.commons.math.distribution.NormalDistributionImpl", "getDomainUpperBound", "double", "0.5000000000000002"}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("1.0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getMean=1.0, getStandardDeviation=Infinity}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput231() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.distribution.NormalDistributionImpl", "org.apache.commons.math.distribution.NormalDistributionImpl", "getDomainLowerBound", new String[]{"double"}, new String[]{"6.283185307179585"}, false, 7, new String[][]{{"org.apache.commons.math.distribution.NormalDistributionImpl", "getDomainLowerBound", "double", "2.0E-10"}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("1.0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getMean=1.0, getStandardDeviation=Infinity}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput232() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.distribution.NormalDistributionImpl", "org.apache.commons.math.distribution.NormalDistributionImpl", "getDomainUpperBound", new String[]{"double"}, new String[]{"1.914"}, false, 2, new String[][]{{"org.apache.commons.math.distribution.NormalDistributionImpl", "getMean", ""}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("1.7976931348623157E308", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getMean=1.0, getStandardDeviation=Infinity}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput233() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.distribution.NormalDistributionImpl", "org.apache.commons.math.distribution.NormalDistributionImpl", "getDomainUpperBound", new String[]{"double"}, new String[]{"-5.0E-11"}, false, 7, new String[][]{}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("1.0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getMean=1.0, getStandardDeviation=Infinity}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput234() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.distribution.NormalDistributionImpl", "org.apache.commons.math.distribution.NormalDistributionImpl", "getInitialDomain", new String[]{"double"}, new String[]{"57.99999999999999"}, false, 2, new String[][]{{"org.apache.commons.math.distribution.NormalDistributionImpl", "getMean", ""}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("Infinity", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getMean=1.0, getStandardDeviation=Infinity}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput235() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.distribution.NormalDistributionImpl", "org.apache.commons.math.distribution.NormalDistributionImpl", "getInitialDomain", new String[]{"double"}, new String[]{"0.5"}, false, 0, new String[][]{{"org.apache.commons.math.distribution.NormalDistributionImpl", "inverseCumulativeProbability", "double", "0.0"}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("0.0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getMean=0.0, getStandardDeviation=1.0}", SearchInputFactory_scaffolding.receiverState());
 }
}
