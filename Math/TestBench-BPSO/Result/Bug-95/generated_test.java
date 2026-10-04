package generated.algorithm;

import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;
import static org.junit.Assert.*;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class BinaryParticleSwarmGeneratedTest {
 @Test(timeout = 20000)
 public void generatedInput000() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.distribution.FDistributionImpl", "org.apache.commons.math.distribution.FDistributionImpl", "getDomainLowerBound", new String[]{"double"}, new String[]{"NaN"}, false, 2, new String[][]{{"org.apache.commons.math.distribution.FDistributionImpl", "inverseCumulativeProbability", "double", "0.0"}});
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("0.0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getDenominatorDegreesOfFreedom=Infinity, getNumeratorDegreesOfFreedom=1.0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput001() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.distribution.FDistributionImpl", "org.apache.commons.math.distribution.FDistributionImpl", "getDomainLowerBound", new String[]{"double"}, new String[]{"NaN"}, false, 7, new String[][]{{"org.apache.commons.math.distribution.FDistributionImpl", "inverseCumulativeProbability", "double", "1.0"}});
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("0.0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getDenominatorDegreesOfFreedom=Infinity, getNumeratorDegreesOfFreedom=1.0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput002() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.distribution.FDistributionImpl", "org.apache.commons.math.distribution.FDistributionImpl", "inverseCumulativeProbability", new String[]{"double"}, new String[]{"4.9E-324"}, false, 3, new String[][]{{"org.apache.commons.math.distribution.FDistributionImpl", "getDenominatorDegreesOfFreedom", ""}, {"org.apache.commons.math.distribution.FDistributionImpl", "setDenominatorDegreesOfFreedom", "double", "0.5"}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("2.0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getDenominatorDegreesOfFreedom=0.5, getNumeratorDegreesOfFreedom=0.0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput003() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.distribution.FDistributionImpl", "org.apache.commons.math.distribution.FDistributionImpl", "getInitialDomain", new String[]{"double"}, new String[]{"0.0"}, false, 2, new String[][]{{"org.apache.commons.math.distribution.FDistributionImpl", "setDenominatorDegreesOfFreedom", "double", "4.0"}, {"org.apache.commons.math.distribution.FDistributionImpl", "setNumeratorDegreesOfFreedom", "double", "-1.7976931348623157E308"}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("2.0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getDenominatorDegreesOfFreedom=4.0, getNumeratorDegreesOfFreedom=1.0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput004() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.distribution.FDistributionImpl", "org.apache.commons.math.distribution.FDistributionImpl", "cumulativeProbability", new String[]{"double", "double"}, new String[]{"-1.7976931348623157E308", "NaN"}, false, 2, new String[][]{}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("NaN", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getDenominatorDegreesOfFreedom=Infinity, getNumeratorDegreesOfFreedom=1.0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput005() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.distribution.FDistributionImpl", "org.apache.commons.math.distribution.FDistributionImpl", "getInitialDomain", new String[]{"double"}, new String[]{"-0.5"}, false, 0, null, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("1.0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getDenominatorDegreesOfFreedom=0.0, getNumeratorDegreesOfFreedom=0.0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput006() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.distribution.FDistributionImpl", "org.apache.commons.math.distribution.FDistributionImpl", "cumulativeProbability", new String[]{"double"}, new String[]{"2.0"}, false, 0, null, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("NaN", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getDenominatorDegreesOfFreedom=0.0, getNumeratorDegreesOfFreedom=0.0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput007() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.distribution.FDistributionImpl", "org.apache.commons.math.distribution.FDistributionImpl", "getInitialDomain", new String[]{"double"}, new String[]{"-0.5"}, false, 1, new String[][]{{"org.apache.commons.math.distribution.FDistributionImpl", "setDenominatorDegreesOfFreedom", "double", "1.7976931348623157E308"}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("1.0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getDenominatorDegreesOfFreedom=1.7976931348623157E308, getNumeratorDegreesOfFreedom=0.0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput008() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.distribution.FDistributionImpl", "org.apache.commons.math.distribution.FDistributionImpl", "setNumeratorDegreesOfFreedom", new String[]{"double"}, new String[]{"NaN"}, false, 0, null, 2);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getDenominatorDegreesOfFreedom=0.0, getNumeratorDegreesOfFreedom=NaN}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput009() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.distribution.FDistributionImpl", "org.apache.commons.math.distribution.FDistributionImpl", "getDomainUpperBound", new String[]{"double"}, new String[]{"-0.5"}, false, 2, new String[][]{}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("1.7976931348623157E308", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getDenominatorDegreesOfFreedom=Infinity, getNumeratorDegreesOfFreedom=1.0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput010() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.distribution.FDistributionImpl", "org.apache.commons.math.distribution.FDistributionImpl", "getDenominatorDegreesOfFreedom", new String[]{}, new String[]{}, false, 1, new String[][]{{"org.apache.commons.math.distribution.FDistributionImpl", "cumulativeProbability", "double", "1.7976931348623157E308"}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("0.0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getDenominatorDegreesOfFreedom=0.0, getNumeratorDegreesOfFreedom=0.0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput011() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.distribution.FDistributionImpl", "org.apache.commons.math.distribution.FDistributionImpl", "getDomainLowerBound", new String[]{"double"}, new String[]{"0.6899999999999998"}, false, 5, new String[][]{{"org.apache.commons.math.distribution.FDistributionImpl", "getDomainUpperBound", "double", "0.5"}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("0.0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getDenominatorDegreesOfFreedom=0.0, getNumeratorDegreesOfFreedom=0.0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput012() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.distribution.FDistributionImpl", "org.apache.commons.math.distribution.FDistributionImpl", "getDomainLowerBound", new String[]{"double"}, new String[]{"-2.1"}, false, 0, new String[][]{{"org.apache.commons.math.distribution.FDistributionImpl", "setDenominatorDegreesOfFreedom", "double", "-Infinity"}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("0.0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getDenominatorDegreesOfFreedom=0.0, getNumeratorDegreesOfFreedom=0.0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput013() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.distribution.FDistributionImpl", "org.apache.commons.math.distribution.FDistributionImpl", "setDenominatorDegreesOfFreedom", new String[]{"double"}, new String[]{"0.25"}, false, 2, new String[][]{}, 2);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getDenominatorDegreesOfFreedom=0.25, getNumeratorDegreesOfFreedom=1.0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput014() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.distribution.FDistributionImpl", "org.apache.commons.math.distribution.FDistributionImpl", "setDenominatorDegreesOfFreedom", new String[]{"double"}, new String[]{"Infinity"}, false, 1, new String[][]{{"org.apache.commons.math.distribution.FDistributionImpl", "getDomainLowerBound", "double", "-4.9E-324"}}, 2);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getDenominatorDegreesOfFreedom=Infinity, getNumeratorDegreesOfFreedom=0.0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput015() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.distribution.FDistributionImpl", "org.apache.commons.math.distribution.FDistributionImpl", "setDenominatorDegreesOfFreedom", new String[]{"double"}, new String[]{"0.5"}, false, 2, new String[][]{{"org.apache.commons.math.distribution.FDistributionImpl", "getInitialDomain", "double", "-1.7976931348623157E308"}}, 1);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getDenominatorDegreesOfFreedom=0.5, getNumeratorDegreesOfFreedom=1.0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput016() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.distribution.FDistributionImpl", "org.apache.commons.math.distribution.FDistributionImpl", "getDomainLowerBound", new String[]{"double"}, new String[]{"-0.20000000000000018"}, false, 2, new String[][]{}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("0.0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getDenominatorDegreesOfFreedom=Infinity, getNumeratorDegreesOfFreedom=1.0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput017() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.distribution.FDistributionImpl", "org.apache.commons.math.distribution.FDistributionImpl", "cumulativeProbability", new String[]{"double"}, new String[]{"1.0"}, false, 5, new String[][]{{"org.apache.commons.math.distribution.FDistributionImpl", "getDomainUpperBound", "double", "Infinity"}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("NaN", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getDenominatorDegreesOfFreedom=0.0, getNumeratorDegreesOfFreedom=0.0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput018() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.distribution.FDistributionImpl", "org.apache.commons.math.distribution.FDistributionImpl", "setDenominatorDegreesOfFreedom", new String[]{"double"}, new String[]{"0.25"}, false, 0, null, 2);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getDenominatorDegreesOfFreedom=0.25, getNumeratorDegreesOfFreedom=0.0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput019() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.distribution.FDistributionImpl", "org.apache.commons.math.distribution.FDistributionImpl", "setNumeratorDegreesOfFreedom", new String[]{"double"}, new String[]{"0.965"}, false, 5, new String[][]{{"org.apache.commons.math.distribution.FDistributionImpl", "inverseCumulativeProbability", "double", "-8.5163541934186414E18"}}, 1);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getDenominatorDegreesOfFreedom=0.0, getNumeratorDegreesOfFreedom=0.965}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput020() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.distribution.FDistributionImpl", "org.apache.commons.math.distribution.FDistributionImpl", "getInitialDomain", new String[]{"double"}, new String[]{"NaN"}, false, 0, null, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("1.0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getDenominatorDegreesOfFreedom=0.0, getNumeratorDegreesOfFreedom=0.0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput021() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math.distribution.FDistributionImpl", "org.apache.commons.math.distribution.FDistributionImpl", "setNumeratorDegreesOfFreedom", new String[]{"double"}, new String[]{"-0.1"}, false, 7, new String[][]{}, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput022() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.distribution.FDistributionImpl", "org.apache.commons.math.distribution.FDistributionImpl", "getDomainUpperBound", new String[]{"double"}, new String[]{"NaN"}, false, 0, new String[][]{{"org.apache.commons.math.distribution.FDistributionImpl", "getDomainUpperBound", "double", "1.7976931348623158E307"}, {"org.apache.commons.math.distribution.FDistributionImpl", "getDomainLowerBound", "double", "-1.7976931348623157E308"}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("1.7976931348623157E308", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getDenominatorDegreesOfFreedom=0.0, getNumeratorDegreesOfFreedom=0.0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput023() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.distribution.FDistributionImpl", "org.apache.commons.math.distribution.FDistributionImpl", "getDomainUpperBound", new String[]{"double"}, new String[]{"-0.25"}, false, 7, new String[][]{{"org.apache.commons.math.distribution.FDistributionImpl", "cumulativeProbability", "double", "NaN"}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("1.7976931348623157E308", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getDenominatorDegreesOfFreedom=Infinity, getNumeratorDegreesOfFreedom=1.0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput024() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math.distribution.FDistributionImpl", "org.apache.commons.math.distribution.FDistributionImpl", "cumulativeProbability", new String[]{"double", "double"}, new String[]{"0.78", "0.05"}, false, 0, new String[][]{{"org.apache.commons.math.distribution.FDistributionImpl", "getDenominatorDegreesOfFreedom", ""}}, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput025() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.distribution.FDistributionImpl", "org.apache.commons.math.distribution.FDistributionImpl", "getInitialDomain", new String[]{"double"}, new String[]{"NaN"}, false, 5, new String[][]{{"org.apache.commons.math.distribution.FDistributionImpl", "setNumeratorDegreesOfFreedom", "double", "-Infinity"}, {"org.apache.commons.math.distribution.FDistributionImpl", "cumulativeProbability", "double,double", "Infinity", "NaN"}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("1.0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getDenominatorDegreesOfFreedom=0.0, getNumeratorDegreesOfFreedom=0.0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput026() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.distribution.FDistributionImpl", "org.apache.commons.math.distribution.FDistributionImpl", "getNumeratorDegreesOfFreedom", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.math.distribution.FDistributionImpl", "getNumeratorDegreesOfFreedom", ""}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("0.0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getDenominatorDegreesOfFreedom=0.0, getNumeratorDegreesOfFreedom=0.0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput027() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.distribution.FDistributionImpl", "org.apache.commons.math.distribution.FDistributionImpl", "getDenominatorDegreesOfFreedom", new String[]{}, new String[]{}, false, 5, new String[][]{}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("0.0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getDenominatorDegreesOfFreedom=0.0, getNumeratorDegreesOfFreedom=0.0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput028() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math.distribution.FDistributionImpl", "org.apache.commons.math.distribution.FDistributionImpl", "inverseCumulativeProbability", new String[]{"double"}, new String[]{"Infinity"}, false, 0, null, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput029() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.distribution.FDistributionImpl", "org.apache.commons.math.distribution.FDistributionImpl", "cumulativeProbability", new String[]{"double", "double"}, new String[]{"-1.7032708386837283E19", "0.6599999999999999"}, false, 0, new String[][]{{"org.apache.commons.math.distribution.FDistributionImpl", "cumulativeProbability", "double,double", "Infinity", "0.5"}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("NaN", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getDenominatorDegreesOfFreedom=0.0, getNumeratorDegreesOfFreedom=0.0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput030() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.distribution.FDistributionImpl", "org.apache.commons.math.distribution.FDistributionImpl", "getNumeratorDegreesOfFreedom", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.math.distribution.FDistributionImpl", "cumulativeProbability", "double,double", "1.24", "0.0"}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("0.0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getDenominatorDegreesOfFreedom=0.0, getNumeratorDegreesOfFreedom=0.0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput031() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.distribution.FDistributionImpl", "org.apache.commons.math.distribution.FDistributionImpl", "getNumeratorDegreesOfFreedom", new String[]{}, new String[]{}, false, 7, new String[][]{{"org.apache.commons.math.distribution.FDistributionImpl", "cumulativeProbability", "double,double", "-Infinity", "-1.0"}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("1.0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getDenominatorDegreesOfFreedom=Infinity, getNumeratorDegreesOfFreedom=1.0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput032() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math.distribution.FDistributionImpl", "org.apache.commons.math.distribution.FDistributionImpl", "inverseCumulativeProbability", new String[]{"double"}, new String[]{"-Infinity"}, false, 0, new String[][]{{"org.apache.commons.math.distribution.FDistributionImpl", "cumulativeProbability", "double", "1.7976931348623157E308"}}, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput033() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.distribution.FDistributionImpl", "org.apache.commons.math.distribution.FDistributionImpl", "getInitialDomain", new String[]{"double"}, new String[]{"1.0"}, false, 7, new String[][]{{"org.apache.commons.math.distribution.FDistributionImpl", "setNumeratorDegreesOfFreedom", "double", "1.7976931348623157E308"}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("NaN", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getDenominatorDegreesOfFreedom=Infinity, getNumeratorDegreesOfFreedom=1.7976931348623157E308}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput034() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.distribution.FDistributionImpl", "org.apache.commons.math.distribution.FDistributionImpl", "getDomainLowerBound", new String[]{"double"}, new String[]{"0.5"}, false, 0, new String[][]{{"org.apache.commons.math.distribution.FDistributionImpl", "getDomainLowerBound", "double", "0.6599999999999999"}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("0.0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getDenominatorDegreesOfFreedom=0.0, getNumeratorDegreesOfFreedom=0.0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput035() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.distribution.FDistributionImpl", "org.apache.commons.math.distribution.FDistributionImpl", "getDenominatorDegreesOfFreedom", new String[]{}, new String[]{}, false, 5, new String[][]{{"org.apache.commons.math.distribution.FDistributionImpl", "setDenominatorDegreesOfFreedom", "double", "0.5"}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("0.5", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getDenominatorDegreesOfFreedom=0.5, getNumeratorDegreesOfFreedom=0.0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput036() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.distribution.FDistributionImpl", "org.apache.commons.math.distribution.FDistributionImpl", "cumulativeProbability", new String[]{"double", "double"}, new String[]{"NaN", "1.0"}, false, 0, new String[][]{{"org.apache.commons.math.distribution.FDistributionImpl", "setNumeratorDegreesOfFreedom", "double", "50.0"}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("NaN", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getDenominatorDegreesOfFreedom=0.0, getNumeratorDegreesOfFreedom=50.0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput037() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.distribution.FDistributionImpl", "org.apache.commons.math.distribution.FDistributionImpl", "getInitialDomain", new String[]{"double"}, new String[]{"-Infinity"}, false, 2, new String[][]{}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("NaN", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getDenominatorDegreesOfFreedom=Infinity, getNumeratorDegreesOfFreedom=1.0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput038() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.distribution.FDistributionImpl", "org.apache.commons.math.distribution.FDistributionImpl", "setNumeratorDegreesOfFreedom", new String[]{"double"}, new String[]{"1.0"}, false, 7, new String[][]{{"org.apache.commons.math.distribution.FDistributionImpl", "getDenominatorDegreesOfFreedom", ""}, {"org.apache.commons.math.distribution.FDistributionImpl", "getNumeratorDegreesOfFreedom", ""}}, 2);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getDenominatorDegreesOfFreedom=Infinity, getNumeratorDegreesOfFreedom=1.0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput039() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.distribution.FDistributionImpl", "org.apache.commons.math.distribution.FDistributionImpl", "cumulativeProbability", new String[]{"double"}, new String[]{"4.0"}, false, 2, new String[][]{{"org.apache.commons.math.distribution.FDistributionImpl", "getInitialDomain", "double", "NaN"}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("NaN", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getDenominatorDegreesOfFreedom=Infinity, getNumeratorDegreesOfFreedom=1.0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput040() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.distribution.FDistributionImpl", "org.apache.commons.math.distribution.FDistributionImpl", "cumulativeProbability", new String[]{"double", "double"}, new String[]{"-2.1", "0.32999999999999996"}, false, 6, new String[][]{{"org.apache.commons.math.distribution.FDistributionImpl", "getInitialDomain", "double", "-Infinity"}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("NaN", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getDenominatorDegreesOfFreedom=0.0, getNumeratorDegreesOfFreedom=0.0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput041() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.distribution.FDistributionImpl", "org.apache.commons.math.distribution.FDistributionImpl", "getDomainUpperBound", new String[]{"double"}, new String[]{"-1.7976931348623157E308"}, false, 7, new String[][]{}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("1.7976931348623157E308", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getDenominatorDegreesOfFreedom=Infinity, getNumeratorDegreesOfFreedom=1.0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput042() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.distribution.FDistributionImpl", "org.apache.commons.math.distribution.FDistributionImpl", "getDomainLowerBound", new String[]{"double"}, new String[]{"-1.7976931348623157E308"}, false, 0, null, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("0.0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getDenominatorDegreesOfFreedom=0.0, getNumeratorDegreesOfFreedom=0.0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput043() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math.distribution.FDistributionImpl", "org.apache.commons.math.distribution.FDistributionImpl", "cumulativeProbability", new String[]{"double", "double"}, new String[]{"0.5", "-0.5"}, false, 0, null, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput044() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.distribution.FDistributionImpl", "org.apache.commons.math.distribution.FDistributionImpl", "getInitialDomain", new String[]{"double"}, new String[]{"-8516354193418641566"}, false, 7, new String[][]{}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("NaN", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getDenominatorDegreesOfFreedom=Infinity, getNumeratorDegreesOfFreedom=1.0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput045() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math.distribution.FDistributionImpl", "org.apache.commons.math.distribution.FDistributionImpl", "setDenominatorDegreesOfFreedom", new String[]{"double"}, new String[]{"0.0"}, false, 7, new String[][]{}, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput046() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.distribution.FDistributionImpl", "org.apache.commons.math.distribution.FDistributionImpl", "getDomainUpperBound", new String[]{"double"}, new String[]{"1.3199999999999998"}, false, 0, new String[][]{{"org.apache.commons.math.distribution.FDistributionImpl", "setNumeratorDegreesOfFreedom", "double", "-Infinity"}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("1.7976931348623157E308", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getDenominatorDegreesOfFreedom=0.0, getNumeratorDegreesOfFreedom=0.0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput047() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.distribution.FDistributionImpl", "org.apache.commons.math.distribution.FDistributionImpl", "setDenominatorDegreesOfFreedom", new String[]{"double"}, new String[]{"1.0"}, false, 1, new String[][]{{"org.apache.commons.math.distribution.FDistributionImpl", "inverseCumulativeProbability", "double", "-0.9999999999999999"}}, 3);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getDenominatorDegreesOfFreedom=1.0, getNumeratorDegreesOfFreedom=0.0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput048() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.distribution.FDistributionImpl", "org.apache.commons.math.distribution.FDistributionImpl", "getDenominatorDegreesOfFreedom", new String[]{}, new String[]{}, false, 0, null, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("0.0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getDenominatorDegreesOfFreedom=0.0, getNumeratorDegreesOfFreedom=0.0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput049() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.distribution.FDistributionImpl", "org.apache.commons.math.distribution.FDistributionImpl", "getDomainUpperBound", new String[]{"double"}, new String[]{"1.0"}, false, 5, new String[][]{{"org.apache.commons.math.distribution.FDistributionImpl", "setDenominatorDegreesOfFreedom", "double", "0.9999999999999999"}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("1.7976931348623157E308", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getDenominatorDegreesOfFreedom=0.9999999999999999, getNumeratorDegreesOfFreedom=0.0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput050() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.distribution.FDistributionImpl", "org.apache.commons.math.distribution.FDistributionImpl", "inverseCumulativeProbability", new String[]{"double"}, new String[]{"0.0"}, false, 0, new String[][]{{"org.apache.commons.math.distribution.FDistributionImpl", "getInitialDomain", "double", "NaN"}, {"org.apache.commons.math.distribution.FDistributionImpl", "getDomainUpperBound", "double", "-1.0499999999999998"}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("0.0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getDenominatorDegreesOfFreedom=0.0, getNumeratorDegreesOfFreedom=0.0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput051() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.distribution.FDistributionImpl", "org.apache.commons.math.distribution.FDistributionImpl", "inverseCumulativeProbability", new String[]{"double"}, new String[]{"0.32"}, false, 3, new String[][]{}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("2.0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getDenominatorDegreesOfFreedom=0.0, getNumeratorDegreesOfFreedom=0.0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput052() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.distribution.FDistributionImpl", "org.apache.commons.math.distribution.FDistributionImpl", "getNumeratorDegreesOfFreedom", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.math.distribution.FDistributionImpl", "getInitialDomain", "double", "-0.5000000000000001"}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("0.0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getDenominatorDegreesOfFreedom=0.0, getNumeratorDegreesOfFreedom=0.0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput053() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.distribution.FDistributionImpl", "org.apache.commons.math.distribution.FDistributionImpl", "getDomainUpperBound", new String[]{"double"}, new String[]{"3.7"}, false, 3, new String[][]{{"org.apache.commons.math.distribution.FDistributionImpl", "setDenominatorDegreesOfFreedom", "double", "0.6599999999999997"}, {"org.apache.commons.math.distribution.FDistributionImpl", "getDomainLowerBound", "double", "-2.1"}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("1.7976931348623157E308", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getDenominatorDegreesOfFreedom=0.6599999999999997, getNumeratorDegreesOfFreedom=0.0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput054() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math.distribution.FDistributionImpl", "org.apache.commons.math.distribution.FDistributionImpl", "inverseCumulativeProbability", new String[]{"double"}, new String[]{"-1.0"}, false, 2, new String[][]{{"org.apache.commons.math.distribution.FDistributionImpl", "cumulativeProbability", "double,double", "-8.5163541934186414E18", "0.05"}, {"org.apache.commons.math.distribution.FDistributionImpl", "getInitialDomain", "double", "Infinity"}}, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput055() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.distribution.FDistributionImpl", "org.apache.commons.math.distribution.FDistributionImpl", "inverseCumulativeProbability", new String[]{"double"}, new String[]{"1.0"}, false, 3, new String[][]{{"org.apache.commons.math.distribution.FDistributionImpl", "getInitialDomain", "double", "-0.25"}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("Infinity", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getDenominatorDegreesOfFreedom=0.0, getNumeratorDegreesOfFreedom=0.0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput056() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math.distribution.FDistributionImpl", "org.apache.commons.math.distribution.FDistributionImpl", "setDenominatorDegreesOfFreedom", new String[]{"double"}, new String[]{"-Infinity"}, false, 5, new String[][]{}, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput057() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.distribution.FDistributionImpl", "org.apache.commons.math.distribution.FDistributionImpl", "cumulativeProbability", new String[]{"double", "double"}, new String[]{"0.05", "2.0"}, false, 0, null, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("NaN", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getDenominatorDegreesOfFreedom=0.0, getNumeratorDegreesOfFreedom=0.0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput058() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.distribution.FDistributionImpl", "org.apache.commons.math.distribution.FDistributionImpl", "getDomainLowerBound", new String[]{"double"}, new String[]{"-Infinity"}, false, 1, new String[][]{{"org.apache.commons.math.distribution.FDistributionImpl", "setNumeratorDegreesOfFreedom", "double", "1.7976931348623157E308"}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("0.0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getDenominatorDegreesOfFreedom=0.0, getNumeratorDegreesOfFreedom=1.7976931348623157E308}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput059() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.distribution.FDistributionImpl", "org.apache.commons.math.distribution.FDistributionImpl", "inverseCumulativeProbability", new String[]{"double"}, new String[]{"NaN"}, false, 1, new String[][]{{"org.apache.commons.math.distribution.FDistributionImpl", "setDenominatorDegreesOfFreedom", "double", "8.988465674311579E307"}, {"org.apache.commons.math.distribution.FDistributionImpl", "getDomainLowerBound", "double", "-2.0"}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("2.0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getDenominatorDegreesOfFreedom=8.988465674311579E307, getNumeratorDegreesOfFreedom=0.0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput060() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.distribution.FDistributionImpl", "org.apache.commons.math.distribution.FDistributionImpl", "getDomainUpperBound", new String[]{"double"}, new String[]{"1.12"}, false, 3, new String[][]{{"org.apache.commons.math.distribution.FDistributionImpl", "cumulativeProbability", "double,double", "NaN", "-Infinity"}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("1.7976931348623157E308", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getDenominatorDegreesOfFreedom=0.0, getNumeratorDegreesOfFreedom=0.0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput061() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.distribution.FDistributionImpl", "org.apache.commons.math.distribution.FDistributionImpl", "getInitialDomain", new String[]{"double"}, new String[]{"-0.01"}, false, 2, new String[][]{{"org.apache.commons.math.distribution.FDistributionImpl", "inverseCumulativeProbability", "double", "NaN"}, {"org.apache.commons.math.distribution.FDistributionImpl", "inverseCumulativeProbability", "double", "Infinity"}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("NaN", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getDenominatorDegreesOfFreedom=Infinity, getNumeratorDegreesOfFreedom=1.0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput062() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.distribution.FDistributionImpl", "org.apache.commons.math.distribution.FDistributionImpl", "getNumeratorDegreesOfFreedom", new String[]{}, new String[]{}, false, 7, new String[][]{{"org.apache.commons.math.distribution.FDistributionImpl", "setNumeratorDegreesOfFreedom", "double", "0.5"}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("0.5", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getDenominatorDegreesOfFreedom=Infinity, getNumeratorDegreesOfFreedom=0.5}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput063() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.distribution.FDistributionImpl", "org.apache.commons.math.distribution.FDistributionImpl", "cumulativeProbability", new String[]{"double"}, new String[]{"-Infinity"}, false, 3, new String[][]{}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("0.0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getDenominatorDegreesOfFreedom=0.0, getNumeratorDegreesOfFreedom=0.0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput064() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.distribution.FDistributionImpl", "org.apache.commons.math.distribution.FDistributionImpl", "setNumeratorDegreesOfFreedom", new String[]{"double"}, new String[]{"1.7976931348623157E308"}, false, 2, new String[][]{}, 2);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getDenominatorDegreesOfFreedom=Infinity, getNumeratorDegreesOfFreedom=1.7976931348623157E308}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput065() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.distribution.FDistributionImpl", "org.apache.commons.math.distribution.FDistributionImpl", "getInitialDomain", new String[]{"double"}, new String[]{"0.6599999999999999"}, false, 3, new String[][]{{"org.apache.commons.math.distribution.FDistributionImpl", "setDenominatorDegreesOfFreedom", "double", "Infinity"}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("NaN", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getDenominatorDegreesOfFreedom=Infinity, getNumeratorDegreesOfFreedom=0.0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput066() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.distribution.FDistributionImpl", "org.apache.commons.math.distribution.FDistributionImpl", "getDomainLowerBound", new String[]{"double"}, new String[]{"0.5"}, false, 2, new String[][]{{"org.apache.commons.math.distribution.FDistributionImpl", "setNumeratorDegreesOfFreedom", "double", "-1.0"}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("0.0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getDenominatorDegreesOfFreedom=Infinity, getNumeratorDegreesOfFreedom=1.0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput067() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.distribution.FDistributionImpl", "org.apache.commons.math.distribution.FDistributionImpl", "getDomainLowerBound", new String[]{"double"}, new String[]{"-8516354193418641566"}, false, 0, new String[][]{{"org.apache.commons.math.distribution.FDistributionImpl", "setDenominatorDegreesOfFreedom", "double", "1.7976931348623155E308"}, {"org.apache.commons.math.distribution.FDistributionImpl", "getDomainLowerBound", "double", "-8.5163541934186419E17"}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("0.0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getDenominatorDegreesOfFreedom=1.7976931348623155E308, getNumeratorDegreesOfFreedom=0.0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput068() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.distribution.FDistributionImpl", "org.apache.commons.math.distribution.FDistributionImpl", "cumulativeProbability", new String[]{"double"}, new String[]{"-1.7976931348623157E308"}, false, 3, new String[][]{{"org.apache.commons.math.distribution.FDistributionImpl", "setDenominatorDegreesOfFreedom", "double", "1.3199999999999998"}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("0.0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getDenominatorDegreesOfFreedom=1.3199999999999998, getNumeratorDegreesOfFreedom=0.0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput069() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.distribution.FDistributionImpl", "org.apache.commons.math.distribution.FDistributionImpl", "inverseCumulativeProbability", new String[]{"double"}, new String[]{"1.0"}, false, 5, new String[][]{{"org.apache.commons.math.distribution.FDistributionImpl", "setNumeratorDegreesOfFreedom", "double", "1.7976931348623157E308"}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("Infinity", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getDenominatorDegreesOfFreedom=0.0, getNumeratorDegreesOfFreedom=1.7976931348623157E308}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput070() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.distribution.FDistributionImpl", "org.apache.commons.math.distribution.FDistributionImpl", "cumulativeProbability", new String[]{"double", "double"}, new String[]{"-4.2581770967093207E18", "-0.5"}, false, 2, new String[][]{}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("0.0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getDenominatorDegreesOfFreedom=Infinity, getNumeratorDegreesOfFreedom=1.0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput071() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.distribution.FDistributionImpl", "org.apache.commons.math.distribution.FDistributionImpl", "cumulativeProbability", new String[]{"double"}, new String[]{"-2.0"}, false, 5, new String[][]{}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("0.0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getDenominatorDegreesOfFreedom=0.0, getNumeratorDegreesOfFreedom=0.0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput072() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.distribution.FDistributionImpl", "org.apache.commons.math.distribution.FDistributionImpl", "inverseCumulativeProbability", new String[]{"double"}, new String[]{"NaN"}, false, 2, new String[][]{{"org.apache.commons.math.distribution.FDistributionImpl", "cumulativeProbability", "double,double", "8.5163541934186414E18", "NaN"}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("NaN", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getDenominatorDegreesOfFreedom=Infinity, getNumeratorDegreesOfFreedom=1.0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput073() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math.distribution.FDistributionImpl", "org.apache.commons.math.distribution.FDistributionImpl", "cumulativeProbability", new String[]{"double", "double"}, new String[]{"1.7976931348623157E308", "-Infinity"}, false, 0, null, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput074() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.distribution.FDistributionImpl", "org.apache.commons.math.distribution.FDistributionImpl", "inverseCumulativeProbability", new String[]{"double"}, new String[]{"0.995"}, false, 2, new String[][]{{"org.apache.commons.math.distribution.FDistributionImpl", "setNumeratorDegreesOfFreedom", "double", "0.372"}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("NaN", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getDenominatorDegreesOfFreedom=Infinity, getNumeratorDegreesOfFreedom=0.372}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput075() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.distribution.FDistributionImpl", "org.apache.commons.math.distribution.FDistributionImpl", "setNumeratorDegreesOfFreedom", new String[]{"double"}, new String[]{"NaN"}, false, 3, new String[][]{{"org.apache.commons.math.distribution.FDistributionImpl", "getNumeratorDegreesOfFreedom", ""}}, 3);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getDenominatorDegreesOfFreedom=0.0, getNumeratorDegreesOfFreedom=NaN}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput076() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.distribution.FDistributionImpl", "org.apache.commons.math.distribution.FDistributionImpl", "cumulativeProbability", new String[]{"double", "double"}, new String[]{"-4.258177096709321E19", "-2.0000000000000004"}, false, 3, new String[][]{}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("0.0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getDenominatorDegreesOfFreedom=0.0, getNumeratorDegreesOfFreedom=0.0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput077() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.distribution.FDistributionImpl", "org.apache.commons.math.distribution.FDistributionImpl", "getNumeratorDegreesOfFreedom", new String[]{}, new String[]{}, false, 3, new String[][]{{"org.apache.commons.math.distribution.FDistributionImpl", "setNumeratorDegreesOfFreedom", "double", "0.5"}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("0.5", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getDenominatorDegreesOfFreedom=0.0, getNumeratorDegreesOfFreedom=0.5}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput078() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.distribution.FDistributionImpl", "org.apache.commons.math.distribution.FDistributionImpl", "getNumeratorDegreesOfFreedom", new String[]{}, new String[]{}, false, 2, new String[][]{}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("1.0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getDenominatorDegreesOfFreedom=Infinity, getNumeratorDegreesOfFreedom=1.0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput079() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.distribution.FDistributionImpl", "org.apache.commons.math.distribution.FDistributionImpl", "getNumeratorDegreesOfFreedom", new String[]{}, new String[]{}, false);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("0.0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getDenominatorDegreesOfFreedom=0.0, getNumeratorDegreesOfFreedom=0.0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput080() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.distribution.FDistributionImpl", "org.apache.commons.math.distribution.FDistributionImpl", "getDomainLowerBound", new String[]{"double"}, new String[]{"0.6599999999999999"}, false);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("0.0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getDenominatorDegreesOfFreedom=0.0, getNumeratorDegreesOfFreedom=0.0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput081() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math.distribution.FDistributionImpl", "org.apache.commons.math.distribution.FDistributionImpl", "inverseCumulativeProbability", new String[]{"double"}, new String[]{"-Infinity"}, false); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput082() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.distribution.FDistributionImpl", "org.apache.commons.math.distribution.FDistributionImpl", "cumulativeProbability", new String[]{"double", "double"}, new String[]{"-Infinity", "2.0000000000000004"}, false);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("NaN", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getDenominatorDegreesOfFreedom=0.0, getNumeratorDegreesOfFreedom=0.0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput083() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.distribution.FDistributionImpl", "org.apache.commons.math.distribution.FDistributionImpl", "getDomainLowerBound", new String[]{"double"}, new String[]{"-30.0"}, false, 7, new String[][]{});
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("0.0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getDenominatorDegreesOfFreedom=Infinity, getNumeratorDegreesOfFreedom=1.0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput084() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.distribution.FDistributionImpl", "org.apache.commons.math.distribution.FDistributionImpl", "getInitialDomain", new String[]{"double"}, new String[]{"Infinity"}, false);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("1.0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getDenominatorDegreesOfFreedom=0.0, getNumeratorDegreesOfFreedom=0.0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput085() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.distribution.FDistributionImpl", "org.apache.commons.math.distribution.FDistributionImpl", "setNumeratorDegreesOfFreedom", new String[]{"double"}, new String[]{"4.9E-324"}, false, 7, new String[][]{{"org.apache.commons.math.distribution.FDistributionImpl", "getDomainLowerBound", "double", "-8.5163541934186414E18"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getDenominatorDegreesOfFreedom=Infinity, getNumeratorDegreesOfFreedom=4.9E-324}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput086() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.distribution.FDistributionImpl", "org.apache.commons.math.distribution.FDistributionImpl", "getNumeratorDegreesOfFreedom", new String[]{}, new String[]{}, false, 7, new String[][]{{"org.apache.commons.math.distribution.FDistributionImpl", "getInitialDomain", "double", "NaN"}});
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("1.0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getDenominatorDegreesOfFreedom=Infinity, getNumeratorDegreesOfFreedom=1.0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput087() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math.distribution.FDistributionImpl", "org.apache.commons.math.distribution.FDistributionImpl", "cumulativeProbability", new String[]{"double", "double"}, new String[]{"0.1", "-Infinity"}, false, 2, new String[][]{}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput088() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.distribution.FDistributionImpl", "org.apache.commons.math.distribution.FDistributionImpl", "getDenominatorDegreesOfFreedom", new String[]{}, new String[]{}, false, 7, new String[][]{{"org.apache.commons.math.distribution.FDistributionImpl", "setNumeratorDegreesOfFreedom", "double", "0.5"}});
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("Infinity", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getDenominatorDegreesOfFreedom=Infinity, getNumeratorDegreesOfFreedom=0.5}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput089() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.distribution.FDistributionImpl", "org.apache.commons.math.distribution.FDistributionImpl", "cumulativeProbability", new String[]{"double"}, new String[]{"1.7976931348623157E308"}, false, 3, new String[][]{});
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("NaN", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getDenominatorDegreesOfFreedom=0.0, getNumeratorDegreesOfFreedom=0.0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput090() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math.distribution.FDistributionImpl", "org.apache.commons.math.distribution.FDistributionImpl", "setDenominatorDegreesOfFreedom", new String[]{"double"}, new String[]{"-8516354193418641566"}, false, 7, new String[][]{{"org.apache.commons.math.distribution.FDistributionImpl", "getInitialDomain", "double", "-Infinity"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput091() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.distribution.FDistributionImpl", "org.apache.commons.math.distribution.FDistributionImpl", "getDenominatorDegreesOfFreedom", new String[]{}, new String[]{}, false);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("0.0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getDenominatorDegreesOfFreedom=0.0, getNumeratorDegreesOfFreedom=0.0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput092() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.distribution.FDistributionImpl", "org.apache.commons.math.distribution.FDistributionImpl", "setDenominatorDegreesOfFreedom", new String[]{"double"}, new String[]{"Infinity"}, false, 1, new String[][]{});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getDenominatorDegreesOfFreedom=Infinity, getNumeratorDegreesOfFreedom=0.0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput093() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.distribution.FDistributionImpl", "org.apache.commons.math.distribution.FDistributionImpl", "getDomainUpperBound", new String[]{"double"}, new String[]{"Infinity"}, false);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("1.7976931348623157E308", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getDenominatorDegreesOfFreedom=0.0, getNumeratorDegreesOfFreedom=0.0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput094() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.distribution.FDistributionImpl", "org.apache.commons.math.distribution.FDistributionImpl", "getDenominatorDegreesOfFreedom", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.math.distribution.FDistributionImpl", "setDenominatorDegreesOfFreedom", "double", "-1.7976931348623155E308"}, {"org.apache.commons.math.distribution.FDistributionImpl", "setDenominatorDegreesOfFreedom", "double", "0.32999999999999996"}});
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("0.32999999999999996", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getDenominatorDegreesOfFreedom=0.32999999999999996, getNumeratorDegreesOfFreedom=0.0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput095() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.distribution.FDistributionImpl", "org.apache.commons.math.distribution.FDistributionImpl", "cumulativeProbability", new String[]{"double"}, new String[]{"-1.7976931348623158E307"}, false, 2, new String[][]{});
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("0.0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getDenominatorDegreesOfFreedom=Infinity, getNumeratorDegreesOfFreedom=1.0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput096() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.distribution.FDistributionImpl", "org.apache.commons.math.distribution.FDistributionImpl", "setNumeratorDegreesOfFreedom", new String[]{"double"}, new String[]{"Infinity"}, false, 2, new String[][]{});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getDenominatorDegreesOfFreedom=Infinity, getNumeratorDegreesOfFreedom=Infinity}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput097() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.distribution.FDistributionImpl", "org.apache.commons.math.distribution.FDistributionImpl", "setDenominatorDegreesOfFreedom", new String[]{"double"}, new String[]{"2.0"}, false, 3, new String[][]{});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getDenominatorDegreesOfFreedom=2.0, getNumeratorDegreesOfFreedom=0.0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput098() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.distribution.FDistributionImpl", "org.apache.commons.math.distribution.FDistributionImpl", "getDomainUpperBound", new String[]{"double"}, new String[]{"0.1"}, false, 7, new String[][]{{"org.apache.commons.math.distribution.FDistributionImpl", "cumulativeProbability", "double,double", "-Infinity", "-2.1569999999999996"}});
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("1.7976931348623157E308", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getDenominatorDegreesOfFreedom=Infinity, getNumeratorDegreesOfFreedom=1.0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput099() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.distribution.FDistributionImpl", "org.apache.commons.math.distribution.FDistributionImpl", "setDenominatorDegreesOfFreedom", new String[]{"double"}, new String[]{"8.5163541934186414E18"}, false, 7, new String[][]{});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getDenominatorDegreesOfFreedom=8.5163541934186414E18, getNumeratorDegreesOfFreedom=1.0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput100() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.distribution.FDistributionImpl", "org.apache.commons.math.distribution.FDistributionImpl", "cumulativeProbability", new String[]{"double", "double"}, new String[]{"0.6599999999999999", "Infinity"}, false, 7, new String[][]{{"org.apache.commons.math.distribution.FDistributionImpl", "setNumeratorDegreesOfFreedom", "double", "0.06599999999999999"}});
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("NaN", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getDenominatorDegreesOfFreedom=Infinity, getNumeratorDegreesOfFreedom=0.06599999999999999}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput101() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.distribution.FDistributionImpl", "org.apache.commons.math.distribution.FDistributionImpl", "getDomainUpperBound", new String[]{"double"}, new String[]{"2.0"}, false, 5, new String[][]{{"org.apache.commons.math.distribution.FDistributionImpl", "setNumeratorDegreesOfFreedom", "double", "2.0000000000000004"}});
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("1.7976931348623157E308", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getDenominatorDegreesOfFreedom=0.0, getNumeratorDegreesOfFreedom=2.0000000000000004}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput102() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math.distribution.FDistributionImpl", "org.apache.commons.math.distribution.FDistributionImpl", "setNumeratorDegreesOfFreedom", new String[]{"double"}, new String[]{"-1.0"}, false, 0, new String[][]{{"org.apache.commons.math.distribution.FDistributionImpl", "setNumeratorDegreesOfFreedom", "double", "1.7976931348623157E308"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput103() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.distribution.FDistributionImpl", "org.apache.commons.math.distribution.FDistributionImpl", "cumulativeProbability", new String[]{"double", "double"}, new String[]{"-4.2581770967093207E18", "2.1"}, false, 7, new String[][]{});
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("NaN", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getDenominatorDegreesOfFreedom=Infinity, getNumeratorDegreesOfFreedom=1.0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput104() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.distribution.FDistributionImpl", "org.apache.commons.math.distribution.FDistributionImpl", "cumulativeProbability", new String[]{"double"}, new String[]{"-2.1"}, false, 1, new String[][]{{"org.apache.commons.math.distribution.FDistributionImpl", "setNumeratorDegreesOfFreedom", "double", "39.9"}});
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("0.0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getDenominatorDegreesOfFreedom=0.0, getNumeratorDegreesOfFreedom=39.9}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput105() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.distribution.FDistributionImpl", "org.apache.commons.math.distribution.FDistributionImpl", "getInitialDomain", new String[]{"double"}, new String[]{"1.7976931348623158E307"}, false, 2, new String[][]{});
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("NaN", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getDenominatorDegreesOfFreedom=Infinity, getNumeratorDegreesOfFreedom=1.0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput106() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.distribution.FDistributionImpl", "org.apache.commons.math.distribution.FDistributionImpl", "setNumeratorDegreesOfFreedom", new String[]{"double"}, new String[]{"NaN"}, false);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getDenominatorDegreesOfFreedom=0.0, getNumeratorDegreesOfFreedom=NaN}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput107() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.distribution.FDistributionImpl", "org.apache.commons.math.distribution.FDistributionImpl", "setDenominatorDegreesOfFreedom", new String[]{"double"}, new String[]{"0.9999999999999999"}, false, 7, new String[][]{{"org.apache.commons.math.distribution.FDistributionImpl", "inverseCumulativeProbability", "double", "-1.7976931348623157E308"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getDenominatorDegreesOfFreedom=0.9999999999999999, getNumeratorDegreesOfFreedom=1.0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput108() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.distribution.FDistributionImpl", "org.apache.commons.math.distribution.FDistributionImpl", "cumulativeProbability", new String[]{"double", "double"}, new String[]{"-Infinity", "-Infinity"}, false, 7, new String[][]{{"org.apache.commons.math.distribution.FDistributionImpl", "getNumeratorDegreesOfFreedom", ""}, {"org.apache.commons.math.distribution.FDistributionImpl", "getDenominatorDegreesOfFreedom", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("0.0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getDenominatorDegreesOfFreedom=Infinity, getNumeratorDegreesOfFreedom=1.0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput109() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.distribution.FDistributionImpl", "org.apache.commons.math.distribution.FDistributionImpl", "getDomainUpperBound", new String[]{"double"}, new String[]{"2.0"}, false, 0, new String[][]{{"org.apache.commons.math.distribution.FDistributionImpl", "setNumeratorDegreesOfFreedom", "double", "NaN"}});
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("1.7976931348623157E308", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getDenominatorDegreesOfFreedom=0.0, getNumeratorDegreesOfFreedom=NaN}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput110() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.distribution.FDistributionImpl", "org.apache.commons.math.distribution.FDistributionImpl", "setNumeratorDegreesOfFreedom", new String[]{"double"}, new String[]{"Infinity"}, false);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getDenominatorDegreesOfFreedom=0.0, getNumeratorDegreesOfFreedom=Infinity}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput111() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.distribution.FDistributionImpl", "org.apache.commons.math.distribution.FDistributionImpl", "getDomainUpperBound", new String[]{"double"}, new String[]{"1.3199999999999998"}, false, 0, new String[][]{{"org.apache.commons.math.distribution.FDistributionImpl", "setNumeratorDegreesOfFreedom", "double", "Infinity"}});
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("1.7976931348623157E308", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getDenominatorDegreesOfFreedom=0.0, getNumeratorDegreesOfFreedom=Infinity}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput112() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.distribution.FDistributionImpl", "org.apache.commons.math.distribution.FDistributionImpl", "getInitialDomain", new String[]{"double"}, new String[]{"-0.5"}, false, 7, new String[][]{{"org.apache.commons.math.distribution.FDistributionImpl", "getDomainLowerBound", "double", "50.0"}, {"org.apache.commons.math.distribution.FDistributionImpl", "setNumeratorDegreesOfFreedom", "double", "NaN"}});
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("NaN", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getDenominatorDegreesOfFreedom=Infinity, getNumeratorDegreesOfFreedom=NaN}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput113() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.distribution.FDistributionImpl", "org.apache.commons.math.distribution.FDistributionImpl", "setNumeratorDegreesOfFreedom", new String[]{"double"}, new String[]{"57.5"}, false, 7, new String[][]{{"org.apache.commons.math.distribution.FDistributionImpl", "cumulativeProbability", "double,double", "1.7976931348623157E308", "-1.0"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getDenominatorDegreesOfFreedom=Infinity, getNumeratorDegreesOfFreedom=57.5}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput114() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.distribution.FDistributionImpl", "org.apache.commons.math.distribution.FDistributionImpl", "getDenominatorDegreesOfFreedom", new String[]{}, new String[]{}, false, 6, new String[][]{{"org.apache.commons.math.distribution.FDistributionImpl", "setDenominatorDegreesOfFreedom", "double", "0.020000000000000004"}});
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("0.020000000000000004", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getDenominatorDegreesOfFreedom=0.020000000000000004, getNumeratorDegreesOfFreedom=0.0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput115() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.distribution.FDistributionImpl", "org.apache.commons.math.distribution.FDistributionImpl", "getInitialDomain", new String[]{"double"}, new String[]{"-1.7976931348623157E308"}, false, 4, new String[][]{{"org.apache.commons.math.distribution.FDistributionImpl", "getDomainUpperBound", "double", "-8.5163541934186424E18"}, {"org.apache.commons.math.distribution.FDistributionImpl", "setNumeratorDegreesOfFreedom", "double", "2.1"}});
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("1.0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getDenominatorDegreesOfFreedom=0.0, getNumeratorDegreesOfFreedom=2.1}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput116() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.distribution.FDistributionImpl", "org.apache.commons.math.distribution.FDistributionImpl", "inverseCumulativeProbability", new String[]{"double"}, new String[]{"0.5"}, false);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("2.0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getDenominatorDegreesOfFreedom=0.0, getNumeratorDegreesOfFreedom=0.0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput117() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.distribution.FDistributionImpl", "org.apache.commons.math.distribution.FDistributionImpl", "getInitialDomain", new String[]{"double"}, new String[]{"6.5"}, false, 0, new String[][]{{"org.apache.commons.math.distribution.FDistributionImpl", "setDenominatorDegreesOfFreedom", "double", "-5.0"}, {"org.apache.commons.math.distribution.FDistributionImpl", "setDenominatorDegreesOfFreedom", "double", "0.07999999999999995"}});
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("1.0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getDenominatorDegreesOfFreedom=0.07999999999999995, getNumeratorDegreesOfFreedom=0.0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput118() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.distribution.FDistributionImpl", "org.apache.commons.math.distribution.FDistributionImpl", "inverseCumulativeProbability", new String[]{"double"}, new String[]{"NaN"}, false, 2, new String[][]{});
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("NaN", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getDenominatorDegreesOfFreedom=Infinity, getNumeratorDegreesOfFreedom=1.0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput119() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.distribution.FDistributionImpl", "org.apache.commons.math.distribution.FDistributionImpl", "cumulativeProbability", new String[]{"double", "double"}, new String[]{"-1.0", "1.0000000000000002"}, false, 7, new String[][]{{"org.apache.commons.math.distribution.FDistributionImpl", "setDenominatorDegreesOfFreedom", "double", "0.05"}});
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("0.10343738796881696", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getDenominatorDegreesOfFreedom=0.05, getNumeratorDegreesOfFreedom=1.0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput120() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.distribution.FDistributionImpl", "org.apache.commons.math.distribution.FDistributionImpl", "getNumeratorDegreesOfFreedom", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.math.distribution.FDistributionImpl", "setNumeratorDegreesOfFreedom", "double", "0.07999999999999996"}});
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("0.07999999999999996", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getDenominatorDegreesOfFreedom=0.0, getNumeratorDegreesOfFreedom=0.07999999999999996}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput121() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.distribution.FDistributionImpl", "org.apache.commons.math.distribution.FDistributionImpl", "setDenominatorDegreesOfFreedom", new String[]{"double"}, new String[]{"1.7976931348623157E308"}, false, 0, new String[][]{{"org.apache.commons.math.distribution.FDistributionImpl", "getDomainLowerBound", "double", "NaN"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getDenominatorDegreesOfFreedom=1.7976931348623157E308, getNumeratorDegreesOfFreedom=0.0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput122() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.distribution.FDistributionImpl", "org.apache.commons.math.distribution.FDistributionImpl", "inverseCumulativeProbability", new String[]{"double"}, new String[]{"NaN"}, false, 0, new String[][]{{"org.apache.commons.math.distribution.FDistributionImpl", "setNumeratorDegreesOfFreedom", "double", "15.6"}});
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("2.0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getDenominatorDegreesOfFreedom=0.0, getNumeratorDegreesOfFreedom=15.6}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput123() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.distribution.FDistributionImpl", "org.apache.commons.math.distribution.FDistributionImpl", "getDenominatorDegreesOfFreedom", new String[]{}, new String[]{}, false, 7, new String[][]{{"org.apache.commons.math.distribution.FDistributionImpl", "inverseCumulativeProbability", "double", "2.0"}});
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("Infinity", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getDenominatorDegreesOfFreedom=Infinity, getNumeratorDegreesOfFreedom=1.0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput124() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.distribution.FDistributionImpl", "org.apache.commons.math.distribution.FDistributionImpl", "inverseCumulativeProbability", new String[]{"double"}, new String[]{"1.0"}, false, 0, new String[][]{{"org.apache.commons.math.distribution.FDistributionImpl", "setNumeratorDegreesOfFreedom", "double", "Infinity"}});
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("Infinity", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getDenominatorDegreesOfFreedom=0.0, getNumeratorDegreesOfFreedom=Infinity}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput125() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.distribution.FDistributionImpl", "org.apache.commons.math.distribution.FDistributionImpl", "inverseCumulativeProbability", new String[]{"double"}, new String[]{"-0.0"}, false);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("0.0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getDenominatorDegreesOfFreedom=0.0, getNumeratorDegreesOfFreedom=0.0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput126() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.distribution.FDistributionImpl", "org.apache.commons.math.distribution.FDistributionImpl", "cumulativeProbability", new String[]{"double", "double"}, new String[]{"-2.1", "1.0"}, false, 0, new String[][]{{"org.apache.commons.math.distribution.FDistributionImpl", "setDenominatorDegreesOfFreedom", "double", "Infinity"}});
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("NaN", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getDenominatorDegreesOfFreedom=Infinity, getNumeratorDegreesOfFreedom=0.0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput127() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.distribution.FDistributionImpl", "org.apache.commons.math.distribution.FDistributionImpl", "getInitialDomain", new String[]{"double"}, new String[]{"-Infinity"}, false, 0, new String[][]{{"org.apache.commons.math.distribution.FDistributionImpl", "setNumeratorDegreesOfFreedom", "double", "1.7976931348623157E308"}});
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("1.0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getDenominatorDegreesOfFreedom=0.0, getNumeratorDegreesOfFreedom=1.7976931348623157E308}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput128() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.distribution.FDistributionImpl", "org.apache.commons.math.distribution.FDistributionImpl", "cumulativeProbability", new String[]{"double", "double"}, new String[]{"-8516354193418641566", "0.25"}, false, 1, new String[][]{{"org.apache.commons.math.distribution.FDistributionImpl", "setNumeratorDegreesOfFreedom", "double", "NaN"}});
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("NaN", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getDenominatorDegreesOfFreedom=0.0, getNumeratorDegreesOfFreedom=NaN}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput129() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.distribution.FDistributionImpl", "org.apache.commons.math.distribution.FDistributionImpl", "cumulativeProbability", new String[]{"double", "double"}, new String[]{"0.0", "1.0000000000000002"}, false, 7, new String[][]{{"org.apache.commons.math.distribution.FDistributionImpl", "setDenominatorDegreesOfFreedom", "double", "1.0"}});
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("0.5000000000000009", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getDenominatorDegreesOfFreedom=1.0, getNumeratorDegreesOfFreedom=1.0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput130() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.distribution.FDistributionImpl", "org.apache.commons.math.distribution.FDistributionImpl", "getNumeratorDegreesOfFreedom", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.math.distribution.FDistributionImpl", "setDenominatorDegreesOfFreedom", "double", "19.0"}});
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("0.0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getDenominatorDegreesOfFreedom=19.0, getNumeratorDegreesOfFreedom=0.0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput131() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.distribution.FDistributionImpl", "org.apache.commons.math.distribution.FDistributionImpl", "getDomainLowerBound", new String[]{"double"}, new String[]{"0.32999999999999996"}, false, 4, new String[][]{{"org.apache.commons.math.distribution.FDistributionImpl", "setNumeratorDegreesOfFreedom", "double", "Infinity"}});
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("0.0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getDenominatorDegreesOfFreedom=0.0, getNumeratorDegreesOfFreedom=Infinity}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput132() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.distribution.FDistributionImpl", "org.apache.commons.math.distribution.FDistributionImpl", "inverseCumulativeProbability", new String[]{"double"}, new String[]{"NaN"}, false, 0, new String[][]{{"org.apache.commons.math.distribution.FDistributionImpl", "setDenominatorDegreesOfFreedom", "double", "NaN"}, {"org.apache.commons.math.distribution.FDistributionImpl", "setNumeratorDegreesOfFreedom", "double", "0.0"}});
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("2.0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getDenominatorDegreesOfFreedom=NaN, getNumeratorDegreesOfFreedom=0.0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput133() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.distribution.FDistributionImpl", "org.apache.commons.math.distribution.FDistributionImpl", "getDomainLowerBound", new String[]{"double"}, new String[]{"-Infinity"}, false, 6, new String[][]{{"org.apache.commons.math.distribution.FDistributionImpl", "setDenominatorDegreesOfFreedom", "double", "Infinity"}});
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("0.0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getDenominatorDegreesOfFreedom=Infinity, getNumeratorDegreesOfFreedom=0.0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput134() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.distribution.FDistributionImpl", "org.apache.commons.math.distribution.FDistributionImpl", "getNumeratorDegreesOfFreedom", new String[]{}, new String[]{}, false, 1, new String[][]{{"org.apache.commons.math.distribution.FDistributionImpl", "setNumeratorDegreesOfFreedom", "double", "2.0"}});
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("2.0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getDenominatorDegreesOfFreedom=0.0, getNumeratorDegreesOfFreedom=2.0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput135() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.distribution.FDistributionImpl", "org.apache.commons.math.distribution.FDistributionImpl", "getNumeratorDegreesOfFreedom", new String[]{}, new String[]{}, false, 6, new String[][]{{"org.apache.commons.math.distribution.FDistributionImpl", "setDenominatorDegreesOfFreedom", "double", "Infinity"}, {"org.apache.commons.math.distribution.FDistributionImpl", "cumulativeProbability", "double", "-1.0"}});
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("0.0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getDenominatorDegreesOfFreedom=Infinity, getNumeratorDegreesOfFreedom=0.0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput136() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.distribution.FDistributionImpl", "org.apache.commons.math.distribution.FDistributionImpl", "getNumeratorDegreesOfFreedom", new String[]{}, new String[]{}, false, 7, new String[][]{{"org.apache.commons.math.distribution.FDistributionImpl", "setNumeratorDegreesOfFreedom", "double", "NaN"}});
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("NaN", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getDenominatorDegreesOfFreedom=Infinity, getNumeratorDegreesOfFreedom=NaN}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput137() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.distribution.FDistributionImpl", "org.apache.commons.math.distribution.FDistributionImpl", "setNumeratorDegreesOfFreedom", new String[]{"double"}, new String[]{"Infinity"}, false, 0, null, 3);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getDenominatorDegreesOfFreedom=0.0, getNumeratorDegreesOfFreedom=Infinity}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput138() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.distribution.FDistributionImpl", "org.apache.commons.math.distribution.FDistributionImpl", "getInitialDomain", new String[]{"double"}, new String[]{"-4.22"}, false, 5, new String[][]{{"org.apache.commons.math.distribution.FDistributionImpl", "getInitialDomain", "double", "0.0"}, {"org.apache.commons.math.distribution.FDistributionImpl", "setDenominatorDegreesOfFreedom", "double", "Infinity"}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("NaN", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getDenominatorDegreesOfFreedom=Infinity, getNumeratorDegreesOfFreedom=0.0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput139() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math.distribution.FDistributionImpl", "org.apache.commons.math.distribution.FDistributionImpl", "setNumeratorDegreesOfFreedom", new String[]{"double"}, new String[]{"-0.5000000000000002"}, false, 5, new String[][]{{"org.apache.commons.math.distribution.FDistributionImpl", "inverseCumulativeProbability", "double", "-2.117"}}, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput140() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.distribution.FDistributionImpl", "org.apache.commons.math.distribution.FDistributionImpl", "getInitialDomain", new String[]{"double"}, new String[]{"1.7976931348623157E308"}, false, 0, new String[][]{{"org.apache.commons.math.distribution.FDistributionImpl", "setDenominatorDegreesOfFreedom", "double", "1.7976931348623155E308"}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("1.0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getDenominatorDegreesOfFreedom=1.7976931348623155E308, getNumeratorDegreesOfFreedom=0.0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput141() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.distribution.FDistributionImpl", "org.apache.commons.math.distribution.FDistributionImpl", "cumulativeProbability", new String[]{"double"}, new String[]{"1.2"}, false, 2, new String[][]{}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("NaN", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getDenominatorDegreesOfFreedom=Infinity, getNumeratorDegreesOfFreedom=1.0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput142() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.distribution.FDistributionImpl", "org.apache.commons.math.distribution.FDistributionImpl", "inverseCumulativeProbability", new String[]{"double"}, new String[]{"NaN"}, false, 1, new String[][]{{"org.apache.commons.math.distribution.FDistributionImpl", "getNumeratorDegreesOfFreedom", ""}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("2.0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getDenominatorDegreesOfFreedom=0.0, getNumeratorDegreesOfFreedom=0.0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput143() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.distribution.FDistributionImpl", "org.apache.commons.math.distribution.FDistributionImpl", "inverseCumulativeProbability", new String[]{"double"}, new String[]{"0.5"}, false, 7, new String[][]{}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("NaN", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getDenominatorDegreesOfFreedom=Infinity, getNumeratorDegreesOfFreedom=1.0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput144() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.distribution.FDistributionImpl", "org.apache.commons.math.distribution.FDistributionImpl", "cumulativeProbability", new String[]{"double"}, new String[]{"0.1999999999999999"}, false, 3, new String[][]{{"org.apache.commons.math.distribution.FDistributionImpl", "setNumeratorDegreesOfFreedom", "double", "1.0"}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("NaN", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getDenominatorDegreesOfFreedom=0.0, getNumeratorDegreesOfFreedom=1.0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput145() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.distribution.FDistributionImpl", "org.apache.commons.math.distribution.FDistributionImpl", "getDomainLowerBound", new String[]{"double"}, new String[]{"0.5"}, false, 7, new String[][]{{"org.apache.commons.math.distribution.FDistributionImpl", "setNumeratorDegreesOfFreedom", "double", "NaN"}, {"org.apache.commons.math.distribution.FDistributionImpl", "inverseCumulativeProbability", "double", "Infinity"}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("0.0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getDenominatorDegreesOfFreedom=Infinity, getNumeratorDegreesOfFreedom=NaN}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput146() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.distribution.FDistributionImpl", "org.apache.commons.math.distribution.FDistributionImpl", "getInitialDomain", new String[]{"double"}, new String[]{"NaN"}, false, 0, new String[][]{{"org.apache.commons.math.distribution.FDistributionImpl", "getDenominatorDegreesOfFreedom", ""}, {"org.apache.commons.math.distribution.FDistributionImpl", "setNumeratorDegreesOfFreedom", "double", "1.3199999999999998"}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("1.0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getDenominatorDegreesOfFreedom=0.0, getNumeratorDegreesOfFreedom=1.3199999999999998}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput147() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.distribution.FDistributionImpl", "org.apache.commons.math.distribution.FDistributionImpl", "getDenominatorDegreesOfFreedom", new String[]{}, new String[]{}, false, 2, new String[][]{{"org.apache.commons.math.distribution.FDistributionImpl", "cumulativeProbability", "double", "71.0"}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("Infinity", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getDenominatorDegreesOfFreedom=Infinity, getNumeratorDegreesOfFreedom=1.0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput148() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.distribution.FDistributionImpl", "org.apache.commons.math.distribution.FDistributionImpl", "cumulativeProbability", new String[]{"double", "double"}, new String[]{"-1.0", "-0.25"}, false, 0, null, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("0.0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getDenominatorDegreesOfFreedom=0.0, getNumeratorDegreesOfFreedom=0.0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput149() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.distribution.FDistributionImpl", "org.apache.commons.math.distribution.FDistributionImpl", "getDomainUpperBound", new String[]{"double"}, new String[]{"Infinity"}, false, 3, new String[][]{{"org.apache.commons.math.distribution.FDistributionImpl", "setNumeratorDegreesOfFreedom", "double", "NaN"}, {"org.apache.commons.math.distribution.FDistributionImpl", "getInitialDomain", "double", "-0.26"}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("1.7976931348623157E308", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getDenominatorDegreesOfFreedom=0.0, getNumeratorDegreesOfFreedom=NaN}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput150() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math.distribution.FDistributionImpl", "org.apache.commons.math.distribution.FDistributionImpl", "setDenominatorDegreesOfFreedom", new String[]{"double"}, new String[]{"-8.5163541934186404E18"}, false, 3, new String[][]{}, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput151() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.distribution.FDistributionImpl", "org.apache.commons.math.distribution.FDistributionImpl", "getInitialDomain", new String[]{"double"}, new String[]{"NaN"}, false, 0, new String[][]{{"org.apache.commons.math.distribution.FDistributionImpl", "setNumeratorDegreesOfFreedom", "double", "20.0"}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("1.0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getDenominatorDegreesOfFreedom=0.0, getNumeratorDegreesOfFreedom=20.0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput152() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.distribution.FDistributionImpl", "org.apache.commons.math.distribution.FDistributionImpl", "cumulativeProbability", new String[]{"double", "double"}, new String[]{"NaN", "0.0"}, false, 7, new String[][]{}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("NaN", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getDenominatorDegreesOfFreedom=Infinity, getNumeratorDegreesOfFreedom=1.0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput153() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.distribution.FDistributionImpl", "org.apache.commons.math.distribution.FDistributionImpl", "cumulativeProbability", new String[]{"double"}, new String[]{"-1.0"}, false, 0, new String[][]{{"org.apache.commons.math.distribution.FDistributionImpl", "setNumeratorDegreesOfFreedom", "double", "1.1099999999999999"}});
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("0.0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getDenominatorDegreesOfFreedom=0.0, getNumeratorDegreesOfFreedom=1.1099999999999999}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput154() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.distribution.FDistributionImpl", "org.apache.commons.math.distribution.FDistributionImpl", "getDenominatorDegreesOfFreedom", new String[]{}, new String[]{}, false, 2, new String[][]{}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("Infinity", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getDenominatorDegreesOfFreedom=Infinity, getNumeratorDegreesOfFreedom=1.0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput155() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.distribution.FDistributionImpl", "org.apache.commons.math.distribution.FDistributionImpl", "setDenominatorDegreesOfFreedom", new String[]{"double"}, new String[]{"1.989"}, false, 6, new String[][]{}, 1);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getDenominatorDegreesOfFreedom=1.989, getNumeratorDegreesOfFreedom=0.0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput156() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.distribution.FDistributionImpl", "org.apache.commons.math.distribution.FDistributionImpl", "cumulativeProbability", new String[]{"double", "double"}, new String[]{"1.0", "4.0"}, false, 0, new String[][]{{"org.apache.commons.math.distribution.FDistributionImpl", "setDenominatorDegreesOfFreedom", "double", "0.5"}, {"org.apache.commons.math.distribution.FDistributionImpl", "getNumeratorDegreesOfFreedom", ""}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("NaN", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getDenominatorDegreesOfFreedom=0.5, getNumeratorDegreesOfFreedom=0.0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput157() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.distribution.FDistributionImpl", "org.apache.commons.math.distribution.FDistributionImpl", "inverseCumulativeProbability", new String[]{"double"}, new String[]{"NaN"}, false, 2, new String[][]{{"org.apache.commons.math.distribution.FDistributionImpl", "setNumeratorDegreesOfFreedom", "double", "5.9"}, {"org.apache.commons.math.distribution.FDistributionImpl", "getNumeratorDegreesOfFreedom", ""}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("NaN", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getDenominatorDegreesOfFreedom=Infinity, getNumeratorDegreesOfFreedom=5.9}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput158() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.distribution.FDistributionImpl", "org.apache.commons.math.distribution.FDistributionImpl", "inverseCumulativeProbability", new String[]{"double"}, new String[]{"1.0"}, false, 2, new String[][]{}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("Infinity", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getDenominatorDegreesOfFreedom=Infinity, getNumeratorDegreesOfFreedom=1.0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput159() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.distribution.FDistributionImpl", "org.apache.commons.math.distribution.FDistributionImpl", "inverseCumulativeProbability", new String[]{"double"}, new String[]{"NaN"}, false, 7, new String[][]{{"org.apache.commons.math.distribution.FDistributionImpl", "setDenominatorDegreesOfFreedom", "double", "1.3199999999999998"}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("2.0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getDenominatorDegreesOfFreedom=1.3199999999999998, getNumeratorDegreesOfFreedom=1.0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput160() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.distribution.FDistributionImpl", "org.apache.commons.math.distribution.FDistributionImpl", "getDomainLowerBound", new String[]{"double"}, new String[]{"2.0"}, false, 7, new String[][]{{"org.apache.commons.math.distribution.FDistributionImpl", "setNumeratorDegreesOfFreedom", "double", "6.6"}});
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("0.0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getDenominatorDegreesOfFreedom=Infinity, getNumeratorDegreesOfFreedom=6.6}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput161() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.distribution.FDistributionImpl", "org.apache.commons.math.distribution.FDistributionImpl", "getDenominatorDegreesOfFreedom", new String[]{}, new String[]{}, false, 2, new String[][]{{"org.apache.commons.math.distribution.FDistributionImpl", "getDomainLowerBound", "double", "1.7976931348623158E307"}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("Infinity", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getDenominatorDegreesOfFreedom=Infinity, getNumeratorDegreesOfFreedom=1.0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput162() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.distribution.FDistributionImpl", "org.apache.commons.math.distribution.FDistributionImpl", "setNumeratorDegreesOfFreedom", new String[]{"double"}, new String[]{"NaN"}, false, 1, new String[][]{}, 1);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getDenominatorDegreesOfFreedom=0.0, getNumeratorDegreesOfFreedom=NaN}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput163() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.distribution.FDistributionImpl", "org.apache.commons.math.distribution.FDistributionImpl", "getInitialDomain", new String[]{"double"}, new String[]{"-0.24"}, false, 4, new String[][]{{"org.apache.commons.math.distribution.FDistributionImpl", "setDenominatorDegreesOfFreedom", "double", "2.1"}, {"org.apache.commons.math.distribution.FDistributionImpl", "setNumeratorDegreesOfFreedom", "double", "2.0"}});
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("20.999999999999982", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getDenominatorDegreesOfFreedom=2.1, getNumeratorDegreesOfFreedom=2.0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput164() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.distribution.FDistributionImpl", "org.apache.commons.math.distribution.FDistributionImpl", "cumulativeProbability", new String[]{"double"}, new String[]{"0.482"}, false, 7, new String[][]{{"org.apache.commons.math.distribution.FDistributionImpl", "cumulativeProbability", "double,double", "-1.0", "8.5163541934186404E18"}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("NaN", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getDenominatorDegreesOfFreedom=Infinity, getNumeratorDegreesOfFreedom=1.0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput165() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.distribution.FDistributionImpl", "org.apache.commons.math.distribution.FDistributionImpl", "cumulativeProbability", new String[]{"double"}, new String[]{"0.83"}, false, 1, new String[][]{}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("NaN", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getDenominatorDegreesOfFreedom=0.0, getNumeratorDegreesOfFreedom=0.0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput166() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.distribution.FDistributionImpl", "org.apache.commons.math.distribution.FDistributionImpl", "getDomainLowerBound", new String[]{"double"}, new String[]{"-0.27"}, false, 2, new String[][]{}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("0.0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getDenominatorDegreesOfFreedom=Infinity, getNumeratorDegreesOfFreedom=1.0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput167() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math.distribution.FDistributionImpl", "org.apache.commons.math.distribution.FDistributionImpl", "setNumeratorDegreesOfFreedom", new String[]{"double"}, new String[]{"-2.1"}, false, 3, new String[][]{{"org.apache.commons.math.distribution.FDistributionImpl", "cumulativeProbability", "double,double", "-1.7976931348623157E308", "1.0"}, {"org.apache.commons.math.distribution.FDistributionImpl", "getDomainLowerBound", "double", "4.9E-324"}}, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput168() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.distribution.FDistributionImpl", "org.apache.commons.math.distribution.FDistributionImpl", "getInitialDomain", new String[]{"double"}, new String[]{"-Infinity"}, false, 3, new String[][]{{"org.apache.commons.math.distribution.FDistributionImpl", "setNumeratorDegreesOfFreedom", "double", "0.6039999999999998"}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("1.0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getDenominatorDegreesOfFreedom=0.0, getNumeratorDegreesOfFreedom=0.6039999999999998}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput169() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.distribution.FDistributionImpl", "org.apache.commons.math.distribution.FDistributionImpl", "getDenominatorDegreesOfFreedom", new String[]{}, new String[]{}, false, 1, new String[][]{{"org.apache.commons.math.distribution.FDistributionImpl", "setNumeratorDegreesOfFreedom", "double", "1.0"}});
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("0.0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getDenominatorDegreesOfFreedom=0.0, getNumeratorDegreesOfFreedom=1.0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput170() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.distribution.FDistributionImpl", "org.apache.commons.math.distribution.FDistributionImpl", "getDenominatorDegreesOfFreedom", new String[]{}, new String[]{}, false, 6, new String[][]{{"org.apache.commons.math.distribution.FDistributionImpl", "cumulativeProbability", "double,double", "-4.2581770967093207E18", "Infinity"}, {"org.apache.commons.math.distribution.FDistributionImpl", "setDenominatorDegreesOfFreedom", "double", "1.3199999999999998"}});
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("1.3199999999999998", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getDenominatorDegreesOfFreedom=1.3199999999999998, getNumeratorDegreesOfFreedom=0.0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput171() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.distribution.FDistributionImpl", "org.apache.commons.math.distribution.FDistributionImpl", "cumulativeProbability", new String[]{"double"}, new String[]{"-0.5"}, false, 0, new String[][]{{"org.apache.commons.math.distribution.FDistributionImpl", "setNumeratorDegreesOfFreedom", "double", "8.5163541934186424E18"}});
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("0.0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getDenominatorDegreesOfFreedom=0.0, getNumeratorDegreesOfFreedom=8.5163541934186424E18}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput172() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.distribution.FDistributionImpl", "org.apache.commons.math.distribution.FDistributionImpl", "getInitialDomain", new String[]{"double"}, new String[]{"2.0000000000000004"}, false, 6, new String[][]{{"org.apache.commons.math.distribution.FDistributionImpl", "setDenominatorDegreesOfFreedom", "double", "13.2"}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("1.1785714285714286", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getDenominatorDegreesOfFreedom=13.2, getNumeratorDegreesOfFreedom=0.0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput173() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.distribution.FDistributionImpl", "org.apache.commons.math.distribution.FDistributionImpl", "cumulativeProbability", new String[]{"double", "double"}, new String[]{"-1.0000000000000002", "2.0"}, false, 7, new String[][]{{"org.apache.commons.math.distribution.FDistributionImpl", "getNumeratorDegreesOfFreedom", ""}, {"org.apache.commons.math.distribution.FDistributionImpl", "setNumeratorDegreesOfFreedom", "double", "6.6"}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("NaN", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getDenominatorDegreesOfFreedom=Infinity, getNumeratorDegreesOfFreedom=6.6}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput174() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.distribution.FDistributionImpl", "org.apache.commons.math.distribution.FDistributionImpl", "getDenominatorDegreesOfFreedom", new String[]{}, new String[]{}, false, 1, new String[][]{{"org.apache.commons.math.distribution.FDistributionImpl", "setDenominatorDegreesOfFreedom", "double", "NaN"}});
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("NaN", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getDenominatorDegreesOfFreedom=NaN, getNumeratorDegreesOfFreedom=0.0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput175() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.distribution.FDistributionImpl", "org.apache.commons.math.distribution.FDistributionImpl", "cumulativeProbability", new String[]{"double"}, new String[]{"-Infinity"}, false, 0, new String[][]{{"org.apache.commons.math.distribution.FDistributionImpl", "inverseCumulativeProbability", "double", "-0.22999999999999998"}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("0.0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getDenominatorDegreesOfFreedom=0.0, getNumeratorDegreesOfFreedom=0.0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput176() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.distribution.FDistributionImpl", "org.apache.commons.math.distribution.FDistributionImpl", "setDenominatorDegreesOfFreedom", new String[]{"double"}, new String[]{"NaN"}, false, 4, new String[][]{{"org.apache.commons.math.distribution.FDistributionImpl", "getDomainLowerBound", "double", "0.5"}}, 2);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getDenominatorDegreesOfFreedom=NaN, getNumeratorDegreesOfFreedom=0.0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput177() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.distribution.FDistributionImpl", "org.apache.commons.math.distribution.FDistributionImpl", "cumulativeProbability", new String[]{"double", "double"}, new String[]{"-8516354193418641566", "Infinity"}, false, 6, new String[][]{{"org.apache.commons.math.distribution.FDistributionImpl", "setNumeratorDegreesOfFreedom", "double", "0.5"}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("NaN", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getDenominatorDegreesOfFreedom=0.0, getNumeratorDegreesOfFreedom=0.5}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput178() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.distribution.FDistributionImpl", "org.apache.commons.math.distribution.FDistributionImpl", "getDenominatorDegreesOfFreedom", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.math.distribution.FDistributionImpl", "setDenominatorDegreesOfFreedom", "double", "0.25"}});
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("0.25", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getDenominatorDegreesOfFreedom=0.25, getNumeratorDegreesOfFreedom=0.0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput179() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.distribution.FDistributionImpl", "org.apache.commons.math.distribution.FDistributionImpl", "setDenominatorDegreesOfFreedom", new String[]{"double"}, new String[]{"Infinity"}, false, 3, new String[][]{{"org.apache.commons.math.distribution.FDistributionImpl", "getNumeratorDegreesOfFreedom", ""}, {"org.apache.commons.math.distribution.FDistributionImpl", "setDenominatorDegreesOfFreedom", "double", "-1.04"}}, 3);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getDenominatorDegreesOfFreedom=Infinity, getNumeratorDegreesOfFreedom=0.0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput180() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.distribution.FDistributionImpl", "org.apache.commons.math.distribution.FDistributionImpl", "getNumeratorDegreesOfFreedom", new String[]{}, new String[]{}, false, 3, new String[][]{{"org.apache.commons.math.distribution.FDistributionImpl", "setNumeratorDegreesOfFreedom", "double", "4.2"}, {"org.apache.commons.math.distribution.FDistributionImpl", "setNumeratorDegreesOfFreedom", "double", "0.25"}});
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("0.25", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getDenominatorDegreesOfFreedom=0.0, getNumeratorDegreesOfFreedom=0.25}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput181() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.distribution.FDistributionImpl", "org.apache.commons.math.distribution.FDistributionImpl", "setNumeratorDegreesOfFreedom", new String[]{"double"}, new String[]{"10.0"}, false, 1, new String[][]{}, 3);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getDenominatorDegreesOfFreedom=0.0, getNumeratorDegreesOfFreedom=10.0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput182() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.distribution.FDistributionImpl", "org.apache.commons.math.distribution.FDistributionImpl", "cumulativeProbability", new String[]{"double", "double"}, new String[]{"0.25000000000000006", "0.6599999999999999"}, false, 3, new String[][]{{"org.apache.commons.math.distribution.FDistributionImpl", "setNumeratorDegreesOfFreedom", "double", "0.5"}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("NaN", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getDenominatorDegreesOfFreedom=0.0, getNumeratorDegreesOfFreedom=0.5}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput183() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.distribution.FDistributionImpl", "org.apache.commons.math.distribution.FDistributionImpl", "cumulativeProbability", new String[]{"double"}, new String[]{"0.9999999999999999"}, false, 0, new String[][]{{"org.apache.commons.math.distribution.FDistributionImpl", "setNumeratorDegreesOfFreedom", "double", "0.49999999999999994"}});
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("NaN", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getDenominatorDegreesOfFreedom=0.0, getNumeratorDegreesOfFreedom=0.49999999999999994}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput184() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.distribution.FDistributionImpl", "org.apache.commons.math.distribution.FDistributionImpl", "getNumeratorDegreesOfFreedom", new String[]{}, new String[]{}, false, 5, new String[][]{{"org.apache.commons.math.distribution.FDistributionImpl", "setNumeratorDegreesOfFreedom", "double", "NaN"}});
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("NaN", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getDenominatorDegreesOfFreedom=0.0, getNumeratorDegreesOfFreedom=NaN}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput185() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.distribution.FDistributionImpl", "org.apache.commons.math.distribution.FDistributionImpl", "cumulativeProbability", new String[]{"double"}, new String[]{"-0.1"}, false, 0, new String[][]{{"org.apache.commons.math.distribution.FDistributionImpl", "setNumeratorDegreesOfFreedom", "double", "Infinity"}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("0.0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getDenominatorDegreesOfFreedom=0.0, getNumeratorDegreesOfFreedom=Infinity}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput186() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.distribution.FDistributionImpl", "org.apache.commons.math.distribution.FDistributionImpl", "getNumeratorDegreesOfFreedom", new String[]{}, new String[]{}, false, 7, new String[][]{}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("1.0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getDenominatorDegreesOfFreedom=Infinity, getNumeratorDegreesOfFreedom=1.0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput187() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.distribution.FDistributionImpl", "org.apache.commons.math.distribution.FDistributionImpl", "inverseCumulativeProbability", new String[]{"double"}, new String[]{"0.5"}, false, 3, new String[][]{{"org.apache.commons.math.distribution.FDistributionImpl", "setNumeratorDegreesOfFreedom", "double", "Infinity"}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("2.0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getDenominatorDegreesOfFreedom=0.0, getNumeratorDegreesOfFreedom=Infinity}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput188() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.distribution.FDistributionImpl", "org.apache.commons.math.distribution.FDistributionImpl", "getNumeratorDegreesOfFreedom", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.math.distribution.FDistributionImpl", "setNumeratorDegreesOfFreedom", "double", "1.0"}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("1.0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getDenominatorDegreesOfFreedom=0.0, getNumeratorDegreesOfFreedom=1.0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput189() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.distribution.FDistributionImpl", "org.apache.commons.math.distribution.FDistributionImpl", "getNumeratorDegreesOfFreedom", new String[]{}, new String[]{}, false, 6, new String[][]{{"org.apache.commons.math.distribution.FDistributionImpl", "setDenominatorDegreesOfFreedom", "double", "0.6599999999999999"}});
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("0.0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getDenominatorDegreesOfFreedom=0.6599999999999999, getNumeratorDegreesOfFreedom=0.0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput190() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.distribution.FDistributionImpl", "org.apache.commons.math.distribution.FDistributionImpl", "setNumeratorDegreesOfFreedom", new String[]{"double"}, new String[]{"0.33"}, false, 1, new String[][]{}, 3);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getDenominatorDegreesOfFreedom=0.0, getNumeratorDegreesOfFreedom=0.33}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput191() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.distribution.FDistributionImpl", "org.apache.commons.math.distribution.FDistributionImpl", "getNumeratorDegreesOfFreedom", new String[]{}, new String[]{}, false, 3, new String[][]{{"org.apache.commons.math.distribution.FDistributionImpl", "setNumeratorDegreesOfFreedom", "double", "NaN"}, {"org.apache.commons.math.distribution.FDistributionImpl", "getDenominatorDegreesOfFreedom", ""}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("NaN", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getDenominatorDegreesOfFreedom=0.0, getNumeratorDegreesOfFreedom=NaN}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput192() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.distribution.FDistributionImpl", "org.apache.commons.math.distribution.FDistributionImpl", "setNumeratorDegreesOfFreedom", new String[]{"double"}, new String[]{"0.6599999999999998"}, false, 3, new String[][]{{"org.apache.commons.math.distribution.FDistributionImpl", "cumulativeProbability", "double", "0.5"}}, 1);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getDenominatorDegreesOfFreedom=0.0, getNumeratorDegreesOfFreedom=0.6599999999999998}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput193() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.distribution.FDistributionImpl", "org.apache.commons.math.distribution.FDistributionImpl", "getDomainLowerBound", new String[]{"double"}, new String[]{"-4.200000000000001"}, false, 6, new String[][]{{"org.apache.commons.math.distribution.FDistributionImpl", "setDenominatorDegreesOfFreedom", "double", "-8.5163541934186404E18"}, {"org.apache.commons.math.distribution.FDistributionImpl", "setDenominatorDegreesOfFreedom", "double", "NaN"}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("0.0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getDenominatorDegreesOfFreedom=NaN, getNumeratorDegreesOfFreedom=0.0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput194() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.distribution.FDistributionImpl", "org.apache.commons.math.distribution.FDistributionImpl", "inverseCumulativeProbability", new String[]{"double"}, new String[]{"NaN"}, false, 0, new String[][]{{"org.apache.commons.math.distribution.FDistributionImpl", "setNumeratorDegreesOfFreedom", "double", "2.0"}});
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("2.0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getDenominatorDegreesOfFreedom=0.0, getNumeratorDegreesOfFreedom=2.0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput195() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.distribution.FDistributionImpl", "org.apache.commons.math.distribution.FDistributionImpl", "getDenominatorDegreesOfFreedom", new String[]{}, new String[]{}, false, 7, new String[][]{{"org.apache.commons.math.distribution.FDistributionImpl", "setDenominatorDegreesOfFreedom", "double", "0.5"}});
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("0.5", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getDenominatorDegreesOfFreedom=0.5, getNumeratorDegreesOfFreedom=1.0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput196() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.distribution.FDistributionImpl", "org.apache.commons.math.distribution.FDistributionImpl", "inverseCumulativeProbability", new String[]{"double"}, new String[]{"0.9999999999999999"}, false, 2, new String[][]{{"org.apache.commons.math.distribution.FDistributionImpl", "cumulativeProbability", "double", "2.6399999999999997"}, {"org.apache.commons.math.distribution.FDistributionImpl", "setDenominatorDegreesOfFreedom", "double", "NaN"}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("2.0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getDenominatorDegreesOfFreedom=NaN, getNumeratorDegreesOfFreedom=1.0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput197() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.distribution.FDistributionImpl", "org.apache.commons.math.distribution.FDistributionImpl", "inverseCumulativeProbability", new String[]{"double"}, new String[]{"1.0"}, false, 2, new String[][]{{"org.apache.commons.math.distribution.FDistributionImpl", "getNumeratorDegreesOfFreedom", ""}, {"org.apache.commons.math.distribution.FDistributionImpl", "getDomainUpperBound", "double", "NaN"}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("Infinity", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getDenominatorDegreesOfFreedom=Infinity, getNumeratorDegreesOfFreedom=1.0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput198() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.distribution.FDistributionImpl", "org.apache.commons.math.distribution.FDistributionImpl", "inverseCumulativeProbability", new String[]{"double"}, new String[]{"0.0265"}, false, 6, new String[][]{{"org.apache.commons.math.distribution.FDistributionImpl", "setNumeratorDegreesOfFreedom", "double", "1.7976931348623157E308"}});
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("2.0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getDenominatorDegreesOfFreedom=0.0, getNumeratorDegreesOfFreedom=1.7976931348623157E308}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput199() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.distribution.FDistributionImpl", "org.apache.commons.math.distribution.FDistributionImpl", "getDomainUpperBound", new String[]{"double"}, new String[]{"0.998"}, false, 0, new String[][]{{"org.apache.commons.math.distribution.FDistributionImpl", "getDomainLowerBound", "double", "-0.05"}, {"org.apache.commons.math.distribution.FDistributionImpl", "setDenominatorDegreesOfFreedom", "double", "NaN"}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("1.7976931348623157E308", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getDenominatorDegreesOfFreedom=NaN, getNumeratorDegreesOfFreedom=0.0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput200() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.distribution.FDistributionImpl", "org.apache.commons.math.distribution.FDistributionImpl", "getDomainUpperBound", new String[]{"double"}, new String[]{"0.0"}, false, 0, new String[][]{{"org.apache.commons.math.distribution.FDistributionImpl", "getDomainUpperBound", "double", "Infinity"}, {"org.apache.commons.math.distribution.FDistributionImpl", "setNumeratorDegreesOfFreedom", "double", "Infinity"}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("1.7976931348623157E308", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getDenominatorDegreesOfFreedom=0.0, getNumeratorDegreesOfFreedom=Infinity}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput201() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.distribution.FDistributionImpl", "org.apache.commons.math.distribution.FDistributionImpl", "setNumeratorDegreesOfFreedom", new String[]{"double"}, new String[]{"0.49999999999999994"}, false, 0, new String[][]{{"org.apache.commons.math.distribution.FDistributionImpl", "getInitialDomain", "double", "Infinity"}}, 3);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getDenominatorDegreesOfFreedom=0.0, getNumeratorDegreesOfFreedom=0.49999999999999994}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput202() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.distribution.FDistributionImpl", "org.apache.commons.math.distribution.FDistributionImpl", "cumulativeProbability", new String[]{"double", "double"}, new String[]{"0.5", "1.0"}, false, 2, new String[][]{}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("NaN", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getDenominatorDegreesOfFreedom=Infinity, getNumeratorDegreesOfFreedom=1.0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput203() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.distribution.FDistributionImpl", "org.apache.commons.math.distribution.FDistributionImpl", "getNumeratorDegreesOfFreedom", new String[]{}, new String[]{}, false, 1, new String[][]{{"org.apache.commons.math.distribution.FDistributionImpl", "setNumeratorDegreesOfFreedom", "double", "4.02"}});
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("4.02", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getDenominatorDegreesOfFreedom=0.0, getNumeratorDegreesOfFreedom=4.02}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput204() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.distribution.FDistributionImpl", "org.apache.commons.math.distribution.FDistributionImpl", "getDenominatorDegreesOfFreedom", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.math.distribution.FDistributionImpl", "cumulativeProbability", "double,double", "NaN", "-1.0"}, {"org.apache.commons.math.distribution.FDistributionImpl", "setNumeratorDegreesOfFreedom", "double", "2.0"}});
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("0.0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getDenominatorDegreesOfFreedom=0.0, getNumeratorDegreesOfFreedom=2.0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput205() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.distribution.FDistributionImpl", "org.apache.commons.math.distribution.FDistributionImpl", "setDenominatorDegreesOfFreedom", new String[]{"double"}, new String[]{"0.6599999999999999"}, false, 0, null, 2);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getDenominatorDegreesOfFreedom=0.6599999999999999, getNumeratorDegreesOfFreedom=0.0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput206() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.distribution.FDistributionImpl", "org.apache.commons.math.distribution.FDistributionImpl", "getDenominatorDegreesOfFreedom", new String[]{}, new String[]{}, false, 7, new String[][]{{"org.apache.commons.math.distribution.FDistributionImpl", "setNumeratorDegreesOfFreedom", "double", "Infinity"}});
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("Infinity", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getDenominatorDegreesOfFreedom=Infinity, getNumeratorDegreesOfFreedom=Infinity}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput207() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.distribution.FDistributionImpl", "org.apache.commons.math.distribution.FDistributionImpl", "setNumeratorDegreesOfFreedom", new String[]{"double"}, new String[]{"47.5"}, false, 4, new String[][]{}, 2);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getDenominatorDegreesOfFreedom=0.0, getNumeratorDegreesOfFreedom=47.5}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput208() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.distribution.FDistributionImpl", "org.apache.commons.math.distribution.FDistributionImpl", "cumulativeProbability", new String[]{"double", "double"}, new String[]{"-Infinity", "1.3199999999999996"}, false, 7, new String[][]{{"org.apache.commons.math.distribution.FDistributionImpl", "setDenominatorDegreesOfFreedom", "double", "2.0"}, {"org.apache.commons.math.distribution.FDistributionImpl", "getDenominatorDegreesOfFreedom", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("0.630547667861664", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getDenominatorDegreesOfFreedom=2.0, getNumeratorDegreesOfFreedom=1.0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput209() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.distribution.FDistributionImpl", "org.apache.commons.math.distribution.FDistributionImpl", "getInitialDomain", new String[]{"double"}, new String[]{"0.5"}, false, 3, new String[][]{{"org.apache.commons.math.distribution.FDistributionImpl", "setDenominatorDegreesOfFreedom", "double", "3.5953862697246315E307"}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("1.0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getDenominatorDegreesOfFreedom=3.5953862697246315E307, getNumeratorDegreesOfFreedom=0.0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput210() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.distribution.FDistributionImpl", "org.apache.commons.math.distribution.FDistributionImpl", "inverseCumulativeProbability", new String[]{"double"}, new String[]{"0.0"}, false, 0, null, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("0.0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getDenominatorDegreesOfFreedom=0.0, getNumeratorDegreesOfFreedom=0.0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput211() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.distribution.FDistributionImpl", "org.apache.commons.math.distribution.FDistributionImpl", "getDomainUpperBound", new String[]{"double"}, new String[]{"0.32999999999999996"}, false, 0, new String[][]{{"org.apache.commons.math.distribution.FDistributionImpl", "setNumeratorDegreesOfFreedom", "double", "1.0"}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("1.7976931348623157E308", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getDenominatorDegreesOfFreedom=0.0, getNumeratorDegreesOfFreedom=1.0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput212() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.distribution.FDistributionImpl", "org.apache.commons.math.distribution.FDistributionImpl", "inverseCumulativeProbability", new String[]{"double"}, new String[]{"0.6599999999999998"}, false, 2, new String[][]{{"org.apache.commons.math.distribution.FDistributionImpl", "getInitialDomain", "double", "-1.7976931348623157E308"}, {"org.apache.commons.math.distribution.FDistributionImpl", "setDenominatorDegreesOfFreedom", "double", "1.0"}});
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("2.8591687318583494", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getDenominatorDegreesOfFreedom=1.0, getNumeratorDegreesOfFreedom=1.0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput213() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.distribution.FDistributionImpl", "org.apache.commons.math.distribution.FDistributionImpl", "cumulativeProbability", new String[]{"double", "double"}, new String[]{"-Infinity", "5.0"}, false, 7, new String[][]{{"org.apache.commons.math.distribution.FDistributionImpl", "setDenominatorDegreesOfFreedom", "double", "0.32999999999999996"}});
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("0.4764313039066468", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getDenominatorDegreesOfFreedom=0.32999999999999996, getNumeratorDegreesOfFreedom=1.0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput214() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.distribution.FDistributionImpl", "org.apache.commons.math.distribution.FDistributionImpl", "setNumeratorDegreesOfFreedom", new String[]{"double"}, new String[]{"0.25"}, false, 5, new String[][]{}, 2);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getDenominatorDegreesOfFreedom=0.0, getNumeratorDegreesOfFreedom=0.25}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput215() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.distribution.FDistributionImpl", "org.apache.commons.math.distribution.FDistributionImpl", "setDenominatorDegreesOfFreedom", new String[]{"double"}, new String[]{"8.988465674311579E307"}, false, 0, new String[][]{{"org.apache.commons.math.distribution.FDistributionImpl", "setNumeratorDegreesOfFreedom", "double", "4.0"}}, 1);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getDenominatorDegreesOfFreedom=8.988465674311579E307, getNumeratorDegreesOfFreedom=4.0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput216() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.distribution.FDistributionImpl", "org.apache.commons.math.distribution.FDistributionImpl", "getDomainLowerBound", new String[]{"double"}, new String[]{"-1.0"}, false, 0, new String[][]{{"org.apache.commons.math.distribution.FDistributionImpl", "setNumeratorDegreesOfFreedom", "double", "0.1"}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("0.0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getDenominatorDegreesOfFreedom=0.0, getNumeratorDegreesOfFreedom=0.1}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput217() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.distribution.FDistributionImpl", "org.apache.commons.math.distribution.FDistributionImpl", "getNumeratorDegreesOfFreedom", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.math.distribution.FDistributionImpl", "setNumeratorDegreesOfFreedom", "double", "5.0"}});
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("5.0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getDenominatorDegreesOfFreedom=0.0, getNumeratorDegreesOfFreedom=5.0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput218() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.distribution.FDistributionImpl", "org.apache.commons.math.distribution.FDistributionImpl", "getNumeratorDegreesOfFreedom", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.math.distribution.FDistributionImpl", "setDenominatorDegreesOfFreedom", "double", "1.0"}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("0.0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getDenominatorDegreesOfFreedom=1.0, getNumeratorDegreesOfFreedom=0.0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput219() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.distribution.FDistributionImpl", "org.apache.commons.math.distribution.FDistributionImpl", "inverseCumulativeProbability", new String[]{"double"}, new String[]{"1.0"}, false, 4, new String[][]{{"org.apache.commons.math.distribution.FDistributionImpl", "setDenominatorDegreesOfFreedom", "double", "Infinity"}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("Infinity", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getDenominatorDegreesOfFreedom=Infinity, getNumeratorDegreesOfFreedom=0.0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput220() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.distribution.FDistributionImpl", "org.apache.commons.math.distribution.FDistributionImpl", "inverseCumulativeProbability", new String[]{"double"}, new String[]{"NaN"}, false, 0, new String[][]{{"org.apache.commons.math.distribution.FDistributionImpl", "setDenominatorDegreesOfFreedom", "double", "1.7976931348623155E308"}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("2.0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getDenominatorDegreesOfFreedom=1.7976931348623155E308, getNumeratorDegreesOfFreedom=0.0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput221() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.distribution.FDistributionImpl", "org.apache.commons.math.distribution.FDistributionImpl", "getInitialDomain", new String[]{"double"}, new String[]{"1.3199999999999998"}, false, 0, new String[][]{{"org.apache.commons.math.distribution.FDistributionImpl", "setNumeratorDegreesOfFreedom", "double", "0.1"}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("1.0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getDenominatorDegreesOfFreedom=0.0, getNumeratorDegreesOfFreedom=0.1}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput222() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.distribution.FDistributionImpl", "org.apache.commons.math.distribution.FDistributionImpl", "getNumeratorDegreesOfFreedom", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.math.distribution.FDistributionImpl", "setNumeratorDegreesOfFreedom", "double", "Infinity"}, {"org.apache.commons.math.distribution.FDistributionImpl", "setNumeratorDegreesOfFreedom", "double", "1.7976931348623157E308"}});
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("1.7976931348623157E308", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getDenominatorDegreesOfFreedom=0.0, getNumeratorDegreesOfFreedom=1.7976931348623157E308}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput223() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.distribution.FDistributionImpl", "org.apache.commons.math.distribution.FDistributionImpl", "cumulativeProbability", new String[]{"double"}, new String[]{"-8516354193418641566"}, false, 0, new String[][]{{"org.apache.commons.math.distribution.FDistributionImpl", "setDenominatorDegreesOfFreedom", "double", "0.482"}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("0.0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getDenominatorDegreesOfFreedom=0.482, getNumeratorDegreesOfFreedom=0.0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput224() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.distribution.FDistributionImpl", "org.apache.commons.math.distribution.FDistributionImpl", "getDenominatorDegreesOfFreedom", new String[]{}, new String[]{}, false, 7, new String[][]{{"org.apache.commons.math.distribution.FDistributionImpl", "getDomainLowerBound", "double", "1.7976931348623157E308"}, {"org.apache.commons.math.distribution.FDistributionImpl", "setDenominatorDegreesOfFreedom", "double", "0.06599999999999999"}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("0.06599999999999999", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getDenominatorDegreesOfFreedom=0.06599999999999999, getNumeratorDegreesOfFreedom=1.0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput225() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.distribution.FDistributionImpl", "org.apache.commons.math.distribution.FDistributionImpl", "inverseCumulativeProbability", new String[]{"double"}, new String[]{"0.6599999999999999"}, false, 6, new String[][]{{"org.apache.commons.math.distribution.FDistributionImpl", "setDenominatorDegreesOfFreedom", "double", "2.0000000000000004"}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("4.503599627370498E15", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getDenominatorDegreesOfFreedom=2.0000000000000004, getNumeratorDegreesOfFreedom=0.0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput226() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.distribution.FDistributionImpl", "org.apache.commons.math.distribution.FDistributionImpl", "getNumeratorDegreesOfFreedom", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.math.distribution.FDistributionImpl", "setNumeratorDegreesOfFreedom", "double", "NaN"}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("NaN", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getDenominatorDegreesOfFreedom=0.0, getNumeratorDegreesOfFreedom=NaN}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput227() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.distribution.FDistributionImpl", "org.apache.commons.math.distribution.FDistributionImpl", "getDomainUpperBound", new String[]{"double"}, new String[]{"-4.9E-324"}, false, 0, new String[][]{{"org.apache.commons.math.distribution.FDistributionImpl", "setNumeratorDegreesOfFreedom", "double", "1.7976931348623157E308"}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("1.7976931348623157E308", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getDenominatorDegreesOfFreedom=0.0, getNumeratorDegreesOfFreedom=1.7976931348623157E308}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput228() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.distribution.FDistributionImpl", "org.apache.commons.math.distribution.FDistributionImpl", "getNumeratorDegreesOfFreedom", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.math.distribution.FDistributionImpl", "setDenominatorDegreesOfFreedom", "double", "0.5"}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("0.0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getDenominatorDegreesOfFreedom=0.5, getNumeratorDegreesOfFreedom=0.0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput229() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.distribution.FDistributionImpl", "org.apache.commons.math.distribution.FDistributionImpl", "cumulativeProbability", new String[]{"double"}, new String[]{"-1.0"}, false, 0, new String[][]{{"org.apache.commons.math.distribution.FDistributionImpl", "setDenominatorDegreesOfFreedom", "double", "Infinity"}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("0.0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getDenominatorDegreesOfFreedom=Infinity, getNumeratorDegreesOfFreedom=0.0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput230() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.distribution.FDistributionImpl", "org.apache.commons.math.distribution.FDistributionImpl", "getInitialDomain", new String[]{"double"}, new String[]{"-Infinity"}, false, 3, new String[][]{{"org.apache.commons.math.distribution.FDistributionImpl", "setDenominatorDegreesOfFreedom", "double", "4.0"}, {"org.apache.commons.math.distribution.FDistributionImpl", "getDomainUpperBound", "double", "Infinity"}});
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("2.0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getDenominatorDegreesOfFreedom=4.0, getNumeratorDegreesOfFreedom=0.0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput231() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.distribution.FDistributionImpl", "org.apache.commons.math.distribution.FDistributionImpl", "cumulativeProbability", new String[]{"double"}, new String[]{"0.49999999999999994"}, false, 2, new String[][]{{"org.apache.commons.math.distribution.FDistributionImpl", "setDenominatorDegreesOfFreedom", "double", "1.0"}});
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("0.39182655203060696", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getDenominatorDegreesOfFreedom=1.0, getNumeratorDegreesOfFreedom=1.0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput232() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.distribution.FDistributionImpl", "org.apache.commons.math.distribution.FDistributionImpl", "getDenominatorDegreesOfFreedom", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.math.distribution.FDistributionImpl", "setDenominatorDegreesOfFreedom", "double", "2.0"}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("2.0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getDenominatorDegreesOfFreedom=2.0, getNumeratorDegreesOfFreedom=0.0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput233() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.distribution.FDistributionImpl", "org.apache.commons.math.distribution.FDistributionImpl", "getDenominatorDegreesOfFreedom", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.math.distribution.FDistributionImpl", "setDenominatorDegreesOfFreedom", "double", "-1.05"}, {"org.apache.commons.math.distribution.FDistributionImpl", "setDenominatorDegreesOfFreedom", "double", "NaN"}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("NaN", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getDenominatorDegreesOfFreedom=NaN, getNumeratorDegreesOfFreedom=0.0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput234() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.distribution.FDistributionImpl", "org.apache.commons.math.distribution.FDistributionImpl", "getNumeratorDegreesOfFreedom", new String[]{}, new String[]{}, false, 7, new String[][]{{"org.apache.commons.math.distribution.FDistributionImpl", "setDenominatorDegreesOfFreedom", "double", "1.7976931348623157E308"}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("1.0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getDenominatorDegreesOfFreedom=1.7976931348623157E308, getNumeratorDegreesOfFreedom=1.0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput235() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.distribution.FDistributionImpl", "org.apache.commons.math.distribution.FDistributionImpl", "getInitialDomain", new String[]{"double"}, new String[]{"0.5"}, false, 1, new String[][]{{"org.apache.commons.math.distribution.FDistributionImpl", "setDenominatorDegreesOfFreedom", "double", "NaN"}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("1.0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getDenominatorDegreesOfFreedom=NaN, getNumeratorDegreesOfFreedom=0.0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput236() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.distribution.FDistributionImpl", "org.apache.commons.math.distribution.FDistributionImpl", "inverseCumulativeProbability", new String[]{"double"}, new String[]{"0.0"}, false, 0, new String[][]{{"org.apache.commons.math.distribution.FDistributionImpl", "getNumeratorDegreesOfFreedom", ""}, {"org.apache.commons.math.distribution.FDistributionImpl", "cumulativeProbability", "double,double", "3.5953862697246315E307", "-0.25"}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("0.0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getDenominatorDegreesOfFreedom=0.0, getNumeratorDegreesOfFreedom=0.0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput237() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.distribution.FDistributionImpl", "org.apache.commons.math.distribution.FDistributionImpl", "getDomainLowerBound", new String[]{"double"}, new String[]{"-2.1000000000000005"}, false, 0, new String[][]{{"org.apache.commons.math.distribution.FDistributionImpl", "setDenominatorDegreesOfFreedom", "double", "1.7976931348623157E308"}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("0.0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getDenominatorDegreesOfFreedom=1.7976931348623157E308, getNumeratorDegreesOfFreedom=0.0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput238() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.distribution.FDistributionImpl", "org.apache.commons.math.distribution.FDistributionImpl", "getNumeratorDegreesOfFreedom", new String[]{}, new String[]{}, false, 5, new String[][]{{"org.apache.commons.math.distribution.FDistributionImpl", "setNumeratorDegreesOfFreedom", "double", "2.0"}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("2.0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getDenominatorDegreesOfFreedom=0.0, getNumeratorDegreesOfFreedom=2.0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput239() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.distribution.FDistributionImpl", "org.apache.commons.math.distribution.FDistributionImpl", "setDenominatorDegreesOfFreedom", new String[]{"double"}, new String[]{"0.20000000000000018"}, false, 6, new String[][]{{"org.apache.commons.math.distribution.FDistributionImpl", "setNumeratorDegreesOfFreedom", "double", "-Infinity"}}, 1);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getDenominatorDegreesOfFreedom=0.20000000000000018, getNumeratorDegreesOfFreedom=0.0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput240() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.distribution.FDistributionImpl", "org.apache.commons.math.distribution.FDistributionImpl", "cumulativeProbability", new String[]{"double"}, new String[]{"-1.0"}, false, 0, new String[][]{{"org.apache.commons.math.distribution.FDistributionImpl", "setDenominatorDegreesOfFreedom", "double", "1.7976931348623157E308"}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("0.0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getDenominatorDegreesOfFreedom=1.7976931348623157E308, getNumeratorDegreesOfFreedom=0.0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput241() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.distribution.FDistributionImpl", "org.apache.commons.math.distribution.FDistributionImpl", "getDomainLowerBound", new String[]{"double"}, new String[]{"Infinity"}, false, 6, new String[][]{{"org.apache.commons.math.distribution.FDistributionImpl", "getDomainLowerBound", "double", "0.5"}, {"org.apache.commons.math.distribution.FDistributionImpl", "setDenominatorDegreesOfFreedom", "double", "4.7"}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("0.0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getDenominatorDegreesOfFreedom=4.7, getNumeratorDegreesOfFreedom=0.0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput242() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.distribution.FDistributionImpl", "org.apache.commons.math.distribution.FDistributionImpl", "getDenominatorDegreesOfFreedom", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.math.distribution.FDistributionImpl", "cumulativeProbability", "double,double", "0.6599999999999999", "0.0"}, {"org.apache.commons.math.distribution.FDistributionImpl", "setDenominatorDegreesOfFreedom", "double", "4.0"}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("4.0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getDenominatorDegreesOfFreedom=4.0, getNumeratorDegreesOfFreedom=0.0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput243() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.distribution.FDistributionImpl", "org.apache.commons.math.distribution.FDistributionImpl", "getNumeratorDegreesOfFreedom", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.math.distribution.FDistributionImpl", "setDenominatorDegreesOfFreedom", "double", "0.6269999999999999"}, {"org.apache.commons.math.distribution.FDistributionImpl", "getNumeratorDegreesOfFreedom", ""}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("0.0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getDenominatorDegreesOfFreedom=0.6269999999999999, getNumeratorDegreesOfFreedom=0.0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput244() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.distribution.FDistributionImpl", "org.apache.commons.math.distribution.FDistributionImpl", "getNumeratorDegreesOfFreedom", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.math.distribution.FDistributionImpl", "setDenominatorDegreesOfFreedom", "double", "8.0"}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("0.0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getDenominatorDegreesOfFreedom=8.0, getNumeratorDegreesOfFreedom=0.0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput245() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.distribution.FDistributionImpl", "org.apache.commons.math.distribution.FDistributionImpl", "getDomainUpperBound", new String[]{"double"}, new String[]{"-2.0999999999999996"}, false, 3, new String[][]{{"org.apache.commons.math.distribution.FDistributionImpl", "setNumeratorDegreesOfFreedom", "double", "20.0"}, {"org.apache.commons.math.distribution.FDistributionImpl", "cumulativeProbability", "double,double", "-0.5", "-8.5163541934186404E18"}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("1.7976931348623157E308", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getDenominatorDegreesOfFreedom=0.0, getNumeratorDegreesOfFreedom=20.0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput246() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.distribution.FDistributionImpl", "org.apache.commons.math.distribution.FDistributionImpl", "inverseCumulativeProbability", new String[]{"double"}, new String[]{"4.9E-324"}, false, 0, new String[][]{{"org.apache.commons.math.distribution.FDistributionImpl", "setNumeratorDegreesOfFreedom", "double", "Infinity"}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("2.0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getDenominatorDegreesOfFreedom=0.0, getNumeratorDegreesOfFreedom=Infinity}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput247() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.distribution.FDistributionImpl", "org.apache.commons.math.distribution.FDistributionImpl", "getNumeratorDegreesOfFreedom", new String[]{}, new String[]{}, false, 4, new String[][]{{"org.apache.commons.math.distribution.FDistributionImpl", "setNumeratorDegreesOfFreedom", "double", "Infinity"}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("Infinity", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getDenominatorDegreesOfFreedom=0.0, getNumeratorDegreesOfFreedom=Infinity}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput248() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.distribution.FDistributionImpl", "org.apache.commons.math.distribution.FDistributionImpl", "getNumeratorDegreesOfFreedom", new String[]{}, new String[]{}, false, 2, new String[][]{{"org.apache.commons.math.distribution.FDistributionImpl", "setNumeratorDegreesOfFreedom", "double", "2.0"}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("2.0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getDenominatorDegreesOfFreedom=Infinity, getNumeratorDegreesOfFreedom=2.0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput249() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.distribution.FDistributionImpl", "org.apache.commons.math.distribution.FDistributionImpl", "getInitialDomain", new String[]{"double"}, new String[]{"0.0"}, false, 3, new String[][]{{"org.apache.commons.math.distribution.FDistributionImpl", "setDenominatorDegreesOfFreedom", "double", "4.0"}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("2.0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getDenominatorDegreesOfFreedom=4.0, getNumeratorDegreesOfFreedom=0.0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput250() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.distribution.FDistributionImpl", "org.apache.commons.math.distribution.FDistributionImpl", "getNumeratorDegreesOfFreedom", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.math.distribution.FDistributionImpl", "getDenominatorDegreesOfFreedom", ""}, {"org.apache.commons.math.distribution.FDistributionImpl", "setDenominatorDegreesOfFreedom", "double", "Infinity"}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("0.0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getDenominatorDegreesOfFreedom=Infinity, getNumeratorDegreesOfFreedom=0.0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput251() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.distribution.FDistributionImpl", "org.apache.commons.math.distribution.FDistributionImpl", "getNumeratorDegreesOfFreedom", new String[]{}, new String[]{}, false, 7, new String[][]{{"org.apache.commons.math.distribution.FDistributionImpl", "setNumeratorDegreesOfFreedom", "double", "1.7976931348623157E308"}, {"org.apache.commons.math.distribution.FDistributionImpl", "setDenominatorDegreesOfFreedom", "double", "4.9E-324"}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("1.7976931348623157E308", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getDenominatorDegreesOfFreedom=4.9E-324, getNumeratorDegreesOfFreedom=1.7976931348623157E308}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput252() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.distribution.FDistributionImpl", "org.apache.commons.math.distribution.FDistributionImpl", "getDenominatorDegreesOfFreedom", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.math.distribution.FDistributionImpl", "setNumeratorDegreesOfFreedom", "double", "0.011"}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("0.0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getDenominatorDegreesOfFreedom=0.0, getNumeratorDegreesOfFreedom=0.011}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput253() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.distribution.FDistributionImpl", "org.apache.commons.math.distribution.FDistributionImpl", "cumulativeProbability", new String[]{"double"}, new String[]{"-4.9E-324"}, false, 3, new String[][]{{"org.apache.commons.math.distribution.FDistributionImpl", "cumulativeProbability", "double", "0.0"}, {"org.apache.commons.math.distribution.FDistributionImpl", "setNumeratorDegreesOfFreedom", "double", "2.0"}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("0.0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getDenominatorDegreesOfFreedom=0.0, getNumeratorDegreesOfFreedom=2.0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput254() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.distribution.FDistributionImpl", "org.apache.commons.math.distribution.FDistributionImpl", "cumulativeProbability", new String[]{"double", "double"}, new String[]{"-Infinity", "0.0"}, false, 2, new String[][]{{"org.apache.commons.math.distribution.FDistributionImpl", "setDenominatorDegreesOfFreedom", "double", "1.7976931348623157E308"}, {"org.apache.commons.math.distribution.FDistributionImpl", "getInitialDomain", "double", "1.7976931348623157E308"}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("0.0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getDenominatorDegreesOfFreedom=1.7976931348623157E308, getNumeratorDegreesOfFreedom=1.0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput255() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.distribution.FDistributionImpl", "org.apache.commons.math.distribution.FDistributionImpl", "getNumeratorDegreesOfFreedom", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.math.distribution.FDistributionImpl", "setNumeratorDegreesOfFreedom", "double", "6.0"}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("6.0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getDenominatorDegreesOfFreedom=0.0, getNumeratorDegreesOfFreedom=6.0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput256() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.distribution.FDistributionImpl", "org.apache.commons.math.distribution.FDistributionImpl", "getNumeratorDegreesOfFreedom", new String[]{}, new String[]{}, false, 3, new String[][]{{"org.apache.commons.math.distribution.FDistributionImpl", "setDenominatorDegreesOfFreedom", "double", "1.7976931348623157E308"}, {"org.apache.commons.math.distribution.FDistributionImpl", "getInitialDomain", "double", "-1.7976931348623157E308"}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("0.0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getDenominatorDegreesOfFreedom=1.7976931348623157E308, getNumeratorDegreesOfFreedom=0.0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput257() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.distribution.FDistributionImpl", "org.apache.commons.math.distribution.FDistributionImpl", "getDenominatorDegreesOfFreedom", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.math.distribution.FDistributionImpl", "setDenominatorDegreesOfFreedom", "double", "NaN"}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("NaN", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getDenominatorDegreesOfFreedom=NaN, getNumeratorDegreesOfFreedom=0.0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput258() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.distribution.FDistributionImpl", "org.apache.commons.math.distribution.FDistributionImpl", "getDomainUpperBound", new String[]{"double"}, new String[]{"Infinity"}, false, 0, new String[][]{{"org.apache.commons.math.distribution.FDistributionImpl", "setDenominatorDegreesOfFreedom", "double", "8.5163541934186414E18"}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("1.7976931348623157E308", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getDenominatorDegreesOfFreedom=8.5163541934186414E18, getNumeratorDegreesOfFreedom=0.0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput259() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.distribution.FDistributionImpl", "org.apache.commons.math.distribution.FDistributionImpl", "getNumeratorDegreesOfFreedom", new String[]{}, new String[]{}, false, 3, new String[][]{{"org.apache.commons.math.distribution.FDistributionImpl", "setNumeratorDegreesOfFreedom", "double", "1.0"}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("1.0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getDenominatorDegreesOfFreedom=0.0, getNumeratorDegreesOfFreedom=1.0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput260() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.distribution.FDistributionImpl", "org.apache.commons.math.distribution.FDistributionImpl", "getDenominatorDegreesOfFreedom", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.math.distribution.FDistributionImpl", "setNumeratorDegreesOfFreedom", "double", "0.5"}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("0.0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getDenominatorDegreesOfFreedom=0.0, getNumeratorDegreesOfFreedom=0.5}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput261() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.distribution.FDistributionImpl", "org.apache.commons.math.distribution.FDistributionImpl", "getNumeratorDegreesOfFreedom", new String[]{}, new String[]{}, false, 3, new String[][]{{"org.apache.commons.math.distribution.FDistributionImpl", "setNumeratorDegreesOfFreedom", "double", "2.0"}, {"org.apache.commons.math.distribution.FDistributionImpl", "setDenominatorDegreesOfFreedom", "double", "-0.58"}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("2.0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getDenominatorDegreesOfFreedom=0.0, getNumeratorDegreesOfFreedom=2.0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput262() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.distribution.FDistributionImpl", "org.apache.commons.math.distribution.FDistributionImpl", "getNumeratorDegreesOfFreedom", new String[]{}, new String[]{}, false, 7, new String[][]{{"org.apache.commons.math.distribution.FDistributionImpl", "setNumeratorDegreesOfFreedom", "double", "2.0"}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("2.0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getDenominatorDegreesOfFreedom=Infinity, getNumeratorDegreesOfFreedom=2.0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput263() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.distribution.FDistributionImpl", "org.apache.commons.math.distribution.FDistributionImpl", "getNumeratorDegreesOfFreedom", new String[]{}, new String[]{}, false, 1, new String[][]{{"org.apache.commons.math.distribution.FDistributionImpl", "setNumeratorDegreesOfFreedom", "double", "0.66"}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("0.66", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getDenominatorDegreesOfFreedom=0.0, getNumeratorDegreesOfFreedom=0.66}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput264() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.distribution.FDistributionImpl", "org.apache.commons.math.distribution.FDistributionImpl", "cumulativeProbability", new String[]{"double"}, new String[]{"-0.5"}, false, 3, new String[][]{{"org.apache.commons.math.distribution.FDistributionImpl", "inverseCumulativeProbability", "double", "-8.5163541934186404E18"}, {"org.apache.commons.math.distribution.FDistributionImpl", "setNumeratorDegreesOfFreedom", "double", "Infinity"}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("0.0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getDenominatorDegreesOfFreedom=0.0, getNumeratorDegreesOfFreedom=Infinity}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput265() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.distribution.FDistributionImpl", "org.apache.commons.math.distribution.FDistributionImpl", "getNumeratorDegreesOfFreedom", new String[]{}, new String[]{}, false, 6, new String[][]{{"org.apache.commons.math.distribution.FDistributionImpl", "inverseCumulativeProbability", "double", "1.8300000000000003"}, {"org.apache.commons.math.distribution.FDistributionImpl", "setNumeratorDegreesOfFreedom", "double", "NaN"}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("NaN", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getDenominatorDegreesOfFreedom=0.0, getNumeratorDegreesOfFreedom=NaN}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput266() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.distribution.FDistributionImpl", "org.apache.commons.math.distribution.FDistributionImpl", "getDenominatorDegreesOfFreedom", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.math.distribution.FDistributionImpl", "setNumeratorDegreesOfFreedom", "double", "4.5"}, {"org.apache.commons.math.distribution.FDistributionImpl", "getInitialDomain", "double", "0.06599999999999999"}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("0.0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getDenominatorDegreesOfFreedom=0.0, getNumeratorDegreesOfFreedom=4.5}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput267() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.distribution.FDistributionImpl", "org.apache.commons.math.distribution.FDistributionImpl", "getDenominatorDegreesOfFreedom", new String[]{}, new String[]{}, false, 1, new String[][]{{"org.apache.commons.math.distribution.FDistributionImpl", "setNumeratorDegreesOfFreedom", "double", "0.5000000000000001"}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("0.0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getDenominatorDegreesOfFreedom=0.0, getNumeratorDegreesOfFreedom=0.5000000000000001}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput268() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.distribution.FDistributionImpl", "org.apache.commons.math.distribution.FDistributionImpl", "getDenominatorDegreesOfFreedom", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.math.distribution.FDistributionImpl", "setNumeratorDegreesOfFreedom", "double", "0.5000000000000001"}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("0.0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getDenominatorDegreesOfFreedom=0.0, getNumeratorDegreesOfFreedom=0.5000000000000001}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput269() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.distribution.FDistributionImpl", "org.apache.commons.math.distribution.FDistributionImpl", "getDenominatorDegreesOfFreedom", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.math.distribution.FDistributionImpl", "setNumeratorDegreesOfFreedom", "double", "4.9E-324"}, {"org.apache.commons.math.distribution.FDistributionImpl", "setDenominatorDegreesOfFreedom", "double", "1.7976931348623157E308"}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("1.7976931348623157E308", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getDenominatorDegreesOfFreedom=1.7976931348623157E308, getNumeratorDegreesOfFreedom=4.9E-324}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput270() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.distribution.FDistributionImpl", "org.apache.commons.math.distribution.FDistributionImpl", "cumulativeProbability", new String[]{"double"}, new String[]{"2.0"}, false, 7, new String[][]{{"org.apache.commons.math.distribution.FDistributionImpl", "setDenominatorDegreesOfFreedom", "double", "0.5"}});
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("0.4787464071263863", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getDenominatorDegreesOfFreedom=0.5, getNumeratorDegreesOfFreedom=1.0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput271() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.distribution.FDistributionImpl", "org.apache.commons.math.distribution.FDistributionImpl", "getInitialDomain", new String[]{"double"}, new String[]{"4.9E-324"}, false, 0, new String[][]{{"org.apache.commons.math.distribution.FDistributionImpl", "setDenominatorDegreesOfFreedom", "double", "Infinity"}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("NaN", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getDenominatorDegreesOfFreedom=Infinity, getNumeratorDegreesOfFreedom=0.0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput272() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.distribution.FDistributionImpl", "org.apache.commons.math.distribution.FDistributionImpl", "setDenominatorDegreesOfFreedom", new String[]{"double"}, new String[]{"Infinity"}, false, 7, new String[][]{{"org.apache.commons.math.distribution.FDistributionImpl", "cumulativeProbability", "double", "4.9E-324"}}, 3);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getDenominatorDegreesOfFreedom=Infinity, getNumeratorDegreesOfFreedom=1.0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput273() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.distribution.FDistributionImpl", "org.apache.commons.math.distribution.FDistributionImpl", "getNumeratorDegreesOfFreedom", new String[]{}, new String[]{}, false, 1, new String[][]{{"org.apache.commons.math.distribution.FDistributionImpl", "setNumeratorDegreesOfFreedom", "double", "4.9E-324"}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("4.9E-324", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getDenominatorDegreesOfFreedom=0.0, getNumeratorDegreesOfFreedom=4.9E-324}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput274() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.distribution.FDistributionImpl", "org.apache.commons.math.distribution.FDistributionImpl", "getNumeratorDegreesOfFreedom", new String[]{}, new String[]{}, false, 7, new String[][]{{"org.apache.commons.math.distribution.FDistributionImpl", "setNumeratorDegreesOfFreedom", "double", "1.7976931348623157E308"}, {"org.apache.commons.math.distribution.FDistributionImpl", "getDomainUpperBound", "double", "-1.0"}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("1.7976931348623157E308", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getDenominatorDegreesOfFreedom=Infinity, getNumeratorDegreesOfFreedom=1.7976931348623157E308}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput275() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.distribution.FDistributionImpl", "org.apache.commons.math.distribution.FDistributionImpl", "cumulativeProbability", new String[]{"double"}, new String[]{"0.06599999999999998"}, false, 0, new String[][]{{"org.apache.commons.math.distribution.FDistributionImpl", "cumulativeProbability", "double", "-1.7976931348623157E308"}, {"org.apache.commons.math.distribution.FDistributionImpl", "setDenominatorDegreesOfFreedom", "double", "Infinity"}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("NaN", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getDenominatorDegreesOfFreedom=Infinity, getNumeratorDegreesOfFreedom=0.0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput276() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.distribution.FDistributionImpl", "org.apache.commons.math.distribution.FDistributionImpl", "getDenominatorDegreesOfFreedom", new String[]{}, new String[]{}, false, 6, new String[][]{{"org.apache.commons.math.distribution.FDistributionImpl", "setNumeratorDegreesOfFreedom", "double", "0.6599999999999998"}, {"org.apache.commons.math.distribution.FDistributionImpl", "inverseCumulativeProbability", "double", "0.0"}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("0.0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getDenominatorDegreesOfFreedom=0.0, getNumeratorDegreesOfFreedom=0.6599999999999998}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput277() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.distribution.FDistributionImpl", "org.apache.commons.math.distribution.FDistributionImpl", "getDenominatorDegreesOfFreedom", new String[]{}, new String[]{}, false, 5, new String[][]{{"org.apache.commons.math.distribution.FDistributionImpl", "setDenominatorDegreesOfFreedom", "double", "1.0000000000000004"}, {"org.apache.commons.math.distribution.FDistributionImpl", "setNumeratorDegreesOfFreedom", "double", "-Infinity"}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("1.0000000000000004", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getDenominatorDegreesOfFreedom=1.0000000000000004, getNumeratorDegreesOfFreedom=0.0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput278() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.distribution.FDistributionImpl", "org.apache.commons.math.distribution.FDistributionImpl", "inverseCumulativeProbability", new String[]{"double"}, new String[]{"NaN"}, false, 0, new String[][]{{"org.apache.commons.math.distribution.FDistributionImpl", "setNumeratorDegreesOfFreedom", "double", "0.19999999999999973"}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("2.0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getDenominatorDegreesOfFreedom=0.0, getNumeratorDegreesOfFreedom=0.19999999999999973}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput279() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.distribution.FDistributionImpl", "org.apache.commons.math.distribution.FDistributionImpl", "inverseCumulativeProbability", new String[]{"double"}, new String[]{"NaN"}, false, 3, new String[][]{{"org.apache.commons.math.distribution.FDistributionImpl", "setNumeratorDegreesOfFreedom", "double", "0.66"}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("2.0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getDenominatorDegreesOfFreedom=0.0, getNumeratorDegreesOfFreedom=0.66}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput280() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.distribution.FDistributionImpl", "org.apache.commons.math.distribution.FDistributionImpl", "getInitialDomain", new String[]{"double"}, new String[]{"-Infinity"}, false, 3, new String[][]{{"org.apache.commons.math.distribution.FDistributionImpl", "setDenominatorDegreesOfFreedom", "double", "20.000000000000004"}});
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("1.1111111111111112", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getDenominatorDegreesOfFreedom=20.000000000000004, getNumeratorDegreesOfFreedom=0.0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput281() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.distribution.FDistributionImpl", "org.apache.commons.math.distribution.FDistributionImpl", "getDenominatorDegreesOfFreedom", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.math.distribution.FDistributionImpl", "getDomainUpperBound", "double", "-Infinity"}, {"org.apache.commons.math.distribution.FDistributionImpl", "setDenominatorDegreesOfFreedom", "double", "0.5"}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("0.5", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getDenominatorDegreesOfFreedom=0.5, getNumeratorDegreesOfFreedom=0.0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput282() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.distribution.FDistributionImpl", "org.apache.commons.math.distribution.FDistributionImpl", "getDenominatorDegreesOfFreedom", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.math.distribution.FDistributionImpl", "setNumeratorDegreesOfFreedom", "double", "1.7976931348623157E308"}, {"org.apache.commons.math.distribution.FDistributionImpl", "cumulativeProbability", "double", "1.3199999999999998"}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("0.0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getDenominatorDegreesOfFreedom=0.0, getNumeratorDegreesOfFreedom=1.7976931348623157E308}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput283() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.distribution.FDistributionImpl", "org.apache.commons.math.distribution.FDistributionImpl", "getDenominatorDegreesOfFreedom", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.math.distribution.FDistributionImpl", "setDenominatorDegreesOfFreedom", "double", "Infinity"}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("Infinity", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getDenominatorDegreesOfFreedom=Infinity, getNumeratorDegreesOfFreedom=0.0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput284() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.distribution.FDistributionImpl", "org.apache.commons.math.distribution.FDistributionImpl", "getInitialDomain", new String[]{"double"}, new String[]{"1.7976931348623157E308"}, false, 2, new String[][]{{"org.apache.commons.math.distribution.FDistributionImpl", "inverseCumulativeProbability", "double", "-0.49999999999999994"}, {"org.apache.commons.math.distribution.FDistributionImpl", "setDenominatorDegreesOfFreedom", "double", "20.0"}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("1.1111111111111112", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getDenominatorDegreesOfFreedom=20.0, getNumeratorDegreesOfFreedom=1.0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput285() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.distribution.FDistributionImpl", "org.apache.commons.math.distribution.FDistributionImpl", "getDenominatorDegreesOfFreedom", new String[]{}, new String[]{}, false, 3, new String[][]{{"org.apache.commons.math.distribution.FDistributionImpl", "getNumeratorDegreesOfFreedom", ""}, {"org.apache.commons.math.distribution.FDistributionImpl", "setDenominatorDegreesOfFreedom", "double", "1.0"}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("1.0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getDenominatorDegreesOfFreedom=1.0, getNumeratorDegreesOfFreedom=0.0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput286() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.distribution.FDistributionImpl", "org.apache.commons.math.distribution.FDistributionImpl", "getDenominatorDegreesOfFreedom", new String[]{}, new String[]{}, false, 2, new String[][]{{"org.apache.commons.math.distribution.FDistributionImpl", "setNumeratorDegreesOfFreedom", "double", "48.66"}, {"org.apache.commons.math.distribution.FDistributionImpl", "getInitialDomain", "double", "1.0"}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("Infinity", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getDenominatorDegreesOfFreedom=Infinity, getNumeratorDegreesOfFreedom=48.66}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput287() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.distribution.FDistributionImpl", "org.apache.commons.math.distribution.FDistributionImpl", "getNumeratorDegreesOfFreedom", new String[]{}, new String[]{}, false, 3, new String[][]{{"org.apache.commons.math.distribution.FDistributionImpl", "setNumeratorDegreesOfFreedom", "double", "0.6599999999999999"}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("0.6599999999999999", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getDenominatorDegreesOfFreedom=0.0, getNumeratorDegreesOfFreedom=0.6599999999999999}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput288() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.distribution.FDistributionImpl", "org.apache.commons.math.distribution.FDistributionImpl", "getNumeratorDegreesOfFreedom", new String[]{}, new String[]{}, false, 6, new String[][]{{"org.apache.commons.math.distribution.FDistributionImpl", "setNumeratorDegreesOfFreedom", "double", "0.6000000000000001"}, {"org.apache.commons.math.distribution.FDistributionImpl", "setNumeratorDegreesOfFreedom", "double", "0.5"}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("0.5", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getDenominatorDegreesOfFreedom=0.0, getNumeratorDegreesOfFreedom=0.5}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput289() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.distribution.FDistributionImpl", "org.apache.commons.math.distribution.FDistributionImpl", "getDenominatorDegreesOfFreedom", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.math.distribution.FDistributionImpl", "setNumeratorDegreesOfFreedom", "double", "Infinity"}, {"org.apache.commons.math.distribution.FDistributionImpl", "setNumeratorDegreesOfFreedom", "double", "-0.5"}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("0.0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getDenominatorDegreesOfFreedom=0.0, getNumeratorDegreesOfFreedom=Infinity}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput290() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.distribution.FDistributionImpl", "org.apache.commons.math.distribution.FDistributionImpl", "setDenominatorDegreesOfFreedom", new String[]{"double"}, new String[]{"4.6000000000000005"}, false, 7, new String[][]{{"org.apache.commons.math.distribution.FDistributionImpl", "inverseCumulativeProbability", "double", "-1.7976931348623157E308"}, {"org.apache.commons.math.distribution.FDistributionImpl", "getInitialDomain", "double", "-52.5"}}, 3);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getDenominatorDegreesOfFreedom=4.6000000000000005, getNumeratorDegreesOfFreedom=1.0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput291() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.distribution.FDistributionImpl", "org.apache.commons.math.distribution.FDistributionImpl", "getInitialDomain", new String[]{"double"}, new String[]{"Infinity"}, false, 0, new String[][]{{"org.apache.commons.math.distribution.FDistributionImpl", "getNumeratorDegreesOfFreedom", ""}, {"org.apache.commons.math.distribution.FDistributionImpl", "setDenominatorDegreesOfFreedom", "double", "50.0"}});
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("1.0416666666666667", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getDenominatorDegreesOfFreedom=50.0, getNumeratorDegreesOfFreedom=0.0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput292() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.distribution.FDistributionImpl", "org.apache.commons.math.distribution.FDistributionImpl", "inverseCumulativeProbability", new String[]{"double"}, new String[]{"0.49999999999999994"}, false, 2, new String[][]{{"org.apache.commons.math.distribution.FDistributionImpl", "getDomainLowerBound", "double", "NaN"}, {"org.apache.commons.math.distribution.FDistributionImpl", "setDenominatorDegreesOfFreedom", "double", "1.0"}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("1.0000000158394697", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getDenominatorDegreesOfFreedom=1.0, getNumeratorDegreesOfFreedom=1.0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput293() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.distribution.FDistributionImpl", "org.apache.commons.math.distribution.FDistributionImpl", "cumulativeProbability", new String[]{"double", "double"}, new String[]{"0.0", "0.0"}, false, 0, new String[][]{{"org.apache.commons.math.distribution.FDistributionImpl", "getDomainLowerBound", "double", "-2.0999999999999996"}, {"org.apache.commons.math.distribution.FDistributionImpl", "setNumeratorDegreesOfFreedom", "double", "NaN"}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("0.0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getDenominatorDegreesOfFreedom=0.0, getNumeratorDegreesOfFreedom=NaN}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput294() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.distribution.FDistributionImpl", "org.apache.commons.math.distribution.FDistributionImpl", "getNumeratorDegreesOfFreedom", new String[]{}, new String[]{}, false, 2, new String[][]{{"org.apache.commons.math.distribution.FDistributionImpl", "setNumeratorDegreesOfFreedom", "double", "NaN"}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("NaN", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getDenominatorDegreesOfFreedom=Infinity, getNumeratorDegreesOfFreedom=NaN}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput295() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.distribution.FDistributionImpl", "org.apache.commons.math.distribution.FDistributionImpl", "setDenominatorDegreesOfFreedom", new String[]{"double"}, new String[]{"8.988465674311579E307"}, false, 1, new String[][]{{"org.apache.commons.math.distribution.FDistributionImpl", "cumulativeProbability", "double,double", "-Infinity", "-Infinity"}, {"org.apache.commons.math.distribution.FDistributionImpl", "getInitialDomain", "double", "NaN"}}, 1);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getDenominatorDegreesOfFreedom=8.988465674311579E307, getNumeratorDegreesOfFreedom=0.0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput296() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.distribution.FDistributionImpl", "org.apache.commons.math.distribution.FDistributionImpl", "getInitialDomain", new String[]{"double"}, new String[]{"-Infinity"}, false, 7, new String[][]{{"org.apache.commons.math.distribution.FDistributionImpl", "setDenominatorDegreesOfFreedom", "double", "13.2"}});
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("1.1785714285714286", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getDenominatorDegreesOfFreedom=13.2, getNumeratorDegreesOfFreedom=1.0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput297() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.distribution.FDistributionImpl", "org.apache.commons.math.distribution.FDistributionImpl", "getInitialDomain", new String[]{"double"}, new String[]{"-0.5"}, false, 3, new String[][]{{"org.apache.commons.math.distribution.FDistributionImpl", "setDenominatorDegreesOfFreedom", "double", "62.0"}});
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("1.0333333333333334", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getDenominatorDegreesOfFreedom=62.0, getNumeratorDegreesOfFreedom=0.0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput298() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.distribution.FDistributionImpl", "org.apache.commons.math.distribution.FDistributionImpl", "cumulativeProbability", new String[]{"double"}, new String[]{"0.5000000000000001"}, false, 2, new String[][]{{"org.apache.commons.math.distribution.FDistributionImpl", "setDenominatorDegreesOfFreedom", "double", "0.6599999999999999"}, {"org.apache.commons.math.distribution.FDistributionImpl", "setNumeratorDegreesOfFreedom", "double", "4.0"}});
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("0.2120566297679598", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getDenominatorDegreesOfFreedom=0.6599999999999999, getNumeratorDegreesOfFreedom=4.0}", SearchInputFactory_scaffolding.receiverState());
 }
}
