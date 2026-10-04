package generated.algorithm;

import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;
import static org.junit.Assert.*;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class SimulatedAnnealingGeneratedTest {
 @Test(timeout = 20000)
 public void generatedInput000() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.distribution.NormalDistributionImpl", "org.apache.commons.math.distribution.NormalDistributionImpl", "cumulativeProbability", new String[]{"double", "double"}, new String[]{"-Infinity", "1.7976931348623158E307"}, false, 0, null, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("1.0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getMean=0.0, getStandardDeviation=1.0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput001() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.distribution.NormalDistributionImpl", "org.apache.commons.math.distribution.NormalDistributionImpl", "cumulativeProbability", new String[]{"double"}, new String[]{"-8.988465674311579E307"}, false, 5, new String[][]{{"org.apache.commons.math.distribution.NormalDistributionImpl", "getInitialDomain", "double", "NaN"}, {"org.apache.commons.math.distribution.NormalDistributionImpl", "getDomainUpperBound", "double", "NaN"}, {"org.apache.commons.math.distribution.NormalDistributionImpl", "inverseCumulativeProbability", "double", "-3.595386269724632E307"}});
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("0.0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getMean=0.0, getStandardDeviation=1.0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput002() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.distribution.NormalDistributionImpl", "org.apache.commons.math.distribution.NormalDistributionImpl", "getInitialDomain", new String[]{"double"}, new String[]{"8.5895400773901199E18"}, false, 0, new String[][]{{"org.apache.commons.math.distribution.NormalDistributionImpl", "inverseCumulativeProbability", "double", "1.0"}, {"org.apache.commons.math.distribution.NormalDistributionImpl", "cumulativeProbability", "double", "-0.1"}});
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("1.0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getMean=0.0, getStandardDeviation=1.0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput003() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.distribution.NormalDistributionImpl", "org.apache.commons.math.distribution.NormalDistributionImpl", "getDomainLowerBound", new String[]{"double"}, new String[]{"0.9999999999999999"}, false, 0, new String[][]{{"org.apache.commons.math.distribution.NormalDistributionImpl", "setMean", "double", "1.0"}, {"org.apache.commons.math.distribution.NormalDistributionImpl", "inverseCumulativeProbability", "double", "0.0"}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("1.0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getMean=1.0, getStandardDeviation=1.0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput004() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math.distribution.NormalDistributionImpl", "org.apache.commons.math.distribution.NormalDistributionImpl", "cumulativeProbability", new String[]{"double", "double"}, new String[]{"-Infinity", "Infinity"}, false, 0, new String[][]{{"org.apache.commons.math.distribution.NormalDistributionImpl", "cumulativeProbability", "double", "20.0"}, {"org.apache.commons.math.distribution.NormalDistributionImpl", "setStandardDeviation", "double", "1.7976931348623158E307"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("org.apache.commons.math.MaxIterationsExceededException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput005() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.distribution.NormalDistributionImpl", "org.apache.commons.math.distribution.NormalDistributionImpl", "inverseCumulativeProbability", new String[]{"double"}, new String[]{"0.1"}, false, 9, new String[][]{{"org.apache.commons.math.distribution.NormalDistributionImpl", "setMean", "double", "-2.2"}, {"org.apache.commons.math.distribution.NormalDistributionImpl", "getInitialDomain", "double", "Infinity"}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("-3.4815515324648714", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getMean=-2.2, getStandardDeviation=1.0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput006() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math.distribution.NormalDistributionImpl", "org.apache.commons.math.distribution.NormalDistributionImpl", "cumulativeProbability", new String[]{"double", "double"}, new String[]{"Infinity", "1.7976931348623158E307"}, false, 0, null, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput007() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.distribution.NormalDistributionImpl", "org.apache.commons.math.distribution.NormalDistributionImpl", "cumulativeProbability", new String[]{"double", "double"}, new String[]{"8589540077390120676", "3.595386269724631E306"}, false, 0, new String[][]{{"org.apache.commons.math.distribution.NormalDistributionImpl", "getStandardDeviation", ""}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("0.0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getMean=0.0, getStandardDeviation=1.0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput008() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.distribution.NormalDistributionImpl", "org.apache.commons.math.distribution.NormalDistributionImpl", "cumulativeProbability", new String[]{"double", "double"}, new String[]{"0.0", "3.595386269724631E306"}, false, 0, null, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("0.5", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getMean=0.0, getStandardDeviation=1.0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput009() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.distribution.NormalDistributionImpl", "org.apache.commons.math.distribution.NormalDistributionImpl", "cumulativeProbability", new String[]{"double", "double"}, new String[]{"-2.2", "3.595386269724631E306"}, false, 0, null, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("0.9860965524865015", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getMean=0.0, getStandardDeviation=1.0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput010() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.distribution.NormalDistributionImpl", "org.apache.commons.math.distribution.NormalDistributionImpl", "cumulativeProbability", new String[]{"double", "double"}, new String[]{"-1.1", "3.595386269724631E306"}, false, 0, null, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("0.8643339390536173", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getMean=0.0, getStandardDeviation=1.0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput011() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.distribution.NormalDistributionImpl", "org.apache.commons.math.distribution.NormalDistributionImpl", "cumulativeProbability", new String[]{"double", "double"}, new String[]{"-1.1", "3.595386269724631E306"}, false, 9, new String[][]{}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("0.8643339390536173", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getMean=0.0, getStandardDeviation=1.0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput012() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.distribution.NormalDistributionImpl", "org.apache.commons.math.distribution.NormalDistributionImpl", "cumulativeProbability", new String[]{"double", "double"}, new String[]{"-0.55", "3.595386269724631E307"}, false, 9, new String[][]{}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("0.7088403132116536", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getMean=0.0, getStandardDeviation=1.0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput013() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.distribution.NormalDistributionImpl", "org.apache.commons.math.distribution.NormalDistributionImpl", "cumulativeProbability", new String[]{"double"}, new String[]{"1.0"}, false, 0, null, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("0.841344746068543", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getMean=0.0, getStandardDeviation=1.0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput014() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.distribution.NormalDistributionImpl", "org.apache.commons.math.distribution.NormalDistributionImpl", "cumulativeProbability", new String[]{"double"}, new String[]{"-2.3000000000000003"}, false, 4, new String[][]{}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("0.010724110021675726", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getMean=0.0, getStandardDeviation=1.0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput015() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.distribution.NormalDistributionImpl", "org.apache.commons.math.distribution.NormalDistributionImpl", "cumulativeProbability", new String[]{"double"}, new String[]{"-4.6000000000000005"}, false, 4, new String[][]{}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("2.1124547027739915E-6", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getMean=0.0, getStandardDeviation=1.0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput016() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.distribution.NormalDistributionImpl", "org.apache.commons.math.distribution.NormalDistributionImpl", "cumulativeProbability", new String[]{"double"}, new String[]{"-46.00000000000001"}, false, 4, new String[][]{}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("0.0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getMean=0.0, getStandardDeviation=1.0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput017() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.distribution.NormalDistributionImpl", "org.apache.commons.math.distribution.NormalDistributionImpl", "cumulativeProbability", new String[]{"double"}, new String[]{"-93.0"}, false, 4, new String[][]{{"org.apache.commons.math.distribution.NormalDistributionImpl", "inverseCumulativeProbability", "double", "1.7976931348623157E308"}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("0.0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getMean=0.0, getStandardDeviation=1.0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput018() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.distribution.NormalDistributionImpl", "org.apache.commons.math.distribution.NormalDistributionImpl", "cumulativeProbability", new String[]{"double"}, new String[]{"2.0"}, false, 4, new String[][]{{"org.apache.commons.math.distribution.NormalDistributionImpl", "inverseCumulativeProbability", "double", "1.7976931348623157E308"}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("0.9772498680518209", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getMean=0.0, getStandardDeviation=1.0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput019() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.distribution.NormalDistributionImpl", "org.apache.commons.math.distribution.NormalDistributionImpl", "cumulativeProbability", new String[]{"double"}, new String[]{"-2.0"}, false, 4, new String[][]{{"org.apache.commons.math.distribution.NormalDistributionImpl", "inverseCumulativeProbability", "double", "1.7976931348623157E308"}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("0.022750131948179153", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getMean=0.0, getStandardDeviation=1.0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput020() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.distribution.NormalDistributionImpl", "org.apache.commons.math.distribution.NormalDistributionImpl", "cumulativeProbability", new String[]{"double"}, new String[]{"-4.0"}, false, 4, new String[][]{{"org.apache.commons.math.distribution.NormalDistributionImpl", "inverseCumulativeProbability", "double", "1.7976931348623157E308"}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("3.167124183262038E-5", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getMean=0.0, getStandardDeviation=1.0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput021() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.distribution.NormalDistributionImpl", "org.apache.commons.math.distribution.NormalDistributionImpl", "cumulativeProbability", new String[]{"double"}, new String[]{"-4.0"}, false, 4, new String[][]{{"org.apache.commons.math.distribution.NormalDistributionImpl", "getInitialDomain", "double", "-1.0"}, {"org.apache.commons.math.distribution.NormalDistributionImpl", "inverseCumulativeProbability", "double", "-1.7976931348623157E308"}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("3.167124183262038E-5", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getMean=0.0, getStandardDeviation=1.0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput022() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.distribution.NormalDistributionImpl", "org.apache.commons.math.distribution.NormalDistributionImpl", "cumulativeProbability", new String[]{"double"}, new String[]{"4.0"}, false, 4, new String[][]{{"org.apache.commons.math.distribution.NormalDistributionImpl", "getInitialDomain", "double", "-1.0"}, {"org.apache.commons.math.distribution.NormalDistributionImpl", "getDomainLowerBound", "double", "1.7976931348623157E308"}, {"org.apache.commons.math.distribution.NormalDistributionImpl", "inverseCumulativeProbability", "double", "-1.7976931348623157E308"}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("0.9999683287581673", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getMean=0.0, getStandardDeviation=1.0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput023() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.distribution.NormalDistributionImpl", "org.apache.commons.math.distribution.NormalDistributionImpl", "getInitialDomain", new String[]{"double"}, new String[]{"3.595386269724631E306"}, false, 0, new String[][]{{"org.apache.commons.math.distribution.NormalDistributionImpl", "getMean", ""}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("1.0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getMean=0.0, getStandardDeviation=1.0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput024() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.distribution.NormalDistributionImpl", "org.apache.commons.math.distribution.NormalDistributionImpl", "getInitialDomain", new String[]{"double"}, new String[]{"-93.015"}, false, 0, null, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("-1.0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getMean=0.0, getStandardDeviation=1.0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput025() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.distribution.NormalDistributionImpl", "org.apache.commons.math.distribution.NormalDistributionImpl", "getDomainLowerBound", new String[]{"double"}, new String[]{"-1.1"}, false, 3, new String[][]{{"org.apache.commons.math.distribution.NormalDistributionImpl", "inverseCumulativeProbability", "double", "1.7976931348623157E308"}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("-1.7976931348623157E308", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getMean=0.0, getStandardDeviation=1.0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput026() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.distribution.NormalDistributionImpl", "org.apache.commons.math.distribution.NormalDistributionImpl", "getDomainLowerBound", new String[]{"double"}, new String[]{"0.04580000000000001"}, false, 3, new String[][]{{"org.apache.commons.math.distribution.NormalDistributionImpl", "setMean", "double", "0.5"}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("-1.7976931348623157E308", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getMean=0.5, getStandardDeviation=1.0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput027() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.distribution.NormalDistributionImpl", "org.apache.commons.math.distribution.NormalDistributionImpl", "getDomainLowerBound", new String[]{"double"}, new String[]{"0.04580000000000001"}, false, 9, new String[][]{{"org.apache.commons.math.distribution.NormalDistributionImpl", "setMean", "double", "5.4"}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("-1.7976931348623157E308", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getMean=5.4, getStandardDeviation=1.0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput028() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.distribution.NormalDistributionImpl", "org.apache.commons.math.distribution.NormalDistributionImpl", "getMean", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.math.distribution.NormalDistributionImpl", "getStandardDeviation", ""}, {"org.apache.commons.math.distribution.NormalDistributionImpl", "getDomainLowerBound", "double", "-8.988465674311579E307"}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("0.0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getMean=0.0, getStandardDeviation=1.0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput029() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math.distribution.NormalDistributionImpl", "org.apache.commons.math.distribution.NormalDistributionImpl", "inverseCumulativeProbability", new String[]{"double"}, new String[]{"-Infinity"}, false, 0, null, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput030() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.distribution.NormalDistributionImpl", "org.apache.commons.math.distribution.NormalDistributionImpl", "inverseCumulativeProbability", new String[]{"double"}, new String[]{"0.5"}, false, 0, new String[][]{{"org.apache.commons.math.distribution.NormalDistributionImpl", "inverseCumulativeProbability", "double", "Infinity"}, {"org.apache.commons.math.distribution.NormalDistributionImpl", "getStandardDeviation", ""}, {"org.apache.commons.math.distribution.NormalDistributionImpl", "getDomainLowerBound", "double", "Infinity"}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("0.0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getMean=0.0, getStandardDeviation=1.0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput031() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.distribution.NormalDistributionImpl", "org.apache.commons.math.distribution.NormalDistributionImpl", "getStandardDeviation", new String[]{}, new String[]{}, false, 1, new String[][]{{"org.apache.commons.math.distribution.NormalDistributionImpl", "getDomainLowerBound", "double", "1.0"}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("1.0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getMean=0.0, getStandardDeviation=1.0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput032() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.distribution.NormalDistributionImpl", "org.apache.commons.math.distribution.NormalDistributionImpl", "getStandardDeviation", new String[]{}, new String[]{}, false, 13, new String[][]{{"org.apache.commons.math.distribution.NormalDistributionImpl", "getDomainLowerBound", "double", "1.0"}, {"org.apache.commons.math.distribution.NormalDistributionImpl", "setMean", "double", "4.2947700386950605E18"}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("1.0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getMean=4.2947700386950605E18, getStandardDeviation=1.0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput033() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.distribution.NormalDistributionImpl", "org.apache.commons.math.distribution.NormalDistributionImpl", "cumulativeProbability", new String[]{"double"}, new String[]{"-2.14738501934753024E18"}, false, 13, new String[][]{{"org.apache.commons.math.distribution.NormalDistributionImpl", "setMean", "double", "-4.0"}, {"org.apache.commons.math.distribution.NormalDistributionImpl", "cumulativeProbability", "double,double", "-930.0000000000001", "0.0"}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("0.0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getMean=-4.0, getStandardDeviation=1.0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput034() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.distribution.NormalDistributionImpl", "org.apache.commons.math.distribution.NormalDistributionImpl", "getStandardDeviation", new String[]{}, new String[]{}, false, 0, null, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("1.0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getMean=0.0, getStandardDeviation=1.0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput035() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.distribution.NormalDistributionImpl", "org.apache.commons.math.distribution.NormalDistributionImpl", "getStandardDeviation", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.math.distribution.NormalDistributionImpl", "setMean", "double", "-1.0"}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("1.0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getMean=-1.0, getStandardDeviation=1.0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput036() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math.distribution.NormalDistributionImpl", "org.apache.commons.math.distribution.NormalDistributionImpl", "setStandardDeviation", new String[]{"double"}, new String[]{"-4.29477003869506E18"}, false, 1, new String[][]{{"org.apache.commons.math.distribution.NormalDistributionImpl", "getDomainUpperBound", "double", "-3.595386269724632E307"}, {"org.apache.commons.math.distribution.NormalDistributionImpl", "inverseCumulativeProbability", "double", "-8.988465674311579E307"}}, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput037() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.distribution.NormalDistributionImpl", "org.apache.commons.math.distribution.NormalDistributionImpl", "setStandardDeviation", new String[]{"double"}, new String[]{"Infinity"}, false, 5, new String[][]{{"org.apache.commons.math.distribution.NormalDistributionImpl", "getDomainUpperBound", "double", "-3.595386269724632E307"}, {"org.apache.commons.math.distribution.NormalDistributionImpl", "getInitialDomain", "double", "20.0"}, {"org.apache.commons.math.distribution.NormalDistributionImpl", "inverseCumulativeProbability", "double", "8.988465674311579E307"}}, 1);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getMean=0.0, getStandardDeviation=Infinity}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput038() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.distribution.NormalDistributionImpl", "org.apache.commons.math.distribution.NormalDistributionImpl", "setStandardDeviation", new String[]{"double"}, new String[]{"1.7976931348623157E308"}, false, 5, new String[][]{{"org.apache.commons.math.distribution.NormalDistributionImpl", "getDomainUpperBound", "double", "-1.797693134862316E307"}, {"org.apache.commons.math.distribution.NormalDistributionImpl", "getInitialDomain", "double", "20.0"}}, 1);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getMean=0.0, getStandardDeviation=1.7976931348623157E308}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput039() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.distribution.NormalDistributionImpl", "org.apache.commons.math.distribution.NormalDistributionImpl", "setStandardDeviation", new String[]{"double"}, new String[]{"8.988465674311579E307"}, false, 5, new String[][]{{"org.apache.commons.math.distribution.NormalDistributionImpl", "getDomainUpperBound", "double", "0.5"}, {"org.apache.commons.math.distribution.NormalDistributionImpl", "getInitialDomain", "double", "20.0"}}, 1);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getMean=0.0, getStandardDeviation=8.988465674311579E307}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput040() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.distribution.NormalDistributionImpl", "org.apache.commons.math.distribution.NormalDistributionImpl", "setStandardDeviation", new String[]{"double"}, new String[]{"8.988465674311579E306"}, false, 5, new String[][]{{"org.apache.commons.math.distribution.NormalDistributionImpl", "getDomainUpperBound", "double", "0.5"}, {"org.apache.commons.math.distribution.NormalDistributionImpl", "getInitialDomain", "double", "20.0"}}, 1);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getMean=0.0, getStandardDeviation=8.988465674311579E306}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput041() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.distribution.NormalDistributionImpl", "org.apache.commons.math.distribution.NormalDistributionImpl", "setStandardDeviation", new String[]{"double"}, new String[]{"8589540077390120676"}, false, 5, new String[][]{{"org.apache.commons.math.distribution.NormalDistributionImpl", "getDomainUpperBound", "double", "0.5"}, {"org.apache.commons.math.distribution.NormalDistributionImpl", "getInitialDomain", "double", "20.0"}}, 1);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getMean=0.0, getStandardDeviation=8.589540077390121E18}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput042() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.distribution.NormalDistributionImpl", "org.apache.commons.math.distribution.NormalDistributionImpl", "setMean", new String[]{"double"}, new String[]{"-93.0"}, false, 0, new String[][]{{"org.apache.commons.math.distribution.NormalDistributionImpl", "getDomainLowerBound", "double", "NaN"}}, 1);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getMean=-93.0, getStandardDeviation=1.0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput043() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.distribution.NormalDistributionImpl", "org.apache.commons.math.distribution.NormalDistributionImpl", "setMean", new String[]{"double"}, new String[]{"40.0"}, false, 0, new String[][]{{"org.apache.commons.math.distribution.NormalDistributionImpl", "getDomainLowerBound", "double", "NaN"}}, 1);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getMean=40.0, getStandardDeviation=1.0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput044() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.distribution.NormalDistributionImpl", "org.apache.commons.math.distribution.NormalDistributionImpl", "setMean", new String[]{"double"}, new String[]{"40.00000000000001"}, false, 0, new String[][]{{"org.apache.commons.math.distribution.NormalDistributionImpl", "getDomainLowerBound", "double", "NaN"}}, 1);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getMean=40.00000000000001, getStandardDeviation=1.0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput045() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.distribution.NormalDistributionImpl", "org.apache.commons.math.distribution.NormalDistributionImpl", "cumulativeProbability", new String[]{"double"}, new String[]{"-59.86"}, false, 14, new String[][]{}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("0.0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getMean=0.0, getStandardDeviation=1.0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput046() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.distribution.NormalDistributionImpl", "org.apache.commons.math.distribution.NormalDistributionImpl", "cumulativeProbability", new String[]{"double"}, new String[]{"38.11"}, false, 14, new String[][]{}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("1.0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getMean=0.0, getStandardDeviation=1.0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput047() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.distribution.NormalDistributionImpl", "org.apache.commons.math.distribution.NormalDistributionImpl", "cumulativeProbability", new String[]{"double"}, new String[]{"1.0"}, false, 13, new String[][]{{"org.apache.commons.math.distribution.NormalDistributionImpl", "cumulativeProbability", "double,double", "-Infinity", "NaN"}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("0.841344746068543", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getMean=0.0, getStandardDeviation=1.0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput048() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.distribution.NormalDistributionImpl", "org.apache.commons.math.distribution.NormalDistributionImpl", "cumulativeProbability", new String[]{"double"}, new String[]{"-1.0"}, false, 13, new String[][]{{"org.apache.commons.math.distribution.NormalDistributionImpl", "getStandardDeviation", ""}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("0.15865525393145702", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getMean=0.0, getStandardDeviation=1.0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput049() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.distribution.NormalDistributionImpl", "org.apache.commons.math.distribution.NormalDistributionImpl", "cumulativeProbability", new String[]{"double"}, new String[]{"-0.5"}, false, 6, new String[][]{{"org.apache.commons.math.distribution.NormalDistributionImpl", "setStandardDeviation", "double", "-93.0"}, {"org.apache.commons.math.distribution.NormalDistributionImpl", "getStandardDeviation", ""}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("0.308537538725987", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getMean=0.0, getStandardDeviation=1.0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput050() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.distribution.NormalDistributionImpl", "org.apache.commons.math.distribution.NormalDistributionImpl", "getMean", new String[]{}, new String[]{}, false, 12, new String[][]{{"org.apache.commons.math.distribution.NormalDistributionImpl", "setMean", "double", "0.4769999999999999"}, {"org.apache.commons.math.distribution.NormalDistributionImpl", "setMean", "double", "-Infinity"}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("-Infinity", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getMean=-Infinity, getStandardDeviation=1.0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput051() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.distribution.NormalDistributionImpl", "org.apache.commons.math.distribution.NormalDistributionImpl", "getMean", new String[]{}, new String[]{}, false, 13, new String[][]{{"org.apache.commons.math.distribution.NormalDistributionImpl", "setMean", "double", "0.4769999999999999"}, {"org.apache.commons.math.distribution.NormalDistributionImpl", "getDomainLowerBound", "double", "Infinity"}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("0.4769999999999999", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getMean=0.4769999999999999, getStandardDeviation=1.0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput052() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.distribution.NormalDistributionImpl", "org.apache.commons.math.distribution.NormalDistributionImpl", "getMean", new String[]{}, new String[]{}, false, 16, new String[][]{{"org.apache.commons.math.distribution.NormalDistributionImpl", "setMean", "double", "0.9539999999999998"}, {"org.apache.commons.math.distribution.NormalDistributionImpl", "getDomainLowerBound", "double", "Infinity"}, {"org.apache.commons.math.distribution.NormalDistributionImpl", "setStandardDeviation", "double", "-1.7976931348623157E308"}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("0.9539999999999998", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getMean=0.9539999999999998, getStandardDeviation=1.0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput053() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.distribution.NormalDistributionImpl", "org.apache.commons.math.distribution.NormalDistributionImpl", "getMean", new String[]{}, new String[]{}, false, 16, new String[][]{{"org.apache.commons.math.distribution.NormalDistributionImpl", "getDomainLowerBound", "double", "-Infinity"}, {"org.apache.commons.math.distribution.NormalDistributionImpl", "setStandardDeviation", "double", "-1.7976931348623157E308"}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("0.0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getMean=0.0, getStandardDeviation=1.0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput054() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.distribution.NormalDistributionImpl", "org.apache.commons.math.distribution.NormalDistributionImpl", "getMean", new String[]{}, new String[]{}, false, 17, new String[][]{{"org.apache.commons.math.distribution.NormalDistributionImpl", "getDomainLowerBound", "double", "-Infinity"}, {"org.apache.commons.math.distribution.NormalDistributionImpl", "setStandardDeviation", "double", "-1.7976931348623157E308"}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("1.0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getMean=1.0, getStandardDeviation=Infinity}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput055() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.distribution.NormalDistributionImpl", "org.apache.commons.math.distribution.NormalDistributionImpl", "getStandardDeviation", new String[]{}, new String[]{}, false, 12, new String[][]{}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("1.0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getMean=0.0, getStandardDeviation=1.0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput056() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.distribution.NormalDistributionImpl", "org.apache.commons.math.distribution.NormalDistributionImpl", "getStandardDeviation", new String[]{}, new String[]{}, false, 7, new String[][]{}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("Infinity", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getMean=1.0, getStandardDeviation=Infinity}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput057() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.distribution.NormalDistributionImpl", "org.apache.commons.math.distribution.NormalDistributionImpl", "getStandardDeviation", new String[]{}, new String[]{}, false, 9, new String[][]{{"org.apache.commons.math.distribution.NormalDistributionImpl", "inverseCumulativeProbability", "double", "0.0"}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("1.0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getMean=0.0, getStandardDeviation=1.0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput058() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.distribution.NormalDistributionImpl", "org.apache.commons.math.distribution.NormalDistributionImpl", "getInitialDomain", new String[]{"double"}, new String[]{"-93.0"}, false, 2, new String[][]{{"org.apache.commons.math.distribution.NormalDistributionImpl", "getInitialDomain", "double", "-4.0"}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("-1.0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getMean=0.0, getStandardDeviation=1.0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput059() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.distribution.NormalDistributionImpl", "org.apache.commons.math.distribution.NormalDistributionImpl", "getInitialDomain", new String[]{"double"}, new String[]{"93.0"}, false, 2, new String[][]{{"org.apache.commons.math.distribution.NormalDistributionImpl", "getInitialDomain", "double", "-4.0"}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("1.0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getMean=0.0, getStandardDeviation=1.0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput060() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.distribution.NormalDistributionImpl", "org.apache.commons.math.distribution.NormalDistributionImpl", "getInitialDomain", new String[]{"double"}, new String[]{"-3.595386269724632E306"}, false, 7, new String[][]{{"org.apache.commons.math.distribution.NormalDistributionImpl", "cumulativeProbability", "double,double", "-1.0", "1.7976931348623158E307"}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("-Infinity", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getMean=1.0, getStandardDeviation=Infinity}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput061() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.distribution.NormalDistributionImpl", "org.apache.commons.math.distribution.NormalDistributionImpl", "getMean", new String[]{}, new String[]{}, false, 6, new String[][]{{"org.apache.commons.math.distribution.NormalDistributionImpl", "setMean", "double", "-8.988465674311579E307"}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("-8.988465674311579E307", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getMean=-8.988465674311579E307, getStandardDeviation=1.0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput062() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.distribution.NormalDistributionImpl", "org.apache.commons.math.distribution.NormalDistributionImpl", "getDomainLowerBound", new String[]{"double"}, new String[]{"8.589540077390121E18"}, false, 0, null, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("0.0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getMean=0.0, getStandardDeviation=1.0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput063() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.distribution.NormalDistributionImpl", "org.apache.commons.math.distribution.NormalDistributionImpl", "getDomainUpperBound", new String[]{"double"}, new String[]{"1.71790801547802419E18"}, false, 0, null, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("1.7976931348623157E308", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getMean=0.0, getStandardDeviation=1.0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput064() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.distribution.NormalDistributionImpl", "org.apache.commons.math.distribution.NormalDistributionImpl", "cumulativeProbability", new String[]{"double"}, new String[]{"-92.99999999999999"}, false, 0, new String[][]{{"org.apache.commons.math.distribution.NormalDistributionImpl", "setMean", "double", "-Infinity"}, {"org.apache.commons.math.distribution.NormalDistributionImpl", "getDomainLowerBound", "double", "-Infinity"}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("1.0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getMean=-Infinity, getStandardDeviation=1.0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput065() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math.distribution.NormalDistributionImpl", "org.apache.commons.math.distribution.NormalDistributionImpl", "setStandardDeviation", new String[]{"double"}, new String[]{"-0.1"}, false, 2, new String[][]{{"org.apache.commons.math.distribution.NormalDistributionImpl", "getDomainLowerBound", "double", "NaN"}, {"org.apache.commons.math.distribution.NormalDistributionImpl", "getStandardDeviation", ""}}, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput066() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.distribution.NormalDistributionImpl", "org.apache.commons.math.distribution.NormalDistributionImpl", "getDomainLowerBound", new String[]{"double"}, new String[]{"Infinity"}, false, 5, new String[][]{}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("0.0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getMean=0.0, getStandardDeviation=1.0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput067() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.distribution.NormalDistributionImpl", "org.apache.commons.math.distribution.NormalDistributionImpl", "getDomainLowerBound", new String[]{"double"}, new String[]{"Infinity"}, false, 5, new String[][]{{"org.apache.commons.math.distribution.NormalDistributionImpl", "setMean", "double", "-8.988465674311579E307"}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("-8.988465674311579E307", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getMean=-8.988465674311579E307, getStandardDeviation=1.0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput068() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.distribution.NormalDistributionImpl", "org.apache.commons.math.distribution.NormalDistributionImpl", "getDomainLowerBound", new String[]{"double"}, new String[]{"-1.7976931348623157E308"}, false, 5, new String[][]{{"org.apache.commons.math.distribution.NormalDistributionImpl", "setMean", "double", "-8.988465674311579E307"}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("-1.7976931348623157E308", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getMean=-8.988465674311579E307, getStandardDeviation=1.0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput069() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.distribution.NormalDistributionImpl", "org.apache.commons.math.distribution.NormalDistributionImpl", "getDomainLowerBound", new String[]{"double"}, new String[]{"-1.7976931348623157E308"}, false, 5, new String[][]{{"org.apache.commons.math.distribution.NormalDistributionImpl", "setMean", "double", "-4.4942328371557893E307"}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("-1.7976931348623157E308", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getMean=-4.4942328371557893E307, getStandardDeviation=1.0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput070() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.distribution.NormalDistributionImpl", "org.apache.commons.math.distribution.NormalDistributionImpl", "getDomainLowerBound", new String[]{"double"}, new String[]{"-13.8"}, false, 5, new String[][]{{"org.apache.commons.math.distribution.NormalDistributionImpl", "setStandardDeviation", "double", "20.0"}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("-1.7976931348623157E308", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getMean=0.0, getStandardDeviation=20.0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput071() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.distribution.NormalDistributionImpl", "org.apache.commons.math.distribution.NormalDistributionImpl", "getDomainLowerBound", new String[]{"double"}, new String[]{"-6.678000000000001"}, false, 0, new String[][]{{"org.apache.commons.math.distribution.NormalDistributionImpl", "getStandardDeviation", ""}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("-1.7976931348623157E308", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getMean=0.0, getStandardDeviation=1.0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput072() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.distribution.NormalDistributionImpl", "org.apache.commons.math.distribution.NormalDistributionImpl", "getDomainLowerBound", new String[]{"double"}, new String[]{"4.2947700386950605E18"}, false, 0, new String[][]{{"org.apache.commons.math.distribution.NormalDistributionImpl", "getStandardDeviation", ""}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("0.0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getMean=0.0, getStandardDeviation=1.0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput073() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.distribution.NormalDistributionImpl", "org.apache.commons.math.distribution.NormalDistributionImpl", "setMean", new String[]{"double"}, new String[]{"1.0"}, false, 0, new String[][]{{"org.apache.commons.math.distribution.NormalDistributionImpl", "getMean", ""}, {"org.apache.commons.math.distribution.NormalDistributionImpl", "getMean", ""}}, 3);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getMean=1.0, getStandardDeviation=1.0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput074() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.distribution.NormalDistributionImpl", "org.apache.commons.math.distribution.NormalDistributionImpl", "setMean", new String[]{"double"}, new String[]{"Infinity"}, false, 0, new String[][]{{"org.apache.commons.math.distribution.NormalDistributionImpl", "getMean", ""}, {"org.apache.commons.math.distribution.NormalDistributionImpl", "getMean", ""}}, 3);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getMean=Infinity, getStandardDeviation=1.0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput075() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.distribution.NormalDistributionImpl", "org.apache.commons.math.distribution.NormalDistributionImpl", "setStandardDeviation", new String[]{"double"}, new String[]{"1.0"}, false, 0, null, 3);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getMean=0.0, getStandardDeviation=1.0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput076() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.distribution.NormalDistributionImpl", "org.apache.commons.math.distribution.NormalDistributionImpl", "setStandardDeviation", new String[]{"double"}, new String[]{"1.7976931348623157E308"}, false, 14, new String[][]{}, 3);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getMean=0.0, getStandardDeviation=1.7976931348623157E308}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput077() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.distribution.NormalDistributionImpl", "org.apache.commons.math.distribution.NormalDistributionImpl", "setStandardDeviation", new String[]{"double"}, new String[]{"Infinity"}, false, 14, new String[][]{}, 3);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getMean=0.0, getStandardDeviation=Infinity}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput078() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.distribution.NormalDistributionImpl", "org.apache.commons.math.distribution.NormalDistributionImpl", "getStandardDeviation", new String[]{}, new String[]{}, false, 7, new String[][]{{"org.apache.commons.math.distribution.NormalDistributionImpl", "inverseCumulativeProbability", "double", "Infinity"}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("Infinity", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getMean=1.0, getStandardDeviation=Infinity}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput079() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math.distribution.NormalDistributionImpl", "org.apache.commons.math.distribution.NormalDistributionImpl", "setStandardDeviation", new String[]{"double"}, new String[]{"-3.595386269724632E307"}, false, 0, null, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput080() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.distribution.NormalDistributionImpl", "org.apache.commons.math.distribution.NormalDistributionImpl", "setStandardDeviation", new String[]{"double"}, new String[]{"4.2947700386950605E18"}, false, 2, new String[][]{}, 2);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getMean=0.0, getStandardDeviation=4.2947700386950605E18}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput081() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math.distribution.NormalDistributionImpl", "org.apache.commons.math.distribution.NormalDistributionImpl", "cumulativeProbability", new String[]{"double", "double"}, new String[]{"Infinity", "1.7976931348623157E308"}, false); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput082() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.distribution.NormalDistributionImpl", "org.apache.commons.math.distribution.NormalDistributionImpl", "cumulativeProbability", new String[]{"double", "double"}, new String[]{"-0.55", "3.595386269724631E307"}, false, 9, new String[][]{});
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("0.7088403132116536", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getMean=0.0, getStandardDeviation=1.0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput083() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.distribution.NormalDistributionImpl", "org.apache.commons.math.distribution.NormalDistributionImpl", "cumulativeProbability", new String[]{"double", "double"}, new String[]{"-0.0509", "3.595386269724631E307"}, false, 9, new String[][]{});
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("0.5202973972442801", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getMean=0.0, getStandardDeviation=1.0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput084() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.distribution.NormalDistributionImpl", "org.apache.commons.math.distribution.NormalDistributionImpl", "getDomainLowerBound", new String[]{"double"}, new String[]{"1.7976931348623157E308"}, false, 0, new String[][]{{"org.apache.commons.math.distribution.NormalDistributionImpl", "getInitialDomain", "double", "0.5"}});
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("0.0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getMean=0.0, getStandardDeviation=1.0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput085() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.distribution.NormalDistributionImpl", "org.apache.commons.math.distribution.NormalDistributionImpl", "cumulativeProbability", new String[]{"double"}, new String[]{"-8.988465674311579E307"}, false, 5, new String[][]{{"org.apache.commons.math.distribution.NormalDistributionImpl", "getInitialDomain", "double", "-2.0"}, {"org.apache.commons.math.distribution.NormalDistributionImpl", "inverseCumulativeProbability", "double", "-3.595386269724632E307"}});
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("0.0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getMean=0.0, getStandardDeviation=1.0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput086() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.distribution.NormalDistributionImpl", "org.apache.commons.math.distribution.NormalDistributionImpl", "cumulativeProbability", new String[]{"double"}, new String[]{"-8.988465674311579E307"}, false, 5, new String[][]{{"org.apache.commons.math.distribution.NormalDistributionImpl", "getInitialDomain", "double", "NaN"}, {"org.apache.commons.math.distribution.NormalDistributionImpl", "getDomainUpperBound", "double", "-Infinity"}, {"org.apache.commons.math.distribution.NormalDistributionImpl", "inverseCumulativeProbability", "double", "-3.595386269724632E307"}});
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("0.0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getMean=0.0, getStandardDeviation=1.0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput087() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.distribution.NormalDistributionImpl", "org.apache.commons.math.distribution.NormalDistributionImpl", "cumulativeProbability", new String[]{"double"}, new String[]{"-1.1"}, false, 1, new String[][]{{"org.apache.commons.math.distribution.NormalDistributionImpl", "getInitialDomain", "double", "NaN"}, {"org.apache.commons.math.distribution.NormalDistributionImpl", "getDomainUpperBound", "double", "Infinity"}, {"org.apache.commons.math.distribution.NormalDistributionImpl", "inverseCumulativeProbability", "double", "3.595386269724632E307"}});
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("0.13566606094638273", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getMean=0.0, getStandardDeviation=1.0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput088() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.distribution.NormalDistributionImpl", "org.apache.commons.math.distribution.NormalDistributionImpl", "cumulativeProbability", new String[]{"double"}, new String[]{"-2.2"}, false, 1, new String[][]{{"org.apache.commons.math.distribution.NormalDistributionImpl", "getInitialDomain", "double", "NaN"}, {"org.apache.commons.math.distribution.NormalDistributionImpl", "getDomainUpperBound", "double", "3.595386269724631E306"}});
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("0.013903447513498535", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getMean=0.0, getStandardDeviation=1.0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput089() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.distribution.NormalDistributionImpl", "org.apache.commons.math.distribution.NormalDistributionImpl", "cumulativeProbability", new String[]{"double"}, new String[]{"NaN"}, false, 5, new String[][]{{"org.apache.commons.math.distribution.NormalDistributionImpl", "getDomainUpperBound", "double", "1.7976931348623158E307"}});
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("NaN", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getMean=0.0, getStandardDeviation=1.0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput090() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.distribution.NormalDistributionImpl", "org.apache.commons.math.distribution.NormalDistributionImpl", "cumulativeProbability", new String[]{"double"}, new String[]{"1.7976931348623157E308"}, false, 5, new String[][]{{"org.apache.commons.math.distribution.NormalDistributionImpl", "getDomainUpperBound", "double", "1.7976931348623158E307"}});
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("1.0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getMean=0.0, getStandardDeviation=1.0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput091() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.distribution.NormalDistributionImpl", "org.apache.commons.math.distribution.NormalDistributionImpl", "cumulativeProbability", new String[]{"double"}, new String[]{"Infinity"}, false, 5, new String[][]{{"org.apache.commons.math.distribution.NormalDistributionImpl", "getDomainUpperBound", "double", "1.7976931348623158E307"}});
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("1.0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getMean=0.0, getStandardDeviation=1.0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput092() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.distribution.NormalDistributionImpl", "org.apache.commons.math.distribution.NormalDistributionImpl", "setMean", new String[]{"double"}, new String[]{"1.7976931348623158E307"}, false, 0, new String[][]{{"org.apache.commons.math.distribution.NormalDistributionImpl", "cumulativeProbability", "double,double", "Infinity", "3.595386269724631E306"}, {"org.apache.commons.math.distribution.NormalDistributionImpl", "setMean", "double", "0.5"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getMean=1.7976931348623158E307, getStandardDeviation=1.0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput093() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.distribution.NormalDistributionImpl", "org.apache.commons.math.distribution.NormalDistributionImpl", "setMean", new String[]{"double"}, new String[]{"8.988465674311579E306"}, false, 0, new String[][]{{"org.apache.commons.math.distribution.NormalDistributionImpl", "cumulativeProbability", "double,double", "Infinity", "3.595386269724631E306"}, {"org.apache.commons.math.distribution.NormalDistributionImpl", "setMean", "double", "0.5"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getMean=8.988465674311579E306, getStandardDeviation=1.0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput094() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.distribution.NormalDistributionImpl", "org.apache.commons.math.distribution.NormalDistributionImpl", "getDomainLowerBound", new String[]{"double"}, new String[]{"-1.1"}, false, 3, new String[][]{{"org.apache.commons.math.distribution.NormalDistributionImpl", "inverseCumulativeProbability", "double", "1.7976931348623157E308"}});
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("-1.7976931348623157E308", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getMean=0.0, getStandardDeviation=1.0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput095() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math.distribution.NormalDistributionImpl", "org.apache.commons.math.distribution.NormalDistributionImpl", "inverseCumulativeProbability", new String[]{"double"}, new String[]{"1.7976931348623158E307"}, false, 0, new String[][]{{"org.apache.commons.math.distribution.NormalDistributionImpl", "setStandardDeviation", "double", "8589540077390120676"}, {"org.apache.commons.math.distribution.NormalDistributionImpl", "cumulativeProbability", "double,double", "-1.0", "0.0"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput096() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math.distribution.NormalDistributionImpl", "org.apache.commons.math.distribution.NormalDistributionImpl", "inverseCumulativeProbability", new String[]{"double"}, new String[]{"-Infinity"}, false, 0, new String[][]{{"org.apache.commons.math.distribution.NormalDistributionImpl", "setStandardDeviation", "double", "4.2947700386950605E18"}, {"org.apache.commons.math.distribution.NormalDistributionImpl", "getMean", ""}, {"org.apache.commons.math.distribution.NormalDistributionImpl", "cumulativeProbability", "double,double", "1.7976931348623158E307", "-Infinity"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput097() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.distribution.NormalDistributionImpl", "org.apache.commons.math.distribution.NormalDistributionImpl", "getMean", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.math.distribution.NormalDistributionImpl", "getStandardDeviation", ""}, {"org.apache.commons.math.distribution.NormalDistributionImpl", "getDomainLowerBound", "double", "-8.988465674311579E307"}});
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("0.0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getMean=0.0, getStandardDeviation=1.0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput098() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.distribution.NormalDistributionImpl", "org.apache.commons.math.distribution.NormalDistributionImpl", "getStandardDeviation", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.math.distribution.NormalDistributionImpl", "getDomainLowerBound", "double", "1.0"}});
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("1.0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getMean=0.0, getStandardDeviation=1.0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput099() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.distribution.NormalDistributionImpl", "org.apache.commons.math.distribution.NormalDistributionImpl", "getStandardDeviation", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.math.distribution.NormalDistributionImpl", "setStandardDeviation", "double", "1.7976931348623158E307"}, {"org.apache.commons.math.distribution.NormalDistributionImpl", "getDomainLowerBound", "double", "1.7976931348623158E307"}});
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("1.7976931348623158E307", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getMean=0.0, getStandardDeviation=1.7976931348623158E307}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput100() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.distribution.NormalDistributionImpl", "org.apache.commons.math.distribution.NormalDistributionImpl", "cumulativeProbability", new String[]{"double"}, new String[]{"2.14738501934753024E18"}, false, 13, new String[][]{{"org.apache.commons.math.distribution.NormalDistributionImpl", "setMean", "double", "-4.0"}, {"org.apache.commons.math.distribution.NormalDistributionImpl", "cumulativeProbability", "double,double", "-930.0", "0.0"}});
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("1.0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getMean=-4.0, getStandardDeviation=1.0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput101() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.distribution.NormalDistributionImpl", "org.apache.commons.math.distribution.NormalDistributionImpl", "getInitialDomain", new String[]{"double"}, new String[]{"3.595386269724631E306"}, false);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("1.0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getMean=0.0, getStandardDeviation=1.0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput102() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.distribution.NormalDistributionImpl", "org.apache.commons.math.distribution.NormalDistributionImpl", "getInitialDomain", new String[]{"double"}, new String[]{"-3.595386269724631E306"}, false, 0, new String[][]{{"org.apache.commons.math.distribution.NormalDistributionImpl", "getDomainUpperBound", "double", "1.7976931348623157E308"}, {"org.apache.commons.math.distribution.NormalDistributionImpl", "getDomainUpperBound", "double", "1.7976931348623158E307"}, {"org.apache.commons.math.distribution.NormalDistributionImpl", "getDomainUpperBound", "double", "4.9E-324"}});
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("-1.0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getMean=0.0, getStandardDeviation=1.0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput103() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.distribution.NormalDistributionImpl", "org.apache.commons.math.distribution.NormalDistributionImpl", "getMean", new String[]{}, new String[]{}, false, 7, new String[][]{});
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("1.0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getMean=1.0, getStandardDeviation=Infinity}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput104() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.distribution.NormalDistributionImpl", "org.apache.commons.math.distribution.NormalDistributionImpl", "getMean", new String[]{}, new String[]{}, false, 3, new String[][]{{"org.apache.commons.math.distribution.NormalDistributionImpl", "setStandardDeviation", "double", "20.0"}});
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("0.0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getMean=0.0, getStandardDeviation=20.0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput105() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.distribution.NormalDistributionImpl", "org.apache.commons.math.distribution.NormalDistributionImpl", "getStandardDeviation", new String[]{}, new String[]{}, false, 1, new String[][]{{"org.apache.commons.math.distribution.NormalDistributionImpl", "setMean", "double", "-4.0"}});
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("1.0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getMean=-4.0, getStandardDeviation=1.0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput106() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.distribution.NormalDistributionImpl", "org.apache.commons.math.distribution.NormalDistributionImpl", "getStandardDeviation", new String[]{}, new String[]{}, false, 7, new String[][]{});
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("Infinity", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getMean=1.0, getStandardDeviation=Infinity}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput107() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math.distribution.NormalDistributionImpl", "org.apache.commons.math.distribution.NormalDistributionImpl", "setStandardDeviation", new String[]{"double"}, new String[]{"-3.595386269724632E307"}, false, 1, new String[][]{{"org.apache.commons.math.distribution.NormalDistributionImpl", "inverseCumulativeProbability", "double", "-8.988465674311579E307"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput108() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.distribution.NormalDistributionImpl", "org.apache.commons.math.distribution.NormalDistributionImpl", "getDomainLowerBound", new String[]{"double"}, new String[]{"1.0"}, false, 0, new String[][]{{"org.apache.commons.math.distribution.NormalDistributionImpl", "setMean", "double", "-4.0"}});
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("-4.0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getMean=-4.0, getStandardDeviation=1.0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput109() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.distribution.NormalDistributionImpl", "org.apache.commons.math.distribution.NormalDistributionImpl", "cumulativeProbability", new String[]{"double"}, new String[]{"-1.0"}, false, 11, new String[][]{});
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("0.15865525393145702", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getMean=0.0, getStandardDeviation=1.0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput110() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.distribution.NormalDistributionImpl", "org.apache.commons.math.distribution.NormalDistributionImpl", "cumulativeProbability", new String[]{"double"}, new String[]{"1.0"}, false, 11, new String[][]{});
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("0.841344746068543", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getMean=0.0, getStandardDeviation=1.0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput111() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.distribution.NormalDistributionImpl", "org.apache.commons.math.distribution.NormalDistributionImpl", "cumulativeProbability", new String[]{"double"}, new String[]{"1.72"}, false, 11, new String[][]{});
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("0.9572837792086711", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getMean=0.0, getStandardDeviation=1.0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput112() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.distribution.NormalDistributionImpl", "org.apache.commons.math.distribution.NormalDistributionImpl", "getMean", new String[]{}, new String[]{}, false, 14, new String[][]{{"org.apache.commons.math.distribution.NormalDistributionImpl", "setMean", "double", "20.0"}});
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("20.0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getMean=20.0, getStandardDeviation=1.0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput113() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.distribution.NormalDistributionImpl", "org.apache.commons.math.distribution.NormalDistributionImpl", "getMean", new String[]{}, new String[]{}, false, 14, new String[][]{{"org.apache.commons.math.distribution.NormalDistributionImpl", "setMean", "double", "200.0"}});
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("200.0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getMean=200.0, getStandardDeviation=1.0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput114() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.distribution.NormalDistributionImpl", "org.apache.commons.math.distribution.NormalDistributionImpl", "setMean", new String[]{"double"}, new String[]{"2.0"}, false, 0, new String[][]{{"org.apache.commons.math.distribution.NormalDistributionImpl", "getDomainUpperBound", "double", "8589540077390120676"}, {"org.apache.commons.math.distribution.NormalDistributionImpl", "getDomainLowerBound", "double", "-1.7976931348623157E308"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getMean=2.0, getStandardDeviation=1.0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput115() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.distribution.NormalDistributionImpl", "org.apache.commons.math.distribution.NormalDistributionImpl", "setMean", new String[]{"double"}, new String[]{"2.0000000000000004"}, false, 0, new String[][]{{"org.apache.commons.math.distribution.NormalDistributionImpl", "getDomainUpperBound", "double", "8589540077390120676"}, {"org.apache.commons.math.distribution.NormalDistributionImpl", "getDomainLowerBound", "double", "-1.7976931348623157E308"}, {"org.apache.commons.math.distribution.NormalDistributionImpl", "cumulativeProbability", "double", "3.595386269724631E305"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getMean=2.0000000000000004, getStandardDeviation=1.0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput116() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.distribution.NormalDistributionImpl", "org.apache.commons.math.distribution.NormalDistributionImpl", "setMean", new String[]{"double"}, new String[]{"4.000000000000001"}, false, 0, new String[][]{{"org.apache.commons.math.distribution.NormalDistributionImpl", "getDomainUpperBound", "double", "8589540077390120676"}, {"org.apache.commons.math.distribution.NormalDistributionImpl", "getDomainLowerBound", "double", "-93.0"}, {"org.apache.commons.math.distribution.NormalDistributionImpl", "cumulativeProbability", "double", "3.595386269724631E305"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getMean=4.000000000000001, getStandardDeviation=1.0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput117() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.distribution.NormalDistributionImpl", "org.apache.commons.math.distribution.NormalDistributionImpl", "getMean", new String[]{}, new String[]{}, false, 4, new String[][]{{"org.apache.commons.math.distribution.NormalDistributionImpl", "setMean", "double", "-1.0"}});
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("-1.0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getMean=-1.0, getStandardDeviation=1.0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput118() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.distribution.NormalDistributionImpl", "org.apache.commons.math.distribution.NormalDistributionImpl", "getMean", new String[]{}, new String[]{}, false, 5, new String[][]{{"org.apache.commons.math.distribution.NormalDistributionImpl", "setMean", "double", "-1.0"}, {"org.apache.commons.math.distribution.NormalDistributionImpl", "setMean", "double", "-Infinity"}});
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("-Infinity", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getMean=-Infinity, getStandardDeviation=1.0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput119() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.distribution.NormalDistributionImpl", "org.apache.commons.math.distribution.NormalDistributionImpl", "getMean", new String[]{}, new String[]{}, false, 7, new String[][]{{"org.apache.commons.math.distribution.NormalDistributionImpl", "setMean", "double", "-0.42999999999999994"}, {"org.apache.commons.math.distribution.NormalDistributionImpl", "setMean", "double", "-Infinity"}});
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("-Infinity", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getMean=-Infinity, getStandardDeviation=Infinity}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput120() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.distribution.NormalDistributionImpl", "org.apache.commons.math.distribution.NormalDistributionImpl", "getMean", new String[]{}, new String[]{}, false, 13, new String[][]{{"org.apache.commons.math.distribution.NormalDistributionImpl", "setMean", "double", "0.4769999999999999"}, {"org.apache.commons.math.distribution.NormalDistributionImpl", "getDomainLowerBound", "double", "Infinity"}});
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("0.4769999999999999", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getMean=0.4769999999999999, getStandardDeviation=1.0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput121() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.distribution.NormalDistributionImpl", "org.apache.commons.math.distribution.NormalDistributionImpl", "getDomainUpperBound", new String[]{"double"}, new String[]{"3.595386269724631E306"}, false);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("1.7976931348623157E308", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getMean=0.0, getStandardDeviation=1.0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput122() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.distribution.NormalDistributionImpl", "org.apache.commons.math.distribution.NormalDistributionImpl", "getDomainUpperBound", new String[]{"double"}, new String[]{"-4.0"}, false);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("0.0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getMean=0.0, getStandardDeviation=1.0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput123() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.distribution.NormalDistributionImpl", "org.apache.commons.math.distribution.NormalDistributionImpl", "getInitialDomain", new String[]{"double"}, new String[]{"-1.0"}, false, 7, new String[][]{});
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("-Infinity", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getMean=1.0, getStandardDeviation=Infinity}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput124() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.distribution.NormalDistributionImpl", "org.apache.commons.math.distribution.NormalDistributionImpl", "getInitialDomain", new String[]{"double"}, new String[]{"10.0"}, false, 7, new String[][]{{"org.apache.commons.math.distribution.NormalDistributionImpl", "getStandardDeviation", ""}, {"org.apache.commons.math.distribution.NormalDistributionImpl", "cumulativeProbability", "double,double", "1.7976931348623157E308", "Infinity"}});
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("Infinity", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getMean=1.0, getStandardDeviation=Infinity}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput125() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.distribution.NormalDistributionImpl", "org.apache.commons.math.distribution.NormalDistributionImpl", "inverseCumulativeProbability", new String[]{"double"}, new String[]{"0.5"}, false);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("0.0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getMean=0.0, getStandardDeviation=1.0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput126() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.distribution.NormalDistributionImpl", "org.apache.commons.math.distribution.NormalDistributionImpl", "inverseCumulativeProbability", new String[]{"double"}, new String[]{"0.25000000000000006"}, false);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("-0.6744897511292215", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getMean=0.0, getStandardDeviation=1.0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput127() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.distribution.NormalDistributionImpl", "org.apache.commons.math.distribution.NormalDistributionImpl", "inverseCumulativeProbability", new String[]{"double"}, new String[]{"0.12500000000000003"}, false);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("-1.150349407332872", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getMean=0.0, getStandardDeviation=1.0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput128() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.distribution.NormalDistributionImpl", "org.apache.commons.math.distribution.NormalDistributionImpl", "getInitialDomain", new String[]{"double"}, new String[]{"-Infinity"}, false, 0, new String[][]{{"org.apache.commons.math.distribution.NormalDistributionImpl", "setStandardDeviation", "double", "NaN"}, {"org.apache.commons.math.distribution.NormalDistributionImpl", "cumulativeProbability", "double", "8589540077390120676"}});
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("NaN", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getMean=0.0, getStandardDeviation=NaN}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput129() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.distribution.NormalDistributionImpl", "org.apache.commons.math.distribution.NormalDistributionImpl", "inverseCumulativeProbability", new String[]{"double"}, new String[]{"0.0"}, false, 7, new String[][]{{"org.apache.commons.math.distribution.NormalDistributionImpl", "setStandardDeviation", "double", "-Infinity"}, {"org.apache.commons.math.distribution.NormalDistributionImpl", "setStandardDeviation", "double", "3.595386269724631E306"}});
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("-Infinity", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getMean=1.0, getStandardDeviation=3.595386269724631E306}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput130() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.distribution.NormalDistributionImpl", "org.apache.commons.math.distribution.NormalDistributionImpl", "inverseCumulativeProbability", new String[]{"double"}, new String[]{"0.0"}, false, 12, new String[][]{{"org.apache.commons.math.distribution.NormalDistributionImpl", "setStandardDeviation", "double", "-Infinity"}, {"org.apache.commons.math.distribution.NormalDistributionImpl", "setStandardDeviation", "double", "3.595386269724631E306"}});
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("-Infinity", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getMean=0.0, getStandardDeviation=3.595386269724631E306}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput131() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.distribution.NormalDistributionImpl", "org.apache.commons.math.distribution.NormalDistributionImpl", "inverseCumulativeProbability", new String[]{"double"}, new String[]{"-0.0"}, false, 11, new String[][]{{"org.apache.commons.math.distribution.NormalDistributionImpl", "setStandardDeviation", "double", "1.7976931348623156E306"}});
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("-Infinity", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getMean=0.0, getStandardDeviation=1.7976931348623156E306}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput132() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.distribution.NormalDistributionImpl", "org.apache.commons.math.distribution.NormalDistributionImpl", "getStandardDeviation", new String[]{}, new String[]{}, false, 14, new String[][]{{"org.apache.commons.math.distribution.NormalDistributionImpl", "setStandardDeviation", "double", "0.5"}});
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("0.5", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getMean=0.0, getStandardDeviation=0.5}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput133() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.distribution.NormalDistributionImpl", "org.apache.commons.math.distribution.NormalDistributionImpl", "getStandardDeviation", new String[]{}, new String[]{}, false, 17, new String[][]{{"org.apache.commons.math.distribution.NormalDistributionImpl", "setStandardDeviation", "double", "0.0"}, {"org.apache.commons.math.distribution.NormalDistributionImpl", "setStandardDeviation", "double", "0.5"}});
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("0.5", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getMean=1.0, getStandardDeviation=0.5}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput134() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.distribution.NormalDistributionImpl", "org.apache.commons.math.distribution.NormalDistributionImpl", "getMean", new String[]{}, new String[]{}, false, 4, new String[][]{{"org.apache.commons.math.distribution.NormalDistributionImpl", "setMean", "double", "-8.988465674311579E307"}});
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("-8.988465674311579E307", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getMean=-8.988465674311579E307, getStandardDeviation=1.0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput135() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.distribution.NormalDistributionImpl", "org.apache.commons.math.distribution.NormalDistributionImpl", "inverseCumulativeProbability", new String[]{"double"}, new String[]{"0.5499999999999998"}, false, 10, new String[][]{});
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("0.12566134689424704", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getMean=0.0, getStandardDeviation=1.0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput136() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.distribution.NormalDistributionImpl", "org.apache.commons.math.distribution.NormalDistributionImpl", "getStandardDeviation", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.math.distribution.NormalDistributionImpl", "setMean", "double", "0.5"}});
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("1.0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getMean=0.5, getStandardDeviation=1.0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput137() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.distribution.NormalDistributionImpl", "org.apache.commons.math.distribution.NormalDistributionImpl", "getStandardDeviation", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.math.distribution.NormalDistributionImpl", "setMean", "double", "0.49999999999999994"}});
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("1.0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getMean=0.49999999999999994, getStandardDeviation=1.0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput138() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.distribution.NormalDistributionImpl", "org.apache.commons.math.distribution.NormalDistributionImpl", "setStandardDeviation", new String[]{"double"}, new String[]{"1.7976931348623158E307"}, false, 0, new String[][]{{"org.apache.commons.math.distribution.NormalDistributionImpl", "getStandardDeviation", ""}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getMean=0.0, getStandardDeviation=1.7976931348623158E307}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput139() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.distribution.NormalDistributionImpl", "org.apache.commons.math.distribution.NormalDistributionImpl", "setStandardDeviation", new String[]{"double"}, new String[]{"1.7976931348623155E308"}, false, 0, new String[][]{{"org.apache.commons.math.distribution.NormalDistributionImpl", "getMean", ""}, {"org.apache.commons.math.distribution.NormalDistributionImpl", "getStandardDeviation", ""}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getMean=0.0, getStandardDeviation=1.7976931348623155E308}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput140() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.distribution.NormalDistributionImpl", "org.apache.commons.math.distribution.NormalDistributionImpl", "setStandardDeviation", new String[]{"double"}, new String[]{"8.988465674311578E307"}, false, 0, new String[][]{{"org.apache.commons.math.distribution.NormalDistributionImpl", "getMean", ""}, {"org.apache.commons.math.distribution.NormalDistributionImpl", "getStandardDeviation", ""}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getMean=0.0, getStandardDeviation=8.988465674311578E307}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput141() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.distribution.NormalDistributionImpl", "org.apache.commons.math.distribution.NormalDistributionImpl", "cumulativeProbability", new String[]{"double"}, new String[]{"-46.24"}, false, 0, new String[][]{{"org.apache.commons.math.distribution.NormalDistributionImpl", "setMean", "double", "-1.0"}, {"org.apache.commons.math.distribution.NormalDistributionImpl", "getDomainLowerBound", "double", "1.7976931348623157E308"}});
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("0.0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getMean=-1.0, getStandardDeviation=1.0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput142() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.distribution.NormalDistributionImpl", "org.apache.commons.math.distribution.NormalDistributionImpl", "cumulativeProbability", new String[]{"double"}, new String[]{"-9.248000000000001"}, false, 0, new String[][]{{"org.apache.commons.math.distribution.NormalDistributionImpl", "setMean", "double", "-Infinity"}, {"org.apache.commons.math.distribution.NormalDistributionImpl", "getDomainLowerBound", "double", "-Infinity"}});
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("1.0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getMean=-Infinity, getStandardDeviation=1.0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput143() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.distribution.NormalDistributionImpl", "org.apache.commons.math.distribution.NormalDistributionImpl", "setStandardDeviation", new String[]{"double"}, new String[]{"10.45"}, false, 2, new String[][]{{"org.apache.commons.math.distribution.NormalDistributionImpl", "getStandardDeviation", ""}, {"org.apache.commons.math.distribution.NormalDistributionImpl", "getInitialDomain", "double", "-3.595386269724632E307"}, {"org.apache.commons.math.distribution.NormalDistributionImpl", "getStandardDeviation", ""}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getMean=0.0, getStandardDeviation=10.45}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput144() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.distribution.NormalDistributionImpl", "org.apache.commons.math.distribution.NormalDistributionImpl", "setStandardDeviation", new String[]{"double"}, new String[]{"209.0"}, false, 2, new String[][]{{"org.apache.commons.math.distribution.NormalDistributionImpl", "getStandardDeviation", ""}, {"org.apache.commons.math.distribution.NormalDistributionImpl", "getInitialDomain", "double", "-3.595386269724632E307"}, {"org.apache.commons.math.distribution.NormalDistributionImpl", "getStandardDeviation", ""}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getMean=0.0, getStandardDeviation=209.0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput145() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.distribution.NormalDistributionImpl", "org.apache.commons.math.distribution.NormalDistributionImpl", "cumulativeProbability", new String[]{"double"}, new String[]{"1.0"}, false, 0, new String[][]{{"org.apache.commons.math.distribution.NormalDistributionImpl", "cumulativeProbability", "double", "3.595386269724631E306"}, {"org.apache.commons.math.distribution.NormalDistributionImpl", "setMean", "double", "1.0"}});
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("0.5", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getMean=1.0, getStandardDeviation=1.0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput146() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.distribution.NormalDistributionImpl", "org.apache.commons.math.distribution.NormalDistributionImpl", "cumulativeProbability", new String[]{"double", "double"}, new String[]{"-8.988465674311579E307", "3.595386269724631E306"}, false, 0, new String[][]{{"org.apache.commons.math.distribution.NormalDistributionImpl", "cumulativeProbability", "double", "0.0"}});
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("1.0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getMean=0.0, getStandardDeviation=1.0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput147() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.distribution.NormalDistributionImpl", "org.apache.commons.math.distribution.NormalDistributionImpl", "getInitialDomain", new String[]{"double"}, new String[]{"-1.1"}, false, 0, new String[][]{{"org.apache.commons.math.distribution.NormalDistributionImpl", "cumulativeProbability", "double", "1.7976931348623158E307"}, {"org.apache.commons.math.distribution.NormalDistributionImpl", "setMean", "double", "2.0"}});
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("1.0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getMean=2.0, getStandardDeviation=1.0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput148() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.distribution.NormalDistributionImpl", "org.apache.commons.math.distribution.NormalDistributionImpl", "getInitialDomain", new String[]{"double"}, new String[]{"0.5"}, false, 0, new String[][]{{"org.apache.commons.math.distribution.NormalDistributionImpl", "inverseCumulativeProbability", "double", "-17.374999999999996"}});
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("0.0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getMean=0.0, getStandardDeviation=1.0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput149() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.distribution.NormalDistributionImpl", "org.apache.commons.math.distribution.NormalDistributionImpl", "setStandardDeviation", new String[]{"double"}, new String[]{"2.14738501934753024E18"}, false, 2, new String[][]{}, 2);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getMean=0.0, getStandardDeviation=2.14738501934753024E18}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput150() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.distribution.NormalDistributionImpl", "org.apache.commons.math.distribution.NormalDistributionImpl", "setStandardDeviation", new String[]{"double"}, new String[]{"2.14738501934753024E17"}, false, 2, new String[][]{}, 2);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getMean=0.0, getStandardDeviation=2.14738501934753024E17}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput151() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.distribution.NormalDistributionImpl", "org.apache.commons.math.distribution.NormalDistributionImpl", "setStandardDeviation", new String[]{"double"}, new String[]{"2.14738501934752992E17"}, false, 2, new String[][]{}, 2);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getMean=0.0, getStandardDeviation=2.14738501934752992E17}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput152() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.distribution.NormalDistributionImpl", "org.apache.commons.math.distribution.NormalDistributionImpl", "setStandardDeviation", new String[]{"double"}, new String[]{"1.7976931348623158E307"}, false, 2, new String[][]{}, 2);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getMean=0.0, getStandardDeviation=1.7976931348623158E307}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput153() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.distribution.NormalDistributionImpl", "org.apache.commons.math.distribution.NormalDistributionImpl", "getMean", new String[]{}, new String[]{}, false, 23, new String[][]{{"org.apache.commons.math.distribution.NormalDistributionImpl", "cumulativeProbability", "double", "1.7976931348623157E308"}, {"org.apache.commons.math.distribution.NormalDistributionImpl", "cumulativeProbability", "double,double", "NaN", "8.589540077390121E18"}, {"org.apache.commons.math.distribution.NormalDistributionImpl", "cumulativeProbability", "double,double", "4.2947700386950605E18", "NaN"}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("0.0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getMean=0.0, getStandardDeviation=1.0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput154() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.distribution.NormalDistributionImpl", "org.apache.commons.math.distribution.NormalDistributionImpl", "getInitialDomain", new String[]{"double"}, new String[]{"-8.988465674311579E307"}, false, 3, new String[][]{{"org.apache.commons.math.distribution.NormalDistributionImpl", "setStandardDeviation", "double", "0.5"}});
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("-0.5", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getMean=0.0, getStandardDeviation=0.5}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput155() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.distribution.NormalDistributionImpl", "org.apache.commons.math.distribution.NormalDistributionImpl", "getMean", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.math.distribution.NormalDistributionImpl", "setStandardDeviation", "double", "Infinity"}});
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("0.0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getMean=0.0, getStandardDeviation=Infinity}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput156() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.distribution.NormalDistributionImpl", "org.apache.commons.math.distribution.NormalDistributionImpl", "getMean", new String[]{}, new String[]{}, false, 4, new String[][]{{"org.apache.commons.math.distribution.NormalDistributionImpl", "setStandardDeviation", "double", "Infinity"}, {"org.apache.commons.math.distribution.NormalDistributionImpl", "setMean", "double", "-8.988465674311579E307"}});
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("-8.988465674311579E307", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getMean=-8.988465674311579E307, getStandardDeviation=Infinity}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput157() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.distribution.NormalDistributionImpl", "org.apache.commons.math.distribution.NormalDistributionImpl", "getMean", new String[]{}, new String[]{}, false, 9, new String[][]{{"org.apache.commons.math.distribution.NormalDistributionImpl", "setStandardDeviation", "double", "Infinity"}, {"org.apache.commons.math.distribution.NormalDistributionImpl", "setMean", "double", "8.988465674311579E307"}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("8.988465674311579E307", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getMean=8.988465674311579E307, getStandardDeviation=Infinity}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput158() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.distribution.NormalDistributionImpl", "org.apache.commons.math.distribution.NormalDistributionImpl", "getMean", new String[]{}, new String[]{}, false, 9, new String[][]{{"org.apache.commons.math.distribution.NormalDistributionImpl", "setStandardDeviation", "double", "Infinity"}, {"org.apache.commons.math.distribution.NormalDistributionImpl", "setMean", "double", "1.7976931348623157E308"}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("1.7976931348623157E308", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getMean=1.7976931348623157E308, getStandardDeviation=Infinity}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput159() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.distribution.NormalDistributionImpl", "org.apache.commons.math.distribution.NormalDistributionImpl", "cumulativeProbability", new String[]{"double", "double"}, new String[]{"NaN", "-8.988465674311579E307"}, false);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("NaN", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getMean=0.0, getStandardDeviation=1.0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput160() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.distribution.NormalDistributionImpl", "org.apache.commons.math.distribution.NormalDistributionImpl", "cumulativeProbability", new String[]{"double", "double"}, new String[]{"NaN", "-8.988465674311579E307"}, false, 0, new String[][]{{"org.apache.commons.math.distribution.NormalDistributionImpl", "setMean", "double", "8589540077390120676"}});
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("NaN", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getMean=8.589540077390121E18, getStandardDeviation=1.0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput161() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.distribution.NormalDistributionImpl", "org.apache.commons.math.distribution.NormalDistributionImpl", "getStandardDeviation", new String[]{}, new String[]{}, false, 8, new String[][]{{"org.apache.commons.math.distribution.NormalDistributionImpl", "setMean", "double", "-0.9999999999999999"}, {"org.apache.commons.math.distribution.NormalDistributionImpl", "setStandardDeviation", "double", "4.9E-324"}, {"org.apache.commons.math.distribution.NormalDistributionImpl", "getInitialDomain", "double", "8589540077390120676"}});
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("4.9E-324", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getMean=-0.9999999999999999, getStandardDeviation=4.9E-324}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput162() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.distribution.NormalDistributionImpl", "org.apache.commons.math.distribution.NormalDistributionImpl", "setStandardDeviation", new String[]{"double"}, new String[]{"0.5"}, false, 0, null, 3);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getMean=0.0, getStandardDeviation=0.5}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput163() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.distribution.NormalDistributionImpl", "org.apache.commons.math.distribution.NormalDistributionImpl", "setStandardDeviation", new String[]{"double"}, new String[]{"0.5000000000000001"}, false, 0, new String[][]{{"org.apache.commons.math.distribution.NormalDistributionImpl", "getMean", ""}}, 3);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getMean=0.0, getStandardDeviation=0.5000000000000001}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput164() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.distribution.NormalDistributionImpl", "org.apache.commons.math.distribution.NormalDistributionImpl", "getDomainLowerBound", new String[]{"double"}, new String[]{"Infinity"}, false, 6, new String[][]{{"org.apache.commons.math.distribution.NormalDistributionImpl", "setStandardDeviation", "double", "1.7976931348623158E307"}, {"org.apache.commons.math.distribution.NormalDistributionImpl", "getStandardDeviation", ""}, {"org.apache.commons.math.distribution.NormalDistributionImpl", "cumulativeProbability", "double,double", "-93.0", "-8.988465674311579E307"}});
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("0.0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getMean=0.0, getStandardDeviation=1.7976931348623158E307}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput165() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.distribution.NormalDistributionImpl", "org.apache.commons.math.distribution.NormalDistributionImpl", "getDomainLowerBound", new String[]{"double"}, new String[]{"1.7976931348623157E308"}, false, 10, new String[][]{{"org.apache.commons.math.distribution.NormalDistributionImpl", "setStandardDeviation", "double", "8.988465674311579E306"}, {"org.apache.commons.math.distribution.NormalDistributionImpl", "getStandardDeviation", ""}, {"org.apache.commons.math.distribution.NormalDistributionImpl", "cumulativeProbability", "double,double", "-93.0", "-8.988465674311579E307"}});
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("0.0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getMean=0.0, getStandardDeviation=8.988465674311579E306}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput166() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.distribution.NormalDistributionImpl", "org.apache.commons.math.distribution.NormalDistributionImpl", "getDomainLowerBound", new String[]{"double"}, new String[]{"2.725000000000001"}, false, 9, new String[][]{{"org.apache.commons.math.distribution.NormalDistributionImpl", "getDomainUpperBound", "double", "-93.0"}, {"org.apache.commons.math.distribution.NormalDistributionImpl", "getStandardDeviation", ""}, {"org.apache.commons.math.distribution.NormalDistributionImpl", "setMean", "double", "1.7976931348623157E308"}});
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("1.7976931348623157E308", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getMean=1.7976931348623157E308, getStandardDeviation=1.0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput167() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.distribution.NormalDistributionImpl", "org.apache.commons.math.distribution.NormalDistributionImpl", "getDomainUpperBound", new String[]{"double"}, new String[]{"-8.988465674311579E307"}, false, 0, new String[][]{{"org.apache.commons.math.distribution.NormalDistributionImpl", "setStandardDeviation", "double", "0.5"}});
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("0.0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getMean=0.0, getStandardDeviation=0.5}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput168() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.distribution.NormalDistributionImpl", "org.apache.commons.math.distribution.NormalDistributionImpl", "getDomainUpperBound", new String[]{"double"}, new String[]{"-3.595386269724632E307"}, false, 7, new String[][]{{"org.apache.commons.math.distribution.NormalDistributionImpl", "getMean", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("1.0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getMean=1.0, getStandardDeviation=Infinity}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput169() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.distribution.NormalDistributionImpl", "org.apache.commons.math.distribution.NormalDistributionImpl", "getDomainUpperBound", new String[]{"double"}, new String[]{"-8.988465674311579E307"}, false, 0, new String[][]{{"org.apache.commons.math.distribution.NormalDistributionImpl", "getDomainLowerBound", "double", "4.2947700386950605E18"}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("0.0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getMean=0.0, getStandardDeviation=1.0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput170() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.distribution.NormalDistributionImpl", "org.apache.commons.math.distribution.NormalDistributionImpl", "cumulativeProbability", new String[]{"double"}, new String[]{"1.7976931348623157E308"}, false, 0, null, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("1.0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getMean=0.0, getStandardDeviation=1.0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput171() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.distribution.NormalDistributionImpl", "org.apache.commons.math.distribution.NormalDistributionImpl", "cumulativeProbability", new String[]{"double"}, new String[]{"-3.595386269724632E307"}, false, 0, null, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("0.0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getMean=0.0, getStandardDeviation=1.0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput172() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.distribution.NormalDistributionImpl", "org.apache.commons.math.distribution.NormalDistributionImpl", "cumulativeProbability", new String[]{"double"}, new String[]{"-7.190772539449264E307"}, false, 0, new String[][]{{"org.apache.commons.math.distribution.NormalDistributionImpl", "setMean", "double", "20.0"}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("0.0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getMean=20.0, getStandardDeviation=1.0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput173() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.distribution.NormalDistributionImpl", "org.apache.commons.math.distribution.NormalDistributionImpl", "cumulativeProbability", new String[]{"double"}, new String[]{"-1.1"}, false, 0, null, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("0.13566606094638273", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getMean=0.0, getStandardDeviation=1.0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput174() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.distribution.NormalDistributionImpl", "org.apache.commons.math.distribution.NormalDistributionImpl", "getDomainUpperBound", new String[]{"double"}, new String[]{"-8.988465674311579E307"}, false, 1, new String[][]{{"org.apache.commons.math.distribution.NormalDistributionImpl", "getInitialDomain", "double", "NaN"}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("0.0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getMean=0.0, getStandardDeviation=1.0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput175() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.distribution.NormalDistributionImpl", "org.apache.commons.math.distribution.NormalDistributionImpl", "getInitialDomain", new String[]{"double"}, new String[]{"0.49999999999999994"}, false, 10, new String[][]{{"org.apache.commons.math.distribution.NormalDistributionImpl", "setMean", "double", "-1.1"}});
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("-2.1", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getMean=-1.1, getStandardDeviation=1.0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput176() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.distribution.NormalDistributionImpl", "org.apache.commons.math.distribution.NormalDistributionImpl", "getInitialDomain", new String[]{"double"}, new String[]{"-1.5000000000000004"}, false, 10, new String[][]{{"org.apache.commons.math.distribution.NormalDistributionImpl", "setMean", "double", "-1.1"}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("-2.1", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getMean=-1.1, getStandardDeviation=1.0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput177() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.distribution.NormalDistributionImpl", "org.apache.commons.math.distribution.NormalDistributionImpl", "getInitialDomain", new String[]{"double"}, new String[]{"Infinity"}, false, 10, new String[][]{{"org.apache.commons.math.distribution.NormalDistributionImpl", "setMean", "double", "-1.1"}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("-0.10000000000000009", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getMean=-1.1, getStandardDeviation=1.0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput178() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.distribution.NormalDistributionImpl", "org.apache.commons.math.distribution.NormalDistributionImpl", "getDomainLowerBound", new String[]{"double"}, new String[]{"1.7976931348623155E308"}, false, 0, new String[][]{{"org.apache.commons.math.distribution.NormalDistributionImpl", "getDomainLowerBound", "double", "-3.595386269724632E307"}, {"org.apache.commons.math.distribution.NormalDistributionImpl", "setStandardDeviation", "double", "0.5"}, {"org.apache.commons.math.distribution.NormalDistributionImpl", "getStandardDeviation", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("0.0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getMean=0.0, getStandardDeviation=0.5}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput179() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.distribution.NormalDistributionImpl", "org.apache.commons.math.distribution.NormalDistributionImpl", "getDomainLowerBound", new String[]{"double"}, new String[]{"8.988465674311578E307"}, false, 0, new String[][]{{"org.apache.commons.math.distribution.NormalDistributionImpl", "getDomainLowerBound", "double", "-3.595386269724632E307"}, {"org.apache.commons.math.distribution.NormalDistributionImpl", "setStandardDeviation", "double", "0.25"}, {"org.apache.commons.math.distribution.NormalDistributionImpl", "getStandardDeviation", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("0.0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getMean=0.0, getStandardDeviation=0.25}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput180() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.distribution.NormalDistributionImpl", "org.apache.commons.math.distribution.NormalDistributionImpl", "cumulativeProbability", new String[]{"double"}, new String[]{"4.01"}, false, 6, new String[][]{{"org.apache.commons.math.distribution.NormalDistributionImpl", "getStandardDeviation", ""}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("0.9999696406260737", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getMean=0.0, getStandardDeviation=1.0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput181() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.distribution.NormalDistributionImpl", "org.apache.commons.math.distribution.NormalDistributionImpl", "cumulativeProbability", new String[]{"double"}, new String[]{"4.01"}, false, 7, new String[][]{{"org.apache.commons.math.distribution.NormalDistributionImpl", "getStandardDeviation", ""}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("0.5", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getMean=1.0, getStandardDeviation=Infinity}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput182() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.distribution.NormalDistributionImpl", "org.apache.commons.math.distribution.NormalDistributionImpl", "inverseCumulativeProbability", new String[]{"double"}, new String[]{"NaN"}, false, 0, null, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("0.9999995", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getMean=0.0, getStandardDeviation=1.0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput183() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.distribution.NormalDistributionImpl", "org.apache.commons.math.distribution.NormalDistributionImpl", "inverseCumulativeProbability", new String[]{"double"}, new String[]{"NaN"}, false);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("0.9999995", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getMean=0.0, getStandardDeviation=1.0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput184() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.distribution.NormalDistributionImpl", "org.apache.commons.math.distribution.NormalDistributionImpl", "inverseCumulativeProbability", new String[]{"double"}, new String[]{"NaN"}, false, 9, new String[][]{{"org.apache.commons.math.distribution.NormalDistributionImpl", "inverseCumulativeProbability", "double", "4.2947700386950605E18"}, {"org.apache.commons.math.distribution.NormalDistributionImpl", "setMean", "double", "0.0"}, {"org.apache.commons.math.distribution.NormalDistributionImpl", "setMean", "double", "0.5"}});
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("1.4999995", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getMean=0.5, getStandardDeviation=1.0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput185() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.distribution.NormalDistributionImpl", "org.apache.commons.math.distribution.NormalDistributionImpl", "inverseCumulativeProbability", new String[]{"double"}, new String[]{"NaN"}, false, 9, new String[][]{{"org.apache.commons.math.distribution.NormalDistributionImpl", "inverseCumulativeProbability", "double", "4.2947700386950605E18"}, {"org.apache.commons.math.distribution.NormalDistributionImpl", "setMean", "double", "0.0"}, {"org.apache.commons.math.distribution.NormalDistributionImpl", "setMean", "double", "0.25"}});
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("1.2499995", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getMean=0.25, getStandardDeviation=1.0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput186() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.distribution.NormalDistributionImpl", "org.apache.commons.math.distribution.NormalDistributionImpl", "getStandardDeviation", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.math.distribution.NormalDistributionImpl", "setStandardDeviation", "double", "8589540077390120676"}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("8.589540077390121E18", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getMean=0.0, getStandardDeviation=8.589540077390121E18}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput187() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.distribution.NormalDistributionImpl", "org.apache.commons.math.distribution.NormalDistributionImpl", "getStandardDeviation", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.math.distribution.NormalDistributionImpl", "setStandardDeviation", "double", "8.589540077390122E18"}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("8.589540077390122E18", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getMean=0.0, getStandardDeviation=8.589540077390122E18}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput188() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.distribution.NormalDistributionImpl", "org.apache.commons.math.distribution.NormalDistributionImpl", "cumulativeProbability", new String[]{"double"}, new String[]{"0.5"}, false, 0, new String[][]{{"org.apache.commons.math.distribution.NormalDistributionImpl", "setStandardDeviation", "double", "0.0"}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("0.691462461274013", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getMean=0.0, getStandardDeviation=1.0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput189() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.distribution.NormalDistributionImpl", "org.apache.commons.math.distribution.NormalDistributionImpl", "cumulativeProbability", new String[]{"double"}, new String[]{"0.25"}, false, 0, null, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("0.5987063256829237", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getMean=0.0, getStandardDeviation=1.0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput190() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.distribution.NormalDistributionImpl", "org.apache.commons.math.distribution.NormalDistributionImpl", "cumulativeProbability", new String[]{"double"}, new String[]{"0.125"}, false, 4, new String[][]{}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("0.5497382248301129", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getMean=0.0, getStandardDeviation=1.0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput191() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.distribution.NormalDistributionImpl", "org.apache.commons.math.distribution.NormalDistributionImpl", "getDomainUpperBound", new String[]{"double"}, new String[]{"Infinity"}, false, 0, null, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("1.7976931348623157E308", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getMean=0.0, getStandardDeviation=1.0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput192() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.distribution.NormalDistributionImpl", "org.apache.commons.math.distribution.NormalDistributionImpl", "getStandardDeviation", new String[]{}, new String[]{}, false, 25, new String[][]{{"org.apache.commons.math.distribution.NormalDistributionImpl", "cumulativeProbability", "double", "-4.0"}, {"org.apache.commons.math.distribution.NormalDistributionImpl", "setMean", "double", "NaN"}, {"org.apache.commons.math.distribution.NormalDistributionImpl", "cumulativeProbability", "double", "8.5895400773901199E18"}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("1.0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getMean=NaN, getStandardDeviation=1.0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput193() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math.distribution.NormalDistributionImpl", "org.apache.commons.math.distribution.NormalDistributionImpl", "cumulativeProbability", new String[]{"double", "double"}, new String[]{"8589540077390120676", "-0.4"}, false, 0, null, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput194() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.distribution.NormalDistributionImpl", "org.apache.commons.math.distribution.NormalDistributionImpl", "getMean", new String[]{}, new String[]{}, false, 15, new String[][]{{"org.apache.commons.math.distribution.NormalDistributionImpl", "setMean", "double", "NaN"}, {"org.apache.commons.math.distribution.NormalDistributionImpl", "inverseCumulativeProbability", "double", "2.0"}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("NaN", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getMean=NaN, getStandardDeviation=1.0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput195() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.distribution.NormalDistributionImpl", "org.apache.commons.math.distribution.NormalDistributionImpl", "cumulativeProbability", new String[]{"double"}, new String[]{"-1.7976931348623157E308"}, false, 0, new String[][]{{"org.apache.commons.math.distribution.NormalDistributionImpl", "setStandardDeviation", "double", "3.595386269724631E306"}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("0.0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getMean=0.0, getStandardDeviation=3.595386269724631E306}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput196() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.distribution.NormalDistributionImpl", "org.apache.commons.math.distribution.NormalDistributionImpl", "cumulativeProbability", new String[]{"double"}, new String[]{"-1.7976931348623155E308"}, false, 0, new String[][]{{"org.apache.commons.math.distribution.NormalDistributionImpl", "setStandardDeviation", "double", "20.0"}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("0.0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getMean=0.0, getStandardDeviation=20.0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput197() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.distribution.NormalDistributionImpl", "org.apache.commons.math.distribution.NormalDistributionImpl", "cumulativeProbability", new String[]{"double", "double"}, new String[]{"3.595386269724631E306", "Infinity"}, false);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("0.0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getMean=0.0, getStandardDeviation=1.0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput198() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.distribution.NormalDistributionImpl", "org.apache.commons.math.distribution.NormalDistributionImpl", "cumulativeProbability", new String[]{"double"}, new String[]{"0.0"}, false, 1, new String[][]{{"org.apache.commons.math.distribution.NormalDistributionImpl", "getInitialDomain", "double", "-4.0"}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("0.5", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getMean=0.0, getStandardDeviation=1.0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput199() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.distribution.NormalDistributionImpl", "org.apache.commons.math.distribution.NormalDistributionImpl", "cumulativeProbability", new String[]{"double"}, new String[]{"0.0"}, false, 7, new String[][]{{"org.apache.commons.math.distribution.NormalDistributionImpl", "getInitialDomain", "double", "-4.0"}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("0.5", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getMean=1.0, getStandardDeviation=Infinity}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput200() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.distribution.NormalDistributionImpl", "org.apache.commons.math.distribution.NormalDistributionImpl", "cumulativeProbability", new String[]{"double", "double"}, new String[]{"7.949999999999999", "NaN"}, false, 0, new String[][]{{"org.apache.commons.math.distribution.NormalDistributionImpl", "getDomainUpperBound", "double", "1.7976931348623158E307"}, {"org.apache.commons.math.distribution.NormalDistributionImpl", "cumulativeProbability", "double", "-3.595386269724632E307"}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("NaN", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getMean=0.0, getStandardDeviation=1.0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput201() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.distribution.NormalDistributionImpl", "org.apache.commons.math.distribution.NormalDistributionImpl", "getDomainLowerBound", new String[]{"double"}, new String[]{"-1.7976931348623157E308"}, false, 0, new String[][]{{"org.apache.commons.math.distribution.NormalDistributionImpl", "setStandardDeviation", "double", "3.595386269724631E306"}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("-1.7976931348623157E308", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getMean=0.0, getStandardDeviation=3.595386269724631E306}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput202() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.distribution.NormalDistributionImpl", "org.apache.commons.math.distribution.NormalDistributionImpl", "cumulativeProbability", new String[]{"double", "double"}, new String[]{"0.5", "1.7976931348623157E308"}, false);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("0.308537538725987", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getMean=0.0, getStandardDeviation=1.0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput203() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.distribution.NormalDistributionImpl", "org.apache.commons.math.distribution.NormalDistributionImpl", "getDomainUpperBound", new String[]{"double"}, new String[]{"20.0"}, false, 0, null, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("1.7976931348623157E308", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getMean=0.0, getStandardDeviation=1.0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput204() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.distribution.NormalDistributionImpl", "org.apache.commons.math.distribution.NormalDistributionImpl", "cumulativeProbability", new String[]{"double", "double"}, new String[]{"-1.7976931348623157E308", "8589540077390120676"}, false, 0, null, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("1.0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getMean=0.0, getStandardDeviation=1.0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput205() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math.distribution.NormalDistributionImpl", "org.apache.commons.math.distribution.NormalDistributionImpl", "cumulativeProbability", new String[]{"double", "double"}, new String[]{"1.7976931348623157E308", "8589540077390120676"}, false, 0, null, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput206() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.distribution.NormalDistributionImpl", "org.apache.commons.math.distribution.NormalDistributionImpl", "cumulativeProbability", new String[]{"double"}, new String[]{"-0.09999999999999999"}, false, 0, null, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("0.460172162722971", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getMean=0.0, getStandardDeviation=1.0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput207() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.distribution.NormalDistributionImpl", "org.apache.commons.math.distribution.NormalDistributionImpl", "cumulativeProbability", new String[]{"double"}, new String[]{"-0.049999999999999996"}, false, 0, null, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("0.48006119416162757", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getMean=0.0, getStandardDeviation=1.0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput208() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.distribution.NormalDistributionImpl", "org.apache.commons.math.distribution.NormalDistributionImpl", "setMean", new String[]{"double"}, new String[]{"2.0"}, false, 0, null, 1);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getMean=2.0, getStandardDeviation=1.0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput209() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.distribution.NormalDistributionImpl", "org.apache.commons.math.distribution.NormalDistributionImpl", "cumulativeProbability", new String[]{"double", "double"}, new String[]{"-Infinity", "0.0"}, false);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("0.5", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getMean=0.0, getStandardDeviation=1.0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput210() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.distribution.NormalDistributionImpl", "org.apache.commons.math.distribution.NormalDistributionImpl", "cumulativeProbability", new String[]{"double", "double"}, new String[]{"-Infinity", "0.0"}, false, 0, null, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("0.5", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getMean=0.0, getStandardDeviation=1.0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput211() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.distribution.NormalDistributionImpl", "org.apache.commons.math.distribution.NormalDistributionImpl", "cumulativeProbability", new String[]{"double", "double"}, new String[]{"-Infinity", "-1.0"}, false, 0, null, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("0.15865525393145702", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getMean=0.0, getStandardDeviation=1.0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput212() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.distribution.NormalDistributionImpl", "org.apache.commons.math.distribution.NormalDistributionImpl", "cumulativeProbability", new String[]{"double", "double"}, new String[]{"-Infinity", "-1.028"}, false, 0, null, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("0.1519749138452373", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getMean=0.0, getStandardDeviation=1.0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput213() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.distribution.NormalDistributionImpl", "org.apache.commons.math.distribution.NormalDistributionImpl", "cumulativeProbability", new String[]{"double", "double"}, new String[]{"-Infinity", "1.028"}, false, 0, null, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("0.8480250861547627", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getMean=0.0, getStandardDeviation=1.0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput214() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.distribution.NormalDistributionImpl", "org.apache.commons.math.distribution.NormalDistributionImpl", "cumulativeProbability", new String[]{"double", "double"}, new String[]{"-Infinity", "2.0"}, false, 0, null, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("0.9772498680518209", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getMean=0.0, getStandardDeviation=1.0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput215() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.distribution.NormalDistributionImpl", "org.apache.commons.math.distribution.NormalDistributionImpl", "cumulativeProbability", new String[]{"double", "double"}, new String[]{"-Infinity", "2.0"}, false, 0, new String[][]{{"org.apache.commons.math.distribution.NormalDistributionImpl", "setStandardDeviation", "double", "8589540077390120676"}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("0.5", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getMean=0.0, getStandardDeviation=8.589540077390121E18}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput216() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.distribution.NormalDistributionImpl", "org.apache.commons.math.distribution.NormalDistributionImpl", "cumulativeProbability", new String[]{"double", "double"}, new String[]{"-Infinity", "2.0"}, false, 0, new String[][]{{"org.apache.commons.math.distribution.NormalDistributionImpl", "setStandardDeviation", "double", "20.0"}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("0.539827837277029", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getMean=0.0, getStandardDeviation=20.0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput217() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.distribution.NormalDistributionImpl", "org.apache.commons.math.distribution.NormalDistributionImpl", "cumulativeProbability", new String[]{"double", "double"}, new String[]{"-Infinity", "2.0"}, false, 0, new String[][]{{"org.apache.commons.math.distribution.NormalDistributionImpl", "setStandardDeviation", "double", "10.0"}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("0.579259709439103", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getMean=0.0, getStandardDeviation=10.0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput218() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.distribution.NormalDistributionImpl", "org.apache.commons.math.distribution.NormalDistributionImpl", "cumulativeProbability", new String[]{"double", "double"}, new String[]{"-Infinity", "2.0"}, false, 0, new String[][]{{"org.apache.commons.math.distribution.NormalDistributionImpl", "setStandardDeviation", "double", "-10.0"}});
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("0.9772498680518209", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getMean=0.0, getStandardDeviation=1.0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput219() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.distribution.NormalDistributionImpl", "org.apache.commons.math.distribution.NormalDistributionImpl", "getDomainUpperBound", new String[]{"double"}, new String[]{"-8.0"}, false, 1, new String[][]{{"org.apache.commons.math.distribution.NormalDistributionImpl", "cumulativeProbability", "double", "5.0"}, {"org.apache.commons.math.distribution.NormalDistributionImpl", "setMean", "double", "-93.0"}});
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("-93.0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getMean=-93.0, getStandardDeviation=1.0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput220() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.distribution.NormalDistributionImpl", "org.apache.commons.math.distribution.NormalDistributionImpl", "cumulativeProbability", new String[]{"double", "double"}, new String[]{"-1.7976931348623157E308", "-3.595386269724632E307"}, false, 0, null, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("0.0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getMean=0.0, getStandardDeviation=1.0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput221() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.distribution.NormalDistributionImpl", "org.apache.commons.math.distribution.NormalDistributionImpl", "cumulativeProbability", new String[]{"double", "double"}, new String[]{"-Infinity", "20.0"}, false, 1, new String[][]{}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("0.9999999999999923", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getMean=0.0, getStandardDeviation=1.0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput222() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.distribution.NormalDistributionImpl", "org.apache.commons.math.distribution.NormalDistributionImpl", "inverseCumulativeProbability", new String[]{"double"}, new String[]{"0.0"}, false, 0, null, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("-Infinity", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getMean=0.0, getStandardDeviation=1.0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput223() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math.distribution.NormalDistributionImpl", "org.apache.commons.math.distribution.NormalDistributionImpl", "inverseCumulativeProbability", new String[]{"double"}, new String[]{"-31.0"}, false, 0, null, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput224() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.distribution.NormalDistributionImpl", "org.apache.commons.math.distribution.NormalDistributionImpl", "getInitialDomain", new String[]{"double"}, new String[]{"NaN"}, false, 0, new String[][]{{"org.apache.commons.math.distribution.NormalDistributionImpl", "setMean", "double", "-1.7976931348623157E308"}, {"org.apache.commons.math.distribution.NormalDistributionImpl", "cumulativeProbability", "double,double", "0.0", "2.0"}});
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("-1.7976931348623157E308", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getMean=-1.7976931348623157E308, getStandardDeviation=1.0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput225() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.distribution.NormalDistributionImpl", "org.apache.commons.math.distribution.NormalDistributionImpl", "getInitialDomain", new String[]{"double"}, new String[]{"0.59"}, false, 0, new String[][]{{"org.apache.commons.math.distribution.NormalDistributionImpl", "setMean", "double", "-1.7976931348623157E308"}, {"org.apache.commons.math.distribution.NormalDistributionImpl", "cumulativeProbability", "double,double", "0.0", "2.0"}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("-1.7976931348623157E308", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getMean=-1.7976931348623157E308, getStandardDeviation=1.0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput226() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.distribution.NormalDistributionImpl", "org.apache.commons.math.distribution.NormalDistributionImpl", "cumulativeProbability", new String[]{"double", "double"}, new String[]{"-1.4381545078898528E308", "-8.988465674311579E307"}, false, 0, new String[][]{{"org.apache.commons.math.distribution.NormalDistributionImpl", "setStandardDeviation", "double", "8589540077390120676"}});
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("0.0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getMean=0.0, getStandardDeviation=8.589540077390121E18}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput227() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.distribution.NormalDistributionImpl", "org.apache.commons.math.distribution.NormalDistributionImpl", "getInitialDomain", new String[]{"double"}, new String[]{"-93.0"}, false, 0, new String[][]{{"org.apache.commons.math.distribution.NormalDistributionImpl", "cumulativeProbability", "double", "8589540077390120676"}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("-1.0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getMean=0.0, getStandardDeviation=1.0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput228() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.distribution.NormalDistributionImpl", "org.apache.commons.math.distribution.NormalDistributionImpl", "getDomainUpperBound", new String[]{"double"}, new String[]{"-93.0"}, false, 0, new String[][]{{"org.apache.commons.math.distribution.NormalDistributionImpl", "getDomainLowerBound", "double", "-3.595386269724632E307"}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("0.0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getMean=0.0, getStandardDeviation=1.0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput229() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.distribution.NormalDistributionImpl", "org.apache.commons.math.distribution.NormalDistributionImpl", "getInitialDomain", new String[]{"double"}, new String[]{"-Infinity"}, false, 0, new String[][]{{"org.apache.commons.math.distribution.NormalDistributionImpl", "cumulativeProbability", "double,double", "1.0", "NaN"}, {"org.apache.commons.math.distribution.NormalDistributionImpl", "setStandardDeviation", "double", "3.595386269724631E306"}, {"org.apache.commons.math.distribution.NormalDistributionImpl", "getDomainLowerBound", "double", "4.29477003869506E18"}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("-3.595386269724631E306", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getMean=0.0, getStandardDeviation=3.595386269724631E306}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput230() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.distribution.NormalDistributionImpl", "org.apache.commons.math.distribution.NormalDistributionImpl", "getDomainUpperBound", new String[]{"double"}, new String[]{"1.7976931348623157E308"}, false, 0, new String[][]{{"org.apache.commons.math.distribution.NormalDistributionImpl", "setMean", "double", "NaN"}});
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("1.7976931348623157E308", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getMean=NaN, getStandardDeviation=1.0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput231() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.distribution.NormalDistributionImpl", "org.apache.commons.math.distribution.NormalDistributionImpl", "getDomainUpperBound", new String[]{"double"}, new String[]{"-1.7976931348623157E308"}, false, 0, new String[][]{{"org.apache.commons.math.distribution.NormalDistributionImpl", "setMean", "double", "NaN"}});
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("NaN", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getMean=NaN, getStandardDeviation=1.0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput232() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.distribution.NormalDistributionImpl", "org.apache.commons.math.distribution.NormalDistributionImpl", "setMean", new String[]{"double"}, new String[]{"-20.2"}, false, 8, new String[][]{}, 1);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getMean=-20.2, getStandardDeviation=1.0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput233() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.distribution.NormalDistributionImpl", "org.apache.commons.math.distribution.NormalDistributionImpl", "setMean", new String[]{"double"}, new String[]{"3.595386269724631E306"}, false, 0, null, 2);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getMean=3.595386269724631E306, getStandardDeviation=1.0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput234() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.distribution.NormalDistributionImpl", "org.apache.commons.math.distribution.NormalDistributionImpl", "setMean", new String[]{"double"}, new String[]{"3.595386269724631E307"}, false, 0, null, 2);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getMean=3.595386269724631E307, getStandardDeviation=1.0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput235() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.distribution.NormalDistributionImpl", "org.apache.commons.math.distribution.NormalDistributionImpl", "setMean", new String[]{"double"}, new String[]{"-7.190772539449262E307"}, false, 1, new String[][]{{"org.apache.commons.math.distribution.NormalDistributionImpl", "cumulativeProbability", "double,double", "1.0", "-0.1"}}, 2);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getMean=-7.190772539449262E307, getStandardDeviation=1.0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput236() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.distribution.NormalDistributionImpl", "org.apache.commons.math.distribution.NormalDistributionImpl", "inverseCumulativeProbability", new String[]{"double"}, new String[]{"0.0"}, false, 1, new String[][]{{"org.apache.commons.math.distribution.NormalDistributionImpl", "getDomainUpperBound", "double", "1.7179080154780242E19"}, {"org.apache.commons.math.distribution.NormalDistributionImpl", "cumulativeProbability", "double", "-3.9999999999999996"}, {"org.apache.commons.math.distribution.NormalDistributionImpl", "setMean", "double", "8589540077390120676"}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("-Infinity", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getMean=8.589540077390121E18, getStandardDeviation=1.0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput237() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.distribution.NormalDistributionImpl", "org.apache.commons.math.distribution.NormalDistributionImpl", "getDomainLowerBound", new String[]{"double"}, new String[]{"1.7976931348623157E308"}, false, 0, new String[][]{{"org.apache.commons.math.distribution.NormalDistributionImpl", "setMean", "double", "NaN"}});
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("NaN", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getMean=NaN, getStandardDeviation=1.0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput238() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.distribution.NormalDistributionImpl", "org.apache.commons.math.distribution.NormalDistributionImpl", "getInitialDomain", new String[]{"double"}, new String[]{"-0.1"}, false, 0, new String[][]{{"org.apache.commons.math.distribution.NormalDistributionImpl", "setMean", "double", "0.5"}});
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("-0.5", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getMean=0.5, getStandardDeviation=1.0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput239() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.distribution.NormalDistributionImpl", "org.apache.commons.math.distribution.NormalDistributionImpl", "getInitialDomain", new String[]{"double"}, new String[]{"NaN"}, false, 9, new String[][]{}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("0.0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getMean=0.0, getStandardDeviation=1.0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput240() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.distribution.NormalDistributionImpl", "org.apache.commons.math.distribution.NormalDistributionImpl", "setMean", new String[]{"double"}, new String[]{"3.595386269724631E306"}, false, 0, null, 3);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getMean=3.595386269724631E306, getStandardDeviation=1.0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput241() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.distribution.NormalDistributionImpl", "org.apache.commons.math.distribution.NormalDistributionImpl", "setMean", new String[]{"double"}, new String[]{"7.190772539449261E306"}, false, 0, null, 3);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getMean=7.190772539449261E306, getStandardDeviation=1.0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput242() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.distribution.NormalDistributionImpl", "org.apache.commons.math.distribution.NormalDistributionImpl", "setMean", new String[]{"double"}, new String[]{"7.190772539449263E306"}, false, 0, null, 3);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getMean=7.190772539449263E306, getStandardDeviation=1.0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput243() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.distribution.NormalDistributionImpl", "org.apache.commons.math.distribution.NormalDistributionImpl", "getStandardDeviation", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.math.distribution.NormalDistributionImpl", "setMean", "double", "4.9E-324"}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("1.0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getMean=4.9E-324, getStandardDeviation=1.0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput244() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.distribution.NormalDistributionImpl", "org.apache.commons.math.distribution.NormalDistributionImpl", "cumulativeProbability", new String[]{"double", "double"}, new String[]{"1.7976931348623157E308", "NaN"}, false, 0, null, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("NaN", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getMean=0.0, getStandardDeviation=1.0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput245() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.distribution.NormalDistributionImpl", "org.apache.commons.math.distribution.NormalDistributionImpl", "cumulativeProbability", new String[]{"double", "double"}, new String[]{"-Infinity", "-1.0"}, false, 0, new String[][]{{"org.apache.commons.math.distribution.NormalDistributionImpl", "getStandardDeviation", ""}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("0.15865525393145702", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getMean=0.0, getStandardDeviation=1.0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput246() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.distribution.NormalDistributionImpl", "org.apache.commons.math.distribution.NormalDistributionImpl", "getMean", new String[]{}, new String[]{}, false, 7, new String[][]{{"org.apache.commons.math.distribution.NormalDistributionImpl", "cumulativeProbability", "double", "8.988465674311579E306"}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("1.0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getMean=1.0, getStandardDeviation=Infinity}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput247() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.distribution.NormalDistributionImpl", "org.apache.commons.math.distribution.NormalDistributionImpl", "getStandardDeviation", new String[]{}, new String[]{}, false, 7, new String[][]{{"org.apache.commons.math.distribution.NormalDistributionImpl", "getDomainLowerBound", "double", "-1.7976931348623157E308"}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("Infinity", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getMean=1.0, getStandardDeviation=Infinity}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput248() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.distribution.NormalDistributionImpl", "org.apache.commons.math.distribution.NormalDistributionImpl", "getMean", new String[]{}, new String[]{}, false, 21, new String[][]{{"org.apache.commons.math.distribution.NormalDistributionImpl", "setMean", "double", "96.0"}, {"org.apache.commons.math.distribution.NormalDistributionImpl", "getDomainUpperBound", "double", "0.0"}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("96.0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getMean=96.0, getStandardDeviation=1.0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput249() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.distribution.NormalDistributionImpl", "org.apache.commons.math.distribution.NormalDistributionImpl", "getMean", new String[]{}, new String[]{}, false, 2, new String[][]{{"org.apache.commons.math.distribution.NormalDistributionImpl", "inverseCumulativeProbability", "double", "-0.5450000000000002"}, {"org.apache.commons.math.distribution.NormalDistributionImpl", "setMean", "double", "-95.99999999999999"}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("-95.99999999999999", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getMean=-95.99999999999999, getStandardDeviation=1.0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput250() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.distribution.NormalDistributionImpl", "org.apache.commons.math.distribution.NormalDistributionImpl", "getMean", new String[]{}, new String[]{}, false, 3, new String[][]{{"org.apache.commons.math.distribution.NormalDistributionImpl", "setMean", "double", "-96.0"}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("-96.0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getMean=-96.0, getStandardDeviation=1.0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput251() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.distribution.NormalDistributionImpl", "org.apache.commons.math.distribution.NormalDistributionImpl", "getMean", new String[]{}, new String[]{}, false, 3, new String[][]{{"org.apache.commons.math.distribution.NormalDistributionImpl", "setMean", "double", "-85.0"}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("-85.0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getMean=-85.0, getStandardDeviation=1.0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput252() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.distribution.NormalDistributionImpl", "org.apache.commons.math.distribution.NormalDistributionImpl", "getMean", new String[]{}, new String[]{}, false, 7, new String[][]{{"org.apache.commons.math.distribution.NormalDistributionImpl", "setMean", "double", "-85.0"}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("-85.0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getMean=-85.0, getStandardDeviation=Infinity}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput253() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.distribution.NormalDistributionImpl", "org.apache.commons.math.distribution.NormalDistributionImpl", "getInitialDomain", new String[]{"double"}, new String[]{"4.2947700386950605E18"}, false, 6, new String[][]{{"org.apache.commons.math.distribution.NormalDistributionImpl", "setMean", "double", "8589540077390120676"}});
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("8.589540077390121E18", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getMean=8.589540077390121E18, getStandardDeviation=1.0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput254() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.distribution.NormalDistributionImpl", "org.apache.commons.math.distribution.NormalDistributionImpl", "getInitialDomain", new String[]{"double"}, new String[]{"1.7976931348623158E307"}, false, 1, new String[][]{{"org.apache.commons.math.distribution.NormalDistributionImpl", "setStandardDeviation", "double", "1.7976931348623157E308"}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("1.7976931348623157E308", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getMean=0.0, getStandardDeviation=1.7976931348623157E308}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput255() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.distribution.NormalDistributionImpl", "org.apache.commons.math.distribution.NormalDistributionImpl", "cumulativeProbability", new String[]{"double"}, new String[]{"-99.00000000000001"}, false, 0, new String[][]{{"org.apache.commons.math.distribution.NormalDistributionImpl", "setStandardDeviation", "double", "1.7976931348623157E308"}, {"org.apache.commons.math.distribution.NormalDistributionImpl", "setStandardDeviation", "double", "8589540077390120676"}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("0.5", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getMean=0.0, getStandardDeviation=8.589540077390121E18}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput256() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.distribution.NormalDistributionImpl", "org.apache.commons.math.distribution.NormalDistributionImpl", "getInitialDomain", new String[]{"double"}, new String[]{"0.5"}, false, 2, new String[][]{{"org.apache.commons.math.distribution.NormalDistributionImpl", "inverseCumulativeProbability", "double", "NaN"}, {"org.apache.commons.math.distribution.NormalDistributionImpl", "getStandardDeviation", ""}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("0.0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getMean=0.0, getStandardDeviation=1.0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput257() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.distribution.NormalDistributionImpl", "org.apache.commons.math.distribution.NormalDistributionImpl", "getInitialDomain", new String[]{"double"}, new String[]{"1.7976931348623158E307"}, false, 2, new String[][]{{"org.apache.commons.math.distribution.NormalDistributionImpl", "setStandardDeviation", "double", "8.5895400773901199E18"}, {"org.apache.commons.math.distribution.NormalDistributionImpl", "inverseCumulativeProbability", "double", "NaN"}, {"org.apache.commons.math.distribution.NormalDistributionImpl", "getStandardDeviation", ""}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("8.5895400773901199E18", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getMean=0.0, getStandardDeviation=8.5895400773901199E18}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput258() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.distribution.NormalDistributionImpl", "org.apache.commons.math.distribution.NormalDistributionImpl", "cumulativeProbability", new String[]{"double", "double"}, new String[]{"-0.0625", "2.247116418577895E307"}, false, 1, new String[][]{{"org.apache.commons.math.distribution.NormalDistributionImpl", "setMean", "double", "0.5"}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("0.7131122981836349", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getMean=0.5, getStandardDeviation=1.0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput259() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.distribution.NormalDistributionImpl", "org.apache.commons.math.distribution.NormalDistributionImpl", "inverseCumulativeProbability", new String[]{"double"}, new String[]{"0.5"}, false, 14, new String[][]{{"org.apache.commons.math.distribution.NormalDistributionImpl", "setStandardDeviation", "double", "NaN"}, {"org.apache.commons.math.distribution.NormalDistributionImpl", "getDomainUpperBound", "double", "40.0"}, {"org.apache.commons.math.distribution.NormalDistributionImpl", "getStandardDeviation", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("0.9999995", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getMean=0.0, getStandardDeviation=NaN}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput260() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.distribution.NormalDistributionImpl", "org.apache.commons.math.distribution.NormalDistributionImpl", "inverseCumulativeProbability", new String[]{"double"}, new String[]{"0.5"}, false, 14, new String[][]{{"org.apache.commons.math.distribution.NormalDistributionImpl", "setStandardDeviation", "double", "NaN"}, {"org.apache.commons.math.distribution.NormalDistributionImpl", "getDomainUpperBound", "double", "40.0"}, {"org.apache.commons.math.distribution.NormalDistributionImpl", "getStandardDeviation", ""}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("0.9999995", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getMean=0.0, getStandardDeviation=NaN}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput261() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math.distribution.NormalDistributionImpl", "org.apache.commons.math.distribution.NormalDistributionImpl", "inverseCumulativeProbability", new String[]{"double"}, new String[]{"0.451"}, false, 3, new String[][]{{"org.apache.commons.math.distribution.NormalDistributionImpl", "setStandardDeviation", "double", "NaN"}, {"org.apache.commons.math.distribution.NormalDistributionImpl", "getDomainUpperBound", "double", "-40.0"}, {"org.apache.commons.math.distribution.NormalDistributionImpl", "getStandardDeviation", ""}}, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("org.apache.commons.math.MaxIterationsExceededException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput262() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math.distribution.NormalDistributionImpl", "org.apache.commons.math.distribution.NormalDistributionImpl", "inverseCumulativeProbability", new String[]{"double"}, new String[]{"1.717908015478024E19"}, false, 6, new String[][]{}, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput263() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.distribution.NormalDistributionImpl", "org.apache.commons.math.distribution.NormalDistributionImpl", "getMean", new String[]{}, new String[]{}, false, 17, new String[][]{{"org.apache.commons.math.distribution.NormalDistributionImpl", "cumulativeProbability", "double,double", "8.5895400773901197E17", "1.7976931348623157E308"}, {"org.apache.commons.math.distribution.NormalDistributionImpl", "cumulativeProbability", "double", "-0.1"}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("1.0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getMean=1.0, getStandardDeviation=Infinity}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput264() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.distribution.NormalDistributionImpl", "org.apache.commons.math.distribution.NormalDistributionImpl", "cumulativeProbability", new String[]{"double"}, new String[]{"-11.15"}, false, 5, new String[][]{{"org.apache.commons.math.distribution.NormalDistributionImpl", "cumulativeProbability", "double", "1.2500000000000002"}, {"org.apache.commons.math.distribution.NormalDistributionImpl", "cumulativeProbability", "double", "1.7976931348623158E307"}, {"org.apache.commons.math.distribution.NormalDistributionImpl", "setMean", "double", "8.5895400773901199E18"}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("0.0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getMean=8.5895400773901199E18, getStandardDeviation=1.0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput265() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.distribution.NormalDistributionImpl", "org.apache.commons.math.distribution.NormalDistributionImpl", "cumulativeProbability", new String[]{"double"}, new String[]{"-11.159"}, false, 4, new String[][]{{"org.apache.commons.math.distribution.NormalDistributionImpl", "cumulativeProbability", "double", "1.2500000000000002"}, {"org.apache.commons.math.distribution.NormalDistributionImpl", "cumulativeProbability", "double", "1.7976931348623158E307"}, {"org.apache.commons.math.distribution.NormalDistributionImpl", "setMean", "double", "8.5895400773901197E17"}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("0.0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getMean=8.5895400773901197E17, getStandardDeviation=1.0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput266() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.distribution.NormalDistributionImpl", "org.apache.commons.math.distribution.NormalDistributionImpl", "cumulativeProbability", new String[]{"double", "double"}, new String[]{"-0.1", "4.2947700386950605E18"}, false, 0, new String[][]{{"org.apache.commons.math.distribution.NormalDistributionImpl", "setMean", "double", "4.2947700386950605E18"}, {"org.apache.commons.math.distribution.NormalDistributionImpl", "getDomainLowerBound", "double", "-93.0"}});
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("0.5", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getMean=4.2947700386950605E18, getStandardDeviation=1.0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput267() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.distribution.NormalDistributionImpl", "org.apache.commons.math.distribution.NormalDistributionImpl", "cumulativeProbability", new String[]{"double", "double"}, new String[]{"-100.0", "NaN"}, false, 3, new String[][]{{"org.apache.commons.math.distribution.NormalDistributionImpl", "setStandardDeviation", "double", "-11.0"}, {"org.apache.commons.math.distribution.NormalDistributionImpl", "setMean", "double", "4.294770038695061E18"}, {"org.apache.commons.math.distribution.NormalDistributionImpl", "getDomainLowerBound", "double", "-186.0"}});
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("NaN", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getMean=4.294770038695061E18, getStandardDeviation=1.0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput268() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.distribution.NormalDistributionImpl", "org.apache.commons.math.distribution.NormalDistributionImpl", "cumulativeProbability", new String[]{"double", "double"}, new String[]{"-1.7976931348623157E308", "160.0"}, false, 1, new String[][]{{"org.apache.commons.math.distribution.NormalDistributionImpl", "setStandardDeviation", "double", "4.2947700386950605E18"}, {"org.apache.commons.math.distribution.NormalDistributionImpl", "getInitialDomain", "double", "-0.1"}, {"org.apache.commons.math.distribution.NormalDistributionImpl", "getStandardDeviation", ""}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("0.5", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getMean=0.0, getStandardDeviation=4.2947700386950605E18}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput269() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.distribution.NormalDistributionImpl", "org.apache.commons.math.distribution.NormalDistributionImpl", "getDomainUpperBound", new String[]{"double"}, new String[]{"-10.519999999999998"}, false, 6, new String[][]{{"org.apache.commons.math.distribution.NormalDistributionImpl", "getDomainUpperBound", "double", "8589540077390120676"}, {"org.apache.commons.math.distribution.NormalDistributionImpl", "setMean", "double", "-1.0"}});
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("-1.0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getMean=-1.0, getStandardDeviation=1.0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput270() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.distribution.NormalDistributionImpl", "org.apache.commons.math.distribution.NormalDistributionImpl", "getDomainUpperBound", new String[]{"double"}, new String[]{"1.7976931348623155E307"}, false, 12, new String[][]{{"org.apache.commons.math.distribution.NormalDistributionImpl", "setStandardDeviation", "double", "0.5"}, {"org.apache.commons.math.distribution.NormalDistributionImpl", "cumulativeProbability", "double", "-1.7976931348623157E308"}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("1.7976931348623157E308", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getMean=0.0, getStandardDeviation=0.5}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput271() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.distribution.NormalDistributionImpl", "org.apache.commons.math.distribution.NormalDistributionImpl", "getInitialDomain", new String[]{"double"}, new String[]{"1.7976931348623157E308"}, false, 0, new String[][]{{"org.apache.commons.math.distribution.NormalDistributionImpl", "getDomainUpperBound", "double", "4.2947700386950605E18"}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("1.0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getMean=0.0, getStandardDeviation=1.0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput272() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.distribution.NormalDistributionImpl", "org.apache.commons.math.distribution.NormalDistributionImpl", "getMean", new String[]{}, new String[]{}, false, 9, new String[][]{{"org.apache.commons.math.distribution.NormalDistributionImpl", "getDomainUpperBound", "double", "2.0"}, {"org.apache.commons.math.distribution.NormalDistributionImpl", "setMean", "double", "1.7976931348623158E307"}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("1.7976931348623158E307", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getMean=1.7976931348623158E307, getStandardDeviation=1.0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput273() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.distribution.NormalDistributionImpl", "org.apache.commons.math.distribution.NormalDistributionImpl", "getInitialDomain", new String[]{"double"}, new String[]{"2.0"}, false, 0, new String[][]{{"org.apache.commons.math.distribution.NormalDistributionImpl", "setStandardDeviation", "double", "0.5"}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("0.5", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getMean=0.0, getStandardDeviation=0.5}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput274() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.distribution.NormalDistributionImpl", "org.apache.commons.math.distribution.NormalDistributionImpl", "setMean", new String[]{"double"}, new String[]{"0.5"}, false, 0, new String[][]{{"org.apache.commons.math.distribution.NormalDistributionImpl", "setMean", "double", "0.5"}}, 2);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getMean=0.5, getStandardDeviation=1.0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput275() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.distribution.NormalDistributionImpl", "org.apache.commons.math.distribution.NormalDistributionImpl", "setMean", new String[]{"double"}, new String[]{"0.9590000000000001"}, false, 0, new String[][]{{"org.apache.commons.math.distribution.NormalDistributionImpl", "setMean", "double", "0.5"}}, 2);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getMean=0.9590000000000001, getStandardDeviation=1.0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput276() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.distribution.NormalDistributionImpl", "org.apache.commons.math.distribution.NormalDistributionImpl", "cumulativeProbability", new String[]{"double"}, new String[]{"120.25"}, false, 0, new String[][]{{"org.apache.commons.math.distribution.NormalDistributionImpl", "getStandardDeviation", ""}, {"org.apache.commons.math.distribution.NormalDistributionImpl", "getStandardDeviation", ""}, {"org.apache.commons.math.distribution.NormalDistributionImpl", "setMean", "double", "4.2947700386950605E18"}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("0.0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getMean=4.2947700386950605E18, getStandardDeviation=1.0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput277() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.distribution.NormalDistributionImpl", "org.apache.commons.math.distribution.NormalDistributionImpl", "cumulativeProbability", new String[]{"double", "double"}, new String[]{"-Infinity", "4.2947700386950605E18"}, false, 3, new String[][]{{"org.apache.commons.math.distribution.NormalDistributionImpl", "inverseCumulativeProbability", "double", "1.7976931348623156E306"}, {"org.apache.commons.math.distribution.NormalDistributionImpl", "setMean", "double", "3.595386269724631E306"}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("0.0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getMean=3.595386269724631E306, getStandardDeviation=1.0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput278() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.distribution.NormalDistributionImpl", "org.apache.commons.math.distribution.NormalDistributionImpl", "getMean", new String[]{}, new String[]{}, false, 16, new String[][]{{"org.apache.commons.math.distribution.NormalDistributionImpl", "getDomainUpperBound", "double", "-1.0000000000000002"}, {"org.apache.commons.math.distribution.NormalDistributionImpl", "setStandardDeviation", "double", "8589540077390120676"}, {"org.apache.commons.math.distribution.NormalDistributionImpl", "cumulativeProbability", "double", "-40.19"}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("0.0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getMean=0.0, getStandardDeviation=8.589540077390121E18}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput279() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.distribution.NormalDistributionImpl", "org.apache.commons.math.distribution.NormalDistributionImpl", "cumulativeProbability", new String[]{"double"}, new String[]{"5.255000000000001"}, false, 0, new String[][]{{"org.apache.commons.math.distribution.NormalDistributionImpl", "setMean", "double", "39.77999999999999"}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("3.3306690738754696E-16", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getMean=39.77999999999999, getStandardDeviation=1.0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput280() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.distribution.NormalDistributionImpl", "org.apache.commons.math.distribution.NormalDistributionImpl", "getMean", new String[]{}, new String[]{}, false, 5, new String[][]{{"org.apache.commons.math.distribution.NormalDistributionImpl", "setStandardDeviation", "double", "0.5"}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("0.0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getMean=0.0, getStandardDeviation=0.5}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput281() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.distribution.NormalDistributionImpl", "org.apache.commons.math.distribution.NormalDistributionImpl", "getMean", new String[]{}, new String[]{}, false, 30, new String[][]{{"org.apache.commons.math.distribution.NormalDistributionImpl", "setStandardDeviation", "double", "8.5895400773901199E18"}, {"org.apache.commons.math.distribution.NormalDistributionImpl", "getMean", ""}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("0.0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getMean=0.0, getStandardDeviation=8.5895400773901199E18}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput282() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.distribution.NormalDistributionImpl", "org.apache.commons.math.distribution.NormalDistributionImpl", "getInitialDomain", new String[]{"double"}, new String[]{"NaN"}, false, 0, new String[][]{{"org.apache.commons.math.distribution.NormalDistributionImpl", "getInitialDomain", "double", "1.7976931348623157E308"}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("0.0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getMean=0.0, getStandardDeviation=1.0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput283() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.distribution.NormalDistributionImpl", "org.apache.commons.math.distribution.NormalDistributionImpl", "getDomainUpperBound", new String[]{"double"}, new String[]{"1.7976931348623158E307"}, false, 7, new String[][]{{"org.apache.commons.math.distribution.NormalDistributionImpl", "inverseCumulativeProbability", "double", "-0.9999999999999999"}, {"org.apache.commons.math.distribution.NormalDistributionImpl", "getDomainLowerBound", "double", "2.0"}, {"org.apache.commons.math.distribution.NormalDistributionImpl", "cumulativeProbability", "double,double", "1.0", "1.7976931348623158E307"}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("1.7976931348623157E308", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getMean=1.0, getStandardDeviation=Infinity}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput284() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.distribution.NormalDistributionImpl", "org.apache.commons.math.distribution.NormalDistributionImpl", "getDomainUpperBound", new String[]{"double"}, new String[]{"-3.5953862697246315E307"}, false, 7, new String[][]{{"org.apache.commons.math.distribution.NormalDistributionImpl", "inverseCumulativeProbability", "double", "-0.9999999999999999"}, {"org.apache.commons.math.distribution.NormalDistributionImpl", "cumulativeProbability", "double,double", "1.0", "1.7976931348623158E307"}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("1.0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getMean=1.0, getStandardDeviation=Infinity}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput285() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.distribution.NormalDistributionImpl", "org.apache.commons.math.distribution.NormalDistributionImpl", "getDomainLowerBound", new String[]{"double"}, new String[]{"3.44"}, false, 0, new String[][]{{"org.apache.commons.math.distribution.NormalDistributionImpl", "getInitialDomain", "double", "4.2947700386950605E17"}, {"org.apache.commons.math.distribution.NormalDistributionImpl", "setMean", "double", "0.5"}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("0.5", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getMean=0.5, getStandardDeviation=1.0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput286() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.distribution.NormalDistributionImpl", "org.apache.commons.math.distribution.NormalDistributionImpl", "getDomainLowerBound", new String[]{"double"}, new String[]{"19.6"}, false, 1, new String[][]{{"org.apache.commons.math.distribution.NormalDistributionImpl", "setMean", "double", "0.5000000000000001"}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("0.5000000000000001", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getMean=0.5000000000000001, getStandardDeviation=1.0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput287() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.distribution.NormalDistributionImpl", "org.apache.commons.math.distribution.NormalDistributionImpl", "getDomainLowerBound", new String[]{"double"}, new String[]{"19.6"}, false, 1, new String[][]{{"org.apache.commons.math.distribution.NormalDistributionImpl", "setMean", "double", "1.0000000000000002"}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("1.0000000000000002", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getMean=1.0000000000000002, getStandardDeviation=1.0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput288() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.distribution.NormalDistributionImpl", "org.apache.commons.math.distribution.NormalDistributionImpl", "cumulativeProbability", new String[]{"double", "double"}, new String[]{"-8.988465674311579E307", "-8.988465674311579E307"}, false, 0, new String[][]{{"org.apache.commons.math.distribution.NormalDistributionImpl", "getMean", ""}, {"org.apache.commons.math.distribution.NormalDistributionImpl", "setMean", "double", "-8.988465674311579E307"}, {"org.apache.commons.math.distribution.NormalDistributionImpl", "setMean", "double", "NaN"}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("NaN", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getMean=NaN, getStandardDeviation=1.0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput289() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.distribution.NormalDistributionImpl", "org.apache.commons.math.distribution.NormalDistributionImpl", "cumulativeProbability", new String[]{"double", "double"}, new String[]{"-1.7976931348623155E308", "-8.988465674311579E307"}, false, 0, new String[][]{{"org.apache.commons.math.distribution.NormalDistributionImpl", "getDomainLowerBound", "double", "4.2947700386950605E18"}, {"org.apache.commons.math.distribution.NormalDistributionImpl", "getMean", ""}, {"org.apache.commons.math.distribution.NormalDistributionImpl", "setMean", "double", "-8.988465674311579E307"}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("0.5", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getMean=-8.988465674311579E307, getStandardDeviation=1.0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput290() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.distribution.NormalDistributionImpl", "org.apache.commons.math.distribution.NormalDistributionImpl", "cumulativeProbability", new String[]{"double", "double"}, new String[]{"10.0", "1.7976931348623155E308"}, false, 0, new String[][]{{"org.apache.commons.math.distribution.NormalDistributionImpl", "inverseCumulativeProbability", "double", "-1.7000000000000002"}, {"org.apache.commons.math.distribution.NormalDistributionImpl", "getDomainUpperBound", "double", "-0.2"}, {"org.apache.commons.math.distribution.NormalDistributionImpl", "getInitialDomain", "double", "Infinity"}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("1.7763568394002505E-15", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getMean=0.0, getStandardDeviation=1.0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput291() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.distribution.NormalDistributionImpl", "org.apache.commons.math.distribution.NormalDistributionImpl", "cumulativeProbability", new String[]{"double", "double"}, new String[]{"20.0", "1.7976931348623158E307"}, false, 6, new String[][]{{"org.apache.commons.math.distribution.NormalDistributionImpl", "setMean", "double", "1.7976931348623157E308"}, {"org.apache.commons.math.distribution.NormalDistributionImpl", "cumulativeProbability", "double", "4.2947700386950605E18"}, {"org.apache.commons.math.distribution.NormalDistributionImpl", "getInitialDomain", "double", "1.7976931348623158E307"}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("0.0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getMean=1.7976931348623157E308, getStandardDeviation=1.0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput292() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.distribution.NormalDistributionImpl", "org.apache.commons.math.distribution.NormalDistributionImpl", "getDomainLowerBound", new String[]{"double"}, new String[]{"1.0"}, false, 7, new String[][]{{"org.apache.commons.math.distribution.NormalDistributionImpl", "getStandardDeviation", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("1.0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getMean=1.0, getStandardDeviation=Infinity}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput293() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.distribution.NormalDistributionImpl", "org.apache.commons.math.distribution.NormalDistributionImpl", "getDomainLowerBound", new String[]{"double"}, new String[]{"1.07369250967376512E18"}, false, 4, new String[][]{{"org.apache.commons.math.distribution.NormalDistributionImpl", "setMean", "double", "4.0"}});
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("4.0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getMean=4.0, getStandardDeviation=1.0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput294() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.distribution.NormalDistributionImpl", "org.apache.commons.math.distribution.NormalDistributionImpl", "getDomainLowerBound", new String[]{"double"}, new String[]{"1.07369250967376512E18"}, false, 5, new String[][]{{"org.apache.commons.math.distribution.NormalDistributionImpl", "setMean", "double", "0.4"}});
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("0.4", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getMean=0.4, getStandardDeviation=1.0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput295() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.distribution.NormalDistributionImpl", "org.apache.commons.math.distribution.NormalDistributionImpl", "getDomainUpperBound", new String[]{"double"}, new String[]{"0.0"}, false, 2, new String[][]{{"org.apache.commons.math.distribution.NormalDistributionImpl", "setStandardDeviation", "double", "1.7976931348623158E307"}, {"org.apache.commons.math.distribution.NormalDistributionImpl", "getStandardDeviation", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("0.0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getMean=0.0, getStandardDeviation=1.7976931348623158E307}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput296() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.distribution.NormalDistributionImpl", "org.apache.commons.math.distribution.NormalDistributionImpl", "getDomainUpperBound", new String[]{"double"}, new String[]{"0.003"}, false, 2, new String[][]{{"org.apache.commons.math.distribution.NormalDistributionImpl", "setStandardDeviation", "double", "20.0"}, {"org.apache.commons.math.distribution.NormalDistributionImpl", "getStandardDeviation", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("0.0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getMean=0.0, getStandardDeviation=20.0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput297() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.distribution.NormalDistributionImpl", "org.apache.commons.math.distribution.NormalDistributionImpl", "cumulativeProbability", new String[]{"double", "double"}, new String[]{"10.0", "10.000000000000004"}, false, 0, new String[][]{{"org.apache.commons.math.distribution.NormalDistributionImpl", "getMean", ""}, {"org.apache.commons.math.distribution.NormalDistributionImpl", "setMean", "double", "-1.7976931348623157E308"}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("0.0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getMean=-1.7976931348623157E308, getStandardDeviation=1.0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput298() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.distribution.NormalDistributionImpl", "org.apache.commons.math.distribution.NormalDistributionImpl", "getDomainUpperBound", new String[]{"double"}, new String[]{"-8.988465674311579E307"}, false, 3, new String[][]{{"org.apache.commons.math.distribution.NormalDistributionImpl", "setStandardDeviation", "double", "1.7976931348623157E308"}, {"org.apache.commons.math.distribution.NormalDistributionImpl", "setMean", "double", "-1.7976931348623157E308"}, {"org.apache.commons.math.distribution.NormalDistributionImpl", "getStandardDeviation", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("-1.7976931348623157E308", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getMean=-1.7976931348623157E308, getStandardDeviation=1.7976931348623157E308}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput299() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.distribution.NormalDistributionImpl", "org.apache.commons.math.distribution.NormalDistributionImpl", "getDomainUpperBound", new String[]{"double"}, new String[]{"-92.99999999999999"}, false, 1, new String[][]{{"org.apache.commons.math.distribution.NormalDistributionImpl", "setMean", "double", "8589540077390120676"}, {"org.apache.commons.math.distribution.NormalDistributionImpl", "getStandardDeviation", ""}, {"org.apache.commons.math.distribution.NormalDistributionImpl", "getDomainLowerBound", "double", "0.5"}});
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("8.589540077390121E18", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getMean=8.589540077390121E18, getStandardDeviation=1.0}", SearchInputFactory_scaffolding.receiverState());
 }
}
