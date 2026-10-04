package generated.algorithm;

import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;
import static org.junit.Assert.*;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class BinaryParticleSwarmGeneratedTest {
 @Test(timeout = 20000)
 public void generatedInput000() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.distribution.NormalDistributionImpl", "org.apache.commons.math.distribution.NormalDistributionImpl", "getInitialDomain", new String[]{"double"}, new String[]{"2.0000000000000004"}, false, 4, new String[][]{}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("1.0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getMean=0.0, getStandardDeviation=1.0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput001() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.distribution.NormalDistributionImpl", "org.apache.commons.math.distribution.NormalDistributionImpl", "inverseCumulativeProbability", new String[]{"double"}, new String[]{"1.0"}, false, 5, new String[][]{{"org.apache.commons.math.distribution.NormalDistributionImpl", "cumulativeProbability", "double", "4.0"}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("Infinity", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getMean=0.0, getStandardDeviation=1.0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput002() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.distribution.NormalDistributionImpl", "org.apache.commons.math.distribution.NormalDistributionImpl", "inverseCumulativeProbability", new String[]{"double"}, new String[]{"0.0"}, false, 0, new String[][]{{"org.apache.commons.math.distribution.NormalDistributionImpl", "cumulativeProbability", "double,double", "Infinity", "2.0000000000000004"}});
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("-Infinity", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getMean=0.0, getStandardDeviation=1.0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput003() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.distribution.NormalDistributionImpl", "org.apache.commons.math.distribution.NormalDistributionImpl", "inverseCumulativeProbability", new String[]{"double"}, new String[]{"0.289"}, false, 2, new String[][]{{"org.apache.commons.math.distribution.NormalDistributionImpl", "inverseCumulativeProbability", "double", "NaN"}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("-0.5563084791792177", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getMean=0.0, getStandardDeviation=1.0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput004() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math.distribution.NormalDistributionImpl", "org.apache.commons.math.distribution.NormalDistributionImpl", "cumulativeProbability", new String[]{"double", "double"}, new String[]{"-2.0", "Infinity"}, false, 0, new String[][]{{"org.apache.commons.math.distribution.NormalDistributionImpl", "setStandardDeviation", "double", "8.988465674311579E307"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("org.apache.commons.math.MaxIterationsExceededException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput005() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.distribution.NormalDistributionImpl", "org.apache.commons.math.distribution.NormalDistributionImpl", "getDomainUpperBound", new String[]{"double"}, new String[]{"-1.7976931348623157E308"}, false, 6, new String[][]{{"org.apache.commons.math.distribution.NormalDistributionImpl", "cumulativeProbability", "double,double", "-1.7976931348623155E307", "8.58954007739012E19"}, {"org.apache.commons.math.distribution.NormalDistributionImpl", "setMean", "double", "-2.4"}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("-2.4", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getMean=-2.4, getStandardDeviation=1.0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput006() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.distribution.NormalDistributionImpl", "org.apache.commons.math.distribution.NormalDistributionImpl", "getMean", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.math.distribution.NormalDistributionImpl", "getStandardDeviation", ""}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("0.0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getMean=0.0, getStandardDeviation=1.0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput007() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.distribution.NormalDistributionImpl", "org.apache.commons.math.distribution.NormalDistributionImpl", "cumulativeProbability", new String[]{"double"}, new String[]{"Infinity"}, false, 0, null, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("1.0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getMean=0.0, getStandardDeviation=1.0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput008() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math.distribution.NormalDistributionImpl", "org.apache.commons.math.distribution.NormalDistributionImpl", "cumulativeProbability", new String[]{"double", "double"}, new String[]{"-1.4300000000000002", "-Infinity"}, false, 0, null, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput009() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.distribution.NormalDistributionImpl", "org.apache.commons.math.distribution.NormalDistributionImpl", "cumulativeProbability", new String[]{"double", "double"}, new String[]{"NaN", "20.0"}, false, 0, new String[][]{{"org.apache.commons.math.distribution.NormalDistributionImpl", "getInitialDomain", "double", "Infinity"}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("NaN", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getMean=0.0, getStandardDeviation=1.0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput010() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.distribution.NormalDistributionImpl", "org.apache.commons.math.distribution.NormalDistributionImpl", "cumulativeProbability", new String[]{"double"}, new String[]{"8589540077390120676"}, false, 0, null, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("1.0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getMean=0.0, getStandardDeviation=1.0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput011() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.distribution.NormalDistributionImpl", "org.apache.commons.math.distribution.NormalDistributionImpl", "getDomainLowerBound", new String[]{"double"}, new String[]{"NaN"}, false, 2, new String[][]{}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("0.0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getMean=0.0, getStandardDeviation=1.0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput012() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.distribution.NormalDistributionImpl", "org.apache.commons.math.distribution.NormalDistributionImpl", "getDomainLowerBound", new String[]{"double"}, new String[]{"4.9E-323"}, false, 3, new String[][]{}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("-1.7976931348623157E308", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getMean=0.0, getStandardDeviation=1.0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput013() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.distribution.NormalDistributionImpl", "org.apache.commons.math.distribution.NormalDistributionImpl", "getMean", new String[]{}, new String[]{}, false, 6, new String[][]{{"org.apache.commons.math.distribution.NormalDistributionImpl", "setMean", "double", "0.2"}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("0.2", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getMean=0.2, getStandardDeviation=1.0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput014() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.distribution.NormalDistributionImpl", "org.apache.commons.math.distribution.NormalDistributionImpl", "getMean", new String[]{}, new String[]{}, false, 6, new String[][]{{"org.apache.commons.math.distribution.NormalDistributionImpl", "setStandardDeviation", "double", "0.0"}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("0.0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getMean=0.0, getStandardDeviation=1.0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput015() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.distribution.NormalDistributionImpl", "org.apache.commons.math.distribution.NormalDistributionImpl", "getMean", new String[]{}, new String[]{}, false, 0, null, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("0.0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getMean=0.0, getStandardDeviation=1.0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput016() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.distribution.NormalDistributionImpl", "org.apache.commons.math.distribution.NormalDistributionImpl", "getDomainLowerBound", new String[]{"double"}, new String[]{"43.0"}, false, 4, new String[][]{{"org.apache.commons.math.distribution.NormalDistributionImpl", "getInitialDomain", "double", "1.6900000000000002"}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("0.0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getMean=0.0, getStandardDeviation=1.0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput017() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math.distribution.NormalDistributionImpl", "org.apache.commons.math.distribution.NormalDistributionImpl", "setStandardDeviation", new String[]{"double"}, new String[]{"0.0"}, false, 0, new String[][]{{"org.apache.commons.math.distribution.NormalDistributionImpl", "inverseCumulativeProbability", "double", "4.0"}}, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput018() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math.distribution.NormalDistributionImpl", "org.apache.commons.math.distribution.NormalDistributionImpl", "cumulativeProbability", new String[]{"double", "double"}, new String[]{"1.7976931348623157E308", "20.000000000000004"}, false, 0, null, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput019() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math.distribution.NormalDistributionImpl", "org.apache.commons.math.distribution.NormalDistributionImpl", "inverseCumulativeProbability", new String[]{"double"}, new String[]{"2.000000000000001"}, false, 0, new String[][]{{"org.apache.commons.math.distribution.NormalDistributionImpl", "getDomainLowerBound", "double", "1.0"}}, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput020() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.distribution.NormalDistributionImpl", "org.apache.commons.math.distribution.NormalDistributionImpl", "getInitialDomain", new String[]{"double"}, new String[]{"4.9E-324"}, false, 0, null, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("-1.0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getMean=0.0, getStandardDeviation=1.0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput021() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.distribution.NormalDistributionImpl", "org.apache.commons.math.distribution.NormalDistributionImpl", "getInitialDomain", new String[]{"double"}, new String[]{"Infinity"}, false, 5, new String[][]{}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("1.0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getMean=0.0, getStandardDeviation=1.0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput022() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.distribution.NormalDistributionImpl", "org.apache.commons.math.distribution.NormalDistributionImpl", "getStandardDeviation", new String[]{}, new String[]{}, false, 0, null, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("1.0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getMean=0.0, getStandardDeviation=1.0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput023() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math.distribution.NormalDistributionImpl", "org.apache.commons.math.distribution.NormalDistributionImpl", "inverseCumulativeProbability", new String[]{"double"}, new String[]{"Infinity"}, false, 6, new String[][]{{"org.apache.commons.math.distribution.NormalDistributionImpl", "inverseCumulativeProbability", "double", "2.0000000000000004"}}, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput024() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.distribution.NormalDistributionImpl", "org.apache.commons.math.distribution.NormalDistributionImpl", "cumulativeProbability", new String[]{"double", "double"}, new String[]{"2.0000000000000004", "2.0000000000000004"}, false, 0, null, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("0.0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getMean=0.0, getStandardDeviation=1.0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput025() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.distribution.NormalDistributionImpl", "org.apache.commons.math.distribution.NormalDistributionImpl", "getInitialDomain", new String[]{"double"}, new String[]{"0.5"}, false, 4, new String[][]{}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("0.0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getMean=0.0, getStandardDeviation=1.0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput026() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.distribution.NormalDistributionImpl", "org.apache.commons.math.distribution.NormalDistributionImpl", "getDomainUpperBound", new String[]{"double"}, new String[]{"-1.43"}, false, 0, null, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("0.0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getMean=0.0, getStandardDeviation=1.0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput027() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.distribution.NormalDistributionImpl", "org.apache.commons.math.distribution.NormalDistributionImpl", "getDomainUpperBound", new String[]{"double"}, new String[]{"1.43"}, false, 0, null, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("1.7976931348623157E308", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getMean=0.0, getStandardDeviation=1.0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput028() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.distribution.NormalDistributionImpl", "org.apache.commons.math.distribution.NormalDistributionImpl", "getDomainLowerBound", new String[]{"double"}, new String[]{"-1.0"}, false, 4, new String[][]{{"org.apache.commons.math.distribution.NormalDistributionImpl", "inverseCumulativeProbability", "double", "1.7976931348623157E308"}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("-1.7976931348623157E308", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getMean=0.0, getStandardDeviation=1.0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput029() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.distribution.NormalDistributionImpl", "org.apache.commons.math.distribution.NormalDistributionImpl", "cumulativeProbability", new String[]{"double"}, new String[]{"-1.7976931348623156E306"}, false, 1, new String[][]{}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("0.0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getMean=0.0, getStandardDeviation=1.0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput030() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.distribution.NormalDistributionImpl", "org.apache.commons.math.distribution.NormalDistributionImpl", "getMean", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.math.distribution.NormalDistributionImpl", "cumulativeProbability", "double", "3.12"}, {"org.apache.commons.math.distribution.NormalDistributionImpl", "setStandardDeviation", "double", "7.2"}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("0.0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getMean=0.0, getStandardDeviation=7.2}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput031() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math.distribution.NormalDistributionImpl", "org.apache.commons.math.distribution.NormalDistributionImpl", "inverseCumulativeProbability", new String[]{"double"}, new String[]{"-0.9999999999999999"}, false, 4, new String[][]{{"org.apache.commons.math.distribution.NormalDistributionImpl", "getDomainLowerBound", "double", "-1.7976931348623157E308"}}, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput032() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.distribution.NormalDistributionImpl", "org.apache.commons.math.distribution.NormalDistributionImpl", "getInitialDomain", new String[]{"double"}, new String[]{"1.3"}, false, 0, null, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("1.0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getMean=0.0, getStandardDeviation=1.0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput033() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.distribution.NormalDistributionImpl", "org.apache.commons.math.distribution.NormalDistributionImpl", "getStandardDeviation", new String[]{}, new String[]{}, false, 0, null, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("1.0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getMean=0.0, getStandardDeviation=1.0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput034() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.distribution.NormalDistributionImpl", "org.apache.commons.math.distribution.NormalDistributionImpl", "getMean", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.math.distribution.NormalDistributionImpl", "setStandardDeviation", "double", "Infinity"}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("0.0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getMean=0.0, getStandardDeviation=Infinity}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput035() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math.distribution.NormalDistributionImpl", "org.apache.commons.math.distribution.NormalDistributionImpl", "setStandardDeviation", new String[]{"double"}, new String[]{"-Infinity"}, false, 0, new String[][]{{"org.apache.commons.math.distribution.NormalDistributionImpl", "cumulativeProbability", "double,double", "Infinity", "-4.0"}}, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput036() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.distribution.NormalDistributionImpl", "org.apache.commons.math.distribution.NormalDistributionImpl", "setMean", new String[]{"double"}, new String[]{"-2.0000000000000004"}, false, 4, new String[][]{}, 1);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getMean=-2.0000000000000004, getStandardDeviation=1.0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput037() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.distribution.NormalDistributionImpl", "org.apache.commons.math.distribution.NormalDistributionImpl", "getDomainUpperBound", new String[]{"double"}, new String[]{"-Infinity"}, false, 0, new String[][]{{"org.apache.commons.math.distribution.NormalDistributionImpl", "getDomainUpperBound", "double", "0.5000000000000001"}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("0.0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getMean=0.0, getStandardDeviation=1.0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput038() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.distribution.NormalDistributionImpl", "org.apache.commons.math.distribution.NormalDistributionImpl", "inverseCumulativeProbability", new String[]{"double"}, new String[]{"NaN"}, false, 0, null, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("0.9999995", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getMean=0.0, getStandardDeviation=1.0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput039() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.distribution.NormalDistributionImpl", "org.apache.commons.math.distribution.NormalDistributionImpl", "getStandardDeviation", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.math.distribution.NormalDistributionImpl", "cumulativeProbability", "double", "8589540077390120676"}, {"org.apache.commons.math.distribution.NormalDistributionImpl", "setStandardDeviation", "double", "1.7976931348623157E308"}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("1.7976931348623157E308", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getMean=0.0, getStandardDeviation=1.7976931348623157E308}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput040() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.distribution.NormalDistributionImpl", "org.apache.commons.math.distribution.NormalDistributionImpl", "getDomainUpperBound", new String[]{"double"}, new String[]{"4.0"}, false, 6, new String[][]{}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("1.7976931348623157E308", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getMean=0.0, getStandardDeviation=1.0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput041() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.distribution.NormalDistributionImpl", "org.apache.commons.math.distribution.NormalDistributionImpl", "getDomainLowerBound", new String[]{"double"}, new String[]{"0.5"}, false, 0, new String[][]{{"org.apache.commons.math.distribution.NormalDistributionImpl", "setMean", "double", "-1.9"}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("-1.9", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getMean=-1.9, getStandardDeviation=1.0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput042() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math.distribution.NormalDistributionImpl", "org.apache.commons.math.distribution.NormalDistributionImpl", "cumulativeProbability", new String[]{"double", "double"}, new String[]{"-1.4299999999999997", "-3.5953862697246315E307"}, false, 6, new String[][]{{"org.apache.commons.math.distribution.NormalDistributionImpl", "inverseCumulativeProbability", "double", "1.7976931348623157E308"}, {"org.apache.commons.math.distribution.NormalDistributionImpl", "setMean", "double", "0.5"}}, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput043() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.distribution.NormalDistributionImpl", "org.apache.commons.math.distribution.NormalDistributionImpl", "cumulativeProbability", new String[]{"double", "double"}, new String[]{"2.0000000000000004", "NaN"}, false, 0, null, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("NaN", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getMean=0.0, getStandardDeviation=1.0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput044() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.distribution.NormalDistributionImpl", "org.apache.commons.math.distribution.NormalDistributionImpl", "getMean", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.math.distribution.NormalDistributionImpl", "setStandardDeviation", "double", "2.0000000000000004"}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("0.0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getMean=0.0, getStandardDeviation=2.0000000000000004}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput045() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.distribution.NormalDistributionImpl", "org.apache.commons.math.distribution.NormalDistributionImpl", "getDomainLowerBound", new String[]{"double"}, new String[]{"10.000000000000002"}, false, 6, new String[][]{}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("0.0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getMean=0.0, getStandardDeviation=1.0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput046() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.distribution.NormalDistributionImpl", "org.apache.commons.math.distribution.NormalDistributionImpl", "cumulativeProbability", new String[]{"double", "double"}, new String[]{"20.0", "Infinity"}, false, 1, new String[][]{{"org.apache.commons.math.distribution.NormalDistributionImpl", "setStandardDeviation", "double", "8.589540077390121E18"}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("0.5", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getMean=0.0, getStandardDeviation=8.589540077390121E18}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput047() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.distribution.NormalDistributionImpl", "org.apache.commons.math.distribution.NormalDistributionImpl", "getInitialDomain", new String[]{"double"}, new String[]{"-2.0"}, false, 5, new String[][]{{"org.apache.commons.math.distribution.NormalDistributionImpl", "setStandardDeviation", "double", "NaN"}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("NaN", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getMean=0.0, getStandardDeviation=NaN}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput048() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.distribution.NormalDistributionImpl", "org.apache.commons.math.distribution.NormalDistributionImpl", "setMean", new String[]{"double"}, new String[]{"4.9E-323"}, false, 4, new String[][]{{"org.apache.commons.math.distribution.NormalDistributionImpl", "inverseCumulativeProbability", "double", "2.0"}}, 2);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getMean=4.9E-323, getStandardDeviation=1.0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput049() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.distribution.NormalDistributionImpl", "org.apache.commons.math.distribution.NormalDistributionImpl", "getDomainUpperBound", new String[]{"double"}, new String[]{"10.0"}, false, 0, new String[][]{{"org.apache.commons.math.distribution.NormalDistributionImpl", "inverseCumulativeProbability", "double", "-1.7976931348623155E308"}, {"org.apache.commons.math.distribution.NormalDistributionImpl", "cumulativeProbability", "double,double", "Infinity", "2.0630000000000006"}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("1.7976931348623157E308", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getMean=0.0, getStandardDeviation=1.0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput050() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.distribution.NormalDistributionImpl", "org.apache.commons.math.distribution.NormalDistributionImpl", "cumulativeProbability", new String[]{"double", "double"}, new String[]{"15.0", "20.0"}, false, 0, new String[][]{{"org.apache.commons.math.distribution.NormalDistributionImpl", "getInitialDomain", "double", "4.0"}, {"org.apache.commons.math.distribution.NormalDistributionImpl", "cumulativeProbability", "double,double", "Infinity", "Infinity"}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("-1.0769163338864018E-14", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getMean=0.0, getStandardDeviation=1.0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput051() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.distribution.NormalDistributionImpl", "org.apache.commons.math.distribution.NormalDistributionImpl", "setMean", new String[]{"double"}, new String[]{"-2.000000000000001"}, false, 0, null, 2);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getMean=-2.000000000000001, getStandardDeviation=1.0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput052() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.distribution.NormalDistributionImpl", "org.apache.commons.math.distribution.NormalDistributionImpl", "cumulativeProbability", new String[]{"double"}, new String[]{"2.0000000000000004"}, false, 0, new String[][]{{"org.apache.commons.math.distribution.NormalDistributionImpl", "getDomainLowerBound", "double", "4.0"}, {"org.apache.commons.math.distribution.NormalDistributionImpl", "setMean", "double", "-1.7976931348623158E307"}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("1.0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getMean=-1.7976931348623158E307, getStandardDeviation=1.0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput053() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.distribution.NormalDistributionImpl", "org.apache.commons.math.distribution.NormalDistributionImpl", "setMean", new String[]{"double"}, new String[]{"-1.43"}, false, 6, new String[][]{{"org.apache.commons.math.distribution.NormalDistributionImpl", "inverseCumulativeProbability", "double", "1.7976931348623157E308"}, {"org.apache.commons.math.distribution.NormalDistributionImpl", "getDomainUpperBound", "double", "8.589540077390122E18"}}, 2);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getMean=-1.43, getStandardDeviation=1.0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput054() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.distribution.NormalDistributionImpl", "org.apache.commons.math.distribution.NormalDistributionImpl", "cumulativeProbability", new String[]{"double"}, new String[]{"Infinity"}, false, 0, null, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("1.0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getMean=0.0, getStandardDeviation=1.0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput055() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.distribution.NormalDistributionImpl", "org.apache.commons.math.distribution.NormalDistributionImpl", "cumulativeProbability", new String[]{"double"}, new String[]{"-1.7976931348623158E307"}, false, 0, null, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("0.0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getMean=0.0, getStandardDeviation=1.0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput056() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.distribution.NormalDistributionImpl", "org.apache.commons.math.distribution.NormalDistributionImpl", "cumulativeProbability", new String[]{"double"}, new String[]{"NaN"}, false, 0, new String[][]{{"org.apache.commons.math.distribution.NormalDistributionImpl", "getMean", ""}, {"org.apache.commons.math.distribution.NormalDistributionImpl", "getDomainLowerBound", "double", "12.0"}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("NaN", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getMean=0.0, getStandardDeviation=1.0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput057() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.distribution.NormalDistributionImpl", "org.apache.commons.math.distribution.NormalDistributionImpl", "getInitialDomain", new String[]{"double"}, new String[]{"-1.797693134862316E307"}, false, 5, new String[][]{{"org.apache.commons.math.distribution.NormalDistributionImpl", "getDomainLowerBound", "double", "-1.7976931348623157E308"}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("-1.0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getMean=0.0, getStandardDeviation=1.0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput058() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.distribution.NormalDistributionImpl", "org.apache.commons.math.distribution.NormalDistributionImpl", "cumulativeProbability", new String[]{"double"}, new String[]{"19.999999999999996"}, false, 1, new String[][]{{"org.apache.commons.math.distribution.NormalDistributionImpl", "getMean", ""}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("0.9999999999999918", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getMean=0.0, getStandardDeviation=1.0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput059() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.distribution.NormalDistributionImpl", "org.apache.commons.math.distribution.NormalDistributionImpl", "setMean", new String[]{"double"}, new String[]{"0.0"}, false, 0, null, 2);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getMean=0.0, getStandardDeviation=1.0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput060() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.distribution.NormalDistributionImpl", "org.apache.commons.math.distribution.NormalDistributionImpl", "getDomainLowerBound", new String[]{"double"}, new String[]{"2.0"}, false, 7, new String[][]{{"org.apache.commons.math.distribution.NormalDistributionImpl", "setMean", "double", "-1.7976931348623155E308"}, {"org.apache.commons.math.distribution.NormalDistributionImpl", "inverseCumulativeProbability", "double", "-8.988465674311579E307"}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("-1.7976931348623155E308", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getMean=-1.7976931348623155E308, getStandardDeviation=Infinity}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput061() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.distribution.NormalDistributionImpl", "org.apache.commons.math.distribution.NormalDistributionImpl", "cumulativeProbability", new String[]{"double"}, new String[]{"0.5"}, false, 2, new String[][]{{"org.apache.commons.math.distribution.NormalDistributionImpl", "getStandardDeviation", ""}, {"org.apache.commons.math.distribution.NormalDistributionImpl", "cumulativeProbability", "double,double", "0.0", "-1.4300000000000002"}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("0.691462461274013", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getMean=0.0, getStandardDeviation=1.0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput062() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.distribution.NormalDistributionImpl", "org.apache.commons.math.distribution.NormalDistributionImpl", "getMean", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.math.distribution.NormalDistributionImpl", "setStandardDeviation", "double", "4.9E-324"}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("0.0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getMean=0.0, getStandardDeviation=4.9E-324}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput063() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.distribution.NormalDistributionImpl", "org.apache.commons.math.distribution.NormalDistributionImpl", "getInitialDomain", new String[]{"double"}, new String[]{"-1.7976931348623163E307"}, false, 0, new String[][]{{"org.apache.commons.math.distribution.NormalDistributionImpl", "getDomainUpperBound", "double", "-0.0"}, {"org.apache.commons.math.distribution.NormalDistributionImpl", "setMean", "double", "NaN"}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("NaN", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getMean=NaN, getStandardDeviation=1.0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput064() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.distribution.NormalDistributionImpl", "org.apache.commons.math.distribution.NormalDistributionImpl", "cumulativeProbability", new String[]{"double", "double"}, new String[]{"-1.7976931348623158E307", "8589540077390120676"}, false, 0, new String[][]{{"org.apache.commons.math.distribution.NormalDistributionImpl", "getMean", ""}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("1.0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getMean=0.0, getStandardDeviation=1.0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput065() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.distribution.NormalDistributionImpl", "org.apache.commons.math.distribution.NormalDistributionImpl", "setStandardDeviation", new String[]{"double"}, new String[]{"0.5000000000000001"}, false, 0, null, 1);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getMean=0.0, getStandardDeviation=0.5000000000000001}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput066() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.distribution.NormalDistributionImpl", "org.apache.commons.math.distribution.NormalDistributionImpl", "cumulativeProbability", new String[]{"double"}, new String[]{"3.978"}, false, 0, new String[][]{{"org.apache.commons.math.distribution.NormalDistributionImpl", "cumulativeProbability", "double,double", "0.5000000000000001", "-1.7976931348623157E308"}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("0.9999652513141086", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getMean=0.0, getStandardDeviation=1.0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput067() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.distribution.NormalDistributionImpl", "org.apache.commons.math.distribution.NormalDistributionImpl", "getInitialDomain", new String[]{"double"}, new String[]{"0.5"}, false, 0, new String[][]{{"org.apache.commons.math.distribution.NormalDistributionImpl", "inverseCumulativeProbability", "double", "1.67"}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("0.0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getMean=0.0, getStandardDeviation=1.0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput068() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.distribution.NormalDistributionImpl", "org.apache.commons.math.distribution.NormalDistributionImpl", "cumulativeProbability", new String[]{"double"}, new String[]{"4.000000000000001"}, false, 0, new String[][]{{"org.apache.commons.math.distribution.NormalDistributionImpl", "setMean", "double", "1.7976931348623157E308"}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("0.0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getMean=1.7976931348623157E308, getStandardDeviation=1.0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput069() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.distribution.NormalDistributionImpl", "org.apache.commons.math.distribution.NormalDistributionImpl", "cumulativeProbability", new String[]{"double", "double"}, new String[]{"0.4", "2.0"}, false, 0, null, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("0.3218281264414967", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getMean=0.0, getStandardDeviation=1.0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput070() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.distribution.NormalDistributionImpl", "org.apache.commons.math.distribution.NormalDistributionImpl", "getDomainLowerBound", new String[]{"double"}, new String[]{"-1.7976931348623158E307"}, false, 0, new String[][]{{"org.apache.commons.math.distribution.NormalDistributionImpl", "setStandardDeviation", "double", "0.5"}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("-1.7976931348623157E308", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getMean=0.0, getStandardDeviation=0.5}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput071() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.distribution.NormalDistributionImpl", "org.apache.commons.math.distribution.NormalDistributionImpl", "cumulativeProbability", new String[]{"double"}, new String[]{"2.0"}, false, 0, new String[][]{{"org.apache.commons.math.distribution.NormalDistributionImpl", "getMean", ""}, {"org.apache.commons.math.distribution.NormalDistributionImpl", "getMean", ""}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("0.9772498680518209", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getMean=0.0, getStandardDeviation=1.0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput072() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.distribution.NormalDistributionImpl", "org.apache.commons.math.distribution.NormalDistributionImpl", "setStandardDeviation", new String[]{"double"}, new String[]{"4.000000000000001"}, false, 2, new String[][]{{"org.apache.commons.math.distribution.NormalDistributionImpl", "getStandardDeviation", ""}}, 1);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getMean=0.0, getStandardDeviation=4.000000000000001}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput073() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.distribution.NormalDistributionImpl", "org.apache.commons.math.distribution.NormalDistributionImpl", "cumulativeProbability", new String[]{"double", "double"}, new String[]{"20.0", "1.7976931348623157E308"}, false, 4, new String[][]{}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("7.66053886991358E-15", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getMean=0.0, getStandardDeviation=1.0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput074() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.distribution.NormalDistributionImpl", "org.apache.commons.math.distribution.NormalDistributionImpl", "cumulativeProbability", new String[]{"double", "double"}, new String[]{"0.5", "1.7976931348623157E308"}, false, 5, new String[][]{{"org.apache.commons.math.distribution.NormalDistributionImpl", "getMean", ""}, {"org.apache.commons.math.distribution.NormalDistributionImpl", "getMean", ""}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("0.308537538725987", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getMean=0.0, getStandardDeviation=1.0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput075() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.distribution.NormalDistributionImpl", "org.apache.commons.math.distribution.NormalDistributionImpl", "cumulativeProbability", new String[]{"double", "double"}, new String[]{"-7.0", "Infinity"}, false, 0, new String[][]{{"org.apache.commons.math.distribution.NormalDistributionImpl", "setMean", "double", "8.589540077390121E17"}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("1.0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getMean=8.589540077390121E17, getStandardDeviation=1.0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput076() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.distribution.NormalDistributionImpl", "org.apache.commons.math.distribution.NormalDistributionImpl", "setMean", new String[]{"double"}, new String[]{"-10.000000000000002"}, false, 0, new String[][]{{"org.apache.commons.math.distribution.NormalDistributionImpl", "getInitialDomain", "double", "200.00000000000003"}}, 2);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getMean=-10.000000000000002, getStandardDeviation=1.0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput077() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.distribution.NormalDistributionImpl", "org.apache.commons.math.distribution.NormalDistributionImpl", "setStandardDeviation", new String[]{"double"}, new String[]{"NaN"}, false, 0, new String[][]{{"org.apache.commons.math.distribution.NormalDistributionImpl", "cumulativeProbability", "double,double", "1.0", "19.999999999999996"}}, 3);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getMean=0.0, getStandardDeviation=NaN}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput078() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.distribution.NormalDistributionImpl", "org.apache.commons.math.distribution.NormalDistributionImpl", "cumulativeProbability", new String[]{"double", "double"}, new String[]{"-3.5953862697246315E307", "0.5000000000000001"}, false, 0, new String[][]{{"org.apache.commons.math.distribution.NormalDistributionImpl", "inverseCumulativeProbability", "double", "-0.5000000000000001"}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("0.6914624612740132", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getMean=0.0, getStandardDeviation=1.0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput079() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.distribution.NormalDistributionImpl", "org.apache.commons.math.distribution.NormalDistributionImpl", "cumulativeProbability", new String[]{"double"}, new String[]{"1.0E-323"}, false, 0, null, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("0.5", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getMean=0.0, getStandardDeviation=1.0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput080() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.distribution.NormalDistributionImpl", "org.apache.commons.math.distribution.NormalDistributionImpl", "getInitialDomain", new String[]{"double"}, new String[]{"-8.988465674311579E306"}, false, 0, null, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("-1.0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getMean=0.0, getStandardDeviation=1.0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput081() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.distribution.NormalDistributionImpl", "org.apache.commons.math.distribution.NormalDistributionImpl", "cumulativeProbability", new String[]{"double"}, new String[]{"20.0"}, false, 0, new String[][]{{"org.apache.commons.math.distribution.NormalDistributionImpl", "cumulativeProbability", "double", "Infinity"}});
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("0.9999999999999923", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getMean=0.0, getStandardDeviation=1.0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput082() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math.distribution.NormalDistributionImpl", "org.apache.commons.math.distribution.NormalDistributionImpl", "inverseCumulativeProbability", new String[]{"double"}, new String[]{"Infinity"}, false); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput083() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.distribution.NormalDistributionImpl", "org.apache.commons.math.distribution.NormalDistributionImpl", "inverseCumulativeProbability", new String[]{"double"}, new String[]{"4.9E-324"}, false, 0, new String[][]{{"org.apache.commons.math.distribution.NormalDistributionImpl", "setStandardDeviation", "double", "-1.43"}});
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("-9.0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getMean=0.0, getStandardDeviation=1.0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput084() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.distribution.NormalDistributionImpl", "org.apache.commons.math.distribution.NormalDistributionImpl", "getStandardDeviation", new String[]{}, new String[]{}, false);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("1.0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getMean=0.0, getStandardDeviation=1.0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput085() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.distribution.NormalDistributionImpl", "org.apache.commons.math.distribution.NormalDistributionImpl", "getMean", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.math.distribution.NormalDistributionImpl", "getDomainUpperBound", "double", "0.0"}});
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("0.0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getMean=0.0, getStandardDeviation=1.0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput086() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.distribution.NormalDistributionImpl", "org.apache.commons.math.distribution.NormalDistributionImpl", "cumulativeProbability", new String[]{"double", "double"}, new String[]{"-1.0", "8.589540077390121E18"}, false);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("0.841344746068543", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getMean=0.0, getStandardDeviation=1.0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput087() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.distribution.NormalDistributionImpl", "org.apache.commons.math.distribution.NormalDistributionImpl", "cumulativeProbability", new String[]{"double"}, new String[]{"NaN"}, false);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("NaN", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getMean=0.0, getStandardDeviation=1.0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput088() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.distribution.NormalDistributionImpl", "org.apache.commons.math.distribution.NormalDistributionImpl", "cumulativeProbability", new String[]{"double"}, new String[]{"Infinity"}, false, 4, new String[][]{});
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("1.0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getMean=0.0, getStandardDeviation=1.0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput089() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.distribution.NormalDistributionImpl", "org.apache.commons.math.distribution.NormalDistributionImpl", "setStandardDeviation", new String[]{"double"}, new String[]{"1.7976931348623157E308"}, false, 6, new String[][]{{"org.apache.commons.math.distribution.NormalDistributionImpl", "cumulativeProbability", "double,double", "2.0", "20.0"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getMean=0.0, getStandardDeviation=1.7976931348623157E308}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput090() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.distribution.NormalDistributionImpl", "org.apache.commons.math.distribution.NormalDistributionImpl", "cumulativeProbability", new String[]{"double", "double"}, new String[]{"1.0", "4.0"}, false, 2, new String[][]{});
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("0.1586235826896243", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getMean=0.0, getStandardDeviation=1.0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput091() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.distribution.NormalDistributionImpl", "org.apache.commons.math.distribution.NormalDistributionImpl", "cumulativeProbability", new String[]{"double"}, new String[]{"0.5"}, false, 5, new String[][]{{"org.apache.commons.math.distribution.NormalDistributionImpl", "getInitialDomain", "double", "28.700000000000003"}});
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("0.691462461274013", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getMean=0.0, getStandardDeviation=1.0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput092() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.distribution.NormalDistributionImpl", "org.apache.commons.math.distribution.NormalDistributionImpl", "getDomainUpperBound", new String[]{"double"}, new String[]{"1.0"}, false, 3, new String[][]{});
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("1.7976931348623157E308", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getMean=0.0, getStandardDeviation=1.0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput093() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math.distribution.NormalDistributionImpl", "org.apache.commons.math.distribution.NormalDistributionImpl", "cumulativeProbability", new String[]{"double", "double"}, new String[]{"-1.0", "-1.4299999999999997"}, false, 4, new String[][]{}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput094() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.distribution.NormalDistributionImpl", "org.apache.commons.math.distribution.NormalDistributionImpl", "getInitialDomain", new String[]{"double"}, new String[]{"-Infinity"}, false, 0, new String[][]{{"org.apache.commons.math.distribution.NormalDistributionImpl", "cumulativeProbability", "double,double", "-1.4299999999999997", "8589540077390120676"}});
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("-1.0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getMean=0.0, getStandardDeviation=1.0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput095() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.distribution.NormalDistributionImpl", "org.apache.commons.math.distribution.NormalDistributionImpl", "getDomainLowerBound", new String[]{"double"}, new String[]{"1.0"}, false, 0, new String[][]{{"org.apache.commons.math.distribution.NormalDistributionImpl", "setStandardDeviation", "double", "10.0"}});
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("0.0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getMean=0.0, getStandardDeviation=10.0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput096() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.distribution.NormalDistributionImpl", "org.apache.commons.math.distribution.NormalDistributionImpl", "getInitialDomain", new String[]{"double"}, new String[]{"NaN"}, false, 4, new String[][]{});
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("0.0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getMean=0.0, getStandardDeviation=1.0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput097() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.distribution.NormalDistributionImpl", "org.apache.commons.math.distribution.NormalDistributionImpl", "cumulativeProbability", new String[]{"double", "double"}, new String[]{"NaN", "0.5"}, false, 1, new String[][]{{"org.apache.commons.math.distribution.NormalDistributionImpl", "cumulativeProbability", "double,double", "-1.0", "-0.78"}});
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("NaN", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getMean=0.0, getStandardDeviation=1.0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput098() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.distribution.NormalDistributionImpl", "org.apache.commons.math.distribution.NormalDistributionImpl", "getInitialDomain", new String[]{"double"}, new String[]{"8.589540077390121E18"}, false, 0, new String[][]{{"org.apache.commons.math.distribution.NormalDistributionImpl", "getStandardDeviation", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("1.0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getMean=0.0, getStandardDeviation=1.0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput099() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.distribution.NormalDistributionImpl", "org.apache.commons.math.distribution.NormalDistributionImpl", "cumulativeProbability", new String[]{"double"}, new String[]{"2.0"}, false);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("0.9772498680518209", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getMean=0.0, getStandardDeviation=1.0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput100() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.distribution.NormalDistributionImpl", "org.apache.commons.math.distribution.NormalDistributionImpl", "cumulativeProbability", new String[]{"double"}, new String[]{"4.9E-324"}, false, 5, new String[][]{{"org.apache.commons.math.distribution.NormalDistributionImpl", "inverseCumulativeProbability", "double", "Infinity"}});
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("0.5", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getMean=0.0, getStandardDeviation=1.0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput101() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.distribution.NormalDistributionImpl", "org.apache.commons.math.distribution.NormalDistributionImpl", "cumulativeProbability", new String[]{"double", "double"}, new String[]{"1.43", "Infinity"}, false, 0, new String[][]{{"org.apache.commons.math.distribution.NormalDistributionImpl", "getMean", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("0.07635850953673906", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getMean=0.0, getStandardDeviation=1.0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput102() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.distribution.NormalDistributionImpl", "org.apache.commons.math.distribution.NormalDistributionImpl", "getDomainUpperBound", new String[]{"double"}, new String[]{"-11.0"}, false, 0, new String[][]{{"org.apache.commons.math.distribution.NormalDistributionImpl", "setStandardDeviation", "double", "8.5895400773901199E18"}});
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("0.0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getMean=0.0, getStandardDeviation=8.5895400773901199E18}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput103() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.distribution.NormalDistributionImpl", "org.apache.commons.math.distribution.NormalDistributionImpl", "getDomainLowerBound", new String[]{"double"}, new String[]{"-1.7976931348623155E308"}, false);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("-1.7976931348623157E308", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getMean=0.0, getStandardDeviation=1.0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput104() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.distribution.NormalDistributionImpl", "org.apache.commons.math.distribution.NormalDistributionImpl", "getDomainUpperBound", new String[]{"double"}, new String[]{"Infinity"}, false, 5, new String[][]{{"org.apache.commons.math.distribution.NormalDistributionImpl", "setMean", "double", "-1.4299999999999995"}});
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("1.7976931348623157E308", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getMean=-1.4299999999999995, getStandardDeviation=1.0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput105() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.distribution.NormalDistributionImpl", "org.apache.commons.math.distribution.NormalDistributionImpl", "setStandardDeviation", new String[]{"double"}, new String[]{"8.988465674311579E307"}, false, 5, new String[][]{{"org.apache.commons.math.distribution.NormalDistributionImpl", "setStandardDeviation", "double", "8.589540077390122E18"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getMean=0.0, getStandardDeviation=8.988465674311579E307}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput106() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.distribution.NormalDistributionImpl", "org.apache.commons.math.distribution.NormalDistributionImpl", "getMean", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.math.distribution.NormalDistributionImpl", "cumulativeProbability", "double,double", "-1.7976931348623158E307", "NaN"}});
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("0.0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getMean=0.0, getStandardDeviation=1.0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput107() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.distribution.NormalDistributionImpl", "org.apache.commons.math.distribution.NormalDistributionImpl", "setStandardDeviation", new String[]{"double"}, new String[]{"1.7976931348623155E308"}, false, 0, new String[][]{{"org.apache.commons.math.distribution.NormalDistributionImpl", "cumulativeProbability", "double,double", "-8.589540077390121E18", "2.0000000000000004"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getMean=0.0, getStandardDeviation=1.7976931348623155E308}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput108() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.distribution.NormalDistributionImpl", "org.apache.commons.math.distribution.NormalDistributionImpl", "cumulativeProbability", new String[]{"double"}, new String[]{"-1.4299999999999997"}, false);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("0.07635850953673912", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getMean=0.0, getStandardDeviation=1.0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput109() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.distribution.NormalDistributionImpl", "org.apache.commons.math.distribution.NormalDistributionImpl", "getStandardDeviation", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.math.distribution.NormalDistributionImpl", "setMean", "double", "-14.299999999999997"}});
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("1.0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getMean=-14.299999999999997, getStandardDeviation=1.0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput110() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.distribution.NormalDistributionImpl", "org.apache.commons.math.distribution.NormalDistributionImpl", "getMean", new String[]{}, new String[]{}, false, 2, new String[][]{{"org.apache.commons.math.distribution.NormalDistributionImpl", "setMean", "double", "-0.7150000000000001"}});
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("-0.7150000000000001", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getMean=-0.7150000000000001, getStandardDeviation=1.0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput111() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.distribution.NormalDistributionImpl", "org.apache.commons.math.distribution.NormalDistributionImpl", "setStandardDeviation", new String[]{"double"}, new String[]{"NaN"}, false, 7, new String[][]{});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getMean=1.0, getStandardDeviation=NaN}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput112() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.distribution.NormalDistributionImpl", "org.apache.commons.math.distribution.NormalDistributionImpl", "cumulativeProbability", new String[]{"double"}, new String[]{"0.7000000000000004"}, false);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("0.7580363477769272", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getMean=0.0, getStandardDeviation=1.0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput113() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.distribution.NormalDistributionImpl", "org.apache.commons.math.distribution.NormalDistributionImpl", "getMean", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.math.distribution.NormalDistributionImpl", "setStandardDeviation", "double", "1.7976931348623158E307"}, {"org.apache.commons.math.distribution.NormalDistributionImpl", "getDomainUpperBound", "double", "1.7976931348623157E308"}});
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("0.0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getMean=0.0, getStandardDeviation=1.7976931348623158E307}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput114() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.distribution.NormalDistributionImpl", "org.apache.commons.math.distribution.NormalDistributionImpl", "getDomainUpperBound", new String[]{"double"}, new String[]{"1.7976931348623158E307"}, false, 0, new String[][]{{"org.apache.commons.math.distribution.NormalDistributionImpl", "setStandardDeviation", "double", "Infinity"}});
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("1.7976931348623157E308", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getMean=0.0, getStandardDeviation=Infinity}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput115() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.distribution.NormalDistributionImpl", "org.apache.commons.math.distribution.NormalDistributionImpl", "getDomainLowerBound", new String[]{"double"}, new String[]{"-1.43"}, false, 7, new String[][]{{"org.apache.commons.math.distribution.NormalDistributionImpl", "cumulativeProbability", "double,double", "-5.2", "1.0000000000000002"}});
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("-1.7976931348623157E308", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getMean=1.0, getStandardDeviation=Infinity}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput116() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.distribution.NormalDistributionImpl", "org.apache.commons.math.distribution.NormalDistributionImpl", "cumulativeProbability", new String[]{"double", "double"}, new String[]{"-0.05", "0.5000000000000001"}, false);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("0.21140126711238572", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getMean=0.0, getStandardDeviation=1.0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput117() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math.distribution.NormalDistributionImpl", "org.apache.commons.math.distribution.NormalDistributionImpl", "setStandardDeviation", new String[]{"double"}, new String[]{"-1.7976931348623158E307"}, false, 0, new String[][]{{"org.apache.commons.math.distribution.NormalDistributionImpl", "getStandardDeviation", ""}, {"org.apache.commons.math.distribution.NormalDistributionImpl", "cumulativeProbability", "double", "4.9E-324"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput118() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.distribution.NormalDistributionImpl", "org.apache.commons.math.distribution.NormalDistributionImpl", "getStandardDeviation", new String[]{}, new String[]{}, false, 7, new String[][]{{"org.apache.commons.math.distribution.NormalDistributionImpl", "getStandardDeviation", ""}, {"org.apache.commons.math.distribution.NormalDistributionImpl", "getDomainLowerBound", "double", "Infinity"}});
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("Infinity", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getMean=1.0, getStandardDeviation=Infinity}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput119() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.distribution.NormalDistributionImpl", "org.apache.commons.math.distribution.NormalDistributionImpl", "cumulativeProbability", new String[]{"double"}, new String[]{"-2.0"}, false, 0, new String[][]{{"org.apache.commons.math.distribution.NormalDistributionImpl", "getDomainUpperBound", "double", "Infinity"}});
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("0.022750131948179153", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getMean=0.0, getStandardDeviation=1.0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput120() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.distribution.NormalDistributionImpl", "org.apache.commons.math.distribution.NormalDistributionImpl", "getStandardDeviation", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.math.distribution.NormalDistributionImpl", "setStandardDeviation", "double", "Infinity"}});
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("Infinity", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getMean=0.0, getStandardDeviation=Infinity}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput121() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.distribution.NormalDistributionImpl", "org.apache.commons.math.distribution.NormalDistributionImpl", "inverseCumulativeProbability", new String[]{"double"}, new String[]{"NaN"}, false, 0, new String[][]{{"org.apache.commons.math.distribution.NormalDistributionImpl", "cumulativeProbability", "double,double", "-1.7976931348623157E308", "20.0"}});
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("0.9999995", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getMean=0.0, getStandardDeviation=1.0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput122() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.distribution.NormalDistributionImpl", "org.apache.commons.math.distribution.NormalDistributionImpl", "getStandardDeviation", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.math.distribution.NormalDistributionImpl", "setStandardDeviation", "double", "4.0"}});
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("4.0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getMean=0.0, getStandardDeviation=4.0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput123() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.distribution.NormalDistributionImpl", "org.apache.commons.math.distribution.NormalDistributionImpl", "cumulativeProbability", new String[]{"double"}, new String[]{"-1.7976931348623158E307"}, false, 1, new String[][]{{"org.apache.commons.math.distribution.NormalDistributionImpl", "setStandardDeviation", "double", "Infinity"}});
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("0.5", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getMean=0.0, getStandardDeviation=Infinity}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput124() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.distribution.NormalDistributionImpl", "org.apache.commons.math.distribution.NormalDistributionImpl", "getDomainUpperBound", new String[]{"double"}, new String[]{"NaN"}, false, 2, new String[][]{{"org.apache.commons.math.distribution.NormalDistributionImpl", "setStandardDeviation", "double", "2.0"}});
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("1.7976931348623157E308", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getMean=0.0, getStandardDeviation=2.0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput125() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.distribution.NormalDistributionImpl", "org.apache.commons.math.distribution.NormalDistributionImpl", "getMean", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.math.distribution.NormalDistributionImpl", "setMean", "double", "1.7976931348623158E307"}});
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("1.7976931348623158E307", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getMean=1.7976931348623158E307, getStandardDeviation=1.0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput126() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.distribution.NormalDistributionImpl", "org.apache.commons.math.distribution.NormalDistributionImpl", "cumulativeProbability", new String[]{"double", "double"}, new String[]{"0.25", "1.0"}, false, 0, new String[][]{{"org.apache.commons.math.distribution.NormalDistributionImpl", "getDomainLowerBound", "double", "-1.4299999999999997"}});
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("0.24263842038561934", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getMean=0.0, getStandardDeviation=1.0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput127() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.distribution.NormalDistributionImpl", "org.apache.commons.math.distribution.NormalDistributionImpl", "getMean", new String[]{}, new String[]{}, false, 6, new String[][]{{"org.apache.commons.math.distribution.NormalDistributionImpl", "setStandardDeviation", "double", "8.589540077390122E18"}});
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("0.0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getMean=0.0, getStandardDeviation=8.589540077390122E18}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput128() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.distribution.NormalDistributionImpl", "org.apache.commons.math.distribution.NormalDistributionImpl", "getDomainUpperBound", new String[]{"double"}, new String[]{"-1.0000000000000002"}, false, 0, new String[][]{{"org.apache.commons.math.distribution.NormalDistributionImpl", "setStandardDeviation", "double", "NaN"}});
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("0.0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getMean=0.0, getStandardDeviation=NaN}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput129() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.distribution.NormalDistributionImpl", "org.apache.commons.math.distribution.NormalDistributionImpl", "getDomainLowerBound", new String[]{"double"}, new String[]{"-35.0"}, false, 0, new String[][]{{"org.apache.commons.math.distribution.NormalDistributionImpl", "setMean", "double", "20.000000000000004"}});
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("-1.7976931348623157E308", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getMean=20.000000000000004, getStandardDeviation=1.0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput130() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.distribution.NormalDistributionImpl", "org.apache.commons.math.distribution.NormalDistributionImpl", "getMean", new String[]{}, new String[]{}, false, 7, new String[][]{{"org.apache.commons.math.distribution.NormalDistributionImpl", "inverseCumulativeProbability", "double", "0.9299999999999999"}, {"org.apache.commons.math.distribution.NormalDistributionImpl", "getMean", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("1.0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getMean=1.0, getStandardDeviation=Infinity}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput131() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.distribution.NormalDistributionImpl", "org.apache.commons.math.distribution.NormalDistributionImpl", "getInitialDomain", new String[]{"double"}, new String[]{"4.0"}, false, 0, new String[][]{{"org.apache.commons.math.distribution.NormalDistributionImpl", "setStandardDeviation", "double", "10.000000000000002"}});
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("10.000000000000002", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getMean=0.0, getStandardDeviation=10.000000000000002}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput132() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.distribution.NormalDistributionImpl", "org.apache.commons.math.distribution.NormalDistributionImpl", "setMean", new String[]{"double"}, new String[]{"-1.7976931348623157E308"}, false, 5, new String[][]{{"org.apache.commons.math.distribution.NormalDistributionImpl", "setMean", "double", "53.0"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getMean=-1.7976931348623157E308, getStandardDeviation=1.0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput133() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.distribution.NormalDistributionImpl", "org.apache.commons.math.distribution.NormalDistributionImpl", "getInitialDomain", new String[]{"double"}, new String[]{"-4.0"}, false, 0, new String[][]{{"org.apache.commons.math.distribution.NormalDistributionImpl", "setStandardDeviation", "double", "40.0"}, {"org.apache.commons.math.distribution.NormalDistributionImpl", "cumulativeProbability", "double,double", "Infinity", "-4.0"}});
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("-40.0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getMean=0.0, getStandardDeviation=40.0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput134() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.distribution.NormalDistributionImpl", "org.apache.commons.math.distribution.NormalDistributionImpl", "cumulativeProbability", new String[]{"double"}, new String[]{"0.9999999999999999"}, false, 7, new String[][]{});
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("0.5", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getMean=1.0, getStandardDeviation=Infinity}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput135() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.distribution.NormalDistributionImpl", "org.apache.commons.math.distribution.NormalDistributionImpl", "getInitialDomain", new String[]{"double"}, new String[]{"19.999999999999993"}, false, 1, new String[][]{{"org.apache.commons.math.distribution.NormalDistributionImpl", "setStandardDeviation", "double", "19.963"}});
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("19.963", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getMean=0.0, getStandardDeviation=19.963}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput136() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.distribution.NormalDistributionImpl", "org.apache.commons.math.distribution.NormalDistributionImpl", "getStandardDeviation", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.math.distribution.NormalDistributionImpl", "setMean", "double", "Infinity"}});
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("1.0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getMean=Infinity, getStandardDeviation=1.0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput137() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.distribution.NormalDistributionImpl", "org.apache.commons.math.distribution.NormalDistributionImpl", "cumulativeProbability", new String[]{"double", "double"}, new String[]{"-1.4300000000000002", "-0.715"}, false, 0, new String[][]{{"org.apache.commons.math.distribution.NormalDistributionImpl", "inverseCumulativeProbability", "double", "14.299999999999999"}});
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("0.16094601210310833", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getMean=0.0, getStandardDeviation=1.0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput138() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.distribution.NormalDistributionImpl", "org.apache.commons.math.distribution.NormalDistributionImpl", "getInitialDomain", new String[]{"double"}, new String[]{"NaN"}, false, 4, new String[][]{{"org.apache.commons.math.distribution.NormalDistributionImpl", "setStandardDeviation", "double", "20.0"}});
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("0.0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getMean=0.0, getStandardDeviation=20.0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput139() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.distribution.NormalDistributionImpl", "org.apache.commons.math.distribution.NormalDistributionImpl", "getDomainLowerBound", new String[]{"double"}, new String[]{"10.0"}, false, 7, new String[][]{});
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("1.0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getMean=1.0, getStandardDeviation=Infinity}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput140() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.distribution.NormalDistributionImpl", "org.apache.commons.math.distribution.NormalDistributionImpl", "inverseCumulativeProbability", new String[]{"double"}, new String[]{"0.05"}, false, 0, new String[][]{{"org.apache.commons.math.distribution.NormalDistributionImpl", "getMean", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("-1.6448536283610327", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getMean=0.0, getStandardDeviation=1.0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput141() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.distribution.NormalDistributionImpl", "org.apache.commons.math.distribution.NormalDistributionImpl", "setStandardDeviation", new String[]{"double"}, new String[]{"6.700000000000001"}, false, 3, new String[][]{{"org.apache.commons.math.distribution.NormalDistributionImpl", "getStandardDeviation", ""}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getMean=0.0, getStandardDeviation=6.700000000000001}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput142() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.distribution.NormalDistributionImpl", "org.apache.commons.math.distribution.NormalDistributionImpl", "cumulativeProbability", new String[]{"double"}, new String[]{"NaN"}, false, 0, new String[][]{{"org.apache.commons.math.distribution.NormalDistributionImpl", "setStandardDeviation", "double", "1.7976931348623157E308"}});
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("NaN", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getMean=0.0, getStandardDeviation=1.7976931348623157E308}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput143() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.distribution.NormalDistributionImpl", "org.apache.commons.math.distribution.NormalDistributionImpl", "getDomainLowerBound", new String[]{"double"}, new String[]{"8.0"}, false, 7, new String[][]{{"org.apache.commons.math.distribution.NormalDistributionImpl", "setMean", "double", "-1.7976931348623158E307"}, {"org.apache.commons.math.distribution.NormalDistributionImpl", "cumulativeProbability", "double,double", "-0.1", "-1.0"}});
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("-1.7976931348623158E307", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getMean=-1.7976931348623158E307, getStandardDeviation=Infinity}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput144() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.distribution.NormalDistributionImpl", "org.apache.commons.math.distribution.NormalDistributionImpl", "cumulativeProbability", new String[]{"double", "double"}, new String[]{"NaN", "NaN"}, false, 0, new String[][]{{"org.apache.commons.math.distribution.NormalDistributionImpl", "setStandardDeviation", "double", "8589540077390120676"}});
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("NaN", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getMean=0.0, getStandardDeviation=8.589540077390121E18}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput145() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.distribution.NormalDistributionImpl", "org.apache.commons.math.distribution.NormalDistributionImpl", "getDomainLowerBound", new String[]{"double"}, new String[]{"-2.86"}, false, 0, new String[][]{{"org.apache.commons.math.distribution.NormalDistributionImpl", "setStandardDeviation", "double", "1.7976931348623157E308"}});
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("-1.7976931348623157E308", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getMean=0.0, getStandardDeviation=1.7976931348623157E308}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput146() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.distribution.NormalDistributionImpl", "org.apache.commons.math.distribution.NormalDistributionImpl", "setMean", new String[]{"double"}, new String[]{"20.0"}, false, 4, new String[][]{});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getMean=20.0, getStandardDeviation=1.0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput147() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.distribution.NormalDistributionImpl", "org.apache.commons.math.distribution.NormalDistributionImpl", "getStandardDeviation", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.math.distribution.NormalDistributionImpl", "setStandardDeviation", "double", "1.43"}, {"org.apache.commons.math.distribution.NormalDistributionImpl", "setMean", "double", "NaN"}});
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("1.43", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getMean=NaN, getStandardDeviation=1.43}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput148() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.distribution.NormalDistributionImpl", "org.apache.commons.math.distribution.NormalDistributionImpl", "setMean", new String[]{"double"}, new String[]{"NaN"}, false, 0, new String[][]{{"org.apache.commons.math.distribution.NormalDistributionImpl", "inverseCumulativeProbability", "double", "NaN"}, {"org.apache.commons.math.distribution.NormalDistributionImpl", "getDomainLowerBound", "double", "-1.4300000000000004"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getMean=NaN, getStandardDeviation=1.0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput149() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.distribution.NormalDistributionImpl", "org.apache.commons.math.distribution.NormalDistributionImpl", "getInitialDomain", new String[]{"double"}, new String[]{"0.5"}, false, 0, new String[][]{{"org.apache.commons.math.distribution.NormalDistributionImpl", "getDomainLowerBound", "double", "-2.0000000000000004"}, {"org.apache.commons.math.distribution.NormalDistributionImpl", "setStandardDeviation", "double", "NaN"}});
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("0.0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getMean=0.0, getStandardDeviation=NaN}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput150() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.distribution.NormalDistributionImpl", "org.apache.commons.math.distribution.NormalDistributionImpl", "getInitialDomain", new String[]{"double"}, new String[]{"-3.5953862697246315E307"}, false, 4, new String[][]{{"org.apache.commons.math.distribution.NormalDistributionImpl", "setStandardDeviation", "double", "0.3399999999999999"}, {"org.apache.commons.math.distribution.NormalDistributionImpl", "setStandardDeviation", "double", "2.025"}});
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("-2.025", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getMean=0.0, getStandardDeviation=2.025}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput151() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.distribution.NormalDistributionImpl", "org.apache.commons.math.distribution.NormalDistributionImpl", "getStandardDeviation", new String[]{}, new String[]{}, false, 6, new String[][]{{"org.apache.commons.math.distribution.NormalDistributionImpl", "setMean", "double", "-1.7976931348623157E308"}});
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("1.0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getMean=-1.7976931348623157E308, getStandardDeviation=1.0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput152() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.distribution.NormalDistributionImpl", "org.apache.commons.math.distribution.NormalDistributionImpl", "cumulativeProbability", new String[]{"double"}, new String[]{"-1.797693134862316E307"}, false, 6, new String[][]{{"org.apache.commons.math.distribution.NormalDistributionImpl", "setStandardDeviation", "double", "NaN"}, {"org.apache.commons.math.distribution.NormalDistributionImpl", "getInitialDomain", "double", "Infinity"}});
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("NaN", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getMean=0.0, getStandardDeviation=NaN}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput153() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.distribution.NormalDistributionImpl", "org.apache.commons.math.distribution.NormalDistributionImpl", "getMean", new String[]{}, new String[]{}, false, 4, new String[][]{{"org.apache.commons.math.distribution.NormalDistributionImpl", "setStandardDeviation", "double", "0.5"}});
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("0.0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getMean=0.0, getStandardDeviation=0.5}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput154() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.distribution.NormalDistributionImpl", "org.apache.commons.math.distribution.NormalDistributionImpl", "setMean", new String[]{"double"}, new String[]{"1.7976931348623157E308"}, false, 7, new String[][]{});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getMean=1.7976931348623157E308, getStandardDeviation=Infinity}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput155() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.distribution.NormalDistributionImpl", "org.apache.commons.math.distribution.NormalDistributionImpl", "getInitialDomain", new String[]{"double"}, new String[]{"-1.7976931348623158E307"}, false, 4, new String[][]{{"org.apache.commons.math.distribution.NormalDistributionImpl", "setMean", "double", "0.5"}});
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("-0.5", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getMean=0.5, getStandardDeviation=1.0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput156() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.distribution.NormalDistributionImpl", "org.apache.commons.math.distribution.NormalDistributionImpl", "setMean", new String[]{"double"}, new String[]{"4.0"}, false, 0, new String[][]{{"org.apache.commons.math.distribution.NormalDistributionImpl", "inverseCumulativeProbability", "double", "2.0"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getMean=4.0, getStandardDeviation=1.0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput157() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.distribution.NormalDistributionImpl", "org.apache.commons.math.distribution.NormalDistributionImpl", "getInitialDomain", new String[]{"double"}, new String[]{"-Infinity"}, false, 0, new String[][]{{"org.apache.commons.math.distribution.NormalDistributionImpl", "setMean", "double", "0.5000000000000001"}});
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("-0.4999999999999999", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getMean=0.5000000000000001, getStandardDeviation=1.0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput158() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.distribution.NormalDistributionImpl", "org.apache.commons.math.distribution.NormalDistributionImpl", "getInitialDomain", new String[]{"double"}, new String[]{"-1.7976931348623158E307"}, false, 4, new String[][]{{"org.apache.commons.math.distribution.NormalDistributionImpl", "setMean", "double", "-2.0"}});
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("-3.0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getMean=-2.0, getStandardDeviation=1.0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput159() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.distribution.NormalDistributionImpl", "org.apache.commons.math.distribution.NormalDistributionImpl", "getDomainLowerBound", new String[]{"double"}, new String[]{"1.7976931348623158E307"}, false, 6, new String[][]{{"org.apache.commons.math.distribution.NormalDistributionImpl", "setMean", "double", "0.49999999999999994"}});
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("0.49999999999999994", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getMean=0.49999999999999994, getStandardDeviation=1.0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput160() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.distribution.NormalDistributionImpl", "org.apache.commons.math.distribution.NormalDistributionImpl", "getMean", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.math.distribution.NormalDistributionImpl", "setStandardDeviation", "double", "NaN"}, {"org.apache.commons.math.distribution.NormalDistributionImpl", "setStandardDeviation", "double", "-1.7976931348623157E308"}});
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("0.0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getMean=0.0, getStandardDeviation=NaN}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput161() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.distribution.NormalDistributionImpl", "org.apache.commons.math.distribution.NormalDistributionImpl", "cumulativeProbability", new String[]{"double", "double"}, new String[]{"4.9E-324", "4.0"}, false, 0, new String[][]{{"org.apache.commons.math.distribution.NormalDistributionImpl", "setStandardDeviation", "double", "20.0"}, {"org.apache.commons.math.distribution.NormalDistributionImpl", "getMean", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("0.07925970943910299", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getMean=0.0, getStandardDeviation=20.0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput162() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.distribution.NormalDistributionImpl", "org.apache.commons.math.distribution.NormalDistributionImpl", "cumulativeProbability", new String[]{"double", "double"}, new String[]{"2.0000000000000004", "NaN"}, false, 0, new String[][]{{"org.apache.commons.math.distribution.NormalDistributionImpl", "setMean", "double", "4.6000000000000005"}, {"org.apache.commons.math.distribution.NormalDistributionImpl", "setMean", "double", "4.9E-324"}});
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("NaN", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getMean=4.9E-324, getStandardDeviation=1.0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput163() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.distribution.NormalDistributionImpl", "org.apache.commons.math.distribution.NormalDistributionImpl", "getMean", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.math.distribution.NormalDistributionImpl", "inverseCumulativeProbability", "double", "-1.7976931348623158E307"}, {"org.apache.commons.math.distribution.NormalDistributionImpl", "setMean", "double", "0.9860000000000002"}});
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("0.9860000000000002", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getMean=0.9860000000000002, getStandardDeviation=1.0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput164() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.distribution.NormalDistributionImpl", "org.apache.commons.math.distribution.NormalDistributionImpl", "setMean", new String[]{"double"}, new String[]{"0.20000000000000004"}, false, 0, new String[][]{{"org.apache.commons.math.distribution.NormalDistributionImpl", "inverseCumulativeProbability", "double", "8589540077390120676"}, {"org.apache.commons.math.distribution.NormalDistributionImpl", "cumulativeProbability", "double,double", "-8.589540077390121E18", "-1.7976931348623157E308"}}, 3);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getMean=0.20000000000000004, getStandardDeviation=1.0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput165() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.distribution.NormalDistributionImpl", "org.apache.commons.math.distribution.NormalDistributionImpl", "cumulativeProbability", new String[]{"double"}, new String[]{"2.0000000000000004"}, false, 0, new String[][]{{"org.apache.commons.math.distribution.NormalDistributionImpl", "cumulativeProbability", "double", "-1.7976931348623156E306"}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("0.9772498680518209", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getMean=0.0, getStandardDeviation=1.0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput166() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.distribution.NormalDistributionImpl", "org.apache.commons.math.distribution.NormalDistributionImpl", "cumulativeProbability", new String[]{"double", "double"}, new String[]{"5.0", "8.5895400773901199E18"}, false, 3, new String[][]{{"org.apache.commons.math.distribution.NormalDistributionImpl", "setStandardDeviation", "double", "9.0"}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("0.289257360753972", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getMean=0.0, getStandardDeviation=9.0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput167() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.distribution.NormalDistributionImpl", "org.apache.commons.math.distribution.NormalDistributionImpl", "cumulativeProbability", new String[]{"double", "double"}, new String[]{"-1.797693134862316E307", "-3.595386269724631E306"}, false, 0, new String[][]{{"org.apache.commons.math.distribution.NormalDistributionImpl", "setStandardDeviation", "double", "8.0"}, {"org.apache.commons.math.distribution.NormalDistributionImpl", "getDomainUpperBound", "double", "-34.9"}});
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("0.0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getMean=0.0, getStandardDeviation=8.0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput168() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.distribution.NormalDistributionImpl", "org.apache.commons.math.distribution.NormalDistributionImpl", "getInitialDomain", new String[]{"double"}, new String[]{"3.9999999999999996"}, false, 7, new String[][]{{"org.apache.commons.math.distribution.NormalDistributionImpl", "getDomainUpperBound", "double", "0.944"}});
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("Infinity", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getMean=1.0, getStandardDeviation=Infinity}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput169() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.distribution.NormalDistributionImpl", "org.apache.commons.math.distribution.NormalDistributionImpl", "setStandardDeviation", new String[]{"double"}, new String[]{"3.6999999999999997"}, false, 0, null, 1);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getMean=0.0, getStandardDeviation=3.6999999999999997}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput170() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.distribution.NormalDistributionImpl", "org.apache.commons.math.distribution.NormalDistributionImpl", "cumulativeProbability", new String[]{"double"}, new String[]{"-3.5953862697246315E307"}, false, 0, new String[][]{{"org.apache.commons.math.distribution.NormalDistributionImpl", "inverseCumulativeProbability", "double", "NaN"}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("0.0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getMean=0.0, getStandardDeviation=1.0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput171() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.distribution.NormalDistributionImpl", "org.apache.commons.math.distribution.NormalDistributionImpl", "cumulativeProbability", new String[]{"double", "double"}, new String[]{"-1.7976931348623157E308", "8.589540077390122E18"}, false, 0, new String[][]{{"org.apache.commons.math.distribution.NormalDistributionImpl", "inverseCumulativeProbability", "double", "-1.7976931348623157E308"}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("1.0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getMean=0.0, getStandardDeviation=1.0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput172() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.distribution.NormalDistributionImpl", "org.apache.commons.math.distribution.NormalDistributionImpl", "getDomainUpperBound", new String[]{"double"}, new String[]{"-14.0"}, false, 0, new String[][]{{"org.apache.commons.math.distribution.NormalDistributionImpl", "getInitialDomain", "double", "1.0000000000000002"}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("0.0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getMean=0.0, getStandardDeviation=1.0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput173() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.distribution.NormalDistributionImpl", "org.apache.commons.math.distribution.NormalDistributionImpl", "cumulativeProbability", new String[]{"double"}, new String[]{"4.0"}, false, 0, null, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("0.9999683287581673", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getMean=0.0, getStandardDeviation=1.0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput174() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.distribution.NormalDistributionImpl", "org.apache.commons.math.distribution.NormalDistributionImpl", "cumulativeProbability", new String[]{"double", "double"}, new String[]{"0.0", "0.5"}, false, 0, null, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("0.191462461274013", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getMean=0.0, getStandardDeviation=1.0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput175() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.distribution.NormalDistributionImpl", "org.apache.commons.math.distribution.NormalDistributionImpl", "cumulativeProbability", new String[]{"double"}, new String[]{"1.0"}, false, 0, new String[][]{{"org.apache.commons.math.distribution.NormalDistributionImpl", "setStandardDeviation", "double", "0.8300000000000001"}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("0.8858634617569281", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getMean=0.0, getStandardDeviation=0.8300000000000001}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput176() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.distribution.NormalDistributionImpl", "org.apache.commons.math.distribution.NormalDistributionImpl", "getStandardDeviation", new String[]{}, new String[]{}, false, 0, null, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("1.0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getMean=0.0, getStandardDeviation=1.0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput177() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.distribution.NormalDistributionImpl", "org.apache.commons.math.distribution.NormalDistributionImpl", "getDomainUpperBound", new String[]{"double"}, new String[]{"-8.988465674311578E305"}, false, 0, new String[][]{{"org.apache.commons.math.distribution.NormalDistributionImpl", "setStandardDeviation", "double", "0.2"}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("0.0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getMean=0.0, getStandardDeviation=0.2}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput178() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.distribution.NormalDistributionImpl", "org.apache.commons.math.distribution.NormalDistributionImpl", "cumulativeProbability", new String[]{"double", "double"}, new String[]{"4.9E-324", "0.963"}, false, 0, null, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("0.33222623836581644", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getMean=0.0, getStandardDeviation=1.0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput179() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.distribution.NormalDistributionImpl", "org.apache.commons.math.distribution.NormalDistributionImpl", "getDomainUpperBound", new String[]{"double"}, new String[]{"-1.797693134862316E307"}, false, 7, new String[][]{}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("1.0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getMean=1.0, getStandardDeviation=Infinity}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput180() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.distribution.NormalDistributionImpl", "org.apache.commons.math.distribution.NormalDistributionImpl", "inverseCumulativeProbability", new String[]{"double"}, new String[]{"0.0"}, false, 0, null, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("-Infinity", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getMean=0.0, getStandardDeviation=1.0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput181() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.distribution.NormalDistributionImpl", "org.apache.commons.math.distribution.NormalDistributionImpl", "cumulativeProbability", new String[]{"double"}, new String[]{"4.0"}, false, 0, new String[][]{{"org.apache.commons.math.distribution.NormalDistributionImpl", "inverseCumulativeProbability", "double", "4.0"}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("0.9999683287581673", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getMean=0.0, getStandardDeviation=1.0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput182() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.distribution.NormalDistributionImpl", "org.apache.commons.math.distribution.NormalDistributionImpl", "setStandardDeviation", new String[]{"double"}, new String[]{"Infinity"}, false, 0, new String[][]{{"org.apache.commons.math.distribution.NormalDistributionImpl", "cumulativeProbability", "double", "8.589540077390122E18"}}, 3);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getMean=0.0, getStandardDeviation=Infinity}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput183() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.distribution.NormalDistributionImpl", "org.apache.commons.math.distribution.NormalDistributionImpl", "setMean", new String[]{"double"}, new String[]{"2.0000000000000004"}, false, 0, null, 3);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getMean=2.0000000000000004, getStandardDeviation=1.0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput184() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.distribution.NormalDistributionImpl", "org.apache.commons.math.distribution.NormalDistributionImpl", "cumulativeProbability", new String[]{"double", "double"}, new String[]{"4.000000000000001", "Infinity"}, false, 0, new String[][]{{"org.apache.commons.math.distribution.NormalDistributionImpl", "cumulativeProbability", "double,double", "0.8400000000000002", "-1.029"}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("3.1671241832897934E-5", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getMean=0.0, getStandardDeviation=1.0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput185() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math.distribution.NormalDistributionImpl", "org.apache.commons.math.distribution.NormalDistributionImpl", "setStandardDeviation", new String[]{"double"}, new String[]{"-1.797693134862316E307"}, false, 0, new String[][]{{"org.apache.commons.math.distribution.NormalDistributionImpl", "setStandardDeviation", "double", "0.020000000000000004"}}, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput186() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.distribution.NormalDistributionImpl", "org.apache.commons.math.distribution.NormalDistributionImpl", "inverseCumulativeProbability", new String[]{"double"}, new String[]{"0.5"}, false, 6, new String[][]{}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("0.0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getMean=0.0, getStandardDeviation=1.0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput187() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.distribution.NormalDistributionImpl", "org.apache.commons.math.distribution.NormalDistributionImpl", "cumulativeProbability", new String[]{"double"}, new String[]{"4.1"}, false, 0, new String[][]{{"org.apache.commons.math.distribution.NormalDistributionImpl", "setStandardDeviation", "double", "9.999999999999998"}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("0.6590970262276774", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getMean=0.0, getStandardDeviation=9.999999999999998}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput188() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.distribution.NormalDistributionImpl", "org.apache.commons.math.distribution.NormalDistributionImpl", "setMean", new String[]{"double"}, new String[]{"NaN"}, false, 3, new String[][]{{"org.apache.commons.math.distribution.NormalDistributionImpl", "getDomainLowerBound", "double", "1.7976931348623155E308"}}, 1);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getMean=NaN, getStandardDeviation=1.0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput189() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.distribution.NormalDistributionImpl", "org.apache.commons.math.distribution.NormalDistributionImpl", "getDomainLowerBound", new String[]{"double"}, new String[]{"-1.7976931348623157E308"}, false, 0, new String[][]{{"org.apache.commons.math.distribution.NormalDistributionImpl", "setStandardDeviation", "double", "63.0"}, {"org.apache.commons.math.distribution.NormalDistributionImpl", "cumulativeProbability", "double,double", "0.49999999999999994", "NaN"}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("-1.7976931348623157E308", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getMean=0.0, getStandardDeviation=63.0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput190() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.distribution.NormalDistributionImpl", "org.apache.commons.math.distribution.NormalDistributionImpl", "cumulativeProbability", new String[]{"double", "double"}, new String[]{"4.9E-324", "2.0000000000000004"}, false, 0, null, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("0.4772498680518209", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getMean=0.0, getStandardDeviation=1.0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput191() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.distribution.NormalDistributionImpl", "org.apache.commons.math.distribution.NormalDistributionImpl", "setStandardDeviation", new String[]{"double"}, new String[]{"8.589540077390123E18"}, false, 0, new String[][]{{"org.apache.commons.math.distribution.NormalDistributionImpl", "cumulativeProbability", "double,double", "1.0000000000000002", "-19.42"}}, 3);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getMean=0.0, getStandardDeviation=8.589540077390123E18}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput192() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.distribution.NormalDistributionImpl", "org.apache.commons.math.distribution.NormalDistributionImpl", "cumulativeProbability", new String[]{"double", "double"}, new String[]{"0.0", "31.57"}, false, 0, new String[][]{{"org.apache.commons.math.distribution.NormalDistributionImpl", "getDomainLowerBound", "double", "NaN"}, {"org.apache.commons.math.distribution.NormalDistributionImpl", "setMean", "double", "5.041"}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("0.9999997684472652", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getMean=5.041, getStandardDeviation=1.0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput193() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.distribution.NormalDistributionImpl", "org.apache.commons.math.distribution.NormalDistributionImpl", "inverseCumulativeProbability", new String[]{"double"}, new String[]{"0.5"}, false);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("0.0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getMean=0.0, getStandardDeviation=1.0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput194() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.distribution.NormalDistributionImpl", "org.apache.commons.math.distribution.NormalDistributionImpl", "setStandardDeviation", new String[]{"double"}, new String[]{"0.5"}, false, 0, new String[][]{{"org.apache.commons.math.distribution.NormalDistributionImpl", "getDomainLowerBound", "double", "-1.7976931348623158E307"}}, 2);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getMean=0.0, getStandardDeviation=0.5}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput195() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.distribution.NormalDistributionImpl", "org.apache.commons.math.distribution.NormalDistributionImpl", "setMean", new String[]{"double"}, new String[]{"8589540077390120676"}, false, 0, new String[][]{{"org.apache.commons.math.distribution.NormalDistributionImpl", "getDomainLowerBound", "double", "1.0E-323"}}, 3);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getMean=8.589540077390121E18, getStandardDeviation=1.0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput196() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.distribution.NormalDistributionImpl", "org.apache.commons.math.distribution.NormalDistributionImpl", "getMean", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.math.distribution.NormalDistributionImpl", "setMean", "double", "4.0"}});
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("4.0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getMean=4.0, getStandardDeviation=1.0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput197() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.distribution.NormalDistributionImpl", "org.apache.commons.math.distribution.NormalDistributionImpl", "getInitialDomain", new String[]{"double"}, new String[]{"NaN"}, false, 0, new String[][]{{"org.apache.commons.math.distribution.NormalDistributionImpl", "getMean", ""}, {"org.apache.commons.math.distribution.NormalDistributionImpl", "getStandardDeviation", ""}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("0.0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getMean=0.0, getStandardDeviation=1.0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput198() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.distribution.NormalDistributionImpl", "org.apache.commons.math.distribution.NormalDistributionImpl", "cumulativeProbability", new String[]{"double"}, new String[]{"-1.7976931348623158E307"}, false, 1, new String[][]{{"org.apache.commons.math.distribution.NormalDistributionImpl", "setMean", "double", "-1.0"}, {"org.apache.commons.math.distribution.NormalDistributionImpl", "getMean", ""}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("0.0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getMean=-1.0, getStandardDeviation=1.0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput199() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.distribution.NormalDistributionImpl", "org.apache.commons.math.distribution.NormalDistributionImpl", "cumulativeProbability", new String[]{"double"}, new String[]{"NaN"}, false, 0, new String[][]{{"org.apache.commons.math.distribution.NormalDistributionImpl", "setStandardDeviation", "double", "0.5"}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("NaN", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getMean=0.0, getStandardDeviation=0.5}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput200() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.distribution.NormalDistributionImpl", "org.apache.commons.math.distribution.NormalDistributionImpl", "setStandardDeviation", new String[]{"double"}, new String[]{"2.0"}, false, 0, new String[][]{{"org.apache.commons.math.distribution.NormalDistributionImpl", "getMean", ""}}, 3);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getMean=0.0, getStandardDeviation=2.0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput201() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.distribution.NormalDistributionImpl", "org.apache.commons.math.distribution.NormalDistributionImpl", "cumulativeProbability", new String[]{"double", "double"}, new String[]{"-2.1999999999999993", "1.0E-323"}, false, 2, new String[][]{{"org.apache.commons.math.distribution.NormalDistributionImpl", "inverseCumulativeProbability", "double", "1.7976931348623157E308"}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("0.4860965524865014", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getMean=0.0, getStandardDeviation=1.0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput202() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.distribution.NormalDistributionImpl", "org.apache.commons.math.distribution.NormalDistributionImpl", "setStandardDeviation", new String[]{"double"}, new String[]{"30.000000000000004"}, false, 0, new String[][]{{"org.apache.commons.math.distribution.NormalDistributionImpl", "setMean", "double", "-0.5"}}, 1);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getMean=-0.5, getStandardDeviation=30.000000000000004}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput203() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.distribution.NormalDistributionImpl", "org.apache.commons.math.distribution.NormalDistributionImpl", "getDomainUpperBound", new String[]{"double"}, new String[]{"-1.7976931348623158E307"}, false, 7, new String[][]{{"org.apache.commons.math.distribution.NormalDistributionImpl", "inverseCumulativeProbability", "double", "-2.5"}, {"org.apache.commons.math.distribution.NormalDistributionImpl", "getMean", ""}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("1.0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getMean=1.0, getStandardDeviation=Infinity}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput204() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.distribution.NormalDistributionImpl", "org.apache.commons.math.distribution.NormalDistributionImpl", "getDomainUpperBound", new String[]{"double"}, new String[]{"-4.9E-324"}, false, 7, new String[][]{});
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("1.0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getMean=1.0, getStandardDeviation=Infinity}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput205() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.distribution.NormalDistributionImpl", "org.apache.commons.math.distribution.NormalDistributionImpl", "inverseCumulativeProbability", new String[]{"double"}, new String[]{"0.73"}, false, 4, new String[][]{{"org.apache.commons.math.distribution.NormalDistributionImpl", "getDomainUpperBound", "double", "1.7976931348623157E308"}});
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("0.6128130403451562", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getMean=0.0, getStandardDeviation=1.0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput206() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.distribution.NormalDistributionImpl", "org.apache.commons.math.distribution.NormalDistributionImpl", "cumulativeProbability", new String[]{"double", "double"}, new String[]{"0.9999999999999999", "Infinity"}, false, 0, null, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("0.15865525393145696", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getMean=0.0, getStandardDeviation=1.0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput207() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.distribution.NormalDistributionImpl", "org.apache.commons.math.distribution.NormalDistributionImpl", "setMean", new String[]{"double"}, new String[]{"57.49999999999999"}, false, 2, new String[][]{}, 1);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getMean=57.49999999999999, getStandardDeviation=1.0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput208() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.distribution.NormalDistributionImpl", "org.apache.commons.math.distribution.NormalDistributionImpl", "getMean", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.math.distribution.NormalDistributionImpl", "setMean", "double", "-32.0"}});
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("-32.0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getMean=-32.0, getStandardDeviation=1.0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput209() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.distribution.NormalDistributionImpl", "org.apache.commons.math.distribution.NormalDistributionImpl", "cumulativeProbability", new String[]{"double", "double"}, new String[]{"4.9E-324", "1.7976931348623157E308"}, false, 4, new String[][]{}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("0.5", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getMean=0.0, getStandardDeviation=1.0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput210() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.distribution.NormalDistributionImpl", "org.apache.commons.math.distribution.NormalDistributionImpl", "getDomainUpperBound", new String[]{"double"}, new String[]{"0.0"}, false, 0, new String[][]{{"org.apache.commons.math.distribution.NormalDistributionImpl", "setMean", "double", "0.24999999999999997"}});
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("0.24999999999999997", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getMean=0.24999999999999997, getStandardDeviation=1.0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput211() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.distribution.NormalDistributionImpl", "org.apache.commons.math.distribution.NormalDistributionImpl", "getStandardDeviation", new String[]{}, new String[]{}, false, 5, new String[][]{{"org.apache.commons.math.distribution.NormalDistributionImpl", "setStandardDeviation", "double", "0.631"}});
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("0.631", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getMean=0.0, getStandardDeviation=0.631}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput212() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.distribution.NormalDistributionImpl", "org.apache.commons.math.distribution.NormalDistributionImpl", "getDomainUpperBound", new String[]{"double"}, new String[]{"-3.5953862697246315E307"}, false, 0, new String[][]{{"org.apache.commons.math.distribution.NormalDistributionImpl", "setMean", "double", "1.0000000000000002"}});
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("1.0000000000000002", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getMean=1.0000000000000002, getStandardDeviation=1.0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput213() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.distribution.NormalDistributionImpl", "org.apache.commons.math.distribution.NormalDistributionImpl", "getInitialDomain", new String[]{"double"}, new String[]{"0.49999999999999994"}, false, 6, new String[][]{{"org.apache.commons.math.distribution.NormalDistributionImpl", "setMean", "double", "-Infinity"}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("-Infinity", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getMean=-Infinity, getStandardDeviation=1.0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput214() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.distribution.NormalDistributionImpl", "org.apache.commons.math.distribution.NormalDistributionImpl", "getMean", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.math.distribution.NormalDistributionImpl", "setMean", "double", "-1.05"}});
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("-1.05", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getMean=-1.05, getStandardDeviation=1.0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput215() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.distribution.NormalDistributionImpl", "org.apache.commons.math.distribution.NormalDistributionImpl", "cumulativeProbability", new String[]{"double"}, new String[]{"0.1"}, false, 0, null, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("0.539827837277029", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getMean=0.0, getStandardDeviation=1.0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput216() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.distribution.NormalDistributionImpl", "org.apache.commons.math.distribution.NormalDistributionImpl", "cumulativeProbability", new String[]{"double", "double"}, new String[]{"-8.988465674311579E306", "-0.715"}, false, 1, new String[][]{{"org.apache.commons.math.distribution.NormalDistributionImpl", "getStandardDeviation", ""}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("0.23730452163984733", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getMean=0.0, getStandardDeviation=1.0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput217() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.distribution.NormalDistributionImpl", "org.apache.commons.math.distribution.NormalDistributionImpl", "cumulativeProbability", new String[]{"double"}, new String[]{"-2.86"}, false, 0, new String[][]{{"org.apache.commons.math.distribution.NormalDistributionImpl", "cumulativeProbability", "double", "-8.988465674311579E307"}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("0.002118205040404497", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getMean=0.0, getStandardDeviation=1.0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput218() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.distribution.NormalDistributionImpl", "org.apache.commons.math.distribution.NormalDistributionImpl", "setStandardDeviation", new String[]{"double"}, new String[]{"0.9999999999999999"}, false, 0, null, 2);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getMean=0.0, getStandardDeviation=0.9999999999999999}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput219() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.distribution.NormalDistributionImpl", "org.apache.commons.math.distribution.NormalDistributionImpl", "cumulativeProbability", new String[]{"double"}, new String[]{"4.9E-324"}, false, 2, new String[][]{{"org.apache.commons.math.distribution.NormalDistributionImpl", "inverseCumulativeProbability", "double", "1.7976931348623157E308"}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("0.5", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getMean=0.0, getStandardDeviation=1.0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput220() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.distribution.NormalDistributionImpl", "org.apache.commons.math.distribution.NormalDistributionImpl", "getDomainLowerBound", new String[]{"double"}, new String[]{"-2.86"}, false, 7, new String[][]{}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("-1.7976931348623157E308", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getMean=1.0, getStandardDeviation=Infinity}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput221() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.distribution.NormalDistributionImpl", "org.apache.commons.math.distribution.NormalDistributionImpl", "cumulativeProbability", new String[]{"double", "double"}, new String[]{"-1.7976931348623158E307", "Infinity"}, false, 7, new String[][]{}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("NaN", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getMean=1.0, getStandardDeviation=Infinity}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput222() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.distribution.NormalDistributionImpl", "org.apache.commons.math.distribution.NormalDistributionImpl", "setMean", new String[]{"double"}, new String[]{"1.0"}, false, 0, new String[][]{{"org.apache.commons.math.distribution.NormalDistributionImpl", "getInitialDomain", "double", "4.6"}}, 1);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getMean=1.0, getStandardDeviation=1.0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput223() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.distribution.NormalDistributionImpl", "org.apache.commons.math.distribution.NormalDistributionImpl", "cumulativeProbability", new String[]{"double"}, new String[]{"0.5000000000000001"}, false, 0, new String[][]{{"org.apache.commons.math.distribution.NormalDistributionImpl", "getStandardDeviation", ""}, {"org.apache.commons.math.distribution.NormalDistributionImpl", "getInitialDomain", "double", "3.9999999999999996"}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("0.6914624612740132", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getMean=0.0, getStandardDeviation=1.0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput224() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.distribution.NormalDistributionImpl", "org.apache.commons.math.distribution.NormalDistributionImpl", "setMean", new String[]{"double"}, new String[]{"-1.045"}, false, 1, new String[][]{{"org.apache.commons.math.distribution.NormalDistributionImpl", "setStandardDeviation", "double", "1.7976931348623157E308"}}, 1);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getMean=-1.045, getStandardDeviation=1.7976931348623157E308}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput225() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.distribution.NormalDistributionImpl", "org.apache.commons.math.distribution.NormalDistributionImpl", "setStandardDeviation", new String[]{"double"}, new String[]{"5.0"}, false, 0, new String[][]{{"org.apache.commons.math.distribution.NormalDistributionImpl", "getDomainUpperBound", "double", "-1.7976931348623157E308"}, {"org.apache.commons.math.distribution.NormalDistributionImpl", "getMean", ""}}, 3);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getMean=0.0, getStandardDeviation=5.0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput226() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.distribution.NormalDistributionImpl", "org.apache.commons.math.distribution.NormalDistributionImpl", "getInitialDomain", new String[]{"double"}, new String[]{"1.0E-323"}, false, 7, new String[][]{}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("-Infinity", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getMean=1.0, getStandardDeviation=Infinity}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput227() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.distribution.NormalDistributionImpl", "org.apache.commons.math.distribution.NormalDistributionImpl", "cumulativeProbability", new String[]{"double"}, new String[]{"8.988465674311579E307"}, false, 7, new String[][]{}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("0.5", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getMean=1.0, getStandardDeviation=Infinity}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput228() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.distribution.NormalDistributionImpl", "org.apache.commons.math.distribution.NormalDistributionImpl", "getDomainUpperBound", new String[]{"double"}, new String[]{"1.0"}, false, 7, new String[][]{{"org.apache.commons.math.distribution.NormalDistributionImpl", "cumulativeProbability", "double,double", "-2.0000000000000004", "-Infinity"}, {"org.apache.commons.math.distribution.NormalDistributionImpl", "cumulativeProbability", "double,double", "-0.0", "1.9999999999999998"}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("1.7976931348623157E308", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getMean=1.0, getStandardDeviation=Infinity}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput229() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.distribution.NormalDistributionImpl", "org.apache.commons.math.distribution.NormalDistributionImpl", "cumulativeProbability", new String[]{"double"}, new String[]{"4.9E-324"}, false, 7, new String[][]{{"org.apache.commons.math.distribution.NormalDistributionImpl", "getMean", ""}, {"org.apache.commons.math.distribution.NormalDistributionImpl", "inverseCumulativeProbability", "double", "8.589540077390121E18"}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("0.5", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getMean=1.0, getStandardDeviation=Infinity}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput230() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.distribution.NormalDistributionImpl", "org.apache.commons.math.distribution.NormalDistributionImpl", "cumulativeProbability", new String[]{"double"}, new String[]{"4.9E-324"}, false, 7, new String[][]{{"org.apache.commons.math.distribution.NormalDistributionImpl", "getDomainUpperBound", "double", "-0.5"}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("0.5", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getMean=1.0, getStandardDeviation=Infinity}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput231() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.distribution.NormalDistributionImpl", "org.apache.commons.math.distribution.NormalDistributionImpl", "getDomainLowerBound", new String[]{"double"}, new String[]{"-1.7976931348623155E308"}, false, 5, new String[][]{{"org.apache.commons.math.distribution.NormalDistributionImpl", "setMean", "double", "Infinity"}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("-1.7976931348623157E308", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getMean=Infinity, getStandardDeviation=1.0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput232() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.distribution.NormalDistributionImpl", "org.apache.commons.math.distribution.NormalDistributionImpl", "setStandardDeviation", new String[]{"double"}, new String[]{"Infinity"}, false, 0, new String[][]{{"org.apache.commons.math.distribution.NormalDistributionImpl", "cumulativeProbability", "double,double", "1.7976931348623157E308", "1.9999999999999998"}}, 1);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getMean=0.0, getStandardDeviation=Infinity}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput233() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.distribution.NormalDistributionImpl", "org.apache.commons.math.distribution.NormalDistributionImpl", "cumulativeProbability", new String[]{"double"}, new String[]{"2.0"}, false, 0, new String[][]{{"org.apache.commons.math.distribution.NormalDistributionImpl", "setStandardDeviation", "double", "Infinity"}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("0.5", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getMean=0.0, getStandardDeviation=Infinity}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput234() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.distribution.NormalDistributionImpl", "org.apache.commons.math.distribution.NormalDistributionImpl", "getDomainUpperBound", new String[]{"double"}, new String[]{"-1.0"}, false, 0, new String[][]{{"org.apache.commons.math.distribution.NormalDistributionImpl", "setStandardDeviation", "double", "Infinity"}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("0.0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getMean=0.0, getStandardDeviation=Infinity}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput235() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.distribution.NormalDistributionImpl", "org.apache.commons.math.distribution.NormalDistributionImpl", "cumulativeProbability", new String[]{"double"}, new String[]{"1.19"}, false, 3, new String[][]{}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("0.8829768039768913", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getMean=0.0, getStandardDeviation=1.0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput236() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.distribution.NormalDistributionImpl", "org.apache.commons.math.distribution.NormalDistributionImpl", "getDomainLowerBound", new String[]{"double"}, new String[]{"8589540077390120676"}, false, 0, new String[][]{{"org.apache.commons.math.distribution.NormalDistributionImpl", "setMean", "double", "1.7976931348623157E308"}});
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("1.7976931348623157E308", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getMean=1.7976931348623157E308, getStandardDeviation=1.0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput237() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.distribution.NormalDistributionImpl", "org.apache.commons.math.distribution.NormalDistributionImpl", "getInitialDomain", new String[]{"double"}, new String[]{"4.9E-324"}, false, 7, new String[][]{{"org.apache.commons.math.distribution.NormalDistributionImpl", "setStandardDeviation", "double", "Infinity"}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("-Infinity", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getMean=1.0, getStandardDeviation=Infinity}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput238() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.distribution.NormalDistributionImpl", "org.apache.commons.math.distribution.NormalDistributionImpl", "getDomainLowerBound", new String[]{"double"}, new String[]{"1.0"}, false, 6, new String[][]{{"org.apache.commons.math.distribution.NormalDistributionImpl", "setMean", "double", "61.0"}});
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("61.0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getMean=61.0, getStandardDeviation=1.0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput239() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.distribution.NormalDistributionImpl", "org.apache.commons.math.distribution.NormalDistributionImpl", "cumulativeProbability", new String[]{"double"}, new String[]{"0.967"}, false, 0, null, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("0.8332279831682812", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getMean=0.0, getStandardDeviation=1.0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput240() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.distribution.NormalDistributionImpl", "org.apache.commons.math.distribution.NormalDistributionImpl", "cumulativeProbability", new String[]{"double", "double"}, new String[]{"0.25", "Infinity"}, false, 0, new String[][]{{"org.apache.commons.math.distribution.NormalDistributionImpl", "setStandardDeviation", "double", "NaN"}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("NaN", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getMean=0.0, getStandardDeviation=NaN}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput241() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.distribution.NormalDistributionImpl", "org.apache.commons.math.distribution.NormalDistributionImpl", "inverseCumulativeProbability", new String[]{"double"}, new String[]{"NaN"}, false, 7, new String[][]{}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("1.9999995", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getMean=1.0, getStandardDeviation=Infinity}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput242() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.distribution.NormalDistributionImpl", "org.apache.commons.math.distribution.NormalDistributionImpl", "setStandardDeviation", new String[]{"double"}, new String[]{"1.7976931348623157E308"}, false, 0, new String[][]{{"org.apache.commons.math.distribution.NormalDistributionImpl", "getInitialDomain", "double", "20.0"}}, 2);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getMean=0.0, getStandardDeviation=1.7976931348623157E308}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput243() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.distribution.NormalDistributionImpl", "org.apache.commons.math.distribution.NormalDistributionImpl", "getDomainLowerBound", new String[]{"double"}, new String[]{"10.0"}, false, 0, new String[][]{{"org.apache.commons.math.distribution.NormalDistributionImpl", "setMean", "double", "Infinity"}});
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("Infinity", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getMean=Infinity, getStandardDeviation=1.0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput244() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.distribution.NormalDistributionImpl", "org.apache.commons.math.distribution.NormalDistributionImpl", "cumulativeProbability", new String[]{"double"}, new String[]{"0.462"}, false, 2, new String[][]{{"org.apache.commons.math.distribution.NormalDistributionImpl", "cumulativeProbability", "double,double", "-0.43", "1.0"}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("0.6779593397756932", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getMean=0.0, getStandardDeviation=1.0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput245() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.distribution.NormalDistributionImpl", "org.apache.commons.math.distribution.NormalDistributionImpl", "getDomainUpperBound", new String[]{"double"}, new String[]{"-1.7976931348623158E307"}, false, 3, new String[][]{{"org.apache.commons.math.distribution.NormalDistributionImpl", "setMean", "double", "-1.7976931348623157E308"}, {"org.apache.commons.math.distribution.NormalDistributionImpl", "getInitialDomain", "double", "4.0"}});
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("-1.7976931348623157E308", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getMean=-1.7976931348623157E308, getStandardDeviation=1.0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput246() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.distribution.NormalDistributionImpl", "org.apache.commons.math.distribution.NormalDistributionImpl", "inverseCumulativeProbability", new String[]{"double"}, new String[]{"0.005"}, false);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("-2.5758293114390054", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getMean=0.0, getStandardDeviation=1.0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput247() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.distribution.NormalDistributionImpl", "org.apache.commons.math.distribution.NormalDistributionImpl", "getDomainUpperBound", new String[]{"double"}, new String[]{"-58.0"}, false, 0, new String[][]{{"org.apache.commons.math.distribution.NormalDistributionImpl", "getStandardDeviation", ""}, {"org.apache.commons.math.distribution.NormalDistributionImpl", "setMean", "double", "0.5000000000000001"}});
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("0.5000000000000001", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getMean=0.5000000000000001, getStandardDeviation=1.0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput248() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.distribution.NormalDistributionImpl", "org.apache.commons.math.distribution.NormalDistributionImpl", "getMean", new String[]{}, new String[]{}, false, 1, new String[][]{{"org.apache.commons.math.distribution.NormalDistributionImpl", "getMean", ""}, {"org.apache.commons.math.distribution.NormalDistributionImpl", "setMean", "double", "-1.797693134862316E307"}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("-1.797693134862316E307", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getMean=-1.797693134862316E307, getStandardDeviation=1.0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput249() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.distribution.NormalDistributionImpl", "org.apache.commons.math.distribution.NormalDistributionImpl", "cumulativeProbability", new String[]{"double"}, new String[]{"-8.988465674311579E306"}, false, 0, new String[][]{{"org.apache.commons.math.distribution.NormalDistributionImpl", "setStandardDeviation", "double", "0.5000000000000002"}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("0.0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getMean=0.0, getStandardDeviation=0.5000000000000002}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput250() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.distribution.NormalDistributionImpl", "org.apache.commons.math.distribution.NormalDistributionImpl", "cumulativeProbability", new String[]{"double"}, new String[]{"Infinity"}, false, 0, new String[][]{{"org.apache.commons.math.distribution.NormalDistributionImpl", "setStandardDeviation", "double", "4.000000000000001"}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("1.0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getMean=0.0, getStandardDeviation=4.000000000000001}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput251() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.distribution.NormalDistributionImpl", "org.apache.commons.math.distribution.NormalDistributionImpl", "inverseCumulativeProbability", new String[]{"double"}, new String[]{"0.962"}, false, 1, new String[][]{{"org.apache.commons.math.distribution.NormalDistributionImpl", "cumulativeProbability", "double", "-1.7976931348623157E308"}});
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("1.7743818763743817", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getMean=0.0, getStandardDeviation=1.0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput252() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.distribution.NormalDistributionImpl", "org.apache.commons.math.distribution.NormalDistributionImpl", "setMean", new String[]{"double"}, new String[]{"-Infinity"}, false, 1, new String[][]{}, 3);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getMean=-Infinity, getStandardDeviation=1.0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput253() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.distribution.NormalDistributionImpl", "org.apache.commons.math.distribution.NormalDistributionImpl", "inverseCumulativeProbability", new String[]{"double"}, new String[]{"0.5"}, false, 0, new String[][]{{"org.apache.commons.math.distribution.NormalDistributionImpl", "setStandardDeviation", "double", "NaN"}});
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("0.9999995", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getMean=0.0, getStandardDeviation=NaN}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput254() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.distribution.NormalDistributionImpl", "org.apache.commons.math.distribution.NormalDistributionImpl", "inverseCumulativeProbability", new String[]{"double"}, new String[]{"0.9999999999999999"}, false, 3, new String[][]{{"org.apache.commons.math.distribution.NormalDistributionImpl", "setStandardDeviation", "double", "1.0"}, {"org.apache.commons.math.distribution.NormalDistributionImpl", "getMean", ""}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("9.0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getMean=0.0, getStandardDeviation=1.0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput255() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.distribution.NormalDistributionImpl", "org.apache.commons.math.distribution.NormalDistributionImpl", "inverseCumulativeProbability", new String[]{"double"}, new String[]{"0.0"}, false, 0, null, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("-Infinity", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getMean=0.0, getStandardDeviation=1.0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput256() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.distribution.NormalDistributionImpl", "org.apache.commons.math.distribution.NormalDistributionImpl", "setStandardDeviation", new String[]{"double"}, new String[]{"0.027"}, false, 3, new String[][]{{"org.apache.commons.math.distribution.NormalDistributionImpl", "getMean", ""}, {"org.apache.commons.math.distribution.NormalDistributionImpl", "setStandardDeviation", "double", "1.7976931348623157E308"}}, 2);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getMean=0.0, getStandardDeviation=0.027}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput257() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.distribution.NormalDistributionImpl", "org.apache.commons.math.distribution.NormalDistributionImpl", "setMean", new String[]{"double"}, new String[]{"-1.797693134862316E307"}, false, 0, new String[][]{{"org.apache.commons.math.distribution.NormalDistributionImpl", "getDomainUpperBound", "double", "-14.299999999999999"}}, 3);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getMean=-1.797693134862316E307, getStandardDeviation=1.0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput258() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.distribution.NormalDistributionImpl", "org.apache.commons.math.distribution.NormalDistributionImpl", "getDomainUpperBound", new String[]{"double"}, new String[]{"0.95"}, false, 7, new String[][]{{"org.apache.commons.math.distribution.NormalDistributionImpl", "setMean", "double", "0.9999999999999999"}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("1.7976931348623157E308", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getMean=0.9999999999999999, getStandardDeviation=Infinity}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput259() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.distribution.NormalDistributionImpl", "org.apache.commons.math.distribution.NormalDistributionImpl", "getMean", new String[]{}, new String[]{}, false, 7, new String[][]{{"org.apache.commons.math.distribution.NormalDistributionImpl", "getMean", ""}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("1.0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getMean=1.0, getStandardDeviation=Infinity}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput260() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.distribution.NormalDistributionImpl", "org.apache.commons.math.distribution.NormalDistributionImpl", "inverseCumulativeProbability", new String[]{"double"}, new String[]{"NaN"}, false, 0, new String[][]{{"org.apache.commons.math.distribution.NormalDistributionImpl", "getInitialDomain", "double", "-2.0"}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("0.9999995", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getMean=0.0, getStandardDeviation=1.0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput261() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.distribution.NormalDistributionImpl", "org.apache.commons.math.distribution.NormalDistributionImpl", "getStandardDeviation", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.math.distribution.NormalDistributionImpl", "setMean", "double", "Infinity"}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("1.0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getMean=Infinity, getStandardDeviation=1.0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput262() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.distribution.NormalDistributionImpl", "org.apache.commons.math.distribution.NormalDistributionImpl", "inverseCumulativeProbability", new String[]{"double"}, new String[]{"0.007999999999999998"}, false);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("-2.408915538228015", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getMean=0.0, getStandardDeviation=1.0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput263() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.distribution.NormalDistributionImpl", "org.apache.commons.math.distribution.NormalDistributionImpl", "getStandardDeviation", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.math.distribution.NormalDistributionImpl", "setMean", "double", "1.0"}, {"org.apache.commons.math.distribution.NormalDistributionImpl", "cumulativeProbability", "double,double", "-1.43", "0.0"}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("1.0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getMean=1.0, getStandardDeviation=1.0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput264() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.distribution.NormalDistributionImpl", "org.apache.commons.math.distribution.NormalDistributionImpl", "getDomainUpperBound", new String[]{"double"}, new String[]{"0.0"}, false, 0, new String[][]{{"org.apache.commons.math.distribution.NormalDistributionImpl", "setMean", "double", "NaN"}, {"org.apache.commons.math.distribution.NormalDistributionImpl", "setStandardDeviation", "double", "NaN"}});
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("NaN", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getMean=NaN, getStandardDeviation=NaN}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput265() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.distribution.NormalDistributionImpl", "org.apache.commons.math.distribution.NormalDistributionImpl", "getStandardDeviation", new String[]{}, new String[]{}, false, 7, new String[][]{{"org.apache.commons.math.distribution.NormalDistributionImpl", "setStandardDeviation", "double", "1.7976931348623155E308"}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("1.7976931348623155E308", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getMean=1.0, getStandardDeviation=1.7976931348623155E308}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput266() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.distribution.NormalDistributionImpl", "org.apache.commons.math.distribution.NormalDistributionImpl", "setStandardDeviation", new String[]{"double"}, new String[]{"4.0"}, false, 2, new String[][]{{"org.apache.commons.math.distribution.NormalDistributionImpl", "getMean", ""}}, 2);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getMean=0.0, getStandardDeviation=4.0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput267() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.distribution.NormalDistributionImpl", "org.apache.commons.math.distribution.NormalDistributionImpl", "getDomainLowerBound", new String[]{"double"}, new String[]{"-1.7976931348623157E308"}, false, 0, new String[][]{{"org.apache.commons.math.distribution.NormalDistributionImpl", "setMean", "double", "NaN"}, {"org.apache.commons.math.distribution.NormalDistributionImpl", "getDomainUpperBound", "double", "-0.5"}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("-1.7976931348623157E308", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getMean=NaN, getStandardDeviation=1.0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput268() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.distribution.NormalDistributionImpl", "org.apache.commons.math.distribution.NormalDistributionImpl", "inverseCumulativeProbability", new String[]{"double"}, new String[]{"0.9999999999999999"}, false, 2, new String[][]{{"org.apache.commons.math.distribution.NormalDistributionImpl", "cumulativeProbability", "double,double", "-1.0", "-1.7976931348623158E307"}, {"org.apache.commons.math.distribution.NormalDistributionImpl", "getDomainLowerBound", "double", "NaN"}});
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("9.0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getMean=0.0, getStandardDeviation=1.0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput269() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.distribution.NormalDistributionImpl", "org.apache.commons.math.distribution.NormalDistributionImpl", "cumulativeProbability", new String[]{"double"}, new String[]{"-4.3"}, false, 0, new String[][]{{"org.apache.commons.math.distribution.NormalDistributionImpl", "setStandardDeviation", "double", "1.7976931348623157E308"}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("0.5", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getMean=0.0, getStandardDeviation=1.7976931348623157E308}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput270() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.distribution.NormalDistributionImpl", "org.apache.commons.math.distribution.NormalDistributionImpl", "getStandardDeviation", new String[]{}, new String[]{}, false, 7, new String[][]{{"org.apache.commons.math.distribution.NormalDistributionImpl", "setStandardDeviation", "double", "NaN"}});
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("NaN", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getMean=1.0, getStandardDeviation=NaN}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput271() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.distribution.NormalDistributionImpl", "org.apache.commons.math.distribution.NormalDistributionImpl", "getInitialDomain", new String[]{"double"}, new String[]{"4.2"}, false, 0, new String[][]{{"org.apache.commons.math.distribution.NormalDistributionImpl", "getMean", ""}, {"org.apache.commons.math.distribution.NormalDistributionImpl", "setMean", "double", "4.9E-324"}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("1.0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getMean=4.9E-324, getStandardDeviation=1.0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput272() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.distribution.NormalDistributionImpl", "org.apache.commons.math.distribution.NormalDistributionImpl", "getMean", new String[]{}, new String[]{}, false, 6, new String[][]{{"org.apache.commons.math.distribution.NormalDistributionImpl", "setStandardDeviation", "double", "1.9999999999999998"}, {"org.apache.commons.math.distribution.NormalDistributionImpl", "inverseCumulativeProbability", "double", "-57.99999999999999"}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("0.0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getMean=0.0, getStandardDeviation=1.9999999999999998}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput273() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.distribution.NormalDistributionImpl", "org.apache.commons.math.distribution.NormalDistributionImpl", "getInitialDomain", new String[]{"double"}, new String[]{"2.0"}, false, 7, new String[][]{{"org.apache.commons.math.distribution.NormalDistributionImpl", "cumulativeProbability", "double,double", "NaN", "8589540077390120676"}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("Infinity", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getMean=1.0, getStandardDeviation=Infinity}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput274() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.distribution.NormalDistributionImpl", "org.apache.commons.math.distribution.NormalDistributionImpl", "getDomainLowerBound", new String[]{"double"}, new String[]{"4.000000000000001"}, false, 7, new String[][]{{"org.apache.commons.math.distribution.NormalDistributionImpl", "setStandardDeviation", "double", "-1.7976931348623158E307"}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("1.0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getMean=1.0, getStandardDeviation=Infinity}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput275() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.distribution.NormalDistributionImpl", "org.apache.commons.math.distribution.NormalDistributionImpl", "getDomainUpperBound", new String[]{"double"}, new String[]{"-1.0"}, false, 6, new String[][]{{"org.apache.commons.math.distribution.NormalDistributionImpl", "inverseCumulativeProbability", "double", "8.988465674311579E307"}, {"org.apache.commons.math.distribution.NormalDistributionImpl", "setMean", "double", "0.5"}});
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("0.5", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getMean=0.5, getStandardDeviation=1.0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput276() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.distribution.NormalDistributionImpl", "org.apache.commons.math.distribution.NormalDistributionImpl", "inverseCumulativeProbability", new String[]{"double"}, new String[]{"1.0"}, false, 3, new String[][]{{"org.apache.commons.math.distribution.NormalDistributionImpl", "setStandardDeviation", "double", "20.000000000000004"}});
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("Infinity", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getMean=0.0, getStandardDeviation=20.000000000000004}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput277() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.distribution.NormalDistributionImpl", "org.apache.commons.math.distribution.NormalDistributionImpl", "getDomainLowerBound", new String[]{"double"}, new String[]{"4.2947700386950605E18"}, false, 7, new String[][]{{"org.apache.commons.math.distribution.NormalDistributionImpl", "getDomainUpperBound", "double", "1.7976931348623155E307"}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("1.0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getMean=1.0, getStandardDeviation=Infinity}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput278() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.distribution.NormalDistributionImpl", "org.apache.commons.math.distribution.NormalDistributionImpl", "cumulativeProbability", new String[]{"double", "double"}, new String[]{"40.0", "NaN"}, false, 7, new String[][]{{"org.apache.commons.math.distribution.NormalDistributionImpl", "inverseCumulativeProbability", "double", "-1.0"}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("NaN", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getMean=1.0, getStandardDeviation=Infinity}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput279() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.distribution.NormalDistributionImpl", "org.apache.commons.math.distribution.NormalDistributionImpl", "cumulativeProbability", new String[]{"double"}, new String[]{"NaN"}, false, 2, new String[][]{{"org.apache.commons.math.distribution.NormalDistributionImpl", "getDomainUpperBound", "double", "-200.0"}, {"org.apache.commons.math.distribution.NormalDistributionImpl", "setMean", "double", "8.58954007739012E19"}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("NaN", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getMean=8.58954007739012E19, getStandardDeviation=1.0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput280() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.distribution.NormalDistributionImpl", "org.apache.commons.math.distribution.NormalDistributionImpl", "getInitialDomain", new String[]{"double"}, new String[]{"20.0"}, false, 2, new String[][]{{"org.apache.commons.math.distribution.NormalDistributionImpl", "setMean", "double", "NaN"}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("NaN", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getMean=NaN, getStandardDeviation=1.0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput281() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.distribution.NormalDistributionImpl", "org.apache.commons.math.distribution.NormalDistributionImpl", "inverseCumulativeProbability", new String[]{"double"}, new String[]{"1.0"}, false, 1, new String[][]{{"org.apache.commons.math.distribution.NormalDistributionImpl", "getStandardDeviation", ""}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("Infinity", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getMean=0.0, getStandardDeviation=1.0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput282() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.distribution.NormalDistributionImpl", "org.apache.commons.math.distribution.NormalDistributionImpl", "getDomainLowerBound", new String[]{"double"}, new String[]{"19.52"}, false, 3, new String[][]{{"org.apache.commons.math.distribution.NormalDistributionImpl", "setMean", "double", "-2.6"}});
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("-2.6", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getMean=-2.6, getStandardDeviation=1.0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput283() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.distribution.NormalDistributionImpl", "org.apache.commons.math.distribution.NormalDistributionImpl", "getDomainUpperBound", new String[]{"double"}, new String[]{"2.0"}, false, 0, new String[][]{{"org.apache.commons.math.distribution.NormalDistributionImpl", "setStandardDeviation", "double", "5.768000000000001"}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("1.7976931348623157E308", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getMean=0.0, getStandardDeviation=5.768000000000001}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput284() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.distribution.NormalDistributionImpl", "org.apache.commons.math.distribution.NormalDistributionImpl", "inverseCumulativeProbability", new String[]{"double"}, new String[]{"1.5E-323"}, false, 2, new String[][]{{"org.apache.commons.math.distribution.NormalDistributionImpl", "inverseCumulativeProbability", "double", "0.0"}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("-9.0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getMean=0.0, getStandardDeviation=1.0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput285() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.distribution.NormalDistributionImpl", "org.apache.commons.math.distribution.NormalDistributionImpl", "getDomainLowerBound", new String[]{"double"}, new String[]{"4.300000000000001"}, false, 0, new String[][]{{"org.apache.commons.math.distribution.NormalDistributionImpl", "setStandardDeviation", "double", "20.000000000000004"}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("0.0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getMean=0.0, getStandardDeviation=20.000000000000004}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput286() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.distribution.NormalDistributionImpl", "org.apache.commons.math.distribution.NormalDistributionImpl", "inverseCumulativeProbability", new String[]{"double"}, new String[]{"0.5"}, false, 0, null, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("0.0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getMean=0.0, getStandardDeviation=1.0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput287() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.distribution.NormalDistributionImpl", "org.apache.commons.math.distribution.NormalDistributionImpl", "getDomainLowerBound", new String[]{"double"}, new String[]{"1.2"}, false, 1, new String[][]{{"org.apache.commons.math.distribution.NormalDistributionImpl", "setStandardDeviation", "double", "1.7976931348623157E308"}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("0.0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getMean=0.0, getStandardDeviation=1.7976931348623157E308}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput288() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.distribution.NormalDistributionImpl", "org.apache.commons.math.distribution.NormalDistributionImpl", "cumulativeProbability", new String[]{"double", "double"}, new String[]{"-4.9E-324", "NaN"}, false, 0, new String[][]{{"org.apache.commons.math.distribution.NormalDistributionImpl", "setStandardDeviation", "double", "4.9E-324"}, {"org.apache.commons.math.distribution.NormalDistributionImpl", "setStandardDeviation", "double", "1.7976931348623157E308"}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("NaN", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getMean=0.0, getStandardDeviation=1.7976931348623157E308}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput289() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.distribution.NormalDistributionImpl", "org.apache.commons.math.distribution.NormalDistributionImpl", "getDomainUpperBound", new String[]{"double"}, new String[]{"-1.006"}, false, 0, new String[][]{{"org.apache.commons.math.distribution.NormalDistributionImpl", "setMean", "double", "8589540077390120676"}, {"org.apache.commons.math.distribution.NormalDistributionImpl", "inverseCumulativeProbability", "double", "1.7976931348623157E308"}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("8.589540077390121E18", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getMean=8.589540077390121E18, getStandardDeviation=1.0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput290() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.distribution.NormalDistributionImpl", "org.apache.commons.math.distribution.NormalDistributionImpl", "getMean", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.math.distribution.NormalDistributionImpl", "setStandardDeviation", "double", "20.028000000000002"}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("0.0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getMean=0.0, getStandardDeviation=20.028000000000002}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput291() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.distribution.NormalDistributionImpl", "org.apache.commons.math.distribution.NormalDistributionImpl", "getDomainUpperBound", new String[]{"double"}, new String[]{"-1.7976931348623157E308"}, false, 0, new String[][]{{"org.apache.commons.math.distribution.NormalDistributionImpl", "setMean", "double", "1.7976931348623157E308"}, {"org.apache.commons.math.distribution.NormalDistributionImpl", "cumulativeProbability", "double,double", "-10.0", "4.9E-324"}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("1.7976931348623157E308", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getMean=1.7976931348623157E308, getStandardDeviation=1.0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput292() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.distribution.NormalDistributionImpl", "org.apache.commons.math.distribution.NormalDistributionImpl", "inverseCumulativeProbability", new String[]{"double"}, new String[]{"0.49999999999999994"}, false, 2, new String[][]{{"org.apache.commons.math.distribution.NormalDistributionImpl", "getDomainLowerBound", "double", "1.0"}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("0.0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getMean=0.0, getStandardDeviation=1.0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput293() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.distribution.NormalDistributionImpl", "org.apache.commons.math.distribution.NormalDistributionImpl", "getStandardDeviation", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.math.distribution.NormalDistributionImpl", "getDomainUpperBound", "double", "1.0"}, {"org.apache.commons.math.distribution.NormalDistributionImpl", "setStandardDeviation", "double", "0.2"}});
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("0.2", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getMean=0.0, getStandardDeviation=0.2}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput294() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.distribution.NormalDistributionImpl", "org.apache.commons.math.distribution.NormalDistributionImpl", "getMean", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.math.distribution.NormalDistributionImpl", "setMean", "double", "Infinity"}, {"org.apache.commons.math.distribution.NormalDistributionImpl", "getStandardDeviation", ""}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("Infinity", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getMean=Infinity, getStandardDeviation=1.0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput295() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.distribution.NormalDistributionImpl", "org.apache.commons.math.distribution.NormalDistributionImpl", "getInitialDomain", new String[]{"double"}, new String[]{"8.589540077390121E18"}, false, 0, new String[][]{{"org.apache.commons.math.distribution.NormalDistributionImpl", "setMean", "double", "-8.988465674311579E307"}, {"org.apache.commons.math.distribution.NormalDistributionImpl", "setStandardDeviation", "double", "1.7976931348623155E308"}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("8.988465674311577E307", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getMean=-8.988465674311579E307, getStandardDeviation=1.7976931348623155E308}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput296() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.distribution.NormalDistributionImpl", "org.apache.commons.math.distribution.NormalDistributionImpl", "cumulativeProbability", new String[]{"double", "double"}, new String[]{"0.5", "0.5"}, false, 3, new String[][]{{"org.apache.commons.math.distribution.NormalDistributionImpl", "setStandardDeviation", "double", "1.7976931348623158E307"}, {"org.apache.commons.math.distribution.NormalDistributionImpl", "getMean", ""}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("0.0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getMean=0.0, getStandardDeviation=1.7976931348623158E307}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput297() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.distribution.NormalDistributionImpl", "org.apache.commons.math.distribution.NormalDistributionImpl", "getStandardDeviation", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.math.distribution.NormalDistributionImpl", "setStandardDeviation", "double", "2.86"}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("2.86", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getMean=0.0, getStandardDeviation=2.86}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput298() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.distribution.NormalDistributionImpl", "org.apache.commons.math.distribution.NormalDistributionImpl", "inverseCumulativeProbability", new String[]{"double"}, new String[]{"1.0"}, false, 0, new String[][]{{"org.apache.commons.math.distribution.NormalDistributionImpl", "setStandardDeviation", "double", "Infinity"}});
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("Infinity", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getMean=0.0, getStandardDeviation=Infinity}", SearchInputFactory_scaffolding.receiverState());
 }
}
