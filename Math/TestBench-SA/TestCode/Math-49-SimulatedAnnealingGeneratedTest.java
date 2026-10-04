package generated.algorithm;

import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;
import static org.junit.Assert.*;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class SimulatedAnnealingGeneratedTest {
 @Test(timeout = 20000)
 public void generatedInput000() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.linear.OpenMapRealVector", "org.apache.commons.math.linear.OpenMapRealVector", "getL1Distance", new String[]{"org.apache.commons.math.linear.OpenMapRealVector"}, new String[]{"<sample:1>"}, false, 7, new String[][]{{"org.apache.commons.math.linear.OpenMapRealVector", "subtract", "double[]", "<sample:8>"}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("Infinity", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getData=[Infinity, -Infinity, 0.0], getDimension=3, getL1Norm=Infinity, getLInfNorm=Infinity, getMaxIndex=0, getMaxValue=Infinity, getMinIndex=1, getMinValue=-Infinity, getNorm=Infinity, getSparsity=...#249#903803555", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput001() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.linear.OpenMapRealVector", "org.apache.commons.math.linear.OpenMapRealVector", "hashCode", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.math.linear.OpenMapRealVector", "ebeDivide", "org.apache.commons.math.linear.RealVector", "<sample:4>"}, {"org.apache.commons.math.linear.OpenMapRealVector", "unitVector", ""}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("-818727111", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getData=[], getDimension=0, getL1Norm=0.0, getLInfNorm=0.0, getMaxIndex=-1, getMaxValue=NaN, getMinIndex=-1, getMinValue=NaN, getNorm=0.0, getSparsity=NaN, isInfinite=false, isNaN=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput002() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.linear.OpenMapRealVector", "org.apache.commons.math.linear.OpenMapRealVector", "hashCode", new String[]{}, new String[]{}, false, 1, new String[][]{{"org.apache.commons.math.linear.OpenMapRealVector", "ebeDivide", "org.apache.commons.math.linear.RealVector", "<sample:4>"}, {"org.apache.commons.math.linear.OpenMapRealVector", "unitVector", ""}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("-1694978236", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getData=[1.0, Infinity, -Infinity], getDimension=3, getL1Norm=Infinity, getLInfNorm=Infinity, getMaxIndex=1, getMaxValue=Infinity, getMinIndex=2, getMinValue=-Infinity, getNorm=Infinity, getSparsity=...#234#-614213921", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput003() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.linear.OpenMapRealVector", "org.apache.commons.math.linear.OpenMapRealVector", "getSubVector", new String[]{"int", "int"}, new String[]{"1", "1"}, false, 1, new String[][]{{"org.apache.commons.math.linear.OpenMapRealVector", "checkVectorDimensions", "org.apache.commons.math.linear.RealVector", "<sample:0>"}, {"org.apache.commons.math.linear.OpenMapRealVector", "getLInfDistance", "org.apache.commons.math.linear.RealVector", "<sample:4>"}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.math.linear.OpenMapRealVector", actual.getClass().getName());
  assertEquals("{getData=[Infinity], getDimension=1, getL1Norm=Infinity, getLInfNorm=Infinity, getMaxIndex=0, getMaxValue=Infinity, getMinIndex=0, getMinValue=Infinity, getNorm=Infinity, getSparsity=1.0, isInfinite=t...#217#-1471686217", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getData=[1.0, Infinity, -Infinity], getDimension=3, getL1Norm=Infinity, getLInfNorm=Infinity, getMaxIndex=1, getMaxValue=Infinity, getMinIndex=2, getMinValue=-Infinity, getNorm=Infinity, getSparsity=...#234#-614213921", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput004() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math.linear.OpenMapRealVector", "org.apache.commons.math.linear.OpenMapRealVector", "subtract", new String[]{"org.apache.commons.math.linear.RealVector"}, new String[]{"<sample:6>"}, false, 12, new String[][]{{"org.apache.commons.math.linear.OpenMapRealVector", "setSubVector", "int,double[]", "-2147483648", "<null>"}, {"org.apache.commons.math.linear.OpenMapRealVector", "getDistance", "org.apache.commons.math.linear.OpenMapRealVector", "<sample:7>"}, {"org.apache.commons.math.linear.OpenMapRealVector", "append", "double", "1.7976931348623157E308"}}), new String[][]{{"getMinIndex", "", "6"}, {"mapDivide", "double", "7"}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.math.linear.OpenMapRealVector", actual.getClass().getName());
  assertEquals("{getData=[], getDimension=0, getL1Norm=0.0, getLInfNorm=0.0, getMaxIndex=-1, getMaxValue=NaN, getMinIndex=-1, getMinValue=NaN, getNorm=0.0, getSparsity=NaN, isInfinite=false, isNaN=false}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getData=[], getDimension=0, getL1Norm=0.0, getLInfNorm=0.0, getMaxIndex=-1, getMaxValue=NaN, getMinIndex=-1, getMinValue=NaN, getNorm=0.0, getSparsity=NaN, isInfinite=false, isNaN=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput005() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math.linear.OpenMapRealVector", "org.apache.commons.math.linear.OpenMapRealVector", "sparseIterator", new String[]{}, new String[]{}, false, 12, new String[][]{{"org.apache.commons.math.linear.OpenMapRealVector", "map", "org.apache.commons.math.analysis.UnivariateRealFunction", "<sample:2>"}}), new String[][]{{"remove", "", "6"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.UnsupportedOperationException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput006() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.linear.OpenMapRealVector", "org.apache.commons.math.linear.OpenMapRealVector", "getMinIndex", new String[]{}, new String[]{}, false, 9, new String[][]{{"org.apache.commons.math.linear.OpenMapRealVector", "equals", "java.lang.Object", "<sample:0>"}, {"org.apache.commons.math.linear.OpenMapRealVector", "cosine", "org.apache.commons.math.linear.RealVector", "<sample:6>"}, {"org.apache.commons.math.linear.OpenMapRealVector", "mapDivide", "double", "4.3861113477903539E18"}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("6", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getData=[0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0], getDimension=7, getL1Norm=0.0, getLInfNorm=0.0, getMaxIndex=6, getMaxValue=0.0, getMinIndex=6, getMinValue=0.0, getNorm=0.0, getSparsity=0.0, isInfinite=f...#218#917164721", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput007() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math.linear.OpenMapRealVector", "org.apache.commons.math.linear.OpenMapRealVector", "mapSubtract", new String[]{"double"}, new String[]{"4.386111347790355E19"}, false, 2, new String[][]{{"org.apache.commons.math.linear.OpenMapRealVector", "ebeMultiply", "org.apache.commons.math.linear.RealVector", "<sample:3>"}, {"org.apache.commons.math.linear.OpenMapRealVector", "isDefaultValue", "double", "-4.9E-324"}}, 1), new String[][]{{"projection", "double[]", "6"}, {"ebeDivide", "double[]", "6"}, {"append", "org.apache.commons.math.linear.OpenMapRealVector", "2"}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.math.linear.OpenMapRealVector", actual.getClass().getName());
  assertEquals("{getData=[NaN, 0.0], getDimension=2, getL1Norm=NaN, getLInfNorm=NaN, getMaxIndex=1, getMaxValue=0.0, getMinIndex=1, getMinValue=0.0, getNorm=NaN, getSparsity=0.5, isInfinite=false, isNaN=true}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getData=[0.0], getDimension=1, getL1Norm=0.0, getLInfNorm=0.0, getMaxIndex=0, getMaxValue=0.0, getMinIndex=0, getMinValue=0.0, getNorm=0.0, getSparsity=0.0, isInfinite=false, isNaN=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput008() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math.linear.OpenMapRealVector", "org.apache.commons.math.linear.OpenMapRealVector", "subtract", new String[]{"org.apache.commons.math.linear.RealVector"}, new String[]{"<sample:4>"}, false, 12, new String[][]{{"org.apache.commons.math.linear.OpenMapRealVector", "getL1Distance", "org.apache.commons.math.linear.RealVector", "<sample:6>"}, {"org.apache.commons.math.linear.OpenMapRealVector", "checkVectorDimensions", "org.apache.commons.math.linear.RealVector", "<sample:3>"}, {"org.apache.commons.math.linear.OpenMapRealVector", "getDistance", "org.apache.commons.math.linear.RealVector", "<sample:8>"}}, 3), new String[][]{{"combine", "double,double,double[]", "0"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("org.apache.commons.math.exception.DimensionMismatchException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput009() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.linear.OpenMapRealVector", "org.apache.commons.math.linear.OpenMapRealVector", "getSparsity", new String[]{}, new String[]{}, false, 3, new String[][]{{"org.apache.commons.math.linear.OpenMapRealVector", "ebeMultiply", "org.apache.commons.math.linear.RealVector", "<sample:5>"}});
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("1.0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getData=[-Infinity, -1.0], getDimension=2, getL1Norm=Infinity, getLInfNorm=Infinity, getMaxIndex=1, getMaxValue=-1.0, getMinIndex=0, getMinValue=-Infinity, getNorm=Infinity, getSparsity=1.0, isInfini...#221#-774438889", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput010() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math.linear.OpenMapRealVector", "org.apache.commons.math.linear.OpenMapRealVector", "mapSubtractToSelf", new String[]{"double"}, new String[]{"-1.28"}, false, 1, new String[][]{{"org.apache.commons.math.linear.OpenMapRealVector", "toArray", ""}, {"org.apache.commons.math.linear.OpenMapRealVector", "cosine", "org.apache.commons.math.linear.RealVector", "<sample:7>"}}), new String[][]{{"add", "org.apache.commons.math.linear.OpenMapRealVector", "7"}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.math.linear.OpenMapRealVector", actual.getClass().getName());
  assertEquals("{getData=[Infinity, NaN, -Infinity], getDimension=3, getL1Norm=NaN, getLInfNorm=NaN, getMaxIndex=0, getMaxValue=Infinity, getMinIndex=2, getMinValue=-Infinity, getNorm=NaN, getSparsity=1.0, isInfinite...#219#-1257614215", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getData=[2.2800000000000002, Infinity, -Infinity], getDimension=3, getL1Norm=Infinity, getLInfNorm=Infinity, getMaxIndex=1, getMaxValue=Infinity, getMinIndex=2, getMinValue=-Infinity, getNorm=Infinit...#249#4297800", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput011() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math.linear.OpenMapRealVector", "org.apache.commons.math.linear.OpenMapRealVector", "mapSubtractToSelf", new String[]{"double"}, new String[]{"1.0"}, false, 1, new String[][]{{"org.apache.commons.math.linear.OpenMapRealVector", "subtract", "org.apache.commons.math.linear.RealVector", "<sample:0>"}, {"org.apache.commons.math.linear.OpenMapRealVector", "toArray", ""}, {"org.apache.commons.math.linear.OpenMapRealVector", "cosine", "double[]", "<null>"}}), new String[][]{{"add", "org.apache.commons.math.linear.OpenMapRealVector", "7"}, {"combine", "double,double,org.apache.commons.math.linear.RealVector", "2"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("org.apache.commons.math.exception.DimensionMismatchException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput012() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.linear.OpenMapRealVector", "org.apache.commons.math.linear.OpenMapRealVector", "isNaN", new String[]{}, new String[]{}, false, 13, new String[][]{{"org.apache.commons.math.linear.OpenMapRealVector", "subtract", "org.apache.commons.math.linear.OpenMapRealVector", "<sample:1>"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getData=[-Infinity, -1.0, 0.0], getDimension=3, getL1Norm=Infinity, getLInfNorm=Infinity, getMaxIndex=2, getMaxValue=0.0, getMinIndex=0, getMinValue=-Infinity, getNorm=Infinity, getSparsity=0.6666666...#240#-1938213248", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput013() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.linear.OpenMapRealVector", "org.apache.commons.math.linear.OpenMapRealVector", "checkIndex", new String[]{"int"}, new String[]{"1"}, false, 13, new String[][]{{"org.apache.commons.math.linear.OpenMapRealVector", "append", "org.apache.commons.math.linear.OpenMapRealVector", "<sample:4>"}, {"org.apache.commons.math.linear.OpenMapRealVector", "add", "org.apache.commons.math.linear.OpenMapRealVector", "<sample:1>"}, {"org.apache.commons.math.linear.OpenMapRealVector", "setSubVector", "int,org.apache.commons.math.linear.RealVector", "0", "<sample:5>"}}, 2);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getData=[-1.0, 0.0, 1.0], getDimension=3, getL1Norm=2.0, getLInfNorm=1.0, getMaxIndex=2, getMaxValue=1.0, getMinIndex=0, getMinValue=-1.0, getNorm=1.4142135623730951, getSparsity=0.6666666666666666, ...#230#-54966727", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput014() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.linear.OpenMapRealVector", "org.apache.commons.math.linear.OpenMapRealVector", "ebeMultiply", new String[]{"double[]"}, new String[]{"<sample:8>"}, false, 4, new String[][]{{"org.apache.commons.math.linear.OpenMapRealVector", "subtract", "org.apache.commons.math.linear.OpenMapRealVector", "<sample:4>"}, {"org.apache.commons.math.linear.OpenMapRealVector", "getLInfDistance", "double[]", "<sample:5>"}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.math.linear.OpenMapRealVector", actual.getClass().getName());
  assertEquals("{getData=[-Infinity, Infinity, 1.0], getDimension=3, getL1Norm=Infinity, getLInfNorm=Infinity, getMaxIndex=1, getMaxValue=Infinity, getMinIndex=0, getMinValue=-Infinity, getNorm=Infinity, getSparsity=...#234#-209558883", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getData=[-1.0, -1.0, -1.0], getDimension=3, getL1Norm=3.0, getLInfNorm=1.0, getMaxIndex=2, getMaxValue=-1.0, getMinIndex=2, getMinValue=-1.0, getNorm=1.7320508075688772, getSparsity=1.0, isInfinite=f...#218#-325937176", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput015() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math.linear.OpenMapRealVector", "org.apache.commons.math.linear.OpenMapRealVector", "add", new String[]{"org.apache.commons.math.linear.RealVector"}, new String[]{"<sample:6>"}, false, 0, new String[][]{{"org.apache.commons.math.linear.OpenMapRealVector", "getLInfDistance", "org.apache.commons.math.linear.RealVector", "<sample:6>"}}), new String[][]{{"append", "double", "1"}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.math.linear.ArrayRealVector", actual.getClass().getName());
  assertEquals("{-1} {getData=[-1.0], getDataRef=[-1.0], getDimension=1, getL1Norm=1.0, getLInfNorm=1.0, getMaxIndex=0, getMaxValue=-1.0, getMinIndex=0, getMinValue=-1.0, getNorm=1.0, isInfinite=false, isNaN=false}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getData=[], getDimension=0, getL1Norm=0.0, getLInfNorm=0.0, getMaxIndex=-1, getMaxValue=NaN, getMinIndex=-1, getMinValue=NaN, getNorm=0.0, getSparsity=NaN, isInfinite=false, isNaN=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput016() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math.linear.OpenMapRealVector", "org.apache.commons.math.linear.OpenMapRealVector", "copy", new String[]{}, new String[]{}, false, 15, new String[][]{{"org.apache.commons.math.linear.OpenMapRealVector", "getL1Norm", ""}, {"org.apache.commons.math.linear.OpenMapRealVector", "getMaxValue", ""}, {"org.apache.commons.math.linear.OpenMapRealVector", "unitize", ""}}, 1), new String[][]{{"projection", "double[]", "4"}, {"mapAdd", "double", "2"}, {"mapAdd", "double", "6"}, {"getEntry", "int", "3"}});
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("-1.0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getData=[0.0, 1.0], getDimension=2, getL1Norm=1.0, getLInfNorm=1.0, getMaxIndex=1, getMaxValue=1.0, getMinIndex=0, getMinValue=0.0, getNorm=1.0, getSparsity=0.5, isInfinite=false, isNaN=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput017() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math.linear.OpenMapRealVector", "org.apache.commons.math.linear.OpenMapRealVector", "append", new String[]{"org.apache.commons.math.linear.RealVector"}, new String[]{"<sample:3>"}, false, 4, new String[][]{{"org.apache.commons.math.linear.OpenMapRealVector", "getSubVector", "int,int", "1", "0"}, {"org.apache.commons.math.linear.OpenMapRealVector", "outerProduct", "double[]", "<sample:5>"}, {"org.apache.commons.math.linear.OpenMapRealVector", "getDistance", "double[]", "<sample:5>"}}, 3), new String[][]{{"getL1Distance", "org.apache.commons.math.linear.OpenMapRealVector", "6"}});
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("Infinity", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getData=[-1.0, -1.0, -1.0], getDimension=3, getL1Norm=3.0, getLInfNorm=1.0, getMaxIndex=2, getMaxValue=-1.0, getMinIndex=2, getMinValue=-1.0, getNorm=1.7320508075688772, getSparsity=1.0, isInfinite=f...#218#-325937176", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput018() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.linear.OpenMapRealVector", "org.apache.commons.math.linear.OpenMapRealVector", "getMinIndex", new String[]{}, new String[]{}, false, 40, new String[][]{{"org.apache.commons.math.linear.OpenMapRealVector", "mapMultiplyToSelf", "double", "NaN"}, {"org.apache.commons.math.linear.OpenMapRealVector", "mapToSelf", "org.apache.commons.math.analysis.UnivariateRealFunction", "<sample:4>"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("-1", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getData=?, getDimension=1000, getL1Norm=NaN, getLInfNorm=NaN, getMaxIndex=-1, getMaxValue=NaN, getMinIndex=-1, getMinValue=NaN, getNorm=NaN, getSparsity=1.0, isInfinite=false, isNaN=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput019() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math.linear.OpenMapRealVector", "org.apache.commons.math.linear.OpenMapRealVector", "ebeDivide", new String[]{"org.apache.commons.math.linear.RealVector"}, new String[]{"<sample:5>"}, false, 15, new String[][]{{"org.apache.commons.math.linear.OpenMapRealVector", "sparseIterator", ""}}), new String[][]{{"mapSubtract", "double", "5"}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.math.linear.OpenMapRealVector", actual.getClass().getName());
  assertEquals("{getData=[Infinity, Infinity], getDimension=2, getL1Norm=Infinity, getLInfNorm=Infinity, getMaxIndex=1, getMaxValue=Infinity, getMinIndex=1, getMinValue=Infinity, getNorm=Infinity, getSparsity=1.0, is...#227#1333557788", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getData=[0.0, 1.0], getDimension=2, getL1Norm=1.0, getLInfNorm=1.0, getMaxIndex=1, getMaxValue=1.0, getMinIndex=0, getMinValue=0.0, getNorm=1.0, getSparsity=0.5, isInfinite=false, isNaN=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput020() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.linear.OpenMapRealVector", "org.apache.commons.math.linear.OpenMapRealVector", "getL1Distance", new String[]{"double[]"}, new String[]{"<sample:2>"}, false, 7, new String[][]{{"org.apache.commons.math.linear.OpenMapRealVector", "cosine", "double[]", "<sample:5>"}});
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("Infinity", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getData=[Infinity, -Infinity, 0.0], getDimension=3, getL1Norm=Infinity, getLInfNorm=Infinity, getMaxIndex=0, getMaxValue=Infinity, getMinIndex=1, getMinValue=-Infinity, getNorm=Infinity, getSparsity=...#249#903803555", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput021() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math.linear.OpenMapRealVector", "org.apache.commons.math.linear.OpenMapRealVector", "append", new String[]{"org.apache.commons.math.linear.RealVector"}, new String[]{"<sample:1>"}, false, 4, new String[][]{{"org.apache.commons.math.linear.OpenMapRealVector", "set", "double", "2.74131959236897056E17"}, {"org.apache.commons.math.linear.OpenMapRealVector", "ebeMultiply", "double[]", "<sample:5>"}, {"org.apache.commons.math.linear.OpenMapRealVector", "getDistance", "org.apache.commons.math.linear.OpenMapRealVector", "<sample:1>"}}, 3), new String[][]{{"sparseIterator", "", "7"}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.math.linear.OpenMapRealVector$OpenMapSparseIterator", actual.getClass().getName());
  assertEquals("{hasNext=true}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getData=[2.74131959236897056E17, 2.74131959236897056E17, 2.741319592.., getDimension=3, getL1Norm=8.223958777106912E17, getLInfNorm=2.74131959236897056E17, getMaxIndex=2, getMaxValue=2.74131959236897...#337#1624810795", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput022() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math.linear.OpenMapRealVector", "org.apache.commons.math.linear.OpenMapRealVector", "dotProduct", new String[]{"double[]"}, new String[]{"<sample:1>"}, false, 0, new String[][]{{"org.apache.commons.math.linear.OpenMapRealVector", "getMaxIndex", ""}}, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("org.apache.commons.math.exception.DimensionMismatchException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput023() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math.linear.OpenMapRealVector", "org.apache.commons.math.linear.OpenMapRealVector", "append", new String[]{"org.apache.commons.math.linear.RealVector"}, new String[]{"<sample:3>"}, false, 4, new String[][]{{"org.apache.commons.math.linear.OpenMapRealVector", "sparseIterator", ""}, {"org.apache.commons.math.linear.OpenMapRealVector", "cosine", "double[]", "<sample:10>"}}, 1), new String[][]{{"combine", "double,double,double[]", "5"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("org.apache.commons.math.exception.DimensionMismatchException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput024() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.linear.OpenMapRealVector", "org.apache.commons.math.linear.OpenMapRealVector", "getL1Distance", new String[]{"org.apache.commons.math.linear.OpenMapRealVector"}, new String[]{"<sample:3>"}, false, 7, new String[][]{{"org.apache.commons.math.linear.OpenMapRealVector", "subtract", "double[]", "<sample:8>"}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("Infinity", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getData=[Infinity, -Infinity, 0.0], getDimension=3, getL1Norm=Infinity, getLInfNorm=Infinity, getMaxIndex=0, getMaxValue=Infinity, getMinIndex=1, getMinValue=-Infinity, getNorm=Infinity, getSparsity=...#249#903803555", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput025() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math.linear.OpenMapRealVector", "org.apache.commons.math.linear.OpenMapRealVector", "getL1Distance", new String[]{"org.apache.commons.math.linear.OpenMapRealVector"}, new String[]{"<sample:2>"}, false, 7, new String[][]{}, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("org.apache.commons.math.exception.OutOfRangeException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput026() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.linear.OpenMapRealVector", "org.apache.commons.math.linear.OpenMapRealVector", "getL1Distance", new String[]{"org.apache.commons.math.linear.OpenMapRealVector"}, new String[]{"<sample:4>"}, false, 3, new String[][]{}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("Infinity", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getData=[-Infinity, -1.0], getDimension=2, getL1Norm=Infinity, getLInfNorm=Infinity, getMaxIndex=1, getMaxValue=-1.0, getMinIndex=0, getMinValue=-Infinity, getNorm=Infinity, getSparsity=1.0, isInfini...#221#-774438889", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput027() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.linear.OpenMapRealVector", "org.apache.commons.math.linear.OpenMapRealVector", "getL1Distance", new String[]{"org.apache.commons.math.linear.OpenMapRealVector"}, new String[]{"<sample:3>"}, false, 3, new String[][]{}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("NaN", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getData=[-Infinity, -1.0], getDimension=2, getL1Norm=Infinity, getLInfNorm=Infinity, getMaxIndex=1, getMaxValue=-1.0, getMinIndex=0, getMinValue=-Infinity, getNorm=Infinity, getSparsity=1.0, isInfini...#221#-774438889", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput028() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.linear.OpenMapRealVector", "org.apache.commons.math.linear.OpenMapRealVector", "getL1Distance", new String[]{"org.apache.commons.math.linear.OpenMapRealVector"}, new String[]{"<sample:4>"}, false, 3, new String[][]{{"org.apache.commons.math.linear.OpenMapRealVector", "mapSubtractToSelf", "double", "8772222695580707260"}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("Infinity", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getData=[-Infinity, -8.7722226955807068E18], getDimension=2, getL1Norm=Infinity, getLInfNorm=Infinity, getMaxIndex=1, getMaxValue=-8.7722226955807068E18, getMinIndex=0, getMinValue=-Infinity, getNorm...#257#394189105", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput029() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math.linear.OpenMapRealVector", "org.apache.commons.math.linear.OpenMapRealVector", "getSubVector", new String[]{"int", "int"}, new String[]{"1", "-1"}, false, 0, null, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("org.apache.commons.math.exception.OutOfRangeException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput030() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math.linear.OpenMapRealVector", "org.apache.commons.math.linear.OpenMapRealVector", "add", new String[]{"org.apache.commons.math.linear.OpenMapRealVector"}, new String[]{"<sample:0>"}, false, 0, null, 3), new String[][]{{"mapAdd", "double", "5"}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.math.linear.OpenMapRealVector", actual.getClass().getName());
  assertEquals("{getData=[], getDimension=0, getL1Norm=0.0, getLInfNorm=0.0, getMaxIndex=-1, getMaxValue=NaN, getMinIndex=-1, getMinValue=NaN, getNorm=0.0, getSparsity=NaN, isInfinite=false, isNaN=false}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getData=[], getDimension=0, getL1Norm=0.0, getLInfNorm=0.0, getMaxIndex=-1, getMaxValue=NaN, getMinIndex=-1, getMinValue=NaN, getNorm=0.0, getSparsity=NaN, isInfinite=false, isNaN=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput031() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math.linear.OpenMapRealVector", "org.apache.commons.math.linear.OpenMapRealVector", "add", new String[]{"org.apache.commons.math.linear.OpenMapRealVector"}, new String[]{"<sample:1>"}, false, 0, null, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("org.apache.commons.math.exception.DimensionMismatchException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput032() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.linear.OpenMapRealVector", "org.apache.commons.math.linear.OpenMapRealVector", "equals", new String[]{"java.lang.Object"}, new String[]{"<null>"}, false, 0, null, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getData=[], getDimension=0, getL1Norm=0.0, getLInfNorm=0.0, getMaxIndex=-1, getMaxValue=NaN, getMinIndex=-1, getMinValue=NaN, getNorm=0.0, getSparsity=NaN, isInfinite=false, isNaN=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput033() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.linear.OpenMapRealVector", "org.apache.commons.math.linear.OpenMapRealVector", "equals", new String[]{"java.lang.Object"}, new String[]{"<s:>"}, false, 0, new String[][]{{"org.apache.commons.math.linear.OpenMapRealVector", "subtract", "org.apache.commons.math.linear.OpenMapRealVector", "<sample:5>"}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getData=[], getDimension=0, getL1Norm=0.0, getLInfNorm=0.0, getMaxIndex=-1, getMaxValue=NaN, getMinIndex=-1, getMinValue=NaN, getNorm=0.0, getSparsity=NaN, isInfinite=false, isNaN=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput034() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.linear.OpenMapRealVector", "org.apache.commons.math.linear.OpenMapRealVector", "getData", new String[]{}, new String[]{}, false, 0, null, 2);
  assertNotNull(actual);
  assertEquals("[D", actual.getClass().getName());
  assertEquals("[]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getData=[], getDimension=0, getL1Norm=0.0, getLInfNorm=0.0, getMaxIndex=-1, getMaxValue=NaN, getMinIndex=-1, getMinValue=NaN, getNorm=0.0, getSparsity=NaN, isInfinite=false, isNaN=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput035() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math.linear.OpenMapRealVector", "org.apache.commons.math.linear.OpenMapRealVector", "getL1Distance", new String[]{"org.apache.commons.math.linear.RealVector"}, new String[]{"<sample:2>"}, false, 2, new String[][]{{"org.apache.commons.math.linear.OpenMapRealVector", "checkVectorDimensions", "org.apache.commons.math.linear.RealVector", "<sample:0>"}, {"org.apache.commons.math.linear.OpenMapRealVector", "unitize", ""}}, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("org.apache.commons.math.exception.DimensionMismatchException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput036() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.linear.OpenMapRealVector", "org.apache.commons.math.linear.OpenMapRealVector", "hashCode", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.math.linear.OpenMapRealVector", "ebeDivide", "org.apache.commons.math.linear.RealVector", "<sample:3>"}, {"org.apache.commons.math.linear.OpenMapRealVector", "unitVector", ""}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("-818727111", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getData=[], getDimension=0, getL1Norm=0.0, getLInfNorm=0.0, getMaxIndex=-1, getMaxValue=NaN, getMinIndex=-1, getMinValue=NaN, getNorm=0.0, getSparsity=NaN, isInfinite=false, isNaN=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput037() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.linear.OpenMapRealVector", "org.apache.commons.math.linear.OpenMapRealVector", "hashCode", new String[]{}, new String[]{}, false, 2, new String[][]{{"org.apache.commons.math.linear.OpenMapRealVector", "ebeDivide", "org.apache.commons.math.linear.RealVector", "<sample:4>"}, {"org.apache.commons.math.linear.OpenMapRealVector", "unitVector", ""}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("-818727110", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getData=[0.0], getDimension=1, getL1Norm=0.0, getLInfNorm=0.0, getMaxIndex=0, getMaxValue=0.0, getMinIndex=0, getMinValue=0.0, getNorm=0.0, getSparsity=0.0, isInfinite=false, isNaN=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput038() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.linear.OpenMapRealVector", "org.apache.commons.math.linear.OpenMapRealVector", "mapDivideToSelf", new String[]{"double"}, new String[]{"Infinity"}, false, 7, new String[][]{{"org.apache.commons.math.linear.OpenMapRealVector", "map", "org.apache.commons.math.analysis.UnivariateRealFunction", "<sample:6>"}, {"org.apache.commons.math.linear.OpenMapRealVector", "outerProduct", "double[]", "<sample:5>"}}, 1);
  assertNotNull(actual);
  assertEquals("org.apache.commons.math.linear.OpenMapRealVector", actual.getClass().getName());
  assertEquals("{getData=[NaN, NaN, 0.0], getDimension=3, getL1Norm=NaN, getLInfNorm=NaN, getMaxIndex=2, getMaxValue=0.0, getMinIndex=2, getMinValue=0.0, getNorm=NaN, getSparsity=0.6666666666666666, isInfinite=false,...#212#587238529", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getData=[NaN, NaN, 0.0], getDimension=3, getL1Norm=NaN, getLInfNorm=NaN, getMaxIndex=2, getMaxValue=0.0, getMinIndex=2, getMinValue=0.0, getNorm=NaN, getSparsity=0.6666666666666666, isInfinite=false,...#212#587238529", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput039() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math.linear.OpenMapRealVector", "org.apache.commons.math.linear.OpenMapRealVector", "mapDivideToSelf", new String[]{"double"}, new String[]{"Infinity"}, false, 7, new String[][]{{"org.apache.commons.math.linear.OpenMapRealVector", "isNaN", ""}, {"org.apache.commons.math.linear.OpenMapRealVector", "outerProduct", "double[]", "<sample:5>"}}, 1), new String[][]{{"mapMultiply", "double", "3"}, {"projection", "org.apache.commons.math.linear.RealVector", "7"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("org.apache.commons.math.exception.DimensionMismatchException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput040() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math.linear.OpenMapRealVector", "org.apache.commons.math.linear.OpenMapRealVector", "unitVector", new String[]{}, new String[]{}, false, 10, new String[][]{{"org.apache.commons.math.linear.OpenMapRealVector", "ebeDivide", "org.apache.commons.math.linear.RealVector", "<sample:4>"}, {"org.apache.commons.math.linear.OpenMapRealVector", "dotProduct", "org.apache.commons.math.linear.RealVector", "<sample:0>"}}, 3), new String[][]{{"mapMultiply", "double", "4"}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.math.linear.OpenMapRealVector", actual.getClass().getName());
  assertEquals("{getData=[NaN, NaN, NaN], getDimension=3, getL1Norm=NaN, getLInfNorm=NaN, getMaxIndex=-1, getMaxValue=NaN, getMinIndex=-1, getMinValue=NaN, getNorm=NaN, getSparsity=1.0, isInfinite=false, isNaN=true}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getData=[0.0, 1.0, Infinity], getDimension=3, getL1Norm=Infinity, getLInfNorm=Infinity, getMaxIndex=2, getMaxValue=Infinity, getMinIndex=0, getMinValue=0.0, getNorm=Infinity, getSparsity=1.0, isInfin...#222#1305061558", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput041() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math.linear.OpenMapRealVector", "org.apache.commons.math.linear.OpenMapRealVector", "unitVector", new String[]{}, new String[]{}, false, 11, new String[][]{{"org.apache.commons.math.linear.OpenMapRealVector", "ebeDivide", "org.apache.commons.math.linear.RealVector", "<sample:4>"}, {"org.apache.commons.math.linear.OpenMapRealVector", "dotProduct", "org.apache.commons.math.linear.RealVector", "<sample:0>"}}, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("org.apache.commons.math.exception.MathArithmeticException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput042() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math.linear.OpenMapRealVector", "org.apache.commons.math.linear.OpenMapRealVector", "unitVector", new String[]{}, new String[]{}, false, 12, new String[][]{{"org.apache.commons.math.linear.OpenMapRealVector", "set", "double", "Infinity"}, {"org.apache.commons.math.linear.OpenMapRealVector", "ebeDivide", "org.apache.commons.math.linear.RealVector", "<sample:4>"}, {"org.apache.commons.math.linear.OpenMapRealVector", "dotProduct", "org.apache.commons.math.linear.RealVector", "<sample:0>"}}, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("org.apache.commons.math.exception.MathArithmeticException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput043() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math.linear.OpenMapRealVector", "org.apache.commons.math.linear.OpenMapRealVector", "unitVector", new String[]{}, new String[]{}, false, 13, new String[][]{{"org.apache.commons.math.linear.OpenMapRealVector", "ebeDivide", "org.apache.commons.math.linear.RealVector", "<sample:4>"}}, 3), new String[][]{{"mapMultiply", "double", "4"}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.math.linear.OpenMapRealVector", actual.getClass().getName());
  assertEquals("{getData=[NaN, NaN, NaN], getDimension=3, getL1Norm=NaN, getLInfNorm=NaN, getMaxIndex=-1, getMaxValue=NaN, getMinIndex=-1, getMinValue=NaN, getNorm=NaN, getSparsity=1.0, isInfinite=false, isNaN=true}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getData=[-Infinity, -1.0, 0.0], getDimension=3, getL1Norm=Infinity, getLInfNorm=Infinity, getMaxIndex=2, getMaxValue=0.0, getMinIndex=0, getMinValue=-Infinity, getNorm=Infinity, getSparsity=0.6666666...#240#-1938213248", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput044() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.linear.OpenMapRealVector", "org.apache.commons.math.linear.OpenMapRealVector", "unitVector", new String[]{}, new String[]{}, false, 13, new String[][]{{"org.apache.commons.math.linear.OpenMapRealVector", "ebeDivide", "org.apache.commons.math.linear.RealVector", "<sample:4>"}}, 3);
  assertNotNull(actual);
  assertEquals("org.apache.commons.math.linear.OpenMapRealVector", actual.getClass().getName());
  assertEquals("{getData=[NaN, -0.0, 0.0], getDimension=3, getL1Norm=NaN, getLInfNorm=NaN, getMaxIndex=2, getMaxValue=0.0, getMinIndex=2, getMinValue=0.0, getNorm=NaN, getSparsity=0.6666666666666666, isInfinite=false...#213#317647523", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getData=[-Infinity, -1.0, 0.0], getDimension=3, getL1Norm=Infinity, getLInfNorm=Infinity, getMaxIndex=2, getMaxValue=0.0, getMinIndex=0, getMinValue=-Infinity, getNorm=Infinity, getSparsity=0.6666666...#240#-1938213248", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput045() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math.linear.OpenMapRealVector", "org.apache.commons.math.linear.OpenMapRealVector", "unitVector", new String[]{}, new String[]{}, false, 15, new String[][]{{"org.apache.commons.math.linear.OpenMapRealVector", "ebeDivide", "org.apache.commons.math.linear.RealVector", "<sample:4>"}}, 3), new String[][]{{"mapMultiply", "double", "4"}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.math.linear.OpenMapRealVector", actual.getClass().getName());
  assertEquals("{getData=[NaN, Infinity], getDimension=2, getL1Norm=NaN, getLInfNorm=NaN, getMaxIndex=1, getMaxValue=Infinity, getMinIndex=1, getMinValue=Infinity, getNorm=NaN, getSparsity=1.0, isInfinite=false, isNa...#207#1800204032", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getData=[0.0, 1.0], getDimension=2, getL1Norm=1.0, getLInfNorm=1.0, getMaxIndex=1, getMaxValue=1.0, getMinIndex=0, getMinValue=0.0, getNorm=1.0, getSparsity=0.5, isInfinite=false, isNaN=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput046() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.linear.OpenMapRealVector", "org.apache.commons.math.linear.OpenMapRealVector", "unitVector", new String[]{}, new String[]{}, false, 15, new String[][]{}, 3);
  assertNotNull(actual);
  assertEquals("org.apache.commons.math.linear.OpenMapRealVector", actual.getClass().getName());
  assertEquals("{getData=[0.0, 1.0], getDimension=2, getL1Norm=1.0, getLInfNorm=1.0, getMaxIndex=1, getMaxValue=1.0, getMinIndex=0, getMinValue=0.0, getNorm=1.0, getSparsity=0.5, isInfinite=false, isNaN=false}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getData=[0.0, 1.0], getDimension=2, getL1Norm=1.0, getLInfNorm=1.0, getMaxIndex=1, getMaxValue=1.0, getMinIndex=0, getMinValue=0.0, getNorm=1.0, getSparsity=0.5, isInfinite=false, isNaN=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput047() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.linear.OpenMapRealVector", "org.apache.commons.math.linear.OpenMapRealVector", "unitVector", new String[]{}, new String[]{}, false, 16, new String[][]{}, 3);
  assertNotNull(actual);
  assertEquals("org.apache.commons.math.linear.OpenMapRealVector", actual.getClass().getName());
  assertEquals("{getData=[0.125, 0.125, 0.125, 0.125, 0.125, 0.125, 0.125, 0.125, 0.1.., getDimension=64, getL1Norm=8.0, getLInfNorm=0.125, getMaxIndex=63, getMaxValue=0.125, getMinIndex=63, getMinValue=0.125, getNor...#254#-936307946", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getData=[1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0,.., getDimension=64, getL1Norm=64.0, getLInfNorm=1.0, getMaxIndex=63, getMaxValue=1.0, getMinIndex=63, getMinValue=1.0, getNorm=8.0...#249#-1425301487", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput048() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.linear.OpenMapRealVector", "org.apache.commons.math.linear.OpenMapRealVector", "unitVector", new String[]{}, new String[]{}, false, 18, new String[][]{}, 3);
  assertNotNull(actual);
  assertEquals("org.apache.commons.math.linear.OpenMapRealVector", actual.getClass().getName());
  assertEquals("{getData=?, getDimension=258, getL1Norm=1.414213562373095, getLInfNorm=0.7071067811865475, getMaxIndex=2, getMaxValue=0.7071067811865475, getMinIndex=0, getMinValue=-0.7071067811865475, getNorm=0.9999...#278#-650579332", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getData=?, getDimension=258, getL1Norm=2.0, getLInfNorm=1.0, getMaxIndex=2, getMaxValue=1.0, getMinIndex=0, getMinValue=-1.0, getNorm=1.4142135623730951, getSparsity=0.011627906976744186, isInfinite=...#219#-163585121", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput049() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.linear.OpenMapRealVector", "org.apache.commons.math.linear.OpenMapRealVector", "unitVector", new String[]{}, new String[]{}, false, 19, new String[][]{}, 3);
  assertNotNull(actual);
  assertEquals("org.apache.commons.math.linear.OpenMapRealVector", actual.getClass().getName());
  assertEquals("{getData=[-0.7071067811865475, 0.0, 0.7071067811865475], getDimension=3, getL1Norm=1.414213562373095, getLInfNorm=0.7071067811865475, getMaxIndex=2, getMaxValue=0.7071067811865475, getMinIndex=0, getM...#304#-539593399", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getData=[-1.0, 0.0, 1.0], getDimension=3, getL1Norm=2.0, getLInfNorm=1.0, getMaxIndex=2, getMaxValue=1.0, getMinIndex=0, getMinValue=-1.0, getNorm=1.4142135623730951, getSparsity=1.0, isInfinite=fals...#215#-341311620", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput050() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.linear.OpenMapRealVector", "org.apache.commons.math.linear.OpenMapRealVector", "unitVector", new String[]{}, new String[]{}, false, 20, new String[][]{}, 3);
  assertNotNull(actual);
  assertEquals("org.apache.commons.math.linear.OpenMapRealVector", actual.getClass().getName());
  assertEquals("{getData=?, getDimension=256, getL1Norm=0.0, getLInfNorm=0.0, getMaxIndex=255, getMaxValue=0.0, getMinIndex=255, getMinValue=0.0, getNorm=0.0, getSparsity=0.0, isInfinite=false, isNaN=false}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getData=?, getDimension=256, getL1Norm=0.0, getLInfNorm=0.0, getMaxIndex=255, getMaxValue=0.0, getMinIndex=255, getMinValue=0.0, getNorm=0.0, getSparsity=0.0, isInfinite=false, isNaN=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput051() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math.linear.OpenMapRealVector", "org.apache.commons.math.linear.OpenMapRealVector", "add", new String[]{"org.apache.commons.math.linear.OpenMapRealVector"}, new String[]{"<sample:6>"}, false, 6, new String[][]{{"org.apache.commons.math.linear.OpenMapRealVector", "copy", ""}, {"org.apache.commons.math.linear.OpenMapRealVector", "append", "double", "5.0E-13"}, {"org.apache.commons.math.linear.OpenMapRealVector", "setSubVector", "int,org.apache.commons.math.linear.RealVector", "2147483647", "<sample:7>"}}, 2), new String[][]{{"mapSubtractToSelf", "double", "6"}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.math.linear.OpenMapRealVector", actual.getClass().getName());
  assertEquals("{getData=[Infinity, -Infinity, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0], getDimension=8, getL1Norm=Infinity, getLInfNorm=Infinity, getMaxIndex=0, getMaxValue=Infinity, getMinIndex=1, getMinValue=-Infinity, getNo...#260#-518583913", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getData=[Infinity, -Infinity, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0], getDimension=8, getL1Norm=Infinity, getLInfNorm=Infinity, getMaxIndex=0, getMaxValue=Infinity, getMinIndex=1, getMinValue=-Infinity, getNo...#260#-518583913", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput052() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math.linear.OpenMapRealVector", "org.apache.commons.math.linear.OpenMapRealVector", "add", new String[]{"org.apache.commons.math.linear.OpenMapRealVector"}, new String[]{"<sample:6>"}, false, 6, new String[][]{{"org.apache.commons.math.linear.OpenMapRealVector", "copy", ""}, {"org.apache.commons.math.linear.OpenMapRealVector", "append", "double", "5.0E-13"}, {"org.apache.commons.math.linear.OpenMapRealVector", "setSubVector", "int,org.apache.commons.math.linear.RealVector", "2147483647", "<sample:4>"}}, 3), new String[][]{{"setEntry", "int,double", "6"}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.math.linear.OpenMapRealVector", actual.getClass().getName());
  assertEquals("{getData=[Infinity, -Infinity, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0], getDimension=8, getL1Norm=Infinity, getLInfNorm=Infinity, getMaxIndex=0, getMaxValue=Infinity, getMinIndex=1, getMinValue=-Infinity, getNo...#260#-518583913", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getData=[Infinity, -Infinity, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0], getDimension=8, getL1Norm=Infinity, getLInfNorm=Infinity, getMaxIndex=0, getMaxValue=Infinity, getMinIndex=1, getMinValue=-Infinity, getNo...#260#-518583913", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput053() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math.linear.OpenMapRealVector", "org.apache.commons.math.linear.OpenMapRealVector", "add", new String[]{"org.apache.commons.math.linear.OpenMapRealVector"}, new String[]{"<null>"}, false, 6, new String[][]{{"org.apache.commons.math.linear.OpenMapRealVector", "append", "double", "2.5E-13"}, {"org.apache.commons.math.linear.OpenMapRealVector", "isNaN", ""}}, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput054() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math.linear.OpenMapRealVector", "org.apache.commons.math.linear.OpenMapRealVector", "projection", new String[]{"org.apache.commons.math.linear.RealVector"}, new String[]{"<sample:1>"}, false, 5, new String[][]{{"org.apache.commons.math.linear.OpenMapRealVector", "append", "double[]", "<null>"}, {"org.apache.commons.math.linear.OpenMapRealVector", "getMaxIndex", ""}}, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("org.apache.commons.math.exception.DimensionMismatchException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput055() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.linear.OpenMapRealVector", "org.apache.commons.math.linear.OpenMapRealVector", "projection", new String[]{"org.apache.commons.math.linear.RealVector"}, new String[]{"<sample:6>"}, false, 5, new String[][]{{"org.apache.commons.math.linear.OpenMapRealVector", "append", "double[]", "<empty>"}, {"org.apache.commons.math.linear.OpenMapRealVector", "getMaxIndex", ""}}, 1);
  assertNotNull(actual);
  assertEquals("org.apache.commons.math.linear.ArrayRealVector", actual.getClass().getName());
  assertEquals("{} {getData=[], getDataRef=[], getDimension=0, getL1Norm=0.0, getLInfNorm=0.0, getMaxIndex=-1, getMaxValue=NaN, getMinIndex=-1, getMinValue=NaN, getNorm=0.0, isInfinite=false, isNaN=false}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getData=[], getDimension=0, getL1Norm=0.0, getLInfNorm=0.0, getMaxIndex=-1, getMaxValue=NaN, getMinIndex=-1, getMinValue=NaN, getNorm=0.0, getSparsity=NaN, isInfinite=false, isNaN=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput056() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.linear.OpenMapRealVector", "org.apache.commons.math.linear.OpenMapRealVector", "projection", new String[]{"org.apache.commons.math.linear.RealVector"}, new String[]{"<sample:8>"}, false, 5, new String[][]{{"org.apache.commons.math.linear.OpenMapRealVector", "append", "double[]", "<empty>"}, {"org.apache.commons.math.linear.OpenMapRealVector", "getMaxIndex", ""}, {"org.apache.commons.math.linear.OpenMapRealVector", "mapSubtract", "double", "1.0E-12"}}, 2);
  assertNotNull(actual);
  assertEquals("org.apache.commons.math.linear.ArrayRealVector", actual.getClass().getName());
  assertEquals("{} {getData=[], getDataRef=[], getDimension=0, getL1Norm=0.0, getLInfNorm=0.0, getMaxIndex=-1, getMaxValue=NaN, getMinIndex=-1, getMinValue=NaN, getNorm=0.0, isInfinite=false, isNaN=false}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getData=[], getDimension=0, getL1Norm=0.0, getLInfNorm=0.0, getMaxIndex=-1, getMaxValue=NaN, getMinIndex=-1, getMinValue=NaN, getNorm=0.0, getSparsity=NaN, isInfinite=false, isNaN=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput057() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math.linear.OpenMapRealVector", "org.apache.commons.math.linear.OpenMapRealVector", "projection", new String[]{"org.apache.commons.math.linear.RealVector"}, new String[]{"<sample:7>"}, false, 5, new String[][]{{"org.apache.commons.math.linear.OpenMapRealVector", "append", "double[]", "<empty>"}, {"org.apache.commons.math.linear.OpenMapRealVector", "getMaxIndex", ""}, {"org.apache.commons.math.linear.OpenMapRealVector", "mapSubtract", "double", "1.0E-12"}}, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("org.apache.commons.math.exception.DimensionMismatchException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput058() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math.linear.OpenMapRealVector", "org.apache.commons.math.linear.OpenMapRealVector", "subtract", new String[]{"org.apache.commons.math.linear.RealVector"}, new String[]{"<sample:1>"}, false, 10, new String[][]{{"org.apache.commons.math.linear.OpenMapRealVector", "add", "double[]", "<null>"}, {"org.apache.commons.math.linear.OpenMapRealVector", "append", "double", "1.0E-12"}}, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("org.apache.commons.math.exception.DimensionMismatchException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput059() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math.linear.OpenMapRealVector", "org.apache.commons.math.linear.OpenMapRealVector", "subtract", new String[]{"org.apache.commons.math.linear.RealVector"}, new String[]{"<sample:0>"}, false, 10, new String[][]{{"org.apache.commons.math.linear.OpenMapRealVector", "add", "double[]", "<null>"}, {"org.apache.commons.math.linear.OpenMapRealVector", "getDistance", "org.apache.commons.math.linear.OpenMapRealVector", "<null>"}, {"org.apache.commons.math.linear.OpenMapRealVector", "append", "double", "1.0E-12"}}, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("org.apache.commons.math.exception.DimensionMismatchException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput060() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math.linear.OpenMapRealVector", "org.apache.commons.math.linear.OpenMapRealVector", "subtract", new String[]{"org.apache.commons.math.linear.RealVector"}, new String[]{"<sample:1>"}, false, 10, new String[][]{{"org.apache.commons.math.linear.OpenMapRealVector", "add", "double[]", "<null>"}, {"org.apache.commons.math.linear.OpenMapRealVector", "getDistance", "org.apache.commons.math.linear.OpenMapRealVector", "<sample:2>"}, {"org.apache.commons.math.linear.OpenMapRealVector", "append", "double", "1.7976931348623157E308"}}, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("org.apache.commons.math.exception.DimensionMismatchException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput061() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math.linear.OpenMapRealVector", "org.apache.commons.math.linear.OpenMapRealVector", "subtract", new String[]{"org.apache.commons.math.linear.RealVector"}, new String[]{"<sample:2>"}, false, 11, new String[][]{{"org.apache.commons.math.linear.OpenMapRealVector", "add", "double[]", "<null>"}, {"org.apache.commons.math.linear.OpenMapRealVector", "getDistance", "org.apache.commons.math.linear.OpenMapRealVector", "<sample:2>"}, {"org.apache.commons.math.linear.OpenMapRealVector", "append", "double", "1.7976931348623157E308"}}, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("org.apache.commons.math.exception.DimensionMismatchException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput062() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.linear.OpenMapRealVector", "org.apache.commons.math.linear.OpenMapRealVector", "getL1Distance", new String[]{"org.apache.commons.math.linear.RealVector"}, new String[]{"<sample:4>"}, false, 0, new String[][]{{"org.apache.commons.math.linear.OpenMapRealVector", "projection", "double[]", "<sample:8>"}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("0.0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getData=[], getDimension=0, getL1Norm=0.0, getLInfNorm=0.0, getMaxIndex=-1, getMaxValue=NaN, getMinIndex=-1, getMinValue=NaN, getNorm=0.0, getSparsity=NaN, isInfinite=false, isNaN=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput063() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math.linear.OpenMapRealVector", "org.apache.commons.math.linear.OpenMapRealVector", "subtract", new String[]{"org.apache.commons.math.linear.RealVector"}, new String[]{"<sample:6>"}, false, 12, new String[][]{{"org.apache.commons.math.linear.OpenMapRealVector", "setSubVector", "int,double[]", "-2147483648", "<null>"}, {"org.apache.commons.math.linear.OpenMapRealVector", "getDistance", "org.apache.commons.math.linear.OpenMapRealVector", "<sample:7>"}, {"org.apache.commons.math.linear.OpenMapRealVector", "append", "double", "1.7976931348623157E308"}}, 2), new String[][]{{"getMinIndex", "", "6"}, {"mapDivide", "double", "7"}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.math.linear.OpenMapRealVector", actual.getClass().getName());
  assertEquals("{getData=[], getDimension=0, getL1Norm=0.0, getLInfNorm=0.0, getMaxIndex=-1, getMaxValue=NaN, getMinIndex=-1, getMinValue=NaN, getNorm=0.0, getSparsity=NaN, isInfinite=false, isNaN=false}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getData=[], getDimension=0, getL1Norm=0.0, getLInfNorm=0.0, getMaxIndex=-1, getMaxValue=NaN, getMinIndex=-1, getMinValue=NaN, getNorm=0.0, getSparsity=NaN, isInfinite=false, isNaN=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput064() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.linear.OpenMapRealVector", "org.apache.commons.math.linear.OpenMapRealVector", "append", new String[]{"double"}, new String[]{"1.7976931348623157E308"}, false, 4, new String[][]{{"org.apache.commons.math.linear.OpenMapRealVector", "subtract", "double[]", "<empty>"}}, 1);
  assertNotNull(actual);
  assertEquals("org.apache.commons.math.linear.OpenMapRealVector", actual.getClass().getName());
  assertEquals("{getData=[-1.0, -1.0, -1.0, 1.7976931348623157E308], getDimension=4, getL1Norm=1.7976931348623157E308, getLInfNorm=1.7976931348623157E308, getMaxIndex=3, getMaxValue=1.7976931348623157E308, getMinInde...#288#-2036593060", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getData=[-1.0, -1.0, -1.0], getDimension=3, getL1Norm=3.0, getLInfNorm=1.0, getMaxIndex=2, getMaxValue=-1.0, getMinIndex=2, getMinValue=-1.0, getNorm=1.7320508075688772, getSparsity=1.0, isInfinite=f...#218#-325937176", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput065() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math.linear.OpenMapRealVector", "org.apache.commons.math.linear.OpenMapRealVector", "append", new String[]{"double"}, new String[]{"Infinity"}, false, 4, new String[][]{{"org.apache.commons.math.linear.OpenMapRealVector", "subtract", "double[]", "<empty>"}}, 1), new String[][]{{"mapToSelf", "org.apache.commons.math.analysis.UnivariateRealFunction", "0"}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.math.linear.OpenMapRealVector", actual.getClass().getName());
  assertEquals("{getData=[-Infinity, -Infinity, -Infinity, -Infinity], getDimension=4, getL1Norm=Infinity, getLInfNorm=Infinity, getMaxIndex=3, getMaxValue=-Infinity, getMinIndex=3, getMinValue=-Infinity, getNorm=Inf...#253#1007629272", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getData=[-1.0, -1.0, -1.0], getDimension=3, getL1Norm=3.0, getLInfNorm=1.0, getMaxIndex=2, getMaxValue=-1.0, getMinIndex=2, getMinValue=-1.0, getNorm=1.7320508075688772, getSparsity=1.0, isInfinite=f...#218#-325937176", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput066() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.linear.OpenMapRealVector", "org.apache.commons.math.linear.OpenMapRealVector", "getMaxValue", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.math.linear.OpenMapRealVector", "subtract", "double[]", "<sample:5>"}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("NaN", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getData=[], getDimension=0, getL1Norm=0.0, getLInfNorm=0.0, getMaxIndex=-1, getMaxValue=NaN, getMinIndex=-1, getMinValue=NaN, getNorm=0.0, getSparsity=NaN, isInfinite=false, isNaN=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput067() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math.linear.OpenMapRealVector", "org.apache.commons.math.linear.OpenMapRealVector", "append", new String[]{"double"}, new String[]{"1.7976931348623157E308"}, false, 4, new String[][]{}, 2), new String[][]{{"mapToSelf", "org.apache.commons.math.analysis.UnivariateRealFunction", "6"}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.math.linear.OpenMapRealVector", actual.getClass().getName());
  assertEquals("{getData=[0.24197072451914337, 0.24197072451914337, 0.241970724519143.., getDimension=4, getL1Norm=0.7259121735574301, getLInfNorm=0.24197072451914337, getMaxIndex=2, getMaxValue=0.24197072451914337, ...#307#-1309878171", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getData=[-1.0, -1.0, -1.0], getDimension=3, getL1Norm=3.0, getLInfNorm=1.0, getMaxIndex=2, getMaxValue=-1.0, getMinIndex=2, getMinValue=-1.0, getNorm=1.7320508075688772, getSparsity=1.0, isInfinite=f...#218#-325937176", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput068() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math.linear.OpenMapRealVector", "org.apache.commons.math.linear.OpenMapRealVector", "append", new String[]{"double"}, new String[]{"1.0"}, false, 2, new String[][]{}, 2), new String[][]{{"mapToSelf", "org.apache.commons.math.analysis.UnivariateRealFunction", "6"}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.math.linear.OpenMapRealVector", actual.getClass().getName());
  assertEquals("{getData=[0.0, -0.24197072451914337], getDimension=2, getL1Norm=0.24197072451914337, getLInfNorm=0.24197072451914337, getMaxIndex=0, getMaxValue=0.0, getMinIndex=1, getMinValue=-0.24197072451914337, g...#275#1570248217", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getData=[0.0], getDimension=1, getL1Norm=0.0, getLInfNorm=0.0, getMaxIndex=0, getMaxValue=0.0, getMinIndex=0, getMinValue=0.0, getNorm=0.0, getSparsity=0.0, isInfinite=false, isNaN=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput069() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math.linear.OpenMapRealVector", "org.apache.commons.math.linear.OpenMapRealVector", "append", new String[]{"double"}, new String[]{"1.7976931348623157E308"}, false, 2, new String[][]{}, 2), new String[][]{{"mapToSelf", "org.apache.commons.math.analysis.UnivariateRealFunction", "6"}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.math.linear.OpenMapRealVector", actual.getClass().getName());
  assertEquals("{getData=[0.0, 0.0], getDimension=2, getL1Norm=0.0, getLInfNorm=0.0, getMaxIndex=1, getMaxValue=0.0, getMinIndex=1, getMinValue=0.0, getNorm=0.0, getSparsity=0.5, isInfinite=false, isNaN=false}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getData=[0.0], getDimension=1, getL1Norm=0.0, getLInfNorm=0.0, getMaxIndex=0, getMaxValue=0.0, getMinIndex=0, getMinValue=0.0, getNorm=0.0, getSparsity=0.0, isInfinite=false, isNaN=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput070() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.linear.OpenMapRealVector", "org.apache.commons.math.linear.OpenMapRealVector", "isInfinite", new String[]{}, new String[]{}, false, 31, new String[][]{{"org.apache.commons.math.linear.OpenMapRealVector", "dotProduct", "org.apache.commons.math.linear.RealVector", "<sample:5>"}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getData=[1.0, Infinity, -Infinity], getDimension=3, getL1Norm=Infinity, getLInfNorm=Infinity, getMaxIndex=1, getMaxValue=Infinity, getMinIndex=2, getMinValue=-Infinity, getNorm=Infinity, getSparsity=...#234#-614213921", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput071() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.linear.OpenMapRealVector", "org.apache.commons.math.linear.OpenMapRealVector", "getDistance", new String[]{"org.apache.commons.math.linear.OpenMapRealVector"}, new String[]{"<sample:6>"}, false, 0, new String[][]{{"org.apache.commons.math.linear.OpenMapRealVector", "ebeMultiply", "double[]", "<null>"}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("Infinity", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getData=[], getDimension=0, getL1Norm=0.0, getLInfNorm=0.0, getMaxIndex=-1, getMaxValue=NaN, getMinIndex=-1, getMinValue=NaN, getNorm=0.0, getSparsity=NaN, isInfinite=false, isNaN=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput072() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.linear.OpenMapRealVector", "org.apache.commons.math.linear.OpenMapRealVector", "getDistance", new String[]{"org.apache.commons.math.linear.OpenMapRealVector"}, new String[]{"<sample:6>"}, false, 15, new String[][]{{"org.apache.commons.math.linear.OpenMapRealVector", "ebeMultiply", "double[]", "<null>"}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("Infinity", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getData=[0.0, 1.0], getDimension=2, getL1Norm=1.0, getLInfNorm=1.0, getMaxIndex=1, getMaxValue=1.0, getMinIndex=0, getMinValue=0.0, getNorm=1.0, getSparsity=0.5, isInfinite=false, isNaN=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput073() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math.linear.OpenMapRealVector", "org.apache.commons.math.linear.OpenMapRealVector", "getDistance", new String[]{"org.apache.commons.math.linear.OpenMapRealVector"}, new String[]{"<sample:5>"}, false, 15, new String[][]{{"org.apache.commons.math.linear.OpenMapRealVector", "ebeMultiply", "double[]", "<sample:5>"}}, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("org.apache.commons.math.exception.OutOfRangeException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput074() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.linear.OpenMapRealVector", "org.apache.commons.math.linear.OpenMapRealVector", "getDistance", new String[]{"org.apache.commons.math.linear.OpenMapRealVector"}, new String[]{"<sample:6>"}, false, 15, new String[][]{{"org.apache.commons.math.linear.OpenMapRealVector", "ebeMultiply", "double[]", "<sample:7>"}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("Infinity", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getData=[0.0, 1.0], getDimension=2, getL1Norm=1.0, getLInfNorm=1.0, getMaxIndex=1, getMaxValue=1.0, getMinIndex=0, getMinValue=0.0, getNorm=1.0, getSparsity=0.5, isInfinite=false, isNaN=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput075() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.linear.OpenMapRealVector", "org.apache.commons.math.linear.OpenMapRealVector", "getDistance", new String[]{"org.apache.commons.math.linear.OpenMapRealVector"}, new String[]{"<sample:4>"}, false, 15, new String[][]{{"org.apache.commons.math.linear.OpenMapRealVector", "getLInfDistance", "double[]", "<sample:2>"}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("2.449489742783178", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getData=[0.0, 1.0], getDimension=2, getL1Norm=1.0, getLInfNorm=1.0, getMaxIndex=1, getMaxValue=1.0, getMinIndex=0, getMinValue=0.0, getNorm=1.0, getSparsity=0.5, isInfinite=false, isNaN=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput076() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math.linear.OpenMapRealVector", "org.apache.commons.math.linear.OpenMapRealVector", "getDistance", new String[]{"org.apache.commons.math.linear.OpenMapRealVector"}, new String[]{"<null>"}, false, 15, new String[][]{{"org.apache.commons.math.linear.OpenMapRealVector", "getLInfDistance", "double[]", "<sample:0>"}}, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput077() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math.linear.OpenMapRealVector", "org.apache.commons.math.linear.OpenMapRealVector", "getDistance", new String[]{"org.apache.commons.math.linear.OpenMapRealVector"}, new String[]{"<sample:6>"}, false, 16, new String[][]{{"org.apache.commons.math.linear.OpenMapRealVector", "setSubVector", "int,double[]", "10", "<sample:1>"}, {"org.apache.commons.math.linear.OpenMapRealVector", "mapAdd", "double", "1.7976931348623157E308"}}, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("org.apache.commons.math.exception.OutOfRangeException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput078() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.linear.OpenMapRealVector", "org.apache.commons.math.linear.OpenMapRealVector", "getDistance", new String[]{"org.apache.commons.math.linear.OpenMapRealVector"}, new String[]{"<sample:10>"}, false, 14, new String[][]{{"org.apache.commons.math.linear.OpenMapRealVector", "setSubVector", "int,double[]", "15", "<sample:4>"}, {"org.apache.commons.math.linear.OpenMapRealVector", "mapDivideToSelf", "double", "0.1"}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("Infinity", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getData=[0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0], getDimension=12, getL1Norm=0.0, getLInfNorm=0.0, getMaxIndex=11, getMaxValue=0.0, getMinIndex=11, getMinValue=0.0, getNorm=0.0, g...#246#1646368735", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput079() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.linear.OpenMapRealVector", "org.apache.commons.math.linear.OpenMapRealVector", "getDistance", new String[]{"org.apache.commons.math.linear.OpenMapRealVector"}, new String[]{"<sample:2>"}, false, 14, new String[][]{{"org.apache.commons.math.linear.OpenMapRealVector", "setSubVector", "int,double[]", "15", "<sample:4>"}, {"org.apache.commons.math.linear.OpenMapRealVector", "mapDivideToSelf", "double", "0.1"}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("0.0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getData=[0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0], getDimension=12, getL1Norm=0.0, getLInfNorm=0.0, getMaxIndex=11, getMaxValue=0.0, getMinIndex=11, getMinValue=0.0, getNorm=0.0, g...#246#1646368735", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput080() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.linear.OpenMapRealVector", "org.apache.commons.math.linear.OpenMapRealVector", "getDistance", new String[]{"org.apache.commons.math.linear.OpenMapRealVector"}, new String[]{"<sample:8>"}, false, 13, new String[][]{{"org.apache.commons.math.linear.OpenMapRealVector", "setSubVector", "int,double[]", "15", "<sample:4>"}, {"org.apache.commons.math.linear.OpenMapRealVector", "mapDivideToSelf", "double", "0.1"}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("Infinity", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getData=[-Infinity, -10.0, 0.0], getDimension=3, getL1Norm=Infinity, getLInfNorm=Infinity, getMaxIndex=2, getMaxValue=0.0, getMinIndex=0, getMinValue=-Infinity, getNorm=Infinity, getSparsity=0.666666...#241#-2105104156", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput081() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.linear.OpenMapRealVector", "org.apache.commons.math.linear.OpenMapRealVector", "append", new String[]{"double"}, new String[]{"1.0E-12"}, false, 0, null, 2);
  assertNotNull(actual);
  assertEquals("org.apache.commons.math.linear.OpenMapRealVector", actual.getClass().getName());
  assertEquals("{getData=[1.0E-12], getDimension=1, getL1Norm=1.0E-12, getLInfNorm=1.0E-12, getMaxIndex=0, getMaxValue=1.0E-12, getMinIndex=0, getMinValue=1.0E-12, getNorm=1.0E-12, getSparsity=1.0, isInfinite=false, ...#212#532958008", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getData=[], getDimension=0, getL1Norm=0.0, getLInfNorm=0.0, getMaxIndex=-1, getMaxValue=NaN, getMinIndex=-1, getMinValue=NaN, getNorm=0.0, getSparsity=NaN, isInfinite=false, isNaN=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput082() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.linear.OpenMapRealVector", "org.apache.commons.math.linear.OpenMapRealVector", "append", new String[]{"double"}, new String[]{"-0.479999999999"}, false, 0, null, 2);
  assertNotNull(actual);
  assertEquals("org.apache.commons.math.linear.OpenMapRealVector", actual.getClass().getName());
  assertEquals("{getData=[-0.479999999999], getDimension=1, getL1Norm=0.479999999999, getLInfNorm=0.479999999999, getMaxIndex=0, getMaxValue=-0.479999999999, getMinIndex=0, getMinValue=-0.479999999999, getNorm=0.4799...#257#1754601321", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getData=[], getDimension=0, getL1Norm=0.0, getLInfNorm=0.0, getMaxIndex=-1, getMaxValue=NaN, getMinIndex=-1, getMinValue=NaN, getNorm=0.0, getSparsity=NaN, isInfinite=false, isNaN=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput083() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.linear.OpenMapRealVector", "org.apache.commons.math.linear.OpenMapRealVector", "append", new String[]{"double"}, new String[]{"0.479999999999"}, false, 0, null, 2);
  assertNotNull(actual);
  assertEquals("org.apache.commons.math.linear.OpenMapRealVector", actual.getClass().getName());
  assertEquals("{getData=[0.479999999999], getDimension=1, getL1Norm=0.479999999999, getLInfNorm=0.479999999999, getMaxIndex=0, getMaxValue=0.479999999999, getMinIndex=0, getMinValue=0.479999999999, getNorm=0.4799999...#254#-2143962212", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getData=[], getDimension=0, getL1Norm=0.0, getLInfNorm=0.0, getMaxIndex=-1, getMaxValue=NaN, getMinIndex=-1, getMinValue=NaN, getNorm=0.0, getSparsity=NaN, isInfinite=false, isNaN=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput084() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.linear.OpenMapRealVector", "org.apache.commons.math.linear.OpenMapRealVector", "append", new String[]{"double"}, new String[]{"-6.520000000001"}, false, 0, null, 2);
  assertNotNull(actual);
  assertEquals("org.apache.commons.math.linear.OpenMapRealVector", actual.getClass().getName());
  assertEquals("{getData=[-6.520000000001], getDimension=1, getL1Norm=6.520000000001, getLInfNorm=6.520000000001, getMaxIndex=0, getMaxValue=-6.520000000001, getMinIndex=0, getMinValue=-6.520000000001, getNorm=6.5200...#257#-1433881163", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getData=[], getDimension=0, getL1Norm=0.0, getLInfNorm=0.0, getMaxIndex=-1, getMaxValue=NaN, getMinIndex=-1, getMinValue=NaN, getNorm=0.0, getSparsity=NaN, isInfinite=false, isNaN=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput085() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.linear.OpenMapRealVector", "org.apache.commons.math.linear.OpenMapRealVector", "append", new String[]{"double"}, new String[]{"-6.5700000000009995"}, false, 0, null, 2);
  assertNotNull(actual);
  assertEquals("org.apache.commons.math.linear.OpenMapRealVector", actual.getClass().getName());
  assertEquals("{getData=[-6.5700000000009995], getDimension=1, getL1Norm=6.5700000000009995, getLInfNorm=6.5700000000009995, getMaxIndex=0, getMaxValue=-6.5700000000009995, getMinIndex=0, getMinValue=-6.570000000000...#281#-712883787", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getData=[], getDimension=0, getL1Norm=0.0, getLInfNorm=0.0, getMaxIndex=-1, getMaxValue=NaN, getMinIndex=-1, getMinValue=NaN, getNorm=0.0, getSparsity=NaN, isInfinite=false, isNaN=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput086() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math.linear.OpenMapRealVector", "org.apache.commons.math.linear.OpenMapRealVector", "outerProduct", new String[]{"double[]"}, new String[]{"<sample:5>"}, false, 7, new String[][]{{"org.apache.commons.math.linear.OpenMapRealVector", "cosine", "double[]", "<sample:2>"}, {"org.apache.commons.math.linear.OpenMapRealVector", "dotProduct", "org.apache.commons.math.linear.RealVector", "<sample:6>"}}, 3), new String[][]{{"add", "org.apache.commons.math.linear.RealMatrix", "4"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("org.apache.commons.math.linear.MatrixDimensionMismatchException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput087() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math.linear.OpenMapRealVector", "org.apache.commons.math.linear.OpenMapRealVector", "append", new String[]{"double[]"}, new String[]{"<sample:7>"}, false, 0, new String[][]{{"org.apache.commons.math.linear.OpenMapRealVector", "getLInfDistance", "double[]", "<sample:8>"}, {"org.apache.commons.math.linear.OpenMapRealVector", "mapSubtract", "double", "NaN"}}, 3), new String[][]{{"mapAdd", "double", "6"}, {"mapAddToSelf", "double", "7"}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.math.linear.OpenMapRealVector", actual.getClass().getName());
  assertEquals("{getData=[0.0, Infinity], getDimension=2, getL1Norm=Infinity, getLInfNorm=Infinity, getMaxIndex=1, getMaxValue=Infinity, getMinIndex=0, getMinValue=0.0, getNorm=Infinity, getSparsity=0.5, isInfinite=t...#217#-1466561583", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getData=[], getDimension=0, getL1Norm=0.0, getLInfNorm=0.0, getMaxIndex=-1, getMaxValue=NaN, getMinIndex=-1, getMinValue=NaN, getNorm=0.0, getSparsity=NaN, isInfinite=false, isNaN=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput088() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math.linear.OpenMapRealVector", "org.apache.commons.math.linear.OpenMapRealVector", "sparseIterator", new String[]{}, new String[]{}, false, 15, new String[][]{{"org.apache.commons.math.linear.OpenMapRealVector", "getL1Distance", "org.apache.commons.math.linear.OpenMapRealVector", "<sample:4>"}, {"org.apache.commons.math.linear.OpenMapRealVector", "map", "org.apache.commons.math.analysis.UnivariateRealFunction", "<sample:1>"}, {"org.apache.commons.math.linear.OpenMapRealVector", "add", "org.apache.commons.math.linear.OpenMapRealVector", "<null>"}}, 2), new String[][]{{"remove", "", "6"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.UnsupportedOperationException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput089() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math.linear.OpenMapRealVector", "org.apache.commons.math.linear.OpenMapRealVector", "sparseIterator", new String[]{}, new String[]{}, false, 4, new String[][]{{"org.apache.commons.math.linear.OpenMapRealVector", "getL1Distance", "org.apache.commons.math.linear.OpenMapRealVector", "<sample:3>"}, {"org.apache.commons.math.linear.OpenMapRealVector", "map", "org.apache.commons.math.analysis.UnivariateRealFunction", "<sample:1>"}, {"org.apache.commons.math.linear.OpenMapRealVector", "combine", "double,double,org.apache.commons.math.linear.RealVector", "-1.0", "0.0", "<null>"}}, 3), new String[][]{{"remove", "", "6"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.UnsupportedOperationException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput090() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.linear.OpenMapRealVector", "org.apache.commons.math.linear.OpenMapRealVector", "getL1Distance", new String[]{"org.apache.commons.math.linear.RealVector"}, new String[]{"<sample:6>"}, false, 12, new String[][]{{"org.apache.commons.math.linear.OpenMapRealVector", "ebeDivide", "org.apache.commons.math.linear.RealVector", "<sample:6>"}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("0.0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getData=[], getDimension=0, getL1Norm=0.0, getLInfNorm=0.0, getMaxIndex=-1, getMaxValue=NaN, getMinIndex=-1, getMinValue=NaN, getNorm=0.0, getSparsity=NaN, isInfinite=false, isNaN=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput091() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math.linear.OpenMapRealVector", "org.apache.commons.math.linear.OpenMapRealVector", "getL1Distance", new String[]{"org.apache.commons.math.linear.RealVector"}, new String[]{"<sample:2>"}, false, 12, new String[][]{{"org.apache.commons.math.linear.OpenMapRealVector", "toArray", ""}, {"org.apache.commons.math.linear.OpenMapRealVector", "ebeDivide", "org.apache.commons.math.linear.RealVector", "<sample:6>"}}, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("org.apache.commons.math.exception.DimensionMismatchException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput092() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.linear.OpenMapRealVector", "org.apache.commons.math.linear.OpenMapRealVector", "getL1Norm", new String[]{}, new String[]{}, false, 0, null, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("0.0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getData=[], getDimension=0, getL1Norm=0.0, getLInfNorm=0.0, getMaxIndex=-1, getMaxValue=NaN, getMinIndex=-1, getMinValue=NaN, getNorm=0.0, getSparsity=NaN, isInfinite=false, isNaN=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput093() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.linear.OpenMapRealVector", "org.apache.commons.math.linear.OpenMapRealVector", "getL1Norm", new String[]{}, new String[]{}, false, 1, new String[][]{}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("Infinity", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getData=[1.0, Infinity, -Infinity], getDimension=3, getL1Norm=Infinity, getLInfNorm=Infinity, getMaxIndex=1, getMaxValue=Infinity, getMinIndex=2, getMinValue=-Infinity, getNorm=Infinity, getSparsity=...#234#-614213921", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput094() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.linear.OpenMapRealVector", "org.apache.commons.math.linear.OpenMapRealVector", "getL1Norm", new String[]{}, new String[]{}, false, 2, new String[][]{}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("0.0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getData=[0.0], getDimension=1, getL1Norm=0.0, getLInfNorm=0.0, getMaxIndex=0, getMaxValue=0.0, getMinIndex=0, getMinValue=0.0, getNorm=0.0, getSparsity=0.0, isInfinite=false, isNaN=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput095() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.linear.OpenMapRealVector", "org.apache.commons.math.linear.OpenMapRealVector", "getL1Norm", new String[]{}, new String[]{}, false, 3, new String[][]{}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("Infinity", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getData=[-Infinity, -1.0], getDimension=2, getL1Norm=Infinity, getLInfNorm=Infinity, getMaxIndex=1, getMaxValue=-1.0, getMinIndex=0, getMinValue=-Infinity, getNorm=Infinity, getSparsity=1.0, isInfini...#221#-774438889", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput096() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.linear.OpenMapRealVector", "org.apache.commons.math.linear.OpenMapRealVector", "getL1Norm", new String[]{}, new String[]{}, false, 4, new String[][]{}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("3.0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getData=[-1.0, -1.0, -1.0], getDimension=3, getL1Norm=3.0, getLInfNorm=1.0, getMaxIndex=2, getMaxValue=-1.0, getMinIndex=2, getMinValue=-1.0, getNorm=1.7320508075688772, getSparsity=1.0, isInfinite=f...#218#-325937176", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput097() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math.linear.OpenMapRealVector", "org.apache.commons.math.linear.OpenMapRealVector", "getLInfDistance", new String[]{"double[]"}, new String[]{"<sample:0>"}, false, 0, new String[][]{{"org.apache.commons.math.linear.OpenMapRealVector", "dotProduct", "double[]", "<empty>"}, {"org.apache.commons.math.linear.OpenMapRealVector", "dotProduct", "org.apache.commons.math.linear.OpenMapRealVector", "<null>"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("org.apache.commons.math.exception.DimensionMismatchException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput098() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math.linear.OpenMapRealVector", "org.apache.commons.math.linear.OpenMapRealVector", "cosine", new String[]{"double[]"}, new String[]{"<null>"}, false); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("org.apache.commons.math.exception.NullArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput099() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math.linear.OpenMapRealVector", "org.apache.commons.math.linear.OpenMapRealVector", "cosine", new String[]{"double[]"}, new String[]{"<sample:2>"}, false, 0, new String[][]{{"org.apache.commons.math.linear.OpenMapRealVector", "getL1Norm", ""}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("org.apache.commons.math.exception.MathArithmeticException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput100() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.linear.OpenMapRealVector", "org.apache.commons.math.linear.OpenMapRealVector", "mapSubtractToSelf", new String[]{"double"}, new String[]{"1.7976931348623157E308"}, false, 0, new String[][]{{"org.apache.commons.math.linear.OpenMapRealVector", "getMinValue", ""}, {"org.apache.commons.math.linear.OpenMapRealVector", "getLInfNorm", ""}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.math.linear.OpenMapRealVector", actual.getClass().getName());
  assertEquals("{getData=[], getDimension=0, getL1Norm=0.0, getLInfNorm=0.0, getMaxIndex=-1, getMaxValue=NaN, getMinIndex=-1, getMinValue=NaN, getNorm=0.0, getSparsity=NaN, isInfinite=false, isNaN=false}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getData=[], getDimension=0, getL1Norm=0.0, getLInfNorm=0.0, getMaxIndex=-1, getMaxValue=NaN, getMinIndex=-1, getMinValue=NaN, getNorm=0.0, getSparsity=NaN, isInfinite=false, isNaN=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput101() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math.linear.OpenMapRealVector", "org.apache.commons.math.linear.OpenMapRealVector", "subtract", new String[]{"double[]"}, new String[]{"<sample:0>"}, false, 0, new String[][]{{"org.apache.commons.math.linear.OpenMapRealVector", "equals", "java.lang.Object", "<s:key>"}, {"org.apache.commons.math.linear.OpenMapRealVector", "unitVector", ""}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("org.apache.commons.math.exception.DimensionMismatchException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput102() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math.linear.OpenMapRealVector", "org.apache.commons.math.linear.OpenMapRealVector", "subtract", new String[]{"double[]"}, new String[]{"<null>"}, false, 0, new String[][]{{"org.apache.commons.math.linear.OpenMapRealVector", "unitVector", ""}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput103() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math.linear.OpenMapRealVector", "org.apache.commons.math.linear.OpenMapRealVector", "ebeMultiply", new String[]{"double[]"}, new String[]{"<sample:2>"}, false); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("org.apache.commons.math.exception.DimensionMismatchException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput104() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math.linear.OpenMapRealVector", "org.apache.commons.math.linear.OpenMapRealVector", "getLInfDistance", new String[]{"org.apache.commons.math.linear.RealVector"}, new String[]{"<sample:1>"}, false, 0, new String[][]{{"org.apache.commons.math.linear.OpenMapRealVector", "ebeDivide", "double[]", "<sample:0>"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("org.apache.commons.math.exception.DimensionMismatchException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput105() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math.linear.OpenMapRealVector", "org.apache.commons.math.linear.OpenMapRealVector", "subtract", new String[]{"double[]"}, new String[]{"<sample:0>"}, false, 1, new String[][]{{"org.apache.commons.math.linear.OpenMapRealVector", "unitVector", ""}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("org.apache.commons.math.exception.DimensionMismatchException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput106() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math.linear.OpenMapRealVector", "org.apache.commons.math.linear.OpenMapRealVector", "subtract", new String[]{"double[]"}, new String[]{"<sample:0>"}, false, 1, new String[][]{{"org.apache.commons.math.linear.OpenMapRealVector", "ebeDivide", "double[]", "<sample:2>"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("org.apache.commons.math.exception.DimensionMismatchException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput107() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.linear.OpenMapRealVector", "org.apache.commons.math.linear.OpenMapRealVector", "subtract", new String[]{"double[]"}, new String[]{"<sample:5>"}, false, 1, new String[][]{});
  assertNotNull(actual);
  assertEquals("org.apache.commons.math.linear.OpenMapRealVector", actual.getClass().getName());
  assertEquals("{getData=[2.0, Infinity, -Infinity], getDimension=3, getL1Norm=Infinity, getLInfNorm=Infinity, getMaxIndex=1, getMaxValue=Infinity, getMinIndex=2, getMinValue=-Infinity, getNorm=Infinity, getSparsity=...#234#2076749502", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getData=[1.0, Infinity, -Infinity], getDimension=3, getL1Norm=Infinity, getLInfNorm=Infinity, getMaxIndex=1, getMaxValue=Infinity, getMinIndex=2, getMinValue=-Infinity, getNorm=Infinity, getSparsity=...#234#-614213921", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput108() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math.linear.OpenMapRealVector", "org.apache.commons.math.linear.OpenMapRealVector", "subtract", new String[]{"double[]"}, new String[]{"<sample:5>"}, false, 2, new String[][]{}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("org.apache.commons.math.exception.DimensionMismatchException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput109() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.linear.OpenMapRealVector", "org.apache.commons.math.linear.OpenMapRealVector", "subtract", new String[]{"double[]"}, new String[]{"<sample:2>"}, false, 1, new String[][]{});
  assertNotNull(actual);
  assertEquals("org.apache.commons.math.linear.OpenMapRealVector", actual.getClass().getName());
  assertEquals("{getData=[0.0, NaN, NaN], getDimension=3, getL1Norm=NaN, getLInfNorm=NaN, getMaxIndex=0, getMaxValue=0.0, getMinIndex=0, getMinValue=0.0, getNorm=NaN, getSparsity=0.6666666666666666, isInfinite=false,...#212#196718277", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getData=[1.0, Infinity, -Infinity], getDimension=3, getL1Norm=Infinity, getLInfNorm=Infinity, getMaxIndex=1, getMaxValue=Infinity, getMinIndex=2, getMinValue=-Infinity, getNorm=Infinity, getSparsity=...#234#-614213921", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput110() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.linear.OpenMapRealVector", "org.apache.commons.math.linear.OpenMapRealVector", "subtract", new String[]{"double[]"}, new String[]{"<sample:8>"}, false, 1, new String[][]{});
  assertNotNull(actual);
  assertEquals("org.apache.commons.math.linear.OpenMapRealVector", actual.getClass().getName());
  assertEquals("{getData=[-Infinity, Infinity, -Infinity], getDimension=3, getL1Norm=Infinity, getLInfNorm=Infinity, getMaxIndex=1, getMaxValue=Infinity, getMinIndex=2, getMinValue=-Infinity, getNorm=Infinity, getSpa...#240#1696318493", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getData=[1.0, Infinity, -Infinity], getDimension=3, getL1Norm=Infinity, getLInfNorm=Infinity, getMaxIndex=1, getMaxValue=Infinity, getMinIndex=2, getMinValue=-Infinity, getNorm=Infinity, getSparsity=...#234#-614213921", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput111() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.linear.OpenMapRealVector", "org.apache.commons.math.linear.OpenMapRealVector", "checkVectorDimensions", new String[]{"int"}, new String[]{"0"}, false, 5, new String[][]{{"org.apache.commons.math.linear.OpenMapRealVector", "ebeDivide", "double[]", "<sample:5>"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getData=[], getDimension=0, getL1Norm=0.0, getLInfNorm=0.0, getMaxIndex=-1, getMaxValue=NaN, getMinIndex=-1, getMinValue=NaN, getNorm=0.0, getSparsity=NaN, isInfinite=false, isNaN=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput112() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math.linear.OpenMapRealVector", "org.apache.commons.math.linear.OpenMapRealVector", "subtract", new String[]{"double[]"}, new String[]{"<sample:8>"}, false, 1, new String[][]{}), new String[][]{{"getL1Norm", "", "0"}});
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("Infinity", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getData=[1.0, Infinity, -Infinity], getDimension=3, getL1Norm=Infinity, getLInfNorm=Infinity, getMaxIndex=1, getMaxValue=Infinity, getMinIndex=2, getMinValue=-Infinity, getNorm=Infinity, getSparsity=...#234#-614213921", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput113() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math.linear.OpenMapRealVector", "org.apache.commons.math.linear.OpenMapRealVector", "subtract", new String[]{"double[]"}, new String[]{"<sample:8>"}, false, 11, new String[][]{{"org.apache.commons.math.linear.OpenMapRealVector", "getDistance", "org.apache.commons.math.linear.RealVector", "<sample:2>"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("org.apache.commons.math.exception.DimensionMismatchException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput114() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math.linear.OpenMapRealVector", "org.apache.commons.math.linear.OpenMapRealVector", "subtract", new String[]{"double[]"}, new String[]{"<sample:2>"}, false, 1, new String[][]{{"org.apache.commons.math.linear.OpenMapRealVector", "getDistance", "org.apache.commons.math.linear.RealVector", "<sample:2>"}}), new String[][]{{"getL1Norm", "", "0"}});
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("NaN", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getData=[1.0, Infinity, -Infinity], getDimension=3, getL1Norm=Infinity, getLInfNorm=Infinity, getMaxIndex=1, getMaxValue=Infinity, getMinIndex=2, getMinValue=-Infinity, getNorm=Infinity, getSparsity=...#234#-614213921", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput115() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math.linear.OpenMapRealVector", "org.apache.commons.math.linear.OpenMapRealVector", "dotProduct", new String[]{"double[]"}, new String[]{"<null>"}, false); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("org.apache.commons.math.exception.NullArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput116() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math.linear.OpenMapRealVector", "org.apache.commons.math.linear.OpenMapRealVector", "dotProduct", new String[]{"double[]"}, new String[]{"<sample:1>"}, false); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("org.apache.commons.math.exception.DimensionMismatchException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput117() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.linear.OpenMapRealVector", "org.apache.commons.math.linear.OpenMapRealVector", "getMinValue", new String[]{}, new String[]{}, false, 2, new String[][]{{"org.apache.commons.math.linear.OpenMapRealVector", "getData", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("0.0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getData=[0.0], getDimension=1, getL1Norm=0.0, getLInfNorm=0.0, getMaxIndex=0, getMaxValue=0.0, getMinIndex=0, getMinValue=0.0, getNorm=0.0, getSparsity=0.0, isInfinite=false, isNaN=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput118() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.linear.OpenMapRealVector", "org.apache.commons.math.linear.OpenMapRealVector", "getMinValue", new String[]{}, new String[]{}, false, 3, new String[][]{});
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("-Infinity", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getData=[-Infinity, -1.0], getDimension=2, getL1Norm=Infinity, getLInfNorm=Infinity, getMaxIndex=1, getMaxValue=-1.0, getMinIndex=0, getMinValue=-Infinity, getNorm=Infinity, getSparsity=1.0, isInfini...#221#-774438889", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput119() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.linear.OpenMapRealVector", "org.apache.commons.math.linear.OpenMapRealVector", "getMinValue", new String[]{}, new String[]{}, false, 4, new String[][]{});
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("-1.0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getData=[-1.0, -1.0, -1.0], getDimension=3, getL1Norm=3.0, getLInfNorm=1.0, getMaxIndex=2, getMaxValue=-1.0, getMinIndex=2, getMinValue=-1.0, getNorm=1.7320508075688772, getSparsity=1.0, isInfinite=f...#218#-325937176", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput120() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.linear.OpenMapRealVector", "org.apache.commons.math.linear.OpenMapRealVector", "getMinValue", new String[]{}, new String[]{}, false, 5, new String[][]{});
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("NaN", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getData=[], getDimension=0, getL1Norm=0.0, getLInfNorm=0.0, getMaxIndex=-1, getMaxValue=NaN, getMinIndex=-1, getMinValue=NaN, getNorm=0.0, getSparsity=NaN, isInfinite=false, isNaN=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput121() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.linear.OpenMapRealVector", "org.apache.commons.math.linear.OpenMapRealVector", "getMinValue", new String[]{}, new String[]{}, false, 6, new String[][]{});
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("-Infinity", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getData=[Infinity, -Infinity, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0], getDimension=8, getL1Norm=Infinity, getLInfNorm=Infinity, getMaxIndex=0, getMaxValue=Infinity, getMinIndex=1, getMinValue=-Infinity, getNo...#260#-518583913", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput122() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.linear.OpenMapRealVector", "org.apache.commons.math.linear.OpenMapRealVector", "getMinValue", new String[]{}, new String[]{}, false, 7, new String[][]{});
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("-Infinity", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getData=[Infinity, -Infinity, 0.0], getDimension=3, getL1Norm=Infinity, getLInfNorm=Infinity, getMaxIndex=0, getMaxValue=Infinity, getMinIndex=1, getMinValue=-Infinity, getNorm=Infinity, getSparsity=...#249#903803555", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput123() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.linear.OpenMapRealVector", "org.apache.commons.math.linear.OpenMapRealVector", "getMinValue", new String[]{}, new String[]{}, false, 8, new String[][]{});
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("0.0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getData=[0.0, 0.0, 0.0, 0.0, 0.0, 0.0], getDimension=6, getL1Norm=0.0, getLInfNorm=0.0, getMaxIndex=5, getMaxValue=0.0, getMinIndex=5, getMinValue=0.0, getNorm=0.0, getSparsity=0.0, isInfinite=false,...#213#-1142613006", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput124() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.linear.OpenMapRealVector", "org.apache.commons.math.linear.OpenMapRealVector", "getMinValue", new String[]{}, new String[]{}, false, 14, new String[][]{});
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("0.0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getData=[0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0], getDimension=12, getL1Norm=0.0, getLInfNorm=0.0, getMaxIndex=11, getMaxValue=0.0, getMinIndex=11, getMinValue=0.0, getNorm=0.0, g...#246#1646368735", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput125() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.linear.OpenMapRealVector", "org.apache.commons.math.linear.OpenMapRealVector", "getMinValue", new String[]{}, new String[]{}, false, 9, new String[][]{});
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("0.0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getData=[0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0], getDimension=7, getL1Norm=0.0, getLInfNorm=0.0, getMaxIndex=6, getMaxValue=0.0, getMinIndex=6, getMinValue=0.0, getNorm=0.0, getSparsity=0.0, isInfinite=f...#218#917164721", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput126() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.linear.OpenMapRealVector", "org.apache.commons.math.linear.OpenMapRealVector", "getMinValue", new String[]{}, new String[]{}, false, 10, new String[][]{});
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("0.0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getData=[0.0, 1.0, Infinity], getDimension=3, getL1Norm=Infinity, getLInfNorm=Infinity, getMaxIndex=2, getMaxValue=Infinity, getMinIndex=0, getMinValue=0.0, getNorm=Infinity, getSparsity=1.0, isInfin...#222#1305061558", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput127() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math.linear.OpenMapRealVector", "org.apache.commons.math.linear.OpenMapRealVector", "combine", new String[]{"double", "double", "double[]"}, new String[]{"1.7976931348623157E308", "1.7976931348623157E308", "<empty>"}, false, 1, new String[][]{{"org.apache.commons.math.linear.OpenMapRealVector", "combineToSelf", "double,double,org.apache.commons.math.linear.RealVector", "Infinity", "1.0", "<sample:4>"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("org.apache.commons.math.exception.DimensionMismatchException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput128() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.linear.OpenMapRealVector", "org.apache.commons.math.linear.OpenMapRealVector", "append", new String[]{"org.apache.commons.math.linear.RealVector"}, new String[]{"<sample:3>"}, false, 0, new String[][]{{"org.apache.commons.math.linear.OpenMapRealVector", "sparseIterator", ""}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.math.linear.OpenMapRealVector", actual.getClass().getName());
  assertEquals("{getData=[Infinity], getDimension=1, getL1Norm=Infinity, getLInfNorm=Infinity, getMaxIndex=0, getMaxValue=Infinity, getMinIndex=0, getMinValue=Infinity, getNorm=Infinity, getSparsity=1.0, isInfinite=t...#217#-1471686217", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getData=[], getDimension=0, getL1Norm=0.0, getLInfNorm=0.0, getMaxIndex=-1, getMaxValue=NaN, getMinIndex=-1, getMinValue=NaN, getNorm=0.0, getSparsity=NaN, isInfinite=false, isNaN=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput129() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.linear.OpenMapRealVector", "org.apache.commons.math.linear.OpenMapRealVector", "append", new String[]{"org.apache.commons.math.linear.RealVector"}, new String[]{"<sample:5>"}, false, 0, new String[][]{{"org.apache.commons.math.linear.OpenMapRealVector", "sparseIterator", ""}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.math.linear.OpenMapRealVector", actual.getClass().getName());
  assertEquals("{getData=[-1.0, 0.0, 1.0], getDimension=3, getL1Norm=2.0, getLInfNorm=1.0, getMaxIndex=2, getMaxValue=1.0, getMinIndex=0, getMinValue=-1.0, getNorm=1.4142135623730951, getSparsity=0.6666666666666666, ...#230#-54966727", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getData=[], getDimension=0, getL1Norm=0.0, getLInfNorm=0.0, getMaxIndex=-1, getMaxValue=NaN, getMinIndex=-1, getMinValue=NaN, getNorm=0.0, getSparsity=NaN, isInfinite=false, isNaN=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput130() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.linear.OpenMapRealVector", "org.apache.commons.math.linear.OpenMapRealVector", "append", new String[]{"org.apache.commons.math.linear.RealVector"}, new String[]{"<sample:4>"}, false, 0, new String[][]{{"org.apache.commons.math.linear.OpenMapRealVector", "sparseIterator", ""}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.math.linear.OpenMapRealVector", actual.getClass().getName());
  assertEquals("{getData=[], getDimension=0, getL1Norm=0.0, getLInfNorm=0.0, getMaxIndex=-1, getMaxValue=NaN, getMinIndex=-1, getMinValue=NaN, getNorm=0.0, getSparsity=NaN, isInfinite=false, isNaN=false}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getData=[], getDimension=0, getL1Norm=0.0, getLInfNorm=0.0, getMaxIndex=-1, getMaxValue=NaN, getMinIndex=-1, getMinValue=NaN, getNorm=0.0, getSparsity=NaN, isInfinite=false, isNaN=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput131() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math.linear.OpenMapRealVector", "org.apache.commons.math.linear.OpenMapRealVector", "subtract", new String[]{"org.apache.commons.math.linear.RealVector"}, new String[]{"<sample:7>"}, false); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("org.apache.commons.math.exception.DimensionMismatchException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput132() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.linear.OpenMapRealVector", "org.apache.commons.math.linear.OpenMapRealVector", "append", new String[]{"org.apache.commons.math.linear.RealVector"}, new String[]{"<sample:3>"}, false, 4, new String[][]{{"org.apache.commons.math.linear.OpenMapRealVector", "sparseIterator", ""}, {"org.apache.commons.math.linear.OpenMapRealVector", "cosine", "double[]", "<sample:8>"}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.math.linear.OpenMapRealVector", actual.getClass().getName());
  assertEquals("{getData=[-1.0, -1.0, -1.0, Infinity], getDimension=4, getL1Norm=Infinity, getLInfNorm=Infinity, getMaxIndex=3, getMaxValue=Infinity, getMinIndex=2, getMinValue=-1.0, getNorm=Infinity, getSparsity=1.0...#231#-1665066903", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getData=[-1.0, -1.0, -1.0], getDimension=3, getL1Norm=3.0, getLInfNorm=1.0, getMaxIndex=2, getMaxValue=-1.0, getMinIndex=2, getMinValue=-1.0, getNorm=1.7320508075688772, getSparsity=1.0, isInfinite=f...#218#-325937176", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput133() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.linear.OpenMapRealVector", "org.apache.commons.math.linear.OpenMapRealVector", "projection", new String[]{"org.apache.commons.math.linear.RealVector"}, new String[]{"<sample:6>"}, false);
  assertNotNull(actual);
  assertEquals("org.apache.commons.math.linear.ArrayRealVector", actual.getClass().getName());
  assertEquals("{} {getData=[], getDataRef=[], getDimension=0, getL1Norm=0.0, getLInfNorm=0.0, getMaxIndex=-1, getMaxValue=NaN, getMinIndex=-1, getMinValue=NaN, getNorm=0.0, isInfinite=false, isNaN=false}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getData=[], getDimension=0, getL1Norm=0.0, getLInfNorm=0.0, getMaxIndex=-1, getMaxValue=NaN, getMinIndex=-1, getMinValue=NaN, getNorm=0.0, getSparsity=NaN, isInfinite=false, isNaN=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput134() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math.linear.OpenMapRealVector", "org.apache.commons.math.linear.OpenMapRealVector", "append", new String[]{"org.apache.commons.math.linear.RealVector"}, new String[]{"<sample:3>"}, false, 4, new String[][]{{"org.apache.commons.math.linear.OpenMapRealVector", "sparseIterator", ""}, {"org.apache.commons.math.linear.OpenMapRealVector", "cosine", "double[]", "<sample:9>"}}), new String[][]{{"combine", "double,double,double[]", "5"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("org.apache.commons.math.exception.DimensionMismatchException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput135() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.linear.OpenMapRealVector", "org.apache.commons.math.linear.OpenMapRealVector", "isNaN", new String[]{}, new String[]{}, false);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getData=[], getDimension=0, getL1Norm=0.0, getLInfNorm=0.0, getMaxIndex=-1, getMaxValue=NaN, getMinIndex=-1, getMinValue=NaN, getNorm=0.0, getSparsity=NaN, isInfinite=false, isNaN=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput136() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math.linear.OpenMapRealVector", "org.apache.commons.math.linear.OpenMapRealVector", "add", new String[]{"org.apache.commons.math.linear.OpenMapRealVector"}, new String[]{"<sample:1>"}, false, 0, new String[][]{{"org.apache.commons.math.linear.OpenMapRealVector", "append", "org.apache.commons.math.linear.RealVector", "<sample:3>"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("org.apache.commons.math.exception.DimensionMismatchException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput137() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.linear.OpenMapRealVector", "org.apache.commons.math.linear.OpenMapRealVector", "getL1Distance", new String[]{"org.apache.commons.math.linear.OpenMapRealVector"}, new String[]{"<sample:4>"}, false, 3, new String[][]{{"org.apache.commons.math.linear.OpenMapRealVector", "mapSubtractToSelf", "double", "8772222695580707260"}});
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("Infinity", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getData=[-Infinity, -8.7722226955807068E18], getDimension=2, getL1Norm=Infinity, getLInfNorm=Infinity, getMaxIndex=1, getMaxValue=-8.7722226955807068E18, getMinIndex=0, getMinValue=-Infinity, getNorm...#257#394189105", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput138() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.linear.OpenMapRealVector", "org.apache.commons.math.linear.OpenMapRealVector", "getL1Distance", new String[]{"org.apache.commons.math.linear.OpenMapRealVector"}, new String[]{"<sample:3>"}, false, 3, new String[][]{{"org.apache.commons.math.linear.OpenMapRealVector", "mapSubtractToSelf", "double", "8772222695580707260"}, {"org.apache.commons.math.linear.OpenMapRealVector", "dotProduct", "org.apache.commons.math.linear.RealVector", "<sample:5>"}});
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("NaN", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getData=[-Infinity, -8.7722226955807068E18], getDimension=2, getL1Norm=Infinity, getLInfNorm=Infinity, getMaxIndex=1, getMaxValue=-8.7722226955807068E18, getMinIndex=0, getMinValue=-Infinity, getNorm...#257#394189105", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput139() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math.linear.OpenMapRealVector", "org.apache.commons.math.linear.OpenMapRealVector", "getL1Distance", new String[]{"org.apache.commons.math.linear.OpenMapRealVector"}, new String[]{"<sample:0>"}, false, 3, new String[][]{{"org.apache.commons.math.linear.OpenMapRealVector", "mapSubtractToSelf", "double", "8772222695580707260"}, {"org.apache.commons.math.linear.OpenMapRealVector", "dotProduct", "org.apache.commons.math.linear.RealVector", "<sample:5>"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("org.apache.commons.math.exception.OutOfRangeException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput140() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.linear.OpenMapRealVector", "org.apache.commons.math.linear.OpenMapRealVector", "getL1Distance", new String[]{"org.apache.commons.math.linear.OpenMapRealVector"}, new String[]{"<sample:1>"}, false, 9, new String[][]{{"org.apache.commons.math.linear.OpenMapRealVector", "combineToSelf", "double,double,double[]", "1.7976931348623157E308", "-1.0", "<sample:2>"}});
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("Infinity", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getData=[0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0], getDimension=7, getL1Norm=0.0, getLInfNorm=0.0, getMaxIndex=6, getMaxValue=0.0, getMinIndex=6, getMinValue=0.0, getNorm=0.0, getSparsity=0.0, isInfinite=f...#218#917164721", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput141() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.linear.OpenMapRealVector", "org.apache.commons.math.linear.OpenMapRealVector", "getL1Distance", new String[]{"org.apache.commons.math.linear.OpenMapRealVector"}, new String[]{"<sample:4>"}, false, 9, new String[][]{{"org.apache.commons.math.linear.OpenMapRealVector", "combineToSelf", "double,double,double[]", "1.7976931348623157E308", "-1.0", "<sample:1>"}});
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("3.0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getData=[0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0], getDimension=7, getL1Norm=0.0, getLInfNorm=0.0, getMaxIndex=6, getMaxValue=0.0, getMinIndex=6, getMinValue=0.0, getNorm=0.0, getSparsity=0.0, isInfinite=f...#218#917164721", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput142() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math.linear.OpenMapRealVector", "org.apache.commons.math.linear.OpenMapRealVector", "getL1Distance", new String[]{"org.apache.commons.math.linear.OpenMapRealVector"}, new String[]{"<null>"}, false, 9, new String[][]{{"org.apache.commons.math.linear.OpenMapRealVector", "combineToSelf", "double,double,double[]", "1.7976931348623157E308", "-1.0", "<sample:1>"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput143() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.linear.OpenMapRealVector", "org.apache.commons.math.linear.OpenMapRealVector", "hashCode", new String[]{}, new String[]{}, false);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("-818727111", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getData=[], getDimension=0, getL1Norm=0.0, getLInfNorm=0.0, getMaxIndex=-1, getMaxValue=NaN, getMinIndex=-1, getMinValue=NaN, getNorm=0.0, getSparsity=NaN, isInfinite=false, isNaN=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput144() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.linear.OpenMapRealVector", "org.apache.commons.math.linear.OpenMapRealVector", "hashCode", new String[]{}, new String[]{}, false, 1, new String[][]{});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("-1694978236", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getData=[1.0, Infinity, -Infinity], getDimension=3, getL1Norm=Infinity, getLInfNorm=Infinity, getMaxIndex=1, getMaxValue=Infinity, getMinIndex=2, getMinValue=-Infinity, getNorm=Infinity, getSparsity=...#234#-614213921", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput145() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.linear.OpenMapRealVector", "org.apache.commons.math.linear.OpenMapRealVector", "hashCode", new String[]{}, new String[]{}, false, 2, new String[][]{});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("-818727110", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getData=[0.0], getDimension=1, getL1Norm=0.0, getLInfNorm=0.0, getMaxIndex=0, getMaxValue=0.0, getMinIndex=0, getMinValue=0.0, getNorm=0.0, getSparsity=0.0, isInfinite=false, isNaN=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput146() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.linear.OpenMapRealVector", "org.apache.commons.math.linear.OpenMapRealVector", "hashCode", new String[]{}, new String[]{}, false, 3, new String[][]{});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("-1925032837", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getData=[-Infinity, -1.0], getDimension=2, getL1Norm=Infinity, getLInfNorm=Infinity, getMaxIndex=1, getMaxValue=-1.0, getMinIndex=0, getMinValue=-Infinity, getNorm=Infinity, getSparsity=1.0, isInfini...#221#-774438889", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput147() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.linear.OpenMapRealVector", "org.apache.commons.math.linear.OpenMapRealVector", "hashCode", new String[]{}, new String[]{}, false, 4, new String[][]{{"org.apache.commons.math.linear.OpenMapRealVector", "getSparsity", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("-1694978236", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getData=[-1.0, -1.0, -1.0], getDimension=3, getL1Norm=3.0, getLInfNorm=1.0, getMaxIndex=2, getMaxValue=-1.0, getMinIndex=2, getMinValue=-1.0, getNorm=1.7320508075688772, getSparsity=1.0, isInfinite=f...#218#-325937176", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput148() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.linear.OpenMapRealVector", "org.apache.commons.math.linear.OpenMapRealVector", "hashCode", new String[]{}, new String[]{}, false, 6, new String[][]{{"org.apache.commons.math.linear.OpenMapRealVector", "getSparsity", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("-1205979767", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getData=[Infinity, -Infinity, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0], getDimension=8, getL1Norm=Infinity, getLInfNorm=Infinity, getMaxIndex=0, getMaxValue=Infinity, getMinIndex=1, getMinValue=-Infinity, getNo...#260#-518583913", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput149() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.linear.OpenMapRealVector", "org.apache.commons.math.linear.OpenMapRealVector", "hashCode", new String[]{}, new String[]{}, false, 7, new String[][]{{"org.apache.commons.math.linear.OpenMapRealVector", "getSparsity", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("-1205984572", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getData=[Infinity, -Infinity, 0.0], getDimension=3, getL1Norm=Infinity, getLInfNorm=Infinity, getMaxIndex=0, getMaxValue=Infinity, getMinIndex=1, getMinValue=-Infinity, getNorm=Infinity, getSparsity=...#249#903803555", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput150() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.linear.OpenMapRealVector", "org.apache.commons.math.linear.OpenMapRealVector", "hashCode", new String[]{}, new String[]{}, false, 8, new String[][]{});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("-32504889", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getData=[0.0, 0.0, 0.0, 0.0, 0.0, 0.0], getDimension=6, getL1Norm=0.0, getLInfNorm=0.0, getMaxIndex=5, getMaxValue=0.0, getMinIndex=5, getMinValue=0.0, getNorm=0.0, getSparsity=0.0, isInfinite=false,...#213#-1142613006", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput151() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.linear.OpenMapRealVector", "org.apache.commons.math.linear.OpenMapRealVector", "hashCode", new String[]{}, new String[]{}, false, 9, new String[][]{{"org.apache.commons.math.linear.OpenMapRealVector", "ebeDivide", "double[]", "<sample:0>"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("-818727104", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getData=[0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0], getDimension=7, getL1Norm=0.0, getLInfNorm=0.0, getMaxIndex=6, getMaxValue=0.0, getMinIndex=6, getMinValue=0.0, getNorm=0.0, getSparsity=0.0, isInfinite=f...#218#917164721", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput152() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.linear.OpenMapRealVector", "org.apache.commons.math.linear.OpenMapRealVector", "hashCode", new String[]{}, new String[]{}, false, 10, new String[][]{{"org.apache.commons.math.linear.OpenMapRealVector", "ebeDivide", "double[]", "<sample:0>"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("1068905916", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getData=[0.0, 1.0, Infinity], getDimension=3, getL1Norm=Infinity, getLInfNorm=Infinity, getMaxIndex=2, getMaxValue=Infinity, getMinIndex=0, getMinValue=0.0, getNorm=Infinity, getSparsity=1.0, isInfin...#222#1305061558", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput153() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.linear.OpenMapRealVector", "org.apache.commons.math.linear.OpenMapRealVector", "add", new String[]{"org.apache.commons.math.linear.OpenMapRealVector"}, new String[]{"<sample:4>"}, false, 1, new String[][]{});
  assertNotNull(actual);
  assertEquals("org.apache.commons.math.linear.OpenMapRealVector", actual.getClass().getName());
  assertEquals("{getData=[0.0, Infinity, -Infinity], getDimension=3, getL1Norm=Infinity, getLInfNorm=Infinity, getMaxIndex=1, getMaxValue=Infinity, getMinIndex=2, getMinValue=-Infinity, getNorm=Infinity, getSparsity=...#249#378274133", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getData=[1.0, Infinity, -Infinity], getDimension=3, getL1Norm=Infinity, getLInfNorm=Infinity, getMaxIndex=1, getMaxValue=Infinity, getMinIndex=2, getMinValue=-Infinity, getNorm=Infinity, getSparsity=...#234#-614213921", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput154() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.linear.OpenMapRealVector", "org.apache.commons.math.linear.OpenMapRealVector", "add", new String[]{"org.apache.commons.math.linear.OpenMapRealVector"}, new String[]{"<sample:7>"}, false, 1, new String[][]{});
  assertNotNull(actual);
  assertEquals("org.apache.commons.math.linear.OpenMapRealVector", actual.getClass().getName());
  assertEquals("{getData=[Infinity, NaN, -Infinity], getDimension=3, getL1Norm=NaN, getLInfNorm=NaN, getMaxIndex=0, getMaxValue=Infinity, getMinIndex=2, getMinValue=-Infinity, getNorm=NaN, getSparsity=1.0, isInfinite...#219#-1257614215", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getData=[1.0, Infinity, -Infinity], getDimension=3, getL1Norm=Infinity, getLInfNorm=Infinity, getMaxIndex=1, getMaxValue=Infinity, getMinIndex=2, getMinValue=-Infinity, getNorm=Infinity, getSparsity=...#234#-614213921", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput155() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math.linear.OpenMapRealVector", "org.apache.commons.math.linear.OpenMapRealVector", "add", new String[]{"org.apache.commons.math.linear.OpenMapRealVector"}, new String[]{"<null>"}, false); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput156() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math.linear.OpenMapRealVector", "org.apache.commons.math.linear.OpenMapRealVector", "add", new String[]{"org.apache.commons.math.linear.OpenMapRealVector"}, new String[]{"<sample:0>"}, false), new String[][]{{"mapAdd", "double", "5"}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.math.linear.OpenMapRealVector", actual.getClass().getName());
  assertEquals("{getData=[], getDimension=0, getL1Norm=0.0, getLInfNorm=0.0, getMaxIndex=-1, getMaxValue=NaN, getMinIndex=-1, getMinValue=NaN, getNorm=0.0, getSparsity=NaN, isInfinite=false, isNaN=false}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getData=[], getDimension=0, getL1Norm=0.0, getLInfNorm=0.0, getMaxIndex=-1, getMaxValue=NaN, getMinIndex=-1, getMinValue=NaN, getNorm=0.0, getSparsity=NaN, isInfinite=false, isNaN=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput157() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.linear.OpenMapRealVector", "org.apache.commons.math.linear.OpenMapRealVector", "equals", new String[]{"java.lang.Object"}, new String[]{"<s:7ke>"}, false);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getData=[], getDimension=0, getL1Norm=0.0, getLInfNorm=0.0, getMaxIndex=-1, getMaxValue=NaN, getMinIndex=-1, getMinValue=NaN, getNorm=0.0, getSparsity=NaN, isInfinite=false, isNaN=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput158() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.linear.OpenMapRealVector", "org.apache.commons.math.linear.OpenMapRealVector", "equals", new String[]{"java.lang.Object"}, new String[]{"<s:7lf>"}, false, 4, new String[][]{});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getData=[-1.0, -1.0, -1.0], getDimension=3, getL1Norm=3.0, getLInfNorm=1.0, getMaxIndex=2, getMaxValue=-1.0, getMinIndex=2, getMinValue=-1.0, getNorm=1.7320508075688772, getSparsity=1.0, isInfinite=f...#218#-325937176", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput159() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.linear.OpenMapRealVector", "org.apache.commons.math.linear.OpenMapRealVector", "equals", new String[]{"java.lang.Object"}, new String[]{"<s:7lf>"}, false, 3, new String[][]{});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getData=[-Infinity, -1.0], getDimension=2, getL1Norm=Infinity, getLInfNorm=Infinity, getMaxIndex=1, getMaxValue=-1.0, getMinIndex=0, getMinValue=-Infinity, getNorm=Infinity, getSparsity=1.0, isInfini...#221#-774438889", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput160() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.linear.OpenMapRealVector", "org.apache.commons.math.linear.OpenMapRealVector", "equals", new String[]{"java.lang.Object"}, new String[]{"<s:7lf>"}, false, 3, new String[][]{{"org.apache.commons.math.linear.OpenMapRealVector", "append", "org.apache.commons.math.linear.OpenMapRealVector", "<sample:2>"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getData=[-Infinity, -1.0], getDimension=2, getL1Norm=Infinity, getLInfNorm=Infinity, getMaxIndex=1, getMaxValue=-1.0, getMinIndex=0, getMinValue=-Infinity, getNorm=Infinity, getSparsity=1.0, isInfini...#221#-774438889", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput161() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.linear.OpenMapRealVector", "org.apache.commons.math.linear.OpenMapRealVector", "equals", new String[]{"java.lang.Object"}, new String[]{"<s:7lf>"}, false, 3, new String[][]{{"org.apache.commons.math.linear.OpenMapRealVector", "append", "org.apache.commons.math.linear.OpenMapRealVector", "<sample:4>"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getData=[-Infinity, -1.0], getDimension=2, getL1Norm=Infinity, getLInfNorm=Infinity, getMaxIndex=1, getMaxValue=-1.0, getMinIndex=0, getMinValue=-Infinity, getNorm=Infinity, getSparsity=1.0, isInfini...#221#-774438889", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput162() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math.linear.OpenMapRealVector", "org.apache.commons.math.linear.OpenMapRealVector", "getDistance", new String[]{"double[]"}, new String[]{"<null>"}, false, 6, new String[][]{{"org.apache.commons.math.linear.OpenMapRealVector", "getL1Norm", ""}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput163() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math.linear.OpenMapRealVector", "org.apache.commons.math.linear.OpenMapRealVector", "getL1Distance", new String[]{"org.apache.commons.math.linear.RealVector"}, new String[]{"<sample:2>"}, false, 0, new String[][]{{"org.apache.commons.math.linear.OpenMapRealVector", "checkVectorDimensions", "org.apache.commons.math.linear.RealVector", "<sample:0>"}, {"org.apache.commons.math.linear.OpenMapRealVector", "outerProduct", "org.apache.commons.math.linear.RealVector", "<sample:0>"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("org.apache.commons.math.exception.DimensionMismatchException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput164() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.linear.OpenMapRealVector", "org.apache.commons.math.linear.OpenMapRealVector", "getL1Distance", new String[]{"org.apache.commons.math.linear.RealVector"}, new String[]{"<sample:6>"}, false, 0, new String[][]{{"org.apache.commons.math.linear.OpenMapRealVector", "checkVectorDimensions", "org.apache.commons.math.linear.RealVector", "<sample:0>"}});
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("0.0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getData=[], getDimension=0, getL1Norm=0.0, getLInfNorm=0.0, getMaxIndex=-1, getMaxValue=NaN, getMinIndex=-1, getMinValue=NaN, getNorm=0.0, getSparsity=NaN, isInfinite=false, isNaN=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput165() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math.linear.OpenMapRealVector", "org.apache.commons.math.linear.OpenMapRealVector", "getEntry", new String[]{"int"}, new String[]{"2147483647"}, false); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("org.apache.commons.math.exception.OutOfRangeException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput166() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.linear.OpenMapRealVector", "org.apache.commons.math.linear.OpenMapRealVector", "mapDivideToSelf", new String[]{"double"}, new String[]{"1.7976931348623157E308"}, false, 7, new String[][]{{"org.apache.commons.math.linear.OpenMapRealVector", "map", "org.apache.commons.math.analysis.UnivariateRealFunction", "<sample:6>"}, {"org.apache.commons.math.linear.OpenMapRealVector", "outerProduct", "double[]", "<sample:5>"}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.math.linear.OpenMapRealVector", actual.getClass().getName());
  assertEquals("{getData=[Infinity, -Infinity, 0.0], getDimension=3, getL1Norm=Infinity, getLInfNorm=Infinity, getMaxIndex=0, getMaxValue=Infinity, getMinIndex=1, getMinValue=-Infinity, getNorm=Infinity, getSparsity=...#249#903803555", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getData=[Infinity, -Infinity, 0.0], getDimension=3, getL1Norm=Infinity, getLInfNorm=Infinity, getMaxIndex=0, getMaxValue=Infinity, getMinIndex=1, getMinValue=-Infinity, getNorm=Infinity, getSparsity=...#249#903803555", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput167() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.linear.OpenMapRealVector", "org.apache.commons.math.linear.OpenMapRealVector", "mapDivideToSelf", new String[]{"double"}, new String[]{"Infinity"}, false, 7, new String[][]{{"org.apache.commons.math.linear.OpenMapRealVector", "map", "org.apache.commons.math.analysis.UnivariateRealFunction", "<sample:6>"}, {"org.apache.commons.math.linear.OpenMapRealVector", "outerProduct", "double[]", "<sample:5>"}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.math.linear.OpenMapRealVector", actual.getClass().getName());
  assertEquals("{getData=[NaN, NaN, 0.0], getDimension=3, getL1Norm=NaN, getLInfNorm=NaN, getMaxIndex=2, getMaxValue=0.0, getMinIndex=2, getMinValue=0.0, getNorm=NaN, getSparsity=0.6666666666666666, isInfinite=false,...#212#587238529", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getData=[NaN, NaN, 0.0], getDimension=3, getL1Norm=NaN, getLInfNorm=NaN, getMaxIndex=2, getMaxValue=0.0, getMinIndex=2, getMinValue=0.0, getNorm=NaN, getSparsity=0.6666666666666666, isInfinite=false,...#212#587238529", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput168() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math.linear.OpenMapRealVector", "org.apache.commons.math.linear.OpenMapRealVector", "getSubVector", new String[]{"int", "int"}, new String[]{"1", "1"}, false, 0, new String[][]{{"org.apache.commons.math.linear.OpenMapRealVector", "getLInfDistance", "org.apache.commons.math.linear.RealVector", "<sample:4>"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("org.apache.commons.math.exception.OutOfRangeException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput169() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.linear.OpenMapRealVector", "org.apache.commons.math.linear.OpenMapRealVector", "getSubVector", new String[]{"int", "int"}, new String[]{"1", "1"}, false, 3, new String[][]{{"org.apache.commons.math.linear.OpenMapRealVector", "checkVectorDimensions", "org.apache.commons.math.linear.RealVector", "<sample:0>"}, {"org.apache.commons.math.linear.OpenMapRealVector", "getLInfDistance", "org.apache.commons.math.linear.RealVector", "<sample:4>"}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.math.linear.OpenMapRealVector", actual.getClass().getName());
  assertEquals("{getData=[-1.0], getDimension=1, getL1Norm=1.0, getLInfNorm=1.0, getMaxIndex=0, getMaxValue=-1.0, getMinIndex=0, getMinValue=-1.0, getNorm=1.0, getSparsity=1.0, isInfinite=false, isNaN=false}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getData=[-Infinity, -1.0], getDimension=2, getL1Norm=Infinity, getLInfNorm=Infinity, getMaxIndex=1, getMaxValue=-1.0, getMinIndex=0, getMinValue=-Infinity, getNorm=Infinity, getSparsity=1.0, isInfini...#221#-774438889", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput170() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.linear.OpenMapRealVector", "org.apache.commons.math.linear.OpenMapRealVector", "getSubVector", new String[]{"int", "int"}, new String[]{"0", "1"}, false, 3, new String[][]{{"org.apache.commons.math.linear.OpenMapRealVector", "checkVectorDimensions", "org.apache.commons.math.linear.RealVector", "<sample:1>"}, {"org.apache.commons.math.linear.OpenMapRealVector", "getLInfDistance", "org.apache.commons.math.linear.RealVector", "<sample:4>"}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.math.linear.OpenMapRealVector", actual.getClass().getName());
  assertEquals("{getData=[-Infinity], getDimension=1, getL1Norm=Infinity, getLInfNorm=Infinity, getMaxIndex=0, getMaxValue=-Infinity, getMinIndex=0, getMinValue=-Infinity, getNorm=Infinity, getSparsity=1.0, isInfinit...#220#-623142792", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getData=[-Infinity, -1.0], getDimension=2, getL1Norm=Infinity, getLInfNorm=Infinity, getMaxIndex=1, getMaxValue=-1.0, getMinIndex=0, getMinValue=-Infinity, getNorm=Infinity, getSparsity=1.0, isInfini...#221#-774438889", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput171() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math.linear.OpenMapRealVector", "org.apache.commons.math.linear.OpenMapRealVector", "getSubVector", new String[]{"int", "int"}, new String[]{"0", "1"}, false, 3, new String[][]{{"org.apache.commons.math.linear.OpenMapRealVector", "combineToSelf", "double,double,org.apache.commons.math.linear.RealVector", "-1.0", "0.0", "<null>"}}), new String[][]{{"iterator", "", "5"}});
  assertNotNull(actual);
  assertEquals("receiver state after the call", "{getData=[-Infinity, -1.0], getDimension=2, getL1Norm=Infinity, getLInfNorm=Infinity, getMaxIndex=1, getMaxValue=-1.0, getMinIndex=0, getMinValue=-Infinity, getNorm=Infinity, getSparsity=1.0, isInfini...#221#-774438889", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput172() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math.linear.OpenMapRealVector", "org.apache.commons.math.linear.OpenMapRealVector", "getSubVector", new String[]{"int", "int"}, new String[]{"0", "1"}, false, 3, new String[][]{{"org.apache.commons.math.linear.OpenMapRealVector", "combineToSelf", "double,double,org.apache.commons.math.linear.RealVector", "-1.0", "0.0", "<null>"}}), new String[][]{{"iterator", "", "5"}, {"next", "", "5"}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.math.linear.AbstractRealVector$EntryImpl", actual.getClass().getName());
  assertEquals("{getIndex=0, getValue=-Infinity}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getData=[-Infinity, -1.0], getDimension=2, getL1Norm=Infinity, getLInfNorm=Infinity, getMaxIndex=1, getMaxValue=-1.0, getMinIndex=0, getMinValue=-Infinity, getNorm=Infinity, getSparsity=1.0, isInfini...#221#-774438889", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput173() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math.linear.OpenMapRealVector", "org.apache.commons.math.linear.OpenMapRealVector", "setSubVector", new String[]{"int", "double[]"}, new String[]{"-1", "<null>"}, false); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("org.apache.commons.math.exception.OutOfRangeException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput174() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.linear.OpenMapRealVector", "org.apache.commons.math.linear.OpenMapRealVector", "getLInfDistance", new String[]{"org.apache.commons.math.linear.RealVector"}, new String[]{"<sample:6>"}, false, 0, new String[][]{{"org.apache.commons.math.linear.OpenMapRealVector", "setSubVector", "int,double[]", "-2147483648", "<sample:1>"}});
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("0.0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getData=[], getDimension=0, getL1Norm=0.0, getLInfNorm=0.0, getMaxIndex=-1, getMaxValue=NaN, getMinIndex=-1, getMinValue=NaN, getNorm=0.0, getSparsity=NaN, isInfinite=false, isNaN=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput175() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math.linear.OpenMapRealVector", "org.apache.commons.math.linear.OpenMapRealVector", "combine", new String[]{"double", "double", "double[]"}, new String[]{"1.0", "-1.0", "<null>"}, false); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("org.apache.commons.math.exception.NullArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput176() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.linear.OpenMapRealVector", "org.apache.commons.math.linear.OpenMapRealVector", "combine", new String[]{"double", "double", "double[]"}, new String[]{"3.5", "NaN", "<sample:8>"}, false, 1, new String[][]{});
  assertNotNull(actual);
  assertEquals("org.apache.commons.math.linear.OpenMapRealVector", actual.getClass().getName());
  assertEquals("{getData=[NaN, NaN, NaN], getDimension=3, getL1Norm=NaN, getLInfNorm=NaN, getMaxIndex=-1, getMaxValue=NaN, getMinIndex=-1, getMinValue=NaN, getNorm=NaN, getSparsity=1.0, isInfinite=false, isNaN=true}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getData=[1.0, Infinity, -Infinity], getDimension=3, getL1Norm=Infinity, getLInfNorm=Infinity, getMaxIndex=1, getMaxValue=Infinity, getMinIndex=2, getMinValue=-Infinity, getNorm=Infinity, getSparsity=...#234#-614213921", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput177() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math.linear.OpenMapRealVector", "org.apache.commons.math.linear.OpenMapRealVector", "unitVector", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.math.linear.OpenMapRealVector", "ebeDivide", "org.apache.commons.math.linear.RealVector", "<null>"}, {"org.apache.commons.math.linear.OpenMapRealVector", "setSubVector", "int,double[]", "-2147483648", "<sample:0>"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("org.apache.commons.math.exception.MathArithmeticException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput178() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.linear.OpenMapRealVector", "org.apache.commons.math.linear.OpenMapRealVector", "unitVector", new String[]{}, new String[]{}, false, 1, new String[][]{{"org.apache.commons.math.linear.OpenMapRealVector", "ebeDivide", "org.apache.commons.math.linear.RealVector", "<null>"}, {"org.apache.commons.math.linear.OpenMapRealVector", "setSubVector", "int,double[]", "-2147483648", "<sample:0>"}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.math.linear.OpenMapRealVector", actual.getClass().getName());
  assertEquals("{getData=[0.0, NaN, NaN], getDimension=3, getL1Norm=NaN, getLInfNorm=NaN, getMaxIndex=0, getMaxValue=0.0, getMinIndex=0, getMinValue=0.0, getNorm=NaN, getSparsity=1.0, isInfinite=false, isNaN=true}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getData=[1.0, Infinity, -Infinity], getDimension=3, getL1Norm=Infinity, getLInfNorm=Infinity, getMaxIndex=1, getMaxValue=Infinity, getMinIndex=2, getMinValue=-Infinity, getNorm=Infinity, getSparsity=...#234#-614213921", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput179() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.linear.OpenMapRealVector", "org.apache.commons.math.linear.OpenMapRealVector", "unitVector", new String[]{}, new String[]{}, false, 3, new String[][]{{"org.apache.commons.math.linear.OpenMapRealVector", "ebeDivide", "org.apache.commons.math.linear.RealVector", "<null>"}, {"org.apache.commons.math.linear.OpenMapRealVector", "setSubVector", "int,double[]", "-2147483648", "<sample:0>"}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.math.linear.OpenMapRealVector", actual.getClass().getName());
  assertEquals("{getData=[NaN, -0.0], getDimension=2, getL1Norm=NaN, getLInfNorm=NaN, getMaxIndex=1, getMaxValue=-0.0, getMinIndex=1, getMinValue=-0.0, getNorm=NaN, getSparsity=1.0, isInfinite=false, isNaN=true}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getData=[-Infinity, -1.0], getDimension=2, getL1Norm=Infinity, getLInfNorm=Infinity, getMaxIndex=1, getMaxValue=-1.0, getMinIndex=0, getMinValue=-Infinity, getNorm=Infinity, getSparsity=1.0, isInfini...#221#-774438889", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput180() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.linear.OpenMapRealVector", "org.apache.commons.math.linear.OpenMapRealVector", "unitVector", new String[]{}, new String[]{}, false, 4, new String[][]{{"org.apache.commons.math.linear.OpenMapRealVector", "ebeDivide", "org.apache.commons.math.linear.RealVector", "<sample:4>"}, {"org.apache.commons.math.linear.OpenMapRealVector", "setSubVector", "int,double[]", "-2147483648", "<sample:0>"}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.math.linear.OpenMapRealVector", actual.getClass().getName());
  assertEquals("{getData=[-0.5773502691896258, -0.5773502691896258, -0.57735026918962.., getDimension=3, getL1Norm=1.7320508075688776, getLInfNorm=0.5773502691896258, getMaxIndex=2, getMaxValue=-0.5773502691896258, g...#307#785339052", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getData=[-1.0, -1.0, -1.0], getDimension=3, getL1Norm=3.0, getLInfNorm=1.0, getMaxIndex=2, getMaxValue=-1.0, getMinIndex=2, getMinValue=-1.0, getNorm=1.7320508075688772, getSparsity=1.0, isInfinite=f...#218#-325937176", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput181() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.linear.OpenMapRealVector", "org.apache.commons.math.linear.OpenMapRealVector", "unitVector", new String[]{}, new String[]{}, false, 6, new String[][]{{"org.apache.commons.math.linear.OpenMapRealVector", "ebeDivide", "org.apache.commons.math.linear.RealVector", "<sample:4>"}, {"org.apache.commons.math.linear.OpenMapRealVector", "setSubVector", "int,double[]", "-2147483648", "<sample:0>"}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.math.linear.OpenMapRealVector", actual.getClass().getName());
  assertEquals("{getData=[NaN, NaN, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0], getDimension=8, getL1Norm=NaN, getLInfNorm=NaN, getMaxIndex=7, getMaxValue=0.0, getMinIndex=7, getMinValue=0.0, getNorm=NaN, getSparsity=0.25, isInfi...#223#-2008092839", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getData=[Infinity, -Infinity, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0], getDimension=8, getL1Norm=Infinity, getLInfNorm=Infinity, getMaxIndex=0, getMaxValue=Infinity, getMinIndex=1, getMinValue=-Infinity, getNo...#260#-518583913", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput182() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math.linear.OpenMapRealVector", "org.apache.commons.math.linear.OpenMapRealVector", "unitVector", new String[]{}, new String[]{}, false, 7, new String[][]{{"org.apache.commons.math.linear.OpenMapRealVector", "ebeDivide", "org.apache.commons.math.linear.RealVector", "<sample:4>"}, {"org.apache.commons.math.linear.OpenMapRealVector", "dotProduct", "org.apache.commons.math.linear.RealVector", "<sample:0>"}, {"org.apache.commons.math.linear.OpenMapRealVector", "setSubVector", "int,double[]", "-2147483648", "<sample:2>"}}), new String[][]{{"mapMultiply", "double", "4"}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.math.linear.OpenMapRealVector", actual.getClass().getName());
  assertEquals("{getData=[NaN, NaN, NaN], getDimension=3, getL1Norm=NaN, getLInfNorm=NaN, getMaxIndex=-1, getMaxValue=NaN, getMinIndex=-1, getMinValue=NaN, getNorm=NaN, getSparsity=1.0, isInfinite=false, isNaN=true}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getData=[Infinity, -Infinity, 0.0], getDimension=3, getL1Norm=Infinity, getLInfNorm=Infinity, getMaxIndex=0, getMaxValue=Infinity, getMinIndex=1, getMinValue=-Infinity, getNorm=Infinity, getSparsity=...#249#903803555", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput183() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math.linear.OpenMapRealVector", "org.apache.commons.math.linear.OpenMapRealVector", "unitVector", new String[]{}, new String[]{}, false, 8, new String[][]{{"org.apache.commons.math.linear.OpenMapRealVector", "ebeDivide", "org.apache.commons.math.linear.RealVector", "<sample:4>"}, {"org.apache.commons.math.linear.OpenMapRealVector", "dotProduct", "org.apache.commons.math.linear.RealVector", "<sample:0>"}, {"org.apache.commons.math.linear.OpenMapRealVector", "setSubVector", "int,double[]", "-2147483648", "<sample:8>"}}), new String[][]{{"mapMultiply", "double", "4"}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.math.linear.OpenMapRealVector", actual.getClass().getName());
  assertEquals("{getData=[NaN, NaN, NaN, NaN, NaN, NaN], getDimension=6, getL1Norm=NaN, getLInfNorm=NaN, getMaxIndex=-1, getMaxValue=NaN, getMinIndex=-1, getMinValue=NaN, getNorm=NaN, getSparsity=1.0, isInfinite=fals...#214#904506707", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getData=[0.0, 0.0, 0.0, 0.0, 0.0, 0.0], getDimension=6, getL1Norm=0.0, getLInfNorm=0.0, getMaxIndex=5, getMaxValue=0.0, getMinIndex=5, getMinValue=0.0, getNorm=0.0, getSparsity=0.0, isInfinite=false,...#213#-1142613006", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput184() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math.linear.OpenMapRealVector", "org.apache.commons.math.linear.OpenMapRealVector", "unitVector", new String[]{}, new String[]{}, false, 10, new String[][]{{"org.apache.commons.math.linear.OpenMapRealVector", "ebeDivide", "org.apache.commons.math.linear.RealVector", "<sample:4>"}, {"org.apache.commons.math.linear.OpenMapRealVector", "dotProduct", "org.apache.commons.math.linear.RealVector", "<sample:0>"}}), new String[][]{{"mapMultiply", "double", "4"}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.math.linear.OpenMapRealVector", actual.getClass().getName());
  assertEquals("{getData=[NaN, NaN, NaN], getDimension=3, getL1Norm=NaN, getLInfNorm=NaN, getMaxIndex=-1, getMaxValue=NaN, getMinIndex=-1, getMinValue=NaN, getNorm=NaN, getSparsity=1.0, isInfinite=false, isNaN=true}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getData=[0.0, 1.0, Infinity], getDimension=3, getL1Norm=Infinity, getLInfNorm=Infinity, getMaxIndex=2, getMaxValue=Infinity, getMinIndex=0, getMinValue=0.0, getNorm=Infinity, getSparsity=1.0, isInfin...#222#1305061558", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput185() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math.linear.OpenMapRealVector", "org.apache.commons.math.linear.OpenMapRealVector", "add", new String[]{"org.apache.commons.math.linear.OpenMapRealVector"}, new String[]{"<sample:3>"}, false, 6, new String[][]{{"org.apache.commons.math.linear.OpenMapRealVector", "copy", ""}, {"org.apache.commons.math.linear.OpenMapRealVector", "append", "double", "1.0E-12"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("org.apache.commons.math.exception.DimensionMismatchException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput186() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math.linear.OpenMapRealVector", "org.apache.commons.math.linear.OpenMapRealVector", "append", new String[]{"org.apache.commons.math.linear.OpenMapRealVector"}, new String[]{"<null>"}, false, 0, new String[][]{{"org.apache.commons.math.linear.OpenMapRealVector", "dotProduct", "org.apache.commons.math.linear.OpenMapRealVector", "<null>"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput187() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.linear.OpenMapRealVector", "org.apache.commons.math.linear.OpenMapRealVector", "add", new String[]{"org.apache.commons.math.linear.OpenMapRealVector"}, new String[]{"<sample:6>"}, false, 6, new String[][]{{"org.apache.commons.math.linear.OpenMapRealVector", "copy", ""}, {"org.apache.commons.math.linear.OpenMapRealVector", "append", "double", "5.0E-13"}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.math.linear.OpenMapRealVector", actual.getClass().getName());
  assertEquals("{getData=[Infinity, -Infinity, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0], getDimension=8, getL1Norm=Infinity, getLInfNorm=Infinity, getMaxIndex=0, getMaxValue=Infinity, getMinIndex=1, getMinValue=-Infinity, getNo...#260#-518583913", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getData=[Infinity, -Infinity, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0], getDimension=8, getL1Norm=Infinity, getLInfNorm=Infinity, getMaxIndex=0, getMaxValue=Infinity, getMinIndex=1, getMinValue=-Infinity, getNo...#260#-518583913", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput188() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math.linear.OpenMapRealVector", "org.apache.commons.math.linear.OpenMapRealVector", "setSubVector", new String[]{"int", "org.apache.commons.math.linear.RealVector"}, new String[]{"-1", "<sample:6>"}, false); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("org.apache.commons.math.exception.OutOfRangeException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput189() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math.linear.OpenMapRealVector", "org.apache.commons.math.linear.OpenMapRealVector", "outerProduct", new String[]{"double[]"}, new String[]{"<empty>"}, false, 0, new String[][]{{"org.apache.commons.math.linear.OpenMapRealVector", "checkVectorDimensions", "org.apache.commons.math.linear.RealVector", "<sample:4>"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("org.apache.commons.math.exception.NotStrictlyPositiveException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput190() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math.linear.OpenMapRealVector", "org.apache.commons.math.linear.OpenMapRealVector", "projection", new String[]{"org.apache.commons.math.linear.RealVector"}, new String[]{"<sample:5>"}, false, 5, new String[][]{{"org.apache.commons.math.linear.OpenMapRealVector", "append", "double[]", "<empty>"}, {"org.apache.commons.math.linear.OpenMapRealVector", "getMaxIndex", ""}, {"org.apache.commons.math.linear.OpenMapRealVector", "mapSubtract", "double", "1.0E-12"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("org.apache.commons.math.exception.DimensionMismatchException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput191() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.linear.OpenMapRealVector", "org.apache.commons.math.linear.OpenMapRealVector", "subtract", new String[]{"org.apache.commons.math.linear.RealVector"}, new String[]{"<sample:6>"}, false);
  assertNotNull(actual);
  assertEquals("org.apache.commons.math.linear.OpenMapRealVector", actual.getClass().getName());
  assertEquals("{getData=[], getDimension=0, getL1Norm=0.0, getLInfNorm=0.0, getMaxIndex=-1, getMaxValue=NaN, getMinIndex=-1, getMinValue=NaN, getNorm=0.0, getSparsity=NaN, isInfinite=false, isNaN=false}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getData=[], getDimension=0, getL1Norm=0.0, getLInfNorm=0.0, getMaxIndex=-1, getMaxValue=NaN, getMinIndex=-1, getMinValue=NaN, getNorm=0.0, getSparsity=NaN, isInfinite=false, isNaN=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput192() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.linear.OpenMapRealVector", "org.apache.commons.math.linear.OpenMapRealVector", "getNorm", new String[]{}, new String[]{}, false);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("0.0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getData=[], getDimension=0, getL1Norm=0.0, getLInfNorm=0.0, getMaxIndex=-1, getMaxValue=NaN, getMinIndex=-1, getMinValue=NaN, getNorm=0.0, getSparsity=NaN, isInfinite=false, isNaN=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput193() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.linear.OpenMapRealVector", "org.apache.commons.math.linear.OpenMapRealVector", "append", new String[]{"double"}, new String[]{"1.0"}, false);
  assertNotNull(actual);
  assertEquals("org.apache.commons.math.linear.OpenMapRealVector", actual.getClass().getName());
  assertEquals("{getData=[1.0], getDimension=1, getL1Norm=1.0, getLInfNorm=1.0, getMaxIndex=0, getMaxValue=1.0, getMinIndex=0, getMinValue=1.0, getNorm=1.0, getSparsity=1.0, isInfinite=false, isNaN=false}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getData=[], getDimension=0, getL1Norm=0.0, getLInfNorm=0.0, getMaxIndex=-1, getMaxValue=NaN, getMinIndex=-1, getMinValue=NaN, getNorm=0.0, getSparsity=NaN, isInfinite=false, isNaN=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput194() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math.linear.OpenMapRealVector", "org.apache.commons.math.linear.OpenMapRealVector", "getLInfDistance", new String[]{"double[]"}, new String[]{"<null>"}, false); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput195() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math.linear.OpenMapRealVector", "org.apache.commons.math.linear.OpenMapRealVector", "unitize", new String[]{}, new String[]{}, false); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("org.apache.commons.math.exception.MathArithmeticException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput196() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math.linear.OpenMapRealVector", "org.apache.commons.math.linear.OpenMapRealVector", "subtract", new String[]{"org.apache.commons.math.linear.OpenMapRealVector"}, new String[]{"<sample:1>"}, false, 0, new String[][]{{"org.apache.commons.math.linear.OpenMapRealVector", "getMinValue", ""}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("org.apache.commons.math.exception.DimensionMismatchException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput197() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.linear.OpenMapRealVector", "org.apache.commons.math.linear.OpenMapRealVector", "append", new String[]{"double[]"}, new String[]{"<sample:1>"}, false, 0, new String[][]{{"org.apache.commons.math.linear.OpenMapRealVector", "add", "org.apache.commons.math.linear.RealVector", "<sample:5>"}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.math.linear.OpenMapRealVector", actual.getClass().getName());
  assertEquals("{getData=[0.0, 1.0], getDimension=2, getL1Norm=1.0, getLInfNorm=1.0, getMaxIndex=1, getMaxValue=1.0, getMinIndex=0, getMinValue=0.0, getNorm=1.0, getSparsity=0.5, isInfinite=false, isNaN=false}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getData=[], getDimension=0, getL1Norm=0.0, getLInfNorm=0.0, getMaxIndex=-1, getMaxValue=NaN, getMinIndex=-1, getMinValue=NaN, getNorm=0.0, getSparsity=NaN, isInfinite=false, isNaN=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput198() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math.linear.OpenMapRealVector", "org.apache.commons.math.linear.OpenMapRealVector", "subtract", new String[]{"org.apache.commons.math.linear.RealVector"}, new String[]{"<sample:10>"}, false, 12, new String[][]{{"org.apache.commons.math.linear.OpenMapRealVector", "ebeDivide", "org.apache.commons.math.linear.RealVector", "<sample:5>"}}), new String[][]{{"getMinIndex", "", "6"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("-1", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getData=[], getDimension=0, getL1Norm=0.0, getLInfNorm=0.0, getMaxIndex=-1, getMaxValue=NaN, getMinIndex=-1, getMinValue=NaN, getNorm=0.0, getSparsity=NaN, isInfinite=false, isNaN=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput199() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.linear.OpenMapRealVector", "org.apache.commons.math.linear.OpenMapRealVector", "append", new String[]{"double[]"}, new String[]{"<empty>"}, false, 0, new String[][]{{"org.apache.commons.math.linear.OpenMapRealVector", "getDistance", "org.apache.commons.math.linear.RealVector", "<sample:6>"}, {"org.apache.commons.math.linear.OpenMapRealVector", "getEntry", "int", "10"}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.math.linear.OpenMapRealVector", actual.getClass().getName());
  assertEquals("{getData=[], getDimension=0, getL1Norm=0.0, getLInfNorm=0.0, getMaxIndex=-1, getMaxValue=NaN, getMinIndex=-1, getMinValue=NaN, getNorm=0.0, getSparsity=NaN, isInfinite=false, isNaN=false}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getData=[], getDimension=0, getL1Norm=0.0, getLInfNorm=0.0, getMaxIndex=-1, getMaxValue=NaN, getMinIndex=-1, getMinValue=NaN, getNorm=0.0, getSparsity=NaN, isInfinite=false, isNaN=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput200() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.linear.OpenMapRealVector", "org.apache.commons.math.linear.OpenMapRealVector", "append", new String[]{"double[]"}, new String[]{"<sample:0>"}, false, 0, new String[][]{{"org.apache.commons.math.linear.OpenMapRealVector", "getDistance", "org.apache.commons.math.linear.RealVector", "<sample:6>"}, {"org.apache.commons.math.linear.OpenMapRealVector", "isDefaultValue", "double", "Infinity"}, {"org.apache.commons.math.linear.OpenMapRealVector", "getEntry", "int", "1"}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.math.linear.OpenMapRealVector", actual.getClass().getName());
  assertEquals("{getData=[-1.0], getDimension=1, getL1Norm=1.0, getLInfNorm=1.0, getMaxIndex=0, getMaxValue=-1.0, getMinIndex=0, getMinValue=-1.0, getNorm=1.0, getSparsity=1.0, isInfinite=false, isNaN=false}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getData=[], getDimension=0, getL1Norm=0.0, getLInfNorm=0.0, getMaxIndex=-1, getMaxValue=NaN, getMinIndex=-1, getMinValue=NaN, getNorm=0.0, getSparsity=NaN, isInfinite=false, isNaN=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput201() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.linear.OpenMapRealVector", "org.apache.commons.math.linear.OpenMapRealVector", "copy", new String[]{}, new String[]{}, false);
  assertNotNull(actual);
  assertEquals("org.apache.commons.math.linear.OpenMapRealVector", actual.getClass().getName());
  assertEquals("{getData=[], getDimension=0, getL1Norm=0.0, getLInfNorm=0.0, getMaxIndex=-1, getMaxValue=NaN, getMinIndex=-1, getMinValue=NaN, getNorm=0.0, getSparsity=NaN, isInfinite=false, isNaN=false}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getData=[], getDimension=0, getL1Norm=0.0, getLInfNorm=0.0, getMaxIndex=-1, getMaxValue=NaN, getMinIndex=-1, getMinValue=NaN, getNorm=0.0, getSparsity=NaN, isInfinite=false, isNaN=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput202() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math.linear.OpenMapRealVector", "org.apache.commons.math.linear.OpenMapRealVector", "append", new String[]{"double"}, new String[]{"Infinity"}, false, 4, new String[][]{{"org.apache.commons.math.linear.OpenMapRealVector", "subtract", "double[]", "<empty>"}}), new String[][]{{"mapToSelf", "org.apache.commons.math.analysis.UnivariateRealFunction", "0"}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.math.linear.OpenMapRealVector", actual.getClass().getName());
  assertEquals("{getData=[-Infinity, -Infinity, -Infinity, -Infinity], getDimension=4, getL1Norm=Infinity, getLInfNorm=Infinity, getMaxIndex=3, getMaxValue=-Infinity, getMinIndex=3, getMinValue=-Infinity, getNorm=Inf...#253#1007629272", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getData=[-1.0, -1.0, -1.0], getDimension=3, getL1Norm=3.0, getLInfNorm=1.0, getMaxIndex=2, getMaxValue=-1.0, getMinIndex=2, getMinValue=-1.0, getNorm=1.7320508075688772, getSparsity=1.0, isInfinite=f...#218#-325937176", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput203() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math.linear.OpenMapRealVector", "org.apache.commons.math.linear.OpenMapRealVector", "append", new String[]{"double"}, new String[]{"Infinity"}, false, 4, new String[][]{{"org.apache.commons.math.linear.OpenMapRealVector", "getL1Distance", "org.apache.commons.math.linear.OpenMapRealVector", "<sample:1>"}}), new String[][]{{"mapToSelf", "org.apache.commons.math.analysis.UnivariateRealFunction", "2"}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.math.linear.OpenMapRealVector", actual.getClass().getName());
  assertEquals("{getData=[0.0, 0.0, 0.0, 0.0], getDimension=4, getL1Norm=0.0, getLInfNorm=0.0, getMaxIndex=3, getMaxValue=0.0, getMinIndex=3, getMinValue=0.0, getNorm=0.0, getSparsity=1.0, isInfinite=false, isNaN=fal...#203#802821045", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getData=[-1.0, -1.0, -1.0], getDimension=3, getL1Norm=3.0, getLInfNorm=1.0, getMaxIndex=2, getMaxValue=-1.0, getMinIndex=2, getMinValue=-1.0, getNorm=1.7320508075688772, getSparsity=1.0, isInfinite=f...#218#-325937176", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput204() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math.linear.OpenMapRealVector", "org.apache.commons.math.linear.OpenMapRealVector", "append", new String[]{"double"}, new String[]{"1.7976931348623157E308"}, false, 4, new String[][]{{"org.apache.commons.math.linear.OpenMapRealVector", "getL1Distance", "org.apache.commons.math.linear.OpenMapRealVector", "<sample:4>"}}), new String[][]{{"mapToSelf", "org.apache.commons.math.analysis.UnivariateRealFunction", "6"}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.math.linear.OpenMapRealVector", actual.getClass().getName());
  assertEquals("{getData=[0.24197072451914337, 0.24197072451914337, 0.241970724519143.., getDimension=4, getL1Norm=0.7259121735574301, getLInfNorm=0.24197072451914337, getMaxIndex=2, getMaxValue=0.24197072451914337, ...#307#-1309878171", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getData=[-1.0, -1.0, -1.0], getDimension=3, getL1Norm=3.0, getLInfNorm=1.0, getMaxIndex=2, getMaxValue=-1.0, getMinIndex=2, getMinValue=-1.0, getNorm=1.7320508075688772, getSparsity=1.0, isInfinite=f...#218#-325937176", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput205() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.linear.OpenMapRealVector", "org.apache.commons.math.linear.OpenMapRealVector", "isInfinite", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.math.linear.OpenMapRealVector", "getData", ""}, {"org.apache.commons.math.linear.OpenMapRealVector", "mapAddToSelf", "double", "1.7976931348623157E308"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getData=[], getDimension=0, getL1Norm=0.0, getLInfNorm=0.0, getMaxIndex=-1, getMaxValue=NaN, getMinIndex=-1, getMinValue=NaN, getNorm=0.0, getSparsity=NaN, isInfinite=false, isNaN=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput206() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.linear.OpenMapRealVector", "org.apache.commons.math.linear.OpenMapRealVector", "isInfinite", new String[]{}, new String[]{}, false, 1, new String[][]{{"org.apache.commons.math.linear.OpenMapRealVector", "getData", ""}, {"org.apache.commons.math.linear.OpenMapRealVector", "mapAddToSelf", "double", "1.7976931348623157E308"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getData=[1.7976931348623157E308, Infinity, -Infinity], getDimension=3, getL1Norm=Infinity, getLInfNorm=Infinity, getMaxIndex=1, getMaxValue=Infinity, getMinIndex=2, getMinValue=-Infinity, getNorm=Inf...#253#-831004964", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput207() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.linear.OpenMapRealVector", "org.apache.commons.math.linear.OpenMapRealVector", "isInfinite", new String[]{}, new String[]{}, false, 2, new String[][]{{"org.apache.commons.math.linear.OpenMapRealVector", "getData", ""}, {"org.apache.commons.math.linear.OpenMapRealVector", "mapAddToSelf", "double", "1.7976931348623157E308"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getData=[1.7976931348623157E308], getDimension=1, getL1Norm=1.7976931348623157E308, getLInfNorm=1.7976931348623157E308, getMaxIndex=0, getMaxValue=1.7976931348623157E308, getMinIndex=0, getMinValue=1...#288#1498103718", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput208() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.linear.OpenMapRealVector", "org.apache.commons.math.linear.OpenMapRealVector", "isInfinite", new String[]{}, new String[]{}, false, 3, new String[][]{{"org.apache.commons.math.linear.OpenMapRealVector", "getData", ""}, {"org.apache.commons.math.linear.OpenMapRealVector", "mapAddToSelf", "double", "1.7976931348623157E308"}, {"org.apache.commons.math.linear.OpenMapRealVector", "getLInfNorm", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getData=[-Infinity, 1.7976931348623157E308], getDimension=2, getL1Norm=Infinity, getLInfNorm=Infinity, getMaxIndex=1, getMaxValue=1.7976931348623157E308, getMinIndex=0, getMinValue=-Infinity, getNorm...#257#139194411", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput209() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.linear.OpenMapRealVector", "org.apache.commons.math.linear.OpenMapRealVector", "isInfinite", new String[]{}, new String[]{}, false, 4, new String[][]{{"org.apache.commons.math.linear.OpenMapRealVector", "mapAddToSelf", "double", "1.7976931348623157E308"}, {"org.apache.commons.math.linear.OpenMapRealVector", "getLInfNorm", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getData=[1.7976931348623157E308, 1.7976931348623157E308, 1.797693134.., getDimension=3, getL1Norm=Infinity, getLInfNorm=1.7976931348623157E308, getMaxIndex=2, getMaxValue=1.7976931348623157E308, getM...#312#516682311", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput210() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.linear.OpenMapRealVector", "org.apache.commons.math.linear.OpenMapRealVector", "isInfinite", new String[]{}, new String[]{}, false, 6, new String[][]{{"org.apache.commons.math.linear.OpenMapRealVector", "isNaN", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getData=[Infinity, -Infinity, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0], getDimension=8, getL1Norm=Infinity, getLInfNorm=Infinity, getMaxIndex=0, getMaxValue=Infinity, getMinIndex=1, getMinValue=-Infinity, getNo...#260#-518583913", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput211() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.linear.OpenMapRealVector", "org.apache.commons.math.linear.OpenMapRealVector", "isInfinite", new String[]{}, new String[]{}, false, 27, new String[][]{{"org.apache.commons.math.linear.OpenMapRealVector", "dotProduct", "org.apache.commons.math.linear.RealVector", "<sample:0>"}, {"org.apache.commons.math.linear.OpenMapRealVector", "subtract", "org.apache.commons.math.linear.OpenMapRealVector", "<sample:3>"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getData=[Infinity, -Infinity], getDimension=2, getL1Norm=Infinity, getLInfNorm=Infinity, getMaxIndex=0, getMaxValue=Infinity, getMinIndex=1, getMinValue=-Infinity, getNorm=Infinity, getSparsity=1.0, ...#229#-286599679", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput212() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.linear.OpenMapRealVector", "org.apache.commons.math.linear.OpenMapRealVector", "getDistance", new String[]{"org.apache.commons.math.linear.OpenMapRealVector"}, new String[]{"<sample:6>"}, false, 15, new String[][]{{"org.apache.commons.math.linear.OpenMapRealVector", "ebeMultiply", "double[]", "<sample:7>"}});
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("Infinity", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getData=[0.0, 1.0], getDimension=2, getL1Norm=1.0, getLInfNorm=1.0, getMaxIndex=1, getMaxValue=1.0, getMinIndex=0, getMinValue=0.0, getNorm=1.0, getSparsity=0.5, isInfinite=false, isNaN=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput213() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.linear.OpenMapRealVector", "org.apache.commons.math.linear.OpenMapRealVector", "getDistance", new String[]{"org.apache.commons.math.linear.OpenMapRealVector"}, new String[]{"<sample:6>"}, false, 14, new String[][]{{"org.apache.commons.math.linear.OpenMapRealVector", "ebeMultiply", "double[]", "<sample:7>"}, {"org.apache.commons.math.linear.OpenMapRealVector", "getLInfDistance", "double[]", "<empty>"}});
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("Infinity", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getData=[0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0], getDimension=12, getL1Norm=0.0, getLInfNorm=0.0, getMaxIndex=11, getMaxValue=0.0, getMinIndex=11, getMinValue=0.0, getNorm=0.0, g...#246#1646368735", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput214() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math.linear.OpenMapRealVector", "org.apache.commons.math.linear.OpenMapRealVector", "getDistance", new String[]{"org.apache.commons.math.linear.OpenMapRealVector"}, new String[]{"<null>"}, false, 15, new String[][]{{"org.apache.commons.math.linear.OpenMapRealVector", "ebeMultiply", "double[]", "<sample:7>"}, {"org.apache.commons.math.linear.OpenMapRealVector", "getLInfDistance", "double[]", "<empty>"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput215() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math.linear.OpenMapRealVector", "org.apache.commons.math.linear.OpenMapRealVector", "getDistance", new String[]{"org.apache.commons.math.linear.OpenMapRealVector"}, new String[]{"<sample:5>"}, false, 15, new String[][]{{"org.apache.commons.math.linear.OpenMapRealVector", "ebeMultiply", "double[]", "<sample:7>"}, {"org.apache.commons.math.linear.OpenMapRealVector", "getLInfDistance", "double[]", "<empty>"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("org.apache.commons.math.exception.OutOfRangeException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput216() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.linear.OpenMapRealVector", "org.apache.commons.math.linear.OpenMapRealVector", "getDistance", new String[]{"org.apache.commons.math.linear.OpenMapRealVector"}, new String[]{"<sample:4>"}, false, 15, new String[][]{{"org.apache.commons.math.linear.OpenMapRealVector", "mapDivideToSelf", "double", "-1.7976931348623157E308"}, {"org.apache.commons.math.linear.OpenMapRealVector", "getLInfDistance", "double[]", "<empty>"}});
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("1.7320508075688772", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getData=[0.0, -5.562684646268003E-309], getDimension=2, getL1Norm=5.562684646268003E-309, getLInfNorm=5.562684646268003E-309, getMaxIndex=0, getMaxValue=0.0, getMinIndex=1, getMinValue=-5.56268464626...#271#-1005403362", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput217() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.linear.OpenMapRealVector", "org.apache.commons.math.linear.OpenMapRealVector", "getDistance", new String[]{"org.apache.commons.math.linear.OpenMapRealVector"}, new String[]{"<sample:4>"}, false, 15, new String[][]{{"org.apache.commons.math.linear.OpenMapRealVector", "getMinIndex", ""}, {"org.apache.commons.math.linear.OpenMapRealVector", "getLInfDistance", "double[]", "<empty>"}});
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("2.449489742783178", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getData=[0.0, 1.0], getDimension=2, getL1Norm=1.0, getLInfNorm=1.0, getMaxIndex=1, getMaxValue=1.0, getMinIndex=0, getMinValue=0.0, getNorm=1.0, getSparsity=0.5, isInfinite=false, isNaN=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput218() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.linear.OpenMapRealVector", "org.apache.commons.math.linear.OpenMapRealVector", "mapToSelf", new String[]{"org.apache.commons.math.analysis.UnivariateRealFunction"}, new String[]{"<sample:6>"}, false, 0, new String[][]{{"org.apache.commons.math.linear.OpenMapRealVector", "sparseIterator", ""}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.math.linear.OpenMapRealVector", actual.getClass().getName());
  assertEquals("{getData=[], getDimension=0, getL1Norm=0.0, getLInfNorm=0.0, getMaxIndex=-1, getMaxValue=NaN, getMinIndex=-1, getMinValue=NaN, getNorm=0.0, getSparsity=NaN, isInfinite=false, isNaN=false}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getData=[], getDimension=0, getL1Norm=0.0, getLInfNorm=0.0, getMaxIndex=-1, getMaxValue=NaN, getMinIndex=-1, getMinValue=NaN, getNorm=0.0, getSparsity=NaN, isInfinite=false, isNaN=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput219() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.linear.OpenMapRealVector", "org.apache.commons.math.linear.OpenMapRealVector", "isDefaultValue", new String[]{"double"}, new String[]{"1.0E-12"}, false);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getData=[], getDimension=0, getL1Norm=0.0, getLInfNorm=0.0, getMaxIndex=-1, getMaxValue=NaN, getMinIndex=-1, getMinValue=NaN, getNorm=0.0, getSparsity=NaN, isInfinite=false, isNaN=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput220() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.linear.OpenMapRealVector", "org.apache.commons.math.linear.OpenMapRealVector", "mapDivide", new String[]{"double"}, new String[]{"0.0"}, false);
  assertNotNull(actual);
  assertEquals("org.apache.commons.math.linear.OpenMapRealVector", actual.getClass().getName());
  assertEquals("{getData=[], getDimension=0, getL1Norm=0.0, getLInfNorm=0.0, getMaxIndex=-1, getMaxValue=NaN, getMinIndex=-1, getMinValue=NaN, getNorm=0.0, getSparsity=NaN, isInfinite=false, isNaN=false}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getData=[], getDimension=0, getL1Norm=0.0, getLInfNorm=0.0, getMaxIndex=-1, getMaxValue=NaN, getMinIndex=-1, getMinValue=NaN, getNorm=0.0, getSparsity=NaN, isInfinite=false, isNaN=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput221() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.linear.OpenMapRealVector", "org.apache.commons.math.linear.OpenMapRealVector", "getSparsity", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.math.linear.OpenMapRealVector", "equals", "java.lang.Object", "<s:7lf>"}});
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("NaN", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getData=[], getDimension=0, getL1Norm=0.0, getLInfNorm=0.0, getMaxIndex=-1, getMaxValue=NaN, getMinIndex=-1, getMinValue=NaN, getNorm=0.0, getSparsity=NaN, isInfinite=false, isNaN=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput222() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.linear.OpenMapRealVector", "org.apache.commons.math.linear.OpenMapRealVector", "getDimension", new String[]{}, new String[]{}, false, 2, new String[][]{{"org.apache.commons.math.linear.OpenMapRealVector", "checkVectorDimensions", "int", "10"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("1", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getData=[0.0], getDimension=1, getL1Norm=0.0, getLInfNorm=0.0, getMaxIndex=0, getMaxValue=0.0, getMinIndex=0, getMinValue=0.0, getNorm=0.0, getSparsity=0.0, isInfinite=false, isNaN=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput223() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.linear.OpenMapRealVector", "org.apache.commons.math.linear.OpenMapRealVector", "getDistance", new String[]{"org.apache.commons.math.linear.OpenMapRealVector"}, new String[]{"<sample:5>"}, false, 0, new String[][]{{"org.apache.commons.math.linear.OpenMapRealVector", "setSubVector", "int,double[]", "15", "<sample:4>"}, {"org.apache.commons.math.linear.OpenMapRealVector", "iterator", ""}, {"org.apache.commons.math.linear.OpenMapRealVector", "append", "double[]", "<sample:5>"}});
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("0.0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getData=[], getDimension=0, getL1Norm=0.0, getLInfNorm=0.0, getMaxIndex=-1, getMaxValue=NaN, getMinIndex=-1, getMinValue=NaN, getNorm=0.0, getSparsity=NaN, isInfinite=false, isNaN=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput224() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.linear.OpenMapRealVector", "org.apache.commons.math.linear.OpenMapRealVector", "combine", new String[]{"double", "double", "double[]"}, new String[]{"Infinity", "1.7976931348623157E308", "<sample:8>"}, false, 1, new String[][]{{"org.apache.commons.math.linear.OpenMapRealVector", "combineToSelf", "double,double,double[]", "0.0", "0.0", "<sample:7>"}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.math.linear.OpenMapRealVector", actual.getClass().getName());
  assertEquals("{getData=[Infinity, NaN, -Infinity], getDimension=3, getL1Norm=NaN, getLInfNorm=NaN, getMaxIndex=0, getMaxValue=Infinity, getMinIndex=2, getMinValue=-Infinity, getNorm=NaN, getSparsity=1.0, isInfinite...#219#-1257614215", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getData=[1.0, Infinity, -Infinity], getDimension=3, getL1Norm=Infinity, getLInfNorm=Infinity, getMaxIndex=1, getMaxValue=Infinity, getMinIndex=2, getMinValue=-Infinity, getNorm=Infinity, getSparsity=...#234#-614213921", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput225() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.linear.OpenMapRealVector", "org.apache.commons.math.linear.OpenMapRealVector", "getDistance", new String[]{"org.apache.commons.math.linear.OpenMapRealVector"}, new String[]{"<sample:8>"}, false, 15, new String[][]{{"org.apache.commons.math.linear.OpenMapRealVector", "getLInfDistance", "double[]", "<sample:2>"}, {"org.apache.commons.math.linear.OpenMapRealVector", "setSubVector", "int,double[]", "15", "<sample:4>"}, {"org.apache.commons.math.linear.OpenMapRealVector", "mapDivideToSelf", "double", "1.0"}});
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("1.0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getData=[0.0, 1.0], getDimension=2, getL1Norm=1.0, getLInfNorm=1.0, getMaxIndex=1, getMaxValue=1.0, getMinIndex=0, getMinValue=0.0, getNorm=1.0, getSparsity=0.5, isInfinite=false, isNaN=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput226() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math.linear.OpenMapRealVector", "org.apache.commons.math.linear.OpenMapRealVector", "dotProduct", new String[]{"org.apache.commons.math.linear.OpenMapRealVector"}, new String[]{"<sample:2>"}, false); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("org.apache.commons.math.exception.DimensionMismatchException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput227() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.linear.OpenMapRealVector", "org.apache.commons.math.linear.OpenMapRealVector", "getDistance", new String[]{"org.apache.commons.math.linear.OpenMapRealVector"}, new String[]{"<sample:10>"}, false, 15, new String[][]{{"org.apache.commons.math.linear.OpenMapRealVector", "setSubVector", "int,double[]", "15", "<sample:4>"}, {"org.apache.commons.math.linear.OpenMapRealVector", "mapDivideToSelf", "double", "0.1"}});
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("Infinity", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getData=[0.0, 10.0], getDimension=2, getL1Norm=10.0, getLInfNorm=10.0, getMaxIndex=1, getMaxValue=10.0, getMinIndex=0, getMinValue=0.0, getNorm=10.0, getSparsity=0.5, isInfinite=false, isNaN=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput228() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.linear.OpenMapRealVector", "org.apache.commons.math.linear.OpenMapRealVector", "mapDivideToSelf", new String[]{"double"}, new String[]{"Infinity"}, false);
  assertNotNull(actual);
  assertEquals("org.apache.commons.math.linear.OpenMapRealVector", actual.getClass().getName());
  assertEquals("{getData=[], getDimension=0, getL1Norm=0.0, getLInfNorm=0.0, getMaxIndex=-1, getMaxValue=NaN, getMinIndex=-1, getMinValue=NaN, getNorm=0.0, getSparsity=NaN, isInfinite=false, isNaN=false}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getData=[], getDimension=0, getL1Norm=0.0, getLInfNorm=0.0, getMaxIndex=-1, getMaxValue=NaN, getMinIndex=-1, getMinValue=NaN, getNorm=0.0, getSparsity=NaN, isInfinite=false, isNaN=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput229() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.linear.OpenMapRealVector", "org.apache.commons.math.linear.OpenMapRealVector", "append", new String[]{"double"}, new String[]{"-8.7722226955807066E17"}, false);
  assertNotNull(actual);
  assertEquals("org.apache.commons.math.linear.OpenMapRealVector", actual.getClass().getName());
  assertEquals("{getData=[-8.7722226955807066E17], getDimension=1, getL1Norm=8.7722226955807066E17, getLInfNorm=8.7722226955807066E17, getMaxIndex=0, getMaxValue=-8.7722226955807066E17, getMinIndex=0, getMinValue=-8....#299#936479007", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getData=[], getDimension=0, getL1Norm=0.0, getLInfNorm=0.0, getMaxIndex=-1, getMaxValue=NaN, getMinIndex=-1, getMinValue=NaN, getNorm=0.0, getSparsity=NaN, isInfinite=false, isNaN=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput230() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.linear.OpenMapRealVector", "org.apache.commons.math.linear.OpenMapRealVector", "append", new String[]{"double"}, new String[]{"8.7722226955807066E17"}, false);
  assertNotNull(actual);
  assertEquals("org.apache.commons.math.linear.OpenMapRealVector", actual.getClass().getName());
  assertEquals("{getData=[8.7722226955807066E17], getDimension=1, getL1Norm=8.7722226955807066E17, getLInfNorm=8.7722226955807066E17, getMaxIndex=0, getMaxValue=8.7722226955807066E17, getMinIndex=0, getMinValue=8.772...#296#1129997016", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getData=[], getDimension=0, getL1Norm=0.0, getLInfNorm=0.0, getMaxIndex=-1, getMaxValue=NaN, getMinIndex=-1, getMinValue=NaN, getNorm=0.0, getSparsity=NaN, isInfinite=false, isNaN=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput231() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.linear.OpenMapRealVector", "org.apache.commons.math.linear.OpenMapRealVector", "append", new String[]{"double"}, new String[]{"1.75444453911614131E18"}, false);
  assertNotNull(actual);
  assertEquals("org.apache.commons.math.linear.OpenMapRealVector", actual.getClass().getName());
  assertEquals("{getData=[1.75444453911614131E18], getDimension=1, getL1Norm=1.75444453911614131E18, getLInfNorm=1.75444453911614131E18, getMaxIndex=0, getMaxValue=1.75444453911614131E18, getMinIndex=0, getMinValue=1...#302#1479794482", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getData=[], getDimension=0, getL1Norm=0.0, getLInfNorm=0.0, getMaxIndex=-1, getMaxValue=NaN, getMinIndex=-1, getMinValue=NaN, getNorm=0.0, getSparsity=NaN, isInfinite=false, isNaN=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput232() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.linear.OpenMapRealVector", "org.apache.commons.math.linear.OpenMapRealVector", "outerProduct", new String[]{"double[]"}, new String[]{"<sample:1>"}, false, 1, new String[][]{});
  assertNotNull(actual);
  assertEquals("org.apache.commons.math.linear.OpenMapRealMatrix", actual.getClass().getName());
  assertEquals("OpenMapRealMatrix{{0.0,1.0},{NaN,Infinity},{NaN,-Infinity}} {getColumnDimension=2, getData=[[0.0, 1.0], [NaN, Infinity], [NaN, -Infinity]], getFrobeniusNorm=NaN, getNorm=NaN, getRowDimension=3, getTra...#245#-911136366", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getData=[1.0, Infinity, -Infinity], getDimension=3, getL1Norm=Infinity, getLInfNorm=Infinity, getMaxIndex=1, getMaxValue=Infinity, getMinIndex=2, getMinValue=-Infinity, getNorm=Infinity, getSparsity=...#234#-614213921", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput233() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.linear.OpenMapRealVector", "org.apache.commons.math.linear.OpenMapRealVector", "outerProduct", new String[]{"double[]"}, new String[]{"<sample:2>"}, false, 15, new String[][]{});
  assertNotNull(actual);
  assertEquals("org.apache.commons.math.linear.OpenMapRealMatrix", actual.getClass().getName());
  assertEquals("OpenMapRealMatrix{{0.0,0.0,0.0},{1.0,Infinity,-Infinity}} {getColumnDimension=3, getData=[[0.0, 0.0, 0.0], [1.0, Infinity, -Infinity]], getFrobeniusNorm=Infinity, getNorm=Infinity, getRowDimension=2, ...#251#960216472", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getData=[0.0, 1.0], getDimension=2, getL1Norm=1.0, getLInfNorm=1.0, getMaxIndex=1, getMaxValue=1.0, getMinIndex=0, getMinValue=0.0, getNorm=1.0, getSparsity=0.5, isInfinite=false, isNaN=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput234() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math.linear.OpenMapRealVector", "org.apache.commons.math.linear.OpenMapRealVector", "outerProduct", new String[]{"double[]"}, new String[]{"<sample:2>"}, false, 15, new String[][]{}), new String[][]{{"add", "org.apache.commons.math.linear.RealMatrix", "5"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("org.apache.commons.math.linear.MatrixDimensionMismatchException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput235() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math.linear.OpenMapRealVector", "org.apache.commons.math.linear.OpenMapRealVector", "outerProduct", new String[]{"double[]"}, new String[]{"<null>"}, false, 15, new String[][]{{"org.apache.commons.math.linear.OpenMapRealVector", "cosine", "double[]", "<sample:2>"}, {"org.apache.commons.math.linear.OpenMapRealVector", "dotProduct", "org.apache.commons.math.linear.RealVector", "<sample:4>"}, {"org.apache.commons.math.linear.OpenMapRealVector", "outerProduct", "org.apache.commons.math.linear.RealVector", "<sample:0>"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput236() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.linear.OpenMapRealVector", "org.apache.commons.math.linear.OpenMapRealVector", "iterator", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.math.linear.OpenMapRealVector", "getDistance", "double[]", "<null>"}});
  assertNotNull(actual);
  assertEquals("receiver state after the call", "{getData=[], getDimension=0, getL1Norm=0.0, getLInfNorm=0.0, getMaxIndex=-1, getMaxValue=NaN, getMinIndex=-1, getMinValue=NaN, getNorm=0.0, getSparsity=NaN, isInfinite=false, isNaN=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput237() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math.linear.OpenMapRealVector", "org.apache.commons.math.linear.OpenMapRealVector", "projection", new String[]{"org.apache.commons.math.linear.RealVector"}, new String[]{"<null>"}, false, 0, new String[][]{{"org.apache.commons.math.linear.OpenMapRealVector", "outerProduct", "double[]", "<sample:7>"}, {"org.apache.commons.math.linear.OpenMapRealVector", "getEntry", "int", "2147483647"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput238() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math.linear.OpenMapRealVector", "org.apache.commons.math.linear.OpenMapRealVector", "append", new String[]{"double[]"}, new String[]{"<sample:7>"}, false, 0, new String[][]{{"org.apache.commons.math.linear.OpenMapRealVector", "getLInfDistance", "double[]", "<sample:8>"}, {"org.apache.commons.math.linear.OpenMapRealVector", "mapSubtract", "double", "NaN"}}), new String[][]{{"mapAdd", "double", "6"}, {"mapAddToSelf", "double", "7"}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.math.linear.OpenMapRealVector", actual.getClass().getName());
  assertEquals("{getData=[0.0, Infinity], getDimension=2, getL1Norm=Infinity, getLInfNorm=Infinity, getMaxIndex=1, getMaxValue=Infinity, getMinIndex=0, getMinValue=0.0, getNorm=Infinity, getSparsity=0.5, isInfinite=t...#217#-1466561583", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getData=[], getDimension=0, getL1Norm=0.0, getLInfNorm=0.0, getMaxIndex=-1, getMaxValue=NaN, getMinIndex=-1, getMinValue=NaN, getNorm=0.0, getSparsity=NaN, isInfinite=false, isNaN=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput239() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.linear.OpenMapRealVector", "org.apache.commons.math.linear.OpenMapRealVector", "sparseIterator", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.math.linear.OpenMapRealVector", "unitVector", ""}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.math.linear.OpenMapRealVector$OpenMapSparseIterator", actual.getClass().getName());
  assertEquals("{hasNext=false}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getData=[], getDimension=0, getL1Norm=0.0, getLInfNorm=0.0, getMaxIndex=-1, getMaxValue=NaN, getMinIndex=-1, getMinValue=NaN, getNorm=0.0, getSparsity=NaN, isInfinite=false, isNaN=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput240() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.linear.OpenMapRealVector", "org.apache.commons.math.linear.OpenMapRealVector", "sparseIterator", new String[]{}, new String[]{}, false, 11, new String[][]{{"org.apache.commons.math.linear.OpenMapRealVector", "unitVector", ""}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.math.linear.OpenMapRealVector$OpenMapSparseIterator", actual.getClass().getName());
  assertEquals("{hasNext=false}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getData=[0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0], getDimension=9, getL1Norm=0.0, getLInfNorm=0.0, getMaxIndex=8, getMaxValue=0.0, getMinIndex=8, getMinValue=0.0, getNorm=0.0, getSparsity=0.0, is...#228#-297981265", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput241() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.linear.OpenMapRealVector", "org.apache.commons.math.linear.OpenMapRealVector", "sparseIterator", new String[]{}, new String[]{}, false, 11, new String[][]{{"org.apache.commons.math.linear.OpenMapRealVector", "unitVector", ""}, {"org.apache.commons.math.linear.OpenMapRealVector", "mapDivideToSelf", "double", "0.0"}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.math.linear.OpenMapRealVector$OpenMapSparseIterator", actual.getClass().getName());
  assertEquals("{hasNext=true}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getData=[NaN, NaN, NaN, NaN, NaN, NaN, NaN, NaN, NaN], getDimension=9, getL1Norm=NaN, getLInfNorm=NaN, getMaxIndex=-1, getMaxValue=NaN, getMinIndex=-1, getMinValue=NaN, getNorm=NaN, getSparsity=1.0, ...#229#1340605369", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput242() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math.linear.OpenMapRealVector", "org.apache.commons.math.linear.OpenMapRealVector", "ebeDivide", new String[]{"org.apache.commons.math.linear.RealVector"}, new String[]{"<sample:7>"}, false, 0, new String[][]{{"org.apache.commons.math.linear.OpenMapRealVector", "mapMultiplyToSelf", "double", "NaN"}, {"org.apache.commons.math.linear.OpenMapRealVector", "append", "org.apache.commons.math.linear.RealVector", "<sample:2>"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("org.apache.commons.math.exception.DimensionMismatchException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput243() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.linear.OpenMapRealVector", "org.apache.commons.math.linear.OpenMapRealVector", "mapAddToSelf", new String[]{"double"}, new String[]{"0.0"}, false);
  assertNotNull(actual);
  assertEquals("org.apache.commons.math.linear.OpenMapRealVector", actual.getClass().getName());
  assertEquals("{getData=[], getDimension=0, getL1Norm=0.0, getLInfNorm=0.0, getMaxIndex=-1, getMaxValue=NaN, getMinIndex=-1, getMinValue=NaN, getNorm=0.0, getSparsity=NaN, isInfinite=false, isNaN=false}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getData=[], getDimension=0, getL1Norm=0.0, getLInfNorm=0.0, getMaxIndex=-1, getMaxValue=NaN, getMinIndex=-1, getMinValue=NaN, getNorm=0.0, getSparsity=NaN, isInfinite=false, isNaN=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput244() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math.linear.OpenMapRealVector", "org.apache.commons.math.linear.OpenMapRealVector", "getL1Distance", new String[]{"org.apache.commons.math.linear.RealVector"}, new String[]{"<null>"}, false, 0, new String[][]{{"org.apache.commons.math.linear.OpenMapRealVector", "getMinIndex", ""}, {"org.apache.commons.math.linear.OpenMapRealVector", "append", "double", "1.0E-12"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput245() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math.linear.OpenMapRealVector", "org.apache.commons.math.linear.OpenMapRealVector", "getL1Distance", new String[]{"org.apache.commons.math.linear.RealVector"}, new String[]{"<sample:2>"}, false, 12, new String[][]{{"org.apache.commons.math.linear.OpenMapRealVector", "toArray", ""}, {"org.apache.commons.math.linear.OpenMapRealVector", "ebeDivide", "org.apache.commons.math.linear.RealVector", "<sample:6>"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("org.apache.commons.math.exception.DimensionMismatchException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput246() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.linear.OpenMapRealVector", "org.apache.commons.math.linear.OpenMapRealVector", "toArray", new String[]{}, new String[]{}, false);
  assertNotNull(actual);
  assertEquals("[D", actual.getClass().getName());
  assertEquals("[]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getData=[], getDimension=0, getL1Norm=0.0, getLInfNorm=0.0, getMaxIndex=-1, getMaxValue=NaN, getMinIndex=-1, getMinValue=NaN, getNorm=0.0, getSparsity=NaN, isInfinite=false, isNaN=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput247() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.linear.OpenMapRealVector", "org.apache.commons.math.linear.OpenMapRealVector", "dotProduct", new String[]{"double[]"}, new String[]{"<sample:8>"}, false, 13, new String[][]{{"org.apache.commons.math.linear.OpenMapRealVector", "append", "double[]", "<null>"}});
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("NaN", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getData=[-Infinity, -1.0, 0.0], getDimension=3, getL1Norm=Infinity, getLInfNorm=Infinity, getMaxIndex=2, getMaxValue=0.0, getMinIndex=0, getMinValue=-Infinity, getNorm=Infinity, getSparsity=0.6666666...#240#-1938213248", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput248() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.linear.OpenMapRealVector", "org.apache.commons.math.linear.OpenMapRealVector", "getL1Norm", new String[]{}, new String[]{}, false, 6, new String[][]{}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("Infinity", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getData=[Infinity, -Infinity, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0], getDimension=8, getL1Norm=Infinity, getLInfNorm=Infinity, getMaxIndex=0, getMaxValue=Infinity, getMinIndex=1, getMinValue=-Infinity, getNo...#260#-518583913", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput249() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.linear.OpenMapRealVector", "org.apache.commons.math.linear.OpenMapRealVector", "getL1Norm", new String[]{}, new String[]{}, false, 7, new String[][]{}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("Infinity", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getData=[Infinity, -Infinity, 0.0], getDimension=3, getL1Norm=Infinity, getLInfNorm=Infinity, getMaxIndex=0, getMaxValue=Infinity, getMinIndex=1, getMinValue=-Infinity, getNorm=Infinity, getSparsity=...#249#903803555", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput250() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.linear.OpenMapRealVector", "org.apache.commons.math.linear.OpenMapRealVector", "getL1Norm", new String[]{}, new String[]{}, false, 12, new String[][]{});
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("0.0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getData=[], getDimension=0, getL1Norm=0.0, getLInfNorm=0.0, getMaxIndex=-1, getMaxValue=NaN, getMinIndex=-1, getMinValue=NaN, getNorm=0.0, getSparsity=NaN, isInfinite=false, isNaN=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput251() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.linear.OpenMapRealVector", "org.apache.commons.math.linear.OpenMapRealVector", "getL1Norm", new String[]{}, new String[]{}, false, 13, new String[][]{});
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("Infinity", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getData=[-Infinity, -1.0, 0.0], getDimension=3, getL1Norm=Infinity, getLInfNorm=Infinity, getMaxIndex=2, getMaxValue=0.0, getMinIndex=0, getMinValue=-Infinity, getNorm=Infinity, getSparsity=0.6666666...#240#-1938213248", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput252() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.linear.OpenMapRealVector", "org.apache.commons.math.linear.OpenMapRealVector", "getL1Norm", new String[]{}, new String[]{}, false, 14, new String[][]{});
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("0.0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getData=[0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0], getDimension=12, getL1Norm=0.0, getLInfNorm=0.0, getMaxIndex=11, getMaxValue=0.0, getMinIndex=11, getMinValue=0.0, getNorm=0.0, g...#246#1646368735", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput253() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.linear.OpenMapRealVector", "org.apache.commons.math.linear.OpenMapRealVector", "getL1Norm", new String[]{}, new String[]{}, false, 15, new String[][]{});
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("1.0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getData=[0.0, 1.0], getDimension=2, getL1Norm=1.0, getLInfNorm=1.0, getMaxIndex=1, getMaxValue=1.0, getMinIndex=0, getMinValue=0.0, getNorm=1.0, getSparsity=0.5, isInfinite=false, isNaN=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput254() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.linear.OpenMapRealVector", "org.apache.commons.math.linear.OpenMapRealVector", "getL1Norm", new String[]{}, new String[]{}, false, 16, new String[][]{});
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("64.0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getData=[1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0,.., getDimension=64, getL1Norm=64.0, getLInfNorm=1.0, getMaxIndex=63, getMaxValue=1.0, getMinIndex=63, getMinValue=1.0, getNorm=8.0...#249#-1425301487", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput255() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.linear.OpenMapRealVector", "org.apache.commons.math.linear.OpenMapRealVector", "getL1Norm", new String[]{}, new String[]{}, false, 18, new String[][]{});
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("2.0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getData=?, getDimension=258, getL1Norm=2.0, getLInfNorm=1.0, getMaxIndex=2, getMaxValue=1.0, getMinIndex=0, getMinValue=-1.0, getNorm=1.4142135623730951, getSparsity=0.011627906976744186, isInfinite=...#219#-163585121", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput256() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.linear.OpenMapRealVector", "org.apache.commons.math.linear.OpenMapRealVector", "getL1Norm", new String[]{}, new String[]{}, false, 19, new String[][]{});
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("2.0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getData=[-1.0, 0.0, 1.0], getDimension=3, getL1Norm=2.0, getLInfNorm=1.0, getMaxIndex=2, getMaxValue=1.0, getMinIndex=0, getMinValue=-1.0, getNorm=1.4142135623730951, getSparsity=1.0, isInfinite=fals...#215#-341311620", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput257() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.linear.OpenMapRealVector", "org.apache.commons.math.linear.OpenMapRealVector", "getL1Norm", new String[]{}, new String[]{}, false, 19, new String[][]{}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("2.0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getData=[-1.0, 0.0, 1.0], getDimension=3, getL1Norm=2.0, getLInfNorm=1.0, getMaxIndex=2, getMaxValue=1.0, getMinIndex=0, getMinValue=-1.0, getNorm=1.4142135623730951, getSparsity=1.0, isInfinite=fals...#215#-341311620", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput258() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.linear.OpenMapRealVector", "org.apache.commons.math.linear.OpenMapRealVector", "getL1Norm", new String[]{}, new String[]{}, false, 20, new String[][]{}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("0.0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getData=?, getDimension=256, getL1Norm=0.0, getLInfNorm=0.0, getMaxIndex=255, getMaxValue=0.0, getMinIndex=255, getMinValue=0.0, getNorm=0.0, getSparsity=0.0, isInfinite=false, isNaN=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput259() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.linear.OpenMapRealVector", "org.apache.commons.math.linear.OpenMapRealVector", "iterator", new String[]{}, new String[]{}, false, 1, new String[][]{});
  assertNotNull(actual);
  assertEquals("receiver state after the call", "{getData=[1.0, Infinity, -Infinity], getDimension=3, getL1Norm=Infinity, getLInfNorm=Infinity, getMaxIndex=1, getMaxValue=Infinity, getMinIndex=2, getMinValue=-Infinity, getNorm=Infinity, getSparsity=...#234#-614213921", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput260() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.linear.OpenMapRealVector", "org.apache.commons.math.linear.OpenMapRealVector", "iterator", new String[]{}, new String[]{}, false, 2, new String[][]{});
  assertNotNull(actual);
  assertEquals("receiver state after the call", "{getData=[0.0], getDimension=1, getL1Norm=0.0, getLInfNorm=0.0, getMaxIndex=0, getMaxValue=0.0, getMinIndex=0, getMinValue=0.0, getNorm=0.0, getSparsity=0.0, isInfinite=false, isNaN=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput261() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.linear.OpenMapRealVector", "org.apache.commons.math.linear.OpenMapRealVector", "iterator", new String[]{}, new String[]{}, false, 2, new String[][]{}, 2);
  assertNotNull(actual);
  assertEquals("receiver state after the call", "{getData=[0.0], getDimension=1, getL1Norm=0.0, getLInfNorm=0.0, getMaxIndex=0, getMaxValue=0.0, getMinIndex=0, getMinValue=0.0, getNorm=0.0, getSparsity=0.0, isInfinite=false, isNaN=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput262() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math.linear.OpenMapRealVector", "org.apache.commons.math.linear.OpenMapRealVector", "checkVectorDimensions", new String[]{"org.apache.commons.math.linear.RealVector"}, new String[]{"<sample:5>"}, false, 0, new String[][]{{"org.apache.commons.math.linear.OpenMapRealVector", "subtract", "double[]", "<sample:5>"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("org.apache.commons.math.exception.DimensionMismatchException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput263() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.linear.OpenMapRealVector", "org.apache.commons.math.linear.OpenMapRealVector", "getL1Distance", new String[]{"org.apache.commons.math.linear.OpenMapRealVector"}, new String[]{"<sample:0>"}, false);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("0.0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getData=[], getDimension=0, getL1Norm=0.0, getLInfNorm=0.0, getMaxIndex=-1, getMaxValue=NaN, getMinIndex=-1, getMinValue=NaN, getNorm=0.0, getSparsity=NaN, isInfinite=false, isNaN=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput264() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.linear.OpenMapRealVector", "org.apache.commons.math.linear.OpenMapRealVector", "getMaxIndex", new String[]{}, new String[]{}, false);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("-1", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getData=[], getDimension=0, getL1Norm=0.0, getLInfNorm=0.0, getMaxIndex=-1, getMaxValue=NaN, getMinIndex=-1, getMinValue=NaN, getNorm=0.0, getSparsity=NaN, isInfinite=false, isNaN=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput265() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.linear.OpenMapRealVector", "org.apache.commons.math.linear.OpenMapRealVector", "getMaxIndex", new String[]{}, new String[]{}, false, 1, new String[][]{});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("1", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getData=[1.0, Infinity, -Infinity], getDimension=3, getL1Norm=Infinity, getLInfNorm=Infinity, getMaxIndex=1, getMaxValue=Infinity, getMinIndex=2, getMinValue=-Infinity, getNorm=Infinity, getSparsity=...#234#-614213921", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput266() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.linear.OpenMapRealVector", "org.apache.commons.math.linear.OpenMapRealVector", "getMaxIndex", new String[]{}, new String[]{}, false, 2, new String[][]{});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getData=[0.0], getDimension=1, getL1Norm=0.0, getLInfNorm=0.0, getMaxIndex=0, getMaxValue=0.0, getMinIndex=0, getMinValue=0.0, getNorm=0.0, getSparsity=0.0, isInfinite=false, isNaN=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput267() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.linear.OpenMapRealVector", "org.apache.commons.math.linear.OpenMapRealVector", "getMaxIndex", new String[]{}, new String[]{}, false, 3, new String[][]{});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("1", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getData=[-Infinity, -1.0], getDimension=2, getL1Norm=Infinity, getLInfNorm=Infinity, getMaxIndex=1, getMaxValue=-1.0, getMinIndex=0, getMinValue=-Infinity, getNorm=Infinity, getSparsity=1.0, isInfini...#221#-774438889", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput268() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.linear.OpenMapRealVector", "org.apache.commons.math.linear.OpenMapRealVector", "getMaxIndex", new String[]{}, new String[]{}, false, 4, new String[][]{});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("2", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getData=[-1.0, -1.0, -1.0], getDimension=3, getL1Norm=3.0, getLInfNorm=1.0, getMaxIndex=2, getMaxValue=-1.0, getMinIndex=2, getMinValue=-1.0, getNorm=1.7320508075688772, getSparsity=1.0, isInfinite=f...#218#-325937176", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput269() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.linear.OpenMapRealVector", "org.apache.commons.math.linear.OpenMapRealVector", "getMaxIndex", new String[]{}, new String[]{}, false, 6, new String[][]{});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getData=[Infinity, -Infinity, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0], getDimension=8, getL1Norm=Infinity, getLInfNorm=Infinity, getMaxIndex=0, getMaxValue=Infinity, getMinIndex=1, getMinValue=-Infinity, getNo...#260#-518583913", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput270() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.linear.OpenMapRealVector", "org.apache.commons.math.linear.OpenMapRealVector", "dotProduct", new String[]{"org.apache.commons.math.linear.RealVector"}, new String[]{"<sample:2>"}, false);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("0.0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getData=[], getDimension=0, getL1Norm=0.0, getLInfNorm=0.0, getMaxIndex=-1, getMaxValue=NaN, getMinIndex=-1, getMinValue=NaN, getNorm=0.0, getSparsity=NaN, isInfinite=false, isNaN=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput271() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math.linear.OpenMapRealVector", "org.apache.commons.math.linear.OpenMapRealVector", "dotProduct", new String[]{"org.apache.commons.math.linear.RealVector"}, new String[]{"<sample:1>"}, false); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("org.apache.commons.math.exception.DimensionMismatchException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput272() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.linear.OpenMapRealVector", "org.apache.commons.math.linear.OpenMapRealVector", "dotProduct", new String[]{"org.apache.commons.math.linear.RealVector"}, new String[]{"<sample:9>"}, false, 8, new String[][]{});
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("0.0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getData=[0.0, 0.0, 0.0, 0.0, 0.0, 0.0], getDimension=6, getL1Norm=0.0, getLInfNorm=0.0, getMaxIndex=5, getMaxValue=0.0, getMinIndex=5, getMinValue=0.0, getNorm=0.0, getSparsity=0.0, isInfinite=false,...#213#-1142613006", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput273() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math.linear.OpenMapRealVector", "org.apache.commons.math.linear.OpenMapRealVector", "projection", new String[]{"double[]"}, new String[]{"<null>"}, false, 0, new String[][]{{"org.apache.commons.math.linear.OpenMapRealVector", "mapMultiply", "double", "1.0E-12"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput274() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math.linear.OpenMapRealVector", "org.apache.commons.math.linear.OpenMapRealVector", "dotProduct", new String[]{"org.apache.commons.math.linear.RealVector"}, new String[]{"<null>"}, false, 8, new String[][]{}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput275() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.linear.OpenMapRealVector", "org.apache.commons.math.linear.OpenMapRealVector", "dotProduct", new String[]{"org.apache.commons.math.linear.RealVector"}, new String[]{"<sample:9>"}, false, 8, new String[][]{}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("0.0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getData=[0.0, 0.0, 0.0, 0.0, 0.0, 0.0], getDimension=6, getL1Norm=0.0, getLInfNorm=0.0, getMaxIndex=5, getMaxValue=0.0, getMinIndex=5, getMinValue=0.0, getNorm=0.0, getSparsity=0.0, isInfinite=false,...#213#-1142613006", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput276() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math.linear.OpenMapRealVector", "org.apache.commons.math.linear.OpenMapRealVector", "dotProduct", new String[]{"org.apache.commons.math.linear.RealVector"}, new String[]{"<sample:6>"}, false, 8, new String[][]{}, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("org.apache.commons.math.exception.DimensionMismatchException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput277() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.linear.OpenMapRealVector", "org.apache.commons.math.linear.OpenMapRealVector", "mapMultiplyToSelf", new String[]{"double"}, new String[]{"NaN"}, false);
  assertNotNull(actual);
  assertEquals("org.apache.commons.math.linear.OpenMapRealVector", actual.getClass().getName());
  assertEquals("{getData=[], getDimension=0, getL1Norm=0.0, getLInfNorm=0.0, getMaxIndex=-1, getMaxValue=NaN, getMinIndex=-1, getMinValue=NaN, getNorm=0.0, getSparsity=NaN, isInfinite=false, isNaN=false}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getData=[], getDimension=0, getL1Norm=0.0, getLInfNorm=0.0, getMaxIndex=-1, getMaxValue=NaN, getMinIndex=-1, getMinValue=NaN, getNorm=0.0, getSparsity=NaN, isInfinite=false, isNaN=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput278() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math.linear.OpenMapRealVector", "org.apache.commons.math.linear.OpenMapRealVector", "ebeDivide", new String[]{"double[]"}, new String[]{"<sample:8>"}, false, 0, new String[][]{{"org.apache.commons.math.linear.OpenMapRealVector", "hashCode", ""}, {"org.apache.commons.math.linear.OpenMapRealVector", "getDimension", ""}}, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("org.apache.commons.math.exception.DimensionMismatchException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput279() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.linear.OpenMapRealVector", "org.apache.commons.math.linear.OpenMapRealVector", "toArray", new String[]{}, new String[]{}, false, 1, new String[][]{});
  assertNotNull(actual);
  assertEquals("[D", actual.getClass().getName());
  assertEquals("[1.0, Infinity, -Infinity]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getData=[1.0, Infinity, -Infinity], getDimension=3, getL1Norm=Infinity, getLInfNorm=Infinity, getMaxIndex=1, getMaxValue=Infinity, getMinIndex=2, getMinValue=-Infinity, getNorm=Infinity, getSparsity=...#234#-614213921", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput280() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.linear.OpenMapRealVector", "org.apache.commons.math.linear.OpenMapRealVector", "toArray", new String[]{}, new String[]{}, false, 2, new String[][]{});
  assertNotNull(actual);
  assertEquals("[D", actual.getClass().getName());
  assertEquals("[0.0]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getData=[0.0], getDimension=1, getL1Norm=0.0, getLInfNorm=0.0, getMaxIndex=0, getMaxValue=0.0, getMinIndex=0, getMinValue=0.0, getNorm=0.0, getSparsity=0.0, isInfinite=false, isNaN=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput281() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.linear.OpenMapRealVector", "org.apache.commons.math.linear.OpenMapRealVector", "toArray", new String[]{}, new String[]{}, false, 3, new String[][]{});
  assertNotNull(actual);
  assertEquals("[D", actual.getClass().getName());
  assertEquals("[-Infinity, -1.0]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getData=[-Infinity, -1.0], getDimension=2, getL1Norm=Infinity, getLInfNorm=Infinity, getMaxIndex=1, getMaxValue=-1.0, getMinIndex=0, getMinValue=-Infinity, getNorm=Infinity, getSparsity=1.0, isInfini...#221#-774438889", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput282() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.linear.OpenMapRealVector", "org.apache.commons.math.linear.OpenMapRealVector", "mapMultiply", new String[]{"double"}, new String[]{"NaN"}, false, 2, new String[][]{{"org.apache.commons.math.linear.OpenMapRealVector", "getLInfDistance", "double[]", "<sample:1>"}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.math.linear.OpenMapRealVector", actual.getClass().getName());
  assertEquals("{getData=[NaN], getDimension=1, getL1Norm=NaN, getLInfNorm=NaN, getMaxIndex=-1, getMaxValue=NaN, getMinIndex=-1, getMinValue=NaN, getNorm=NaN, getSparsity=1.0, isInfinite=false, isNaN=true}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getData=[0.0], getDimension=1, getL1Norm=0.0, getLInfNorm=0.0, getMaxIndex=0, getMaxValue=0.0, getMinIndex=0, getMinValue=0.0, getNorm=0.0, getSparsity=0.0, isInfinite=false, isNaN=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput283() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.linear.OpenMapRealVector", "org.apache.commons.math.linear.OpenMapRealVector", "mapMultiply", new String[]{"double"}, new String[]{"NaN"}, false, 1, new String[][]{{"org.apache.commons.math.linear.OpenMapRealVector", "getLInfDistance", "double[]", "<sample:1>"}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.math.linear.OpenMapRealVector", actual.getClass().getName());
  assertEquals("{getData=[NaN, NaN, NaN], getDimension=3, getL1Norm=NaN, getLInfNorm=NaN, getMaxIndex=-1, getMaxValue=NaN, getMinIndex=-1, getMinValue=NaN, getNorm=NaN, getSparsity=1.0, isInfinite=false, isNaN=true}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getData=[1.0, Infinity, -Infinity], getDimension=3, getL1Norm=Infinity, getLInfNorm=Infinity, getMaxIndex=1, getMaxValue=Infinity, getMinIndex=2, getMinValue=-Infinity, getNorm=Infinity, getSparsity=...#234#-614213921", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput284() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math.linear.OpenMapRealVector", "org.apache.commons.math.linear.OpenMapRealVector", "mapMultiply", new String[]{"double"}, new String[]{"NaN"}, false, 1, new String[][]{{"org.apache.commons.math.linear.OpenMapRealVector", "getLInfDistance", "double[]", "<sample:1>"}}), new String[][]{{"getMinIndex", "", "6"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("-1", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getData=[1.0, Infinity, -Infinity], getDimension=3, getL1Norm=Infinity, getLInfNorm=Infinity, getMaxIndex=1, getMaxValue=Infinity, getMinIndex=2, getMinValue=-Infinity, getNorm=Infinity, getSparsity=...#234#-614213921", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput285() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math.linear.OpenMapRealVector", "org.apache.commons.math.linear.OpenMapRealVector", "mapMultiply", new String[]{"double"}, new String[]{"0.0"}, false, 1, new String[][]{}), new String[][]{{"getMinIndex", "", "6"}, {"mapMultiplyToSelf", "double", "7"}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.math.linear.OpenMapRealVector", actual.getClass().getName());
  assertEquals("{getData=[0.0, NaN, NaN], getDimension=3, getL1Norm=NaN, getLInfNorm=NaN, getMaxIndex=0, getMaxValue=0.0, getMinIndex=0, getMinValue=0.0, getNorm=NaN, getSparsity=1.0, isInfinite=false, isNaN=true}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getData=[1.0, Infinity, -Infinity], getDimension=3, getL1Norm=Infinity, getLInfNorm=Infinity, getMaxIndex=1, getMaxValue=Infinity, getMinIndex=2, getMinValue=-Infinity, getNorm=Infinity, getSparsity=...#234#-614213921", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput286() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math.linear.OpenMapRealVector", "org.apache.commons.math.linear.OpenMapRealVector", "mapMultiply", new String[]{"double"}, new String[]{"-0.0"}, false, 1, new String[][]{}), new String[][]{{"getMinIndex", "", "6"}, {"mapMultiplyToSelf", "double", "7"}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.math.linear.OpenMapRealVector", actual.getClass().getName());
  assertEquals("{getData=[-0.0, NaN, NaN], getDimension=3, getL1Norm=NaN, getLInfNorm=NaN, getMaxIndex=0, getMaxValue=-0.0, getMinIndex=0, getMinValue=-0.0, getNorm=NaN, getSparsity=1.0, isInfinite=false, isNaN=true}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getData=[1.0, Infinity, -Infinity], getDimension=3, getL1Norm=Infinity, getLInfNorm=Infinity, getMaxIndex=1, getMaxValue=Infinity, getMinIndex=2, getMinValue=-Infinity, getNorm=Infinity, getSparsity=...#234#-614213921", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput287() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.linear.OpenMapRealVector", "org.apache.commons.math.linear.OpenMapRealVector", "subtract", new String[]{"double[]"}, new String[]{"<sample:2>"}, false, 4, new String[][]{{"org.apache.commons.math.linear.OpenMapRealVector", "isNaN", ""}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.math.linear.OpenMapRealVector", actual.getClass().getName());
  assertEquals("{getData=[-2.0, -Infinity, Infinity], getDimension=3, getL1Norm=Infinity, getLInfNorm=Infinity, getMaxIndex=2, getMaxValue=Infinity, getMinIndex=1, getMinValue=-Infinity, getNorm=Infinity, getSparsity...#235#-524425057", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getData=[-1.0, -1.0, -1.0], getDimension=3, getL1Norm=3.0, getLInfNorm=1.0, getMaxIndex=2, getMaxValue=-1.0, getMinIndex=2, getMinValue=-1.0, getNorm=1.7320508075688772, getSparsity=1.0, isInfinite=f...#218#-325937176", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput288() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.linear.OpenMapRealVector", "org.apache.commons.math.linear.OpenMapRealVector", "subtract", new String[]{"double[]"}, new String[]{"<sample:5>"}, false, 4, new String[][]{{"org.apache.commons.math.linear.OpenMapRealVector", "isNaN", ""}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.math.linear.OpenMapRealVector", actual.getClass().getName());
  assertEquals("{getData=[0.0, -1.0, -2.0], getDimension=3, getL1Norm=3.0, getLInfNorm=2.0, getMaxIndex=0, getMaxValue=0.0, getMinIndex=2, getMinValue=-2.0, getNorm=2.23606797749979, getSparsity=0.6666666666666666, i...#229#-77644051", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getData=[-1.0, -1.0, -1.0], getDimension=3, getL1Norm=3.0, getLInfNorm=1.0, getMaxIndex=2, getMaxValue=-1.0, getMinIndex=2, getMinValue=-1.0, getNorm=1.7320508075688772, getSparsity=1.0, isInfinite=f...#218#-325937176", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput289() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math.linear.OpenMapRealVector", "org.apache.commons.math.linear.OpenMapRealVector", "subtract", new String[]{"double[]"}, new String[]{"<sample:8>"}, false, 4, new String[][]{{"org.apache.commons.math.linear.OpenMapRealVector", "hashCode", ""}, {"org.apache.commons.math.linear.OpenMapRealVector", "isNaN", ""}}), new String[][]{{"getMinValue", "", "1"}});
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("-Infinity", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getData=[-1.0, -1.0, -1.0], getDimension=3, getL1Norm=3.0, getLInfNorm=1.0, getMaxIndex=2, getMaxValue=-1.0, getMinIndex=2, getMinValue=-1.0, getNorm=1.7320508075688772, getSparsity=1.0, isInfinite=f...#218#-325937176", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput290() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.linear.OpenMapRealVector", "org.apache.commons.math.linear.OpenMapRealVector", "getMinIndex", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.math.linear.OpenMapRealVector", "copy", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("-1", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getData=[], getDimension=0, getL1Norm=0.0, getLInfNorm=0.0, getMaxIndex=-1, getMaxValue=NaN, getMinIndex=-1, getMinValue=NaN, getNorm=0.0, getSparsity=NaN, isInfinite=false, isNaN=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput291() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math.linear.OpenMapRealVector", "org.apache.commons.math.linear.OpenMapRealVector", "mapAddToSelf", new String[]{"double"}, new String[]{"NaN"}, false, 0, new String[][]{{"org.apache.commons.math.linear.OpenMapRealVector", "subtract", "org.apache.commons.math.linear.RealVector", "<sample:2>"}}), new String[][]{{"outerProduct", "double[]", "5"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("org.apache.commons.math.exception.NotStrictlyPositiveException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput292() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.linear.OpenMapRealVector", "org.apache.commons.math.linear.OpenMapRealVector", "mapAddToSelf", new String[]{"double"}, new String[]{"NaN"}, false, 11, new String[][]{{"org.apache.commons.math.linear.OpenMapRealVector", "getLInfDistance", "org.apache.commons.math.linear.RealVector", "<sample:4>"}, {"org.apache.commons.math.linear.OpenMapRealVector", "subtract", "org.apache.commons.math.linear.RealVector", "<sample:2>"}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.math.linear.OpenMapRealVector", actual.getClass().getName());
  assertEquals("{getData=[NaN, NaN, NaN, NaN, NaN, NaN, NaN, NaN, NaN], getDimension=9, getL1Norm=NaN, getLInfNorm=NaN, getMaxIndex=-1, getMaxValue=NaN, getMinIndex=-1, getMinValue=NaN, getNorm=NaN, getSparsity=1.0, ...#229#1340605369", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getData=[NaN, NaN, NaN, NaN, NaN, NaN, NaN, NaN, NaN], getDimension=9, getL1Norm=NaN, getLInfNorm=NaN, getMaxIndex=-1, getMaxValue=NaN, getMinIndex=-1, getMinValue=NaN, getNorm=NaN, getSparsity=1.0, ...#229#1340605369", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput293() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math.linear.OpenMapRealVector", "org.apache.commons.math.linear.OpenMapRealVector", "mapAddToSelf", new String[]{"double"}, new String[]{"NaN"}, false, 0, new String[][]{{"org.apache.commons.math.linear.OpenMapRealVector", "getLInfDistance", "org.apache.commons.math.linear.RealVector", "<sample:4>"}, {"org.apache.commons.math.linear.OpenMapRealVector", "subtract", "org.apache.commons.math.linear.RealVector", "<sample:1>"}}), new String[][]{{"getSubVector", "int,int", "1"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("org.apache.commons.math.exception.OutOfRangeException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput294() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math.linear.OpenMapRealVector", "org.apache.commons.math.linear.OpenMapRealVector", "sparseIterator", new String[]{}, new String[]{}, false, 4, new String[][]{{"org.apache.commons.math.linear.OpenMapRealVector", "mapDivideToSelf", "double", "Infinity"}, {"org.apache.commons.math.linear.OpenMapRealVector", "getMaxIndex", ""}}), new String[][]{{"hasNext", "", "4"}, {"next", "", "5"}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.math.linear.OpenMapRealVector$OpenMapEntry", actual.getClass().getName());
  assertEquals("{getIndex=0, getValue=-0.0}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getData=[-0.0, -0.0, -0.0], getDimension=3, getL1Norm=0.0, getLInfNorm=0.0, getMaxIndex=2, getMaxValue=-0.0, getMinIndex=2, getMinValue=-0.0, getNorm=0.0, getSparsity=1.0, isInfinite=false, isNaN=fal...#203#1230809933", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput295() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math.linear.OpenMapRealVector", "org.apache.commons.math.linear.OpenMapRealVector", "sparseIterator", new String[]{}, new String[]{}, false, 4, new String[][]{{"org.apache.commons.math.linear.OpenMapRealVector", "getMaxIndex", ""}, {"org.apache.commons.math.linear.OpenMapRealVector", "projection", "double[]", "<sample:1>"}}), new String[][]{{"hasNext", "", "4"}, {"next", "", "5"}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.math.linear.OpenMapRealVector$OpenMapEntry", actual.getClass().getName());
  assertEquals("{getIndex=0, getValue=-1.0}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getData=[-1.0, -1.0, -1.0], getDimension=3, getL1Norm=3.0, getLInfNorm=1.0, getMaxIndex=2, getMaxValue=-1.0, getMinIndex=2, getMinValue=-1.0, getNorm=1.7320508075688772, getSparsity=1.0, isInfinite=f...#218#-325937176", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput296() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math.linear.OpenMapRealVector", "org.apache.commons.math.linear.OpenMapRealVector", "sparseIterator", new String[]{}, new String[]{}, false, 4, new String[][]{{"org.apache.commons.math.linear.OpenMapRealVector", "getL1Distance", "double[]", "<sample:8>"}}), new String[][]{{"hasNext", "", "4"}, {"next", "", "5"}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.math.linear.OpenMapRealVector$OpenMapEntry", actual.getClass().getName());
  assertEquals("{getIndex=0, getValue=-1.0}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getData=[-1.0, -1.0, -1.0], getDimension=3, getL1Norm=3.0, getLInfNorm=1.0, getMaxIndex=2, getMaxValue=-1.0, getMinIndex=2, getMinValue=-1.0, getNorm=1.7320508075688772, getSparsity=1.0, isInfinite=f...#218#-325937176", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput297() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math.linear.OpenMapRealVector", "org.apache.commons.math.linear.OpenMapRealVector", "subtract", new String[]{"double[]"}, new String[]{"<null>"}, false, 0, new String[][]{{"org.apache.commons.math.linear.OpenMapRealVector", "getSparsity", ""}}, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput298() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math.linear.OpenMapRealVector", "org.apache.commons.math.linear.OpenMapRealVector", "sparseIterator", new String[]{}, new String[]{}, false, 10, new String[][]{{"org.apache.commons.math.linear.OpenMapRealVector", "getL1Distance", "double[]", "<sample:7>"}, {"org.apache.commons.math.linear.OpenMapRealVector", "mapDivide", "double", "NaN"}}), new String[][]{{"hasNext", "", "4"}, {"next", "", "5"}, {"setIndex", "int", "5"}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.math.linear.OpenMapRealVector$OpenMapEntry", actual.getClass().getName());
  assertEquals("{getIndex=0, getValue=0.0}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getData=[0.0, 1.0, Infinity], getDimension=3, getL1Norm=Infinity, getLInfNorm=Infinity, getMaxIndex=2, getMaxValue=Infinity, getMinIndex=0, getMinValue=0.0, getNorm=Infinity, getSparsity=1.0, isInfin...#222#1305061558", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput299() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math.linear.OpenMapRealVector", "org.apache.commons.math.linear.OpenMapRealVector", "sparseIterator", new String[]{}, new String[]{}, false, 10, new String[][]{{"org.apache.commons.math.linear.OpenMapRealVector", "getL1Distance", "double[]", "<sample:7>"}, {"org.apache.commons.math.linear.OpenMapRealVector", "mapDivide", "double", "NaN"}}, 1), new String[][]{{"hasNext", "", "4"}, {"next", "", "5"}, {"setIndex", "int", "5"}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.math.linear.OpenMapRealVector$OpenMapEntry", actual.getClass().getName());
  assertEquals("{getIndex=0, getValue=0.0}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getData=[0.0, 1.0, Infinity], getDimension=3, getL1Norm=Infinity, getLInfNorm=Infinity, getMaxIndex=2, getMaxValue=Infinity, getMinIndex=0, getMinValue=0.0, getNorm=Infinity, getSparsity=1.0, isInfin...#222#1305061558", SearchInputFactory_scaffolding.receiverState());
 }
}
