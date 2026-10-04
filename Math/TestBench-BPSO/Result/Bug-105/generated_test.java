package generated.algorithm;

import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;
import static org.junit.Assert.*;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class BinaryParticleSwarmGeneratedTest {
 @Test(timeout = 20000)
 public void generatedInput000() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.stat.regression.SimpleRegression", "org.apache.commons.math.stat.regression.SimpleRegression", "clear", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.math.stat.regression.SimpleRegression", "getSlopeConfidenceInterval", "double", "10.0"}}, 1);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getIntercept=NaN, getInterceptStdErr=NaN, getMeanSquareError=NaN, getN=0, getR=NaN, getRSquare=NaN, getRegressionSumSquares=NaN, getSignificance=!IllegalArgumentException, getSlope=NaN, getSlopeConfi...#309#-952591285", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput001() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.stat.regression.SimpleRegression", "org.apache.commons.math.stat.regression.SimpleRegression", "addData", new String[]{"double", "double"}, new String[]{"0.05", "-0.20299999999999999"}, false, 0, new String[][]{{"org.apache.commons.math.stat.regression.SimpleRegression", "addData", "double,double", "5.4E-323", "12.199999999999998"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getIntercept=12.199999999999996, getInterceptStdErr=NaN, getMeanSquareError=NaN, getN=2, getR=-0.9999999999999999, getRSquare=0.9999999999999998, getRegressionSumSquares=76.91720449999995, getSignifi...#417#223218181", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput002() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.stat.regression.SimpleRegression", "org.apache.commons.math.stat.regression.SimpleRegression", "predict", new String[]{"double"}, new String[]{"2.0"}, false, 6, new String[][]{{"org.apache.commons.math.stat.regression.SimpleRegression", "getSlopeConfidenceInterval", "double", "-0.20299999999999999"}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("NaN", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getIntercept=NaN, getInterceptStdErr=NaN, getMeanSquareError=NaN, getN=0, getR=NaN, getRSquare=NaN, getRegressionSumSquares=NaN, getSignificance=!IllegalArgumentException, getSlope=NaN, getSlopeConfi...#309#-952591285", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput003() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.stat.regression.SimpleRegression", "org.apache.commons.math.stat.regression.SimpleRegression", "addData", new String[]{"double[][]"}, new String[]{"<sample:0>"}, false, 0, new String[][]{{"org.apache.commons.math.stat.regression.SimpleRegression", "addData", "double[][]", "<sample:0>"}, {"org.apache.commons.math.stat.regression.SimpleRegression", "getIntercept", ""}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getIntercept=NaN, getInterceptStdErr=NaN, getMeanSquareError=NaN, getN=2, getR=NaN, getRSquare=NaN, getRegressionSumSquares=NaN, getSignificance=!IllegalArgumentException, getSlope=NaN, getSlopeConfi...#309#342919958", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput004() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.stat.regression.SimpleRegression", "org.apache.commons.math.stat.regression.SimpleRegression", "addData", new String[]{"double[][]"}, new String[]{"<sample:0>"}, false, 0, new String[][]{{"org.apache.commons.math.stat.regression.SimpleRegression", "addData", "double[][]", "<sample:1>"}, {"org.apache.commons.math.stat.regression.SimpleRegression", "addData", "double,double", "27.0", "-1.50234452680377165E18"}}, 2);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getIntercept=NaN, getInterceptStdErr=NaN, getMeanSquareError=NaN, getN=3, getR=NaN, getRSquare=NaN, getRegressionSumSquares=NaN, getSignificance=NaN, getSlope=NaN, getSlopeConfidenceInterval=NaN, get...#265#599407946", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput005() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math.stat.regression.SimpleRegression", "org.apache.commons.math.stat.regression.SimpleRegression", "getSlopeConfidenceInterval", new String[]{}, new String[]{}, false, 0, null, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput006() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.stat.regression.SimpleRegression", "org.apache.commons.math.stat.regression.SimpleRegression", "getN", new String[]{}, new String[]{}, false, 4, new String[][]{}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Long", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getIntercept=NaN, getInterceptStdErr=NaN, getMeanSquareError=NaN, getN=0, getR=NaN, getRSquare=NaN, getRegressionSumSquares=NaN, getSignificance=!IllegalArgumentException, getSlope=NaN, getSlopeConfi...#309#-952591285", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput007() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.stat.regression.SimpleRegression", "org.apache.commons.math.stat.regression.SimpleRegression", "clear", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.math.stat.regression.SimpleRegression", "addData", "double[][]", "<sample:2>"}}, 3);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getIntercept=NaN, getInterceptStdErr=NaN, getMeanSquareError=NaN, getN=0, getR=NaN, getRSquare=NaN, getRegressionSumSquares=NaN, getSignificance=!IllegalArgumentException, getSlope=NaN, getSlopeConfi...#309#-952591285", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput008() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.stat.regression.SimpleRegression", "org.apache.commons.math.stat.regression.SimpleRegression", "getMeanSquareError", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.math.stat.regression.SimpleRegression", "getSumSquaredErrors", ""}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("NaN", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getIntercept=NaN, getInterceptStdErr=NaN, getMeanSquareError=NaN, getN=0, getR=NaN, getRSquare=NaN, getRegressionSumSquares=NaN, getSignificance=!IllegalArgumentException, getSlope=NaN, getSlopeConfi...#309#-952591285", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput009() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math.stat.regression.SimpleRegression", "org.apache.commons.math.stat.regression.SimpleRegression", "getSlopeConfidenceInterval", new String[]{"double"}, new String[]{"1.7976931348623155E308"}, false, 2, new String[][]{{"org.apache.commons.math.stat.regression.SimpleRegression", "getMeanSquareError", ""}}, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput010() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.stat.regression.SimpleRegression", "org.apache.commons.math.stat.regression.SimpleRegression", "getSlope", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.math.stat.regression.SimpleRegression", "getSumSquaredErrors", ""}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("NaN", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getIntercept=NaN, getInterceptStdErr=NaN, getMeanSquareError=NaN, getN=0, getR=NaN, getRSquare=NaN, getRegressionSumSquares=NaN, getSignificance=!IllegalArgumentException, getSlope=NaN, getSlopeConfi...#309#-952591285", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput011() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.stat.regression.SimpleRegression", "org.apache.commons.math.stat.regression.SimpleRegression", "getR", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.math.stat.regression.SimpleRegression", "getSlopeConfidenceInterval", ""}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("NaN", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getIntercept=NaN, getInterceptStdErr=NaN, getMeanSquareError=NaN, getN=0, getR=NaN, getRSquare=NaN, getRegressionSumSquares=NaN, getSignificance=!IllegalArgumentException, getSlope=NaN, getSlopeConfi...#309#-952591285", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput012() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.stat.regression.SimpleRegression", "org.apache.commons.math.stat.regression.SimpleRegression", "getSlope", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.math.stat.regression.SimpleRegression", "addData", "double[][]", "<sample:1>"}, {"org.apache.commons.math.stat.regression.SimpleRegression", "getRegressionSumSquares", ""}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("NaN", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getIntercept=NaN, getInterceptStdErr=NaN, getMeanSquareError=NaN, getN=1, getR=NaN, getRSquare=NaN, getRegressionSumSquares=NaN, getSignificance=!IllegalArgumentException, getSlope=NaN, getSlopeConfi...#309#-304363828", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput013() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.stat.regression.SimpleRegression", "org.apache.commons.math.stat.regression.SimpleRegression", "getInterceptStdErr", new String[]{}, new String[]{}, false, 2, new String[][]{{"org.apache.commons.math.stat.regression.SimpleRegression", "addData", "double[][]", "<null>"}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("NaN", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getIntercept=NaN, getInterceptStdErr=NaN, getMeanSquareError=NaN, getN=0, getR=NaN, getRSquare=NaN, getRegressionSumSquares=NaN, getSignificance=!IllegalArgumentException, getSlope=NaN, getSlopeConfi...#309#-952591285", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput014() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.stat.regression.SimpleRegression", "org.apache.commons.math.stat.regression.SimpleRegression", "addData", new String[]{"double", "double"}, new String[]{"-3.0046890536075433E18", "8.988465674311579E307"}, false, 4, new String[][]{{"org.apache.commons.math.stat.regression.SimpleRegression", "getSumSquaredErrors", ""}, {"org.apache.commons.math.stat.regression.SimpleRegression", "getMeanSquareError", ""}}, 3);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getIntercept=NaN, getInterceptStdErr=NaN, getMeanSquareError=NaN, getN=1, getR=NaN, getRSquare=NaN, getRegressionSumSquares=NaN, getSignificance=!IllegalArgumentException, getSlope=NaN, getSlopeConfi...#309#-304363828", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput015() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.stat.regression.SimpleRegression", "org.apache.commons.math.stat.regression.SimpleRegression", "getInterceptStdErr", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.math.stat.regression.SimpleRegression", "getSlopeConfidenceInterval", "double", "2.0"}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("NaN", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getIntercept=NaN, getInterceptStdErr=NaN, getMeanSquareError=NaN, getN=0, getR=NaN, getRSquare=NaN, getRegressionSumSquares=NaN, getSignificance=!IllegalArgumentException, getSlope=NaN, getSlopeConfi...#309#-952591285", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput016() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math.stat.regression.SimpleRegression", "org.apache.commons.math.stat.regression.SimpleRegression", "addData", new String[]{"double[][]"}, new String[]{"<sample:1>"}, false, 0, new String[][]{{"org.apache.commons.math.stat.regression.SimpleRegression", "getSumSquaredErrors", ""}}, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.ArrayIndexOutOfBoundsException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput017() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.stat.regression.SimpleRegression", "org.apache.commons.math.stat.regression.SimpleRegression", "getIntercept", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.math.stat.regression.SimpleRegression", "getIntercept", ""}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("NaN", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getIntercept=NaN, getInterceptStdErr=NaN, getMeanSquareError=NaN, getN=0, getR=NaN, getRSquare=NaN, getRegressionSumSquares=NaN, getSignificance=!IllegalArgumentException, getSlope=NaN, getSlopeConfi...#309#-952591285", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput018() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math.stat.regression.SimpleRegression", "org.apache.commons.math.stat.regression.SimpleRegression", "addData", new String[]{"double[][]"}, new String[]{"<sample:2>"}, false, 0, new String[][]{{"org.apache.commons.math.stat.regression.SimpleRegression", "getSlopeConfidenceInterval", ""}}, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.ArrayIndexOutOfBoundsException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput019() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.stat.regression.SimpleRegression", "org.apache.commons.math.stat.regression.SimpleRegression", "addData", new String[]{"double[][]"}, new String[]{"<sample:6>"}, false, 0, new String[][]{{"org.apache.commons.math.stat.regression.SimpleRegression", "getSlopeConfidenceInterval", ""}}, 1);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getIntercept=NaN, getInterceptStdErr=NaN, getMeanSquareError=NaN, getN=1, getR=NaN, getRSquare=NaN, getRegressionSumSquares=NaN, getSignificance=!IllegalArgumentException, getSlope=NaN, getSlopeConfi...#309#-304363828", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput020() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.stat.regression.SimpleRegression", "org.apache.commons.math.stat.regression.SimpleRegression", "getN", new String[]{}, new String[]{}, false, 0, null, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Long", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getIntercept=NaN, getInterceptStdErr=NaN, getMeanSquareError=NaN, getN=0, getR=NaN, getRSquare=NaN, getRegressionSumSquares=NaN, getSignificance=!IllegalArgumentException, getSlope=NaN, getSlopeConfi...#309#-952591285", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput021() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.stat.regression.SimpleRegression", "org.apache.commons.math.stat.regression.SimpleRegression", "getR", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.math.stat.regression.SimpleRegression", "addData", "double,double", "-1.0", "0.049999999999999996"}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("NaN", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getIntercept=NaN, getInterceptStdErr=NaN, getMeanSquareError=NaN, getN=1, getR=NaN, getRSquare=NaN, getRegressionSumSquares=NaN, getSignificance=!IllegalArgumentException, getSlope=NaN, getSlopeConfi...#309#-304363828", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput022() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.stat.regression.SimpleRegression", "org.apache.commons.math.stat.regression.SimpleRegression", "getRSquare", new String[]{}, new String[]{}, false, 0, null, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("NaN", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getIntercept=NaN, getInterceptStdErr=NaN, getMeanSquareError=NaN, getN=0, getR=NaN, getRSquare=NaN, getRegressionSumSquares=NaN, getSignificance=!IllegalArgumentException, getSlope=NaN, getSlopeConfi...#309#-952591285", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput023() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.stat.regression.SimpleRegression", "org.apache.commons.math.stat.regression.SimpleRegression", "getRegressionSumSquares", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.math.stat.regression.SimpleRegression", "addData", "double,double", "1.7976931348623157E308", "-2.0"}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("NaN", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getIntercept=NaN, getInterceptStdErr=NaN, getMeanSquareError=NaN, getN=1, getR=NaN, getRSquare=NaN, getRegressionSumSquares=NaN, getSignificance=!IllegalArgumentException, getSlope=NaN, getSlopeConfi...#309#-304363828", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput024() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.stat.regression.SimpleRegression", "org.apache.commons.math.stat.regression.SimpleRegression", "predict", new String[]{"double"}, new String[]{"3.0046890536075428E18"}, false, 0, new String[][]{{"org.apache.commons.math.stat.regression.SimpleRegression", "getRegressionSumSquares", ""}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("NaN", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getIntercept=NaN, getInterceptStdErr=NaN, getMeanSquareError=NaN, getN=0, getR=NaN, getRSquare=NaN, getRegressionSumSquares=NaN, getSignificance=!IllegalArgumentException, getSlope=NaN, getSlopeConfi...#309#-952591285", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput025() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.stat.regression.SimpleRegression", "org.apache.commons.math.stat.regression.SimpleRegression", "getRSquare", new String[]{}, new String[]{}, false, 1, new String[][]{{"org.apache.commons.math.stat.regression.SimpleRegression", "getTotalSumSquares", ""}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("NaN", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getIntercept=NaN, getInterceptStdErr=NaN, getMeanSquareError=NaN, getN=0, getR=NaN, getRSquare=NaN, getRegressionSumSquares=NaN, getSignificance=!IllegalArgumentException, getSlope=NaN, getSlopeConfi...#309#-952591285", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput026() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.stat.regression.SimpleRegression", "org.apache.commons.math.stat.regression.SimpleRegression", "clear", new String[]{}, new String[]{}, false, 0, null, 2);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getIntercept=NaN, getInterceptStdErr=NaN, getMeanSquareError=NaN, getN=0, getR=NaN, getRSquare=NaN, getRegressionSumSquares=NaN, getSignificance=!IllegalArgumentException, getSlope=NaN, getSlopeConfi...#309#-952591285", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput027() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.stat.regression.SimpleRegression", "org.apache.commons.math.stat.regression.SimpleRegression", "getRegressionSumSquares", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.math.stat.regression.SimpleRegression", "addData", "double[][]", "<sample:3>"}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("NaN", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getIntercept=NaN, getInterceptStdErr=NaN, getMeanSquareError=NaN, getN=1, getR=NaN, getRSquare=NaN, getRegressionSumSquares=NaN, getSignificance=!IllegalArgumentException, getSlope=NaN, getSlopeConfi...#309#-304363828", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput028() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.stat.regression.SimpleRegression", "org.apache.commons.math.stat.regression.SimpleRegression", "getIntercept", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.math.stat.regression.SimpleRegression", "getSlopeConfidenceInterval", "double", "5.4E-323"}, {"org.apache.commons.math.stat.regression.SimpleRegression", "getSumSquaredErrors", ""}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("NaN", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getIntercept=NaN, getInterceptStdErr=NaN, getMeanSquareError=NaN, getN=0, getR=NaN, getRSquare=NaN, getRegressionSumSquares=NaN, getSignificance=!IllegalArgumentException, getSlope=NaN, getSlopeConfi...#309#-952591285", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput029() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.stat.regression.SimpleRegression", "org.apache.commons.math.stat.regression.SimpleRegression", "getR", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.math.stat.regression.SimpleRegression", "getSlopeConfidenceInterval", ""}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("NaN", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getIntercept=NaN, getInterceptStdErr=NaN, getMeanSquareError=NaN, getN=0, getR=NaN, getRSquare=NaN, getRegressionSumSquares=NaN, getSignificance=!IllegalArgumentException, getSlope=NaN, getSlopeConfi...#309#-952591285", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput030() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.stat.regression.SimpleRegression", "org.apache.commons.math.stat.regression.SimpleRegression", "addData", new String[]{"double", "double"}, new String[]{"-3.0046890536075428E18", "-1.0"}, false, 1, new String[][]{}, 2);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getIntercept=NaN, getInterceptStdErr=NaN, getMeanSquareError=NaN, getN=1, getR=NaN, getRSquare=NaN, getRegressionSumSquares=NaN, getSignificance=!IllegalArgumentException, getSlope=NaN, getSlopeConfi...#309#-304363828", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput031() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.stat.regression.SimpleRegression", "org.apache.commons.math.stat.regression.SimpleRegression", "addData", new String[]{"double", "double"}, new String[]{"-0.40000000000000036", "-3.004689053607543E17"}, false, 2, new String[][]{{"org.apache.commons.math.stat.regression.SimpleRegression", "getMeanSquareError", ""}, {"org.apache.commons.math.stat.regression.SimpleRegression", "getRegressionSumSquares", ""}}, 1);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getIntercept=NaN, getInterceptStdErr=NaN, getMeanSquareError=NaN, getN=1, getR=NaN, getRSquare=NaN, getRegressionSumSquares=NaN, getSignificance=!IllegalArgumentException, getSlope=NaN, getSlopeConfi...#309#-304363828", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput032() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math.stat.regression.SimpleRegression", "org.apache.commons.math.stat.regression.SimpleRegression", "getSignificance", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.math.stat.regression.SimpleRegression", "getInterceptStdErr", ""}}, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput033() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.stat.regression.SimpleRegression", "org.apache.commons.math.stat.regression.SimpleRegression", "getTotalSumSquares", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.math.stat.regression.SimpleRegression", "getSlope", ""}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("NaN", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getIntercept=NaN, getInterceptStdErr=NaN, getMeanSquareError=NaN, getN=0, getR=NaN, getRSquare=NaN, getRegressionSumSquares=NaN, getSignificance=!IllegalArgumentException, getSlope=NaN, getSlopeConfi...#309#-952591285", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput034() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.stat.regression.SimpleRegression", "org.apache.commons.math.stat.regression.SimpleRegression", "getRegressionSumSquares", new String[]{}, new String[]{}, false, 3, new String[][]{}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("NaN", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getIntercept=NaN, getInterceptStdErr=NaN, getMeanSquareError=NaN, getN=0, getR=NaN, getRSquare=NaN, getRegressionSumSquares=NaN, getSignificance=!IllegalArgumentException, getSlope=NaN, getSlopeConfi...#309#-952591285", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput035() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math.stat.regression.SimpleRegression", "org.apache.commons.math.stat.regression.SimpleRegression", "getSlopeConfidenceInterval", new String[]{"double"}, new String[]{"-0.40599999999999997"}, false, 0, null, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput036() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.stat.regression.SimpleRegression", "org.apache.commons.math.stat.regression.SimpleRegression", "getIntercept", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.math.stat.regression.SimpleRegression", "addData", "double,double", "0.2", "4.9E-323"}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("NaN", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getIntercept=NaN, getInterceptStdErr=NaN, getMeanSquareError=NaN, getN=1, getR=NaN, getRSquare=NaN, getRegressionSumSquares=NaN, getSignificance=!IllegalArgumentException, getSlope=NaN, getSlopeConfi...#309#-304363828", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput037() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.stat.regression.SimpleRegression", "org.apache.commons.math.stat.regression.SimpleRegression", "getSumSquaredErrors", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.math.stat.regression.SimpleRegression", "getSlopeConfidenceInterval", "double", "16.05"}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("NaN", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getIntercept=NaN, getInterceptStdErr=NaN, getMeanSquareError=NaN, getN=0, getR=NaN, getRSquare=NaN, getRegressionSumSquares=NaN, getSignificance=!IllegalArgumentException, getSlope=NaN, getSlopeConfi...#309#-952591285", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput038() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.stat.regression.SimpleRegression", "org.apache.commons.math.stat.regression.SimpleRegression", "getSlopeStdErr", new String[]{}, new String[]{}, false, 1, new String[][]{}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("NaN", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getIntercept=NaN, getInterceptStdErr=NaN, getMeanSquareError=NaN, getN=0, getR=NaN, getRSquare=NaN, getRegressionSumSquares=NaN, getSignificance=!IllegalArgumentException, getSlope=NaN, getSlopeConfi...#309#-952591285", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput039() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.stat.regression.SimpleRegression", "org.apache.commons.math.stat.regression.SimpleRegression", "getRegressionSumSquares", new String[]{}, new String[]{}, false, 3, new String[][]{{"org.apache.commons.math.stat.regression.SimpleRegression", "getTotalSumSquares", ""}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("NaN", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getIntercept=NaN, getInterceptStdErr=NaN, getMeanSquareError=NaN, getN=0, getR=NaN, getRSquare=NaN, getRegressionSumSquares=NaN, getSignificance=!IllegalArgumentException, getSlope=NaN, getSlopeConfi...#309#-952591285", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput040() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.stat.regression.SimpleRegression", "org.apache.commons.math.stat.regression.SimpleRegression", "getInterceptStdErr", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.math.stat.regression.SimpleRegression", "getMeanSquareError", ""}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("NaN", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getIntercept=NaN, getInterceptStdErr=NaN, getMeanSquareError=NaN, getN=0, getR=NaN, getRSquare=NaN, getRegressionSumSquares=NaN, getSignificance=!IllegalArgumentException, getSlope=NaN, getSlopeConfi...#309#-952591285", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput041() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.stat.regression.SimpleRegression", "org.apache.commons.math.stat.regression.SimpleRegression", "getTotalSumSquares", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.math.stat.regression.SimpleRegression", "getSlopeConfidenceInterval", ""}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("NaN", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getIntercept=NaN, getInterceptStdErr=NaN, getMeanSquareError=NaN, getN=0, getR=NaN, getRSquare=NaN, getRegressionSumSquares=NaN, getSignificance=!IllegalArgumentException, getSlope=NaN, getSlopeConfi...#309#-952591285", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput042() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.stat.regression.SimpleRegression", "org.apache.commons.math.stat.regression.SimpleRegression", "getN", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.math.stat.regression.SimpleRegression", "addData", "double,double", "-3.0046890536075438E18", "4.94E-322"}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Long", actual.getClass().getName());
  assertEquals("1", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getIntercept=NaN, getInterceptStdErr=NaN, getMeanSquareError=NaN, getN=1, getR=NaN, getRSquare=NaN, getRegressionSumSquares=NaN, getSignificance=!IllegalArgumentException, getSlope=NaN, getSlopeConfi...#309#-304363828", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput043() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.stat.regression.SimpleRegression", "org.apache.commons.math.stat.regression.SimpleRegression", "getN", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.math.stat.regression.SimpleRegression", "addData", "double,double", "0.05", "243.99999999999994"}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Long", actual.getClass().getName());
  assertEquals("1", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getIntercept=NaN, getInterceptStdErr=NaN, getMeanSquareError=NaN, getN=1, getR=NaN, getRSquare=NaN, getRegressionSumSquares=NaN, getSignificance=!IllegalArgumentException, getSlope=NaN, getSlopeConfi...#309#-304363828", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput044() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.stat.regression.SimpleRegression", "org.apache.commons.math.stat.regression.SimpleRegression", "getSlope", new String[]{}, new String[]{}, false, 2, new String[][]{}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("NaN", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getIntercept=NaN, getInterceptStdErr=NaN, getMeanSquareError=NaN, getN=0, getR=NaN, getRSquare=NaN, getRegressionSumSquares=NaN, getSignificance=!IllegalArgumentException, getSlope=NaN, getSlopeConfi...#309#-952591285", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput045() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.stat.regression.SimpleRegression", "org.apache.commons.math.stat.regression.SimpleRegression", "addData", new String[]{"double[][]"}, new String[]{"<sample:0>"}, false, 0, new String[][]{{"org.apache.commons.math.stat.regression.SimpleRegression", "getR", ""}}, 3);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getIntercept=NaN, getInterceptStdErr=NaN, getMeanSquareError=NaN, getN=1, getR=NaN, getRSquare=NaN, getRegressionSumSquares=NaN, getSignificance=!IllegalArgumentException, getSlope=NaN, getSlopeConfi...#309#-304363828", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput046() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.stat.regression.SimpleRegression", "org.apache.commons.math.stat.regression.SimpleRegression", "addData", new String[]{"double[][]"}, new String[]{"<empty>"}, false, 0, new String[][]{{"org.apache.commons.math.stat.regression.SimpleRegression", "getSlopeConfidenceInterval", ""}}, 3);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getIntercept=NaN, getInterceptStdErr=NaN, getMeanSquareError=NaN, getN=0, getR=NaN, getRSquare=NaN, getRegressionSumSquares=NaN, getSignificance=!IllegalArgumentException, getSlope=NaN, getSlopeConfi...#309#-952591285", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput047() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math.stat.regression.SimpleRegression", "org.apache.commons.math.stat.regression.SimpleRegression", "getSignificance", new String[]{}, new String[]{}, false, 3, new String[][]{{"org.apache.commons.math.stat.regression.SimpleRegression", "getSlopeStdErr", ""}}, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput048() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math.stat.regression.SimpleRegression", "org.apache.commons.math.stat.regression.SimpleRegression", "addData", new String[]{"double[][]"}, new String[]{"<sample:2>"}, false, 0, new String[][]{{"org.apache.commons.math.stat.regression.SimpleRegression", "getIntercept", ""}, {"org.apache.commons.math.stat.regression.SimpleRegression", "addData", "double[][]", "<sample:1>"}}, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.ArrayIndexOutOfBoundsException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput049() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.stat.regression.SimpleRegression", "org.apache.commons.math.stat.regression.SimpleRegression", "getMeanSquareError", new String[]{}, new String[]{}, false, 3, new String[][]{}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("NaN", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getIntercept=NaN, getInterceptStdErr=NaN, getMeanSquareError=NaN, getN=0, getR=NaN, getRSquare=NaN, getRegressionSumSquares=NaN, getSignificance=!IllegalArgumentException, getSlope=NaN, getSlopeConfi...#309#-952591285", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput050() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.stat.regression.SimpleRegression", "org.apache.commons.math.stat.regression.SimpleRegression", "getTotalSumSquares", new String[]{}, new String[]{}, false, 0, null, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("NaN", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getIntercept=NaN, getInterceptStdErr=NaN, getMeanSquareError=NaN, getN=0, getR=NaN, getRSquare=NaN, getRegressionSumSquares=NaN, getSignificance=!IllegalArgumentException, getSlope=NaN, getSlopeConfi...#309#-952591285", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput051() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.stat.regression.SimpleRegression", "org.apache.commons.math.stat.regression.SimpleRegression", "getRegressionSumSquares", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.math.stat.regression.SimpleRegression", "getR", ""}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("NaN", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getIntercept=NaN, getInterceptStdErr=NaN, getMeanSquareError=NaN, getN=0, getR=NaN, getRSquare=NaN, getRegressionSumSquares=NaN, getSignificance=!IllegalArgumentException, getSlope=NaN, getSlopeConfi...#309#-952591285", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput052() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.stat.regression.SimpleRegression", "org.apache.commons.math.stat.regression.SimpleRegression", "getRSquare", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.math.stat.regression.SimpleRegression", "addData", "double[][]", "<sample:2>"}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("NaN", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getIntercept=NaN, getInterceptStdErr=NaN, getMeanSquareError=NaN, getN=0, getR=NaN, getRSquare=NaN, getRegressionSumSquares=NaN, getSignificance=!IllegalArgumentException, getSlope=NaN, getSlopeConfi...#309#-952591285", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput053() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.stat.regression.SimpleRegression", "org.apache.commons.math.stat.regression.SimpleRegression", "getSumSquaredErrors", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.math.stat.regression.SimpleRegression", "getMeanSquareError", ""}, {"org.apache.commons.math.stat.regression.SimpleRegression", "getSlopeConfidenceInterval", "double", "8.9"}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("NaN", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getIntercept=NaN, getInterceptStdErr=NaN, getMeanSquareError=NaN, getN=0, getR=NaN, getRSquare=NaN, getRegressionSumSquares=NaN, getSignificance=!IllegalArgumentException, getSlope=NaN, getSlopeConfi...#309#-952591285", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput054() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.stat.regression.SimpleRegression", "org.apache.commons.math.stat.regression.SimpleRegression", "addData", new String[]{"double[][]"}, new String[]{"<sample:0>"}, false, 0, new String[][]{{"org.apache.commons.math.stat.regression.SimpleRegression", "predict", "double", "-1.0"}}, 2);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getIntercept=NaN, getInterceptStdErr=NaN, getMeanSquareError=NaN, getN=1, getR=NaN, getRSquare=NaN, getRegressionSumSquares=NaN, getSignificance=!IllegalArgumentException, getSlope=NaN, getSlopeConfi...#309#-304363828", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput055() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.stat.regression.SimpleRegression", "org.apache.commons.math.stat.regression.SimpleRegression", "getR", new String[]{}, new String[]{}, false, 0, null, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("NaN", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getIntercept=NaN, getInterceptStdErr=NaN, getMeanSquareError=NaN, getN=0, getR=NaN, getRSquare=NaN, getRegressionSumSquares=NaN, getSignificance=!IllegalArgumentException, getSlope=NaN, getSlopeConfi...#309#-952591285", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput056() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math.stat.regression.SimpleRegression", "org.apache.commons.math.stat.regression.SimpleRegression", "addData", new String[]{"double[][]"}, new String[]{"<null>"}, false, 5, new String[][]{}, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput057() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.stat.regression.SimpleRegression", "org.apache.commons.math.stat.regression.SimpleRegression", "getRSquare", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.math.stat.regression.SimpleRegression", "addData", "double[][]", "<sample:0>"}, {"org.apache.commons.math.stat.regression.SimpleRegression", "getR", ""}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("NaN", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getIntercept=NaN, getInterceptStdErr=NaN, getMeanSquareError=NaN, getN=1, getR=NaN, getRSquare=NaN, getRegressionSumSquares=NaN, getSignificance=!IllegalArgumentException, getSlope=NaN, getSlopeConfi...#309#-304363828", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput058() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.stat.regression.SimpleRegression", "org.apache.commons.math.stat.regression.SimpleRegression", "addData", new String[]{"double[][]"}, new String[]{"<sample:3>"}, false, 0, new String[][]{{"org.apache.commons.math.stat.regression.SimpleRegression", "addData", "double,double", "-1.7976931348623157E308", "0.024999999999999998"}}, 1);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getIntercept=NaN, getInterceptStdErr=NaN, getMeanSquareError=NaN, getN=2, getR=NaN, getRSquare=NaN, getRegressionSumSquares=NaN, getSignificance=!IllegalArgumentException, getSlope=NaN, getSlopeConfi...#315#1940813645", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput059() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math.stat.regression.SimpleRegression", "org.apache.commons.math.stat.regression.SimpleRegression", "getSignificance", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.math.stat.regression.SimpleRegression", "getSlopeConfidenceInterval", ""}}, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput060() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.stat.regression.SimpleRegression", "org.apache.commons.math.stat.regression.SimpleRegression", "addData", new String[]{"double[][]"}, new String[]{"<empty>"}, false, 0, new String[][]{{"org.apache.commons.math.stat.regression.SimpleRegression", "getInterceptStdErr", ""}, {"org.apache.commons.math.stat.regression.SimpleRegression", "predict", "double", "Infinity"}}, 1);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getIntercept=NaN, getInterceptStdErr=NaN, getMeanSquareError=NaN, getN=0, getR=NaN, getRSquare=NaN, getRegressionSumSquares=NaN, getSignificance=!IllegalArgumentException, getSlope=NaN, getSlopeConfi...#309#-952591285", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput061() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.stat.regression.SimpleRegression", "org.apache.commons.math.stat.regression.SimpleRegression", "getR", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.math.stat.regression.SimpleRegression", "addData", "double,double", "-6.0093781072150866E18", "4.0"}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("NaN", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getIntercept=NaN, getInterceptStdErr=NaN, getMeanSquareError=NaN, getN=1, getR=NaN, getRSquare=NaN, getRegressionSumSquares=NaN, getSignificance=!IllegalArgumentException, getSlope=NaN, getSlopeConfi...#309#-304363828", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput062() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.stat.regression.SimpleRegression", "org.apache.commons.math.stat.regression.SimpleRegression", "getInterceptStdErr", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.math.stat.regression.SimpleRegression", "getR", ""}, {"org.apache.commons.math.stat.regression.SimpleRegression", "addData", "double,double", "2.0", "4.89"}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("NaN", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getIntercept=NaN, getInterceptStdErr=NaN, getMeanSquareError=NaN, getN=1, getR=NaN, getRSquare=NaN, getRegressionSumSquares=NaN, getSignificance=!IllegalArgumentException, getSlope=NaN, getSlopeConfi...#309#-304363828", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput063() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.stat.regression.SimpleRegression", "org.apache.commons.math.stat.regression.SimpleRegression", "addData", new String[]{"double", "double"}, new String[]{"20.560000000000002", "1.9500000000000004"}, false, 0, new String[][]{{"org.apache.commons.math.stat.regression.SimpleRegression", "addData", "double,double", "Infinity", "3.0000000000000004"}}, 1);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getIntercept=NaN, getInterceptStdErr=NaN, getMeanSquareError=NaN, getN=2, getR=NaN, getRSquare=NaN, getRegressionSumSquares=NaN, getSignificance=!IllegalArgumentException, getSlope=NaN, getSlopeConfi...#313#152156082", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput064() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.stat.regression.SimpleRegression", "org.apache.commons.math.stat.regression.SimpleRegression", "getN", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.math.stat.regression.SimpleRegression", "getIntercept", ""}, {"org.apache.commons.math.stat.regression.SimpleRegression", "getIntercept", ""}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Long", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getIntercept=NaN, getInterceptStdErr=NaN, getMeanSquareError=NaN, getN=0, getR=NaN, getRSquare=NaN, getRegressionSumSquares=NaN, getSignificance=!IllegalArgumentException, getSlope=NaN, getSlopeConfi...#309#-952591285", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput065() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math.stat.regression.SimpleRegression", "org.apache.commons.math.stat.regression.SimpleRegression", "getSlopeConfidenceInterval", new String[]{"double"}, new String[]{"12.199999999999996"}, false, 0, new String[][]{{"org.apache.commons.math.stat.regression.SimpleRegression", "addData", "double,double", "-0.9999999999999999", "-Infinity"}}, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput066() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.stat.regression.SimpleRegression", "org.apache.commons.math.stat.regression.SimpleRegression", "getIntercept", new String[]{}, new String[]{}, false, 6, new String[][]{{"org.apache.commons.math.stat.regression.SimpleRegression", "addData", "double[][]", "<sample:4>"}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("NaN", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getIntercept=NaN, getInterceptStdErr=NaN, getMeanSquareError=NaN, getN=1, getR=NaN, getRSquare=NaN, getRegressionSumSquares=NaN, getSignificance=!IllegalArgumentException, getSlope=NaN, getSlopeConfi...#309#-304363828", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput067() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.stat.regression.SimpleRegression", "org.apache.commons.math.stat.regression.SimpleRegression", "getIntercept", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.math.stat.regression.SimpleRegression", "getInterceptStdErr", ""}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("NaN", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getIntercept=NaN, getInterceptStdErr=NaN, getMeanSquareError=NaN, getN=0, getR=NaN, getRSquare=NaN, getRegressionSumSquares=NaN, getSignificance=!IllegalArgumentException, getSlope=NaN, getSlopeConfi...#309#-952591285", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput068() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.stat.regression.SimpleRegression", "org.apache.commons.math.stat.regression.SimpleRegression", "addData", new String[]{"double", "double"}, new String[]{"-0.45", "49.0"}, false, 0, new String[][]{{"org.apache.commons.math.stat.regression.SimpleRegression", "addData", "double[][]", "<sample:4>"}}, 3);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getIntercept=89.0909090909091, getInterceptStdErr=NaN, getMeanSquareError=NaN, getN=2, getR=1.0, getRSquare=1.0, getRegressionSumSquares=1200.5000000000002, getSignificance=!IllegalArgumentException,...#353#-951241796", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput069() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.stat.regression.SimpleRegression", "org.apache.commons.math.stat.regression.SimpleRegression", "predict", new String[]{"double"}, new String[]{"-12.199999999999998"}, false, 0, new String[][]{{"org.apache.commons.math.stat.regression.SimpleRegression", "addData", "double[][]", "<sample:1>"}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("NaN", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getIntercept=NaN, getInterceptStdErr=NaN, getMeanSquareError=NaN, getN=1, getR=NaN, getRSquare=NaN, getRegressionSumSquares=NaN, getSignificance=!IllegalArgumentException, getSlope=NaN, getSlopeConfi...#309#-304363828", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput070() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.stat.regression.SimpleRegression", "org.apache.commons.math.stat.regression.SimpleRegression", "predict", new String[]{"double"}, new String[]{"100.0"}, false, 0, new String[][]{{"org.apache.commons.math.stat.regression.SimpleRegression", "getSlope", ""}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("NaN", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getIntercept=NaN, getInterceptStdErr=NaN, getMeanSquareError=NaN, getN=0, getR=NaN, getRSquare=NaN, getRegressionSumSquares=NaN, getSignificance=!IllegalArgumentException, getSlope=NaN, getSlopeConfi...#309#-952591285", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput071() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.stat.regression.SimpleRegression", "org.apache.commons.math.stat.regression.SimpleRegression", "getMeanSquareError", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.math.stat.regression.SimpleRegression", "getR", ""}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("NaN", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getIntercept=NaN, getInterceptStdErr=NaN, getMeanSquareError=NaN, getN=0, getR=NaN, getRSquare=NaN, getRegressionSumSquares=NaN, getSignificance=!IllegalArgumentException, getSlope=NaN, getSlopeConfi...#309#-952591285", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput072() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math.stat.regression.SimpleRegression", "org.apache.commons.math.stat.regression.SimpleRegression", "getSlopeConfidenceInterval", new String[]{}, new String[]{}, false, 0, null, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput073() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.stat.regression.SimpleRegression", "org.apache.commons.math.stat.regression.SimpleRegression", "addData", new String[]{"double[][]"}, new String[]{"<sample:3>"}, false, 0, new String[][]{{"org.apache.commons.math.stat.regression.SimpleRegression", "addData", "double[][]", "<sample:7>"}}, 1);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getIntercept=NaN, getInterceptStdErr=NaN, getMeanSquareError=NaN, getN=2, getR=NaN, getRSquare=NaN, getRegressionSumSquares=NaN, getSignificance=!IllegalArgumentException, getSlope=NaN, getSlopeConfi...#314#140651466", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput074() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math.stat.regression.SimpleRegression", "org.apache.commons.math.stat.regression.SimpleRegression", "addData", new String[]{"double[][]"}, new String[]{"<null>"}, false, 0, new String[][]{{"org.apache.commons.math.stat.regression.SimpleRegression", "getIntercept", ""}}, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput075() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.stat.regression.SimpleRegression", "org.apache.commons.math.stat.regression.SimpleRegression", "addData", new String[]{"double[][]"}, new String[]{"<empty>"}, false, 0, new String[][]{{"org.apache.commons.math.stat.regression.SimpleRegression", "getSumSquaredErrors", ""}}, 2);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getIntercept=NaN, getInterceptStdErr=NaN, getMeanSquareError=NaN, getN=0, getR=NaN, getRSquare=NaN, getRegressionSumSquares=NaN, getSignificance=!IllegalArgumentException, getSlope=NaN, getSlopeConfi...#309#-952591285", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput076() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math.stat.regression.SimpleRegression", "org.apache.commons.math.stat.regression.SimpleRegression", "addData", new String[]{"double[][]"}, new String[]{"<null>"}, false, 0, new String[][]{{"org.apache.commons.math.stat.regression.SimpleRegression", "getIntercept", ""}}, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput077() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.stat.regression.SimpleRegression", "org.apache.commons.math.stat.regression.SimpleRegression", "predict", new String[]{"double"}, new String[]{"Infinity"}, false, 0, new String[][]{{"org.apache.commons.math.stat.regression.SimpleRegression", "addData", "double[][]", "<sample:0>"}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("NaN", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getIntercept=NaN, getInterceptStdErr=NaN, getMeanSquareError=NaN, getN=1, getR=NaN, getRSquare=NaN, getRegressionSumSquares=NaN, getSignificance=!IllegalArgumentException, getSlope=NaN, getSlopeConfi...#309#-304363828", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput078() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.stat.regression.SimpleRegression", "org.apache.commons.math.stat.regression.SimpleRegression", "getSlopeStdErr", new String[]{}, new String[]{}, false, 6, new String[][]{}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("NaN", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getIntercept=NaN, getInterceptStdErr=NaN, getMeanSquareError=NaN, getN=0, getR=NaN, getRSquare=NaN, getRegressionSumSquares=NaN, getSignificance=!IllegalArgumentException, getSlope=NaN, getSlopeConfi...#309#-952591285", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput079() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.stat.regression.SimpleRegression", "org.apache.commons.math.stat.regression.SimpleRegression", "getSlope", new String[]{}, new String[]{}, false, 6, new String[][]{{"org.apache.commons.math.stat.regression.SimpleRegression", "getSignificance", ""}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("NaN", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getIntercept=NaN, getInterceptStdErr=NaN, getMeanSquareError=NaN, getN=0, getR=NaN, getRSquare=NaN, getRegressionSumSquares=NaN, getSignificance=!IllegalArgumentException, getSlope=NaN, getSlopeConfi...#309#-952591285", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput080() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.stat.regression.SimpleRegression", "org.apache.commons.math.stat.regression.SimpleRegression", "getMeanSquareError", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.math.stat.regression.SimpleRegression", "getR", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("NaN", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getIntercept=NaN, getInterceptStdErr=NaN, getMeanSquareError=NaN, getN=0, getR=NaN, getRSquare=NaN, getRegressionSumSquares=NaN, getSignificance=!IllegalArgumentException, getSlope=NaN, getSlopeConfi...#309#-952591285", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput081() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.stat.regression.SimpleRegression", "org.apache.commons.math.stat.regression.SimpleRegression", "getInterceptStdErr", new String[]{}, new String[]{}, false, 6, new String[][]{});
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("NaN", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getIntercept=NaN, getInterceptStdErr=NaN, getMeanSquareError=NaN, getN=0, getR=NaN, getRSquare=NaN, getRegressionSumSquares=NaN, getSignificance=!IllegalArgumentException, getSlope=NaN, getSlopeConfi...#309#-952591285", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput082() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.stat.regression.SimpleRegression", "org.apache.commons.math.stat.regression.SimpleRegression", "getSlope", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.math.stat.regression.SimpleRegression", "addData", "double[][]", "<sample:0>"}});
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("NaN", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getIntercept=NaN, getInterceptStdErr=NaN, getMeanSquareError=NaN, getN=1, getR=NaN, getRSquare=NaN, getRegressionSumSquares=NaN, getSignificance=!IllegalArgumentException, getSlope=NaN, getSlopeConfi...#309#-304363828", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput083() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.stat.regression.SimpleRegression", "org.apache.commons.math.stat.regression.SimpleRegression", "getN", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.math.stat.regression.SimpleRegression", "getSlopeConfidenceInterval", "double", "12.2"}});
  assertNotNull(actual);
  assertEquals("java.lang.Long", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getIntercept=NaN, getInterceptStdErr=NaN, getMeanSquareError=NaN, getN=0, getR=NaN, getRSquare=NaN, getRegressionSumSquares=NaN, getSignificance=!IllegalArgumentException, getSlope=NaN, getSlopeConfi...#309#-952591285", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput084() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.stat.regression.SimpleRegression", "org.apache.commons.math.stat.regression.SimpleRegression", "getRegressionSumSquares", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.math.stat.regression.SimpleRegression", "getSlopeStdErr", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("NaN", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getIntercept=NaN, getInterceptStdErr=NaN, getMeanSquareError=NaN, getN=0, getR=NaN, getRSquare=NaN, getRegressionSumSquares=NaN, getSignificance=!IllegalArgumentException, getSlope=NaN, getSlopeConfi...#309#-952591285", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput085() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math.stat.regression.SimpleRegression", "org.apache.commons.math.stat.regression.SimpleRegression", "getSignificance", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.math.stat.regression.SimpleRegression", "clear", ""}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput086() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math.stat.regression.SimpleRegression", "org.apache.commons.math.stat.regression.SimpleRegression", "addData", new String[]{"double[][]"}, new String[]{"<null>"}, false); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput087() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.stat.regression.SimpleRegression", "org.apache.commons.math.stat.regression.SimpleRegression", "getRSquare", new String[]{}, new String[]{}, false);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("NaN", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getIntercept=NaN, getInterceptStdErr=NaN, getMeanSquareError=NaN, getN=0, getR=NaN, getRSquare=NaN, getRegressionSumSquares=NaN, getSignificance=!IllegalArgumentException, getSlope=NaN, getSlopeConfi...#309#-952591285", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput088() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math.stat.regression.SimpleRegression", "org.apache.commons.math.stat.regression.SimpleRegression", "getSlopeConfidenceInterval", new String[]{}, new String[]{}, false); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput089() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.stat.regression.SimpleRegression", "org.apache.commons.math.stat.regression.SimpleRegression", "getR", new String[]{}, new String[]{}, false);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("NaN", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getIntercept=NaN, getInterceptStdErr=NaN, getMeanSquareError=NaN, getN=0, getR=NaN, getRSquare=NaN, getRegressionSumSquares=NaN, getSignificance=!IllegalArgumentException, getSlope=NaN, getSlopeConfi...#309#-952591285", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput090() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math.stat.regression.SimpleRegression", "org.apache.commons.math.stat.regression.SimpleRegression", "getSlopeConfidenceInterval", new String[]{"double"}, new String[]{"2.0"}, false, 0, new String[][]{{"org.apache.commons.math.stat.regression.SimpleRegression", "getSlopeConfidenceInterval", "double", "-3.0"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput091() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.stat.regression.SimpleRegression", "org.apache.commons.math.stat.regression.SimpleRegression", "getIntercept", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.math.stat.regression.SimpleRegression", "predict", "double", "Infinity"}});
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("NaN", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getIntercept=NaN, getInterceptStdErr=NaN, getMeanSquareError=NaN, getN=0, getR=NaN, getRSquare=NaN, getRegressionSumSquares=NaN, getSignificance=!IllegalArgumentException, getSlope=NaN, getSlopeConfi...#309#-952591285", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput092() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.stat.regression.SimpleRegression", "org.apache.commons.math.stat.regression.SimpleRegression", "clear", new String[]{}, new String[]{}, false, 2, new String[][]{});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getIntercept=NaN, getInterceptStdErr=NaN, getMeanSquareError=NaN, getN=0, getR=NaN, getRSquare=NaN, getRegressionSumSquares=NaN, getSignificance=!IllegalArgumentException, getSlope=NaN, getSlopeConfi...#309#-952591285", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput093() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math.stat.regression.SimpleRegression", "org.apache.commons.math.stat.regression.SimpleRegression", "addData", new String[]{"double[][]"}, new String[]{"<sample:2>"}, false, 0, new String[][]{{"org.apache.commons.math.stat.regression.SimpleRegression", "getSlopeConfidenceInterval", "double", "12.2"}, {"org.apache.commons.math.stat.regression.SimpleRegression", "getIntercept", ""}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.ArrayIndexOutOfBoundsException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput094() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.stat.regression.SimpleRegression", "org.apache.commons.math.stat.regression.SimpleRegression", "getSlope", new String[]{}, new String[]{}, false);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("NaN", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getIntercept=NaN, getInterceptStdErr=NaN, getMeanSquareError=NaN, getN=0, getR=NaN, getRSquare=NaN, getRegressionSumSquares=NaN, getSignificance=!IllegalArgumentException, getSlope=NaN, getSlopeConfi...#309#-952591285", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput095() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.stat.regression.SimpleRegression", "org.apache.commons.math.stat.regression.SimpleRegression", "getTotalSumSquares", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.math.stat.regression.SimpleRegression", "getMeanSquareError", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("NaN", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getIntercept=NaN, getInterceptStdErr=NaN, getMeanSquareError=NaN, getN=0, getR=NaN, getRSquare=NaN, getRegressionSumSquares=NaN, getSignificance=!IllegalArgumentException, getSlope=NaN, getSlopeConfi...#309#-952591285", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput096() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.stat.regression.SimpleRegression", "org.apache.commons.math.stat.regression.SimpleRegression", "getR", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.math.stat.regression.SimpleRegression", "addData", "double,double", "Infinity", "-3.2100000000000004"}});
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("NaN", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getIntercept=NaN, getInterceptStdErr=NaN, getMeanSquareError=NaN, getN=1, getR=NaN, getRSquare=NaN, getRegressionSumSquares=NaN, getSignificance=!IllegalArgumentException, getSlope=NaN, getSlopeConfi...#309#-304363828", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput097() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.stat.regression.SimpleRegression", "org.apache.commons.math.stat.regression.SimpleRegression", "addData", new String[]{"double[][]"}, new String[]{"<sample:0>"}, false, 0, new String[][]{{"org.apache.commons.math.stat.regression.SimpleRegression", "getSumSquaredErrors", ""}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getIntercept=NaN, getInterceptStdErr=NaN, getMeanSquareError=NaN, getN=1, getR=NaN, getRSquare=NaN, getRegressionSumSquares=NaN, getSignificance=!IllegalArgumentException, getSlope=NaN, getSlopeConfi...#309#-304363828", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput098() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.stat.regression.SimpleRegression", "org.apache.commons.math.stat.regression.SimpleRegression", "predict", new String[]{"double"}, new String[]{"4.0"}, false, 0, new String[][]{{"org.apache.commons.math.stat.regression.SimpleRegression", "getIntercept", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("NaN", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getIntercept=NaN, getInterceptStdErr=NaN, getMeanSquareError=NaN, getN=0, getR=NaN, getRSquare=NaN, getRegressionSumSquares=NaN, getSignificance=!IllegalArgumentException, getSlope=NaN, getSlopeConfi...#309#-952591285", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput099() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.stat.regression.SimpleRegression", "org.apache.commons.math.stat.regression.SimpleRegression", "addData", new String[]{"double[][]"}, new String[]{"<empty>"}, false);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getIntercept=NaN, getInterceptStdErr=NaN, getMeanSquareError=NaN, getN=0, getR=NaN, getRSquare=NaN, getRegressionSumSquares=NaN, getSignificance=!IllegalArgumentException, getSlope=NaN, getSlopeConfi...#309#-952591285", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput100() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.stat.regression.SimpleRegression", "org.apache.commons.math.stat.regression.SimpleRegression", "getSlopeStdErr", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.math.stat.regression.SimpleRegression", "getSumSquaredErrors", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("NaN", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getIntercept=NaN, getInterceptStdErr=NaN, getMeanSquareError=NaN, getN=0, getR=NaN, getRSquare=NaN, getRegressionSumSquares=NaN, getSignificance=!IllegalArgumentException, getSlope=NaN, getSlopeConfi...#309#-952591285", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput101() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.stat.regression.SimpleRegression", "org.apache.commons.math.stat.regression.SimpleRegression", "predict", new String[]{"double"}, new String[]{"12.232"}, false, 0, new String[][]{{"org.apache.commons.math.stat.regression.SimpleRegression", "addData", "double,double", "-Infinity", "2.84"}, {"org.apache.commons.math.stat.regression.SimpleRegression", "getSumSquaredErrors", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("NaN", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getIntercept=NaN, getInterceptStdErr=NaN, getMeanSquareError=NaN, getN=1, getR=NaN, getRSquare=NaN, getRegressionSumSquares=NaN, getSignificance=!IllegalArgumentException, getSlope=NaN, getSlopeConfi...#309#-304363828", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput102() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.stat.regression.SimpleRegression", "org.apache.commons.math.stat.regression.SimpleRegression", "addData", new String[]{"double", "double"}, new String[]{"2.0", "NaN"}, false);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getIntercept=NaN, getInterceptStdErr=NaN, getMeanSquareError=NaN, getN=1, getR=NaN, getRSquare=NaN, getRegressionSumSquares=NaN, getSignificance=!IllegalArgumentException, getSlope=NaN, getSlopeConfi...#309#-304363828", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput103() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.stat.regression.SimpleRegression", "org.apache.commons.math.stat.regression.SimpleRegression", "getRSquare", new String[]{}, new String[]{}, false, 7, new String[][]{{"org.apache.commons.math.stat.regression.SimpleRegression", "addData", "double,double", "1.7976931348623157E308", "24.4"}, {"org.apache.commons.math.stat.regression.SimpleRegression", "getMeanSquareError", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("NaN", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getIntercept=NaN, getInterceptStdErr=NaN, getMeanSquareError=NaN, getN=1, getR=NaN, getRSquare=NaN, getRegressionSumSquares=NaN, getSignificance=!IllegalArgumentException, getSlope=NaN, getSlopeConfi...#309#-304363828", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput104() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.stat.regression.SimpleRegression", "org.apache.commons.math.stat.regression.SimpleRegression", "getIntercept", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.math.stat.regression.SimpleRegression", "addData", "double[][]", "<sample:1>"}});
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("NaN", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getIntercept=NaN, getInterceptStdErr=NaN, getMeanSquareError=NaN, getN=1, getR=NaN, getRSquare=NaN, getRegressionSumSquares=NaN, getSignificance=!IllegalArgumentException, getSlope=NaN, getSlopeConfi...#309#-304363828", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput105() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.stat.regression.SimpleRegression", "org.apache.commons.math.stat.regression.SimpleRegression", "getSumSquaredErrors", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.math.stat.regression.SimpleRegression", "predict", "double", "-0.1"}});
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("NaN", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getIntercept=NaN, getInterceptStdErr=NaN, getMeanSquareError=NaN, getN=0, getR=NaN, getRSquare=NaN, getRegressionSumSquares=NaN, getSignificance=!IllegalArgumentException, getSlope=NaN, getSlopeConfi...#309#-952591285", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput106() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.stat.regression.SimpleRegression", "org.apache.commons.math.stat.regression.SimpleRegression", "addData", new String[]{"double", "double"}, new String[]{"NaN", "1.7976931348623157E308"}, false, 0, new String[][]{{"org.apache.commons.math.stat.regression.SimpleRegression", "addData", "double[][]", "<sample:4>"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getIntercept=NaN, getInterceptStdErr=NaN, getMeanSquareError=NaN, getN=2, getR=NaN, getRSquare=NaN, getRegressionSumSquares=NaN, getSignificance=!IllegalArgumentException, getSlope=NaN, getSlopeConfi...#314#140651466", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput107() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.stat.regression.SimpleRegression", "org.apache.commons.math.stat.regression.SimpleRegression", "getN", new String[]{}, new String[]{}, false, 5, new String[][]{{"org.apache.commons.math.stat.regression.SimpleRegression", "getSlope", ""}, {"org.apache.commons.math.stat.regression.SimpleRegression", "addData", "double,double", "0.5000000000000001", "0.5"}});
  assertNotNull(actual);
  assertEquals("java.lang.Long", actual.getClass().getName());
  assertEquals("1", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getIntercept=NaN, getInterceptStdErr=NaN, getMeanSquareError=NaN, getN=1, getR=NaN, getRSquare=NaN, getRegressionSumSquares=NaN, getSignificance=!IllegalArgumentException, getSlope=NaN, getSlopeConfi...#309#-304363828", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput108() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.stat.regression.SimpleRegression", "org.apache.commons.math.stat.regression.SimpleRegression", "addData", new String[]{"double", "double"}, new String[]{"5.1000000000000005", "1.22"}, false, 5, new String[][]{{"org.apache.commons.math.stat.regression.SimpleRegression", "addData", "double,double", "Infinity", "-0.18"}, {"org.apache.commons.math.stat.regression.SimpleRegression", "addData", "double[][]", "<sample:2>"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getIntercept=NaN, getInterceptStdErr=NaN, getMeanSquareError=NaN, getN=2, getR=NaN, getRSquare=NaN, getRegressionSumSquares=NaN, getSignificance=!IllegalArgumentException, getSlope=NaN, getSlopeConfi...#324#889797590", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput109() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.stat.regression.SimpleRegression", "org.apache.commons.math.stat.regression.SimpleRegression", "getTotalSumSquares", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.math.stat.regression.SimpleRegression", "addData", "double,double", "-2.9000000000000004", "-1.22"}});
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("NaN", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getIntercept=NaN, getInterceptStdErr=NaN, getMeanSquareError=NaN, getN=1, getR=NaN, getRSquare=NaN, getRegressionSumSquares=NaN, getSignificance=!IllegalArgumentException, getSlope=NaN, getSlopeConfi...#309#-304363828", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput110() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.stat.regression.SimpleRegression", "org.apache.commons.math.stat.regression.SimpleRegression", "getRegressionSumSquares", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.math.stat.regression.SimpleRegression", "addData", "double,double", "3", "1.0000000000000002"}});
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("NaN", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getIntercept=NaN, getInterceptStdErr=NaN, getMeanSquareError=NaN, getN=1, getR=NaN, getRSquare=NaN, getRegressionSumSquares=NaN, getSignificance=!IllegalArgumentException, getSlope=NaN, getSlopeConfi...#309#-304363828", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput111() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.stat.regression.SimpleRegression", "org.apache.commons.math.stat.regression.SimpleRegression", "addData", new String[]{"double", "double"}, new String[]{"4.94E-322", "0.9999999999999999"}, false, 1, new String[][]{{"org.apache.commons.math.stat.regression.SimpleRegression", "getSlopeStdErr", ""}, {"org.apache.commons.math.stat.regression.SimpleRegression", "addData", "double[][]", "<sample:3>"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getIntercept=NaN, getInterceptStdErr=NaN, getMeanSquareError=NaN, getN=2, getR=NaN, getRSquare=NaN, getRegressionSumSquares=NaN, getSignificance=!IllegalArgumentException, getSlope=NaN, getSlopeConfi...#309#342979540", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput112() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.stat.regression.SimpleRegression", "org.apache.commons.math.stat.regression.SimpleRegression", "getInterceptStdErr", new String[]{}, new String[]{}, false, 3, new String[][]{{"org.apache.commons.math.stat.regression.SimpleRegression", "addData", "double[][]", "<sample:4>"}});
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("NaN", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getIntercept=NaN, getInterceptStdErr=NaN, getMeanSquareError=NaN, getN=1, getR=NaN, getRSquare=NaN, getRegressionSumSquares=NaN, getSignificance=!IllegalArgumentException, getSlope=NaN, getSlopeConfi...#309#-304363828", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput113() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.stat.regression.SimpleRegression", "org.apache.commons.math.stat.regression.SimpleRegression", "getMeanSquareError", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.math.stat.regression.SimpleRegression", "addData", "double,double", "2.994", "12.199999999999996"}});
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("NaN", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getIntercept=NaN, getInterceptStdErr=NaN, getMeanSquareError=NaN, getN=1, getR=NaN, getRSquare=NaN, getRegressionSumSquares=NaN, getSignificance=!IllegalArgumentException, getSlope=NaN, getSlopeConfi...#309#-304363828", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput114() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.stat.regression.SimpleRegression", "org.apache.commons.math.stat.regression.SimpleRegression", "addData", new String[]{"double", "double"}, new String[]{"2.5E-323", "-3.0000000000000004"}, false, 5, new String[][]{{"org.apache.commons.math.stat.regression.SimpleRegression", "addData", "double,double", "5.1000000000000005", "1.0"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getIntercept=-3.0, getInterceptStdErr=NaN, getMeanSquareError=NaN, getN=2, getR=1.0, getRSquare=1.0, getRegressionSumSquares=8.0, getSignificance=!IllegalArgumentException, getSlope=0.784313725490196...#324#-2081994813", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput115() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.stat.regression.SimpleRegression", "org.apache.commons.math.stat.regression.SimpleRegression", "addData", new String[]{"double[][]"}, new String[]{"<sample:0>"}, false, 0, new String[][]{{"org.apache.commons.math.stat.regression.SimpleRegression", "addData", "double,double", "5.100000000000001", "-0.1"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getIntercept=1.0, getInterceptStdErr=NaN, getMeanSquareError=NaN, getN=2, getR=-1.0, getRSquare=1.0, getRegressionSumSquares=0.6050000000000001, getSignificance=!IllegalArgumentException, getSlope=-0...#357#1152391755", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput116() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.stat.regression.SimpleRegression", "org.apache.commons.math.stat.regression.SimpleRegression", "addData", new String[]{"double", "double"}, new String[]{"-0.0040000000000000036", "NaN"}, false, 0, new String[][]{{"org.apache.commons.math.stat.regression.SimpleRegression", "addData", "double,double", "-Infinity", "12.2"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getIntercept=NaN, getInterceptStdErr=NaN, getMeanSquareError=NaN, getN=2, getR=NaN, getRSquare=NaN, getRegressionSumSquares=NaN, getSignificance=!IllegalArgumentException, getSlope=NaN, getSlopeConfi...#309#343863629", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput117() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.stat.regression.SimpleRegression", "org.apache.commons.math.stat.regression.SimpleRegression", "addData", new String[]{"double", "double"}, new String[]{"-1.1E-322", "5.4E-323"}, false, 0, new String[][]{{"org.apache.commons.math.stat.regression.SimpleRegression", "addData", "double,double", "3.0046890536075433E18", "1.7976931348623158E307"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getIntercept=-Infinity, getInterceptStdErr=NaN, getMeanSquareError=NaN, getN=2, getR=NaN, getRSquare=NaN, getRegressionSumSquares=Infinity, getSignificance=!IllegalArgumentException, getSlope=Infinit...#330#649880642", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput118() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.stat.regression.SimpleRegression", "org.apache.commons.math.stat.regression.SimpleRegression", "addData", new String[]{"double[][]"}, new String[]{"<sample:9>"}, false, 0, new String[][]{{"org.apache.commons.math.stat.regression.SimpleRegression", "addData", "double,double", "4.0", "NaN"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getIntercept=NaN, getInterceptStdErr=NaN, getMeanSquareError=NaN, getN=2, getR=NaN, getRSquare=NaN, getRegressionSumSquares=NaN, getSignificance=!IllegalArgumentException, getSlope=NaN, getSlopeConfi...#309#343863629", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput119() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.stat.regression.SimpleRegression", "org.apache.commons.math.stat.regression.SimpleRegression", "addData", new String[]{"double[][]"}, new String[]{"<sample:3>"}, false, 7, new String[][]{{"org.apache.commons.math.stat.regression.SimpleRegression", "getSignificance", ""}, {"org.apache.commons.math.stat.regression.SimpleRegression", "addData", "double[][]", "<sample:0>"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getIntercept=NaN, getInterceptStdErr=NaN, getMeanSquareError=NaN, getN=2, getR=NaN, getRSquare=NaN, getRegressionSumSquares=NaN, getSignificance=!IllegalArgumentException, getSlope=NaN, getSlopeConfi...#309#342979540", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput120() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.stat.regression.SimpleRegression", "org.apache.commons.math.stat.regression.SimpleRegression", "getTotalSumSquares", new String[]{}, new String[]{}, false, 4, new String[][]{{"org.apache.commons.math.stat.regression.SimpleRegression", "addData", "double,double", "2.0000000000000004", "-0.18000000000000002"}, {"org.apache.commons.math.stat.regression.SimpleRegression", "getSumSquaredErrors", ""}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("NaN", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getIntercept=NaN, getInterceptStdErr=NaN, getMeanSquareError=NaN, getN=1, getR=NaN, getRSquare=NaN, getRegressionSumSquares=NaN, getSignificance=!IllegalArgumentException, getSlope=NaN, getSlopeConfi...#309#-304363828", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput121() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.stat.regression.SimpleRegression", "org.apache.commons.math.stat.regression.SimpleRegression", "getSlopeStdErr", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.math.stat.regression.SimpleRegression", "getSlopeConfidenceInterval", "double", "0.1"}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("NaN", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getIntercept=NaN, getInterceptStdErr=NaN, getMeanSquareError=NaN, getN=0, getR=NaN, getRSquare=NaN, getRegressionSumSquares=NaN, getSignificance=!IllegalArgumentException, getSlope=NaN, getSlopeConfi...#309#-952591285", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput122() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.stat.regression.SimpleRegression", "org.apache.commons.math.stat.regression.SimpleRegression", "getRegressionSumSquares", new String[]{}, new String[]{}, false, 7, new String[][]{{"org.apache.commons.math.stat.regression.SimpleRegression", "addData", "double,double", "0.5", "-3004689053607543335"}, {"org.apache.commons.math.stat.regression.SimpleRegression", "addData", "double[][]", "<sample:6>"}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("Infinity", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getIntercept=NaN, getInterceptStdErr=NaN, getMeanSquareError=NaN, getN=2, getR=NaN, getRSquare=NaN, getRegressionSumSquares=Infinity, getSignificance=!IllegalArgumentException, getSlope=Infinity, get...#324#-684576868", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput123() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.stat.regression.SimpleRegression", "org.apache.commons.math.stat.regression.SimpleRegression", "addData", new String[]{"double", "double"}, new String[]{"-3.2200000000000006", "2.5"}, false, 3, new String[][]{{"org.apache.commons.math.stat.regression.SimpleRegression", "addData", "double,double", "12.199999999999998", "-3.0000000000000004"}}, 3);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getIntercept=1.3514915693904015, getInterceptStdErr=NaN, getMeanSquareError=NaN, getN=2, getR=-1.0, getRSquare=1.0, getRegressionSumSquares=15.125, getSignificance=!IllegalArgumentException, getSlope...#347#-1600436285", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput124() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.stat.regression.SimpleRegression", "org.apache.commons.math.stat.regression.SimpleRegression", "getSumSquaredErrors", new String[]{}, new String[]{}, false, 3, new String[][]{{"org.apache.commons.math.stat.regression.SimpleRegression", "addData", "double[][]", "<sample:3>"}});
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("NaN", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getIntercept=NaN, getInterceptStdErr=NaN, getMeanSquareError=NaN, getN=1, getR=NaN, getRSquare=NaN, getRegressionSumSquares=NaN, getSignificance=!IllegalArgumentException, getSlope=NaN, getSlopeConfi...#309#-304363828", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput125() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.stat.regression.SimpleRegression", "org.apache.commons.math.stat.regression.SimpleRegression", "getSumSquaredErrors", new String[]{}, new String[]{}, false, 7, new String[][]{{"org.apache.commons.math.stat.regression.SimpleRegression", "getN", ""}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("NaN", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getIntercept=NaN, getInterceptStdErr=NaN, getMeanSquareError=NaN, getN=0, getR=NaN, getRSquare=NaN, getRegressionSumSquares=NaN, getSignificance=!IllegalArgumentException, getSlope=NaN, getSlopeConfi...#309#-952591285", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput126() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.stat.regression.SimpleRegression", "org.apache.commons.math.stat.regression.SimpleRegression", "addData", new String[]{"double", "double"}, new String[]{"-0.20299999999999996", "4.0"}, false, 3, new String[][]{{"org.apache.commons.math.stat.regression.SimpleRegression", "addData", "double,double", "-12.199999999999998", "-1.7976931348623157E308"}, {"org.apache.commons.math.stat.regression.SimpleRegression", "getSlope", ""}}, 3);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getIntercept=Infinity, getInterceptStdErr=NaN, getMeanSquareError=NaN, getN=2, getR=NaN, getRSquare=NaN, getRegressionSumSquares=Infinity, getSignificance=!IllegalArgumentException, getSlope=Infinity...#329#1124939171", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput127() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.stat.regression.SimpleRegression", "org.apache.commons.math.stat.regression.SimpleRegression", "getSlopeStdErr", new String[]{}, new String[]{}, false, 3, new String[][]{{"org.apache.commons.math.stat.regression.SimpleRegression", "addData", "double,double", "-6.0", "-2.03"}});
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("NaN", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getIntercept=NaN, getInterceptStdErr=NaN, getMeanSquareError=NaN, getN=1, getR=NaN, getRSquare=NaN, getRegressionSumSquares=NaN, getSignificance=!IllegalArgumentException, getSlope=NaN, getSlopeConfi...#309#-304363828", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput128() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.stat.regression.SimpleRegression", "org.apache.commons.math.stat.regression.SimpleRegression", "getRegressionSumSquares", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.math.stat.regression.SimpleRegression", "addData", "double,double", "5.1000000000000005", "1.0"}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("NaN", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getIntercept=NaN, getInterceptStdErr=NaN, getMeanSquareError=NaN, getN=1, getR=NaN, getRSquare=NaN, getRegressionSumSquares=NaN, getSignificance=!IllegalArgumentException, getSlope=NaN, getSlopeConfi...#309#-304363828", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput129() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.stat.regression.SimpleRegression", "org.apache.commons.math.stat.regression.SimpleRegression", "getSlope", new String[]{}, new String[]{}, false, 6, new String[][]{{"org.apache.commons.math.stat.regression.SimpleRegression", "addData", "double,double", "0.18", "-0.20299999999999999"}, {"org.apache.commons.math.stat.regression.SimpleRegression", "getSlopeConfidenceInterval", ""}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("NaN", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getIntercept=NaN, getInterceptStdErr=NaN, getMeanSquareError=NaN, getN=1, getR=NaN, getRSquare=NaN, getRegressionSumSquares=NaN, getSignificance=!IllegalArgumentException, getSlope=NaN, getSlopeConfi...#309#-304363828", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput130() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.stat.regression.SimpleRegression", "org.apache.commons.math.stat.regression.SimpleRegression", "getTotalSumSquares", new String[]{}, new String[]{}, false, 3, new String[][]{{"org.apache.commons.math.stat.regression.SimpleRegression", "getSlopeStdErr", ""}, {"org.apache.commons.math.stat.regression.SimpleRegression", "addData", "double,double", "2.5785000000000005", "-Infinity"}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("NaN", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getIntercept=NaN, getInterceptStdErr=NaN, getMeanSquareError=NaN, getN=1, getR=NaN, getRSquare=NaN, getRegressionSumSquares=NaN, getSignificance=!IllegalArgumentException, getSlope=NaN, getSlopeConfi...#309#-304363828", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput131() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.stat.regression.SimpleRegression", "org.apache.commons.math.stat.regression.SimpleRegression", "getRSquare", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.math.stat.regression.SimpleRegression", "addData", "double[][]", "<sample:1>"}, {"org.apache.commons.math.stat.regression.SimpleRegression", "getR", ""}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("NaN", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getIntercept=NaN, getInterceptStdErr=NaN, getMeanSquareError=NaN, getN=1, getR=NaN, getRSquare=NaN, getRegressionSumSquares=NaN, getSignificance=!IllegalArgumentException, getSlope=NaN, getSlopeConfi...#309#-304363828", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput132() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.stat.regression.SimpleRegression", "org.apache.commons.math.stat.regression.SimpleRegression", "addData", new String[]{"double[][]"}, new String[]{"<sample:3>"}, false, 6, new String[][]{{"org.apache.commons.math.stat.regression.SimpleRegression", "addData", "double,double", "42.797", "2.0000000000000004"}}, 2);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getIntercept=NaN, getInterceptStdErr=NaN, getMeanSquareError=NaN, getN=2, getR=NaN, getRSquare=NaN, getRegressionSumSquares=NaN, getSignificance=!IllegalArgumentException, getSlope=NaN, getSlopeConfi...#323#-1575551125", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput133() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.stat.regression.SimpleRegression", "org.apache.commons.math.stat.regression.SimpleRegression", "getMeanSquareError", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.math.stat.regression.SimpleRegression", "addData", "double,double", "48.8", "NaN"}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("NaN", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getIntercept=NaN, getInterceptStdErr=NaN, getMeanSquareError=NaN, getN=1, getR=NaN, getRSquare=NaN, getRegressionSumSquares=NaN, getSignificance=!IllegalArgumentException, getSlope=NaN, getSlopeConfi...#309#-304363828", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput134() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.stat.regression.SimpleRegression", "org.apache.commons.math.stat.regression.SimpleRegression", "addData", new String[]{"double", "double"}, new String[]{"4.88", "12.2"}, false, 0, new String[][]{{"org.apache.commons.math.stat.regression.SimpleRegression", "addData", "double,double", "-0.08", "1.0"}, {"org.apache.commons.math.stat.regression.SimpleRegression", "addData", "double,double", "Infinity", "1.22"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getIntercept=NaN, getInterceptStdErr=NaN, getMeanSquareError=NaN, getN=3, getR=NaN, getRSquare=NaN, getRegressionSumSquares=NaN, getSignificance=NaN, getSlope=NaN, getSlopeConfidenceInterval=NaN, get...#279#507546515", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput135() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.stat.regression.SimpleRegression", "org.apache.commons.math.stat.regression.SimpleRegression", "getSlope", new String[]{}, new String[]{}, false, 7, new String[][]{{"org.apache.commons.math.stat.regression.SimpleRegression", "addData", "double[][]", "<sample:1>"}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("NaN", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getIntercept=NaN, getInterceptStdErr=NaN, getMeanSquareError=NaN, getN=1, getR=NaN, getRSquare=NaN, getRegressionSumSquares=NaN, getSignificance=!IllegalArgumentException, getSlope=NaN, getSlopeConfi...#309#-304363828", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput136() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.stat.regression.SimpleRegression", "org.apache.commons.math.stat.regression.SimpleRegression", "addData", new String[]{"double", "double"}, new String[]{"0.6899999999999997", "24.399999999999995"}, false, 0, new String[][]{{"org.apache.commons.math.stat.regression.SimpleRegression", "addData", "double,double", "NaN", "-0.1"}}, 2);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getIntercept=NaN, getInterceptStdErr=NaN, getMeanSquareError=NaN, getN=2, getR=NaN, getRSquare=NaN, getRegressionSumSquares=NaN, getSignificance=!IllegalArgumentException, getSlope=NaN, getSlopeConfi...#323#-589588048", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput137() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.stat.regression.SimpleRegression", "org.apache.commons.math.stat.regression.SimpleRegression", "addData", new String[]{"double", "double"}, new String[]{"Infinity", "-3.0046890536075423E18"}, false, 0, new String[][]{{"org.apache.commons.math.stat.regression.SimpleRegression", "addData", "double[][]", "<sample:1>"}}, 2);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getIntercept=NaN, getInterceptStdErr=NaN, getMeanSquareError=NaN, getN=2, getR=NaN, getRSquare=NaN, getRegressionSumSquares=NaN, getSignificance=!IllegalArgumentException, getSlope=NaN, getSlopeConfi...#314#140651466", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput138() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.stat.regression.SimpleRegression", "org.apache.commons.math.stat.regression.SimpleRegression", "getInterceptStdErr", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.math.stat.regression.SimpleRegression", "addData", "double,double", "-5.1000000000000005", "-5.78"}, {"org.apache.commons.math.stat.regression.SimpleRegression", "addData", "double,double", "1.7976931348623158E307", "-1.7976931348623157E308"}});
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("NaN", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getIntercept=NaN, getInterceptStdErr=NaN, getMeanSquareError=NaN, getN=2, getR=NaN, getRSquare=NaN, getRegressionSumSquares=NaN, getSignificance=!IllegalArgumentException, getSlope=NaN, getSlopeConfi...#314#140651466", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput139() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.stat.regression.SimpleRegression", "org.apache.commons.math.stat.regression.SimpleRegression", "addData", new String[]{"double[][]"}, new String[]{"<sample:0>"}, false, 4, new String[][]{{"org.apache.commons.math.stat.regression.SimpleRegression", "addData", "double,double", "-0.08", "NaN"}}, 1);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getIntercept=NaN, getInterceptStdErr=NaN, getMeanSquareError=NaN, getN=2, getR=NaN, getRSquare=NaN, getRegressionSumSquares=NaN, getSignificance=!IllegalArgumentException, getSlope=NaN, getSlopeConfi...#309#343863629", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput140() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.stat.regression.SimpleRegression", "org.apache.commons.math.stat.regression.SimpleRegression", "addData", new String[]{"double", "double"}, new String[]{"0.1", "5.4E-323"}, false, 0, new String[][]{{"org.apache.commons.math.stat.regression.SimpleRegression", "addData", "double[][]", "<sample:1>"}, {"org.apache.commons.math.stat.regression.SimpleRegression", "getTotalSumSquares", ""}}, 3);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getIntercept=NaN, getInterceptStdErr=NaN, getMeanSquareError=NaN, getN=2, getR=NaN, getRSquare=NaN, getRegressionSumSquares=Infinity, getSignificance=!IllegalArgumentException, getSlope=Infinity, get...#324#-684576868", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput141() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.stat.regression.SimpleRegression", "org.apache.commons.math.stat.regression.SimpleRegression", "getSumSquaredErrors", new String[]{}, new String[]{}, false, 6, new String[][]{{"org.apache.commons.math.stat.regression.SimpleRegression", "addData", "double[][]", "<sample:4>"}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("NaN", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getIntercept=NaN, getInterceptStdErr=NaN, getMeanSquareError=NaN, getN=1, getR=NaN, getRSquare=NaN, getRegressionSumSquares=NaN, getSignificance=!IllegalArgumentException, getSlope=NaN, getSlopeConfi...#309#-304363828", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput142() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.stat.regression.SimpleRegression", "org.apache.commons.math.stat.regression.SimpleRegression", "addData", new String[]{"double", "double"}, new String[]{"Infinity", "0.20299999999999999"}, false, 0, new String[][]{{"org.apache.commons.math.stat.regression.SimpleRegression", "addData", "double,double", "-9.2", "4.9E-324"}, {"org.apache.commons.math.stat.regression.SimpleRegression", "getR", ""}}, 1);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getIntercept=NaN, getInterceptStdErr=NaN, getMeanSquareError=NaN, getN=2, getR=NaN, getRSquare=NaN, getRegressionSumSquares=NaN, getSignificance=!IllegalArgumentException, getSlope=NaN, getSlopeConfi...#326#1351128932", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput143() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.stat.regression.SimpleRegression", "org.apache.commons.math.stat.regression.SimpleRegression", "addData", new String[]{"double", "double"}, new String[]{"-10.2", "-0.20299999999999999"}, false, 0, new String[][]{{"org.apache.commons.math.stat.regression.SimpleRegression", "getSlope", ""}, {"org.apache.commons.math.stat.regression.SimpleRegression", "addData", "double[][]", "<sample:1>"}}, 2);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getIntercept=Infinity, getInterceptStdErr=NaN, getMeanSquareError=NaN, getN=2, getR=NaN, getRSquare=NaN, getRegressionSumSquares=Infinity, getSignificance=!IllegalArgumentException, getSlope=Infinity...#329#1124939171", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput144() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math.stat.regression.SimpleRegression", "org.apache.commons.math.stat.regression.SimpleRegression", "getSlopeConfidenceInterval", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.math.stat.regression.SimpleRegression", "getTotalSumSquares", ""}}, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput145() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.stat.regression.SimpleRegression", "org.apache.commons.math.stat.regression.SimpleRegression", "getMeanSquareError", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.math.stat.regression.SimpleRegression", "addData", "double,double", "12.199999999999998", "1.7976931348623158E307"}, {"org.apache.commons.math.stat.regression.SimpleRegression", "getRSquare", ""}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("NaN", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getIntercept=NaN, getInterceptStdErr=NaN, getMeanSquareError=NaN, getN=1, getR=NaN, getRSquare=NaN, getRegressionSumSquares=NaN, getSignificance=!IllegalArgumentException, getSlope=NaN, getSlopeConfi...#309#-304363828", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput146() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.stat.regression.SimpleRegression", "org.apache.commons.math.stat.regression.SimpleRegression", "addData", new String[]{"double", "double"}, new String[]{"3.0046890536075433E18", "Infinity"}, false, 6, new String[][]{{"org.apache.commons.math.stat.regression.SimpleRegression", "addData", "double[][]", "<sample:0>"}}, 2);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getIntercept=NaN, getInterceptStdErr=NaN, getMeanSquareError=NaN, getN=2, getR=NaN, getRSquare=NaN, getRegressionSumSquares=Infinity, getSignificance=!IllegalArgumentException, getSlope=Infinity, get...#324#-684576868", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput147() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.stat.regression.SimpleRegression", "org.apache.commons.math.stat.regression.SimpleRegression", "addData", new String[]{"double", "double"}, new String[]{"6.119999999999999", "-5.4E-323"}, false, 0, new String[][]{{"org.apache.commons.math.stat.regression.SimpleRegression", "addData", "double[][]", "<sample:1>"}}, 1);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getIntercept=Infinity, getInterceptStdErr=NaN, getMeanSquareError=NaN, getN=2, getR=NaN, getRSquare=NaN, getRegressionSumSquares=Infinity, getSignificance=!IllegalArgumentException, getSlope=-Infinit...#330#1755807958", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput148() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.stat.regression.SimpleRegression", "org.apache.commons.math.stat.regression.SimpleRegression", "getR", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.math.stat.regression.SimpleRegression", "addData", "double,double", "Infinity", "0.05"}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("NaN", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getIntercept=NaN, getInterceptStdErr=NaN, getMeanSquareError=NaN, getN=1, getR=NaN, getRSquare=NaN, getRegressionSumSquares=NaN, getSignificance=!IllegalArgumentException, getSlope=NaN, getSlopeConfi...#309#-304363828", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput149() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.stat.regression.SimpleRegression", "org.apache.commons.math.stat.regression.SimpleRegression", "getInterceptStdErr", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.math.stat.regression.SimpleRegression", "addData", "double,double", "5.1", "-1.7976931348623155E308"}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("NaN", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getIntercept=NaN, getInterceptStdErr=NaN, getMeanSquareError=NaN, getN=1, getR=NaN, getRSquare=NaN, getRegressionSumSquares=NaN, getSignificance=!IllegalArgumentException, getSlope=NaN, getSlopeConfi...#309#-304363828", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput150() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.stat.regression.SimpleRegression", "org.apache.commons.math.stat.regression.SimpleRegression", "getN", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.math.stat.regression.SimpleRegression", "addData", "double[][]", "<sample:3>"}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Long", actual.getClass().getName());
  assertEquals("1", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getIntercept=NaN, getInterceptStdErr=NaN, getMeanSquareError=NaN, getN=1, getR=NaN, getRSquare=NaN, getRegressionSumSquares=NaN, getSignificance=!IllegalArgumentException, getSlope=NaN, getSlopeConfi...#309#-304363828", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput151() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.stat.regression.SimpleRegression", "org.apache.commons.math.stat.regression.SimpleRegression", "predict", new String[]{"double"}, new String[]{"Infinity"}, false, 0, new String[][]{{"org.apache.commons.math.stat.regression.SimpleRegression", "getSumSquaredErrors", ""}, {"org.apache.commons.math.stat.regression.SimpleRegression", "addData", "double,double", "35.22", "NaN"}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("NaN", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getIntercept=NaN, getInterceptStdErr=NaN, getMeanSquareError=NaN, getN=1, getR=NaN, getRSquare=NaN, getRegressionSumSquares=NaN, getSignificance=!IllegalArgumentException, getSlope=NaN, getSlopeConfi...#309#-304363828", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput152() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.stat.regression.SimpleRegression", "org.apache.commons.math.stat.regression.SimpleRegression", "addData", new String[]{"double", "double"}, new String[]{"Infinity", "-Infinity"}, false, 5, new String[][]{{"org.apache.commons.math.stat.regression.SimpleRegression", "addData", "double,double", "-Infinity", "NaN"}}, 1);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getIntercept=NaN, getInterceptStdErr=NaN, getMeanSquareError=NaN, getN=2, getR=NaN, getRSquare=NaN, getRegressionSumSquares=NaN, getSignificance=!IllegalArgumentException, getSlope=NaN, getSlopeConfi...#309#343863629", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput153() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.stat.regression.SimpleRegression", "org.apache.commons.math.stat.regression.SimpleRegression", "getRSquare", new String[]{}, new String[]{}, false, 2, new String[][]{{"org.apache.commons.math.stat.regression.SimpleRegression", "addData", "double,double", "-0.406", "-2.9999999999999996"}, {"org.apache.commons.math.stat.regression.SimpleRegression", "addData", "double[][]", "<sample:7>"}});
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("NaN", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getIntercept=NaN, getInterceptStdErr=NaN, getMeanSquareError=NaN, getN=2, getR=NaN, getRSquare=NaN, getRegressionSumSquares=NaN, getSignificance=!IllegalArgumentException, getSlope=NaN, getSlopeConfi...#314#140651466", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput154() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.stat.regression.SimpleRegression", "org.apache.commons.math.stat.regression.SimpleRegression", "getIntercept", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.math.stat.regression.SimpleRegression", "getSlopeConfidenceInterval", "double", "4.9E-323"}, {"org.apache.commons.math.stat.regression.SimpleRegression", "addData", "double[][]", "<sample:1>"}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("NaN", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getIntercept=NaN, getInterceptStdErr=NaN, getMeanSquareError=NaN, getN=1, getR=NaN, getRSquare=NaN, getRegressionSumSquares=NaN, getSignificance=!IllegalArgumentException, getSlope=NaN, getSlopeConfi...#309#-304363828", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput155() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.stat.regression.SimpleRegression", "org.apache.commons.math.stat.regression.SimpleRegression", "getRSquare", new String[]{}, new String[]{}, false, 3, new String[][]{{"org.apache.commons.math.stat.regression.SimpleRegression", "addData", "double,double", "-0.0", "5.0"}, {"org.apache.commons.math.stat.regression.SimpleRegression", "getRegressionSumSquares", ""}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("NaN", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getIntercept=NaN, getInterceptStdErr=NaN, getMeanSquareError=NaN, getN=1, getR=NaN, getRSquare=NaN, getRegressionSumSquares=NaN, getSignificance=!IllegalArgumentException, getSlope=NaN, getSlopeConfi...#309#-304363828", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput156() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.stat.regression.SimpleRegression", "org.apache.commons.math.stat.regression.SimpleRegression", "getInterceptStdErr", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.math.stat.regression.SimpleRegression", "addData", "double,double", "0.15", "-2.9569999999999994"}, {"org.apache.commons.math.stat.regression.SimpleRegression", "addData", "double,double", "2.44", "-0.203"}});
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("NaN", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getIntercept=-3.1373930131004357, getInterceptStdErr=NaN, getMeanSquareError=NaN, getN=2, getR=1.0, getRSquare=1.0, getRegressionSumSquares=3.792257999999998, getSignificance=!IllegalArgumentExceptio...#369#2082684485", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput157() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.stat.regression.SimpleRegression", "org.apache.commons.math.stat.regression.SimpleRegression", "addData", new String[]{"double[][]"}, new String[]{"<sample:3>"}, false, 0, new String[][]{{"org.apache.commons.math.stat.regression.SimpleRegression", "addData", "double[][]", "<sample:3>"}, {"org.apache.commons.math.stat.regression.SimpleRegression", "getSlopeStdErr", ""}}, 2);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getIntercept=NaN, getInterceptStdErr=NaN, getMeanSquareError=NaN, getN=2, getR=NaN, getRSquare=NaN, getRegressionSumSquares=NaN, getSignificance=!IllegalArgumentException, getSlope=NaN, getSlopeConfi...#309#342919958", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput158() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.stat.regression.SimpleRegression", "org.apache.commons.math.stat.regression.SimpleRegression", "getIntercept", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.math.stat.regression.SimpleRegression", "addData", "double,double", "Infinity", "-3.0"}, {"org.apache.commons.math.stat.regression.SimpleRegression", "addData", "double,double", "-8.988465674311579E307", "-7.600000000000001"}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("NaN", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getIntercept=NaN, getInterceptStdErr=NaN, getMeanSquareError=NaN, getN=2, getR=NaN, getRSquare=NaN, getRegressionSumSquares=NaN, getSignificance=!IllegalArgumentException, getSlope=NaN, getSlopeConfi...#324#-1023601971", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput159() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.stat.regression.SimpleRegression", "org.apache.commons.math.stat.regression.SimpleRegression", "getIntercept", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.math.stat.regression.SimpleRegression", "addData", "double[][]", "<sample:3>"}, {"org.apache.commons.math.stat.regression.SimpleRegression", "addData", "double[][]", "<sample:3>"}});
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("NaN", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getIntercept=NaN, getInterceptStdErr=NaN, getMeanSquareError=NaN, getN=2, getR=NaN, getRSquare=NaN, getRegressionSumSquares=NaN, getSignificance=!IllegalArgumentException, getSlope=NaN, getSlopeConfi...#309#342919958", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput160() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.stat.regression.SimpleRegression", "org.apache.commons.math.stat.regression.SimpleRegression", "getTotalSumSquares", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.math.stat.regression.SimpleRegression", "addData", "double,double", "2.44", "-0.1"}, {"org.apache.commons.math.stat.regression.SimpleRegression", "addData", "double[][]", "<sample:1>"}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("Infinity", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getIntercept=Infinity, getInterceptStdErr=NaN, getMeanSquareError=NaN, getN=2, getR=NaN, getRSquare=NaN, getRegressionSumSquares=Infinity, getSignificance=!IllegalArgumentException, getSlope=-Infinit...#330#1755807958", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput161() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.stat.regression.SimpleRegression", "org.apache.commons.math.stat.regression.SimpleRegression", "getMeanSquareError", new String[]{}, new String[]{}, false, 2, new String[][]{{"org.apache.commons.math.stat.regression.SimpleRegression", "addData", "double[][]", "<sample:1>"}, {"org.apache.commons.math.stat.regression.SimpleRegression", "addData", "double,double", "0.61", "5.9"}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("NaN", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getIntercept=NaN, getInterceptStdErr=NaN, getMeanSquareError=NaN, getN=2, getR=NaN, getRSquare=NaN, getRegressionSumSquares=Infinity, getSignificance=!IllegalArgumentException, getSlope=Infinity, get...#324#-684576868", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput162() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.stat.regression.SimpleRegression", "org.apache.commons.math.stat.regression.SimpleRegression", "getSumSquaredErrors", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.math.stat.regression.SimpleRegression", "addData", "double,double", "-0.08", "6.099999999999999"}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("NaN", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getIntercept=NaN, getInterceptStdErr=NaN, getMeanSquareError=NaN, getN=1, getR=NaN, getRSquare=NaN, getRegressionSumSquares=NaN, getSignificance=!IllegalArgumentException, getSlope=NaN, getSlopeConfi...#309#-304363828", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput163() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.stat.regression.SimpleRegression", "org.apache.commons.math.stat.regression.SimpleRegression", "addData", new String[]{"double[][]"}, new String[]{"<sample:3>"}, false, 0, new String[][]{{"org.apache.commons.math.stat.regression.SimpleRegression", "addData", "double,double", "11.759999999999996", "4.9E-324"}, {"org.apache.commons.math.stat.regression.SimpleRegression", "getMeanSquareError", ""}}, 3);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getIntercept=NaN, getInterceptStdErr=NaN, getMeanSquareError=NaN, getN=2, getR=NaN, getRSquare=NaN, getRegressionSumSquares=NaN, getSignificance=!IllegalArgumentException, getSlope=NaN, getSlopeConfi...#309#342920113", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput164() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.stat.regression.SimpleRegression", "org.apache.commons.math.stat.regression.SimpleRegression", "getMeanSquareError", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.math.stat.regression.SimpleRegression", "addData", "double[][]", "<empty>"}, {"org.apache.commons.math.stat.regression.SimpleRegression", "addData", "double,double", "2.0", "0.6500000000000001"}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("NaN", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getIntercept=NaN, getInterceptStdErr=NaN, getMeanSquareError=NaN, getN=1, getR=NaN, getRSquare=NaN, getRegressionSumSquares=NaN, getSignificance=!IllegalArgumentException, getSlope=NaN, getSlopeConfi...#309#-304363828", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput165() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.stat.regression.SimpleRegression", "org.apache.commons.math.stat.regression.SimpleRegression", "addData", new String[]{"double[][]"}, new String[]{"<sample:0>"}, false, 0, new String[][]{{"org.apache.commons.math.stat.regression.SimpleRegression", "addData", "double,double", "12.199999999999998", "6.4E-323"}, {"org.apache.commons.math.stat.regression.SimpleRegression", "getMeanSquareError", ""}}, 3);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getIntercept=1.0, getInterceptStdErr=NaN, getMeanSquareError=NaN, getN=2, getR=-1.0, getRSquare=1.0, getRegressionSumSquares=0.4999999999999999, getSignificance=!IllegalArgumentException, getSlope=-0...#341#1982349913", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput166() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.stat.regression.SimpleRegression", "org.apache.commons.math.stat.regression.SimpleRegression", "getIntercept", new String[]{}, new String[]{}, false, 4, new String[][]{{"org.apache.commons.math.stat.regression.SimpleRegression", "addData", "double[][]", "<sample:1>"}, {"org.apache.commons.math.stat.regression.SimpleRegression", "addData", "double,double", "5.4E-323", "-8.988465674311578E307"}});
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("NaN", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getIntercept=NaN, getInterceptStdErr=NaN, getMeanSquareError=NaN, getN=2, getR=NaN, getRSquare=NaN, getRegressionSumSquares=Infinity, getSignificance=!IllegalArgumentException, getSlope=Infinity, get...#324#-684576868", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput167() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.stat.regression.SimpleRegression", "org.apache.commons.math.stat.regression.SimpleRegression", "getIntercept", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.math.stat.regression.SimpleRegression", "addData", "double[][]", "<sample:4>"}, {"org.apache.commons.math.stat.regression.SimpleRegression", "addData", "double,double", "3.19", "NaN"}});
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("NaN", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getIntercept=NaN, getInterceptStdErr=NaN, getMeanSquareError=NaN, getN=2, getR=NaN, getRSquare=NaN, getRegressionSumSquares=NaN, getSignificance=!IllegalArgumentException, getSlope=NaN, getSlopeConfi...#309#343863629", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput168() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.stat.regression.SimpleRegression", "org.apache.commons.math.stat.regression.SimpleRegression", "getInterceptStdErr", new String[]{}, new String[]{}, false, 5, new String[][]{{"org.apache.commons.math.stat.regression.SimpleRegression", "addData", "double[][]", "<sample:3>"}, {"org.apache.commons.math.stat.regression.SimpleRegression", "getN", ""}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("NaN", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getIntercept=NaN, getInterceptStdErr=NaN, getMeanSquareError=NaN, getN=1, getR=NaN, getRSquare=NaN, getRegressionSumSquares=NaN, getSignificance=!IllegalArgumentException, getSlope=NaN, getSlopeConfi...#309#-304363828", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput169() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.stat.regression.SimpleRegression", "org.apache.commons.math.stat.regression.SimpleRegression", "getSlope", new String[]{}, new String[]{}, false, 5, new String[][]{{"org.apache.commons.math.stat.regression.SimpleRegression", "addData", "double[][]", "<sample:1>"}, {"org.apache.commons.math.stat.regression.SimpleRegression", "addData", "double,double", "1.7976931348623157E308", "4.4E-323"}});
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("NaN", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getIntercept=NaN, getInterceptStdErr=NaN, getMeanSquareError=NaN, getN=2, getR=NaN, getRSquare=NaN, getRegressionSumSquares=NaN, getSignificance=!IllegalArgumentException, getSlope=NaN, getSlopeConfi...#314#140651466", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput170() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.stat.regression.SimpleRegression", "org.apache.commons.math.stat.regression.SimpleRegression", "getInterceptStdErr", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.math.stat.regression.SimpleRegression", "addData", "double[][]", "<sample:4>"}, {"org.apache.commons.math.stat.regression.SimpleRegression", "addData", "double,double", "-1.50234452680377165E18", "4.880000000000001"}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("NaN", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getIntercept=0.0, getInterceptStdErr=NaN, getMeanSquareError=NaN, getN=2, getR=-0.9999999999999999, getRSquare=0.9999999999999999, getRegressionSumSquares=11.907200000000003, getSignificance=!Illegal...#409#763598127", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput171() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.stat.regression.SimpleRegression", "org.apache.commons.math.stat.regression.SimpleRegression", "getTotalSumSquares", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.math.stat.regression.SimpleRegression", "addData", "double,double", "-16.95", "1.7976931348623158E307"}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("NaN", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getIntercept=NaN, getInterceptStdErr=NaN, getMeanSquareError=NaN, getN=1, getR=NaN, getRSquare=NaN, getRegressionSumSquares=NaN, getSignificance=!IllegalArgumentException, getSlope=NaN, getSlopeConfi...#309#-304363828", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput172() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.stat.regression.SimpleRegression", "org.apache.commons.math.stat.regression.SimpleRegression", "getIntercept", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.math.stat.regression.SimpleRegression", "addData", "double,double", "2.4400000000000004", "-3.0046890536075438E18"}, {"org.apache.commons.math.stat.regression.SimpleRegression", "addData", "double,double", "Infinity", "-1.7976931348623157E308"}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("NaN", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getIntercept=NaN, getInterceptStdErr=NaN, getMeanSquareError=NaN, getN=2, getR=NaN, getRSquare=NaN, getRegressionSumSquares=NaN, getSignificance=!IllegalArgumentException, getSlope=NaN, getSlopeConfi...#314#140651466", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput173() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.stat.regression.SimpleRegression", "org.apache.commons.math.stat.regression.SimpleRegression", "getInterceptStdErr", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.math.stat.regression.SimpleRegression", "addData", "double[][]", "<sample:0>"}, {"org.apache.commons.math.stat.regression.SimpleRegression", "addData", "double[][]", "<sample:4>"}});
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("NaN", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getIntercept=1.0, getInterceptStdErr=NaN, getMeanSquareError=NaN, getN=2, getR=1.0, getRSquare=1.0, getRegressionSumSquares=0.5, getSignificance=!IllegalArgumentException, getSlope=1.0, getSlopeConfi...#309#1518297662", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput174() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.stat.regression.SimpleRegression", "org.apache.commons.math.stat.regression.SimpleRegression", "predict", new String[]{"double"}, new String[]{"1.9999999999999998"}, false, 2, new String[][]{{"org.apache.commons.math.stat.regression.SimpleRegression", "addData", "double[][]", "<sample:1>"}, {"org.apache.commons.math.stat.regression.SimpleRegression", "addData", "double,double", "NaN", "1.7976931348623157E308"}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("NaN", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getIntercept=NaN, getInterceptStdErr=NaN, getMeanSquareError=NaN, getN=2, getR=NaN, getRSquare=NaN, getRegressionSumSquares=NaN, getSignificance=!IllegalArgumentException, getSlope=NaN, getSlopeConfi...#314#140651466", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput175() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.stat.regression.SimpleRegression", "org.apache.commons.math.stat.regression.SimpleRegression", "getTotalSumSquares", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.math.stat.regression.SimpleRegression", "addData", "double[][]", "<sample:6>"}, {"org.apache.commons.math.stat.regression.SimpleRegression", "addData", "double,double", "-1.7976931348623157E308", "-1.4"}});
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("Infinity", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getIntercept=NaN, getInterceptStdErr=NaN, getMeanSquareError=NaN, getN=2, getR=NaN, getRSquare=NaN, getRegressionSumSquares=NaN, getSignificance=!IllegalArgumentException, getSlope=NaN, getSlopeConfi...#314#140651466", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput176() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.stat.regression.SimpleRegression", "org.apache.commons.math.stat.regression.SimpleRegression", "addData", new String[]{"double[][]"}, new String[]{"<sample:0>"}, false, 6, new String[][]{{"org.apache.commons.math.stat.regression.SimpleRegression", "addData", "double[][]", "<sample:1>"}}, 3);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getIntercept=NaN, getInterceptStdErr=NaN, getMeanSquareError=NaN, getN=2, getR=NaN, getRSquare=NaN, getRegressionSumSquares=Infinity, getSignificance=!IllegalArgumentException, getSlope=Infinity, get...#324#-684576868", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput177() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.stat.regression.SimpleRegression", "org.apache.commons.math.stat.regression.SimpleRegression", "getTotalSumSquares", new String[]{}, new String[]{}, false, 1, new String[][]{{"org.apache.commons.math.stat.regression.SimpleRegression", "addData", "double[][]", "<sample:4>"}, {"org.apache.commons.math.stat.regression.SimpleRegression", "addData", "double,double", "-0.08", "10.200000000000001"}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("52.02000000000001", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getIntercept=11.086956521739133, getInterceptStdErr=NaN, getMeanSquareError=NaN, getN=2, getR=1.0, getRSquare=1.0, getRegressionSumSquares=52.020000000000024, getSignificance=!IllegalArgumentExceptio...#368#-1379652297", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput178() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.stat.regression.SimpleRegression", "org.apache.commons.math.stat.regression.SimpleRegression", "getIntercept", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.math.stat.regression.SimpleRegression", "addData", "double[][]", "<sample:3>"}, {"org.apache.commons.math.stat.regression.SimpleRegression", "addData", "double,double", "0.0", "3"}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("NaN", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getIntercept=NaN, getInterceptStdErr=NaN, getMeanSquareError=NaN, getN=2, getR=NaN, getRSquare=NaN, getRegressionSumSquares=NaN, getSignificance=!IllegalArgumentException, getSlope=NaN, getSlopeConfi...#309#343158286", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput179() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.stat.regression.SimpleRegression", "org.apache.commons.math.stat.regression.SimpleRegression", "predict", new String[]{"double"}, new String[]{"0.006"}, false, 0, new String[][]{{"org.apache.commons.math.stat.regression.SimpleRegression", "addData", "double[][]", "<sample:0>"}, {"org.apache.commons.math.stat.regression.SimpleRegression", "addData", "double[][]", "<sample:0>"}});
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("NaN", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getIntercept=NaN, getInterceptStdErr=NaN, getMeanSquareError=NaN, getN=2, getR=NaN, getRSquare=NaN, getRegressionSumSquares=NaN, getSignificance=!IllegalArgumentException, getSlope=NaN, getSlopeConfi...#309#342919958", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput180() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.stat.regression.SimpleRegression", "org.apache.commons.math.stat.regression.SimpleRegression", "getRSquare", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.math.stat.regression.SimpleRegression", "addData", "double,double", "5.220000000000001", "-0.20299999999999999"}, {"org.apache.commons.math.stat.regression.SimpleRegression", "addData", "double,double", "Infinity", "-0.3"}});
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("NaN", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getIntercept=NaN, getInterceptStdErr=NaN, getMeanSquareError=NaN, getN=2, getR=NaN, getRSquare=NaN, getRegressionSumSquares=NaN, getSignificance=!IllegalArgumentException, getSlope=NaN, getSlopeConfi...#315#16726264", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput181() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.stat.regression.SimpleRegression", "org.apache.commons.math.stat.regression.SimpleRegression", "getRSquare", new String[]{}, new String[]{}, false, 6, new String[][]{{"org.apache.commons.math.stat.regression.SimpleRegression", "addData", "double,double", "2", "12.199999999999998"}, {"org.apache.commons.math.stat.regression.SimpleRegression", "addData", "double[][]", "<sample:0>"}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("1.0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getIntercept=1.0, getInterceptStdErr=NaN, getMeanSquareError=NaN, getN=2, getR=1.0, getRSquare=1.0, getRegressionSumSquares=62.71999999999997, getSignificance=!IllegalArgumentException, getSlope=5.59...#351#2019708417", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput182() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.stat.regression.SimpleRegression", "org.apache.commons.math.stat.regression.SimpleRegression", "getIntercept", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.math.stat.regression.SimpleRegression", "addData", "double,double", "-36.800000000000004", "1.14E-322"}, {"org.apache.commons.math.stat.regression.SimpleRegression", "addData", "double,double", "-4.9E-323", "-4.6000000000000005"}});
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("-4.6000000000000005", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getIntercept=-4.6000000000000005, getInterceptStdErr=NaN, getMeanSquareError=NaN, getN=2, getR=-1.0, getRSquare=1.0, getRegressionSumSquares=10.580000000000002, getSignificance=!IllegalArgumentExcept...#359#1470906016", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput183() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.stat.regression.SimpleRegression", "org.apache.commons.math.stat.regression.SimpleRegression", "getMeanSquareError", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.math.stat.regression.SimpleRegression", "addData", "double[][]", "<sample:0>"}, {"org.apache.commons.math.stat.regression.SimpleRegression", "addData", "double,double", "0.0", "NaN"}});
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("NaN", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getIntercept=NaN, getInterceptStdErr=NaN, getMeanSquareError=NaN, getN=2, getR=NaN, getRSquare=NaN, getRegressionSumSquares=NaN, getSignificance=!IllegalArgumentException, getSlope=NaN, getSlopeConfi...#309#343863629", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput184() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.stat.regression.SimpleRegression", "org.apache.commons.math.stat.regression.SimpleRegression", "getR", new String[]{}, new String[]{}, false, 4, new String[][]{{"org.apache.commons.math.stat.regression.SimpleRegression", "addData", "double[][]", "<sample:1>"}, {"org.apache.commons.math.stat.regression.SimpleRegression", "addData", "double[][]", "<sample:1>"}});
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("NaN", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getIntercept=NaN, getInterceptStdErr=NaN, getMeanSquareError=NaN, getN=2, getR=NaN, getRSquare=NaN, getRegressionSumSquares=NaN, getSignificance=!IllegalArgumentException, getSlope=NaN, getSlopeConfi...#309#343863629", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput185() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.stat.regression.SimpleRegression", "org.apache.commons.math.stat.regression.SimpleRegression", "getIntercept", new String[]{}, new String[]{}, false, 5, new String[][]{{"org.apache.commons.math.stat.regression.SimpleRegression", "addData", "double[][]", "<sample:4>"}, {"org.apache.commons.math.stat.regression.SimpleRegression", "addData", "double,double", "-1.22", "5.088000000000002"}});
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("-23.127272727272736", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getIntercept=-23.127272727272736, getInterceptStdErr=NaN, getMeanSquareError=NaN, getN=2, getR=-1.0, getRSquare=1.0, getRegressionSumSquares=12.943872000000011, getSignificance=!IllegalArgumentExcept...#370#-1934917335", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput186() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.stat.regression.SimpleRegression", "org.apache.commons.math.stat.regression.SimpleRegression", "predict", new String[]{"double"}, new String[]{"0.9999999999999999"}, false, 1, new String[][]{{"org.apache.commons.math.stat.regression.SimpleRegression", "addData", "double,double", "45.594", "1.14E-322"}, {"org.apache.commons.math.stat.regression.SimpleRegression", "addData", "double[][]", "<sample:1>"}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("NaN", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getIntercept=Infinity, getInterceptStdErr=NaN, getMeanSquareError=NaN, getN=2, getR=NaN, getRSquare=NaN, getRegressionSumSquares=Infinity, getSignificance=!IllegalArgumentException, getSlope=-Infinit...#330#1755807958", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput187() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.stat.regression.SimpleRegression", "org.apache.commons.math.stat.regression.SimpleRegression", "getRSquare", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.math.stat.regression.SimpleRegression", "addData", "double,double", "24.0", "0.1"}, {"org.apache.commons.math.stat.regression.SimpleRegression", "addData", "double,double", "-1.0", "0.06"}});
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("1.0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getIntercept=0.0616, getInterceptStdErr=NaN, getMeanSquareError=NaN, getN=2, getR=1.0, getRSquare=1.0, getRegressionSumSquares=8.000000000000003E-4, getSignificance=!IllegalArgumentException, getSlop...#364#-1068530236", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput188() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.stat.regression.SimpleRegression", "org.apache.commons.math.stat.regression.SimpleRegression", "getTotalSumSquares", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.math.stat.regression.SimpleRegression", "addData", "double[][]", "<sample:0>"}, {"org.apache.commons.math.stat.regression.SimpleRegression", "addData", "double,double", "-Infinity", "NaN"}});
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("NaN", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getIntercept=NaN, getInterceptStdErr=NaN, getMeanSquareError=NaN, getN=2, getR=NaN, getRSquare=NaN, getRegressionSumSquares=NaN, getSignificance=!IllegalArgumentException, getSlope=NaN, getSlopeConfi...#309#343863629", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput189() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.stat.regression.SimpleRegression", "org.apache.commons.math.stat.regression.SimpleRegression", "getMeanSquareError", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.math.stat.regression.SimpleRegression", "addData", "double[][]", "<sample:0>"}, {"org.apache.commons.math.stat.regression.SimpleRegression", "addData", "double,double", "13.399999999999999", "-0.09"}});
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("NaN", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getIntercept=1.0, getInterceptStdErr=NaN, getMeanSquareError=NaN, getN=2, getR=-1.0, getRSquare=1.0, getRegressionSumSquares=0.5940500000000001, getSignificance=!IllegalArgumentException, getSlope=-0...#357#-1685390362", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput190() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.stat.regression.SimpleRegression", "org.apache.commons.math.stat.regression.SimpleRegression", "predict", new String[]{"double"}, new String[]{"2.5E-323"}, false, 6, new String[][]{{"org.apache.commons.math.stat.regression.SimpleRegression", "addData", "double[][]", "<sample:1>"}, {"org.apache.commons.math.stat.regression.SimpleRegression", "addData", "double,double", "1.0E-322", "2.000000000000001"}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("NaN", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getIntercept=NaN, getInterceptStdErr=NaN, getMeanSquareError=NaN, getN=2, getR=NaN, getRSquare=NaN, getRegressionSumSquares=Infinity, getSignificance=!IllegalArgumentException, getSlope=Infinity, get...#324#-684576868", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput191() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.stat.regression.SimpleRegression", "org.apache.commons.math.stat.regression.SimpleRegression", "getSlopeStdErr", new String[]{}, new String[]{}, false, 6, new String[][]{{"org.apache.commons.math.stat.regression.SimpleRegression", "addData", "double[][]", "<sample:1>"}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("NaN", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getIntercept=NaN, getInterceptStdErr=NaN, getMeanSquareError=NaN, getN=1, getR=NaN, getRSquare=NaN, getRegressionSumSquares=NaN, getSignificance=!IllegalArgumentException, getSlope=NaN, getSlopeConfi...#309#-304363828", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput192() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.stat.regression.SimpleRegression", "org.apache.commons.math.stat.regression.SimpleRegression", "getTotalSumSquares", new String[]{}, new String[]{}, false, 3, new String[][]{{"org.apache.commons.math.stat.regression.SimpleRegression", "addData", "double[][]", "<sample:4>"}, {"org.apache.commons.math.stat.regression.SimpleRegression", "addData", "double,double", "26.0", "-1.5"}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("1.125", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getIntercept=-0.05555555555555558, getInterceptStdErr=NaN, getMeanSquareError=NaN, getN=2, getR=-1.0, getRSquare=1.0, getRegressionSumSquares=1.125, getSignificance=!IllegalArgumentException, getSlop...#348#-1900086944", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput193() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.stat.regression.SimpleRegression", "org.apache.commons.math.stat.regression.SimpleRegression", "getSumSquaredErrors", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.math.stat.regression.SimpleRegression", "addData", "double,double", "12.199999999999998", "-0.0"}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("NaN", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getIntercept=NaN, getInterceptStdErr=NaN, getMeanSquareError=NaN, getN=1, getR=NaN, getRSquare=NaN, getRegressionSumSquares=NaN, getSignificance=!IllegalArgumentException, getSlope=NaN, getSlopeConfi...#309#-304363828", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput194() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.stat.regression.SimpleRegression", "org.apache.commons.math.stat.regression.SimpleRegression", "getInterceptStdErr", new String[]{}, new String[]{}, false, 7, new String[][]{{"org.apache.commons.math.stat.regression.SimpleRegression", "addData", "double[][]", "<sample:1>"}, {"org.apache.commons.math.stat.regression.SimpleRegression", "addData", "double,double", "-0.20299999999999999", "-6.0"}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("NaN", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getIntercept=NaN, getInterceptStdErr=NaN, getMeanSquareError=NaN, getN=2, getR=NaN, getRSquare=NaN, getRegressionSumSquares=Infinity, getSignificance=!IllegalArgumentException, getSlope=Infinity, get...#324#-684576868", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput195() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.stat.regression.SimpleRegression", "org.apache.commons.math.stat.regression.SimpleRegression", "getMeanSquareError", new String[]{}, new String[]{}, false, 4, new String[][]{{"org.apache.commons.math.stat.regression.SimpleRegression", "addData", "double,double", "-0.08", "-1.7976931348623155E308"}, {"org.apache.commons.math.stat.regression.SimpleRegression", "addData", "double,double", "-0.01", "2.9999999999999996"}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("NaN", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getIntercept=Infinity, getInterceptStdErr=NaN, getMeanSquareError=NaN, getN=2, getR=NaN, getRSquare=NaN, getRegressionSumSquares=Infinity, getSignificance=!IllegalArgumentException, getSlope=Infinity...#329#1124939171", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput196() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.stat.regression.SimpleRegression", "org.apache.commons.math.stat.regression.SimpleRegression", "getIntercept", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.math.stat.regression.SimpleRegression", "addData", "double,double", "-1.50234452680377165E18", "0.5000000000000001"}, {"org.apache.commons.math.stat.regression.SimpleRegression", "addData", "double,double", "NaN", "-1.5"}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("NaN", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getIntercept=NaN, getInterceptStdErr=NaN, getMeanSquareError=NaN, getN=2, getR=NaN, getRSquare=NaN, getRegressionSumSquares=NaN, getSignificance=!IllegalArgumentException, getSlope=NaN, getSlopeConfi...#309#342979540", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput197() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.stat.regression.SimpleRegression", "org.apache.commons.math.stat.regression.SimpleRegression", "getIntercept", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.math.stat.regression.SimpleRegression", "addData", "double[][]", "<sample:4>"}, {"org.apache.commons.math.stat.regression.SimpleRegression", "addData", "double,double", "1.0", "12.2"}});
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("6.1", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getIntercept=6.1, getInterceptStdErr=NaN, getMeanSquareError=NaN, getN=2, getR=1.0, getRSquare=1.0, getRegressionSumSquares=74.41999999999999, getSignificance=!IllegalArgumentException, getSlope=6.1,...#337#1654859228", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput198() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.stat.regression.SimpleRegression", "org.apache.commons.math.stat.regression.SimpleRegression", "getR", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.math.stat.regression.SimpleRegression", "addData", "double[][]", "<sample:1>"}, {"org.apache.commons.math.stat.regression.SimpleRegression", "addData", "double,double", "-0.5399999999999999", "Infinity"}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("NaN", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getIntercept=NaN, getInterceptStdErr=NaN, getMeanSquareError=NaN, getN=2, getR=NaN, getRSquare=NaN, getRegressionSumSquares=NaN, getSignificance=!IllegalArgumentException, getSlope=NaN, getSlopeConfi...#309#343863629", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput199() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.stat.regression.SimpleRegression", "org.apache.commons.math.stat.regression.SimpleRegression", "predict", new String[]{"double"}, new String[]{"4.880000000000001"}, false, 0, new String[][]{{"org.apache.commons.math.stat.regression.SimpleRegression", "addData", "double[][]", "<sample:4>"}, {"org.apache.commons.math.stat.regression.SimpleRegression", "addData", "double,double", "2.411", "5.4E-323"}});
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("9.4E-323", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getIntercept=2.0E-323, getInterceptStdErr=NaN, getMeanSquareError=NaN, getN=2, getR=NaN, getRSquare=NaN, getRegressionSumSquares=0.0, getSignificance=!IllegalArgumentException, getSlope=1.5E-323, get...#319#-492935846", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput200() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.stat.regression.SimpleRegression", "org.apache.commons.math.stat.regression.SimpleRegression", "getIntercept", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.math.stat.regression.SimpleRegression", "addData", "double,double", "-2.8970000000000002", "-0.08"}, {"org.apache.commons.math.stat.regression.SimpleRegression", "addData", "double,double", "5.43E-322", "-3004689053607543335"}});
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("-3.0046890536075433E18", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getIntercept=-3.0046890536075433E18, getInterceptStdErr=NaN, getMeanSquareError=NaN, getN=2, getR=-1.0, getRSquare=1.0, getRegressionSumSquares=4.5140781544344973E36, getSignificance=!IllegalArgument...#384#-167179663", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput201() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.stat.regression.SimpleRegression", "org.apache.commons.math.stat.regression.SimpleRegression", "predict", new String[]{"double"}, new String[]{"60.0"}, false, 0, new String[][]{{"org.apache.commons.math.stat.regression.SimpleRegression", "addData", "double[][]", "<sample:4>"}, {"org.apache.commons.math.stat.regression.SimpleRegression", "addData", "double,double", "17.0", "-3.0000000000000004"}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("-10.166666666666668", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getIntercept=-0.16666666666666674, getInterceptStdErr=NaN, getMeanSquareError=NaN, getN=2, getR=-1.0, getRSquare=1.0, getRegressionSumSquares=4.500000000000001, getSignificance=!IllegalArgumentExcept...#372#-954227458", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput202() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.stat.regression.SimpleRegression", "org.apache.commons.math.stat.regression.SimpleRegression", "getN", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.math.stat.regression.SimpleRegression", "addData", "double[][]", "<sample:4>"}, {"org.apache.commons.math.stat.regression.SimpleRegression", "addData", "double,double", "Infinity", "4.9E-324"}});
  assertNotNull(actual);
  assertEquals("java.lang.Long", actual.getClass().getName());
  assertEquals("2", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getIntercept=NaN, getInterceptStdErr=NaN, getMeanSquareError=NaN, getN=2, getR=NaN, getRSquare=NaN, getRegressionSumSquares=NaN, getSignificance=!IllegalArgumentException, getSlope=NaN, getSlopeConfi...#309#342919958", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput203() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.stat.regression.SimpleRegression", "org.apache.commons.math.stat.regression.SimpleRegression", "getInterceptStdErr", new String[]{}, new String[]{}, false, 3, new String[][]{{"org.apache.commons.math.stat.regression.SimpleRegression", "addData", "double[][]", "<sample:0>"}, {"org.apache.commons.math.stat.regression.SimpleRegression", "addData", "double,double", "3.0046890536075433E18", "0.04599999999999999"}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("NaN", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getIntercept=1.0, getInterceptStdErr=NaN, getMeanSquareError=NaN, getN=2, getR=-1.0, getRSquare=1.0, getRegressionSumSquares=0.45505799999999996, getSignificance=!IllegalArgumentException, getSlope=-...#362#-736256951", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput204() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.stat.regression.SimpleRegression", "org.apache.commons.math.stat.regression.SimpleRegression", "getIntercept", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.math.stat.regression.SimpleRegression", "addData", "double[][]", "<sample:6>"}, {"org.apache.commons.math.stat.regression.SimpleRegression", "addData", "double,double", "60.0", "0.049999999999999996"}});
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("Infinity", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getIntercept=Infinity, getInterceptStdErr=NaN, getMeanSquareError=NaN, getN=2, getR=NaN, getRSquare=NaN, getRegressionSumSquares=Infinity, getSignificance=!IllegalArgumentException, getSlope=-Infinit...#330#1755807958", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput205() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.stat.regression.SimpleRegression", "org.apache.commons.math.stat.regression.SimpleRegression", "getN", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.math.stat.regression.SimpleRegression", "addData", "double,double", "1.0", "2.0"}, {"org.apache.commons.math.stat.regression.SimpleRegression", "addData", "double,double", "0.397", "-1.22"}});
  assertNotNull(actual);
  assertEquals("java.lang.Long", actual.getClass().getName());
  assertEquals("2", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getIntercept=-3.339966832504146, getInterceptStdErr=NaN, getMeanSquareError=NaN, getN=2, getR=1.0, getRSquare=1.0, getRegressionSumSquares=5.1842, getSignificance=!IllegalArgumentException, getSlope=...#355#-210870619", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput206() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.stat.regression.SimpleRegression", "org.apache.commons.math.stat.regression.SimpleRegression", "getIntercept", new String[]{}, new String[]{}, false, 5, new String[][]{{"org.apache.commons.math.stat.regression.SimpleRegression", "addData", "double,double", "2.0", "48.79999999999999"}, {"org.apache.commons.math.stat.regression.SimpleRegression", "addData", "double,double", "-0.20299999999999999", "2.34"}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("6.6211529732183365", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getIntercept=6.6211529732183365, getInterceptStdErr=NaN, getMeanSquareError=NaN, getN=2, getR=1.0, getRSquare=1.0, getRegressionSumSquares=1079.2657999999997, getSignificance=!IllegalArgumentExceptio...#369#-2072516457", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput207() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.stat.regression.SimpleRegression", "org.apache.commons.math.stat.regression.SimpleRegression", "getSlopeStdErr", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.math.stat.regression.SimpleRegression", "addData", "double[][]", "<sample:0>"}, {"org.apache.commons.math.stat.regression.SimpleRegression", "addData", "double,double", "-5.4E-323", "NaN"}});
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("NaN", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getIntercept=NaN, getInterceptStdErr=NaN, getMeanSquareError=NaN, getN=2, getR=NaN, getRSquare=NaN, getRegressionSumSquares=NaN, getSignificance=!IllegalArgumentException, getSlope=NaN, getSlopeConfi...#309#343863629", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput208() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.stat.regression.SimpleRegression", "org.apache.commons.math.stat.regression.SimpleRegression", "getRSquare", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.math.stat.regression.SimpleRegression", "addData", "double[][]", "<sample:4>"}, {"org.apache.commons.math.stat.regression.SimpleRegression", "addData", "double[][]", "<sample:0>"}});
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("1.0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getIntercept=1.0, getInterceptStdErr=NaN, getMeanSquareError=NaN, getN=2, getR=1.0, getRSquare=1.0, getRegressionSumSquares=0.5, getSignificance=!IllegalArgumentException, getSlope=1.0, getSlopeConfi...#309#1518297662", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput209() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.stat.regression.SimpleRegression", "org.apache.commons.math.stat.regression.SimpleRegression", "getR", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.math.stat.regression.SimpleRegression", "addData", "double,double", "NaN", "-12.199999999999998"}, {"org.apache.commons.math.stat.regression.SimpleRegression", "addData", "double,double", "4.879999999999999", "12.199999999999998"}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("NaN", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getIntercept=NaN, getInterceptStdErr=NaN, getMeanSquareError=NaN, getN=2, getR=NaN, getRSquare=NaN, getRegressionSumSquares=NaN, getSignificance=!IllegalArgumentException, getSlope=NaN, getSlopeConfi...#323#1369170478", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput210() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.stat.regression.SimpleRegression", "org.apache.commons.math.stat.regression.SimpleRegression", "getN", new String[]{}, new String[]{}, false, 4, new String[][]{{"org.apache.commons.math.stat.regression.SimpleRegression", "addData", "double[][]", "<sample:4>"}, {"org.apache.commons.math.stat.regression.SimpleRegression", "addData", "double[][]", "<sample:0>"}});
  assertNotNull(actual);
  assertEquals("java.lang.Long", actual.getClass().getName());
  assertEquals("2", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getIntercept=1.0, getInterceptStdErr=NaN, getMeanSquareError=NaN, getN=2, getR=1.0, getRSquare=1.0, getRegressionSumSquares=0.5, getSignificance=!IllegalArgumentException, getSlope=1.0, getSlopeConfi...#309#1518297662", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput211() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.stat.regression.SimpleRegression", "org.apache.commons.math.stat.regression.SimpleRegression", "getN", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.math.stat.regression.SimpleRegression", "addData", "double,double", "4.852", "-1.7976931348623157E308"}, {"org.apache.commons.math.stat.regression.SimpleRegression", "addData", "double,double", "-1.22", "-10.0"}});
  assertNotNull(actual);
  assertEquals("java.lang.Long", actual.getClass().getName());
  assertEquals("2", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getIntercept=Infinity, getInterceptStdErr=NaN, getMeanSquareError=NaN, getN=2, getR=NaN, getRSquare=NaN, getRegressionSumSquares=Infinity, getSignificance=!IllegalArgumentException, getSlope=-Infinit...#330#1755807958", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput212() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.stat.regression.SimpleRegression", "org.apache.commons.math.stat.regression.SimpleRegression", "getSlope", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.math.stat.regression.SimpleRegression", "addData", "double[][]", "<sample:0>"}, {"org.apache.commons.math.stat.regression.SimpleRegression", "addData", "double[][]", "<sample:4>"}});
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("1.0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getIntercept=1.0, getInterceptStdErr=NaN, getMeanSquareError=NaN, getN=2, getR=1.0, getRSquare=1.0, getRegressionSumSquares=0.5, getSignificance=!IllegalArgumentException, getSlope=1.0, getSlopeConfi...#309#1518297662", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput213() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.stat.regression.SimpleRegression", "org.apache.commons.math.stat.regression.SimpleRegression", "getMeanSquareError", new String[]{}, new String[]{}, false, 3, new String[][]{{"org.apache.commons.math.stat.regression.SimpleRegression", "addData", "double,double", "0.05", "9.76"}, {"org.apache.commons.math.stat.regression.SimpleRegression", "addData", "double,double", "Infinity", "-3004689053607543335"}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("NaN", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getIntercept=NaN, getInterceptStdErr=NaN, getMeanSquareError=NaN, getN=2, getR=NaN, getRSquare=NaN, getRegressionSumSquares=NaN, getSignificance=!IllegalArgumentException, getSlope=NaN, getSlopeConfi...#327#991188473", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput214() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.stat.regression.SimpleRegression", "org.apache.commons.math.stat.regression.SimpleRegression", "getRegressionSumSquares", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.math.stat.regression.SimpleRegression", "addData", "double,double", "Infinity", "0.096"}, {"org.apache.commons.math.stat.regression.SimpleRegression", "addData", "double[][]", "<sample:7>"}});
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("NaN", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getIntercept=NaN, getInterceptStdErr=NaN, getMeanSquareError=NaN, getN=2, getR=NaN, getRSquare=NaN, getRegressionSumSquares=NaN, getSignificance=!IllegalArgumentException, getSlope=NaN, getSlopeConfi...#314#140651466", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput215() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.stat.regression.SimpleRegression", "org.apache.commons.math.stat.regression.SimpleRegression", "getSlope", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.math.stat.regression.SimpleRegression", "addData", "double,double", "-0.025", "1.1E-322"}, {"org.apache.commons.math.stat.regression.SimpleRegression", "addData", "double,double", "3", "-3004689053607543335"}});
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("-9.9328563755621274E17", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getIntercept=-2.4832140938905088E16, getInterceptStdErr=NaN, getMeanSquareError=NaN, getN=2, getR=-1.0, getRSquare=1.0, getRegressionSumSquares=4.514078154434498E36, getSignificance=!IllegalArgumentE...#383#130089176", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput216() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.stat.regression.SimpleRegression", "org.apache.commons.math.stat.regression.SimpleRegression", "getRSquare", new String[]{}, new String[]{}, false, 4, new String[][]{{"org.apache.commons.math.stat.regression.SimpleRegression", "addData", "double[][]", "<sample:4>"}, {"org.apache.commons.math.stat.regression.SimpleRegression", "addData", "double,double", "28.05", "0.122"}});
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("0.9999999999999999", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getIntercept=0.004199655765920823, getInterceptStdErr=NaN, getMeanSquareError=NaN, getN=2, getR=0.9999999999999999, getRSquare=0.9999999999999999, getRegressionSumSquares=0.007442, getSignificance=!I...#401#47945938", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput217() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.stat.regression.SimpleRegression", "org.apache.commons.math.stat.regression.SimpleRegression", "getN", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.math.stat.regression.SimpleRegression", "addData", "double[][]", "<sample:0>"}, {"org.apache.commons.math.stat.regression.SimpleRegression", "addData", "double[][]", "<sample:1>"}});
  assertNotNull(actual);
  assertEquals("java.lang.Long", actual.getClass().getName());
  assertEquals("2", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getIntercept=NaN, getInterceptStdErr=NaN, getMeanSquareError=NaN, getN=2, getR=NaN, getRSquare=NaN, getRegressionSumSquares=Infinity, getSignificance=!IllegalArgumentException, getSlope=Infinity, get...#324#-684576868", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput218() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.stat.regression.SimpleRegression", "org.apache.commons.math.stat.regression.SimpleRegression", "getIntercept", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.math.stat.regression.SimpleRegression", "addData", "double,double", "18.05", "4.88"}, {"org.apache.commons.math.stat.regression.SimpleRegression", "addData", "double,double", "10.4", "-6.0093781072150866E18"}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("-1.4178990174540171E19", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getIntercept=-1.4178990174540171E19, getInterceptStdErr=NaN, getMeanSquareError=NaN, getN=2, getR=1.0, getRSquare=1.0, getRegressionSumSquares=1.8056312617737992E37, getSignificance=!IllegalArgumentE...#381#525836760", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput219() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.stat.regression.SimpleRegression", "org.apache.commons.math.stat.regression.SimpleRegression", "getRegressionSumSquares", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.math.stat.regression.SimpleRegression", "addData", "double,double", "10.200000000000001", "-Infinity"}, {"org.apache.commons.math.stat.regression.SimpleRegression", "addData", "double,double", "0.122", "-1.7976931348623157E308"}});
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("Infinity", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getIntercept=NaN, getInterceptStdErr=NaN, getMeanSquareError=NaN, getN=2, getR=NaN, getRSquare=NaN, getRegressionSumSquares=Infinity, getSignificance=!IllegalArgumentException, getSlope=-Infinity, ge...#325#1495385597", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput220() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.stat.regression.SimpleRegression", "org.apache.commons.math.stat.regression.SimpleRegression", "getN", new String[]{}, new String[]{}, false, 7, new String[][]{{"org.apache.commons.math.stat.regression.SimpleRegression", "addData", "double[][]", "<sample:0>"}, {"org.apache.commons.math.stat.regression.SimpleRegression", "addData", "double[][]", "<sample:0>"}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Long", actual.getClass().getName());
  assertEquals("2", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getIntercept=NaN, getInterceptStdErr=NaN, getMeanSquareError=NaN, getN=2, getR=NaN, getRSquare=NaN, getRegressionSumSquares=NaN, getSignificance=!IllegalArgumentException, getSlope=NaN, getSlopeConfi...#309#342919958", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput221() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.stat.regression.SimpleRegression", "org.apache.commons.math.stat.regression.SimpleRegression", "getSlopeStdErr", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.math.stat.regression.SimpleRegression", "addData", "double[][]", "<sample:1>"}, {"org.apache.commons.math.stat.regression.SimpleRegression", "getMeanSquareError", ""}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("NaN", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getIntercept=NaN, getInterceptStdErr=NaN, getMeanSquareError=NaN, getN=1, getR=NaN, getRSquare=NaN, getRegressionSumSquares=NaN, getSignificance=!IllegalArgumentException, getSlope=NaN, getSlopeConfi...#309#-304363828", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput222() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.stat.regression.SimpleRegression", "org.apache.commons.math.stat.regression.SimpleRegression", "getInterceptStdErr", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.math.stat.regression.SimpleRegression", "addData", "double[][]", "<sample:0>"}, {"org.apache.commons.math.stat.regression.SimpleRegression", "addData", "double[][]", "<sample:4>"}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("NaN", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getIntercept=1.0, getInterceptStdErr=NaN, getMeanSquareError=NaN, getN=2, getR=1.0, getRSquare=1.0, getRegressionSumSquares=0.5, getSignificance=!IllegalArgumentException, getSlope=1.0, getSlopeConfi...#309#1518297662", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput223() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.stat.regression.SimpleRegression", "org.apache.commons.math.stat.regression.SimpleRegression", "predict", new String[]{"double"}, new String[]{"0.12199999999999998"}, false, 0, new String[][]{{"org.apache.commons.math.stat.regression.SimpleRegression", "addData", "double[][]", "<sample:3>"}, {"org.apache.commons.math.stat.regression.SimpleRegression", "addData", "double[][]", "<sample:0>"}});
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("NaN", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getIntercept=NaN, getInterceptStdErr=NaN, getMeanSquareError=NaN, getN=2, getR=NaN, getRSquare=NaN, getRegressionSumSquares=NaN, getSignificance=!IllegalArgumentException, getSlope=NaN, getSlopeConfi...#309#342979540", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput224() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.stat.regression.SimpleRegression", "org.apache.commons.math.stat.regression.SimpleRegression", "predict", new String[]{"double"}, new String[]{"8.988465674311578E307"}, false, 5, new String[][]{{"org.apache.commons.math.stat.regression.SimpleRegression", "addData", "double,double", "-0.20299999999999999", "-5.1000000000000005"}, {"org.apache.commons.math.stat.regression.SimpleRegression", "addData", "double[][]", "<sample:1>"}});
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("NaN", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getIntercept=NaN, getInterceptStdErr=NaN, getMeanSquareError=NaN, getN=2, getR=NaN, getRSquare=NaN, getRegressionSumSquares=Infinity, getSignificance=!IllegalArgumentException, getSlope=Infinity, get...#324#-684576868", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput225() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.stat.regression.SimpleRegression", "org.apache.commons.math.stat.regression.SimpleRegression", "getSlopeStdErr", new String[]{}, new String[]{}, false, 7, new String[][]{{"org.apache.commons.math.stat.regression.SimpleRegression", "addData", "double[][]", "<sample:3>"}, {"org.apache.commons.math.stat.regression.SimpleRegression", "getSignificance", ""}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("NaN", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getIntercept=NaN, getInterceptStdErr=NaN, getMeanSquareError=NaN, getN=1, getR=NaN, getRSquare=NaN, getRegressionSumSquares=NaN, getSignificance=!IllegalArgumentException, getSlope=NaN, getSlopeConfi...#309#-304363828", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput226() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.stat.regression.SimpleRegression", "org.apache.commons.math.stat.regression.SimpleRegression", "getSumSquaredErrors", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.math.stat.regression.SimpleRegression", "addData", "double[][]", "<sample:0>"}, {"org.apache.commons.math.stat.regression.SimpleRegression", "addData", "double[][]", "<sample:6>"}});
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("NaN", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getIntercept=NaN, getInterceptStdErr=NaN, getMeanSquareError=NaN, getN=2, getR=NaN, getRSquare=NaN, getRegressionSumSquares=Infinity, getSignificance=!IllegalArgumentException, getSlope=Infinity, get...#324#-684576868", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput227() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.stat.regression.SimpleRegression", "org.apache.commons.math.stat.regression.SimpleRegression", "getIntercept", new String[]{}, new String[]{}, false, 6, new String[][]{{"org.apache.commons.math.stat.regression.SimpleRegression", "addData", "double[][]", "<sample:0>"}, {"org.apache.commons.math.stat.regression.SimpleRegression", "addData", "double,double", "5.845000000000001", "2.0"}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("1.0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getIntercept=1.0, getInterceptStdErr=NaN, getMeanSquareError=NaN, getN=2, getR=1.0, getRSquare=1.0, getRegressionSumSquares=0.49999999999999994, getSignificance=!IllegalArgumentException, getSlope=0....#341#886902218", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput228() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.stat.regression.SimpleRegression", "org.apache.commons.math.stat.regression.SimpleRegression", "predict", new String[]{"double"}, new String[]{"-0.30000000000000004"}, false, 5, new String[][]{{"org.apache.commons.math.stat.regression.SimpleRegression", "addData", "double,double", "-0.09", "4.9E-323"}, {"org.apache.commons.math.stat.regression.SimpleRegression", "addData", "double[][]", "<sample:0>"}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("-2.333333333333334", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getIntercept=1.0, getInterceptStdErr=NaN, getMeanSquareError=NaN, getN=2, getR=1.0, getRSquare=1.0, getRegressionSumSquares=0.49999999999999994, getSignificance=!IllegalArgumentException, getSlope=11...#339#-366758977", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput229() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.stat.regression.SimpleRegression", "org.apache.commons.math.stat.regression.SimpleRegression", "getTotalSumSquares", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.math.stat.regression.SimpleRegression", "addData", "double[][]", "<sample:3>"}, {"org.apache.commons.math.stat.regression.SimpleRegression", "addData", "double[][]", "<sample:1>"}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("Infinity", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getIntercept=NaN, getInterceptStdErr=NaN, getMeanSquareError=NaN, getN=2, getR=NaN, getRSquare=NaN, getRegressionSumSquares=NaN, getSignificance=!IllegalArgumentException, getSlope=NaN, getSlopeConfi...#314#140651466", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput230() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.stat.regression.SimpleRegression", "org.apache.commons.math.stat.regression.SimpleRegression", "getIntercept", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.math.stat.regression.SimpleRegression", "addData", "double,double", "11.559999999999999", "8.988465674311579E307"}, {"org.apache.commons.math.stat.regression.SimpleRegression", "addData", "double[][]", "<sample:0>"}});
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("-Infinity", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getIntercept=-Infinity, getInterceptStdErr=NaN, getMeanSquareError=NaN, getN=2, getR=NaN, getRSquare=NaN, getRegressionSumSquares=Infinity, getSignificance=!IllegalArgumentException, getSlope=Infinit...#330#649880642", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput231() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.stat.regression.SimpleRegression", "org.apache.commons.math.stat.regression.SimpleRegression", "getMeanSquareError", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.math.stat.regression.SimpleRegression", "addData", "double,double", "-Infinity", "-3.0046890536075433E18"}, {"org.apache.commons.math.stat.regression.SimpleRegression", "addData", "double,double", "-27.0", "12.199999999999998"}});
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("NaN", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getIntercept=NaN, getInterceptStdErr=NaN, getMeanSquareError=NaN, getN=2, getR=NaN, getRSquare=NaN, getRegressionSumSquares=NaN, getSignificance=!IllegalArgumentException, getSlope=NaN, getSlopeConfi...#327#991188473", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput232() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.stat.regression.SimpleRegression", "org.apache.commons.math.stat.regression.SimpleRegression", "getR", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.math.stat.regression.SimpleRegression", "addData", "double,double", "4.78", "0.4"}, {"org.apache.commons.math.stat.regression.SimpleRegression", "addData", "double,double", "-19.0", "0.61"}});
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("-0.9999999999999999", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getIntercept=0.44221194280908327, getInterceptStdErr=NaN, getMeanSquareError=NaN, getN=2, getR=-0.9999999999999999, getRSquare=0.9999999999999999, getRegressionSumSquares=0.02204999999999999, getSign...#423#-195393890", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput233() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.stat.regression.SimpleRegression", "org.apache.commons.math.stat.regression.SimpleRegression", "getIntercept", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.math.stat.regression.SimpleRegression", "addData", "double[][]", "<sample:4>"}, {"org.apache.commons.math.stat.regression.SimpleRegression", "addData", "double,double", "-3.0", "5.1000000000000005"}});
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("-2.5500000000000003", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getIntercept=-2.5500000000000003, getInterceptStdErr=NaN, getMeanSquareError=NaN, getN=2, getR=-1.0, getRSquare=1.0, getRegressionSumSquares=13.005000000000003, getSignificance=!IllegalArgumentExcept...#372#1281365273", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput234() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.stat.regression.SimpleRegression", "org.apache.commons.math.stat.regression.SimpleRegression", "getIntercept", new String[]{}, new String[]{}, false, 4, new String[][]{{"org.apache.commons.math.stat.regression.SimpleRegression", "addData", "double,double", "0.19999999999999998", "0.1"}, {"org.apache.commons.math.stat.regression.SimpleRegression", "addData", "double[][]", "<sample:4>"}});
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("0.08333333333333334", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getIntercept=0.08333333333333334, getInterceptStdErr=NaN, getMeanSquareError=NaN, getN=2, getR=0.9999999999999999, getRSquare=0.9999999999999998, getRegressionSumSquares=0.004999999999999999, getSign...#423#-74459246", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput235() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.stat.regression.SimpleRegression", "org.apache.commons.math.stat.regression.SimpleRegression", "getRegressionSumSquares", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.math.stat.regression.SimpleRegression", "addData", "double,double", "1.007", "-0.7999999999999998"}, {"org.apache.commons.math.stat.regression.SimpleRegression", "addData", "double,double", "-13.0", "10.200000000000001"}});
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("60.50000000000001", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getIntercept=-0.009181123723851492, getInterceptStdErr=NaN, getMeanSquareError=NaN, getN=2, getR=-1.0, getRSquare=1.0, getRegressionSumSquares=60.50000000000001, getSignificance=!IllegalArgumentExcep...#359#-1276059808", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput236() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.stat.regression.SimpleRegression", "org.apache.commons.math.stat.regression.SimpleRegression", "getSlope", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.math.stat.regression.SimpleRegression", "addData", "double[][]", "<sample:4>"}, {"org.apache.commons.math.stat.regression.SimpleRegression", "addData", "double[][]", "<sample:0>"}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("1.0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getIntercept=1.0, getInterceptStdErr=NaN, getMeanSquareError=NaN, getN=2, getR=1.0, getRSquare=1.0, getRegressionSumSquares=0.5, getSignificance=!IllegalArgumentException, getSlope=1.0, getSlopeConfi...#309#1518297662", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput237() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.stat.regression.SimpleRegression", "org.apache.commons.math.stat.regression.SimpleRegression", "getR", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.math.stat.regression.SimpleRegression", "addData", "double[][]", "<sample:3>"}, {"org.apache.commons.math.stat.regression.SimpleRegression", "addData", "double,double", "-0.40000000000000036", "-1.7976931348623157E308"}});
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("NaN", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getIntercept=NaN, getInterceptStdErr=NaN, getMeanSquareError=NaN, getN=2, getR=NaN, getRSquare=NaN, getRegressionSumSquares=NaN, getSignificance=!IllegalArgumentException, getSlope=NaN, getSlopeConfi...#314#140651466", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput238() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.stat.regression.SimpleRegression", "org.apache.commons.math.stat.regression.SimpleRegression", "getR", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.math.stat.regression.SimpleRegression", "addData", "double[][]", "<sample:1>"}, {"org.apache.commons.math.stat.regression.SimpleRegression", "addData", "double[][]", "<sample:4>"}});
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("NaN", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getIntercept=NaN, getInterceptStdErr=NaN, getMeanSquareError=NaN, getN=2, getR=NaN, getRSquare=NaN, getRegressionSumSquares=Infinity, getSignificance=!IllegalArgumentException, getSlope=Infinity, get...#324#-684576868", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput239() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.stat.regression.SimpleRegression", "org.apache.commons.math.stat.regression.SimpleRegression", "getTotalSumSquares", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.math.stat.regression.SimpleRegression", "addData", "double,double", "-0.10149999999999999", "-Infinity"}, {"org.apache.commons.math.stat.regression.SimpleRegression", "addData", "double,double", "-5.4E-323", "Infinity"}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("Infinity", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getIntercept=NaN, getInterceptStdErr=NaN, getMeanSquareError=NaN, getN=2, getR=NaN, getRSquare=NaN, getRegressionSumSquares=Infinity, getSignificance=!IllegalArgumentException, getSlope=Infinity, get...#324#-684576868", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput240() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.stat.regression.SimpleRegression", "org.apache.commons.math.stat.regression.SimpleRegression", "getSlope", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.math.stat.regression.SimpleRegression", "addData", "double,double", "-34.8", "5.9E-323"}, {"org.apache.commons.math.stat.regression.SimpleRegression", "addData", "double,double", "2", "-0.946"}});
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("-0.025706521739130437", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getIntercept=-0.894586956521739, getInterceptStdErr=NaN, getMeanSquareError=NaN, getN=2, getR=-1.0, getRSquare=1.0, getRegressionSumSquares=0.44745799999999997, getSignificance=!IllegalArgumentExcept...#375#-452142615", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput241() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.stat.regression.SimpleRegression", "org.apache.commons.math.stat.regression.SimpleRegression", "predict", new String[]{"double"}, new String[]{"-3.0"}, false, 0, new String[][]{{"org.apache.commons.math.stat.regression.SimpleRegression", "addData", "double[][]", "<sample:0>"}, {"org.apache.commons.math.stat.regression.SimpleRegression", "addData", "double[][]", "<sample:4>"}});
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("-2.0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getIntercept=1.0, getInterceptStdErr=NaN, getMeanSquareError=NaN, getN=2, getR=1.0, getRSquare=1.0, getRegressionSumSquares=0.5, getSignificance=!IllegalArgumentException, getSlope=1.0, getSlopeConfi...#309#1518297662", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput242() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.stat.regression.SimpleRegression", "org.apache.commons.math.stat.regression.SimpleRegression", "getMeanSquareError", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.math.stat.regression.SimpleRegression", "addData", "double[][]", "<sample:1>"}, {"org.apache.commons.math.stat.regression.SimpleRegression", "addData", "double,double", "3.5953862697246315E307", "5.43E-322"}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("NaN", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getIntercept=NaN, getInterceptStdErr=NaN, getMeanSquareError=NaN, getN=2, getR=NaN, getRSquare=NaN, getRegressionSumSquares=NaN, getSignificance=!IllegalArgumentException, getSlope=NaN, getSlopeConfi...#314#140651466", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput243() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.stat.regression.SimpleRegression", "org.apache.commons.math.stat.regression.SimpleRegression", "getRegressionSumSquares", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.math.stat.regression.SimpleRegression", "addData", "double,double", "4.9E-324", "-1.22"}, {"org.apache.commons.math.stat.regression.SimpleRegression", "addData", "double,double", "0.49999999999999994", "0.1"}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("0.8711999999999999", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getIntercept=-1.2199999999999998, getInterceptStdErr=NaN, getMeanSquareError=NaN, getN=2, getR=0.9999999999999999, getRSquare=0.9999999999999999, getRegressionSumSquares=0.8711999999999999, getSignif...#405#1314837735", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput244() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.stat.regression.SimpleRegression", "org.apache.commons.math.stat.regression.SimpleRegression", "getRegressionSumSquares", new String[]{}, new String[]{}, false, 1, new String[][]{{"org.apache.commons.math.stat.regression.SimpleRegression", "addData", "double[][]", "<sample:4>"}, {"org.apache.commons.math.stat.regression.SimpleRegression", "addData", "double[][]", "<sample:0>"}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("0.5", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getIntercept=1.0, getInterceptStdErr=NaN, getMeanSquareError=NaN, getN=2, getR=1.0, getRSquare=1.0, getRegressionSumSquares=0.5, getSignificance=!IllegalArgumentException, getSlope=1.0, getSlopeConfi...#309#1518297662", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput245() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.stat.regression.SimpleRegression", "org.apache.commons.math.stat.regression.SimpleRegression", "getTotalSumSquares", new String[]{}, new String[]{}, false, 4, new String[][]{{"org.apache.commons.math.stat.regression.SimpleRegression", "addData", "double[][]", "<sample:4>"}, {"org.apache.commons.math.stat.regression.SimpleRegression", "addData", "double,double", "-3.0046890536075433E18", "0.34"}});
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("0.05780000000000001", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getIntercept=2.7755575615628914E-17, getInterceptStdErr=NaN, getMeanSquareError=NaN, getN=2, getR=-0.9999999999999999, getRSquare=0.9999999999999998, getRegressionSumSquares=0.0578, getSignificance=!...#416#-1544905540", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput246() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.stat.regression.SimpleRegression", "org.apache.commons.math.stat.regression.SimpleRegression", "getTotalSumSquares", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.math.stat.regression.SimpleRegression", "addData", "double,double", "12.0", "13.823"}, {"org.apache.commons.math.stat.regression.SimpleRegression", "addData", "double[][]", "<sample:1>"}});
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("Infinity", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getIntercept=Infinity, getInterceptStdErr=NaN, getMeanSquareError=NaN, getN=2, getR=NaN, getRSquare=NaN, getRegressionSumSquares=Infinity, getSignificance=!IllegalArgumentException, getSlope=-Infinit...#330#1755807958", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput247() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.stat.regression.SimpleRegression", "org.apache.commons.math.stat.regression.SimpleRegression", "getIntercept", new String[]{}, new String[]{}, false, 2, new String[][]{{"org.apache.commons.math.stat.regression.SimpleRegression", "addData", "double[][]", "<sample:4>"}, {"org.apache.commons.math.stat.regression.SimpleRegression", "addData", "double,double", "-2.993", "-0.40599999999999997"}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("0.20371299548419472", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getIntercept=0.20371299548419472, getInterceptStdErr=NaN, getMeanSquareError=NaN, getN=2, getR=1.0, getRSquare=1.0, getRegressionSumSquares=0.082418, getSignificance=!IllegalArgumentException, getSlo...#361#192102266", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput248() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.stat.regression.SimpleRegression", "org.apache.commons.math.stat.regression.SimpleRegression", "getRegressionSumSquares", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.math.stat.regression.SimpleRegression", "addData", "double[][]", "<sample:1>"}, {"org.apache.commons.math.stat.regression.SimpleRegression", "addData", "double,double", "-2.0", "-Infinity"}});
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("Infinity", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getIntercept=NaN, getInterceptStdErr=NaN, getMeanSquareError=NaN, getN=2, getR=NaN, getRSquare=NaN, getRegressionSumSquares=Infinity, getSignificance=!IllegalArgumentException, getSlope=Infinity, get...#324#-684576868", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput249() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.stat.regression.SimpleRegression", "org.apache.commons.math.stat.regression.SimpleRegression", "getTotalSumSquares", new String[]{}, new String[]{}, false, 7, new String[][]{{"org.apache.commons.math.stat.regression.SimpleRegression", "addData", "double,double", "-3.5", "1.7976931348623157E308"}, {"org.apache.commons.math.stat.regression.SimpleRegression", "addData", "double,double", "12.2", "-0.20299999999999999"}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("Infinity", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getIntercept=Infinity, getInterceptStdErr=NaN, getMeanSquareError=NaN, getN=2, getR=NaN, getRSquare=NaN, getRegressionSumSquares=Infinity, getSignificance=!IllegalArgumentException, getSlope=-Infinit...#330#1755807958", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput250() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.stat.regression.SimpleRegression", "org.apache.commons.math.stat.regression.SimpleRegression", "getSlope", new String[]{}, new String[]{}, false, 1, new String[][]{{"org.apache.commons.math.stat.regression.SimpleRegression", "addData", "double[][]", "<sample:1>"}, {"org.apache.commons.math.stat.regression.SimpleRegression", "addData", "double,double", "4.9E-323", "-2.948"}});
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("Infinity", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getIntercept=NaN, getInterceptStdErr=NaN, getMeanSquareError=NaN, getN=2, getR=NaN, getRSquare=NaN, getRegressionSumSquares=Infinity, getSignificance=!IllegalArgumentException, getSlope=Infinity, get...#324#-684576868", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput251() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.stat.regression.SimpleRegression", "org.apache.commons.math.stat.regression.SimpleRegression", "getRegressionSumSquares", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.math.stat.regression.SimpleRegression", "addData", "double,double", "5.1000000000000005", "0.0"}, {"org.apache.commons.math.stat.regression.SimpleRegression", "addData", "double[][]", "<sample:4>"}});
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("0.0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getIntercept=0.0, getInterceptStdErr=NaN, getMeanSquareError=NaN, getN=2, getR=NaN, getRSquare=NaN, getRegressionSumSquares=0.0, getSignificance=!IllegalArgumentException, getSlope=0.0, getSlopeConfi...#309#907667286", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput252() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.stat.regression.SimpleRegression", "org.apache.commons.math.stat.regression.SimpleRegression", "getIntercept", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.math.stat.regression.SimpleRegression", "addData", "double[][]", "<sample:0>"}, {"org.apache.commons.math.stat.regression.SimpleRegression", "addData", "double,double", "-1.0", "-8.988465674311579E307"}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("0.0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getIntercept=0.0, getInterceptStdErr=NaN, getMeanSquareError=NaN, getN=2, getR=NaN, getRSquare=NaN, getRegressionSumSquares=Infinity, getSignificance=!IllegalArgumentException, getSlope=8.98846567431...#337#1775282029", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput253() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.stat.regression.SimpleRegression", "org.apache.commons.math.stat.regression.SimpleRegression", "getSumSquaredErrors", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.math.stat.regression.SimpleRegression", "addData", "double[][]", "<sample:3>"}, {"org.apache.commons.math.stat.regression.SimpleRegression", "addData", "double[][]", "<sample:3>"}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("NaN", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getIntercept=NaN, getInterceptStdErr=NaN, getMeanSquareError=NaN, getN=2, getR=NaN, getRSquare=NaN, getRegressionSumSquares=NaN, getSignificance=!IllegalArgumentException, getSlope=NaN, getSlopeConfi...#309#342919958", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput254() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.stat.regression.SimpleRegression", "org.apache.commons.math.stat.regression.SimpleRegression", "getSlope", new String[]{}, new String[]{}, false, 7, new String[][]{{"org.apache.commons.math.stat.regression.SimpleRegression", "addData", "double[][]", "<sample:4>"}, {"org.apache.commons.math.stat.regression.SimpleRegression", "addData", "double,double", "1.012", "2.0"}});
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("0.9940357852882704", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getIntercept=0.9940357852882704, getInterceptStdErr=NaN, getMeanSquareError=NaN, getN=2, getR=1.0, getRSquare=1.0, getRegressionSumSquares=2.0, getSignificance=!IllegalArgumentException, getSlope=0.9...#339#-1021606450", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput255() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.stat.regression.SimpleRegression", "org.apache.commons.math.stat.regression.SimpleRegression", "getInterceptStdErr", new String[]{}, new String[]{}, false, 5, new String[][]{{"org.apache.commons.math.stat.regression.SimpleRegression", "addData", "double[][]", "<sample:1>"}, {"org.apache.commons.math.stat.regression.SimpleRegression", "addData", "double,double", "-0.9999999999999999", "9.76"}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("NaN", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getIntercept=NaN, getInterceptStdErr=NaN, getMeanSquareError=NaN, getN=2, getR=NaN, getRSquare=NaN, getRegressionSumSquares=Infinity, getSignificance=!IllegalArgumentException, getSlope=Infinity, get...#324#-684576868", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput256() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.stat.regression.SimpleRegression", "org.apache.commons.math.stat.regression.SimpleRegression", "getTotalSumSquares", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.math.stat.regression.SimpleRegression", "addData", "double[][]", "<sample:0>"}, {"org.apache.commons.math.stat.regression.SimpleRegression", "addData", "double,double", "11.739999999999997", "-0.20299999999999999"}});
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("0.7236045000000001", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getIntercept=1.0, getInterceptStdErr=NaN, getMeanSquareError=NaN, getN=2, getR=-0.9999999999999999, getRSquare=0.9999999999999999, getRegressionSumSquares=0.7236044999999999, getSignificance=!Illegal...#406#161953957", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput257() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.stat.regression.SimpleRegression", "org.apache.commons.math.stat.regression.SimpleRegression", "predict", new String[]{"double"}, new String[]{"6.000000000000001"}, false, 0, new String[][]{{"org.apache.commons.math.stat.regression.SimpleRegression", "addData", "double,double", "0.5", "12.199999999999996"}, {"org.apache.commons.math.stat.regression.SimpleRegression", "addData", "double,double", "12.200000000000001", "0.054"}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("6.4903418803418775", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getIntercept=12.719059829059825, getInterceptStdErr=NaN, getMeanSquareError=NaN, getN=2, getR=-0.9999999999999999, getRSquare=0.9999999999999998, getRegressionSumSquares=73.76265799999994, getSignifi...#418#-124096592", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput258() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.stat.regression.SimpleRegression", "org.apache.commons.math.stat.regression.SimpleRegression", "getSlope", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.math.stat.regression.SimpleRegression", "addData", "double,double", "0.05", "-1.015"}, {"org.apache.commons.math.stat.regression.SimpleRegression", "addData", "double,double", "22.0", "20.0"}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("0.9574031890660593", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getIntercept=-1.062870159453304, getInterceptStdErr=NaN, getMeanSquareError=NaN, getN=2, getR=1.0, getRSquare=1.0, getRegressionSumSquares=220.8151125, getSignificance=!IllegalArgumentException, getS...#355#1305236826", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput259() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.stat.regression.SimpleRegression", "org.apache.commons.math.stat.regression.SimpleRegression", "getR", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.math.stat.regression.SimpleRegression", "addData", "double,double", "2.0", "-0.018000000000000002"}, {"org.apache.commons.math.stat.regression.SimpleRegression", "addData", "double[][]", "<sample:0>"}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("-1.0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getIntercept=1.0, getInterceptStdErr=NaN, getMeanSquareError=NaN, getN=2, getR=-1.0, getRSquare=1.0, getRegressionSumSquares=0.518162, getSignificance=!IllegalArgumentException, getSlope=-0.509, getS...#323#-489996155", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput260() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.stat.regression.SimpleRegression", "org.apache.commons.math.stat.regression.SimpleRegression", "getRegressionSumSquares", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.math.stat.regression.SimpleRegression", "addData", "double[][]", "<sample:4>"}, {"org.apache.commons.math.stat.regression.SimpleRegression", "addData", "double[][]", "<sample:1>"}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("Infinity", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getIntercept=NaN, getInterceptStdErr=NaN, getMeanSquareError=NaN, getN=2, getR=NaN, getRSquare=NaN, getRegressionSumSquares=Infinity, getSignificance=!IllegalArgumentException, getSlope=Infinity, get...#324#-684576868", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput261() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.stat.regression.SimpleRegression", "org.apache.commons.math.stat.regression.SimpleRegression", "getRegressionSumSquares", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.math.stat.regression.SimpleRegression", "addData", "double[][]", "<sample:0>"}, {"org.apache.commons.math.stat.regression.SimpleRegression", "addData", "double[][]", "<sample:0>"}});
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("NaN", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getIntercept=NaN, getInterceptStdErr=NaN, getMeanSquareError=NaN, getN=2, getR=NaN, getRSquare=NaN, getRegressionSumSquares=NaN, getSignificance=!IllegalArgumentException, getSlope=NaN, getSlopeConfi...#309#342919958", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput262() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.stat.regression.SimpleRegression", "org.apache.commons.math.stat.regression.SimpleRegression", "predict", new String[]{"double"}, new String[]{"-2.0"}, false, 7, new String[][]{{"org.apache.commons.math.stat.regression.SimpleRegression", "addData", "double[][]", "<sample:0>"}, {"org.apache.commons.math.stat.regression.SimpleRegression", "addData", "double,double", "-2.066", "1.2560000000000002"}});
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("1.2478218780251698", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getIntercept=1.0, getInterceptStdErr=NaN, getMeanSquareError=NaN, getN=2, getR=-1.0, getRSquare=1.0, getRegressionSumSquares=0.03276800000000007, getSignificance=!IllegalArgumentException, getSlope=-...#359#-1880511642", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput263() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.stat.regression.SimpleRegression", "org.apache.commons.math.stat.regression.SimpleRegression", "getR", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.math.stat.regression.SimpleRegression", "addData", "double,double", "-1.7976931348623157E308", "0.22200000000000003"}, {"org.apache.commons.math.stat.regression.SimpleRegression", "addData", "double,double", "4.9E-324", "12.2"}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("NaN", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getIntercept=NaN, getInterceptStdErr=NaN, getMeanSquareError=NaN, getN=2, getR=NaN, getRSquare=NaN, getRegressionSumSquares=NaN, getSignificance=!IllegalArgumentException, getSlope=NaN, getSlopeConfi...#323#-1996399489", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput264() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.stat.regression.SimpleRegression", "org.apache.commons.math.stat.regression.SimpleRegression", "getR", new String[]{}, new String[]{}, false, 4, new String[][]{{"org.apache.commons.math.stat.regression.SimpleRegression", "addData", "double,double", "0.0", "4.4E-323"}, {"org.apache.commons.math.stat.regression.SimpleRegression", "addData", "double,double", "-0.04000000000000001", "1.22"}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("-1.0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getIntercept=0.0, getInterceptStdErr=NaN, getMeanSquareError=NaN, getN=2, getR=-1.0, getRSquare=1.0, getRegressionSumSquares=0.7442, getSignificance=!IllegalArgumentException, getSlope=-30.4999999999...#332#2016480629", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput265() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.stat.regression.SimpleRegression", "org.apache.commons.math.stat.regression.SimpleRegression", "getInterceptStdErr", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.math.stat.regression.SimpleRegression", "addData", "double[][]", "<sample:3>"}, {"org.apache.commons.math.stat.regression.SimpleRegression", "addData", "double,double", "0.17999999999999997", "-30.0"}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("NaN", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getIntercept=NaN, getInterceptStdErr=NaN, getMeanSquareError=NaN, getN=2, getR=NaN, getRSquare=NaN, getRegressionSumSquares=NaN, getSignificance=!IllegalArgumentException, getSlope=NaN, getSlopeConfi...#311#-1048265617", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput266() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.stat.regression.SimpleRegression", "org.apache.commons.math.stat.regression.SimpleRegression", "getSlope", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.math.stat.regression.SimpleRegression", "addData", "double,double", "39.199999999999996", "-15.799999999999997"}, {"org.apache.commons.math.stat.regression.SimpleRegression", "addData", "double,double", "2.35", "6.1"}});
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("-0.5943012211668929", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getIntercept=7.4966078697422, getInterceptStdErr=NaN, getMeanSquareError=NaN, getN=2, getR=-1.0, getRSquare=1.0, getRegressionSumSquares=239.805, getSignificance=!IllegalArgumentException, getSlope=-...#357#1127702388", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput267() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.stat.regression.SimpleRegression", "org.apache.commons.math.stat.regression.SimpleRegression", "getInterceptStdErr", new String[]{}, new String[]{}, false, 2, new String[][]{{"org.apache.commons.math.stat.regression.SimpleRegression", "addData", "double,double", "12.299999999999999", "1.7976931348623157E308"}, {"org.apache.commons.math.stat.regression.SimpleRegression", "addData", "double,double", "1.7976931348623157E308", "0.0"}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("NaN", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getIntercept=NaN, getInterceptStdErr=NaN, getMeanSquareError=NaN, getN=2, getR=NaN, getRSquare=NaN, getRegressionSumSquares=NaN, getSignificance=!IllegalArgumentException, getSlope=NaN, getSlopeConfi...#314#140651466", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput268() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.stat.regression.SimpleRegression", "org.apache.commons.math.stat.regression.SimpleRegression", "getTotalSumSquares", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.math.stat.regression.SimpleRegression", "addData", "double[][]", "<sample:0>"}, {"org.apache.commons.math.stat.regression.SimpleRegression", "addData", "double,double", "-1.7976931348623157E308", "-1.0"}});
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("2.0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getIntercept=NaN, getInterceptStdErr=NaN, getMeanSquareError=NaN, getN=2, getR=NaN, getRSquare=NaN, getRegressionSumSquares=NaN, getSignificance=!IllegalArgumentException, getSlope=NaN, getSlopeConfi...#309#342979540", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput269() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.stat.regression.SimpleRegression", "org.apache.commons.math.stat.regression.SimpleRegression", "predict", new String[]{"double"}, new String[]{"1.9999999999999998"}, false, 0, new String[][]{{"org.apache.commons.math.stat.regression.SimpleRegression", "addData", "double,double", "0.7899999999999999", "-2.0"}, {"org.apache.commons.math.stat.regression.SimpleRegression", "addData", "double[][]", "<sample:3>"}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("NaN", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getIntercept=NaN, getInterceptStdErr=NaN, getMeanSquareError=NaN, getN=2, getR=NaN, getRSquare=NaN, getRegressionSumSquares=NaN, getSignificance=!IllegalArgumentException, getSlope=NaN, getSlopeConfi...#309#342920113", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput270() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.stat.regression.SimpleRegression", "org.apache.commons.math.stat.regression.SimpleRegression", "getTotalSumSquares", new String[]{}, new String[]{}, false, 1, new String[][]{{"org.apache.commons.math.stat.regression.SimpleRegression", "addData", "double,double", "0.017", "-1.0330000000000001"}, {"org.apache.commons.math.stat.regression.SimpleRegression", "addData", "double[][]", "<sample:4>"}});
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("0.5335445000000002", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getIntercept=-1.015732546705998, getInterceptStdErr=NaN, getMeanSquareError=NaN, getN=2, getR=-1.0, getRSquare=1.0, getRegressionSumSquares=0.5335445000000002, getSignificance=!IllegalArgumentExcepti...#371#2082326578", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput271() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.stat.regression.SimpleRegression", "org.apache.commons.math.stat.regression.SimpleRegression", "predict", new String[]{"double"}, new String[]{"-0.016"}, false, 0, new String[][]{{"org.apache.commons.math.stat.regression.SimpleRegression", "addData", "double[][]", "<sample:4>"}, {"org.apache.commons.math.stat.regression.SimpleRegression", "addData", "double,double", "2", "-2.0"}});
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("-0.656", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getIntercept=-0.6666666666666667, getInterceptStdErr=NaN, getMeanSquareError=NaN, getN=2, getR=-1.0, getRSquare=1.0, getRegressionSumSquares=2.0, getSignificance=!IllegalArgumentException, getSlope=-...#342#695382416", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput272() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.stat.regression.SimpleRegression", "org.apache.commons.math.stat.regression.SimpleRegression", "predict", new String[]{"double"}, new String[]{"10.200000000000001"}, false, 4, new String[][]{{"org.apache.commons.math.stat.regression.SimpleRegression", "addData", "double[][]", "<sample:3>"}, {"org.apache.commons.math.stat.regression.SimpleRegression", "addData", "double,double", "-1.0", "-0.3"}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("NaN", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getIntercept=NaN, getInterceptStdErr=NaN, getMeanSquareError=NaN, getN=2, getR=NaN, getRSquare=NaN, getRegressionSumSquares=NaN, getSignificance=!IllegalArgumentException, getSlope=NaN, getSlopeConfi...#325#-1303766858", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput273() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.stat.regression.SimpleRegression", "org.apache.commons.math.stat.regression.SimpleRegression", "predict", new String[]{"double"}, new String[]{"12.199999999999996"}, false, 5, new String[][]{{"org.apache.commons.math.stat.regression.SimpleRegression", "addData", "double,double", "-0.203", "1.1E-322"}, {"org.apache.commons.math.stat.regression.SimpleRegression", "addData", "double,double", "-1.0", "-10.0"}});
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("155.62107904642403", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getIntercept=2.5470514429109166, getInterceptStdErr=NaN, getMeanSquareError=NaN, getN=2, getR=0.9999999999999999, getRSquare=0.9999999999999999, getRegressionSumSquares=50.0, getSignificance=!Illegal...#389#-1941599072", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput274() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.stat.regression.SimpleRegression", "org.apache.commons.math.stat.regression.SimpleRegression", "getSlope", new String[]{}, new String[]{}, false, 7, new String[][]{{"org.apache.commons.math.stat.regression.SimpleRegression", "addData", "double,double", "0.61", "-3.004689053607543E17"}, {"org.apache.commons.math.stat.regression.SimpleRegression", "addData", "double,double", "-0.0", "4.9E-324"}});
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("-4.9257197600123661E17", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getIntercept=0.0, getInterceptStdErr=NaN, getMeanSquareError=NaN, getN=2, getR=-1.0, getRSquare=1.0, getRegressionSumSquares=4.514078154434497E34, getSignificance=!IllegalArgumentException, getSlope=...#363#831818809", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput275() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.stat.regression.SimpleRegression", "org.apache.commons.math.stat.regression.SimpleRegression", "getSumSquaredErrors", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.math.stat.regression.SimpleRegression", "addData", "double,double", "13.299999999999997", "1.7976931348623155E308"}, {"org.apache.commons.math.stat.regression.SimpleRegression", "addData", "double[][]", "<sample:1>"}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("NaN", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getIntercept=Infinity, getInterceptStdErr=NaN, getMeanSquareError=NaN, getN=2, getR=NaN, getRSquare=NaN, getRegressionSumSquares=Infinity, getSignificance=!IllegalArgumentException, getSlope=-Infinit...#330#1755807958", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput276() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.stat.regression.SimpleRegression", "org.apache.commons.math.stat.regression.SimpleRegression", "getN", new String[]{}, new String[]{}, false, 1, new String[][]{{"org.apache.commons.math.stat.regression.SimpleRegression", "addData", "double[][]", "<sample:1>"}, {"org.apache.commons.math.stat.regression.SimpleRegression", "addData", "double[][]", "<sample:1>"}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Long", actual.getClass().getName());
  assertEquals("2", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getIntercept=NaN, getInterceptStdErr=NaN, getMeanSquareError=NaN, getN=2, getR=NaN, getRSquare=NaN, getRegressionSumSquares=NaN, getSignificance=!IllegalArgumentException, getSlope=NaN, getSlopeConfi...#309#343863629", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput277() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.stat.regression.SimpleRegression", "org.apache.commons.math.stat.regression.SimpleRegression", "getTotalSumSquares", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.math.stat.regression.SimpleRegression", "addData", "double,double", "6.099999999999999", "-1.0"}, {"org.apache.commons.math.stat.regression.SimpleRegression", "addData", "double,double", "0.7000000000000002", "-0.18"}});
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("0.33620000000000005", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getIntercept=-0.0737037037037036, getInterceptStdErr=NaN, getMeanSquareError=NaN, getN=2, getR=-1.0, getRSquare=1.0, getRegressionSumSquares=0.33620000000000005, getSignificance=!IllegalArgumentExcep...#374#-1563918011", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput278() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.stat.regression.SimpleRegression", "org.apache.commons.math.stat.regression.SimpleRegression", "getIntercept", new String[]{}, new String[]{}, false, 2, new String[][]{{"org.apache.commons.math.stat.regression.SimpleRegression", "addData", "double[][]", "<sample:1>"}, {"org.apache.commons.math.stat.regression.SimpleRegression", "addData", "double[][]", "<sample:1>"}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("NaN", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getIntercept=NaN, getInterceptStdErr=NaN, getMeanSquareError=NaN, getN=2, getR=NaN, getRSquare=NaN, getRegressionSumSquares=NaN, getSignificance=!IllegalArgumentException, getSlope=NaN, getSlopeConfi...#309#343863629", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput279() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.stat.regression.SimpleRegression", "org.apache.commons.math.stat.regression.SimpleRegression", "getSumSquaredErrors", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.math.stat.regression.SimpleRegression", "addData", "double[][]", "<sample:3>"}, {"org.apache.commons.math.stat.regression.SimpleRegression", "addData", "double[][]", "<sample:0>"}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("NaN", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getIntercept=NaN, getInterceptStdErr=NaN, getMeanSquareError=NaN, getN=2, getR=NaN, getRSquare=NaN, getRegressionSumSquares=NaN, getSignificance=!IllegalArgumentException, getSlope=NaN, getSlopeConfi...#309#342979540", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput280() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.stat.regression.SimpleRegression", "org.apache.commons.math.stat.regression.SimpleRegression", "predict", new String[]{"double"}, new String[]{"-6.0"}, false, 0, new String[][]{{"org.apache.commons.math.stat.regression.SimpleRegression", "addData", "double,double", "-2.0", "3.0046890536075433E18"}, {"org.apache.commons.math.stat.regression.SimpleRegression", "addData", "double,double", "2", "2.018"}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("6.0093781072150866E18", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getIntercept=1.50234452680377165E18, getInterceptStdErr=NaN, getMeanSquareError=NaN, getN=2, getR=-1.0, getRSquare=1.0, getRegressionSumSquares=4.5140781544344973E36, getSignificance=!IllegalArgument...#384#469663608", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput281() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.stat.regression.SimpleRegression", "org.apache.commons.math.stat.regression.SimpleRegression", "getR", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.math.stat.regression.SimpleRegression", "addData", "double,double", "-0.18000000000000005", "4.9E-324"}, {"org.apache.commons.math.stat.regression.SimpleRegression", "addData", "double[][]", "<sample:0>"}});
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("1.0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getIntercept=1.0, getInterceptStdErr=NaN, getMeanSquareError=NaN, getN=2, getR=1.0, getRSquare=1.0, getRegressionSumSquares=0.49999999999999994, getSignificance=!IllegalArgumentException, getSlope=5....#339#1605299180", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput282() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.stat.regression.SimpleRegression", "org.apache.commons.math.stat.regression.SimpleRegression", "getRegressionSumSquares", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.math.stat.regression.SimpleRegression", "addData", "double[][]", "<sample:0>"}, {"org.apache.commons.math.stat.regression.SimpleRegression", "addData", "double[][]", "<sample:0>"}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("NaN", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getIntercept=NaN, getInterceptStdErr=NaN, getMeanSquareError=NaN, getN=2, getR=NaN, getRSquare=NaN, getRegressionSumSquares=NaN, getSignificance=!IllegalArgumentException, getSlope=NaN, getSlopeConfi...#309#342919958", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput283() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.stat.regression.SimpleRegression", "org.apache.commons.math.stat.regression.SimpleRegression", "getRegressionSumSquares", new String[]{}, new String[]{}, false, 2, new String[][]{{"org.apache.commons.math.stat.regression.SimpleRegression", "addData", "double[][]", "<sample:0>"}, {"org.apache.commons.math.stat.regression.SimpleRegression", "addData", "double,double", "1.22", "-62.0"}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("1984.5", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getIntercept=1.0, getInterceptStdErr=NaN, getMeanSquareError=NaN, getN=2, getR=-1.0, getRSquare=1.0, getRegressionSumSquares=1984.5, getSignificance=!IllegalArgumentException, getSlope=-51.6393442622...#331#177947612", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput284() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.stat.regression.SimpleRegression", "org.apache.commons.math.stat.regression.SimpleRegression", "getSlope", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.math.stat.regression.SimpleRegression", "addData", "double[][]", "<sample:0>"}, {"org.apache.commons.math.stat.regression.SimpleRegression", "addData", "double[][]", "<sample:3>"}});
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("NaN", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getIntercept=NaN, getInterceptStdErr=NaN, getMeanSquareError=NaN, getN=2, getR=NaN, getRSquare=NaN, getRegressionSumSquares=NaN, getSignificance=!IllegalArgumentException, getSlope=NaN, getSlopeConfi...#309#342979540", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput285() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.stat.regression.SimpleRegression", "org.apache.commons.math.stat.regression.SimpleRegression", "getR", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.math.stat.regression.SimpleRegression", "addData", "double,double", "0.0", "0.2"}, {"org.apache.commons.math.stat.regression.SimpleRegression", "addData", "double,double", "-3.0046890536075433E18", "-0.08"}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("1.0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getIntercept=0.2, getInterceptStdErr=NaN, getMeanSquareError=NaN, getN=2, getR=1.0, getRSquare=1.0, getRegressionSumSquares=0.039200000000000006, getSignificance=!IllegalArgumentException, getSlope=9...#361#1518101064", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput286() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.stat.regression.SimpleRegression", "org.apache.commons.math.stat.regression.SimpleRegression", "getSlopeStdErr", new String[]{}, new String[]{}, false, 1, new String[][]{{"org.apache.commons.math.stat.regression.SimpleRegression", "addData", "double[][]", "<sample:1>"}, {"org.apache.commons.math.stat.regression.SimpleRegression", "addData", "double,double", "12.2", "24.4"}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("NaN", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getIntercept=Infinity, getInterceptStdErr=NaN, getMeanSquareError=NaN, getN=2, getR=NaN, getRSquare=NaN, getRegressionSumSquares=Infinity, getSignificance=!IllegalArgumentException, getSlope=-Infinit...#330#1755807958", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput287() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.stat.regression.SimpleRegression", "org.apache.commons.math.stat.regression.SimpleRegression", "getInterceptStdErr", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.math.stat.regression.SimpleRegression", "addData", "double[][]", "<sample:0>"}, {"org.apache.commons.math.stat.regression.SimpleRegression", "addData", "double[][]", "<sample:3>"}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("NaN", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getIntercept=NaN, getInterceptStdErr=NaN, getMeanSquareError=NaN, getN=2, getR=NaN, getRSquare=NaN, getRegressionSumSquares=NaN, getSignificance=!IllegalArgumentException, getSlope=NaN, getSlopeConfi...#309#342979540", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput288() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.stat.regression.SimpleRegression", "org.apache.commons.math.stat.regression.SimpleRegression", "getSlope", new String[]{}, new String[]{}, false, 7, new String[][]{{"org.apache.commons.math.stat.regression.SimpleRegression", "addData", "double,double", "0.0", "0.19"}, {"org.apache.commons.math.stat.regression.SimpleRegression", "addData", "double,double", "NaN", "0.0"}});
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("NaN", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getIntercept=NaN, getInterceptStdErr=NaN, getMeanSquareError=NaN, getN=2, getR=NaN, getRSquare=NaN, getRegressionSumSquares=NaN, getSignificance=!IllegalArgumentException, getSlope=NaN, getSlopeConfi...#313#5522858", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput289() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.stat.regression.SimpleRegression", "org.apache.commons.math.stat.regression.SimpleRegression", "getIntercept", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.math.stat.regression.SimpleRegression", "addData", "double[][]", "<sample:1>"}, {"org.apache.commons.math.stat.regression.SimpleRegression", "addData", "double[][]", "<sample:6>"}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("NaN", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getIntercept=NaN, getInterceptStdErr=NaN, getMeanSquareError=NaN, getN=2, getR=NaN, getRSquare=NaN, getRegressionSumSquares=NaN, getSignificance=!IllegalArgumentException, getSlope=NaN, getSlopeConfi...#309#343863629", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput290() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.stat.regression.SimpleRegression", "org.apache.commons.math.stat.regression.SimpleRegression", "getSlope", new String[]{}, new String[]{}, false, 7, new String[][]{{"org.apache.commons.math.stat.regression.SimpleRegression", "addData", "double[][]", "<sample:0>"}, {"org.apache.commons.math.stat.regression.SimpleRegression", "addData", "double[][]", "<sample:3>"}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("NaN", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getIntercept=NaN, getInterceptStdErr=NaN, getMeanSquareError=NaN, getN=2, getR=NaN, getRSquare=NaN, getRegressionSumSquares=NaN, getSignificance=!IllegalArgumentException, getSlope=NaN, getSlopeConfi...#309#342979540", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput291() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.stat.regression.SimpleRegression", "org.apache.commons.math.stat.regression.SimpleRegression", "getRegressionSumSquares", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.math.stat.regression.SimpleRegression", "addData", "double,double", "0.010000000000000002", "1.04E-322"}, {"org.apache.commons.math.stat.regression.SimpleRegression", "addData", "double[][]", "<sample:0>"}});
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("0.49999999999999994", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getIntercept=1.0, getInterceptStdErr=NaN, getMeanSquareError=NaN, getN=2, getR=-1.0, getRSquare=1.0, getRegressionSumSquares=0.49999999999999994, getSignificance=!IllegalArgumentException, getSlope=-...#341#-385655245", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput292() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.stat.regression.SimpleRegression", "org.apache.commons.math.stat.regression.SimpleRegression", "getR", new String[]{}, new String[]{}, false, 5, new String[][]{{"org.apache.commons.math.stat.regression.SimpleRegression", "addData", "double,double", "-2.903", "0.3"}, {"org.apache.commons.math.stat.regression.SimpleRegression", "addData", "double[][]", "<sample:0>"}});
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("0.9999999999999999", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getIntercept=1.0, getInterceptStdErr=NaN, getMeanSquareError=NaN, getN=2, getR=0.9999999999999999, getRSquare=0.9999999999999999, getRegressionSumSquares=0.24499999999999994, getSignificance=!Illegal...#406#-1767981200", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput293() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.stat.regression.SimpleRegression", "org.apache.commons.math.stat.regression.SimpleRegression", "predict", new String[]{"double"}, new String[]{"-Infinity"}, false, 0, new String[][]{{"org.apache.commons.math.stat.regression.SimpleRegression", "addData", "double,double", "4.88", "1.7976931348623156E306"}, {"org.apache.commons.math.stat.regression.SimpleRegression", "addData", "double[][]", "<sample:0>"}});
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("-Infinity", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getIntercept=0.0, getInterceptStdErr=NaN, getMeanSquareError=NaN, getN=2, getR=NaN, getRSquare=NaN, getRegressionSumSquares=Infinity, getSignificance=!IllegalArgumentException, getSlope=3.68379740750...#337#648671931", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput294() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.stat.regression.SimpleRegression", "org.apache.commons.math.stat.regression.SimpleRegression", "getRegressionSumSquares", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.math.stat.regression.SimpleRegression", "addData", "double[][]", "<sample:0>"}, {"org.apache.commons.math.stat.regression.SimpleRegression", "addData", "double,double", "-3004689053607543335", "1.22"}});
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("0.024199999999999992", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getIntercept=0.9999999999999999, getInterceptStdErr=NaN, getMeanSquareError=NaN, getN=2, getR=-0.9999999999999998, getRSquare=0.9999999999999997, getRegressionSumSquares=0.024199999999999992, getSign...#426#756156545", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput295() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.stat.regression.SimpleRegression", "org.apache.commons.math.stat.regression.SimpleRegression", "predict", new String[]{"double"}, new String[]{"4.880000000000001"}, false, 3, new String[][]{{"org.apache.commons.math.stat.regression.SimpleRegression", "addData", "double[][]", "<sample:1>"}, {"org.apache.commons.math.stat.regression.SimpleRegression", "addData", "double,double", "-1.22", "-6.0"}});
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("Infinity", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getIntercept=Infinity, getInterceptStdErr=NaN, getMeanSquareError=NaN, getN=2, getR=NaN, getRSquare=NaN, getRegressionSumSquares=Infinity, getSignificance=!IllegalArgumentException, getSlope=Infinity...#329#1124939171", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput296() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.stat.regression.SimpleRegression", "org.apache.commons.math.stat.regression.SimpleRegression", "getSlope", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.math.stat.regression.SimpleRegression", "addData", "double[][]", "<sample:4>"}, {"org.apache.commons.math.stat.regression.SimpleRegression", "addData", "double,double", "-0.18", "2.0000000000000004"}});
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("2.439024390243903", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getIntercept=2.439024390243903, getInterceptStdErr=NaN, getMeanSquareError=NaN, getN=2, getR=1.0, getRSquare=1.0, getRegressionSumSquares=2.000000000000001, getSignificance=!IllegalArgumentException,...#365#-132523490", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput297() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.stat.regression.SimpleRegression", "org.apache.commons.math.stat.regression.SimpleRegression", "getIntercept", new String[]{}, new String[]{}, false, 5, new String[][]{{"org.apache.commons.math.stat.regression.SimpleRegression", "addData", "double[][]", "<sample:0>"}, {"org.apache.commons.math.stat.regression.SimpleRegression", "addData", "double[][]", "<sample:1>"}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("NaN", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getIntercept=NaN, getInterceptStdErr=NaN, getMeanSquareError=NaN, getN=2, getR=NaN, getRSquare=NaN, getRegressionSumSquares=Infinity, getSignificance=!IllegalArgumentException, getSlope=Infinity, get...#324#-684576868", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput298() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.stat.regression.SimpleRegression", "org.apache.commons.math.stat.regression.SimpleRegression", "getTotalSumSquares", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.math.stat.regression.SimpleRegression", "addData", "double[][]", "<sample:0>"}, {"org.apache.commons.math.stat.regression.SimpleRegression", "addData", "double,double", "9.212", "2.0"}});
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("0.5", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getIntercept=1.0, getInterceptStdErr=NaN, getMeanSquareError=NaN, getN=2, getR=1.0, getRSquare=1.0, getRegressionSumSquares=0.5, getSignificance=!IllegalArgumentException, getSlope=0.1085540599218410...#325#1437666315", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput299() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.stat.regression.SimpleRegression", "org.apache.commons.math.stat.regression.SimpleRegression", "getMeanSquareError", new String[]{}, new String[]{}, false, 2, new String[][]{{"org.apache.commons.math.stat.regression.SimpleRegression", "addData", "double,double", "-0.08", "-1.7976931348623157E308"}, {"org.apache.commons.math.stat.regression.SimpleRegression", "addData", "double,double", "5.100000000000001", "-30.0"}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("NaN", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getIntercept=-Infinity, getInterceptStdErr=NaN, getMeanSquareError=NaN, getN=2, getR=NaN, getRSquare=NaN, getRegressionSumSquares=Infinity, getSignificance=!IllegalArgumentException, getSlope=Infinit...#330#649880642", SearchInputFactory_scaffolding.receiverState());
 }
}
