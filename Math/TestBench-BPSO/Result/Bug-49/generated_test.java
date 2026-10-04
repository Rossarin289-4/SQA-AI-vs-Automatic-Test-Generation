package generated.algorithm;

import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;
import static org.junit.Assert.*;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class BinaryParticleSwarmGeneratedTest {
 @Test(timeout = 20000)
 public void generatedInput000() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math.linear.OpenMapRealVector", "org.apache.commons.math.linear.OpenMapRealVector", "ebeMultiply", new String[]{"double[]"}, new String[]{"<sample:4>"}, false, 0, new String[][]{{"org.apache.commons.math.linear.OpenMapRealVector", "add", "org.apache.commons.math.linear.RealVector", "<sample:6>"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("org.apache.commons.math.exception.DimensionMismatchException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput001() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math.linear.OpenMapRealVector", "org.apache.commons.math.linear.OpenMapRealVector", "iterator", new String[]{}, new String[]{}, false, 1, new String[][]{{"org.apache.commons.math.linear.OpenMapRealVector", "append", "org.apache.commons.math.linear.OpenMapRealVector", "<sample:9>"}}, 3), new String[][]{{"remove", "", "5"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("org.apache.commons.math.exception.MathUnsupportedOperationException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput002() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math.linear.OpenMapRealVector", "org.apache.commons.math.linear.OpenMapRealVector", "dotProduct", new String[]{"double[]"}, new String[]{"<sample:1>"}, false, 7, new String[][]{{"org.apache.commons.math.linear.OpenMapRealVector", "subtract", "org.apache.commons.math.linear.OpenMapRealVector", "<sample:4>"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("org.apache.commons.math.exception.DimensionMismatchException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput003() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.linear.OpenMapRealVector", "org.apache.commons.math.linear.OpenMapRealVector", "getL1Distance", new String[]{"double[]"}, new String[]{"<sample:11>"}, false, 4, new String[][]{}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("Infinity", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getData=[-1.0, -1.0, -1.0], getDimension=3, getL1Norm=3.0, getLInfNorm=1.0, getMaxIndex=2, getMaxValue=-1.0, getMinIndex=2, getMinValue=-1.0, getNorm=1.7320508075688772, getSparsity=1.0, isInfinite=f...#218#-325937176", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput004() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.linear.OpenMapRealVector", "org.apache.commons.math.linear.OpenMapRealVector", "dotProduct", new String[]{"org.apache.commons.math.linear.RealVector"}, new String[]{"<sample:4>"}, false, 5, new String[][]{{"org.apache.commons.math.linear.OpenMapRealVector", "unitize", ""}, {"org.apache.commons.math.linear.OpenMapRealVector", "add", "org.apache.commons.math.linear.OpenMapRealVector", "<sample:0>"}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("0.0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getData=[], getDimension=0, getL1Norm=0.0, getLInfNorm=0.0, getMaxIndex=-1, getMaxValue=NaN, getMinIndex=-1, getMinValue=NaN, getNorm=0.0, getSparsity=NaN, isInfinite=false, isNaN=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput005() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.linear.OpenMapRealVector", "org.apache.commons.math.linear.OpenMapRealVector", "projection", new String[]{"double[]"}, new String[]{"<sample:3>"}, false, 2, new String[][]{});
  assertNotNull(actual);
  assertEquals("org.apache.commons.math.linear.OpenMapRealVector", actual.getClass().getName());
  assertEquals("{getData=[NaN], getDimension=1, getL1Norm=NaN, getLInfNorm=NaN, getMaxIndex=-1, getMaxValue=NaN, getMinIndex=-1, getMinValue=NaN, getNorm=NaN, getSparsity=1.0, isInfinite=false, isNaN=true}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getData=[0.0], getDimension=1, getL1Norm=0.0, getLInfNorm=0.0, getMaxIndex=0, getMaxValue=0.0, getMinIndex=0, getMinValue=0.0, getNorm=0.0, getSparsity=0.0, isInfinite=false, isNaN=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput006() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math.linear.OpenMapRealVector", "org.apache.commons.math.linear.OpenMapRealVector", "sparseIterator", new String[]{}, new String[]{}, false, 4, new String[][]{}, 2), new String[][]{{"remove", "", "3"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.UnsupportedOperationException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput007() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.linear.OpenMapRealVector", "org.apache.commons.math.linear.OpenMapRealVector", "getLInfDistance", new String[]{"double[]"}, new String[]{"<sample:14>"}, false, 4, new String[][]{{"org.apache.commons.math.linear.OpenMapRealVector", "outerProduct", "double[]", "<sample:0>"}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("Infinity", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getData=[-1.0, -1.0, -1.0], getDimension=3, getL1Norm=3.0, getLInfNorm=1.0, getMaxIndex=2, getMaxValue=-1.0, getMinIndex=2, getMinValue=-1.0, getNorm=1.7320508075688772, getSparsity=1.0, isInfinite=f...#218#-325937176", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput008() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math.linear.OpenMapRealVector", "org.apache.commons.math.linear.OpenMapRealVector", "getL1Distance", new String[]{"double[]"}, new String[]{"<sample:11>"}, false, 0, new String[][]{{"org.apache.commons.math.linear.OpenMapRealVector", "subtract", "org.apache.commons.math.linear.RealVector", "<sample:6>"}, {"org.apache.commons.math.linear.OpenMapRealVector", "getLInfDistance", "org.apache.commons.math.linear.RealVector", "<sample:6>"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("org.apache.commons.math.exception.DimensionMismatchException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput009() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.linear.OpenMapRealVector", "org.apache.commons.math.linear.OpenMapRealVector", "getSparsity", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.math.linear.OpenMapRealVector", "add", "org.apache.commons.math.linear.OpenMapRealVector", "<sample:15>"}});
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("NaN", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getData=[], getDimension=0, getL1Norm=0.0, getLInfNorm=0.0, getMaxIndex=-1, getMaxValue=NaN, getMinIndex=-1, getMinValue=NaN, getNorm=0.0, getSparsity=NaN, isInfinite=false, isNaN=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput010() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math.linear.OpenMapRealVector", "org.apache.commons.math.linear.OpenMapRealVector", "subtract", new String[]{"double[]"}, new String[]{"<sample:0>"}, false, 2, new String[][]{{"org.apache.commons.math.linear.OpenMapRealVector", "add", "org.apache.commons.math.linear.OpenMapRealVector", "<sample:4>"}}), new String[][]{{"dotProduct", "org.apache.commons.math.linear.OpenMapRealVector", "0"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("org.apache.commons.math.exception.DimensionMismatchException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput011() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math.linear.OpenMapRealVector", "org.apache.commons.math.linear.OpenMapRealVector", "subtract", new String[]{"org.apache.commons.math.linear.OpenMapRealVector"}, new String[]{"<sample:19>"}, false, 1, new String[][]{{"org.apache.commons.math.linear.OpenMapRealVector", "getDistance", "org.apache.commons.math.linear.OpenMapRealVector", "<sample:1>"}, {"org.apache.commons.math.linear.OpenMapRealVector", "setSubVector", "int,org.apache.commons.math.linear.RealVector", "-2147483648", "<sample:7>"}}), new String[][]{{"getDistance", "double[]", "5"}, {"mapSubtractToSelf", "double", "6"}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.math.linear.OpenMapRealVector", actual.getClass().getName());
  assertEquals("{getData=[3.0, Infinity, -Infinity], getDimension=3, getL1Norm=Infinity, getLInfNorm=Infinity, getMaxIndex=1, getMaxValue=Infinity, getMinIndex=2, getMinValue=-Infinity, getNorm=Infinity, getSparsity=...#234#472745629", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getData=[1.0, Infinity, -Infinity], getDimension=3, getL1Norm=Infinity, getLInfNorm=Infinity, getMaxIndex=1, getMaxValue=Infinity, getMinIndex=2, getMinValue=-Infinity, getNorm=Infinity, getSparsity=...#234#-614213921", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput012() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.linear.OpenMapRealVector", "org.apache.commons.math.linear.OpenMapRealVector", "getDistance", new String[]{"org.apache.commons.math.linear.RealVector"}, new String[]{"<sample:4>"}, false, 0, new String[][]{{"org.apache.commons.math.linear.OpenMapRealVector", "mapAdd", "double", "-1.7976931348623157E308"}, {"org.apache.commons.math.linear.OpenMapRealVector", "combine", "double,double,org.apache.commons.math.linear.RealVector", "-0.0", "4.3861113477903534E18", "<sample:6>"}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("0.0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getData=[], getDimension=0, getL1Norm=0.0, getLInfNorm=0.0, getMaxIndex=-1, getMaxValue=NaN, getMinIndex=-1, getMinValue=NaN, getNorm=0.0, getSparsity=NaN, isInfinite=false, isNaN=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput013() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math.linear.OpenMapRealVector", "org.apache.commons.math.linear.OpenMapRealVector", "ebeMultiply", new String[]{"org.apache.commons.math.linear.RealVector"}, new String[]{"<sample:2>"}, false), new String[][]{{"getSparsity", "", "5"}, {"getL1Distance", "org.apache.commons.math.linear.RealVector", "6"}});
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("0.0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getData=[], getDimension=0, getL1Norm=0.0, getLInfNorm=0.0, getMaxIndex=-1, getMaxValue=NaN, getMinIndex=-1, getMinValue=NaN, getNorm=0.0, getSparsity=NaN, isInfinite=false, isNaN=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput014() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math.linear.OpenMapRealVector", "org.apache.commons.math.linear.OpenMapRealVector", "projection", new String[]{"double[]"}, new String[]{"<empty>"}, false, 5, new String[][]{}, 3), new String[][]{{"getNorm", "", "6"}, {"append", "org.apache.commons.math.linear.OpenMapRealVector", "4"}, {"add", "org.apache.commons.math.linear.OpenMapRealVector", "7"}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.math.linear.OpenMapRealVector", actual.getClass().getName());
  assertEquals("{getData=[Infinity, -Infinity, -1.0], getDimension=3, getL1Norm=Infinity, getLInfNorm=Infinity, getMaxIndex=0, getMaxValue=Infinity, getMinIndex=1, getMinValue=-Infinity, getNorm=Infinity, getSparsity...#235#861267002", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getData=[], getDimension=0, getL1Norm=0.0, getLInfNorm=0.0, getMaxIndex=-1, getMaxValue=NaN, getMinIndex=-1, getMinValue=NaN, getNorm=0.0, getSparsity=NaN, isInfinite=false, isNaN=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput015() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.linear.OpenMapRealVector", "org.apache.commons.math.linear.OpenMapRealVector", "getDistance", new String[]{"org.apache.commons.math.linear.OpenMapRealVector"}, new String[]{"<sample:10>"}, false, 3, new String[][]{{"org.apache.commons.math.linear.OpenMapRealVector", "getDistance", "double[]", "<sample:4>"}, {"org.apache.commons.math.linear.OpenMapRealVector", "toArray", ""}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("Infinity", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getData=[-Infinity, -1.0], getDimension=2, getL1Norm=Infinity, getLInfNorm=Infinity, getMaxIndex=1, getMaxValue=-1.0, getMinIndex=0, getMinValue=-Infinity, getNorm=Infinity, getSparsity=1.0, isInfini...#221#-774438889", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput016() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math.linear.OpenMapRealVector", "org.apache.commons.math.linear.OpenMapRealVector", "ebeMultiply", new String[]{"double[]"}, new String[]{"<sample:2>"}, false, 4, new String[][]{{"org.apache.commons.math.linear.OpenMapRealVector", "append", "double", "NaN"}}), new String[][]{{"setSubVector", "int,double[]", "3"}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.math.linear.OpenMapRealVector", actual.getClass().getName());
  assertEquals("{getData=[-1.0, -Infinity, -1.0], getDimension=3, getL1Norm=Infinity, getLInfNorm=Infinity, getMaxIndex=2, getMaxValue=-1.0, getMinIndex=1, getMinValue=-Infinity, getNorm=Infinity, getSparsity=1.0, is...#227#381315068", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getData=[-1.0, -1.0, -1.0], getDimension=3, getL1Norm=3.0, getLInfNorm=1.0, getMaxIndex=2, getMaxValue=-1.0, getMinIndex=2, getMinValue=-1.0, getNorm=1.7320508075688772, getSparsity=1.0, isInfinite=f...#218#-325937176", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput017() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math.linear.OpenMapRealVector", "org.apache.commons.math.linear.OpenMapRealVector", "subtract", new String[]{"double[]"}, new String[]{"<sample:14>"}, false, 4, new String[][]{{"org.apache.commons.math.linear.OpenMapRealVector", "getLInfDistance", "double[]", "<sample:11>"}, {"org.apache.commons.math.linear.OpenMapRealVector", "add", "org.apache.commons.math.linear.OpenMapRealVector", "<sample:0>"}}), new String[][]{{"outerProduct", "double[]", "2"}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.math.linear.OpenMapRealMatrix", actual.getClass().getName());
  assertEquals("OpenMapRealMatrix{{Infinity,Infinity,-Infinity},{0.0,0.0,0.0},{-1.0,-Infinity,Infinity}} {getColumnDimension=3, getData=[[Infinity, Infinity, -Infinity], [0.0, 0.0, 0.0], [-1.0, -I.., getFrobeniusNorm...#281#1112416552", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getData=[-1.0, -1.0, -1.0], getDimension=3, getL1Norm=3.0, getLInfNorm=1.0, getMaxIndex=2, getMaxValue=-1.0, getMinIndex=2, getMinValue=-1.0, getNorm=1.7320508075688772, getSparsity=1.0, isInfinite=f...#218#-325937176", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput018() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math.linear.OpenMapRealVector", "org.apache.commons.math.linear.OpenMapRealVector", "ebeMultiply", new String[]{"org.apache.commons.math.linear.RealVector"}, new String[]{"<sample:11>"}, false, 6, new String[][]{}), new String[][]{{"getDistance", "org.apache.commons.math.linear.RealVector", "7"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("org.apache.commons.math.exception.DimensionMismatchException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput019() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math.linear.OpenMapRealVector", "org.apache.commons.math.linear.OpenMapRealVector", "ebeDivide", new String[]{"org.apache.commons.math.linear.RealVector"}, new String[]{"<sample:11>"}, false, 6, new String[][]{}), new String[][]{{"append", "double[]", "0"}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.math.linear.OpenMapRealVector", actual.getClass().getName());
  assertEquals("{getData=[-Infinity, Infinity, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0], getDimension=9, getL1Norm=Infinity, getLInfNorm=Infinity, getMaxIndex=1, getMaxValue=Infinity, getMinIndex=0, getMinValue=-Infinity, ...#279#1739832383", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getData=[Infinity, -Infinity, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0], getDimension=8, getL1Norm=Infinity, getLInfNorm=Infinity, getMaxIndex=0, getMaxValue=Infinity, getMinIndex=1, getMinValue=-Infinity, getNo...#260#-518583913", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput020() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.linear.OpenMapRealVector", "org.apache.commons.math.linear.OpenMapRealVector", "hashCode", new String[]{}, new String[]{}, false, 3, new String[][]{{"org.apache.commons.math.linear.OpenMapRealVector", "set", "double", "-1.400000000002"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("23089787", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getData=[-1.400000000002, -1.400000000002], getDimension=2, getL1Norm=2.800000000004, getLInfNorm=1.400000000002, getMaxIndex=1, getMaxValue=-1.400000000002, getMinIndex=1, getMinValue=-1.40000000000...#278#1656415721", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput021() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.linear.OpenMapRealVector", "org.apache.commons.math.linear.OpenMapRealVector", "mapSubtract", new String[]{"double"}, new String[]{"1.7976931348623155E307"}, false, 4, new String[][]{{"org.apache.commons.math.linear.OpenMapRealVector", "ebeDivide", "double[]", "<sample:8>"}, {"org.apache.commons.math.linear.OpenMapRealVector", "projection", "double[]", "<sample:2>"}}, 1);
  assertNotNull(actual);
  assertEquals("org.apache.commons.math.linear.OpenMapRealVector", actual.getClass().getName());
  assertEquals("{getData=[-1.7976931348623155E307, -1.7976931348623155E307, -1.797693.., getDimension=3, getL1Norm=5.393079404586947E307, getLInfNorm=1.7976931348623155E307, getMaxIndex=2, getMaxValue=-1.797693134862...#327#663046149", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getData=[-1.0, -1.0, -1.0], getDimension=3, getL1Norm=3.0, getLInfNorm=1.0, getMaxIndex=2, getMaxValue=-1.0, getMinIndex=2, getMinValue=-1.0, getNorm=1.7320508075688772, getSparsity=1.0, isInfinite=f...#218#-325937176", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput022() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math.linear.OpenMapRealVector", "org.apache.commons.math.linear.OpenMapRealVector", "unitVector", new String[]{}, new String[]{}, false, 3, new String[][]{{"org.apache.commons.math.linear.OpenMapRealVector", "isDefaultValue", "double", "4.3861113477903539E18"}}), new String[][]{{"getL1Distance", "org.apache.commons.math.linear.OpenMapRealVector", "1"}, {"mapSubtractToSelf", "double", "3"}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.math.linear.OpenMapRealVector", actual.getClass().getName());
  assertEquals("{getData=[NaN, -1.0], getDimension=2, getL1Norm=NaN, getLInfNorm=NaN, getMaxIndex=1, getMaxValue=-1.0, getMinIndex=1, getMinValue=-1.0, getNorm=NaN, getSparsity=1.0, isInfinite=false, isNaN=true}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getData=[-Infinity, -1.0], getDimension=2, getL1Norm=Infinity, getLInfNorm=Infinity, getMaxIndex=1, getMaxValue=-1.0, getMinIndex=0, getMinValue=-Infinity, getNorm=Infinity, getSparsity=1.0, isInfini...#221#-774438889", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput023() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.linear.OpenMapRealVector", "org.apache.commons.math.linear.OpenMapRealVector", "setSubVector", new String[]{"int", "org.apache.commons.math.linear.RealVector"}, new String[]{"0", "<sample:3>"}, false, 4, new String[][]{{"org.apache.commons.math.linear.OpenMapRealVector", "mapMultiplyToSelf", "double", "-0.5"}, {"org.apache.commons.math.linear.OpenMapRealVector", "cosine", "double[]", "<sample:2>"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getData=[Infinity, 0.5, 0.5], getDimension=3, getL1Norm=Infinity, getLInfNorm=Infinity, getMaxIndex=0, getMaxValue=Infinity, getMinIndex=2, getMinValue=0.5, getNorm=Infinity, getSparsity=1.0, isInfin...#222#1582998550", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput024() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.linear.OpenMapRealVector", "org.apache.commons.math.linear.OpenMapRealVector", "getSubVector", new String[]{"int", "int"}, new String[]{"1", "1"}, false, 4, new String[][]{{"org.apache.commons.math.linear.OpenMapRealVector", "equals", "java.lang.Object", "<s:kex3>"}, {"org.apache.commons.math.linear.OpenMapRealVector", "append", "org.apache.commons.math.linear.RealVector", "<sample:7>"}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.math.linear.OpenMapRealVector", actual.getClass().getName());
  assertEquals("{getData=[-1.0], getDimension=1, getL1Norm=1.0, getLInfNorm=1.0, getMaxIndex=0, getMaxValue=-1.0, getMinIndex=0, getMinValue=-1.0, getNorm=1.0, getSparsity=1.0, isInfinite=false, isNaN=false}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getData=[-1.0, -1.0, -1.0], getDimension=3, getL1Norm=3.0, getLInfNorm=1.0, getMaxIndex=2, getMaxValue=-1.0, getMinIndex=2, getMinValue=-1.0, getNorm=1.7320508075688772, getSparsity=1.0, isInfinite=f...#218#-325937176", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput025() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.linear.OpenMapRealVector", "org.apache.commons.math.linear.OpenMapRealVector", "getLInfNorm", new String[]{}, new String[]{}, false, 0, null, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("0.0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getData=[], getDimension=0, getL1Norm=0.0, getLInfNorm=0.0, getMaxIndex=-1, getMaxValue=NaN, getMinIndex=-1, getMinValue=NaN, getNorm=0.0, getSparsity=NaN, isInfinite=false, isNaN=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput026() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math.linear.OpenMapRealVector", "org.apache.commons.math.linear.OpenMapRealVector", "getL1Distance", new String[]{"org.apache.commons.math.linear.RealVector"}, new String[]{"<sample:0>"}, false, 4, new String[][]{{"org.apache.commons.math.linear.OpenMapRealVector", "append", "org.apache.commons.math.linear.OpenMapRealVector", "<sample:4>"}}, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("org.apache.commons.math.exception.DimensionMismatchException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput027() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math.linear.OpenMapRealVector", "org.apache.commons.math.linear.OpenMapRealVector", "ebeDivide", new String[]{"org.apache.commons.math.linear.RealVector"}, new String[]{"<sample:7>"}, false, 0, null, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("org.apache.commons.math.exception.DimensionMismatchException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput028() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math.linear.OpenMapRealVector", "org.apache.commons.math.linear.OpenMapRealVector", "getLInfDistance", new String[]{"double[]"}, new String[]{"<sample:0>"}, false, 7, new String[][]{{"org.apache.commons.math.linear.OpenMapRealVector", "getDimension", ""}}, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("org.apache.commons.math.exception.DimensionMismatchException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput029() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.linear.OpenMapRealVector", "org.apache.commons.math.linear.OpenMapRealVector", "isDefaultValue", new String[]{"double"}, new String[]{"-1.0"}, false, 0, null, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getData=[], getDimension=0, getL1Norm=0.0, getLInfNorm=0.0, getMaxIndex=-1, getMaxValue=NaN, getMinIndex=-1, getMinValue=NaN, getNorm=0.0, getSparsity=NaN, isInfinite=false, isNaN=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput030() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math.linear.OpenMapRealVector", "org.apache.commons.math.linear.OpenMapRealVector", "subtract", new String[]{"org.apache.commons.math.linear.OpenMapRealVector"}, new String[]{"<sample:7>"}, false, 0, new String[][]{{"org.apache.commons.math.linear.OpenMapRealVector", "mapMultiplyToSelf", "double", "0.5"}}, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("org.apache.commons.math.exception.DimensionMismatchException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput031() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.linear.OpenMapRealVector", "org.apache.commons.math.linear.OpenMapRealVector", "getDistance", new String[]{"org.apache.commons.math.linear.OpenMapRealVector"}, new String[]{"<sample:5>"}, false, 0, new String[][]{{"org.apache.commons.math.linear.OpenMapRealVector", "projection", "org.apache.commons.math.linear.RealVector", "<sample:3>"}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("0.0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getData=[], getDimension=0, getL1Norm=0.0, getLInfNorm=0.0, getMaxIndex=-1, getMaxValue=NaN, getMinIndex=-1, getMinValue=NaN, getNorm=0.0, getSparsity=NaN, isInfinite=false, isNaN=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput032() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.linear.OpenMapRealVector", "org.apache.commons.math.linear.OpenMapRealVector", "getL1Norm", new String[]{}, new String[]{}, false, 4, new String[][]{}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("3.0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getData=[-1.0, -1.0, -1.0], getDimension=3, getL1Norm=3.0, getLInfNorm=1.0, getMaxIndex=2, getMaxValue=-1.0, getMinIndex=2, getMinValue=-1.0, getNorm=1.7320508075688772, getSparsity=1.0, isInfinite=f...#218#-325937176", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput033() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math.linear.OpenMapRealVector", "org.apache.commons.math.linear.OpenMapRealVector", "dotProduct", new String[]{"double[]"}, new String[]{"<sample:3>"}, false, 0, null, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("org.apache.commons.math.exception.DimensionMismatchException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput034() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.linear.OpenMapRealVector", "org.apache.commons.math.linear.OpenMapRealVector", "getMaxIndex", new String[]{}, new String[]{}, false, 6, new String[][]{{"org.apache.commons.math.linear.OpenMapRealVector", "ebeMultiply", "org.apache.commons.math.linear.RealVector", "<sample:4>"}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getData=[Infinity, -Infinity, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0], getDimension=8, getL1Norm=Infinity, getLInfNorm=Infinity, getMaxIndex=0, getMaxValue=Infinity, getMinIndex=1, getMinValue=-Infinity, getNo...#260#-518583913", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput035() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.linear.OpenMapRealVector", "org.apache.commons.math.linear.OpenMapRealVector", "getL1Distance", new String[]{"org.apache.commons.math.linear.OpenMapRealVector"}, new String[]{"<sample:1>"}, false, 7, new String[][]{}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("Infinity", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getData=[Infinity, -Infinity, 0.0], getDimension=3, getL1Norm=Infinity, getLInfNorm=Infinity, getMaxIndex=0, getMaxValue=Infinity, getMinIndex=1, getMinValue=-Infinity, getNorm=Infinity, getSparsity=...#249#903803555", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput036() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.linear.OpenMapRealVector", "org.apache.commons.math.linear.OpenMapRealVector", "getLInfNorm", new String[]{}, new String[]{}, false, 3, new String[][]{}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("Infinity", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getData=[-Infinity, -1.0], getDimension=2, getL1Norm=Infinity, getLInfNorm=Infinity, getMaxIndex=1, getMaxValue=-1.0, getMinIndex=0, getMinValue=-Infinity, getNorm=Infinity, getSparsity=1.0, isInfini...#221#-774438889", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput037() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.linear.OpenMapRealVector", "org.apache.commons.math.linear.OpenMapRealVector", "mapSubtractToSelf", new String[]{"double"}, new String[]{"-8.772222695580706E19"}, false, 0, new String[][]{{"org.apache.commons.math.linear.OpenMapRealVector", "mapMultiply", "double", "-9.999999999999998E-13"}, {"org.apache.commons.math.linear.OpenMapRealVector", "combineToSelf", "double,double,org.apache.commons.math.linear.RealVector", "4.3861113477903534E18", "-1.0", "<sample:3>"}}, 3);
  assertNotNull(actual);
  assertEquals("org.apache.commons.math.linear.OpenMapRealVector", actual.getClass().getName());
  assertEquals("{getData=[], getDimension=0, getL1Norm=0.0, getLInfNorm=0.0, getMaxIndex=-1, getMaxValue=NaN, getMinIndex=-1, getMinValue=NaN, getNorm=0.0, getSparsity=NaN, isInfinite=false, isNaN=false}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getData=[], getDimension=0, getL1Norm=0.0, getLInfNorm=0.0, getMaxIndex=-1, getMaxValue=NaN, getMinIndex=-1, getMinValue=NaN, getNorm=0.0, getSparsity=NaN, isInfinite=false, isNaN=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput038() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.linear.OpenMapRealVector", "org.apache.commons.math.linear.OpenMapRealVector", "outerProduct", new String[]{"double[]"}, new String[]{"<sample:8>"}, false, 4, new String[][]{{"org.apache.commons.math.linear.OpenMapRealVector", "getSubVector", "int,int", "1", "2147483647"}}, 1);
  assertNotNull(actual);
  assertEquals("org.apache.commons.math.linear.OpenMapRealMatrix", actual.getClass().getName());
  assertEquals("OpenMapRealMatrix{{-Infinity,Infinity,1.0},{-Infinity,Infinity,1.0},{-Infinity,Infinity,1.0}} {getColumnDimension=3, getData=[[-Infinity, Infinity, 1.0], [-Infinity, Infinity, 1.0], [-I.., getFrobeniu...#281#-204517282", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getData=[-1.0, -1.0, -1.0], getDimension=3, getL1Norm=3.0, getLInfNorm=1.0, getMaxIndex=2, getMaxValue=-1.0, getMinIndex=2, getMinValue=-1.0, getNorm=1.7320508075688772, getSparsity=1.0, isInfinite=f...#218#-325937176", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput039() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math.linear.OpenMapRealVector", "org.apache.commons.math.linear.OpenMapRealVector", "cosine", new String[]{"org.apache.commons.math.linear.RealVector"}, new String[]{"<sample:2>"}, false, 0, null, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("org.apache.commons.math.exception.MathArithmeticException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput040() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math.linear.OpenMapRealVector", "org.apache.commons.math.linear.OpenMapRealVector", "dotProduct", new String[]{"org.apache.commons.math.linear.OpenMapRealVector"}, new String[]{"<sample:8>"}, false, 1, new String[][]{{"org.apache.commons.math.linear.OpenMapRealVector", "combine", "double,double,org.apache.commons.math.linear.RealVector", "-1.7976931348623156E306", "45.340000000002", "<sample:0>"}}, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("org.apache.commons.math.exception.DimensionMismatchException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput041() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.linear.OpenMapRealVector", "org.apache.commons.math.linear.OpenMapRealVector", "equals", new String[]{"java.lang.Object"}, new String[]{"<sample:1>"}, false, 0, new String[][]{{"org.apache.commons.math.linear.OpenMapRealVector", "setSubVector", "int,double[]", "2147483647", "<sample:3>"}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getData=[], getDimension=0, getL1Norm=0.0, getLInfNorm=0.0, getMaxIndex=-1, getMaxValue=NaN, getMinIndex=-1, getMinValue=NaN, getNorm=0.0, getSparsity=NaN, isInfinite=false, isNaN=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput042() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math.linear.OpenMapRealVector", "org.apache.commons.math.linear.OpenMapRealVector", "combine", new String[]{"double", "double", "org.apache.commons.math.linear.RealVector"}, new String[]{"4.386111347790353E19", "-Infinity", "<sample:7>"}, false, 4, new String[][]{}, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("org.apache.commons.math.exception.DimensionMismatchException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput043() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math.linear.OpenMapRealVector", "org.apache.commons.math.linear.OpenMapRealVector", "combineToSelf", new String[]{"double", "double", "double[]"}, new String[]{"1.0000000000000002E-12", "0.9999999999999999", "<sample:0>"}, false, 7, new String[][]{{"org.apache.commons.math.linear.OpenMapRealVector", "append", "org.apache.commons.math.linear.OpenMapRealVector", "<sample:4>"}}, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("org.apache.commons.math.exception.DimensionMismatchException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput044() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.linear.OpenMapRealVector", "org.apache.commons.math.linear.OpenMapRealVector", "getData", new String[]{}, new String[]{}, false, 4, new String[][]{}, 3);
  assertNotNull(actual);
  assertEquals("[D", actual.getClass().getName());
  assertEquals("[-1.0, -1.0, -1.0]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getData=[-1.0, -1.0, -1.0], getDimension=3, getL1Norm=3.0, getLInfNorm=1.0, getMaxIndex=2, getMaxValue=-1.0, getMinIndex=2, getMinValue=-1.0, getNorm=1.7320508075688772, getSparsity=1.0, isInfinite=f...#218#-325937176", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput045() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.linear.OpenMapRealVector", "org.apache.commons.math.linear.OpenMapRealVector", "append", new String[]{"org.apache.commons.math.linear.RealVector"}, new String[]{"<sample:6>"}, false, 0, new String[][]{{"org.apache.commons.math.linear.OpenMapRealVector", "projection", "double[]", "<sample:6>"}}, 1);
  assertNotNull(actual);
  assertEquals("org.apache.commons.math.linear.OpenMapRealVector", actual.getClass().getName());
  assertEquals("{getData=[], getDimension=0, getL1Norm=0.0, getLInfNorm=0.0, getMaxIndex=-1, getMaxValue=NaN, getMinIndex=-1, getMinValue=NaN, getNorm=0.0, getSparsity=NaN, isInfinite=false, isNaN=false}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getData=[], getDimension=0, getL1Norm=0.0, getLInfNorm=0.0, getMaxIndex=-1, getMaxValue=NaN, getMinIndex=-1, getMinValue=NaN, getNorm=0.0, getSparsity=NaN, isInfinite=false, isNaN=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput046() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.linear.OpenMapRealVector", "org.apache.commons.math.linear.OpenMapRealVector", "getData", new String[]{}, new String[]{}, false, 1, new String[][]{{"org.apache.commons.math.linear.OpenMapRealVector", "getLInfDistance", "double[]", "<empty>"}}, 2);
  assertNotNull(actual);
  assertEquals("[D", actual.getClass().getName());
  assertEquals("[1.0, Infinity, -Infinity]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getData=[1.0, Infinity, -Infinity], getDimension=3, getL1Norm=Infinity, getLInfNorm=Infinity, getMaxIndex=1, getMaxValue=Infinity, getMinIndex=2, getMinValue=-Infinity, getNorm=Infinity, getSparsity=...#234#-614213921", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput047() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math.linear.OpenMapRealVector", "org.apache.commons.math.linear.OpenMapRealVector", "map", new String[]{"org.apache.commons.math.analysis.UnivariateRealFunction"}, new String[]{"<sample:7>"}, false, 6, new String[][]{{"org.apache.commons.math.linear.OpenMapRealVector", "add", "org.apache.commons.math.linear.OpenMapRealVector", "<sample:4>"}}, 1), new String[][]{{"getMinIndex", "", "3"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("7", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getData=[Infinity, -Infinity, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0], getDimension=8, getL1Norm=Infinity, getLInfNorm=Infinity, getMaxIndex=0, getMaxValue=Infinity, getMinIndex=1, getMinValue=-Infinity, getNo...#260#-518583913", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput048() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math.linear.OpenMapRealVector", "org.apache.commons.math.linear.OpenMapRealVector", "getSubVector", new String[]{"int", "int"}, new String[]{"1", "2147483647"}, false, 0, new String[][]{{"org.apache.commons.math.linear.OpenMapRealVector", "ebeDivide", "org.apache.commons.math.linear.RealVector", "<sample:0>"}}, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("org.apache.commons.math.exception.OutOfRangeException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput049() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.linear.OpenMapRealVector", "org.apache.commons.math.linear.OpenMapRealVector", "getSparsity", new String[]{}, new String[]{}, false, 5, new String[][]{{"org.apache.commons.math.linear.OpenMapRealVector", "dotProduct", "double[]", "<sample:5>"}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("NaN", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getData=[], getDimension=0, getL1Norm=0.0, getLInfNorm=0.0, getMaxIndex=-1, getMaxValue=NaN, getMinIndex=-1, getMinValue=NaN, getNorm=0.0, getSparsity=NaN, isInfinite=false, isNaN=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput050() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.linear.OpenMapRealVector", "org.apache.commons.math.linear.OpenMapRealVector", "getL1Distance", new String[]{"org.apache.commons.math.linear.OpenMapRealVector"}, new String[]{"<sample:1>"}, false, 4, new String[][]{}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("Infinity", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getData=[-1.0, -1.0, -1.0], getDimension=3, getL1Norm=3.0, getLInfNorm=1.0, getMaxIndex=2, getMaxValue=-1.0, getMinIndex=2, getMinValue=-1.0, getNorm=1.7320508075688772, getSparsity=1.0, isInfinite=f...#218#-325937176", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput051() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math.linear.OpenMapRealVector", "org.apache.commons.math.linear.OpenMapRealVector", "outerProduct", new String[]{"double[]"}, new String[]{"<sample:2>"}, false, 4, new String[][]{}, 1), new String[][]{{"setRowMatrix", "int,org.apache.commons.math.linear.RealMatrix", "6"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("org.apache.commons.math.exception.OutOfRangeException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput052() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math.linear.OpenMapRealVector", "org.apache.commons.math.linear.OpenMapRealVector", "mapAdd", new String[]{"double"}, new String[]{"1.0000000000000002E-12"}, false, 0, null, 3), new String[][]{{"map", "org.apache.commons.math.analysis.UnivariateRealFunction", "2"}, {"dotProduct", "org.apache.commons.math.linear.RealVector", "7"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("org.apache.commons.math.exception.DimensionMismatchException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput053() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math.linear.OpenMapRealVector", "org.apache.commons.math.linear.OpenMapRealVector", "ebeDivide", new String[]{"double[]"}, new String[]{"<null>"}, false, 4, new String[][]{{"org.apache.commons.math.linear.OpenMapRealVector", "getL1Distance", "double[]", "<empty>"}}, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput054() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math.linear.OpenMapRealVector", "org.apache.commons.math.linear.OpenMapRealVector", "dotProduct", new String[]{"double[]"}, new String[]{"<sample:6>"}, false, 0, new String[][]{{"org.apache.commons.math.linear.OpenMapRealVector", "combine", "double,double,double[]", "63.0000000000005", "1.0", "<empty>"}, {"org.apache.commons.math.linear.OpenMapRealVector", "unitize", ""}}, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("org.apache.commons.math.exception.DimensionMismatchException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput055() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.linear.OpenMapRealVector", "org.apache.commons.math.linear.OpenMapRealVector", "hashCode", new String[]{}, new String[]{}, false, 1, new String[][]{}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("-1694978236", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getData=[1.0, Infinity, -Infinity], getDimension=3, getL1Norm=Infinity, getLInfNorm=Infinity, getMaxIndex=1, getMaxValue=Infinity, getMinIndex=2, getMinValue=-Infinity, getNorm=Infinity, getSparsity=...#234#-614213921", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput056() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math.linear.OpenMapRealVector", "org.apache.commons.math.linear.OpenMapRealVector", "dotProduct", new String[]{"double[]"}, new String[]{"<null>"}, false, 0, new String[][]{{"org.apache.commons.math.linear.OpenMapRealVector", "ebeDivide", "org.apache.commons.math.linear.RealVector", "<sample:6>"}}, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("org.apache.commons.math.exception.NullArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput057() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math.linear.OpenMapRealVector", "org.apache.commons.math.linear.OpenMapRealVector", "subtract", new String[]{"org.apache.commons.math.linear.RealVector"}, new String[]{"<sample:5>"}, false, 0, new String[][]{{"org.apache.commons.math.linear.OpenMapRealVector", "dotProduct", "org.apache.commons.math.linear.RealVector", "<sample:7>"}, {"org.apache.commons.math.linear.OpenMapRealVector", "combine", "double,double,double[]", "NaN", "-0.0", "<empty>"}}, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("org.apache.commons.math.exception.DimensionMismatchException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput058() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math.linear.OpenMapRealVector", "org.apache.commons.math.linear.OpenMapRealVector", "add", new String[]{"double[]"}, new String[]{"<sample:1>"}, false, 5, new String[][]{{"org.apache.commons.math.linear.OpenMapRealVector", "setSubVector", "int,double[]", "-62", "<sample:4>"}, {"org.apache.commons.math.linear.OpenMapRealVector", "iterator", ""}}, 2), new String[][]{{"getSubVector", "int,int", "1"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("org.apache.commons.math.exception.OutOfRangeException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput059() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.linear.OpenMapRealVector", "org.apache.commons.math.linear.OpenMapRealVector", "add", new String[]{"org.apache.commons.math.linear.OpenMapRealVector"}, new String[]{"<sample:4>"}, false, 4, new String[][]{{"org.apache.commons.math.linear.OpenMapRealVector", "combine", "double,double,org.apache.commons.math.linear.RealVector", "-0.5", "-Infinity", "<sample:8>"}, {"org.apache.commons.math.linear.OpenMapRealVector", "getData", ""}}, 1);
  assertNotNull(actual);
  assertEquals("org.apache.commons.math.linear.OpenMapRealVector", actual.getClass().getName());
  assertEquals("{getData=[-2.0, -2.0, -2.0], getDimension=3, getL1Norm=6.0, getLInfNorm=2.0, getMaxIndex=2, getMaxValue=-2.0, getMinIndex=2, getMinValue=-2.0, getNorm=3.4641016151377544, getSparsity=1.0, isInfinite=f...#218#-894398275", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getData=[-1.0, -1.0, -1.0], getDimension=3, getL1Norm=3.0, getLInfNorm=1.0, getMaxIndex=2, getMaxValue=-1.0, getMinIndex=2, getMinValue=-1.0, getNorm=1.7320508075688772, getSparsity=1.0, isInfinite=f...#218#-325937176", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput060() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math.linear.OpenMapRealVector", "org.apache.commons.math.linear.OpenMapRealVector", "checkVectorDimensions", new String[]{"int"}, new String[]{"2147483647"}, false, 3, new String[][]{{"org.apache.commons.math.linear.OpenMapRealVector", "outerProduct", "org.apache.commons.math.linear.RealVector", "<sample:2>"}}, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("org.apache.commons.math.exception.DimensionMismatchException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput061() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math.linear.OpenMapRealVector", "org.apache.commons.math.linear.OpenMapRealVector", "ebeMultiply", new String[]{"double[]"}, new String[]{"<sample:8>"}, false, 6, new String[][]{{"org.apache.commons.math.linear.OpenMapRealVector", "getMaxIndex", ""}}, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("org.apache.commons.math.exception.DimensionMismatchException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput062() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.linear.OpenMapRealVector", "org.apache.commons.math.linear.OpenMapRealVector", "mapAdd", new String[]{"double"}, new String[]{"2.1930556738951767E18"}, false, 1, new String[][]{}, 1);
  assertNotNull(actual);
  assertEquals("org.apache.commons.math.linear.OpenMapRealVector", actual.getClass().getName());
  assertEquals("{getData=[2.1930556738951767E18, Infinity, -Infinity], getDimension=3, getL1Norm=Infinity, getLInfNorm=Infinity, getMaxIndex=1, getMaxValue=Infinity, getMinIndex=2, getMinValue=-Infinity, getNorm=Infi...#252#408002576", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getData=[1.0, Infinity, -Infinity], getDimension=3, getL1Norm=Infinity, getLInfNorm=Infinity, getMaxIndex=1, getMaxValue=Infinity, getMinIndex=2, getMinValue=-Infinity, getNorm=Infinity, getSparsity=...#234#-614213921", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput063() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math.linear.OpenMapRealVector", "org.apache.commons.math.linear.OpenMapRealVector", "add", new String[]{"org.apache.commons.math.linear.OpenMapRealVector"}, new String[]{"<sample:3>"}, false, 7, new String[][]{}, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("org.apache.commons.math.exception.DimensionMismatchException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput064() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math.linear.OpenMapRealVector", "org.apache.commons.math.linear.OpenMapRealVector", "cosine", new String[]{"double[]"}, new String[]{"<sample:11>"}, false, 4, new String[][]{{"org.apache.commons.math.linear.OpenMapRealVector", "mapToSelf", "org.apache.commons.math.analysis.UnivariateRealFunction", "<sample:7>"}}, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("org.apache.commons.math.exception.MathArithmeticException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput065() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.linear.OpenMapRealVector", "org.apache.commons.math.linear.OpenMapRealVector", "isDefaultValue", new String[]{"double"}, new String[]{"1.7976931348623155E307"}, false, 0, new String[][]{{"org.apache.commons.math.linear.OpenMapRealVector", "getLInfDistance", "double[]", "<sample:4>"}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getData=[], getDimension=0, getL1Norm=0.0, getLInfNorm=0.0, getMaxIndex=-1, getMaxValue=NaN, getMinIndex=-1, getMinValue=NaN, getNorm=0.0, getSparsity=NaN, isInfinite=false, isNaN=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput066() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.linear.OpenMapRealVector", "org.apache.commons.math.linear.OpenMapRealVector", "append", new String[]{"double[]"}, new String[]{"<sample:2>"}, false, 0, new String[][]{{"org.apache.commons.math.linear.OpenMapRealVector", "combineToSelf", "double,double,org.apache.commons.math.linear.RealVector", "4.3861113477903539E18", "-Infinity", "<sample:10>"}}, 3);
  assertNotNull(actual);
  assertEquals("org.apache.commons.math.linear.OpenMapRealVector", actual.getClass().getName());
  assertEquals("{getData=[1.0, Infinity, -Infinity], getDimension=3, getL1Norm=Infinity, getLInfNorm=Infinity, getMaxIndex=1, getMaxValue=Infinity, getMinIndex=2, getMinValue=-Infinity, getNorm=Infinity, getSparsity=...#234#-614213921", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getData=[], getDimension=0, getL1Norm=0.0, getLInfNorm=0.0, getMaxIndex=-1, getMaxValue=NaN, getMinIndex=-1, getMinValue=NaN, getNorm=0.0, getSparsity=NaN, isInfinite=false, isNaN=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput067() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math.linear.OpenMapRealVector", "org.apache.commons.math.linear.OpenMapRealVector", "cosine", new String[]{"double[]"}, new String[]{"<null>"}, false, 6, new String[][]{{"org.apache.commons.math.linear.OpenMapRealVector", "equals", "java.lang.Object", "<i:-12>"}}, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("org.apache.commons.math.exception.NullArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput068() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.linear.OpenMapRealVector", "org.apache.commons.math.linear.OpenMapRealVector", "append", new String[]{"org.apache.commons.math.linear.RealVector"}, new String[]{"<sample:3>"}, false, 5, new String[][]{{"org.apache.commons.math.linear.OpenMapRealVector", "getL1Distance", "double[]", "<sample:0>"}}, 3);
  assertNotNull(actual);
  assertEquals("org.apache.commons.math.linear.OpenMapRealVector", actual.getClass().getName());
  assertEquals("{getData=[Infinity], getDimension=1, getL1Norm=Infinity, getLInfNorm=Infinity, getMaxIndex=0, getMaxValue=Infinity, getMinIndex=0, getMinValue=Infinity, getNorm=Infinity, getSparsity=1.0, isInfinite=t...#217#-1471686217", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getData=[], getDimension=0, getL1Norm=0.0, getLInfNorm=0.0, getMaxIndex=-1, getMaxValue=NaN, getMinIndex=-1, getMinValue=NaN, getNorm=0.0, getSparsity=NaN, isInfinite=false, isNaN=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput069() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.linear.OpenMapRealVector", "org.apache.commons.math.linear.OpenMapRealVector", "getData", new String[]{}, new String[]{}, false, 4, new String[][]{{"org.apache.commons.math.linear.OpenMapRealVector", "projection", "double[]", "<sample:6>"}, {"org.apache.commons.math.linear.OpenMapRealVector", "getDistance", "org.apache.commons.math.linear.OpenMapRealVector", "<sample:9>"}}, 2);
  assertNotNull(actual);
  assertEquals("[D", actual.getClass().getName());
  assertEquals("[-1.0, -1.0, -1.0]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getData=[-1.0, -1.0, -1.0], getDimension=3, getL1Norm=3.0, getLInfNorm=1.0, getMaxIndex=2, getMaxValue=-1.0, getMinIndex=2, getMinValue=-1.0, getNorm=1.7320508075688772, getSparsity=1.0, isInfinite=f...#218#-325937176", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput070() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.linear.OpenMapRealVector", "org.apache.commons.math.linear.OpenMapRealVector", "getData", new String[]{}, new String[]{}, false, 6, new String[][]{}, 1);
  assertNotNull(actual);
  assertEquals("[D", actual.getClass().getName());
  assertEquals("[Infinity, -Infinity, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getData=[Infinity, -Infinity, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0], getDimension=8, getL1Norm=Infinity, getLInfNorm=Infinity, getMaxIndex=0, getMaxValue=Infinity, getMinIndex=1, getMinValue=-Infinity, getNo...#260#-518583913", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput071() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.linear.OpenMapRealVector", "org.apache.commons.math.linear.OpenMapRealVector", "map", new String[]{"org.apache.commons.math.analysis.UnivariateRealFunction"}, new String[]{"<sample:5>"}, false, 5, new String[][]{}, 3);
  assertNotNull(actual);
  assertEquals("org.apache.commons.math.linear.OpenMapRealVector", actual.getClass().getName());
  assertEquals("{getData=[], getDimension=0, getL1Norm=0.0, getLInfNorm=0.0, getMaxIndex=-1, getMaxValue=NaN, getMinIndex=-1, getMinValue=NaN, getNorm=0.0, getSparsity=NaN, isInfinite=false, isNaN=false}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getData=[], getDimension=0, getL1Norm=0.0, getLInfNorm=0.0, getMaxIndex=-1, getMaxValue=NaN, getMinIndex=-1, getMinValue=NaN, getNorm=0.0, getSparsity=NaN, isInfinite=false, isNaN=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput072() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math.linear.OpenMapRealVector", "org.apache.commons.math.linear.OpenMapRealVector", "subtract", new String[]{"org.apache.commons.math.linear.RealVector"}, new String[]{"<sample:2>"}, false, 0, new String[][]{{"org.apache.commons.math.linear.OpenMapRealVector", "getDimension", ""}}, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("org.apache.commons.math.exception.DimensionMismatchException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput073() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.linear.OpenMapRealVector", "org.apache.commons.math.linear.OpenMapRealVector", "getMinValue", new String[]{}, new String[]{}, false, 5, new String[][]{{"org.apache.commons.math.linear.OpenMapRealVector", "append", "double[]", "<null>"}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("NaN", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getData=[], getDimension=0, getL1Norm=0.0, getLInfNorm=0.0, getMaxIndex=-1, getMaxValue=NaN, getMinIndex=-1, getMinValue=NaN, getNorm=0.0, getSparsity=NaN, isInfinite=false, isNaN=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput074() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.linear.OpenMapRealVector", "org.apache.commons.math.linear.OpenMapRealVector", "dotProduct", new String[]{"org.apache.commons.math.linear.OpenMapRealVector"}, new String[]{"<sample:5>"}, false, 0, null, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("0.0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getData=[], getDimension=0, getL1Norm=0.0, getLInfNorm=0.0, getMaxIndex=-1, getMaxValue=NaN, getMinIndex=-1, getMinValue=NaN, getNorm=0.0, getSparsity=NaN, isInfinite=false, isNaN=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput075() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.linear.OpenMapRealVector", "org.apache.commons.math.linear.OpenMapRealVector", "getData", new String[]{}, new String[]{}, false, 5, new String[][]{{"org.apache.commons.math.linear.OpenMapRealVector", "getL1Distance", "org.apache.commons.math.linear.OpenMapRealVector", "<sample:6>"}, {"org.apache.commons.math.linear.OpenMapRealVector", "combineToSelf", "double,double,org.apache.commons.math.linear.RealVector", "0.027000000000200003", "-0.0", "<sample:11>"}}, 3);
  assertNotNull(actual);
  assertEquals("[D", actual.getClass().getName());
  assertEquals("[]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getData=[], getDimension=0, getL1Norm=0.0, getLInfNorm=0.0, getMaxIndex=-1, getMaxValue=NaN, getMinIndex=-1, getMinValue=NaN, getNorm=0.0, getSparsity=NaN, isInfinite=false, isNaN=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput076() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math.linear.OpenMapRealVector", "org.apache.commons.math.linear.OpenMapRealVector", "checkVectorDimensions", new String[]{"org.apache.commons.math.linear.RealVector"}, new String[]{"<sample:1>"}, false, 6, new String[][]{{"org.apache.commons.math.linear.OpenMapRealVector", "add", "org.apache.commons.math.linear.RealVector", "<sample:0>"}}, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("org.apache.commons.math.exception.DimensionMismatchException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput077() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.linear.OpenMapRealVector", "org.apache.commons.math.linear.OpenMapRealVector", "subtract", new String[]{"double[]"}, new String[]{"<sample:11>"}, false, 4, new String[][]{}, 2);
  assertNotNull(actual);
  assertEquals("org.apache.commons.math.linear.OpenMapRealVector", actual.getClass().getName());
  assertEquals("{getData=[-1.0, -2.0, -Infinity], getDimension=3, getL1Norm=Infinity, getLInfNorm=Infinity, getMaxIndex=0, getMaxValue=-1.0, getMinIndex=2, getMinValue=-Infinity, getNorm=Infinity, getSparsity=1.0, is...#227#841706116", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getData=[-1.0, -1.0, -1.0], getDimension=3, getL1Norm=3.0, getLInfNorm=1.0, getMaxIndex=2, getMaxValue=-1.0, getMinIndex=2, getMinValue=-1.0, getNorm=1.7320508075688772, getSparsity=1.0, isInfinite=f...#218#-325937176", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput078() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.linear.OpenMapRealVector", "org.apache.commons.math.linear.OpenMapRealVector", "dotProduct", new String[]{"double[]"}, new String[]{"<sample:2>"}, false, 1, new String[][]{{"org.apache.commons.math.linear.OpenMapRealVector", "append", "double[]", "<sample:3>"}, {"org.apache.commons.math.linear.OpenMapRealVector", "getMinValue", ""}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("Infinity", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getData=[1.0, Infinity, -Infinity], getDimension=3, getL1Norm=Infinity, getLInfNorm=Infinity, getMaxIndex=1, getMaxValue=Infinity, getMinIndex=2, getMinValue=-Infinity, getNorm=Infinity, getSparsity=...#234#-614213921", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput079() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.linear.OpenMapRealVector", "org.apache.commons.math.linear.OpenMapRealVector", "copy", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.math.linear.OpenMapRealVector", "sparseIterator", ""}}, 1);
  assertNotNull(actual);
  assertEquals("org.apache.commons.math.linear.OpenMapRealVector", actual.getClass().getName());
  assertEquals("{getData=[], getDimension=0, getL1Norm=0.0, getLInfNorm=0.0, getMaxIndex=-1, getMaxValue=NaN, getMinIndex=-1, getMinValue=NaN, getNorm=0.0, getSparsity=NaN, isInfinite=false, isNaN=false}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getData=[], getDimension=0, getL1Norm=0.0, getLInfNorm=0.0, getMaxIndex=-1, getMaxValue=NaN, getMinIndex=-1, getMinValue=NaN, getNorm=0.0, getSparsity=NaN, isInfinite=false, isNaN=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput080() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.linear.OpenMapRealVector", "org.apache.commons.math.linear.OpenMapRealVector", "append", new String[]{"org.apache.commons.math.linear.OpenMapRealVector"}, new String[]{"<sample:5>"}, false, 1, new String[][]{}, 1);
  assertNotNull(actual);
  assertEquals("org.apache.commons.math.linear.OpenMapRealVector", actual.getClass().getName());
  assertEquals("{getData=[1.0, Infinity, -Infinity], getDimension=3, getL1Norm=Infinity, getLInfNorm=Infinity, getMaxIndex=1, getMaxValue=Infinity, getMinIndex=2, getMinValue=-Infinity, getNorm=Infinity, getSparsity=...#234#-614213921", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getData=[1.0, Infinity, -Infinity], getDimension=3, getL1Norm=Infinity, getLInfNorm=Infinity, getMaxIndex=1, getMaxValue=Infinity, getMinIndex=2, getMinValue=-Infinity, getNorm=Infinity, getSparsity=...#234#-614213921", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput081() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math.linear.OpenMapRealVector", "org.apache.commons.math.linear.OpenMapRealVector", "mapDivide", new String[]{"double"}, new String[]{"-1.7976931348623157E308"}, false, 0, null, 2), new String[][]{{"mapDivideToSelf", "double", "7"}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.math.linear.OpenMapRealVector", actual.getClass().getName());
  assertEquals("{getData=[], getDimension=0, getL1Norm=0.0, getLInfNorm=0.0, getMaxIndex=-1, getMaxValue=NaN, getMinIndex=-1, getMinValue=NaN, getNorm=0.0, getSparsity=NaN, isInfinite=false, isNaN=false}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getData=[], getDimension=0, getL1Norm=0.0, getLInfNorm=0.0, getMaxIndex=-1, getMaxValue=NaN, getMinIndex=-1, getMinValue=NaN, getNorm=0.0, getSparsity=NaN, isInfinite=false, isNaN=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput082() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.linear.OpenMapRealVector", "org.apache.commons.math.linear.OpenMapRealVector", "getLInfNorm", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.math.linear.OpenMapRealVector", "add", "org.apache.commons.math.linear.OpenMapRealVector", "<sample:2>"}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("0.0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getData=[], getDimension=0, getL1Norm=0.0, getLInfNorm=0.0, getMaxIndex=-1, getMaxValue=NaN, getMinIndex=-1, getMinValue=NaN, getNorm=0.0, getSparsity=NaN, isInfinite=false, isNaN=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput083() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math.linear.OpenMapRealVector", "org.apache.commons.math.linear.OpenMapRealVector", "copy", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.math.linear.OpenMapRealVector", "unitize", ""}}, 3), new String[][]{{"getEntry", "int", "0"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("org.apache.commons.math.exception.OutOfRangeException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput084() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.linear.OpenMapRealVector", "org.apache.commons.math.linear.OpenMapRealVector", "getData", new String[]{}, new String[]{}, false, 5, new String[][]{{"org.apache.commons.math.linear.OpenMapRealVector", "getSubVector", "int,int", "0", "-2147483648"}}, 1);
  assertNotNull(actual);
  assertEquals("[D", actual.getClass().getName());
  assertEquals("[]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getData=[], getDimension=0, getL1Norm=0.0, getLInfNorm=0.0, getMaxIndex=-1, getMaxValue=NaN, getMinIndex=-1, getMinValue=NaN, getNorm=0.0, getSparsity=NaN, isInfinite=false, isNaN=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput085() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math.linear.OpenMapRealVector", "org.apache.commons.math.linear.OpenMapRealVector", "mapAddToSelf", new String[]{"double"}, new String[]{"9.399999999999999"}, false, 4, new String[][]{}, 1), new String[][]{{"combine", "double,double,double[]", "2"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("org.apache.commons.math.exception.DimensionMismatchException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput086() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math.linear.OpenMapRealVector", "org.apache.commons.math.linear.OpenMapRealVector", "append", new String[]{"double"}, new String[]{"-2.0000000000000004E-12"}, false, 4, new String[][]{{"org.apache.commons.math.linear.OpenMapRealVector", "getLInfDistance", "org.apache.commons.math.linear.RealVector", "<sample:5>"}}, 3), new String[][]{{"getSparsity", "", "6"}});
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("1.0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getData=[-1.0, -1.0, -1.0], getDimension=3, getL1Norm=3.0, getLInfNorm=1.0, getMaxIndex=2, getMaxValue=-1.0, getMinIndex=2, getMinValue=-1.0, getNorm=1.7320508075688772, getSparsity=1.0, isInfinite=f...#218#-325937176", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput087() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.linear.OpenMapRealVector", "org.apache.commons.math.linear.OpenMapRealVector", "hashCode", new String[]{}, new String[]{}, false, 5, new String[][]{{"org.apache.commons.math.linear.OpenMapRealVector", "getDistance", "org.apache.commons.math.linear.OpenMapRealVector", "<sample:1>"}, {"org.apache.commons.math.linear.OpenMapRealVector", "ebeMultiply", "double[]", "<sample:14>"}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("-818727111", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getData=[], getDimension=0, getL1Norm=0.0, getLInfNorm=0.0, getMaxIndex=-1, getMaxValue=NaN, getMinIndex=-1, getMinValue=NaN, getNorm=0.0, getSparsity=NaN, isInfinite=false, isNaN=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput088() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math.linear.OpenMapRealVector", "org.apache.commons.math.linear.OpenMapRealVector", "dotProduct", new String[]{"org.apache.commons.math.linear.OpenMapRealVector"}, new String[]{"<sample:9>"}, false, 5, new String[][]{{"org.apache.commons.math.linear.OpenMapRealVector", "dotProduct", "org.apache.commons.math.linear.RealVector", "<sample:5>"}}, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("org.apache.commons.math.exception.DimensionMismatchException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput089() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.linear.OpenMapRealVector", "org.apache.commons.math.linear.OpenMapRealVector", "copy", new String[]{}, new String[]{}, false, 2, new String[][]{{"org.apache.commons.math.linear.OpenMapRealVector", "subtract", "org.apache.commons.math.linear.RealVector", "<sample:0>"}, {"org.apache.commons.math.linear.OpenMapRealVector", "getNorm", ""}}, 3);
  assertNotNull(actual);
  assertEquals("org.apache.commons.math.linear.OpenMapRealVector", actual.getClass().getName());
  assertEquals("{getData=[0.0], getDimension=1, getL1Norm=0.0, getLInfNorm=0.0, getMaxIndex=0, getMaxValue=0.0, getMinIndex=0, getMinValue=0.0, getNorm=0.0, getSparsity=0.0, isInfinite=false, isNaN=false}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getData=[0.0], getDimension=1, getL1Norm=0.0, getLInfNorm=0.0, getMaxIndex=0, getMaxValue=0.0, getMinIndex=0, getMinValue=0.0, getNorm=0.0, getSparsity=0.0, isInfinite=false, isNaN=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput090() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math.linear.OpenMapRealVector", "org.apache.commons.math.linear.OpenMapRealVector", "cosine", new String[]{"org.apache.commons.math.linear.RealVector"}, new String[]{"<sample:6>"}, false, 0, new String[][]{{"org.apache.commons.math.linear.OpenMapRealVector", "dotProduct", "org.apache.commons.math.linear.RealVector", "<sample:4>"}, {"org.apache.commons.math.linear.OpenMapRealVector", "mapAddToSelf", "double", "-1.7976931348623157E308"}}, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("org.apache.commons.math.exception.MathArithmeticException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput091() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.linear.OpenMapRealVector", "org.apache.commons.math.linear.OpenMapRealVector", "mapAdd", new String[]{"double"}, new String[]{"-2.0000000000000002E-11"}, false, 0, new String[][]{{"org.apache.commons.math.linear.OpenMapRealVector", "subtract", "double[]", "<sample:8>"}, {"org.apache.commons.math.linear.OpenMapRealVector", "getMinValue", ""}}, 1);
  assertNotNull(actual);
  assertEquals("org.apache.commons.math.linear.OpenMapRealVector", actual.getClass().getName());
  assertEquals("{getData=[], getDimension=0, getL1Norm=0.0, getLInfNorm=0.0, getMaxIndex=-1, getMaxValue=NaN, getMinIndex=-1, getMinValue=NaN, getNorm=0.0, getSparsity=NaN, isInfinite=false, isNaN=false}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getData=[], getDimension=0, getL1Norm=0.0, getLInfNorm=0.0, getMaxIndex=-1, getMaxValue=NaN, getMinIndex=-1, getMinValue=NaN, getNorm=0.0, getSparsity=NaN, isInfinite=false, isNaN=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput092() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math.linear.OpenMapRealVector", "org.apache.commons.math.linear.OpenMapRealVector", "mapAddToSelf", new String[]{"double"}, new String[]{"-4.25"}, false, 0, new String[][]{{"org.apache.commons.math.linear.OpenMapRealVector", "getNorm", ""}}, 1), new String[][]{{"add", "double[]", "6"}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.math.linear.ArrayRealVector", actual.getClass().getName());
  assertEquals("{0} {getData=[0.0], getDataRef=[0.0], getDimension=1, getL1Norm=0.0, getLInfNorm=0.0, getMaxIndex=0, getMaxValue=0.0, getMinIndex=0, getMinValue=0.0, getNorm=0.0, isInfinite=false, isNaN=false}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getData=[], getDimension=0, getL1Norm=0.0, getLInfNorm=0.0, getMaxIndex=-1, getMaxValue=NaN, getMinIndex=-1, getMinValue=NaN, getNorm=0.0, getSparsity=NaN, isInfinite=false, isNaN=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput093() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math.linear.OpenMapRealVector", "org.apache.commons.math.linear.OpenMapRealVector", "append", new String[]{"double[]"}, new String[]{"<sample:4>"}, false, 0, new String[][]{{"org.apache.commons.math.linear.OpenMapRealVector", "getData", ""}}, 3), new String[][]{{"mapSubtract", "double", "3"}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.math.linear.OpenMapRealVector", actual.getClass().getName());
  assertEquals("{getData=[-Infinity, -2.0], getDimension=2, getL1Norm=Infinity, getLInfNorm=Infinity, getMaxIndex=1, getMaxValue=-2.0, getMinIndex=0, getMinValue=-Infinity, getNorm=Infinity, getSparsity=1.0, isInfini...#221#-1703376359", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getData=[], getDimension=0, getL1Norm=0.0, getLInfNorm=0.0, getMaxIndex=-1, getMaxValue=NaN, getMinIndex=-1, getMinValue=NaN, getNorm=0.0, getSparsity=NaN, isInfinite=false, isNaN=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput094() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math.linear.OpenMapRealVector", "org.apache.commons.math.linear.OpenMapRealVector", "subtract", new String[]{"double[]"}, new String[]{"<sample:2>"}, false, 0, new String[][]{{"org.apache.commons.math.linear.OpenMapRealVector", "getData", ""}, {"org.apache.commons.math.linear.OpenMapRealVector", "add", "org.apache.commons.math.linear.OpenMapRealVector", "<sample:3>"}}, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("org.apache.commons.math.exception.DimensionMismatchException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput095() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math.linear.OpenMapRealVector", "org.apache.commons.math.linear.OpenMapRealVector", "getSubVector", new String[]{"int", "int"}, new String[]{"2147483647", "2147483647"}, false, 5, new String[][]{}, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("org.apache.commons.math.exception.OutOfRangeException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput096() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math.linear.OpenMapRealVector", "org.apache.commons.math.linear.OpenMapRealVector", "getLInfDistance", new String[]{"org.apache.commons.math.linear.RealVector"}, new String[]{"<null>"}, false, 0, null, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput097() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math.linear.OpenMapRealVector", "org.apache.commons.math.linear.OpenMapRealVector", "dotProduct", new String[]{"org.apache.commons.math.linear.RealVector"}, new String[]{"<sample:9>"}, false, 0, null, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("org.apache.commons.math.exception.DimensionMismatchException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput098() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math.linear.OpenMapRealVector", "org.apache.commons.math.linear.OpenMapRealVector", "combineToSelf", new String[]{"double", "double", "double[]"}, new String[]{"-10.000000000000002", "Infinity", "<sample:4>"}, false, 1, new String[][]{{"org.apache.commons.math.linear.OpenMapRealVector", "getL1Norm", ""}}, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("org.apache.commons.math.exception.DimensionMismatchException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput099() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.linear.OpenMapRealVector", "org.apache.commons.math.linear.OpenMapRealVector", "sparseIterator", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.math.linear.OpenMapRealVector", "mapSubtractToSelf", "double", "4.3861113477903534E18"}, {"org.apache.commons.math.linear.OpenMapRealVector", "hashCode", ""}}, 1);
  assertNotNull(actual);
  assertEquals("org.apache.commons.math.linear.OpenMapRealVector$OpenMapSparseIterator", actual.getClass().getName());
  assertEquals("{hasNext=false}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getData=[], getDimension=0, getL1Norm=0.0, getLInfNorm=0.0, getMaxIndex=-1, getMaxValue=NaN, getMinIndex=-1, getMinValue=NaN, getNorm=0.0, getSparsity=NaN, isInfinite=false, isNaN=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput100() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math.linear.OpenMapRealVector", "org.apache.commons.math.linear.OpenMapRealVector", "checkVectorDimensions", new String[]{"org.apache.commons.math.linear.RealVector"}, new String[]{"<sample:5>"}, false, 0, new String[][]{{"org.apache.commons.math.linear.OpenMapRealVector", "isDefaultValue", "double", "1.7976931348623157E308"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("org.apache.commons.math.exception.DimensionMismatchException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput101() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.linear.OpenMapRealVector", "org.apache.commons.math.linear.OpenMapRealVector", "getMinValue", new String[]{}, new String[]{}, false);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("NaN", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getData=[], getDimension=0, getL1Norm=0.0, getLInfNorm=0.0, getMaxIndex=-1, getMaxValue=NaN, getMinIndex=-1, getMinValue=NaN, getNorm=0.0, getSparsity=NaN, isInfinite=false, isNaN=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput102() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.linear.OpenMapRealVector", "org.apache.commons.math.linear.OpenMapRealVector", "checkVectorDimensions", new String[]{"org.apache.commons.math.linear.RealVector"}, new String[]{"<sample:2>"}, false, 0, new String[][]{{"org.apache.commons.math.linear.OpenMapRealVector", "sparseIterator", ""}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getData=[], getDimension=0, getL1Norm=0.0, getLInfNorm=0.0, getMaxIndex=-1, getMaxValue=NaN, getMinIndex=-1, getMinValue=NaN, getNorm=0.0, getSparsity=NaN, isInfinite=false, isNaN=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput103() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math.linear.OpenMapRealVector", "org.apache.commons.math.linear.OpenMapRealVector", "ebeDivide", new String[]{"double[]"}, new String[]{"<sample:1>"}, false, 0, new String[][]{{"org.apache.commons.math.linear.OpenMapRealVector", "getDistance", "double[]", "<sample:8>"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("org.apache.commons.math.exception.DimensionMismatchException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput104() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math.linear.OpenMapRealVector", "org.apache.commons.math.linear.OpenMapRealVector", "getL1Distance", new String[]{"double[]"}, new String[]{"<sample:2>"}, false, 2, new String[][]{{"org.apache.commons.math.linear.OpenMapRealVector", "combineToSelf", "double,double,double[]", "1.0000000000000002E-12", "NaN", "<empty>"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("org.apache.commons.math.exception.DimensionMismatchException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput105() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math.linear.OpenMapRealVector", "org.apache.commons.math.linear.OpenMapRealVector", "combine", new String[]{"double", "double", "org.apache.commons.math.linear.RealVector"}, new String[]{"-0.0", "8772222695580707260", "<sample:3>"}, false, 4, new String[][]{{"org.apache.commons.math.linear.OpenMapRealVector", "hashCode", ""}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("org.apache.commons.math.exception.DimensionMismatchException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput106() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.linear.OpenMapRealVector", "org.apache.commons.math.linear.OpenMapRealVector", "getL1Norm", new String[]{}, new String[]{}, false, 3, new String[][]{{"org.apache.commons.math.linear.OpenMapRealVector", "getLInfDistance", "org.apache.commons.math.linear.RealVector", "<sample:0>"}, {"org.apache.commons.math.linear.OpenMapRealVector", "ebeMultiply", "double[]", "<sample:0>"}});
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("Infinity", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getData=[-Infinity, -1.0], getDimension=2, getL1Norm=Infinity, getLInfNorm=Infinity, getMaxIndex=1, getMaxValue=-1.0, getMinIndex=0, getMinValue=-Infinity, getNorm=Infinity, getSparsity=1.0, isInfini...#221#-774438889", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput107() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.linear.OpenMapRealVector", "org.apache.commons.math.linear.OpenMapRealVector", "getDimension", new String[]{}, new String[]{}, false, 1, new String[][]{{"org.apache.commons.math.linear.OpenMapRealVector", "unitize", ""}, {"org.apache.commons.math.linear.OpenMapRealVector", "mapDivideToSelf", "double", "NaN"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("3", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getData=[NaN, NaN, NaN], getDimension=3, getL1Norm=NaN, getLInfNorm=NaN, getMaxIndex=-1, getMaxValue=NaN, getMinIndex=-1, getMinValue=NaN, getNorm=NaN, getSparsity=1.0, isInfinite=false, isNaN=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput108() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.linear.OpenMapRealVector", "org.apache.commons.math.linear.OpenMapRealVector", "getSparsity", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.math.linear.OpenMapRealVector", "mapSubtract", "double", "-1.7976931348623155E307"}});
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("NaN", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getData=[], getDimension=0, getL1Norm=0.0, getLInfNorm=0.0, getMaxIndex=-1, getMaxValue=NaN, getMinIndex=-1, getMinValue=NaN, getNorm=0.0, getSparsity=NaN, isInfinite=false, isNaN=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput109() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math.linear.OpenMapRealVector", "org.apache.commons.math.linear.OpenMapRealVector", "ebeMultiply", new String[]{"double[]"}, new String[]{"<sample:2>"}, false); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("org.apache.commons.math.exception.DimensionMismatchException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput110() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.linear.OpenMapRealVector", "org.apache.commons.math.linear.OpenMapRealVector", "mapAdd", new String[]{"double"}, new String[]{"NaN"}, false, 0, new String[][]{{"org.apache.commons.math.linear.OpenMapRealVector", "getL1Distance", "org.apache.commons.math.linear.RealVector", "<sample:6>"}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.math.linear.OpenMapRealVector", actual.getClass().getName());
  assertEquals("{getData=[], getDimension=0, getL1Norm=0.0, getLInfNorm=0.0, getMaxIndex=-1, getMaxValue=NaN, getMinIndex=-1, getMinValue=NaN, getNorm=0.0, getSparsity=NaN, isInfinite=false, isNaN=false}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getData=[], getDimension=0, getL1Norm=0.0, getLInfNorm=0.0, getMaxIndex=-1, getMaxValue=NaN, getMinIndex=-1, getMinValue=NaN, getNorm=0.0, getSparsity=NaN, isInfinite=false, isNaN=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput111() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.linear.OpenMapRealVector", "org.apache.commons.math.linear.OpenMapRealVector", "checkVectorDimensions", new String[]{"org.apache.commons.math.linear.RealVector"}, new String[]{"<sample:5>"}, false, 3, new String[][]{});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getData=[-Infinity, -1.0], getDimension=2, getL1Norm=Infinity, getLInfNorm=Infinity, getMaxIndex=1, getMaxValue=-1.0, getMinIndex=0, getMinValue=-Infinity, getNorm=Infinity, getSparsity=1.0, isInfini...#221#-774438889", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput112() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math.linear.OpenMapRealVector", "org.apache.commons.math.linear.OpenMapRealVector", "getDistance", new String[]{"double[]"}, new String[]{"<sample:2>"}, false, 6, new String[][]{}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("org.apache.commons.math.exception.DimensionMismatchException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput113() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math.linear.OpenMapRealVector", "org.apache.commons.math.linear.OpenMapRealVector", "getSubVector", new String[]{"int", "int"}, new String[]{"2147483647", "2147483647"}, false, 0, new String[][]{{"org.apache.commons.math.linear.OpenMapRealVector", "iterator", ""}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("org.apache.commons.math.exception.OutOfRangeException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput114() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math.linear.OpenMapRealVector", "org.apache.commons.math.linear.OpenMapRealVector", "getLInfDistance", new String[]{"org.apache.commons.math.linear.RealVector"}, new String[]{"<sample:5>"}, false, 3, new String[][]{}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("org.apache.commons.math.exception.DimensionMismatchException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput115() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.linear.OpenMapRealVector", "org.apache.commons.math.linear.OpenMapRealVector", "getL1Distance", new String[]{"org.apache.commons.math.linear.OpenMapRealVector"}, new String[]{"<sample:7>"}, false, 0, new String[][]{{"org.apache.commons.math.linear.OpenMapRealVector", "cosine", "org.apache.commons.math.linear.RealVector", "<sample:7>"}, {"org.apache.commons.math.linear.OpenMapRealVector", "getDistance", "double[]", "<sample:0>"}});
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("Infinity", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getData=[], getDimension=0, getL1Norm=0.0, getLInfNorm=0.0, getMaxIndex=-1, getMaxValue=NaN, getMinIndex=-1, getMinValue=NaN, getNorm=0.0, getSparsity=NaN, isInfinite=false, isNaN=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput116() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.linear.OpenMapRealVector", "org.apache.commons.math.linear.OpenMapRealVector", "getMinValue", new String[]{}, new String[]{}, false, 1, new String[][]{{"org.apache.commons.math.linear.OpenMapRealVector", "add", "org.apache.commons.math.linear.RealVector", "<sample:5>"}});
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("-Infinity", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getData=[1.0, Infinity, -Infinity], getDimension=3, getL1Norm=Infinity, getLInfNorm=Infinity, getMaxIndex=1, getMaxValue=Infinity, getMinIndex=2, getMinValue=-Infinity, getNorm=Infinity, getSparsity=...#234#-614213921", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput117() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.linear.OpenMapRealVector", "org.apache.commons.math.linear.OpenMapRealVector", "copy", new String[]{}, new String[]{}, false);
  assertNotNull(actual);
  assertEquals("org.apache.commons.math.linear.OpenMapRealVector", actual.getClass().getName());
  assertEquals("{getData=[], getDimension=0, getL1Norm=0.0, getLInfNorm=0.0, getMaxIndex=-1, getMaxValue=NaN, getMinIndex=-1, getMinValue=NaN, getNorm=0.0, getSparsity=NaN, isInfinite=false, isNaN=false}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getData=[], getDimension=0, getL1Norm=0.0, getLInfNorm=0.0, getMaxIndex=-1, getMaxValue=NaN, getMinIndex=-1, getMinValue=NaN, getNorm=0.0, getSparsity=NaN, isInfinite=false, isNaN=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput118() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.linear.OpenMapRealVector", "org.apache.commons.math.linear.OpenMapRealVector", "iterator", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.math.linear.OpenMapRealVector", "outerProduct", "org.apache.commons.math.linear.RealVector", "<sample:7>"}, {"org.apache.commons.math.linear.OpenMapRealVector", "getLInfNorm", ""}});
  assertNotNull(actual);
  assertEquals("receiver state after the call", "{getData=[], getDimension=0, getL1Norm=0.0, getLInfNorm=0.0, getMaxIndex=-1, getMaxValue=NaN, getMinIndex=-1, getMinValue=NaN, getNorm=0.0, getSparsity=NaN, isInfinite=false, isNaN=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput119() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.linear.OpenMapRealVector", "org.apache.commons.math.linear.OpenMapRealVector", "getL1Norm", new String[]{}, new String[]{}, false);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("0.0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getData=[], getDimension=0, getL1Norm=0.0, getLInfNorm=0.0, getMaxIndex=-1, getMaxValue=NaN, getMinIndex=-1, getMinValue=NaN, getNorm=0.0, getSparsity=NaN, isInfinite=false, isNaN=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput120() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math.linear.OpenMapRealVector", "org.apache.commons.math.linear.OpenMapRealVector", "add", new String[]{"org.apache.commons.math.linear.OpenMapRealVector"}, new String[]{"<sample:4>"}, false, 0, new String[][]{{"org.apache.commons.math.linear.OpenMapRealVector", "getL1Distance", "org.apache.commons.math.linear.OpenMapRealVector", "<sample:1>"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("org.apache.commons.math.exception.DimensionMismatchException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput121() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.linear.OpenMapRealVector", "org.apache.commons.math.linear.OpenMapRealVector", "getData", new String[]{}, new String[]{}, false, 4, new String[][]{});
  assertNotNull(actual);
  assertEquals("[D", actual.getClass().getName());
  assertEquals("[-1.0, -1.0, -1.0]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getData=[-1.0, -1.0, -1.0], getDimension=3, getL1Norm=3.0, getLInfNorm=1.0, getMaxIndex=2, getMaxValue=-1.0, getMinIndex=2, getMinValue=-1.0, getNorm=1.7320508075688772, getSparsity=1.0, isInfinite=f...#218#-325937176", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput122() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.linear.OpenMapRealVector", "org.apache.commons.math.linear.OpenMapRealVector", "dotProduct", new String[]{"double[]"}, new String[]{"<empty>"}, false);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("0.0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getData=[], getDimension=0, getL1Norm=0.0, getLInfNorm=0.0, getMaxIndex=-1, getMaxValue=NaN, getMinIndex=-1, getMinValue=NaN, getNorm=0.0, getSparsity=NaN, isInfinite=false, isNaN=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput123() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math.linear.OpenMapRealVector", "org.apache.commons.math.linear.OpenMapRealVector", "getLInfDistance", new String[]{"double[]"}, new String[]{"<sample:8>"}, false, 0, new String[][]{{"org.apache.commons.math.linear.OpenMapRealVector", "dotProduct", "org.apache.commons.math.linear.RealVector", "<sample:2>"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("org.apache.commons.math.exception.DimensionMismatchException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput124() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.linear.OpenMapRealVector", "org.apache.commons.math.linear.OpenMapRealVector", "isDefaultValue", new String[]{"double"}, new String[]{"1.7976931348623155E307"}, false, 3, new String[][]{{"org.apache.commons.math.linear.OpenMapRealVector", "mapMultiply", "double", "2.0000000000000004E-12"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getData=[-Infinity, -1.0], getDimension=2, getL1Norm=Infinity, getLInfNorm=Infinity, getMaxIndex=1, getMaxValue=-1.0, getMinIndex=0, getMinValue=-Infinity, getNorm=Infinity, getSparsity=1.0, isInfini...#221#-774438889", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput125() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math.linear.OpenMapRealVector", "org.apache.commons.math.linear.OpenMapRealVector", "ebeMultiply", new String[]{"org.apache.commons.math.linear.RealVector"}, new String[]{"<sample:6>"}, false, 1, new String[][]{}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("org.apache.commons.math.exception.DimensionMismatchException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput126() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.linear.OpenMapRealVector", "org.apache.commons.math.linear.OpenMapRealVector", "getLInfNorm", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.math.linear.OpenMapRealVector", "getLInfDistance", "double[]", "<sample:1>"}, {"org.apache.commons.math.linear.OpenMapRealVector", "getMaxIndex", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("0.0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getData=[], getDimension=0, getL1Norm=0.0, getLInfNorm=0.0, getMaxIndex=-1, getMaxValue=NaN, getMinIndex=-1, getMinValue=NaN, getNorm=0.0, getSparsity=NaN, isInfinite=false, isNaN=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput127() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.linear.OpenMapRealVector", "org.apache.commons.math.linear.OpenMapRealVector", "append", new String[]{"double"}, new String[]{"0.9999999999999999"}, false, 3, new String[][]{{"org.apache.commons.math.linear.OpenMapRealVector", "isDefaultValue", "double", "-1.0"}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.math.linear.OpenMapRealVector", actual.getClass().getName());
  assertEquals("{getData=[-Infinity, -1.0, 0.9999999999999999], getDimension=3, getL1Norm=Infinity, getLInfNorm=Infinity, getMaxIndex=2, getMaxValue=0.9999999999999999, getMinIndex=0, getMinValue=-Infinity, getNorm=I...#255#-1736613439", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getData=[-Infinity, -1.0], getDimension=2, getL1Norm=Infinity, getLInfNorm=Infinity, getMaxIndex=1, getMaxValue=-1.0, getMinIndex=0, getMinValue=-Infinity, getNorm=Infinity, getSparsity=1.0, isInfini...#221#-774438889", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput128() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.linear.OpenMapRealVector", "org.apache.commons.math.linear.OpenMapRealVector", "append", new String[]{"org.apache.commons.math.linear.OpenMapRealVector"}, new String[]{"<sample:7>"}, false, 4, new String[][]{{"org.apache.commons.math.linear.OpenMapRealVector", "getLInfNorm", ""}, {"org.apache.commons.math.linear.OpenMapRealVector", "getDistance", "org.apache.commons.math.linear.RealVector", "<sample:3>"}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.math.linear.OpenMapRealVector", actual.getClass().getName());
  assertEquals("{getData=[-1.0, -1.0, -1.0, Infinity, -Infinity, 0.0], getDimension=6, getL1Norm=Infinity, getLInfNorm=Infinity, getMaxIndex=3, getMaxValue=Infinity, getMinIndex=4, getMinValue=-Infinity, getNorm=Infi...#267#-1621192484", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getData=[-1.0, -1.0, -1.0], getDimension=3, getL1Norm=3.0, getLInfNorm=1.0, getMaxIndex=2, getMaxValue=-1.0, getMinIndex=2, getMinValue=-1.0, getNorm=1.7320508075688772, getSparsity=1.0, isInfinite=f...#218#-325937176", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput129() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.linear.OpenMapRealVector", "org.apache.commons.math.linear.OpenMapRealVector", "mapAddToSelf", new String[]{"double"}, new String[]{"-2.0"}, false, 0, new String[][]{{"org.apache.commons.math.linear.OpenMapRealVector", "cosine", "double[]", "<sample:2>"}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.math.linear.OpenMapRealVector", actual.getClass().getName());
  assertEquals("{getData=[], getDimension=0, getL1Norm=0.0, getLInfNorm=0.0, getMaxIndex=-1, getMaxValue=NaN, getMinIndex=-1, getMinValue=NaN, getNorm=0.0, getSparsity=NaN, isInfinite=false, isNaN=false}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getData=[], getDimension=0, getL1Norm=0.0, getLInfNorm=0.0, getMaxIndex=-1, getMaxValue=NaN, getMinIndex=-1, getMinValue=NaN, getNorm=0.0, getSparsity=NaN, isInfinite=false, isNaN=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput130() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math.linear.OpenMapRealVector", "org.apache.commons.math.linear.OpenMapRealVector", "ebeMultiply", new String[]{"org.apache.commons.math.linear.RealVector"}, new String[]{"<null>"}, false, 3, new String[][]{}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput131() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.linear.OpenMapRealVector", "org.apache.commons.math.linear.OpenMapRealVector", "getMaxIndex", new String[]{}, new String[]{}, false, 5, new String[][]{{"org.apache.commons.math.linear.OpenMapRealVector", "add", "org.apache.commons.math.linear.OpenMapRealVector", "<sample:5>"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("-1", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getData=[], getDimension=0, getL1Norm=0.0, getLInfNorm=0.0, getMaxIndex=-1, getMaxValue=NaN, getMinIndex=-1, getMinValue=NaN, getNorm=0.0, getSparsity=NaN, isInfinite=false, isNaN=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput132() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math.linear.OpenMapRealVector", "org.apache.commons.math.linear.OpenMapRealVector", "cosine", new String[]{"org.apache.commons.math.linear.RealVector"}, new String[]{"<null>"}, false, 0, new String[][]{{"org.apache.commons.math.linear.OpenMapRealVector", "outerProduct", "double[]", "<sample:3>"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput133() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.linear.OpenMapRealVector", "org.apache.commons.math.linear.OpenMapRealVector", "iterator", new String[]{}, new String[]{}, false, 1, new String[][]{{"org.apache.commons.math.linear.OpenMapRealVector", "unitize", ""}, {"org.apache.commons.math.linear.OpenMapRealVector", "append", "org.apache.commons.math.linear.OpenMapRealVector", "<sample:4>"}});
  assertNotNull(actual);
  assertEquals("receiver state after the call", "{getData=[0.0, NaN, NaN], getDimension=3, getL1Norm=NaN, getLInfNorm=NaN, getMaxIndex=0, getMaxValue=0.0, getMinIndex=0, getMinValue=0.0, getNorm=NaN, getSparsity=1.0, isInfinite=false, isNaN=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput134() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math.linear.OpenMapRealVector", "org.apache.commons.math.linear.OpenMapRealVector", "setEntry", new String[]{"int", "double"}, new String[]{"-1", "1.0000000000000002"}, false, 1, new String[][]{}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("org.apache.commons.math.exception.OutOfRangeException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput135() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math.linear.OpenMapRealVector", "org.apache.commons.math.linear.OpenMapRealVector", "subtract", new String[]{"org.apache.commons.math.linear.RealVector"}, new String[]{"<sample:1>"}, false, 0, new String[][]{{"org.apache.commons.math.linear.OpenMapRealVector", "mapDivideToSelf", "double", "Infinity"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("org.apache.commons.math.exception.DimensionMismatchException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput136() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.linear.OpenMapRealVector", "org.apache.commons.math.linear.OpenMapRealVector", "getDistance", new String[]{"org.apache.commons.math.linear.OpenMapRealVector"}, new String[]{"<sample:4>"}, false, 0, new String[][]{{"org.apache.commons.math.linear.OpenMapRealVector", "combineToSelf", "double,double,double[]", "0.27000000000200003", "0.49999999999999994", "<sample:6>"}});
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("1.7320508075688772", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getData=[], getDimension=0, getL1Norm=0.0, getLInfNorm=0.0, getMaxIndex=-1, getMaxValue=NaN, getMinIndex=-1, getMinValue=NaN, getNorm=0.0, getSparsity=NaN, isInfinite=false, isNaN=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput137() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.linear.OpenMapRealVector", "org.apache.commons.math.linear.OpenMapRealVector", "ebeDivide", new String[]{"double[]"}, new String[]{"<sample:5>"}, false, 4, new String[][]{});
  assertNotNull(actual);
  assertEquals("org.apache.commons.math.linear.OpenMapRealVector", actual.getClass().getName());
  assertEquals("{getData=[1.0, -Infinity, -1.0], getDimension=3, getL1Norm=Infinity, getLInfNorm=Infinity, getMaxIndex=0, getMaxValue=1.0, getMinIndex=1, getMinValue=-Infinity, getNorm=Infinity, getSparsity=1.0, isIn...#225#-1428808258", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getData=[-1.0, -1.0, -1.0], getDimension=3, getL1Norm=3.0, getLInfNorm=1.0, getMaxIndex=2, getMaxValue=-1.0, getMinIndex=2, getMinValue=-1.0, getNorm=1.7320508075688772, getSparsity=1.0, isInfinite=f...#218#-325937176", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput138() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.linear.OpenMapRealVector", "org.apache.commons.math.linear.OpenMapRealVector", "toArray", new String[]{}, new String[]{}, false, 1, new String[][]{{"org.apache.commons.math.linear.OpenMapRealVector", "mapSubtractToSelf", "double", "Infinity"}});
  assertNotNull(actual);
  assertEquals("[D", actual.getClass().getName());
  assertEquals("[-Infinity, NaN, -Infinity]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getData=[-Infinity, NaN, -Infinity], getDimension=3, getL1Norm=NaN, getLInfNorm=NaN, getMaxIndex=2, getMaxValue=-Infinity, getMinIndex=2, getMinValue=-Infinity, getNorm=NaN, getSparsity=1.0, isInfini...#221#-1786280781", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput139() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math.linear.OpenMapRealVector", "org.apache.commons.math.linear.OpenMapRealVector", "getL1Distance", new String[]{"org.apache.commons.math.linear.OpenMapRealVector"}, new String[]{"<null>"}, false, 5, new String[][]{{"org.apache.commons.math.linear.OpenMapRealVector", "getLInfDistance", "double[]", "<empty>"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput140() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.linear.OpenMapRealVector", "org.apache.commons.math.linear.OpenMapRealVector", "getL1Distance", new String[]{"org.apache.commons.math.linear.OpenMapRealVector"}, new String[]{"<sample:7>"}, false, 3, new String[][]{{"org.apache.commons.math.linear.OpenMapRealVector", "getDistance", "double[]", "<sample:2>"}, {"org.apache.commons.math.linear.OpenMapRealVector", "getMinIndex", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("Infinity", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getData=[-Infinity, -1.0], getDimension=2, getL1Norm=Infinity, getLInfNorm=Infinity, getMaxIndex=1, getMaxValue=-1.0, getMinIndex=0, getMinValue=-Infinity, getNorm=Infinity, getSparsity=1.0, isInfini...#221#-774438889", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput141() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math.linear.OpenMapRealVector", "org.apache.commons.math.linear.OpenMapRealVector", "getL1Distance", new String[]{"double[]"}, new String[]{"<sample:0>"}, false, 7, new String[][]{{"org.apache.commons.math.linear.OpenMapRealVector", "map", "org.apache.commons.math.analysis.UnivariateRealFunction", "<sample:1>"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("org.apache.commons.math.exception.DimensionMismatchException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput142() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.linear.OpenMapRealVector", "org.apache.commons.math.linear.OpenMapRealVector", "isDefaultValue", new String[]{"double"}, new String[]{"-2.0"}, false, 1, new String[][]{{"org.apache.commons.math.linear.OpenMapRealVector", "subtract", "org.apache.commons.math.linear.RealVector", "<sample:0>"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getData=[1.0, Infinity, -Infinity], getDimension=3, getL1Norm=Infinity, getLInfNorm=Infinity, getMaxIndex=1, getMaxValue=Infinity, getMinIndex=2, getMinValue=-Infinity, getNorm=Infinity, getSparsity=...#234#-614213921", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput143() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.linear.OpenMapRealVector", "org.apache.commons.math.linear.OpenMapRealVector", "set", new String[]{"double"}, new String[]{"-8.7722226955807068E18"}, false);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getData=[], getDimension=0, getL1Norm=0.0, getLInfNorm=0.0, getMaxIndex=-1, getMaxValue=NaN, getMinIndex=-1, getMinValue=NaN, getNorm=0.0, getSparsity=NaN, isInfinite=false, isNaN=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput144() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math.linear.OpenMapRealVector", "org.apache.commons.math.linear.OpenMapRealVector", "append", new String[]{"org.apache.commons.math.linear.OpenMapRealVector"}, new String[]{"<sample:6>"}, false, 0, new String[][]{{"org.apache.commons.math.linear.OpenMapRealVector", "dotProduct", "org.apache.commons.math.linear.RealVector", "<sample:3>"}}), new String[][]{{"isInfinite", "", "5"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getData=[], getDimension=0, getL1Norm=0.0, getLInfNorm=0.0, getMaxIndex=-1, getMaxValue=NaN, getMinIndex=-1, getMinValue=NaN, getNorm=0.0, getSparsity=NaN, isInfinite=false, isNaN=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput145() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.linear.OpenMapRealVector", "org.apache.commons.math.linear.OpenMapRealVector", "getData", new String[]{}, new String[]{}, false);
  assertNotNull(actual);
  assertEquals("[D", actual.getClass().getName());
  assertEquals("[]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getData=[], getDimension=0, getL1Norm=0.0, getLInfNorm=0.0, getMaxIndex=-1, getMaxValue=NaN, getMinIndex=-1, getMinValue=NaN, getNorm=0.0, getSparsity=NaN, isInfinite=false, isNaN=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput146() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.linear.OpenMapRealVector", "org.apache.commons.math.linear.OpenMapRealVector", "getMinValue", new String[]{}, new String[]{}, false, 3, new String[][]{{"org.apache.commons.math.linear.OpenMapRealVector", "mapMultiplyToSelf", "double", "8.988465674311579E307"}});
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("-Infinity", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getData=[-Infinity, -8.988465674311579E307], getDimension=2, getL1Norm=Infinity, getLInfNorm=Infinity, getMaxIndex=1, getMaxValue=-8.988465674311579E307, getMinIndex=0, getMinValue=-Infinity, getNorm...#257#711623145", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput147() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.linear.OpenMapRealVector", "org.apache.commons.math.linear.OpenMapRealVector", "isNaN", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.math.linear.OpenMapRealVector", "getSparsity", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getData=[], getDimension=0, getL1Norm=0.0, getLInfNorm=0.0, getMaxIndex=-1, getMaxValue=NaN, getMinIndex=-1, getMinValue=NaN, getNorm=0.0, getSparsity=NaN, isInfinite=false, isNaN=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput148() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math.linear.OpenMapRealVector", "org.apache.commons.math.linear.OpenMapRealVector", "subtract", new String[]{"double[]"}, new String[]{"<sample:0>"}, false, 4, new String[][]{}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("org.apache.commons.math.exception.DimensionMismatchException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput149() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.linear.OpenMapRealVector", "org.apache.commons.math.linear.OpenMapRealVector", "isNaN", new String[]{}, new String[]{}, false, 1, new String[][]{{"org.apache.commons.math.linear.OpenMapRealVector", "checkVectorDimensions", "org.apache.commons.math.linear.RealVector", "<sample:3>"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getData=[1.0, Infinity, -Infinity], getDimension=3, getL1Norm=Infinity, getLInfNorm=Infinity, getMaxIndex=1, getMaxValue=Infinity, getMinIndex=2, getMinValue=-Infinity, getNorm=Infinity, getSparsity=...#234#-614213921", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput150() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math.linear.OpenMapRealVector", "org.apache.commons.math.linear.OpenMapRealVector", "add", new String[]{"org.apache.commons.math.linear.RealVector"}, new String[]{"<sample:7>"}, false, 1, new String[][]{}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("org.apache.commons.math.exception.DimensionMismatchException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput151() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math.linear.OpenMapRealVector", "org.apache.commons.math.linear.OpenMapRealVector", "mapAdd", new String[]{"double"}, new String[]{"-1.7976931348623155E307"}, false, 3, new String[][]{}), new String[][]{{"combineToSelf", "double,double,double[]", "0"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("org.apache.commons.math.exception.DimensionMismatchException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput152() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.linear.OpenMapRealVector", "org.apache.commons.math.linear.OpenMapRealVector", "ebeDivide", new String[]{"org.apache.commons.math.linear.RealVector"}, new String[]{"<sample:6>"}, false, 5, new String[][]{{"org.apache.commons.math.linear.OpenMapRealVector", "getL1Norm", ""}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.math.linear.OpenMapRealVector", actual.getClass().getName());
  assertEquals("{getData=[], getDimension=0, getL1Norm=0.0, getLInfNorm=0.0, getMaxIndex=-1, getMaxValue=NaN, getMinIndex=-1, getMinValue=NaN, getNorm=0.0, getSparsity=NaN, isInfinite=false, isNaN=false}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getData=[], getDimension=0, getL1Norm=0.0, getLInfNorm=0.0, getMaxIndex=-1, getMaxValue=NaN, getMinIndex=-1, getMinValue=NaN, getNorm=0.0, getSparsity=NaN, isInfinite=false, isNaN=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput153() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math.linear.OpenMapRealVector", "org.apache.commons.math.linear.OpenMapRealVector", "append", new String[]{"double"}, new String[]{"1.0E-12"}, false), new String[][]{{"ebeDivide", "double[]", "6"}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.math.linear.OpenMapRealVector", actual.getClass().getName());
  assertEquals("{getData=[Infinity], getDimension=1, getL1Norm=Infinity, getLInfNorm=Infinity, getMaxIndex=0, getMaxValue=Infinity, getMinIndex=0, getMinValue=Infinity, getNorm=Infinity, getSparsity=1.0, isInfinite=t...#217#-1471686217", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getData=[], getDimension=0, getL1Norm=0.0, getLInfNorm=0.0, getMaxIndex=-1, getMaxValue=NaN, getMinIndex=-1, getMinValue=NaN, getNorm=0.0, getSparsity=NaN, isInfinite=false, isNaN=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput154() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.linear.OpenMapRealVector", "org.apache.commons.math.linear.OpenMapRealVector", "dotProduct", new String[]{"org.apache.commons.math.linear.RealVector"}, new String[]{"<sample:8>"}, false);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("0.0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getData=[], getDimension=0, getL1Norm=0.0, getLInfNorm=0.0, getMaxIndex=-1, getMaxValue=NaN, getMinIndex=-1, getMinValue=NaN, getNorm=0.0, getSparsity=NaN, isInfinite=false, isNaN=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput155() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.linear.OpenMapRealVector", "org.apache.commons.math.linear.OpenMapRealVector", "sparseIterator", new String[]{}, new String[]{}, false, 7, new String[][]{});
  assertNotNull(actual);
  assertEquals("org.apache.commons.math.linear.OpenMapRealVector$OpenMapSparseIterator", actual.getClass().getName());
  assertEquals("{hasNext=true}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getData=[Infinity, -Infinity, 0.0], getDimension=3, getL1Norm=Infinity, getLInfNorm=Infinity, getMaxIndex=0, getMaxValue=Infinity, getMinIndex=1, getMinValue=-Infinity, getNorm=Infinity, getSparsity=...#249#903803555", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput156() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.linear.OpenMapRealVector", "org.apache.commons.math.linear.OpenMapRealVector", "append", new String[]{"org.apache.commons.math.linear.RealVector"}, new String[]{"<sample:8>"}, false);
  assertNotNull(actual);
  assertEquals("org.apache.commons.math.linear.OpenMapRealVector", actual.getClass().getName());
  assertEquals("{getData=[], getDimension=0, getL1Norm=0.0, getLInfNorm=0.0, getMaxIndex=-1, getMaxValue=NaN, getMinIndex=-1, getMinValue=NaN, getNorm=0.0, getSparsity=NaN, isInfinite=false, isNaN=false}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getData=[], getDimension=0, getL1Norm=0.0, getLInfNorm=0.0, getMaxIndex=-1, getMaxValue=NaN, getMinIndex=-1, getMinValue=NaN, getNorm=0.0, getSparsity=NaN, isInfinite=false, isNaN=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput157() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.linear.OpenMapRealVector", "org.apache.commons.math.linear.OpenMapRealVector", "map", new String[]{"org.apache.commons.math.analysis.UnivariateRealFunction"}, new String[]{"<sample:7>"}, false, 3, new String[][]{{"org.apache.commons.math.linear.OpenMapRealVector", "mapDivide", "double", "-Infinity"}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.math.linear.OpenMapRealVector", actual.getClass().getName());
  assertEquals("{getData=[0.0, 0.0], getDimension=2, getL1Norm=0.0, getLInfNorm=0.0, getMaxIndex=1, getMaxValue=0.0, getMinIndex=1, getMinValue=0.0, getNorm=0.0, getSparsity=1.0, isInfinite=false, isNaN=false}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getData=[-Infinity, -1.0], getDimension=2, getL1Norm=Infinity, getLInfNorm=Infinity, getMaxIndex=1, getMaxValue=-1.0, getMinIndex=0, getMinValue=-Infinity, getNorm=Infinity, getSparsity=1.0, isInfini...#221#-774438889", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput158() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.linear.OpenMapRealVector", "org.apache.commons.math.linear.OpenMapRealVector", "getDistance", new String[]{"org.apache.commons.math.linear.OpenMapRealVector"}, new String[]{"<sample:2>"}, false);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("0.0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getData=[], getDimension=0, getL1Norm=0.0, getLInfNorm=0.0, getMaxIndex=-1, getMaxValue=NaN, getMinIndex=-1, getMinValue=NaN, getNorm=0.0, getSparsity=NaN, isInfinite=false, isNaN=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput159() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.linear.OpenMapRealVector", "org.apache.commons.math.linear.OpenMapRealVector", "getL1Distance", new String[]{"org.apache.commons.math.linear.OpenMapRealVector"}, new String[]{"<sample:6>"}, false, 2, new String[][]{});
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("Infinity", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getData=[0.0], getDimension=1, getL1Norm=0.0, getLInfNorm=0.0, getMaxIndex=0, getMaxValue=0.0, getMinIndex=0, getMinValue=0.0, getNorm=0.0, getSparsity=0.0, isInfinite=false, isNaN=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput160() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.linear.OpenMapRealVector", "org.apache.commons.math.linear.OpenMapRealVector", "mapAddToSelf", new String[]{"double"}, new String[]{"1.0"}, false, 3, new String[][]{{"org.apache.commons.math.linear.OpenMapRealVector", "ebeDivide", "org.apache.commons.math.linear.RealVector", "<sample:2>"}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.math.linear.OpenMapRealVector", actual.getClass().getName());
  assertEquals("{getData=[-Infinity, 0.0], getDimension=2, getL1Norm=Infinity, getLInfNorm=Infinity, getMaxIndex=1, getMaxValue=0.0, getMinIndex=0, getMinValue=-Infinity, getNorm=Infinity, getSparsity=0.5, isInfinite...#219#-13145801", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getData=[-Infinity, 0.0], getDimension=2, getL1Norm=Infinity, getLInfNorm=Infinity, getMaxIndex=1, getMaxValue=0.0, getMinIndex=0, getMinValue=-Infinity, getNorm=Infinity, getSparsity=0.5, isInfinite...#219#-13145801", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput161() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math.linear.OpenMapRealVector", "org.apache.commons.math.linear.OpenMapRealVector", "projection", new String[]{"org.apache.commons.math.linear.RealVector"}, new String[]{"<sample:7>"}, false, 5, new String[][]{}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("org.apache.commons.math.exception.DimensionMismatchException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput162() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math.linear.OpenMapRealVector", "org.apache.commons.math.linear.OpenMapRealVector", "iterator", new String[]{}, new String[]{}, false, 1, new String[][]{{"org.apache.commons.math.linear.OpenMapRealVector", "cosine", "org.apache.commons.math.linear.RealVector", "<sample:1>"}}), new String[][]{{"remove", "", "6"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("org.apache.commons.math.exception.MathUnsupportedOperationException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput163() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.linear.OpenMapRealVector", "org.apache.commons.math.linear.OpenMapRealVector", "getMinIndex", new String[]{}, new String[]{}, false, 7, new String[][]{{"org.apache.commons.math.linear.OpenMapRealVector", "mapMultiplyToSelf", "double", "1.0E-12"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("1", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getData=[Infinity, -Infinity, 0.0], getDimension=3, getL1Norm=Infinity, getLInfNorm=Infinity, getMaxIndex=0, getMaxValue=Infinity, getMinIndex=1, getMinValue=-Infinity, getNorm=Infinity, getSparsity=...#249#903803555", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput164() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.linear.OpenMapRealVector", "org.apache.commons.math.linear.OpenMapRealVector", "getMaxIndex", new String[]{}, new String[]{}, false, 4, new String[][]{});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("2", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getData=[-1.0, -1.0, -1.0], getDimension=3, getL1Norm=3.0, getLInfNorm=1.0, getMaxIndex=2, getMaxValue=-1.0, getMinIndex=2, getMinValue=-1.0, getNorm=1.7320508075688772, getSparsity=1.0, isInfinite=f...#218#-325937176", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput165() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.linear.OpenMapRealVector", "org.apache.commons.math.linear.OpenMapRealVector", "getLInfNorm", new String[]{}, new String[]{}, false, 4, new String[][]{{"org.apache.commons.math.linear.OpenMapRealVector", "combineToSelf", "double,double,double[]", "-1.0E-12", "0.070000000002", "<sample:3>"}});
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("1.0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getData=[-1.0, -1.0, -1.0], getDimension=3, getL1Norm=3.0, getLInfNorm=1.0, getMaxIndex=2, getMaxValue=-1.0, getMinIndex=2, getMinValue=-1.0, getNorm=1.7320508075688772, getSparsity=1.0, isInfinite=f...#218#-325937176", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput166() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.linear.OpenMapRealVector", "org.apache.commons.math.linear.OpenMapRealVector", "getLInfNorm", new String[]{}, new String[]{}, false, 5, new String[][]{{"org.apache.commons.math.linear.OpenMapRealVector", "cosine", "double[]", "<sample:3>"}, {"org.apache.commons.math.linear.OpenMapRealVector", "projection", "org.apache.commons.math.linear.RealVector", "<sample:2>"}});
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("0.0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getData=[], getDimension=0, getL1Norm=0.0, getLInfNorm=0.0, getMaxIndex=-1, getMaxValue=NaN, getMinIndex=-1, getMinValue=NaN, getNorm=0.0, getSparsity=NaN, isInfinite=false, isNaN=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput167() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.linear.OpenMapRealVector", "org.apache.commons.math.linear.OpenMapRealVector", "isDefaultValue", new String[]{"double"}, new String[]{"0.27000000000200003"}, false, 5, new String[][]{{"org.apache.commons.math.linear.OpenMapRealVector", "getL1Norm", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getData=[], getDimension=0, getL1Norm=0.0, getLInfNorm=0.0, getMaxIndex=-1, getMaxValue=NaN, getMinIndex=-1, getMinValue=NaN, getNorm=0.0, getSparsity=NaN, isInfinite=false, isNaN=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput168() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.linear.OpenMapRealVector", "org.apache.commons.math.linear.OpenMapRealVector", "getMinValue", new String[]{}, new String[]{}, false, 4, new String[][]{{"org.apache.commons.math.linear.OpenMapRealVector", "unitize", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("-0.5773502691896258", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getData=[-0.5773502691896258, -0.5773502691896258, -0.57735026918962.., getDimension=3, getL1Norm=1.7320508075688776, getLInfNorm=0.5773502691896258, getMaxIndex=2, getMaxValue=-0.5773502691896258, g...#307#785339052", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput169() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math.linear.OpenMapRealVector", "org.apache.commons.math.linear.OpenMapRealVector", "getDistance", new String[]{"org.apache.commons.math.linear.RealVector"}, new String[]{"<sample:5>"}, false, 4, new String[][]{}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("org.apache.commons.math.exception.DimensionMismatchException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput170() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math.linear.OpenMapRealVector", "org.apache.commons.math.linear.OpenMapRealVector", "cosine", new String[]{"org.apache.commons.math.linear.RealVector"}, new String[]{"<sample:6>"}, false); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("org.apache.commons.math.exception.MathArithmeticException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput171() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.linear.OpenMapRealVector", "org.apache.commons.math.linear.OpenMapRealVector", "isDefaultValue", new String[]{"double"}, new String[]{"Infinity"}, false, 7, new String[][]{});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getData=[Infinity, -Infinity, 0.0], getDimension=3, getL1Norm=Infinity, getLInfNorm=Infinity, getMaxIndex=0, getMaxValue=Infinity, getMinIndex=1, getMinValue=-Infinity, getNorm=Infinity, getSparsity=...#249#903803555", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput172() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.linear.OpenMapRealVector", "org.apache.commons.math.linear.OpenMapRealVector", "getNorm", new String[]{}, new String[]{}, false);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("0.0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getData=[], getDimension=0, getL1Norm=0.0, getLInfNorm=0.0, getMaxIndex=-1, getMaxValue=NaN, getMinIndex=-1, getMinValue=NaN, getNorm=0.0, getSparsity=NaN, isInfinite=false, isNaN=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput173() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math.linear.OpenMapRealVector", "org.apache.commons.math.linear.OpenMapRealVector", "ebeDivide", new String[]{"org.apache.commons.math.linear.RealVector"}, new String[]{"<sample:1>"}, false, 5, new String[][]{}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("org.apache.commons.math.exception.DimensionMismatchException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput174() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.linear.OpenMapRealVector", "org.apache.commons.math.linear.OpenMapRealVector", "append", new String[]{"org.apache.commons.math.linear.RealVector"}, new String[]{"<sample:2>"}, false, 4, new String[][]{{"org.apache.commons.math.linear.OpenMapRealVector", "ebeDivide", "double[]", "<sample:1>"}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.math.linear.OpenMapRealVector", actual.getClass().getName());
  assertEquals("{getData=[-1.0, -1.0, -1.0, 1.0, Infinity, -Infinity], getDimension=6, getL1Norm=Infinity, getLInfNorm=Infinity, getMaxIndex=4, getMaxValue=Infinity, getMinIndex=5, getMinValue=-Infinity, getNorm=Infi...#252#1622340458", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getData=[-1.0, -1.0, -1.0], getDimension=3, getL1Norm=3.0, getLInfNorm=1.0, getMaxIndex=2, getMaxValue=-1.0, getMinIndex=2, getMinValue=-1.0, getNorm=1.7320508075688772, getSparsity=1.0, isInfinite=f...#218#-325937176", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput175() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.linear.OpenMapRealVector", "org.apache.commons.math.linear.OpenMapRealVector", "setSubVector", new String[]{"int", "double[]"}, new String[]{"0", "<sample:2>"}, false, 1, new String[][]{});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getData=[1.0, Infinity, -Infinity], getDimension=3, getL1Norm=Infinity, getLInfNorm=Infinity, getMaxIndex=1, getMaxValue=Infinity, getMinIndex=2, getMinValue=-Infinity, getNorm=Infinity, getSparsity=...#234#-614213921", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput176() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.linear.OpenMapRealVector", "org.apache.commons.math.linear.OpenMapRealVector", "mapMultiplyToSelf", new String[]{"double"}, new String[]{"-0.0"}, false, 7, new String[][]{{"org.apache.commons.math.linear.OpenMapRealVector", "isDefaultValue", "double", "4.9E-324"}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.math.linear.OpenMapRealVector", actual.getClass().getName());
  assertEquals("{getData=[NaN, NaN, 0.0], getDimension=3, getL1Norm=NaN, getLInfNorm=NaN, getMaxIndex=2, getMaxValue=0.0, getMinIndex=2, getMinValue=0.0, getNorm=NaN, getSparsity=0.6666666666666666, isInfinite=false,...#212#587238529", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getData=[NaN, NaN, 0.0], getDimension=3, getL1Norm=NaN, getLInfNorm=NaN, getMaxIndex=2, getMaxValue=0.0, getMinIndex=2, getMinValue=0.0, getNorm=NaN, getSparsity=0.6666666666666666, isInfinite=false,...#212#587238529", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput177() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.linear.OpenMapRealVector", "org.apache.commons.math.linear.OpenMapRealVector", "getL1Norm", new String[]{}, new String[]{}, false, 7, new String[][]{});
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("Infinity", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getData=[Infinity, -Infinity, 0.0], getDimension=3, getL1Norm=Infinity, getLInfNorm=Infinity, getMaxIndex=0, getMaxValue=Infinity, getMinIndex=1, getMinValue=-Infinity, getNorm=Infinity, getSparsity=...#249#903803555", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput178() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.linear.OpenMapRealVector", "org.apache.commons.math.linear.OpenMapRealVector", "getMinIndex", new String[]{}, new String[]{}, false, 1, new String[][]{{"org.apache.commons.math.linear.OpenMapRealVector", "checkIndex", "int", "255"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("2", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getData=[1.0, Infinity, -Infinity], getDimension=3, getL1Norm=Infinity, getLInfNorm=Infinity, getMaxIndex=1, getMaxValue=Infinity, getMinIndex=2, getMinValue=-Infinity, getNorm=Infinity, getSparsity=...#234#-614213921", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput179() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.linear.OpenMapRealVector", "org.apache.commons.math.linear.OpenMapRealVector", "getDistance", new String[]{"double[]"}, new String[]{"<sample:5>"}, false, 7, new String[][]{{"org.apache.commons.math.linear.OpenMapRealVector", "combine", "double,double,double[]", "0.9999999999999998", "4.3861113477903534E18", "<sample:2>"}});
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("Infinity", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getData=[Infinity, -Infinity, 0.0], getDimension=3, getL1Norm=Infinity, getLInfNorm=Infinity, getMaxIndex=0, getMaxValue=Infinity, getMinIndex=1, getMinValue=-Infinity, getNorm=Infinity, getSparsity=...#249#903803555", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput180() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.linear.OpenMapRealVector", "org.apache.commons.math.linear.OpenMapRealVector", "getMinIndex", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.math.linear.OpenMapRealVector", "cosine", "org.apache.commons.math.linear.RealVector", "<sample:5>"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("-1", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getData=[], getDimension=0, getL1Norm=0.0, getLInfNorm=0.0, getMaxIndex=-1, getMaxValue=NaN, getMinIndex=-1, getMinValue=NaN, getNorm=0.0, getSparsity=NaN, isInfinite=false, isNaN=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput181() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math.linear.OpenMapRealVector", "org.apache.commons.math.linear.OpenMapRealVector", "copy", new String[]{}, new String[]{}, false, 1, new String[][]{}), new String[][]{{"append", "org.apache.commons.math.linear.RealVector", "0"}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.math.linear.OpenMapRealVector", actual.getClass().getName());
  assertEquals("{getData=[1.0, Infinity, -Infinity], getDimension=3, getL1Norm=Infinity, getLInfNorm=Infinity, getMaxIndex=1, getMaxValue=Infinity, getMinIndex=2, getMinValue=-Infinity, getNorm=Infinity, getSparsity=...#234#-614213921", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getData=[1.0, Infinity, -Infinity], getDimension=3, getL1Norm=Infinity, getLInfNorm=Infinity, getMaxIndex=1, getMaxValue=Infinity, getMinIndex=2, getMinValue=-Infinity, getNorm=Infinity, getSparsity=...#234#-614213921", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput182() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math.linear.OpenMapRealVector", "org.apache.commons.math.linear.OpenMapRealVector", "mapAddToSelf", new String[]{"double"}, new String[]{"-0.0"}, false, 0, new String[][]{{"org.apache.commons.math.linear.OpenMapRealVector", "append", "double[]", "<sample:1>"}}), new String[][]{{"mapToSelf", "org.apache.commons.math.analysis.UnivariateRealFunction", "2"}, {"cosine", "double[]", "5"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("org.apache.commons.math.exception.MathArithmeticException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput183() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.linear.OpenMapRealVector", "org.apache.commons.math.linear.OpenMapRealVector", "append", new String[]{"org.apache.commons.math.linear.RealVector"}, new String[]{"<sample:3>"}, false, 7, new String[][]{{"org.apache.commons.math.linear.OpenMapRealVector", "getL1Distance", "org.apache.commons.math.linear.RealVector", "<sample:2>"}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.math.linear.OpenMapRealVector", actual.getClass().getName());
  assertEquals("{getData=[Infinity, -Infinity, 0.0, Infinity], getDimension=4, getL1Norm=Infinity, getLInfNorm=Infinity, getMaxIndex=3, getMaxValue=Infinity, getMinIndex=1, getMinValue=-Infinity, getNorm=Infinity, ge...#245#1490166887", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getData=[Infinity, -Infinity, 0.0], getDimension=3, getL1Norm=Infinity, getLInfNorm=Infinity, getMaxIndex=0, getMaxValue=Infinity, getMinIndex=1, getMinValue=-Infinity, getNorm=Infinity, getSparsity=...#249#903803555", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput184() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math.linear.OpenMapRealVector", "org.apache.commons.math.linear.OpenMapRealVector", "dotProduct", new String[]{"org.apache.commons.math.linear.OpenMapRealVector"}, new String[]{"<sample:2>"}, false, 7, new String[][]{{"org.apache.commons.math.linear.OpenMapRealVector", "dotProduct", "org.apache.commons.math.linear.OpenMapRealVector", "<sample:7>"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("org.apache.commons.math.exception.DimensionMismatchException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput185() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.linear.OpenMapRealVector", "org.apache.commons.math.linear.OpenMapRealVector", "mapDivideToSelf", new String[]{"double"}, new String[]{"0.9999999999999998"}, false, 7, new String[][]{{"org.apache.commons.math.linear.OpenMapRealVector", "ebeMultiply", "org.apache.commons.math.linear.RealVector", "<sample:7>"}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.math.linear.OpenMapRealVector", actual.getClass().getName());
  assertEquals("{getData=[Infinity, -Infinity, 0.0], getDimension=3, getL1Norm=Infinity, getLInfNorm=Infinity, getMaxIndex=0, getMaxValue=Infinity, getMinIndex=1, getMinValue=-Infinity, getNorm=Infinity, getSparsity=...#249#903803555", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getData=[Infinity, -Infinity, 0.0], getDimension=3, getL1Norm=Infinity, getLInfNorm=Infinity, getMaxIndex=0, getMaxValue=Infinity, getMinIndex=1, getMinValue=-Infinity, getNorm=Infinity, getSparsity=...#249#903803555", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput186() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.linear.OpenMapRealVector", "org.apache.commons.math.linear.OpenMapRealVector", "getDimension", new String[]{}, new String[]{}, false, 2, new String[][]{{"org.apache.commons.math.linear.OpenMapRealVector", "checkIndex", "int", "-1073741824"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("1", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getData=[0.0], getDimension=1, getL1Norm=0.0, getLInfNorm=0.0, getMaxIndex=0, getMaxValue=0.0, getMinIndex=0, getMinValue=0.0, getNorm=0.0, getSparsity=0.0, isInfinite=false, isNaN=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput187() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math.linear.OpenMapRealVector", "org.apache.commons.math.linear.OpenMapRealVector", "checkVectorDimensions", new String[]{"int"}, new String[]{"1"}, false, 0, new String[][]{{"org.apache.commons.math.linear.OpenMapRealVector", "set", "double", "4.999999999999999"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("org.apache.commons.math.exception.DimensionMismatchException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput188() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math.linear.OpenMapRealVector", "org.apache.commons.math.linear.OpenMapRealVector", "dotProduct", new String[]{"double[]"}, new String[]{"<sample:3>"}, false, 0, new String[][]{{"org.apache.commons.math.linear.OpenMapRealVector", "cosine", "org.apache.commons.math.linear.RealVector", "<sample:1>"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("org.apache.commons.math.exception.DimensionMismatchException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput189() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.linear.OpenMapRealVector", "org.apache.commons.math.linear.OpenMapRealVector", "getLInfNorm", new String[]{}, new String[]{}, false, 7, new String[][]{});
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("Infinity", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getData=[Infinity, -Infinity, 0.0], getDimension=3, getL1Norm=Infinity, getLInfNorm=Infinity, getMaxIndex=0, getMaxValue=Infinity, getMinIndex=1, getMinValue=-Infinity, getNorm=Infinity, getSparsity=...#249#903803555", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput190() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.linear.OpenMapRealVector", "org.apache.commons.math.linear.OpenMapRealVector", "isNaN", new String[]{}, new String[]{}, false, 7, new String[][]{});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getData=[Infinity, -Infinity, 0.0], getDimension=3, getL1Norm=Infinity, getLInfNorm=Infinity, getMaxIndex=0, getMaxValue=Infinity, getMinIndex=1, getMinValue=-Infinity, getNorm=Infinity, getSparsity=...#249#903803555", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput191() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math.linear.OpenMapRealVector", "org.apache.commons.math.linear.OpenMapRealVector", "combine", new String[]{"double", "double", "double[]"}, new String[]{"-0.02", "0.4999999999999999", "<sample:0>"}, false, 5, new String[][]{{"org.apache.commons.math.linear.OpenMapRealVector", "append", "org.apache.commons.math.linear.RealVector", "<sample:3>"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("org.apache.commons.math.exception.DimensionMismatchException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput192() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.linear.OpenMapRealVector", "org.apache.commons.math.linear.OpenMapRealVector", "setSubVector", new String[]{"int", "org.apache.commons.math.linear.RealVector"}, new String[]{"0", "<sample:3>"}, false, 7, new String[][]{{"org.apache.commons.math.linear.OpenMapRealVector", "getData", ""}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getData=[Infinity, -Infinity, 0.0], getDimension=3, getL1Norm=Infinity, getLInfNorm=Infinity, getMaxIndex=0, getMaxValue=Infinity, getMinIndex=1, getMinValue=-Infinity, getNorm=Infinity, getSparsity=...#249#903803555", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput193() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.linear.OpenMapRealVector", "org.apache.commons.math.linear.OpenMapRealVector", "getMaxIndex", new String[]{}, new String[]{}, false, 1, new String[][]{});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("1", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getData=[1.0, Infinity, -Infinity], getDimension=3, getL1Norm=Infinity, getLInfNorm=Infinity, getMaxIndex=1, getMaxValue=Infinity, getMinIndex=2, getMinValue=-Infinity, getNorm=Infinity, getSparsity=...#234#-614213921", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput194() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math.linear.OpenMapRealVector", "org.apache.commons.math.linear.OpenMapRealVector", "combine", new String[]{"double", "double", "double[]"}, new String[]{"0.49999999999999994", "1.0", "<sample:1>"}, false, 4, new String[][]{{"org.apache.commons.math.linear.OpenMapRealVector", "set", "double", "-2.0000000000000004E-12"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("org.apache.commons.math.exception.DimensionMismatchException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput195() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math.linear.OpenMapRealVector", "org.apache.commons.math.linear.OpenMapRealVector", "append", new String[]{"org.apache.commons.math.linear.RealVector"}, new String[]{"<sample:0>"}, false, 1, new String[][]{}), new String[][]{{"add", "double[]", "5"}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.math.linear.ArrayRealVector", actual.getClass().getName());
  assertEquals("{0; (Infinity); (-Infinity)} {getData=[0.0, Infinity, -Infinity], getDataRef=[0.0, Infinity, -Infinity], getDimension=3, getL1Norm=Infinity, getLInfNorm=Infinity, getMaxIndex=1, getMaxValue=Infinity, ...#285#453724547", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getData=[1.0, Infinity, -Infinity], getDimension=3, getL1Norm=Infinity, getLInfNorm=Infinity, getMaxIndex=1, getMaxValue=Infinity, getMinIndex=2, getMinValue=-Infinity, getNorm=Infinity, getSparsity=...#234#-614213921", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput196() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.linear.OpenMapRealVector", "org.apache.commons.math.linear.OpenMapRealVector", "getDimension", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.math.linear.OpenMapRealVector", "map", "org.apache.commons.math.analysis.UnivariateRealFunction", "<sample:0>"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getData=[], getDimension=0, getL1Norm=0.0, getLInfNorm=0.0, getMaxIndex=-1, getMaxValue=NaN, getMinIndex=-1, getMinValue=NaN, getNorm=0.0, getSparsity=NaN, isInfinite=false, isNaN=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput197() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.linear.OpenMapRealVector", "org.apache.commons.math.linear.OpenMapRealVector", "getDimension", new String[]{}, new String[]{}, false, 1, new String[][]{});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("3", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getData=[1.0, Infinity, -Infinity], getDimension=3, getL1Norm=Infinity, getLInfNorm=Infinity, getMaxIndex=1, getMaxValue=Infinity, getMinIndex=2, getMinValue=-Infinity, getNorm=Infinity, getSparsity=...#234#-614213921", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput198() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math.linear.OpenMapRealVector", "org.apache.commons.math.linear.OpenMapRealVector", "unitize", new String[]{}, new String[]{}, false); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("org.apache.commons.math.exception.MathArithmeticException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput199() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.linear.OpenMapRealVector", "org.apache.commons.math.linear.OpenMapRealVector", "getDimension", new String[]{}, new String[]{}, false, 3, new String[][]{{"org.apache.commons.math.linear.OpenMapRealVector", "getMaxValue", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("2", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getData=[-Infinity, -1.0], getDimension=2, getL1Norm=Infinity, getLInfNorm=Infinity, getMaxIndex=1, getMaxValue=-1.0, getMinIndex=0, getMinValue=-Infinity, getNorm=Infinity, getSparsity=1.0, isInfini...#221#-774438889", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput200() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.linear.OpenMapRealVector", "org.apache.commons.math.linear.OpenMapRealVector", "isNaN", new String[]{}, new String[]{}, false, 3, new String[][]{});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getData=[-Infinity, -1.0], getDimension=2, getL1Norm=Infinity, getLInfNorm=Infinity, getMaxIndex=1, getMaxValue=-1.0, getMinIndex=0, getMinValue=-Infinity, getNorm=Infinity, getSparsity=1.0, isInfini...#221#-774438889", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput201() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math.linear.OpenMapRealVector", "org.apache.commons.math.linear.OpenMapRealVector", "append", new String[]{"org.apache.commons.math.linear.OpenMapRealVector"}, new String[]{"<sample:10>"}, false, 7, new String[][]{}), new String[][]{{"setSubVector", "int,org.apache.commons.math.linear.RealVector", "2"}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.math.linear.OpenMapRealVector", actual.getClass().getName());
  assertEquals("{getData=[Infinity, -Infinity, 0.0, 0.0, 0.0, Infinity], getDimension=6, getL1Norm=Infinity, getLInfNorm=Infinity, getMaxIndex=5, getMaxValue=Infinity, getMinIndex=1, getMinValue=-Infinity, getNorm=In...#254#-2004030708", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getData=[Infinity, -Infinity, 0.0], getDimension=3, getL1Norm=Infinity, getLInfNorm=Infinity, getMaxIndex=0, getMaxValue=Infinity, getMinIndex=1, getMinValue=-Infinity, getNorm=Infinity, getSparsity=...#249#903803555", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput202() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.linear.OpenMapRealVector", "org.apache.commons.math.linear.OpenMapRealVector", "mapSubtract", new String[]{"double"}, new String[]{"1.0E-12"}, false, 7, new String[][]{{"org.apache.commons.math.linear.OpenMapRealVector", "projection", "org.apache.commons.math.linear.RealVector", "<sample:5>"}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.math.linear.OpenMapRealVector", actual.getClass().getName());
  assertEquals("{getData=[Infinity, -Infinity, 0.0], getDimension=3, getL1Norm=Infinity, getLInfNorm=Infinity, getMaxIndex=0, getMaxValue=Infinity, getMinIndex=1, getMinValue=-Infinity, getNorm=Infinity, getSparsity=...#249#903803555", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getData=[Infinity, -Infinity, 0.0], getDimension=3, getL1Norm=Infinity, getLInfNorm=Infinity, getMaxIndex=0, getMaxValue=Infinity, getMinIndex=1, getMinValue=-Infinity, getNorm=Infinity, getSparsity=...#249#903803555", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput203() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.linear.OpenMapRealVector", "org.apache.commons.math.linear.OpenMapRealVector", "getNorm", new String[]{}, new String[]{}, false, 6, new String[][]{});
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("Infinity", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getData=[Infinity, -Infinity, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0], getDimension=8, getL1Norm=Infinity, getLInfNorm=Infinity, getMaxIndex=0, getMaxValue=Infinity, getMinIndex=1, getMinValue=-Infinity, getNo...#260#-518583913", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput204() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math.linear.OpenMapRealVector", "org.apache.commons.math.linear.OpenMapRealVector", "outerProduct", new String[]{"double[]"}, new String[]{"<sample:1>"}, false); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("org.apache.commons.math.exception.NotStrictlyPositiveException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput205() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.linear.OpenMapRealVector", "org.apache.commons.math.linear.OpenMapRealVector", "getMinValue", new String[]{}, new String[]{}, false, 3, new String[][]{{"org.apache.commons.math.linear.OpenMapRealVector", "getMinIndex", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("-Infinity", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getData=[-Infinity, -1.0], getDimension=2, getL1Norm=Infinity, getLInfNorm=Infinity, getMaxIndex=1, getMaxValue=-1.0, getMinIndex=0, getMinValue=-Infinity, getNorm=Infinity, getSparsity=1.0, isInfini...#221#-774438889", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput206() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math.linear.OpenMapRealVector", "org.apache.commons.math.linear.OpenMapRealVector", "dotProduct", new String[]{"double[]"}, new String[]{"<null>"}, false, 7, new String[][]{{"org.apache.commons.math.linear.OpenMapRealVector", "getDistance", "double[]", "<sample:0>"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("org.apache.commons.math.exception.NullArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput207() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.linear.OpenMapRealVector", "org.apache.commons.math.linear.OpenMapRealVector", "isDefaultValue", new String[]{"double"}, new String[]{"0.0"}, false, 4, new String[][]{{"org.apache.commons.math.linear.OpenMapRealVector", "subtract", "org.apache.commons.math.linear.RealVector", "<sample:6>"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getData=[-1.0, -1.0, -1.0], getDimension=3, getL1Norm=3.0, getLInfNorm=1.0, getMaxIndex=2, getMaxValue=-1.0, getMinIndex=2, getMinValue=-1.0, getNorm=1.7320508075688772, getSparsity=1.0, isInfinite=f...#218#-325937176", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput208() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.linear.OpenMapRealVector", "org.apache.commons.math.linear.OpenMapRealVector", "combineToSelf", new String[]{"double", "double", "double[]"}, new String[]{"Infinity", "2.1930556738951767E18", "<sample:2>"}, false, 4, new String[][]{});
  assertNotNull(actual);
  assertEquals("org.apache.commons.math.linear.OpenMapRealVector", actual.getClass().getName());
  assertEquals("{getData=[-Infinity, NaN, -Infinity], getDimension=3, getL1Norm=NaN, getLInfNorm=NaN, getMaxIndex=2, getMaxValue=-Infinity, getMinIndex=2, getMinValue=-Infinity, getNorm=NaN, getSparsity=1.0, isInfini...#221#-1786280781", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getData=[-Infinity, NaN, -Infinity], getDimension=3, getL1Norm=NaN, getLInfNorm=NaN, getMaxIndex=2, getMaxValue=-Infinity, getMinIndex=2, getMinValue=-Infinity, getNorm=NaN, getSparsity=1.0, isInfini...#221#-1786280781", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput209() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.linear.OpenMapRealVector", "org.apache.commons.math.linear.OpenMapRealVector", "hashCode", new String[]{}, new String[]{}, false, 5, new String[][]{{"org.apache.commons.math.linear.OpenMapRealVector", "unitVector", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("-818727111", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getData=[], getDimension=0, getL1Norm=0.0, getLInfNorm=0.0, getMaxIndex=-1, getMaxValue=NaN, getMinIndex=-1, getMinValue=NaN, getNorm=0.0, getSparsity=NaN, isInfinite=false, isNaN=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput210() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math.linear.OpenMapRealVector", "org.apache.commons.math.linear.OpenMapRealVector", "getLInfDistance", new String[]{"org.apache.commons.math.linear.RealVector"}, new String[]{"<sample:3>"}, false, 6, new String[][]{{"org.apache.commons.math.linear.OpenMapRealVector", "getDistance", "org.apache.commons.math.linear.OpenMapRealVector", "<sample:6>"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("org.apache.commons.math.exception.DimensionMismatchException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput211() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math.linear.OpenMapRealVector", "org.apache.commons.math.linear.OpenMapRealVector", "setSubVector", new String[]{"int", "org.apache.commons.math.linear.RealVector"}, new String[]{"-24", "<sample:7>"}, false); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("org.apache.commons.math.exception.OutOfRangeException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput212() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math.linear.OpenMapRealVector", "org.apache.commons.math.linear.OpenMapRealVector", "getL1Distance", new String[]{"org.apache.commons.math.linear.RealVector"}, new String[]{"<sample:2>"}, false, 1, new String[][]{{"org.apache.commons.math.linear.OpenMapRealVector", "checkIndex", "int", "10"}, {"org.apache.commons.math.linear.OpenMapRealVector", "append", "double[]", "<sample:3>"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("org.apache.commons.math.exception.DimensionMismatchException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput213() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.linear.OpenMapRealVector", "org.apache.commons.math.linear.OpenMapRealVector", "ebeMultiply", new String[]{"double[]"}, new String[]{"<empty>"}, false);
  assertNotNull(actual);
  assertEquals("org.apache.commons.math.linear.OpenMapRealVector", actual.getClass().getName());
  assertEquals("{getData=[], getDimension=0, getL1Norm=0.0, getLInfNorm=0.0, getMaxIndex=-1, getMaxValue=NaN, getMinIndex=-1, getMinValue=NaN, getNorm=0.0, getSparsity=NaN, isInfinite=false, isNaN=false}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getData=[], getDimension=0, getL1Norm=0.0, getLInfNorm=0.0, getMaxIndex=-1, getMaxValue=NaN, getMinIndex=-1, getMinValue=NaN, getNorm=0.0, getSparsity=NaN, isInfinite=false, isNaN=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput214() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math.linear.OpenMapRealVector", "org.apache.commons.math.linear.OpenMapRealVector", "checkIndex", new String[]{"int"}, new String[]{"-2147483648"}, false, 0, new String[][]{{"org.apache.commons.math.linear.OpenMapRealVector", "checkVectorDimensions", "org.apache.commons.math.linear.RealVector", "<sample:4>"}, {"org.apache.commons.math.linear.OpenMapRealVector", "mapMultiplyToSelf", "double", "-1.7976931348623155E307"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("org.apache.commons.math.exception.OutOfRangeException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput215() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.linear.OpenMapRealVector", "org.apache.commons.math.linear.OpenMapRealVector", "mapAddToSelf", new String[]{"double"}, new String[]{"0.1"}, false, 3, new String[][]{});
  assertNotNull(actual);
  assertEquals("org.apache.commons.math.linear.OpenMapRealVector", actual.getClass().getName());
  assertEquals("{getData=[-Infinity, -0.9], getDimension=2, getL1Norm=Infinity, getLInfNorm=Infinity, getMaxIndex=1, getMaxValue=-0.9, getMinIndex=0, getMinValue=-Infinity, getNorm=Infinity, getSparsity=1.0, isInfini...#221#-631853913", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getData=[-Infinity, -0.9], getDimension=2, getL1Norm=Infinity, getLInfNorm=Infinity, getMaxIndex=1, getMaxValue=-0.9, getMinIndex=0, getMinValue=-Infinity, getNorm=Infinity, getSparsity=1.0, isInfini...#221#-631853913", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput216() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math.linear.OpenMapRealVector", "org.apache.commons.math.linear.OpenMapRealVector", "iterator", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.math.linear.OpenMapRealVector", "getDistance", "org.apache.commons.math.linear.RealVector", "<sample:5>"}}), new String[][]{{"hasNext", "", "3"}, {"hasNext", "", "7"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getData=[], getDimension=0, getL1Norm=0.0, getLInfNorm=0.0, getMaxIndex=-1, getMaxValue=NaN, getMinIndex=-1, getMinValue=NaN, getNorm=0.0, getSparsity=NaN, isInfinite=false, isNaN=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput217() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math.linear.OpenMapRealVector", "org.apache.commons.math.linear.OpenMapRealVector", "getEntry", new String[]{"int"}, new String[]{"-2147483648"}, false); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("org.apache.commons.math.exception.OutOfRangeException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput218() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.linear.OpenMapRealVector", "org.apache.commons.math.linear.OpenMapRealVector", "getL1Distance", new String[]{"double[]"}, new String[]{"<sample:2>"}, false, 7, new String[][]{{"org.apache.commons.math.linear.OpenMapRealVector", "mapMultiply", "double", "-0.5299999999999999"}});
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("Infinity", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getData=[Infinity, -Infinity, 0.0], getDimension=3, getL1Norm=Infinity, getLInfNorm=Infinity, getMaxIndex=0, getMaxValue=Infinity, getMinIndex=1, getMinValue=-Infinity, getNorm=Infinity, getSparsity=...#249#903803555", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput219() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.linear.OpenMapRealVector", "org.apache.commons.math.linear.OpenMapRealVector", "ebeMultiply", new String[]{"org.apache.commons.math.linear.RealVector"}, new String[]{"<sample:2>"}, false, 5, new String[][]{});
  assertNotNull(actual);
  assertEquals("org.apache.commons.math.linear.OpenMapRealVector", actual.getClass().getName());
  assertEquals("{getData=[], getDimension=0, getL1Norm=0.0, getLInfNorm=0.0, getMaxIndex=-1, getMaxValue=NaN, getMinIndex=-1, getMinValue=NaN, getNorm=0.0, getSparsity=NaN, isInfinite=false, isNaN=false}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getData=[], getDimension=0, getL1Norm=0.0, getLInfNorm=0.0, getMaxIndex=-1, getMaxValue=NaN, getMinIndex=-1, getMinValue=NaN, getNorm=0.0, getSparsity=NaN, isInfinite=false, isNaN=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput220() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.linear.OpenMapRealVector", "org.apache.commons.math.linear.OpenMapRealVector", "getMaxIndex", new String[]{}, new String[]{}, false, 3, new String[][]{{"org.apache.commons.math.linear.OpenMapRealVector", "combineToSelf", "double,double,org.apache.commons.math.linear.RealVector", "0.49999999999999994", "1.0", "<sample:11>"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("1", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getData=[-Infinity, -1.0], getDimension=2, getL1Norm=Infinity, getLInfNorm=Infinity, getMaxIndex=1, getMaxValue=-1.0, getMinIndex=0, getMinValue=-Infinity, getNorm=Infinity, getSparsity=1.0, isInfini...#221#-774438889", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput221() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math.linear.OpenMapRealVector", "org.apache.commons.math.linear.OpenMapRealVector", "mapSubtractToSelf", new String[]{"double"}, new String[]{"2.0000000000000004E-12"}, false, 5, new String[][]{{"org.apache.commons.math.linear.OpenMapRealVector", "getLInfNorm", ""}}), new String[][]{{"getL1Distance", "org.apache.commons.math.linear.RealVector", "7"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("org.apache.commons.math.exception.DimensionMismatchException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput222() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.linear.OpenMapRealVector", "org.apache.commons.math.linear.OpenMapRealVector", "hashCode", new String[]{}, new String[]{}, false, 1, new String[][]{{"org.apache.commons.math.linear.OpenMapRealVector", "checkVectorDimensions", "org.apache.commons.math.linear.RealVector", "<sample:6>"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("-1694978236", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getData=[1.0, Infinity, -Infinity], getDimension=3, getL1Norm=Infinity, getLInfNorm=Infinity, getMaxIndex=1, getMaxValue=Infinity, getMinIndex=2, getMinValue=-Infinity, getNorm=Infinity, getSparsity=...#234#-614213921", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput223() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.linear.OpenMapRealVector", "org.apache.commons.math.linear.OpenMapRealVector", "getMaxValue", new String[]{}, new String[]{}, false, 4, new String[][]{});
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("-1.0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getData=[-1.0, -1.0, -1.0], getDimension=3, getL1Norm=3.0, getLInfNorm=1.0, getMaxIndex=2, getMaxValue=-1.0, getMinIndex=2, getMinValue=-1.0, getNorm=1.7320508075688772, getSparsity=1.0, isInfinite=f...#218#-325937176", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput224() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.linear.OpenMapRealVector", "org.apache.commons.math.linear.OpenMapRealVector", "combine", new String[]{"double", "double", "double[]"}, new String[]{"4.000000000000001E-12", "-2.0000000000000004E-12", "<sample:2>"}, false, 1, new String[][]{{"org.apache.commons.math.linear.OpenMapRealVector", "append", "org.apache.commons.math.linear.RealVector", "<sample:0>"}, {"org.apache.commons.math.linear.OpenMapRealVector", "checkVectorDimensions", "org.apache.commons.math.linear.RealVector", "<sample:5>"}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.math.linear.OpenMapRealVector", actual.getClass().getName());
  assertEquals("{getData=[2.0000000000000004E-12, NaN, NaN], getDimension=3, getL1Norm=NaN, getLInfNorm=NaN, getMaxIndex=0, getMaxValue=2.0000000000000004E-12, getMinIndex=0, getMinValue=2.0000000000000004E-12, getNo...#254#515299511", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getData=[1.0, Infinity, -Infinity], getDimension=3, getL1Norm=Infinity, getLInfNorm=Infinity, getMaxIndex=1, getMaxValue=Infinity, getMinIndex=2, getMinValue=-Infinity, getNorm=Infinity, getSparsity=...#234#-614213921", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput225() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math.linear.OpenMapRealVector", "org.apache.commons.math.linear.OpenMapRealVector", "append", new String[]{"org.apache.commons.math.linear.RealVector"}, new String[]{"<null>"}, false, 3, new String[][]{}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput226() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.linear.OpenMapRealVector", "org.apache.commons.math.linear.OpenMapRealVector", "getDistance", new String[]{"org.apache.commons.math.linear.OpenMapRealVector"}, new String[]{"<sample:3>"}, false, 6, new String[][]{});
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("Infinity", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getData=[Infinity, -Infinity, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0], getDimension=8, getL1Norm=Infinity, getLInfNorm=Infinity, getMaxIndex=0, getMaxValue=Infinity, getMinIndex=1, getMinValue=-Infinity, getNo...#260#-518583913", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput227() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.linear.OpenMapRealVector", "org.apache.commons.math.linear.OpenMapRealVector", "combine", new String[]{"double", "double", "double[]"}, new String[]{"0.49999999999999994", "63.270000000002", "<sample:8>"}, false, 7, new String[][]{{"org.apache.commons.math.linear.OpenMapRealVector", "mapMultiply", "double", "-2.0000000000000004E-12"}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.math.linear.OpenMapRealVector", actual.getClass().getName());
  assertEquals("{getData=[Infinity, -Infinity, 0.0], getDimension=3, getL1Norm=Infinity, getLInfNorm=Infinity, getMaxIndex=0, getMaxValue=Infinity, getMinIndex=1, getMinValue=-Infinity, getNorm=Infinity, getSparsity=...#249#903803555", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getData=[Infinity, -Infinity, 0.0], getDimension=3, getL1Norm=Infinity, getLInfNorm=Infinity, getMaxIndex=0, getMaxValue=Infinity, getMinIndex=1, getMinValue=-Infinity, getNorm=Infinity, getSparsity=...#249#903803555", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput228() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.linear.OpenMapRealVector", "org.apache.commons.math.linear.OpenMapRealVector", "projection", new String[]{"double[]"}, new String[]{"<sample:8>"}, false, 4, new String[][]{{"org.apache.commons.math.linear.OpenMapRealVector", "unitize", ""}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.math.linear.OpenMapRealVector", actual.getClass().getName());
  assertEquals("{getData=[NaN, NaN, NaN], getDimension=3, getL1Norm=NaN, getLInfNorm=NaN, getMaxIndex=-1, getMaxValue=NaN, getMinIndex=-1, getMinValue=NaN, getNorm=NaN, getSparsity=1.0, isInfinite=false, isNaN=true}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getData=[-0.5773502691896258, -0.5773502691896258, -0.57735026918962.., getDimension=3, getL1Norm=1.7320508075688776, getLInfNorm=0.5773502691896258, getMaxIndex=2, getMaxValue=-0.5773502691896258, g...#307#785339052", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput229() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.linear.OpenMapRealVector", "org.apache.commons.math.linear.OpenMapRealVector", "getL1Norm", new String[]{}, new String[]{}, false, 4, new String[][]{});
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("3.0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getData=[-1.0, -1.0, -1.0], getDimension=3, getL1Norm=3.0, getLInfNorm=1.0, getMaxIndex=2, getMaxValue=-1.0, getMinIndex=2, getMinValue=-1.0, getNorm=1.7320508075688772, getSparsity=1.0, isInfinite=f...#218#-325937176", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput230() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math.linear.OpenMapRealVector", "org.apache.commons.math.linear.OpenMapRealVector", "ebeMultiply", new String[]{"double[]"}, new String[]{"<sample:11>"}, false, 4, new String[][]{{"org.apache.commons.math.linear.OpenMapRealVector", "getLInfNorm", ""}}), new String[][]{{"getMaxValue", "", "3"}, {"getMaxIndex", "", "6"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getData=[-1.0, -1.0, -1.0], getDimension=3, getL1Norm=3.0, getLInfNorm=1.0, getMaxIndex=2, getMaxValue=-1.0, getMinIndex=2, getMinValue=-1.0, getNorm=1.7320508075688772, getSparsity=1.0, isInfinite=f...#218#-325937176", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput231() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.linear.OpenMapRealVector", "org.apache.commons.math.linear.OpenMapRealVector", "equals", new String[]{"java.lang.Object"}, new String[]{"<i:0>"}, false);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getData=[], getDimension=0, getL1Norm=0.0, getLInfNorm=0.0, getMaxIndex=-1, getMaxValue=NaN, getMinIndex=-1, getMinValue=NaN, getNorm=0.0, getSparsity=NaN, isInfinite=false, isNaN=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput232() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math.linear.OpenMapRealVector", "org.apache.commons.math.linear.OpenMapRealVector", "dotProduct", new String[]{"org.apache.commons.math.linear.RealVector"}, new String[]{"<sample:4>"}, false, 4, new String[][]{}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("org.apache.commons.math.exception.DimensionMismatchException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput233() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.linear.OpenMapRealVector", "org.apache.commons.math.linear.OpenMapRealVector", "hashCode", new String[]{}, new String[]{}, false, 6, new String[][]{{"org.apache.commons.math.linear.OpenMapRealVector", "getL1Distance", "org.apache.commons.math.linear.OpenMapRealVector", "<null>"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("-1205979767", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getData=[Infinity, -Infinity, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0], getDimension=8, getL1Norm=Infinity, getLInfNorm=Infinity, getMaxIndex=0, getMaxValue=Infinity, getMinIndex=1, getMinValue=-Infinity, getNo...#260#-518583913", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput234() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math.linear.OpenMapRealVector", "org.apache.commons.math.linear.OpenMapRealVector", "projection", new String[]{"double[]"}, new String[]{"<sample:0>"}, false); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("org.apache.commons.math.exception.DimensionMismatchException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput235() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math.linear.OpenMapRealVector", "org.apache.commons.math.linear.OpenMapRealVector", "setSubVector", new String[]{"int", "double[]"}, new String[]{"-64", "<sample:10>"}, false); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("org.apache.commons.math.exception.OutOfRangeException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput236() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math.linear.OpenMapRealVector", "org.apache.commons.math.linear.OpenMapRealVector", "mapAdd", new String[]{"double"}, new String[]{"-Infinity"}, false, 7, new String[][]{{"org.apache.commons.math.linear.OpenMapRealVector", "append", "double", "-1.7976931348623157E308"}}), new String[][]{{"mapMultiplyToSelf", "double", "0"}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.math.linear.OpenMapRealVector", actual.getClass().getName());
  assertEquals("{getData=[NaN, Infinity, Infinity], getDimension=3, getL1Norm=NaN, getLInfNorm=NaN, getMaxIndex=2, getMaxValue=Infinity, getMinIndex=2, getMinValue=Infinity, getNorm=NaN, getSparsity=1.0, isInfinite=f...#217#-1338906117", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getData=[Infinity, -Infinity, 0.0], getDimension=3, getL1Norm=Infinity, getLInfNorm=Infinity, getMaxIndex=0, getMaxValue=Infinity, getMinIndex=1, getMinValue=-Infinity, getNorm=Infinity, getSparsity=...#249#903803555", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput237() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.linear.OpenMapRealVector", "org.apache.commons.math.linear.OpenMapRealVector", "mapToSelf", new String[]{"org.apache.commons.math.analysis.UnivariateRealFunction"}, new String[]{"<sample:3>"}, false, 0, new String[][]{{"org.apache.commons.math.linear.OpenMapRealVector", "getLInfNorm", ""}, {"org.apache.commons.math.linear.OpenMapRealVector", "projection", "org.apache.commons.math.linear.RealVector", "<sample:6>"}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.math.linear.OpenMapRealVector", actual.getClass().getName());
  assertEquals("{getData=[], getDimension=0, getL1Norm=0.0, getLInfNorm=0.0, getMaxIndex=-1, getMaxValue=NaN, getMinIndex=-1, getMinValue=NaN, getNorm=0.0, getSparsity=NaN, isInfinite=false, isNaN=false}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getData=[], getDimension=0, getL1Norm=0.0, getLInfNorm=0.0, getMaxIndex=-1, getMaxValue=NaN, getMinIndex=-1, getMinValue=NaN, getNorm=0.0, getSparsity=NaN, isInfinite=false, isNaN=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput238() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.linear.OpenMapRealVector", "org.apache.commons.math.linear.OpenMapRealVector", "getSparsity", new String[]{}, new String[]{}, false, 4, new String[][]{{"org.apache.commons.math.linear.OpenMapRealVector", "getL1Distance", "double[]", "<sample:11>"}});
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("1.0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getData=[-1.0, -1.0, -1.0], getDimension=3, getL1Norm=3.0, getLInfNorm=1.0, getMaxIndex=2, getMaxValue=-1.0, getMinIndex=2, getMinValue=-1.0, getNorm=1.7320508075688772, getSparsity=1.0, isInfinite=f...#218#-325937176", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput239() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.linear.OpenMapRealVector", "org.apache.commons.math.linear.OpenMapRealVector", "projection", new String[]{"double[]"}, new String[]{"<empty>"}, false);
  assertNotNull(actual);
  assertEquals("org.apache.commons.math.linear.OpenMapRealVector", actual.getClass().getName());
  assertEquals("{getData=[], getDimension=0, getL1Norm=0.0, getLInfNorm=0.0, getMaxIndex=-1, getMaxValue=NaN, getMinIndex=-1, getMinValue=NaN, getNorm=0.0, getSparsity=NaN, isInfinite=false, isNaN=false}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getData=[], getDimension=0, getL1Norm=0.0, getLInfNorm=0.0, getMaxIndex=-1, getMaxValue=NaN, getMinIndex=-1, getMinValue=NaN, getNorm=0.0, getSparsity=NaN, isInfinite=false, isNaN=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput240() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.linear.OpenMapRealVector", "org.apache.commons.math.linear.OpenMapRealVector", "projection", new String[]{"org.apache.commons.math.linear.RealVector"}, new String[]{"<sample:2>"}, false);
  assertNotNull(actual);
  assertEquals("receiver state after the call", "{getData=[], getDimension=0, getL1Norm=0.0, getLInfNorm=0.0, getMaxIndex=-1, getMaxValue=NaN, getMinIndex=-1, getMinValue=NaN, getNorm=0.0, getSparsity=NaN, isInfinite=false, isNaN=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput241() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.linear.OpenMapRealVector", "org.apache.commons.math.linear.OpenMapRealVector", "isInfinite", new String[]{}, new String[]{}, false, 4, new String[][]{});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getData=[-1.0, -1.0, -1.0], getDimension=3, getL1Norm=3.0, getLInfNorm=1.0, getMaxIndex=2, getMaxValue=-1.0, getMinIndex=2, getMinValue=-1.0, getNorm=1.7320508075688772, getSparsity=1.0, isInfinite=f...#218#-325937176", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput242() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.linear.OpenMapRealVector", "org.apache.commons.math.linear.OpenMapRealVector", "iterator", new String[]{}, new String[]{}, false, 1, new String[][]{});
  assertNotNull(actual);
  assertEquals("receiver state after the call", "{getData=[1.0, Infinity, -Infinity], getDimension=3, getL1Norm=Infinity, getLInfNorm=Infinity, getMaxIndex=1, getMaxValue=Infinity, getMinIndex=2, getMinValue=-Infinity, getNorm=Infinity, getSparsity=...#234#-614213921", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput243() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.linear.OpenMapRealVector", "org.apache.commons.math.linear.OpenMapRealVector", "ebeDivide", new String[]{"org.apache.commons.math.linear.RealVector"}, new String[]{"<sample:3>"}, false, 2, new String[][]{});
  assertNotNull(actual);
  assertEquals("org.apache.commons.math.linear.OpenMapRealVector", actual.getClass().getName());
  assertEquals("{getData=[0.0], getDimension=1, getL1Norm=0.0, getLInfNorm=0.0, getMaxIndex=0, getMaxValue=0.0, getMinIndex=0, getMinValue=0.0, getNorm=0.0, getSparsity=0.0, isInfinite=false, isNaN=false}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getData=[0.0], getDimension=1, getL1Norm=0.0, getLInfNorm=0.0, getMaxIndex=0, getMaxValue=0.0, getMinIndex=0, getMinValue=0.0, getNorm=0.0, getSparsity=0.0, isInfinite=false, isNaN=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput244() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.linear.OpenMapRealVector", "org.apache.commons.math.linear.OpenMapRealVector", "getL1Distance", new String[]{"org.apache.commons.math.linear.OpenMapRealVector"}, new String[]{"<sample:11>"}, false);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("0.0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getData=[], getDimension=0, getL1Norm=0.0, getLInfNorm=0.0, getMaxIndex=-1, getMaxValue=NaN, getMinIndex=-1, getMinValue=NaN, getNorm=0.0, getSparsity=NaN, isInfinite=false, isNaN=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput245() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.linear.OpenMapRealVector", "org.apache.commons.math.linear.OpenMapRealVector", "equals", new String[]{"java.lang.Object"}, new String[]{"<sample:1>"}, false, 6, new String[][]{{"org.apache.commons.math.linear.OpenMapRealVector", "mapSubtract", "double", "1.0000000000000004E-12"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getData=[Infinity, -Infinity, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0], getDimension=8, getL1Norm=Infinity, getLInfNorm=Infinity, getMaxIndex=0, getMaxValue=Infinity, getMinIndex=1, getMinValue=-Infinity, getNo...#260#-518583913", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput246() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.linear.OpenMapRealVector", "org.apache.commons.math.linear.OpenMapRealVector", "mapAddToSelf", new String[]{"double"}, new String[]{"-2.0000000000000008E-12"}, false, 7, new String[][]{{"org.apache.commons.math.linear.OpenMapRealVector", "copy", ""}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.math.linear.OpenMapRealVector", actual.getClass().getName());
  assertEquals("{getData=[Infinity, -Infinity, 0.0], getDimension=3, getL1Norm=Infinity, getLInfNorm=Infinity, getMaxIndex=0, getMaxValue=Infinity, getMinIndex=1, getMinValue=-Infinity, getNorm=Infinity, getSparsity=...#249#903803555", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getData=[Infinity, -Infinity, 0.0], getDimension=3, getL1Norm=Infinity, getLInfNorm=Infinity, getMaxIndex=0, getMaxValue=Infinity, getMinIndex=1, getMinValue=-Infinity, getNorm=Infinity, getSparsity=...#249#903803555", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput247() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.linear.OpenMapRealVector", "org.apache.commons.math.linear.OpenMapRealVector", "getDistance", new String[]{"org.apache.commons.math.linear.OpenMapRealVector"}, new String[]{"<sample:1>"}, false, 3, new String[][]{{"org.apache.commons.math.linear.OpenMapRealVector", "unitVector", ""}, {"org.apache.commons.math.linear.OpenMapRealVector", "getL1Distance", "org.apache.commons.math.linear.RealVector", "<sample:9>"}});
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("Infinity", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getData=[-Infinity, -1.0], getDimension=2, getL1Norm=Infinity, getLInfNorm=Infinity, getMaxIndex=1, getMaxValue=-1.0, getMinIndex=0, getMinValue=-Infinity, getNorm=Infinity, getSparsity=1.0, isInfini...#221#-774438889", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput248() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.linear.OpenMapRealVector", "org.apache.commons.math.linear.OpenMapRealVector", "mapAdd", new String[]{"double"}, new String[]{"0.9999999999999998"}, false, 7, new String[][]{{"org.apache.commons.math.linear.OpenMapRealVector", "getEntry", "int", "1073741823"}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.math.linear.OpenMapRealVector", actual.getClass().getName());
  assertEquals("{getData=[Infinity, -Infinity, 0.0], getDimension=3, getL1Norm=Infinity, getLInfNorm=Infinity, getMaxIndex=0, getMaxValue=Infinity, getMinIndex=1, getMinValue=-Infinity, getNorm=Infinity, getSparsity=...#249#903803555", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getData=[Infinity, -Infinity, 0.0], getDimension=3, getL1Norm=Infinity, getLInfNorm=Infinity, getMaxIndex=0, getMaxValue=Infinity, getMinIndex=1, getMinValue=-Infinity, getNorm=Infinity, getSparsity=...#249#903803555", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput249() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.linear.OpenMapRealVector", "org.apache.commons.math.linear.OpenMapRealVector", "mapAdd", new String[]{"double"}, new String[]{"-Infinity"}, false, 4, new String[][]{{"org.apache.commons.math.linear.OpenMapRealVector", "add", "org.apache.commons.math.linear.OpenMapRealVector", "<sample:2>"}, {"org.apache.commons.math.linear.OpenMapRealVector", "combineToSelf", "double,double,org.apache.commons.math.linear.RealVector", "0.5", "0.27000000000200003", "<sample:7>"}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.math.linear.OpenMapRealVector", actual.getClass().getName());
  assertEquals("{getData=[-Infinity, -Infinity, -Infinity], getDimension=3, getL1Norm=Infinity, getLInfNorm=Infinity, getMaxIndex=2, getMaxValue=-Infinity, getMinIndex=2, getMinValue=-Infinity, getNorm=Infinity, getS...#242#-1266640746", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getData=[-1.0, -1.0, -1.0], getDimension=3, getL1Norm=3.0, getLInfNorm=1.0, getMaxIndex=2, getMaxValue=-1.0, getMinIndex=2, getMinValue=-1.0, getNorm=1.7320508075688772, getSparsity=1.0, isInfinite=f...#218#-325937176", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput250() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.linear.OpenMapRealVector", "org.apache.commons.math.linear.OpenMapRealVector", "getDimension", new String[]{}, new String[]{}, false, 4, new String[][]{{"org.apache.commons.math.linear.OpenMapRealVector", "dotProduct", "double[]", "<sample:6>"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("3", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getData=[-1.0, -1.0, -1.0], getDimension=3, getL1Norm=3.0, getLInfNorm=1.0, getMaxIndex=2, getMaxValue=-1.0, getMinIndex=2, getMinValue=-1.0, getNorm=1.7320508075688772, getSparsity=1.0, isInfinite=f...#218#-325937176", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput251() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.linear.OpenMapRealVector", "org.apache.commons.math.linear.OpenMapRealVector", "getMinValue", new String[]{}, new String[]{}, false, 2, new String[][]{{"org.apache.commons.math.linear.OpenMapRealVector", "unitize", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("0.0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getData=[0.0], getDimension=1, getL1Norm=0.0, getLInfNorm=0.0, getMaxIndex=0, getMaxValue=0.0, getMinIndex=0, getMinValue=0.0, getNorm=0.0, getSparsity=0.0, isInfinite=false, isNaN=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput252() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.linear.OpenMapRealVector", "org.apache.commons.math.linear.OpenMapRealVector", "isDefaultValue", new String[]{"double"}, new String[]{"-0.9999999999999998"}, false, 6, new String[][]{{"org.apache.commons.math.linear.OpenMapRealVector", "ebeMultiply", "double[]", "<sample:2>"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getData=[Infinity, -Infinity, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0], getDimension=8, getL1Norm=Infinity, getLInfNorm=Infinity, getMaxIndex=0, getMaxValue=Infinity, getMinIndex=1, getMinValue=-Infinity, getNo...#260#-518583913", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput253() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math.linear.OpenMapRealVector", "org.apache.commons.math.linear.OpenMapRealVector", "dotProduct", new String[]{"org.apache.commons.math.linear.RealVector"}, new String[]{"<null>"}, false, 0, new String[][]{{"org.apache.commons.math.linear.OpenMapRealVector", "getData", ""}, {"org.apache.commons.math.linear.OpenMapRealVector", "mapToSelf", "org.apache.commons.math.analysis.UnivariateRealFunction", "<sample:1>"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput254() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.linear.OpenMapRealVector", "org.apache.commons.math.linear.OpenMapRealVector", "mapDivide", new String[]{"double"}, new String[]{"-50.0"}, false, 5, new String[][]{{"org.apache.commons.math.linear.OpenMapRealVector", "getLInfDistance", "double[]", "<sample:5>"}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.math.linear.OpenMapRealVector", actual.getClass().getName());
  assertEquals("{getData=[], getDimension=0, getL1Norm=0.0, getLInfNorm=0.0, getMaxIndex=-1, getMaxValue=NaN, getMinIndex=-1, getMinValue=NaN, getNorm=0.0, getSparsity=NaN, isInfinite=false, isNaN=false}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getData=[], getDimension=0, getL1Norm=0.0, getLInfNorm=0.0, getMaxIndex=-1, getMaxValue=NaN, getMinIndex=-1, getMinValue=NaN, getNorm=0.0, getSparsity=NaN, isInfinite=false, isNaN=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput255() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.linear.OpenMapRealVector", "org.apache.commons.math.linear.OpenMapRealVector", "add", new String[]{"double[]"}, new String[]{"<sample:3>"}, false, 2, new String[][]{{"org.apache.commons.math.linear.OpenMapRealVector", "isDefaultValue", "double", "2.0000000000000004E-12"}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.math.linear.ArrayRealVector", actual.getClass().getName());
  assertEquals("{(Infinity)} {getData=[Infinity], getDataRef=[Infinity], getDimension=1, getL1Norm=Infinity, getLInfNorm=Infinity, getMaxIndex=0, getMaxValue=Infinity, getMinIndex=0, getMinValue=Infinity, getNorm=Inf...#236#846602571", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getData=[0.0], getDimension=1, getL1Norm=0.0, getLInfNorm=0.0, getMaxIndex=0, getMaxValue=0.0, getMinIndex=0, getMinValue=0.0, getNorm=0.0, getSparsity=0.0, isInfinite=false, isNaN=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput256() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.linear.OpenMapRealVector", "org.apache.commons.math.linear.OpenMapRealVector", "isInfinite", new String[]{}, new String[]{}, false);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getData=[], getDimension=0, getL1Norm=0.0, getLInfNorm=0.0, getMaxIndex=-1, getMaxValue=NaN, getMinIndex=-1, getMinValue=NaN, getNorm=0.0, getSparsity=NaN, isInfinite=false, isNaN=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput257() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.linear.OpenMapRealVector", "org.apache.commons.math.linear.OpenMapRealVector", "combineToSelf", new String[]{"double", "double", "double[]"}, new String[]{"-Infinity", "-8.988465674311579E307", "<sample:8>"}, false, 4, new String[][]{});
  assertNotNull(actual);
  assertEquals("org.apache.commons.math.linear.OpenMapRealVector", actual.getClass().getName());
  assertEquals("{getData=[NaN, Infinity, Infinity], getDimension=3, getL1Norm=NaN, getLInfNorm=NaN, getMaxIndex=2, getMaxValue=Infinity, getMinIndex=2, getMinValue=Infinity, getNorm=NaN, getSparsity=1.0, isInfinite=f...#217#-1338906117", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getData=[NaN, Infinity, Infinity], getDimension=3, getL1Norm=NaN, getLInfNorm=NaN, getMaxIndex=2, getMaxValue=Infinity, getMinIndex=2, getMinValue=Infinity, getNorm=NaN, getSparsity=1.0, isInfinite=f...#217#-1338906117", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput258() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math.linear.OpenMapRealVector", "org.apache.commons.math.linear.OpenMapRealVector", "subtract", new String[]{"org.apache.commons.math.linear.OpenMapRealVector"}, new String[]{"<sample:4>"}, false, 5, new String[][]{{"org.apache.commons.math.linear.OpenMapRealVector", "cosine", "double[]", "<empty>"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("org.apache.commons.math.exception.DimensionMismatchException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput259() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math.linear.OpenMapRealVector", "org.apache.commons.math.linear.OpenMapRealVector", "projection", new String[]{"double[]"}, new String[]{"<null>"}, false, 0, new String[][]{{"org.apache.commons.math.linear.OpenMapRealVector", "append", "org.apache.commons.math.linear.OpenMapRealVector", "<sample:3>"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput260() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math.linear.OpenMapRealVector", "org.apache.commons.math.linear.OpenMapRealVector", "map", new String[]{"org.apache.commons.math.analysis.UnivariateRealFunction"}, new String[]{"<sample:3>"}, false, 1, new String[][]{{"org.apache.commons.math.linear.OpenMapRealVector", "setEntry", "int,double", "-57", "-1.2000000000000004"}}), new String[][]{{"getEntry", "int", "2"}, {"getL1Norm", "", "2"}});
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("3.0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getData=[1.0, Infinity, -Infinity], getDimension=3, getL1Norm=Infinity, getLInfNorm=Infinity, getMaxIndex=1, getMaxValue=Infinity, getMinIndex=2, getMinValue=-Infinity, getNorm=Infinity, getSparsity=...#234#-614213921", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput261() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math.linear.OpenMapRealVector", "org.apache.commons.math.linear.OpenMapRealVector", "mapSubtractToSelf", new String[]{"double"}, new String[]{"2.0000000000000004E-12"}, false, 1, new String[][]{{"org.apache.commons.math.linear.OpenMapRealVector", "copy", ""}}), new String[][]{{"mapSubtractToSelf", "double", "2"}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.math.linear.OpenMapRealVector", actual.getClass().getName());
  assertEquals("{getData=[0.999999999998, Infinity, -Infinity], getDimension=3, getL1Norm=Infinity, getLInfNorm=Infinity, getMaxIndex=1, getMaxValue=Infinity, getMinIndex=2, getMinValue=-Infinity, getNorm=Infinity, g...#245#1141877167", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getData=[0.999999999998, Infinity, -Infinity], getDimension=3, getL1Norm=Infinity, getLInfNorm=Infinity, getMaxIndex=1, getMaxValue=Infinity, getMinIndex=2, getMinValue=-Infinity, getNorm=Infinity, g...#245#1141877167", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput262() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math.linear.OpenMapRealVector", "org.apache.commons.math.linear.OpenMapRealVector", "getDistance", new String[]{"org.apache.commons.math.linear.RealVector"}, new String[]{"<null>"}, false, 4, new String[][]{}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput263() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.linear.OpenMapRealVector", "org.apache.commons.math.linear.OpenMapRealVector", "getDistance", new String[]{"org.apache.commons.math.linear.OpenMapRealVector"}, new String[]{"<sample:6>"}, false, 2, new String[][]{});
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("Infinity", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getData=[0.0], getDimension=1, getL1Norm=0.0, getLInfNorm=0.0, getMaxIndex=0, getMaxValue=0.0, getMinIndex=0, getMinValue=0.0, getNorm=0.0, getSparsity=0.0, isInfinite=false, isNaN=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput264() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math.linear.OpenMapRealVector", "org.apache.commons.math.linear.OpenMapRealVector", "combineToSelf", new String[]{"double", "double", "org.apache.commons.math.linear.RealVector"}, new String[]{"0.027000000000200003", "3.999999999999999", "<sample:9>"}, false, 4, new String[][]{{"org.apache.commons.math.linear.OpenMapRealVector", "isNaN", ""}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("org.apache.commons.math.exception.DimensionMismatchException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput265() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math.linear.OpenMapRealVector", "org.apache.commons.math.linear.OpenMapRealVector", "mapAdd", new String[]{"double"}, new String[]{"0.2700000000020001"}, false, 7, new String[][]{}), new String[][]{{"getMaxIndex", "", "1"}, {"getDistance", "double[]", "2"}});
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("Infinity", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getData=[Infinity, -Infinity, 0.0], getDimension=3, getL1Norm=Infinity, getLInfNorm=Infinity, getMaxIndex=0, getMaxValue=Infinity, getMinIndex=1, getMinValue=-Infinity, getNorm=Infinity, getSparsity=...#249#903803555", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput266() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.linear.OpenMapRealVector", "org.apache.commons.math.linear.OpenMapRealVector", "isInfinite", new String[]{}, new String[]{}, false, 7, new String[][]{});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getData=[Infinity, -Infinity, 0.0], getDimension=3, getL1Norm=Infinity, getLInfNorm=Infinity, getMaxIndex=0, getMaxValue=Infinity, getMinIndex=1, getMinValue=-Infinity, getNorm=Infinity, getSparsity=...#249#903803555", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput267() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.linear.OpenMapRealVector", "org.apache.commons.math.linear.OpenMapRealVector", "append", new String[]{"org.apache.commons.math.linear.RealVector"}, new String[]{"<sample:10>"}, false, 3, new String[][]{{"org.apache.commons.math.linear.OpenMapRealVector", "getNorm", ""}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.math.linear.OpenMapRealVector", actual.getClass().getName());
  assertEquals("{getData=[-Infinity, -1.0], getDimension=2, getL1Norm=Infinity, getLInfNorm=Infinity, getMaxIndex=1, getMaxValue=-1.0, getMinIndex=0, getMinValue=-Infinity, getNorm=Infinity, getSparsity=1.0, isInfini...#221#-774438889", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getData=[-Infinity, -1.0], getDimension=2, getL1Norm=Infinity, getLInfNorm=Infinity, getMaxIndex=1, getMaxValue=-1.0, getMinIndex=0, getMinValue=-Infinity, getNorm=Infinity, getSparsity=1.0, isInfini...#221#-774438889", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput268() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math.linear.OpenMapRealVector", "org.apache.commons.math.linear.OpenMapRealVector", "cosine", new String[]{"double[]"}, new String[]{"<sample:5>"}, false, 0, new String[][]{{"org.apache.commons.math.linear.OpenMapRealVector", "ebeDivide", "org.apache.commons.math.linear.RealVector", "<sample:9>"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("org.apache.commons.math.exception.MathArithmeticException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput269() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.linear.OpenMapRealVector", "org.apache.commons.math.linear.OpenMapRealVector", "getMaxValue", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.math.linear.OpenMapRealVector", "dotProduct", "double[]", "<sample:3>"}, {"org.apache.commons.math.linear.OpenMapRealVector", "equals", "java.lang.Object", "<b:true>"}});
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("NaN", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getData=[], getDimension=0, getL1Norm=0.0, getLInfNorm=0.0, getMaxIndex=-1, getMaxValue=NaN, getMinIndex=-1, getMinValue=NaN, getNorm=0.0, getSparsity=NaN, isInfinite=false, isNaN=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput270() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math.linear.OpenMapRealVector", "org.apache.commons.math.linear.OpenMapRealVector", "append", new String[]{"double"}, new String[]{"1.0E-12"}, false, 5, new String[][]{{"org.apache.commons.math.linear.OpenMapRealVector", "checkIndex", "int", "-2147483648"}}), new String[][]{{"dotProduct", "double[]", "2"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("org.apache.commons.math.exception.DimensionMismatchException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput271() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.linear.OpenMapRealVector", "org.apache.commons.math.linear.OpenMapRealVector", "equals", new String[]{"java.lang.Object"}, new String[]{"<d:1.5>"}, false, 7, new String[][]{{"org.apache.commons.math.linear.OpenMapRealVector", "subtract", "org.apache.commons.math.linear.RealVector", "<sample:9>"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getData=[Infinity, -Infinity, 0.0], getDimension=3, getL1Norm=Infinity, getLInfNorm=Infinity, getMaxIndex=0, getMaxValue=Infinity, getMinIndex=1, getMinValue=-Infinity, getNorm=Infinity, getSparsity=...#249#903803555", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput272() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.linear.OpenMapRealVector", "org.apache.commons.math.linear.OpenMapRealVector", "combineToSelf", new String[]{"double", "double", "double[]"}, new String[]{"-1.7976931348623157E308", "0.0", "<empty>"}, false, 0, new String[][]{{"org.apache.commons.math.linear.OpenMapRealVector", "getL1Distance", "org.apache.commons.math.linear.OpenMapRealVector", "<sample:2>"}, {"org.apache.commons.math.linear.OpenMapRealVector", "unitize", ""}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.math.linear.OpenMapRealVector", actual.getClass().getName());
  assertEquals("{getData=[], getDimension=0, getL1Norm=0.0, getLInfNorm=0.0, getMaxIndex=-1, getMaxValue=NaN, getMinIndex=-1, getMinValue=NaN, getNorm=0.0, getSparsity=NaN, isInfinite=false, isNaN=false}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getData=[], getDimension=0, getL1Norm=0.0, getLInfNorm=0.0, getMaxIndex=-1, getMaxValue=NaN, getMinIndex=-1, getMinValue=NaN, getNorm=0.0, getSparsity=NaN, isInfinite=false, isNaN=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput273() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math.linear.OpenMapRealVector", "org.apache.commons.math.linear.OpenMapRealVector", "combineToSelf", new String[]{"double", "double", "double[]"}, new String[]{"-2.0000000000000008E-12", "5.000000000000001E-13", "<sample:8>"}, false, 5, new String[][]{{"org.apache.commons.math.linear.OpenMapRealVector", "subtract", "double[]", "<sample:11>"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("org.apache.commons.math.exception.DimensionMismatchException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput274() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.linear.OpenMapRealVector", "org.apache.commons.math.linear.OpenMapRealVector", "hashCode", new String[]{}, new String[]{}, false, 2, new String[][]{});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("-818727110", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getData=[0.0], getDimension=1, getL1Norm=0.0, getLInfNorm=0.0, getMaxIndex=0, getMaxValue=0.0, getMinIndex=0, getMinValue=0.0, getNorm=0.0, getSparsity=0.0, isInfinite=false, isNaN=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput275() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.linear.OpenMapRealVector", "org.apache.commons.math.linear.OpenMapRealVector", "isNaN", new String[]{}, new String[]{}, false, 4, new String[][]{});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getData=[-1.0, -1.0, -1.0], getDimension=3, getL1Norm=3.0, getLInfNorm=1.0, getMaxIndex=2, getMaxValue=-1.0, getMinIndex=2, getMinValue=-1.0, getNorm=1.7320508075688772, getSparsity=1.0, isInfinite=f...#218#-325937176", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput276() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math.linear.OpenMapRealVector", "org.apache.commons.math.linear.OpenMapRealVector", "ebeDivide", new String[]{"org.apache.commons.math.linear.RealVector"}, new String[]{"<sample:6>"}, false), new String[][]{{"cosine", "org.apache.commons.math.linear.RealVector", "3"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("org.apache.commons.math.exception.MathArithmeticException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput277() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.linear.OpenMapRealVector", "org.apache.commons.math.linear.OpenMapRealVector", "set", new String[]{"double"}, new String[]{"-0.5"}, false, 4, new String[][]{{"org.apache.commons.math.linear.OpenMapRealVector", "sparseIterator", ""}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getData=[-0.5, -0.5, -0.5], getDimension=3, getL1Norm=1.5, getLInfNorm=0.5, getMaxIndex=2, getMaxValue=-0.5, getMinIndex=2, getMinValue=-0.5, getNorm=0.8660254037844386, getSparsity=1.0, isInfinite=f...#218#714834085", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput278() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math.linear.OpenMapRealVector", "org.apache.commons.math.linear.OpenMapRealVector", "combine", new String[]{"double", "double", "org.apache.commons.math.linear.RealVector"}, new String[]{"-1.0", "1.0000000000000002E-12", "<null>"}, false, 6, new String[][]{}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput279() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math.linear.OpenMapRealVector", "org.apache.commons.math.linear.OpenMapRealVector", "iterator", new String[]{}, new String[]{}, false, 4, new String[][]{}), new String[][]{{"hasNext", "", "4"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getData=[-1.0, -1.0, -1.0], getDimension=3, getL1Norm=3.0, getLInfNorm=1.0, getMaxIndex=2, getMaxValue=-1.0, getMinIndex=2, getMinValue=-1.0, getNorm=1.7320508075688772, getSparsity=1.0, isInfinite=f...#218#-325937176", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput280() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math.linear.OpenMapRealVector", "org.apache.commons.math.linear.OpenMapRealVector", "sparseIterator", new String[]{}, new String[]{}, false, 4, new String[][]{{"org.apache.commons.math.linear.OpenMapRealVector", "cosine", "org.apache.commons.math.linear.RealVector", "<sample:7>"}}), new String[][]{{"hasNext", "", "2"}, {"remove", "", "5"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.UnsupportedOperationException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput281() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.linear.OpenMapRealVector", "org.apache.commons.math.linear.OpenMapRealVector", "toArray", new String[]{}, new String[]{}, false, 5, new String[][]{{"org.apache.commons.math.linear.OpenMapRealVector", "getMaxValue", ""}});
  assertNotNull(actual);
  assertEquals("[D", actual.getClass().getName());
  assertEquals("[]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getData=[], getDimension=0, getL1Norm=0.0, getLInfNorm=0.0, getMaxIndex=-1, getMaxValue=NaN, getMinIndex=-1, getMinValue=NaN, getNorm=0.0, getSparsity=NaN, isInfinite=false, isNaN=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput282() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math.linear.OpenMapRealVector", "org.apache.commons.math.linear.OpenMapRealVector", "unitVector", new String[]{}, new String[]{}, false, 2, new String[][]{}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("org.apache.commons.math.exception.MathArithmeticException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput283() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.linear.OpenMapRealVector", "org.apache.commons.math.linear.OpenMapRealVector", "getMinValue", new String[]{}, new String[]{}, false, 7, new String[][]{{"org.apache.commons.math.linear.OpenMapRealVector", "equals", "java.lang.Object", "<s:kery>"}, {"org.apache.commons.math.linear.OpenMapRealVector", "dotProduct", "org.apache.commons.math.linear.RealVector", "<sample:5>"}});
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("-Infinity", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getData=[Infinity, -Infinity, 0.0], getDimension=3, getL1Norm=Infinity, getLInfNorm=Infinity, getMaxIndex=0, getMaxValue=Infinity, getMinIndex=1, getMinValue=-Infinity, getNorm=Infinity, getSparsity=...#249#903803555", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput284() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.linear.OpenMapRealVector", "org.apache.commons.math.linear.OpenMapRealVector", "append", new String[]{"double"}, new String[]{"1.797693134862316E307"}, false, 6, new String[][]{{"org.apache.commons.math.linear.OpenMapRealVector", "projection", "double[]", "<sample:8>"}, {"org.apache.commons.math.linear.OpenMapRealVector", "setEntry", "int,double", "-4", "8.988465674311579E307"}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.math.linear.OpenMapRealVector", actual.getClass().getName());
  assertEquals("{getData=[Infinity, -Infinity, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0], getDimension=9, getL1Norm=Infinity, getLInfNorm=Infinity, getMaxIndex=0, getMaxValue=Infinity, getMinIndex=1, getMinValue=-Infinity, ...#279#1624284137", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getData=[Infinity, -Infinity, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0], getDimension=8, getL1Norm=Infinity, getLInfNorm=Infinity, getMaxIndex=0, getMaxValue=Infinity, getMinIndex=1, getMinValue=-Infinity, getNo...#260#-518583913", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput285() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math.linear.OpenMapRealVector", "org.apache.commons.math.linear.OpenMapRealVector", "cosine", new String[]{"double[]"}, new String[]{"<null>"}, false); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("org.apache.commons.math.exception.NullArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput286() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.linear.OpenMapRealVector", "org.apache.commons.math.linear.OpenMapRealVector", "getDimension", new String[]{}, new String[]{}, false, 4, new String[][]{{"org.apache.commons.math.linear.OpenMapRealVector", "unitize", ""}, {"org.apache.commons.math.linear.OpenMapRealVector", "sparseIterator", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("3", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getData=[-0.5773502691896258, -0.5773502691896258, -0.57735026918962.., getDimension=3, getL1Norm=1.7320508075688776, getLInfNorm=0.5773502691896258, getMaxIndex=2, getMaxValue=-0.5773502691896258, g...#307#785339052", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput287() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.linear.OpenMapRealVector", "org.apache.commons.math.linear.OpenMapRealVector", "combine", new String[]{"double", "double", "org.apache.commons.math.linear.RealVector"}, new String[]{"0.5", "-0.619999999996", "<sample:6>"}, false);
  assertNotNull(actual);
  assertEquals("org.apache.commons.math.linear.OpenMapRealVector", actual.getClass().getName());
  assertEquals("{getData=[], getDimension=0, getL1Norm=0.0, getLInfNorm=0.0, getMaxIndex=-1, getMaxValue=NaN, getMinIndex=-1, getMinValue=NaN, getNorm=0.0, getSparsity=NaN, isInfinite=false, isNaN=false}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getData=[], getDimension=0, getL1Norm=0.0, getLInfNorm=0.0, getMaxIndex=-1, getMaxValue=NaN, getMinIndex=-1, getMinValue=NaN, getNorm=0.0, getSparsity=NaN, isInfinite=false, isNaN=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput288() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math.linear.OpenMapRealVector", "org.apache.commons.math.linear.OpenMapRealVector", "append", new String[]{"org.apache.commons.math.linear.RealVector"}, new String[]{"<sample:7>"}, false, 0, new String[][]{{"org.apache.commons.math.linear.OpenMapRealVector", "isDefaultValue", "double", "4.3861113477903534E18"}}), new String[][]{{"getMaxValue", "", "6"}});
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("Infinity", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getData=[], getDimension=0, getL1Norm=0.0, getLInfNorm=0.0, getMaxIndex=-1, getMaxValue=NaN, getMinIndex=-1, getMinValue=NaN, getNorm=0.0, getSparsity=NaN, isInfinite=false, isNaN=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput289() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.linear.OpenMapRealVector", "org.apache.commons.math.linear.OpenMapRealVector", "getData", new String[]{}, new String[]{}, false, 1, new String[][]{{"org.apache.commons.math.linear.OpenMapRealVector", "getMinIndex", ""}, {"org.apache.commons.math.linear.OpenMapRealVector", "getDimension", ""}});
  assertNotNull(actual);
  assertEquals("[D", actual.getClass().getName());
  assertEquals("[1.0, Infinity, -Infinity]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getData=[1.0, Infinity, -Infinity], getDimension=3, getL1Norm=Infinity, getLInfNorm=Infinity, getMaxIndex=1, getMaxValue=Infinity, getMinIndex=2, getMinValue=-Infinity, getNorm=Infinity, getSparsity=...#234#-614213921", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput290() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.linear.OpenMapRealVector", "org.apache.commons.math.linear.OpenMapRealVector", "hashCode", new String[]{}, new String[]{}, false, 4, new String[][]{{"org.apache.commons.math.linear.OpenMapRealVector", "getDimension", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("-1694978236", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getData=[-1.0, -1.0, -1.0], getDimension=3, getL1Norm=3.0, getLInfNorm=1.0, getMaxIndex=2, getMaxValue=-1.0, getMinIndex=2, getMinValue=-1.0, getNorm=1.7320508075688772, getSparsity=1.0, isInfinite=f...#218#-325937176", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput291() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.linear.OpenMapRealVector", "org.apache.commons.math.linear.OpenMapRealVector", "copy", new String[]{}, new String[]{}, false, 4, new String[][]{{"org.apache.commons.math.linear.OpenMapRealVector", "append", "double", "9.999999999999998"}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.math.linear.OpenMapRealVector", actual.getClass().getName());
  assertEquals("{getData=[-1.0, -1.0, -1.0], getDimension=3, getL1Norm=3.0, getLInfNorm=1.0, getMaxIndex=2, getMaxValue=-1.0, getMinIndex=2, getMinValue=-1.0, getNorm=1.7320508075688772, getSparsity=1.0, isInfinite=f...#218#-325937176", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getData=[-1.0, -1.0, -1.0], getDimension=3, getL1Norm=3.0, getLInfNorm=1.0, getMaxIndex=2, getMaxValue=-1.0, getMinIndex=2, getMinValue=-1.0, getNorm=1.7320508075688772, getSparsity=1.0, isInfinite=f...#218#-325937176", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput292() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math.linear.OpenMapRealVector", "org.apache.commons.math.linear.OpenMapRealVector", "mapToSelf", new String[]{"org.apache.commons.math.analysis.UnivariateRealFunction"}, new String[]{"<sample:6>"}, false, 4, new String[][]{{"org.apache.commons.math.linear.OpenMapRealVector", "getData", ""}}), new String[][]{{"setEntry", "int,double", "0"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("org.apache.commons.math.exception.OutOfRangeException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput293() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math.linear.OpenMapRealVector", "org.apache.commons.math.linear.OpenMapRealVector", "getLInfDistance", new String[]{"double[]"}, new String[]{"<sample:6>"}, false, 6, new String[][]{}, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("org.apache.commons.math.exception.DimensionMismatchException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput294() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.linear.OpenMapRealVector", "org.apache.commons.math.linear.OpenMapRealVector", "append", new String[]{"org.apache.commons.math.linear.RealVector"}, new String[]{"<sample:0>"}, false, 2, new String[][]{});
  assertNotNull(actual);
  assertEquals("org.apache.commons.math.linear.OpenMapRealVector", actual.getClass().getName());
  assertEquals("{getData=[0.0], getDimension=1, getL1Norm=0.0, getLInfNorm=0.0, getMaxIndex=0, getMaxValue=0.0, getMinIndex=0, getMinValue=0.0, getNorm=0.0, getSparsity=0.0, isInfinite=false, isNaN=false}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getData=[0.0], getDimension=1, getL1Norm=0.0, getLInfNorm=0.0, getMaxIndex=0, getMaxValue=0.0, getMinIndex=0, getMinValue=0.0, getNorm=0.0, getSparsity=0.0, isInfinite=false, isNaN=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput295() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math.linear.OpenMapRealVector", "org.apache.commons.math.linear.OpenMapRealVector", "add", new String[]{"org.apache.commons.math.linear.OpenMapRealVector"}, new String[]{"<sample:7>"}, false, 1, new String[][]{{"org.apache.commons.math.linear.OpenMapRealVector", "combineToSelf", "double,double,org.apache.commons.math.linear.RealVector", "-15.000000000002", "4.3861113477903539E18", "<sample:9>"}, {"org.apache.commons.math.linear.OpenMapRealVector", "getL1Distance", "org.apache.commons.math.linear.RealVector", "<sample:2>"}}, 1), new String[][]{{"combineToSelf", "double,double,org.apache.commons.math.linear.RealVector", "2"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("org.apache.commons.math.exception.DimensionMismatchException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput296() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.linear.OpenMapRealVector", "org.apache.commons.math.linear.OpenMapRealVector", "set", new String[]{"double"}, new String[]{"Infinity"}, false, 6, new String[][]{});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getData=[Infinity, Infinity, Infinity, Infinity, Infinity, Infinity,.., getDimension=8, getL1Norm=Infinity, getLInfNorm=Infinity, getMaxIndex=7, getMaxValue=Infinity, getMinIndex=7, getMinValue=Infin...#269#-609656191", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput297() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math.linear.OpenMapRealVector", "org.apache.commons.math.linear.OpenMapRealVector", "combine", new String[]{"double", "double", "double[]"}, new String[]{"Infinity", "-0.0", "<sample:13>"}, false, 5, new String[][]{}, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("org.apache.commons.math.exception.DimensionMismatchException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput298() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math.linear.OpenMapRealVector", "org.apache.commons.math.linear.OpenMapRealVector", "getDistance", new String[]{"org.apache.commons.math.linear.OpenMapRealVector"}, new String[]{"<sample:0>"}, false, 6, new String[][]{{"org.apache.commons.math.linear.OpenMapRealVector", "getDimension", ""}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("org.apache.commons.math.exception.OutOfRangeException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput299() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math.linear.OpenMapRealVector", "org.apache.commons.math.linear.OpenMapRealVector", "subtract", new String[]{"org.apache.commons.math.linear.OpenMapRealVector"}, new String[]{"<sample:6>"}, false, 0, new String[][]{{"org.apache.commons.math.linear.OpenMapRealVector", "combine", "double,double,org.apache.commons.math.linear.RealVector", "1.0000000000000002E-12", "-0.0", "<null>"}}, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("org.apache.commons.math.exception.DimensionMismatchException", thrown.getClass().getName());
 }
}
