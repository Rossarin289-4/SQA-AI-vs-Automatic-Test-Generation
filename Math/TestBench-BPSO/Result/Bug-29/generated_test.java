package generated.algorithm;

import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;
import static org.junit.Assert.*;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class BinaryParticleSwarmGeneratedTest {
 @Test(timeout = 20000)
 public void generatedInput000() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math3.linear.OpenMapRealVector", "org.apache.commons.math3.linear.OpenMapRealVector", "sparseIterator", new String[]{}, new String[]{}, false, 6, new String[][]{{"org.apache.commons.math3.linear.OpenMapRealVector", "getMinValue", ""}}), new String[][]{{"next", "", "2"}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.math3.linear.OpenMapRealVector$OpenMapEntry", actual.getClass().getName());
  assertEquals("{getIndex=0, getValue=Infinity}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getDimension=8, getL1Norm=Infinity, getLInfNorm=Infinity, getMaxIndex=0, getMaxValue=Infinity, getMinIndex=1, getMinValue=-Infinity, getNorm=Infinity, getSparsity=0.25, isInfinite=true, isNaN=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput001() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.linear.OpenMapRealVector", "org.apache.commons.math3.linear.OpenMapRealVector", "getLInfDistance", new String[]{"org.apache.commons.math3.linear.RealVector"}, new String[]{"<sample:8>"}, false, 0, new String[][]{{"org.apache.commons.math3.linear.OpenMapRealVector", "getEntry", "int", "-1073741824"}});
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("0.0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getDimension=0, getL1Norm=0.0, getLInfNorm=0.0, getMaxIndex=-1, getMaxValue=NaN, getMinIndex=-1, getMinValue=NaN, getNorm=0.0, getSparsity=NaN, isInfinite=false, isNaN=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput002() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math3.linear.OpenMapRealVector", "org.apache.commons.math3.linear.OpenMapRealVector", "append", new String[]{"double"}, new String[]{"-0.5"}, false, 0, new String[][]{{"org.apache.commons.math3.linear.OpenMapRealVector", "equals", "java.lang.Object", "<i:2>"}, {"org.apache.commons.math3.linear.OpenMapRealVector", "add", "org.apache.commons.math3.linear.RealVector", "<sample:6>"}}, 2), new String[][]{{"getMaxIndex", "", "2"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getDimension=0, getL1Norm=0.0, getLInfNorm=0.0, getMaxIndex=-1, getMaxValue=NaN, getMinIndex=-1, getMinValue=NaN, getNorm=0.0, getSparsity=NaN, isInfinite=false, isNaN=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput003() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math3.linear.OpenMapRealVector", "org.apache.commons.math3.linear.OpenMapRealVector", "sparseIterator", new String[]{}, new String[]{}, false, 0, null, 2), new String[][]{{"remove", "", "0"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.UnsupportedOperationException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput004() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.linear.OpenMapRealVector", "org.apache.commons.math3.linear.OpenMapRealVector", "ebeDivide", new String[]{"org.apache.commons.math3.linear.RealVector"}, new String[]{"<sample:8>"}, false, 0, new String[][]{{"org.apache.commons.math3.linear.OpenMapRealVector", "getL1Distance", "org.apache.commons.math3.linear.OpenMapRealVector", "<sample:7>"}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.math3.linear.OpenMapRealVector", actual.getClass().getName());
  assertEquals("{getDimension=0, getL1Norm=0.0, getLInfNorm=0.0, getMaxIndex=-1, getMaxValue=NaN, getMinIndex=-1, getMinValue=NaN, getNorm=0.0, getSparsity=NaN, isInfinite=false, isNaN=false}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getDimension=0, getL1Norm=0.0, getLInfNorm=0.0, getMaxIndex=-1, getMaxValue=NaN, getMinIndex=-1, getMinValue=NaN, getNorm=0.0, getSparsity=NaN, isInfinite=false, isNaN=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput005() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.linear.OpenMapRealVector", "org.apache.commons.math3.linear.OpenMapRealVector", "getMinIndex", new String[]{}, new String[]{}, false, 1, new String[][]{{"org.apache.commons.math3.linear.OpenMapRealVector", "getDistance", "org.apache.commons.math3.linear.OpenMapRealVector", "<sample:6>"}, {"org.apache.commons.math3.linear.OpenMapRealVector", "equals", "java.lang.Object", "<d:0.7999999999999999>"}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("2", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getDimension=3, getL1Norm=Infinity, getLInfNorm=Infinity, getMaxIndex=1, getMaxValue=Infinity, getMinIndex=2, getMinValue=-Infinity, getNorm=Infinity, getSparsity=1.0, isInfinite=true, isNaN=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput006() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.linear.OpenMapRealVector", "org.apache.commons.math3.linear.OpenMapRealVector", "getL1Distance", new String[]{"org.apache.commons.math3.linear.RealVector"}, new String[]{"<sample:12>"}, false);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("0.0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getDimension=0, getL1Norm=0.0, getLInfNorm=0.0, getMaxIndex=-1, getMaxValue=NaN, getMinIndex=-1, getMinValue=NaN, getNorm=0.0, getSparsity=NaN, isInfinite=false, isNaN=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput007() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math3.linear.OpenMapRealVector", "org.apache.commons.math3.linear.OpenMapRealVector", "mapAdd", new String[]{"double"}, new String[]{"-4.4"}, false, 0, new String[][]{{"org.apache.commons.math3.linear.OpenMapRealVector", "mapDivide", "double", "-36.49999999999999"}}), new String[][]{{"getDistance", "org.apache.commons.math3.linear.OpenMapRealVector", "7"}});
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("Infinity", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getDimension=0, getL1Norm=0.0, getLInfNorm=0.0, getMaxIndex=-1, getMaxValue=NaN, getMinIndex=-1, getMinValue=NaN, getNorm=0.0, getSparsity=NaN, isInfinite=false, isNaN=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput008() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.linear.OpenMapRealVector", "org.apache.commons.math3.linear.OpenMapRealVector", "dotProduct", new String[]{"org.apache.commons.math3.linear.OpenMapRealVector"}, new String[]{"<sample:7>"}, false, 1, new String[][]{{"org.apache.commons.math3.linear.OpenMapRealVector", "map", "org.apache.commons.math3.analysis.UnivariateFunction", "<sample:0>"}, {"org.apache.commons.math3.linear.OpenMapRealVector", "toArray", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("NaN", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getDimension=3, getL1Norm=Infinity, getLInfNorm=Infinity, getMaxIndex=1, getMaxValue=Infinity, getMinIndex=2, getMinValue=-Infinity, getNorm=Infinity, getSparsity=1.0, isInfinite=true, isNaN=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput009() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.linear.OpenMapRealVector", "org.apache.commons.math3.linear.OpenMapRealVector", "append", new String[]{"org.apache.commons.math3.linear.OpenMapRealVector"}, new String[]{"<sample:7>"}, false, 4, new String[][]{{"org.apache.commons.math3.linear.OpenMapRealVector", "getSubVector", "int,int", "1", "0"}}, 1);
  assertNotNull(actual);
  assertEquals("org.apache.commons.math3.linear.OpenMapRealVector", actual.getClass().getName());
  assertEquals("{getDimension=15, getL1Norm=Infinity, getLInfNorm=Infinity, getMaxIndex=12, getMaxValue=Infinity, getMinIndex=13, getMinValue=-Infinity, getNorm=Infinity, getSparsity=0.26666666666666666, isInfinite=t...#217#-23592442", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getDimension=12, getL1Norm=Infinity, getLInfNorm=Infinity, getMaxIndex=0, getMaxValue=Infinity, getMinIndex=1, getMinValue=-Infinity, getNorm=Infinity, getSparsity=0.16666666666666666, isInfinite=tru...#215#-1192199922", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput010() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.linear.OpenMapRealVector", "org.apache.commons.math3.linear.OpenMapRealVector", "getDistance", new String[]{"org.apache.commons.math3.linear.RealVector"}, new String[]{"<sample:4>"}, false, 0, new String[][]{{"org.apache.commons.math3.linear.OpenMapRealVector", "isNaN", ""}, {"org.apache.commons.math3.linear.OpenMapRealVector", "getLInfNorm", ""}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("0.0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getDimension=0, getL1Norm=0.0, getLInfNorm=0.0, getMaxIndex=-1, getMaxValue=NaN, getMinIndex=-1, getMinValue=NaN, getNorm=0.0, getSparsity=NaN, isInfinite=false, isNaN=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput011() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.linear.OpenMapRealVector", "org.apache.commons.math3.linear.OpenMapRealVector", "projection", new String[]{"org.apache.commons.math3.linear.RealVector"}, new String[]{"<sample:12>"}, false, 0, new String[][]{{"org.apache.commons.math3.linear.OpenMapRealVector", "getSparsity", ""}, {"org.apache.commons.math3.linear.OpenMapRealVector", "walkInOptimizedOrder", "org.apache.commons.math3.linear.RealVectorChangingVisitor", "<sample:1>"}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.math3.linear.ArrayRealVector", actual.getClass().getName());
  assertEquals("{} {getDataRef=[], getDimension=0, getL1Norm=0.0, getLInfNorm=0.0, getMaxIndex=-1, getMaxValue=NaN, getMinIndex=-1, getMinValue=NaN, getNorm=0.0, isInfinite=false, isNaN=false}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getDimension=0, getL1Norm=0.0, getLInfNorm=0.0, getMaxIndex=-1, getMaxValue=NaN, getMinIndex=-1, getMinValue=NaN, getNorm=0.0, getSparsity=NaN, isInfinite=false, isNaN=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput012() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math3.linear.OpenMapRealVector", "org.apache.commons.math3.linear.OpenMapRealVector", "ebeDivide", new String[]{"org.apache.commons.math3.linear.RealVector"}, new String[]{"<sample:10>"}, false, 2, new String[][]{}), new String[][]{{"combine", "double,double,org.apache.commons.math3.linear.RealVector", "3"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput013() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math3.linear.OpenMapRealVector", "org.apache.commons.math3.linear.OpenMapRealVector", "append", new String[]{"org.apache.commons.math3.linear.OpenMapRealVector"}, new String[]{"<sample:9>"}, false, 1, new String[][]{{"org.apache.commons.math3.linear.OpenMapRealVector", "add", "org.apache.commons.math3.linear.OpenMapRealVector", "<sample:0>"}}, 3), new String[][]{{"unitVector", "", "7"}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.math3.linear.OpenMapRealVector", actual.getClass().getName());
  assertEquals("{getDimension=10, getL1Norm=NaN, getLInfNorm=NaN, getMaxIndex=9, getMaxValue=0.0, getMinIndex=9, getMinValue=0.0, getNorm=NaN, getSparsity=0.3, isInfinite=false, isNaN=true}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getDimension=3, getL1Norm=Infinity, getLInfNorm=Infinity, getMaxIndex=1, getMaxValue=Infinity, getMinIndex=2, getMinValue=-Infinity, getNorm=Infinity, getSparsity=1.0, isInfinite=true, isNaN=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput014() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math3.linear.OpenMapRealVector", "org.apache.commons.math3.linear.OpenMapRealVector", "checkIndices", new String[]{"int", "int"}, new String[]{"-47", "20"}, false, 6, new String[][]{{"org.apache.commons.math3.linear.OpenMapRealVector", "setSubVector", "int,org.apache.commons.math3.linear.RealVector", "2", "<sample:10>"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("org.apache.commons.math3.exception.OutOfRangeException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput015() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.linear.OpenMapRealVector", "org.apache.commons.math3.linear.OpenMapRealVector", "subtract", new String[]{"org.apache.commons.math3.linear.OpenMapRealVector"}, new String[]{"<sample:7>"}, false, 7, new String[][]{{"org.apache.commons.math3.linear.OpenMapRealVector", "getDistance", "org.apache.commons.math3.linear.OpenMapRealVector", "<null>"}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.math3.linear.OpenMapRealVector", actual.getClass().getName());
  assertEquals("{getDimension=3, getL1Norm=NaN, getLInfNorm=NaN, getMaxIndex=2, getMaxValue=0.0, getMinIndex=2, getMinValue=0.0, getNorm=NaN, getSparsity=0.6666666666666666, isInfinite=false, isNaN=true}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getDimension=3, getL1Norm=Infinity, getLInfNorm=Infinity, getMaxIndex=0, getMaxValue=Infinity, getMinIndex=1, getMinValue=-Infinity, getNorm=Infinity, getSparsity=0.6666666666666666, isInfinite=true,...#213#242791861", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput016() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.linear.OpenMapRealVector", "org.apache.commons.math3.linear.OpenMapRealVector", "getMinIndex", new String[]{}, new String[]{}, false, 7, new String[][]{{"org.apache.commons.math3.linear.OpenMapRealVector", "subtract", "org.apache.commons.math3.linear.OpenMapRealVector", "<sample:1>"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("1", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getDimension=3, getL1Norm=Infinity, getLInfNorm=Infinity, getMaxIndex=0, getMaxValue=Infinity, getMinIndex=1, getMinValue=-Infinity, getNorm=Infinity, getSparsity=0.6666666666666666, isInfinite=true,...#213#242791861", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput017() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math3.linear.OpenMapRealVector", "org.apache.commons.math3.linear.OpenMapRealVector", "ebeMultiply", new String[]{"org.apache.commons.math3.linear.RealVector"}, new String[]{"<sample:14>"}, false, 0, new String[][]{{"org.apache.commons.math3.linear.OpenMapRealVector", "add", "org.apache.commons.math3.linear.OpenMapRealVector", "<sample:5>"}}, 3), new String[][]{{"getNorm", "", "3"}, {"append", "org.apache.commons.math3.linear.RealVector", "4"}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.math3.linear.OpenMapRealVector", actual.getClass().getName());
  assertEquals("{getDimension=0, getL1Norm=0.0, getLInfNorm=0.0, getMaxIndex=-1, getMaxValue=NaN, getMinIndex=-1, getMinValue=NaN, getNorm=0.0, getSparsity=NaN, isInfinite=false, isNaN=false}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getDimension=0, getL1Norm=0.0, getLInfNorm=0.0, getMaxIndex=-1, getMaxValue=NaN, getMinIndex=-1, getMinValue=NaN, getNorm=0.0, getSparsity=NaN, isInfinite=false, isNaN=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput018() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math3.linear.OpenMapRealVector", "org.apache.commons.math3.linear.OpenMapRealVector", "getSubVector", new String[]{"int", "int"}, new String[]{"1", "-1073741823"}, false, 3, new String[][]{{"org.apache.commons.math3.linear.OpenMapRealVector", "getMinIndex", ""}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("org.apache.commons.math3.exception.NotPositiveException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput019() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.linear.OpenMapRealVector", "org.apache.commons.math3.linear.OpenMapRealVector", "add", new String[]{"org.apache.commons.math3.linear.OpenMapRealVector"}, new String[]{"<sample:7>"}, false, 1, new String[][]{{"org.apache.commons.math3.linear.OpenMapRealVector", "mapMultiply", "double", "-0.01"}, {"org.apache.commons.math3.linear.OpenMapRealVector", "hashCode", ""}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.math3.linear.OpenMapRealVector", actual.getClass().getName());
  assertEquals("{getDimension=3, getL1Norm=NaN, getLInfNorm=NaN, getMaxIndex=0, getMaxValue=Infinity, getMinIndex=2, getMinValue=-Infinity, getNorm=NaN, getSparsity=1.0, isInfinite=false, isNaN=true}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getDimension=3, getL1Norm=Infinity, getLInfNorm=Infinity, getMaxIndex=1, getMaxValue=Infinity, getMinIndex=2, getMinValue=-Infinity, getNorm=Infinity, getSparsity=1.0, isInfinite=true, isNaN=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput020() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math3.linear.OpenMapRealVector", "org.apache.commons.math3.linear.OpenMapRealVector", "subtract", new String[]{"org.apache.commons.math3.linear.RealVector"}, new String[]{"<sample:4>"}, false, 0, new String[][]{{"org.apache.commons.math3.linear.OpenMapRealVector", "unitize", ""}, {"org.apache.commons.math3.linear.OpenMapRealVector", "getNorm", ""}}, 1), new String[][]{{"iterator", "", "5"}});
  assertNotNull(actual);
  assertEquals("receiver state after the call", "{getDimension=0, getL1Norm=0.0, getLInfNorm=0.0, getMaxIndex=-1, getMaxValue=NaN, getMinIndex=-1, getMinValue=NaN, getNorm=0.0, getSparsity=NaN, isInfinite=false, isNaN=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput021() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.linear.OpenMapRealVector", "org.apache.commons.math3.linear.OpenMapRealVector", "mapSubtract", new String[]{"double"}, new String[]{"0.5"}, false, 6, new String[][]{{"org.apache.commons.math3.linear.OpenMapRealVector", "getLInfDistance", "org.apache.commons.math3.linear.RealVector", "<sample:0>"}, {"org.apache.commons.math3.linear.OpenMapRealVector", "getL1Distance", "org.apache.commons.math3.linear.OpenMapRealVector", "<sample:15>"}}, 2);
  assertNotNull(actual);
  assertEquals("org.apache.commons.math3.linear.OpenMapRealVector", actual.getClass().getName());
  assertEquals("{getDimension=8, getL1Norm=Infinity, getLInfNorm=Infinity, getMaxIndex=0, getMaxValue=Infinity, getMinIndex=1, getMinValue=-Infinity, getNorm=Infinity, getSparsity=0.25, isInfinite=true, isNaN=false}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getDimension=8, getL1Norm=Infinity, getLInfNorm=Infinity, getMaxIndex=0, getMaxValue=Infinity, getMinIndex=1, getMinValue=-Infinity, getNorm=Infinity, getSparsity=0.25, isInfinite=true, isNaN=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput022() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math3.linear.OpenMapRealVector", "org.apache.commons.math3.linear.OpenMapRealVector", "ebeMultiply", new String[]{"org.apache.commons.math3.linear.RealVector"}, new String[]{"<sample:10>"}, false, 2, new String[][]{{"org.apache.commons.math3.linear.OpenMapRealVector", "mapDivideToSelf", "double", "-6.7"}}), new String[][]{{"set", "double", "1"}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.math3.linear.OpenMapRealVector", actual.getClass().getName());
  assertEquals("{getDimension=1, getL1Norm=1.0, getLInfNorm=1.0, getMaxIndex=0, getMaxValue=-1.0, getMinIndex=0, getMinValue=-1.0, getNorm=1.0, getSparsity=1.0, isInfinite=false, isNaN=false}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getDimension=1, getL1Norm=0.0, getLInfNorm=0.0, getMaxIndex=0, getMaxValue=0.0, getMinIndex=0, getMinValue=0.0, getNorm=0.0, getSparsity=0.0, isInfinite=false, isNaN=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput023() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math3.linear.OpenMapRealVector", "org.apache.commons.math3.linear.OpenMapRealVector", "append", new String[]{"org.apache.commons.math3.linear.RealVector"}, new String[]{"<sample:10>"}, false, 1, new String[][]{{"org.apache.commons.math3.linear.OpenMapRealVector", "mapDivide", "double", "0.9005000000004999"}}, 3), new String[][]{{"getSubVector", "int,int", "2"}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.math3.linear.OpenMapRealVector", actual.getClass().getName());
  assertEquals("{getDimension=1, getL1Norm=1.0, getLInfNorm=1.0, getMaxIndex=0, getMaxValue=1.0, getMinIndex=0, getMinValue=1.0, getNorm=1.0, getSparsity=1.0, isInfinite=false, isNaN=false}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getDimension=3, getL1Norm=Infinity, getLInfNorm=Infinity, getMaxIndex=1, getMaxValue=Infinity, getMinIndex=2, getMinValue=-Infinity, getNorm=Infinity, getSparsity=1.0, isInfinite=true, isNaN=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput024() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.linear.OpenMapRealVector", "org.apache.commons.math3.linear.OpenMapRealVector", "dotProduct", new String[]{"org.apache.commons.math3.linear.OpenMapRealVector"}, new String[]{"<sample:1>"}, false, 7, new String[][]{{"org.apache.commons.math3.linear.OpenMapRealVector", "walkInDefaultOrder", "org.apache.commons.math3.linear.RealVectorChangingVisitor", "<sample:1>"}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("0.0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getDimension=3, getL1Norm=0.0, getLInfNorm=0.0, getMaxIndex=2, getMaxValue=0.0, getMinIndex=2, getMinValue=0.0, getNorm=0.0, getSparsity=0.0, isInfinite=false, isNaN=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput025() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.linear.OpenMapRealVector", "org.apache.commons.math3.linear.OpenMapRealVector", "getL1Distance", new String[]{"org.apache.commons.math3.linear.OpenMapRealVector"}, new String[]{"<sample:8>"}, false, 1, new String[][]{}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("Infinity", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getDimension=3, getL1Norm=Infinity, getLInfNorm=Infinity, getMaxIndex=1, getMaxValue=Infinity, getMinIndex=2, getMinValue=-Infinity, getNorm=Infinity, getSparsity=1.0, isInfinite=true, isNaN=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput026() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math3.linear.OpenMapRealVector", "org.apache.commons.math3.linear.OpenMapRealVector", "cosine", new String[]{"org.apache.commons.math3.linear.RealVector"}, new String[]{"<sample:1>"}, false, 3, new String[][]{{"org.apache.commons.math3.linear.OpenMapRealVector", "getL1Distance", "org.apache.commons.math3.linear.RealVector", "<sample:2>"}}, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput027() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math3.linear.OpenMapRealVector", "org.apache.commons.math3.linear.OpenMapRealVector", "subtract", new String[]{"org.apache.commons.math3.linear.OpenMapRealVector"}, new String[]{"<sample:7>"}, false, 4, new String[][]{}, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("org.apache.commons.math3.exception.DimensionMismatchException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput028() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math3.linear.OpenMapRealVector", "org.apache.commons.math3.linear.OpenMapRealVector", "add", new String[]{"org.apache.commons.math3.linear.RealVector"}, new String[]{"<null>"}, false, 7, new String[][]{}, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput029() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math3.linear.OpenMapRealVector", "org.apache.commons.math3.linear.OpenMapRealVector", "walkInDefaultOrder", new String[]{"org.apache.commons.math3.linear.RealVectorPreservingVisitor", "int", "int"}, new String[]{"<sample:7>", "2147483647", "2147483647"}, false, 0, null, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("org.apache.commons.math3.exception.OutOfRangeException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput030() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math3.linear.OpenMapRealVector", "org.apache.commons.math3.linear.OpenMapRealVector", "setSubVector", new String[]{"int", "org.apache.commons.math3.linear.RealVector"}, new String[]{"-1024", "<sample:4>"}, false, 3, new String[][]{}, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("org.apache.commons.math3.exception.OutOfRangeException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput031() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math3.linear.OpenMapRealVector", "org.apache.commons.math3.linear.OpenMapRealVector", "append", new String[]{"org.apache.commons.math3.linear.RealVector"}, new String[]{"<sample:5>"}, false, 5, new String[][]{}, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput032() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.linear.OpenMapRealVector", "org.apache.commons.math3.linear.OpenMapRealVector", "mapMultiply", new String[]{"double"}, new String[]{"0.059999999999499995"}, false, 0, null, 3);
  assertNotNull(actual);
  assertEquals("org.apache.commons.math3.linear.OpenMapRealVector", actual.getClass().getName());
  assertEquals("{getDimension=0, getL1Norm=0.0, getLInfNorm=0.0, getMaxIndex=-1, getMaxValue=NaN, getMinIndex=-1, getMinValue=NaN, getNorm=0.0, getSparsity=NaN, isInfinite=false, isNaN=false}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getDimension=0, getL1Norm=0.0, getLInfNorm=0.0, getMaxIndex=-1, getMaxValue=NaN, getMinIndex=-1, getMinValue=NaN, getNorm=0.0, getSparsity=NaN, isInfinite=false, isNaN=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput033() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math3.linear.OpenMapRealVector", "org.apache.commons.math3.linear.OpenMapRealVector", "getL1Distance", new String[]{"org.apache.commons.math3.linear.RealVector"}, new String[]{"<sample:9>"}, false, 4, new String[][]{}, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput034() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math3.linear.OpenMapRealVector", "org.apache.commons.math3.linear.OpenMapRealVector", "ebeDivide", new String[]{"org.apache.commons.math3.linear.RealVector"}, new String[]{"<sample:5>"}, false, 0, new String[][]{{"org.apache.commons.math3.linear.OpenMapRealVector", "walkInOptimizedOrder", "org.apache.commons.math3.linear.RealVectorPreservingVisitor", "<sample:1>"}}, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput035() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.linear.OpenMapRealVector", "org.apache.commons.math3.linear.OpenMapRealVector", "getMaxValue", new String[]{}, new String[]{}, false, 2, new String[][]{{"org.apache.commons.math3.linear.OpenMapRealVector", "getLInfNorm", ""}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("0.0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getDimension=1, getL1Norm=0.0, getLInfNorm=0.0, getMaxIndex=0, getMaxValue=0.0, getMinIndex=0, getMinValue=0.0, getNorm=0.0, getSparsity=0.0, isInfinite=false, isNaN=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput036() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.linear.OpenMapRealVector", "org.apache.commons.math3.linear.OpenMapRealVector", "getL1Distance", new String[]{"org.apache.commons.math3.linear.OpenMapRealVector"}, new String[]{"<sample:4>"}, false, 1, new String[][]{}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("Infinity", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getDimension=3, getL1Norm=Infinity, getLInfNorm=Infinity, getMaxIndex=1, getMaxValue=Infinity, getMinIndex=2, getMinValue=-Infinity, getNorm=Infinity, getSparsity=1.0, isInfinite=true, isNaN=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput037() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.linear.OpenMapRealVector", "org.apache.commons.math3.linear.OpenMapRealVector", "mapToSelf", new String[]{"org.apache.commons.math3.analysis.UnivariateFunction"}, new String[]{"<sample:3>"}, false, 6, new String[][]{{"org.apache.commons.math3.linear.OpenMapRealVector", "combine", "double,double,org.apache.commons.math3.linear.RealVector", "0.0", "NaN", "<sample:9>"}}, 3);
  assertNotNull(actual);
  assertEquals("org.apache.commons.math3.linear.OpenMapRealVector", actual.getClass().getName());
  assertEquals("{getDimension=8, getL1Norm=0.0, getLInfNorm=0.0, getMaxIndex=7, getMaxValue=0.0, getMinIndex=7, getMinValue=0.0, getNorm=0.0, getSparsity=0.0, isInfinite=false, isNaN=false}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getDimension=8, getL1Norm=0.0, getLInfNorm=0.0, getMaxIndex=7, getMaxValue=0.0, getMinIndex=7, getMinValue=0.0, getNorm=0.0, getSparsity=0.0, isInfinite=false, isNaN=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput038() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.linear.OpenMapRealVector", "org.apache.commons.math3.linear.OpenMapRealVector", "getMaxIndex", new String[]{}, new String[]{}, false, 5, new String[][]{}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("-1", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getDimension=0, getL1Norm=0.0, getLInfNorm=0.0, getMaxIndex=-1, getMaxValue=NaN, getMinIndex=-1, getMinValue=NaN, getNorm=0.0, getSparsity=NaN, isInfinite=false, isNaN=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput039() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.linear.OpenMapRealVector", "org.apache.commons.math3.linear.OpenMapRealVector", "unitVector", new String[]{}, new String[]{}, false, 7, new String[][]{}, 1);
  assertNotNull(actual);
  assertEquals("org.apache.commons.math3.linear.OpenMapRealVector", actual.getClass().getName());
  assertEquals("{getDimension=3, getL1Norm=NaN, getLInfNorm=NaN, getMaxIndex=2, getMaxValue=0.0, getMinIndex=2, getMinValue=0.0, getNorm=NaN, getSparsity=0.6666666666666666, isInfinite=false, isNaN=true}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getDimension=3, getL1Norm=Infinity, getLInfNorm=Infinity, getMaxIndex=0, getMaxValue=Infinity, getMinIndex=1, getMinValue=-Infinity, getNorm=Infinity, getSparsity=0.6666666666666666, isInfinite=true,...#213#242791861", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput040() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.linear.OpenMapRealVector", "org.apache.commons.math3.linear.OpenMapRealVector", "walkInOptimizedOrder", new String[]{"org.apache.commons.math3.linear.RealVectorPreservingVisitor"}, new String[]{"<sample:6>"}, false, 6, new String[][]{{"org.apache.commons.math3.linear.OpenMapRealVector", "isInfinite", ""}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("-1.0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getDimension=8, getL1Norm=Infinity, getLInfNorm=Infinity, getMaxIndex=0, getMaxValue=Infinity, getMinIndex=1, getMinValue=-Infinity, getNorm=Infinity, getSparsity=0.25, isInfinite=true, isNaN=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput041() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.linear.OpenMapRealVector", "org.apache.commons.math3.linear.OpenMapRealVector", "getMinValue", new String[]{}, new String[]{}, false, 3, new String[][]{{"org.apache.commons.math3.linear.OpenMapRealVector", "mapSubtract", "double", "0.1780000000001"}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("-Infinity", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getDimension=2, getL1Norm=Infinity, getLInfNorm=Infinity, getMaxIndex=1, getMaxValue=-1.0, getMinIndex=0, getMinValue=-Infinity, getNorm=Infinity, getSparsity=1.0, isInfinite=true, isNaN=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput042() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math3.linear.OpenMapRealVector", "org.apache.commons.math3.linear.OpenMapRealVector", "walkInOptimizedOrder", new String[]{"org.apache.commons.math3.linear.RealVectorPreservingVisitor", "int", "int"}, new String[]{"<null>", "2147483583", "11"}, false, 5, new String[][]{}, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("org.apache.commons.math3.exception.OutOfRangeException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput043() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math3.linear.OpenMapRealVector", "org.apache.commons.math3.linear.OpenMapRealVector", "append", new String[]{"org.apache.commons.math3.linear.RealVector"}, new String[]{"<sample:6>"}, false, 1, new String[][]{}, 2), new String[][]{{"dotProduct", "org.apache.commons.math3.linear.OpenMapRealVector", "6"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("org.apache.commons.math3.exception.DimensionMismatchException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput044() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math3.linear.OpenMapRealVector", "org.apache.commons.math3.linear.OpenMapRealVector", "getL1Distance", new String[]{"org.apache.commons.math3.linear.RealVector"}, new String[]{"<sample:9>"}, false, 7, new String[][]{}, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput045() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.linear.OpenMapRealVector", "org.apache.commons.math3.linear.OpenMapRealVector", "mapMultiplyToSelf", new String[]{"double"}, new String[]{"NaN"}, false, 1, new String[][]{}, 3);
  assertNotNull(actual);
  assertEquals("org.apache.commons.math3.linear.OpenMapRealVector", actual.getClass().getName());
  assertEquals("{getDimension=3, getL1Norm=NaN, getLInfNorm=NaN, getMaxIndex=-1, getMaxValue=NaN, getMinIndex=-1, getMinValue=NaN, getNorm=NaN, getSparsity=1.0, isInfinite=false, isNaN=true}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getDimension=3, getL1Norm=NaN, getLInfNorm=NaN, getMaxIndex=-1, getMaxValue=NaN, getMinIndex=-1, getMinValue=NaN, getNorm=NaN, getSparsity=1.0, isInfinite=false, isNaN=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput046() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math3.linear.OpenMapRealVector", "org.apache.commons.math3.linear.OpenMapRealVector", "checkIndex", new String[]{"int"}, new String[]{"2147483647"}, false, 3, new String[][]{}, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("org.apache.commons.math3.exception.OutOfRangeException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput047() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.linear.OpenMapRealVector", "org.apache.commons.math3.linear.OpenMapRealVector", "getEntry", new String[]{"int"}, new String[]{"0"}, false, 7, new String[][]{}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("Infinity", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getDimension=3, getL1Norm=Infinity, getLInfNorm=Infinity, getMaxIndex=0, getMaxValue=Infinity, getMinIndex=1, getMinValue=-Infinity, getNorm=Infinity, getSparsity=0.6666666666666666, isInfinite=true,...#213#242791861", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput048() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.linear.OpenMapRealVector", "org.apache.commons.math3.linear.OpenMapRealVector", "getSparsity", new String[]{}, new String[]{}, false, 2, new String[][]{}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("0.0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getDimension=1, getL1Norm=0.0, getLInfNorm=0.0, getMaxIndex=0, getMaxValue=0.0, getMinIndex=0, getMinValue=0.0, getNorm=0.0, getSparsity=0.0, isInfinite=false, isNaN=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput049() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math3.linear.OpenMapRealVector", "org.apache.commons.math3.linear.OpenMapRealVector", "ebeDivide", new String[]{"org.apache.commons.math3.linear.RealVector"}, new String[]{"<sample:9>"}, false, 0, new String[][]{{"org.apache.commons.math3.linear.OpenMapRealVector", "dotProduct", "org.apache.commons.math3.linear.RealVector", "<sample:1>"}}, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput050() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.linear.OpenMapRealVector", "org.apache.commons.math3.linear.OpenMapRealVector", "getMaxIndex", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.math3.linear.OpenMapRealVector", "getLInfDistance", "org.apache.commons.math3.linear.RealVector", "<sample:2>"}, {"org.apache.commons.math3.linear.OpenMapRealVector", "getDistance", "org.apache.commons.math3.linear.OpenMapRealVector", "<sample:9>"}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("-1", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getDimension=0, getL1Norm=0.0, getLInfNorm=0.0, getMaxIndex=-1, getMaxValue=NaN, getMinIndex=-1, getMinValue=NaN, getNorm=0.0, getSparsity=NaN, isInfinite=false, isNaN=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput051() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.linear.OpenMapRealVector", "org.apache.commons.math3.linear.OpenMapRealVector", "iterator", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.math3.linear.OpenMapRealVector", "getSparsity", ""}}, 2);
  assertNotNull(actual);
  assertEquals("receiver state after the call", "{getDimension=0, getL1Norm=0.0, getLInfNorm=0.0, getMaxIndex=-1, getMaxValue=NaN, getMinIndex=-1, getMinValue=NaN, getNorm=0.0, getSparsity=NaN, isInfinite=false, isNaN=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput052() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.linear.OpenMapRealVector", "org.apache.commons.math3.linear.OpenMapRealVector", "isDefaultValue", new String[]{"double"}, new String[]{"-1.0000000000000002E-12"}, false, 0, null, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getDimension=0, getL1Norm=0.0, getLInfNorm=0.0, getMaxIndex=-1, getMaxValue=NaN, getMinIndex=-1, getMinValue=NaN, getNorm=0.0, getSparsity=NaN, isInfinite=false, isNaN=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput053() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.linear.OpenMapRealVector", "org.apache.commons.math3.linear.OpenMapRealVector", "walkInOptimizedOrder", new String[]{"org.apache.commons.math3.linear.RealVectorPreservingVisitor"}, new String[]{"<sample:1>"}, false, 0, null, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("-1.0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getDimension=0, getL1Norm=0.0, getLInfNorm=0.0, getMaxIndex=-1, getMaxValue=NaN, getMinIndex=-1, getMinValue=NaN, getNorm=0.0, getSparsity=NaN, isInfinite=false, isNaN=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput054() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math3.linear.OpenMapRealVector", "org.apache.commons.math3.linear.OpenMapRealVector", "append", new String[]{"org.apache.commons.math3.linear.RealVector"}, new String[]{"<sample:9>"}, false, 2, new String[][]{{"org.apache.commons.math3.linear.OpenMapRealVector", "getDistance", "org.apache.commons.math3.linear.RealVector", "<sample:2>"}, {"org.apache.commons.math3.linear.OpenMapRealVector", "ebeMultiply", "org.apache.commons.math3.linear.RealVector", "<sample:1>"}}, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput055() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math3.linear.OpenMapRealVector", "org.apache.commons.math3.linear.OpenMapRealVector", "combineToSelf", new String[]{"double", "double", "org.apache.commons.math3.linear.RealVector"}, new String[]{"2.4999999999999994E-13", "1.0", "<sample:2>"}, false, 5, new String[][]{}, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput056() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math3.linear.OpenMapRealVector", "org.apache.commons.math3.linear.OpenMapRealVector", "projection", new String[]{"org.apache.commons.math3.linear.RealVector"}, new String[]{"<sample:6>"}, false, 2, new String[][]{{"org.apache.commons.math3.linear.OpenMapRealVector", "append", "org.apache.commons.math3.linear.OpenMapRealVector", "<sample:7>"}}, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("org.apache.commons.math3.exception.DimensionMismatchException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput057() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.linear.OpenMapRealVector", "org.apache.commons.math3.linear.OpenMapRealVector", "walkInDefaultOrder", new String[]{"org.apache.commons.math3.linear.RealVectorPreservingVisitor"}, new String[]{"<sample:8>"}, false, 3, new String[][]{}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("1.0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getDimension=2, getL1Norm=Infinity, getLInfNorm=Infinity, getMaxIndex=1, getMaxValue=-1.0, getMinIndex=0, getMinValue=-Infinity, getNorm=Infinity, getSparsity=1.0, isInfinite=true, isNaN=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput058() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.linear.OpenMapRealVector", "org.apache.commons.math3.linear.OpenMapRealVector", "getMaxIndex", new String[]{}, new String[]{}, false, 2, new String[][]{{"org.apache.commons.math3.linear.OpenMapRealVector", "getDistance", "org.apache.commons.math3.linear.OpenMapRealVector", "<sample:8>"}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getDimension=1, getL1Norm=0.0, getLInfNorm=0.0, getMaxIndex=0, getMaxValue=0.0, getMinIndex=0, getMinValue=0.0, getNorm=0.0, getSparsity=0.0, isInfinite=false, isNaN=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput059() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math3.linear.OpenMapRealVector", "org.apache.commons.math3.linear.OpenMapRealVector", "walkInOptimizedOrder", new String[]{"org.apache.commons.math3.linear.RealVectorChangingVisitor", "int", "int"}, new String[]{"<sample:5>", "1", "2147483647"}, false, 0, null, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("org.apache.commons.math3.exception.OutOfRangeException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput060() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.linear.OpenMapRealVector", "org.apache.commons.math3.linear.OpenMapRealVector", "walkInDefaultOrder", new String[]{"org.apache.commons.math3.linear.RealVectorPreservingVisitor"}, new String[]{"<sample:4>"}, false, 3, new String[][]{}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("Infinity", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getDimension=2, getL1Norm=Infinity, getLInfNorm=Infinity, getMaxIndex=1, getMaxValue=-1.0, getMinIndex=0, getMinValue=-Infinity, getNorm=Infinity, getSparsity=1.0, isInfinite=true, isNaN=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput061() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.linear.OpenMapRealVector", "org.apache.commons.math3.linear.OpenMapRealVector", "getDistance", new String[]{"org.apache.commons.math3.linear.OpenMapRealVector"}, new String[]{"<sample:5>"}, false, 0, null, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("0.0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getDimension=0, getL1Norm=0.0, getLInfNorm=0.0, getMaxIndex=-1, getMaxValue=NaN, getMinIndex=-1, getMinValue=NaN, getNorm=0.0, getSparsity=NaN, isInfinite=false, isNaN=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput062() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math3.linear.OpenMapRealVector", "org.apache.commons.math3.linear.OpenMapRealVector", "getLInfDistance", new String[]{"org.apache.commons.math3.linear.RealVector"}, new String[]{"<sample:2>"}, false, 3, new String[][]{{"org.apache.commons.math3.linear.OpenMapRealVector", "getDimension", ""}}, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput063() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math3.linear.OpenMapRealVector", "org.apache.commons.math3.linear.OpenMapRealVector", "checkVectorDimensions", new String[]{"int"}, new String[]{"-1073741924"}, false, 1, new String[][]{{"org.apache.commons.math3.linear.OpenMapRealVector", "getLInfNorm", ""}, {"org.apache.commons.math3.linear.OpenMapRealVector", "getL1Norm", ""}}, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("org.apache.commons.math3.exception.DimensionMismatchException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput064() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math3.linear.OpenMapRealVector", "org.apache.commons.math3.linear.OpenMapRealVector", "getEntry", new String[]{"int"}, new String[]{"-1610612699"}, false, 0, new String[][]{{"org.apache.commons.math3.linear.OpenMapRealVector", "mapAdd", "double", "6.7"}, {"org.apache.commons.math3.linear.OpenMapRealVector", "copy", ""}}, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("org.apache.commons.math3.exception.OutOfRangeException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput065() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math3.linear.OpenMapRealVector", "org.apache.commons.math3.linear.OpenMapRealVector", "dotProduct", new String[]{"org.apache.commons.math3.linear.RealVector"}, new String[]{"<sample:9>"}, false, 2, new String[][]{{"org.apache.commons.math3.linear.OpenMapRealVector", "getL1Norm", ""}}, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput066() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math3.linear.OpenMapRealVector", "org.apache.commons.math3.linear.OpenMapRealVector", "cosine", new String[]{"org.apache.commons.math3.linear.RealVector"}, new String[]{"<sample:4>"}, false, 1, new String[][]{}, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("org.apache.commons.math3.exception.MathArithmeticException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput067() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.linear.OpenMapRealVector", "org.apache.commons.math3.linear.OpenMapRealVector", "isInfinite", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.math3.linear.OpenMapRealVector", "ebeMultiply", "org.apache.commons.math3.linear.RealVector", "<sample:7>"}, {"org.apache.commons.math3.linear.OpenMapRealVector", "copy", ""}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getDimension=0, getL1Norm=0.0, getLInfNorm=0.0, getMaxIndex=-1, getMaxValue=NaN, getMinIndex=-1, getMinValue=NaN, getNorm=0.0, getSparsity=NaN, isInfinite=false, isNaN=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput068() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math3.linear.OpenMapRealVector", "org.apache.commons.math3.linear.OpenMapRealVector", "getSubVector", new String[]{"int", "int"}, new String[]{"10", "-2147483648"}, false, 1, new String[][]{{"org.apache.commons.math3.linear.OpenMapRealVector", "ebeDivide", "org.apache.commons.math3.linear.RealVector", "<sample:4>"}}, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("org.apache.commons.math3.exception.OutOfRangeException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput069() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math3.linear.OpenMapRealVector", "org.apache.commons.math3.linear.OpenMapRealVector", "append", new String[]{"org.apache.commons.math3.linear.OpenMapRealVector"}, new String[]{"<sample:6>"}, false, 2, new String[][]{{"org.apache.commons.math3.linear.OpenMapRealVector", "iterator", ""}, {"org.apache.commons.math3.linear.OpenMapRealVector", "walkInOptimizedOrder", "org.apache.commons.math3.linear.RealVectorChangingVisitor", "<sample:4>"}}, 3), new String[][]{{"combineToSelf", "double,double,org.apache.commons.math3.linear.RealVector", "6"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("org.apache.commons.math3.exception.DimensionMismatchException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput070() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math3.linear.OpenMapRealVector", "org.apache.commons.math3.linear.OpenMapRealVector", "checkIndex", new String[]{"int"}, new String[]{"67108865"}, false, 1, new String[][]{{"org.apache.commons.math3.linear.OpenMapRealVector", "getMinValue", ""}}, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("org.apache.commons.math3.exception.OutOfRangeException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput071() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math3.linear.OpenMapRealVector", "org.apache.commons.math3.linear.OpenMapRealVector", "setSubVector", new String[]{"int", "org.apache.commons.math3.linear.RealVector"}, new String[]{"45", "<sample:6>"}, false, 0, null, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("org.apache.commons.math3.exception.OutOfRangeException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput072() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math3.linear.OpenMapRealVector", "org.apache.commons.math3.linear.OpenMapRealVector", "outerProduct", new String[]{"org.apache.commons.math3.linear.RealVector"}, new String[]{"<sample:1>"}, false, 0, new String[][]{{"org.apache.commons.math3.linear.OpenMapRealVector", "iterator", ""}}, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput073() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.linear.OpenMapRealVector", "org.apache.commons.math3.linear.OpenMapRealVector", "unitize", new String[]{}, new String[]{}, false, 3, new String[][]{{"org.apache.commons.math3.linear.OpenMapRealVector", "checkVectorDimensions", "int", "-524289"}, {"org.apache.commons.math3.linear.OpenMapRealVector", "mapDivide", "double", "7.0000000000005"}}, 2);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getDimension=2, getL1Norm=NaN, getLInfNorm=NaN, getMaxIndex=1, getMaxValue=-0.0, getMinIndex=1, getMinValue=-0.0, getNorm=NaN, getSparsity=1.0, isInfinite=false, isNaN=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput074() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.linear.OpenMapRealVector", "org.apache.commons.math3.linear.OpenMapRealVector", "mapToSelf", new String[]{"org.apache.commons.math3.analysis.UnivariateFunction"}, new String[]{"<sample:4>"}, false, 3, new String[][]{{"org.apache.commons.math3.linear.OpenMapRealVector", "checkVectorDimensions", "org.apache.commons.math3.linear.RealVector", "<sample:0>"}}, 2);
  assertNotNull(actual);
  assertEquals("org.apache.commons.math3.linear.OpenMapRealVector", actual.getClass().getName());
  assertEquals("{getDimension=2, getL1Norm=NaN, getLInfNorm=NaN, getMaxIndex=1, getMaxValue=-Infinity, getMinIndex=1, getMinValue=-Infinity, getNorm=NaN, getSparsity=1.0, isInfinite=false, isNaN=true}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getDimension=2, getL1Norm=NaN, getLInfNorm=NaN, getMaxIndex=1, getMaxValue=-Infinity, getMinIndex=1, getMinValue=-Infinity, getNorm=NaN, getSparsity=1.0, isInfinite=false, isNaN=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput075() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.linear.OpenMapRealVector", "org.apache.commons.math3.linear.OpenMapRealVector", "mapMultiplyToSelf", new String[]{"double"}, new String[]{"5.0E-13"}, false, 1, new String[][]{}, 1);
  assertNotNull(actual);
  assertEquals("org.apache.commons.math3.linear.OpenMapRealVector", actual.getClass().getName());
  assertEquals("{getDimension=3, getL1Norm=Infinity, getLInfNorm=Infinity, getMaxIndex=1, getMaxValue=Infinity, getMinIndex=2, getMinValue=-Infinity, getNorm=Infinity, getSparsity=1.0, isInfinite=true, isNaN=false}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getDimension=3, getL1Norm=Infinity, getLInfNorm=Infinity, getMaxIndex=1, getMaxValue=Infinity, getMinIndex=2, getMinValue=-Infinity, getNorm=Infinity, getSparsity=1.0, isInfinite=true, isNaN=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput076() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math3.linear.OpenMapRealVector", "org.apache.commons.math3.linear.OpenMapRealVector", "mapSubtract", new String[]{"double"}, new String[]{"9.000000000001"}, false, 3, new String[][]{{"org.apache.commons.math3.linear.OpenMapRealVector", "addToEntry", "int,double", "0", "0.780000000001"}}, 2), new String[][]{{"outerProduct", "org.apache.commons.math3.linear.RealVector", "5"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput077() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.linear.OpenMapRealVector", "org.apache.commons.math3.linear.OpenMapRealVector", "dotProduct", new String[]{"org.apache.commons.math3.linear.OpenMapRealVector"}, new String[]{"<sample:7>"}, false, 7, new String[][]{{"org.apache.commons.math3.linear.OpenMapRealVector", "mapAddToSelf", "double", "-1.0"}, {"org.apache.commons.math3.linear.OpenMapRealVector", "sparseIterator", ""}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("Infinity", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getDimension=3, getL1Norm=Infinity, getLInfNorm=Infinity, getMaxIndex=0, getMaxValue=Infinity, getMinIndex=1, getMinValue=-Infinity, getNorm=Infinity, getSparsity=0.6666666666666666, isInfinite=true,...#213#242791861", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput078() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.linear.OpenMapRealVector", "org.apache.commons.math3.linear.OpenMapRealVector", "getNorm", new String[]{}, new String[]{}, false, 3, new String[][]{}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("Infinity", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getDimension=2, getL1Norm=Infinity, getLInfNorm=Infinity, getMaxIndex=1, getMaxValue=-1.0, getMinIndex=0, getMinValue=-Infinity, getNorm=Infinity, getSparsity=1.0, isInfinite=true, isNaN=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput079() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math3.linear.OpenMapRealVector", "org.apache.commons.math3.linear.OpenMapRealVector", "getL1Distance", new String[]{"org.apache.commons.math3.linear.OpenMapRealVector"}, new String[]{"<sample:5>"}, false, 1, new String[][]{}, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("org.apache.commons.math3.exception.OutOfRangeException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput080() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math3.linear.OpenMapRealVector", "org.apache.commons.math3.linear.OpenMapRealVector", "mapSubtractToSelf", new String[]{"double"}, new String[]{"5.0E-13"}, false, 3, new String[][]{{"org.apache.commons.math3.linear.OpenMapRealVector", "ebeDivide", "org.apache.commons.math3.linear.RealVector", "<sample:7>"}}, 2), new String[][]{{"walkInDefaultOrder", "org.apache.commons.math3.linear.RealVectorChangingVisitor", "1"}});
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("-1.0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getDimension=2, getL1Norm=2.0, getLInfNorm=1.0, getMaxIndex=1, getMaxValue=-1.0, getMinIndex=1, getMinValue=-1.0, getNorm=1.4142135623730951, getSparsity=1.0, isInfinite=false, isNaN=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput081() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math3.linear.OpenMapRealVector", "org.apache.commons.math3.linear.OpenMapRealVector", "mapAdd", new String[]{"double"}, new String[]{"6.664000000000001"}, false, 0, new String[][]{{"org.apache.commons.math3.linear.OpenMapRealVector", "mapSubtract", "double", "5.0E-13"}, {"org.apache.commons.math3.linear.OpenMapRealVector", "isNaN", ""}}, 2), new String[][]{{"combineToSelf", "double,double,org.apache.commons.math3.linear.RealVector", "2"}, {"addToEntry", "int,double", "1"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("org.apache.commons.math3.exception.OutOfRangeException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput082() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.linear.OpenMapRealVector", "org.apache.commons.math3.linear.OpenMapRealVector", "checkVectorDimensions", new String[]{"int"}, new String[]{"0"}, false, 5, new String[][]{{"org.apache.commons.math3.linear.OpenMapRealVector", "projection", "org.apache.commons.math3.linear.RealVector", "<sample:3>"}, {"org.apache.commons.math3.linear.OpenMapRealVector", "walkInDefaultOrder", "org.apache.commons.math3.linear.RealVectorPreservingVisitor,int,int", "<sample:6>", "2147483647", "2147483647"}}, 3);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getDimension=0, getL1Norm=0.0, getLInfNorm=0.0, getMaxIndex=-1, getMaxValue=NaN, getMinIndex=-1, getMinValue=NaN, getNorm=0.0, getSparsity=NaN, isInfinite=false, isNaN=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput083() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math3.linear.OpenMapRealVector", "org.apache.commons.math3.linear.OpenMapRealVector", "combine", new String[]{"double", "double", "org.apache.commons.math3.linear.RealVector"}, new String[]{"1.7976931348623157E308", "14.000000000000998", "<sample:4>"}, false, 3, new String[][]{{"org.apache.commons.math3.linear.OpenMapRealVector", "walkInOptimizedOrder", "org.apache.commons.math3.linear.RealVectorChangingVisitor", "<sample:1>"}}, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("org.apache.commons.math3.exception.DimensionMismatchException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput084() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.linear.OpenMapRealVector", "org.apache.commons.math3.linear.OpenMapRealVector", "getL1Norm", new String[]{}, new String[]{}, false, 1, new String[][]{}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("Infinity", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getDimension=3, getL1Norm=Infinity, getLInfNorm=Infinity, getMaxIndex=1, getMaxValue=Infinity, getMinIndex=2, getMinValue=-Infinity, getNorm=Infinity, getSparsity=1.0, isInfinite=true, isNaN=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput085() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math3.linear.OpenMapRealVector", "org.apache.commons.math3.linear.OpenMapRealVector", "mapAdd", new String[]{"double"}, new String[]{"-1.0000000000000002E-12"}, false, 0, new String[][]{{"org.apache.commons.math3.linear.OpenMapRealVector", "getDimension", ""}}, 3), new String[][]{{"getNorm", "", "1"}});
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("0.0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getDimension=0, getL1Norm=0.0, getLInfNorm=0.0, getMaxIndex=-1, getMaxValue=NaN, getMinIndex=-1, getMinValue=NaN, getNorm=0.0, getSparsity=NaN, isInfinite=false, isNaN=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput086() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.linear.OpenMapRealVector", "org.apache.commons.math3.linear.OpenMapRealVector", "isNaN", new String[]{}, new String[]{}, false, 7, new String[][]{{"org.apache.commons.math3.linear.OpenMapRealVector", "getMaxValue", ""}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getDimension=3, getL1Norm=Infinity, getLInfNorm=Infinity, getMaxIndex=0, getMaxValue=Infinity, getMinIndex=1, getMinValue=-Infinity, getNorm=Infinity, getSparsity=0.6666666666666666, isInfinite=true,...#213#242791861", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput087() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math3.linear.OpenMapRealVector", "org.apache.commons.math3.linear.OpenMapRealVector", "mapAddToSelf", new String[]{"double"}, new String[]{"-1.0"}, false, 7, new String[][]{{"org.apache.commons.math3.linear.OpenMapRealVector", "map", "org.apache.commons.math3.analysis.UnivariateFunction", "<sample:0>"}}, 1), new String[][]{{"add", "org.apache.commons.math3.linear.OpenMapRealVector", "3"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("org.apache.commons.math3.exception.DimensionMismatchException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput088() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.linear.OpenMapRealVector", "org.apache.commons.math3.linear.OpenMapRealVector", "equals", new String[]{"java.lang.Object"}, new String[]{"<s:>"}, false, 0, new String[][]{{"org.apache.commons.math3.linear.OpenMapRealVector", "walkInOptimizedOrder", "org.apache.commons.math3.linear.RealVectorChangingVisitor,int,int", "<sample:3>", "2147483647", "1"}, {"org.apache.commons.math3.linear.OpenMapRealVector", "unitVector", ""}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getDimension=0, getL1Norm=0.0, getLInfNorm=0.0, getMaxIndex=-1, getMaxValue=NaN, getMinIndex=-1, getMinValue=NaN, getNorm=0.0, getSparsity=NaN, isInfinite=false, isNaN=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput089() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.linear.OpenMapRealVector", "org.apache.commons.math3.linear.OpenMapRealVector", "mapDivide", new String[]{"double"}, new String[]{"5.0E-13"}, false, 5, new String[][]{{"org.apache.commons.math3.linear.OpenMapRealVector", "mapToSelf", "org.apache.commons.math3.analysis.UnivariateFunction", "<sample:4>"}}, 2);
  assertNotNull(actual);
  assertEquals("org.apache.commons.math3.linear.OpenMapRealVector", actual.getClass().getName());
  assertEquals("{getDimension=0, getL1Norm=0.0, getLInfNorm=0.0, getMaxIndex=-1, getMaxValue=NaN, getMinIndex=-1, getMinValue=NaN, getNorm=0.0, getSparsity=NaN, isInfinite=false, isNaN=false}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getDimension=0, getL1Norm=0.0, getLInfNorm=0.0, getMaxIndex=-1, getMaxValue=NaN, getMinIndex=-1, getMinValue=NaN, getNorm=0.0, getSparsity=NaN, isInfinite=false, isNaN=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput090() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math3.linear.OpenMapRealVector", "org.apache.commons.math3.linear.OpenMapRealVector", "projection", new String[]{"org.apache.commons.math3.linear.RealVector"}, new String[]{"<sample:9>"}, false, 5, new String[][]{{"org.apache.commons.math3.linear.OpenMapRealVector", "getMaxIndex", ""}}, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput091() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.linear.OpenMapRealVector", "org.apache.commons.math3.linear.OpenMapRealVector", "append", new String[]{"double"}, new String[]{"8.7722226955807068E18"}, false, 1, new String[][]{}, 2);
  assertNotNull(actual);
  assertEquals("org.apache.commons.math3.linear.OpenMapRealVector", actual.getClass().getName());
  assertEquals("{getDimension=4, getL1Norm=Infinity, getLInfNorm=Infinity, getMaxIndex=1, getMaxValue=Infinity, getMinIndex=2, getMinValue=-Infinity, getNorm=Infinity, getSparsity=1.0, isInfinite=true, isNaN=false}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getDimension=3, getL1Norm=Infinity, getLInfNorm=Infinity, getMaxIndex=1, getMaxValue=Infinity, getMinIndex=2, getMinValue=-Infinity, getNorm=Infinity, getSparsity=1.0, isInfinite=true, isNaN=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput092() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.linear.OpenMapRealVector", "org.apache.commons.math3.linear.OpenMapRealVector", "mapAddToSelf", new String[]{"double"}, new String[]{"Infinity"}, false, 0, null, 2);
  assertNotNull(actual);
  assertEquals("org.apache.commons.math3.linear.OpenMapRealVector", actual.getClass().getName());
  assertEquals("{getDimension=0, getL1Norm=0.0, getLInfNorm=0.0, getMaxIndex=-1, getMaxValue=NaN, getMinIndex=-1, getMinValue=NaN, getNorm=0.0, getSparsity=NaN, isInfinite=false, isNaN=false}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getDimension=0, getL1Norm=0.0, getLInfNorm=0.0, getMaxIndex=-1, getMaxValue=NaN, getMinIndex=-1, getMinValue=NaN, getNorm=0.0, getSparsity=NaN, isInfinite=false, isNaN=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput093() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.linear.OpenMapRealVector", "org.apache.commons.math3.linear.OpenMapRealVector", "getL1Distance", new String[]{"org.apache.commons.math3.linear.OpenMapRealVector"}, new String[]{"<sample:4>"}, false, 0, null, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("Infinity", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getDimension=0, getL1Norm=0.0, getLInfNorm=0.0, getMaxIndex=-1, getMaxValue=NaN, getMinIndex=-1, getMinValue=NaN, getNorm=0.0, getSparsity=NaN, isInfinite=false, isNaN=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput094() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math3.linear.OpenMapRealVector", "org.apache.commons.math3.linear.OpenMapRealVector", "map", new String[]{"org.apache.commons.math3.analysis.UnivariateFunction"}, new String[]{"<sample:5>"}, false, 0, new String[][]{{"org.apache.commons.math3.linear.OpenMapRealVector", "getMaxIndex", ""}}, 1), new String[][]{{"append", "org.apache.commons.math3.linear.OpenMapRealVector", "4"}, {"dotProduct", "org.apache.commons.math3.linear.OpenMapRealVector", "1"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("org.apache.commons.math3.exception.DimensionMismatchException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput095() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.linear.OpenMapRealVector", "org.apache.commons.math3.linear.OpenMapRealVector", "set", new String[]{"double"}, new String[]{"5.000000000000001E-13"}, false, 1, new String[][]{{"org.apache.commons.math3.linear.OpenMapRealVector", "getDistance", "org.apache.commons.math3.linear.RealVector", "<sample:1>"}}, 2);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getDimension=3, getL1Norm=0.0, getLInfNorm=0.0, getMaxIndex=2, getMaxValue=0.0, getMinIndex=2, getMinValue=0.0, getNorm=0.0, getSparsity=0.0, isInfinite=false, isNaN=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput096() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math3.linear.OpenMapRealVector", "org.apache.commons.math3.linear.OpenMapRealVector", "subtract", new String[]{"org.apache.commons.math3.linear.OpenMapRealVector"}, new String[]{"<sample:10>"}, false, 0, new String[][]{{"org.apache.commons.math3.linear.OpenMapRealVector", "getDimension", ""}}, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("org.apache.commons.math3.exception.DimensionMismatchException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput097() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math3.linear.OpenMapRealVector", "org.apache.commons.math3.linear.OpenMapRealVector", "mapSubtract", new String[]{"double"}, new String[]{"8772222695580707260"}, false, 0, new String[][]{{"org.apache.commons.math3.linear.OpenMapRealVector", "walkInOptimizedOrder", "org.apache.commons.math3.linear.RealVectorChangingVisitor,int,int", "<sample:4>", "67108916", "126"}}, 2), new String[][]{{"set", "double", "4"}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.math3.linear.OpenMapRealVector", actual.getClass().getName());
  assertEquals("{getDimension=0, getL1Norm=0.0, getLInfNorm=0.0, getMaxIndex=-1, getMaxValue=NaN, getMinIndex=-1, getMinValue=NaN, getNorm=0.0, getSparsity=NaN, isInfinite=false, isNaN=false}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getDimension=0, getL1Norm=0.0, getLInfNorm=0.0, getMaxIndex=-1, getMaxValue=NaN, getMinIndex=-1, getMinValue=NaN, getNorm=0.0, getSparsity=NaN, isInfinite=false, isNaN=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput098() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.linear.OpenMapRealVector", "org.apache.commons.math3.linear.OpenMapRealVector", "getDistance", new String[]{"org.apache.commons.math3.linear.OpenMapRealVector"}, new String[]{"<sample:7>"}, false, 5, new String[][]{{"org.apache.commons.math3.linear.OpenMapRealVector", "getMaxValue", ""}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("Infinity", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getDimension=0, getL1Norm=0.0, getLInfNorm=0.0, getMaxIndex=-1, getMaxValue=NaN, getMinIndex=-1, getMinValue=NaN, getNorm=0.0, getSparsity=NaN, isInfinite=false, isNaN=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput099() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math3.linear.OpenMapRealVector", "org.apache.commons.math3.linear.OpenMapRealVector", "combineToSelf", new String[]{"double", "double", "org.apache.commons.math3.linear.RealVector"}, new String[]{"4.9E-324", "-2.2999999999995", "<sample:16>"}, false, 1, new String[][]{}, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("org.apache.commons.math3.exception.DimensionMismatchException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput100() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math3.linear.OpenMapRealVector", "org.apache.commons.math3.linear.OpenMapRealVector", "checkVectorDimensions", new String[]{"org.apache.commons.math3.linear.RealVector"}, new String[]{"<sample:6>"}, false, 3, new String[][]{{"org.apache.commons.math3.linear.OpenMapRealVector", "mapMultiplyToSelf", "double", "0.780000000001"}, {"org.apache.commons.math3.linear.OpenMapRealVector", "dotProduct", "org.apache.commons.math3.linear.RealVector", "<sample:4>"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("org.apache.commons.math3.exception.DimensionMismatchException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput101() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.linear.OpenMapRealVector", "org.apache.commons.math3.linear.OpenMapRealVector", "walkInDefaultOrder", new String[]{"org.apache.commons.math3.linear.RealVectorChangingVisitor"}, new String[]{"<sample:3>"}, false);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("1.0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getDimension=0, getL1Norm=0.0, getLInfNorm=0.0, getMaxIndex=-1, getMaxValue=NaN, getMinIndex=-1, getMinValue=NaN, getNorm=0.0, getSparsity=NaN, isInfinite=false, isNaN=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput102() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.linear.OpenMapRealVector", "org.apache.commons.math3.linear.OpenMapRealVector", "getMinValue", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.math3.linear.OpenMapRealVector", "append", "org.apache.commons.math3.linear.RealVector", "<sample:5>"}});
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("NaN", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getDimension=0, getL1Norm=0.0, getLInfNorm=0.0, getMaxIndex=-1, getMaxValue=NaN, getMinIndex=-1, getMinValue=NaN, getNorm=0.0, getSparsity=NaN, isInfinite=false, isNaN=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput103() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.linear.OpenMapRealVector", "org.apache.commons.math3.linear.OpenMapRealVector", "getMaxIndex", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.math3.linear.OpenMapRealVector", "mapDivide", "double", "5.0E-13"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("-1", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getDimension=0, getL1Norm=0.0, getLInfNorm=0.0, getMaxIndex=-1, getMaxValue=NaN, getMinIndex=-1, getMinValue=NaN, getNorm=0.0, getSparsity=NaN, isInfinite=false, isNaN=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput104() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math3.linear.OpenMapRealVector", "org.apache.commons.math3.linear.OpenMapRealVector", "setSubVector", new String[]{"int", "org.apache.commons.math3.linear.RealVector"}, new String[]{"2147483647", "<sample:0>"}, false, 0, new String[][]{{"org.apache.commons.math3.linear.OpenMapRealVector", "outerProduct", "org.apache.commons.math3.linear.RealVector", "<sample:5>"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("org.apache.commons.math3.exception.OutOfRangeException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput105() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.linear.OpenMapRealVector", "org.apache.commons.math3.linear.OpenMapRealVector", "getL1Norm", new String[]{}, new String[]{}, false, 7, new String[][]{{"org.apache.commons.math3.linear.OpenMapRealVector", "toArray", ""}, {"org.apache.commons.math3.linear.OpenMapRealVector", "combine", "double,double,org.apache.commons.math3.linear.RealVector", "1.7976931348623157E308", "1.0", "<sample:4>"}});
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("Infinity", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getDimension=3, getL1Norm=Infinity, getLInfNorm=Infinity, getMaxIndex=0, getMaxValue=Infinity, getMinIndex=1, getMinValue=-Infinity, getNorm=Infinity, getSparsity=0.6666666666666666, isInfinite=true,...#213#242791861", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput106() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math3.linear.OpenMapRealVector", "org.apache.commons.math3.linear.OpenMapRealVector", "unitize", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.math3.linear.OpenMapRealVector", "isNaN", ""}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("org.apache.commons.math3.exception.MathArithmeticException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput107() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math3.linear.OpenMapRealVector", "org.apache.commons.math3.linear.OpenMapRealVector", "subtract", new String[]{"org.apache.commons.math3.linear.RealVector"}, new String[]{"<sample:3>"}, false, 3, new String[][]{}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput108() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.linear.OpenMapRealVector", "org.apache.commons.math3.linear.OpenMapRealVector", "isNaN", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.math3.linear.OpenMapRealVector", "mapToSelf", "org.apache.commons.math3.analysis.UnivariateFunction", "<sample:6>"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getDimension=0, getL1Norm=0.0, getLInfNorm=0.0, getMaxIndex=-1, getMaxValue=NaN, getMinIndex=-1, getMinValue=NaN, getNorm=0.0, getSparsity=NaN, isInfinite=false, isNaN=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput109() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math3.linear.OpenMapRealVector", "org.apache.commons.math3.linear.OpenMapRealVector", "checkIndex", new String[]{"int"}, new String[]{"-2147483647"}, false, 7, new String[][]{{"org.apache.commons.math3.linear.OpenMapRealVector", "outerProduct", "org.apache.commons.math3.linear.RealVector", "<sample:4>"}, {"org.apache.commons.math3.linear.OpenMapRealVector", "unitVector", ""}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("org.apache.commons.math3.exception.OutOfRangeException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput110() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math3.linear.OpenMapRealVector", "org.apache.commons.math3.linear.OpenMapRealVector", "walkInDefaultOrder", new String[]{"org.apache.commons.math3.linear.RealVectorPreservingVisitor", "int", "int"}, new String[]{"<sample:7>", "2", "-2147483648"}, false, 3, new String[][]{{"org.apache.commons.math3.linear.OpenMapRealVector", "getDistance", "org.apache.commons.math3.linear.RealVector", "<null>"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("org.apache.commons.math3.exception.OutOfRangeException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput111() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.linear.OpenMapRealVector", "org.apache.commons.math3.linear.OpenMapRealVector", "getMinIndex", new String[]{}, new String[]{}, false);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("-1", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getDimension=0, getL1Norm=0.0, getLInfNorm=0.0, getMaxIndex=-1, getMaxValue=NaN, getMinIndex=-1, getMinValue=NaN, getNorm=0.0, getSparsity=NaN, isInfinite=false, isNaN=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput112() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.linear.OpenMapRealVector", "org.apache.commons.math3.linear.OpenMapRealVector", "getMinValue", new String[]{}, new String[]{}, false, 1, new String[][]{{"org.apache.commons.math3.linear.OpenMapRealVector", "setEntry", "int,double", "-7", "-5.0E-13"}});
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("-Infinity", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getDimension=3, getL1Norm=Infinity, getLInfNorm=Infinity, getMaxIndex=1, getMaxValue=Infinity, getMinIndex=2, getMinValue=-Infinity, getNorm=Infinity, getSparsity=1.0, isInfinite=true, isNaN=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput113() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math3.linear.OpenMapRealVector", "org.apache.commons.math3.linear.OpenMapRealVector", "getSubVector", new String[]{"int", "int"}, new String[]{"-2147483648", "2147483647"}, false, 6, new String[][]{}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("org.apache.commons.math3.exception.OutOfRangeException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput114() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.linear.OpenMapRealVector", "org.apache.commons.math3.linear.OpenMapRealVector", "isDefaultValue", new String[]{"double"}, new String[]{"Infinity"}, false);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getDimension=0, getL1Norm=0.0, getLInfNorm=0.0, getMaxIndex=-1, getMaxValue=NaN, getMinIndex=-1, getMinValue=NaN, getNorm=0.0, getSparsity=NaN, isInfinite=false, isNaN=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput115() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.linear.OpenMapRealVector", "org.apache.commons.math3.linear.OpenMapRealVector", "copy", new String[]{}, new String[]{}, false, 2, new String[][]{});
  assertNotNull(actual);
  assertEquals("org.apache.commons.math3.linear.OpenMapRealVector", actual.getClass().getName());
  assertEquals("{getDimension=1, getL1Norm=0.0, getLInfNorm=0.0, getMaxIndex=0, getMaxValue=0.0, getMinIndex=0, getMinValue=0.0, getNorm=0.0, getSparsity=0.0, isInfinite=false, isNaN=false}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getDimension=1, getL1Norm=0.0, getLInfNorm=0.0, getMaxIndex=0, getMaxValue=0.0, getMinIndex=0, getMinValue=0.0, getNorm=0.0, getSparsity=0.0, isInfinite=false, isNaN=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput116() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.linear.OpenMapRealVector", "org.apache.commons.math3.linear.OpenMapRealVector", "set", new String[]{"double"}, new String[]{"14.000000000001"}, false);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getDimension=0, getL1Norm=0.0, getLInfNorm=0.0, getMaxIndex=-1, getMaxValue=NaN, getMinIndex=-1, getMinValue=NaN, getNorm=0.0, getSparsity=NaN, isInfinite=false, isNaN=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput117() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math3.linear.OpenMapRealVector", "org.apache.commons.math3.linear.OpenMapRealVector", "addToEntry", new String[]{"int", "double"}, new String[]{"0", "Infinity"}, false); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("org.apache.commons.math3.exception.OutOfRangeException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput118() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.linear.OpenMapRealVector", "org.apache.commons.math3.linear.OpenMapRealVector", "ebeMultiply", new String[]{"org.apache.commons.math3.linear.RealVector"}, new String[]{"<sample:6>"}, false);
  assertNotNull(actual);
  assertEquals("org.apache.commons.math3.linear.OpenMapRealVector", actual.getClass().getName());
  assertEquals("{getDimension=0, getL1Norm=0.0, getLInfNorm=0.0, getMaxIndex=-1, getMaxValue=NaN, getMinIndex=-1, getMinValue=NaN, getNorm=0.0, getSparsity=NaN, isInfinite=false, isNaN=false}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getDimension=0, getL1Norm=0.0, getLInfNorm=0.0, getMaxIndex=-1, getMaxValue=NaN, getMinIndex=-1, getMinValue=NaN, getNorm=0.0, getSparsity=NaN, isInfinite=false, isNaN=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput119() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.linear.OpenMapRealVector", "org.apache.commons.math3.linear.OpenMapRealVector", "equals", new String[]{"java.lang.Object"}, new String[]{"<b:true>"}, false);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getDimension=0, getL1Norm=0.0, getLInfNorm=0.0, getMaxIndex=-1, getMaxValue=NaN, getMinIndex=-1, getMinValue=NaN, getNorm=0.0, getSparsity=NaN, isInfinite=false, isNaN=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput120() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math3.linear.OpenMapRealVector", "org.apache.commons.math3.linear.OpenMapRealVector", "projection", new String[]{"org.apache.commons.math3.linear.RealVector"}, new String[]{"<sample:5>"}, false, 0, new String[][]{{"org.apache.commons.math3.linear.OpenMapRealVector", "mapSubtract", "double", "2.4999999999999994E-13"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput121() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math3.linear.OpenMapRealVector", "org.apache.commons.math3.linear.OpenMapRealVector", "add", new String[]{"org.apache.commons.math3.linear.RealVector"}, new String[]{"<sample:2>"}, false, 3, new String[][]{{"org.apache.commons.math3.linear.OpenMapRealVector", "mapDivideToSelf", "double", "0.7800000000010001"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput122() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.linear.OpenMapRealVector", "org.apache.commons.math3.linear.OpenMapRealVector", "walkInOptimizedOrder", new String[]{"org.apache.commons.math3.linear.RealVectorPreservingVisitor"}, new String[]{"<sample:0>"}, false, 3, new String[][]{{"org.apache.commons.math3.linear.OpenMapRealVector", "set", "double", "Infinity"}});
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("-Infinity", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getDimension=2, getL1Norm=Infinity, getLInfNorm=Infinity, getMaxIndex=1, getMaxValue=Infinity, getMinIndex=1, getMinValue=Infinity, getNorm=Infinity, getSparsity=1.0, isInfinite=true, isNaN=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput123() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.linear.OpenMapRealVector", "org.apache.commons.math3.linear.OpenMapRealVector", "getL1Norm", new String[]{}, new String[]{}, false);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("0.0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getDimension=0, getL1Norm=0.0, getLInfNorm=0.0, getMaxIndex=-1, getMaxValue=NaN, getMinIndex=-1, getMinValue=NaN, getNorm=0.0, getSparsity=NaN, isInfinite=false, isNaN=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput124() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.linear.OpenMapRealVector", "org.apache.commons.math3.linear.OpenMapRealVector", "mapSubtract", new String[]{"double"}, new String[]{"1.0E-12"}, false);
  assertNotNull(actual);
  assertEquals("org.apache.commons.math3.linear.OpenMapRealVector", actual.getClass().getName());
  assertEquals("{getDimension=0, getL1Norm=0.0, getLInfNorm=0.0, getMaxIndex=-1, getMaxValue=NaN, getMinIndex=-1, getMinValue=NaN, getNorm=0.0, getSparsity=NaN, isInfinite=false, isNaN=false}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getDimension=0, getL1Norm=0.0, getLInfNorm=0.0, getMaxIndex=-1, getMaxValue=NaN, getMinIndex=-1, getMinValue=NaN, getNorm=0.0, getSparsity=NaN, isInfinite=false, isNaN=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput125() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.linear.OpenMapRealVector", "org.apache.commons.math3.linear.OpenMapRealVector", "isNaN", new String[]{}, new String[]{}, false, 3, new String[][]{{"org.apache.commons.math3.linear.OpenMapRealVector", "mapAdd", "double", "4.9E-324"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getDimension=2, getL1Norm=Infinity, getLInfNorm=Infinity, getMaxIndex=1, getMaxValue=-1.0, getMinIndex=0, getMinValue=-Infinity, getNorm=Infinity, getSparsity=1.0, isInfinite=true, isNaN=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput126() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.linear.OpenMapRealVector", "org.apache.commons.math3.linear.OpenMapRealVector", "sparseIterator", new String[]{}, new String[]{}, false, 3, new String[][]{{"org.apache.commons.math3.linear.OpenMapRealVector", "walkInOptimizedOrder", "org.apache.commons.math3.linear.RealVectorPreservingVisitor", "<sample:5>"}, {"org.apache.commons.math3.linear.OpenMapRealVector", "dotProduct", "org.apache.commons.math3.linear.OpenMapRealVector", "<sample:5>"}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.math3.linear.OpenMapRealVector$OpenMapSparseIterator", actual.getClass().getName());
  assertEquals("{hasNext=true}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getDimension=2, getL1Norm=Infinity, getLInfNorm=Infinity, getMaxIndex=1, getMaxValue=-1.0, getMinIndex=0, getMinValue=-Infinity, getNorm=Infinity, getSparsity=1.0, isInfinite=true, isNaN=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput127() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.linear.OpenMapRealVector", "org.apache.commons.math3.linear.OpenMapRealVector", "equals", new String[]{"java.lang.Object"}, new String[]{"<s:fey>"}, false, 1, new String[][]{{"org.apache.commons.math3.linear.OpenMapRealVector", "sparseIterator", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getDimension=3, getL1Norm=Infinity, getLInfNorm=Infinity, getMaxIndex=1, getMaxValue=Infinity, getMinIndex=2, getMinValue=-Infinity, getNorm=Infinity, getSparsity=1.0, isInfinite=true, isNaN=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput128() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math3.linear.OpenMapRealVector", "org.apache.commons.math3.linear.OpenMapRealVector", "getL1Distance", new String[]{"org.apache.commons.math3.linear.RealVector"}, new String[]{"<sample:5>"}, false, 1, new String[][]{{"org.apache.commons.math3.linear.OpenMapRealVector", "getL1Distance", "org.apache.commons.math3.linear.RealVector", "<sample:8>"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput129() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.linear.OpenMapRealVector", "org.apache.commons.math3.linear.OpenMapRealVector", "getDimension", new String[]{}, new String[]{}, false, 2, new String[][]{{"org.apache.commons.math3.linear.OpenMapRealVector", "append", "org.apache.commons.math3.linear.RealVector", "<sample:7>"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("1", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getDimension=1, getL1Norm=0.0, getLInfNorm=0.0, getMaxIndex=0, getMaxValue=0.0, getMinIndex=0, getMinValue=0.0, getNorm=0.0, getSparsity=0.0, isInfinite=false, isNaN=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput130() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math3.linear.OpenMapRealVector", "org.apache.commons.math3.linear.OpenMapRealVector", "append", new String[]{"org.apache.commons.math3.linear.RealVector"}, new String[]{"<sample:9>"}, false, 4, new String[][]{{"org.apache.commons.math3.linear.OpenMapRealVector", "subtract", "org.apache.commons.math3.linear.OpenMapRealVector", "<sample:9>"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput131() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.linear.OpenMapRealVector", "org.apache.commons.math3.linear.OpenMapRealVector", "sparseIterator", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.math3.linear.OpenMapRealVector", "setEntry", "int,double", "2147483647", "-5.0E-13"}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.math3.linear.OpenMapRealVector$OpenMapSparseIterator", actual.getClass().getName());
  assertEquals("{hasNext=false}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getDimension=0, getL1Norm=0.0, getLInfNorm=0.0, getMaxIndex=-1, getMaxValue=NaN, getMinIndex=-1, getMinValue=NaN, getNorm=0.0, getSparsity=NaN, isInfinite=false, isNaN=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput132() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math3.linear.OpenMapRealVector", "org.apache.commons.math3.linear.OpenMapRealVector", "copy", new String[]{}, new String[]{}, false, 7, new String[][]{{"org.apache.commons.math3.linear.OpenMapRealVector", "getDimension", ""}}), new String[][]{{"walkInDefaultOrder", "org.apache.commons.math3.linear.RealVectorPreservingVisitor", "3"}, {"set", "double", "7"}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.math3.linear.OpenMapRealVector", actual.getClass().getName());
  assertEquals("{getDimension=3, getL1Norm=0.0, getLInfNorm=0.0, getMaxIndex=2, getMaxValue=0.0, getMinIndex=2, getMinValue=0.0, getNorm=0.0, getSparsity=0.0, isInfinite=false, isNaN=false}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getDimension=3, getL1Norm=Infinity, getLInfNorm=Infinity, getMaxIndex=0, getMaxValue=Infinity, getMinIndex=1, getMinValue=-Infinity, getNorm=Infinity, getSparsity=0.6666666666666666, isInfinite=true,...#213#242791861", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput133() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.linear.OpenMapRealVector", "org.apache.commons.math3.linear.OpenMapRealVector", "walkInOptimizedOrder", new String[]{"org.apache.commons.math3.linear.RealVectorChangingVisitor"}, new String[]{"<sample:3>"}, false, 1, new String[][]{{"org.apache.commons.math3.linear.OpenMapRealVector", "setEntry", "int,double", "10", "-1.7976931348623157E308"}});
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("1.0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getDimension=3, getL1Norm=3.0, getLInfNorm=1.0, getMaxIndex=2, getMaxValue=1.0, getMinIndex=2, getMinValue=1.0, getNorm=1.7320508075688772, getSparsity=1.0, isInfinite=false, isNaN=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput134() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.linear.OpenMapRealVector", "org.apache.commons.math3.linear.OpenMapRealVector", "append", new String[]{"org.apache.commons.math3.linear.OpenMapRealVector"}, new String[]{"<sample:2>"}, false, 0, new String[][]{{"org.apache.commons.math3.linear.OpenMapRealVector", "walkInDefaultOrder", "org.apache.commons.math3.linear.RealVectorChangingVisitor", "<sample:5>"}, {"org.apache.commons.math3.linear.OpenMapRealVector", "subtract", "org.apache.commons.math3.linear.RealVector", "<sample:7>"}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.math3.linear.OpenMapRealVector", actual.getClass().getName());
  assertEquals("{getDimension=1, getL1Norm=0.0, getLInfNorm=0.0, getMaxIndex=0, getMaxValue=0.0, getMinIndex=0, getMinValue=0.0, getNorm=0.0, getSparsity=0.0, isInfinite=false, isNaN=false}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getDimension=0, getL1Norm=0.0, getLInfNorm=0.0, getMaxIndex=-1, getMaxValue=NaN, getMinIndex=-1, getMinValue=NaN, getNorm=0.0, getSparsity=NaN, isInfinite=false, isNaN=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput135() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.linear.OpenMapRealVector", "org.apache.commons.math3.linear.OpenMapRealVector", "mapDivideToSelf", new String[]{"double"}, new String[]{"1.0E-13"}, false, 3, new String[][]{{"org.apache.commons.math3.linear.OpenMapRealVector", "getEntry", "int", "37"}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.math3.linear.OpenMapRealVector", actual.getClass().getName());
  assertEquals("{getDimension=2, getL1Norm=Infinity, getLInfNorm=Infinity, getMaxIndex=1, getMaxValue=-1.0E13, getMinIndex=0, getMinValue=-Infinity, getNorm=Infinity, getSparsity=1.0, isInfinite=true, isNaN=false}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getDimension=2, getL1Norm=Infinity, getLInfNorm=Infinity, getMaxIndex=1, getMaxValue=-1.0E13, getMinIndex=0, getMinValue=-Infinity, getNorm=Infinity, getSparsity=1.0, isInfinite=true, isNaN=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput136() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math3.linear.OpenMapRealVector", "org.apache.commons.math3.linear.OpenMapRealVector", "dotProduct", new String[]{"org.apache.commons.math3.linear.RealVector"}, new String[]{"<sample:2>"}, false, 0, new String[][]{{"org.apache.commons.math3.linear.OpenMapRealVector", "set", "double", "-45.0"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput137() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.linear.OpenMapRealVector", "org.apache.commons.math3.linear.OpenMapRealVector", "getLInfNorm", new String[]{}, new String[]{}, false);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("0.0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getDimension=0, getL1Norm=0.0, getLInfNorm=0.0, getMaxIndex=-1, getMaxValue=NaN, getMinIndex=-1, getMinValue=NaN, getNorm=0.0, getSparsity=NaN, isInfinite=false, isNaN=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput138() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math3.linear.OpenMapRealVector", "org.apache.commons.math3.linear.OpenMapRealVector", "checkVectorDimensions", new String[]{"org.apache.commons.math3.linear.RealVector"}, new String[]{"<sample:5>"}, false, 3, new String[][]{{"org.apache.commons.math3.linear.OpenMapRealVector", "getL1Distance", "org.apache.commons.math3.linear.RealVector", "<sample:6>"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput139() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math3.linear.OpenMapRealVector", "org.apache.commons.math3.linear.OpenMapRealVector", "checkVectorDimensions", new String[]{"int"}, new String[]{"-2147483647"}, false, 4, new String[][]{{"org.apache.commons.math3.linear.OpenMapRealVector", "walkInOptimizedOrder", "org.apache.commons.math3.linear.RealVectorChangingVisitor", "<null>"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("org.apache.commons.math3.exception.DimensionMismatchException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput140() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math3.linear.OpenMapRealVector", "org.apache.commons.math3.linear.OpenMapRealVector", "setEntry", new String[]{"int", "double"}, new String[]{"-2147483644", "NaN"}, false, 2, new String[][]{{"org.apache.commons.math3.linear.OpenMapRealVector", "checkIndices", "int,int", "-2", "-20"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("org.apache.commons.math3.exception.OutOfRangeException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput141() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.linear.OpenMapRealVector", "org.apache.commons.math3.linear.OpenMapRealVector", "checkVectorDimensions", new String[]{"org.apache.commons.math3.linear.RealVector"}, new String[]{"<sample:8>"}, false);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getDimension=0, getL1Norm=0.0, getLInfNorm=0.0, getMaxIndex=-1, getMaxValue=NaN, getMinIndex=-1, getMinValue=NaN, getNorm=0.0, getSparsity=NaN, isInfinite=false, isNaN=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput142() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math3.linear.OpenMapRealVector", "org.apache.commons.math3.linear.OpenMapRealVector", "walkInOptimizedOrder", new String[]{"org.apache.commons.math3.linear.RealVectorPreservingVisitor", "int", "int"}, new String[]{"<sample:5>", "2147483647", "-1073741823"}, false); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("org.apache.commons.math3.exception.OutOfRangeException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput143() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math3.linear.OpenMapRealVector", "org.apache.commons.math3.linear.OpenMapRealVector", "dotProduct", new String[]{"org.apache.commons.math3.linear.RealVector"}, new String[]{"<sample:10>"}, false, 7, new String[][]{}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("org.apache.commons.math3.exception.DimensionMismatchException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput144() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.linear.OpenMapRealVector", "org.apache.commons.math3.linear.OpenMapRealVector", "append", new String[]{"org.apache.commons.math3.linear.RealVector"}, new String[]{"<sample:4>"}, false, 0, new String[][]{{"org.apache.commons.math3.linear.OpenMapRealVector", "mapDivide", "double", "NaN"}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.math3.linear.OpenMapRealVector", actual.getClass().getName());
  assertEquals("{getDimension=0, getL1Norm=0.0, getLInfNorm=0.0, getMaxIndex=-1, getMaxValue=NaN, getMinIndex=-1, getMinValue=NaN, getNorm=0.0, getSparsity=NaN, isInfinite=false, isNaN=false}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getDimension=0, getL1Norm=0.0, getLInfNorm=0.0, getMaxIndex=-1, getMaxValue=NaN, getMinIndex=-1, getMinValue=NaN, getNorm=0.0, getSparsity=NaN, isInfinite=false, isNaN=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput145() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.linear.OpenMapRealVector", "org.apache.commons.math3.linear.OpenMapRealVector", "getL1Norm", new String[]{}, new String[]{}, false, 1, new String[][]{{"org.apache.commons.math3.linear.OpenMapRealVector", "getMaxIndex", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("Infinity", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getDimension=3, getL1Norm=Infinity, getLInfNorm=Infinity, getMaxIndex=1, getMaxValue=Infinity, getMinIndex=2, getMinValue=-Infinity, getNorm=Infinity, getSparsity=1.0, isInfinite=true, isNaN=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput146() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math3.linear.OpenMapRealVector", "org.apache.commons.math3.linear.OpenMapRealVector", "subtract", new String[]{"org.apache.commons.math3.linear.OpenMapRealVector"}, new String[]{"<sample:5>"}, false, 1, new String[][]{{"org.apache.commons.math3.linear.OpenMapRealVector", "isDefaultValue", "double", "4.9E-324"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("org.apache.commons.math3.exception.DimensionMismatchException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput147() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.linear.OpenMapRealVector", "org.apache.commons.math3.linear.OpenMapRealVector", "getSparsity", new String[]{}, new String[]{}, false, 6, new String[][]{});
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("0.25", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getDimension=8, getL1Norm=Infinity, getLInfNorm=Infinity, getMaxIndex=0, getMaxValue=Infinity, getMinIndex=1, getMinValue=-Infinity, getNorm=Infinity, getSparsity=0.25, isInfinite=true, isNaN=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput148() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.linear.OpenMapRealVector", "org.apache.commons.math3.linear.OpenMapRealVector", "mapMultiply", new String[]{"double"}, new String[]{"2.5E-13"}, false, 1, new String[][]{{"org.apache.commons.math3.linear.OpenMapRealVector", "mapSubtract", "double", "NaN"}, {"org.apache.commons.math3.linear.OpenMapRealVector", "mapAdd", "double", "7.0000000000005"}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.math3.linear.OpenMapRealVector", actual.getClass().getName());
  assertEquals("{getDimension=3, getL1Norm=Infinity, getLInfNorm=Infinity, getMaxIndex=1, getMaxValue=Infinity, getMinIndex=2, getMinValue=-Infinity, getNorm=Infinity, getSparsity=1.0, isInfinite=true, isNaN=false}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getDimension=3, getL1Norm=Infinity, getLInfNorm=Infinity, getMaxIndex=1, getMaxValue=Infinity, getMinIndex=2, getMinValue=-Infinity, getNorm=Infinity, getSparsity=1.0, isInfinite=true, isNaN=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput149() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.linear.OpenMapRealVector", "org.apache.commons.math3.linear.OpenMapRealVector", "getL1Distance", new String[]{"org.apache.commons.math3.linear.OpenMapRealVector"}, new String[]{"<sample:6>"}, false, 0, new String[][]{{"org.apache.commons.math3.linear.OpenMapRealVector", "mapSubtract", "double", "1.780000000001"}});
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("Infinity", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getDimension=0, getL1Norm=0.0, getLInfNorm=0.0, getMaxIndex=-1, getMaxValue=NaN, getMinIndex=-1, getMinValue=NaN, getNorm=0.0, getSparsity=NaN, isInfinite=false, isNaN=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput150() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math3.linear.OpenMapRealVector", "org.apache.commons.math3.linear.OpenMapRealVector", "outerProduct", new String[]{"org.apache.commons.math3.linear.RealVector"}, new String[]{"<sample:3>"}, false, 7, new String[][]{{"org.apache.commons.math3.linear.OpenMapRealVector", "outerProduct", "org.apache.commons.math3.linear.RealVector", "<sample:4>"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput151() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.linear.OpenMapRealVector", "org.apache.commons.math3.linear.OpenMapRealVector", "mapSubtractToSelf", new String[]{"double"}, new String[]{"0.0"}, false, 3, new String[][]{{"org.apache.commons.math3.linear.OpenMapRealVector", "getSparsity", ""}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.math3.linear.OpenMapRealVector", actual.getClass().getName());
  assertEquals("{getDimension=2, getL1Norm=Infinity, getLInfNorm=Infinity, getMaxIndex=1, getMaxValue=-1.0, getMinIndex=0, getMinValue=-Infinity, getNorm=Infinity, getSparsity=1.0, isInfinite=true, isNaN=false}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getDimension=2, getL1Norm=Infinity, getLInfNorm=Infinity, getMaxIndex=1, getMaxValue=-1.0, getMinIndex=0, getMinValue=-Infinity, getNorm=Infinity, getSparsity=1.0, isInfinite=true, isNaN=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput152() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math3.linear.OpenMapRealVector", "org.apache.commons.math3.linear.OpenMapRealVector", "getEntry", new String[]{"int"}, new String[]{"2147483647"}, false, 3, new String[][]{}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("org.apache.commons.math3.exception.OutOfRangeException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput153() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math3.linear.OpenMapRealVector", "org.apache.commons.math3.linear.OpenMapRealVector", "ebeDivide", new String[]{"org.apache.commons.math3.linear.RealVector"}, new String[]{"<sample:0>"}, false, 3, new String[][]{}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput154() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math3.linear.OpenMapRealVector", "org.apache.commons.math3.linear.OpenMapRealVector", "getDistance", new String[]{"org.apache.commons.math3.linear.RealVector"}, new String[]{"<sample:7>"}, false, 1, new String[][]{{"org.apache.commons.math3.linear.OpenMapRealVector", "mapToSelf", "org.apache.commons.math3.analysis.UnivariateFunction", "<sample:6>"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput155() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math3.linear.OpenMapRealVector", "org.apache.commons.math3.linear.OpenMapRealVector", "checkIndices", new String[]{"int", "int"}, new String[]{"-2147483648", "-131062"}, false, 1, new String[][]{}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("org.apache.commons.math3.exception.OutOfRangeException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput156() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.linear.OpenMapRealVector", "org.apache.commons.math3.linear.OpenMapRealVector", "getDimension", new String[]{}, new String[]{}, false, 3, new String[][]{});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("2", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getDimension=2, getL1Norm=Infinity, getLInfNorm=Infinity, getMaxIndex=1, getMaxValue=-1.0, getMinIndex=0, getMinValue=-Infinity, getNorm=Infinity, getSparsity=1.0, isInfinite=true, isNaN=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput157() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.linear.OpenMapRealVector", "org.apache.commons.math3.linear.OpenMapRealVector", "getL1Distance", new String[]{"org.apache.commons.math3.linear.OpenMapRealVector"}, new String[]{"<sample:9>"}, false, 1, new String[][]{});
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("Infinity", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getDimension=3, getL1Norm=Infinity, getLInfNorm=Infinity, getMaxIndex=1, getMaxValue=Infinity, getMinIndex=2, getMinValue=-Infinity, getNorm=Infinity, getSparsity=1.0, isInfinite=true, isNaN=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput158() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.linear.OpenMapRealVector", "org.apache.commons.math3.linear.OpenMapRealVector", "getDimension", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.math3.linear.OpenMapRealVector", "map", "org.apache.commons.math3.analysis.UnivariateFunction", "<sample:2>"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getDimension=0, getL1Norm=0.0, getLInfNorm=0.0, getMaxIndex=-1, getMaxValue=NaN, getMinIndex=-1, getMinValue=NaN, getNorm=0.0, getSparsity=NaN, isInfinite=false, isNaN=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput159() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math3.linear.OpenMapRealVector", "org.apache.commons.math3.linear.OpenMapRealVector", "combineToSelf", new String[]{"double", "double", "org.apache.commons.math3.linear.RealVector"}, new String[]{"NaN", "-46.999999999999", "<null>"}, false, 6, new String[][]{{"org.apache.commons.math3.linear.OpenMapRealVector", "map", "org.apache.commons.math3.analysis.UnivariateFunction", "<sample:7>"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput160() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.linear.OpenMapRealVector", "org.apache.commons.math3.linear.OpenMapRealVector", "getSparsity", new String[]{}, new String[]{}, false, 4, new String[][]{});
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("0.16666666666666666", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getDimension=12, getL1Norm=Infinity, getLInfNorm=Infinity, getMaxIndex=0, getMaxValue=Infinity, getMinIndex=1, getMinValue=-Infinity, getNorm=Infinity, getSparsity=0.16666666666666666, isInfinite=tru...#215#-1192199922", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput161() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.linear.OpenMapRealVector", "org.apache.commons.math3.linear.OpenMapRealVector", "getDistance", new String[]{"org.apache.commons.math3.linear.OpenMapRealVector"}, new String[]{"<sample:1>"}, false, 1, new String[][]{{"org.apache.commons.math3.linear.OpenMapRealVector", "walkInOptimizedOrder", "org.apache.commons.math3.linear.RealVectorChangingVisitor", "<sample:3>"}});
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("Infinity", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getDimension=3, getL1Norm=3.0, getLInfNorm=1.0, getMaxIndex=2, getMaxValue=1.0, getMinIndex=2, getMinValue=1.0, getNorm=1.7320508075688772, getSparsity=1.0, isInfinite=false, isNaN=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput162() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.linear.OpenMapRealVector", "org.apache.commons.math3.linear.OpenMapRealVector", "append", new String[]{"double"}, new String[]{"4.9E-323"}, false, 6, new String[][]{});
  assertNotNull(actual);
  assertEquals("org.apache.commons.math3.linear.OpenMapRealVector", actual.getClass().getName());
  assertEquals("{getDimension=9, getL1Norm=Infinity, getLInfNorm=Infinity, getMaxIndex=0, getMaxValue=Infinity, getMinIndex=1, getMinValue=-Infinity, getNorm=Infinity, getSparsity=0.2222222222222222, isInfinite=true,...#213#1556450619", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getDimension=8, getL1Norm=Infinity, getLInfNorm=Infinity, getMaxIndex=0, getMaxValue=Infinity, getMinIndex=1, getMinValue=-Infinity, getNorm=Infinity, getSparsity=0.25, isInfinite=true, isNaN=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput163() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.linear.OpenMapRealVector", "org.apache.commons.math3.linear.OpenMapRealVector", "getMinValue", new String[]{}, new String[]{}, false, 4, new String[][]{{"org.apache.commons.math3.linear.OpenMapRealVector", "getSparsity", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("-Infinity", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getDimension=12, getL1Norm=Infinity, getLInfNorm=Infinity, getMaxIndex=0, getMaxValue=Infinity, getMinIndex=1, getMinValue=-Infinity, getNorm=Infinity, getSparsity=0.16666666666666666, isInfinite=tru...#215#-1192199922", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput164() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math3.linear.OpenMapRealVector", "org.apache.commons.math3.linear.OpenMapRealVector", "append", new String[]{"double"}, new String[]{"140.00000000001"}, false, 0, new String[][]{{"org.apache.commons.math3.linear.OpenMapRealVector", "addToEntry", "int,double", "-10", "-3.0199999999990004"}}), new String[][]{{"sparseIterator", "", "3"}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.math3.linear.OpenMapRealVector$OpenMapSparseIterator", actual.getClass().getName());
  assertEquals("{hasNext=true}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getDimension=0, getL1Norm=0.0, getLInfNorm=0.0, getMaxIndex=-1, getMaxValue=NaN, getMinIndex=-1, getMinValue=NaN, getNorm=0.0, getSparsity=NaN, isInfinite=false, isNaN=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput165() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.linear.OpenMapRealVector", "org.apache.commons.math3.linear.OpenMapRealVector", "getMinIndex", new String[]{}, new String[]{}, false, 1, new String[][]{});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("2", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getDimension=3, getL1Norm=Infinity, getLInfNorm=Infinity, getMaxIndex=1, getMaxValue=Infinity, getMinIndex=2, getMinValue=-Infinity, getNorm=Infinity, getSparsity=1.0, isInfinite=true, isNaN=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput166() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.linear.OpenMapRealVector", "org.apache.commons.math3.linear.OpenMapRealVector", "toArray", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.math3.linear.OpenMapRealVector", "ebeDivide", "org.apache.commons.math3.linear.RealVector", "<sample:2>"}, {"org.apache.commons.math3.linear.OpenMapRealVector", "isNaN", ""}});
  assertNotNull(actual);
  assertEquals("[D", actual.getClass().getName());
  assertEquals("[]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getDimension=0, getL1Norm=0.0, getLInfNorm=0.0, getMaxIndex=-1, getMaxValue=NaN, getMinIndex=-1, getMinValue=NaN, getNorm=0.0, getSparsity=NaN, isInfinite=false, isNaN=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput167() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math3.linear.OpenMapRealVector", "org.apache.commons.math3.linear.OpenMapRealVector", "ebeDivide", new String[]{"org.apache.commons.math3.linear.RealVector"}, new String[]{"<sample:4>"}, false, 3, new String[][]{{"org.apache.commons.math3.linear.OpenMapRealVector", "dotProduct", "org.apache.commons.math3.linear.OpenMapRealVector", "<sample:7>"}, {"org.apache.commons.math3.linear.OpenMapRealVector", "append", "org.apache.commons.math3.linear.RealVector", "<sample:7>"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("org.apache.commons.math3.exception.DimensionMismatchException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput168() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.linear.OpenMapRealVector", "org.apache.commons.math3.linear.OpenMapRealVector", "isInfinite", new String[]{}, new String[]{}, false, 1, new String[][]{});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getDimension=3, getL1Norm=Infinity, getLInfNorm=Infinity, getMaxIndex=1, getMaxValue=Infinity, getMinIndex=2, getMinValue=-Infinity, getNorm=Infinity, getSparsity=1.0, isInfinite=true, isNaN=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput169() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.linear.OpenMapRealVector", "org.apache.commons.math3.linear.OpenMapRealVector", "getDimension", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.math3.linear.OpenMapRealVector", "getDistance", "org.apache.commons.math3.linear.OpenMapRealVector", "<sample:7>"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getDimension=0, getL1Norm=0.0, getLInfNorm=0.0, getMaxIndex=-1, getMaxValue=NaN, getMinIndex=-1, getMinValue=NaN, getNorm=0.0, getSparsity=NaN, isInfinite=false, isNaN=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput170() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.linear.OpenMapRealVector", "org.apache.commons.math3.linear.OpenMapRealVector", "set", new String[]{"double"}, new String[]{"-48.999999999999005"}, false, 1, new String[][]{{"org.apache.commons.math3.linear.OpenMapRealVector", "mapSubtractToSelf", "double", "-8.7722226955807068E18"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getDimension=3, getL1Norm=146.99999999999702, getLInfNorm=48.999999999999005, getMaxIndex=2, getMaxValue=-48.999999999999005, getMinIndex=2, getMinValue=-48.999999999999005, getNorm=84.87048957087326...#249#-982281465", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput171() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math3.linear.OpenMapRealVector", "org.apache.commons.math3.linear.OpenMapRealVector", "mapMultiplyToSelf", new String[]{"double"}, new String[]{"1.7800000000010001"}, false, 0, new String[][]{{"org.apache.commons.math3.linear.OpenMapRealVector", "getMinIndex", ""}}), new String[][]{{"combine", "double,double,org.apache.commons.math3.linear.RealVector", "5"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput172() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math3.linear.OpenMapRealVector", "org.apache.commons.math3.linear.OpenMapRealVector", "mapToSelf", new String[]{"org.apache.commons.math3.analysis.UnivariateFunction"}, new String[]{"<null>"}, false); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput173() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math3.linear.OpenMapRealVector", "org.apache.commons.math3.linear.OpenMapRealVector", "append", new String[]{"org.apache.commons.math3.linear.OpenMapRealVector"}, new String[]{"<sample:6>"}, false, 1, new String[][]{{"org.apache.commons.math3.linear.OpenMapRealVector", "combineToSelf", "double,double,org.apache.commons.math3.linear.RealVector", "2.4999999999999994E-13", "-1.0", "<sample:6>"}, {"org.apache.commons.math3.linear.OpenMapRealVector", "addToEntry", "int,double", "-2147483648", "-1.0000000000000002E-12"}}), new String[][]{{"mapAdd", "double", "4"}, {"getDistance", "org.apache.commons.math3.linear.OpenMapRealVector", "3"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("org.apache.commons.math3.exception.OutOfRangeException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput174() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math3.linear.OpenMapRealVector", "org.apache.commons.math3.linear.OpenMapRealVector", "combine", new String[]{"double", "double", "org.apache.commons.math3.linear.RealVector"}, new String[]{"-0.0319999999995", "1.7800000000009997", "<sample:3>"}, false); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput175() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.linear.OpenMapRealVector", "org.apache.commons.math3.linear.OpenMapRealVector", "copy", new String[]{}, new String[]{}, false, 3, new String[][]{});
  assertNotNull(actual);
  assertEquals("org.apache.commons.math3.linear.OpenMapRealVector", actual.getClass().getName());
  assertEquals("{getDimension=2, getL1Norm=Infinity, getLInfNorm=Infinity, getMaxIndex=1, getMaxValue=-1.0, getMinIndex=0, getMinValue=-Infinity, getNorm=Infinity, getSparsity=1.0, isInfinite=true, isNaN=false}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getDimension=2, getL1Norm=Infinity, getLInfNorm=Infinity, getMaxIndex=1, getMaxValue=-1.0, getMinIndex=0, getMinValue=-Infinity, getNorm=Infinity, getSparsity=1.0, isInfinite=true, isNaN=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput176() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math3.linear.OpenMapRealVector", "org.apache.commons.math3.linear.OpenMapRealVector", "getDistance", new String[]{"org.apache.commons.math3.linear.RealVector"}, new String[]{"<sample:6>"}, false, 6, new String[][]{}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("org.apache.commons.math3.exception.DimensionMismatchException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput177() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math3.linear.OpenMapRealVector", "org.apache.commons.math3.linear.OpenMapRealVector", "setSubVector", new String[]{"int", "org.apache.commons.math3.linear.RealVector"}, new String[]{"1", "<null>"}, false, 0, new String[][]{{"org.apache.commons.math3.linear.OpenMapRealVector", "subtract", "org.apache.commons.math3.linear.RealVector", "<sample:4>"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("org.apache.commons.math3.exception.OutOfRangeException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput178() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math3.linear.OpenMapRealVector", "org.apache.commons.math3.linear.OpenMapRealVector", "dotProduct", new String[]{"org.apache.commons.math3.linear.OpenMapRealVector"}, new String[]{"<sample:8>"}, false, 1, new String[][]{{"org.apache.commons.math3.linear.OpenMapRealVector", "getEntry", "int", "40"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("org.apache.commons.math3.exception.DimensionMismatchException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput179() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.linear.OpenMapRealVector", "org.apache.commons.math3.linear.OpenMapRealVector", "walkInOptimizedOrder", new String[]{"org.apache.commons.math3.linear.RealVectorPreservingVisitor"}, new String[]{"<sample:7>"}, false, 3, new String[][]{{"org.apache.commons.math3.linear.OpenMapRealVector", "getMinIndex", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("0.0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getDimension=2, getL1Norm=Infinity, getLInfNorm=Infinity, getMaxIndex=1, getMaxValue=-1.0, getMinIndex=0, getMinValue=-Infinity, getNorm=Infinity, getSparsity=1.0, isInfinite=true, isNaN=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput180() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math3.linear.OpenMapRealVector", "org.apache.commons.math3.linear.OpenMapRealVector", "add", new String[]{"org.apache.commons.math3.linear.OpenMapRealVector"}, new String[]{"<sample:8>"}, false, 0, new String[][]{{"org.apache.commons.math3.linear.OpenMapRealVector", "outerProduct", "org.apache.commons.math3.linear.RealVector", "<sample:3>"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("org.apache.commons.math3.exception.DimensionMismatchException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput181() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math3.linear.OpenMapRealVector", "org.apache.commons.math3.linear.OpenMapRealVector", "append", new String[]{"org.apache.commons.math3.linear.OpenMapRealVector"}, new String[]{"<sample:3>"}, false, 0, new String[][]{{"org.apache.commons.math3.linear.OpenMapRealVector", "add", "org.apache.commons.math3.linear.OpenMapRealVector", "<sample:0>"}}), new String[][]{{"append", "org.apache.commons.math3.linear.OpenMapRealVector", "2"}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.math3.linear.OpenMapRealVector", actual.getClass().getName());
  assertEquals("{getDimension=3, getL1Norm=Infinity, getLInfNorm=Infinity, getMaxIndex=2, getMaxValue=0.0, getMinIndex=0, getMinValue=-Infinity, getNorm=Infinity, getSparsity=0.6666666666666666, isInfinite=true, isNa...#208#-1906858044", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getDimension=0, getL1Norm=0.0, getLInfNorm=0.0, getMaxIndex=-1, getMaxValue=NaN, getMinIndex=-1, getMinValue=NaN, getNorm=0.0, getSparsity=NaN, isInfinite=false, isNaN=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput182() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.linear.OpenMapRealVector", "org.apache.commons.math3.linear.OpenMapRealVector", "getDistance", new String[]{"org.apache.commons.math3.linear.OpenMapRealVector"}, new String[]{"<sample:3>"}, false, 7, new String[][]{});
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("Infinity", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getDimension=3, getL1Norm=Infinity, getLInfNorm=Infinity, getMaxIndex=0, getMaxValue=Infinity, getMinIndex=1, getMinValue=-Infinity, getNorm=Infinity, getSparsity=0.6666666666666666, isInfinite=true,...#213#242791861", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput183() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.linear.OpenMapRealVector", "org.apache.commons.math3.linear.OpenMapRealVector", "getMaxValue", new String[]{}, new String[]{}, false, 5, new String[][]{});
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("NaN", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getDimension=0, getL1Norm=0.0, getLInfNorm=0.0, getMaxIndex=-1, getMaxValue=NaN, getMinIndex=-1, getMinValue=NaN, getNorm=0.0, getSparsity=NaN, isInfinite=false, isNaN=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput184() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math3.linear.OpenMapRealVector", "org.apache.commons.math3.linear.OpenMapRealVector", "copy", new String[]{}, new String[]{}, false, 7, new String[][]{{"org.apache.commons.math3.linear.OpenMapRealVector", "mapDivideToSelf", "double", "-0.00300000001"}}), new String[][]{{"dotProduct", "org.apache.commons.math3.linear.RealVector", "2"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput185() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.linear.OpenMapRealVector", "org.apache.commons.math3.linear.OpenMapRealVector", "getDistance", new String[]{"org.apache.commons.math3.linear.OpenMapRealVector"}, new String[]{"<sample:12>"}, false, 0, new String[][]{{"org.apache.commons.math3.linear.OpenMapRealVector", "checkIndex", "int", "-2097153"}});
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("0.0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getDimension=0, getL1Norm=0.0, getLInfNorm=0.0, getMaxIndex=-1, getMaxValue=NaN, getMinIndex=-1, getMinValue=NaN, getNorm=0.0, getSparsity=NaN, isInfinite=false, isNaN=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput186() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.linear.OpenMapRealVector", "org.apache.commons.math3.linear.OpenMapRealVector", "getMinIndex", new String[]{}, new String[]{}, false, 1, new String[][]{{"org.apache.commons.math3.linear.OpenMapRealVector", "mapDivideToSelf", "double", "-19.219999999999"}, {"org.apache.commons.math3.linear.OpenMapRealVector", "getDistance", "org.apache.commons.math3.linear.RealVector", "<sample:3>"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("1", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getDimension=3, getL1Norm=Infinity, getLInfNorm=Infinity, getMaxIndex=2, getMaxValue=Infinity, getMinIndex=1, getMinValue=-Infinity, getNorm=Infinity, getSparsity=1.0, isInfinite=true, isNaN=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput187() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.linear.OpenMapRealVector", "org.apache.commons.math3.linear.OpenMapRealVector", "isDefaultValue", new String[]{"double"}, new String[]{"0.069999999999"}, false, 3, new String[][]{{"org.apache.commons.math3.linear.OpenMapRealVector", "checkIndices", "int,int", "0", "-2147483648"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getDimension=2, getL1Norm=Infinity, getLInfNorm=Infinity, getMaxIndex=1, getMaxValue=-1.0, getMinIndex=0, getMinValue=-Infinity, getNorm=Infinity, getSparsity=1.0, isInfinite=true, isNaN=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput188() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.linear.OpenMapRealVector", "org.apache.commons.math3.linear.OpenMapRealVector", "getL1Distance", new String[]{"org.apache.commons.math3.linear.OpenMapRealVector"}, new String[]{"<sample:4>"}, false, 3, new String[][]{{"org.apache.commons.math3.linear.OpenMapRealVector", "walkInDefaultOrder", "org.apache.commons.math3.linear.RealVectorChangingVisitor,int,int", "<sample:3>", "-64", "16383"}, {"org.apache.commons.math3.linear.OpenMapRealVector", "copy", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("Infinity", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getDimension=2, getL1Norm=Infinity, getLInfNorm=Infinity, getMaxIndex=1, getMaxValue=-1.0, getMinIndex=0, getMinValue=-Infinity, getNorm=Infinity, getSparsity=1.0, isInfinite=true, isNaN=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput189() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.linear.OpenMapRealVector", "org.apache.commons.math3.linear.OpenMapRealVector", "isDefaultValue", new String[]{"double"}, new String[]{"-1.0000000000000004E-13"}, false);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getDimension=0, getL1Norm=0.0, getLInfNorm=0.0, getMaxIndex=-1, getMaxValue=NaN, getMinIndex=-1, getMinValue=NaN, getNorm=0.0, getSparsity=NaN, isInfinite=false, isNaN=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput190() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math3.linear.OpenMapRealVector", "org.apache.commons.math3.linear.OpenMapRealVector", "append", new String[]{"double"}, new String[]{"-4.0"}, false, 0, new String[][]{{"org.apache.commons.math3.linear.OpenMapRealVector", "getDimension", ""}}), new String[][]{{"addToEntry", "int,double", "4"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("org.apache.commons.math3.exception.OutOfRangeException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput191() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.linear.OpenMapRealVector", "org.apache.commons.math3.linear.OpenMapRealVector", "map", new String[]{"org.apache.commons.math3.analysis.UnivariateFunction"}, new String[]{"<sample:3>"}, false, 6, new String[][]{{"org.apache.commons.math3.linear.OpenMapRealVector", "checkVectorDimensions", "org.apache.commons.math3.linear.RealVector", "<sample:6>"}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.math3.linear.OpenMapRealVector", actual.getClass().getName());
  assertEquals("{getDimension=8, getL1Norm=0.0, getLInfNorm=0.0, getMaxIndex=7, getMaxValue=0.0, getMinIndex=7, getMinValue=0.0, getNorm=0.0, getSparsity=0.0, isInfinite=false, isNaN=false}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getDimension=8, getL1Norm=Infinity, getLInfNorm=Infinity, getMaxIndex=0, getMaxValue=Infinity, getMinIndex=1, getMinValue=-Infinity, getNorm=Infinity, getSparsity=0.25, isInfinite=true, isNaN=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput192() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math3.linear.OpenMapRealVector", "org.apache.commons.math3.linear.OpenMapRealVector", "mapMultiplyToSelf", new String[]{"double"}, new String[]{"-14.000000000001"}, false, 0, new String[][]{{"org.apache.commons.math3.linear.OpenMapRealVector", "checkIndex", "int", "2147483647"}}), new String[][]{{"append", "org.apache.commons.math3.linear.OpenMapRealVector", "1"}, {"iterator", "", "4"}});
  assertNotNull(actual);
  assertEquals("receiver state after the call", "{getDimension=0, getL1Norm=0.0, getLInfNorm=0.0, getMaxIndex=-1, getMaxValue=NaN, getMinIndex=-1, getMinValue=NaN, getNorm=0.0, getSparsity=NaN, isInfinite=false, isNaN=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput193() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.linear.OpenMapRealVector", "org.apache.commons.math3.linear.OpenMapRealVector", "append", new String[]{"org.apache.commons.math3.linear.OpenMapRealVector"}, new String[]{"<sample:8>"}, false, 2, new String[][]{{"org.apache.commons.math3.linear.OpenMapRealVector", "add", "org.apache.commons.math3.linear.OpenMapRealVector", "<null>"}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.math3.linear.OpenMapRealVector", actual.getClass().getName());
  assertEquals("{getDimension=7, getL1Norm=0.0, getLInfNorm=0.0, getMaxIndex=6, getMaxValue=0.0, getMinIndex=6, getMinValue=0.0, getNorm=0.0, getSparsity=0.0, isInfinite=false, isNaN=false}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getDimension=1, getL1Norm=0.0, getLInfNorm=0.0, getMaxIndex=0, getMaxValue=0.0, getMinIndex=0, getMinValue=0.0, getNorm=0.0, getSparsity=0.0, isInfinite=false, isNaN=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput194() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math3.linear.OpenMapRealVector", "org.apache.commons.math3.linear.OpenMapRealVector", "mapDivideToSelf", new String[]{"double"}, new String[]{"2.0"}, false, 3, new String[][]{{"org.apache.commons.math3.linear.OpenMapRealVector", "combine", "double,double,org.apache.commons.math3.linear.RealVector", "1.0000000000000002E-12", "1.480000000002", "<sample:2>"}, {"org.apache.commons.math3.linear.OpenMapRealVector", "addToEntry", "int,double", "2147483647", "1.0"}}), new String[][]{{"set", "double", "3"}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.math3.linear.OpenMapRealVector", actual.getClass().getName());
  assertEquals("{getDimension=2, getL1Norm=2.0, getLInfNorm=1.0, getMaxIndex=1, getMaxValue=1.0, getMinIndex=1, getMinValue=1.0, getNorm=1.4142135623730951, getSparsity=1.0, isInfinite=false, isNaN=false}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getDimension=2, getL1Norm=2.0, getLInfNorm=1.0, getMaxIndex=1, getMaxValue=1.0, getMinIndex=1, getMinValue=1.0, getNorm=1.4142135623730951, getSparsity=1.0, isInfinite=false, isNaN=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput195() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.linear.OpenMapRealVector", "org.apache.commons.math3.linear.OpenMapRealVector", "walkInOptimizedOrder", new String[]{"org.apache.commons.math3.linear.RealVectorPreservingVisitor"}, new String[]{"<sample:3>"}, false, 6, new String[][]{{"org.apache.commons.math3.linear.OpenMapRealVector", "mapSubtract", "double", "1.0E-323"}});
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("1.0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getDimension=8, getL1Norm=Infinity, getLInfNorm=Infinity, getMaxIndex=0, getMaxValue=Infinity, getMinIndex=1, getMinValue=-Infinity, getNorm=Infinity, getSparsity=0.25, isInfinite=true, isNaN=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput196() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.linear.OpenMapRealVector", "org.apache.commons.math3.linear.OpenMapRealVector", "add", new String[]{"org.apache.commons.math3.linear.RealVector"}, new String[]{"<sample:6>"}, false, 5, new String[][]{});
  assertNotNull(actual);
  assertEquals("org.apache.commons.math3.linear.ArrayRealVector", actual.getClass().getName());
  assertEquals("{} {getDataRef=[], getDimension=0, getL1Norm=0.0, getLInfNorm=0.0, getMaxIndex=-1, getMaxValue=NaN, getMinIndex=-1, getMinValue=NaN, getNorm=0.0, isInfinite=false, isNaN=false}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getDimension=0, getL1Norm=0.0, getLInfNorm=0.0, getMaxIndex=-1, getMaxValue=NaN, getMinIndex=-1, getMinValue=NaN, getNorm=0.0, getSparsity=NaN, isInfinite=false, isNaN=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput197() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.linear.OpenMapRealVector", "org.apache.commons.math3.linear.OpenMapRealVector", "walkInOptimizedOrder", new String[]{"org.apache.commons.math3.linear.RealVectorPreservingVisitor"}, new String[]{"<sample:8>"}, false);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("1.0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getDimension=0, getL1Norm=0.0, getLInfNorm=0.0, getMaxIndex=-1, getMaxValue=NaN, getMinIndex=-1, getMinValue=NaN, getNorm=0.0, getSparsity=NaN, isInfinite=false, isNaN=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput198() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math3.linear.OpenMapRealVector", "org.apache.commons.math3.linear.OpenMapRealVector", "copy", new String[]{}, new String[]{}, false, 1, new String[][]{}), new String[][]{{"outerProduct", "org.apache.commons.math3.linear.RealVector", "6"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("org.apache.commons.math3.exception.NotStrictlyPositiveException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput199() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.linear.OpenMapRealVector", "org.apache.commons.math3.linear.OpenMapRealVector", "append", new String[]{"double"}, new String[]{"-0.0"}, false);
  assertNotNull(actual);
  assertEquals("org.apache.commons.math3.linear.OpenMapRealVector", actual.getClass().getName());
  assertEquals("{getDimension=1, getL1Norm=0.0, getLInfNorm=0.0, getMaxIndex=0, getMaxValue=0.0, getMinIndex=0, getMinValue=0.0, getNorm=0.0, getSparsity=0.0, isInfinite=false, isNaN=false}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getDimension=0, getL1Norm=0.0, getLInfNorm=0.0, getMaxIndex=-1, getMaxValue=NaN, getMinIndex=-1, getMinValue=NaN, getNorm=0.0, getSparsity=NaN, isInfinite=false, isNaN=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput200() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.linear.OpenMapRealVector", "org.apache.commons.math3.linear.OpenMapRealVector", "getL1Norm", new String[]{}, new String[]{}, false, 3, new String[][]{{"org.apache.commons.math3.linear.OpenMapRealVector", "addToEntry", "int,double", "0", "-5.099999999999"}});
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("Infinity", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getDimension=2, getL1Norm=Infinity, getLInfNorm=Infinity, getMaxIndex=1, getMaxValue=-1.0, getMinIndex=0, getMinValue=-Infinity, getNorm=Infinity, getSparsity=1.0, isInfinite=true, isNaN=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput201() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math3.linear.OpenMapRealVector", "org.apache.commons.math3.linear.OpenMapRealVector", "copy", new String[]{}, new String[]{}, false, 4, new String[][]{{"org.apache.commons.math3.linear.OpenMapRealVector", "getNorm", ""}}), new String[][]{{"iterator", "", "7"}, {"remove", "", "6"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("org.apache.commons.math3.exception.MathUnsupportedOperationException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput202() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.linear.OpenMapRealVector", "org.apache.commons.math3.linear.OpenMapRealVector", "add", new String[]{"org.apache.commons.math3.linear.OpenMapRealVector"}, new String[]{"<sample:5>"}, false, 0, new String[][]{{"org.apache.commons.math3.linear.OpenMapRealVector", "combineToSelf", "double,double,org.apache.commons.math3.linear.RealVector", "1.014", "2.4999999999999994E-14", "<sample:9>"}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.math3.linear.OpenMapRealVector", actual.getClass().getName());
  assertEquals("{getDimension=0, getL1Norm=0.0, getLInfNorm=0.0, getMaxIndex=-1, getMaxValue=NaN, getMinIndex=-1, getMinValue=NaN, getNorm=0.0, getSparsity=NaN, isInfinite=false, isNaN=false}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getDimension=0, getL1Norm=0.0, getLInfNorm=0.0, getMaxIndex=-1, getMaxValue=NaN, getMinIndex=-1, getMinValue=NaN, getNorm=0.0, getSparsity=NaN, isInfinite=false, isNaN=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput203() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.linear.OpenMapRealVector", "org.apache.commons.math3.linear.OpenMapRealVector", "subtract", new String[]{"org.apache.commons.math3.linear.RealVector"}, new String[]{"<sample:6>"}, false, 0, new String[][]{{"org.apache.commons.math3.linear.OpenMapRealVector", "getMinIndex", ""}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.math3.linear.ArrayRealVector", actual.getClass().getName());
  assertEquals("{} {getDataRef=[], getDimension=0, getL1Norm=0.0, getLInfNorm=0.0, getMaxIndex=-1, getMaxValue=NaN, getMinIndex=-1, getMinValue=NaN, getNorm=0.0, isInfinite=false, isNaN=false}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getDimension=0, getL1Norm=0.0, getLInfNorm=0.0, getMaxIndex=-1, getMaxValue=NaN, getMinIndex=-1, getMinValue=NaN, getNorm=0.0, getSparsity=NaN, isInfinite=false, isNaN=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput204() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.linear.OpenMapRealVector", "org.apache.commons.math3.linear.OpenMapRealVector", "getLInfNorm", new String[]{}, new String[]{}, false, 1, new String[][]{});
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("Infinity", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getDimension=3, getL1Norm=Infinity, getLInfNorm=Infinity, getMaxIndex=1, getMaxValue=Infinity, getMinIndex=2, getMinValue=-Infinity, getNorm=Infinity, getSparsity=1.0, isInfinite=true, isNaN=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput205() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.linear.OpenMapRealVector", "org.apache.commons.math3.linear.OpenMapRealVector", "walkInOptimizedOrder", new String[]{"org.apache.commons.math3.linear.RealVectorChangingVisitor"}, new String[]{"<sample:5>"}, false);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("-Infinity", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getDimension=0, getL1Norm=0.0, getLInfNorm=0.0, getMaxIndex=-1, getMaxValue=NaN, getMinIndex=-1, getMinValue=NaN, getNorm=0.0, getSparsity=NaN, isInfinite=false, isNaN=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput206() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math3.linear.OpenMapRealVector", "org.apache.commons.math3.linear.OpenMapRealVector", "ebeMultiply", new String[]{"org.apache.commons.math3.linear.RealVector"}, new String[]{"<sample:4>"}, false, 0, new String[][]{{"org.apache.commons.math3.linear.OpenMapRealVector", "getMinValue", ""}}), new String[][]{{"addToEntry", "int,double", "5"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("org.apache.commons.math3.exception.OutOfRangeException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput207() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math3.linear.OpenMapRealVector", "org.apache.commons.math3.linear.OpenMapRealVector", "combine", new String[]{"double", "double", "org.apache.commons.math3.linear.RealVector"}, new String[]{"-4.9E-323", "Infinity", "<sample:4>"}, false, 3, new String[][]{}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("org.apache.commons.math3.exception.DimensionMismatchException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput208() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.linear.OpenMapRealVector", "org.apache.commons.math3.linear.OpenMapRealVector", "getMaxIndex", new String[]{}, new String[]{}, false, 3, new String[][]{});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("1", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getDimension=2, getL1Norm=Infinity, getLInfNorm=Infinity, getMaxIndex=1, getMaxValue=-1.0, getMinIndex=0, getMinValue=-Infinity, getNorm=Infinity, getSparsity=1.0, isInfinite=true, isNaN=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput209() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math3.linear.OpenMapRealVector", "org.apache.commons.math3.linear.OpenMapRealVector", "walkInOptimizedOrder", new String[]{"org.apache.commons.math3.linear.RealVectorChangingVisitor", "int", "int"}, new String[]{"<null>", "-2147483647", "-10"}, false, 0, new String[][]{{"org.apache.commons.math3.linear.OpenMapRealVector", "getMinIndex", ""}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("org.apache.commons.math3.exception.OutOfRangeException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput210() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.linear.OpenMapRealVector", "org.apache.commons.math3.linear.OpenMapRealVector", "copy", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.math3.linear.OpenMapRealVector", "walkInOptimizedOrder", "org.apache.commons.math3.linear.RealVectorChangingVisitor", "<sample:4>"}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.math3.linear.OpenMapRealVector", actual.getClass().getName());
  assertEquals("{getDimension=0, getL1Norm=0.0, getLInfNorm=0.0, getMaxIndex=-1, getMaxValue=NaN, getMinIndex=-1, getMinValue=NaN, getNorm=0.0, getSparsity=NaN, isInfinite=false, isNaN=false}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getDimension=0, getL1Norm=0.0, getLInfNorm=0.0, getMaxIndex=-1, getMaxValue=NaN, getMinIndex=-1, getMinValue=NaN, getNorm=0.0, getSparsity=NaN, isInfinite=false, isNaN=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput211() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.linear.OpenMapRealVector", "org.apache.commons.math3.linear.OpenMapRealVector", "append", new String[]{"double"}, new String[]{"2.5E-323"}, false, 0, new String[][]{{"org.apache.commons.math3.linear.OpenMapRealVector", "hashCode", ""}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.math3.linear.OpenMapRealVector", actual.getClass().getName());
  assertEquals("{getDimension=1, getL1Norm=0.0, getLInfNorm=0.0, getMaxIndex=0, getMaxValue=0.0, getMinIndex=0, getMinValue=0.0, getNorm=0.0, getSparsity=0.0, isInfinite=false, isNaN=false}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getDimension=0, getL1Norm=0.0, getLInfNorm=0.0, getMaxIndex=-1, getMaxValue=NaN, getMinIndex=-1, getMinValue=NaN, getNorm=0.0, getSparsity=NaN, isInfinite=false, isNaN=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput212() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math3.linear.OpenMapRealVector", "org.apache.commons.math3.linear.OpenMapRealVector", "getLInfDistance", new String[]{"org.apache.commons.math3.linear.RealVector"}, new String[]{"<sample:7>"}, false); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput213() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math3.linear.OpenMapRealVector", "org.apache.commons.math3.linear.OpenMapRealVector", "append", new String[]{"org.apache.commons.math3.linear.RealVector"}, new String[]{"<sample:8>"}, false, 0, new String[][]{{"org.apache.commons.math3.linear.OpenMapRealVector", "walkInDefaultOrder", "org.apache.commons.math3.linear.RealVectorPreservingVisitor,int,int", "<sample:4>", "2147483647", "2147483646"}}), new String[][]{{"walkInDefaultOrder", "org.apache.commons.math3.linear.RealVectorPreservingVisitor,int,int", "0"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("org.apache.commons.math3.exception.OutOfRangeException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput214() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math3.linear.OpenMapRealVector", "org.apache.commons.math3.linear.OpenMapRealVector", "append", new String[]{"org.apache.commons.math3.linear.OpenMapRealVector"}, new String[]{"<sample:1>"}, false, 3, new String[][]{}), new String[][]{{"add", "org.apache.commons.math3.linear.RealVector", "6"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("org.apache.commons.math3.exception.DimensionMismatchException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput215() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math3.linear.OpenMapRealVector", "org.apache.commons.math3.linear.OpenMapRealVector", "mapDivideToSelf", new String[]{"double"}, new String[]{"-1.7976931348623157E308"}, false, 3, new String[][]{{"org.apache.commons.math3.linear.OpenMapRealVector", "combineToSelf", "double,double,org.apache.commons.math3.linear.RealVector", "Infinity", "-2.0000000000000004E-12", "<sample:12>"}, {"org.apache.commons.math3.linear.OpenMapRealVector", "combine", "double,double,org.apache.commons.math3.linear.RealVector", "-56.9999999999995", "0.0", "<sample:7>"}}), new String[][]{{"isNaN", "", "5"}, {"mapSubtract", "double", "2"}, {"ebeMultiply", "org.apache.commons.math3.linear.RealVector", "7"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput216() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math3.linear.OpenMapRealVector", "org.apache.commons.math3.linear.OpenMapRealVector", "checkIndex", new String[]{"int"}, new String[]{"-67108863"}, false, 1, new String[][]{{"org.apache.commons.math3.linear.OpenMapRealVector", "add", "org.apache.commons.math3.linear.OpenMapRealVector", "<sample:7>"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("org.apache.commons.math3.exception.OutOfRangeException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput217() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.linear.OpenMapRealVector", "org.apache.commons.math3.linear.OpenMapRealVector", "getMinValue", new String[]{}, new String[]{}, false, 3, new String[][]{{"org.apache.commons.math3.linear.OpenMapRealVector", "subtract", "org.apache.commons.math3.linear.RealVector", "<sample:9>"}});
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("-Infinity", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getDimension=2, getL1Norm=Infinity, getLInfNorm=Infinity, getMaxIndex=1, getMaxValue=-1.0, getMinIndex=0, getMinValue=-Infinity, getNorm=Infinity, getSparsity=1.0, isInfinite=true, isNaN=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput218() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math3.linear.OpenMapRealVector", "org.apache.commons.math3.linear.OpenMapRealVector", "cosine", new String[]{"org.apache.commons.math3.linear.RealVector"}, new String[]{"<sample:8>"}, false, 1, new String[][]{{"org.apache.commons.math3.linear.OpenMapRealVector", "getDistance", "org.apache.commons.math3.linear.OpenMapRealVector", "<sample:3>"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("org.apache.commons.math3.exception.MathArithmeticException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput219() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.linear.OpenMapRealVector", "org.apache.commons.math3.linear.OpenMapRealVector", "dotProduct", new String[]{"org.apache.commons.math3.linear.RealVector"}, new String[]{"<sample:4>"}, false, 0, new String[][]{{"org.apache.commons.math3.linear.OpenMapRealVector", "isDefaultValue", "double", "-6.7"}, {"org.apache.commons.math3.linear.OpenMapRealVector", "walkInOptimizedOrder", "org.apache.commons.math3.linear.RealVectorChangingVisitor", "<sample:1>"}});
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("0.0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getDimension=0, getL1Norm=0.0, getLInfNorm=0.0, getMaxIndex=-1, getMaxValue=NaN, getMinIndex=-1, getMinValue=NaN, getNorm=0.0, getSparsity=NaN, isInfinite=false, isNaN=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput220() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.linear.OpenMapRealVector", "org.apache.commons.math3.linear.OpenMapRealVector", "getL1Distance", new String[]{"org.apache.commons.math3.linear.OpenMapRealVector"}, new String[]{"<sample:5>"}, false);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("0.0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getDimension=0, getL1Norm=0.0, getLInfNorm=0.0, getMaxIndex=-1, getMaxValue=NaN, getMinIndex=-1, getMinValue=NaN, getNorm=0.0, getSparsity=NaN, isInfinite=false, isNaN=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput221() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.linear.OpenMapRealVector", "org.apache.commons.math3.linear.OpenMapRealVector", "combine", new String[]{"double", "double", "org.apache.commons.math3.linear.RealVector"}, new String[]{"0.0", "0.23000000000100002", "<sample:8>"}, false, 0, new String[][]{{"org.apache.commons.math3.linear.OpenMapRealVector", "walkInDefaultOrder", "org.apache.commons.math3.linear.RealVectorPreservingVisitor,int,int", "<sample:6>", "-1073741823", "1"}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.math3.linear.OpenMapRealVector", actual.getClass().getName());
  assertEquals("{getDimension=0, getL1Norm=0.0, getLInfNorm=0.0, getMaxIndex=-1, getMaxValue=NaN, getMinIndex=-1, getMinValue=NaN, getNorm=0.0, getSparsity=NaN, isInfinite=false, isNaN=false}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getDimension=0, getL1Norm=0.0, getLInfNorm=0.0, getMaxIndex=-1, getMaxValue=NaN, getMinIndex=-1, getMinValue=NaN, getNorm=0.0, getSparsity=NaN, isInfinite=false, isNaN=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput222() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math3.linear.OpenMapRealVector", "org.apache.commons.math3.linear.OpenMapRealVector", "ebeMultiply", new String[]{"org.apache.commons.math3.linear.RealVector"}, new String[]{"<sample:11>"}, false, 5, new String[][]{{"org.apache.commons.math3.linear.OpenMapRealVector", "setSubVector", "int,org.apache.commons.math3.linear.RealVector", "2147483647", "<sample:4>"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput223() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math3.linear.OpenMapRealVector", "org.apache.commons.math3.linear.OpenMapRealVector", "mapToSelf", new String[]{"org.apache.commons.math3.analysis.UnivariateFunction"}, new String[]{"<sample:4>"}, false, 0, new String[][]{{"org.apache.commons.math3.linear.OpenMapRealVector", "outerProduct", "org.apache.commons.math3.linear.RealVector", "<sample:1>"}}), new String[][]{{"getLInfNorm", "", "2"}});
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("0.0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getDimension=0, getL1Norm=0.0, getLInfNorm=0.0, getMaxIndex=-1, getMaxValue=NaN, getMinIndex=-1, getMinValue=NaN, getNorm=0.0, getSparsity=NaN, isInfinite=false, isNaN=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput224() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.linear.OpenMapRealVector", "org.apache.commons.math3.linear.OpenMapRealVector", "iterator", new String[]{}, new String[]{}, false, 7, new String[][]{{"org.apache.commons.math3.linear.OpenMapRealVector", "add", "org.apache.commons.math3.linear.OpenMapRealVector", "<sample:8>"}});
  assertNotNull(actual);
  assertEquals("receiver state after the call", "{getDimension=3, getL1Norm=Infinity, getLInfNorm=Infinity, getMaxIndex=0, getMaxValue=Infinity, getMinIndex=1, getMinValue=-Infinity, getNorm=Infinity, getSparsity=0.6666666666666666, isInfinite=true,...#213#242791861", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput225() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.linear.OpenMapRealVector", "org.apache.commons.math3.linear.OpenMapRealVector", "mapAddToSelf", new String[]{"double"}, new String[]{"8.7722226955807066E17"}, false, 3, new String[][]{{"org.apache.commons.math3.linear.OpenMapRealVector", "getDimension", ""}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.math3.linear.OpenMapRealVector", actual.getClass().getName());
  assertEquals("{getDimension=2, getL1Norm=Infinity, getLInfNorm=Infinity, getMaxIndex=1, getMaxValue=8.7722226955807066E17, getMinIndex=0, getMinValue=-Infinity, getNorm=Infinity, getSparsity=1.0, isInfinite=true, i...#211#1304002560", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getDimension=2, getL1Norm=Infinity, getLInfNorm=Infinity, getMaxIndex=1, getMaxValue=8.7722226955807066E17, getMinIndex=0, getMinValue=-Infinity, getNorm=Infinity, getSparsity=1.0, isInfinite=true, i...#211#1304002560", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput226() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math3.linear.OpenMapRealVector", "org.apache.commons.math3.linear.OpenMapRealVector", "mapSubtractToSelf", new String[]{"double"}, new String[]{"-Infinity"}, false, 2, new String[][]{{"org.apache.commons.math3.linear.OpenMapRealVector", "getL1Distance", "org.apache.commons.math3.linear.OpenMapRealVector", "<sample:6>"}}), new String[][]{{"getLInfNorm", "", "4"}});
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("Infinity", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getDimension=1, getL1Norm=Infinity, getLInfNorm=Infinity, getMaxIndex=0, getMaxValue=Infinity, getMinIndex=0, getMinValue=Infinity, getNorm=Infinity, getSparsity=1.0, isInfinite=true, isNaN=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput227() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.linear.OpenMapRealVector", "org.apache.commons.math3.linear.OpenMapRealVector", "getNorm", new String[]{}, new String[]{}, false, 1, new String[][]{{"org.apache.commons.math3.linear.OpenMapRealVector", "hashCode", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("Infinity", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getDimension=3, getL1Norm=Infinity, getLInfNorm=Infinity, getMaxIndex=1, getMaxValue=Infinity, getMinIndex=2, getMinValue=-Infinity, getNorm=Infinity, getSparsity=1.0, isInfinite=true, isNaN=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput228() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.linear.OpenMapRealVector", "org.apache.commons.math3.linear.OpenMapRealVector", "subtract", new String[]{"org.apache.commons.math3.linear.OpenMapRealVector"}, new String[]{"<sample:0>"}, false, 0, new String[][]{{"org.apache.commons.math3.linear.OpenMapRealVector", "mapAddToSelf", "double", "0.5"}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.math3.linear.OpenMapRealVector", actual.getClass().getName());
  assertEquals("{getDimension=0, getL1Norm=0.0, getLInfNorm=0.0, getMaxIndex=-1, getMaxValue=NaN, getMinIndex=-1, getMinValue=NaN, getNorm=0.0, getSparsity=NaN, isInfinite=false, isNaN=false}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getDimension=0, getL1Norm=0.0, getLInfNorm=0.0, getMaxIndex=-1, getMaxValue=NaN, getMinIndex=-1, getMinValue=NaN, getNorm=0.0, getSparsity=NaN, isInfinite=false, isNaN=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput229() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.linear.OpenMapRealVector", "org.apache.commons.math3.linear.OpenMapRealVector", "getNorm", new String[]{}, new String[]{}, false);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("0.0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getDimension=0, getL1Norm=0.0, getLInfNorm=0.0, getMaxIndex=-1, getMaxValue=NaN, getMinIndex=-1, getMinValue=NaN, getNorm=0.0, getSparsity=NaN, isInfinite=false, isNaN=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput230() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math3.linear.OpenMapRealVector", "org.apache.commons.math3.linear.OpenMapRealVector", "walkInDefaultOrder", new String[]{"org.apache.commons.math3.linear.RealVectorChangingVisitor", "int", "int"}, new String[]{"<sample:7>", "-2147483648", "-1073741824"}, false, 1, new String[][]{{"org.apache.commons.math3.linear.OpenMapRealVector", "combine", "double,double,org.apache.commons.math3.linear.RealVector", "1.63", "4.3861113477903534E18", "<sample:7>"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("org.apache.commons.math3.exception.OutOfRangeException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput231() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.linear.OpenMapRealVector", "org.apache.commons.math3.linear.OpenMapRealVector", "map", new String[]{"org.apache.commons.math3.analysis.UnivariateFunction"}, new String[]{"<sample:1>"}, false, 1, new String[][]{{"org.apache.commons.math3.linear.OpenMapRealVector", "add", "org.apache.commons.math3.linear.OpenMapRealVector", "<sample:3>"}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.math3.linear.OpenMapRealVector", actual.getClass().getName());
  assertEquals("{getDimension=3, getL1Norm=3.0, getLInfNorm=1.0, getMaxIndex=2, getMaxValue=-1.0, getMinIndex=2, getMinValue=-1.0, getNorm=1.7320508075688772, getSparsity=1.0, isInfinite=false, isNaN=false}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getDimension=3, getL1Norm=Infinity, getLInfNorm=Infinity, getMaxIndex=1, getMaxValue=Infinity, getMinIndex=2, getMinValue=-Infinity, getNorm=Infinity, getSparsity=1.0, isInfinite=true, isNaN=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput232() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.linear.OpenMapRealVector", "org.apache.commons.math3.linear.OpenMapRealVector", "getL1Norm", new String[]{}, new String[]{}, false, 2, new String[][]{});
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("0.0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getDimension=1, getL1Norm=0.0, getLInfNorm=0.0, getMaxIndex=0, getMaxValue=0.0, getMinIndex=0, getMinValue=0.0, getNorm=0.0, getSparsity=0.0, isInfinite=false, isNaN=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput233() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.linear.OpenMapRealVector", "org.apache.commons.math3.linear.OpenMapRealVector", "getEntry", new String[]{"int"}, new String[]{"5"}, false, 4, new String[][]{{"org.apache.commons.math3.linear.OpenMapRealVector", "map", "org.apache.commons.math3.analysis.UnivariateFunction", "<sample:4>"}});
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("0.0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getDimension=12, getL1Norm=Infinity, getLInfNorm=Infinity, getMaxIndex=0, getMaxValue=Infinity, getMinIndex=1, getMinValue=-Infinity, getNorm=Infinity, getSparsity=0.16666666666666666, isInfinite=tru...#215#-1192199922", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput234() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math3.linear.OpenMapRealVector", "org.apache.commons.math3.linear.OpenMapRealVector", "append", new String[]{"org.apache.commons.math3.linear.OpenMapRealVector"}, new String[]{"<sample:9>"}, false, 3, new String[][]{{"org.apache.commons.math3.linear.OpenMapRealVector", "isNaN", ""}}), new String[][]{{"getLInfNorm", "", "2"}});
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("Infinity", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getDimension=2, getL1Norm=Infinity, getLInfNorm=Infinity, getMaxIndex=1, getMaxValue=-1.0, getMinIndex=0, getMinValue=-Infinity, getNorm=Infinity, getSparsity=1.0, isInfinite=true, isNaN=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput235() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math3.linear.OpenMapRealVector", "org.apache.commons.math3.linear.OpenMapRealVector", "mapMultiply", new String[]{"double"}, new String[]{"-1.0000000000000002E-12"}, false, 0, new String[][]{{"org.apache.commons.math3.linear.OpenMapRealVector", "walkInOptimizedOrder", "org.apache.commons.math3.linear.RealVectorChangingVisitor", "<sample:0>"}}), new String[][]{{"getMaxIndex", "", "4"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("-1", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getDimension=0, getL1Norm=0.0, getLInfNorm=0.0, getMaxIndex=-1, getMaxValue=NaN, getMinIndex=-1, getMinValue=NaN, getNorm=0.0, getSparsity=NaN, isInfinite=false, isNaN=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput236() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.linear.OpenMapRealVector", "org.apache.commons.math3.linear.OpenMapRealVector", "walkInDefaultOrder", new String[]{"org.apache.commons.math3.linear.RealVectorPreservingVisitor"}, new String[]{"<sample:3>"}, false, 0, new String[][]{{"org.apache.commons.math3.linear.OpenMapRealVector", "mapAdd", "double", "Infinity"}});
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("1.0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getDimension=0, getL1Norm=0.0, getLInfNorm=0.0, getMaxIndex=-1, getMaxValue=NaN, getMinIndex=-1, getMinValue=NaN, getNorm=0.0, getSparsity=NaN, isInfinite=false, isNaN=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput237() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.linear.OpenMapRealVector", "org.apache.commons.math3.linear.OpenMapRealVector", "append", new String[]{"org.apache.commons.math3.linear.OpenMapRealVector"}, new String[]{"<sample:8>"}, false, 1, new String[][]{{"org.apache.commons.math3.linear.OpenMapRealVector", "checkIndex", "int", "-2147483594"}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.math3.linear.OpenMapRealVector", actual.getClass().getName());
  assertEquals("{getDimension=9, getL1Norm=Infinity, getLInfNorm=Infinity, getMaxIndex=1, getMaxValue=Infinity, getMinIndex=2, getMinValue=-Infinity, getNorm=Infinity, getSparsity=0.3333333333333333, isInfinite=true,...#213#-1991194405", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getDimension=3, getL1Norm=Infinity, getLInfNorm=Infinity, getMaxIndex=1, getMaxValue=Infinity, getMinIndex=2, getMinValue=-Infinity, getNorm=Infinity, getSparsity=1.0, isInfinite=true, isNaN=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput238() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.linear.OpenMapRealVector", "org.apache.commons.math3.linear.OpenMapRealVector", "mapAdd", new String[]{"double"}, new String[]{"-0.5599999999995"}, false, 5, new String[][]{{"org.apache.commons.math3.linear.OpenMapRealVector", "ebeDivide", "org.apache.commons.math3.linear.RealVector", "<sample:7>"}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.math3.linear.OpenMapRealVector", actual.getClass().getName());
  assertEquals("{getDimension=0, getL1Norm=0.0, getLInfNorm=0.0, getMaxIndex=-1, getMaxValue=NaN, getMinIndex=-1, getMinValue=NaN, getNorm=0.0, getSparsity=NaN, isInfinite=false, isNaN=false}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getDimension=0, getL1Norm=0.0, getLInfNorm=0.0, getMaxIndex=-1, getMaxValue=NaN, getMinIndex=-1, getMinValue=NaN, getNorm=0.0, getSparsity=NaN, isInfinite=false, isNaN=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput239() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.linear.OpenMapRealVector", "org.apache.commons.math3.linear.OpenMapRealVector", "mapSubtractToSelf", new String[]{"double"}, new String[]{"1.8010000000009998"}, false, 1, new String[][]{{"org.apache.commons.math3.linear.OpenMapRealVector", "subtract", "org.apache.commons.math3.linear.RealVector", "<sample:1>"}, {"org.apache.commons.math3.linear.OpenMapRealVector", "dotProduct", "org.apache.commons.math3.linear.OpenMapRealVector", "<sample:1>"}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.math3.linear.OpenMapRealVector", actual.getClass().getName());
  assertEquals("{getDimension=3, getL1Norm=Infinity, getLInfNorm=Infinity, getMaxIndex=1, getMaxValue=Infinity, getMinIndex=2, getMinValue=-Infinity, getNorm=Infinity, getSparsity=1.0, isInfinite=true, isNaN=false}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getDimension=3, getL1Norm=Infinity, getLInfNorm=Infinity, getMaxIndex=1, getMaxValue=Infinity, getMinIndex=2, getMinValue=-Infinity, getNorm=Infinity, getSparsity=1.0, isInfinite=true, isNaN=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput240() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.linear.OpenMapRealVector", "org.apache.commons.math3.linear.OpenMapRealVector", "mapDivideToSelf", new String[]{"double"}, new String[]{"1.0E-12"}, false, 2, new String[][]{});
  assertNotNull(actual);
  assertEquals("org.apache.commons.math3.linear.OpenMapRealVector", actual.getClass().getName());
  assertEquals("{getDimension=1, getL1Norm=0.0, getLInfNorm=0.0, getMaxIndex=0, getMaxValue=0.0, getMinIndex=0, getMinValue=0.0, getNorm=0.0, getSparsity=0.0, isInfinite=false, isNaN=false}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getDimension=1, getL1Norm=0.0, getLInfNorm=0.0, getMaxIndex=0, getMaxValue=0.0, getMinIndex=0, getMinValue=0.0, getNorm=0.0, getSparsity=0.0, isInfinite=false, isNaN=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput241() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.linear.OpenMapRealVector", "org.apache.commons.math3.linear.OpenMapRealVector", "append", new String[]{"double"}, new String[]{"-13.4"}, false, 7, new String[][]{});
  assertNotNull(actual);
  assertEquals("org.apache.commons.math3.linear.OpenMapRealVector", actual.getClass().getName());
  assertEquals("{getDimension=4, getL1Norm=Infinity, getLInfNorm=Infinity, getMaxIndex=0, getMaxValue=Infinity, getMinIndex=1, getMinValue=-Infinity, getNorm=Infinity, getSparsity=0.5, isInfinite=true, isNaN=false}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getDimension=3, getL1Norm=Infinity, getLInfNorm=Infinity, getMaxIndex=0, getMaxValue=Infinity, getMinIndex=1, getMinValue=-Infinity, getNorm=Infinity, getSparsity=0.6666666666666666, isInfinite=true,...#213#242791861", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput242() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.linear.OpenMapRealVector", "org.apache.commons.math3.linear.OpenMapRealVector", "unitize", new String[]{}, new String[]{}, false, 3, new String[][]{});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getDimension=2, getL1Norm=NaN, getLInfNorm=NaN, getMaxIndex=1, getMaxValue=-0.0, getMinIndex=1, getMinValue=-0.0, getNorm=NaN, getSparsity=1.0, isInfinite=false, isNaN=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput243() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math3.linear.OpenMapRealVector", "org.apache.commons.math3.linear.OpenMapRealVector", "mapAddToSelf", new String[]{"double"}, new String[]{"1.7976931348623157E308"}, false, 4, new String[][]{}), new String[][]{{"append", "org.apache.commons.math3.linear.OpenMapRealVector", "4"}, {"getMaxIndex", "", "0"}, {"ebeMultiply", "org.apache.commons.math3.linear.RealVector", "3"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput244() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math3.linear.OpenMapRealVector", "org.apache.commons.math3.linear.OpenMapRealVector", "getLInfDistance", new String[]{"org.apache.commons.math3.linear.RealVector"}, new String[]{"<sample:8>"}, false, 1, new String[][]{{"org.apache.commons.math3.linear.OpenMapRealVector", "addToEntry", "int,double", "44", "3.7"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("org.apache.commons.math3.exception.DimensionMismatchException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput245() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math3.linear.OpenMapRealVector", "org.apache.commons.math3.linear.OpenMapRealVector", "iterator", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.math3.linear.OpenMapRealVector", "add", "org.apache.commons.math3.linear.OpenMapRealVector", "<sample:7>"}}), new String[][]{{"hasNext", "", "2"}, {"hasNext", "", "5"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getDimension=0, getL1Norm=0.0, getLInfNorm=0.0, getMaxIndex=-1, getMaxValue=NaN, getMinIndex=-1, getMinValue=NaN, getNorm=0.0, getSparsity=NaN, isInfinite=false, isNaN=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput246() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math3.linear.OpenMapRealVector", "org.apache.commons.math3.linear.OpenMapRealVector", "append", new String[]{"org.apache.commons.math3.linear.OpenMapRealVector"}, new String[]{"<sample:5>"}, false, 0, new String[][]{{"org.apache.commons.math3.linear.OpenMapRealVector", "addToEntry", "int,double", "-65535", "-0.49"}}), new String[][]{{"getMinIndex", "", "0"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("-1", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getDimension=0, getL1Norm=0.0, getLInfNorm=0.0, getMaxIndex=-1, getMaxValue=NaN, getMinIndex=-1, getMinValue=NaN, getNorm=0.0, getSparsity=NaN, isInfinite=false, isNaN=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput247() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.linear.OpenMapRealVector", "org.apache.commons.math3.linear.OpenMapRealVector", "mapDivide", new String[]{"double"}, new String[]{"NaN"}, false);
  assertNotNull(actual);
  assertEquals("org.apache.commons.math3.linear.OpenMapRealVector", actual.getClass().getName());
  assertEquals("{getDimension=0, getL1Norm=0.0, getLInfNorm=0.0, getMaxIndex=-1, getMaxValue=NaN, getMinIndex=-1, getMinValue=NaN, getNorm=0.0, getSparsity=NaN, isInfinite=false, isNaN=false}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getDimension=0, getL1Norm=0.0, getLInfNorm=0.0, getMaxIndex=-1, getMaxValue=NaN, getMinIndex=-1, getMinValue=NaN, getNorm=0.0, getSparsity=NaN, isInfinite=false, isNaN=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput248() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math3.linear.OpenMapRealVector", "org.apache.commons.math3.linear.OpenMapRealVector", "subtract", new String[]{"org.apache.commons.math3.linear.RealVector"}, new String[]{"<sample:8>"}, false, 1, new String[][]{{"org.apache.commons.math3.linear.OpenMapRealVector", "append", "org.apache.commons.math3.linear.OpenMapRealVector", "<sample:2>"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("org.apache.commons.math3.exception.DimensionMismatchException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput249() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math3.linear.OpenMapRealVector", "org.apache.commons.math3.linear.OpenMapRealVector", "getLInfDistance", new String[]{"org.apache.commons.math3.linear.RealVector"}, new String[]{"<sample:9>"}, false, 0, new String[][]{{"org.apache.commons.math3.linear.OpenMapRealVector", "ebeDivide", "org.apache.commons.math3.linear.RealVector", "<sample:4>"}, {"org.apache.commons.math3.linear.OpenMapRealVector", "getSubVector", "int,int", "2147483647", "67108865"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput250() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.linear.OpenMapRealVector", "org.apache.commons.math3.linear.OpenMapRealVector", "getMaxValue", new String[]{}, new String[]{}, false, 4, new String[][]{});
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("Infinity", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getDimension=12, getL1Norm=Infinity, getLInfNorm=Infinity, getMaxIndex=0, getMaxValue=Infinity, getMinIndex=1, getMinValue=-Infinity, getNorm=Infinity, getSparsity=0.16666666666666666, isInfinite=tru...#215#-1192199922", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput251() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math3.linear.OpenMapRealVector", "org.apache.commons.math3.linear.OpenMapRealVector", "append", new String[]{"org.apache.commons.math3.linear.OpenMapRealVector"}, new String[]{"<sample:6>"}, false, 0, new String[][]{{"org.apache.commons.math3.linear.OpenMapRealVector", "ebeDivide", "org.apache.commons.math3.linear.RealVector", "<sample:8>"}}), new String[][]{{"getL1Distance", "org.apache.commons.math3.linear.RealVector", "0"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput252() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.linear.OpenMapRealVector", "org.apache.commons.math3.linear.OpenMapRealVector", "mapSubtractToSelf", new String[]{"double"}, new String[]{"-5.0E-13"}, false, 3, new String[][]{});
  assertNotNull(actual);
  assertEquals("org.apache.commons.math3.linear.OpenMapRealVector", actual.getClass().getName());
  assertEquals("{getDimension=2, getL1Norm=Infinity, getLInfNorm=Infinity, getMaxIndex=1, getMaxValue=-0.9999999999995, getMinIndex=0, getMinValue=-Infinity, getNorm=Infinity, getSparsity=1.0, isInfinite=true, isNaN=...#206#1831353093", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getDimension=2, getL1Norm=Infinity, getLInfNorm=Infinity, getMaxIndex=1, getMaxValue=-0.9999999999995, getMinIndex=0, getMinValue=-Infinity, getNorm=Infinity, getSparsity=1.0, isInfinite=true, isNaN=...#206#1831353093", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput253() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.linear.OpenMapRealVector", "org.apache.commons.math3.linear.OpenMapRealVector", "getLInfNorm", new String[]{}, new String[]{}, false, 2, new String[][]{});
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("0.0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getDimension=1, getL1Norm=0.0, getLInfNorm=0.0, getMaxIndex=0, getMaxValue=0.0, getMinIndex=0, getMinValue=0.0, getNorm=0.0, getSparsity=0.0, isInfinite=false, isNaN=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput254() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.linear.OpenMapRealVector", "org.apache.commons.math3.linear.OpenMapRealVector", "getDistance", new String[]{"org.apache.commons.math3.linear.OpenMapRealVector"}, new String[]{"<sample:4>"}, false, 3, new String[][]{{"org.apache.commons.math3.linear.OpenMapRealVector", "getDistance", "org.apache.commons.math3.linear.RealVector", "<sample:2>"}, {"org.apache.commons.math3.linear.OpenMapRealVector", "checkIndices", "int,int", "2147483647", "-67108902"}});
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("Infinity", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getDimension=2, getL1Norm=Infinity, getLInfNorm=Infinity, getMaxIndex=1, getMaxValue=-1.0, getMinIndex=0, getMinValue=-Infinity, getNorm=Infinity, getSparsity=1.0, isInfinite=true, isNaN=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput255() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.linear.OpenMapRealVector", "org.apache.commons.math3.linear.OpenMapRealVector", "isDefaultValue", new String[]{"double"}, new String[]{"0.021"}, false, 1, new String[][]{{"org.apache.commons.math3.linear.OpenMapRealVector", "addToEntry", "int,double", "1", "1.7976931348623155E308"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getDimension=3, getL1Norm=Infinity, getLInfNorm=Infinity, getMaxIndex=1, getMaxValue=Infinity, getMinIndex=2, getMinValue=-Infinity, getNorm=Infinity, getSparsity=1.0, isInfinite=true, isNaN=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput256() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math3.linear.OpenMapRealVector", "org.apache.commons.math3.linear.OpenMapRealVector", "mapSubtract", new String[]{"double"}, new String[]{"1.0E-11"}, false), new String[][]{{"subtract", "org.apache.commons.math3.linear.OpenMapRealVector", "1"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("org.apache.commons.math3.exception.DimensionMismatchException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput257() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math3.linear.OpenMapRealVector", "org.apache.commons.math3.linear.OpenMapRealVector", "iterator", new String[]{}, new String[]{}, false, 7, new String[][]{{"org.apache.commons.math3.linear.OpenMapRealVector", "unitize", ""}, {"org.apache.commons.math3.linear.OpenMapRealVector", "outerProduct", "org.apache.commons.math3.linear.RealVector", "<sample:10>"}}), new String[][]{{"next", "", "7"}, {"setValue", "double", "5"}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.math3.linear.RealVector$Entry", actual.getClass().getName());
  assertEquals("{getIndex=0, getValue=-Infinity}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getDimension=3, getL1Norm=NaN, getLInfNorm=NaN, getMaxIndex=2, getMaxValue=0.0, getMinIndex=0, getMinValue=-Infinity, getNorm=NaN, getSparsity=0.6666666666666666, isInfinite=false, isNaN=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput258() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.linear.OpenMapRealVector", "org.apache.commons.math3.linear.OpenMapRealVector", "unitize", new String[]{}, new String[]{}, false, 1, new String[][]{{"org.apache.commons.math3.linear.OpenMapRealVector", "toArray", ""}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getDimension=3, getL1Norm=NaN, getLInfNorm=NaN, getMaxIndex=0, getMaxValue=0.0, getMinIndex=0, getMinValue=0.0, getNorm=NaN, getSparsity=1.0, isInfinite=false, isNaN=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput259() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.linear.OpenMapRealVector", "org.apache.commons.math3.linear.OpenMapRealVector", "getMaxIndex", new String[]{}, new String[]{}, false, 2, new String[][]{{"org.apache.commons.math3.linear.OpenMapRealVector", "mapToSelf", "org.apache.commons.math3.analysis.UnivariateFunction", "<sample:0>"}, {"org.apache.commons.math3.linear.OpenMapRealVector", "addToEntry", "int,double", "-10", "0.0"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getDimension=1, getL1Norm=Infinity, getLInfNorm=Infinity, getMaxIndex=0, getMaxValue=-Infinity, getMinIndex=0, getMinValue=-Infinity, getNorm=Infinity, getSparsity=1.0, isInfinite=true, isNaN=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput260() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math3.linear.OpenMapRealVector", "org.apache.commons.math3.linear.OpenMapRealVector", "mapDivide", new String[]{"double"}, new String[]{"-Infinity"}, false, 0, new String[][]{{"org.apache.commons.math3.linear.OpenMapRealVector", "iterator", ""}}), new String[][]{{"dotProduct", "org.apache.commons.math3.linear.OpenMapRealVector", "1"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("org.apache.commons.math3.exception.DimensionMismatchException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput261() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math3.linear.OpenMapRealVector", "org.apache.commons.math3.linear.OpenMapRealVector", "outerProduct", new String[]{"org.apache.commons.math3.linear.RealVector"}, new String[]{"<sample:8>"}, false, 5, new String[][]{{"org.apache.commons.math3.linear.OpenMapRealVector", "getL1Distance", "org.apache.commons.math3.linear.RealVector", "<sample:9>"}, {"org.apache.commons.math3.linear.OpenMapRealVector", "unitVector", ""}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("org.apache.commons.math3.exception.NotStrictlyPositiveException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput262() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.linear.OpenMapRealVector", "org.apache.commons.math3.linear.OpenMapRealVector", "walkInOptimizedOrder", new String[]{"org.apache.commons.math3.linear.RealVectorPreservingVisitor"}, new String[]{"<sample:7>"}, false, 1, new String[][]{{"org.apache.commons.math3.linear.OpenMapRealVector", "getSparsity", ""}, {"org.apache.commons.math3.linear.OpenMapRealVector", "getDistance", "org.apache.commons.math3.linear.RealVector", "<sample:12>"}});
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("0.0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getDimension=3, getL1Norm=Infinity, getLInfNorm=Infinity, getMaxIndex=1, getMaxValue=Infinity, getMinIndex=2, getMinValue=-Infinity, getNorm=Infinity, getSparsity=1.0, isInfinite=true, isNaN=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput263() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math3.linear.OpenMapRealVector", "org.apache.commons.math3.linear.OpenMapRealVector", "map", new String[]{"org.apache.commons.math3.analysis.UnivariateFunction"}, new String[]{"<sample:1>"}, false), new String[][]{{"getNorm", "", "2"}});
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("0.0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getDimension=0, getL1Norm=0.0, getLInfNorm=0.0, getMaxIndex=-1, getMaxValue=NaN, getMinIndex=-1, getMinValue=NaN, getNorm=0.0, getSparsity=NaN, isInfinite=false, isNaN=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput264() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math3.linear.OpenMapRealVector", "org.apache.commons.math3.linear.OpenMapRealVector", "add", new String[]{"org.apache.commons.math3.linear.RealVector"}, new String[]{"<sample:8>"}, false, 1, new String[][]{}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("org.apache.commons.math3.exception.DimensionMismatchException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput265() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.linear.OpenMapRealVector", "org.apache.commons.math3.linear.OpenMapRealVector", "isNaN", new String[]{}, new String[]{}, false, 1, new String[][]{});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getDimension=3, getL1Norm=Infinity, getLInfNorm=Infinity, getMaxIndex=1, getMaxValue=Infinity, getMinIndex=2, getMinValue=-Infinity, getNorm=Infinity, getSparsity=1.0, isInfinite=true, isNaN=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput266() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.linear.OpenMapRealVector", "org.apache.commons.math3.linear.OpenMapRealVector", "set", new String[]{"double"}, new String[]{"1.0E-11"}, false, 2, new String[][]{});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getDimension=1, getL1Norm=1.0E-11, getLInfNorm=1.0E-11, getMaxIndex=0, getMaxValue=1.0E-11, getMinIndex=0, getMinValue=1.0E-11, getNorm=1.0E-11, getSparsity=1.0, isInfinite=false, isNaN=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput267() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.linear.OpenMapRealVector", "org.apache.commons.math3.linear.OpenMapRealVector", "isInfinite", new String[]{}, new String[]{}, false);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getDimension=0, getL1Norm=0.0, getLInfNorm=0.0, getMaxIndex=-1, getMaxValue=NaN, getMinIndex=-1, getMinValue=NaN, getNorm=0.0, getSparsity=NaN, isInfinite=false, isNaN=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput268() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.linear.OpenMapRealVector", "org.apache.commons.math3.linear.OpenMapRealVector", "mapMultiplyToSelf", new String[]{"double"}, new String[]{"0.0"}, false, 0, new String[][]{{"org.apache.commons.math3.linear.OpenMapRealVector", "walkInOptimizedOrder", "org.apache.commons.math3.linear.RealVectorPreservingVisitor", "<sample:1>"}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.math3.linear.OpenMapRealVector", actual.getClass().getName());
  assertEquals("{getDimension=0, getL1Norm=0.0, getLInfNorm=0.0, getMaxIndex=-1, getMaxValue=NaN, getMinIndex=-1, getMinValue=NaN, getNorm=0.0, getSparsity=NaN, isInfinite=false, isNaN=false}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getDimension=0, getL1Norm=0.0, getLInfNorm=0.0, getMaxIndex=-1, getMaxValue=NaN, getMinIndex=-1, getMinValue=NaN, getNorm=0.0, getSparsity=NaN, isInfinite=false, isNaN=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput269() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.linear.OpenMapRealVector", "org.apache.commons.math3.linear.OpenMapRealVector", "dotProduct", new String[]{"org.apache.commons.math3.linear.OpenMapRealVector"}, new String[]{"<sample:3>"}, false, 3, new String[][]{{"org.apache.commons.math3.linear.OpenMapRealVector", "getDimension", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("Infinity", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getDimension=2, getL1Norm=Infinity, getLInfNorm=Infinity, getMaxIndex=1, getMaxValue=-1.0, getMinIndex=0, getMinValue=-Infinity, getNorm=Infinity, getSparsity=1.0, isInfinite=true, isNaN=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput270() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math3.linear.OpenMapRealVector", "org.apache.commons.math3.linear.OpenMapRealVector", "map", new String[]{"org.apache.commons.math3.analysis.UnivariateFunction"}, new String[]{"<sample:2>"}, false, 0, new String[][]{{"org.apache.commons.math3.linear.OpenMapRealVector", "add", "org.apache.commons.math3.linear.OpenMapRealVector", "<sample:2>"}}), new String[][]{{"ebeMultiply", "org.apache.commons.math3.linear.RealVector", "3"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput271() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.linear.OpenMapRealVector", "org.apache.commons.math3.linear.OpenMapRealVector", "checkVectorDimensions", new String[]{"int"}, new String[]{"0"}, false);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getDimension=0, getL1Norm=0.0, getLInfNorm=0.0, getMaxIndex=-1, getMaxValue=NaN, getMinIndex=-1, getMinValue=NaN, getNorm=0.0, getSparsity=NaN, isInfinite=false, isNaN=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput272() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math3.linear.OpenMapRealVector", "org.apache.commons.math3.linear.OpenMapRealVector", "append", new String[]{"org.apache.commons.math3.linear.OpenMapRealVector"}, new String[]{"<sample:3>"}, false, 6, new String[][]{{"org.apache.commons.math3.linear.OpenMapRealVector", "getMaxIndex", ""}}), new String[][]{{"mapAddToSelf", "double", "5"}, {"getMaxIndex", "", "3"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("9", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getDimension=8, getL1Norm=Infinity, getLInfNorm=Infinity, getMaxIndex=0, getMaxValue=Infinity, getMinIndex=1, getMinValue=-Infinity, getNorm=Infinity, getSparsity=0.25, isInfinite=true, isNaN=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput273() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math3.linear.OpenMapRealVector", "org.apache.commons.math3.linear.OpenMapRealVector", "walkInOptimizedOrder", new String[]{"org.apache.commons.math3.linear.RealVectorPreservingVisitor"}, new String[]{"<null>"}, false, 1, new String[][]{{"org.apache.commons.math3.linear.OpenMapRealVector", "getSubVector", "int,int", "2147483647", "20"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput274() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math3.linear.OpenMapRealVector", "org.apache.commons.math3.linear.OpenMapRealVector", "cosine", new String[]{"org.apache.commons.math3.linear.RealVector"}, new String[]{"<null>"}, false, 5, new String[][]{{"org.apache.commons.math3.linear.OpenMapRealVector", "walkInOptimizedOrder", "org.apache.commons.math3.linear.RealVectorPreservingVisitor,int,int", "<sample:1>", "2147483647", "-2147483648"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput275() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math3.linear.OpenMapRealVector", "org.apache.commons.math3.linear.OpenMapRealVector", "copy", new String[]{}, new String[]{}, false, 4, new String[][]{{"org.apache.commons.math3.linear.OpenMapRealVector", "outerProduct", "org.apache.commons.math3.linear.RealVector", "<sample:3>"}}), new String[][]{{"walkInDefaultOrder", "org.apache.commons.math3.linear.RealVectorChangingVisitor,int,int", "7"}});
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("0.0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getDimension=12, getL1Norm=Infinity, getLInfNorm=Infinity, getMaxIndex=0, getMaxValue=Infinity, getMinIndex=1, getMinValue=-Infinity, getNorm=Infinity, getSparsity=0.16666666666666666, isInfinite=tru...#215#-1192199922", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput276() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.linear.OpenMapRealVector", "org.apache.commons.math3.linear.OpenMapRealVector", "walkInDefaultOrder", new String[]{"org.apache.commons.math3.linear.RealVectorChangingVisitor"}, new String[]{"<sample:0>"}, false, 3, new String[][]{});
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("-Infinity", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getDimension=2, getL1Norm=Infinity, getLInfNorm=Infinity, getMaxIndex=1, getMaxValue=-Infinity, getMinIndex=1, getMinValue=-Infinity, getNorm=Infinity, getSparsity=1.0, isInfinite=true, isNaN=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput277() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.linear.OpenMapRealVector", "org.apache.commons.math3.linear.OpenMapRealVector", "getMaxValue", new String[]{}, new String[]{}, false, 1, new String[][]{});
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("Infinity", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getDimension=3, getL1Norm=Infinity, getLInfNorm=Infinity, getMaxIndex=1, getMaxValue=Infinity, getMinIndex=2, getMinValue=-Infinity, getNorm=Infinity, getSparsity=1.0, isInfinite=true, isNaN=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput278() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math3.linear.OpenMapRealVector", "org.apache.commons.math3.linear.OpenMapRealVector", "map", new String[]{"org.apache.commons.math3.analysis.UnivariateFunction"}, new String[]{"<sample:2>"}, false), new String[][]{{"getSubVector", "int,int", "6"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("org.apache.commons.math3.exception.OutOfRangeException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput279() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math3.linear.OpenMapRealVector", "org.apache.commons.math3.linear.OpenMapRealVector", "append", new String[]{"org.apache.commons.math3.linear.RealVector"}, new String[]{"<sample:4>"}, false, 1, new String[][]{{"org.apache.commons.math3.linear.OpenMapRealVector", "add", "org.apache.commons.math3.linear.RealVector", "<sample:10>"}, {"org.apache.commons.math3.linear.OpenMapRealVector", "setSubVector", "int,org.apache.commons.math3.linear.RealVector", "10", "<sample:8>"}}), new String[][]{{"getEntry", "int", "5"}, {"getNorm", "", "7"}});
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("Infinity", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getDimension=3, getL1Norm=Infinity, getLInfNorm=Infinity, getMaxIndex=1, getMaxValue=Infinity, getMinIndex=2, getMinValue=-Infinity, getNorm=Infinity, getSparsity=1.0, isInfinite=true, isNaN=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput280() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math3.linear.OpenMapRealVector", "org.apache.commons.math3.linear.OpenMapRealVector", "copy", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.math3.linear.OpenMapRealVector", "walkInDefaultOrder", "org.apache.commons.math3.linear.RealVectorChangingVisitor,int,int", "<sample:4>", "2147418111", "0"}}), new String[][]{{"setSubVector", "int,org.apache.commons.math3.linear.RealVector", "1"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("org.apache.commons.math3.exception.OutOfRangeException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput281() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.linear.OpenMapRealVector", "org.apache.commons.math3.linear.OpenMapRealVector", "walkInOptimizedOrder", new String[]{"org.apache.commons.math3.linear.RealVectorPreservingVisitor"}, new String[]{"<sample:7>"}, false, 7, new String[][]{{"org.apache.commons.math3.linear.OpenMapRealVector", "getMaxValue", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("0.0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getDimension=3, getL1Norm=Infinity, getLInfNorm=Infinity, getMaxIndex=0, getMaxValue=Infinity, getMinIndex=1, getMinValue=-Infinity, getNorm=Infinity, getSparsity=0.6666666666666666, isInfinite=true,...#213#242791861", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput282() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math3.linear.OpenMapRealVector", "org.apache.commons.math3.linear.OpenMapRealVector", "append", new String[]{"double"}, new String[]{"-4.9E-324"}, false), new String[][]{{"append", "org.apache.commons.math3.linear.RealVector", "2"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput283() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.linear.OpenMapRealVector", "org.apache.commons.math3.linear.OpenMapRealVector", "mapSubtract", new String[]{"double"}, new String[]{"-1.0000000000000002E-12"}, false, 2, new String[][]{{"org.apache.commons.math3.linear.OpenMapRealVector", "ebeMultiply", "org.apache.commons.math3.linear.RealVector", "<sample:5>"}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.math3.linear.OpenMapRealVector", actual.getClass().getName());
  assertEquals("{getDimension=1, getL1Norm=1.0000000000000002E-12, getLInfNorm=1.0000000000000002E-12, getMaxIndex=0, getMaxValue=1.0000000000000002E-12, getMinIndex=0, getMinValue=1.0000000000000002E-12, getNorm=1.0...#268#-524873255", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getDimension=1, getL1Norm=0.0, getLInfNorm=0.0, getMaxIndex=0, getMaxValue=0.0, getMinIndex=0, getMinValue=0.0, getNorm=0.0, getSparsity=0.0, isInfinite=false, isNaN=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput284() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.linear.OpenMapRealVector", "org.apache.commons.math3.linear.OpenMapRealVector", "append", new String[]{"double"}, new String[]{"4.9E-323"}, false, 3, new String[][]{}, 3);
  assertNotNull(actual);
  assertEquals("org.apache.commons.math3.linear.OpenMapRealVector", actual.getClass().getName());
  assertEquals("{getDimension=3, getL1Norm=Infinity, getLInfNorm=Infinity, getMaxIndex=2, getMaxValue=0.0, getMinIndex=0, getMinValue=-Infinity, getNorm=Infinity, getSparsity=0.6666666666666666, isInfinite=true, isNa...#208#-1906858044", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getDimension=2, getL1Norm=Infinity, getLInfNorm=Infinity, getMaxIndex=1, getMaxValue=-1.0, getMinIndex=0, getMinValue=-Infinity, getNorm=Infinity, getSparsity=1.0, isInfinite=true, isNaN=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput285() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.linear.OpenMapRealVector", "org.apache.commons.math3.linear.OpenMapRealVector", "getNorm", new String[]{}, new String[]{}, false, 3, new String[][]{{"org.apache.commons.math3.linear.OpenMapRealVector", "checkIndices", "int,int", "67108865", "2145386496"}});
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("Infinity", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getDimension=2, getL1Norm=Infinity, getLInfNorm=Infinity, getMaxIndex=1, getMaxValue=-1.0, getMinIndex=0, getMinValue=-Infinity, getNorm=Infinity, getSparsity=1.0, isInfinite=true, isNaN=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput286() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math3.linear.OpenMapRealVector", "org.apache.commons.math3.linear.OpenMapRealVector", "mapDivideToSelf", new String[]{"double"}, new String[]{"-1.7976931348623157E308"}, false, 0, new String[][]{{"org.apache.commons.math3.linear.OpenMapRealVector", "checkVectorDimensions", "org.apache.commons.math3.linear.RealVector", "<sample:12>"}}), new String[][]{{"walkInOptimizedOrder", "org.apache.commons.math3.linear.RealVectorPreservingVisitor,int,int", "1"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("org.apache.commons.math3.exception.OutOfRangeException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput287() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math3.linear.OpenMapRealVector", "org.apache.commons.math3.linear.OpenMapRealVector", "subtract", new String[]{"org.apache.commons.math3.linear.OpenMapRealVector"}, new String[]{"<null>"}, false, 4, new String[][]{{"org.apache.commons.math3.linear.OpenMapRealVector", "walkInOptimizedOrder", "org.apache.commons.math3.linear.RealVectorPreservingVisitor,int,int", "<sample:5>", "67108865", "2147483647"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput288() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.linear.OpenMapRealVector", "org.apache.commons.math3.linear.OpenMapRealVector", "walkInOptimizedOrder", new String[]{"org.apache.commons.math3.linear.RealVectorPreservingVisitor"}, new String[]{"<sample:1>"}, false, 4, new String[][]{{"org.apache.commons.math3.linear.OpenMapRealVector", "isInfinite", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("-1.0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getDimension=12, getL1Norm=Infinity, getLInfNorm=Infinity, getMaxIndex=0, getMaxValue=Infinity, getMinIndex=1, getMinValue=-Infinity, getNorm=Infinity, getSparsity=0.16666666666666666, isInfinite=tru...#215#-1192199922", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput289() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math3.linear.OpenMapRealVector", "org.apache.commons.math3.linear.OpenMapRealVector", "checkIndex", new String[]{"int"}, new String[]{"-1006632960"}, false, 0, new String[][]{{"org.apache.commons.math3.linear.OpenMapRealVector", "getDimension", ""}, {"org.apache.commons.math3.linear.OpenMapRealVector", "mapDivide", "double", "1.0"}}, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("org.apache.commons.math3.exception.OutOfRangeException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput290() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.linear.OpenMapRealVector", "org.apache.commons.math3.linear.OpenMapRealVector", "getEntry", new String[]{"int"}, new String[]{"0"}, false, 1, new String[][]{});
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("1.0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getDimension=3, getL1Norm=Infinity, getLInfNorm=Infinity, getMaxIndex=1, getMaxValue=Infinity, getMinIndex=2, getMinValue=-Infinity, getNorm=Infinity, getSparsity=1.0, isInfinite=true, isNaN=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput291() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math3.linear.OpenMapRealVector", "org.apache.commons.math3.linear.OpenMapRealVector", "dotProduct", new String[]{"org.apache.commons.math3.linear.OpenMapRealVector"}, new String[]{"<null>"}, false, 1, new String[][]{{"org.apache.commons.math3.linear.OpenMapRealVector", "getSubVector", "int,int", "67108865", "67108866"}, {"org.apache.commons.math3.linear.OpenMapRealVector", "checkIndices", "int,int", "-2147483647", "-2147483647"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput292() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.linear.OpenMapRealVector", "org.apache.commons.math3.linear.OpenMapRealVector", "getDistance", new String[]{"org.apache.commons.math3.linear.OpenMapRealVector"}, new String[]{"<sample:7>"}, false, 1, new String[][]{{"org.apache.commons.math3.linear.OpenMapRealVector", "combineToSelf", "double,double,org.apache.commons.math3.linear.RealVector", "-4.99999999999975", "-6.7", "<sample:3>"}});
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("Infinity", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getDimension=3, getL1Norm=Infinity, getLInfNorm=Infinity, getMaxIndex=1, getMaxValue=Infinity, getMinIndex=2, getMinValue=-Infinity, getNorm=Infinity, getSparsity=1.0, isInfinite=true, isNaN=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput293() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math3.linear.OpenMapRealVector", "org.apache.commons.math3.linear.OpenMapRealVector", "getL1Distance", new String[]{"org.apache.commons.math3.linear.OpenMapRealVector"}, new String[]{"<sample:3>"}, false, 1, new String[][]{}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("org.apache.commons.math3.exception.OutOfRangeException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput294() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math3.linear.OpenMapRealVector", "org.apache.commons.math3.linear.OpenMapRealVector", "mapMultiplyToSelf", new String[]{"double"}, new String[]{"-6.7"}, false, 6, new String[][]{{"org.apache.commons.math3.linear.OpenMapRealVector", "isNaN", ""}}), new String[][]{{"getMaxIndex", "", "0"}, {"getEntry", "int", "5"}});
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("0.0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getDimension=8, getL1Norm=Infinity, getLInfNorm=Infinity, getMaxIndex=1, getMaxValue=Infinity, getMinIndex=0, getMinValue=-Infinity, getNorm=Infinity, getSparsity=0.25, isInfinite=true, isNaN=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput295() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.linear.OpenMapRealVector", "org.apache.commons.math3.linear.OpenMapRealVector", "getEntry", new String[]{"int"}, new String[]{"0"}, false, 3, new String[][]{{"org.apache.commons.math3.linear.OpenMapRealVector", "append", "double", "Infinity"}, {"org.apache.commons.math3.linear.OpenMapRealVector", "sparseIterator", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("-Infinity", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getDimension=2, getL1Norm=Infinity, getLInfNorm=Infinity, getMaxIndex=1, getMaxValue=-1.0, getMinIndex=0, getMinValue=-Infinity, getNorm=Infinity, getSparsity=1.0, isInfinite=true, isNaN=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput296() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math3.linear.OpenMapRealVector", "org.apache.commons.math3.linear.OpenMapRealVector", "mapAddToSelf", new String[]{"double"}, new String[]{"1.7976931348623157E308"}, false, 1, new String[][]{}), new String[][]{{"append", "org.apache.commons.math3.linear.OpenMapRealVector", "6"}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.math3.linear.OpenMapRealVector", actual.getClass().getName());
  assertEquals("{getDimension=11, getL1Norm=Infinity, getLInfNorm=Infinity, getMaxIndex=3, getMaxValue=Infinity, getMinIndex=4, getMinValue=-Infinity, getNorm=Infinity, getSparsity=0.45454545454545453, isInfinite=tru...#215#390327061", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getDimension=3, getL1Norm=Infinity, getLInfNorm=Infinity, getMaxIndex=1, getMaxValue=Infinity, getMinIndex=2, getMinValue=-Infinity, getNorm=Infinity, getSparsity=1.0, isInfinite=true, isNaN=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput297() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math3.linear.OpenMapRealVector", "org.apache.commons.math3.linear.OpenMapRealVector", "dotProduct", new String[]{"org.apache.commons.math3.linear.OpenMapRealVector"}, new String[]{"<sample:7>"}, false, 3, new String[][]{{"org.apache.commons.math3.linear.OpenMapRealVector", "add", "org.apache.commons.math3.linear.RealVector", "<sample:8>"}}, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("org.apache.commons.math3.exception.DimensionMismatchException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput298() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.linear.OpenMapRealVector", "org.apache.commons.math3.linear.OpenMapRealVector", "getNorm", new String[]{}, new String[]{}, false, 6, new String[][]{{"org.apache.commons.math3.linear.OpenMapRealVector", "getSparsity", ""}, {"org.apache.commons.math3.linear.OpenMapRealVector", "add", "org.apache.commons.math3.linear.RealVector", "<sample:7>"}});
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("Infinity", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getDimension=8, getL1Norm=Infinity, getLInfNorm=Infinity, getMaxIndex=0, getMaxValue=Infinity, getMinIndex=1, getMinValue=-Infinity, getNorm=Infinity, getSparsity=0.25, isInfinite=true, isNaN=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput299() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math3.linear.OpenMapRealVector", "org.apache.commons.math3.linear.OpenMapRealVector", "iterator", new String[]{}, new String[]{}, false, 1, new String[][]{{"org.apache.commons.math3.linear.OpenMapRealVector", "equals", "java.lang.Object", "<s:a>"}}), new String[][]{{"next", "", "6"}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.math3.linear.RealVector$Entry", actual.getClass().getName());
  assertEquals("{getIndex=0, getValue=1.0}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getDimension=3, getL1Norm=Infinity, getLInfNorm=Infinity, getMaxIndex=1, getMaxValue=Infinity, getMinIndex=2, getMinValue=-Infinity, getNorm=Infinity, getSparsity=1.0, isInfinite=true, isNaN=false}", SearchInputFactory_scaffolding.receiverState());
 }
}
