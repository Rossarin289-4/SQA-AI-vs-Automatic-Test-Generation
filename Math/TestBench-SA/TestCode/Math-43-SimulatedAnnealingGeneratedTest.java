package generated.algorithm;

import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;
import static org.junit.Assert.*;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class SimulatedAnnealingGeneratedTest {
 @Test(timeout = 20000)
 public void generatedInput000() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.stat.descriptive.SummaryStatistics", "org.apache.commons.math.stat.descriptive.SummaryStatistics", "getSumsqImpl", new String[]{}, new String[]{}, false, 3, new String[][]{{"org.apache.commons.math.stat.descriptive.SummaryStatistics", "setSumImpl", "org.apache.commons.math.stat.descriptive.StorelessUnivariateStatistic", "<sample:5>"}, {"org.apache.commons.math.stat.descriptive.SummaryStatistics", "copy", ""}, {"org.apache.commons.math.stat.descriptive.SummaryStatistics", "setMeanImpl", "org.apache.commons.math.stat.descriptive.StorelessUnivariateStatistic", "<sample:6>"}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.math.stat.descriptive.summary.SumOfSquares", actual.getClass().getName());
  assertEquals("{getData=null, getN=0, getResult=0.0}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "SummaryStatistics:\nn: 0\nmin: NaN\nmax: NaN\nmean: NaN\ngeometric mean: NaN\nvariance: NaN\nsum of squares: 0.0\nstandard deviation: NaN\nsum of logs: 0.0\n {getGeometricMean=NaN, getMax=NaN, getMean=NaN, getM...#356#-2113366850", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput001() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math.stat.descriptive.SummaryStatistics", "org.apache.commons.math.stat.descriptive.SummaryStatistics", "getSummary", new String[]{}, new String[]{}, false, 15, new String[][]{{"org.apache.commons.math.stat.descriptive.SummaryStatistics", "clear", ""}, {"org.apache.commons.math.stat.descriptive.SummaryStatistics", "getGeometricMean", ""}, {"org.apache.commons.math.stat.descriptive.SummaryStatistics", "addValue", "double", "-1.7976931348623157E308"}}, 1), new String[][]{{"getVariance", "", "0"}});
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("0.0", String.valueOf(actual));
  assertEquals("receiver state after the call", "SummaryStatistics:\nn: 1\nmin: -1.7976931348623157E308\nmax: -1.7976931348623157E308\nmean: -1.7976931348623157E308\ngeometric mean: NaN\nvariance: 0.0\nsum of squares: Infinity\nstandard deviation: 0.0\nsum o...#500#705366924", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput002() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math.stat.descriptive.SummaryStatistics", "org.apache.commons.math.stat.descriptive.SummaryStatistics", "setMeanImpl", new String[]{"org.apache.commons.math.stat.descriptive.StorelessUnivariateStatistic"}, new String[]{"<null>"}, false, 6, new String[][]{{"org.apache.commons.math.stat.descriptive.SummaryStatistics", "setGeoMeanImpl", "org.apache.commons.math.stat.descriptive.StorelessUnivariateStatistic", "<sample:5>"}, {"org.apache.commons.math.stat.descriptive.SummaryStatistics", "addValue", "double", "0.9999999999999999"}, {"org.apache.commons.math.stat.descriptive.SummaryStatistics", "getVarianceImpl", ""}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("org.apache.commons.math.exception.MathIllegalStateException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput003() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.stat.descriptive.SummaryStatistics", "org.apache.commons.math.stat.descriptive.SummaryStatistics", "addValue", new String[]{"double"}, new String[]{"-1.7976931348623157E308"}, false, 13, new String[][]{{"org.apache.commons.math.stat.descriptive.SummaryStatistics", "addValue", "double", "1.7976931348623157E308"}, {"org.apache.commons.math.stat.descriptive.SummaryStatistics", "getSecondMoment", ""}});
  assertNull(actual);
  assertEquals("receiver state after the call", "SummaryStatistics:\nn: 2\nmin: -1.7976931348623157E308\nmax: 1.7976931348623157E308\nmean: -Infinity\ngeometric mean: NaN\nvariance: Infinity\nsum of squares: Infinity\nstandard deviation: Infinity\nsum of log...#480#508904309", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput004() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.stat.descriptive.SummaryStatistics", "org.apache.commons.math.stat.descriptive.SummaryStatistics", "getMin", new String[]{}, new String[]{}, false, 1, new String[][]{{"org.apache.commons.math.stat.descriptive.SummaryStatistics", "setMeanImpl", "org.apache.commons.math.stat.descriptive.StorelessUnivariateStatistic", "<sample:2>"}, {"org.apache.commons.math.stat.descriptive.SummaryStatistics", "addValue", "double", "0.9999999999999999"}});
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("0.9999999999999999", String.valueOf(actual));
  assertEquals("receiver state after the call", "SummaryStatistics:\nn: 1\nmin: 0.9999999999999999\nmax: 0.9999999999999999\nmean: 0.0\ngeometric mean: 0.9999999999999999\nvariance: 0.0\nsum of squares: 0.9999999999999998\nstandard deviation: 0.0\nsum of log...#525#1912425847", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput005() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math.stat.descriptive.SummaryStatistics", "org.apache.commons.math.stat.descriptive.SummaryStatistics", "getMeanImpl", new String[]{}, new String[]{}, false, 13, new String[][]{{"org.apache.commons.math.stat.descriptive.SummaryStatistics", "getSumImpl", ""}, {"org.apache.commons.math.stat.descriptive.SummaryStatistics", "getVariance", ""}}), new String[][]{{"getResult", "", "6"}});
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("NaN", String.valueOf(actual));
  assertEquals("receiver state after the call", "SummaryStatistics:\nn: 0\nmin: NaN\nmax: NaN\nmean: NaN\ngeometric mean: NaN\nvariance: NaN\nsum of squares: 0.0\nstandard deviation: NaN\nsum of logs: 0.0\n {getGeometricMean=NaN, getMax=NaN, getMean=NaN, getM...#350#2146862523", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput006() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math.stat.descriptive.SummaryStatistics", "org.apache.commons.math.stat.descriptive.SummaryStatistics", "copy", new String[]{}, new String[]{}, false, 16, new String[][]{{"org.apache.commons.math.stat.descriptive.SummaryStatistics", "getMinImpl", ""}, {"org.apache.commons.math.stat.descriptive.SummaryStatistics", "setMaxImpl", "org.apache.commons.math.stat.descriptive.StorelessUnivariateStatistic", "<sample:5>"}}), new String[][]{{"getN", "", "5"}, {"setMinImpl", "org.apache.commons.math.stat.descriptive.StorelessUnivariateStatistic", "3"}, {"getMean", "", "1"}, {"setSumImpl", "org.apache.commons.math.stat.descriptive.StorelessUnivariateStatistic", "2"}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.math.stat.descriptive.SummaryStatistics", actual.getClass().getName());
  assertEquals("SummaryStatistics:\nn: 0\nmin: 1.0\nmax: -Infinity\nmean: NaN\ngeometric mean: NaN\nvariance: NaN\nsum of squares: 0.0\nstandard deviation: NaN\nsum of logs: 0.0\n {getGeometricMean=NaN, getMax=-Infinity, getMe...#362#-629749705", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "SummaryStatistics:\nn: 0\nmin: NaN\nmax: -Infinity\nmean: NaN\ngeometric mean: NaN\nvariance: NaN\nsum of squares: 0.0\nstandard deviation: NaN\nsum of logs: 0.0\n {getGeometricMean=NaN, getMax=-Infinity, getMe...#362#441961607", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput007() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.stat.descriptive.SummaryStatistics", "org.apache.commons.math.stat.descriptive.SummaryStatistics", "setSumLogImpl", new String[]{"org.apache.commons.math.stat.descriptive.StorelessUnivariateStatistic"}, new String[]{"<sample:5>"}, false, 2, new String[][]{{"org.apache.commons.math.stat.descriptive.SummaryStatistics", "setMeanImpl", "org.apache.commons.math.stat.descriptive.StorelessUnivariateStatistic", "<sample:6>"}, {"org.apache.commons.math.stat.descriptive.SummaryStatistics", "clear", ""}, {"org.apache.commons.math.stat.descriptive.SummaryStatistics", "getVariance", ""}});
  assertNull(actual);
  assertEquals("receiver state after the call", "SummaryStatistics:\nn: 0\nmin: NaN\nmax: NaN\nmean: NaN\ngeometric mean: 0.0\nvariance: NaN\nsum of squares: 0.0\nstandard deviation: NaN\nsum of logs: -Infinity\n {getGeometricMean=0.0, getMax=NaN, getMean=NaN...#362#-1804974637", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput008() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math.stat.descriptive.SummaryStatistics", "org.apache.commons.math.stat.descriptive.SummaryStatistics", "copy", new String[]{}, new String[]{}, false, 36, new String[][]{{"org.apache.commons.math.stat.descriptive.SummaryStatistics", "setGeoMeanImpl", "org.apache.commons.math.stat.descriptive.StorelessUnivariateStatistic", "<sample:8>"}, {"org.apache.commons.math.stat.descriptive.SummaryStatistics", "setSumLogImpl", "org.apache.commons.math.stat.descriptive.StorelessUnivariateStatistic", "<sample:0>"}, {"org.apache.commons.math.stat.descriptive.SummaryStatistics", "setMeanImpl", "org.apache.commons.math.stat.descriptive.StorelessUnivariateStatistic", "<sample:7>"}}, 1), new String[][]{{"getMaxImpl", "", "3"}, {"increment", "double", "3"}, {"getData", "", "2"}, {"setData", "double[]", "6"}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.math.stat.descriptive.rank.Max", actual.getClass().getName());
  assertEquals("{getData=[0.0], getN=1, getResult=1.0}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "SummaryStatistics:\nn: 0\nmin: NaN\nmax: NaN\nmean: 0.0\ngeometric mean: NaN\nvariance: NaN\nsum of squares: 0.0\nstandard deviation: NaN\nsum of logs: -Infinity\n {getGeometricMean=NaN, getMax=NaN, getMean=0.0...#362#-1360417247", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput009() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.stat.descriptive.SummaryStatistics", "org.apache.commons.math.stat.descriptive.SummaryStatistics", "clear", new String[]{}, new String[]{}, false, 3, new String[][]{{"org.apache.commons.math.stat.descriptive.SummaryStatistics", "equals", "java.lang.Object", "<i:1>"}, {"org.apache.commons.math.stat.descriptive.SummaryStatistics", "setVarianceImpl", "org.apache.commons.math.stat.descriptive.StorelessUnivariateStatistic", "<sample:3>"}, {"org.apache.commons.math.stat.descriptive.SummaryStatistics", "copy", ""}}, 2);
  assertNull(actual);
  assertEquals("receiver state after the call", "SummaryStatistics:\nn: 0\nmin: NaN\nmax: NaN\nmean: NaN\ngeometric mean: NaN\nvariance: 1.0\nsum of squares: 0.0\nstandard deviation: NaN\nsum of logs: 0.0\n {getGeometricMean=NaN, getMax=NaN, getMean=NaN, getM...#350#831060491", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput010() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math.stat.descriptive.SummaryStatistics", "org.apache.commons.math.stat.descriptive.SummaryStatistics", "copy", new String[]{}, new String[]{}, false, 11, new String[][]{{"org.apache.commons.math.stat.descriptive.SummaryStatistics", "getVariance", ""}, {"org.apache.commons.math.stat.descriptive.SummaryStatistics", "hashCode", ""}}, 3), new String[][]{{"setGeoMeanImpl", "org.apache.commons.math.stat.descriptive.StorelessUnivariateStatistic", "6"}, {"getSumsqImpl", "", "5"}, {"increment", "double", "1"}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.math.stat.descriptive.summary.SumOfSquares", actual.getClass().getName());
  assertEquals("{getData=null, getN=1, getResult=1.0}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "SummaryStatistics:\nn: 0\nmin: NaN\nmax: NaN\nmean: NaN\ngeometric mean: NaN\nvariance: NaN\nsum of squares: 0.0\nstandard deviation: NaN\nsum of logs: 0.0\n {getGeometricMean=NaN, getMax=NaN, getMean=NaN, getM...#350#2146862523", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput011() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math.stat.descriptive.SummaryStatistics", "org.apache.commons.math.stat.descriptive.SummaryStatistics", "copy", new String[]{}, new String[]{}, false, 12, new String[][]{{"org.apache.commons.math.stat.descriptive.SummaryStatistics", "setSumsqImpl", "org.apache.commons.math.stat.descriptive.StorelessUnivariateStatistic", "<sample:0>"}, {"org.apache.commons.math.stat.descriptive.SummaryStatistics", "setMinImpl", "org.apache.commons.math.stat.descriptive.StorelessUnivariateStatistic", "<sample:6>"}}, 2), new String[][]{{"getSumsq", "", "6"}, {"getSumsqImpl", "", "4"}, {"incrementAll", "double[]", "0"}});
  assertNotNull(actual);
  assertEquals("receiver state after the call", "SummaryStatistics:\nn: 0\nmin: NaN\nmax: NaN\nmean: NaN\ngeometric mean: NaN\nvariance: NaN\nsum of squares: -Infinity\nstandard deviation: NaN\nsum of logs: 0.0\n {getGeometricMean=NaN, getMax=NaN, getMean=NaN...#362#114820443", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput012() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.stat.descriptive.SummaryStatistics", "org.apache.commons.math.stat.descriptive.SummaryStatistics", "getSum", new String[]{}, new String[]{}, false, 17, new String[][]{{"org.apache.commons.math.stat.descriptive.SummaryStatistics", "getSumLogImpl", ""}, {"org.apache.commons.math.stat.descriptive.SummaryStatistics", "setVarianceImpl", "org.apache.commons.math.stat.descriptive.StorelessUnivariateStatistic", "<sample:6>"}, {"org.apache.commons.math.stat.descriptive.SummaryStatistics", "addValue", "double", "-62.29"}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("-62.29", String.valueOf(actual));
  assertEquals("receiver state after the call", "SummaryStatistics:\nn: 1\nmin: -62.29\nmax: -62.29\nmean: -62.29\ngeometric mean: NaN\nvariance: NaN\nsum of squares: 3880.0441\nstandard deviation: 0.0\nsum of logs: NaN\n {getGeometricMean=NaN, getMax=-62.29,...#383#1125530935", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput013() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.stat.descriptive.SummaryStatistics", "org.apache.commons.math.stat.descriptive.SummaryStatistics", "getSumOfLogs", new String[]{}, new String[]{}, false, 0, null, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("0.0", String.valueOf(actual));
  assertEquals("receiver state after the call", "SummaryStatistics:\nn: 0\nmin: NaN\nmax: NaN\nmean: NaN\ngeometric mean: NaN\nvariance: NaN\nsum of squares: 0.0\nstandard deviation: NaN\nsum of logs: 0.0\n {getGeometricMean=NaN, getMax=NaN, getMean=NaN, getM...#350#2146862523", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput014() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.stat.descriptive.SummaryStatistics", "org.apache.commons.math.stat.descriptive.SummaryStatistics", "getSumOfLogs", new String[]{}, new String[]{}, false, 4, new String[][]{{"org.apache.commons.math.stat.descriptive.SummaryStatistics", "getSumImpl", ""}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("0.0", String.valueOf(actual));
  assertEquals("receiver state after the call", "SummaryStatistics:\nn: 0\nmin: NaN\nmax: NaN\nmean: NaN\ngeometric mean: NaN\nvariance: NaN\nsum of squares: 0.0\nstandard deviation: NaN\nsum of logs: 0.0\n {getGeometricMean=NaN, getMax=NaN, getMean=NaN, getM...#350#2146862523", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput015() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.stat.descriptive.SummaryStatistics", "org.apache.commons.math.stat.descriptive.SummaryStatistics", "getSumOfLogs", new String[]{}, new String[]{}, false, 9, new String[][]{}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("0.0", String.valueOf(actual));
  assertEquals("receiver state after the call", "SummaryStatistics:\nn: 0\nmin: NaN\nmax: NaN\nmean: NaN\ngeometric mean: NaN\nvariance: NaN\nsum of squares: 0.0\nstandard deviation: NaN\nsum of logs: 0.0\n {getGeometricMean=NaN, getMax=NaN, getMean=NaN, getM...#350#2146862523", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput016() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.stat.descriptive.SummaryStatistics", "org.apache.commons.math.stat.descriptive.SummaryStatistics", "getSumOfLogs", new String[]{}, new String[]{}, false, 30, new String[][]{{"org.apache.commons.math.stat.descriptive.SummaryStatistics", "getMeanImpl", ""}, {"org.apache.commons.math.stat.descriptive.SummaryStatistics", "getMeanImpl", ""}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("0.0", String.valueOf(actual));
  assertEquals("receiver state after the call", "SummaryStatistics:\nn: 0\nmin: NaN\nmax: NaN\nmean: NaN\ngeometric mean: NaN\nvariance: NaN\nsum of squares: 0.0\nstandard deviation: NaN\nsum of logs: 0.0\n {getGeometricMean=NaN, getMax=NaN, getMean=NaN, getM...#350#2146862523", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput017() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.stat.descriptive.SummaryStatistics", "org.apache.commons.math.stat.descriptive.SummaryStatistics", "setMaxImpl", new String[]{"org.apache.commons.math.stat.descriptive.StorelessUnivariateStatistic"}, new String[]{"<sample:0>"}, false, 1, new String[][]{{"org.apache.commons.math.stat.descriptive.SummaryStatistics", "getSum", ""}}, 2);
  assertNull(actual);
  assertEquals("receiver state after the call", "SummaryStatistics:\nn: 0\nmin: NaN\nmax: -Infinity\nmean: NaN\ngeometric mean: NaN\nvariance: NaN\nsum of squares: 0.0\nstandard deviation: NaN\nsum of logs: 0.0\n {getGeometricMean=NaN, getMax=-Infinity, getMe...#362#441961607", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput018() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.stat.descriptive.SummaryStatistics", "org.apache.commons.math.stat.descriptive.SummaryStatistics", "getVariance", new String[]{}, new String[]{}, false, 0, null, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("NaN", String.valueOf(actual));
  assertEquals("receiver state after the call", "SummaryStatistics:\nn: 0\nmin: NaN\nmax: NaN\nmean: NaN\ngeometric mean: NaN\nvariance: NaN\nsum of squares: 0.0\nstandard deviation: NaN\nsum of logs: 0.0\n {getGeometricMean=NaN, getMax=NaN, getMean=NaN, getM...#350#2146862523", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput019() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.stat.descriptive.SummaryStatistics", "org.apache.commons.math.stat.descriptive.SummaryStatistics", "setMaxImpl", new String[]{"org.apache.commons.math.stat.descriptive.StorelessUnivariateStatistic"}, new String[]{"<sample:4>"}, false, 1, new String[][]{{"org.apache.commons.math.stat.descriptive.SummaryStatistics", "getSum", ""}}, 2);
  assertNull(actual);
  assertEquals("receiver state after the call", "SummaryStatistics:\nn: 0\nmin: NaN\nmax: NaN\nmean: NaN\ngeometric mean: NaN\nvariance: NaN\nsum of squares: 0.0\nstandard deviation: NaN\nsum of logs: 0.0\n {getGeometricMean=NaN, getMax=NaN, getMean=NaN, getM...#350#2146862523", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput020() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.stat.descriptive.SummaryStatistics", "org.apache.commons.math.stat.descriptive.SummaryStatistics", "getMaxImpl", new String[]{}, new String[]{}, false, 1, new String[][]{{"org.apache.commons.math.stat.descriptive.SummaryStatistics", "setVarianceImpl", "org.apache.commons.math.stat.descriptive.StorelessUnivariateStatistic", "<sample:4>"}}, 3);
  assertNotNull(actual);
  assertEquals("org.apache.commons.math.stat.descriptive.rank.Max", actual.getClass().getName());
  assertEquals("{getData=null, getN=0, getResult=NaN}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "SummaryStatistics:\nn: 0\nmin: NaN\nmax: NaN\nmean: NaN\ngeometric mean: NaN\nvariance: NaN\nsum of squares: 0.0\nstandard deviation: NaN\nsum of logs: 0.0\n {getGeometricMean=NaN, getMax=NaN, getMean=NaN, getM...#350#2146862523", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput021() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math.stat.descriptive.SummaryStatistics", "org.apache.commons.math.stat.descriptive.SummaryStatistics", "getMaxImpl", new String[]{}, new String[]{}, false, 14, new String[][]{{"org.apache.commons.math.stat.descriptive.SummaryStatistics", "setVarianceImpl", "org.apache.commons.math.stat.descriptive.StorelessUnivariateStatistic", "<sample:0>"}, {"org.apache.commons.math.stat.descriptive.SummaryStatistics", "setSumLogImpl", "org.apache.commons.math.stat.descriptive.StorelessUnivariateStatistic", "<sample:5>"}}, 2), new String[][]{{"clear", "", "2"}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.math.stat.descriptive.rank.Max", actual.getClass().getName());
  assertEquals("{getData=null, getN=0, getResult=NaN}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "SummaryStatistics:\nn: 0\nmin: NaN\nmax: NaN\nmean: NaN\ngeometric mean: 0.0\nvariance: -Infinity\nsum of squares: 0.0\nstandard deviation: NaN\nsum of logs: -Infinity\n {getGeometricMean=0.0, getMax=NaN, getMe...#374#188597087", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput022() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math.stat.descriptive.SummaryStatistics", "org.apache.commons.math.stat.descriptive.SummaryStatistics", "getMaxImpl", new String[]{}, new String[]{}, false, 22, new String[][]{{"org.apache.commons.math.stat.descriptive.SummaryStatistics", "setVarianceImpl", "org.apache.commons.math.stat.descriptive.StorelessUnivariateStatistic", "<sample:0>"}, {"org.apache.commons.math.stat.descriptive.SummaryStatistics", "setSumLogImpl", "org.apache.commons.math.stat.descriptive.StorelessUnivariateStatistic", "<sample:2>"}}, 2), new String[][]{{"clear", "", "2"}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.math.stat.descriptive.rank.Max", actual.getClass().getName());
  assertEquals("{getData=null, getN=0, getResult=NaN}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "SummaryStatistics:\nn: 0\nmin: NaN\nmax: NaN\nmean: NaN\ngeometric mean: NaN\nvariance: -Infinity\nsum of squares: 0.0\nstandard deviation: NaN\nsum of logs: 0.0\n {getGeometricMean=NaN, getMax=NaN, getMean=NaN...#362#302438663", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput023() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.stat.descriptive.SummaryStatistics", "org.apache.commons.math.stat.descriptive.SummaryStatistics", "getN", new String[]{}, new String[]{}, false, 11, new String[][]{}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Long", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "SummaryStatistics:\nn: 0\nmin: NaN\nmax: NaN\nmean: NaN\ngeometric mean: NaN\nvariance: NaN\nsum of squares: 0.0\nstandard deviation: NaN\nsum of logs: 0.0\n {getGeometricMean=NaN, getMax=NaN, getMean=NaN, getM...#350#2146862523", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput024() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.stat.descriptive.SummaryStatistics", "org.apache.commons.math.stat.descriptive.SummaryStatistics", "getPopulationVariance", new String[]{}, new String[]{}, false, 3, new String[][]{}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("NaN", String.valueOf(actual));
  assertEquals("receiver state after the call", "SummaryStatistics:\nn: 0\nmin: NaN\nmax: NaN\nmean: NaN\ngeometric mean: NaN\nvariance: NaN\nsum of squares: 0.0\nstandard deviation: NaN\nsum of logs: 0.0\n {getGeometricMean=NaN, getMax=NaN, getMean=NaN, getM...#350#2146862523", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput025() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.stat.descriptive.SummaryStatistics", "org.apache.commons.math.stat.descriptive.SummaryStatistics", "getPopulationVariance", new String[]{}, new String[]{}, false, 11, new String[][]{{"org.apache.commons.math.stat.descriptive.SummaryStatistics", "addValue", "double", "1.0"}, {"org.apache.commons.math.stat.descriptive.SummaryStatistics", "getMean", ""}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("0.0", String.valueOf(actual));
  assertEquals("receiver state after the call", "SummaryStatistics:\nn: 1\nmin: 1.0\nmax: 1.0\nmean: 1.0\ngeometric mean: 1.0\nvariance: 0.0\nsum of squares: 1.0\nstandard deviation: 0.0\nsum of logs: 0.0\n {getGeometricMean=1.0, getMax=1.0, getMean=1.0, getM...#350#230600414", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput026() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.stat.descriptive.SummaryStatistics", "org.apache.commons.math.stat.descriptive.SummaryStatistics", "getPopulationVariance", new String[]{}, new String[]{}, false, 16, new String[][]{{"org.apache.commons.math.stat.descriptive.SummaryStatistics", "addValue", "double", "0.5"}, {"org.apache.commons.math.stat.descriptive.SummaryStatistics", "getMean", ""}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("0.0", String.valueOf(actual));
  assertEquals("receiver state after the call", "SummaryStatistics:\nn: 1\nmin: 0.5\nmax: 0.5\nmean: 0.5\ngeometric mean: 0.5\nvariance: 0.0\nsum of squares: 0.25\nstandard deviation: 0.0\nsum of logs: -0.6931471805599453\n {getGeometricMean=0.5, getMax=0.5, ...#384#893346486", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput027() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.stat.descriptive.SummaryStatistics", "org.apache.commons.math.stat.descriptive.SummaryStatistics", "getPopulationVariance", new String[]{}, new String[]{}, false, 17, new String[][]{{"org.apache.commons.math.stat.descriptive.SummaryStatistics", "addValue", "double", "NaN"}, {"org.apache.commons.math.stat.descriptive.SummaryStatistics", "getMean", ""}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("0.0", String.valueOf(actual));
  assertEquals("receiver state after the call", "SummaryStatistics:\nn: 1\nmin: NaN\nmax: NaN\nmean: NaN\ngeometric mean: NaN\nvariance: 0.0\nsum of squares: NaN\nstandard deviation: 0.0\nsum of logs: NaN\n {getGeometricMean=NaN, getMax=NaN, getMean=NaN, getM...#350#-742111247", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput028() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.stat.descriptive.SummaryStatistics", "org.apache.commons.math.stat.descriptive.SummaryStatistics", "getPopulationVariance", new String[]{}, new String[]{}, false, 21, new String[][]{{"org.apache.commons.math.stat.descriptive.SummaryStatistics", "addValue", "double", "-8.988465674311579E307"}, {"org.apache.commons.math.stat.descriptive.SummaryStatistics", "getSummary", ""}, {"org.apache.commons.math.stat.descriptive.SummaryStatistics", "getMean", ""}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("0.0", String.valueOf(actual));
  assertEquals("receiver state after the call", "SummaryStatistics:\nn: 1\nmin: -8.988465674311579E307\nmax: -8.988465674311579E307\nmean: -8.988465674311579E307\ngeometric mean: NaN\nvariance: 0.0\nsum of squares: Infinity\nstandard deviation: 0.0\nsum of l...#493#-1664168008", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput029() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.stat.descriptive.SummaryStatistics", "org.apache.commons.math.stat.descriptive.SummaryStatistics", "getPopulationVariance", new String[]{}, new String[]{}, false, 28, new String[][]{{"org.apache.commons.math.stat.descriptive.SummaryStatistics", "getMaxImpl", ""}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("NaN", String.valueOf(actual));
  assertEquals("receiver state after the call", "SummaryStatistics:\nn: 0\nmin: NaN\nmax: NaN\nmean: NaN\ngeometric mean: NaN\nvariance: NaN\nsum of squares: 0.0\nstandard deviation: NaN\nsum of logs: 0.0\n {getGeometricMean=NaN, getMax=NaN, getMean=NaN, getM...#350#2146862523", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput030() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.stat.descriptive.SummaryStatistics", "org.apache.commons.math.stat.descriptive.SummaryStatistics", "setSumLogImpl", new String[]{"org.apache.commons.math.stat.descriptive.StorelessUnivariateStatistic"}, new String[]{"<sample:3>"}, false, 0, null, 1);
  assertNull(actual);
  assertEquals("receiver state after the call", "SummaryStatistics:\nn: 0\nmin: NaN\nmax: NaN\nmean: NaN\ngeometric mean: 2.718281828459045\nvariance: NaN\nsum of squares: 0.0\nstandard deviation: NaN\nsum of logs: 1.0\n {getGeometricMean=2.718281828459045, g...#378#-349379497", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput031() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.stat.descriptive.SummaryStatistics", "org.apache.commons.math.stat.descriptive.SummaryStatistics", "setSumLogImpl", new String[]{"org.apache.commons.math.stat.descriptive.StorelessUnivariateStatistic"}, new String[]{"<sample:5>"}, false, 9, new String[][]{{"org.apache.commons.math.stat.descriptive.SummaryStatistics", "equals", "java.lang.Object", "<b:true>"}, {"org.apache.commons.math.stat.descriptive.SummaryStatistics", "equals", "java.lang.Object", "<sample:0>"}}, 1);
  assertNull(actual);
  assertEquals("receiver state after the call", "SummaryStatistics:\nn: 0\nmin: NaN\nmax: NaN\nmean: NaN\ngeometric mean: 0.0\nvariance: NaN\nsum of squares: 0.0\nstandard deviation: NaN\nsum of logs: -Infinity\n {getGeometricMean=0.0, getMax=NaN, getMean=NaN...#362#-1804974637", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput032() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.stat.descriptive.SummaryStatistics", "org.apache.commons.math.stat.descriptive.SummaryStatistics", "setSumLogImpl", new String[]{"org.apache.commons.math.stat.descriptive.StorelessUnivariateStatistic"}, new String[]{"<sample:4>"}, false, 9, new String[][]{{"org.apache.commons.math.stat.descriptive.SummaryStatistics", "equals", "java.lang.Object", "<b:true>"}, {"org.apache.commons.math.stat.descriptive.SummaryStatistics", "equals", "java.lang.Object", "<sample:0>"}}, 1);
  assertNull(actual);
  assertEquals("receiver state after the call", "SummaryStatistics:\nn: 0\nmin: NaN\nmax: NaN\nmean: NaN\ngeometric mean: NaN\nvariance: NaN\nsum of squares: 0.0\nstandard deviation: NaN\nsum of logs: NaN\n {getGeometricMean=NaN, getMax=NaN, getMean=NaN, getM...#350#-352706035", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput033() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.stat.descriptive.SummaryStatistics", "org.apache.commons.math.stat.descriptive.SummaryStatistics", "setSumLogImpl", new String[]{"org.apache.commons.math.stat.descriptive.StorelessUnivariateStatistic"}, new String[]{"<sample:2>"}, false, 9, new String[][]{{"org.apache.commons.math.stat.descriptive.SummaryStatistics", "equals", "java.lang.Object", "<b:true>"}, {"org.apache.commons.math.stat.descriptive.SummaryStatistics", "getSumOfLogs", ""}, {"org.apache.commons.math.stat.descriptive.SummaryStatistics", "equals", "java.lang.Object", "<sample:0>"}}, 1);
  assertNull(actual);
  assertEquals("receiver state after the call", "SummaryStatistics:\nn: 0\nmin: NaN\nmax: NaN\nmean: NaN\ngeometric mean: NaN\nvariance: NaN\nsum of squares: 0.0\nstandard deviation: NaN\nsum of logs: 0.0\n {getGeometricMean=NaN, getMax=NaN, getMean=NaN, getM...#350#2146862523", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput034() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.stat.descriptive.SummaryStatistics", "org.apache.commons.math.stat.descriptive.SummaryStatistics", "setMeanImpl", new String[]{"org.apache.commons.math.stat.descriptive.StorelessUnivariateStatistic"}, new String[]{"<sample:3>"}, false, 0, null, 2);
  assertNull(actual);
  assertEquals("receiver state after the call", "SummaryStatistics:\nn: 0\nmin: NaN\nmax: NaN\nmean: 1.0\ngeometric mean: NaN\nvariance: NaN\nsum of squares: 0.0\nstandard deviation: NaN\nsum of logs: 0.0\n {getGeometricMean=NaN, getMax=NaN, getMean=1.0, getM...#350#-883672389", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput035() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.stat.descriptive.SummaryStatistics", "org.apache.commons.math.stat.descriptive.SummaryStatistics", "setMeanImpl", new String[]{"org.apache.commons.math.stat.descriptive.StorelessUnivariateStatistic"}, new String[]{"<sample:6>"}, false, 0, null, 2);
  assertNull(actual);
  assertEquals("receiver state after the call", "SummaryStatistics:\nn: 0\nmin: NaN\nmax: NaN\nmean: NaN\ngeometric mean: NaN\nvariance: NaN\nsum of squares: 0.0\nstandard deviation: NaN\nsum of logs: 0.0\n {getGeometricMean=NaN, getMax=NaN, getMean=NaN, getM...#350#2146862523", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput036() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.stat.descriptive.SummaryStatistics", "org.apache.commons.math.stat.descriptive.SummaryStatistics", "setMeanImpl", new String[]{"org.apache.commons.math.stat.descriptive.StorelessUnivariateStatistic"}, new String[]{"<sample:7>"}, false, 0, null, 2);
  assertNull(actual);
  assertEquals("receiver state after the call", "SummaryStatistics:\nn: 0\nmin: NaN\nmax: NaN\nmean: 0.0\ngeometric mean: NaN\nvariance: NaN\nsum of squares: 0.0\nstandard deviation: NaN\nsum of logs: 0.0\n {getGeometricMean=NaN, getMax=NaN, getMean=0.0, getM...#350#-1553279781", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput037() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math.stat.descriptive.SummaryStatistics", "org.apache.commons.math.stat.descriptive.SummaryStatistics", "getVarianceImpl", new String[]{}, new String[]{}, false, 0, null, 3), new String[][]{{"getN", "", "4"}, {"increment", "double", "5"}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.math.stat.descriptive.moment.Variance", actual.getClass().getName());
  assertEquals("{getData=null, getN=0, getResult=NaN, isBiasCorrected=true}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "SummaryStatistics:\nn: 0\nmin: NaN\nmax: NaN\nmean: NaN\ngeometric mean: NaN\nvariance: NaN\nsum of squares: 0.0\nstandard deviation: NaN\nsum of logs: 0.0\n {getGeometricMean=NaN, getMax=NaN, getMean=NaN, getM...#350#2146862523", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput038() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.stat.descriptive.SummaryStatistics", "org.apache.commons.math.stat.descriptive.SummaryStatistics", "getN", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.math.stat.descriptive.SummaryStatistics", "getSum", ""}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Long", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "SummaryStatistics:\nn: 0\nmin: NaN\nmax: NaN\nmean: NaN\ngeometric mean: NaN\nvariance: NaN\nsum of squares: 0.0\nstandard deviation: NaN\nsum of logs: 0.0\n {getGeometricMean=NaN, getMax=NaN, getMean=NaN, getM...#350#2146862523", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput039() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math.stat.descriptive.SummaryStatistics", "org.apache.commons.math.stat.descriptive.SummaryStatistics", "getVarianceImpl", new String[]{}, new String[]{}, false, 1, new String[][]{{"org.apache.commons.math.stat.descriptive.SummaryStatistics", "getMinImpl", ""}, {"org.apache.commons.math.stat.descriptive.SummaryStatistics", "getVarianceImpl", ""}, {"org.apache.commons.math.stat.descriptive.SummaryStatistics", "getSumOfLogs", ""}}, 3), new String[][]{{"evaluate", "double[],double[],double", "2"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("org.apache.commons.math.exception.DimensionMismatchException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput040() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.stat.descriptive.SummaryStatistics", "org.apache.commons.math.stat.descriptive.SummaryStatistics", "getSumsq", new String[]{}, new String[]{}, false, 12, new String[][]{{"org.apache.commons.math.stat.descriptive.SummaryStatistics", "setSumImpl", "org.apache.commons.math.stat.descriptive.StorelessUnivariateStatistic", "<sample:4>"}, {"org.apache.commons.math.stat.descriptive.SummaryStatistics", "getSum", ""}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("0.0", String.valueOf(actual));
  assertEquals("receiver state after the call", "SummaryStatistics:\nn: 0\nmin: NaN\nmax: NaN\nmean: NaN\ngeometric mean: NaN\nvariance: NaN\nsum of squares: 0.0\nstandard deviation: NaN\nsum of logs: 0.0\n {getGeometricMean=NaN, getMax=NaN, getMean=NaN, getM...#350#424382564", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput041() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.stat.descriptive.SummaryStatistics", "org.apache.commons.math.stat.descriptive.SummaryStatistics", "getSumsq", new String[]{}, new String[]{}, false, 13, new String[][]{{"org.apache.commons.math.stat.descriptive.SummaryStatistics", "getSum", ""}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("0.0", String.valueOf(actual));
  assertEquals("receiver state after the call", "SummaryStatistics:\nn: 0\nmin: NaN\nmax: NaN\nmean: NaN\ngeometric mean: NaN\nvariance: NaN\nsum of squares: 0.0\nstandard deviation: NaN\nsum of logs: 0.0\n {getGeometricMean=NaN, getMax=NaN, getMean=NaN, getM...#350#2146862523", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput042() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.stat.descriptive.SummaryStatistics", "org.apache.commons.math.stat.descriptive.SummaryStatistics", "setSumImpl", new String[]{"org.apache.commons.math.stat.descriptive.StorelessUnivariateStatistic"}, new String[]{"<null>"}, false, 0, null, 1);
  assertNull(actual);
  assertEquals("receiver state after the call", "SummaryStatistics:\nn: 0\nmin: NaN\nmax: NaN\nmean: NaN\ngeometric mean: NaN\nvariance: NaN\nsum of squares: 0.0\nstandard deviation: NaN\nsum of logs: 0.0\n {getGeometricMean=NaN, getMax=NaN, getMean=NaN, getM...#368#-1327726461", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput043() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.stat.descriptive.SummaryStatistics", "org.apache.commons.math.stat.descriptive.SummaryStatistics", "setSumImpl", new String[]{"org.apache.commons.math.stat.descriptive.StorelessUnivariateStatistic"}, new String[]{"<sample:4>"}, false, 0, null, 1);
  assertNull(actual);
  assertEquals("receiver state after the call", "SummaryStatistics:\nn: 0\nmin: NaN\nmax: NaN\nmean: NaN\ngeometric mean: NaN\nvariance: NaN\nsum of squares: 0.0\nstandard deviation: NaN\nsum of logs: 0.0\n {getGeometricMean=NaN, getMax=NaN, getMean=NaN, getM...#350#424382564", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput044() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.stat.descriptive.SummaryStatistics", "org.apache.commons.math.stat.descriptive.SummaryStatistics", "setSumImpl", new String[]{"org.apache.commons.math.stat.descriptive.StorelessUnivariateStatistic"}, new String[]{"<sample:2>"}, false, 0, null, 1);
  assertNull(actual);
  assertEquals("receiver state after the call", "SummaryStatistics:\nn: 0\nmin: NaN\nmax: NaN\nmean: NaN\ngeometric mean: NaN\nvariance: NaN\nsum of squares: 0.0\nstandard deviation: NaN\nsum of logs: 0.0\n {getGeometricMean=NaN, getMax=NaN, getMean=NaN, getM...#350#2146862523", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput045() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.stat.descriptive.SummaryStatistics", "org.apache.commons.math.stat.descriptive.SummaryStatistics", "getMean", new String[]{}, new String[]{}, false, 23, new String[][]{{"org.apache.commons.math.stat.descriptive.SummaryStatistics", "copy", ""}, {"org.apache.commons.math.stat.descriptive.SummaryStatistics", "setMeanImpl", "org.apache.commons.math.stat.descriptive.StorelessUnivariateStatistic", "<sample:5>"}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("-Infinity", String.valueOf(actual));
  assertEquals("receiver state after the call", "SummaryStatistics:\nn: 0\nmin: NaN\nmax: NaN\nmean: -Infinity\ngeometric mean: NaN\nvariance: NaN\nsum of squares: 0.0\nstandard deviation: NaN\nsum of logs: 0.0\n {getGeometricMean=NaN, getMax=NaN, getMean=-In...#362#-1687875013", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput046() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.stat.descriptive.SummaryStatistics", "org.apache.commons.math.stat.descriptive.SummaryStatistics", "getMean", new String[]{}, new String[]{}, false, 8, new String[][]{{"org.apache.commons.math.stat.descriptive.SummaryStatistics", "equals", "java.lang.Object", "<null>"}, {"org.apache.commons.math.stat.descriptive.SummaryStatistics", "copy", ""}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("NaN", String.valueOf(actual));
  assertEquals("receiver state after the call", "SummaryStatistics:\nn: 0\nmin: NaN\nmax: NaN\nmean: NaN\ngeometric mean: NaN\nvariance: NaN\nsum of squares: 0.0\nstandard deviation: NaN\nsum of logs: 0.0\n {getGeometricMean=NaN, getMax=NaN, getMean=NaN, getM...#350#2146862523", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput047() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.stat.descriptive.SummaryStatistics", "org.apache.commons.math.stat.descriptive.SummaryStatistics", "getSum", new String[]{}, new String[]{}, false, 27, new String[][]{}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("0.0", String.valueOf(actual));
  assertEquals("receiver state after the call", "SummaryStatistics:\nn: 0\nmin: NaN\nmax: NaN\nmean: NaN\ngeometric mean: NaN\nvariance: NaN\nsum of squares: 0.0\nstandard deviation: NaN\nsum of logs: 0.0\n {getGeometricMean=NaN, getMax=NaN, getMean=NaN, getM...#350#2146862523", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput048() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.stat.descriptive.SummaryStatistics", "org.apache.commons.math.stat.descriptive.SummaryStatistics", "getSum", new String[]{}, new String[]{}, false, 28, new String[][]{{"org.apache.commons.math.stat.descriptive.SummaryStatistics", "setVarianceImpl", "org.apache.commons.math.stat.descriptive.StorelessUnivariateStatistic", "<sample:3>"}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("0.0", String.valueOf(actual));
  assertEquals("receiver state after the call", "SummaryStatistics:\nn: 0\nmin: NaN\nmax: NaN\nmean: NaN\ngeometric mean: NaN\nvariance: 1.0\nsum of squares: 0.0\nstandard deviation: NaN\nsum of logs: 0.0\n {getGeometricMean=NaN, getMax=NaN, getMean=NaN, getM...#350#831060491", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput049() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.stat.descriptive.SummaryStatistics", "org.apache.commons.math.stat.descriptive.SummaryStatistics", "setSumImpl", new String[]{"org.apache.commons.math.stat.descriptive.StorelessUnivariateStatistic"}, new String[]{"<sample:1>"}, false, 4, new String[][]{{"org.apache.commons.math.stat.descriptive.SummaryStatistics", "getSum", ""}, {"org.apache.commons.math.stat.descriptive.SummaryStatistics", "getSumsqImpl", ""}, {"org.apache.commons.math.stat.descriptive.SummaryStatistics", "setMaxImpl", "org.apache.commons.math.stat.descriptive.StorelessUnivariateStatistic", "<sample:3>"}}, 1);
  assertNull(actual);
  assertEquals("receiver state after the call", "SummaryStatistics:\nn: 0\nmin: NaN\nmax: 1.0\nmean: NaN\ngeometric mean: NaN\nvariance: NaN\nsum of squares: 0.0\nstandard deviation: NaN\nsum of logs: 0.0\n {getGeometricMean=NaN, getMax=1.0, getMean=NaN, getM...#351#1874140933", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput050() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.stat.descriptive.SummaryStatistics", "org.apache.commons.math.stat.descriptive.SummaryStatistics", "setSumImpl", new String[]{"org.apache.commons.math.stat.descriptive.StorelessUnivariateStatistic"}, new String[]{"<sample:5>"}, false, 4, new String[][]{{"org.apache.commons.math.stat.descriptive.SummaryStatistics", "getSum", ""}, {"org.apache.commons.math.stat.descriptive.SummaryStatistics", "getMaxImpl", ""}, {"org.apache.commons.math.stat.descriptive.SummaryStatistics", "setMaxImpl", "org.apache.commons.math.stat.descriptive.StorelessUnivariateStatistic", "<sample:3>"}}, 1);
  assertNull(actual);
  assertEquals("receiver state after the call", "SummaryStatistics:\nn: 0\nmin: NaN\nmax: 1.0\nmean: NaN\ngeometric mean: NaN\nvariance: NaN\nsum of squares: 0.0\nstandard deviation: NaN\nsum of logs: 0.0\n {getGeometricMean=NaN, getMax=1.0, getMean=NaN, getM...#356#-1909118706", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput051() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math.stat.descriptive.SummaryStatistics", "org.apache.commons.math.stat.descriptive.SummaryStatistics", "setSumImpl", new String[]{"org.apache.commons.math.stat.descriptive.StorelessUnivariateStatistic"}, new String[]{"<sample:5>"}, false, 4, new String[][]{{"org.apache.commons.math.stat.descriptive.SummaryStatistics", "getSum", ""}, {"org.apache.commons.math.stat.descriptive.SummaryStatistics", "addValue", "double", "Infinity"}}, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("org.apache.commons.math.exception.MathIllegalStateException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput052() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.stat.descriptive.SummaryStatistics", "org.apache.commons.math.stat.descriptive.SummaryStatistics", "getMinImpl", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.math.stat.descriptive.SummaryStatistics", "setSumsqImpl", "org.apache.commons.math.stat.descriptive.StorelessUnivariateStatistic", "<sample:1>"}, {"org.apache.commons.math.stat.descriptive.SummaryStatistics", "hashCode", ""}}, 3);
  assertNotNull(actual);
  assertEquals("org.apache.commons.math.stat.descriptive.rank.Min", actual.getClass().getName());
  assertEquals("{getData=null, getN=0, getResult=NaN}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "SummaryStatistics:\nn: 0\nmin: NaN\nmax: NaN\nmean: NaN\ngeometric mean: NaN\nvariance: NaN\nsum of squares: -1.0\nstandard deviation: NaN\nsum of logs: 0.0\n {getGeometricMean=NaN, getMax=NaN, getMean=NaN, get...#352#-536078183", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput053() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.stat.descriptive.SummaryStatistics", "org.apache.commons.math.stat.descriptive.SummaryStatistics", "setSumLogImpl", new String[]{"org.apache.commons.math.stat.descriptive.StorelessUnivariateStatistic"}, new String[]{"<sample:4>"}, false, 0, new String[][]{{"org.apache.commons.math.stat.descriptive.SummaryStatistics", "getMax", ""}, {"org.apache.commons.math.stat.descriptive.SummaryStatistics", "equals", "java.lang.Object", "<s:b>"}}, 2);
  assertNull(actual);
  assertEquals("receiver state after the call", "SummaryStatistics:\nn: 0\nmin: NaN\nmax: NaN\nmean: NaN\ngeometric mean: NaN\nvariance: NaN\nsum of squares: 0.0\nstandard deviation: NaN\nsum of logs: NaN\n {getGeometricMean=NaN, getMax=NaN, getMean=NaN, getM...#350#-352706035", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput054() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.stat.descriptive.SummaryStatistics", "org.apache.commons.math.stat.descriptive.SummaryStatistics", "setSumsqImpl", new String[]{"org.apache.commons.math.stat.descriptive.StorelessUnivariateStatistic"}, new String[]{"<sample:0>"}, false, 0, null, 3);
  assertNull(actual);
  assertEquals("receiver state after the call", "SummaryStatistics:\nn: 0\nmin: NaN\nmax: NaN\nmean: NaN\ngeometric mean: NaN\nvariance: NaN\nsum of squares: -Infinity\nstandard deviation: NaN\nsum of logs: 0.0\n {getGeometricMean=NaN, getMax=NaN, getMean=NaN...#362#114820443", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput055() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.stat.descriptive.SummaryStatistics", "org.apache.commons.math.stat.descriptive.SummaryStatistics", "setSumsqImpl", new String[]{"org.apache.commons.math.stat.descriptive.StorelessUnivariateStatistic"}, new String[]{"<sample:2>"}, false, 0, null, 3);
  assertNull(actual);
  assertEquals("receiver state after the call", "SummaryStatistics:\nn: 0\nmin: NaN\nmax: NaN\nmean: NaN\ngeometric mean: NaN\nvariance: NaN\nsum of squares: 0.0\nstandard deviation: NaN\nsum of logs: 0.0\n {getGeometricMean=NaN, getMax=NaN, getMean=NaN, getM...#350#2146862523", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput056() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.stat.descriptive.SummaryStatistics", "org.apache.commons.math.stat.descriptive.SummaryStatistics", "setSumsqImpl", new String[]{"org.apache.commons.math.stat.descriptive.StorelessUnivariateStatistic"}, new String[]{"<sample:3>"}, false, 0, null, 3);
  assertNull(actual);
  assertEquals("receiver state after the call", "SummaryStatistics:\nn: 0\nmin: NaN\nmax: NaN\nmean: NaN\ngeometric mean: NaN\nvariance: NaN\nsum of squares: 1.0\nstandard deviation: NaN\nsum of logs: 0.0\n {getGeometricMean=NaN, getMax=NaN, getMean=NaN, getM...#350#-139303397", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput057() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.stat.descriptive.SummaryStatistics", "org.apache.commons.math.stat.descriptive.SummaryStatistics", "setSumsqImpl", new String[]{"org.apache.commons.math.stat.descriptive.StorelessUnivariateStatistic"}, new String[]{"<sample:6>"}, false, 1, new String[][]{}, 3);
  assertNull(actual);
  assertEquals("receiver state after the call", "SummaryStatistics:\nn: 0\nmin: NaN\nmax: NaN\nmean: NaN\ngeometric mean: NaN\nvariance: NaN\nsum of squares: NaN\nstandard deviation: NaN\nsum of logs: 0.0\n {getGeometricMean=NaN, getMax=NaN, getMean=NaN, getM...#350#-1265085157", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput058() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.stat.descriptive.SummaryStatistics", "org.apache.commons.math.stat.descriptive.SummaryStatistics", "setSumsqImpl", new String[]{"org.apache.commons.math.stat.descriptive.StorelessUnivariateStatistic"}, new String[]{"<sample:1>"}, false, 1, new String[][]{}, 3);
  assertNull(actual);
  assertEquals("receiver state after the call", "SummaryStatistics:\nn: 0\nmin: NaN\nmax: NaN\nmean: NaN\ngeometric mean: NaN\nvariance: NaN\nsum of squares: -1.0\nstandard deviation: NaN\nsum of logs: 0.0\n {getGeometricMean=NaN, getMax=NaN, getMean=NaN, get...#352#-536078183", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput059() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.stat.descriptive.SummaryStatistics", "org.apache.commons.math.stat.descriptive.SummaryStatistics", "setSumsqImpl", new String[]{"org.apache.commons.math.stat.descriptive.StorelessUnivariateStatistic"}, new String[]{"<sample:0>"}, false, 8, new String[][]{}, 2);
  assertNull(actual);
  assertEquals("receiver state after the call", "SummaryStatistics:\nn: 0\nmin: NaN\nmax: NaN\nmean: NaN\ngeometric mean: NaN\nvariance: NaN\nsum of squares: -Infinity\nstandard deviation: NaN\nsum of logs: 0.0\n {getGeometricMean=NaN, getMax=NaN, getMean=NaN...#362#114820443", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput060() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.stat.descriptive.SummaryStatistics", "org.apache.commons.math.stat.descriptive.SummaryStatistics", "setSumsqImpl", new String[]{"org.apache.commons.math.stat.descriptive.StorelessUnivariateStatistic"}, new String[]{"<sample:4>"}, false, 8, new String[][]{}, 2);
  assertNull(actual);
  assertEquals("receiver state after the call", "SummaryStatistics:\nn: 0\nmin: NaN\nmax: NaN\nmean: NaN\ngeometric mean: NaN\nvariance: NaN\nsum of squares: NaN\nstandard deviation: NaN\nsum of logs: 0.0\n {getGeometricMean=NaN, getMax=NaN, getMean=NaN, getM...#350#-1265085157", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput061() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.stat.descriptive.SummaryStatistics", "org.apache.commons.math.stat.descriptive.SummaryStatistics", "setSumsqImpl", new String[]{"org.apache.commons.math.stat.descriptive.StorelessUnivariateStatistic"}, new String[]{"<sample:7>"}, false, 8, new String[][]{}, 2);
  assertNull(actual);
  assertEquals("receiver state after the call", "SummaryStatistics:\nn: 0\nmin: NaN\nmax: NaN\nmean: NaN\ngeometric mean: NaN\nvariance: NaN\nsum of squares: 0.0\nstandard deviation: NaN\nsum of logs: 0.0\n {getGeometricMean=NaN, getMax=NaN, getMean=NaN, getM...#350#2146862523", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput062() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.stat.descriptive.SummaryStatistics", "org.apache.commons.math.stat.descriptive.SummaryStatistics", "setSumsqImpl", new String[]{"org.apache.commons.math.stat.descriptive.StorelessUnivariateStatistic"}, new String[]{"<sample:12>"}, false, 8, new String[][]{{"org.apache.commons.math.stat.descriptive.SummaryStatistics", "setVarianceImpl", "org.apache.commons.math.stat.descriptive.StorelessUnivariateStatistic", "<sample:5>"}}, 2);
  assertNull(actual);
  assertEquals("receiver state after the call", "SummaryStatistics:\nn: 0\nmin: NaN\nmax: NaN\nmean: NaN\ngeometric mean: NaN\nvariance: -Infinity\nsum of squares: NaN\nstandard deviation: NaN\nsum of logs: 0.0\n {getGeometricMean=NaN, getMax=NaN, getMean=NaN...#362#-1977114521", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput063() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.stat.descriptive.SummaryStatistics", "org.apache.commons.math.stat.descriptive.SummaryStatistics", "setSumsqImpl", new String[]{"org.apache.commons.math.stat.descriptive.StorelessUnivariateStatistic"}, new String[]{"<sample:1>"}, false, 8, new String[][]{{"org.apache.commons.math.stat.descriptive.SummaryStatistics", "setVarianceImpl", "org.apache.commons.math.stat.descriptive.StorelessUnivariateStatistic", "<sample:5>"}}, 2);
  assertNull(actual);
  assertEquals("receiver state after the call", "SummaryStatistics:\nn: 0\nmin: NaN\nmax: NaN\nmean: NaN\ngeometric mean: NaN\nvariance: -Infinity\nsum of squares: -1.0\nstandard deviation: NaN\nsum of logs: 0.0\n {getGeometricMean=NaN, getMax=NaN, getMean=Na...#364#-1115157531", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput064() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.stat.descriptive.SummaryStatistics", "org.apache.commons.math.stat.descriptive.SummaryStatistics", "getMinImpl", new String[]{}, new String[]{}, false, 12, new String[][]{{"org.apache.commons.math.stat.descriptive.SummaryStatistics", "getMin", ""}}, 2);
  assertNotNull(actual);
  assertEquals("org.apache.commons.math.stat.descriptive.rank.Min", actual.getClass().getName());
  assertEquals("{getData=null, getN=0, getResult=NaN}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "SummaryStatistics:\nn: 0\nmin: NaN\nmax: NaN\nmean: NaN\ngeometric mean: NaN\nvariance: NaN\nsum of squares: 0.0\nstandard deviation: NaN\nsum of logs: 0.0\n {getGeometricMean=NaN, getMax=NaN, getMean=NaN, getM...#350#2146862523", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput065() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math.stat.descriptive.SummaryStatistics", "org.apache.commons.math.stat.descriptive.SummaryStatistics", "getMinImpl", new String[]{}, new String[]{}, false, 16, new String[][]{{"org.apache.commons.math.stat.descriptive.SummaryStatistics", "getMin", ""}}, 2), new String[][]{{"setData", "double[],int,int", "4"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.ArrayIndexOutOfBoundsException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput066() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.stat.descriptive.SummaryStatistics", "org.apache.commons.math.stat.descriptive.SummaryStatistics", "getMinImpl", new String[]{}, new String[]{}, false, 33, new String[][]{{"org.apache.commons.math.stat.descriptive.SummaryStatistics", "setGeoMeanImpl", "org.apache.commons.math.stat.descriptive.StorelessUnivariateStatistic", "<sample:3>"}, {"org.apache.commons.math.stat.descriptive.SummaryStatistics", "getGeometricMean", ""}}, 3);
  assertNotNull(actual);
  assertEquals("org.apache.commons.math.stat.descriptive.rank.Min", actual.getClass().getName());
  assertEquals("{getData=null, getN=0, getResult=NaN}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "SummaryStatistics:\nn: 0\nmin: NaN\nmax: NaN\nmean: NaN\ngeometric mean: 1.0\nvariance: NaN\nsum of squares: 0.0\nstandard deviation: NaN\nsum of logs: 0.0\n {getGeometricMean=1.0, getMax=NaN, getMean=NaN, getM...#350#20795403", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput067() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.stat.descriptive.SummaryStatistics", "org.apache.commons.math.stat.descriptive.SummaryStatistics", "getMinImpl", new String[]{}, new String[]{}, false, 33, new String[][]{{"org.apache.commons.math.stat.descriptive.SummaryStatistics", "getGeometricMean", ""}}, 3);
  assertNotNull(actual);
  assertEquals("org.apache.commons.math.stat.descriptive.rank.Min", actual.getClass().getName());
  assertEquals("{getData=null, getN=0, getResult=NaN}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "SummaryStatistics:\nn: 0\nmin: NaN\nmax: NaN\nmean: NaN\ngeometric mean: NaN\nvariance: NaN\nsum of squares: 0.0\nstandard deviation: NaN\nsum of logs: 0.0\n {getGeometricMean=NaN, getMax=NaN, getMean=NaN, getM...#350#2146862523", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput068() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math.stat.descriptive.SummaryStatistics", "org.apache.commons.math.stat.descriptive.SummaryStatistics", "getMinImpl", new String[]{}, new String[]{}, false, 49, new String[][]{}, 3), new String[][]{{"getN", "", "3"}});
  assertNotNull(actual);
  assertEquals("java.lang.Long", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "SummaryStatistics:\nn: 0\nmin: NaN\nmax: NaN\nmean: NaN\ngeometric mean: NaN\nvariance: NaN\nsum of squares: 0.0\nstandard deviation: NaN\nsum of logs: 0.0\n {getGeometricMean=NaN, getMax=NaN, getMean=NaN, getM...#350#2146862523", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput069() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math.stat.descriptive.SummaryStatistics", "org.apache.commons.math.stat.descriptive.SummaryStatistics", "getMinImpl", new String[]{}, new String[]{}, false, 3, new String[][]{{"org.apache.commons.math.stat.descriptive.SummaryStatistics", "getSum", ""}, {"org.apache.commons.math.stat.descriptive.SummaryStatistics", "setMaxImpl", "org.apache.commons.math.stat.descriptive.StorelessUnivariateStatistic", "<sample:3>"}}, 3), new String[][]{{"getN", "", "3"}});
  assertNotNull(actual);
  assertEquals("java.lang.Long", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "SummaryStatistics:\nn: 0\nmin: NaN\nmax: 1.0\nmean: NaN\ngeometric mean: NaN\nvariance: NaN\nsum of squares: 0.0\nstandard deviation: NaN\nsum of logs: 0.0\n {getGeometricMean=NaN, getMax=1.0, getMean=NaN, getM...#350#-50555381", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput070() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.stat.descriptive.SummaryStatistics", "org.apache.commons.math.stat.descriptive.SummaryStatistics", "getMinImpl", new String[]{}, new String[]{}, false, 5, new String[][]{{"org.apache.commons.math.stat.descriptive.SummaryStatistics", "getSum", ""}, {"org.apache.commons.math.stat.descriptive.SummaryStatistics", "setMaxImpl", "org.apache.commons.math.stat.descriptive.StorelessUnivariateStatistic", "<sample:0>"}, {"org.apache.commons.math.stat.descriptive.SummaryStatistics", "getSumsq", ""}}, 3);
  assertNotNull(actual);
  assertEquals("org.apache.commons.math.stat.descriptive.rank.Min", actual.getClass().getName());
  assertEquals("{getData=null, getN=0, getResult=NaN}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "SummaryStatistics:\nn: 0\nmin: NaN\nmax: -Infinity\nmean: NaN\ngeometric mean: NaN\nvariance: NaN\nsum of squares: 0.0\nstandard deviation: NaN\nsum of logs: 0.0\n {getGeometricMean=NaN, getMax=-Infinity, getMe...#362#441961607", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput071() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.stat.descriptive.SummaryStatistics", "org.apache.commons.math.stat.descriptive.SummaryStatistics", "setMeanImpl", new String[]{"org.apache.commons.math.stat.descriptive.StorelessUnivariateStatistic"}, new String[]{"<sample:0>"}, false, 0, null, 1);
  assertNull(actual);
  assertEquals("receiver state after the call", "SummaryStatistics:\nn: 0\nmin: NaN\nmax: NaN\nmean: -Infinity\ngeometric mean: NaN\nvariance: NaN\nsum of squares: 0.0\nstandard deviation: NaN\nsum of logs: 0.0\n {getGeometricMean=NaN, getMax=NaN, getMean=-In...#362#-1687875013", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput072() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.stat.descriptive.SummaryStatistics", "org.apache.commons.math.stat.descriptive.SummaryStatistics", "getMean", new String[]{}, new String[]{}, false, 13, new String[][]{{"org.apache.commons.math.stat.descriptive.SummaryStatistics", "hashCode", ""}, {"org.apache.commons.math.stat.descriptive.SummaryStatistics", "getGeoMeanImpl", ""}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("NaN", String.valueOf(actual));
  assertEquals("receiver state after the call", "SummaryStatistics:\nn: 0\nmin: NaN\nmax: NaN\nmean: NaN\ngeometric mean: NaN\nvariance: NaN\nsum of squares: 0.0\nstandard deviation: NaN\nsum of logs: 0.0\n {getGeometricMean=NaN, getMax=NaN, getMean=NaN, getM...#350#2146862523", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput073() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.stat.descriptive.SummaryStatistics", "org.apache.commons.math.stat.descriptive.SummaryStatistics", "hashCode", new String[]{}, new String[]{}, false, 0, null, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("-1170640609", String.valueOf(actual));
  assertEquals("receiver state after the call", "SummaryStatistics:\nn: 0\nmin: NaN\nmax: NaN\nmean: NaN\ngeometric mean: NaN\nvariance: NaN\nsum of squares: 0.0\nstandard deviation: NaN\nsum of logs: 0.0\n {getGeometricMean=NaN, getMax=NaN, getMean=NaN, getM...#350#2146862523", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput074() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.stat.descriptive.SummaryStatistics", "org.apache.commons.math.stat.descriptive.SummaryStatistics", "hashCode", new String[]{}, new String[]{}, false, 17, new String[][]{{"org.apache.commons.math.stat.descriptive.SummaryStatistics", "setMinImpl", "org.apache.commons.math.stat.descriptive.StorelessUnivariateStatistic", "<sample:4>"}, {"org.apache.commons.math.stat.descriptive.SummaryStatistics", "getSumsq", ""}, {"org.apache.commons.math.stat.descriptive.SummaryStatistics", "getGeoMeanImpl", ""}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("-1170640609", String.valueOf(actual));
  assertEquals("receiver state after the call", "SummaryStatistics:\nn: 0\nmin: NaN\nmax: NaN\nmean: NaN\ngeometric mean: NaN\nvariance: NaN\nsum of squares: 0.0\nstandard deviation: NaN\nsum of logs: 0.0\n {getGeometricMean=NaN, getMax=NaN, getMean=NaN, getM...#350#2146862523", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput075() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.stat.descriptive.SummaryStatistics", "org.apache.commons.math.stat.descriptive.SummaryStatistics", "hashCode", new String[]{}, new String[]{}, false, 16, new String[][]{{"org.apache.commons.math.stat.descriptive.SummaryStatistics", "setMinImpl", "org.apache.commons.math.stat.descriptive.StorelessUnivariateStatistic", "<sample:4>"}, {"org.apache.commons.math.stat.descriptive.SummaryStatistics", "getSumsq", ""}, {"org.apache.commons.math.stat.descriptive.SummaryStatistics", "getGeoMeanImpl", ""}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("1953686201", String.valueOf(actual));
  assertEquals("receiver state after the call", "SummaryStatistics:\nn: 0\nmin: NaN\nmax: NaN\nmean: NaN\ngeometric mean: NaN\nvariance: NaN\nsum of squares: 0.0\nstandard deviation: NaN\nsum of logs: 0.0\n {getGeometricMean=NaN, getMax=NaN, getMean=NaN, getM...#350#2146862523", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput076() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.stat.descriptive.SummaryStatistics", "org.apache.commons.math.stat.descriptive.SummaryStatistics", "hashCode", new String[]{}, new String[]{}, false, 8, new String[][]{{"org.apache.commons.math.stat.descriptive.SummaryStatistics", "getSumsq", ""}, {"org.apache.commons.math.stat.descriptive.SummaryStatistics", "getGeoMeanImpl", ""}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("-1170640609", String.valueOf(actual));
  assertEquals("receiver state after the call", "SummaryStatistics:\nn: 0\nmin: NaN\nmax: NaN\nmean: NaN\ngeometric mean: NaN\nvariance: NaN\nsum of squares: 0.0\nstandard deviation: NaN\nsum of logs: 0.0\n {getGeometricMean=NaN, getMax=NaN, getMean=NaN, getM...#350#2146862523", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput077() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.stat.descriptive.SummaryStatistics", "org.apache.commons.math.stat.descriptive.SummaryStatistics", "hashCode", new String[]{}, new String[]{}, false, 14, new String[][]{{"org.apache.commons.math.stat.descriptive.SummaryStatistics", "getSumsq", ""}, {"org.apache.commons.math.stat.descriptive.SummaryStatistics", "getGeoMeanImpl", ""}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("1953686201", String.valueOf(actual));
  assertEquals("receiver state after the call", "SummaryStatistics:\nn: 0\nmin: NaN\nmax: NaN\nmean: NaN\ngeometric mean: NaN\nvariance: NaN\nsum of squares: 0.0\nstandard deviation: NaN\nsum of logs: 0.0\n {getGeometricMean=NaN, getMax=NaN, getMean=NaN, getM...#350#2146862523", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput078() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.stat.descriptive.SummaryStatistics", "org.apache.commons.math.stat.descriptive.SummaryStatistics", "getSumLogImpl", new String[]{}, new String[]{}, false, 14, new String[][]{{"org.apache.commons.math.stat.descriptive.SummaryStatistics", "getN", ""}, {"org.apache.commons.math.stat.descriptive.SummaryStatistics", "getVarianceImpl", ""}, {"org.apache.commons.math.stat.descriptive.SummaryStatistics", "setMaxImpl", "org.apache.commons.math.stat.descriptive.StorelessUnivariateStatistic", "<sample:5>"}}, 3);
  assertNotNull(actual);
  assertEquals("org.apache.commons.math.stat.descriptive.summary.SumOfLogs", actual.getClass().getName());
  assertEquals("{getData=null, getN=0, getResult=0.0}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "SummaryStatistics:\nn: 0\nmin: NaN\nmax: -Infinity\nmean: NaN\ngeometric mean: NaN\nvariance: NaN\nsum of squares: 0.0\nstandard deviation: NaN\nsum of logs: 0.0\n {getGeometricMean=NaN, getMax=-Infinity, getMe...#362#441961607", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput079() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.stat.descriptive.SummaryStatistics", "org.apache.commons.math.stat.descriptive.SummaryStatistics", "getMeanImpl", new String[]{}, new String[]{}, false, 0, null, 3);
  assertNotNull(actual);
  assertEquals("org.apache.commons.math.stat.descriptive.moment.Mean", actual.getClass().getName());
  assertEquals("{getData=null, getN=0, getResult=NaN}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "SummaryStatistics:\nn: 0\nmin: NaN\nmax: NaN\nmean: NaN\ngeometric mean: NaN\nvariance: NaN\nsum of squares: 0.0\nstandard deviation: NaN\nsum of logs: 0.0\n {getGeometricMean=NaN, getMax=NaN, getMean=NaN, getM...#350#2146862523", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput080() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math.stat.descriptive.SummaryStatistics", "org.apache.commons.math.stat.descriptive.SummaryStatistics", "getSumLogImpl", new String[]{}, new String[]{}, false, 17, new String[][]{{"org.apache.commons.math.stat.descriptive.SummaryStatistics", "getVarianceImpl", ""}, {"org.apache.commons.math.stat.descriptive.SummaryStatistics", "setMaxImpl", "org.apache.commons.math.stat.descriptive.StorelessUnivariateStatistic", "<sample:3>"}}, 3), new String[][]{{"copy", "", "3"}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.math.stat.descriptive.summary.SumOfLogs", actual.getClass().getName());
  assertEquals("{getData=null, getN=0, getResult=0.0}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "SummaryStatistics:\nn: 0\nmin: NaN\nmax: 1.0\nmean: NaN\ngeometric mean: NaN\nvariance: NaN\nsum of squares: 0.0\nstandard deviation: NaN\nsum of logs: 0.0\n {getGeometricMean=NaN, getMax=1.0, getMean=NaN, getM...#350#-50555381", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput081() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math.stat.descriptive.SummaryStatistics", "org.apache.commons.math.stat.descriptive.SummaryStatistics", "getSumLogImpl", new String[]{}, new String[]{}, false, 17, new String[][]{{"org.apache.commons.math.stat.descriptive.SummaryStatistics", "getVarianceImpl", ""}, {"org.apache.commons.math.stat.descriptive.SummaryStatistics", "setMaxImpl", "org.apache.commons.math.stat.descriptive.StorelessUnivariateStatistic", "<sample:1>"}}, 3), new String[][]{{"copy", "", "3"}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.math.stat.descriptive.summary.SumOfLogs", actual.getClass().getName());
  assertEquals("{getData=null, getN=0, getResult=0.0}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "SummaryStatistics:\nn: 0\nmin: NaN\nmax: -1.0\nmean: NaN\ngeometric mean: NaN\nvariance: NaN\nsum of squares: 0.0\nstandard deviation: NaN\nsum of logs: 0.0\n {getGeometricMean=NaN, getMax=-1.0, getMean=NaN, ge...#352#-1024419709", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput082() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.stat.descriptive.SummaryStatistics", "org.apache.commons.math.stat.descriptive.SummaryStatistics", "getSumLogImpl", new String[]{}, new String[]{}, false, 19, new String[][]{{"org.apache.commons.math.stat.descriptive.SummaryStatistics", "getVarianceImpl", ""}}, 3);
  assertNotNull(actual);
  assertEquals("org.apache.commons.math.stat.descriptive.summary.SumOfLogs", actual.getClass().getName());
  assertEquals("{getData=null, getN=0, getResult=0.0}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "SummaryStatistics:\nn: 0\nmin: NaN\nmax: NaN\nmean: NaN\ngeometric mean: NaN\nvariance: NaN\nsum of squares: 0.0\nstandard deviation: NaN\nsum of logs: 0.0\n {getGeometricMean=NaN, getMax=NaN, getMean=NaN, getM...#350#2146862523", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput083() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.stat.descriptive.SummaryStatistics", "org.apache.commons.math.stat.descriptive.SummaryStatistics", "getMax", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.math.stat.descriptive.SummaryStatistics", "getSummary", ""}, {"org.apache.commons.math.stat.descriptive.SummaryStatistics", "getGeoMeanImpl", ""}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("NaN", String.valueOf(actual));
  assertEquals("receiver state after the call", "SummaryStatistics:\nn: 0\nmin: NaN\nmax: NaN\nmean: NaN\ngeometric mean: NaN\nvariance: NaN\nsum of squares: 0.0\nstandard deviation: NaN\nsum of logs: 0.0\n {getGeometricMean=NaN, getMax=NaN, getMean=NaN, getM...#350#2146862523", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput084() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.stat.descriptive.SummaryStatistics", "org.apache.commons.math.stat.descriptive.SummaryStatistics", "getSecondMoment", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.math.stat.descriptive.SummaryStatistics", "setMaxImpl", "org.apache.commons.math.stat.descriptive.StorelessUnivariateStatistic", "<sample:2>"}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("NaN", String.valueOf(actual));
  assertEquals("receiver state after the call", "SummaryStatistics:\nn: 0\nmin: NaN\nmax: 0.0\nmean: NaN\ngeometric mean: NaN\nvariance: NaN\nsum of squares: 0.0\nstandard deviation: NaN\nsum of logs: 0.0\n {getGeometricMean=NaN, getMax=0.0, getMean=NaN, getM...#350#220768717", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput085() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math.stat.descriptive.SummaryStatistics", "org.apache.commons.math.stat.descriptive.SummaryStatistics", "getSummary", new String[]{}, new String[]{}, false, 13, new String[][]{{"org.apache.commons.math.stat.descriptive.SummaryStatistics", "clear", ""}}, 1), new String[][]{{"getSum", "", "0"}});
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("0.0", String.valueOf(actual));
  assertEquals("receiver state after the call", "SummaryStatistics:\nn: 0\nmin: NaN\nmax: NaN\nmean: NaN\ngeometric mean: NaN\nvariance: NaN\nsum of squares: 0.0\nstandard deviation: NaN\nsum of logs: 0.0\n {getGeometricMean=NaN, getMax=NaN, getMean=NaN, getM...#350#2146862523", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput086() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.stat.descriptive.SummaryStatistics", "org.apache.commons.math.stat.descriptive.SummaryStatistics", "getSummary", new String[]{}, new String[]{}, false, 15, new String[][]{{"org.apache.commons.math.stat.descriptive.SummaryStatistics", "clear", ""}}, 1);
  assertNotNull(actual);
  assertEquals("org.apache.commons.math.stat.descriptive.StatisticalSummaryValues", actual.getClass().getName());
  assertEquals("StatisticalSummaryValues:\nn: 0\nmin: NaN\nmax: NaN\nmean: NaN\nstd dev: NaN\nvariance: NaN\nsum: 0.0\n {getMax=NaN, getMean=NaN, getMin=NaN, getN=0, getStandardDeviation=NaN, getSum=0.0, getVariance=NaN}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "SummaryStatistics:\nn: 0\nmin: NaN\nmax: NaN\nmean: NaN\ngeometric mean: NaN\nvariance: NaN\nsum of squares: 0.0\nstandard deviation: NaN\nsum of logs: 0.0\n {getGeometricMean=NaN, getMax=NaN, getMean=NaN, getM...#350#2146862523", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput087() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math.stat.descriptive.SummaryStatistics", "org.apache.commons.math.stat.descriptive.SummaryStatistics", "getSummary", new String[]{}, new String[]{}, false, 15, new String[][]{{"org.apache.commons.math.stat.descriptive.SummaryStatistics", "clear", ""}}, 1), new String[][]{{"getVariance", "", "0"}});
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("NaN", String.valueOf(actual));
  assertEquals("receiver state after the call", "SummaryStatistics:\nn: 0\nmin: NaN\nmax: NaN\nmean: NaN\ngeometric mean: NaN\nvariance: NaN\nsum of squares: 0.0\nstandard deviation: NaN\nsum of logs: 0.0\n {getGeometricMean=NaN, getMax=NaN, getMean=NaN, getM...#350#2146862523", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput088() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.stat.descriptive.SummaryStatistics", "org.apache.commons.math.stat.descriptive.SummaryStatistics", "getSumOfLogs", new String[]{}, new String[]{}, false);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("0.0", String.valueOf(actual));
  assertEquals("receiver state after the call", "SummaryStatistics:\nn: 0\nmin: NaN\nmax: NaN\nmean: NaN\ngeometric mean: NaN\nvariance: NaN\nsum of squares: 0.0\nstandard deviation: NaN\nsum of logs: 0.0\n {getGeometricMean=NaN, getMax=NaN, getMean=NaN, getM...#350#2146862523", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput089() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.stat.descriptive.SummaryStatistics", "org.apache.commons.math.stat.descriptive.SummaryStatistics", "getSumOfLogs", new String[]{}, new String[]{}, false, 1, new String[][]{});
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("0.0", String.valueOf(actual));
  assertEquals("receiver state after the call", "SummaryStatistics:\nn: 0\nmin: NaN\nmax: NaN\nmean: NaN\ngeometric mean: NaN\nvariance: NaN\nsum of squares: 0.0\nstandard deviation: NaN\nsum of logs: 0.0\n {getGeometricMean=NaN, getMax=NaN, getMean=NaN, getM...#350#2146862523", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput090() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.stat.descriptive.SummaryStatistics", "org.apache.commons.math.stat.descriptive.SummaryStatistics", "getPopulationVariance", new String[]{}, new String[]{}, false);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("NaN", String.valueOf(actual));
  assertEquals("receiver state after the call", "SummaryStatistics:\nn: 0\nmin: NaN\nmax: NaN\nmean: NaN\ngeometric mean: NaN\nvariance: NaN\nsum of squares: 0.0\nstandard deviation: NaN\nsum of logs: 0.0\n {getGeometricMean=NaN, getMax=NaN, getMean=NaN, getM...#350#2146862523", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput091() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.stat.descriptive.SummaryStatistics", "org.apache.commons.math.stat.descriptive.SummaryStatistics", "getSumOfLogs", new String[]{}, new String[]{}, false, 14, new String[][]{{"org.apache.commons.math.stat.descriptive.SummaryStatistics", "clear", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("0.0", String.valueOf(actual));
  assertEquals("receiver state after the call", "SummaryStatistics:\nn: 0\nmin: NaN\nmax: NaN\nmean: NaN\ngeometric mean: NaN\nvariance: NaN\nsum of squares: 0.0\nstandard deviation: NaN\nsum of logs: 0.0\n {getGeometricMean=NaN, getMax=NaN, getMean=NaN, getM...#350#2146862523", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput092() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.stat.descriptive.SummaryStatistics", "org.apache.commons.math.stat.descriptive.SummaryStatistics", "getMaxImpl", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.math.stat.descriptive.SummaryStatistics", "getSum", ""}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.math.stat.descriptive.rank.Max", actual.getClass().getName());
  assertEquals("{getData=null, getN=0, getResult=NaN}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "SummaryStatistics:\nn: 0\nmin: NaN\nmax: NaN\nmean: NaN\ngeometric mean: NaN\nvariance: NaN\nsum of squares: 0.0\nstandard deviation: NaN\nsum of logs: 0.0\n {getGeometricMean=NaN, getMax=NaN, getMean=NaN, getM...#350#2146862523", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput093() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.stat.descriptive.SummaryStatistics", "org.apache.commons.math.stat.descriptive.SummaryStatistics", "getSumOfLogs", new String[]{}, new String[]{}, false, 16, new String[][]{{"org.apache.commons.math.stat.descriptive.SummaryStatistics", "clear", ""}, {"org.apache.commons.math.stat.descriptive.SummaryStatistics", "getMeanImpl", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("0.0", String.valueOf(actual));
  assertEquals("receiver state after the call", "SummaryStatistics:\nn: 0\nmin: NaN\nmax: NaN\nmean: NaN\ngeometric mean: NaN\nvariance: NaN\nsum of squares: 0.0\nstandard deviation: NaN\nsum of logs: 0.0\n {getGeometricMean=NaN, getMax=NaN, getMean=NaN, getM...#350#2146862523", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput094() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.stat.descriptive.SummaryStatistics", "org.apache.commons.math.stat.descriptive.SummaryStatistics", "getSumImpl", new String[]{}, new String[]{}, false);
  assertNotNull(actual);
  assertEquals("org.apache.commons.math.stat.descriptive.summary.Sum", actual.getClass().getName());
  assertEquals("{getData=null, getN=0, getResult=0.0}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "SummaryStatistics:\nn: 0\nmin: NaN\nmax: NaN\nmean: NaN\ngeometric mean: NaN\nvariance: NaN\nsum of squares: 0.0\nstandard deviation: NaN\nsum of logs: 0.0\n {getGeometricMean=NaN, getMax=NaN, getMean=NaN, getM...#350#2146862523", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput095() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.stat.descriptive.SummaryStatistics", "org.apache.commons.math.stat.descriptive.SummaryStatistics", "getSum", new String[]{}, new String[]{}, false);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("0.0", String.valueOf(actual));
  assertEquals("receiver state after the call", "SummaryStatistics:\nn: 0\nmin: NaN\nmax: NaN\nmean: NaN\ngeometric mean: NaN\nvariance: NaN\nsum of squares: 0.0\nstandard deviation: NaN\nsum of logs: 0.0\n {getGeometricMean=NaN, getMax=NaN, getMean=NaN, getM...#350#2146862523", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput096() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.stat.descriptive.SummaryStatistics", "org.apache.commons.math.stat.descriptive.SummaryStatistics", "setMaxImpl", new String[]{"org.apache.commons.math.stat.descriptive.StorelessUnivariateStatistic"}, new String[]{"<sample:7>"}, false);
  assertNull(actual);
  assertEquals("receiver state after the call", "SummaryStatistics:\nn: 0\nmin: NaN\nmax: 0.0\nmean: NaN\ngeometric mean: NaN\nvariance: NaN\nsum of squares: 0.0\nstandard deviation: NaN\nsum of logs: 0.0\n {getGeometricMean=NaN, getMax=0.0, getMean=NaN, getM...#350#220768717", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput097() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.stat.descriptive.SummaryStatistics", "org.apache.commons.math.stat.descriptive.SummaryStatistics", "setMaxImpl", new String[]{"org.apache.commons.math.stat.descriptive.StorelessUnivariateStatistic"}, new String[]{"<sample:10>"}, false, 15, new String[][]{});
  assertNull(actual);
  assertEquals("receiver state after the call", "SummaryStatistics:\nn: 0\nmin: NaN\nmax: NaN\nmean: NaN\ngeometric mean: NaN\nvariance: NaN\nsum of squares: 0.0\nstandard deviation: NaN\nsum of logs: 0.0\n {getGeometricMean=NaN, getMax=NaN, getMean=NaN, getM...#350#2146862523", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput098() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.stat.descriptive.SummaryStatistics", "org.apache.commons.math.stat.descriptive.SummaryStatistics", "setMaxImpl", new String[]{"org.apache.commons.math.stat.descriptive.StorelessUnivariateStatistic"}, new String[]{"<sample:5>"}, false, 0, new String[][]{{"org.apache.commons.math.stat.descriptive.SummaryStatistics", "setGeoMeanImpl", "org.apache.commons.math.stat.descriptive.StorelessUnivariateStatistic", "<sample:0>"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "SummaryStatistics:\nn: 0\nmin: NaN\nmax: -Infinity\nmean: NaN\ngeometric mean: -Infinity\nvariance: NaN\nsum of squares: 0.0\nstandard deviation: NaN\nsum of logs: 0.0\n {getGeometricMean=-Infinity, getMax=-Inf...#374#862860435", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput099() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.stat.descriptive.SummaryStatistics", "org.apache.commons.math.stat.descriptive.SummaryStatistics", "setMaxImpl", new String[]{"org.apache.commons.math.stat.descriptive.StorelessUnivariateStatistic"}, new String[]{"<sample:5>"}, false, 15, new String[][]{{"org.apache.commons.math.stat.descriptive.SummaryStatistics", "getGeoMeanImpl", ""}});
  assertNull(actual);
  assertEquals("receiver state after the call", "SummaryStatistics:\nn: 0\nmin: NaN\nmax: -Infinity\nmean: NaN\ngeometric mean: NaN\nvariance: NaN\nsum of squares: 0.0\nstandard deviation: NaN\nsum of logs: 0.0\n {getGeometricMean=NaN, getMax=-Infinity, getMe...#362#441961607", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput100() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.stat.descriptive.SummaryStatistics", "org.apache.commons.math.stat.descriptive.SummaryStatistics", "setMaxImpl", new String[]{"org.apache.commons.math.stat.descriptive.StorelessUnivariateStatistic"}, new String[]{"<sample:9>"}, false, 5, new String[][]{{"org.apache.commons.math.stat.descriptive.SummaryStatistics", "getN", ""}, {"org.apache.commons.math.stat.descriptive.SummaryStatistics", "getSum", ""}});
  assertNull(actual);
  assertEquals("receiver state after the call", "SummaryStatistics:\nn: 0\nmin: NaN\nmax: Infinity\nmean: NaN\ngeometric mean: NaN\nvariance: NaN\nsum of squares: 0.0\nstandard deviation: NaN\nsum of logs: 0.0\n {getGeometricMean=NaN, getMax=Infinity, getMean...#360#-1009688381", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput101() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.stat.descriptive.SummaryStatistics", "org.apache.commons.math.stat.descriptive.SummaryStatistics", "setMaxImpl", new String[]{"org.apache.commons.math.stat.descriptive.StorelessUnivariateStatistic"}, new String[]{"<sample:3>"}, false, 12, new String[][]{{"org.apache.commons.math.stat.descriptive.SummaryStatistics", "getSum", ""}});
  assertNull(actual);
  assertEquals("receiver state after the call", "SummaryStatistics:\nn: 0\nmin: NaN\nmax: 1.0\nmean: NaN\ngeometric mean: NaN\nvariance: NaN\nsum of squares: 0.0\nstandard deviation: NaN\nsum of logs: 0.0\n {getGeometricMean=NaN, getMax=1.0, getMean=NaN, getM...#350#-50555381", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput102() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.stat.descriptive.SummaryStatistics", "org.apache.commons.math.stat.descriptive.SummaryStatistics", "getSumLogImpl", new String[]{}, new String[]{}, false);
  assertNotNull(actual);
  assertEquals("org.apache.commons.math.stat.descriptive.summary.SumOfLogs", actual.getClass().getName());
  assertEquals("{getData=null, getN=0, getResult=0.0}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "SummaryStatistics:\nn: 0\nmin: NaN\nmax: NaN\nmean: NaN\ngeometric mean: NaN\nvariance: NaN\nsum of squares: 0.0\nstandard deviation: NaN\nsum of logs: 0.0\n {getGeometricMean=NaN, getMax=NaN, getMean=NaN, getM...#350#2146862523", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput103() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.stat.descriptive.SummaryStatistics", "org.apache.commons.math.stat.descriptive.SummaryStatistics", "copy", new String[]{}, new String[]{}, false, 2, new String[][]{{"org.apache.commons.math.stat.descriptive.SummaryStatistics", "getMeanImpl", ""}, {"org.apache.commons.math.stat.descriptive.SummaryStatistics", "getMax", ""}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.math.stat.descriptive.SummaryStatistics", actual.getClass().getName());
  assertEquals("SummaryStatistics:\nn: 0\nmin: NaN\nmax: NaN\nmean: NaN\ngeometric mean: NaN\nvariance: NaN\nsum of squares: 0.0\nstandard deviation: NaN\nsum of logs: 0.0\n {getGeometricMean=NaN, getMax=NaN, getMean=NaN, getM...#350#2146862523", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "SummaryStatistics:\nn: 0\nmin: NaN\nmax: NaN\nmean: NaN\ngeometric mean: NaN\nvariance: NaN\nsum of squares: 0.0\nstandard deviation: NaN\nsum of logs: 0.0\n {getGeometricMean=NaN, getMax=NaN, getMean=NaN, getM...#350#2146862523", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput104() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.stat.descriptive.SummaryStatistics", "org.apache.commons.math.stat.descriptive.SummaryStatistics", "copy", new String[]{}, new String[]{}, false, 13, new String[][]{{"org.apache.commons.math.stat.descriptive.SummaryStatistics", "getMeanImpl", ""}, {"org.apache.commons.math.stat.descriptive.SummaryStatistics", "getMax", ""}, {"org.apache.commons.math.stat.descriptive.SummaryStatistics", "equals", "java.lang.Object", "<sample:1>"}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.math.stat.descriptive.SummaryStatistics", actual.getClass().getName());
  assertEquals("SummaryStatistics:\nn: 0\nmin: NaN\nmax: NaN\nmean: NaN\ngeometric mean: NaN\nvariance: NaN\nsum of squares: 0.0\nstandard deviation: NaN\nsum of logs: 0.0\n {getGeometricMean=NaN, getMax=NaN, getMean=NaN, getM...#350#2146862523", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "SummaryStatistics:\nn: 0\nmin: NaN\nmax: NaN\nmean: NaN\ngeometric mean: NaN\nvariance: NaN\nsum of squares: 0.0\nstandard deviation: NaN\nsum of logs: 0.0\n {getGeometricMean=NaN, getMax=NaN, getMean=NaN, getM...#350#2146862523", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput105() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math.stat.descriptive.SummaryStatistics", "org.apache.commons.math.stat.descriptive.SummaryStatistics", "copy", new String[]{}, new String[]{}, false, 13, new String[][]{{"org.apache.commons.math.stat.descriptive.SummaryStatistics", "getMax", ""}, {"org.apache.commons.math.stat.descriptive.SummaryStatistics", "equals", "java.lang.Object", "<sample:1>"}}), new String[][]{{"getStandardDeviation", "", "4"}});
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("NaN", String.valueOf(actual));
  assertEquals("receiver state after the call", "SummaryStatistics:\nn: 0\nmin: NaN\nmax: NaN\nmean: NaN\ngeometric mean: NaN\nvariance: NaN\nsum of squares: 0.0\nstandard deviation: NaN\nsum of logs: 0.0\n {getGeometricMean=NaN, getMax=NaN, getMean=NaN, getM...#350#2146862523", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput106() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.stat.descriptive.SummaryStatistics", "org.apache.commons.math.stat.descriptive.SummaryStatistics", "setGeoMeanImpl", new String[]{"org.apache.commons.math.stat.descriptive.StorelessUnivariateStatistic"}, new String[]{"<sample:5>"}, false);
  assertNull(actual);
  assertEquals("receiver state after the call", "SummaryStatistics:\nn: 0\nmin: NaN\nmax: NaN\nmean: NaN\ngeometric mean: -Infinity\nvariance: NaN\nsum of squares: 0.0\nstandard deviation: NaN\nsum of logs: 0.0\n {getGeometricMean=-Infinity, getMax=NaN, getMe...#362#722874311", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput107() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.stat.descriptive.SummaryStatistics", "org.apache.commons.math.stat.descriptive.SummaryStatistics", "getMaxImpl", new String[]{}, new String[]{}, false, 1, new String[][]{{"org.apache.commons.math.stat.descriptive.SummaryStatistics", "setVarianceImpl", "org.apache.commons.math.stat.descriptive.StorelessUnivariateStatistic", "<sample:4>"}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.math.stat.descriptive.rank.Max", actual.getClass().getName());
  assertEquals("{getData=null, getN=0, getResult=NaN}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "SummaryStatistics:\nn: 0\nmin: NaN\nmax: NaN\nmean: NaN\ngeometric mean: NaN\nvariance: NaN\nsum of squares: 0.0\nstandard deviation: NaN\nsum of logs: 0.0\n {getGeometricMean=NaN, getMax=NaN, getMean=NaN, getM...#350#2146862523", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput108() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.stat.descriptive.SummaryStatistics", "org.apache.commons.math.stat.descriptive.SummaryStatistics", "getSumsqImpl", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.math.stat.descriptive.SummaryStatistics", "getStandardDeviation", ""}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.math.stat.descriptive.summary.SumOfSquares", actual.getClass().getName());
  assertEquals("{getData=null, getN=0, getResult=0.0}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "SummaryStatistics:\nn: 0\nmin: NaN\nmax: NaN\nmean: NaN\ngeometric mean: NaN\nvariance: NaN\nsum of squares: 0.0\nstandard deviation: NaN\nsum of logs: 0.0\n {getGeometricMean=NaN, getMax=NaN, getMean=NaN, getM...#350#2146862523", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput109() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.stat.descriptive.SummaryStatistics", "org.apache.commons.math.stat.descriptive.SummaryStatistics", "getMaxImpl", new String[]{}, new String[]{}, false, 7, new String[][]{{"org.apache.commons.math.stat.descriptive.SummaryStatistics", "setVarianceImpl", "org.apache.commons.math.stat.descriptive.StorelessUnivariateStatistic", "<sample:4>"}, {"org.apache.commons.math.stat.descriptive.SummaryStatistics", "getSum", ""}, {"org.apache.commons.math.stat.descriptive.SummaryStatistics", "getMinImpl", ""}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.math.stat.descriptive.rank.Max", actual.getClass().getName());
  assertEquals("{getData=null, getN=0, getResult=NaN}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "SummaryStatistics:\nn: 0\nmin: NaN\nmax: NaN\nmean: NaN\ngeometric mean: NaN\nvariance: NaN\nsum of squares: 0.0\nstandard deviation: NaN\nsum of logs: 0.0\n {getGeometricMean=NaN, getMax=NaN, getMean=NaN, getM...#350#2146862523", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput110() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math.stat.descriptive.SummaryStatistics", "org.apache.commons.math.stat.descriptive.SummaryStatistics", "getMaxImpl", new String[]{}, new String[]{}, false, 6, new String[][]{{"org.apache.commons.math.stat.descriptive.SummaryStatistics", "setVarianceImpl", "org.apache.commons.math.stat.descriptive.StorelessUnivariateStatistic", "<sample:7>"}, {"org.apache.commons.math.stat.descriptive.SummaryStatistics", "getMinImpl", ""}}), new String[][]{{"clear", "", "2"}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.math.stat.descriptive.rank.Max", actual.getClass().getName());
  assertEquals("{getData=null, getN=0, getResult=NaN}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "SummaryStatistics:\nn: 0\nmin: NaN\nmax: NaN\nmean: NaN\ngeometric mean: NaN\nvariance: 0.0\nsum of squares: 0.0\nstandard deviation: NaN\nsum of logs: 0.0\n {getGeometricMean=NaN, getMax=NaN, getMean=NaN, getM...#350#-507461555", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput111() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math.stat.descriptive.SummaryStatistics", "org.apache.commons.math.stat.descriptive.SummaryStatistics", "getMaxImpl", new String[]{}, new String[]{}, false, 9, new String[][]{{"org.apache.commons.math.stat.descriptive.SummaryStatistics", "setVarianceImpl", "org.apache.commons.math.stat.descriptive.StorelessUnivariateStatistic", "<sample:2>"}, {"org.apache.commons.math.stat.descriptive.SummaryStatistics", "getMax", ""}, {"org.apache.commons.math.stat.descriptive.SummaryStatistics", "setSumLogImpl", "org.apache.commons.math.stat.descriptive.StorelessUnivariateStatistic", "<sample:5>"}}), new String[][]{{"clear", "", "2"}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.math.stat.descriptive.rank.Max", actual.getClass().getName());
  assertEquals("{getData=null, getN=0, getResult=NaN}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "SummaryStatistics:\nn: 0\nmin: NaN\nmax: NaN\nmean: NaN\ngeometric mean: 0.0\nvariance: 0.0\nsum of squares: 0.0\nstandard deviation: NaN\nsum of logs: -Infinity\n {getGeometricMean=0.0, getMax=NaN, getMean=NaN...#362#455383781", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput112() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math.stat.descriptive.SummaryStatistics", "org.apache.commons.math.stat.descriptive.SummaryStatistics", "getMaxImpl", new String[]{}, new String[]{}, false, 11, new String[][]{{"org.apache.commons.math.stat.descriptive.SummaryStatistics", "setVarianceImpl", "org.apache.commons.math.stat.descriptive.StorelessUnivariateStatistic", "<sample:0>"}, {"org.apache.commons.math.stat.descriptive.SummaryStatistics", "setSumLogImpl", "org.apache.commons.math.stat.descriptive.StorelessUnivariateStatistic", "<sample:5>"}}), new String[][]{{"clear", "", "2"}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.math.stat.descriptive.rank.Max", actual.getClass().getName());
  assertEquals("{getData=null, getN=0, getResult=NaN}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "SummaryStatistics:\nn: 0\nmin: NaN\nmax: NaN\nmean: NaN\ngeometric mean: 0.0\nvariance: -Infinity\nsum of squares: 0.0\nstandard deviation: NaN\nsum of logs: -Infinity\n {getGeometricMean=0.0, getMax=NaN, getMe...#374#188597087", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput113() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.stat.descriptive.SummaryStatistics", "org.apache.commons.math.stat.descriptive.SummaryStatistics", "getMinImpl", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.math.stat.descriptive.SummaryStatistics", "copy", ""}, {"org.apache.commons.math.stat.descriptive.SummaryStatistics", "getMax", ""}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.math.stat.descriptive.rank.Min", actual.getClass().getName());
  assertEquals("{getData=null, getN=0, getResult=NaN}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "SummaryStatistics:\nn: 0\nmin: NaN\nmax: NaN\nmean: NaN\ngeometric mean: NaN\nvariance: NaN\nsum of squares: 0.0\nstandard deviation: NaN\nsum of logs: 0.0\n {getGeometricMean=NaN, getMax=NaN, getMean=NaN, getM...#350#2146862523", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput114() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math.stat.descriptive.SummaryStatistics", "org.apache.commons.math.stat.descriptive.SummaryStatistics", "getMinImpl", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.math.stat.descriptive.SummaryStatistics", "copy", ""}, {"org.apache.commons.math.stat.descriptive.SummaryStatistics", "getMax", ""}}), new String[][]{{"setData", "double[]", "7"}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.math.stat.descriptive.rank.Min", actual.getClass().getName());
  assertEquals("{getData=[1.0, Infinity], getN=0, getResult=NaN}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "SummaryStatistics:\nn: 0\nmin: NaN\nmax: NaN\nmean: NaN\ngeometric mean: NaN\nvariance: NaN\nsum of squares: 0.0\nstandard deviation: NaN\nsum of logs: 0.0\n {getGeometricMean=NaN, getMax=NaN, getMean=NaN, getM...#350#2146862523", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput115() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.stat.descriptive.SummaryStatistics", "org.apache.commons.math.stat.descriptive.SummaryStatistics", "getN", new String[]{}, new String[]{}, false);
  assertNotNull(actual);
  assertEquals("java.lang.Long", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "SummaryStatistics:\nn: 0\nmin: NaN\nmax: NaN\nmean: NaN\ngeometric mean: NaN\nvariance: NaN\nsum of squares: 0.0\nstandard deviation: NaN\nsum of logs: 0.0\n {getGeometricMean=NaN, getMax=NaN, getMean=NaN, getM...#350#2146862523", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput116() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.stat.descriptive.SummaryStatistics", "org.apache.commons.math.stat.descriptive.SummaryStatistics", "setMinImpl", new String[]{"org.apache.commons.math.stat.descriptive.StorelessUnivariateStatistic"}, new String[]{"<sample:2>"}, false, 0, new String[][]{{"org.apache.commons.math.stat.descriptive.SummaryStatistics", "getSecondMoment", ""}});
  assertNull(actual);
  assertEquals("receiver state after the call", "SummaryStatistics:\nn: 0\nmin: 0.0\nmax: NaN\nmean: NaN\ngeometric mean: NaN\nvariance: NaN\nsum of squares: 0.0\nstandard deviation: NaN\nsum of logs: 0.0\n {getGeometricMean=NaN, getMax=NaN, getMean=NaN, getM...#350#-1067426903", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput117() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.stat.descriptive.SummaryStatistics", "org.apache.commons.math.stat.descriptive.SummaryStatistics", "getPopulationVariance", new String[]{}, new String[]{}, false, 18, new String[][]{{"org.apache.commons.math.stat.descriptive.SummaryStatistics", "addValue", "double", "NaN"}, {"org.apache.commons.math.stat.descriptive.SummaryStatistics", "getMean", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("0.0", String.valueOf(actual));
  assertEquals("receiver state after the call", "SummaryStatistics:\nn: 1\nmin: NaN\nmax: NaN\nmean: NaN\ngeometric mean: NaN\nvariance: 0.0\nsum of squares: NaN\nstandard deviation: 0.0\nsum of logs: NaN\n {getGeometricMean=NaN, getMax=NaN, getMean=NaN, getM...#350#-742111247", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput118() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.stat.descriptive.SummaryStatistics", "org.apache.commons.math.stat.descriptive.SummaryStatistics", "getPopulationVariance", new String[]{}, new String[]{}, false, 21, new String[][]{{"org.apache.commons.math.stat.descriptive.SummaryStatistics", "addValue", "double", "-1.7976931348623157E308"}, {"org.apache.commons.math.stat.descriptive.SummaryStatistics", "getMean", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("0.0", String.valueOf(actual));
  assertEquals("receiver state after the call", "SummaryStatistics:\nn: 1\nmin: -1.7976931348623157E308\nmax: -1.7976931348623157E308\nmean: -1.7976931348623157E308\ngeometric mean: NaN\nvariance: 0.0\nsum of squares: Infinity\nstandard deviation: 0.0\nsum o...#500#705366924", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput119() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.stat.descriptive.SummaryStatistics", "org.apache.commons.math.stat.descriptive.SummaryStatistics", "getPopulationVariance", new String[]{}, new String[]{}, false, 20, new String[][]{{"org.apache.commons.math.stat.descriptive.SummaryStatistics", "addValue", "double", "-8.988465674311579E307"}, {"org.apache.commons.math.stat.descriptive.SummaryStatistics", "getMean", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("0.0", String.valueOf(actual));
  assertEquals("receiver state after the call", "SummaryStatistics:\nn: 1\nmin: -8.988465674311579E307\nmax: -8.988465674311579E307\nmean: -8.988465674311579E307\ngeometric mean: NaN\nvariance: 0.0\nsum of squares: Infinity\nstandard deviation: 0.0\nsum of l...#493#-1664168008", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput120() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.stat.descriptive.SummaryStatistics", "org.apache.commons.math.stat.descriptive.SummaryStatistics", "getMax", new String[]{}, new String[]{}, false);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("NaN", String.valueOf(actual));
  assertEquals("receiver state after the call", "SummaryStatistics:\nn: 0\nmin: NaN\nmax: NaN\nmean: NaN\ngeometric mean: NaN\nvariance: NaN\nsum of squares: 0.0\nstandard deviation: NaN\nsum of logs: 0.0\n {getGeometricMean=NaN, getMax=NaN, getMean=NaN, getM...#350#2146862523", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput121() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.stat.descriptive.SummaryStatistics", "org.apache.commons.math.stat.descriptive.SummaryStatistics", "clear", new String[]{}, new String[]{}, false);
  assertNull(actual);
  assertEquals("receiver state after the call", "SummaryStatistics:\nn: 0\nmin: NaN\nmax: NaN\nmean: NaN\ngeometric mean: NaN\nvariance: NaN\nsum of squares: 0.0\nstandard deviation: NaN\nsum of logs: 0.0\n {getGeometricMean=NaN, getMax=NaN, getMean=NaN, getM...#350#2146862523", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput122() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.stat.descriptive.SummaryStatistics", "org.apache.commons.math.stat.descriptive.SummaryStatistics", "getPopulationVariance", new String[]{}, new String[]{}, false, 33, new String[][]{{"org.apache.commons.math.stat.descriptive.SummaryStatistics", "addValue", "double", "1.7976931348623157E308"}, {"org.apache.commons.math.stat.descriptive.SummaryStatistics", "getStandardDeviation", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("0.0", String.valueOf(actual));
  assertEquals("receiver state after the call", "SummaryStatistics:\nn: 1\nmin: 1.7976931348623157E308\nmax: 1.7976931348623157E308\nmean: 1.7976931348623157E308\ngeometric mean: 1.7976931348622732E308\nvariance: 0.0\nsum of squares: Infinity\nstandard devi...#557#-1852587093", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput123() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.stat.descriptive.SummaryStatistics", "org.apache.commons.math.stat.descriptive.SummaryStatistics", "getGeometricMean", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.math.stat.descriptive.SummaryStatistics", "getSumsqImpl", ""}, {"org.apache.commons.math.stat.descriptive.SummaryStatistics", "getGeoMeanImpl", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("NaN", String.valueOf(actual));
  assertEquals("receiver state after the call", "SummaryStatistics:\nn: 0\nmin: NaN\nmax: NaN\nmean: NaN\ngeometric mean: NaN\nvariance: NaN\nsum of squares: 0.0\nstandard deviation: NaN\nsum of logs: 0.0\n {getGeometricMean=NaN, getMax=NaN, getMean=NaN, getM...#350#2146862523", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput124() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.stat.descriptive.SummaryStatistics", "org.apache.commons.math.stat.descriptive.SummaryStatistics", "setMeanImpl", new String[]{"org.apache.commons.math.stat.descriptive.StorelessUnivariateStatistic"}, new String[]{"<sample:6>"}, false, 2, new String[][]{{"org.apache.commons.math.stat.descriptive.SummaryStatistics", "setSumImpl", "org.apache.commons.math.stat.descriptive.StorelessUnivariateStatistic", "<sample:6>"}, {"org.apache.commons.math.stat.descriptive.SummaryStatistics", "getN", ""}});
  assertNull(actual);
  assertEquals("receiver state after the call", "SummaryStatistics:\nn: 0\nmin: NaN\nmax: NaN\nmean: NaN\ngeometric mean: NaN\nvariance: NaN\nsum of squares: 0.0\nstandard deviation: NaN\nsum of logs: 0.0\n {getGeometricMean=NaN, getMax=NaN, getMean=NaN, getM...#350#424382564", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput125() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.stat.descriptive.SummaryStatistics", "org.apache.commons.math.stat.descriptive.SummaryStatistics", "setVarianceImpl", new String[]{"org.apache.commons.math.stat.descriptive.StorelessUnivariateStatistic"}, new String[]{"<null>"}, false, 0, new String[][]{{"org.apache.commons.math.stat.descriptive.SummaryStatistics", "clear", ""}});
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput126() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.stat.descriptive.SummaryStatistics", "org.apache.commons.math.stat.descriptive.SummaryStatistics", "setVarianceImpl", new String[]{"org.apache.commons.math.stat.descriptive.StorelessUnivariateStatistic"}, new String[]{"<sample:3>"}, false, 0, new String[][]{{"org.apache.commons.math.stat.descriptive.SummaryStatistics", "clear", ""}, {"org.apache.commons.math.stat.descriptive.SummaryStatistics", "setSumLogImpl", "org.apache.commons.math.stat.descriptive.StorelessUnivariateStatistic", "<sample:4>"}, {"org.apache.commons.math.stat.descriptive.SummaryStatistics", "getSecondMoment", ""}});
  assertNull(actual);
  assertEquals("receiver state after the call", "SummaryStatistics:\nn: 0\nmin: NaN\nmax: NaN\nmean: NaN\ngeometric mean: NaN\nvariance: 1.0\nsum of squares: 0.0\nstandard deviation: NaN\nsum of logs: NaN\n {getGeometricMean=NaN, getMax=NaN, getMean=NaN, getM...#350#-1668508067", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput127() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.stat.descriptive.SummaryStatistics", "org.apache.commons.math.stat.descriptive.SummaryStatistics", "setVarianceImpl", new String[]{"org.apache.commons.math.stat.descriptive.StorelessUnivariateStatistic"}, new String[]{"<sample:4>"}, false, 0, new String[][]{{"org.apache.commons.math.stat.descriptive.SummaryStatistics", "clear", ""}, {"org.apache.commons.math.stat.descriptive.SummaryStatistics", "setSumLogImpl", "org.apache.commons.math.stat.descriptive.StorelessUnivariateStatistic", "<sample:4>"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "SummaryStatistics:\nn: 0\nmin: NaN\nmax: NaN\nmean: NaN\ngeometric mean: NaN\nvariance: NaN\nsum of squares: 0.0\nstandard deviation: NaN\nsum of logs: NaN\n {getGeometricMean=NaN, getMax=NaN, getMean=NaN, getM...#350#-352706035", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput128() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.stat.descriptive.SummaryStatistics", "org.apache.commons.math.stat.descriptive.SummaryStatistics", "setVarianceImpl", new String[]{"org.apache.commons.math.stat.descriptive.StorelessUnivariateStatistic"}, new String[]{"<sample:1>"}, false, 0, new String[][]{{"org.apache.commons.math.stat.descriptive.SummaryStatistics", "clear", ""}, {"org.apache.commons.math.stat.descriptive.SummaryStatistics", "setSumLogImpl", "org.apache.commons.math.stat.descriptive.StorelessUnivariateStatistic", "<sample:4>"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "SummaryStatistics:\nn: 0\nmin: NaN\nmax: NaN\nmean: NaN\ngeometric mean: NaN\nvariance: -1.0\nsum of squares: 0.0\nstandard deviation: NaN\nsum of logs: NaN\n {getGeometricMean=NaN, getMax=NaN, getMean=NaN, get...#352#1258351993", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput129() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.stat.descriptive.SummaryStatistics", "org.apache.commons.math.stat.descriptive.SummaryStatistics", "setVarianceImpl", new String[]{"org.apache.commons.math.stat.descriptive.StorelessUnivariateStatistic"}, new String[]{"<sample:7>"}, false, 0, new String[][]{{"org.apache.commons.math.stat.descriptive.SummaryStatistics", "clear", ""}, {"org.apache.commons.math.stat.descriptive.SummaryStatistics", "setSumLogImpl", "org.apache.commons.math.stat.descriptive.StorelessUnivariateStatistic", "<sample:4>"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "SummaryStatistics:\nn: 0\nmin: NaN\nmax: NaN\nmean: NaN\ngeometric mean: NaN\nvariance: 0.0\nsum of squares: 0.0\nstandard deviation: NaN\nsum of logs: NaN\n {getGeometricMean=NaN, getMax=NaN, getMean=NaN, getM...#350#1287937183", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput130() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.stat.descriptive.SummaryStatistics", "org.apache.commons.math.stat.descriptive.SummaryStatistics", "getVarianceImpl", new String[]{}, new String[]{}, false);
  assertNotNull(actual);
  assertEquals("org.apache.commons.math.stat.descriptive.moment.Variance", actual.getClass().getName());
  assertEquals("{getData=null, getN=0, getResult=NaN, isBiasCorrected=true}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "SummaryStatistics:\nn: 0\nmin: NaN\nmax: NaN\nmean: NaN\ngeometric mean: NaN\nvariance: NaN\nsum of squares: 0.0\nstandard deviation: NaN\nsum of logs: 0.0\n {getGeometricMean=NaN, getMax=NaN, getMean=NaN, getM...#350#2146862523", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput131() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.stat.descriptive.SummaryStatistics", "org.apache.commons.math.stat.descriptive.SummaryStatistics", "hashCode", new String[]{}, new String[]{}, false);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("-1170640609", String.valueOf(actual));
  assertEquals("receiver state after the call", "SummaryStatistics:\nn: 0\nmin: NaN\nmax: NaN\nmean: NaN\ngeometric mean: NaN\nvariance: NaN\nsum of squares: 0.0\nstandard deviation: NaN\nsum of logs: 0.0\n {getGeometricMean=NaN, getMax=NaN, getMean=NaN, getM...#350#2146862523", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput132() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.stat.descriptive.SummaryStatistics", "org.apache.commons.math.stat.descriptive.SummaryStatistics", "hashCode", new String[]{}, new String[]{}, false, 4, new String[][]{});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("1953686201", String.valueOf(actual));
  assertEquals("receiver state after the call", "SummaryStatistics:\nn: 0\nmin: NaN\nmax: NaN\nmean: NaN\ngeometric mean: NaN\nvariance: NaN\nsum of squares: 0.0\nstandard deviation: NaN\nsum of logs: 0.0\n {getGeometricMean=NaN, getMax=NaN, getMean=NaN, getM...#350#2146862523", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput133() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.stat.descriptive.SummaryStatistics", "org.apache.commons.math.stat.descriptive.SummaryStatistics", "hashCode", new String[]{}, new String[]{}, false, 8, new String[][]{{"org.apache.commons.math.stat.descriptive.SummaryStatistics", "setVarianceImpl", "org.apache.commons.math.stat.descriptive.StorelessUnivariateStatistic", "<sample:0>"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("976318751", String.valueOf(actual));
  assertEquals("receiver state after the call", "SummaryStatistics:\nn: 0\nmin: NaN\nmax: NaN\nmean: NaN\ngeometric mean: NaN\nvariance: -Infinity\nsum of squares: 0.0\nstandard deviation: NaN\nsum of logs: 0.0\n {getGeometricMean=NaN, getMax=NaN, getMean=NaN...#362#302438663", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput134() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.stat.descriptive.SummaryStatistics", "org.apache.commons.math.stat.descriptive.SummaryStatistics", "getVariance", new String[]{}, new String[]{}, false, 1, new String[][]{{"org.apache.commons.math.stat.descriptive.SummaryStatistics", "setMinImpl", "org.apache.commons.math.stat.descriptive.StorelessUnivariateStatistic", "<sample:7>"}});
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("NaN", String.valueOf(actual));
  assertEquals("receiver state after the call", "SummaryStatistics:\nn: 0\nmin: 0.0\nmax: NaN\nmean: NaN\ngeometric mean: NaN\nvariance: NaN\nsum of squares: 0.0\nstandard deviation: NaN\nsum of logs: 0.0\n {getGeometricMean=NaN, getMax=NaN, getMean=NaN, getM...#350#-1067426903", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput135() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.stat.descriptive.SummaryStatistics", "org.apache.commons.math.stat.descriptive.SummaryStatistics", "setSumLogImpl", new String[]{"org.apache.commons.math.stat.descriptive.StorelessUnivariateStatistic"}, new String[]{"<sample:1>"}, false);
  assertNull(actual);
  assertEquals("receiver state after the call", "SummaryStatistics:\nn: 0\nmin: NaN\nmax: NaN\nmean: NaN\ngeometric mean: NaN\nvariance: NaN\nsum of squares: 0.0\nstandard deviation: NaN\nsum of logs: -1.0\n {getGeometricMean=NaN, getMax=NaN, getMean=NaN, get...#352#-1582366675", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput136() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.stat.descriptive.SummaryStatistics", "org.apache.commons.math.stat.descriptive.SummaryStatistics", "setSumLogImpl", new String[]{"org.apache.commons.math.stat.descriptive.StorelessUnivariateStatistic"}, new String[]{"<sample:0>"}, false);
  assertNull(actual);
  assertEquals("receiver state after the call", "SummaryStatistics:\nn: 0\nmin: NaN\nmax: NaN\nmean: NaN\ngeometric mean: NaN\nvariance: NaN\nsum of squares: 0.0\nstandard deviation: NaN\nsum of logs: -Infinity\n {getGeometricMean=NaN, getMax=NaN, getMean=NaN...#362#-80285247", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput137() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.stat.descriptive.SummaryStatistics", "org.apache.commons.math.stat.descriptive.SummaryStatistics", "setSumLogImpl", new String[]{"org.apache.commons.math.stat.descriptive.StorelessUnivariateStatistic"}, new String[]{"<sample:3>"}, false);
  assertNull(actual);
  assertEquals("receiver state after the call", "SummaryStatistics:\nn: 0\nmin: NaN\nmax: NaN\nmean: NaN\ngeometric mean: 2.718281828459045\nvariance: NaN\nsum of squares: 0.0\nstandard deviation: NaN\nsum of logs: 1.0\n {getGeometricMean=2.718281828459045, g...#378#-349379497", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput138() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.stat.descriptive.SummaryStatistics", "org.apache.commons.math.stat.descriptive.SummaryStatistics", "setSumImpl", new String[]{"org.apache.commons.math.stat.descriptive.StorelessUnivariateStatistic"}, new String[]{"<sample:3>"}, false);
  assertNull(actual);
  assertEquals("receiver state after the call", "SummaryStatistics:\nn: 0\nmin: NaN\nmax: NaN\nmean: NaN\ngeometric mean: NaN\nvariance: NaN\nsum of squares: 0.0\nstandard deviation: NaN\nsum of logs: 0.0\n {getGeometricMean=NaN, getMax=NaN, getMean=NaN, getM...#350#221329212", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput139() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.stat.descriptive.SummaryStatistics", "org.apache.commons.math.stat.descriptive.SummaryStatistics", "getSumsq", new String[]{}, new String[]{}, false);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("0.0", String.valueOf(actual));
  assertEquals("receiver state after the call", "SummaryStatistics:\nn: 0\nmin: NaN\nmax: NaN\nmean: NaN\ngeometric mean: NaN\nvariance: NaN\nsum of squares: 0.0\nstandard deviation: NaN\nsum of logs: 0.0\n {getGeometricMean=NaN, getMax=NaN, getMean=NaN, getM...#350#2146862523", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput140() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.stat.descriptive.SummaryStatistics", "org.apache.commons.math.stat.descriptive.SummaryStatistics", "getSumsq", new String[]{}, new String[]{}, false, 19, new String[][]{{"org.apache.commons.math.stat.descriptive.SummaryStatistics", "getPopulationVariance", ""}, {"org.apache.commons.math.stat.descriptive.SummaryStatistics", "getSumImpl", ""}, {"org.apache.commons.math.stat.descriptive.SummaryStatistics", "addValue", "double", "1.7976931348623157E308"}});
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("Infinity", String.valueOf(actual));
  assertEquals("receiver state after the call", "SummaryStatistics:\nn: 1\nmin: 1.7976931348623157E308\nmax: 1.7976931348623157E308\nmean: 1.7976931348623157E308\ngeometric mean: 1.7976931348622732E308\nvariance: 0.0\nsum of squares: Infinity\nstandard devi...#557#-1852587093", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput141() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.stat.descriptive.SummaryStatistics", "org.apache.commons.math.stat.descriptive.SummaryStatistics", "setMeanImpl", new String[]{"org.apache.commons.math.stat.descriptive.StorelessUnivariateStatistic"}, new String[]{"<sample:4>"}, false, 6, new String[][]{});
  assertNull(actual);
  assertEquals("receiver state after the call", "SummaryStatistics:\nn: 0\nmin: NaN\nmax: NaN\nmean: NaN\ngeometric mean: NaN\nvariance: NaN\nsum of squares: 0.0\nstandard deviation: NaN\nsum of logs: 0.0\n {getGeometricMean=NaN, getMax=NaN, getMean=NaN, getM...#350#2146862523", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput142() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.stat.descriptive.SummaryStatistics", "org.apache.commons.math.stat.descriptive.SummaryStatistics", "setMeanImpl", new String[]{"org.apache.commons.math.stat.descriptive.StorelessUnivariateStatistic"}, new String[]{"<sample:5>"}, false, 6, new String[][]{});
  assertNull(actual);
  assertEquals("receiver state after the call", "SummaryStatistics:\nn: 0\nmin: NaN\nmax: NaN\nmean: -Infinity\ngeometric mean: NaN\nvariance: NaN\nsum of squares: 0.0\nstandard deviation: NaN\nsum of logs: 0.0\n {getGeometricMean=NaN, getMax=NaN, getMean=-In...#362#-1687875013", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput143() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.stat.descriptive.SummaryStatistics", "org.apache.commons.math.stat.descriptive.SummaryStatistics", "getMin", new String[]{}, new String[]{}, false);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("NaN", String.valueOf(actual));
  assertEquals("receiver state after the call", "SummaryStatistics:\nn: 0\nmin: NaN\nmax: NaN\nmean: NaN\ngeometric mean: NaN\nvariance: NaN\nsum of squares: 0.0\nstandard deviation: NaN\nsum of logs: 0.0\n {getGeometricMean=NaN, getMax=NaN, getMean=NaN, getM...#350#2146862523", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput144() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.stat.descriptive.SummaryStatistics", "org.apache.commons.math.stat.descriptive.SummaryStatistics", "setSumImpl", new String[]{"org.apache.commons.math.stat.descriptive.StorelessUnivariateStatistic"}, new String[]{"<sample:6>"}, false);
  assertNull(actual);
  assertEquals("receiver state after the call", "SummaryStatistics:\nn: 0\nmin: NaN\nmax: NaN\nmean: NaN\ngeometric mean: NaN\nvariance: NaN\nsum of squares: 0.0\nstandard deviation: NaN\nsum of logs: 0.0\n {getGeometricMean=NaN, getMax=NaN, getMean=NaN, getM...#350#424382564", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput145() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.stat.descriptive.SummaryStatistics", "org.apache.commons.math.stat.descriptive.SummaryStatistics", "equals", new String[]{"java.lang.Object"}, new String[]{"<s:b>"}, false);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "SummaryStatistics:\nn: 0\nmin: NaN\nmax: NaN\nmean: NaN\ngeometric mean: NaN\nvariance: NaN\nsum of squares: 0.0\nstandard deviation: NaN\nsum of logs: 0.0\n {getGeometricMean=NaN, getMax=NaN, getMean=NaN, getM...#350#2146862523", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput146() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.stat.descriptive.SummaryStatistics", "org.apache.commons.math.stat.descriptive.SummaryStatistics", "getStandardDeviation", new String[]{}, new String[]{}, false, 4, new String[][]{{"org.apache.commons.math.stat.descriptive.SummaryStatistics", "setMinImpl", "org.apache.commons.math.stat.descriptive.StorelessUnivariateStatistic", "<sample:4>"}});
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("NaN", String.valueOf(actual));
  assertEquals("receiver state after the call", "SummaryStatistics:\nn: 0\nmin: NaN\nmax: NaN\nmean: NaN\ngeometric mean: NaN\nvariance: NaN\nsum of squares: 0.0\nstandard deviation: NaN\nsum of logs: 0.0\n {getGeometricMean=NaN, getMax=NaN, getMean=NaN, getM...#350#2146862523", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput147() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.stat.descriptive.SummaryStatistics", "org.apache.commons.math.stat.descriptive.SummaryStatistics", "getStandardDeviation", new String[]{}, new String[]{}, false, 4, new String[][]{{"org.apache.commons.math.stat.descriptive.SummaryStatistics", "setMinImpl", "org.apache.commons.math.stat.descriptive.StorelessUnivariateStatistic", "<sample:7>"}});
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("NaN", String.valueOf(actual));
  assertEquals("receiver state after the call", "SummaryStatistics:\nn: 0\nmin: 0.0\nmax: NaN\nmean: NaN\ngeometric mean: NaN\nvariance: NaN\nsum of squares: 0.0\nstandard deviation: NaN\nsum of logs: 0.0\n {getGeometricMean=NaN, getMax=NaN, getMean=NaN, getM...#350#-1067426903", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput148() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.stat.descriptive.SummaryStatistics", "org.apache.commons.math.stat.descriptive.SummaryStatistics", "getStandardDeviation", new String[]{}, new String[]{}, false, 7, new String[][]{{"org.apache.commons.math.stat.descriptive.SummaryStatistics", "setMinImpl", "org.apache.commons.math.stat.descriptive.StorelessUnivariateStatistic", "<sample:0>"}});
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("NaN", String.valueOf(actual));
  assertEquals("receiver state after the call", "SummaryStatistics:\nn: 0\nmin: -Infinity\nmax: NaN\nmean: NaN\ngeometric mean: NaN\nvariance: NaN\nsum of squares: 0.0\nstandard deviation: NaN\nsum of logs: 0.0\n {getGeometricMean=NaN, getMax=NaN, getMean=NaN...#362#497028975", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput149() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math.stat.descriptive.SummaryStatistics", "org.apache.commons.math.stat.descriptive.SummaryStatistics", "getVarianceImpl", new String[]{}, new String[]{}, false, 1, new String[][]{{"org.apache.commons.math.stat.descriptive.SummaryStatistics", "getMinImpl", ""}, {"org.apache.commons.math.stat.descriptive.SummaryStatistics", "getVarianceImpl", ""}, {"org.apache.commons.math.stat.descriptive.SummaryStatistics", "getSumOfLogs", ""}}), new String[][]{{"evaluate", "double[],double[],double", "2"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("org.apache.commons.math.exception.DimensionMismatchException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput150() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.stat.descriptive.SummaryStatistics", "org.apache.commons.math.stat.descriptive.SummaryStatistics", "setMeanImpl", new String[]{"org.apache.commons.math.stat.descriptive.StorelessUnivariateStatistic"}, new String[]{"<sample:1>"}, false, 2, new String[][]{{"org.apache.commons.math.stat.descriptive.SummaryStatistics", "getSumsq", ""}});
  assertNull(actual);
  assertEquals("receiver state after the call", "SummaryStatistics:\nn: 0\nmin: NaN\nmax: NaN\nmean: -1.0\ngeometric mean: NaN\nvariance: NaN\nsum of squares: 0.0\nstandard deviation: NaN\nsum of logs: 0.0\n {getGeometricMean=NaN, getMax=NaN, getMean=-1.0, ge...#352#1693008303", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput151() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.stat.descriptive.SummaryStatistics", "org.apache.commons.math.stat.descriptive.SummaryStatistics", "getSumsq", new String[]{}, new String[]{}, false, 4, new String[][]{{"org.apache.commons.math.stat.descriptive.SummaryStatistics", "setSumImpl", "org.apache.commons.math.stat.descriptive.StorelessUnivariateStatistic", "<null>"}});
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("0.0", String.valueOf(actual));
  assertEquals("receiver state after the call", "SummaryStatistics:\nn: 0\nmin: NaN\nmax: NaN\nmean: NaN\ngeometric mean: NaN\nvariance: NaN\nsum of squares: 0.0\nstandard deviation: NaN\nsum of logs: 0.0\n {getGeometricMean=NaN, getMax=NaN, getMean=NaN, getM...#368#-1327726461", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput152() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.stat.descriptive.SummaryStatistics", "org.apache.commons.math.stat.descriptive.SummaryStatistics", "getSumsq", new String[]{}, new String[]{}, false, 12, new String[][]{{"org.apache.commons.math.stat.descriptive.SummaryStatistics", "setSumImpl", "org.apache.commons.math.stat.descriptive.StorelessUnivariateStatistic", "<sample:5>"}, {"org.apache.commons.math.stat.descriptive.SummaryStatistics", "getSum", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("0.0", String.valueOf(actual));
  assertEquals("receiver state after the call", "SummaryStatistics:\nn: 0\nmin: NaN\nmax: NaN\nmean: NaN\ngeometric mean: NaN\nvariance: NaN\nsum of squares: 0.0\nstandard deviation: NaN\nsum of logs: 0.0\n {getGeometricMean=NaN, getMax=NaN, getMean=NaN, getM...#356#-2113366850", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput153() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.stat.descriptive.SummaryStatistics", "org.apache.commons.math.stat.descriptive.SummaryStatistics", "getSumsq", new String[]{}, new String[]{}, false, 12, new String[][]{{"org.apache.commons.math.stat.descriptive.SummaryStatistics", "setSumImpl", "org.apache.commons.math.stat.descriptive.StorelessUnivariateStatistic", "<sample:8>"}, {"org.apache.commons.math.stat.descriptive.SummaryStatistics", "getSum", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("0.0", String.valueOf(actual));
  assertEquals("receiver state after the call", "SummaryStatistics:\nn: 0\nmin: NaN\nmax: NaN\nmean: NaN\ngeometric mean: NaN\nvariance: NaN\nsum of squares: 0.0\nstandard deviation: NaN\nsum of logs: 0.0\n {getGeometricMean=NaN, getMax=NaN, getMean=NaN, getM...#350#424382564", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput154() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math.stat.descriptive.SummaryStatistics", "org.apache.commons.math.stat.descriptive.SummaryStatistics", "getVarianceImpl", new String[]{}, new String[]{}, false, 1, new String[][]{{"org.apache.commons.math.stat.descriptive.SummaryStatistics", "getMin", ""}}), new String[][]{{"clear", "", "7"}, {"getData", "", "0"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "SummaryStatistics:\nn: 0\nmin: NaN\nmax: NaN\nmean: NaN\ngeometric mean: NaN\nvariance: NaN\nsum of squares: 0.0\nstandard deviation: NaN\nsum of logs: 0.0\n {getGeometricMean=NaN, getMax=NaN, getMean=NaN, getM...#350#2146862523", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput155() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.stat.descriptive.SummaryStatistics", "org.apache.commons.math.stat.descriptive.SummaryStatistics", "getMean", new String[]{}, new String[]{}, false);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("NaN", String.valueOf(actual));
  assertEquals("receiver state after the call", "SummaryStatistics:\nn: 0\nmin: NaN\nmax: NaN\nmean: NaN\ngeometric mean: NaN\nvariance: NaN\nsum of squares: 0.0\nstandard deviation: NaN\nsum of logs: 0.0\n {getGeometricMean=NaN, getMax=NaN, getMean=NaN, getM...#350#2146862523", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput156() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.stat.descriptive.SummaryStatistics", "org.apache.commons.math.stat.descriptive.SummaryStatistics", "getMean", new String[]{}, new String[]{}, false, 14, new String[][]{{"org.apache.commons.math.stat.descriptive.SummaryStatistics", "setMeanImpl", "org.apache.commons.math.stat.descriptive.StorelessUnivariateStatistic", "<sample:2>"}});
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("0.0", String.valueOf(actual));
  assertEquals("receiver state after the call", "SummaryStatistics:\nn: 0\nmin: NaN\nmax: NaN\nmean: 0.0\ngeometric mean: NaN\nvariance: NaN\nsum of squares: 0.0\nstandard deviation: NaN\nsum of logs: 0.0\n {getGeometricMean=NaN, getMax=NaN, getMean=0.0, getM...#350#-1553279781", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput157() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.stat.descriptive.SummaryStatistics", "org.apache.commons.math.stat.descriptive.SummaryStatistics", "getMean", new String[]{}, new String[]{}, false, 15, new String[][]{{"org.apache.commons.math.stat.descriptive.SummaryStatistics", "getSum", ""}, {"org.apache.commons.math.stat.descriptive.SummaryStatistics", "copy", ""}, {"org.apache.commons.math.stat.descriptive.SummaryStatistics", "setMeanImpl", "org.apache.commons.math.stat.descriptive.StorelessUnivariateStatistic", "<sample:5>"}});
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("-Infinity", String.valueOf(actual));
  assertEquals("receiver state after the call", "SummaryStatistics:\nn: 0\nmin: NaN\nmax: NaN\nmean: -Infinity\ngeometric mean: NaN\nvariance: NaN\nsum of squares: 0.0\nstandard deviation: NaN\nsum of logs: 0.0\n {getGeometricMean=NaN, getMax=NaN, getMean=-In...#362#-1687875013", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput158() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.stat.descriptive.SummaryStatistics", "org.apache.commons.math.stat.descriptive.SummaryStatistics", "getSum", new String[]{}, new String[]{}, false, 7, new String[][]{{"org.apache.commons.math.stat.descriptive.SummaryStatistics", "setSumLogImpl", "org.apache.commons.math.stat.descriptive.StorelessUnivariateStatistic", "<sample:5>"}, {"org.apache.commons.math.stat.descriptive.SummaryStatistics", "equals", "java.lang.Object", "<sample:0>"}});
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("0.0", String.valueOf(actual));
  assertEquals("receiver state after the call", "SummaryStatistics:\nn: 0\nmin: NaN\nmax: NaN\nmean: NaN\ngeometric mean: 0.0\nvariance: NaN\nsum of squares: 0.0\nstandard deviation: NaN\nsum of logs: -Infinity\n {getGeometricMean=0.0, getMax=NaN, getMean=NaN...#362#-1804974637", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput159() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math.stat.descriptive.SummaryStatistics", "org.apache.commons.math.stat.descriptive.SummaryStatistics", "getSumsqImpl", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.math.stat.descriptive.SummaryStatistics", "setGeoMeanImpl", "org.apache.commons.math.stat.descriptive.StorelessUnivariateStatistic", "<sample:5>"}}), new String[][]{{"setData", "double[],int,int", "7"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.ArrayIndexOutOfBoundsException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput160() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.stat.descriptive.SummaryStatistics", "org.apache.commons.math.stat.descriptive.SummaryStatistics", "getSummary", new String[]{}, new String[]{}, false);
  assertNotNull(actual);
  assertEquals("org.apache.commons.math.stat.descriptive.StatisticalSummaryValues", actual.getClass().getName());
  assertEquals("StatisticalSummaryValues:\nn: 0\nmin: NaN\nmax: NaN\nmean: NaN\nstd dev: NaN\nvariance: NaN\nsum: 0.0\n {getMax=NaN, getMean=NaN, getMin=NaN, getN=0, getStandardDeviation=NaN, getSum=0.0, getVariance=NaN}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "SummaryStatistics:\nn: 0\nmin: NaN\nmax: NaN\nmean: NaN\ngeometric mean: NaN\nvariance: NaN\nsum of squares: 0.0\nstandard deviation: NaN\nsum of logs: 0.0\n {getGeometricMean=NaN, getMax=NaN, getMean=NaN, getM...#350#2146862523", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput161() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.stat.descriptive.SummaryStatistics", "org.apache.commons.math.stat.descriptive.SummaryStatistics", "setSumsqImpl", new String[]{"org.apache.commons.math.stat.descriptive.StorelessUnivariateStatistic"}, new String[]{"<sample:0>"}, false, 4, new String[][]{{"org.apache.commons.math.stat.descriptive.SummaryStatistics", "setSumImpl", "org.apache.commons.math.stat.descriptive.StorelessUnivariateStatistic", "<sample:5>"}, {"org.apache.commons.math.stat.descriptive.SummaryStatistics", "setSumLogImpl", "org.apache.commons.math.stat.descriptive.StorelessUnivariateStatistic", "<sample:4>"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "SummaryStatistics:\nn: 0\nmin: NaN\nmax: NaN\nmean: NaN\ngeometric mean: NaN\nvariance: NaN\nsum of squares: -Infinity\nstandard deviation: NaN\nsum of logs: NaN\n {getGeometricMean=NaN, getMax=NaN, getMean=NaN...#368#2007044208", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput162() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.stat.descriptive.SummaryStatistics", "org.apache.commons.math.stat.descriptive.SummaryStatistics", "setSumsqImpl", new String[]{"org.apache.commons.math.stat.descriptive.StorelessUnivariateStatistic"}, new String[]{"<sample:0>"}, false, 4, new String[][]{{"org.apache.commons.math.stat.descriptive.SummaryStatistics", "setSumImpl", "org.apache.commons.math.stat.descriptive.StorelessUnivariateStatistic", "<sample:1>"}, {"org.apache.commons.math.stat.descriptive.SummaryStatistics", "setSumLogImpl", "org.apache.commons.math.stat.descriptive.StorelessUnivariateStatistic", "<sample:4>"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "SummaryStatistics:\nn: 0\nmin: NaN\nmax: NaN\nmean: NaN\ngeometric mean: NaN\nvariance: NaN\nsum of squares: -Infinity\nstandard deviation: NaN\nsum of logs: NaN\n {getGeometricMean=NaN, getMax=NaN, getMean=NaN...#363#-81149317", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput163() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.stat.descriptive.SummaryStatistics", "org.apache.commons.math.stat.descriptive.SummaryStatistics", "setSumsqImpl", new String[]{"org.apache.commons.math.stat.descriptive.StorelessUnivariateStatistic"}, new String[]{"<sample:0>"}, false, 7, new String[][]{{"org.apache.commons.math.stat.descriptive.SummaryStatistics", "setSumImpl", "org.apache.commons.math.stat.descriptive.StorelessUnivariateStatistic", "<sample:1>"}, {"org.apache.commons.math.stat.descriptive.SummaryStatistics", "getSummary", ""}, {"org.apache.commons.math.stat.descriptive.SummaryStatistics", "setSumLogImpl", "org.apache.commons.math.stat.descriptive.StorelessUnivariateStatistic", "<sample:5>"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "SummaryStatistics:\nn: 0\nmin: NaN\nmax: NaN\nmean: NaN\ngeometric mean: 0.0\nvariance: NaN\nsum of squares: -Infinity\nstandard deviation: NaN\nsum of logs: -Infinity\n {getGeometricMean=0.0, getMax=NaN, getMe...#375#172090409", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput164() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.stat.descriptive.SummaryStatistics", "org.apache.commons.math.stat.descriptive.SummaryStatistics", "setSumsqImpl", new String[]{"org.apache.commons.math.stat.descriptive.StorelessUnivariateStatistic"}, new String[]{"<sample:6>"}, false, 7, new String[][]{{"org.apache.commons.math.stat.descriptive.SummaryStatistics", "setSumImpl", "org.apache.commons.math.stat.descriptive.StorelessUnivariateStatistic", "<sample:1>"}, {"org.apache.commons.math.stat.descriptive.SummaryStatistics", "getSummary", ""}, {"org.apache.commons.math.stat.descriptive.SummaryStatistics", "setSumLogImpl", "org.apache.commons.math.stat.descriptive.StorelessUnivariateStatistic", "<sample:5>"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "SummaryStatistics:\nn: 0\nmin: NaN\nmax: NaN\nmean: NaN\ngeometric mean: 0.0\nvariance: NaN\nsum of squares: NaN\nstandard deviation: NaN\nsum of logs: -Infinity\n {getGeometricMean=0.0, getMax=NaN, getMean=NaN...#363#143008053", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput165() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.stat.descriptive.SummaryStatistics", "org.apache.commons.math.stat.descriptive.SummaryStatistics", "setSumsqImpl", new String[]{"org.apache.commons.math.stat.descriptive.StorelessUnivariateStatistic"}, new String[]{"<sample:1>"}, false, 7, new String[][]{{"org.apache.commons.math.stat.descriptive.SummaryStatistics", "setSumImpl", "org.apache.commons.math.stat.descriptive.StorelessUnivariateStatistic", "<sample:1>"}, {"org.apache.commons.math.stat.descriptive.SummaryStatistics", "getSummary", ""}, {"org.apache.commons.math.stat.descriptive.SummaryStatistics", "setSumLogImpl", "org.apache.commons.math.stat.descriptive.StorelessUnivariateStatistic", "<sample:5>"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "SummaryStatistics:\nn: 0\nmin: NaN\nmax: NaN\nmean: NaN\ngeometric mean: 0.0\nvariance: NaN\nsum of squares: -1.0\nstandard deviation: NaN\nsum of logs: -Infinity\n {getGeometricMean=0.0, getMax=NaN, getMean=Na...#365#-1152188297", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput166() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.stat.descriptive.SummaryStatistics", "org.apache.commons.math.stat.descriptive.SummaryStatistics", "setSumImpl", new String[]{"org.apache.commons.math.stat.descriptive.StorelessUnivariateStatistic"}, new String[]{"<sample:3>"}, false, 5, new String[][]{{"org.apache.commons.math.stat.descriptive.SummaryStatistics", "getSum", ""}, {"org.apache.commons.math.stat.descriptive.SummaryStatistics", "setMaxImpl", "org.apache.commons.math.stat.descriptive.StorelessUnivariateStatistic", "<sample:3>"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "SummaryStatistics:\nn: 0\nmin: NaN\nmax: 1.0\nmean: NaN\ngeometric mean: NaN\nvariance: NaN\nsum of squares: 0.0\nstandard deviation: NaN\nsum of logs: 0.0\n {getGeometricMean=NaN, getMax=1.0, getMean=NaN, getM...#350#-1976088692", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput167() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.stat.descriptive.SummaryStatistics", "org.apache.commons.math.stat.descriptive.SummaryStatistics", "setSumImpl", new String[]{"org.apache.commons.math.stat.descriptive.StorelessUnivariateStatistic"}, new String[]{"<sample:6>"}, false, 5, new String[][]{{"org.apache.commons.math.stat.descriptive.SummaryStatistics", "getSum", ""}, {"org.apache.commons.math.stat.descriptive.SummaryStatistics", "setMaxImpl", "org.apache.commons.math.stat.descriptive.StorelessUnivariateStatistic", "<sample:3>"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "SummaryStatistics:\nn: 0\nmin: NaN\nmax: 1.0\nmean: NaN\ngeometric mean: NaN\nvariance: NaN\nsum of squares: 0.0\nstandard deviation: NaN\nsum of logs: 0.0\n {getGeometricMean=NaN, getMax=1.0, getMean=NaN, getM...#350#-1773035340", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput168() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.stat.descriptive.SummaryStatistics", "org.apache.commons.math.stat.descriptive.SummaryStatistics", "setSumImpl", new String[]{"org.apache.commons.math.stat.descriptive.StorelessUnivariateStatistic"}, new String[]{"<sample:3>"}, false, 4, new String[][]{{"org.apache.commons.math.stat.descriptive.SummaryStatistics", "getSum", ""}, {"org.apache.commons.math.stat.descriptive.SummaryStatistics", "setMaxImpl", "org.apache.commons.math.stat.descriptive.StorelessUnivariateStatistic", "<sample:3>"}, {"org.apache.commons.math.stat.descriptive.SummaryStatistics", "setVarianceImpl", "org.apache.commons.math.stat.descriptive.StorelessUnivariateStatistic", "<sample:2>"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "SummaryStatistics:\nn: 0\nmin: NaN\nmax: 1.0\nmean: NaN\ngeometric mean: NaN\nvariance: 0.0\nsum of squares: 0.0\nstandard deviation: NaN\nsum of logs: 0.0\n {getGeometricMean=NaN, getMax=1.0, getMean=NaN, getM...#350#-335445474", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput169() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.stat.descriptive.SummaryStatistics", "org.apache.commons.math.stat.descriptive.SummaryStatistics", "copy", new String[]{"org.apache.commons.math.stat.descriptive.SummaryStatistics", "org.apache.commons.math.stat.descriptive.SummaryStatistics"}, new String[]{"<sample:7>", "<sample:4>"}, true);
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput170() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math.stat.descriptive.SummaryStatistics", "org.apache.commons.math.stat.descriptive.SummaryStatistics", "getSummary", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.math.stat.descriptive.SummaryStatistics", "getMeanImpl", ""}}), new String[][]{{"getMax", "", "0"}, {"getSum", "", "2"}, {"getStandardDeviation", "", "6"}});
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("NaN", String.valueOf(actual));
  assertEquals("receiver state after the call", "SummaryStatistics:\nn: 0\nmin: NaN\nmax: NaN\nmean: NaN\ngeometric mean: NaN\nvariance: NaN\nsum of squares: 0.0\nstandard deviation: NaN\nsum of logs: 0.0\n {getGeometricMean=NaN, getMax=NaN, getMean=NaN, getM...#350#2146862523", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput171() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.stat.descriptive.SummaryStatistics", "org.apache.commons.math.stat.descriptive.SummaryStatistics", "setMinImpl", new String[]{"org.apache.commons.math.stat.descriptive.StorelessUnivariateStatistic"}, new String[]{"<sample:6>"}, false);
  assertNull(actual);
  assertEquals("receiver state after the call", "SummaryStatistics:\nn: 0\nmin: NaN\nmax: NaN\nmean: NaN\ngeometric mean: NaN\nvariance: NaN\nsum of squares: 0.0\nstandard deviation: NaN\nsum of logs: 0.0\n {getGeometricMean=NaN, getMax=NaN, getMean=NaN, getM...#350#2146862523", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput172() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math.stat.descriptive.SummaryStatistics", "org.apache.commons.math.stat.descriptive.SummaryStatistics", "getSumsqImpl", new String[]{}, new String[]{}, false, 6, new String[][]{{"org.apache.commons.math.stat.descriptive.SummaryStatistics", "setSumImpl", "org.apache.commons.math.stat.descriptive.StorelessUnivariateStatistic", "<sample:5>"}, {"org.apache.commons.math.stat.descriptive.SummaryStatistics", "copy", ""}, {"org.apache.commons.math.stat.descriptive.SummaryStatistics", "setMeanImpl", "org.apache.commons.math.stat.descriptive.StorelessUnivariateStatistic", "<sample:6>"}}), new String[][]{{"setData", "double[]", "5"}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.math.stat.descriptive.summary.SumOfSquares", actual.getClass().getName());
  assertEquals("{getData=[-1.0, 0.0, 1.0], getN=0, getResult=0.0}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "SummaryStatistics:\nn: 0\nmin: NaN\nmax: NaN\nmean: NaN\ngeometric mean: NaN\nvariance: NaN\nsum of squares: 0.0\nstandard deviation: NaN\nsum of logs: 0.0\n {getGeometricMean=NaN, getMax=NaN, getMean=NaN, getM...#356#-2113366850", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput173() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math.stat.descriptive.SummaryStatistics", "org.apache.commons.math.stat.descriptive.SummaryStatistics", "getMinImpl", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.math.stat.descriptive.SummaryStatistics", "getSumImpl", ""}, {"org.apache.commons.math.stat.descriptive.SummaryStatistics", "addValue", "double", "1.7976931348623157E308"}}), new String[][]{{"evaluate", "double[]", "3"}, {"incrementAll", "double[],int,int", "1"}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.math.stat.descriptive.rank.Min", actual.getClass().getName());
  assertEquals("{getData=null, getN=2, getResult=0.0}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "SummaryStatistics:\nn: 1\nmin: 0.0\nmax: 1.7976931348623157E308\nmean: 1.7976931348623157E308\ngeometric mean: 1.7976931348622732E308\nvariance: 0.0\nsum of squares: Infinity\nstandard deviation: 0.0\nsum of l...#519#-308795155", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput174() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math.stat.descriptive.SummaryStatistics", "org.apache.commons.math.stat.descriptive.SummaryStatistics", "getMinImpl", new String[]{}, new String[]{}, false, 1, new String[][]{{"org.apache.commons.math.stat.descriptive.SummaryStatistics", "getSumImpl", ""}, {"org.apache.commons.math.stat.descriptive.SummaryStatistics", "addValue", "double", "1.7976931348623157E308"}, {"org.apache.commons.math.stat.descriptive.SummaryStatistics", "clear", ""}}), new String[][]{{"evaluate", "double[]", "3"}, {"incrementAll", "double[],int,int", "1"}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.math.stat.descriptive.rank.Min", actual.getClass().getName());
  assertEquals("{getData=null, getN=1, getResult=0.0}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "SummaryStatistics:\nn: 0\nmin: 0.0\nmax: NaN\nmean: NaN\ngeometric mean: NaN\nvariance: NaN\nsum of squares: 0.0\nstandard deviation: NaN\nsum of logs: 0.0\n {getGeometricMean=NaN, getMax=NaN, getMean=NaN, getM...#350#-1067426903", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput175() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math.stat.descriptive.SummaryStatistics", "org.apache.commons.math.stat.descriptive.SummaryStatistics", "getMinImpl", new String[]{}, new String[]{}, false, 1, new String[][]{{"org.apache.commons.math.stat.descriptive.SummaryStatistics", "getSumImpl", ""}, {"org.apache.commons.math.stat.descriptive.SummaryStatistics", "addValue", "double", "1.7976931348623157E308"}, {"org.apache.commons.math.stat.descriptive.SummaryStatistics", "clear", ""}}), new String[][]{{"evaluate", "double[]", "3"}});
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("Infinity", String.valueOf(actual));
  assertEquals("receiver state after the call", "SummaryStatistics:\nn: 0\nmin: NaN\nmax: NaN\nmean: NaN\ngeometric mean: NaN\nvariance: NaN\nsum of squares: 0.0\nstandard deviation: NaN\nsum of logs: 0.0\n {getGeometricMean=NaN, getMax=NaN, getMean=NaN, getM...#350#2146862523", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput176() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math.stat.descriptive.SummaryStatistics", "org.apache.commons.math.stat.descriptive.SummaryStatistics", "getMinImpl", new String[]{}, new String[]{}, false, 1, new String[][]{{"org.apache.commons.math.stat.descriptive.SummaryStatistics", "getSumImpl", ""}, {"org.apache.commons.math.stat.descriptive.SummaryStatistics", "addValue", "double", "1.7976931348623157E308"}}), new String[][]{{"evaluate", "double[]", "3"}});
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("Infinity", String.valueOf(actual));
  assertEquals("receiver state after the call", "SummaryStatistics:\nn: 1\nmin: 1.7976931348623157E308\nmax: 1.7976931348623157E308\nmean: 1.7976931348623157E308\ngeometric mean: 1.7976931348622732E308\nvariance: 0.0\nsum of squares: Infinity\nstandard devi...#557#-1852587093", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput177() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math.stat.descriptive.SummaryStatistics", "org.apache.commons.math.stat.descriptive.SummaryStatistics", "getMinImpl", new String[]{}, new String[]{}, false, 1, new String[][]{{"org.apache.commons.math.stat.descriptive.SummaryStatistics", "getSumImpl", ""}, {"org.apache.commons.math.stat.descriptive.SummaryStatistics", "getVariance", ""}, {"org.apache.commons.math.stat.descriptive.SummaryStatistics", "addValue", "double", "Infinity"}}), new String[][]{{"evaluate", "double[]", "3"}});
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("Infinity", String.valueOf(actual));
  assertEquals("receiver state after the call", "SummaryStatistics:\nn: 1\nmin: Infinity\nmax: Infinity\nmean: Infinity\ngeometric mean: Infinity\nvariance: 0.0\nsum of squares: Infinity\nstandard deviation: 0.0\nsum of logs: Infinity\n {getGeometricMean=Infi...#415#-170326978", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput178() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math.stat.descriptive.SummaryStatistics", "org.apache.commons.math.stat.descriptive.SummaryStatistics", "getMinImpl", new String[]{}, new String[]{}, false, 3, new String[][]{{"org.apache.commons.math.stat.descriptive.SummaryStatistics", "getSumImpl", ""}, {"org.apache.commons.math.stat.descriptive.SummaryStatistics", "getMin", ""}, {"org.apache.commons.math.stat.descriptive.SummaryStatistics", "addValue", "double", "Infinity"}}), new String[][]{{"getData", "", "3"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "SummaryStatistics:\nn: 1\nmin: Infinity\nmax: Infinity\nmean: Infinity\ngeometric mean: Infinity\nvariance: 0.0\nsum of squares: Infinity\nstandard deviation: 0.0\nsum of logs: Infinity\n {getGeometricMean=Infi...#415#-170326978", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput179() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math.stat.descriptive.SummaryStatistics", "org.apache.commons.math.stat.descriptive.SummaryStatistics", "getMinImpl", new String[]{}, new String[]{}, false, 30, new String[][]{{"org.apache.commons.math.stat.descriptive.SummaryStatistics", "setGeoMeanImpl", "org.apache.commons.math.stat.descriptive.StorelessUnivariateStatistic", "<sample:3>"}, {"org.apache.commons.math.stat.descriptive.SummaryStatistics", "getGeometricMean", ""}}), new String[][]{{"setData", "double[],int,int", "6"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.ArrayIndexOutOfBoundsException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput180() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.stat.descriptive.SummaryStatistics", "org.apache.commons.math.stat.descriptive.SummaryStatistics", "getVariance", new String[]{}, new String[]{}, false, 2, new String[][]{{"org.apache.commons.math.stat.descriptive.SummaryStatistics", "setGeoMeanImpl", "org.apache.commons.math.stat.descriptive.StorelessUnivariateStatistic", "<sample:7>"}});
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("NaN", String.valueOf(actual));
  assertEquals("receiver state after the call", "SummaryStatistics:\nn: 0\nmin: NaN\nmax: NaN\nmean: NaN\ngeometric mean: 0.0\nvariance: NaN\nsum of squares: 0.0\nstandard deviation: NaN\nsum of logs: 0.0\n {getGeometricMean=0.0, getMax=NaN, getMean=NaN, getM...#350#-82019827", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput181() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math.stat.descriptive.SummaryStatistics", "org.apache.commons.math.stat.descriptive.SummaryStatistics", "setGeoMeanImpl", new String[]{"org.apache.commons.math.stat.descriptive.StorelessUnivariateStatistic"}, new String[]{"<sample:3>"}, false, 0, new String[][]{{"org.apache.commons.math.stat.descriptive.SummaryStatistics", "addValue", "double", "-2021321786743555871"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("org.apache.commons.math.exception.MathIllegalStateException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput182() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.stat.descriptive.SummaryStatistics", "org.apache.commons.math.stat.descriptive.SummaryStatistics", "setGeoMeanImpl", new String[]{"org.apache.commons.math.stat.descriptive.StorelessUnivariateStatistic"}, new String[]{"<sample:1>"}, false, 0, new String[][]{{"org.apache.commons.math.stat.descriptive.SummaryStatistics", "getSum", ""}});
  assertNull(actual);
  assertEquals("receiver state after the call", "SummaryStatistics:\nn: 0\nmin: NaN\nmax: NaN\nmean: NaN\ngeometric mean: -1.0\nvariance: NaN\nsum of squares: 0.0\nstandard deviation: NaN\nsum of logs: 0.0\n {getGeometricMean=-1.0, getMax=NaN, getMean=NaN, ge...#352#-1943654327", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput183() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.stat.descriptive.SummaryStatistics", "org.apache.commons.math.stat.descriptive.SummaryStatistics", "getMean", new String[]{}, new String[]{}, false, 13, new String[][]{{"org.apache.commons.math.stat.descriptive.SummaryStatistics", "setGeoMeanImpl", "org.apache.commons.math.stat.descriptive.StorelessUnivariateStatistic", "<sample:7>"}});
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("NaN", String.valueOf(actual));
  assertEquals("receiver state after the call", "SummaryStatistics:\nn: 0\nmin: NaN\nmax: NaN\nmean: NaN\ngeometric mean: 0.0\nvariance: NaN\nsum of squares: 0.0\nstandard deviation: NaN\nsum of logs: 0.0\n {getGeometricMean=0.0, getMax=NaN, getMean=NaN, getM...#350#-82019827", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput184() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.stat.descriptive.SummaryStatistics", "org.apache.commons.math.stat.descriptive.SummaryStatistics", "getMean", new String[]{}, new String[]{}, false, 14, new String[][]{{"org.apache.commons.math.stat.descriptive.SummaryStatistics", "setGeoMeanImpl", "org.apache.commons.math.stat.descriptive.StorelessUnivariateStatistic", "<sample:0>"}});
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("NaN", String.valueOf(actual));
  assertEquals("receiver state after the call", "SummaryStatistics:\nn: 0\nmin: NaN\nmax: NaN\nmean: NaN\ngeometric mean: -Infinity\nvariance: NaN\nsum of squares: 0.0\nstandard deviation: NaN\nsum of logs: 0.0\n {getGeometricMean=-Infinity, getMax=NaN, getMe...#362#722874311", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput185() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.stat.descriptive.SummaryStatistics", "org.apache.commons.math.stat.descriptive.SummaryStatistics", "toString", new String[]{}, new String[]{}, false, 4, new String[][]{{"org.apache.commons.math.stat.descriptive.SummaryStatistics", "setSumImpl", "org.apache.commons.math.stat.descriptive.StorelessUnivariateStatistic", "<sample:3>"}, {"org.apache.commons.math.stat.descriptive.SummaryStatistics", "getSumOfLogs", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("SummaryStatistics:\nn: 0\nmin: NaN\nmax: NaN\nmean: NaN\ngeometric mean: NaN\nvariance: NaN\nsum of squares: 0.0\nstandard deviation: NaN\nsum of logs: 0.0\n", String.valueOf(actual));
  assertEquals("receiver state after the call", "SummaryStatistics:\nn: 0\nmin: NaN\nmax: NaN\nmean: NaN\ngeometric mean: NaN\nvariance: NaN\nsum of squares: 0.0\nstandard deviation: NaN\nsum of logs: 0.0\n {getGeometricMean=NaN, getMax=NaN, getMean=NaN, getM...#350#221329212", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput186() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.stat.descriptive.SummaryStatistics", "org.apache.commons.math.stat.descriptive.SummaryStatistics", "getSecondMoment", new String[]{}, new String[]{}, false, 1, new String[][]{{"org.apache.commons.math.stat.descriptive.SummaryStatistics", "getMinImpl", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("NaN", String.valueOf(actual));
  assertEquals("receiver state after the call", "SummaryStatistics:\nn: 0\nmin: NaN\nmax: NaN\nmean: NaN\ngeometric mean: NaN\nvariance: NaN\nsum of squares: 0.0\nstandard deviation: NaN\nsum of logs: 0.0\n {getGeometricMean=NaN, getMax=NaN, getMean=NaN, getM...#350#2146862523", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput187() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.stat.descriptive.SummaryStatistics", "org.apache.commons.math.stat.descriptive.SummaryStatistics", "getMeanImpl", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.math.stat.descriptive.SummaryStatistics", "getMinImpl", ""}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.math.stat.descriptive.moment.Mean", actual.getClass().getName());
  assertEquals("{getData=null, getN=0, getResult=NaN}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "SummaryStatistics:\nn: 0\nmin: NaN\nmax: NaN\nmean: NaN\ngeometric mean: NaN\nvariance: NaN\nsum of squares: 0.0\nstandard deviation: NaN\nsum of logs: 0.0\n {getGeometricMean=NaN, getMax=NaN, getMean=NaN, getM...#350#2146862523", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput188() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.stat.descriptive.SummaryStatistics", "org.apache.commons.math.stat.descriptive.SummaryStatistics", "getGeometricMean", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.math.stat.descriptive.SummaryStatistics", "getSummary", ""}, {"org.apache.commons.math.stat.descriptive.SummaryStatistics", "setSumsqImpl", "org.apache.commons.math.stat.descriptive.StorelessUnivariateStatistic", "<sample:5>"}});
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("NaN", String.valueOf(actual));
  assertEquals("receiver state after the call", "SummaryStatistics:\nn: 0\nmin: NaN\nmax: NaN\nmean: NaN\ngeometric mean: NaN\nvariance: NaN\nsum of squares: -Infinity\nstandard deviation: NaN\nsum of logs: 0.0\n {getGeometricMean=NaN, getMax=NaN, getMean=NaN...#362#114820443", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput189() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.stat.descriptive.SummaryStatistics", "org.apache.commons.math.stat.descriptive.SummaryStatistics", "getGeometricMean", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.math.stat.descriptive.SummaryStatistics", "setSumsqImpl", "org.apache.commons.math.stat.descriptive.StorelessUnivariateStatistic", "<sample:1>"}});
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("NaN", String.valueOf(actual));
  assertEquals("receiver state after the call", "SummaryStatistics:\nn: 0\nmin: NaN\nmax: NaN\nmean: NaN\ngeometric mean: NaN\nvariance: NaN\nsum of squares: -1.0\nstandard deviation: NaN\nsum of logs: 0.0\n {getGeometricMean=NaN, getMax=NaN, getMean=NaN, get...#352#-536078183", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput190() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math.stat.descriptive.SummaryStatistics", "org.apache.commons.math.stat.descriptive.SummaryStatistics", "getMaxImpl", new String[]{}, new String[]{}, false, 7, new String[][]{}), new String[][]{{"evaluate", "", "2"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("org.apache.commons.math.exception.NullArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput191() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.stat.descriptive.SummaryStatistics", "org.apache.commons.math.stat.descriptive.SummaryStatistics", "addValue", new String[]{"double"}, new String[]{"NaN"}, false);
  assertNull(actual);
  assertEquals("receiver state after the call", "SummaryStatistics:\nn: 1\nmin: NaN\nmax: NaN\nmean: NaN\ngeometric mean: NaN\nvariance: 0.0\nsum of squares: NaN\nstandard deviation: 0.0\nsum of logs: NaN\n {getGeometricMean=NaN, getMax=NaN, getMean=NaN, getM...#350#-742111247", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput192() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.stat.descriptive.SummaryStatistics", "org.apache.commons.math.stat.descriptive.SummaryStatistics", "getSumLogImpl", new String[]{}, new String[]{}, false, 7, new String[][]{{"org.apache.commons.math.stat.descriptive.SummaryStatistics", "getVarianceImpl", ""}, {"org.apache.commons.math.stat.descriptive.SummaryStatistics", "setMaxImpl", "org.apache.commons.math.stat.descriptive.StorelessUnivariateStatistic", "<sample:0>"}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.math.stat.descriptive.summary.SumOfLogs", actual.getClass().getName());
  assertEquals("{getData=null, getN=0, getResult=0.0}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "SummaryStatistics:\nn: 0\nmin: NaN\nmax: -Infinity\nmean: NaN\ngeometric mean: NaN\nvariance: NaN\nsum of squares: 0.0\nstandard deviation: NaN\nsum of logs: 0.0\n {getGeometricMean=NaN, getMax=-Infinity, getMe...#362#441961607", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput193() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.stat.descriptive.SummaryStatistics", "org.apache.commons.math.stat.descriptive.SummaryStatistics", "getSumLogImpl", new String[]{}, new String[]{}, false, 9, new String[][]{{"org.apache.commons.math.stat.descriptive.SummaryStatistics", "getVarianceImpl", ""}, {"org.apache.commons.math.stat.descriptive.SummaryStatistics", "setMaxImpl", "org.apache.commons.math.stat.descriptive.StorelessUnivariateStatistic", "<sample:3>"}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.math.stat.descriptive.summary.SumOfLogs", actual.getClass().getName());
  assertEquals("{getData=null, getN=0, getResult=0.0}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "SummaryStatistics:\nn: 0\nmin: NaN\nmax: 1.0\nmean: NaN\ngeometric mean: NaN\nvariance: NaN\nsum of squares: 0.0\nstandard deviation: NaN\nsum of logs: 0.0\n {getGeometricMean=NaN, getMax=1.0, getMean=NaN, getM...#350#-50555381", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput194() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.stat.descriptive.SummaryStatistics", "org.apache.commons.math.stat.descriptive.SummaryStatistics", "setGeoMeanImpl", new String[]{"org.apache.commons.math.stat.descriptive.StorelessUnivariateStatistic"}, new String[]{"<sample:3>"}, false);
  assertNull(actual);
  assertEquals("receiver state after the call", "SummaryStatistics:\nn: 0\nmin: NaN\nmax: NaN\nmean: NaN\ngeometric mean: 1.0\nvariance: NaN\nsum of squares: 0.0\nstandard deviation: NaN\nsum of logs: 0.0\n {getGeometricMean=1.0, getMax=NaN, getMean=NaN, getM...#350#20795403", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput195() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math.stat.descriptive.SummaryStatistics", "org.apache.commons.math.stat.descriptive.SummaryStatistics", "getSumLogImpl", new String[]{}, new String[]{}, false, 14, new String[][]{{"org.apache.commons.math.stat.descriptive.SummaryStatistics", "getVarianceImpl", ""}, {"org.apache.commons.math.stat.descriptive.SummaryStatistics", "getGeoMeanImpl", ""}}), new String[][]{{"copy", "", "2"}, {"incrementAll", "double[],int,int", "7"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("org.apache.commons.math.exception.NumberIsTooLargeException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput196() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math.stat.descriptive.SummaryStatistics", "org.apache.commons.math.stat.descriptive.SummaryStatistics", "getSummary", new String[]{}, new String[]{}, false, 13, new String[][]{{"org.apache.commons.math.stat.descriptive.SummaryStatistics", "clear", ""}}), new String[][]{{"getSum", "", "0"}});
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("0.0", String.valueOf(actual));
  assertEquals("receiver state after the call", "SummaryStatistics:\nn: 0\nmin: NaN\nmax: NaN\nmean: NaN\ngeometric mean: NaN\nvariance: NaN\nsum of squares: 0.0\nstandard deviation: NaN\nsum of logs: 0.0\n {getGeometricMean=NaN, getMax=NaN, getMean=NaN, getM...#350#2146862523", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput197() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.stat.descriptive.SummaryStatistics", "org.apache.commons.math.stat.descriptive.SummaryStatistics", "getVariance", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.math.stat.descriptive.SummaryStatistics", "toString", ""}, {"org.apache.commons.math.stat.descriptive.SummaryStatistics", "addValue", "double", "-1.0"}});
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("0.0", String.valueOf(actual));
  assertEquals("receiver state after the call", "SummaryStatistics:\nn: 1\nmin: -1.0\nmax: -1.0\nmean: -1.0\ngeometric mean: NaN\nvariance: 0.0\nsum of squares: 1.0\nstandard deviation: 0.0\nsum of logs: NaN\n {getGeometricMean=NaN, getMax=-1.0, getMean=-1.0,...#357#65188631", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput198() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math.stat.descriptive.SummaryStatistics", "org.apache.commons.math.stat.descriptive.SummaryStatistics", "getSummary", new String[]{}, new String[]{}, false, 24, new String[][]{{"org.apache.commons.math.stat.descriptive.SummaryStatistics", "clear", ""}, {"org.apache.commons.math.stat.descriptive.SummaryStatistics", "getGeometricMean", ""}}, 3), new String[][]{{"getVariance", "", "0"}});
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("NaN", String.valueOf(actual));
  assertEquals("receiver state after the call", "SummaryStatistics:\nn: 0\nmin: NaN\nmax: NaN\nmean: NaN\ngeometric mean: NaN\nvariance: NaN\nsum of squares: 0.0\nstandard deviation: NaN\nsum of logs: 0.0\n {getGeometricMean=NaN, getMax=NaN, getMean=NaN, getM...#350#2146862523", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput199() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.stat.descriptive.SummaryStatistics", "org.apache.commons.math.stat.descriptive.SummaryStatistics", "getSummary", new String[]{}, new String[]{}, false, 13, new String[][]{{"org.apache.commons.math.stat.descriptive.SummaryStatistics", "clear", ""}, {"org.apache.commons.math.stat.descriptive.SummaryStatistics", "getGeometricMean", ""}}, 3);
  assertNotNull(actual);
  assertEquals("org.apache.commons.math.stat.descriptive.StatisticalSummaryValues", actual.getClass().getName());
  assertEquals("StatisticalSummaryValues:\nn: 0\nmin: NaN\nmax: NaN\nmean: NaN\nstd dev: NaN\nvariance: NaN\nsum: 0.0\n {getMax=NaN, getMean=NaN, getMin=NaN, getN=0, getStandardDeviation=NaN, getSum=0.0, getVariance=NaN}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "SummaryStatistics:\nn: 0\nmin: NaN\nmax: NaN\nmean: NaN\ngeometric mean: NaN\nvariance: NaN\nsum of squares: 0.0\nstandard deviation: NaN\nsum of logs: 0.0\n {getGeometricMean=NaN, getMax=NaN, getMean=NaN, getM...#350#2146862523", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput200() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.stat.descriptive.SummaryStatistics", "org.apache.commons.math.stat.descriptive.SummaryStatistics", "getSum", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.math.stat.descriptive.SummaryStatistics", "addValue", "double", "Infinity"}});
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("Infinity", String.valueOf(actual));
  assertEquals("receiver state after the call", "SummaryStatistics:\nn: 1\nmin: Infinity\nmax: Infinity\nmean: Infinity\ngeometric mean: Infinity\nvariance: 0.0\nsum of squares: Infinity\nstandard deviation: 0.0\nsum of logs: Infinity\n {getGeometricMean=Infi...#415#-170326978", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput201() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.stat.descriptive.SummaryStatistics", "org.apache.commons.math.stat.descriptive.SummaryStatistics", "setMeanImpl", new String[]{"org.apache.commons.math.stat.descriptive.StorelessUnivariateStatistic"}, new String[]{"<sample:3>"}, false, 1, new String[][]{{"org.apache.commons.math.stat.descriptive.SummaryStatistics", "getGeoMeanImpl", ""}});
  assertNull(actual);
  assertEquals("receiver state after the call", "SummaryStatistics:\nn: 0\nmin: NaN\nmax: NaN\nmean: 1.0\ngeometric mean: NaN\nvariance: NaN\nsum of squares: 0.0\nstandard deviation: NaN\nsum of logs: 0.0\n {getGeometricMean=NaN, getMax=NaN, getMean=1.0, getM...#350#-883672389", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput202() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.stat.descriptive.SummaryStatistics", "org.apache.commons.math.stat.descriptive.SummaryStatistics", "copy", new String[]{"org.apache.commons.math.stat.descriptive.SummaryStatistics", "org.apache.commons.math.stat.descriptive.SummaryStatistics"}, new String[]{"<sample:6>", "<sample:0>"}, true, 0, null, 3);
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput203() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math.stat.descriptive.SummaryStatistics", "org.apache.commons.math.stat.descriptive.SummaryStatistics", "copy", new String[]{"org.apache.commons.math.stat.descriptive.SummaryStatistics", "org.apache.commons.math.stat.descriptive.SummaryStatistics"}, new String[]{"<sample:7>", "<null>"}, true, 0, null, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("org.apache.commons.math.exception.NullArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput204() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.stat.descriptive.SummaryStatistics", "org.apache.commons.math.stat.descriptive.SummaryStatistics", "copy", new String[]{"org.apache.commons.math.stat.descriptive.SummaryStatistics", "org.apache.commons.math.stat.descriptive.SummaryStatistics"}, new String[]{"<sample:9>", "<sample:7>"}, true, 0, null, 2);
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput205() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math.stat.descriptive.SummaryStatistics", "org.apache.commons.math.stat.descriptive.SummaryStatistics", "copy", new String[]{"org.apache.commons.math.stat.descriptive.SummaryStatistics", "org.apache.commons.math.stat.descriptive.SummaryStatistics"}, new String[]{"<null>", "<sample:7>"}, true, 0, null, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("org.apache.commons.math.exception.NullArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput206() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math.stat.descriptive.SummaryStatistics", "org.apache.commons.math.stat.descriptive.SummaryStatistics", "copy", new String[]{"org.apache.commons.math.stat.descriptive.SummaryStatistics", "org.apache.commons.math.stat.descriptive.SummaryStatistics"}, new String[]{"<sample:4>", "<null>"}, true); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("org.apache.commons.math.exception.NullArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput207() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math.stat.descriptive.SummaryStatistics", "org.apache.commons.math.stat.descriptive.SummaryStatistics", "getMaxImpl", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.math.stat.descriptive.SummaryStatistics", "setSumLogImpl", "org.apache.commons.math.stat.descriptive.StorelessUnivariateStatistic", "<sample:1>"}}), new String[][]{{"incrementAll", "double[],int,int", "4"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("org.apache.commons.math.exception.NumberIsTooLargeException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput208() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.stat.descriptive.SummaryStatistics", "org.apache.commons.math.stat.descriptive.SummaryStatistics", "getSumsq", new String[]{}, new String[]{}, false, 0, null, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("0.0", String.valueOf(actual));
  assertEquals("receiver state after the call", "SummaryStatistics:\nn: 0\nmin: NaN\nmax: NaN\nmean: NaN\ngeometric mean: NaN\nvariance: NaN\nsum of squares: 0.0\nstandard deviation: NaN\nsum of logs: 0.0\n {getGeometricMean=NaN, getMax=NaN, getMean=NaN, getM...#350#2146862523", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput209() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.stat.descriptive.SummaryStatistics", "org.apache.commons.math.stat.descriptive.SummaryStatistics", "getSumImpl", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.math.stat.descriptive.SummaryStatistics", "setSumImpl", "org.apache.commons.math.stat.descriptive.StorelessUnivariateStatistic", "<sample:3>"}});
  assertNotNull(actual);
  assertEquals("receiver state after the call", "SummaryStatistics:\nn: 0\nmin: NaN\nmax: NaN\nmean: NaN\ngeometric mean: NaN\nvariance: NaN\nsum of squares: 0.0\nstandard deviation: NaN\nsum of logs: 0.0\n {getGeometricMean=NaN, getMax=NaN, getMean=NaN, getM...#350#221329212", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput210() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.stat.descriptive.SummaryStatistics", "org.apache.commons.math.stat.descriptive.SummaryStatistics", "toString", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.math.stat.descriptive.SummaryStatistics", "getSumsq", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("SummaryStatistics:\nn: 0\nmin: NaN\nmax: NaN\nmean: NaN\ngeometric mean: NaN\nvariance: NaN\nsum of squares: 0.0\nstandard deviation: NaN\nsum of logs: 0.0\n", String.valueOf(actual));
  assertEquals("receiver state after the call", "SummaryStatistics:\nn: 0\nmin: NaN\nmax: NaN\nmean: NaN\ngeometric mean: NaN\nvariance: NaN\nsum of squares: 0.0\nstandard deviation: NaN\nsum of logs: 0.0\n {getGeometricMean=NaN, getMax=NaN, getMean=NaN, getM...#350#2146862523", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput211() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.stat.descriptive.SummaryStatistics", "org.apache.commons.math.stat.descriptive.SummaryStatistics", "setMinImpl", new String[]{"org.apache.commons.math.stat.descriptive.StorelessUnivariateStatistic"}, new String[]{"<sample:1>"}, false, 5, new String[][]{{"org.apache.commons.math.stat.descriptive.SummaryStatistics", "getSumOfLogs", ""}}, 1);
  assertNull(actual);
  assertEquals("receiver state after the call", "SummaryStatistics:\nn: 0\nmin: -1.0\nmax: NaN\nmean: NaN\ngeometric mean: NaN\nvariance: NaN\nsum of squares: 0.0\nstandard deviation: NaN\nsum of logs: 0.0\n {getGeometricMean=NaN, getMax=NaN, getMean=NaN, get...#352#-1502693101", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput212() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.stat.descriptive.SummaryStatistics", "org.apache.commons.math.stat.descriptive.SummaryStatistics", "getPopulationVariance", new String[]{}, new String[]{}, false, 4, new String[][]{{"org.apache.commons.math.stat.descriptive.SummaryStatistics", "addValue", "double", "NaN"}, {"org.apache.commons.math.stat.descriptive.SummaryStatistics", "getSumsqImpl", ""}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("0.0", String.valueOf(actual));
  assertEquals("receiver state after the call", "SummaryStatistics:\nn: 1\nmin: NaN\nmax: NaN\nmean: NaN\ngeometric mean: NaN\nvariance: 0.0\nsum of squares: NaN\nstandard deviation: 0.0\nsum of logs: NaN\n {getGeometricMean=NaN, getMax=NaN, getMean=NaN, getM...#350#-742111247", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput213() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.stat.descriptive.SummaryStatistics", "org.apache.commons.math.stat.descriptive.SummaryStatistics", "addValue", new String[]{"double"}, new String[]{"1.7976931348623157E308"}, false, 0, null, 1);
  assertNull(actual);
  assertEquals("receiver state after the call", "SummaryStatistics:\nn: 1\nmin: 1.7976931348623157E308\nmax: 1.7976931348623157E308\nmean: 1.7976931348623157E308\ngeometric mean: 1.7976931348622732E308\nvariance: 0.0\nsum of squares: Infinity\nstandard devi...#557#-1852587093", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput214() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.stat.descriptive.SummaryStatistics", "org.apache.commons.math.stat.descriptive.SummaryStatistics", "addValue", new String[]{"double"}, new String[]{"1.7976931348623157E308"}, false, 0, new String[][]{{"org.apache.commons.math.stat.descriptive.SummaryStatistics", "getSumsq", ""}, {"org.apache.commons.math.stat.descriptive.SummaryStatistics", "getMin", ""}});
  assertNull(actual);
  assertEquals("receiver state after the call", "SummaryStatistics:\nn: 1\nmin: 1.7976931348623157E308\nmax: 1.7976931348623157E308\nmean: 1.7976931348623157E308\ngeometric mean: 1.7976931348622732E308\nvariance: 0.0\nsum of squares: Infinity\nstandard devi...#557#-1852587093", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput215() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.stat.descriptive.SummaryStatistics", "org.apache.commons.math.stat.descriptive.SummaryStatistics", "addValue", new String[]{"double"}, new String[]{"Infinity"}, false, 0, new String[][]{{"org.apache.commons.math.stat.descriptive.SummaryStatistics", "getSumsq", ""}, {"org.apache.commons.math.stat.descriptive.SummaryStatistics", "getMin", ""}});
  assertNull(actual);
  assertEquals("receiver state after the call", "SummaryStatistics:\nn: 1\nmin: Infinity\nmax: Infinity\nmean: Infinity\ngeometric mean: Infinity\nvariance: 0.0\nsum of squares: Infinity\nstandard deviation: 0.0\nsum of logs: Infinity\n {getGeometricMean=Infi...#415#-170326978", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput216() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.stat.descriptive.SummaryStatistics", "org.apache.commons.math.stat.descriptive.SummaryStatistics", "addValue", new String[]{"double"}, new String[]{"-Infinity"}, false, 0, new String[][]{{"org.apache.commons.math.stat.descriptive.SummaryStatistics", "getSumsq", ""}, {"org.apache.commons.math.stat.descriptive.SummaryStatistics", "getSumLogImpl", ""}, {"org.apache.commons.math.stat.descriptive.SummaryStatistics", "getMin", ""}});
  assertNull(actual);
  assertEquals("receiver state after the call", "SummaryStatistics:\nn: 1\nmin: -Infinity\nmax: -Infinity\nmean: -Infinity\ngeometric mean: NaN\nvariance: 0.0\nsum of squares: Infinity\nstandard deviation: 0.0\nsum of logs: NaN\n {getGeometricMean=NaN, getMax...#402#-2097363717", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput217() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.stat.descriptive.SummaryStatistics", "org.apache.commons.math.stat.descriptive.SummaryStatistics", "addValue", new String[]{"double"}, new String[]{"-1.0"}, false, 0, new String[][]{{"org.apache.commons.math.stat.descriptive.SummaryStatistics", "getSumsq", ""}, {"org.apache.commons.math.stat.descriptive.SummaryStatistics", "getSumLogImpl", ""}, {"org.apache.commons.math.stat.descriptive.SummaryStatistics", "getMin", ""}});
  assertNull(actual);
  assertEquals("receiver state after the call", "SummaryStatistics:\nn: 1\nmin: -1.0\nmax: -1.0\nmean: -1.0\ngeometric mean: NaN\nvariance: 0.0\nsum of squares: 1.0\nstandard deviation: 0.0\nsum of logs: NaN\n {getGeometricMean=NaN, getMax=-1.0, getMean=-1.0,...#357#65188631", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput218() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.stat.descriptive.SummaryStatistics", "org.apache.commons.math.stat.descriptive.SummaryStatistics", "addValue", new String[]{"double"}, new String[]{"-0.05"}, false, 0, new String[][]{{"org.apache.commons.math.stat.descriptive.SummaryStatistics", "getSumLogImpl", ""}, {"org.apache.commons.math.stat.descriptive.SummaryStatistics", "getMin", ""}}, 1);
  assertNull(actual);
  assertEquals("receiver state after the call", "SummaryStatistics:\nn: 1\nmin: -0.05\nmax: -0.05\nmean: -0.05\ngeometric mean: NaN\nvariance: 0.0\nsum of squares: 0.0025000000000000005\nstandard deviation: 0.0\nsum of logs: NaN\n {getGeometricMean=NaN, getMa...#400#-1306636643", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput219() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.stat.descriptive.SummaryStatistics", "org.apache.commons.math.stat.descriptive.SummaryStatistics", "addValue", new String[]{"double"}, new String[]{"-4.65"}, false, 0, new String[][]{{"org.apache.commons.math.stat.descriptive.SummaryStatistics", "getSumLogImpl", ""}, {"org.apache.commons.math.stat.descriptive.SummaryStatistics", "getMin", ""}}, 1);
  assertNull(actual);
  assertEquals("receiver state after the call", "SummaryStatistics:\nn: 1\nmin: -4.65\nmax: -4.65\nmean: -4.65\ngeometric mean: NaN\nvariance: 0.0\nsum of squares: 21.622500000000002\nstandard deviation: 0.0\nsum of logs: NaN\n {getGeometricMean=NaN, getMax=-...#394#-1461012023", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput220() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.stat.descriptive.SummaryStatistics", "org.apache.commons.math.stat.descriptive.SummaryStatistics", "addValue", new String[]{"double"}, new String[]{"-1.1625"}, false, 1, new String[][]{{"org.apache.commons.math.stat.descriptive.SummaryStatistics", "getSumLogImpl", ""}, {"org.apache.commons.math.stat.descriptive.SummaryStatistics", "getMin", ""}}, 1);
  assertNull(actual);
  assertEquals("receiver state after the call", "SummaryStatistics:\nn: 1\nmin: -1.1625\nmax: -1.1625\nmean: -1.1625\ngeometric mean: NaN\nvariance: 0.0\nsum of squares: 1.3514062500000001\nstandard deviation: 0.0\nsum of logs: NaN\n {getGeometricMean=NaN, ge...#408#-1134172939", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput221() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.stat.descriptive.SummaryStatistics", "org.apache.commons.math.stat.descriptive.SummaryStatistics", "addValue", new String[]{"double"}, new String[]{"0.0"}, false, 13, new String[][]{{"org.apache.commons.math.stat.descriptive.SummaryStatistics", "getPopulationVariance", ""}, {"org.apache.commons.math.stat.descriptive.SummaryStatistics", "getSumLogImpl", ""}, {"org.apache.commons.math.stat.descriptive.SummaryStatistics", "getMin", ""}}, 1);
  assertNull(actual);
  assertEquals("receiver state after the call", "SummaryStatistics:\nn: 1\nmin: 0.0\nmax: 0.0\nmean: 0.0\ngeometric mean: 0.0\nvariance: 0.0\nsum of squares: 0.0\nstandard deviation: 0.0\nsum of logs: -Infinity\n {getGeometricMean=0.0, getMax=0.0, getMean=0.0...#362#-1481834331", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput222() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.stat.descriptive.SummaryStatistics", "org.apache.commons.math.stat.descriptive.SummaryStatistics", "getMin", new String[]{}, new String[]{}, false, 10, new String[][]{{"org.apache.commons.math.stat.descriptive.SummaryStatistics", "getSummary", ""}, {"org.apache.commons.math.stat.descriptive.SummaryStatistics", "getSumsq", ""}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("NaN", String.valueOf(actual));
  assertEquals("receiver state after the call", "SummaryStatistics:\nn: 0\nmin: NaN\nmax: NaN\nmean: NaN\ngeometric mean: NaN\nvariance: NaN\nsum of squares: 0.0\nstandard deviation: NaN\nsum of logs: 0.0\n {getGeometricMean=NaN, getMax=NaN, getMean=NaN, getM...#350#2146862523", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput223() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math.stat.descriptive.SummaryStatistics", "org.apache.commons.math.stat.descriptive.SummaryStatistics", "setMeanImpl", new String[]{"org.apache.commons.math.stat.descriptive.StorelessUnivariateStatistic"}, new String[]{"<sample:6>"}, false, 12, new String[][]{{"org.apache.commons.math.stat.descriptive.SummaryStatistics", "addValue", "double", "1.0"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("org.apache.commons.math.exception.MathIllegalStateException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput224() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.stat.descriptive.SummaryStatistics", "org.apache.commons.math.stat.descriptive.SummaryStatistics", "getVariance", new String[]{}, new String[]{}, false, 6, new String[][]{{"org.apache.commons.math.stat.descriptive.SummaryStatistics", "getVarianceImpl", ""}, {"org.apache.commons.math.stat.descriptive.SummaryStatistics", "setSumLogImpl", "org.apache.commons.math.stat.descriptive.StorelessUnivariateStatistic", "<sample:5>"}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("NaN", String.valueOf(actual));
  assertEquals("receiver state after the call", "SummaryStatistics:\nn: 0\nmin: NaN\nmax: NaN\nmean: NaN\ngeometric mean: 0.0\nvariance: NaN\nsum of squares: 0.0\nstandard deviation: NaN\nsum of logs: -Infinity\n {getGeometricMean=0.0, getMax=NaN, getMean=NaN...#362#-1804974637", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput225() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.stat.descriptive.SummaryStatistics", "org.apache.commons.math.stat.descriptive.SummaryStatistics", "getN", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.math.stat.descriptive.SummaryStatistics", "addValue", "double", "NaN"}, {"org.apache.commons.math.stat.descriptive.SummaryStatistics", "setMinImpl", "org.apache.commons.math.stat.descriptive.StorelessUnivariateStatistic", "<sample:7>"}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Long", actual.getClass().getName());
  assertEquals("1", String.valueOf(actual));
  assertEquals("receiver state after the call", "SummaryStatistics:\nn: 1\nmin: NaN\nmax: NaN\nmean: NaN\ngeometric mean: NaN\nvariance: 0.0\nsum of squares: NaN\nstandard deviation: 0.0\nsum of logs: NaN\n {getGeometricMean=NaN, getMax=NaN, getMean=NaN, getM...#350#-742111247", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput226() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.stat.descriptive.SummaryStatistics", "org.apache.commons.math.stat.descriptive.SummaryStatistics", "getVarianceImpl", new String[]{}, new String[]{}, false, 0, null, 2);
  assertNotNull(actual);
  assertEquals("org.apache.commons.math.stat.descriptive.moment.Variance", actual.getClass().getName());
  assertEquals("{getData=null, getN=0, getResult=NaN, isBiasCorrected=true}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "SummaryStatistics:\nn: 0\nmin: NaN\nmax: NaN\nmean: NaN\ngeometric mean: NaN\nvariance: NaN\nsum of squares: 0.0\nstandard deviation: NaN\nsum of logs: 0.0\n {getGeometricMean=NaN, getMax=NaN, getMean=NaN, getM...#350#2146862523", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput227() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.stat.descriptive.SummaryStatistics", "org.apache.commons.math.stat.descriptive.SummaryStatistics", "getSumImpl", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.math.stat.descriptive.SummaryStatistics", "setMaxImpl", "org.apache.commons.math.stat.descriptive.StorelessUnivariateStatistic", "<sample:1>"}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.math.stat.descriptive.summary.Sum", actual.getClass().getName());
  assertEquals("{getData=null, getN=0, getResult=0.0}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "SummaryStatistics:\nn: 0\nmin: NaN\nmax: -1.0\nmean: NaN\ngeometric mean: NaN\nvariance: NaN\nsum of squares: 0.0\nstandard deviation: NaN\nsum of logs: 0.0\n {getGeometricMean=NaN, getMax=-1.0, getMean=NaN, ge...#352#-1024419709", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput228() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.stat.descriptive.SummaryStatistics", "org.apache.commons.math.stat.descriptive.SummaryStatistics", "getGeoMeanImpl", new String[]{}, new String[]{}, false);
  assertNotNull(actual);
  assertEquals("org.apache.commons.math.stat.descriptive.moment.GeometricMean", actual.getClass().getName());
  assertEquals("{getData=null, getN=0, getResult=NaN}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "SummaryStatistics:\nn: 0\nmin: NaN\nmax: NaN\nmean: NaN\ngeometric mean: NaN\nvariance: NaN\nsum of squares: 0.0\nstandard deviation: NaN\nsum of logs: 0.0\n {getGeometricMean=NaN, getMax=NaN, getMean=NaN, getM...#350#2146862523", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput229() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.stat.descriptive.SummaryStatistics", "org.apache.commons.math.stat.descriptive.SummaryStatistics", "getN", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.math.stat.descriptive.SummaryStatistics", "setMaxImpl", "org.apache.commons.math.stat.descriptive.StorelessUnivariateStatistic", "<sample:3>"}});
  assertNotNull(actual);
  assertEquals("java.lang.Long", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "SummaryStatistics:\nn: 0\nmin: NaN\nmax: 1.0\nmean: NaN\ngeometric mean: NaN\nvariance: NaN\nsum of squares: 0.0\nstandard deviation: NaN\nsum of logs: 0.0\n {getGeometricMean=NaN, getMax=1.0, getMean=NaN, getM...#350#-50555381", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput230() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.stat.descriptive.SummaryStatistics", "org.apache.commons.math.stat.descriptive.SummaryStatistics", "getN", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.math.stat.descriptive.SummaryStatistics", "setMaxImpl", "org.apache.commons.math.stat.descriptive.StorelessUnivariateStatistic", "<sample:3>"}, {"org.apache.commons.math.stat.descriptive.SummaryStatistics", "setSumImpl", "org.apache.commons.math.stat.descriptive.StorelessUnivariateStatistic", "<null>"}});
  assertNotNull(actual);
  assertEquals("java.lang.Long", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "SummaryStatistics:\nn: 0\nmin: NaN\nmax: 1.0\nmean: NaN\ngeometric mean: NaN\nvariance: NaN\nsum of squares: 0.0\nstandard deviation: NaN\nsum of logs: 0.0\n {getGeometricMean=NaN, getMax=1.0, getMean=NaN, getM...#368#599596243", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput231() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.stat.descriptive.SummaryStatistics", "org.apache.commons.math.stat.descriptive.SummaryStatistics", "setMeanImpl", new String[]{"org.apache.commons.math.stat.descriptive.StorelessUnivariateStatistic"}, new String[]{"<sample:8>"}, false, 0, null, 3);
  assertNull(actual);
  assertEquals("receiver state after the call", "SummaryStatistics:\nn: 0\nmin: NaN\nmax: NaN\nmean: NaN\ngeometric mean: NaN\nvariance: NaN\nsum of squares: 0.0\nstandard deviation: NaN\nsum of logs: 0.0\n {getGeometricMean=NaN, getMax=NaN, getMean=NaN, getM...#350#2146862523", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput232() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.stat.descriptive.SummaryStatistics", "org.apache.commons.math.stat.descriptive.SummaryStatistics", "setMeanImpl", new String[]{"org.apache.commons.math.stat.descriptive.StorelessUnivariateStatistic"}, new String[]{"<sample:11>"}, false, 0, null, 3);
  assertNull(actual);
  assertEquals("receiver state after the call", "SummaryStatistics:\nn: 0\nmin: NaN\nmax: NaN\nmean: -1.0\ngeometric mean: NaN\nvariance: NaN\nsum of squares: 0.0\nstandard deviation: NaN\nsum of logs: 0.0\n {getGeometricMean=NaN, getMax=NaN, getMean=-1.0, ge...#352#1693008303", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput233() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.stat.descriptive.SummaryStatistics", "org.apache.commons.math.stat.descriptive.SummaryStatistics", "setMeanImpl", new String[]{"org.apache.commons.math.stat.descriptive.StorelessUnivariateStatistic"}, new String[]{"<sample:7>"}, false, 0, null, 3);
  assertNull(actual);
  assertEquals("receiver state after the call", "SummaryStatistics:\nn: 0\nmin: NaN\nmax: NaN\nmean: 0.0\ngeometric mean: NaN\nvariance: NaN\nsum of squares: 0.0\nstandard deviation: NaN\nsum of logs: 0.0\n {getGeometricMean=NaN, getMax=NaN, getMean=0.0, getM...#350#-1553279781", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput234() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.stat.descriptive.SummaryStatistics", "org.apache.commons.math.stat.descriptive.SummaryStatistics", "getN", new String[]{}, new String[]{}, false, 1, new String[][]{}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Long", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "SummaryStatistics:\nn: 0\nmin: NaN\nmax: NaN\nmean: NaN\ngeometric mean: NaN\nvariance: NaN\nsum of squares: 0.0\nstandard deviation: NaN\nsum of logs: 0.0\n {getGeometricMean=NaN, getMax=NaN, getMean=NaN, getM...#350#2146862523", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput235() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.stat.descriptive.SummaryStatistics", "org.apache.commons.math.stat.descriptive.SummaryStatistics", "getSumOfLogs", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.math.stat.descriptive.SummaryStatistics", "setSumLogImpl", "org.apache.commons.math.stat.descriptive.StorelessUnivariateStatistic", "<sample:7>"}});
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("0.0", String.valueOf(actual));
  assertEquals("receiver state after the call", "SummaryStatistics:\nn: 0\nmin: NaN\nmax: NaN\nmean: NaN\ngeometric mean: 1.0\nvariance: NaN\nsum of squares: 0.0\nstandard deviation: NaN\nsum of logs: 0.0\n {getGeometricMean=1.0, getMax=NaN, getMean=NaN, getM...#350#20795403", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput236() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.stat.descriptive.SummaryStatistics", "org.apache.commons.math.stat.descriptive.SummaryStatistics", "getMin", new String[]{}, new String[]{}, false, 4, new String[][]{{"org.apache.commons.math.stat.descriptive.SummaryStatistics", "getMaxImpl", ""}, {"org.apache.commons.math.stat.descriptive.SummaryStatistics", "getSummary", ""}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("NaN", String.valueOf(actual));
  assertEquals("receiver state after the call", "SummaryStatistics:\nn: 0\nmin: NaN\nmax: NaN\nmean: NaN\ngeometric mean: NaN\nvariance: NaN\nsum of squares: 0.0\nstandard deviation: NaN\nsum of logs: 0.0\n {getGeometricMean=NaN, getMax=NaN, getMean=NaN, getM...#350#2146862523", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput237() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.stat.descriptive.SummaryStatistics", "org.apache.commons.math.stat.descriptive.SummaryStatistics", "setSumLogImpl", new String[]{"org.apache.commons.math.stat.descriptive.StorelessUnivariateStatistic"}, new String[]{"<sample:2>"}, false);
  assertNull(actual);
  assertEquals("receiver state after the call", "SummaryStatistics:\nn: 0\nmin: NaN\nmax: NaN\nmean: NaN\ngeometric mean: NaN\nvariance: NaN\nsum of squares: 0.0\nstandard deviation: NaN\nsum of logs: 0.0\n {getGeometricMean=NaN, getMax=NaN, getMean=NaN, getM...#350#2146862523", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput238() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.stat.descriptive.SummaryStatistics", "org.apache.commons.math.stat.descriptive.SummaryStatistics", "getMin", new String[]{}, new String[]{}, false, 14, new String[][]{{"org.apache.commons.math.stat.descriptive.SummaryStatistics", "clear", ""}, {"org.apache.commons.math.stat.descriptive.SummaryStatistics", "getMaxImpl", ""}, {"org.apache.commons.math.stat.descriptive.SummaryStatistics", "setMeanImpl", "org.apache.commons.math.stat.descriptive.StorelessUnivariateStatistic", "<sample:1>"}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("NaN", String.valueOf(actual));
  assertEquals("receiver state after the call", "SummaryStatistics:\nn: 0\nmin: NaN\nmax: NaN\nmean: -1.0\ngeometric mean: NaN\nvariance: NaN\nsum of squares: 0.0\nstandard deviation: NaN\nsum of logs: 0.0\n {getGeometricMean=NaN, getMax=NaN, getMean=-1.0, ge...#352#1693008303", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput239() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.stat.descriptive.SummaryStatistics", "org.apache.commons.math.stat.descriptive.SummaryStatistics", "getMin", new String[]{}, new String[]{}, false, 9, new String[][]{{"org.apache.commons.math.stat.descriptive.SummaryStatistics", "getGeoMeanImpl", ""}, {"org.apache.commons.math.stat.descriptive.SummaryStatistics", "clear", ""}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("NaN", String.valueOf(actual));
  assertEquals("receiver state after the call", "SummaryStatistics:\nn: 0\nmin: NaN\nmax: NaN\nmean: NaN\ngeometric mean: NaN\nvariance: NaN\nsum of squares: 0.0\nstandard deviation: NaN\nsum of logs: 0.0\n {getGeometricMean=NaN, getMax=NaN, getMean=NaN, getM...#350#2146862523", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput240() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.stat.descriptive.SummaryStatistics", "org.apache.commons.math.stat.descriptive.SummaryStatistics", "equals", new String[]{"java.lang.Object"}, new String[]{"<sample:1>"}, false, 0, new String[][]{{"org.apache.commons.math.stat.descriptive.SummaryStatistics", "setSumImpl", "org.apache.commons.math.stat.descriptive.StorelessUnivariateStatistic", "<sample:0>"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "SummaryStatistics:\nn: 0\nmin: NaN\nmax: NaN\nmean: NaN\ngeometric mean: NaN\nvariance: NaN\nsum of squares: 0.0\nstandard deviation: NaN\nsum of logs: 0.0\n {getGeometricMean=NaN, getMax=NaN, getMean=NaN, getM...#356#-2113366850", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput241() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.stat.descriptive.SummaryStatistics", "org.apache.commons.math.stat.descriptive.SummaryStatistics", "getPopulationVariance", new String[]{}, new String[]{}, false, 1, new String[][]{{"org.apache.commons.math.stat.descriptive.SummaryStatistics", "getSecondMoment", ""}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("NaN", String.valueOf(actual));
  assertEquals("receiver state after the call", "SummaryStatistics:\nn: 0\nmin: NaN\nmax: NaN\nmean: NaN\ngeometric mean: NaN\nvariance: NaN\nsum of squares: 0.0\nstandard deviation: NaN\nsum of logs: 0.0\n {getGeometricMean=NaN, getMax=NaN, getMean=NaN, getM...#350#2146862523", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput242() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math.stat.descriptive.SummaryStatistics", "org.apache.commons.math.stat.descriptive.SummaryStatistics", "copy", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.math.stat.descriptive.SummaryStatistics", "setMinImpl", "org.apache.commons.math.stat.descriptive.StorelessUnivariateStatistic", "<sample:0>"}}, 3), new String[][]{{"getVarianceImpl", "", "2"}, {"getResult", "", "1"}});
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("NaN", String.valueOf(actual));
  assertEquals("receiver state after the call", "SummaryStatistics:\nn: 0\nmin: -Infinity\nmax: NaN\nmean: NaN\ngeometric mean: NaN\nvariance: NaN\nsum of squares: 0.0\nstandard deviation: NaN\nsum of logs: 0.0\n {getGeometricMean=NaN, getMax=NaN, getMean=NaN...#362#497028975", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput243() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.stat.descriptive.SummaryStatistics", "org.apache.commons.math.stat.descriptive.SummaryStatistics", "equals", new String[]{"java.lang.Object"}, new String[]{"<s:1a>"}, false, 5, new String[][]{{"org.apache.commons.math.stat.descriptive.SummaryStatistics", "getStandardDeviation", ""}, {"org.apache.commons.math.stat.descriptive.SummaryStatistics", "toString", ""}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "SummaryStatistics:\nn: 0\nmin: NaN\nmax: NaN\nmean: NaN\ngeometric mean: NaN\nvariance: NaN\nsum of squares: 0.0\nstandard deviation: NaN\nsum of logs: 0.0\n {getGeometricMean=NaN, getMax=NaN, getMean=NaN, getM...#350#2146862523", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput244() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.stat.descriptive.SummaryStatistics", "org.apache.commons.math.stat.descriptive.SummaryStatistics", "getSecondMoment", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.math.stat.descriptive.SummaryStatistics", "setSumsqImpl", "org.apache.commons.math.stat.descriptive.StorelessUnivariateStatistic", "<sample:6>"}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("NaN", String.valueOf(actual));
  assertEquals("receiver state after the call", "SummaryStatistics:\nn: 0\nmin: NaN\nmax: NaN\nmean: NaN\ngeometric mean: NaN\nvariance: NaN\nsum of squares: NaN\nstandard deviation: NaN\nsum of logs: 0.0\n {getGeometricMean=NaN, getMax=NaN, getMean=NaN, getM...#350#-1265085157", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput245() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.stat.descriptive.SummaryStatistics", "org.apache.commons.math.stat.descriptive.SummaryStatistics", "equals", new String[]{"java.lang.Object"}, new String[]{"<sample:0>"}, false, 5, new String[][]{{"org.apache.commons.math.stat.descriptive.SummaryStatistics", "getStandardDeviation", ""}, {"org.apache.commons.math.stat.descriptive.SummaryStatistics", "toString", ""}, {"org.apache.commons.math.stat.descriptive.SummaryStatistics", "getSumsq", ""}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "SummaryStatistics:\nn: 0\nmin: NaN\nmax: NaN\nmean: NaN\ngeometric mean: NaN\nvariance: NaN\nsum of squares: 0.0\nstandard deviation: NaN\nsum of logs: 0.0\n {getGeometricMean=NaN, getMax=NaN, getMean=NaN, getM...#350#2146862523", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput246() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math.stat.descriptive.SummaryStatistics", "org.apache.commons.math.stat.descriptive.SummaryStatistics", "addValue", new String[]{"double"}, new String[]{"1.7976931348623157E308"}, false, 4, new String[][]{{"org.apache.commons.math.stat.descriptive.SummaryStatistics", "setSumImpl", "org.apache.commons.math.stat.descriptive.StorelessUnivariateStatistic", "<sample:0>"}, {"org.apache.commons.math.stat.descriptive.SummaryStatistics", "getPopulationVariance", ""}, {"org.apache.commons.math.stat.descriptive.SummaryStatistics", "setSumImpl", "org.apache.commons.math.stat.descriptive.StorelessUnivariateStatistic", "<null>"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput247() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.stat.descriptive.SummaryStatistics", "org.apache.commons.math.stat.descriptive.SummaryStatistics", "addValue", new String[]{"double"}, new String[]{"Infinity"}, false, 4, new String[][]{{"org.apache.commons.math.stat.descriptive.SummaryStatistics", "getPopulationVariance", ""}, {"org.apache.commons.math.stat.descriptive.SummaryStatistics", "setSumImpl", "org.apache.commons.math.stat.descriptive.StorelessUnivariateStatistic", "<sample:5>"}}, 3);
  assertNull(actual);
  assertEquals("receiver state after the call", "SummaryStatistics:\nn: 1\nmin: Infinity\nmax: Infinity\nmean: Infinity\ngeometric mean: Infinity\nvariance: 0.0\nsum of squares: Infinity\nstandard deviation: 0.0\nsum of logs: Infinity\n {getGeometricMean=Infi...#416#-911066279", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput248() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.stat.descriptive.SummaryStatistics", "org.apache.commons.math.stat.descriptive.SummaryStatistics", "addValue", new String[]{"double"}, new String[]{"-Infinity"}, false, 4, new String[][]{{"org.apache.commons.math.stat.descriptive.SummaryStatistics", "getPopulationVariance", ""}, {"org.apache.commons.math.stat.descriptive.SummaryStatistics", "setSumImpl", "org.apache.commons.math.stat.descriptive.StorelessUnivariateStatistic", "<sample:5>"}}, 3);
  assertNull(actual);
  assertEquals("receiver state after the call", "SummaryStatistics:\nn: 1\nmin: -Infinity\nmax: -Infinity\nmean: -Infinity\ngeometric mean: NaN\nvariance: 0.0\nsum of squares: Infinity\nstandard deviation: 0.0\nsum of logs: NaN\n {getGeometricMean=NaN, getMax...#402#-2097363717", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput249() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math.stat.descriptive.SummaryStatistics", "org.apache.commons.math.stat.descriptive.SummaryStatistics", "getMeanImpl", new String[]{}, new String[]{}, false), new String[][]{{"clear", "", "0"}, {"evaluate", "double[],int,int", "7"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("org.apache.commons.math.exception.NumberIsTooLargeException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput250() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.stat.descriptive.SummaryStatistics", "org.apache.commons.math.stat.descriptive.SummaryStatistics", "addValue", new String[]{"double"}, new String[]{"Infinity"}, false, 13, new String[][]{{"org.apache.commons.math.stat.descriptive.SummaryStatistics", "getSecondMoment", ""}}, 3);
  assertNull(actual);
  assertEquals("receiver state after the call", "SummaryStatistics:\nn: 1\nmin: Infinity\nmax: Infinity\nmean: Infinity\ngeometric mean: Infinity\nvariance: 0.0\nsum of squares: Infinity\nstandard deviation: 0.0\nsum of logs: Infinity\n {getGeometricMean=Infi...#415#-170326978", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput251() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.stat.descriptive.SummaryStatistics", "org.apache.commons.math.stat.descriptive.SummaryStatistics", "addValue", new String[]{"double"}, new String[]{"0.9999999999999999"}, false, 13, new String[][]{}, 3);
  assertNull(actual);
  assertEquals("receiver state after the call", "SummaryStatistics:\nn: 1\nmin: 0.9999999999999999\nmax: 0.9999999999999999\nmean: 0.9999999999999999\ngeometric mean: 0.9999999999999999\nvariance: 0.0\nsum of squares: 0.9999999999999998\nstandard deviation:...#555#1942552723", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput252() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.stat.descriptive.SummaryStatistics", "org.apache.commons.math.stat.descriptive.SummaryStatistics", "addValue", new String[]{"double"}, new String[]{"5.1000000000000005"}, false, 13, new String[][]{}, 3);
  assertNull(actual);
  assertEquals("receiver state after the call", "SummaryStatistics:\nn: 1\nmin: 5.1000000000000005\nmax: 5.1000000000000005\nmean: 5.1000000000000005\ngeometric mean: 5.1000000000000005\nvariance: 0.0\nsum of squares: 26.010000000000005\nstandard deviation:...#545#1763337014", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput253() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.stat.descriptive.SummaryStatistics", "org.apache.commons.math.stat.descriptive.SummaryStatistics", "getMin", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.math.stat.descriptive.SummaryStatistics", "addValue", "double", "NaN"}, {"org.apache.commons.math.stat.descriptive.SummaryStatistics", "addValue", "double", "Infinity"}});
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("Infinity", String.valueOf(actual));
  assertEquals("receiver state after the call", "SummaryStatistics:\nn: 2\nmin: Infinity\nmax: Infinity\nmean: NaN\ngeometric mean: NaN\nvariance: NaN\nsum of squares: NaN\nstandard deviation: NaN\nsum of logs: NaN\n {getGeometricMean=NaN, getMax=Infinity, ge...#370#-1160737498", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput254() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.stat.descriptive.SummaryStatistics", "org.apache.commons.math.stat.descriptive.SummaryStatistics", "setMaxImpl", new String[]{"org.apache.commons.math.stat.descriptive.StorelessUnivariateStatistic"}, new String[]{"<sample:0>"}, false, 11, new String[][]{{"org.apache.commons.math.stat.descriptive.SummaryStatistics", "getSumImpl", ""}}, 3);
  assertNull(actual);
  assertEquals("receiver state after the call", "SummaryStatistics:\nn: 0\nmin: NaN\nmax: -Infinity\nmean: NaN\ngeometric mean: NaN\nvariance: NaN\nsum of squares: 0.0\nstandard deviation: NaN\nsum of logs: 0.0\n {getGeometricMean=NaN, getMax=-Infinity, getMe...#362#441961607", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput255() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.stat.descriptive.SummaryStatistics", "org.apache.commons.math.stat.descriptive.SummaryStatistics", "setMaxImpl", new String[]{"org.apache.commons.math.stat.descriptive.StorelessUnivariateStatistic"}, new String[]{"<sample:7>"}, false, 10, new String[][]{{"org.apache.commons.math.stat.descriptive.SummaryStatistics", "getN", ""}, {"org.apache.commons.math.stat.descriptive.SummaryStatistics", "getSumOfLogs", ""}}, 3);
  assertNull(actual);
  assertEquals("receiver state after the call", "SummaryStatistics:\nn: 0\nmin: NaN\nmax: 0.0\nmean: NaN\ngeometric mean: NaN\nvariance: NaN\nsum of squares: 0.0\nstandard deviation: NaN\nsum of logs: 0.0\n {getGeometricMean=NaN, getMax=0.0, getMean=NaN, getM...#350#220768717", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput256() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.stat.descriptive.SummaryStatistics", "org.apache.commons.math.stat.descriptive.SummaryStatistics", "setMaxImpl", new String[]{"org.apache.commons.math.stat.descriptive.StorelessUnivariateStatistic"}, new String[]{"<sample:1>"}, false, 9, new String[][]{{"org.apache.commons.math.stat.descriptive.SummaryStatistics", "getMean", ""}, {"org.apache.commons.math.stat.descriptive.SummaryStatistics", "toString", ""}, {"org.apache.commons.math.stat.descriptive.SummaryStatistics", "getMinImpl", ""}}, 3);
  assertNull(actual);
  assertEquals("receiver state after the call", "SummaryStatistics:\nn: 0\nmin: NaN\nmax: -1.0\nmean: NaN\ngeometric mean: NaN\nvariance: NaN\nsum of squares: 0.0\nstandard deviation: NaN\nsum of logs: 0.0\n {getGeometricMean=NaN, getMax=-1.0, getMean=NaN, ge...#352#-1024419709", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput257() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math.stat.descriptive.SummaryStatistics", "org.apache.commons.math.stat.descriptive.SummaryStatistics", "setMaxImpl", new String[]{"org.apache.commons.math.stat.descriptive.StorelessUnivariateStatistic"}, new String[]{"<sample:1>"}, false, 9, new String[][]{{"org.apache.commons.math.stat.descriptive.SummaryStatistics", "getMean", ""}, {"org.apache.commons.math.stat.descriptive.SummaryStatistics", "getMinImpl", ""}, {"org.apache.commons.math.stat.descriptive.SummaryStatistics", "addValue", "double", "-1.0"}}, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("org.apache.commons.math.exception.MathIllegalStateException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput258() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.stat.descriptive.SummaryStatistics", "org.apache.commons.math.stat.descriptive.SummaryStatistics", "getVarianceImpl", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.math.stat.descriptive.SummaryStatistics", "setSumImpl", "org.apache.commons.math.stat.descriptive.StorelessUnivariateStatistic", "<null>"}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.math.stat.descriptive.moment.Variance", actual.getClass().getName());
  assertEquals("{getData=null, getN=0, getResult=NaN, isBiasCorrected=true}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "SummaryStatistics:\nn: 0\nmin: NaN\nmax: NaN\nmean: NaN\ngeometric mean: NaN\nvariance: NaN\nsum of squares: 0.0\nstandard deviation: NaN\nsum of logs: 0.0\n {getGeometricMean=NaN, getMax=NaN, getMean=NaN, getM...#368#-1327726461", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput259() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.stat.descriptive.SummaryStatistics", "org.apache.commons.math.stat.descriptive.SummaryStatistics", "getVarianceImpl", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.math.stat.descriptive.SummaryStatistics", "setSumImpl", "org.apache.commons.math.stat.descriptive.StorelessUnivariateStatistic", "<sample:3>"}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.math.stat.descriptive.moment.Variance", actual.getClass().getName());
  assertEquals("{getData=null, getN=0, getResult=NaN, isBiasCorrected=true}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "SummaryStatistics:\nn: 0\nmin: NaN\nmax: NaN\nmean: NaN\ngeometric mean: NaN\nvariance: NaN\nsum of squares: 0.0\nstandard deviation: NaN\nsum of logs: 0.0\n {getGeometricMean=NaN, getMax=NaN, getMean=NaN, getM...#350#221329212", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput260() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math.stat.descriptive.SummaryStatistics", "org.apache.commons.math.stat.descriptive.SummaryStatistics", "getVarianceImpl", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.math.stat.descriptive.SummaryStatistics", "setSumImpl", "org.apache.commons.math.stat.descriptive.StorelessUnivariateStatistic", "<sample:3>"}}), new String[][]{{"setData", "double[],int,int", "1"}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.math.stat.descriptive.moment.Variance", actual.getClass().getName());
  assertEquals("{getData=[0.0], getN=0, getResult=NaN, isBiasCorrected=true}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "SummaryStatistics:\nn: 0\nmin: NaN\nmax: NaN\nmean: NaN\ngeometric mean: NaN\nvariance: NaN\nsum of squares: 0.0\nstandard deviation: NaN\nsum of logs: 0.0\n {getGeometricMean=NaN, getMax=NaN, getMean=NaN, getM...#350#221329212", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput261() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.stat.descriptive.SummaryStatistics", "org.apache.commons.math.stat.descriptive.SummaryStatistics", "getVariance", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.math.stat.descriptive.SummaryStatistics", "getVarianceImpl", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("NaN", String.valueOf(actual));
  assertEquals("receiver state after the call", "SummaryStatistics:\nn: 0\nmin: NaN\nmax: NaN\nmean: NaN\ngeometric mean: NaN\nvariance: NaN\nsum of squares: 0.0\nstandard deviation: NaN\nsum of logs: 0.0\n {getGeometricMean=NaN, getMax=NaN, getMean=NaN, getM...#350#2146862523", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput262() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.stat.descriptive.SummaryStatistics", "org.apache.commons.math.stat.descriptive.SummaryStatistics", "hashCode", new String[]{}, new String[]{}, false, 12, new String[][]{{"org.apache.commons.math.stat.descriptive.SummaryStatistics", "getN", ""}, {"org.apache.commons.math.stat.descriptive.SummaryStatistics", "setMaxImpl", "org.apache.commons.math.stat.descriptive.StorelessUnivariateStatistic", "<sample:3>"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("-1607372513", String.valueOf(actual));
  assertEquals("receiver state after the call", "SummaryStatistics:\nn: 0\nmin: NaN\nmax: 1.0\nmean: NaN\ngeometric mean: NaN\nvariance: NaN\nsum of squares: 0.0\nstandard deviation: NaN\nsum of logs: 0.0\n {getGeometricMean=NaN, getMax=1.0, getMean=NaN, getM...#350#-50555381", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput263() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.stat.descriptive.SummaryStatistics", "org.apache.commons.math.stat.descriptive.SummaryStatistics", "hashCode", new String[]{}, new String[]{}, false, 12, new String[][]{{"org.apache.commons.math.stat.descriptive.SummaryStatistics", "getN", ""}, {"org.apache.commons.math.stat.descriptive.SummaryStatistics", "setMaxImpl", "org.apache.commons.math.stat.descriptive.StorelessUnivariateStatistic", "<sample:5>"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("1613852959", String.valueOf(actual));
  assertEquals("receiver state after the call", "SummaryStatistics:\nn: 0\nmin: NaN\nmax: -Infinity\nmean: NaN\ngeometric mean: NaN\nvariance: NaN\nsum of squares: 0.0\nstandard deviation: NaN\nsum of logs: 0.0\n {getGeometricMean=NaN, getMax=-Infinity, getMe...#362#441961607", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput264() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.stat.descriptive.SummaryStatistics", "org.apache.commons.math.stat.descriptive.SummaryStatistics", "hashCode", new String[]{}, new String[]{}, false, 14, new String[][]{{"org.apache.commons.math.stat.descriptive.SummaryStatistics", "getN", ""}, {"org.apache.commons.math.stat.descriptive.SummaryStatistics", "setMaxImpl", "org.apache.commons.math.stat.descriptive.StorelessUnivariateStatistic", "<sample:5>"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("443212473", String.valueOf(actual));
  assertEquals("receiver state after the call", "SummaryStatistics:\nn: 0\nmin: NaN\nmax: -Infinity\nmean: NaN\ngeometric mean: NaN\nvariance: NaN\nsum of squares: 0.0\nstandard deviation: NaN\nsum of logs: 0.0\n {getGeometricMean=NaN, getMax=-Infinity, getMe...#362#441961607", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput265() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.stat.descriptive.SummaryStatistics", "org.apache.commons.math.stat.descriptive.SummaryStatistics", "setVarianceImpl", new String[]{"org.apache.commons.math.stat.descriptive.StorelessUnivariateStatistic"}, new String[]{"<sample:0>"}, false, 7, new String[][]{{"org.apache.commons.math.stat.descriptive.SummaryStatistics", "getMin", ""}, {"org.apache.commons.math.stat.descriptive.SummaryStatistics", "setSumLogImpl", "org.apache.commons.math.stat.descriptive.StorelessUnivariateStatistic", "<sample:5>"}}, 1);
  assertNull(actual);
  assertEquals("receiver state after the call", "SummaryStatistics:\nn: 0\nmin: NaN\nmax: NaN\nmean: NaN\ngeometric mean: 0.0\nvariance: -Infinity\nsum of squares: 0.0\nstandard deviation: NaN\nsum of logs: -Infinity\n {getGeometricMean=0.0, getMax=NaN, getMe...#374#188597087", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput266() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.stat.descriptive.SummaryStatistics", "org.apache.commons.math.stat.descriptive.SummaryStatistics", "setVarianceImpl", new String[]{"org.apache.commons.math.stat.descriptive.StorelessUnivariateStatistic"}, new String[]{"<sample:7>"}, false, 11, new String[][]{{"org.apache.commons.math.stat.descriptive.SummaryStatistics", "getMin", ""}, {"org.apache.commons.math.stat.descriptive.SummaryStatistics", "setSumLogImpl", "org.apache.commons.math.stat.descriptive.StorelessUnivariateStatistic", "<sample:5>"}}, 1);
  assertNull(actual);
  assertEquals("receiver state after the call", "SummaryStatistics:\nn: 0\nmin: NaN\nmax: NaN\nmean: NaN\ngeometric mean: 0.0\nvariance: 0.0\nsum of squares: 0.0\nstandard deviation: NaN\nsum of logs: -Infinity\n {getGeometricMean=0.0, getMax=NaN, getMean=NaN...#362#455383781", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput267() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.stat.descriptive.SummaryStatistics", "org.apache.commons.math.stat.descriptive.SummaryStatistics", "setVarianceImpl", new String[]{"org.apache.commons.math.stat.descriptive.StorelessUnivariateStatistic"}, new String[]{"<sample:0>"}, false, 10, new String[][]{{"org.apache.commons.math.stat.descriptive.SummaryStatistics", "setSumLogImpl", "org.apache.commons.math.stat.descriptive.StorelessUnivariateStatistic", "<sample:3>"}, {"org.apache.commons.math.stat.descriptive.SummaryStatistics", "getVariance", ""}}, 1);
  assertNull(actual);
  assertEquals("receiver state after the call", "SummaryStatistics:\nn: 0\nmin: NaN\nmax: NaN\nmean: NaN\ngeometric mean: 2.718281828459045\nvariance: -Infinity\nsum of squares: 0.0\nstandard deviation: NaN\nsum of logs: 1.0\n {getGeometricMean=2.718281828459...#390#-410207645", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput268() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.stat.descriptive.SummaryStatistics", "org.apache.commons.math.stat.descriptive.SummaryStatistics", "getGeoMeanImpl", new String[]{}, new String[]{}, false, 0, null, 2);
  assertNotNull(actual);
  assertEquals("org.apache.commons.math.stat.descriptive.moment.GeometricMean", actual.getClass().getName());
  assertEquals("{getData=null, getN=0, getResult=NaN}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "SummaryStatistics:\nn: 0\nmin: NaN\nmax: NaN\nmean: NaN\ngeometric mean: NaN\nvariance: NaN\nsum of squares: 0.0\nstandard deviation: NaN\nsum of logs: 0.0\n {getGeometricMean=NaN, getMax=NaN, getMean=NaN, getM...#350#2146862523", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput269() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.stat.descriptive.SummaryStatistics", "org.apache.commons.math.stat.descriptive.SummaryStatistics", "setVarianceImpl", new String[]{"org.apache.commons.math.stat.descriptive.StorelessUnivariateStatistic"}, new String[]{"<sample:3>"}, false, 10, new String[][]{{"org.apache.commons.math.stat.descriptive.SummaryStatistics", "setSumLogImpl", "org.apache.commons.math.stat.descriptive.StorelessUnivariateStatistic", "<sample:3>"}, {"org.apache.commons.math.stat.descriptive.SummaryStatistics", "getVariance", ""}}, 1);
  assertNull(actual);
  assertEquals("receiver state after the call", "SummaryStatistics:\nn: 0\nmin: NaN\nmax: NaN\nmean: NaN\ngeometric mean: 2.718281828459045\nvariance: 1.0\nsum of squares: 0.0\nstandard deviation: NaN\nsum of logs: 1.0\n {getGeometricMean=2.718281828459045, g...#378#-1151503705", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput270() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.stat.descriptive.SummaryStatistics", "org.apache.commons.math.stat.descriptive.SummaryStatistics", "getSumsq", new String[]{}, new String[]{}, false, 14, new String[][]{{"org.apache.commons.math.stat.descriptive.SummaryStatistics", "setMinImpl", "org.apache.commons.math.stat.descriptive.StorelessUnivariateStatistic", "<sample:2>"}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("0.0", String.valueOf(actual));
  assertEquals("receiver state after the call", "SummaryStatistics:\nn: 0\nmin: 0.0\nmax: NaN\nmean: NaN\ngeometric mean: NaN\nvariance: NaN\nsum of squares: 0.0\nstandard deviation: NaN\nsum of logs: 0.0\n {getGeometricMean=NaN, getMax=NaN, getMean=NaN, getM...#350#-1067426903", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput271() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.stat.descriptive.SummaryStatistics", "org.apache.commons.math.stat.descriptive.SummaryStatistics", "getSumsq", new String[]{}, new String[]{}, false, 14, new String[][]{{"org.apache.commons.math.stat.descriptive.SummaryStatistics", "setMinImpl", "org.apache.commons.math.stat.descriptive.StorelessUnivariateStatistic", "<sample:5>"}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("0.0", String.valueOf(actual));
  assertEquals("receiver state after the call", "SummaryStatistics:\nn: 0\nmin: -Infinity\nmax: NaN\nmean: NaN\ngeometric mean: NaN\nvariance: NaN\nsum of squares: 0.0\nstandard deviation: NaN\nsum of logs: 0.0\n {getGeometricMean=NaN, getMax=NaN, getMean=NaN...#362#497028975", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput272() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.stat.descriptive.SummaryStatistics", "org.apache.commons.math.stat.descriptive.SummaryStatistics", "copy", new String[]{"org.apache.commons.math.stat.descriptive.SummaryStatistics", "org.apache.commons.math.stat.descriptive.SummaryStatistics"}, new String[]{"<sample:2>", "<sample:5>"}, true, 0, null, 1);
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput273() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.stat.descriptive.SummaryStatistics", "org.apache.commons.math.stat.descriptive.SummaryStatistics", "setMinImpl", new String[]{"org.apache.commons.math.stat.descriptive.StorelessUnivariateStatistic"}, new String[]{"<sample:5>"}, false);
  assertNull(actual);
  assertEquals("receiver state after the call", "SummaryStatistics:\nn: 0\nmin: -Infinity\nmax: NaN\nmean: NaN\ngeometric mean: NaN\nvariance: NaN\nsum of squares: 0.0\nstandard deviation: NaN\nsum of logs: 0.0\n {getGeometricMean=NaN, getMax=NaN, getMean=NaN...#362#497028975", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput274() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.stat.descriptive.SummaryStatistics", "org.apache.commons.math.stat.descriptive.SummaryStatistics", "getMax", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.math.stat.descriptive.SummaryStatistics", "getMaxImpl", ""}, {"org.apache.commons.math.stat.descriptive.SummaryStatistics", "setMinImpl", "org.apache.commons.math.stat.descriptive.StorelessUnivariateStatistic", "<sample:7>"}});
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("NaN", String.valueOf(actual));
  assertEquals("receiver state after the call", "SummaryStatistics:\nn: 0\nmin: 0.0\nmax: NaN\nmean: NaN\ngeometric mean: NaN\nvariance: NaN\nsum of squares: 0.0\nstandard deviation: NaN\nsum of logs: 0.0\n {getGeometricMean=NaN, getMax=NaN, getMean=NaN, getM...#350#-1067426903", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput275() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.stat.descriptive.SummaryStatistics", "org.apache.commons.math.stat.descriptive.SummaryStatistics", "getMin", new String[]{}, new String[]{}, false, 1, new String[][]{{"org.apache.commons.math.stat.descriptive.SummaryStatistics", "setSumImpl", "org.apache.commons.math.stat.descriptive.StorelessUnivariateStatistic", "<sample:6>"}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("NaN", String.valueOf(actual));
  assertEquals("receiver state after the call", "SummaryStatistics:\nn: 0\nmin: NaN\nmax: NaN\nmean: NaN\ngeometric mean: NaN\nvariance: NaN\nsum of squares: 0.0\nstandard deviation: NaN\nsum of logs: 0.0\n {getGeometricMean=NaN, getMax=NaN, getMean=NaN, getM...#350#424382564", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput276() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.stat.descriptive.SummaryStatistics", "org.apache.commons.math.stat.descriptive.SummaryStatistics", "getMin", new String[]{}, new String[]{}, false, 1, new String[][]{{"org.apache.commons.math.stat.descriptive.SummaryStatistics", "setSumImpl", "org.apache.commons.math.stat.descriptive.StorelessUnivariateStatistic", "<sample:3>"}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("NaN", String.valueOf(actual));
  assertEquals("receiver state after the call", "SummaryStatistics:\nn: 0\nmin: NaN\nmax: NaN\nmean: NaN\ngeometric mean: NaN\nvariance: NaN\nsum of squares: 0.0\nstandard deviation: NaN\nsum of logs: 0.0\n {getGeometricMean=NaN, getMax=NaN, getMean=NaN, getM...#350#221329212", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput277() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.stat.descriptive.SummaryStatistics", "org.apache.commons.math.stat.descriptive.SummaryStatistics", "getMin", new String[]{}, new String[]{}, false, 1, new String[][]{{"org.apache.commons.math.stat.descriptive.SummaryStatistics", "setSumImpl", "org.apache.commons.math.stat.descriptive.StorelessUnivariateStatistic", "<sample:3>"}});
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("NaN", String.valueOf(actual));
  assertEquals("receiver state after the call", "SummaryStatistics:\nn: 0\nmin: NaN\nmax: NaN\nmean: NaN\ngeometric mean: NaN\nvariance: NaN\nsum of squares: 0.0\nstandard deviation: NaN\nsum of logs: 0.0\n {getGeometricMean=NaN, getMax=NaN, getMean=NaN, getM...#350#221329212", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput278() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.stat.descriptive.SummaryStatistics", "org.apache.commons.math.stat.descriptive.SummaryStatistics", "getMin", new String[]{}, new String[]{}, false, 1, new String[][]{{"org.apache.commons.math.stat.descriptive.SummaryStatistics", "setSumImpl", "org.apache.commons.math.stat.descriptive.StorelessUnivariateStatistic", "<sample:4>"}});
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("NaN", String.valueOf(actual));
  assertEquals("receiver state after the call", "SummaryStatistics:\nn: 0\nmin: NaN\nmax: NaN\nmean: NaN\ngeometric mean: NaN\nvariance: NaN\nsum of squares: 0.0\nstandard deviation: NaN\nsum of logs: 0.0\n {getGeometricMean=NaN, getMax=NaN, getMean=NaN, getM...#350#424382564", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput279() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.stat.descriptive.SummaryStatistics", "org.apache.commons.math.stat.descriptive.SummaryStatistics", "getMin", new String[]{}, new String[]{}, false, 1, new String[][]{{"org.apache.commons.math.stat.descriptive.SummaryStatistics", "setMeanImpl", "org.apache.commons.math.stat.descriptive.StorelessUnivariateStatistic", "<sample:2>"}});
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("NaN", String.valueOf(actual));
  assertEquals("receiver state after the call", "SummaryStatistics:\nn: 0\nmin: NaN\nmax: NaN\nmean: 0.0\ngeometric mean: NaN\nvariance: NaN\nsum of squares: 0.0\nstandard deviation: NaN\nsum of logs: 0.0\n {getGeometricMean=NaN, getMax=NaN, getMean=0.0, getM...#350#-1553279781", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput280() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.stat.descriptive.SummaryStatistics", "org.apache.commons.math.stat.descriptive.SummaryStatistics", "getMin", new String[]{}, new String[]{}, false, 1, new String[][]{{"org.apache.commons.math.stat.descriptive.SummaryStatistics", "addValue", "double", "0.9999999999999999"}});
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("0.9999999999999999", String.valueOf(actual));
  assertEquals("receiver state after the call", "SummaryStatistics:\nn: 1\nmin: 0.9999999999999999\nmax: 0.9999999999999999\nmean: 0.9999999999999999\ngeometric mean: 0.9999999999999999\nvariance: 0.0\nsum of squares: 0.9999999999999998\nstandard deviation:...#555#1942552723", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput281() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.stat.descriptive.SummaryStatistics", "org.apache.commons.math.stat.descriptive.SummaryStatistics", "getMin", new String[]{}, new String[]{}, false, 1, new String[][]{{"org.apache.commons.math.stat.descriptive.SummaryStatistics", "addValue", "double", "1.9999999999999998"}});
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("1.9999999999999998", String.valueOf(actual));
  assertEquals("receiver state after the call", "SummaryStatistics:\nn: 1\nmin: 1.9999999999999998\nmax: 1.9999999999999998\nmean: 1.9999999999999998\ngeometric mean: 1.9999999999999998\nvariance: 0.0\nsum of squares: 3.999999999999999\nstandard deviation: ...#543#395848475", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput282() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.stat.descriptive.SummaryStatistics", "org.apache.commons.math.stat.descriptive.SummaryStatistics", "getMin", new String[]{}, new String[]{}, false, 1, new String[][]{{"org.apache.commons.math.stat.descriptive.SummaryStatistics", "addValue", "double", "5.0"}});
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("5.0", String.valueOf(actual));
  assertEquals("receiver state after the call", "SummaryStatistics:\nn: 1\nmin: 5.0\nmax: 5.0\nmean: 5.0\ngeometric mean: 4.999999999999999\nvariance: 0.0\nsum of squares: 25.0\nstandard deviation: 0.0\nsum of logs: 1.6094379124341003\n {getGeometricMean=4.99...#410#-13979454", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput283() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.stat.descriptive.SummaryStatistics", "org.apache.commons.math.stat.descriptive.SummaryStatistics", "getMin", new String[]{}, new String[]{}, false, 1, new String[][]{{"org.apache.commons.math.stat.descriptive.SummaryStatistics", "addValue", "double", "-1.7976931348623157E308"}});
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("-1.7976931348623157E308", String.valueOf(actual));
  assertEquals("receiver state after the call", "SummaryStatistics:\nn: 1\nmin: -1.7976931348623157E308\nmax: -1.7976931348623157E308\nmean: -1.7976931348623157E308\ngeometric mean: NaN\nvariance: 0.0\nsum of squares: Infinity\nstandard deviation: 0.0\nsum o...#500#705366924", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput284() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.stat.descriptive.SummaryStatistics", "org.apache.commons.math.stat.descriptive.SummaryStatistics", "setGeoMeanImpl", new String[]{"org.apache.commons.math.stat.descriptive.StorelessUnivariateStatistic"}, new String[]{"<sample:3>"}, false, 0, new String[][]{{"org.apache.commons.math.stat.descriptive.SummaryStatistics", "setMinImpl", "org.apache.commons.math.stat.descriptive.StorelessUnivariateStatistic", "<sample:2>"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "SummaryStatistics:\nn: 0\nmin: 0.0\nmax: NaN\nmean: NaN\ngeometric mean: 1.0\nvariance: NaN\nsum of squares: 0.0\nstandard deviation: NaN\nsum of logs: 0.0\n {getGeometricMean=1.0, getMax=NaN, getMean=NaN, getM...#350#1101473273", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput285() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.stat.descriptive.SummaryStatistics", "org.apache.commons.math.stat.descriptive.SummaryStatistics", "getSummary", new String[]{}, new String[]{}, false, 0, null, 2);
  assertNotNull(actual);
  assertEquals("org.apache.commons.math.stat.descriptive.StatisticalSummaryValues", actual.getClass().getName());
  assertEquals("StatisticalSummaryValues:\nn: 0\nmin: NaN\nmax: NaN\nmean: NaN\nstd dev: NaN\nvariance: NaN\nsum: 0.0\n {getMax=NaN, getMean=NaN, getMin=NaN, getN=0, getStandardDeviation=NaN, getSum=0.0, getVariance=NaN}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "SummaryStatistics:\nn: 0\nmin: NaN\nmax: NaN\nmean: NaN\ngeometric mean: NaN\nvariance: NaN\nsum of squares: 0.0\nstandard deviation: NaN\nsum of logs: 0.0\n {getGeometricMean=NaN, getMax=NaN, getMean=NaN, getM...#350#2146862523", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput286() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.stat.descriptive.SummaryStatistics", "org.apache.commons.math.stat.descriptive.SummaryStatistics", "getSecondMoment", new String[]{}, new String[]{}, false, 3, new String[][]{{"org.apache.commons.math.stat.descriptive.SummaryStatistics", "equals", "java.lang.Object", "<sample:0>"}, {"org.apache.commons.math.stat.descriptive.SummaryStatistics", "setVarianceImpl", "org.apache.commons.math.stat.descriptive.StorelessUnivariateStatistic", "<sample:6>"}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("NaN", String.valueOf(actual));
  assertEquals("receiver state after the call", "SummaryStatistics:\nn: 0\nmin: NaN\nmax: NaN\nmean: NaN\ngeometric mean: NaN\nvariance: NaN\nsum of squares: 0.0\nstandard deviation: NaN\nsum of logs: 0.0\n {getGeometricMean=NaN, getMax=NaN, getMean=NaN, getM...#350#2146862523", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput287() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.stat.descriptive.SummaryStatistics", "org.apache.commons.math.stat.descriptive.SummaryStatistics", "getSecondMoment", new String[]{}, new String[]{}, false, 3, new String[][]{{"org.apache.commons.math.stat.descriptive.SummaryStatistics", "equals", "java.lang.Object", "<sample:0>"}, {"org.apache.commons.math.stat.descriptive.SummaryStatistics", "setVarianceImpl", "org.apache.commons.math.stat.descriptive.StorelessUnivariateStatistic", "<sample:7>"}, {"org.apache.commons.math.stat.descriptive.SummaryStatistics", "getVarianceImpl", ""}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("NaN", String.valueOf(actual));
  assertEquals("receiver state after the call", "SummaryStatistics:\nn: 0\nmin: NaN\nmax: NaN\nmean: NaN\ngeometric mean: NaN\nvariance: 0.0\nsum of squares: 0.0\nstandard deviation: NaN\nsum of logs: 0.0\n {getGeometricMean=NaN, getMax=NaN, getMean=NaN, getM...#350#-507461555", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput288() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.stat.descriptive.SummaryStatistics", "org.apache.commons.math.stat.descriptive.SummaryStatistics", "getSecondMoment", new String[]{}, new String[]{}, false, 14, new String[][]{{"org.apache.commons.math.stat.descriptive.SummaryStatistics", "setSumLogImpl", "org.apache.commons.math.stat.descriptive.StorelessUnivariateStatistic", "<sample:0>"}, {"org.apache.commons.math.stat.descriptive.SummaryStatistics", "getN", ""}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("NaN", String.valueOf(actual));
  assertEquals("receiver state after the call", "SummaryStatistics:\nn: 0\nmin: NaN\nmax: NaN\nmean: NaN\ngeometric mean: NaN\nvariance: NaN\nsum of squares: 0.0\nstandard deviation: NaN\nsum of logs: -Infinity\n {getGeometricMean=NaN, getMax=NaN, getMean=NaN...#362#-80285247", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput289() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.stat.descriptive.SummaryStatistics", "org.apache.commons.math.stat.descriptive.SummaryStatistics", "getSecondMoment", new String[]{}, new String[]{}, false, 16, new String[][]{{"org.apache.commons.math.stat.descriptive.SummaryStatistics", "addValue", "double", "NaN"}, {"org.apache.commons.math.stat.descriptive.SummaryStatistics", "setSumLogImpl", "org.apache.commons.math.stat.descriptive.StorelessUnivariateStatistic", "<sample:0>"}, {"org.apache.commons.math.stat.descriptive.SummaryStatistics", "getN", ""}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("NaN", String.valueOf(actual));
  assertEquals("receiver state after the call", "SummaryStatistics:\nn: 1\nmin: NaN\nmax: NaN\nmean: NaN\ngeometric mean: NaN\nvariance: 0.0\nsum of squares: NaN\nstandard deviation: 0.0\nsum of logs: NaN\n {getGeometricMean=NaN, getMax=NaN, getMean=NaN, getM...#350#-742111247", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput290() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.stat.descriptive.SummaryStatistics", "org.apache.commons.math.stat.descriptive.SummaryStatistics", "getSecondMoment", new String[]{}, new String[]{}, false, 25, new String[][]{{"org.apache.commons.math.stat.descriptive.SummaryStatistics", "setSumImpl", "org.apache.commons.math.stat.descriptive.StorelessUnivariateStatistic", "<sample:5>"}, {"org.apache.commons.math.stat.descriptive.SummaryStatistics", "setMinImpl", "org.apache.commons.math.stat.descriptive.StorelessUnivariateStatistic", "<sample:6>"}});
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("NaN", String.valueOf(actual));
  assertEquals("receiver state after the call", "SummaryStatistics:\nn: 0\nmin: NaN\nmax: NaN\nmean: NaN\ngeometric mean: NaN\nvariance: NaN\nsum of squares: 0.0\nstandard deviation: NaN\nsum of logs: 0.0\n {getGeometricMean=NaN, getMax=NaN, getMean=NaN, getM...#356#-2113366850", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput291() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.stat.descriptive.SummaryStatistics", "org.apache.commons.math.stat.descriptive.SummaryStatistics", "getSecondMoment", new String[]{}, new String[]{}, false, 8, new String[][]{{"org.apache.commons.math.stat.descriptive.SummaryStatistics", "setSumLogImpl", "org.apache.commons.math.stat.descriptive.StorelessUnivariateStatistic", "<sample:0>"}, {"org.apache.commons.math.stat.descriptive.SummaryStatistics", "setGeoMeanImpl", "org.apache.commons.math.stat.descriptive.StorelessUnivariateStatistic", "<null>"}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("NaN", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput292() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.stat.descriptive.SummaryStatistics", "org.apache.commons.math.stat.descriptive.SummaryStatistics", "getSecondMoment", new String[]{}, new String[]{}, false, 8, new String[][]{{"org.apache.commons.math.stat.descriptive.SummaryStatistics", "setSumLogImpl", "org.apache.commons.math.stat.descriptive.StorelessUnivariateStatistic", "<sample:0>"}, {"org.apache.commons.math.stat.descriptive.SummaryStatistics", "setGeoMeanImpl", "org.apache.commons.math.stat.descriptive.StorelessUnivariateStatistic", "<sample:0>"}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("NaN", String.valueOf(actual));
  assertEquals("receiver state after the call", "SummaryStatistics:\nn: 0\nmin: NaN\nmax: NaN\nmean: NaN\ngeometric mean: -Infinity\nvariance: NaN\nsum of squares: 0.0\nstandard deviation: NaN\nsum of logs: -Infinity\n {getGeometricMean=-Infinity, getMax=NaN,...#374#-1984176115", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput293() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.stat.descriptive.SummaryStatistics", "org.apache.commons.math.stat.descriptive.SummaryStatistics", "getSecondMoment", new String[]{}, new String[]{}, false, 10, new String[][]{{"org.apache.commons.math.stat.descriptive.SummaryStatistics", "setSumLogImpl", "org.apache.commons.math.stat.descriptive.StorelessUnivariateStatistic", "<sample:0>"}, {"org.apache.commons.math.stat.descriptive.SummaryStatistics", "setGeoMeanImpl", "org.apache.commons.math.stat.descriptive.StorelessUnivariateStatistic", "<sample:6>"}, {"org.apache.commons.math.stat.descriptive.SummaryStatistics", "getMeanImpl", ""}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("NaN", String.valueOf(actual));
  assertEquals("receiver state after the call", "SummaryStatistics:\nn: 0\nmin: NaN\nmax: NaN\nmean: NaN\ngeometric mean: NaN\nvariance: NaN\nsum of squares: 0.0\nstandard deviation: NaN\nsum of logs: -Infinity\n {getGeometricMean=NaN, getMax=NaN, getMean=NaN...#362#-80285247", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput294() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.stat.descriptive.SummaryStatistics", "org.apache.commons.math.stat.descriptive.SummaryStatistics", "getSecondMoment", new String[]{}, new String[]{}, false, 17, new String[][]{{"org.apache.commons.math.stat.descriptive.SummaryStatistics", "setSumLogImpl", "org.apache.commons.math.stat.descriptive.StorelessUnivariateStatistic", "<sample:0>"}, {"org.apache.commons.math.stat.descriptive.SummaryStatistics", "setGeoMeanImpl", "org.apache.commons.math.stat.descriptive.StorelessUnivariateStatistic", "<sample:3>"}, {"org.apache.commons.math.stat.descriptive.SummaryStatistics", "getMeanImpl", ""}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("NaN", String.valueOf(actual));
  assertEquals("receiver state after the call", "SummaryStatistics:\nn: 0\nmin: NaN\nmax: NaN\nmean: NaN\ngeometric mean: 1.0\nvariance: NaN\nsum of squares: 0.0\nstandard deviation: NaN\nsum of logs: -Infinity\n {getGeometricMean=1.0, getMax=NaN, getMean=NaN...#362#-1034911215", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput295() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.stat.descriptive.SummaryStatistics", "org.apache.commons.math.stat.descriptive.SummaryStatistics", "getSecondMoment", new String[]{}, new String[]{}, false, 18, new String[][]{{"org.apache.commons.math.stat.descriptive.SummaryStatistics", "getMeanImpl", ""}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("NaN", String.valueOf(actual));
  assertEquals("receiver state after the call", "SummaryStatistics:\nn: 0\nmin: NaN\nmax: NaN\nmean: NaN\ngeometric mean: NaN\nvariance: NaN\nsum of squares: 0.0\nstandard deviation: NaN\nsum of logs: 0.0\n {getGeometricMean=NaN, getMax=NaN, getMean=NaN, getM...#350#2146862523", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput296() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math.stat.descriptive.SummaryStatistics", "org.apache.commons.math.stat.descriptive.SummaryStatistics", "getSumLogImpl", new String[]{}, new String[]{}, false), new String[][]{{"incrementAll", "double[]", "5"}, {"increment", "double", "3"}, {"copy", "", "0"}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.math.stat.descriptive.summary.SumOfLogs", actual.getClass().getName());
  assertEquals("{getData=null, getN=4, getResult=NaN}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "SummaryStatistics:\nn: 0\nmin: NaN\nmax: NaN\nmean: NaN\ngeometric mean: NaN\nvariance: NaN\nsum of squares: 0.0\nstandard deviation: NaN\nsum of logs: NaN\n {getGeometricMean=NaN, getMax=NaN, getMean=NaN, getM...#350#-352706035", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput297() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.stat.descriptive.SummaryStatistics", "org.apache.commons.math.stat.descriptive.SummaryStatistics", "getMeanImpl", new String[]{}, new String[]{}, false, 1, new String[][]{{"org.apache.commons.math.stat.descriptive.SummaryStatistics", "setMaxImpl", "org.apache.commons.math.stat.descriptive.StorelessUnivariateStatistic", "<sample:0>"}, {"org.apache.commons.math.stat.descriptive.SummaryStatistics", "getSumsq", ""}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.math.stat.descriptive.moment.Mean", actual.getClass().getName());
  assertEquals("{getData=null, getN=0, getResult=NaN}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "SummaryStatistics:\nn: 0\nmin: NaN\nmax: -Infinity\nmean: NaN\ngeometric mean: NaN\nvariance: NaN\nsum of squares: 0.0\nstandard deviation: NaN\nsum of logs: 0.0\n {getGeometricMean=NaN, getMax=-Infinity, getMe...#362#441961607", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput298() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math.stat.descriptive.SummaryStatistics", "org.apache.commons.math.stat.descriptive.SummaryStatistics", "getMeanImpl", new String[]{}, new String[]{}, false, 1, new String[][]{{"org.apache.commons.math.stat.descriptive.SummaryStatistics", "setMeanImpl", "org.apache.commons.math.stat.descriptive.StorelessUnivariateStatistic", "<sample:1>"}, {"org.apache.commons.math.stat.descriptive.SummaryStatistics", "setMaxImpl", "org.apache.commons.math.stat.descriptive.StorelessUnivariateStatistic", "<sample:0>"}, {"org.apache.commons.math.stat.descriptive.SummaryStatistics", "getSumsq", ""}}), new String[][]{{"increment", "double", "2"}});
  assertNotNull(actual);
  assertEquals("receiver state after the call", "SummaryStatistics:\nn: 0\nmin: NaN\nmax: -Infinity\nmean: -1.0\ngeometric mean: NaN\nvariance: NaN\nsum of squares: 0.0\nstandard deviation: NaN\nsum of logs: 0.0\n {getGeometricMean=NaN, getMax=-Infinity, getM...#364#477395247", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput299() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math.stat.descriptive.SummaryStatistics", "org.apache.commons.math.stat.descriptive.SummaryStatistics", "getMeanImpl", new String[]{}, new String[]{}, false, 1, new String[][]{{"org.apache.commons.math.stat.descriptive.SummaryStatistics", "setMeanImpl", "org.apache.commons.math.stat.descriptive.StorelessUnivariateStatistic", "<sample:1>"}, {"org.apache.commons.math.stat.descriptive.SummaryStatistics", "setMaxImpl", "org.apache.commons.math.stat.descriptive.StorelessUnivariateStatistic", "<sample:0>"}}, 3), new String[][]{{"increment", "double", "2"}});
  assertNotNull(actual);
  assertEquals("receiver state after the call", "SummaryStatistics:\nn: 0\nmin: NaN\nmax: -Infinity\nmean: -1.0\ngeometric mean: NaN\nvariance: NaN\nsum of squares: 0.0\nstandard deviation: NaN\nsum of logs: 0.0\n {getGeometricMean=NaN, getMax=-Infinity, getM...#364#477395247", SearchInputFactory_scaffolding.receiverState());
 }
}
