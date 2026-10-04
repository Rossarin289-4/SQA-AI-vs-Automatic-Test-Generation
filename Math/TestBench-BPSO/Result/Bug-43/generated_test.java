package generated.algorithm;

import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;
import static org.junit.Assert.*;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class BinaryParticleSwarmGeneratedTest {
 @Test(timeout = 20000)
 public void generatedInput000() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.stat.descriptive.SummaryStatistics", "org.apache.commons.math.stat.descriptive.SummaryStatistics", "getMax", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.math.stat.descriptive.SummaryStatistics", "getSumLogImpl", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("NaN", String.valueOf(actual));
  assertEquals("receiver state after the call", "SummaryStatistics:\nn: 0\nmin: NaN\nmax: NaN\nmean: NaN\ngeometric mean: NaN\nvariance: NaN\nsum of squares: 0.0\nstandard deviation: NaN\nsum of logs: 0.0\n {getGeometricMean=NaN, getMax=NaN, getMean=NaN, getM...#350#2146862523", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput001() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.stat.descriptive.SummaryStatistics", "org.apache.commons.math.stat.descriptive.SummaryStatistics", "getVarianceImpl", new String[]{}, new String[]{}, false, 7, new String[][]{{"org.apache.commons.math.stat.descriptive.SummaryStatistics", "getMeanImpl", ""}}, 2);
  assertNotNull(actual);
  assertEquals("org.apache.commons.math.stat.descriptive.moment.Variance", actual.getClass().getName());
  assertEquals("{getData=null, getN=0, getResult=NaN, isBiasCorrected=true}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "SummaryStatistics:\nn: 0\nmin: NaN\nmax: NaN\nmean: NaN\ngeometric mean: NaN\nvariance: NaN\nsum of squares: 0.0\nstandard deviation: NaN\nsum of logs: 0.0\n {getGeometricMean=NaN, getMax=NaN, getMean=NaN, getM...#350#2146862523", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput002() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math.stat.descriptive.SummaryStatistics", "org.apache.commons.math.stat.descriptive.SummaryStatistics", "copy", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.math.stat.descriptive.SummaryStatistics", "setVarianceImpl", "org.apache.commons.math.stat.descriptive.StorelessUnivariateStatistic", "<sample:6>"}}), new String[][]{{"clear", "", "4"}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.math.stat.descriptive.SummaryStatistics", actual.getClass().getName());
  assertEquals("SummaryStatistics:\nn: 0\nmin: NaN\nmax: NaN\nmean: NaN\ngeometric mean: NaN\nvariance: NaN\nsum of squares: 0.0\nstandard deviation: NaN\nsum of logs: 0.0\n {getGeometricMean=NaN, getMax=NaN, getMean=NaN, getM...#350#2146862523", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "SummaryStatistics:\nn: 0\nmin: NaN\nmax: NaN\nmean: NaN\ngeometric mean: NaN\nvariance: NaN\nsum of squares: 0.0\nstandard deviation: NaN\nsum of logs: 0.0\n {getGeometricMean=NaN, getMax=NaN, getMean=NaN, getM...#350#2146862523", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput003() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.stat.descriptive.SummaryStatistics", "org.apache.commons.math.stat.descriptive.SummaryStatistics", "copy", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.math.stat.descriptive.SummaryStatistics", "getMaxImpl", ""}, {"org.apache.commons.math.stat.descriptive.SummaryStatistics", "setMinImpl", "org.apache.commons.math.stat.descriptive.StorelessUnivariateStatistic", "<sample:2>"}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.math.stat.descriptive.SummaryStatistics", actual.getClass().getName());
  assertEquals("SummaryStatistics:\nn: 0\nmin: 0.0\nmax: NaN\nmean: NaN\ngeometric mean: NaN\nvariance: NaN\nsum of squares: 0.0\nstandard deviation: NaN\nsum of logs: 0.0\n {getGeometricMean=NaN, getMax=NaN, getMean=NaN, getM...#350#-1067426903", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "SummaryStatistics:\nn: 0\nmin: 0.0\nmax: NaN\nmean: NaN\ngeometric mean: NaN\nvariance: NaN\nsum of squares: 0.0\nstandard deviation: NaN\nsum of logs: 0.0\n {getGeometricMean=NaN, getMax=NaN, getMean=NaN, getM...#350#-1067426903", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput004() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.stat.descriptive.SummaryStatistics", "org.apache.commons.math.stat.descriptive.SummaryStatistics", "addValue", new String[]{"double"}, new String[]{"-4.0426435734871117E18"}, false, 0, new String[][]{{"org.apache.commons.math.stat.descriptive.SummaryStatistics", "addValue", "double", "-2.02132178674355558E18"}}, 3);
  assertNull(actual);
  assertEquals("receiver state after the call", "SummaryStatistics:\nn: 2\nmin: -4.0426435734871117E18\nmax: -2.02132178674355558E18\nmean: -3.0319826801153336E18\ngeometric mean: NaN\nvariance: 2.042870882782081E36\nsum of squares: 2.0428708827820805E37\ns...#628#-1570920272", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput005() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math.stat.descriptive.SummaryStatistics", "org.apache.commons.math.stat.descriptive.SummaryStatistics", "copy", new String[]{}, new String[]{}, false, 5, new String[][]{{"org.apache.commons.math.stat.descriptive.SummaryStatistics", "getSummary", ""}, {"org.apache.commons.math.stat.descriptive.SummaryStatistics", "setSumImpl", "org.apache.commons.math.stat.descriptive.StorelessUnivariateStatistic", "<sample:8>"}}, 2), new String[][]{{"setMaxImpl", "org.apache.commons.math.stat.descriptive.StorelessUnivariateStatistic", "4"}, {"copy", "", "2"}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.math.stat.descriptive.SummaryStatistics", actual.getClass().getName());
  assertEquals("SummaryStatistics:\nn: 0\nmin: NaN\nmax: NaN\nmean: NaN\ngeometric mean: NaN\nvariance: NaN\nsum of squares: 0.0\nstandard deviation: NaN\nsum of logs: 0.0\n {getGeometricMean=NaN, getMax=NaN, getMean=NaN, getM...#350#424382564", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "SummaryStatistics:\nn: 0\nmin: NaN\nmax: NaN\nmean: NaN\ngeometric mean: NaN\nvariance: NaN\nsum of squares: 0.0\nstandard deviation: NaN\nsum of logs: 0.0\n {getGeometricMean=NaN, getMax=NaN, getMean=NaN, getM...#350#424382564", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput006() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math.stat.descriptive.SummaryStatistics", "org.apache.commons.math.stat.descriptive.SummaryStatistics", "copy", new String[]{}, new String[]{}, false, 5, new String[][]{{"org.apache.commons.math.stat.descriptive.SummaryStatistics", "getSecondMoment", ""}, {"org.apache.commons.math.stat.descriptive.SummaryStatistics", "setMeanImpl", "org.apache.commons.math.stat.descriptive.StorelessUnivariateStatistic", "<sample:1>"}}), new String[][]{{"addValue", "double", "5"}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.math.stat.descriptive.SummaryStatistics", actual.getClass().getName());
  assertEquals("SummaryStatistics:\nn: 1\nmin: -Infinity\nmax: -Infinity\nmean: -1.0\ngeometric mean: NaN\nvariance: 0.0\nsum of squares: Infinity\nstandard deviation: 0.0\nsum of logs: NaN\n {getGeometricMean=NaN, getMax=-Inf...#392#-1643523541", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "SummaryStatistics:\nn: 0\nmin: NaN\nmax: NaN\nmean: -1.0\ngeometric mean: NaN\nvariance: NaN\nsum of squares: 0.0\nstandard deviation: NaN\nsum of logs: 0.0\n {getGeometricMean=NaN, getMax=NaN, getMean=-1.0, ge...#352#1693008303", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput007() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.stat.descriptive.SummaryStatistics", "org.apache.commons.math.stat.descriptive.SummaryStatistics", "addValue", new String[]{"double"}, new String[]{"-1.0000000000000002"}, false, 3, new String[][]{{"org.apache.commons.math.stat.descriptive.SummaryStatistics", "clear", ""}}, 3);
  assertNull(actual);
  assertEquals("receiver state after the call", "SummaryStatistics:\nn: 1\nmin: -1.0000000000000002\nmax: -1.0000000000000002\nmean: -1.0000000000000002\ngeometric mean: NaN\nvariance: 0.0\nsum of squares: 1.0000000000000004\nstandard deviation: 0.0\nsum of ...#492#-1890505775", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput008() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math.stat.descriptive.SummaryStatistics", "org.apache.commons.math.stat.descriptive.SummaryStatistics", "copy", new String[]{}, new String[]{}, false, 1, new String[][]{{"org.apache.commons.math.stat.descriptive.SummaryStatistics", "getSumImpl", ""}, {"org.apache.commons.math.stat.descriptive.SummaryStatistics", "setSumsqImpl", "org.apache.commons.math.stat.descriptive.StorelessUnivariateStatistic", "<sample:8>"}}, 3), new String[][]{{"getGeometricMean", "", "1"}});
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("NaN", String.valueOf(actual));
  assertEquals("receiver state after the call", "SummaryStatistics:\nn: 0\nmin: NaN\nmax: NaN\nmean: NaN\ngeometric mean: NaN\nvariance: NaN\nsum of squares: NaN\nstandard deviation: NaN\nsum of logs: 0.0\n {getGeometricMean=NaN, getMax=NaN, getMean=NaN, getM...#350#-1265085157", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput009() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.stat.descriptive.SummaryStatistics", "org.apache.commons.math.stat.descriptive.SummaryStatistics", "hashCode", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.math.stat.descriptive.SummaryStatistics", "copy", ""}, {"org.apache.commons.math.stat.descriptive.SummaryStatistics", "setMeanImpl", "org.apache.commons.math.stat.descriptive.StorelessUnivariateStatistic", "<sample:3>"}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("893481247", String.valueOf(actual));
  assertEquals("receiver state after the call", "SummaryStatistics:\nn: 0\nmin: NaN\nmax: NaN\nmean: 1.0\ngeometric mean: NaN\nvariance: NaN\nsum of squares: 0.0\nstandard deviation: NaN\nsum of logs: 0.0\n {getGeometricMean=NaN, getMax=NaN, getMean=1.0, getM...#350#-883672389", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput010() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.stat.descriptive.SummaryStatistics", "org.apache.commons.math.stat.descriptive.SummaryStatistics", "getSumsqImpl", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.math.stat.descriptive.SummaryStatistics", "addValue", "double", "2.02132178674355584E18"}, {"org.apache.commons.math.stat.descriptive.SummaryStatistics", "setSumsqImpl", "org.apache.commons.math.stat.descriptive.StorelessUnivariateStatistic", "<sample:11>"}}, 3);
  assertNotNull(actual);
  assertEquals("org.apache.commons.math.stat.descriptive.summary.SumOfSquares", actual.getClass().getName());
  assertEquals("{getData=null, getN=1, getResult=4.085741765564161E36}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "SummaryStatistics:\nn: 1\nmin: 2.02132178674355584E18\nmax: 2.02132178674355584E18\nmean: 2.02132178674355584E18\ngeometric mean: 2.0213217867435497E18\nvariance: 0.0\nsum of squares: 4.085741765564161E36\nst...#581#7379178", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput011() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.stat.descriptive.SummaryStatistics", "org.apache.commons.math.stat.descriptive.SummaryStatistics", "getMinImpl", new String[]{}, new String[]{}, false, 1, new String[][]{{"org.apache.commons.math.stat.descriptive.SummaryStatistics", "setVarianceImpl", "org.apache.commons.math.stat.descriptive.StorelessUnivariateStatistic", "<sample:8>"}, {"org.apache.commons.math.stat.descriptive.SummaryStatistics", "addValue", "double", "-2021321786743555871"}}, 2);
  assertNotNull(actual);
  assertEquals("org.apache.commons.math.stat.descriptive.rank.Min", actual.getClass().getName());
  assertEquals("{getData=null, getN=1, getResult=-2.02132178674355584E18}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "SummaryStatistics:\nn: 1\nmin: -2.02132178674355584E18\nmax: -2.02132178674355584E18\nmean: -2.02132178674355584E18\ngeometric mean: NaN\nvariance: -2.02132178674355584E18\nsum of squares: 4.085741765564161E...#564#-552257981", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput012() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math.stat.descriptive.SummaryStatistics", "org.apache.commons.math.stat.descriptive.SummaryStatistics", "copy", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.math.stat.descriptive.SummaryStatistics", "setSumLogImpl", "org.apache.commons.math.stat.descriptive.StorelessUnivariateStatistic", "<sample:10>"}, {"org.apache.commons.math.stat.descriptive.SummaryStatistics", "setGeoMeanImpl", "org.apache.commons.math.stat.descriptive.StorelessUnivariateStatistic", "<sample:3>"}}), new String[][]{{"addValue", "double", "1"}, {"getGeometricMean", "", "6"}});
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("1.0", String.valueOf(actual));
  assertEquals("receiver state after the call", "SummaryStatistics:\nn: 0\nmin: NaN\nmax: NaN\nmean: NaN\ngeometric mean: 1.0\nvariance: NaN\nsum of squares: 0.0\nstandard deviation: NaN\nsum of logs: NaN\n {getGeometricMean=1.0, getMax=NaN, getMean=NaN, getM...#350#1816194141", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput013() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.stat.descriptive.SummaryStatistics", "org.apache.commons.math.stat.descriptive.SummaryStatistics", "clear", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.math.stat.descriptive.SummaryStatistics", "setMeanImpl", "org.apache.commons.math.stat.descriptive.StorelessUnivariateStatistic", "<sample:9>"}, {"org.apache.commons.math.stat.descriptive.SummaryStatistics", "equals", "java.lang.Object", "<s:kdy>"}}, 2);
  assertNull(actual);
  assertEquals("receiver state after the call", "SummaryStatistics:\nn: 0\nmin: NaN\nmax: NaN\nmean: Infinity\ngeometric mean: NaN\nvariance: NaN\nsum of squares: 0.0\nstandard deviation: NaN\nsum of logs: 0.0\n {getGeometricMean=NaN, getMax=NaN, getMean=Infi...#360#-1249681549", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput014() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.stat.descriptive.SummaryStatistics", "org.apache.commons.math.stat.descriptive.SummaryStatistics", "getSecondMoment", new String[]{}, new String[]{}, false, 1, new String[][]{{"org.apache.commons.math.stat.descriptive.SummaryStatistics", "getGeometricMean", ""}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("NaN", String.valueOf(actual));
  assertEquals("receiver state after the call", "SummaryStatistics:\nn: 0\nmin: NaN\nmax: NaN\nmean: NaN\ngeometric mean: NaN\nvariance: NaN\nsum of squares: 0.0\nstandard deviation: NaN\nsum of logs: 0.0\n {getGeometricMean=NaN, getMax=NaN, getMean=NaN, getM...#350#2146862523", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput015() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.stat.descriptive.SummaryStatistics", "org.apache.commons.math.stat.descriptive.SummaryStatistics", "setMeanImpl", new String[]{"org.apache.commons.math.stat.descriptive.StorelessUnivariateStatistic"}, new String[]{"<sample:6>"}, false, 0, new String[][]{{"org.apache.commons.math.stat.descriptive.SummaryStatistics", "getGeometricMean", ""}}, 2);
  assertNull(actual);
  assertEquals("receiver state after the call", "SummaryStatistics:\nn: 0\nmin: NaN\nmax: NaN\nmean: NaN\ngeometric mean: NaN\nvariance: NaN\nsum of squares: 0.0\nstandard deviation: NaN\nsum of logs: 0.0\n {getGeometricMean=NaN, getMax=NaN, getMean=NaN, getM...#350#2146862523", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput016() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.stat.descriptive.SummaryStatistics", "org.apache.commons.math.stat.descriptive.SummaryStatistics", "hashCode", new String[]{}, new String[]{}, false, 0, null, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("-1170640609", String.valueOf(actual));
  assertEquals("receiver state after the call", "SummaryStatistics:\nn: 0\nmin: NaN\nmax: NaN\nmean: NaN\ngeometric mean: NaN\nvariance: NaN\nsum of squares: 0.0\nstandard deviation: NaN\nsum of logs: 0.0\n {getGeometricMean=NaN, getMax=NaN, getMean=NaN, getM...#350#2146862523", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput017() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.stat.descriptive.SummaryStatistics", "org.apache.commons.math.stat.descriptive.SummaryStatistics", "getPopulationVariance", new String[]{}, new String[]{}, false, 0, null, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("NaN", String.valueOf(actual));
  assertEquals("receiver state after the call", "SummaryStatistics:\nn: 0\nmin: NaN\nmax: NaN\nmean: NaN\ngeometric mean: NaN\nvariance: NaN\nsum of squares: 0.0\nstandard deviation: NaN\nsum of logs: 0.0\n {getGeometricMean=NaN, getMax=NaN, getMean=NaN, getM...#350#2146862523", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput018() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.stat.descriptive.SummaryStatistics", "org.apache.commons.math.stat.descriptive.SummaryStatistics", "getVariance", new String[]{}, new String[]{}, false, 1, new String[][]{}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("NaN", String.valueOf(actual));
  assertEquals("receiver state after the call", "SummaryStatistics:\nn: 0\nmin: NaN\nmax: NaN\nmean: NaN\ngeometric mean: NaN\nvariance: NaN\nsum of squares: 0.0\nstandard deviation: NaN\nsum of logs: 0.0\n {getGeometricMean=NaN, getMax=NaN, getMean=NaN, getM...#350#2146862523", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput019() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.stat.descriptive.SummaryStatistics", "org.apache.commons.math.stat.descriptive.SummaryStatistics", "getVariance", new String[]{}, new String[]{}, false, 1, new String[][]{}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("NaN", String.valueOf(actual));
  assertEquals("receiver state after the call", "SummaryStatistics:\nn: 0\nmin: NaN\nmax: NaN\nmean: NaN\ngeometric mean: NaN\nvariance: NaN\nsum of squares: 0.0\nstandard deviation: NaN\nsum of logs: 0.0\n {getGeometricMean=NaN, getMax=NaN, getMean=NaN, getM...#350#2146862523", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput020() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.stat.descriptive.SummaryStatistics", "org.apache.commons.math.stat.descriptive.SummaryStatistics", "setMeanImpl", new String[]{"org.apache.commons.math.stat.descriptive.StorelessUnivariateStatistic"}, new String[]{"<sample:6>"}, false, 4, new String[][]{{"org.apache.commons.math.stat.descriptive.SummaryStatistics", "getMinImpl", ""}}, 1);
  assertNull(actual);
  assertEquals("receiver state after the call", "SummaryStatistics:\nn: 0\nmin: NaN\nmax: NaN\nmean: NaN\ngeometric mean: NaN\nvariance: NaN\nsum of squares: 0.0\nstandard deviation: NaN\nsum of logs: 0.0\n {getGeometricMean=NaN, getMax=NaN, getMean=NaN, getM...#350#2146862523", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput021() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.stat.descriptive.SummaryStatistics", "org.apache.commons.math.stat.descriptive.SummaryStatistics", "copy", new String[]{"org.apache.commons.math.stat.descriptive.SummaryStatistics", "org.apache.commons.math.stat.descriptive.SummaryStatistics"}, new String[]{"<sample:3>", "<sample:2>"}, true, 0, null, 2);
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput022() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.stat.descriptive.SummaryStatistics", "org.apache.commons.math.stat.descriptive.SummaryStatistics", "getSum", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.math.stat.descriptive.SummaryStatistics", "getSumLogImpl", ""}, {"org.apache.commons.math.stat.descriptive.SummaryStatistics", "clear", ""}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("0.0", String.valueOf(actual));
  assertEquals("receiver state after the call", "SummaryStatistics:\nn: 0\nmin: NaN\nmax: NaN\nmean: NaN\ngeometric mean: NaN\nvariance: NaN\nsum of squares: 0.0\nstandard deviation: NaN\nsum of logs: 0.0\n {getGeometricMean=NaN, getMax=NaN, getMean=NaN, getM...#350#2146862523", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput023() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.stat.descriptive.SummaryStatistics", "org.apache.commons.math.stat.descriptive.SummaryStatistics", "getSumsq", new String[]{}, new String[]{}, false, 1, new String[][]{}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("0.0", String.valueOf(actual));
  assertEquals("receiver state after the call", "SummaryStatistics:\nn: 0\nmin: NaN\nmax: NaN\nmean: NaN\ngeometric mean: NaN\nvariance: NaN\nsum of squares: 0.0\nstandard deviation: NaN\nsum of logs: 0.0\n {getGeometricMean=NaN, getMax=NaN, getMean=NaN, getM...#350#2146862523", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput024() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.stat.descriptive.SummaryStatistics", "org.apache.commons.math.stat.descriptive.SummaryStatistics", "getSumOfLogs", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.math.stat.descriptive.SummaryStatistics", "getGeoMeanImpl", ""}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("0.0", String.valueOf(actual));
  assertEquals("receiver state after the call", "SummaryStatistics:\nn: 0\nmin: NaN\nmax: NaN\nmean: NaN\ngeometric mean: NaN\nvariance: NaN\nsum of squares: 0.0\nstandard deviation: NaN\nsum of logs: 0.0\n {getGeometricMean=NaN, getMax=NaN, getMean=NaN, getM...#350#2146862523", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput025() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.stat.descriptive.SummaryStatistics", "org.apache.commons.math.stat.descriptive.SummaryStatistics", "hashCode", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.math.stat.descriptive.SummaryStatistics", "getStandardDeviation", ""}, {"org.apache.commons.math.stat.descriptive.SummaryStatistics", "getMean", ""}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("-1170640609", String.valueOf(actual));
  assertEquals("receiver state after the call", "SummaryStatistics:\nn: 0\nmin: NaN\nmax: NaN\nmean: NaN\ngeometric mean: NaN\nvariance: NaN\nsum of squares: 0.0\nstandard deviation: NaN\nsum of logs: 0.0\n {getGeometricMean=NaN, getMax=NaN, getMean=NaN, getM...#350#2146862523", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput026() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.stat.descriptive.SummaryStatistics", "org.apache.commons.math.stat.descriptive.SummaryStatistics", "getStandardDeviation", new String[]{}, new String[]{}, false, 3, new String[][]{}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("NaN", String.valueOf(actual));
  assertEquals("receiver state after the call", "SummaryStatistics:\nn: 0\nmin: NaN\nmax: NaN\nmean: NaN\ngeometric mean: NaN\nvariance: NaN\nsum of squares: 0.0\nstandard deviation: NaN\nsum of logs: 0.0\n {getGeometricMean=NaN, getMax=NaN, getMean=NaN, getM...#350#2146862523", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput027() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.stat.descriptive.SummaryStatistics", "org.apache.commons.math.stat.descriptive.SummaryStatistics", "getSummary", new String[]{}, new String[]{}, false, 7, new String[][]{}, 1);
  assertNotNull(actual);
  assertEquals("org.apache.commons.math.stat.descriptive.StatisticalSummaryValues", actual.getClass().getName());
  assertEquals("StatisticalSummaryValues:\nn: 0\nmin: NaN\nmax: NaN\nmean: NaN\nstd dev: NaN\nvariance: NaN\nsum: 0.0\n {getMax=NaN, getMean=NaN, getMin=NaN, getN=0, getStandardDeviation=NaN, getSum=0.0, getVariance=NaN}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "SummaryStatistics:\nn: 0\nmin: NaN\nmax: NaN\nmean: NaN\ngeometric mean: NaN\nvariance: NaN\nsum of squares: 0.0\nstandard deviation: NaN\nsum of logs: 0.0\n {getGeometricMean=NaN, getMax=NaN, getMean=NaN, getM...#350#2146862523", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput028() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.stat.descriptive.SummaryStatistics", "org.apache.commons.math.stat.descriptive.SummaryStatistics", "getStandardDeviation", new String[]{}, new String[]{}, false, 0, null, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("NaN", String.valueOf(actual));
  assertEquals("receiver state after the call", "SummaryStatistics:\nn: 0\nmin: NaN\nmax: NaN\nmean: NaN\ngeometric mean: NaN\nvariance: NaN\nsum of squares: 0.0\nstandard deviation: NaN\nsum of logs: 0.0\n {getGeometricMean=NaN, getMax=NaN, getMean=NaN, getM...#350#2146862523", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput029() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math.stat.descriptive.SummaryStatistics", "org.apache.commons.math.stat.descriptive.SummaryStatistics", "getSumLogImpl", new String[]{}, new String[]{}, false, 2, new String[][]{}, 2), new String[][]{{"getN", "", "5"}});
  assertNotNull(actual);
  assertEquals("java.lang.Long", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "SummaryStatistics:\nn: 0\nmin: NaN\nmax: NaN\nmean: NaN\ngeometric mean: NaN\nvariance: NaN\nsum of squares: 0.0\nstandard deviation: NaN\nsum of logs: 0.0\n {getGeometricMean=NaN, getMax=NaN, getMean=NaN, getM...#350#2146862523", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput030() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.stat.descriptive.SummaryStatistics", "org.apache.commons.math.stat.descriptive.SummaryStatistics", "getSumsq", new String[]{}, new String[]{}, false, 1, new String[][]{{"org.apache.commons.math.stat.descriptive.SummaryStatistics", "getMaxImpl", ""}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("0.0", String.valueOf(actual));
  assertEquals("receiver state after the call", "SummaryStatistics:\nn: 0\nmin: NaN\nmax: NaN\nmean: NaN\ngeometric mean: NaN\nvariance: NaN\nsum of squares: 0.0\nstandard deviation: NaN\nsum of logs: 0.0\n {getGeometricMean=NaN, getMax=NaN, getMean=NaN, getM...#350#2146862523", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput031() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.stat.descriptive.SummaryStatistics", "org.apache.commons.math.stat.descriptive.SummaryStatistics", "getMinImpl", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.math.stat.descriptive.SummaryStatistics", "getVarianceImpl", ""}}, 3);
  assertNotNull(actual);
  assertEquals("org.apache.commons.math.stat.descriptive.rank.Min", actual.getClass().getName());
  assertEquals("{getData=null, getN=0, getResult=NaN}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "SummaryStatistics:\nn: 0\nmin: NaN\nmax: NaN\nmean: NaN\ngeometric mean: NaN\nvariance: NaN\nsum of squares: 0.0\nstandard deviation: NaN\nsum of logs: 0.0\n {getGeometricMean=NaN, getMax=NaN, getMean=NaN, getM...#350#2146862523", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput032() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math.stat.descriptive.SummaryStatistics", "org.apache.commons.math.stat.descriptive.SummaryStatistics", "copy", new String[]{}, new String[]{}, false, 7, new String[][]{}, 2), new String[][]{{"setMaxImpl", "org.apache.commons.math.stat.descriptive.StorelessUnivariateStatistic", "2"}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.math.stat.descriptive.SummaryStatistics", actual.getClass().getName());
  assertEquals("SummaryStatistics:\nn: 0\nmin: NaN\nmax: 0.0\nmean: NaN\ngeometric mean: NaN\nvariance: NaN\nsum of squares: 0.0\nstandard deviation: NaN\nsum of logs: 0.0\n {getGeometricMean=NaN, getMax=0.0, getMean=NaN, getM...#350#220768717", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "SummaryStatistics:\nn: 0\nmin: NaN\nmax: NaN\nmean: NaN\ngeometric mean: NaN\nvariance: NaN\nsum of squares: 0.0\nstandard deviation: NaN\nsum of logs: 0.0\n {getGeometricMean=NaN, getMax=NaN, getMean=NaN, getM...#350#2146862523", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput033() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.stat.descriptive.SummaryStatistics", "org.apache.commons.math.stat.descriptive.SummaryStatistics", "setVarianceImpl", new String[]{"org.apache.commons.math.stat.descriptive.StorelessUnivariateStatistic"}, new String[]{"<sample:2>"}, false, 6, new String[][]{{"org.apache.commons.math.stat.descriptive.SummaryStatistics", "setMeanImpl", "org.apache.commons.math.stat.descriptive.StorelessUnivariateStatistic", "<sample:1>"}}, 3);
  assertNull(actual);
  assertEquals("receiver state after the call", "SummaryStatistics:\nn: 0\nmin: NaN\nmax: NaN\nmean: -1.0\ngeometric mean: NaN\nvariance: 0.0\nsum of squares: 0.0\nstandard deviation: NaN\nsum of logs: 0.0\n {getGeometricMean=NaN, getMax=NaN, getMean=-1.0, ge...#352#1041650639", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput034() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.stat.descriptive.SummaryStatistics", "org.apache.commons.math.stat.descriptive.SummaryStatistics", "setSumLogImpl", new String[]{"org.apache.commons.math.stat.descriptive.StorelessUnivariateStatistic"}, new String[]{"<sample:12>"}, false, 4, new String[][]{}, 2);
  assertNull(actual);
  assertEquals("receiver state after the call", "SummaryStatistics:\nn: 0\nmin: NaN\nmax: NaN\nmean: NaN\ngeometric mean: NaN\nvariance: NaN\nsum of squares: 0.0\nstandard deviation: NaN\nsum of logs: NaN\n {getGeometricMean=NaN, getMax=NaN, getMean=NaN, getM...#350#-352706035", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput035() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.stat.descriptive.SummaryStatistics", "org.apache.commons.math.stat.descriptive.SummaryStatistics", "clear", new String[]{}, new String[]{}, false, 0, null, 3);
  assertNull(actual);
  assertEquals("receiver state after the call", "SummaryStatistics:\nn: 0\nmin: NaN\nmax: NaN\nmean: NaN\ngeometric mean: NaN\nvariance: NaN\nsum of squares: 0.0\nstandard deviation: NaN\nsum of logs: 0.0\n {getGeometricMean=NaN, getMax=NaN, getMean=NaN, getM...#350#2146862523", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput036() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math.stat.descriptive.SummaryStatistics", "org.apache.commons.math.stat.descriptive.SummaryStatistics", "getSumImpl", new String[]{}, new String[]{}, false, 0, null, 2), new String[][]{{"getN", "", "1"}, {"evaluate", "double[],double[]", "4"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("org.apache.commons.math.exception.DimensionMismatchException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput037() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.stat.descriptive.SummaryStatistics", "org.apache.commons.math.stat.descriptive.SummaryStatistics", "equals", new String[]{"java.lang.Object"}, new String[]{"<sample:0>"}, false, 2, new String[][]{}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "SummaryStatistics:\nn: 0\nmin: NaN\nmax: NaN\nmean: NaN\ngeometric mean: NaN\nvariance: NaN\nsum of squares: 0.0\nstandard deviation: NaN\nsum of logs: 0.0\n {getGeometricMean=NaN, getMax=NaN, getMean=NaN, getM...#350#2146862523", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput038() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.stat.descriptive.SummaryStatistics", "org.apache.commons.math.stat.descriptive.SummaryStatistics", "addValue", new String[]{"double"}, new String[]{"-1.0"}, false, 3, new String[][]{}, 3);
  assertNull(actual);
  assertEquals("receiver state after the call", "SummaryStatistics:\nn: 1\nmin: -1.0\nmax: -1.0\nmean: -1.0\ngeometric mean: NaN\nvariance: 0.0\nsum of squares: 1.0\nstandard deviation: 0.0\nsum of logs: NaN\n {getGeometricMean=NaN, getMax=-1.0, getMean=-1.0,...#357#65188631", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput039() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.stat.descriptive.SummaryStatistics", "org.apache.commons.math.stat.descriptive.SummaryStatistics", "setVarianceImpl", new String[]{"org.apache.commons.math.stat.descriptive.StorelessUnivariateStatistic"}, new String[]{"<sample:1>"}, false, 3, new String[][]{}, 2);
  assertNull(actual);
  assertEquals("receiver state after the call", "SummaryStatistics:\nn: 0\nmin: NaN\nmax: NaN\nmean: NaN\ngeometric mean: NaN\nvariance: -1.0\nsum of squares: 0.0\nstandard deviation: NaN\nsum of logs: 0.0\n {getGeometricMean=NaN, getMax=NaN, getMean=NaN, get...#352#1435565963", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput040() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.stat.descriptive.SummaryStatistics", "org.apache.commons.math.stat.descriptive.SummaryStatistics", "getGeometricMean", new String[]{}, new String[]{}, false, 2, new String[][]{{"org.apache.commons.math.stat.descriptive.SummaryStatistics", "getSum", ""}, {"org.apache.commons.math.stat.descriptive.SummaryStatistics", "getVariance", ""}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("NaN", String.valueOf(actual));
  assertEquals("receiver state after the call", "SummaryStatistics:\nn: 0\nmin: NaN\nmax: NaN\nmean: NaN\ngeometric mean: NaN\nvariance: NaN\nsum of squares: 0.0\nstandard deviation: NaN\nsum of logs: 0.0\n {getGeometricMean=NaN, getMax=NaN, getMean=NaN, getM...#350#2146862523", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput041() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.stat.descriptive.SummaryStatistics", "org.apache.commons.math.stat.descriptive.SummaryStatistics", "getSum", new String[]{}, new String[]{}, false, 7, new String[][]{}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("0.0", String.valueOf(actual));
  assertEquals("receiver state after the call", "SummaryStatistics:\nn: 0\nmin: NaN\nmax: NaN\nmean: NaN\ngeometric mean: NaN\nvariance: NaN\nsum of squares: 0.0\nstandard deviation: NaN\nsum of logs: 0.0\n {getGeometricMean=NaN, getMax=NaN, getMean=NaN, getM...#350#2146862523", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput042() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.stat.descriptive.SummaryStatistics", "org.apache.commons.math.stat.descriptive.SummaryStatistics", "getMax", new String[]{}, new String[]{}, false, 7, new String[][]{{"org.apache.commons.math.stat.descriptive.SummaryStatistics", "getSum", ""}, {"org.apache.commons.math.stat.descriptive.SummaryStatistics", "getMax", ""}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("NaN", String.valueOf(actual));
  assertEquals("receiver state after the call", "SummaryStatistics:\nn: 0\nmin: NaN\nmax: NaN\nmean: NaN\ngeometric mean: NaN\nvariance: NaN\nsum of squares: 0.0\nstandard deviation: NaN\nsum of logs: 0.0\n {getGeometricMean=NaN, getMax=NaN, getMean=NaN, getM...#350#2146862523", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput043() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.stat.descriptive.SummaryStatistics", "org.apache.commons.math.stat.descriptive.SummaryStatistics", "setVarianceImpl", new String[]{"org.apache.commons.math.stat.descriptive.StorelessUnivariateStatistic"}, new String[]{"<sample:6>"}, false, 3, new String[][]{}, 1);
  assertNull(actual);
  assertEquals("receiver state after the call", "SummaryStatistics:\nn: 0\nmin: NaN\nmax: NaN\nmean: NaN\ngeometric mean: NaN\nvariance: NaN\nsum of squares: 0.0\nstandard deviation: NaN\nsum of logs: 0.0\n {getGeometricMean=NaN, getMax=NaN, getMean=NaN, getM...#350#2146862523", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput044() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math.stat.descriptive.SummaryStatistics", "org.apache.commons.math.stat.descriptive.SummaryStatistics", "getSumLogImpl", new String[]{}, new String[]{}, false, 5, new String[][]{}, 2), new String[][]{{"evaluate", "double[],int,int", "2"}});
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("0.0", String.valueOf(actual));
  assertEquals("receiver state after the call", "SummaryStatistics:\nn: 0\nmin: NaN\nmax: NaN\nmean: NaN\ngeometric mean: NaN\nvariance: NaN\nsum of squares: 0.0\nstandard deviation: NaN\nsum of logs: 0.0\n {getGeometricMean=NaN, getMax=NaN, getMean=NaN, getM...#350#2146862523", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput045() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math.stat.descriptive.SummaryStatistics", "org.apache.commons.math.stat.descriptive.SummaryStatistics", "getSumImpl", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.math.stat.descriptive.SummaryStatistics", "getVarianceImpl", ""}}, 3), new String[][]{{"evaluate", "double[],int,int", "4"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("org.apache.commons.math.exception.NumberIsTooLargeException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput046() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.stat.descriptive.SummaryStatistics", "org.apache.commons.math.stat.descriptive.SummaryStatistics", "getSumsq", new String[]{}, new String[]{}, false, 1, new String[][]{}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("0.0", String.valueOf(actual));
  assertEquals("receiver state after the call", "SummaryStatistics:\nn: 0\nmin: NaN\nmax: NaN\nmean: NaN\ngeometric mean: NaN\nvariance: NaN\nsum of squares: 0.0\nstandard deviation: NaN\nsum of logs: 0.0\n {getGeometricMean=NaN, getMax=NaN, getMean=NaN, getM...#350#2146862523", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput047() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.stat.descriptive.SummaryStatistics", "org.apache.commons.math.stat.descriptive.SummaryStatistics", "setMaxImpl", new String[]{"org.apache.commons.math.stat.descriptive.StorelessUnivariateStatistic"}, new String[]{"<sample:8>"}, false, 7, new String[][]{}, 2);
  assertNull(actual);
  assertEquals("receiver state after the call", "SummaryStatistics:\nn: 0\nmin: NaN\nmax: NaN\nmean: NaN\ngeometric mean: NaN\nvariance: NaN\nsum of squares: 0.0\nstandard deviation: NaN\nsum of logs: 0.0\n {getGeometricMean=NaN, getMax=NaN, getMean=NaN, getM...#350#2146862523", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput048() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.stat.descriptive.SummaryStatistics", "org.apache.commons.math.stat.descriptive.SummaryStatistics", "hashCode", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.math.stat.descriptive.SummaryStatistics", "addValue", "double", "NaN"}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("-1789824737", String.valueOf(actual));
  assertEquals("receiver state after the call", "SummaryStatistics:\nn: 1\nmin: NaN\nmax: NaN\nmean: NaN\ngeometric mean: NaN\nvariance: 0.0\nsum of squares: NaN\nstandard deviation: 0.0\nsum of logs: NaN\n {getGeometricMean=NaN, getMax=NaN, getMean=NaN, getM...#350#-742111247", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput049() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math.stat.descriptive.SummaryStatistics", "org.apache.commons.math.stat.descriptive.SummaryStatistics", "copy", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.math.stat.descriptive.SummaryStatistics", "equals", "java.lang.Object", "<b:false>"}}, 2), new String[][]{{"getMinImpl", "", "0"}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.math.stat.descriptive.rank.Min", actual.getClass().getName());
  assertEquals("{getData=null, getN=0, getResult=NaN}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "SummaryStatistics:\nn: 0\nmin: NaN\nmax: NaN\nmean: NaN\ngeometric mean: NaN\nvariance: NaN\nsum of squares: 0.0\nstandard deviation: NaN\nsum of logs: 0.0\n {getGeometricMean=NaN, getMax=NaN, getMean=NaN, getM...#350#2146862523", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput050() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.stat.descriptive.SummaryStatistics", "org.apache.commons.math.stat.descriptive.SummaryStatistics", "setGeoMeanImpl", new String[]{"org.apache.commons.math.stat.descriptive.StorelessUnivariateStatistic"}, new String[]{"<sample:8>"}, false, 3, new String[][]{}, 3);
  assertNull(actual);
  assertEquals("receiver state after the call", "SummaryStatistics:\nn: 0\nmin: NaN\nmax: NaN\nmean: NaN\ngeometric mean: NaN\nvariance: NaN\nsum of squares: 0.0\nstandard deviation: NaN\nsum of logs: 0.0\n {getGeometricMean=NaN, getMax=NaN, getMean=NaN, getM...#350#2146862523", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput051() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.stat.descriptive.SummaryStatistics", "org.apache.commons.math.stat.descriptive.SummaryStatistics", "setGeoMeanImpl", new String[]{"org.apache.commons.math.stat.descriptive.StorelessUnivariateStatistic"}, new String[]{"<sample:6>"}, false, 0, new String[][]{{"org.apache.commons.math.stat.descriptive.SummaryStatistics", "getMax", ""}}, 1);
  assertNull(actual);
  assertEquals("receiver state after the call", "SummaryStatistics:\nn: 0\nmin: NaN\nmax: NaN\nmean: NaN\ngeometric mean: NaN\nvariance: NaN\nsum of squares: 0.0\nstandard deviation: NaN\nsum of logs: 0.0\n {getGeometricMean=NaN, getMax=NaN, getMean=NaN, getM...#350#2146862523", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput052() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math.stat.descriptive.SummaryStatistics", "org.apache.commons.math.stat.descriptive.SummaryStatistics", "getSumImpl", new String[]{}, new String[]{}, false, 1, new String[][]{{"org.apache.commons.math.stat.descriptive.SummaryStatistics", "hashCode", ""}}, 1), new String[][]{{"getData", "", "0"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "SummaryStatistics:\nn: 0\nmin: NaN\nmax: NaN\nmean: NaN\ngeometric mean: NaN\nvariance: NaN\nsum of squares: 0.0\nstandard deviation: NaN\nsum of logs: 0.0\n {getGeometricMean=NaN, getMax=NaN, getMean=NaN, getM...#350#2146862523", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput053() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.stat.descriptive.SummaryStatistics", "org.apache.commons.math.stat.descriptive.SummaryStatistics", "setGeoMeanImpl", new String[]{"org.apache.commons.math.stat.descriptive.StorelessUnivariateStatistic"}, new String[]{"<sample:2>"}, false, 0, null, 3);
  assertNull(actual);
  assertEquals("receiver state after the call", "SummaryStatistics:\nn: 0\nmin: NaN\nmax: NaN\nmean: NaN\ngeometric mean: 0.0\nvariance: NaN\nsum of squares: 0.0\nstandard deviation: NaN\nsum of logs: 0.0\n {getGeometricMean=0.0, getMax=NaN, getMean=NaN, getM...#350#-82019827", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput054() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.stat.descriptive.SummaryStatistics", "org.apache.commons.math.stat.descriptive.SummaryStatistics", "getStandardDeviation", new String[]{}, new String[]{}, false, 5, new String[][]{{"org.apache.commons.math.stat.descriptive.SummaryStatistics", "addValue", "double", "-2.02132178674355584E18"}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("0.0", String.valueOf(actual));
  assertEquals("receiver state after the call", "SummaryStatistics:\nn: 1\nmin: -2.02132178674355584E18\nmax: -2.02132178674355584E18\nmean: -2.02132178674355584E18\ngeometric mean: NaN\nvariance: 0.0\nsum of squares: 4.085741765564161E36\nstandard deviatio...#524#1310934447", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput055() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.stat.descriptive.SummaryStatistics", "org.apache.commons.math.stat.descriptive.SummaryStatistics", "getVariance", new String[]{}, new String[]{}, false, 4, new String[][]{{"org.apache.commons.math.stat.descriptive.SummaryStatistics", "getSecondMoment", ""}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("NaN", String.valueOf(actual));
  assertEquals("receiver state after the call", "SummaryStatistics:\nn: 0\nmin: NaN\nmax: NaN\nmean: NaN\ngeometric mean: NaN\nvariance: NaN\nsum of squares: 0.0\nstandard deviation: NaN\nsum of logs: 0.0\n {getGeometricMean=NaN, getMax=NaN, getMean=NaN, getM...#350#2146862523", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput056() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.stat.descriptive.SummaryStatistics", "org.apache.commons.math.stat.descriptive.SummaryStatistics", "getMin", new String[]{}, new String[]{}, false, 3, new String[][]{{"org.apache.commons.math.stat.descriptive.SummaryStatistics", "setVarianceImpl", "org.apache.commons.math.stat.descriptive.StorelessUnivariateStatistic", "<sample:4>"}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("NaN", String.valueOf(actual));
  assertEquals("receiver state after the call", "SummaryStatistics:\nn: 0\nmin: NaN\nmax: NaN\nmean: NaN\ngeometric mean: NaN\nvariance: NaN\nsum of squares: 0.0\nstandard deviation: NaN\nsum of logs: 0.0\n {getGeometricMean=NaN, getMax=NaN, getMean=NaN, getM...#350#2146862523", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput057() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math.stat.descriptive.SummaryStatistics", "org.apache.commons.math.stat.descriptive.SummaryStatistics", "copy", new String[]{}, new String[]{}, false, 3, new String[][]{{"org.apache.commons.math.stat.descriptive.SummaryStatistics", "getSum", ""}}, 3), new String[][]{{"getMin", "", "1"}});
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("NaN", String.valueOf(actual));
  assertEquals("receiver state after the call", "SummaryStatistics:\nn: 0\nmin: NaN\nmax: NaN\nmean: NaN\ngeometric mean: NaN\nvariance: NaN\nsum of squares: 0.0\nstandard deviation: NaN\nsum of logs: 0.0\n {getGeometricMean=NaN, getMax=NaN, getMean=NaN, getM...#350#2146862523", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput058() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.stat.descriptive.SummaryStatistics", "org.apache.commons.math.stat.descriptive.SummaryStatistics", "getSumsqImpl", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.math.stat.descriptive.SummaryStatistics", "getSumsq", ""}}, 3);
  assertNotNull(actual);
  assertEquals("org.apache.commons.math.stat.descriptive.summary.SumOfSquares", actual.getClass().getName());
  assertEquals("{getData=null, getN=0, getResult=0.0}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "SummaryStatistics:\nn: 0\nmin: NaN\nmax: NaN\nmean: NaN\ngeometric mean: NaN\nvariance: NaN\nsum of squares: 0.0\nstandard deviation: NaN\nsum of logs: 0.0\n {getGeometricMean=NaN, getMax=NaN, getMean=NaN, getM...#350#2146862523", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput059() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math.stat.descriptive.SummaryStatistics", "org.apache.commons.math.stat.descriptive.SummaryStatistics", "getMeanImpl", new String[]{}, new String[]{}, false, 1, new String[][]{}, 2), new String[][]{{"evaluate", "double[]", "2"}});
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("NaN", String.valueOf(actual));
  assertEquals("receiver state after the call", "SummaryStatistics:\nn: 0\nmin: NaN\nmax: NaN\nmean: NaN\ngeometric mean: NaN\nvariance: NaN\nsum of squares: 0.0\nstandard deviation: NaN\nsum of logs: 0.0\n {getGeometricMean=NaN, getMax=NaN, getMean=NaN, getM...#350#2146862523", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput060() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.stat.descriptive.SummaryStatistics", "org.apache.commons.math.stat.descriptive.SummaryStatistics", "getSecondMoment", new String[]{}, new String[]{}, false, 3, new String[][]{{"org.apache.commons.math.stat.descriptive.SummaryStatistics", "getMeanImpl", ""}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("NaN", String.valueOf(actual));
  assertEquals("receiver state after the call", "SummaryStatistics:\nn: 0\nmin: NaN\nmax: NaN\nmean: NaN\ngeometric mean: NaN\nvariance: NaN\nsum of squares: 0.0\nstandard deviation: NaN\nsum of logs: 0.0\n {getGeometricMean=NaN, getMax=NaN, getMean=NaN, getM...#350#2146862523", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput061() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.stat.descriptive.SummaryStatistics", "org.apache.commons.math.stat.descriptive.SummaryStatistics", "copy", new String[]{}, new String[]{}, false, 1, new String[][]{{"org.apache.commons.math.stat.descriptive.SummaryStatistics", "getGeoMeanImpl", ""}, {"org.apache.commons.math.stat.descriptive.SummaryStatistics", "setVarianceImpl", "org.apache.commons.math.stat.descriptive.StorelessUnivariateStatistic", "<sample:1>"}}, 2);
  assertNotNull(actual);
  assertEquals("org.apache.commons.math.stat.descriptive.SummaryStatistics", actual.getClass().getName());
  assertEquals("SummaryStatistics:\nn: 0\nmin: NaN\nmax: NaN\nmean: NaN\ngeometric mean: NaN\nvariance: -1.0\nsum of squares: 0.0\nstandard deviation: NaN\nsum of logs: 0.0\n {getGeometricMean=NaN, getMax=NaN, getMean=NaN, get...#352#1435565963", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "SummaryStatistics:\nn: 0\nmin: NaN\nmax: NaN\nmean: NaN\ngeometric mean: NaN\nvariance: -1.0\nsum of squares: 0.0\nstandard deviation: NaN\nsum of logs: 0.0\n {getGeometricMean=NaN, getMax=NaN, getMean=NaN, get...#352#1435565963", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput062() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.stat.descriptive.SummaryStatistics", "org.apache.commons.math.stat.descriptive.SummaryStatistics", "getStandardDeviation", new String[]{}, new String[]{}, false, 3, new String[][]{}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("NaN", String.valueOf(actual));
  assertEquals("receiver state after the call", "SummaryStatistics:\nn: 0\nmin: NaN\nmax: NaN\nmean: NaN\ngeometric mean: NaN\nvariance: NaN\nsum of squares: 0.0\nstandard deviation: NaN\nsum of logs: 0.0\n {getGeometricMean=NaN, getMax=NaN, getMean=NaN, getM...#350#2146862523", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput063() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.stat.descriptive.SummaryStatistics", "org.apache.commons.math.stat.descriptive.SummaryStatistics", "getSumImpl", new String[]{}, new String[]{}, false, 3, new String[][]{{"org.apache.commons.math.stat.descriptive.SummaryStatistics", "getVariance", ""}}, 1);
  assertNotNull(actual);
  assertEquals("org.apache.commons.math.stat.descriptive.summary.Sum", actual.getClass().getName());
  assertEquals("{getData=null, getN=0, getResult=0.0}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "SummaryStatistics:\nn: 0\nmin: NaN\nmax: NaN\nmean: NaN\ngeometric mean: NaN\nvariance: NaN\nsum of squares: 0.0\nstandard deviation: NaN\nsum of logs: 0.0\n {getGeometricMean=NaN, getMax=NaN, getMean=NaN, getM...#350#2146862523", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput064() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.stat.descriptive.SummaryStatistics", "org.apache.commons.math.stat.descriptive.SummaryStatistics", "getSumOfLogs", new String[]{}, new String[]{}, false, 1, new String[][]{}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("0.0", String.valueOf(actual));
  assertEquals("receiver state after the call", "SummaryStatistics:\nn: 0\nmin: NaN\nmax: NaN\nmean: NaN\ngeometric mean: NaN\nvariance: NaN\nsum of squares: 0.0\nstandard deviation: NaN\nsum of logs: 0.0\n {getGeometricMean=NaN, getMax=NaN, getMean=NaN, getM...#350#2146862523", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput065() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.stat.descriptive.SummaryStatistics", "org.apache.commons.math.stat.descriptive.SummaryStatistics", "getMean", new String[]{}, new String[]{}, false, 7, new String[][]{}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("NaN", String.valueOf(actual));
  assertEquals("receiver state after the call", "SummaryStatistics:\nn: 0\nmin: NaN\nmax: NaN\nmean: NaN\ngeometric mean: NaN\nvariance: NaN\nsum of squares: 0.0\nstandard deviation: NaN\nsum of logs: 0.0\n {getGeometricMean=NaN, getMax=NaN, getMean=NaN, getM...#350#2146862523", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput066() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.stat.descriptive.SummaryStatistics", "org.apache.commons.math.stat.descriptive.SummaryStatistics", "getSumsqImpl", new String[]{}, new String[]{}, false, 1, new String[][]{{"org.apache.commons.math.stat.descriptive.SummaryStatistics", "getGeoMeanImpl", ""}}, 2);
  assertNotNull(actual);
  assertEquals("org.apache.commons.math.stat.descriptive.summary.SumOfSquares", actual.getClass().getName());
  assertEquals("{getData=null, getN=0, getResult=0.0}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "SummaryStatistics:\nn: 0\nmin: NaN\nmax: NaN\nmean: NaN\ngeometric mean: NaN\nvariance: NaN\nsum of squares: 0.0\nstandard deviation: NaN\nsum of logs: 0.0\n {getGeometricMean=NaN, getMax=NaN, getMean=NaN, getM...#350#2146862523", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput067() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.stat.descriptive.SummaryStatistics", "org.apache.commons.math.stat.descriptive.SummaryStatistics", "setSumImpl", new String[]{"org.apache.commons.math.stat.descriptive.StorelessUnivariateStatistic"}, new String[]{"<sample:4>"}, false, 3, new String[][]{{"org.apache.commons.math.stat.descriptive.SummaryStatistics", "getStandardDeviation", ""}}, 1);
  assertNull(actual);
  assertEquals("receiver state after the call", "SummaryStatistics:\nn: 0\nmin: NaN\nmax: NaN\nmean: NaN\ngeometric mean: NaN\nvariance: NaN\nsum of squares: 0.0\nstandard deviation: NaN\nsum of logs: 0.0\n {getGeometricMean=NaN, getMax=NaN, getMean=NaN, getM...#350#424382564", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput068() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math.stat.descriptive.SummaryStatistics", "org.apache.commons.math.stat.descriptive.SummaryStatistics", "getSumImpl", new String[]{}, new String[]{}, false, 3, new String[][]{{"org.apache.commons.math.stat.descriptive.SummaryStatistics", "getGeometricMean", ""}}, 2), new String[][]{{"increment", "double", "5"}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.math.stat.descriptive.summary.Sum", actual.getClass().getName());
  assertEquals("{getData=null, getN=1, getResult=-Infinity}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "SummaryStatistics:\nn: 0\nmin: NaN\nmax: NaN\nmean: NaN\ngeometric mean: NaN\nvariance: NaN\nsum of squares: 0.0\nstandard deviation: NaN\nsum of logs: 0.0\n {getGeometricMean=NaN, getMax=NaN, getMean=NaN, getM...#356#-2113366850", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput069() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.stat.descriptive.SummaryStatistics", "org.apache.commons.math.stat.descriptive.SummaryStatistics", "getSumImpl", new String[]{}, new String[]{}, false, 3, new String[][]{}, 2);
  assertNotNull(actual);
  assertEquals("org.apache.commons.math.stat.descriptive.summary.Sum", actual.getClass().getName());
  assertEquals("{getData=null, getN=0, getResult=0.0}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "SummaryStatistics:\nn: 0\nmin: NaN\nmax: NaN\nmean: NaN\ngeometric mean: NaN\nvariance: NaN\nsum of squares: 0.0\nstandard deviation: NaN\nsum of logs: 0.0\n {getGeometricMean=NaN, getMax=NaN, getMean=NaN, getM...#350#2146862523", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput070() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math.stat.descriptive.SummaryStatistics", "org.apache.commons.math.stat.descriptive.SummaryStatistics", "getSumLogImpl", new String[]{}, new String[]{}, false, 0, null, 1), new String[][]{{"copy", "", "0"}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.math.stat.descriptive.summary.SumOfLogs", actual.getClass().getName());
  assertEquals("{getData=null, getN=0, getResult=0.0}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "SummaryStatistics:\nn: 0\nmin: NaN\nmax: NaN\nmean: NaN\ngeometric mean: NaN\nvariance: NaN\nsum of squares: 0.0\nstandard deviation: NaN\nsum of logs: 0.0\n {getGeometricMean=NaN, getMax=NaN, getMean=NaN, getM...#350#2146862523", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput071() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.stat.descriptive.SummaryStatistics", "org.apache.commons.math.stat.descriptive.SummaryStatistics", "addValue", new String[]{"double"}, new String[]{"1.7976931348623157E308"}, false, 5, new String[][]{}, 2);
  assertNull(actual);
  assertEquals("receiver state after the call", "SummaryStatistics:\nn: 1\nmin: 1.7976931348623157E308\nmax: 1.7976931348623157E308\nmean: 1.7976931348623157E308\ngeometric mean: 1.7976931348622732E308\nvariance: 0.0\nsum of squares: Infinity\nstandard devi...#557#-1852587093", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput072() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.stat.descriptive.SummaryStatistics", "org.apache.commons.math.stat.descriptive.SummaryStatistics", "copy", new String[]{}, new String[]{}, false, 3, new String[][]{{"org.apache.commons.math.stat.descriptive.SummaryStatistics", "getSumsqImpl", ""}}, 1);
  assertNotNull(actual);
  assertEquals("org.apache.commons.math.stat.descriptive.SummaryStatistics", actual.getClass().getName());
  assertEquals("SummaryStatistics:\nn: 0\nmin: NaN\nmax: NaN\nmean: NaN\ngeometric mean: NaN\nvariance: NaN\nsum of squares: 0.0\nstandard deviation: NaN\nsum of logs: 0.0\n {getGeometricMean=NaN, getMax=NaN, getMean=NaN, getM...#350#2146862523", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "SummaryStatistics:\nn: 0\nmin: NaN\nmax: NaN\nmean: NaN\ngeometric mean: NaN\nvariance: NaN\nsum of squares: 0.0\nstandard deviation: NaN\nsum of logs: 0.0\n {getGeometricMean=NaN, getMax=NaN, getMean=NaN, getM...#350#2146862523", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput073() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.stat.descriptive.SummaryStatistics", "org.apache.commons.math.stat.descriptive.SummaryStatistics", "getGeometricMean", new String[]{}, new String[]{}, false, 3, new String[][]{{"org.apache.commons.math.stat.descriptive.SummaryStatistics", "getPopulationVariance", ""}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("NaN", String.valueOf(actual));
  assertEquals("receiver state after the call", "SummaryStatistics:\nn: 0\nmin: NaN\nmax: NaN\nmean: NaN\ngeometric mean: NaN\nvariance: NaN\nsum of squares: 0.0\nstandard deviation: NaN\nsum of logs: 0.0\n {getGeometricMean=NaN, getMax=NaN, getMean=NaN, getM...#350#2146862523", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput074() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math.stat.descriptive.SummaryStatistics", "org.apache.commons.math.stat.descriptive.SummaryStatistics", "copy", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.math.stat.descriptive.SummaryStatistics", "getMin", ""}}, 2), new String[][]{{"getSumsqImpl", "", "6"}, {"clear", "", "2"}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.math.stat.descriptive.summary.SumOfSquares", actual.getClass().getName());
  assertEquals("{getData=null, getN=0, getResult=0.0}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "SummaryStatistics:\nn: 0\nmin: NaN\nmax: NaN\nmean: NaN\ngeometric mean: NaN\nvariance: NaN\nsum of squares: 0.0\nstandard deviation: NaN\nsum of logs: 0.0\n {getGeometricMean=NaN, getMax=NaN, getMean=NaN, getM...#350#2146862523", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput075() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.stat.descriptive.SummaryStatistics", "org.apache.commons.math.stat.descriptive.SummaryStatistics", "toString", new String[]{}, new String[]{}, false, 3, new String[][]{{"org.apache.commons.math.stat.descriptive.SummaryStatistics", "getSecondMoment", ""}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("SummaryStatistics:\nn: 0\nmin: NaN\nmax: NaN\nmean: NaN\ngeometric mean: NaN\nvariance: NaN\nsum of squares: 0.0\nstandard deviation: NaN\nsum of logs: 0.0\n", String.valueOf(actual));
  assertEquals("receiver state after the call", "SummaryStatistics:\nn: 0\nmin: NaN\nmax: NaN\nmean: NaN\ngeometric mean: NaN\nvariance: NaN\nsum of squares: 0.0\nstandard deviation: NaN\nsum of logs: 0.0\n {getGeometricMean=NaN, getMax=NaN, getMean=NaN, getM...#350#2146862523", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput076() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math.stat.descriptive.SummaryStatistics", "org.apache.commons.math.stat.descriptive.SummaryStatistics", "getSumImpl", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.math.stat.descriptive.SummaryStatistics", "setVarianceImpl", "org.apache.commons.math.stat.descriptive.StorelessUnivariateStatistic", "<sample:5>"}}, 2), new String[][]{{"evaluate", "double[]", "0"}});
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("-1.0", String.valueOf(actual));
  assertEquals("receiver state after the call", "SummaryStatistics:\nn: 0\nmin: NaN\nmax: NaN\nmean: NaN\ngeometric mean: NaN\nvariance: -Infinity\nsum of squares: 0.0\nstandard deviation: NaN\nsum of logs: 0.0\n {getGeometricMean=NaN, getMax=NaN, getMean=NaN...#362#302438663", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput077() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.stat.descriptive.SummaryStatistics", "org.apache.commons.math.stat.descriptive.SummaryStatistics", "clear", new String[]{}, new String[]{}, false, 3, new String[][]{}, 2);
  assertNull(actual);
  assertEquals("receiver state after the call", "SummaryStatistics:\nn: 0\nmin: NaN\nmax: NaN\nmean: NaN\ngeometric mean: NaN\nvariance: NaN\nsum of squares: 0.0\nstandard deviation: NaN\nsum of logs: 0.0\n {getGeometricMean=NaN, getMax=NaN, getMean=NaN, getM...#350#2146862523", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput078() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.stat.descriptive.SummaryStatistics", "org.apache.commons.math.stat.descriptive.SummaryStatistics", "getN", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.math.stat.descriptive.SummaryStatistics", "getGeometricMean", ""}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Long", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "SummaryStatistics:\nn: 0\nmin: NaN\nmax: NaN\nmean: NaN\ngeometric mean: NaN\nvariance: NaN\nsum of squares: 0.0\nstandard deviation: NaN\nsum of logs: 0.0\n {getGeometricMean=NaN, getMax=NaN, getMean=NaN, getM...#350#2146862523", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput079() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.stat.descriptive.SummaryStatistics", "org.apache.commons.math.stat.descriptive.SummaryStatistics", "addValue", new String[]{"double"}, new String[]{"-0.9999999999999999"}, false, 0, new String[][]{{"org.apache.commons.math.stat.descriptive.SummaryStatistics", "getMin", ""}}, 3);
  assertNull(actual);
  assertEquals("receiver state after the call", "SummaryStatistics:\nn: 1\nmin: -0.9999999999999999\nmax: -0.9999999999999999\nmean: -0.9999999999999999\ngeometric mean: NaN\nvariance: 0.0\nsum of squares: 0.9999999999999998\nstandard deviation: 0.0\nsum of ...#492#-468531316", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput080() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.stat.descriptive.SummaryStatistics", "org.apache.commons.math.stat.descriptive.SummaryStatistics", "getMeanImpl", new String[]{}, new String[]{}, false, 5, new String[][]{{"org.apache.commons.math.stat.descriptive.SummaryStatistics", "getSumsq", ""}}, 1);
  assertNotNull(actual);
  assertEquals("org.apache.commons.math.stat.descriptive.moment.Mean", actual.getClass().getName());
  assertEquals("{getData=null, getN=0, getResult=NaN}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "SummaryStatistics:\nn: 0\nmin: NaN\nmax: NaN\nmean: NaN\ngeometric mean: NaN\nvariance: NaN\nsum of squares: 0.0\nstandard deviation: NaN\nsum of logs: 0.0\n {getGeometricMean=NaN, getMax=NaN, getMean=NaN, getM...#350#2146862523", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput081() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.stat.descriptive.SummaryStatistics", "org.apache.commons.math.stat.descriptive.SummaryStatistics", "getMean", new String[]{}, new String[]{}, false, 7, new String[][]{}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("NaN", String.valueOf(actual));
  assertEquals("receiver state after the call", "SummaryStatistics:\nn: 0\nmin: NaN\nmax: NaN\nmean: NaN\ngeometric mean: NaN\nvariance: NaN\nsum of squares: 0.0\nstandard deviation: NaN\nsum of logs: 0.0\n {getGeometricMean=NaN, getMax=NaN, getMean=NaN, getM...#350#2146862523", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput082() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.stat.descriptive.SummaryStatistics", "org.apache.commons.math.stat.descriptive.SummaryStatistics", "setSumLogImpl", new String[]{"org.apache.commons.math.stat.descriptive.StorelessUnivariateStatistic"}, new String[]{"<sample:11>"}, false, 5, new String[][]{}, 2);
  assertNull(actual);
  assertEquals("receiver state after the call", "SummaryStatistics:\nn: 0\nmin: NaN\nmax: NaN\nmean: NaN\ngeometric mean: 0.8824969025845955\nvariance: NaN\nsum of squares: 0.0\nstandard deviation: NaN\nsum of logs: -1.0\n {getGeometricMean=0.8824969025845955...#382#-1215086557", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput083() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.stat.descriptive.SummaryStatistics", "org.apache.commons.math.stat.descriptive.SummaryStatistics", "getN", new String[]{}, new String[]{}, false, 5, new String[][]{{"org.apache.commons.math.stat.descriptive.SummaryStatistics", "getSumsqImpl", ""}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Long", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "SummaryStatistics:\nn: 0\nmin: NaN\nmax: NaN\nmean: NaN\ngeometric mean: NaN\nvariance: NaN\nsum of squares: 0.0\nstandard deviation: NaN\nsum of logs: 0.0\n {getGeometricMean=NaN, getMax=NaN, getMean=NaN, getM...#350#2146862523", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput084() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.stat.descriptive.SummaryStatistics", "org.apache.commons.math.stat.descriptive.SummaryStatistics", "equals", new String[]{"java.lang.Object"}, new String[]{"<s:key>"}, false, 0, new String[][]{{"org.apache.commons.math.stat.descriptive.SummaryStatistics", "setSumsqImpl", "org.apache.commons.math.stat.descriptive.StorelessUnivariateStatistic", "<sample:5>"}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "SummaryStatistics:\nn: 0\nmin: NaN\nmax: NaN\nmean: NaN\ngeometric mean: NaN\nvariance: NaN\nsum of squares: -Infinity\nstandard deviation: NaN\nsum of logs: 0.0\n {getGeometricMean=NaN, getMax=NaN, getMean=NaN...#362#114820443", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput085() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math.stat.descriptive.SummaryStatistics", "org.apache.commons.math.stat.descriptive.SummaryStatistics", "getSummary", new String[]{}, new String[]{}, false, 0, null, 1), new String[][]{{"getN", "", "0"}, {"getMean", "", "2"}});
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("NaN", String.valueOf(actual));
  assertEquals("receiver state after the call", "SummaryStatistics:\nn: 0\nmin: NaN\nmax: NaN\nmean: NaN\ngeometric mean: NaN\nvariance: NaN\nsum of squares: 0.0\nstandard deviation: NaN\nsum of logs: 0.0\n {getGeometricMean=NaN, getMax=NaN, getMean=NaN, getM...#350#2146862523", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput086() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math.stat.descriptive.SummaryStatistics", "org.apache.commons.math.stat.descriptive.SummaryStatistics", "copy", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.math.stat.descriptive.SummaryStatistics", "setSumImpl", "org.apache.commons.math.stat.descriptive.StorelessUnivariateStatistic", "<sample:3>"}}, 3), new String[][]{{"getGeometricMean", "", "6"}});
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("NaN", String.valueOf(actual));
  assertEquals("receiver state after the call", "SummaryStatistics:\nn: 0\nmin: NaN\nmax: NaN\nmean: NaN\ngeometric mean: NaN\nvariance: NaN\nsum of squares: 0.0\nstandard deviation: NaN\nsum of logs: 0.0\n {getGeometricMean=NaN, getMax=NaN, getMean=NaN, getM...#350#221329212", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput087() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.stat.descriptive.SummaryStatistics", "org.apache.commons.math.stat.descriptive.SummaryStatistics", "equals", new String[]{"java.lang.Object"}, new String[]{"<s:>"}, false, 0, null, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "SummaryStatistics:\nn: 0\nmin: NaN\nmax: NaN\nmean: NaN\ngeometric mean: NaN\nvariance: NaN\nsum of squares: 0.0\nstandard deviation: NaN\nsum of logs: 0.0\n {getGeometricMean=NaN, getMax=NaN, getMean=NaN, getM...#350#2146862523", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput088() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.stat.descriptive.SummaryStatistics", "org.apache.commons.math.stat.descriptive.SummaryStatistics", "getMinImpl", new String[]{}, new String[]{}, false, 2, new String[][]{}, 1);
  assertNotNull(actual);
  assertEquals("org.apache.commons.math.stat.descriptive.rank.Min", actual.getClass().getName());
  assertEquals("{getData=null, getN=0, getResult=NaN}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "SummaryStatistics:\nn: 0\nmin: NaN\nmax: NaN\nmean: NaN\ngeometric mean: NaN\nvariance: NaN\nsum of squares: 0.0\nstandard deviation: NaN\nsum of logs: 0.0\n {getGeometricMean=NaN, getMax=NaN, getMean=NaN, getM...#350#2146862523", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput089() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.stat.descriptive.SummaryStatistics", "org.apache.commons.math.stat.descriptive.SummaryStatistics", "setMinImpl", new String[]{"org.apache.commons.math.stat.descriptive.StorelessUnivariateStatistic"}, new String[]{"<sample:4>"}, false);
  assertNull(actual);
  assertEquals("receiver state after the call", "SummaryStatistics:\nn: 0\nmin: NaN\nmax: NaN\nmean: NaN\ngeometric mean: NaN\nvariance: NaN\nsum of squares: 0.0\nstandard deviation: NaN\nsum of logs: 0.0\n {getGeometricMean=NaN, getMax=NaN, getMean=NaN, getM...#350#2146862523", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput090() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.stat.descriptive.SummaryStatistics", "org.apache.commons.math.stat.descriptive.SummaryStatistics", "getGeoMeanImpl", new String[]{}, new String[]{}, false, 1, new String[][]{});
  assertNotNull(actual);
  assertEquals("org.apache.commons.math.stat.descriptive.moment.GeometricMean", actual.getClass().getName());
  assertEquals("{getData=null, getN=0, getResult=NaN}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "SummaryStatistics:\nn: 0\nmin: NaN\nmax: NaN\nmean: NaN\ngeometric mean: NaN\nvariance: NaN\nsum of squares: 0.0\nstandard deviation: NaN\nsum of logs: 0.0\n {getGeometricMean=NaN, getMax=NaN, getMean=NaN, getM...#350#2146862523", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput091() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.stat.descriptive.SummaryStatistics", "org.apache.commons.math.stat.descriptive.SummaryStatistics", "equals", new String[]{"java.lang.Object"}, new String[]{"<b:true>"}, false, 0, new String[][]{{"org.apache.commons.math.stat.descriptive.SummaryStatistics", "getGeometricMean", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "SummaryStatistics:\nn: 0\nmin: NaN\nmax: NaN\nmean: NaN\ngeometric mean: NaN\nvariance: NaN\nsum of squares: 0.0\nstandard deviation: NaN\nsum of logs: 0.0\n {getGeometricMean=NaN, getMax=NaN, getMean=NaN, getM...#350#2146862523", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput092() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.stat.descriptive.SummaryStatistics", "org.apache.commons.math.stat.descriptive.SummaryStatistics", "getMax", new String[]{}, new String[]{}, false, 7, new String[][]{});
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("NaN", String.valueOf(actual));
  assertEquals("receiver state after the call", "SummaryStatistics:\nn: 0\nmin: NaN\nmax: NaN\nmean: NaN\ngeometric mean: NaN\nvariance: NaN\nsum of squares: 0.0\nstandard deviation: NaN\nsum of logs: 0.0\n {getGeometricMean=NaN, getMax=NaN, getMean=NaN, getM...#350#2146862523", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput093() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.stat.descriptive.SummaryStatistics", "org.apache.commons.math.stat.descriptive.SummaryStatistics", "getSecondMoment", new String[]{}, new String[]{}, false, 2, new String[][]{{"org.apache.commons.math.stat.descriptive.SummaryStatistics", "copy", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("NaN", String.valueOf(actual));
  assertEquals("receiver state after the call", "SummaryStatistics:\nn: 0\nmin: NaN\nmax: NaN\nmean: NaN\ngeometric mean: NaN\nvariance: NaN\nsum of squares: 0.0\nstandard deviation: NaN\nsum of logs: 0.0\n {getGeometricMean=NaN, getMax=NaN, getMean=NaN, getM...#350#2146862523", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput094() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.stat.descriptive.SummaryStatistics", "org.apache.commons.math.stat.descriptive.SummaryStatistics", "getVariance", new String[]{}, new String[]{}, false, 6, new String[][]{});
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("NaN", String.valueOf(actual));
  assertEquals("receiver state after the call", "SummaryStatistics:\nn: 0\nmin: NaN\nmax: NaN\nmean: NaN\ngeometric mean: NaN\nvariance: NaN\nsum of squares: 0.0\nstandard deviation: NaN\nsum of logs: 0.0\n {getGeometricMean=NaN, getMax=NaN, getMean=NaN, getM...#350#2146862523", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput095() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.stat.descriptive.SummaryStatistics", "org.apache.commons.math.stat.descriptive.SummaryStatistics", "getPopulationVariance", new String[]{}, new String[]{}, false, 1, new String[][]{{"org.apache.commons.math.stat.descriptive.SummaryStatistics", "getMax", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("NaN", String.valueOf(actual));
  assertEquals("receiver state after the call", "SummaryStatistics:\nn: 0\nmin: NaN\nmax: NaN\nmean: NaN\ngeometric mean: NaN\nvariance: NaN\nsum of squares: 0.0\nstandard deviation: NaN\nsum of logs: 0.0\n {getGeometricMean=NaN, getMax=NaN, getMean=NaN, getM...#350#2146862523", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput096() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.stat.descriptive.SummaryStatistics", "org.apache.commons.math.stat.descriptive.SummaryStatistics", "copy", new String[]{"org.apache.commons.math.stat.descriptive.SummaryStatistics", "org.apache.commons.math.stat.descriptive.SummaryStatistics"}, new String[]{"<sample:9>", "<sample:0>"}, true);
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput097() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.stat.descriptive.SummaryStatistics", "org.apache.commons.math.stat.descriptive.SummaryStatistics", "setSumsqImpl", new String[]{"org.apache.commons.math.stat.descriptive.StorelessUnivariateStatistic"}, new String[]{"<sample:6>"}, false, 5, new String[][]{{"org.apache.commons.math.stat.descriptive.SummaryStatistics", "getSecondMoment", ""}});
  assertNull(actual);
  assertEquals("receiver state after the call", "SummaryStatistics:\nn: 0\nmin: NaN\nmax: NaN\nmean: NaN\ngeometric mean: NaN\nvariance: NaN\nsum of squares: NaN\nstandard deviation: NaN\nsum of logs: 0.0\n {getGeometricMean=NaN, getMax=NaN, getMean=NaN, getM...#350#-1265085157", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput098() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.stat.descriptive.SummaryStatistics", "org.apache.commons.math.stat.descriptive.SummaryStatistics", "getMean", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.math.stat.descriptive.SummaryStatistics", "getMin", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("NaN", String.valueOf(actual));
  assertEquals("receiver state after the call", "SummaryStatistics:\nn: 0\nmin: NaN\nmax: NaN\nmean: NaN\ngeometric mean: NaN\nvariance: NaN\nsum of squares: 0.0\nstandard deviation: NaN\nsum of logs: 0.0\n {getGeometricMean=NaN, getMax=NaN, getMean=NaN, getM...#350#2146862523", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput099() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.stat.descriptive.SummaryStatistics", "org.apache.commons.math.stat.descriptive.SummaryStatistics", "getPopulationVariance", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.math.stat.descriptive.SummaryStatistics", "getSumsqImpl", ""}, {"org.apache.commons.math.stat.descriptive.SummaryStatistics", "getSumOfLogs", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("NaN", String.valueOf(actual));
  assertEquals("receiver state after the call", "SummaryStatistics:\nn: 0\nmin: NaN\nmax: NaN\nmean: NaN\ngeometric mean: NaN\nvariance: NaN\nsum of squares: 0.0\nstandard deviation: NaN\nsum of logs: 0.0\n {getGeometricMean=NaN, getMax=NaN, getMean=NaN, getM...#350#2146862523", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput100() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.stat.descriptive.SummaryStatistics", "org.apache.commons.math.stat.descriptive.SummaryStatistics", "clear", new String[]{}, new String[]{}, false);
  assertNull(actual);
  assertEquals("receiver state after the call", "SummaryStatistics:\nn: 0\nmin: NaN\nmax: NaN\nmean: NaN\ngeometric mean: NaN\nvariance: NaN\nsum of squares: 0.0\nstandard deviation: NaN\nsum of logs: 0.0\n {getGeometricMean=NaN, getMax=NaN, getMean=NaN, getM...#350#2146862523", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput101() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.stat.descriptive.SummaryStatistics", "org.apache.commons.math.stat.descriptive.SummaryStatistics", "toString", new String[]{}, new String[]{}, false, 1, new String[][]{{"org.apache.commons.math.stat.descriptive.SummaryStatistics", "getGeometricMean", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("SummaryStatistics:\nn: 0\nmin: NaN\nmax: NaN\nmean: NaN\ngeometric mean: NaN\nvariance: NaN\nsum of squares: 0.0\nstandard deviation: NaN\nsum of logs: 0.0\n", String.valueOf(actual));
  assertEquals("receiver state after the call", "SummaryStatistics:\nn: 0\nmin: NaN\nmax: NaN\nmean: NaN\ngeometric mean: NaN\nvariance: NaN\nsum of squares: 0.0\nstandard deviation: NaN\nsum of logs: 0.0\n {getGeometricMean=NaN, getMax=NaN, getMean=NaN, getM...#350#2146862523", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput102() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.stat.descriptive.SummaryStatistics", "org.apache.commons.math.stat.descriptive.SummaryStatistics", "setSumImpl", new String[]{"org.apache.commons.math.stat.descriptive.StorelessUnivariateStatistic"}, new String[]{"<sample:4>"}, false);
  assertNull(actual);
  assertEquals("receiver state after the call", "SummaryStatistics:\nn: 0\nmin: NaN\nmax: NaN\nmean: NaN\ngeometric mean: NaN\nvariance: NaN\nsum of squares: 0.0\nstandard deviation: NaN\nsum of logs: 0.0\n {getGeometricMean=NaN, getMax=NaN, getMean=NaN, getM...#350#424382564", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput103() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.stat.descriptive.SummaryStatistics", "org.apache.commons.math.stat.descriptive.SummaryStatistics", "setGeoMeanImpl", new String[]{"org.apache.commons.math.stat.descriptive.StorelessUnivariateStatistic"}, new String[]{"<sample:2>"}, false, 4, new String[][]{});
  assertNull(actual);
  assertEquals("receiver state after the call", "SummaryStatistics:\nn: 0\nmin: NaN\nmax: NaN\nmean: NaN\ngeometric mean: 0.0\nvariance: NaN\nsum of squares: 0.0\nstandard deviation: NaN\nsum of logs: 0.0\n {getGeometricMean=0.0, getMax=NaN, getMean=NaN, getM...#350#-82019827", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput104() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math.stat.descriptive.SummaryStatistics", "org.apache.commons.math.stat.descriptive.SummaryStatistics", "getGeoMeanImpl", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.math.stat.descriptive.SummaryStatistics", "clear", ""}}), new String[][]{{"incrementAll", "double[],int,int", "4"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("org.apache.commons.math.exception.NumberIsTooLargeException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput105() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.stat.descriptive.SummaryStatistics", "org.apache.commons.math.stat.descriptive.SummaryStatistics", "getGeometricMean", new String[]{}, new String[]{}, false, 7, new String[][]{});
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("NaN", String.valueOf(actual));
  assertEquals("receiver state after the call", "SummaryStatistics:\nn: 0\nmin: NaN\nmax: NaN\nmean: NaN\ngeometric mean: NaN\nvariance: NaN\nsum of squares: 0.0\nstandard deviation: NaN\nsum of logs: 0.0\n {getGeometricMean=NaN, getMax=NaN, getMean=NaN, getM...#350#2146862523", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput106() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.stat.descriptive.SummaryStatistics", "org.apache.commons.math.stat.descriptive.SummaryStatistics", "hashCode", new String[]{}, new String[]{}, false, 1, new String[][]{{"org.apache.commons.math.stat.descriptive.SummaryStatistics", "clear", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("-1170640609", String.valueOf(actual));
  assertEquals("receiver state after the call", "SummaryStatistics:\nn: 0\nmin: NaN\nmax: NaN\nmean: NaN\ngeometric mean: NaN\nvariance: NaN\nsum of squares: 0.0\nstandard deviation: NaN\nsum of logs: 0.0\n {getGeometricMean=NaN, getMax=NaN, getMean=NaN, getM...#350#2146862523", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput107() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.stat.descriptive.SummaryStatistics", "org.apache.commons.math.stat.descriptive.SummaryStatistics", "getSumsqImpl", new String[]{}, new String[]{}, false, 1, new String[][]{});
  assertNotNull(actual);
  assertEquals("org.apache.commons.math.stat.descriptive.summary.SumOfSquares", actual.getClass().getName());
  assertEquals("{getData=null, getN=0, getResult=0.0}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "SummaryStatistics:\nn: 0\nmin: NaN\nmax: NaN\nmean: NaN\ngeometric mean: NaN\nvariance: NaN\nsum of squares: 0.0\nstandard deviation: NaN\nsum of logs: 0.0\n {getGeometricMean=NaN, getMax=NaN, getMean=NaN, getM...#350#2146862523", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput108() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.stat.descriptive.SummaryStatistics", "org.apache.commons.math.stat.descriptive.SummaryStatistics", "getN", new String[]{}, new String[]{}, false, 1, new String[][]{});
  assertNotNull(actual);
  assertEquals("java.lang.Long", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "SummaryStatistics:\nn: 0\nmin: NaN\nmax: NaN\nmean: NaN\ngeometric mean: NaN\nvariance: NaN\nsum of squares: 0.0\nstandard deviation: NaN\nsum of logs: 0.0\n {getGeometricMean=NaN, getMax=NaN, getMean=NaN, getM...#350#2146862523", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput109() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.stat.descriptive.SummaryStatistics", "org.apache.commons.math.stat.descriptive.SummaryStatistics", "setSumLogImpl", new String[]{"org.apache.commons.math.stat.descriptive.StorelessUnivariateStatistic"}, new String[]{"<sample:4>"}, false, 3, new String[][]{{"org.apache.commons.math.stat.descriptive.SummaryStatistics", "getMax", ""}});
  assertNull(actual);
  assertEquals("receiver state after the call", "SummaryStatistics:\nn: 0\nmin: NaN\nmax: NaN\nmean: NaN\ngeometric mean: NaN\nvariance: NaN\nsum of squares: 0.0\nstandard deviation: NaN\nsum of logs: NaN\n {getGeometricMean=NaN, getMax=NaN, getMean=NaN, getM...#350#-352706035", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput110() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.stat.descriptive.SummaryStatistics", "org.apache.commons.math.stat.descriptive.SummaryStatistics", "getSum", new String[]{}, new String[]{}, false, 7, new String[][]{});
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("0.0", String.valueOf(actual));
  assertEquals("receiver state after the call", "SummaryStatistics:\nn: 0\nmin: NaN\nmax: NaN\nmean: NaN\ngeometric mean: NaN\nvariance: NaN\nsum of squares: 0.0\nstandard deviation: NaN\nsum of logs: 0.0\n {getGeometricMean=NaN, getMax=NaN, getMean=NaN, getM...#350#2146862523", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput111() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.stat.descriptive.SummaryStatistics", "org.apache.commons.math.stat.descriptive.SummaryStatistics", "getStandardDeviation", new String[]{}, new String[]{}, false, 2, new String[][]{});
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("NaN", String.valueOf(actual));
  assertEquals("receiver state after the call", "SummaryStatistics:\nn: 0\nmin: NaN\nmax: NaN\nmean: NaN\ngeometric mean: NaN\nvariance: NaN\nsum of squares: 0.0\nstandard deviation: NaN\nsum of logs: 0.0\n {getGeometricMean=NaN, getMax=NaN, getMean=NaN, getM...#350#2146862523", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput112() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.stat.descriptive.SummaryStatistics", "org.apache.commons.math.stat.descriptive.SummaryStatistics", "getGeoMeanImpl", new String[]{}, new String[]{}, false, 5, new String[][]{{"org.apache.commons.math.stat.descriptive.SummaryStatistics", "setMeanImpl", "org.apache.commons.math.stat.descriptive.StorelessUnivariateStatistic", "<sample:0>"}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.math.stat.descriptive.moment.GeometricMean", actual.getClass().getName());
  assertEquals("{getData=null, getN=0, getResult=NaN}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "SummaryStatistics:\nn: 0\nmin: NaN\nmax: NaN\nmean: -Infinity\ngeometric mean: NaN\nvariance: NaN\nsum of squares: 0.0\nstandard deviation: NaN\nsum of logs: 0.0\n {getGeometricMean=NaN, getMax=NaN, getMean=-In...#362#-1687875013", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput113() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.stat.descriptive.SummaryStatistics", "org.apache.commons.math.stat.descriptive.SummaryStatistics", "copy", new String[]{}, new String[]{}, false, 2, new String[][]{});
  assertNotNull(actual);
  assertEquals("org.apache.commons.math.stat.descriptive.SummaryStatistics", actual.getClass().getName());
  assertEquals("SummaryStatistics:\nn: 0\nmin: NaN\nmax: NaN\nmean: NaN\ngeometric mean: NaN\nvariance: NaN\nsum of squares: 0.0\nstandard deviation: NaN\nsum of logs: 0.0\n {getGeometricMean=NaN, getMax=NaN, getMean=NaN, getM...#350#2146862523", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "SummaryStatistics:\nn: 0\nmin: NaN\nmax: NaN\nmean: NaN\ngeometric mean: NaN\nvariance: NaN\nsum of squares: 0.0\nstandard deviation: NaN\nsum of logs: 0.0\n {getGeometricMean=NaN, getMax=NaN, getMean=NaN, getM...#350#2146862523", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput114() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.stat.descriptive.SummaryStatistics", "org.apache.commons.math.stat.descriptive.SummaryStatistics", "getMeanImpl", new String[]{}, new String[]{}, false);
  assertNotNull(actual);
  assertEquals("org.apache.commons.math.stat.descriptive.moment.Mean", actual.getClass().getName());
  assertEquals("{getData=null, getN=0, getResult=NaN}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "SummaryStatistics:\nn: 0\nmin: NaN\nmax: NaN\nmean: NaN\ngeometric mean: NaN\nvariance: NaN\nsum of squares: 0.0\nstandard deviation: NaN\nsum of logs: 0.0\n {getGeometricMean=NaN, getMax=NaN, getMean=NaN, getM...#350#2146862523", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput115() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.stat.descriptive.SummaryStatistics", "org.apache.commons.math.stat.descriptive.SummaryStatistics", "getSumOfLogs", new String[]{}, new String[]{}, false, 3, new String[][]{});
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("0.0", String.valueOf(actual));
  assertEquals("receiver state after the call", "SummaryStatistics:\nn: 0\nmin: NaN\nmax: NaN\nmean: NaN\ngeometric mean: NaN\nvariance: NaN\nsum of squares: 0.0\nstandard deviation: NaN\nsum of logs: 0.0\n {getGeometricMean=NaN, getMax=NaN, getMean=NaN, getM...#350#2146862523", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput116() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math.stat.descriptive.SummaryStatistics", "org.apache.commons.math.stat.descriptive.SummaryStatistics", "getMeanImpl", new String[]{}, new String[]{}, false, 1, new String[][]{}), new String[][]{{"getData", "", "2"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "SummaryStatistics:\nn: 0\nmin: NaN\nmax: NaN\nmean: NaN\ngeometric mean: NaN\nvariance: NaN\nsum of squares: 0.0\nstandard deviation: NaN\nsum of logs: 0.0\n {getGeometricMean=NaN, getMax=NaN, getMean=NaN, getM...#350#2146862523", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput117() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.stat.descriptive.SummaryStatistics", "org.apache.commons.math.stat.descriptive.SummaryStatistics", "getMin", new String[]{}, new String[]{}, false, 1, new String[][]{{"org.apache.commons.math.stat.descriptive.SummaryStatistics", "getStandardDeviation", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("NaN", String.valueOf(actual));
  assertEquals("receiver state after the call", "SummaryStatistics:\nn: 0\nmin: NaN\nmax: NaN\nmean: NaN\ngeometric mean: NaN\nvariance: NaN\nsum of squares: 0.0\nstandard deviation: NaN\nsum of logs: 0.0\n {getGeometricMean=NaN, getMax=NaN, getMean=NaN, getM...#350#2146862523", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput118() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.stat.descriptive.SummaryStatistics", "org.apache.commons.math.stat.descriptive.SummaryStatistics", "setSumsqImpl", new String[]{"org.apache.commons.math.stat.descriptive.StorelessUnivariateStatistic"}, new String[]{"<sample:1>"}, false, 1, new String[][]{});
  assertNull(actual);
  assertEquals("receiver state after the call", "SummaryStatistics:\nn: 0\nmin: NaN\nmax: NaN\nmean: NaN\ngeometric mean: NaN\nvariance: NaN\nsum of squares: -1.0\nstandard deviation: NaN\nsum of logs: 0.0\n {getGeometricMean=NaN, getMax=NaN, getMean=NaN, get...#352#-536078183", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput119() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.stat.descriptive.SummaryStatistics", "org.apache.commons.math.stat.descriptive.SummaryStatistics", "getSumLogImpl", new String[]{}, new String[]{}, false, 1, new String[][]{});
  assertNotNull(actual);
  assertEquals("org.apache.commons.math.stat.descriptive.summary.SumOfLogs", actual.getClass().getName());
  assertEquals("{getData=null, getN=0, getResult=0.0}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "SummaryStatistics:\nn: 0\nmin: NaN\nmax: NaN\nmean: NaN\ngeometric mean: NaN\nvariance: NaN\nsum of squares: 0.0\nstandard deviation: NaN\nsum of logs: 0.0\n {getGeometricMean=NaN, getMax=NaN, getMean=NaN, getM...#350#2146862523", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput120() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math.stat.descriptive.SummaryStatistics", "org.apache.commons.math.stat.descriptive.SummaryStatistics", "getGeoMeanImpl", new String[]{}, new String[]{}, false, 5, new String[][]{{"org.apache.commons.math.stat.descriptive.SummaryStatistics", "setMaxImpl", "org.apache.commons.math.stat.descriptive.StorelessUnivariateStatistic", "<sample:8>"}}), new String[][]{{"incrementAll", "double[]", "6"}, {"increment", "double", "3"}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.math.stat.descriptive.moment.GeometricMean", actual.getClass().getName());
  assertEquals("{getData=null, getN=2, getResult=0.0}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "SummaryStatistics:\nn: 0\nmin: NaN\nmax: NaN\nmean: NaN\ngeometric mean: 0.0\nvariance: NaN\nsum of squares: 0.0\nstandard deviation: NaN\nsum of logs: -Infinity\n {getGeometricMean=0.0, getMax=NaN, getMean=NaN...#362#-1804974637", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput121() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.stat.descriptive.SummaryStatistics", "org.apache.commons.math.stat.descriptive.SummaryStatistics", "getPopulationVariance", new String[]{}, new String[]{}, false, 2, new String[][]{{"org.apache.commons.math.stat.descriptive.SummaryStatistics", "getMaxImpl", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("NaN", String.valueOf(actual));
  assertEquals("receiver state after the call", "SummaryStatistics:\nn: 0\nmin: NaN\nmax: NaN\nmean: NaN\ngeometric mean: NaN\nvariance: NaN\nsum of squares: 0.0\nstandard deviation: NaN\nsum of logs: 0.0\n {getGeometricMean=NaN, getMax=NaN, getMean=NaN, getM...#350#2146862523", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput122() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math.stat.descriptive.SummaryStatistics", "org.apache.commons.math.stat.descriptive.SummaryStatistics", "getMeanImpl", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.math.stat.descriptive.SummaryStatistics", "getSecondMoment", ""}}), new String[][]{{"evaluate", "", "0"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("org.apache.commons.math.exception.NullArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput123() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.stat.descriptive.SummaryStatistics", "org.apache.commons.math.stat.descriptive.SummaryStatistics", "getMax", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.math.stat.descriptive.SummaryStatistics", "getSumImpl", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("NaN", String.valueOf(actual));
  assertEquals("receiver state after the call", "SummaryStatistics:\nn: 0\nmin: NaN\nmax: NaN\nmean: NaN\ngeometric mean: NaN\nvariance: NaN\nsum of squares: 0.0\nstandard deviation: NaN\nsum of logs: 0.0\n {getGeometricMean=NaN, getMax=NaN, getMean=NaN, getM...#350#2146862523", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput124() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.stat.descriptive.SummaryStatistics", "org.apache.commons.math.stat.descriptive.SummaryStatistics", "setGeoMeanImpl", new String[]{"org.apache.commons.math.stat.descriptive.StorelessUnivariateStatistic"}, new String[]{"<sample:1>"}, false, 0, new String[][]{{"org.apache.commons.math.stat.descriptive.SummaryStatistics", "getPopulationVariance", ""}});
  assertNull(actual);
  assertEquals("receiver state after the call", "SummaryStatistics:\nn: 0\nmin: NaN\nmax: NaN\nmean: NaN\ngeometric mean: -1.0\nvariance: NaN\nsum of squares: 0.0\nstandard deviation: NaN\nsum of logs: 0.0\n {getGeometricMean=-1.0, getMax=NaN, getMean=NaN, ge...#352#-1943654327", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput125() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.stat.descriptive.SummaryStatistics", "org.apache.commons.math.stat.descriptive.SummaryStatistics", "getSumImpl", new String[]{}, new String[]{}, false, 5, new String[][]{});
  assertNotNull(actual);
  assertEquals("org.apache.commons.math.stat.descriptive.summary.Sum", actual.getClass().getName());
  assertEquals("{getData=null, getN=0, getResult=0.0}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "SummaryStatistics:\nn: 0\nmin: NaN\nmax: NaN\nmean: NaN\ngeometric mean: NaN\nvariance: NaN\nsum of squares: 0.0\nstandard deviation: NaN\nsum of logs: 0.0\n {getGeometricMean=NaN, getMax=NaN, getMean=NaN, getM...#350#2146862523", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput126() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.stat.descriptive.SummaryStatistics", "org.apache.commons.math.stat.descriptive.SummaryStatistics", "getMinImpl", new String[]{}, new String[]{}, false, 5, new String[][]{{"org.apache.commons.math.stat.descriptive.SummaryStatistics", "getSumImpl", ""}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.math.stat.descriptive.rank.Min", actual.getClass().getName());
  assertEquals("{getData=null, getN=0, getResult=NaN}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "SummaryStatistics:\nn: 0\nmin: NaN\nmax: NaN\nmean: NaN\ngeometric mean: NaN\nvariance: NaN\nsum of squares: 0.0\nstandard deviation: NaN\nsum of logs: 0.0\n {getGeometricMean=NaN, getMax=NaN, getMean=NaN, getM...#350#2146862523", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput127() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.stat.descriptive.SummaryStatistics", "org.apache.commons.math.stat.descriptive.SummaryStatistics", "setMeanImpl", new String[]{"org.apache.commons.math.stat.descriptive.StorelessUnivariateStatistic"}, new String[]{"<sample:4>"}, false, 3, new String[][]{});
  assertNull(actual);
  assertEquals("receiver state after the call", "SummaryStatistics:\nn: 0\nmin: NaN\nmax: NaN\nmean: NaN\ngeometric mean: NaN\nvariance: NaN\nsum of squares: 0.0\nstandard deviation: NaN\nsum of logs: 0.0\n {getGeometricMean=NaN, getMax=NaN, getMean=NaN, getM...#350#2146862523", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput128() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.stat.descriptive.SummaryStatistics", "org.apache.commons.math.stat.descriptive.SummaryStatistics", "setVarianceImpl", new String[]{"org.apache.commons.math.stat.descriptive.StorelessUnivariateStatistic"}, new String[]{"<sample:5>"}, false, 1, new String[][]{{"org.apache.commons.math.stat.descriptive.SummaryStatistics", "getSumsqImpl", ""}});
  assertNull(actual);
  assertEquals("receiver state after the call", "SummaryStatistics:\nn: 0\nmin: NaN\nmax: NaN\nmean: NaN\ngeometric mean: NaN\nvariance: -Infinity\nsum of squares: 0.0\nstandard deviation: NaN\nsum of logs: 0.0\n {getGeometricMean=NaN, getMax=NaN, getMean=NaN...#362#302438663", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput129() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.stat.descriptive.SummaryStatistics", "org.apache.commons.math.stat.descriptive.SummaryStatistics", "getSummary", new String[]{}, new String[]{}, false, 1, new String[][]{});
  assertNotNull(actual);
  assertEquals("org.apache.commons.math.stat.descriptive.StatisticalSummaryValues", actual.getClass().getName());
  assertEquals("StatisticalSummaryValues:\nn: 0\nmin: NaN\nmax: NaN\nmean: NaN\nstd dev: NaN\nvariance: NaN\nsum: 0.0\n {getMax=NaN, getMean=NaN, getMin=NaN, getN=0, getStandardDeviation=NaN, getSum=0.0, getVariance=NaN}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "SummaryStatistics:\nn: 0\nmin: NaN\nmax: NaN\nmean: NaN\ngeometric mean: NaN\nvariance: NaN\nsum of squares: 0.0\nstandard deviation: NaN\nsum of logs: 0.0\n {getGeometricMean=NaN, getMax=NaN, getMean=NaN, getM...#350#2146862523", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput130() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.stat.descriptive.SummaryStatistics", "org.apache.commons.math.stat.descriptive.SummaryStatistics", "getMaxImpl", new String[]{}, new String[]{}, false);
  assertNotNull(actual);
  assertEquals("org.apache.commons.math.stat.descriptive.rank.Max", actual.getClass().getName());
  assertEquals("{getData=null, getN=0, getResult=NaN}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "SummaryStatistics:\nn: 0\nmin: NaN\nmax: NaN\nmean: NaN\ngeometric mean: NaN\nvariance: NaN\nsum of squares: 0.0\nstandard deviation: NaN\nsum of logs: 0.0\n {getGeometricMean=NaN, getMax=NaN, getMean=NaN, getM...#350#2146862523", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput131() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.stat.descriptive.SummaryStatistics", "org.apache.commons.math.stat.descriptive.SummaryStatistics", "getSumsq", new String[]{}, new String[]{}, false, 5, new String[][]{{"org.apache.commons.math.stat.descriptive.SummaryStatistics", "setMaxImpl", "org.apache.commons.math.stat.descriptive.StorelessUnivariateStatistic", "<sample:5>"}});
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("0.0", String.valueOf(actual));
  assertEquals("receiver state after the call", "SummaryStatistics:\nn: 0\nmin: NaN\nmax: -Infinity\nmean: NaN\ngeometric mean: NaN\nvariance: NaN\nsum of squares: 0.0\nstandard deviation: NaN\nsum of logs: 0.0\n {getGeometricMean=NaN, getMax=-Infinity, getMe...#362#441961607", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput132() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.stat.descriptive.SummaryStatistics", "org.apache.commons.math.stat.descriptive.SummaryStatistics", "getSumOfLogs", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.math.stat.descriptive.SummaryStatistics", "setMinImpl", "org.apache.commons.math.stat.descriptive.StorelessUnivariateStatistic", "<sample:9>"}});
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("0.0", String.valueOf(actual));
  assertEquals("receiver state after the call", "SummaryStatistics:\nn: 0\nmin: Infinity\nmax: NaN\nmean: NaN\ngeometric mean: NaN\nvariance: NaN\nsum of squares: 0.0\nstandard deviation: NaN\nsum of logs: 0.0\n {getGeometricMean=NaN, getMax=NaN, getMean=NaN,...#360#1198744659", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput133() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math.stat.descriptive.SummaryStatistics", "org.apache.commons.math.stat.descriptive.SummaryStatistics", "getVarianceImpl", new String[]{}, new String[]{}, false), new String[][]{{"incrementAll", "double[],int,int", "0"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("org.apache.commons.math.exception.NotPositiveException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput134() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.stat.descriptive.SummaryStatistics", "org.apache.commons.math.stat.descriptive.SummaryStatistics", "setVarianceImpl", new String[]{"org.apache.commons.math.stat.descriptive.StorelessUnivariateStatistic"}, new String[]{"<sample:7>"}, false, 0, new String[][]{{"org.apache.commons.math.stat.descriptive.SummaryStatistics", "getPopulationVariance", ""}});
  assertNull(actual);
  assertEquals("receiver state after the call", "SummaryStatistics:\nn: 0\nmin: NaN\nmax: NaN\nmean: NaN\ngeometric mean: NaN\nvariance: 0.0\nsum of squares: 0.0\nstandard deviation: NaN\nsum of logs: 0.0\n {getGeometricMean=NaN, getMax=NaN, getMean=NaN, getM...#350#-507461555", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput135() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.stat.descriptive.SummaryStatistics", "org.apache.commons.math.stat.descriptive.SummaryStatistics", "getSumsq", new String[]{}, new String[]{}, false);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("0.0", String.valueOf(actual));
  assertEquals("receiver state after the call", "SummaryStatistics:\nn: 0\nmin: NaN\nmax: NaN\nmean: NaN\ngeometric mean: NaN\nvariance: NaN\nsum of squares: 0.0\nstandard deviation: NaN\nsum of logs: 0.0\n {getGeometricMean=NaN, getMax=NaN, getMean=NaN, getM...#350#2146862523", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput136() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.stat.descriptive.SummaryStatistics", "org.apache.commons.math.stat.descriptive.SummaryStatistics", "getSumsq", new String[]{}, new String[]{}, false, 1, new String[][]{{"org.apache.commons.math.stat.descriptive.SummaryStatistics", "setSumsqImpl", "org.apache.commons.math.stat.descriptive.StorelessUnivariateStatistic", "<sample:4>"}});
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("NaN", String.valueOf(actual));
  assertEquals("receiver state after the call", "SummaryStatistics:\nn: 0\nmin: NaN\nmax: NaN\nmean: NaN\ngeometric mean: NaN\nvariance: NaN\nsum of squares: NaN\nstandard deviation: NaN\nsum of logs: 0.0\n {getGeometricMean=NaN, getMax=NaN, getMean=NaN, getM...#350#-1265085157", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput137() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.stat.descriptive.SummaryStatistics", "org.apache.commons.math.stat.descriptive.SummaryStatistics", "getSumsq", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.math.stat.descriptive.SummaryStatistics", "setMinImpl", "org.apache.commons.math.stat.descriptive.StorelessUnivariateStatistic", "<sample:11>"}});
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("0.0", String.valueOf(actual));
  assertEquals("receiver state after the call", "SummaryStatistics:\nn: 0\nmin: -1.0\nmax: NaN\nmean: NaN\ngeometric mean: NaN\nvariance: NaN\nsum of squares: 0.0\nstandard deviation: NaN\nsum of logs: 0.0\n {getGeometricMean=NaN, getMax=NaN, getMean=NaN, get...#352#-1502693101", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput138() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.stat.descriptive.SummaryStatistics", "org.apache.commons.math.stat.descriptive.SummaryStatistics", "setGeoMeanImpl", new String[]{"org.apache.commons.math.stat.descriptive.StorelessUnivariateStatistic"}, new String[]{"<sample:0>"}, false, 5, new String[][]{});
  assertNull(actual);
  assertEquals("receiver state after the call", "SummaryStatistics:\nn: 0\nmin: NaN\nmax: NaN\nmean: NaN\ngeometric mean: -Infinity\nvariance: NaN\nsum of squares: 0.0\nstandard deviation: NaN\nsum of logs: 0.0\n {getGeometricMean=-Infinity, getMax=NaN, getMe...#362#722874311", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput139() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.stat.descriptive.SummaryStatistics", "org.apache.commons.math.stat.descriptive.SummaryStatistics", "setMinImpl", new String[]{"org.apache.commons.math.stat.descriptive.StorelessUnivariateStatistic"}, new String[]{"<sample:2>"}, false);
  assertNull(actual);
  assertEquals("receiver state after the call", "SummaryStatistics:\nn: 0\nmin: 0.0\nmax: NaN\nmean: NaN\ngeometric mean: NaN\nvariance: NaN\nsum of squares: 0.0\nstandard deviation: NaN\nsum of logs: 0.0\n {getGeometricMean=NaN, getMax=NaN, getMean=NaN, getM...#350#-1067426903", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput140() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math.stat.descriptive.SummaryStatistics", "org.apache.commons.math.stat.descriptive.SummaryStatistics", "getSummary", new String[]{}, new String[]{}, false, 5, new String[][]{{"org.apache.commons.math.stat.descriptive.SummaryStatistics", "getMinImpl", ""}}), new String[][]{{"getMean", "", "7"}});
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("NaN", String.valueOf(actual));
  assertEquals("receiver state after the call", "SummaryStatistics:\nn: 0\nmin: NaN\nmax: NaN\nmean: NaN\ngeometric mean: NaN\nvariance: NaN\nsum of squares: 0.0\nstandard deviation: NaN\nsum of logs: 0.0\n {getGeometricMean=NaN, getMax=NaN, getMean=NaN, getM...#350#2146862523", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput141() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.stat.descriptive.SummaryStatistics", "org.apache.commons.math.stat.descriptive.SummaryStatistics", "setMeanImpl", new String[]{"org.apache.commons.math.stat.descriptive.StorelessUnivariateStatistic"}, new String[]{"<sample:3>"}, false, 7, new String[][]{});
  assertNull(actual);
  assertEquals("receiver state after the call", "SummaryStatistics:\nn: 0\nmin: NaN\nmax: NaN\nmean: 1.0\ngeometric mean: NaN\nvariance: NaN\nsum of squares: 0.0\nstandard deviation: NaN\nsum of logs: 0.0\n {getGeometricMean=NaN, getMax=NaN, getMean=1.0, getM...#350#-883672389", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput142() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.stat.descriptive.SummaryStatistics", "org.apache.commons.math.stat.descriptive.SummaryStatistics", "setMaxImpl", new String[]{"org.apache.commons.math.stat.descriptive.StorelessUnivariateStatistic"}, new String[]{"<sample:5>"}, false, 1, new String[][]{});
  assertNull(actual);
  assertEquals("receiver state after the call", "SummaryStatistics:\nn: 0\nmin: NaN\nmax: -Infinity\nmean: NaN\ngeometric mean: NaN\nvariance: NaN\nsum of squares: 0.0\nstandard deviation: NaN\nsum of logs: 0.0\n {getGeometricMean=NaN, getMax=-Infinity, getMe...#362#441961607", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput143() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.stat.descriptive.SummaryStatistics", "org.apache.commons.math.stat.descriptive.SummaryStatistics", "getMin", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.math.stat.descriptive.SummaryStatistics", "setVarianceImpl", "org.apache.commons.math.stat.descriptive.StorelessUnivariateStatistic", "<sample:5>"}});
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("NaN", String.valueOf(actual));
  assertEquals("receiver state after the call", "SummaryStatistics:\nn: 0\nmin: NaN\nmax: NaN\nmean: NaN\ngeometric mean: NaN\nvariance: -Infinity\nsum of squares: 0.0\nstandard deviation: NaN\nsum of logs: 0.0\n {getGeometricMean=NaN, getMax=NaN, getMean=NaN...#362#302438663", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput144() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math.stat.descriptive.SummaryStatistics", "org.apache.commons.math.stat.descriptive.SummaryStatistics", "getMaxImpl", new String[]{}, new String[]{}, false, 5, new String[][]{{"org.apache.commons.math.stat.descriptive.SummaryStatistics", "copy", ""}}), new String[][]{{"setData", "double[]", "5"}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.math.stat.descriptive.rank.Max", actual.getClass().getName());
  assertEquals("{getData=[-1.0, 0.0, 1.0], getN=0, getResult=NaN}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "SummaryStatistics:\nn: 0\nmin: NaN\nmax: NaN\nmean: NaN\ngeometric mean: NaN\nvariance: NaN\nsum of squares: 0.0\nstandard deviation: NaN\nsum of logs: 0.0\n {getGeometricMean=NaN, getMax=NaN, getMean=NaN, getM...#350#2146862523", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput145() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.stat.descriptive.SummaryStatistics", "org.apache.commons.math.stat.descriptive.SummaryStatistics", "setVarianceImpl", new String[]{"org.apache.commons.math.stat.descriptive.StorelessUnivariateStatistic"}, new String[]{"<sample:1>"}, false);
  assertNull(actual);
  assertEquals("receiver state after the call", "SummaryStatistics:\nn: 0\nmin: NaN\nmax: NaN\nmean: NaN\ngeometric mean: NaN\nvariance: -1.0\nsum of squares: 0.0\nstandard deviation: NaN\nsum of logs: 0.0\n {getGeometricMean=NaN, getMax=NaN, getMean=NaN, get...#352#1435565963", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput146() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.stat.descriptive.SummaryStatistics", "org.apache.commons.math.stat.descriptive.SummaryStatistics", "addValue", new String[]{"double"}, new String[]{"Infinity"}, false);
  assertNull(actual);
  assertEquals("receiver state after the call", "SummaryStatistics:\nn: 1\nmin: Infinity\nmax: Infinity\nmean: Infinity\ngeometric mean: Infinity\nvariance: 0.0\nsum of squares: Infinity\nstandard deviation: 0.0\nsum of logs: Infinity\n {getGeometricMean=Infi...#415#-170326978", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput147() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.stat.descriptive.SummaryStatistics", "org.apache.commons.math.stat.descriptive.SummaryStatistics", "getVariance", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.math.stat.descriptive.SummaryStatistics", "setSumsqImpl", "org.apache.commons.math.stat.descriptive.StorelessUnivariateStatistic", "<sample:0>"}});
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("NaN", String.valueOf(actual));
  assertEquals("receiver state after the call", "SummaryStatistics:\nn: 0\nmin: NaN\nmax: NaN\nmean: NaN\ngeometric mean: NaN\nvariance: NaN\nsum of squares: -Infinity\nstandard deviation: NaN\nsum of logs: 0.0\n {getGeometricMean=NaN, getMax=NaN, getMean=NaN...#362#114820443", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput148() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math.stat.descriptive.SummaryStatistics", "org.apache.commons.math.stat.descriptive.SummaryStatistics", "getSumLogImpl", new String[]{}, new String[]{}, false, 5, new String[][]{}), new String[][]{{"getData", "", "5"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "SummaryStatistics:\nn: 0\nmin: NaN\nmax: NaN\nmean: NaN\ngeometric mean: NaN\nvariance: NaN\nsum of squares: 0.0\nstandard deviation: NaN\nsum of logs: 0.0\n {getGeometricMean=NaN, getMax=NaN, getMean=NaN, getM...#350#2146862523", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput149() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.stat.descriptive.SummaryStatistics", "org.apache.commons.math.stat.descriptive.SummaryStatistics", "setGeoMeanImpl", new String[]{"org.apache.commons.math.stat.descriptive.StorelessUnivariateStatistic"}, new String[]{"<sample:6>"}, false, 1, new String[][]{{"org.apache.commons.math.stat.descriptive.SummaryStatistics", "clear", ""}});
  assertNull(actual);
  assertEquals("receiver state after the call", "SummaryStatistics:\nn: 0\nmin: NaN\nmax: NaN\nmean: NaN\ngeometric mean: NaN\nvariance: NaN\nsum of squares: 0.0\nstandard deviation: NaN\nsum of logs: 0.0\n {getGeometricMean=NaN, getMax=NaN, getMean=NaN, getM...#350#2146862523", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput150() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.stat.descriptive.SummaryStatistics", "org.apache.commons.math.stat.descriptive.SummaryStatistics", "setGeoMeanImpl", new String[]{"org.apache.commons.math.stat.descriptive.StorelessUnivariateStatistic"}, new String[]{"<sample:9>"}, false, 7, new String[][]{{"org.apache.commons.math.stat.descriptive.SummaryStatistics", "setGeoMeanImpl", "org.apache.commons.math.stat.descriptive.StorelessUnivariateStatistic", "<sample:1>"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "SummaryStatistics:\nn: 0\nmin: NaN\nmax: NaN\nmean: NaN\ngeometric mean: Infinity\nvariance: NaN\nsum of squares: 0.0\nstandard deviation: NaN\nsum of logs: 0.0\n {getGeometricMean=Infinity, getMax=NaN, getMean...#360#543719049", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput151() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math.stat.descriptive.SummaryStatistics", "org.apache.commons.math.stat.descriptive.SummaryStatistics", "getSumsqImpl", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.math.stat.descriptive.SummaryStatistics", "setSumsqImpl", "org.apache.commons.math.stat.descriptive.StorelessUnivariateStatistic", "<sample:1>"}}), new String[][]{{"evaluate", "double[]", "0"}});
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("-1.0", String.valueOf(actual));
  assertEquals("receiver state after the call", "SummaryStatistics:\nn: 0\nmin: NaN\nmax: NaN\nmean: NaN\ngeometric mean: NaN\nvariance: NaN\nsum of squares: -1.0\nstandard deviation: NaN\nsum of logs: 0.0\n {getGeometricMean=NaN, getMax=NaN, getMean=NaN, get...#352#-536078183", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput152() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.stat.descriptive.SummaryStatistics", "org.apache.commons.math.stat.descriptive.SummaryStatistics", "getSumImpl", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.math.stat.descriptive.SummaryStatistics", "setMinImpl", "org.apache.commons.math.stat.descriptive.StorelessUnivariateStatistic", "<sample:2>"}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.math.stat.descriptive.summary.Sum", actual.getClass().getName());
  assertEquals("{getData=null, getN=0, getResult=0.0}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "SummaryStatistics:\nn: 0\nmin: 0.0\nmax: NaN\nmean: NaN\ngeometric mean: NaN\nvariance: NaN\nsum of squares: 0.0\nstandard deviation: NaN\nsum of logs: 0.0\n {getGeometricMean=NaN, getMax=NaN, getMean=NaN, getM...#350#-1067426903", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput153() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.stat.descriptive.SummaryStatistics", "org.apache.commons.math.stat.descriptive.SummaryStatistics", "copy", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.math.stat.descriptive.SummaryStatistics", "setMeanImpl", "org.apache.commons.math.stat.descriptive.StorelessUnivariateStatistic", "<sample:11>"}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.math.stat.descriptive.SummaryStatistics", actual.getClass().getName());
  assertEquals("SummaryStatistics:\nn: 0\nmin: NaN\nmax: NaN\nmean: -1.0\ngeometric mean: NaN\nvariance: NaN\nsum of squares: 0.0\nstandard deviation: NaN\nsum of logs: 0.0\n {getGeometricMean=NaN, getMax=NaN, getMean=-1.0, ge...#352#1693008303", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "SummaryStatistics:\nn: 0\nmin: NaN\nmax: NaN\nmean: -1.0\ngeometric mean: NaN\nvariance: NaN\nsum of squares: 0.0\nstandard deviation: NaN\nsum of logs: 0.0\n {getGeometricMean=NaN, getMax=NaN, getMean=-1.0, ge...#352#1693008303", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput154() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.stat.descriptive.SummaryStatistics", "org.apache.commons.math.stat.descriptive.SummaryStatistics", "setVarianceImpl", new String[]{"org.apache.commons.math.stat.descriptive.StorelessUnivariateStatistic"}, new String[]{"<sample:8>"}, false, 5, new String[][]{});
  assertNull(actual);
  assertEquals("receiver state after the call", "SummaryStatistics:\nn: 0\nmin: NaN\nmax: NaN\nmean: NaN\ngeometric mean: NaN\nvariance: NaN\nsum of squares: 0.0\nstandard deviation: NaN\nsum of logs: 0.0\n {getGeometricMean=NaN, getMax=NaN, getMean=NaN, getM...#350#2146862523", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput155() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.stat.descriptive.SummaryStatistics", "org.apache.commons.math.stat.descriptive.SummaryStatistics", "getSumsq", new String[]{}, new String[]{}, false, 4, new String[][]{{"org.apache.commons.math.stat.descriptive.SummaryStatistics", "getMeanImpl", ""}, {"org.apache.commons.math.stat.descriptive.SummaryStatistics", "setMaxImpl", "org.apache.commons.math.stat.descriptive.StorelessUnivariateStatistic", "<sample:11>"}});
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("0.0", String.valueOf(actual));
  assertEquals("receiver state after the call", "SummaryStatistics:\nn: 0\nmin: NaN\nmax: -1.0\nmean: NaN\ngeometric mean: NaN\nvariance: NaN\nsum of squares: 0.0\nstandard deviation: NaN\nsum of logs: 0.0\n {getGeometricMean=NaN, getMax=-1.0, getMean=NaN, ge...#352#-1024419709", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput156() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math.stat.descriptive.SummaryStatistics", "org.apache.commons.math.stat.descriptive.SummaryStatistics", "getGeoMeanImpl", new String[]{}, new String[]{}, false, 4, new String[][]{}), new String[][]{{"getResult", "", "0"}});
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("NaN", String.valueOf(actual));
  assertEquals("receiver state after the call", "SummaryStatistics:\nn: 0\nmin: NaN\nmax: NaN\nmean: NaN\ngeometric mean: NaN\nvariance: NaN\nsum of squares: 0.0\nstandard deviation: NaN\nsum of logs: 0.0\n {getGeometricMean=NaN, getMax=NaN, getMean=NaN, getM...#350#2146862523", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput157() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.stat.descriptive.SummaryStatistics", "org.apache.commons.math.stat.descriptive.SummaryStatistics", "getMax", new String[]{}, new String[]{}, false, 1, new String[][]{{"org.apache.commons.math.stat.descriptive.SummaryStatistics", "copy", ""}, {"org.apache.commons.math.stat.descriptive.SummaryStatistics", "setMinImpl", "org.apache.commons.math.stat.descriptive.StorelessUnivariateStatistic", "<sample:11>"}});
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("NaN", String.valueOf(actual));
  assertEquals("receiver state after the call", "SummaryStatistics:\nn: 0\nmin: -1.0\nmax: NaN\nmean: NaN\ngeometric mean: NaN\nvariance: NaN\nsum of squares: 0.0\nstandard deviation: NaN\nsum of logs: 0.0\n {getGeometricMean=NaN, getMax=NaN, getMean=NaN, get...#352#-1502693101", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput158() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.stat.descriptive.SummaryStatistics", "org.apache.commons.math.stat.descriptive.SummaryStatistics", "equals", new String[]{"java.lang.Object"}, new String[]{"<b:true>"}, false, 7, new String[][]{{"org.apache.commons.math.stat.descriptive.SummaryStatistics", "addValue", "double", "-1.35"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "SummaryStatistics:\nn: 1\nmin: -1.35\nmax: -1.35\nmean: -1.35\ngeometric mean: NaN\nvariance: 0.0\nsum of squares: 1.8225000000000002\nstandard deviation: 0.0\nsum of logs: NaN\n {getGeometricMean=NaN, getMax=-...#394#1549926247", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput159() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math.stat.descriptive.SummaryStatistics", "org.apache.commons.math.stat.descriptive.SummaryStatistics", "getSumImpl", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.math.stat.descriptive.SummaryStatistics", "getMaxImpl", ""}}), new String[][]{{"evaluate", "double[]", "6"}});
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("0.0", String.valueOf(actual));
  assertEquals("receiver state after the call", "SummaryStatistics:\nn: 0\nmin: NaN\nmax: NaN\nmean: NaN\ngeometric mean: NaN\nvariance: NaN\nsum of squares: 0.0\nstandard deviation: NaN\nsum of logs: 0.0\n {getGeometricMean=NaN, getMax=NaN, getMean=NaN, getM...#350#2146862523", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput160() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math.stat.descriptive.SummaryStatistics", "org.apache.commons.math.stat.descriptive.SummaryStatistics", "getSummary", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.math.stat.descriptive.SummaryStatistics", "setVarianceImpl", "org.apache.commons.math.stat.descriptive.StorelessUnivariateStatistic", "<null>"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput161() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.stat.descriptive.SummaryStatistics", "org.apache.commons.math.stat.descriptive.SummaryStatistics", "getMeanImpl", new String[]{}, new String[]{}, false, 5, new String[][]{{"org.apache.commons.math.stat.descriptive.SummaryStatistics", "setMinImpl", "org.apache.commons.math.stat.descriptive.StorelessUnivariateStatistic", "<sample:11>"}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.math.stat.descriptive.moment.Mean", actual.getClass().getName());
  assertEquals("{getData=null, getN=0, getResult=NaN}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "SummaryStatistics:\nn: 0\nmin: -1.0\nmax: NaN\nmean: NaN\ngeometric mean: NaN\nvariance: NaN\nsum of squares: 0.0\nstandard deviation: NaN\nsum of logs: 0.0\n {getGeometricMean=NaN, getMax=NaN, getMean=NaN, get...#352#-1502693101", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput162() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math.stat.descriptive.SummaryStatistics", "org.apache.commons.math.stat.descriptive.SummaryStatistics", "getMaxImpl", new String[]{}, new String[]{}, false), new String[][]{{"getN", "", "5"}, {"evaluate", "double[]", "0"}, {"evaluate", "double[],int,int", "3"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.ArrayIndexOutOfBoundsException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput163() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.stat.descriptive.SummaryStatistics", "org.apache.commons.math.stat.descriptive.SummaryStatistics", "hashCode", new String[]{}, new String[]{}, false, 7, new String[][]{{"org.apache.commons.math.stat.descriptive.SummaryStatistics", "setSumsqImpl", "org.apache.commons.math.stat.descriptive.StorelessUnivariateStatistic", "<sample:3>"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("2018079007", String.valueOf(actual));
  assertEquals("receiver state after the call", "SummaryStatistics:\nn: 0\nmin: NaN\nmax: NaN\nmean: NaN\ngeometric mean: NaN\nvariance: NaN\nsum of squares: 1.0\nstandard deviation: NaN\nsum of logs: 0.0\n {getGeometricMean=NaN, getMax=NaN, getMean=NaN, getM...#350#-139303397", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput164() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math.stat.descriptive.SummaryStatistics", "org.apache.commons.math.stat.descriptive.SummaryStatistics", "getSumImpl", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.math.stat.descriptive.SummaryStatistics", "equals", "java.lang.Object", "<d:0.15>"}}), new String[][]{{"copy", "", "3"}, {"evaluate", "double[],double[]", "6"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("org.apache.commons.math.exception.DimensionMismatchException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput165() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.stat.descriptive.SummaryStatistics", "org.apache.commons.math.stat.descriptive.SummaryStatistics", "getMeanImpl", new String[]{}, new String[]{}, false, 7, new String[][]{{"org.apache.commons.math.stat.descriptive.SummaryStatistics", "setVarianceImpl", "org.apache.commons.math.stat.descriptive.StorelessUnivariateStatistic", "<sample:3>"}, {"org.apache.commons.math.stat.descriptive.SummaryStatistics", "getSumsqImpl", ""}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.math.stat.descriptive.moment.Mean", actual.getClass().getName());
  assertEquals("{getData=null, getN=0, getResult=NaN}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "SummaryStatistics:\nn: 0\nmin: NaN\nmax: NaN\nmean: NaN\ngeometric mean: NaN\nvariance: 1.0\nsum of squares: 0.0\nstandard deviation: NaN\nsum of logs: 0.0\n {getGeometricMean=NaN, getMax=NaN, getMean=NaN, getM...#350#831060491", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput166() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.stat.descriptive.SummaryStatistics", "org.apache.commons.math.stat.descriptive.SummaryStatistics", "setMaxImpl", new String[]{"org.apache.commons.math.stat.descriptive.StorelessUnivariateStatistic"}, new String[]{"<sample:3>"}, false, 0, new String[][]{{"org.apache.commons.math.stat.descriptive.SummaryStatistics", "getMax", ""}});
  assertNull(actual);
  assertEquals("receiver state after the call", "SummaryStatistics:\nn: 0\nmin: NaN\nmax: 1.0\nmean: NaN\ngeometric mean: NaN\nvariance: NaN\nsum of squares: 0.0\nstandard deviation: NaN\nsum of logs: 0.0\n {getGeometricMean=NaN, getMax=1.0, getMean=NaN, getM...#350#-50555381", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput167() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.stat.descriptive.SummaryStatistics", "org.apache.commons.math.stat.descriptive.SummaryStatistics", "setMeanImpl", new String[]{"org.apache.commons.math.stat.descriptive.StorelessUnivariateStatistic"}, new String[]{"<sample:1>"}, false, 7, new String[][]{});
  assertNull(actual);
  assertEquals("receiver state after the call", "SummaryStatistics:\nn: 0\nmin: NaN\nmax: NaN\nmean: -1.0\ngeometric mean: NaN\nvariance: NaN\nsum of squares: 0.0\nstandard deviation: NaN\nsum of logs: 0.0\n {getGeometricMean=NaN, getMax=NaN, getMean=-1.0, ge...#352#1693008303", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput168() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math.stat.descriptive.SummaryStatistics", "org.apache.commons.math.stat.descriptive.SummaryStatistics", "getMaxImpl", new String[]{}, new String[]{}, false), new String[][]{{"evaluate", "", "4"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("org.apache.commons.math.exception.NullArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput169() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math.stat.descriptive.SummaryStatistics", "org.apache.commons.math.stat.descriptive.SummaryStatistics", "getMeanImpl", new String[]{}, new String[]{}, false, 3, new String[][]{{"org.apache.commons.math.stat.descriptive.SummaryStatistics", "setSumsqImpl", "org.apache.commons.math.stat.descriptive.StorelessUnivariateStatistic", "<sample:5>"}}), new String[][]{{"getData", "", "5"}, {"setData", "double[],int,int", "4"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.ArrayIndexOutOfBoundsException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput170() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math.stat.descriptive.SummaryStatistics", "org.apache.commons.math.stat.descriptive.SummaryStatistics", "copy", new String[]{}, new String[]{}, false), new String[][]{{"setSumImpl", "org.apache.commons.math.stat.descriptive.StorelessUnivariateStatistic", "1"}, {"getVarianceImpl", "", "1"}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.math.stat.descriptive.moment.Variance", actual.getClass().getName());
  assertEquals("{getData=null, getN=0, getResult=NaN, isBiasCorrected=true}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "SummaryStatistics:\nn: 0\nmin: NaN\nmax: NaN\nmean: NaN\ngeometric mean: NaN\nvariance: NaN\nsum of squares: 0.0\nstandard deviation: NaN\nsum of logs: 0.0\n {getGeometricMean=NaN, getMax=NaN, getMean=NaN, getM...#350#2146862523", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput171() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math.stat.descriptive.SummaryStatistics", "org.apache.commons.math.stat.descriptive.SummaryStatistics", "getGeoMeanImpl", new String[]{}, new String[]{}, false, 4, new String[][]{{"org.apache.commons.math.stat.descriptive.SummaryStatistics", "setGeoMeanImpl", "org.apache.commons.math.stat.descriptive.StorelessUnivariateStatistic", "<sample:4>"}}), new String[][]{{"incrementAll", "double[]", "7"}, {"copy", "", "2"}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.math.stat.descriptive.moment.GeometricMean", actual.getClass().getName());
  assertEquals("{getData=null, getN=2, getResult=Infinity}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "SummaryStatistics:\nn: 0\nmin: NaN\nmax: NaN\nmean: NaN\ngeometric mean: Infinity\nvariance: NaN\nsum of squares: 0.0\nstandard deviation: NaN\nsum of logs: 0.0\n {getGeometricMean=Infinity, getMax=NaN, getMean...#360#543719049", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput172() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math.stat.descriptive.SummaryStatistics", "org.apache.commons.math.stat.descriptive.SummaryStatistics", "getSumsqImpl", new String[]{}, new String[]{}, false, 1, new String[][]{{"org.apache.commons.math.stat.descriptive.SummaryStatistics", "getN", ""}}), new String[][]{{"evaluate", "", "2"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("org.apache.commons.math.exception.NullArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput173() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math.stat.descriptive.SummaryStatistics", "org.apache.commons.math.stat.descriptive.SummaryStatistics", "getSumLogImpl", new String[]{}, new String[]{}, false, 1, new String[][]{{"org.apache.commons.math.stat.descriptive.SummaryStatistics", "getMean", ""}}), new String[][]{{"setData", "double[]", "2"}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.math.stat.descriptive.summary.SumOfLogs", actual.getClass().getName());
  assertEquals("{getData=[1.0, Infinity, -Infinity], getN=0, getResult=0.0}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "SummaryStatistics:\nn: 0\nmin: NaN\nmax: NaN\nmean: NaN\ngeometric mean: NaN\nvariance: NaN\nsum of squares: 0.0\nstandard deviation: NaN\nsum of logs: 0.0\n {getGeometricMean=NaN, getMax=NaN, getMean=NaN, getM...#350#2146862523", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput174() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math.stat.descriptive.SummaryStatistics", "org.apache.commons.math.stat.descriptive.SummaryStatistics", "getSumsqImpl", new String[]{}, new String[]{}, false, 3, new String[][]{}), new String[][]{{"incrementAll", "double[]", "4"}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.math.stat.descriptive.summary.SumOfSquares", actual.getClass().getName());
  assertEquals("{getData=null, getN=2, getResult=Infinity}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "SummaryStatistics:\nn: 0\nmin: NaN\nmax: NaN\nmean: NaN\ngeometric mean: NaN\nvariance: NaN\nsum of squares: Infinity\nstandard deviation: NaN\nsum of logs: 0.0\n {getGeometricMean=NaN, getMax=NaN, getMean=NaN,...#360#-463508003", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput175() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.stat.descriptive.SummaryStatistics", "org.apache.commons.math.stat.descriptive.SummaryStatistics", "setSumLogImpl", new String[]{"org.apache.commons.math.stat.descriptive.StorelessUnivariateStatistic"}, new String[]{"<sample:5>"}, false, 5, new String[][]{{"org.apache.commons.math.stat.descriptive.SummaryStatistics", "getGeometricMean", ""}});
  assertNull(actual);
  assertEquals("receiver state after the call", "SummaryStatistics:\nn: 0\nmin: NaN\nmax: NaN\nmean: NaN\ngeometric mean: 0.0\nvariance: NaN\nsum of squares: 0.0\nstandard deviation: NaN\nsum of logs: -Infinity\n {getGeometricMean=0.0, getMax=NaN, getMean=NaN...#362#-1804974637", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput176() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math.stat.descriptive.SummaryStatistics", "org.apache.commons.math.stat.descriptive.SummaryStatistics", "copy", new String[]{}, new String[]{}, false, 7, new String[][]{{"org.apache.commons.math.stat.descriptive.SummaryStatistics", "getMax", ""}}), new String[][]{{"getSummary", "", "0"}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.math.stat.descriptive.StatisticalSummaryValues", actual.getClass().getName());
  assertEquals("StatisticalSummaryValues:\nn: 0\nmin: NaN\nmax: NaN\nmean: NaN\nstd dev: NaN\nvariance: NaN\nsum: 0.0\n {getMax=NaN, getMean=NaN, getMin=NaN, getN=0, getStandardDeviation=NaN, getSum=0.0, getVariance=NaN}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "SummaryStatistics:\nn: 0\nmin: NaN\nmax: NaN\nmean: NaN\ngeometric mean: NaN\nvariance: NaN\nsum of squares: 0.0\nstandard deviation: NaN\nsum of logs: 0.0\n {getGeometricMean=NaN, getMax=NaN, getMean=NaN, getM...#350#2146862523", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput177() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math.stat.descriptive.SummaryStatistics", "org.apache.commons.math.stat.descriptive.SummaryStatistics", "getGeoMeanImpl", new String[]{}, new String[]{}, false), new String[][]{{"incrementAll", "double[]", "5"}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.math.stat.descriptive.moment.GeometricMean", actual.getClass().getName());
  assertEquals("{getData=null, getN=3, getResult=NaN}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "SummaryStatistics:\nn: 0\nmin: NaN\nmax: NaN\nmean: NaN\ngeometric mean: NaN\nvariance: NaN\nsum of squares: 0.0\nstandard deviation: NaN\nsum of logs: NaN\n {getGeometricMean=NaN, getMax=NaN, getMean=NaN, getM...#350#-352706035", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput178() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math.stat.descriptive.SummaryStatistics", "org.apache.commons.math.stat.descriptive.SummaryStatistics", "getSumsqImpl", new String[]{}, new String[]{}, false), new String[][]{{"getN", "", "5"}});
  assertNotNull(actual);
  assertEquals("java.lang.Long", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "SummaryStatistics:\nn: 0\nmin: NaN\nmax: NaN\nmean: NaN\ngeometric mean: NaN\nvariance: NaN\nsum of squares: 0.0\nstandard deviation: NaN\nsum of logs: 0.0\n {getGeometricMean=NaN, getMax=NaN, getMean=NaN, getM...#350#2146862523", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput179() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math.stat.descriptive.SummaryStatistics", "org.apache.commons.math.stat.descriptive.SummaryStatistics", "getMinImpl", new String[]{}, new String[]{}, false), new String[][]{{"getN", "", "0"}});
  assertNotNull(actual);
  assertEquals("java.lang.Long", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "SummaryStatistics:\nn: 0\nmin: NaN\nmax: NaN\nmean: NaN\ngeometric mean: NaN\nvariance: NaN\nsum of squares: 0.0\nstandard deviation: NaN\nsum of logs: 0.0\n {getGeometricMean=NaN, getMax=NaN, getMean=NaN, getM...#350#2146862523", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput180() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.stat.descriptive.SummaryStatistics", "org.apache.commons.math.stat.descriptive.SummaryStatistics", "getSum", new String[]{}, new String[]{}, false, 7, new String[][]{{"org.apache.commons.math.stat.descriptive.SummaryStatistics", "setSumLogImpl", "org.apache.commons.math.stat.descriptive.StorelessUnivariateStatistic", "<sample:7>"}});
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("0.0", String.valueOf(actual));
  assertEquals("receiver state after the call", "SummaryStatistics:\nn: 0\nmin: NaN\nmax: NaN\nmean: NaN\ngeometric mean: 1.0\nvariance: NaN\nsum of squares: 0.0\nstandard deviation: NaN\nsum of logs: 0.0\n {getGeometricMean=1.0, getMax=NaN, getMean=NaN, getM...#350#20795403", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput181() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.stat.descriptive.SummaryStatistics", "org.apache.commons.math.stat.descriptive.SummaryStatistics", "setMinImpl", new String[]{"org.apache.commons.math.stat.descriptive.StorelessUnivariateStatistic"}, new String[]{"<sample:0>"}, false, 7, new String[][]{});
  assertNull(actual);
  assertEquals("receiver state after the call", "SummaryStatistics:\nn: 0\nmin: -Infinity\nmax: NaN\nmean: NaN\ngeometric mean: NaN\nvariance: NaN\nsum of squares: 0.0\nstandard deviation: NaN\nsum of logs: 0.0\n {getGeometricMean=NaN, getMax=NaN, getMean=NaN...#362#497028975", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput182() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math.stat.descriptive.SummaryStatistics", "org.apache.commons.math.stat.descriptive.SummaryStatistics", "getSumImpl", new String[]{}, new String[]{}, false, 7, new String[][]{}), new String[][]{{"evaluate", "", "3"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("org.apache.commons.math.exception.NullArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput183() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math.stat.descriptive.SummaryStatistics", "org.apache.commons.math.stat.descriptive.SummaryStatistics", "getMinImpl", new String[]{}, new String[]{}, false, 4, new String[][]{{"org.apache.commons.math.stat.descriptive.SummaryStatistics", "getMax", ""}}), new String[][]{{"increment", "double", "7"}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.math.stat.descriptive.rank.Min", actual.getClass().getName());
  assertEquals("{getData=null, getN=1, getResult=0.0}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "SummaryStatistics:\nn: 0\nmin: 0.0\nmax: NaN\nmean: NaN\ngeometric mean: NaN\nvariance: NaN\nsum of squares: 0.0\nstandard deviation: NaN\nsum of logs: 0.0\n {getGeometricMean=NaN, getMax=NaN, getMean=NaN, getM...#350#-1067426903", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput184() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.stat.descriptive.SummaryStatistics", "org.apache.commons.math.stat.descriptive.SummaryStatistics", "getVarianceImpl", new String[]{}, new String[]{}, false, 2, new String[][]{{"org.apache.commons.math.stat.descriptive.SummaryStatistics", "getGeometricMean", ""}, {"org.apache.commons.math.stat.descriptive.SummaryStatistics", "getSumImpl", ""}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.math.stat.descriptive.moment.Variance", actual.getClass().getName());
  assertEquals("{getData=null, getN=0, getResult=NaN, isBiasCorrected=true}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "SummaryStatistics:\nn: 0\nmin: NaN\nmax: NaN\nmean: NaN\ngeometric mean: NaN\nvariance: NaN\nsum of squares: 0.0\nstandard deviation: NaN\nsum of logs: 0.0\n {getGeometricMean=NaN, getMax=NaN, getMean=NaN, getM...#350#2146862523", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput185() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.stat.descriptive.SummaryStatistics", "org.apache.commons.math.stat.descriptive.SummaryStatistics", "addValue", new String[]{"double"}, new String[]{"-1.7976931348623157E308"}, false, 6, new String[][]{{"org.apache.commons.math.stat.descriptive.SummaryStatistics", "getMax", ""}, {"org.apache.commons.math.stat.descriptive.SummaryStatistics", "getMinImpl", ""}});
  assertNull(actual);
  assertEquals("receiver state after the call", "SummaryStatistics:\nn: 1\nmin: -1.7976931348623157E308\nmax: -1.7976931348623157E308\nmean: -1.7976931348623157E308\ngeometric mean: NaN\nvariance: 0.0\nsum of squares: Infinity\nstandard deviation: 0.0\nsum o...#500#705366924", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput186() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math.stat.descriptive.SummaryStatistics", "org.apache.commons.math.stat.descriptive.SummaryStatistics", "getMaxImpl", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.math.stat.descriptive.SummaryStatistics", "setSumsqImpl", "org.apache.commons.math.stat.descriptive.StorelessUnivariateStatistic", "<sample:0>"}}), new String[][]{{"setData", "double[]", "4"}, {"clear", "", "0"}, {"evaluate", "", "0"}});
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("-1.0", String.valueOf(actual));
  assertEquals("receiver state after the call", "SummaryStatistics:\nn: 0\nmin: NaN\nmax: NaN\nmean: NaN\ngeometric mean: NaN\nvariance: NaN\nsum of squares: -Infinity\nstandard deviation: NaN\nsum of logs: 0.0\n {getGeometricMean=NaN, getMax=NaN, getMean=NaN...#362#114820443", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput187() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.stat.descriptive.SummaryStatistics", "org.apache.commons.math.stat.descriptive.SummaryStatistics", "setSumLogImpl", new String[]{"org.apache.commons.math.stat.descriptive.StorelessUnivariateStatistic"}, new String[]{"<sample:2>"}, false, 3, new String[][]{{"org.apache.commons.math.stat.descriptive.SummaryStatistics", "setMeanImpl", "org.apache.commons.math.stat.descriptive.StorelessUnivariateStatistic", "<sample:8>"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "SummaryStatistics:\nn: 0\nmin: NaN\nmax: NaN\nmean: NaN\ngeometric mean: NaN\nvariance: NaN\nsum of squares: 0.0\nstandard deviation: NaN\nsum of logs: 0.0\n {getGeometricMean=NaN, getMax=NaN, getMean=NaN, getM...#350#2146862523", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput188() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math.stat.descriptive.SummaryStatistics", "org.apache.commons.math.stat.descriptive.SummaryStatistics", "getMinImpl", new String[]{}, new String[]{}, false, 7, new String[][]{{"org.apache.commons.math.stat.descriptive.SummaryStatistics", "getMin", ""}}), new String[][]{{"incrementAll", "double[],int,int", "0"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("org.apache.commons.math.exception.NotPositiveException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput189() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math.stat.descriptive.SummaryStatistics", "org.apache.commons.math.stat.descriptive.SummaryStatistics", "getMinImpl", new String[]{}, new String[]{}, false, 3, new String[][]{}), new String[][]{{"evaluate", "double[],int,int", "3"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.ArrayIndexOutOfBoundsException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput190() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.stat.descriptive.SummaryStatistics", "org.apache.commons.math.stat.descriptive.SummaryStatistics", "setMaxImpl", new String[]{"org.apache.commons.math.stat.descriptive.StorelessUnivariateStatistic"}, new String[]{"<sample:6>"}, false, 7, new String[][]{{"org.apache.commons.math.stat.descriptive.SummaryStatistics", "getMean", ""}});
  assertNull(actual);
  assertEquals("receiver state after the call", "SummaryStatistics:\nn: 0\nmin: NaN\nmax: NaN\nmean: NaN\ngeometric mean: NaN\nvariance: NaN\nsum of squares: 0.0\nstandard deviation: NaN\nsum of logs: 0.0\n {getGeometricMean=NaN, getMax=NaN, getMean=NaN, getM...#350#2146862523", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput191() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math.stat.descriptive.SummaryStatistics", "org.apache.commons.math.stat.descriptive.SummaryStatistics", "getMaxImpl", new String[]{}, new String[]{}, false, 1, new String[][]{}), new String[][]{{"setData", "double[]", "7"}, {"clear", "", "3"}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.math.stat.descriptive.rank.Max", actual.getClass().getName());
  assertEquals("{getData=[1.0, Infinity], getN=0, getResult=NaN}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "SummaryStatistics:\nn: 0\nmin: NaN\nmax: NaN\nmean: NaN\ngeometric mean: NaN\nvariance: NaN\nsum of squares: 0.0\nstandard deviation: NaN\nsum of logs: 0.0\n {getGeometricMean=NaN, getMax=NaN, getMean=NaN, getM...#350#2146862523", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput192() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.stat.descriptive.SummaryStatistics", "org.apache.commons.math.stat.descriptive.SummaryStatistics", "addValue", new String[]{"double"}, new String[]{"1.7976931348623157E308"}, false, 6, new String[][]{});
  assertNull(actual);
  assertEquals("receiver state after the call", "SummaryStatistics:\nn: 1\nmin: 1.7976931348623157E308\nmax: 1.7976931348623157E308\nmean: 1.7976931348623157E308\ngeometric mean: 1.7976931348622732E308\nvariance: 0.0\nsum of squares: Infinity\nstandard devi...#557#-1852587093", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput193() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.stat.descriptive.SummaryStatistics", "org.apache.commons.math.stat.descriptive.SummaryStatistics", "addValue", new String[]{"double"}, new String[]{"-1.0"}, false);
  assertNull(actual);
  assertEquals("receiver state after the call", "SummaryStatistics:\nn: 1\nmin: -1.0\nmax: -1.0\nmean: -1.0\ngeometric mean: NaN\nvariance: 0.0\nsum of squares: 1.0\nstandard deviation: 0.0\nsum of logs: NaN\n {getGeometricMean=NaN, getMax=-1.0, getMean=-1.0,...#357#65188631", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput194() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math.stat.descriptive.SummaryStatistics", "org.apache.commons.math.stat.descriptive.SummaryStatistics", "setVarianceImpl", new String[]{"org.apache.commons.math.stat.descriptive.StorelessUnivariateStatistic"}, new String[]{"<sample:1>"}, false, 1, new String[][]{{"org.apache.commons.math.stat.descriptive.SummaryStatistics", "addValue", "double", "4.9E-324"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("org.apache.commons.math.exception.MathIllegalStateException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput195() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math.stat.descriptive.SummaryStatistics", "org.apache.commons.math.stat.descriptive.SummaryStatistics", "getSumLogImpl", new String[]{}, new String[]{}, false, 4, new String[][]{}), new String[][]{{"evaluate", "double[],int,int", "0"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("org.apache.commons.math.exception.NotPositiveException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput196() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math.stat.descriptive.SummaryStatistics", "org.apache.commons.math.stat.descriptive.SummaryStatistics", "getGeoMeanImpl", new String[]{}, new String[]{}, false, 3, new String[][]{{"org.apache.commons.math.stat.descriptive.SummaryStatistics", "getMinImpl", ""}}), new String[][]{{"incrementAll", "double[]", "3"}, {"evaluate", "", "1"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("org.apache.commons.math.exception.NullArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput197() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math.stat.descriptive.SummaryStatistics", "org.apache.commons.math.stat.descriptive.SummaryStatistics", "copy", new String[]{}, new String[]{}, false), new String[][]{{"getSummary", "", "4"}, {"getMin", "", "7"}});
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("NaN", String.valueOf(actual));
  assertEquals("receiver state after the call", "SummaryStatistics:\nn: 0\nmin: NaN\nmax: NaN\nmean: NaN\ngeometric mean: NaN\nvariance: NaN\nsum of squares: 0.0\nstandard deviation: NaN\nsum of logs: 0.0\n {getGeometricMean=NaN, getMax=NaN, getMean=NaN, getM...#350#2146862523", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput198() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.stat.descriptive.SummaryStatistics", "org.apache.commons.math.stat.descriptive.SummaryStatistics", "hashCode", new String[]{}, new String[]{}, false, 4, new String[][]{{"org.apache.commons.math.stat.descriptive.SummaryStatistics", "getSummary", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("1953686201", String.valueOf(actual));
  assertEquals("receiver state after the call", "SummaryStatistics:\nn: 0\nmin: NaN\nmax: NaN\nmean: NaN\ngeometric mean: NaN\nvariance: NaN\nsum of squares: 0.0\nstandard deviation: NaN\nsum of logs: 0.0\n {getGeometricMean=NaN, getMax=NaN, getMean=NaN, getM...#350#2146862523", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput199() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math.stat.descriptive.SummaryStatistics", "org.apache.commons.math.stat.descriptive.SummaryStatistics", "getMinImpl", new String[]{}, new String[]{}, false), new String[][]{{"evaluate", "", "4"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("org.apache.commons.math.exception.NullArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput200() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math.stat.descriptive.SummaryStatistics", "org.apache.commons.math.stat.descriptive.SummaryStatistics", "getSumLogImpl", new String[]{}, new String[]{}, false, 5, new String[][]{{"org.apache.commons.math.stat.descriptive.SummaryStatistics", "clear", ""}}), new String[][]{{"getResult", "", "1"}, {"setData", "double[],int,int", "4"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.ArrayIndexOutOfBoundsException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput201() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math.stat.descriptive.SummaryStatistics", "org.apache.commons.math.stat.descriptive.SummaryStatistics", "getSumImpl", new String[]{}, new String[]{}, false, 5, new String[][]{}), new String[][]{{"evaluate", "double[]", "3"}});
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("Infinity", String.valueOf(actual));
  assertEquals("receiver state after the call", "SummaryStatistics:\nn: 0\nmin: NaN\nmax: NaN\nmean: NaN\ngeometric mean: NaN\nvariance: NaN\nsum of squares: 0.0\nstandard deviation: NaN\nsum of logs: 0.0\n {getGeometricMean=NaN, getMax=NaN, getMean=NaN, getM...#350#2146862523", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput202() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math.stat.descriptive.SummaryStatistics", "org.apache.commons.math.stat.descriptive.SummaryStatistics", "copy", new String[]{}, new String[]{}, false, 3, new String[][]{{"org.apache.commons.math.stat.descriptive.SummaryStatistics", "getSumOfLogs", ""}, {"org.apache.commons.math.stat.descriptive.SummaryStatistics", "getVariance", ""}}), new String[][]{{"setMinImpl", "org.apache.commons.math.stat.descriptive.StorelessUnivariateStatistic", "2"}, {"getN", "", "2"}});
  assertNotNull(actual);
  assertEquals("java.lang.Long", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "SummaryStatistics:\nn: 0\nmin: NaN\nmax: NaN\nmean: NaN\ngeometric mean: NaN\nvariance: NaN\nsum of squares: 0.0\nstandard deviation: NaN\nsum of logs: 0.0\n {getGeometricMean=NaN, getMax=NaN, getMean=NaN, getM...#350#2146862523", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput203() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math.stat.descriptive.SummaryStatistics", "org.apache.commons.math.stat.descriptive.SummaryStatistics", "getMeanImpl", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.math.stat.descriptive.SummaryStatistics", "getMaxImpl", ""}}), new String[][]{{"getN", "", "5"}});
  assertNotNull(actual);
  assertEquals("java.lang.Long", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "SummaryStatistics:\nn: 0\nmin: NaN\nmax: NaN\nmean: NaN\ngeometric mean: NaN\nvariance: NaN\nsum of squares: 0.0\nstandard deviation: NaN\nsum of logs: 0.0\n {getGeometricMean=NaN, getMax=NaN, getMean=NaN, getM...#350#2146862523", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput204() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.stat.descriptive.SummaryStatistics", "org.apache.commons.math.stat.descriptive.SummaryStatistics", "addValue", new String[]{"double"}, new String[]{"0.0"}, false, 6, new String[][]{{"org.apache.commons.math.stat.descriptive.SummaryStatistics", "getMaxImpl", ""}});
  assertNull(actual);
  assertEquals("receiver state after the call", "SummaryStatistics:\nn: 1\nmin: 0.0\nmax: 0.0\nmean: 0.0\ngeometric mean: 0.0\nvariance: 0.0\nsum of squares: 0.0\nstandard deviation: 0.0\nsum of logs: -Infinity\n {getGeometricMean=0.0, getMax=0.0, getMean=0.0...#362#-1481834331", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput205() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math.stat.descriptive.SummaryStatistics", "org.apache.commons.math.stat.descriptive.SummaryStatistics", "getMaxImpl", new String[]{}, new String[]{}, false, 7, new String[][]{}), new String[][]{{"getN", "", "4"}});
  assertNotNull(actual);
  assertEquals("java.lang.Long", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "SummaryStatistics:\nn: 0\nmin: NaN\nmax: NaN\nmean: NaN\ngeometric mean: NaN\nvariance: NaN\nsum of squares: 0.0\nstandard deviation: NaN\nsum of logs: 0.0\n {getGeometricMean=NaN, getMax=NaN, getMean=NaN, getM...#350#2146862523", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput206() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math.stat.descriptive.SummaryStatistics", "org.apache.commons.math.stat.descriptive.SummaryStatistics", "getMaxImpl", new String[]{}, new String[]{}, false, 1, new String[][]{}), new String[][]{{"evaluate", "double[],int,int", "2"}, {"increment", "double", "7"}, {"getData", "", "6"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "SummaryStatistics:\nn: 0\nmin: NaN\nmax: 0.0\nmean: NaN\ngeometric mean: NaN\nvariance: NaN\nsum of squares: 0.0\nstandard deviation: NaN\nsum of logs: 0.0\n {getGeometricMean=NaN, getMax=0.0, getMean=NaN, getM...#350#220768717", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput207() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.stat.descriptive.SummaryStatistics", "org.apache.commons.math.stat.descriptive.SummaryStatistics", "equals", new String[]{"java.lang.Object"}, new String[]{"<i:0>"}, false, 6, new String[][]{{"org.apache.commons.math.stat.descriptive.SummaryStatistics", "hashCode", ""}, {"org.apache.commons.math.stat.descriptive.SummaryStatistics", "addValue", "double", "-1.01066089337177805E18"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "SummaryStatistics:\nn: 1\nmin: -1.01066089337177805E18\nmax: -1.01066089337177805E18\nmean: -1.01066089337177805E18\ngeometric mean: NaN\nvariance: 0.0\nsum of squares: 1.0214354413910406E36\nstandard deviati...#526#1024146818", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput208() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math.stat.descriptive.SummaryStatistics", "org.apache.commons.math.stat.descriptive.SummaryStatistics", "getSummary", new String[]{}, new String[]{}, false, 1, new String[][]{{"org.apache.commons.math.stat.descriptive.SummaryStatistics", "getMean", ""}}), new String[][]{{"getStandardDeviation", "", "4"}, {"getSum", "", "5"}});
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("0.0", String.valueOf(actual));
  assertEquals("receiver state after the call", "SummaryStatistics:\nn: 0\nmin: NaN\nmax: NaN\nmean: NaN\ngeometric mean: NaN\nvariance: NaN\nsum of squares: 0.0\nstandard deviation: NaN\nsum of logs: 0.0\n {getGeometricMean=NaN, getMax=NaN, getMean=NaN, getM...#350#2146862523", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput209() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math.stat.descriptive.SummaryStatistics", "org.apache.commons.math.stat.descriptive.SummaryStatistics", "copy", new String[]{"org.apache.commons.math.stat.descriptive.SummaryStatistics", "org.apache.commons.math.stat.descriptive.SummaryStatistics"}, new String[]{"<sample:4>", "<null>"}, true); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("org.apache.commons.math.exception.NullArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput210() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.stat.descriptive.SummaryStatistics", "org.apache.commons.math.stat.descriptive.SummaryStatistics", "setSumLogImpl", new String[]{"org.apache.commons.math.stat.descriptive.StorelessUnivariateStatistic"}, new String[]{"<sample:0>"}, false, 7, new String[][]{});
  assertNull(actual);
  assertEquals("receiver state after the call", "SummaryStatistics:\nn: 0\nmin: NaN\nmax: NaN\nmean: NaN\ngeometric mean: NaN\nvariance: NaN\nsum of squares: 0.0\nstandard deviation: NaN\nsum of logs: -Infinity\n {getGeometricMean=NaN, getMax=NaN, getMean=NaN...#362#-80285247", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput211() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.stat.descriptive.SummaryStatistics", "org.apache.commons.math.stat.descriptive.SummaryStatistics", "addValue", new String[]{"double"}, new String[]{"0.0"}, false, 0, new String[][]{{"org.apache.commons.math.stat.descriptive.SummaryStatistics", "setVarianceImpl", "org.apache.commons.math.stat.descriptive.StorelessUnivariateStatistic", "<sample:7>"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "SummaryStatistics:\nn: 1\nmin: 0.0\nmax: 0.0\nmean: 0.0\ngeometric mean: 0.0\nvariance: 0.0\nsum of squares: 0.0\nstandard deviation: 0.0\nsum of logs: -Infinity\n {getGeometricMean=0.0, getMax=0.0, getMean=0.0...#362#-1481834331", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput212() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math.stat.descriptive.SummaryStatistics", "org.apache.commons.math.stat.descriptive.SummaryStatistics", "getSumsqImpl", new String[]{}, new String[]{}, false), new String[][]{{"getResult", "", "0"}});
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("0.0", String.valueOf(actual));
  assertEquals("receiver state after the call", "SummaryStatistics:\nn: 0\nmin: NaN\nmax: NaN\nmean: NaN\ngeometric mean: NaN\nvariance: NaN\nsum of squares: 0.0\nstandard deviation: NaN\nsum of logs: 0.0\n {getGeometricMean=NaN, getMax=NaN, getMean=NaN, getM...#350#2146862523", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput213() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.stat.descriptive.SummaryStatistics", "org.apache.commons.math.stat.descriptive.SummaryStatistics", "setMaxImpl", new String[]{"org.apache.commons.math.stat.descriptive.StorelessUnivariateStatistic"}, new String[]{"<sample:1>"}, false, 3, new String[][]{});
  assertNull(actual);
  assertEquals("receiver state after the call", "SummaryStatistics:\nn: 0\nmin: NaN\nmax: -1.0\nmean: NaN\ngeometric mean: NaN\nvariance: NaN\nsum of squares: 0.0\nstandard deviation: NaN\nsum of logs: 0.0\n {getGeometricMean=NaN, getMax=-1.0, getMean=NaN, ge...#352#-1024419709", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput214() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.stat.descriptive.SummaryStatistics", "org.apache.commons.math.stat.descriptive.SummaryStatistics", "equals", new String[]{"java.lang.Object"}, new String[]{"<b:true>"}, false, 3, new String[][]{{"org.apache.commons.math.stat.descriptive.SummaryStatistics", "setMaxImpl", "org.apache.commons.math.stat.descriptive.StorelessUnivariateStatistic", "<sample:9>"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "SummaryStatistics:\nn: 0\nmin: NaN\nmax: Infinity\nmean: NaN\ngeometric mean: NaN\nvariance: NaN\nsum of squares: 0.0\nstandard deviation: NaN\nsum of logs: 0.0\n {getGeometricMean=NaN, getMax=Infinity, getMean...#360#-1009688381", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput215() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math.stat.descriptive.SummaryStatistics", "org.apache.commons.math.stat.descriptive.SummaryStatistics", "setMaxImpl", new String[]{"org.apache.commons.math.stat.descriptive.StorelessUnivariateStatistic"}, new String[]{"<sample:6>"}, false, 0, new String[][]{{"org.apache.commons.math.stat.descriptive.SummaryStatistics", "addValue", "double", "1.0"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("org.apache.commons.math.exception.MathIllegalStateException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput216() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.stat.descriptive.SummaryStatistics", "org.apache.commons.math.stat.descriptive.SummaryStatistics", "getSumsq", new String[]{}, new String[]{}, false, 7, new String[][]{{"org.apache.commons.math.stat.descriptive.SummaryStatistics", "setGeoMeanImpl", "org.apache.commons.math.stat.descriptive.StorelessUnivariateStatistic", "<sample:2>"}});
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("0.0", String.valueOf(actual));
  assertEquals("receiver state after the call", "SummaryStatistics:\nn: 0\nmin: NaN\nmax: NaN\nmean: NaN\ngeometric mean: 0.0\nvariance: NaN\nsum of squares: 0.0\nstandard deviation: NaN\nsum of logs: 0.0\n {getGeometricMean=0.0, getMax=NaN, getMean=NaN, getM...#350#-82019827", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput217() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math.stat.descriptive.SummaryStatistics", "org.apache.commons.math.stat.descriptive.SummaryStatistics", "getVarianceImpl", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.math.stat.descriptive.SummaryStatistics", "setVarianceImpl", "org.apache.commons.math.stat.descriptive.StorelessUnivariateStatistic", "<sample:10>"}}), new String[][]{{"increment", "double", "2"}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.math.stat.descriptive.moment.Mean", actual.getClass().getName());
  assertEquals("{getData=null, getN=1, getResult=0.0}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "SummaryStatistics:\nn: 0\nmin: NaN\nmax: NaN\nmean: NaN\ngeometric mean: NaN\nvariance: 0.0\nsum of squares: 0.0\nstandard deviation: NaN\nsum of logs: 0.0\n {getGeometricMean=NaN, getMax=NaN, getMean=NaN, getM...#350#-507461555", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput218() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.stat.descriptive.SummaryStatistics", "org.apache.commons.math.stat.descriptive.SummaryStatistics", "equals", new String[]{"java.lang.Object"}, new String[]{"<i:0>"}, false, 1, new String[][]{{"org.apache.commons.math.stat.descriptive.SummaryStatistics", "addValue", "double", "0.988"}, {"org.apache.commons.math.stat.descriptive.SummaryStatistics", "getSecondMoment", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "SummaryStatistics:\nn: 1\nmin: 0.988\nmax: 0.988\nmean: 0.988\ngeometric mean: 0.988\nvariance: 0.0\nsum of squares: 0.976144\nstandard deviation: 0.0\nsum of logs: -0.012072581234269249\n {getGeometricMean=0.9...#414#-1608599698", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput219() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math.stat.descriptive.SummaryStatistics", "org.apache.commons.math.stat.descriptive.SummaryStatistics", "getVarianceImpl", new String[]{}, new String[]{}, false, 4, new String[][]{{"org.apache.commons.math.stat.descriptive.SummaryStatistics", "addValue", "double", "-2.02132178674355584E18"}}), new String[][]{{"getN", "", "0"}});
  assertNotNull(actual);
  assertEquals("java.lang.Long", actual.getClass().getName());
  assertEquals("1", String.valueOf(actual));
  assertEquals("receiver state after the call", "SummaryStatistics:\nn: 1\nmin: -2.02132178674355584E18\nmax: -2.02132178674355584E18\nmean: -2.02132178674355584E18\ngeometric mean: NaN\nvariance: 0.0\nsum of squares: 4.085741765564161E36\nstandard deviatio...#524#1310934447", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput220() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math.stat.descriptive.SummaryStatistics", "org.apache.commons.math.stat.descriptive.SummaryStatistics", "copy", new String[]{}, new String[]{}, false, 1, new String[][]{{"org.apache.commons.math.stat.descriptive.SummaryStatistics", "getSumLogImpl", ""}}), new String[][]{{"getSumImpl", "", "1"}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.math.stat.descriptive.summary.Sum", actual.getClass().getName());
  assertEquals("{getData=null, getN=0, getResult=0.0}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "SummaryStatistics:\nn: 0\nmin: NaN\nmax: NaN\nmean: NaN\ngeometric mean: NaN\nvariance: NaN\nsum of squares: 0.0\nstandard deviation: NaN\nsum of logs: 0.0\n {getGeometricMean=NaN, getMax=NaN, getMean=NaN, getM...#350#2146862523", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput221() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.stat.descriptive.SummaryStatistics", "org.apache.commons.math.stat.descriptive.SummaryStatistics", "getN", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.math.stat.descriptive.SummaryStatistics", "setSumImpl", "org.apache.commons.math.stat.descriptive.StorelessUnivariateStatistic", "<sample:5>"}});
  assertNotNull(actual);
  assertEquals("java.lang.Long", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "SummaryStatistics:\nn: 0\nmin: NaN\nmax: NaN\nmean: NaN\ngeometric mean: NaN\nvariance: NaN\nsum of squares: 0.0\nstandard deviation: NaN\nsum of logs: 0.0\n {getGeometricMean=NaN, getMax=NaN, getMean=NaN, getM...#356#-2113366850", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput222() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.stat.descriptive.SummaryStatistics", "org.apache.commons.math.stat.descriptive.SummaryStatistics", "setMinImpl", new String[]{"org.apache.commons.math.stat.descriptive.StorelessUnivariateStatistic"}, new String[]{"<sample:1>"}, false, 3, new String[][]{});
  assertNull(actual);
  assertEquals("receiver state after the call", "SummaryStatistics:\nn: 0\nmin: -1.0\nmax: NaN\nmean: NaN\ngeometric mean: NaN\nvariance: NaN\nsum of squares: 0.0\nstandard deviation: NaN\nsum of logs: 0.0\n {getGeometricMean=NaN, getMax=NaN, getMean=NaN, get...#352#-1502693101", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput223() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.stat.descriptive.SummaryStatistics", "org.apache.commons.math.stat.descriptive.SummaryStatistics", "getGeometricMean", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.math.stat.descriptive.SummaryStatistics", "setSumsqImpl", "org.apache.commons.math.stat.descriptive.StorelessUnivariateStatistic", "<sample:8>"}});
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("NaN", String.valueOf(actual));
  assertEquals("receiver state after the call", "SummaryStatistics:\nn: 0\nmin: NaN\nmax: NaN\nmean: NaN\ngeometric mean: NaN\nvariance: NaN\nsum of squares: NaN\nstandard deviation: NaN\nsum of logs: 0.0\n {getGeometricMean=NaN, getMax=NaN, getMean=NaN, getM...#350#-1265085157", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput224() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.stat.descriptive.SummaryStatistics", "org.apache.commons.math.stat.descriptive.SummaryStatistics", "hashCode", new String[]{}, new String[]{}, false, 4, new String[][]{{"org.apache.commons.math.stat.descriptive.SummaryStatistics", "setMeanImpl", "org.apache.commons.math.stat.descriptive.StorelessUnivariateStatistic", "<sample:11>"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("1870324409", String.valueOf(actual));
  assertEquals("receiver state after the call", "SummaryStatistics:\nn: 0\nmin: NaN\nmax: NaN\nmean: -1.0\ngeometric mean: NaN\nvariance: NaN\nsum of squares: 0.0\nstandard deviation: NaN\nsum of logs: 0.0\n {getGeometricMean=NaN, getMax=NaN, getMean=-1.0, ge...#352#1693008303", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput225() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math.stat.descriptive.SummaryStatistics", "org.apache.commons.math.stat.descriptive.SummaryStatistics", "getGeoMeanImpl", new String[]{}, new String[]{}, false, 4, new String[][]{{"org.apache.commons.math.stat.descriptive.SummaryStatistics", "getPopulationVariance", ""}, {"org.apache.commons.math.stat.descriptive.SummaryStatistics", "hashCode", ""}}), new String[][]{{"setSumLogImpl", "org.apache.commons.math.stat.descriptive.StorelessUnivariateStatistic", "3"}, {"clear", "", "0"}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.math.stat.descriptive.moment.GeometricMean", actual.getClass().getName());
  assertEquals("{getData=null, getN=1, getResult=2.718281828459045}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "SummaryStatistics:\nn: 0\nmin: NaN\nmax: NaN\nmean: NaN\ngeometric mean: 2.718281828459045\nvariance: NaN\nsum of squares: 0.0\nstandard deviation: NaN\nsum of logs: 0.0\n {getGeometricMean=2.718281828459045, g...#378#-315500523", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput226() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math.stat.descriptive.SummaryStatistics", "org.apache.commons.math.stat.descriptive.SummaryStatistics", "getMaxImpl", new String[]{}, new String[]{}, false, 1, new String[][]{{"org.apache.commons.math.stat.descriptive.SummaryStatistics", "getSum", ""}}), new String[][]{{"increment", "double", "0"}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.math.stat.descriptive.rank.Max", actual.getClass().getName());
  assertEquals("{getData=null, getN=1, getResult=-Infinity}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "SummaryStatistics:\nn: 0\nmin: NaN\nmax: -Infinity\nmean: NaN\ngeometric mean: NaN\nvariance: NaN\nsum of squares: 0.0\nstandard deviation: NaN\nsum of logs: 0.0\n {getGeometricMean=NaN, getMax=-Infinity, getMe...#362#441961607", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput227() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.stat.descriptive.SummaryStatistics", "org.apache.commons.math.stat.descriptive.SummaryStatistics", "setSumImpl", new String[]{"org.apache.commons.math.stat.descriptive.StorelessUnivariateStatistic"}, new String[]{"<sample:0>"}, false, 3, new String[][]{{"org.apache.commons.math.stat.descriptive.SummaryStatistics", "clear", ""}});
  assertNull(actual);
  assertEquals("receiver state after the call", "SummaryStatistics:\nn: 0\nmin: NaN\nmax: NaN\nmean: NaN\ngeometric mean: NaN\nvariance: NaN\nsum of squares: 0.0\nstandard deviation: NaN\nsum of logs: 0.0\n {getGeometricMean=NaN, getMax=NaN, getMean=NaN, getM...#356#-2113366850", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput228() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.stat.descriptive.SummaryStatistics", "org.apache.commons.math.stat.descriptive.SummaryStatistics", "addValue", new String[]{"double"}, new String[]{"1.0"}, false, 1, new String[][]{{"org.apache.commons.math.stat.descriptive.SummaryStatistics", "setGeoMeanImpl", "org.apache.commons.math.stat.descriptive.StorelessUnivariateStatistic", "<sample:10>"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "SummaryStatistics:\nn: 1\nmin: 1.0\nmax: 1.0\nmean: 1.0\ngeometric mean: 1.0\nvariance: 0.0\nsum of squares: 1.0\nstandard deviation: 0.0\nsum of logs: 0.0\n {getGeometricMean=1.0, getMax=1.0, getMean=1.0, getM...#350#230600414", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput229() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.stat.descriptive.SummaryStatistics", "org.apache.commons.math.stat.descriptive.SummaryStatistics", "getVariance", new String[]{}, new String[]{}, false, 4, new String[][]{{"org.apache.commons.math.stat.descriptive.SummaryStatistics", "setMaxImpl", "org.apache.commons.math.stat.descriptive.StorelessUnivariateStatistic", "<sample:2>"}, {"org.apache.commons.math.stat.descriptive.SummaryStatistics", "addValue", "double", "Infinity"}});
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("0.0", String.valueOf(actual));
  assertEquals("receiver state after the call", "SummaryStatistics:\nn: 1\nmin: Infinity\nmax: 0.0\nmean: Infinity\ngeometric mean: Infinity\nvariance: 0.0\nsum of squares: Infinity\nstandard deviation: 0.0\nsum of logs: Infinity\n {getGeometricMean=Infinity,...#405#430306306", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput230() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.stat.descriptive.SummaryStatistics", "org.apache.commons.math.stat.descriptive.SummaryStatistics", "getVariance", new String[]{}, new String[]{}, false, 1, new String[][]{{"org.apache.commons.math.stat.descriptive.SummaryStatistics", "setVarianceImpl", "org.apache.commons.math.stat.descriptive.StorelessUnivariateStatistic", "<sample:2>"}});
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("0.0", String.valueOf(actual));
  assertEquals("receiver state after the call", "SummaryStatistics:\nn: 0\nmin: NaN\nmax: NaN\nmean: NaN\ngeometric mean: NaN\nvariance: 0.0\nsum of squares: 0.0\nstandard deviation: NaN\nsum of logs: 0.0\n {getGeometricMean=NaN, getMax=NaN, getMean=NaN, getM...#350#-507461555", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput231() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.stat.descriptive.SummaryStatistics", "org.apache.commons.math.stat.descriptive.SummaryStatistics", "setSumImpl", new String[]{"org.apache.commons.math.stat.descriptive.StorelessUnivariateStatistic"}, new String[]{"<sample:7>"}, false, 4, new String[][]{});
  assertNull(actual);
  assertEquals("receiver state after the call", "SummaryStatistics:\nn: 0\nmin: NaN\nmax: NaN\nmean: NaN\ngeometric mean: NaN\nvariance: NaN\nsum of squares: 0.0\nstandard deviation: NaN\nsum of logs: 0.0\n {getGeometricMean=NaN, getMax=NaN, getMean=NaN, getM...#350#2146862523", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput232() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math.stat.descriptive.SummaryStatistics", "org.apache.commons.math.stat.descriptive.SummaryStatistics", "getMeanImpl", new String[]{}, new String[]{}, false, 2, new String[][]{{"org.apache.commons.math.stat.descriptive.SummaryStatistics", "getMax", ""}}), new String[][]{{"setData", "double[]", "4"}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.math.stat.descriptive.moment.Mean", actual.getClass().getName());
  assertEquals("{getData=[-Infinity, -1.0], getN=0, getResult=NaN}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "SummaryStatistics:\nn: 0\nmin: NaN\nmax: NaN\nmean: NaN\ngeometric mean: NaN\nvariance: NaN\nsum of squares: 0.0\nstandard deviation: NaN\nsum of logs: 0.0\n {getGeometricMean=NaN, getMax=NaN, getMean=NaN, getM...#350#2146862523", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput233() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.stat.descriptive.SummaryStatistics", "org.apache.commons.math.stat.descriptive.SummaryStatistics", "getSumsqImpl", new String[]{}, new String[]{}, false, 7, new String[][]{{"org.apache.commons.math.stat.descriptive.SummaryStatistics", "addValue", "double", "-4.9E-324"}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.math.stat.descriptive.summary.SumOfSquares", actual.getClass().getName());
  assertEquals("{getData=null, getN=1, getResult=0.0}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "SummaryStatistics:\nn: 1\nmin: -4.9E-324\nmax: -4.9E-324\nmean: -4.9E-324\ngeometric mean: NaN\nvariance: 0.0\nsum of squares: 0.0\nstandard deviation: 0.0\nsum of logs: NaN\n {getGeometricMean=NaN, getMax=-4.9...#392#-140365112", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput234() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.stat.descriptive.SummaryStatistics", "org.apache.commons.math.stat.descriptive.SummaryStatistics", "getSecondMoment", new String[]{}, new String[]{}, false, 6, new String[][]{{"org.apache.commons.math.stat.descriptive.SummaryStatistics", "addValue", "double", "-1.7976931348623157E308"}});
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("0.0", String.valueOf(actual));
  assertEquals("receiver state after the call", "SummaryStatistics:\nn: 1\nmin: -1.7976931348623157E308\nmax: -1.7976931348623157E308\nmean: -1.7976931348623157E308\ngeometric mean: NaN\nvariance: 0.0\nsum of squares: Infinity\nstandard deviation: 0.0\nsum o...#500#705366924", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput235() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math.stat.descriptive.SummaryStatistics", "org.apache.commons.math.stat.descriptive.SummaryStatistics", "getSumImpl", new String[]{}, new String[]{}, false, 1, new String[][]{{"org.apache.commons.math.stat.descriptive.SummaryStatistics", "getMax", ""}, {"org.apache.commons.math.stat.descriptive.SummaryStatistics", "getPopulationVariance", ""}}), new String[][]{{"getData", "", "7"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "SummaryStatistics:\nn: 0\nmin: NaN\nmax: NaN\nmean: NaN\ngeometric mean: NaN\nvariance: NaN\nsum of squares: 0.0\nstandard deviation: NaN\nsum of logs: 0.0\n {getGeometricMean=NaN, getMax=NaN, getMean=NaN, getM...#350#2146862523", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput236() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math.stat.descriptive.SummaryStatistics", "org.apache.commons.math.stat.descriptive.SummaryStatistics", "getSumsqImpl", new String[]{}, new String[]{}, false, 1, new String[][]{{"org.apache.commons.math.stat.descriptive.SummaryStatistics", "getN", ""}}), new String[][]{{"setData", "double[]", "1"}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.math.stat.descriptive.summary.SumOfSquares", actual.getClass().getName());
  assertEquals("{getData=[0.0, 1.0], getN=0, getResult=0.0}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "SummaryStatistics:\nn: 0\nmin: NaN\nmax: NaN\nmean: NaN\ngeometric mean: NaN\nvariance: NaN\nsum of squares: 0.0\nstandard deviation: NaN\nsum of logs: 0.0\n {getGeometricMean=NaN, getMax=NaN, getMean=NaN, getM...#350#2146862523", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput237() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.stat.descriptive.SummaryStatistics", "org.apache.commons.math.stat.descriptive.SummaryStatistics", "hashCode", new String[]{}, new String[]{}, false, 1, new String[][]{{"org.apache.commons.math.stat.descriptive.SummaryStatistics", "setSumLogImpl", "org.apache.commons.math.stat.descriptive.StorelessUnivariateStatistic", "<sample:7>"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("-616992481", String.valueOf(actual));
  assertEquals("receiver state after the call", "SummaryStatistics:\nn: 0\nmin: NaN\nmax: NaN\nmean: NaN\ngeometric mean: 1.0\nvariance: NaN\nsum of squares: 0.0\nstandard deviation: NaN\nsum of logs: 0.0\n {getGeometricMean=1.0, getMax=NaN, getMean=NaN, getM...#350#20795403", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput238() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.stat.descriptive.SummaryStatistics", "org.apache.commons.math.stat.descriptive.SummaryStatistics", "setVarianceImpl", new String[]{"org.apache.commons.math.stat.descriptive.StorelessUnivariateStatistic"}, new String[]{"<sample:3>"}, false, 5, new String[][]{{"org.apache.commons.math.stat.descriptive.SummaryStatistics", "toString", ""}});
  assertNull(actual);
  assertEquals("receiver state after the call", "SummaryStatistics:\nn: 0\nmin: NaN\nmax: NaN\nmean: NaN\ngeometric mean: NaN\nvariance: 1.0\nsum of squares: 0.0\nstandard deviation: NaN\nsum of logs: 0.0\n {getGeometricMean=NaN, getMax=NaN, getMean=NaN, getM...#350#831060491", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput239() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math.stat.descriptive.SummaryStatistics", "org.apache.commons.math.stat.descriptive.SummaryStatistics", "getVarianceImpl", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.math.stat.descriptive.SummaryStatistics", "getPopulationVariance", ""}}), new String[][]{{"getN", "", "6"}});
  assertNotNull(actual);
  assertEquals("java.lang.Long", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "SummaryStatistics:\nn: 0\nmin: NaN\nmax: NaN\nmean: NaN\ngeometric mean: NaN\nvariance: NaN\nsum of squares: 0.0\nstandard deviation: NaN\nsum of logs: 0.0\n {getGeometricMean=NaN, getMax=NaN, getMean=NaN, getM...#350#2146862523", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput240() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.stat.descriptive.SummaryStatistics", "org.apache.commons.math.stat.descriptive.SummaryStatistics", "getSummary", new String[]{}, new String[]{}, false, 1, new String[][]{{"org.apache.commons.math.stat.descriptive.SummaryStatistics", "toString", ""}, {"org.apache.commons.math.stat.descriptive.SummaryStatistics", "setVarianceImpl", "org.apache.commons.math.stat.descriptive.StorelessUnivariateStatistic", "<sample:2>"}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.math.stat.descriptive.StatisticalSummaryValues", actual.getClass().getName());
  assertEquals("StatisticalSummaryValues:\nn: 0\nmin: NaN\nmax: NaN\nmean: NaN\nstd dev: 0.0\nvariance: 0.0\nsum: 0.0\n {getMax=NaN, getMean=NaN, getMin=NaN, getN=0, getStandardDeviation=0.0, getSum=0.0, getVariance=0.0}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "SummaryStatistics:\nn: 0\nmin: NaN\nmax: NaN\nmean: NaN\ngeometric mean: NaN\nvariance: 0.0\nsum of squares: 0.0\nstandard deviation: NaN\nsum of logs: 0.0\n {getGeometricMean=NaN, getMax=NaN, getMean=NaN, getM...#350#-507461555", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput241() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math.stat.descriptive.SummaryStatistics", "org.apache.commons.math.stat.descriptive.SummaryStatistics", "getSumLogImpl", new String[]{}, new String[]{}, false, 2, new String[][]{{"org.apache.commons.math.stat.descriptive.SummaryStatistics", "setVarianceImpl", "org.apache.commons.math.stat.descriptive.StorelessUnivariateStatistic", "<sample:3>"}}), new String[][]{{"evaluate", "double[],int,int", "4"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("org.apache.commons.math.exception.NumberIsTooLargeException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput242() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.stat.descriptive.SummaryStatistics", "org.apache.commons.math.stat.descriptive.SummaryStatistics", "setMaxImpl", new String[]{"org.apache.commons.math.stat.descriptive.StorelessUnivariateStatistic"}, new String[]{"<sample:7>"}, false, 5, new String[][]{{"org.apache.commons.math.stat.descriptive.SummaryStatistics", "getSumOfLogs", ""}, {"org.apache.commons.math.stat.descriptive.SummaryStatistics", "getSecondMoment", ""}});
  assertNull(actual);
  assertEquals("receiver state after the call", "SummaryStatistics:\nn: 0\nmin: NaN\nmax: 0.0\nmean: NaN\ngeometric mean: NaN\nvariance: NaN\nsum of squares: 0.0\nstandard deviation: NaN\nsum of logs: 0.0\n {getGeometricMean=NaN, getMax=0.0, getMean=NaN, getM...#350#220768717", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput243() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.stat.descriptive.SummaryStatistics", "org.apache.commons.math.stat.descriptive.SummaryStatistics", "hashCode", new String[]{}, new String[]{}, false, 3, new String[][]{{"org.apache.commons.math.stat.descriptive.SummaryStatistics", "setSumsqImpl", "org.apache.commons.math.stat.descriptive.StorelessUnivariateStatistic", "<sample:1>"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("-129404641", String.valueOf(actual));
  assertEquals("receiver state after the call", "SummaryStatistics:\nn: 0\nmin: NaN\nmax: NaN\nmean: NaN\ngeometric mean: NaN\nvariance: NaN\nsum of squares: -1.0\nstandard deviation: NaN\nsum of logs: 0.0\n {getGeometricMean=NaN, getMax=NaN, getMean=NaN, get...#352#-536078183", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput244() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.stat.descriptive.SummaryStatistics", "org.apache.commons.math.stat.descriptive.SummaryStatistics", "getVariance", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.math.stat.descriptive.SummaryStatistics", "setSumImpl", "org.apache.commons.math.stat.descriptive.StorelessUnivariateStatistic", "<sample:3>"}});
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("NaN", String.valueOf(actual));
  assertEquals("receiver state after the call", "SummaryStatistics:\nn: 0\nmin: NaN\nmax: NaN\nmean: NaN\ngeometric mean: NaN\nvariance: NaN\nsum of squares: 0.0\nstandard deviation: NaN\nsum of logs: 0.0\n {getGeometricMean=NaN, getMax=NaN, getMean=NaN, getM...#350#221329212", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput245() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.stat.descriptive.SummaryStatistics", "org.apache.commons.math.stat.descriptive.SummaryStatistics", "setSumImpl", new String[]{"org.apache.commons.math.stat.descriptive.StorelessUnivariateStatistic"}, new String[]{"<sample:11>"}, false, 0, new String[][]{{"org.apache.commons.math.stat.descriptive.SummaryStatistics", "setVarianceImpl", "org.apache.commons.math.stat.descriptive.StorelessUnivariateStatistic", "<sample:8>"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "SummaryStatistics:\nn: 0\nmin: NaN\nmax: NaN\nmean: NaN\ngeometric mean: NaN\nvariance: NaN\nsum of squares: 0.0\nstandard deviation: NaN\nsum of logs: 0.0\n {getGeometricMean=NaN, getMax=NaN, getMean=NaN, getM...#351#1274619221", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput246() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.stat.descriptive.SummaryStatistics", "org.apache.commons.math.stat.descriptive.SummaryStatistics", "setMinImpl", new String[]{"org.apache.commons.math.stat.descriptive.StorelessUnivariateStatistic"}, new String[]{"<sample:3>"}, false, 1, new String[][]{{"org.apache.commons.math.stat.descriptive.SummaryStatistics", "getMinImpl", ""}});
  assertNull(actual);
  assertEquals("receiver state after the call", "SummaryStatistics:\nn: 0\nmin: 1.0\nmax: NaN\nmean: NaN\ngeometric mean: NaN\nvariance: NaN\nsum of squares: 0.0\nstandard deviation: NaN\nsum of logs: 0.0\n {getGeometricMean=NaN, getMax=NaN, getMean=NaN, getM...#350#1361773931", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput247() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math.stat.descriptive.SummaryStatistics", "org.apache.commons.math.stat.descriptive.SummaryStatistics", "getSumsqImpl", new String[]{}, new String[]{}, false), new String[][]{{"evaluate", "double[],int,int", "6"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("org.apache.commons.math.exception.NumberIsTooLargeException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput248() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.stat.descriptive.SummaryStatistics", "org.apache.commons.math.stat.descriptive.SummaryStatistics", "hashCode", new String[]{}, new String[]{}, false, 5, new String[][]{{"org.apache.commons.math.stat.descriptive.SummaryStatistics", "addValue", "double", "-4.9E-324"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("-972906431", String.valueOf(actual));
  assertEquals("receiver state after the call", "SummaryStatistics:\nn: 1\nmin: -4.9E-324\nmax: -4.9E-324\nmean: -4.9E-324\ngeometric mean: NaN\nvariance: 0.0\nsum of squares: 0.0\nstandard deviation: 0.0\nsum of logs: NaN\n {getGeometricMean=NaN, getMax=-4.9...#392#-140365112", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput249() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.stat.descriptive.SummaryStatistics", "org.apache.commons.math.stat.descriptive.SummaryStatistics", "getSumsq", new String[]{}, new String[]{}, false, 7, new String[][]{{"org.apache.commons.math.stat.descriptive.SummaryStatistics", "addValue", "double", "-2.0213217867435561E18"}});
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("4.085741765564162E36", String.valueOf(actual));
  assertEquals("receiver state after the call", "SummaryStatistics:\nn: 1\nmin: -2.0213217867435561E18\nmax: -2.0213217867435561E18\nmean: -2.0213217867435561E18\ngeometric mean: NaN\nvariance: 0.0\nsum of squares: 4.085741765564162E36\nstandard deviation: ...#517#1184328485", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput250() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.stat.descriptive.SummaryStatistics", "org.apache.commons.math.stat.descriptive.SummaryStatistics", "hashCode", new String[]{}, new String[]{}, false, 3, new String[][]{{"org.apache.commons.math.stat.descriptive.SummaryStatistics", "setSumsqImpl", "org.apache.commons.math.stat.descriptive.StorelessUnivariateStatistic", "<sample:9>"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("944337183", String.valueOf(actual));
  assertEquals("receiver state after the call", "SummaryStatistics:\nn: 0\nmin: NaN\nmax: NaN\nmean: NaN\ngeometric mean: NaN\nvariance: NaN\nsum of squares: Infinity\nstandard deviation: NaN\nsum of logs: 0.0\n {getGeometricMean=NaN, getMax=NaN, getMean=NaN,...#360#-463508003", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput251() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math.stat.descriptive.SummaryStatistics", "org.apache.commons.math.stat.descriptive.SummaryStatistics", "getMeanImpl", new String[]{}, new String[]{}, false, 1, new String[][]{{"org.apache.commons.math.stat.descriptive.SummaryStatistics", "getMeanImpl", ""}}), new String[][]{{"incrementAll", "double[],int,int", "5"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("org.apache.commons.math.exception.NumberIsTooLargeException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput252() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math.stat.descriptive.SummaryStatistics", "org.apache.commons.math.stat.descriptive.SummaryStatistics", "getSumImpl", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.math.stat.descriptive.SummaryStatistics", "getSummary", ""}}), new String[][]{{"increment", "double", "0"}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.math.stat.descriptive.summary.Sum", actual.getClass().getName());
  assertEquals("{getData=null, getN=1, getResult=-Infinity}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "SummaryStatistics:\nn: 0\nmin: NaN\nmax: NaN\nmean: NaN\ngeometric mean: NaN\nvariance: NaN\nsum of squares: 0.0\nstandard deviation: NaN\nsum of logs: 0.0\n {getGeometricMean=NaN, getMax=NaN, getMean=NaN, getM...#356#-2113366850", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput253() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.stat.descriptive.SummaryStatistics", "org.apache.commons.math.stat.descriptive.SummaryStatistics", "copy", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.math.stat.descriptive.SummaryStatistics", "setGeoMeanImpl", "org.apache.commons.math.stat.descriptive.StorelessUnivariateStatistic", "<sample:11>"}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.math.stat.descriptive.SummaryStatistics", actual.getClass().getName());
  assertEquals("SummaryStatistics:\nn: 0\nmin: NaN\nmax: NaN\nmean: NaN\ngeometric mean: -1.0\nvariance: NaN\nsum of squares: 0.0\nstandard deviation: NaN\nsum of logs: 0.0\n {getGeometricMean=-1.0, getMax=NaN, getMean=NaN, ge...#352#-1943654327", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "SummaryStatistics:\nn: 0\nmin: NaN\nmax: NaN\nmean: NaN\ngeometric mean: -1.0\nvariance: NaN\nsum of squares: 0.0\nstandard deviation: NaN\nsum of logs: 0.0\n {getGeometricMean=-1.0, getMax=NaN, getMean=NaN, ge...#352#-1943654327", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput254() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math.stat.descriptive.SummaryStatistics", "org.apache.commons.math.stat.descriptive.SummaryStatistics", "getSumLogImpl", new String[]{}, new String[]{}, false, 7, new String[][]{}), new String[][]{{"getResult", "", "1"}});
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("0.0", String.valueOf(actual));
  assertEquals("receiver state after the call", "SummaryStatistics:\nn: 0\nmin: NaN\nmax: NaN\nmean: NaN\ngeometric mean: NaN\nvariance: NaN\nsum of squares: 0.0\nstandard deviation: NaN\nsum of logs: 0.0\n {getGeometricMean=NaN, getMax=NaN, getMean=NaN, getM...#350#2146862523", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput255() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math.stat.descriptive.SummaryStatistics", "org.apache.commons.math.stat.descriptive.SummaryStatistics", "getMinImpl", new String[]{}, new String[]{}, false, 1, new String[][]{{"org.apache.commons.math.stat.descriptive.SummaryStatistics", "getVarianceImpl", ""}, {"org.apache.commons.math.stat.descriptive.SummaryStatistics", "getVariance", ""}}), new String[][]{{"getResult", "", "4"}});
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("NaN", String.valueOf(actual));
  assertEquals("receiver state after the call", "SummaryStatistics:\nn: 0\nmin: NaN\nmax: NaN\nmean: NaN\ngeometric mean: NaN\nvariance: NaN\nsum of squares: 0.0\nstandard deviation: NaN\nsum of logs: 0.0\n {getGeometricMean=NaN, getMax=NaN, getMean=NaN, getM...#350#2146862523", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput256() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math.stat.descriptive.SummaryStatistics", "org.apache.commons.math.stat.descriptive.SummaryStatistics", "getVarianceImpl", new String[]{}, new String[]{}, false, 1, new String[][]{{"org.apache.commons.math.stat.descriptive.SummaryStatistics", "setMaxImpl", "org.apache.commons.math.stat.descriptive.StorelessUnivariateStatistic", "<sample:2>"}, {"org.apache.commons.math.stat.descriptive.SummaryStatistics", "setSumsqImpl", "org.apache.commons.math.stat.descriptive.StorelessUnivariateStatistic", "<sample:0>"}}), new String[][]{{"evaluate", "double[]", "4"}});
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("NaN", String.valueOf(actual));
  assertEquals("receiver state after the call", "SummaryStatistics:\nn: 0\nmin: NaN\nmax: 0.0\nmean: NaN\ngeometric mean: NaN\nvariance: NaN\nsum of squares: -Infinity\nstandard deviation: NaN\nsum of logs: 0.0\n {getGeometricMean=NaN, getMax=0.0, getMean=NaN...#362#1226311981", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput257() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.stat.descriptive.SummaryStatistics", "org.apache.commons.math.stat.descriptive.SummaryStatistics", "getSum", new String[]{}, new String[]{}, false, 1, new String[][]{{"org.apache.commons.math.stat.descriptive.SummaryStatistics", "setSumImpl", "org.apache.commons.math.stat.descriptive.StorelessUnivariateStatistic", "<sample:15>"}});
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("-Infinity", String.valueOf(actual));
  assertEquals("receiver state after the call", "SummaryStatistics:\nn: 0\nmin: NaN\nmax: NaN\nmean: NaN\ngeometric mean: NaN\nvariance: NaN\nsum of squares: 0.0\nstandard deviation: NaN\nsum of logs: 0.0\n {getGeometricMean=NaN, getMax=NaN, getMean=NaN, getM...#356#-2113366850", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput258() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.stat.descriptive.SummaryStatistics", "org.apache.commons.math.stat.descriptive.SummaryStatistics", "hashCode", new String[]{}, new String[]{}, false, 5, new String[][]{{"org.apache.commons.math.stat.descriptive.SummaryStatistics", "setSumsqImpl", "org.apache.commons.math.stat.descriptive.StorelessUnivariateStatistic", "<sample:8>"}, {"org.apache.commons.math.stat.descriptive.SummaryStatistics", "setSumImpl", "org.apache.commons.math.stat.descriptive.StorelessUnivariateStatistic", "<sample:6>"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("-1690734305", String.valueOf(actual));
  assertEquals("receiver state after the call", "SummaryStatistics:\nn: 0\nmin: NaN\nmax: NaN\nmean: NaN\ngeometric mean: NaN\nvariance: NaN\nsum of squares: NaN\nstandard deviation: NaN\nsum of logs: 0.0\n {getGeometricMean=NaN, getMax=NaN, getMean=NaN, getM...#350#1307402180", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput259() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math.stat.descriptive.SummaryStatistics", "org.apache.commons.math.stat.descriptive.SummaryStatistics", "copy", new String[]{}, new String[]{}, false, 3, new String[][]{}), new String[][]{{"getSum", "", "0"}});
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("0.0", String.valueOf(actual));
  assertEquals("receiver state after the call", "SummaryStatistics:\nn: 0\nmin: NaN\nmax: NaN\nmean: NaN\ngeometric mean: NaN\nvariance: NaN\nsum of squares: 0.0\nstandard deviation: NaN\nsum of logs: 0.0\n {getGeometricMean=NaN, getMax=NaN, getMean=NaN, getM...#350#2146862523", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput260() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.stat.descriptive.SummaryStatistics", "org.apache.commons.math.stat.descriptive.SummaryStatistics", "hashCode", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.math.stat.descriptive.SummaryStatistics", "setMinImpl", "org.apache.commons.math.stat.descriptive.StorelessUnivariateStatistic", "<sample:11>"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("1043427615", String.valueOf(actual));
  assertEquals("receiver state after the call", "SummaryStatistics:\nn: 0\nmin: -1.0\nmax: NaN\nmean: NaN\ngeometric mean: NaN\nvariance: NaN\nsum of squares: 0.0\nstandard deviation: NaN\nsum of logs: 0.0\n {getGeometricMean=NaN, getMax=NaN, getMean=NaN, get...#352#-1502693101", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput261() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.stat.descriptive.SummaryStatistics", "org.apache.commons.math.stat.descriptive.SummaryStatistics", "hashCode", new String[]{}, new String[]{}, false, 1, new String[][]{{"org.apache.commons.math.stat.descriptive.SummaryStatistics", "setSumLogImpl", "org.apache.commons.math.stat.descriptive.StorelessUnivariateStatistic", "<sample:11>"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("-822515681", String.valueOf(actual));
  assertEquals("receiver state after the call", "SummaryStatistics:\nn: 0\nmin: NaN\nmax: NaN\nmean: NaN\ngeometric mean: 0.8824969025845955\nvariance: NaN\nsum of squares: 0.0\nstandard deviation: NaN\nsum of logs: -1.0\n {getGeometricMean=0.8824969025845955...#382#-1215086557", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput262() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.stat.descriptive.SummaryStatistics", "org.apache.commons.math.stat.descriptive.SummaryStatistics", "getGeometricMean", new String[]{}, new String[]{}, false, 1, new String[][]{{"org.apache.commons.math.stat.descriptive.SummaryStatistics", "setMinImpl", "org.apache.commons.math.stat.descriptive.StorelessUnivariateStatistic", "<sample:7>"}});
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("NaN", String.valueOf(actual));
  assertEquals("receiver state after the call", "SummaryStatistics:\nn: 0\nmin: 0.0\nmax: NaN\nmean: NaN\ngeometric mean: NaN\nvariance: NaN\nsum of squares: 0.0\nstandard deviation: NaN\nsum of logs: 0.0\n {getGeometricMean=NaN, getMax=NaN, getMean=NaN, getM...#350#-1067426903", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput263() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math.stat.descriptive.SummaryStatistics", "org.apache.commons.math.stat.descriptive.SummaryStatistics", "getVarianceImpl", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.math.stat.descriptive.SummaryStatistics", "addValue", "double", "-0.968"}}), new String[][]{{"evaluate", "double[],double", "2"}, {"setBiasCorrected", "boolean", "0"}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.math.stat.descriptive.moment.Variance", actual.getClass().getName());
  assertEquals("{getData=null, getN=1, getResult=0.0, isBiasCorrected=false}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "SummaryStatistics:\nn: 1\nmin: -0.968\nmax: -0.968\nmean: -0.968\ngeometric mean: NaN\nvariance: 0.0\nsum of squares: 0.937024\nstandard deviation: 0.0\nsum of logs: NaN\n {getGeometricMean=NaN, getMax=-0.968, ...#381#-1359782067", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput264() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math.stat.descriptive.SummaryStatistics", "org.apache.commons.math.stat.descriptive.SummaryStatistics", "getSumLogImpl", new String[]{}, new String[]{}, false, 5, new String[][]{{"org.apache.commons.math.stat.descriptive.SummaryStatistics", "getMin", ""}, {"org.apache.commons.math.stat.descriptive.SummaryStatistics", "getGeometricMean", ""}}), new String[][]{{"evaluate", "", "5"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("org.apache.commons.math.exception.NullArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput265() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math.stat.descriptive.SummaryStatistics", "org.apache.commons.math.stat.descriptive.SummaryStatistics", "getSumsqImpl", new String[]{}, new String[]{}, false), new String[][]{{"getData", "", "5"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "SummaryStatistics:\nn: 0\nmin: NaN\nmax: NaN\nmean: NaN\ngeometric mean: NaN\nvariance: NaN\nsum of squares: 0.0\nstandard deviation: NaN\nsum of logs: 0.0\n {getGeometricMean=NaN, getMax=NaN, getMean=NaN, getM...#350#2146862523", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput266() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.stat.descriptive.SummaryStatistics", "org.apache.commons.math.stat.descriptive.SummaryStatistics", "getMaxImpl", new String[]{}, new String[]{}, false, 6, new String[][]{{"org.apache.commons.math.stat.descriptive.SummaryStatistics", "setVarianceImpl", "org.apache.commons.math.stat.descriptive.StorelessUnivariateStatistic", "<sample:9>"}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.math.stat.descriptive.rank.Max", actual.getClass().getName());
  assertEquals("{getData=null, getN=0, getResult=NaN}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "SummaryStatistics:\nn: 0\nmin: NaN\nmax: NaN\nmean: NaN\ngeometric mean: NaN\nvariance: Infinity\nsum of squares: 0.0\nstandard deviation: NaN\nsum of logs: 0.0\n {getGeometricMean=NaN, getMax=NaN, getMean=NaN,...#360#1103007179", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput267() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.stat.descriptive.SummaryStatistics", "org.apache.commons.math.stat.descriptive.SummaryStatistics", "getGeometricMean", new String[]{}, new String[]{}, false, 4, new String[][]{{"org.apache.commons.math.stat.descriptive.SummaryStatistics", "setMinImpl", "org.apache.commons.math.stat.descriptive.StorelessUnivariateStatistic", "<sample:5>"}});
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("NaN", String.valueOf(actual));
  assertEquals("receiver state after the call", "SummaryStatistics:\nn: 0\nmin: -Infinity\nmax: NaN\nmean: NaN\ngeometric mean: NaN\nvariance: NaN\nsum of squares: 0.0\nstandard deviation: NaN\nsum of logs: 0.0\n {getGeometricMean=NaN, getMax=NaN, getMean=NaN...#362#497028975", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput268() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math.stat.descriptive.SummaryStatistics", "org.apache.commons.math.stat.descriptive.SummaryStatistics", "getMeanImpl", new String[]{}, new String[]{}, false, 7, new String[][]{{"org.apache.commons.math.stat.descriptive.SummaryStatistics", "getGeometricMean", ""}}), new String[][]{{"setData", "double[]", "6"}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.math.stat.descriptive.moment.Mean", actual.getClass().getName());
  assertEquals("{getData=[0.0], getN=0, getResult=NaN}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "SummaryStatistics:\nn: 0\nmin: NaN\nmax: NaN\nmean: NaN\ngeometric mean: NaN\nvariance: NaN\nsum of squares: 0.0\nstandard deviation: NaN\nsum of logs: 0.0\n {getGeometricMean=NaN, getMax=NaN, getMean=NaN, getM...#350#2146862523", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput269() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.stat.descriptive.SummaryStatistics", "org.apache.commons.math.stat.descriptive.SummaryStatistics", "setSumImpl", new String[]{"org.apache.commons.math.stat.descriptive.StorelessUnivariateStatistic"}, new String[]{"<sample:3>"}, false, 1, new String[][]{{"org.apache.commons.math.stat.descriptive.SummaryStatistics", "equals", "java.lang.Object", "<s:a>"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "SummaryStatistics:\nn: 0\nmin: NaN\nmax: NaN\nmean: NaN\ngeometric mean: NaN\nvariance: NaN\nsum of squares: 0.0\nstandard deviation: NaN\nsum of logs: 0.0\n {getGeometricMean=NaN, getMax=NaN, getMean=NaN, getM...#350#221329212", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput270() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.stat.descriptive.SummaryStatistics", "org.apache.commons.math.stat.descriptive.SummaryStatistics", "getSum", new String[]{}, new String[]{}, false, 1, new String[][]{{"org.apache.commons.math.stat.descriptive.SummaryStatistics", "setSumImpl", "org.apache.commons.math.stat.descriptive.StorelessUnivariateStatistic", "<sample:1>"}});
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("-1.0", String.valueOf(actual));
  assertEquals("receiver state after the call", "SummaryStatistics:\nn: 0\nmin: NaN\nmax: NaN\nmean: NaN\ngeometric mean: NaN\nvariance: NaN\nsum of squares: 0.0\nstandard deviation: NaN\nsum of logs: 0.0\n {getGeometricMean=NaN, getMax=NaN, getMean=NaN, getM...#351#1274619221", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput271() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math.stat.descriptive.SummaryStatistics", "org.apache.commons.math.stat.descriptive.SummaryStatistics", "getSumImpl", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.math.stat.descriptive.SummaryStatistics", "setSumLogImpl", "org.apache.commons.math.stat.descriptive.StorelessUnivariateStatistic", "<sample:10>"}}), new String[][]{{"getData", "", "0"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "SummaryStatistics:\nn: 0\nmin: NaN\nmax: NaN\nmean: NaN\ngeometric mean: NaN\nvariance: NaN\nsum of squares: 0.0\nstandard deviation: NaN\nsum of logs: NaN\n {getGeometricMean=NaN, getMax=NaN, getMean=NaN, getM...#350#-352706035", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput272() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.stat.descriptive.SummaryStatistics", "org.apache.commons.math.stat.descriptive.SummaryStatistics", "getSumOfLogs", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.math.stat.descriptive.SummaryStatistics", "addValue", "double", "-2.0213217867435561E18"}});
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("NaN", String.valueOf(actual));
  assertEquals("receiver state after the call", "SummaryStatistics:\nn: 1\nmin: -2.0213217867435561E18\nmax: -2.0213217867435561E18\nmean: -2.0213217867435561E18\ngeometric mean: NaN\nvariance: 0.0\nsum of squares: 4.085741765564162E36\nstandard deviation: ...#517#1184328485", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput273() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math.stat.descriptive.SummaryStatistics", "org.apache.commons.math.stat.descriptive.SummaryStatistics", "getVarianceImpl", new String[]{}, new String[]{}, false, 3, new String[][]{}), new String[][]{{"getResult", "", "4"}, {"getData", "", "2"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "SummaryStatistics:\nn: 0\nmin: NaN\nmax: NaN\nmean: NaN\ngeometric mean: NaN\nvariance: NaN\nsum of squares: 0.0\nstandard deviation: NaN\nsum of logs: 0.0\n {getGeometricMean=NaN, getMax=NaN, getMean=NaN, getM...#350#2146862523", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput274() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.stat.descriptive.SummaryStatistics", "org.apache.commons.math.stat.descriptive.SummaryStatistics", "getVariance", new String[]{}, new String[]{}, false, 4, new String[][]{{"org.apache.commons.math.stat.descriptive.SummaryStatistics", "setSumImpl", "org.apache.commons.math.stat.descriptive.StorelessUnivariateStatistic", "<sample:6>"}});
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("NaN", String.valueOf(actual));
  assertEquals("receiver state after the call", "SummaryStatistics:\nn: 0\nmin: NaN\nmax: NaN\nmean: NaN\ngeometric mean: NaN\nvariance: NaN\nsum of squares: 0.0\nstandard deviation: NaN\nsum of logs: 0.0\n {getGeometricMean=NaN, getMax=NaN, getMean=NaN, getM...#350#424382564", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput275() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math.stat.descriptive.SummaryStatistics", "org.apache.commons.math.stat.descriptive.SummaryStatistics", "getMinImpl", new String[]{}, new String[]{}, false, 7, new String[][]{{"org.apache.commons.math.stat.descriptive.SummaryStatistics", "getMean", ""}}), new String[][]{{"evaluate", "double[]", "7"}});
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("1.0", String.valueOf(actual));
  assertEquals("receiver state after the call", "SummaryStatistics:\nn: 0\nmin: NaN\nmax: NaN\nmean: NaN\ngeometric mean: NaN\nvariance: NaN\nsum of squares: 0.0\nstandard deviation: NaN\nsum of logs: 0.0\n {getGeometricMean=NaN, getMax=NaN, getMean=NaN, getM...#350#2146862523", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput276() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.stat.descriptive.SummaryStatistics", "org.apache.commons.math.stat.descriptive.SummaryStatistics", "setSumLogImpl", new String[]{"org.apache.commons.math.stat.descriptive.StorelessUnivariateStatistic"}, new String[]{"<sample:9>"}, false, 3, new String[][]{});
  assertNull(actual);
  assertEquals("receiver state after the call", "SummaryStatistics:\nn: 0\nmin: NaN\nmax: NaN\nmean: NaN\ngeometric mean: Infinity\nvariance: NaN\nsum of squares: 0.0\nstandard deviation: NaN\nsum of logs: Infinity\n {getGeometricMean=Infinity, getMax=NaN, ge...#370#-1557919543", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput277() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math.stat.descriptive.SummaryStatistics", "org.apache.commons.math.stat.descriptive.SummaryStatistics", "getMinImpl", new String[]{}, new String[]{}, false, 7, new String[][]{}), new String[][]{{"copy", "", "4"}, {"evaluate", "double[]", "5"}});
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("-1.0", String.valueOf(actual));
  assertEquals("receiver state after the call", "SummaryStatistics:\nn: 0\nmin: NaN\nmax: NaN\nmean: NaN\ngeometric mean: NaN\nvariance: NaN\nsum of squares: 0.0\nstandard deviation: NaN\nsum of logs: 0.0\n {getGeometricMean=NaN, getMax=NaN, getMean=NaN, getM...#350#2146862523", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput278() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.stat.descriptive.SummaryStatistics", "org.apache.commons.math.stat.descriptive.SummaryStatistics", "getStandardDeviation", new String[]{}, new String[]{}, false, 4, new String[][]{{"org.apache.commons.math.stat.descriptive.SummaryStatistics", "clear", ""}, {"org.apache.commons.math.stat.descriptive.SummaryStatistics", "setMinImpl", "org.apache.commons.math.stat.descriptive.StorelessUnivariateStatistic", "<sample:11>"}});
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("NaN", String.valueOf(actual));
  assertEquals("receiver state after the call", "SummaryStatistics:\nn: 0\nmin: -1.0\nmax: NaN\nmean: NaN\ngeometric mean: NaN\nvariance: NaN\nsum of squares: 0.0\nstandard deviation: NaN\nsum of logs: 0.0\n {getGeometricMean=NaN, getMax=NaN, getMean=NaN, get...#352#-1502693101", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput279() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math.stat.descriptive.SummaryStatistics", "org.apache.commons.math.stat.descriptive.SummaryStatistics", "getSumImpl", new String[]{}, new String[]{}, false, 5, new String[][]{{"org.apache.commons.math.stat.descriptive.SummaryStatistics", "setSumsqImpl", "org.apache.commons.math.stat.descriptive.StorelessUnivariateStatistic", "<sample:8>"}}), new String[][]{{"evaluate", "double[],int,int", "1"}});
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("0.0", String.valueOf(actual));
  assertEquals("receiver state after the call", "SummaryStatistics:\nn: 0\nmin: NaN\nmax: NaN\nmean: NaN\ngeometric mean: NaN\nvariance: NaN\nsum of squares: NaN\nstandard deviation: NaN\nsum of logs: 0.0\n {getGeometricMean=NaN, getMax=NaN, getMean=NaN, getM...#350#-1265085157", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput280() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.stat.descriptive.SummaryStatistics", "org.apache.commons.math.stat.descriptive.SummaryStatistics", "getMax", new String[]{}, new String[]{}, false, 1, new String[][]{{"org.apache.commons.math.stat.descriptive.SummaryStatistics", "setVarianceImpl", "org.apache.commons.math.stat.descriptive.StorelessUnivariateStatistic", "<sample:11>"}, {"org.apache.commons.math.stat.descriptive.SummaryStatistics", "setMaxImpl", "org.apache.commons.math.stat.descriptive.StorelessUnivariateStatistic", "<sample:1>"}});
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("-1.0", String.valueOf(actual));
  assertEquals("receiver state after the call", "SummaryStatistics:\nn: 0\nmin: NaN\nmax: -1.0\nmean: NaN\ngeometric mean: NaN\nvariance: -1.0\nsum of squares: 0.0\nstandard deviation: NaN\nsum of logs: 0.0\n {getGeometricMean=NaN, getMax=-1.0, getMean=NaN, g...#354#442104223", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput281() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.stat.descriptive.SummaryStatistics", "org.apache.commons.math.stat.descriptive.SummaryStatistics", "getStandardDeviation", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.math.stat.descriptive.SummaryStatistics", "getMaxImpl", ""}, {"org.apache.commons.math.stat.descriptive.SummaryStatistics", "setMinImpl", "org.apache.commons.math.stat.descriptive.StorelessUnivariateStatistic", "<sample:7>"}});
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("NaN", String.valueOf(actual));
  assertEquals("receiver state after the call", "SummaryStatistics:\nn: 0\nmin: 0.0\nmax: NaN\nmean: NaN\ngeometric mean: NaN\nvariance: NaN\nsum of squares: 0.0\nstandard deviation: NaN\nsum of logs: 0.0\n {getGeometricMean=NaN, getMax=NaN, getMean=NaN, getM...#350#-1067426903", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput282() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math.stat.descriptive.SummaryStatistics", "org.apache.commons.math.stat.descriptive.SummaryStatistics", "setGeoMeanImpl", new String[]{"org.apache.commons.math.stat.descriptive.StorelessUnivariateStatistic"}, new String[]{"<sample:9>"}, false, 7, new String[][]{{"org.apache.commons.math.stat.descriptive.SummaryStatistics", "addValue", "double", "-0.06"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("org.apache.commons.math.exception.MathIllegalStateException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput283() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math.stat.descriptive.SummaryStatistics", "org.apache.commons.math.stat.descriptive.SummaryStatistics", "getSumsqImpl", new String[]{}, new String[]{}, false, 1, new String[][]{}), new String[][]{{"increment", "double", "6"}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.math.stat.descriptive.summary.SumOfSquares", actual.getClass().getName());
  assertEquals("{getData=null, getN=1, getResult=1.0}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "SummaryStatistics:\nn: 0\nmin: NaN\nmax: NaN\nmean: NaN\ngeometric mean: NaN\nvariance: NaN\nsum of squares: 1.0\nstandard deviation: NaN\nsum of logs: 0.0\n {getGeometricMean=NaN, getMax=NaN, getMean=NaN, getM...#350#-139303397", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput284() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math.stat.descriptive.SummaryStatistics", "org.apache.commons.math.stat.descriptive.SummaryStatistics", "getVarianceImpl", new String[]{}, new String[]{}, false, 7, new String[][]{}), new String[][]{{"evaluate", "double[],int,int", "5"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("org.apache.commons.math.exception.NumberIsTooLargeException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput285() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math.stat.descriptive.SummaryStatistics", "org.apache.commons.math.stat.descriptive.SummaryStatistics", "getSumImpl", new String[]{}, new String[]{}, false, 3, new String[][]{}), new String[][]{{"setData", "double[]", "7"}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.math.stat.descriptive.summary.Sum", actual.getClass().getName());
  assertEquals("{getData=[1.0, Infinity], getN=0, getResult=0.0}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "SummaryStatistics:\nn: 0\nmin: NaN\nmax: NaN\nmean: NaN\ngeometric mean: NaN\nvariance: NaN\nsum of squares: 0.0\nstandard deviation: NaN\nsum of logs: 0.0\n {getGeometricMean=NaN, getMax=NaN, getMean=NaN, getM...#350#2146862523", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput286() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.stat.descriptive.SummaryStatistics", "org.apache.commons.math.stat.descriptive.SummaryStatistics", "getSecondMoment", new String[]{}, new String[]{}, false, 1, new String[][]{{"org.apache.commons.math.stat.descriptive.SummaryStatistics", "setMinImpl", "org.apache.commons.math.stat.descriptive.StorelessUnivariateStatistic", "<sample:3>"}});
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("NaN", String.valueOf(actual));
  assertEquals("receiver state after the call", "SummaryStatistics:\nn: 0\nmin: 1.0\nmax: NaN\nmean: NaN\ngeometric mean: NaN\nvariance: NaN\nsum of squares: 0.0\nstandard deviation: NaN\nsum of logs: 0.0\n {getGeometricMean=NaN, getMax=NaN, getMean=NaN, getM...#350#1361773931", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput287() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math.stat.descriptive.SummaryStatistics", "org.apache.commons.math.stat.descriptive.SummaryStatistics", "copy", new String[]{}, new String[]{}, false, 6, new String[][]{{"org.apache.commons.math.stat.descriptive.SummaryStatistics", "getMaxImpl", ""}}), new String[][]{{"getSumLogImpl", "", "4"}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.math.stat.descriptive.summary.SumOfLogs", actual.getClass().getName());
  assertEquals("{getData=null, getN=0, getResult=0.0}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "SummaryStatistics:\nn: 0\nmin: NaN\nmax: NaN\nmean: NaN\ngeometric mean: NaN\nvariance: NaN\nsum of squares: 0.0\nstandard deviation: NaN\nsum of logs: 0.0\n {getGeometricMean=NaN, getMax=NaN, getMean=NaN, getM...#350#2146862523", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput288() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.stat.descriptive.SummaryStatistics", "org.apache.commons.math.stat.descriptive.SummaryStatistics", "getMeanImpl", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.math.stat.descriptive.SummaryStatistics", "getSumsq", ""}, {"org.apache.commons.math.stat.descriptive.SummaryStatistics", "setSumsqImpl", "org.apache.commons.math.stat.descriptive.StorelessUnivariateStatistic", "<sample:12>"}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.math.stat.descriptive.moment.Mean", actual.getClass().getName());
  assertEquals("{getData=null, getN=0, getResult=NaN}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "SummaryStatistics:\nn: 0\nmin: NaN\nmax: NaN\nmean: NaN\ngeometric mean: NaN\nvariance: NaN\nsum of squares: NaN\nstandard deviation: NaN\nsum of logs: 0.0\n {getGeometricMean=NaN, getMax=NaN, getMean=NaN, getM...#350#-1265085157", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput289() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math.stat.descriptive.SummaryStatistics", "org.apache.commons.math.stat.descriptive.SummaryStatistics", "setMinImpl", new String[]{"org.apache.commons.math.stat.descriptive.StorelessUnivariateStatistic"}, new String[]{"<sample:4>"}, false, 0, new String[][]{{"org.apache.commons.math.stat.descriptive.SummaryStatistics", "addValue", "double", "-6.1000000000000005"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("org.apache.commons.math.exception.MathIllegalStateException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput290() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.stat.descriptive.SummaryStatistics", "org.apache.commons.math.stat.descriptive.SummaryStatistics", "getVarianceImpl", new String[]{}, new String[]{}, false, 5, new String[][]{{"org.apache.commons.math.stat.descriptive.SummaryStatistics", "setMaxImpl", "org.apache.commons.math.stat.descriptive.StorelessUnivariateStatistic", "<sample:11>"}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.math.stat.descriptive.moment.Variance", actual.getClass().getName());
  assertEquals("{getData=null, getN=0, getResult=NaN, isBiasCorrected=true}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "SummaryStatistics:\nn: 0\nmin: NaN\nmax: -1.0\nmean: NaN\ngeometric mean: NaN\nvariance: NaN\nsum of squares: 0.0\nstandard deviation: NaN\nsum of logs: 0.0\n {getGeometricMean=NaN, getMax=-1.0, getMean=NaN, ge...#352#-1024419709", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput291() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math.stat.descriptive.SummaryStatistics", "org.apache.commons.math.stat.descriptive.SummaryStatistics", "getMinImpl", new String[]{}, new String[]{}, false, 7, new String[][]{{"org.apache.commons.math.stat.descriptive.SummaryStatistics", "setVarianceImpl", "org.apache.commons.math.stat.descriptive.StorelessUnivariateStatistic", "<sample:11>"}}), new String[][]{{"evaluate", "double[]", "1"}});
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("0.0", String.valueOf(actual));
  assertEquals("receiver state after the call", "SummaryStatistics:\nn: 0\nmin: NaN\nmax: NaN\nmean: NaN\ngeometric mean: NaN\nvariance: -1.0\nsum of squares: 0.0\nstandard deviation: NaN\nsum of logs: 0.0\n {getGeometricMean=NaN, getMax=NaN, getMean=NaN, get...#352#1435565963", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput292() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.stat.descriptive.SummaryStatistics", "org.apache.commons.math.stat.descriptive.SummaryStatistics", "getN", new String[]{}, new String[]{}, false, 1, new String[][]{{"org.apache.commons.math.stat.descriptive.SummaryStatistics", "setMinImpl", "org.apache.commons.math.stat.descriptive.StorelessUnivariateStatistic", "<sample:0>"}});
  assertNotNull(actual);
  assertEquals("java.lang.Long", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "SummaryStatistics:\nn: 0\nmin: -Infinity\nmax: NaN\nmean: NaN\ngeometric mean: NaN\nvariance: NaN\nsum of squares: 0.0\nstandard deviation: NaN\nsum of logs: 0.0\n {getGeometricMean=NaN, getMax=NaN, getMean=NaN...#362#497028975", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput293() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.stat.descriptive.SummaryStatistics", "org.apache.commons.math.stat.descriptive.SummaryStatistics", "toString", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.math.stat.descriptive.SummaryStatistics", "setSumImpl", "org.apache.commons.math.stat.descriptive.StorelessUnivariateStatistic", "<sample:6>"}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("SummaryStatistics:\nn: 0\nmin: NaN\nmax: NaN\nmean: NaN\ngeometric mean: NaN\nvariance: NaN\nsum of squares: 0.0\nstandard deviation: NaN\nsum of logs: 0.0\n", String.valueOf(actual));
  assertEquals("receiver state after the call", "SummaryStatistics:\nn: 0\nmin: NaN\nmax: NaN\nmean: NaN\ngeometric mean: NaN\nvariance: NaN\nsum of squares: 0.0\nstandard deviation: NaN\nsum of logs: 0.0\n {getGeometricMean=NaN, getMax=NaN, getMean=NaN, getM...#350#424382564", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput294() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math.stat.descriptive.SummaryStatistics", "org.apache.commons.math.stat.descriptive.SummaryStatistics", "addValue", new String[]{"double"}, new String[]{"NaN"}, false, 1, new String[][]{{"org.apache.commons.math.stat.descriptive.SummaryStatistics", "setSumLogImpl", "org.apache.commons.math.stat.descriptive.StorelessUnivariateStatistic", "<null>"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput295() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math.stat.descriptive.SummaryStatistics", "org.apache.commons.math.stat.descriptive.SummaryStatistics", "getMeanImpl", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.math.stat.descriptive.SummaryStatistics", "setMeanImpl", "org.apache.commons.math.stat.descriptive.StorelessUnivariateStatistic", "<sample:1>"}, {"org.apache.commons.math.stat.descriptive.SummaryStatistics", "getMeanImpl", ""}}), new String[][]{{"getN", "", "4"}});
  assertNotNull(actual);
  assertEquals("java.lang.Long", actual.getClass().getName());
  assertEquals("-1", String.valueOf(actual));
  assertEquals("receiver state after the call", "SummaryStatistics:\nn: 0\nmin: NaN\nmax: NaN\nmean: -1.0\ngeometric mean: NaN\nvariance: NaN\nsum of squares: 0.0\nstandard deviation: NaN\nsum of logs: 0.0\n {getGeometricMean=NaN, getMax=NaN, getMean=-1.0, ge...#352#1693008303", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput296() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math.stat.descriptive.SummaryStatistics", "org.apache.commons.math.stat.descriptive.SummaryStatistics", "getSumLogImpl", new String[]{}, new String[]{}, false, 1, new String[][]{{"org.apache.commons.math.stat.descriptive.SummaryStatistics", "setVarianceImpl", "org.apache.commons.math.stat.descriptive.StorelessUnivariateStatistic", "<sample:4>"}}), new String[][]{{"incrementAll", "double[]", "7"}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.math.stat.descriptive.summary.SumOfLogs", actual.getClass().getName());
  assertEquals("{getData=null, getN=2, getResult=Infinity}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "SummaryStatistics:\nn: 0\nmin: NaN\nmax: NaN\nmean: NaN\ngeometric mean: Infinity\nvariance: NaN\nsum of squares: 0.0\nstandard deviation: NaN\nsum of logs: Infinity\n {getGeometricMean=Infinity, getMax=NaN, ge...#370#-1557919543", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput297() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.stat.descriptive.SummaryStatistics", "org.apache.commons.math.stat.descriptive.SummaryStatistics", "setSumsqImpl", new String[]{"org.apache.commons.math.stat.descriptive.StorelessUnivariateStatistic"}, new String[]{"<sample:3>"}, false, 2, new String[][]{});
  assertNull(actual);
  assertEquals("receiver state after the call", "SummaryStatistics:\nn: 0\nmin: NaN\nmax: NaN\nmean: NaN\ngeometric mean: NaN\nvariance: NaN\nsum of squares: 1.0\nstandard deviation: NaN\nsum of logs: 0.0\n {getGeometricMean=NaN, getMax=NaN, getMean=NaN, getM...#350#-139303397", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput298() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math.stat.descriptive.SummaryStatistics", "org.apache.commons.math.stat.descriptive.SummaryStatistics", "getSumImpl", new String[]{}, new String[]{}, false, 1, new String[][]{}), new String[][]{{"setData", "double[],int,int", "1"}, {"getData", "", "2"}});
  assertNotNull(actual);
  assertEquals("[D", actual.getClass().getName());
  assertEquals("[0.0]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "SummaryStatistics:\nn: 0\nmin: NaN\nmax: NaN\nmean: NaN\ngeometric mean: NaN\nvariance: NaN\nsum of squares: 0.0\nstandard deviation: NaN\nsum of logs: 0.0\n {getGeometricMean=NaN, getMax=NaN, getMean=NaN, getM...#350#2146862523", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput299() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.stat.descriptive.SummaryStatistics", "org.apache.commons.math.stat.descriptive.SummaryStatistics", "getSecondMoment", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.math.stat.descriptive.SummaryStatistics", "setSumsqImpl", "org.apache.commons.math.stat.descriptive.StorelessUnivariateStatistic", "<sample:13>"}, {"org.apache.commons.math.stat.descriptive.SummaryStatistics", "setVarianceImpl", "org.apache.commons.math.stat.descriptive.StorelessUnivariateStatistic", "<sample:10>"}});
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("NaN", String.valueOf(actual));
  assertEquals("receiver state after the call", "SummaryStatistics:\nn: 0\nmin: NaN\nmax: NaN\nmean: NaN\ngeometric mean: NaN\nvariance: NaN\nsum of squares: 1.0\nstandard deviation: NaN\nsum of logs: 0.0\n {getGeometricMean=NaN, getMax=NaN, getMean=NaN, getM...#350#-139303397", SearchInputFactory_scaffolding.receiverState());
 }
}
